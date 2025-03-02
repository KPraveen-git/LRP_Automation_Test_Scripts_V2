package LRP_Cost_Scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS080 extends Keywords{

	public void  Cost_Activity_Report_TS080(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		
		String tc_Name = "TC_Cost_Activity_Report_TS080";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String AgencyUser = data.get("AgencyUser");
		String condition_2 = data.get("Condition_2");
		String contract_Type = data.get("Contract_Type");

		String Select_Mode_type = data.get("Select_Mode_type");
		String Service_Code = data.get("Service_Code");
		String Vessel_Code = data.get("Vessel_Code");
		String Port_Code = data.get("Port_Code");
		String Terminal_Code = data.get("Terminal_Code");
		String Service_details_Codition = data.get("Service_details_Codition");
		String Arrival_Date_Condition = data.get("Arrival_Date_Condition");
		String Arrival_Date_Value = data.get("Arrival_Date_Value");
		
		String Un_Predictable_Table_Filter_Headers = data.get("Un_Predictable_Table_Filter_Headers");
		String Vendor_Code = data.get("Vendor_Code");
		String ptc_Master_Setup = data.get("PTC_Master_Setup");
		String globalSearchFilterOption1 = data.get("GlobalSearchFilterOption1");
		String globalSearchFilterOption2 = data.get("GlobalSearchFilterOption2");
		String dropdownCondition = data.get("DropdownCondition");
		String sub_Activity_Codes = data.get("Sub_Activity_Codes");
		String columnHeaders_predictable = data.get("ColumnHeaders_predictable");

		String vendor_code_header = data.get("vendor_code_header");
		String port_code_header = data.get("port_code_header");
		String service_header = data.get("service_header");
		String vessel_code_header = data.get("vessel_code_header");
		String terminal_code_header = data.get("terminal_code_header");
		String arrival_date_header = data.get("arrival_date_header");
		String sub_activity_code_header = data.get("sub_activity_code_header");
		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		
		Step_Start(1, "Once login to the application and click on switch profile option and select for the required agency.", test, test1);
		
		
		SwitchProfile(driver, AgencyUser);

		Step_End(1, "Once login to the application and click on switch profile option and select for the required agency.", test, test1);
		Step_Start(2, "Enter the screen name as \"Cost Activity Report\" in module search field.", test, test1);
		
		moduleNavigate(driver, Cost_Activity_Report_Module);
		
		Step_End(2, "Enter the screen name as \"Cost Activity Report\" in module search field.", test, test1);
		Step_Start(3, "Select the required contract type as \"PTC\" by using Contract type dropdown", test, test1);

		waitForElement(driver, Contract_Type_Input_CAR);
		click(driver,Contract_Type_Input_CAR);
		
		String SelectContract=String.format(Select_Contract_Type_CAR, contract_Type);
		waitForElement(driver, SelectContract);
		click(driver,SelectContract);
		
		Step_End(3, "Select the required contract type as \"PTC\" by using Contract type dropdown", test, test1);
		Step_Start(4, "Select the required \"Mode\" by using Mode dropdown.", test, test1);

		waitForElement(driver, Mode_Select_Input_CAR);
		click(driver,Mode_Select_Input_CAR);
		
		String SelectModeValue=String.format(Select_Mode_type_CAR, Select_Mode_type);
		waitForElement(driver, SelectModeValue);
		click(driver,SelectModeValue);
		
		Step_End(4, "Select the required \"Mode\" by using Mode dropdown.", test, test1);
		Step_Start(5, "Click on the Service search button and select the required service code.", test, test1);

		waitForElement(driver, Service_Search_Btn_CAR);
		click(driver,Service_Search_Btn_CAR);
twoColumnSearchWindow(driver, service_header, Service_details_Codition, Service_Code);
		Step_End(5, "Click on the Service search button and select the required service code.", test, test1);
		Step_Start(6, "Click on the Vessel search button and select the required vessel code.", test, test1);

		waitForElement(driver, Vessel_Search_Btn_CAR);
		click(driver,Vessel_Search_Btn_CAR);
		twoColumnSearchWindow(driver, vessel_code_header, condition_2, Vessel_Code);

		Step_End(6, "Click on the Vessel search button and select the required vessel code.", test, test1);
		Step_Start(7, "Click on the Port search button and select the required port code.", test, test1);

		waitForElement(driver, Port_Search_Btn_CAR);
		click(driver,Port_Search_Btn_CAR);
		twoColumnSearchWindow(driver, port_code_header, condition_2, Port_Code);

		Step_End(7, "Click on the Port search button and select the required port code.", test, test1);
		Step_Start(8, "Click on the Terminal search button and select the required terminal code.", test, test1);

		waitForElement(driver, Terminal_Search_Btn_CAR);
		click(driver,Terminal_Search_Btn_CAR);
		twoColumnSearchWindow(driver, terminal_code_header, condition_2, Terminal_Code);

		Step_End(8, "Click on the Terminal search button and select the required terminal code.", test, test1);
		Step_Start(9, "Click on the Arrival date search button and select the required date.", test, test1);

		waitForElement(driver, Arrival_Date_Search_Btn_CAR);
		click(driver,Arrival_Date_Search_Btn_CAR);
		twoColumnSearchWindow(driver, arrival_date_header, Arrival_Date_Condition, Arrival_Date_Value);

		Step_End(9, "Click on the Arrival date search button and select the required date.", test, test1);
		
		Step_Start(10, "Click on the Show button.", test, test1);
		
		waitForElement(driver, Show_Button_CAR);
		click(driver,Show_Button_CAR);
		
		waitForElement(driver, Arrival_Date_Input_CAR);
		String actual_Arr_Date=getAttribute(driver, Arrival_Date_Input_CAR, "value");
		System.out.println("actual_Arr_Date : "+actual_Arr_Date);
		
		
		Step_End(10, "Click on the Show button.", test, test1);
		Step_Start(11, "Click on the Predictable and unpredictable reporting and check whether the activity is reflecting in the AG Grid.", test, test1);
		
		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		waitForElement(driver, Predictable_Reporting_CAR);

		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		
		waitForElement(driver, column_All_Select_CheckBox);
		click(driver, column_All_Select_CheckBox);
		
		List<String> column_Headers=splitAndExpand(columnHeaders_predictable);
		for(int i=0;i<column_Headers.size();i++) {
		String column=column_Headers.get(i);
		click(driver, column_SearchBox);
		clear(driver, column_SearchBox);
		sendKeys(driver, column_SearchBox, column);
		String checkbox=String.format(Select_ColumnValue_Predictable_CAR, column);
		click(driver, checkbox);
		
		}
		
		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		
		
		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver,UnPredictable_Tab_CAR);
		waitForElement(driver, UnPredictable_Table_CAR);
		
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
		
		Step_End(11, "Click on the Predictable and unpredictable reporting and check whether the activity is reflecting in the AG Grid.", test, test1);
		Step_Start(12, "Now copy the Port, Terminal, and Arrival date.", test, test1);
		
		waitForElement(driver, Arrival_Date_Input_CAR);
		String actual_Arr_Date1=getAttribute(driver, Arrival_Date_Input_CAR, "value");
		System.out.println("actual_Arr_Date : "+actual_Arr_Date1);
		
		Step_End(12, "Now copy the Port, Terminal, and Arrival date.", test, test1);
		Step_Start(13, "Then enter the screen name as 'PTC Master setup' in module search field.", test, test1);
		
//	PTC master setup
		
		moduleNavigate(driver, ptc_Master_Setup);
		
		Step_End(13, "Then enter the screen name as 'PTC Master setup' in module search field.", test, test1);
		Step_Start(14, "Click on the Global search option available in the toolbar.", test, test1);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		
		
		waitForElement(driver, select_first);
		click(driver,select_first);
		selectByText(driver, select_first, globalSearchFilterOption1);
		waitForElement(driver, globalSearch_Condition_Dropdown1);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, dropdownCondition);
	
		Step_End(14, "Click on the Global search option available in the toolbar.", test, test1);
		Step_Start(15, "System will open a new window and paste the Port at Port code field and paste the Terminal at Terminal code field.", test, test1);

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
		
		Step_End(15, "System will open a new window and paste the Port at Port code field and paste the Terminal at Terminal code field.", test, test1);
		Step_Start(16, "Click on the Search button.", test, test1);
		
		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);
