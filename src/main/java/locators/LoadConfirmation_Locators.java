package locators;

public interface LoadConfirmation_Locators extends Tdn_Locators{


	public static String Username_input = "UserName>//input[@id='nfr_login_authname']";
	public static String Password_input = "Password>//input[@id='nfr_login_authid']";
	public static String Login = "Login>//*[@id='nfr_login_btnlogin']";
	public static String Home_Logo = "Home_Logo>//*[@id='nfr_topbar_user_detail_link']";
	public static String Search_Input = "Search_Input>//*[@aria-autocomplete='listbox']";
	public static String P_homePage = "Home_page >//*[@id='ui-id-1']";
	public static String Switch_Profile = "Switch_Profile>//a[@id='nfr_topbar_switchprofile_link']";
	public static String select_Agency="select_Agency>//tbody[@id='SWP-SWP_datatable_data']/child::tr[@data-ri='0']";
	public static String Switch_Profile_Button = "Switch_Profile_Button>//button[@id='SWP-SWP_btnSwitchProfile']";
	public static String agency_Code_Filter="agency_Code_Filter>//label[.='Filter by Code']/following-sibling::input[contains(@id,'SWP-SWP_datatable')]";		
	public static String search_click = "search_click >//li[@data-item-label='Transportation Dispatch Notice(Haulage)']";
	public static String Provisional_check_box = "Provisional_check_box >//div[@id='TDN-TDN_chkprovisional']//div[2]";
	public static String Draft_check_box = "Draft_check_box >//div[@id='TDN-TDN_chkdraft']//div[2]";
	public static String Confirmed_check_box = "Confirmed_check_box >(//div[@id='TDN-TDN_chkConfirmed']//following::div)[1]";
	public static String Cancelled_check_box = "Cancelled_check_box >(//div[@id='TDN-TDN_chkCancelled']//following::div)[1]";
	public static String Shipment_type_select = "Shipment_type_select >//label[@id='TDN-TDN_cmbExImWo_label']";
	public static String TDN_Num = "TDN_Num >//input[@id='TDN-TDN_jTxtrefno']";
	public static String BL_Add = "BL_Add >//button[@id='TDN-TDN_jTabbedPane1-TDN_btnAddBk']";
	public static String Aselectbutton1 = "selectbutton1>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String containsclick = "containsclick>//select[@id='var_condition1']";
	public static String New_click = "New_click>//span[text()=' Do you want to create a new Transportation Dispatch Notice?']//following::button[2]";
	public static String Asearchinput = "searchinput>//input[@id='txt_name1']";
	public static String Asearchclickbtn = "searchclickbtn>//button[@id='myBtn']";
	public static String Booknumselect = "Booknumselect>//select[@id='type']";
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
	public static String search_First_Click="search_First_Click>//div[@id='nfr_topbar_autocomp_panel']//li[1]";


	public static String Transportation_dispatch_saved1 ="Transportation_dispatch_saved1>//span[text()='Transportation Dispatch Notice saved']";

	public static String minute_DD = "minute_DD>//select[@data-unit='minute']";

	public static String activity_date="activity_date>//input[@id='LCC-LCC_txtActDate_input']";
	public static String discharge_activity_date="discharge_activity_date>//input[@id='DCO-DCO_txtActDate_input']";

	public static String load_status ="load_status>//label[@id='JDlgTDNLegDetilsform-TDN_cmbLoadStatus_label']";
	public static String return_location_searchbar ="return_location_searchbar>(//div[@id='nfr-twocolsearch-div']//following::input)[3]";
	public static String return_location_searchicon ="return_location_searchicon>//button[@id='JDlgTDNLegDetilsform-TDN_btnreturn']";
	public static String location_Filter ="location_Filter>//input[contains(@aria-label,'Location Code Filter Input')]";
	public static String Select_Option ="Select_Option>//div[@id='nfr_sch_twocolumn']//div[@ref='eCenterViewport']//div[@role='row' and @row-index='0']";

	public static String addleg_select="addleg_select>//span[text()='Select All']";

	public static String service_Searchfield="service_Searchfield>//input[@id='LCC-LCC_txtService']";
	public static String VoyageInput="VoyageInput>//input[@aria-label='Voyage Filter Input']";
	public static String Boundinpiut="Boundinpiut>//input[@aria-label='Bound Filter Input']";
	public static String vessel_Input="vessel_Input>//input[@aria-label='Vessel code Filter Input']";
	public static String portCode_Inputfield="portCode_Inputfield>//input[@aria-label='Port Code Filter Input']";
	public static String terminalCode_Inputfield="terminalCode_Inputfield>//input[@aria-label='Terminal Code ~ GroupCallid Filter Input']";
	public static String select_Service="select_Service>//div[@role='gridcell' and@col-id='C2']";
	public static String show_Button="show_Button>//button[@id='LCC-LCC_btnShow']";
	public static String bookingnumber="bookingnumber>(//span[text()='Book No'])[1]//following::input[1]";
	public static String selectall="selectall>//button[@id='LCC-LCC_btnselectall']";
	public static String loadconfirmation="loadconfirmation>(//span[text()='Discharge Confirmation'])[4]//following::p[1]";
	public static String loadconfirmationpopup="loadconfirmationpopup>//h2[text()='Load Confirmation']//following::span[2]";
	public static String container_no="container_no>(//tbody[@id='LCC-LCC_treeDAR1_data']//input)[1]";

