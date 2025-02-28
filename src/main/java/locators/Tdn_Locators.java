package locators;

public interface Tdn_Locators {

	public static String remove_Button_TDN = "remove_Button_TDN>//button[contains(@id,'TDN_btnRemoveContainer')]";
	public static String master_Tab_Table_Row_TDN = "master_Tab_Table_Row_TDN>//div[contains(@id,'TDN_containerTreeTable_tbl')]//div[@row-index='0']";
	public static String local_Cust_Field = "local_Cust_Field>//input[contains(@id,'TDN_txtLocalCust')]";
	public static String with_Chassis_Check_Box = "customerTab_Row>//div[contains(@id,'TDN_chkWithChassis')]//div[2]";
	public static String Chassis_Pickup_Loc_Label="Container_Select>//table[contains(@id,'TDN_pgLegDetils')]//label[contains(@id,'TDN_cmbChassPickup_label')]";
	public static String Chassis_Drop_Loc_Label="Chassis_Drop_Loc_Label>//table[contains(@id,'TDN_pgLegDetils')]//label[contains(@id,'TDN_cmbChassisDrop_label')]";
	public static String Chassis_Pickup_Loc_Search="Chassis_Pickup_Loc_Search>//table[contains(@id,'TDN_pgLegDetils')]//button[contains(@id,'TDN_btnChassisPickup')]"; 
	public static String Chassis_Drop_Loc_Search="Chassis_Drop_Loc_Search>//table[contains(@id,'TDN_pgLegDetils')]//button[contains(@id,'TDN_btnChassisDrop')]"; 
	public static String With_Chassis_Mode="With_Chassis_Mode>//table[contains(@id,'TDN_pgLegDetils')]//div[contains(@id,'TDN_btnGrpCustomer')]//span[text()='%s']";
	public static String pickup_Location_Dropdown_TDN = "pickup_Location_Dropdown_TDN>//div[@id='JDlgTDNLegDetilsform-TDN_cmbPickup']";
	public static String cust_Depot_Term_Dropdown_TDN = "cust_Depot_Term_Dropdown_TDN>//div[@id='JDlgTDNLegDetilsform-TDN_cmbCustLocation']";
	public static String return_Location_Dropdown_TDN = "return_Location_Dropdown_TDN>//div[@id='JDlgTDNLegDetilsform-TDN_cmbRtn']";
	public static String load_Status_Dropdown_TDN = "load_Status_Dropdown_TDN>//div[@id='JDlgTDNLegDetilsform-TDN_cmbLoadStatus']";
	public static String loadStatus_TDN = "loadStatus_TDN>//div[@id='JDlgTDNLegDetilsform-TDN_cmbLoadStatus']";
	public static String retrieved_PluginID = "retrieved_PluginID>//div[@ref='eCenterContainer']//following::div[@col-id='column2' and @role='gridcell']";
	public static String legTable_Container_Gridcell = "legTable_Container_Gridcell>//div[@id='TDN-TDN_jTabbedPane1-TDN_legTreeTable_tbl']//div[@col-id='containerNo' and @role='gridcell']";
	public static String plugin_row_Click="plugin_row_Click>//div[@ref='eBodyViewport']//preceding::div[@row-index='0']";
	public String return_date_label_leg = "return_date_label_leg>//form[@id='JDlgTDNLegDetilsform']//label[.='Return Date']";

	public static String TDN_Popup_Msg ="TDN_Popup_Msg>//h2//following-sibling::span[2]";
	public static String Vendor_code_Tf="Vendor_code_Tf>//input[@id='txt_name1']";
	public static String TDN_Yes_Button = "TDN_Yes_Button>//h2//following::button[text()='Yes']";
	public static String TDN_No_Button = "TDN_No_Button>//h2//following::button[text()='No']";
	public static String Vendor_Details_search_Button="Vendor_Details_search_Button>//button[@id='myBtn']";

