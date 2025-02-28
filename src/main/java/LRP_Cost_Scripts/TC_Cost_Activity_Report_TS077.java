package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS077 extends Keywords {
	
	public void  Cost_Activity_Report_TS077(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS077";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);
		
		String username = data.get("Username");
		String password = data.get("Password");
		String AgencyUser = data.get("AgencyUser");
		String activity_module = data.get("activity_module");
		String activity_code_data = data.get("activity_code_data");
		String activity_desc_data = data.get("activity_desc_data");
		String activity_type_data = data.get("activity_type_data");
		String contract_type_data = data.get("contract_type_data");
		String gam_module = data.get("gam_module");
		String condition = data.get("condition");
		String main_activity_data = data.get("main_activity_data");
		String global_updated_msg = data.get("global_updated_msg");
		String vendor_contract_module = data.get("vendor_contract_module");
		String vendor_code_data_Vc = data.get("vendor_code_data_Vc");
		String datepicker = data.get("datepicker");
		String from_date_Vc = data.get("from_date_Vc");
		String To_date_Vc = data.get("To_date_Vc");
		String currency_data_vc = data.get("currency_data_vc");
		String equip_type_options_Vc_data = data.get("equip_type_options_Vc_data");
		String equip_sts_data = data.get("equip_sts_data");
		String wantToApprove_Popup = data.get("WantToApprove_Popup");
		String mappingSavedPopup = data.get("MappingSavedPopup");
		String dropdownCondition = data.get("DropdownCondition");
		String Service_Code = data.get("Service_Code");
		String Vessel_Code = data.get("Vessel_Code");
		String Port_Code = data.get("Port_Code");
		String Terminal_Code = data.get("Terminal_Code");
		String CAR_Saved_Poupup = data.get("CAR_Saved_Poupup");
		String Arrival_Date_Condition = data.get("Arrival_Date_Condition");
		String Arrival_Date_Value = data.get("Arrival_Date_Value");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String condition_2 = data.get("Condition_2");
		String template_No = data.get("Template_No");
		String Select_Mode_type = data.get("Select_Mode_type");
		String globalSearchFilterOption2 = data.get("GlobalSearchFilterOption2");
		String Predictable_Select_Type = data.get("Predictable_Select_Type");
		String Predictable_Select_Codition = data.get("Predictable_Select_Codition");
		String Predictable_Activity_Module = data.get("Predictable_Activity_Module");
		String Popup_Text_Exp = data.get("Popup_Text_Exp");
		String Un_Predictable_Table_Filter_Headers = data.get("Un_Predictable_Table_Filter_Headers");
		String columnHeaders_predictable = data.get("ColumnHeaders_predictable");

		
		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);
		verifyMainMenu(driver);
		
		SwitchProfile(driver, AgencyUser);
		Step_Start(1, "Once login to the application, enter the screen name as 'Activity' in the module search field.", test, test1);
	
		moduleNavigate(driver, activity_module);

		Step_End(1, "Once login to the application, enter the screen name as 'Activity' in the module search field.", test, test1);

		Step_Start(2, "Enter the Activity code with the required alphabets and give the required activity description and select the activity type as Sub and contract type as CTL and click the add option and next click the save option in the toolbar.", test, test1);
	
		waitForDisplay(driver, new_button_Act_Mod);
		
		if(isdisplayed(driver, new_button_Act_Mod)) {
		click(driver, new_button_Act_Mod);}
		
		waitForDisplay(driver, NewButton_ToolBar);
		
		if(isdisplayed(driver, NewButton_ToolBar) && isElementAccessible(driver, NewButton_ToolBar)) {
			click(driver, NewButton_ToolBar);}
		
		waitForElement(driver, activity_code_Act_Mod);
		sendKeys(driver, activity_code_Act_Mod, activity_code_data);
		
		waitForElement(driver, activity_description_Act_Mod);
		sendKeys(driver, activity_description_Act_Mod, activity_desc_data);
		
		click(driver, activity_type_dd_label);
		String activity_type = String.format(activity_type_dd_options, activity_type_data);
		waitForElement(driver, activity_type);
		click(driver, activity_type);
		
		waitForElement(driver, contract_type_dd_label);
		click(driver, contract_type_dd_label);
		String contract_type = String.format(contract_type_dd_options, contract_type_data);
		waitForElement(driver, contract_type);
		click(driver, contract_type);
		
		waitForElement(driver, add_button_Act_Mod);
		click(driver, add_button_Act_Mod);
		
		scrollTop(driver);
		waitForElement(driver, Save_button_toolBar);
		click1(driver, Save_button_toolBar);
		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);
		
		Step_End(2, "Enter the Activity code with the required alphabets and give the required activity description and select the activity type as Sub and contract type as CTL and click the add option and next click the save option in the toolbar.", test, test1);

		Step_Start(3, "Next enter the screen name as 'Global activity mapping' in the module search field.", test, test1);
	
		moduleNavigate(driver, gam_module);
		
		waitForDisplay(driver, NewButton_ToolBar);
		
		if(isdisplayed(driver, NewButton_ToolBar) && isElementAccessible(driver, NewButton_ToolBar)) {
			click(driver, NewButton_ToolBar);}
		
		Step_End(3, "Next enter the screen name as 'Global activity mapping' in the module search field.", test, test1);

		Step_Start(4, "Click the global search option and enter the contract code as CTL and check the system retrieves and then click on the edit option.", test, test1);

		waitForElement(driver, contract_type_search_icon_Gam);
		click(driver, contract_type_search_icon_Gam);
		selectValue(driver, condition, contract_type_data);
		
		click(driver, show_button_Gam_Mod);
		waitForElement(driver, popup_Message_Yes_Button);
		click(driver, popup_Message_Yes_Button);
		
		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);
		
		Step_End(4, "Click the global search option and enter the contract code as CTL and check the system retrieves and then click on the edit option.", test, test1);

		Step_Start(5, "Select the required main-activity and then select the required newly added sub-activities and click on the Add option. Click the save option in the toolbar. Ensure that system validates as 'Global Activity Updated'. Click on the ok option.", test, test1);
	
		waitForElement(driver, act_code_textfield);
		sendKeys(driver, act_code_textfield, activity_code_data);
		
		waitForElement(driver, subActivity_Table_Row_GAM);
		click(driver, subActivity_Table_Row_GAM);
		
		String main_activity_data_checkbox = String.format(main_activity_to_map, main_activity_data);
		
		safeclick(driver, main_activity_data_checkbox);
		
		waitForElement(driver, plus_icon_Gam);
		safeclick(driver, plus_icon_Gam);
		
		scrollTop(driver);
		click1(driver, Save_button_toolBar);
		
		waitForElement(driver, popup_Message);
		String global_updated_msg_actual = getText(driver, popup_Message).trim();
		
		if(global_updated_msg_actual.equals(global_updated_msg.trim())) {
			
			System.out.println("Matched || Expected popup ->"+global_updated_msg+"||actual popup ->"+global_updated_msg_actual);
			Extent_pass(driver, "Matched || Expected popup ->"+global_updated_msg+"||actual popup ->"+global_updated_msg_actual, test, test1);
			
			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);
		}else {
			
			System.out.println("Matched || Expected popup ->"+global_updated_msg+"||actual popup ->"+global_updated_msg_actual);
			Extent_fail(driver, "Matched || Expected popup ->"+global_updated_msg+"||actual popup ->"+global_updated_msg_actual, test, test1);
			
		}
		
		Step_End(5, "Select the required main-activity and then select the required newly added sub-activities and click on the Add option. Click the save option in the toolbar. Ensure that system validates as 'Global Activity Updated'. Click on the ok option.", test, test1);

		Step_Start(6, "Next enter the screen name as 'Vendor contracts' in the module search field. Select the contract type as CTL.", test, test1);

	// Vendor Contracts
		
		moduleNavigate(driver, vendor_contract_module);
		
		waitForElement(driver, search_icon_contract_type_Vc);
		click(driver, search_icon_contract_type_Vc);
		selectValue(driver, condition, contract_type_data);
		
		
		Step_End(6, "Next enter the screen name as 'Vendor contracts' in the module search field. Select the contract type as CTL.", test, test1);

		Step_Start(7, "Enter the required vendor code, valid from, valid to, currency and click the show option.", test, test1);
	
		waitForElement(driver, vendor_code_search_icon_Vc);
		click(driver, vendor_code_search_icon_Vc);
		selectValue(driver, condition, vendor_code_data_Vc);
		
		if(datepicker.equalsIgnoreCase("yes")) {
			
			waitForElement(driver, valid_from_date_Vc);
			selectDatePicker(driver, valid_from_date_Vc, from_date_Vc);
			
		}
		
