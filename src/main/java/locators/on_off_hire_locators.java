package locators;

public interface on_off_hire_locators extends Scale_In_Out_Reference {

	// TS_041

		public static String stockreport_modulename = "stockreport_modulename>(//span[text()='Stock Report by Size / Type Detail Report'])[2]";
		public static String locations_inputfield = "locations_inputfield>(//label[text()='Location Hierarchy'])//following::span[1]";
		public static String countrysearchicon = "countrysearchicon>//*[@id='ETR-ETR_btnRegion']";
		public static String sizetype_dropdown = "sizetype_dropdown>(//label[text()='Size/Type'])[1]//following::span[1]";
		public static String In_transit_checkbox = "In_transit_checkbox>//*[text()='In Transit']//preceding::span[1]";
		public static String report_downloadbtn = "report_downloadbtn>//button[@id='ETR-ETR_detailRqstDialog-DCP_CmdBtn']";
		public static String Request_sent = "Request_sent>//*[text()='Report Request sent']";
		public static String process_num = "process_num>//*[@id='ETR-ETR_detailRqstDialog-DCPDialogform-DCP_DataTable-0-dcpRqstId']";
		public static String Location_code = "Country_code>(//div[@ref='eFloatingFilterInput']//input)[1]";




		  public static String Stock_Report_Table ="Stock_Report_Table>//div[@id='SBS-SBS_vsltable_tbl']";
		  	public static String Stock_Column_Header ="Stock_Column_Header>//div[@id='SBS-SBS_vsltable_tbl']//span[@ref='eText' and text()='%s']//ancestor::div[@col-id]";
		  	public static String select_Stock_Table ="select_Stock_Table>//div[@col-id='%s' and text()='%s']//following-sibling::div[@col-id='%s' and text()='%s']";
		  	public static String Strock_Summary_Table_Rows = "Strock_Summary_Table_Rows>//div[contains(@id,main) and @aria-hidden='false']//tbody[contains(@id,'cntrgrid')]//tr";
		  	public static String Strock_Summary_Next_Page_Button="Strock_Summary_Next_Page_Button>//div[contains(@id,main) and @aria-hidden='false']//a[@aria-label='Next Page']";
		  	 public static String Date_Select = "Date_Select>//div[contains(@id,'datepicker')]//a[text()='%s']";
		  	public static String Aimport_excelll = "import_excel>//button[@id='LBU-LBU_TemplateDownLoadBtn']//preceding::span[text()='Import Excel']";
		  	public static String Gird_click="Gird_click>//div[text()='%s']//following::div[text()='%s']";
		  	 public static String Stock_Report_Table1 ="Stock_Report_Table1>//div[@id='ETR-ETR_TrackingGrid']";
		  	public static String Stock_Column_Header1 ="Stock_Column_Header>//div[@id='ETR-ETR_TrackingGrid']//span[@ref='eText' and text()='%s']//ancestor::div[@col-id]";
		  	public static String Strock_Summary_Table_Rows1 = "Strock_Summary_Table_Rows>//div[contains(@id,main) and @aria-hidden='false']//tbody[contains(@id,'ETR_Jdlcntrlistform-ETR_cntrlistGrid_data')]//tr";

