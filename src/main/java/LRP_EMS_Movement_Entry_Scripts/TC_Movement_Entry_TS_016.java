package LRP_EMS_Movement_Entry_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_TS_016 extends Keywords {

//	To Create Moves via Multiple Entry in movement entry

	public void createMovesviaMultipleEntry(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) {
		String testCaseName="TC_Movement_Entry_TS_016";
//		Get data from excel sheet

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,
				"Dataset" + selected_dataset, File_Path);

		String username = Excel_data.get("Username");
		String password = Excel_data.get("Password");
		String moduleName = Excel_data.get("ModuleMovementEntry");
		String activityEqpEntryMulti = Excel_data.get("ActivityEqpEntry");
		String locationMultiEqEnt = Excel_data.get("LocationEqEnt");
		String termDepotMultiEqEnt = Excel_data.get("TermDepot");
		String releaseRefNo = Excel_data.get("ReleaseRefNum");
		String supplierContractNo = Excel_data.get("SupplierContractNo");
		String activityDate = Excel_data.get("ActivityDate");

		String sizeType = Excel_data.get("SizeType");
		String eqpNoMulti_1 = Excel_data.get("EquipmentNumbers");
		String multiSavedPopup = Excel_data.get("MultipleSavedPopup");
		String activityHour = Excel_data.get("ActivityHour");
		String iso = Excel_data.get("ISO");
		String shipperOwned = Excel_data.get("ShipperOwned");
		String leaseKind = Excel_data.get("LeaseKind");
		String lessor = Excel_data.get("Lessor");
		String lessee = Excel_data.get("Lessee");
		String maker = Excel_data.get("Maker");
		String material = Excel_data.get("Material");
		String tare = Excel_data.get("Tare");
		String payLoad = Excel_data.get("PayLoad");
		String grossWeight = Excel_data.get("GrossWeight");
		String manufactureDate = Excel_data.get("ManufactureDate");

		String refNumber = Excel_data.get("RefNumber");
		String thirtyTon = Excel_data.get("30Ton");
		String bLNO = Excel_data.get("BLNO");
		String remarks = Excel_data.get("Remarks");
		String datePicker = Excel_data.get("DatePicker");
		String condition=Excel_data.get("Condition");
		String lesseeSearch_Filter=Excel_data.get("LesseeSearch_Filter");
		String lessorSearch_Filter=Excel_data.get("LessorSearch_Filter");
		String BL_Search_Filter=Excel_data.get("BL_Search_Filter");
		
		navigateUrl(driver, url);

		Extent_Start(testCaseName, test, test1);

		// Login

		LRP_Login(driver, username, password);
		
//		Module Search
		moduleNavigate(driver, moduleName);
		
		// Movement Entry
		waitForElement(driver, movementEntryPage_L);
		if (isDisplayed(driver, movementEntryPage_L)) {
			System.out.println("Movement Entry Page is displayed");
			Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
		} else {
			System.out.println("Movement Entry Page is not displayed");
			Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
		}

		// Multiple Equipment Entry

		Step_Start(1, "Click on Multiple Equipment Entry tab to proceed further", test, test1);
		waitForElement(driver, multiEntryMovPage_L);
		click(driver, multiEntryMovPage_L);
		waitForElement(driver, multiEntryMovPage_L);
		if (isDisplayed(driver, multiEntryMovPage_L)) {
			System.out.println("Multiple Equipment Entry page is displayed");
			Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);

			Step_End(1, "Click on Multiple Equipment Entry tab to proceed further", test, test1);
			Step_Start(2, "Enter movement code & click enter", test, test1);
			
			waitForElement(driver, activitySearchField_L);
			sendKeys(driver, activitySearchField_L, activityEqpEntryMulti);
			enter(driver);
			
			Step_End(2, "Enter movement code & click enter", test, test1);
			Step_Start(3, "Select required date from date picker accrodingly", test, test1);
			
			waitForElement(driver, activeDateField_L);

			if (datePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, activeDateField_L, activityDate);

			} else {
				if (activityDate.contains("-")) {
					click(driver, activeDateField_L);

					String activityDate_1 = activityDate.replace("-", "/");

					clearAndType(driver, activeDateField_L, activityDate_1);

				} else {
					click(driver, activeDateField_L);

					clearAndType(driver, activeDateField_L, activityDate);

				}
			}
			Step_End(3, "Select required date from date picker accrodingly", test, test1);

			if (!activityHour.equals("")) {
				waitForElement(driver, activityTimeMultiple);
				click(driver, activityTimeMultiple);

				waitForElement(driver, Calender);
				if (isDisplayed(driver, Calender)) {
					click(driver, activityTime_Input);
					waitForElement(driver, activityTime_Input);

					click(driver, activityTime_Input);
					waitForElement(driver, activity_Time);
					clearAndType(driver, activity_Time, activityHour);
					waitForElement(driver, activityTime_Close);
					click(driver, activityTime_Close);

				}

			} 
			Step_Start(4, " Click show input button to further proceed", test, test1);

			waitForElement(driver, showInputButton);
			click(driver, showInputButton);

			waitForElement(driver, showInputFieldFrame_L);
			if (isDisplayed(driver, showInputFieldFrame_L)) {
				System.out.println("Show input field frame is displayed");
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
			} else {
				System.out.println("Show input field frame is not displayed");
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);
			}
			Step_End(4, " Click show input button to further proceed", test, test1);
			Step_Start(5, "Enter required location click enter", test, test1);
			
			waitForElement(driver, locationSaerchField_L);
			click(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			Actionsendkeys(driver, locationSaerchField_L, locationMultiEqEnt);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			Step_End(5, "Enter required location click enter", test, test1);
			Step_Start(6, "Enter required Teminal & click enter", test, test1);
			
			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);

			waitForElement(driver, termDepotSearchField_L);
			Actionsendkeys(driver, termDepotSearchField_L, termDepotMultiEqEnt);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			Step_End(6, "Enter required Teminal & click enter", test, test1);
			Step_Start(7, " Select Size/Type drop menu & click required option", test, test1);

			waitForElement(driver, sizeTypeDropDown_L);
			click(driver, sizeTypeDropDown_L);
			String selectSizeType=String.format(sizeType_Option, sizeType);
			waitForElement(driver, selectSizeType);
			click(driver, selectSizeType);
			
			Step_End(7, " Select Size/Type drop menu & click required option", test, test1);

			Step_Start(8, "Enter valid release reference no in that field", test, test1);
			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, releaseRefNo);
			Step_End(8, "Enter valid release reference no in that field", test, test1);

			///// Non mandatory fields

			if (!iso.equals("")) {
				waitForElement(driver, isoDropdown);
				click(driver, isoDropdown);
				waitForElement(driver, isoDropdown_Input);
				sendKeys(driver, isoDropdown_Input, iso);
				enter(driver);
			} 
			if (!shipperOwned.equals("")) {
				waitForElement(driver, shipper_Owned_Dropdown);
				click(driver, shipper_Owned_Dropdown);

				String select_ShipperOwned =String.format(shipper_Owned, shipperOwned);
				waitForElement(driver, select_ShipperOwned);
				click(driver, select_ShipperOwned);
			} 

			if (!leaseKind.equals("")) {
				waitForElement(driver, leaseKind_Dropdown);
				click(driver, leaseKind_Dropdown);
				String select_LeaseKind = String.format(lease_Kind, leaseKind);
				waitForElement(driver, select_LeaseKind);
				click(driver, select_LeaseKind);
			} 

			if (!lessor.equals("")) {
				waitForElement(driver, Lessor_Btn); 
				click(driver, Lessor_Btn);
				twoColumnSearchWindow(driver, lessorSearch_Filter, condition, lessor);

			} 

			if (!lessee.equals("")) {
				waitForElement(driver, Lessee_Search_Btn); 
				click(driver, Lessee_Search_Btn);
				twoColumnSearchWindow(driver, lesseeSearch_Filter, condition, lessee);

			} 

			if (!maker.equals("")) {
				waitForElement(driver, maker_Textfield);
				click(driver, maker_Textfield);
				waitForElement(driver, maker_Textfield);
				sendKeys(driver, maker_Textfield, maker);

				enter(driver);
			} 

			if (!material.equals("")) {
				waitForElement(driver, material_Textfield);
				click(driver, material_Textfield);
				waitForElement(driver, material_Textfield);
				sendKeys(driver, material_Textfield, material);

				enter(driver);
			} 
			if (!tare.equals("")) {
				waitForElement(driver, tare_Textfield);
				click(driver, tare_Textfield);
				waitForElement(driver, tare_Textfield);
				clearAndType(driver, tare_Textfield, tare);
				enter(driver);
			}
			if (!payLoad.equals("")) {
				waitForElement(driver, payLoad_Textfield);
				click(driver, payLoad_Textfield);
				waitForElement(driver, payLoad_Textfield);
				clearAndType(driver, payLoad_Textfield, payLoad);

				enter(driver);
			} 

			if (!grossWeight.equals("")) {
				waitForElement(driver, grossWeight_Textfield);
				click(driver, grossWeight_Textfield);
				waitForElement(driver, grossWeight_Textfield);
				clearAndType(driver, grossWeight_Textfield, grossWeight);
				enter(driver);
			} 

			if (!supplierContractNo.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				sendKeys(driver, supplierContract_L, supplierContractNo);
				enter(driver);
			} 

			if (!manufactureDate.equals("")) {
				waitForElement(driver, Manufacture_Date);
				
				if (datePicker.equalsIgnoreCase("Yes")) {

					selectDatePicker(driver, Manufacture_Date, manufactureDate);

				} else {
					click(driver, Manufacture_Date);

					if (manufactureDate.contains("-")) {
						String manufactureDate_1 = manufactureDate.replace("-", "/");
						clearAndType(driver, Manufacture_Date, manufactureDate_1);

					} else {
						clearAndType(driver, Manufacture_Date, manufactureDate);

					}
				}
			} 
			if (!refNumber.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				sendKeys(driver, refNumber_Textfield, refNumber);

				enter(driver);
			} 
			if (!thirtyTon.equals("")) {
				waitForElement(driver, thirtyTon_Dropdown);
				click(driver, thirtyTon_Dropdown);
				waitForElement(driver, thirtyTon_Dropdown);
				String select_Ton = String.format(thirty_Ton, thirtyTon);
				waitForElement(driver, select_Ton);
				click(driver, select_Ton);
			} 

			if (!bLNO.equals("")) {
				waitForElement(driver, BL_No_SearchBtn);
				click(driver, BL_No_SearchBtn);
				twoColumnSearchWindow(driver, BL_Search_Filter, condition, bLNO);

			} 

			if (!remarks.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				sendKeys(driver, remarks_Textfield, remarks);

				enter(driver);
			}
			
			
			List<String> equipment_Number = splitAndExpand(eqpNoMulti_1);
			for(int i=0;i<equipment_Number.size();i++) {
				
				Step_Start(9, "press Add button once all required field is entered", test, test1);
				
				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);

				Step_End(9, "press Add button once all required field is entered", test, test1);
				Step_Start(10, "Enter valid container no in Equipment no field in grid", test, test1);
				
			String equipmentNumber_Add=String.format(equipmentNumber_Grid_Textfield, i);
			String equipmentNumber_Input_Add=String.format(equipmentNumber_Grid_Input_Textfield, i);
			String equipmentNo=equipment_Number.get(i);
			
			waitForDisplay(driver, equipmentNumber_Add);
			scrollUsingElement(driver, equipmentNumber_Add);
			waitForElement(driver, equipmentNumber_Add);
			click(driver, equipmentNumber_Add);

			waitForElement(driver, equipmentNumber_Input_Add);
			sendKeys(driver, equipmentNumber_Input_Add, equipmentNo);

			Step_End(10, "Enter valid container no in Equipment no field in grid", test, test1);

			
			}
			
			Step_Start(11, "Click save button & system should show saved message accordingly", test, test1);

			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);

			waitForElement(driver, errorRecordsFrame_L);
			if (isDisplayed(driver, errorRecordsFrame_L)) {
				waitForDisplay(driver, errorRecApply_L);
				if (isDisplayed(driver, errorRecApply_L)) {
					click(driver, errorRecApply_L);

				}
				else if (isDisplayed(driver, okButtonErrorFrame_L)) {
					waitForElement(driver, okButtonErrorFrame_L);
					click(driver, okButtonErrorFrame_L);
				}
			}

			for(int i=0;i<equipment_Number.size();i++) {
				String equipmentNumber_Gridcell=String.format(equipmentNumber_Gridcell_Value, i);
			
			waitForDisplay(driver, equipmentNumber_Gridcell);
			String actualEqpNumber = getText(driver, equipmentNumber_Gridcell);
			Extent_pass(driver, "Actual Equipment Number "+(i+1)+" : "+actualEqpNumber, test, test1);
			}
			
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);

			waitForElement(driver, popup_Message);
				String actText = getText(driver, popup_Message);
				if (actText.equals(multiSavedPopup)) {
					System.out.println("Matched || " + " Expected Value is : " + multiSavedPopup
							+ " || Actual Value is : " + actText);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + multiSavedPopup
							+ " || ActualValue is : " + actText+"<br>"+multiSavedPopup + " popup is displayed", test, test1);
					click(driver, popup_Message_Ok_Button);
				} else {
					System.out.println("Not matched || " + " Expected Value is : " + multiSavedPopup
							+ " || Actual Value  is : " + actText);

					Extent_fail(driver, "Not matched || " + " Expected Value is : " + multiSavedPopup
							+ " || Actual Value is : " + actText+"<br>"+multiSavedPopup + " popup is not displayed", test, test1);
				}

			
			Step_End(11, "Click save button & system should show saved message accordingly", test, test1);

		} else {
			System.out.println("Multiple Equipment Entry page is not displayed");
			Extent_fail(driver, "Multiple Equipment Entry page is not displayed", test, test1);
		}
		Extent_completed(testCaseName, test, test1);
	}
	
}
