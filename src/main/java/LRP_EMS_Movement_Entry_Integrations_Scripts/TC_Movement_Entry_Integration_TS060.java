package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS060 extends Keywords {

	public void Movement_Entry_Integration_TS060(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testcase_Name = "TC_Movement_Entry_Integration_TS060";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String invalidNextMoveEqpNum = data.get("InvalidNextMoveEqpNum");
		String activityOFHI = data.get("ActivityOFHI");
		String invalidNextMovePopup = data.get("InvalidNextMovePopup");
		String activityDateSingle60 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		String showAllMoves = data.get("ShowAllMoves");

		// Login
		Extent_Start(testcase_Name, test, test1);

		navigateUrl(driver, URL);

		LRP_Login(driver, username, password);

		//// To validate invalid move if user try to insert in between next move
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

		// Single Entry Equipment
		waitForElement(driver, singleEntryMovPage_L);
		if (isDisplayed(driver, singleEntryMovPage_L)) {
			Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
			Step_Start(2,
					"Ensure that system should validate if user try to insert incorrect inbetween next move which is not mapped in sequence group",
					test, test1);
			waitForElement(driver, equipmentNoSearchField_L);
			sendKeys(driver, equipmentNoSearchField_L, invalidNextMoveEqpNum);
			Step_End(2,
					"Ensure that system should validate if user try to insert incorrect inbetween next move which is not mapped in sequence group",
					test, test1);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activityOFHI);
			enter(driver);
			waitForElement(driver, activeDateInSingle_L);
			click(driver, activeDateInSingle_L);
			if (!activityDateSingle60.equals("")) {
				waitForElement(driver, activeDateInSingle_L);
				click(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					if (isDisplayed(driver, Calender)) {
						selectDatePicker(driver, activeDateInSingle_L, activityDateSingle60);
					}
				} else {
					if (activityDateSingle60.contains("-")) {
						String activityDateSingle60_1 = activityDateSingle60.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle60_1);
					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle60);

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
		Step_Start(3, "Ensure that system should validate as ' Invalid Next Move'.", test, test1);
		waitForElement(driver, popup_Message);
		if (isDisplayed(driver, popup_Message)) {

			String actualInvalidNextMovePopup = getText(driver, popup_Message);

			if (actualInvalidNextMovePopup.equals(invalidNextMovePopup)) {
				System.out.println("Matched || " + " Expected Value is : " + invalidNextMovePopup
						+ " || Actual Value is : " + actualInvalidNextMovePopup);
				Extent_pass(driver, "Matched || " + " Expected Value is : " + invalidNextMovePopup
						+ " || ActualValue is : " + actualInvalidNextMovePopup, test, test1);
				Extent_pass(driver, invalidNextMovePopup + " popup is displayed", test, test1);
				System.out.println(invalidNextMovePopup + " popup is displayed");
				click(driver, popup_Message_Ok_Button);
			} else {
				System.out.println("Not matched || " + " Expected Value is : " + invalidNextMovePopup
						+ " || Actual Value  is : " + actualInvalidNextMovePopup);
				Extent_fail(driver, "Not matched || " + " Expected Value is : " + invalidNextMovePopup
						+ " || Actual Value is : " + actualInvalidNextMovePopup, test, test1);
				
			}

		}
		
		waitForDisplay(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			click(driver, popup_Message_Yes_Button);
		}
		
		waitForDisplay(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			click(driver, popup_Message_No_Button);
		}
		waitForElement(driver, showAllMoves_CheckBox);
		checkBox(driver, showAllMoves_CheckBox, showAllMoves);

		Step_End(3, "Ensure that system should validate as ' Invalid Next Move'.", test, test1);

		Extent_completed(testcase_Name, test, test1);

	}
}
