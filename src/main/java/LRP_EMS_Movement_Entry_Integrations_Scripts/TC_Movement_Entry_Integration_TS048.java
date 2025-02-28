package LRP_EMS_Movement_Entry_Integrations_Scripts;


import java.util.Map;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS048 extends Keywords {

	public void Movement_Entry_Integration_TS048(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testcase_Name = "TC_Movement_Entry_Integration_TS048";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);


		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String equipmentNum48 = data.get("EquipmentNum");
		String location48 = data.get("Location");
		String terminal48 = data.get("Terminal");
		String releaseReferenceNumber48 = data.get("ReleaseReferenceNumber");
		String activitySearch48 = data.get("Activity");
		String futureActivityDateError = data.get("FutureActivityDateError");
		String activityDateSingle48 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		String sizeType48 = data.get("SizeType");

		String isoSingle = data.get("ISO");
		String shipperOwnedSingle = data.get("ShipperOwned");
		String leaseKindSingle = data.get("LeaseKind");
		String lessorSingle = data.get("Lessor");
		String lesseeSingle = data.get("Lessee");
		String makerSingle = data.get("Maker");
		String materialSingle = data.get("Material");
		String tareSingle = data.get("Tare");
		String payLoadSingle = data.get("PayLoad");
		String grossWeightSingle = data.get("GrossWeight");
		String manufactureDateSingle = data.get("ManufactureDate");
		String supplierContractNoSingle = data.get("SupplierContractNo");

		String refNumberSingle = data.get("RefNumber");
		String thirtyTonSingle = data.get("30Ton");
		String bLNOSingle = data.get("BLNO");
		String remarksSingle = data.get("Remarks");
		
		String lesseeSearch_Filter=data.get("LesseeSearch_Filter");
		String lessorSearch_Filter=data.get("LessorSearch_Filter");
		String condition=data.get("Condition");
		
		navigateUrl(driver, URL);

		Extent_Start(testcase_Name, test, test1);
		// Login

		LRP_Login(driver, username, password);
		
		// To validate if user try to save move in future date

				//Module Search
				moduleNavigate(driver, moduleName);

		// Movement Entry
		waitForElement(driver, movementEntryPage_L);
		if (isDisplayed(driver, movementEntryPage_L)) {

			Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
		} else {
			System.out.println("Movement Entry Page is not displayed");
			Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);

		}
		Step_Start(1, "Enter all mandatory field & click save by giving activity date in future for any move", test, test1);
		// Single Entry Equipment
		waitForElement(driver, singleEntryMovPage_L);
		if (isDisplayed(driver, singleEntryMovPage_L)) {
			Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
			waitForElement(driver, equipmentNoSearchField_L);
			sendKeys(driver, equipmentNoSearchField_L, equipmentNum48);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySearch48);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			waitForElement(driver, activeDateInSingle_L);
			click(driver, activeDateInSingle_L);

			Extent_call(test, test1, "Entering the Date & Time period");
			if (!activityDateSingle48.equals("")) {
				waitForElement(driver, activeDateInSingle_L);


				if(datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle48);


					}else {
						click(driver, activeDateInSingle_L);

						if(activityDateSingle48.contains("-")) {
							String activityDateSingle48_1=activityDateSingle48.replace("-", "/");

							clearAndType(driver, activeDateInSingle_L, activityDateSingle48_1);

						}else {
							clearAndType(driver, activeDateInSingle_L, activityDateSingle48);

						}		
					}
			}

			if (!activityTime_Input1.equals("")) {

				click(driver, activityTime);


				if (isDisplayed(driver, Calender)) {
					click(driver, activityTime_Input);

					clearAndType(driver, activityTime_Input, activityTime_Input1);
					System.out.println("activity_Time" + activityTime_Input1);

				}

				click(driver, activityTime_Close);
			} 
			waitForElement(driver, showInputSin_L);
			click(driver, showInputSin_L);

			waitForElement(driver, popup_Message);
			String wantToApplyPopup7 = getText(driver, popup_Message);
			if (isDisplayed(driver, popup_Message)) {
				Extent_pass(driver, wantToApplyPopup7 + " popup is displayed", test, test1);
				System.out.println(wantToApplyPopup7 + " popup is displayed");
				click(driver, popup_Message_Yes_Button);
				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
					System.out.println("Show input field frame is displayed");
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);


				}
			} else {
				System.out.println(wantToApplyPopup7 + " popup is not displayed");
				Extent_fail(driver, wantToApplyPopup7 + " popup is not displayed", test, test1);


			}

			waitForElement(driver, showInputFieldFrame_L);
			if (isDisplayed(driver, showInputFieldFrame_L)) {
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
			} else {
				System.out.println( "Show input field frame is not displayed");
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);

			}
			waitForElement(driver, locationSaerchField_L);
			click(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			clear(driver, locationSaerchField_L);

			waitForElement(driver, locationSaerchField_L);
			sendKeys(driver, locationSaerchField_L, location48);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			waitForElement(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			clear(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			sendKeys(driver, termDepotSearchField_L, terminal48);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			///// Non mandatory fields

			waitForElement(driver, relRefNoTextField_L);
			click(driver, relRefNoTextField_L);
			waitForElement(driver, relRefNoTextField_L);
			clearAndType(driver, relRefNoTextField_L, releaseReferenceNumber48);


			waitForElement(driver, sizeTypeDropDown_L);
			click(driver, sizeTypeDropDown_L);
			waitForElement(driver, sizeType_Searchfield);
			click(driver, sizeType_Searchfield);
			waitForElement(driver, sizeType_Searchfield);
			sendKeys(driver, sizeType_Searchfield, sizeType48);
			enter(driver);


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
				String select_ShipperOwned =  String.format(select_shipper,shipperOwnedSingle);

				waitForElement(driver, select_ShipperOwned);
				click(driver, select_ShipperOwned);

			} 

			if (!leaseKindSingle.equals("")) {
				waitForElement(driver, leaseKind_Dropdown); 
				click(driver, leaseKind_Dropdown);
				String select_LeaseKind =  String.format(lease_king,leaseKindSingle);
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

				if(datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);

				}else {
					click(driver, Manufacture_Date);

					if(manufactureDateSingle.contains("-")) {
						String manufactureDateSingle_1=manufactureDateSingle.replace("-", "/");
						waitForElement(driver, Manufacture_Date);
						clearAndType(driver, Manufacture_Date, manufactureDateSingle_1);

					}else {
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
				String select_Don = String.format(select_do, thirtyTonSingle);
				waitForElement(driver, select_Don);
				click(driver, select_Don);
			} 

			if (!bLNOSingle.equals("")) {
				waitForElement(driver, blno);
				click(driver, blno);
				waitForElement(driver, blno); 
				clearAndType(driver, blno, bLNOSingle);
				enter(driver);
			} 

			if (!remarksSingle.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				clearAndType(driver, remarks_Textfield, remarksSingle);
				enter(driver);
			} 

			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);
		}


		Step_End(1, "Enter all mandatory field & click save by giving activity date in future for any move", test, test1);
		Step_Start(2, "Ensure that system should validate as 'Activity Date cannot be in future date'.", test, test1);	
		waitForElement(driver, errorRecordsFrame_L);
			String actualFutureDateError = getText(driver, futureDate_Error);

			if (actualFutureDateError.equals(futureActivityDateError)) {
				System.out.println("Matched || " + " Expected Value is : " + futureActivityDateError
						+ " || Actual Value is : " + actualFutureDateError);
				Extent_pass(driver, "Matched || " + " Expected Value is : " + futureActivityDateError
						+ " || ActualValue is : " + actualFutureDateError, test, test1);
				Extent_pass(driver, futureActivityDateError + " Error is displayed", test, test1);
				System.out.println(futureActivityDateError + " Error is displayed");
				click(driver, okButtonErrorFrame_L);
			} else {
				System.out.println("Not matched || " + " Expected Value is : " + futureActivityDateError
						+ " || Actual Value  is : " + actualFutureDateError);
				Extent_fail(driver, "Not matched || " + " Expected Value is : " + futureActivityDateError
						+ " || Actual Value is : " + actualFutureDateError, test, test1);
				Extent_fail(driver, futureActivityDateError + " Error is not displayed", test, test1);

				System.out.println(futureActivityDateError + " Error is not displayed");
			}
			Step_End(2, "Ensure that system should validate as 'Activity Date cannot be in future date'.", test, test1);
			Extent_completed(testcase_Name, test, test1);
		
	}
}
