package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS081 extends Keywords{

	public void  Cost_Activity_Report_TS081(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		
		String tc_Name = "TC_Cost_Activity_Report_TS081";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String AgencyUser = data.get("AgencyUser");
		String contract_Type = data.get("Contract_Type");
		String condition_2 = data.get("Condition_2");
		
		String Select_Mode_type = data.get("Select_Mode_type");
		String Service_Code = data.get("Service_Code");
		String Vessel_Code = data.get("Vessel_Code");
		String Port_Code = data.get("Port_Code");
		String Terminal_Code = data.get("Terminal_Code");
		String Service_details_Codition = data.get("Service_details_Codition");
		String Arrival_Date_Condition = data.get("Arrival_Date_Condition");
		String Arrival_Date_Value = data.get("Arrival_Date_Value");
		
		String Select_Predicatble_Sub_Activity_Name = data.get("Select_Predicatble_Sub_Activity_Name");
		String Un_Predictable_Table_Filter_Headers = data.get("Un_Predictable_Table_Filter_Headers");
		String Vendor_Code = data.get("Vendor_Code");
		String Un_Predictable_Activate_Name = data.get("Un_Predictable_Activate_Name");
		String Type_Quantity = data.get("Type_Quantity");
		String variable_Applied_Popup = data.get("Variable_Applied_Popup");
		String value_Input = data.get("Value_Input");
		String submittted_Popup = data.get("Submittted_Popup");
		String CAR_Saved_Popup = data.get("CAR_Saved_Popup");
		
		String ptc_Master_Setup = data.get("PTC_Master_Setup");
		String globalSearchFilterOption1 = data.get("GlobalSearchFilterOption1");
		String globalSearchFilterOption2 = data.get("GlobalSearchFilterOption2");
		String dropdownCondition = data.get("DropdownCondition");
		String sub_Activity_Codes = data.get("Sub_Activity_Codes");
		String warning_Message = data.get("Warning_Message");

		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		
		Step_Start(1, "Once login to the application and click on switch profile option and select for the required agency", test, test1);
		
		
		SwitchProfile(driver, AgencyUser);

		Step_End(1, "Once login to the application and click on switch profile option and select for the required agency", test, test1);
		Step_Start(2, "Enter the screen name as \"Cost Activity Report\" in module search field", test, test1);
		
		moduleNavigate(driver, Cost_Activity_Report_Module);
		
		Step_End(2, "Enter the screen name as \"Cost Activity Report\" in module search field", test, test1);
		Step_Start(3, "Select the required contract type as \"PTC\" by using Contract type dropdown", test, test1);

		waitForElement(driver, Contract_Type_Input_CAR);
		click(driver,Contract_Type_Input_CAR);
		
		String SelectContract=String.format(Select_Contract_Type_CAR, contract_Type);
		waitForElement(driver, SelectContract);
		click(driver,SelectContract);
		
		Step_End(3, "Select the required contract type as \"PTC\" by using Contract type dropdown", test, test1);
		Step_Start(4, "Select the required \"Mode\" by using Mode dropdown", test, test1);

		waitForElement(driver, Mode_Select_Input_CAR);
		click(driver,Mode_Select_Input_CAR);
		
		String SelectModeValue=String.format(Select_Mode_type_CAR, Select_Mode_type);
		waitForElement(driver, SelectModeValue);
		click(driver,SelectModeValue);
		
		Step_End(4, "Select the required \"Mode\" by using Mode dropdown", test, test1);
		Step_Start(5, "Click on the Service search button and select the required service code. ", test, test1);

		waitForElement(driver, Service_Search_Btn_CAR);
		click(driver,Service_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, Service_Code);

		Step_End(5, "Click on the Service search button and select the required service code. ", test, test1);
		Step_Start(6, "Click on the Vessel search button and select the required vessel code.", test, test1);

		waitForElement(driver, Vessel_Search_Btn_CAR);
		click(driver,Vessel_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, Vessel_Code);
		
		Step_End(6, "Click on the Vessel search button and select the required vessel code.", test, test1);
		Step_Start(7, "Click on the Port search button and select the required port code", test, test1);

		waitForElement(driver, Port_Search_Btn_CAR);
		click(driver,Port_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, Port_Code);
		
		Step_End(7, "Click on the Port search button and select the required port code", test, test1);
		Step_Start(8, "Click on the Terminal search button and select the required terminal code", test, test1);

		waitForElement(driver, Terminal_Search_Btn_CAR);
		click(driver,Terminal_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, Terminal_Code);
		
		Step_End(8, "Click on the Terminal search button and select the required terminal code", test, test1);
		Step_Start(9, "Click on the Arrival date search button and select the required date", test, test1);

		waitForElement(driver, Arrival_Date_Search_Btn_CAR);
		click(driver,Arrival_Date_Search_Btn_CAR);
		selectValue1(driver, Arrival_Date_Condition, Arrival_Date_Value);
		
		Step_End(9, "Click on the Arrival date search button and select the required date", test, test1);
		
		Step_Start(10, "Click on the Show button", test, test1);
		
		waitForElement(driver, Show_Button_CAR);
		click(driver,Show_Button_CAR);
		
		waitForElement(driver, Arrival_Date_Input_CAR);
		String actual_Arr_Date=getAttribute(driver, Arrival_Date_Input_CAR, "value");
		System.out.println("actual_Arr_Date : "+actual_Arr_Date);
		
		Step_End(10, "Click on the Show button", test, test1);
		Step_Start(11, "Click on the Predictable and unpredictable reporting tab and check whether the activity are reflecting in ths AG Grid.", test, test1);
		
		
		
//		PTC master setup
			
			moduleNavigate(driver, ptc_Master_Setup);
			
			waitForElement(driver, SearchButton_Toolbar);
			click(driver,SearchButton_Toolbar);
			
			waitForElement(driver, select_first);
			click(driver,select_first);
			selectByText(driver, select_first, globalSearchFilterOption1);
			waitForElement(driver, globalSearch_Condition_Dropdown1);
			click(driver, globalSearch_Condition_Dropdown1);
			selectByText(driver, globalSearch_Condition_Dropdown1, dropdownCondition);
		
			waitForDisplay(driver, globalSearch_InputTextfield1);
			click(driver, globalSearch_InputTextfield1);
			sendKeys(driver, globalSearch_InputTextfield1, Port_Code);
			
			waitForElement(driver, select_Second);
			click(driver,select_Second);
			selectByText(driver, select_Second, globalSearchFilterOption2);
			waitForElement(driver, globalSearch_Condition_Dropdown2);
			click(driver, globalSearch_Condition_Dropdown2);
			selectByText(driver, globalSearch_Condition_Dropdown2, dropdownCondition);
			click(driver, globalSearch_InputTextfield2);
			sendKeys(driver, globalSearch_InputTextfield2, Terminal_Code);
			
			waitForElement(driver, globalSearch_Frame_SearchButton);
			click(driver, globalSearch_Frame_SearchButton);
			
			waitForDisplay(driver, retrieved_Value_Select);
			if(isdisplayed(driver, retrieved_Value_Select)) {
				
			click(driver, retrieved_Value_Select);
			
			waitForElement(driver, SelectButton);
			click(driver, SelectButton);
			
			waitForElement(driver, Edit_Button_toolBar);
			click(driver, Edit_Button_toolBar);
			
			}else {
				
				click(driver, globalSearch_Frame_Close_Button);
			
			waitForElement(driver, valid_From_Date_PTM);
			selectDatePicker(driver, valid_From_Date_PTM, actual_Arr_Date);
			
			waitForElement(driver, port_Search_Button_PTM);
			click(driver, port_Search_Button_PTM);
			selectValue(driver, condition_2, Port_Code);
			
			waitForElement(driver, terminal_Search_Button_PTM);
			click(driver, terminal_Search_Button_PTM);
			selectValue(driver, condition_2, Terminal_Code);
			
			}
		

			List<String> subActivity = splitAndExpand(sub_Activity_Codes);
			for(int i=0;i<subActivity.size();i++) {
				String sub_Activity_Code=subActivity.get(i);
				waitForElement(driver, subActivity_Add_Button_PTM);
				click(driver, subActivity_Add_Button_PTM);
				
			selectValue1(driver, condition_2, sub_Activity_Code);
			
			}
			waitForElement(driver, add_Button_PTM);
			click(driver, add_Button_PTM);
			
			waitForDisplay(driver, warning_Message_Ok_Button_PTC);
			if(isdisplayed(driver, warning_Message_Ok_Button_PTC)) {
				click(driver, warning_Message_Ok_Button_PTC);
			}
			
			scrollTop(driver);
			waitForElement(driver, SaveButton_ToolBar);
			click(driver, SaveButton_ToolBar);
			
			waitForDisplay(driver, popup_Message);
			if(isdisplayed(driver, popup_Message_Ok_Button)) {
				click(driver, popup_Message_Ok_Button);
			}
		
// CAR
			
			waitForElement(driver, CAR_Module);
			click(driver,CAR_Module);
		
		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		waitForElement(driver, Predictable_Reporting_CAR);

		Step_Start(12, "Select the required activities from the predictable reporting tab", test, test1);

		String PredictableActivity_Column=String.format(predictable_Activity_Column_CAR, Select_Predicatble_Sub_Activity_Name);
		waitForDisplay(driver, PredictableActivity_Column);
		scrollUsingElement(driver, PredictableActivity_Column);
		click(driver,PredictableActivity_Column);
		
		Step_End(12, "Select the required activities from the predictable reporting tab", test, test1);

		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver,UnPredictable_Tab_CAR);
		waitForElement(driver, UnPredictable_Table_CAR);
		
		Step_End(11, "Click on the Predictable and unpredictable reporting tab and check whether the activity is reflecting in the AG Grid", test, test1);
		Step_Start(13, "Select the required activities from the unpredictable reporting tab", test, test1);

		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		waitForElement(driver, Column_Search_Input);
		
		jsClick(driver, UnPredictable_All_Checkbox_CAR);
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
		sendKeys(driver, Vendor_Code_Input_CAR, Vendor_Code);

		String UnPredictableActivity_Column=String.format(UnPredictable_Activity_Column_CAR, Un_Predictable_Activate_Name);
		waitForElement(driver, UnPredictableActivity_Column);
		click(driver,UnPredictableActivity_Column);
		

		String UnPredictableActivity_Column_Checkbox=String.format(UnPredictable_CheckBox_Vendor_CAR, Vendor_Code);
		waitForElement(driver, UnPredictableActivity_Column_Checkbox);
		click(driver,UnPredictableActivity_Column_Checkbox);
		
		Step_End(13, "Select the required activities from the unpredictable reporting tab", test, test1);
		Step_Start(14, "Confirm once selected the activity in the unpredictable tab, the quantity should change to 1 and show the variable at the bottom of the screen, if that activity has Formula in the Formula column and the To be reported checkbox is True", test, test1);

		waitForElement(driver, Quantity_Column_CAR);
		doubleClick(driver,Quantity_Column_CAR);
		waitForElement(driver, quantity_Input_CAR);
		sendKeys(driver, quantity_Input_CAR, Type_Quantity);
		enter(driver);
		
		waitForElement(driver, value_Gridcell_UnPred_CAR);
		click(driver, value_Gridcell_UnPred_CAR);
		
		Step_End(14, "Confirm once selected the activity in the unpredictable tab, the quantity should change to 1 and show the variable at the bottom of the screen, if that activity has Formula in the Formula column and the To be reported checkbox is True", test, test1);
		Step_Start(15, "Apply the required variable value for that activity and click on the next column, then click on the apply variable option", test, test1);

		waitForElement(driver, value_Gridcell_Input_UnPred_CAR);
		clearAndType(driver, value_Gridcell_Input_UnPred_CAR, value_Input);
		enter(driver);
		
		waitForElement(driver, totalCost_Gridcell_UnPre);
		click(driver,totalCost_Gridcell_UnPre);
		
		waitForElement(driver, apply_Variable_Button_UnPre_CAR);
		click(driver,apply_Variable_Button_UnPre_CAR);
		
		Step_End(15, "Apply the required variable value for that activity and click on the next column, then click on the apply variable option", test, test1);
		Step_Start(16, "Check whether the system shows the information message 'Variable(s) applied selected record'", test, test1);

		waitForDisplay(driver, Popup_Message);
		String actual_Applied_Popup=getText(driver, Popup_Message);
		System.out.println("  actual_Applied_Popup : "+actual_Applied_Popup);

		if(actual_Applied_Popup.equals(variable_Applied_Popup)) {
			System.out.println("Matched || Expected Popup : "+variable_Applied_Popup+" || Actual Popup : "+actual_Applied_Popup);
			Extent_pass(driver, "Matched || Expected Popup : "+variable_Applied_Popup+" || Actual Popup : "+actual_Applied_Popup, test, test1);
		}else {
			System.out.println("Not Matched || Expected Popup : "+variable_Applied_Popup+" || Actual Popup : "+actual_Applied_Popup);
			Extent_fail(driver, "Not Matched || Expected Popup : "+variable_Applied_Popup+" || Actual Popup : "+actual_Applied_Popup, test, test1);
		}
		
		Step_End(16, "Check whether the system shows the information message 'Variable(s) applied selected record'", test, test1);
		Step_Start(17, "Click on the Toolbar save button", test, test1);

		scrollTop(driver);
		waitForElement(driver, SaveButton_ToolBar);
		click(driver, SaveButton_ToolBar);
		
		Step_End(17, "Click on the Toolbar save button", test, test1);
		Step_Start(18, "Check whether the system shows the information message 'Container Activity Report Saved'", test, test1);
		
		waitForDisplay(driver, popup_Message);
		String actual_Saved_Popup=getText(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			System.out.println("Matched || Expected Popup : "+CAR_Saved_Popup+" || Actual Popup : "+actual_Saved_Popup);
			Extent_pass(driver, "Matched || Expected Popup : "+CAR_Saved_Popup+" || Actual Popup : "+actual_Saved_Popup, test, test1);
			click(driver, popup_Message_Ok_Button);
		}else {
			System.out.println("Not Matched || Expected Popup : "+CAR_Saved_Popup+" || Actual Popup : "+actual_Saved_Popup);
			Extent_fail(driver, "Not Matched || Expected Popup : "+CAR_Saved_Popup+" || Actual Popup : "+actual_Saved_Popup, test, test1);
		}
		
		Step_End(18, "Check whether the system shows the information message 'Container Activity Report Saved'", test, test1);
		Step_Start(19, "Click on the Expense report button, system will open a new window", test, test1);

		waitForElement(driver, Expensive_Report_Btn_CAR);
		click(driver,Expensive_Report_Btn_CAR);
		
		waitForElement(driver, expense_Report_Activity_Total_Rows_CAR);
		
		Step_End(19, "Click on the Expense report button, system will open a new window", test, test1);
		Step_Start(20, "Click on the open expense tab and select the required activities, then click on the Submit button", test, test1);

		click(driver, expense_Report_Activity_Total_Rows_CAR);
		
		waitForElement(driver, Submit_Button_CAR);
		click(driver,Submit_Button_CAR);
		
		Step_End(20, "Click on the open expense tab and select the required activities, then click on the Submit button", test, test1);
		Step_Start(21, "Now system checks the activities with PTC Master setup module for that Port, Terminal and validity and shows a validity message if any mandatory activities are missing, along with a warning message 'Following PTC Activities Are Mandatory. Kindly Select To Submit'", test, test1);

		waitForElement(driver, warning_Message_CAR);
		String actual_Warning=getText(driver, warning_Message_CAR);
		if(actual_Warning.equals(warning_Message)) {
		System.out.println("Matched || Expected Warning message : "+warning_Message+" || Actual Warning message : "+actual_Warning);
		Extent_pass(driver, "Matched || Expected Warning message : "+warning_Message+" || Actual Warning message : "+actual_Warning, test, test1);
		
		click(driver, warning_Message_Ok_Button_CAR);
		}else {
			System.out.println("Not Matched || Expected Warning message : "+warning_Message+" || Actual Warning message : "+actual_Warning);
			Extent_fail(driver, "Not Matched || Expected Warning message : "+warning_Message+" || Actual Warning message : "+actual_Warning, test, test1);
			
		}
		
		Step_End(21, "Now system checks the activities with PTC Master setup module for that Port, Terminal and validity and shows a validity message if any mandatory activities are missing, along with a warning message 'Following PTC Activities Are Mandatory. Kindly Select To Submit'", test, test1);
		Step_Start(22, "If any particular activity is mapped to a specific vendor, it should validate if that activity is missed", test, test1);
		Step_Start(23, "If any particular activity is mapped to all vendors, it should validate if that activity is missed. Here that activity should be selected while submitting the record. No need to select all the activities with their respective vendors, only one activity selection is enough while submitting", test, test1);

		waitForElement(driver, expense_Report_Activity_Total_Rows_CAR);
		click(driver, expense_Report_Activity_Total_Rows_CAR);
		
		waitForElement(driver, expense_Report_Activity_Total_Rows_CAR);

		List<WebElement> totalRows = listOfElements(driver, expense_Report_Activity_Total_Rows_CAR);
		for(int i=1;i<=totalRows.size();i++) {
		String Expense_Row=String.format(expense_Report_Activity_Rows_CAR, i);
		click(driver,Expense_Row);
		}
		
		waitForElement(driver, Submit_Button_CAR);
		click(driver,Submit_Button_CAR);
		
		waitForDisplay(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
		String Popup_Text_Act=getText(driver, popup_Message);
		
		if(Popup_Text_Act.equals(submittted_Popup)) {
			System.out.println("Popup Matched  ||   Expected : "+submittted_Popup+"   ||   Actual   : "+Popup_Text_Act);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+submittted_Popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+submittted_Popup+"   ||   Actual   : "+Popup_Text_Act);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+submittted_Popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
		}
		
		waitForElement(driver, popup_Message_Ok_Button);
		click(driver,popup_Message_Ok_Button);
		}
		Step_End(22, "If any particular activity is mapped to a specific vendor, it should validate if that activity is missed", test, test1);
		Step_End(23, "If any particular activity is mapped to all vendors, it should validate if that activity is missed. Here that activity should be selected while submitting the record. No need to select all the activities with their respective vendors, only one activity selection is enough while submitting", test, test1);		
		Extent_completed(tc_Name, test, test1);
	}
	
	
}
