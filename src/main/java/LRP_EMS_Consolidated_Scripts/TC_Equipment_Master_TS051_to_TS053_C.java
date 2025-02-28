package LRP_EMS_Consolidated_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Locators;

public class TC_Equipment_Master_TS051_to_TS053_C extends Keywords {



	public void Equipment_Master_TS051_to_TS053_C(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		int i=1;
		if(i==1) {
			String testCase_Name="TC_Equipment_Master_TS051";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_051 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);

			String url = TestNgXml.getdatafromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_051, testCase_Name, "Dataset"+selected_dataset, File_Path);
			String user_Name =Excel_data.get("Userid");
			String pass_word =Excel_data.get("PassWord");
			String Field_Names =Excel_data.get("field_name");
			String equipment_Desc_Input_Txt =Excel_data.get("Equipment_Desc_Input");
			String tare_Input_Txt =Excel_data.get("Tare_Input");
			String breakBulk_DropDown_Input_Txt =Excel_data.get("BreakBulk_DropDown_Input");
			String Chassis_DropDown_Input_Txt =Excel_data.get("Chassis_DropDown_Input_Txt");
			String Special_Chassis_ChkBox =Excel_data.get("Special_Chassis_ChkBox");
			String equipmentType_DropDown_Input_Txt =Excel_data.get("EquipmentType_DropDown_Input");
			String max_Gross_Input_Txt =Excel_data.get("Max_Gross_Input");
			String fleet_DropDown_Input_Txt =Excel_data.get("Fleet_DropDown_Input");
			String length_Input_Txt =Excel_data.get("Length_Input");
			String hight_Input_Txt =Excel_data.get("Hight_Input");
			String width_Input_Txt =Excel_data.get("Width_Input");
			String volume_Input_Txt =Excel_data.get("Volume_Input");
			String mesurement_DropDown_Input_Txt =Excel_data.get("Mesurement_DropDown_Input");
			String teus_DropDown_Input_Txt =Excel_data.get("Teus_DropDown_Input");
			String commercialType_DropDown_Input_Txt =Excel_data.get("CommercialType_DropDown_Input");
			String contractType_DropDown_Input_Txt =Excel_data.get("contractType_DropDown_Input_Txt");
			String dG_Class_DropDown_Input_Txt =Excel_data.get("DG_Class_DropDown_Input");
			String eMS_Type_DropDown_Input_Txt =Excel_data.get("EMS_Type_DropDown_Input");
			String eMS_Group_DropDown_Input_Txt =Excel_data.get("EMS_Group_DropDown_Input");
			String Equipment_Saved_Popup_Txt_Exp =Excel_data.get("Equipment_Saved_Popup_Txt");
			String Equipment_Exists_Popup_Txt =Excel_data.get("Equipment_Exists_Popup_Txt");
			String equip_Type =Excel_data.get("equip_Type");
			String Global_Search_Type =Excel_data.get("Global_Search_Type");
			String Global_Search_Condition =Excel_data.get("Global_Search_Condition");

			String chassisSel =String.format(EMS_Locators.chassisSel,Chassis_DropDown_Input_Txt);
			String breakBulkSel=String.format(EMS_Locators.breakBulkSel,breakBulk_DropDown_Input_Txt);
			String equipTypeSel=String.format(EMS_Locators.equipTypeSel,equipmentType_DropDown_Input_Txt);
			String fleetSel=String.format(EMS_Locators.fleetSel,fleet_DropDown_Input_Txt);
			String mesurementSel=String.format(EMS_Locators.mesurementSel,mesurement_DropDown_Input_Txt);
			String teusSel=String.format(EMS_Locators.teusSel,teus_DropDown_Input_Txt);
			String commercialTypeSel=String.format(EMS_Locators.commercialTypeSel,commercialType_DropDown_Input_Txt);
			String contractTypeSel=String.format(EMS_Locators.contractTypeSel,contractType_DropDown_Input_Txt);
			String dgClassSel=String.format(EMS_Locators.dgClassSel,dG_Class_DropDown_Input_Txt);
			String emsTypeSel=String.format(EMS_Locators.emsTypeSel,eMS_Type_DropDown_Input_Txt);
			String emsGroupSel=String.format(EMS_Locators.emsGroupSel,eMS_Group_DropDown_Input_Txt);
			String newlyAddedEquipment=String.format(EMS_Locators.newlyAddedEquipment,equip_Type);

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
			Step_Start(1, "Enter valid Size/Type in Equipment size/type field", test, test1);
			waitForElement(driver, P_equipmentType_TxtField);
			click(driver, P_equipmentType_TxtField);
			waitForElement(driver, P_equipmentType_TxtField);
			System.out.println("Equipment Type or Size : "+equip_Type);
			clearAndType(driver, P_equipmentType_TxtField, equip_Type);
			Step_End(1, "Enter valid Size/Type in Equipment size/type field", test, test1);

