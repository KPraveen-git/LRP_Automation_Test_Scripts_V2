package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_IntegrationTS034 extends Keywords {

	public void toValidateForBlankActivity(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) {
		
		String testCaseName="TC_Movement_Entry_IntegrationTS034";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_034 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_034, testCaseName,
				"Dataset" + selected_dataset, File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String equipmentNum = data.get("EquipmentNum");
		String selectActivity = data.get("SelectActivity");

		
		String activityDateSingle34 = data.get("ActivityDate");
		String activityTime_Input1 = data.get("ActivityTime");
		String datePicker = data.get("DatePicker");
		
		navigateUrl(driver, URL);

		Extent_Start(testCaseName, test, test1);
		
		// Login
		LRP_Login(driver, username, password);

		//// To Validate for Blank Activity
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//		Module Search
		moduleNavigate(driver, moduleName);
		
		Step_End(1, "Enter module name in searchbox & click the module", test, test1);

		// Movement Entry
		Extent_call(test, test1, "Navigating to Movement Entry Page");
		
		waitForElement(driver, movementEntryPage_L);
		if (isDisplayed(driver, movementEntryPage_L)) {
			System.out.println("Movement Entry Page is displayed");
			Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
		} else {
			System.out.println("Movement Entry Page is not displayed");
			Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
		}
		
		
		clearAndType(driver, equipmentNoSearchField_L, equipmentNum);
		
		Step_Start(2, "selecting the date", test, test1);
		
		if (!activityDateSingle34.equals("")) {
			waitForElement(driver, activeDateInSingle_L);

			if (datePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, activeDateInSingle_L, activityDateSingle34);

			} else {
				click(driver, activeDateInSingle_L);

				if (activityDateSingle34.contains("-")) {
					String activityDateSingle34_1 = activityDateSingle34.replace("-", "/");
					clearAndType(driver, activeDateInSingle_L, activityDateSingle34_1);

				} else {
					clearAndType(driver, activeDateInSingle_L, activityDateSingle34);

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
		Step_End(2, "selecting the date", test, test1);
		Step_Start(3, "clicking the show input field by giving blank activity field", test, test1);

		click(driver, showInputFieldsButton_L);
		Step_End(3, "clicking the show input field by giving blank activity field", test, test1);

		Step_Start(4, "Ensure that system should validate as 'Select Activity'.", test, test1);
		
		waitForElement(driver, Popup_Message);
		String actualSelectActivityPopup = getText(driver, Popup_Message);
		if (actualSelectActivityPopup.equals(selectActivity)) {
			System.out.println("Matched || "+selectActivity + " popup is displayed" + " || Expected Value is : " + selectActivity + " || Actual Value is : "
					+ actualSelectActivityPopup);
			Extent_pass(driver, "Matched || "+selectActivity + " popup is displayed" + " || Expected Value is : " + selectActivity + " || ActualValue is : "
					+ actualSelectActivityPopup, test, test1);
		} else {
			System.out.println("Not matched || "+selectActivity + " popup is not displayed" + " || Expected Value is : " + selectActivity + " || Actual Value  is : "
					+ actualSelectActivityPopup);
			Extent_fail(driver, "Not matched || "+selectActivity + " popup is not displayed" + " || Expected Value is : " + selectActivity + " || Actual Value is : "
					+ actualSelectActivityPopup, test, test1);
		}

		Step_End(4, "Ensure that system should validate as 'Select Activity'.", test, test1);
		Extent_completed(testCaseName, test, test1);

	}
}
