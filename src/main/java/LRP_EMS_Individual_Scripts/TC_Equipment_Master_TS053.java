package LRP_EMS_Individual_Scripts;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Locators;

public class TC_Equipment_Master_TS053 extends Keywords{
	public void Equipment_Master_TS053(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		String testCase_Name="TC_Equipment_Master_TS053";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		String Sheet_Name_053 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_053, testCase_Name, "Dataset"+selected_dataset, File_Path);
		String user_Name =Excel_data.get("Userid");
		String pass_word =Excel_data.get("PassWord");
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