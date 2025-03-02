package locators;

public interface Cost_Activity_Report_Locators extends Current_History_Report_Locators{

	public static String Contract_Type_Input_CAR = "Contract Type Input>//div[@id='CRR-CRR_cmboCntType']";
	public static String Contract_Type_Options_CAR = "Contract Type Options>//ul[@id='CRR-CRR_cmboCntType_items']//li";

	public static String Mode_Select_Input_CAR = "Mode Select input >//div[@id='CRR-CRR_jComboBox1']";
	public static String Select_Mode_type_CAR = "Select Mode Type>//ul[@id='CRR-CRR_jComboBox1_items']//li[text()='%s']";
	public static String TotalSummary_Ok = "Total summary ok>//button[@id='CRRSummary-CRRDG_btntotOk']";
	public static String Service_Search_Btn_CAR = "Service Search Button>//button[@id='CRR-CRR_btnService-CRR_btnService']";
	public static String Vessel_Search_Btn_CAR = "Vessel Search Button>//button[@id='CRR-CRR_btnVessel']";
	public static String Port_Search_Btn_CAR = "Port Search Button>//button[@id='CRR-CRR_btnPort']";
	public static String Terminal_Search_Btn_CAR = "Terminal Search Button>//button[@id='CRR-CRR_btnTerminal']";
	public static String Arrival_Date_Search_Btn_CAR = "Arrival Date Search button>//button[@id='CRR-CRR_btnArrDate']";

	public static String Show_Button_CAR = "Show button >//button[@id='CRR-CRR_solverBtn1']";
	public static String Predictable_Reporting_CAR = "Predictable Reporting>//div[@id='CRR-CRR_jTabbedPane1']//a[text()='Predictable Reporting']";
	public static String Service_Field="Service_Field>//input[@id='CRR-CRR_txtServiceCode_input']";

	public static String UnPredictable_Tab_CAR = "Un Predictable tab>//div[@id='CRR-CRR_jTabbedPane1']//a[text()='Unpredictable Reporting']";
	public static String UnPredictable_Table_CAR = "Un Predicatble Table>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']";
	public static String UnPredictable_Activity_Column_CAR = "Un Predictable Activity Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@col-id='subactivitydes' and text()='%s']";
	public static String UnPredictable_CheckBox_Vendor_CAR = "Un Predictable Column Checkbox>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@col-id='vendorCode' and text()='%s']/ancestor::div[@role='row']//input";
	public static String Contracts_Used_Btn_CAR = "Contracts Used button>//button[@id='CRR-CRR_btnShowContracts']";
	public static String Contracts_Details_tab_CAR = "Contracts details tab>//div[@id='CRR_contractdlg']";
	public static String Activity_Behaviour_ID_CAR = "Activity Behaviour Value>//div[@id='CRR_contractdlg']//label[contains(text(),'Activity Behaviour Template')]";
	public static String Contract_Details_Ok_Btn_CAR = "Contract Details Ok Button>//button[@id='CRR_btnOkActionPerformed']";
	public static String contractTypeDropdown = "contract_Type_Dropdown>//div[@id='ATY-ATY_cmbContractCode']";
	public static String already_ok_btn = "already_ok_btn>//div[@id='PTM-updatedlg1']//button[@id='PTM-PTM_dialogcancel']";

	public static String Remarks_Tab_CAR = "Remarks Tab>//div[@id='CRR-CRR_jTabbedPane1']//a[text()='Remarks']";
	public static String Remarks_Text_Area_CAR = "Remarks Text Area>//textarea[@id='CRR-CRR_jTabbedPane1-CRR_jTextArea1']";

	public static String Remarks_Row_CAR = "Remarks Row>//tbody[contains(@id,'CRR_gridRemarks_data')]//tr";

	public static String Remarks_Values_Last_CAR = "Remarks Last Value>//tbody[contains(@id,'CRR_gridRemarks_data')]//tr[%s]//td[1]";
	public static String Remarks_User_Last_CAR = "Remarks User >//tbody[contains(@id,'CRR_gridRemarks_data')]//tr[%s]//td[2]";
	public static String Remarks_Date_Last_CAR = "Remarks Date>//tbody[contains(@id,'CRR_gridRemarks_data')]//tr[%s]//td[3]";

	public static String Refresh_Button_CAR = "Refresh Button>//button[@id='CRR-CRR_btnRefresh']";
	public static String Select_Column_CAR = "Select Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String Arrival_Date_Input_CAR = "Arrival Date Input>//input[@id='CRR-CRR_txtDate_input']";
	public static String Main_Activity_Filter_Input_CAR = "Main Activity Filter Input>//input[@aria-label='Main Activity Name Filter Input']";
	public static String More_Grid_CAR = "More Grid >//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[contains(@id,'nfr_toolpanel_li_id')]";
	public static String Condition_Filter_CAR = "Condition Filter >//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//img[@alt='Condition']";

	public static String Expensive_Report_Btn_CAR = "Expensive report Button>//button[@id='CRR-CRR_btnExpRpt']";
	public static String Expensive_Table_CAR = "Expensive Table>//div[@id='CRR_treeTableEXP']";

	public static String Expensive_Column_Filt_CAR = "Expensive Table Column>//div[@id='CRR_treeTableEXP']//button[@ref='eToggleButton']";
	public static String Expensive_Filter_input_CAR = "Column Filter Input >//div[@id='CRR_treeTableEXP']//input[@aria-label='Filter Columns Input']";
	public static String SelectAll_Checkbox_Expensive_CAR = "Select All Check box>//div[@id='CRR_treeTableEXP']//input[@aria-label='Toggle Select All Columns']";
	public static String Select_Column_Expensive_CAR = "Select Column>//div[@id='CRR_treeTableEXP']//div[@ref='sideBar']//span[text()='%s']";
	public static String Selected_Expensive_Head_CAR = "Selected Expensive Head>//div[@id='CRR_treeTableEXP']//div[@col-id='isPred']//input[@checked='checked']/ancestor::div[@role='row'][1]//div[@col-id='head']";

	public static String Expensive_More_Option_CAR = "More Option>//div[@id='CRR_treeTableEXP_nfr_toolpanel_li_id']";
	public static String Filter_Option_Expensive_CAR = "Filter Option>//a[@id='CRR_treeTableEXP_conditionFilter_id']";

	public static String Expensive_Total_Cost_CAR = "Expensive Total Cost>//div[@id='CRR_treeTableEXP']//div[@col-id='vendorCode' and text()='%s']/ancestor::div[@role='row']//div[@col-id='conTotalCost']";
	public static String Expensive_Vendor_Column_CAR = "Expensive Vendor Column>//div[@id='CRR_treeTableEXP']//div[@col-id='vendorCode' and text()='%s']";
	public static String Submit_Button_CAR = "Submit button>//button[@id='CRR_btnExpSubmit']";
	public static String Approve_button_CAR = "Approve Button>//button[@id='CRR_btnApproveExp']";

	public static String App_Expensive_Table_CAR = "Approved Expensive Table>//div[@id='CRR_treeTableEXPDB_tbl']";
	public static String Approved_Expensive = "Approved Expense>//div[@id='CRR_jTabbedPaneExpenses']//a[text()='Approved Expenses']";
	public static String App_Expensive_Column_Filt_CAR = "Expensive Table Column>//div[@id='CRR_treeTableEXPDB_tbl']//button[@ref='eToggleButton']";
	public static String App_Expensive_Filter_input_CAR = "Column Filter Input >//div[@id='CRR_treeTableEXPDB_tbl']//input[@aria-label='Filter Columns Input']";
	public static String App_SelectAll_Checkbox_Expensive_CAR = "Select All Check box>//div[@id='CRR_treeTableEXPDB_tbl']//input[@aria-label='Toggle Select All Columns']";
	public static String App_Select_Column_Expensive_CAR = "Select Column>//div[@id='CRR_treeTableEXPDB_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String Selected_App_Expensive_Head_CAR = "Selected Approved Expensive Head>//div[@id='CRR_treeTableEXPDB_tbl']//div[@col-id='isPred']//input[@checked='checked']/ancestor::div[@role='row'][1]//div[@col-id='head']";

	public static String App_Expensive_More_Option_CAR = "More Option>//div[@id='CRR_treeTableEXPDB_nfr_toolpanel_li_id']";
	public static String Filter_Option_App_Expensive_CAR = "Filter Option>//a[@id='CRR_treeTableEXPDB_conditionFilter_id']";

	public static String MSC_Column_Filt_CAR = "MSC Table Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//button[@ref='eToggleButton']";
	public static String MSC_Filter_input_CAR = "Column Filter Input >//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//input[@aria-label='Filter Columns Input']";
	public static String MSC_SelectAll_Checkbox_CAR = "Select All Check box>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//input[@aria-label='Toggle Select All Columns']";
	public static String Select_Column_MSC_CAR = "Select Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String MSC_Table_CAR = "MSC Table >//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']";

	public static String CAR_Close_Button = "CAR Close button>//button[@id='CRR-CRR_btnTDRClose']";
	public static String CAR_Closed_Label = "CAR Closed Label>//label[@id='CRR-CRR_lblCARClose']";
	public static String CAR_Open_Button = "CAR Open Button>//button[@id='CRR-CRR_btnTDROpen']";

	public static String Contract_Details_Table_Head_CAR = "Contract Details Table Header>//thead[@id='CRR_gridMessage_head']//th";
	public static String Contract_Details_Table_Row_CAR = "Contract Details Table Row>//tbody[@id='CRR_gridMessage_data']//tr";

	public static String More_Grid_UnPredictable_CAR = "More Grid unpredictable>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_nfr_toolpanel_li_id']";
	public static String Condition_UnPredictable_CAR = "Condition Filter unpredictable>//a[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_conditionFilter_id']";
	public static String Quantity_Column_CAR = "Quantity Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@role='gridcell' and@col-id='quantity']";
	public static String Formula_Column_CAR = "Formula Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@role='gridcell' and@col-id='formula']";

	public static String Agency_Label_CAR = "Agency Label >//label[@id='CRR-CRR_lblagncycode']";

	// 20-02

