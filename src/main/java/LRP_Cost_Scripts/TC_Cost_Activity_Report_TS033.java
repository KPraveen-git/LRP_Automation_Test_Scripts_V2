package Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS033 extends Keywords{

	public void  Cost_Activity_Report_TS033(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS033";
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
		
		String Expensive_Headers_Names = data.get("Expensive_Headers_Names");

		String Open_Head_Value = data.get("Open_Head_Value");

		String Approved_Expensive_Validate = data.get("Approved_Expensive_Validate");
		String Approved_Head_Value = data.get("Approved_Head_Value");

		String UserName_Exp = data.get("UserName_Exp");
		String Open_Date_Expected = data.get("Open_Date_Expected");
		String Approved_Date_Expected = data.get("Approved_Date_Expected");

		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		
		LRP_Login(driver, username, password);
		verifyMainMenu(driver);
		
		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
	
		Step_Start(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);
		
		Step_Start(3, "Click on the global search option which is available in the tool bar.", test, test1);
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		Step_End(3, "Click on the global search option which is available in the tool bar.", test, test1);
		
		Step_Start(4, "Check whether it opens a new search window.", test, test1);
		Step_Start(5, "Enter the required CAR No. in the CAR No search field.", test, test1);
		Step_Start(6, "Then click on the search button", test, test1);
		Step_Start(7, "System will show the CAR No. and Click on the select button.   ", test, test1);
		
		globalValueSearchWindow(driver,CAR_Retrieve_Condition,CAR_Retrieve_Type,CAR_Number_Retrieve,"","","","");
		
		Step_End(7, "System will show the CAR No. and Click on the select button.   ", test, test1);
		Step_End(6, "Then click on the search button", test, test1);
		Step_End(5, "Enter the required CAR No. in the CAR No search field.", test, test1);
		Step_End(4, "Check whether it opens a new search window.", test, test1);
		
		Step_Start(8, "System will retrieve the CAR ", test, test1);
		waitForElement(driver, Expensive_Report_Btn_CAR);
		Step_End(8, "System will retrieve the CAR ", test, test1);
		
		Step_Start(9, "Click on the expense report option.   ", test, test1);
		click(driver,Expensive_Report_Btn_CAR);
		waitForElement(driver, Expensive_Table_CAR);
		Step_End(9, "Click on the expense report option.   ", test, test1);
		
		Step_Start(10, "Check whether the submitted/rejected/approved by username and date column is present.And ensure that this column is present in both open expense and approved expenses tab.  ", test, test1);
		waitForElement(driver, Expensive_Column_Filt_CAR);
		click(driver, Expensive_Column_Filt_CAR);
		waitForElement(driver, Expensive_Filter_input_CAR);
		jsClick(driver, SelectAll_Checkbox_Expensive_CAR);
		
		List<String> ExpensiveTable_Headers=splitAndExpand(Expensive_Headers_Names);
		for(String FilterHeader : ExpensiveTable_Headers) {
			waitForElement(driver, Expensive_Filter_input_CAR);
			clear(driver, Expensive_Filter_input_CAR);
			waitForElement(driver, Expensive_Filter_input_CAR);
			sendKeys(driver, Expensive_Filter_input_CAR,FilterHeader);
		
			String checkbox=String.format(Select_Column_Expensive_CAR,FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		
		jsClick(driver, Expensive_Column_Filt_CAR);
		waitForElement(driver, Expensive_Table_CAR);
		Step_End(10, "Check whether the submitted/rejected/approved by username and date column is present.And ensure that this column is present in both open expense and approved expenses tab.  ", test, test1);

		Step_Start(11, "Check whether the submitted/rejected/approved by username and date column is present.And ensure that this column is present in both open expense and approved expenses tab.  ", test, test1);
		List<Map<String, String>> Open_Expensive_TableData = extractTableDataByColumnWithoutScroll(driver, Expensive_Table_CAR);
		System.out.println("Open_Expensive_TableData : "+Open_Expensive_TableData);
		
		List<String> Open_Expensive_HeadList=splitAndExpand(Open_Head_Value);
		
		for(String open_Exp_Head:Open_Expensive_HeadList) {
			String Open_Exp_UserName_Value=getValueByFirstColumnAndHeader(Open_Expensive_TableData,"Head",open_Exp_Head,"User Name");
			String Open_Exp_Date_Value=getValueByFirstColumnAndHeader(Open_Expensive_TableData,"Head",open_Exp_Head,"Date");

			if(Open_Exp_UserName_Value.equals(UserName_Exp)) {
				System.out.println("User Name Matched for the Head : "+open_Exp_Head+" ||  Exp : "+UserName_Exp+"  ||  Act : "+Open_Exp_UserName_Value);
				Extent_pass(driver, "User Name Matched for the Head : "+open_Exp_Head+" ||  Exp : "+UserName_Exp+"  ||  Act : "+Open_Exp_UserName_Value, test, test1);
			}else {
				System.out.println("User Name Not Matched for the Head : "+open_Exp_Head+" ||  Exp : "+UserName_Exp+"  ||  Act : "+Open_Exp_UserName_Value);
				Extent_fail(driver, "User Name Not Matched for the Head : "+open_Exp_Head+" ||  Exp : "+UserName_Exp+"  ||  Act : "+Open_Exp_UserName_Value, test, test1);
			}
			
			if(Open_Exp_Date_Value.contains(Open_Date_Expected)) {
				System.out.println("Date Matched for the Head : "+open_Exp_Head+" ||  Exp : "+Open_Date_Expected+"  ||  Act : "+Open_Exp_Date_Value);
				Extent_pass(driver, "Date Matched for the Head : "+open_Exp_Head+" ||  Exp : "+Open_Date_Expected+"  ||  Act : "+Open_Exp_Date_Value, test, test1);
			}else {
				System.out.println("Date Not Matched for the Head : "+open_Exp_Head+" ||  Exp : "+Open_Date_Expected+"  ||  Act : "+Open_Exp_Date_Value);
				Extent_fail(driver, "Date Not Matched for the Head : "+open_Exp_Head+" ||  Exp : "+Open_Date_Expected+"  ||  Act : "+Open_Exp_Date_Value, test, test1);
			}
		}
		Step_End(11, "Check whether the submitted/rejected/approved by username and date column is present.And ensure that this column is present in both open expense and approved expenses tab.  ", test, test1);

		
		if(Approved_Expensive_Validate.equals("Yes")) {
			
			Step_Start(10, "Check whether the submitted/rejected/approved by username and date column is present.And ensure that this column is present in both open expense and approved expenses tab.  ", test, test1);
			waitForElement(driver, Approved_Expensive_CAR);
			click(driver,Approved_Expensive_CAR);
			
			waitForElement(driver, App_Expensive_Table_CAR);
			
			waitForElement(driver, App_Expensive_Column_Filt_CAR);
			click(driver, App_Expensive_Column_Filt_CAR);
			waitForElement(driver, App_Expensive_Filter_input_CAR);
			jsClick(driver, App_SelectAll_Checkbox_Expensive_CAR);
			
			List<String> AppExpensiveTable_Headers=splitAndExpand(Expensive_Headers_Names);
			for(String FilterHeader : AppExpensiveTable_Headers) {
				waitForElement(driver, App_Expensive_Filter_input_CAR);
				clear(driver, App_Expensive_Filter_input_CAR);
				waitForElement(driver, App_Expensive_Filter_input_CAR);
				sendKeys(driver, App_Expensive_Filter_input_CAR,FilterHeader);
			
				String checkbox=String.format(App_Select_Column_Expensive_CAR,FilterHeader);
				waitForDisplay(driver, checkbox);
				jsClick(driver, checkbox);
			}
			
			jsClick(driver, App_Expensive_Column_Filt_CAR);
			
			waitForElement(driver, App_Expensive_Table_CAR);
			Step_End(10, "Check whether the submitted/rejected/approved by username and date column is present.And ensure that this column is present in both open expense and approved expenses tab.  ", test, test1);
			
			Step_Start(11, "Check whether the submitted/rejected/approved by username and date column is present.And ensure that this column is present in both open expense and approved expenses tab.  ", test, test1);

			List<Map<String, String>> App_Expensive_TableData = extractTableDataByColumnWithoutScroll(driver, App_Expensive_Table_CAR);
			System.out.println("App_Expensive_TableData : "+App_Expensive_TableData);
			
			List<String> Approved_Expensive_HeadList=splitAndExpand(Approved_Head_Value);
			
			for(String App_Exp_Head:Approved_Expensive_HeadList) {
				
				String App_Exp_UserName_Value=getValueByFirstColumnAndHeader(App_Expensive_TableData,"Head",App_Exp_Head,"User Name");
				String App_Exp_Date_Value=getValueByFirstColumnAndHeader(App_Expensive_TableData,"Head",App_Exp_Head,"Date");

				if(App_Exp_UserName_Value.equals(UserName_Exp)) {
					System.out.println("User Name Matched for the Head : "+App_Exp_Head+" ||  Exp : "+UserName_Exp+"  ||  Act : "+App_Exp_UserName_Value);
					Extent_pass(driver, "User Name Matched for the Head : "+App_Exp_Head+" ||  Exp : "+UserName_Exp+"  ||  Act : "+App_Exp_UserName_Value, test, test1);
				}else {
					System.out.println("User Name Not Matched for the Head : "+App_Exp_Head+" ||  Exp : "+UserName_Exp+"  ||  Act : "+App_Exp_UserName_Value);
					Extent_fail(driver, "User Name Not Matched for the Head : "+App_Exp_Head+" ||  Exp : "+UserName_Exp+"  ||  Act : "+App_Exp_UserName_Value, test, test1);
				}
				
				if(App_Exp_Date_Value.contains(Approved_Date_Expected)) {
					System.out.println("Date Matched for the Head : "+App_Exp_Head+" ||  Exp : "+Approved_Date_Expected+"  ||  Act : "+App_Exp_Date_Value);
					Extent_pass(driver, "Date Matched for the Head : "+App_Exp_Head+" ||  Exp : "+Approved_Date_Expected+"  ||  Act : "+App_Exp_Date_Value, test, test1);
				}else {
					System.out.println("Date Not Matched for the Head : "+App_Exp_Head+" ||  Exp : "+Approved_Date_Expected+"  ||  Act : "+App_Exp_Date_Value);
					Extent_fail(driver, "Date Not Matched for the Head : "+App_Exp_Head+" ||  Exp : "+Approved_Date_Expected+"  ||  Act : "+App_Exp_Date_Value, test, test1);
				}
			}
			Step_End(11, "Check whether the submitted/rejected/approved by username and date column is present.And ensure that this column is present in both open expense and approved expenses tab.  ", test, test1);
		}
		
		Extent_completed(tc_Name, test, test1);
		
		
	}
}
