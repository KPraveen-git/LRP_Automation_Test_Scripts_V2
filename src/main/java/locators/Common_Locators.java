package locators;

public interface Common_Locators extends ActivityDefinition_Locators{	
	//login page locators
	public static String Username_input = "UserName>//input[@id='nfr_login_authname']";
	public static String Password_input = "Password>//input[@id='nfr_login_authid']";
	public static String Login = "Login>//*[@id='nfr_login_btnlogin']";
	public static String Home_Logo = "Home_Logo>//*[@id='nfr_topbar_user_detail_link']";
	public static String Logout_Icon="Logout Icon>//a[@id='nfr_topbar_logout']";
	public static String Logout_Yes_Btn="Logout Yes button>//input[@id='nfr_logout_cnf_form-nfr_logout_cnf_yes']";
	
	
	//Module search locators
	public static String Search_Input = "Search_Input>//input[@id='nfr_topbar_autocomp_input']";
	public static String timeInput = "timeInput>//input[@class='ui_tpicker_time_input']";
	public static String date_select ="date_select>//div[@id='ui-datepicker-div']//a[text()='%s']";
	public static String dateSelect ="dateSelect>//div[@id='ui-datepicker-div']//a[text()='%s']";
	   
	//Keywords
	public static String Processing_Locator = "Filter_Field>//div[contains(@class,'blockUI blockMsg blockElement')]//span[text()='Processing..']";
	public static String Filter_Field = "Filter_Field>(//input[contains(@aria-label,'Filter Input')])[1]";
	public static String contains_Click = "contains_Click>//div[@aria-label='Filtering operator']";
	public static String select_Button="select_Button>//div[@aria-hidden='false']//span[text()='Select']//ancestor::button[1]";
	public static String Filter_Field1 ="Filter_Field1>(//div[@aria-hidden='false' and @role='dialog']//input[contains(@aria-label,'Filter Input')])[2]";
	public static String Filter_Field2 ="Filter_Field2>(//div[@aria-hidden='false' and @role='dialog']//input[contains(@aria-label,'Filter Input')])[3]";
	public static String Filter_Button1 ="Filter_Button1>(//div[@aria-hidden='false' and @role='dialog']//button[@ref='eButtonShowMainFilter']//span)[2]";
	public static String Filter_Button2 ="Filter_Button2>(//div[@aria-hidden='false' and @role='dialog']//button[@ref='eButtonShowMainFilter']//span)[3]";
	public static String column_values_Right="Column Values Right>//div[@aria-hidden='false' and @role='dialog']//div[@col-id='C2' and @role='gridcell']";
	public static String  hide_Menu_ID="hide_Menu_ID>//span[@title='Hide Menu']";
	public static String  main_Menu_ID="main_Menu_ID>//div[@id='nfr_menu_maindiv']";
	
	
	//switch profile locators
	public static String Doc_Agency ="Doc_Agency>//input[@id='FCN-FCN_txtDocAgencyCity']";
	public static String Profile_Dropdown ="Location_Dropdown>//label[@id='SWP-SWP_cmbSwitchType_label']";
	public static String Corporate_Profile ="Corporate_Location>//ul[@id='SWP-SWP_cmbSwitchType_items']//li[@data-label='Corporate']";
	public static String Location_Profile ="Location_Profile>//ul[@id='SWP-SWP_cmbSwitchType_items']//li[@data-label='Location']";
	public static String reset_Profile_Button="reset_Profile_Button>//button[@id='SWP-SWP_btnResetProfile']";
	public static String Module_Select = "Module_Select>//*[@id='nfr_topbar_autocomp_panel' and not(contains(@style,'display: none'))]//li[translate(normalize-space(@data-item-label), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz') = translate('%s', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')]";
	public static String Amount_header = "Amount_header>//thead[@id='IIV-IIV_gridInvDetails_head']//th//span[.='Amount']";
	public static String Date_Select = "Date_Select>//div[contains(@id,'datepicker')]//a[text()='%s']";
	public static String Switch_Profile = "Switch_Profile>//a[@id='nfr_topbar_switchprofile_link']";
	public static String agency_Code_Filter="agency_Code_Filter>//label[.='Filter by Code']/following-sibling::input[contains(@id,'SWP-SWP_datatable')]";		
	public static String select_Agency="select_Agency>//tbody[@id='SWP-SWP_datatable_data']/child::tr[@data-ri='0']";
	public static String Switch_Profile_Button = "Switch_Profile_Button>//button[@id='SWP-SWP_btnSwitchProfile']";
	public static String Month_DD = "Month_DD>//select[@aria-label='select month']";
	public static String Year_DD = "Year_DD>//select[@aria-label='select year']";
	public static String Popup_Message = "Popup_Message>//div[@id='lrp_cust_growl_container']//p"; 
	public static String NewButton_ToolBar = "New Button Tool Bar>//div[contains(@id,'main') and @aria-hidden='false']//button[contains(@id,'btnTblNew')]";
	public static String SaveButton_ToolBar = "Save Button Tool Bar>//div[contains(@id,'main') and @aria-hidden='false']//button[contains(@id,'btnsave')]";
	public static String popup="popup>//div[@id='lrp_cust_growl_container']//p";
	public static String SearchButton_Toolbar = "Search Button in tool bal>//div[contains(@id,'main') and @aria-hidden='false']//button[contains(@id,'btnTblJdlgSearch')]";
	public static String Delete_button_toolBar = "Delete button in Tool Bar>//div[contains(@id,'main') and @aria-hidden='false']//button[contains(@id,'btnTblDelete')]";
	public static String Save_button_toolBar = "Save_button_toolBar>//div[contains(@id,'main') and @aria-hidden='false']//button[contains(@id,'btnsave')]";
	public static String Edit_Button_toolBar="Edit Button Toolbar>//div[contains(@id,'main') and @aria-hidden='false']//button[contains(@id,'btnTblEdit')]";
		public static String select_Second="select_Second>//select[@id='second_type']";
	public static String select_Third="select_Third>//select[@id='third_type']";
	//global search locators
	public static String type_Select1="type_Select1>//select[@onchange='myFunction1()']";
	public static String type_Select2="type_Select2>//select[@onchange='myFunction2()']";
	public static String type_Select3="type_Select1>//select[@onchange='myFunction3()']";
	public static String globalSearch_Condition_Dropdown1 = "globalSearch_Condition_Dropdown1>//select[@id='var_condition1']";
	public static String globalSearch_Condition_Dropdown2 = "globalSearch_Condition_Dropdown2>//select[@id='var_condition2']";
	public static String globalSearch_Condition_Dropdown3 = "globalSearch_Condition_Dropdown3>//select[@id='var_condition3']";
	public static String globalSearch_InputTextfield1 = "globalSearch_InputTextfield1>//input[@id='txt_name1']";
	public static String globalSearch_InputTextfield2 = "globalSearch_InputTextfield1>//input[@id='txt_name2']";
	public static String globalSearch_InputTextfield3 = "globalSearch_InputTextfield1>//input[@id='txt_name3']";
	public static String globalSearch_Frame_SearchButton = "globalSearch_Frame_SearchButton>//button[@id='myBtn']";
	public static String retrivedGlobalValue="retrivedGlobalValue>//div[@id='nfr-jdlgGrid-div']//div[@row-index='0']";
	public static String SelectButton="SelectButton>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	
	public static String FilterOption_Menu = "Filter Option Menu>//div[contains(@id,'main') and @aria-hidden='false']//img[@alt='Condition']";
	public static String MoreOption_Grid = "More option in Grid>//div[contains(@id,'main') and @aria-hidden='false']//div[contains(@id,'nfr_toolpanel_li_id')]";
	public static String retrieved_Value_Select="retrieved_Value_Select>//table[@id='nfr_sch_jdlg_form-nfr_sch_jd_pnl']//div[@ref='centerContainer']//div[@role='row']/div";
	public static String select_first = "select_first>//select[@id='type']";
	public static String popup_Message ="popup_Message>//h2//following-sibling::span[2]";
	public static String popup_Message_Yes_Button = "popup_Message_Yes_Button>//h2//following::button[text()='Yes']";
	public static String popup_Message_No_Button = "popup_Message_No_Button>//h2//following::button[text()='No']";
	public static String popup_Message_Ok_Button = "popup_Message_Ok_Button>//h2//following::button[text()='Ok']";