	public static String expense_report_sidebar_columns = "expense_report_sidebar_columns>//div[@id='CRR_treeTableEXPDB_tbl']//div[@ref='sideBar']//span[.='Columns']";
	public static String expense_report_filter_input = "expense_report_filter_input>//div[@id='CRR_treeTableEXPDB']//input[@aria-label='Filter Columns Input']";
	public static String expense_report_select_all_checkbox = "expense_report_select_all_checkbox>//div[@id='CRR_treeTableEXPDB']//input[@aria-label='Toggle Select All Columns']";
	public static String expense_report_select_column_checkbox = "expense_report_select_column_checkbox>//div[@id='CRR_treeTableEXPDB']//div[@ref='sideBar']//span[text()='%s']";
	public static String total_cost_contract_currency_columns = "total_cost_contract_currency_column>//div[@id='CRR_treeTableEXPDB']//div[@ref='eContainer']//div[.='AED']/following-sibling::div[1]";
	public static String total_cost_usd_first_currency_cells = "total_cost_usd_first_currency>//div[@id='CRR_treeTableEXPDB']//div[@ref='eContainer']//div[.='AED']/following-sibling::div[2]";
	public static String total_cost_usd_contract_columns = "total_usd_cost_currency_column>//div[@id='CRR_treeTableEXPDB']//div[@ref='eContainer']//div[.='USD']/following-sibling::div[1]";
	public static String total_cost_usd_columns = "total_usd_cost_currency_column>//div[@id='CRR_treeTableEXPDB']//div[@ref='eContainer']//div[.='USD']/following-sibling::div[2]";
	public static String expense_report_sum_amount = "expense_report_sum_amount>//div[@id='CRR_treeTableEXPDB']//div[@ref='eStatusBarRight']//span[.='Sum']/following-sibling::span";

	// 21-02

	public static String load_discharge_window = "load_discharge_window>//div[@id='CRR_Jdlgshowoprlistview']//span[.='Load / Discharge Containers']";
	public static String funnel_icon_load_window = "funnel_icon_load_window>//a[@id='CRRopr_view-CRR_gridoprlistview_conditionFilter_id' and @title='Filter']";
	public static String load_window_sidebar_columns = "load_window_sidebar_columns>//div[@id='CRRopr_view-CRR_gridoprlistview_tbl']//button[@ref='eToggleButton']";
	public static String load_window_search_input = "load_window_search_input>//div[@id='CRRopr_view-CRR_gridoprlistview_tbl']//input[@aria-label='Filter Columns Input']";
	public static String load_window_select_column = "load_window_select_column>//div[@id='CRRopr_view-CRR_gridoprlistview_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String load_window_select_all = "load_window_select_all>//div[@id='CRRopr_view-CRR_gridoprlistview_tbl']//div//input[@aria-label='Toggle Select All Columns']";
	public static String load_window_move_status_filter = "load_window_move_status_filter>//input[@aria-label='Move Status Filter Input']";
	public static String load_window_table = "load_window_table>//div[@id='CRRopr_view-CRR_gridoprlistview_tbl']";
	public static String load_window_ok_btn = "load_window_ok_btn>//button[@id='CRRopr_view-CRRDLG_btnOPROK']";
	public static String operation_list_move_status_filter = "operation_list_move_status_filter>//div[@id='OPS-OPS_OpsListGrid_tbl']//input[@aria-label='Move Status Filter Input']";
	public static String service_textfld_Car = "service_textfld_Car>//input[@id='CRR-CRR_txtServiceCode_input']";
	public static String vessel_textfld_Car = "vessel_textfld_Car>//input[@id='CRR-CRR_txtVessel']";
	public static String port_textfld_Car = "port_textfld_Car>//input[@id='CRR-CRR_txtPort']";
	public static String terminal_textfld_Car = "terminal_textfld_Car>//input[@id='CRR-CRR_txtTerminalCode']";
	public static String voyage_textfld_Car = "voyage_textfld_Car>//input[@id='CRR-CRR_txtVoyage']";

	public static String service_search_OpL = "service_search_OpL>//button[@id='OPS-OPS_jBtnSer-OPS_jBtnSer']";
	public static String vessel_search_OpL = "vessel_search_OpL>//button[@id='OPS-OPS_jBtnVsl']";
	public static String voyage_search_OpL = "voyage_search_OpL>//button[@id='OPS-OPS_jBtnVyg']";
	public static String port_search_OpL = "port_search_OpL>//button[@id='OPS-OPS_jBtnPort']";
	public static String terminal_search_OpL = "terminal_search_OpL>//button[@id='OPS-OPS_btnTer']";
	public static String load_btn_opl = "load_btn_opl>//button[@id='OPS-OPS_btnView']";

	// operation list
	public static String opl_sidebar_columns = "opl_sidebar_columns>//div[@id='OPS-OPS_OpsListGrid_tbl']//button[@ref='eToggleButton']";
	public static String opl_select_all = "opl_select_all>//div[@id='OPS-OPS_OpsListGrid_tbl']//div//input[@aria-label='Toggle Select All Columns']";
	public static String opl_search_input = "opl_search_input>//div[@id='OPS-OPS_OpsListGrid_tbl']//input[@aria-label='Filter Columns Input']";
	public static String opl_select_column = "opl_select_column>//div[@id='OPS-OPS_OpsListGrid_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String funnel_icon_opl = "funnel_icon_opl>//a[@id='OPS-OPS_OpsListGrid_conditionFilter_id' and @title='Filter']";
	public static String opl_table = "opl_table>//div[@id='OPS-OPS_OpsListGrid_tbl']";
	public static String load_list = "load_list>//span[.='Load List']";
	public static String discharge_list_btn = "discharge_list_btn>//span[.='Discharge List']";

	// 22-02

	public static String new_button_Act_Mod = "new_button_Act_Mod>//button[@type='button']//div[.='New']";
	public static String activity_code_Act_Mod = "activity_code_Act_Mod>//input[@id='ATY-ATY_txtCode']";
	public static String activity_description_Act_Mod = "activity_description_Act_Mod>//input[@id='ATY-ATY_txtName']";
	public static String activity_type_dd_label = "activity_type_dd_label>//label[@id='ATY-ATY_cmbType_label']";
	public static String activity_type_dd_options = "activity_type_dd_options>//div[@id='ATY-ATY_cmbType_panel']//ul//li[.='%s']";
	public static String contract_type_dd_label = "contract_type_dd_label>//label[@id='ATY-ATY_cmbContractCode_label']";
	public static String contract_type_dd_options = "contract_type_dd_options>//div[@id='ATY-ATY_cmbContractCode_panel']//ul//li[.='%s']";
	public static String add_button_Act_Mod = "add_button_Act_Mod>//button[@id='ATY-ATY_btnaddAct']";
	public static String contract_type_search_icon_Gam = "contract_type_search_icon_Gam>//button[@id='GLO-GLO_btnContract-GLO_btnContract']";
	public static String show_button_Gam_Mod = "show_button_Gam_Mod>//button[@id='GLO-GLO_btnShow']";
	public static String act_code_textfield = "act_code_textfield>//fieldset[@id='GLO-GLO_subactivity']//span[.='Activity Code']/..//input[contains(@id,'GLO_gridActivity')]";
	public static String main_activity_to_map = "main_activity_to_map>//div[@id='GLO-GLO_treeActivity']//li//span[contains(text(),'%s')]";
	public static String plus_icon_Gam = "plus_icon_Gam>//button[@id='GLO-GLO_btnAddTree']/span[1]";

	// vendor_contracts
	public static String search_icon_contract_type_Vc = "search_icon_contract_type_Vc>//button[@id='HAN-HAN_btnContractType-HAN_btnContractType']";
	public static String vendor_code_search_icon_Vc = "vendor_code_search_icon_Vc>//button[@id='HAN-HAN_btnSearVen']";
	public static String valid_from_date_Vc = "valid_from_date_Vc>//input[@id='HAN-HAN_dateFrom_input']";
	public static String valid_To_date_Vc = "valid_To_date_Vc>//input[@id='HAN-HAN_dateTo_input']";

	public static String Select_Contract_Type_CAR = "Select Contract type>//ul[@id='CRR-CRR_cmboCntType_items']//li[text()='%s']";

	public static String regenerate_Btn_CAR = "regenerate_Btn_CAR>//button[@id='CRR_btnGen']";
	public static String expensive_Report_table = "expensive_Report_table>//div[@id='CRR_treeTableEXP_tbl']";
	public static String related_Number_Select = "related_Number_Select>//div[contains(@id,'CRR-CRR_jTabbedPane2-CRR_lstCARNo')]//li[text()='%s']";
	public static String Related_Tab_Click = "Related_Tab_Click>//a[text()='Related']";
	public static String Launch_Tab_Yes_Button = "Launch_Tab_Yes_Button>(//div[@id='nfr_launch_mdl_in_separatewindow_cnf_dlg']//a[contains(@id,'nfr_launch_mdl_in_separatewindow_cnf_form')])[1]";
	public static String Car_No_New_Tab_TF = "Car_No_New_Tab_TF>//input[@id='CRR-CRR_txtTDRNo']";
	public static String Service_TF = "Service_TF>//input[@id='CRR-CRR_txtServiceCode_input']";
	public static String vessel_TF = "vessel_TF>//input[@id='CRR-CRR_txtVessel']";
	public static String port_TF = "port_TF>//input[@id='CRR-CRR_txtPort']";
	public static String terminal_TF = "terminal_TF>//input[@id='CRR-CRR_txtTerminalCode']";
	public static String voyage_Bound_TF = "voyage_Bound_TF>//input[@id='CRR-CRR_txtVoyage']";
	public static String Tool_Pannel_TF = "Tool_Pannel_TF>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_nfr_toolpanel_li_id']";
	public static String Open_Expe_SelectAll_Checkbox = "Open_Expe_SelectAll_Checkbox>//div[@id='CRR_treeTableEXP_tbl']//div[@ref='primaryColsHeaderPanel']//div[@ref='eSelect']/div[@ref='eWrapper']";
	public static String Open_Expense_column_Searchbox = "Open_Expense_column_Searchbox>//div[@id='CRR_treeTableEXP_tbl']//div[@ref='primaryColsHeaderPanel']//child::input[@aria-label='Filter Columns Input']";
	public static String Open_Expense_Colum_CheckBox = "Open_Expense_Colum_CheckBox>//div[@id='CRR_treeTableEXP_tbl']//following::div[@ref='primaryColsListPanel'][1]//span[text()='%s']//preceding::div[@ref='cbSelect'][1]/div";
	public static String Open_Expense_Rows = "Open_Expense_Row>//div[@id='CRR_treeTableEXP_tbl']//div[@ref='eCenterContainer']//div[@role='row']";
	public static String Open_Expense_Rows_New = "Open_Expense_Row>(//div[@id='CRR_treeTableEXP_tbl']//div[@ref='eCenterContainer']//div[@role='row'])[%s]";
	public static String car_Table_Column_Button = "car_Table_Column_Button>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='sideBar']//button[@ref='eToggleButton']";
	public static String car_Table_Column_CheckBox = "car_Table_Column_CheckBox>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='primaryColsHeaderPanel']//div[@ref='eSelect']/div[@ref='eWrapper']";
	public static String car_Table_Column_SearchBar = "car_Table_Column_SearchBar>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='sideBar']//input[@aria-label='Filter Columns Input']";
	public static String car_Table_Checkbox_Select = "car_Table_Checkbox_Select>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//following::div[@ref='primaryColsListPanel'][1]//span[text()='%s']//preceding::div[@ref='cbSelect'][1]/div)[2]";
	public static String car_Condition_Filter = "car_Condition_Filter>(//a[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_conditionFilter_id'])[1]";
	public static String activity_TF_Car = "activity_TF_Car>//input[@aria-label='Activity Filter Input']";
	public static String car_Table = "car_Table>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']";
	public static String activity_Code_TF = "activity_Code_TF>//input[@aria-label='Activity Code Filter Input']";

