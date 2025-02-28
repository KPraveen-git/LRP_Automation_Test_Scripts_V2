package locators;

public interface Ems_Contract_Registration_Locators extends EMS_Gate_Locators {
	
	//sc11_I
		public static String contype_opt ="contype_opt>//ul//*[text()='%s']";
		public static String con_cat ="con_cat>//ul[@id='RMS-RMS_cmbContrCateg_items']//li[text()='%s']";
		public static String unitteu ="unitteu>//ul[contains(@id, 'RMS-RMS_cmbUnit') and contains(@id, '_items')]//li[text()='%s']";
		public static String currency_value = "currency_value>//ul[@id='RMS-RMS_cmbCur_items']//li[text()='%s']";
		public static String diallow_value ="diallow_value>//ul[@id='RMS-RMS_cmbDiall_items']//li[text()='%s']";
		public static String billpay_value ="billpay_value>//ul[@id='RMS-RMS_cmbpaymenttype_items']//li[text()='%s']";
		public static String sizevalue_option="sizevalue_option>(//*[text()='%s'])[2]";
		public static String lease_option="lease_option>(//*[text()='%s'])[2]";
		public static String DPPbasis_value = "DPPbasis_value>//ul[@id='RMS-RMS_cmbDppBasis_items']//li[text()='%s']";
	    public static String DPPlumpsum_value = "DPPlumpsum_value>//ul[@id='RMS-RMS_cmbDppLumpsum_items']//li[text()='%s']";
	    public static String DPPwaiver_value = "DPPwaiver_value>//ul[@id='RMS-RMS_cmbDppWaiver_items']//li[text()='%s']";
	    public static String combinevol_value ="combinevol_value//ul[@id='RMS-RMS_cmbCombVol_items']//li[text()='%s']";
	    public static String locationhier_field ="locationhier_field>//li[text()='%s']";
	    public static String location_data1 ="location_data>(//div[text()='%s'])[1]";
	    public static String sizevalue_field ="sizevalue_field>//div[@id='RMS-RMS_cmbHierEqp_panel']//li[text()='%s']";
	    
	    public static String Select_Value="Select_Value>//div[@id='nfr_sch_tw_pnl_content']//div[@ref='eCenterContainer']//div[@row-index='0']";
		public static String search_field = "search_field >(//div[@ref='eFloatingFilterInput']//input)[1]";
		public static String Container_valueTf = "Container_valueTf>(//thead[@id='RMS-RMS_treePickup_head']//following::input)[5]";
		public static String PickupActual_DropOff_Quantity = "PickupActual_DropOff_Quantity>(//tbody[@id='RMS-RMS_treePicupdrop_data']//td)[7]";

	    
	    //sc12_I
	    public static String Activity_Date="Activity_Date>//input[@id='CGE-CGE_txtMulActivityDate_input']";
	    public static String LeaseKind_Value = "LeaseKind_Value>(//li[text()='%s'])"; 
	   public static String Onhi_Ofhi_select="Onhi_Ofhi_select>(//div[@id='CGE-CGE_txtMulActivity_panel']//td)[1]"; 
	    public static String Location_select="Location_select>(//div[@id='CGE-CGE_txtSinLocation2_panel']//tr)[2]"; 
	    public static String Depot_select="Depot_select>(//div[@id='CGE-CGE_txtSinDepot_panel']//tr)[2]";
	    public static String Size_type_select="Size_type_select>//div[@id='CGE-CGE_cmbSinSpec_panel']//ul[@id='CGE-CGE_cmbSinSpec_items']";
	    public static String Movement_Entry_Popup="Movement_Entry_Popup>(//h2[text()='Movement Entry']//following::span)[2]";
	    
	   //sc18_I
	    String contype_opt1 = "contype_opt>((//*[text()='%s'])[2])";
	    
	    //SC19_I
	    String location_data = "location_data>((//div[text()='%s'])[1])";
	    String depreciation_option="depreciation_option>(//li[text()='%s'])";
	    //sc20_I
	    String location_Data = "location_data>((//div[text()='%s'])[1])";
	    
