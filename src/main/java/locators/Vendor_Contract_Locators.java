package locators;

public interface Vendor_Contract_Locators extends Vendor_Invoice_Registration_Locators{

	
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
		public static String Predictable_reporting_columns = "CAR Predictable reporting column filter>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//span[text()='Columns']";
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
		// vendor_contracts
		public static String currency_search_icon_vc = "currency_search_icon_vc>//button[@id='HAN-HAN_btnCurAdd-HAN_btnCurAdd']";
		public static String show_btn_vc = "show_btn_vc>//button[@id='HAN-HAN_btnshow']";
		public static String vc_rows = "vc_rows>//div[@id='HAN-HAN_gridCost_tbl']//div[@role='rowgroup' and @ref='eContainer']//div[@col-id='activity']";
		public static String context_panel_Vc = "context_panel_Vc>//div[@aria-label='Context Menu']";
		public static String remove_Option_Vc = "remove_Option_Vc>//div[@aria-label='Context Menu']//span[.='Remove Selected Item(s)']";
		public static String DropDown_Select = "DropDown_Select>//div[contains(@id,'panel') and contains(@style,'display: block;')]//li[text()='%s']";

		public static String Select_Row_UCA = "Select the user Row>//div[@id='UUM-UUM_dynamicTable']//div[@col-id='column1' and text()='%s']";

		public static String Approval_Limit_Input_UCA = "Approval Limit Input>//input[@id='UUM-column3_input']";
		public static String Expensive_Type_Input_UCA = "Expensive Type Input>//input[@id='UUM-column5']";

		public static String Activity_Code_option = "Activity_Code>//div[@row-index='0']//div[@col-id='actcode']";
		public static String Activity_Code_Side_Menu = "Activity_Code_Side_Menu>(//div[@ref='eHeaderCompWrapper']//span[@ref='eMenu'])[1]";
		public static String Activity_Code_Filter = "Activity_Code_Filter>//div[@ref='eHeader']//span[@aria-label='filter']";
		public static String Activity_Code_Input_Field = "Activity_Code_Input_Field>//div[@ref='eFilterBody']//input[@aria-label='Search filter values']";
		public static String Activity_Code_SelectAll_Option = "Activity_Code_SelectAll_Option>(//div[@ref='eFilterBody']//div[@ref='eWrapper'])[2]";
		public static String Activity_code_Select_column = "Activity_code_Select_column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@aria-label='Column Menu']//div[text()='%s']";
		public static String Currency_Values = "Currency_Values>(//div[@col-id='currency'])[2]";
		public static String Activity_New_Button = "Activity_New_Button>//div[text()='New']";
		public static String Activity_Global_Search = "Activity_Global_Search>//button[@id='ATY-tbl-btnTblJdlgSearch']";
		public static String Activity_Scroll = "Activity_Scroll>(//div[@id='nfr-jdlgGrid-div']//div[@ref='eViewport'])[2]";
		public static String Activity_PortCode_Screen = "Activity_PortCode_Screen>//input[@aria-label='Port Code Filter Input']";
		public static String Activity_PortCode_Value = "Activity_PortCode_Value>(//div[@col-id='C11'])[2]";
		public static String Activity_port_Value = "Activity_port_Value>(//thead[@id='ATY-ATY_portGrid_head']//input[@role='textbox'])[1]";
		public static String Activity_Currency_Value = "Activity_Currency_Value>(//thead[@id='ATY-ATY_portGrid_head']//input[@role='textbox'])[2]";
		public static String Activity_Amount_Field = "Activity_Amount_Field>//input[@data-p-hl='inputnumber']";
		public static String Cost_Activity_Report_Screen_Option = "Cost_Activity_Report_Screen_Option>//label[contains(text(),'Cost Activity Report')]";
		public static String Car_Screen_Activity_Submitted = "Car_Screen_Activity_Submitted>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscSubmit']";
		public static String Open_Expense_Approve_submitted = "Open_Expense_Approve_submitted>//div[@col-id='lnapprove' and text()='Submitted']//ancestor::div[@role='row']";
		public static String Open_Expense_Approve_Rejected = "Open_Expense_Approve_Rejected>//div[@col-id='lnapprove' and text()='Rejected']//ancestor::div[@role='row']";
		public static String Open_Expense_Empty_Screen = "Open_Expense_Empty_Screen>//div[@id='CRR_treeTableEXP']//div[@name='center']";
		public static String Approved_option = "Approved_option>//div[@col-id='lnapprove' and text()='Manually Approved']//ancestor::div[@role='row']";
		public static String Car_Screen_Activity_Approved = "Car_Screen_Activity_Approved>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscApprove']";
		public static String Car_Screen_Manually_Approved = "Car_Screen_Manually_Approved>//div[text()='Manually Approved']";
		public static String Car_Screen_Amout = "Car_Screen_Amout>(//div[@col-id='amount'])[2]";
		public static String Car_First_Row_Option = "Car_First_Row_Option>(//div[@row-index='0']//div[@col-id='actcode'])[1]";
		public static String Car_status_Row_Option = "Car_status_Row_Option>//div[@row-index='0']//div[@col-id='status']";
		