	public static String UserName_Filter_Input_UCA = "User Name Filter Input>//div[@id='UUM-UUM_dynamicTable']//input[@aria-label='User Name Filter Input']";
	public static String Approval_LimitTable_UCA = "CAR Approval Limit Table>//div[@id='UUM-UUM_dynamicTable']";
	public static String Expense_report = "CAR Expense Report>//button[@id='CRR-CRR_btnExpRpt']";
	public static String CAR_Input = "CAR Input field>//input[@id='CRR-CRR_txtTDRNo']";
	public static String ExpenseReportTab = "CAR Expense Report Tab>//div[@id='CRR_expensedlg']";
	public static String Reject_expense = "CAR Expense Report Reject>//button[@id='CRR_btnRejectExp']";
	public static String Accept_expense = "CAR Expense Report Accept>//button[@id='CRR_btnApproveExp']";
	public static String Edit_Openexpense = "CAR Expense Report Edit open expenses>//button[@id='CRR_btnExpEdit']";
	public static String Remarks_option = "CAR Expense Report Remarks option>//div[@id='CRR_treeTableEXP_tbl']//span[text()='Remarks' and @ref='eName']";
	public static String Remarks_Input = "CAR Expense Report Remarks Input>//textarea[@id='CRR_dlgRemarks-CRR_txtRemarks']";
	public static String UnpredictableTab = "Unpredictable Tab>//a[text()='Unpredictable Reporting']";
	public static String Remark_Ok = "Remark_Ok>//button[@id='CRR_dlgRemarks-CRR_btnRemarkOk']";
	public static String RemarkField = "RemarkField>(//div[@col-id='sendToWDL'])[2]";
	public static String RemarkChecked = "RemarkChecked>//div[@row-id='%s']//div[@col-id='isRemarked']//input[@checked='checked']";
	public static String Update_OpenExpense = "Update_OpenExpense>//button[@id='CRR_btnExpSave']";
	public static String ExpenseReportScroller = "Expense report scroller>//div[@id='CRR_treeTableEXP']//div[@class='ag-body-horizontal-scroll-viewport']";
	public static String Expense_Close = "Expense Close button>//span[@id='CRR_expensedlg_title']//following::a[@aria-label='Close']";
	public static String Service_Search = "Service search>//button[@id='CRR-CRR_btnService-CRR_btnService']";
	public static String Vessel_Search = "Vessel search>//button[@id='CRR-CRR_btnVessel']";
	public static String Terminal_Search = "Terminal search>//button[@id='CRR-CRR_btnTerminal']";
	public static String port_Search = "Port search>//button[@id='CRR-CRR_btnPort']";
	public static String ArrivalDate_Search = "Arrival date search>//button[@id='CRR-CRR_btnArrDate']";
	public static String Show_Button = "Show button>//button[@id='CRR-CRR_solverBtn1']";
	public static String Select_Mode = "Select the mode>//label[@id='CRR-CRR_jComboBox1_label']";
	public static String ColumnFilter = "Column filter>(//span[text()='Columns'])[1]";
	public static String DeselectAll = "Deselect all>//input[@aria-label='Toggle Select All Columns']";
	public static String Filter_Input = "Column Filter input>//input[@aria-label='Filter Columns Input']";
	public static String Given_Row = "GivenRow>//div[@col-id='subactivitydes' and @role='gridcell' and text()='%s']//..";
	public static String Select_Checkbox = "Select the given checkbox>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@row-id='%s'])[1]//input[@type='checkbox']";
	public static String Formula_field = "Formula column field>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@row-id='%s'])[1]//div[@col-id='formula']";
	public static String ToBeReported = "To Be Reported column field>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@row-id='%s'])[1]//div[@col-id='isAutoReported']";
	public static String Variable_Input = "Variable value input>//tbody[@id='CRR-CRR_jTabbedPane1-CRR_gridformulaele_data']//span";
	public static String Simulator = "Simulator>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnSimulate']";
	public static String Totalexpense_Currencybody = "Total expense summary currency body>//tbody[contains(@id,'gridtotalsummary_data')]";
	public static String Totalexpense_Currencyheader = "Total expense summary currency header>//thead[contains(@id,'gridtotalsummary_head')]";
	public static String Ventor = "Ventor>//label[text()='Vendor']";
	public static String MainActivity = "Main activity>//label[text()='Main Activity']";
	public static String TotalExpenses_Column = "Total expenses columns filter>//div[@id='CRR_jTabbedPaneExpenses']//span[text()='Columns']";
	public static String TotalExpenses_Deselect = "Total expenses columns deselect all>//div[@id='CRR_jTabbedPaneExpenses']//input[@aria-label='Toggle Select All Columns']";
	public static String TotalExpenses_input = "Total expenses columns filter input>//div[@id='CRR_jTabbedPaneExpenses']//input[@aria-label='Filter Columns Input']";
	public static String AddAcitivity = "Add Equipments>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnSumAdd']";
	public static String AddSummary_Tab = "Add Summary Tab>//div[@id='addsummary']";

	public static String MainActivityDropdown = "Main Activity dropdown>//label[contains(@id,'activity_label')]";
	public static String MainActivityNameDropdown = "Main Activity Name dropdown>//label[contains(@id,'activitydesc_label')]";
	public static String Eqp_TypeDropdown = "Equipment type dropdown>//label[contains(@id,'activity12_label')]";
	public static String Eqp_StausDropdown = "Equipment Status dropdown>//label[contains(@id,'activity18_label')]";
	public static String Click_Ok = "Add ok>//button[@id='CRRSummary1234-btnsummaryOk']";
	public static String Grid_count = "Total count>//label[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_records_lbl_cnt']";
	public static String CAR_open = "CAR Open>//button[@id='CRR-CRR_btnTDROpen']";
	public static String SelectOption = "Select main activity option>//ul[contains(@id,'CRRSummary1234-CRR_gridsearchsummary')]//li[text()='%s']";
	public static String Remove = "CAR Remove>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnSumRemove']";
	public static String UploadInput = "Attachment input>//input[@id='CRR-tbl-CRR_docAttacher-CRR_nfr_docAttach_fileupload_input']";
	public static String Document_AttachmentPage = "CAR Document attachment page>//div[@id='CRR-tbl-CRR_docAttacher-CRR_nfr_docAttacher']";
	public static String Upload = "CAR Upload>//button[@id='CRR-tbl-CRR_docAttacher-CRR_docAttacherUploadBtn']";
	public static String Close_Attachment = "CAR attachement page close>//div[@id='CRR-tbl-CRR_docAttacher-CRR_nfr_docAttacher']//a[@aria-label='Close']";
	public static String Filename_field = "CAR attachement file name>//div[@id='CRR-tbl-CRR_docAttacher-CRR_docDatatable']//td[text()='%s']";
	public static String Attachment_Download = "CAR attachement download>//button[@id='CRR-tbl-CRR_docAttacher-CRR_docAttacherDownloadAllBtn']";
	public static String GridDownload = "CAR Grid download>(//tbody[@id='CRR-tbl-CRR_docAttacher-CRR_docDatatable_data']//td[text()='%s']//..//button)[1]";
	public static String Removeattchment = "CAR Remove Attachment>//button[@id='CRR-tbl-CRR_docAttacher-CRR_docAttacherRemoveAllBtn']";
	public static String CAR_TreeTable = "CAR Tree table>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_nfr_toolpanel_li_id']";
	public static String CAR_TreeTable_Excel = "CAR Tree table excel>//a[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_exportExcelxlsx_id']";
	public static String CAR_TreeTable_CSV = "CAR Tree table CSV>//a[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_CSV_id']";
	public static String Expense_Excel = "CAR Expense excel>//button[@id='CRR_btnExportAction']";
	public static String ApprovedExpenses = "CAR Approved Expenses>//div[@id='CRR_jTabbedPaneExpenses']//a[text()='Approved Expenses']";
	public static String Predictable_reporting = "CAR Predictable reporting>//a[text()='Predictable Reporting']";
	public static String PR_Deselect = "CAR Predictable reporting column deselect all>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//input[@aria-label='Toggle Select All Columns']";
	public static String PR_FilterInput = "CAR Predictable reporting column Input>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//input[@aria-label='Filter Columns Input']";
	public static String Norecords = "CAR No records>//div[@id='lrp_cust_growl_container']//*[text()='No records Found']";
	public static String Port_sort = "Port sort>//div[@id='nfr-jdlgGrid-div']//span[text()='Port']";
	public static String Select1 = "Select the first result>//div[@row-index='0']//div[@col-id='C1']";
	public static String MappedEquipmentFilter = "Mapped equipment filter>(//label[text()='Filter by Mapped Equipment']//following::input)[1]";
	public static String Contract_Equipment_Value = "Contract equipment value>(//tbody[@id='CEG-CEG_sGrid_data']//td)[2]";
	public static String CAR_Tab = "CAR Tab>//li[@id='mdl1_tabli']";
	public static String Contract_Used = "CAR Contracts used>//button[@id='CRR-CRR_btnShowContracts']";
	public static String Select_Contract = "CAR Select the contract>//tbody[@id='CRR_gridMessage_data']//td[text()='%s']";
	public static String Show_Contract = "CAR Show the contract>//div[@id='copycontractpopupmnu']//a[@id='handling']";
	public static String Vendor_Contracts = "Vendor Contracts grid>//div[@id='HAN-HAN_gridCost']";
	public static String Vendor_Columns = "Vendor Columns filter>//div[@id='HAN-HAN_gridCost']//span[text()='Columns']";
	public static String Vendor_Columns_deselect = "Vendor Columns filter deselect>//div[@id='HAN-HAN_gridCost']//input[@aria-label='Toggle Select All Columns']";
	public static String Vendor_Columns_input = "Vendor Columns filter input>//div[@id='HAN-HAN_gridCost']//input[@aria-label='Filter Columns Input']";
	public static String Vendor_Amount = "Vendor Amount>//div[@id='HAN-HAN_gridCost']//div[@col-id='head' and text()='%s']/..//div[@col-id='rate']";
	public static String Vendor_TreeTable = "Vendor Tree table>//div[@id='HAN-HAN_gridCost_nfr_toolpanel_li_id']";
	public static String Vendor_Filter = "Vendor Condition filter>(//a[@id='HAN-HAN_gridCost_conditionFilter_id'])[2]";
	public static String Eqp_Filter = "Eqp Condition filter>//input[@aria-label='Equipment Type Filter Input']";
	public static String UnPredictable_reporting_columns = "CAR UnPredictable reporting column filter>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//span[text()='Columns']";
	public static String UPR_Deselect = "CAR UnPredictable reporting column deselect all>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//input[@aria-label='Toggle Select All Columns']";
	public static String UPR_FilterInput = "CAR Predictable reporting column Input>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//input[@aria-label='Filter Columns Input']";
	public static String Tab2 = "Tab2>//label[@id='mdl2_tablbl']";
	public static String Close_VendorTab = "Close the ventor tab>(//i[@class='fa fa-remove mdlclose'])[3]/..";
	public static String Contract_type = "Contract Type dropdown>//label[@id='CRR-CRR_cmboCntType_label']";
	public static String Arrival_Date = "CAR Arrival date>//input[@id='CRR-CRR_txtDate_input']";
	public static String Port_Input = "Port Input>//input[@id='CRR-CRR_txtPort']";
	public static String Terminal_Input = "Terminal Input>//input[@id='CRR-CRR_txtTerminalCode']";
	public static String Close_Tab2 = "Close the tab>(//i[@class='fa fa-remove mdlclose'])[2]/..";
	public static String Contract_Details_Header = "Contract_Details_Header>//thead[@id='CRR_gridMessage_head']//th";
	public static String Contract_Details_Body = "Contract_Details_Body>//tbody[@id='CRR_gridMessage_data']//tr";
	public static String Show_Contract_Mapping = "Show_Contract_Mapping>//div[@id='copycontractpopupmnu']//a[@id='contmap']";
	public static String ContractNo_Input = "ContractNo_Input>//input[@id='CMP-CMP_txtContractNo']";
	public static String ContractMapping_Screen = "ContractMapping_Screen>//form[@id='CMP']";
	public static String VendorContracts_Screen = "VendorContracts_Screen>//form[@id='HAN']";
	public static String VendorContracts_Number = "VendorContracts_Number>//input[@id='HAN-HAN_txtContractNo']";
	public static String CarSummary_Table = "CarSummary_Table>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']";
	public static String CarSummary_Activities = "CarSummary_GridActivity>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']//div[@row-id='%s']//div[@col-id='mainactdes']";
	public static String CarSummary_EqpType = "CarSummary_EqpType>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']//div[@row-id='%s']//div[@col-id='eqptype']";
	public static String Grp_Eqp = "Grp_Eqp>//button[@id='CRR-CRR_btnEqpSummary']";
	public static String Grp_Eqpsummary_Mainactivity = "Grp_Eqpsummary_Mainactivity>//div[@id='CRR_EqpTabbedPane1-CRR_gridEqp_summary_tbl']//div[@row-id='%s']//div[@col-id='mainactdes']";
	public static String Grp_Eqpsummary_Eqp = "Grp_Eqpsummary_Eqp>//div[@id='CRR_EqpTabbedPane1-CRR_gridEqp_summary_tbl']//div[@row-id='%s']//div[@col-id='eqptype']";
	public static String GES_Count = "GES_Count>//label[@id='CRR_EqpTabbedPane1-CRR_gridEqp_summary_records_lbl_cnt']";
	public static String GE_SummaryTab = "GE_SummaryTab>//a[text()='Group Equipment Summary']";
	public static String GES_Filter = "GES_Filter>(//a[@id='CRR_EqpTabbedPane1-CRR_gridgrpEqp_summary_conditionFilter_id'])[2]";

