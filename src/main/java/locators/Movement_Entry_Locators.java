package locators;

public interface Movement_Entry_Locators extends on_off_hire_locators{
///////////////////////Movement Entry///////////////////
///
///
public static String Lease_Kind_Dropdown = "Lease_Kind_Dropdown>//label[@id='CGE-CGE_cmbSinLease_label']";
public static String Maker_TF = "Maker_TF>//input[@id='CGE-CGE_txtSinMaker']";
public static String Pay_Load_Tf = "Pay_Load_Tf>//input[@id='CGE-CGE_txtSinPayLoad_input']";
public static String BL_No_SearchBtn = "BL_No_SearchBtn>//button[@id='CGE-CGE_singleblnobtn']";
public static String BL_No_TF = "BL_No_TF>//input[@aria-label='BL NO Filter Input']";
public static String Shipper_Tf = "Shipper_Tf>//input[@aria-label='Shipper Filter Input']";
public static String Consignee_TF = "Consignee_TF>//input[@aria-label='Consignee Filter Input']";
public static String BL_Select = "BL_Select>(//div[@row-index='0'])[2]";
public static String Select = "Select>//button[@id='nfr-twocol-select-button']";
public static String Remarks_TF = "Remarks_TF>//input[@id='CGE-CGE_txtSinRemarks']";
public static String Lessor_Btn = "Lessor_Btn>//button[@id='CGE-CGE_btnSinCompany']";
public static String Lessor_Tf = "Lessor_Tf>//input[@aria-label='Lessor Code Filter Input']";
public static String Material_TF = "Material_TF>//input[@id='CGE-CGE_txtSinMaterial']";
public static String Gross_Weight_Tf = "Gross_Weight_Tf>//input[@id='CGE-CGE_txtSinGrossWt_input']";
public static String Ref_Num = "Ref_Num>//input[@id='CGE-CGE_txtRefnoSin']";
public static String Lessee_Search_Btn = "Lessee_Search_Btn>//button[@id='CGE-CGE_btnSinLessee']";
public static String Lessee_TF = "Lessee_TF>//input[@aria-label='Lessee Code Filter Input']";
public static String Tare_TF = "Tare_TF>//input[@id='CGE-CGE_txtSinTare_input']";
public static String Depot_TF_Input = "Depot_TF_Input>//input[@aria-label='Terminal/Depot Code Filter Input']";
public static String Location_SearchBtn = "Location_SearchBtn>(//button[contains(@id,'CGE-j_idt')]//following::span[text()='ui-button'])[2]";
public static String Location_TF_Input = "Location_TF_Input>//input[@aria-label='Port Code Filter Input']";
public static String Depot_SearchBtn = "Depot_SearchBtn>//button[@id='CGE-CGE_btnSinDepot']";
// 15
public static String Reason_Code_SearchBtn = "Reason_Code_SearchBtn>//button[@id='CGE-CGE_btnSinReasonElim']";
public static String Elimination_Code_Tf = "Elimination_Code_Tf>//input[@aria-label='Elimination Code Filter Input']";
public static String Return_Date = "Return_Date>//input[@id='CGE-CGE_txtSinRetDate_input']";
public static String Return_Place_SearchBtn = "Return_Place_SearchBtn>//button[@id='CGE-CGE_btnSinRetPlace']";

public static String module_Search = "module_Search>//*[@id='nfr_topbar_autocomp_input']";
public static String movementEntryPage_L = "movementEntryPage>//a[@role='presentation']/child::label[.='Movement Entry']";

// TS-015
public static String singleEntryMovPage_L = "singleEntryMovPage>//li[@role='tab']/child::a[.='Single Equipment Entry']";
public static String equipmentNoSearchField_L = "equipmentNoSearchField>//input[@id='CGE-CGE_txtSinConNo']";
public static String activitySearchFieldInSingle_L = "activitySearchFieldInSingle>//input[@id='CGE-CGE_txtSinActivity_input']";
public static String showInputFieldsButton_L = "showInputFieldsButton>//button[@id='CGE-CGE_btnSinShow']";
public static String activeDateInSingle_L = "activeDateInSingle>//input[@id='CGE-CGE_txtSinActivityDate_input']";

//public static String wantToApplyPopup_L = "wantToApplyPopup>//span[contains(text(),'Do you want to apply?')]";
//public static String wantToApplyPopupYes_L = "wantToApplyPopupOK>//span[contains(text(),'Do you want to apply?')]/following::button[.='Yes']";
public static String wantToApplyPopup_L="wantToApplyPopup>//span[contains(text(),'Do you want to apply')]";
public static String location_SearchButton="location_SearchButton>//span[contains(@id,'CGE-CGE_txtSinLocation')]/following-sibling::button";
public static String portCode_SearchBar="portCode_SearchBar>//input[@aria-label='Port Code Filter Input']";
public static String portCode_SearchFrame="portCode_SearchFrame>//label[@id='nfr_sch_twocolumn_header' and text()='Search Port']";
public static String depot_SearchButton="depot_SearchButton>//button[@id='CGE-CGE_btnSinDepot']";
public static String termDepot_SearchFrame="termDepot_SearchFrame>//label[@id='nfr_sch_twocolumn_header' and text()='Search Terminal/Depot']";
public static String termDepot_SearchBar="termDepot_SearchBar>//input[@aria-label='Terminal/Depot Code Filter Input']";
public static String Activity_Code_TF="Activity_Code_TF>//input[@aria-label='Activity Code Filter Input']";
public static String manufactureDate_L = "manufactureDate>//span[@id='CGE-CGE_txtSinMnfacDate']";
public static String supplierContract_L = "supplierContract>//input[@id='CGE-CGE_txtSinSupplierCont']";
public static String manufactureDateCurrent_L = "manufactureDateCurrent>//td[contains(@class,'current-day ui-datepicker-today')]";
public static String showInputFieldFrame_L = "showInputFieldFrame>//fieldset[@id='CGE-CGE_mntToggle']";
public static String activeDateCalander_L = "activeDateCalander>//div[@id='ui-datepicker-div']";
public static String yearSelect_L = "yearSelect>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectYear']";
public static String monthSelect_L = "monthSelect>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectMonth']";
public static String yearPick1_L = "yearPick1>//option[.='2024']";
public static String monthPick1_L = "monthPick1>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectMonth']/option[.='Jan']";
public static String datePick_L = "datePick>//td[@data-handler='selectDay']/child::a[.='1']";
public static String showInputSin_L = "showInputSin>//button[@id='CGE-CGE_btnSinShow']";
public static String selectSizeType_L = "selectSizeType>//ul[@id='CGE-CGE_cmbSinSpec_items']/child::li[.='20DC']";
public static String savedOkSingle_L = "savedOkSingle>//span[.='Single Movement Entry  Saved']/following::button[.='Ok']";
public static String savedPopupSingle_L = "savedPopupSingle>//span[.='Single Movement Entry  Saved']";
public static String monthPick2_L = "monthPick2>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectMonth']/option[.='Dec']";
public static String yearPick2_L = "yearPick2>//option[.='2023']";


// TS-019
public static String cancelButton_L = "cancelButton>//div[contains(@id,'CGE')]//child::button[contains(@id,'-btnTblCancel')]";
public static String newButton_L = "newButton>//div[contains(@id,'CGE')]//child::button[contains(@id,'-btnTblNew')]";
public static String showHistoryButton_L = "showHistoryButton>//button[@id='CGE-CGE_btnShowHistory']";
public static String selFirst_L = "selFirst>(//tbody[@id='CGE-CGE_dsGrid2_data']//child::div[contains(@id,'CGE-CGE_dsGrid2-0-j_idt')])[1]";
public static String deleteOpionSingle_L = "deleteOpionSingle>(//div[@id='CGE-CGE_jPopupMenu1'])[1]//child::a[@id='CGE-CGE_jMnuDelete']";
public static String deleConfirmPopup_L = "deleConfirmPopup>//span[.=' Are you sure to delete the Single Movement Entry ?']";
public static String deleConfirmPopupYes_L = "deleConfirmPopupYes>//span[.=' Are you sure to delete the Single Movement Entry ?']/following::button[.='Yes']";
public static String singleDeletedPopup_L = "singleDeletedPopup>//span[.='Single Movement Entry deleted']";
public static String singleDeletedPopupOk_L = "singleDeletedPopupOk>//span[.='Single Movement Entry deleted']/following::button[.='Ok']";
public static String noRecordsInMoveEntry = "noRecordsInSingle>//div[@id='lrp_cust_growl_container']//following::p";
public static String Emscontractclose = "Emscontractclose>(//form[@id='mdl1_win_launch_mdl_form']//following::a)[3]";

// TS-016
public static String multiEntryMovPage_L = "multiEntryMovPage>//li[@role='tab']/child::a[.='Multiple Equipment Entry']";
public static String activitySearchField_L = "activitySearchField>//input[@id='CGE-CGE_txtMulActivity_input']";
public static String activeDateField_L = "activeDateField>//input[@id='CGE-CGE_txtMulActivityDate_input']";
public static String selectActDate_L = "selectActDate>//a[.='5']"; // TS-015
public static String showInputButton = "showInputButton>//button[@id='CGE-CGE_btnMulShow']";
public static String locationSaerchField_L = "locationSaerchField>//input[@id='CGE-CGE_txtSinLocation2_input']"; // TS-015
public static String termDepotSearchField_L = "termDepotSearchField>//input[@id='CGE-CGE_txtSinDepot_input']"; // TS-015
public static String relRefNoTextField_L = "relRefNoTextField>//input[@id='CGE-CGE_txtSinRelRefNo']"; // TS-015
public static String sizeTypeDropDown_L = "sizeTypeDropDown>//label[@id='CGE-CGE_cmbSinSpec_label']";
public static String addButtonMulti_L = "addButtonMulti>//button[@id='CGE-CGE_btnAddDet']";
public static String sizeTypeDropDwnSel_L = "sizeTypeDropDwnSel>//li[@id='CGE-CGE_cmbSinSpec_3']";
public static String selectGridCell_1_L = "selectGridCell_1>(//tr[@data-ri='0']/child::td[@role='gridcell'])[1]";
public static String selectGridCell_2_L = "selectGridCell_2>(//tr[@data-ri='1']/child::td[@role='gridcell'])[1]";
public static String searchEqpNoInGrid_1_L = "searchEqpNoInGrid_1>//tr[@data-ri='0']//following::input[contains(@id,'CGE-CGE_dsGrid2-0-CGE_equipNoCol')]";
public static String searchEqpNoInGrid_2_L = "searchEqpNoInGrid_2>//tr[@data-ri='0']//following::input[contains(@id,'CGE-CGE_dsGrid2-1-CGE_equipNoCol')]";
public static String saveButtonMoveEnt_L = "saveButtonMoveEnt>//div[contains(@id,'CGE')]//child::button[contains(@id,'-btnsave')]";
public static String errorRecordsFrame_L = "errorRecordsFrame>//div[@id='CGE_dlgExcView']";
public static String okButtonErrorFrame_L = "okButtonErrorFrame>//button[@id='CGE_btnOk']";
public static String errorRecApply_L = "errorRecApply>//button[@id='CGE_btnOk']";
public static String multiSavedPopup_L = "multiSavedPopup>//span[.='Multiple Movement Entry  Saved']";
public static String soc_Not_Allowed_Error2="soc_Not_Allowed_Error2>(//td[.='AC']/following-sibling::td)";
public static String from_Date="from_Date>//input[@id='BUG-BUG_fromDate_input']";
public static String to_Date="to_Date>//input[@id='BUG-BUG_toDate_input']";
// Ts-017 & 018
public static String editButtonMultiMove_L = "editButtonMultiMove>//button[@id='CGE-CGE_btnAddDet']";
public static String saveButton_L = "saveButton>//button[contains(@id,'btnsave')]";
public static String popupMenu_L = "popupMenu>//div[@id='CGE-CGE_jPopupMenu1']";
public static String editOption_L = "editOption>//div[@id='CGE-CGE_txtMulActivity_panel']//following::a[@id='CGE-CGE_jMnuEdit']"; // div[@id='CGE_JDlgscheduleview']//following::a[@id='CGE-CGE_jMnuEdit']
public static String singleUpdatedPopup_L = "singleUpdatedPopup>//span[.='Single Movement Entry  Updated']";
public static String singleUpdatedOk_L = "singleUpdatedOk>//span[.='Single Movement Entry  Updated']/following::button";
public static String selectCheckboxFrame_L = "selectCheckboxFrame>//div[@id='CGE_dlgSelectColumns']";
public static String selectCheckboxOk_L = "selectCheckboxOk>//button[@id='CGE_btnOkSelCol']";
public static String multiMoveUpdatedPopup_L = "multiMoveUpdatedPopup>//span[.='Multiple Movement Entry  Updated']";
public static String multiMoveUpdatedOk_L = "multiMoveUpdatedOk>//span[.='Multiple Movement Entry  Updated']/following::button";
public static String verifyActivePlace_L = "verifyActivePlace>(//tr[@data-ri='0']/child::td[@role='gridcell'])[7]";
public static String verifyDepot_L = "verifyDepot>(//tr[@data-ri='0']/child::td[@role='gridcell'])[8]";
public static String singleEdit_L = "singleEdit>//div[@id='CGE_dlgExcView']//preceding::a[@id='CGE-CGE_jMnuEdit']";
public static String multiSavedPopupOk_L = "multiSavedPopupOk>//span[.='Multiple Movement Entry  Saved']/following::button[.='Ok']";
public static String forcebtn="forcebtn>//button[@id='CGE_ForceMove']";
public static String bookingNo_SearchButton="bookingNo_SearchButton>//button[@id='CGE-CGE_btnSinBookno']";

// TS-020
public static String multiDeleteOption_L = "multiDeleteOption>((//div[@id='CGE-CGE_txtMulActivity_panel'])//following::a[@id='CGE-CGE_jMnuDelete'])";
public static String confirmMultiDelePopupYes_L = "confirmMultiDelePopupYes>//span[.=' Are you sure to delete the Multiple Movement Entry ?']/following::button[.='Yes']";
public static String confirmMultiDelePopup_L = "confirmMultiDelePopup>//span[.=' Are you sure to delete the Multiple Movement Entry ?']";
public static String multiDeletedPopupOk = "multiDeletedPopupOk>//span[.='Multiple Movement Entry deleted']/following::button[.='Ok']";
public static String multiDeletedPopup = "multiDeletedPopup>//span[.='Multiple Movement Entry deleted']";

// Ts-021
public static String globalSearch_L = "globalSearch>//button[contains(@id,'btnTblDefaultSearch')]";
public static String globalSearchFrame_L = "globalSearchFrame>//form[@id='nfr_sch_jdlg_form']";
public static String eqpNoGlobalSearch_L = "eqpNoGlobalSearch>//input[@id='txt_name1']";
public static String searchButton_L = "searchButton>//button[@id='myBtn']";
public static String selectEqpNo_L = "selectEqpNo>//div[@row-index='0']/child::div[@col-id='C1']";
public static String selectButton_L = "selectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
public static String eqpNoInEqpDetails_L = "eqpNoInEqpDetails>(//tr[contains(@class,'ui-datatable-selectable')]//div[contains(@id,'CGE-CGE_dsGrid')])[1]";
public static String globalSearch11 = "globalSearch>//button[@id='RMS-RMS_tblsvm-btnTblJdlgSearch']";

//ofhi
	public static String Ofhi_Value = "Ofhi_Value>//tr[@data-item-label='(OFHI) OFF HIRE']";
	public static String Depot_SearchButton = "Depot_SearchButton>//button[@id='CGE-CGE_btnSinDepot']";
	public static String Depot_Sf = "Depot_Sf>//input[@aria-label='Terminal/Depot Code Filter Input']";
	public static String Depot_Valuefilter = "Depot_Valuefilter>(//div[@ref='eCenterContainer'])[1]";
	public static String Ofhi_OkButton = "Ofhi_OkButton>//button[text()='Ok']";
	public static String DeleteGrid_btn = "DeleteGrid_btn>(//a[@id='CGE-CGE_jMnuDelete'])[2]";
	public static String Yes_Button = "Yes_Button>//button[text()='Yes']";
	public static String Ok_Button = "Ok_Button>//button[text()='Ok']";
	public static String ScaleOut_Reference = "ScaleOut_Reference>//a[text()='Scale Out Reference']";
	public static String Scaleout_refNo_Tf = "Scaleout_refNo_Tf>(//input[contains(@id,'RMS-RMS_treeScaleout')])[2]";
	public static String Scaleout_Location_Tf = "Scaleout_refNo_Tf>(//input[contains(@id,'RMS-RMS_treeScaleout')])[3]";
	public static String Scaleout_Sizetyp_Tf = "Scaleout_refNo_Tf>(//input[contains(@id,'RMS-RMS_treeScaleout')])[4]";
	public static String scaleout_ActualQunantity = "scaleout_ActualQunantity>(//tbody[@id='RMS-RMS_treeScaleout_data']//td)[6]";
	public static String MovementEntry_GlobalSearch = "MovementEntry_GlobalSearch>//button[contains(@id,'btnTblDefaultSearch')]";
	public static String Save_Btn = "Save_Btn>(//div[@id='CGE-CGE_pgMain_content']//following::button)[3]";

	
	public static String P_Service_Must_Enter_Popup = "Service_Must_Enter_Popup >//*[text()='Service must be entered']";
	public static String P_Vessel_Must_Enter_Popup = "Vessel_Must_Enter_Popup >//*[text()='Vessel must be entered']";
	public static String P_Voyage_Must_Enter_Popup = "Voyage_Must_Enter_Popup >//*[text()='Voyage must be entered']";
	public static String P_Bound_Must_Select_Popup = "Bound_Must_Select_Popup >//*[text()='Bound must be selected']";
	public static String P_Service_Txt_Field = "Service_Txt_Field >//input[contains(@id,'txtSinService')]";
	public static String P_Vessel_Txt_Field = "Vessel_Txt_Field >//input[contains(@id,'txtSinVslCode')]";
	public static String P_Voyage_Txt_Field = "Voyage_Txt_Field >//input[contains(@id,'txtSinVoyage')]";
	public static String P_Bound_Txt_Field = "Bound_Txt_Field >//input[contains(@id,'txtSinBound')]";
	public static String P_POL_Txt_Field = "POL_Txt_Field >//input[contains(@id,'txtSinPOL_input')]";
	public static String P_POL_Must_Select_Popup = "POL_Must_Select_Popup >//*[text()='POL must be entered']";
	public static String P_Invalid_Activity_Date_Popup = "Invalid_Activity_Date_Popup >(//div[contains(@id,'errDetList')]//following::td[text()='DA']//following::td)[1]";
	public static String P_Invalid_Service_Popup = "Invalid_Service_Popup >(//div[contains(@id,'errDetList')]//following::td[text()='IS']//following::td)[1]";
	public static String P_Invalid_Terminal_Popup = "Invalid_Terminal_Popup >(//div[contains(@id,'errDetList')]//following::td[text()='IT']//following::td)[1]";
	public static String P_Invalid_Bound_Popup = "Invalid_Bound_Popup >(//div[contains(@id,'errDetList')]//following::td[text()='BO']//following::td)[1]";
	public static String P_Invalid_Voyage_Popup = "Invalid_Voyage_Popup >(//div[contains(@id,'errDetList')]//following::td[text()='VO']//following::td)[1]";
	public static String P_Invalid_POD_Popup = "Invalid_POD_Popup >(//div[contains(@id,'errDetList')]//following::td[text()='AG']//following::td)[1]";
	public static String P_Bill_Upload_Gate_Cancel_Btn = "Enq_His_Cancel_Btn >(//label[contains(text(),'Bill Upload Gate')])[1]//following::a[3]";
	public static String P_Lesser_Bill_Cancel_Btn = "Enq_His_Cancel_Btn >(//label[contains(text(),'Lessor Bill Upload')])[1]//following::a[3]";
	public static String P_Bill_Already_Exist_Popup_YesBtn = "Bill_Already_Exist_Popup_OkBtn >//button[@id='EDB_RegencheckForm-EDB_RegencheckformDataGrid-EDB_RegencheckcmdBtnOk']";
	public static String Bill_Yes_Btn = "Bill_Yes_Btn >//button[@id='EDB_BillReGenCnfFrm-EDB_BillReGenCnfDT-EDB_BillReGenApp']";
	public static String Module_click="Module_click>//li[@data-item-label='Scale In/Scale Out Reference']";
	public static String table_path="table_path>//div[@id='SCN-SCN_dsGridActive_1_tbl']";
	public static String gird="gird>//div[text()='%s']";
	public static String contarct_Module_click="contarct_Module_click>//li[@data-item-label='EMS Contract Billing Generation and Verification ']";
	public static String month_click="month_click>//li[text()='%s']";
	public static String contract_se="contract_se>(//td[text()='%s'])[1]";
	public static String ref_num="ref_num>(//span[text()='Reference'])[1]//following::div[text()='%s'][1]";
	public static String Sheet_sel="Sheet_sel>//li[text()='%s']";
	public static String gird_val="gird_val>//*[@id='xlForm-nfr_importxl_tabviewAuto-0-importxl_datatablezero_data']/tr/td[2]";
	public static String DataA4 = "DataA4>//h2[contains(text(),'Lessor Bill Upload')]//following::span[2]";
	public static String bill_upload_click = "bill_upload_click>//li[@data-item-label='Bill Upload Gate']";
	public static String lessor_bill_upload_click = "lessor_bill_upload_click>//li[@data-item-label='Lessor Bill Upload']";
	public static String close_Tab1 = "close_Tab>(//a[contains(@id,'h2_img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
	public static String movement_entry_click = "movement_entry_click>//li[@data-item-label='Movement Entry']";
	public static String select_woi = "select_woi>//ul[@id='CGE-CGE_cmbSinOWInd_items']/li[text()='%s']";
	public static String select_do = "select_do>//ul[@id='CGE-CGE_cmbSin24T_items']/li[text()='%s']";
	public static String owind = "owind>//ul[@id='CGE-CGE_cmbSinOWInd_items']//li[text()=%s]";
	public static String select_shipper = "select_shipper>//ul[@id='CGE-CGE_cmbSinShipOwn_items']/li[text()='%s']";
	public static String lease_king = "lease_king>//ul[@id='CGE-CGE_cmbSinLease_items']/li[text()='%s']";
	public static String select_trans = "select_trans>//ul[@id='CGE-CGE_cmbSinTransMode_items']/li[@data-label='%s']";