		public static String Esave_button = "Esave_button >//*[@id='RMS-RMS_tblsvm-btnsave']";
		public static String Econtractno_field = "Econtractno_field >//*[@id='RMS-RMS_txtContractno']";
		public static String Econtracttype_field = "Econtracttype_field >(//label[@id='RMS-RMS_cmbContractType_label']/following::span)[1]";
		public static String Eleasekind_searchicon = "Eleasekind_searchicon >//*[@id='RMS-RMS_btnLsKind']";
		public static String Eleasekind_selectvalue = "Eleasekind_selectvalue >//*[text()='MASTER LEASE AGREEMENTT']";
		public static String Eleasekind_selectbutton = "Eleasekind_selectbutton>(//span[text()='Select'])[1]";
		public static String Elessorcode_searchicon = "Elessorcode_searchicon>//*[@id='RMS-RMS_btnLessor']";
		public static String Elessorcode_searchbar = "Elessorcode_searchbar >(//span[text()='Lessor Code']//following::input)[2]";
		public static String Elessorcode_searchvalue = "lessorcode_searchvalue >//*[text()='THE CHINA NAVIGATION CO. PTE LTD.']";
		public static String Elessee_searchicon = "Elessorcode_searchvalue >//*[@id='RMS-RMS_btnlesse']";
		public static String Elessee_searchbar = "Elessee_searchbar >(//span[text()='Lessee Code ']//following::input)[2]";
		public static String Elesseecode_searchvalue = "Elesseecode_searchvalue>//*[text()='SVM SHIPPING']";
		public static String Evaild_from = "Evaild_from>//*[@id='RMS-RMS_txtValidFrm_input']";
		public static String Eclick_fromdate = "Eclick_fromdate >//*[text()='1']";
		public static String Evaild_to = "Evaild_to >//*[@id='RMS-RMS_txtvalidTo_input']";
		public static String Eclick_todate = "Eclick_todate >//a[text()='15']";
		public static String Esizeandtype_tab = "Esizeandtype_tab >//a[text()='Size/Type']";
		public static String Esizeandtype_Field = "Esizeandtype_Field >//*[@id='RMS-RMS_cmbEqp_label']";
		public static String Esizeandtype_Field1 = "Esizeandtype_Field1 >(//div[@id='RMS-RMS_cmbEqp_panel']//following::li[@data-label='40DC'])[1]";
		public static String contract_types = "contract_types>//ul[@id='RMS-RMS_cmbContractType_items']";
		public static String Eleasechargetype_Field = "Eleasechargetype_Field >//*[@id='RMS-RMS_cmbLeasechType_label']";
		public static String sizeandtype_Value = "sizeandtype_Value >//li[text()='20DC']";
		public static String leasechargetype_Value = "leasechargetype_Value >(//*[text()='N - No banding'])[2]";
		public static String Eperdiem_field = "Eperdiem_field >//*[@id='RMS-RMS_txtPerdiem_input']";
		public static String Esizeaddbutton = "Esizeaddbutton>//button[@id='RMS-RMS_btnEqpAdd']";
		public static String Etermandcharges = "Etermandcharges >//*[text()='Terms and Charges']";
		public static String ELocationhierarchy_field = "ELocationhierarchy_field >//*[@id='RMS-RMS_cmbHierarchy_label']";
		public static String Elocationaddbutton = "Elocationaddbutton >//*[@id='RMS-RMS_btnPortAdd']";
		public static String Elocationsearchtab = "Elocationsearchtab >(//*[text()='Ports Code ']//following::input)[3]";
		public static String Eclicklocation_checkbox = "Eclicklocation_checkbox >//*[text()='SGSIN']";
		public static String Elocation_selectbutton = "Elocation_selectbutton >(//span[text()='Select'])[2]";
		public static String Etermchange_size = "Etermchange_size >//*[@id='RMS-RMS_cmbHierEqp_label']";
		public static String Etermchange_addbutton = "Etermchange_addbutton >(//span[text()='ADD'])[2]";
		public static String Edepreciationtab = "Edepreciationtab >//*[text()='Depreciation']";
		public static String Edepreciation_Type = "Edepreciation_Type >//*[@id='RMS-RMS_cmbDeprType_label']";
		public static String Edepreciationsave_button = "Edepreciationsave_button >//*[@id='RMS-RMS_tblsvm-btnsave']";
		public static String Edepreciationedit_button = "Edepreciationedit_button >//*[@id='RMS-RMS_tblsvm-btnTblEdit']";
		public static String Esuccessfully_popup = "Esuccessfully_popup>//*[text()='EMS Contract Registration saved']";
		public static String logout_button = "logout_button >//*[@id='nfr_topbar_logout']";
		public static String logout_yesbutton = "logout_yes_button >//*[@id='nfr_logout_cnf_form-nfr_logout_cnf_yes']";
		public static String singleEdit_2 = "singleEdit_2>//div[contains(@style,'display: block;')]//child::a[@id='CGE-CGE_jMnuEdit']"; // changed
		public static String sizetypeDropdownoption = "sizetypeDropdownoption>//*[@id='RMS-RMS_cmbEqp_label']";
		public static String Dropdown = "Dropdown>//label[@id='RMS-RMS_cmbContractType_label']";
		public static String leasetypeDropdownoption = "leasetypeDropdownoption>//*[@id='RMS-RMS_cmbLeasechType_label']";
		public static String locationDropdownoption ="locationDropdownoption>//*[@id='RMS-RMS_cmbHierarchy_label']";
		public static String termsizetypeDropdownoption ="termsizetypeDropdownoption>//label[@id='RMS-RMS_cmbHierEqp_label']";
		public static String depreciationtypeDropdownoption ="depreciationtypeDropdownoption>//*[@id='RMS-RMS_cmbDeprType_label']";
		// TC_EMS_Contract_Registration_TS002
		public static String locationDropdownoption2 ="locationDropdownoption2>//*[@id='SUM-SUM_cmbselection_label']";
		public static String monthly_utilized_summary = "monthly_utilized_summary>//tbody[@id='RMS-RMS_treeAlocation_data']//tr[1]";
		public static String scrollSizeType = "scrollSizeType>//div[@id='RMS-RMS_cmbEqp_panel']/div[@style='max-height:200px']";
		public static String search_icon = "search_icon >//*[@id='RMS-RMS_tblsvm-btnTblJdlgSearch']";
		public static String search_contractfield = "search_contractfield >//*[@id='txt_name1']";
		public static String search_button = "search_button >//*[text()='SEARCH']";
		public static String search_selecticon = "search_selecticon >(//span[text()='Select'])[3]";
		public static String contractno_refreshbutton = "contractno_refreshbutton >//*[@id='RMS-RMS_btnrefresh']";
		public static String edit_button = "edit_button >//*[@id='RMS-RMS_tblsvm-btnTblEdit']";
		public static String contractupdated_popup = "contractupdated_popup >//*[text()='EMS Contract Registration Updated']";
		public static String sizeadd_button = "sizeadd_button >(//span[text()='Add'])[1]";
		public static String size_typeerror_msg = "size_typeerror_msg>//*[text()='The Sz./Tp 20DC already exists']";
		public static String click_sizedetail = "click_sizedetail >//*[@id='RMS-RMS_treeEqp_data']";
		public static String click_removebutton = "click_removebutton >(//span[text()='Remove'])[1]";
		public static String click_yesbutton = "click_yesbutton >//button[text()='Yes']";
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
		public static String contract_age = "contract_age>//input[@id='RMS-RMS_txtAge']";
		public static String contractcate = "contractcate>//div[@id='RMS-RMS_cmbContrCateg']";
		public static String service_searchicon = "service_searchicon>//div[@id='RMS-RMS_btnService-RMS_btnService']";
		public static String trade_searchicon = "trade_searchicon>//button[@id='RMS-RMS_btnTrade']";
		public static String effective_date = "effective_date>//input[@id='RMS-RMS_txtEffDate_input']";
		public static String remarks = "remarks>//*[@id='RMS-RMS_txtRemarks']";
		public static String lessor_ref = "lessor_ref>//input[@id='RMS-RMS_txtLessorRef']";
		public static String valid_prefix_addicon = "valid_prefix_addicon>//button[@id='RMS-RMS_btnValidprfAdd']";
		public static String valid_prefix_select = "valid_prefix_select>//button[@id='multicol_okbtn']";
		public static String oneway = "oneway>(//div[@id='RMS-RMS_chkOneWay']//div)[2]";
		public static String purchase = "purchase>(//div[@id='RMS-RMS_chkPurchase']//div)[2]";
		public static String dropoff = "dropoff>(//div[contains(@id,'RMS-RMS_optHierDropVolRestr')]//div)[2]";
		public static String unit_teu = "unit_teu>(//div[contains(@id,'RMS-RMS_cmbUnit')])[1]";
		public static String buildup_period = "buildup_period>//input[@id='RMS-RMS_txtBuildUp']";
		public static String builddown_period = "builddown_period>//input[@id='RMS-RMS_txtBuildDown']";
		public static String min_period = "min_period>//input[@id='RMS-RMS_txtMinPeriod']";
		public static String difee = "difee>//input[@id='RMS-RMS_txtDiFee_input']";
		public static String offhire = "offhire>//input[contains(@id,'RMS-RMS_txtPercent')]";
		public static String currency1 = "currency>//div[@id='RMS-RMS_cmbCur']";
		public static String di_allow = "di_allow>//div[@id='RMS-RMS_cmbDiall']";
		public static String bill_paytype = "bill_paytype>//div[@id='RMS-RMS_cmbpaymenttype']";
	
