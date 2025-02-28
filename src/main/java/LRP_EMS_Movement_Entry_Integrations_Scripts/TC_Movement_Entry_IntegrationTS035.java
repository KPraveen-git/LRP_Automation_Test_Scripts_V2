package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS035 extends Keywords {

	public void checkDigitInSingleEntry(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS035";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_035 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_035, testCaseName,
				"Dataset" + selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String equipmentNum35 = data.get("EquipmentNum");
		String activitySearch = data.get("Activity");
		String activityDateSingle = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		
		navigateUrl(driver, URL);

		Extent_Start(testCaseName, test, test1);

		// Login

		LRP_Login(driver, username, password);

		// To Check Validation for check digit in single entry

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

		
		Step_Start(2, "Ensure system should allow user to enter container no correctly in equipment field", test,test1);

		waitForElement(driver, equipmentNoSearchField_L);
		sendKeys(driver, equipmentNoSearchField_L, equipmentNum35);
		
		Step_End(2, "Ensure system should allow user to enter container no correctly in equipment field", test, test1);
		waitForElement(driver, activitySearchFieldInSingle_L);
		sendKeys(driver, activitySearchFieldInSingle_L, activitySearch);
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
		
		Step_Start(3, "Ensure that system should validate if user clicks show input fields after giving container no",
				test, test1);
		
		waitForElement(driver, showInputSin_L);
		click(driver, showInputSin_L);
		
		
		waitForElement(driver, popup_Message);
		String wantToApplyPopup = getText(driver, popup_Message);
		if (isDisplayed(driver, popup_Message)) {
			System.out.println("Matched || "+wantToApplyPopup + " popup is displayed");
			Extent_pass(driver, "Matched || "+wantToApplyPopup + " popup is displayed", test, test1);
			Step_End(3, "Ensure that system should validate if user clicks show input fields after giving container no",
					test, test1);

			Step_Start(4,
					"Ensure that system should not proceed further if user clicked No from above confirmation message",
					test, test1);
			Extent_call(test, test1, "clicking the NO option");
			click(driver, popup_Message_No_Button);
			Extent_call(test, test1, "Verify the input field display");

			if (!isDisplayed(driver, showInputFieldFrame_L)) {
				Extent_pass(driver, "Show input field frame is not displayed", test, test1);
				System.out.println("Show input field frame is not displayed");
				
			} else {
				System.out.println("Show input field frame is displayed");	
				Extent_fail(driver, "Show input field frame is displayed", test, test1);
			}
		} else {
			System.out.println("Not Matched || "+wantToApplyPopup + " popup is not displayed");
			Extent_fail(driver, "Not Matched || "+wantToApplyPopup + " popup is not displayed", test, test1);
		}

		
		Step_End(4, "Ensure that system should not proceed further if user clicked No from above confirmation message",
				test, test1);
		waitForElement(driver, showInputSin_L);
		click(driver, showInputSin_L);
		
		waitForElement(driver, popup_Message);
		String wantToApplyPopup2 = getText(driver, popup_Message);
		if (isDisplayed(driver, popup_Message)) {
			Extent_pass(driver, "Matched || "+wantToApplyPopup2 + " popup is displayed", test, test1);

			System.out.println("Matched || "+wantToApplyPopup2 + " popup is displayed");
			
			Step_Start(5, " Ensure that system should proceed further if user clicks Yes on the confirmation message",
					test, test1);
			Extent_call(test, test1, "clicking the YES option in the popup");
			click(driver, popup_Message_Yes_Button);

			Step_End(5, " Ensure that system should proceed further if user clicks Yes on the confirmation message",
					test, test1);

			Extent_call(test, test1, "Verify the input field display");
			waitForDisplay(driver, showInputFieldFrame_L);
			if (isDisplayed(driver, showInputFieldFrame_L)) {
				System.out.println("Show input field frame is displayed");
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
			} else {
				System.out.println("Show input field frame is not displayed");
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);
			}
		} else {
			System.out.println("Not Matched || "+wantToApplyPopup2 + " popup is not displayed");
			Extent_fail(driver, "Not Matched || "+wantToApplyPopup2 + " popup is not displayed", test, test1);
		}

		Extent_completed(testCaseName, test, test1);

	}
}
