package LRP_EMS_Individual_Scripts;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.ActivityDefinition_Locators;

public class TC_ActivityDefinition_TS_062 extends Keywords{

	public void ActivityDefinition_TS_062(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		String testCase_Name="TC_ActivityDefinition_TS_062";
		String File_Path_62 = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String Sheet_Name_062 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		String URL = TestNgXml.getdatafromExecution().get(testCase_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_062, testCase_Name, "Dataset"+selected_dataset, File_Path_62);		
		String Username = Excel_data.get("Userid");
		String pass_word = Excel_data.get("PassWord");
		String Field_Names = Excel_data.get("field_name");		
		String Activity_Code_Txt = Excel_data.get("Activity_Code_Txt");		
		String updatedPopup = Excel_data.get("Act_Def_updated_Popup_txt");
		String Column_Input = Excel_data.get("Column_Input");
		String Update_Input = Excel_data.get("Update_Input");
		String copy_From_Previous_Input = Excel_data.get("copy_From_Previous_Input");
		String copy_To_Previous_Input = Excel_data.get("copy_To_Previous_Input");
		String Validation_Type_Input = Excel_data.get("Validation_Type_Input");
		String Button = Excel_data.get("Button");
		Extent_Start(testCase_Name, test, test1);
		String update_Value =String.format(ActivityDefinition_Locators.Updated_Value,Update_Input);
		String Valid_Type = String.format(ActivityDefinition_Locators.Valid_Type_Value,Validation_Type_Input);
		String cmbCpy_Value_1 =String.format(ActivityDefinition_Locators.CMBCpy_Value_1,copy_From_Previous_Input);
		String cmbCpy_Value_2 = String.format(ActivityDefinition_Locators.CMBCpy_Value_2,copy_To_Previous_Input);
		String add_button_select = String.format(ActivityDefinition_Locators.ADD_button_select,Button);
		String Condition =Excel_data.get("Condition");
		String Activity_Search_Column_Header =Excel_data.get("Activity_Search_Column_Header");
		String Activity_Def_Column_Name_Search_Column_Header =Excel_data.get("Activity_Def_Column_Name_Search_Column_Header");

		navigateUrl(driver, URL);
		LRP_Login(driver, Username, pass_word);
		Extent_call(test, test1, "Enter module name in searchbox & click the module");
		moduleNavigate(driver, Field_Names);
		waitForElement(driver, Module2);
		String Modulename1 = getText(driver, Module2);
		System.out.println("ModuleName: "+Modulename1);
		if(Modulename1.equals(Field_Names)) {
			Extent_pass(driver, "Matched || Expected selected module : "+Field_Names+" || Actual selected module : "+Modulename1, test, test1);
			System.out.println("Matched || Expected selected module : "+Field_Names+" || Actual selected module : "+Modulename1);
		}else {
			System.out.println("Not Matched || Expected selected module : "+Field_Names+" || Actual selected module : "+Modulename1);
			Extent_fail(driver, "Not Matched || Expected selected module : "+Field_Names+" || Actual selected module : "+Modulename1, test, test1);
		}
		Step_Start(1, "Click on the search toolbar in the Activity code.", test, test1);
		waitForElement(driver, kActivitySearch);
		click(driver,kActivitySearch);
		Step_End(1, "Click on the search toolbar in the Activity code.", test, test1);
		Step_Start(2, "Enter  Activity code in the Activity Search.", test, test1);
		twoColumnSearchWindow(driver,Activity_Search_Column_Header, Condition, Activity_Code_Txt);
		Step_End(2, "Enter  Activity code in the Activity Search.", test, test1);
		Step_Start(3, "Click on the \"Edit\" button from the toolbar.", test, test1);
		waitForElement(driver, kActivityDefinitionEdit);
		click(driver,kActivityDefinitionEdit);
		Step_End(3, "Click on the \"Edit\" button from the toolbar.", test, test1);
		Step_Start(4, "Select the newly required column name.", test, test1);
		waitForElement(driver, kActivityDefinitionColumName);
		click(driver,kActivityDefinitionColumName);
		twoColumnSearchWindowMultipleValue(driver,Activity_Def_Column_Name_Search_Column_Header, Condition, Column_Input);
		Step_End (4, "Select the newly required column name.", test, test1);
		Step_Start(5, "Click on the \"Is Update\" dropdown.", test, test1);

		waitForElement(driver, kActivityDefinitionIsUpdate);
		click(driver,kActivityDefinitionIsUpdate);
		Step_End (5, "Click on the \\\"Is Update\\\" dropdown.", test, test1);
		Step_Start(6, "Select 'Yes' or 'No' for Is update.", test, test1);
		waitForElement(driver, update_Value);
		click(driver, update_Value);
		Step_End (6, "Select 'Yes' or 'No' for Is update.", test, test1);

		Step_Start(7, "Click on the \"Validation Type\" dropdown", test, test1);
		waitForElement(driver, kActivityDefinitionValidationType);
		click(driver,kActivityDefinitionValidationType);
		Step_End(7, "Click on the \"Validation Type\" dropdown", test, test1);
		Step_Start(8, "Select 'V' in the Validation type.", test, test1);
		waitForElement(driver, Valid_Type);
		click(driver, Valid_Type);
		Step_End(8, "Select 'V' in the Validation type.", test, test1);
		Step_Start(9, "Click on the \"Copy From Previous\" dropdown.", test, test1);

		waitForElement(driver, kActivityDefinitionCopyFromPrevious);
		click(driver,kActivityDefinitionCopyFromPrevious);
		Step_End(9, "Click on the \"Copy From Previous\" dropdown.", test, test1);
		Step_Start(10, "Select 'Yes' or 'No' for Copy From Previous.", test, test1);
		waitForElement(driver, cmbCpy_Value_1);
		click(driver, cmbCpy_Value_1);
		Step_End(10, "Select 'Yes' or 'No' for Copy From Previous.", test, test1);
		Step_Start(11, "Click on the \"Copy To Previous\" dropdown.", test, test1);
		waitForElement(driver, kActivityDefinitionCopyToPrevious);
		click(driver,kActivityDefinitionCopyToPrevious);
		Step_End(11, "Click on the \"Copy To Previous\" dropdown.", test, test1);
		Step_Start(12, "Select 'Yes' or 'No' for Copy To Previous.", test, test1);
		waitForElement(driver, cmbCpy_Value_2);
		click(driver, cmbCpy_Value_2);
		Step_End(12, "Select 'Yes' or 'No' for Copy To Previous.", test, test1);
		Step_Start(13, "Click on the \"Add\" button.", test, test1);
		waitForElement(driver, add_button_select);
		click(driver, add_button_select);
		Step_End(13, "Click on the \"Add\" button.", test, test1);
		Step_Start(14, "Press the save button in the toolbar.", test, test1);
		waitForElement(driver, kActivityDefinitionSave);
		click(driver,kActivityDefinitionSave);
		Step_End(14, "Press the save button in the toolbar.", test, test1);
		waitForElement(driver, kActivityDefinitionPopUp);
		String getpopup = getText(driver,kActivityDefinitionPopUp) ;
		if (getpopup.equals(updatedPopup)){
			System.out.println( "Matched || Expected value was : "+updatedPopup+" || Actual value was : "+getpopup);
			Extent_pass(driver, "Matched || Expected value was : "+updatedPopup+" || Actual value was : "+getpopup, test,test1);
		} else {
			System.out.println("NotMatched || Expected value was : "+updatedPopup+" || Actual value was : "+getpopup);
			Extent_fail(driver,  "NotMatched || Expected value was : "+updatedPopup+" || Actual value was : "+getpopup, test,test1);
		}
		Extent_call(test, test1, "Verufy the Added Value is Showing the grid or not");
		List<String> Column_Values = splitAndExpand(Column_Input);
		for(String Column_Value : Column_Values) {
			waitForElement(driver, column_Filter);
			sendKeys(driver, column_Filter, Column_Value);
			String Added_Column_Value = String.format(ActivityDefinition_Locators.Added_Column_Value,Column_Value);
			String Added_Data = getText(driver, Added_Column_Value);
			if(isDisplayed(driver, Added_Column_Value)) {
				System.out.println( "Matched || The Newly Added Activity code : "+Added_Data);
				Extent_pass(driver, "Matched || The Newly Added Activity code : "+Added_Data, test,test1);
			} else {
				System.out.println("NotMatched || "+Column_Value+"Activity Code Not Added");
				Extent_fail(driver,  "NotMatched || "+Column_Value+"Activity Code Not Added", test,test1);
			}
		}
		Extent_completed(testCase_Name, test, test1);
	}
}