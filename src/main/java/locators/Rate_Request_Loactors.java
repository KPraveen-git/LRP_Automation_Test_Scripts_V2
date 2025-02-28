package locators;
public interface Rate_Request_Loactors extends Contract_Management_System_Locators {
	public static String Req_Rate_Loc="Req_Rate_Loc>(//tbody[@id='REQ-REQ_OFRGrid_data']//tr[@data-ri='0']//div[contains(@id,'REQ_OFRGrid')]//span[@class='REQ_txtAllinOFR'])[1]";
	//Rate Request locators:

	//sc15
	public static String Surcharge_remove_Popup="Surcharge_remove_Popup>(//h2[text()='Rate Request']//following::span)[2]";
	//sc16
	public static String Grid_Data="Grid_Data>//tbody[@id='REQ-REQ_surchargeGrid_data']/tr[@role='row']";
	public static String grid_LastValue="grid_LastValue>(//tbody[@id='REQ-REQ_surchargeGrid_data']/tr[@data-ri='%s'])";
	public static String Surcharge="Surcharge>(//tbody[@id='REQ-REQ_surchargeGrid_data']//tr[1]//td[5]//span)[1]";
	public static String Activity_Scroll ="Activity_Scroll>(//div[@id='nfr-jdlgGrid-div']//div[@ref='eViewport'])[2]";
	//SC14
	public static String Table_Header="Table_Header>//thead[@id='REQ-REQ_surchargeGrid_head']//th";
	public static String Table_Rows="Table_Rows>//tbody[@id='REQ-REQ_surchargeGrid_data']//tr";

