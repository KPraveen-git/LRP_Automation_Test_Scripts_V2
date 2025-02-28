package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS066 extends Keywords {

	public void sizeTypeMandatory(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS066";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_066 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_066, testCaseName, "Dataset"+selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String activityONHI66 = data.get("ActivityONHI");
		String sizeTypeMustPopup = data.get("SizeTypeMustPopup");
		String location66 = data.get("Location");
		String terminal66 = data.get("Terminal");
		String releaseReferenceNumber66 = data.get("ReleaseReferenceNumber");
		String activityDateSingle66 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		String sizeType = data.get("SizeType");
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
		
		navigateUrl(driver, URL);

		Extent_Start(testCaseName, test, test1);

		// Login

		LRP_Login(driver, username, password);
		
		//// To validate size/type mandatory
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

		// Multiple Equipment Entry

		waitForElement(driver, multiEntryMovPage_L);
		click(driver, multiEntryMovPage_L);
		waitForElement(driver, multiEntryMovPage_L);
		if (isDisplayed(driver, multiEntryMovPage_L)) {
			Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
			waitForElement(driver, activitySearchField_L);
			sendKeys(driver, activitySearchField_L, activityONHI66);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);

			if (!activityDateSingle66.equals("")) {
				waitForElement(driver, activeDateField_L);
				if(datePicker.equalsIgnoreCase("Yes")) {
					if (isDisplayed(driver, Calender)) {
						selectDatePicker(driver, activeDateField_L, activityDateSingle66);
						
				}}else {
					if(activityDateSingle66.contains("-")) {
						String activityDateSingle66_1=activityDateSingle66.replace("-", "/");
						clearAndType(driver, activeDateField_L, activityDateSingle66_1);
						
					}else {
					clearAndType(driver, activeDateField_L, activityDateSingle66);
					
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
		}

		waitForElement(driver, showInputFieldFrame_L);
		if (isDisplayed(driver, showInputFieldFrame_L)) {
			System.out.println("Show input field frame is displayed");
			Extent_pass(driver, "Show input field frame is displayed", test, test1);
		} else {
			System.out.println("Show input field frame is not displayed");
			Extent_fail(driver, "Show input field frame is not displayed", test, test1);
		}
Step_Start(2, "Ensure that system should validate if user try to save ONHI move by giving size/type field as blank", test, test1);
Extent_call(test, test1, "Leaving the size/type as blank");	


		waitForElement(driver, locationSaerchField_L);
		sendKeys(driver, locationSaerchField_L, location66);
		waitForDisplay(driver, autoCompleteValue);
		enter(driver);
		
		waitForElement(driver, termDepotSearchField_L);
		click(driver, termDepotSearchField_L);
		sendKeys(driver, termDepotSearchField_L, terminal66);
		waitForDisplay(driver, autoCompleteValue);
		enter(driver);
		
		waitForElement(driver, relRefNoTextField_L);
		sendKeys(driver, relRefNoTextField_L, releaseReferenceNumber66);
		
		if (!sizeType.equals("")) {
		waitForElement(driver, sizeTypeDropDown_L);
		click(driver, sizeTypeDropDown_L);
		String selectSizeType=String.format(sizeType_Option, sizeType);
		waitForElement(driver, selectSizeType);
		click(driver, selectSizeType);
		
		}
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
		
Step_End(2, "Ensure that system should validate if user try to save ONHI move by giving size/type field as blank", test, test1);
		waitForElement(driver, addButtonMulti_L);
		click(driver, addButtonMulti_L);
Step_Start(3, "Ensure that system should validate as 'Size/Type must be selected'.", test, test1);
		waitForElement(driver, Popup_Message);
		if (isDisplayed(driver, Popup_Message)) {

			String actualSizeTypeMustPopup = getText(driver, Popup_Message);

			if (actualSizeTypeMustPopup.equals(sizeTypeMustPopup)) {
				System.out.println("Matched || "+sizeTypeMustPopup + " popup is displayed ||" + " Expected Value is : " + sizeTypeMustPopup
						+ " || Actual Value is : "+sizeTypeMustPopup + " popup is displayed ||" + actualSizeTypeMustPopup);
				Extent_pass(driver, "Matched || " + " Expected Value is : " + sizeTypeMustPopup
						+ " || ActualValue is : " + actualSizeTypeMustPopup, test, test1);
			} else {
				System.out.println("Not matched || " +sizeTypeMustPopup + " popup is not displayed ||"+ " Expected Value is : " + sizeTypeMustPopup
						+ " || Actual Value  is : "+sizeTypeMustPopup + " popup is not displayed ||" + actualSizeTypeMustPopup);
				Extent_fail(driver, "Not matched || " + " Expected Value is : " + sizeTypeMustPopup
						+ " || Actual Value is : " + actualSizeTypeMustPopup, test, test1);
			}

		}
		Step_End(3, "Ensure that system should validate as 'Size/Type must be selected'.", test, test1);
		Extent_completed(testCaseName, test, test1);
	}
}