	public static String Vendor_code_Input="Vendor_code_Input>//input[@aria-label='Vendor code Filter Input']";
	public static String Vendor_name_Input="Vendor_name_Input>//input[@aria-label='Vendor name Filter Input']";
	public static String Vendor_City_Input="Vendor_City_Input>//input[@aria-label='City Filter Input']";
	public static String Vendor_details_SelectButton="Vendor_details_SelectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String Trans_Type_Mode_Dropdown="Trans_Type_Mode_Dropdown>//label[@id='JDlgTDNLegDetilsform-TDN_cmbTransmode2_label']";
	public static String Container_Leg_Details_Add_Button="Container_Leg_Details_Add_Button>//button[@id='JDlgTDNLegDetilsform-TDN_btnok']";
	public static String booking_savebtn="booking_save_btn>//*[@id='BKG-tbl-btnsave']";

	public static String Provisional_check_box = "Provisional_check_box >//div[@id='TDN-TDN_chkprovisional']//div[2]";
	public static String Draft_check_box = "Draft_check_box >//div[@id='TDN-TDN_chkdraft']//div[2]";
	public static String Confirmed_check_box = "Confirmed_check_box >(//div[@id='TDN-TDN_chkConfirmed']//following::div)[1]";
	public static String Cancelled_check_box = "Cancelled_check_box >(//div[@id='TDN-TDN_chkCancelled']//following::div)[1]";
	public static String Shipment_type_select = "Shipment_type_select >//label[@id='TDN-TDN_cmbExImWo_label']";
	public static String TDN_Num = "TDN_Num >//input[@id='TDN-TDN_jTxtrefno']";
	
	public static String shipment_Dropdown = "shipment_Dropdown>//label[@id='TDN-TDN_cmbExImWo_label']";
	public static String Customer_Add_Button = "Customer_Add_Button>//button[contains(@id,'TDN_btnAddCust')]";
	public static String tdn_SaveButton = "tdn_SaveButton>//button[@id='TDN-tbl-btnsave']";

	public static String Transportation_dispatch_Updated="Transportation_dispatch_Updated>//span[text()='Transportation Dispatch Notice updated']";
	public static String TDN_Customer_Tab = "TDN_Customer_Tab>//a[text()='Customer']";
	public static String TDN_Charges_Tab = "TDN_Charges_Tab>//div[contains(@id,'TDN_fragtab')]//a[text()='Charges']";
	public static String TDN_Overhead_Charges_Tab = "TDN_Overhead_Charges_Tab>//div[contains(@id,'TDN_fragtab')]//a[text()='Overhead Charges']";
	public static String TDN_Remarks_Tab = "TDN_Remarks_Tab>//div[contains(@id,'TDN_fragtab')]//a[text()='Remarks']";
	public static String yesbtn = "yesbtn>//button[text()='Yes']";
	public static String Select_ModeOfTransport="Select_ModeOfTransport>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbmode_items']//following::li[text()='%s']";

