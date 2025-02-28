package LRP_Operatiins_Discharge_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.LoadConfirmation_Locators;

public class TC_Discharge_Confirmation_SC_DC_07 extends Keywords {

	public void Discharge_Confirmation_SC_DC_07(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testcase_Name="TC_Discharge_Confirmation_SC_DC_07";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);



		String Username = Data.get("Username");
		String Password = Data.get("Password");
		String AgencyUser = Data.get("AgencyUser");	
		String first_service_data1 = Data.get("first_service_data1");
		String Vessels = Data.get("Vessels");
		String Voyagenumber1 = Data.get("Voyagenumber1");
		String Boundinput = Data.get("Boundinput");
		String portCode = Data.get("portCode");
		String terminalCode = Data.get("terminalCode");
		String DischargeConfirmationModule = Data.get("DischargeConfirmationModule");
		String Confirmation_msg1=Data.get("Confirmation_msg1");
		String Containerized_Button=Data.get("Containerized_Button");
		String VINChassis_No_Book_No= Data.get("VINChassis_No_Book_No");
		String vinChassis_BookNo_select= Data.get("vinChassis_BookNo_select");
		String Plugin_Configuration= Data.get("Plugin_Configuration");
		String Module_id=Data.get("Module_id");
		String Plugin_ID=Data.get("Plugin_ID");
		String Status_exp=Data.get("Status_exp");
		String date_Picker = Data.get("date_Picker");
		String Activity_Date=Data.get("Activity_Date");







		Extent_Start(testcase_Name, test, test1);


		navigateUrl(driver, url);
		LRP_Login(driver, Username, Password);

		SwitchProfile(driver, AgencyUser);


	
		
		// Plugin configiration

		moduleNavigate(driver, Plugin_Configuration);
				waitForElement(driver, Plugin_module_id);
				sendKeys(driver, Plugin_module_id, Module_id);
				waitForElement(driver, Plugin_id);
				sendKeys(driver, Plugin_id, Plugin_ID);
				waitForElement(driver, plugin_row_Click);
				doubleClick(driver, plugin_row_Click);


				waitForElement(driver, enable_status);
				String staus = getText(driver, enable_status);
				System.out.println(staus);

		//		Load Confirmation module
				moduleNavigate(driver, DischargeConfirmationModule);

		if(staus.equals(Status_exp)) {

			String Container_click=String.format(LoadConfirmation_Locators.Container_Select, Containerized_Button);
			click(driver, Container_click);

		}

		//	Select service

		Step_Start(1, "select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

		waitForElement(driver, service_Searchfield1);
		sendKeys(driver, service_Searchfield1, first_service_data1);


		waitForElement(driver, vessel_Input1);
		sendKeys(driver, vessel_Input1,Vessels);
		sendKeys(driver, VoyageInput1, Voyagenumber1);
		sendKeys(driver, Boundinpiut1, Boundinput);
		sendKeys(driver, DischargePort_Inputfield, portCode);
		sendKeys(driver, DischargeTerminalPort_Inputfield, terminalCode);
		doubleClick(driver, select_Service);	


		Step_End(1, "select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);



		Step_Start(2, "click show button", test, test1);
		waitForElement(driver, Discharge_Show_Button);
		click(driver, Discharge_Show_Button);

		Step_End(2, "click show button", test, test1);
	if(date_Picker.equalsIgnoreCase("Yes")) {
			
		selectDatePickerWith_Time(driver, discharge_activity_date, Activity_Date);
			
			}
		Step_Start(3, "click VIN/chassis or book number", test, test1);

		String BookNo_select = String.format(LoadConfirmation_Locators.VinChassis_BookNo_Select, vinChassis_BookNo_select);
		waitForElement(driver, BookNo_select);
		click(driver, BookNo_select);

		Step_End(3, "click VIN/chassis or book number", test, test1);


		Step_Start(4, "paste the bulk VIN/chassis numbers in VIN/chassis no grid.", test, test1);

		waitForElement(driver, Discharge_VIN_Chassis_No);
		sendKeys(driver,Discharge_VIN_Chassis_No ,VINChassis_No_Book_No);

		Step_End(4, "paste the bulk VIN/chassis numbers in VIN/chassis no grid.", test, test1);


		Step_Start(5, "Give Enter", test, test1);

		enter(driver);

		Step_End(5, "Give Enter", test, test1);


		Step_Start(6, "Click match button.", test, test1);

		waitForElement(driver,Match1);
		click(driver, Match1);

		Step_End(6, "Click match button.", test, test1);


		Step_Start(7, "click Discharge confirmation button.", test, test1);

		waitForElement(driver,Discharge_Confirmation);
		safeclick(driver, Discharge_Confirmation);


		Step_End(7, "click Discharge confirmation button.", test, test1);



		Step_Start(8, "system will display the message as \"discharge is confirmed\".", test, test1);


		waitForElement(driver, popup);
		String SaveRate_PopUp2= getText(driver, popup);




		if(isDisplayed(driver, popup)){
			if(Confirmation_msg1.equals(SaveRate_PopUp2)) {
				System.out.println("Matched || Expected value was : "+Confirmation_msg1+" || Actual value was : "+SaveRate_PopUp2);
				Extent_pass(driver, "Matched || Expected value was : "+Confirmation_msg1+" || Actual value was : "+SaveRate_PopUp2, test, test1);
			}
			else {
				System.out.println("NotMatched || Expected value was : "+Confirmation_msg1+" || Actual value was : "+SaveRate_PopUp2);
				Extent_fail(driver,  "NotMatched || Expected value was : "+Confirmation_msg1+" || Actual value was : "+SaveRate_PopUp2, test, test1);
			}


			Step_End(8, "system will display the message as \"discharge is confirmed\".", test, test1);

			Extent_completed(testcase_Name, test, test1);



		}	


	}
}


