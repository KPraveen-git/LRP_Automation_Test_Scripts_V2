package locators;

public interface Contract_Management_System_Locators extends Cost_Activity_Report_Locators{

	public static String Containerised = "Select the Containerised>(//table[@id='CUC-CUC_Classlist12']//label)[1]";
	public static String NonContainerised = "Select the Non Containerised>(//table[@id='CUC-CUC_Classlist12']//label)[2]";
	public static String FMC = "Select the FMC>(//table[@id='CUC-CUC_fmclist']//label)[1]";
	public static String N_FMC = "Select the Non FMC>(//table[@id='CUC-CUC_fmclist']//label)[2]";
	public static String CustomerName = "Customer Name>//input[@id='CUC-CUC_txtCustName_auto_input']";
	public static String Select_Customer = "Select the Customer Name>//div[@id='CUC-CUC_txtCustName_auto_panel']//label[text()='%s']";
	public static String ClosePreRequest = "Close the pre-request>//div[@id='CUC_profiledlg']//a[@aria-label='Close']";
	public static String Commodity = "Commodity Tab>//a[text()='Commodity']";
	public static String CommodityName_Input = "Commodity Name Input>//input[@id='CUC-CUC_txtCommodity_auto_input']";
	public static String Select_Commoditiy = "Select the Commodity name>//div[@id='CUC-CUC_txtCommodity_auto_panel']//td[text()='%s']";
	public static String Contract_Commodity = "Contract Commodity>//textarea[@id='CUC-CUC_Vizname']";
	public static String Add_Commodity = "Add Commodity>//button[@id='CUC-CUC_btnManCom']";
	public static String Grid_Contract_Commodity = "Grid Commodity>(//tbody[@id='CUC-CUC_OFRGrid_data']//td)[5]";
	public static String PortPair_Tab = "Port pair Tab>//a[text()='Port Pair']";
	public static String Eqp_Search = "Equipment search>//button[@id='CUC-CUC_btncneqp-CUC_btncneqp']";