	public static String Edit_Buttton = "Edit_Buttton>//button[@name='RMS-RMS_tblsvm-btnTblEdit']";

	public static String EditClick_Todate = "EditClick_Todate>//a[text()='20']";
	public static String Sizeandtype = "Sizeandtype>(//td[text()='20DC'])[2]";
	public static String Date_PopUP = "Date_PopUP>//span[text()='EMS Contract Registration']/following-sibling::p";

	public static String EditClick_Fromdate = "EditClick_Fromdate>//a[text()='17']";
	public static String Ems_module = "Ems_module>//li[@id='mdl2_tabli']";

	// multiple movement entry
	public static String EquipmentNo_Searchicon = "EquipmentNo_Search>//button[@id='CGE-CGE_btnSinConNo']";
	public static String EquipmentNo_SizetypValue = "EquipmentNo_SvmValue>//div[text()='DV20']";
	public static String EquipmentNo_Selectbtn = "EquipmentNo_Selectbtn>//button[@id='nfr-twocol-select-button']";
	public static String Pum_value = "Pum_value>//tr[@data-item-label='(PUM) ON HIRE']";
	public static String MultiActivity_Date = "MultiActivity_Date>//input[@id='CGE-CGE_txtMulActivityDate_input']";
	public static String Multi_Location_SF = "Multi_Location_SF>//input[@id='CGE-CGE_txtSinLocation2_input']";
	public static String Multi_Location_value = "Multi_Location_value>//tr[@data-item-label='INNSA']";
	public static String Multi_depot_SF = "Multi_depot_SF>//input[@id='CGE-CGE_txtSinDepot_input']";
	public static String Depot_Value = "Depot_Value>//tr[@data-item-value='INNSADEPO']";
	public static String Mutli_SizeandType_SF = "Mutli_SizeandType_SF>//label[@id='CGE-CGE_cmbSinSpec_label']";
	public static String SizeandType_value = "SizeandType_value>//input[@id='CGE-CGE_cmbSinSpec_filter']";
	public static String Size_Dropdownvalue = "Size_Dropdownvalue>//li[@id='CGE-CGE_cmbSinSpec_49']";
	public static String Release_Ref_No = "Release_Ref_No>//input[@id='CGE-CGE_txtSinRelRefNo']";
	public static String Supplier_contract = "Supplier_contract>//input[@id='CGE-CGE_txtSinSupplierCont']";
	public static String Manufacture_Date = "Manufacture_Date>//input[@id='CGE-CGE_txtSinMnfacDate_input']";
	public static String Date = "Date>//a[text()='5']";
	public static String Add_button = "Add_button>//button[@id='CGE-CGE_btnAddDet']";
	public static String Add_Equipmentno = "Add_Equipmentno>(//td[@class='ui-editable-column'])[1]";
	public static String Apply_btn = "Apply_btn>//span[text()='Apply Check Digit']";

