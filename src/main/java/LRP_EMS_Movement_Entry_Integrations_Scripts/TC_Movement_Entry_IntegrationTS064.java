package LRP_EMS_Movement_Entry_Integrations_Scripts;


import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS064 extends Keywords {

	public void invalidScaleOutReferenceInRTNL(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS064";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_064 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_064, testCaseName, "Dataset"+selected_dataset, File_Path);
		
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String activityRTNL = data.get("ActivityRTNL");
		String returnRefNumber = data.get("ReturnRefNumber");
		String eqpNumberRTNL = data.get("EqpNumberRTNL");
		String invalidScaleOutReferenceError = data.get("InvalidScaleOutReferenceError");
		String locationINNSA64 = data.get("LocationINNSA");
		String terminalINNSA64 = data.get("TerminalINNSA");
		String leasekind = data.get("Leasekind");
		String lessee = data.get("Lessee");
		String lessor = data.get("Lessor");
		String subLeaseRefNo = data.get("SubLeaseRefNo");
		String supplierContract = data.get("SupplierContract");
		String relRefNo = data.get("ReleaseRefNo");
		String transportMode = data.get("TransportMode");
		String refNumber = data.get("RefNumber");
		String tareWeight = data.get("TareWeight");
		String payLoad = data.get("PayLoad");
		String remarks_Input = data.get("Remarks_Input");
		String activityDateSingle64 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		
		
		navigateUrl(driver, URL);

		Extent_Start(testCaseName, test, test1);

		// Login
		LRP_Login(driver, username, password);
		
		// To validate Invalid Scale out reference in RTNL
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
			sendKeys(driver, activitySearchField_L, activityRTNL);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			if (!activityDateSingle64.equals("")) {
				waitForElement(driver, activeDateField_L);
				if(datePicker.equalsIgnoreCase("Yes")) {
					if (isDisplayed(driver, Calender)) {
						selectDatePicker(driver, activeDateField_L, activityDateSingle64);
						
				}}else {
					if(activityDateSingle64.contains("-")) {
						String activityDateSingle64_1=activityDateSingle64.replace("-", "/");
						clearAndType(driver, activeDateField_L, activityDateSingle64_1);
						
					}else {
					clearAndType(driver, activeDateField_L, activityDateSingle64);
					
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
			} else {
				System.out.println("activityTime " + "Input Not Available in : " + File_Path);
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
			waitForElement(driver, locationSaerchField_L);
			Actionsendkeys(driver, locationSaerchField_L, locationINNSA64);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);
			
			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			Actionsendkeys(driver, termDepotSearchField_L, terminalINNSA64);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);
			
			waitForElement(driver, returnRefNumber_Textfield);
			sendKeys(driver, returnRefNumber_Textfield, returnRefNumber);
		}

		if(!leasekind.equals("")) {
			waitForElement(driver, Lease_Kind_Dropdown);
			click(driver, Lease_Kind_Dropdown);
			String select_LeaseKind=String.format(lease_Kind, leasekind);

			waitForElement(driver, select_LeaseKind);
			click(driver, select_LeaseKind);
		}
		
		if(!lessee.equals("")) {
			waitForElement(driver, lessee_Searchfield);
			click(driver, lessee_Searchfield);
			waitForElement(driver, lessee_Searchfield);
			clear(driver, lessee_Searchfield);
			
			waitForElement(driver, lessee_Searchfield);
			sendKeys(driver, lessee_Searchfield, lessee);
			enter(driver);
		}
		if(!lessor.equals("")) {
			waitForElement(driver, Lessor1);
			click(driver, Lessor1);
			waitForElement(driver, Lessor1);
			clear(driver, Lessor1);
			waitForElement(driver, Lessor1);
			sendKeys(driver, Lessor1, lessor);
			enter(driver);
		}
		
		if(!subLeaseRefNo.equals("")) {
			waitForElement(driver, subLeaseRefNo_Textfield);
			click(driver, subLeaseRefNo_Textfield);
			waitForElement(driver, subLeaseRefNo_Textfield);
			clear(driver, subLeaseRefNo_Textfield);
			waitForElement(driver, subLeaseRefNo_Textfield);
			sendKeys(driver, subLeaseRefNo_Textfield, subLeaseRefNo);
			enter(driver);
		}
		
		if(!supplierContract.equals("")) {
			waitForElement(driver, supplierContract_L);
			click(driver, supplierContract_L);
			waitForElement(driver, supplierContract_L);
			clear(driver, supplierContract_L);
			waitForElement(driver, supplierContract_L);
			sendKeys(driver, supplierContract_L, supplierContract);
			enter(driver);
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
		if(!transportMode.equals("")) {
			waitForElement(driver, transportMode_Dropdown);
			click(driver, transportMode_Dropdown);
			String select_transportMode = String.format(transport_Mode, transportMode);

			waitForElement(driver, select_transportMode);
			click(driver, select_transportMode);
			
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
		

		if (!tareWeight.equals("")) {
			waitForElement(driver, tare_Textfield);
			click(driver, tare_Textfield);
			waitForElement(driver, tare_Textfield);
			clearAndType(driver, tare_Textfield, tareWeight);
			wait(driver, "1");
			enter(driver);
		}

		if (!payLoad.equals("")) {
			waitForElement(driver, payLoad_Textfield);
			click(driver, payLoad_Textfield);
			waitForElement(driver, payLoad_Textfield);
			clearAndType(driver, payLoad_Textfield, payLoad);

			enter(driver);
		} 
		
		if (!remarks_Input.equals("")) {
			waitForElement(driver, remarks_Textfield);
			click(driver, remarks_Textfield);
			waitForElement(driver, remarks_Textfield);
			sendKeys(driver, remarks_Textfield, remarks_Input);

			enter(driver);
		} 
		
		waitForElement(driver, addButtonMulti_L);
		click(driver, addButtonMulti_L);

		waitForElement(driver, selectGridCell_1_L);
		click(driver, selectGridCell_1_L);
		
		Step_Start(2, "Ensure that system should validate if user try to save RTNL move by giving SUBL ref in RTNL move", test, test1);
		
		waitForDisplay(driver, eqpNum_Inputfield);
		sendKeys(driver, eqpNum_Inputfield, eqpNumberRTNL);
		waitForElement(driver, eqpNum_Inputfield);

		Step_End(2, "Ensure that system should validate if user try to save RTNL move by giving SUBL ref in RTNL move", test, test1);

		scrollTop(driver);
		waitForElement(driver, saveButtonMoveEnt_L);
		click(driver, saveButtonMoveEnt_L);
		Step_Start(3, "Ensure that system should validate as 'Invalid Scale out reference'.", test, test1);
		
		waitForElement(driver, errorRecordsFrame_L);
		if (isDisplayed(driver, errorRecordsFrame_L)) {

			String actuainvalidScaleOutError = getText(driver, invalid_Scale_Out_Error);

			if (actuainvalidScaleOutError.equals(invalidScaleOutReferenceError)) {
				System.out.println("Matched || " +invalidScaleOutReferenceError + " Error is displayed ||"+ " Expected Value is : " + invalidScaleOutReferenceError
						+ " || Actual Value is : " + actuainvalidScaleOutError);
				Extent_pass(driver, "Matched || " +invalidScaleOutReferenceError + " Error is displayed ||"+ " Expected Value is : " + invalidScaleOutReferenceError
						+ " || ActualValue is : " + actuainvalidScaleOutError, test, test1);
				click(driver, okButtonErrorFrame_L); 
			} else {
				System.out.println("Not matched || "+invalidScaleOutReferenceError + " Error is not displayed ||" + " Expected Value is : " + invalidScaleOutReferenceError
						+ " || Actual Value  is : " + actuainvalidScaleOutError);
				Extent_fail(driver, "Not matched || " +invalidScaleOutReferenceError + " Error is not displayed ||"+ " Expected Value is : " + invalidScaleOutReferenceError
						+ " || Actual Value is : " + actuainvalidScaleOutError, test, test1);
			}

		}
		Step_End(3, "Ensure that system should validate as 'Invalid Scale out reference'.", test, test1);
		Extent_completed(testCaseName, test, test1);
	}
}
