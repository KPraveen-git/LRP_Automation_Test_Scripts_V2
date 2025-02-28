package LRP_EMS_Movement_Entry_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_TS_018 extends Keywords {

//	To Edit & update location and terminal in movement entry via multiple equipment

	public void editUpdateLocationAndTerminalViaMultipleEntry(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) {
		
		String testCaseName="TC_Movement_Entry_TS_018";
//		Get data from excel sheet

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,
				"Dataset" + selected_dataset, File_Path);
		String username = Excel_data.get("Username");
		String password = Excel_data.get("Password");
		String moduleName = Excel_data.get("ModuleMovementEntry");
		String retrieveEqpNo = Excel_data.get("RetrieveEqpNo");
		String updatedPopupMulti = Excel_data.get("MultiUpdatedPopup");
		String locationMultiEqEnt = Excel_data.get("LocationEqEnt");
		String termDepotMultiEqEnt = Excel_data.get("TermDepot");

		String releaseRefNo = Excel_data.get("ReleaseRefNum");
		String supplierContractNo = Excel_data.get("SupplierContractNo");
		String sizeType = Excel_data.get("SizeType");

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

		String activityPlaceCheckBox = Excel_data.get("ActivityPlace_CheckBox");
		String depotCheckBox = Excel_data.get("Depot_CheckBox");
		String releaseRefCheckBox = Excel_data.get("ReleaseRef_CheckBox");
		String sizeTypeCheckBox = Excel_data.get("SizeType_CheckBox");
		String isoCheckBox = Excel_data.get("ISO_CheckBox");
		String leaseKindCheckBox = Excel_data.get("LeaseKind_CheckBox");
		String lessorCheckBox = Excel_data.get("Lessor_CheckBox");
		String lesseeCheckBox = Excel_data.get("Lessee_CheckBox");
		String remarksCheckBox = Excel_data.get("Remarks_CheckBox");
		String materialCheckBox = Excel_data.get("Material_CheckBox");
		String payLoadCheckBox = Excel_data.get("PayLoad_CheckBox");
		String grossWeightCheckBox = Excel_data.get("GrossWeight_CheckBox");
		String supplierContractCheckBox = Excel_data.get("SupplierContract_CheckBox");
		String manufacturedateCheckBox = Excel_data.get("Manufacturedate_CheckBox");
		String refNumberCheckBox = Excel_data.get("RefNumber_CheckBox");
		String TonCheckBox = Excel_data.get("30Ton_CheckBox");
		String blno_CheckBox = Excel_data.get("BLNO_CheckBox");

		String refNumber = Excel_data.get("RefNumber");
		String thirtyTon = Excel_data.get("30Ton");
		String bLNO = Excel_data.get("BLNO");
		String remarks = Excel_data.get("Remarks");
		String datePicker = Excel_data.get("DatePicker");
		String movement_Code = Excel_data.get("Movement_Code");
		String globalSearchFilterOption1 = Excel_data.get("GlobalSearchFilterOption1");
		String dropdownCondition = Excel_data.get("DropdownCondition");
		String condition = Excel_data.get("Condition");

		String globalSearchFilterOption2 = Excel_data.get("globalSearchFilterOption2");
		String globalSearchFilterOption3 = Excel_data.get("globalSearchFilterOption3");
		String searchValue2 = Excel_data.get("searchValue2");
		String searchValue3 = Excel_data.get("searchValue3");

		String portSearch_Filter=Excel_data.get("PortSearch_Filter");
		String terminalSearch_Filter=Excel_data.get("TerminalSearch_Filter");
		String lesseeSearch_Filter=Excel_data.get("LesseeSearch_Filter");
		String lessorSearch_Filter=Excel_data.get("LessorSearch_Filter");
		String BL_Search_Filter=Excel_data.get("BL_Search_Filter");
		
		navigateUrl(driver, url);
		Extent_Start(testCaseName, test, test1);
		
		// Login

		LRP_Login(driver, username, password);
		
		Step_Start(1, "Enter the module name in the search box and click on the module.", test, test1);

//		Search module
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
		
		Step_End(1, "Enter the module name in the search box and click on the module.", test, test1);
		Step_Start(2, "Select the Multiple Equipment Entry option.", test, test1);
		
		waitForElement(driver, multiEntryMovPage_L);
		click(driver, multiEntryMovPage_L);

		if (isDisplayed(driver, multiEntryMovPage_L)) {
			System.out.println("Multiple Equipment Entry page is displayed");
			Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
			
			Step_End(2, "Select the Multiple Equipment Entry option.", test, test1);
			Step_Start(3, "Click on the Global Search icon in the toolbar", test, test1);
			
			waitForElement(driver, globalSearch_L);
			click(driver, globalSearch_L);
			
			Step_End(3, "Click on the Global Search icon in the toolbar", test, test1);
			Step_Start(4, "Enter the required container number in the appropriate field.", test,test1);
			Step_Start(5, "Click the Search button to view the results, then select the required container", test, test1);

			globalValueSearchWindow(driver, dropdownCondition, globalSearchFilterOption1, retrieveEqpNo, globalSearchFilterOption2, searchValue2, globalSearchFilterOption3, searchValue3);
			
			Step_End(4, "Enter the required container number in the appropriate field.", test, test1);
			Step_End(5, "Click the Search button to view the results, then select the required container", test, test1);
			Step_Start(6, "Enter the movement code in the designated column", test, test1);

			waitForElement(driver, eqpNoInEqpDetails_L);
			String actualRetNo = getText(driver, eqpNoInEqpDetails_L);

			System.out.println("Actual Eqp No:" + actualRetNo);
			System.out.println("Expected Eqp No:" + retrieveEqpNo);

			if (actualRetNo.equals(retrieveEqpNo)) {
				Extent_pass(driver, "Data is retrieved from multiple movement entry", test, test1);
				System.out.println("Data is retrieved from multiple movement entry");
				
				waitForElement(driver, movementCode_Grid_Filter);
				click(driver, movementCode_Grid_Filter);
				waitForElement(driver, movementCode_Grid_Filter);
				sendKeys(driver, movementCode_Grid_Filter, movement_Code);
				
				waitForElement(driver, eqpNoInEqpDetails_L);
				RightClick(driver, eqpNoInEqpDetails_L);
				waitForElement(driver, editOption_L);
				click(driver, editOption_L);

			} else {
				System.out.println("Data is not retrieved from multiple movement entry");
				Extent_fail(driver, "Data is not retrieved from multiple movement entry", test, test1);
			}

			Step_End(6, "Enter the movement code in the designated column", test, test1);

			// Edit
			waitForElement(driver, showInputFieldFrame_L);
			if (isDisplayed(driver, showInputFieldFrame_L)) {
				System.out.println("Show input field frame is displayed");
				Extent_pass(driver, "Show input field frame is displayed", test, test1);

				String locBefore1 = getAttribute(driver, locationSaerchField_L, "value");
				String termBefore1 = getAttribute(driver, termDepotSearchField_L, "value");
				System.out.println("Location before edit:" + locBefore1);
				System.out.println("Terminal before edit:" + termBefore1);

				Step_Start(7, "Clear the existing port and click on the Location Search button", test, test1);

				click(driver, locationSaerchField_L);
				waitForElement(driver, locationSaerchField_L);
				clear(driver, locationSaerchField_L);

				waitForElement(driver, location_SearchButton);
				click(driver, location_SearchButton);
				
				Step_End(7, "Clear the existing port and click on the Location Search button", test, test1);
				Step_Start(8, "Select the required port from the list.", test, test1);

					twoColumnSearchWindow(driver, portSearch_Filter, condition, locationMultiEqEnt);

				
				
				Step_End(8, "Select the required port from the list.", test, test1);
				Step_Start(9, "Click on the Term./Depot Search button and choose the desired terminal or depot.", test, test1);

				waitForElement(driver, depot_SearchButton);
				click(driver, depot_SearchButton);
					
					twoColumnSearchWindow(driver, terminalSearch_Filter, condition, termDepotMultiEqEnt);


				Step_End(9, "Click on the Term./Depot Search button and choose the desired terminal or depot.", test, test1);
				
				if (!sizeType.equals("")) {
					waitForElement(driver, sizeTypeDropDown_L);
					click(driver, sizeTypeDropDown_L);
					String selectSizeType=String.format(sizeType_Option, sizeType);
					waitForElement(driver, selectSizeType);
					click(driver, selectSizeType);
				}
				if (!releaseRefNo.equals("")) {
					waitForElement(driver, relRefNoTextField_L);
					sendKeys(driver, relRefNoTextField_L, releaseRefNo);
				}

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
					clearAndType(driver, maker_Textfield, maker);
				} 

				if (!material.equals("")) {
					waitForElement(driver, material_Textfield);
					click(driver, material_Textfield);
					waitForElement(driver, material_Textfield);
					clearAndType(driver, material_Textfield, material);
				}
				if (!tare.equals("")) {
					waitForElement(driver, tare_Textfield);
					click(driver, tare_Textfield);
					waitForElement(driver, tare_Textfield);
					clearAndType(driver, tare_Textfield, tare);
				}

				if (!payLoad.equals("")) {
					waitForElement(driver, payLoad_Textfield);
					click(driver, payLoad_Textfield);
					waitForElement(driver, payLoad_Textfield);
					clearAndType(driver, payLoad_Textfield, payLoad);
				} 

				if (!grossWeight.equals("")) {
					waitForElement(driver, grossWeight_Textfield);
					click(driver, grossWeight_Textfield);
					waitForElement(driver, grossWeight_Textfield);
					clearAndType(driver, grossWeight_Textfield, grossWeight);
				} 

				if (!supplierContractNo.equals("")) {
					waitForElement(driver, supplierContract_L);
					click(driver, supplierContract_L);
					waitForElement(driver, supplierContract_L);
					clearAndType(driver, supplierContract_L, supplierContractNo);
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
					clearAndType(driver, refNumber_Textfield, refNumber);
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
					clearAndType(driver, remarks_Textfield, remarks);
				} 
				
// Select required Checkbox to edit
				
				waitForElement(driver, editButtonMultiMove_L);
				click(driver, editButtonMultiMove_L);
				waitForElement(driver, selectCheckboxFrame_L);
				if (isDisplayed(driver, selectCheckboxFrame_L)) {
					
					if(activityPlaceCheckBox.equalsIgnoreCase("Yes")) {
					 
					scrollUsingElement(driver, activePlaceCheckbox_L);
					waitForElement(driver, activePlaceCheckbox_L);
					click(driver, activePlaceCheckbox_L);

					}
					if(depotCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, depotCheckbox_L);
						waitForElement(driver, depotCheckbox_L);
						click(driver, depotCheckbox_L);
					}
					if(releaseRefCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, releaseRefCheckBox_L);
						waitForElement(driver, releaseRefCheckBox_L);
						click(driver, releaseRefCheckBox_L);
					}
					if(sizeTypeCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, sizeTypeCheckBox_L);
						waitForElement(driver, sizeTypeCheckBox_L);
						click(driver, sizeTypeCheckBox_L);
					}
					if(isoCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, isoCheckBox_L);
						waitForElement(driver, isoCheckBox_L);
						click(driver, isoCheckBox_L);
					}
					if(leaseKindCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, leaseKind_CheckBox);
						waitForElement(driver, leaseKind_CheckBox);
						click(driver, leaseKind_CheckBox);
					}
					if(lessorCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, lessor_CheckBox);
						waitForElement(driver, lessor_CheckBox);
						click(driver, lessor_CheckBox);
					}
					if(lesseeCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, lessee_CheckBox);
						waitForElement(driver, lessee_CheckBox);
						click(driver, lessee_CheckBox);
					}
					if(remarksCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, remark_ChecBox);
						waitForElement(driver, remark_ChecBox);
						click(driver, remark_ChecBox);
					}
					if(materialCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, material_CheckBox);
						waitForElement(driver, material_CheckBox);
						click(driver, material_CheckBox);
					}
					if(payLoadCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, payLoad_Checkbox_L);
						waitForElement(driver, payLoad_Checkbox_L);
						click(driver, payLoad_Checkbox_L);
					}
					if(!grossWeightCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, grossWeihgt_Checkbox_L);
						waitForElement(driver, grossWeihgt_Checkbox_L);
						click(driver, grossWeihgt_Checkbox_L);
					}
					if(supplierContractCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, supplierContract_CheckBox);
						waitForElement(driver, supplierContract_CheckBox);
						click(driver, supplierContract_CheckBox);
					}
					if(manufacturedateCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, manufactureDate_CheckBox);
						waitForElement(driver, manufactureDate_CheckBox);
						click(driver, manufactureDate_CheckBox);
					}
					if(refNumberCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, refNumber_CheckBox);
						waitForElement(driver, refNumber_CheckBox);
						click(driver, refNumber_CheckBox);
					}
					if(TonCheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, thirtyDon_CheckBox);
						waitForElement(driver, thirtyDon_CheckBox);
						click(driver, thirtyDon_CheckBox);
					}
					if(blno_CheckBox.equalsIgnoreCase("Yes")) {
						 
						scrollUsingElement(driver, blNo_ChecBox);
						waitForElement(driver, blNo_ChecBox);
						click(driver, blNo_ChecBox);
					}
					
					waitForElement(driver, selectCheckboxOk_L);
					click(driver, selectCheckboxOk_L);
				}

				waitForElement(driver, verifyActivePlace_L);
				String actActivePlace = getText(driver, verifyActivePlace_L);
				String actDepot = getText(driver, verifyDepot_L);
				System.out.println("Actual Active Place:" + actActivePlace);
				System.out.println("Actual Dpot:" + actDepot);

				Step_Start(9, "Click the Edit button, then click Save. The system will display a confirmation message indicating the update was successful.", test, test1);
				waitForElement(driver, saveButtonMoveEnt_L);
				click(driver, saveButtonMoveEnt_L);

				waitForElement(driver, popup_Message);
				String actText = getText(driver, popup_Message);
					if (actText.equals(updatedPopupMulti)) {
						System.out.println("Matched || "+updatedPopupMulti + " popup is displayed" + " Expected Value is : " + updatedPopupMulti+ " || Actual Value is : " + actText);
						Extent_pass(driver, "Matched || " +updatedPopupMulti + " popup is displayed"+ " Expected Value is : " + updatedPopupMulti+ " || ActualValue is : " + actText, test, test1);

						click(driver, popup_Message_Ok_Button);
					} else {
						System.out.println("Not matched || "+updatedPopupMulti + " popup is not displayed" + " Expected Value is : " + updatedPopupMulti
								+ " || Actual Value  is : " + actText);
						Extent_fail(driver, "Not matched || "+updatedPopupMulti + " popup is not displayed" + " Expected Value is : " + updatedPopupMulti
								+ " || Actual Value is : " + actText, test, test1);
					}

				}

				Step_End(9, "Click the Edit button, then click Save. The system will display a confirmation message indicating the update was successful.", test, test1);

		} else {
			System.out.println("Multiple Equipment Entry page is not displayed");
			Extent_fail(driver, "Multiple Equipment Entry page is not displayed", test, test1);
		}
		Extent_completed(testCaseName, test, test1);
	}
}
