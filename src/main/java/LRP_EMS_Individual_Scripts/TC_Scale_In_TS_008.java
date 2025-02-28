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

public class TC_Scale_In_TS_008 extends Keywords {

	public void Scaleindelete(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		String testcase_Name = "TC_Scale_In_TS_008";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);

		String Username = data.get("Username");// 1,2,4-6
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
		String Slab_CheckBox = data.get("Slab_CheckBox");
		String One_Way_CheckBox = data.get("One_Way_CheckBox");
		String Equipment_type_perform = data.get("Equipment_type_perform");
		String Reference_Type = data.get("Reference_Type");
		String From_Date_Input = data.get("From_Date_Input");
		String To_Date_Input = data.get("To_Date_Input");
		String One_way_return_location = data.get("One_way_return_location");
		String Equipmenttype_Input = data.get("Equipmenttype_Input");
		String Add_location_port_perform = data.get("Add_location_port_perform");
		String Add_location_port_input = data.get("Add_location_port_input");
		String Remarks_input = data.get("Remarks_input");
		String Per_Diem_Slap = data.get("Per_Diem_Slap");
		String To_Date_perform = data.get("To_Date_perform");
		String From_date_perform = data.get("From_date_perform");
		String Coloum_names = data.get("Coloum_names");
		String No_Records_pop = data.get("No-Records_pop");
		String Deleted_pop_exp = data.get("Deleted_pop_exp");
		String Search_type = data.get("Search_type");
		String Condition_Filter = data.get("Condition_Filter");
		String Contract_Number_Search = data.get("Contract_Number_Search");
		String One_Way_Search = data.get("One_Way_Search");
		String Equipment_Type_Search = data.get("Equipment_Type_Search");
		String Location_Search = data.get("Location_Search");
		String Search_value_type = data.get("Search_value_type");
		String ReferenceType_Select =  String.format(Scale_In_Out_Reference.reference_type,Reference_Type); 
		
		Extent_Start(testcase_Name, test, test1);
		
		
		
		
	
		navigateUrl(driver, URL);
	
		// LOGIN
		LRP_Login(driver, Username, Password);
		
		Step_Start(1, "Create Scalein data record",test, test1);
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
		if (pickupcredit.equals("")) {
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
			for (String data1 : datas) {
				
				waitForElement(driver, AAddreturnlocation);
				safeclick(driver, AAddreturnlocation);

				waitForElement(driver, location_search16);
				sendKeys(driver, location_search16, data1);
				
				twoColumnSearchWindow(driver, One_Way_Search, Condition_Filter, data1);
					
				
			}
		} else {
			System.out.println("one way was not selected and return location was not added");
			
		}

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
			} else {
				System.out.println("Data was NOT shown in grid");
				Extent_fail(driver, "Data was NOT shown in grid", test, test1);
				
			}
			scrollTop(driver);
		
		
			
			
			waitForElement(driver, AScale_in_ref_input);
			String reference =getAttribute(driver, AScale_in_ref_input, "value");
			System.out.println(reference);
			scrollTop(driver);
			
			Step_Start(1, " Click on Global Search from toolbar",test, test1);
			waitForElement(driver, Ahomepagesearch);
			safeclick(driver, Ahomepagesearch);
			Step_End(1, " Click on Global Search from toolbar",test, test1);
			Step_Start(2, "  Enter Contract no & click on search button",test, test1);
			// Entering the contract number to search
			Step_Start(3, " Click on retrieved data for required scale-out ref",test, test1);
			globalValueSearchWindow(driver, Search_type, Search_value_type, reference, "", "", "", "");
			Step_End(2, "  Enter Contract no & click on search button",test, test1);
		
		
			Step_Start(2, " Click on Delete icon from toolbar",test, test1);
			
			// Deleting the records

			waitForElement(driver, ADelete_Button);
			safeclick(driver, ADelete_Button);
			Step_End(2, " Click on Delete icon from toolbar",test, test1);
			Step_Start(3, " Click on 'Yes' when pop-up message occurs for confirmation",test, test1);
			waitForElement(driver, Awanttodeletepop);

			safeclick(driver, AwanttodeletepopOK);
			// verify the popup for delete
			String actualmsg = getText(driver, APopupforupdated);
			System.out.println(actualmsg);
			if (Deleted_pop_exp.equals(actualmsg)) {
				System.out.println("Matched || " + " Expected Activity is : " + Deleted_pop_exp
						+ " || Actual Activity is : " + actualmsg);
				Extent_pass(driver, "Matched || " + " Expected Activity is : " + Deleted_pop_exp
						+ " || Actual Activity is : " + actualmsg, test, test1);
			} else {
				System.out.println("Not matched || " + " Expected Activity is : " + Deleted_pop_exp
						+ " || Actual Activity is : " + actualmsg);
				Extent_fail(driver, "Not matched || " + " Expected Activity is : " + Deleted_pop_exp
						+ " || Actual Activity is : " + actualmsg, test, test1);
			}
			Step_End(3, " Click on 'Yes' when pop-up message occurs for confirmation",test, test1);
			Step_Start(4, " Check that data is showing in global search ",test, test1);
			// seraching the record in global search

			waitForElement(driver, Ahomepagesearch);
			safeclick(driver, Ahomepagesearch);
			globalValueSearchWindow1(driver, Search_type, Search_value_type, scalerefno, "", "", "", "");
			
			
			// verify the no records in global search

			String actualmsg1 = getText(driver, Norecordspop);
			System.out.println(actualmsg1);
			if (No_Records_pop.equals(actualmsg1)) {
				System.out.println("Matched || " + " Expected Activity is : " + No_Records_pop
						+ " || Actual Activity is : " + actualmsg1);
				Extent_pass(driver, "Matched || " + " Expected Activity is : " + No_Records_pop
						+ " || Actual Activity is : " + actualmsg1, test, test1);
			} else {
				System.out.println("Not matched || " + " Expected Activity is : " + No_Records_pop
						+ " || Actual Activity is : " + actualmsg1);
				Extent_fail(driver, "Not matched || " + " Expected Activity is : " + No_Records_pop
						+ " || Actual Activity is : " + actualmsg1, test, test1);
			}
			Step_End(4, " Check that data is showing in global search ",test, test1);
			// closing the tab for global search
			waitForElement(driver, AClosex1);
			safeclick(driver, AClosex1);
			Extent_completed(testcase_Name, test, test1);
			
			
		}
	}