	public static String First_Row_select="First_Row_select>//div[@id='nfr-jdlgGrid-div']//div[@row-index='0']";

	public static String Column_SelectMenu = "Column Select Menu>//div[not(contains(@id,'main')) and @role='tabpanel' and @aria-hidden='false']//button[@ref='eToggleButton']";
	public static String SelectAll_Column_CheckBox = "Select All Column Checkbox>//div[not(contains(@id,'main')) and @role='tabpanel' and @aria-hidden='false']//input[@aria-label='Toggle Select All Columns']";
	public static String Column_Search_Input = "Column Search Input>//div[not(contains(@id,'main')) and @role='tabpanel' and @aria-hidden='false']//input[@aria-label='Filter Columns Input']";
	public static String Select_Column_tableHead = "Select table Headers>//div[@ref='sideBar']//span[text()='%s']";
	public static String Select_Column_Head = "Select table Headers>//div[not(contains(@id,'main')) and @role='tabpanel' and @aria-hidden='false']//div[@ref='sideBar']//span[text()='%s']";

	
    public static String Close_Current_tab="Close Current Tab>//li[contains(@class,'tabs-active')]//a[contains(@id,'img3')]/i[@class='fa fa-remove mdlclose']";
	public static String DropDown_Select= "DropDown_Select>//div[contains(@id,'panel') and contains(@style,'display: block;')]//li[text()='%s']";

	
	public static String total_records ="total_records>//div[contains(@id,'main') and @aria-hidden='false']//label[contains(@id,'ListGrid_records_lbl_cnt')]";
	public static String total_records_in_car ="total_records_in_car>//label[@id='CRRopr_view-CRR_gridoprlistview_records_lbl_cnt']";

