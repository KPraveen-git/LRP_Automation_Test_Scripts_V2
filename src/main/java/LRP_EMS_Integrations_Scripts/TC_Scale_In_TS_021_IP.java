package LRP_EMS_Integrations_Scripts;


import java.util.List;
import java.util.Map;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Scale_In_Out_Reference;

public class TC_Scale_In_TS_021_IP extends Keywords {

	public void scaleinrefblank(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		// Value are taken from excel sheet
		String testcase_Name = "TC_Scale_In_TS_021_IP";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data21 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		String Username = data21.get("Username");
		String Password = data21.get("Password");
		String Search = data21.get("Search_input");
		String contractnum = data21.get("Contract_No");
		String scalerefno = data21.get("Scale_Reference_no");
		String freedays = data21.get("Free_Days");
		String perdiem = data21.get("Per_Diem");
		String handelcharges = data21.get("Handles_Charges");
		String equipmentque = data21.get("equipment_Quantity");
		String pickupcredit = data21.get("PickUp_Credit");
		String Pickupcharges = data21.get("Scale_in_pickup_charges");
		String savedpopexp = data21.get("PopUpforsaved");
		String todayenter = data21.get("TODAYS");
		String secondtodayinput = data21.get("secondtoday");
		String secondtodayinputdem = data21.get("seconddiem");
		String From_date_perform = data21.get("From_date_perform");
		String To_Date_perform = data21.get("To_Date_perform");
		String Slab_CheckBox = data21.get("Slab_CheckBox");
		String One_Way_CheckBox = data21.get("One_Way_CheckBox");
		String Equipment_type_perform = data21.get("Equipment_type_perform");
		String Reference_Type = data21.get("Reference_Type");
		String Contract_Number_Search = data21.get("Contract_Number_Search");
		String Equipment_Type_Search = data21.get("Equipment_Type_Search");
		String Location_Search = data21.get("Location_Search");
		String From_Date_Input = data21.get("From_Date_Input");
		String To_Date_Input = data21.get("To_Date_Input");
		String One_way_return_location = data21.get("One_way_return_location");
		String Equipmenttype_Input = data21.get("Equipmenttype_Input");
		String Add_location_port_perform = data21.get("Add_location_port_perform");
		String Add_location_port_input = data21.get("Add_location_port_input");
		String Condition_Filter = data21.get("Condition_Filter");
		String One_Way_Search = data21.get("One_Way_Search");
		
		String Remarks_input = data21.get("Remarks_input");
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
		

		waitForElement(driver, AContract_no_input);
		waitForElement(driver, AContractNumsearch);
		safeclick(driver, AContractNumsearch);
		waitForElement(driver, Ainputcontractnum);
		twoColumnSearchWindow(driver, Contract_Number_Search, Condition_Filter, contractnum);
		
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
			Actionsendkeys(driver, APer_Diem_Input, perdiem);
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

		// Equipment quantity input
		if (!equipmentque.equals("")) {
			waitForElement(driver, AEquipment_Quantaty);
			sendKeys(driver, AEquipment_Quantaty, equipmentque);
		}
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

		Step_Start(1, " Ensure system should validate if user try to save scale-in by giving blank in Scale-In Ref",test, test1);
		// Entering Scalin reference
		if (!scalerefno.equals("")) {
			waitForElement(driver, AScale_in_ref_input);
			safeclick(driver, AScale_in_ref_input);
			sendKeys(driver, AScale_in_ref_input, scalerefno);
			safeclick(driver, ARemarks_Input);
		}
		// Adding the values into the grid

		waitForElement(driver, AGried_Add_Button);
		safeclick(driver, AGried_Add_Button);
		

		// Saving the records

		waitForElement(driver, ASave_Button);
		safeclick(driver, ASave_Button);
		Step_Start(2, "Ensure that system should validate as 'Enter the Scale-In Ref.'",test, test1);
		waitForElement(driver, Asavepopup1);

		String Actualpopmsg = getText(driver, Asavepopup1);
		System.out.println(Actualpopmsg);

		if (savedpopexp.equals(Actualpopmsg)) {
			System.out.println("Matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : "
					+ Actualpopmsg);
			Extent_pass(driver, "Matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : "
					+ Actualpopmsg, test, test1);
			Extent_call(test, test1, "**Popup was shown as **"+Actualpopmsg);
		} else {
			System.out.println("Not matched || " + " Expected Activity is : " + savedpopexp
					+ " || Actual Activity is : " + Actualpopmsg);
			Extent_fail(driver, "Not matched || " + " Expected Activity is : " + savedpopexp
					+ " || Actual Activity is : " + Actualpopmsg, test, test1);
			
		}
		Step_End(1, " Ensure system should validate if user try to save scale-in by giving blank in Scale-In Ref",test, test1);
		Step_End(2, "Ensure that system should validate as 'Enter the Scale-In Ref.'",test, test1);
		Extent_completed(testcase_Name, test, test1);
		
		
	}
	
	

}
