package LRP_Cost_Scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS022 extends Keywords {

	public void Cost_Activity_Report_TS022(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS022";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String User_Level_Security_Module = data.get("User_Level_Security_Module");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String Select_search_value = data.get("Select_search_value");
		String Condition = data.get("Condition");
		String CAR_No = data.get("CAR_No");
		String User_Condition = data.get("User_Condition");
		String Sub_Activity = data.get("Sub_Activity");
		String PrivilegeHeaders = data.get("PrivilegeHeaders");
		String Expected_Privileges = data.get("Expected_Privileges");

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

		Step_Start(1, "login to the application", test, test1);

		LRP_Login(driver, username, password);

		Step_End(1, "login to the application", test, test1);

		Step_Start(2, "Enter the screen name as 'User level security' in the module search field", test, test1);

		verifyMainMenu(driver);

		moduleNavigate(driver, User_Level_Security_Module);

		Step_End(2, "Enter the screen name as 'User level security' in the module search field", test, test1);

		Step_Start(3, "Click on the global search option.Enter the required username and click on the select option",
				test, test1);

		waitForElement(driver, ULS_UserSearch);
		click(driver, ULS_UserSearch);

		selectValue(driver, User_Condition, username);

		Step_End(3, "Click on the global search option.Enter the required username and click on the select option",
				test, test1);

		Step_Start(4, "Ensure that the given username gets retrieved. Click on the tool bar edit option", test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);

		Step_End(4, "Ensure that the given username gets retrieved. Click on the tool bar edit option", test, test1);

		Step_Start(5,
				"Enter the module name as cost activity report in search field of the second grid from the left hand side",
				test, test1);

		waitForElement(driver, Activity_Filter);
		sendKeys(driver, Activity_Filter, Sub_Activity);

		Step_End(5,
				"Enter the module name as cost activity report in search field of the second grid from the left hand side",
				test, test1);

		Step_Start(6,
				"Select the check box of cost activity report. Next check the Functional privilege whether the \"CAR Approve,CAR Reject Top and CAR Reject Bottom\" are added to the grid.If it is already added the respective Approve and Reject will be shown in the Cost Activity Report screen at Expense report-open expense tab,if it not added the respective  Approve and Reject will be shown in the Cost Activity Report screen at Expense report-open expense tab",
				test, test1);

		waitForElement(driver, CostActivity_Select);
		click(driver, CostActivity_Select);

		List<Map<String, String>> User_Tables = getTableData2(driver, Functional_privilege_Header,
				Functional_privilege_Body);

		List<String> privileges = new ArrayList<>();

		for (Map<String, String> row : User_Tables) {
			if (row.containsKey(PrivilegeHeaders)) {
				privileges.add(row.get(PrivilegeHeaders));
			}
		}

		System.out.println("privileges : " + privileges);

		List<String> ExpectedPrivilege = splitAndExpand(Expected_Privileges);

		boolean flag = true;

		for (String privilege : ExpectedPrivilege) {

			if (privileges.contains(privilege)) {

				System.out.println("The user has the '" + privilege + "' privilege");
				Extent_pass(driver, "The user has the '" + privilege + "' privilege", test, test1);
				flag = true;
			} else {
				System.out.println("The user has the '" + privilege + "' privilege");
				Extent_fail1(test, "The user has the '" + privilege + "' privilege");
				flag = false;
			}

		}

		Step_End(6,
				"Select the check box of cost activity report. Next check the Functional privilege whether the \"CAR Approve,CAR Reject Top and CAR Reject Bottom\" are added to the grid.If it is already added the respective Approve and Reject will be shown in the Cost Activity Report screen at Expense report-open expense tab,if it not added the respective  Approve and Reject will be shown in the Cost Activity Report screen at Expense report-open expense tab",
				test, test1);

		Step_Start(7, "Enter the screen name as Cost Activity Report in the module search field", test, test1);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(7, "Enter the screen name as Cost Activity Report in the module search field", test, test1);

		Step_Start(8, "Click on the global search option which is available in the tool bar", test, test1);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		Step_End(8, "Click on the global search option which is available in the tool bar", test, test1);

		Step_Start(9, "Check whether the system opens the search window", test, test1);

		if (isdisplayed(driver, type_Select1)) {

			System.out.println("New Search window got opened");
			Extent_pass(driver, "New Search window got opened", test, test1);
		} else {

			System.out.println("New Search window not got opened");
			Extent_fail(driver, "New Search window not got opened", test, test1);
		}

		Step_End(9, "Check whether the system opens the search window", test, test1);

		Step_Start(10, "Enter the required CAR No. in the CAR No search field", test, test1);

		waitForElement(driver, type_Select1);
		click(driver, type_Select1);
		selectByText(driver, type_Select1, Select_search_value);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

		Step_End(10, "Enter the required CAR No. in the CAR No search field", test, test1);

		Step_Start(11, "Then click on the search button", test, test1);

		click(driver, globalSearch_Frame_SearchButton);

		Step_End(11, "Then click on the search button", test, test1);

		Step_Start(12, "System will show the CAR No", test, test1);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		Step_End(12, "System will show the CAR No", test, test1);

		Step_Start(13, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

		waitInvisible(driver, SelectButton);

		Step_End(13, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		Step_Start(14, "Check whether the system will retrieve the required CAR", test, test1);

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

		Step_End(14, "Check whether the system will retrieve the required CAR", test, test1);

		Step_Start(15, "Click on the Expense report button", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		Step_End(15, "Click on the Expense report button", test, test1);

		Step_Start(16,
				"Check whether the Approve and Reject privilege shows based on the User level security mapping for the user",
				test, test1);

		waitForElement(driver, ExpenseReportTab);

		if (flag == true) {

			if (isdisplayed(driver, Accept_expense)) {

				System.out.println("Accept privilege is showing for user");
				Extent_pass(driver, "Accept privilege is showing for user", test, test1);
			} else {
				System.out.println("Accept privilege is not showing for user");
				Extent_fail(driver, "Accept privilege is not showing for user", test, test1);
			}

			if (isdisplayed(driver, Reject_expense)) {

				System.out.println("Reject privilege is showing for user");
				Extent_pass(driver, "Reject privilege is showing for user", test, test1);
			} else {
				System.out.println("Reject privilege is not showing for user");
				Extent_fail(driver, "Reject privilege is not showing for user", test, test1);
			}

		} else {

			if (!isdisplayed(driver, Accept_expense)) {

				System.out.println("Accept privilege is not showing for user");
				Extent_pass(driver, "Accept privilege is not showing for user", test, test1);

			} else {

				System.out.println("Accept privilege is showing for user");
				Extent_fail(driver, "Accept privilege is showing for user", test, test1);

			}

			if (!isdisplayed(driver, Reject_expense)) {

				System.out.println("Reject privilege is not showing for user");
				Extent_pass(driver, "Reject privilege is not showing for user", test, test1);

			} else {

				System.out.println("Reject privilege is showing for user");
				Extent_fail(driver, "Reject privilege is showing for user", test, test1);

			}
		}

		Step_End(16,
				"Check whether the Approve and Reject privilege shows based on the User level security mapping for the user",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
