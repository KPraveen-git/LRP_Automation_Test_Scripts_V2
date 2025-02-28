package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS030 extends Keywords {

	@SuppressWarnings("deprecation")
	public void Cost_Activity_Report_TS030(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		String tc_Name = "TC_Cost_Activity_Report_TS030";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");

		String car_number = data.get("Car_No");
		String car_value = data.get("Car_Number");
		String Contains = data.get("Contains_val");
		String Coloum_headers = data.get("Open_Expenses_Column_Header");
		String BackroundColor = data.get("BackRoundColor");

		Extent_Start(tc_Name, test, test1);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select the required agency.",
				test, test1);

		navigateUrl(driver, url);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency",
				test, test1);

		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		LRP_Login(driver, username, password);

		Step_End(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		verifyMainMenu(driver);

		Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		waitForElement(driver, seach_Filed);
		click(driver, seach_Filed);

		Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);

		Step_Start(4, "Check whether it opens a new search window. ", test, test1);

		waitForElement(driver, Ventor_Global_Seach_First_Field);
		click(driver, Ventor_Global_Seach_First_Field);

		waitForElement(driver, Ventor_Global_Seach_First_Field);
		selectByText(driver, Ventor_Global_Seach_First_Field, car_number);

		waitForElement(driver, Condition_field);
		selectByText(driver, Condition_field, Contains);

		Step_End(4, "Check whether it opens a new search window. ", test, test1);

		Step_Start(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);

		waitForElement(driver, Global_Input_Filed);
		sendKeys(driver, Global_Input_Filed, car_value);

		Step_End(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);

		Step_Start(6, "Then click on the search button", test, test1);

		waitForElement(driver, Search_button);
		click(driver, Search_button);

		Step_End(6, "Then click on the search button", test, test1);

		Step_Start(7, "System will show the CAR No. and Click on the select button", test, test1);

		waitForElement(driver, column_Values);
		click(driver, column_Values);

		waitForElement(driver, Select_Option);
		click(driver, Select_Option);

		Step_End(7, "System will show the CAR No. and Click on the select button", test, test1);

		Step_Start(8, "System will retrieve the CAR", test, test1);

		waitForElement(driver, car_Number_val);
		String Carvalue = getAttribute(driver, car_Number_val, "value");

		System.out.println("Carvalue :" + Carvalue);

//	 if(car_value.equals(Carvalue)) {
//		  System.out.println("matched exp value :"+car_value +"actual value :"+Carvalue);
//		  Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + car_value + " || Actual Report Activity is : " + Carvalue, test,test1);
//	 }else {
//		  System.out.println("Not matched exp value :"+car_value +"actual value :"+Carvalue);
//		  Extent_fail(driver, "Matched || " + " Expected Report Activity is : " + car_value + " || Actual Report Activity is : " + Carvalue, test,test1);
//	 }

		Step_End(8, "System will retrieve the CAR", test, test1);

		Step_Start(9, "Click on the Expense report button and check system opens a new tab", test, test1);

		waitForElement(driver, ExpenseReport);
		click(driver, ExpenseReport);

		waitForElement(driver, expensereportpage);
		if (isdisplayed(driver, expensereportpage)) {

			System.out.println(
					"Click on the Expense Report, and it will navigate to the Expense Report screen successfully");
			Extent_pass(driver,
					"Click on the Expense Report, and it will navigate to the Expense Report screen successfully", test,
					test1);
		} else {

			System.out.println(
					"Click on the Expense Report, and it will navigate to the Expense Report screen successfully");
			Extent_fail(driver,
					"Click on the Expense Report, and it will navigate to the Expense Report screen not Display successfully",
					test, test1);
		}

		Step_End(9, "Click on the Expense report button and check system opens a new tab", test, test1);

		Step_Start(10,
				"Ensure that if ops quantity matches with chargeable quantity then the activities will be shown in blue colour and it is applicable for predictable activity alone in both Open expenses and Approved expenses tab",
				test, test1);

		waitForElement(driver, Open_Expenses);
		click(driver, Open_Expenses);

		waitForElement(driver, Open_Expenses_Column);
		click(driver, Open_Expenses_Column);

		waitForElement(driver, Open_Expe_SelectAll_Checkbox);
		click(driver, Open_Expe_SelectAll_Checkbox);

		List<String> column_Headers = splitAndExpand(Coloum_headers);
		for (int i = 0; i < column_Headers.size(); i++) {
			String column = column_Headers.get(i);
			click(driver, Open_Expense_column_Searchbox);
			clear(driver, Open_Expense_column_Searchbox);
			sendKeys(driver, Open_Expense_column_Searchbox, column);

			String checkbox = String.format(Open_Expense_Colum_CheckBox, column);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);

		}
		waitForElement(driver, Open_Expenses_Column);
		click(driver, Open_Expenses_Column);

		List<WebElement> rows = listOfElements(driver, Open_Expense_Rows_val);
		for (int i = 1; i <= rows.size(); i++) {

			String num = String.valueOf(i);
			String ChargeValueElement = String.format(ChargeQuantity, num);
			String ChargeValue = getText(driver, ChargeValueElement);

			String OpsValueElement = String.format(OpsQuantity, num);
			String OpsValue = getText(driver, OpsValueElement);

			if (ChargeValue.equals(OpsValue)) {

				String PredictableElement = String.format(PredictCheckbox, num);
				if (IsElementSelected(driver, PredictableElement)) {

					String rowClassValue = rows.get(i - 1).getAttribute("class");

					if (rowClassValue.contains(BackroundColor)) {
						System.out
								.println("Ops Quantity and Chargeable Quantity values are equal the color is skyblue");

						Extent_pass(driver,
								"Matched || Ops Quantity and Chargeable Quantity values are equal the color is :  "
										+ BackroundColor,
								test, test1);
					} else {
						System.out.println(
								"Ops Quantity and Chargeable Quantity values are not equal the color is not display");

						Extent_fail(driver,
								"Not Matched ||Ops Quantity and Chargeable Quantity values are not equal and skyblue color is not display",
								test, test1);
					}
				}
			}
		}

		waitForElement(driver, ApprovedExpenses);
		click(driver, ApprovedExpenses);

		waitForElement(driver, Column);
		click(driver, Column);

		click(driver, column_All_Select_Checkbox);

		List<String> column_Headers_val = splitAndExpand(Coloum_headers);
		for (int i = 0; i < column_Headers_val.size(); i++) {
			String column = column_Headers_val.get(i);
			click(driver, column_Searchbox);
			clear(driver, column_Searchbox);
			sendKeys(driver, column_Searchbox, column);

			String checkbox = String.format(column_Checkboxs, column);
			click(driver, checkbox);
		}
		waitForElement(driver, Column);
		click(driver, Column);

		Step_End(10,
				"Ensure that if ops quantity matches with chargeable quantity then the activities will be shown in blue colour and it is applicable for predictable activity alone in both Open expenses and Approved expenses tab",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}
}
