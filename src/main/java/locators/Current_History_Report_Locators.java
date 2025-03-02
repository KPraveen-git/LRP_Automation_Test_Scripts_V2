package locators;

public interface Current_History_Report_Locators extends Disbursement_Locators{
	
	// Current History and report(Equipment Report_TS_029:
	public static String payLoadTextField_2 = "payLoadTextField_2>//input[@id='CNP-CNP_txtpayload_hinput']";
	public static String reportByOpt = "reportByOpt>//div[@id='CCH-CCH_cbxStatus']";
	public static String summaryOpt = "summaryOpt>//*[text()='Summary']";
	public static String showOpt = "showOpt>//*[@id='CCH-CCH_btnShowRpt']";
	public static String currentOpt = "currentOpt>//li[@id='CCH-CCH_cbxStatus_1']";
	public static String includeShipperOwnedOpt = "includeShipperOwnedOpt>//*[@id='CCH-CCH_cbxSoc']";
	public static String yesShippOpt = "yesShippOpt>//*[@id='CCH-CCH_cbxSoc_1']";
	public static String displayDragOpt = "displayDragOpt>//div[@ref='eCenterContainer']//div[@role='row']";
	 public static String reportBySelect ="reportBySelect>//li[text()='%s']";
   public static String shipperOwnedOption ="shipperOwnedOption>//li[text()='%s']";
   public static String  FromLoc ="FromLoc>//div[@id='CCH-CCH_cbxLocaHire_panel']//li[text()='%s']";
	public static String ToLoc ="ToLoc>//div[@id='CCH-CCH_cbxToLocHire_panel']//li[text()='%s']";
	public static String closeOption = "closeOption>(//*[@id='nfr_tab_dashboard_title']//following::i)[3]";
	public static String closeSymbols = "closeSymbols>(//span[@id='CCH-CCH_detailRqstDialog-DCP_customDetailRequestDialog_title']//following::span)[1]";
	public static String dashboard_Title = "dashboard_Title>//*[@id='nfr_tab_dashboard_title']";


	// Current History and Report(Equipment Report_TS_030)

	public static String detailsOPt = "detailsOPt>//*[text()='Detail']";
	public static String requestResponsePopup = "requestResponsePopup>(//*[text()='Report request sent'])[1]";
	public static String downloadOpt = "downloadOpt>//*[@id='CCH-CCH_detailRqstDialog-DCP_CmdBtn']";
	public static String processed = "processed>//*[text()='Processed']";
	public static String reportDownload = "reportDownload>//*[text()='Report Request']//following::td[1]";
	public static String To_Date_new = "To_Date>//input[@id='LSR-LSR_toDP_input']";

	// Current History and Report(Equipment Report_TS_031 & 32)
	public static String ATo_Date = "To_Date>//input[@id='SCN-SCN_txtTo_input']";
	public static String khistoryOpt = "khistoryOpt>//li[text()='History']";
	public static String kDateSearch = "kDateSearch>//*[@id='CCH-CCH_btnDateFilter']";
	public static String kActivityDate = "kActivityDate>//input[@id='CCH_txtActFromDate_input' and @data-p-pattern='dd/mm/yy']";
	public static String kMonthSearch = "kMonthSearch>//*[@data-handler='selectMonth']";
	public static String kMarchMon = "kMarchMon>//option[text()='Mar']";
	public static String kActivityDateLast = "kActivityDateLast>//*[@id='CCH_txtActToDate_input']";
	public static String kCreationDate = "kCreationDate>//*[@id='CCH_txtCrFromDate_input']";
	public static String kCreationDateLast = "kCreationDateLast>//input[@id='CCH_txtCrToDate_input']";
	public static String kModifyDate = "kModifyDate>//*[@id='CCH_txtModFromDate_input']";
	public static String kModifyDateLast = "kModifyDateLast>//*[@id='CCH_txtActModDate_input']";
	public static String kOkOption = "kOkOption>//*[@id='CCH_btnOk']";

	public static String kCurrentDate = "kCurrentDate>//td[contains(@class,'ui-datepicker-today')]";
	public static String Report_download = "Report_download>//*[@id='CCH-CCH_detailRqstDialog-DCPDialogform-DCP_DataTable-0-dcpRqstId']";

	public static String close_Tab_EMS="close_Tab_EMS>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";