	public static String container_no_discharge="container_no>//tbody[@id='DCO-DCO_treeDAR1_data']//input[1]";





	public static String actual_containerno_1="actual_containerno_1>//*[@id='LCC-LCC_treeDAR_data']//tr[1]//td[7]";
	public static String actual_containerno_2="actual_containerno_2>//*[@id='LCC-LCC_treeDAR_data']//tr[2]//td[7]";
	public static String actual_containerno_3="actual_containerno_3>//*[@id='LCC-LCC_treeDAR_data']//tr[3]//td[7]";
	public static String dischargeload_servicecode="dischargeload_servicecode>//input[@id='DCO-DCO_txtservice']";		
	public static String dischargevessel_Input="dischargevessel_Input>//input[@aria-label=' Vessel Code Filter Input']";
	public static String dischargevesselname_Input="dischargevesselname_Input>//input[@aria-label=' Vessel Name Filter Input']";
	public static String discharge_VoyageInput="discharge_VoyageInput>//input[@aria-label=' Voyage Filter Input']";
	public static String dischare_Boundinput="dischare_Boundinput>//input[@aria-label=' Bound Filter Input']";

	public static String dischargeportCode_Inputfield="dischargeportCode_Inputfield>//input[@aria-label=' Discharge Port Filter Input']";
	public static String discharge_terminalCode_Inputfield="discharge_terminalCode_Inputfield>//input[@aria-label=' Discharge Terminal Filter Input']";
	public static String dischargeshow_Button="dischargeshow_Button>//button[@id='DCO-DCO_btnShow']";
	public static String dischargeselectall="dischargeselectall>(//input[@id='DCO-DCO_treeDAR-DCO_chkAllSelect'])[1]";
	public static String dischargeconfirmation_btn="dischargeconfirmation_btn>//button[@id='DCO-DCO_btnLoadConfirmation']";
	public static String dischargeconfirmation_popup="dischargeconfirmation_popup>//*[text()='Discharge is confirmed.']";
	public static String match_button="match_button>//button[@id='LCC-LCC_btnMatch']";
	public static String discharge_bookingnumber="discharge_bookingnumber>(//span[text()='Book No'])[2]//following::input[1]";
	public static String match_button_DC="match_button>//button[@id='DCO-DCO_btnMatch']";
	public static String importexcel="importexcel>//button[@id='LCC-LCC_btnImpFmExcel-LCC_btnImpFmExcel']";
	public static String selectexcelfile="selectexcelfile>//input[@id='xlForm-nfr_importxl_fileupload_input']";
	public static String selectsheetname="selectsheetname>//label[@id='xlForm-nfr_importxl_tabviewAuto-0-importxlSheet_label']";
	public static String loadsheet="loadsheet>//button[@id='xlForm-nfr_importxl_tabviewAuto-0-importxl_load_excel']";
	public static String importexcel_yesbtn="importexcel_yesbtn>//button[@id='nfr_importxl_automap_yes']";
	public static String excelupload_button="excelupload_button>//button[@id='xlForm-importxl_upload']";
	public static String assignbutton="assignbutton>//button[@id='LCC-LCC_btnMatch']";
	public static String exportbutton="exportbutton>//button[@id='LCC-tbl-btnTblDynExport']";
	public static String close_button="close_button>//span[@id='LCC_EditorPaneMsgImportTM_title']//following::a[1]";
	public static String import_template="import_template>//input[@id='LCC-LCC_btnImpFmTmplate_input']";
	public static String AssigningBtn="AssigningBtn>//input[contains(@id,'LCC-LCC_buttonGroup')]//following::span[text()='Assigning']";
	public static String DischargeConfirmation_Tab="DischargeConfirmation_Tab>//a[@role='presentation']/child::label[.='Discharge Confirmation']";
	//
	public static String service_Searchfield_Discharge="service_Searchfield>//input[@id='DCO-DCO_txtservice']";
	public static String vessel_Input_Discharge="vessel_Input_Discharge>//input[@aria-label=' Vessel Code Filter Input']";
	public static String VoyageInput_Discharge="VoyageInput_Discharge>//input[@aria-label=' Voyage Filter Input']";
	public static String Boundinpiut_Discharge="Boundinpiut_Discharge>//input[@aria-label=' Bound Filter Input']";
	public static String terminalCode_Inputfield_Discharge ="terminalCode_Inputfield_Discharge>//input[@aria-label=' Discharge Terminal Filter Input']";
	public static String portCode_Inputfield_Discharge ="portCode_Inputfield_Discharge>//input[@aria-label=' Discharge Port Filter Input']";
	public static String select_Service_Discharge ="select_Service_Discharge>//button[@id='nfr_favsch_selectbtn']";
	public static String show_Button_Discharge ="show_Button_Discharge>//button[@id='DCO-DCO_btnShow']";
	public static String container_no_Discharge ="container_no_Discharge>//input[@id='DCO-DCO_treeDAR1-0-DCO_addRow']";
	public static String match_button_Discharge ="match_button>//button[@id='DCO-DCO_btnMatch']";
	public static String Dischargeconfirmation="Dischargeconfirmation>//button[@id='DCO-DCO_btnLoadConfirmation']";
	public static String Book_number_btn = "Book_number_btn>//input[@value='Book No']//following::span[1]";
	public static String shipment_Dropdown = "shipment_Dropdown>//label[@id='TDN-TDN_cmbExImWo_label']";
	public static String Customer_Add_Button = "Customer_Add_Button>//button[contains(@id,'TDN_btnAddCust')]";
	public static String tdn_SaveButton = "tdn_SaveButton>//button[@id='TDN-tbl-btnsave']";

