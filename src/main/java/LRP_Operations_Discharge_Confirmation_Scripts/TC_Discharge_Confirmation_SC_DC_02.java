package LRP_Operations_Discharge_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Discharge_Confirmation_SC_DC_02 extends Keywords {
	public void Discharge_Confirmation_SC_DC_02(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {

		String testcase_Name="TC_Discharge_Confirmation_SC_DC_02";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);


		String Username = Data.get("Username");
		String Password = Data.get("Password");
		String search_module = Data.get("Module_Search");
		String agencyUser = Data.get("agencyUser");
		String Servicecode = Data.get("Service_code");
		String vesselCode = Data.get("vesselCode");
		String Voyagenumber1 = Data.get("Voyagenumber1");
		String Boundinput = Data.get("Boundinput");
		String portCode = Data.get("portCode");
		String terminalCode = Data.get("terminalCode");
		String Container_num = Data.get("Container_num");
		String discharge_popup=Data.get("discharge_popup");
		String date_Picker = Data.get("date_Picker");
		String Activity_Date=Data.get("Activity_Date");



		Extent_Start(testcase_Name, test, test1);
		navigateUrl(driver, url);
		// Login
		LRP_Login(driver, Username, Password);

		
		//			Switch the Profile
		SwitchProfile(driver, agencyUser);


		// Module search

		moduleNavigate(driver, search_module);




		Step_Start(1,"select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

		selectservice_Discharge(driver, Servicecode, vesselCode, Voyagenumber1, Boundinput, portCode, terminalCode);

		waitForElement(driver, dischargeshow_Button);

		Step_End(1,"select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

		Step_Start(2,"click show button.", test, test1);

		waitForElement(driver, dischargeshow_Button);
		click(driver, dischargeshow_Button);

		Step_End(2,"click show button.", test, test1);
		if(date_Picker.equalsIgnoreCase("Yes")) {
			
			selectDatePickerWith_Time(driver, discharge_activity_date, Activity_Date);
			
			}
		Step_Start(3,"click container. No button", test, test1);

		waitForElement(driver, container_no_discharge);
		click(driver, container_no_discharge);

		Step_End(3,"click container. No button", test, test1);

		Step_Start(4,"paste the bulk Container numbers in container number grid.", test, test1);

		sendKeys(driver, container_no_discharge, Container_num);

		Step_End(4,"paste the bulk Container numbers in container number grid.", test, test1);

		Step_Start(5,"Give enter", test, test1);

		enter(driver);

		Step_End(5,"Give enter", test, test1);

		Step_Start(6,"Click match button.", test, test1);

		waitForElement(driver, match_button_Discharge);
		click(driver,match_button_Discharge);


		Step_End(6,"Click match button.", test, test1);

		Step_Start(7,"click discharge confirmation button.", test, test1);

		waitForElement(driver, dischargeconfirmation_btn);
		click(driver, dischargeconfirmation_btn);

		Step_End(7,"click discharge confirmation button.", test, test1);

		Step_Start(8,"system will display the message as 'discharge is confirmed'.", test, test1);
		waitForElement(driver, popup);
		String dischargeconfimationpopupmessage = getText(driver, popup);
		System.out.println(dischargeconfimationpopupmessage);

		if(discharge_popup.contains(dischargeconfimationpopupmessage)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + dischargeconfimationpopupmessage + " || Actual Report Activity is : " + discharge_popup);   
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + dischargeconfimationpopupmessage + " || Actual Report Activity is : " + discharge_popup, test, test1);
		}                                                                                                                                                                        
		else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + dischargeconfimationpopupmessage + " || Actual Report Activity is : " + discharge_popup);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + dischargeconfimationpopupmessage + " || Actual Report Activity is : " + discharge_popup, test,test1); 
		} 
		Step_End(8,"system will display the message as 'discharge is confirmed'.", test, test1);

		Extent_completed(testcase_Name, test, test1);
	}

}
