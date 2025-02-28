package LRP_EMS_Movement_Entry_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

//  To Edit & update location and terminal in movement entry via single equipment

public class TC_Movement_Entry_TS_017 extends Keywords {

	public void editUpdateViaSingleEquipment(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) {
		String testCaseName="TC_Movement_Entry_TS_017";
//		Get data from excel sheet

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);

		String releaseRefNoSingleEdit = Excel_data.get("ReleaseRefNum");
		String eqpNoSingleEdit = Excel_data.get("EquipmentNo");

		String sizeTypeSingleEdit = Excel_data.get("SizeType");
		String updateLocSingleEdit = Excel_data.get("UpdateLocation");
		String updateTerm = Excel_data.get("UpdateTerminal");
		String uptadedSinglePopup = Excel_data.get("UpdatedPopup");

		String username = Excel_data.get("Username");
		String password = Excel_data.get("Password");
		String moduleName = Excel_data.get("ModuleMovementEntry");

		String supplierContractNoSingle = Excel_data.get("SupplierContractNo");

		String isoSingle = Excel_data.get("ISO");
		String shipperOwnedSingle = Excel_data.get("ShipperOwned");
		String leaseKindSingle = Excel_data.get("LeaseKind");
		String lessorSingle = Excel_data.get("Lessor");
		String lesseeSingle = Excel_data.get("Lessee");
		String makerSingle = Excel_data.get("Maker");
		String materialSingle = Excel_data.get("Material");
		String tareSingle = Excel_data.get("Tare");
		String payLoadSingle = Excel_data.get("PayLoad");
		String grossWeightSingle = Excel_data.get("GrossWeight");
		String manufactureDateSingle = Excel_data.get("ManufactureDate");

		String refNumberSingle = Excel_data.get("RefNumber");
		String thirtyTonSingle = Excel_data.get("30Ton");
		String bLNOSingle = Excel_data.get("BLNO");
		String remarksSingle = Excel_data.get("Remarks");
		String datePicker = Excel_data.get("DatePicker");
		String movement_Code = Excel_data.get("Movement_Code");

		
		String condition = Excel_data.get("Condition");

		String portSearch_Filter=Excel_data.get("PortSearch_Filter");
		String terminalSearch_Filter=Excel_data.get("TerminalSearch_Filter");
		String lesseeSearch_Filter=Excel_data.get("LesseeSearch_Filter");
		String lessorSearch_Filter=Excel_data.get("LessorSearch_Filter");
		String BL_Search_Filter=Excel_data.get("BL_Search_Filter");
		
		navigateUrl(driver, url);

		Extent_Start(testCaseName, test, test1);

		// Login

		LRP_Login(driver, username, password);
		
//	Search module
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

