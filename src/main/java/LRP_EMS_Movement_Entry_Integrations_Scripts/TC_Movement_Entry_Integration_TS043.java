package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS043 extends Keywords {

	public void Movement_Entry_Integration_TS043(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testcase_Name = "TC_Movement_Entry_Integration_TS043";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data43 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);

		String username = data43.get("Username");
		String password = data43.get("Password");
		String moduleName = data43.get("ModuleMovementEntry");
		String savedEqpNumber43 = data43.get("SavedEqpNumber");
		String invalidSubSequentPopup = data43.get("InvalidSubSequentPopup");
		String invalidActivity = data43.get("InvalidActivity");
		String activityDateSingle43 = data43.get("ActivityDate");
		String activityTime_Input1 = data43.get("ActivityTime");
		String datePicker = data43.get("DatePicker");
		String showAllMoves = data43.get("ShowAllMoves");

		navigateUrl(driver, URL);
		
		// Login

		
		Extent_Start(testcase_Name, test, test1);

		LRP_Login(driver, username, password);

		// To validate if user try to proceed with in subsequent move
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//		Module Search
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
		waitForElement(driver, singleEntryMovPage_L);
		if (isDisplayed(driver, singleEntryMovPage_L)) {
			Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
		}
		Step_Start(2, "Ensure that system should allow user to enter valid container no in movement entry", test, test1);

		waitForElement(driver, equipmentNoSearchField_L);
		clearAndType(driver, equipmentNoSearchField_L, savedEqpNumber43);

		Step_End(2, "Ensure that system should allow user to enter valid container no in movement entry", test, test1);
		Step_Start(3, "Ensure that system should validate when user try to enter incorrect next sequence move", test, test1);

		waitForElement(driver, activitySearchFieldInSingle_L);
		sendKeys(driver, activitySearchFieldInSingle_L, invalidActivity);
		waitForElement(driver, autoCompleteValue);
		enter(driver);
		Step_End(3, "Ensure that system should validate when user try to enter incorrect next sequence move", test, test1);

		waitForElement(driver, activeDateInSingle_L);
		click(driver, activeDateInSingle_L);
		Extent_call(test, test1, "Entering the date");
		if (!activityDateSingle43.equals("")) {
			waitForElement(driver, activeDateInSingle_L);

			if(datePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, activeDateInSingle_L, activityDateSingle43);
				}else {
					click(driver, activeDateInSingle_L);

					if(activityDateSingle43.contains("-")) {
						String activityDateSingle43_1=activityDateSingle43.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle43_1);

					}else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle43);

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


		Extent_call(test, test1, "clicking on show input");
		waitForElement(driver, showInputSin_L);
		click(driver, showInputSin_L);
		waitForElement(driver, popup_Message);

		Step_Start(4, "Ensure that system should validate as 'Invalid subsequent move. Next possible movements are' with next possible moves due to move not mapped in sequence group", test, test1);
		if (isDisplayed(driver, popup_Message)) {

			String actualInvalidSubSeqPopup = getText(driver, popup_Message);
			if (!actualInvalidSubSeqPopup.contains(invalidSubSequentPopup)) {
				click(driver, popup_Message_Yes_Button);

			}
			waitForElement(driver, popup_Message);
			actualInvalidSubSeqPopup = getText(driver, popup_Message);
			Extent_call(test, test1, "Validating the actual and expected popups");
			if (actualInvalidSubSeqPopup.contains(invalidSubSequentPopup)) {
				System.out.println("Matched || " + " Expected Value is : " + invalidSubSequentPopup
						+ " || Actual Value is : " + actualInvalidSubSeqPopup);
				Extent_pass(driver, "Matched || " + " Expected Value is : " + invalidSubSequentPopup
						+ " || ActualValue is : " + actualInvalidSubSeqPopup, test, test1);
				Extent_pass(driver, invalidSubSequentPopup + " popup is displayed", test, test1);
				System.out.println(invalidSubSequentPopup + " popup is displayed");
				if(isdisplayed(driver, popup_Message_Ok_Button)) {
					click(driver, popup_Message_Ok_Button);
				}else {
				click(driver, popup_Message_No_Button);
				}
			} else {
				System.out.println("Not matched || " + " Expected Value is : " + invalidSubSequentPopup
						+ " || Actual Value  is : " + actualInvalidSubSeqPopup);
				Extent_fail(driver, "Not matched || " + " Expected Value is : " + invalidSubSequentPopup
						+ " || Actual Value is : " + actualInvalidSubSeqPopup, test, test1);
				Extent_fail(driver, invalidSubSequentPopup + " popup is not displayed", test, test1);

				System.out.println(invalidSubSequentPopup + " popup is not displayed");
			}
			waitForElement(driver, showAllMoves_CheckBox);
			checkBox(driver, showAllMoves_CheckBox, showAllMoves);

		}
		Step_End(4, "Ensure that system should validate as 'Invalid subsequent move. Next possible movements are' with next possible moves due to move not mapped in sequence group", test, test1);


		Extent_completed(testcase_Name, test, test1);
	}
}
