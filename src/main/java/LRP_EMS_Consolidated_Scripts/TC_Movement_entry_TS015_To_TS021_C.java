package LRP_EMS_Consolidated_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_entry_TS015_To_TS021_C extends Keywords{
	
	public void movemententry15to21 (WebDriver driver,ExtentTest test,ExtentTest test1, String selected_dataset) throws Exception {
		
		String testCaseName15="TC_Movement_Entry_TS_015";
		String File_Path15 = TestNgXml.getfilePath_FromExecution().get(testCaseName15);
		String Sheet_Name15 = TestNgXml.getsheetName_FromExecution().get(testCaseName15);
		String url = TestNgXml.getdatafromExecution().get("TC_Movement_entry_TS015_To_TS021_C");
		Map<String, String> Excel_data15 = Utils.GetAllData(Sheet_Name15, testCaseName15,
				"Dataset" + selected_dataset, File_Path15);
		String username = Excel_data15.get("Username");
		String password = Excel_data15.get("Password");
		
		navigateUrl(driver, url);

		LRP_Login(driver, username, password);
					
		boolean ts15=true;
		if(ts15==true) {
		
			String testCaseName="TC_Movement_Entry_TS_015";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);
			
			String moduleName = Excel_data.get("ModuleMovementEntry");
			String activityEqpEntry = Excel_data.get("ActivityEqpEntry");
			String locationSingleEqEnt = Excel_data.get("LocationEqEnt");
			String termDepotSingleEqEnt = Excel_data.get("TermDepot");
			String releaseRefNoSingle = Excel_data.get("ReleaseRefNum");
			String eqpNo = Excel_data.get("EquipmentNo");
			String supplierContractNoSingle = Excel_data.get("SupplierContractNo");
			String savedPopupText = Excel_data.get("SavedPopup");
			String activityDateSingle = Excel_data.get("ActivityDate");

			String sizeTypeSingle = Excel_data.get("SizeType");
			String activityHourSingle = Excel_data.get("ActivityHour");
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
			String datePicker=Excel_data.get("DatePicker");
			String condition=Excel_data.get("Condition");
			
			String portSearch_Filter=Excel_data.get("PortSearch_Filter");
			String terminalSearch_Filter=Excel_data.get("TerminalSearch_Filter");
			String lesseeSearch_Filter=Excel_data.get("LesseeSearch_Filter");
			String lessorSearch_Filter=Excel_data.get("LessorSearch_Filter");
			String BL_Search_Filter=Excel_data.get("BL_Search_Filter");

			Extent_Start(testCaseName, test, test1);

//			Module Search
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

			// Single Equipment Entry
			waitForElement(driver, singleEntryMovPage_L);
			if (isDisplayed(driver, singleEntryMovPage_L)) {
				Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);

				Step_Start(1, "Enter valid Container number in Equipment no field", test, test1);
				waitForElement(driver, equipmentNoSearchField_L);
				sendKeys(driver, equipmentNoSearchField_L, eqpNo);

				Step_End(1, "Enter valid Container number in Equipment no field", test, test1);
				Step_Start(2, "Enter movement code & click enter", test, test1);
				waitForElement(driver, activitySearchFieldInSingle_L);
				sendKeys(driver, activitySearchFieldInSingle_L, activityEqpEntry);

				enter(driver);
				Step_End(2, "Enter movement code & click enter", test, test1);
				Step_Start(3, "Select date from date picker accordingly", test, test1); 

				waitForElement(driver, activeDateInSingle_L);

				if(datePicker.equalsIgnoreCase("Yes")) {
						selectDatePicker(driver, activeDateInSingle_L, activityDateSingle);
				}else {
					if(activityDateSingle.contains("-")) {
						click(driver, activeDateInSingle_L);
						String activityDateSingle_1=activityDateSingle.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle_1);

					}else {
						click(driver, activeDateInSingle_L);
						clearAndType(driver, activeDateInSingle_L, activityDateSingle);
					}		
				}

				if (!activityHourSingle.equals("")) {

					click(driver, activityTime);

					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						waitForElement(driver, activity_Time);
						clearAndType(driver, activity_Time, activityHourSingle);
						waitForElement(driver, activityTime_Close);
						click(driver, activityTime_Close);
					}				

				}
				Step_End(3, "Select date from date picker accordingly", test, test1);
				Step_Start(4, "Click show input fields & click 'Yes' if any confirmation for check digit occurs", test, test1);
				waitForElement(driver, showInputSin_L);
				click(driver, showInputSin_L);

				waitForDisplay(driver, popup_Message);
				if (isdisplayed(driver, popup_Message)) {
					String wantToApplyPopup = getText(driver, popup_Message);

					Extent_pass(driver, wantToApplyPopup + " popup is displayed", test, test1);
					System.out.println(wantToApplyPopup + " popup is displayed");
					click(driver, popup_Message_Yes_Button);
					
				}
				Step_End(4, "Click show input fields & click 'Yes' if any confirmation for check digit occurs", test, test1);
				Step_Start(5, "Click on search icon for location & select location accordingly", test, test1);

				waitForElement(driver, location_SearchButton);
				click(driver, location_SearchButton);
				twoColumnSearchWindow(driver, portSearch_Filter, condition, locationSingleEqEnt);
				
				
				Step_End(5, "Click on search icon for location & select location accordingly", test, test1);
				Step_Start(6, "Click on search icon for depot & select depot accordingly", test, test1);

				waitForElement(driver, depot_SearchButton);
				click(driver, depot_SearchButton);
				twoColumnSearchWindow(driver, terminalSearch_Filter, condition, termDepotSingleEqEnt);

				Step_End(6, "Click on search icon for depot & select depot accordingly", test, test1);

				waitForElement(driver, relRefNoTextField_L);
				click(driver, relRefNoTextField_L);
				waitForElement(driver, relRefNoTextField_L);
				sendKeys(driver, relRefNoTextField_L, releaseRefNoSingle);
				Step_Start(7, "Click drop menu & select size type accordingly", test, test1);

				waitForElement(driver, sizeTypeDropDown_L);
				click(driver, sizeTypeDropDown_L);
				String selectSizeType=String.format(sizeType_Option, sizeTypeSingle);
				waitForElement(driver, selectSizeType);
				click(driver, selectSizeType);
				
				
				Step_End(7, "Click drop menu & select size type accordingly", test, test1);
				///// Non mandatory fields

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

					String select_ShipperOwned=String.format(shipper_Owned, shipperOwnedSingle);
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
					enter(driver);
				} 

				if (!materialSingle.equals("")) {
					waitForElement(driver, material_Textfield); 
					click(driver, material_Textfield);
					waitForElement(driver, material_Textfield); 
					clearAndType(driver, material_Textfield, materialSingle);
					enter(driver);
				} 

				if (!tareSingle.equals("") && isDisplayed(driver, tare_Textfield)) {
					waitForElement(driver, tare_Textfield); 
					click(driver, tare_Textfield);
					waitForElement(driver, tare_Textfield); 
					clearAndType(driver, tare_Textfield, tareSingle);
					enter(driver);
				} 

				if (!payLoadSingle.equals("")) {
					waitForElement(driver, payLoad_Textfield); 
					click(driver, payLoad_Textfield);
					waitForElement(driver, payLoad_Textfield);
					clearAndType(driver, payLoad_Textfield, payLoadSingle);
					enter(driver);
				}

				if (!grossWeightSingle.equals("")) {
					waitForElement(driver, grossWeight_Textfield);
					click(driver, grossWeight_Textfield);
					waitForElement(driver, grossWeight_Textfield);
					clearAndType(driver, grossWeight_Textfield, grossWeightSingle);
					enter(driver);
				}

				if (!supplierContractNoSingle.equals("")) {
					waitForElement(driver, supplierContract_L);
					click(driver, supplierContract_L);
					waitForElement(driver, supplierContract_L);
					clearAndType(driver, supplierContract_L, supplierContractNoSingle);
					enter(driver);
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
					enter(driver);
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
					enter(driver);
				} 
				Step_Start(8, "Click save from toolbar & single entry save message will be shown", test, test1);

				scrollTop(driver);
				waitForElement(driver, equipmentNoSearchField_L);
				String ActualEqNo = getAttribute(driver, equipmentNoSearchField_L, "value");
				System.out.println("ActualEqNo:" + ActualEqNo);
				
				waitForElement(driver, saveButtonMoveEnt_L);
				click(driver, saveButtonMoveEnt_L);

				if (isDisplayed(driver, errorRecordsFrame_L)) {
					click(driver, okButtonErrorFrame_L);
				}

				waitForElement(driver, popup_Message);
					String actText = getText(driver, popup_Message);
					if (actText.equals(savedPopupText)) {
						System.out.println("Matched || " + " Expected Value is : " + savedPopupText
								+ " || Actual Value is : " + actText);
						Extent_pass(driver, "Matched || " + " Expected Value is : " + savedPopupText
								+ " || ActualValue is : " + actText+"\r\n"+savedPopupText + " popup is displayed", test, test1);
						System.out.println(savedPopupText + " popup is displayed");
						click(driver, popup_Message_Ok_Button);

					} else {
						System.out.println("Not matched || " + " Expected Value is : " + savedPopupText
								+ " || Actual Value  is : " + actText);
						System.out.println(savedPopupText + " popup is not displayed");
						Extent_fail(driver, "Not matched || " + " Expected Value is : " + savedPopupText
								+ " || Actual Value is : " + actText+"\r\n"+savedPopupText + " popup is not displayed", test, test1);
					}
				
				
				Extent_pass(driver, "Actual Equipment Number : "+ActualEqNo, test, test1);
				
				Step_End(8, "Click save from toolbar & single entry save message will be shown", test, test1);

				Step_Start(9, "Verifiy whether the record is saved", test, test1);
				// Search

				waitForElement(driver, cancelButton_L);
				click(driver, cancelButton_L);

				waitForDisplay(driver, newButton_L);

				if(isdisplayed(driver, newButton_L)&& isElementAccessible(driver, newButton_L)) {
				waitForElement(driver, newButton_L);
				click(driver, newButton_L);
				}
				
				waitForElement(driver, equipmentNoSearchField_L);
				sendKeys(driver, equipmentNoSearchField_L, ActualEqNo);
				
				waitForElement(driver, showHistoryButton_L);
				click(driver, showHistoryButton_L);
				
				String retrieved_Record=String.format(retrieved_Equipment_Number, ActualEqNo);
				waitForElement(driver, retrieved_Record);

				String actSaved = getText(driver, retrieved_Record);
				if (actSaved.equals(ActualEqNo)) {
					System.out.println("Matched || " + "Single Movement Entry is saved || " + " Expected Value is : "
							+ ActualEqNo + " || Actual Value is : " + actSaved);

					Extent_pass(driver, "Matched || " + "Single Movement Entry is saved || " + " Expected Value is : "
							+ ActualEqNo + " || ActualValue is : " + actSaved+"\r\n"+"Single Movement Entry is saved", test, test1);
				} else {
					System.out.println("Not matched || " + "Single Movement Entry is not saved || "
							+ " Expected Value is : " + ActualEqNo + " || Actual Value  is : " + actSaved);

					Extent_fail(driver, "Not matched || " + "Single Movement Entry is not saved ||"
							+ " Expected Value is : " + ActualEqNo + " || Actual Value is : " + actSaved+"\r\n"+"Single Movement Entry not saved", test, test1);
				}

			} else {
				System.out.println("Single Equipment Entry page is not displayed");
				Extent_fail(driver, "Single Equipment Entry page is not displayed", test, test1);
			}
			Step_End(9, "Verifiy whether the record is saved", test, test1);
			Extent_completed(testCaseName, test, test1);
			
		waitForElement(driver, close_Tab);
		click(driver, close_Tab);
		}
		
		boolean ts16=true;
		
		if(ts16==true) {
			String testCaseName="TC_Movement_Entry_TS_016";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,
					"Dataset" + selected_dataset, File_Path);

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
			
			Extent_Start(testCaseName, test, test1);
			
