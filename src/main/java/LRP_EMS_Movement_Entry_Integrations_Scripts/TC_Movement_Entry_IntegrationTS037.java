package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS037 extends Keywords {
	
	//// To validate if user try to save move with incorrect location which is not defined in supplier contract

	public void toSaveMoveWithTncorrectLocation(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS037";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_037 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_037, testCaseName,
				"Dataset" + selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String activitySearch37 = data.get("Activity");
		String eqpNumber = data.get("EquipmentNo1");
		String locationForInvalid = data.get("LocationForInvalid");
		String terminalForInvalid = data.get("TerminalForInvalid");
		String referenceNoInvalid = data.get("ReferenceNoForInvalid");
		String invalidPortCodeError = data.get("InvalidPortCodeError");
		String invalidSizeTypeError = data.get("InvalidSize/TypeError");
		
		String activityDateSingle37 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		String sizeType37 = data.get("SizeType");
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

		String condition=data.get("Condition");
		String lesseeSearch_Filter=data.get("LesseeSearch_Filter");
		String lessorSearch_Filter=data.get("LessorSearch_Filter");
		String BL_Search_Filter=data.get("BL_Search_Filter");
		
		navigateUrl(driver, URL);

		Extent_Start(testCaseName, test, test1);

		// Login

		LRP_Login(driver, username, password);

		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//		Module Search
		moduleNavigate(driver, moduleName);
		
		Step_End(1, "Enter module name in searchbox & click the module", test, test1);

		// Movement Entry
		waitForElement(driver, movementEntryPage_L);
		if (isDisplayed(driver, movementEntryPage_L)) {
			System.out.println("Movement Entry Page is displayed");
			Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
		} else {
			System.out.println("Movement Entry Page is not displayed");
			Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
		}

		
		Step_Start(2,"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",test, test1);
		
		Extent_call(test, test1, "giving valid container number");
		waitForElement(driver, equipmentNoSearchField_L);
		clearAndType(driver, equipmentNoSearchField_L, eqpNumber);
		waitForElement(driver, activitySearchFieldInSingle_L);
		sendKeys(driver, activitySearchFieldInSingle_L, activitySearch37);
		waitForElement(driver, autoCompleteValue);
		enter(driver);
		
		if (!activityDateSingle37.equals("")) {
			waitForElement(driver, activeDateInSingle_L);

			if (datePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, activeDateInSingle_L, activityDateSingle37);

			} else {
				click(driver, activeDateInSingle_L);

				if (activityDateSingle37.contains("-")) {
					String activityDateSingle37_1 = activityDateSingle37.replace("-", "/");
					clearAndType(driver, activeDateInSingle_L, activityDateSingle37_1);

				} else {
					clearAndType(driver, activeDateInSingle_L, activityDateSingle37);

				}
			}
		}
		Extent_call(test, test1, "Entering the time data");
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
		Step_End(2,
				"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",
				test, test1);
		waitForElement(driver, popup_Message);
		String wantToApplyPopup = getText(driver, popup_Message);
		if (isDisplayed(driver, popup_Message)) {
			System.out.println("Matched || "+wantToApplyPopup + " popup is displayed");
			Extent_pass(driver, "Matched || "+wantToApplyPopup + " popup is displayed", test, test1);
			click(driver, popup_Message_Yes_Button);
			Extent_call(test, test1, "Verify the input field display");
			waitForElement(driver, showInputFieldFrame_L);

			if (isDisplayed(driver, showInputFieldFrame_L)) {
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
				System.out.println("Show input field frame is displayed");
				
			} else {
				System.out.println("Show input field frame is not displayed");	
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);
			}
		} else {
			System.out.println("Not Matched || "+wantToApplyPopup + " popup is not displayed");
			Extent_fail(driver, "Not Matched || "+wantToApplyPopup + " popup is not displayed", test, test1);
		}

		Step_Start(3,
				"Ensure that system should validate if user provide incorrect location & terminal which is not mapped in given reference",
				test, test1);
		waitForElement(driver, locationSaerchField_L);
		click(driver, locationSaerchField_L);
		waitForElement(driver, locationSaerchField_L);
		clear(driver, locationSaerchField_L);
		waitForElement(driver, locationSaerchField_L);
		sendKeys(driver, locationSaerchField_L, locationForInvalid);
		waitForElement(driver, autoCompleteValue);
		enter(driver);

		Extent_call(test, test1, "Sending invalid terminal data");
		waitForElement(driver, termDepotSearchField_L);
		click(driver, termDepotSearchField_L);
		waitForElement(driver, termDepotSearchField_L);
		clear(driver, termDepotSearchField_L);
		waitForElement(driver, termDepotSearchField_L);
		sendKeys(driver, termDepotSearchField_L, terminalForInvalid);
		waitForElement(driver, autoCompleteValue);
		enter(driver);

		Step_End(3,
				"Ensure that system should validate if user provide incorrect location & terminal which is not mapped in given reference",
				test, test1);
		Extent_call(test, test1, "Sending invalid reference data");
		
		waitForElement(driver, relRefNoTextField_L);
		click(driver, relRefNoTextField_L);
		waitForElement(driver, relRefNoTextField_L);
		sendKeys(driver, relRefNoTextField_L, referenceNoInvalid);
		
		waitForElement(driver, sizeTypeDropDown_L);
		click(driver, sizeTypeDropDown_L);
		String selectSizeType=String.format(sizeType_Option, sizeType37);
		waitForElement(driver, selectSizeType);
		click(driver, selectSizeType);
	
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
					String manufactureDateSingle_1 = manufactureDateSingle.replace("-", "/");
					waitForElement(driver, Manufacture_Date);
					clearAndType(driver, Manufacture_Date, manufactureDateSingle_1);

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
		
		scrollTop(driver);
		waitForElement(driver, saveButtonMoveEnt_L);
		click(driver, saveButtonMoveEnt_L);

		Step_Start(4,
				"Ensure that system should validate as 'Invalid PortCode for this Reference No and Invalid size type for this Reference No",
				test, test1);
		waitForElement(driver, errorRecordsFrame_L);
		if (isDisplayed(driver, errorRecordsFrame_L)) {

			String actualPortCodeError = getText(driver, error_Description_1);
			String actualSizeTypeError = getText(driver, error_Description_2);

			if (actualPortCodeError.equalsIgnoreCase(invalidPortCodeError)) {
				System.out.println("Matched || "+invalidPortCodeError + " Error is displayed ||" + " Expected Value is : " + invalidPortCodeError
						+ " || Actual Value is : " + actualPortCodeError);
				Extent_pass(driver, "Matched || "+invalidPortCodeError + " Error is displayed ||" + " Expected Value is : " + invalidPortCodeError
						+ " || ActualValue is : " + actualPortCodeError, test, test1);
			} else {
				System.out.println("Not matched || "+invalidPortCodeError + " Error is not displayed ||" + " Expected Value is : " + invalidPortCodeError
						+ " || Actual Value  is : " + actualPortCodeError);
				Extent_fail(driver, "Not matched || "+invalidPortCodeError + " Error is not displayed ||" + " Expected Value is : " + invalidPortCodeError
						+ " || Actual Value is : " + actualPortCodeError, test, test1);
			}
			Extent_call(test, test1, "verifying Invalid size/type for this Reference No'.");
			if (actualSizeTypeError.equalsIgnoreCase(invalidSizeTypeError)) {
				System.out.println("Matched || "+invalidSizeTypeError + " Error is displayed ||" + " Expected Value is : " + invalidSizeTypeError
						+ " || Actual Value is : " + actualSizeTypeError);
				Extent_pass(driver, "Matched || "+invalidSizeTypeError + " Error is displayed ||" + " Expected Value is : " + invalidSizeTypeError
						+ " || ActualValue is : " + actualSizeTypeError, test, test1);
			} else {
				System.out.println("Not matched || "+invalidSizeTypeError + " Error is not displayed ||" + " Expected Value is : " + invalidSizeTypeError
						+ " || Actual Value  is : " + actualSizeTypeError);
				Extent_fail(driver, "Not matched || "+invalidSizeTypeError + " Error is not displayed ||" + " Expected Value is : " + invalidSizeTypeError
						+ " || Actual Value is : " + actualSizeTypeError, test, test1);
			}
			click(driver, okButtonErrorFrame_L);

		}
		Step_End(4,
				"Ensure that system should validate as 'Invalid PortCode for this Reference No and Invalid size type for this Reference No",
				test, test1);

		Extent_completed(testCaseName, test, test1);

	}
}