		public static String buildup_perdiem = "buildup_perdiem>//input[@id='RMS-RMS_txtSizeBuildUp_input']";
		public static String DPP_basis = "DPP_basis>//div[@id='RMS-RMS_cmbDppBasis']";
		public static String DPP_lumpsum = "DPP_lumpsum>//div[@id='RMS-RMS_cmbDppLumpsum']";
		public static String freedays = "freedays>//input[@id='RMS-RMS_txtFreeDays']";
		public static String builddown_perdiem = "builddown_perdiem>//input[@id='RMS-RMS_txtSizeBuildDown_input']";
		public static String DPP_waiver = "DPP_waiver>//div[@id='RMS-RMS_cmbDppWaiver']";
		public static String spl_perdiem = "spl_perdiem>//input[@id='RMS-RMS_txtsplperdiem_input']";
		public static String DPP_amount = "DPP_amount>//input[@id='RMS-RMS_txtDppWaiverAmt_input']";
		public static String monthly_amount = "monthly_amount>//input[@id='RMS-RMS_txtmonthlyamount_input']";
		public static String pickup_quantity = "pickup_quantity>//input[@id='RMS-RMS_txtPickUp']";
		public static String rep_value = "rep_value>//input[@id='RMS-RMS_txtrepValue_input']";
		public static String DPP = "rep_value>//input[@id='RMS-RMS_txtDpp_input']";
		public static String combine_vol = "rep_value>//div[@id='RMS-RMS_cmbCombVol']";
		public static String combinevolbtn = "combinevolbtn>//button[@id='RMS-RMS_btncombinedVol']";
		public static String combinevol_addbtn = "combinevol_addbtn>//button[@id='JdlgCombinedContractform-RMS_btnContractAdd']";
		public static String combinevol_selbtn = "combinevol_selbtn>//button[@id='multicol_okbtn']";
		public static String combinevol_okbtn = "combinevol_okbtn>//button[contains(@id,'JdlgCombinedContractform-RMS_btnOk')]";
		public static String pretrip_ins_charge = "rep_value>//input[@id='RMS-RMS_txtPreInsp_input']";
		public static String posttrip_ins_charge = "rep_value>//input[@id='RMS-RMS_txtPostInsp_input']";
		public static String post_builddown_perdiem = "builddown_perdiem>//input[@id='RMS-RMS_txtPostBuildDownPerd_input']";
		public static String extent_cover = "extent_cover>//input[@id='RMS-RMS_txtExtOfCover_input']";
		public static String add_tierbtn = "add_tierbtn>//button[@id='RMS-RMS_btnTier']";
	
