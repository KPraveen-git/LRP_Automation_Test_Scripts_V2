package Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS020 extends Keywords {

	public void Cost_Activity_Report_TS020(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS020";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String AgencyUser = data.get("AgencyUser");

		String Select_Contract_type_Value = data.get("Select_Contract_type_Value");
		String Select_Mode_type = data.get("Select_Mode_type");
		String Service_Code = data.get("Service_Code");
		String Vessel_Code = data.get("Vessel_Code");
		String Port_Code = data.get("Port_Code");
		String Terminal_Code = data.get("Terminal_Code");
		String Service_details_Codition = data.get("Service_details_Codition");
		String Arrival_Date_Condition = data.get("Arrival_Date_Condition");
		String Arrival_Date_Value = data.get("Arrival_Date_Value");
		String UnPredictable_Table_Filter_Headers = data.get("UnPredictable_Table_Filter_Headers");

		String Service_Header = data.get("Service_Header");
		String Vessel_Header = data.get("Vessel_Header");
		String Port_Header = data.get("Port_Header");
		String Terminal_Header = data.get("Terminal_Header");
		String Arrival_Date_Header = data.get("Arrival_Date_Header");
		
		String Table_Filter_Headers_Quantity = data.get("Table_Filter_Headers_Quantity");
		String Quantity_Add_Column = data.get("Quantity_Add_Column");
		String Quantity_Value = data.get("Quantity_Value");
		String Container_Activity_report_Saved_popup = data.get("Container_Activity_report_Saved_popup");

		String Predictable_Activity_Module = data.get("Predictable_Activity_Module");
		String Predictable_Select_Codition = data.get("Predictable_Select_Codition");
		String Main_Activity_Name = data.get("Main_Activity_Name");
		String Sub_Activity_Name = data.get("Sub_Activity_Name");
		String Activity_Add_Condition = data.get("Activity_Add_Condition");
		String Popup_Text_Exp = data.get("Popup_Text_Exp");

		String Port_Header_Predictable = data.get("Port_Header_Predictable");
		String Terminal_Header_Predictable = data.get("Terminal_Header_Predictable");
		String Activity_Header_Predictable = data.get("Activity_Header_Predictable");

		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select the required agency.",
				test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.",
				test, test1);

		Step_Start(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);

		waitForElement(driver, Contract_Type_Input_CAR);
		click(driver, Contract_Type_Input_CAR);

		String SelectContract = String.format(Select_Contract_Type_CAR, Select_Contract_type_Value);
		waitForElement(driver, SelectContract);
		click(driver, SelectContract);

		waitForElement(driver, Mode_Select_Input_CAR);
		click(driver, Mode_Select_Input_CAR);

		String SelectModeValue = String.format(Select_Mode_type_CAR, Select_Mode_type);
		waitForElement(driver, SelectModeValue);
		click(driver, SelectModeValue);

		Step_Start(3, "Click on the Service search button and select the required service code.", test, test1);
		waitForElement(driver, Service_Search_Btn_CAR);
		click(driver, Service_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Service_Header,Service_details_Codition,Service_Code);
		Step_End(3, "Click on the Service search button and select the required service code.", test, test1);

		Step_Start(4, "Click on the Vessel search button and select the required vessel code. ", test, test1);
		waitForElement(driver, Vessel_Search_Btn_CAR);
		click(driver, Vessel_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Vessel_Header,Service_details_Codition,Vessel_Code);
		Step_End(4, "Click on the Vessel search button and select the required vessel code. ", test, test1);

		Step_Start(5, "Click on the Port search button and select the required port code.", test, test1);
		waitForElement(driver, Port_Search_Btn_CAR);
		click(driver, Port_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Port_Header,Service_details_Codition,Port_Code);
		Step_End(5, "Click on the Port search button and select the required port code.", test, test1);

		Step_Start(6, "Click on the Terminal search button and select the required terminal code.", test, test1);
		waitForElement(driver, Terminal_Search_Btn_CAR);
		click(driver, Terminal_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Terminal_Header,Service_details_Codition,Terminal_Code);
		Step_End(6, "Click on the Terminal search button and select the required terminal code.", test, test1);

		Step_Start(7, "Click on the Arrival date search button and select the required date.  ", test, test1);
		waitForElement(driver, Arrival_Date_Search_Btn_CAR);
		click(driver, Arrival_Date_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Arrival_Date_Header,Arrival_Date_Condition,Arrival_Date_Value);
		Step_End(7, "Click on the Arrival date search button and select the required date.  ", test, test1);

		Step_Start(8, "Click on the Show button and Click on the Predictable Reporting tab.  ", test, test1);
		waitForElement(driver, Show_Button_CAR);
		click(driver, Show_Button_CAR);
		Step_End(8, "Click on the Show button and Click on the Predictable Reporting tab.  ", test, test1);

		Step_Start(9,
				"Check whether the required activity is present in the predictable reporting tab. If none of the activities are not mapped, Then enter the screen name as \"Predictable activity behaviour\" in module search field.     ",
				test, test1);
		waitForElement(driver, Arrival_Date_Input_CAR);
		String ArrivalDate = getAttribute(driver, Arrival_Date_Input_CAR, "value");

		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver, UnPredictable_Tab_CAR);

		waitForElement(driver, UnPredictable_Table_CAR);

		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		waitForElement(driver, Column_Search_Input);
		jsClick(driver, SelectAll_Column_CheckBox);
		if(isdisplayed(driver, UnPredict_Activity_GridCell_CAR)) {
			jsClick(driver, SelectAll_Column_CheckBox);
		}
		
		List<String> predictable_Headers = splitAndExpand(UnPredictable_Table_Filter_Headers);
		for (String FilterHeader : predictable_Headers) {
			waitForElement(driver, Column_Search_Input);
			clear(driver, Column_Search_Input);
			waitForElement(driver, Column_Search_Input);
			sendKeys(driver, Column_Search_Input, FilterHeader);

			String checkbox = String.format(Select_Column_CAR, FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}

		jsClick(driver, Column_SelectMenu);

		waitForElement(driver, More_Grid_CAR);
		click(driver, More_Grid_CAR);

		waitForElement(driver, Condition_Filter_CAR);
		click(driver, Condition_Filter_CAR);

		waitForElement(driver, Main_Activity_Filter_Input_CAR);
		sendKeys(driver, Main_Activity_Filter_Input_CAR, Main_Activity_Name);

		waitForElement(driver, UnPredictable_Table_CAR);
		List<Map<String, String>> UnPredictable_TableData = extractTableDataByColumnWithoutScroll(driver, UnPredictable_Table_CAR);
		System.out.println("UnPredictable_TableData : " + UnPredictable_TableData);

		String Main_Activity_Value = getValueByFirstColumnAndHeader(UnPredictable_TableData, "Activity Name",
				Sub_Activity_Name, "Main Activity");
		String Parent_Code_Value = getValueByFirstColumnAndHeader(UnPredictable_TableData, "Activity Name",
				Sub_Activity_Name, "Parent Code");
		String Activity_Code_Value = getValueByFirstColumnAndHeader(UnPredictable_TableData, "Activity Name",
				Sub_Activity_Name, "Activity Code");

		moduleNavigate(driver, Predictable_Activity_Module);
		Step_End(9,
				"Check whether the required activity is present in the predictable reporting tab. If none of the activities are not mapped, Then enter the screen name as 'Predictable activity behaviour' in module search field.     ",
				test, test1);

		Step_Start(10, "Select the required contract type, valid from and valid to dates.", test, test1);
		waitForElement(driver, Contract_type_Input_PAB);
		click(driver, Contract_type_Input_PAB);
		String Select_Contract = String.format(Select_Contract_Type_PAB, Select_Contract_type_Value);
		waitForElement(driver, Select_Contract);
		click(driver, Select_Contract);

		waitForElement(driver, From_Date_Input_PAB);
		selectDatePicker(driver, From_Date_Input_PAB, ArrivalDate);
		Step_End(10, "Select the required contract type, valid from and valid to dates.", test, test1);

		Step_Start(11,
				"Click on the port search option and select the required port. Next click on the terminal search option and select the required terminal. Next click on the show option.  ",
				test, test1);
		waitForElement(driver, Port_Input_PAB);
		click(driver, Port_Input_PAB);

		twoColumnSearchWindow(driver,Port_Header_Predictable,Predictable_Select_Codition,Port_Code);

		waitForElement(driver, Terminal_Port_PAB);
		click(driver, Terminal_Port_PAB);
		twoColumnSearchWindow(driver,Terminal_Header_Predictable,Predictable_Select_Codition,Terminal_Code);

		waitForElement(driver, Show_Button_PAB);
		click(driver, Show_Button_PAB);
		Step_End(11,
				"Click on the port search option and select the required port. Next click on the terminal search option and select the required terminal. Next click on the show option.  ",
				test, test1);

		Step_Start(12, "Main activities will be shown in the AG grid.  ", test, test1);
		waitForElement(driver, Predictable_Activity_Table_PAB);
		Step_End(12, "Main activities will be shown in the AG grid.  ", test, test1);

		Step_Start(13,
				"click on the required main activity and right click on them and select Add item option and select the check box of the required activity codes and click on the select option.   ",
				test, test1);
		String MainActivity_Name_Column = String.format(Activity_Name_PAB, Main_Activity_Name);
		if (isDisplayed(driver, MainActivity_Name_Column)) {
			System.out.println("Main Activity is present");
			if (Main_Activity_Value.equals(Parent_Code_Value)) {
				String Activity_Column = String.format(Activity_Column_PAB, Main_Activity_Value);
				waitForElement(driver, Activity_Column);
				click(driver, Activity_Column);
				RightClick(driver, Activity_Column);
				waitForElement(driver, Add_item_PAB);
				click(driver, Add_item_PAB);
				twoColumnSearchWindow(driver,Activity_Header_Predictable,Activity_Add_Condition,Activity_Code_Value);

			} else {
				String Activity_Column = String.format(Activity_Column_PAB, Main_Activity_Value);
				waitForElement(driver, Activity_Column);

				click(driver, Activity_Column);
				RightClick(driver, Activity_Column);
				waitForElement(driver, Add_item_PAB);
				click(driver, Add_item_PAB);
				twoColumnSearchWindow(driver,Activity_Header_Predictable,Activity_Add_Condition,Parent_Code_Value);

				String Parent_Column = String.format(Activity_Column_PAB, Parent_Code_Value);
				waitForElement(driver, Parent_Column);
				click(driver, Parent_Column);
				RightClick(driver, Parent_Column);

				waitForElement(driver, Add_item_PAB);
				click(driver, Add_item_PAB);
				twoColumnSearchWindow(driver,Activity_Header_Predictable,Activity_Add_Condition,Activity_Code_Value);

			}

		} else {
			System.out.println("Main Activity is not present");
			Extent_fail(driver, "Main Activity is not present", test, test1);
		}
		Step_End(13,
				"click on the required main activity and right click on them and select Add item option and select the check box of the required activity codes and click on the select option.   ",
				test, test1);

		scrollTop(driver);
		Step_Start(14,
				"Then click on the save option in the toolbar and system validates as \"Predictable activity behaviour saved\".Click on the ok option. ",
				test, test1);
		waitForElement(driver, Save_button_toolBar);
		click(driver, Save_button_toolBar);

		waitForElement(driver, popup_Message);
		String PopupText_Act = getText(driver, popup_Message);

		if (PopupText_Act.equals(Popup_Text_Exp)) {
			System.out.println(
					"Popup Matched  ||   Expected : " + Popup_Text_Exp + "   ||   Actual   : " + PopupText_Act);
			Extent_pass(driver,
					"Popup Matched  ||   Expected : " + Popup_Text_Exp + "   ||   Actual   : " + PopupText_Act, test,
					test1);
		} else {
			System.out.println(
					"Popup Not Matched  ||   Expected : " + Popup_Text_Exp + "   ||   Actual   : " + PopupText_Act);
			Extent_fail(driver,
					"Popup Not Matched  ||   Expected : " + Popup_Text_Exp + "   ||   Actual   : " + PopupText_Act,
					test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		waitForElement(driver, Template_Numer_Input_PAB);
		String Template_Number_Exp = getAttribute(driver, Template_Numer_Input_PAB, "value");

		Step_End(14,
				"Then click on the save option in the toolbar and system validates as \"Predictable activity behaviour saved\".Click on the ok option. ",
				test, test1);

		Step_Start(15,
				"Then go to Cost activty report and click refresh option. Ensure that Activity number is matched", test,
				test1);
		waitForElement(driver, Close_Current_tab);
		click(driver, Close_Current_tab);

		waitForElement(driver, Refresh_Button_CAR);
		click(driver, Refresh_Button_CAR);

		waitForElement(driver, Contracts_Used_Btn_CAR);
		click(driver, Contracts_Used_Btn_CAR);

		waitForElement(driver, Contracts_Details_tab_CAR);
		waitForElement(driver, Activity_Behaviour_ID_CAR);
		String Activity_ID_Full = getText(driver, Activity_Behaviour_ID_CAR);

		List<String> Activity_ID_Split = splitAndExpand(Activity_ID_Full, ":");
		String Activity_ID_CAR = Activity_ID_Split.get(1);

		if (Template_Number_Exp.equals(Activity_ID_CAR)) {
			System.out.println("Template Number Matched ||   Expected : " + Template_Number_Exp + "  ||   Actual : "
					+ Activity_ID_CAR);
			Extent_pass(driver, "Template Number Matched ||   Expected : " + Template_Number_Exp + "  ||   Actual : "
					+ Activity_ID_CAR, test, test1);
		} else {
			System.out.println("Template Number Not Matched ||   Expected : " + Template_Number_Exp + "  ||   Actual : "
					+ Activity_ID_CAR);
			Extent_fail(driver, "Template Number Not Matched ||   Expected : " + Template_Number_Exp
					+ "  ||   Actual : " + Activity_ID_CAR, test, test1);
		}

		waitForElement(driver, Contract_Details_Ok_Btn_CAR);
		click(driver, Contract_Details_Ok_Btn_CAR);

		Step_End(15, "Then go to Cost activty report and click refresh option. Ensure that Activity number is matched",
				test, test1);

		Step_Start(16,
				"Ensure that mapped activty is shown in the predictable reporting tab and select the required activites",
				test, test1);
		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver, Predictable_Reporting_CAR);
		waitForElement(driver, Predictable_Table_CAR);

		String PredictableActivity_Column = String.format(Predictable_Activity_Column_CAR, Sub_Activity_Name);
		String MainActivity_Column = String.format(Main_Activity_Column_CAR, Main_Activity_Name);

		if (isDisplayed(driver, PredictableActivity_Column) && isDisplayed(driver, MainActivity_Column)) {
			System.out.println("Activity Added successfully in the Predicatble Activity Table");
			Extent_pass(driver, "Activity Added successfully in the Predicatble Activity Table", test, test1);
		} else {
			System.out.println("Activity Added successfully in the Predicatble Activity Table");
			Extent_fail(driver, "Activity Added successfully in the Predicatble Activity Table", test, test1);
		}

		waitForElement(driver, PredictableActivity_Column);
		click(driver, PredictableActivity_Column);
		Step_End(16,
				"Ensure that mapped activty is shown in the predictable reporting tab and select the required activites",
				test, test1);

		Step_Start(17,
				"Click on the Unpredictable Reporting tab and Select the required data in the grid by using the check box selection.. ",
				test, test1);
		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver, UnPredictable_Tab_CAR);
		waitForElement(driver, UnPredictable_Table_CAR);

		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		waitForElement(driver, Column_Search_Input);
		jsClick(driver, SelectAll_Column_CheckBox);

		List<String> Unpredictable_Headers = splitAndExpand(Table_Filter_Headers_Quantity);
		for (String FilterHeader : Unpredictable_Headers) {
			waitForElement(driver, Column_Search_Input);
			clear(driver, Column_Search_Input);
			waitForElement(driver, Column_Search_Input);
			sendKeys(driver, Column_Search_Input, FilterHeader);

			String checkbox = String.format(Select_Column_CAR, FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}

		jsClick(driver, Column_SelectMenu);

		waitForElement(driver, More_Grid_UnPredictable_CAR);
		click(driver, More_Grid_UnPredictable_CAR);

		waitForElement(driver, Condition_UnPredictable_CAR);
		click(driver, Condition_UnPredictable_CAR);
		Step_End(17,
				"Click on the Unpredictable Reporting tab and Select the required data in the grid by using the check box selection.. ",
				test, test1);

		Step_Start(18,
				"After the selection enter the required quantity value for the selected records in the unpredictable reporting tab and check whether the activity has any variables in formula column ",
				test, test1);

		waitForElement(driver, Activity_Name_CAR);
		sendKeys(driver, Activity_Name_CAR, Quantity_Add_Column);

		waitForElement(driver, Quantity_Column_CAR);
		doubleClick(driver, Quantity_Column_CAR);
		waitForElement(driver, Quantity_Input_CAR);
		clear(driver, Quantity_Input_CAR);
		sendKeys(driver, Quantity_Input_CAR, Quantity_Value);

		waitForElement(driver, Formula_Column_CAR);
		String Formula_Value = getText(driver, Formula_Column_CAR);
		Step_End(18,
				"After the selection enter the required quantity value for the selected records in the unpredictable reporting tab and check whether the activity has any variables in formula column ",
				test, test1);

		if (!Formula_Value.equals("")) {

		} else {

			Step_Start(19, "Click on the tool bar save button,if the selected activity does not contains any formula",
					test, test1);
			waitForElement(driver, SaveButton_ToolBar);
			click(driver, SaveButton_ToolBar);

			Step_End(19, "Click on the tool bar save button,if the selected activity does not contains any formula",
					test, test1);

			Step_Start(21,
					"check whether the system shows the information message as 'Container Activity Report Saved'", test,
					test1);
			waitForElement(driver, popup_Message);
			String Popup_Text_Act = getText(driver, popup_Message);

			if (Popup_Text_Act.equals(Container_Activity_report_Saved_popup)) {
				System.out.println("Popup Matched  ||   Expected : " + Container_Activity_report_Saved_popup
						+ "   ||   Actual   : " + Popup_Text_Act);
				Extent_pass(driver, "Popup Matched  ||   Expected : " + Container_Activity_report_Saved_popup
						+ "   ||   Actual   : " + Popup_Text_Act, test, test1);
			} else {
				System.out.println("Popup Not Matched  ||   Expected : " + Container_Activity_report_Saved_popup
						+ "   ||   Actual   : " + Popup_Text_Act);
				Extent_fail(driver, "Popup Not Matched  ||   Expected : " + Container_Activity_report_Saved_popup
						+ "   ||   Actual   : " + Popup_Text_Act, test, test1);
			}

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);
			Step_End(21, "check whether the system shows the information message as 'Container Activity Report Saved'",
					test, test1);
		}

		Extent_completed(tc_Name, test, test1);

	}

}