	public static String P_No_Record_Popup = "No_Record_Popup >//*[text()='No Records found']";

	public static String Global_Searchfield = "Global_Searchfield>//input[@id='txt_name1']";
	public static String Global_Selectbtn = "Global_Selectbtn>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String ScaleIn_OutPage = "ScaleIn_OutPage>//a[text()='Scale In / Scale Out Ref. Details']";
	public static String ActualQuantity = "Actual_Quantity>(//tbody[@id='RMS-RMS_treeScalein_data']//td)[6]";
	public static String pickup_DropOff = "pickup_DropOff>//a[text()='Pick up And Drop Off Details']";
	public static String Pickup_LocationSF = "Pickup_LocationSF>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[2]";
	public static String Pickup_sizetypeSF = "Pickup_sizetypeSF>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[3]";
	public static String PickUpActual_Quantity = "PickUpActual_Quantity>(//tbody[@id='RMS-RMS_treePicupdrop_data']//td)[5]";
	public static String Monthly_PickupActual_Count = "Monthly_PickupActual_Count>(//tbody[@id='RMS-RMS_treeAlocation_data']//td)[8]";
	public static String pickup_Actual_Countvalue = "pickup_Actual_Countvalue>(//tfoot[@id='RMS-RMS_treeAlocation_foot']//td)[1]";
	public static String Container_No = "Container_No>(//tbody[@id='RMS-RMS_treePickup_data']//td)[5]";