			Step_Start(2, "Enter Description in Equipment Desc field", test, test1);
			waitForElement(driver, P_equipmentDesc_TxtField);
			click(driver, P_equipmentDesc_TxtField);
			waitForElement(driver, P_equipmentDesc_TxtField);
			clearAndType(driver, P_equipmentDesc_TxtField, equipment_Desc_Input_Txt);
			Step_End(2, "Enter Description in Equipment Desc field", test, test1);

			Step_Start(3, "Enter tare weight in Tare field", test, test1);
			waitForElement(driver, P_tare_TxtField);
			click(driver, P_tare_TxtField);
			waitForElement(driver, P_tare_TxtField);
			clearAndType(driver, P_tare_TxtField, tare_Input_Txt);
			Step_End(3, "Enter tare weight in Tare field", test, test1);

			if(Chassis_DropDown_Input_Txt.equalsIgnoreCase("YES")) {
				waitForElement(driver, P_Chasis_DropDown);
				click(driver, P_Chasis_DropDown);

				waitForElement(driver, chassisSel);
				click(driver, chassisSel);

				waitForElement(driver, P_Special_Chessis_CheckBox);
				checkBox(driver, P_Special_Chessis_CheckBox, Special_Chassis_ChkBox);
			}

			Step_Start(4, "Select anyone option from Breakbulk dropmenu", test, test1);
			waitForElement(driver, P_breakBulk_DropDown);
			click(driver, P_breakBulk_DropDown);

			waitForElement(driver, breakBulkSel);
			click(driver, breakBulkSel);
			Step_End(4, "Select anyone option from Breakbulk dropmenu", test, test1);

			Step_Start(5, "Select anyone option from Equipment type dropmenu", test, test1);
			waitForElement(driver, P_equipmentType_DropDown);
			click(driver, P_equipmentType_DropDown);

			waitForElement(driver, equipTypeSel);
			click(driver, equipTypeSel);
			Step_End(5, "Select anyone option from Equipment type dropmenu", test, test1);



			Step_Start(6, "Enter gross weight in maximum gross field", test, test1);
			waitForElement(driver, P_Max_Gross_TxtField);
			click(driver, P_Max_Gross_TxtField);
			waitForElement(driver, P_Max_Gross_TxtField);
			clearAndType(driver, P_Max_Gross_TxtField, max_Gross_Input_Txt);
			Step_End(6, "Enter gross weight in maximum gross field", test, test1);



			Step_Start(7, "Select fleet option accordingly", test, test1);
			waitForElement(driver, P_Fleet_DropDown);
			click(driver, P_Fleet_DropDown);

			waitForElement(driver, fleetSel);
			click(driver, fleetSel);
			Step_End(7, "Select fleet option accordingly", test, test1);

			Step_Start(8, "Enter length, height, width, volume correctly", test, test1);
			waitForElement(driver, P_Length_TxtField);
			click(driver, P_Length_TxtField);
			waitForElement(driver, P_Length_TxtField);
			clearAndType(driver, P_Length_TxtField, length_Input_Txt);

			waitForElement(driver, P_Hight_TxtField);
			click(driver, P_Hight_TxtField);
			waitForElement(driver, P_Hight_TxtField);
			clearAndType(driver, P_Hight_TxtField, hight_Input_Txt);

			waitForElement(driver, P_Width_TxtField);
			click(driver, P_Width_TxtField);
			waitForElement(driver, P_Width_TxtField);
			clearAndType(driver, P_Width_TxtField, width_Input_Txt);

