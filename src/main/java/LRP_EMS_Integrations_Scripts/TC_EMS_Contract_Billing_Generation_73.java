package LRP_EMS_Integrations_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Locators;

public class  TC_EMS_Contract_Billing_Generation_73 extends Keywords{

	public void Billing_Generation_Verification_73(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) throws Throwable {
		String testCase_Name="TC_EMS_Contract_Billing_Generation_73";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		String Sheet_Name_073 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_073, testCase_Name, "Dataset"+selected_dataset, File_Path);

		String user_Name = data.get("Username");
		String pass_word = data.get("Password");
		String Field_Names = data.get("Field_Names");
		String Contaract_No_input = data.get("Contaract_No");
		String Search_Contract_No_Popup_Txt_Exp = data.get("Search_Contract_No_Popup_Txt");
		String Select_Contract_No_Popup_Txt_Exp = data.get("Select_Contract_No_Popup_Txt");
		String Month_Select_For73 = data.get("Month_Select_For73");
		String Year_Select_For73 = data.get("Year_Select_For73");
		String show_Bills_Button = data.get("show_Bills_Button");
		String ContractNo_CheckBox_Select = data.get("ContractNo_CheckBox_Select");
		String Condition =data.get("Condition");
		String Search_Contract_No_Column_Header =data.get("Search_Contract_No_Column_Header");
		//locators
		String month_Select73 = String.format(EMS_Locators.month_Select,  Month_Select_For73);
		String show_Bills =  String.format(EMS_Locators.generatebutton,  show_Bills_Button);
		String ContractNo_Select_CheckBox =  String.format(EMS_Locators.ContractNo_Select_CheckBox,  Contaract_No_input);

		Extent_Start(testCase_Name, test, test1);
		navigateUrl(driver, url);
		// Login
		LRP_Login(driver, user_Name, pass_word);

		Extent_call(test, test1, "Enter module name in searchbox & click the module");
		moduleNavigate(driver, Field_Names);
		Step_Start(1, " Open EMS Contract Billing Generation & Verification", test, test1);
		waitForElement(driver, P_Contract_Module_Page);
		if (isDisplayed(driver, P_Contract_Module_Page)) {
			System.out.println("*****EMS Contract Billing Generation and Verification Module is Dispalyed*****");
			Extent_pass(driver, "*****EMS Contract Billing Generation and Verification Module is Dispalyed*****", test,test1);
		} else {
			System.out.println("*****EMS Contract Billing Generation and Verification Module is not Dispalyed");
			Extent_fail(driver, "*****EMS Contract Billing Generation and Verification Module is not Dispalyed*****",test, test1);
		}
		Step_End(1, " Open EMS Contract Billing Generation & Verification", test, test1);
		Step_Start(2, "Click (+) button from Contract No field", test, test1);
		waitForElement(driver, P_Contact_No_Plus_Btn);
		click(driver, P_Contact_No_Plus_Btn);
		Step_End(2, "Click (+) button from Contract No field", test, test1);

		waitForElement(driver, P_Search_Contract_No_Popup);
		String Act_Popup = getText(driver, P_Search_Contract_No_Popup);
		if (Search_Contract_No_Popup_Txt_Exp.equals(Act_Popup)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp+ " || Actual Report Activity is : " + Act_Popup);
			Extent_pass(driver,"Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp+ " || Actual Report Activity is : " + Act_Popup,test, test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp+ " || Actual Report Activity is : " + Act_Popup);
			Extent_fail(driver,"Not Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp+ " || Actual Report Activity is : " + Act_Popup,test, test1);
		}
		Step_Start(3, "Select required contract no from the field", test, test1);
		twoColumnSearchWindow(driver,Search_Contract_No_Column_Header, Condition, Contaract_No_input);
		Step_End(3, "Select required contract no from the field", test, test1);
		if (!Year_Select_For73.equals("")) {
			waitForElement(driver, P_Bill_Period_Year_Field);
			System.out.println("Year_Select_For73 : " + Year_Select_For73);
			clearAndType(driver, P_Bill_Period_Year_Field, Year_Select_For73);
		}
		if (!Month_Select_For73.equals("")) {
			waitForElement(driver, P_Bill_Period_Month_DD);
			click(driver, P_Bill_Period_Month_DD);
			System.out.println("Month_Select_For73 : " + Month_Select_For73);
			waitForElement(driver, month_Select73);
			click(driver, month_Select73);
		}
		Step_Start(4, "Click on Show bills", test, test1);
		waitForElement(driver, show_Bills);
		click(driver, show_Bills);
		Step_End(4, "Click on Show bills", test, test1);
		Step_Start(5, "Ensure that system should validate if user try to click verify button when check is not selected in summary", test, test1);
		waitForElement(driver, ContractNo_Select_CheckBox);
		checkBox(driver, ContractNo_Select_CheckBox, ContractNo_CheckBox_Select);
		waitForElement(driver, P_Verify_Btn);
		click(driver, P_Verify_Btn);
		Step_End(5, "Ensure that system should validate if user try to click verify button when check is not selected in summary", test, test1);
		Step_Start(6, "Ensure that system should show confirmation message as 'Select a Contract No.'", test, test1);
		waitForElement(driver, P_Sel_ContNo_Popup);
		String ActualPopup_Msg = getText(driver, P_Sel_ContNo_Popup);
		if(Select_Contract_No_Popup_Txt_Exp.equals(ActualPopup_Msg)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Select_Contract_No_Popup_Txt_Exp + " || Actual Report Activity is : " + ActualPopup_Msg);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Select_Contract_No_Popup_Txt_Exp + " || Actual Report Activity is : " + ActualPopup_Msg, test,test1);
		}
		else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Select_Contract_No_Popup_Txt_Exp + " || Actual Report Activity is : " + ActualPopup_Msg);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Select_Contract_No_Popup_Txt_Exp + " || Actual Report Activity is : " + ActualPopup_Msg, test,test1);
		}
		Step_End(6, "Ensure that system should show confirmation message as 'Select a Contract No.'", test, test1);
		Extent_completed(testCase_Name, test, test1);
	}
}