	public static String Transportation_dispatch_Updated="Transportation_dispatch_Updated>//span[text()='Transportation Dispatch Notice updated']";
	public static String TDN_Customer_Tab = "TDN_Customer_Tab>//a[text()='Customer']";
	public static String TDN_Charges_Tab = "TDN_Charges_Tab>//div[contains(@id,'TDN_fragtab')]//a[text()='Charges']";
	public static String TDN_Overhead_Charges_Tab = "TDN_Overhead_Charges_Tab>//div[contains(@id,'TDN_fragtab')]//a[text()='Overhead Charges']";
	public static String TDN_Remarks_Tab = "TDN_Remarks_Tab>//div[contains(@id,'TDN_fragtab')]//a[text()='Remarks']";
	public static String yesbtn = "yesbtn>//button[text()='Yes']";


	//17

	public static String new_btn ="new_btn>//button[@id='TDN-tbl-btnTblNew']";
	public static String add_legbtn ="add_legbtn>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnAdd']";
	public static String modeof_transport ="add_legbtn>//label[@id='JDlgTDNLegDetilsform-TDN_cmbmode_label']";
	public static String vendor_searchicon ="vendor_searchicon>//button[@id='JDlgTDNLegDetilsform-TDN_btntransname2']";

	public static String modeof_transport_type ="modeof_transport_type>//label[@id='JDlgTDNLegDetilsform-TDN_cmbTransmode2_label']";
	public static String return_date="return_date>//input[@id='JDlgTDNLegDetilsform-TDN_smdpRtn_input']";

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
	public static String home_Page = "Home_page >//*[@id='ui-id-1']";
	public static String APassword_input = "Password_input>//input[@id='nfr_login_authid']";
	public static String ALogin="Login>//*[@id='nfr_login_btnlogin']";
	public static String AHome_Logo="Home_Logo>//*[@id='nfr_topbar_user_detail_link']";

