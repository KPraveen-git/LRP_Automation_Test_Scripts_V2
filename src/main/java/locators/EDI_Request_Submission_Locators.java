package locators;

public interface EDI_Request_Submission_Locators extends EMS_Contract_Billing_Generation_And_Verification_Locators{
	
	public static String searchField = "searchField>//button[@name='ESN-ESN_btnPartnerSearch-ESN_btnPartnerSearch']";
	public static String ediSearch = "ediSearch>//*[@id='ESN-ESN_btnEDISearch']";
	public static String chooseOption = "chooseOption>//div[@id='ESN-ESN_btnURLSearch']";
	public static String saveOpt = "saveOpt>//button[@id='ESN-tbl-btnsave']";
	public static String Excel_Upload = "Excel_Upload>//label[@id='ESN-ESN_lblEDIURL']";



}
