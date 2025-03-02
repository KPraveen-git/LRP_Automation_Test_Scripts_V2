package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Contract_Billing_Generation_And_Verification_Locators;

public class TC_EMS_Contract_Billing_Generation_86 extends Keywords {
	public void Billing_Generation_Verification_86(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Throwable {
		String testCase_Name="TC_EMS_Contract_Billing_Generation_86";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		String Sheet_Name_086 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_086, testCase_Name, "Dataset"+selected_dataset, File_Path);
		String user_Name = data.get("Username");
		String pass_word = data.get("Password");
		String Field_Names = data.get("Field_Names");
		String Contaract_No_input = data.get("Contaract_No");
		String Billing_Period = data.get("Billing_Period");
		String Search_Contract_No_Popup_Txt_Exp = data.get("Search_Contract_No_Popup_Txt");		
		String Month_Select_For86 = data.get("Month_Select_For86");
		String Year_Select_For86 = data.get("Year_Select_For86");
		String regenerate_Button = data.get("regenerate_Button");
		String Password_Popup_Input_Txt = data.get("Password_Popup_Input");
		String Already_Exist_Bill_Gate_Txt = data.get("Already_Exist_Bill_Gate").trim();
		String Search1 = data.get("Search1");
		String fromDate = data.get("fromDate");
		String toDate = data.get("toDate");
		String date_Picker = data.get("date_Picker").trim();
		String Condition =data.get("Condition");
		String Search_Contract_No_Column_Header =data.get("Search_Contract_No_Column_Header");
		//locators
		String regenerateButton =  String.format(EMS_Contract_Billing_Generation_And_Verification_Locators.Generatebutton,  regenerate_Button);
		String month_Select86 = String.format(EMS_Contract_Billing_Generation_And_Verification_Locators.month_Select,  Month_Select_For86);
		String contractnumbergrid =  String.format(EMS_Contract_Billing_Generation_And_Verification_Locators.element,  Contaract_No_input);

		Extent_Start(testCase_Name, test, test1);
		navigateUrl(driver, url);
		// Login
		LRP_Login(driver, user_Name, pass_word);
		Step_Start(1, "Open EMS Contract BIlling screen", test, test1);
		//Enter EMS Contract Billing Generation and Verification  model
		moduleNavigate(driver, Field_Names);
		waitForElement(driver, P_Contract_Module_Page);
		if(isDisplayed(driver, P_Contract_Module_Page)) {
			System.out.println("*****EMS Contract Billing Generation and Verification Module is Dispalyed*****");
			Extent_pass(driver, "*****EMS Contract Billing Generation and Verification Module is Dispalyed*****", test,test1);
		}else {
			System.out.println("*****EMS Contract Billing Generation and Verification Module is not Dispalyed");
			Extent_fail(driver, "*****EMS Contract Billing Generation and Verification Module is not Dispalyed*****", test,test1);
		}
		Step_End(1, "Open EMS Contract BIlling screen", test, test1);
		Step_Start(2, "Select Contract no which is already uploaded in lessor bill & in error node for bill upload gate", test, test1);
		waitForElement(driver, P_Contact_No_Plus_Btn);
		click(driver, P_Contact_No_Plus_Btn);

		waitForElement(driver, P_Search_Contract_No_Popup);
		if(Search_Contract_No_Popup_Txt_Exp.equals(getText(driver, P_Search_Contract_No_Popup))) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp + " || Actual Report Activity is : " + getText(driver, P_Search_Contract_No_Popup));
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp + " || Actual Report Activity is : " + getText(driver, P_Search_Contract_No_Popup), test,test1);
		}
		else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp + " || Actual Report Activity is : " + getText(driver, P_Search_Contract_No_Popup));
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Search_Contract_No_Popup_Txt_Exp + " || Actual Report Activity is : " + getText(driver, P_Search_Contract_No_Popup), test,test1);
		}
		twoColumnSearchWindow(driver,Search_Contract_No_Column_Header, Condition, Contaract_No_input);
		Step_End(2, "Select Contract no which is already uploaded in lessor bill & in error node for bill upload gate", test, test1);
		Step_Start(3, "click regenerate & enter valid password for the same period as upload in bill upload gate", test, test1);
		waitForElement(driver, P_Bill_Period_Year_Field);
		clearAndType(driver, P_Bill_Period_Year_Field,Year_Select_For86);
		waitForElement(driver, P_Bill_Period_Month_DD);
		click(driver, P_Bill_Period_Month_DD);
		System.out.println("Month_Select_For86 : "+Month_Select_For86);
		waitForElement(driver, month_Select86);
		click(driver, month_Select86);

		waitForElement(driver, regenerateButton);
		click(driver, regenerateButton);
		waitForElement(driver, P_Regenaration_Pass_TxtField);
		click(driver, P_Regenaration_Pass_TxtField);
		sendKeys(driver, P_Regenaration_Pass_TxtField, Password_Popup_Input_Txt);
		waitForElement(driver, P_Regenaration_Pass_OkBtn);
		click(driver, P_Regenaration_Pass_OkBtn);
		Step_End(3, "click regenerate & enter valid password for the same period as upload in bill upload gate", test, test1);
		Step_Start(4, "Ensure that system should show warning message as 'This Contract is Already Exist in Bill Upload Gate'.", test, test1);
		waitForElement(driver, P_Bill_Already_Exist_Popup_Msg);
		String Exist_Popup_Msg= getText(driver, P_Bill_Already_Exist_Popup_Msg);
		System.out.println("Exist_Popup_Msg : "+Exist_Popup_Msg);
		if(Already_Exist_Bill_Gate_Txt.equals(Exist_Popup_Msg)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Already_Exist_Bill_Gate_Txt + " || Actual Report Activity is : " + Exist_Popup_Msg);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Already_Exist_Bill_Gate_Txt + " || Actual Report Activity is : " + Exist_Popup_Msg, test,test1);
		}
		else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Already_Exist_Bill_Gate_Txt + " || Actual Report Activity is : " + Exist_Popup_Msg);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Already_Exist_Bill_Gate_Txt + " || Actual Report Activity is : " + Exist_Popup_Msg, test,test1);
		}
		Step_End(4, "Ensure that system should show warning message as 'This Contract is Already Exist in Bill Upload Gate'.", test, test1);
		Step_Start(5, " Click 'No' button and contract should be cleared from bill upload gate for the given period Check the same in Bill upload that contract should not be delete", test, test1);
		waitForElement(driver, P_Bill_Already_Exist_Popup_NoBtn);
		click(driver, P_Bill_Already_Exist_Popup_NoBtn);
		moduleNavigate(driver, Search1);
		waitForElement(driver, from_Date);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			click(driver, from_Date);
			selectDatePicker(driver, from_Date, fromDate);
		} else {
			clearAndType(driver, from_Date, fromDate);
		}
		waitForElement(driver, to_Date);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			click(driver, to_Date);
			selectDatePicker(driver, from_Date, toDate);
		} else {
			clearAndType(driver, to_Date, toDate);
		}
		waitForElement(driver, Arefresh);
		click(driver, Arefresh);
		waitForElement(driver, Tool_Panel_Bill_Upload_Gate);
		click(driver, Tool_Panel_Bill_Upload_Gate);
		waitForElement(driver, Condition_Filter_Bill_Upload_Gate);
		click(driver, Condition_Filter_Bill_Upload_Gate);
		waitForElement(driver, Contract_No_Filter);
		sendKeys(driver, Contract_No_Filter, Contaract_No_input);
		waitForElement(driver, Billing_Period_Filter);
		sendKeys(driver, Billing_Period_Filter, Billing_Period);

		waitForElement(driver, contractnumbergrid);
		if (isDisplayed(driver, contractnumbergrid)) {
			System.out
			.println(Contaract_No_input+" Data was shown in grid");
			Extent_pass(driver,
					Contaract_No_input+"***Data was shown in grid***",test,test1);
			waitForElement(driver, Arowoneclick);
			String Location1=getText(driver, Arowoneclick);
			System.out.println(Location1);
			Extent_pass(driver,"Contract number shown as"+"****"+
					Location1,test,test1);

			String equetype45=getText(driver, Lessor);
			System.out.println(equetype45);
			Extent_pass(driver,"Lessor shown as"
					+"****"+ equetype45,test,test1);
			String equeque=getText(driver, Bill_no);
			System.out.println(equeque);
			Extent_pass(driver,"BillNo  shown as "+
					"***"+equeque,test,test1);
			String equequee=getText(driver, Billing_number);
			System.out.println(equequee);
			Extent_pass(driver,"Billing Period  shown as "+
					"***"+equequee,test,test1);
			String equequee1=getText(driver, Status);
			System.out.println(equequee1);
			Extent_pass(driver,"Status  shown as "+
					"***"+equequee1,test,test1);
		} else {
			System.out.println(
					Contaract_No_input+"Data was NOT shown in grid");
			Extent_fail(driver,
					Contaract_No_input+"Data was NOT shown in grid",test,test1);
		}
		Step_End(5, " Click 'No' button and contract should be cleared from bill upload gate for the given period Check the same in Bill upload that contract should not be delete", test, test1);
		Extent_completed(testCase_Name, test, test1);
	}
}
