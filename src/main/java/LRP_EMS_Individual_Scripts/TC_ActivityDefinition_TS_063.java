package LRP_EMS_Individual_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.ActivityDefinition_Locators;

public class TC_ActivityDefinition_TS_063 extends Keywords{

	public void ActivityDefinition_TS_063(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		String testCase_Name="TC_ActivityDefinition_TS_063";
		String File_Path_63 = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String Sheet_Name_063 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_063, testCase_Name, "Dataset"+selected_dataset, File_Path_63);		
		String Username = Excel_data.get("Userid");
		String pass_word = Excel_data.get("PassWord");
		String Field_Names = Excel_data.get("field_name");		
		String Activity_Code_Txt = Excel_data.get("Activity_Code_Txt");		
		String Column_Input = Excel_data.get("Column_Input");
		String Update_Input = Excel_data.get("Update_Input");
		String copy_From_Previous_Input = Excel_data.get("copy_From_Previous_Input");
		String copy_To_Previous_Input = Excel_data.get("copy_To_Previous_Input");
		String Validation_Type_Input = Excel_data.get("Validation_Type_Input");
		String Button = Excel_data.get("Button");
		String act_Def_updated_Popup_txt_Exp = Excel_data.get("Act_Def_updated_Popup_txt");
		String is_update_Value =String.format(ActivityDefinition_Locators.Updated_Value,Update_Input);
		String validation_Type = String.format(ActivityDefinition_Locators.Valid_Type_Value,Validation_Type_Input);
		String Copy_From_Value =String.format(ActivityDefinition_Locators.CMBCpy_Value_1,copy_From_Previous_Input);
		String Copy_Pre_Value = String.format(ActivityDefinition_Locators.CMBCpy_Value_2,copy_To_Previous_Input);
		String edit_button_select = String.format(ActivityDefinition_Locators.ADD_button_select,Button);
		String Condition =Excel_data.get("Condition");
		String Activity_Search_Column_Header =Excel_data.get("Activity_Search_Column_Header");

		Extent_Start(testCase_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, Username, pass_word);
		
		Extent_call(test, test1, "Enter module name in searchbox & click the module");
		moduleNavigate(driver, Field_Names);
		waitForElement(driver, Module2);
		String Modulename1 = getText(driver, Module2);
		System.out.println("ModuleName: "+Modulename1);
		if(Modulename1.equals(Field_Names)){
			Extent_pass(driver, "Matched || Expected selected module : "+Field_Names+" || Actual selected module : "+Modulename1, test, test1);
			System.out.println("Matched || Expected selected module : "+Field_Names+" || Actual selected module : "+Modulename1);
		}else{
			System.out.println("Not Matched || Expected selected module : "+Field_Names+" || Actual selected module : "+Modulename1);
			Extent_fail(driver, "Not Matched || Expected selected module : "+Field_Names+" || Actual selected module : "+Modulename1, test, test1);
		}
		Step_Start(1, "Click on the search Button.", test, test1);
		waitForElement(driver, kActivitySearch);
		click(driver,kActivitySearch);
		Step_End(1, "Click on the search Button.", test, test1);
		Step_Start(2, "Enter Activity code in the Search field.", test, test1);
		Step_End(2, "Enter Activity code in the Search field.", test, test1);
		Step_Start(3, "Click on the search Button.", test, test1);
		twoColumnSearchWindow(driver,Activity_Search_Column_Header, Condition, Activity_Code_Txt);
		Step_Start(3, "Click on the search Button.", test, test1);
		Step_Start(5, "Click on the \"Edit\" button from the toolbar.", test, test1);
		waitForElement(driver, kActivityDefinitionEdit);
		click(driver,kActivityDefinitionEdit);
		Step_End(5, "Click on the \"Edit\" button from the toolbar.", test, test1);
		Step_Start(4, "Double click on the Activity code.", test, test1);
		waitForElement(driver, column_Filter);
		sendKeys(driver, column_Filter, Column_Input);
		String Column_Value = String.format(ActivityDefinition_Locators.Column_Value,Column_Input);
		waitForElement(driver, Column_Value);
		doubleClick(driver, Column_Value);
		Step_End(4, "Double click on the Activity code.", test, test1);
		waitForElement(driver, kActivityDefinitionEdit);
		click(driver,kActivityDefinitionEdit);
		Step_Start(6, "Edit the Required Columns name Fields.", test, test1);
		if(!Update_Input.equals("")) {	
			waitForElement(driver, kActivityDefinitionIsUpdate);
			click(driver,kActivityDefinitionIsUpdate);
			waitForElement(driver, is_update_Value);
			click(driver, is_update_Value);
			Step_End(6, "Edit the Required Columns name Fields.", test, test1);
		}else if(!Validation_Type_Input.equals("")) {
			waitForElement(driver, kActivityDefinitionValidationType);
			click(driver,kActivityDefinitionValidationType);
			waitForElement(driver, validation_Type);
			click(driver, validation_Type);
			Step_End(6, "Edit the Required Columns name Fields.", test, test1);
		}else if(!copy_From_Previous_Input.equals("")) {
			waitForElement(driver, kActivityDefinitionCopyFromPrevious);
			click(driver,kActivityDefinitionCopyFromPrevious);
			waitForElement(driver, Copy_From_Value);
			click(driver, Copy_From_Value);
			Step_End(6, "Edit the Required Columns name Fields.", test, test1);
		}else if(!copy_To_Previous_Input.equals("")) {
			waitForElement(driver, kActivityDefinitionCopyToPrevious);
			click(driver,kActivityDefinitionCopyToPrevious);
			waitForElement(driver, Copy_Pre_Value);
			click(driver, Copy_Pre_Value);
			Step_End(6, "Edit the Required Columns name Fields.", test, test1);
		}else {
			System.out.println("There is no values in Excel  sheet for Update the Activity Definition");
		}
		Step_Start(7, "Click the edit button.", test, test1);
		waitForElement(driver, edit_button_select);
		click(driver, edit_button_select);
		Step_End(7, "Click the edit button.", test, test1);
		Step_Start(8, "Press the save button in the tool Bar.", test, test1);
		waitForElement(driver, kActivityDefinitionSave);
		click(driver,kActivityDefinitionSave);
		Step_End(8, "Press the save button in the tool Bar.", test, test1);
		waitForElement(driver, P_Act_Def_Updated_Popup);
		String updateMsg=getText(driver, P_Act_Def_Updated_Popup);
		if(act_Def_updated_Popup_txt_Exp.equals(updateMsg)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + act_Def_updated_Popup_txt_Exp + " || Actual Report Activity is : " + updateMsg);
			Extent_pass(driver,"Matched || " + " Expected Report Activity is : " + act_Def_updated_Popup_txt_Exp + " || Actual Report Activity is : " + updateMsg,test,test1);
		}else{
			System.out.println("Not Matched || " + " Expected Report Activity is : " + act_Def_updated_Popup_txt_Exp + " || Actual Report Activity is : " + updateMsg);
			Extent_fail(driver,"Not Matched || " + " Expected Report Activity is : " + act_Def_updated_Popup_txt_Exp + " || Actual Report Activity is : " + updateMsg,test,test1);
		}
		Extent_completed(testCase_Name, test, test1);
	}
}