//		
		Step_End(16, "Click on the Search button.", test, test1);

		waitForDisplay(driver, retrieved_Value_Select);
		if(isdisplayed(driver, retrieved_Value_Select)) {
			
			Step_Start(17, "System will show the list of Template No. which is created for Port and Terminal along with the Validity date.", test, test1);

		click(driver, retrieved_Value_Select);
		
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		
		Step_End(17, "System will show the list of Template No. which is created for Port and Terminal along with the Validity date.", test, test1);

		Step_Start(18, "Check whether our PTC CAR Arrival date falls in that validity.", test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);
		
		Step_End(18, "Check whether our PTC CAR Arrival date falls in that validity.", test, test1);

		
		}else {
			
			Step_Start(19, "If the Arrival date does not fall in that validity, go to the Cost Activity Report module and check that all activities should be non-mandatory. The 'Is Mandatory' column checkbox should be unticked (False) for all the activities.", test, test1);

			click(driver, globalSearch_Frame_Close_Button);
		
			waitForElement(driver, CAR_Module);
			click(driver, CAR_Module);
			
			
			waitForElement(driver, isMandatory_Checkbox_UnPredi_CAR);
			
			if(!IsElementSelected(driver, isMandatory_Checkbox_UnPredi_CAR)) {
				System.out.println("Passed || 'Is Mandatory' column checkbox is unticked");
				Extent_pass(driver, "Passed || 'Is Mandatory' column checkbox is unticked", test, test1);
			}else {
				System.out.println("Failed || 'Is Mandatory' column checkbox is ticked");
				Extent_pass(driver, "Failed || 'Is Mandatory' column checkbox is ticked", test, test1);
			}
		
			waitForElement(driver, PTC_Master_Setup_Module);
			click(driver, PTC_Master_Setup_Module);
			
		waitForElement(driver, valid_From_Date_PTM);
		selectDatePicker(driver, valid_From_Date_PTM, actual_Arr_Date1);
		
		waitForElement(driver, port_Search_Button_PTM);
		click(driver, port_Search_Button_PTM);
		twoColumnSearchWindow(driver, port_code_header, condition_2, Port_Code);
		waitForElement(driver, terminal_Search_Button_PTM);
		click(driver, terminal_Search_Button_PTM);
		twoColumnSearchWindow(driver, terminal_code_header, condition_2, Terminal_Code);

		Step_End(19, "If the Arrival date does not fall in that validity, go to the Cost Activity Report module and check that all activities should be non-mandatory. The 'Is Mandatory' column checkbox should be unticked (False) for all the activities.", test, test1);

		}

		waitForElement(driver, vendor_Search_Button_PTM);
		click(driver, vendor_Search_Button_PTM);
		twoColumnSearchWindow(driver, vendor_code_header, condition_2, Vendor_Code);
		
		List<String> subActivity = splitAndExpand(sub_Activity_Codes);
		for(int i=0;i<subActivity.size();i++) {
			String sub_Activity_Code=subActivity.get(i);
			waitForElement(driver, subActivity_Add_Button_PTM);
			click(driver, subActivity_Add_Button_PTM);
			
		twoColumnSearchWindow(driver, sub_activity_code_header, condition_2, sub_Activity_Code);
		}
		waitForElement(driver, add_Button_PTM);
		click(driver, add_Button_PTM);
		
		waitForDisplay(driver, already_ok_btn);
		if(isdisplayed(driver, already_ok_btn)) {
			
			
			click(driver, already_ok_btn);
		}
		
		
		scrollTop(driver);
		waitForElement(driver, SaveButton_ToolBar);
		click(driver, SaveButton_ToolBar);
		
		waitForDisplay(driver, popup_Message_Ok_Button);
		if(isdisplayed(driver, popup_Message_Ok_Button)) {
			click(driver, popup_Message_Ok_Button);
			
		}
		
		waitForDisplay(driver, Popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			String actualPopup=getText(driver, popup_Message);
			System.out.println("actualPopup : "+actualPopup);
			
		}
		
		Step_Start(20, "In case the Port code, Terminal, and Arrival date match with any of the validity of the Template No., double click on the Template No.", test, test1);
		
		waitForElement(driver, subActivityCode_Gridcells_CI);

		List<WebElement> subActivities = listOfElements(driver, subActivityCode_Gridcells_CI);
		ArrayList<String> subAvtivityCodes=new ArrayList<String>();
		
		for(int i=1;i<=subActivities.size();i++) {
			String actual_ActivityCode=String.format(subActivityCode_Gridcells_List_CI, i);
			String get_ActivityCode=getText(driver, actual_ActivityCode);
			subAvtivityCodes.add(get_ActivityCode);
		}
		
		System.out.println("subAvtivityCodes : "+subAvtivityCodes);

		List<WebElement> vendorCodes_CI = listOfElements(driver, vendorCode_Gridcells_CI);
		ArrayList<String> vendorCodes=new ArrayList<String>();
		
		for(int i=1;i<=vendorCodes_CI.size();i++) {
			String actual_VendorCode=String.format(vendorCode_Gridcells_List_CI, i);
			String get_VendorCode=getText(driver, actual_VendorCode);
			vendorCodes.add(get_VendorCode);
		}
		
		System.out.println("vendorCodes : "+vendorCodes);
		
		Step_End(20, "In case the Port code, Terminal, and Arrival date match with any of the validity of the Template No., double click on the Template No.", test, test1);

		Step_Start(21, "Copy all the Sub Activity codes along with their Vendor codes from the AG grid.", test, test1);
		
		Extent_pass(driver, "sub Avtivity Codes : "+subAvtivityCodes, test, test1);
		Extent_pass(driver, "vendor Codes : "+vendorCodes, test, test1);

		Step_End(21, "Copy all the Sub Activity codes along with their Vendor codes from the AG grid.", test, test1);
		Step_Start(22, "Then go to the previous module 'Cost Activity Reporting'.", test, test1);
		
		waitForElement(driver, CAR_Module);
		click(driver, CAR_Module);
		
		waitForElement(driver, Refresh_Button_CAR);
		click(driver, Refresh_Button_CAR);
		
		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		waitForElement(driver, Predictable_Reporting_CAR);

		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		
		waitForElement(driver, column_All_Select_CheckBox);
		click(driver, column_All_Select_CheckBox);
		
		for(int i=0;i<column_Headers.size();i++) {
		String column=column_Headers.get(i);
		click(driver, column_SearchBox);
		clear(driver, column_SearchBox);
		sendKeys(driver, column_SearchBox, column);
		String checkbox=String.format(Select_ColumnValue_Predictable_CAR, column);
		click(driver, checkbox);
		
		}
		
		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		
		
		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver,UnPredictable_Tab_CAR);
		waitForElement(driver, UnPredictable_Table_CAR);
		
		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		waitForElement(driver, Column_Search_Input);
		
		jsClick(driver, UnPredictable_All_Checkbox_CAR);
		jsClick(driver, UnPredictable_All_Checkbox_CAR);
		
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
		

		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		
		Step_End(22, "Then go to the previous module 'Cost Activity Reporting'.", test, test1);

		Step_Start(23, "Compare the Sub Activity code in the PTC Master setup with the Sub Activity column in Cost Activity Reporting.", test, test1);
		
		waitForElement(driver, Predictable_ActivityCodes_List_CAR);
		List<WebElement> activityCodes_CAR_Pred = listOfElements(driver, Predictable_ActivityCodes_List_CAR);

		ArrayList<String> activity_Codes_CAR=new ArrayList<String>();
		
			for(int j=1;j<=activityCodes_CAR_Pred.size();j++) {
				String actual_ActivityCode_Pred=String.format(Predictable_ActivityCodes_CAR, j);
				String get_ActivityCode=getText(driver, actual_ActivityCode_Pred);
				activity_Codes_CAR.add(get_ActivityCode);
			}
			
			Step_End(23, "Compare the Sub Activity code in the PTC Master setup with the Sub Activity column in Cost Activity Reporting.", test, test1);
			Step_Start(24, "If any Sub Activity code matches, check the Vendor code in the PTC Master setup.", test, test1);
		
			List<WebElement> vendorCodes_CAR_Pred = listOfElements(driver, Predictable_vendorCodes_List_CAR);
			
			ArrayList<String> vendor_Codes_CAR=new ArrayList<String>();
			
			for(int i=1;i<=vendorCodes_CAR_Pred.size();i++) {
				String actual_VendorCode=String.format(Predictable_vendorCode_CAR, i);
				String get_VendorCode=getText(driver, actual_VendorCode);
				vendor_Codes_CAR.add(get_VendorCode);
			}
			
			
			waitForElement(driver, UnPredictable_Tab_CAR);
			click(driver,UnPredictable_Tab_CAR);
			
			waitForElement(driver, unPredictable_ActivityCodes_List_CAR);

			List<WebElement> activityCodes_CAR_UnPred = listOfElements(driver, unPredictable_ActivityCodes_List_CAR);

			for(int j=1;j<=activityCodes_CAR_UnPred.size();j++) {
				String actual_ActivityCode_UnPred=String.format(unPredictable_ActivityCodes_CAR, j);
				String get_ActivityCode=getText(driver, actual_ActivityCode_UnPred);
				activity_Codes_CAR.add(get_ActivityCode);
			}
			
			List<WebElement> vendorCodes_CAR_UnPred = listOfElements(driver, unPredictable_VendorCodes_List_CAR);

			for(int i=1;i<=vendorCodes_CAR_UnPred.size();i++) {
				String actual_VendorCode=String.format(unPredictable_VendorCodes_CAR, i);
				String get_VendorCode=getText(driver, actual_VendorCode);
				vendor_Codes_CAR.add(get_VendorCode);
			}
			
			System.out.println("vendor_Codes_CAR : "+vendor_Codes_CAR);

		System.out.println("activity_Codes_CAR : "+activity_Codes_CAR);
		
		Step_End(24, "If any Sub Activity code matches, check the Vendor code in the PTC Master setup.", test, test1);
		
		for(int i=0; i<activity_Codes_CAR.size();i++) {
			
			Step_Start(25, "If both the Sub Activity and Vendor code match, the 'Is Mandatory' column should be selected (True) for the activity.", test, test1);

			if(subAvtivityCodes.contains(activity_Codes_CAR.get(i)) && vendorCodes.contains(vendor_Codes_CAR.get(i)) ) {
				waitForElement(driver, isMandatory_Checkbox_UnPredi_CAR);
				
				if(IsElementSelected(driver, isMandatory_Checkbox_UnPredi_CAR)) {
					System.out.println("Passed || 'Is Mandatory' column checkbox is ticked for "+activity_Codes_CAR.get(i));
					Extent_pass(driver, "Passed || 'Is Mandatory' column checkbox is ticked for "+activity_Codes_CAR.get(i), test, test1);
				}else {
					System.out.println("Failed || 'Is Mandatory' column checkbox is unticked for "+activity_Codes_CAR.get(i));
					Extent_pass(driver, "Failed || 'Is Mandatory' column checkbox is unticked for "+activity_Codes_CAR.get(i), test, test1);
				}
			}
			
			Step_End(25, "If both the Sub Activity and Vendor code match, the 'Is Mandatory' column should be selected (True) for the activity.", test, test1);
			Step_Start(26, "If the Sub Activity matches with PTC Master setup but the Vendor code does not match, the 'Is Mandatory' column should be unselected (False) for the activity.", test, test1);

			if(!subAvtivityCodes.contains(activity_Codes_CAR.get(i)) && vendorCodes.contains(vendor_Codes_CAR.get(i)) ) {
				waitForElement(driver, isMandatory_Checkbox_UnPredi_CAR);
				
				if(IsElementSelected(driver, isMandatory_Checkbox_UnPredi_CAR)) {
					System.out.println("Passed || 'Is Mandatory' column checkbox is unticked for "+activity_Codes_CAR.get(i));
					Extent_pass(driver, "Passed || 'Is Mandatory' column checkbox is unticked for "+activity_Codes_CAR.get(i), test, test1);
				}else {
					System.out.println("Failed || 'Is Mandatory' column checkbox is ticked for "+activity_Codes_CAR.get(i));
					Extent_pass(driver, "Failed || 'Is Mandatory' column checkbox is ticked for "+activity_Codes_CAR.get(i), test, test1);
				}
			}
			
			Step_End(26, "If the Sub Activity matches with PTC Master setup but the Vendor code does not match, the 'Is Mandatory' column should be unselected (False) for the activity.", test, test1);

			Step_Start(27, "If the Sub Activity matches with the PTC Master setup and the sub activity is not mapped to any of the Vendor codes, all the sub activities should be selected. It should not consider the Vendor code here. The 'Is Mandatory' column should be selected (True) for the activity.", test, test1);
			
			if(subAvtivityCodes.contains(activity_Codes_CAR.get(i)) && !vendorCodes.contains(vendor_Codes_CAR.get(i)) ) {
				waitForElement(driver, isMandatory_Checkbox_UnPredi_CAR);
				
				if(IsElementSelected(driver, isMandatory_Checkbox_UnPredi_CAR)) {
					System.out.println("Passed || 'Is Mandatory' column checkbox is unticked for "+activity_Codes_CAR.get(i));
					Extent_pass(driver, "Passed || 'Is Mandatory' column checkbox is unticked for "+activity_Codes_CAR.get(i), test, test1);
				}else {
					System.out.println("Failed || 'Is Mandatory' column checkbox is ticked for "+activity_Codes_CAR.get(i));
					Extent_pass(driver, "Failed || 'Is Mandatory' column checkbox is ticked for "+activity_Codes_CAR.get(i), test, test1);
				}
			}
			
			Step_End(27, "If the Sub Activity matches with the PTC Master setup and the sub activity is not mapped to any of the Vendor codes, all the sub activities should be selected. It should not consider the Vendor code here. The 'Is Mandatory' column should be selected (True) for the activity.", test, test1);

		}
		
		Extent_completed(tc_Name, test, test1);
	}
	
	
}