	public static String Select_Booking_DD = "Select_Booking_DD>//label[contains(@id,'TDN_jComboCustBooking_label')]";
	public static String Select_Booking_all = "Select_Booking_all>//div[contains(@id,'TDN_jListContainer')]//li[text()='ALL']";
	public static String Add_ware_house = "Add_ware_house>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnWareHouse']";
	public static String Add_ware_house_Gird = "Add_ware_house_Gird>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnAddCust']";
	public static String mode_of_Trans = "mode_of_Trans>(//label[@id='TDN-TDN_jTabbedPane1-TDN_jCmbCustMode_label']//following::span)[1]";
	public static String Date_click = "Date_click>//label[text()='App Date']//following::span[1]";
	public static String TDN_Bookin_Remarks_Tab = "TDN_Bookin_Remarks_Tab>//div[contains(@id,'TDN_fragtab')]//a[text()='Booking Remarks']";
	public static String Month_DD = "Month_DD>//select[@aria-label='select month']";
	public static String Year_DD = "Year_DD>//select[@aria-label='select year']";
	public static String hour_DD = "hour_DD>//select[@data-unit='hour']";
	public static String select_all = "select_all>(//input[@aria-label='Toggle Selection of All Rows'])[1]";
	public static String load_servicecode="load_servicecode>//input[@id='LCC-LCC_txtService']";	
	public static String tdnPopup_Ok = "tdnPopup_Ok>//h2//following::button[text()='Ok']";
	public static String Ok = "Ok>//button[text()='Yes']";
	public static String Mode_of_Trans = "Mode_of_Trans>//label[@id='TDN-TDN_jTabbedPane1-TDN_jCmbCustMode_label']";
	public static String BL_Add = "BL_Add >//button[@id='TDN-TDN_jTabbedPane1-TDN_btnAddBk']";
	public static String contract_click1="contract_click1>(//li[text()='%s'])[2]";
	public static String trans_select="trans_select>//ul[@id='TDN-TDN_jTabbedPane1-TDN_jCmbCustMode_items']//li[text()='%s']";
	public static String contract_click="contract_click>(//div[text()='%s'])[1]";
	public static String addleg_select="addleg_select>//span[text()='Select All']";
	public static String new_btn ="new_btn>//button[@id='TDN-tbl-btnTblNew']";
	public static String add_legbtn ="add_legbtn>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnAdd']";
	public static String modeof_transport ="add_legbtn>//label[@id='JDlgTDNLegDetilsform-TDN_cmbmode_label']";
	public static String vendor_searchicon ="vendor_searchicon>//button[@id='JDlgTDNLegDetilsform-TDN_btntransname2']";

	public static String modeof_transport_type ="modeof_transport_type>//label[@id='JDlgTDNLegDetilsform-TDN_cmbTransmode2_label']";
	public static String return_date="return_date>//input[@id='JDlgTDNLegDetilsform-TDN_smdpRtn_input']";
	public static String Vender_Code_value="Vender_Code_value>//div[text()='%s']";
	public static String Select_ModeOfTransport_type="Select_ModeOfTransport>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbmode_items']//following::li[text()='%s']";