	public static String type_Of_User="type_Of_User>(//div[@class='topbar-user-details']//child::span)[1]";
	public static String Module_SearchB = "Module_SearchB>//*[@id='nfr_topbar_autocomp_input']";
	public static String Booking_click ="Booking_click >//li[@data-item-label='Booking']";
	public static String loadConfirmation_Tab="loadConfirmation_Tab>//a[@role='presentation']/child::label[.='Load Confirmation']";
	public static String bookingNo_filter="bookingNo_filter>//label[.='Filter by Book No']/following-sibling::input[contains(@id,'LCC-LCC_treeDAR')]";
	public static String actualContainerNo_filter="actualContainerNo_filter>//label[.='Filter by Actual Container No']/following-sibling::input[contains(@id,'LCC-LCC_treeDAR')]";
	public static String select_Checkbox="select_Checkbox>//input[contains(@id,'LCC_chkSelect')]";
	public static String gridBookingNo="gridBookingNo>(//input[contains(@id,'LCC_chkSelect')]/following::td[@role='gridcell'])[4]";
	public static String firstRow_loadConfirmGrid="firstRow_loadConfirmGrid>//tbody[@id='LCC-LCC_treeDAR_data']/tr[@data-ri='0']";
	public static String actualContainerNo_Editable="actualContainerNo_Editable>//td[@class='ui-editable-column']";
	public static String actualContainerNo_Inputfield="actualContainerNo_Inputfield>//input[contains(@id,'modelInput')]";
	public static String actualContainerNo_Inputfield2="actualContainerNo_Inputfield2>//div[@class='ui-cell-editor-input']";
	public static String loadConfirmation_Button="loadConfirmation_Button>//button[@id='LCC-LCC_btnLoadConfirmation']";
	public static String loadConfirmation_Popup="loadConfirmation_Popup>(//h2[.='Load Confirmation']/following::span)[2]";
	public static String loadConfirmation_Popup_Ok="loadConfirmation_Popup_Ok>(//h2[.='Load Confirmation']/following::button[.='Ok'])";
	public static String activityDate_LoadConfirm="activityDate_LoadConfirm>//input[@id='LCC-LCC_txtActDate_input']";
	public static String selectrouting="selectrouting>(//span[contains(@id,'star')]//following::div)[1]";
	public static String selectrouting1="selectrouting>(//div[@col-id='C2'])[2]";
	public static String schedule_routing_popup="schedule_routing_popup>//span[text()='Schedule is not available as per Routing. Unable to create Booking Leg']";
	public static String global_Configuration_EditButton="global_Configuration_EditButton>//button[contains(@id,'btnTblEdit') and contains(@name,'GCN')]";
	public static String Booking_Id="Booking_Id>//input[@id='LCC-LCC_treeDAR-j_idt16468-filter']";
	public static String Non_Containerized="Non-Containerized>//input[@id='LCC-LCC_buttonGroup3unc-1']/following::span[text()='Non-Containerized']";
	public static String Checkbox_1="Checkbox_1>//input[@id='LCC-LCC_treeDAR-0-LCC_chkSelect']";
	public static String Load_Confirmation="Load_Confirmation>//button[@id='LCC-LCC_btnLoadConfirmation']";                                      //button[@id='LCC-LCC_btnLoadConfirmation']
	public static String Confirmation_popup="Confirmation_popup>//h2[text()='Load Confirmation']";
	public static String Shipment_type_input = "Shipment_type_input>//label[@id='BKG-BKG_cmbReworkShipment_label']";
	public static String AgrParty="AgrParty>//*[@id='BKG-BKG_jLabel137']";
	public static String AgrPartyInput="AgrPartyInput>//*[@id='BKG-BKG_txtAgrPartyName_input']";
	public static String Orgin="Orgin>//*[@id='BKG-BKG_jLabel1554']";
	public static String OrginInput="OrginInput>//*[@id='BKG-BKG_txtPOL111_input']";
	public static String Delivery="Delivery>//*[@id='BKG-BKG_jLabel1555']";
	public static String DeliveryInput="DeliveryInput>//*[@id='BKG-BKG_txtPOD111_input']";
	public static String RatedBtn="RatedBtn>//*[@id='BKG-BKG_cmbBooking_button']";
	public static String $Rates="$Rates>//*[@id='BKG-BKG_miRate']";
	public static String RaterefreshTap="$RaterefreshTap>//*[@id='BKG_JDlgRateMaster_title']";
	public static String Select_all="Select_all>//button[@id='LCC-LCC_btnselectall']";
	public static String VIN_Chassis_No="VIN_Chassis_No>(//span[text()='VIN/Chassis No'])[3]//following::input[2]";
	public static String Match="Match>//button[@id='LCC-LCC_btnMatch']";
	public static String Discharge_Confirmation="Discharge_Confirmation>//button[@id='DCO-DCO_btnLoadConfirmation']";
	public static String Discharge_Confirmation_Tab="Discharge_Confirmation_Tab>//a[@role='presentation']/child::label[.='Discharge Confirmation']";
	public static String Match1="Match1>//button[@id='DCO-DCO_btnMatch']";
	public static String service_Searchfield1="service_Searchfield1>//input[@id='DCO-DCO_txtservice']";
	public static String vessel_Input1="vessel_Input1>//input[@aria-label='Vessel Code Filter Input']";
	public static String VoyageInput1="VoyageInput1>//input[@aria-label=' Voyage Filter Input']";
	public static String Boundinpiut1="Boundinpiut1>//input[@aria-label=' Bound Filter Input']";
	public static String DischargePort_Inputfield="DischargePort_Inputfield>//input[@aria-label=' Discharge Port Filter Input']";
	public static String DischargeTerminalPort_Inputfield="DischargeTerminalPort_Inputfield>//input[@aria-label=' Discharge Terminal Filter Input']";
	public static String Discharge_Show_Button="Discharge_Show_Button>//button[@id='DCO-DCO_btnShow']";
	public static String Discharge_Booking_id="Discharge_Booking_id>//input[@id='DCO-DCO_treeDAR-j_idt52700-filter']";
	public static String Discharge_Checkbox="Discharge_Checkbox>//input[@id='DCO-DCO_treeDAR-0-DCC_chkSelect']";
	public static String Discharge_VIN_Chassis_No="Discharge_VIN_Chassis_No>//input[@id='DCO-DCO_treeDAR1-0-DCO_addRow']";
	public static String Matching_Color="Matching_Color>(//tbody[@id='LCC-LCC_treeDAR_data']//following::td)[2]";
	public static String Matching_Color1="Matching_Color>//tbody[@id='DCO-DCO_treeDAR_data']";
	public static String Make_As_Draft_Button="Make_As_Draft_Button>//button[@id='TDN-TDN_btnconfirm']";
	public static String Container_checkBox="Container_checkBox>//input[@aria-label='Toggle Row Selection']";
	public static String Mode_Of_transport_Dropdown="Mode_Of_transport_Dropdown>//div[@id='JDlgTDNLegDetilsform-TDN_cmbmode']";
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
	//		Plugin configuration
	public static String pluginConfiguration_Tab = "pluginConfiguration_Tab>//a[@role='presentation']/child::label[.='Plugin Configuration']";
	public static String moduleIdFilter_Searchbox = "moduleIdFilter_Searchbox>//input[@aria-label='Module ID Filter Input']";
	public static String pluginIdFilter_Searchbox = "pluginIdFilter_Searchbox>//input[@aria-label='Plugin ID Filter Input']";
	public static String first_PluginID_Row = "first_PluginID_Row>//div[@ref='eCenterContainer']//following::div[@col-id='column2']";
	public static String first_PluginID_Row1 = "first_PluginID_Row1>(//a[@role='presentation']/child::label[.='Plugin Configuration']/following::div[@ref='eCenterContainer']/following::div[@col-id='column2'])[2]";
	public static String pluginConf_Toolbar_Edit = "pluginConf_Toolbar_Edit>//button[@id='PGC-PGC_toolbar-btnTblEdit']";
	public static String condition_Dropdown = "condition_Dropdown>//label[@id='PGC-column4_label']";
	public static String condition_Input = "condition_Input>//select[@id='PGC-column4_input']";
	public static String true_Condition = "true_Condition>//li[@data-label='True']";
	public static String false_Condition = "false_Condition>//li[@data-label='False']";
	public static String plugin_Toolbar_Save = "plugin_Toolbar_Save>//button[@id='PGC-PGC_toolbar-btnsave']";
	public static String close_Second_Tab = "close_Second_Tab>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[2]";
	public static String pluginUpdated_Popup = "pluginUpdated_Popup>//span[@class='ui-growl-title']";
	public static String tdnPopup_Ok = "tdnPopup_Ok>//h2//following::button[text()='Ok']";
	public static String Ok = "Ok>//button[text()='Yes']";
	public static String Mode_of_Trans = "Mode_of_Trans>//label[@id='TDN-TDN_jTabbedPane1-TDN_jCmbCustMode_label']";
	public static String Confirmation_popup2="Confirmation_popup2>//span[text()='Select the Appointment Date']";
	public static String Ok1="Confirmation_popup2>//button[text()='Ok']";
	public static String Search2="Search2>//button[@id='TDN-tbl-btnTblDefaultSearch']";
	public static String select1="select1>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String Makeasdraft="Makeasdraft>//span[text()='Make As Draft']";
	public static String Vendor_Details="Vendor_Details>//button[@id='JDlgTDNLegDetilsform-TDN_btntransname2']";
	public static String addleg="addleg>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnAdd']";
	public static String Mode_of_Trans2="Mode_of_Trans2>//label[@id='JDlgTDNLegDetilsform-TDN_cmbmode_label']";
	public static String Trans_Type_Mode="Trans_Type_Mode>//label[@id='JDlgTDNLegDetilsform-TDN_cmbTransmode2_label']";
	public static String Leg_Add="Leg_Add>//button[@id='JDlgTDNLegDetilsform-TDN_btnok']";




