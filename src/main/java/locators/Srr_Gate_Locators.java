package locators;

public interface Srr_Gate_Locators extends Tdn_Locators{
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
		public static String srrGate_FromDate = "srrGate_FromDate>//input[@id='SRLform-txtFrom_input']";
		public static String srrGate_ToDate = "srrGate_ToDate>//input[@id='SRLform-txtTo_input']";
		public static String RequestType = "RequestType>//ul[@id='REQ-REQ_cmbEnquiryType_items']/li[text()='%s']";	
		public static String non_Containerized_RadioButton = "non_Containerized_RadioButton>//label[text()='Non Containerized']/preceding-sibling::div";
		public static String srrGate_Module = "srrGate_Module>//li[@moduleid='SRL']";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