		public static String tc_pickup = "tc_pickup>//input[@id='RMS-RMS_txtHierpickQty']";
		public static String tc_pickup_handling = "tc_pickup_handling>//input[@id='RMS-RMS_txtHierHandlCharge_input']";
		public static String tc_dropoff_credit = "tc_dropoff_credit>//input[@id='RMS-RMS_txtDropofcrd_input']";
		public static String tc_dropoff_month = "tc_dropoff_month>//input[@id='RMS-RMS_txtDropofpermonth']";
		public static String tc_pickupcharges = "tc_pickupcharges>//input[@id='RMS-RMS_txtHierPickUpCharge_input']";
		public static String tc_dropoff = "tc_dropoff>//input[@id='RMS-RMS_txtHierDropQty']";
		public static String tc_dropoff_handling = "tc_dropoff_handling>//input[@id='RMS-RMS_txtDropOffHandlCharge_input']";
		public static String tc_dropoffcharges_radio = "tc_dropoffcharges_radio>(//div[@id='RMS-RMS_optHierDropChTier']//div)[2]";
		public static String tc_condtdropoff_radio = "tc_condtdropoff_radio>(//div[@id='RMS-RMS_optCondDropCharge']//div)[2]";
		public static String tc_pickup_credit = "tc_pickup_credit>//input[@id='RMS-RMS_txtPickupcrd_input']";
		public static String tc_dropoffcharges = "tc_dropoffcharges>//input[@id='RMS-RMS_txthierDropCharge_input']";
		public static String tc_penalty = "tc_penalty>//div[@id='RMS-RMS_cmbRedelivPen']";
		public static String tc_penalty_value = "tc_penalty_value>//*[@id='RMS-RMS_txtHierRedelivPen_input']";
		public static String close_tab = "close_tab >(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
		public static String dep_kind = "dep_kind>//div[@id='RMS-RMS_cmbDeprkind']";
		public static String dep_rate = "dep_rate>//input[@id='RMS-RMS_txtDeprRate_input']";
		public static String dep_min = "dep_min>//input[@id='RMS-RMS_txtMinReplValue_input']";
		public static String dep_max = "dep_max>//input[@id='RMS-RMS_txtMaxreplValue_input']";
		public static String dep_min_checkbox = "dep_max>//div[@id='RMS-RMS_chkMinResidual']//span";
		public static String dep_mincheckbox_field = "dep_max>//input[@id='RMS-RMS_txtResidualVal_input']";
		public static String dep_percent = "dep_percent>//div[@id='RMS-RMS_cmbDeprPercent']";
		public static String Month_Select = "Month_Select>//div[@id='ui-datepicker-div']//select[@aria-label='select month']";
		public static String Edi_file_TF = "Edi_file_TF>//input[@aria-label='Edi File Filter Input']";
		public static String Edi_Value = "Edi_Value>(//div[@aria-colindex='2'])[2]";
		public static String Edi_Select = "Edi_Select>//button[@id='multicol_okbtn']";
	//	public static String Error_Grid = " Error_Grid>(//div[@row-index='0'])[1]//div[@aria-colindex='3']";
		public static String Error_SelectBtn = "Error_SelectBtn>//button[text()='Close']";
		public static String Re_Process_Btn = "Re_Process_Btn>//button[@id='EER-EER_btnReProcess']";
		public static String clear_btn = "clear_btn>//button[@id='EER-EER_btnClears']";
		public static String emsgate_Todate_field = "emsgate_Todate_field>//input[@id='EGT-EGT_txtTo_input']";
		public static String Error_Data_grid = "Error_Data_grid>(//div[text()='Completed With Errors'])[1]";
		public static String PopupYes_Btn = "PopupYes_Btn>//button[text()='Yes']";
		public static String Month_Year_filter = "Month_Year_filter>(//input[contains(@id,'RMS-RMS_treeAlocation')])[1]";
		public static String Actual_dropOff="Actual_dropOff>(//tbody[@id='RMS-RMS_treePicupdrop_data']//td)[7]";
	
