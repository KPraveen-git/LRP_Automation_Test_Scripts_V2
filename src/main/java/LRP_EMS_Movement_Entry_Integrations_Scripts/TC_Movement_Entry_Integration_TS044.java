package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS044 extends Keywords {

	public void Movement_Entry_Integration_TS044(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testcase_Name = "TC_Movement_Entry_Integration_TS044";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data44 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
		
		String username = data44.get("Username");
		String password = data44.get("Password");
		String moduleName = data44.get("ModuleMovementEntry");
		String location44 = data44.get("Location");
		String terminal44 = data44.get("Terminal");
		String activitySNTS44 = data44.get("ActivitySNTS");
		String bookingNumber = data44.get("BookingNumber");
		String invalidPrevLocError = data44.get("InvalidPrevLocPopup");
		String equipmentNumForSNTS = data44.get("EquipmentNumForSNTS");
		String activityDate44=data44.get("ActivityDate");
		
		String datePicker=data44.get("DatePicker");
		String activityTime_Input1=data44.get("ActivityTime");
		String service_Input=data44.get("Service_Input");
		String voyage_Input=data44.get("Voyage_Input");
		String vessel_Input=data44.get("Vessel_Input");
		String bound_Input=data44.get("Bound_Input");
		String supplier_contract=data44.get("SupplierContract");
		String lessor=data44.get("Lessor_Input");
		String lessee=data44.get("Lessee_Input");
		String carrierSeal=data44.get("CarrierSeal");
		String oh=data44.get("OH");
		String ol=data44.get("OL");
		String ow=data44.get("OW");
		String por_Input=data44.get("POR");
		String pol_Input=data44.get("POL");
		String pod_Input=data44.get("POD");
		String dest=data44.get("Dest");
		String grossWeight=data44.get("GrossWeight");
		String owAmount=data44.get("OW_Amount");
		String relRefNo=data44.get("RelRefNo");
		String imo=data44.get("IMO");
		String payLoad=data44.get("PayLoad");
		String tareWeight=data44.get("TareWeight");
		String haulage=data44.get("Haulage");
		String refNumber=data44.get("RefNumber");
		String shipperSeal=data44.get("ShipperSeal");
		String haulier=data44.get("Haulier");
		String remarks_Input=data44.get("Remarks");
		String thirtyTon=data44.get("ThirtyTon");
		String ow_Ind=data44.get("Ow_Ind");
		
		String bookingSearch_Filter=data44.get("BookingSearch_Filter");
		String lesseeSearch_Filter=data44.get("LesseeSearch_Filter");
		String lessorSearch_Filter=data44.get("LessorSearch_Filter");
		String condition=data44.get("Condition");

		navigateUrl(driver, URL);

		Extent_Start(testcase_Name, test, test1);
		// Login

	LRP_Login(driver, username, password);

		//To validate if user try to save SNTS with location not matching with previous move ONHI
		
//		Module Search
		moduleNavigate(driver, moduleName);

		// Movement Entry
		waitForElement(driver, movementEntryPage_L);
		if (isDisplayed(driver, movementEntryPage_L)) {
			Extent_pass(driver, "Movement Entry Page is displayed", test,test1);
		} else {
			System.out.println("Movement Entry Page is displayed");
			Extent_fail(driver, "Movement Entry Page is not displayed", test,test1);
		
		}
		waitForElement(driver, singleEntryMovPage_L);
		if (isDisplayed(driver, singleEntryMovPage_L)) {
			Extent_pass(driver, "Single Equipment Entry page is displayed", test,test1);
		}
		
		Step_Start(1, "Ensure that system should allow user to enter valid container no in movement entry", test, test1);
		waitForElement(driver, equipmentNoSearchField_L);
		clearAndType(driver, equipmentNoSearchField_L, equipmentNumForSNTS);
		waitForElement(driver, activitySearchFieldInSingle_L);
		sendKeys(driver, activitySearchFieldInSingle_L, activitySNTS44);
		waitForElement(driver, autoCompleteValue);
		enter(driver);
		
		
		if (!activityDate44.equals("")) {
			waitForElement(driver, activeDateInSingle_L);
			
			if(datePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, activeDateInSingle_L, activityDate44);
	
					
			}else {
				click(driver, activeDateInSingle_L);

				if(activityDate44.contains("-")) {
					String activityDate44_1=activityDate44.replace("-", "/");
					clearAndType(driver, activeDateInSingle_L, activityDate44_1);
					
				}else {
				clearAndType(driver, activeDateInSingle_L, activityDate44);
				
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
		
		waitForElement(driver, locationSaerchField_L);
		clear(driver, locationSaerchField_L);
		waitForElement(driver, locationSaerchField_L);
		sendKeys(driver, locationSaerchField_L, location44);
		waitForElement(driver, autoCompleteValue);
		enter(driver);
		
		waitForElement(driver, termDepotSearchField_L);
		clear(driver, termDepotSearchField_L);
		waitForElement(driver, termDepotSearchField_L);
		sendKeys(driver, termDepotSearchField_L, terminal44);
		waitForElement(driver, autoCompleteValue);
		enter(driver);
	
		waitForElement(driver, bookingNo_Searchfield);
		sendKeys(driver, bookingNo_Searchfield, bookingNumber);
		waitForElement(driver, bookingSearch_Button);
		click(driver, bookingSearch_Button);
		
		twoColumnSearchWindow(driver, bookingSearch_Filter, condition, bookingNumber);


		if(!service_Input.equals("")) {
		waitForElement(driver, P_Service_Txt_Field);
		click(driver, P_Service_Txt_Field);
		waitForElement(driver, P_Service_Txt_Field);
		clearAndType(driver, P_Service_Txt_Field, service_Input);
		}
		
		if(!vessel_Input.equals("")){
			waitForElement(driver, P_Vessel_Txt_Field);
			click(driver, P_Vessel_Txt_Field);
			waitForElement(driver, P_Vessel_Txt_Field);
			clear(driver, P_Vessel_Txt_Field);
			waitForElement(driver, P_Vessel_Txt_Field);
			sendKeys(driver, P_Vessel_Txt_Field, vessel_Input);
			enter(driver);
		}
		if(!voyage_Input.equals("")){
			waitForElement(driver, P_Voyage_Txt_Field);
			click(driver, P_Voyage_Txt_Field);
			waitForElement(driver, P_Voyage_Txt_Field);
			clear(driver, P_Voyage_Txt_Field);
			waitForElement(driver, P_Voyage_Txt_Field);
			sendKeys(driver, P_Voyage_Txt_Field, voyage_Input);
			enter(driver);
		}
		if(!bound_Input.equals("")) {
			waitForElement(driver, P_Bound_Txt_Field);
			click(driver, P_Bound_Txt_Field);
			waitForElement(driver, P_Bound_Txt_Field);
			clear(driver, P_Bound_Txt_Field);
			enter(driver);
			waitForElement(driver, P_Bound_Txt_Field);
			sendKeys(driver, P_Bound_Txt_Field, bound_Input);
			enter(driver);
		}
		
		if(!supplier_contract.equals("")) {
			waitForElement(driver, Supplier_contract);
			click(driver, Supplier_contract);
			waitForElement(driver, Supplier_contract);
			clear(driver, Supplier_contract);
			
			waitForElement(driver, Supplier_contract);
			sendKeys(driver, Supplier_contract, supplier_contract);
			enter(driver);
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
		if(!carrierSeal.equals("")) {
			waitForElement(driver, carrier_Seal);
			click(driver, carrier_Seal);
			waitForElement(driver, carrier_Seal);
			clear(driver, carrier_Seal);
			
			waitForElement(driver, carrier_Seal);
			sendKeys(driver, carrier_Seal, carrierSeal);
			enter(driver);
		}
		if(!oh.equals("")) {
			waitForElement(driver, oh_SNTS);
			click(driver, oh_SNTS);
			waitForElement(driver, oh_SNTS);
			clear(driver, oh_SNTS);
			
			waitForElement(driver, oh_SNTS);
			sendKeys(driver, oh_SNTS, oh);
			enter(driver);
		}
		
		if(!ol.equals("")) {
			waitForElement(driver, ol_textfield);
			click(driver, ol_textfield);
			waitForElement(driver, ol_textfield);
			clear(driver, ol_textfield);
			
			waitForElement(driver, ol_textfield);
			sendKeys(driver, ol_textfield, ol);
			enter(driver);
		}
		
		
		
		if(!ow.equals("")) {
			waitForElement(driver, ow_textfield);
			click(driver, ow_textfield);
			waitForElement(driver, ow_textfield);
			clear(driver, ow_textfield);
			
			waitForElement(driver, ow_textfield);
			sendKeys(driver, ow_textfield, ow);
			enter(driver);
		}
		

		if(!por_Input.equals("")) {
			waitForElement(driver, por_Searchfield);
			click(driver, por_Searchfield);
			waitForElement(driver, por_Searchfield);
			clear(driver, por_Searchfield);
			
			waitForElement(driver, por_Searchfield);
			sendKeys(driver, por_Searchfield, por_Input);
			enter(driver);
		}
		if(!pol_Input.equals("")) {
			waitForElement(driver, polSearchfield);
			click(driver, polSearchfield);
			waitForElement(driver, polSearchfield);
			clear(driver, polSearchfield);
			
			waitForElement(driver, polSearchfield);
			sendKeys(driver, polSearchfield, pol_Input);
			enter(driver);
		}
		
		if(!pod_Input.equals("")) {
			waitForElement(driver, podSearchfield);
			click(driver, podSearchfield);
			waitForElement(driver, podSearchfield);
			clear(driver, podSearchfield);
			
			waitForElement(driver, podSearchfield);
			sendKeys(driver, podSearchfield, pod_Input);
			enter(driver);
		}
		if(!dest.equals("")) {
			waitForElement(driver, destSearchfield);
			click(driver, destSearchfield);
			waitForElement(driver, destSearchfield);
			clear(driver, destSearchfield);
			
			waitForElement(driver, destSearchfield);
			sendKeys(driver, destSearchfield, dest);
			enter(driver);
		}
		
		if(!grossWeight.equals("")) {
			waitForElement(driver, grossWeight_Textfield);
			click(driver, grossWeight_Textfield);
			waitForElement(driver, grossWeight_Textfield);
			clear(driver, grossWeight_Textfield);
			
			waitForElement(driver, grossWeight_Textfield);
			sendKeys(driver, grossWeight_Textfield, grossWeight);
			enter(driver);
		}
		

		if(!owAmount.equals("")) {
			waitForElement(driver, OW_amount);
			click(driver, OW_amount);
			waitForElement(driver, OW_amount);
			clear(driver, OW_amount);
			
			waitForElement(driver, OW_amount);
			sendKeys(driver, OW_amount, owAmount);
			enter(driver);
		}
		
		if (!ow_Ind.equals("")) {
			waitForElement(driver, ow_Ind_Dropdown);
			click(driver, ow_Ind_Dropdown);
			String select_owInd =  String.format(select_woi,ow_Ind);
			waitForElement(driver, select_owInd);
			click(driver, select_owInd);
		}
		if(!relRefNo.equals("")) {
			waitForElement(driver, relRefNoTextField_L);
			click(driver, relRefNoTextField_L);
			waitForElement(driver, relRefNoTextField_L);
			clear(driver, relRefNoTextField_L);
			
			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, relRefNo);
			enter(driver);
		}
		if(!imo.equals("")) {
			waitForElement(driver, imo_Textfield);
			click(driver, imo_Textfield);
			waitForElement(driver, imo_Textfield);
			clear(driver, imo_Textfield);
			
			waitForElement(driver, imo_Textfield);
			sendKeys(driver, imo_Textfield, imo);
			enter(driver);
		}
		
		if(!payLoad.equals("")) {
			waitForElement(driver, payLoad_Textfield);
			click(driver, payLoad_Textfield);
			waitForElement(driver, payLoad_Textfield);
			clear(driver, payLoad_Textfield);
			
			waitForElement(driver, payLoad_Textfield);
			sendKeys(driver, payLoad_Textfield, payLoad);
			enter(driver);
		}
		if(!tareWeight.equals("")) {
			waitForElement(driver, tare_Textfield);
			click(driver, tare_Textfield);
			waitForElement(driver, tare_Textfield);
			clear(driver, tare_Textfield);
			
			waitForElement(driver, tare_Textfield);
			sendKeys(driver, tare_Textfield, tareWeight);
			enter(driver);
		}
		
		if(!haulage.equals("")) {
			waitForElement(driver, haulageTextfield);
			click(driver, haulageTextfield);
			waitForElement(driver, haulageTextfield);
			clear(driver, haulageTextfield);
			
			waitForElement(driver, haulageTextfield);
			sendKeys(driver, haulageTextfield, haulage);
			enter(driver);
		}
		
		
		if(!refNumber.equals("")) {
			waitForElement(driver, refNumber_Textfield);
			click(driver, refNumber_Textfield);
			waitForElement(driver, refNumber_Textfield);
			clear(driver, refNumber_Textfield);
			
			waitForElement(driver, refNumber_Textfield);
			sendKeys(driver, refNumber_Textfield, refNumber);
			enter(driver);
		}
		if(!shipperSeal.equals("")) {
			waitForElement(driver, shipper_Seal);
			click(driver, shipper_Seal);
			waitForElement(driver, shipper_Seal);
			clear(driver, shipper_Seal);
			
			waitForElement(driver, shipper_Seal);
			sendKeys(driver, shipper_Seal, shipperSeal);
			enter(driver);
		}
		
		if(!haulier.equals("")) {
			waitForElement(driver, haulierTextfield);
			click(driver, haulierTextfield);
			waitForElement(driver, haulierTextfield);
			clear(driver, haulierTextfield);
			
			waitForElement(driver, haulierTextfield);
			sendKeys(driver, haulierTextfield, haulier);
			enter(driver);
		}
		
		if (!thirtyTon.equals("")) {
			waitForElement(driver, thirtyTon_Dropdown);
			click(driver, thirtyTon_Dropdown);
			String select_Don =  String.format(select_do,thirtyTon);
			waitForElement(driver, select_Don);
			click(driver, select_Don);
		}
		
		if(!remarks_Input.equals("")) {
			waitForElement(driver, remarksTextfield);
			click(driver, remarksTextfield);
			waitForElement(driver, remarksTextfield);
			clear(driver, remarksTextfield);
			
			waitForElement(driver, remarksTextfield);
			sendKeys(driver, remarksTextfield, remarks_Input);
			enter(driver);
		}
		scrollTop(driver);
		waitForElement(driver, saveButtonMoveEnt_L);
		click(driver, saveButtonMoveEnt_L);
		
		Step_End(1, "Ensure that system should allow user to enter valid container no in movement entry", test, test1);
		Step_Start(2, "Ensure that system should validate as 'INVALID PREV LOCATIONAL ACTIVITY PLACE OR DEPOT", test, test1);
		waitForElement(driver, errorRecordsFrame_L);
		if (isDisplayed(driver, errorRecordsFrame_L)) {
			
			String actualInvalidPrevLocError=getText(driver, error_Description_1);
							
			if(actualInvalidPrevLocError.equals(invalidPrevLocError)) {
				System.out.println("Matched || " + " Expected Value is : " + invalidPrevLocError + " || Actual Value is : " + actualInvalidPrevLocError);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + invalidPrevLocError + " || ActualValue is : " + actualInvalidPrevLocError,test,test1);
				click(driver, okButtonErrorFrame_L);	
			}else {
				System.out.println("Not matched || " + " Expected Value is : " + invalidPrevLocError + " || Actual Value  is : " + actualInvalidPrevLocError);
				Extent_fail(driver,"Not matched || " + " Expected Value is : " + invalidPrevLocError + " || Actual Value is : " + actualInvalidPrevLocError,test,test1);
			}			
			Step_End(2, "Ensure that system should validate as 'INVALID PREV LOCATIONAL ACTIVITY PLACE OR DEPOT", test, test1);
		}	
		Extent_completed(testcase_Name, test, test1);

	}
}
