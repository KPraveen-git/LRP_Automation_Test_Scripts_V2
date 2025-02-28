package locators;

public interface CAR_Approval_Locators extends Predictable_Activity_Locators {

	// User Car approval
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
	public static String Select_Checkbox = "Select the given checkbox>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@row-id='%s'])[2]//input[@type='checkbox']";
	public static String Formula_field = "Formula column field>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@row-id='%s'])[2]//div[@col-id='formula']";
	public static String ToBeReported = "To Be Reported column field>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@row-id='%s'])[2]//div[@col-id='isAutoReported']";
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
	public static String CAR_Norecords = "CAR No records>//div[@id='lrp_cust_growl_container']//*[text()='No records Found']";
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
	public static String Contract_Type_Options_CAR = "Contract Type Options>//ul[@id='CRR-CRR_cmboCntType_items']//li";
	public static String Port_Input = "Port Input>//input[@id='CRR-CRR_txtPort']";
	public static String Terminal_Input = "Terminal Input>//input[@id='CRR-CRR_txtTerminalCode']";
	public static String Close_Tab2 = "Close the tab>(//i[@class='fa fa-remove mdlclose'])[2]/..";
	public static String MainActivityFilter = "MainActivityFilter>//input[@aria-label='Main Activity Name Filter Input']";
	public static String CAR_Remarks_Input = "CAR Expense Report Remarks Input>//textarea[@id='CRR_dlgRemarks-CRR_txtRemarks']";
	public static String CAR_Remark_Ok = "Remark_Ok>//button[@id='CRR_dlgRemarks-CRR_btnRemarkOk']";
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
	public static String Approved_Conditionfilter = "Approved_Conditionfilter>(//a[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_conditionFilter_id'])[2]";
	public static String ContractNo_filter = "ContractNo_filter>//input[@aria-label='Contract No Filter Input']";
	public static String Predictable_Quantity = "Predictable_Quantity>(//div[@col-id='qty'])[2]";
	public static String UnPredictable_Filter = "UnPredictable_Filter>(//a[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_conditionFilter_id'])[2]";
	public static String RejectExpense = "RejectExpense>//button[@id='CRR_btnRejectExpDB']";
	public static String Total_ApprovedCost = "Total_ApprovedCost>//label[@id='CRR-CRR_lblMasTotalCost']";
	public static String UnPredictable_Quantity = "UnPredictable_Quantity>(//div[@col-id='quantity'])[2]";
	public static String UnPredictable_TotalCost = "UnPredictable_TotalCost>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[@col-id='totalCost'])[2]";
	public static String UnPredictable_ChargeRate = "UnPredictable_ChargeRate>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity']//div[@col-id='chargerate'])[2]";
	public static String Approved_quantity = "Approved_quantity>(//div[@id='CRR_jTabbedPaneExpenses']//div[@col-id='volumes'])[2]";
	public static String Approved_TotalCost = "Approved_TotalCost>(//div[@id='CRR_jTabbedPaneExpenses']//div[@col-id='conTotalCostWOTax'])[2]";
	public static String ActivityName_filter = "ActivityName_filter>//input[@aria-label='Activity Name Filter Input']";
	public static String Approved_Filter = "Approved_Filter>(//a[@id='CRR_treeTableEXPDB_conditionFilter_id'])[2]";
	public static String Predictable_TotalCost = "Predictable_TotalCost>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridPredictable']//div[@col-id='totalCost'])[2]";
	public static String Predictable_Scroll = "Predictable_Scroll>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridPredictable']//div[@class='ag-body-horizontal-scroll-viewport']";
	public static String Download_approvedPdf = "Download_approvedPdf>//button[@id='CRR_btnExportPDFAction']";

	// User level security
	public static String ULS_UserSearch = "User level security username>//button[@id='UMM-UMM_btnSearchName-UMM_btnSearchName']";
	public static String Activity_Filter = "User level security activity filter>//input[@id='UMM-UMM_treeActivitysub_filter']";
	public static String CostActivity_Select = "Select the cost activity report>//li[contains(@id,'UMM-UMM_treeActivitysub')]//span[contains(text(),'Cost Activity Report')]";
	public static String Functional_privilege_Header = "User level security Functional privilege header>//input[@id='UMM-UMM_treeActivitysub_filter']";
	public static String Functional_privilege_Body = "User level security Functional privilege body>//tbody[@id='UMM-UMM_subGrid_data']";
	public static String Select_ContractType = "Select the contract type>//ul[@id='CRR-CRR_cmboCntType_items']//li[text()='%s']";
	public static String Select_ModeOption = "Select the MOde>//ul[@id='CRR-CRR_jComboBox1_items']//li[text()='%s']";
	public static String Show_TotalCurrency = "Show total currency>//button[@id='CRR_btnMscSummary']";
	public static String STXNo = "STXNo>//input[@id='SVT-SVT_txtServiceTaxNo']";