	public static String Onhi_Value = "Onhi_Value>//tr[@data-item-label='(ONHI) ON HIRE']";

	public static String firstCell = "FirstCell>//tbody[@id='CGE-CGE_dsGrid2_data']/tr[1]/td[1]";
	public static String firstCellInput = "FirstCellInput>//input[@id='CGE-CGE_dsGrid2-0-CGE_equipNoCol']";
	public static String Emsmodule_Value = "Emsmodule_Value>(//li[contains(@id,'tabli') and not(contains(@class,'closed'))])[1]";
	public static String saveButton_L1="saveButton>//button[contains(@id,'btnsave')]";
	
	public static String bookingNo_Search="bookingNo_Search>//form[@id='nfr_sch_twocol_form']//input[@aria-label='Booking No. Filter Input']";
	public static String voyage_Search="voyage_Search>//form[@id='nfr_sch_twocol_form']//input[@aria-label='Voyage Filter Input']";
	public static String searchBookNo_Scrollbar="searchBookNo_Scrollbar>//form[@id='nfr_sch_twocol_form']/..//div[@class='ag-body-horizontal-scroll-viewport']";
	public static String firstRow="searchBookNo_Scrollbar>//div[@ref='eCenterContainer']/div[@row-index='0']";
	public static String showAllMoves_CheckBox="showAllMoves_CheckBox>//div[@id='CGE-CGE_showAllMoves']//span";
	// Arun
	// Movement Entry Integration
	// TS-033
	public static String close_Tab = "close_Tab>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
	public static String equipmentSearch_Icon = "equipmentSearch_Icon>//button[@id='CGE-CGE_btnSinConNo']";
	