		    public static String service_checkbox_SR="service_checkbox_SR>//label[.='Service']/..//div[@id='SUM-SUM_btnGrp1']";
		  	 public static String service_search_icon_SR="service_search_icon_SR>//button[@Id='SUM-SUM_btnservice-SUM_btnservice']";
		  	public static String location_hierarchy_dd_SR="location_hierarchy_dd_SR>//label[@id='SUM-SUM_cmbselection_label']";
		  	public static String location_hierarchy_dd_Options_SR="location_hierarchy_dd_Options_SR>//ul[@id='SUM-SUM_cmbselection_items']//li[text()='%s']";
			public static String location_hierarchy_search_icon="location_hierarchy_search_icon>//button[@id='SUM-SUM_btnsele']";
			public static String mty_full_indicator_SR="mty_full_indicator_SR>//label[@id='SUM-SUM_cmbEFindicator_label']";
			public static String mty_full_indicator_options_SR="mty_full_indicator_options_SR>//ul[@id='SUM-SUM_cmbEFindicator_items']//li[.='%s']";
			public static String size_type_options_SR="size_type_options_SR>//div[@id='SUM-SUM_btnGrp']//div//span[.='%s']";
			public static String show_btn_SR="show_btn_SR>//button[@id='SUM-SUM_btnshow']";
			public static String SR_module_table="SR_module_table>//div[@id='SUM-SUM_vsltable_tbl']";
			public static String target_cell_value="target_cell_value>//div[@col-id='H2' and text()='%s']";
			public static String targeting_cell_size_type_value="targeting_cell_size_type_value>//div[text()='%s']/preceding-sibling::div[@col-id='%s' and text()='%s']";
			public static String stock_report_panel="stock_report_panel>//div[@id='SUM_JDlgMsg']";
			public static String bottom_panel="bottom_panel>//div[@id='SUM_cntrgridGrid_paginator_bottom']";
			public static String page_count_select="page_count_select>//select[contains(@id,'SUM_cntrgridGrid')]";
			public static String size_type_panel_rows="size_type_panel_rows>//tbody[@id='SUM_cntrgridGrid_data']//tr";
			public static String service_panel_rows = "Strock_Summary_Table_Rows>//div[contains(@id,main) and @aria-hidden='false']//tbody[contains(@id,'cntrgrid')]//tr";
		  	public static String service_panel_next_button="Strock_Summary_Next_Page_Button>//div[contains(@id,main) and @aria-hidden='false']//a[@aria-label='Next Page']";

		  	public static String panel_Close ="panel_Close>//div[contains(@id,main) and @aria-hidden='false']//span[contains(@id,'SUM_JDlgMsg')]//following-sibling::a[@aria-label='Close']";

			public static String service_column_header ="service_column_header>//div[@id='SUM-SUM_vsltable_tbl']//span[@ref='eText' and text()='%s']//ancestor::div[@col-id]";
			public static String Column_SelectMenu ="Column_SelectMenu>(//div[@ref='sideBarButtons']//span[.='Columns'])[1]";
			public static String Column_Search_Input ="Column_Search_Input>(//input[@aria-label='Filter Columns Input'])[1]";
			public static String SelectAll_Column_CheckBox ="SelectAll_Column_CheckBox>(//input[@aria-label='Toggle Select All Columns'])[1]";
			public static String Select_Column_tableHead ="Select_Column_tableHead>//div[@ref='sideBar']//span[text()='%s']";
			

			//36
			public static	String condt_input ="condt_input>//ul[@id='LSR-LSR_cbxCond_items']//li[text()='%s']";
			public static	String reportype_input ="reportype_input>//ul[@id='LSR-LSR_cbxRptType_items']//li[text()='%s']";
			public static	String leasekind_input ="leasekind_input>//ul[@id='LSR-LSR_cbxLKind_items']//li[text()='%s']";
			public static	String sz_tp_btn ="sz_tp_btn>//span[text()='%s']";
			public static	String sum_det_btn ="sum_det_btn>//span[text()='%s']";
			public static	String location_hierarchy_type ="location_hierarchy_type>//ul[@id='LSR-LSR_cbxLocaHire_items']//li[text()='%s']";
			public static String grid_data = "grid_data>//*[@col-id='serno' and text()='%s']";		

			//37
			
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
		//40
			
