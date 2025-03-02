package locators;

public interface Enquiry_History_Locators extends Equipment_Activity_Locators{
	// TC_Enquiry_History_TS023:
		public static String Suppress_Details = "EquipmentNo_Details >(//div[text()='CHSC']//..)[1]";
		public static String CHSC_Value = "EquipmentNo_Details >//div[text()='CHSC']";
		public static String P_homePage = "Home_page >//*[@id='ui-id-1']";
		public static String P_search_Bar = "Search_Bar >//*[@id='nfr_topbar_autocomp_input']";
		public static String P_enquiryHistory = "EnquiryHistory >//span[text()='Enquiry History']";
		public static String P_enquiryHistory_Page = "EnquiryHistory_Page >(//label[contains(text(),'Enquiry History')])[1]";
		public static String P_equipmentNo_RadioBtn = "EquipmentNo_RadioBtn >//div[@id='CEN-CEN_chkSingleContNo']";
		public static String P_equipment_TxtField = "EquipmentNo_TxtField >//input[@id='CEN-CEN_txtfinalscr']";
		public static String P_equipment_SearchIcon = "EquipmentNo_SearchIcon >//input[@id='CEN-CEN_txtfinalscr']//following-sibling::button";
		public static String P_show_Btn = "Show_Btn >//button[@id='CEN-CEN_btnBLShow']";
		public static String P_searchNo_Popup = "SearchNo_Popup >//label[@id='nfr_sch_twocolumn_header']";
		public static String P_select_Btn = "Select_Btn >//button[@id='nfr-twocol-select-button']";
		public static String P_movement_Code = "Movement_Code >//div[@ref='eLabel']//span[contains(text(),'Movement Code')]";
		public static String P_equipmentNo_Details = "EquipmentNo_Details >(//div[@id='CEN-CEN_dsGrid1_tbl']//div[@row-index]//div[@col-id='activityname'])[1]";
		public static String P_logout_Btn = "Logout_Btn >//a[@id='nfr_topbar_logout']";
		public static String P_logout_PopUp = "Logout_PopUp >//div[@id='nfr_main_logout_dlg' and contains(@style,'display:                     block')]//span[text()='Logout']";
		public static String P_logout_YesBtn = "Logout_YesBtn >//div[@id='nfr_main_logout_dlg' and contains(@style,'display: block')]//following::input[contains(@value,'Yes')]";
		public static String P_Act_Def_Next_Page = "Act_Def_Next_Page >(//a[contains(@aria-label,'Next Page')])[1]";
		public static String selectEquipment ="selectEquipment>//div[text()='%s']";
		public static String Equipment_Number ="Equipment_Number>(//div[text()='Equipment No:'])//following::div[1]";
		public static String Tool_Bar_EH ="Tool_Bar_EH>//div[@id='CEN-CEN_dsGrid1_nfr_toolpanel_li_id']";
		public static String Condition_Filter_EH ="Condition_Filter_EH>//a[@id='CEN-CEN_dsGrid1_conditionFilter_id']";
		public static String Movement_Filter_EH ="Movement_Filter_EH>//input[@aria-label='Movement Code Filter Input']";
		public static String movement_Value = "movement_Value>//div[@ref='leftContainer']//div[@role='row' and @row-index='%s']//div[text()='Equipment No:']//following-sibling::div[1]";
		public static String Row_List = "Row_List>//div[@ref='leftContainer']//div[@role='row']";
		public static String Equip_Type_Select ="Equip_Type_Select>//li[text()='%s']";
		public static String Radio_Btn_Select = "Radio_Btn_Select>//label[text()='%s']//preceding::div[1]";
		// TC_Enquiry_History_TS024:
		public static String Date_select ="date_select>//a[text()='%s']";
		public static String deleted_Value = "deleted_Value>//div[text()='%s']";
		public static String grid_element ="grid_element>//td[text()='%s']";
		public static String P_BLNo_EquipNo = "BLNo_EquipNo >((//div[@id='CEN-CEN_dsGrid1_tbl']//div[@ref='leftContainer'])//following::div[@col-id='activityname'])[1]";
		public static String P_show_DltRec_ChkBox = "Show_DltRec_ChkBox >//div[@id='CEN-CEN_chkdeleted']//div[2]";
		public static String P_deleted_Moves = "Deleted_Moves >(//div[@id='CEN-CEN_dsGrid1_tbl']//div[@ref='leftContainer']//div[@role='row'])[7]//div[1]";
		public static String P_Grid_NoOfRetrived = "Grid_NoOfRetrived >//label[@id='CEN-CEN_lblContCount']";
		public static String P_BLNo_ActType = "BLNo_ActType >((//div[@id='CEN-CEN_dsGrid1_tbl']//div[@ref='leftContainer'])//following::div[@col-id='stockStatus'])[1]";
		// TC_Enquiry_History_TS025:
		public static String P_equipNo_MultiDetail = "EquipNo_MultiDetail >(//div[@id='CEN-CEN_dsGrid1_tbl']//div[@ref='leftContainer']/div/div)[17]";
		public static String AResetButton = "AResetButton>//button[@id='EDB-EDB_buttonReset']";
		public static String P_suppressAct_CheckBox = "SuppressAct_CheckBox >//div[@id='CEN-CEN_chksubpres']//div[2]";
		public static String P_Show_Top_CheckBox = "SuppressAct_CheckBox >//div[@id='CEN-CEN_chkshow20move']//div[2]";
		public static String P_Show_Top_Field = "SuppressAct_CheckBox >//input[@id='CEN-CEN_txtTopmoves']";
		// TC_Enquiry_History_TS026:
		public static String movementcode ="movementcode>(//*[@row-id='%s']//div[@col-id='docRefNo'])";
		public static String P_bookNo_RadioBtn = "BookNo_RadioBtn >//div[@id='CEN-CEN_chkSingleBookNo']";
		public static String P_bookingNo_Text = "BookingNo_Text >(//span[contains(text(),'Booking No.')]//following::div[contains(text(),'%s')])[1]";
		public static String Scruoll = "Scruoll >(//div[@class='ag-body-horizontal-scroll-viewport'])[1]";
		// TC_Enquiry_History_TS027:
		public static String P_BLNo_RadioBtn = "BLNo_RadioBtn >//div[@id='CEN-CEN_chkSingleBLNo']";
		public static String Grid_Movement_Codes = "Grid_Movement_Codes >//div[@row-index='%s']//div[@col-id='actType']";

