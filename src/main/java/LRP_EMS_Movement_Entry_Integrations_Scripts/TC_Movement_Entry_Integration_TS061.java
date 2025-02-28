package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS061 extends Keywords {

	public void Movement_Entry_Integration_TS061(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {


		String testcase_Name = "TC_Movement_Entry_Integration_TS061";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String invalidPrevMoveEqpNum = data.get("InvalidPrevMoveEqpNum");
		String invalidPrevMovePopup = data.get("InvalidPrevMovePopup");
		String activitySALE = data.get("ActivitySALE");
		String activityDateSingle61 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		String showAllMoves = data.get("ShowAllMoves");

		// Login
		Extent_Start(testcase_Name, test, test1);

		navigateUrl(driver, URL);

		LRP_Login(driver, username, password);

		// To validate invalid move if user try to insert in between previous move
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

				//Module Search
				moduleNavigate(driver, moduleName);
				
		Step_End(1, "Enter module name in searchbox & click the module", test, test1);

		// Movement Entry
		waitForElement(driver, movementEntryPage_L);
		if (isDisplayed(driver, movementEntryPage_L)) {
			Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
		} else {
			System.out.println( "Movement Entry Page is not displayed");
			Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			
		}

		// Single Entry Equipment
		waitForElement(driver, singleEntryMovPage_L);
		if (isDisplayed(driver, singleEntryMovPage_L)) {
			Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
			Step_Start(2,
					"Ensure that system should validate if user try to insert incorrect inetween previous move which is not mapped in sequence group",
					test, test1);
			waitForElement(driver, equipmentNoSearchField_L);
			sendKeys(driver, equipmentNoSearchField_L, invalidPrevMoveEqpNum);
			Step_End(2,
					"Ensure that system should validate if user try to insert incorrect inetween previous move which is not mapped in sequence group",
					test, test1);
			waitForElement(driver, activitySearchFieldInSingle_L);
			click(driver, activitySearchFieldInSingle_L);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySALE);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);
			
			waitForElement(driver, activeDateInSingle_L);
			click(driver, activeDateInSingle_L);
			if (!activityDateSingle61.equals("")) {
				waitForElement(driver, activeDateInSingle_L);
				if (datePicker.equalsIgnoreCase("Yes")) {
					if (isDisplayed(driver, Calender)) {
						selectDatePicker(driver, activeDateInSingle_L, activityDateSingle61);
					}
				} else {
					if (activityDateSingle61.contains("-")) {
						String activityDateSingle61_1 = activityDateSingle61.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle61_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle61);

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
			waitForElement(driver, showInputSin_L);
			click(driver, showInputSin_L);

		}
		Step_Start(3, "Ensure that system should validate as ' Invalid Previous Move'.", test, test1);
		waitForElement(driver, popup_Message);
		if (isDisplayed(driver, popup_Message)) {

			String actualInvalidPrevMovePopup = getText(driver, popup_Message);

			if (actualInvalidPrevMovePopup.equals(invalidPrevMovePopup)) {
				System.out.println("Matched || " + " Expected Value is : " + invalidPrevMovePopup
						+ " || Actual Value is : " + actualInvalidPrevMovePopup);
				Extent_pass(driver, "Matched || " + " Expected Value is : " + invalidPrevMovePopup
						+ " || ActualValue is : " + actualInvalidPrevMovePopup, test, test1);
				Extent_pass(driver, invalidPrevMovePopup + " popup is displayed", test, test1);
				System.out.println(invalidPrevMovePopup + " popup is displayed");
				click(driver, popup_Message_Ok_Button);
			} else {
				System.out.println("Not matched || " + " Expected Value is : " + invalidPrevMovePopup
						+ " || Actual Value  is : " + actualInvalidPrevMovePopup);
				Extent_fail(driver, "Not matched || " + " Expected Value is : " + invalidPrevMovePopup
						+ " || Actual Value is : " + actualInvalidPrevMovePopup, test, test1);
				Extent_fail(driver, invalidPrevMovePopup + " popup is not displayed", test, test1);
			
				System.out.println(invalidPrevMovePopup + " popup is not displayed");
			}

		}

		waitForDisplay(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
		click(driver, popup_Message_No_Button);
		}
		
		waitForElement(driver, showAllMoves_CheckBox);
		checkBox(driver, showAllMoves_CheckBox, showAllMoves);
		
		Step_End(3, "Ensure that system should validate as ' Invalid Previous Move'.", test, test1);
		Extent_completed(testcase_Name, test, test1);

	}
}