	public static String GES_Records = "GES_Records>//label[@id='CRR_EqpTabbedPane1-CRR_gridgrpEqp_summary_records_lbl_cnt']";

	public static String GES_Summary_Activity = "GES_Summary_Activity>//div[@id='CRR_EqpTabbedPane1-CRR_gridgrpEqp_summary_tbl']//div[@row-id='%s']//div[@col-id='mainactdes']";
	public static String GES_Summary_eqptype = "GES_Summary_Activity>//div[@id='CRR_EqpTabbedPane1-CRR_gridgrpEqp_summary_tbl']//div[@row-id='%s']//div[@col-id='grpEqp']";

	public static String CAR_CurrecnyGrid = "GES_Summary_Activity>(//tbody[contains(@id,'gridtotalsummary_data')]//tr[@data-ri='%s']//td)[1]";
	public static String CAR_CurrecnyGridamount = "CAR_CurrecnyGridamount>(//tbody[contains(@id,'gridtotalsummary_data')]//tr[@data-ri='%s']//input)[1]";
	public static String CAR_Totalexpense = "CAR_Totalexpense>(//div[@col-id='conTotalCost' and @role='gridcell'])[%s]";
	public static String CARChecked_Verify = "CARChecked_Verify>(//div[@id='CRR_jTabbedPaneExpenses']//div[@col-id='sendToWDL' and @role='gridcell'])[%s]//input[@checked='checked']";
	public static String ServiceTax_Count = "ServiceTax_Count>//label[@id='SVT-SVT_gridserTax_records_lbl_cnt']";
	public static String ServiceTax_Grid = "ServiceTax_Grid>(//div[@id='SVT-SVT_gridserTax_tbl']//div[@row-index='%s']//div[@col-id])[1]";
	public static String CopyTaxDetail = "CopyTaxDetail>//span[text()='Copy Tax Detail']";
	public static String PasteTaxDetail = "PasteTaxDetail>//span[text()='Paste Tax Detail']";
	public static String Group_Ok = "Group_Ok>//button[@id='CRR_jButton1']";
	public static String Apply_popup_Message = "Apply_popup_Message>//div[@class='ui-growl-message']//p";

	public static String CAR_Amount_field = "CAR_Amount_field>//div[@col-id='subactivitydes' and text()='%s']//following::div[@col-id='quantity']";
	public static String Misc_Columns = "Misc_Columns>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR']//span[text()='Columns']";
	public static String Misc_FilterInput = "Misc_FilterInput>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR']//input[@aria-label='Filter Columns Input']";
	public static String Misc_FilterDeselect = "Misc_FilterDeselect>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR']//input[@aria-label='Toggle Select All Columns']";
	public static String Remove_Misc = "Remove_Misc>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscRemove']";
	public static String Select_activity = "Select_activity>//div[@col-id='actdesc' and @role='gridcell' and text()='%s']";
	public static String RemoveTax = "RemoveTax>//span[text()='Remove Item']";
	
	public static String ServiceTax_Value = "MSC Table Service tax>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='serviceTaxNO']";
	public static String Taxdetails = "MSC TTaxdetails>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='%s']";


	public static String MSC_table_Activity_Column_CAR_New = "MSC Table Activity Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@role='gridcell' and @col-id='actcode' and text()='%s'])[last()]";
	public static String MSC_table_Quantity_Column_CAR_New = "MSC Table Quantity Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='qty'])[last()]";
	public static String MSC_table_Quantity_input_CAR_New = "MSC Table Quantity Input>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='qty']//input[@type='text'])[last()]";
	public static String MSC_Table_EqpType_Column_CAR_New = "MSC Table Eqp Type Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='type'])[last()]";
	public static String MSC_Table_Vendor_Code_Column_CAR_New = "MSC Table Vendor Code Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='vendor'])[last()]";
	public static String MSC_Table_Amount_Column_CAR_New = "MSC Table Amount Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='amount'])[last()]";
	public static String MSC_Table_Amount_Input_CAR_New = "MSC Table Amount Input>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='amount']//input[@type='text'])[last()]";
	public static String MSC_Table_Activity_Filter_input_CAR_New = "MSC Table Activity Filter Input>//input[@aria-label='Activity Filter Input']";
	public static String MSC_Table_Cuurency_Column_CAR_New = "MSC Table Currency Column Input>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='currency'])[last()]";
	public static String MSC_Table_Cuurency_option_CAR_New = "MSC Table Currency Input>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actcode' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='currency'])[last()]//*[text()='CZK']";


	// Service Tax
	public static String Type_Search = "Tax type search>//button[@id='SVT-SVT_btnContract']";
	public static String TaxDate = "Service Tax valid from>//input[@id='SVT-SVT_txtfmdate_input']";
	public static String Tax_ValidTo = "Service Tax valid To>//input[@id='SVT-SVT_txttodate_input']";
	public static String Tax_Port_Search = "Service Tax Port search>//button[@id='SVT-SVT_btnPort']";
	public static String Tax_Terminal_Search = "Service Tax Terminal search>//button[@id='SVT-SVT_btnTerminal']";
	public static String Tax_Show = "Service Tax Terminal Show>//button[@id='SVT-SVT_btnshow']";
	public static String ServiceTax_Filter = "Service Tax Filter>(//a[@id='SVT-SVT_gridserTax_conditionFilter_id'])[2]";
	public static String ActivityCode_Filter = "ActivityCode_Filter>//input[@aria-label='Activity Code Filter Input']";
	public static String ActivityName_Filter = "ActivityName_Filter>//input[@aria-label='Activity Name Filter Input']";
	public static String Head_Filter = "Head_Filter>//input[@aria-label='Head Filter Input']";
	public static String Activity1 = "Activity1>(//div[@col-id='activity'])[2]";
	public static String CreateTax = "CreateTax>//span[text()='Create Tax Detail']";
	public static String TypeOfTax = "TypeOfTax>//label[@id='SVT-SVT_gridTax-0-SVT_gtaxcode1_label']";
	public static String Select_TypeOfTax = "Select_TypeOfTax>//ul[contains(@id,'SVT-SVT_gridTax-0-SVT_g')]//li[text()='%s']";
	public static String ChargeType = "ChargeType>//label[@id='SVT-SVT_gridTax-0-SVT_gchargetype_label']";
	public static String PercentageInput = "PercentageInput>//input[@id='SVT-SVT_gridTax-0-SVT_txtpercnt_input']";
	public static String Activity_Dropdown = "Activity_Dropdown>//label[@id='SVT-SVT_gridTax-0-SVT_gactcode_label']";
	public static String PercentageInputField = "PercentageInputField>(//tbody[@id='SVT-SVT_gridTax_data']//td)[3]//div";
	public static String Activity_Dropdown_click = "Activity_Dropdown click>//div[@id='SVT-SVT_gridTax-0-SVT_gactcode']";
	public static String ApplyTax = "ApplyTax click>//button[@id='SVT-SVT_btnApply']";
	public static String Disbursement_Status = "Disbursement_Status>//div[@col-id='sendtowdl' and @role='gridcell']";
	public static String Approved_Columns = "Approved_Columns>//div[@id='CRR_treeTableEXPDB_tbl']//span[text()='Columns']";
	public static String Approved_Deselect = "Approved_Deselect>//div[@id='CRR_treeTableEXPDB_tbl']//input[@aria-label='Toggle Select All Columns']";
	public static String Approved_FilterInput = "Approved_FilterInput>//div[@id='CRR_treeTableEXPDB_tbl']//input[@aria-label='Filter Columns Input']";