	public static String agencyConfig_newButton = "agencyConfig_newButton>//button[contains(@id,'btnTblNew') and contains(@name,'ACG')]";
	public static String agencyConfig_Popup_Yes = "agencyConfig_Popup_Yes>//h2[text()='Agency Configuration']/following::button[.='Yes']";
	public static String agencyConfig_Popup_Ok = "agencyConfig_Popup_Ok>//h2[text()='Agency Configuration']/following::button[.='Ok']";
	public static String agencyConfig_Popup = "agencyConfig_Popup>(//h2[text()='Agency Configuration']/following::span)[2]";

	public static String agencySearch_Button = "agencySearch_Button>//button[@id='ACG-ACG_btnAgencysearch']";
	public static String agencyCode_Filter = "agencyCode_Filter>//input[@aria-label='Agency Code Filter Input']";
	public static String agencyConfig_Show_Button = "agencyConfig_Show_Button>//button[@id='ACG-ACG_btnShow']";
	public static String description_Grid_Filter = "description_Grid_Filter>//label[text()='Filter by Description']/following-sibling::input[contains(@id,'ACG-ACG_Grid') and contains(@name,'-filter')]";
	public static String value_Textfield = "value_Textfield>//input[@id='ACG-ACG_txtVal']";
	public static String plus_Button = "plus_Button>//button[@id='ACG-ACG_btnAddRecord']";
	public static String agencyConfiguration_Tab="agencyConfiguration_Tab>//a[@role='presentation']/child::label[.='Agency Configuration']";
	public static String resetProfile_Button="resetProfile_Button>//button[@id='SWP-SWP_btnResetProfile']";
	public static String vgm_Not_Verfied_Popup1="vgm_Not_Verfied_Popup>//label[@id='LCCDLG12-MFT_JDlgError_label1']";
	public static String close_Tab = "close_Tab>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";

	public static String vgm_Not_Verified_Ok_btn="vgm_Not_Verified_Ok_btn>//button[@id='LCCDLG12-LCC_Ok2']";
	public static String booking_Column_txtfld="booking_Column_txtfld>//input[@id='LCC-LCC_treeDAR-j_idt16468-filter']";
	public static String select_All_Btn="select_All_Btn>//span[text()='Select All']";
	public static String load_Cnfrm_Pop_Ok_Btn="load_Cnfrm_Pop_Ok_Btn>//span[text()='Load confirmed.']/..//nav//button";
	public static String error_validation="error_validation>//label[text()='VGM Not verified for below container(s).Could not proceed for Load confirmation']";
	//

	public static String load_Cnfrm_Pop_Ok_Button="load_Cnfrm_Pop_Ok_Button>(//h2[text()='Load Confirmation']//following::button)[1]";
	//
	public static String all_Cntnr_Slct="all_Cntnr_Slct>(//input[contains(@class,'ag-input-field-input') and @type='checkbox'])[1]";
	public static String truck_Option="truck_Option>//li[@id='JDlgTDNLegDetilsform-TDN_cmbmode_2' and text()='Truck']";
	public static String pickup_Only_Option="pickup_Only_Option>//li[@id='JDlgTDNLegDetilsform-TDN_cmbTransmode2_1' and text()='Pickup Only']";
	public static String rail_Only_Option="rail_Only_Option>//li[@id='JDlgTDNLegDetilsform-TDN_cmbTransmode2_1' and text()='Rail']";
	public static String container_Leg_Add_Btn="container_Leg_Add_Btn>//button[@id='JDlgTDNLegDetilsform-TDN_btnok']";
	public static String return_Date_Field="return_Date>//input[contains(@id,'JDlgTDNLegDetilsform-TDN_smdpRtn_input')]";
	public static String x_Option="x_Option>//span[contains(text(),'Container Leg Details')]/..//a";
	public static String	ok_Btn_Tdn_Haulage="ok_Btn_Tdn_Haulage>//button[text()='Ok']";
	public static String tdnpopup="tdnpopup>//h2[text()='Transportation Dispatch Notice(Haulage)']";