		// TC_Enquiry_History_TS028:

		public static String P_equip_MultiSelect_CheckBox = "multiSelect_CheckBox >//label[text()='Multi Select']//preceding::div[1]";
		public static String P_multiSel_SearchNo_Popup = "MultiSel_SearchNo_Popup >//label[@id='nfr_sch_mu_header']";
		public static String P_multiSel_Search_SelBtn = "P_multiSel_Search_SelBtn >//button[@id='multicol_okbtn']";
		public static String Equip_Search_Field = "Equip_Search_Field >//input[@aria-label='Equipment No. Filter Input'";
		public static String Equip_Type_DD = "Equip_Type_DD >//label[@id='CEN-CEN_lblEquipmentType_label']";

		public static String EquipmentActivity_ToolPannel="EquipmentActivity_ToolPannel>//div[@id='CAV-CAV_dsGridConActy_nfr_toolpanel_li_id']";
		public static String EquipmentActivity_ConditionFilter="EquipmentActivity_ConditionFilter>//a[@id='CAV-CAV_dsGridConActy_conditionFilter_id']";
		public static String EquipmentActivity_ActivityCode_Tf="EquipmentActivity_ActivityCode_Tf>//input[@aria-label='Activity Code Filter Input']";
		public static String kFirstOPtion1="FirstOPtion>(//div[@row-index='0'])[2]";
		
}
