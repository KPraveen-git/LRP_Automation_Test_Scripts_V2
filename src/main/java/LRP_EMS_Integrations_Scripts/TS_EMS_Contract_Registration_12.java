package LRP_EMS_Integrations_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TS_EMS_Contract_Registration_12 extends Keywords {

	public void EMS_Contract_Registration12(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) throws Exception {

		String testcase_Name="TS_EMS_Contract_Registration_12";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		String Username = data.get("Username");
		String pass_word = data.get("pass_word");
		String Module_name = data.get("module_name");
		String Activity_data = data.get("Activity_data");
		String Multi_Location = data.get("Multi_Location");
		String Multi_Depot = data.get("Multi_Depot");
		String Multi_Size_and_Type = data.get("Multi_Size_and_Type");
		String Release_refno = data.get("Release_refno");
		String Supplier_Contract_SF = data.get("Supplier_Contract_SF");
		String Equipment_No = data.get("Equipment_No");
		String Global_SearchField = data.get("Global_SearchField");
		String PickUpDropoff_LocationSF = data.get("PickUpDropoff_LocationSF");
		String PickupDropoff_SizetypeSF = data.get("PickupDropoff_SizetypeSF");
		String module_name1 = data.get("module_name1");
		String LeaseKind = data.get("LeaseKind");
		String Maker_Value = data.get("Maker_Value");
		String Pay_Load_Value = data.get("Pay_Load_Value");
		String BL_No = data.get("BL_No");
		String Shipper_Value = data.get("Shipper_Value");
		String Consignee_Value = data.get("Consignee_Value");
		String Remarks_Value = data.get("Remarks_Value");
		String Material_Value = data.get("Material_Value");
		String Gross_Weight_Value = data.get("Gross_Weight_Value");
		String Ref_Num_Value = data.get("Ref_Num_Value");
		String Tare_Value = data.get("Tare_Value");
		String date_Picker = data.get("date_Picker");
		String manufacture_Date = data.get("manufacture_Date");
		String Movement_Entry_ActivityDate = data.get("Movement_Entry_ActivityDate");
		String movement_EntryPopup = data.get("movement_EntryPopup").trim();
		String Version_Input = data.get("Version_Input");
		String Carrier_Input = data.get("Carrier_Input");
		String Version_Search = data.get("Version_Search");
		String Carrier_Search = data.get("Carrier_Search");
		String Contract_No_Search = data.get("Contract_No_Search");
		String condition = data.get("condition");





		String LeaseKind_value =  String.format(LeaseKind_Value,  LeaseKind);

		Extent_Start(testcase_Name, test, test1);

		// login
		navigateUrl(driver, url);
		LRP_Login(driver, Username, pass_word);

		Extent_call(test, test1, "Enter module name in searchbox & click the module");

		Step_Start(1, "Ensure system should allow user to save ONHI move in movement entry", test, test1);

		// search module

		moduleNavigate(driver, Module_name);


		click(driver, multiEntryMovPage_L);
		waitForElement(driver, activitySearchField_L);
		click(driver, activitySearchField_L);

		sendKeys(driver, activitySearchField_L, Activity_data);

		waitForElement(driver, Onhi_Ofhi_select);
		click(driver, Onhi_Ofhi_select);

		waitForElement(driver, Activity_Date);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Activity_Date, Movement_Entry_ActivityDate);
		} else {
			waitForElement(driver, Activity_Date);
			clearAndType(driver, Activity_Date, Movement_Entry_ActivityDate);
		}
		
	
		waitForElement(driver, showInputButton);
		click(driver, showInputButton);


		waitForElement(driver, Multi_Location_SF);
		sendKeys(driver, Multi_Location_SF, Multi_Location);
		waitForElement(driver, Location_select);
		click(driver, Location_select);

		waitForElement(driver, Multi_depot_SF);
		sendKeys(driver, Multi_depot_SF, Multi_Depot);
		waitForElement(driver, Depot_select);
		click(driver, Depot_select);

		waitForElement(driver, Mutli_SizeandType_SF);
		click(driver, Mutli_SizeandType_SF);

		sendKeys(driver, SizeandType_value, Multi_Size_and_Type);
		waitForElement(driver, Size_type_select);
		click(driver, Size_type_select);

		sendKeys(driver, Release_Ref_No, Release_refno);

		sendKeys(driver, Supplier_contract, Supplier_Contract_SF);
		
		
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Manufacture_Date, manufacture_Date);
		} else {
			waitForElement(driver, Manufacture_Date);
			clearAndType(driver, Manufacture_Date, manufacture_Date);
		}
		
		

		if (!LeaseKind.equals("")) {
			waitForElement(driver, Lease_Kind_Dropdown);
			click(driver, Lease_Kind_Dropdown);
			waitForElement(driver, LeaseKind_value);
			click(driver, LeaseKind_value);

		} else {

			System.out.println("LeaseKind " + "Input Not Available in : " + File_Path);
		}

		if (!Maker_Value.equals("")) {
			waitForElement(driver, Maker_TF);
			sendKeys(driver, Maker_TF, Maker_Value);
		} else {

			System.out.println("Maker_Value " + "Input Not Available in : " + File_Path);
		}

		if (!Pay_Load_Value.equals("")) {
			waitForElement(driver, Pay_Load_Tf);
			sendKeys(driver, Pay_Load_Tf, Pay_Load_Value);
		} else {

			System.out.println("Pay_Load_Value " + "Input Not Available in : " + File_Path);
		}


		if (!BL_No.equals("")) {
			List<String> datas1 = splitAndExpand(BL_No);
			for (String data1 : datas1) {

				waitForElement(driver, BL_No_SearchBtn);
				click(driver, BL_No_SearchBtn);
				waitForElement(driver, BL_No_TF);
				sendKeys(driver, BL_No_TF, data1);
			}
		} else {

			System.out.println("BL_No " + "Input Not Available in : " + File_Path);
		}
		if (!Shipper_Value.equals("")) {
			List<String> datas5 = splitAndExpand(Shipper_Value);
			for (String data1 : datas5) {
				waitForElement(driver, Shipper_Tf);
				sendKeys(driver, Shipper_Tf, data1);
			}
		} else {

			System.out.println("Shipper_Value " + "Input Not Available in : " + File_Path);
		}

		if (!Consignee_Value.equals("")) {
			List<String> datas6 = splitAndExpand(Consignee_Value);
			for (String data2 : datas6) {

				waitForElement(driver, Consignee_TF);
				sendKeys(driver, Consignee_TF, data2);
				waitForElement(driver,BL_Select);
				click(driver, BL_Select);
				waitForElement(driver, Select);
				click(driver, Select);
			}
		} else {

			System.out.println("Consignee_Value " + "Input Not Available in : " + File_Path);
		}
		waitForElement(driver, Remarks_TF);
		if (!Remarks_Value.equals("")) {
			waitForElement(driver, Remarks_TF);
			sendKeys(driver, Remarks_TF, Remarks_Value);
		} else {

			System.out.println("Remarks_Value " + "Input Not Available in : " + File_Path);
		}
		waitForElement(driver, Material_TF);
		if (!Material_Value.equals("")) {
			waitForElement(driver, Material_TF);
			sendKeys(driver, Material_TF, Material_Value);
		} else {

			System.out.println("Material_Value " + "Input Not Available in : " + File_Path);
		}

		if (!Gross_Weight_Value.equals("")) {
			waitForElement(driver, Gross_Weight_Tf);
			sendKeys(driver, Gross_Weight_Tf, Gross_Weight_Value);
		} else {

			System.out.println("Gross_Weight_Value " + "Input Not Available in : " + File_Path);
		}

		if (!Ref_Num_Value.equals("")) {
			waitForElement(driver, Ref_Num);
			sendKeys(driver, Ref_Num, Ref_Num_Value);
		} else {

			System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
		}


		if (!Tare_Value.equals("")) {
			waitForElement(driver, Tare_TF);
			sendKeys(driver, Tare_TF, Tare_Value);
		} else {

			System.out.println("Tare_Value " + "Input Not Available in : " + File_Path);
		}

		waitForElement(driver, Add_button);
		click(driver, Add_button);

		waitForElement(driver, firstCell);
		// enter equipment number
		click(driver, firstCell);
		waitForElement(driver, firstCellInput);
		click(driver, firstCellInput);
		sendKeys(driver, firstCellInput, Equipment_No);

		waitForElement(driver, saveButton_L1);
		click(driver, saveButton_L1);

		waitForDisplay(driver, Ofhi_OkButton);
		if (isDisplayed(driver, Ofhi_OkButton)) {
			waitForElement(driver, Ofhi_OkButton);
			click(driver, Ofhi_OkButton);

		}else {
			waitForElement(driver, Apply_btn);
			click(driver, Apply_btn);
			waitForElement(driver, saveButton_L1);
			click(driver, saveButton_L1);

			waitForElement(driver, Movement_Entry_Popup);
			String Popup=getText(driver, Movement_Entry_Popup);
			if(movement_EntryPopup.equals(Popup.trim())) {

				System.out.println("Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
				Extent_pass(driver, "Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
						test, test1);
				waitForElement(driver, Ofhi_OkButton);
				click(driver, Ofhi_OkButton);

			} else {
				System.out.println("NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
				Extent_fail(driver, "NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
						test, test1);
			}

		}

		Step_End(1, "Ensure system should allow user to save ONHI move in movement entry", test, test1);

		// search Ems contract registration module



		moduleNavigate(driver, module_name1);
		
		waitForElement(driver, globalSearch11);
		safeclick(driver, globalSearch11);
		globalValueSearchWindow(driver, condition, Contract_No_Search, Global_SearchField, Carrier_Search, Carrier_Input, Version_Search, Version_Input);

		
		Step_Start(2, "Ensure that system should update the Actual Pick Up Quantity in contract registration for Pick up and Drop off Detailsbased on contract or scale-in used in movement", test, test1);


		waitForElement(driver, ScaleIn_OutPage);
		waitForElement(driver, ScaleIn_OutPage);

		click(driver, ScaleIn_OutPage);

		waitForElement(driver, SCaleIn_Loc_Tf);
		click(driver, SCaleIn_Loc_Tf);
		sendKeys(driver, SCaleIn_Loc_Tf, PickUpDropoff_LocationSF);

		click(driver, SCaleIn_SizeTyp_Tf);
		sendKeys(driver, SCaleIn_SizeTyp_Tf, PickupDropoff_SizetypeSF);
		String Actual1 = getText(driver, ActualQuantity);
		System.out.println(Actual1);
		waitForElement(driver, pickup_DropOff);
		click(driver, pickup_DropOff);

		waitForElement(driver, Pickup_LocationSF);
		click(driver, Pickup_LocationSF);
		sendKeys(driver, Pickup_LocationSF, PickUpDropoff_LocationSF);

		click(driver, Pickup_sizetypeSF);
		sendKeys(driver, Pickup_sizetypeSF, PickupDropoff_SizetypeSF);

		waitForElement(driver, PickUpActual_Quantity);
		String Actual2 = getText(driver, PickUpActual_Quantity);

		if (Actual2.equals(Actual1)) {

			System.out.println("Matched || Expected value was : " + Actual2 + " || Actual value was : " + Actual1);
			Extent_pass(driver, "Matched || Expected value was : " + Actual2 + " || Actual value was : " + Actual1,
					test, test1);
		} else {
			System.out.println("NotMatched || Expected value was : " + Actual2 + " || Actual value was : " + Actual1);
			Extent_fail(driver, "NotMatched || Expected value was : " + Actual2 + " || Actual value was : " + Actual1,
					test, test1);
		}

		Step_End(2, "Ensure that system should update the Actual Pick Up Quantity in contract registration for Pick up and Drop off Detailsbased on contract or scale-in used in movement", test, test1);

		Extent_completed(testcase_Name, test, test1);

	}

}
