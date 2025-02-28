package LRP_Operatiins_Discharge_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Discharge_Confirmation_SC_DC_03 extends Keywords{


	public void Discharge_Confirmation_SC_DC_03(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) throws Exception {

		String testcase_Name="TC_Discharge_Confirmation_SC_DC_03";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);


		String Username =Data.get("Username");
		String Password =Data.get("Password");
		String AgencyUser =Data.get("AgencyUser");
		String DischargeConfirmationModule =Data.get("DischargeConfirmationModule");
		String first_service_data =Data.get("first_service_data");
		String vesselCode =Data.get("vesselCode");
		String Voyagenumber1 =Data.get("Voyagenumber1");
		String Boundinput =Data.get("Boundinput");
		String portCode =Data.get("portCode");
		String terminalCode =Data.get("terminalCode");
		String discharge_popup=Data.get("discharge_popup");
		String Book_Num = Data.get("Book_Num");
		String date_Picker = Data.get("date_Picker");
		String Activity_Date=Data.get("Activity_Date");


		Extent_Start(testcase_Name, test, test1);
		navigateUrl(driver, url);

		// Login

		LRP_Login(driver, Username, Password);

		// Switch the Profile

		SwitchProfile(driver, AgencyUser);
		// Load Confirmation module	

		moduleNavigate(driver, DischargeConfirmationModule);

		// Select service
		Step_Start(1, "select the service, vessel, voyage, bound, port code, and terminal using easy search", test, test1);
		waitForElement(driver, service_Searchfield_Discharge);
		sendKeys(driver, service_Searchfield_Discharge, first_service_data);

		sendKeys(driver, vessel_Input_Discharge,vesselCode );

		sendKeys(driver, VoyageInput_Discharge, Voyagenumber1);

		sendKeys(driver, Boundinpiut_Discharge, Boundinput);

		sendKeys(driver, portCode_Inputfield_Discharge, portCode);

		sendKeys(driver, terminalCode_Inputfield_Discharge, terminalCode);

		doubleClick(driver, select_Service_Discharge);
		Step_End(1, "select the service, vessel, voyage, bound, port code, and terminal using easy search", test, test1);
		Step_Start(2, "click show button", test, test1);

		waitForElement(driver, show_Button_Discharge);
		click(driver, show_Button_Discharge);

		Step_End(2, "click show button", test, test1);
	if(date_Picker.equalsIgnoreCase("Yes")) {
			
		selectDatePickerWith_Time(driver, discharge_activity_date, Activity_Date);
			
			}

		Step_Start(3, "click book. No button", test, test1);
		waitForElement(driver, Book_number_btn);
		click(driver, Book_number_btn);
		Step_End(3, "click book. No button", test, test1);


		Step_Start(4, "paste the book numbers in book number grid", test, test1);
		waitForElement(driver, container_no_Discharge);
		sendKeys(driver, container_no_Discharge, Book_Num);

		Step_End(4, "paste the book numbers in book number grid", test, test1);

		Step_Start(5, "Give enter", test, test1);
		enter(driver);

		Step_End(5, "Give enter", test, test1);

		Step_Start(6, "Click match button", test, test1);
		waitForElement(driver, match_button_Discharge);
		click(driver, match_button_Discharge);	

		Step_End(6, "Click match button", test, test1);
		Step_Start(7, "click discharge confirmation button", test, test1);
		waitForElement(driver, Dischargeconfirmation);
		click(driver, Dischargeconfirmation);	

		Step_End(7, "click discharge confirmation button", test, test1);

		Step_Start(8, "system will display the message as \"discharge is confirmed\"", test, test1);
		waitForElement(driver, popup);
		String SaveRate_PopUp2= getText(driver, popup);			       


		if(isDisplayed(driver, popup)){
			if(discharge_popup.equals(SaveRate_PopUp2)) {
				System.out.println("Matched || Expected value was : "+discharge_popup+" || Actual value was : "+SaveRate_PopUp2);
				Extent_pass(driver, "Matched || Expected value was : "+discharge_popup+" || Actual value was : "+SaveRate_PopUp2, test, test1);
			}
			else {
				System.out.println("NotMatched || Expected value was : "+discharge_popup+" || Actual value was : "+SaveRate_PopUp2);
				Extent_fail(driver,  "NotMatched || Expected value was : "+discharge_popup+" || Actual value was : "+SaveRate_PopUp2, test, test1);
			}
		}
		Step_End(8, "system will display the message as \"discharge is confirmed\"", test, test1);
		Extent_completed(testcase_Name, test, test1);
	}
}				