	// User level security
	public static String ULS_UserSearch = "User level security username>//button[@id='UMM-UMM_btnSearchName-UMM_btnSearchName']";
	public static String Activity_Filter = "User level security activity filter>//input[@id='UMM-UMM_treeActivitysub_filter']";
	public static String CostActivity_Select = "Select the cost activity report>//li[contains(@id,'UMM-UMM_treeActivitysub')]//span[contains(text(),'Cost Activity Report')]";
	public static String Functional_privilege_Header = "User level security Functional privilege header>//div[@id='UMM-UMM_subGrid']//thead[@id='UMM-UMM_subGrid_head']//tr//th";
	public static String Functional_privilege_Body = "User level security Functional privilege body>//tbody[@id='UMM-UMM_subGrid_data']//tr";
	public static String Select_ContractType = "Select the contract type>//ul[@id='CRR-CRR_cmboCntType_items']//li[text()='%s']";
	public static String Select_ModeOption = "Select the MOde>//ul[@id='CRR-CRR_jComboBox1_items']//li[text()='%s']";
	public static String Show_TotalCurrency = "Show total currency>//button[@id='CRR_btnMscSummary']";
	public static String STXNo = "STXNo>//input[@id='SVT-SVT_txtServiceTaxNo']";
	public static String contract_Type_Dropdown = "contract_Type_Dropdown>//div[@id='CRR-CRR_cmboCntType']";

	public static String activity_Select = "activity_Select>//div[@id='SVT-SVT_gridserTax_tbl']//div[@ref='eContainer']//div[text()='%s']//following::div[text()='%s']";
	public static String activity_Typ_Select = "activity_Typ_Select>(//ul[contains(@id,'SVT-SVT_gridTax-0-SVT_g')]//li[text()='AB'])[2]";
	public static String contrac_Type_Field_Select = "contrac_Type_Field_Select>//input[@id='SVT-SVT_txtContractType']";
	public static String copy_Tax = "copy_Tax>//div[@aria-label='Context Menu']//span[text()='Copy Tax Detail']";
	public static String paste_Tax = "paste_Tax>//div[@aria-label='Context Menu']//span[text()='Paste Tax Detail']";
	public static String service_Tax_Table = "service_Tax_Table>//div[@id='SVT-SVT_gridserTax_tbl']//div[@row-id]";

	public static String Expensive_Currency_CAR = "Expensive Currency>	//div[@id='CRR_treeTableEXP']//div[@col-id='vendorCode' and text()='%s']/ancestor::div[@role='row']//div[@col-id='conCurrency']";
	public static String Approved_Expensive_CAR = "Approved Expense>//div[@id='CRR_jTabbedPaneExpenses']//a[text()='Approved Expenses']";
	public static String App_Expense_table_Data = "App_Expense table data>//div[@id='CRR_treeTableEXPDB_tbl']//div[@role='gridcell']";

	public static String IsPredictable_Check_CAR = "Is predictable Checkbox>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@role='gridcell' and@col-id='isAutoReported']//input[@ref='eInput']";

	public static String Close_Expense_CAR = "Close Icon>//div[@id='CRR_expensedlg']//a[@aria-label='Close']";

	public static String Value_Input_Column_CAR = "Value input Column >//tbody[@id='CRR-CRR_jTabbedPane1-CRR_gridformulaele_data']//tr//td[2]";
	public static String Value_Input_CAR = "Value input >//tbody[@id='CRR-CRR_jTabbedPane1-CRR_gridformulaele_data']//tr//td[2]//input";
	public static String Apply_Button_CAR = "Apply button>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnApplyVariable']";

	public static String ADD_button_MSC_CAR = "Add button>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscAdd']";
	public static String Activity_Search_List_CAR = "Activity Search List>//div[@id='nfr_sch_multicolumn']";
	public static String Select_Activity_Column_CAR = "Select Activity Column>//div[@id='nfr_sch_multicolumn']//div[@role='gridcell' and text()='%s']";
	public static String Select_button_MSC_CAR = "Select button>//button[@id='multicol_okbtn']";

	public static String MSC_Equipment_Type_Button_CAR = "Equipment Type button>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscEqpType']";
	public static String MSC_Vendor_Code_Button_CAR = "Vendor Code Button>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscVendorCode']";// ven104

	public static String MSC_Submit_button_CAR = "Submit Button>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscSubmit']";
	public static String MSC_Approve_button_CAR = "Approve Button>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscApprove']";
	public static String MSC_Reject_Button_CAR = "Reject button>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscReject']";

	public static String CAR_Number_Input_CAR = "CAR Number input>//input[@id='CRR-CRR_txtTDRNo']";
	public static String Total_Quantity_CAR_Summary = "Total Quantity in CAR Summary>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']//div[@col-id='totalops' and @role='gridcell']";
	public static String More_Option_Grid_CAR = "More Option>//button[@id='CRR-CRR_rightMenu']";
	public static String Local_ICD_Info_option_CAR = "Local/ICD Info>//div[@id='CRR-CRR_menu' and contains(@style,'display: block')]//a[@id='CRR-CRR_mnuloadcnt']";

	public static String Local_ICD_Window_CAR = "Local/ICD Info Window>//div[@id='CRR_Jdlgshowcostsummary']";
	public static String Local_ICD_Container_Count_CAR = "Local ICD Container Count>//div[@id='CRRcostsummary-CRR_totalCostsummary_tbl']//div[@role='gridcell' and @col-id='cnt']";
	public static String Local_ICD_Window_OK_Btn_CAR = "Local/ICD Info Window Ok button>//button[@id='CRRcostsummary-CRR_btnOk2']";

	public static String Activity_Green_Row_CAR = "Activity Green Row>//div[@id='CRR_treeTableEXPDB_tbl']//div[contains(@class,'lightgreen') and @role='row']";
	public static String Disbursment_Column_Expense_CAR = "Disbursment Column Expense>//div[@id='CRR_treeTableEXPDB_tbl']//div[contains(@class,'lightgreen') and @role='row']//div[@col-id='wdlNoSet']";
	public static String Activity_name_Expense_CAR = "Activity Name>//div[@id='CRR_treeTableEXPDB_tbl']//div[@ref='eContainer']//div[not(contains(@class,'lightgreen')) and @role='row']//div[@col-id='activityName']";

	public static String MSC_Activity_Green_Row_CAR = "Msc activity Green row>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[contains(@class,'lightgreen') and @role='row']";
	public static String MSC_table_Disbursement_CAR = "Msc table Disbursement>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[contains(@class,'lightgreen') and @role='row']//div[@col-id='wdlNoSet']";
	public static String MSC_Actvity_Name_table_CAR = "MSC table Activity Name>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='eContainer']//div[not(contains(@class,'lightgreen')) and @role='row']//div[@col-id='actdesc']";

	public static String MSC_Activity_Yellow_Row_CAR = "Msc activity Yellow row>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[contains(@class,'yellow') and @role='row']";
	public static String MSC_ActvityName_table_CAR = "MSC table Activity Name>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='eContainer']//div[contains(@class,'yellow') and @role='row']//div[@col-id='actdesc']";

	public static String DropDown_Select = "DropDown_Select>//div[contains(@id,'panel') and contains(@style,'display: block;')]//li[text()='%s']";
	public static String NewButton_ToolBar = "New Button Tool Bar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblNew')]";
	public static String SaveButton_ToolBar = "Save Button Tool Bar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnsave')]";
	public static String popup = "popup>//div[@id='lrp_cust_growl_container']//p";
	public static String SearchButton_Toolbar = "Search Button in tool bal>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblJdlgSearch')]";
	public static String Delete_button_toolBar = "Delete button in Tool Bar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblDelete')]";
	public static String Save_button_toolBar = "Save_button_toolBar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnsave')]";
	public static String Edit_Button_toolBar = "Edit Button Toolbar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblEdit')]";

///  Activity

	public static String switch_Button = "switch_Button>//div[text()='Switch']/parent::button";
	public static String activity_Code_Textfield = "activity_Code_Textfield>//input[@id='ATY-ATY_txtCode']";
	public static String activity_Description_Textfield = "activity_Description_Textfield>//input[@id='ATY-ATY_txtName']";
	public static String activity_Type_Dropdown = "activity_Type_Dropdown>//div[@id='ATY-ATY_cmbType']";
	public static String port_Add_Button = "port_Add_Button>//button[@id='ATY-ATY_portAdd']";
	public static String portCode_Filter = "portCode_Filter>//label[text()='Filter by Port Code']/following-sibling::input[contains(@id,'ATY_portgrid') and contains(@name,'filter')]";
	public static String portList_Filter_Checkbox = "portList_Filter_Checkbox>//td[text()='%s']/preceding-sibling::td[@role='gridcell']/div/div[contains(@class,'ui-chkbox-box')]";
	public static String portList_Filter_Ok_Button = "portList_Filter_Ok_Button>//button[@id='ATY_viewDlgBtnOk']";
	public static String activity_Add_Button = "activity_Add_Button>//button[@id='ATY-ATY_btnaddAct']";
	public static String activity_Currency_Gridcell = "activity_Currency_Gridcell>//tbody[@id='ATY-ATY_portGrid_data']/tr/td[contains(@class,'editable-column')]/div[contains(@class,'cell-editor')]/div[contains(@class,'ui-cell-editor-input')]/div[contains(@id,'ATY_cmbCur')]//ancestor::td[contains(@class,'editable-column')]";
	public static String activity_Amount_Gridcell = "activity_Amount_Gridcell>//tbody[@id='ATY-ATY_portGrid_data']/tr/td[contains(@class,'editable-column')]/div[contains(@class,'cell-editor')]/div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'ATY_amnt')]//ancestor::td[contains(@class,'editable-column')]";
	public static String activity_Currency_Gridcell_Dropdown = "activity_Currency_Gridcell_Dropdown>//tbody[@id='ATY-ATY_portGrid_data']/tr/td//label[contains(@id,'ATY_cmbCur_label')]";
	public static String activity_Amount_Gridcell_Input = "activity_Amount_Gridcell_Input>//tbody[@id='ATY-ATY_portGrid_data']/tr/td[contains(@class,'editable-column')]/div[contains(@class,'cell-editor')]/div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'ATY_amnt')]/input[@role='textbox']";