	// User Car approval
	public static String seach_Filed = "seach_Filed>//button[@id='CRR-tbl-btnTblJdlgSearch']";
	public static String GlobalInput = "GlobalInput>//input[@id='txt_name1']";
	public static String search_option = "search_option>//button[@id='myBtn']";
	public static String GlobalSEarchValu = "GlobalSEarchValu>//div[@ref='eCenterContainer']//div[@row-id='0']";
	public static String ExpenseReport = "Expense Report>//button[@id='CRR-CRR_btnExpRpt']";
	public static String ExpenseReportTable = "ExpenseReportTable>//div[@id='CRR_treeTableEXPDB_tbl']";
	public static String InvoiceNumber = "InvoiceNumber>//div[@id='CRR_treeTableEXPDB_tbl']//div[@row-index]//div[@col-id='invoiceNo']";
	public static String RefarenceNumber = "RefarenceNumber>//div[@id='CRR_treeTableEXPDB_tbl']//div[@row-index]//div[@col-id='tdrRefNo']";
	public static String Column = "Colum>(//div[@id='CRR_treeTableEXPDB_tbl']//following::button[@ref='eToggleButton'])[1]";
	public static String CheckBox_deselect = "CheckBox_deselect>(//input[@aria-label='Toggle Select All Columns' and @type='checkbox'])[4]";
	public static String input_Filed = "input_Filed>(//input[@aria-label='Filter Columns Input'])[4]";
	public static String InvoiceNum = "InvoiceNum>(//span[text()='Invoice NO'])[2]";
	public static String referanceNum = "referanceNum>(//span[text()='Reference NO'])[2]";
	public static String ExpenseReportClose = "ExpenseReportClose>(//span[@id='CRR_expensedlg_title']//following::span)[1]";
	public static String Ventor_Global_Search = "Ventor_Global_Search>//button[@id='PCI-tbl-btnTblJdlgSearch']";
	public static String Ventor_Global_Seach_First_Field = "Ventor_Global_Seach_First_Field>//select[@id='type']";

	public static String columns_Button = "columns_Button>//div[@id='ARN-ARN_Arrivaltable']//span[text()='Columns']//parent::button[@type='button']";
	public static String column_All_Select_Checkbox = "column_All_Select_Checkbox>//div[@id='CRR_treeTableEXPDB_tbl']//div[@ref='primaryColsHeaderPanel']//div[@ref='eSelect']/div[@ref='eWrapper']";
	public static String column_Searchbox = "column_Searchbox>//div[@id='CRR_treeTableEXPDB_tbl']//div[@ref='primaryColsHeaderPanel']//child::input[@aria-label='Filter Columns Input']";
	public static String column_Checkbox = "column_Checkbox>//div[@id='CRR_treeTableEXPDB_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String column_Checkboxs = "column_Checkbox>//div[@id='CRR_treeTableEXPDB_tbl']//following::div[@ref='primaryColsListPanel'][1]//span[text()='%s']//preceding::div[@ref='cbSelect'][1]/div";

	public static String Vendor_Inv_Numbers = "Vendor Inv numbers>//div[@col-id='C7' and @role='gridcell']";
	public static String Search_button = "Search_button>//button[@id='myBtn']";
	public static String Mode_Field = "Mode_Field>//input[@aria-label='Mode Filter Input']";
	public static String Global_Input_Filed = "Global_Input_Filed>//input[@id='txt_name1']";