		public static String Status_TF="Status_TF>//input[@aria-label='Status Filter Input']";
		public static String EDI_File_Data="EDI_File_Data>((//div[@row-index='0'])[2]//following::div[@aria-colindex='2'])[1]";
		public static String selected_sizetype_remove_popup_D="selected sizetype_remove>(//h2[text()='EMS Contract Registration']//following::span)[2]";
		public static String Location_Value="Location_Value>//div[@id='RMS-RMS_lstPorts']//li";
	
		public static String Contract_Type_Dropdown = "Contract_Type_Dropdown>//label[@id='RMS-RMS_cmbContractType_label";
		public static String SizeType_Dropdown = "SizeType_Dropdown>//*[@id='RMS-RMS_cmbEqp_label']";
		public static String Location_Dropdown_Select = "Location_Dropdown_Select>//*[@id='RMS-RMS_cmbHierarchy_label']";
		public static String Term_size_Dropdown = "Term_size_Dropdown>//label[@id='RMS-RMS_cmbHierEqp_label']";
		public static String Depot_SelectBtn="Depot_SelectBtn>//button[@id='nfr-twocol-select-button']";
		
		public static String service_searchicon36 = "service_searchicon36>//button[@id='LSR-LSR_btnService']";
		public static String lessee_searchicon36 = "lessee_searchicon36>//button[@id='LSR-LSR_btnLessee']";
		public static String lessor_searchicon36 = "lessor_searchicon36>//button[@id='LSR-LSR_btnLessor']";
		public static String service_searchfield = "service_searchfield>//input[@aria-label='Service Code Filter Input']";
		public static String lessor_searchfield = "lessor_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
		public static String lessee_searchfield = "lessee_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
		public static String lessee_Searchfield = "lessee_Searchfield>//input[@id='CGE-CGE_txtSinLessee']";
		public static String pickup_dropoff_tab = "pickup dropoff tab>//a[text()='Pick up And Drop Off Details']";
		public static String location_filter16 = "location filter>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[2]";;
		public static String sizetype_filter16 = "sizetype_filter>(//thead[@id='RMS-RMS_treePicupdrop_head']//following::input)[3]";
		public static String pickup_dropoff_detail = "pickup_dropoff_detail>//tbody[@id='RMS-RMS_treePicupdrop_data']//td[1]";
		public static String dropoff_count1 = "drpoff quantity>//tbody[@id='RMS-RMS_treePicupdrop_data']//td[7]";
		public static String locationDropdownoption4 = "locationDropdownoption4>//label[@id='LSR-LSR_cbxLocaHire_label']";
		public static String dropoff_count_MUS = "dropoff_count_MUS>(//tfoot[@id='RMS-RMS_treeAlocation_foot']//td)[2]";
		public static String monthly_utilized_summary1="monthly_utilized_summary1>//tbody[@id='RMS-RMS_treeAlocation_data']";
		public static String selected_sizetype_remove_popup_1="selected selected_sizetype_remove_popup_1>(//h2[text()='EMS Contract Registration']//following::span)[2]";
		public static String DropOff_Quantity="DropOff_Quantity>(//div[text()='Drop off Container Details']//following::th[@aria-label='Equipment No.']//following::input)[1]";
		public static String container_equipno = "container_equipno>//tbody[@id='RMS-RMS_treeDropoff_data']//td[4]";

		public static String Date_PopUP = "Date_PopUP>//span[text()='EMS Contract Registration']/following-sibling::p";
		public static String Ems_Savebtn = "Ems_Savebtn>//button[@id='RMS-RMS_tblsvm-btnsave']";
		public static String size_exceed_popup = "size_exceed popup>//div[@id='lrp_cust_growl_container']//p[text()='The cumulative Pick Up Quantity for the locations assigned for the Sz./Tp exceeds the pick up quantity assigned for the Sz./Tp']";
		public static String sizetype_pickup_quantity_D = "sizetype pickup quantity>//input[@id='RMS-RMS_txtPickUp']";
		public static String termcharge_pckup_quantity_D = "termcharge_pckup_quantity_D>//input[@id='RMS-RMS_txtHierpickQty']";
		public static String termcharge_savebtn = "save btn>//div[@id='RMS-RMS_tblsvm-tblComponent']//button[@id='RMS-RMS_tblsvm-btnsave']";
		public static String depreciation_opt_D = "depreciation_opt>//ul[@id='RMS-RMS_cmbDeprType_items']//li[@data-label='Straight Line']";
		public static String selected_sizetype_remove_yes_D = "selected_sizetype_remove_yes>//button[text()='Yes']";
		public static String grid_data_D = "grid data>//tbody[@id='RMS-RMS_treeEqp_data']";
		public static String remove_btn_D = "remove_btn>//button[@id='RMS-RMS_btnEqpRem']";
		public static String close_Tab = "close_Tab>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";

		
		
		// TC_EMS_Contract_Registration_TS003

