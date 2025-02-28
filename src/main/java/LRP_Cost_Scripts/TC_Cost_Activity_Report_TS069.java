package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS069 extends Keywords {

	public void Cost_Activity_Report_TS069(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS069";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String CAR_Retrieve_Type = data.get("CAR_Retrieve_Type");
		String CAR_Retrieve_Condition = data.get("CAR_Retrieve_Condition");
		String CAR_Number_Retrieve = data.get("CAR_Number_Retrieve");
		String more_options_menu_List = data.get("more_options_menu_List");
		String columns_to_filter = data.get("columns_to_filter");
		String load_confirm_text = data.get("load_confirm_text");
		String columns_value = data.get("columns_value");
		String operation_list_module = data.get("operation_list_module");
		String condition = data.get("condition");
		String columns_filter_opl = data.get("columns_filter_opl");
		String columns_value_opl = data.get("columns_value_opl");

		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select the required agency.",
				test, test1);

		LRP_Login(driver, username, password);
		verifyMainMenu(driver);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.",
				test, test1);

		Step_Start(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);

		Step_Start(3, "Click on the global search option which is available in the tool bar.", test, test1);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		Step_End(3, "Click on the global search option which is available in the tool bar.", test, test1);

		Step_Start(4, "Check whether it opens a new search window.", test, test1);

		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, CAR_Retrieve_Type);

		Step_End(4, "Check whether it opens a new search window.", test, test1);

		Step_Start(5, "Enter the required CAR No. in the CAR No search field.", test, test1);

		waitForElement(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, CAR_Retrieve_Condition);
		waitForElement(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, CAR_Number_Retrieve);

		Step_End(5, "Enter the required CAR No. in the CAR No search field.", test, test1);

		Step_Start(6, "Then click on the search button.", test, test1);

		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);

		Step_End(6, "Then click on the search button.", test, test1);

		Step_Start(7, "System will show the CAR No.", test, test1);

		waitForElement(driver, First_Row_select);
		click(driver, First_Row_select);
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

		Step_End(7, "System will show the CAR No.", test, test1);

		Step_Start(8, "Click on the click for more options above the grid.", test, test1);

		waitForElement(driver, more_options_Car);
		click(driver, more_options_Car);

		Step_End(8, "Click on the click for more options above the grid.", test, test1);

		Step_Start(9, "Select the operation list option.", test, test1);

		String more_Options_Select = String.format(more_options_menu_Car, more_options_menu_List);
		waitForElement(driver, more_Options_Select);
		click(driver, more_Options_Select);

		Step_End(9, "Select the operation list option.", test, test1);

		Step_Start(10, "Ensure that a new window gets opened.", test, test1);

		waitForElement(driver, load_discharge_window);
		if (isdisplayed(driver, load_discharge_window)) {

			System.out.println("load discharge window is opened");
			Extent_pass(driver, "load discharge window is opened", test, test1);

		} else {

			System.out.println("Total cost summary window is not opened");
			Extent_fail(driver, "Total cost summary window is not opened", test, test1);

		}

		Step_End(10, "Ensure that a new window gets opened.", test, test1);

		Step_Start(11, "Check whether the details of the containers used are shown.", test, test1);
		waitForElement(driver, load_window_sidebar_columns);
		click(driver, load_window_sidebar_columns);
		waitForElement(driver, load_window_select_all);
		jsClick(driver, load_window_select_all);

		List<String> ExpensiveTable_Headers = splitAndExpand(columns_to_filter);
		for (String FilterHeader : ExpensiveTable_Headers) {
			waitForElement(driver, load_window_search_input);
			clear(driver, load_window_search_input);
			waitForElement(driver, load_window_search_input);
			sendKeys(driver, load_window_search_input, FilterHeader);

			String checkbox = String.format(load_window_select_column, FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}

		waitForElement(driver, load_window_sidebar_columns);
		click(driver, load_window_sidebar_columns);

		waitForElement(driver, funnel_icon_load_window);
		click(driver, funnel_icon_load_window);

		waitForElement(driver, load_window_move_status_filter);
		click(driver, load_window_move_status_filter);
		sendKeys(driver, load_window_move_status_filter, load_confirm_text);

		waitForElement(driver, load_window_table);
		List<Map<String, String>> load_window_table_data = extractTableDataByColumnWithoutScroll(driver,
				load_window_table);
		List<String> column_to_fetch = splitAndExpand(columns_value, ",");
		List<List<String>> load_header = getValuesByHeaders(load_window_table_data, column_to_fetch);

		System.out.println("The container numbers and book number present are :" + load_header);
		System.out.println("size of load confirm in car module : " + load_header.size());

		waitForElement(driver, load_window_ok_btn);
		click(driver, load_window_ok_btn);

		Step_End(11, "Check whether the details of the containers used are shown.", test, test1);

		Step_Start(12, "Note the service, vessel, voyage and bound details from CAR.", test, test1);

		waitForElement(driver, service_textfld_Car);
		String service_car = getAttribute(driver, service_textfld_Car, "value");

		waitForElement(driver, vessel_textfld_Car);
		String vessel_car = getAttribute(driver, vessel_textfld_Car, "value");

		waitForElement(driver, port_textfld_Car);
		String port_car = getAttribute(driver, port_textfld_Car, "value");

		waitForElement(driver, terminal_textfld_Car);
		String terminal_car = getAttribute(driver, terminal_textfld_Car, "value");

		waitForElement(driver, voyage_textfld_Car);
		String voyage_car = getAttribute(driver, voyage_textfld_Car, "value");

		Step_End(12, "Note the service, vessel, voyage and bound details from CAR.", test, test1);

		Step_Start(13,
				"To check these details, enter the screen name as 'Operation list view' in the module search field.",
				test, test1);

		moduleNavigate(driver, operation_list_module);

		waitForDisplay(driver, NewButton_ToolBar);
		if (isdisplayed(driver, NewButton_ToolBar) && isElementAccessible(driver, NewButton_ToolBar)) {

			click(driver, NewButton_ToolBar);

		}

		Step_End(13,
				"To check these details, enter the screen name as 'Operation list view' in the module search field.",
				test, test1);

		Step_Start(14, "Give the service, vessel, voyage, bound, port and terminal details and click the load option.",
				test, test1);

		waitForElement(driver, service_search_OpL);
		click(driver, service_search_OpL);
		selectValue(driver, condition, service_car);

		waitForElement(driver, vessel_search_OpL);
		click(driver, vessel_search_OpL);
		selectValue(driver, condition, vessel_car);

		waitForElement(driver, voyage_search_OpL);
		click(driver, voyage_search_OpL);
		if (voyage_car.matches(".*\\d.*[a-zA-Z].*")) {
			String[] parts = voyage_car.split("(?<=\\d)(?=\\D)"); // Split after digits and before non-digits

			String numberPart = parts[0];
			String letterPart = parts[1];

			System.out.println("Number part: " + numberPart);
			System.out.println("Letter part: " + letterPart);
			selectValue(driver, condition, numberPart);
		} else {

			selectValue(driver, condition, voyage_car);

		}
		waitForElement(driver, port_search_OpL);
		click(driver, port_search_OpL);
		selectValue(driver, condition, port_car);

		waitForElement(driver, terminal_search_OpL);
		click(driver, terminal_search_OpL);
		selectValue(driver, "Contains", terminal_car);

		waitForElement(driver, load_btn_opl);
		click(driver, load_btn_opl);

		Step_End(14, "Give the service, vessel, voyage, bound, port and terminal details and click the load option.",
				test, test1);

		Step_Start(15,
				"Filter the required details(load confirmed and Discharge confirmed) and check whether the same container details are shown.",
				test, test1);

		waitForElement(driver, opl_sidebar_columns);
		click(driver, opl_sidebar_columns);
		waitForElement(driver, opl_select_all);
		jsClick(driver, opl_select_all);

		List<String> operation_list_headers = splitAndExpand(columns_filter_opl);
		for (String FilterHeader : operation_list_headers) {
			waitForElement(driver, opl_search_input);
			clear(driver, opl_search_input);
			waitForElement(driver, opl_search_input);
			sendKeys(driver, opl_search_input, FilterHeader);

			String checkbox = String.format(opl_select_column, FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}

		waitForElement(driver, opl_sidebar_columns);
		click(driver, opl_sidebar_columns);

		waitForElement(driver, funnel_icon_opl);
		click(driver, funnel_icon_opl);

		waitForElement(driver, operation_list_move_status_filter);
		click(driver, operation_list_move_status_filter);
		sendKeys(driver, operation_list_move_status_filter, load_confirm_text);

		List<Map<String, String>> opl_data_table = extractTableDataByColumnWithoutScroll(driver, opl_table);

		List<String> column_to_fetch_opl = splitAndExpand(columns_value_opl, ",");
		List<List<String>> opl_header = getValuesByHeaders(opl_data_table, column_to_fetch_opl);

		System.out.println("container number and book number in operation list are :" + opl_header);
		System.out.println("size of load confirm in opl module : " + opl_header.size());

		compareListHeaders(driver, opl_header, load_header);

		Step_End(15,
				"Filter the required details(load confirmed and Discharge confirmed) and check whether the same container details are shown.",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