	public static String Horizontal_ = "Horizontal >//div[@id='nfr-jdlgGrid-div']//div[@ref='eBodyHorizontalScrollViewport']";
	public static String Global_Search_close = "Global_Search_close>(//div[@id='nfr_sch_jdlg']//following::span)[1]";
	public static String ventor_Close = "ventor_Close>(//li[@moduleid='PCI']//following::i)[3]";
	public static String Horizonval_val = "Horizonval_val>(//div[@id='CRR_treeTableEXPDB']//following::div[@ref='eBodyHorizontalScrollViewport'])[1]";
	public static String Invoiced_Quantity = "Invoiced_Quantity>//div[@id='CRR_treeTableEXPDB_tbl']//div[@row-index]//div[@col-id='invVolumes']";
	public static String Total_cost_usd = "Total_cost_usd>//div[@id='CRR_treeTableEXPDB_tbl']//div[@row-index]//div[@col-id='totalCostUSD']";
	public static String ExpenseReportBackroundColor = "ExpenseReportColor>//div[@id='CRR_treeTableEXPDB_tbl']//div[@ref='eCenterContainer']";
	public static String Vendor_Inv_Reg_Number = "Vendor_Inv_Reg_Number>//div[@col-id='C1' and @role='gridcell']";
	public static String Vendor_Invoic_Reg_scroll = "Vendor_Invoic_Reg_scroll>(//div[@id='PCI-PCI_invoiceGrid_tbl']//following::div[@ref='eBodyHorizontalScrollViewport'])[1]";
	public static String Vendor_Invoiced_qty = "Vendor_Invoiced_qty>//div[@col-id='rptQty' and @role='gridcell']";
	public static String Vendor_invoice_Amount = "Vendor_invoice_Amount>//div[@col-id='rptAmount' and @role='gridcell']"; // 28
	public static String backroundcolor = "backroundcolor>//div[@id='CRR_treeTableEXPDB_tbl']//div[contains(@class,'ag-center-cols')]//div[@role='row' and @row-index]";
	public static String Filtered_Row = "Filtered Row>//div[@id='nfr-jdlgGrid-div']//div[@ref='eCenterContainer']//div[@role='row']";
	public static String Select_Filter_Row = "Select Filter Row>(//div[@id='nfr-jdlgGrid-div']//div[@ref='eCenterContainer']//div[@role='row'])[%s]";
	public static String Quantity_Column = "Qunatity Column>//div[@role='row']//div[@col-id='rptQty' and @role='gridcell']";
	public static String Vendor_Column = "Vendor_Column>(//div[@id='PCI-PCI_invoiceGrid_tbl']//following::button[@ref='eToggleButton'])[1]";
	public static String Vendor_column_All_Select_Checkbox = "column_All_Select_Checkbox>//div[@id='PCI-PCI_invoiceGrid_tbl']//div[@ref='primaryColsHeaderPanel']//div[@ref='eSelect']/div[@ref='eWrapper']";
	public static String Vendar_Colunm_Input_Fiel = "Vendar_Colunm_Input_Fiel>//div[@id='PCI-PCI_invoiceGrid_tbl']//div[@ref='primaryColsHeaderPanel']//child::input[@aria-label='Filter Columns Input']";
	public static String ActivityRef_Number_Menu = "ActivityRef_Number_Menu>//div[@col-id='refNo']//span[@ref='eMenu']";
	public static String Filter_Option = "Filter_Option>//span[@aria-label='filter']";
	public static String Filter_Input2 = "Filter_Input>//input[@aria-label='Activity Ref.No Filter Input']";
	public static String Total_records = "Total_records>//div[@id='PCI-PCI_invoiceGrid_nfr_toolpanel_li_id']";
	public static String Condition_Filter = "Condition_Filter>(//span[text()='Condition Filter'])[2]";
	public static String Invoice_Amount = "Invoice_Amount>//div[@role='row']//div[@col-id='rptAmount' and @role='gridcell']";
	public static String ReferenceNumber = "ReferenceNumber>//span[text()='Reference NO']";
	public static String Condition_field = "Condition_field>//select[@id='var_condition1']";
	public static String First_row = "First_row>(//div[@row-id='0'])[2]//div[@col-id='C1']";
	public static String Select_Option = "Select_Option>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String car_Number_val = "car_value>//input[@id='CRR-CRR_txtTDRNo']";
	public static String expensereportpage = "expensereportpage>//span[@id='CRR_expensedlg_title']";
	public static String Open_Expenses = "Open_Expenses>//a[text()='Open Expenses']";
	public static String Open_Expenses_Column = "Open_Expemses_Column>(//div[@id='CRR_treeTableEXP_tbl']//following::button[@ref='eToggleButton'])[1]";
	public static String Open_Expe_SelectAll_Checkbox = "Open_Expe_SelectAll_Checkbox>//div[@id='CRR_treeTableEXP_tbl']//div[@ref='primaryColsHeaderPanel']//div[@ref='eSelect']/div[@ref='eWrapper']";
	public static String Open_Expense_column_Searchbox = "Open_Expense_column_Searchbox>//div[@id='CRR_treeTableEXP_tbl']//div[@ref='primaryColsHeaderPanel']//child::input[@aria-label='Filter Columns Input']";
	public static String Open_Expense_Colum_CheckBox = "Open_Expense_Colum_CheckBox>//div[@id='CRR_treeTableEXP_tbl']//following::div[@ref='primaryColsListPanel'][1]//span[text()='%s']//preceding::div[@ref='cbSelect'][1]/div";
	public static String Open_Expense_Rows = "Open_Expense_Row>//div[@id='CRR_treeTableEXP_tbl']//div[@ref='eCenterContainer']//div[@role='row']";
	public static String Open_Expense_Rows_New = "Open_Expense_Row>(//div[@id='CRR_treeTableEXP_tbl']//div[@ref='eCenterContainer']//div[@role='row'])[%s]";