			if(!volume_Input_Txt.equalsIgnoreCase("")) {
				waitForElement(driver, P_Volume_TxtField);
				click(driver, P_Volume_TxtField);
				waitForElement(driver, P_Volume_TxtField);
				clearAndType(driver, P_Volume_TxtField, volume_Input_Txt);
				Step_End(8, "Enter length, height, width, volume correctly", test, test1);

			}
			Step_Start(9, "Select Measurement option, teus and commercial type correctly", test, test1);	
			waitForElement(driver, P_Mesurement_DropDown);
			click(driver, P_Mesurement_DropDown);

			waitForElement(driver, mesurementSel);
			click(driver, mesurementSel);

			waitForElement(driver, P_Teus_DropDown);
			click(driver, P_Teus_DropDown);

			waitForElement(driver, teusSel);
			click(driver, teusSel);

			waitForElement(driver, P_CommercialType_DropDown);
			click(driver, P_CommercialType_DropDown);

			waitForElement(driver, commercialTypeSel);
			click(driver, commercialTypeSel);
			Step_End(9, "Select Measurement option, teus and commercial type correctly", test, test1);

			if(!contractType_DropDown_Input_Txt.equals("")) {
				Step_Start(10, "Select DG Classification and EMS group correctly", test, test1);	
				waitForElement(driver, Ems_Contract_DropDown);
				click(driver, Ems_Contract_DropDown);
				waitForElement(driver, contractTypeSel);
				click(driver, contractTypeSel);
			}

			waitForElement(driver, P_DG_Class_DropDown);
			click(driver, P_DG_Class_DropDown);

			waitForElement(driver, dgClassSel);
			click(driver, dgClassSel);


			if(!eMS_Type_DropDown_Input_Txt.equals("")) {
				waitForElement(driver, P_EMS_Type_DropDown);
				click(driver, P_EMS_Type_DropDown);

				waitForElement(driver, emsTypeSel);
				click(driver, emsTypeSel);
			}
			waitForElement(driver, P_EMS_Group_DropDown);
			click(driver, P_EMS_Group_DropDown);

			waitForElement(driver, emsGroupSel);
			click(driver, emsGroupSel);
			Step_End(10, "Select DG Classification and EMS group correctly", test, test1);


			Step_Start(11, "Click save button and message shown as saved successfully", test, test1);	
			waitForElement(driver, P_Save_Btn);
			click(driver, P_Save_Btn);
			waitForElement(driver, PopUp);
			String savedMsg =getText(driver, PopUp);
			Step_End(11, "Click save button and message shown as saved successfully", test, test1);


