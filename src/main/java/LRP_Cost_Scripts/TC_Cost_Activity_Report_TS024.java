package LRP_Cost_Scripts;

import java.text.DecimalFormat;
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

public class TC_Cost_Activity_Report_TS024 extends Keywords {

	@SuppressWarnings("deprecation")
	public void Cost_Activity_Report_TS024(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS024";
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
		String FilterColumn1 = data.get("FilterColumn1");
		String FilterColumn2 = data.get("FilterColumn2");
		String FilterColumn3 = data.get("FilterColumn3");

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);

		LRP_Login(driver, username, password);

		Step_End(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);

		verifyMainMenu(driver);

		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

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

		Step_Start(7, "System will show the CAR No", test, test1);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		Step_End(7, "System will show the CAR No", test, test1);

		Step_Start(8, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		
		waitInvisible(driver, SelectButton);

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

		Step_Start(10, "Click on the Expense report button and check system opens a new tab", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		waitForElement(driver, ExpenseReportTab);

		Step_End(10, "Click on the Expense report button and check system opens a new tab", test, test1);

		Step_Start(11,
				"Next click the Show total summary option in open expense tab for the Draft,Submitted and Rejected records.If the activities are approved , then go to the  approved expense tab and click the show total summary option",
				test, test1);

		waitForElement(driver, Show_TotalCurrency);
		click(driver, Show_TotalCurrency);

		Step_End(11,
				"Next click the Show total summary option in open expense tab for the Draft,Submitted and Rejected records.If the activities are approved , then go to the  approved expense tab and click the show total summary option",
				test, test1);

		Step_Start(12, "Select the required split by option such as Currency,Vendor and Main activity", test, test1);

		List<WebElement> CurrencyList = driver
				.findElements(By.xpath("//tbody[contains(@id,'gridtotalsummary_data')]//tr"));

		int cur_count = 0;

		List<String> Currency_value = new ArrayList<>();

		List<String> Currency_Amount = new ArrayList<>();

		for (WebElement currencyvalues : CurrencyList) {

			waitForElement(driver, currencyvalues);

			WebElement currencygrid = driver.findElement(By.xpath(
					"(//tbody[contains(@id,'gridtotalsummary_data')]//tr[@data-ri='" + cur_count + "']//td)[1]"));

			WebElement currencyAmount = driver.findElement(By.xpath(
					"(//tbody[contains(@id,'gridtotalsummary_data')]//tr[@data-ri='" + cur_count + "']//input)[1]"));

			String Currency_Value = currencygrid.getText();
			String CurrencyAmount = currencyAmount.getAttribute("value").replace(",", "");

			Currency_value.add(Currency_Value);

			Currency_Amount.add(CurrencyAmount);

		}

		waitForElement(driver, Ventor);
		click(driver, Ventor);

		waitForElement(driver, Totalexpense_Currencyheader);

		List<String> Ventor_Currency = new ArrayList<>();

		List<String> Ventor_Amount = new ArrayList<>();

		List<WebElement> CurrencyList2 = driver
				.findElements(By.xpath("//tbody[contains(@id,'gridtotalsummary_data')]//tr"));

		for (WebElement currencyvalues : CurrencyList2) {

			waitForElement(driver, currencyvalues);

			WebElement currencygrid = driver.findElement(By.xpath(
					"(//tbody[contains(@id,'gridtotalsummary_data')]//tr[@data-ri='" + cur_count + "']//td)[1]"));

			WebElement currencyAmount = driver.findElement(By.xpath(
					"(//tbody[contains(@id,'gridtotalsummary_data')]//tr[@data-ri='" + cur_count + "']//input)[1]"));

			String Currency_Value = currencygrid.getText();
			String CurrencyAmount = currencyAmount.getAttribute("value").replace(",", "");

			Ventor_Currency.add(Currency_Value);

			Ventor_Amount.add(CurrencyAmount);

		}

		waitForElement(driver, MainActivity);
		click(driver, MainActivity);

		waitForElement(driver, Totalexpense_Currencyheader);

		List<String> Main_Currency = new ArrayList<>();

		List<String> Main_Amount = new ArrayList<>();

		List<WebElement> CurrencyList3 = driver
				.findElements(By.xpath("//tbody[contains(@id,'gridtotalsummary_data')]//tr"));

		for (WebElement currencyvalues : CurrencyList3) {

			waitForElement(driver, currencyvalues);

			WebElement currencygrid = driver.findElement(By.xpath(
					"(//tbody[contains(@id,'gridtotalsummary_data')]//tr[@data-ri='" + cur_count + "']//td)[1]"));

			WebElement currencyAmount = driver.findElement(By.xpath(
					"(//tbody[contains(@id,'gridtotalsummary_data')]//tr[@data-ri='" + cur_count + "']//input)[1]"));

			String Currency_Value = currencygrid.getText();
			String CurrencyAmount = currencyAmount.getAttribute("value").replace(",", "");

			Main_Currency.add(Currency_Value);

			Main_Amount.add(CurrencyAmount);

		}

		waitForElement(driver, TotalSummary_Ok);
		click(driver, TotalSummary_Ok);

		Step_End(12, "Select the required split by option such as Currency,Vendor and Main activity", test, test1);

		Step_Start(13,
				"Ensure that the total cost in expense report(open expense or approved expense) shows based on the AG grid which is available in Open expense and Approved expense tab",
				test, test1);

		waitForElement(driver, TotalExpenses_Column);
		click(driver, TotalExpenses_Column);

		waitForDisplay(driver, TotalExpenses_Deselect);
		jsClick(driver, TotalExpenses_Deselect);

		waitForElement(driver, TotalExpenses_input);
		clear(driver, TotalExpenses_input);
		sendKeys(driver, TotalExpenses_input, FilterColumn1);

		enter(driver);

		List<WebElement> openExpenses = driver
				.findElements(By.xpath("//div[@col-id='conCurrency' and @role='gridcell']"));

		int i = 1;

		double TotalAmount = 0;

		for (WebElement openexpense : openExpenses) {

			String expense_currency = openexpense.getText();

			if (Currency_value.contains(expense_currency)) {

				String total = driver
						.findElement(By.xpath("(//div[@col-id='conTotalCost' and @role='gridcell'])[" + i + "]"))
						.getText().replace(",", "");

				double totalamount = Double.parseDouble(total);

				TotalAmount = TotalAmount + totalamount;

			}

			i++;
		}

		DecimalFormat df = new DecimalFormat("0.00");
		String Expected_CurrencyAmount = df.format(TotalAmount);

		if (Currency_Amount.contains(Expected_CurrencyAmount)) {

			System.out.println("Total Cost is expense report is Shows based on the ag grid Currency");
			Extent_pass(driver, "Total Cost is expense report is Shows based on the ag grid Currency", test, test1);

		} else {

			System.out.println("Total Cost is not expense report is Shows based on the ag grid Currency");
			Extent_fail(driver, "Total Cost is not expense report is Shows based on the ag grid Currency", test, test1);

		}

		waitForElement(driver, TotalExpenses_input);
		clear(driver, TotalExpenses_input);

		waitForDisplay(driver, TotalExpenses_Deselect);
		jsClick(driver, TotalExpenses_Deselect);

		List<String> filtercolumns = splitAndExpand(FilterColumn2);

		for (String columnname : filtercolumns) {

			waitForElement(driver, TotalExpenses_input);
			clear(driver, TotalExpenses_input);
			sendKeys(driver, TotalExpenses_input, columnname);

			enter(driver);

			wait(driver, "1");
		}

		wait(driver, "1");

		List<WebElement> Vendor_openExpenses = driver
				.findElements(By.xpath("//div[@col-id='vendorCode' and @role='gridcell']"));

		int j = 1;

		double VendorTotalAmount = 0;

		for (WebElement openexpense : Vendor_openExpenses) {

			String expense_currency = openexpense.getText();

			if (Ventor_Currency.contains(expense_currency)) {

				String total = driver
						.findElement(By.xpath("(//div[@col-id='conTotalCost' and @role='gridcell'])[" + j + "]"))
						.getText().replace(",", "");

				double totalamount = Double.parseDouble(total);

				VendorTotalAmount = VendorTotalAmount + totalamount;

			}

			j++;
		}

		String formattedVendorTotal = df.format(VendorTotalAmount);

		if (Ventor_Amount.contains(formattedVendorTotal)) {

			System.out.println("Total Cost in expense report is Shows based on the ag grid vendor data");
			Extent_pass(driver, "Total Cost in expense report is Shows based on the ag grid vendor data", test, test1);

		} else {

			System.out.println("Total Cost in expense report is not Shows based on the ag grid vendor data");
			Extent_fail(driver, "Total Cost in expense report is not Shows based on the ag grid vendor data", test,
					test1);

		}

		waitForElement(driver, TotalExpenses_input);
		clear(driver, TotalExpenses_input);

		waitForDisplay(driver, TotalExpenses_Deselect);
		jsClick(driver, TotalExpenses_Deselect);

		List<String> filtercolumns3 = splitAndExpand(FilterColumn3);

		for (String columnname : filtercolumns3) {

			waitForElement(driver, TotalExpenses_input);
			clear(driver, TotalExpenses_input);
			sendKeys(driver, TotalExpenses_input, columnname);

			enter(driver);

			wait(driver, "1");
		}

		List<WebElement> Activity_openExpenses = driver
				.findElements(By.xpath("//div[@col-id='mainActName' and @role='gridcell']"));

		int k = 1;

		double ActivityTotalAmount = 0;

		for (WebElement openexpense : Activity_openExpenses) {

			String expense_currency = openexpense.getText();

			if (Main_Currency.contains(expense_currency)) {

				String total = driver
						.findElement(By.xpath("(//div[@col-id='conTotalCost' and @role='gridcell'])[" + k + "]"))
						.getText().replace(",", "");

				double totalamount = Double.parseDouble(total);

				ActivityTotalAmount = ActivityTotalAmount + totalamount;

			}

			k++;
		}

		String Expected_ActivityAmount = df.format(ActivityTotalAmount);

		if (Ventor_Amount.contains(Expected_ActivityAmount)) {

			System.out.println("Total Cost in expense report is not Shows based on the ag grid Activity data");
			Extent_pass(driver, "Total Cost in expense report is not Shows based on the ag grid Activity data", test,
					test1);

		} else {

			System.out.println("Total Cost in expense report is not Shows based on the ag grid Activity data");
			Extent_fail(driver, "Total Cost in expense report is not Shows based on the ag grid Activity data", test,
					test1);

		}

		Step_End(13,
				"Ensure that the total cost in expense report(open expense or approved expense) shows based on the AG grid which is available in Open expense and Approved expense tab",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
