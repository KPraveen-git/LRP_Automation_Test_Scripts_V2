package locators;

public interface EMS_Locators extends Common_Locators{


//	public static String ELogin = "Login>//*[@id='nfr_login_btnlogin']";
//	public static String searchField = "searchField>//button[@name='ESN-ESN_btnPartnerSearch-ESN_btnPartnerSearch']";
//	public static String ediSearch = "ediSearch>//*[@id='ESN-ESN_btnEDISearch']";
//	public static String chooseOption = "chooseOption>//div[@id='ESN-ESN_btnURLSearch']";
//	public static String ediRequestSubmission = "ediRequestSubmission>//span[text()='EDI Request Submission']";
//	public static String tp001Val = "tp001Val>//div[text()='TP001']";
//	public static String edi20Val = "edi20Val>//div[text()='EDI20']";
//	public static String TPD86SelectOp = "TPD86SelectOp>//*[@id='nfr-twocol-select-button']//*[text()='Select']";
//	public static String saveOpt = "saveOpt>//button[@id='ESN-tbl-btnsave']";
//	public static String ediSearchOption = "ediSearchOption>//*[@aria-label='Edi Id Filter Input']";
//	public static String savePopup = "savePopup>(//p[contains(text(),'EDI Request Submitted Successfully')])[1]";
//
//	// Current History and report(Equipment Report_TS_029:
//	public static String payLoadTextField_2 = "payLoadTextField_2>//input[@id='CNP-CNP_txtpayload_hinput']";
//	public static String reportByOpt = "reportByOpt>//div[@id='CCH-CCH_cbxStatus']";
//	public static String summaryOpt = "summaryOpt>//*[text()='Summary']";
//	public static String showOpt = "showOpt>//*[@id='CCH-CCH_btnShowRpt']";
//	public static String currentOpt = "currentOpt>//li[@id='CCH-CCH_cbxStatus_1']";
//	public static String includeShipperOwnedOpt = "includeShipperOwnedOpt>//*[@id='CCH-CCH_cbxSoc']";
//	public static String yesShippOpt = "yesShippOpt>//*[@id='CCH-CCH_cbxSoc_1']";
//	public static String displayDragOpt = "displayDragOpt>//div[@ref='eCenterContainer']//div[@role='row']";
//
//	// Current History and Report(Equipment Report_TS_030)
//
//	public static String detailsOPt = "detailsOPt>//*[text()='Detail']";
//	public static String requestResponsePopup = "requestResponsePopup>(//*[text()='Report request sent'])[1]";
//	public static String downloadOpt = "downloadOpt>//*[@id='CCH-CCH_detailRqstDialog-DCP_CmdBtn']";
//	public static String processed = "processed>//*[text()='Processed']";
//	public static String reportDownload = "reportDownload>//*[text()='Report Request']//following::td[1]";
//	public static String To_Date_new = "To_Date>//input[@id='LSR-LSR_toDP_input']";
//
//	// Current History and Report(Equipment Report_TS_031 & 32)
//	public static String ATo_Date = "To_Date>//input[@id='SCN-SCN_txtTo_input']";
//	public static String khistoryOpt = "khistoryOpt>//li[text()='History']";
//	public static String kDateSearch = "kDateSearch>//*[@id='CCH-CCH_btnDateFilter']";
//	public static String kActivityDate = "kActivityDate>//input[@id='CCH_txtActFromDate_input' and @data-p-pattern='dd/mm/yy']";
//	public static String kMonthSearch = "kMonthSearch>//*[@data-handler='selectMonth']";
//	public static String kMarchMon = "kMarchMon>//option[text()='Mar']";
//	public static String k2 = "k2>//a[text()='2']";
//	public static String kActivityDateLast = "kActivityDateLast>//*[@id='CCH_txtActToDate_input']";
//	public static String k21 = "k21>//a[text()='21']";
//	public static String kCreationDate = "kCreationDate>//*[@id='CCH_txtCrFromDate_input']";
//	public static String k6 = "k6>//a[text()='6']";
//	public static String kCreationDateLast = "kCreationDateLast>//input[@id='CCH_txtCrToDate_input']";
//	public static String k13 = "k13>//a[text()='13']";
//	public static String kModifyDate = "kModifyDate>//*[@id='CCH_txtModFromDate_input']";
//	public static String k10 = "10>//a[text()='10']";
//	public static String kModifyDateLast = "kModifyDateLast>//*[@id='CCH_txtActModDate_input']";
//	public static String k17 = "17>//a[text()='17']";
//	public static String kOkOption = "kOkOption>//*[@id='CCH_btnOk']";
//
//	public static String k1 = "1>//a[text()='1']";
//	public static String kCurrentDate = "kCurrentDate>//td[contains(@class,'ui-datepicker-today')]";
//	public static String Report_download = "Report_download>//*[@id='CCH-CCH_detailRqstDialog-DCPDialogform-DCP_DataTable-0-dcpRqstId']";
//
//	public static String close_Tab_EMS="close_Tab_EMS>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//
//	public static String Column_Field="Column_Field>//input[@aria-label='Columns Name Filter Input']";
//
//	//sc22
//	public static String Partner="Partner>//div[text()='%s']";
//	public static String searchedEDI_Value ="searchedEDI_Value>//div[@role='gridcell' and text()='%s']";
//    public static String Select_Data="Select_Data>//div[@id='nfr-twocolsearch-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
//	//sc33
//	public static String date_select ="date_select>//div[@id='ui-datepicker-div']//a[text()='%s']";
//    public static String select_value="select_value>//label[@ref='eSelectAllContainer']//following::span[text()='%s']";
//    public static String Error_Record_List="Error_Record_List>//div[@ref='eCenterViewport']//div[@col-id='uploadstatus']//following::div[@col-id='uploadstatus']//preceding::div[@role='row'][1]";
//    public static String error_Row = "error_Row>//div[@ref='eCenterViewport']//div[contains(@class,'sm-bg-pink ag-row-position') and @row-index='%s']";
//    public static String error_File="error_File>//div[@ref='eCenterViewport']//div[@role='row' and @row-index='%s']//preceding-sibling::div[@col-id='edireaderid']";
//   public static String Ems_gate_Frame="Ems_gate_Frame>//label[@id='mdl1_tablbl' and .='EMS Gate']";
//    
//   //sc34
//   public static String equipment_Select="equipment_Select>//table[@id='nfr_sch_jdlg_form-nfr_sch_jd_pnl']//div[@ref='eCenterColsClipper']//div[@role='row']";
// 
//   //sc35
//   public static String Data_select="Edi_File_select>//div[@id='nfr_sch_mu_pnl_content']//div[@ref='eCenterContainer']//div[@row-index='0']";
//   //sc29
//    public static String reportBySelect ="reportBySelect>//li[text()='%s']";
//    public static String shipperOwnedOption ="shipperOwnedOption>//li[text()='%s']";
//    public static String  FromLoc ="FromLoc>//div[@id='CCH-CCH_cbxLocaHire_panel']//li[text()='%s']";
//	public static String ToLoc ="ToLoc>//div[@id='CCH-CCH_cbxToLocHire_panel']//li[text()='%s']";
//
//	//sc30
// //sc54
//	public static String Module_Select = "Module_Select>//div[@id='nfr_topbar_autocomp_panel' and contains(@style,'display: block;')]//li[contains(translate(@data-item-label, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),translate('%s', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'))]";
//	public static String Activity_Group_Value ="Activity_Group_Value>//li[text()='%s']";
//	public static String Stock_Status_Value ="Stock_Status_Value>//li[text()='%s']";
//	public static String Empty_Full_Value = "Empty_Full_Value>//li[text()='%s']";
//	public static String Soc_Activity1 ="Soc_Activity1>//ul[@id='CAV-CAV_cmbAllowSOC_items']//li[text()='%s']";
//    public static String AllowForce_Value ="AllowForce_Value>//ul[@id='CAV-CAV_cmbAllowFrc_items']//li[text()='%s']";
//    public static String Is_special_Value ="Is_special_Value>//ul[@id='CAV-CAV_cmbIsSpecial_items']//li[text()='%s']";
//    public static String Auto_EIR_Value ="Auto_EIR_Value>//ul[@id='CAV-CAV_cmbAutoEIR_items']//li[text()='%s']";
//    public static String Activity_Type_Value ="Activity_Type_Value>//li[text()='%s']";
//    public static String Stock_Location_Value ="Stock_Location_Value>//li[text()='%s']";
//    public static String EIR_Status_Value ="EIR_Status_Value>//li[text()='%s']";
//    public static String From_Loc_Value ="From_Loc_Value>//ul[@id='CAV-CAV_cmbFromLoc_items']//li[text()='%s']";
//    public static String To_Loc_Value ="To_Loc_Value>//ul[@id='CAV-CAV_cmbToLoc_items']//li[text()='%s']";
//    public static String Link_Chassis_Value = "Link_Chassis_Value>//li[text()='%s']";
//    public static String Booking_No_update_Value ="Booking_No_update_Value>//li[text()='%s']";
//    public static String Pool_Chassis_Activity_Value ="Pool_Chassis_Activity_Value>//li[text()='%s']";
//    public static String Transmit_Indicator_Value ="Transmit_Indicator_Value>//li[text()='%s']";
//    public static String Non_Pool_Chassis_Activity_Value ="//li[text()='%s']";
//    public static String Allow_Interchange_Value = "Allow_Interchange_Value>//li[text()='%s']";
//    public static String Master_Required_Value ="Master_Required_Value>//li[text()='%s']";
//    public static String Active_Value_Select="Active_Value_Select>//span[text()='%s']";
//
////SC55
//    public static String Activity_code="Activity_code>//div[text()='%s']";
//
////SC56
//	public static String ToolPanel1="ToolPanel1>//div[@id='CAV-CAV_dsGridConActy_nfr_toolpanel_li_id']";
//	public static String Confitionfilter1="Confitionfilter1>//a[@id='CAV-CAV_dsGridConActy_conditionFilter_id']";
//
////sc11_I
//	public static String contype_opt ="contype_opt>//ul//*[text()='%s']";
//	public static String con_cat ="con_cat>//ul[@id='RMS-RMS_cmbContrCateg_items']//li[text()='%s']";
//	public static String unitteu ="unitteu>//ul[contains(@id, 'RMS-RMS_cmbUnit') and contains(@id, '_items')]//li[text()='%s']";
//	public static String currency_value = "currency_value>//ul[@id='RMS-RMS_cmbCur_items']//li[text()='%s']";
//	public static String diallow_value ="diallow_value>//ul[@id='RMS-RMS_cmbDiall_items']//li[text()='%s']";
//	public static String billpay_value ="billpay_value>//ul[@id='RMS-RMS_cmbpaymenttype_items']//li[text()='%s']";
//	public static String sizevalue_option="sizevalue_option>(//*[text()='%s'])[2]";
//	public static String lease_option="lease_option>(//*[text()='%s'])[2]";
//	public static String DPPbasis_value = "DPPbasis_value>//ul[@id='RMS-RMS_cmbDppBasis_items']//li[text()='%s']";
//    public static String DPPlumpsum_value = "DPPlumpsum_value>//ul[@id='RMS-RMS_cmbDppLumpsum_items']//li[text()='%s']";
//    public static String DPPwaiver_value = "DPPwaiver_value>//ul[@id='RMS-RMS_cmbDppWaiver_items']//li[text()='%s']";
//    public static String combinevol_value ="combinevol_value//ul[@id='RMS-RMS_cmbCombVol_items']//li[text()='%s']";
//    public static String locationhier_field ="locationhier_field>//li[text()='%s']";
//    public static String location_data1 ="location_data>(//div[text()='%s'])[1]";
//    public static String sizevalue_field ="sizevalue_field>//div[@id='RMS-RMS_cmbHierEqp_panel']//li[text()='%s']";
//    
//    public static String Select_Value="Select_Value>//div[@id='nfr_sch_tw_pnl_content']//div[@ref='eCenterContainer']//div[@row-index='0']";
//
//    
//    //sc12_I
//    public static String Activity_Date="Activity_Date>//input[@id='CGE-CGE_txtMulActivityDate_input']";
//    public static String LeaseKind_Value = "LeaseKind_Value>(//li[text()='%s'])"; 
//   public static String Onhi_Ofhi_select="Onhi_Ofhi_select>(//div[@id='CGE-CGE_txtMulActivity_panel']//td)[1]"; 
//    public static String Location_select="Location_select>(//div[@id='CGE-CGE_txtSinLocation2_panel']//tr)[2]"; 
//    public static String Depot_select="Depot_select>(//div[@id='CGE-CGE_txtSinDepot_panel']//tr)[2]";
//    public static String Size_type_select="Size_type_select>//div[@id='CGE-CGE_cmbSinSpec_panel']//ul[@id='CGE-CGE_cmbSinSpec_items']";
//    public static String Movement_Entry_Popup="Movement_Entry_Popup>(//h2[text()='Movement Entry']//following::span)[2]";
//    
//   //sc18_I
//    String contype_opt1 = "contype_opt>((//*[text()='%s'])[2])";
//    
//    //SC19_I
//    String location_data = "location_data>((//div[text()='%s'])[1])";
//    String depreciation_option="depreciation_option>(//li[text()='%s'])";
//    //sc20_I
//    String location_Data = "location_data>((//div[text()='%s'])[1])";
//    
//    public static String Current_History_Report="Current_History_Report>//li[@data-item-label='Current / History Report ']";
//
//
//	// Abinaya
//
//	// TC_EMS_Contract_Registration_TS001
//	public static String search_field = "search_field >(//div[@ref='eFloatingFilterInput']//input)[1]";
//	public static String Eusername = "Eusername >//*[@id='nfr_login_authname']";
//	public static String Epassword = "Epassword >//*[@id='nfr_login_authid']";
//	public static String ELogin_btn = "ELogin_btn >//*[@id='nfr_login_btnlogin']";
//	public static String Eloginpage = "Eloginpage >//*[text()='SOLVERMINDS']";
//	public static String EHome_page = "EHome_page >//*[@id='ui-id-1']";
//	public static String Esearch_bar = "Esearch_bar >//*[@id='nfr_topbar_autocomp_input']";
//	public static String Emodule_name = "Emodule_name >(//*[text()='EMS Contract Registration'])[2]";
//	public static String Esave_button = "Esave_button >//*[@id='RMS-RMS_tblsvm-btnsave']";
//	public static String Econtractno_field = "Econtractno_field >//*[@id='RMS-RMS_txtContractno']";
//	public static String Econtracttype_field = "Econtracttype_field >(//label[@id='RMS-RMS_cmbContractType_label']/following::span)[1]";
//	public static String Eleasekind_searchicon = "Eleasekind_searchicon >//*[@id='RMS-RMS_btnLsKind']";
//	public static String Eleasekind_selectvalue = "Eleasekind_selectvalue >//*[text()='MASTER LEASE AGREEMENTT']";
//	public static String Eleasekind_selectbutton = "Eleasekind_selectbutton>(//span[text()='Select'])[1]";
//	public static String Elessorcode_searchicon = "Elessorcode_searchicon>//*[@id='RMS-RMS_btnLessor']";
//	public static String Elessorcode_searchbar = "Elessorcode_searchbar >(//span[text()='Lessor Code']//following::input)[2]";
//	public static String Elessorcode_searchvalue = "lessorcode_searchvalue >//*[text()='THE CHINA NAVIGATION CO. PTE LTD.']";
//	public static String Elessee_searchicon = "Elessorcode_searchvalue >//*[@id='RMS-RMS_btnlesse']";
//	public static String Elessee_searchbar = "Elessee_searchbar >(//span[text()='Lessee Code ']//following::input)[2]";
//	public static String Elesseecode_searchvalue = "Elesseecode_searchvalue>//*[text()='SVM SHIPPING']";
//	public static String Evaild_from = "Evaild_from>//*[@id='RMS-RMS_txtValidFrm_input']";
//	public static String Eclick_fromdate = "Eclick_fromdate >//*[text()='1']";
//	public static String Evaild_to = "Evaild_to >//*[@id='RMS-RMS_txtvalidTo_input']";
//	public static String Eclick_todate = "Eclick_todate >//a[text()='15']";
//	public static String Esizeandtype_tab = "Esizeandtype_tab >//a[text()='Size/Type']";
//	public static String Esizeandtype_Field = "Esizeandtype_Field >//*[@id='RMS-RMS_cmbEqp_label']";
//	public static String Esizeandtype_Field1 = "Esizeandtype_Field1 >(//div[@id='RMS-RMS_cmbEqp_panel']//following::li[@data-label='40DC'])[1]";
//	public static String contract_types = "contract_types>//ul[@id='RMS-RMS_cmbContractType_items']";
//	public static String Eleasechargetype_Field = "Eleasechargetype_Field >//*[@id='RMS-RMS_cmbLeasechType_label']";
//	public static String sizeandtype_Value = "sizeandtype_Value >//li[text()='20DC']";
//	public static String leasechargetype_Value = "leasechargetype_Value >(//*[text()='N - No banding'])[2]";
//	public static String Eperdiem_field = "Eperdiem_field >//*[@id='RMS-RMS_txtPerdiem_input']";
//	public static String Esizeaddbutton = "Esizeaddbutton>//button[@id='RMS-RMS_btnEqpAdd']";
//	public static String Etermandcharges = "Etermandcharges >//*[text()='Terms and Charges']";
//	public static String ELocationhierarchy_field = "ELocationhierarchy_field >//*[@id='RMS-RMS_cmbHierarchy_label']";
//	public static String Elocationaddbutton = "Elocationaddbutton >//*[@id='RMS-RMS_btnPortAdd']";
//	public static String Elocationsearchtab = "Elocationsearchtab >(//*[text()='Ports Code ']//following::input)[3]";
//	public static String Eclicklocation_checkbox = "Eclicklocation_checkbox >//*[text()='SGSIN']";
//	public static String Elocation_selectbutton = "Elocation_selectbutton >(//span[text()='Select'])[2]";
//	public static String Etermchange_size = "Etermchange_size >//*[@id='RMS-RMS_cmbHierEqp_label']";
//	public static String Etermchange_addbutton = "Etermchange_addbutton >(//span[text()='ADD'])[2]";
//	public static String Edepreciationtab = "Edepreciationtab >//*[text()='Depreciation']";
//	public static String Edepreciation_Type = "Edepreciation_Type >//*[@id='RMS-RMS_cmbDeprType_label']";
//	public static String Edepreciationsave_button = "Edepreciationsave_button >//*[@id='RMS-RMS_tblsvm-btnsave']";
//	public static String Edepreciationedit_button = "Edepreciationedit_button >//*[@id='RMS-RMS_tblsvm-btnTblEdit']";
//	public static String Esuccessfully_popup = "Esuccessfully_popup>//*[text()='EMS Contract Registration saved']";
//	public static String logout_button = "logout_button >//*[@id='nfr_topbar_logout']";
//	public static String logout_yesbutton = "logout_yes_button >//*[@id='nfr_logout_cnf_form-nfr_logout_cnf_yes']";
//	public static String singleEdit_2 = "singleEdit_2>//div[contains(@style,'display: block;')]//child::a[@id='CGE-CGE_jMnuEdit']"; // changed
//	public static String sizetypeDropdownoption = "sizetypeDropdownoption>//*[@id='RMS-RMS_cmbEqp_label']";
//	public static String Dropdown = "Dropdown>//label[@id='RMS-RMS_cmbContractType_label']";
//	public static String leasetypeDropdownoption = "leasetypeDropdownoption>//*[@id='RMS-RMS_cmbLeasechType_label']";
//	public static String locationDropdownoption ="locationDropdownoption>//*[@id='RMS-RMS_cmbHierarchy_label']";
//	public static String termsizetypeDropdownoption ="termsizetypeDropdownoption>//label[@id='RMS-RMS_cmbHierEqp_label']";
//	public static String depreciationtypeDropdownoption ="depreciationtypeDropdownoption>//*[@id='RMS-RMS_cmbDeprType_label']";
//	// TC_EMS_Contract_Registration_TS002
//	public static String locationDropdownoption2 ="locationDropdownoption2>//*[@id='SUM-SUM_cmbselection_label']";
//	public static String monthly_utilized_summary = "monthly_utilized_summary>//tbody[@id='RMS-RMS_treeAlocation_data']//tr[1]";
//	public static String scrollSizeType = "scrollSizeType>//div[@id='RMS-RMS_cmbEqp_panel']/div[@style='max-height:200px']";
//	public static String search_icon = "search_icon >//*[@id='RMS-RMS_tblsvm-btnTblJdlgSearch']";
//	public static String search_contractfield = "search_contractfield >//*[@id='txt_name1']";
//	public static String search_button = "search_button >//*[text()='SEARCH']";
//	public static String search_selecticon = "search_selecticon >(//span[text()='Select'])[3]";
//	public static String contractno_refreshbutton = "contractno_refreshbutton >//*[@id='RMS-RMS_btnrefresh']";
//	public static String edit_button = "edit_button >//*[@id='RMS-RMS_tblsvm-btnTblEdit']";
//	public static String contractupdated_popup = "contractupdated_popup >//*[text()='EMS Contract Registration Updated']";
//	public static String sizeadd_button = "sizeadd_button >(//span[text()='Add'])[1]";
//	public static String size_typeerror_msg = "size_typeerror_msg>//*[text()='The Sz./Tp 20DC already exists']";
//	public static String click_sizedetail = "click_sizedetail >//*[@id='RMS-RMS_treeEqp_data']";
//	public static String click_removebutton = "click_removebutton >(//span[text()='Remove'])[1]";
//	public static String click_yesbutton = "click_yesbutton >//button[text()='Yes']";
//	public static String bookingNumber_Textfield="bookingNumber_Textfield>//input[@id='CGE-CGE_txtSinDocRefNo']";
//	public static String activePlaceCheckbox_L = "activePlaceCheckbox>//td[contains(text(),'Activity Place')]//preceding::td[1]";
//	public static String depotCheckbox_L = "depotCheckbox>//td[contains(text(),'Depot')]//preceding::td[1]/input";
//	public static String releaseRefCheckBox_L = "releaseRefCheckBox_L>//td[contains(text(),'Release Ref')]//preceding::td[1]/input";
//	public static String sizeTypeCheckBox_L="sizeTypeCheckBox_L>//td[contains(text(),'Size/Type')]//preceding::td[1]/input";
//	public static String isoCheckBox_L="isoCheckBox_L>//td[contains(text(),'ISO')]//preceding::td[1]/input";
//	public static String leaseKind_CheckBox="leaseKind_CheckBox>//td[contains(text(),'Lease Kind')]//preceding::td[1]/input";
//	public static String lessor_CheckBox="lessor_CheckBox>//td[contains(text(),'Lessor')]//preceding::td[1]/input";
//	public static String lessee_CheckBox="lessee_CheckBox>//td[contains(text(),'Lessee')]//preceding::td[1]/input";
//	public static String remark_ChecBox="remark_ChecBox>//td[contains(text(),'Remarks')]//preceding::td[1]/input";
//	public static String material_CheckBox = "material_CheckBox>//td[contains(text(),'Material')]//preceding::td[1]/input";
//	public static String payLoad_Checkbox_L = "payLoad_Checkbox_L>//td[contains(text(),'Pay Load')]//preceding::td[1]/input";
//	public static String grossWeihgt_Checkbox_L = "grossWeihgt_Checkbox_L>//td[contains(text(),'GrossWeight')]//preceding::td[1]/input";
//	public static String supplierContract_CheckBox = "supplierContract_CheckBox>//td[contains(text(),'SupplierContract')]//preceding::td[1]/input";
//	public static String manufactureDate_CheckBox = "manufactureDate_CheckBox>//td[contains(text(),'Manufacturedate')]//preceding::td[1]/input";
//	public static String refNumber_CheckBox = "refNumber_CheckBox>//td[contains(text(),'Ref Number')]//preceding::td[1]/input";
//	public static String thirtyDon_CheckBox = "thirtyDon_CheckBox>//td[contains(text(),'30Ton')]//preceding::td[1]/input";
//	public static String blNo_ChecBox = "blNo_ChecBox>//td[contains(text(),'BL NO')]//preceding::td[1]/input";
//	// TC_EMS_Contract_Registration_TS003
//
//	public static String search_contract = "search_contract >(//div[@id='nfr-jdlgGrid-div']//div[@role='gridcell' and @aria-colindex='1'])[1]";
//	public static String delete_icon = "delete_icon >//button[@id='RMS-RMS_tblsvm-btnTblDelete']";
//	public static String delete_confirm_message = "delete_confirm_message >//*[text()=' Do you want to delete the EMS Contract Registration?']";
//	public static String deleted_message = "deleted_message >//*[text()='EMS Contract Registration deleted']";
//	public static String cannot_deleted_message = "cannot_deleted_message >//*[text()='Cannot be deleted. This Contract No is used in Movement Entry']";
//	public static String Contract_value = "Contract_value >//*[@id='RMS-RMS_txtContractno']";
//	public static String search_contract1 = "search_contract1 >(//label[@id='nfr_sch_jd_header']/following::div[@col-id='C1'])[2]";
//	public static String Contract_no = "Contract_no >//input[@id='RMS-RMS_txtContractno']";
//	public static String locationDropdownoption6 = "locationDropdownoption6>//*[@id='ETR-ETR_cmbEf_label']";
//	public static String Sizeandtype_Dropdownoption = "Sizeandtype_Dropdownoption>//*[@id='SBS-SBS_cmbsize_label']";
//	public static String locationDropdownoption7 = "locationDropdownoption7>//*[@id='ETR-ETR_cmbEf_label']";
//	public static String SizeandtypeDropdownoption1 = "SizeandtypeDropdownoption1>//*[@id='ETR-ETR_cmbSizeType_label']";
//	public static String location_Dropdownoption4 = "location_Dropdownoption4>//*[@id='SBS-SBS_cmbselection_label']";
//	public static String SizeandtypeDropdownoption = "SizeandtypeDropdownoption>//*[@id='ETR-ETR_cmbSizeType_label']";
//	// Arunthathi
//
//	// TC_Scale_In_TS_006
//
//	public static String AUsername_input = "Username_input>//input[@id='nfr_login_authname']";
//	public static String APassword_input = "Password_input>//input[@id='nfr_login_authid']";
//	public static String ALogin = "Login>//*[@id='nfr_login_btnlogin']";
//	public static String AHome_Logo = "Home_Logo>//*[@id='nfr_topbar_user_detail_link']";
//	public static String ASearch_Input = "Search_Input>//*[@aria-autocomplete='listbox']";
//	public static String AScale_in_ref_input = "Scale_in_ref_input>//input[@id='SCN-SCN_txtReferenceNo']";
//	public static String AContract_no_input = "Contract_no_input>//*[@id='SCN-SCN_txtAgreeMentNo']";
//	public static String AFrom_Date = "From_Date>//input[@id='SCN-SCN_txtFrom_input']";
//	public static String AFree_Days_Input = "Free_Days_Input>//input[@id='SCN-SCN_txtFreeDays']";
//	public static String APer_Diem_Input = "Per_Diem_Input>//input[@id='SCN-SCN_txtPerDiem_input']";
//	public static String AScale_in_pickup_charges = "Scale_in_pickup_charges>//input[@id='SCN-SCN_txtLocCharges_input']";
//	public static String AHandling_Charges = "Handling_Charges>//input[@id='SCN-SCN_txtHandCharges_input']";
//	public static String AEquipment_Quantaty = "Equipment_Quantaty>//input[@id='SCN-SCN_txtEquipqty']";
//	public static String APre_Trip_Charges = "Pre_Trip_Charges>//input[@id='SCN-SCN_txtTripCharge_input']";
//	public static String APick_Up_Credit = "Pick_Up_Credit>//input[@id='SCN-SCN_txtpickupDropOffCredit_input']";
//	public static String AEquipment_Type_add_button = "Equipment_Type_add_button>//button[@id='SCN-SCN_btn1']";
//	public static String ALocation_Add_Button = "Location_Add_Button>//button[@id='SCN-SCN_btnAddLoc']";
//	public static String AGried_Add_Button = "Gried_Add_Button>//button[@id='SCN-SCN_btnAdd']";
//	public static String ASave_Button = "Save_Button>//button[@id='SCN-tbl-btnsave']";
//	public static String ASearch_Button = "Search_Button>//button[@id='SCN-tbl-btnTblJdlgSearch']";
//	public static String AEdit_Button = "Edit_Button>//button[@id='SCN-tbl-btnTblEdit']";
//	public static String ADelete_Button = "Delete_Button>//button[@id='SCN-tbl-btnTblDelete']";
//	public static String A30dateclick = "30dateclick>//a[contains(text(),'30')]";
//	public static String A29dateclick = "30dateclick>//a[contains(text(),'29')]";
//	public static String Aselect1box = "select1box>(//div[@col-id='C0'])[2]";
//	public static String Aselect1box111 = "select1box>(//div[@col-id='C0'])[3]";
//	public static String Aselect1box11 = "select1box>(//div[@col-id='C0'])[2]";
//	public static String Aselect1box1 = "select1box1>//div[contains(text(),'ASNL')]";
//	public static String Aselectbutton = "selectbutton>(//button[@id='multicol_okbtn'])";
//	public static String Asupplierdepot = "supplierdepot>//input[@id='SCN-SCN_txtSupDepot']";
//	//	public static String Asavepopup = "savepopup>//p[contains(text(),'Scale-In / Scale-Out Reference is saved')]";
//	public static String ARemarks_Input = "Remarks_Input>//*[@id='SCN-SCN_txtRemarks']";
//	public static String Awanttodeletepop = "wanttodeletepop>//span[contains(text(),' Do you want to delete the Scale-In / Scale-Out Reference?')]";
//	public static String AwanttodeletepopOK = "wanttodeletepopOK>//span[contains(text(),' Do you want to delete the Scale-In / Scale-Out Reference?')]//following::button[2]";
//	public static String AContractNumsearch = "ContractNumsearch>//button[@id='SCN-SCN_btnSupCont-SCN_btnSupCont']";
//	public static String ASEarchSelect = "SEarchSelect>//button[@id='nfr-twocol-select-button']";
//	public static String Aslabbox = "slabbox>//div[@id='SCN-SCN_chkboxslab']";
//	public static String AslabboxADD = "slabboxADD>//div[@id='SCN-SCN_chkboxslab']//following::button[1]";
//	public static String AslabboxADDTodays = "slabboxADDTodays>(//tbody[@id='SCN-SCN_treeSlab_data']//following::td)[1]";
//	public static String AslabboxADDperdiem = "slabboxADDperdiem>(//tbody[@id='SCN-SCN_treeSlab_data']//following::td)[2]";
//	public static String AslabboxADDperdiemsecond = "slabboxADDperdiemsecond>(//tbody[@id='SCN-SCN_treeSlab_data']//following::td)[4]";
//	public static String AslabboxADDperdiemseconddiem = "slabboxADDperdiemseconddiem>(//tbody[@id='SCN-SCN_treeSlab_data']//following::td)[5]";
//	public static String Ainputcontractnum = "inputcontractnum>//input[@aria-label='Contract No. Filter Input']";
//
//	public static String Calender = "Calender>//div[@id='ui-datepicker-div']";
//	public static String Month_DD = "Month_DD>//select[@aria-label='select month']";
//	public static String Slab_ChkBok = "Slab_ChkBok>//div[@id='SCN-SCN_chkboxslab']//div[2]";
//	public static String Year_DD = "Year_DD>//select[@aria-label='select year']";
//	public static String OneWay_ChkBox = "OneWay_ChkBox>//div[@id='SCN-SCN_chkContoneway']//div[2]";
//	public static String Equip_Prefix_ChkBox = "Equip_Prefix_ChkBox>//div[@id='SCN-SCN_chkContPre']//div[2]";
//	public static String Reference_Type_Field = "Reference_Type_Field>//label[@id='SCN-SCN_cbxRefType_label']";
//
//	public static String equipmenttypevalueenter = "equipmenttypevalueenter>//input[@aria-label='Equipment Type Filter Input']";
//	public static String Totalrecord0 = "Totalrecord0>//label[contains(text(),'Total Records : 0')]";
//
//
//	public static String Norecords = "Norecords >//span[@id='EDB_NoRecords_title']//following::td[contains(text(),'No records found')]";
//	public static String NorecordsOK = "NorecordsOK >//button[@id='EDB_NoRecordsForm-EDB_NoRecordsDT-EDB_NoRecordscmdBtnOk']";
//	public static String Norecordspop = "Norecordspop>(//span[contains(text(),'Search Scale-In/Scale-Out Reference')])//following::p[1]";
//	public static String Equipmenttype = "Equipmenttype>(//div[@col-id='equipmenttype'])[2]";
//	public static String perdiempop = "perdiempop>//h2[contains(text(),'Scale In/Scale Out Reference')]//following::span[2]";
//	public static String Equipmentquenty = "Equipmentquenty>(//div[@col-id='equipmentquantity'])[2]";
//
//	//	public static String Removepop = "Removepop>(//span[contains(text(),'Scale In/Scale Out Reference')])[2]//following::span[7]";
//	public static String scrollhorizandal = "scrollhorizandal>(//div[@ref='eBodyHorizontalScrollViewport'])[1]";
//	// TC_Scale_In_TS_007
//	public static String Ahomepagesearch = "homepagesearch>//button[@id='SCN-tbl-btnTblJdlgSearch']";
//	public static String Asearchinput = "searchinput>//input[@id='txt_name1']";
//	public static String Asearchclickbtn = "searchclickbtn>//button[@id='myBtn']";
//	public static String AbvdClick = "bvdClick>//div[contains(text(),'ABVD')]";
//	public static String Adeleteselectclick = "deleteselectclick>(//div[@col-id='C1'])[2]";
//	public static String Aselectbutton1 = "selectbutton1>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
//	public static String Adoubleclickperdiem = "doubleclickperdiem>(//div[@col-id='perDiem'])[2]";
//	public static String APopupforupdated = "Popupforupdated>(//span[contains(text(),'Scale In/Scale Out Reference')])[3]//following::p";
//	public static String Aeditbuttoninside = "editbuttoninside>(//span[contains(text(),'Edit')])[2]";
//	public static String Acancelbutton = "cancelbutton>//*[@id='SCN-tbl-btnTblCancel']";
//	public static String ABBMMselect = "BBMMselect>//div[contains(text(),'BBMM')]";
//	public static String AINNSA = "AINNSA>(//div[@col-id='locCode'])[2]";
//	public static String closemodule = "closemodule>(//li[@moduleid='SCN']//following::i)[3]";
//	// TC_Scale_Out_TS_010
//	public static String ADropdone = "Dropdone>//label[@id='SCN-SCN_cbxRefType_label']";
//	public static String ASaleoutclick = "Saleoutclick>//li[contains(text(),'ScaleOut')]";
//	//	public static String AClosex = "Closex>(//a[@aria-label='Close'])[8]";
//	//	public static String AClosex1 = "Closex1>(//a[@aria-label='Close'])[9]";
//
//	//// TC_Scale_Out_TS_014
//	public static String Aonewaybox = "onewaybox>//div[@id='SCN-SCN_chkContoneway']";
//	public static String AAddreturnlocation = "Addreturnlocation>//button[@id='SCN-SCN_btnAddRetLoc']";
//
//	/// Logout xpaths
//	public static String AUser_Logout = "User_Logout>//a[@title='Logout']//img[1]";
//	public static String ALogout_Popup = "Logout_Popup>(//div[@id='JSP_dialog']//following-sibling::div[1])[6]";
//	public static String ALogout_Text = "Logout_Text>//span[text()='Are you sure want to logout?']";
//	public static String ALogout_Yes = "Logout_Yes>//input[@value='Yes']";
//	public static String ALogout_No = "Logout_No>//input[@type='button']//following-sibling::button[1]";
//
//
//	// TC_033
//
//	public static String Norecordsround_okbtn1 = "Norecordsround_okbtn1>(//button[text()='Ok'])[2]";
//	public static String Norecordsround_okbtn = "Norecordsround_okbtn>//*[text()='No Records Found']//following::button";
//	public static String emsgate_fromdate_field = "emsgate_fromdate_field>(//*[text()='From Date ']//following::input)[1]";
//	public static String fetch_fromdate = "fetch_fromdate>//*[text()='1']";
//	public static String select_month_dropdown = "select_month_dropdown>//select[@aria-label='select month']";
//	public static String select_month = "select_month>//option[text()='May']";
//	public static String refresh_btn = "refresh_btn>//*[text()='Refresh']";
//	public static String tool_panel = "tool_panel>//*[@id='EGT-EGT_treeTable_nfr_toolpanel_li_id']";
//	public static String Condition_Filter = "Condition_Filter>(//*[text()='Condition Filter'])[1]";
//	public static String systemfile_inputfield = "systemfile_inputfield>//input[@aria-label='System File name Filter Input']";
//	public static String systemfile_value = "systemfile_value>//div[contains(text(),'OE1043634')][1]";
//	public static String status_valueverify = "status_valueverify>(//div[@col-id='uploadstatus'])[2]";
//	public static String Status_Menu="Status_Menu>//div[@col-id='uploadstatus']//span[@ref='eMenu']";
//	public static String Filter_Option="Filter_Option>//span[@aria-label='filter']";
//	public static String Select_all_CheckBox="Select_all_CheckBox>//label[@ref='eSelectAllContainer']//following::span[text()='(Select All)']";
//	public static String EDI_Value="EDI_Value>(//div[@id='nfr-jdlgGrid-div']//following::div[@aria-colindex='1'])[2]";
//	public  static String System_fileName_TF="System_fileName_TF>//input[@aria-label='System File name Filter Input']";
//	public static String Error_Record_Grid="Error_Record_Grid>(//span[text()='System File name']//following::div[@aria-colindex='1'])[2]";
//	public static String Error_Date="Error_Date>//span[text()='Request Date']//following::div[@col-id='requestdate']";
//	public static String SelectBtn="SelectBtn>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
//	public static String ToolPanel="ToolPanel>//div[@id='EGT-EGT_treeTable_nfr_toolpanel_li_id']";
//	public static String Confitionfilter="Confitionfilter>//a[@id='EGT-EGT_treeTable_conditionFilter_id']";
//	public static String EDI_ErrorMoments_EqpNo="EDI_ErrorMoments_EqpNo>//span[text()='Equipment No.']//following::span[@aria-colindex='1']";
//	public static String EDI_Date="EDI_Date>//input[@id='EER-EER_txtfrmdate_input']";
//
//	public static String gate_modulename = "gate_modulename >(//span[text()='EMS Gate'])[2]";
//	// TC_034
//	public static String Action_Required_CheckBox = "Action_Required_CheckBox>(//input[@id='EGT-EGT_chkActionRequired_input']//following::span)[1]";
//	public static String custom_search = "custom_search>//*[text()='Custom Search']";
//	public static String emsgate_search = "emsgate_search>(//div[@id='search_JDLGView']//select)[1]";
//	public static String emsgate_gridvalue="emsgate_gridvalue>(//div[@id='nfr-jdlgGrid-div']//following::div[@row-index='0'])[2]";
//	public static String systemfile = "systemfile>(//option[text()='System File Name'])[1]";
//	public static String systemfile_input = "systemfile_input>(//div[@id='search_JDLGView']//following::input[1])[1]";
//	public static String click_search = "click_search>//*[text()='SEARCH']";
//	public static String Action_NotRequired_CheckBox = "Action_NotRequired_CheckBox>(//input[@id='EGT-EGT_chkActionRequired_input']//following::span)[2]";
//	public static String SystemFile_Value = "SystemFile_Value>//span[text()='System File name']//following::div[@aria-colindex='1']";
//
//
	public static String SCaleIn_Loc_Tf = "SCaleIn_Loc_Tf>(//input[contains(@id,'RMS-RMS_treeScalein')])[3]";
	public static String SCaleIn_SizeTyp_Tf = "SCaleIn_Loc_Tf>(//input[contains(@id,'RMS-RMS_treeScalein')])[4]";
//	public static String Lease_Kind_Dropdown = "Lease_Kind_Dropdown>//label[@id='CGE-CGE_cmbSinLease_label']";
//	public static String Maker_TF = "Maker_TF>//input[@id='CGE-CGE_txtSinMaker']";
//	public static String Pay_Load_Tf = "Pay_Load_Tf>//input[@id='CGE-CGE_txtSinPayLoad_input']";
//	public static String BL_No_SearchBtn = "BL_No_SearchBtn>//button[@id='CGE-CGE_singleblnobtn']";
//	public static String BL_No_TF = "BL_No_TF>//input[@aria-label='BL NO Filter Input']";
//	public static String Shipper_Tf = "Shipper_Tf>//input[@aria-label='Shipper Filter Input']";
//	public static String Consignee_TF = "Consignee_TF>//input[@aria-label='Consignee Filter Input']";
//	public static String BL_Select = "BL_Select>(//div[@row-index='0'])[2]";
//	public static String Select = "Select>//button[@id='nfr-twocol-select-button']";
//	public static String Remarks_TF = "Remarks_TF>//input[@id='CGE-CGE_txtSinRemarks']";
//	public static String Lessor_Btn = "Lessor_Btn>//button[@id='CGE-CGE_btnSinCompany']";
//	public static String Lessor_Tf = "Lessor_Tf>//input[@aria-label='Lessor Code Filter Input']";
//	public static String Material_TF = "Material_TF>//input[@id='CGE-CGE_txtSinMaterial']";
//	public static String Gross_Weight_Tf = "Gross_Weight_Tf>//input[@id='CGE-CGE_txtSinGrossWt_input']";
//	public static String Ref_Num = "Ref_Num>//input[@id='CGE-CGE_txtRefnoSin']";
//	public static String Lessee_Search_Btn = "Lessee_Search_Btn>//button[@id='CGE-CGE_btnSinLessee']";
//	public static String Lessee_TF = "Lessee_TF>//input[@aria-label='Lessee Code Filter Input']";
//	public static String Tare_TF = "Tare_TF>//input[@id='CGE-CGE_txtSinTare_input']";
//	public static String Depot_TF_Input = "Depot_TF_Input>//input[@aria-label='Terminal/Depot Code Filter Input']";
//	public static String Location_SearchBtn = "Location_SearchBtn>(//button[contains(@id,'CGE-j_idt')]//following::span[text()='ui-button'])[2]";
//	public static String Location_TF_Input = "Location_TF_Input>//input[@aria-label='Port Code Filter Input']";
//	public static String Depot_SearchBtn = "Depot_SearchBtn>//button[@id='CGE-CGE_btnSinDepot']";
//	// 15
//	public static String Reason_Code_SearchBtn = "Reason_Code_SearchBtn>//button[@id='CGE-CGE_btnSinReasonElim']";
//	public static String Elimination_Code_Tf = "Elimination_Code_Tf>//input[@aria-label='Elimination Code Filter Input']";
//	public static String Return_Date = "Return_Date>//input[@id='CGE-CGE_txtSinRetDate_input']";
//	public static String Return_Place_SearchBtn = "Return_Place_SearchBtn>//button[@id='CGE-CGE_btnSinRetPlace']";
//
//	public static String service_checkbox38 = "service_checkbox38>//label[contains(@id,'SUM-SUM_lbl_rdbGrp')]//preceding::div[contains(@id,'SUM-SUM_btnGrp')]";
//	public static String service_searchicon38 = "service_checkbox38>//button[@id='SUM-SUM_btnservice-SUM_btnservice']";
//	public static String service_inputfield38 = "service_inputfield38>//input[@aria-label='Service Code Filter Input']";
//	public static String country_searchicon38 = "service_inputfield38>//button[@id='SUM-SUM_btnsele']";
//	public static String EF_field38 = "EF_field>//div[@id='SUM-SUM_cmbEFindicator']";
//	public static String Empty_opt38 = "Empty_opt38>//li[@data-label='Empty']";
//	public static String Full_opt38 = "Empty_opt38>//li[@data-label='Full']";
//
//	public static String service_checkbox39 = "service_checkbox38>//label[@id='SSP-SSP_lbl_jRadiobtnservice']//preceding::div[@id='SSP-SSP_buttonGroupService']";
//	public static String viewbyport_checkbox39 = "service_checkbox38>//label[@id='SSP-SSP_lbl_jRadiobtnservice']//preceding::div[@id='SSP-SSP_buttonGroupService']";
//	public static String service_searchicon39 = "service_searchicon39>//button[@id='SSP-SSP_btnservice-SSP_btnservice']";
//	public static String service_inputfield39 = "service_inputfield38>//input[@aria-label='Service Code Filter Input']";
//
//	public static String countrysearchicon39 = "Search_icon>//button[@id='SSP-SSP_btnsele']";
	public static String service_selectbtn = "service_selectbtn>//button[@id='nfr-twocol-select-button']";
//
//	// TC_036
//
//	public static String country_searchicon36 = "country_searchicon>//button[@id='LSR-LSR_btnArea']";
//	public static String countrycode_field36 = "countrycode_field>//span[text()='Country Code ']//following::input[2]";
//
//	public static String countrycode36 = "countrycode>//input[@aria-label='Country Code  Filter Input']";
//	public static String location_dropdown37 = "location_dropdown>//*[@id='LSR-LSR_cbxLocaHire_label']";
//	public static String fromdate36 = "fromdate36>//input[@id='LSR-LSR_frmDP_input']";
//	public static String todate36 = "todate36>//input[@id='LSR-LSR_toDP_input']";
//	public static String locationDropdownoption36 ="locationDropdownoption4>//*[@id='LSR-LSR_cbxLocaHire_label']";
//	public static String close_Report42= "close_Report42>//div[@id='SBS_JdlgCntrList']//a[@aria-label='Close']";
//	// new
//	public static String service_searchicon36 = "service_searchicon36>//button[@id='LSR-LSR_btnService']";
//	public static String lessee_searchicon36 = "lessee_searchicon36>//button[@id='LSR-LSR_btnLessee']";
//	public static String lessor_searchicon36 = "lessor_searchicon36>//button[@id='LSR-LSR_btnLessor']";
//	public static String service_searchfield = "service_searchfield>//input[@aria-label='Service Code Filter Input']";
//	public static String lessor_searchfield = "lessor_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
//	public static String lessee_searchfield = "lessee_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
//	public static String lessee_Searchfield = "lessee_Searchfield>//input[@id='CGE-CGE_txtSinLessee']";
//	public static String maker_Textfield = "maker_Textfield>//input[@id='CGE-CGE_txtSinMaker']";
//	public static String material_Textfield = "material_Textfield>//input[@id='CGE-CGE_txtSinMaterial']";
//	public static String tare_Textfield = "tare_Textfield>//input[@id='CGE-CGE_txtSinTare_input']";
//	public static String payLoad_Textfield = "payLoad_Textfield>//input[@id='CGE-CGE_txtSinPayLoad_input']";
//	public static String grossWeight_Textfield = "grossWeight_Textfield>//input[@id='CGE-CGE_txtSinGrossWt_input']";
//	public static String refNumber_Textfield = "refNumber_Textfield>//input[@id='CGE-CGE_txtRefnoSin']";
//	public static String thirtyTon_Dropdown = "thirtyTon_Dropdown>//label[@id='CGE-CGE_cmbSin24T_label']";
//	public static String remarks_Textfield = "remarks_Textfield>//input[@id='CGE-CGE_txtSinRemarks']";
//	public static String blno = "blno>//input[@id='CGE-CGE_singleblno']";
//	public static String lessor_selectbtn = "lessor_selectbtn>(//span[text()='Select'])[1]";
//	public static String lessee_selectbtn = "lessee_selectbtn>(//span[text()='Select'])[1]";
//	public static String condt_field = "condt_field>//label[@id='LSR-LSR_cbxCond_label']";
//	public static String reportype_field = "reportype_field>//div[@id='LSR-LSR_cbxRptType']";
//	public static String lessorcontract_searchicon36 = "service_searchicon36>//button[@id='LSR-LSR_btnContract']";
//	public static String lessorcontract_searchfield = "lessorcontract_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
//	public static String lessorcontract_selectbtn = "lessorcontract_selectbtn>//button[@id='multicol_okbtn']";
//	public static String activity_selectbtn = "activity_selectbtn>//button[@id='multicol_okbtn']";
//	public static String leasekind_field = "leasekind_field>//div[@id='LSR-LSR_cbxLKind']";
//	public static String activity_addicon = "activity_addicon>//button[@id='LSR-LSR_btnActcode']";
//	public static String activity_minusicon = "activity_minusicon>//button[@id='LSR-LSR_btnRemAct']";
//	public static String activity_searchfield = "activity_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
//	public static String detail_requestbtn = "detail_requestbtn>//button[@id='LSR-LSR_detailRqstDialog-DCP_CmdBtn']";
//
//	// TC_EmsEdiErrorMovement_TS_035
//
//	public static String kFromDate = "FromDate>//*[@id='EER-EER_txtfrmdate_input']";
//	public static String kMarch = "March>//option[text()='Mar']";
//	public static String KMarch1 = "March1>//a[text()='1']";
//	public static String kToDate = "ToDate>//*[@id='EER-EER_txttodate_input']";
//	public static String kAddOption = "AddOption>//*[@id='EER-EER_fleNamebtn']";
//	public static String kSelectFirstOpt = "SelectFirstOpt>//*[@id='nfr_sch_multicolumn_form']//div[@ref='eCenterContainer']//div[@role='row'][1]/div[2]";
//	public static String kGetValu = "GetValu>//*[@id='EER-EER_lstFleName']//li";
//	public static String kSelectOption = "SelectOption>//*[@id='multicol_okbtn']";
//	public static String kShowOp = "ShowOp>//*[text()='Show']";
//	public static String kErrorList = "ErrorList>(//span[text()='Equipment No.'])[1]//following::div[@ref='eCellWrapper'][1]";
//	public static String EDI_ErrorMoments_ToolPannel="EDI_ErrorMoments_ToolPannel>//div[@id='EER-EER_errortable_nfr_toolpanel_li_id']";
//	public static String EDI_ErrorMoments_ConditionFilter="EDI_ErrorMoments_ConditionFilter>//a[@id='EER-EER_errortable_conditionFilter_id']";
//	public static String EDI_ErrorMoments_Equipment_No="EDI_ErrorMoments_Equipment_No>//input[@aria-label='Equipment No. Filter Input']";
//
//	// Equipment Activity TS_054
//	public static String selectGridCell_7_L = "selectGridCell_7>(//tr[@data-ri='0']/child::td[@role='gridcell'])[7]";
//	public static String selectGridCell_8_L = "selectGridCell_8>(//tr[@data-ri='0']/child::td[@role='gridcell'])[8]";
//	public static String kActivityCodeVal = "ActivityCodeVal>//*[@id='CAV-CAV_txtActCode']";
//	public static String kActivityDescriptionVal = "ActivityDescriptionVal>//*[@id='CAV-CAV_txtActDesc']";
//	public static String kActivityGroup = "ActivityGroup>//*[@id='CAV-CAV_cmbActivityGrp_label']";
//	public static String kActivityGroupVal = "ActivityGroupVal>//*[@id='CAV-CAV_cmbActivityGrp_2']";
//	public static String kStockStatusVal = "StockStatusVal>//*[@id='CAV-CAV_cmbStkStatus_label']";
//	public static String kStockStatusValue = "StockStatusValue>//*[@id='CAV-CAV_cmbStkStatus_4']";
//	public static String kEmptyFullOpt = "EmptyFullOpt>//*[@id='CAV-CAV_cmbEmpty_label']";
//	public static String kEmptyOpt = "EmptyOpt>//*[@id='CAV-CAV_cmbEmpty_1']";
//	public static String kAllowSocActivity = "AllowSocActivity>//*[@id='CAV-CAV_cmbAllowSOC_label']";
//	public static String kAllowScoActivityVal = "AllowScoActivityVal>//*[@id='CAV-CAV_cmbAllowSOC_1']";
//	public static String kAllowForce = "AllowForce>//*[@id='CAV-CAV_cmbAllowFrc_label']";
//	public static String kAllowForceValue = "AllowForceValue>//*[@id='CAV-CAV_cmbAllowFrc_1']";
//	public static String kIsSpecial = "IsSpecial>//*[@id='CAV-CAV_cmbIsSpecial_label']";
//	public static String kIsSpecialVal = "IsSpecialVal>//*[@id='CAV-CAV_cmbIsSpecial_1']";
//	public static String kAutoEir = "AutoEir>//*[@id='CAV-CAV_cmbAutoEIR_label']";
//	public static String kAutoEirVal = "AutoEirVal>//*[@id='CAV-CAV_cmbAutoEIR_1']";
//	public static String kActivityType = "ActivityType>//*[@id='CAV-CAV_cmbActType_label']";
//	public static String kActivityTypeVal = "ActivityTypeVal>//*[@id='CAV-CAV_cmbActType_1']";
//	public static String kStockLocation = "StockLocation>//*[@id='CAV-CAV_cmbStkLoc_label']";
//	public static String kStockLocationVal = "StockLocationVal>//*[@id='CAV-CAV_cmbStkLoc_1']";
//	public static String kSaveOption = "SaveOption>//*[@id='CAV-CAV_toolbar-btnsave']";
//	public static String kEirStatus = "EirStatus>//*[@id='CAV-CAV_cmbEIRStatus_label']";
//	public static String kFromLoc = "FromLoc>//*[@id='CAV-CAV_cmbFromLoc_label']";
//	public static String kLocationOpt = "LocationOpt>//*[@id='CAV-CAV_cmbFromLoc_1']";
//	public static String kToLoc = "ToLoc>//*[@id='CAV-CAV_cmbToLoc_label']";
//	public static String kToLocOption = "ToLocOption>//*[@id='CAV-CAV_cmbToLoc_1']";
//	public static String kDeliveredLanden = "DeliveredLanden>//*[@id='CAV-CAV_cmbEIRStatus_1']";
//	public static String kSavePopup = "SavePopup>(//*[text()='Equipment Activity Saved'])[1]";
//	public static String kPpppOption = "PpppOption>//div[text()='PPPP']";
//	public static String kDeleteOption = "DeleteOption>//*[@id='CAV-CAV_toolbar-btnTblDelete']";
//	public static String kEquipmentActvityPopup = "EquipmentActvityPopup>//h2[text()='Equipment Activity']";
//	public static String kYesEquipmentDeleteOpt = "YesEquipmentDeleteOpt>//button[text()='Yes']";
//	public static String kEquipmentAcitivyDeleted = "EquipmentAcitivyDeleted>//*[text()='Equipment Activity Deleted']";
//
//	public static String LinkChasis = "LinkChasis>//label[@id='CAV-CAV_cmbDelink_label']";
//	public static String BookingNO_Update = "BookingNO_Update>//label[@id='CAV-CAV_cmbBookNoUp_label']";
//	public static String pool_chasis_Activity = "pool_chasis_Activity>//label[@id='CAV-CAV_cmbChasisAct_label']";
//	public static String TransmitIndicator = "TransmitIndicator>//label[@id='CAV-CAV_cmbTransInd_label']";
//	public static String Non_Pool_ChassisAct = "Non_Pool_ChassisAct>//label[@id='CAV-CAV_cmbNonChassis_label']";
//	public static String AllowInterchage = "AllowInterchage>//label[@id='CAV-CAV_cmbAllowInt_label']";
//	public static String MasterReq = "MasterReq>//label[@id='CAV-CAV_cmbMasterReq_label']";
//	public static String PartnerID_TF = "PartnerID_TF>//input[@aria-label='Partner Id Filter Input']";
//	public static String Select_btn = "Select_btn>//button[@id='nfr-twocol-select-button']";
//
//	
//	// TC_036
//
//	public static String onoff_modulename = "onoff_modulename>(//*[text()='On / Off Hire Activities Report'])[2]";
//	public static String location_dropdown = "location_dropdown>//*[text()='Location Hierarchy']//following::span[1]";
//	public static String location_valuedropdown = "location_valuedropdown>//li[text()='Region']";
//	public static String country_searchicon = "country_searchicon>//button[@id='LSR-LSR_btnArea']";
//	public static String countrycode_field = "countrycode_field>//span[text()='Country Code ']//following::input[2]";
//	public static String countrycode_value = "countrycode_value>(//div[@col-id='C1'])[2]";
//	public static String countrycode_select = "countrycode_select>(//span[text()='Select'])[1]";
//	public static String fromdate = "fromdate>//*[@id='LSR-LSR_frmDP_input']";
//	public static String fetch_fromdates = "fetch_fromdates>//a[text()='1']";
//	public static String add_sizetype = "add_sizetype>//*[@id='LSR-LSR_btnSizeType']";
//	public static String sizetype_value = "sizetype_value>//*[text()='20DC']";
//	public static String sizetype_select = "sizetype_select>(//span[text()='Select'])[2]";
//	public static String sizetype_search = "sizetype_search>//*[text()='Equipment Type ']//following::input[2]";
//	public static String gridvalue = "gridvalue>(//div[@col-id='20DC'])[2]";
//
//
//	
//	public static String ems_Option_Autoselect="ems_Option_Autoselect>//div[@id='nfr_topbar_autocomp_panel']//li[1]";
//	public static String penalty ="penalty>//ul[@id='RMS-RMS_cmbRedelivPen_items']//li[text()='%s']";
//	public static String depkind ="depkind>//ul[@id='RMS-RMS_cmbDeprkind_items']//li[text()='%s']";
//	public static String depercent = "depercent>//ul[@id='RMS-RMS_cmbDeprPercent_items']//li[text()='%s']";
//
//
//	//36
//	public static	String condt_input ="condt_input>//ul[@id='LSR-LSR_cbxCond_items']//li[text()='%s']";
//	public static	String reportype_input ="reportype_input>//ul[@id='LSR-LSR_cbxRptType_items']//li[text()='%s']";
//	public static	String leasekind_input ="leasekind_input>//ul[@id='LSR-LSR_cbxLKind_items']//li[text()='%s']";
//	public static	String sz_tp_btn ="sz_tp_btn>//span[text()='%s']";
//	public static	String sum_det_btn ="sum_det_btn>//span[text()='%s']";
//	public static	String location_hierarchy_type ="location_hierarchy_type>//ul[@id='LSR-LSR_cbxLocaHire_items']//li[text()='%s']";
//	public static String grid_data = "grid_data>//*[@col-id='serno' and text()='%s']";		
//
//	//37
//	
//	public static String location_hierarchy_type1 ="location_hierarchy_type1>//ul[@id='LSR-LSR_cbxLocaHire_items']//li[text()='%s']";
//
////38
//	
//	public static	String location_hierarchy_type2 = "location_hierarchy_type2>//ul[@id='SUM-SUM_cmbselection_items']//li[text()='%s']";
//	public static	String EF_input="EF_input>//li[@data-label='%s']";
//	public static	String grid_Check38="grid_Check38>(//div[@col-id='H1'])[%s]";
//	public static	String size_Type ="size_Type>(//div[@col-id='H1'])[%s]";
//	public static	String total_Records38="total_Records38>//label[@id='SUM-SUM_vsltable_records_lbl_cnt']";
//
////39
//	public static	String dropdown_folder = "dropdown_folder>(//*[text()='%s'])[1]//preceding::span[2]";
//	public static String dropdown1_folder = "dropdown1_folder>//*[text()='%s']";
//	public static String folder="folder>(//*[text()='%s'])[1]//preceding::span[2]";
//	public static String	grid_Check="grid_Check>//td[text()='%s']";
//	public static String location_hierarchy_type39="location_hierarchy_type39>//ul[@id='SSP-SSP_cmbselection_items']//li[text()='%s']";
//	public static String location_Drpdwn_Label="location_Drpdwn_Label>//label[@id='SSP-SSP_cmbselection_label']";
////40
//	
//	public static 	String location_hierarchy_type6 = "location_hierarchy_type6>//ul[@id='ETR-ETR_cmbEf_items']//li[text()='%s']";
//	public static 	String folder11 = "folder11>//div[@id='ETR-ETR_tree']//*[text()='%s']//preceding::span[2]";
//	//public static String folder_drop = "folder_drop>(//*[text()='"+folder2+"'])[1]";
//	public static String sizetype_type = "sizetype_type>//ul[@id='ETR-ETR_cmbSizeType_items']//li[text()='%s']";
//	public static String Selected_Data = "Selected_Data>//div[text()='%s']";
//	public static String grid_Check40="grid_Check40>(//div[@col-id='H1'])[%s]";
//	public static String term_Grid_Check="term_Grid_Check>(//div[text()='%s'])[1]";
//	public static String total_Records="total_Records>//label[@id='ETR-ETR_TrackingGrid_records_lbl_cnt']";
//	public static String container_Check_Click="container_Check_Click>(//*[@col-id='H2'])[2]";
//	public static String container_List_Popup="container_List_Popup>//div[@id='ETR_Jdlcntrlist']";
//	public static String sizetype_type1 = "sizetype_type1>//ul[@id='ETR-ETR_cmbSizeType_items']//li[text()='%s']";
//	public static String location_hierarchy_type7 = "location_hierarchy_type7>//ul[@id='ETR-ETR_cmbEf_items']//li[text()='%s']";
//	
////42
//	
//	public static String grid_location="grid_location>(//div[text()='%s']//following::div[text()='%s' and @col-id='H3'])[1]";
//	public static String grid_Location42_Check="grid_Location42_Check>(//td[text()='%s'])[2]";
//	public static String location_hierarchy_type42 = "location_hierarchy_type>//ul[@id='SBS-SBS_cmbselection_items']//li[text()='%s']";
//	public static String sizetype_type42 = "sizetype_type>//ul[@id='SBS-SBS_cmbsize_items']//li[text()='%s']";
//	public static String grid_Check42="grid_Check42>(//div[@col-id='H1'])[%s]";
//	//ul[@id='SBS-SBS_cmbselection_items']//li[.='Country']
//	public static String total_Records42="total_Records42>//label[@id='SBS-SBS_vsltable_records_lbl_cnt']";
//
//
//	
////ems_con_reg_006
//	
//	public static  String sizevalue_opt ="sizevalue_opt>(//*[text()='%s'])[2]";
//	public static	String leasevalue_opt="leasevalue_opt>(//*[text()='%s'])[2]";
//
//
//	//008
//	
//	public static String sizevalue_opt1="sizevalue_opt>(//li[text()='%s'])[2]";
//	public static String leasevalue_opt1="leasevalue_opt>(//*[text()='%s'])[2]";
//	 
//	
//	//010
//	
//	public static 	String locationhier1_value="locationhier_value>//li[text()='%s']";
//
//	//ems001
//	
//	public static 	String Autopanel_First_Click="Autopanel_First_Click>//div[@id='nfr_sch_tw_pnl_content']//div[@ref='eCenterContainer']//div[@row-index='0']";
//	
//	
//	public static 	String Autopanel_First_Click36="Autopanel_First_Click36>//div[@id='nfr-multi-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
//
//	
//
//	// TS_037
//
//	public static String detail_btn = "detail_btn>//*[text()='Detail']";
//	public static String request_sent = "request_sent>//*[text()='Report request sent']";
//	public static String select_month1 = "select_month1>//option[text()='Jan']";
//	public static String download_btn = "download_btn>//*[@id='LSR-LSR_detailRqstDialog-DCP_CmdBtn']";
//	public static String process = "process>//*[text()='Processed']";
//	public static String process_no = "process_no>//*[@id='LSR-LSR_detailRqstDialog-DCPDialogform-DCP_DataTable-0-dcpRqstId']";
//
//	// TS_041
//
//	public static String stockreport_modulename = "stockreport_modulename>(//span[text()='Stock Report by Size / Type Detail Report'])[2]";
//	public static String locations_inputfield = "locations_inputfield>(//label[text()='Location Hierarchy'])//following::span[1]";
//	public static String countrysearchicon = "countrysearchicon>//*[@id='ETR-ETR_btnRegion']";
//	public static String sizetype_dropdown = "sizetype_dropdown>(//label[text()='Size/Type'])[1]//following::span[1]";
//	public static String In_transit_checkbox = "In_transit_checkbox>//*[text()='In Transit']//preceding::span[1]";
//	public static String report_downloadbtn = "report_downloadbtn>//button[@id='ETR-ETR_detailRqstDialog-DCP_CmdBtn']";
//	public static String Request_sent = "Request_sent>//*[text()='Report Request sent']";
//	public static String process_num = "process_num>//*[@id='ETR-ETR_detailRqstDialog-DCPDialogform-DCP_DataTable-0-dcpRqstId']";
//	public static String Location_code = "Country_code>(//div[@ref='eFloatingFilterInput']//input)[1]";
//	// TS_038
//
//
//	
//	public static String countrycode_select_btn = "countrycode_select_btn>(//span[text()='Select'])[1]";
//	public static String lessor_add_icon = "lessor_add_icon>//button[@id='ETR-ETR_btnlessAdd']";
//	public static String lessor_inp_field = "lessor_inp_field>//input[@aria-label='Lessor Code Filter Input']";
//	public static String lessor_value = "lessor_value>(//div[@col-id='C1'])[2]";
//	public static String lessee_add_icon = "lessee_value>//button[@id='ETR-ETR_btnlesseeAdd']";
//	public static String lessee_inp_field = "lessee_inp_field>//input[@aria-label='Lessee Code Filter Input']";
//	public static String lessee_value = "lessee_value>(//div[@col-id='C1'])[2]";
//	public static String leasekind_add_icon = "leasekind_value>//button[@id='ETR-ETR_btnleaAdd']";
//
//	public static String leasekind_inp_field = "leasekind_inp_field>//input[@aria-label='Lease Kind Filter Input']";
//	public static String leasekind_value = "lessor_value>(//div[@col-id='C1'])[2]";
//	public static String supcon_add_icon = "supcon_add_icon>//button[@id='ETR-ETR_btnsupconAdd']";
//	public static String supcon_inp_field = "supcon_inp_field>//input[@aria-label='Supplier Contract Filter Input']";
//	public static String supcon_value = "supcon_value>(//div[@col-id='C1'])[2]";
//	public static String cuscon_add_icon = ">//button[@id='ETR-ETR_btncusconAdd']";
//	public static String cuscon_inp_field = "supcon_inp_field>//input[@aria-label='Customer Contract Filter Input']";
//	public static String cuscon_value = "cuscon_value>(//div[@col-id='C1'])[2]";
//	public static String sz_tp_group = "sz_tp_group>//span[text()='Sz/Tp Group']";
//	public static String sz_tp_ungroup = "sz_tp_ungroup>//span[text()='Sz/Tp UnGroup']";
//	public static String sz_tp_special = "sz_tp_special>//span[text()='Sz/Tp Special']";
//	public static String sz_tp_standard = "sz_tp_standard>//span[text()='Sz/Tp Standard']";
//	public static String summary = "summary>//span[text()='Summary']";
//	public static String detail = "detail>//span[text()='Detail']";
//	public static String novalue_popup = "novalue_popup>//*[text()='Values should be selected']";
//	public static String novalue_popup_close = "novalue_popup_close>//div[@id='primefacesmessagedlg']//a[@role='button']";
//	public static String searchfield_close = "lessor_inpfield_close//div[@aria-labelledby='nfr_sch_multicolumn_title']//a[@aria-label='Close']";
//	public static String searchfield_selectbtn = "searchfield_selectbtn>//button[@id='multicol_okbtn']";
//
//	// TC_EquipmentActivity_TS_055
//
//	public static String kMenuOption = "MenuOption>(//div[@id='CAV-CAV_dsGridConActy_tbl']//div[@role='presentation']//following::span[@ref='eMenu'])[1]";
//	public static String kMainSearchOPtion = "MainSearchOPtion>//span[contains(@aria-label,'filter')]";
//	public static String kActivityOPtionSearch = ">ActivityOPtionSearch(//div[@ref='eBody']//input[@ref='eInput'])[1]";
//	public static String kSelectAllOption = "SelectAllOption>//label[@ref='eSelectAllContainer']";
//	public static String kDeleteOpti = "DeleteOpti>//*[@id='CAV-CAV_toolbar-btnTblDelete']";
//	public static String kDeletedPopUp = "DeletedPopUp>//span[text()=' Are you sure to delete the Equipment Activity ?']";
//	public static String kDeleteYes = "DeleteYes>//button[text()='Yes']";
//	public static String KDeleteAcitivitySucc = "DeleteAcitivitySucc>(//p[contains(text(),'Equipment Activity Deleted')])[2]";
//	public static String kFirstDeleteOP = "FirstDeleteOP>(//div[@ref='eCenterContainer']//div[@aria-colindex='1'])[1]";
//	public static String kEquipmentActivityDeleted = "EquipmentActivityDeleted>(//p[text()='Equipment Activity Deleted'])[1]";
//
//	// 56
//	public static String kDcfOption = "DcfOption>//div[text()='DCF']";
//	public static String kStockStore = "StockStore>//*[@id='CAV-CAV_cmbStkStatus_label']";
//	public static String kFobOption = "FobOption>//*[@id='CAV-CAV_cmbStkStatus_label']//following::li[text()='FOB']";
//	public static String kEditOption = "EditOption>//button[@id='CAV-CAV_toolbar-btnTblEdit']";
//
//	public static String kEqupmentActivityUpdated = "EqupmentActivityUpdated>(//p[text()='Equipment Activity Updated '])[1]";
//
//	// TC_Scale_Out_TS_045
//
//	public static String Aimport_excel = "import_excel>(//span[contains(text(),'Import Excel')])[1]";
//	public static String Aselectexcelfile = "selectexcelfile>//div[@id='xlForm-nfr_importxl_fileupload']";
//	public static String Aselectexcelfiledroupdown = "selectexcelfiledroupdown>//label[@id='xlForm-nfr_importxl_tabviewAuto-0-importxlSheet_label']";
//	public static String Asheert7 = "sheert7>//li[@data-label='Sheet7']";
//	public static String Aloadsheet = "loadsheet>//span[contains(text(),'Load Sheet')]";
//	public static String Amapyesbutton = "mapyesbutton>//button[@id='nfr_importxl_automap_yes']";
//	public static String Auploadfile = "uploadfile>//button[@id='xlForm-importxl_upload']";
//	public static String Aproccedd = "proccedd>//button[@id='avl_Contracts-LBU_AvlContracts_DT-avlProceed']";
//	public static String Aokbutton = "okbutton>//button[contains(text(),'Ok')]";
//	public static String ALessorbilluploded = "Lessorbilluploded>//span[contains(text(),'Lessor Bill Upload Excel Sheet is uploaded')]";
//	public static String Arowoneclick = "rowoneclick>(//div[@col-id='H1'])[2]";
//	public static String Aclearbills = "clearbills>//span[contains(text(),'Clear Bill(s)')]";
//	public static String AclearbillspopOK = "clearbillspopOK>//button[contains(text(),'Yes')]";
//	public static String Arefresh = "refresh>//button[@id='BUG-BUG_btnRefresh']";
//	public static String Acontractnumbergrid = "contractnumbergrid>(//div[@col-id='H1'])[2]";
//
//	//// TC_Scale_Out_TS_043
//
//	public static String Aaddbuttonforcontract = "addbuttonforcontract>(//fieldset[@id='EDB-EDB_ContractNo']//following::button)[1]";
//
//	public static String AMonthclick = "Monthclick>//label[@id='EDB-EDB_cmbPeriod_label']";
//	public static String AFebclick = "Febclick>//li[@data-label='MAY']";
//	public static String Ageneratebill = "generatebill>//button[@id='EDB-EDB_GenBill']";
//	public static String AEMSLOGINPassword = "EMSLOGINPassword>//span[@id='EDB_password_authentication_popup_title']";
//	public static String APasswordInput = "PasswordInput>//input[@id='pwd_authenticate-EDB_Password']";
//	public static String APasswordInputOK = "PasswordInputOK>(//form[@id='pwd_authenticate']//following::td)[3]";
//	public static String ArunthebillOK = "runthebillOK>(//h2[contains(text(),'EMS Contract Billing Generation and Verification')]//following::button[2])";
//	public static String Apopforgenerated = "popforgenerated>//p[contains(text(),'Bills Successfully Generated for')]";
//	public static String ABillrunmessage = "Billrunmessage>(//th[@aria-label='Bill Run Message'])[1]";
//	public static String ABillrunmessageOK = "BillrunmessageOK>//button[@id='EDB_BillRunForm-EDB_BillRunDataGrid-BillRunPanelCancel']";
//	public static String AShowbills = "Showbills>//button[@id='EDB-EDB_ShowBill']";
//	public static String AGriedContractnumber = "GriedContractnumber>//thead[@id='EDB-EDB_summayDetailTreeTable_head']";
//
//	public static String Norecordokbtn = "Norecordokbtn>(//tbody[@id='EDB_NoRecordsForm-EDB_NoRecordsDT_data']//following::td)[2]";
//	public static String Closebuttonx = "Closebuttonx>//a[@id='h2_img3']";
//	public static String Closebuttonx1 = "Closebuttonx>//a[@id='h3_img3']";
//	public static String Monthdroupdwn = "Monthdroupdwn>//div[@id='EDB-EDB_cmbPeriod_panel']";
//	public static String yeardroupdwn = "yeardroupdwn>//input[@id='EDB-EDB_spinneryear']";
//	public static String contractnumbersearch = "contractnumbersearch>//label[text()='Filter by Contract No.']//following::input[1]";
//	public static String Normalbilling = "Normalbilling>//div[@id='EDB-EDB_NormalBilling_header']";
//	public static String Invoicenumber = "Invoicenumber>(//span[text()='Invoice Number'])[1]";
//	public static String Approved = "Approved>//label[@id='EDB-EDB_approvedOutLbl']";
//	public static String Girdtable = "Girdtable>//div[@id='EDB-EDB_summayDetailTreeTable']";
//	public static String Billgeneratingmsg = "Billgeneratingmsg>(//span[text()='EMS Contract Billing Generation and Verification']//following::p)[1]";
//	public static String isoDropdown_Input = "isoDropdown_Input>//input[@id='CGE-CGE_txtSinISOCode_filter']";
//	public static String isoDropdown = "isoDropdown>//label[@id='CGE-CGE_txtSinISOCode_label']";
//	public static String leaseKind_Dropdown = "leaseKind_Dropdown>//label[@id='CGE-CGE_cmbSinLease_label']";
//	public static String lessor_Searchfield = "lessor_Searchfield>//input[@id='CGE-CGE_txtSinCompany']";
//
//	public static String activityTime_Close = "activityTime_Close>//button[text()='Close']";
//public static String activityTime = "activityTime>//input[@id='CGE-CGE_tfSin_input']";
//	public static String sizeType_Searchfield = "sizeType_Searchfield>//input[@id='CGE-CGE_cmbSinSpec_filter']";
//	// TS_042
//
//	public static String stock_report = "stock_report>(//span[text()='Stock Report by Stock Status'])[2]";
//	public static String location_searchicon = "location_searchicon>//*[@id='SBS-SBS_btnsele']";
//
//	public static String location_value = "location_value(//div[@col-id='H1'])[7]";
//
//	public static String uploadFile = "uploadFile>//label[@id='ESN-ESN_lblEDIURL']";
//	public static String kActivitySearchOpt = "Activity_Search>(//div[@id='CAV-CAV_dsGridConActy_tbl']//following::span[contains(@ref,'eMenu')])[1]";
//	// 62
//	public static String columsPopup = "colums_Popup>(//p[text()='The Columns Name POR is protected'])[1]";
//	// 30
//	public static String downloadValue = "downloadValue>//a[@id='CCH-CCH_detailRqstDialog-DCPDialogform-DCP_DataTable-0-dcpRqstId']";
//	public static String kFirstOPtion = "FirstOPtion>((//*[text()='Activity Code'])[1]//following::div[contains(@aria-colindex,'1')])[1]";
//	public static String kEobOption = "EobOption>//*[@id='CAV-CAV_cmbStkStatus_label']//following::li[text()='EOB']";
//	public static String kRequestResponeVal = "RequestResponeVal>//a[@id='CCH-CCH_detailRqstDialog-DCPDialogform-DCP_DataTable-0-dcpRqstId']";
//	public static String Module1 = "Selected module>(//div[@id='nfr_mdldis_centerMainPnl']//following::label)[1]";
//
//	// TS_042
//
//	// new
//	public static String lessor_add_icon42 = "lessor_add_icon>//button[@id='SBS-SBS_btnlsradd']";
//	public static String lessor_inp_field42 = "lessor_inp_field>//input[@aria-label='Lessor Code Filter Input']";
//	public static String lessee_add_icon42 = "lessee_value>//button[@id='SBS-SBS_btnlseadd']";
//	public static String lessee_inp_field42 = "lessee_inp_field>//input[@aria-label='Lessee Code Filter Input']";
//	public static String leasekind_add_icon42 = "leasekind_value>//button[@id='SBS-SBS_btnkindadd']";
//	public static String leasekind_inp_field42 = "leasekind_inp_field>//input[@aria-label='Lease Kind Filter Input']";
//	public static String supcon_add_icon42 = "supcon_add_icon>//button[@id='SBS-SBS_btncontradd']";
//	public static String supcon_inp_field42 = "supcon_inp_field>//input[@aria-label='Supplier Contract Filter Input']";
//	public static String cuscon_add_icon42 = ">//button[@id='SBS-SBS_btncccontradd']";
//	public static String cuscon_inp_field42 = "supcon_inp_field>//input[@aria-label='Customer Contract Filter Input']";
//	public static String sz_tp_special42 = "sz_tp_special>//span[text()='Sz/Tp Special']";
//	public static String sz_tp_standard42 = "sz_tp_standard>//span[text()='Sz/Tp Standard']";
//	public static String service_checkbox42 = "service_checkbox42>//label[@id='SBS-SBS_lbl_rdbser']//preceding::div[contains(@id,'SBS-SBS_btnGrp')]";
//	public static String service_searchicon42 = "service_searchicon42>//button[@id='SBS-SBS_btnservice']";
//	public static String service_searchfield42 = "service_searchfield42>//input[@aria-label='Service Code Filter Input']";
//
//	public static String countrysearchicon42 = "countrysearchicon42>//*[@id='SBS-SBS_btnsele']";
//
//	// Arun
//
//	// Login Xpaths
//	public static String username_Input_L = "Username_Input>//*[@id='nfr_login_authname']";
//	public static String password_Input_L = "Password_Input>//*[@id='nfr_login_authid']";
//	public static String login_L = "Login>//span[text()='Login']";
//	public static String home_Logo_L = "home_Logo>//li[@id='nfr_dashboard_li']//a[1]";
//
//	// Movement Entry
//	public static String module_Search = "module_Search>//*[@id='nfr_topbar_autocomp_input']";
//	public static String movementEntryPage_L = "movementEntryPage>//a[@role='presentation']/child::label[.='Movement Entry']";
//
//	// TS-015
////	public static String singleEntryMovPage_L = "singleEntryMovPage>//li[@role='tab']/child::a[.='Single Equipment Entry']";
////	public static String equipmentNoSearchField_L = "equipmentNoSearchField>//input[@id='CGE-CGE_txtSinConNo']";
////	public static String activitySearchFieldInSingle_L = "activitySearchFieldInSingle>//input[@id='CGE-CGE_txtSinActivity_input']";
////	public static String showInputFieldsButton_L = "showInputFieldsButton>//button[@id='CGE-CGE_btnSinShow']";
////	public static String activeDateInSingle_L = "activeDateInSingle>//input[@id='CGE-CGE_txtSinActivityDate_input']";
//
//	//public static String wantToApplyPopup_L = "wantToApplyPopup>//span[contains(text(),'Do you want to apply?')]";
//	//public static String wantToApplyPopupYes_L = "wantToApplyPopupOK>//span[contains(text(),'Do you want to apply?')]/following::button[.='Yes']";
////	public static String wantToApplyPopup_L="wantToApplyPopup>//span[contains(text(),'Do you want to apply')]";
////	public static String location_SearchButton="location_SearchButton>//span[contains(@id,'CGE-CGE_txtSinLocation')]/following-sibling::button";
////	public static String portCode_SearchBar="portCode_SearchBar>//input[@aria-label='Port Code Filter Input']";
////	public static String portCode_SearchFrame="portCode_SearchFrame>//label[@id='nfr_sch_twocolumn_header' and text()='Search Port']";
////	public static String depot_SearchButton="depot_SearchButton>//button[@id='CGE-CGE_btnSinDepot']";
////	public static String termDepot_SearchFrame="termDepot_SearchFrame>//label[@id='nfr_sch_twocolumn_header' and text()='Search Terminal/Depot']";
////	public static String termDepot_SearchBar="termDepot_SearchBar>//input[@aria-label='Terminal/Depot Code Filter Input']";
////	public static String Activity_Code_TF="Activity_Code_TF>//input[@aria-label='Activity Code Filter Input']";
////	public static String manufactureDate_L = "manufactureDate>//span[@id='CGE-CGE_txtSinMnfacDate']";
////	public static String supplierContract_L = "supplierContract>//input[@id='CGE-CGE_txtSinSupplierCont']";
////	public static String manufactureDateCurrent_L = "manufactureDateCurrent>//td[contains(@class,'current-day ui-datepicker-today')]";
////	public static String showInputFieldFrame_L = "showInputFieldFrame>//fieldset[@id='CGE-CGE_mntToggle']";
////	public static String activeDateCalander_L = "activeDateCalander>//div[@id='ui-datepicker-div']";
////	public static String yearSelect_L = "yearSelect>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectYear']";
////	public static String monthSelect_L = "monthSelect>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectMonth']";
////	public static String yearPick1_L = "yearPick1>//option[.='2024']";
////	public static String monthPick1_L = "monthPick1>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectMonth']/option[.='Jan']";
////	public static String datePick_L = "datePick>//td[@data-handler='selectDay']/child::a[.='1']";
////	public static String showInputSin_L = "showInputSin>//button[@id='CGE-CGE_btnSinShow']";
////	public static String selectSizeType_L = "selectSizeType>//ul[@id='CGE-CGE_cmbSinSpec_items']/child::li[.='20DC']";
////	public static String savedOkSingle_L = "savedOkSingle>//span[.='Single Movement Entry  Saved']/following::button[.='Ok']";
////	public static String savedPopupSingle_L = "savedPopupSingle>//span[.='Single Movement Entry  Saved']";
////	public static String monthPick2_L = "monthPick2>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectMonth']/option[.='Dec']";
////	public static String yearPick2_L = "yearPick2>//option[.='2023']";
////	public static String EqpPopup="EqpPopup>//div[@id='lrp_cust_growl_container']//following::p";
//
//	// TS-019
//	public static String cancelButton_L = "cancelButton>//div[contains(@id,'CGE')]//child::button[contains(@id,'-btnTblCancel')]";
//	public static String newButton_L = "newButton>//div[contains(@id,'CGE')]//child::button[contains(@id,'-btnTblNew')]";
//	public static String showHistoryButton_L = "showHistoryButton>//button[@id='CGE-CGE_btnShowHistory']";
//	public static String selFirst_L = "selFirst>(//tbody[@id='CGE-CGE_dsGrid2_data']//child::div[contains(@id,'CGE-CGE_dsGrid2-0-j_idt')])[1]";
//	public static String deleteOpionSingle_L = "deleteOpionSingle>(//div[@id='CGE-CGE_jPopupMenu1'])[1]//child::a[@id='CGE-CGE_jMnuDelete']";
//	public static String deleConfirmPopup_L = "deleConfirmPopup>//span[.=' Are you sure to delete the Single Movement Entry ?']";
//	public static String deleConfirmPopupYes_L = "deleConfirmPopupYes>//span[.=' Are you sure to delete the Single Movement Entry ?']/following::button[.='Yes']";
//	public static String singleDeletedPopup_L = "singleDeletedPopup>//span[.='Single Movement Entry deleted']";
//	public static String singleDeletedPopupOk_L = "singleDeletedPopupOk>//span[.='Single Movement Entry deleted']/following::button[.='Ok']";
//	public static String noRecordsInMoveEntry = "noRecordsInSingle>//div[@id='lrp_cust_growl_container']//following::p";
//	public static String Emscontractclose = "Emscontractclose>(//form[@id='mdl1_win_launch_mdl_form']//following::a)[3]";
//
//	// TS-016
////	public static String multiEntryMovPage_L = "multiEntryMovPage>//li[@role='tab']/child::a[.='Multiple Equipment Entry']";
////	public static String activitySearchField_L = "activitySearchField>//input[@id='CGE-CGE_txtMulActivity_input']";
////	public static String activeDateField_L = "activeDateField>//input[@id='CGE-CGE_txtMulActivityDate_input']";
////	public static String selectActDate_L = "selectActDate>//a[.='5']"; // TS-015
////	public static String showInputButton = "showInputButton>//button[@id='CGE-CGE_btnMulShow']";
////	public static String locationSaerchField_L = "locationSaerchField>//input[@id='CGE-CGE_txtSinLocation2_input']"; // TS-015
////	public static String termDepotSearchField_L = "termDepotSearchField>//input[@id='CGE-CGE_txtSinDepot_input']"; // TS-015
////	public static String relRefNoTextField_L = "relRefNoTextField>//input[@id='CGE-CGE_txtSinRelRefNo']"; // TS-015
////	public static String sizeTypeDropDown_L = "sizeTypeDropDown>//label[@id='CGE-CGE_cmbSinSpec_label']";
////	public static String addButtonMulti_L = "addButtonMulti>//button[@id='CGE-CGE_btnAddDet']";
////	public static String sizeTypeDropDwnSel_L = "sizeTypeDropDwnSel>//li[@id='CGE-CGE_cmbSinSpec_3']";
////	public static String selectGridCell_1_L = "selectGridCell_1>(//tr[@data-ri='0']/child::td[@role='gridcell'])[1]";
////	public static String selectGridCell_2_L = "selectGridCell_2>(//tr[@data-ri='1']/child::td[@role='gridcell'])[1]";
////	public static String searchEqpNoInGrid_1_L = "searchEqpNoInGrid_1>//tr[@data-ri='0']//following::input[contains(@id,'CGE-CGE_dsGrid2-0-CGE_equipNoCol')]";
////	public static String searchEqpNoInGrid_2_L = "searchEqpNoInGrid_2>//tr[@data-ri='0']//following::input[contains(@id,'CGE-CGE_dsGrid2-1-CGE_equipNoCol')]";
////	public static String saveButtonMoveEnt_L = "saveButtonMoveEnt>//div[contains(@id,'CGE')]//child::button[contains(@id,'-btnsave')]";
////	public static String errorRecordsFrame_L = "errorRecordsFrame>//div[@id='CGE_dlgExcView']";
////	public static String okButtonErrorFrame_L = "okButtonErrorFrame>//button[@id='CGE_btnOk']";
////	public static String errorRecApply_L = "errorRecApply>//button[@id='CGE_btnOk']";
////	public static String multiSavedPopup_L = "multiSavedPopup>//span[.='Multiple Movement Entry  Saved']";
////	public static String soc_Not_Allowed_Error2="soc_Not_Allowed_Error2>(//td[.='AC']/following-sibling::td)[2]";
//	
////	// Ts-017 & 018
////	public static String editButtonMultiMove_L = "editButtonMultiMove>//button[@id='CGE-CGE_btnAddDet']";
////	public static String saveButton_L = "saveButton>//button[contains(@id,'btnsave')]";
////	public static String popupMenu_L = "popupMenu>//div[@id='CGE-CGE_jPopupMenu1']";
////	public static String editOption_L = "editOption>//div[@id='CGE-CGE_txtMulActivity_panel']//following::a[@id='CGE-CGE_jMnuEdit']"; // div[@id='CGE_JDlgscheduleview']//following::a[@id='CGE-CGE_jMnuEdit']
////	public static String singleUpdatedPopup_L = "singleUpdatedPopup>//span[.='Single Movement Entry  Updated']";
////	public static String singleUpdatedOk_L = "singleUpdatedOk>//span[.='Single Movement Entry  Updated']/following::button";
////	public static String selectCheckboxFrame_L = "selectCheckboxFrame>//div[@id='CGE_dlgSelectColumns']";
////	public static String selectCheckboxOk_L = "selectCheckboxOk>//button[@id='CGE_btnOkSelCol']";
////	public static String multiMoveUpdatedPopup_L = "multiMoveUpdatedPopup>//span[.='Multiple Movement Entry  Updated']";
////	public static String multiMoveUpdatedOk_L = "multiMoveUpdatedOk>//span[.='Multiple Movement Entry  Updated']/following::button";
////	public static String verifyActivePlace_L = "verifyActivePlace>(//tr[@data-ri='0']/child::td[@role='gridcell'])[7]";
////	public static String verifyDepot_L = "verifyDepot>(//tr[@data-ri='0']/child::td[@role='gridcell'])[8]";
////	public static String singleEdit_L = "singleEdit>//div[@id='CGE_dlgExcView']//preceding::a[@id='CGE-CGE_jMnuEdit']";
////	public static String multiSavedPopupOk_L = "multiSavedPopupOk>//span[.='Multiple Movement Entry  Saved']/following::button[.='Ok']";
////	public static String forcebtn="forcebtn>//button[@id='CGE_ForceMove']";
////
////	// TS-020
////	public static String multiDeleteOption_L = "multiDeleteOption>((//div[@id='CGE-CGE_txtMulActivity_panel'])//following::a[@id='CGE-CGE_jMnuDelete'])";
////	public static String confirmMultiDelePopupYes_L = "confirmMultiDelePopupYes>//span[.=' Are you sure to delete the Multiple Movement Entry ?']/following::button[.='Yes']";
////	public static String confirmMultiDelePopup_L = "confirmMultiDelePopup>//span[.=' Are you sure to delete the Multiple Movement Entry ?']";
////	public static String multiDeletedPopupOk = "multiDeletedPopupOk>//span[.='Multiple Movement Entry deleted']/following::button[.='Ok']";
////	public static String multiDeletedPopup = "multiDeletedPopup>//span[.='Multiple Movement Entry deleted']";
////
////	// Ts-021
////	public static String globalSearch_L = "globalSearch>//button[contains(@id,'btnTblDefaultSearch')]";
////	public static String globalSearchFrame_L = "globalSearchFrame>//form[@id='nfr_sch_jdlg_form']";
////	public static String eqpNoGlobalSearch_L = "eqpNoGlobalSearch>//input[@id='txt_name1']";
////	public static String searchButton_L = "searchButton>//button[@id='myBtn']";
////	public static String selectEqpNo_L = "selectEqpNo>//div[@row-index='0']/child::div[@col-id='C1']";
////	public static String selectButton_L = "selectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
////	public static String eqpNoInEqpDetails_L = "eqpNoInEqpDetails>(//tr[contains(@class,'ui-datatable-selectable')]//div[contains(@id,'CGE-CGE_dsGrid')])[1]";
////	public static String globalSearch11 = "globalSearch>//button[@id='RMS-RMS_tblsvm-btnTblJdlgSearch']";
//
//	// Equipment Profile
//	// TS-057 & TS-059
//	public static String eqpNoTextField_L = "eqpNoTextField>//input[@id='CNP-CNP_txtcontainernoNew']";
//
//	public static String tareWeightTextField_L = "tareWeightTextField>//input[@id='CNP-CNP_txttarewght_input']";
//	public static String tareWeightTextField1_L = "tareWeightTextField1>//span[@id='CNP-CNP_txttarewght']";
//	public static String payLoadTextField_L = "payLoadTextField>//input[@id='CNP-CNP_txtpayload_input']";
//	public static String maxGrossWeightTextField_L = "maxGrossWeightTextField>//input[@id='CNP-CNP_txtgrosswght_input']";
//	public static String saveButtonEqpPro_L = "saveButtonEqpPro_L>//button[@id='CNP-CNP_toolbar-btnsave']";
//	public static String editButtonEqpPro_L = "editButtonEqpPro>//button[@id='CNP-CNP_toolbar-btnTblEdit']";
//	public static String globalSearchEqpPro_L = "globalSearchEqpPro>//button[@id='CNP-CNP_toolbar-btnTblJdlgSearch']";
//	public static String eqpNoSearchField_L = "eqpNoSearhField>//input[@id='txt_name1']";
//	public static String eqpProfileSearchFrame_L = "eqpProfileSearchFrame>//div[@id='nfr_sch_jdlg']";
//	public static String eqProSearchButton_L = "eqProSearchButton>//button[@id='myBtn']";
//	public static String selFirstEqPro_L = "selFirstEqPro>//div[@row-id='0']/child::div[@col-id='C1']";
//	public static String selectButtonEqPro_L = "selectButtonEqPro>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
//
//	public static String bookingNo_SearchButton="bookingNo_SearchButton>//button[@id='CGE-CGE_btnSinBookno']";
//	public static String bookingNo_Search="bookingNo_Search>//form[@id='nfr_sch_twocol_form']//input[@aria-label='Booking No. Filter Input']";
//	public static String voyage_Search="voyage_Search>//form[@id='nfr_sch_twocol_form']//input[@aria-label='Voyage Filter Input']";
//	public static String searchBookNo_Scrollbar="searchBookNo_Scrollbar>//form[@id='nfr_sch_twocol_form']/..//div[@class='ag-body-horizontal-scroll-viewport']";
//	public static String firstRow="searchBookNo_Scrollbar>//div[@ref='eCenterContainer']/div[@row-index='0']";
//
//	public static String EquipNo_Field="EquipNo_Field>(//div[@id='search_JDLGView']//following::input[1])[1]";
//
//
//	public static String nominalCubic_Textfield="nominalCubic_Textfield>//input[@id='CNP-CNP_txtnomcubcity_input']";
//	public static String stackHeight_Textfield="stackHeight_Textfield>//input[@id='CNP-CNP_txtstkhgt']";
//	public static String grossStacking_Textfield="grossStacking_Textfield>//input[@id='CNP-CNP_txtstcwght']";
//	public static String injectionPort_Dropdown="injectionPort_Dropdown>//label[@id='CNP-CNP_cmbinjectionPort_label']";
//	public static String domcile_Searchfield="domcile_Searchfield>//input[@id='CNP-CNP_txtdomicileprt']";
//	public static String eqpStatus_Dropdown="eqpStatus_Dropdown>//label[@id='CNP-CNP_txtstatus_label']";
//	public static String contractId1_Textfield="contractId1_Textfield>//input[@id='CNP-CNP_txtContrctload']";
//	public static String contractId2_Textfield="contractId2_Textfield>//input[@id='CNP-CNP_txtcontrcload1']";
//	public static String contractId3_Textfield="contractId3_Textfield>//input[@id='CNP-CNP_txtcontrcload2']";
//	public static String onHireDate_Textfield="onHireDate_Textfield>//input[@id='CNP-CNP_txtONHI_input']";
//	public static String redeliveryPort_Searchfield="redeliveryPort_Searchfield>//input[@id='CNP-CNP_txtREDLprt']";
//	public static String redeliveryDate_Textfield="redeliveryDate_Textfield>//input[@id='CNP-CNP_txtREDDDATE_input']";
//	public static String leasingRefNo_Textfield="leasingRefNo_Textfield>//input[@id='CNP-CNP_txtleasingrefno']";
//	public static String leasingContractRef_Textfield="leasingContractRef_Textfield>//input[@id='CNP-CNP_txtleasingcontrref']";
//	public static String subleaseContract_Textfield="subleaseContract_Textfield>//input[@id='CNP-CNP_txtcontrctno']";
//	public static String supplierContract_Textfield="supplierContract_Textfield>//input[@id='CNP-CNP_txtsupcont']";
//	public static String lessorCode_Dropdown="lessorCode_Dropdown>//label[@id='CNP-CNP_cmblessorcode_label']";
//	public static String lesseeCode_Dropdown="lesseeCode_Dropdown>//label[@id='CNP-CNP_cmbleasecode_label']";
//	public static String sublease_Dropdown="lesseeCode_Dropdown>//label[@id='CNP-CNP_cmbsublease_label']";
//	public static String perDiem_Textfield="perDiem_Textfield>//input[@id='CNP-CNP_txtintperdiem']";
//	public static String leaseKind_Dropdown2="leaseKind_Dropdown2>//label[@id='CNP-CNP_cmbleasekind_label']";
//	public static String leaseTerm_Dropdown2="leaseTerm_Dropdown2>//label[@id='CNP-CNP_cmbleaseterm_label']";
//	public static String leaseKind_Dropdown3="leaseKind_Dropdown3>//label[@id='CNP-CNP_cmbleasekind1_label']";
//	public static String submittedToJoint="submittedToJoint>//label[@id='CNP-CNP_cmbjointvent_label']";
//
//
//
//	// TS-058 & TS-061
//	public static String newButtonEqPro_L = "newButtonEqPro>//button[@id='CNP-CNP_toolbar-btnTblNew']";
//	public static String cancelButtonEqPro_L = "cancelButtonEqPro>//button[@id='CNP-CNP_toolbar-btnTblCancel']";
//	public static String createConfirmPopup_L = "createConfirmPopup>//span[.=' Do you want to create a New Equipment Profile?']";
//	public static String createConfirmPopupYes_L = "createConfirmPopupYes>//span[.=' Do you want to create a New Equipment Profile?']/following::button[.='Yes']";
//	public static String eqpTypeDropDown_L = "eqpTypeDropDown>//div[@id='CNP-CNP_txtequiptype']";
//	public static String selEqpType_L = "selEqpType>//li[@data-label='CONTAINER']";
//	public static String sizeTypeDropDownEqPro_L = "sizeTypeDropDownEqPro>//div[@id='CNP-CNP_cmbsize']";
//	public static String selSizeType_L = "selSizeType>//li[@data-label='20DC']";
//	public static String isoDropDown_L = "isoDropDown>//label[@id='CNP-CNP_txtiso_label']";
//	public static String sosDropDown_L = "sosDropDown>//div[@id='CNP-CNP_cmbsoc']";
//	public static String selSos_L = "selSos>//ul[@id='CNP-CNP_cmbsoc_items']/li[@data-label='Y']";
//	public static String eqpStatusDropDown_L = "eqpStatusDropDown>//label[@id='CNP-CNP_txtstatus_label']";
//	public static String selActiveStatus_L = "selActiveStatus>//li[@data-label='ACTIVE']";
//	public static String fleetGroupDropDown_L = "fleetGroupDropDown>//label[@id='CNP-CNP_cmbfleetgrp_label']";
//	public static String selActiveFleet_L = "selActiveFleet>//li[@data-label='ACTIVE FLEET']";
//	public static String deleteButtonEqpPro_L = "deleteButtonEqpPro>//button[@id='CNP-CNP_toolbar-btnTblDelete']";
//	public static String wantToDeleteYes_L = "wantToDeleteYes>//span[.=' Do you want to delete the Equipment Profile?']/following::button[.='Yes']";
//	public static String wantToDeletePopup_L = "wantToDeletePopup>//span[.=' Do you want to delete the Equipment Profile?']";
//	public static String globalSearchCloseIcon_L = "globalSearchCloseIcon>//span[@id='nfr_sch_jdlg_title']/following-sibling::a[@aria-label='Close']";
//	public static String cannotDeletePopup_L = "cannotDeletePopup>(//*[text()='Cannot delete the Equipment Profile. It has movement entry'])[1]";
//	public static String eqpProfileDeletedPopup_L = "eqpProfileDeletedPopup>(//*[text()='Equipment Profile is deleted'])[1]";
//	public static String eqpProfileSaved_L = "eqpProfileSaved>(//*[text()='Equipment Profile is saved'])[1]";
//	public static String eqpProfileUpdatedPopup_L = "eqpProfileUpdatedPopup>(//*[text()='Equipment Profile is updated'])[1]";
//	public static String eqpProNoFoundRecordsPopup_L = "eqpProNoFoundRecordsPopup>(//*[text()='No records Found'])[1]";
//	public static String EqpSearchCloseButton_L = "EqpSearchCloseButton>//span[@id='nfr_sch_jdlg_title']/following-sibling::a[@aria-label='Close']";
//	public static String alraedySavedPopup_L = "alraedySavedPopup>(//*[text()='Equipment Profile already exists in Container'])[1]";
//
//	public static String onHireLocation_Searchfield="onHireLocation_Searchfield>//input[@id='CNP-CNP_txtonhire']";
//	public static String contractRefNum_Textfield="contractRefNum_Textfield>//input[@id='CNP-CNP_txtconref']";
//	public static String disposalRegNum="disposalRegNum>//input[@id='CNP-CNP_txtdispogregnoNew']";
//
//
//	// TS-060
//	public static String refreshButton_L = "refreshButton>//button[@id='CNP-CNP_btnrefresh']";
//	public static String manufacturedDate_L = "manufacturedDate>//input[@id='CNP-CNP_DateManu_input']";
//	public static String specialUnitDropDown_L = "specialUnitDropDown>//div[@id='CNP-CNP_cmbspecialUnit']";
//	public static String specialUnitYes_L = "specialUnitYes>//li[@id='CNP-CNP_cmbspecialUnit_0']";
//	public static String specialUnitNo_L = "specialUnitNo>//li[@id='CNP-CNP_cmbspecialUnit_1']";
//	public static String ownedDropdown_L = "ownedDropdown>//div[@id='CNP-CNP_cmbowned']";
//	public static String ownedY_L = "ownedY>//li[@id='CNP-CNP_cmbowned_0']";
//	public static String ownedN_L = "ownedN>//li[@id='CNP-CNP_cmbowned_1']";
//	public static String yearPick3_L = "yearPick2>//option[.='2021']";
//
//	// Logout xpaths
//	public static String user_Logout_L = "User_Logout>//a[@title='Logout']//img[1]";
//	public static String logout_Popup_L = "Logout_Popup>(//div[@id='JSP_dialog']//following-sibling::div[1])[6]";
//	public static String logout_Text_L = "Logout_Text>//span[text()='Are you sure want to logout?']";
//	public static String logout_Yes_L = "Logout_Yes>//input[@value='Yes']";
//	public static String logout_No_L = "Logout_No>//input[@type='button']//following-sibling::button[1]";
//
//	// Intergration
//	public static String Asavepopup1 = "savepopup>(//span[contains(text(),'Scale In/Scale Out Reference')])[2]//following::p[1]";
//	public static String Newbuttonscalein = "Newbuttonscalein>//button[@id='SCN-tbl-btnTblNew']";
//	public static String NewbuttonscaleinOK = "NewbuttonscaleinOK>//span[contains(text(),' Do you want to create a new Scale-In / Scale-Out Reference?')]//following::button[2]";
//	public static String Removebutton = "Removebutton>//button[@id='SCN-SCN_btnRemove']";
//	public static String Removebuttoncoloumclick = "Removebuttoncoloumclick>(//div[@col-id='locCode'])[2]";
//	//public static String RemovebuttoncoloumclickNO = "RemovebuttoncoloumclickNO>(//span[contains(text(),'Scale In/Scale Out Reference')])[2]//following::BUTTON[2]";
//	public static String editbutton = "editbutton>//button[@id='SCN-tbl-btnTblEdit']";
//	public static String ADDBUTTON = "ADDBUTTON>//button[@id='SCN-SCN_btnAdd1']";
//	public static String REMOVEBUTTON = "REMOVEBUTTON>//button[@id='SCN-SCN_btnRemove1']";
//	public static String perdiemok = "perdiemok>//h2[contains(text(),'Scale In/Scale Out Reference')]//following::span[2]//following::button";
//	public static String closex1 = "closex1>(//a[@aria-label='Close'])[8]";
//	public static String Acancelbutton1 = "cancelbutton>(//form[@id='EDB']//following::button)[6]";
//	public static String Acancelbutton2 = "cancelbutton>(//div[@id='LBU-LBU_pnlMain']//following::button)[6]";
//	public static String Acancelbuttonnewok = "Acancelbuttonnewok>//span[contains(text(),' Do you want to create a new Lessor Bill Upload')]//following::button[2]";
//	public static String Anewbutton1 = "Anewbutton1>(//div[@id='LBU-LBU_pnlMain']//following::button)[1]";
//	public static String closeems = "closeems>(//li[@id='nfr_dashboard_li']//following::i)[4]";
//
//
//
//	public static String P_Enq_His_Cancel_Btn = "Enq_His_Cancel_Btn >(//label[contains(text(),'Enquiry History')])[1]//following::a[3]";
//	public static String P_Equip_Global_Search = "Global_Search >//button[contains(@id,'btnTblJdlgSearch')]";
//	public static String P_EMS_Gate_Cancel_Btn = "EMS_Gate_Cancel_Btn >(//label[contains(text(),'EMS Gate')])[1]//following::a[3]";
//	public static String P_EMS_Cont_Reg_Cancel_Btn = "EMS_Gate_Cancel_Btn >(//label[contains(text(),'EMS Contract Registration')])[1]//following::a[3]";
//	public static String emsgate_gridvalue1 = "emsgate_gridvalue>(//*[text()='OE1043634'])";
//	public static String searchField1 = "searchField1>//input[@aria-label='Partner Id Filter Input']";
//
//
//
//	public static String EqpProfilePage_L = "EqpProfilePage_L>//a/label[.='Equipment Profile']";
//
//
//
//	public static String close_btn35 = "close_btn>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//	public static String close_report36 = "close_report>//div[@id='LSR_JDlgMsg']//a[@aria-label='Close']";
//	public static String close_btn36 = "close_btn>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//	public static String close_report37 = "close_report>//div[@id='LSR-LSR_detailRqstDialog-DCP_customDetailRequestDialog']//a[@aria-label='Close']";
//	public static String close_btn37 = "close_btn>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//	public static String close_btn38 = "close_btn>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//
//	public static String close_report41 = "close-report>//div[@id='ETR-ETR_detailRqstDialog-DCP_customDetailRequestDialog']//a[@aria-label='Close']";
//	public static String close_btn41 = "close_btn>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//	// EMS integration
//	public static String contractno_error_popup_D = "contractno_error_popup>//div[@id='nfr_pwdexpmsg_container']//p[text()='The Contract No. TUE-11 already exists']";
//	public static String contract_type_D = "contract type>//div[@id='RMS-RMS_cmbContractType']"; // label[@id='RMS-RMS_cmbContractType_label']";
//	public static String contract_type_select_D = "contract type select>//div[@id='RMS-RMS_cmbContractType']/div/span";
//	public static String contract_type_opt_D = "contract type opt>//li[@data-label='D-OPERATIONAL LEASE']";
//	public static String enter_contractno_popup = "enter contractno popup>//div[@id='lrp_cust_growl_container']//p[text()='Enter the Contract No.']";
//	public static String enter_contracttype_popup_D = "enter contract type>//div[@id='lrp_cust_growl_container']//p[text()='Select the Contract Type']";
//	public static String contracttype_no_opt_D = "contract type no option>//ul[@id='RMS-RMS_cmbContractType_items']//li[@data-label='&nbsp;']";
//	public static String select_sizetyep_popup_D = "select sizetype popup>//div[@id='lrp_cust_growl_container']//p[text()='Select the Sz./Tp']";
//	public static String close_module_D = "close module>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//	public static String select_leasetype_popup_D = "select leasetype>//div[@id='lrp_cust_growl_container']//p[text()='Select the Lease Charge Type']";
//	public static String perdiem_popup_D = "perdiem popup>//span[text()=' Do you want to Proceed with perdiem 0.0']";
//	public static String sizetype_exist_popup_D = "sizetype_exist>//div[@id='lrp_cust_growl_container']//p[text()='The Sz./Tp 20DC already exists']";
//	public static String yes_btn_D = "yes_btn>//button[text()='Yes']";
//	public static String remove_btn_D = "remove_btn>//button[@id='RMS-RMS_btnEqpRem']";
//	public static String grid_data_D = "grid data>//tbody[@id='RMS-RMS_treeEqp_data']";
//	public static String remove_popup_D = "remove popup>//span[text()=' Are you sure you want to remove?']";
//	public static String remove_popup_yes_D = "yes_btn remove popup>//button[text()='No']/following-sibling::button";
//	public static String grid_D = "grid>(//div[@id='RMS-RMS_treeEqp']//table[@role='grid'])[2]";
//	public static String locationhierarchy_opt_D = "location hierarchy opt>//li[@data-label='All Region']";
//	public static String sizetype_opt_D = "sizetype_opt>//ul[@id='RMS-RMS_cmbEqp_items']//li[text()='20DC']";
//	public static String leasechargetype_opt_D = "leasecharge type opt>//ul[@id='RMS-RMS_cmbLeasechType_items']//li[@data-label='N - No banding']";
//
//
//
//	public static String CloseButton_M = "Equipment_Activity_CloseButton>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//	public static String closeOption = "closeOption>(//*[@id='nfr_tab_dashboard_title']//following::i)[3]";
//	public static String closeSymbols = "closeSymbols>(//span[@id='CCH-CCH_detailRqstDialog-DCP_customDetailRequestDialog_title']//following::span)[1]";
//	public static String dashboard_Title = "dashboard_Title>//*[@id='nfr_tab_dashboard_title']";
//	public static String module3 = "module3>(//label[text()='Current / History Report '])[1]";
//	public static String module4 = "module4>(//label[text()='Current / History Report '])[1]";
//
//	// eme
//	public static String module5 = "module5>//label[@id='mdl2_tablbl']";
//	public static String module6 = "module6>(//label[text()='Equipment Activity'])[1]";
//	public static String Module3 = "Module3>//label[@id='mdl2_tablbl']";
//	public static String Newbuttonscalein1 = "Newbuttonscalein>(//form[@id='EDB']//following::button)[1]";
//
//	public static String Global_MovementCode_TF = "Global_MovementCode_TF>//input[@id='txt_name2']";
//
//	public static String PickupActual_DropOff_Quantity = "PickupActual_DropOff_Quantity>(//tbody[@id='RMS-RMS_treePicupdrop_data']//td)[7]";
//
//	public static String FirstTab_Value = "Emsmodule_Value>(//li[contains(@id,'tabli') and not(contains(@class,'closed'))])[1]";
//	public static String Secondtab_Value = "Movemententry_Value>(//li[contains(@id,'tabli') and not(contains(@class,'closed'))])[2]";
//
//	// ofhi
//	public static String Ofhi_Value = "Ofhi_Value>//tr[@data-item-label='(OFHI) OFF HIRE']";
//	public static String Depot_SearchButton = "Depot_SearchButton>//button[@id='CGE-CGE_btnSinDepot']";
//	public static String Depot_Sf = "Depot_Sf>//input[@aria-label='Terminal/Depot Code Filter Input']";
//	public static String Depot_Valuefilter = "Depot_Valuefilter>(//div[@ref='eCenterContainer'])[1]";
//	public static String Ofhi_OkButton = "Ofhi_OkButton>//button[text()='Ok']";
//	public static String DeleteGrid_btn = "DeleteGrid_btn>(//a[@id='CGE-CGE_jMnuDelete'])[2]";
//	public static String Yes_Button = "Yes_Button>//button[text()='Yes']";
//	public static String Ok_Button = "Ok_Button>//button[text()='Ok']";
//	public static String ScaleOut_Reference = "ScaleOut_Reference>//a[text()='Scale Out Reference']";
//	public static String Scaleout_refNo_Tf = "Scaleout_refNo_Tf>(//input[contains(@id,'RMS-RMS_treeScaleout')])[2]";
//	public static String Scaleout_Location_Tf = "Scaleout_refNo_Tf>(//input[contains(@id,'RMS-RMS_treeScaleout')])[3]";
//	public static String Scaleout_Sizetyp_Tf = "Scaleout_refNo_Tf>(//input[contains(@id,'RMS-RMS_treeScaleout')])[4]";
//	public static String scaleout_ActualQunantity = "scaleout_ActualQunantity>(//tbody[@id='RMS-RMS_treeScaleout_data']//td)[6]";
//	public static String MovementEntry_GlobalSearch = "MovementEntry_GlobalSearch>//button[contains(@id,'btnTblDefaultSearch')]";
//	public static String Save_Btn = "Save_Btn>(//div[@id='CGE-CGE_pgMain_content']//following::button)[3]";
//
//
//
//	public static String Module_click="Module_click>//li[@data-item-label='Scale In/Scale Out Reference']";
//	public static String table_path="table_path>//div[@id='SCN-SCN_dsGridActive_1_tbl']";
//	public static String gird="gird>//div[text()='%s']";
//	public static String contarct_Module_click="contarct_Module_click>//li[@data-item-label='EMS Contract Billing Generation and Verification ']";
//	public static String month_click="month_click>//li[text()='%s']";
//	public static String contract_se="contract_se>(//td[text()='%s'])[1]";
//	public static String ref_num="ref_num>(//span[text()='Reference'])[1]//following::div[text()='%s'][1]";
//	public static String Sheet_sel="Sheet_sel>//li[text()='%s']";
//	public static String gird_val="gird_val>//*[@id='xlForm-nfr_importxl_tabviewAuto-0-importxl_datatablezero_data']/tr/td[2]";
//	public static String DataA4 = "DataA4>//h2[contains(text(),'Lessor Bill Upload')]//following::span[2]";
//	public static String bill_upload_click = "bill_upload_click>//li[@data-item-label='Bill Upload Gate']";
//	public static String lessor_bill_upload_click = "lessor_bill_upload_click>//li[@data-item-label='Lessor Bill Upload']";
//	public static String close_Tab1 = "close_Tab>(//a[contains(@id,'h2_img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//	public static String movement_entry_click = "movement_entry_click>//li[@data-item-label='Movement Entry']";
//	public static String select_woi = "select_woi>//ul[@id='CGE-CGE_cmbSinOWInd_items']/li[text()='%s']";
//	public static String select_do = "select_do>//ul[@id='CGE-CGE_cmbSin24T_items']/li[text()='%s']";
//	public static String owind = "owind>//ul[@id='CGE-CGE_cmbSinOWInd_items']//li[text()=%s]";
//	public static String select_shipper = "select_shipper>//ul[@id='CGE-CGE_cmbSinShipOwn_items']/li[text()='%s']";
//	public static String lease_king = "lease_king>//ul[@id='CGE-CGE_cmbSinLease_items']/li[text()='%s']";
//	public static String select_trans = "select_trans>//ul[@id='CGE-CGE_cmbSinTransMode_items']/li[@data-label='%s']";
//
//	public static String Edit_Buttton = "Edit_Buttton>//button[@name='RMS-RMS_tblsvm-btnTblEdit']";
//
//	public static String EditClick_Todate = "EditClick_Todate>//a[text()='20']";
//	public static String Sizeandtype = "Sizeandtype>(//td[text()='20DC'])[2]";
//	public static String Date_PopUP = "Date_PopUP>//span[text()='EMS Contract Registration']/following-sibling::p";
//
//	public static String EditClick_Fromdate = "EditClick_Fromdate>//a[text()='17']";
//	public static String Ems_module = "Ems_module>//li[@id='mdl2_tabli']";
//
//	
//
//	public static String P_No_Record_Popup = "No_Record_Popup >//*[text()='No Records found']";
//
//	public static String Global_Searchfield = "Global_Searchfield>//input[@id='txt_name1']";
//	public static String Global_Selectbtn = "Global_Selectbtn>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
//	public static String ScaleIn_OutPage = "ScaleIn_OutPage>//a[text()='Scale In / Scale Out Ref. Details']";
//	public static String ActualQuantity = "Actual_Quantity>(//tbody[@id='RMS-RMS_treeScalein_data']//td)[6]";
//	public static String pickup_DropOff = "pickup_DropOff>//a[text()='Pick up And Drop Off Details']";
//	public static String Pickup_LocationSF = "Pickup_LocationSF>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[2]";
//	public static String Pickup_sizetypeSF = "Pickup_sizetypeSF>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[3]";
//	public static String PickUpActual_Quantity = "PickUpActual_Quantity>(//tbody[@id='RMS-RMS_treePicupdrop_data']//td)[5]";
//	public static String Monthly_PickupActual_Count = "Monthly_PickupActual_Count>(//tbody[@id='RMS-RMS_treeAlocation_data']//td)[8]";
//	public static String pickup_Actual_Countvalue = "pickup_Actual_Countvalue>(//tfoot[@id='RMS-RMS_treeAlocation_foot']//td)[1]";
//	public static String Container_No = "Container_No>(//tbody[@id='RMS-RMS_treePickup_data']//td)[5]";
//
//	public static String Onhi_Value = "Onhi_Value>//tr[@data-item-label='(ONHI) ON HIRE']";
//
//	public static String firstCell = "FirstCell>//tbody[@id='CGE-CGE_dsGrid2_data']/tr[1]/td[1]";
//	public static String firstCellInput = "FirstCellInput>//input[@id='CGE-CGE_dsGrid2-0-CGE_equipNoCol']";
//	public static String Emsmodule_Value = "Emsmodule_Value>(//li[contains(@id,'tabli') and not(contains(@class,'closed'))])[1]";
//	public static String saveButton_L1="saveButton>//button[contains(@id,'btnsave')]";
//	// Arun
//	
//
//	// TS_039
//
//	public static String sizeandtype_modulename = "sizeandtype_modulename>(//span[text()='Stock Report by Size / Type'])[1]";
//	public static String Search_icon = "Search_icon>//button[@id='SSP-SSP_btnsele']";
//	public static String reportcountrymsg = "reportcountrymsg>//*[text()='You are viewing the Report for the Country  : AE - United Arab Emirates']";
//	public static String folders_dropdown = "folders_dropdown>(//*[text()='IN'])[1]//preceding::span[2]";
//	public static String folders_dropdownbelow_field = "folders_dropdownbelow_field>(//*[text()='INNSA'])[1]//preceding::span[2]";
//	public static String folders_name1 = "folder_name1>(//*[text()='INNSABMCT0'])[2]";
//	public static String mty_value = "mty_value>(//*[@col-id='H5'])[3]";
//	public static String close_report39 = "close_report>//div[@id='SSP_JdlgCntrList']//a[@aria-label='Close']";
//	public static String close_btn39 = "close_btn>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//
//	// TS_040
//	public static String folders_gridname = "folders_gridname>(//*[text()='%s'])[2]";
//	public static String folders_name = "folder_name>(//span[text()='%s'])[1]";
//	public static String folder_drop = "folder_drop>//*[text()='%s']//preceding::span[2]";
//	public static String term_detail = "term_detail>(//*[@col-id='H1'])[2]";
//	public static String term_location = "term_location>(//*[@col-id='H3'])[2]";
//	public static String close_report40 = "close_report>//div[@id='ETR_Jdlcntrlist']//a[@aria-label='Close']";
//	public static String close_btn40 = "close_btn>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//	public static String sizeTypeDropDwnSel_2 = "sizeTypeDropDwnSel_2>//li[@id='CGE-CGE_cmbSinSpec_5']";
//
//	public static String stock_modulename = "stock_modulename>(//span[text()='Stock Report by Service'])[2]";
//	public static String location_input = "location_input>//*[text()='Location Hierarchy']//following::span[1]";
//	public static String country_searchicons = "country_searchicons>//*[@id='SUM-SUM_btnsele']";
//	public static String Country_code = "Country_code>//span[text()='Country Code']//following::input[2]";
//	public static String Size_type = "Size_type>(//div[@col-id='H1'])[1]";
//	public static String grid_38 = "grid>//div[@col-id='H1']";
//	public static String size_exceed_popup = "size_exceed popup>//div[@id='lrp_cust_growl_container']//p[text()='The cumulative Pick Up Quantity for the locations assigned for the Sz./Tp exceeds the pick up quantity assigned for the Sz./Tp']";
//	public static String sizetype_pickup_quantity_D = "sizetype pickup quantity>//input[@id='RMS-RMS_txtPickUp']";
//	public static String termcharge_pckup_quantity_D = "termcharge_pckup_quantity_D>//input[@id='RMS-RMS_txtHierpickQty']";
//	public static String termcharge_savebtn = "save btn>//div[@id='RMS-RMS_tblsvm-tblComponent']//button[@id='RMS-RMS_tblsvm-btnsave']";
//	public static String depreciation_opt_D = "depreciation_opt>//ul[@id='RMS-RMS_cmbDeprType_items']//li[@data-label='Straight Line']";
//	public static String selected_sizetype_remove_popup_D = "selected sizetype_remove>//span[text()=' The selected Size / Type existing in the subsequent tabs will be removed. Do you want to remove?']";
//	public static String selected_sizetype_remove_yes_D = "selected_sizetype_remove_yes>//button[text()='Yes']";
//	public static String multiple_equip_entry = "multiple_equip_entry>//a[text()='Multiple Equipment Entry']";
//	public static String activity16 = "activity>//input[@id='CGE-CGE_txtMulActivity_input']";
//	public static String activity_value16 = "activity value>//tr[@data-item-value='OFHI']";
//	public static String date_field16 = "activity date field>//input[@id=\"CGE-CGE_txtMulActivityDate_input\"]";
//	public static String date16 = "date>//a[text()='8']";
//	public static String timefield16 = "time field>//input[@id='CGE-CGE_tfMul_input']";
//	public static String currenttime16 = "current time>//button[text()='Current Date']";
//	public static String close_btn16 = "close btn>//button[text()='Close']";
//	public static String show_btn16 = "show_btn>//button[@id='CGE-CGE_btnMulShow']";
//	public static String locationicon16 = "location icon>//span[@id='CGE-CGE_txtSinLocation2']/following-sibling::button[1]";
//	public static String location_search16 = "location>//input[@aria-label='Port Code Filter Input']";
//	public static String location_value16 = "location value>(//div[@role='gridcell'])[1]";
//	public static String termdepot_searchicon16 = "searchicon>//button[@id='CGE-CGE_btnSinDepot']";
//	public static String termdepot_search16 = "termdepot_search>//input[@aria-label='Terminal/Depot Code Filter Input']";
//	public static String termdepot_value16 = "termdepot value>(//div[@role='gridcell'])[1]";
//	public static String returnref16 = "returnref>//input[@id='CGE-CGE_txtSinRetRefNo']";
//	public static String addbtn16 = "addbtn>//button[@id='CGE-CGE_btnAddDet']";
//	public static String grid16 = "grid>//tbody[@id='CGE-CGE_dsGrid2_data']/tr[1]/td[1]";
//	public static String equip_no16 = "equip_no>//input[@id='CGE-CGE_dsGrid2-0-CGE_equipNoCol']";
//	public static String movement_save = "movement save>(//div[@id='CGE-CGE_pgMain_content']//following::button)[3]";
//	public static String okbtn = "ok btn>//button[@id='CGE_btnOk']";
//	public static String EMS_globalsearch16 = "global search>//button[@id='RMS-RMS_tblsvm-btnTblJdlgSearch']";
//	public static String EMS_searchfield16 = "search field>//input[@id='txt_name1']";
//	public static String EMS_searchbtn = "search btn>//button[@id='myBtn']";
//	public static String EMS_searchvalue16 = "search value>//div[text()='SHOW-BILL']";
//	public static String pickup_dropoff_tab = "pickup dropoff tab>//a[text()='Pick up And Drop Off Details']";
//	public static String location_filter16 = "location filter>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[2]";;
//	public static String sizetype_filter16 = "sizetype_filter>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[3]";
//	public static String pickup_dropoff_detail = "pickup_dropoff_detail>//tbody[@id='RMS-RMS_treePicupdrop_data']//td[1]";
//	public static String dropoff_count1 = "drpoff quantity>//tbody[@id='RMS-RMS_treePicupdrop_data']//td[7]";
//	public static String locationDropdownoption4 = "locationDropdownoption4>//label[@id='LSR-LSR_cbxLocaHire_label']";
//	public static String dropoff_count_MUS = "dropoff_count_MUS>(//tfoot[@id='RMS-RMS_treeAlocation_foot']//td)[2]";
//	// Dropoff Quantity:";
//	public static String container_equipno = "container_equipno>//tbody[@id='RMS-RMS_treeDropoff_data']//td[4]";
//	public static String movement_saved_popup = "movement_saved_popup>//*[text()='Multiple Movement Entry  Saved']";
//	public static String MOV_globalsearch16 = "gobal search>(//div[@id='CGE-CGE_pgMain_content']//following::button)[2]";
//	public static String MOV_searchfield16 = "search field>//div[@id='var_char']//input[1]";
//	public static String MOV_searchbtn16 = "search btn>>//div[@id='search_JDLGView']//button[@id='myBtn']";
//	public static String MOV_searchvalue16 = "search value>//div[text()='OFHI']";
//	public static String MOV_select16 = "select btn>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
//	public static String saved_mov_entry16 = "saved movement entry>//tbody[@id='CGE-CGE_dsGrid2_data']//tr[2]";
//	public static String MOV_deletebtn16 = "delete btn>(//a[@id='CGE-CGE_jMnuDelete'])[2]";
//	public static String MOV_del_yes = "yes btn>//button[text()='Yes']";
//	public static String del_confirmed = "confirmed ok>//button[text()='Ok']";
//
//	public static String monthly_utilized_summary1="monthly_utilized_summary1>//tbody[@id='RMS-RMS_treeAlocation_data']";
//	public static String selected_sizetype_remove_popup_1="selected selected_sizetype_remove_popup_1>(//h2[text()='EMS Contract Registration']//following::span)[2]";
//	public static String DropOff_Quantity="DropOff_Quantity>(//div[text()='Drop off Container Details']//following::th[@aria-label='Equipment No.']//following::input)[1]";
//
//
//	// Total No. of Actual Dropoff Quantity:
//	public static String MOV_module = "module>//*[@id='mdl1_tablbl']";
//	public static String Ems_Savebtn = "Ems_Savebtn>//button[@id='RMS-RMS_tblsvm-btnsave']";
//	public static String Scrolllit = "Scrolllit>//label[@id='SCN-SCN_dsGridActive_1_reords_lbl']";
//	public static String containsclick = "containsclick>//select[@id='var_condition1']";
//	public static String containsclickequal = "containsclickequal>(//select[@id='var_condition1']//following::option[@value='Equal To'])[1]";
//	public static String eqpNum_Condition = "eqpNum_Condition>//select[@id='var_condition1']";
//	public static String equalTo_Condition = "equalTo_Condition>//select[@id='var_condition1']/child::option[.='Equal To']";
//
//	public static String globalSearch_L1 = "globalSearch>//button[@id='RMS-RMS_tblsvm-btnTblJdlgSearch']";
//	public static String Container_valueTf = "Container_valueTf>(//thead[@id='RMS-RMS_treePickup_head']//following::input)[5]";
//
	public static String Return_Ref_No = "Return_Ref_No>//input[@id='CGE-CGE_txtSinRetRefNo']";
//	public static String globalSearch_L12 = "globalSearch>//button[@id='RMS-RMS_tblsvm-btnTblJdlgSearch']";
//	
//	public static String portOpt = "portOpt>((//*[@id='CCH-CCH_gridSummary_tbl']//following::span[contains(text(),'Port')])[1]//following::div[contains(@aria-colindex,'1')])[3]";
//	public static String DeportOpt = "DeportOpt>((//*[@id='CCH-CCH_gridSummary_tbl']//following::span[contains(text(),'Depot')])[1]//following::div[contains(@aria-colindex,'2')])[3]";
//
//	public static String SizeType_Standard = "SizeType_Standard>//span[text()='Sz/Tp Standard']";
//	public static String StockStatus_PlusBtn = "StockStatus_PlusBtn>//button[@id='CCH-CCH_btnStockStatus']";
//	public static String Stock_SearchTF = "Stock_SearchTF>//input[@aria-label='Stock Status Code Filter Input']";
//	public static String Select_Btn = "Select_Btn>//button[@id='multicol_okbtn']";
//	public static String Search_Popup = "Search_Popup>//div[text()='Values should be selected']";
//	public static String Close_Popup = "Close_Popup>(//div[@id='primefacesmessagedlg']//following::a)[1]";
//	public static String Search_Close = "Search_Close>(//label[@id='nfr_sch_mu_header']//following::a)[1]";
//	public static String Loc_CloseBtn = "Loc_CloseBtn>//button[@id='nfr-twocol-select-button']";
//	public static String StockStatus_MinusBtn = "StockStatus_MinusBtn>//button[@id='CCH-CCH_btnRmvStock']";
//	public static String ActivityCode_PlusBtn = "ActivityCode_PlusBtn>//button[@id='CCH-CCH_btnActivity']";
//	public static String ActivityCode_TF = "ActivityCode_TF>//input[@aria-label='Activity Code Filter Input']";
//
//	public static String Service_SearchBtn = "Service_SearchBtn>//button[@id='CCH-CCH_btnService']";
//	public static String Servicevalue_TF = "Service_TF>//input[@aria-label='Service Filter Input']";
//	public static String Value_select = "Value_select>(//div[@id='nfr-twocolsearch-div']//following::div[@aria-colindex='1'])[2]";
//	public static String Value_Select_btn = "Value_Select_btn>//button[@id='nfr-twocol-select-button']";
//	public static String Disposal_RegNo_SearchBtn = "Disposal_RegNo_SearchBtn>//button[@id='CCH-CCH_btnDispRegNo']";
//	public static String Disposal_RegNo_TF = "Disposal_RegNo_TF>//input[@aria-label='Disposal Registration No. Filter Input']";
//	public static String BookNo_SearchBtn = "BookNo_SearchBtn>//button[@id='CCH-CCH_btnDocrefNo']";
//	public static String BookNo_TF = "BookNo_TF>//input[@aria-label='Book No. Filter Input']";
//
//	public static String ActivityCode_MinusBtn = "ActivityCode_MinusBtn>//button[@id='CCH-CCH_btnRmvAct']";
//	public static String SupplierContract_PlusBtn = "SupplierContract_PlusBtn>//button[@id='CCH-CCH_btnAddSupp']";
//	public static String Suppliercontract_TF = "Suppliercontract_TF>//input[@aria-label='Supplier contract Filter Input']";
//	public static String SupplierContract_minusBtn = "SupplierContract_minusBtn>//button[@id='CCH-CCH_btnRmvSupp']";
//
//	public static String Vessel_PlusBtn = "Vessel_PlusBtn>//button[@id='CCH-CCH_btnVessel']";
//	public static String Vessel_TF = "Vessel_TF>(//input[contains(@aria-label,'Filter Input')])[1]";
//	public static String voyage_TF = "voyage_TF>(//input[contains(@aria-label,'Filter Input')])[2]";
//	public static String Bound_TF = "Bound_TF>(//input[contains(@aria-label,'Filter Input')])[3]";
//
//	public static String Vessel_MinusBtn = "Vessel_MinusBtn>//button[@id='CCH-CCH_btnVoyage']";
//	public static String LeaseKind_PlusBtn = "LeaseKind_PlusBtn>//button[@id='CCH-CCH_btnAddLKind']";
//	public static String LeaseKind_TF = "LeaseKind_TF>//input[@aria-label='Lease Kind Filter Input']";
//
//	public static String LeaseKind_MinusBtn = "LeaseKind_MinusBtn>//button[@id='CCH-CCH_btnRmvLKind']";
//	public static String Lease_PlusBtn = "Lease_PlusBtn>//button[@id='CCH-CCH_btnAddLessee']";
//	public static String Lease_TF = "Lease_TF>//input[@aria-label='Lessee Code Filter Input']";
//
//	public static String Lease_MinusBtn = "Lease_MinusBtn>//button[@id='Lease_PlusBtn']";
//	public static String SizeType_special = "SizeType_special>//span[.='Sz/Tp Special']";
//	public static String Region_TF = "Region_TF>//input[@id='CCH-CCH_txtToLocCode']";
//	public static String POD_TF = "POD_TF>//input[@id='CCH-CCH_txtPod']";
//	public static String Destination_TF = "Destination_TF>//input[@id='CCH-CCH_txtDest']";
//	public static String SizeType_PlusBtn = "SizeType_PlusBtn>//button[@id='CCH-CCH_btnAddEtype']";
//	public static String SizeType_TF = "SizeType_TF>//input[@aria-label='Equipment Type Filter Input']";
//
//	public static String SizeType_MinusBtn = "SizeType_MinusBtn>//button[@id='CCH-CCH_btnRmvEtype']";
//	public static String CustomerContract_PlusBtn = "CustomerContract_PlusBtn>//button[@id='CCH-CCH_btnAddSubl']";
//	public static String Customercontract_TF = "Customercontract_TF>//input[@aria-label='Customer contract Filter Input']";
//	public static String Popup_Value = "Popup_Value>(//div[@id='nfr-multi-div']//following::div[@aria-colindex='2'])[2]";
//
//	public static String CustomerContract_minusBtn = "CustomerContract_minusBtn>//button[@id='CCH-CCH_btnRmvSubl']";
//	public static String Lessor_PlusBtn = "Lessor_PlusBtn>//button[@id='CCH-CCH_btnAddLessor']";
//	public static String Lessor_TF = "Lessor_TF>//input[@aria-label='Lessor Code Filter Input']";
//
//	public static String Lessor_MinusBtn = "Lessor_MinusBtn>//button[@id='CCH-CCH_btnRmvLessor']";
//	public static String Service_TF = "Service_TF>//input[@id='CCH-CCH_txtService']";
//	public static String FlagCode_PlusBtn = "FlagCode_PlusBtn>//button[@id='CCH-CCH_btnAddFlg']";
//	public static String FlagCode_TF = "FlagCode_TF>//input[@aria-label='Flag Code Filter Input']";
//	public static String From_Loc_Hierarchy_Dropdown = "From_Loc_Hierarchy_Dropdown>//label[@id='CCH-CCH_cbxLocaHire_label']";
//	public static String From_Loc_region_searchbtn = "Loc_region_searchbtn>//button[@id='CCH-CCH_btnArea']";
//	public static String From_Loc_Region_TF = "Loc_Region_TF>//input[@aria-label='Region Code Filter Input']";
//	public static String Loc_POR_searchBtn = "Loc_POR_searchBtn>//button[@id='CCH-CCH_btnPor']";
//	public static String Loc_POR_TF = "Loc_POR_TF>//input[@aria-label='Port Code Filter Input']";
//	public static String Loc_POL_TF = "Loc_POL_SearchBtn>//input[@aria-label='Port Code Filter Input']";
//	public static String Loc_POL_SearchBtn = "Loc_POL_SearchBtn>//button[@id='CCH-CCH_btnPol']";
//	public static String To_Region_searchBtn = "To_Region_searchBtn>//button[@id='CCH-CCH_btnToLoc']";
//	public static String To_Region_TF = "To_Region_TF>//input[@aria-label='Region Code Filter Input']";
//
//	public static String FlagCode_MinusBtn = "FlagCode_MinusBtn>//button[@id='CCH-CCH_btnRmvFlg']";
//	public static String Disposal_TF = "Disposal_TF>//input[@id='CCH-CCH_txtDispregno']";
//	public static String BookNo_Tf = "BookNo_Tf>//input[@id='CCH-CCH_txtDocrefno']";
//	public static String IncludeBL_checkBox = "IncludeBL_checkBox>(//input[@id='CCH-CCH_chkShowBL_input']//following::div)[1]";
//	public static String To_Loc_Hierarchy_Dropdown = "Loc_Hierarchy>//label[@id='CCH-CCH_cbxToLocHire_label']";
//	public static String Loc_POD_SearchBtn = "Loc_POD_SearchBtn>//button[@id='CCH-CCH_btnPod']";
//	public static String Loc_POD_TF = "Loc_POD_TF>//input[@aria-label='Port Code Filter Input']";
//	public static String Loc_Destination_SearchBtn = "Loc_Destination_SearchBtn>//button[@id='CCH-CCH_btnDest']";
//	public static String Loc_Destination_TF = "Loc_Destination_TF>//input[@aria-label='Port Code Filter Input']";
//
//	public static String contract_age = "contract_age>//input[@id='RMS-RMS_txtAge']";
//	public static String contractcate = "contractcate>//div[@id='RMS-RMS_cmbContrCateg']";
//	public static String service_searchicon = "service_searchicon>//div[@id='RMS-RMS_btnService-RMS_btnService']";
//	public static String trade_searchicon = "trade_searchicon>//button[@id='RMS-RMS_btnTrade']";
//	public static String effective_date = "effective_date>//input[@id='RMS-RMS_txtEffDate_input']";
//	public static String remarks = "remarks>//*[@id='RMS-RMS_txtRemarks']";
//	public static String lessor_ref = "lessor_ref>//input[@id='RMS-RMS_txtLessorRef']";
//	public static String valid_prefix_addicon = "valid_prefix_addicon>//button[@id='RMS-RMS_btnValidprfAdd']";
//	public static String valid_prefix_select = "valid_prefix_select>//button[@id='multicol_okbtn']";
//	public static String oneway = "oneway>//div[@id='RMS-RMS_chkOneWay']//span";
//	public static String purchase = "purchase>//div[@id='RMS-RMS_chkPurchase']//span";
//	public static String dropoff = "dropoff>//div[contains(@id,'RMS-RMS_optHierDropVolRestr')]//span";
//	public static String unit_teu = "unit_teu>(//div[contains(@id,'RMS-RMS_cmbUnit')])[1]";
//	public static String buildup_period = "buildup_period>//input[@id='RMS-RMS_txtBuildUp']";
//	public static String builddown_period = "builddown_period>//input[@id='RMS-RMS_txtBuildDown']";
//	public static String min_period = "min_period>//input[@id='RMS-RMS_txtMinPeriod']";
//	public static String difee = "difee>//input[@id='RMS-RMS_txtDiFee_input']";
//	public static String offhire = "offhire>//input[contains(@id,'RMS-RMS_txtPercent')]";
//	public static String currency1 = "currency>//div[@id='RMS-RMS_cmbCur']";
//	public static String di_allow = "di_allow>//div[@id='RMS-RMS_cmbDiall']";
//	public static String bill_paytype = "bill_paytype>//div[@id='RMS-RMS_cmbpaymenttype']";
//
//	public static String buildup_perdiem = "buildup_perdiem>//input[@id='RMS-RMS_txtSizeBuildUp_input']";
//	public static String DPP_basis = "DPP_basis>//div[@id='RMS-RMS_cmbDppBasis']";
//	public static String DPP_lumpsum = "DPP_lumpsum>//div[@id='RMS-RMS_cmbDppLumpsum']";
//	public static String freedays = "freedays>//input[@id='RMS-RMS_txtFreeDays']";
//	public static String builddown_perdiem = "builddown_perdiem>//input[@id='RMS-RMS_txtSizeBuildDown_input']";
//	public static String DPP_waiver = "DPP_waiver>//div[@id='RMS-RMS_cmbDppWaiver']";
//	public static String spl_perdiem = "spl_perdiem>//input[@id='RMS-RMS_txtsplperdiem_input']";
//	public static String DPP_amount = "DPP_amount>//input[@id='RMS-RMS_txtDppWaiverAmt_input']";
//	public static String monthly_amount = "monthly_amount>//input[@id='RMS-RMS_txtmonthlyamount_input']";
//	public static String pickup_quantity = "pickup_quantity>//input[@id='RMS-RMS_txtPickUp']";
//	public static String rep_value = "rep_value>//input[@id='RMS-RMS_txtrepValue_input']";
//	public static String DPP = "rep_value>//input[@id='RMS-RMS_txtDpp_input']";
//	public static String combine_vol = "rep_value>//div[@id='RMS-RMS_cmbCombVol']";
//	public static String combinevolbtn = "combinevolbtn>//button[@id='RMS-RMS_btncombinedVol']";
//	public static String combinevol_addbtn = "combinevol_addbtn>//button[@id='JdlgCombinedContractform-RMS_btnContractAdd']";
//	public static String combinevol_selbtn = "combinevol_selbtn>//button[@id='multicol_okbtn']";
//	public static String combinevol_okbtn = "combinevol_okbtn>//button[contains(@id,'JdlgCombinedContractform-RMS_btnOk')]";
//	public static String pretrip_ins_charge = "rep_value>//input[@id='RMS-RMS_txtPreInsp_input']";
//	public static String posttrip_ins_charge = "rep_value>//input[@id='RMS-RMS_txtPostInsp_input']";
//	public static String post_builddown_perdiem = "builddown_perdiem>//input[@id='RMS-RMS_txtPostBuildDownPerd_input']";
//	public static String extent_cover = "extent_cover>//input[@id='RMS-RMS_txtExtOfCover_input']";
//	public static String add_tierbtn = "add_tierbtn>//button[@id='RMS-RMS_btnTier']";
//
//	public static String tc_pickup = "tc_pickup>//input[@id='RMS-RMS_txtHierpickQty']";
//	public static String tc_pickup_handling = "tc_pickup_handling>//input[@id='RMS-RMS_txtHierHandlCharge_input']";
//	public static String tc_dropoff_credit = "tc_dropoff_credit>//input[@id='RMS-RMS_txtDropofcrd_input']";
//	public static String tc_dropoff_month = "tc_dropoff_month>//input[@id='RMS-RMS_txtDropofpermonth']";
//	public static String tc_pickupcharges = "tc_pickupcharges>//input[@id='RMS-RMS_txtHierPickUpCharge_input']";
//	public static String tc_dropoff = "tc_dropoff>//input[@id='RMS-RMS_txtHierDropQty']";
//	public static String tc_dropoff_handling = "tc_dropoff_handling>//input[@id='RMS-RMS_txtDropOffHandlCharge_input']";
//	public static String tc_dropoffcharges_radio = "tc_dropoffcharges_radio>(//div[@id='RMS-RMS_optHierDropChTier']//div)[2]";
//	public static String tc_condtdropoff_radio = "tc_condtdropoff_radio>(//div[@id='RMS-RMS_optCondDropCharge']//div)[2]";
//	public static String tc_pickup_credit = "tc_pickup_credit>//input[@id='RMS-RMS_txtPickupcrd_input']";
//	public static String tc_dropoffcharges = "tc_dropoffcharges>//input[@id='RMS-RMS_txthierDropCharge_input']";
//	public static String tc_penalty = "tc_penalty>//div[@id='RMS-RMS_cmbRedelivPen']";
//	public static String tc_penalty_value = "tc_penalty_value>//*[@id='RMS-RMS_txtHierRedelivPen_input']";
//	public static String close_tab = "close_tab >(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
//	public static String dep_kind = "dep_kind>//div[@id='RMS-RMS_cmbDeprkind']";
//	public static String dep_rate = "dep_rate>//input[@id='RMS-RMS_txtDeprRate_input']";
//	public static String dep_min = "dep_min>//input[@id='RMS-RMS_txtMinReplValue_input']";
//	public static String dep_max = "dep_max>//input[@id='RMS-RMS_txtMaxreplValue_input']";
//	public static String dep_min_checkbox = "dep_max>//div[@id='RMS-RMS_chkMinResidual']//span";
//	public static String dep_mincheckbox_field = "dep_max>//input[@id='RMS-RMS_txtResidualVal_input']";
//	public static String dep_percent = "dep_percent>//div[@id='RMS-RMS_cmbDeprPercent']";
//	public static String Month_Select = "Month_Select>//div[@id='ui-datepicker-div']//select[@aria-label='select month']";
//	public static String Edi_file_TF = "Edi_file_TF>//input[@aria-label='Edi File Filter Input']";
//	public static String Edi_Value = "Edi_Value>(//div[@aria-colindex='2'])[2]";
//	public static String Edi_Select = "Edi_Select>//button[@id='multicol_okbtn']";
//	public static String Error_Grid = " Error_Grid>(//div[@row-index='0'])[2]//div[@aria-colindex='3']";
//	public static String Error_SelectBtn = "Error_SelectBtn>//button[text()='Close']";
//	public static String Re_Process_Btn = "Re_Process_Btn>//button[@id='EER-EER_btnReProcess']";
//	public static String clear_btn = "clear_btn>//button[@id='EER-EER_btnClears']";
//	public static String emsgate_Todate_field = "emsgate_Todate_field>//input[@id='EGT-EGT_txtTo_input']";
//	public static String Error_Data_grid = "Error_Data_grid>(//div[text()='Completed With Errors'])[1]";
//	public static String PopupYes_Btn = "PopupYes_Btn>//button[text()='Yes']";
//	public static String Month_Year_filter = "Month_Year_filter>(//input[contains(@id,'RMS-RMS_treeAlocation')])[1]";
//	public static String Actual_dropOff="Actual_dropOff>(//tbody[@id='RMS-RMS_treePicupdrop_data']//td)[7]";
//
//	public static String Status_TF="Status_TF>//input[@aria-label='Status Filter Input']";
//	public static String EDI_File_Data="EDI_File_Data>((//div[@row-index='0'])[2]//following::div[@aria-colindex='2'])[1]";
//	//public static String selected_sizetype_remove_popup_D="selected sizetype_remove>(//h2[text()='EMS Contract Registration']//following::span)[2]";
//	public static String Location_Value="Location_Value>//div[@id='RMS-RMS_lstPorts']//li";
//
//	public static String Excel_Upload = "Excel_Upload>//label[@id='ESN-ESN_lblEDIURL']";
//	public static String Contract_Type_Dropdown = "Contract_Type_Dropdown>//label[@id='RMS-RMS_cmbContractType_label";
//	public static String SizeType_Dropdown = "SizeType_Dropdown>//*[@id='RMS-RMS_cmbEqp_label']";
//	public static String Location_Dropdown_Select = "Location_Dropdown_Select>//*[@id='RMS-RMS_cmbHierarchy_label']";
//	public static String Term_size_Dropdown = "Term_size_Dropdown>//label[@id='RMS-RMS_cmbHierEqp_label']";
//	public static String Depot_SelectBtn="Depot_SelectBtn>//button[@id='nfr-twocol-select-button']";
//
//	public static String Scroll_side="Scroll_side>(//div[@ref='eBodyHorizontalScrollViewport'])[1]";
//
//	public static String scaleout_input="scaleout_input>//input[@id='SCN-SCN_txtReferenceNo2']";
//
//	public static String AClosex = "Closex>(//label[@id='nfr_sch_jd_header']//following::a)[1]";
//
//	public static String AClosex1 = "Closex1>(//label[@id='nfr_sch_jd_header']//following::a)[1]";
//
//	public static String Asavepopup = "savepopup>(//p[text()='Scale-In / Scale-Out Reference is saved'])[1]";
//
//	public static String RemovebuttoncoloumclickNO = "RemovebuttoncoloumclickNO>//h2[text()='Scale In/Scale Out Reference']//following::span[2]//following::button[1]";
//
//	public static String Removepop = "Removepop>//h2[text()='Scale In/Scale Out Reference']//following::span[2]";
//
//
//	public static String Lessor="Lessor>(//div[@col-id='H2'])[2]";
//	public static String Bill_no="Bill_no>(//div[@col-id='H3'])[2]";
//	public static String Billing_number="Billing_number>(//div[@col-id='H4'])[2]";
//	public static String Status="Status>(//div[@col-id='H7'])[2]";
//
////    
////
////	public static String movementCode_Grid_Filter = "movementCode_Grid_Filter>//th[contains(@aria-label,'Movement Code')]//input[@role='textbox']";
////	public static String equipmentDetails_Grid_First_Row = "equipmentDetails_Grid_First_Row>(//tbody[@id='CGE-CGE_dsGrid2_data']/tr/td)[1]";
////	public static String equipmentNumber_Grid_Textfield = "equipmentNumber_Grid_Textfield>(//tr[@data-ri='%s']/child::td[@role='gridcell'])[1]";
////	public static String equipmentNumber_Gridcell_Value = "equipmentNumber_Gridcell_Value>(//tr[@data-ri='%s']/child::td[@role='gridcell']/div/div)[1]";
////
////	public static String equipmentNumber_Grid_Input_Textfield = "equipmentNumber_Grid_Input_Textfield>//tr[@data-ri='0']//following::input[contains(@id,'CGE-CGE_dsGrid2-%s-CGE_equipNoCol')]";
////	public static String twoColumnSearch_Value = "twoColumnSearch_Value>//div[@id='nfr-twocolsearch-div']//div[text()='%s']";
////	public static String twoColumnSearch_Select_Button = "twoColumnSearch_Select_Button>//button[@id='nfr-twocol-select-button']";
////
////	public static String popup_Message ="popup_Message>//h2//following-sibling::span[2]";
////	public static String popup_Message_Yes_Button = "popup_Message_Yes_Button>//h2//following::button[text()='Yes']";
////	public static String popup_Message_No_Button = "popup_Message_No_Button>//h2//following::button[text()='No']";
////	public static String popup_Message_Ok_Button = "popup_Message_Ok_Button>//h2//following::button[text()='Ok']";
////	public static String retrieved_Value_Select="retrieved_Value_Select>//table[@id='nfr_sch_jdlg_form-nfr_sch_jd_pnl']//div[@ref='eCenterColsClipper']//div[@role='row']/div";
////	public static String select_first = "select_first>//select[@id='type']";
////	public static String globalSearch_Condition_Dropdown1 = "globalSearch_Condition_Dropdown1>//select[@id='var_condition1']";
////	public static String globalSearch_InputTextfield1 = "globalSearch_InputTextfield1>//input[@id='txt_name1']";
////	public static String globalSearch_Frame_SearchButton = "globalSearch_Frame_SearchButton>//button[@id='myBtn']";
////
////
////    public static String Select_first_row="Select_first_row>//div[@id='nfr_sch_mu_pnl_content']//div[@ref='eCenterContainer']//div[@row-index='0']";
//
//  //common
//  	
//  	public static String select_Second="select_Second>//select[@id='second_type']";
//  	public static String select_Third="select_Third>//select[@id='third_type']";
//
//	public static String panel_first_click="bl_panel_first_click>//div[@id='nfr-twocolsearch-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
//	public static String gridvalue_by_index = "gridvalue_by_index>(//div[@col-id='%s'])[%s]";
//	public static String ems_page_on_off_hire="ems_page_on_off_hire>//span[@id='LSR_JDlgMsg_title']";
//	public static String total_records = "total_records>//label[@id='LSR_cntrgridGrid_records_lbl_cnt']";
//	public static String ems_stock_count_select="ems_stock_count_select>//select[contains(@id,'ETR_Jdlcntrlistform-ETR_cntrlistGrid')]";
//	public static String ems_total_pages="ems_total_pages>(//div[@id='ETR_Jdlcntrlistform-ETR_cntrlistGrid_paginator_bottom']//span)[1]";
//	public static String ems_next_page="ems_next_page>//div[@id='ETR_Jdlcntrlistform-ETR_cntrlistGrid_paginator_bottom']//a[@aria-label='Next Page']";
//	public static String ems_panel_close="ems_panel_close>//span[@id='LSR_JDlgMsg_title']/..//a";
//	public static String grand_total_in_page ="grand_total_in_page>//div[.='Grand Total']//following-sibling::div[@col-id='%s']";
//	public static String summary_option ="summary_option>//span[.='Summary']";
//	public static String close_btn ="close_btn>//span[.='Report Request']/..//a";
//	public static String ems_page_heading="ems_page_heading>//span[@id='ETR_Jdlcntrlist_title']";
//	public static String ems_equip_details_count="ems_equip_details_count>//tbody[@id='ETR_Jdlcntrlistform-ETR_cntrlistGrid_data']//tr";
//
//  	    
//  	    public static String Select_first_row1="Select_first_row1>//div[@id='nfr-jdlgGrid-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
//  	    public static String Select_first_row2="Select_first_row2>//div[@id='nfr-multi-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
//
////  	  public static String Filter_Field ="Filter_Field>(//input[contains(@aria-label,'Filter Input')])[1]";
////  	public static String Filter_Button ="Filter_Button>(//div[@ref='eRootWrapper']//button[@ref='eButtonShowMainFilter']//span)[1]";
////  	public static String contains_Click ="contains_Click>(//div[@ref='eRootWrapper']//div[@ref='eDisplayField'])[1]";
////  	public static String column_Values = "column_Values>//div[@ref='eCenterContainer']//div[@col-id='C1']";
////  	public static String select_Button="select_Button>//div[@aria-hidden='false']//span[text()='Select']//ancestor::button[1]";
////  	public static String Equals_Option ="Equals_Option>//div[@aria-hidden='false']//*[text()='Equals']";
////  	public static String Filter_Field1 ="Filter_Field>(//input[contains(@aria-label,'Filter Input')])[2]";
////	public static String Filter_Button1 ="Filter_Button>(//div[@ref='eRootWrapper']//button[@ref='eButtonShowMainFilter']//span)[2]";
////	public static String column_Values1 = "column_Values>//div[@ref='eCenterContainer']//div[@col-id='C2']";
//	
////	public static String DropDown_Select= "DropDown_Select>//div[contains(@id,'panel') and contains(@style,'display: block;')]//li[text()='%s']";
////	public static String dateSelect = "Date_Select>//div[contains(@id,'datepicker')]//a[text()='%s']";
//
//	  public static String Stock_Report_Table ="Stock_Report_Table>//div[@id='SBS-SBS_vsltable_tbl']";
//	  	public static String Stock_Column_Header ="Stock_Column_Header>//div[@id='SBS-SBS_vsltable_tbl']//span[@ref='eText' and text()='%s']//ancestor::div[@col-id]";
//	  	public static String select_Stock_Table ="select_Stock_Table>//div[@col-id='%s' and text()='%s']//following-sibling::div[@col-id='%s' and text()='%s']";
//	  	public static String Strock_Summary_Table_Rows = "Strock_Summary_Table_Rows>//div[contains(@id,main) and @aria-hidden='false']//tbody[contains(@id,'cntrgrid')]//tr";
//	  	public static String Strock_Summary_Next_Page_Button="Strock_Summary_Next_Page_Button>//div[contains(@id,main) and @aria-hidden='false']//a[@aria-label='Next Page']";
//	  	 public static String Date_Select = "Date_Select>//div[contains(@id,'datepicker')]//a[text()='%s']";
//	  	public static String Aimport_excelll = "import_excel>//button[@id='LBU-LBU_TemplateDownLoadBtn']//preceding::span[text()='Import Excel']";
//	  	public static String Gird_click="Gird_click>//div[text()='%s']//following::div[text()='%s']";
//	  	 public static String Stock_Report_Table1 ="Stock_Report_Table1>//div[@id='ETR-ETR_TrackingGrid']";
//	  	public static String Stock_Column_Header1 ="Stock_Column_Header>//div[@id='ETR-ETR_TrackingGrid']//span[@ref='eText' and text()='%s']//ancestor::div[@col-id]";
//	  	public static String Strock_Summary_Table_Rows1 = "Strock_Summary_Table_Rows>//div[contains(@id,main) and @aria-hidden='false']//tbody[contains(@id,'ETR_Jdlcntrlistform-ETR_cntrlistGrid_data')]//tr";
//
//	    public static String service_checkbox_SR="service_checkbox_SR>//label[.='Service']/..//div[@id='SUM-SUM_btnGrp1']";
//	  	 public static String service_search_icon_SR="service_search_icon_SR>//button[@Id='SUM-SUM_btnservice-SUM_btnservice']";
//	  	public static String location_hierarchy_dd_SR="location_hierarchy_dd_SR>//label[@id='SUM-SUM_cmbselection_label']";
//	  	public static String location_hierarchy_dd_Options_SR="location_hierarchy_dd_Options_SR>//ul[@id='SUM-SUM_cmbselection_items']//li[text()='%s']";
//		public static String location_hierarchy_search_icon="location_hierarchy_search_icon>//button[@id='SUM-SUM_btnsele']";
//		public static String mty_full_indicator_SR="mty_full_indicator_SR>//label[@id='SUM-SUM_cmbEFindicator_label']";
//		public static String mty_full_indicator_options_SR="mty_full_indicator_options_SR>//ul[@id='SUM-SUM_cmbEFindicator_items']//li[.='%s']";
//		public static String size_type_options_SR="size_type_options_SR>//div[@id='SUM-SUM_btnGrp']//div//span[.='%s']";
//		public static String show_btn_SR="show_btn_SR>//button[@id='SUM-SUM_btnshow']";
//		public static String SR_module_table="SR_module_table>//div[@id='SUM-SUM_vsltable_tbl']";
//		public static String target_cell_value="target_cell_value>//div[@col-id='H2' and text()='%s']";
//		public static String targeting_cell_size_type_value="targeting_cell_size_type_value>//div[text()='%s']/preceding-sibling::div[@col-id='%s' and text()='%s']";
//		public static String stock_report_panel="stock_report_panel>//div[@id='SUM_JDlgMsg']";
//		public static String bottom_panel="bottom_panel>//div[@id='SUM_cntrgridGrid_paginator_bottom']";
//		public static String page_count_select="page_count_select>//select[contains(@id,'SUM_cntrgridGrid')]";
//		public static String size_type_panel_rows="size_type_panel_rows>//tbody[@id='SUM_cntrgridGrid_data']//tr";
//		public static String service_panel_rows = "Strock_Summary_Table_Rows>//div[contains(@id,main) and @aria-hidden='false']//tbody[contains(@id,'cntrgrid')]//tr";
//	  	public static String service_panel_next_button="Strock_Summary_Next_Page_Button>//div[contains(@id,main) and @aria-hidden='false']//a[@aria-label='Next Page']";
//
//	  	public static String panel_Close ="panel_Close>//div[contains(@id,main) and @aria-hidden='false']//span[contains(@id,'SUM_JDlgMsg')]//following-sibling::a[@aria-label='Close']";
//
//		public static String service_column_header ="service_column_header>//div[@id='SUM-SUM_vsltable_tbl']//span[@ref='eText' and text()='%s']//ancestor::div[@col-id]";
//		public static String Column_SelectMenu ="Column_SelectMenu>(//div[@ref='sideBarButtons']//span[.='Columns'])[1]";
//		public static String Column_Search_Input ="Column_Search_Input>(//input[@aria-label='Filter Columns Input'])[1]";
//		public static String SelectAll_Column_CheckBox ="SelectAll_Column_CheckBox>(//input[@aria-label='Toggle Select All Columns'])[1]";
//		public static String Select_Column_tableHead ="Select_Column_tableHead>//div[@ref='sideBar']//span[text()='%s']";
//		
//		
//		
//		
//		
//		
//		//cathy
//		
//		public static String carrier_Search_Button="carrier_Search_Button>//button[@id='SSP-SSP_btncarrier-SSP_btncarrier']";
//	  	public static String Location_Heirachy_Search_Btn="Location_Heirachy_Search_Btn>//button[@id='SSP-SSP_btnsele']";
//	    public static String view_by_Port_CheckBox="view_by_Port_CheckBox>//label[@id='SSP-SSP_lbl_chkByPort']//preceding::div[@id='SSP-SSP_chkByPort']";
//	    public static String service_Checkbox_Click="service_Checkbox>//label[@id='SSP-SSP_lbl_jRadiobtnservice']//preceding::div[@id='SSP-SSP_buttonGroupService']";
//	    public static String service_search_Button="service_search_Button>//button[@id='SSP-SSP_btnservice-SSP_btnservice']";
//	    public static String size_Type_Select="size_Type_Select>//div[contains(@id,'SSP-SSP_buttonGroup')]//span[text()='%s']";
//	    public static String Size_Type_show_Button="Size_Type_show_Button>//button[@id='SSP-SSP_btnshow']";
//	    public static String stock_Report_Size_Type_Table="stock_Report_Size_Type_Table>//div[@id='SSP-SSP_vsltable_tbl']";
//	    public static String toolPannel="toolPannel>//div[@id='SSP-SSP_vsltable_nfr_toolpanel_li_id']";
//	    public static String condition_Filter="condition_Filter>//a[@id='SSP-SSP_vsltable_conditionFilter_id']";
//	    public static String location_TF="location_TF>//input[@aria-label='Location Filter Input']";
//	    public static String Equipment_type_TF="Equipment_type_TF>//input[@aria-label='Equipment Type Filter Input']";
//	    public static String ST_service_column_header="ST_service_column_header>//div[@id='SSP-SSP_vsltable']//span[@ref='eText' and text()='%s']//ancestor::div[@col-id]";
//	    public static String targeting_cell_stock_type_value_check="targeting_cell_stock_type_value_>//div[text()='%s']/following-sibling::div[@col-id='%s' and text()='%s']";
//	    public static String stock_Size_Pannel="stock_Size_Pannel>//div[@id='SSP_JdlgCntrList']";
//	    public static String Next_Button="Next_Button>//div[contains(@id,main) and @aria-hidden='false']//a[@aria-label='Next Page']";
//	    public static String Size_Type_Table_Rows="Size_Type_Table_Rows>//div[contains(@id,main) and @aria-hidden='false']//tbody[contains(@id,'cntrgrid')]//tr";
//	    public static String pannel_Close_Click="pannel_Close_Click>//div[contains(@id,main) and @aria-hidden='false']//span[contains(@id,'SSP_JdlgCntrList_title')]//following-sibling::a[@aria-label='Close']";
//	  
//	    public static String click_showbtn = "click_showbtn>//button[@id='LSR-LSR_btnShowRpt']";
//
//		public static String click_showbtn40 = "click_showbtn>//button[@id='ETR-ETR_btnShow']";
//
//
//		public static String click_showbtn_stock_status = "click_showbtn_stock_status>//button[@id='SBS-SBS_btnshow']";
//
//
//  	public static String panel_Close1 ="panel_Close>//div[contains(@id,main) and @aria-hidden='false']//span[contains(@id,'ETR_Jdlcntrlist_title')]//following-sibling::a[@aria-label='Close']";
//
//	  	public static String Panel_Close ="panel_Close>//div[contains(@id,main) and @aria-hidden='false']//span[contains(@id,'CntrList')]//following-sibling::a[@aria-label='Close']";

}
