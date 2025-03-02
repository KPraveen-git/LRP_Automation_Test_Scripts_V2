package Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS011 extends Keywords{

	public void  Cost_Activity_Report_TS011(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS011";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String AgencyUser = data.get("AgencyUser");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		
		String CAR_Retrieve_Type1 = data.get("CAR_Retrieve_Type1");
		String CAR_Retrieve_Condition1 = data.get("CAR_Retrieve_Condition1");
		String CAR_Number_Retrieve_Value1 = data.get("CAR_Number_Retrieve_Value1");

		String CAR_Retrieve_Type2 = data.get("CAR_Retrieve_Type2");
		String CAR_Number_Retrieve_Value2 = data.get("CAR_Number_Retrieve_Value2");
		String CAR_Retrieve_Type3 = data.get("CAR_Retrieve_Type3");
		String CAR_Number_Retrieve_Value3 = data.get("CAR_Number_Retrieve_Value3");
		
		String CAR_Delete_popup = data.get("CAR_Delete_popup");
		String CAR_Delete_Success_popup = data.get("CAR_Delete_Success_popup");

		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		
		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
		
		Step_Start(2, "Enter the screen name as \"Cost Activity Report\" in module search field.", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as \"Cost Activity Report\" in module search field.", test, test1);
		
		Step_Start(3, "Click on the global search option which is available in the tool bar.", test, test1);
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		Step_End(3, "Click on the global search option which is available in the tool bar.", test, test1);
		
		Step_Start(4, "Check whether it opens a new search window.", test, test1);
		waitForElement(driver, type_Select1);
		Step_End(4, "Check whether it opens a new search window.", test, test1);
		
		Step_Start(5, "Enter the saved CAR No in the CAR No search field", test, test1);
		Step_Start(6, "Then click on the search button", test, test1);
		Step_Start(7, "System will show the CAR No", test, test1);
		Step_Start(8, "Click on the select button", test, test1);
		globalValueSearchWindow(driver,CAR_Retrieve_Condition1,CAR_Retrieve_Type1,CAR_Number_Retrieve_Value1,CAR_Retrieve_Type2,CAR_Number_Retrieve_Value2,CAR_Retrieve_Type3,CAR_Number_Retrieve_Value3);
		
		Step_End(8, "Click on the select button", test, test1);
		Step_End(7, "System will show the CAR No", test, test1);
		Step_End(6, "Then click on the search button", test, test1);
		Step_End(5, "Enter the saved CAR No in the CAR No search field", test, test1);
		
		Step_Start(9, "System will retrieve the CAR", test, test1);
		waitForElement(driver, CAR_Number_Input_CAR);
		Step_End(9, "System will retrieve the CAR", test, test1);
		
		Step_Start(10, "Click on the Tool bar delete option", test, test1);
		waitForElement(driver, CAR_Expense_Status);
		String status_app=getText(driver, CAR_Expense_Status);
		
		waitForElement(driver, Delete_button_toolBar);
		click(driver,Delete_button_toolBar);
		Step_End(10, "Click on the Tool bar delete option", test, test1);
		
		Step_Start(11, "Check whether the system populates the message as \" Do you want to delete Container Activity Report?\"", test, test1);
		waitForElement(driver, popup_Message);
		String Popup_Text_Act=getText(driver, popup_Message);
		
		if(Popup_Text_Act.equals(CAR_Delete_popup)) {
			System.out.println("Popup Matched  ||   Expected : "+CAR_Delete_popup+"   ||   Actual   : "+Popup_Text_Act);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+CAR_Delete_popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+CAR_Delete_popup+"   ||   Actual   : "+Popup_Text_Act);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+CAR_Delete_popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
		}
		
		Step_End(11, "Check whether the system populates the message as \" Do you want to delete Container Activity Report?\"", test, test1);
		
		Step_Start(12, "Then click on \"YES\"", test, test1);
		waitForElement(driver, popup_Message_Yes_Button);
		click(driver,popup_Message_Yes_Button);
		Step_End(12, "Then click on \"YES\"", test, test1);
		
		Step_Start(13, "Check whether the system deleted the MSC  CAR along with the information message \" Container Activity Report is deleted\"", test, test1);
		waitForElement(driver, popup_Message);
		String Popup_Success_Text_Act=getText(driver, popup_Message);
		
		if(!status_app.equalsIgnoreCase("Approved")) {
			if(Popup_Success_Text_Act.equals(CAR_Delete_Success_popup)) {
				System.out.println("Popup Matched  ||   Expected : "+CAR_Delete_Success_popup+"   ||   Actual   : "+Popup_Success_Text_Act);
				Extent_pass(driver, "Popup Matched  ||   Expected : "+CAR_Delete_Success_popup+"   ||   Actual   : "+Popup_Success_Text_Act, test, test1);
			}else {
				System.out.println("Popup Not Matched  ||   Expected : "+CAR_Delete_Success_popup+"   ||   Actual   : "+Popup_Success_Text_Act);
				Extent_fail(driver, "Popup Not Matched  ||   Expected : "+CAR_Delete_Success_popup+"   ||   Actual   : "+Popup_Success_Text_Act, test, test1);
			}
			
			waitForElement(driver, popup_Message_Ok_Button);
			click(driver,popup_Message_Ok_Button);
		}else {
			if(Popup_Success_Text_Act.equals(CAR_Delete_Success_popup)) {
				System.out.println("Approved CAR Should not be deleted, popup mismatched");
				Extent_fail(driver, "Approved CAR Should not be deleted, popup mismatched", test, test1);
			}else {
				System.out.println("Approved CAR not able to delete");
				Extent_pass(driver, "Approved CAR not able to delete", test, test1);
			}
			waitForElement(driver, popup_Message_Ok_Button);
			click(driver,popup_Message_Ok_Button);
		}
		
		Step_End(13, "Check whether the system deleted the MSC  CAR along with the information message \" Container Activity Report is deleted\"", test, test1);

		
		Extent_completed(tc_Name, test, test1);		
	}
}