	////////////////// Cost Inbox
	///

	public static String date_cost_Inbox = "date_cost_Inbox>//input[@id='CIX-CIX_ipDate_input']";
	public static String vessel_Type_CI = "vessel_Type_CI>//div[@id='CIX-CIX_buttonVesselType']/div/input/following-sibling::span[text()='%s']";
	public static String show_Button_CI = "show_Button_CI>//button[@id='CIX-CIX_btnShow']";
	public static String approved_Toggler_CI = "approved_Toggler_CI>//span[text()='Approved']/ancestor::li[@data-nodetype='service']/span[@role='treeitem']/span[contains(@class,'ui-tree-toggler')]";
	public static String car_Tree_Item_CI = "car_Tree_Item_CI>//li[@data-nodetype='iconp']//span[text()='CAR']";
	public static String ag_Grid_ToolPanel_Button_CI = "ag_Grid_ToolPanel_Button_CI>//div[@id='CIX-CIX_carGrid_nfr_toolpanel_li_id']";
	public static String conditionFilter_AG_Grid_CI = "conditionFilter_AG_Grid_CI>//div[@id='CIX-CIX_carGrid_toolpanel']/ul/li//a[@id='CIX-CIX_carGrid_conditionFilter_id']";
	public static String report_ID_Filter_CI = "report_ID_Filter_CI>//input[@aria-label='Report ID Filter Input']";
	public static String portCode_Gridcell_CI = "portCode_Gridcell_CI>//div[@col-id='reportid' and text()='%s']/following-sibling::div[@col-id='portcode']";
	public static String serviceCode_Gridcell_CI = "serviceCode_Gridcell_CI>//div[@col-id='reportid' and text()='%s']/following-sibling::div[@col-id='servicecode']";
	public static String vesselCode_Gridcell_CI = "vesselCode_Gridcell_CI>//div[@col-id='reportid' and text()='%s']/following-sibling::div[@col-id='vesselcode']";
	public static String arrivalDate_Gridcell_CI = "arrivalDate_Gridcell_CI>//div[@col-id='reportid' and text()='%s']/following-sibling::div[@col-id='arrdate']";
	public static String carStatus_Gridcell_CI = "car_Status_Gridcell_CI>//div[@col-id='reportid' and text()='%s']/following-sibling::div[@col-id='carstatus']";
	public static String enable_Supplementary_CAR_Gridcell_CI = "enable_Supplementary_CAR_Gridcell_CI>//div[@col-id='reportid' and text()='%s']/following-sibling::div[@col-id='crsupplement']/input[@type='checkbox']";
	public static String enable_Supplementary_Button_CI = "enable_Supplementary_Button_CI>//button[@id='CIX-CIX_btncarsupplement']";
	public static String cost_Inbox_Module = "cost_Inbox_Module>//a/label[text()='Cost Inbox']";
	public static String terminalCode_Gridcell_CI = "terminalCode_Gridcell_CI>//div[@col-id='reportid' and text()='%s']/following-sibling::div[@col-id='terminalcode']";
	public static String contractType_Gridcell_CI = "contractType_Gridcell_CI>//div[@col-id='reportid' and text()='%s']/following-sibling::div[@col-id='contracttype']";
	public static String mode_Gridcell_CI = "mode_Gridcell_CI>//div[@col-id='reportid' and text()='%s']/following-sibling::div[@col-id='mode']";

	////////////// PTC Master setup
	///

	public static String valid_From_Date_PTM = "valid_From_Date_PTM>//input[@id='PTM-PTM_validfrmclndr_input']";
	public static String valid_To_Date_PTM = "valid_To_Date_PTM>//input[@id='PTM-PTM_validtoclndr_input']";
	public static String port_Search_Button_PTM = "port_Search_Button_PTM>//input[@id='PTM-PTM_portcode']/parent::div/button";
	public static String terminal_Search_Button_PTM = "terminal_Search_Button_PTM>//input[@id='PTM-PTM_terminalcode']/parent::div/button";
	public static String vendor_Search_Button_PTM = "vendor_Search_Button_PTM>//input[@id='PTM-PTM_Vendorcode']/parent::div/button";
	public static String subActivity_Add_Button_PTM = "subActivity_Add_Button_PTM>//button[@id='PTM-PTM_btnsubactadd']";
	public static String add_Button_PTM = "add_Button_PTM>//button[@id='PTM-PTM_btnaddAct']";
	public static String PTC_Master_Setup_Module = "PTC_Master_Setup_Module>//li[@moduleid='PTM']/a/label[text()='PTC Master Setup']";
	public static String subActivityCode_Gridcells_CI = "subActivityCode_Gridcells_CI>//div[@col-id='subactcode' and @role='gridcell']";
	public static String vendorCode_Gridcells_CI = "vendorCode_Gridcells_CI>//div[@col-id='vencode' and @role='gridcell']";
	public static String subActivityCode_Gridcells_List_CI = "subActivityCode_Gridcells_List_CI>(//div[@col-id='subactcode' and @role='gridcell'])[%s]";
	public static String vendorCode_Gridcells_List_CI = "vendorCode_Gridcells_List_CI>(//div[@col-id='vencode' and @role='gridcell'])[%s]";

////////CAR
///

	public static String add_Button_CAR_Summary = "add_Button_CAR_Summary>//button[contains(@id,'CRR_btnSumAdd')]";
	public static String add_Button_Misc = "add_Button_Misc>//button[contains(@id,'CRR_btnMscAdd')]";
	public static String activity_Code_Filter_CAR = "activity_Code_Filter_CAR>//input[@aria-label='Activity Code Filter Input']";
	public static String activity_Search_Checkbox_CAR = "activity_Search_Checkbox_CAR>//div[text()='%s']/preceding-sibling::div//div[@ref='eCheckbox']/div[@ref='eWrapper']";
	public static String mutiColumn_Select_Button = "mutiColumn_Select_Button>//button[@id='multicol_okbtn']";
	public static String vendorCode_Button = "vendorCode_Button>//button[contains(@id,'CRR_btnMscVendorCode')]";
	public static String mics_Row = "mics_Row>//div[@col-id='actcode' and text()='%s']";
	public static String amount_Gridcell_Mics = "amount_Gridcell_Mics>//div[@col-id='amount' and @role='gridcell']";
	public static String amount_Gridcell_Inputfield_Mics = "amount_Gridcell_Inputfield_Mics>//div[@col-id='amount' and @role='gridcell']//input[contains(@id,'amount_input')]";
	public static String car_Close_Button = "car_Close_Button>//button[@id='CRR-CRR_btnTDRClose']";
	public static String CAR_Module = "CAR_Module>//a/label[text()='Cost Activity Report (CAR) ']";
	public static String totalCost_Gridcell_UnPre = "totalCost_Gridcell_UnPre>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@role='gridcell' and@col-id='totalCost']";
	public static String apply_Variable_Button_UnPre_CAR = "apply_Variable_Button_UnPre_CAR>//button[contains(@id,'CRR_btnApplyVariable')]";
	public static String value_Gridcell_UnPred_CAR = "value_Gridcell_UnPred_CAR>//tbody[contains(@id,'CRR_gridformulaele_data')]/tr/td[contains(@class,'editable-column')]";
	public static String value_Gridcell_Input_UnPred_CAR = "value_Gridcell_Input_UnPred_CAR>//tbody[contains(@id,'CRR_gridformulaele_data')]/tr/td[contains(@class,'editable-column')]//div[contains(@class,'cell-editor-input')]/input[contains(@id,'CRR_foramtin')]";
	public static String isMandatory_Checkbox_UnPredi_CAR = "isMandatory_Checkbox_UnPredi_CAR>//div[contains(@id,'CRR_gridActivity')]//div[@col-id='ismandptc' and @role='gridcell']/input[@type='checkbox']";
	public static String predictable_Table_Toolpanel_CAR = "predictable_Table_Toolpanel_CAR>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridPredictable_nfr_toolpanel_li_id']";
	public static String predictable_Table_Condition_Filter_CAR = "predictable_Table_Condition_Filter_CAR>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridPredictable_toolpanel']/ul/li/a[@id='CRR-CRR_jTabbedPane1-CRR_gridPredictable_conditionFilter_id']";
	public static String mainActivityName_Unpred_CAR = "mainActivityName_Unpred_CAR>//div[@col-id='mainActName' and @role='gridcell']";
	public static String predictable_MainActivity_Column_CAR = "predictable_MainActivity_Column_CAR>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridPredictable_tbl']//div[@col-id='mainActName' and text()='%s']";
	public static String predictable_SubActivity_Column_CAR = "predictable_SubActivity_Column_CAR>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridPredictable_tbl']//div[@col-id='subactivitydes' and text()='%s']";

	//////////// Vendor contract
	///

	public static String vendor_Contract_Table_Row = "vendor_Contract_Table_Row>(//div[@id='HAN-HAN_gridCost_tbl']//div[@role='rowgroup' and @ref='eContainer']//div[@col-id='activity'])[%s]";
	public static String subActivity_Table_Row_GAM = "subActivity_Table_Row_GAM>//tbody[@id='GLO-GLO_gridActivity_data']/tr";
	public static String contract_No_VC = "contract_No_VC>//input[@id='HAN-HAN_txtContractNo']";
	public static String accept_Button_VC = "accept_Button_VC>//button[@id='HAN-HAN_btnAccept']";
	public static String port_Plus_Button_CM = "port_Plus_Button_CM>//button[@id='CMP-CMP_btnAddPort']";
	public static String terminal_Gridcell_CM = "terminal_Gridcell_CM>//tbody[@id='CMP_gridTerminal_data']/tr/td[3]";
	public static String terminal_Select_Checkbox_CM = "terminal_Select_Checkbox_CM>//tbody[@id='CMP_gridTerminal_data']/tr/td[text()='%s']/preceding-sibling::td/input[@type='checkbox']";
	public static String terminal_Select_Ok_Button_CM = "terminal_Select_Ok_Button_CM>//button[@id='CMP_gridTerminalok']";
	public static String port_Mapping_ID_Textfield_CM = "port_Mapping_ID_Textfield_CM>//input[@id='CMP-CMP_txtTemplateNo']";
	public static String Message_Ok_Button_CAR = "Message_Ok_Button_CAR>//button[@id='CRRSRL_btnOkClose2']";
//	public static String CAR_Module="CAR_Module>//a/label[text()='Cost Activity Report (CAR) ']";
//	public static String CAR_Module="CAR_Module>//a/label[text()='Cost Activity Report (CAR) ']";