//			Module Search
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
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		
		boolean ts17=true;
		if(ts17==true) {
		
			String testCaseName="TC_Movement_Entry_TS_017";
//			Get data from excel sheet

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);

			String releaseRefNoSingleEdit = Excel_data.get("ReleaseRefNum");
			String eqpNoSingleEdit = Excel_data.get("EquipmentNo");

			String sizeTypeSingleEdit = Excel_data.get("SizeType");
			String updateLocSingleEdit = Excel_data.get("UpdateLocation");
			String updateTerm = Excel_data.get("UpdateTerminal");
			String uptadedSinglePopup = Excel_data.get("UpdatedPopup");

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
			
			Extent_Start(testCaseName, test, test1);

			
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

			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
		}
		
		boolean ts18=true;
		if(ts18==true) {

			String testCaseName="TC_Movement_Entry_TS_018";
//			Get data from excel sheet

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,
					"Dataset" + selected_dataset, File_Path);
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
			
			Extent_Start(testCaseName, test, test1);
			
			Step_Start(1, "Enter the module name in the search box and click on the module.", test, test1);

//			Search module
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
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
		}
		
		boolean ts19=true;
		if(ts19==true) {
			
			String testCaseName="TC_Movement_Entry_TS_019";
//			Get data from excel sheet

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);
			String moduleName = Excel_data.get("ModuleMovementEntry");
			String sureToDeletePopup = Excel_data.get("SureToDeletePopup");
			String eqpNo = Excel_data.get("EquipmentNo");
			String deletedSingle = Excel_data.get("DeletedSingle");
			String movementCode = Excel_data.get("MovementCode");

			Extent_Start(testCaseName, test, test1);
			
			Step_Start(1, "Enter the module name in the search box and click on the module.", test, test1);
			
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter the module name in the search box and click on the module.", test, test1);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}

			// Single Equipment Entry
			waitForElement(driver, singleEntryMovPage_L);
			if (isDisplayed(driver, singleEntryMovPage_L)) {
				System.out.println("Single Equipment Entry page is displayed");
				Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
				
				Step_Start(2, "Enter the required container number and click Show History", test, test1);
				waitForElement(driver, equipmentNoSearchField_L);
				sendKeys(driver, equipmentNoSearchField_L, eqpNo);
				
				waitForElement(driver, showHistoryButton_L);
				click(driver, showHistoryButton_L);
				
				Step_End(2, "Enter the required container number and click Show History", test, test1);
				Step_Start(3, "Enter the movement code in the designated column.", test, test1);
				
				waitForElement(driver, eqpNoInEqpDetails_L);
				String actSaved = getText(driver, eqpNoInEqpDetails_L);
				if (actSaved.equals(eqpNo)) {
					System.out.println("Matched || " + "Single Movement Entry is retrieved || " + " Expected Value is : "
							+ eqpNo + " || Actual Value is : " + actSaved);

					Extent_pass(driver, "Matched || " + "Single Movement Entry is retrieved || " + " Expected Value is : "
							+ eqpNo + " || ActualValue is : " + actSaved, test, test1);
				} else {
					System.out.println("Not matched || " + "Single Movement Entry is not retrieved || "
							+ " Expected Value is : " + eqpNo + " || Actual Value  is : " + actSaved);

					Extent_fail(driver, "Not matched || " + "Single Movement Entry is not retrieved ||"
							+ " Expected Value is : " + eqpNo + " || Actual Value is : " + actSaved+"<br>"+"Single Movement Entry is not retrieved", test, test1);
				}

				List<String> movement_Code = splitAndExpand(movementCode);
				
				for(int i=0; i<movement_Code.size();i++) {
				
				String movement_Code_Input=movement_Code.get(i);
				
				waitForElement(driver, movementCode_Grid_Filter);
				click(driver, movementCode_Grid_Filter);
				waitForElement(driver, movementCode_Grid_Filter);
				sendKeys(driver, movementCode_Grid_Filter, movement_Code_Input);
				
				Step_End(3, "Enter the movement code in the designated column.", test, test1);
				Step_Start(4, "Once the move is filtered, right-click and select the Delete option", test, test1);
				
				waitForElement(driver, equipmentDetails_Grid_First_Row);
				RightClick(driver, equipmentDetails_Grid_First_Row);
				
				
				waitForElement(driver, deleteOpionSingle_L);
				click(driver, deleteOpionSingle_L);
				
				Step_End(4, "Once the move is filtered, right-click and select the Delete option", test, test1);
				Step_Start(5, "Click Yes on the system pop-up message to confirm the action", test, test1);
				
				waitForElement(driver, popup_Message);
				String actConfirmDele = getText(driver, popup_Message);

				if (actConfirmDele.equals(sureToDeletePopup)) {
					Extent_pass(driver, "Matched || Expected Popup : "+sureToDeletePopup + " || Actual Popup : "+actConfirmDele, test, test1);
					System.out.println("Matched || Expected Popup : "+sureToDeletePopup + " || Actual Popup : "+actConfirmDele);
					click(driver, popup_Message_Yes_Button);
				}else {
					System.out.println("Not Matched || Expected Popup : "+sureToDeletePopup + " || Actual Popup : "+actConfirmDele);
					Extent_fail(driver, "Not Matched || Expected Popup : "+sureToDeletePopup + " || Actual Popup : "+actConfirmDele, test, test1);
				}
				
				Step_End(5, "Click Yes on the system pop-up message to confirm the action", test, test1);
				Step_Start(6, "A message will appear confirming that the selected container has been deleted", test, test1);

				waitForElement(driver, popup_Message);
				String actPopup = getText(driver, popup_Message);

				if (actPopup.equals(deletedSingle)) {
					Extent_pass(driver, "Matched || Expected Popup : "+deletedSingle + " || Actual Popup : "+actPopup, test, test1);
					System.out.println("Matched || Expected Popup : "+deletedSingle + " || Actual Popup : "+actPopup);
					click(driver, popup_Message_Ok_Button);
				}else {
					System.out.println("Not Matched || Expected Popup : "+deletedSingle + " || Actual Popup : "+actPopup);
					Extent_fail(driver, "Not Matched || Expected Popup : "+deletedSingle + " || Actual Popup : "+actPopup, test, test1);
				}
				Step_End(6, "A message will appear confirming that the selected container has been deleted", test, test1);

				}
				

			} else {
				System.out.println("Single Equipment Entry page is not displayed");
				Extent_fail(driver, "Single Equipment Entry page is not displayed", test, test1);
			}
		    Extent_completed(testCaseName, test, test1);
	    
	    waitForElement(driver, close_Tab);
		click(driver, close_Tab);
		
		}
	
		boolean ts20=true;
		if(ts20==true) {
			String testCaseName="TC_Movement_Entry_TS_020";
//			Get data from excel sheet
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);
			String moduleName = Excel_data.get("ModuleMovementEntry");
			String eqpNoMulti_1 = Excel_data.get("EquipmentNo1");
			String multiDeleted = Excel_data.get("MultipleMovEntryDeleted");
			String movementCode = Excel_data.get("MovementCode");
			String globalSearchFilterOption1 = Excel_data.get("GlobalSearchFilterOption1");
			String dropdownCondition = Excel_data.get("DropdownCondition");

			String globalSearchFilterOption2 = Excel_data.get("globalSearchFilterOption2");
			String globalSearchFilterOption3 = Excel_data.get("globalSearchFilterOption3");
			String searchValue2 = Excel_data.get("searchValue2");
			String searchValue3 = Excel_data.get("searchValue3");
			
			Extent_Start(testCaseName, test, test1);

			Step_Start(1, "Enter the module name in the search box and click on the module", test, test1);
			
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter the module name in the search box and click on the module", test, test1);

			
			// Multiple Equipment Entry
					Step_Start(2, "Select the Multiple Equipment Entry option", test, test1);
					
					waitForElement(driver, multiEntryMovPage_L);
					click(driver, multiEntryMovPage_L);
					
					Step_End(2, "Select the Multiple Equipment Entry option", test, test1);
					
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				System.out.println("Multiple Equipment Entry page is displayed");
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				
				waitForElement(driver, activitySearchField_L);
		
					Step_Start(3, "Click on the Global Search icon in the toolbar.", test, test1);
					
					waitForElement(driver, globalSearch_L);
					click(driver, globalSearch_L);
					
					Step_End(3, "Click on the Global Search icon in the toolbar.", test, test1);
					Step_Start(4, "Enter the required container number in the appropriate field", test, test1);
					Step_Start(5, "Click the Search button to view the results, then select the required container", test, test1);

					globalValueSearchWindow(driver, dropdownCondition, globalSearchFilterOption1, eqpNoMulti_1, globalSearchFilterOption2, searchValue2, globalSearchFilterOption3, searchValue3);

					Step_End(4, "Enter the required container number in the appropriate field", test, test1);
					Step_End(5, "Click the Search button to view the results, then select the required container", test, test1);

				
				List<String> movement_Code = splitAndExpand(movementCode);
				
				for(int i=0; i<movement_Code.size();i++) {
				
				String movement_Code_Input=movement_Code.get(i);
				
				Step_Start(6, "Enter the movement code in the designated column.", test, test1);

				waitForElement(driver, movementCode_Grid_Filter);
				click(driver, movementCode_Grid_Filter);
				waitForElement(driver, movementCode_Grid_Filter);
				sendKeys(driver, movementCode_Grid_Filter, movement_Code_Input);
				
				Step_End(6, "Enter the movement code in the designated column.", test, test1);
				Step_Start(7, "Right-click on the required container and select the Delete option.", test, test1);
				
				waitForElement(driver, equipmentDetails_Grid_First_Row);
				RightClick(driver, equipmentDetails_Grid_First_Row);
				
				waitForElement(driver, multiDeleteOption_L);
				click(driver, multiDeleteOption_L);
				
				Step_End(7, "Right-click on the required container and select the Delete option.", test, test1);
				Step_Start(8, "A confirmation message will appear indicating that the selected container has been deleted", test, test1);
				
				waitForElement(driver, popup_Message);

				if (isDisplayed(driver, popup_Message)) {
					String actConfirm = getText(driver, popup_Message);
					Extent_pass(driver, actConfirm + "popup is displayed", test, test1);
					click(driver, popup_Message_Yes_Button);
				}
				waitForElement(driver, popup_Message);

					String actText1 = getText(driver, popup_Message);
					if (actText1.equals(multiDeleted)) {
						Extent_pass(driver, "Matched || Expected Popup : "+multiDeleted + " || Actual Popup : "+actText1, test, test1);
						System.out.println("Matched || Expected Popup : "+multiDeleted + " || Actual Popup : "+actText1);
						click(driver, popup_Message_Ok_Button);
					}else {
						System.out.println("Not Matched || Expected Popup : "+multiDeleted + " || Actual Popup : "+actText1);
						Extent_fail(driver, "Not Matched || Expected Popup : "+multiDeleted + " || Actual Popup : "+actText1, test, test1);
					}
					Step_End(8, "A confirmation message will appear indicating that the selected container has been deleted", test, test1);

				}
				

			} else {
				System.out.println("Multiple Equipment Entry page is not displayed");
				Extent_fail(driver, "Multiple Equipment Entry page is not displayed", test, test1);
			}

			Extent_completed(testCaseName, test, test1);
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
		}
		
		boolean ts21=true;
		if(ts21==true) {
			
			String testCaseName="TC_Movement_Entry_TS_021";
//			Get data from excel sheet
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);

			String moduleName = Excel_data.get("ModuleMovementEntry");
			String retrieveEqpNo = Excel_data.get("RetrieveEqpNo");
			String globalSearchFilterOption1 = Excel_data.get("GlobalSearchFilterOption1");
			String dropdownCondition = Excel_data.get("DropdownCondition");
			String globalSearchFilterOption2 = Excel_data.get("globalSearchFilterOption2");
			String globalSearchFilterOption3 = Excel_data.get("globalSearchFilterOption3");
			String searchValue2 = Excel_data.get("searchValue2");
			String searchValue3 = Excel_data.get("searchValue3");
			
			Extent_Start(testCaseName, test, test1);

