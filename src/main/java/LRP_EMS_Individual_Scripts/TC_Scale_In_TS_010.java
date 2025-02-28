package LRP_EMS_Individual_Scripts;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Scale_In_Out_Reference;

public class TC_Scale_In_TS_010 extends Keywords {

	public void Scaleoutrecord(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String testcase_Name = "TC_Scale_In_TS_010";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		String Username = data.get("Username");// 1,2,4-

		String Password = data.get("Password");
		String Search = data.get("Search_input");
		String contractnum = data.get("Contract_No");
		String scalerefno = data.get("Scale_Reference_no");
		String freedays = data.get("Free_Days");
		String perdiem = data.get("Per_Diem");
		String handelcharges = data.get("Handles_Charges");
		String equipmentque = data.get("equipment_Quantity");
		String pickupcredit = data.get("PickUp_Credit");
		String Pickupcharges = data.get("Scale_in_pickup_charges");
		String savedpopexp = data.get("PopUpforsaved");
		String todayenter = data.get("TODAYS");
		String secondtodayinput = data.get("secondtoday");
		String secondtodayinputdem = data.get("seconddiem");
		String To_Date_perform = data.get("To_Date_perform");
		String From_date_perform = data.get("From_date_perform");
		String Slab_CheckBox = data.get("Slab_CheckBox");
		String Per_Diem_Slap = data.get("Per_Diem_Slap");


		String Equipment_type_perform = data.get("Equipment_type_perform");
		String Reference_Type = data.get("Reference_Type");

		String From_Date_Input = data.get("From_Date_Input");
		String To_Date_Input = data.get("To_Date_Input");

		String Equipmenttype_Input = data.get("Equipmenttype_Input");
		String Add_location_port_perform = data.get("Add_location_port_perform");
		String Add_location_port_input = data.get("Add_location_port_input");
		String Condition_Filter = data.get("Condition_Filter");
		String Remarks_input = data.get("Remarks_input");
		String ReferenceType_Select =  String.format(Scale_In_Out_Reference.reference_type,Reference_Type); 
		String Coloum_names = data.get("Coloum_names");
		String Contract_Number_Search = data.get("Contract_Number_Search");
		String Equipment_Type_Search = data.get("Equipment_Type_Search");
		String Location_Search = data.get("Location_Search");
		Extent_Start(testcase_Name, test, test1);
		
		
		
		navigateUrl(driver, URL);

	
// LOGIN
		LRP_Login(driver, Username, Password);
		moduleNavigate(driver, Search);

	
		Step_Start(1, " Click on Reference Type drop menu & select scale-out option",test, test1);
		waitForElement(driver, Reference_Type_Field);
		safeclick(driver, Reference_Type_Field);
			waitForElement(driver, ReferenceType_Select);
			safeclick(driver, ReferenceType_Select);
			Step_End(1, " Click on Reference Type drop menu & select scale-out option",test, test1);
			Step_Start(3, "Click search icon for Contract No then select required contract",test, test1);
		waitForElement(driver, AContract_no_input);
		waitForElement(driver, AContractNumsearch);
		safeclick(driver, AContractNumsearch);
		waitForElement(driver, Ainputcontractnum);
		twoColumnSearchWindow(driver, Contract_Number_Search, Condition_Filter, contractnum);
		
		  
		Step_End(3, "Click search icon for Contract No then select required contract",test, test1);
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
					Actionsendkeys(driver, APer_Diem_Input, Per_Diem_Slap);
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
			    //     wait(driver, "1");
		}

// scalein pickup charges input
		if (!Pickupcharges.equals("")) {
			waitForElement(driver, AScale_in_pickup_charges);
			sendKeys(driver, AScale_in_pickup_charges, Pickupcharges);
		}
		Step_Start(8, " Enter values for handling charges in numeric digit",test, test1);
		// Handle charges input
		if (!handelcharges.equals("")) {
			waitForElement(driver, AHandling_Charges);
			sendKeys(driver, AHandling_Charges, handelcharges);
		}
		Step_End(8, " Enter values for handling charges in numeric digit",test, test1);
		Step_Start(9, " Enter values for Equipment quantity in numeric digit",test, test1);
// Equipment quantity input 
		if (!equipmentque.equals("")) {
			waitForElement(driver, AEquipment_Quantaty);
			sendKeys(driver, AEquipment_Quantaty, equipmentque);
		}
		Step_Start(7, "Enter values for Scale-out dropoff charges in numeric digit",test, test1);
		Step_End(9, " Enter values for Equipment quantity in numeric digit",test, test1);
		Step_Start(10, " Enter values for Pre trip ins charges in numeric digit when it is required",test, test1);
// pickup credit input
		if (!pickupcredit.equals("")) {
			waitForElement(driver, APick_Up_Credit);
			sendKeys(driver, APick_Up_Credit, pickupcredit);
		}
		