	/////////// Predictable activity behaviour
	///

	public static String contract_Type_Dropdown_PAB = "contract_Type_Dropdown_PAB>//div[@id='ABH-ABH_cmbContracType']";
	public static String fromDate_PAB = "fromDate_PAB>//input[@id='ABH-ABH_txtFrom_input']";
	public static String toDate_PAB = "toDate_PAB>//input[@id='ABH-ABH_txtTo_input']";
	public static String port_SearchButton_PAB = "port_SearchButton_PAB>//button[@id='ABH-ABH_btnPort']";
	public static String terminal_SearchButton_PAB = "terminal_SearchButton_PAB>//button[@id='ABH-ABH_btnTerminal']";
	public static String show_Button_PAB = "show_Button_PAB>//button[@id='ABH-ABH_btnShow']";
//	public static String terminal_Select_Checkbox_CM="terminal_Select_Checkbox_CM>//tbody[@id='CMP_gridTerminal_data']/tr/td[text()='%s']/preceding-sibling::td/input[@type='checkbox']";
//	public static String terminal_Select_Ok_Button_CM="terminal_Select_Ok_Button_CM>//button[@id='CMP_gridTerminalok']";
//	public static String CAR_Module="CAR_Module>//a/label[text()='Cost Activity Report (CAR) ']";
//	public static String CAR_Module="CAR_Module>//a/label[text()='Cost Activity Report (CAR) ']";
//	public static String CAR_Module="CAR_Module>//a/label[text()='Cost Activity Report (CAR) ']";
//	public static String CAR_Module="CAR_Module>//a/label[text()='Cost Activity Report (CAR) ']";

	////
	public static String predictable_Activity_Column_CAR = "Predictable Activity Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridPredictable']//div[@col-id='subactivitydes' and text()='%s']";
	public static String Select_ColumnValue_Predictable_CAR = "Select_ColumnValue_Predictable_CAR>//div[contains(@id,'CRR_gridPredictable_tbl')]//div[@ref='sideBar']//span[text()='%s']";
	public static String expensive_Activity_Name_Grid_CAR = "Expensive_Activity_Name_Grid_CARt>//div[@id='CRR_treeTableEXP']//div[@col-id='activityName' and text()='%s']";
	public static String vendorCodes_List_CAR = "vendorCodes_List_CAR>//div[@col-id='vendorCode' and @role='gridcell']";
	public static String vendorCodes_CAR = "vendorCodes_CAR>(//div[@col-id='vendorCode' and @role='gridcell'])[%s]";
	public static String activityCodes_List_CAR = "activityCodes_List_CAR>//div[@col-id='subactivity' and @role='gridcell']";
	public static String activityCodes_CAR = "sub_ActivityCodes_CAR>(//div[@col-id='subactivity' and @role='gridcell'])[%s]";

	public static String Predictable_ActivityCodes_CAR = "Predictable_ActivityCodes_CAR>(//div[contains(@id,'CRR_gridPredictable_tbl')]//div[@col-id='subactivity' and @role='gridcell'])[%s]";
	public static String Predictable_ActivityCodes_List_CAR = "Predictable_ActivityCodes_List_CAR>//div[contains(@id,'CRR_gridPredictable_tbl')]//div[@col-id='subactivity' and @role='gridcell']";

	public static String Predictable_vendorCode_CAR = "Predictable_ActivityCodes_CAR>(//div[contains(@id,'CRR_gridPredictable_tbl')]//div[@col-id='vendorCode' and @role='gridcell'])[%s]";
	public static String Predictable_vendorCodes_List_CAR = "Predictable_ActivityCodes_List_CAR>//div[contains(@id,'CRR_gridPredictable_tbl')]//div[@col-id='vendorCode' and @role='gridcell']";

	public static String unPredictable_ActivityCodes_CAR = "unPredictable_ActivityCodes_CAR>(//div[contains(@id,'CRR_gridActivity_tbl')]//div[@col-id='subactivity' and @role='gridcell'])[%s]";
	public static String unPredictable_ActivityCodes_List_CAR = "unPredictable_ActivityCodes_List_CAR>//div[contains(@id,'CRR_gridActivity_tbl')]//div[@col-id='subactivity' and @role='gridcell']";

	public static String unPredictable_VendorCodes_CAR = "unPredictable_VendorCodes_CAR>(//div[contains(@id,'CRR_gridActivity_tbl')]//div[@col-id='vendorCode' and @role='gridcell'])[%s]";
	public static String unPredictable_VendorCodes_List_CAR = "unPredictable_VendorCodes_List_CAR>//div[contains(@id,'CRR_gridActivity_tbl')]//div[@col-id='vendorCode' and @role='gridcell']";

	public static String warning_Message_CAR = "warning_Message_CAR>//div[@id='CRR_JDlgPTCactmsg']//form/label[contains(@id,'CRR_lblptcMsg')]";
	public static String warning_Message_Ok_Button_CAR = "warning_Message_Ok_Button_CAR>//div[@id='CRR_JDlgPTCactmsg']//form/button[@id='CRRDLG_btnPTCOK']";
	public static String expense_Report_Activity_Rows_CAR = "expense_Report_Activity_Rows_CAR>(//div[@id='CRR_treeTableEXP']//div[@col-id='activityName' and @role='gridcell'])[%s]";
	public static String expense_Report_Activity_Total_Rows_CAR = "expense_Report_Activity_Total_Rows_CAR>//div[@id='CRR_treeTableEXP']//div[@col-id='activityName' and @role='gridcell']";

	public static String warning_Message_Ok_Button_PTC = "warning_Message_Ok_Button_PTC>//button[@id='PTM-PTM_dialogcancel']";
	public static String globalSearch_Frame_Close_Button = "globalSearch_Frame_Close_Button>//span[@id='nfr_sch_jdlg_title']/following-sibling::a[@aria-label='Close']";

	public static String Popup_Message = "Popup_Message>(//div[@class='ui-growl-item']//following::p)";

	public static String UnPredictable_All_Checkbox_CAR = "Un Predictable All Checkbox>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//input[@aria-label='Toggle Select All Columns']";

	public static String columns_Button_CI = "columns_Button_CI>//div[@id='CIX-CIX_carGrid_tbl']//span[text()='Columns']//parent::button[@type='button']";
	public static String column_All_Select_CheckBox = "column_All_Select_CheckBox>//div[contains(@class,'ag-tool-panel-wrapper') and @aria-hidden='false']//div[@ref='primaryColsHeaderPanel']/child::div[@ref='eSelect']/div[@ref='eWrapper']";
	public static String column_SearchBox = "column_SearchBox>//div[contains(@class,'ag-tool-panel-wrapper') and @aria-hidden='false']//div[@ref='primaryColsHeaderPanel']/child::div[@ref='eFilterTextField']/div[@ref='eWrapper']/input[@aria-label='Filter Columns Input']";
	public static String column_CheckBox = "column_CheckBox>//div[@id='CIX-CIX_carGrid_tbl']//following::div[@ref='primaryColsListPanel']//span[text()='%s']/preceding-sibling::div[@ref='cbSelect']/div[@ref='eWrapper']";

	public static String retrieved_Value_Select = "retrieved_Value_Select>//table[@id='nfr_sch_jdlg_form-nfr_sch_jd_pnl']//div[@ref='centerContainer']//div[@role='row']/div";
	public static String select_first = "select_first>//select[@id='type']";
	public static String globalSearch_Condition_Dropdown1 = "globalSearch_Condition_Dropdown1>//select[@id='var_condition1']";
	public static String globalSearch_InputTextfield1 = "globalSearch_InputTextfield1>//input[@id='txt_name1']";
	public static String globalSearch_Frame_SearchButton = "globalSearch_Frame_SearchButton>//button[@id='myBtn']";
	public static String globalSearch_Frame_ScrollBar = "globalSearch_Frame_ScrollBar>//div[@id='nfr-jdlgGrid-div']//div[contains(@class,'horizontal-scroll-viewport')]";
	public static String validFrom_Fiter_AGGrid = "validFrom_Fiter_AGGrid>//input[@aria-label='Valid From Filter Input']";

	public static String Equals_Option = "Equals_Option>//div[contains(@id,'nfr_sch_mu_pnl_content')]//span[text()='Equals']|//div[contains(@id,'twocolsearch')]//span[text()='Equals']";
	public static String select_Button = "select_Button>//div[@aria-hidden='false']//span[text()='Select']//ancestor::button[1]";
	public static String Filter_Field = "Filter_Field>(//div[@aria-hidden='false' and @role='dialog']//input[contains(@aria-label,'Filter Input')])[1]";
	public static String Filter_Field1 = "Filter_Field1>(//div[@aria-hidden='false' and @role='dialog']//input[contains(@aria-label,'Filter Input')])[2]";
	public static String Filter_Field2 = "Filter_Field2>(//div[@aria-hidden='false' and @role='dialog']//input[contains(@aria-label,'Filter Input')])[3]";
	public static String Filter_Button = "Filter_Button>(//div[@aria-hidden='false' and @role='dialog']//button[@ref='eButtonShowMainFilter']//span)[1]";
	public static String Filter_Button1 = "Filter_Button1>(//div[@aria-hidden='false' and @role='dialog']//button[@ref='eButtonShowMainFilter']//span)[2]";
	public static String Filter_Button2 = "Filter_Button2>(//div[@aria-hidden='false' and @role='dialog']//button[@ref='eButtonShowMainFilter']//span)[3]";
	public static String contains_Click = "contains_Click>(//div[@aria-hidden='false' and @role='dialog']//div[@ref='eDisplayField'])[1]";
	public static String column_Values = "column_Values>//div[@aria-hidden='false' and @role='dialog']//div[@col-id='C1' and @role='gridcell']";
	public static String column_values_Right = "Column Values Right>//div[@aria-hidden='false' and @role='dialog']//div[@col-id='C2' and @role='gridcell']";

