package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS060 extends Keywords {

	public void Cost_Activity_Report_TS060(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS060";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String Contains = data.get("Contains_val");
		String car_number = data.get("Car_No");
		String car_value = data.get("Car_Number");
		String AgencyUser = data.get("AgencyUser");
		String MSC_Headers_Names = data.get("MSC_Headers_Names");
		String Activity_Headers = data.get("Activity_Headers");
		String Activity_module = data.get("Activity_module");
		String Activity_Code = data.get("Activity_Code");
		String Submitted_popup = data.get("Submitted_popup");
		String Approved_popup = data.get("Approved_popup");
		String Auto_Approved_status = data.get("Auto_Approved_status");

		Extent_Start(tc_Name, test, test1);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select the required agency.",
				test, test1);

		navigateUrl(driver, url);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency",
				test, test1);

		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		LRP_Login(driver, username, password);

		SwitchProfile(driver, AgencyUser);

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

//		 if(car_value.equals(Carvalue)) {
//			  System.out.println("Matched exp value :"+car_value +"actual value :"+Carvalue);
//			  Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + car_value + " || Actual Report Activity is : " + Carvalue, test,test1);
//		 }else {
//			  System.out.println("Not matched exp value :"+car_value +"actual value :"+Carvalue);
//			  Extent_fail(driver, "Matched || " + " Expected Report Activity is : " + car_value + " || Actual Report Activity is : " + Carvalue, test,test1);
//		 }

		Step_End(8, "System will retrieve the CAR", test, test1);

		Step_Start(9, "Go to AG grid where activities are added", test, test1);

		waitForElement(driver, Port_Value);
		String Port_val = getAttribute(driver, Port_Value, "value");
		System.out.println("Port_val :" + Port_val);

		Step_End(9, "Go to AG grid where activities are added", test, test1);

		Step_Start(10, "Go to status column", test, test1);

		waitForElement(driver, MSC_Column_Filt_CAR);
		click(driver, MSC_Column_Filt_CAR);

		waitForElement(driver, MSC_Filter_input_CAR);
		jsClick(driver, MSC_SelectAll_Checkbox_CAR);

		List<String> ExpensiveTable_Headers = splitAndExpand(MSC_Headers_Names);
		for (String FilterHeader : ExpensiveTable_Headers) {
			waitForElement(driver, MSC_Filter_input_CAR);
			clear(driver, MSC_Filter_input_CAR);
			waitForElement(driver, MSC_Filter_input_CAR);
			sendKeys(driver, MSC_Filter_input_CAR, FilterHeader);

			String checkbox = String.format(Select_Column_MSC_CAR, FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}

		jsClick(driver, MSC_Column_Filt_CAR);

		Step_End(10, "Go to status column", test, test1);

		Step_Start(11, "Check what are the activities are Auto-approved and manually approved", test, test1);

		waitForElement(driver, Activity_Code_Side_Menu);
		click(driver, Activity_Code_Side_Menu);

		waitForElement(driver, Activity_Code_Filter);
		click(driver, Activity_Code_Filter);

		waitForElement(driver, Activity_Code_SelectAll_Option);
		click(driver, Activity_Code_SelectAll_Option);

		List<String> ActivityHeaders = splitAndExpand(Activity_Headers);
		for (String FilterHeader : ActivityHeaders) {
			waitForElement(driver, Activity_Code_Input_Field);
			clear(driver, Activity_Code_Input_Field);
			waitForElement(driver, Activity_Code_Input_Field);
			sendKeys(driver, Activity_Code_Input_Field, FilterHeader);

			String checkbox = String.format(Activity_code_Select_column, FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}

		waitForElement(driver, Activity_Code_Filter);
		click(driver, Activity_Code_Filter);

		String currency = getText(driver, Currency_Values);
		System.out.println("currency :" + currency);

		Step_Start(12, "Copy the activity code and enter the screen name as Activity in the module search field", test,
				test1);

		moduleNavigate(driver, Activity_module);

		Step_End(12, "Copy the activity code and enter the screen name as Activity in the module search field", test,
				test1);

		Step_Start(13, "Click on the global search option and paste the activity code in activity code field", test,
				test1);

		waitForElement(driver, Activity_New_Button);
		click(driver, Activity_New_Button);

		waitForElement(driver, Activity_Global_Search);
		click(driver, Activity_Global_Search);

		waitForElement(driver, Ventor_Global_Seach_First_Field);
		selectByText(driver, Ventor_Global_Seach_First_Field, Activity_Code);

		waitForElement(driver, Condition_field);
		selectByText(driver, Condition_field, Contains);

		waitForElement(driver, Global_Input_Filed);
		sendKeys(driver, Global_Input_Filed, Activity_Headers);

		waitForElement(driver, search_option);
		click(driver, search_option);

		waitForElement(driver, Activity_Scroll);
		horizontalscroll(driver, Activity_Scroll, 1500);

		waitForElement(driver, Activity_PortCode_Screen);
		sendKeys(driver, Activity_PortCode_Screen, Port_val);

		waitForElement(driver, Activity_PortCode_Value);
		click(driver, Activity_PortCode_Value);

		waitForElement(driver, Select_Option);
		click(driver, Select_Option);

		Step_End(13, "Click on the global search option and paste the activity code in activity code field", test,
				test1);

		Step_Start(14,
				"System will retrieve that activity. Check for that activity any amount is defined in Activity screen",
				test, test1);

		waitForElement(driver, Activity_port_Value);
		sendKeys(driver, Activity_port_Value, Port_val);

		waitForElement(driver, Activity_Currency_Value);
		sendKeys(driver, Activity_Currency_Value, currency);

		waitForElement(driver, Activity_Amount_Field);

		String Activity_Amount = getAttribute(driver, Activity_Amount_Field, "value");
		System.out.println("Activity_Amount :" + Activity_Amount);

		Step_End(14,
				"System will retrieve that activity. Check for that activity any amount is defined in Activity screen",
				test, test1);

		waitForElement(driver, Cost_Activity_Report_Screen_Option);
		click(driver, Cost_Activity_Report_Screen_Option);

		waitForElement(driver, Car_Screen_Amout);
		String Car_screen_Amount = getText(driver, Car_Screen_Amout);
		System.out.println("Car_screen_Amount  : " + Car_screen_Amount);

		double activityAmountValue = Double.parseDouble(Activity_Amount);
		System.out.println("activityAmountValue :" + activityAmountValue);

		double carScreenAmountValue = Double.parseDouble(Car_screen_Amount);
		System.out.println("carScreenAmountValue :" + carScreenAmountValue);

		if (Activity_Amount.equals("0.00")) {
			Step_Start(15,
					"If not so, go to the CAR screen.Select the activity and click the submit option.Then click the approve option.Go to status column.Ensure that it shows as manually approved",
					test, test1);
			waitForElement(driver, MSC_Column_Filt_CAR);
			click(driver, MSC_Column_Filt_CAR);

			waitForElement(driver, MSC_Column_Filt_CAR);
			click(driver, MSC_Column_Filt_CAR);

			waitForElement(driver, MSC_Filter_input_CAR);
			jsClick(driver, MSC_SelectAll_Checkbox_CAR);

			List<String> ExpensiveTable_Headers1 = splitAndExpand(MSC_Headers_Names);
			for (String FilterHeader : ExpensiveTable_Headers1) {
				waitForElement(driver, MSC_Filter_input_CAR);
				clear(driver, MSC_Filter_input_CAR);
				waitForElement(driver, MSC_Filter_input_CAR);
				sendKeys(driver, MSC_Filter_input_CAR, FilterHeader);

				String checkbox = String.format(Select_Column_MSC_CAR, FilterHeader);
				waitForDisplay(driver, checkbox);
				jsClick(driver, checkbox);
			}
			waitForElement(driver, MSC_Column_Filt_CAR);
			jsClick(driver, MSC_Column_Filt_CAR);

			waitForElement(driver, Activity_Code_Side_Menu);
			click(driver, Activity_Code_Side_Menu);

			waitForElement(driver, Activity_Code_Filter);
			click(driver, Activity_Code_Filter);

			waitForElement(driver, Activity_Code_SelectAll_Option);
			click(driver, Activity_Code_SelectAll_Option);

			List<String> ActivityHeaders1 = splitAndExpand(Activity_Headers);
			for (String FilterHeader : ActivityHeaders1) {
				waitForElement(driver, Activity_Code_Input_Field);
				clear(driver, Activity_Code_Input_Field);
				waitForElement(driver, Activity_Code_Input_Field);
				sendKeys(driver, Activity_Code_Input_Field, FilterHeader);

				String checkbox = String.format(Activity_code_Select_column, FilterHeader);
				waitForDisplay(driver, checkbox);
				jsClick(driver, checkbox);
			}

			waitForElement(driver, Activity_Code_Filter);
			click(driver, Activity_Code_Filter);

			waitForElement(driver, Car_First_Row_Option);
			click(driver, Car_First_Row_Option);

			waitForElement(driver, Car_Screen_Activity_Submitted);
			click(driver, Car_Screen_Activity_Submitted);

			waitForElement(driver, popup_Message);
			String Submit_popup = getText(driver, popup_Message);

			if (Submitted_popup.equals(Submit_popup)) {
				System.out.println("Matched exp value :" + Submitted_popup + "actual value :" + Submit_popup);
				Extent_pass(driver, "Matched || " + " Expected Value is : " + Submitted_popup + " || Actual Value is : "
						+ Submit_popup, test, test1);
			} else {
				System.out.println("Not matched exp value :" + Submitted_popup + "actual value :" + Submit_popup);
				Extent_fail(driver, "Matched || " + " Expected Value is : " + Submitted_popup + " || Actual Value is : "
						+ Submit_popup, test, test1);
			}

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

			waitForElement(driver, MSC_Column_Filt_CAR);
			click(driver, MSC_Column_Filt_CAR);

			waitForElement(driver, MSC_Filter_input_CAR);
			jsClick(driver, MSC_SelectAll_Checkbox_CAR);

			List<String> ExpensiveTable_Headers2 = splitAndExpand(MSC_Headers_Names);
			for (String FilterHeader : ExpensiveTable_Headers2) {
				waitForElement(driver, MSC_Filter_input_CAR);
				clear(driver, MSC_Filter_input_CAR);
				waitForElement(driver, MSC_Filter_input_CAR);
				sendKeys(driver, MSC_Filter_input_CAR, FilterHeader);

				String checkbox = String.format(Select_Column_MSC_CAR, FilterHeader);
				waitForDisplay(driver, checkbox);
				jsClick(driver, checkbox);
			}
			waitForElement(driver, MSC_Column_Filt_CAR);
			jsClick(driver, MSC_Column_Filt_CAR);

			waitForElement(driver, Activity_Code_Side_Menu);
			click(driver, Activity_Code_Side_Menu);

			waitForElement(driver, Activity_Code_Filter);
			click(driver, Activity_Code_Filter);

			waitForElement(driver, Activity_Code_SelectAll_Option);
			click(driver, Activity_Code_SelectAll_Option);

			List<String> ActivityHeaders2 = splitAndExpand(Activity_Headers);
			for (String FilterHeader : ActivityHeaders2) {
				waitForElement(driver, Activity_Code_Input_Field);
				clear(driver, Activity_Code_Input_Field);
				waitForElement(driver, Activity_Code_Input_Field);
				sendKeys(driver, Activity_Code_Input_Field, FilterHeader);

				String checkbox = String.format(Activity_code_Select_column, FilterHeader);
				waitForDisplay(driver, checkbox);
				jsClick(driver, checkbox);
			}

			waitForElement(driver, Activity_Code_Filter);
			click(driver, Activity_Code_Filter);

			waitForElement(driver, Car_First_Row_Option);
			click(driver, Car_First_Row_Option);

			waitForElement(driver, Car_Screen_Activity_Approved);
			click(driver, Car_Screen_Activity_Approved);
			waitForElement(driver, popup_Message);
			String Approved_popup1 = getText(driver, popup_Message);

			if (Approved_popup.equals(Approved_popup1)) {
				System.out.println("Matched exp value :" + Approved_popup + "actual value :" + Approved_popup1);
				Extent_pass(driver, "Matched || " + " Expected Value is : " + Approved_popup + " || Actual Value is : "
						+ Approved_popup1, test, test1);
			} else {
				System.out.println("Not matched exp value :" + Approved_popup + "actual value :" + Approved_popup1);
				Extent_fail(driver, "Matched || " + " Expected Value is : " + Approved_popup + " || Actual Value is : "
						+ Approved_popup1, test, test1);
			}

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

			Step_End(15,
					"If not so, go to the CAR screen.Select the activity and click the submit option.Then click the approve option.Go to status column.Ensure that it shows as manually approved",
					test, test1);

		} else {
			if (carScreenAmountValue <= activityAmountValue) {

				Step_Start(16,
						"If any amount is defined for that activity then check the amount of the activities in CAR screen.If it matches or less than the amount when compared with the amount of the activity screen means,then Select the activity and click the submit option",
						test, test1);

				waitForElement(driver, MSC_Column_Filt_CAR);
				click(driver, MSC_Column_Filt_CAR);

				waitForElement(driver, MSC_Column_Filt_CAR);
				click(driver, MSC_Column_Filt_CAR);

				waitForElement(driver, MSC_Filter_input_CAR);
				jsClick(driver, MSC_SelectAll_Checkbox_CAR);

				List<String> ExpensiveTable_Headers1 = splitAndExpand(MSC_Headers_Names);
				for (String FilterHeader : ExpensiveTable_Headers1) {
					waitForElement(driver, MSC_Filter_input_CAR);
					clear(driver, MSC_Filter_input_CAR);
					waitForElement(driver, MSC_Filter_input_CAR);
					sendKeys(driver, MSC_Filter_input_CAR, FilterHeader);

					String checkbox = String.format(Select_Column_MSC_CAR, FilterHeader);
					waitForDisplay(driver, checkbox);
					jsClick(driver, checkbox);
				}
				waitForElement(driver, MSC_Column_Filt_CAR);
				jsClick(driver, MSC_Column_Filt_CAR);

				waitForElement(driver, Activity_Code_Side_Menu);
				click(driver, Activity_Code_Side_Menu);

				waitForElement(driver, Activity_Code_Filter);
				click(driver, Activity_Code_Filter);

				waitForElement(driver, Activity_Code_SelectAll_Option);
				click(driver, Activity_Code_SelectAll_Option);

				List<String> ActivityHeaders1 = splitAndExpand(Activity_Headers);
				for (String FilterHeader : ActivityHeaders1) {
					waitForElement(driver, Activity_Code_Input_Field);
					clear(driver, Activity_Code_Input_Field);
					waitForElement(driver, Activity_Code_Input_Field);
					sendKeys(driver, Activity_Code_Input_Field, FilterHeader);

					String checkbox = String.format(Activity_code_Select_column, FilterHeader);
					waitForDisplay(driver, checkbox);
					jsClick(driver, checkbox);
				}

				waitForElement(driver, Activity_Code_Filter);
				click(driver, Activity_Code_Filter);

				waitForElement(driver, Car_First_Row_Option);
				click(driver, Car_First_Row_Option);

				waitForElement(driver, Car_Screen_Activity_Submitted);
				click(driver, Car_Screen_Activity_Submitted);

				waitForElement(driver, popup_Message);
				String Submit_popup = getText(driver, popup_Message);

				if (Submitted_popup.equals(Submit_popup)) {
					System.out.println("Matched exp value :" + Submitted_popup + "actual value :" + Submit_popup);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + Submitted_popup
							+ " || Actual Value is : " + Submit_popup, test, test1);
				} else {
					System.out.println("Not matched exp value :" + Submitted_popup + "actual value :" + Submit_popup);
					Extent_fail(driver, "Matched || " + " Expected Value is : " + Submitted_popup
							+ " || Actual Value is : " + Submit_popup, test, test1);
				}
				Step_End(16,
						"If any amount is defined for that activity then check the amount of the activities in CAR screen.If it matches or less than the amount when compared with the amount of the activity screen means,then Select the activity and click the submit option",
						test, test1);

				Step_Start(17, "Then check the status column in the AG grid,it should show the status as Auto Approved",
						test, test1);

				waitForElement(driver, MSC_Column_Filt_CAR);
				click(driver, MSC_Column_Filt_CAR);

				waitForElement(driver, MSC_Filter_input_CAR);
				jsClick(driver, MSC_SelectAll_Checkbox_CAR);

				List<String> ExpensiveTable_Headers2 = splitAndExpand(MSC_Headers_Names);
				for (String FilterHeader : ExpensiveTable_Headers2) {
					waitForElement(driver, MSC_Filter_input_CAR);
					clear(driver, MSC_Filter_input_CAR);
					waitForElement(driver, MSC_Filter_input_CAR);
					sendKeys(driver, MSC_Filter_input_CAR, FilterHeader);

					String checkbox = String.format(Select_Column_MSC_CAR, FilterHeader);
					waitForDisplay(driver, checkbox);
					jsClick(driver, checkbox);
				}
				waitForElement(driver, MSC_Column_Filt_CAR);
				jsClick(driver, MSC_Column_Filt_CAR);

				waitForElement(driver, Activity_Code_Side_Menu);
				click(driver, Activity_Code_Side_Menu);

				waitForElement(driver, Activity_Code_Filter);
				click(driver, Activity_Code_Filter);

				waitForElement(driver, Activity_Code_SelectAll_Option);
				click(driver, Activity_Code_SelectAll_Option);

				List<String> ActivityHeaders2 = splitAndExpand(Activity_Headers);
				for (String FilterHeader : ActivityHeaders2) {
					waitForElement(driver, Activity_Code_Input_Field);
					clear(driver, Activity_Code_Input_Field);
					waitForElement(driver, Activity_Code_Input_Field);
					sendKeys(driver, Activity_Code_Input_Field, FilterHeader);

					String checkbox = String.format(Activity_code_Select_column, FilterHeader);
					waitForDisplay(driver, checkbox);
					jsClick(driver, checkbox);
				}

				waitForElement(driver, Activity_Code_Filter);
				click(driver, Activity_Code_Filter);

				String row_value = getText(driver, Car_status_Row_Option);
				System.out.println("row_value : " + row_value);

				if (Auto_Approved_status.equals(row_value)) {

					System.out.println("Matched exp value :" + Auto_Approved_status + "actual value :" + row_value);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + Auto_Approved_status
							+ " || Actual Value is : " + row_value, test, test1);

				} else {
					System.out.println("Not Matched exp value :" + Auto_Approved_status + "actual value :" + row_value);
					Extent_fail(driver, "Not Matched || " + " Expected Value is : " + Auto_Approved_status
							+ " || Actual Value is : " + row_value, test, test1);

				}
				Step_End(17, "Then check the status column in the AG grid,it should show the status as Auto Approved",
						test, test1);

			}
		}

	}
}