	public static String row_Confirm_Master="row_Confirm_Master>(//div[@class='ag-center-cols-container' and @role='rowgroup'])[1]";

	public static String edit_Icon_Toolbar="edit_Icon_Toolbar>//button[@id='TDN-tbl-btnTblEdit']";

	public static String remove_Leg_Option="remove_Leg_Option>//span[text()='Remove Leg']";

	public static String warn_Popup="warn_Popup>//span[text()='Legs are going to be removed permanently. Do you want to continue?']";
	public static String edit_Option_Cust_Tab="edit_Option_Cust_Tab>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnAddCust']//span[.='Edit']";
	public static String remove_Option="remove_Option>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnRemoveCust']//span[.='Remove']";



	public static String Ok_Btn="Ok_Btn>//button[@id='LCCDLG14-LCC_OkTY1']";

	public static String Add_leg_popup="Add_leg_popup>//span[text()='Add Leg details']";
	public static String click_ok="click_ok>//button[text()='Ok']";
	public static String TDN_Popup_Msg1="TDN_Popup_Msg1>//h2[text()='Transportation Dispatch Notice(Haulage)']//following::span[2]";
	public static String popup_ok="popup_ok>(//div[@class='ui-dialog-content ui-widget-content']//following::span[text()='Ok'])[8]";
	public static String Screen_Close="Screen_Close>//span[@id='TDN_JDlgLegDetils_title']//following::a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'][1]";
	public static String Auto_Rate="Auto_Rate>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnAutoTariff']";
	public static String Container="Container>(//input[@aria-label='Toggle Row Selection'])[1]";  
	public static String Charges="Charges>//div[contains(@id,'TDN_fragtab')]//a[text()='Charges']";
	public static String click_Elementforclose="click_Elementforclose>//input[@id='TDN-TDN_jTabbedPane1-TDN_txtcustref']";

	public static String Charges_SearchBtn="Charges_SearchBtn>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnChargeSearch']";
	public static String Select_Container="Select_Container>((//div[@class='ag-center-cols-container'])[3]//following::div[@role='gridcell'][1])[1]";
	public static String Charges_Code="Charges_Code>//input[@class='ag-input-field-input ag-text-field-input']//following::input[@aria-label='Charge Code Filter Input']";
	public static String Charges_Select="Charges_Select>//button[@id='nfr-twocol-select-button']";
	public static String Currency="Currency>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnCurrencySearch']";
	public static String Currency_Select="Currency_Select>//input[@class='ag-input-field-input ag-text-field-input']//following::input[@aria-label='Currency Code Filter Input']";
	public static String Base_Rate_Unit_Search="Base_Rate_Unit_Search>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnBaseRateUnit']";
	public static String Base_Rate_Unit_Select="Base_Rate_Unit_Select>//input[@class='ag-input-field-input ag-text-field-input']//following::input[@aria-label='Unit Code Filter Input']";
	public static String Equipment_Type="Equipment_Type>//label[@id='TDN-TDN_jTabbedPane1-TDN_cmbEquipmenttype_label']";
	public static String BaseRate="BaseRate>//input[@id='TDN-TDN_jTabbedPane1-TDN_txtChargeRate_input']";
	public static String add_autorate="add_autorate>(//span[text()='Add'])[1]";
	public static String TDN_Popup_Msg2="TDN_Popup_Msg2>//span[text()='Transportation Dispatch Notice updated']";
	public static String Reset="Reset>//button[@id='TDN-TDN_jTabbedPane1-TDN_btnResetCust']";
	public static String Reset_customer="Reset_customer>//span[text()='Reset Customer']";
	public static String warehoue_popup ="warehoue_popup>//span[text()='Enter the Warehouse Name']";
	public static String pickup_location_searchicon ="pickup_location_searchicon>//button[@id='JDlgTDNLegDetilsform-TDN_btnpickup']";
	public static String pickupdate ="pickupdate>//input[@id='JDlgTDNLegDetilsform-TDN_smdpPickup_input']";
	public static String pickupdate1 ="pickupdate>(//input[@data-p-dttype='date'])[5]";
	public static String pickupdateclose ="pickupdate>//span[text()='Customer']";
	public static String Makeas_draft="Makeas_draft>//span[text()='Make As Draft']";
	public static String edit_icon="edit_icon>//button[@id='TDN-tbl-btnTblEdit']";
	public static String vendercode="vendercode>(//div[@col-id='vendor'])[2]";
	public static String chargesgird_click="chargesgird_click>(//div[@col-id='tDNRef'])[3]";

	public static String TDN_Popup_Editmsg="TDN_Popup_Editmsg>(//p[text()='Confirmed TDN Cannot be Edited'])[1]";
	public static String TDN_Tab="TDN_Tab>(//label[@class='ui-outputlabel ui-widget nfr-tabmdl-tabtitle'])[1]";
	public static String Confirm_Button_TDN="Confirm_Button_TDN>(//span[@class='ui-button-text ui-c']//following::span[text()='TDN Confirmation'])[2]";
	public static String Confirm_Button="Confirm_Button>//button[@id='TCO-TCO_select1']";
	public static String TDN_Confirm_Button="TDN_Confirm_Button>//button[@id='TDN-TDN_btnconfirm']";
	public static String Return_locationchange ="Return_locationchange>//button[@id='JDlgTDNLegDetilsform-TDN_btnreturn']";
	public static String Return_Location="Return_Location>//button[@id='JDlgTDNLegDetilsform-TDN_btnreturn']";