	public static String column_Filter="column_Filter>(//th[contains(@aria-label,'Columns Name: ')])[1]//input";
	public static String Column_Field="Column_Field>//input[@aria-label='Columns Name Filter Input']";
	
	
	
	
	public static String SizeType_Standard = "SizeType_Standard>//span[text()='Sz/Tp Standard']";
	public static String StockStatus_PlusBtn = "StockStatus_PlusBtn>//button[@id='CCH-CCH_btnStockStatus']";
	public static String Stock_SearchTF = "Stock_SearchTF>//input[@aria-label='Stock Status Code Filter Input']";
	public static String Select_Btn = "Select_Btn>//button[@id='multicol_okbtn']";
	public static String Search_Popup = "Search_Popup>//div[text()='Values should be selected']";
	public static String Close_Popup = "Close_Popup>(//div[@id='primefacesmessagedlg']//following::a)[1]";
	public static String Search_Close = "Search_Close>(//label[@id='nfr_sch_mu_header']//following::a)[1]";
	public static String Loc_CloseBtn = "Loc_CloseBtn>//button[@id='nfr-twocol-select-button']";
	public static String StockStatus_MinusBtn = "StockStatus_MinusBtn>//button[@id='CCH-CCH_btnRmvStock']";
	public static String ActivityCode_PlusBtn = "ActivityCode_PlusBtn>//button[@id='CCH-CCH_btnActivity']";
	public static String ActivityCode_TF = "ActivityCode_TF>//input[@aria-label='Activity Code Filter Input']";

	public static String Service_SearchBtn = "Service_SearchBtn>//button[@id='CCH-CCH_btnService']";
	public static String Servicevalue_TF = "Service_TF>//input[@aria-label='Service Filter Input']";
	public static String Value_select = "Value_select>(//div[@id='nfr-twocolsearch-div']//following::div[@aria-colindex='1'])[2]";
	public static String Value_Select_btn = "Value_Select_btn>//button[@id='nfr-twocol-select-button']";
	public static String Disposal_RegNo_SearchBtn = "Disposal_RegNo_SearchBtn>//button[@id='CCH-CCH_btnDispRegNo']";
	public static String Disposal_RegNo_TF = "Disposal_RegNo_TF>//input[@aria-label='Disposal Registration No. Filter Input']";
	public static String BookNo_SearchBtn = "BookNo_SearchBtn>//button[@id='CCH-CCH_btnDocrefNo']";
	public static String BookNo_TF = "BookNo_TF>//input[@aria-label='Book No. Filter Input']";

	public static String ActivityCode_MinusBtn = "ActivityCode_MinusBtn>//button[@id='CCH-CCH_btnRmvAct']";
	public static String SupplierContract_PlusBtn = "SupplierContract_PlusBtn>//button[@id='CCH-CCH_btnAddSupp']";
	public static String Suppliercontract_TF = "Suppliercontract_TF>//input[@aria-label='Supplier contract Filter Input']";
	public static String SupplierContract_minusBtn = "SupplierContract_minusBtn>//button[@id='CCH-CCH_btnRmvSupp']";

	public static String Vessel_PlusBtn = "Vessel_PlusBtn>//button[@id='CCH-CCH_btnVessel']";
	public static String Vessel_TF = "Vessel_TF>(//input[contains(@aria-label,'Filter Input')])[1]";
	public static String voyage_TF = "voyage_TF>(//input[contains(@aria-label,'Filter Input')])[2]";
	public static String Bound_TF = "Bound_TF>(//input[contains(@aria-label,'Filter Input')])[3]";

	public static String Vessel_MinusBtn = "Vessel_MinusBtn>//button[@id='CCH-CCH_btnVoyage']";
	public static String LeaseKind_PlusBtn = "LeaseKind_PlusBtn>//button[@id='CCH-CCH_btnAddLKind']";
	public static String LeaseKind_TF = "LeaseKind_TF>//input[@aria-label='Lease Kind Filter Input']";

	public static String LeaseKind_MinusBtn = "LeaseKind_MinusBtn>//button[@id='CCH-CCH_btnRmvLKind']";
	public static String Lease_PlusBtn = "Lease_PlusBtn>//button[@id='CCH-CCH_btnAddLessee']";
	public static String Lease_TF = "Lease_TF>//input[@aria-label='Lessee Code Filter Input']";

	public static String Lease_MinusBtn = "Lease_MinusBtn>//button[@id='Lease_PlusBtn']";
	public static String SizeType_special = "SizeType_special>//span[.='Sz/Tp Special']";
	public static String Region_TF = "Region_TF>//input[@id='CCH-CCH_txtToLocCode']";
	public static String POD_TF = "POD_TF>//input[@id='CCH-CCH_txtPod']";
	public static String Destination_TF = "Destination_TF>//input[@id='CCH-CCH_txtDest']";
	public static String SizeType_PlusBtn = "SizeType_PlusBtn>//button[@id='CCH-CCH_btnAddEtype']";
	public static String SizeType_TF = "SizeType_TF>//input[@aria-label='Equipment Type Filter Input']";