	public static String ChargeQuantity = "Charge Quantity>(//div[@id='CRR_treeTableEXP_tbl']//div[@ref='eCenterContainer']//div[@role='row'])[%s]//div[@col-id='agencyqty']";
	public static String OpsQuantity = "Ops Quantity>(//div[@id='CRR_treeTableEXP_tbl']//div[@ref='eCenterContainer']//div[@role='row'])[%s]//div[@col-id='opsqty']";
	public static String PredictCheckbox = "Predictable Checkbox>(//div[@id='CRR_treeTableEXP_tbl']//div[@ref='eCenterContainer']//div[@role='row'])[%s]//input";
	public static String Open_ExpensesSelectAll = "Open_ExpensesSelectAll>//input[@id='CRR_chkselectall']";
	public static String Open_Expense_Approve = "Open_Expense_Approve>//button[@id='CRR_btnApproveExp']";
	public static String popup_Message = "popup_Message>//h2//following-sibling::span[2]";
	public static String popup_Message_Yes_Button = "popup_Message_Yes_Button>//h2//following::button[text()='Yes']";
	public static String popup_Message_No_Button = "popup_Message_No_Button>//h2//following::button[text()='No']";
	public static String popup_Message_Ok_Button = "popup_Message_Ok_Button>//h2//following::button[text()='Ok']";
	public static String Open_Expense_Submit = "Open_Expense_Submit>//button[@id='CRR_btnExpSubmit']";
	public static String Open_Expense_Status = "Open_Expense_Status>(//div[@id='CRR_treeTableEXP_tbl']//div[@ref='eCenterContainer']//div[@role='row'])[%s]//div[@col-id='lnapprove']";
	public static String CAR_Expense_Status = "CAR_Expense_Status>//label[@id='CRR-CRR_lblCARStatus']";
	public static String Approved_Expenses = "Approved_Expenses>(//div[@id='CRR_treeTableEXPDB_tbl']//div[@ref='eCenterContainer']//div[@role='row'])[%s]//div[@col-id='lnapprove']";
	public static String Approved_Expenses_Select_All = "Approved_Expenses_Select_All>//input[@id='CRR_chkselectallapp']";
	public static String Approved_Expenses_Rejected = "Approved_Expenses_Rejected>//button[@id='CRR_btnRejectExpDB']";
	public static String Open_Expenses_Reject = "Open_Expenses_Reject>//button[@id='CRR_btnRejectExp']";
	public static String Car_Edit_Option = "Car_Edit_Option>//button[@id='CRR-tbl-btnTblEdit']";
	public static String Unpredictable_Reporting = "Unpredictable_Reporting>//a[text()='Unpredictable Reporting']";

