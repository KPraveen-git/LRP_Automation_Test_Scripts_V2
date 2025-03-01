package Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS005 extends Keywords{

	public void  Cost_Activity_Report_TS005(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS005";
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
		
		String Activity_updated_Popup = data.get("Activity_updated_Popup");
		
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
		
		Step_Start(3, "Retrive the CAR number using global search", test, test1);
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		
		waitForElement(driver, type_Select1);
		
		globalValueSearchWindow(driver,CAR_Retrieve_Condition1,CAR_Retrieve_Type1,CAR_Number_Retrieve_Value1,CAR_Retrieve_Type2,CAR_Number_Retrieve_Value2,CAR_Retrieve_Type3,CAR_Number_Retrieve_Value3);
		
		waitForElement(driver, CAR_Number_Input_CAR);
		Step_End(3, "Retrive the CAR number using global search", test, test1);
		
		Step_Start(4, "Click on the tool bar \"Edit\" button", test, test1);
		waitForElement(driver, Edit_Button_toolBar);
		click(driver,Edit_Button_toolBar);
		Step_End(4, "Click on the tool bar \"Edit\" button", test, test1);
		
		Step_Start(5, "Click on the Predictable reporting tab", test, test1);
		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		waitForElement(driver, Predictable_Table_CAR);
		Step_End(5, "Click on the Predictable reporting tab", test, test1);
		
		if(isdisplayed(driver, Non_ReportedActivity_name_CAR)) {
			Step_Start(6, "Select any of the not reported activity in it(without pink color indication).Reported activities are highlighted with pink color", test, test1);
			waitForElement(driver, Non_ReportedActivity_name_CAR);
			String non_ReportActivity=getText(driver, Non_ReportedActivity_name_CAR);
			
			String selectColumn=String.format(Predictable_Activity_Column_CAR, non_ReportActivity);
			waitForElement(driver, selectColumn);
			click(driver,selectColumn);
			Step_End(6, "Select any of the not reported activity in it(without pink color indication).Reported activities are highlighted with pink color", test, test1);
			
			Step_Start(7, "Click on the tool bar save button", test, test1);
			waitForElement(driver, SaveButton_ToolBar);
			click(driver,SaveButton_ToolBar);
			Step_End(7, "Click on the tool bar save button", test, test1);
			
			Step_Start(8, "Check whether the system populates the information message as \"Container Activity Report Updated\"", test, test1);
			waitForElement(driver, popup_Message);
			String Popup_Text_Act=getText(driver, popup_Message);
			
			if(Popup_Text_Act.equals(Activity_updated_Popup)) {
				System.out.println("Popup Matched  ||   Expected : "+Activity_updated_Popup+"   ||   Actual   : "+Popup_Text_Act);
				Extent_pass(driver, "Popup Matched  ||   Expected : "+Activity_updated_Popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
			}else {
				System.out.println("Popup Not Matched  ||   Expected : "+Activity_updated_Popup+"   ||   Actual   : "+Popup_Text_Act);
				Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Activity_updated_Popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
			}
			
			waitForElement(driver, popup_Message_Ok_Button);
			click(driver,popup_Message_Ok_Button);
			Step_End(8, "Check whether the system populates the information message as \"Container Activity Report Updated\"", test, test1);

			Step_Start(9, "Check whether the selected activity is reported or not,if it reported means it should show along with pink color indication", test, test1);
			waitForElement(driver, Predictable_Reporting_CAR);
			click(driver,Predictable_Reporting_CAR);
			waitForElement(driver, Predictable_Table_CAR);
			
			String UpdatedColumn=String.format(Updated_Activity_Row_CAR, non_ReportActivity);
			waitForElement(driver, UpdatedColumn);
			String updatedColumn_value=getAttribute(driver, UpdatedColumn, "class");
			if(updatedColumn_value.contains("pink")) {
				System.out.println("Updated Acivity Column Highlighted in pink color");
				Extent_pass(driver, "Updated Acivity Column Highlighted in pink color", test, test1);
			}else {
				System.out.println("Updated Acivity Column not Highlighted in pink color");
				Extent_fail(driver, "Updated Acivity Column not Highlighted in pink color", test, test1);
			}
			Step_End(9, "Check whether the selected activity is reported or not,if it reported means it should show along with pink color indication", test, test1);

		}else {
			System.out.println("Non Reported Activity Column is not present");
			Extent_FailNew(driver, "Non Reported Activity Column is not present", test, test1);
		}
		
		Extent_completed(tc_Name, test, test1);
		
	}
}
