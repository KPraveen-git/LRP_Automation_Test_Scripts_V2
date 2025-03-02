package LRP_Cost_Scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS050 extends Keywords {

	public void Cost_Activity_Report_TS050(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS050";
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
		String filtercolumns = data.get("filtercolumns");
		String FilterColumn = data.get("Predictable_column");
		String Quantity = data.get("Quantity");
		String Update_popup = data.get("Update_popup");

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

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

		Step_Start(6, "Then click on the search button", test, test1);

		Step_Start(7, "System will show the CAR No", test, test1);

		Step_Start(8, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		globalValueSearchWindow(driver, Condition, Select_search_value, CAR_No, "", "", "", "");

		Step_End(5, "Enter the CTL CAR No. in the CAR No search field", test, test1);

		Step_End(6, "Then click on the search button", test, test1);

		Step_End(7, "System will show the CAR No", test, test1);

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

		Step_End(8, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		Step_Start(9, "Click on the expense report option", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		Step_End(9, "Click on the expense report option", test, test1);

		Step_Start(10, "Click on the approved expense tab", test, test1);

		waitForElement(driver, ApprovedExpenses);
		click(driver, ApprovedExpenses);

		Step_End(10, "Click on the approved expense tab", test, test1);

		Step_Start(11, "Copy the head and contract No. of the approved activities. Click on the close option", test,
				test1);

		waitForElement(driver, Approved_Columns);
		click(driver, Approved_Columns);

		waitForDisplay(driver, Approved_Deselect);
		jsClick(driver, Approved_Deselect);

		List<String> filter_columns2 = splitAndExpand(filtercolumns);

		for (String columnname : filter_columns2) {

			waitForElement(driver, Approved_FilterInput);
			clear(driver, Approved_FilterInput);
			sendKeys(driver, Approved_FilterInput, columnname);

			waitForElement(driver, Approved_FilterInput);
			jsClick(driver, Approved_Deselect);
		}

		List<WebElement> AE_Head_field = driver
				.findElements(By.xpath("//div[@id='CRR_treeTableEXPDB']//div[@col-id='head' and @role='gridcell']"));

		List<WebElement> AE_ContractNo_field = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXPDB']//div[@col-id='contractNo' and @role='gridcell']"));

		List<String> AE_Head = new ArrayList<String>();
		List<String> AE_ContractNo = new ArrayList<String>();

		for (int i = 0; i < AE_Head_field.size(); i++) {

			String Head_value = AE_Head_field.get(i).getText();

			AE_Head.add(Head_value);

			String ContractNo_value = AE_ContractNo_field.get(i).getText();

			AE_ContractNo.add(ContractNo_value);

		}

		Step_End(11, "Copy the head and contract No. of the approved activities. Click on the close option", test,
				test1);

		waitForElement(driver, Expense_Close);
		click(driver, Expense_Close);

		Step_Start(18, "Click on the predictable activity reporting tab", test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);

		waitForElement(driver, Predictable_reporting);
		click(driver, Predictable_reporting);

		Step_End(18, "Click on the predictable activity reporting tab", test, test1);

		Step_Start(19,
				"Check the activities of the head with the copied head of the approved activities and go to the Qty column of the  activity and double click on it and change the values",
				test, test1);

		waitForElement(driver, Predictable_reporting_columns);
		click(driver, Predictable_reporting_columns);

		waitForDisplay(driver, PR_Deselect);
		jsClick(driver, PR_Deselect);

		List<String> Predictable_columns = splitAndExpand(FilterColumn);

		for (String columnname : Predictable_columns) {

			waitForElement(driver, PR_FilterInput);
			clear(driver, PR_FilterInput);
			sendKeys(driver, PR_FilterInput, columnname);

			jsClick(driver, PR_Deselect);

		}

		waitForElement(driver, Approved_Conditionfilter);
		click(driver, Approved_Conditionfilter);

		waitForElement(driver, Head_Filter);
		sendKeys(driver, Head_Filter, AE_Head.get(0));

		waitForElement(driver, ContractNo_filter);
		sendKeys(driver, ContractNo_filter, AE_ContractNo.get(0));

		waitForElement(driver, Predictable_Quantity);
		doubleClick(driver, Predictable_Quantity);

		waitForElement(driver, Predictable_Quantity);
		sendKeys(driver, Predictable_Quantity, Quantity);

		enter(driver);

		Step_End(19,
				"Check the activities of the head with the copied head of the approved activities and go to the Qty column of the  activity and double click on it and change the values",
				test, test1);

		Step_Start(20, "Click the save option in the toolbar", test, test1);

		waitForElement(driver, Save_button_toolBar);
		click(driver, Save_button_toolBar);

		Step_End(20, "Click the save option in the toolbar", test, test1);

		Step_Start(21, "System validates as Cost activity report Updated Click on the ok option", test, test1);

		waitForElement(driver, popup_Message);
		String SimulatorPopupmessage = getText(driver, popup_Message);

		if (SimulatorPopupmessage.equals(Update_popup)) {

			System.out.println("Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
					+ SimulatorPopupmessage);
			Extent_pass(driver, "Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
					+ SimulatorPopupmessage, test, test1);
		} else {

			System.out.println("Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
					+ SimulatorPopupmessage);
			Extent_fail(driver, "Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
					+ SimulatorPopupmessage, test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_End(21, "System validates as Cost activity report Updated Click on the ok option", test, test1);

		Step_Start(22,
				"Go to the predictable reporting tab and ensure that the quantity changed for activities the system shouldn't allow to change the quantities",
				test, test1);

		waitForElement(driver, Predictable_reporting);
		click(driver, Predictable_reporting);

		waitForElement(driver, Predictable_reporting_columns);
		click(driver, Predictable_reporting_columns);

		waitForDisplay(driver, PR_Deselect);
		jsClick(driver, PR_Deselect);

		for (String columnname : Predictable_columns) {

			waitForElement(driver, PR_FilterInput);
			clear(driver, PR_FilterInput);
			sendKeys(driver, PR_FilterInput, columnname);

			jsClick(driver, PR_Deselect);

		}

		waitForElement(driver, Approved_Conditionfilter);
		click(driver, Approved_Conditionfilter);

		waitForElement(driver, Head_Filter);
		sendKeys(driver, Head_Filter, AE_Head.get(0));

		waitForElement(driver, ContractNo_filter);
		sendKeys(driver, ContractNo_filter, AE_ContractNo.get(0));

		String recent_Qty = getText(driver, Predictable_Quantity);

		if (!recent_Qty.equals(Quantity)) {

			System.out
					.println("User should not able to enter the quantity for Approved expenses in the predictable Tab");
			Extent_pass(driver,
					"User should not able to enter the quantity for Approved expenses in the predictable Tab", test,
					test1);
		} else {
			System.out.println("User can able to enter the quantity for Approved expenses in the predictable Tab");
			Extent_fail(driver, "User can able to enter the quantity for Approved expenses in the predictable Tab",
					test, test1);
		}

		Step_End(22,
				"Go to the predictable reporting tab and ensure that the quantity changed for activities the system shouldn't allow to change the quantities",
				test, test1);

		Step_Start(23,
				"Retrieving the same car using global search option.Go to the predictable reporting tab and select the activities with the copied head of the activities and ensure that the quantities are not changed",
				test, test1);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		if (isdisplayed(driver, type_Select1)) {

			System.out.println("New Search window got opened");
			Extent_pass(driver, "New Search window got opened", test, test1);
		} else {

			System.out.println("New Search window not got opened");
			Extent_fail(driver, "New Search window not got opened", test, test1);
		}

		waitForElement(driver, type_Select1);
		click(driver, type_Select1);
		selectByText(driver, type_Select1, Select_search_value);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

		click(driver, globalSearch_Frame_SearchButton);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

		waitForElement(driver, Predictable_reporting);
		click(driver, Predictable_reporting);

		waitForElement(driver, Predictable_reporting_columns);
		click(driver, Predictable_reporting_columns);

		waitForDisplay(driver, PR_Deselect);
		jsClick(driver, PR_Deselect);

		for (String columnname : Predictable_columns) {

			waitForElement(driver, PR_FilterInput);
			clear(driver, PR_FilterInput);
			sendKeys(driver, PR_FilterInput, columnname);

			jsClick(driver, PR_Deselect);

		}

		waitForElement(driver, Approved_Conditionfilter);
		click(driver, Approved_Conditionfilter);

		waitForElement(driver, Head_Filter);
		sendKeys(driver, Head_Filter, AE_Head.get(0));

		waitForElement(driver, ContractNo_filter);
		sendKeys(driver, ContractNo_filter, AE_ContractNo.get(0));

		String Predictabler_Qty = getText(driver, Predictable_Quantity);

		if (!Predictabler_Qty.equals(Quantity)) {

			System.out
					.println("User should not able to enter the quantity for Approved expenses in the predictable Tab");
			Extent_pass(driver,
					"User should not able to enter the quantity for Approved expenses in the predictable Tab", test,
					test1);
		} else {
			System.out.println("User can able to enter the quantity for Approved expenses in the predictable Tab");
			Extent_fail(driver, "User can able to enter the quantity for Approved expenses in the predictable Tab",
					test, test1);
		}

		Step_End(23,
				"Retrieving the same car using global search option.Go to the predictable reporting tab and select the activities with the copied head of the activities and ensure that the quantities are not changed",
				test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);

		Step_Start(12, "Click the unpredictable activity reporting tab", test, test1);

		waitForElement(driver, UnpredictableTab);
		click(driver, UnpredictableTab);

		Step_End(12, "Click the unpredictable activity reporting tab", test, test1);

		Step_Start(13,
				"Check the activities of the head and contract no. with the copied head and contract no. of the approved activities and go to the Qty column of the activity and double click on it and change the values Click the save option in the toolbar",
				test, test1);

		waitForElement(driver, UnPredictable_reporting_columns);
		click(driver, UnPredictable_reporting_columns);

		waitForDisplay(driver, UPR_Deselect);
		jsClick(driver, UPR_Deselect);

		for (String columnname : Predictable_columns) {

			waitForElement(driver, UPR_FilterInput);
			clear(driver, UPR_FilterInput);
			sendKeys(driver, UPR_FilterInput, columnname);

			jsClick(driver, UPR_Deselect);
		}

		waitForElement(driver, UnPredictable_Filter);
		click(driver, UnPredictable_Filter);

		waitForElement(driver, Head_Filter);
		sendKeys(driver, Head_Filter, AE_Head.get(0));

		waitForElement(driver, ContractNo_filter);
		sendKeys(driver, ContractNo_filter, AE_ContractNo.get(0));

		if (isdisplayed(driver, Predictable_Quantity)) {

			waitForElement(driver, Predictable_Quantity);
			doubleClick(driver, Predictable_Quantity);

			waitForElement(driver, Predictable_Quantity);
			sendKeys(driver, Predictable_Quantity, Quantity);

			enter(driver);

			Step_End(13, "Click the save option in the toolbar", test, test1);

			Step_Start(14, "Click the save option in the toolbar", test, test1);

			waitForElement(driver, Save_button_toolBar);
			click(driver, Save_button_toolBar);

			Step_End(14, "Click the save option in the toolbar", test, test1);

			Step_Start(15, "System validates as Cost activity report Updated Click on the ok option", test, test1);

			waitForElement(driver, popup_Message);
			String Unpredictable = getText(driver, popup_Message);

			if (Unpredictable.equals(Update_popup)) {

				System.out.println("Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
						+ Unpredictable);
				Extent_pass(driver, "Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
						+ Unpredictable, test, test1);
			} else {

				System.out.println("Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
						+ Unpredictable);
				Extent_fail(driver, "Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
						+ Unpredictable, test, test1);
			}

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

			Step_End(15, "System validates as Cost activity report Updated Click on the ok option", test, test1);

			Step_Start(16,
					"Go to the unpredictable reporting tab and ensure that the quantity changed for activities the system shouldn't allow to change the quantities",
					test, test1);

			waitForElement(driver, UnpredictableTab);
			click(driver, UnpredictableTab);

			waitForElement(driver, UnPredictable_reporting_columns);
			click(driver, UnPredictable_reporting_columns);

			waitForDisplay(driver, UPR_Deselect);
			jsClick(driver, UPR_Deselect);

			for (String columnname : Predictable_columns) {

				waitForElement(driver, UPR_FilterInput);
				clear(driver, UPR_FilterInput);
				sendKeys(driver, UPR_FilterInput, columnname);

				enter(driver);

				wait(driver, "1");
			}

			waitForElement(driver, UnPredictable_Filter);
			click(driver, UnPredictable_Filter);

			waitForElement(driver, Head_Filter);
			sendKeys(driver, Head_Filter, AE_Head.get(0));

			waitForElement(driver, ContractNo_filter);
			sendKeys(driver, ContractNo_filter, AE_ContractNo.get(0));

			String recent_Qty2 = getText(driver, Predictable_Quantity);

			if (!recent_Qty2.equals(Quantity)) {

				System.out.println(
						"User should not able to enter the quantity for Approved expenses in the unpredictable Tab");
				Extent_pass(driver,
						"User should not able to enter the quantity for Approved expenses in the unpredictable Tab",
						test, test1);
			} else {
				System.out
						.println("User can able to enter the quantity for Approved expenses in the unpredictable Tab");
				Extent_fail(driver,
						"User can able to enter the quantity for Approved expenses in the unpredictable Tab", test,
						test1);
			}

			Step_End(16,
					"Go to the unpredictable reporting tab and ensure that the quantity changed for activities the system shouldn't allow to change the quantities",
					test, test1);

			Step_Start(17,
					"Retrieving the same car using global search option.Go to the unpredictable reporting tab and select the activities with the copied head of the activities and ensure that the quantities are not changed",
					test, test1);

			waitForElement(driver, SearchButton_Toolbar);
			click(driver, SearchButton_Toolbar);

			if (isdisplayed(driver, type_Select1)) {

				System.out.println("New Search window got opened");
				Extent_pass(driver, "New Search window got opened", test, test1);
			} else {

				System.out.println("New Search window not got opened");
				Extent_fail(driver, "New Search window not got opened", test, test1);
			}

			waitForElement(driver, type_Select1);
			click(driver, type_Select1);
			selectByText(driver, type_Select1, Select_search_value);
			click(driver, globalSearch_Condition_Dropdown1);
			selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
			clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

			click(driver, globalSearch_Frame_SearchButton);

			waitForElement(driver, BL_Number_select);
			click(driver, BL_Number_select);

			waitForElement(driver, SelectButton);
			click(driver, SelectButton);

			waitForElement(driver, UnpredictableTab);
			click(driver, UnpredictableTab);

			waitForElement(driver, UnPredictable_reporting_columns);
			click(driver, UnPredictable_reporting_columns);

			waitForDisplay(driver, UPR_Deselect);
			jsClick(driver, UPR_Deselect);

			for (String columnname : Predictable_columns) {

				waitForElement(driver, UPR_FilterInput);
				clear(driver, UPR_FilterInput);
				sendKeys(driver, UPR_FilterInput, columnname);

				enter(driver);

				wait(driver, "1");
			}

			waitForElement(driver, UnPredictable_Filter);
			click(driver, UnPredictable_Filter);

			waitForElement(driver, Head_Filter);
			sendKeys(driver, Head_Filter, AE_Head.get(0));

			waitForElement(driver, ContractNo_filter);
			sendKeys(driver, ContractNo_filter, AE_ContractNo.get(0));

			String Unpredictable_Qty2 = getText(driver, Predictable_Quantity);

			if (!Unpredictable_Qty2.equals(Quantity)) {

				System.out.println(
						"User should not able to enter the quantity for Approved expenses in the unpredictable Tab");
				Extent_pass(driver,
						"User should not able to enter the quantity for Approved expenses in the unpredictable Tab",
						test, test1);
			} else {
				System.out
						.println("User can able to enter the quantity for Approved expenses in the unpredictable Tab");
				Extent_fail(driver,
						"User can able to enter the quantity for Approved expenses in the unpredictable Tab", test,
						test1);
			}

		} else {

			Extent_pass(driver, "No approved expenses are showing in the Unpredictable reporting", test, test1);
			System.out.println("No approved expenses are showing in the Unpredictable reporting");
		}
		
		Step_End(17,
				"Retrieving the same car using global search option.Go to the unpredictable reporting tab and select the activities with the copied head of the activities and ensure that the quantities are not changed",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
