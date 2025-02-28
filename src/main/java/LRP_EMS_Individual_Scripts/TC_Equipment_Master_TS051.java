package LRP_EMS_Individual_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Locators;

public class TC_Equipment_Master_TS051 extends Keywords{
	
	public void Equipment_Master_TS051(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
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
		
	}
}