	public static String Load_Status="Load_Status>//label[@id='JDlgTDNLegDetilsform-TDN_cmbLoadStatus_label']";
	public static String Terminal_Code_Search="Terminal_Code_Search>//input[@aria-label=' Terminal Code Filter Input']";
	public static String check_box="check_box>(//tbody[@id='TCO-TCO_TDNConfGrid_data']//input[@type='checkbox'])[1]";
	public static String btn_con="btn_con>//button[@id='TCO-TCO_btnTDNConf']";
	public static String btn_con_ok="btn_con_ok>//h2[text()='TDN Confirmation']//following::button";
	public static String switch_tdn="switch_tdn>(//label[text()='Transportation Dispatch Notice(Haulage)'])[1]";
	public static String select_remove="switch_tdn>(//div[@col-id='tDNRef'])[2]";
	public static String ref_pop="ref_pop>//h2[text()='Transportation Dispatch Notice(Haulage)']//following::span[2]";
	public static String ref_pop_ok="ref_pop_ok>//h2[text()='Transportation Dispatch Notice(Haulage)']//following::button[1]";
	public static String act_text="act_text>//input[@id='LCC-LCC_treeDAR-0-modelInput']";
	public static String gettextpop="gettextpop>//label[@id='LCCDLGPla-MFT_JDlgError_labelpla']";

	public static String Load_Status_Select="Load_Status_Select>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbLoadStatus_items']//following::li[text()='%s']";
	public static String TDN_Leg="TDN_Leg>//span[text()='TDN Ref']//following::button[@type='submit'][1]//ancestor::div[@role='row']//div[2]";
	public static String tdnLeg = "tdnLeg>//div[@id='TDN-TDN_jTabbedPane1-TDN_customerTreeTable_tbl']//span[text()='TDN Ref']//following::button[contains(@onclick,'tdn_claimcus')]/../..//following::div[1]";
	public static String mode_Of_Transport = "mode_Of_Transport>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbmode_items']//following::li[text()='%s']";
	public static String transModeType="transModeType>//ul[@id='TDN-TDN_jTabbedPane1-TDN_jCmbCustMode_items']//li[text()='%s']";
	public static String vendorCode_Value="vendorCode_Value>//div[text()='%s']";
	public static String shipment_Type = "shipment_Type>//li[text()='%s']";
	public static String bookingNumber_Select="bookingNumber_Select>//div[@id='TDN-TDN_jTabbedPane1-TDN_jComboCustBooking_panel']//li[text()='%s']";
	public static String select_FirstRow = "select_First_Row>//div[@id='nfr-jdlgGrid-div']//div[@role='rowgroup']/div[@row-index='0']";
	public static String day_Input="day_Input>//a[text()='%s']";
	public static String Select_Legs = "Select_Legs>//div[@id='TDN-TDN_jTabbedPane1-TDN_customerTreeTable_tbl']//span[text()='TDN Ref']//following::button[contains(@onclick,'tdn_claimcus')]";
	public static String select_type1="select_type1>//div[@id='sel_one']//select";
	public static String select_type2="select_type2>//div[@id='sel_one1']//select[@id='second_type']";
	public static String select_type3="select_type3>//div[@id='sel_one2']//select";

	public static String search_Term1_ID="search_Term1_ID>//div[@id='sel_one']";
	public static String search_Term2_ID="search_Term2_ID>//div[@id='sel_one1']";
	public static String search_Term3_ID="search_Term3_ID>//div[@id='sel_one2']";
	public static String Terminal_Code_value="Terminal_Code_value>//div[text()='%s']";
	public static String Load_status_value="Load_status_value>//li[text()='%s']";
	public static String Select_ModeOfTransport_type="Select_ModeOfTransport>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbmode_items']//following::li[text()='%s']";


	public static String select_second = "select_second>//select[@id='second_type']";
	public static String select_first = "select_first>//select[@id='type']";
	public static String select_second_input = "select_second_input>//input[@id='txt_name2']";
	public static String select_third = "select_third>//select[@id='third_type']";
	public static String select_third_input = "select_third_input>//input[@id='txt_name3']";

	public static String globalSearch_Condition_Dropdown1 = "globalSearch_Condition_Dropdown1>//select[@id='var_condition1']";
	public static String globalSearch_Condition_Dropdown2 = "globalSearch_Condition_Dropdown2>//select[@id='var_condition2']";
	public static String globalSearch_Condition_Dropdown3 = "globalSearch_Condition_Dropdown3>//select[@id='var_condition3']";
	public static String globalSearch_InputTextfield1 = "globalSearch_InputTextfield1>//input[@id='txt_name1']";

	public static String globalSearch_Frame_SearchButton = "globalSearch_Frame_SearchButton>//button[@id='myBtn']";




	//12

	public static String draft_Checkbox_Status_Check = "draft_Checkbox_Status_Check>//div[@id='TDN-TDN_chkdraft']//span/parent::div";


