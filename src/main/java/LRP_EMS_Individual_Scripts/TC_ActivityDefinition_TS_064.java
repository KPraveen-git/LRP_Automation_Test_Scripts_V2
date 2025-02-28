package LRP_EMS_Individual_Scripts;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Locators;

public class TC_ActivityDefinition_TS_064 extends Keywords{

	public void ActivityDefinition_TS_064(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		String testCase_Name="TC_ActivityDefinition_TS_064";
		String File_Path_64 = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String Sheet_Name_064 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		String URL = TestNgXml.getdatafromExecution().get(testCase_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_064, testCase_Name, "Dataset"+selected_dataset, File_Path_64);		
		String Username = Excel_data.get("Userid");
		String pass_word = Excel_data.get("PassWord");
		String Field_Names = Excel_data.get("field_name");		
		String Activity_Code_Txt = Excel_data.get("Activity_Code_Txt");		
		String Column_Input = Excel_data.get("Column_Input");
		String act_Def_Deleted_Popup_txt_Exp = Excel_data.get("Act_Def_Deleted_Popup_txt");
		String act_Def_Deleted_colour_txt_Exp = Excel_data.get("Act_Def_Deleted_colour");
		String ReActivate_Optioin =Excel_data.get("ReActivate_Optioin");
		String Matser_Module =Excel_data.get("Matser_Module");
		String Reactivation_Popup =Excel_data.get("Reactivation_Popup");
		String Condition =Excel_data.get("Condition");
		String Activity_Search_Column_Header =Excel_data.get("Activity_Search_Column_Header");
		String Module_Name_Column_Header =Excel_data.get("Module_Name_Column_Header");

		Extent_Start(testCase_Name, test, test1);
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
		Step_Start(1, "Click on the search Button.", test, test1);
		waitForElement(driver, kActivitySearch);
		click(driver,kActivitySearch);
		Step_End(1, "Click on the search Button.", test, test1);
		Step_Start(2, "Enter Activity code in the Search field.", test, test1);
		Step_End(2, "Enter Activity code in the Search field.", test, test1);
		Step_Start(3, "Double click on the Activity code.", test, test1);
		twoColumnSearchWindow(driver,Activity_Search_Column_Header, Condition, Activity_Code_Txt);
		
		Step_End(3, "Double click on the Activity code.", test, test1);

		List<String> Column_Values = splitAndExpand(Column_Input);
		for(String Column_Value : Column_Values) {
			waitForElement(driver, column_Filter);
			sendKeys(driver, column_Filter, Column_Value);
			Step_Start(4, "Double click the columns Name.", test, test1);
			String Added_Column_Value = String.format(AddedColumnValue,Column_Value);
			String Added_Data = getText(driver, Added_Column_Value);

			if(isDisplayed(driver, Added_Column_Value)) {
				System.out.println( "Matched || The Selected Activity code : "+Added_Data);
				Extent_pass(driver, "Matched || The Selected Activity code : "+Added_Data, test,test1);
				doubleClick(driver, Added_Column_Value);
				Step_Start(4, "Double click the columns Name.", test, test1);

				Step_Start(5, "Click on the \"delete\" button from the toolbar.", test, test1);
				waitForElement(driver, P_Delete_Btn);
				click1(driver, P_Delete_Btn);
				Step_End(5, "Click on the \"delete\" button from the toolbar.", test, test1);
				Step_Start(6, "Press 'Yes' in the Popup message to delete.", test, test1);
				waitForElement(driver, P_Deleted_PopUp);
				click1(driver, P_Deleted_PopUp_YesBtn);
				Step_End(6, "Press 'Yes' in the Popup message to delete.", test, test1);

				Extent_call(test, test1, "Check whether that system allows to delete the Activity Code Column name setup");
				waitForElement(driver, P_Act_Def_deleted_Popup);
				String deleted_Popup=getText(driver, P_Act_Def_deleted_Popup);
				if(act_Def_Deleted_Popup_txt_Exp.equals(deleted_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + act_Def_Deleted_Popup_txt_Exp + " || Actual Report Activity is : " + deleted_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + act_Def_Deleted_Popup_txt_Exp + " || Actual Report Activity is : " + deleted_Popup, test,test1);
					waitForElement(driver, column_Filter);
					sendKeys(driver, column_Filter, Column_Value);
					Extent_call(test, test1, "Check the Deleted Activity code Highlighted In Red Color");
					String deleted_Column_Value = String.format(EMS_Locators.deleted_Column_Value,Column_Value);
					String deleted_Column_color = getTextBackgroundColor(driver, deleted_Column_Value);
					System.out.println("deleted_Column_color : "+deleted_Column_color);
					if(deleted_Column_color.equals(act_Def_Deleted_colour_txt_Exp)) {
						System.out.println( "Matched || The Deleted Activity code : "+Column_Value+" And hihglighted in Red color"+deleted_Column_color);
						Extent_pass(driver, "Matched || The Deleted Activity code : "+Column_Value+" And hihglighted in Red color"+deleted_Column_color, test,test1);
					}else {
						System.out.println( "Not Matched || The Not Deleted Activity code : "+Column_Value+" And Not hihglighted in Red color"+deleted_Column_color);
						Extent_fail(driver, "Not Matched || The Not Deleted  Activity code : "+Column_Value+" And Not hihglighted in Red color"+deleted_Column_color, test,test1);
					}
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + act_Def_Deleted_Popup_txt_Exp + " || Actual Report Activity is : " + deleted_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + act_Def_Deleted_Popup_txt_Exp + " || Actual Report Activity is : " + deleted_Popup, test,test1);
				}
			} else {
				System.out.println("NotMatched || "+Column_Value+"Activity Code Not Added");
				Extent_fail(driver,  "NotMatched || "+Column_Value+"Activity Code Not Added", test,test1);

			}
		}
		if(ReActivate_Optioin.equalsIgnoreCase("Yes")) {
			waitForElement(driver, close_tab);
			click(driver, close_tab);
			Step_Start(5, "Open Master Reactivation screen", test, test1);
			moduleNavigate(driver, Matser_Module);
			
			
			Step_End(5, "Open Master Reactivation screen", test, test1);
			Step_Start(6, "Click on new button & press 'Yes' option", test, test1);
			waitForElement(driver, Master_Reactivation_New_Button);
			click(driver, Master_Reactivation_New_Button);
			
			waitForElement(driver, ID_Popup_Msg);
			waitForElement(driver, ID_Popup_Yes_Button);
			click(driver, ID_Popup_Yes_Button);
			Step_End(6, "Click on new button & press 'Yes' option", test, test1);
			
			
			Step_Start(7, "Click on module name icon", test, test1);
			waitForElement(driver, module_Nume_search_button_MR);
			click(driver, module_Nume_search_button_MR);
			Step_End(7, "Click on module name icon", test, test1);
			
			Step_Start(8, "Select Equipment Activity in module name", test, test1);
			twoColumnSearchWindow(driver,Module_Name_Column_Header, Condition, Field_Names);
			Step_End(8, "Select Equipment Activity in module name", test, test1);
			
			Step_Start(9, "Click show button", test, test1);
			waitForElement(driver, show_Button_MR);
			click(driver, show_Button_MR);
			Step_End(9, "Click show button", test, test1);
			Step_Start(10, "Select the deleted size/type", test, test1);
			waitForElement(driver, activity_Code_TF_MR);
			sendKeys(driver, activity_Code_TF_MR, Column_Input);
			waitForElement(driver, activity_Code_Select_MR);
			click(driver, activity_Code_Select_MR);
			Step_End(10, "Select the deleted size/type", test, test1);
			Step_Start(11, "Click on reactivate button", test, test1);
			waitForElement(driver, reactive_Button_MR);
			click(driver, reactive_Button_MR);
			
			Step_End(11, "Click on reactivate button", test, test1);
			
			Step_Start(12, "System will show message as  Equipment Master Reactivated successfully & then click Ok", test, test1);
			waitForElement(driver, ID_Popup_Msg);
			String  reactivationpopup = getText(driver, ID_Popup_Msg);
			if (Reactivation_Popup.equals(reactivationpopup)) {

				System.out.println("Matched || Expected value was : " + Reactivation_Popup + " || Actual value was : " + reactivationpopup);
				Extent_pass(driver, "Matched || Expected value was : " + Reactivation_Popup + " || Actual value was : " + reactivationpopup,
						test, test1);
				click(driver, ID_Popup_Ok_Button);
			} else {
				System.out.println(
						"NotMatched || Expected value was : " + Reactivation_Popup + " || Actual value was : " + reactivationpopup);
				Extent_fail(driver,
						"NotMatched || Expected value was : " + Reactivation_Popup + " || Actual value was : " + reactivationpopup, test,
						test1);
			}
			
			Step_End(12, "System will show message as  Equipment Master Reactivated successfully & then click Ok", test, test1);
			
			waitForElement(driver, close_tab);
			click(driver, close_tab);
			Step_Start(13, "Open Equipment activity screen & then verify that reactivated size/type showing in screen in Activity code filter option", test, test1);
			moduleNavigate(driver, Field_Names);
			waitForElement(driver, kActivitySearch);
			click(driver,kActivitySearch);
			twoColumnSearchWindow(driver,Activity_Search_Column_Header, Condition, Activity_Code_Txt);
			Column_Values = splitAndExpand(Column_Input);
			for(String Column_Value : Column_Values) {
				waitForElement(driver, column_Filter);
				sendKeys(driver, column_Filter, Column_Value);
				String Added_Column_Value = String.format(EMS_Locators.Added_Column_Value,Column_Value);
				String Added_Data = getText(driver, Added_Column_Value);
				if(isDisplayed(driver, Added_Column_Value)) {
					System.out.println( "Matched || The ReActivated Activity code : "+Added_Data);
					Extent_pass(driver, "Matched || The ReActivated Activity code : "+Added_Data, test,test1);
				} else {
					System.out.println("NotMatched || "+Column_Value+"Activity Code Not ReActivated");
					Extent_fail(driver,  "NotMatched || "+Column_Value+"Activity Code Not ReActivated", test,test1);
				}
			}
			Step_End(13, "Open Equipment activity screen & then verify that reactivated size/type showing in screen in Activity code filter option", test, test1);

		}
		Extent_completed(testCase_Name, test, test1);
	}
}