		public static String search_contract = "search_contract >(//div[@id='nfr-jdlgGrid-div']//div[@role='gridcell' and @aria-colindex='1'])[1]";
		public static String delete_icon = "delete_icon >//button[@id='RMS-RMS_tblsvm-btnTblDelete']";
		public static String delete_confirm_message = "delete_confirm_message >//*[text()=' Do you want to delete the EMS Contract Registration?']";
		public static String deleted_message = "deleted_message >//*[text()='EMS Contract Registration deleted']";
		public static String cannot_deleted_message = "cannot_deleted_message >//*[text()='Cannot be deleted. This Contract No is used in Movement Entry']";
		public static String Contract_value = "Contract_value >//*[@id='RMS-RMS_txtContractno']";
		public static String search_contract1 = "search_contract1 >(//label[@id='nfr_sch_jd_header']/following::div[@col-id='C1'])[2]";
		public static String Contract_no = "Contract_no >//input[@id='RMS-RMS_txtContractno']";
		public static String locationDropdownoption6 = "locationDropdownoption6>//*[@id='ETR-ETR_cmbEf_label']";
		public static String Sizeandtype_Dropdownoption = "Sizeandtype_Dropdownoption>//*[@id='SBS-SBS_cmbsize_label']";
		public static String locationDropdownoption7 = "locationDropdownoption7>//*[@id='ETR-ETR_cmbEf_label']";
		public static String SizeandtypeDropdownoption1 = "SizeandtypeDropdownoption1>//*[@id='ETR-ETR_cmbSizeType_label']";
		public static String location_Dropdownoption4 = "location_Dropdownoption4>//*[@id='SBS-SBS_cmbselection_label']";
		public static String SizeandtypeDropdownoption = "SizeandtypeDropdownoption>//*[@id='ETR-ETR_cmbSizeType_label']";
		
		
		
		

			// TC_036

			public static String country_searchicon36 = "country_searchicon>//button[@id='LSR-LSR_btnArea']";
			public static String countrycode_field36 = "countrycode_field>//span[text()='Country Code ']//following::input[2]";

			public static String countrycode36 = "countrycode>//input[@aria-label='Country Code  Filter Input']";
			public static String location_dropdown37 = "location_dropdown>//*[@id='LSR-LSR_cbxLocaHire_label']";
			public static String fromdate36 = "fromdate36>//input[@id='LSR-LSR_frmDP_input']";
			public static String todate36 = "todate36>//input[@id='LSR-LSR_toDP_input']";
			public static String locationDropdownoption36 ="locationDropdownoption4>//*[@id='LSR-LSR_cbxLocaHire_label']";
			public static String close_Report42= "close_Report42>//div[@id='SBS_JdlgCntrList']//a[@aria-label='Close']";
			// new
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
			public static String lessorcontract_searchicon36 = "lessorcontract_searchicon36>//button[@id='LSR-LSR_btnContract']";
			public static String lessorcontract_searchfield = "lessorcontract_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
			public static String lessorcontract_selectbtn = "lessorcontract_selectbtn>//button[@id='multicol_okbtn']";
			public static String activity_selectbtn = "activity_selectbtn>//button[@id='multicol_okbtn']";
			public static String leasekind_field = "leasekind_field>//div[@id='LSR-LSR_cbxLKind']";
			public static String activity_addicon = "activity_addicon>//button[@id='LSR-LSR_btnActcode']";
			public static String activity_minusicon = "activity_minusicon>//button[@id='LSR-LSR_btnRemAct']";
			public static String activity_searchfield = "activity_searchfield>(//div[@ref='eFloatingFilterInput']//input)[1]";
			public static String detail_requestbtn = "detail_requestbtn>//button[@id='LSR-LSR_detailRqstDialog-DCP_CmdBtn']";

			public static String penalty ="penalty>//ul[@id='RMS-RMS_cmbRedelivPen_items']//li[text()='%s']";
			public static String depkind ="depkind>//ul[@id='RMS-RMS_cmbDeprkind_items']//li[text()='%s']";
			public static String depercent = "depercent>//ul[@id='RMS-RMS_cmbDeprPercent_items']//li[text()='%s']";

		//from arun locator file
			

			//36
			public static	String condt_input ="condt_input>//ul[@id='LSR-LSR_cbxCond_items']//li[text()='%s']";
			public static	String reportype_input ="reportype_input>//ul[@id='LSR-LSR_cbxRptType_items']//li[text()='%s']";
			public static	String leasekind_input ="leasekind_input>//ul[@id='LSR-LSR_cbxLKind_items']//li[text()='%s']";
			public static	String sz_tp_btn ="sz_tp_btn>//span[text()='%s']";
			public static	String sum_det_btn ="sum_det_btn>//span[text()='%s']";
			public static	String location_hierarchy_type ="location_hierarchy_type>//ul[@id='LSR-LSR_cbxLocaHire_items']//li[text()='%s']";
			public static String grid_data = "grid_data>//*[@col-id='serno' and text()='%s']";		

			//37
			// TS_037

			public static String detail_btn = "detail_btn>//*[text()='Detail']";
			public static String request_sent = "request_sent>//*[text()='Report request sent']";
			public static String select_month1 = "select_month1>//option[text()='Jan']";
			public static String download_btn = "download_btn>//*[@id='LSR-LSR_detailRqstDialog-DCP_CmdBtn']";
			public static String process = "process>//*[text()='Processed']";
			public static String process_no = "process_no>//*[@id='LSR-LSR_detailRqstDialog-DCPDialogform-DCP_DataTable-0-dcpRqstId']";
			public static String location_hierarchy_type1 ="location_hierarchy_type1>//ul[@id='LSR-LSR_cbxLocaHire_items']//li[text()='%s']";

