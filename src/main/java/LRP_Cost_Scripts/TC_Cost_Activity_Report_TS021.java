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

public class TC_Cost_Activity_Report_TS021 extends Keywords {

	public void Cost_Activity_Report_TS021(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS021";
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
		String Activities = data.get("Activities");
		String Reject_PopupMessage = data.get("Reject_PopupMessage");
		String Remark_text = data.get("Remark_text");
		String Updated_PopupMessage = data.get("Updated_PopupMessage");

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		Step_Start(1, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		verifyMainMenu(driver);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(1, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		Step_Start(2, "Click on the global search option which is available in the tool bar", test, test1);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		Step_End(2, "Click on the global search option which is available in the tool bar", test, test1);

		Step_Start(3, "Check whether it opens a new search window", test, test1);

		if (isdisplayed(driver, type_Select1)) {

			System.out.println("New Search window got opened");
			Extent_pass(driver, "New Search window got opened", test, test1);
		} else {

			System.out.println("New Search window not got opened");
			Extent_fail(driver, "New Search window not got opened", test, test1);
		}

		Step_End(3, "Check whether it opens a new search window", test, test1);

		Step_Start(4, "Enter the required CAR No. in the CAR No search field", test, test1);

		waitForElement(driver, type_Select1);
		click(driver, type_Select1);
		selectByText(driver, type_Select1, Select_search_value);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

		Step_End(4, "Enter the required CAR No. in the CAR No search field", test, test1);

		Step_Start(5, "Then click on the search button", test, test1);

		click(driver, globalSearch_Frame_SearchButton);

		Step_End(5, "Then click on the search button", test, test1);

		Step_Start(6, "System will show the CAR No", test, test1);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		Step_End(6, "System will show the CAR No", test, test1);

		Step_Start(7, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

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

		Step_End(7, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		Step_Start(8, "Then click on the expense report, a new window will be opened", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		waitForElement(driver, ExpenseReportTab);

		Step_End(8, "Then click on the expense report, a new window will be opened", test, test1);

		Step_Start(9, "Select the required activities from the open expense tab", test, test1);

		List<String> GivenExpenses = splitAndExpand(Activities);

		List<WebElement> openexpenses = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXP']//div[@col-id='parentActName' and @role='gridcell']"));

		for (WebElement expense : openexpenses) {

			String ActivityName = expense.getText();

			if (GivenExpenses.contains(ActivityName)) {

				expense.click();
			}

		}

		Step_End(9, "Select the required activities from the open expense tab", test, test1);

		Step_Start(10, "Click on the Reject button", test, test1);

		waitForElement(driver, Reject_expense);
		click(driver, Reject_expense);

		Step_End(10, "Click on the Reject button", test, test1);

		Step_Start(11, "Check whether the system shows an information message as Expenses are rejected", test, test1);

		waitForElement(driver, popup_Message);

		String Actual_popup = getText(driver, popup_Message);

		if (Actual_popup.equals(Reject_PopupMessage)) {

			System.out.println("Selected Activity got rejected || Expected Popup message : " + Reject_PopupMessage
					+ " || Actual popup message : " + Actual_popup);
			Extent_pass(driver, "Selected Activity got rejected || Expected Popup message : " + Reject_PopupMessage
					+ " || Actual popup message : " + Actual_popup, test, test1);
		} else {

			System.out.println("Selected Activity not rejected || Expected Popup message : " + Reject_PopupMessage
					+ " || Actual popup message : " + Actual_popup);
			Extent_fail(driver, "Selected Activity not rejected || Expected Popup message : " + Reject_PopupMessage
					+ " || Actual popup message : " + Actual_popup, test, test1);
		}

		Step_End(11, "Check whether the system shows an information message as Expenses are rejected", test, test1);

		Step_Start(12, "Click on ok", test, test1);

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_End(12, "Click on ok", test, test1);

		Step_Start(13, "Click on the Edit button", test, test1);

		waitForElement(driver, Edit_Openexpense);
		click(driver, Edit_Openexpense);

		Step_End(13, "Click on the Edit button", test, test1);

		Step_Start(14, "Then select the required activity one by one and right on it", test, test1);

		Step_Start(15, "System will show an remarks option and click on it", test, test1);

		Step_Start(16, "System will open a new tab and enter our required remarks in it", test, test1);

		Step_Start(17, "Click on ok", test, test1);

		List<WebElement> openexpenses2 = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXP']//div[@col-id='parentActName' and @role='gridcell']"));

		for (int i = 0; i < openexpenses2.size(); i++) {

			List<WebElement> expensesList = driver.findElements(
					By.xpath("//div[@id='CRR_treeTableEXP']//div[@col-id='parentActName' and @role='gridcell']"));

			WebElement expense = expensesList.get(i);

			String ActivityName = expense.getText();

			if (GivenExpenses.contains(ActivityName)) {

				RightClick1(driver, expense);

				waitForElement(driver, Remarks_option);
				click(driver, Remarks_option);

				waitForElement(driver, Remarks_Input);
				clear(driver, Remarks_Input);
				sendKeys(driver, Remarks_Input, Remark_text);

				waitForElement(driver, Remark_Ok);
				click(driver, Remark_Ok);

			}
		}

		Step_End(14, "Then select the required activity one by one and right on it", test, test1);

		Step_End(15, "System will show an remarks option and click on it", test, test1);

		Step_End(16, "System will open a new tab and enter our required remarks in it", test, test1);

		Step_End(17, "Click on ok", test, test1);

		Step_Start(18, "Check whether the remarks checkbox is selected for that activity", test, test1);

		waitForElement(driver, ExpenseReportTab);

		int i = 0;

		List<WebElement> openexpenses3 = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXP']//div[@col-id='parentActName' and @role='gridcell']"));

		List<String> activiies = new ArrayList<String>();

		for (WebElement expense : openexpenses3) {

			activiies.add(expense.getText());

		}

		Scroll_ElementVisible(driver, RemarkField, ExpenseReportScroller);

		for (String activity : activiies) {

			if (GivenExpenses.contains(activity)) {

				String remarkcheckbox = String.format(RemarkChecked, i);

				if (isdisplayed(driver, remarkcheckbox)) {

					System.out.println("Remark checkbox is enabled for the given ativity");
					Extent_pass(driver, "Remark checkbox is enabled for the given ativity", test, test1);
				} else {
					System.out.println("Remark checkbox is enabled for the given ativity");
					Extent_fail(driver, "Remark checkbox is enabled for the given ativity", test, test1);
				}
			}

			i++;

		}

		Step_End(18, "Check whether the remarks checkbox is selected for that activity", test, test1);

		Step_Start(19, "Click on the update button", test, test1);

		waitForElement(driver, Update_OpenExpense);
		click(driver, Update_OpenExpense);

		Step_End(19, "Click on the update button", test, test1);

		Step_Start(20, "Check whether the system shows the information message as Expense Report updated", test, test1);

		waitForElement(driver, popup_Message);

		String Actual_updatedpopup = getText(driver, popup_Message);

		if (Actual_updatedpopup.equals(Updated_PopupMessage)) {

			System.out.println("Selected Activity got updated || Expected Popup message : " + Reject_PopupMessage
					+ " || Actual popup message : " + Actual_updatedpopup);
			Extent_pass(driver, "Selected Activity got rejected || Expected Popup message : " + Reject_PopupMessage
					+ " || Actual popup message : " + Actual_updatedpopup, test, test1);
		} else {

			System.out.println("Selected Activity not updated || Expected Popup message : " + Reject_PopupMessage
					+ " || Actual popup message : " + Actual_updatedpopup);
			Extent_fail(driver, "Selected Activity not updated || Expected Popup message : " + Reject_PopupMessage
					+ " || Actual popup message : " + Actual_updatedpopup, test, test1);
		}

		Step_End(20, "Check whether the system shows the information message as Expense Report updated", test, test1);

		Step_Start(21, "Click on ok", test, test1);

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_End(21, "Click on ok", test, test1);

		Step_Start(22, "Close the tab", test, test1);

		waitForElement(driver, Expense_Close);
		click(driver, Expense_Close);

		Step_End(22, "Close the tab", test, test1);

		Step_Start(23, ".Click on the 'Expense report' button again", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		Step_End(23, ".Click on the 'Expense report' button again", test, test1);

		Step_Start(24,
				"System will open a new window and Select the activities for which we have already provided remarks and right click on it  and click on the remarks option",
				test, test1);

		Step_Start(25,
				"System will open a new window and Select the activities for which we have already provided remarks and right click on it  and click on the remarks option",
				test, test1);

		Step_Start(26, "Click on ok button", test, test1);

		waitForElement(driver, ExpenseReportTab);

		List<WebElement> openexpenses4 = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXP']//div[@col-id='parentActName' and @role='gridcell']"));

		for (int j = 0; j < openexpenses4.size(); j++) {

			List<WebElement> expensesList = driver.findElements(
					By.xpath("//div[@id='CRR_treeTableEXP']//div[@col-id='parentActName' and @role='gridcell']"));

			WebElement expense = expensesList.get(j);

			String ActivityName = expense.getText();

			if (GivenExpenses.contains(ActivityName)) {

				expense.click();

				RightClick1(driver, expense);

				waitForElement(driver, Remarks_option);
				click(driver, Remarks_option);

				waitForElement(driver, Remarks_Input);

				String UpdatedRemark = getText(driver, Remarks_Input);
				if (UpdatedRemark.equals(Remark_text)) {

					System.out.println("Given remarks are updated in the selected activity || Expected remark : "
							+ Remark_text + " || Actual remark : " + UpdatedRemark);
					Extent_pass(driver, "Given remarks are updated in the selected activity || Expected remark : "
							+ Remark_text + " || Actual remark : " + UpdatedRemark, test, test1);

				} else {

					System.out.println("Given remarks are not updated in the selected activity || Expected remark : "
							+ Remark_text + " || Actual remark : " + UpdatedRemark);
					Extent_fail(driver, "Given remarks are not updated in the selected activity || Expected remark : "
							+ Remark_text + " || Actual remark : " + UpdatedRemark, test, test1);

				}

				waitForElement(driver, Remark_Ok);
				click(driver, Remark_Ok);

			}
		}

		Step_End(24,
				"System will open a new window and Select the activities for which we have already provided remarks and right click on it  and click on the remarks option",
				test, test1);

		Step_End(25,
				"System will open a new window and Select the activities for which we have already provided remarks and right click on it  and click on the remarks option",
				test, test1);

		Step_End(26, "Click on ok button", test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