	public static String two_Column_Search_Column_Header ="two_Column_Search_Column_Header>//div[contains(@id,'nfr_sch')]//*[normalize-space(text())='%s']//ancestor::div[@aria-colindex]";
	public static String Filter_Input_Field ="Filter_Input_Field>//div[@aria-colindex='%s']//input[contains(@aria-label,'Filter Input')]";
	public static String Filter_Button ="Filter_Button>//div[@aria-colindex='%s']//button[@aria-label='Open Filter Menu']";
	public static String Filter_Operator ="Filter_Operator>//div[@aria-label='Filtering operator' and @aria-expanded]";
	public static String Equals_Option ="Equals_Option>//div[@aria-label='Select Field']//span[text()='Equals']";
	public static String column_Value ="column_Value>//div[contains(@id,'nfr_sch')]//div[@row-index='0']//div[@aria-colindex='%s']";
		
	public static String Car_Close = "Car Close button>//button[@id='CRR-CRR_btnTDRClose']";
	public static String Attachement_Button_toolBar = "Attachment Button Toolbar>//div[contains(@id,main) and @aria-hidden='false']//button[contains(@id,'btnTblDocAttachment')]";
	public static String First_Row_click = "First_Row_click>//div[@id='nfr-jdlgGrid-div']//div[@ref='eContainer']//div[@row-index='0']";
	public static String Attach_File_button = "Attach File button>//div[contains(@id,'main') and @aria-hidden='false']//input[contains(@id,'docAttach_fileupload_input')]";
	public static String Upload_button="Upload button>//div[contains(@id,'main') and @aria-hidden='false']//button[contains(@id,'docAttacherUploadBtn')]";
	public static String Attached_FileName="Attached File name>//label[contains(@id,'uploadedFileName')]";
	 public static String Export_button_Toolbar="Export button Toolbar>//div[contains(@id,'main') and @aria-hidden='false']//button[contains(@id,'btnTblExport')]";
	public static String Remove_attachment_yes = "Remove attchment popup yes>//div[@id='CRR-tbl-CRR_docAttacher-CRR_removeConfDlg']//button";
}
