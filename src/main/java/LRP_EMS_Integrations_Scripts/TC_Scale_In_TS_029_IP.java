package LRP_EMS_Integrations_Scripts;


import java.util.Map;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Scale_In_Out_Reference;

public class TC_Scale_In_TS_029_IP extends Keywords {

	public void Withoutenterperdiem(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		// Value are taken from excel sheet

		String testcase_Name = "TC_Scale_In_TS_029_IP";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data29 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
		String Username = data29.get("Username");// 1,2,4-6
		String Password = data29.get("Password");
		String Search = data29.get("Search_input");
		String contractnum = data29.get("Contract_No");
		
		String savedpopexp = data29.get("PopUpforsaved");
		String todayenter = data29.get("TODAYS");
		String Condition_Filter = data29.get("Condition_Filter");
		String Slab_CheckBox = data29.get("Slab_CheckBox");
		
		String Reference_Type = data29.get("Reference_Type");
		String Contract_Number_Search = data29.get("Contract_Number_Search");
		String per_diem_slap = data29.get("per_diem_slap");
		
		String ReferenceType_Select =  String.format(Scale_In_Out_Reference.reference_type,Reference_Type); 
		Extent_Start(testcase_Name, test, test1);
		
		
		navigateUrl(driver, URL);

	
// LOGIN
		LRP_Login(driver, Username, Password);
		moduleNavigate(driver, Search);
		waitForElement(driver, Reference_Type_Field);
		safeclick(driver, Reference_Type_Field);
		
		
		waitForElement(driver, ReferenceType_Select);
		safeclick(driver, ReferenceType_Select);
		
		waitForElement(driver, AContract_no_input);
		waitForElement(driver, AContractNumsearch);
		safeclick(driver, AContractNumsearch);
		waitForElement(driver, Ainputcontractnum);
		twoColumnSearchWindow(driver, Contract_Number_Search, Condition_Filter, contractnum);
		
		Step_Start(1, "Ensure system should allow user to select checkbox for slab''",test, test1);
		waitForElement(driver, Slab_ChkBok);
		checkBox(driver, Slab_ChkBok, Slab_CheckBox);
		Step_End(1, "Ensure system should allow user to select checkbox for slab''",test, test1);
		// OPTION OF SELECTING THE CHECK BOX
		
		Step_Start(2, "Ensure that system should validate when user try to add slab without giving Per Diem'",test, test1);
		Step_Start(3, "Ensure that system should validate as 'Enter The Perdiem Value'.m'",test, test1);
		if(isElementAccessible(driver, AslabboxADD)) {
			
			waitForElement(driver, AslabboxADD);
			safeclick(driver, AslabboxADD);
			waitForElement(driver, AslabboxADDTodays);
		
			doubleClick(driver, AslabboxADDTodays);
			
			Actionsendkeys(driver, AslabboxADDTodays, todayenter);
			
			waitForElement(driver, AslabboxADDperdiem);
			
			doubleClick(driver, AslabboxADDperdiem);
waitForElement(driver, APer_Diem_Input);	
sendKeys(driver, APer_Diem_Input, per_diem_slap);
			waitForElement(driver, AScale_in_pickup_charges);
			safeclick(driver, AScale_in_pickup_charges);
			
			waitForElement(driver, AslabboxADD);
			safeclick(driver, AslabboxADD);
			waitForElement(driver, perdiempop);
			String Actualpopmsg7=getText(driver,perdiempop);
			System.out.println(Actualpopmsg7);
			if (savedpopexp.equals(Actualpopmsg7)) {
				System.out
						.println("Matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : " + Actualpopmsg7);
				Extent_pass(driver,
						"Matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : " + Actualpopmsg7,test,test1);
				
				Extent_call(test, test1, "**popup was shown as*** "+Actualpopmsg7);
			} else {
				System.out.println(
						"Not matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : " + Actualpopmsg7);
				Extent_fail(driver,
						"Not matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : " + Actualpopmsg7,test,test1);
				
			}

waitForElement(driver, perdiemok);
safeclick(driver, perdiemok);

Step_End(2, "Ensure that system should validate when user try to add slab without giving Per Diem'",test, test1);
Step_End(3, "Ensure that system should validate as 'Enter The Perdiem Value'.m'",test, test1);
Extent_completed(testcase_Name, test, test1);


}











}}