	public static String Unpredictable_Reporting_Column = "Unpredictable_Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//following::button[@ref='eToggleButton'])[1]";
	public static String Unpredictable_Reporting_selecAllOption = ">//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@ref='primaryColsHeaderPanel']//div[@ref='eSelect']/div[@ref='eWrapper']";
	public static String Unpredictable_Reporting_SearchField = ">//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@ref='primaryColsHeaderPanel']//child::input[@aria-label='Filter Columns Input']";
	public static String Unpredictable_Reporting_Checkbox = "Unpredictable_Reporting_Checkbox>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//following::div[@ref='primaryColsListPanel'][1]//span[text()='%s']//preceding::div[@ref='cbSelect'][1]/div";
	public static String Unpredictable_Reporting_Total_Recoed = "Unpredictable_Reporting_Total_Recoed>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_nfr_toolpanel_li_id']";
	public static String Unpredictable_Reporting_Condition_Filter = "Unpredictable_Reporting_Condition_Filter>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_toolpanel']//span[text()='Condition Filter']";
	public static String column_Values = "column_Values>//div[@aria-hidden='false' and @role='dialog']//div[@col-id='C1' and @role='gridcell']";
	public static String Column_SelectMenu = "Column Select Menu>//div[not(contains(@id,'main')) and @role='tabpanel' and @aria-hidden='false']//button[@ref='eToggleButton']";
	public static String SelectAll_Column_CheckBox = "Select All Column Checkbox>//div[not(contains(@id,'main')) and @role='tabpanel' and @aria-hidden='false']//input[@aria-label='Toggle Select All Columns']";
	public static String Column_Search_Input = "Column Search Input>//div[not(contains(@id,'main')) and @role='tabpanel' and @aria-hidden='false']//input[@aria-label='Filter Columns Input']";
	public static String Select_Column_tableHead = "Select table Headers>//div[@ref='sideBar']//span[text()='%s']";
	public static String Select_Column_Head = "Select table Headers>//div[not(contains(@id,'main')) and @role='tabpanel' and @aria-hidden='false']//div[@ref='sideBar']//span[text()='%s']";
	public static String Select_Column_CAR = "Select Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String Contract_No_Filter_Inputs = "Contract_No_Filter_Input>//input[@aria-label='Contract No Filter Input']";
	public static String Activity_Code_Input = "Activity_Code_Input>//input[@aria-label='Activity Code Filter Input']";
	public static String Head_Filter_Input = "Head_Filter_Input>//input[@aria-label='Head Filter Input']";
	public static String UnPredictable_scroll = "UnPredictable_scroll>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@ref='eViewport'])[2]";
	public static String Qty_Input_Val = "Qty_Input_Val>(//div[@col-id='quantity'])[2]";
	public static String Qty_Input_Field = "Qty_Input_Field>(//input[@data-p-hl='inputnumber'])[1]";
	public static String Charge_Rate = "Charge_Rate>(//div[@col-id='chargerate'])[2]";
	public static String Total_cost_val = "Total_cost_val>(//div[@col-id='totalCost'])[2]";
	public static String Unpredictable_Save = "Unpredictable_Save>//button[@id='CRR-tbl-btnsave']";
	public static String Show_Total_Summary = "Show_Total_Summary>//span[text()='Show Total  Summary']";
	public static String Show_Total_Amount_Summary = "//span[@id='CRR_Jdlgtotalshowsummary_title']";
	public static String Show_Total_Summary_Column = "Show_Total_Summary_Column>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//following::button[@ref='eToggleButton'])[1]";
	public static String Show_Total_Summary_selecAllOption = "Show_Total_Summary_selecAllOption>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='primaryColsHeaderPanel']//div[@ref='eSelect']/div[@ref='eWrapper']";
	public static String Currency_option = "Currency_option>//label[text()='Currency']";
	public static String Show_Total_Summary_Ok = "Show_Total_Summary_Ok>//div[@id='CRR_Jdlgtotalshowsummary']//span[text()='OK']";
	public static String Show_Total_rows = "Show_Total_rows>(//div[@id='CRR_Jdlgtotalshowsummary']//table)[4]//tbody//tr";
	public static String Show_Total_row_value_Currency = "Show_Total_row_value>(//div[@id='CRR_Jdlgtotalshowsummary']//table)[4]//tbody//tr[%s]//td";
	public static String Show_Total_row_value_value = "Show_Total_row_value>(((//div[@id='CRR_Jdlgtotalshowsummary']//table)[4]//tbody//tr[%s])//td[2]//input)[1]";
	public static String Show_Total_Main_Activity = "Show_Total_Main_Activity>//label[text()='Main Activity']";
	public static String Show_Row_Value = "Show_Row_Value>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@row-index='0']";
	public static String mis_submit = "mis_submit>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscSubmit']";
	public static String miss_Rejec = "miss_Rejec>//button[@id='CRR-CRR_jTabbedPane1-CRR_btnMscReject']";
	public static String Rejected_status = "Rejected_status>//div[@col-id='status' and text()='Rejected']//ancestor::div[@role='row']";
	public static String Reject_colum = "Reject_colum>(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_headerpnl']//following::button[@ref='eToggleButton'])[1]";
	public static String Reject_SelectAll = "Reject_SelectAll>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='primaryColsHeaderPanel']//div[@ref='eSelect']/div[@ref='eWrapper']";
	public static String Reject_Search_Field = "Reject_Search_Field>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='primaryColsHeaderPanel']//child::input[@aria-label='Filter Columns Input']";
	public static String Reject_Input_Field = "Reject_Input_Field>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='primaryColsHeaderPanel']//child::input[@aria-label='Filter Columns Input']";
	public static String Reject_FirstOption = "Reject_FirstOption>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String Rejected_Submitted = "Rejected_Submitted>//div[@col-id='status' and text()='Submitted']//ancestor::div[@role='row']";
	public static String Reject_Manually_Approved = "Reject_Manually_Approved>//div[@col-id='status' and text()='Manually Approved']//ancestor::div[@role='row']";
	public static String Rejected_Draft = "Rejected_Draft>//div[@col-id='status' and text()='Draft']//ancestor::div[@role='row']";

