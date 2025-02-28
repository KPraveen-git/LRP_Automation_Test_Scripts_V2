package LRP_EMS_Integrations_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EMS_Contract_Billing_Generation_68 extends Keywords {

	public void Billing_Generation_Verification_68(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Throwable {
		String testCase_Name="TC_EMS_Contract_Billing_Generation_68";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String Sheet_Name_068 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);

		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_068, testCase_Name, "Dataset"+selected_dataset, File_Path);
		String user_Name = data.get("Username");
		String pass_word = data.get("Password");
		String Field_Names = data.get("Field_Names");
		String Values_Should_Be_Selected_Popup_Txt = data.get("Values_Should_Be_Selected_Popup");
		String Search_Contract_No_Popup_Txt_Exp = data.get("Search_Contract_No_Popup_Txt");
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
		Step_Start(3, "Ensure that system should validate if user try to click select button without selecting any checkbox from Search Contract No list", test, test1);

	
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
		waitForElement(driver, P_Search_Contract_No_Popup_SelBtn);
		click(driver, P_Search_Contract_No_Popup_SelBtn);
	
		Step_End(3, "Ensure that system should validate if user try to click select button without selecting any checkbox from Search Contract No list", test, test1);
		Step_Start(4, "Ensure that system should validate as 'Values should be selected'.", test, test1);
		waitForElement(driver, P_Search_Contract_Alert_Popup);
		String alertMsg = getText(driver, P_Search_Contract_Alert_Msg);
		if (Values_Should_Be_Selected_Popup_Txt.equals(alertMsg)) {
			System.out.println("Matched || " + " Expected Report Activity is : "+ Values_Should_Be_Selected_Popup_Txt + " || Actual Report Activity is : " + alertMsg);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : "+ Values_Should_Be_Selected_Popup_Txt + " || Actual Report Activity is : " + alertMsg, test,test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : "+ Values_Should_Be_Selected_Popup_Txt + " || Actual Report Activity is : " + alertMsg);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : "+ Values_Should_Be_Selected_Popup_Txt + " || Actual Report Activity is : " + alertMsg,test, test1);
		}
		Step_End(4, "Ensure that system should validate as 'Values should be selected'.", test, test1);
		Extent_completed(testCase_Name, test, test1);
	}
}