if(datepicker.equalsIgnoreCase("yes")) {
			
	waitForElement(driver, valid_To_date_Vc);
			selectDatePicker(driver, valid_To_date_Vc, To_date_Vc);
			
		}

	waitForElement(driver, currency_search_icon_vc);
	click(driver, currency_search_icon_vc);
	selectValue1(driver, condition, currency_data_vc);

	waitForElement(driver, show_btn_vc);
	click(driver, show_btn_vc);
	
		
		Step_End(7, "Enter the required vendor code, valid from, valid to, currency and click the show option.", test, test1);

		Step_Start(8, "System will pop up a confirmation message as 'Do you want to get activities from predictable activity behavior?' and click on No.", test, test1);
	
		waitForElement(driver, popup_Message_No_Button);
		click(driver, popup_Message_No_Button);
		
		Step_End(8, "System will pop up a confirmation message as 'Do you want to get activities from predictable activity behavior?' and click on No.", test, test1);

		Step_Start(9, "System will add the main activities in the AG grid.", test, test1);
	
	waitForElement(driver, vc_rows);
		
		List<WebElement> vc_rows_to_scroll = listOfElements(driver, vc_rows);
		
        Actions actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL).perform();
		
		for(WebElement vc_row_to_scroll:vc_rows_to_scroll) {
			
			String mainActivityName=vc_row_to_scroll.getText();
			 if (main_activity_data.contains(mainActivityName)) {
	             continue; // Skip this row
	         }
			
			 
			 // Scroll the row into view
			 
			 waitForElement(driver, vc_row_to_scroll);
			 
	         actions.moveToElement(vc_row_to_scroll).perform();
	         
	         // Click on the row
	         vc_row_to_scroll.click();
			
		}
		
        actions.keyUp(Keys.CONTROL).perform();
        
       
        
		Step_End(9, "System will add the main activities in the AG grid.", test, test1);

		Step_Start(10, "Select the required main activity and right click on it and select the Remove selected items option and click on Yes.", test, test1);
	
		 actions.contextClick().perform();
	        
	        click(driver, remove_Option_Vc);
	        
	        waitForElement(driver, popup_Message_Yes_Button);
	        click(driver, popup_Message_Yes_Button);
	        
	        
		
		Step_End(10, "Select the required main activity and right click on it and select the Remove selected items option and click on Yes.", test, test1);

		Step_Start(11, "Then select the required main activity and click on the Edit input fields option and select the required charge type, equipment type, equipment status, currency and send to disbursement.", test, test1);
		
		waitForElement(driver, edit_input_field_Vc);
		click(driver, edit_input_field_Vc);
		
		waitForElement(driver, vc_row_to_click);
		click(driver, vc_row_to_click);
		
		waitForElement(driver, equip_type_dd_label_Vc);
		click(driver, equip_type_dd_label_Vc);
		
		String equip_type_Vc = String.format(equip_type_options_Vc, equip_type_options_Vc_data);
		
		waitForElement(driver, equip_type_Vc);
		click(driver, equip_type_Vc);
		
		waitForElement(driver, eqp_sts_label_vc);
		click(driver, eqp_sts_label_vc);
		
		 String eqp_sts = String.format(equip_sts_Vc_option, equip_sts_data);
		 waitForElement(driver, eqp_sts);
		 click(driver, eqp_sts);
		
		waitForElement(driver, currency_dd_Vc);
		click(driver, currency_dd_Vc);
		
		String currency_vc = String.format(currency_dd_options,currency_data_vc );
		waitForElement(driver, currency_vc);
		click(driver, currency_vc);
		
		Step_End(11, "Then select the required main activity and click on the Edit input fields option and select the required charge type, equipment type, equipment status, currency and send to disbursement.", test, test1);

		Step_Start(12, "Right click on it and add the required activities and enter the amount for that activity.", test, test1);
		waitForElement(driver, vc_row_to_click);
		RightClick(driver, vc_row_to_click);
		
		waitForElement(driver, add_item_Vc);
		click(driver, add_item_Vc);
		
		selectValue1(driver, condition, activity_code_data);
		
		scrollTop(driver);
		waitForElement(driver, SaveButton_ToolBar);
		click(driver, SaveButton_ToolBar);
		
		waitForElement(driver, popup_Message);
		click(driver, popup_Message_Ok_Button);
		
		waitForElement(driver, contract_No_VC);
		String actual_Vendor_No=getAttribute(driver, contract_No_VC, "value");
		System.out.println("actual_Vendor_No : "+actual_Vendor_No);
		Extent_pass(driver, "actual_Vendor_No : "+actual_Vendor_No, test, test1);
		
		
		ResetProfile(driver);