	public static String Summary_Table_Headers = "Summary_table_Headers>//thead[@id='CRRSummary12-CRR_gridtotalamtsummary_head']//th";
	public static String Summary_Table_Row = "Summary Table Row>//tbody[@id='CRRSummary12-CRR_gridtotalamtsummary_data']//tr";
	public static String Port_Value = "Port_Value>//input[@id='CRR-CRR_txtPort']";

	public static String MSC_Column_Filt_CAR = "MSC Table Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//button[@ref='eToggleButton']";
	public static String MSC_Filter_input_CAR = "Column Filter Input >//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//input[@aria-label='Filter Columns Input']";
	public static String MSC_SelectAll_Checkbox_CAR = "Select All Check box>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//input[@aria-label='Toggle Select All Columns']";
	public static String Select_Column_MSC_CAR = "Select Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String MSC_Table_CAR = "MSC Table >//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']";
	public static String Activity_Code = "Activity_Code>//div[@row-index='0']//div[@col-id='actcode']";

	public static String Filtered_Username_Column_UCA = "User name Filtered Column>//div[@id='UUM-UUM_dynamicTable']//div[@col-id='column1' and text()='%s']";
	public static String ExpensiveType_Input = "Expensive Type Input>//input[@id='UUM-column5']";

	// 20/02
	public static String car_Open_Btn = "car_Open_Btn>//button[@id='CRR-CRR_btnTDROpen']";
	public static String car_close_Btn = "car_Open_Btn>//button[@id='CRR-CRR_btnTDRClose']";
	public static String more_options_Car = "more_options_Car>//button[@id='CRR-CRR_rightMenu']";
	public static String more_options_menu_Car = "more_options_menu_Car>//div[@id='CRR-CRR_menu' and contains(@style,'display: block;')]//li//span[text()='%s']";
	public static String total_cost_summary_window_Car = "total_cost_summary_window_Car>//div[@id='CRR_JdlgshowStatussummary']";
	public static String expense_report_Car = "expense_report_Car>//button[@id='CRR-CRR_btnExpRpt']";
	public static String total_cost_summary_table_Car = "total_cost_summary_table_Car>//div[@id='CRRstatusSummary-CRR_gridtotalshowsummary_tbl']";
	public static String summary_ok_btn = "summary_ok_btn>//button[@id='CRRstatusSummary-CRR_btntotshwOk']";
	public static String approved_expenses_option = "approved_expenses_option>//a[.='Approved Expenses']";

	public static String switch_Button = "switch_Button>//div[text()='Switch']/parent::button";
	public static String activity_Code_Textfield = "activity_Code_Textfield>//input[@id='ATY-ATY_txtCode']";
	public static String activity_Description_Textfield = "activity_Description_Textfield>//input[@id='ATY-ATY_txtName']";
	public static String activity_Type_Dropdown = "activity_Type_Dropdown>//div[@id='ATY-ATY_cmbType']";
	public static String contract_Type_Dropdown = "contract_Type_Dropdown>//div[@id='ATY-ATY_cmbContractCode']";
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
//	public static String column_Values = "column_Values>//div[@aria-hidden='false' and @role='dialog']//div[@col-id='C1' and @role='gridcell']";
	public static String column_values_Right = "Column Values Right>//div[@aria-hidden='false' and @role='dialog']//div[@col-id='C2' and @role='gridcell']";

	public static String Contract_Type_Input_CAR = "Contract Type Input>//div[@id='CRR-CRR_cmboCntType']";
//	public static String Contract_Type_Options_CAR="Contract Type Options>//ul[@id='CRR-CRR_cmboCntType_items']//li";
	public static String Select_Contract_Type_CAR = "Select Contract type>//ul[@id='CRR-CRR_cmboCntType_items']//li[text()='%s']";

	public static String Mode_Select_Input_CAR = "Mode Select input >//div[@id='CRR-CRR_jComboBox1']";
	public static String Select_Mode_type_CAR = "Select Mode Type>//ul[@id='CRR-CRR_jComboBox1_items']//li[text()='%s']";

	public static String Service_Search_Btn_CAR = "Service Search Button>//button[@id='CRR-CRR_btnService-CRR_btnService']";
	public static String Vessel_Search_Btn_CAR = "Vessel Search Button>//button[@id='CRR-CRR_btnVessel']";
	public static String Port_Search_Btn_CAR = "Port Search Button>//button[@id='CRR-CRR_btnPort']";
	public static String Terminal_Search_Btn_CAR = "Terminal Search Button>//button[@id='CRR-CRR_btnTerminal']";
	public static String Arrival_Date_Search_Btn_CAR = "Arrival Date Search button>//button[@id='CRR-CRR_btnArrDate']";

