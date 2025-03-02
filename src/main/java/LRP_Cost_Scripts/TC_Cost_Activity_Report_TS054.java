package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS054 extends Keywords {

	public void Cost_Activity_Report_TS054(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS054";
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

		Step_Start(9,
				"Ensure that the total approved cost is shown in screen and compare the cost with Sum of the Total cost which is available in the Cost as per USD column in Expense report Approved Expenses tab",
				test, test1);

		waitForElement(driver, Total_ApprovedCost);
		String total_cost = getText(driver, Total_ApprovedCost);

		String splitcost[] = total_cost.split(" ");
		String Displayed_totalCost = splitcost[0].replace(",", "");

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		waitForElement(driver, ApprovedExpenses);
		click(driver, ApprovedExpenses);

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

		List<WebElement> AE_Head_field = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXPDB']//div[@col-id='totalCostUSD' and @role='gridcell']"));

		double Converted_TotalCost = 0.00;

		for (WebElement element : AE_Head_field) {

			String cost = element.getText().replace(",", "");

			double onecost = Double.parseDouble(cost);

			Converted_TotalCost = Converted_TotalCost + onecost;

		}

		String Expected_TotalCost = String.valueOf(Converted_TotalCost);

		if (Expected_TotalCost.equals(Displayed_totalCost)) {

			System.out.println("System shows the total approved cost as per the expense Tab || Expected cost : "
					+ Expected_TotalCost + " Actual Cost: " + Displayed_totalCost);
			Extent_pass(driver, "System shows the total approved cost as per the expense Tab || Expected cost : "
					+ Expected_TotalCost + " Actual Cost: " + Displayed_totalCost, test, test1);

		} else {

			System.out.println("System shows the total approved cost not as per the expense Tab || Expected cost : "
					+ Expected_TotalCost + " Actual Cost: " + Displayed_totalCost);
			Extent_fail(driver, "System shows the total approved cost not as per the expense Tab || Expected cost : "
					+ Expected_TotalCost + " Actual Cost: " + Displayed_totalCost, test, test1);

		}
		
		Step_End(9,
				"Ensure that the total approved cost is shown in screen and compare the cost with Sum of the Total cost which is available in the Cost as per USD column in Expense report Approved Expenses tab",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