// Vendor Contracts 
		
		moduleNavigate(driver, vendor_contract_module);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);
		
		waitForElement(driver, select_first);
		click(driver,select_first);
		selectByText(driver, select_first, globalSearchFilterOption2);
		waitForElement(driver, globalSearch_Condition_Dropdown1);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, dropdownCondition);
		
		click(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, actual_Vendor_No);
		
		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);
		
		waitForDisplay(driver, retrieved_Value_Select);
		click(driver, retrieved_Value_Select);
		
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		
		waitForElement(driver, accept_Button_VC);
		click(driver, accept_Button_VC);
		
		waitForDisplay(driver, popup_Message);
		String actual_Popup=getText(driver, popup_Message);
		if(actual_Popup.equals(wantToApprove_Popup)) {
			System.out.println("Matched || Expected Popup : "+wantToApprove_Popup+" || Actual Popup : "+actual_Popup);
			Extent_pass(driver, "Matched || Expected Popup : "+wantToApprove_Popup+" || Actual Popup : "+actual_Popup, test, test1);
			click(driver, popup_Message_Yes_Button);
		}
		else {
			System.out.println("Not Matched || Expected Popup : "+wantToApprove_Popup+" || Actual Popup : "+actual_Popup);
			Extent_fail(driver, "Not Matched || Expected Popup : "+wantToApprove_Popup+" || Actual Popup : "+actual_Popup, test, test1);
		}
		
