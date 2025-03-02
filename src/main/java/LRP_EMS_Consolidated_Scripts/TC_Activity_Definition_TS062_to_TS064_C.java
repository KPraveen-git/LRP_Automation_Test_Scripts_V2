package LRP_EMS_Consolidated_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Activity_Definition_TS062_to_TS064_C extends Keywords{

	public void Activity_Definition_TS062_to_TS064_C(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		int i=1;
		if(i==1) {
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
			String update_value =String.format(Updated_Value,Update_Input);
			String valid_Type = String.format(Valid_Type_Value,Validation_Type_Input);
			String CmbCpy_Value_1 =String.format(CMBCpy_Value_1,copy_From_Previous_Input);
			String CmbCpy_Value_2 = String.format(CMBCpy_Value_2,copy_To_Previous_Input);
			String Add_button_select = String.format(ADD_button_select,Button);
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
			waitForElement(driver, update_value);
			click(driver, update_value);
			Step_End (6, "Select 'Yes' or 'No' for Is update.", test, test1);

			Step_Start(7, "Click on the \"Validation Type\" dropdown", test, test1);
			waitForElement(driver, kActivityDefinitionValidationType);
			click(driver,kActivityDefinitionValidationType);
			Step_End(7, "Click on the \"Validation Type\" dropdown", test, test1);
			Step_Start(8, "Select 'V' in the Validation type.", test, test1);
			waitForElement(driver, valid_Type);
			click(driver, valid_Type);
			Step_End(8, "Select 'V' in the Validation type.", test, test1);
			Step_Start(9, "Click on the \"Copy From Previous\" dropdown.", test, test1);

			waitForElement(driver, kActivityDefinitionCopyFromPrevious);
			click(driver,kActivityDefinitionCopyFromPrevious);
			Step_End(9, "Click on the \"Copy From Previous\" dropdown.", test, test1);
			Step_Start(10, "Select 'Yes' or 'No' for Copy From Previous.", test, test1);
			waitForElement(driver, CmbCpy_Value_1);
			click(driver, CmbCpy_Value_1);
			Step_End(10, "Select 'Yes' or 'No' for Copy From Previous.", test, test1);
			Step_Start(11, "Click on the \"Copy To Previous\" dropdown.", test, test1);
			waitForElement(driver, kActivityDefinitionCopyToPrevious);
			click(driver,kActivityDefinitionCopyToPrevious);
			Step_End(11, "Click on the \"Copy To Previous\" dropdown.", test, test1);
			Step_Start(12, "Select 'Yes' or 'No' for Copy To Previous.", test, test1);
			waitForElement(driver, CmbCpy_Value_2);
			click(driver, CmbCpy_Value_2);
			Step_End(12, "Select 'Yes' or 'No' for Copy To Previous.", test, test1);
			Step_Start(13, "Click on the \"Add\" button.", test, test1);
			waitForElement(driver, Add_button_select);
			click(driver, Add_button_select);
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
				String added_Column_Value = String.format(Added_Column_Value,Column_Value);
				String Added_Data = getText(driver, added_Column_Value);
				if(isDisplayed(driver, added_Column_Value)) {
					System.out.println( "Matched || The Newly Added Activity code : "+Added_Data);
					Extent_pass(driver, "Matched || The Newly Added Activity code : "+Added_Data, test,test1);
				} else {
					System.out.println("NotMatched || "+Column_Value+"Activity Code Not Added");
					Extent_fail(driver,  "NotMatched || "+Column_Value+"Activity Code Not Added", test,test1);
				}
			}
			Extent_completed(testCase_Name, test, test1);
			scrollTop(driver);
			waitForElement(driver, close_tab);
			click(driver, close_tab);
		}
		if(i==1) {
			String testCase_Name="TC_ActivityDefinition_TS_063";
			String File_Path_63 = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_063 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_063, testCase_Name, "Dataset"+selected_dataset, File_Path_63);		
			String Field_Names = Excel_data.get("field_name");		
			String Activity_Code_Txt = Excel_data.get("Activity_Code_Txt");		
			String Column_Input = Excel_data.get("Column_Input");
			String Update_Input = Excel_data.get("Update_Input");
			String copy_From_Previous_Input = Excel_data.get("copy_From_Previous_Input");
			String copy_To_Previous_Input = Excel_data.get("copy_To_Previous_Input");
			String Validation_Type_Input = Excel_data.get("Validation_Type_Input");
			String Button = Excel_data.get("Button");
			String act_Def_updated_Popup_txt_Exp = Excel_data.get("Act_Def_updated_Popup_txt");
			String is_update_Value =String.format(Updated_Value,Update_Input);
			String validation_Type = String.format(Valid_Type_Value,Validation_Type_Input);
			String Copy_From_Value =String.format(CMBCpy_Value_1,copy_From_Previous_Input);
			String Copy_Pre_Value = String.format(CMBCpy_Value_2,copy_To_Previous_Input);
			String edit_button_select = String.format(ADD_button_select,Button);
			String Condition =Excel_data.get("Condition");
			String Activity_Search_Column_Header =Excel_data.get("Activity_Search_Column_Header");

			Extent_Start(testCase_Name, test, test1);

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
			String column_Value = String.format(Column_Value,Column_Input);
			waitForElement(driver, column_Value);
			doubleClick(driver, column_Value);
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
			scrollTop(driver);
			waitForElement(driver, close_tab);
			click(driver, close_tab);
		}
		if(i==1) {
			String testCase_Name="TC_ActivityDefinition_TS_064";
			String File_Path_64 = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_064 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_064, testCase_Name, "Dataset"+selected_dataset, File_Path_64);		
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
				String added_Column_Value = String.format(AddedColumnValue,Column_Value);
				String Added_Data = getText(driver, added_Column_Value);

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
						String Deleted_Column_Value = String.format(deleted_Column_Value,Column_Value);
						String deleted_Column_color = getTextBackgroundColor(driver, Deleted_Column_Value);
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
					String added_Column_Value = String.format(Added_Column_Value,Column_Value);
					String Added_Data = getText(driver, added_Column_Value);
					if(isDisplayed(driver, added_Column_Value)) {
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

}