	public static String wantToApplyPopupNo_L = "wantToApplyPopupNo_L>//span[contains(text(),'Do you want to apply?')]/following::button[.='No']";
	public static String error_Description_1 = "error_Description_1>(//tbody[@id='CGE_errDetList_data']//child::td[@role='gridcell'])[2]";
	public static String error_Description_2 = "error_Description_2>(//tbody[@id='CGE_errDetList_data']//child::td[@role='gridcell'])[4]";
	public static String sizeTypeInvalid = "sizeTypeInvalid>//li[@data-label='10TK']";
	public static String eqpNum_Filter_Textfield = "eqpNum_Filter_Textfield>//label[.='Filter by Equipment No.']/following-sibling::input[contains(@id,'filter')]";
	public static String movementEntry_Popup = "movementEntry_Popup>(//h2[.='Movement Entry']/following::span)[2]";
	public static String bookingNo_Searchfield = "bookingNo_Searchfield>//input[@id='CGE-CGE_txtSinDocRefNo']";
	public static String yearPick_3 = "yearPick_3>//option[.='2027']";
	public static String futureDate_Error = "futureDate_Error>//td[.='FU']/following-sibling::td";
	public static String sizeType_Mismatch_Error = "sizeType_Mismatch_Error>//td[.='BE']/following-sibling::td";
	public static String invalid_Service_Error = "invalid_Service_Error>futureDate_Error>//td[.='IS']/following-sibling::td";
	public static String bookingSearch_Button = "bookingSearch_Button>//button[@id='CGE-CGE_btnSinBookno']";
	public static String booking_Searchfield = "booking_Searchfield>//input[@aria-label='Booking No. Filter Input']";
	public static String first_Select = "first_Select>//div[@row-index='0']/child::div[@col-id='C1']";
	public static String eqpNum_Inputfield = "eqpNum_Inputfield>((//tr[@data-ri='0']/child::td[@role='gridcell'])[1])//input";
	public static String containerNotAvail_Error = "containerNotAvail_Error>//td[.='BC']/following-sibling::td";
	public static String vessel_Not_Calling_Error = "vessel_Not_Calling_Error>//td[.='PV']/following-sibling::td";
	public static String movemet_Not_Allowed_Error = "movemet_Not_Allowed_Error>//td[.='LK']/following-sibling::td";
	public static String monthPick_Feb_L = "monthPick_Feb_L>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectMonth']/option[.='Feb']";
	public static String datePick_5 = "datePick_5>//td[@data-handler='selectDay']/child::a[.='5']";
	public static String monthPick_Apr_L = "monthPick_Apr_L>//div[@id='ui-datepicker-div']//following::select[@data-handler='selectMonth']/option[.='Apr']";
	public static String datePick_4 = "datePick_4>//td[@data-handler='selectDay']/child::a[.='4']";
	public static String soc_Not_Allowed_Error = "soc_Not_Allowed_Error>//td[.='AC']/following-sibling::td";
	public static String shipper_Owned_Dropdown = "shipper_Owned_Dropdown>//div[@id='CGE-CGE_cmbSinShipOwn']";
	public static String shipper_Owned_Yes = "shipper_Owned_Yes>//li[.='Yes']";
	public static String returnRefNumber_Textfield = "returnRefNumber_Textfield>//input[@id='CGE-CGE_txtSinRetRefNo']";
	public static String invalid_Scale_Out_Error = "invalid_Scale_Out_Error>(//td[.='SR']/following-sibling::td)";
	public static String container_Not_Available_Error = "container_Not_Available_Error>//td[.='BC']/following-sibling::td";
	public static String invalid_Port_Error = "invalid_Port_Error>//td[.='IV']/following-sibling::td";
	public static String activityPlace_Pol_Same_Error = "activityPlace_Pol_Same_Error>//td[.='PL']/following-sibling::td";
	public static String pol_Searchfield = "pol_Searchfield>//input[@id='CGE-CGE_txtSinPOL_input']";
	public static String pod_Searchfield = "pod_Searchfield>//input[@id='CGE-CGE_txtSinPOD_input']";

	//// 11

	public static String P_Movement_Entry_Cancel_Btn = "Movement_Entry_Cancel_Btn >(//label[contains(text(),'Movement Entry')])[1]//following::a[3]";
	//
	public static String P_Location_Txt_Field = "Location_Txt_Field >//input[contains(@id,'txtSinLocation2_input')]";
	public static String P_Terminal_Txt_Field = "Terminal_Txt_Field >//input[contains(@id,'txtSinDepot_input')]";
	public static String P_BookingNO_Txt_Field = "BookingNO_Txt_Field >//input[contains(@id,'txtSinDocRefNo')]";
	public static String P_POD_Txt_Field = "POD_Txt_Field >//input[contains(@id,'txtSinPOD_input')]";
	public static String P_Dest_Txt_Field = "Dest_Txt_Field >//input[contains(@id,'txtSinFinalDest_input')]";
	public static String P_Date_Txt_Field = "Date_Txt_Field >//input[contains(@id,'txtMulActivityDate_input')]";
	public static String P_Ok_Btn = "Ok_Btn >//table[@id='CGE_dlgErrormainpnl']//span[text()='Ok']";

	public static String sizeTypeDropDwnSel_2 = "sizeTypeDropDwnSel_2>//li[@id='CGE-CGE_cmbSinSpec_5']";
	public static String movementCode_Grid_Filter = "movementCode_Grid_Filter>//th[contains(@aria-label,'Movement Code')]//input[@role='textbox']";
	public static String equipmentDetails_Grid_First_Row = "equipmentDetails_Grid_First_Row>(//tbody[@id='CGE-CGE_dsGrid2_data']/tr/td)[1]";
	public static String equipmentNumber_Grid_Textfield = "equipmentNumber_Grid_Textfield>(//tr[@data-ri='%s']/child::td[@role='gridcell'])[1]";
	public static String equipmentNumber_Gridcell_Value = "equipmentNumber_Gridcell_Value>(//tr[@data-ri='%s']/child::td[@role='gridcell']/div/div)[1]";