		Step_End(7, "Enter values for Scale-out dropoff charges in numeric digit",test, test1);
		Step_End(10, " Enter values for Pre trip ins charges in numeric digit when it is required",test, test1);
		// Remarks input

		if (!Remarks_input.equals("")) {
			waitForElement(driver, ARemarks_Input);
			sendKeys(driver, ARemarks_Input, Remarks_input);
		}
		Step_Start(4, "Select Validity From Date range accordingly in date picker",test, test1);
		// Selecting the From Date
		waitForElement(driver, AFrom_Date);
		if (From_date_perform.equalsIgnoreCase("Yes")) {
			waitForElement(driver, AFrom_Date);
			selectDatePicker(driver, AFrom_Date, From_Date_Input);
		} else {
			waitForElement(driver, AFrom_Date);
			clearAndType(driver, AFrom_Date, From_Date_Input);
		}
		
				Step_End(4, "Select Validity From Date range accordingly in date picker",test, test1);
				Step_Start(5, "Select Validity To Date range accordingly in date picker",test, test1);
				// Selecting the to Date
			
				waitForElement(driver, ATo_Date);
				if (To_Date_perform.equalsIgnoreCase("Yes")) {
					waitForElement(driver, ATo_Date);
					selectDatePicker(driver, ATo_Date, To_Date_Input);
				} else {
					waitForElement(driver, ATo_Date);
					clearAndType(driver, ATo_Date, To_Date_Input);
				}
				
						Step_End(5, "Select Validity To Date range accordingly in date picker",test, test1);
// selecting oneway check box
						Step_Start(6, "click on size type add button, location add button",test, test1);
		// Selecting the Equipment type

		if (Equipment_type_perform.equals("YES")) {

			List<String> datas = splitAndExpand(Equipmenttype_Input);
			for (String data1 : datas) {
			
				waitForElement(driver, AEquipment_Type_add_button);
				safeclick(driver, AEquipment_Type_add_button);
				waitForElement(driver, equipmenttypevalueenter);				
				twoColumnSearchWindow(driver, Equipment_Type_Search, Condition_Filter, data1);
				
					  
				
			}
		} else {

			System.out.println("Equipment type  was not added");
			
		}

		// Selecting the location

		if (Add_location_port_perform.equals("YES")) {

			List<String> datas = splitAndExpand(Add_location_port_input);
			for (String data1 : datas) {
				   
				waitForElement(driver, ALocation_Add_Button);
				
				safeclick(driver, ALocation_Add_Button);
				waitForElement(driver, location_search16);
				twoColumnSearchWindow(driver, Location_Search, Condition_Filter, data1);
					 
				
			}
		} else {
			System.out.println("location  was not added");
			
		}
		Step_Start(2, "Enter Alphanumeric character for Scale-out Reference field",test, test1);
		Step_End(6, "click on size type add button, location add button",test, test1);
		// Entering Scalin reference
		if (!scalerefno.equals("")) {
			waitForElement(driver, AScale_in_ref_input);
			safeclick(driver, AScale_in_ref_input);
			sendKeys(driver, AScale_in_ref_input, scalerefno);
			safeclick(driver, ARemarks_Input);
		}
		Step_End(2, "Enter Alphanumeric character for Scale-out Reference field",test, test1);
		Step_Start(11, " Click add button once all required fields are entered",test, test1);
			// Adding the values into the grid

