package LRP_EMS_Integrations_Scripts;

import java.util.List;
import java.util.Map;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Scale_In_Out_Reference;

public class TC_Scale_In_TS_024_IP extends Keywords {

	public void scaleingirdremove(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		// Value are taken from excel sheet
		String testcase_Name = "TC_Scale_In_TS_024_IP";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data24 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
	
		
		String Username = data24.get("Username");// 1,2,4-6
		String Password = data24.get("Password");
		String Search = data24.get("Search_input");
		String contractnum = data24.get("Contract_No");
		String scalerefno = data24.get("Scale_Reference_no");
		String freedays = data24.get("Free_Days");
		String perdiem = data24.get("Per_Diem");
		String handelcharges = data24.get("Handles_Charges");
		String equipmentque = data24.get("equipment_Quantity");
		String pickupcredit = data24.get("PickUp_Credit");
		String Pickupcharges = data24.get("Scale_in_pickup_charges");
		String savedpopexp = data24.get("PopUpforsaved");
		String todayenter = data24.get("TODAYS");
		String secondtodayinput = data24.get("secondtoday");
		String secondtodayinputdem = data24.get("seconddiem");
		String Slab_CheckBox = data24.get("Slab_CheckBox");
		String One_Way_CheckBox = data24.get("One_Way_CheckBox");
		String Equipment_type_perform = data24.get("Equipment_type_perform");
		String Reference_Type = data24.get("Reference_Type");
		String To_Date_perform = data24.get("To_Date_perform");
		String From_date_perform = data24.get("From_date_perform");
		String Condition_Filter = data24.get("Condition_Filter");
		String From_Date_Input = data24.get("From_Date_Input");
		String To_Date_Input = data24.get("To_Date_Input");
		String One_way_return_location = data24.get("One_way_return_location");
		String Equipmenttype_Input = data24.get("Equipmenttype_Input");
		String Add_location_port_perform = data24.get("Add_location_port_perform");
		String Add_location_port_input = data24.get("Add_location_port_input");
		String Remarks_input = data24.get("Remarks_input");
		String per_diem_slap = data24.get("per_diem_slap");	
		String Contract_Number_Search = data24.get("Contract_Number_Search");
		String Equipment_Type_Search = data24.get("Equipment_Type_Search");
		String Location_Search = data24.get("Location_Search");
		String One_Way_Search = data24.get("One_Way_Search");
		String ReferenceType_Select =  String.format(Scale_In_Out_Reference.reference_type,Reference_Type); 
		Extent_Start(testcase_Name, test, test1);
		
		
		navigateUrl(driver, URL);
		
	
		// LOGIN
		LRP_Login(driver, Username, Password);
		moduleNavigate(driver, Search);
		waitForElement(driver, Reference_Type_Field);
		safeclick(driver, Reference_Type_Field);
	
		waitForElement(driver, ReferenceType_Select);
		safeclick(driver, ReferenceType_Select);
		Step_Start(1, " Ensure system should allow user to contract no correctly in that field correctly''",test, test1);
		waitForElement(driver, AContract_no_input);
		waitForElement(driver, AContractNumsearch);
		safeclick(driver, AContractNumsearch);
		waitForElement(driver, Ainputcontractnum);
		twoColumnSearchWindow(driver, Contract_Number_Search, Condition_Filter, contractnum);
		
		Step_End(1, " Ensure system should allow user to contract no correctly in that field correctly''",test, test1);
		waitForElement(driver, Slab_ChkBok);
		checkBox(driver, Slab_ChkBok, Slab_CheckBox);

		// OPTION OF SELECTING THE CHECK BOX
		
		if (isElementAccessible(driver, AslabboxADD)) {
			
			waitForElement(driver, AslabboxADD);
			safeclick(driver, AslabboxADD);
		
			waitForElement(driver, AslabboxADDTodays);
			doubleClick(driver, AslabboxADDTodays);
		
			Actionsendkeys(driver, AslabboxADDTodays, todayenter);
		
			waitForElement(driver, AslabboxADDperdiem);
			
			doubleClick(driver, AslabboxADDperdiem);
		
			Actionsendkeys(driver, APer_Diem_Input, per_diem_slap);
			waitForElement(driver, AScale_in_pickup_charges);
			safeclick(driver, AScale_in_pickup_charges);
			waitForElement(driver, AslabboxADD);
			safeclick(driver, AslabboxADD);
		
			waitForElement(driver, AslabboxADDperdiemsecond);
			doubleClick(driver, AslabboxADDperdiemsecond);
		
			Actionsendkeys(driver, AslabboxADDperdiemsecond, secondtodayinput);

			waitForElement(driver, AslabboxADDperdiemseconddiem);
		
			doubleClick(driver, AslabboxADDperdiemseconddiem);
			
			Actionsendkeys(driver, AslabboxADDperdiemseconddiem, secondtodayinputdem);
			System.out.println("slab box was selected and filled with data");

		} else {
			System.out.println("Slab box was not selected");
		}

		// Perdiem input

		if (!perdiem.equals("")) {
			waitForElement(driver, APer_Diem_Input);
			safeclick(driver, APer_Diem_Input);
			sendKeys(driver, APer_Diem_Input, perdiem);
		}
		// Free days input

		if (!freedays.equals("")) {
			waitForElement(driver, AFree_Days_Input);
			safeclick(driver, AFree_Days_Input);
			sendKeys(driver, AFree_Days_Input, freedays);
			//wait(driver, "1");
		}

		// scalein pickup charges input
		if (!Pickupcharges.equals("")) {

			waitForElement(driver, AScale_in_pickup_charges);
			sendKeys(driver, AScale_in_pickup_charges, Pickupcharges);
		}

		// Handle charges input
		if (!handelcharges.equals("")) {
			waitForElement(driver, AHandling_Charges);
			sendKeys(driver, AHandling_Charges, handelcharges);
		}
		Step_Start(3, " Ensure that system should allow user to enter equipment qty correctly'",test, test1);
		// Equipment quantity input
		if (!equipmentque.equals("")) {
			waitForElement(driver, AEquipment_Quantaty);
			sendKeys(driver, AEquipment_Quantaty, equipmentque);
		}
		Step_End(3, " Ensure that system should allow user to enter equipment qty correctly'",test, test1);
		// pickup credit input
		if (!pickupcredit.equals("")) {
			waitForElement(driver, APick_Up_Credit);
			sendKeys(driver, APick_Up_Credit, pickupcredit);
		}

		// Remarks input

		if (!Remarks_input.equals("")) {
			waitForElement(driver, ARemarks_Input);
			sendKeys(driver, ARemarks_Input, Remarks_input);
		}
		Step_Start(2, " Ensure that system should allow user to select Validity From & To Period correctly'",test, test1);
		// Selecting the From Date
		waitForElement(driver, AFrom_Date);
		if (From_date_perform.equalsIgnoreCase("Yes")) {
			waitForElement(driver, AFrom_Date);
			selectDatePicker(driver, AFrom_Date, From_Date_Input);
		} else {
			waitForElement(driver, AFrom_Date);
			clearAndType(driver, AFrom_Date, From_Date_Input);
		}
		// Selecting the to Date
		
		waitForElement(driver, ATo_Date);
		if (To_Date_perform.equalsIgnoreCase("Yes")) {
			waitForElement(driver, ATo_Date);
			selectDatePicker(driver, ATo_Date, To_Date_Input);
		} else {
			waitForElement(driver, ATo_Date);
			clearAndType(driver, ATo_Date, To_Date_Input);
		}
		
				Step_End(2, " Ensure that system should allow user to select Validity From & To Period correctly'",test, test1);
		// selecting oneway check box

		waitForElement(driver, OneWay_ChkBox);

		checkBox(driver, OneWay_ChkBox, One_Way_CheckBox);
		if (One_Way_CheckBox.equals("YES")) {

			List<String> datas = splitAndExpand(One_way_return_location);
			for (String data : datas) {
				
				waitForElement(driver, AAddreturnlocation);
				safeclick(driver, AAddreturnlocation);

				waitForElement(driver, location_search16);
				twoColumnSearchWindow(driver, One_Way_Search, Condition_Filter, data);

			}
		} else {
			
			System.out.println("one way was not selected and return location was not added");
		}

		// Selecting the Equipment type

		if (Equipment_type_perform.equals("YES")) {

			List<String> datas = splitAndExpand(Equipmenttype_Input);
			for (String data : datas) {
				
				waitForElement(driver, AEquipment_Type_add_button);
				safeclick(driver, AEquipment_Type_add_button);
				waitForElement(driver, equipmenttypevalueenter);
				twoColumnSearchWindow(driver, Equipment_Type_Search, Condition_Filter, data);
			}
		} else {
			System.out.println("Equipment type  was not added");
			extent_fail(driver, "Equipment type  was not added", test, test1);
		}
		Step_Start(4, " Ensure that system should allow user to enter location correctly",test, test1);
		// Selecting the location

		if (Add_location_port_perform.equals("YES")) {

			List<String> datas = splitAndExpand(Add_location_port_input);
			for (String data : datas) {
			
				waitForElement(driver, ALocation_Add_Button);
				safeclick(driver, ALocation_Add_Button);
				waitForElement(driver, location_search16);
				twoColumnSearchWindow(driver, Location_Search, Condition_Filter, data);
			

			}
		} else {
			System.out.println("location  was not added");
			extent_fail(driver, "location  was not added", test, test1);
		}
		Step_End(4, " Ensure that system should allow user to enter location correctly",test, test1);
		// Entering Scalin reference
		if (!scalerefno.equals("")) {
			waitForElement(driver, AScale_in_ref_input);
			safeclick(driver, AScale_in_ref_input);
			sendKeys(driver, AScale_in_ref_input, scalerefno);
			safeclick(driver, ARemarks_Input);
		}
		Step_Start(5, " Ensure that system should allow user to add data into grid",test, test1);
		// Adding the values into the grid

		waitForElement(driver, AGried_Add_Button);
		safeclick(driver, AGried_Add_Button);
		
	
		Step_End(5, " Ensure that system should allow user to add data into grid",test, test1);
		Step_Start(6, "  Ensure that system should validate when user try to remove data from grid'",test, test1);
		waitForElement(driver, Removebuttoncoloumclick);
		doubleClick(driver, Removebuttoncoloumclick);
		waitForElement(driver, AGried_Add_Button);
		safeclick(driver, AGried_Add_Button);
		waitForElement(driver, Removebutton);
		safeclick(driver, Removebutton);
		Step_Start(7, "  Ensure that system should validate as  'Do you want to delete the selected Equipment Type(s)?'"+ "'",test, test1);
		String Actualpopmsg5 = getText(driver, Removepop);
		System.out.println(Actualpopmsg5);

		if (savedpopexp.equals(Actualpopmsg5)) {
			System.out.println("Matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : "
					+ Actualpopmsg5);
			Extent_pass(driver, "Matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : "
					+ Actualpopmsg5, test, test1);
			Extent_call(test, test1, "**popup was shown as*** "+Actualpopmsg5);
		} else {
			System.out.println("Not matched || " + " Expected Activity is : " + savedpopexp
					+ " || Actual Activity is : " + Actualpopmsg5);
			Extent_fail(driver, "Not matched || " + " Expected Activity is : " + savedpopexp
					+ " || Actual Activity is : " + Actualpopmsg5, test, test1);
			
		}
		waitForElement(driver, RemovebuttoncoloumclickNO);
		safeclick(driver, RemovebuttoncoloumclickNO);
		Step_End(6, "  Ensure that system should validate when user try to remove data from grid'",test, test1);
		Step_End(7, "  Ensure that system should validate as  'Do you want to delete the selected Equipment Type(s)?'"+ "'",test, test1);
		scrollTop(driver);
		Extent_completed(testcase_Name, test, test1);

	}

}
