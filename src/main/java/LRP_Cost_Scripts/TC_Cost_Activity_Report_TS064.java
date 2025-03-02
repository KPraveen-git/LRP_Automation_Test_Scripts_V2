package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS064 extends Keywords {

	public void Cost_Activity_Report_TS064(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS064";
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
		String ExpectedpopupMessage = data.get("ExpectedpopupMessage");
		String Contract_Type_Code_Headers = data.get("Contract_Type_Code_Headers");
		String Port_Filter_Header = data.get("Port_Filter_Header");
		String Terminal_Filter_Header = data.get("Terminal_Filter_Header");
		String Agency = data.get("Agency");
		String Tax_creation_activityCode = data.get("Tax_creation_activityCode");

		String Updated_Popup = data.get("Updated_Popup");
		String Quantity = data.get("Quantity");
		String EqpType = data.get("EqpType");
		String Vendor_Code = data.get("Vendor_Code");
		String Amount = data.get("Amount");
		String EqpType_Filter_Header = data.get("EqpType_Filter_Header");
		String VendorCode_Filter_Header = data.get("VendorCode_Filter_Header");
		String ActivityCode_Header = data.get("ActivityCode_Header");
		String Given_Currency = data.get("Given_Currency");
		String Filter_Columns = data.get("Filter_Columns");

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);

		navigateUrl(driver, url);

		LRP_Login(driver, username, password);

		SwitchProfile(driver, Agency);

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

		String contractType = getText(driver, Contract_type);

		waitForElement(driver, Arrival_Date);
		String Arrival_Date_value = getAttribute(driver, Arrival_Date, "value");

		waitForElement(driver, Port_Input);
		String portname = getAttribute(driver, Port_Input, "value");

		waitForElement(driver, Terminal_Input);
		String TerminalName = getAttribute(driver, Terminal_Input, "value");

		moduleNavigate(driver, Service_Tax_Module);

		Step_End(12, "Next enter the screen name as Service tax in the module search field", test, test1);

		Step_Start(13,
				"Select the required type(Service tax/GST),contract type, valid from, valid to, type, port ,terminal, contract number or vendor.",
				test, test1);

		waitForElement(driver, Type_Search);
		click(driver, Type_Search);

		twoColumnSearchWindow(driver, Contract_Type_Code_Headers, Condition2, contractType);

		String Validfrom = startdate(Arrival_Date_value);

		String validto = Enddate(Arrival_Date_value);

		waitForElement(driver, TaxDate);
		selectDatePicker(driver, TaxDate, Validfrom);

		waitForElement(driver, Tax_ValidTo);
		selectDatePicker(driver, Tax_ValidTo, validto);

		waitForElement(driver, Tax_Port_Search);
		click(driver, Tax_Port_Search);

		twoColumnSearchWindow(driver, Port_Filter_Header, Condition2, portname);

		if (isdisplayed(driver, Tax_Terminal_Search) && isElementEnabled(driver, Tax_Terminal_Search)) {

			waitForElement(driver, Tax_Terminal_Search);
			click(driver, Tax_Terminal_Search);

			twoColumnSearchWindow(driver, Terminal_Filter_Header, Condition2, TerminalName);

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

		List<String> serivce_activity = splitAndExpand(Tax_creation_activityCode);
		List<String> Tax_Option = splitAndExpand(TypeOFTax_Option);

		boolean flag = true;

		List<String> Givenpercentage = splitAndExpand(PercentageValue);
		
		for (int i = 0; i < Integer.parseInt(totalcount); i++) {

			String gridcolumn = String.format(ServiceTax_Grid, i);

			String actvitycode = getText(driver, gridcolumn);

			if (serivce_activity.contains(actvitycode)) {

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

					String giventax = Tax_Option.get(i);

					String TypeofTax_Option = String.format(Select_TypeOfTax, giventax);

					waitForElement(driver, TypeofTax_Option);
					click(driver, TypeofTax_Option);

					waitForElement(driver, Tax_Show);
					jsClick(driver, ChargeType);

					String ChargeTypes_Option = String.format(Select_TypeOfTax, ChargeType_Option);

					waitForElement(driver, ChargeTypes_Option);
					click(driver, ChargeTypes_Option);

					if (ChargeType_Option.equalsIgnoreCase("Percentage")) {

						waitForElement(driver, Tax_Show);
						jsClick(driver, PercentageInputField);

						sendKeysUsingActions(driver, PercentageInputField, Givenpercentage.get(i));

					}

					waitForElement(driver, Tax_Show);
					jsClick(driver, Activity_Dropdown_click);

					waitForElement(driver, Tax_Show);

					wait(driver, "2");
					jsClick(driver, Activity_Dropdown);

					String ActivityOption = String.format(Select_TypeOfTax, actvitycode);

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

			} else {

				waitForElement(driver, gridcolumn);
				click(driver, gridcolumn);
				RightClick(driver, gridcolumn);

				waitForElement(driver, RemoveTax);
				click(driver, RemoveTax);

				if (isdisplayed(driver, popup_Message_Yes_Button)) {

					waitForElement(driver, popup_Message_Yes_Button);
					click(driver, popup_Message_Yes_Button);

				}

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


		int i = 0;

		for (String Selectedactivitycode : serivce_activity) {

			waitForElement(driver, Edit_Button_toolBar);
			click(driver, Edit_Button_toolBar);

			waitForElement(driver, ADD_button_MSC_CAR);
			click(driver, ADD_button_MSC_CAR);
			Step_End(10, "Click on the Add button and system will list down the activities in new window", test, test1);

			Step_Start(11, "Select the activities by clicking on the check box.", test, test1);

			twoColumnSearchWindow(driver, ActivityCode_Header, Condition2, Selectedactivitycode);

			Step_End(11, "Select the activities by clicking on the check box.", test, test1);

			Step_Start(12, "Click on the select button", test, test1);

			String UpdatedActivityQuantColumn = String.format(MSC_table_Quantity_Column_CAR_New, Selectedactivitycode);
			waitForElement(driver, UpdatedActivityQuantColumn);
			doubleClick(driver, UpdatedActivityQuantColumn);

			String UpdatedActivityQuan = String.format(MSC_table_Quantity_input_CAR_New, Selectedactivitycode);
			waitForElement(driver, UpdatedActivityQuan);
			sendKeys(driver, UpdatedActivityQuan, Quantity);
			Step_End(14, "Then select the activities in AG grid and Enter the required quantity", test, test1);

			Step_Start(15, "Click on the Eqp. type button and system will list down the activities in new window", test,
					test1);
			String UpdatedActivity = String.format(MSC_table_Activity_Column_CAR_New, Selectedactivitycode);
			waitForElement(driver, UpdatedActivity);
			click(driver, UpdatedActivity);

			waitForElement(driver, MSC_Equipment_Type_Button_CAR);
			click(driver, MSC_Equipment_Type_Button_CAR);
			Step_End(15, "Click on the Eqp. type button and system will list down the activities in new window", test,
					test1);

			Step_Start(16, ".Select the required Equipment type and click on the select button", test, test1);
			twoColumnSearchWindow(driver, EqpType_Filter_Header, Condition2, EqpType);

			Step_End(16, ".Select the required Equipment type and click on the select button", test, test1);

			Step_Start(17,
					"Check whether the equipment type is set in the activity and click on the vendor code button,system will listdown the vendor details in new window",
					test, test1);
			String Selected_EqpType = String.format(MSC_Table_EqpType_Column_CAR_New, Selectedactivitycode);
			waitForElement(driver, Selected_EqpType);
			String Updated_EpqType = getText(driver, Selected_EqpType);
			if (Updated_EpqType.equals(EqpType)) {
				System.out.println("Selected Eqp Type is updated Correctly in the Table");
				Extent_pass(driver, "Selected Eqp Type is updated Correctly in the Table", test, test1);
			} else {
				System.out.println("Selected Eqp Type is not updated Correctly in the Table");
				Extent_fail(driver, "Selected Eqp Type is not updated Correctly in the Table", test, test1);
			}

			waitForElement(driver, MSC_Vendor_Code_Button_CAR);
			click(driver, MSC_Vendor_Code_Button_CAR);
			Step_End(17,
					"Check whether the equipment type is set in the activity and click on the vendor code button,system will listdown the vendor details in new window",
					test, test1);

			Step_Start(18, "Select the required vendor code", test, test1);
			twoColumnSearchWindow(driver, VendorCode_Filter_Header, Condition2, Vendor_Code);
			Step_End(18, "Select the required vendor code", test, test1);

			Step_Start(19, "Enter the required amount by selecting each activity one by one", test, test1);
			String Selected_VendorCode = String.format(MSC_Table_Vendor_Code_Column_CAR_New, Selectedactivitycode);
			waitForElement(driver, Selected_VendorCode);
			String Updated_VendorCode = getText(driver, Selected_VendorCode);
			if (Updated_VendorCode.equals(Vendor_Code)) {
				System.out.println("Selected Vendor Code is updated Correctly in the Table");
				Extent_pass(driver, "Selected Vendor Code is updated Correctly in the Table", test, test1);
			} else {
				System.out.println("Selected Vendor Code is not updated Correctly in the Table");
				Extent_fail(driver, "Selected Vendor Code is not updated Correctly in the Table", test, test1);
			}

			String Activity_Amount_Col = String.format(MSC_Table_Amount_Column_CAR_New, Selectedactivitycode);
			waitForElement(driver, Activity_Amount_Col);
			doubleClick(driver, Activity_Amount_Col);

			String Activity_Amount_Input = String.format(MSC_Table_Amount_Input_CAR_New, Selectedactivitycode);
			waitForElement(driver, Activity_Amount_Input);
			clear(driver, Activity_Amount_Input);
			waitForElement(driver, Activity_Amount_Input);
			sendKeys(driver, Activity_Amount_Input, Amount);
			UpdatedActivityQuantColumn = String.format(MSC_table_Quantity_Column_CAR_New, Selectedactivitycode);
			waitForElement(driver, UpdatedActivityQuantColumn);
			click(driver, UpdatedActivityQuantColumn);

			String Activity_Currency_Col = String.format(MSC_Table_Cuurency_Column_CAR_New, Selectedactivitycode);
			waitForElement(driver, Activity_Currency_Col);
			doubleClick(driver, Activity_Currency_Col);

			wait(driver, "3");

			Actions act = new Actions(driver);

			String giventext = Given_Currency.substring(0, 1); // Extracts "I"

			act.sendKeys(giventext).perform();

			wait(driver, "3");

			// Locate the list of elements
			List<WebElement> elements = driver.findElements(By.xpath(
					"(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actdesc' and text()='DETENTION CHARGES']"
							+ "//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='currency'])[last()]//following::span"));

			for (WebElement ele : elements) {
				String text = ele.getText().trim();

				if (text.isEmpty()) {
					System.out.println("No text is available");
				} else {

					System.out.println("text : " + text);
					if (text.equals(Given_Currency)) {
						ele.click();
						break;
					} else {
						act.sendKeys(Keys.ARROW_DOWN).perform();
					}
				}
			}

			scrollTop(driver);

			waitForElement(driver, Save_button_toolBar);
			click(driver, Save_button_toolBar);

			waitForElement(driver, popup_Message);
			String CAR_savedpopupMessage = getText(driver, popup_Message);

			if (CAR_savedpopupMessage.equals(Updated_Popup)) {

				System.out.println("Service tax was created successfully");
				Extent_pass(driver, "Service tax was created successfully", test, test1);
			} else {
				System.out.println("Service tax was not created");
				Extent_fail(driver, "Service tax was not created", test, test1);

			}

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

			waitForElement(driver, Misc_Columns);
			click(driver, Misc_Columns);

			waitForElement(driver, Misc_FilterInput);
			jsClick(driver, Misc_FilterDeselect);

			List<String> columnnames = splitAndExpand(Filter_Columns);

			for (String column : columnnames) {

				waitForElement(driver, Misc_FilterInput);
				clear(driver, Misc_FilterInput);
				sendKeys(driver, Misc_FilterInput, column);

				jsClick(driver, Misc_FilterDeselect);

			}

			List<String> givenTaxes = splitAndExpand(TypeOFTax_Option);

			String Service_TaxNo_Field = String.format(ServiceTax_Value, Selectedactivitycode);

			waitForElement(driver, Service_TaxNo_Field);
			String Service_TaxNo = getText(driver, Service_TaxNo_Field);

			if (Service_TaxNo.equals(Tx_no)) {

				System.out.println("Created Tax no was updated in the respective activity || Expected : " + Tx_no
						+ " Actual : " + Service_TaxNo);
				Extent_pass(driver, "Created Tax no was updated in the respective activity || Expected : " + Tx_no
						+ " Actual : " + Service_TaxNo, test, test1);

			} else {

				System.out.println("Created Tax no was updated in the respective activity || Expected : " + Tx_no
						+ " Actual : " + Service_TaxNo);
				Extent_fail(driver, "Created Tax no was updated in the respective activity || Expected : " + Tx_no
						+ " Actual : " + Service_TaxNo, test, test1);
			}

			String Taxdetails_Field = String.format(Taxdetails, Selectedactivitycode, givenTaxes.get(i));

			waitForElement(driver, Taxdetails_Field);
			String Taxamount = getText(driver, Taxdetails_Field);

			// Convert the string to a double
			double convertedCost = Double.parseDouble(Amount);

			// Convert percentage string to a double
			double convertedPercentage = Double.parseDouble(Givenpercentage.get(i));

			// Calculate the result by applying the percentage to the cost
			double result = (convertedCost * convertedPercentage) / 100;

			// Convert the result to an integer (removing decimals)
			int integerValue = (int) Math.floor(result);

			// Convert the result to string
			String expectedTax = String.valueOf(integerValue);

			System.out.println("Taxamount : " + Taxamount);

			if (Taxamount.equals(expectedTax)) {

				System.out.println("Taxes are calculated as per the service tax || Expected : " + expectedTax
						+ " || Actual : " + Taxamount);
				Extent_pass(driver, "Taxes are calculated as per the service tax || Expected : " + expectedTax
						+ " || Actual : " + Taxamount, test, test1);
			} else {

				System.out.println("Taxes are not calculated as per the service tax || Expected : " + expectedTax
						+ " || Actual : " + Taxamount);
				Extent_fail(driver, "Taxes are not calculated as per the service tax || Expected : " + expectedTax
						+ " || Actual : " + Taxamount, test, test1);
			}

			i++;

		}

		Extent_completed(tc_Name, test, test1);

	}

}
