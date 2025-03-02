package locators;

public interface Equipment_Activity_Locators extends Equipment_Master_Locators{
	public static String kActivityCodeVal = "ActivityCodeVal>//*[@id='CAV-CAV_txtActCode']";
	public static String kActivityDescriptionVal = "ActivityDescriptionVal>//*[@id='CAV-CAV_txtActDesc']";
	public static String kActivityGroup = "ActivityGroup>//*[@id='CAV-CAV_cmbActivityGrp_label']";
	public static String kActivityGroupVal = "ActivityGroupVal>//*[@id='CAV-CAV_cmbActivityGrp_2']";
	public static String kStockStatusVal = "StockStatusVal>//*[@id='CAV-CAV_cmbStkStatus_label']";
	public static String kStockStatusValue = "StockStatusValue>//*[@id='CAV-CAV_cmbStkStatus_4']";
	public static String kEmptyFullOpt = "EmptyFullOpt>//*[@id='CAV-CAV_cmbEmpty_label']";
	public static String kEmptyOpt = "EmptyOpt>//*[@id='CAV-CAV_cmbEmpty_1']";
	public static String kAllowSocActivity = "AllowSocActivity>//*[@id='CAV-CAV_cmbAllowSOC_label']";
	public static String kAllowScoActivityVal = "AllowScoActivityVal>//*[@id='CAV-CAV_cmbAllowSOC_1']";
	public static String kAllowForce = "AllowForce>//*[@id='CAV-CAV_cmbAllowFrc_label']";
	public static String kAllowForceValue = "AllowForceValue>//*[@id='CAV-CAV_cmbAllowFrc_1']";
	public static String kIsSpecial = "IsSpecial>//*[@id='CAV-CAV_cmbIsSpecial_label']";
	public static String kIsSpecialVal = "IsSpecialVal>//*[@id='CAV-CAV_cmbIsSpecial_1']";
	public static String kAutoEir = "AutoEir>//*[@id='CAV-CAV_cmbAutoEIR_label']";
	public static String kAutoEirVal = "AutoEirVal>//*[@id='CAV-CAV_cmbAutoEIR_1']";
	public static String kActivityType = "ActivityType>//*[@id='CAV-CAV_cmbActType_label']";
	public static String kActivityTypeVal = "ActivityTypeVal>//*[@id='CAV-CAV_cmbActType_1']";
	public static String kStockLocation = "StockLocation>//*[@id='CAV-CAV_cmbStkLoc_label']";
	public static String kStockLocationVal = "StockLocationVal>//*[@id='CAV-CAV_cmbStkLoc_1']";
	public static String kSaveOption = "SaveOption>//*[@id='CAV-CAV_toolbar-btnsave']";
	public static String kEirStatus = "EirStatus>//*[@id='CAV-CAV_cmbEIRStatus_label']";
	public static String kFromLoc = "FromLoc>//*[@id='CAV-CAV_cmbFromLoc_label']";
	public static String kLocationOpt = "LocationOpt>//*[@id='CAV-CAV_cmbFromLoc_1']";
	public static String kToLoc = "ToLoc>//*[@id='CAV-CAV_cmbToLoc_label']";
	public static String kToLocOption = "ToLocOption>//*[@id='CAV-CAV_cmbToLoc_1']";
	public static String kDeliveredLanden = "DeliveredLanden>//*[@id='CAV-CAV_cmbEIRStatus_1']";
	public static String kSavePopup = "SavePopup>(//*[text()='Equipment Activity Saved'])[1]";
	public static String kPpppOption = "PpppOption>//div[text()='PPPP']";
	public static String kDeleteOption = "DeleteOption>//*[@id='CAV-CAV_toolbar-btnTblDelete']";
	public static String kEquipmentActvityPopup = "EquipmentActvityPopup>//h2[text()='Equipment Activity']";
	public static String kYesEquipmentDeleteOpt = "YesEquipmentDeleteOpt>//button[text()='Yes']";
	public static String kEquipmentAcitivyDeleted = "EquipmentAcitivyDeleted>//*[text()='Equipment Activity Deleted']";
	public static String CloseButton_M = "Equipment_Activity_CloseButton>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";