	public static String Contract_Management_System = "Contract_Management_System>//a[@role='presentation']/child::label[.='Contract Management System(CMS)']";
	public static String Contract_Management_System_CustomerName = "Contract_Management_System_CustomerName>//input[@id='CUC-CUC_txtCustName_auto_input']";
	public static String Contract_Management_System_Fmc = "Contract_Management_System_Fmc>(//table[@id='CUC-CUC_fmclist']//div)[1]";
	public static String Contract_Management_System_Containerized = "Contract_Management_System_Fmc>//label[text()='Containerized']";
	public static String Contract_Management_System_Exit = "Contract_Management_System_Fmc>//button[@id='CUC_btnExitOk1']";
	public static String Contract_Management_System_Commodity = "Contract_Management_System_Commodity>//a[text()='Commodity']";
	public static String Contract_Management_System_Internal_Commodity = "Contract_Management_System_Internal_Commodity>//input[@id='CUC-CUC_txtCommodity_auto_input']";
	public static String Contract_Management_System_Commodity_val = "Contract_Management_System_Commodity_val>((//div[contains(@id,'auto') and contains(@style,'display: block')])//following::td[text()='%s'])";
	public static String Contract_Management_System_Internal_Commodity_add = "Contract_Management_System_Internal_Commodity_add>//button[@id='CUC-CUC_btnManCom']";
	public static String Contract_Management_System_port_pair = "Contract_Management_System_port_pair>//a[text()='Port Pair']";
	public static String Contract_Management_System_Eqp_Type = "Contract_Management_System_Eqp_Type>//input[@id='CUC-CUC_txtEquipment_auto_input']";
	public static String Contract_Management_System_Origin = "Contract_Management_System_Origin>//input[@id='CUC-CUC_txtOrigin_auto_input']";
	public static String Contract_Management_System_Delivery = "Contract_Management_System_Delivery>//button[@id='CUC-CUC_btnDelivery-CUC_btnDelivery']";
	public static String Contract_Management_System_OFR = "Contract_Management_System_OFR>//input[@id='CUC-CUC_txtAllin_input']";
	public static String Contract_Management_System_weight = "Contract_Management_System_weight>//input[@id='CUC-CUC_txtweight_input']";
	public static String Contract_Management_System_Valied_from = "Contract_Management_System_Valied_from>//div[@id='CUC-CUC_ced']";
	public static String Contract_Management_System_Valied_to = "Contract_Management_System_Valied_to>//div[@id='CUC-CUC_cxd']";
	public static String Contract_Management_System_Add = "Contract_Management_System_add>//button[@id='CUC-CUC_btnAddofr']";
	public static String Contract_Management_System_export_Detention = "Contract_Management_System_export_Detention>//input[@id='CUC-CUC_expfree']";
	public static String Contract_Management_System_export_Demurrage = "Contract_Management_System_Demurrage>//input[@id='CUC-CUC_expfreeDemurrage']";
	public static String Contract_Management_System_import_Demurrage = "Contract_Management_System_Demurrage>//input[@id='CUC-CUC_impfree']";
	public static String Contract_Management_System_import_Detention = "Contract_Management_System_import_Detention>//input[@id='CUC-CUC_impDemurrage']";
	public static String Free_days = "Free_days>//legend[text()='Free Days']";
	public static String Contract_Management_System_save = "Contract_Management_System_save>//button[@id='CUC-tbl-btnsave']";
	public static String Contract_Management_System_General = "Contract_Management_System_General>//a[text()='General']";
	public static String Contract_Management_System_Tariffs_of_General_Applicability = "Contract_Management_System_Tariffs_of_General_Applicability>//input[@id='CUC-CUC_tariffs']";
	public static String Contract_Management_System_Signatory_Name = "Contract_Management_System_Signatory_Name>//input[@id='CUC-CUC_sigName']";
	public static String Contract_Management_System_Signatory_Title = "Contract_Management_System_Signatory_Title>//input[@id='CUC-CUC_sigTitle']";
	public static String Contract_Management_System_Signature_Date = "Contract_Management_System_Signature_Date>//input[@id='CUC-CUC_dtpsignature_input']";
	public static String Contract_Management_System_status = "Contract_Management_System_status>//input[@id='CUC-CUC_txtstatus']";
	public static String Contract_Management_System_contract = "Contract_Management_System_contract>//input[@id='CUC-CUC_txtEnquiryNo']";
	public static String Contract_Management_System_Edit = "Contract_Management_System_Edit>//button[@id='CUC-tbl-btnTblEdit']";
	public static String Contract_Management_System_Approved = "Contract_Management_System_Approved>//button[@id='CUC-CUC_btnapprove']";
	public static String Contract_Management_System_Active = "Contract_Management_System_Active>//button[@id='CUC-CUC_btnpromote']";
	public static String Contract_Management_System_Activity_close = "Contract_Management_System_Activity_close>(//div[@id='CUC_dlgMsgEditor']//span)[2]";
	public static String Contract_Management_System_NFMC = "Contract_Management_System_NFMC>//label[text()='N-FMC']";
	public static String Contract_Management_System_Surcharge_rule = "Contract_Management_System_>//a[text()='Surcharge Rule']";
	public static String Contract_Management_System_Charge = "Contract_Management_System_Charge>//input[@id='CUC-CUC_chg_input']";
	public static String Contract_Management_System_backrond_color = "Contract_Management_System_backrond_color>//input[@id='CUC-CUC_txtEnquiryNo']";
	public static String Contract_Management_System_Non_Containerized = "Contract_Management_System_Non_Containerized>//label[text()='Non Containerized']";
	public static String Contract_Management_System_Firstvalu = "Contract_Management_System_Firstvalu>(//div[@col-id='C1'])[2]";
	public static String Contract_Management_System_Select_option = "Contract_Management_System_Select_option>//button[@id='nfr-twocol-select-button']";
	public static String Contract_Management_System_All_option = "Contract_Management_System_All_option>//div[@id='CUC-CUC_chktabnrmlAll']";
	public static String Contract_Management_System_All_option_add = "Contract_Management_System_All_option_add>//button[@id='CUC-CUC_btnchgadd']";
	public static String Contract_Management_System_RateCalc_Type = "Contract_Management_System_RateCalc_Type>//input[@id='CUC-CUC_txtBBEqp']";
	public static String Contract_Management_System_file = "Contract_Management_System_file>//button[@id='CUC-CUC_btnpromote']";
	public static String Contract_Management_System_File_Text = "Contract_Management_System_File_Text>//textarea[@id='CUC_file-CUC_remarks']";
	public static String Contract_Management_System_Ok = "Contract_Management_System_Ok>//button[@id='CUC_file-btnok']";
	public static String Contract_Management_System_Origin_seach = "Contract_Management_System_Origin_seach>//button[@id='CUC-CUC_btnOrigin-CUC_btnOrigin']";
	public static String Contract_Management_System_Origin_seach_Input_field = "Contract_Management_System_Origin_seach_Input_field>//input[@aria-label='Origin Code Filter Input']";
	public static String Contract_Management_System_Origin_select = "Contract_Management_System_Origin_select>//button[@id='nfr-twocol-select-button']";
	public static String Contract_Management_System_Delivery_seach_Input_field = "Contract_Management_System_Delivery_seach_Input_field>//input[@aria-label='Delivery Code Filter Input']";
	public static String Surcharge_Serach = "Surcharge_Serach>//button[@id='CUC-CUC_btnManSur-CUC_btnManSur']";
	public static String SelectAll_Surcharge = "SelectAll_Surcharge>//div[@id='CUC-CUC_chktabnrmlAll']//span";
	public static String Add_Surcharge = "Add_Surcharge>//button[@id='CUC-CUC_btnchgadd']";
	public static String ValidTo = "ValidTo>//input[@id='CUC-CUC_dtpvldto_input']";
	public static String ValidFrom = "ValidFrom>//input[@id='CUC-CUC_dtpvldfrom_input']";
	public static String File_Button = "File_Button>//button[@id='CUC-CUC_btnpromote']";
	public static String Remarks_Input = "Remarks_Input>//textarea[@id='CUC_file-CUC_remarks']";
	public static String Remark_Ok = "Remark_Ok>//button[@id='CUC_file-btnok']";
	public static String AMendment = "AMendment>//button[@id='CUC-CUC_btnamdnent']";