	public static String SizeType_MinusBtn = "SizeType_MinusBtn>//button[@id='CCH-CCH_btnRmvEtype']";
	public static String CustomerContract_PlusBtn = "CustomerContract_PlusBtn>//button[@id='CCH-CCH_btnAddSubl']";
	public static String Customercontract_TF = "Customercontract_TF>//input[@aria-label='Customer contract Filter Input']";
	public static String Popup_Value = "Popup_Value>(//div[@id='nfr-multi-div']//following::div[@aria-colindex='2'])[2]";

	public static String CustomerContract_minusBtn = "CustomerContract_minusBtn>//button[@id='CCH-CCH_btnRmvSubl']";
	public static String Lessor_PlusBtn = "Lessor_PlusBtn>//button[@id='CCH-CCH_btnAddLessor']";
	public static String Lessor_TF = "Lessor_TF>//input[@aria-label='Lessor Code Filter Input']";

	public static String Lessor_MinusBtn = "Lessor_MinusBtn>//button[@id='CCH-CCH_btnRmvLessor']";
	public static String Service_TF = "Service_TF>//input[@id='CCH-CCH_txtService']";
	public static String FlagCode_PlusBtn = "FlagCode_PlusBtn>//button[@id='CCH-CCH_btnAddFlg']";
	public static String FlagCode_TF = "FlagCode_TF>//input[@aria-label='Flag Code Filter Input']";
	public static String From_Loc_Hierarchy_Dropdown = "From_Loc_Hierarchy_Dropdown>//label[@id='CCH-CCH_cbxLocaHire_label']";
	public static String From_Loc_region_searchbtn = "Loc_region_searchbtn>//button[@id='CCH-CCH_btnArea']";
	public static String From_Loc_Region_TF = "Loc_Region_TF>//input[@aria-label='Region Code Filter Input']";
	public static String Loc_POR_searchBtn = "Loc_POR_searchBtn>//button[@id='CCH-CCH_btnPor']";
	public static String Loc_POR_TF = "Loc_POR_TF>//input[@aria-label='Port Code Filter Input']";
	public static String Loc_POL_TF = "Loc_POL_SearchBtn>//input[@aria-label='Port Code Filter Input']";
	public static String Loc_POL_SearchBtn = "Loc_POL_SearchBtn>//button[@id='CCH-CCH_btnPol']";
	public static String To_Region_searchBtn = "To_Region_searchBtn>//button[@id='CCH-CCH_btnToLoc']";
	public static String To_Region_TF = "To_Region_TF>//input[@aria-label='Region Code Filter Input']";

	public static String FlagCode_MinusBtn = "FlagCode_MinusBtn>//button[@id='CCH-CCH_btnRmvFlg']";
	public static String Disposal_TF = "Disposal_TF>//input[@id='CCH-CCH_txtDispregno']";
	public static String BookNo_Tf = "BookNo_Tf>//input[@id='CCH-CCH_txtDocrefno']";
	public static String IncludeBL_checkBox = "IncludeBL_checkBox>(//input[@id='CCH-CCH_chkShowBL_input']//following::div)[1]";
	public static String To_Loc_Hierarchy_Dropdown = "Loc_Hierarchy>//label[@id='CCH-CCH_cbxToLocHire_label']";
	public static String Loc_POD_SearchBtn = "Loc_POD_SearchBtn>//button[@id='CCH-CCH_btnPod']";
	public static String Loc_POD_TF = "Loc_POD_TF>//input[@aria-label='Port Code Filter Input']";
	public static String Loc_Destination_SearchBtn = "Loc_Destination_SearchBtn>//button[@id='CCH-CCH_btnDest']";
	public static String Loc_Destination_TF = "Loc_Destination_TF>//input[@aria-label='Port Code Filter Input']";
	public static String portOpt = "portOpt>((//*[@id='CCH-CCH_gridSummary_tbl']//following::span[contains(text(),'Port')])[1]//following::div[contains(@aria-colindex,'1')])[3]";
	public static String DeportOpt = "DeportOpt>((//*[@id='CCH-CCH_gridSummary_tbl']//following::span[contains(text(),'Depot')])[1]//following::div[contains(@aria-colindex,'2')])[3]";
	public static String Popup = "Popup>//div[@id='lrp_cust_growl_container']//p";


}
