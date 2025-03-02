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

public class TC_Cost_Activity_Report_TS049 extends Keywords {

	public void Cost_Activity_Report_TS049(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS049";
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
		String VendorColumn = data.get("VendorColumn");

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

		Step_Start(10, "Check whether the checkbox is selected", test, test1);

		waitForElement(driver, TotalExpenses_Column);
		click(driver, TotalExpenses_Column);

		waitForDisplay(driver, TotalExpenses_Deselect);
		jsClick(driver, TotalExpenses_Deselect);

		List<String> filter_columns = splitAndExpand(filtercolumns);

		for (String columnname : filter_columns) {

			waitForElement(driver, TotalExpenses_input);
			clear(driver, TotalExpenses_input);
			sendKeys(driver, TotalExpenses_input, columnname);

			waitForDisplay(driver, TotalExpenses_Deselect);
			jsClick(driver, TotalExpenses_Deselect);
		}

		List<WebElement> OE_EqpType_field = driver.findElements(
				By.xpath("//div[@id='CRR_jTabbedPaneExpenses']//div[@col-id='eqptype' and @role='gridcell']"));

		List<WebElement> OE_Head_field = driver.findElements(
				By.xpath("//div[@id='CRR_jTabbedPaneExpenses']//div[@col-id='head' and @role='gridcell']"));

		List<WebElement> OE_ContractNo_field = driver.findElements(
				By.xpath("//div[@id='CRR_jTabbedPaneExpenses']//div[@col-id='contractNo' and @role='gridcell']"));

		List<WebElement> OE_VersionNO_field = driver.findElements(
				By.xpath("//div[@id='CRR_jTabbedPaneExpenses']//div[@col-id='versionNo' and @role='gridcell']"));

		List<String> OE_EqpType = new ArrayList<String>();
		List<String> OE_Head = new ArrayList<String>();
		List<String> OE_ContractNo = new ArrayList<String>();
		List<String> OE_VersionNO = new ArrayList<String>();
		List<String> OE_Checbox = new ArrayList<String>();

		for (int i = 0; i < OE_Head_field.size(); i++) {

			String EqpType_value = OE_EqpType_field.get(i).getText();

			OE_EqpType.add(EqpType_value);

			String Head_value = OE_Head_field.get(i).getText();

			OE_Head.add(Head_value);

			String ContractNo_value = OE_ContractNo_field.get(i).getText();

			OE_ContractNo.add(ContractNo_value);

			String VersionNo_value = OE_VersionNO_field.get(i).getText();

			OE_VersionNO.add(VersionNo_value);

			try {

				String checkedelement = String.format(CARChecked_Verify, (i+1));

				if (isdisplayed(driver, checkedelement)) {
					OE_Checbox.add("Yes");
				} else {
					OE_Checbox.add("No");
				}
			} catch (Exception e) {
				OE_Checbox.add("No");
			}

		}

		Step_End(10, "Check whether the checkbox is selected", test, test1);

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

			waitForDisplay(driver, Approved_Deselect);
			jsClick(driver, Approved_Deselect);
		}

		List<WebElement> AE_EqpType_field = driver
				.findElements(By.xpath("//div[@id='CRR_treeTableEXPDB']//div[@col-id='eqptype' and @role='gridcell']"));

		List<WebElement> AE_Head_field = driver
				.findElements(By.xpath("//div[@id='CRR_treeTableEXPDB']//div[@col-id='head' and @role='gridcell']"));

		List<WebElement> AE_ContractNo_field = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXPDB']//div[@col-id='contractNo' and @role='gridcell']"));

		List<WebElement> AE_VersionNO_field = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXPDB']//div[@col-id='versionNo' and @role='gridcell']"));

		List<String> AE_EqpType = new ArrayList<String>();
		List<String> AE_Head = new ArrayList<String>();
		List<String> AE_ContractNo = new ArrayList<String>();
		List<String> AE_VersionNO = new ArrayList<String>();
		List<String> AE_Checbox = new ArrayList<String>();

		for (int i = 0; i < AE_Head_field.size(); i++) {

			String EqpType_value = AE_EqpType_field.get(i).getText();

			AE_EqpType.add(EqpType_value);

			String Head_value = AE_Head_field.get(i).getText();

			AE_Head.add(Head_value);

			String ContractNo_value = AE_ContractNo_field.get(i).getText();

			AE_ContractNo.add(ContractNo_value);

			String VersionNo_value = AE_VersionNO_field.get(i).getText();

			AE_VersionNO.add(VersionNo_value);

			try {

				String checkedelement = String.format(CARChecked_Verify, (i+1));

				if (isdisplayed(driver, checkedelement)) {
					AE_Checbox.add("Yes");
				} else {
					AE_Checbox.add("No");
				}
			} catch (Exception e) {
				AE_Checbox.add("No");
			}

		}

		waitForElement(driver, Expense_Close);
		click(driver, Expense_Close);