	public static String Show_Button_CAR = "Show button >//button[@id='CRR-CRR_solverBtn1']";
	public static String Predictable_Reporting_CAR = "Predictable Reporting>//div[@id='CRR-CRR_jTabbedPane1']//a[text()='Predictable Reporting']";
	public static String Predictable_Table_CAR = "Predictable Table>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']";
	public static String Predictable_Activity_Column_CAR = "Predictable Activity Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//div[@col-id='subactivitydes' and text()='%s']";
	public static String Main_Activity_Column_CAR = "Main Activity Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid_tbl']//div[@col-id='mainActName' and text()='%s']";

	public static String UnPredictable_Tab_CAR = "Un Predictable tab>//div[@id='CRR-CRR_jTabbedPane1']//a[text()='Unpredictable Reporting']";
	public static String UnPredictable_Table_CAR = "Un Predicatble Table>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']";
	public static String UnPredictable_Activity_Column_CAR = "Un Predictable Activity Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@col-id='subactivitydes' and text()='%s']";
	public static String UnPredictable_CheckBox_Vendor_CAR = "Un Predictable Column Checkbox>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@col-id='vendorCode' and text()='%s']/ancestor::div[@role='row']//input";

	public static String Contracts_Used_Btn_CAR = "Contracts Used button>//button[@id='CRR-CRR_btnShowContracts']";
	public static String Contracts_Details_tab_CAR = "Contracts details tab>//div[@id='CRR_contractdlg']";
	public static String Activity_Behaviour_ID_CAR = "Activity Behaviour Value>//div[@id='CRR_contractdlg']//label[contains(text(),'Activity Behaviour Template')]";
	public static String Contract_Details_Ok_Btn_CAR = "Contract Details Ok Button>//button[@id='CRR_btnOkActionPerformed']";

	public static String Remarks_Tab_CAR = "Remarks Tab>//div[@id='CRR-CRR_jTabbedPane1']//a[text()='Remarks']";
	public static String Remarks_Text_Area_CAR = "Remarks Text Area>//textarea[@id='CRR-CRR_jTabbedPane1-CRR_jTextArea1']";

	public static String Remarks_Row_CAR = "Remarks Row>//tbody[contains(@id,'CRR_gridRemarks_data')]//tr";

	public static String Remarks_Values_Last_CAR = "Remarks Last Value>//tbody[contains(@id,'CRR_gridRemarks_data')]//tr[%s]//td[1]";
	public static String Remarks_User_Last_CAR = "Remarks User >//tbody[contains(@id,'CRR_gridRemarks_data')]//tr[%s]//td[2]";
	public static String Remarks_Date_Last_CAR = "Remarks Date>//tbody[contains(@id,'CRR_gridRemarks_data')]//tr[%s]//td[3]";

	public static String Refresh_Button_CAR = "Refresh Button>//button[@id='CRR-CRR_btnRefresh']";
//	public static String Select_Column_CAR="Select Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@ref='sideBar']//span[text()='%s']";
	public static String Select_Column_Predictable_CAR = "Select Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_smrylclloadgrid']//div[@ref='sideBar']//span[text()='%s']";
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

//	public static String MSC_Column_Filt_CAR="MSC Table Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//button[@ref='eToggleButton']";
//	public static String MSC_Filter_input_CAR="Column Filter Input >//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//input[@aria-label='Filter Columns Input']";
//	public static String MSC_SelectAll_Checkbox_CAR="Select All Check box>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//input[@aria-label='Toggle Select All Columns']";
//	public static String Select_Column_MSC_CAR="Select Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']//div[@ref='sideBar']//span[text()='%s']";
//	public static String MSC_Table_CAR="MSC Table >//div[@id='CRR-CRR_jTabbedPane1-CRR_gridMiscCAR_tbl']";

	public static String CAR_Close_Button = "CAR Close button>//button[@id='CRR-CRR_btnTDRClose']";
	public static String CAR_Closed_Label = "CAR Closed Label>//label[@id='CRR-CRR_lblCARClose']";
	public static String CAR_Open_Button = "CAR Open Button>//button[@id='CRR-CRR_btnTDROpen']";

	public static String Contract_Details_Table_Head_CAR = "Contract Details Table Header>//thead[@id='CRR_gridMessage_head']//th";
	public static String Contract_Details_Table_Row_CAR = "Contract Details Table Row>//tbody[@id='CRR_gridMessage_data']//tr";

	public static String More_Grid_UnPredictable_CAR = "More Grid unpredictable>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_nfr_toolpanel_li_id']";
	public static String Condition_UnPredictable_CAR = "Condition Filter unpredictable>//a[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_conditionFilter_id']";
	public static String Activity_Name_CAR = "Activity Name Input>//input[@aria-label='Activity Name Filter Input']";
	public static String Vendor_Code_Input_CAR = "Vendor Code Input>//input[@aria-label='Vendor Code Filter Input']";

