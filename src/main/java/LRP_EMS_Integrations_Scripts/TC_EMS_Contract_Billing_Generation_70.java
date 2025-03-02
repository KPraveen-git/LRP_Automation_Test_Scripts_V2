package LRP_EMS_Integrations_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Contract_Billing_Generation_And_Verification_Locators;

public class TC_EMS_Contract_Billing_Generation_70 extends Keywords {

	public void Billing_Generation_Verification_70(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) throws Throwable {
		String testCase_Name="TC_EMS_Contract_Billing_Generation_70";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String Sheet_Name_070 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);

		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_070, testCase_Name, "Dataset"+selected_dataset, File_Path);
		String user_Name = data.get("Username");
		String pass_word = data.get("Password");
		String Field_Names = data.get("Field_Names");
		String Contaract_No_input = data.get("Contaract_No");
		String Enter_Password_Popup_Txt_Exp = data.get("Enter_Password_Popup_Txt");
		String Password_Popup_Input_Txt = data.get("Password_Popup_Input");
		String Search_Contract_No_Popup_Txt_Exp = data.get("Search_Contract_No_Popup_Txt");
		String Month_Select_For70 = data.get("Month_Select_For70");
		String Year_Select_For70 = data.get("Year_Select_For70");
		String generate_Button = data.get("generate_Button");
		String Condition =data.get("Condition");
		String Search_Contract_No_Column_Header =data.get("Search_Contract_No_Column_Header");
		String month_Select70 = String.format(EMS_Contract_Billing_Generation_And_Verification_Locators.month_Select,  Month_Select_For70);
		String generatebutton =  String.format(EMS_Contract_Billing_Generation_And_Verification_Locators.Generatebutton,  generate_Button);

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
			Extent_pass(driver,
					"Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp+ " || Actual Report Activity is : " + Act_Popup,test, test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp+ " || Actual Report Activity is : " + Act_Popup);
			Extent_fail(driver,"Not Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp+ " || Actual Report Activity is : " + Act_Popup,test, test1);
		}
		Step_Start(3, "Select required contract no from the field", test, test1);

		twoColumnSearchWindow(driver,Search_Contract_No_Column_Header, Condition, Contaract_No_input);
		Step_End(3, "Select required contract no from the field", test, test1);
		if (!Year_Select_For70.equals("")) {

			waitForElement(driver, P_Bill_Period_Year_Field);
			System.out.println("Year_Select_For70 : " + Year_Select_For70);
			clearAndType(driver, P_Bill_Period_Year_Field, Year_Select_For70);
		}
		if (!Month_Select_For70.equals("")) {

			waitForElement(driver, P_Bill_Period_Month_DD);
			click(driver, P_Bill_Period_Month_DD);
			System.out.println("Month_Select_For70 : " + Month_Select_For70);
			click(driver, month_Select70);
		}

		Step_Start(4, "Click on Generate Bills", test, test1);
		waitForElement(driver, generatebutton);
		click(driver, generatebutton);
		Step_Start(4, "Click on Generate Bills", test, test1);
		Step_Start(5, " Ensure that system should validate if user try to leave blank password and click ok button", test, test1);

		waitForElement(driver, P_Authentication_popup);
		waitForElement(driver, P_Authentication_popup_TxtField);
		click(driver, P_Authentication_popup_TxtField);
		sendKeys(driver, P_Authentication_popup_TxtField, Password_Popup_Input_Txt);
		waitForElement(driver, P_Authentication_popup_OkBtn);
		click(driver, P_Authentication_popup_OkBtn);
		Step_End(5, " Ensure that system should validate if user try to leave blank password and click ok button", test, test1);
		Step_Start(6, "Ensure that system should validate as 'Enter Password'.", test, test1);

		waitForElement(driver, P_Enter_Password_Popup);
		String act_PopUpMsg = getText(driver, P_Enter_Password_Popup);
		if (Enter_Password_Popup_Txt_Exp.equals(act_PopUpMsg)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Enter_Password_Popup_Txt_Exp
					+ " || Actual Report Activity is : " + act_PopUpMsg);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Enter_Password_Popup_Txt_Exp
					+ " || Actual Report Activity is : " + act_PopUpMsg, test, test1);
		}else{
			System.out.println("Not Matched || " + " Expected Report Activity is : "
					+ Enter_Password_Popup_Txt_Exp + " || Actual Report Activity is : " + act_PopUpMsg);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : "
					+ Enter_Password_Popup_Txt_Exp + " || Actual Report Activity is : " + act_PopUpMsg, test,
					test1);
		}
		Step_End(6, "Ensure that system should validate as 'Enter Password'.", test, test1);
		Extent_completed(testCase_Name, test, test1);
	}
}
