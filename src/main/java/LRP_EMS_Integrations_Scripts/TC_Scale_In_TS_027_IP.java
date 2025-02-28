package LRP_EMS_Integrations_Scripts;


import java.util.Map;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Scale_In_Out_Reference;

public class TC_Scale_In_TS_027_IP extends Keywords {

	public void addandremoveslab(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String testcase_Name = "TC_Scale_In_TS_027_IP";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data27 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		String Username = data27.get("Username");// 1,2,4-6
		String Password = data27.get("Password");
		String Search = data27.get("Search_input");
		String contractnum = data27.get("Contract_No");
		String Slab_CheckBox = data27.get("Slab_CheckBox");
		String Reference_Type = data27.get("Reference_Type");
		String Condition_Filter = data27.get("Condition_Filter");
		String Contract_Number_Search = data27.get("Contract_Number_Search");
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

		// before selecting the slab box

		waitForElement(driver, Slab_ChkBok);
		if (!isElementAccessible(driver, AslabboxADD)) {
			System.out.println("Add button in slab is not enable before selecting the slab box");
			Extent_pass(driver, "****Add button in slab is not enable before selecting the slab box****", test, test1);

		} else {
			System.out.println("Add button in slab is enable before selecting the slab box");
			Extent_fail(driver, "***Add button in slab is enable before selecting the slab box***", test, test1);
			
		}
		if (!isElementAccessible(driver, REMOVEBUTTON)) {
			System.out.println("Remove button in slab is not enable before selecting the slab box");
			Extent_pass(driver, "***Remove button in slab is not enable before selecting the slab box***", test, test1);

		} else {
			System.out.println("Remove button in slab is enable before selecting the slab box");
			Extent_fail(driver, "***Remove button in slab is enable before selecting the slab box***", test, test1);
			
		}
		Step_End(1, "Ensure system should allow user to select checkbox for slab''",test, test1);
		Step_Start(2, "Ensure that system should enable Add & remove button only when Slab checkbox is selected'",test, test1);
// After selecting the slab box

		waitForElement(driver, Slab_ChkBok);
		checkBox(driver, Slab_ChkBok, Slab_CheckBox);
		System.out.println("Slab box Status:" + Slab_CheckBox);
		
		
		
	
		
		
		// OPTION OF SELECTING THE CHECK BOX
		waitForElement(driver, Slab_ChkBok);
		if (isElementAccessible(driver, AslabboxADD)) {
			System.out.println("Add button in slab is enable");
			Extent_pass(driver, "***Add button in slab is enable****", test, test1);
		} else {
			System.out.println("Add button in slab is not enable");
			Extent_fail(driver, "***Add button in slab is not enable****", test, test1);
			
		}
		if (isElementAccessible(driver, REMOVEBUTTON)) {
			System.out.println("Remove button in slab is enable");
			Extent_pass(driver, "****Remove button in slab is enable****", test, test1);
		} else {
			System.out.println("Remove button in slab is not enable");
			Extent_fail(driver, "*****Remove button in slab is not enable****", test, test1);
			

		}
		Step_End(2, "Ensure that system should enable Add & remove button only when Slab checkbox is selected'",test, test1);
		Extent_completed(testcase_Name, test, test1);
	}

}
