package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS001 extends Keywords {
	
	public void  Cost_Activity_Report_TS001(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS001";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		
		String AgencyUser = data.get("AgencyUser");
		String Select_Contract_type_Value = data.get("Select_Contract_type_Value");
		String Select_Mode_type = data.get("Select_Mode_type");
		String Service_Code = data.get("Service_Code");
		String Vessel_Code = data.get("Vessel_Code");
		String Port_Code = data.get("Port_Code");
		String Terminal_Code = data.get("Terminal_Code");
		String Service_details_Codition = data.get("Service_details_Codition");
		String Arrival_Date_Condition = data.get("Arrival_Date_Condition");
		String Arrival_Date_Value = data.get("Arrival_Date_Value");

		String Un_Predictable_Table_Filter_Headers = data.get("Un_Predictable_Table_Filter_Headers");
		String Un_Predictable_Activate_Name = data.get("Un_Predictable_Activate_Name");
		String Value_Amount = data.get("Value_Amount");
		String Type_Quantity = data.get("Type_Quantity");
		String Un_Predictable_Vendor_Code = data.get("Un_Predictable_Vendor_Code");
		String Container_Activity_report_Saved_popup = data.get("Container_Activity_report_Saved_popup");
		String Container_Variable_report_Saved_popup =data.get("Container_Variable_report_Saved_popup");
		
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
		
		waitForElement(driver, Contract_Type_Input_CAR);
		click(driver,Contract_Type_Input_CAR);
		
		String SelectContract=String.format(Select_Contract_Type_CAR, Select_Contract_type_Value);
		waitForElement(driver, SelectContract);
		click(driver,SelectContract);
		
		waitForElement(driver, Mode_Select_Input_CAR);
		click(driver,Mode_Select_Input_CAR);
		
		String SelectModeValue=String.format(Select_Mode_type_CAR, Select_Mode_type);
		waitForElement(driver, SelectModeValue);
		click(driver,SelectModeValue);
		
		Step_Start(3, "Click on the Service search button and select the required service code.", test, test1);
		waitForElement(driver, Service_Search_Btn_CAR);
		click(driver,Service_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, Service_Code);
		Step_End(3, "Click on the Service search button and select the required service code.", test, test1);
		
		Step_Start(4, "Click on the Vessel search button and select the required vessel code.", test, test1);
		waitForElement(driver, Vessel_Search_Btn_CAR);
		click(driver,Vessel_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, Vessel_Code);
		Step_End(4, "Click on the Vessel search button and select the required vessel code.", test, test1);
		
		Step_Start(5, "Click on the Port search button and select the required port code.", test, test1);
		waitForElement(driver, Port_Search_Btn_CAR);
		click(driver,Port_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, Port_Code);
		Step_End(5, "Click on the Port search button and select the required port code.", test, test1);
		
		Step_Start(6, "Click on the Terminal search button and select the required terminal code.", test, test1);
		waitForElement(driver, Terminal_Search_Btn_CAR);
		click(driver,Terminal_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, Terminal_Code);
		Step_End(6, "Click on the Terminal search button and select the required terminal code.", test, test1);
		
		Step_Start(7, "Click on the Arrival date search button and select the required date. ", test, test1);
		waitForElement(driver, Arrival_Date_Search_Btn_CAR);
		click(driver,Arrival_Date_Search_Btn_CAR);
		selectValue(driver, Arrival_Date_Condition, Arrival_Date_Value);
		Step_End(7, "Click on the Arrival date search button and select the required date. ", test, test1);
		
		Step_Start(8, "Click on the Show button. ", test, test1);
		waitForElement(driver, Show_Button_CAR);
		click(driver,Show_Button_CAR);
		Step_End(8, "Click on the Show button. ", test, test1);
		
		Step_Start(9, "Click on the Predictable Reporting tab ", test, test1);
		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		waitForElement(driver, Predictable_Table_CAR);

		Step_End(9, "Click on the Predictable Reporting tab ", test, test1);
		
		Step_Start(10, "Select the required activities in the grid by using the check box selection", test, test1);
		
		waitForElement(driver, Predictable_Reporting_checkbox);
		click(driver,Predictable_Reporting_checkbox);
		
		Step_End(10, "Select the required activities in the grid by using the check box selection", test, test1);
		
		Step_Start(11, "Click on the Unpredictable Reporting tab", test, test1);
		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver,UnPredictable_Tab_CAR);
		waitForElement(driver, UnPredictable_Table_CAR);
		Step_End(11, "Click on the Unpredictable Reporting tab", test, test1);
		
		Step_Start(12, "Select the required data in the grid by using the check box selection", test, test1);
		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		waitForElement(driver, Column_Search_Input);
		
	
		jsClick(driver, UnPredictable_All_Checkbox_CAR);
		
		List<String> Unpredictable_Headers=splitAndExpand(Un_Predictable_Table_Filter_Headers);
		for(String FilterHeader : Unpredictable_Headers) {
			waitForElement(driver, Column_Search_Input);
			clear(driver, Column_Search_Input);
			waitForElement(driver, Column_Search_Input);
			sendKeys(driver, Column_Search_Input,FilterHeader);
		
			String checkbox=String.format(Select_Column_CAR,FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		
		jsClick(driver, Column_SelectMenu);
		
		waitForElement(driver, More_Grid_UnPredictable_CAR);
		click(driver,More_Grid_UnPredictable_CAR);
		
		waitForElement(driver, Condition_UnPredictable_CAR);
		click(driver,Condition_UnPredictable_CAR);

		waitForElement(driver, Activity_Name_CAR);
		sendKeys(driver, Activity_Name_CAR, Un_Predictable_Activate_Name);
		
		waitForElement(driver, Vendor_Code_Input_CAR);
		sendKeys(driver, Vendor_Code_Input_CAR, Un_Predictable_Vendor_Code);
		Step_End(12, "Select the required data in the grid by using the check box selection", test, test1);
		
		Step_Start(13, "After the selection enter the required quantity value for the selected records in the unpredictable reporting tab and check whether the activity has any variables in formula column", test, test1);
		waitForElement(driver, Quantity_Column_CAR);
		doubleClick(driver,Quantity_Column_CAR);
		waitForElement(driver, Quantity_Input_CAR1);
		clear(driver,Quantity_Input_CAR1);
		sendKeys(driver, Quantity_Input_CAR1, Type_Quantity);
		
		waitForElement(driver, Formula_Column_CAR);
		String Formula_Value=getText(driver, Formula_Column_CAR);
		Step_End(13, "After the selection enter the required quantity value for the selected records in the unpredictable reporting tab and check whether the activity has any variables in formula column", test, test1);

		if(!Formula_Value.equals("")) {
			Step_Start(15, "Incase,if the selected activity contains any formula means,input the required variable values and click on the apply variable button", test, test1);
			String UnPredictableActivity_Column=String.format(UnPredictable_Activity_Column_CAR, Un_Predictable_Activate_Name);
			waitForElement(driver, UnPredictableActivity_Column);
			click(driver,UnPredictableActivity_Column);
			
			waitForDisplay(driver, IsPredictable_Check_CAR);
			String predictableCheck=getAttribute1(driver, IsPredictable_Check_CAR, "aria-label");
			if(!predictableCheck.equals("checked")) {
				waitForElement(driver, Value_Input_Column_CAR);
				doubleClick(driver, Value_Input_Column_CAR);
				clear(driver,Value_Input_Column_CAR);
				sendKeys(driver, Value_Input_Column_CAR, Value_Amount);
				
				waitForElement(driver, Apply_Button_CAR);
				click(driver, Apply_Button_CAR);
				
				Step_Start(16, "Check whether the system populates a information message as variable(s) applied selected record", test, test1);	
				
				waitForElement(driver, Popup_Message);
				String Popup_Text_Act_val=getText(driver, Popup_Message);
				
				if(Popup_Text_Act_val.equals(Container_Variable_report_Saved_popup)) {
					System.out.println("Popup Matched  ||   Expected : "+Container_Variable_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act_val);
					Extent_pass(driver, "Popup Matched  ||   Expected : "+Container_Variable_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act_val, test, test1);
				}else {
					System.out.println("Popup Not Matched  ||   Expected : "+Container_Variable_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act_val);
					Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Container_Variable_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act_val, test, test1);
				}
				
				
				Step_End(16, "Check whether the system populates a information message as variable(s) applied selected record", test, test1);	
			}
			Step_End(15, "Incase,if the selected activity contains any formula means,input the required variable values and click on the apply variable button", test, test1);

			Step_Start(17, "Click on the tool bar save button. System validates as Container activity report saved and click on the ok option.Go to expense report and click the open expenses and select the activities and click the approve option.System validates as \"Approved amount should be less than or equal to 30000.0\".Click on the ok option.", test, test1);
			waitForElement(driver, SaveButton_ToolBar);
			click(driver,SaveButton_ToolBar);

			waitForElement(driver, popup_Message);
			String Popup_Text_Act=getText(driver, popup_Message);
			
			if(Popup_Text_Act.equals(Container_Activity_report_Saved_popup)) {
				System.out.println("Popup Matched  ||   Expected : "+Container_Activity_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act);
				Extent_pass(driver, "Popup Matched  ||   Expected : "+Container_Activity_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
			}else {
				System.out.println("Popup Not Matched  ||   Expected : "+Container_Activity_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act);
				Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Container_Activity_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
			}
			
			waitForElement(driver, popup_Message_Ok_Button);
			click(driver,popup_Message_Ok_Button);
			
			
		}else {
			
			Step_Start(14, "Click on the tool bar save button,if the selected activity does not contains any formula", test, test1);
			String UnPredictableActivity_Column=String.format(UnPredictable_Activity_Column_CAR, Un_Predictable_Activate_Name);
			waitForElement(driver, UnPredictableActivity_Column);
			click(driver,UnPredictableActivity_Column);
			
			waitForElement(driver, SaveButton_ToolBar);
			click(driver,SaveButton_ToolBar);
			Step_End(14, "Click on the tool bar save button,if the selected activity does not contains any formula", test, test1);

			Step_Start(17, ".Click on the tool bar save button and check whether the system shows the information message as Container Activity Report Saved", test, test1);
			waitForElement(driver, popup_Message);
			String Popup_Text_Act=getText(driver, popup_Message);
			
			if(Popup_Text_Act.equals(Container_Activity_report_Saved_popup)) {
				System.out.println("Popup Matched  ||   Expected : "+Container_Activity_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act);
				Extent_pass(driver, "Popup Matched  ||   Expected : "+Container_Activity_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
			}else {
				System.out.println("Popup Not Matched  ||   Expected : "+Container_Activity_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act);
				Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Container_Activity_report_Saved_popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
			}
			
			waitForElement(driver, popup_Message_Ok_Button);
			click(driver,popup_Message_Ok_Button);
			
		}

		Step_End(17, ".Click on the tool bar save button and check whether the system shows the information message as Container Activity Report Saved", test, test1);
		
		Extent_completed(tc_Name, test, test1);	
		
		
		

}
}