		//38
			
			public static	String location_hierarchy_type2 = "location_hierarchy_type2>//ul[@id='SUM-SUM_cmbselection_items']//li[text()='%s']";
			public static	String EF_input="EF_input>//li[@data-label='%s']";
			public static	String grid_Check38="grid_Check38>(//div[@col-id='H1'])[%s]";
			public static	String size_Type ="size_Type>(//div[@col-id='H1'])[%s]";
			public static	String total_Records38="total_Records38>//label[@id='SUM-SUM_vsltable_records_lbl_cnt']";

		//39
			public static	String dropdown_folder = "dropdown_folder>(//*[text()='%s'])[1]//preceding::span[2]";
			public static String dropdown1_folder = "dropdown1_folder>//*[text()='%s']";
			public static String folder="folder>(//*[text()='%s'])[1]//preceding::span[2]";
			public static String	grid_Check="grid_Check>//td[text()='%s']";
			public static String location_hierarchy_type39="location_hierarchy_type39>//ul[@id='SSP-SSP_cmbselection_items']//li[text()='%s']";
			public static String location_Drpdwn_Label="location_Drpdwn_Label>//label[@id='SSP-SSP_cmbselection_label']";
		
		//42
			
			public static String grid_location="grid_location>(//div[text()='%s']//following::div[text()='%s' and @col-id='H3'])[1]";
			public static String grid_Location42_Check="grid_Location42_Check>(//td[text()='%s'])[2]";
			public static String location_hierarchy_type42 = "location_hierarchy_type>//ul[@id='SBS-SBS_cmbselection_items']//li[text()='%s']";
			public static String sizetype_type42 = "sizetype_type>//ul[@id='SBS-SBS_cmbsize_items']//li[text()='%s']";
			public static String grid_Check42="grid_Check42>(//div[@col-id='H1'])[%s]";
			//ul[@id='SBS-SBS_cmbselection_items']//li[.='Country']
			public static String total_Records42="total_Records42>//label[@id='SBS-SBS_vsltable_records_lbl_cnt']";
			// TC_036

			public static String onoff_modulename = "onoff_modulename>(//*[text()='On / Off Hire Activities Report'])[2]";
			public static String location_dropdown = "location_dropdown>//*[text()='Location Hierarchy']//following::span[1]";
//			public static String location_valuedropdown = "location_valuedropdown>//li[text()='Region']";
			public static String country_searchicon = "country_searchicon>//button[@id='LSR-LSR_btnArea']";
			public static String countrycode_field = "countrycode_field>//span[text()='Country Code ']//following::input[2]";
			public static String countrycode_value = "countrycode_value>(//div[@col-id='C1'])[2]";
			public static String countrycode_select = "countrycode_select>(//span[text()='Select'])[1]";
			public static String fromdate = "fromdate>//*[@id='LSR-LSR_frmDP_input']";
			public static String fetch_fromdates = "fetch_fromdates>//a[text()='1']";
			public static String add_sizetype = "add_sizetype>//*[@id='LSR-LSR_btnSizeType']";
//			public static String sizetype_value = "sizetype_value>//*[text()='20DC']";
			public static String sizetype_select = "sizetype_select>(//span[text()='Select'])[2]";
			public static String sizetype_search = "sizetype_search>//*[text()='Equipment Type ']//following::input[2]";
			public static String gridvalue = "gridvalue>(//div[@col-id='20DC'])[2]";
			public static String countrycode_select_btn = "countrycode_select_btn>(//span[text()='Select'])[1]";

			// TS_0	public static String lessor_add_icon = "lessor_add_icon>//button[@id='ETR-ETR_btnlessAdd']";
			public static String lessor_inp_field = "lessor_inp_field>//input[@aria-label='Lessor Code Filter Input']";
			public static String lessor_value = "lessor_value>(//div[@col-id='C1'])[2]";
			public static String lessee_add_icon = "lessee_value>//button[@id='ETR-ETR_btnlesseeAdd']";
			public static String lessee_inp_field = "lessee_inp_field>//input[@aria-label='Lessee Code Filter Input']";
			public static String lessee_value = "lessee_value>(//div[@col-id='C1'])[2]";
			public static String leasekind_add_icon = "leasekind_value>//button[@id='ETR-ETR_btnleaAdd']";
			public static String close_report40 = "close_report>//div[@id='ETR_Jdlcntrlist']//a[@aria-label='Close']";

		  	//changed one
		  	
			public static String term_detail = "term_detail>(//*[@col-id='H1'])[2]";
			//public static String Econtracttype_field = "Econtracttype_field >(//label[@id='RMS-RMS_cmbContractType_label']/following::span)[1]";



