package locators;

public interface Master_Reactivation_Locators extends Movement_Entry_Locators{
	public static String Master_Reactivation_New_Button="Master_Reactivation_New_Button>//div[contains(@id,'tblComponent')]//button[contains(@id,'btnTblNew')]";
	public static String ID_Popup_Yes_Button = "ID_Popup_Yes_Button>//h2//following::button[text()='Yes']";
	public static String ID_Popup_No_Button = "ID_Popup_No_Button>//h2//following::button[text()='No']";
	public static String ID_Popup_Msg ="ID_Popup_Msg>//h2//following-sibling::span[2]";
	public static String module_Nume_search_button_MR="module_Nume_search_button_MR>//button[@id='MRD-MRD_btnMdlName-MRD_btnMdlName']";
    public static String module_Name_Filter_MR="module_Name_Filter_MR>//input[@aria-label='Module Name Filter Input']";
    public static String select_Btn="select_Btn>//button[@id='nfr-twocol-select-button']";
    public static String show_Button_MR="show_Button_MR>//button[@id='MRD-MRD_btnShow']";
    public static String activity_Code_TF_MR="activity_Code_TF_MR>//thead[@id='MRD-MRD_trTable_head']//input[contains(@id,'MRD-MRD_trTable')]";
    public static String activity_Code_Select_MR="activity_Code_Select_MR>//tbody[@id='MRD-MRD_trTable_data']//tr[@data-ri='0']//input";
    public static String reactive_Button_MR="reactive_Button_MR>//button[@id='MRD-MRD_btnReActivate']";
	public static String ID_Popup_Ok_Button = "ID_Popup_Ok_Button>//h2//following::button[text()='Ok']";
	public static String Grid_Select="Grid_Select>//div[@id='nfr-jdlgGrid-div']//div[@ref='eCenterContainer']//div[@row-index='0']";

}