//  Contract Mapping
		
		waitForElement(driver, port_Plus_Button_CM);
		click(driver, port_Plus_Button_CM);
		
		selectValue1(driver, condition, Port_Code);
		
		
		String select_Checkbox=String.format(terminal_Select_Checkbox_CM, Terminal_Code);
		waitForElement(driver, select_Checkbox);
		click(driver, select_Checkbox);
		
		waitForElement(driver, terminal_Select_Ok_Button_CM);
		click(driver, terminal_Select_Ok_Button_CM);
		
		waitForElement(driver, SaveButton_ToolBar);
		click(driver, SaveButton_ToolBar);
		
		waitForDisplay(driver, popup_Message);
		String actual_Popup_CM=getText(driver, popup_Message);
		if(actual_Popup_CM.equals(mappingSavedPopup)) {
			System.out.println("Matched || Expected Popup : "+mappingSavedPopup+" || Actual Popup : "+actual_Popup_CM);
			Extent_pass(driver, "Matched || Expected Popup : "+mappingSavedPopup+" || Actual Popup : "+actual_Popup_CM, test, test1);
			click(driver, popup_Message_Ok_Button);
		}
		else {
			System.out.println("Not Matched || Expected Popup : "+mappingSavedPopup+" || Actual Popup : "+actual_Popup_CM);
			Extent_fail(driver, "Not Matched || Expected Popup : "+mappingSavedPopup+" || Actual Popup : "+actual_Popup_CM, test, test1);
		}
		
		waitForElement(driver, port_Mapping_ID_Textfield_CM);
		String port_Mapping_ID=getAttribute(driver, port_Mapping_ID_Textfield_CM, "value");
		System.out.println("port_Mapping_ID : "+port_Mapping_ID);
		Extent_pass(driver, "port_Mapping_ID : "+port_Mapping_ID, test, test1);
		
		SwitchProfile(driver, AgencyUser);
		
