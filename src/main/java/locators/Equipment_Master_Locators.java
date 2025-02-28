package locators;

public interface Equipment_Master_Locators extends Master_Reactivation_Locators{
	// TC_Equipment_Master_TS051
		public static String chassisSel = "chassisSel>//ul[contains(@id,'EQP-EQP_cmbChassis_items')]//li[contains(text(),'%s')]";
		public static String breakBulkSel="breakBulkSel>//ul[contains(@id,'EQP-EQP_cmbBreakbulk_items')]//li[contains(text(),'%s')]";
		public static String equipTypeSel="equipTypeSel>//ul[contains(@id,'EQP-EQP_cmbtype_items')]//li[contains(text(),'%s')]";
		public static String fleetSel="fleetSel>//ul[contains(@id,'EQP-EQP_cmbFleet_items')]//li[contains(text(),'%s')]";
		public static String mesurementSel="mesurementSel>//ul[contains(@id,'EQP-EQP_txtmeasurement_items')]//li[contains(text(),'%s')]";
		public static String teusSel="teusSel>//ul[contains(@id,'EQP-EQP_cmbteus_items')]//li[contains(text(),'%s')]";
		public static String commercialTypeSel="commercialTypeSel>//ul[contains(@id,'EQP-EQP_cmbComtype_items')]//li[contains(text(),'%s')]";
		public static String contractTypeSel="contractTypeSel>//ul[contains(@id,'EQP-EQP_cmbContract_items')]//li[contains(text(),'%s')]";
		public static String dgClassSel="dgClassSel>//ul[contains(@id,'EQP-EQP_cmbClstype_items')]//li[contains(text(),'%s')]";
		public static String emsTypeSel="emsTypeSel>//ul[contains(@id,'EQP-EQP_cmbEmsType_items')]//li[contains(text(),'%s')]";
		public static String emsGroupSel="emsGroupSel>//ul[contains(@id,'EQP-EQP_txtEmsGroup_items')]//li[contains(text(),'%s')]";
		public static String newlyAddedEquipment="newlyAddedEquipment>//div[contains(text(),'%s')]";
		public static String Activity_Code = "Activity_Code>//div[text()='%s']";
		public static String deleted_Column_Value = "deleted_Column_Value>//label[text()='%s']//ancestor::tr[1]";
		public static String AddedColumnValue = "AddedColumnValue>//label[text()='%s']//..";
		public static String P_Equip_Mas_Cancel_Btn = "Enq_His_Cancel_Btn >(//label[contains(text(),'Equipment Master')])[1]//following::a[3]";

