package locators;

public interface ActivityDefinition_Locators extends Bill_Upload_Gate{
	public static String P_activity_Definition = "Activity_Definition >//div[contains(@style,'display: block')]//span[text()='Activity Definition']";
	public static String P_activityDefinition_Page = "ActivityDefinition_Page >(//label[contains(text(),'Activity Definition')])[1]";
	public static String P_Act_Global_Search = "Act_Global_Search >//button[contains(@id,'EAD-tbl-btnTblJdlgSearch')]";
	public static String P_Activity_Code = "Activity_Code >//div[contains(text(),'SENT FOR STUFFING')]";
	public static String P_Fst_Coloumn_Name = "Fst_Coloumn_Name >(//tbody[contains(@id,'EAD-EAD_ActDefGrid_data')]//tr//td)[3]";
	public static String P_ActCode_IsUpdate_DD = "ActCode_IsUpdate_DD >//label[contains(@id,'EAD-EAD_cmbIsUpdate_label')]";
	public static String P_Act_AddEdit_Btn = "Act_AddEdit_Btn >//button[contains(@id,'EAD-EAD_btnAdd')]";
	public static String P_Act_Def_Updated_Popup = "Act_Def_Updated_Popup >//*[contains(text(),'Activity Definition updated')]";

	// TC_Activity_Definition_TS064
	public static String P_Act_Fourth_Page = "Act_Fourth_Page >//div[@id='EAD-EAD_ActDefGrid_paginator_bottom']//following::a[contains(text(),'4')]";
	public static String P_FirstOption = "FirstOption>(//div[@col-id='C1'])[2]";
	public static String P_Act_Def_deleted_Popup = "Act_Def_deleted_Popup >//*[contains(text(),'Activity Definition deleted')]";

	public static String kActivitySearch = "ActivitySearch>//*[@id='EAD-EAD_btnAct-EAD_btnAct']";
	public static String kSecondSearch = "SecondSearch>//input[@aria-label='Activity Code Filter Input']";
	public static String kActivityDefinitionSelect = "ActivityDefinitionSelect>//*[@id='nfr-twocol-select-button']";
	public static String kActivityDefinitionEdit = "ActivityDefinitionEdit>//*[@id='EAD-tbl-btnTblEdit']";
	public static String kActivityDefinitionColumName = "ActivityDefinitionColumName>//*[@id='EAD-EAD_btnColAdd']";
	public static String kFirstOption = "FirstOption>(//div[@col-id='C1'])[3]";
	public static String kColumNameSelect = "ColumNameSelect>//*[@id='multicol_okbtn']";
	public static String kActivityDefinitionIsUpdate = "ActivityDefinitionIsUpdate>//*[@id='EAD-EAD_cmbIsUpdate_label']";
	public static String kActivityDefinitionIsUpdateYesOption = "ActivityDefinitionIsUpdateYesOption>//*[@id='EAD-EAD_cmbIsUpdate_1']";
	public static String kActivityDefinitionValidationType = "ActivityDefinitionValidationType>//*[@id='EAD-EAD_cmbValidType_label']";
	public static String kActivityDefinitionVOption = "ActivityDefinitionVOption>//li[@data-label='O-Input is optional and no validation is done']";
	public static String kActivityDefinitionCopyFromPrevious = "ActivityDefinitionCopyFromPrevious>//*[@id='EAD-EAD_cmbCpy1_label']";
	public static String kActivityDefinitionCopyFromPreviousYes = "ActivityDefinitionCopyFromPreviousYes>//*[@id='EAD-EAD_cmbCpy1_1']";
	public static String kActivityDefinitionCopyToPrevious = "ActivityDefinitionCopyToPrevious>//*[@id='EAD-EAD_cmbCpy2_label']";
	public static String kActivityDefinitionCopyToPreviousNo = "ActivityDefinitionCopyToPreviousNo>//*[@id='EAD-EAD_cmbCpy2_2']";
	public static String kActivityDefinitionCopyToPreviousAdd = "ActivityDefinitionCopyToPreviousAdd>//*[@id='EAD-EAD_btnAdd']";
	public static String kActivityDefinitionSave = "ActivityDefinitionSave>//button[@id='EAD-tbl-btnsave']";
	public static String kActivityDefinitionPopUp = "ActivityDefinitionPopUp>(//p[text()='Activity Definition updated'])[1]";
	public static String Updated_Value ="update_Value>//ul[@id='EAD-EAD_cmbIsUpdate_items']//li[text()='%s']";
	public static String Valid_Type_Value = "Valid_Type>//ul[@id='EAD-EAD_cmbValidType_items']//li[text()='%s']";
	public static String CMBCpy_Value_1 = "cmbCpy_Value_1>//ul[@id='EAD-EAD_cmbCpy1_items']//li[text()='%s']";
	public static String CMBCpy_Value_2 = "cmbCpy_Value_2>//ul[@id='EAD-EAD_cmbCpy2_items']//li[text()='%s']";
	public static String ADD_button_select = "add_button_select>//button[@id='EAD-EAD_btnAdd']//following::span[text()='%s'][1]";
	public static String Column_Value = "Column_Value>//label[text()='%s']//..";
	public static String Module2 = "Module2>(//div[@id='nfr_mdldis_centerMainPnl']//label[contains(@id,'tablbl')])[1]";
	public static String column_Filter="column_Filter>(//th[contains(@aria-label,'Columns Name: ')])[1]//input";
	public static String Added_Column_Value = "Added_Column_Value>//label[text()='%s']";
	
}
