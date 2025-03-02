package Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS035 extends Keywords{
	
	public void  Cost_Activity_Report_TS035(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS035";
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
		String MSC_Headers_Names = data.get("MSC_Headers_Names");
		String Activity_Code_Value = data.get("Activity_Code_Value");

		String UserName_Exp = data.get("UserName_Exp");
		String Date_Expected = data.get("Date_Expected");
		
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
		
		Step_Start(4, "Check whether it opens a new search window. ", test, test1);
		Step_Start(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
		Step_Start(6, "Then click on the search button. ", test, test1);
		Step_Start(7, "System will show the CAR No. and Click on the select button ", test, test1);

		globalValueSearchWindow(driver,CAR_Retrieve_Condition,CAR_Retrieve_Type,CAR_Number_Retrieve,"","","","");

		Step_End(7, "System will show the CAR No. and Click on the select button ", test, test1);
		Step_End(6, "Then click on the search button. ", test, test1);
		Step_End(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
		Step_End(4, "Check whether it opens a new search window. ", test, test1);
		
		Step_Start(8, "System will retrieve the CAR", test, test1);
		waitForElement(driver, MSC_Column_Filt_CAR);
		Step_End(8, "System will retrieve the CAR", test, test1);
		
		Step_Start(9, "Check whether the submitted/rejected/approved by username and date column is present in the grid.", test, test1);
		click(driver, MSC_Column_Filt_CAR);
		waitForElement(driver, MSC_Filter_input_CAR);
		jsClick(driver, MSC_SelectAll_Checkbox_CAR);
		
		List<String> ExpensiveTable_Headers=splitAndExpand(MSC_Headers_Names);
		for(String FilterHeader : ExpensiveTable_Headers) {
			waitForElement(driver, MSC_Filter_input_CAR);
			clear(driver, MSC_Filter_input_CAR);
			waitForElement(driver, MSC_Filter_input_CAR);
			sendKeys(driver, MSC_Filter_input_CAR,FilterHeader);
		
			String checkbox=String.format(Select_Column_MSC_CAR,FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		
		jsClick(driver, MSC_Column_Filt_CAR);
		Step_End(9, "Check whether the submitted/rejected/approved by username and date column is present in the grid.", test, test1);
		
		Step_Start(10, "Ensure that the submitted/rejected/approved by username and date will be shown based on the last status of the activity.", test, test1);
		waitForElement(driver, MSC_Table_CAR);
		
		List<Map<String, String>> MSC_TableData = extractTableDataByColumnWithoutScroll(driver, MSC_Table_CAR);
		System.out.println("MSC_TableData : "+MSC_TableData);
		
		List<String> Activity_CodeList=splitAndExpand(Activity_Code_Value);
 	
		for(String Actvitycode:Activity_CodeList) {
			
			String UserName_Value_MSC_Act=getValueByFirstColumnAndHeader(MSC_TableData,"Activity Code",Actvitycode,"User Name");
			String Date_Value_MSC_Act=getValueByFirstColumnAndHeader(MSC_TableData,"Activity Code",Actvitycode,"Date");

			if(UserName_Value_MSC_Act.equals(UserName_Exp)) {
				System.out.println("User Name Matched for the Activity Code : "+Actvitycode+" ||  Exp : "+UserName_Exp+"  ||  Act : "+UserName_Value_MSC_Act);
				Extent_pass(driver, "User Name Matched for the Activity Code : "+Actvitycode+" ||  Exp : "+UserName_Exp+"  ||  Act : "+UserName_Value_MSC_Act, test, test1);
			}else {
				System.out.println("User Name Not Matched for the Activity Code : "+Actvitycode+" ||  Exp : "+UserName_Exp+"  ||  Act : "+UserName_Value_MSC_Act);
				Extent_fail(driver, "User Name Not Matched for the Activity Code : "+Actvitycode+" ||  Exp : "+UserName_Exp+"  ||  Act : "+UserName_Value_MSC_Act, test, test1);
			}
			
			if(Date_Value_MSC_Act.contains(Date_Expected)) {
				System.out.println("Date Matched for the Activity Code : "+Actvitycode+" ||  Exp : "+Date_Expected+"  ||  Act : "+Date_Value_MSC_Act);
				Extent_pass(driver, "Date Matched for the Activity Code : "+Actvitycode+" ||  Exp : "+Date_Expected+"  ||  Act : "+Date_Value_MSC_Act, test, test1);
			}else {
				System.out.println("Date Not Matched for the Activity Code : "+Actvitycode+" ||  Exp : "+Date_Expected+"  ||  Act : "+Date_Value_MSC_Act);
				Extent_fail(driver, "Date Not Matched for the Activity Code : "+Actvitycode+" ||  Exp : "+Date_Expected+"  ||  Act : "+Date_Value_MSC_Act, test, test1);
			}
		}
		Step_End(10, "Ensure that the submitted/rejected/approved by username and date will be shown based on the last status of the activity.", test, test1);

		Extent_completed(tc_Name, test, test1);
		
		
	}
}