		Step_Start(1, "Enter the required container number in the Single Equipment Entry field and click Show History.", test, test1);
		// Single Equipment Entry
		waitForElement(driver, singleEntryMovPage_L);
		if (isDisplayed(driver, singleEntryMovPage_L)) {
			System.out.println("Single Equipment Entry page is displayed");
			Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
			waitForElement(driver, equipmentNoSearchField_L);
			sendKeys(driver, equipmentNoSearchField_L, eqpNoSingleEdit);

			waitForElement(driver, showHistoryButton_L);
			click(driver, showHistoryButton_L);

			Step_End(1, "Enter the required container number in the Single Equipment Entry field and click Show History.", test, test1);

			Step_Start(2, "Enter the movement code in the designated column", test, test1);
			
			waitForElement(driver, movementCode_Grid_Filter);
			click(driver, movementCode_Grid_Filter);
			waitForElement(driver, movementCode_Grid_Filter);
			sendKeys(driver, movementCode_Grid_Filter, movement_Code);
			
			Step_End(2, "Enter the movement code in the designated column", test, test1);
			Step_Start(3, "Once the move is filtered, right-click and select the Edit option", test, test1);
			
			waitForElement(driver, eqpNoInEqpDetails_L);
			String actSaved = getText(driver, eqpNoInEqpDetails_L);
			if (actSaved.equals(eqpNoSingleEdit)) {
				System.out.println("Matched || " + " Expected Value is : " + eqpNoSingleEdit + " || Actual Value is : "+ actSaved);
				Extent_pass(driver,
						"Matched || Equipment number is retrieved || " + " Expected Value is : " + eqpNoSingleEdit + " || ActualValue is : " + actSaved,
						test, test1);

				waitForDisplay(driver, eqpNoInEqpDetails_L);
				RightClick(driver, eqpNoInEqpDetails_L);
				
				waitForElement(driver, singleEdit_2);
				click(driver, singleEdit_2);
			} else {
				System.out.println("Not matched || " + " Expected Value is : " + eqpNoSingleEdit
						+ " || Actual Value  is : " + actSaved);
				Extent_fail(driver, "Not matched || Equipment number not retrieved || " + " Expected Value is : " + eqpNoSingleEdit
						+ " || Actual Value is : " + actSaved, test, test1);
			}

			Step_End(3, "Once the move is filtered, right-click and select the Edit option", test, test1);
			Step_Start(4, "Clear the existing port and click on the Location Search button.", test, test1);

			click(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			clear(driver, locationSaerchField_L);

			waitForElement(driver, location_SearchButton);
			click(driver, location_SearchButton);
			
			Step_End(4, "Clear the existing port and click on the Location Search button.", test, test1);
			Step_Start(5, "Select the required port from the list.", test, test1);

			twoColumnSearchWindow(driver, portSearch_Filter, condition, updateLocSingleEdit);


			Step_End(5, "Select the required port from the list.", test, test1);
			Step_Start(6, "Click on the Term./Depot Search button and choose the desired terminal or depot", test, test1);

			waitForElement(driver, depot_SearchButton);
			click(driver, depot_SearchButton);
			
			twoColumnSearchWindow(driver, terminalSearch_Filter, condition, updateTerm);

			
			Step_End(6, "Click on the Term./Depot Search button and choose the desired terminal or depot", test, test1);
			
			///// Non mandatory fields
			if (!releaseRefNoSingleEdit.equals("")) {
				waitForElement(driver, relRefNoTextField_L);
				click(driver, relRefNoTextField_L);
				waitForElement(driver, relRefNoTextField_L);
				clearAndType(driver, relRefNoTextField_L, releaseRefNoSingleEdit);
			}
			if (!sizeTypeSingleEdit.equals("")) {
				waitForElement(driver, sizeTypeDropDown_L);
				click(driver, sizeTypeDropDown_L);
				String selectSizeType=String.format(sizeType_Option, sizeTypeSingleEdit);
				waitForElement(driver, selectSizeType);
				click(driver, selectSizeType);
				
			}

			if (!isoSingle.equals("")) {
				waitForElement(driver, isoDropdown);
				click(driver, isoDropdown);
				waitForElement(driver, isoDropdown_Input);
				clearAndType(driver, isoDropdown_Input, isoSingle);
				enter(driver);
			} 

			if (!shipperOwnedSingle.equals("")) {
				waitForElement(driver, shipper_Owned_Dropdown);
				click(driver, shipper_Owned_Dropdown);
				String select_ShipperOwned =String.format(shipper_Owned, shipperOwnedSingle);

				waitForElement(driver, select_ShipperOwned);
				click(driver, select_ShipperOwned);

			} 

			if (!leaseKindSingle.equals("")) {
				waitForElement(driver, leaseKind_Dropdown);
				click(driver, leaseKind_Dropdown);
				String select_LeaseKind=String.format(lease_Kind, leaseKindSingle);

				waitForElement(driver, select_LeaseKind);
				click(driver, select_LeaseKind);

			} 

			if (!lessorSingle.equals("")) {
				waitForElement(driver, Lessor_Btn); 
				click(driver, Lessor_Btn);
				twoColumnSearchWindow(driver, lessorSearch_Filter, condition, lessorSingle);

			} 

			if (!lesseeSingle.equals("")) {
				waitForElement(driver, Lessee_Search_Btn); 
				click(driver, Lessee_Search_Btn);
				twoColumnSearchWindow(driver, lesseeSearch_Filter, condition, lesseeSingle);

			}
			
			
			if (!makerSingle.equals("")) {
				waitForElement(driver, maker_Textfield);
				click(driver, maker_Textfield);
				waitForElement(driver, maker_Textfield);
				clearAndType(driver, maker_Textfield, makerSingle);
			}

			if (!materialSingle.equals("")) {
				waitForElement(driver, material_Textfield);
				click(driver, material_Textfield);
				waitForElement(driver, material_Textfield);
				clearAndType(driver, material_Textfield, materialSingle);
			} 

			if (!tareSingle.equals("") && isDisplayed(driver, tare_Textfield)) {
				waitForElement(driver, tare_Textfield);
				click(driver, tare_Textfield);
				waitForElement(driver, tare_Textfield);
				clearAndType(driver, tare_Textfield, tareSingle);
			} 

			if (!payLoadSingle.equals("")) {
				waitForElement(driver, payLoad_Textfield);
				click(driver, payLoad_Textfield);
				waitForElement(driver, payLoad_Textfield);
				clearAndType(driver, payLoad_Textfield, payLoadSingle);
			} 

			if (!grossWeightSingle.equals("")) {
				waitForElement(driver, grossWeight_Textfield);
				click(driver, grossWeight_Textfield);
				waitForElement(driver, grossWeight_Textfield);
				clearAndType(driver, grossWeight_Textfield, grossWeightSingle);
			} 

			if (!supplierContractNoSingle.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				clearAndType(driver, supplierContract_L, supplierContractNoSingle);
			} 

			if (!manufactureDateSingle.equals("")) {
				waitForElement(driver, Manufacture_Date);
				
				if (datePicker.equalsIgnoreCase("Yes")) {

					selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);

				} else {
					click(driver, Manufacture_Date);
					if (manufactureDateSingle.contains("-")) {
						String manufactureDate_1 = manufactureDateSingle.replace("-", "/");
						clearAndType(driver, Manufacture_Date, manufactureDate_1);

					} else {
						clearAndType(driver, Manufacture_Date, manufactureDateSingle);

					}
				}
			} 

			if (!refNumberSingle.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				clearAndType(driver, refNumber_Textfield, refNumberSingle);
			} 

			if (!thirtyTonSingle.equals("")) {
				waitForElement(driver, thirtyTon_Dropdown);
				click(driver, thirtyTon_Dropdown);

				String select_Ton = String.format(thirty_Ton, thirtyTonSingle);

				waitForElement(driver, select_Ton);
				click(driver, select_Ton);
			} 
			if (!bLNOSingle.equals("")) {
				waitForElement(driver, BL_No_SearchBtn);
				click(driver, BL_No_SearchBtn);
				twoColumnSearchWindow(driver, BL_Search_Filter, condition, bLNOSingle);

			} 
		
			if (!remarksSingle.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				clearAndType(driver, remarks_Textfield, remarksSingle);
			} 
			
			
			Step_Start(7, "Click Save, and the system will display a confirmation message indicating the update was successful", test, test1);

			String ActualEqNo = getAttribute(driver, equipmentNoSearchField_L, "value");
			System.out.println("ActualEqNo:" + ActualEqNo);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);

			waitForElement(driver, popup_Message);
			String actPopupText = getText(driver, popup_Message);
			if (actPopupText.equals(uptadedSinglePopup)) {
				System.out.println("Matched || " + " Expected Value is : " + uptadedSinglePopup
						+ " || Actual Value is : " + actPopupText);

				Extent_pass(driver, "Matched || "+uptadedSinglePopup + " popup is displayed" + " || Expected Value is : " + uptadedSinglePopup
						+ " || ActualValue is : " + actPopupText, test, test1);
				click(driver, popup_Message_Ok_Button);

			} else {
				System.out.println("Not matched || " + " Expected Value is : " + uptadedSinglePopup
						+ " || Actual Value  is : " + actPopupText);

				Extent_fail(driver, "Not matched || "+uptadedSinglePopup + " popup is not displayed" + "|| Expected Value is : " + uptadedSinglePopup
						+ " || Actual Value is : " + actPopupText, test, test1);
			}


			Step_End(7, "Click Save, and the system will display a confirmation message indicating the update was successful", test, test1);
		} else {
			System.out.println("Single Equipment Entry page is not displayed");
			Extent_fail(driver, "Single Equipment Entry page is not displayed", test, test1);
		}

		Extent_completed(testCaseName, test, test1);

	}

}