		public static String Open_Table ="Open_Table>//div[@id='CRR_treeTableEXP_tbl']";
		public static String Open_TAble_record="Open_TAble_record>//label[@id='CRR_treeTableEXP_records_lbl_cnt']";
		public static String Approved_Total ="Approved_Total>//label[@id='CRR_treeTableEXPDB_records_lbl_cnt']";
		public static String Approved_table ="Approved_table>//div[@id='CRR_treeTableEXPDB_tbl']";
		
		
		public static String show_Row_values="show_Row_values>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@row-index='0']";
		public static String Show_Currency_Value="Show_Currency_Value>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@row-index='0']//div[@col-id='currency']";
		public static String Show_Amount_Value="Show_Currency_Value>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@row-index='0']//div[@col-id='amountWithSTX']";
		
		
//		public static String Show_Total_rows ="Show_Total_rows>//tbody[contains(@id,'CRR_gridtotalamtsummary_data')]//tr";
		public static String vendor_Raido_Button="vendor_Raido_Button>//label[text()='Vendor']//preceding-sibling::div//div[2]";
		public static String Misc_Table="Misc_Table>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']";
		public static String Misc_Total_Records ="Misc_Total_Records>//label[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_records_lbl_cnt']";
		public static String Show_Total_Headers="Show_Total_Headers>//thead[contains(@id,'CRR_gridtotalamtsummary_head')]//th";
		public static String Show_Total_First_Column ="Show_Total_First_Column>//tbody[contains(@id,'CRR_gridtotalamtsummary_data')]//tr[%s]//td[1]";
		public static String Show_Total_Second_Column ="Show_Total_Second_Column>//tbody[contains(@id,'CRR_gridtotalamtsummary_data')]//tr[%s]//td[2]";
		public static String Show_Total_Amount_value ="Show_Total_Amount_value>//tbody[contains(@id,'CRR_gridtotalamtsummary_data')]//tr[%s]//td//input[1]";
		
		public static String Servicetax2 ="Servicetax Tab>//li[@id='mdl2_tabli']";
		public static String OpenExpensefilter1 ="Tax details field>//div[@id='CRR_treeTableEXP_tbl']//div[@class='ag-column-select-list']//div[contains(@class,'ag-column-select-checkbox')]";
		public static String OverviewColumncount ="OverviewColumncount>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']//div[@aria-colcount]";
		
		public static String edit_input_field_Vc = "edit_input_field_Vc>//fieldset[@id='HAN-HAN_inputField']//legend[.='Edit Input Fields']";
		public static String equip_type_dd_label_Vc = "equip_type_dd_label_Vc>//label[@id='HAN-HAN_cmbMasterEqpType_label']";
		public static String equip_type_options_Vc = "equip_type_options_Vc>//ul[@id='HAN-HAN_cmbMasterEqpType_items']//li[.='%s']";
		public static String currency_dd_Vc = "currency_dd_Vc>//label[@id='HAN-HAN_cmbMasterCurrency_label']";
		public static String currency_dd_options = "currency_dd_options>//ul[@id='HAN-HAN_cmbMasterCurrency_items']//li[.='%s']";
		public static String add_item_Vc = "add_item_Vc>//div[@aria-label='Context Menu']//span[.='Add Item']";
		public static String vc_row_to_click = "vc_row_to_click>//div[@id='HAN-HAN_gridCost_tbl']//div[@ref='eContainer']//div[@role='row']";
		public static String equip_sts_Vc_option = "equip_sts_Vc>//ul[@id='HAN-HAN_cmbMasterCmbEqpSts_items']//li[.='%s']";
		public static String eqp_sts_label_vc = "eqp_sts_label_vc>//label[@id='HAN-HAN_cmbMasterCmbEqpSts_label']";
		public static String vendor_Contract_Table_Row = "vendor_Contract_Table_Row>(//div[@id='HAN-HAN_gridCost_tbl']//div[@role='rowgroup' and @ref='eContainer']//div[@col-id='activity'])[%s]";
		public static String contract_No_VC = "contract_No_VC>//input[@id='HAN-HAN_txtContractNo']";
		public static String accept_Button_VC = "accept_Button_VC>//button[@id='HAN-HAN_btnAccept']";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