		public static String P_equipmentMaster = "EquipmentMaster >//div[contains(@style,'display: block')]//span[text()='Equipment Master']";
		public static String P_equipmentMaster_Page = "EquipmentMaster_Page >(//label[contains(text(),'Equipment Master')])[1]";
		public static String P_equipmentType_TxtField = "EquipmentType_TxtField >//input[contains(@id,'EQP-EQP_txtEqpCode')]";
		public static String P_equipmentDesc_TxtField = "EquipmentDesc_TxtField >//input[contains(@id,'EQP-EQP_txtEqpName')]";
		public static String P_tare_TxtField = "Tare_TxtField >//input[contains(@id,'EQP-EQP_txtTareKg_input')]";
		public static String P_Chasis_DropDown = "P_Chasis_DropDown >//label[contains(@id,'EQP_cmbChassis_label')]";
		public static String P_Special_Chessis_CheckBox = "P_Chasis_DropDown >//div[contains(@id,'EQP_chkSpecialchassis')]//div[2]";
		public static String P_breakBulk_DropDown = "BreakBulk_DropDown >//label[contains(@id,'EQP-EQP_cmbBreakbulk_label')]";
		public static String P_equipmentType_DropDown = "equipmentType_DropDown >//label[contains(@id,'EQP-EQP_cmbtype_label')]";
		public static String P_Max_Gross_TxtField = "Max_Gross_TxtField >//input[contains(@id,'EQP-EQP_txtGrossKg_input')]";
		public static String P_Fleet_DropDown = "Fleet_DropDown >//label[contains(@id,'EQP-EQP_cmbFleet_label')]";
		public static String P_Length_TxtField = "Length_TxtField >//input[contains(@id,'EQP-EQP_txtlength_input')]";
		public static String P_Hight_TxtField = "Hight_TxtField >//input[contains(@id,'EQP-EQP_txtheight_input')]";
		public static String P_Width_TxtField = "Width_TxtField >//input[contains(@id,'EQP-EQP_txtwidth_input')]";
		public static String P_Volume_TxtField = "Volume_TxtField >//input[contains(@id,'EQP-EQP_txtVolume_input')]";
		public static String P_Mesurement_DropDown = "Mesurement_DropDown >//label[contains(@id,'EQP-EQP_txtmeasurement_label')]";
		public static String P_Teus_DropDown = "Teus_DropDown >//label[contains(@id,'EQP-EQP_cmbteus_label')]";
		public static String P_CommercialType_DropDown = "CommercialType_DropDown >//label[contains(@id,'EQP-EQP_cmbComtype_label')]";
		public static String Ems_Contract_DropDown = "Ems_Contract_DropDown >//label[contains(@id,'EQP_cmbContract_label')]";
		public static String P_DG_Class_DropDown = "DG_Class_DropDown >//label[contains(@id,'EQP-EQP_cmbClstype_label')]";
		public static String P_EMS_Type_DropDown = "EMS_Type_DropDown >//label[contains(@id,'EQP-EQP_cmbEmsType_label')]";
		public static String P_EMS_Group_DropDown = "EMS_Group_DropDown >//label[contains(@id,'EQP-EQP_txtEmsGroup_label')]";
		public static String P_Save_Btn = "P_Save_Btn >//button[contains(@id,'btnsave')]";
		public static String PopUp = "PopUp >//div[@id='lrp_cust_growl_container']//p";

		public static String P_Global_Search_Btn = "P_Global_Search_Btn >//button[contains(@id,'myBtn')]";
		public static String P_Global_Search_TxtField = "Global_Search_TxtField >(//div[@id='var_char']//following::input)[1]";
		public static String P_Global_Sel_Btn = "Global_Sel_Btn>//button[contains(@id,'nfr_sch_jdlg_form-jdlg_okbtn')]";

		// TC_Equipment_Master_TS052
		public static String P_Delete_Btn = "Delete_Btn >//button[contains(@id,'btnTblDelete')]";
		public static String P_First_Equip_Type = "First_Equip_Type >(//div[@id='EQP-EQP_equp_grid']//div[@role='gridcell'])[1]";
		public static String P_Equip_Size_Menu = "Equip_Size_Menu >(//div[@id='EQP-EQP_equp_grid']//div[@role='presentation']//following::span[@ref='eMenu'])[1]";
		public static String Equip_Size_Filter = "Equip_Size_Filter >//span[@aria-label='filter']";
		public static String P_Equip_Filter_CheckBox = "Equip_Filter_CheckBox >//*[@ref='eCheckbox']//*[text()='(Select All)']";
		public static String P_Filter_First_Value = "Filter_First_Value >(//div[@ref='eCheckbox']//div[1])[2]";
		public static String P_Equip_Filter_Search = "Equip_Filter_Search >(//div[@ref='eBody']//input[@ref='eInput'])[1]";
		public static String P_Deleted_PopUp = "Deleted_PopUp >//span[contains(text(),'Do you want to delete')]";
		public static String P_Deleted_PopUp_YesBtn = "Deleted_PopUp_YesBtn >//button[contains(text(),'Yes')]";
		public static String P_Global_Search_Close = "Global_Search_Close >//div[@id='nfr_sch_jdlg']//a[@aria-label='Close']";

		// TC_Equipment_Master_TS053
		public static String P_Edit_Btn = "Edit_Btn >//button[contains(@id,'btnTblEdit')]";
		public static String P_EquipUpdated_PopUp = "EquipUpdated_PopUp >//*[contains(text(),'Equipment updated')]";
		public static String P_Global_Search = "Global_Search >//button[contains(@id,'btnTblJdlgSearch')]";

}