	public static String equipmentNumber_Grid_Input_Textfield = "equipmentNumber_Grid_Input_Textfield>//tr[@data-ri='0']//following::input[contains(@id,'CGE-CGE_dsGrid2-%s-CGE_equipNoCol')]";
	public static String twoColumnSearch_Value = "twoColumnSearch_Value>//div[@id='nfr-twocolsearch-div']//div[text()='%s']";
	public static String twoColumnSearch_Select_Button = "twoColumnSearch_Select_Button>//button[@id='nfr-twocol-select-button']";
	// new
		public static String service_searchicon36 = "service_searchicon36>//button[@id='LSR-LSR_btnService']";
		public static String lessee_searchicon36 = "lessee_searchicon36>//button[@id='LSR-LSR_btnLessee']";
		public static String lessor_searchicon36 = "lessor_searchicon36>//button[@id='LSR-LSR_btnLessor']";
		public static String service_searchfield = "service_searchfield>//input[@aria-label='Service Code Filter Input']";
		public static String lessor_searchfield = "lessor_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
		public static String lessee_searchfield = "lessee_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
		public static String lessee_Searchfield = "lessee_Searchfield>//input[@id='CGE-CGE_txtSinLessee']";
		public static String maker_Textfield = "maker_Textfield>//input[@id='CGE-CGE_txtSinMaker']";
		public static String material_Textfield = "material_Textfield>//input[@id='CGE-CGE_txtSinMaterial']";
		public static String tare_Textfield = "tare_Textfield>//input[@id='CGE-CGE_txtSinTare_input']";
		public static String payLoad_Textfield = "payLoad_Textfield>//input[@id='CGE-CGE_txtSinPayLoad_input']";
		public static String grossWeight_Textfield = "grossWeight_Textfield>//input[@id='CGE-CGE_txtSinGrossWt_input']";
		public static String refNumber_Textfield = "refNumber_Textfield>//input[@id='CGE-CGE_txtRefnoSin']";
		public static String thirtyTon_Dropdown = "thirtyTon_Dropdown>//label[@id='CGE-CGE_cmbSin24T_label']";
		public static String remarks_Textfield = "remarks_Textfield>//input[@id='CGE-CGE_txtSinRemarks']";
		public static String blno = "blno>//input[@id='CGE-CGE_singleblno']";
		public static String lessor_selectbtn = "lessor_selectbtn>(//span[text()='Select'])[1]";
		public static String lessee_selectbtn = "lessee_selectbtn>(//span[text()='Select'])[1]";
		public static String condt_field = "condt_field>//label[@id='LSR-LSR_cbxCond_label']";
		public static String reportype_field = "reportype_field>//div[@id='LSR-LSR_cbxRptType']";
		public static String lessorcontract_searchicon36 = "service_searchicon36>//button[@id='LSR-LSR_btnContract']";
		public static String lessorcontract_searchfield = "lessorcontract_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
		public static String lessorcontract_selectbtn = "lessorcontract_selectbtn>//button[@id='multicol_okbtn']";
		public static String activity_selectbtn = "activity_selectbtn>//button[@id='multicol_okbtn']";
		public static String leasekind_field = "leasekind_field>//div[@id='LSR-LSR_cbxLKind']";
		public static String activity_addicon = "activity_addicon>//button[@id='LSR-LSR_btnActcode']";
		public static String activity_minusicon = "activity_minusicon>//button[@id='LSR-LSR_btnRemAct']";
		public static String activity_searchfield = "activity_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
		public static String detail_requestbtn = "detail_requestbtn>//button[@id='LSR-LSR_detailRqstDialog-DCP_CmdBtn']";
		public static String isoDropdown_Input = "isoDropdown_Input>//input[@id='CGE-CGE_txtSinISOCode_filter']";
		public static String isoDropdown = "isoDropdown>//label[@id='CGE-CGE_txtSinISOCode_label']";
		public static String leaseKind_Dropdown = "leaseKind_Dropdown>//label[@id='CGE-CGE_cmbSinLease_label']";
		public static String lessor_Searchfield = "lessor_Searchfield>//input[@id='CGE-CGE_txtSinCompany']";

		public static String activityTime = "activityTime>//input[@id='CGE-CGE_tfSin_input']";
		public static String sizeType_Searchfield = "sizeType_Searchfield>//input[@id='CGE-CGE_cmbSinSpec_filter']";
		public static String activityTime_Input = "activityTime_Input>//input[@class='ui_tpicker_time_input']";
		public static String activityTime_Close = "activityTime_Close>//button[text()='Close']";
		public static String activityTimeMultiple = "activityTimeMultiple>//input[@id='CGE-CGE_tfMul_input']";
		
