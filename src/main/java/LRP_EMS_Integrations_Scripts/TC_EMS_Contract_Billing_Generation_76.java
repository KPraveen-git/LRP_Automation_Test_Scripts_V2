package LRP_EMS_Integrations_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Locators;

public class  TC_EMS_Contract_Billing_Generation_76 extends Keywords{

	public void Billing_Generation_Verification_76(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) throws Throwable {
		String testCase_Name="TC_EMS_Contract_Billing_Generation_76";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		String Sheet_Name_076 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_076, testCase_Name, "Dataset"+selected_dataset, File_Path);
		String user_Name = data.get("Username");
		String pass_word = data.get("Password");
		String Field_Names = data.get("Field_Names");
		String Contaract_No_input = data.get("Contaract_No");
		String Password_Popup_Input_Txt = data.get("Password_Popup_Input");
		String Search_Contract_No_Popup_Txt_Exp = data.get("Search_Contract_No_Popup_Txt");
		String Add_Remarks_Popup_Txt = data.get("Add_Remarks_Popup");
		String Verified_Popup_Txt = data.get("Verified_Popup");
		String Remark_Txt_Field_input = data.get("Remark_Txt_Field");
		String Highlighted_RedColor_txt_Exp = data.get("Highlighted_RedColor_txt");
		String Do_You_Want_Regenerate = data.get("Do_You_Want_Regenerate");
		String Month_Select_For76 = data.get("Month_Select_For76");
		String Year_Select_For76 = data.get("Year_Select_For76");
		String show_Bills_Button = data.get("show_Bills_Button");
		String ContractNo_CheckBox_Select = data.get("ContractNo_CheckBox_Select");
		String Condition =data.get("Condition");
		String Search_Contract_No_Column_Header =data.get("Search_Contract_No_Column_Header");

		//locators
		String month_Select76 = String.format(EMS_Locators.month_Select,  Month_Select_For76);
		String show_Bills =  String.format(EMS_Locators.generatebutton,  show_Bills_Button);
		String ContractNo_Select_CheckBox =  String.format(EMS_Locators.ContractNo_Select_CheckBox,  Contaract_No_input);
		String verrified_Row =  String.format(EMS_Locators.verrified_Row,  Contaract_No_input);
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

		if (!Year_Select_For76.equals("")) {
			waitForElement(driver, P_Bill_Period_Year_Field);
			System.out.println("Year_Select_For76 : " + Year_Select_For76);
			clearAndType(driver, P_Bill_Period_Year_Field, Year_Select_For76);
		}
		if (!Month_Select_For76.equals("")) {
			waitForElement(driver, P_Bill_Period_Month_DD);
			click(driver, P_Bill_Period_Month_DD);
			System.out.println("Month_Select_For76 : " + Month_Select_For76);
			waitForElement(driver, month_Select76);
			click(driver, month_Select76);
		}
		Step_Start(4, "Click on Show bills", test, test1);
		waitForElement(driver, show_Bills);
		click(driver, show_Bills);
		Step_End(4, "Click on Show bills", test, test1);
		Step_Start(5, "Select the checkbox from the contract summary for required contract", test, test1);
		waitForElement(driver, ContractNo_Select_CheckBox);
		checkBox(driver, ContractNo_Select_CheckBox, ContractNo_CheckBox_Select);
		Step_End(5, "Select the checkbox from the contract summary for required contract", test, test1);
		Step_Start(6, "Click verify button after entering remarks", test, test1);
		waitForElement(driver, P_Verify_Btn);
		click(driver, P_Verify_Btn);
		Step_End(6, "Click verify button after entering remarks", test, test1);
		Step_Start(7, "Ensure that system should show succesfully message when user provided remarks and clicked ok button", test, test1);
		waitForElement(driver, P_Add_Remark_Title);
		String Act_Popup_Msg = getText(driver, P_Add_Remark_Title);
		if (Add_Remarks_Popup_Txt.equals(Act_Popup_Msg)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Add_Remarks_Popup_Txt+ " || Actual Report Activity is : " + Act_Popup_Msg);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : "+ Add_Remarks_Popup_Txt + " || Actual Report Activity is : " + Act_Popup_Msg, test,test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : "+ Add_Remarks_Popup_Txt + " || Actual Report Activity is : " + Act_Popup_Msg);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : "+ Add_Remarks_Popup_Txt + " || Actual Report Activity is : " + Act_Popup_Msg, test,test1);
		}
		waitForElement(driver, P_Remark_Txt_Field);
		click(driver, P_Remark_Txt_Field);
		waitForElement(driver, P_Remark_Txt_Field);
		sendKeys(driver, P_Remark_Txt_Field, Remark_Txt_Field_input);
		waitForElement(driver, P_Remark_Ok_Btn);
		click(driver, P_Remark_Ok_Btn);
		Step_End(7, "Ensure that system should show succesfully message when user provided remarks and clicked ok button", test, test1);
		Step_Start(8, "Ensure that system should show confirmation message as 'Verified Successfully'.", test, test1);
		waitForElement(driver, P_Verified_Popup);
		String act_Popup_Msg = getText(driver, P_Verified_Popup);
		if (Verified_Popup_Txt.equals(act_Popup_Msg)) {
			System.out.println("Matched || " + " Expected Report Activity is : "+ Verified_Popup_Txt + " || Actual Report Activity is : " + act_Popup_Msg);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : "+ Verified_Popup_Txt + " || Actual Report Activity is : " + act_Popup_Msg, test,test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : "+ Verified_Popup_Txt + " || Actual Report Activity is : " + act_Popup_Msg);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : "+ Verified_Popup_Txt + " || Actual Report Activity is : " + act_Popup_Msg, test,test1);
		}
		Step_End(8, "Ensure that system should show confirmation message as 'Verified Successfully'.", test, test1);
		Step_Start(9, "Ensure that system should Highlighted red color for Total by Contract row once verified. ", test, test1);
		waitForElement(driver, verrified_Row);
		String red_Colour = getTextBackgroundColor(driver, verrified_Row);
		System.out.println("red_Colour : "+red_Colour);
		if(Highlighted_RedColor_txt_Exp.equals(red_Colour)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Highlighted_RedColor_txt_Exp + " || Actual Report Activity is : " + red_Colour);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Highlighted_RedColor_txt_Exp + " || Actual Report Activity is : " + red_Colour, test,test1);
		}
		else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Highlighted_RedColor_txt_Exp + " || Actual Report Activity is : " + red_Colour);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Highlighted_RedColor_txt_Exp + " || Actual Report Activity is : " + red_Colour, test,test1);
		}
		Step_End(9, "Ensure that system should Highlighted red color for Total by Contract row once verified. ", test, test1);
		if (Do_You_Want_Regenerate.equalsIgnoreCase("Yes")) {
			waitForElement(driver, P_Reset_Btn);
			click(driver, P_Reset_Btn);
			waitForElement(driver, P_ReGenerate_Btn);
			click(driver, P_ReGenerate_Btn);
			waitForElement(driver, P_Regenaration_Pass_TxtField);
			click(driver, P_Regenaration_Pass_TxtField);
			sendKeys(driver, P_Regenaration_Pass_TxtField, Password_Popup_Input_Txt);
			waitForElement(driver, P_Regenaration_Pass_OkBtn);
			click(driver, P_Regenaration_Pass_OkBtn);
			waitForElement(driver, P_Verification_Popup_YesBtn);
			click(driver, P_Verification_Popup_YesBtn);
		}
		Extent_completed(testCase_Name, test, test1);
	}
}