	public static String Contract_popup_Message = "Contract_popup_Message>//div[@class='ui-growl-message']//p";
	public static String RateCal = "RateCal>//button[@id='CUC-CUC_btnbbeqp-CUC_btnbbeqp']";
	public static String AddDimension = "AddDimension>//button[@id='CUC-CUC_btnDimensions']";

	public static String DG_Checkbox = "DG_Checkbox>//div[@id='CUC-CUC_chkDG']";
	public static String DG_Class = "DG_Class>//button[@id='DGform-btnDGClass']";
	public static String Add_DG_Class = "Add_DG_Class>//button[@id='DGform-REQ_btnaddDG']";
	public static String DGSelectButton = "SelectButton>//button[@id='multicol_okbtn']";
	public static String DGDetails1 = "DGDetails1>//tbody[@id='DGform-REQ_dgclassgrid_data']//tr/td";
	public static String DG_Ok = "DG_Ok>//button[@id='DGform-REQ_btnDGOk']";

	public static String OOG_Checkbox = "OOG_Checkbox>//div[@id='CUC-CUC_chkOOG']";
	public static String Portpair1 = "Portpair1>(//div[@id='CUC-cucu_OFRGrid_tbl']//div[@row-id='0']//div[@col-id])[1]";


	public static String SelectButton = "SelectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String SearchButton_Toolbar = "Search Button in tool bal>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblJdlgSearch')]";


	public static String GrWt_Input = "GrWt_Input>//input[@id='DimensionsDlg-weight_input']";
	public static String Length_Input = "Length_Input>//input[@id='DimensionsDlg-length_input']";
	public static String Width_Input = "Width_Input>//input[@id='DimensionsDlg-width_input']";
	public static String Height_Input = "Height_Input>//input[@id='DimensionsDlg-height_input']";
	public static String Quantity_Input = "Quantity_Input>//input[@id='DimensionsDlg-qty']";
	public static String Package_description = "Package_description>//button[@id='DimensionsDlg-CUC_btnbbpackage-CUC_btnbbpackage']";
	public static String DimensionAdd = "DimensionAdd>//button[@id='DimensionsDlg-btnadddimen']";
	public static String DimensionOk = "DimensionOk>//button[@id='DimensionsDlg-btnOkDim']";

	// Import Excel