		public static String size_exceed_popup = "size_exceed popup>//div[@id='lrp_cust_growl_container']//p[text()='The cumulative Pick Up Quantity for the locations assigned for the Sz./Tp exceeds the pick up quantity assigned for the Sz./Tp']";
		public static String sizetype_pickup_quantity_D = "sizetype pickup quantity>//input[@id='RMS-RMS_txtPickUp']";
		public static String termcharge_pckup_quantity_D = "termcharge_pckup_quantity_D>//input[@id='RMS-RMS_txtHierpickQty']";
		public static String termcharge_savebtn = "save btn>//div[@id='RMS-RMS_tblsvm-tblComponent']//button[@id='RMS-RMS_tblsvm-btnsave']";
		public static String depreciation_opt_D = "depreciation_opt>//ul[@id='RMS-RMS_cmbDeprType_items']//li[@data-label='Straight Line']";
		public static String selected_sizetype_remove_popup_D = "selected sizetype_remove>//span[text()=' The selected Size / Type existing in the subsequent tabs will be removed. Do you want to remove?']";
		public static String selected_sizetype_remove_yes_D = "selected_sizetype_remove_yes>//button[text()='Yes']";
		public static String multiple_equip_entry = "multiple_equip_entry>//a[text()='Multiple Equipment Entry']";
		public static String activity16 = "activity>//input[@id='CGE-CGE_txtMulActivity_input']";
		public static String activity_value16 = "activity value>//tr[@data-item-value='OFHI']";
		public static String date_field16 = "activity date field>//input[@id=\"CGE-CGE_txtMulActivityDate_input\"]";
		public static String date16 = "date>//a[text()='8']";
		public static String timefield16 = "time field>//input[@id='CGE-CGE_tfMul_input']";
		public static String currenttime16 = "current time>//button[text()='Current Date']";
		public static String close_btn16 = "close btn>//button[text()='Close']";
		public static String show_btn16 = "show_btn>//button[@id='CGE-CGE_btnMulShow']";
		public static String locationicon16 = "location icon>//span[@id='CGE-CGE_txtSinLocation2']/following-sibling::button[1]";
		public static String location_search16 = "location>//input[@aria-label='Port Code Filter Input']";
		public static String location_value16 = "location value>(//div[@role='gridcell'])[1]";
		public static String termdepot_searchicon16 = "searchicon>//button[@id='CGE-CGE_btnSinDepot']";
		public static String termdepot_search16 = "termdepot_search>//input[@aria-label='Terminal/Depot Code Filter Input']";
		public static String termdepot_value16 = "termdepot value>(//div[@role='gridcell'])[1]";
		public static String returnref16 = "returnref>//input[@id='CGE-CGE_txtSinRetRefNo']";
		public static String addbtn16 = "addbtn>//button[@id='CGE-CGE_btnAddDet']";
		public static String grid16 = "grid>//tbody[@id='CGE-CGE_dsGrid2_data']/tr[1]/td[1]";
		public static String equip_no16 = "equip_no>//input[@id='CGE-CGE_dsGrid2-0-CGE_equipNoCol']";
		public static String movement_save = "movement save>(//div[@id='CGE-CGE_pgMain_content']//following::button)[3]";
		public static String okbtn = "ok btn>//button[@id='CGE_btnOk']";
		public static String EMS_globalsearch16 = "global search>//button[@id='RMS-RMS_tblsvm-btnTblJdlgSearch']";
		public static String EMS_searchfield16 = "search field>//input[@id='txt_name1']";
		public static String EMS_searchbtn = "search btn>//button[@id='myBtn']";
		public static String EMS_searchvalue16 = "search value>//div[text()='SHOW-BILL']";
		public static String pickup_dropoff_tab = "pickup dropoff tab>//a[text()='Pick up And Drop Off Details']";
		public static String location_filter16 = "location filter>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[2]";;
		public static String sizetype_filter16 = "sizetype_filter>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[3]";
		public static String pickup_dropoff_detail = "pickup_dropoff_detail>//tbody[@id='RMS-RMS_treePicupdrop_data']//td[1]";
		public static String dropoff_count1 = "drpoff quantity>//tbody[@id='RMS-RMS_treePicupdrop_data']//td[7]";
		public static String locationDropdownoption4 = "locationDropdownoption4>//label[@id='LSR-LSR_cbxLocaHire_label']";
		public static String dropoff_count_MUS = "dropoff_count_MUS>(//tfoot[@id='RMS-RMS_treeAlocation_foot']//td)[2]";
		// Dropoff Quantity:";
		public static String container_equipno = "container_equipno>//tbody[@id='RMS-RMS_treeDropoff_data']//td[4]";
		public static String movement_saved_popup = "movement_saved_popup>//*[text()='Multiple Movement Entry  Saved']";
		public static String MOV_globalsearch16 = "gobal search>(//div[@id='CGE-CGE_pgMain_content']//following::button)[2]";
		public static String MOV_searchfield16 = "search field>//div[@id='var_char']//input[1]";
		public static String MOV_searchbtn16 = "search btn>>//div[@id='search_JDLGView']//button[@id='myBtn']";
		public static String MOV_searchvalue16 = "search value>//div[text()='OFHI']";
		public static String MOV_select16 = "select btn>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
		public static String saved_mov_entry16 = "saved movement entry>//tbody[@id='CGE-CGE_dsGrid2_data']//tr[2]";
		public static String MOV_deletebtn16 = "delete btn>(//a[@id='CGE-CGE_jMnuDelete'])[2]";
		
		
		public static String activity_Time = "activity_Time>//input[@class='ui_tpicker_time_input']";
		public static String autoCompleteValue = "autoCompleteValue>//tr[contains(@class,'ui-autocomplete-item')]/td";
		
		public static String portCode = "portCode>//div[text()='%s']";
		public static String terminal = "terminal>//div[text()='%s']";
		public static String shipper_Owned = "shipperOwned>//ul[@id='CGE-CGE_cmbSinShipOwn_items']/li[text()='%s']";
		public static String lease_Kind = "leaseKind>//ul[@id='CGE-CGE_cmbSinLease_items']/li[text()='%s']";
	
		public static String retrieved_Equipment_Number = "retrieved_Equipment_Number>//div[@id='CGE-CGE_EquipDetail_header']/following::div[text()='%s']";
		public static String retrievedEquipmentNo = "retrievedEquipmentNo>//div[text()='%s' and @role='gridcell']";
		public static String thirty_Ton = "thirty_Ton>//ul[@id='CGE-CGE_cmbSin24T_items']/li[text()='%s']";
		public static String sizeType_Option = "sizeType_Option>//ul[@id='CGE-CGE_cmbSinSpec_items']/li[@data-label='%s']";
		public static String owInd = "ow_Ind>//ul[@id='CGE-CGE_cmbSinOWInd_items']/li[text()='%s']";
		public static String wantToApplyPopupYes_L="wantToApplyPopupYes>//span[contains(text(),'Do you want to apply')]/following::button[.='Yes']";
		public static String transport_Mode="transport_Mode>//ul[@id='CGE-CGE_cmbSinTransMode_items']/li[@data-label='%s']";
		public static String movementEntry_Popup_Yes = "movementEntry_Popup_Yes>//h2[.='Movement Entry']/following::button[text()='Yes']";
		public static String movementEntry_Popup_No = "movementEntry_Popup_No>//h2[.='Movement Entry']/following::button[text()='No']";
		public static String movementEntry_Popup_Ok = "movementEntry_Popup_Ok>//h2[.='Movement Entry']/following::button[text()='Ok']";
		public static String reference_type="reference_type>//li[text()='%s']";
		public static String singleEdit_2 = "singleEdit_2>//div[contains(@style,'display: block;')]//child::a[@id='CGE-CGE_jMnuEdit']";
		public static String Lessor="Lessor>(//div[@col-id='H2'])[2]";
		public static String Bill_no="Bill_no>(//div[@col-id='H3'])[2]";
		public static String Billing_number="Billing_number>(//div[@col-id='H4'])[2]";
		public static String Status="Status>(//div[@col-id='H7'])[2]";
		////LODF
		public static String oh_Textfield ="oh_Textfield>//input[@id='CGE-CGE_txtSinOH_input']";
		public static String temp_textfield ="temp_textfield>//input[@id='CGE-CGE_txtSinTemp']";
		public static String Delivery_Searchfield="Delivery_Searchfield>//input[@id='CGE-CGE_txtSinDelivery_input']";
		public static String O_H ="O_H>//input[@id='CGE-CGE_txtSinOH_input']";
		public static String Carrier_Seal ="Carrier_Seal>//input[@id='CGE-CGE_txtSinSeal']";
		public static String Stowage ="Stowage>//input[@id='CGE-CGE_txtSinStowage_input']";
		public static String Release_Ref_no="Release_Ref_no>//input[@id='CGE-CGE_txtSinRelRefNo']";
		public static String Consignee = "Consignee>//input[@id='CGE-CGE_txtconsigneeSin']";
		public static String Remarks="Remarks>//input[@id='CGE-CGE_txtSinRemarks']";
		public static String OW_amount="OW_amount>//input[@id='CGE-CGE_txtSinOWAmt_input']";
		public static String Gross_Weight="Gross_Weight>//input[@id='CGE-CGE_txtSinGrossWt_input']";
		public static String O_L="O_L>//input[@id='CGE-CGE_txtSinCargoWt_input']";
		public static String Cargo_Weight ="Cargo_Weight>//input[@id='CGE-CGE_txtSinCargoWt_input']";
		public static String Supplier_Contract="Supplier_Contract>//input[@id='CGE-CGE_txtSinSupplierCont']";
		public static String Ref_Number ="Ref_Number>//input[@id='CGE-CGE_txtRefnoSin']";
		public static String O_W_ind="O_W_ind>//label[@id='CGE-CGE_cmbSinOWInd_label']";
		public static String IMO="IMO>//input[@id='CGE-CGE_txtSinIMO']";
		public static String O_W ="O_W>//input[@id='CGE-CGE_txtSinOW_input']";
		public static String temp ="temp>//input[@id='CGE-CGE_txtSinTemp']";
		public static String POR ="POR>//input[@id='CGE-CGE_txtSinPOR_input']";
		public static String Shipper_Seal="Shipper_Seal>//input[@id='CGE-CGE_txtSinSeal1']";
		public static String Delivery="Delivery>//input[@id='CGE-CGE_txtSinDelivery_input']";
	
