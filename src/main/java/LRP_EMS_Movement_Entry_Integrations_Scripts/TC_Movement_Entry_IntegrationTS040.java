package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS040 extends Keywords {

	public void blankInLocationField(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS040";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_040 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_040, testCaseName,
				"Dataset" + selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String eqpNumber40 = data.get("EquipmentNo1");
		String activitySearch40 = data.get("Activity");
		String terminal40 = data.get("Terminal");
		String releaseReferenceNumber40 = data.get("ReleaseReferenceNumber");
		String activityPlacePopup = data.get("ActivityPlacePopup");
		String sizeType40 = data.get("SizeType");
		
		String activityDateSingle40 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");

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

		//// To validate with blank in location field
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
		
		
		Step_Start(2,
				"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",
				test, test1);
		waitForElement(driver, equipmentNoSearchField_L);
		clearAndType(driver, equipmentNoSearchField_L, eqpNumber40);
		waitForElement(driver, activitySearchFieldInSingle_L);
		sendKeys(driver, activitySearchFieldInSingle_L, activitySearch40);
		waitForElement(driver, autoCompleteValue);
		enter(driver);

		if (!activityDateSingle40.equals("")) {
			waitForElement(driver, activeDateInSingle_L);

			if (datePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, activeDateInSingle_L, activityDateSingle40);

			} else {
				click(driver, activeDateInSingle_L);

				if (activityDateSingle40.contains("-")) {
					String activityDateSingle40_1 = activityDateSingle40.replace("-", "/");
					clearAndType(driver, activeDateInSingle_L, activityDateSingle40_1);

				} else {
					clearAndType(driver, activeDateInSingle_L, activityDateSingle40);

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
		
		Step_Start(3, "Ensure that system should validate if user leave blank for location then try save", test, test1);

		waitForElement(driver, termDepotSearchField_L);
		click(driver, termDepotSearchField_L);
		waitForElement(driver, termDepotSearchField_L);
		clear(driver, termDepotSearchField_L);
		waitForElement(driver, termDepotSearchField_L);
		sendKeys(driver, termDepotSearchField_L, terminal40);
		waitForElement(driver, autoCompleteValue);
		enter(driver);

		waitForElement(driver, relRefNoTextField_L);
		click(driver, relRefNoTextField_L);
		waitForElement(driver, relRefNoTextField_L);
		sendKeys(driver, relRefNoTextField_L, releaseReferenceNumber40);

		Step_End(4, " Ensure that system should allow to provide valid release ref", test, test1);

		Step_Start(5,
				"Ensure that system should validate if user provide incorrect size type which is not defined in given release ref",
				test, test1);
		waitForElement(driver, sizeTypeDropDown_L);
		click(driver, sizeTypeDropDown_L);
		String selectSizeType=String.format(sizeType_Option, sizeType40);
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
		
		Step_End(3, "Ensure that system should validate if user leave blank for location then try save", test, test1);
		
		Step_Start(4, "Ensure that system should validate as 'Activity Place must be entered'.", test, test1);
		waitForElement(driver, Popup_Message);
		if (isDisplayed(driver, Popup_Message)) {

			String actualActivityPlacePopup = getText(driver, Popup_Message);

			if (actualActivityPlacePopup.equals(activityPlacePopup)) {
				System.out.println("Matched || "+activityPlacePopup + " popup is displayed ||" + " Expected Value is : " + activityPlacePopup
						+ " || Actual Value is : " + actualActivityPlacePopup);
				Extent_pass(driver, "Matched || "+activityPlacePopup + " popup is displayed ||" + " Expected Value is : " + activityPlacePopup
						+ " || ActualValue is : " + actualActivityPlacePopup, test, test1);
			} else {
				System.out.println("Not matched || "+activityPlacePopup + " popup is not displayed ||" + " Expected Value is : " + activityPlacePopup
						+ " || Actual Value  is : "+activityPlacePopup + " popup is not displayed ||" + actualActivityPlacePopup);
				Extent_fail(driver, "Not matched || " + " Expected Value is : " + activityPlacePopup
						+ " || Actual Value is : " + actualActivityPlacePopup, test, test1);
			}

		}
		Step_End(4, "Ensure that system should validate as 'Activity Place must be entered'.", test, test1);
		Extent_completed(testCaseName, test, test1);

	}
}
