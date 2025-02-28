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

public class TC_Cost_Activity_Report_TS025 extends Keywords {

	public void Cost_Activity_Report_TS025(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS025";
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
		String Service_Tax_Module = data.get("Service_Tax_Module");
		String Condition2 = data.get("Condition2");
		String TypeOFTax_Option = data.get("TypeOFTax_Option");
		String ChargeType_Option = data.get("ChargeType_Option");
		String PercentageValue = data.get("PercentageValue");
		String Activity = data.get("Activity");
		String filtercolumns = data.get("filtercolumns");
		String ExpectedpopupMessage = data.get("ExpectedpopupMessage");
		String DeleteCondition = data.get("DeleteCondition");
		String TaxDetailsColum = data.get("TaxDetailsColum");

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

		String contractType = getText(driver, Contract_type);

		waitForElement(driver, Arrival_Date);
		String Arrival_Date_value = getAttribute(driver, Arrival_Date, "value");

		waitForElement(driver, Port_Input);
		String portname = getAttribute(driver, Port_Input, "value");

		waitForElement(driver, Terminal_Input);
		String TerminalName = getAttribute(driver, Terminal_Input, "value");

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		Step_End(10, "Click on the Expense report button and check system opens a new tab", test, test1);

		Step_Start(11,
				"Check whether the Tax details column available in the AG Grid. This will not be updated if service tax is not created",
				test, test1);

		waitForElement(driver, TotalExpenses_Column);
		click(driver, TotalExpenses_Column);

		waitForElement(driver, TotalExpenses_input);
		jsClick(driver, TotalExpenses_Deselect);

		waitForElement(driver, TotalExpenses_input);
		clear(driver, TotalExpenses_input);
		sendKeys(driver, TotalExpenses_input, TaxDetailsColum);

		if (!isdisplayed(driver, OpenExpensefilter1)) {

			System.out.println("When the serice tax is not created tax details are not showing in the AG Grid");
			Extent_pass(driver, "When the serice tax is not created tax details are not showing in the AG Grid", test,
					test1);
		} else {

			System.out.println("When the serice tax is not created tax details are not showing in the AG Grid");
			Extent_fail(driver, "When the serice tax is not created tax details are not showing in the AG Grid", test,
					test1);

		}

		waitForElement(driver, Expense_Close);
		click(driver, Expense_Close);

		Step_End(11,
				"Check whether the Tax details column available in the AG Grid. This will not be updated if service tax is not created",
				test, test1);

		Step_Start(12, "Next enter the screen name as Service tax in the module search field", test, test1);

		moduleNavigate(driver, Service_Tax_Module);

		Step_End(12, "Next enter the screen name as Service tax in the module search field", test, test1);

		Step_Start(13,
				"Select the required type(Service tax/GST),contract type, valid from, valid to, type, port ,terminal, contract number or vendor.",
				test, test1);

		waitForElement(driver, Type_Search);
		click(driver, Type_Search);

		selectValue(driver, Condition2, contractType);

		String Validfrom = startdate(Arrival_Date_value);

		String validto = Enddate(Arrival_Date_value);

		waitForElement(driver, TaxDate);
		selectDatePicker(driver, TaxDate, Validfrom);

		waitForElement(driver, Tax_ValidTo);
		selectDatePicker(driver, Tax_ValidTo, validto);

		waitForElement(driver, Tax_Port_Search);
		click(driver, Tax_Port_Search);

		selectValue(driver, Condition2, portname);

		if (isdisplayed(driver, Tax_Terminal_Search) && isElementEnabled(driver, Tax_Terminal_Search)) {

			waitForElement(driver, Tax_Terminal_Search);
			click(driver, Tax_Terminal_Search);

			selectValue(driver, Condition2, TerminalName);

		}

		Step_End(13,
				"Select the required type(Service tax/GST),contract type, valid from, valid to, type, port ,terminal, contract number or vendor.",
				test, test1);

		Step_Start(14,
				"Then click the show option.Records will be shown in the Ag grid.Select a record and right click it and select the create service tax option",
				test, test1);

		waitForElement(driver, Tax_Show);
		click(driver, Tax_Show);

		waitForElement(driver, ServiceTax_Count);
		String totalcount = getText(driver, ServiceTax_Count);

		boolean flag = true;

		for (int i = 0; i < Integer.parseInt(totalcount); i++) {

			String gridcolumn = String.format(ServiceTax_Grid, i);

			waitForElement(driver, gridcolumn);
			click(driver, gridcolumn);
			RightClick(driver, gridcolumn);

			waitForElement(driver, CreateTax);
			click(driver, CreateTax);

			if (isdisplayed(driver, popup_Message)) {

				String popupmessage = getText(driver, popup_Message);

				String activityCode = getText(driver, gridcolumn);

				System.out.println("Unable to create Service tax for the selected activity" + activityCode
						+ " and the popup message is " + popupmessage);
				Extent_call(test, test1, "Unable to create Service tax for the selected activity" + activityCode
						+ " and the popup message is " + popupmessage);

				waitForElement(driver, popup_Message_Ok_Button);
				click(driver, popup_Message_Ok_Button);

				continue;
			} else {

				Step_Start(15,
						"Then select the type of tax,charge type and give the values in percentage column and select the activity/port code",
						test, test1);

				waitForElement(driver, Tax_Show);
				jsClick(driver, TypeOfTax);

				String TypeofTax_Option = String.format(Select_TypeOfTax, TypeOFTax_Option);

				waitForElement(driver, TypeofTax_Option);
				click(driver, TypeofTax_Option);

				waitForElement(driver, Tax_Show);
				jsClick(driver, ChargeType);

				String ChargeTypes_Option = String.format(Select_TypeOfTax, ChargeType_Option);

				waitForElement(driver, ChargeTypes_Option);
				click(driver, ChargeTypes_Option);

				if (ChargeType_Option.equals("Percentage")) {

					waitForElement(driver, Tax_Show);
					jsClick(driver, PercentageInputField);

					sendKeysUsingActions(driver, PercentageInputField, PercentageValue);

				}

				waitForElement(driver, Tax_Show);
				jsClick(driver, Activity_Dropdown_click);

				waitForElement(driver, Tax_Show);

				wait(driver, "2");
				jsClick(driver, Activity_Dropdown);

				String ActivityOption = String.format(Select_TypeOfTax, Activity);

				waitForElement(driver, ActivityOption);
				click(driver, ActivityOption);

				waitForElement(driver, Tax_Show);
				jsClick(driver, TypeOfTax);

				Step_End(15,
						"Then select the type of tax,charge type and give the values in percentage column and select the activity/port code",
						test, test1);

				Step_Start(16, "Then click the apply option", test, test1);

				waitForElement(driver, ApplyTax);
				click(driver, ApplyTax);

				Step_End(16, "Then click the apply option", test, test1);

				waitForElement(driver, gridcolumn);
				RightClick(driver, gridcolumn);

				waitForElement(driver, CopyTaxDetail);
				click(driver, CopyTaxDetail);

				flag = true;

			}

			if (flag == true) {

				for (int j = i + 1; j < Integer.parseInt(totalcount); j++) {

					String gridcolumn2 = String.format(ServiceTax_Grid, j);

					mouseOverToElement(driver, gridcolumn2);

					waitForElement(driver, gridcolumn2);
					click(driver, gridcolumn2);
					RightClick(driver, gridcolumn2);

					waitForElement(driver, PasteTaxDetail);
					click(driver, PasteTaxDetail);

					if (isdisplayed(driver, popup_Message)) {

						waitForElement(driver, popup_Message_Ok_Button);
						click(driver, popup_Message_Ok_Button);

					}
				}

				break;

			}

		}

		Step_Start(17,
				"Click on the save option in the toolbar and system validates as Service tax saved Click ok option.Ensure that service tax number is generated",
				test, test1);

		waitForElement(driver, Save_button_toolBar);
		click(driver, Save_button_toolBar);

		waitForElement(driver, popup_Message);
		String savedpopupMessage = getText(driver, popup_Message);

		if (savedpopupMessage.equals(ExpectedpopupMessage)) {

			System.out.println("Service tax was created successfully");
			Extent_pass(driver, "Service tax was created successfully", test, test1);
		} else {
			System.out.println("Service tax was not created");
			Extent_fail(driver, "Service tax was not created", test, test1);

		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		waitForElement(driver, STXNo);
		String Tx_no = getAttribute(driver, STXNo, "value");

		Step_End(17,
				"Click on the save option in the toolbar and system validates as Service tax saved Click ok option.Ensure that service tax number is generated",
				test, test1);

		Step_Start(18, "Then go to cost activity report module and click on the edit option", test, test1);

		waitForElement(driver, CAR_Tab);
		click(driver, CAR_Tab);

		Step_End(18, "Then go to cost activity report module and click on the edit option", test, test1);

		Step_Start(19, "Then click the refresh option.Next click the expense report", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		Step_End(19, "Then click the refresh option.Next click the expense report", test, test1);

		Step_Start(20,
				"Check whether the generated service tax number is shown in Service tax/GST No. column along with the tax details with proper tax amount which is defined in the service tax based on the percentange",
				test, test1);

		waitForElement(driver, TotalExpenses_Column);
		click(driver, TotalExpenses_Column);

		waitForElement(driver, TotalExpenses_input);
		jsClick(driver, TotalExpenses_Deselect);

		List<String> filter_columns = splitAndExpand(filtercolumns);

		for (String columnname : filter_columns) {

			waitForElement(driver, TotalExpenses_input);
			clear(driver, TotalExpenses_input);
			sendKeys(driver, TotalExpenses_input, columnname);

			waitForElement(driver, TotalExpenses_input);
			jsClick(driver, TotalExpenses_Deselect);
		}

		List<WebElement> TotalCosts = driver
				.findElements(By.xpath("//div[@col-id='conTotalCostWOTax' and @role='gridcell']"));
		List<WebElement> Service_Tax = driver
				.findElements(By.xpath("//div[@col-id='serviceTaxNO' and @role='gridcell']"));

		List<String> total_Cost = new ArrayList<String>();

		for (WebElement cost : TotalCosts) {

			String getcost = cost.getText();

			total_Cost.add(getcost);
		}

		for (WebElement Tax : Service_Tax) {

			String TaxNo = Tax.getText();

			if (TaxNo.equals(Tx_no)) {
				System.out.println("Created tax no was updated in the expense report || Expected : " + Tx_no
						+ " || Actual : " + TaxNo);
				Extent_pass(driver, ("Created tax no was updated in the expense report || Expected : " + Tx_no
						+ " || Actual : " + TaxNo), test, test1);

			} else {
				System.out.println("Created tax no was not updated in the expense report || Expected : " + Tx_no
						+ " || Actual : " + TaxNo);
				Extent_fail(driver, ("Created tax no was not updated in the expense report || Expected : " + Tx_no
						+ " || Actual : " + TaxNo), test, test1);

			}

		}

		for (int i = 0; i < TotalCosts.size(); i++) {

			WebElement taxfield = driver
					.findElement(By.xpath("//div[@row-id='" + i + "']//div[@col-id='4R' and @role='gridcell']"));

			String expenseTax = taxfield.getText();

			String totalcost = total_Cost.get(i);

			// Convert the string to a double
			double convertedCost = Double.parseDouble(totalcost);

			// Convert percentage string to a double
			double convertedPercentage = Double.parseDouble(PercentageValue);

			// Calculate the result by applying the percentage to the cost
			double result = (convertedCost * convertedPercentage) / 100;

			// Convert the result to an integer (removing decimals)
			int integerValue = (int) Math.floor(result);

			// Convert the result to string
			String expectedTax = String.valueOf(integerValue);

			// Output the result
			System.out.println("Expected Tax: " + expectedTax);

			if (expenseTax.equals(expectedTax)) {

				System.out.println("Taxes are calculated as per the service tax || Expected : " + expectedTax
						+ " || Actual : " + expenseTax);
				Extent_pass(driver, "Taxes are calculated as per the service tax || Expected : " + expectedTax
						+ " || Actual : " + expenseTax, test, test1);
			} else {
				System.out.println("Taxes are not calculated as per the service tax || Expected : " + expectedTax
						+ " || Actual : " + expenseTax);
				Extent_fail(driver, "Taxes are not calculated as per the service tax || Expected : " + expectedTax
						+ " || Actual : " + expenseTax, test, test1);
			}

		}

		if (DeleteCondition.equals("Yes")) {

			waitForElement(driver, Servicetax2);
			click(driver, Servicetax2);

			waitForElement(driver, Delete_button_toolBar);
			click(driver, Delete_button_toolBar);

			waitForElement(driver, popup_Message_Yes_Button);
			click(driver, popup_Message_Yes_Button);
			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

		}

		Step_End(20,
				"Check whether the generated service tax number is shown in Service tax/GST No. column along with the tax details with proper tax amount which is defined in the service tax based on the percentange",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
