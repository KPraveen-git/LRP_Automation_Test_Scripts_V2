package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS065 extends Keywords {

	public void SOCNotAllowedForONHI(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS065";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_065 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_065, testCaseName, "Dataset"+selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String activityONHI = data.get("ActivityONHI");
		String sOCNotAllowedError = data.get("SOCNotAllowedError");
		String location65 = data.get("Location");
		String terminal65 = data.get("Terminal");
		String equipmentNum65 = data.get("EquipmentNum");
		String releaseReferenceNumber65 = data.get("ReleaseReferenceNumber");
		String activityDateSingle65 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		String sizeType65 = data.get("SizeType");
		String shipperOwned = data.get("ShipperOwned");


		String isoSingle = data.get("ISO");
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

		navigateUrl(driver, URL);

		Extent_Start(testCaseName, test, test1);

		// Login

		LRP_Login(driver, username, password);

		//// To validate SOC not allowed for ONHI
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);


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

		Step_End(1, "Enter module name in searchbox & click the module", test, test1);
		Step_Start(2, "try to save ONHI move by giving 'Y' in SOC field", test, test1);
		// Multiple Equipment Entry

		waitForElement(driver, multiEntryMovPage_L);
		click(driver, multiEntryMovPage_L);
		waitForElement(driver, multiEntryMovPage_L);
		if (isDisplayed(driver, multiEntryMovPage_L)) {
			System.out.println("Multiple Equipment Entry page is displayed");
			Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
			waitForElement(driver, activitySearchField_L);
			sendKeys(driver, activitySearchField_L, activityONHI);
			waitForElement(driver, autoCompleteValue);
			enter(driver);

			if (!activityDateSingle65.equals("")) {
				waitForElement(driver, activeDateField_L);
				if(datePicker.equalsIgnoreCase("Yes")) {
					if (isDisplayed(driver, Calender)) {
						selectDatePicker(driver, activeDateField_L, activityDateSingle65);
					}}else {
						if(activityDateSingle65.contains("-")) {
							String activityDateSingle65_1=activityDateSingle65.replace("-", "/");
							clearAndType(driver, activeDateField_L, activityDateSingle65_1);

						}else {
							clearAndType(driver, activeDateField_L, activityDateSingle65);

						}		
					}
			}

			if (!activityTime_Input1.equals("")) {
				click(driver, activityTimeMultiple);

				waitForElement(driver, Calender);
				if (isDisplayed(driver, Calender)) {
					click(driver, activityTime_Input);

					clearAndType(driver, activityTime_Input, activityTime_Input1);
					System.out.println("activity_Time" + activityTime_Input1);

				}
				click(driver, activityTime_Close);
			} 
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

			waitForElement(driver, locationSaerchField_L);
			click(driver, locationSaerchField_L);
			Actionsendkeys(driver, locationSaerchField_L, location65);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);

			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			Actionsendkeys(driver, termDepotSearchField_L, terminal65);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);

			waitForElement(driver, relRefNoTextField_L);			
			clearAndType(driver, relRefNoTextField_L, releaseReferenceNumber65);

			waitForElement(driver, sizeTypeDropDown_L);
			click(driver, sizeTypeDropDown_L);
			String selectSizeType=String.format(sizeType_Option, sizeType65);
			waitForElement(driver, selectSizeType);
			click(driver, selectSizeType);

			click(driver, shipper_Owned_Dropdown);
			String select_ShipperOwned =String.format(shipper_Owned, shipperOwned);

			waitForElement(driver, select_ShipperOwned);
			click(driver, select_ShipperOwned);



			if (!isoSingle.equals("")) {
				waitForElement(driver, isoDropdown); 
				click(driver, isoDropdown);
				waitForElement(driver, isoDropdown_Input); 
				clearAndType(driver, isoDropdown_Input, isoSingle);
				enter(driver);
			}

			if (!leaseKindSingle.equals("")) {
				waitForElement(driver, leaseKind_Dropdown); 
				click(driver, leaseKind_Dropdown);
				String select_LeaseKind=String.format(lease_Kind, leaseKindSingle);

				waitForElement(driver, select_LeaseKind);
				click(driver, select_LeaseKind);

			}

			if (!lessorSingle.equals("")) {
				waitForElement(driver, lessor_Searchfield); 
				click(driver, lessor_Searchfield);
				waitForElement(driver, lessor_Searchfield); 
				clearAndType(driver, lessor_Searchfield, lessorSingle);
				enter(driver);
			} 

			if (!lesseeSingle.equals("")) {
				waitForElement(driver, lessee_Searchfield); 
				click(driver, lessee_Searchfield);
				waitForElement(driver, lessee_Searchfield); 
				clearAndType(driver, lessee_Searchfield, lesseeSingle);
				enter(driver);
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

				click(driver, Manufacture_Date);

				if(datePicker.equalsIgnoreCase("Yes")) {
					if (isDisplayed(driver, Calender)) {
						selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);
					}
				}else {
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

				String select_Ton = String.format(thirty_Ton, thirtyTonSingle);

				waitForElement(driver, select_Ton);
				click(driver, select_Ton);
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

			waitForElement(driver, addButtonMulti_L);
			click(driver, addButtonMulti_L);

			waitForElement(driver, selectGridCell_1_L);
			click(driver, selectGridCell_1_L);
			waitForElement(driver, searchEqpNoInGrid_1_L);
			sendKeys(driver, searchEqpNoInGrid_1_L, equipmentNum65);


			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);


		}

		waitForElement(driver, errorRecordsFrame_L);
		if (isDisplayed(driver, errorRecordsFrame_L)) {
			if (isDisplayed(driver, errorRecApply_L)) {
				System.out.println("Error Record popup is displayed");
				Extent_pass(driver, "Error Record popup is displayed", test, test1);
				click(driver, errorRecApply_L);

			} else if (isDisplayed(driver, okButtonErrorFrame_L)) {
				System.out.println("Error Record popup is not displayed");
				click(driver, okButtonErrorFrame_L);
				Extent_fail(driver, "Error Record popup is not displayed", test, test1);
			}
		}

		scrollTop(driver);
		waitForElement(driver, saveButtonMoveEnt_L);
		click(driver, saveButtonMoveEnt_L);

		Step_End(2, "try to save ONHI move by giving 'Y' in SOC field", test, test1);
		Step_Start(3, "Ensure that system should validate as 'SOC IS NOT ALLOWED FOR ONHIRE'.", test, test1);
		waitForElement(driver, errorRecordsFrame_L);

		if (isDisplayed(driver, errorRecordsFrame_L)) {
			waitForElement(driver, soc_Not_Allowed_Error2);
			String actualSOCNotAllowedError = getText(driver, soc_Not_Allowed_Error2);

			if (actualSOCNotAllowedError.equals(sOCNotAllowedError)) {
				System.out.println("Matched || " +sOCNotAllowedError + " Error is displayed ||"+ " Expected Value is : " + sOCNotAllowedError
						+ " || Actual Value is : " + actualSOCNotAllowedError);
				Extent_pass(driver, "Matched || "+sOCNotAllowedError + " Error is displayed ||" + " Expected Value is : " + sOCNotAllowedError
						+ " || ActualValue is : " + actualSOCNotAllowedError, test, test1);
				click(driver, okButtonErrorFrame_L);
			} else {
				System.out.println("Not matched || "+sOCNotAllowedError + " Error is not displayed ||" + " Expected Value is : " + sOCNotAllowedError
						+ " || Actual Value  is : " + actualSOCNotAllowedError);
				Extent_fail(driver, "Not matched || "+sOCNotAllowedError + " Error is not displayed ||" + " Expected Value is : " + sOCNotAllowedError
						+ " || Actual Value is : " + actualSOCNotAllowedError, test, test1);
			}
		}
		Step_End(3, "Ensure that system should validate as 'SOC IS NOT ALLOWED FOR ONHIRE'.", test, test1);
		Extent_completed(testCaseName, test, test1);
	}

}
