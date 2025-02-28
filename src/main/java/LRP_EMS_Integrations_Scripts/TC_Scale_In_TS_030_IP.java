package LRP_EMS_Integrations_Scripts;


import java.util.Map;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Scale_In_Out_Reference;

public class TC_Scale_In_TS_030_IP extends Keywords {

	public void Invalidcontractnumber(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		// Value are taken from excel sheet

		String testcase_Name = "TC_Scale_In_TS_030_IP";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data30 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
	
		
		String Username = data30.get("Username");// 1,2,4-6

		String Password = data30.get("Password");
		String Search = data30.get("Search_input");
		String savedpopexp = data30.get("PopUpforsaved");
		
		String Reference_Type = data30.get("Reference_Type");
		
		String Contract_No = data30.get("Contract_No");
		String Scale_Reference_no = data30.get("Scale_Reference_no");
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
			Step_Start(1, "Ensure system should allow user to enter scale-in ref",test, test1);
		// Entering Scalin reference
		if (!Scale_Reference_no.equals("")) {
			waitForElement(driver, AScale_in_ref_input);
			safeclick(driver, AScale_in_ref_input);
			sendKeys(driver, AScale_in_ref_input, Scale_Reference_no);
			safeclick(driver, ARemarks_Input);

		} else {
			System.out.println("scaleout reference value was not entered");
			extent_fail(driver, "scaleout reference value was not entered", test, test1);
		}
		Step_End(1, "Ensure system should allow user to enter scale-in ref",test, test1);
		Step_Start(2, "Ensure that system should validate if invalid contract is entered & clicked tab for Contract No. field",test, test1);
// Entering contract number

		waitForElement(driver, AContract_no_input);

		sendKeys(driver, AContract_no_input, Contract_No);
		enter(driver);
		Step_Start(3, " Ensure that system should validate as 'Invalid Supplier Reference'.",test, test1);
		String Actualpopmsg9 = getText(driver, Asavepopup1);
		System.out.println(Actualpopmsg9);

		if (savedpopexp.equals(Actualpopmsg9)) {
			System.out.println("Matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : "
					+ Actualpopmsg9);
			Extent_pass(driver, "Matched || " + " Expected Activity is : " + savedpopexp + " || Actual Activity is : "
					+ Actualpopmsg9, test, test1);
			
			Extent_call(test, test1, "**popup was shown as*** "+Actualpopmsg9);
		} else {
			System.out.println("Not matched || " + " Expected Activity is : " + savedpopexp
					+ " || Actual Activity is : " + Actualpopmsg9);
			Extent_fail(driver, "Not matched || " + " Expected Activity is : " + savedpopexp
					+ " || Actual Activity is : " + Actualpopmsg9, test, test1);
			
		}
		Step_End(2, "Ensure that system should validate if invalid contract is entered & clicked tab for Contract No. field",test, test1);
		Step_End(3, " Ensure that system should validate as 'Invalid Supplier Reference'.",test, test1);
		
		Extent_completed(testcase_Name, test, test1);
	}

}