//	CAR
		
moduleNavigate(driver, Cost_Activity_Report_Module);
		
		Step_End(2, "Enter the screen name as \"Cost Activity Report\" in module search field.", test, test1);
		Step_Start(3, "Select the required contract type as \"PTC\" by using Contract type dropdown", test, test1);

		waitForElement(driver, Contract_Type_Input_CAR);
		click(driver,Contract_Type_Input_CAR);
		
		String SelectContract=String.format(Select_Contract_Type_CAR, contract_type_data);
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
		selectValue(driver, condition, Service_Code);

		Step_End(5, "Click on the Service search button and select the required service code.", test, test1);
		Step_Start(6, "Click on the Vessel search button and select the required vessel code.", test, test1);

		waitForElement(driver, Vessel_Search_Btn_CAR);
		click(driver,Vessel_Search_Btn_CAR);
		selectValue(driver, condition, Vessel_Code);
		
		Step_End(6, "Click on the Vessel search button and select the required vessel code.", test, test1);
		Step_Start(7, "Click on the Port search button and select the required port code.", test, test1);

		waitForElement(driver, Port_Search_Btn_CAR);
		click(driver,Port_Search_Btn_CAR);
		selectValue(driver, condition, Port_Code);
		
		Step_End(7, "Click on the Port search button and select the required port code.", test, test1);
		Step_Start(8, "Click on the Terminal search button and select the required terminal code.", test, test1);

		waitForElement(driver, Terminal_Search_Btn_CAR);
		click(driver,Terminal_Search_Btn_CAR);
		selectValue(driver, condition, Terminal_Code);
		
		Step_End(8, "Click on the Terminal search button and select the required terminal code.", test, test1);
		Step_Start(9, "Click on the Arrival date search button and select the required date.", test, test1);

		waitForElement(driver, Arrival_Date_Search_Btn_CAR);
		click(driver,Arrival_Date_Search_Btn_CAR);
		selectValue1(driver, Arrival_Date_Condition, Arrival_Date_Value);
		
		Step_End(9, "Click on the Arrival date search button and select the required date.", test, test1);
		
		Step_Start(10, "Click on the Show button.", test, test1);
		
		waitForElement(driver, Show_Button_CAR);
		click(driver,Show_Button_CAR);
		
		waitForElement(driver, Arrival_Date_Input_CAR);
		String actual_Arr_Date=getAttribute(driver, Arrival_Date_Input_CAR, "value");
		System.out.println("actual_Arr_Date : "+actual_Arr_Date);
		
		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver,UnPredictable_Tab_CAR);
		
		waitForDisplay(driver, UnPredictable_Table_CAR);
		
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
		sendKeys(driver, Activity_Name_CAR, activity_desc_data);
		
		waitForElement(driver, mainActivityName_Unpred_CAR);
		String Main_Activity_Value=getText(driver, mainActivityName_Unpred_CAR);
		System.out.println("Main_Activity_Value :"+Main_Activity_Value);
		