	public static String Quantity_Column_CAR = "Quantity Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@role='gridcell' and@col-id='quantity']";
	public static String quantity_Input_CAR = "Quantity Input CAR>//input[contains(@id,'quantity_input')]";
	public static String Formula_Column_CAR = "Formula Column>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridActivity_tbl']//div[@role='gridcell' and@col-id='formula']";

	public static String Agency_Label_CAR = "Agency Label >//label[@id='CRR-CRR_lblagncycode']";

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
	public static String Open_Expense_Rows_val = "Open_Expense_Row>//div[@id='CRR_treeTableEXP_tbl']//div[@ref='centerContainer']//div[@role='row']";

	// vendor_contracts
	public static String search_icon_contract_type_Vc = "search_icon_contract_type_Vc>//button[@id='HAN-HAN_btnContractType-HAN_btnContractType']";
	public static String vendor_code_search_icon_Vc = "vendor_code_search_icon_Vc>//button[@id='HAN-HAN_btnSearVen']";
	public static String valid_from_date_Vc = "valid_from_date_Vc>//input[@id='HAN-HAN_dateFrom_input']";
	public static String valid_To_date_Vc = "valid_To_date_Vc>//input[@id='HAN-HAN_dateTo_input']";
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
	
	
//	public static String Show_Total_rows ="Show_Total_rows>//tbody[contains(@id,'CRR_gridtotalamtsummary_data')]//tr";
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
	
	
	//2602 Muthuram
	
	public static String Contract_Details_Header ="Contract_Details_Header>//thead[@id='CRR_gridMessage_head']//th";
	public static String Contract_Details_Body ="Contract_Details_Body>//tbody[@id='CRR_gridMessage_data']//tr";
	public static String Show_Contract_Mapping ="Show_Contract_Mapping>//div[@id='copycontractpopupmnu']//a[@id='contmap']";
	public static String ContractNo_Input ="ContractNo_Input>//input[@id='CMP-CMP_txtContractNo']";
	public static String ContractMapping_Screen ="ContractMapping_Screen>//form[@id='CMP']";
	public static String VendorContracts_Screen ="VendorContracts_Screen>//form[@id='HAN']";
	public static String VendorContracts_Number ="VendorContracts_Number>//input[@id='HAN-HAN_txtContractNo']";
	public static String CarSummary_Table ="CarSummary_Table>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']";
	public static String CarSummary_Activities ="CarSummary_GridActivity>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']//div[@row-id='%s']//div[@col-id='mainactdes']";
	public static String CarSummary_EqpType ="CarSummary_EqpType>//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview_tbl']//div[@row-id='%s']//div[@col-id='eqptype']";
	public static String Grp_Eqp ="Grp_Eqp>//button[@id='CRR-CRR_btnEqpSummary']";
	public static String Grp_Eqpsummary_Mainactivity ="Grp_Eqpsummary_Mainactivity>//div[@id='CRR_EqpTabbedPane1-CRR_gridEqp_summary_tbl']//div[@row-id='%s']//div[@col-id='mainactdes']";
	public static String Grp_Eqpsummary_Eqp ="Grp_Eqpsummary_Eqp>//div[@id='CRR_EqpTabbedPane1-CRR_gridEqp_summary_tbl']//div[@row-id='%s']//div[@col-id='eqptype']";
	public static String GES_Count ="GES_Count>//label[@id='CRR_EqpTabbedPane1-CRR_gridEqp_summary_records_lbl_cnt']";
	public static String GE_SummaryTab ="GE_SummaryTab>//a[text()='Group Equipment Summary']";
	public static String GES_Filter ="GES_Filter>(//a[@id='CRR_EqpTabbedPane1-CRR_gridgrpEqp_summary_conditionFilter_id'])[2]";

	public static String GES_Records ="GES_Records>//label[@id='CRR_EqpTabbedPane1-CRR_gridgrpEqp_summary_records_lbl_cnt']";

	public static String GES_Summary_Activity ="GES_Summary_Activity>//div[@id='CRR_EqpTabbedPane1-CRR_gridgrpEqp_summary_tbl']//div[@row-id='%s']//div[@col-id='mainactdes']";
	public static String GES_Summary_eqptype ="GES_Summary_Activity>//div[@id='CRR_EqpTabbedPane1-CRR_gridgrpEqp_summary_tbl']//div[@row-id='%s']//div[@col-id='grpEqp']";

	
}
