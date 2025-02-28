package LRP_EMS_Individual_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Locators;

public class TC_Equipment_Master_TS052 extends Keywords{
	
	public void Equipment_Master_TS052(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		String testCase_Name="TC_Equipment_Master_TS052";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		String Sheet_Name_052 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_052, testCase_Name, "Dataset"+selected_dataset, File_Path);
		String user_Name =Excel_data.get("Userid");
		String pass_word =Excel_data.get("PassWord");
		String Field_Names =Excel_data.get("field_name");
		String equip_Type =Excel_data.get("equip_Type");
		String Equipment_deleted_Popup_Txt_Exp =Excel_data.get("Equipment_deleted_Popup_Txt");
		String No_Records_Found_Popup_Txt_Exp =Excel_data.get("No_Records_Found_Popup_Txt");
		String ReActivate_Optioin =Excel_data.get("ReActivate_Optioin");
		String Matser_Module =Excel_data.get("Matser_Module");
		String Reactivation_Popup =Excel_data.get("Reactivation_Popup");
		String newlyAddedEquipment=String.format(EMS_Locators.newlyAddedEquipment,equip_Type);
		String Condition =Excel_data.get("Condition");
		String Module_Name_Column_Header =Excel_data.get("Module_Name_Column_Header");
		String Global_Search_Type =Excel_data.get("Global_Search_Type");
		String Global_Search_Condition =Excel_data.get("Global_Search_Condition");
		
		//navigate the Url
		Extent_Start(testCase_Name, test, test1);
		navigateUrl(driver, url);
		//Login
		LRP_Login(driver, user_Name, pass_word);
		Extent_call(test, test1, "Enter module name in searchbox & click the module");
		//Enter Equipment Master Module
		moduleNavigate(driver, Field_Names);
		waitForElement(driver, P_equipmentMaster_Page);
		if(isDisplayed(driver, P_equipmentMaster_Page)) {
			System.out.println("*****Equipment Master Module is Dispalyed*****");
			Extent_pass(driver, "*****Equipment Master Module is Dispalyed*****", test,test1);
		}else {
			System.out.println("*****Equipment Master Module is not Dispalyed*****");
			Extent_fail(driver, "*****Equipment Master Module is not Dispalyed*****", test,test1);
		}

		Step_Start(1, "Double click the size/type", test, test1);	
	
		waitForElement(driver, P_Equip_Size_Menu);
		click(driver, P_Equip_Size_Menu);
		waitForElement(driver, Equip_Size_Filter);
		click(driver, Equip_Size_Filter);
		waitForElement(driver, P_Equip_Filter_CheckBox);
		click(driver, P_Equip_Filter_CheckBox);
	
		waitForElement(driver, P_Equip_Filter_Search);
		sendKeys(driver, P_Equip_Filter_Search, equip_Type);
		waitForElement(driver, P_Filter_First_Value);
		click(driver, P_Filter_First_Value);
	
		waitForElement(driver, P_equipmentType_TxtField);
		click(driver, P_equipmentType_TxtField);
	
		waitForElement(driver, P_First_Equip_Type);
		doubleClick(driver, P_First_Equip_Type);
		Step_End(1, "Double click the size/type", test, test1);

		Step_Start(2, "Click delete icon from toolbar", test, test1);	
	
		waitForElement(driver, P_Delete_Btn);
		click(driver, P_Delete_Btn);
		Step_End(2, "Click delete icon from toolbar", test, test1);

		Step_Start(3, "Click 'Yes' while confirming for Do you want to delete", test, test1);	
		waitForElement(driver, P_Deleted_PopUp);
		click(driver, P_Deleted_PopUp_YesBtn);
		Step_End(3, "Click 'Yes' while confirming for Do you want to delete", test, test1);

		Step_Start(3, "Message will be shown as deleted", test, test1);	
		waitForElement(driver, PopUp);
		String deletedMsg =getText(driver, PopUp);
		Step_End(3, "Message will be shown as deleted", test, test1);
		
		if(Equipment_deleted_Popup_Txt_Exp.equals(deletedMsg)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_deleted_Popup_Txt_Exp + " || Actual Report Activity is : " + deletedMsg);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_deleted_Popup_Txt_Exp + " || Actual Report Activity is : " + deletedMsg, test,test1);
		}else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_deleted_Popup_Txt_Exp + " || Actual Report Activity is : " + deletedMsg);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_deleted_Popup_Txt_Exp + " || Actual Report Activity is : " + deletedMsg, test,test1);
		}
		
		waitForElement(driver, P_Global_Search);
		click(driver, P_Global_Search);
		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, Global_Search_Type);
		selectByText(driver, globalSearch_Condition_Dropdown1, Global_Search_Condition);
		sendKeys(driver, globalSearch_InputTextfield1, equip_Type);
		click(driver, globalSearch_Frame_SearchButton);
		waitForElement(driver, PopUp);
		String noRecordPopup = getText(driver, PopUp);
		if(No_Records_Found_Popup_Txt_Exp.equals(noRecordPopup)){
			System.out.println("Matched || " + " Expected Report Activity is : " + No_Records_Found_Popup_Txt_Exp + " || Actual Report Activity is : " + noRecordPopup);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + No_Records_Found_Popup_Txt_Exp + " || Actual Report Activity is : " + noRecordPopup, test,test1);
		}else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + No_Records_Found_Popup_Txt_Exp + " || Actual Report Activity is : " + noRecordPopup);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + No_Records_Found_Popup_Txt_Exp + " || Actual Report Activity is : " + noRecordPopup, test,test1);
		}
		waitForElement(driver, P_Global_Search_Close);
		click(driver, P_Global_Search_Close);
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
			sendKeys(driver, activity_Code_TF_MR, equip_Type);
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
			waitForElement(driver, P_Global_Search);
			click(driver, P_Global_Search);
			waitForElement(driver, type_Select1);
			selectByText(driver, type_Select1, Global_Search_Type);
			selectByText(driver, globalSearch_Condition_Dropdown1, Global_Search_Condition);
			sendKeys(driver, globalSearch_InputTextfield1, equip_Type);
			click(driver, globalSearch_Frame_SearchButton);
			
			String newlyAddedEquipmentText = getText(driver, newlyAddedEquipment);
			if(equip_Type.equals(newlyAddedEquipmentText)) {
				System.out.println("Matched || The Equipment Master Equipment Type is ReActivated || Expected Report Activity is : " + equip_Type + " || Actual Report Activity is : " + newlyAddedEquipmentText);
				Extent_pass(driver, "Matched || The Equipment Master Equipment Type is ReActivated || Expected Report Activity is : " + equip_Type + " || Actual Report Activity is : " + newlyAddedEquipmentText, test,test1);
			}
			else {
				System.out.println("Not Matched || The Equipment Master Equipment Type is Not || ReActivated Expected Report Activity is : " + equip_Type + " || Actual Report Activity is : " + newlyAddedEquipmentText);
				Extent_fail(driver, "Not Matched || The Equipment Master Equipment Type is Not || ReActivated Expected Report Activity is : " + equip_Type + " || Actual Report Activity is : " + newlyAddedEquipmentText, test,test1);
			}
			waitForElement(driver, retrivedGlobalValue);	
			click(driver, retrivedGlobalValue);
			
			waitForElement(driver, P_Global_Sel_Btn);
			click(driver, P_Global_Sel_Btn);
			
			Step_End(13, "Open Equipment activity screen & then verify that reactivated size/type showing in screen in Activity code filter option", test, test1);
		}
		Extent_completed(testCase_Name, test, test1);
	}
}