			if(Equipment_Saved_Popup_Txt_Exp.equals(savedMsg)) {
				System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_Saved_Popup_Txt_Exp + " || Actual Report Activity is : " + savedMsg);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_Saved_Popup_Txt_Exp + " || Actual Report Activity is : " + savedMsg, test,test1);
			}else if(Equipment_Exists_Popup_Txt.equals(savedMsg)) {
				System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_Exists_Popup_Txt + " || Actual Report Activity is : " + savedMsg);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_Exists_Popup_Txt + " || Actual Report Activity is : " + savedMsg, test,test1);
			}else {
				System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_Saved_Popup_Txt_Exp + " || Actual Report Activity is : " + savedMsg);
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_Saved_Popup_Txt_Exp + " || Actual Report Activity is : " + savedMsg, test,test1);
			}
			waitForElement(driver, P_Global_Search);
			click(driver, P_Global_Search);
			waitForElement(driver, type_Select1);
			selectByText(driver, type_Select1, Global_Search_Type);
			selectByText(driver, globalSearch_Condition_Dropdown1, Global_Search_Condition);
			sendKeys(driver, globalSearch_InputTextfield1, equip_Type);
			click(driver, globalSearch_Frame_SearchButton);
			waitForElement(driver, newlyAddedEquipment);
			String newlyAddedEquipmentText = getText(driver, newlyAddedEquipment);
			if(equip_Type.equals(newlyAddedEquipmentText)) {
				System.out.println("Matched || " + " Expected Report Activity is : " + equip_Type + " || Actual Report Activity is : " + newlyAddedEquipmentText);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + equip_Type + " || Actual Report Activity is : " + newlyAddedEquipmentText, test,test1);
			}
			else {
				System.out.println("Not Matched || " + " Expected Report Activity is : " + equip_Type + " || Actual Report Activity is : " + newlyAddedEquipmentText);
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + equip_Type + " || Actual Report Activity is : " + newlyAddedEquipmentText, test,test1);
			}
			waitForElement(driver, retrivedGlobalValue);	
			click(driver, retrivedGlobalValue);
			waitForElement(driver, P_Global_Sel_Btn);
			click(driver, P_Global_Sel_Btn);
			Extent_completed(testCase_Name, test, test1);

			scrollTop(driver);
			waitForElement(driver, P_Equip_Mas_Cancel_Btn);
			click(driver, P_Equip_Mas_Cancel_Btn);
		}
		if(i==1) {
			String testCase_Name="TC_Equipment_Master_TS052";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_052 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_052, testCase_Name, "Dataset"+selected_dataset, File_Path);
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
			//Login
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
			scrollTop(driver);
			waitForElement(driver, P_Equip_Mas_Cancel_Btn);
			click(driver, P_Equip_Mas_Cancel_Btn);
		}

		if(i==1) {
			String testCase_Name="TC_Equipment_Master_TS053";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_053 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_053, testCase_Name, "Dataset"+selected_dataset, File_Path);
			String Field_Names =Excel_data.get("field_name");
			String equip_Type =Excel_data.get("equip_Type");
			String Equipment_updated_Popup_Txt_Exp= Excel_data.get("Equipment_updated_Popup_Txt");
			String equipment_Desc_Input_Txt =Excel_data.get("Equipment_Desc_Input");
			String tare_Input_Txt =Excel_data.get("Tare_Input");
			String equipmentType_DropDown_Input_Txt =Excel_data.get("EquipmentType_DropDown_Input");
			String max_Gross_Input_Txt =Excel_data.get("Max_Gross_Input");
			String fleet_DropDown_Input_Txt =Excel_data.get("Fleet_DropDown_Input");
			String length_Input_Txt =Excel_data.get("Length_Input");
			String hight_Input_Txt =Excel_data.get("Hight_Input");
			String width_Input_Txt =Excel_data.get("Width_Input");
			String volume_Input_Txt =Excel_data.get("Volume_Input");
			String mesurement_DropDown_Input_Txt =Excel_data.get("Mesurement_DropDown_Input");
			String teus_DropDown_Input_Txt =Excel_data.get("Teus_DropDown_Input");
			String commercialType_DropDown_Input_Txt =Excel_data.get("CommercialType_DropDown_Input");
			String contractType_DropDown_Input_Txt =Excel_data.get("contractType_DropDown_Input_Txt");
			String dG_Class_DropDown_Input_Txt =Excel_data.get("DG_Class_DropDown_Input");
			String eMS_Type_DropDown_Input_Txt =Excel_data.get("EMS_Type_DropDown_Input");
			String eMS_Group_DropDown_Input_Txt =Excel_data.get("EMS_Group_DropDown_Input");
			String before_Update_Value="";
			String after_Update_value="";
			String equipTypeSel=String.format(EMS_Locators.equipTypeSel,equipmentType_DropDown_Input_Txt);
			String fleetSel=String.format(EMS_Locators.fleetSel,fleet_DropDown_Input_Txt);
			String mesurementSel=String.format(EMS_Locators.mesurementSel,mesurement_DropDown_Input_Txt);
			String teusSel=String.format(EMS_Locators.teusSel,teus_DropDown_Input_Txt);
			String commercialTypeSel=String.format(EMS_Locators.commercialTypeSel,commercialType_DropDown_Input_Txt);
			String contractTypeSel=String.format(EMS_Locators.contractTypeSel,contractType_DropDown_Input_Txt);
			String dgClassSel=String.format(EMS_Locators.dgClassSel,dG_Class_DropDown_Input_Txt);
			String emsTypeSel=String.format(EMS_Locators.emsTypeSel,eMS_Type_DropDown_Input_Txt);
			String emsGroupSel=String.format(EMS_Locators.emsGroupSel,eMS_Group_DropDown_Input_Txt);

			Extent_Start(testCase_Name, test, test1);
			//Login
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


			if(!equipment_Desc_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);

				waitForElement(driver, P_equipmentDesc_TxtField);
				before_Update_Value=getAttribute(driver, P_equipmentDesc_TxtField,"value");
				System.out.println("before_Update_Value  : "+ before_Update_Value);

				click(driver, P_equipmentDesc_TxtField);
				waitForElement(driver, P_equipmentDesc_TxtField);
				clearAndType(driver, P_equipmentDesc_TxtField, equipment_Desc_Input_Txt);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);
				Step_End(3, "Click Save button", test, test1);

				waitForElement(driver, P_equipmentDesc_TxtField);
				after_Update_value=getAttribute(driver, P_equipmentDesc_TxtField,"value");
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!tare_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_tare_TxtField);
				before_Update_Value=getAttribute(driver, P_tare_TxtField,"value");

				click(driver, P_tare_TxtField);
				waitForElement(driver, P_tare_TxtField);
				clearAndType(driver, P_tare_TxtField, tare_Input_Txt);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);
				Step_End(3, "Click Save button", test, test1);

				waitForElement(driver, P_tare_TxtField);
				after_Update_value=getAttribute(driver, P_tare_TxtField,"value");
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}
				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!equipmentType_DropDown_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_equipmentType_DropDown);
				before_Update_Value=getText(driver, P_equipmentType_DropDown);

				click(driver, P_equipmentType_DropDown);

				waitForElement(driver, equipTypeSel);
				click(driver, equipTypeSel);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);


				waitForElement(driver, P_equipmentType_DropDown);
				after_Update_value=getText(driver, P_equipmentType_DropDown);
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!max_Gross_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_Max_Gross_TxtField);
				before_Update_Value=getAttribute(driver, P_Max_Gross_TxtField,"value");

				click(driver, P_Max_Gross_TxtField);
				waitForElement(driver, P_Max_Gross_TxtField);
				clearAndType(driver, P_Max_Gross_TxtField, max_Gross_Input_Txt);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);


				waitForElement(driver, P_Max_Gross_TxtField);
				after_Update_value=getAttribute(driver, P_Max_Gross_TxtField,"value");
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}
				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!fleet_DropDown_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_Fleet_DropDown);
				before_Update_Value=getText(driver, P_Fleet_DropDown);
				click(driver, P_Fleet_DropDown);
				waitForElement(driver, fleetSel);
				click(driver, fleetSel);
				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);
				Step_End(3, "Click Save button", test, test1);


				waitForElement(driver, P_Fleet_DropDown);
				after_Update_value=getText(driver, P_Fleet_DropDown);
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}
				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!length_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_Length_TxtField);
				before_Update_Value=getAttribute(driver, P_Length_TxtField,"value");

				click(driver, P_Length_TxtField);
				waitForElement(driver, P_Length_TxtField);
				clearAndType(driver, P_Length_TxtField, length_Input_Txt);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);

				waitForElement(driver, P_Length_TxtField);
				after_Update_value=getAttribute(driver, P_Length_TxtField,"value");
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!hight_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_Hight_TxtField);
				before_Update_Value=getAttribute(driver, P_Hight_TxtField,"value");

				click(driver, P_Hight_TxtField);
				waitForElement(driver, P_Hight_TxtField);
				clearAndType(driver, P_Hight_TxtField, hight_Input_Txt);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);


				waitForElement(driver, P_Hight_TxtField);
				after_Update_value=getAttribute(driver, P_Hight_TxtField,"value");
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}
				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!width_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_Width_TxtField);
				before_Update_Value=getAttribute(driver, P_Width_TxtField,"value");

				click(driver, P_Width_TxtField);
				waitForElement(driver, P_Width_TxtField);
				clearAndType(driver, P_Width_TxtField, width_Input_Txt);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);

				waitForElement(driver, P_Width_TxtField);
				after_Update_value=getAttribute(driver, P_Width_TxtField,"value");
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!volume_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_Volume_TxtField);
				before_Update_Value=getAttribute(driver, P_Volume_TxtField,"value");

				click(driver, P_Volume_TxtField);
				waitForElement(driver, P_Volume_TxtField);
				clearAndType(driver, P_Volume_TxtField, volume_Input_Txt);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);


				waitForElement(driver, P_Volume_TxtField);
				after_Update_value=getAttribute(driver, P_Volume_TxtField,"value");
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!mesurement_DropDown_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_Mesurement_DropDown);
				before_Update_Value=getText(driver, P_Mesurement_DropDown);

				click(driver, P_Mesurement_DropDown);

				waitForElement(driver, mesurementSel);
				click(driver, mesurementSel);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);


				waitForElement(driver, P_Mesurement_DropDown);
				after_Update_value=getText(driver, P_Mesurement_DropDown);
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!teus_DropDown_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_Teus_DropDown);
				before_Update_Value=getText(driver, P_Teus_DropDown);

				click(driver, P_Teus_DropDown);

				waitForElement(driver, teusSel);
				click(driver, teusSel);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);


				waitForElement(driver, P_Teus_DropDown);
				after_Update_value=getText(driver, P_Teus_DropDown);
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!commercialType_DropDown_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_CommercialType_DropDown);
				before_Update_Value=getText(driver, P_CommercialType_DropDown);

				click(driver, P_CommercialType_DropDown);

				waitForElement(driver, commercialTypeSel);
				click(driver, commercialTypeSel);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);

				waitForElement(driver, P_CommercialType_DropDown);
				after_Update_value=getText(driver, P_CommercialType_DropDown);
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!contractType_DropDown_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, Ems_Contract_DropDown);
				before_Update_Value=getText(driver, Ems_Contract_DropDown);

				click(driver, Ems_Contract_DropDown);

				waitForElement(driver, contractTypeSel);
				click(driver, contractTypeSel);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);


				waitForElement(driver, Ems_Contract_DropDown);
				after_Update_value=getText(driver, Ems_Contract_DropDown);
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!dG_Class_DropDown_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_DG_Class_DropDown);
				before_Update_Value=getText(driver, P_DG_Class_DropDown);

				click(driver, P_DG_Class_DropDown);

				waitForElement(driver, dgClassSel);
				click(driver, dgClassSel);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);

				waitForElement(driver, P_DG_Class_DropDown);
				after_Update_value=getText(driver, P_DG_Class_DropDown);
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!eMS_Type_DropDown_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_EMS_Type_DropDown);
				before_Update_Value=getText(driver, P_EMS_Type_DropDown);

				click(driver, P_EMS_Type_DropDown);

				waitForElement(driver, emsTypeSel);
				click(driver, emsTypeSel);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);


				waitForElement(driver, P_EMS_Type_DropDown);
				after_Update_value=getText(driver, P_EMS_Type_DropDown);
				System.out.println("After edit the updated value : "+after_Update_value);
				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}

			if(!eMS_Group_DropDown_Input_Txt.equals("")) {
				Step_Start(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);	
				waitForElement(driver, P_Edit_Btn);
				click(driver, P_Edit_Btn);
				waitForElement(driver, P_EMS_Group_DropDown);
				before_Update_Value=getText(driver, P_EMS_Group_DropDown);
				click(driver, P_EMS_Group_DropDown);
				waitForElement(driver, emsGroupSel);
				click(driver, emsGroupSel);

				Step_End(2, "Click Edit button & Change Equipment type from dropmenu", test, test1);

				Step_Start(3, "Click Save button", test, test1);	
				waitForElement(driver, P_Save_Btn);
				click(driver, P_Save_Btn);

				Step_End(3, "Click Save button", test, test1);

				waitForElement(driver, P_EMS_Group_DropDown);
				after_Update_value=getText(driver, P_EMS_Group_DropDown);
				System.out.println("After edit the updated value : "+after_Update_value);

				waitForElement(driver, P_EquipUpdated_PopUp);
				String updatedMsg =getText(driver, P_EquipUpdated_PopUp);
				if(Equipment_updated_Popup_Txt_Exp.equals(updatedMsg)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Equipment_updated_Popup_Txt_Exp + " || Actual Report Activity is : " + updatedMsg, test,test1);
				}

				if(!(before_Update_Value.equals(after_Update_value))) {
					System.out.println("Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_pass(driver, "Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}else {
					System.out.println("Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value);
					Extent_fail(driver, "Not Matched || " + " Before Update It Was Shown : " + before_Update_Value + " || After Update It Was Shown : " + after_Update_value, test,test1);
				}
			}
			Extent_completed(testCase_Name, test, test1);
		}
	}
}


