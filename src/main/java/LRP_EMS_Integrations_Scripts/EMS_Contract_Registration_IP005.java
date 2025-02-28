package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Ems_Contract_Registration_Locators;

public class EMS_Contract_Registration_IP005 extends Keywords {

public void emscontractregistrationip005 (WebDriver driver,ExtentTest test,ExtentTest test1, String selected_dataset) throws Exception {
		
	String tc_Name="EMS_Contract_Registration_IP005";

	String URL = TestNgXml.getdatafromExecution().get(tc_Name);
	String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
	String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
	Map<String, String> data = Utils.GetAllData(Sheet_Name, tc_Name, "Dataset" + selected_dataset,File_Path);
	
	    String Username = data.get("Username");
		String Password = data.get("Password");	
		String Search_input = data.get("Search_input");	
		String leasekind = data.get("leasekind");	
		String lessor_code = data.get("lessor_code");	
		String lessee_code = data.get("lessee_code");	
		String select_sizetype_msg = data.get("select_sizetype_msg");	
		String contract_no5 = data.get("contract_no5");	
		String ContractType5 = data.get("ContractType5");	
		String Condition = data.get("Condition");
		String lease_code_header = data.get("lease_code_header");
		String lessor_code_header = data.get("lessor_code_header");
		String lesee_code_header = data.get("lesee_code_header");

		
		 String contype_opt =String.format(Ems_Contract_Registration_Locators.contype_opt, ContractType5);

		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, URL); 

		
		LRP_Login(driver, Username, Password);
		
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

		moduleNavigate(driver, Search_input);
		
		Step_End(1, "Enter module name in searchbox & click the module", test, test1);
		
		
    waitForElement(driver, Econtractno_field);
	   sendKeys(driver, Econtractno_field, contract_no5);
	   
	   waitForElement(driver, Econtracttype_field);
	   click(driver, Econtracttype_field);
	   waitForDisplay(driver, contract_types);
		 if(!isDisplayed(driver,contract_types)) {
			  click(driver, Econtracttype_field);
		 }
		
			 
			 waitForElement(driver, contype_opt);
		     click(driver, contype_opt);
			 
		 	
	     waitForElement(driver, Eleasekind_searchicon);
			click(driver,Eleasekind_searchicon);	
			twoColumnSearchWindow(driver, lease_code_header, Condition, leasekind);

			
			
			waitForElement(driver, Elessorcode_searchicon);
			click(driver,Elessorcode_searchicon);
			twoColumnSearchWindow(driver, lessor_code_header, Condition, lessor_code);

			
			
			waitForElement(driver, Elessee_searchicon);
			click(driver,Elessee_searchicon);		
			twoColumnSearchWindow(driver, lesee_code_header, Condition, lessee_code);

			
			waitForElement(driver, Esizeandtype_tab);
		click(driver, Esizeandtype_tab);
		
		Step_Start(2, " Ensure system should validate if user try to click add button without selecting size/type from size/type tab ", test, test1);
		waitForElement(driver, Esizeaddbutton);
		click(driver, Esizeaddbutton);
		Step_End(2, " Ensure system should validate if user try to click add button without selecting size/type from size/type tab ", test, test1);

		
		Step_Start(3, " Ensure that system should validate as 'Select the Sz./Tp'", test, test1);
		waitForElement(driver, select_sizetyep_popup_D);
		String error_popup_msg3=getText(driver, select_sizetyep_popup_D);
		
		Extent_call(test, test1, "Ensure that system should validate as 'Select the Sz./Tp");
	 	
		if(error_popup_msg3.equals(select_sizetype_msg))
		{
			System.out.println("Matched || Expected value was : "+select_sizetype_msg+" || Actual value was : "+error_popup_msg3);
			Extent_pass(driver, "Matched || Expected value was : "+select_sizetype_msg+" || Actual value was : "+error_popup_msg3, test,test1);
		}
		else
		{
			System.out.println("Not Matched || Expected value was : "+select_sizetype_msg+" || Actual value was : "+error_popup_msg3);
			Extent_fail(driver,  "Not Matched || Expected value was : "+select_sizetype_msg+" || Actual value was : "+error_popup_msg3, test,test1);
		}
		
		Step_End(3, " Ensure that system should validate as 'Select the Sz./Tp'", test, test1);

		Extent_completed(tc_Name, test, test1);
}
}