	public static String ImportExcel = "ImportExcel>//div[@id='CUC-CUC_panel_portpair_content']//span[text()='Import Excel']//..";
	public static String ImportInput = "ImportInput>//input[@id='xlForm-nfr_importxl_fileupload_input']";
	public static String SelectSheet_dropdown1 = "SelectSheet_dropdown1>//label[@id='xlForm-nfr_importxl_tabviewAuto-0-importxlSheet_label']";
	public static String SelectSheet_dropdown2 = "SelectSheet_dropdown2>//label[@id='xlForm-nfr_importxl_tabviewAuto-1-importxlSheet_label']";
	public static String SelectSheet_dropdown3 = "SelectSheet_dropdown3>//label[@id='xlForm-nfr_importxl_tabviewAuto-2-importxlSheet_label']";
	public static String SelectMainSheet = "SelectMainSheet>//ul[@id='xlForm-nfr_importxl_tabviewAuto-0-importxlSheet_items']//li[text()='%s']";
	public static String SelectDGSheet = "SelectDGSheet>//ul[@id='xlForm-nfr_importxl_tabviewAuto-1-importxlSheet_items']//li[text()='%s']";
	public static String SelectOOGSheet = "SelectOOGSheet>//ul[@id='xlForm-nfr_importxl_tabviewAuto-2-importxlSheet_items']//li[text()='%s']";
	public static String LoadSheet_Main = "LoadSheet_Main>//button[@id='xlForm-nfr_importxl_tabviewAuto-0-importxl_load_excel']";
	public static String LoadSheet_DG = "LoadSheet_DG>//button[@id='xlForm-nfr_importxl_tabviewAuto-1-importxl_load_excel']";
	public static String LoadSheet_OOG = "LoadSheet_OOG>//button[@id='xlForm-nfr_importxl_tabviewAuto-2-importxl_load_excel']";
	public static String Automap_Yes = "Automap_Yes>//button[@id='nfr_importxl_automap_yes']";
	public static String Upload_Excel = "Upload_Excel>//button[@id='xlForm-importxl_upload']";
	public static String ImportExcel_DG = "ImportExcel_DG>(//div[@id='xlForm-nfr_importxl_tabviewAuto']//a)[2]";
	public static String ImportExcel_OOG = "ImportExcel_OOG>(//div[@id='xlForm-nfr_importxl_tabviewAuto']//a)[3]";
	 public static String Contract_Management_System_Add_Dimensions ="Contract_Management_System_Add_Dimensions>//button[@id='CUC-CUC_btnDimensions']";
	    public static String Contract_Management_System_Gr_wt ="Contract_Management_System_Gr_wt>//input[@id='DimensionsDlg-weight_input']";
	    public static String Contract_Management_System_Length ="Contract_Management_System_Length>//input[@id='DimensionsDlg-length_input']";
	    public static String Contract_Management_System_Width ="Contract_Management_System_Width>//input[@id='DimensionsDlg-width_input']";
	    public static String Contract_Management_System_Height ="Contract_Management_System_Height>//input[@id='DimensionsDlg-height_input']";
	    public static String Contract_Management_System_Quantity ="Contract_Management_System_Quantity>//input[@id='DimensionsDlg-qty']";
	    public static String Contract_Management_System_Add_Dimensions_add ="Contract_Management_System_Add_Dimensions_add>//button[@id='DimensionsDlg-btnadddimen']";
	    public static String Contract_Management_System_Add_Dimensions_add_ok="Contract_Management_System_Add_Dimensions_add_ok>//button[@id='DimensionsDlg-btnOkDim']";
	    public static String Contract_Management_System_Add_Dimensions_add_package_Description ="Contract_Management_System_Add_Dimensions_add_package_Description>//button[@id='DimensionsDlg-CUC_btnbbpackage-CUC_btnbbpackage']";
	    public static String Contract_Management_System_Add_Dimensions_add_package_Description_input ="Contract_Management_System_Add_Dimensions_add_package_Description_input>//input[@aria-label='Package Code Filter Input']";
		
	public static String PortpairGridCount = "PortpairGridCount>//label[@id='CUC-cucu_OFRGrid_records_lbl_cnt']";
	public static String RouteSch = "Route/S.Ch>//button[@id='CUC-CUC_btnRouting']";
	public static String RouteSch_Ok = "Route/S.Ch ok button>//button[@id='CUC_btnRouOK']";
	public static String BBLP_Option ="BBLP_Option>//li[text()='BBLP']";
	public static String Amount_field ="Amount_field>//input[@id='CUC-CUC_chgamt_input']";
	
	public static String Popup_Okay = "Popup_Okay button>//h2//following::button[text()='YES' or text()='Yes']";
	public static String BL_Number_select = "BL_Number_select>//div[@id='nfr-jdlgGrid-div']//div[@role='gridcell' and @col-id='C1']";
	
}
