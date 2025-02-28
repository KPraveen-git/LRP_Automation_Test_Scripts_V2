package LRP_EMS_Movement_Entry_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_TS_015 extends Keywords {

	//	To Create Moves via Single Entry in movement entry

	public void createMovesviaSingleEntry(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {
		//		Get data from excel sheet

		String testCaseName="TC_Movement_Entry_TS_015";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);
		
		String username = Excel_data.get("Username");
		String password = Excel_data.get("Password");
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
	}

}