	public static String Select_Agent = "Select_Agent>//*[@id=\"SWP-SWP_datatable_data\"]/tr[3]/td[1]";
	public static String Select_Agent1 = "Select_Agent1>(//tr[contains(@class,'ui-widget-content ui-datatable-even')]//td)[3]";
	public static String Switch_ProfileB = "Switch_ProfileB>(//span[text()='Switch Profile'])[2]";
	public static String Switch_Profile_Button = "Switch_Profile_Button>//button[@id='SWP-SWP_btnSwitchProfile']"; 
	public static String Module_SearchR = "Module_SearchR>//*[@id='nfr_topbar_autocomp_input']";
	public static String Rate_Request = "Rate_Request>//li[@data-item-label='Rate Request']";
	public static String Rate_Newbutton = "Rate_Newbutton>//button[@id='REQ-tbl-btnTblNew']";
	//	public static String Wiyhout_Agency_login_pop = "Wiyhout_Agency_login_pop>(//span[contains(text(),'Rate Request')])[6]//following::p[12]";
	public static String Customer_Select = "Customer_Select>//div[@id='nfr-jdlgGrid-div']//div[@row-index='0']";
	public static String Cust_NameInput = "Cust_NameInput>//input[@id='REQ-REQ_txtCustName_auto_input']";
	public static String Orgin_Input = "Orgin-Input>//input[@id='REQ-REQ_txtOrigin_auto_input']";
	public static String Delivery_Input = "Delivery_Input>//input[@id='REQ-REQ_txtDelivery_auto_input']";
	public static String Commodity_Input ="Commodity_Input>//input[@id='REQ-REQ_txtCommodity_auto_input']";
	public static String Eqp_Type = "Eqp_Type>//input[@id='REQ-REQ_txtEquipment_auto_input']";
	public static String Eqp_Quantity = "Equ-Quantity>//input[@id='REQ-REQ_txtqty']";
	public static String Gross_Weight = "Gross_Weight>//input[@id='REQ-REQ_txtweight_input']";
	public static String checkbox_DG="checkbox_DG>//div[@id='REQ-REQ_chkDG']";
	public static String Routing_Button = "Routing-Button>//button[@id='REQ-REQ_btnRouting']";
	public static String Toolbar_Serch = "Toolbar_Serach>//button[@id='REQ-tbl-nfr_qs_schbtn']";
	public static String Requet_Type = "Requet_Type>//label[contains(@id,'REQ-REQ_cmbEnquiryType_label')]";
	public static String OOG_Length_Field = "OOG_Length_Field>//input[contains(@id,'REQ_length')]";
	public static String OOG_Width_Field = "OOG_Width_Field>//input[contains(@id,'REQ_width')]";
	public static String OOG_Height_Field = "OOG_Height_Field>//input[contains(@id,'REQ_height')]";
	public static String OOG_Check_Box = "OOG_Check_Box>//Label[contains(@id,'REQ-REQ_lblchkOOG')]//preceding::div[1]";
	public static String Exp_Days = "Exp_Days>//input[@id='REQ-REQ_expfree']";
	public static String Imp_Days = "Imp_Days>//input[@id='REQ-REQ_impfree']";
	public static String Exp_Demurage = "Exp_Demurage>//input[@id='REQ-REQ_expdem']";
	public static String Imp_Demurage = "Imp_Demurage>//input[@id='REQ-REQ_impdem']";
	public static String OOG_Ok_Btn = "OOG_Ok_Btn>//button[@id='btnOOGOk']";
	public static String Router_Select = "Router_Select>//span[@id='REQ_routingdlg_title']//following::span[text()='Origin'][1]//following::div[@ref='eCenterContainer'][1]";
	public static String schedules_Button = "schedules_Button>//button[@id='REQ-REQ_btnschedules']";
	public static String Dateclick = "Dateclick>//input[@id='REQ-REQ_txtFromDateDtl_input']";
	public static String Dateclick1 = "Dateclick>//input[@id='REQ-REQ_txtToDateDtl_input']";
	public static String Serchanges_remove = "Serchanges_remove>//button[@id='REQ-REQ_btnDetaSurRemove']";
	public static String Autorate_surchargeclick = "Autorate_surchargeclick>//thead[@id='REQ-REQ_surchargeGrid_head']//following::td[2]";
	public static String Autorate_surchargeclickpopOK = "Autorate_surchargeclickpopOK>//span[contains(text(),' Are you sure you want to remove the selected record(s)')]//following::button[2]";
	public static String OFR_Txt_Field ="OFR_Txt_Field>//input[@id='REQ-REQ_txtAllin_input']";
	public static String Serchanges_Add = "Serchanges_Add>//button[@id='REQ-REQ_btnManSur']";
	public static String Rate_AddBtn = "Rate_AddBtn>//Button[@id='REQ-REQ_btnAddofr']";
	public static String surcharge_grid_R="surcharge grid>//tbody[@id='REQ-REQ_surchargeGrid_data']";
	public static String Rate_SaveBtn = "Rate_SaveBtn>//Button[@id='REQ-tbl-btnsave']";
	public static String Rate_SubmitBtn = "Rate_SubmitBtn>//Button[@id='btnsubmit']";
	public static String Rate_PendingBtn = "Rate_PendingBtn>//Button[@id='btnpending']";
	public static String Rate_Sub_Popup_Msg = "Rate_Sub_Popup_Msg>//label[@id='lblsubstatus']";
	public static String Yes_Btn = "Yes_Btn>//button[text()='Yes']";
	public static String Cus_Profile_Close = "Switch_ProfileB>(//div[@id='REQ_profiledlg']//following::a)[1]";
	public static String Surcharge_AddBtn="Surcharge_AddBtn>//button[@id='REQ-REQ_btnManSur']";
	public static String rateRequest_Tab="rateRequest_Tab>//a[@role='presentation']/child::label[.='Rate Request']";
	public static String switchType_Table="switchType_Table>//label[@id='SWP-SWP_lblSwitchType']";
	public static String exit_Button="exit_Button>//button[@id='btnExitOk1']";
	public static String customer_Profile_page="customer_Profile_page>//span[@id='REQ_profiledlg_title']";
	public static String routingSearch_Frame="routingSearch_Frame>//span[@id='REQ_routingdlg_title']";
	public static String select_First_Routing="select_First_Routing>//div[@id='routegrid_tbl']//div[@row-index='0']";
	public static String rate_Request_Popup="rate_Request_Popup>(//h2[.='Rate Request']/following::span)[2]";
	public static String status_Field="status_Field>//input[@id='REQ-REQ_lblStatuss']";
	public static String reqNo_Textfield="reqNo_Textfield>//input[@id='REQ-REQ_txtEnquiryNo']";
	public static String Auto_Panel_First = "Auto_Panel_First>((//div[contains(@id,'auto') and contains(@style,'display: block')])//following::td)[1]";
	public static String global_search_R="global search>//button[@id='REQ-tbl-btnTblJdlgSearch']";
	public static String global_search_input_R="global search input>//div[@id='var_char']//input[1]";
	public static String global_search_btn_R="global search btn>//div[@id='search_JDLGView']//button[@id='myBtn']";
	public static String global_search_value_R="global search value>//div[@row-index='0']/child::div[@col-id='C1']";
	public static String delete_Button_Toolbar="delete_Button_Toolbar>//button[@id='REQ-tbl-btnTblDelete']";
	public static String delete_Request_Popup="delete_Request_Popup>//label[@id='lbldelreset']";
	public static String delete_Request_Popup_Ok="delete_Request_Popup_Ok>//button[@id='btndelok']";
	public static String comment_Ok_Button="comment_Ok_Button>(//span[.='Ok']/parent::button[contains(@id,'delok')])[2]";
	public static String close_Tab="close_Tab>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
	public static String below_tariff_popup="below tariff popup>//td[text()='Rejected - Below Tariff/Discretionary rate ( Please apply SRR )']";
	public static String dgDetails_Frame="dgDetails_Frame>//span[@id='REQ_DGdlg_title']";
	public static String class_Search_Button="class_Search_Button>//button[@id='DGform-btnDGClass']";
	public static String searchfield_DG_Class="searchfield_DG_Class>(//div[@ref='eFloatingFilterInput']//input)[1]";
	public static String plus_Button="plus_Button>//button[@id='DGform-REQ_btnaddDG']";
	public static String click_First_Row="click_First_Row>//div[@row-id='0']/child::div[@col-id='C1']";
	public static String select_Button_UN="select_Button_UN>//button[@id='multicol_okbtn']";
	public static String unNO_Grid="unNO_Grid>(//tbody[@id='DGform-REQ_dgclassgrid_data']//td)[1]";
	public static String ok_Button_DG_Details="ok_Button_DG_Details>//button[@id='DGform-REQ_btnDGOk']";
	public static String checkbox_SOC="checkbox_SOC>//div[@id='REQ-REQ_chkSOC']";
	//public static String popup_5_Sec="popup_5_Sec>(//div[@class='ui-growl-item']//following::p)";
	public static String Rate_Request_Page = "Rate_Request_Page >(//label[contains(text(),'Rate Request')])[1]";
	public static String Delivery_Input_Field = "Delivery_Input_Field>//input[@id='REQ-REQ_txtDelivery_auto_input']";
	public static String submitted_Popup="submitted_Popup>(//div[@class='ui-growl-item']//following::p)";
	public static String Req_No_Txt_Field = "Req_No_Txt_Field>//input[@id='REQ-REQ_txtEnquiryNo']";
	public static String Request_Status = "Request_Status>//input[@id='REQ-REQ_lblStatuss']";
	public static String Grid_Request_Status = "Grid_Request_Status>(//tbody[@id='REQ-REQ_OFRGrid_data']//td)[9]";
	public static String Retrived_Tariff_No = "Retrived_Tariff_No>//span[@id='REQ-REQ_txtTariffNumber']";
	public static String Location_Code="Location_Code>//td[text()='AEESAD']";
	//	String Location="Location>//td[text()='"+hwwgwhgd"+']";
	public static String Cust_Name_Value="Cust_Name_Value>(//div[@id='REQ-REQ_txtCustName_auto_panel']//td)[2]";
	public static String CustName_ExitBtn="CustName_ExitBtn>//button[@id='btnExitOk1']";
	public static String Origin_Value="Origin_Value>(//div[@id='REQ-REQ_txtOrigin_auto_panel']//td)[1]";
	public static String surcharge_first_data="surcharge_first_data>//tbody[@id='REQ-REQ_surchargeGrid_data']/tr[@data-ri='0']";
	public static String remarks_field="remarks field>//textarea[@id='REQ-REQ_txtVAS']";
	public static String rate_rejected_popup="rate rejected msg>//td[text()='Rejected - Rate has been rejected ( Please apply SRR )']";
	public static String save_pending_popup="save popup>//label[text()='Do you want to save as Pending / Submit ?']";
	public static String Rate_edit_btn="edit btn>//button[@id='REQ-REQ_btnAddofr']//span[text()='Edit']";
	public static String Apply_RateBtn="Apply_RateBtn>//Button[@id='REQ-REQ_btnApply']";
	public static String Rate_Req_Submitted_Popup = "Rate_Req_Submitted_Popup>//*[text()='Standard Rate Request(MRG/SRR) submitted to SRR']";
	public static String Surcharge_ChargeCode="Surcharge_ChargeCode>//input[@aria-label='Charge Code Filter Input']";
	public static String global_select_Button="global_select_Button>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String Commodity_Value="Commodity_Value>(//div[@id='REQ-REQ_txtCommodity_auto_panel']//td)[1]";
	//public static String Eqp_Type_Value="Eqp_Type_Value>(//div[@id='REQ-REQ_txtEquipment_auto_panel']//td)[3]";
	public static String Eqp_Type_Value="Eqp_Type_Value>//div[@id='REQ-REQ_txtEquipment_auto_panel']";
	public static String Delivery_Value="Delivery_Value>(//div[@id='REQ-REQ_txtDelivery_auto_panel']//td)[1]";
	public static String Routing_Value="Routing_Value>//div[text()='ACM']";
	public static String added_portpair="port pair>//td[text()='Awaiting Approval']";
	public static String global_edit_btn="global edit btn>//button[@id='REQ-tbl-btnTblEdit']";
	//SRR Gate
	public static String submit_RadioButton="submit_RadioButton>//table[@id='SRLform-SRL_rdSubmit']//following::label[.='SUBMIT']";
	public static String menu_Icon_Grid="menu_Icon_Grid>(//div[@col-id='srrno']//child::span[@ref='eMenu'])[1]";
	public static String filter_Icon_Grid="filter_Icon_Grid>//div[@ref='eHeader']/child::span[@aria-label='filter']";
	public static String filter_Inputfield="filter_Inputfield>(//div[@ref='eFilterLoading']//following::input[@ref='eInput'])[1]";
	public static String srrGate_Tab="srrGate_Tab>//a[@role='presentation']/child::label[.='SRR Gate']";
	public static String select_Actual_ReqNo="select_Actual_ReqNo>//div[@row-index='0']//div[@col-id='srrno']";
	public static String moveTo_Pending="moveTo_Pending>//span[.='Move to Pending']";
	public static String close_Moved_Pending_Popup="close_Moved_Pending_Popup>//div[@id='primefacesmessagedlg']//following::a[@role='button']";
	public static String pending_RadioButton="pending_RadioButton>//table[@id='SRLform-SRL_rdPending']//following::label[.='PENDING']";
	public static String SRR_Search_Value="SRR_Search_Value>//li[@data-item-value='SRL']";
	public static String SRR_Req_Type = "SRR_Req_Type>//label[@id='SRLform-cmbType_label']";
	public static String All_Req_Type = "All_Req_Type>//li[text()='All']";
	public static String SRR_Refresh_Btn = "SRR_Refresh_Btn>//button[@id='SRLform-btnShow']";
	public static String NOR_Check_Box = "NOR_Check_Box>//div[@id='REQ-REQ_chkNOR']//span";
	public static String Save_As_Btn="Save_As_Btn>//button[@id='REQ-tbl-btnTblSaveas']"; 
	public static String SaveAs_YesBtn="SaveAs_YesBtn>//button[text()='Yes']";
	public static String Current_Date="Current_Date>//input[@id='REQ-REQ_txtTodayDate_input']";
	public static String From_Date="From_Date>//input[@id='REQ-REQ_txtFromDateDtl_input']";
	//surcharge
	public static String surchargeGrid ="surchargeGrid>//div[@id='REQ-REQ_surchargeGrid']/child::div[@class='ui-datatable-scrollable-body']";
	public static String SurCharge_LocInput="SurCharge_LocInput>(//td[.='BSC']/following::div[contains(@id,'REQ-REQ_surchargeGrid')])[3]";
	public static String input="input>(//td[.='BSC']/following::div[contains(@id,'REQ-REQ_surchargeGrid')])[3]//input[@id='REQ-REQ_surchargeGrid-11-SurLocAmt_input']";
	public static String SurCharge_ApplyBtn="SurCharge_ApplyBtn>//button[@id='REQ-REQ_btnAppSur']";
	public static String SurCharge_Valueselect="SurCharge_Valueselect>//td[text()='BSC']";
	public static String Surcharg_RemoveBtn="Surcharg_RemoveBtn>//button[@id='REQ-REQ_btnDetaSurRemove']";
	public static String Surcharge_Remove_yesBtn="Surcharge_Remove_yesBtn>//button[text()='Yes']";
	public static String Non_Cont_Radio_Btn ="Non_Cont_Radio_Btn>(//input[contains(@id,'shptyp')])[2]//following::label[1]";
	public static String Rate_Calc_Type = "Rate_Calc_Type>(//input[contains(@id,'txtEquipment_auto')])[1]";
	public static String Add_Dimension_Btn = "Add_Dimension_Btn>//button[@id='REQ-REQ_btnDimensions']";
	public static String Dimension_GrWt_Field = "Dimension_GrWt_Field>(//label[contains(text(),'Gr.Wt')])[2]//following::input[1]";
	public static String Dimension_Length_Field = "Dimension_Length_Field>(//label[contains(text(),'Length')])[1]//following::input[1]";
	public static String Dimension_Width_Field = "Dimension_Width_Field>(//label[contains(text(),'Width')])[3]//following::input[1]";
	public static String Dimension_Height_Field = "Dimension_Height_Field>(//label[contains(text(),'Height')])[3]//following::input[1]";
	public static String Dimension_Quant_Field = "Dimension_Quant_Field>(//label[contains(text(),'Quantity')])[1]//following::input[1]";
	public static String Dimension_Package_Search = "Dimension_Package_Search>(//label[contains(text(),'Package Description')])[1]//following::button[1]";
	public static String Dimension_Add_Btn = "Dimension_Add_Btn>(//label[contains(text(),'Package Description')])[1]//following::span[text()='Add']";
	public static String Dimension_Ok_Btn = "Dimension_Ok_Btn>(//label[contains(text(),'Package Description')])[1]//following::span[text()='Ok'][1]";
	public static String Package_Serach = "Package_Serach>//input[@aria-label='Package Code Filter Input']";
	public static String SurCharge_Value="SurCharge_Value>//div[text()='bumker surcharge']";
	public static String Pending_Valueclick="Pending_Valueclick>//div[@row-id='0']/child::div[@col-id='srrno']";
	public static String Surcharge_Edit="Surcharge_Edit>(//tbody[@id='REQ-REQ_surchargeGrid_data']//tr//td[5])[1]";
	public static String select_Actual_ReqNo1="select_Actual_ReqNo>//div[@row-id='1']/child::div[@col-id='srrno']";
	public static String actualSRR = "actualSRR>//div[@row-id='0']/child::div[@col-id='srrno']";
	//public static String Password_input = "Password>//input[@id='nfr_login_authid']";
	//public static String Login = "Login>//*[@id='nfr_login_btnlogin']";
	//public static String Home_Logo = "Home_Logo>//*[@id='nfr_topbar_user_detail_link']";
	//public static String Search_Input = "Search_Input>//*[@aria-autocomplete='listbox']";
	public static String home_Page = "Home_page >//*[@id='ui-id-1']";
	//public static String APassword_input = "Password_input>//input[@id='nfr_login_authid']";
	//public static String ALogin="Login>//*[@id='nfr_login_btnlogin']";
	//public static String AHome_Logo="Home_Logo>//*[@id='nfr_topbar_user_detail_link']";
	public static String tonpop31 = "tonpop31 >(//b[contains(text(),'Equipment Gross Weight ')])[1]";
	public static String OOGPOP = "OOGPOP >(//p[contains(text(),'This Behaviour applies to Special Type Equipment only')])[1]";
	public static String Norpop = "Norpop >(//p[contains(text(),'This Behaviour applies to Reefer Type Equipment only')])[1]";
	public static String OFRPOP = "OFRPOP >(//p[contains(text(),'Add OFR Details')])[1]";
	public static String Serchargeremove = "Serchargeremove >(//p[contains(text(),'Select a record to remove')])[1]";
	public static String Entertherate = "Entertherate >(//p[contains(text(),'Enter the ')])[1]";
	public static String cantresurchrge = "cantresurchrge >(//p[contains(text(),'Cannot remove the Auto Surcharge -  ADV')])[1]";
	public static String Adddouble = "Adddouble >(//p[contains(text(),'This Port Pair, Equipment, Commodity and SOC details already exist')])[1]";
	public static String Validsame = "Validsame >(//b[contains(text(),'Valid From')])[1]";
	public static String Nosudule = "Nosudule >(//p[contains(text(),'No Schedules are available')])[1]";
	public static String agencypop = "agencypop >(//b[contains(text(),'Standard Rate Request(MRG/SRR)')])[1]";


	public static String raterequest = "raterequest >(//label[text()='Rate Request'])[1]";
	public static String non_containradio_btn = "non_containradio_btn >//label[text()='Non Containerized']//preceding::div[1]";
	public static String DG_checkbox = "DG_checkbox>//div[@id='REQ-REQ_chkDG']//div[2]";
	public static String oog_checkbox = "oog_checkbox>//div[@id='REQ-REQ_chkOOG']//div[2]";
	public static String nor_checkbox = "nor_checkbox>//div[@id='REQ-REQ_chkNOR']//div[2]";
	public static String soc_checkbox = "soc_checkbox>//div[@id='REQ-REQ_chkSOC']//div[2]";
	public static String MTY_checkbox = "MTY_checkbox>//div[@id='REQ-REQ_chkemty']//div[2]";
	public static String carrier_haulage = "carrier_haulage>(//label[text()='Carrier Haulage'])[1]//preceding::div[1]";
	public static String merc_haulage = "merc_haulage>(//label[text()='Merc.Haulage'])[1]//preceding::div[1]";
	public static String oncarrier_haulage = "oncarrier_haulage>(//label[text()='Carrier Haulage'])[2]//preceding::div[1]";
	public static String onmerc_haulage = "onmerc_haulage>(//label[text()='Merc.Haulage'])[2]//preceding::div[1]";
	public static String Month_DD = "Month_DD>//select[@aria-label='select month']";
	public static String Slab_ChkBok = "Slab_ChkBok>//div[@id='SCN-SCN_chkboxslab']//div[2]";
	public static String Year_DD = "Year_DD>//select[@aria-label='select year']";
	public static String select_Agency = "select_Agency>//tbody[@id='SWP-SWP_datatable_data']/child::tr[@data-ri='0']";
	public static String agency_Code_Filter = "agency_Code_Filter>//label[.='Filter by Code']/following-sibling::input[contains(@id,'SWP-SWP_datatable')]";
	public static String type_Of_User = "type_Of_User>(//div[@class='topbar-user-details']//child::span)[1]";
	public static String Routing_ToolPannel="Routing_ToolPannel>//div[@id='routegrid_nfr_toolpanel_li_id']";
	public static String Routing_condition_Filter="Routing_condition_Filter>//a[@id='routegrid_conditionFilter_id']";
	public static String Routing_OriginTF="Routing_OriginTF>//input[@aria-label='Origin Filter Input']";
	public static String Routing_service_TF="Routing_service_TF>//input[@aria-label='Service Filter Input']";
	public static String DG_Select="DG_Select>//button[@id='nfr-twocol-select-button']";
	public static String popup_5_Sec="popup_5_Sec>//div[@id='nfr_pwdexpmsg_container']//p";
	///new
	public static String CustomerSearch_Condition_Dropdown1 = "customerSearch_Condition_Dropdown1>//select[@id='var_condition1']";
	public static String customerSearch_Condition_Dropdown2 = "customerSearch_Condition_Dropdown2>//select[@id='var_condition2']";
	public static String customerSearch_Condition_Dropdown3 = "customerSearch_Condition_Dropdown3>//select[@id='var_condition3']";
	public static String CustomerSearch_InputTextfield1 = "customerSearch_InputTextfield1>//input[@id='txt_name1']";
	public static String CustomerSearch_Frame_SearchButton = "customerSearch_Frame_SearchButton>//button[@id='myBtn']";


	public static String Customer_Name_search_button="Customer_Name_search_button>//button[@id='REQ-REQ_btncustname-REQ_btncustname']";
	public static String Customer_Code_Select_dropdown="Customer_Code_Select_dropdown>//select[@onchange='myFunction1()']";


	public static String srrGate_FromDate = "srrGate_FromDate>//input[@id='SRLform-txtFrom_input']";
	public static String srrGate_ToDate = "srrGate_ToDate>//input[@id='SRLform-txtTo_input']";
	public static String RequestType = "RequestType>//ul[@id='REQ-REQ_cmbEnquiryType_items']/li[text()='%s']";	


	public static String non_Containerized_RadioButton = "non_Containerized_RadioButton>//label[text()='Non Containerized']/preceding-sibling::div";
	public static String srrGate_Module = "srrGate_Module>//li[@moduleid='SRL']";
	//  		
	public static String service_Textfield="service_Textfield>//input[@id='REQ-REQ_txtService_input']";
	public static String pre_Carriage_Radiobtn = "pre_Carriage_Radiobtn>//legend[text()='Pre Carriage']//following::label[text()='%s']";
	public static String on_Carriage_Radiobtn = "on_Carriage_Radiobtn>//legend[text()='On Carriage']//following::label[text()='%s']";
	public static String pop_up_exp = "pop_up_exp>//div[@id='lrp_cust_growl_container']//p";
	public static String firstRow = "firstRow>//div[@row-index='0']/div[@col-id='C1']";
	public static String rateQty_Textfield = "rateQty_Textfield>//input[@id='REQ-REQ_txtqty']";
	public static String dimensions_Gr_Wt = "dimensions_Gr_Wt>//input[@id='DimensionsDlg2-weight2_input']";
	public static String rateType_Option = "rateType_Option>//ul[@id='REQ-REQ_cmbReqcalcType_items']/li[text()='%s']";
	public static String rateType_Dropdown = "rateType_Dropdown>//div[@id='REQ-REQ_cmbReqcalcType']";
	public static String commodity_Attribute = "commodity_Attribute>//input[@id='REQ-REQ_txtCommodity_auto_hinput']";

	public static String tService_Dropdown = "tService_Dropdown>//div[@id='REQ-REQ_cmbCarrTerm']";
	public static String TOS_Dropdown = "TOS_Dropdown>//div[@id='REQ-REQ_cmbTos']";
	public static String TOS_Option = "TOS_Option>//ul[@id='REQ-REQ_cmbTos_items']/li[text()='%s']";

	public static String tService_Option = "tService_Option>//ul[@id='REQ-REQ_cmbCarrTerm_items']/li[text()='%s']";

	public static String portPair = "portPair>//tbody[@id='REQ-REQ_OFRGrid_data']//td[text()='%s']";

	public static String Surcharge_Select="Surcharge_Select>(//div[@id='nfr-twocolsearch-div']//div[@ref='eCenterContainer']//div[@role='row'])[1]";
	public static String SRR_Gate="SRR_Gate>//li[@data-item-label='SRR Gate']";	
	public static String DG_Class_Select="DG_Class_Select>//div[@id='nfr_sch_tw_pnl_content']//div[@ref='eCenterContainer']//div[@row-index='0']";	
	public static String UN_Number_select="UN_Number_select>//div[@id='nfr-multi-div']//div[@ref='eCenterContainer']//div[@row-index='0']";	
	public static String SRR_Gate_Request_type="SRR_Gate_Request_type>//ul[@id='SRLform-cmbType_items']/li[text()='%s']";

	public static String date_select ="date_select>//a[text()='%s']";
	///////////////////////////////////////////////////////////////////////////////
	public static String norCheckBox ="norCheckBox>//div[@id='REQ-REQ_chkNOR']//span/parent::div";
	public static String nonContainerized_Radiobutton ="nonContainerized_Radiobutton>//label[text()='Non Containerized']/preceding-sibling::div//span/parent::div";
	public static String selectRateType = "select_RateType>//ul[@id='REQ-REQ_cmbReqcalcType_items']/li[@data-label='%s']";
	public static String dg_Details_txtfield="dg_Details_txtfield>//input[@id='REQ-REQ_txtDgDetails']";
	public static String request_Type_Status="request_Type_Status>//label[@id='REQ-REQ_cmbEnquiryType_label']";
	public static String code = "code>//td[.='%s']";
	public static String DropDown_Select= "DropDown_Select>//div[contains(@id,'panel') and contains(@style,'display: block;')]//li[text()='%s']";

	public static String Doc_Agency ="Doc_Agency>//input[@id='FCN-FCN_txtDocAgencyCity']";
	public static String Profile_Dropdown ="Location_Dropdown>//label[@id='SWP-SWP_cmbSwitchType_label']";
	public static String Corporate_Profile ="Corporate_Location>//ul[@id='SWP-SWP_cmbSwitchType_items']//li[@data-label='Corporate']";
	public static String Location_Profile ="Location_Profile>//ul[@id='SWP-SWP_cmbSwitchType_items']//li[@data-label='Location']";
	public static String reset_Profile_Button="reset_Profile_Button>//button[@id='SWP-SWP_btnResetProfile']";
	public static String Module_Select = "Module_Select>//div[@id='nfr_topbar_autocomp_panel' and contains(@style,'display: block;')]//li[translate(@data-item-label, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')=translate('%s', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')]";
	public static String Amount_header = "Amount_header>//thead[@id='IIV-IIV_gridInvDetails_head']//th//span[.='Amount']";
	public static String Date_Select = "Date_Select>//div[contains(@id,'datepicker')]//a[text()='%s']";
	public static String globale_Value_select="BL_Number_select>//div[@id='nfr-jdlgGrid-div']//div[@row-index='0']";
	public static String SelectButton="SelectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String Mail_Cancel_button = "Mail_Cancel_button>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'emailEditorCancelBtn')]";

	public static String SRR_Port_Pair_Table_Headers ="SRR_Port_Pair_Table_Headers>//thead[@id='SRR-SRR_detailViewGrid_head']//th";
	public static String SRR_Port_Pair_Table_Rows ="SRR_Port_Pair_Table_Rows>//tbody[@id='SRR-SRR_detailViewGrid_data']//tr";
	public static String SRR_Approve_Button ="SRR_Approve_Button>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnAccept')]";
	public static String toolBar_Edit_Button ="toolBar_Edit_Button>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblEdit')]";
	public static String toolBar_Cancel_Button="toolBar_Cancel_Button>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblCancel')]";
	public static String toolBar_SaveAs_Button = "toolBar_SaveAs_Button>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblSaveas')]";
	public static String toolBar_Search_Button = "toolBar_Search_Button>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblJdlgSearch')]";
	public static String toolBar_Save_Button = "toolBar_Save_Button>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnsave')]";
	public static String back_Date_Button ="back_Date_Button>//button[contains(@id,'SRR_btnBackDate')]";
	public static String back_Date_Input_Field ="back_Date_Input_Field>//input[contains(@id,'SRR_dateFrom_input')]";
	public static String back_Date_Ok_Button ="back_Date_Ok_Button>//button[contains(@id,'SRR_dlgbtnok')]";
	public static String to_Date_Button ="to_Date_Button>//button[contains(@id,'SRR_btnDateUpdation')]";
	public static String to_Date_Input_Field = "to_Date_Input_Field>//input[contains(@id,'SRR_tdateTo_input')]";
	public static String paymentMode_Dropdown_RR ="paymentMode_Dropdown_RR>//div[@id='REQ-REQ_payment']";
	public static String to_Date_Ok_Button="to_Date_Ok_Button>//button[contains(@id,'SRR_tdlgbtnok')]";
	public static String SRR_Payment_Mode ="SRR_Payment_Mode>//label[contains(@id,'SRR_payment_label')]";

	//	Load cost

	public static String new_Button_LC ="new_Button_LC>//tr[@id='LDC-LDC_pnlToolBar']//button[contains(@id,'btnTblNew')]";
	public static String save_Button_LC ="save_Button_LC>//tr[@id='LDC-LDC_pnlToolBar']//button[contains(@id,'btnsave')]";

	public static String location_SearchButton_LC ="location_SearchButton_LC>//button[@id='LDC-LDC_btnLocation-LDC_btnLocation']";
	public static String containerType_RadioButton_LC ="containerType_RadioButton_LC>(//input[contains(@id,'LDC-LDC_btngrpLDC') and @value='%s']/following::div[contains(@class,'ui-radiobutton-box')])[1]";
	public static String terminal_SearchButton_LC ="terminal_SearchButton_LC>//button[@id='LDC-LDC_btnTerminal']";
	public static String service_SearchButton_LC ="service_SearchButton_LC>//button[@id='LDC-LDC_btnService-LDC_btnService']";
	public static String eqp_Group_Dropdown_LC ="eqp_Group_Dropdown_LC>//div[@id='LDC-LDC_cmbEqup']";
	public static String t_Service_Dropdown_LC ="t_Service_Dropdown_LC>//div[@id='LDC-LDC_cmbTser']";
	public static String fromDate_LC ="t_Service_Dropdown_LC>//input[@id='LDC-LDC_txtFrm_input']";
	public static String toDate_LC ="toDate_LC>//input[@id='LDC-LDC_txtTo_input']";
	public static String standardCost_Table_Rows_LC ="standardCost_Table_Rows_LC>//tbody[@id='LDC-LDC_dsGrid1_data']/tr";
	public static String standardCost_Table_Headers_LC ="standardCost_Table_Headers_LC>//thead[@id='LDC-LDC_dsGrid1_head']//th";
	public static String standardCost_Table_LocalAmount_LC ="standardCost_Table_LocalAmount_LC>//tbody[@id='LDC-LDC_dsGrid1_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'txtLocAmt')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String in_Transist_Checkbox_LC ="in_Transist_Checkbox_LC>//div[@id='LDC-LDC_chkInTransit']/div[contains(@class,'ui-chkbox-box')]";
	public static String pol_Add_Button_LC ="pol_Add_Button_LC>//button[@id='LDC-LDC_btnPOLAdd']";
	public static String standardCost_Table_LocalAmount_Input_LC ="standardCost_Table_LocalAmount_Input_LC>//tbody[@id='LDC-LDC_dsGrid1_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'txtLocAmt')]/input[contains(@id,'txtLocAmt_input')]";
	public static String popup_Message ="popup_Message>//h2//following-sibling::span[2]";
	public static String popup_Message_Yes_Button = "popup_Message_Yes_Button>//h2//following::button[text()='Yes']";
	public static String popup_Message_No_Button = "popup_Message_No_Button>//h2//following::button[text()='No']";
	public static String popup_Message_Ok_Button = "popup_Message_Ok_Button>//h2//following::button[text()='Ok']";

	//admin cost

	public static String service_search_icon_Ac="service_search_icon_Ac>//button[@id='ADI-ADI_servicesearch-ADI_servicesearch']";
	public static String amount_txtfld_Ac="amount_txtfld_Ac>//input[@id='ADI-ADI_txtamount_input']";
	public static String currency_dd_Ac="currency_dd_Ac>//label[@id='ADI-ADI_cmbCurrency_label']";
	public static String currency_dd_value_Ac="currency_dd_value_Ac>//div[@id='ADI-ADI_cmbCurrency_panel']//ul//li[.='%s']";
	public static String radio_btn_Ac="radio_btn_Ac>//table[@id='ADI-ADI_btnamttype']//td//label[.='%s']";
	public static String soc_chckbox_Ac="soc_chckbox_Ac>//div[@id='ADI-ADI_btnSOC']";
	public static String container_type_radio_btn_Ac="container_type_radio_btn_Ac>//table[@id='ADI-ADI_btngrpADI']//tr//td[.='%s']";
	public static String bl_type_label_Ac="bl_type_label_Ac>//label[@id='ADI-bltype_label']";
	public static String bl_type_options_Ac="bl_type_options_Ac>//div[@id='ADI-bltype_panel']//li[.='%s']";
	public static String start_date_Ac="start_date_Ac>//input[@id='ADI-txtstartdate_input']";
	public static String End_date_Ac="End_date_Ac>//input[@id='ADI-txtenddate_input']";
	public static String NewButton_ToolBar = "New Button Tool Bar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblNew')]";
	public static String SaveButton_ToolBar = "Save Button Tool Bar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnsave')]";
	public static String popup="popup>//div[@id='lrp_cust_growl_container']//p";
	public static String SearchButton_Toolbar = "Search Button in tool bal>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblJdlgSearch')]";
	public static String Delete_button_toolBar = "Delete button in Tool Bar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblDelete')]";
	public static String Save_button_toolBar = "Save_button_toolBar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnsave')]";
	public static String Edit_Button_toolBar="Edit Button Toolbar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblEdit')]";
	public static String Equals_Option ="Equals_Option>//div[contains(@id,'nfr_sch_mu_pnl_content')]//span[text()='Equals']|//div[contains(@id,'twocolsearch')]//span[text()='Equals']";
	public static String select_Button="select_Button>//div[@aria-hidden='false']//span[text()='Select']//ancestor::button[1]";
	public static String Filter_Field ="Filter_Field>(//div[@aria-hidden='false' and @role='dialog']//input[contains(@aria-label,'Filter Input')])[1]";
	public static String Filter_Field1 ="Filter_Field1>(//div[@aria-hidden='false' and @role='dialog']//input[contains(@aria-label,'Filter Input')])[2]";
	public static String Filter_Field2 ="Filter_Field2>(//div[@aria-hidden='false' and @role='dialog']//input[contains(@aria-label,'Filter Input')])[3]";
	public static String Filter_Button ="Filter_Button>(//div[@aria-hidden='false' and @role='dialog']//button[@ref='eButtonShowMainFilter']//span)[1]";
	public static String Filter_Button1 ="Filter_Button1>(//div[@aria-hidden='false' and @role='dialog']//button[@ref='eButtonShowMainFilter']//span)[2]";
	public static String Filter_Button2 ="Filter_Button2>(//div[@aria-hidden='false' and @role='dialog']//button[@ref='eButtonShowMainFilter']//span)[3]";
	public static String contains_Click ="contains_Click>(//div[@aria-hidden='false' and @role='dialog']//div[@ref='eDisplayField'])[1]";
	public static String column_Values = "column_Values>//div[@aria-hidden='false' and @role='dialog']//div[@col-id='C1' and @role='gridcell']";
	public static String column_values_Right="Column Values Right>//div[@aria-hidden='false' and @role='dialog']//div[@col-id='C2' and @role='gridcell']";


	public static String ICO_LocationButton ="ICO_LocationButton>//button[contains(@id,'CIC_btnLocation')]";
	public static String ICO_EquipTypeButton = "ICO_EquipTypeButton>//button[contains(@id,'CIC_btnEqpAdd')]";
	public static String ICO_LocationField="ICO_LocationField>//input[contains(@id,'CIC_txtLocationCode')]";
	public static String ICO_StartDate="ICO_StartDate>//input[contains(@id,'CIC_txtFrom_input')]";
	public static String ICO_EndDate = "ICO_EndDate>//input[contains(@id,'CIC_txtTo_input')]";
	public static String ICO_Amount_Field ="ICO_Amount_Field>//input[contains(@id,'CIC_txtAmt_input')]";
	public static String ICO_Currency_DD = "ICO_Currency_DD>//label[contains(@id,'CIC_cmbcurr_label')]";
	public static String ICD_DeliveryPortField="ICD_DeliveryPortField>//input[contains(@id,'ICD_txtLocationCode')]";
	public static String ICD_DeliveryPortButton="ICD_DeliveryPortButton>//button[contains(@id,'ICD_btnLocation')]";
	public static String ICD_OriginPortField = "ICD_OriginPortField>//input[contains(@id,'ICD_txtOrigin')]";
	public static String ICD_OriginPortButton ="ICD_OriginPortButton>//button[contains(@id,'ICD_btnOrigin')]";
	public static String ICD_EquipTypeButton = "ICD_EquipTypeButton>//button[contains(@id,'ICD_btnEqpAdd')]";
	public static String ICD_StartDate="ICD_StartDate>//input[contains(@id,'ICD_txtFrom_input')]";
	public static String ICD_EndDate="ICD_EndDate>//input[contains(@id,'ICD_txtTo_input')]";
	public static String ICD_Amount_Field = "ICD_Amount_Field>//input[contains(@id,'ICD_txtAmt_input')]";
	public static String ICD_Currency_DD ="ICD_Currency_DD>//label[contains(@id,'ICD_cmbcurr_label')]";
	public static String claims_FromLocationButton = "claims_FromLocationButton>//button[contains(@id,'CLS_btnFrmLoc')]";
	public static String claims_ToLocationButton="claims_ToLocationButton>//button[contains(@id,'CLS_btnToLoc')]";
	public static String claims_EquipTypeButton="claims_EquipTypeButton>//button[contains(@id,'CLS_btnAdd')]";
	public static String claims_StartDate = "claims_StartDate>//input[contains(@id,'CLS_txtStart_input')]";
	public static String claims_EndDate ="claims_EndDate>//input[contains(@id,'CLS_txtEnd_input')]";
	public static String claims_Amount_Field = "claims_Amount_Field>//input[contains(@id,'CLS_txtAmount_input')]";
	public static String claims_Currency_DD="claims_Currency_DD>//label[contains(@id,'CLS_cmbCur_label')]";
	public static String SRR_Contribution="SRR_Contribution>//button[contains(@id,'SRR_btnContribution')]";
	public static String SRR_Missing_Cost_Value = "SRR_Missing_Cost_Value>//textarea[contains(@id,'contrimsgtxt')]";
	public static String service_search_icon_Fec="service_search_icon_Fec>//button[@id='FEC-FEC_txtsearch-FEC_txtsearch']";
	public static String origin_search_icon_Fec="origin_search_icon_Fec>//button[@id='FEC-FEC_btnLocation-FEC_btnLocation']";
	public static String pol_search_icon_Fec="pol_search_icon_Fec>//button[@id='FEC-FEC_txtpolsearch-FEC_txtpolsearch']";
	public static String pod_search_icon_Fec="pod_search_icon_Fec>//button[@id='FEC-FEC_txtpodsearch-FEC_txtpodsearch']";
	public static String delivery_search_icon_Fec="delivery_search_icon_Fec>//button[@id='FEC-FEC_txtdeliverysearch-FEC_txtdeliverysearch']";
	public static String equip_type_add_btn_Fec="equip_type_add_btn_Fec>//button[@id='FEC-FEC_btnEqpAdd']";
	public static String voyage_time_txtfld_Fec="voyage_time_txtfld_Fec>//input[@id='FEC-FEC_txtvoyagetimem']";
	public static String outbound_txtfld_Fec="outbound_txtfld_Fec>//input[@id='FEC-FEC_txtoutbounddhh']";
	public static String inbound_txtfld_Fec="inbound_txtfld_Fec>//input[@id='FEC-FEC_txtinnnnbound']";
	public static String empty_txtfld_Fec="empty_txtfld_Fec>//input[@id='FEC-FEC_txtemptyy']";
	public static String per_diem_txtfld_Fec="per_diem_txtfld_Fec>//input[@id='FEC-FEC_txtAmt_input']";
	public static String container_type_radio_btn_Fec="container_type_radio_btn>//label[.='%s']";
	public static String soc_checkbox_Fec="soc_checkbox_Fec>//div[@id='FEC-FEC_btnSOC']";
	public static String start_date_Fec="start_date_Fec>//input[@id='FEC-FEC_txtFrom_input']";
	public static String End_date_Fec="End_date_Fec>//input[@id='FEC-FEC_txtTo_input']";
	public static String currency_dd_Fec="currency_dd_Fec>//label[@id='FEC-FEC_cmbcurr_label']";
	public static String currency_dd_options_Fec="currency_dd_options_Fec>//div[@id='FEC-FEC_cmbcurr_panel']//li[.='%s']";
	public static String SRR_edit_button = "SRR_edit_button>//button[@id='SRR-tbl-btnTblEdit']";
	public static String SRR_approve_button = "SRR_approve_button>//button[@id='SRR-SRR_btnAccept']";
	public static String SRR_save_button = "SRR_save_button>//button[@id='SRR-tbl-btnsave']";
	public static String select_type = "select_type>//li[text()='%s']";
	public static String To_Date_click = "To_Date_click>//button[@id='SRR-SRR_btnDateUpdation']";
	public static String To_Date_input = "To_Date_input>//input[@id='TOfrm-SRR_tdateTo_input']";
	public static String To_Date_input_ok = "To_Date_input_ok>//button[@id='TOfrm-SRR_tdlgbtnok']";
	public static String first_grid_click = "first_grid_click>(//tbody[@id='SRR-SRR_detailViewGrid_data']//tr)[1]";
	public static String Mail_Cancel_button1 = "Mail_Cancel_button>//div[@id='REQ_emaileditor-REQ_nfr_emailEditor']//button[contains(@id,'emailEditorCancelBtn')]";
	public static String valid_to = "valid_to>//tbody[@id='SRR-SRR_detailViewGrid_data']//td[10]";
	public static String valid_from = "valid_from>//tbody[@id='SRR-SRR_detailViewGrid_data']//td[11]";
	public static String srr_pop = "srr_pop>((//span[text()='Special Rate Request(SRR)'])[2]//following::p)[1]";
	public static String back_date = "back_date>//button[@id='SRR-SRR_btnBackDate']";
	public static String back_date_input = "back_date_input>//input[@id='BACKfrm-SRR_dateFrom_input']";
	public static String Ref_Number = "Ref_Number>//input[@id='CNC-CNC_txtOrigintransit']";
	public static String Contribute_button = "Contribute_button>//button[@id='SRR-SRR_btnContribution']";
	public static String Ok_Back_Button = "Ok_Back_Button>//button[@id='BACKfrm-SRR_dlgbtnok']";
	public static String payLocation_SearchButton_RR ="payLocation_SearchButton_RR>//button[@id='REQ-REQ_btnloc']";
	public static String flexi_Checkbox_RR ="flexi_Checkbox_RR>//div[@id='REQ-REQ_chkFlxi']/div[contains(@class,'ui-chkbox-box')]";
	public static String empty_Checkbox_RR ="Empty_Checkbox_RR>//div[@id='REQ-REQ_chkemty']/div[contains(@class,'ui-chkbox-box')]";
	public static String From_location_search= "From_location_search>//button[@id='IFC-IFC_btnFmPortSearch-IFC_btnFmPortSearch']";
	public static String From_location_search_external= "From_location_search>//button[@id='EFC-EFC_btnFmPortSearch-EFC_btnFmPortSearch']";
	public static String From_location_search_Haulage= "From_location_search_Haulage>//button[@id='HAL-HAL_btnFmPortSearch-HAL_btnFmPortSearch']";
	public static String TO_location_search_external= "TO_location_search>//button[@id='EFC-EFC_btnToPortSearch']";
	public static String TO_location_search_Haulage= "TO_location_search_Haulage>//button[@id='HAL-HAL_btnToPortSearch']";
	public static String TO_location_search= "TO_location_search>//button[@id='IFC-IFC_btnToPortSearch']";
	public static String From_terminal_search= "From_terminal_search>//button[@id='IFC-IFC_btnFmTerminal']";
	public static String From_terminal_search_external= "From_terminal_search>//button[@id='EFC-EFC_btnFmTerminal']";
	public static String From_terminal_search_Haulage= "From_terminal_search_Haulage>//button[@id='HAL-HAL_btnFmTerminal']";
	public static String to_terminal_search= "to_terminal_search>//button[@id='IFC-IFC_btnToTerminal']";
	public static String to_terminal_search_external= "to_terminal_search>//button[@id='EFC-EFC_btnToTerminal']";
	public static String to_terminal_search_Haulage= "to_terminal_search_Haulage>//button[@id='HAL-HAL_btnToTerminal']";
	public static String eqp_group_dd_external= "eqp_group_dd>//label[@id='EFC-EFC_cmbEqGroup_label']";
	public static String eqp_group_dd_Haulage= "eqp_group_dd_Haulage>//label[@id='HAL-HAL_cmbEqGroup_label']";
	public static String eqp_group_dd= "eqp_group_dd>//label[@id='IFC-IFC_cmbEqGroup_label']";
	public static String start_date_in_feeder= "start_date>//input[@id='IFC-IFC_txtStartDate_input']";
	public static String start_date_ex_feeder= "start_date>//input[@id='EFC-EFC_txtStartDate_input']";
	public static String start_date_Haulage= "eqp_group_dd_Haulage>//input[@id='HAL-HAL_txtStartDate_input']";
	public static String to_date_in_feeder= "to_date_in_feeder>//input[@id='IFC-IFC_txtToDate_input']";
	public static String to_date_ex_feeder= "to_date_in_feeder>//input[@id='EFC-EFC_txtToDate_input']";
	public static String to_date_Haulage= "to_date_Haulage>//input[@id='HAL-HAL_txtToDate_input']";
	public static String amount_input_usd_external= "amount_input_usd>//input[@id='EFC-EFC_txtDetailTot_input']";
	public static String amount_input_usd= "amount_input_usd>//input[@id='IFC-IFC_txtDetailTot_input']";
	public static String Internal_feeder_pop= "Internal_feeder_pop>(//h2[text()='Internal Feeder Cost']//following::span)[2]";
	public static String Internal_feeder_ref_no= "Internal_feeder_ref_no>//input[@id='IFC-IFC_txtFdrRefNo']";
	public static String Service_search_internal_feeder="Service_search_internal_feeder>//button[@id='IFC-IFC_btnService-IFC_btnService']";
	public static String Service_search_external_feeder="Service_search_internal_feeder>//button[@id='EFC-EFC_btnService-EFC_btnService']";
	public static String mode_Haulage_click="mode_Haulage_click>//div[@id='HAL-HAL_cmbMode']";
	public static String Container_type_internal_feeder="Container_type_internal_feeder>//label[text()='%s']//preceding::div[1]";
	public static String Standard_cost_internal_feeder="Standard_cost_internal_feeder>//td[text()='%s']//following::td[3]";
	public static String ID_Popup_Ok_Button = "ID_Popup_Ok_Button>//h2//following::button[text()='Ok']";
	public static String Routing_click_close = "Routing_click_close>//span[@id='srrroutinggriddlg_title']//following::a[1]";
	public static String Routing_click = "Routing_click>//button[@id='SRR-SRR_btnRoute']";
	public static String get_mode = "get_mode>(//tbody[contains(@id,'SRR_srrroutingGrid_data')]//td)[2]";

	public static String conditional_Behaviour_Cost_Table_Rows_LC ="conditional_Behaviour_Cost_Table_Rows_LC>//tbody[@id='LDC-LDC_dsGrid2_data']/tr";
	public static String conditional_Behaviour_Cost_LocalAmount_LC ="conditional_Behaviour_Cost_LocalAmount_LC>//tbody[@id='LDC-LDC_dsGrid2_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'modelInput')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String conditional_Behaviour_Cost_LocalAmount_Input_LC ="conditional_Behaviour_Cost_LocalAmount_Input_LC>//tbody[@id='LDC-LDC_dsGrid2_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'modelInput')]/input[contains(@id,'modelInput_input')]";
	public static String conditional_Behaviour_Cost_Table_Rows_TC ="conditional_Behaviour_Cost_Table_Rows_TC>//tbody[@id='TSC-TSC_dsGrid2_data']/tr";
	public static String conditional_Behaviour_Cost_LocalAmount_TC ="conditional_Behaviour_Cost_LocalAmount_TC>//tbody[@id='TSC-TSC_dsGrid2_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'gridamount')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String conditional_Behaviour_Cost_LocalAmount_Input_TC ="conditional_Behaviour_Cost_LocalAmount_Input_TC>//tbody[@id='TSC-TSC_dsGrid2_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'gridamount')]/input[contains(@id,'gridamount_input')]";
	public static String conditional_Behaviour_Cost_Table_Rows_DC ="conditional_Behaviour_Cost_Table_Rows_DC>//tbody[@id='DSC-DSC_dsGrid2_data']/tr";
	public static String conditional_Behaviour_Cost_LocalAmount_DC ="conditional_Behaviour_Cost_LocalAmount_DC>//tbody[@id='DSC-DSC_dsGrid2_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'modelInput')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String conditional_Behaviour_Cost_LocalAmount_Input_DC ="conditional_Behaviour_Cost_LocalAmount_Input_DC>//tbody[@id='DSC-DSC_dsGrid2_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'modelInput')]/input[contains(@id,'modelInput_input')]";

	//	Discharge cost

	public static String new_Button_DC ="new_Button_DC>//table[@id='DSC-DSC_pnlMain']//button[contains(@id,'btnTblNew')]";
	public static String save_Button_DC ="save_Button_DC>//table[@id='DSC-DSC_pnlMain']//button[contains(@id,'btnsave')]";

	public static String location_SearchButton_DC ="location_SearchButton_DC>//button[@id='DSC-DSC_btnLocation']";
	public static String containerType_RadioButton_DC ="containerType_RadioButton_DC>(//input[contains(@id,'DSC-DSC_containerType') and @value='%s']/following::div[contains(@class,'ui-radiobutton-box')])[1]";
	public static String terminal_SearchButton_DC ="terminal_SearchButton_DC>//button[@id='DSC-DSC_btnTerminal']";
	public static String service_SearchButton_DC ="service_SearchButton_DC>//button[@id='DSC-DSC_btnService-DSC_btnService']";
	public static String eqp_Group_Dropdown_DC ="eqp_Group_Dropdown_DC>//div[@id='DSC-DSC_cmbEqup']";
	public static String t_Service_Dropdown_DC ="t_Service_Dropdown_DC>//div[@id='DSC-DSC_cmbtser']";
	public static String fromDate_DC ="t_Service_Dropdown_DC>//input[@id='DSC-DSC_txtFrm_input']";
	public static String toDate_DC ="toDate_DC>//input[@id='DSC-DSC_txtTo_input']";
	public static String standardCost_Table_Rows_DC ="standardCost_Table_Rows_DC>//tbody[@id='DSC-DSC_dsGrid1_data']/tr";
	public static String standardCost_Table_Headers_DC ="standardCost_Table_Headers_DC>//thead[@id='DSC-DSC_dsGrid1_head']//th";
	public static String standardCost_Table_LocalAmount_DC ="standardCost_Table_LocalAmount_DC>//tbody[@id='DSC-DSC_dsGrid1_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'modelInput')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String in_Transist_Checkbox_DC ="in_Transist_Checkbox_DC>//div[@id='DSC-DSC_chkInTransit']/div[contains(@class,'ui-chkbox-box')]";
	public static String pol_Add_Button_DC ="pol_Add_Button_DC>//button[@id='DSC-DSC_btnPOLAdd']";
	public static String standardCost_Table_LocalAmount_Input_DC ="standardCost_Table_LocalAmount_Input_DC>//tbody[@id='DSC-DSC_dsGrid1_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'modelInput')]/input[@type='text']";
	public static String cost_Origin_Location_Search_Button="cost_Origin_Location_Search_Button>//button[@id='EOO-EOO_btnLocation']";
	public static String Cost_Origin_Location_TF="Cost_Origin_Location_TF>//input[@id='EOO-EOO_txtLocationCode']";
	public static String cost_Origin_Equipment_Type_Plus_Button="cost_Origin_Equipment_Type_Plus_Button>//button[@id='EOO-EOO_btnEqpAdd-EOO_btnEqpAdd']";
	public static String cost_Origin_Amount_TF="cost_Origin_Amount_TF>//input[@id='EOO-EOO_txtAmt_input']";
	public static String cost_Origin_Start_Date="cost_Origin_Start_Date>//input[@id='EOO-EOO_txtFrom_input']";
	public static String cost_Origin_End_Date="cost_Origin_End_Date>//input[@id='EOO-EOO_txtTo_input']";
	public static String cost_Origin_amount_Type_Dropdown="cost_Origin_amount_Type_Dropdown>//div[@id='EOO-EOO_cmbcurr']";
	public static String cost_Origin_Amount_Type_Select="cost_Origin_Amount_Type_Select>//div[@id='EOO-EOO_cmbcurr_panel']//li[text()='%s']";
	public static String cost_Delivery_Location_TF="cost_Delivery_Location_TF>//input[@id='CDO-CDO_txtLocationCode']";
	public static String cost_Delivery_Location_Search_Button="cost_Delivery_Location_Search_Button>//button[@id='CDO-CDO_btnLocation']";
	public static String cost_Delivery_Equipment_Type_Plus_Button="cost_Delivery_Equipment_Type_Plus_Button>//button[@id='CDO-CDO_btnEqpAdd']"; 
	public static String cost_Delivery_Start_Date="cost_Delivery_Start_Date>//input[@id='CDO-CDO_txtFrom_input']";
	public static String cost_Delivery_End_Date="cost_Delivery_End_Date>//input[@id='CDO-CDO_txtTo_input']";
	public static String cost_Delivery_Amount_TF="cost_Delivery_Amount_TF>//input[@id='CDO-CDO_txtAmt_input']";
	public static String cost_Delivery_Amount_Type_Dropdown="cost_Delivery_Amount_Type_Dropdown>//div[@id='CDO-CDO_cmbcurr']";
	public static String cost_Delivery_Amount_Type_Select="cost_Delivery_Amount_Type_Select>//div[@id='CDO-CDO_cmbcurr_panel']//li[text()='USD']";

	//	Transhipment cost

	public static String new_Button_TC ="new_Button_TC>//table[@id='TSC-TSC_pnlMain']//button[contains(@id,'btnTblNew')]";
	public static String transhipment_Type_TC ="transhipment_Type_TC>//div[@id='TSC-TSC_cmbType']";
	public static String save_Button_TC ="save_Button_TC>//table[@id='TSC-TSC_pnlMain']//button[contains(@id,'btnsave')]";
	public static String location_SearchButton_TC ="location_SearchButton_TC>//button[@id='TSC-TSC_btnLocation-TSC_btnLocation']";
	public static String containerType_RadioButton_TC ="containerType_RadioButton_TC>(//input[contains(@id,'TSC-TSC_containerType') and @value='%s']/following::div[contains(@class,'ui-radiobutton-box')])[1]";
	public static String terminal_SearchButton_TC ="terminal_SearchButton_TC>//button[@id='TSC-TSC_btnTerminal']";
	public static String service_SearchButton_TC ="service_SearchButton_TC>//button[@id='TSC-TSC_btnService-TSC_btnService']";
	public static String eqp_Group_Dropdown_TC ="eqp_Group_Dropdown_TC>//div[@id='TSC-TSC_cmbEqup']";
	public static String startDate_TC ="startDate_TC>//input[@id='TSC-TSC_txtFrm_input']";
	public static String endDate_TC ="endDate_TC>//input[@id='TSC-TSC_txtTo_input']";
	public static String standardCost_Table_Rows_TC ="standardCost_Table_Rows_TC>//tbody[@id='TSC-TSC_dsGrid1_data']/tr";
	public static String standardCost_Table_Headers_TC ="standardCost_Table_Headers_TC>//thead[@id='TSC-TSC_dsGrid1_head']//th";
	public static String standardCost_Table_LocalAmount_TC ="standardCost_Table_LocalAmount_TC>//tbody[@id='TSC-TSC_dsGrid1_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'gridamount')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String standardCost_Table_LocalAmount_Input_TC ="standardCost_Table_LocalAmount_Input_TC> //tbody[@id='TSC-TSC_dsGrid1_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'gridamount')]/input[contains(@id,'TSC_gridamount_input')]";
	public static String Srr_missing_cost_exit_button = "Srr_missing_cost_exit_button>//button[@id='btnConExist']";
	public static String refresh_contribution_Srr= "refresh_contribution_Srr>//button[@id='SRR-SRR_btnRefContribution']";
	public static String Module_Close ="Module_Close>//div[contains(@id,'centerMainPnl')]//li[@aria-selected='true' and @aria-expanded='true']//a//i[contains(@class,'mdlclose')]";
	public static String internalCost_Table_Rows_DC ="internalCost_Table_Rows_DC>//tbody[@id='IFC-IFC_gridDetail_data']/tr";
	public static String iternalCost_Table_LocalAmount_Input_DC ="standardCost_Table_LocalAmount_Input_DC>//tbody[@id='IFC-IFC_gridDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'txtLocAmt')]/input[contains(@id,'txtLocAmt_input')]";
	public static String conditional_Behaviour_Cost_Table_Rows_in ="conditional_Behaviour_Cost_Table_Rows_in>//tbody[@id='IFC-IFC_gridSubDetail_data']/tr";
	public static String conditional_Behaviour_Cost_LocalAmount_IN ="conditional_Behaviour_Cost_LocalAmount_DC>//tbody[@id='IFC-IFC_gridSubDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'txtLocAmt')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String conditional_Behaviour_Cost_LocalAmount_Input_in ="conditional_Behaviour_Cost_LocalAmount_Input_in>//tbody[@id='IFC-IFC_gridSubDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'txtLocAmt')]/input[contains(@id,'txtLocAmt_input')]";
	public static String conditional_Behaviour_Cost_Table_Rows_internal ="conditional_Behaviour_Cost_Table_Rows_internal>//tbody[@id='IFC-IFC_gridSubDetail_data']/tr";

	//

	public static String standardCost_Table_Rows_EFC ="standardCost_Table_Rows_EFC>//tbody[@id='EFC-EFC_gridDetail_data']/tr";
	public static String standardCost_Table_LocalAmount_EFC ="standardCost_Table_LocalAmount_EFC>//tbody[@id='EFC-EFC_gridDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'txtLocAmt')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String standardCost_Table_LocalAmount_Input_EFC ="standardCost_Table_LocalAmount_Input_EFC>//tbody[@id='EFC-EFC_gridDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'txtLocAmt')]/input[contains(@id,'txtLocAmt_input')]";
	public static String conditional_Behaviour_Cost_Table_Rows_EFC ="conditional_Behaviour_Cost_Table_Rows_EFC>//tbody[@id='EFC-EFC_gridSubDetail_data']/tr";
	public static String conditional_Behaviour_Cost_LocalAmount_EFC ="conditional_Behaviour_Cost_LocalAmount_EFC>//tbody[@id='EFC-EFC_gridSubDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'txtLocAmt')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String conditional_Behaviour_Cost_LocalAmount_Input_EFC ="conditional_Behaviour_Cost_LocalAmount_Input_EFC>//tbody[@id='EFC-EFC_gridSubDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'txtLocAmt')]/input[contains(@id,'txtLocAmt_input')]";

	//
	public static String standardCost_Table_Rows_HC ="standardCost_Table_Rows_HC>//tbody[@id='HAL-HAL_gridDetail_data']/tr";
	public static String standardCost_Table_LocalAmount_HC ="standardCost_Table_LocalAmount_HC>//tbody[@id='HAL-HAL_gridDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'HAL_amount')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String standardCost_Table_LocalAmount_Input_HC ="standardCost_Table_LocalAmount_Input_HC>//tbody[@id='HAL-HAL_gridDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'ui-cell-editor-input')]/span[contains(@id,'HAL_amount')]/input[contains(@id,'HAL_amount1_input')]";
	public static String conditional_Behaviour_Cost_Table_Rows_HC ="conditional_Behaviour_Cost_Table_Rows_HC>//tbody[@id='HAL-HAL_gridSubDetail_data']/tr";
	public static String conditional_Behaviour_Cost_LocalAmount_HC ="conditional_Behaviour_Cost_LocalAmount_HC>//tbody[@id='HAL-HAL_gridSubDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'HAL_amount')]//parent::div/preceding-sibling::div[contains(@class,'editor-output')]";
	public static String conditional_Behaviour_Cost_LocalAmount_Input_HC ="conditional_Behaviour_Cost_LocalAmount_Input_HC>//tbody[@id='HAL-HAL_gridSubDetail_data']/tr/td[text()='%s']/following-sibling::td//div[contains(@class,'editor-input')]/span[contains(@id,'HAL_amount')]/input[contains(@id,'HAL_amount2_input')]";

	public static String Special_Rate_Request_Module = "Special_Rate_Request_Module>//div[contains(@id,'centerMainPnl')]//li//label[text()='Special Rate Request(SRR)']//ancestor::a";
	public static String SRR_Port_Pair_Details_Rows="SRR_Port_Pair_Details_Rows>//tbody[@id='SRR-SRR_detailViewGrid_data']//tr";
	public static String SRR_Port_Pair_Details_Row="SRR_Port_Pair_Details_Rows>//tbody[@id='SRR-SRR_detailViewGrid_data']//tr[%s]";
	public static String RR_Ocean_Freight_Details_Table_Headers="RR_Ocean_Freight_Details_Table_Headers>//thead[@id='REQ-REQ_OFRGrid_head']//th";
	public static String RR_Ocean_Freight_Details_Table_Rows = "RR_Ocean_Freight_Details_Table_Rows>//tbody[@id='REQ-REQ_OFRGrid_data']//tr";
	public static String srr_Req_Type_Select="srr_Req_Type_Select>//div[@id='SRLform-cmbType_panel']//li[text()='%s']";
	public static String tool_pannel="tool_pannel>//div[@id='SRLform-treeTable_nfr_toolpanel_li_id']";
	public static String condition_Filter="condition_Filter>//a[@id='SRLform-treeTable_conditionFilter_id']";
	public static String Srr_No_TF="Srr_No_TF>//input[@aria-label='SRR No Filter Input']";

	public static String mail_Cancel_Button ="mail_Cancel_Button>//button[@id='REQ_emaileditor-REQ_emailEditorForm-REQ_emailEditorCancelBtn']";
	public static String specialRateRequest_Edit_Button ="specialRateRequest_Edit_Button>//button[@id='SRR-tbl-btnTblEdit']";
	public static String specialRateRequest_Approve_Button ="specialRateRequest_Approve_Button>//button[@id='SRR-SRR_btnAccept']";
	public static String specialRateRequest_Save_Button ="specialRateRequest_Save_Button>//button[@id='SRR-tbl-btnsave']";
	public static String specialRateRequest_Status ="specialRateRequest_Status>//span[@id='SRR-SRR_lblStatus']";
	public static String specialRateRequest_Table_Headers ="specialRateRequest_Table_Headers>//thead[@id='SRR-SRR_detailViewGrid_head']//th";
	public static String specialRateRequest_Table_Rows ="specialRateRequest_Table_Rows>//tbody[@id='SRR-SRR_detailViewGrid_data']/tr";
	public static String rate_Calculation_Type="rate_Calculation_Type>//input[@id='REQ-REQ_txtEquipment_auto1_input']";
	public static String counter_Button="counter_Button>//button[@id='SRR-SRR_btnCounter']";
	public static String OFr_Text_Field_SRR="OFr_Text_Field_SRR>//input[@id='SRR-SRR_txtallin_input']";
	public static String Remarks_Field_SRR="Remarks_Field_SRR>//textarea[@id='SRR-SRR_txtarFirstRemark']";
	public static String apply_Rate_Button_SRR="apply_Rate_Button_SRR>//button[@id='SRR-SRR_btnApply']";
	public static String surcharge_Plus_Button_SRR="surcharge_Plus_Button_SRR>//button[@id='SRR-SRR_btnManSur']";
	public static String surcharge_Amount_Grid_SRR="surcharge_Amount_Grid_SRR>//div[@id='SRR-SRR_surchargeGrid']//td[text()='%s']//following-sibling::td[3]";
	public static String surcharge_Amount_Input="surcharge_Amount_Input>//div[@id='SRR-SRR_surchargeGrid']//td[text()='%s']//following-sibling::td[3]//input[1]";
	public static String rate_Type="rate_Type>//div[@id='REQ-REQ_cmbReqcalcType']";
	public static String ratetype_Select="ratetype_Select>//ul[@id='REQ-REQ_cmbReqcalcType_items']//li[text()='%s']";
	public static String min_Base_Rate="min_Base_Rate>//input[@id='REQ-REQ_mbaserate_input']";
	public static String min_Base_Rate_Quantity="min_Base_Rate_Quantity>//input[@id='REQ-REQ_mbaserateqty']";
	public static String add_Dimensions_Button="add_Dimensions_Button>//button[@id='REQ-REQ_btnDimensions']";
	public static String dimension_Grs_Weight="dimension_Grs_Weight>//input[@id='DimensionsDlg2-weight2_input']";
	public static String dimension_Length="dimension_Length>//input[@id='DimensionsDlg2-length2_input']";
	public static String dimension_Width="dimension_Width>//input[@id='DimensionsDlg2-width2_input']";
	public static String dimension_Height="dimension_Height>//input[@id='DimensionsDlg2-height2_input']";
	public static String dimension_Quantity="dimension_Quantity>//input[@id='DimensionsDlg2-qty2']";
	public static String package_Desc_Search_Button="package_Desc_Search_Button>//button[@id='DimensionsDlg2-REQ_btnbbpackage2-REQ_btnbbpackage2']";
	public static String dimension_Add_Button="dimension_Add_Button>//button[@id='DimensionsDlg2-btnadddimen2']";
	public static String dimension_Ok_Button="dimension_Ok_Button>//button[@id='DimensionsDlg2-btnOkDim2']";
	public static String ID_Popup_Msg ="ID_Popup_Msg>//h2//following-sibling::span[2]";
	public static String ID_Proceed_Popup_Msg ="ID_Proceed_Popup_Msg>//h2//following-sibling::span[contains(text(),'Do you want to proceed')]";
	public static String ID_Popup_Yes_Button = "ID_Popup_Yes_Button>//h2//following::button[text()='Yes']";
	public static String ID_Popup_No_Button = "ID_Popup_No_Button>//h2//following::button[text()='No']";
	public static String Special_RR_Header="Special_RR_Header>//thead[@id='SRR-SRR_OFRGrid_head']//th";
	public static String Special_RR_Row="Special_RR_Row>//tbody[@id='SRR-SRR_OFRGrid_data']//tr";
	//14/02
	public static String toolBar_save_Button ="toolBar_save_Button>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'SRR-tbl-btnsave')]";
	//15/02

	public static String counter_btn_Srr="counter_btn_Srr>//button[@id='SRR-SRR_btnCounter']";
	public static String ofr_txtfld_Srr="ofr_txtfld_Srr>//input[@id='SRR-SRR_txtallin_input']";
	public static String remarks_txtfld_Srr="remarks_txtfld_Srr>//textarea[@id='SRR-SRR_txtarFirstRemark']";
	public static String apply_rate_Btn="apply_rate_Btn>//button[@id='SRR-SRR_btnApply']";
	public static String open_RadioButton="open_RadioButton>//table[@id='SRLform-SRL_rdSubmit']//following::label[.='OPEN  ']";
	public static String srr_Status="srr_Status>//span[@id='SRR-SRR_lblStatus']";
	public static String port_pair_Status="port_pair_Status>//tbody[@id='SRR-SRR_detailViewGrid_data']//td[1]";
	public static String ofr_table_headers="ofr_table_headers>//div[@id='SRR-SRR_OFRGrid']//thead//th";
	public static String ofr_table_rows="ofr_table_rows>//div[@id='SRR-SRR_OFRGrid']//tbody//tr";
	public static String ofr_table_grid="ofr_table_grid>//div[@id='SRR-SRR_OFRGrid']";
	public static String accept_btn_srr="accept_btn_srr>//button[@id='SRR-SRR_btnAccept']";
	public static String rate_btn_srr="rate_btn_srr>//button[@id='SRR-SRR_btnresubmit']";
	public static String recall_btn_srr="recall_btn_srr>//button[@id='SRR-SRR_btnresubmit']";
	public static String srr_popup="srr_popup>//h2[.='Special Rate Request(SRR)']/..//span[2]";
	public static String surcharges_Add_button="surcharges_Add_button>//button[@id='SRR-SRR_btnManSur']";
	public static String surcharge_details_table_Srr="surcharge_details_table_Srr>//div[@id='SRR-SRR_surchargeGrid']//div[contains(@class,'scrollable-body')]";
	public static String surcharge_amount_field="surcharge_amount_field>//tbody[@id='SRR-SRR_surchargeGrid_data']//tr//td[.='%s']//following-sibling::td[3]";
	//18-02-2025
	public static String export_detention_txtfld_Srr="export_detention_txtfld_Srr>//input[@id='SRR-SRR_expfree']";
	public static String import_detention_txtfld_Srr="import_detention_txtfld_Srr>//input[@id='SRR-SRR_impfree']";
	public static String export_demmurage_txtfld_Srr="export_demmurage_txtfld_Srr>//input[@id='SRR-SRR_expdem']";
	public static String import_demmurage_txtfld_Srr="import_demmurage_txtfld_Srr>//input[@id='SRR-SRR_impdem']";
	public static String Popup_Message="Popup_Message>(//div[@class='ui-growl-item']//following::p)";
	public static String approval_val ="approval_val>//td[text()='APPROVED']";
	public static String Filed_val ="Filed>//span[text()='FILED']";

	public static String Auto_Panel_First1 = "Auto_Panel_First>((//div[contains(@id,'auto') and contains(@style,'display: block')])//following::td[.='%s'])";
    public static String payment = "payment>//label[@id='REQ-REQ_payment_label']";
	public static String PayAt ="PayAt>//div[@id='REQ-REQ_payment_panel']//li[text()='PayAt']";
	public static String Payment_search="Payment_search>//button[@id='REQ-REQ_btnloc']";
	public static String Service_Details ="Service_Details>//label[@id='REQ-REQ_lblRouting']";
	public static String Location_Code_filed="Location_Code_filed>//input[@aria-label='Location Code Filter Input']";
	public static String payAt_rows ="payAt_Table>//div[@id='nfr-twocolsearch-div']//div[@ref='eCenterColsClipper']//div[@role='row']";
	public static String Payat_table_cancle="Payat_table_close>(//div[@id='nfr-twocolsearch-div']//following::span[text()='Cancel'])[1]";
	public static String prepaid_option="prepaid_option>//div[@id='REQ-REQ_payment_panel']//li[text()='Prepaid']";



	//	Load cost

	//admin cost


	//	public static String Filter_Button1 ="Filter_Button>//tbody[@id='REQ-REQ_OFRGrid_data']//tr";
	//	public static String column_Values1 = "column_Values>//div[@ref='eCenterContainer']//div[@col-id='C2']";
	//	public static String globale_Value_select="BL_Number_select>//div[@id='nfr-jdlgGrid-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
	//	public static String SelectButton="SelectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	//	public static String Mail_Cancel_button = "Mail_Cancel_button>//button[@id='FCN_emaileditor-FCN_emailEditorForm-FCN_emailEditorCancelBtn']";
	//	public static String Filter_Button1 ="Filter_Button>(//div[@ref='eRootWrapper']//button[@ref='eButtonShowMainFilter']//span)[2]";
	//	public static String column_Values1 = "column_Values>//div[@ref='eCenterContainer']//div[@col-id='C2']";
	//	public static String globale_Value_select="BL_Number_select>//div[@id='nfr-jdlgGrid-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
	//	public static String SelectButton="SelectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	//	public static String Mail_Cancel_button = "Mail_Cancel_button>//button[@id='FCN_emaileditor-FCN_emailEditorForm-FCN_emailEditorCancelBtn']";
	//	public static String Filter_Button1 ="Filter_Button>(//div[@ref='eRootWrapper']//button[@ref='eButtonShowMainFilter']//span)[2]";
	//	public static String column_Values1 = "column_Values>//div[@ref='eCenterContainer']//div[@col-id='C2']";
	//	public static String globale_Value_select="BL_Number_select>//div[@id='nfr-jdlgGrid-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
	//	public static String SelectButton="SelectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	//	public static String Mail_Cancel_button = "Mail_Cancel_button>//button[@id='FCN_emaileditor-FCN_emailEditorForm-FCN_emailEditorCancelBtn']";
	//	public static String Filter_Button1 ="Filter_Button>(//div[@ref='eRootWrapper']//button[@ref='eButtonShowMainFilter']//span)[2]";
	//	public static String column_Values1 = "column_Values>//div[@ref='eCenterContainer']//div[@col-id='C2']";
	//	public static String globale_Value_select="BL_Number_select>//div[@id='nfr-jdlgGrid-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
	//	public static String SelectButton="SelectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	//	public static String Mail_Cancel_button = "Mail_Cancel_button>//button[@id='FCN_emaileditor-FCN_emailEditorForm-FCN_emailEditorCancelBtn']";


}
