package LRP_EMS_Integrations_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Contract_Billing_Generation_And_Verification_Locators;

public class TC_EMS_Contract_Billing_Generation_83 extends Keywords {

	public void Billing_Generation_Verification_83(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) throws Throwable {
		String testCase_Name="TC_EMS_Contract_Billing_Generation_83";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		String Sheet_Name_083 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_083, testCase_Name, "Dataset"+selected_dataset, File_Path);
		String user_Name = data.get("Username");
		String pass_word = data.get("Password");
		String Field_Names = data.get("Field_Names");
		String Contaract_No_input = data.get("Contaract_No");
		String Search_Contract_No_Popup_Txt_Exp = data.get("Search_Contract_No_Popup_Txt");		
		String Bill_Missing_Popup_Msg_Exp = data.get("Bill_Missing_Popup_Msg");		
		String Month_Select_For83 = data.get("Month_Select_For83");
		String Year_Select_For83 = data.get("Year_Select_For83");
		String afterMonth_Select_For83 = data.get("afterMonth_Select_For83");
		String afterYear_Select_For83 = data.get("afterYear_Select_For83");
		String show_Bills_Button = data.get("show_Bills_Button");
		String generate_Button = data.get("generate_Button");
		String Condition =data.get("Condition");
		String Search_Contract_No_Column_Header =data.get("Search_Contract_No_Column_Header");

		//locators
		String month_Select83 = String.format(EMS_Contract_Billing_Generation_And_Verification_Locators.month_Select,  Month_Select_For83);
		String after_month_Select83 = String.format(EMS_Contract_Billing_Generation_And_Verification_Locators.month_Select,  afterMonth_Select_For83);
		String show_Bills =  String.format(EMS_Contract_Billing_Generation_And_Verification_Locators.Generatebutton,  show_Bills_Button);
		String generateButton =  String.format(EMS_Contract_Billing_Generation_And_Verification_Locators.Generatebutton,  generate_Button);

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

		if (!Year_Select_For83.equals("")) {
			waitForElement(driver, P_Bill_Period_Year_Field);
			System.out.println("Year_Select_For83 : " + Year_Select_For83);
			clearAndType(driver, P_Bill_Period_Year_Field, Year_Select_For83);
		}
		if (!Month_Select_For83.equals("")) {
			waitForElement(driver, P_Bill_Period_Month_DD);
			click(driver, P_Bill_Period_Month_DD);
			System.out.println("Month_Select_For83 : " + Month_Select_For83);
			waitForElement(driver, month_Select83);
			click(driver, month_Select83);
		}
		Step_Start(4, "Click on Show bills", test, test1);
		waitForElement(driver, show_Bills);
		click(driver, show_Bills);
		Step_End(4, "Click on Show bills", test, test1);

		waitForElement(driver, P_Reset_Btn);
		click(driver, P_Reset_Btn);

		waitForElement(driver, P_Bill_Period_Year_Field);
		System.out.println("Year_Select1_For83 : " + afterYear_Select_For83);
		clearAndType(driver, P_Bill_Period_Year_Field, afterYear_Select_For83);
		waitForElement(driver, P_Bill_Period_Month_DD);
		click(driver, P_Bill_Period_Month_DD);
		System.out.println("Month_Select1_For83 : " + afterMonth_Select_For83);
		waitForElement(driver, after_month_Select83);
		click(driver, after_month_Select83);
		waitForElement(driver, generateButton);
		click(driver, generateButton);
		waitForElement(driver, P_Missng_Bill_Msg);
		String Bill_Missing_Popup = getText(driver, P_Missng_Bill_Msg);
		if (Bill_Missing_Popup_Msg_Exp.equals(Bill_Missing_Popup)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Bill_Missing_Popup_Msg_Exp+ " || Actual Report Activity is : " + Bill_Missing_Popup);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Bill_Missing_Popup_Msg_Exp	+ " || Actual Report Activity is : " + Bill_Missing_Popup, test, test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : "+ Bill_Missing_Popup_Msg_Exp + " || Actual Report Activity is : " + Bill_Missing_Popup);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : "+ Bill_Missing_Popup_Msg_Exp + " || Actual Report Activity is : " + Bill_Missing_Popup,test, test1);
		}
		Extent_completed(testCase_Name, test, test1);
	}
}
