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

public class TC_Cost_Activity_Report_TS051 extends Keywords {

	public void Cost_Activity_Report_TS051(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS051";
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
		String ColorCode = data.get("ColorCode");
		String disbursement_ColorCode = data.get("disbursement_ColorCode");
		String Reject_popup = data.get("Reject_popup");

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

		Step_Start(9, "Click on the expense report option", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		Step_End(9, "Click on the expense report option", test, test1);

		Step_Start(10, "Click on the approve expense tab", test, test1);

		waitForElement(driver, ApprovedExpenses);
		click(driver, ApprovedExpenses);

		Step_End(10, "Click on the approve expense tab", test, test1);

		Step_Start(11,
				"Select the activities which is in yellow colour which indicates that the invoice is generated for that activity",
				test, test1);

		List<WebElement> approved_rows = driver
				.findElements(By.xpath("//div[@id='CRR_treeTableEXPDB_tbl']//div[@row-id]"));

		Step_End(11,
				"Select the activities which is in yellow colour which indicates that the invoice is generated for that activity",
				test, test1);

		Step_Start(12, "Click on the reject option", test, test1);

		for (WebElement approveddata : approved_rows) {

			Step_Start(14,
					"Select the activities which is in green colour which indicates that the disbursement is generated for that activity",
					test, test1);

			String getcolor = getTextBackgroundColor1(driver, approveddata);

			String Fieldcolor = getColorName(getcolor);

			if (Fieldcolor.equals(ColorCode) || Fieldcolor.equals(disbursement_ColorCode)) {

				Click(driver, approveddata);

				Step_End(14,
						"Select the activities which is in green colour which indicates that the disbursement is generated for that activity",
						test, test1);

				Step_Start(15, "Click on the reject option", test, test1);

				waitForElement(driver, RejectExpense);
				click(driver, RejectExpense);

				Step_End(15, "Click on the reject option", test, test1);

				break;

			}

		}

		Step_End(12, "Click on the reject option", test, test1);

		Step_Start(16, "Ensure that system validates as  Invoiced activity cannot be rejected Click on the ok option",
				test, test1);

		waitForElement(driver, popup_Message);
		String PopupMEssage = getText(driver, popup_Message);

		if (PopupMEssage.equals(Reject_popup)) {

			System.out.println(
					"Expected Updated popup is showing || Expected : " + Reject_popup + " || Actual : " + PopupMEssage);
			Extent_pass(driver,
					"Expected Updated popup is showing || Expected : " + Reject_popup + " || Actual : " + PopupMEssage,
					test, test1);
		} else {

			System.out.println(
					"Expected Updated popup is showing || Expected : " + Reject_popup + " || Actual : " + PopupMEssage);
			Extent_fail(driver,
					"Expected Updated popup is showing || Expected : " + Reject_popup + " || Actual : " + PopupMEssage,
					test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);
		
		Step_End(16, "Ensure that system validates as  Invoiced activity cannot be rejected Click on the ok option",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
