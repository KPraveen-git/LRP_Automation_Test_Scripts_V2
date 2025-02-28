package LRP_EMS_Movement_Entry_Integrations_Scripts;


import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS041 extends Keywords {
	//// To validate if user try to save move by given blank in Booking field for SNTS move

	public void blankInBookingField(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS041";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testCaseName, "Dataset"+selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String location41 = data.get("Location");
		String terminal41 = data.get("Terminal");
		String bookingNumberMustPopup = data.get("BookingNumberMustPopup");
		String activitySNTS = data.get("ActivitySNTS");
		String activityDate = data.get("ActivityDate");
		String datePicker = data.get("DatePicker");
		String activityTime_Input1 = data.get("ActivityTime");
		
		
		String service_Input=data.get("Service_Input");
		String voyage_Input=data.get("Voyage_Input");
		String vessel_Input=data.get("Vessel_Input");
		String bound_Input=data.get("Bound_Input");
		String supplier_contract=data.get("SupplierContract");
		String lessor=data.get("Lessor_Input");
		String lessee=data.get("Lessee_Input");
		String carrierSeal=data.get("CarrierSeal");
		String oh=data.get("OH");
		String ol=data.get("OL");
		String ow=data.get("OW");
		String por_Input=data.get("POR");
		String pol_Input=data.get("POL");
		String pod_Input=data.get("POD");
		String dest=data.get("Dest");
		String grossWeight=data.get("GrossWeight");
		String owAmount=data.get("OW_Amount");
		String relRefNo=data.get("RelRefNo");
		String imo=data.get("IMO");
		String payLoad=data.get("PayLoad");
		String tareWeight=data.get("TareWeight");
		String haulage=data.get("Haulage");
		String refNumber=data.get("RefNumber");
		String shipperSeal=data.get("ShipperSeal");
		String haulier=data.get("Haulier");
		String remarks_Input=data.get("Remarks");
		String thirtyTon=data.get("ThirtyTon");
		String ow_Ind=data.get("Ow_Ind");
		
		String condition=data.get("Condition");
		String lesseeSearch_Filter=data.get("LesseeSearch_Filter");
		String lessorSearch_Filter=data.get("LessorSearch_Filter");
		
		navigateUrl(driver, URL);


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

		// Multiple Equipment Entry
Step_Start(1, " Ensure system should allow user to show input details in grid ", test, test1);

		waitForElement(driver, multiEntryMovPage_L);
		click(driver, multiEntryMovPage_L);
		waitForElement(driver, multiEntryMovPage_L);
		if (isDisplayed(driver, multiEntryMovPage_L)) {
			Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
			waitForElement(driver, activitySearchField_L);
			sendKeys(driver, activitySearchField_L, activitySNTS);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			if(!activityDate.equals("")) {
			waitForElement(driver, activeDateField_L);
			
			if(datePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, activeDateField_L, activityDate);
	
			}else {
				click(driver, activeDateField_L);

				if(activityDate.contains("-")) {
					String activityDate_1=activityDate.replace("-", "/");
					clearAndType(driver, activeDateField_L, activityDate_1);
					
				}else {
				clearAndType(driver, activeDateField_L, activityDate);
				
				}		
			}
			}
		

			if (!activityTime_Input1.equals("")) {
				
				click(driver, activityTimeMultiple);

				
				if (isDisplayed(driver, Calender)) {
					click(driver, activityTime_Input);
					
						clearAndType(driver, activityTime_Input, activityTime_Input1);
						System.out.println("activity_Time" + activityTime_Input1);
					
				}
				
				click(driver, activityTime_Close);
			}

			waitForElement(driver, showInputButton);
			click(driver, showInputButton);

			Step_End(1, " Ensure system should allow user to show input details in grid ", test, test1);
			Step_Start(2, "Ensure that system should allow to enter valid location & terminal for SNTS move", test, test1);
			waitForElement(driver, showInputFieldFrame_L);
			if (isDisplayed(driver, showInputFieldFrame_L)) {
				System.out.println("Show input field frame is displayed");
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
			
				waitForElement(driver, locationSaerchField_L);
				clear(driver, locationSaerchField_L);
				waitForElement(driver, locationSaerchField_L);
				sendKeys(driver, locationSaerchField_L, location41);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				waitForElement(driver, termDepotSearchField_L);
				clear(driver, termDepotSearchField_L);
				waitForElement(driver, termDepotSearchField_L);
				sendKeys(driver, termDepotSearchField_L, terminal41);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
		
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
					
					String select_owInd=String.format(owInd, ow_Ind);
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

					String select_Ton = String.format(thirty_Ton, thirtyTon);

					waitForElement(driver, select_Ton);
					click(driver, select_Ton);
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

			waitForElement(driver, addButtonMulti_L);
			click(driver, addButtonMulti_L);
		} else {
			System.out.println("Show input field frame is not displayed");
			Extent_fail(driver, "Show input field frame is not displayed", test, test1);
		}
			Step_End(2, "Ensure that system should allow to enter valid location & terminal for SNTS move", test, test1);
			Step_Start(3, " Ensure that system should validate as 'Booking Number must be entered'", test, test1);

		waitForElement(driver, Popup_Message);

			String actualBookingMustPopup = getText(driver, Popup_Message);

			if (actualBookingMustPopup.equals(bookingNumberMustPopup)) {
				System.out.println("Matched || " +bookingNumberMustPopup + " popup is displayed ||"+ " Expected Value is : " + bookingNumberMustPopup
						+ " || Actual Value is : " + actualBookingMustPopup);
				Extent_pass(driver, "Matched || " +bookingNumberMustPopup + " popup is displayed ||"+ " Expected Value is : " + bookingNumberMustPopup
						+ " || ActualValue is : " + actualBookingMustPopup, test, test1);
			} else {
				System.out.println("Not matched || "+bookingNumberMustPopup + " popup is not displayed ||" + " Expected Value is : " + bookingNumberMustPopup
						+ " || Actual Value  is : " + actualBookingMustPopup);
				Extent_fail(driver, "Not matched || "+bookingNumberMustPopup + " popup is not displayed ||" + " Expected Value is : " + bookingNumberMustPopup
						+ " || Actual Value is : " + actualBookingMustPopup, test, test1);
			}
		}
		Step_End(3, " Ensure that system should validate as 'Booking Number must be entered'", test, test1);
		Extent_completed(testCaseName, test, test1);
	}
}