			public static 	String location_hierarchy_type6 = "location_hierarchy_type6>//ul[@id='ETR-ETR_cmbEf_items']//li[text()='%s']";
			public static 	String folder11 = "folder11>//div[@id='ETR-ETR_tree']//*[text()='%s']//preceding::span[2]";
			//public static String folder_drop = "folder_drop>(//*[text()='"+folder2+"'])[1]";
			public static String sizetype_type = "sizetype_type>//ul[@id='ETR-ETR_cmbSizeType_items']//li[text()='%s']";
			public static String Selected_Data = "Selected_Data>//div[text()='%s']";
			public static String grid_Check40="grid_Check40>(//div[@col-id='H1'])[%s]";
			public static String term_Grid_Check="term_Grid_Check>(//div[text()='%s'])[1]";
			public static String total_Records="total_Records>//label[@id='ETR-ETR_TrackingGrid_records_lbl_cnt']";
			public static String container_Check_Click="container_Check_Click>(//*[@col-id='H2'])[2]";
			public static String container_List_Popup="container_List_Popup>//div[@id='ETR_Jdlcntrlist']";
			public static String sizetype_type1 = "sizetype_type1>//ul[@id='ETR-ETR_cmbSizeType_items']//li[text()='%s']";
			public static String location_hierarchy_type7 = "location_hierarchy_type7>//ul[@id='ETR-ETR_cmbEf_items']//li[text()='%s']";
			
		//42
			
			public static String grid_location="grid_location>(//div[text()='%s']//following::div[text()='%s' and @col-id='H3'])[1]";
			public static String grid_Location42_Check="grid_Location42_Check>(//td[text()='%s'])[2]";
			public static String location_hierarchy_type42 = "location_hierarchy_type>//ul[@id='SBS-SBS_cmbselection_items']//li[text()='%s']";
			public static String sizetype_type42 = "sizetype_type>//ul[@id='SBS-SBS_cmbsize_items']//li[text()='%s']";
			public static String grid_Check42="grid_Check42>(//div[@col-id='H1'])[%s]";
			//ul[@id='SBS-SBS_cmbselection_items']//li[.='Country']
			public static String total_Records42="total_Records42>//label[@id='SBS-SBS_vsltable_records_lbl_cnt']";

			  //common
		  	
		  	public static String select_Second="select_Second>//select[@id='second_type']";
		  	public static String select_Third="select_Third>//select[@id='third_type']";

			public static String panel_first_click="bl_panel_first_click>//div[@id='nfr-twocolsearch-div']//div[@ref='eCenterContainer']//div[@row-index='0']";
			public static String gridvalue_by_index = "gridvalue_by_index>(//div[@col-id='%s'])[%s]";
			public static String ems_page_on_off_hire="ems_page_on_off_hire>//span[@id='LSR_JDlgMsg_title']";
			public static String total_records = "total_records>//label[@id='LSR_cntrgridGrid_records_lbl_cnt']";
			public static String ems_stock_count_select="ems_stock_count_select>//select[contains(@id,'ETR_Jdlcntrlistform-ETR_cntrlistGrid')]";
			public static String ems_total_pages="ems_total_pages>(//div[@id='ETR_Jdlcntrlistform-ETR_cntrlistGrid_paginator_bottom']//span)[1]";
			public static String ems_next_page="ems_next_page>//div[@id='ETR_Jdlcntrlistform-ETR_cntrlistGrid_paginator_bottom']//a[@aria-label='Next Page']";
			public static String ems_panel_close="ems_panel_close>//span[@id='LSR_JDlgMsg_title']/..//a";
			public static String grand_total_in_page ="grand_total_in_page>//div[.='Grand Total']//following-sibling::div[@col-id='%s']";
			public static String summary_option ="summary_option>//span[.='Summary']";
			public static String close_btn ="close_btn>//span[.='Report Request']/..//a";
			public static String ems_page_heading="ems_page_heading>//span[@id='ETR_Jdlcntrlist_title']";
			public static String ems_equip_details_count="ems_equip_details_count>//tbody[@id='ETR_Jdlcntrlistform-ETR_cntrlistGrid_data']//tr";

		  	public static String Panel_Close ="panel_Close>//div[contains(@id,main) and @aria-hidden='false']//span[contains(@id,'CntrList')]//following-sibling::a[@aria-label='Close']";

		    public static String click_showbtn = "click_showbtn>//button[@id='LSR-LSR_btnShowRpt']";