		for (int i = 0; i < AE_Head_field.size(); i++) {

			Step_Start(11,
					"If it is selected, copy the contract number,version,equipment type and Head.Then enter the screen name as \"Vendor contract\" in the module search field",
					test, test1);

			Step_Start(12,
					"If it is not selected also, copy the contract number,version,equipment type and Head and enter the screen name as \"Vendor contract\" in the module search field",
					test, test1);

			waitForElement(driver, Contract_Used);
			click(driver, Contract_Used);

			String Contract = String.format(Select_Contract, AE_ContractNo.get(i));

			Step_End(11,
					"If it is selected, copy the contract number,version,equipment type and Head.Then enter the screen name as \"Vendor contract\" in the module search field",
					test, test1);

			Step_End(12,
					"If it is not selected also, copy the contract number,version,equipment type and Head and enter the screen name as \"Vendor contract\" in the module search field",
					test, test1);

			Step_Start(13, "Right click on the selected Contract No and click on the Show Contract option", test,
					test1);

			waitForElement(driver, Contract);
			click(driver, Contract);
			RightClick(driver, Contract);

			waitForElement(driver, Show_Contract);
			click(driver, Show_Contract);

			waitForElement(driver, Vendor_Contracts);

			Step_End(13, "Right click on the selected Contract No and click on the Show Contract option", test, test1);

			Step_Start(14,
					"System retrieves the contract.Then go to the send to disbursement column in the grid and check whether it is No",
					test, test1);

			waitForElement(driver, Vendor_Columns);
			click(driver, Vendor_Columns);

			waitForDisplay(driver, Vendor_Columns_deselect);
			jsClick(driver, Vendor_Columns_deselect);

			List<String> Vendorfiltercolumns = splitAndExpand(VendorColumn);

			for (String columnname : Vendorfiltercolumns) {

				waitForElement(driver, Vendor_Columns_input);
				click(driver, Vendor_Columns_input);
				clear(driver, Vendor_Columns_input);
				sendKeys(driver, Vendor_Columns_input, columnname);

				wait(driver, "1");

				waitForDisplay(driver, Vendor_Columns_deselect);
				jsClick(driver, Vendor_Columns_deselect);
			}

			waitForElement(driver, Vendor_Filter);
			click(driver, Vendor_Filter);

			waitForElement(driver, Head_Filter);
			sendKeys(driver, Head_Filter, AE_Head.get(i));

			waitForElement(driver, Disbursement_Status);
			String status = getText(driver, Disbursement_Status);

			if (status.equals(AE_Checbox.get(i))) {
				System.out.println(
						"Approved expenses disbursement status is showing as per the Vendor Contracts || Expected Status : "
								+ status + " || Actual status : " + AE_Checbox.get(i));
				Extent_pass(driver,
						"Approved expenses disbursement status is showing as per the Vendor Contracts || Expected Status : "
								+ status + " || Actual status : " + AE_Checbox.get(i),
						test, test1);
			} else {
				System.out.println(
						"Approved expenses disbursement status is not showing as per the Vendor Contracts || Expected Status : "
								+ status + " || Actual status : " + AE_Checbox.get(i));
				Extent_fail(driver,
						"Approved expenses disbursement status is not showing as per the Vendor Contracts || Expected Status : "
								+ status + " || Actual status : " + AE_Checbox.get(i),
						test, test1);

			}

			waitForElement(driver, Close_Tab2);
			click(driver, Close_Tab2);

			waitForElement(driver, CAR_Tab);
			click(driver, CAR_Tab);

			Step_End(14,
					"System retrieves the contract.Then go to the send to disbursement column in the grid and check whether it is No",
					test, test1);

		}

		for (int i = 0; i < OE_Head_field.size(); i++) {

			Step_Start(14,
					"System retrieves the contract.Then go to the send to disbursement column in the grid and check whether it is No",
					test, test1);

			waitForElement(driver, Contract_Used);
			click(driver, Contract_Used);

			String Contract = String.format(Select_Contract, OE_ContractNo.get(i));

			waitForElement(driver, Contract);
			click(driver, Contract);
			RightClick(driver, Contract);

			waitForElement(driver, Show_Contract);
			click(driver, Show_Contract);

			waitForElement(driver, Vendor_Contracts);

			waitForElement(driver, Vendor_Columns);
			click(driver, Vendor_Columns);

			waitForDisplay(driver, Vendor_Columns_deselect);
			jsClick(driver, Vendor_Columns_deselect);

			List<String> Vendorfiltercolumns = splitAndExpand(VendorColumn);

			for (String columnname : Vendorfiltercolumns) {

				waitForElement(driver, Vendor_Columns_input);
				click(driver, Vendor_Columns_input);
				clear(driver, Vendor_Columns_input);
				sendKeys(driver, Vendor_Columns_input, columnname);

				wait(driver, "1");

				waitForDisplay(driver, Vendor_Columns_deselect);
				jsClick(driver, Vendor_Columns_deselect);
			}

			waitForElement(driver, Vendor_Filter);
			click(driver, Vendor_Filter);

			waitForElement(driver, Head_Filter);
			sendKeys(driver, Head_Filter, AE_Head.get(i));

			waitForElement(driver, Disbursement_Status);
			String status = getText(driver, Disbursement_Status);

			if (status.equals(AE_Checbox.get(i))) {
				System.out.println(
						"Open expenses disbursement status is showing as per the Vendor Contracts || Expected Status : "
								+ status + " || Actual status : " + AE_Checbox.get(i));
				Extent_pass(driver,
						"Open expenses disbursement status is showing as per the Vendor Contracts || Expected Status : "
								+ status + " || Actual status : " + AE_Checbox.get(i),
						test, test1);
			} else {
				System.out.println(
						"Open expenses disbursement status is not showing as per the Vendor Contracts || Expected Status : "
								+ status + " || Actual status : " + AE_Checbox.get(i));
				Extent_fail(driver,
						"Open expenses disbursement status is not showing as per the Vendor Contracts || Expected Status : "
								+ status + " || Actual status : " + AE_Checbox.get(i),
						test, test1);

			}

			waitForElement(driver, Close_Tab2);
			click(driver, Close_Tab2);

			waitForElement(driver, CAR_Tab);
			click(driver, CAR_Tab);

			Step_End(14,
					"System retrieves the contract.Then go to the send to disbursement column in the grid and check whether it is No",
					test, test1);

		}

		Extent_completed(tc_Name, test, test1);

	}

}
