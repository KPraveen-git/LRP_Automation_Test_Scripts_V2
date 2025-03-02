package locators;

public interface Predictable_Activity_Locators extends Rate_Request_Loactors{

	public static String Predictable_Activity_Table_PAB = "Predictable Actvity Behaviour Table>//div[@id='ABH-ABH_gridActivityPre1_tbl']";

	public static String Activity_Column_PAB = "Activity Column>//div[@id='ABH-ABH_gridActivityPre1_tbl']//div[@col-id='actCode' and @role='gridcell' and text()='%s']";
	public static String Activity_Name_PAB = "Activity Name>//div[@id='ABH-ABH_gridActivityPre1_tbl']//div[@col-id='actName' and @role='gridcell' and text()='%s']";

	public static String Add_item_PAB = "Add item >//div[@class='ag-menu-option']//span[text()='Add Item']";
	public static String Add_Main_Item_PAB = "Add Main Item>//div[@class='ag-menu-option']//span[text()='Add Main Item']";

	public static String Contract_type_Input_PAB = "Contract Type Input>//div[@id='ABH-ABH_cmbContracType']";
	public static String Select_Contract_Type_PAB = "Select Contract Type>//ul[@id='ABH-ABH_cmbContracType_items']//li[text()='%s']";
	public static String From_Date_Input_PAB = "From Date Input>//input[@id='ABH-ABH_txtFrom_input']";
	public static String Port_Input_PAB = "Port Input>//button[@id='ABH-ABH_btnPort']";
	public static String Terminal_Port_PAB = "Terminal Port PAB>//button[@id='ABH-ABH_btnTerminal']";
	public static String Show_Button_PAB = "Show Button >//button[@id='ABH-ABH_btnShow']";

	public static String Template_Numer_Input_PAB = "Template no input>//input[@id='ABH-ABH_txtId']";
	public static String Predictable_Reporting_checkbox="Predictable_Reporting_checkbox>(//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid']//div[@col-id='nfr_sel_col'])[2]";
	public static String Un_Predictable_Reporting_checkbox ="Un_Predictable_Reporting_checkbox>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@col-id='isPred'])[3]";
	public static String Un_Predictable_Reporting_Quantity1="Un_Predictable_Reporting_Quantity>(//div[@col-id='quantity'])[3]";
	public static String Un_Predictable_Reporting_Quantity_Input_Field ="Un_Predictable_Reporting_Quantity_Input_Field>//input[@id='CRR_CRR_jTabbedPane1-CRR_gridActivity_1_quantity_input']";
	public static String Global_Search ="Global_Search>//button[@id='CRR-tbl-btnTblJdlgSearch']";
	public static String Approved_Total ="Approved_Total>//label[@id='CRR_treeTableEXPDB_records_lbl_cnt']";
	public static String Approved_table ="Approved_table>//div[@id='CRR_treeTableEXPDB_tbl']";
	public static String show_Row_values="show_Row_values>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@row-index='0']";
	public static String Show_Currency_Value="Show_Currency_Value>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@row-index='0']//div[@col-id='currency']";
	public static String Show_Amount_Value="Show_Currency_Value>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@row-index='0']//div[@col-id='amountWithSTX']";
		
	public static String Quantity_Input_CAR1 = "Quantity Input CAR>//input[@id='CRR_CRR_jTabbedPane1-CRR_gridActivity_0_quantity_input']";
	public static String Approved_Expensive_all_values ="Approved_Expensive_all_values>//div[@id='CRR_treeTableEXPDB_tbl']//div[@role='gridcell']";
	public static String Delete ="Delete>//button[@id='CRR-tbl-btnTblDelete']";
	
public static String port_Mapping_ID_Textfield_CM="port_Mapping_ID_Textfield_CM>//input[@id='CMP-CMP_txtTemplateNo']";
public static String mainActivityName_Unpred_CAR="mainActivityName_Unpred_CAR>//div[@col-id='mainActName' and @role='gridcell']";
public static String column_All_Select_CheckBox="column_All_Select_CheckBox>//div[contains(@class,'ag-tool-panel-wrapper') and @aria-hidden='false']//div[@ref='primaryColsHeaderPanel']/child::div[@ref='eSelect']/div[@ref='eWrapper']";
public static String UnPredictable_All_Checkbox_CAR="Un Predictable All Checkbox>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//input[@aria-label='Toggle Select All Columns']";
public static String Message_Ok_Button_CAR="Message_Ok_Button_CAR>//button[@id='CRRSRL_btnOkClose2']";
public static String predictable_SubActivity_Column_Ctl="predictable_SubActivity_Column_CAR>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//div[@col-id='subactivitydes' and text()='%s']";
public static String predictable_Table_Toolpanel_Car="predictable_Table_Toolpanel_Ctl>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_nfr_toolpanel_li_id']";
public static String predictable_MainActivity_Column_Ctl="predictable_MainActivity_Column_CAR>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//div[@col-id='mainActName' and text()='%s']";

	
	
}
