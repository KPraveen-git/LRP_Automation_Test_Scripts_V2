package locators;

public interface EMS_Contract_Billing_Generation extends Ems_Contract_Registration_Locators{

////TC_Scale_Out_TS_043

	public static String Aaddbuttonforcontract = "addbuttonforcontract>(//fieldset[@id='EDB-EDB_ContractNo']//following::button)[1]";

	public static String AMonthclick = "Monthclick>//label[@id='EDB-EDB_cmbPeriod_label']";
	public static String AFebclick = "Febclick>//li[@data-label='MAY']";
	public static String Ageneratebill = "generatebill>//button[@id='EDB-EDB_GenBill']";
	public static String AEMSLOGINPassword = "EMSLOGINPassword>//span[@id='EDB_password_authentication_popup_title']";
	public static String APasswordInput = "PasswordInput>//input[@id='pwd_authenticate-EDB_Password']";
	public static String APasswordInputOK = "PasswordInputOK>(//form[@id='pwd_authenticate']//following::td)[3]";
	public static String ArunthebillOK = "runthebillOK>(//h2[contains(text(),'EMS Contract Billing Generation and Verification')]//following::button[2])";
	public static String Apopforgenerated = "popforgenerated>//p[contains(text(),'Bills Successfully Generated for')]";
	public static String ABillrunmessage = "Billrunmessage>(//th[@aria-label='Bill Run Message'])[1]";
	public static String ABillrunmessageOK = "BillrunmessageOK>//button[@id='EDB_BillRunForm-EDB_BillRunDataGrid-BillRunPanelCancel']";
	public static String AShowbills = "Showbills>//button[@id='EDB-EDB_ShowBill']";
	public static String AGriedContractnumber = "GriedContractnumber>//thead[@id='EDB-EDB_summayDetailTreeTable_head']";

	public static String Norecordokbtn = "Norecordokbtn>(//tbody[@id='EDB_NoRecordsForm-EDB_NoRecordsDT_data']//following::td)[2]";
	public static String Closebuttonx = "Closebuttonx>//a[@id='h2_img3']";
	public static String Closebuttonx1 = "Closebuttonx>//a[@id='h3_img3']";
	public static String Monthdroupdwn = "Monthdroupdwn>//div[@id='EDB-EDB_cmbPeriod_panel']";
	public static String yeardroupdwn = "yeardroupdwn>//input[@id='EDB-EDB_spinneryear']";
	public static String contractnumbersearch = "contractnumbersearch>//label[text()='Filter by Contract No.']//following::input[1]";
	public static String Normalbilling = "Normalbilling>//div[@id='EDB-EDB_NormalBilling_header']";
	public static String Invoicenumber = "Invoicenumber>(//span[text()='Invoice Number'])[1]";
	public static String Approved = "Approved>//label[@id='EDB-EDB_approvedOutLbl']";
	public static String Girdtable = "Girdtable>//div[@id='EDB-EDB_summayDetailTreeTable']";
	public static String Billgeneratingmsg = "Billgeneratingmsg>(//span[text()='EMS Contract Billing Generation and Verification']//following::p)[1]";
	public static String isoDropdown_Input = "isoDropdown_Input>//input[@id='CGE-CGE_txtSinISOCode_filter']";
	public static String isoDropdown = "isoDropdown>//label[@id='CGE-CGE_txtSinISOCode_label']";
	public static String leaseKind_Dropdown = "leaseKind_Dropdown>//label[@id='CGE-CGE_cmbSinLease_label']";
	public static String lessor_Searchfield = "lessor_Searchfield>//input[@id='CGE-CGE_txtSinCompany']";