//	Predictable Activity Behaviour
		Step_Start(17, "If the newly added activity needs to be mapped in the Predictable reporting tab, enter the screen name as 'Predictable activity behaviour' in the module search field.", test, test1);

		moduleNavigate(driver, Predictable_Activity_Module);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		Step_End(17, "If the newly added activity needs to be mapped in the Predictable reporting tab, enter the screen name as 'Predictable activity behaviour' in the module search field.", test, test1);

		Step_Start(18, "Click on the global search option and enter the required fields and click the search option. Next select the required details and click on the select option.", test, test1);

		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, Predictable_Select_Type);
		waitForElement(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Predictable_Select_Codition);
		waitForElement(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, template_No);
		
		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);

		waitForDisplay(driver, retrieved_Value_Select);
		if(isdisplayed(driver, retrieved_Value_Select)) {
		click(driver, retrieved_Value_Select);
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		Step_End(18, "Click on the global search option and enter the required fields and click the search option. Next select the required details and click on the select option.", test, test1);

		Step_Start(19, "Click on the edit option in the toolbar and map the required newly sub-activities under the mapped main-activity.", test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);
		
		Step_End(19, "Click on the edit option in the toolbar and map the required newly sub-activities under the mapped main-activity.", test, test1);

		
		}else {
		
		waitForElement(driver, contract_Type_Dropdown_PAB);
		click(driver,contract_Type_Dropdown_PAB);
		
		String SelectContract_PAB=String.format(DropDown_Select, contract_type_data);
		waitForElement(driver, SelectContract_PAB);
		click(driver,SelectContract_PAB);
				
		waitForElement(driver, fromDate_PAB);
		click(driver,fromDate_PAB);
		
		selectDatePicker(driver, fromDate_PAB, from_date_Vc);
		
		waitForElement(driver, toDate_PAB);
		click(driver,toDate_PAB);
		
		selectDatePicker(driver, toDate_PAB, To_date_Vc);
		
		waitForElement(driver, port_SearchButton_PAB);
		click(driver,port_SearchButton_PAB);
		selectValue(driver, condition_2, Port_Code);
		
		waitForElement(driver, terminal_SearchButton_PAB);
		click(driver,terminal_SearchButton_PAB);
		selectValue(driver, condition_2, Terminal_Code);

		waitForElement(driver, show_Button_PAB);
		click(driver,show_Button_PAB);
		}
		
		
		waitForElement(driver, Predictable_Activity_Table_PAB);
		
		String MainActivity_Name_Column=String.format(Activity_Name_PAB, Main_Activity_Value);

		if(isDisplayed(driver, MainActivity_Name_Column)) {
			System.out.println("Main Activity is present");
				click(driver, MainActivity_Name_Column);
			 	RightClick(driver, MainActivity_Name_Column);
				waitForElement(driver, Add_item_PAB);
				click(driver,Add_item_PAB);
				selectValue1(driver, condition_2, activity_code_data);
				
			
		}else {
			System.out.println("Main Activity is not present");
			Extent_fail(driver, "Main Activity is not present", test, test1);
		}

		Step_Start(20, "Click on the save option in the toolbar. System validates as 'Predictable activity behaviour updated'.", test, test1);
	
		scrollTop(driver);
		waitForElement(driver, Save_button_toolBar);
		click(driver,Save_button_toolBar);
	    
		waitForElement(driver, popup_Message);
		String PopupText_Act=getText(driver, popup_Message);
		
		if(PopupText_Act.equals(Popup_Text_Exp)) {
			System.out.println("Popup Matched  ||   Expected : "+Popup_Text_Exp+"   ||   Actual   : "+PopupText_Act);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+Popup_Text_Exp+"   ||   Actual   : "+PopupText_Act, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+Popup_Text_Exp+"   ||   Actual   : "+PopupText_Act);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Popup_Text_Exp+"   ||   Actual   : "+PopupText_Act, test, test1);
		}
		Step_End(20, "Click on the save option in the toolbar. System validates as 'Predictable activity behaviour updated'.", test, test1);

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver,popup_Message_Ok_Button);

