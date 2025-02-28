package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS036 extends Keywords {

	public void invalidFormatIsGivenInEquipmentNo(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS036";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_036 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_036, testCaseName, "Dataset"+selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String invalidEqpNo = data.get("InvalidEqpNumber");
		String invalidEqpNoPopup = data.get("InvalidEquipmentNumberPopup");
		String activitySearch36 = data.get("Activity");
		String activityDateSingle = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		
		navigateUrl(driver, URL);

		Extent_Start(testCaseName, test, test1);

		
		// Login

	LRP_Login(driver, username, password);

		// To Check Validation if invalid format is given in Equipment no for single
		// entry
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

		
Step_Start(2, "Ensure system should validate if user given invalid format characters in equipment no field", test, test1);
		
		clearAndType(driver, equipmentNoSearchField_L, invalidEqpNo);
		
Step_End(2, "Ensure system should validate if user given invalid format characters in equipment no field", test, test1);
		
		waitForElement(driver, activitySearchFieldInSingle_L);
		sendKeys(driver, activitySearchFieldInSingle_L, activitySearch36);
		waitForElement(driver, autoCompleteValue);
		enter(driver);

		
			if (!activityDateSingle.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle);

				} else {
					click(driver, activeDateInSingle_L);

					if (activityDateSingle.contains("-")) {
						String activityDateSingle_1 = activityDateSingle.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle);

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
		
		Step_Start(3, "clicking the show input field", test, test1);
		waitForElement(driver, showInputSin_L);
		click(driver, showInputSin_L);
		Step_End(3, "clicking the show input field", test, test1);
		
		Step_Start(4, "Ensure that system should validate as 'Invalid Equipment Number. Check Digit is not applicable' when clicked show input fields after providing incorrect container no", test, test1);

		waitForElement(driver, Popup_Message);
		String actualInvalidEqpNumPopup = getText(driver, Popup_Message);
		if (actualInvalidEqpNumPopup.equals(invalidEqpNoPopup)) {
			System.out.println("Matched || "+invalidEqpNoPopup + " popup is displayed ||" + " Expected Value is : " + invalidEqpNoPopup + " || Actual Value is : "
					+ actualInvalidEqpNumPopup);
			Extent_pass(driver, "Matched || "+invalidEqpNoPopup + " popup is displayed ||" + " Expected Value is : " + invalidEqpNoPopup + " || ActualValue is : "
					+ actualInvalidEqpNumPopup, test, test1);
		} else {
			System.out.println("Not matched || "+invalidEqpNoPopup + " popup is not displayed ||" + " Expected Value is : " + invalidEqpNoPopup
					+ " || Actual Value  is : " + actualInvalidEqpNumPopup);
			Extent_fail(driver, "Not matched || "+invalidEqpNoPopup + " popup is not displayed ||" + " Expected Value is : " + invalidEqpNoPopup
					+ " || Actual Value is : " + actualInvalidEqpNumPopup, test, test1);
		}
		Step_End(4, "Ensure that system should validate as 'Invalid Equipment Number. Check Digit is not applicable' when clicked show input fields after providing incorrect container no", test, test1);
	
		Extent_completed(testCaseName, test, test1);

	
	}
}
