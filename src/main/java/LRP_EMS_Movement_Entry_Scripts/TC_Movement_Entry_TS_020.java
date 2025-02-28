package LRP_EMS_Movement_Entry_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_TS_020 extends Keywords {

//	To Delete move in movement entry via multiple entry
	
	public void deleteMoveViaMultipleEntry(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) {
		String testCaseName="TC_Movement_Entry_TS_020";
//		Get data from excel sheet
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);
		String username = Excel_data.get("Username");
		String password = Excel_data.get("Password");
		String moduleName = Excel_data.get("ModuleMovementEntry");
		String eqpNoMulti_1 = Excel_data.get("EquipmentNo1");
		String multiDeleted = Excel_data.get("MultipleMovEntryDeleted");
		String movementCode = Excel_data.get("MovementCode");
		String globalSearchFilterOption1 = Excel_data.get("GlobalSearchFilterOption1");
		String dropdownCondition = Excel_data.get("DropdownCondition");

		String globalSearchFilterOption2 = Excel_data.get("globalSearchFilterOption2");
		String globalSearchFilterOption3 = Excel_data.get("globalSearchFilterOption3");
		String searchValue2 = Excel_data.get("searchValue2");
		String searchValue3 = Excel_data.get("searchValue3");
		
		navigateUrl(driver, url);

		Extent_Start(testCaseName, test, test1);

		// Login

		LRP_Login(driver, username, password);
		
		Step_Start(1, "Enter the module name in the search box and click on the module", test, test1);
		
		moduleNavigate(driver, moduleName);
		
		Step_End(1, "Enter the module name in the search box and click on the module", test, test1);

		
		// Multiple Equipment Entry
				Step_Start(2, "Select the Multiple Equipment Entry option", test, test1);
				
				waitForElement(driver, multiEntryMovPage_L);
				click(driver, multiEntryMovPage_L);
				
				Step_End(2, "Select the Multiple Equipment Entry option", test, test1);
				
		waitForElement(driver, multiEntryMovPage_L);
		if (isDisplayed(driver, multiEntryMovPage_L)) {
			System.out.println("Multiple Equipment Entry page is displayed");
			Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
			
			waitForElement(driver, activitySearchField_L);
	
				Step_Start(3, "Click on the Global Search icon in the toolbar.", test, test1);
				
				waitForElement(driver, globalSearch_L);
				click(driver, globalSearch_L);
				
				Step_End(3, "Click on the Global Search icon in the toolbar.", test, test1);
				Step_Start(4, "Enter the required container number in the appropriate field", test, test1);
				Step_Start(5, "Click the Search button to view the results, then select the required container", test, test1);

				globalValueSearchWindow(driver, dropdownCondition, globalSearchFilterOption1, eqpNoMulti_1, globalSearchFilterOption2, searchValue2, globalSearchFilterOption3, searchValue3);

				Step_End(4, "Enter the required container number in the appropriate field", test, test1);
				Step_End(5, "Click the Search button to view the results, then select the required container", test, test1);

			
			List<String> movement_Code = splitAndExpand(movementCode);
			
			for(int i=0; i<movement_Code.size();i++) {
			
			String movement_Code_Input=movement_Code.get(i);
			
			Step_Start(6, "Enter the movement code in the designated column.", test, test1);

			waitForElement(driver, movementCode_Grid_Filter);
			click(driver, movementCode_Grid_Filter);
			waitForElement(driver, movementCode_Grid_Filter);
			sendKeys(driver, movementCode_Grid_Filter, movement_Code_Input);
			
			Step_End(6, "Enter the movement code in the designated column.", test, test1);
			Step_Start(7, "Right-click on the required container and select the Delete option.", test, test1);
			
			waitForElement(driver, equipmentDetails_Grid_First_Row);
			RightClick(driver, equipmentDetails_Grid_First_Row);
			
			waitForElement(driver, multiDeleteOption_L);
			click(driver, multiDeleteOption_L);
			
			Step_End(7, "Right-click on the required container and select the Delete option.", test, test1);
			Step_Start(8, "A confirmation message will appear indicating that the selected container has been deleted", test, test1);
			
			waitForElement(driver, popup_Message);

			if (isDisplayed(driver, popup_Message)) {
				String actConfirm = getText(driver, popup_Message);
				Extent_pass(driver, actConfirm + "popup is displayed", test, test1);
				click(driver, popup_Message_Yes_Button);
			}
			waitForElement(driver, popup_Message);

				String actText1 = getText(driver, popup_Message);
				if (actText1.equals(multiDeleted)) {
					Extent_pass(driver, "Matched || Expected Popup : "+multiDeleted + " || Actual Popup : "+actText1, test, test1);
					System.out.println("Matched || Expected Popup : "+multiDeleted + " || Actual Popup : "+actText1);
					click(driver, popup_Message_Ok_Button);
				}else {
					System.out.println("Not Matched || Expected Popup : "+multiDeleted + " || Actual Popup : "+actText1);
					Extent_fail(driver, "Not Matched || Expected Popup : "+multiDeleted + " || Actual Popup : "+actText1, test, test1);
				}
				Step_End(8, "A confirmation message will appear indicating that the selected container has been deleted", test, test1);

			}
			

		} else {
			System.out.println("Multiple Equipment Entry page is not displayed");
			Extent_fail(driver, "Multiple Equipment Entry page is not displayed", test, test1);
		}

		Extent_completed(testCaseName, test, test1);
	}
	
}