	//
	public static String select_FirstRow1 = "select_First_Row1>//div[@id='nfr-twocolsearch-div']//div[@role='rowgroup']/div[@row-index='0']";
	public static String switch_profile_value = "switch_profile_value>//td[text()='%s']";
	public static String trans_select="trans_select>//ul[@id='TDN-TDN_jTabbedPane1-TDN_jCmbCustMode_items']//li[text()='%s']";
	public static String contract_click="contract_click>(//div[text()='%s'])[1]";
	public static String date_select ="date_select>//a[text()='%s']";
	public static String contract_click1="contract_click1>(//li[text()='%s'])[2]";
	public static String bookno_grid="bookno_grid>(//div[text()='%s'])[1]";
	public static String Vender_Code_value="Vender_Code_value>//div[text()='%s']";
	public static String shipmenttype_select="shipment_type>//li[text()='%s']";
	public static String Select_ModeOfTransport="Select_ModeOfTransport>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbmode_items']//following::li[text()='%s']";
	public static String shipmentType = "shipmentType>//li[text()='%s']";
	public static String module_Select = "module_Select>//li[@data-item-label='%s']";
	public static String contract_Select = "contract_Select>(//div[text()='%s'])[1]";
	public static String contract_Select_3 = "contract_Select_3>(//div[text()='%s'])[1]";
	public static String transport_Select = "transport_Select>//ul[@id='TDN-TDN_jTabbedPane1-TDN_jCmbCustMode_items']//li[text()='%s']";
	public static String ID_Ok_Button = "ID_Popup_Ok_Button>//button[contains(@id,'LCCDLG12-LCC')]";


	public static String messagePopup_Ok_TDN = "messagePopup_Ok_TDN>//form[@method='post']/table[contains(@id,'TDNDLG')]//label//following::span[text()='Ok']/parent::button";
	public static String messagePopup_TDN = "messagePopup_TDN>//form[@method='post']/table[contains(@id,'TDNDLG')]//label";
	public static String pluginStatus_Select = "pluginStatus_Select>//ul[@id='PGC-column4_items']/child::li[@data-label='%s']";
	public static String customerTab_Row = "customerTab_Row>//div[@id='TDN-TDN_jTabbedPane1-TDN_customerTreeTable_tbl']//div[@role='rowgroup']/div[@row-index='0']";
	public static String Container_Select="Container_Select>//span[text()='%s']";
	public static String VinChassis_BookNo_Select="VinChassis_BookNo_Select>//input[contains(@id,'DCO-DCO_button')]//following-sibling::span[text()='%s']";
	public static String load_click="load_click>//li[@data-item-label='Load Confirmation']"; 
	public static String Plugin_Configuration_click="Plugin_Configuration_click>//li[@data-item-label='Plugin Configuration']"; 
	public static String Plugin_module_id="Plugin_module_id>//input[@aria-label='Module ID Filter Input']";
	public static String Plugin_id="Plugin_id>//input[@aria-label='Plugin ID Filter Input']";
	public static String Plugin_id_click="Plugin_id_click>(//div[@ref='eBodyViewport']//preceding::div[@row-index='0'])[2]";
	public static String enable_status="enable_status>//label[contains(@id,'PGC-column')]";
	public static String Containerr="Containerr>//span[text()='%s']";
	public static String actual_containerr = "actual_container>((//tbody[@id='LCC-LCC_treeDAR_data']//tr)[%s]//td)[7]";
	public static String Numberofcontainerr = "Numberofcontainerr>(//tbody[@id='LCC-LCC_treeDAR_data']//tr)";
	public static String assigningg="assigningg>//span[text()='%s']";
	public static String sheet_namee="sheet_name>//li[text()='%s']";
	public static String dest_Checkboxx = "dest_Checkbox>(//tbody[@id='LCC-LCC_treeDAR_data']//preceding::input[@type='checkbox'])[4]";
	public static String base_Container_Field = "base_Container_Field>(//tbody[@id='LCC-LCC_treeDAR_data']//following::td)[6]";
	public static String agny_config_click = "agny_config_click>//li[@data-item-label='Agency Configuration']";
	public static String load_close = "load_close>//span[@id='LCC_EditorPaneMsg2_title']//following::a[1]";

	public static String cust_Depot_Term_Label = "cust_Depot_Term_Label>//label[@id='JDlgTDNLegDetilsform-TDN_cmbCustLocation_label']";
	public static String cust_Depot_Term_Options = "cust_Depot_Term_Options>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbCustLocation_items']//li[.='%s']";
	public static String return_location_label = "return_location_label>//label[@id='JDlgTDNLegDetilsform-TDN_cmbRtn_label']";
	public static String return_location_options = "return_location_options>//ul[@id='JDlgTDNLegDetilsform-TDN_cmbRtn_items']//li[.='%s']";
	public static String pickupdate_leg = "pickupdate_leg>//input[@id='JDlgTDNLegDetilsform-TDN_smdpPickup_input']";
	public static String return_date_leg = "return_date_leg>//input[@id='JDlgTDNLegDetilsform-TDN_smdpRtn_input']";
	public static String pickup_loc_label = "pickup_loc_label>//label[@id='JDlgTDNLegDetilsform-TDN_cmbPickup_label']";
	public static String pickup_loc_search_icon = "pickup_loc_search_icon>//table[contains(@id,'TDN_pgLegDetils')]//button[contains(@id,'TDN_btnpickup')]";
	public static String cust_depo_term_search_icon = "cust_depo_term_search_icon>//button[@id='JDlgTDNLegDetilsform-TDN_btnCustLocation']";

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



}








