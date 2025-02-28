package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS062 extends Keywords {

	public void Movement_Entry_Integration_TS062(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {
		String testcase_Name = "TC_Movement_Entry_Integration_TS062";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String activitySUBL = data.get("ActivitySUBL");
		String location62 = data.get("Location");
		String terminal62 = data.get("Terminal");
		String releaseReferenceEnteredPopup = data.get("ReleaseReferenceEnteredPopup");
		String activityDateSingle62 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		String leasekind = data.get("Leasekind");
		String lessee = data.get("Lessee");
		String lessor = data.get("Lessor");
		String subLeaseRefNo = data.get("SubLeaseRefNo");
		String supplierContract = data.get("SupplierContract");
		String relRefNo = data.get("ReleaseRefNo");
		String transportMode = data.get("TransportMode");
		String refNumber = data.get("RefNumber");

		String remarks_Input = data.get("Remarks_Input");

		// Login
		Extent_Start(testcase_Name, test, test1);

		navigateUrl(driver, URL);
		
		LRP_Login(driver, username, password);

		//// To validate if user try to save SUBL without ref no
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

				//Module Search
				moduleNavigate(driver, moduleName);
				
		Step_End(1, "Enter module name in searchbox & click the module", test, test1);

		// Movement Entry
		waitForElement(driver, movementEntryPage_L);
		if (isDisplayed(driver, movementEntryPage_L)) {

			Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
		} else {
			System.out.println("Movement Entry Page is not displayed");
			Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			
		}

		// Multiple Equipment Entry

		waitForElement(driver, multiEntryMovPage_L);
		click(driver, multiEntryMovPage_L);
		waitForElement(driver, multiEntryMovPage_L);
		if (isDisplayed(driver, multiEntryMovPage_L)) {
			Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
			waitForElement(driver, activitySearchField_L);
			sendKeys(driver, activitySearchField_L, activitySUBL);
			enter(driver);
			waitForElement(driver, activeDateField_L);
			click(driver, activeDateField_L);
			if (!activityDateSingle62.equals("")) {
				waitForElement(driver, activeDateField_L);
				if (datePicker.equalsIgnoreCase("Yes")) {
					if (isDisplayed(driver, Calender)) {
						selectDatePicker(driver, activeDateField_L, activityDateSingle62);
					}
				} else {
					if (activityDateSingle62.contains("-")) {
						String activityDateSingle62_1 = activityDateSingle62.replace("-", "/");
						clearAndType(driver, activeDateField_L, activityDateSingle62_1);

					} else {
						clearAndType(driver, activeDateField_L, activityDateSingle62);

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
			Extent_pass(driver, "Show input field frame is displayed", test, test1);
		} else {
			System.out.println("Show input field frame is not displayed");
			Extent_fail(driver, "Show input field frame is not displayed", test, test1);
			
		}
		Step_Start(2,
				"Ensure that system should validate if user try to save SUBL move by giving blank in release ref field",
				test, test1);
		waitForElement(driver, locationSaerchField_L);
		click(driver, locationSaerchField_L);
		waitForElement(driver, locationSaerchField_L);
		Actionsendkeys(driver, locationSaerchField_L, location62);
		waitForDisplay(driver, autoCompleteValue);
		enter(driver);
		
		waitForElement(driver, termDepotSearchField_L);
		click(driver, termDepotSearchField_L);
		waitForElement(driver, termDepotSearchField_L);
		Actionsendkeys(driver, termDepotSearchField_L, terminal62);
		waitForDisplay(driver, autoCompleteValue);
		enter(driver);

		Extent_call(test, test1, "Leaving release reference number text field empty");

		if (!relRefNo.equals("")) {
			waitForElement(driver, relRefNoTextField_L);
			click(driver, relRefNoTextField_L);
			waitForElement(driver, relRefNoTextField_L);
			clear(driver, relRefNoTextField_L);

			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, relRefNo);
			enter(driver);
		}

		if (!leasekind.equals("")) {
			waitForElement(driver, Lease_Kind_Dropdown);
			click(driver, Lease_Kind_Dropdown);
			String select_LeaseKind = String.format(lease_king, leasekind);
			
			waitForElement(driver, select_LeaseKind);
			click(driver, select_LeaseKind);
		}

		if (!lessee.equals("")) {
			waitForElement(driver, lessee_Searchfield);
			click(driver, lessee_Searchfield);
			waitForElement(driver, lessee_Searchfield);
			clear(driver, lessee_Searchfield);

			waitForElement(driver, lessee_Searchfield);
			sendKeys(driver, lessee_Searchfield, lessee);
			enter(driver);
		}
		if (!lessor.equals("")) {
			waitForElement(driver, Lessor1);
			click(driver, Lessor1);
			waitForElement(driver, Lessor1);
			clear(driver, Lessor1);
			waitForElement(driver, Lessor1);
			sendKeys(driver, Lessor1, lessor);
			enter(driver);
		}

		if (!subLeaseRefNo.equals("")) {
			waitForElement(driver, subLeaseRefNo_Textfield);
			click(driver, subLeaseRefNo_Textfield);
			waitForElement(driver, subLeaseRefNo_Textfield);
			clear(driver, subLeaseRefNo_Textfield);
			waitForElement(driver, subLeaseRefNo_Textfield);
			sendKeys(driver, subLeaseRefNo_Textfield, subLeaseRefNo);
			enter(driver);
		}

		if (!supplierContract.equals("")) {
			waitForElement(driver, supplierContract_L);
			click(driver, supplierContract_L);
			waitForElement(driver, supplierContract_L);
			clear(driver, supplierContract_L);
			waitForElement(driver, supplierContract_L);
			sendKeys(driver, supplierContract_L, supplierContract);
			enter(driver);
		}

		if (!transportMode.equals("")) {
			waitForElement(driver, transportMode_Dropdown);
			click(driver, transportMode_Dropdown);
			String select_transportMode = String.format(select_trans, transportMode);
			waitForElement(driver, select_transportMode);
			click(driver, select_transportMode);

		}

		if (!refNumber.equals("")) {
			waitForElement(driver, refNumber_Textfield);
			click(driver, refNumber_Textfield);
			waitForElement(driver, refNumber_Textfield);
			clear(driver, refNumber_Textfield);

			waitForElement(driver, refNumber_Textfield);
			sendKeys(driver, refNumber_Textfield, refNumber);
			enter(driver);
		}

		if (!remarks_Input.equals("")) {
			waitForElement(driver, remarks_Textfield);
			click(driver, remarks_Textfield);
			waitForElement(driver, remarks_Textfield);
			sendKeys(driver, remarks_Textfield, remarks_Input);

			enter(driver);
		}

		Step_End(2,
				"Ensure that system should validate if user try to save SUBL move by giving blank in release ref field",
				test, test1);
		waitForElement(driver, addButtonMulti_L);
		click(driver, addButtonMulti_L);
		Step_Start(3, " Ensure that system should validate as ' Release Reference must be entered'.", test, test1);
		waitForElement(driver, Popup_Message);
		if (isDisplayed(driver, Popup_Message)) {

			String actualReleaseRefPopup = getText(driver, Popup_Message);

			if (actualReleaseRefPopup.equals(releaseReferenceEnteredPopup)) {
				System.out.println("Matched || " + " Expected Value is : " + releaseReferenceEnteredPopup
						+ " || Actual Value is : " + actualReleaseRefPopup);
				Extent_pass(driver, "Matched || " + " Expected Value is : " + releaseReferenceEnteredPopup
						+ " || ActualValue is : " + actualReleaseRefPopup, test, test1);
				Extent_pass(driver, releaseReferenceEnteredPopup + " popup is displayed", test, test1);
				System.out.println(releaseReferenceEnteredPopup + " popup is displayed");

			} else {
				System.out.println("Not matched || " + " Expected Value is : " + releaseReferenceEnteredPopup
						+ " || Actual Value  is : " + actualReleaseRefPopup);
				Extent_fail(driver, "Not matched || " + " Expected Value is : " + releaseReferenceEnteredPopup
						+ " || Actual Value is : " + actualReleaseRefPopup, test, test1);
				Extent_fail(driver, releaseReferenceEnteredPopup + " popup is not displayed", test, test1);
			
				System.out.println(releaseReferenceEnteredPopup + " popup is not displayed");
			}

		}
		Step_End(3, " Ensure that system should validate as ' Release Reference must be entered'.", test, test1);
		Extent_completed(testcase_Name, test, test1);

	}
}