	public static String activityTime = "activityTime>//input[@id='CGE-CGE_tfSin_input']";
	public static String sizeType_Searchfield = "sizeType_Searchfield>//input[@id='CGE-CGE_cmbSinSpec_filter']";
	public static String activityTime_Input = "activityTime_Input>//input[@class='ui_tpicker_time_input']";
	public static String activityTime_Close = "activityTime_Close>//button[text()='Close']";
	public static String activityTimeMultiple = "activityTimeMultiple>//input[@id='CGE-CGE_tfMul_input']";
	// TS_042

	public static String stock_report = "stock_report>(//span[text()='Stock Report by Stock Status'])[2]";
	public static String location_searchicon = "location_searchicon>//*[@id='SBS-SBS_btnsele']";

	public static String location_value = "location_value(//div[@col-id='H1'])[7]";

	public static String uploadFile = "uploadFile>//label[@id='ESN-ESN_lblEDIURL']";
	public static String kActivitySearchOpt = "Activity_Search>(//div[@id='CAV-CAV_dsGridConActy_tbl']//following::span[contains(@ref,'eMenu')])[1]";
	

	// TS_042

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

	
	
	
	


	
	

	

	
	public static String Asavepopup1 = "savepopup>(//span[contains(text(),'Scale In/Scale Out Reference')])[2]//following::p[1]";
	public static String Removebutton = "Removebutton>//button[@id='SCN-SCN_btnRemove']";
	public static String Removebuttoncoloumclick = "Removebuttoncoloumclick>(//div[@col-id='locCode'])[2]";
	//public static String RemovebuttoncoloumclickNO = "RemovebuttoncoloumclickNO>(//span[contains(text(),'Scale In/Scale Out Reference')])[2]//following::BUTTON[2]";
	public static String REMOVEBUTTON = "REMOVEBUTTON>//button[@id='SCN-SCN_btnRemove1']";
	public static String perdiemok = "perdiemok>//h2[contains(text(),'Scale In/Scale Out Reference')]//following::span[2]//following::button";
	




	
	
	


	

	

	public static String table_path="table_path>//div[@id='SCN-SCN_dsGridActive_1_tbl']";
	public static String month_click="month_click>//li[text()='%s']";
	public static String contract_se="contract_se>(//td[text()='%s'])[1]";
	public static String ref_num="ref_num>(//span[text()='Reference'])[1]//following::div[text()='%s'][1]";
	
	public static String DataA4 = "DataA4>//h2[contains(text(),'Lessor Bill Upload')]//following::span[2]";
	public static String close_Tab1 = "close_Tab>(//a[contains(@id,'h2_img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
	public static String locationicon16 = "location icon>//span[@id='CGE-CGE_txtSinLocation2']/following-sibling::button[1]";
	public static String location_search16 = "location>//input[@aria-label='Port Code Filter Input']";
	public static String location_value16 = "location value>(//div[@role='gridcell'])[1]";
	
	
	
	public static String close_Tab = "close_Tab>(//a[contains(@id,'img3')]/child::i[@class='fa fa-remove mdlclose'])[1]";
	public static String containsclick = "containsclick>//select[@id='var_condition1']";
	
	
	

	
	
	
	
	
	
	

	
	


	public static String Scroll_side="Scroll_side>(//div[@ref='eBodyHorizontalScrollViewport'])[1]";

	public static String scaleout_input="scaleout_input>//input[@id='SCN-SCN_txtReferenceNo2']";

	public static String AClosex = "Closex>(//label[@id='nfr_sch_jd_header']//following::a)[1]";

	public static String AClosex1 = "Closex1>(//label[@id='nfr_sch_jd_header']//following::a)[1]";

	public static String Asavepopup = "savepopup>(//p[text()='Scale-In / Scale-Out Reference is saved'])[1]";

	public static String RemovebuttoncoloumclickNO = "RemovebuttoncoloumclickNO>//h2[text()='Scale In/Scale Out Reference']//following::span[2]//following::button[1]";

	public static String Removepop = "Removepop>//h2[text()='Scale In/Scale Out Reference']//following::span[2]";



	
	
	
	
	
	
}
