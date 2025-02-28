package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS042 extends Keywords {
	// To show warning message when user try to save multiple move with same activity date

	public void toSaveMultipleMoveWithSameActivityDate(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS042";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_033 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_033, testCaseName,
				"Dataset" + selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String ctrDuplicatedPopup = data.get("CTRDuplicated");
		String savedEqpNumber = data.get("SavedEqpNumber");
		String activitySearch42 = data.get("Activity");
		String datePicker = data.get("DatePicker");
		
		String activityDateSingle42 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String showAllMoves = data.get("ShowAllMoves");

		navigateUrl(driver, URL);

		// Login
		Extent_Start(testCaseName, test, test1);

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
		

		Extent_call(test, test1, "Sending container number");
		waitForElement(driver, equipmentNoSearchField_L);
		clearAndType(driver, equipmentNoSearchField_L, savedEqpNumber);
		waitForElement(driver, activitySearchFieldInSingle_L);
		sendKeys(driver, activitySearchFieldInSingle_L, activitySearch42);
		waitForDisplay(driver, autoCompleteValue);
		enter(driver);

		Step_Start(2,
				" Ensure that system should validate when user try to save multiple move in same acitivty date & time",
				test, test1);
		if (!activityDateSingle42.equals("")) {
			waitForElement(driver, activeDateInSingle_L);

			if (datePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, activeDateInSingle_L, activityDateSingle42);

			} else {
				click(driver, activeDateInSingle_L);

				if (activityDateSingle42.contains("-")) {
					String activityDateSingle42_1 = activityDateSingle42.replace("-", "/");
					clearAndType(driver, activeDateInSingle_L, activityDateSingle42_1);

				} else {
					clearAndType(driver, activeDateInSingle_L, activityDateSingle42);

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
		
		Step_End(2,
				" Ensure that system should validate when user try to save multiple move in same acitivty date & time",
				test, test1);

		Extent_call(test, test1, "Clicking on show input field");
		waitForElement(driver, showInputSin_L);
		click(driver, showInputSin_L);
		Step_Start(3,
				"Ensure that system should validate as 'CTR has duplicated date-time activities' when user click on show input fields",
				test, test1);
		waitForElement(driver, Popup_Message);
		if (isDisplayed(driver, Popup_Message)) {

			String actualCTRPopup = getText(driver, Popup_Message);
			Extent_call(test, test1, "Comparing the actual and expected popups");
			if (actualCTRPopup.equals(ctrDuplicatedPopup)) {
				System.out.println("Matched || " +ctrDuplicatedPopup + " popup is displayed ||"+ " Expected Value is : " + ctrDuplicatedPopup
						+ " || Actual Value is : " + actualCTRPopup);
				Extent_pass(driver, "Matched || " +ctrDuplicatedPopup + " popup is displayed ||"+ " Expected Value is : " + ctrDuplicatedPopup
						+ " || ActualValue is : " + actualCTRPopup, test, test1);
			} else {
				System.out.println("Not matched || "+ctrDuplicatedPopup + " popup is not displayed ||" + " Expected Value is : " + ctrDuplicatedPopup
						+ " || Actual Value  is : " + actualCTRPopup);
				Extent_fail(driver, "Not matched || " +ctrDuplicatedPopup + " popup is not displayed ||"+ " Expected Value is : " + ctrDuplicatedPopup
						+ " || Actual Value is : " + actualCTRPopup, test, test1);
			}
			Step_End(3,
					"Ensure that system should validate as 'CTR has duplicated date-time activities' when user click on show input fields",
					test, test1);
		}
		waitForElement(driver, showAllMoves_CheckBox);
		checkBox(driver, showAllMoves_CheckBox, showAllMoves);

		Extent_completed(testCaseName, test, test1);

	}
}