			waitForElement(driver, AGried_Add_Button);
			safeclick(driver, AGried_Add_Button);
			  
			Step_End(11, " Click add button once all required fields are entered",test, test1);
			Step_Start(12, "  Click save button & system should show save message as successfull",test, test1);
			// Saving the records

			waitForElement(driver, ASave_Button);
			safeclick(driver, ASave_Button);
			
			
			
			waitForElement(driver, AScale_in_ref_input);
			String reference =getAttribute(driver, AScale_in_ref_input, "value");
			System.out.println(reference);
			
			scrollTop(driver);
			Extent_call(test, test1,  "**Scaleout_ref was generated as**"+ reference);
			Extent_pass(driver,  "**Scaleout_ref was generated as**"+ reference, test, test1);
		

			// Verifying the validation of saved popup

			waitForElement(driver, Asavepopup);
			String Actualpopmsg = getText(driver, Asavepopup);
			System.out.println(Actualpopmsg);

			if (savedpopexp.equals(Actualpopmsg)) {
				System.out.println("Matched || " + " Expected Activity is : " + savedpopexp
						+ " || Actual Activity is : " + Actualpopmsg);
				Extent_pass(driver, "Matched || " + " Expected Activity is : " + savedpopexp
						+ " || Actual Activity is : " + Actualpopmsg, test, test1);
			} else {
				System.out.println("Not matched || " + " Expected Activity is : " + savedpopexp
						+ " || Actual Activity is : " + Actualpopmsg);
				Extent_fail(driver, "Not matched || " + " Expected Activity is : " + savedpopexp
						+ " || Actual Activity is : " + Actualpopmsg, test, test1);
				
			}

			scrollUsingElement(driver, AGried_Add_Button);
			
			Map<String, List<String>> table_view = extractTableDataDirect(driver, table_path);
			List<String> coloumhearders = splitAndExpand1(Coloum_names);
			
			String table_value = printTable(driver, table_view, coloumhearders);
			Extent_pass(driver, "<pre>"+table_value+"</pre>", test, test1);

// VERIFY THE DATA IN GIRD

			String Location1 = getText(driver, AINNSA);
			System.out.println(Location1);
			Extent_pass(driver, "Location shown as" + "****" + Location1, test, test1);

			String equetype = getText(driver, Equipmenttype);
			System.out.println(equetype);
			Extent_pass(driver, "equipmentquantity shown as" + "****" + equetype, test, test1);
			String equeque = getText(driver, Equipmentquenty);
			System.out.println(equeque);
			Extent_pass(driver, "equipmenttime shown as " + "****" + equeque, test, test1);

			Set<String> arrset1 = new HashSet<String>();
			arrset1.add(equeque);
			arrset1.add(equetype);
			arrset1.add(Location1);

			System.out.println("First Set: " + arrset1);

			if (isDisplayed(driver, AINNSA)) {
				System.out.println("Data was shown in grid");
				Extent_pass(driver, "***Data was shown in grid***", test, test1);
				
				isDisplayed(driver, Scroll_side);
				if (isDisplayed(driver, Scroll_side)) {
					horizontalscroll(driver, Scroll_side, 1000);
					Extent_pass(driver, "***Data was shown in grid***", test, test1);	
					
				}
		
			} else {
				System.out.println("Data was NOT shown in grid");
				Extent_fail(driver, "Data was NOT shown in grid", test, test1);
				
			}
			Step_End(12, "  Click save button & system should show save message as successfull",test, test1);
			scrollTop(driver);

// Deleting the records

			waitForElement(driver, ADelete_Button);
			safeclick(driver, ADelete_Button);

			waitForElement(driver, Awanttodeletepop);
			safeclick(driver, AwanttodeletepopOK);
			
			
			
			
			Extent_completed(testcase_Name, test, test1);
		}

	}

