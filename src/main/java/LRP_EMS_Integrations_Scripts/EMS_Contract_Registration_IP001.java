package LRP_EMS_Integrations_Scripts;


import java.util.Map;

import org.openqa.selenium.WebDriver;



import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class EMS_Contract_Registration_IP001 extends Keywords {
	public void emscontractregistrationip001 (WebDriver driver,ExtentTest test,ExtentTest test1, String selected_dataset) throws Exception {
		
		String tc_Name="EMS_Contract_Registration_IP001";
		String URL = TestNgXml.getdatafromExecution().get(tc_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, tc_Name, "Dataset" + selected_dataset,File_Path);
		
		String Username = data.get("Username");
		String Password = data.get("Password");	
		String Search_input = data.get("Search_input");	
		String exist_contractno = data.get("exist_contractno");	
		String contract_popup_msg = data.get("contract_popup_msg");	
	
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, URL); 

		LRP_Login(driver, Username, Password);
		
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);
		
		moduleNavigate(driver, Search_input);

	Step_End(1, "Enter module name in searchbox & click the module", test, test1);

	waitForElement(driver, Esave_button);	
	
	Step_Start(2, " Ensure that system should validate if user try to enter contract no which is already saved.", test, test1);

	sendKeys(driver, Econtractno_field, exist_contractno);
	enter(driver);
	Step_End(2, " Ensure that system should validate if user try to enter contract no which is already saved.", test, test1);

	Extent_call(test, test1, "Ensure that system should validate as 'The Contract No. TUE-11 already exists'");
	
	Step_Start(3, " Ensure that system should validate as 'The Contract No. already exists'", test, test1);

	String error_popup_msg = getText(driver, contractno_error_popup_D);
	if(error_popup_msg.contains(contract_popup_msg))
	{
		System.out.println("Matched || Expected value was : "+contract_popup_msg+" || Actual value was : "+error_popup_msg);
		Extent_pass(driver, "Matched || Expected value was : "+contract_popup_msg+" || Actual value was : "+error_popup_msg, test,test1);
	}
	else
	{
		System.out.println("Not Matched || Expected value was : "+contract_popup_msg+" || Actual value was : "+error_popup_msg);
		Extent_fail(driver,  "Not Matched || Expected value was : "+contract_popup_msg+" || Actual value was : "+error_popup_msg, test,test1);
	}
	Step_End(3, " Ensure that system should validate as 'The Contract No. already exists'", test, test1);

	Extent_completed(tc_Name, test, test1);
	
}

}
