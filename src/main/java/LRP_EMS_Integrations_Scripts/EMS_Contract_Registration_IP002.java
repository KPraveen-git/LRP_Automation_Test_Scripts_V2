package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Ems_Contract_Registration_Locators;

public class EMS_Contract_Registration_IP002 extends Keywords {
	public void emscontractregistrationip002(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception {
		String tc_Name="EMS_Contract_Registration_IP002";

		String URL = TestNgXml.getdatafromExecution().get(tc_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, tc_Name, "Dataset" + selected_dataset,File_Path);
		
		String Username = data.get("Username");
		String Password = data.get("Password");
		String Search_input = data.get("Search_input");
		String enter_contractno_msg = data.get("enter_contractno_msg");
		String Contractno = data.get("Contractno");
		String ContractType2 = data.get("ContractType2");
		
		 String contype_opt =String.format(Ems_Contract_Registration_Locators.contype_opt, ContractType2);
		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, URL); 

		LRP_Login(driver, Username, Password);
		
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

		moduleNavigate(driver, Search_input);

	Step_End(1, "Enter module name in searchbox & click the module", test, test1);

	Step_Start(2, "Ensure that system should validate as 'Enter the Contract No.' when user try to select contract type without entering contract no", test, test1);
	 waitForElement(driver, Econtracttype_field);
	   click(driver, Econtracttype_field);
	   waitForDisplay(driver, contract_types);
	   
		 if(!isDisplayed(driver,contract_types)) {
			  click(driver, Econtracttype_field);
		 }
 
		 waitForElement(driver, contype_opt);
	     click(driver, contype_opt);
 
	   Extent_call(test, test1, " Ensure that system should validate as 'Enter the Contract No.' when user try to select contract type without entering contract no");
	 	
	     waitForElement(driver, enter_contractno_popup);
	 String error_popup_msg1=getText(driver, enter_contractno_popup);
	 if(error_popup_msg1.equals(enter_contractno_msg))
		{
			System.out.println("Matched || Expected value was : "+enter_contractno_msg+" || Actual value was : "+error_popup_msg1);
			Extent_pass(driver, "Matched || Expected value was : "+enter_contractno_msg+" || Actual value was : "+error_popup_msg1, test,test1);
		}
		else
		{
			System.out.println("Not Matched || Expected value was : "+enter_contractno_msg+" || Actual value was : "+error_popup_msg1);
			Extent_fail(driver,  "Not Matched || Expected value was : "+enter_contractno_msg+" || Actual value was : "+error_popup_msg1, test,test1);
		}
		Step_End(2, "Ensure that system should validate as 'Enter the Contract No.' when user try to select contract type without entering contract no", test, test1);

	 Extent_call(test, test1, "Ensure that system should allow user to enter & save alphanumeric in contract no");
		
	 Step_Start(3, " Ensure that system should allow user to enter & save alphanumeric in contract no", test, test1);
	waitForElement(driver, Econtractno_field);
	 sendKeys(driver, Econtractno_field, Contractno);
	 waitForElement(driver, Econtractno_field);
	 click(driver, Econtractno_field);
	 String entered_contractno=getAttribute(driver, Econtractno_field, "value");
		waitForElement(driver, Econtractno_field);
  if(!entered_contractno.equals("")){
	 if(entered_contractno.equals(Contractno))
		{
			System.out.println("User can able to enter Alpha numeric values");
			System.out.println("Matched || Expected value was : "+Contractno+" || Actual value was : "+entered_contractno);
			Extent_pass(driver, "Matched || Expected value was : "+Contractno+" || Actual value was : "+entered_contractno, test,test1);
		}
		else
		{
			System.out.println("User cannot able to enter Alpha numeric values");
			System.out.println("Not Matched || Expected value was : "+Contractno+" || Actual value was : "+entered_contractno);
			Extent_fail(driver,  "Not Matched || Expected value was : "+Contractno+" || Actual value was : "+entered_contractno, test,test1);
		}
  }
	 Step_End(3, " Ensure that system should allow user to enter & save alphanumeric in contract no", test, test1);

	 waitForElement(driver, close_module_D);
	 click(driver, close_module_D);
		Extent_completed(tc_Name, test, test1);
}

}