			public static String click_showbtn40 = "click_showbtn>//button[@id='ETR-ETR_btnShow']";


			public static String click_showbtn_stock_status = "click_showbtn_stock_status>//button[@id='SBS-SBS_btnshow']";

			public static String supcon_add_icon = "supcon_add_icon>//button[@id='ETR-ETR_btnsupconAdd']";
			public static String supcon_inp_field = "supcon_inp_field>//input[@aria-label='Supplier Contract Filter Input']";
			public static String supcon_value = "supcon_value>(//div[@col-id='C1'])[2]";
			public static String cuscon_add_icon = ">//button[@id='ETR-ETR_btncusconAdd']";
			public static String cuscon_inp_field = "supcon_inp_field>//input[@aria-label='Customer Contract Filter Input']";
			public static String cuscon_value = "cuscon_value>(//div[@col-id='C1'])[2]";
			public static String sz_tp_group = "sz_tp_group>//span[text()='Sz/Tp Group']";
			public static String sz_tp_ungroup = "sz_tp_ungroup>//span[text()='Sz/Tp UnGroup']";
			public static String sz_tp_special = "sz_tp_special>//span[text()='Sz/Tp Special']";
			public static String sz_tp_standard = "sz_tp_standard>//span[text()='Sz/Tp Standard']";
			public static String summary = "summary>//span[text()='Summary']";
			public static String detail = "detail>//span[text()='Detail']";
			public static String novalue_popup = "novalue_popup>//*[text()='Values should be selected']";
			public static String novalue_popup_close = "novalue_popup_close>//div[@id='primefacesmessagedlg']//a[@role='button']";
			public static String searchfield_close = "lessor_inpfield_close//div[@aria-labelledby='nfr_sch_multicolumn_title']//a[@aria-label='Close']";
			public static String searchfield_selectbtn = "searchfield_selectbtn>//button[@id='multicol_okbtn']";

			public static String lessor_add_icon = "lessor_add_icon>//button[@id='ETR-ETR_btnlessAdd']";
			public static String lessor_inp_field = "lessor_inp_field>//input[@aria-label='Lessor Code Filter Input']";
			public static String lessor_value = "lessor_value>(//div[@col-id='C1'])[2]";
			public static String lessee_add_icon = "lessee_value>//button[@id='ETR-ETR_btnlesseeAdd']";
			public static String lessee_inp_field = "lessee_inp_field>//input[@aria-label='Lessee Code Filter Input']";
			public static String lessee_value = "lessee_value>(//div[@col-id='C1'])[2]";
			public static String leasekind_add_icon = "leasekind_value>//button[@id='ETR-ETR_btnleaAdd']";


