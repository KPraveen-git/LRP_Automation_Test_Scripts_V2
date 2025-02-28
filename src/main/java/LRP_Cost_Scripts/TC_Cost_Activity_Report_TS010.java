package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS010 extends Keywords {

	public void Cost_Activity_Report_TS010(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS010";
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
		String Filter_Columns = data.get("Filter_Columns");
		String Activity = data.get("Activity");
		String Updated_Popup = data.get("Updated_Popup");

		Extent_Start(tc_Name, test, test1);

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

		waitForElement(driver, type_Select1);
		click(driver, type_Select1);
		selectByText(driver, type_Select1, Select_search_value);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

		Step_End(5, "Enter the CTL CAR No. in the CAR No search field", test, test1);

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

		Step_Start(10, "Click on the tool bar edit option", test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);

		Step_End(10, "Click on the tool bar edit option", test, test1);

		Step_Start(11,
				"Then select the Draft,Submitted and rejected activities in the AG grid by refering based on the status column which is available in the AG grid and click on remove button",
				test, test1);

		waitForElement(driver, Misc_Columns);
		click(driver, Misc_Columns);

		waitForElement(driver, Misc_FilterInput);
		jsClick(driver, Misc_FilterDeselect);

		List<String> columnnames = splitAndExpand(Filter_Columns);

		for (String column : columnnames) {

			waitForElement(driver, Misc_FilterInput);
			sendKeys(driver, Misc_FilterInput, column);

			jsClick(driver, Misc_FilterDeselect);

		}

		List<String> activities = splitAndExpand(Activity);

		for (String activiti : activities) {

			String ActivityColumn = String.format(Select_activity, activiti);

			waitForElement(driver, ActivityColumn);
			click(driver, ActivityColumn);

			Step_End(11,
					"Then select the Draft,Submitted and rejected activities in the AG grid by refering based on the status column which is available in the AG grid and click on remove button",
					test, test1);

			Step_Start(12,
					"Check whether the activity removed in AG grid and click on the save button which is available in tool bar",
					test, test1);

			waitForElement(driver, Remove_Misc);
			click(driver, Remove_Misc);

			waitForElement(driver, Remove_Misc);

			if (!isdisplayed(driver, ActivityColumn)) {

				System.out.println("The selected Activity got removed from the AG Grid");
				Extent_pass(driver, "The selected Activity got removed from the AG Grid", test, test1);
			} else {

				System.out.println("The selected Activity not get removed from the AG Grid");
				Extent_fail(driver, "The selected Activity not get removed from the AG Grid", test, test1);
			}

		}

		scrollTop(driver);

		waitForElement(driver, SaveButton_ToolBar);
		click(driver, SaveButton_ToolBar);

		Step_End(12,
				"Check whether the activity removed in AG grid and click on the save button which is available in tool bar",
				test, test1);

		Step_Start(13,
				"Check whether the stystem populates the information message as Container Activity Report updated",
				test, test1);

		waitForElement(driver, popup_Message);
		String SavePopupmessage = getText(driver, popup_Message);

		if (SavePopupmessage.equals(Updated_Popup)) {

			System.out.println(
					"Activity report is saved || Expected : " + Updated_Popup + " || Actual : " + SavePopupmessage);
			Extent_pass(driver,
					"Activity report is saved || Expected : " + Updated_Popup + " || Actual : " + SavePopupmessage,
					test, test1);
		} else {

			System.out.println(
					"Activity report is not saved || Expected : " + Updated_Popup + " || Actual : " + SavePopupmessage);
			Extent_fail(driver,
					"Activity report is not saved || Expected : " + Updated_Popup + " || Actual : " + SavePopupmessage,
					test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_End(13, "Check whether the stystem populates the information message as Container Activity Report updated",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
