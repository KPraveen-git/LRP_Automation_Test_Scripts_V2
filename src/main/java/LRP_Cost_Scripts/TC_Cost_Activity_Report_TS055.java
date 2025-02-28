package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS055 extends Keywords {

	public void Cost_Activity_Report_TS055(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS055";
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
		String FilterColumn = data.get("UnPredictable_column");
		String Quantity = data.get("Quantity");
		String Update_popup = data.get("Update_popup");
		String Activity_Name = data.get("Activity_Name");
		String MainActivityName = data.get("MainActivityName");
		String Approved_Column = data.get("Approved_Column");

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency",
				test, test1);

		LRP_Login(driver, username, password);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency",
				test, test1);

		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		verifyMainMenu(driver);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

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

		Step_Start(5, "Enter the required CAR No. in the CAR No search field", test, test1);

		waitForElement(driver, type_Select1);
		click(driver, type_Select1);
		selectByText(driver, type_Select1, Select_search_value);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

		Step_End(5, "Enter the required CAR No. in the CAR No search field", test, test1);

		Step_Start(6, "Then click on the search button", test, test1);

		click(driver, globalSearch_Frame_SearchButton);

		Step_End(6, "Then click on the search button", test, test1);

		Step_Start(7, "System will show the CAR No. and Click on the select button", test, test1);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		Step_End(7, "System will show the CAR No. and Click on the select button", test, test1);

		Step_Start(8, "System will retrieve the CAR", test, test1);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

		Step_End(8, "System will retrieve the CAR", test, test1);

		Step_Start(9, "Click on the Unpredictable Reporting tab", test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);

		waitForElement(driver, UnpredictableTab);
		click(driver, UnpredictableTab);

		Step_End(9, "Click on the Unpredictable Reporting tab", test, test1);

		Step_Start(10, "Select the required data in the grid by using the check box selection", test, test1);

		waitForElement(driver, UnPredictable_reporting_columns);
		click(driver, UnPredictable_reporting_columns);

		waitForDisplay(driver, UPR_Deselect);
		jsClick(driver, UPR_Deselect);

		List<String> UnPredictable_columns = splitAndExpand(FilterColumn);

		for (String columnname : UnPredictable_columns) {

			waitForElement(driver, UPR_FilterInput);
			clear(driver, UPR_FilterInput);
			sendKeys(driver, UPR_FilterInput, columnname);

			jsClick(driver, UPR_Deselect);
		}

		waitForElement(driver, UnPredictable_Filter);
		click(driver, UnPredictable_Filter);

		waitForElement(driver, MainActivityFilter);
		sendKeys(driver, MainActivityFilter, MainActivityName);

		waitForElement(driver, ActivityName_Filter);
		sendKeys(driver, ActivityName_Filter, Activity_Name);

		Step_End(10, "Select the required data in the grid by using the check box selection", test, test1);

		Step_Start(11,
				"After the selection enter the required quantity value for the selected records in the unpredictable reporting tab and ensure that the total cost is shown based on the multiplication of quantity given and its charge rate",
				test, test1);

		waitForElement(driver, UnPredictable_Quantity);
		doubleClick(driver, UnPredictable_Quantity);
		waitForElement(driver, UnPredictable_Quantity);
		Actionsendkeys(driver, UnPredictable_Quantity, Quantity);

		enter(driver);

		waitForElement(driver, UnPredictable_ChargeRate);
		click(driver, UnPredictable_ChargeRate);
		String UP_Chargerate = getText(driver, UnPredictable_ChargeRate).replace(",", "");

		waitForElement(driver, UnPredictable_TotalCost);
		String UP_TotalCost = getText(driver, UnPredictable_TotalCost).replace(",", "");

		double rate = Double.parseDouble(UP_Chargerate);

		double givenQty = Double.parseDouble(Quantity);

		double multiplyvalue = rate * givenQty;

		String ConvertedTotal = String.format("%.2f", multiplyvalue);

		if (ConvertedTotal.equals(UP_TotalCost)) {

			System.out.println("Total Cost was calculated as per the multiplication of Quantity and Amount");
			Extent_pass(driver, "Total Cost was calculated as per the multiplication of Quantity and Amount", test,
					test1);
			System.out.println("Expected Total cost : " + UP_TotalCost + " Actual Total cost : " + ConvertedTotal);
			Extent_pass(driver, "Expected Total cost : " + UP_TotalCost + " Actual Total cost : " + ConvertedTotal,
					test, test1);
		} else {
			System.out.println("Total Cost was not calculated as per the multiplication of Quantity and Amount");
			System.out.println("Expected Total cost : " + UP_TotalCost + " Actual Total cost : " + ConvertedTotal);
			Extent_fail(driver, "Total Cost was not calculated as per the multiplication of Quantity and Amount", test,
					test1);
			Extent_fail(driver, "Expected Total cost : " + UP_TotalCost + " Actual Total cost : " + ConvertedTotal,
					test, test1);
		}

		Step_End(11,
				"After the selection enter the required quantity value for the selected records in the unpredictable reporting tab and ensure that the total cost is shown based on the multiplication of quantity given and its charge rate",
				test, test1);

		Step_Start(12, "Click on the tool bar save button", test, test1);

		waitForElement(driver, Save_button_toolBar);
		click(driver, Save_button_toolBar);

		Step_End(12, "Click on the tool bar save button", test, test1);

		Step_Start(13,
				".Check whether the system shows the information message as Container Activity Report Saved Click on the ok option",
				test, test1);

		waitForElement(driver, popup_Message);
		String Unpredictable = getText(driver, popup_Message);

		if (Unpredictable.equals(Update_popup)) {

			System.out.println("Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
					+ Unpredictable);
			Extent_pass(driver,
					"Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : " + Unpredictable,
					test, test1);
		} else {

			System.out.println("Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : "
					+ Unpredictable);
			Extent_fail(driver,
					"Expected Updated popup is showing || Expected : " + Update_popup + " || Actual : " + Unpredictable,
					test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_Start(13,
				".Check whether the system shows the information message as Container Activity Report Saved Click on the ok option",
				test, test1);

		Step_Start(14, "Click on the expense report option", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		Step_End(14, "Click on the expense report option", test, test1);

		Step_Start(15,
				"Ensure that the same quantities with the same cost is shown for the activities based on the quantity and cost for the activities from the grid",
				test, test1);

		waitForElement(driver, ApprovedExpenses);
		click(driver, ApprovedExpenses);

		waitForElement(driver, Approved_Columns);
		click(driver, Approved_Columns);

		waitForDisplay(driver, Approved_Deselect);
		jsClick(driver, Approved_Deselect);

		List<String> filter_columns2 = splitAndExpand(Approved_Column);

		for (String columnname : filter_columns2) {

			waitForElement(driver, Approved_FilterInput);
			clear(driver, Approved_FilterInput);
			sendKeys(driver, Approved_FilterInput, columnname);

			waitForDisplay(driver, Approved_Deselect);
			jsClick(driver, Approved_Deselect);
		}

		waitForElement(driver, Approved_Filter);
		click(driver, Approved_Filter);

		waitForElement(driver, ActivityName_filter);
		sendKeys(driver, ActivityName_filter, Activity_Name);

		waitForElement(driver, Approved_quantity);
		String Extense_Qty = getText(driver, Approved_quantity);
		String Extense_totalcost = getText(driver, Approved_TotalCost);

		if (Extense_Qty.equals(Quantity)) {

			System.out.println("Changed quantity was not updated in the approved expenses tab || Expected : " + Quantity
					+ " || Actual : " + Extense_Qty);
			Extent_pass(driver, "Changed quantity was not updated in the approved expenses tab || Expected : "
					+ Quantity + " || Actual : " + Extense_Qty, test, test1);
		} else {
			System.out.println("Changed quantity was not updated in the approved expenses tab || Expected : " + Quantity
					+ " || Actual : " + Extense_Qty);
			Extent_fail(driver, "Changed quantity was not updated in the approved expenses tab || Expected : "
					+ Quantity + " || Actual : " + Extense_Qty, test, test1);

		}

		if (Extense_totalcost.equals(UP_TotalCost)) {

			System.out.println("Changed quantity was not updated in the approved expenses tab || Expected : "
					+ UP_TotalCost + " || Actual : " + Extense_totalcost);
			Extent_pass(driver, "Changed quantity was not updated in the approved expenses tab || Expected : "
					+ UP_TotalCost + " || Actual : " + Extense_totalcost, test, test1);
		} else {
			System.out.println("Changed quantity was not updated in the approved expenses tab || Expected : "
					+ UP_TotalCost + " || Actual : " + Extense_totalcost);
			Extent_fail(driver, "Changed quantity was not updated in the approved expenses tab || Expected : "
					+ UP_TotalCost + " || Actual : " + Extense_totalcost, test, test1);

		}

		Step_End(15,
				"Ensure that the same quantities with the same cost is shown for the activities based on the quantity and cost for the activities from the grid",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
