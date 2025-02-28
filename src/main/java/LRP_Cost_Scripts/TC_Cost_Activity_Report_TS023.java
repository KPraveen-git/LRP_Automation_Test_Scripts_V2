package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS023 extends Keywords {

	public void Cost_Activity_Report_TS023(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS023";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String GivenContract_Type = data.get("GivenContract_Type");
		String Service = data.get("Service");
		String Vessel = data.get("Vessel");
		String Port = data.get("Port");
		String Terminal = data.get("Terminal");
		String Arrival_Date = data.get("Arrival_Date");
		String Condition1 = data.get("Condition1");
		String GivenMode = data.get("GivenMode");
		String FilterColumn = data.get("FilterColumn");
		String ActivityName = data.get("GivenActivity");
		String Updated_Popup = data.get("Updated_Popup");
		String Save_Popup = data.get("Save_Popup");
		String Simulator_Value = data.get("Simulator_Value");

		String Contract_option = String.format(Select_ContractType, GivenContract_Type);
		String Mode_option = String.format(Select_ModeOption, GivenMode);
		String FindRow = String.format(Given_Row, ActivityName);

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);

		LRP_Login(driver, username, password);

		verifyMainMenu(driver);

		Step_End(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);
		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		Step_Start(3, "Click on the Service search button and select the required service code", test, test1);

		waitForElement(driver, Contract_type);
		click(driver, Contract_type);

		waitForElement(driver, Contract_option);
		click(driver, Contract_option);

		waitForElement(driver, Select_Mode);
		click(driver, Select_Mode);

		waitForElement(driver, Mode_option);
		click(driver, Mode_option);

		waitForElement(driver, Service_Search);
		click(driver, Service_Search);

		selectValue(driver, Condition1, Service);

		Step_End(3, "Click on the Service search button and select the required service code", test, test1);

		Step_Start(4, "Click on the Vessel search button and select the required vessel code", test, test1);

		waitForElement(driver, Vessel_Search);
		click(driver, Vessel_Search);

		selectValue(driver, Condition1, Vessel);

		Step_End(4, "Click on the Vessel search button and select the required vessel code", test, test1);

		Step_Start(5, "Click on the Port search button and select the required port code", test, test1);

		waitForElement(driver, port_Search);
		click(driver, port_Search);

		selectValue(driver, Condition1, Port);

		Step_End(5, "Click on the Port search button and select the required port code", test, test1);

		Step_Start(6, "Click on the Terminal search button and select the required terminal code", test, test1);

		waitForElement(driver, Terminal_Search);
		click(driver, Terminal_Search);

		selectValue(driver, Condition1, Terminal);

		Step_End(6, "Click on the Terminal search button and select the required terminal code", test, test1);

		Step_Start(7, "Click on the Arrival date search button and select the required date", test, test1);

		waitForElement(driver, ArrivalDate_Search);
		click(driver, ArrivalDate_Search);

		selectValue(driver, Condition1, Arrival_Date);

		Step_End(7, "Click on the Arrival date search button and select the required date", test, test1);

		Step_Start(8, "Click on the Show button", test, test1);

		waitForElement(driver, Show_Button);
		click(driver, Show_Button);

		if (isdisplayed(driver, popup_Message_Yes_Button)) {

			click(driver, popup_Message_Yes_Button);
		}

		Step_End(8, "Click on the Show button", test, test1);

		Step_Start(9, "Click on the Predictable Reporting tab", test, test1);

		waitForElement(driver, UnpredictableTab);
		click(driver, UnpredictableTab);

		Step_End(9, "Click on the Predictable Reporting tab", test, test1);

		Step_Start(10, "Select the required data in the grid by using the check box selection", test, test1);

		waitForElement(driver, ColumnFilter);
		click(driver, ColumnFilter);

		waitForDisplay(driver, DeselectAll);
		jsClick(driver, DeselectAll);

		jsClick(driver, DeselectAll);

		List<String> filtercolumns = splitAndExpand(FilterColumn);

		for (String columnname : filtercolumns) {

			waitForElement(driver, Filter_Input);
			clear(driver, Filter_Input);
			sendKeys(driver, Filter_Input, columnname);

			waitForElement(driver, Filter_Input);
			jsClick(driver, DeselectAll);
		}

		waitForElement(driver, FindRow);
		String rowid = getAttribute(driver, FindRow, "row-id");

		String Checkbox = String.format(Select_Checkbox, rowid);

		String Formual_value = String.format(Formula_field, rowid);

		waitForElement(driver, Formual_value);

		String Formual_Text = getText(driver, Formual_value);

		Step_Start(11,
				"After the selection enter the required quantity value for the selected records in the unpredictable reporting tab and check whether the activity has any variables in formula colomn",
				test, test1);

		Step_Start(13,
				".Incase,if the selected activity contains any formula along with the To be reported(Formula) checkbox selection false means,we have to input the required variable values in the value field and click the simulator option. An information message will be displayed as \"The result for Sample Values along with simulator value\" and click ok option",
				test, test1);

		if (!Formual_Text.isEmpty()) {

			waitForElement(driver, Edit_Button_toolBar);
			click(driver, Edit_Button_toolBar);

			waitForElement(driver, ColumnFilter);
			click(driver, ColumnFilter);

			waitForDisplay(driver, DeselectAll);
			jsClick(driver, DeselectAll);

			jsClick(driver, DeselectAll);

			for (String columnname : filtercolumns) {

				waitForElement(driver, Filter_Input);
				clear(driver, Filter_Input);
				sendKeys(driver, Filter_Input, columnname);

				waitForElement(driver, Filter_Input);
				jsClick(driver, DeselectAll);
			}

			scrollBottom(driver);

			waitForElement(driver, Checkbox);
			click(driver, Checkbox);

			Step_End(10, "Select the required data in the grid by using the check box selection", test, test1);

			Step_End(11,
					"After the selection enter the required quantity value for the selected records in the unpredictable reporting tab and check whether the activity has any variables in formula colomn",
					test, test1);

			Step_End(13,
					".Incase,if the selected activity contains any formula along with the To be reported(Formula) checkbox selection false means,we have to input the required variable values in the value field and click the simulator option. An information message will be displayed as \"The result for Sample Values along with simulator value\" and click ok option",
					test, test1);

			String formulavalue = evaluateExpression(Formual_Text, Simulator_Value);

			String expectedvalue = String.format("%.2f", Double.parseDouble(formulavalue));

			waitForElement(driver, Variable_Input);
			jsClick(driver, Variable_Input);

			Newclear_Type(driver);
			typeText(Simulator_Value);

			click(driver, Formual_value);

			waitForElement(driver, Simulator);
			click(driver, Simulator);

			Step_Start(14, "Ensure that Total cost and charge rate gets updated for that activity", test, test1);

			waitForElement(driver, popup_Message);
			String SimulatorPopupmessage = getText(driver, popup_Message);

			if (SimulatorPopupmessage.contains(expectedvalue)) {

				System.out.println(
						"Simulator option is working fine for the formula and converted value was : " + expectedvalue);
				Extent_pass(driver,
						"Simulator option is working fine for the formula and converted value was : " + expectedvalue,
						test, test1);

			} else {

				System.out.println(
						"Simulator option is working fine for the formula and converted value was : " + expectedvalue);
				Extent_fail(driver,
						"Simulator option is working fine for the formula and converted value was : " + expectedvalue,
						test, test1);

			}

			Step_End(14, "Ensure that Total cost and charge rate gets updated for that activity", test, test1);

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

			scrollTop(driver);

			Step_Start(15,
					".Click on the tool bar save button and check whether the system shows the information message as Container Activity Report Saved Click on the ok option",
					test, test1);

			waitForElement(driver, Save_button_toolBar);
			click(driver, Save_button_toolBar);

			waitForElement(driver, popup_Message);
			String SavePopupmessage = getText(driver, popup_Message);

			if (SavePopupmessage.equals(Updated_Popup)) {

				System.out.println(
						"Activity report is saved || Expected : " + Updated_Popup + " || Actual : " + SavePopupmessage);
				Extent_pass(driver,
						"Activity report is saved || Expected : " + Updated_Popup + " || Actual : " + SavePopupmessage,
						test, test1);
			} else {

				System.out.println("Activity report is not saved || Expected : " + Updated_Popup + " || Actual : "
						+ SavePopupmessage);
				Extent_fail(driver, "Activity report is not saved || Expected : " + Updated_Popup + " || Actual : "
						+ SavePopupmessage, test, test1);
			}

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

		} else {

			scrollTop(driver);

			Step_Start(12, "Click on the tool bar save button,if the selected activity does not contains any formula",
					test, test1);

			waitForElement(driver, Save_button_toolBar);
			click(driver, Save_button_toolBar);

			waitForElement(driver, popup_Message);
			String SavePopupmessage = getText(driver, popup_Message);

			if (SavePopupmessage.equals(Save_Popup)) {

				System.out.println(
						"Activity report is saved || Expected : " + Save_Popup + " || Actual : " + SavePopupmessage);
				Extent_pass(driver,
						"Activity report is saved || Expected : " + Save_Popup + " || Actual : " + SavePopupmessage,
						test, test1);
			} else {

				System.out.println("Activity report is not saved || Expected : " + Save_Popup + " || Actual : "
						+ SavePopupmessage);
				Extent_fail(driver,
						"Activity report is not saved || Expected : " + Save_Popup + " || Actual : " + SavePopupmessage,
						test, test1);
			}

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

			Step_End(12, "Click on the tool bar save button,if the selected activity does not contains any formula",
					test, test1);

		}

		Extent_completed(tc_Name, test, test1);

	}

}