		public static String bookingNumber_Textfield="bookingNumber_Textfield>//input[@id='CGE-CGE_txtSinDocRefNo']";
		public static String activePlaceCheckbox_L = "activePlaceCheckbox>//td[contains(text(),'Activity Place')]//preceding::td[1]";
		public static String depotCheckbox_L = "depotCheckbox>//td[contains(text(),'Depot')]//preceding::td[1]/input";
		public static String releaseRefCheckBox_L = "releaseRefCheckBox_L>//td[contains(text(),'Release Ref')]//preceding::td[1]/input";
		public static String sizeTypeCheckBox_L="sizeTypeCheckBox_L>//td[contains(text(),'Size/Type')]//preceding::td[1]/input";
		public static String isoCheckBox_L="isoCheckBox_L>//td[contains(text(),'ISO')]//preceding::td[1]/input";
		public static String leaseKind_CheckBox="leaseKind_CheckBox>//td[contains(text(),'Lease Kind')]//preceding::td[1]/input";
		public static String lessor_CheckBox="lessor_CheckBox>//td[contains(text(),'Lessor')]//preceding::td[1]/input";
		public static String lessee_CheckBox="lessee_CheckBox>//td[contains(text(),'Lessee')]//preceding::td[1]/input";
		public static String remark_ChecBox="remark_ChecBox>//td[contains(text(),'Remarks')]//preceding::td[1]/input";
		public static String material_CheckBox = "material_CheckBox>//td[contains(text(),'Material')]//preceding::td[1]/input";
		public static String payLoad_Checkbox_L = "payLoad_Checkbox_L>//td[contains(text(),'Pay Load')]//preceding::td[1]/input";
		public static String grossWeihgt_Checkbox_L = "grossWeihgt_Checkbox_L>//td[contains(text(),'GrossWeight')]//preceding::td[1]/input";
		public static String supplierContract_CheckBox = "supplierContract_CheckBox>//td[contains(text(),'SupplierContract')]//preceding::td[1]/input";
		public static String manufactureDate_CheckBox = "manufactureDate_CheckBox>//td[contains(text(),'Manufacturedate')]//preceding::td[1]/input";
		public static String refNumber_CheckBox = "refNumber_CheckBox>//td[contains(text(),'Ref Number')]//preceding::td[1]/input";
		public static String thirtyDon_CheckBox = "thirtyDon_CheckBox>//td[contains(text(),'30Ton')]//preceding::td[1]/input";
		public static String blNo_ChecBox = "blNo_ChecBox>//td[contains(text(),'BL NO')]//preceding::td[1]/input";
		
	
	
		///SNTS
		public static String ow_Ind_Dropdown="O_W_ind_SNTS>//label[@id='CGE-CGE_cmbSinOWInd_label']";
		public static String Voyage="Voyage>//input[@id='CGE-CGE_txtSinVoyage']";
		//			public static String Supplier_Contract="Supplier_Contract>//input[@id='CGE-CGE_txtSinSupplierCont']";
		public static String ol_textfield="ol_textfield>//input[@id='CGE-CGE_txtSinCargoWt_input']";
		public static String polSearchfield="polSearchfield>//input[@id='CGE-CGE_txtSinPOL_input']";
		//			public static String Release_Ref_no="Release_Ref_no>//input[@id='CGE-CGE_txtSinRelRefNo']";
		public static String tare ="tare>//input[@id='CGE-CGE_txtSinTare_input']";
		public static String shipper_Seal="Shipper_Seal>//input[@id='CGE-CGE_txtSinSeal1']";
		public static String remarksTextfield="remarksTextfield>//input[@id='CGE-CGE_txtSinRemarks']";
		public static String service = "service>//input[@id='CGE-CGE_txtSinService']";
		public static String Bound ="Bound>//input[@id='CGE-CGE_txtSinBound']";
		public static String Lessor1="Lessor>//input[@id='CGE-CGE_txtSinCompany']";
		public static String carrier_Seal ="carrier_Seal>//input[@id='CGE-CGE_txtSinSeal']";
		public static String ow_textfield ="ow_textfield>//input[@id='CGE-CGE_txtSinOW_input']";
		public static String podSearchfield ="podSearchfield>//input[@id='CGE-CGE_txtSinPOD_input']";
		//			public static String Gross_Weight="Gross_Weight>//input[@id='CGE-CGE_txtSinGrossWt_input']";
		public static String imo_Textfield="imo_Textfield>//input[@id='CGE-CGE_txtSinIMO']";
		public static String haulageTextfield="haulageTextfield>//input[@id='CGE-CGE_txtSinHaulage']";
		public static String haulierTextfield="haulierTextfield>//input[@id='CGE-CGE_txtSinHaulier']";
		public static String vessel="vessel>//input[@id='CGE-CGE_txtSinVslCode']";
		public static String oh_SNTS ="O/H>//input[@id='CGE-CGE_txtSinOH_input']";
		public static String por_Searchfield ="por_Searchfield>//input[@id='CGE-CGE_txtSinPOR_input']";
		public static String destSearchfield = "destSearchfield>//input[@id='CGE-CGE_txtSinFinalDest_input']";
		public static String OW_amount_SNTS="OW_amount_SNTS>//input[@id='CGE-CGE_txtSinOWAmt_input']";
		public static String payload_SNTS="payload_SNTS>//input[@id='CGE-CGE_txtSinPayLoad_input']";
		public static String Ref_Number_SNTS ="Ref_Number_SNTS>//input[@id='CGE-CGE_txtRefnoSin']";
		public static String thirtyTon_SNTS="30ton>//label[@id='CGE-CGE_cmbSin24T_label']";
		public static String subLeaseRefNo_Textfield="subLeaseRefNo_Textfield>//input[@id='CGE-CGE_txtSinSubLeaseRefNo']";
		public static String transportMode_Dropdown="transportMode_Dropdown>//label[@id='CGE-CGE_cmbSinTransMode_label']";
		public static String condition_Dropdown="condition_Dropdown>//label[@id='CGE-CGE_cmbSinContCodition_label']";
}
