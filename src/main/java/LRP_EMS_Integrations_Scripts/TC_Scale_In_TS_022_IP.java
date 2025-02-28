package LRP_EMS_Integrations_Scripts;

import java.util.List;
import java.util.Map;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Scale_In_Out_Reference;

public class TC_Scale_In_TS_022_IP extends Keywords {

	public void scaleoutrefblank(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String testcase_Name = "TC_Scale_In_TS_022_IP";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data22 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
	
		String Username = data22.get("Username");// 1,2,4-6	
		String Password = data22.get("Password");
		String Search = data22.get("Search_input");
		String contractnum = data22.get("Contract_No");
		String Scale_Reference_no = data22.get("Scale_Reference_no");
		String freedays = data22.get("Free_Days");
		String perdiem = data22.get("Per_Diem");
		String handelcharges = data22.get("Handles_Charges");
		String equipmentque = data22.get("equipment_Quantity");
		String pickupcredit = data22.get("PickUp_Credit");
		String Pickupcharges = data22.get("Scale_in_pickup_charges");
		String From_date_perform = data22.get("From_date_perform");
		String To_Date_perform = data22.get("To_Date_perform");
		
		String todayenter = data22.get("TODAYS");
		String secondtodayinput = data22.get("secondtoday");
		String secondtodayinputdem = data22.get("seconddiem");
		
		String Contract_Number_Search = data22.get("Contract_Number_Search");
		String Equipment_Type_Search = data22.get("Equipment_Type_Search");
		String Location_Search = data22.get("Location_Search");
		String Slab_CheckBox = data22.get("Slab_CheckBox");
		
		String Equipment_type_perform = data22.get("Equipment_type_perform");
		String Reference_Type = data22.get("Reference_Type");
		String From_Date_Input = data22.get("From_Date_Input");
		String To_Date_Input = data22.get("To_Date_Input");
		
		String Equipmenttype_Input = data22.get("Equipmenttype_Input");
		String Add_location_port_perform = data22.get("Add_location_port_perform");
		String Add_location_port_input = data22.get("Add_location_port_input");
		String Condition_Filter = data22.get("Condition_Filter");
		String Remarks_input = data22.get("Remarks_input");
		String PopUpforsaved = data22.get("PopUpforsaved");
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
		Step_Start(1, "Ensure system should validate if user try to save scale-in by giving blank in Scale-Out Ref'",test, test1);
		// Entering Scalout reference
		if (!Scale_Reference_no.equals("")) {
			waitForElement(driver, AScale_in_ref_input);
			safeclick(driver, AScale_in_ref_input);
			sendKeys(driver, AScale_in_ref_input, Scale_Reference_no);
			safeclick(driver, ARemarks_Input);

		} else {
			System.out.println("scaleout reference value was not entered");
			
		}

		// Adding the values into the grid

		waitForElement(driver, AGried_Add_Button);
		safeclick(driver, AGried_Add_Button);
		
		// Saving the records

		waitForElement(driver, ASave_Button);
		safeclick(driver, ASave_Button);
		Step_Start(2, " Ensure that system should validate as 'Enter the Scale-Out Ref.''",test, test1);
		waitForElement(driver, Asavepopup1);

		String Actualpopmsg11 = getText(driver, Asavepopup1);
		System.out.println(Actualpopmsg11);

		if (PopUpforsaved.equals(Actualpopmsg11)) {
			System.out.println("Matched || " + " Expected Activity is : " + PopUpforsaved + " || Actual Activity is : "
					+ Actualpopmsg11);
			Extent_pass(driver, "Matched || " + " Expected Activity is : " + PopUpforsaved + " || Actual Activity is : "
					+ Actualpopmsg11, test, test1);
			
			Extent_call(test, test1, "**popup was shown as*** "+Actualpopmsg11);
		} else {
			System.out.println("Not matched || " + " Expected Activity is : " + PopUpforsaved
					+ " || Actual Activity is : " + Actualpopmsg11);
			Extent_fail(driver, "Not matched || " + " Expected Activity is : " + PopUpforsaved
					+ " || Actual Activity is : " + Actualpopmsg11, test, test1);
			

		}
		Step_End(1, "Ensure system should validate if user try to save scale-in by giving blank in Scale-Out Ref'",test, test1);
		Step_End(2, " Ensure that system should validate as 'Enter the Scale-Out Ref.''",test, test1);
		Extent_completed(testcase_Name, test, test1);
		
	}

}
