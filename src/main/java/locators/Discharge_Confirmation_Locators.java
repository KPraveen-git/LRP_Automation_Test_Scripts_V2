package locators;

public interface Discharge_Confirmation_Locators extends EDI_Request_Submission_Locators{

	
	
	public static String dischargeshow_Button="dischargeshow_Button>//button[@id='DCO-DCO_btnShow']";
	public static String discharge_activity_date="discharge_activity_date>//input[@id='DCO-DCO_txtActDate_input']";
	public static String discharge_bookingnumber="discharge_bookingnumber>(//span[text()='Book No'])[2]//following::input[1]";
	public static String dischargeselectall="dischargeselectall>(//input[@id='DCO-DCO_treeDAR-DCO_chkAllSelect'])[1]";
	public static String dischargeconfirmation_btn="dischargeconfirmation_btn>//button[@id='DCO-DCO_btnLoadConfirmation']";
	public static String container_no_discharge="container_no>//tbody[@id='DCO-DCO_treeDAR1_data']//input[1]";
	public static String match_button_Discharge ="match_button>//button[@id='DCO-DCO_btnMatch']";
	public static String Book_number_btn = "Book_number_btn>//input[@value='Book No']//following::span[1]";
	public static String container_no_Discharge ="container_no_Discharge>//input[@id='DCO-DCO_treeDAR1-0-DCO_addRow']";
	public static String Dischargeconfirmation="Dischargeconfirmation>//button[@id='DCO-DCO_btnLoadConfirmation']";
	public static String Container_Select="Container_Select>//span[text()='%s']";
	public static String Discharge_Show_Button="Discharge_Show_Button>//button[@id='DCO-DCO_btnShow']";
	public static String Discharge_Checkbox="Discharge_Checkbox>//input[@id='DCO-DCO_treeDAR-0-DCC_chkSelect']";
	public static String Discharge_Confirmation="Discharge_Confirmation>//button[@id='DCO-DCO_btnLoadConfirmation']";
	public static String VinChassis_BookNo_Select="VinChassis_BookNo_Select>//input[contains(@id,'DCO-DCO_button')]//following-sibling::span[text()='%s']";
	public static String Discharge_VIN_Chassis_No="Discharge_VIN_Chassis_No>//input[@id='DCO-DCO_treeDAR1-0-DCO_addRow']";
	public static String Match1="Match1>//button[@id='DCO-DCO_btnMatch']";

	public static String show_Button_Discharge ="show_Button_Discharge>//button[@id='DCO-DCO_btnShow']";



}
