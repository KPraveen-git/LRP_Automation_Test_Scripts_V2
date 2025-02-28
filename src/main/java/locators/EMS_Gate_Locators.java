package locators;

public interface EMS_Gate_Locators extends Equipment_Activity_Locators {
	public static String EMS_Gate_From_Date="EMS_Gate_From_Date>//input[@id='EGT-EGT_txtFrom_input']";
	public static String EMS_Gate_To_Date="EMS_Gate_To_Date>//input[@id='EGT-EGT_txtTo_input']";
	public static String Action_Required_CheckBox = "Action_Required_CheckBox>(//input[@id='EGT-EGT_chkActionRequired_input']//following::span)[1]";
	public static String Action_NotRequired_CheckBox = "Action_NotRequired_CheckBox>(//input[@id='EGT-EGT_chkActionRequired_input']//following::span)[2]";
    public static String refresh_Button_Ems_Gate="refresh_Button>//button[@id='EGT-EGT_btnRefresh']";
	public static String Status_Menu="Status_Menu>//div[@col-id='uploadstatus']//span[@ref='eMenu']";
	public static String Filter_Option="Filter_Option>//span[@aria-label='filter']";
	public static String Select_all_CheckBox="Select_all_CheckBox>//*[@ref='eCheckbox']//*[text()='(Select All)']";
  public static String select_value="select_value>//*[@ref='eCheckbox']//*[text()='%s']";
  public static String Error_Record_List="Error_Record_List>//div[@ref='eContainer']//div[@col-id='uploadstatus']//following::div[@col-id='uploadstatus']//preceding::div[@role='row'][1]";
  public static String error_row = "error_Row>//div[@ref='eContainer']//div[contains(@class,'sm-bg-pink ag-row-position') and @row-index='%s']";
  public static String error_file="error_File>//div[@ref='eContainer']//div[@role='row' and @row-index='%s']//preceding-sibling::div[@col-id='edireaderid']";
	public static String Error_Record_Grid="Error_Record_Grid>(//span[text()='System File name']//following::div[@aria-colindex='1'])[2]";
	public static String EDI_ErrorMoments_EqpNo="EDI_ErrorMoments_EqpNo>//span[text()='Equipment No.']//following::div[@aria-colindex='1']";
	public static String EDI_Value="EDI_Value>(//div[@id='nfr-jdlgGrid-div']//following::div[@aria-colindex='1'])[3]";
  public static String Ems_gate_Frame="Ems_gate_Frame>//label[@id='mdl1_tablbl' and .='EMS Gate']";
	public static String Norecordsround_okbtn1 = "Norecordsround_okbtn1>(//button[text()='Ok'])[2]";
   public static String custom_search = "custom_search>//*[text()='Custom Search']";
	public static String ToolPanel="ToolPanel>//div[@id='EGT-EGT_treeTable_nfr_toolpanel_li_id']";
	public static String Confitionfilter="Confitionfilter>//a[@id='EGT-EGT_treeTable_conditionFilter_id']";
	public static String EDI_Date="EDI_Date>//input[@id='EER-EER_txtfrmdate_input']";
	public static String Error_Date="Error_Date>//span[text()='Request Date']//following::div[@col-id='requestdate']";
	public  static String System_fileName_TF="System_fileName_TF>//input[@aria-label='System File name Filter Input']";
  	public static String show_Btn="show_Btn>//button[@id='EER-EER_btnShow']";
	public static String P_EMS_Gate_Cancel_Btn = "EMS_Gate_Cancel_Btn >(//label[contains(text(),'EMS Gate')])[1]//following::a[3]";



	//35
	public static String Error_Grid = " Error_Grid>(//div[@row-index='0'])[1]//div[@aria-colindex='3']";
	//54
	public static String Firstgrid = "Firstgrid>(//div[@ref='eContainer']//div[@aria-colindex='1'])[1]";
	public static String P_Equip_Filter_CheckBox = "P_Equip_Filter_CheckBox>//div[@ref='eCheckbox']//div[text()='(Select All)']";


	public static String kFromDate = "FromDate>//*[@id='EER-EER_txtfrmdate_input']";
	public static String kToDate = "ToDate>//*[@id='EER-EER_txttodate_input']";
	public static String kAddOption = "AddOption>//*[@id='EER-EER_fleNamebtn']";
	public static String kSelectFirstOpt = "SelectFirstOpt>//*[@id='nfr_sch_multicolumn_form']//div[@ref='eCenterContainer']//div[@role='row'][1]/div[2]";
	public static String kGetValu = "GetValu>//*[@id='EER-EER_lstFleName']//li";
	public static String kSelectOption = "SelectOption>//*[@id='multicol_okbtn']";
	public static String kShowOp = "ShowOp>//*[text()='Show']";
	public static String kErrorList = "ErrorList>(//span[text()='Equipment No.'])[1]//following::div[@ref='eCellWrapper'][1]";
	public static String EDI_ErrorMoments_ToolPannel="EDI_ErrorMoments_ToolPannel>//div[@id='EER-EER_errortable_nfr_toolpanel_li_id']";
	public static String EDI_ErrorMoments_ConditionFilter="EDI_ErrorMoments_ConditionFilter>//a[@id='EER-EER_errortable_conditionFilter_id']";
	public static String EDI_ErrorMoments_Equipment_No="EDI_ErrorMoments_Equipment_No>//input[@aria-label='Equipment No. Filter Input']";
//


}
