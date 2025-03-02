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

public class TC_Cost_Activity_Report_TS048 extends Keywords {

	public void Cost_Activity_Report_TS048(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS048";
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
		String Cost_Equipment_Grouping_Module = data.get("Cost_Equipment_Grouping_Module");
		String Select_ContractCode = data.get("Select_ContractCode");
		String Select_Terminal = data.get("Select_Terminal");
		String Select_Port = data.get("Select_Port");
		String Condition2 = data.get("Condition2");
		String VendorColumn = data.get("VendorColumn");

		String Service_Filter_Header = data.get("Service_Filter_Header");
		String Vessel_Filter_Header = data.get("Vessel_Filter_Header");
		String Port_Filter_Header = data.get("Port_Filter_Header");
		String Terminal_Filter_Header = data.get("Terminal_Filter_Header");
		String ArrivalDate_Filter_Header = data.get("ArrivalDate_Filter_Header");

		String Contract_option = String.format(Select_ContractType, GivenContract_Type);
		String Mode_option = String.format(Select_ModeOption, GivenMode);

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

		twoColumnSearchWindow(driver, Service_Filter_Header, Condition1, Service);

		Step_End(3, "Click on the Service search button and select the required service code", test, test1);

		Step_Start(4, "Click on the Vessel search button and select the required vessel code", test, test1);

		waitForElement(driver, Vessel_Search);
		click(driver, Vessel_Search);

		twoColumnSearchWindow(driver, Vessel_Filter_Header, Condition1, Vessel);

		Step_End(4, "Click on the Vessel search button and select the required vessel code", test, test1);

		Step_Start(5, "Click on the Port search button and select the required port code", test, test1);

		waitForElement(driver, port_Search);
		click(driver, port_Search);

		twoColumnSearchWindow(driver, Port_Filter_Header, Condition1, Port);

		Step_End(5, "Click on the Port search button and select the required port code", test, test1);

		Step_Start(6, "Click on the Terminal search button and select the required terminal code", test, test1);

		waitForElement(driver, Terminal_Search);
		click(driver, Terminal_Search);

		twoColumnSearchWindow(driver, Terminal_Filter_Header, Condition1, Terminal);

		Step_End(6, "Click on the Terminal search button and select the required terminal code", test, test1);

		Step_Start(7, "Click on the Arrival date search button and select the required date", test, test1);

		waitForElement(driver, ArrivalDate_Search);
		click(driver, ArrivalDate_Search);

		twoColumnSearchWindow(driver, ArrivalDate_Filter_Header, Condition1, Arrival_Date);

		Step_End(7, "Click on the Arrival date search button and select the required date", test, test1);

		Step_Start(8, "Click on the Show button", test, test1);

		waitForElement(driver, Show_Button);
		click(driver, Show_Button);

		if (isdisplayed(driver, popup_Message_Yes_Button)) {

			click(driver, popup_Message_Yes_Button);
		}

		Step_End(8, "Click on the Show button", test, test1);

		Step_Start(9, "Click the Predictable reporting tab", test, test1);

		waitForElement(driver, Predictable_reporting);
		click(driver, Predictable_reporting);

		Step_End(9, "Click the Predictable reporting tab", test, test1);

		Step_Start(10, "Copy the Equipment type, Version No, Contract No and Head of all the predictable activities",
				test, test1);

		waitForElement(driver, Predictable_reporting_columns);
		click(driver, Predictable_reporting_columns);

		waitForDisplay(driver, PR_Deselect);
		jsClick(driver, PR_Deselect);

		List<String> filtercolumns = splitAndExpand(FilterColumn);

		for (String columnname : filtercolumns) {

			waitForElement(driver, PR_FilterInput);
			clear(driver, PR_FilterInput);
			sendKeys(driver, PR_FilterInput, columnname);

			jsClick(driver, PR_Deselect);
		}

		List<WebElement> PR_EqpType_Field = driver.findElements(By.xpath(
				"//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//div[@col-id='eqpType' and @role='gridcell']"));
		List<WebElement> PR_ContractNo_Field = driver.findElements(By.xpath(
				"//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//div[@col-id='contractNo' and @role='gridcell']"));
		List<WebElement> PR_VersionNo_Field = driver.findElements(By.xpath(
				"//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//div[@col-id='versionNo' and @role='gridcell']"));
		List<WebElement> PR_Head_Field = driver.findElements(By.xpath(
				"//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//div[@col-id='head' and @role='gridcell']"));
		List<WebElement> PR_ChargeRate_Field = driver.findElements(By.xpath(
				"//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//div[@col-id='chargerate' and @role='gridcell']"));

		List<String> PR_EqpType = new ArrayList<String>();
		List<String> PR_ContractNo = new ArrayList<String>();
		List<String> PR_VersionNo = new ArrayList<String>();
		List<String> PR_Head = new ArrayList<String>();
		List<String> PR_ChargeRate = new ArrayList<String>();

		for (int i = 0; i < PR_EqpType_Field.size(); i++) {

			String eqptype = PR_EqpType_Field.get(i).getText();
			PR_EqpType.add(eqptype);

			String contractno = PR_ContractNo_Field.get(i).getText();

			PR_ContractNo.add(contractno);

			String VersionNo = PR_VersionNo_Field.get(i).getText();

			PR_VersionNo.add(VersionNo);

			String Head = PR_Head_Field.get(i).getText();

			PR_Head.add(Head);

			String ChargeRate = PR_ChargeRate_Field.get(i).getText();

			PR_ChargeRate.add(ChargeRate);

		}

		Step_End(10, "Copy the Equipment type, Version No, Contract No and Head of all the predictable activities",
				test, test1);

		System.out.println("PR_EqpType : " + PR_EqpType);

		Step_Start(13, "Enter the screen name as Cost Equipment Grouping in the module search field", test, test1);

		moduleNavigate(driver, Cost_Equipment_Grouping_Module);

		Step_End(13, "Enter the screen name as Cost Equipment Grouping in the module search field", test, test1);

		for (int i = 0; i < PR_EqpType.size(); i++) {

			Step_Start(14, "Click on the global search option in the toolbar. A new window will be opened", test,
					test1);
			
			Step_Start(15, "Enter the required Contract code in the Contract Code field", test, test1);

			Step_End(16, "Enter the copied port code in the port field", test, test1);
			
			Step_Start(17, "Enter the copied terminal code in the terminal field", test, test1);
			
			Step_Start(18, "Click on the search option", test, test1);

			waitForElement(driver, SearchButton_Toolbar);
			click(driver, SearchButton_Toolbar);

			if (isdisplayed(driver, type_Select1)) {

				System.out.println("New Search window got opened");
				Extent_pass(driver, "New Search window got opened", test, test1);
			} else {

				System.out.println("New Search window not got opened");
				Extent_fail(driver, "New Search window not got opened", test, test1);
			}
			
			globalValueSearchWindow1(driver, Condition2, Select_ContractCode, GivenContract_Type, Select_Port, Port,
					Select_Terminal, Terminal);

			Step_End(14, "Click on the global search option in the toolbar. A new window will be opened", test, test1);

			Step_End(15, "Enter the required Contract code in the Contract Code field", test, test1);

			Step_End(17, "Enter the copied terminal code in the terminal field", test, test1);

			Step_End(18, "Click on the search option", test, test1);

			if (isdisplayed(driver, CAR_Norecords)) {

				Step_Start(21,
						"If the records are not shown, clear the port and terminal codes in the port and terminal field and enter only the contract code in the contract code field in that new window.Click on the search option. Select the record where no port and terminal is given.Click on the select option",
						test, test1);

				System.out.println("No records found");
				clear(driver, globalSearch_InputTextfield3);
				clear(driver, globalSearch_InputTextfield2);

				waitForElement(driver, globalSearch_Frame_SearchButton);
				click(driver, globalSearch_Frame_SearchButton);

				waitForElement(driver, Port_sort);
				click(driver, Port_sort);

				Step_End(21,
						"If the records are not shown, clear the port and terminal codes in the port and terminal field and enter only the contract code in the contract code field in that new window.Click on the search option. Select the record where no port and terminal is given.Click on the select option",
						test, test1);

			}

			Step_Start(19, "If the record is shown, select the record and click on the select option", test, test1);

			waitForElement(driver, Select1);
			click(driver, Select1);

			waitForElement(driver, SelectButton);
			click(driver, SelectButton);

			Step_End(19, "If the record is shown, select the record and click on the select option", test, test1);

			Step_Start(20,
					"Check whether the copied equipment type from CAR matches with the mapped equipment in the cost equipment grouping. Copy that contract equipments",
					test, test1);

			Step_Start(22,
					"Check whether the copied equipment type from CAR matches with the mapped equipment in the cost equipment grouping. Copy that contract equipments",
					test, test1);

			waitForElement(driver, MappedEquipmentFilter);
			click(driver, MappedEquipmentFilter);
			sendKeys(driver, MappedEquipmentFilter, PR_EqpType.get(i));

			waitForElement(driver, Contract_Equipment_Value);
			String contract_equipment = getText(driver, Contract_Equipment_Value);

			Step_End(20,
					"Check whether the copied equipment type from CAR matches with the mapped equipment in the cost equipment grouping. Copy that contract equipments",
					test, test1);

			Step_End(22,
					"Check whether the copied equipment type from CAR matches with the mapped equipment in the cost equipment grouping. Copy that contract equipments",
					test, test1);

			Step_Start(23, "Go to the CAR screen. Click on the contract used option", test, test1);

			waitForElement(driver, CAR_Tab);
			click(driver, CAR_Tab);

			waitForElement(driver, Contract_Used);
			click(driver, Contract_Used);

			Step_End(23, "Go to the CAR screen. Click on the contract used option", test, test1);

			Step_Start(24, "Select the Contract No  which matches with the copied Contract No", test, test1);

			String Contract = String.format(Select_Contract, PR_ContractNo.get(i));

			waitForElement(driver, Contract);
			click(driver, Contract);

			Step_End(24, "Select the Contract No  which matches with the copied Contract No", test, test1);

			Step_Start(25, "Right click on the selected Contract No and click on the Show Contract option", test,
					test1);

			RightClick(driver, Contract);

			waitForElement(driver, Show_Contract);
			click(driver, Show_Contract);

			Step_End(25, "Right click on the selected Contract No and click on the Show Contract option", test, test1);

			Step_Start(26, "Ensure that system opens the vendor contract screen with the selected Contract No", test,
					test1);

			waitForElement(driver, Vendor_Contracts);

			Step_End(26, "Ensure that system opens the vendor contract screen with the selected Contract No", test,
					test1);

			Step_Start(27, "Filter the Head of the activities with the head of the activities copied from CAR screen",
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

			Step_End(27, "Filter the Head of the activities with the head of the activities copied from CAR screen",
					test, test1);

			Step_Start(28,
					"Ensure that the Copied equipment type from Cost equipment grouping screen matches with Equipment type of  the Vendor contract",
					test, test1);

			waitForElement(driver, Vendor_Filter);
			click(driver, Vendor_Filter);

			waitForElement(driver, Eqp_Filter);
			sendKeys(driver, Eqp_Filter, contract_equipment);

			Step_End(28,
					"Ensure that the Copied equipment type from Cost equipment grouping screen matches with Equipment type of  the Vendor contract",
					test, test1);

			Step_Start(29, "Copy the amount from the vendor contract and Go to the CAR screen", test, test1);

			String VendorAmounts_field = String.format(Vendor_Amount, PR_Head.get(i));

			String VendorAmounts = getText(driver, VendorAmounts_field);

			Step_End(29, "Copy the amount from the vendor contract and Go to the CAR screen", test, test1);

			Step_Start(30,
					"Check whether the copied amount from the vendor contracts matches with the charge rate in CAR screen",
					test, test1);

			scrollTop(driver);

			if (PR_ChargeRate.get(i).equals(VendorAmounts)) {

				System.out.println("Charge rate is displayed as per the vendor contracts || Expected : " + VendorAmounts
						+ " Actual : " + PR_ChargeRate.get(i));
				Extent_pass(driver, "Charge rate is displayed as per the vendor contracts || Expected : "
						+ VendorAmounts + " Actual : " + PR_ChargeRate.get(i), test, test1);
			} else {
				System.out.println("Charge rate is not displayed as per the vendor contracts || Expected : "
						+ VendorAmounts + " Actual : " + PR_ChargeRate.get(i));
				Extent_fail(driver, "Charge rate is not displayed as per the vendor contracts || Expected : "
						+ VendorAmounts + " Actual : " + PR_ChargeRate.get(i), test, test1);
			}

			waitForElement(driver, Close_VendorTab);
			click(driver, Close_VendorTab);

			waitForElement(driver, Tab2);
			click(driver, Tab2);

			Step_End(30,
					"Check whether the copied amount from the vendor contracts matches with the charge rate in CAR screen",
					test, test1);

		}

		waitForElement(driver, CAR_Tab);
		click(driver, CAR_Tab);

		Step_Start(11, "Click the unpredictable reporting tab", test, test1);

		waitForElement(driver, UnpredictableTab);
		click(driver, UnpredictableTab);

		Step_End(11, "Click the unpredictable reporting tab", test, test1);

		Step_Start(12, "Copy the Equipment type, Version No, Contract No and Head of all the unpredictable activities",
				test, test1);

		waitForElement(driver, UnPredictable_reporting_columns);
		click(driver, UnPredictable_reporting_columns);

		waitForDisplay(driver, UPR_Deselect);
		jsClick(driver, UPR_Deselect);

		for (String columnname : filtercolumns) {

			waitForElement(driver, UPR_FilterInput);
			clear(driver, UPR_FilterInput);
			sendKeys(driver, UPR_FilterInput, columnname);

			jsClick(driver, UPR_Deselect);
		}

		List<WebElement> UPR_EqpType_Field = driver.findElements(By.xpath(
				"//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[@col-id='eqpType' and @role='gridcell']"));
		List<WebElement> UPR_ContractNo_Field = driver.findElements(By.xpath(
				"//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[@col-id='contractNo' and @role='gridcell']"));
		List<WebElement> UPR_VersionNo_Field = driver.findElements(By.xpath(
				"//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[@col-id='versionNo' and @role='gridcell']"));
		List<WebElement> UPR_Head_Field = driver.findElements(By
				.xpath("//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[@col-id='head' and @role='gridcell']"));
		List<WebElement> UPR_ChargeRate_Field = driver.findElements(By.xpath(
				"//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[@col-id='chargerate' and @role='gridcell']"));

		List<String> UPR_EqpType = new ArrayList<String>();
		List<String> UPR_ContractNo = new ArrayList<String>();
		List<String> UPR_VersionNo = new ArrayList<String>();
		List<String> UPR_Head = new ArrayList<String>();
		List<String> UPR_ChargeRate = new ArrayList<String>();

		for (int i = 0; i < UPR_EqpType_Field.size(); i++) {

			String eqptype = UPR_EqpType_Field.get(i).getText();
			UPR_EqpType.add(eqptype);

			String contractno = UPR_ContractNo_Field.get(i).getText();

			UPR_ContractNo.add(contractno);

			String VersionNo = UPR_VersionNo_Field.get(i).getText();

			UPR_VersionNo.add(VersionNo);

			String Head = UPR_Head_Field.get(i).getText();

			UPR_Head.add(Head);

			String ChargeRate = UPR_ChargeRate_Field.get(i).getText();

			UPR_ChargeRate.add(ChargeRate);

		}

		Step_End(12, "Copy the Equipment type, Version No, Contract No and Head of all the unpredictable activities",
				test, test1);

		Step_Start(13, "Enter the screen name as Cost Equipment Grouping in the module search field", test, test1);

		System.out.println("PR_EqpType : " + PR_EqpType);

		for (int i = 0; i < UPR_EqpType.size(); i++) {

			waitForElement(driver, Tab2);
			click(driver, Tab2);

			Step_End(13, "Enter the screen name as Cost Equipment Grouping in the module search field", test, test1);

			waitForElement(driver, SearchButton_Toolbar);
			click(driver, SearchButton_Toolbar);

			if (isdisplayed(driver, type_Select1)) {

				System.out.println("New Search window got opened");
				Extent_pass(driver, "New Search window got opened", test, test1);
			} else {

				System.out.println("New Search window not got opened");
				Extent_fail(driver, "New Search window not got opened", test, test1);
			}

			Step_End(14, "Click on the global search option in the toolbar. A new window will be opened", test, test1);

			Step_Start(15, "Enter the required Contract code in the Contract Code field", test, test1);
			
			Step_Start(16, "Enter the copied port code in the port field", test, test1);
			
			Step_Start(17, "Enter the copied terminal code in the terminal field", test, test1);

			Step_Start(18, "Click on the search option", test, test1);
			
			globalValueSearchWindow1(driver, Condition2, Select_ContractCode, GivenContract_Type, Select_Port, Port,
					Select_Terminal, Terminal);


//			waitForElement(driver, type_Select1);
//			click(driver, type_Select1);
//			selectByText(driver, type_Select1, Select_ContractCode);
//			click(driver, globalSearch_Condition_Dropdown1);
//			selectByText(driver, globalSearch_Condition_Dropdown1, Condition2);
//			clearAndType(driver, globalSearch_InputTextfield1, GivenContract_Type);

			Step_End(15, "Enter the required Contract code in the Contract Code field", test, test1);


//			waitForElement(driver, type_Select2);
//			click(driver, type_Select2);
//			selectByText(driver, type_Select2, Select_Port);
//			click(driver, globalSearch_Condition_Dropdown2);
//			selectByText(driver, globalSearch_Condition_Dropdown2, Condition2);
//			clearAndType(driver, globalSearch_InputTextfield2, Port);

			Step_End(16, "Enter the copied port code in the port field", test, test1);

//			waitForElement(driver, type_Select3);
//			click(driver, type_Select3);
//			selectByText(driver, type_Select3, Select_Terminal);
//			click(driver, globalSearch_Condition_Dropdown3);
//			selectByText(driver, globalSearch_Condition_Dropdown3, Condition2);
//			clearAndType(driver, globalSearch_InputTextfield3, Terminal);

			Step_End(17, "Enter the copied terminal code in the terminal field", test, test1);


			Step_End(18, "Click on the search option", test, test1);

			if (isdisplayed(driver, CAR_Norecords)) {

				Step_Start(21,
						"If the records are not shown, clear the port and terminal codes in the port and terminal field and enter only the contract code in the contract code field in that new window.Click on the search option. Select the record where no port and terminal is given.Click on the select option",
						test, test1);

				System.out.println("No records found");
				clear(driver, globalSearch_InputTextfield3);
				clear(driver, globalSearch_InputTextfield2);

				waitForElement(driver, globalSearch_Frame_SearchButton);
				click(driver, globalSearch_Frame_SearchButton);

				waitForElement(driver, Port_sort);
				click(driver, Port_sort);

				Step_End(21,
						"If the records are not shown, clear the port and terminal codes in the port and terminal field and enter only the contract code in the contract code field in that new window.Click on the search option. Select the record where no port and terminal is given.Click on the select option",
						test, test1);

			}

			Step_Start(19, "If the record is shown, select the record and click on the select option", test, test1);

			waitForElement(driver, Select1);
			click(driver, Select1);

			waitForElement(driver, SelectButton);
			click(driver, SelectButton);

			Step_End(19, "If the record is shown, select the record and click on the select option", test, test1);

			Step_Start(20,
					"Check whether the copied equipment type from CAR matches with the mapped equipment in the cost equipment grouping. Copy that contract equipments",
					test, test1);

			Step_Start(22,
					"Check whether the copied equipment type from CAR matches with the mapped equipment in the cost equipment grouping. Copy that contract equipments",
					test, test1);

			waitForElement(driver, MappedEquipmentFilter);
			click(driver, MappedEquipmentFilter);
			sendKeys(driver, MappedEquipmentFilter, UPR_EqpType.get(i));

			waitForElement(driver, Contract_Equipment_Value);
			
			String contract_equipment = getText(driver, Contract_Equipment_Value);

			Step_End(20,
					"Check whether the copied equipment type from CAR matches with the mapped equipment in the cost equipment grouping. Copy that contract equipments",
					test, test1);

			Step_End(22,
					"Check whether the copied equipment type from CAR matches with the mapped equipment in the cost equipment grouping. Copy that contract equipments",
					test, test1);

			Step_Start(23, "Go to the CAR screen. Click on the contract used option", test, test1);

			waitForElement(driver, CAR_Tab);
			click(driver, CAR_Tab);

			waitForElement(driver, Contract_Used);
			click(driver, Contract_Used);

			Step_End(23, "Go to the CAR screen. Click on the contract used option", test, test1);

			Step_Start(24, "Select the Contract No  which matches with the copied Contract No", test, test1);

			String Contract = String.format(Select_Contract, UPR_ContractNo.get(i));

			waitForElement(driver, Contract);
			click(driver, Contract);

			Step_End(24, "Select the Contract No  which matches with the copied Contract No", test, test1);

			Step_Start(25, "Right click on the selected Contract No and click on the Show Contract option", test,
					test1);

			RightClick(driver, Contract);

			waitForElement(driver, Show_Contract);
			click(driver, Show_Contract);

			Step_End(25, "Right click on the selected Contract No and click on the Show Contract option", test, test1);

			Step_Start(26, "Ensure that system opens the vendor contract screen with the selected Contract No", test,
					test1);

			waitForElement(driver, Vendor_Contracts);

			Step_End(26, "Ensure that system opens the vendor contract screen with the selected Contract No", test,
					test1);

			Step_Start(27, "Filter the Head of the activities with the head of the activities copied from CAR screen",
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

			Step_End(27, "Filter the Head of the activities with the head of the activities copied from CAR screen",
					test, test1);

			Step_Start(28,
					"Ensure that the Copied equipment type from Cost equipment grouping screen matches with Equipment type of  the Vendor contract",
					test, test1);

			waitForElement(driver, Vendor_Filter);
			click(driver, Vendor_Filter);

			waitForElement(driver, Eqp_Filter);
			sendKeys(driver, Eqp_Filter, contract_equipment);

			Step_End(28,
					"Ensure that the Copied equipment type from Cost equipment grouping screen matches with Equipment type of  the Vendor contract",
					test, test1);

			Step_Start(29, "Copy the amount from the vendor contract and Go to the CAR screen", test, test1);

			String VendorAmounts_field = String.format(Vendor_Amount, UPR_Head.get(i));

			String VendorAmounts = getText(driver, VendorAmounts_field);

			Step_End(29, "Copy the amount from the vendor contract and Go to the CAR screen", test, test1);

			Step_Start(30,
					"Check whether the copied amount from the vendor contracts matches with the charge rate in CAR screen",
					test, test1);

			scrollTop(driver);

			if (UPR_ChargeRate.get(i).equals(VendorAmounts)) {

				System.out.println("Charge rate is displayed as per the vendor contracts || Expected : " + VendorAmounts
						+ " Actual : " + UPR_ChargeRate.get(i));
				Extent_pass(driver, "Charge rate is displayed as per the vendor contracts || Expected : "
						+ VendorAmounts + " Actual : " + UPR_ChargeRate.get(i), test, test1);
			} else {
				System.out.println("Charge rate is not displayed as per the vendor contracts || Expected : "
						+ VendorAmounts + " Actual : " + UPR_ChargeRate.get(i));
				Extent_fail(driver, "Charge rate is not displayed as per the vendor contracts || Expected : "
						+ VendorAmounts + " Actual : " + UPR_ChargeRate.get(i), test, test1);
			}

			waitForElement(driver, Close_VendorTab);
			click(driver, Close_VendorTab);

			Step_End(30,
					"Check whether the copied amount from the vendor contracts matches with the charge rate in CAR screen",
					test, test1);

		}

		Extent_completed(tc_Name, test, test1);

	}

}