	public static String vendor_Code ="vendor_Code>//input[@id='txt_name1']";
	public static String vendor_Code_searchicon ="vendor_Code_searchicon>//button[@id='myBtn']";
	public static String vendor_Code_addbtn ="vendor_Code_addbtn>//button[@id='JDlgTDNLegDetilsform-TDN_btnok']";
	public static String vendor_Code_closebtn ="vendor_Code_closebtn>(//span[@id='TDN_JDlgLegDetils_title']//following::a)[1]";
	public static String container_already_selected ="container_already_selected>//span[text()='Selected Container is already operationally planned']";
	public static String TDN_grid_edit ="TDN_grid_edit>((//div[@id='TDN-TDN_jTabbedPane1-TDN_legTreeTable_tbl']//following::span)[2]//following::button)[1]";
	public static String container_details_editbtn ="container_details_editbtn>//button[@id='JDlgTDNLegDetilsform-TDN_btnok']";
	public static String Customer_Deport_Termina_locationchange ="Customer_Deport_Termina_locationchange>//button[@id='JDlgTDNLegDetilsform-TDN_btnCustLocation']";
	public static String Terminalcode_select ="Terminalcode_select>//button[@id='nfr-twocol-select-button']";
	public static String Transportation_dispatch_saved ="Transportation_dispatch_saved>//span[text()='Transportation Dispatch Notice saved']";
	public static String Terminalcode_search ="Terminalcode_search>//input[@aria-label='Terminal Code Filter Input']";
	public static String loadconfirmation_closebtn ="loadconfirmation_closebtn>(//span[@id='LCC_EditorPaneMsgImportTM_title']//following::a[@aria-label='Close'])[1]";
	public static String TDN_master_tab ="TDN_master_tab>(//a[text()='Master'])[1]";
	public static String get_modetype ="get_modetype>(//div[@col-id='mode'])[2]";
	public static String TDN_ref_scroll ="TDN_ref_scroll>(//div[@ref='eBodyHorizontalScrollViewport'])[2]";
	public static String TDN_Master_Tab = "TDN_Master_Tab>//div[contains(@id,'TDN_fragtab')]//a[text()='Master']";
	public static String cust_Depot_Term_Label = "cust_Depot_Term_Label>//label[@id='JDlgTDNLegDetilsform-TDN_cmbCustLocation_label']";
	public static String cust_Depot_Term_Options = "cust_Depot_Term_Options>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbCustLocation_items']//li[.='%s']";
	public static String return_location_label = "return_location_label>//label[@id='JDlgTDNLegDetilsform-TDN_cmbRtn_label']";
	public static String return_location_options = "return_location_options>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbRtn_items']//li[.='%s']";
	public static String pickupdate_leg = "pickupdate_leg>//input[@id='JDlgTDNLegDetilsform-TDN_smdpPickup_input']";
	public static String return_date_leg = "return_date_leg>//input[@id='JDlgTDNLegDetilsform-TDN_smdpRtn_input']";
	public static String pickup_loc_label = "pickup_loc_label>//label[@id='JDlgTDNLegDetilsform-TDN_cmbPickup_label']";
	public static String pickup_loc_search_icon = "pickup_loc_search_icon>//table[contains(@id,'TDN_pgLegDetils')]//button[contains(@id,'TDN_btnpickup')]";
	public static String cust_depo_term_search_icon = "cust_depo_term_search_icon>//button[@id='JDlgTDNLegDetilsform-TDN_btnCustLocation']";
	public static String load_status ="load_status>//label[@id='JDlgTDNLegDetilsform-TDN_cmbLoadStatus_label']";
	public static String return_location_searchbar ="return_location_searchbar>(//div[@id='nfr-twocolsearch-div']//following::input)[3]";
	public static String return_location_searchicon ="return_location_searchicon>//button[@id='JDlgTDNLegDetilsform-TDN_btnreturn']";
	public static String location_Filter ="location_Filter>//input[contains(@aria-label,'Location Code Filter Input')]";
	public static String Select_Option ="Select_Option>//div[@id='nfr_sch_twocolumn']//div[@ref='eCenterViewport']//div[@role='row' and @row-index='0']";
	public static String all_Cntnr_Slct="all_Cntnr_Slct>(//input[contains(@class,'ag-input-field-input') and @type='checkbox'])[1]";
	public static String truck_Option="truck_Option>//li[@id='JDlgTDNLegDetilsform-TDN_cmbmode_2' and text()='Truck']";
	public static String pickup_Only_Option="pickup_Only_Option>//li[@id='JDlgTDNLegDetilsform-TDN_cmbTransmode2_1' and text()='Pickup Only']";
	public static String rail_Only_Option="rail_Only_Option>//li[@id='JDlgTDNLegDetilsform-TDN_cmbTransmode2_1' and text()='Rail']";
	public static String container_Leg_Add_Btn="container_Leg_Add_Btn>//button[@id='JDlgTDNLegDetilsform-TDN_btnok']";
	public static String return_Date_Field="return_Date>//input[contains(@id,'JDlgTDNLegDetilsform-TDN_smdpRtn_input')]";
	public static String x_Option="x_Option>//span[contains(text(),'Container Leg Details')]/..//a";
	public static String	ok_Btn_Tdn_Haulage="ok_Btn_Tdn_Haulage>//button[text()='Ok']";
	public static String tdnpopup="tdnpopup>//h2[text()='Transportation Dispatch Notice(Haulage)']";
	public static String draft_Checkbox_Status_Check = "draft_Checkbox_Status_Check>//div[@id='TDN-TDN_chkdraft']//span/parent::div";
	public static String shipmenttype_select="shipment_type>//li[text()='%s']";
	public static String container_Select="container_Select>//div[contains(@id,'TDN_legTreeTable_tbl')]//div[@row-index]//div[@col-id='containerNo' and text()='%s']";

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