	public static String LinkChasis = "LinkChasis>//label[@id='CAV-CAV_cmbDelink_label']";
	public static String BookingNO_Update = "BookingNO_Update>//label[@id='CAV-CAV_cmbBookNoUp_label']";
	public static String pool_chasis_Activity = "pool_chasis_Activity>//label[@id='CAV-CAV_cmbChasisAct_label']";
	public static String TransmitIndicator = "TransmitIndicator>//label[@id='CAV-CAV_cmbTransInd_label']";
	public static String Non_Pool_ChassisAct = "Non_Pool_ChassisAct>//label[@id='CAV-CAV_cmbNonChassis_label']";
	public static String AllowInterchage = "AllowInterchage>//label[@id='CAV-CAV_cmbAllowInt_label']";
	public static String MasterReq = "MasterReq>//label[@id='CAV-CAV_cmbMasterReq_label']";
	public static String PartnerID_TF = "PartnerID_TF>//input[@aria-label='Partner Id Filter Input']";
	public static String Select_btn = "Select_btn>//button[@id='nfr-twocol-select-button']";
//public static String Module_Select = "Module_Select>//div[@id='nfr_topbar_autocomp_panel' and contains(@style,'display: block;')]//li[contains(translate(@data-item-label, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),translate('%s', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'))]";
public static String Activity_Group_Value ="Activity_Group_Value>//li[text()='%s']";
public static String Stock_Status_Value ="Stock_Status_Value>//li[text()='%s']";
public static String Empty_Full_Value = "Empty_Full_Value>//li[text()='%s']";
public static String Soc_Activity1 ="Soc_Activity1>//ul[@id='CAV-CAV_cmbAllowSOC_items']//li[text()='%s']";
public static String AllowForce_Value ="AllowForce_Value>//ul[@id='CAV-CAV_cmbAllowFrc_items']//li[text()='%s']";
public static String Is_special_Value ="Is_special_Value>//ul[@id='CAV-CAV_cmbIsSpecial_items']//li[text()='%s']";
public static String Auto_EIR_Value ="Auto_EIR_Value>//ul[@id='CAV-CAV_cmbAutoEIR_items']//li[text()='%s']";
public static String Activity_Type_Value ="Activity_Type_Value>//li[text()='%s']";
public static String Stock_Location_Value ="Stock_Location_Value>//li[text()='%s']";
public static String EIR_Status_Value ="EIR_Status_Value>//li[text()='%s']";
public static String From_Loc_Value ="From_Loc_Value>//ul[@id='CAV-CAV_cmbFromLoc_items']//li[text()='%s']";
public static String To_Loc_Value ="To_Loc_Value>//ul[@id='CAV-CAV_cmbToLoc_items']//li[text()='%s']";
public static String Link_Chassis_Value = "Link_Chassis_Value>//li[text()='%s']";
public static String Booking_No_update_Value ="Booking_No_update_Value>//li[text()='%s']";
public static String Pool_Chassis_Activity_Value ="Pool_Chassis_Activity_Value>//li[text()='%s']";
public static String Transmit_Indicator_Value ="Transmit_Indicator_Value>//li[text()='%s']";
public static String Non_Pool_Chassis_Activity_Value ="//li[text()='%s']";
public static String Allow_Interchange_Value = "Allow_Interchange_Value>//li[text()='%s']";
public static String Master_Required_Value ="Master_Required_Value>//li[text()='%s']";
  public static String Active_Value_Select="Active_Value_Select>//div[@ref='eCheckbox']//div[text()='%S']";
public static String Equip_Size_Filter = "Equip_Size_Filter >//span[@aria-label='filter']";
public static String P_Equip_Filter_Search = "Equip_Filter_Search >(//div[@ref='eBody']//input[@ref='eInput'])[1]";
public static String Activity_Code = "Activity_Code>//div[text()='%s']";
public static String kMenuOption = "MenuOption>(//div[@id='CAV-CAV_dsGridConActy_tbl']//div[@role='presentation']//following::span[@ref='eMenu'])[1]";
public static String kMainSearchOPtion = "MainSearchOPtion>//span[contains(@aria-label,'filter')]";
public static String kActivityOPtionSearch = ">ActivityOPtionSearch(//div[@ref='eBody']//input[@ref='eInput'])[1]";
public static String kSelectAllOption = "SelectAllOption>//label[@ref='eSelectAllContainer']";
public static String kDeleteOpti = "DeleteOpti>//*[@id='CAV-CAV_toolbar-btnTblDelete']";
public static String kDeletedPopUp = "DeletedPopUp>//span[text()=' Are you sure to delete the Equipment Activity ?']";
public static String kDeleteYes = "DeleteYes>//button[text()='Yes']";
public static String KDeleteAcitivitySucc = "DeleteAcitivitySucc>(//p[contains(text(),'Equipment Activity Deleted')])[2]";
public static String kFirstDeleteOP = "FirstDeleteOP>(//div[@ref='eCenterContainer']//div[@aria-colindex='1'])[1]";
public static String kEquipmentActivityDeleted = "EquipmentActivityDeleted>(//p[text()='Equipment Activity Deleted'])[1]";
//
public static String Activity_code="Activity_code>//div[text()='%s']";


public static String kActivitySearchOpt = "Activity_Search>(//div[@id='CAV-CAV_dsGridConActy_tbl']//following::span[contains(@ref,'eMenu')])[1]";
    public static String Master_Reactivation_New_Button="Master_Reactivation_New_Button>//div[contains(@id,'tblComponent')]//button[contains(@id,'btnTblNew')]";
public static String ID_Popup_Yes_Button = "ID_Popup_Yes_Button>//h2//following::button[text()='Yes']";
public static String ID_Popup_No_Button = "ID_Popup_No_Button>//h2//following::button[text()='No']";
public static String ID_Popup_Msg ="ID_Popup_Msg>//h2//following-sibling::span[2]";
public static String module_Nume_search_button_MR="module_Nume_search_button_MR>//button[@id='MRD-MRD_btnMdlName-MRD_btnMdlName']";
public static String module_Name_Filter_MR="module_Name_Filter_MR>//input[@aria-label='Module Name Filter Input']";
public static String select_Btn="select_Btn>//button[@id='nfr-twocol-select-button']";
public static String show_Button_MR="show_Button_MR>//button[@id='MRD-MRD_btnShow']";
public static String activity_Code_TF_MR="activity_Code_TF_MR>//thead[@id='MRD-MRD_trTable_head']//input[contains(@id,'MRD-MRD_trTable')]";
public static String activity_Code_Select_MR="activity_Code_Select_MR>//tbody[@id='MRD-MRD_trTable_data']//tr[@data-ri='0']//input";
public static String reactive_Button_MR="reactive_Button_MR>//button[@id='MRD-MRD_btnReActivate']";
public static String ID_Popup_Ok_Button = "ID_Popup_Ok_Button>//h2//following::button[text()='Ok']";
public static String Grid_Select="Grid_Select>//div[@id='nfr-jdlgGrid-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
//
//

public static String ToolPanel1="ToolPanel1>//div[@id='CAV-CAV_dsGridConActy_nfr_toolpanel_li_id']";
public static String Confitionfilter1="Confitionfilter1>//a[@id='CAV-CAV_dsGridConActy_conditionFilter_id']";
public static String Activity_Code_TF="Activity_Code_TF>//input[@aria-label='Activity Code Filter Input']";
public static String kEditOption = "EditOption>//button[@id='CAV-CAV_toolbar-btnTblEdit']";
public static String kEqupmentActivityUpdated = "EqupmentActivityUpdated>(//p[text()='Equipment Activity Updated '])[1]";





















}
