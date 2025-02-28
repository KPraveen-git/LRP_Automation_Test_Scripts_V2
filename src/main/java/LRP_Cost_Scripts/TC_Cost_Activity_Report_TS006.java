package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS006 extends Keywords {

	public void Cost_Activity_Report_TS006(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS006";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String Select_search_value = data.get("Select_search_value");
		String Condition = data.get("Condition");
		String CAR_No = data.get("CAR_No");
		String Contract_Used_Table = data.get("Contract_Used_Table");
		String Contract_Used_TableName = data.get("Contract_Used_TableName");
		String Contract_No = data.get("Contract_No");

		String givenContract = String.format(Select_Contract, Contract_No);

		Extent_Start(tc_Name, test, test1);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);

		navigateUrl(driver, url);

		LRP_Login(driver, username, password);

		Step_End(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);

		Step_Start(2, "Enter the screen name as 'Cost Activity Report' in module search field", test, test1);

		verifyMainMenu(driver);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(2, "Enter the screen name as 'Cost Activity Report' in module search field", test, test1);

		Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);

		Step_Start(4, "Check whether it opens a new search window", test, test1);

		if (isdisplayed(driver, type_Select1)) {

			System.out.println("New Search window got opened");
			Extent_pass(driver, "New Search window got opened", test, test1);
		} else {

			System.out.println("New Search window not got opened");
			Extent_fail(driver, "New Search window not got opened", test, test1);
		}

		Step_End(4, "Check whether it opens a new search window", test, test1);

		Step_Start(5, "Enter the CTL CAR No. in the CAR No search field", test, test1);

		waitForElement(driver, type_Select1);
		click(driver, type_Select1);
		selectByText(driver, type_Select1, Select_search_value);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

		Step_End(5, "Enter the CTL CAR No. in the CAR No search field", test, test1);

		Step_Start(6, "Then click on the search button", test, test1);

		click(driver, globalSearch_Frame_SearchButton);

		Step_End(6, "Then click on the search button", test, test1);

		Step_Start(7, "System will show the CAR No", test, test1);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		Step_End(7, "System will show the CAR No", test, test1);

		Step_Start(8, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

		Step_End(8, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		Step_Start(9, "System will retrieve the CAR", test, test1);

		waitForElement(driver, CAR_Input);
		String retrived_Number = getAttribute(driver, CAR_Input, "value");

		if (retrived_Number.equals(CAR_No)) {

			System.out.println("The given CAR No was retrived || Expected CAR No : " + CAR_No + " || Actual CAR No : "
					+ retrived_Number);
			Extent_pass(driver, "The given CAR No was retrived || Expected CAR No : " + CAR_No + " || Actual CAR No : "
					+ retrived_Number, test, test1);
		} else {
			System.out.println("The given CAR No was not retrived || Expected CAR No : " + CAR_No
					+ " || Actual CAR No : " + retrived_Number);
			Extent_fail(driver, "The given CAR No was not retrived || Expected CAR No : " + CAR_No
					+ " || Actual CAR No : " + retrived_Number, test, test1);
		}

		Step_End(9, "System will retrieve the CAR", test, test1);

		Step_Start(10, "Click on the Contracts used button", test, test1);

		waitForElement(driver, Contracts_Used_Btn_CAR);
		click(driver, Contracts_Used_Btn_CAR);

		Step_End(10, "Click on the Contracts used button", test, test1);

		Step_Start(11,
				"Check whether it shows the proper contract details along with its vendor and contract mapping details",
				test, test1);

		waitForElement(driver, Contract_Details_Header);

		List<Map<String, String>> contract_Table = getTableData(driver, Contract_Details_Header, Contract_Details_Body);

		List<String> required_headers = splitAndExpand(Contract_Used_Table);

		if (!contract_Table.isEmpty()) {

			TableDataForReport(driver, contract_Table, Contract_Used_TableName, required_headers);
		} else {

			Extent_fail(driver, "No data's are showing in the ", test, test1);
		}

		Step_End(11,
				"Check whether it shows the proper contract details along with its vendor and contract mapping details",
				test, test1);

		Step_Start(12, "Select any one of the row and right click on it", test, test1);

		waitForElement(driver, givenContract);
		click(driver, givenContract);
		RightClick(driver, givenContract);

		Step_End(12, "Select any one of the row and right click on it", test, test1);

		Step_Start(13, "System shows the options like Show Contract Mapping and Show Contract", test, test1);

		if (isdisplayed(driver, Show_Contract_Mapping)) {

			System.out.println("Show contract mapping option is displayed");
			Extent_pass(driver, "Show contract mapping option is displayed", test, test1);
		} else {
			System.out.println("Show contract mapping option is not displayed");
			Extent_fail(driver, "Show contract mapping option is not displayed", test, test1);
		}

		if (isdisplayed(driver, Show_Contract)) {

			System.out.println("Show contract option is displayed");
			Extent_pass(driver, "Show contract option is displayed", test, test1);
		} else {
			System.out.println("Show contract option is not displayed");
			Extent_fail(driver, "Show contract option is not displayed", test, test1);
		}

		Step_End(13, "System shows the options like Show Contract Mapping and Show Contract", test, test1);

		Step_Start(14,
				"Click on the Show Contract Mapping option and check whether the system navigates to contract mapping screen",
				test, test1);

		waitForElement(driver, Show_Contract_Mapping);
		click(driver, Show_Contract_Mapping);

		if (isdisplayed(driver, ContractMapping_Screen)) {

			System.out.println("System navigated to Contract Mapping Screen");
			Extent_pass(driver, "System navigated to Contract Mapping Screen", test, test1);
		} else {

			System.out.println("System not navigated to Contract Mapping Screen");
			Extent_fail(driver, "System not navigated to Contract Mapping Screen", test, test1);
		}

		String contract_number = getAttribute(driver, ContractNo_Input, "value");

		if (contract_number.equals(Contract_No)) {

			System.out.println("Contract Mapping details are showing for selected contract number");
			Extent_pass(driver, "Contract Mapping details are showing for selected contract number", test, test1);
		} else {

			System.out.println("Contract Mapping details are not showing for selected contract number");
			Extent_fail(driver, "Contract Mapping details are not showing for selected contract number", test, test1);

		}

		Step_End(14,
				"Click on the Show Contract Mapping option and check whether the system navigates to contract mapping screen",
				test, test1);

		Step_Start(15,
				"After that Click on Show contract option and check whether the system navigates to vendor contracts",
				test, test1);

		waitForElement(driver, CAR_Tab);
		click(driver, CAR_Tab);

		waitForElement(driver, Contracts_Used_Btn_CAR);
		click(driver, Contracts_Used_Btn_CAR);

		waitForElement(driver, givenContract);
		click(driver, givenContract);
		RightClick(driver, givenContract);

		waitForElement(driver, Show_Contract);
		click(driver, Show_Contract);

		if (isdisplayed(driver, VendorContracts_Screen)) {

			System.out.println("System navigated to Vendor Contracts screen");
			Extent_pass(driver, "System navigated to Vendor Contracts screen", test, test1);
		} else {

			System.out.println("System not navigated to Vendor Contracts screen");
			Extent_fail(driver, "System not navigated to Vendor Contracts screen", test, test1);
		}
		
		String Vendor_contract_number = getAttribute(driver, VendorContracts_Number, "value");
		
		if (Vendor_contract_number.equals(Contract_No)) {

			System.out.println("Contract Mapping details are showing for selected contract number");
			Extent_pass(driver, "Contract Mapping details are showing for selected contract number", test, test1);
		} else {

			System.out.println("Contract Mapping details are not showing for selected contract number");
			Extent_fail(driver, "Contract Mapping details are not showing for selected contract number", test, test1);
		}

		Step_End(15,
				"After that Click on Show contract option and check whether the system navigates to vendor contracts",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