			// EMS integration
			public static String contractno_error_popup_D = "contractno_error_popup>//div[@id='nfr_pwdexpmsg_container']//p[text()='The Contract No. TUE-11 already exists']";
			public static String contract_type_D = "contract type>//div[@id='RMS-RMS_cmbContractType']"; // label[@id='RMS-RMS_cmbContractType_label']";
			public static String contract_type_select_D = "contract type select>//div[@id='RMS-RMS_cmbContractType']/div/span";
			public static String contract_type_opt_D = "contract type opt>//li[@data-label='D-OPERATIONAL LEASE']";
			public static String enter_contractno_popup = "enter contractno popup>//div[@id='lrp_cust_growl_container']//p[text()='Enter the Contract No.']";
			public static String enter_contracttype_popup_D = "enter contract type>//div[@id='lrp_cust_growl_container']//p[text()='Select the Contract Type']";
			public static String contracttype_no_opt_D = "contract type no option>//ul[@id='RMS-RMS_cmbContractType_items']//li[@data-label='&nbsp;']";
			public static String select_sizetyep_popup_D = "select sizetype popup>//div[@id='lrp_cust_growl_container']//p[text()='Select the Sz./Tp']";
			public static String close_module_D = "close module>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
			public static String select_leasetype_popup_D = "select leasetype>//div[@id='lrp_cust_growl_container']//p[text()='Select the Lease Charge Type']";
			public static String perdiem_popup_D = "perdiem popup>//span[text()=' Do you want to Proceed with perdiem 0.0']";
			public static String sizetype_exist_popup_D = "sizetype_exist>//div[@id='lrp_cust_growl_container']//p[text()='The Sz./Tp 20DC already exists']";
			public static String yes_btn_D = "yes_btn>//button[text()='Yes']";
			public static String remove_popup_D = "remove popup>//span[text()=' Are you sure you want to remove?']";
			public static String remove_popup_yes_D = "yes_btn remove popup>//button[text()='No']/following-sibling::button";
			public static String grid_D = "grid>(//div[@id='RMS-RMS_treeEqp']//table[@role='grid'])[2]";
			public static String locationhierarchy_opt_D = "location hierarchy opt>//li[@data-label='All Region']";
			public static String sizetype_opt_D = "sizetype_opt>//ul[@id='RMS-RMS_cmbEqp_items']//li[text()='20DC']";
			public static String leasechargetype_opt_D = "leasecharge type opt>//ul[@id='RMS-RMS_cmbLeasechType_items']//li[@data-label='N - No banding']";



			public static String CloseButton_M = "Equipment_Activity_CloseButton>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
			public static String closeOption = "closeOption>(//*[@id='nfr_tab_dashboard_title']//following::i)[3]";
			public static String closeSymbols = "closeSymbols>(//span[@id='CCH-CCH_detailRqstDialog-DCP_customDetailRequestDialog_title']//following::span)[1]";
			public static String dashboard_Title = "dashboard_Title>//*[@id='nfr_tab_dashboard_title']";
			public static String module3 = "module3>(//label[text()='Current / History Report '])[1]";
			public static String module4 = "module4>(//label[text()='Current / History Report '])[1]";

			// eme
			public static String module5 = "module5>//label[@id='mdl2_tablbl']";
			public static String module6 = "module6>(//label[text()='Equipment Activity'])[1]";
			public static String Module3 = "Module3>//label[@id='mdl2_tablbl']";
			public static String Newbuttonscalein1 = "Newbuttonscalein>(//form[@id='EDB']//following::button)[1]";

			public static String Global_MovementCode_TF = "Global_MovementCode_TF>//input[@id='txt_name2']";


			public static String FirstTab_Value = "Emsmodule_Value>(//li[contains(@id,'tabli') and not(contains(@class,'closed'))])[1]";
			public static String Secondtab_Value = "Movemententry_Value>(//li[contains(@id,'tabli') and not(contains(@class,'closed'))])[2]";

			//ems_con_reg_006
				
				public static  String sizevalue_opt ="sizevalue_opt>(//*[text()='%s'])[2]";
				public static	String leasevalue_opt="leasevalue_opt>(//*[text()='%s'])[2]";


				//008
				
				public static String sizevalue_opt1="sizevalue_opt>(//li[text()='%s'])[2]";
				public static String leasevalue_opt1="leasevalue_opt>(//*[text()='%s'])[2]";
				 
				
				//010
				
				public static 	String locationhier1_value="locationhier_value>//li[text()='%s']";

				//ems001
				
				public static 	String Autopanel_First_Click="Autopanel_First_Click>//div[@id='nfr_sch_tw_pnl_content']//div[@ref='eCenterContainer']//div[@row-index='0']";
				
				
				public static 	String Autopanel_First_Click36="Autopanel_First_Click36>//div[@id='nfr-multi-div']//div[@ref='eCenterContainer']//div[@row-index='0']";

				//newly shifted fromems locators
				
				public static String To_Date_new = "To_Date>//input[@id='LSR-LSR_toDP_input']";

				//sc11_I
				  //sc18_I
				    
				    public static String Current_History_Report="Current_History_Report>//li[@data-item-label='Current / History Report ']";


					public static String Error_Grid = " Error_Grid>(//div[@row-index='0'])[2]//div[@aria-colindex='3']";
		
		
		
}
