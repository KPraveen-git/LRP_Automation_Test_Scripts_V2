package LRP_Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS004 extends Keywords {

	public void Cost_Activity_Report_TS004(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS004";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String AgencyUser = data.get("AgencyUser");
		String Approved_status = data.get("Approved_status");
		String Delete_popup_message = data.get("Delete_popup_message");
		String CAR_Retrieve_Type1 = data.get("CAR_Retrieve_Type1");
		String CAR_Retrieve_Condition1 = data.get("CAR_Retrieve_Condition1");
		String CAR_Number_Retrieve_Value1 = data.get("CAR_Number_Retrieve_Value1");

		String CAR_Retrieve_Type2 = data.get("CAR_Retrieve_Type2");
		String CAR_Number_Retrieve_Value2 = data.get("CAR_Number_Retrieve_Value2");
		String CAR_Retrieve_Type3 = data.get("CAR_Retrieve_Type3");
		String CAR_Number_Retrieve_Value3 = data.get("CAR_Number_Retrieve_Value3");
		String Delete_popup = data.get("Delete_popup");
		
		
		
		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select the required agency.",
				test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.",
				test, test1);

		Step_Start(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);

		Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);

		waitForElement(driver, Global_Search);
		click(driver, Global_Search);

		Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);

		Step_Start(4, ".Check whether the system opens the search window", test, test1);
		
		waitForElement(driver, globalSearch_Frame_SearchButton);
		if(isdisplayed(driver, globalSearch_Frame_SearchButton)) {
			System.out.println("System opens the search window Successfully");
			Extent_pass(driver, "Matched || System opens the search window Successfully " , test, test1);
			
		}else {
			System.out.println("System not opens the search window ");
			Extent_fail(driver, " Not Matched || System not opens the search window  " , test, test1);
		}
		
		

		Step_End(4, ".Check whether the system opens the search window", test, test1);

		Step_Start(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
		Step_Start(6, "Then click on the search button", test, test1);
		Step_Start(7, "System will show the CAR No. and Click on the select button", test, test1);
		Step_Start(8, "Click on the select button.", test, test1);

		globalValueSearchWindow(driver, CAR_Retrieve_Condition1, CAR_Retrieve_Type1, CAR_Number_Retrieve_Value1,
				CAR_Retrieve_Type2, CAR_Number_Retrieve_Value2, CAR_Retrieve_Type3, CAR_Number_Retrieve_Value3);

		Step_End(8, "Click on the select button.", test, test1);
		Step_End(7, "System will show the CAR No. and Click on the select button", test, test1);
		Step_End(6, "Then click on the search button", test, test1);
		Step_End(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);

		Step_Start(9, "System will retrieve the CAR", test, test1);

		waitForElement(driver, car_Number_val);
		String Carvalue = getAttribute(driver, car_Number_val, "value");

		System.out.println("Carvalue :" + Carvalue);

		if (CAR_Number_Retrieve_Value1.equals(Carvalue)) {
			System.out.println("Matched exp value :" + CAR_Number_Retrieve_Value1 + "actual value :" + Carvalue);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + CAR_Number_Retrieve_Value1
					+ " || Actual Report Activity is : " + Carvalue, test, test1);
		} else {
			System.out.println("Not matched exp value :" + CAR_Number_Retrieve_Value1 + "actual value :" + Carvalue);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + CAR_Number_Retrieve_Value1
					+ " || Actual Report Activity is : " + Carvalue, test, test1);
		}

		Step_End(9, "System will retrieve the CAR", test, test1);

		Step_Start(10, "Click on the Expense Report button", test, test1);

		waitForElement(driver, Expensive_Report_Btn_CAR);
		click(driver, Expensive_Report_Btn_CAR);
		
		waitForElement(driver, Approved_Expensive);
		click(driver, Approved_Expensive);
		
		
		
      boolean Approved=false;
	
		if(isdisplayed(driver, Approved_Expensive_all_values)) {
			Approved=true;
			System.out.println("it is approved : "+Approved);
			Extent_pass(driver, "After click on Expense Report button , Approval status is display Successfully", test, test1);
		}else {
			
			Approved=false;
		}
		
		waitForElement(driver,Expense_Close);
		click(driver, Expense_Close);
		
		
		Step_End(10, "Click on the Expense Report button", test, test1);
		
		Step_Start(11, "Check whether the activities are in approved status", test, test1);

		waitForElement(driver, CAR_Expense_Status);
		String Status_values = getText(driver, CAR_Expense_Status);
		System.out.println("Status_values :" + Status_values);
		
		if(Approved_status.equals(Status_values)) {
			System.out.println("Popup Matched  ||   Expected : "+Approved_status+"   ||   Actual   : "+Status_values);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+Approved_status+"   ||   Actual   : "+Status_values, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+Approved_status+"   ||   Actual   : "+Status_values);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Approved_status+"   ||   Actual   : "+Status_values, test, test1);
		}
		
		
		
		Step_End(11, "Check whether the activities are in approved status", test, test1);
		

		Step_Start(12, "Then Click on the tool bar delete option", test, test1);
		
	
		waitForElement(driver, Delete);
		click(driver, Delete);
		
		Step_End(12, "Then Click on the tool bar delete option", test, test1);
		
		Step_Start(13, "Check whether the system populates the validation message as Do you want to delete Container Activity Report?", test, test1);
		
		
		waitForElement(driver, popup_Message);
		String Popup_Text_Act_val=getText(driver, popup_Message);
		
		if(Popup_Text_Act_val.equals(Delete_popup)) {
			System.out.println("Popup Matched  ||   Expected : "+Delete_popup+"   ||   Actual   : "+Popup_Text_Act_val);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+Delete_popup+"   ||   Actual   : "+Popup_Text_Act_val, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+Delete_popup+"   ||   Actual   : "+Popup_Text_Act_val);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Delete_popup+"   ||   Actual   : "+Popup_Text_Act_val, test, test1);
		}
		
		Step_End(13, "Check whether the system populates the validation message as Do you want to delete Container Activity Report?", test, test1);	
		
		Step_Start(14, "Click on Yes", test, test1);
		
		waitForElement(driver, popup_Message_Yes_Button);
		click(driver, popup_Message_Yes_Button);
		
		Step_End(14, "Click on Yes", test, test1);
		
		Step_Start(15, "Check whether the system shows the validation message like  Expense is approved for some activities. CAR cannot be deleted", test, test1);
		
		waitForElement(driver, popup_Message);
		String Popup_Delete_Act_val=getText(driver, popup_Message);
		
		if(Popup_Delete_Act_val.equals(Delete_popup_message)) {
			System.out.println("Popup Matched  ||   Expected : "+Delete_popup_message+"   ||   Actual   : "+Popup_Delete_Act_val);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+Delete_popup_message+"   ||   Actual   : "+Popup_Delete_Act_val, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+Delete_popup_message+"   ||   Actual   : "+Popup_Delete_Act_val);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Delete_popup_message+"   ||   Actual   : "+Popup_Delete_Act_val, test, test1);
		}
		

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);
		
		Step_End(15, "Check whether the system shows the validation message like  Expense is approved for some activities. CAR cannot be deleted", test, test1);	
		
		
		Extent_completed(tc_Name, test, test1);		
		
		
		
	}
}