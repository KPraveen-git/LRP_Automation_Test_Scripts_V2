package LRP_EMS_Equipment_Profile_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Equipment_Profile_TS_061 extends Keywords {
	
//	Check whether that system allows to delete the saved record
	
	public void deleteTheSavedRecord(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testCaseName="TC_Equipment_Profile_TS_061";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);
		String username = Excel_data.get("Username");
		String password = Excel_data.get("Password");
		String moduleName = Excel_data.get("ModuleEquipmentProfile");
		String cannotDelEqp = Excel_data.get("MovementEntry_EquipmentNo");
		String deletedPopup = Excel_data.get("DeletedPopup");
		String noRecords = Excel_data.get("NoRecords");
		String cannotDelelePopup = Excel_data.get("CannotDelelePopup");	
		String eqpNoDelete = Excel_data.get("EquipmentNumber_Delete");
		String wantToDeletepopup = Excel_data.get("WantToDeletePopup");
		String dropdownCondition = Excel_data.get("DropdownCondition");
		String globalSearchFilterOption1 = Excel_data.get("GlobalSearchFilterOption1");
		String globalSearchFilterOption2 = Excel_data.get("globalSearchFilterOption2");
		String globalSearchFilterOption3 = Excel_data.get("globalSearchFilterOption3");
		String searchValue2 = Excel_data.get("searchValue2");
		String searchValue3 = Excel_data.get("searchValue3");
		
		navigateUrl(driver, url);

		Extent_Start(testCaseName, test, test1);

		// Login
		
		LRP_Login(driver, username, password);

//		Module Search
		moduleNavigate(driver, moduleName);
		
		// Equipment Profile
		waitForElement(driver, EqpProfilePage_L);
		if (isDisplayed(driver, EqpProfilePage_L)) {
			Extent_pass(driver, "Equipment Profile Page is displayed", test, test1);
			System.out.println("Equipment Profile Page is displayed");
		} else {
			System.out.println("Equipment Profile Page is not displayed");
			Extent_fail(driver, "Equipment Profile Page is not displayed", test, test1);

		}

		waitForElement(driver, cancelButtonEqPro_L);
		click(driver, cancelButtonEqPro_L);

		// Delete

		Step_Start(1, "Click the Global search button in the toolbar", test, test1);
		
		waitForElement(driver, globalSearchEqpPro_L);
		click(driver, globalSearchEqpPro_L);
		
		Step_End(1, "Click the Global search button in the toolbar", test, test1);
		
		Step_Start(2, "Enter the Equipment Number in the search list", test, test1);
		Step_Start(3, "Click on the search Button once Equipment number entered", test, test1);
		Step_Start(4, "Double click on the saved record from the AgGrid table", test, test1);

		globalValueSearchWindow(driver, dropdownCondition, globalSearchFilterOption1, eqpNoDelete, globalSearchFilterOption2, searchValue2, globalSearchFilterOption3, searchValue3);

			Step_End(2, "Enter the Equipment Number in the search list", test, test1);
			
			Step_End(3, "Click on the search Button once Equipment number entered", test, test1);
			
			Step_End(4, "Double click on the saved record from the AgGrid table", test, test1);
			Step_Start(5, "Click on the Delete button in the toolbar", test, test1);
			
			waitForElement(driver, deleteButtonEqpPro_L);
			click(driver, deleteButtonEqpPro_L);

			Step_End(5, "Click on the Delete button in the toolbar", test, test1);
			Step_Start(6, "Press 'Yes' in the Popup message to delete", test, test1);
			
			waitForElement(driver, popup_Message);
			String actualWantToDeletePopup1=getText(driver, popup_Message);
			System.out.println("wantToDeletePopup:"+actualWantToDeletePopup1);
			
			if (actualWantToDeletePopup1.equals(wantToDeletepopup)) {				
				Extent_pass(driver, wantToDeletepopup+" is displayed", test, test1);
				System.out.println(wantToDeletepopup+" is displayed");
				click(driver, popup_Message_Yes_Button);
			} else {
				System.out.println(wantToDeletepopup+" is not displayed");
				Extent_fail(driver, wantToDeletepopup+" is not displayed", test, test1);
			}
			
			Step_End(6, "Press 'Yes' in the Popup message to delete", test, test1);
			
			Step_Start(7, "Deleted popup Verification", test, test1);

			waitForElement(driver, eqpProfileDeletedPopup_L);
			String actDeletedPopup = getText(driver, eqpProfileDeletedPopup_L);
			if (actDeletedPopup.equals(deletedPopup)) {
				System.out.println(
						"Matched || " + " Expected popup : " + deletedPopup + " || Actual popup : " + actDeletedPopup);
				Extent_pass(driver,
						"Matched || " + " Expected popup : " + deletedPopup + " || Actual popup : " + actDeletedPopup, test,
						test1);
			} else {
				System.out.println(
						"Not matched || " + " Expected popup : " + deletedPopup + " || Actual popup : " + actDeletedPopup);

				Extent_fail(driver,"Not matched || " + " Expected popup : " + deletedPopup + " || Actual popup : " + actDeletedPopup+"<br>"+deletedPopup+" popup is not displayed",test, test1);
			}

			Step_End(7, "Deleted popup Verification", test, test1);

		// Global search
	
		waitForElement(driver, globalSearchEqpPro_L);
		click(driver, globalSearchEqpPro_L);
		waitForElement(driver, eqpProfileSearchFrame_L);
		if (isDisplayed(driver, eqpProfileSearchFrame_L)) {
			Extent_pass(driver, "Search Equipment Profile frame is displayed", test, test1);
			System.out.println("Search Equipment Profile frame is displayed");
			
			waitForElement(driver, type_Select1);
			click(driver,type_Select1);
			selectByText(driver, type_Select1, globalSearchFilterOption1);
			waitForElement(driver, globalSearch_Condition_Dropdown1);
			click(driver, globalSearch_Condition_Dropdown1);
			selectByText(driver, globalSearch_Condition_Dropdown1, dropdownCondition);
			click(driver, globalSearch_InputTextfield1);
			sendKeys(driver, globalSearch_InputTextfield1, eqpNoDelete);
			click(driver, globalSearch_Frame_SearchButton);

			waitForDisplay(driver, eqpProNoFoundRecordsPopup_L);

			String actNoRecords = getText(driver, eqpProNoFoundRecordsPopup_L);
			System.out.println("Actual" + actNoRecords);
			if (actNoRecords.equals(noRecords)) {

				Extent_pass(driver,"Matched || " + " Expected Activity is : " + noRecords + " || Actual  : " + actNoRecords+"<br>"+noRecords+" popup is displayed", test,test1);
				System.out.println("Matched || " + " Expected  : " + noRecords + " || Actual  : " + actNoRecords);
			} else {
				System.out.println("Not matched || " + " Expected  : " + noRecords + " || Actual  : " + actNoRecords);

				Extent_fail(driver, "Not matched || " + " Expected : " + noRecords + " || Actual  : " + actNoRecords+"<br>"+noRecords+" popup is not displayed",test, test1);
			}
			 waitForElement(driver, EqpSearchCloseButton_L);
			 click(driver, EqpSearchCloseButton_L);
		}
		// delete
		if(!cannotDelEqp.equals("")) {
		waitForElement(driver, globalSearchEqpPro_L);
		click(driver, globalSearchEqpPro_L);
		
		globalValueSearchWindow(driver, dropdownCondition, globalSearchFilterOption1, cannotDelEqp, globalSearchFilterOption2, searchValue2, globalSearchFilterOption3, searchValue3);

			waitForElement(driver, deleteButtonEqpPro_L);
			click(driver, deleteButtonEqpPro_L);

			waitForElement(driver, popup_Message);
			String actualWantToDeletePopup=getText(driver, popup_Message);
			System.out.println("wantToDeletePopup:"+actualWantToDeletePopup);
			
			if (actualWantToDeletePopup.equals(wantToDeletepopup)) {				
				Extent_pass(driver, wantToDeletepopup+" is displayed", test, test1);
				System.out.println(wantToDeletepopup+" is displayed");
				click(driver, popup_Message_Yes_Button);
			} else {
				System.out.println(wantToDeletepopup+" is not displayed");
				Extent_fail(driver, wantToDeletepopup+" is not displayed", test, test1);
			}
			

			Step_Start(8, "Cannot delete the Equipment Profile. It has movement entry", test, test1);
			waitForElement(driver, Popup_Message);
			String actCannotDel = getText(driver, cannotDeletePopup_L);
			if (actCannotDel.equals(cannotDelelePopup)) {
				System.out.println("Matched || " + " Expected popup : " + cannotDelelePopup + " || Actual popup : " + actCannotDel);
				Extent_pass(driver, "Matched || " + " Expected popup : " + cannotDelelePopup + " || Actual popup : " + actCannotDel, test,test1);
			} else {
				System.out.println("Not matched || " + " Expected popup : " + cannotDelelePopup + " || Actual popup : " + actCannotDel);
				Extent_fail(driver, "Not matched || " + " Expected popup : " + cannotDelelePopup + " || Actual popup : " + actCannotDel+"<br>"+cannotDelelePopup + " popup is not diplayed and it is verified",test, test1);
			}

			Step_End(8, "Cannot delete the Equipment Profile. It has movement entry", test, test1);
		}
		 

		Extent_completed(testCaseName, test, test1);
	}

}
