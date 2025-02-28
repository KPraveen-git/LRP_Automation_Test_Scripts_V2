package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS033 extends Keywords {

	public void noOfCharactersInMovementEntry(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) {

		String testCaseName="TC_Movement_Entry_IntegrationTS033";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_033 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_033, testCaseName,
				"Dataset" + selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String eqpNum = data.get("EquipmentNo");
		String atleastFourCharPopup = data.get("AtleastFourCharPopup");
		String activityDateSingle = data.get("ActivityDate");
		String activitySearch = data.get("Activity");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		
		navigateUrl(driver, URL);

		Extent_Start(testCaseName, test, test1);

		// Login

		LRP_Login(driver, username, password);
		
		//// To Validate no of Characters in Movement Entry
		// Home

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

		Step_Start(2, "Ensure system should validate if user entered only 3 characters & click search icon.", test,test1);
		waitForElement(driver, equipmentNoSearchField_L);
		sendKeys(driver, equipmentNoSearchField_L, eqpNum);

		if (!activitySearch.equals("")) {
		waitForElement(driver, activitySearchFieldInSingle_L);
		sendKeys(driver, activitySearchFieldInSingle_L, activitySearch);
		waitForElement(driver, autoCompleteValue);
		enter(driver);
		}
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

			waitForElement(driver, Calender);
			if (isDisplayed(driver, Calender)) {
				click(driver, activityTime_Input);
				waitForDisplay(driver, activityTime_Input);
				clearAndType(driver, activityTime_Input, activityTime_Input1);
				System.out.println("activity_Time" + activityTime_Input1);

			}
			click(driver, activityTime_Close);
		} 
		waitForElement(driver, equipmentSearch_Icon);

		click(driver, equipmentSearch_Icon);
		Step_End(2, "Ensure system should validate if user entered only 3 characters & click search icon.", test,test1);

		Step_Start(3, "Ensure that system should validate as 'Enter atleast four characters of Equipment Number'.",test, test1);
		
		waitForElement(driver, Popup_Message);

		String actualPopup = getText(driver, Popup_Message);

		if (actualPopup.equals(atleastFourCharPopup)) {
			System.out.println("Matched || " +atleastFourCharPopup+" popup is displayed"+ " || Expected Value is : " + atleastFourCharPopup + " || Actual Value is : "
					+ actualPopup);
			Extent_pass(driver, "Matched || "+atleastFourCharPopup+" popup is displayed" + " || Expected Value is : " + atleastFourCharPopup + " || ActualValue is : "
					+ actualPopup, test, test1);
		} else {
			System.out.println("Not matched || "+atleastFourCharPopup + " popup is not displayed" + " || Expected Value is : " + atleastFourCharPopup
					+ " || Actual Value  is : " + actualPopup);
			Extent_fail(driver, "Not matched || "+atleastFourCharPopup + " popup is not displayed" + " || Expected Value is : " + atleastFourCharPopup
					+ " || Actual Value is : " + actualPopup, test, test1);
		}

		Step_End(3, "Ensure that system should validate as 'Enter atleast four characters of Equipment Number'.", test,test1);

		Extent_completed(testCaseName, test, test1);

	}
}