	public static String quantity_Input_CAR = "Quantity Input CAR>//input[contains(@id,'quantity_input')]";
	public static String currency_search_icon_vc = "currency_search_icon_vc>//button[@id='HAN-HAN_btnCurAdd-HAN_btnCurAdd']";
	public static String show_btn_vc = "show_btn_vc>//button[@id='HAN-HAN_btnshow']";
	public static String vc_rows = "vc_rows>//div[@id='HAN-HAN_gridCost_tbl']//div[@role='rowgroup' and @ref='eContainer']//div[@col-id='activity']";
	public static String context_panel_Vc = "context_panel_Vc>//div[@aria-label='Context Menu']";
	public static String remove_Option_Vc = "remove_Option_Vc>//div[@aria-label='Context Menu']//span[.='Remove Selected Item(s)']";
	public static String edit_input_field_Vc = "edit_input_field_Vc>//fieldset[@id='HAN-HAN_inputField']//legend[.='Edit Input Fields']";
	public static String equip_type_dd_label_Vc = "equip_type_dd_label_Vc>//label[@id='HAN-HAN_cmbMasterEqpType_label']";
	public static String equip_type_options_Vc = "equip_type_options_Vc>//ul[@id='HAN-HAN_cmbMasterEqpType_items']//li[.='%s']";
	public static String currency_dd_Vc = "currency_dd_Vc>//label[@id='HAN-HAN_cmbMasterCurrency_label']";
	public static String currency_dd_options = "currency_dd_options>//ul[@id='HAN-HAN_cmbMasterCurrency_items']//li[.='%s']";
	public static String add_item_Vc = "add_item_Vc>//div[@aria-label='Context Menu']//span[.='Add Item']";
	public static String vc_row_to_click = "vc_row_to_click>//div[@id='HAN-HAN_gridCost_tbl']//div[@ref='eContainer']//div[@role='row']";
	public static String equip_sts_Vc_option = "equip_sts_Vc>//ul[@id='HAN-HAN_cmbMasterCmbEqpSts_items']//li[.='%s']";
	public static String eqp_sts_label_vc = "eqp_sts_label_vc>//label[@id='HAN-HAN_cmbMasterCmbEqpSts_label']";
	

	public static String Amount_field = "Amount_field>//div[@col-id='subactivitydes' and text()='%s']//following::div[@col-id='quantity']";

	//new
		public static String CAR_Expense_Status="CAR Expense status>//label[@id='CRR-CRR_lblCARStatus']";
		public static String Expense_table_CAR="Expense table >//div[@id='CRR_expensedlg']";
		public static String Open_Expensive_CAR="Open Expense>//div[@id='CRR_jTabbedPaneExpenses']//a[text()='Open Expenses']";
		public static String Predicatble_More_Grid_CAR="Predictable More Grid>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_nfr_toolpanel_li_id']";
		public static String Predicatble_ConditionFilter_CAR="Predictable Condition Filter>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_toolpanel']//img[@alt='Condition']";
		
		public static String Unpredicatble_Remove_btn_CAR="Un Predictable remove button>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnUnpredRemove']";
		public static String Predictable_Remove_btn_CAR="Predictable remove button>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnCTLPredRemove']";
		public static String Open_Expense_table_Cell="Open Expense table Cell>//div[@id='CRR_treeTableEXP']//div[@role='gridcell']";
		public static String Total_Record_Count_CAR="Total Record Count>//label[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_records_lbl_cnt']";
		
		
		public static String OverviewColumncount ="OverviewColumncount>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']//div[@aria-colcount]";
		public static String CAR_Overview_headers="CAR Overview Headers>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview']//div[@aria-colindex='%s' and @role='columnheader'])[last()]";
		public static String CAR_Overview_Cells="CAR Overview Cells>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview']//div[@aria-colindex='%s' and @role='gridcell'])[1]";
		
		public static String CAR_Summary_Table="CAR Summary Table>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']";
		
		public static String MSC_table_Activity_Column_CAR = "MSC Table Activity Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@role='gridcell' and @col-id='actdesc' and text()='%s'])[last()]";
		public static String MSC_table_Quantity_Column_CAR = "MSC Table Quantity Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actdesc' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='qty'])[last()]";
		public static String MSC_table_Quantity_input_CAR = "MSC Table Quantity Input>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actdesc' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='qty']//input[@type='text'])[last()]";
		public static String MSC_Table_EqpType_Column_CAR = "MSC Table Eqp Type Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actdesc' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='type'])[last()]";
		public static String MSC_Table_Vendor_Code_Column_CAR = "MSC Table Vendor Code Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actdesc' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='vendor'])[last()]";
		public static String MSC_Table_Amount_Column_CAR = "MSC Table Amount Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actdesc' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='amount'])[last()]";
		public static String MSC_Table_Amount_Input_CAR = "MSC Table Amount Input>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actdesc' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='amount']//input[@type='text'])[last()]";
		public static String MSC_Table_Activity_Filter_input_CAR = "MSC Table Activity Filter Input>//input[@aria-label='Activity Filter Input']";
		public static String MSC_Table_Cuurency_Column_CAR = "MSC Table Currency Column Input>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actdesc' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='currency'])[last()]";
		public static String MSC_Table_Cuurency_option_CAR = "MSC Table Currency Input>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@col-id='actdesc' and text()='%s']//ancestor::div[@role='row']//div[@role='gridcell' and @col-id='currency'])[last()]//*[text()='CZK']";
		public static String Total_cost_usds = "Total_cost_usd>//div[@id='CRR_treeTableEXPDB_tbl']//div[@row-index]//div[@col-id='conTotalCost']";
		public static String Car_Select_all_Option ="Car_Select_all_Option>(//input[@aria-label='Toggle Select All Columns'])[1]";
		public static String column_Checkboxs1="column_Checkboxs1>(//div[@id='CRR_treeTableEXPDB_tbl']//following::div[@ref='primaryColsListPanel'][1]//span[text()='%s']//preceding::div[@ref='cbSelect'][1]/div)[2]";
		public static String ChargeQuantity1= "ChargeQuantity1>(//div[@id='CRR_treeTableEXP_tbl']//div[@ref='centerContainer']//div[@role='row'])[%s]//div[@col-id='agencyqty']";
		public static String Horizontal_val="Horizontal_val>(//div[@id='nfr-jdlgGrid-div']//div[@ref='eViewport'])[2]";
		public static String Vendor_value ="Vendor_value>//span[text()='Vendor Inv No']";
		public static String Filter_Inputs="Filter_Inputs>(//input[@aria-label='Filter Columns Input'])[2]";
		public static String OpsQuantitys="OpsQuantitys>(//div[@id='CRR_treeTableEXP_tbl']//div[@ref='centerContainer']//div[@role='row'])[%s]//div[@col-id='opsqty']";
		public static String column_Checkbox_option="column_Checkbox_option>(//div[@id='CRR_treeTableEXPDB_tbl']//following::div[@ref='primaryColsListPanel'][1]//span[text()='%s']//preceding::div[@ref='cbSelect'][1]/div)[2]";
		public static String Filtered_Rows ="Filtered_Rows>//div[@id='nfr-jdlgGrid-div']//div[@ref='eBodyViewport']//div[@role='row']";
		public static String Select_Filter_Rows ="Select_Filter_Rows>(//div[@id='nfr-jdlgGrid-div']//div[@ref='eBodyViewport']//div[@role='row'])[%s]";
		public static String Vendar_Colunm_selectall="Vendar_Colunm_selectall>//div[@id='PCI-PCI_invoiceGrid_tbl']//div[@ref='primaryColsListPanel']//span[text()='%s']";
		public static String Activity_Ref_Input_Field ="Activity_Ref_Input_Fiel>//input[@aria-label='Activity Ref.No Filter Input']";
		public static String Open_ExpensesSelectAlls="Open_ExpensesSelectAlls>//div[@id='CRR_treeTableEXP']//input[@aria-label='Toggle Select All Columns']";
		public static String Invoice_Amount_column="Invoice_Amount_column>//div[@id='CRR_treeTableEXPDB_tbl']//div[@row-index]//div[@col-id='invAmountHash']";
		public static String Car_Approval_Option="Car_Approval_Option>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscApprove']";
		public static String Predictable_Table_CAR = "Predictable Table>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@class='sm-dt-table']/div[@role='presentation']";//changed 
	    public static String Predictable_Activity_Column_CAR = "Predictable Activity Column>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@class='sm-dt-table']/div[@role='presentation']//div[@col-id='subactivitydes' and text()='%s']";//changed
		public static String Main_Activity_Column_CAR = "Main Activity Column>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@class='sm-dt-table']/div[@role='presentation']//div[@col-id='mainActName' and text()='%s']";//changed
		public static String Select_Column_Predictable_CAR = "Select Column>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@class='sm-dt-table']/div[@role='presentation']//div[@ref='sideBar']//span[text()='%s']";//changed
	public static String Activity_Name_CAR = "Activity Name Input>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//input[@aria-label='Activity Name Filter Input']";//changed
		public static String Vendor_Code_Input_CAR = "Vendor Code Input>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//input[@aria-label='Vendor Code Filter Input']";//changed
		public static String Predictable_reporting_columns = "CAR Predictable reporting column filter>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@class='sm-dt-table']/div[@role='presentation']//span[text()='Columns']";//changed

	public static String Head_Filter_input_CAR="Head Filter Input>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//input[@aria-label='Head Filter Input']";//changed
			public static String EqpType_Filter_input_CAR="Equipment Filter input>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//input[@aria-label='Eqp Type Filter Input']";//changed
			public static String ContractNo_Filter_Input_CAR="Contract no Filter input>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//input[@aria-label='Contract No Filter Input']";//changed
			public static String Select_Table_Row_CAR="Select Table Row Checkbox>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@col-id='subactivitydes' and text()='%s']//ancestor::div[@role='row']//div[@col-id='isPred']//input[@type='checkbox']";//changed
			public static String Predictable_Grid_Cell_CAR="Predicatble Grid Cell>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@class='sm-dt-table']/div[@role='presentation']//div[@ref='eContainer']//div[@role='gridcell']";//changed
			public static String Select_CheckBox_Predictable_CAR="Select Predictable Row Checkbox>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@col-id='subactivitydes' and text()='%s']//ancestor::div[@role='row']//div[@col-id='nfr_sel_col']//input[@type='checkbox']";//changed
			public static String UnPredictable_Grid_Cell_CAR="Unpredictable Table Cell>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[@ref='eContainer']//div[@role='gridcell']";//changed
				public static String Non_ReportedActivity_name_CAR="Non Reported Activity name>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@class='sm-dt-table']/div[@role='presentation']//div[@role='row' and not(contains(@class,'pink'))]//div[@col-id='subactivitydes' and @role='gridcell']";//changed
			
			public static String Updated_Activity_Row_CAR="Updated Activity>//div[@role='tabpanel' and @style='display: block;' and not(contains(@id,'main'))]//div[@class='sm-dt-table']/div[@role='presentation']//div[@col-id='subactivitydes' and text()='%s']//ancestor::div[@role='row']";//changed
		
		//new
			public static String Total_Cost_Column_CAR="Total Cost Column>//div[@col-id='subactivitydes' and text()='%s']//ancestor::div[@role='row']//div[@col-id='totalCost']";
			public static String UnPredict_Activity_GridCell_CAR="Unpredict Activity GridCell>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[@role='gridcell']";
			public static String Quantity_Input_CAR="Quantity Input CAR>//input[contains(@id,'_quantity_input')]";//changed


}