//			Module Search
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

			Step_Start(1, "Select Multiple Equipment Entry option", test, test1);
			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);

			if (isDisplayed(driver, multiEntryMovPage_L)) {
				System.out.println("Multiple Equipment Entry page is displayed");
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				
				Step_End(1, "Select Multiple Equipment Entry option", test, test1);
				Step_Start(2, "Click on global search icon option from toolbar", test, test1);
				
				waitForElement(driver, globalSearch_L);
				click(driver, globalSearch_L);

				Step_End(2, "Click on global search icon option from toolbar", test, test1);
				Step_Start(3, "Enter required container no on required field", test, test1);
			
				globalValueSearchWindow(driver, dropdownCondition, globalSearchFilterOption1, retrieveEqpNo, globalSearchFilterOption2, searchValue2, globalSearchFilterOption3, searchValue3);

				waitForElement(driver, eqpNoInEqpDetails_L);
				String actualRetNo2 = getText(driver, eqpNoInEqpDetails_L);
				System.out.println("Actual Eqp No:" + actualRetNo2);
				System.out.println("Expected Eqp No:" + retrieveEqpNo);

				if (actualRetNo2.equals(retrieveEqpNo)) {
					System.out.println("Matched || " + " Expected Value is : " + retrieveEqpNo + " || Actual Value is : "
							+ actualRetNo2);

					Extent_pass(driver, "Matched || " + " Expected Value is : " + retrieveEqpNo + " || ActualValue is : "
							+ actualRetNo2+"<br>"+"Multiple Movement Entry retrieved", test, test1);
				} else {
					System.out.println("Not matched || " + " Expected Value is : " + retrieveEqpNo
							+ " || Actual Value  is : " + actualRetNo2);

					Extent_fail(driver, "Not matched || " + " Expected Value is : " + retrieveEqpNo
							+ " || Actual Value is : " + actualRetNo2+"<br>"+"Multiple Movement Entry not retrieved", test, test1);
				}

			} else {
				System.out.println("Multiple Equipment Entry page is not displayed");
				Extent_fail(driver, "Multiple Equipment Entry page is not displayed", test, test1);
			}
			
			Step_End(4, "click search & select the required container to retrieve", test, test1);
			Extent_completed(testCaseName, test, test1);
		}
	}

}