		  	public static String panel_Close1 ="panel_Close>//div[contains(@id,main) and @aria-hidden='false']//span[contains(@id,'ETR_Jdlcntrlist_title')]//following-sibling::a[@aria-label='Close']";

			
			public static String carrier_Search_Button="carrier_Search_Button>//button[@id='SSP-SSP_btncarrier-SSP_btncarrier']";
		  	public static String Location_Heirachy_Search_Btn="Location_Heirachy_Search_Btn>//button[@id='SSP-SSP_btnsele']";
		    public static String view_by_Port_CheckBox="view_by_Port_CheckBox>//label[@id='SSP-SSP_lbl_chkByPort']//preceding::div[@id='SSP-SSP_chkByPort']";
		    public static String service_Checkbox_Click="service_Checkbox>//label[@id='SSP-SSP_lbl_jRadiobtnservice']//preceding::div[@id='SSP-SSP_buttonGroupService']";
		    public static String service_search_Button="service_search_Button>//button[@id='SSP-SSP_btnservice-SSP_btnservice']";
		    public static String size_Type_Select="size_Type_Select>//div[contains(@id,'SSP-SSP_buttonGroup')]//span[text()='%s']";
		    public static String Size_Type_show_Button="Size_Type_show_Button>//button[@id='SSP-SSP_btnshow']";
		    public static String stock_Report_Size_Type_Table="stock_Report_Size_Type_Table>//div[@id='SSP-SSP_vsltable_tbl']";
		    public static String toolPannel="toolPannel>//div[@id='SSP-SSP_vsltable_nfr_toolpanel_li_id']";
		    public static String condition_Filter="condition_Filter>//a[@id='SSP-SSP_vsltable_conditionFilter_id']";
		    public static String location_TF="location_TF>//input[@aria-label='Location Filter Input']";
		    public static String Equipment_type_TF="Equipment_type_TF>//input[@aria-label='Equipment Type Filter Input']";
		    public static String ST_service_column_header="ST_service_column_header>//div[@id='SSP-SSP_vsltable']//span[@ref='eText' and text()='%s']//ancestor::div[@col-id]";
		    public static String targeting_cell_stock_type_value_check="targeting_cell_stock_type_value_>//div[text()='%s']/following-sibling::div[@col-id='%s' and text()='%s']";
		    public static String stock_Size_Pannel="stock_Size_Pannel>//div[@id='SSP_JdlgCntrList']";
		    public static String Next_Button="Next_Button>//div[contains(@id,main) and @aria-hidden='false']//a[@aria-label='Next Page']";
		    public static String Size_Type_Table_Rows="Size_Type_Table_Rows>//div[contains(@id,main) and @aria-hidden='false']//tbody[contains(@id,'cntrgrid')]//tr";
		    public static String pannel_Close_Click="pannel_Close_Click>//div[contains(@id,main) and @aria-hidden='false']//span[contains(@id,'SSP_JdlgCntrList_title')]//following-sibling::a[@aria-label='Close']";
		  

			// new
			public static String lessor_add_icon42 = "lessor_add_icon>//button[@id='SBS-SBS_btnlsradd']";
			public static String lessor_inp_field42 = "lessor_inp_field>//input[@aria-label='Lessor Code Filter Input']";
			public static String lessee_add_icon42 = "lessee_value>//button[@id='SBS-SBS_btnlseadd']";
			public static String lessee_inp_field42 = "lessee_inp_field>//input[@aria-label='Lessee Code Filter Input']";
			public static String leasekind_add_icon42 = "leasekind_value>//button[@id='SBS-SBS_btnkindadd']";
			public static String leasekind_inp_field42 = "leasekind_inp_field>//input[@aria-label='Lease Kind Filter Input']";
			public static String supcon_add_icon42 = "supcon_add_icon>//button[@id='SBS-SBS_btncontradd']";
			public static String supcon_inp_field42 = "supcon_inp_field>//input[@aria-label='Supplier Contract Filter Input']";
			public static String cuscon_add_icon42 = ">//button[@id='SBS-SBS_btncccontradd']";
			public static String cuscon_inp_field42 = "supcon_inp_field>//input[@aria-label='Customer Contract Filter Input']";
			public static String sz_tp_special42 = "sz_tp_special>//span[text()='Sz/Tp Special']";
			public static String sz_tp_standard42 = "sz_tp_standard>//span[text()='Sz/Tp Standard']";
			public static String service_checkbox42 = "service_checkbox42>//label[@id='SBS-SBS_lbl_rdbser']//preceding::div[contains(@id,'SBS-SBS_btnGrp')]";
			public static String service_searchicon42 = "service_searchicon42>//button[@id='SBS-SBS_btnservice']";
			public static String service_searchfield42 = "service_searchfield42>//input[@aria-label='Service Code Filter Input']";

			public static String countrysearchicon42 = "countrysearchicon42>//*[@id='SBS-SBS_btnsele']";
			public static String close_btn38 = "close_btn>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";

			public static String total_records36 = "total_records36>//label[@id='LSR_cntrgridGrid_records_lbl_cnt']";
			public static String close_report41 = "close-report>//div[@id='ETR-ETR_detailRqstDialog-DCP_customDetailRequestDialog']//a[@aria-label='Close']";



			public static String folder_drop = "folder_drop>//*[text()='%s']//preceding::span[2]";


















}
