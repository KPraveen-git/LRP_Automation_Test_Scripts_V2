package LRP_Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS039 extends Keywords{
	
	
	public void  Cost_Activity_Report_TS039(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS039";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);
		
		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String AgencyUser = data.get("AgencyUser");
		
		String CAR_Retrieve_Type = data.get("CAR_Retrieve_Type");
		String CAR_Retrieve_Condition = data.get("CAR_Retrieve_Condition");
		String CAR_Number_Retrieve = data.get("CAR_Number_Retrieve");
		
		String Car_Closed_Popup_Text = data.get("Car_Closed_Popup_Text");
		String Car_Closed_Label_text = data.get("Car_Closed_Label_text");
		
		
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
		
		Step_Start(3, ".Click on the global search option which is available in the tool bar.", test, test1);
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		Step_End(3, ".Click on the global search option which is available in the tool bar.", test, test1);
		
		Step_Start(4, "Check whether it opens a new search window", test, test1);
		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, CAR_Retrieve_Type);
		Step_End(4, "Check whether it opens a new search window", test, test1);
		
		Step_Start(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
		waitForElement(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, CAR_Retrieve_Condition);
		waitForElement(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, CAR_Number_Retrieve);
		Step_End(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
		
		Step_Start(6, "Then click on the search button.", test, test1);
		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);
		Step_End(6, "Then click on the search button.", test, test1);
		
		Step_Start(7, "System will show the CAR No. and Click on the select button.", test, test1);
		waitForElement(driver, First_Row_select);
		click(driver, First_Row_select);
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		Step_End(7, "System will show the CAR No. and Click on the select button.", test, test1);
		
		Step_Start(8, "System will retrieve the CAR. ", test, test1);
		waitForElement(driver, CAR_Close_Button);
		Step_End(8, "System will retrieve the CAR. ", test, test1);
		
		Step_Start(9, "Click on the CAR close option ", test, test1);
		click(driver,CAR_Close_Button);
		Step_End(9, "Click on the CAR close option ", test, test1);
		
		Step_Start(10, "Ensure that system validates as \"CAR closed successfully\"", test, test1);
		waitForElement(driver, popup_Message);
		String PopupText_Act=getText(driver, popup_Message);
		
		if(PopupText_Act.equals(Car_Closed_Popup_Text)) {
			System.out.println("Popup Matched  ||   Expected : "+Car_Closed_Popup_Text+"   ||   Actual   : "+PopupText_Act);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+Car_Closed_Popup_Text+"   ||   Actual   : "+PopupText_Act, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+Car_Closed_Popup_Text+"   ||   Actual   : "+PopupText_Act);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Car_Closed_Popup_Text+"   ||   Actual   : "+PopupText_Act, test, test1);
		}
		Step_End(10, "Ensure that system validates as \"CAR closed successfully\"", test, test1);
		
		Step_Start(11, "Click  on the ok option. ", test, test1);
		waitForElement(driver, popup_Message_Ok_Button);
		click(driver,popup_Message_Ok_Button);
		Step_End(11, "Click  on the ok option. ", test, test1);
		
		Step_Start(12, "Ensure that system shows as \"CAR closed\" near to the Agency field.", test, test1);
		waitForElement(driver, CAR_Open_Button);
		
		if(isDisplayed(driver, CAR_Closed_Label)) {
			String CarClosed_Text_Act=getText(driver, CAR_Closed_Label);
			if(CarClosed_Text_Act.equals(Car_Closed_Label_text)) {
				System.out.println("CAR Closed Label Matched ||   Expected : "+Car_Closed_Label_text+"  ||  Act  : "+CarClosed_Text_Act);
				Extent_pass(driver, "CAR Closed Label Matched ||   Expected : "+Car_Closed_Label_text+"  ||  Act  : "+CarClosed_Text_Act, test, test1);
			}else {
				System.out.println("CAR Closed Label Not Matched ||   Expected : "+Car_Closed_Label_text+"  ||  Act  : "+CarClosed_Text_Act);
				Extent_fail(driver, "CAR Closed Label Not Matched ||   Expected : "+Car_Closed_Label_text+"  ||  Act  : "+CarClosed_Text_Act, test, test1);
			}
		}else {
			Extent_fail(driver, "CAR Closed Label Not Displayed After Closed the CAR", test, test1);
		}
		Step_End(12, "Ensure that system shows as \"CAR closed\" near to the Agency field.", test, test1);
		
		Extent_completed(tc_Name, test, test1);
		
	}
	
}