//	CAR
		
		Step_Start(21, "Go to the CAR screen and click on the refresh option.", test, test1);

		waitForElement(driver, CAR_Module);
		click(driver,CAR_Module);
		
		waitForElement(driver, Refresh_Button_CAR);
		click(driver,Refresh_Button_CAR);
		
		Step_End(21, "Go to the CAR screen and click on the refresh option.", test, test1);

		Step_End(17, "Then go to Cost activity report and click refresh option. ", test, test1);
		
		Step_Start(18, "Ensure that mapped activty is shown in the predictable reporting tab.   ", test, test1);
		
		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		

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

		Step_Start(22, "Ensure that the mapped sub-activities are shown under the predictable reporting tab.", test, test1);
		waitForElement(driver, predictable_Table_Toolpanel_Car);
		click(driver,predictable_Table_Toolpanel_Car);
		
		waitForElement(driver, predictable_Table_Condition_Filter_CAR);
		click(driver,predictable_Table_Condition_Filter_CAR);

		waitForElement(driver, Activity_Name_CAR);
		sendKeys(driver, Activity_Name_CAR, activity_desc_data);
		
		
		String PredictableActivity_Column=String.format(predictable_SubActivity_Column_Ctl, activity_desc_data);
		String MainActivity_Column=String.format(predictable_MainActivity_Column_Ctl, Main_Activity_Value);
		
		waitForDisplay(driver, MainActivity_Column);
		if(isDisplayed(driver, PredictableActivity_Column)&&isDisplayed(driver, MainActivity_Column)) {
			System.out.println("Activity Added successfully in the Predicatble Activity Table");
			Extent_pass(driver, "Activity Added successfully in the Predicatble Activity Table", test, test1);
		}else {
			System.out.println("Activity not Added  in the Predicatble Activity Table");
			Extent_fail(driver, "Activity not Added  in the Predicatble Activity Table", test, test1);
		}
		waitForElement(driver, PredictableActivity_Column);
		click(driver, PredictableActivity_Column);
		
		Step_End(22, "Ensure that the mapped sub-activities are shown under the predictable reporting tab.", test, test1);

		Step_Start(23, "Click the save option in the toolbar and system validates as 'Container report activity saved'. Click the ok option.", test, test1);

		scrollTop(driver);
		waitForElement(driver, SaveButton_ToolBar);
		click(driver,SaveButton_ToolBar);

		waitForDisplay(driver, Message_Ok_Button_CAR);
		if(isdisplayed(driver, Message_Ok_Button_CAR)) {
			click(driver, Message_Ok_Button_CAR);
		}
		waitForElement(driver, popup_Message);
		String actualSavedPopup=getText(driver, popup_Message);

		if(CAR_Saved_Poupup.equals(actualSavedPopup)) {
			System.out.println("Popup Matched  ||   Expected : "+CAR_Saved_Poupup+"   ||   Actual   : "+actualSavedPopup);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+CAR_Saved_Poupup+"   ||   Actual   : "+actualSavedPopup, test, test1);
			click(driver, popup_Message_Ok_Button);

		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+CAR_Saved_Poupup+"   ||   Actual   : "+actualSavedPopup);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+CAR_Saved_Poupup+"   ||   Actual   : "+actualSavedPopup, test, test1);
		}
		Step_End(23, "Click the save option in the toolbar and system validates as 'Container report activity saved'. Click the ok option.", test, test1);

		Extent_completed(tc_Name, test, test1);

	
	
	
	}
}
