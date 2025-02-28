package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Ems_Contract_Registration_Locators;

public class EMS_Contract_Registration_IP007 extends Keywords{

public void emscontractregistrationip007 (WebDriver driver,ExtentTest test,ExtentTest test1, String selected_dataset) throws Exception {
		
	String tc_Name="EMS_Contract_Registration_IP007";

	String URL = TestNgXml.getdatafromExecution().get(tc_Name);
	String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
	String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
	Map<String, String> data = Utils.GetAllData(Sheet_Name, tc_Name, "Dataset" + selected_dataset,File_Path);
	
	    String Username = data.get("Username");
		String Password = data.get("Password");	
		String Search_input = data.get("Search_input");	
		String Contractno7 = data.get("Contractno7");	
		String ContractType7 = data.get("ContractType7");	
		String leasekind = data.get("leasekind");	
		String lessor_code = data.get("lessor_code");	
		String lessee_code = data.get("lessee_code");	
		String sizevalue = data.get("sizevalue");	
		String leasevalue = data.get("leasevalue");	
		String perdiem_msg = data.get("perdiem_msg");
		String date_Picker = data.get("date_Picker");
		String from_date = data.get("from_date");
		String to_date = data.get("to_date");
		String Condition = data.get("Condition");
		String lease_code_header = data.get("lease_code_header");
		String lessor_code_header = data.get("lessor_code_header");
		String lesee_code_header = data.get("lesee_code_header");

		
		 String contype_opt =String.format(Ems_Contract_Registration_Locators.contype_opt, ContractType7);
	     String sizevalue_opt =String.format(Ems_Contract_Registration_Locators.sizevalue_opt, sizevalue);
		String leasevalue_opt=String.format(Ems_Contract_Registration_Locators.leasevalue_opt, leasevalue);
		
		
		Extent_Start(tc_Name, test, test1);
		
			navigateUrl(driver, URL); 

			LRP_Login(driver, Username, Password);
			
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);
			moduleNavigate(driver, Search_input);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);
	    
	    Extent_call(test, test1, "Ensure system should allow user to enter contract no & contract type");
	    
	    Step_Start(2, "Ensure system should allow user to enter contract no & contract type", test, test1);
	    waitForElement(driver, Econtractno_field);
		   sendKeys(driver, Econtractno_field, Contractno7);
		   
		   waitForElement(driver, Econtracttype_field);
		   click(driver, Econtracttype_field);
		   waitForDisplay(driver, contract_types);
			 if(!isDisplayed(driver,contract_types)) {
				  click(driver, Econtracttype_field);
			 }
			 
				 waitForElement(driver, contype_opt);
			     click(driver, contype_opt);
				    Step_End(2, "Ensure system should allow user to enter contract no & contract type", test, test1);
		
		     waitForElement(driver, Eleasekind_searchicon);
				click(driver,Eleasekind_searchicon);	
				twoColumnSearchWindow(driver, lease_code_header, Condition, leasekind);

				Extent_call(test, test1, "Ensure that should allow user to select Lessor & Lessor from that field");	
				Step_Start(3, " Ensure that should allow user to select Lessor & Lessor from that field", test, test1);
				waitForElement(driver, Elessorcode_searchicon);
				click(driver,Elessorcode_searchicon);
				twoColumnSearchWindow(driver, lessor_code_header, Condition, lessor_code);

				
				waitForElement(driver, Elessee_searchicon);
				click(driver,Elessee_searchicon);		
				twoColumnSearchWindow(driver, lesee_code_header, Condition, lessee_code);

				Step_End(3, " Ensure that should allow user to select Lessor & Lessor from that field", test, test1);
	
				Step_Start(4, "Ensure that system should allow user to select valid From & To Period", test, test1);
				waitForElement(driver, Evaild_from);
				if (date_Picker.equalsIgnoreCase("Yes")) {
					
					selectDatePicker(driver, Evaild_from, from_date);
					
					
				} else {
					waitForElement(driver, Evaild_from);
					clearAndType(driver, Evaild_from, from_date);
				}


				waitForElement(driver, Evaild_to);
				if (date_Picker.equalsIgnoreCase("Yes")) {
					
					selectDatePicker(driver, Evaild_to, to_date);
					
				} else {
					waitForElement(driver, Evaild_to);
					clearAndType(driver, Evaild_to, to_date);
				}
				Step_End(4, "Ensure that system should allow user to select valid From & To Period", test, test1);
				Step_Start(5, "Ensure that system should able to select size type tab", test, test1);
				Extent_call(test, test1, "Ensure that system should able to click on Size/Type tab");
				waitForElement(driver, Esizeandtype_tab);
				click(driver, Esizeandtype_tab);
				waitForElement(driver, Esizeandtype_Field);
				click(driver,Esizeandtype_Field);
				
				waitForElement(driver, sizevalue_opt);
				click(driver, sizevalue_opt);
				Step_End(5, "Ensure that system should able to select size type tab", test, test1);

				Step_Start(6, "Ensure that system should able to select Lease charge type as 'No banding'", test, test1);
				Extent_call(test, test1, "Ensure that system should able to select Lease charge type as 'No banding'");
				
				waitForElement(driver, Eleasechargetype_Field);
				click(driver,Eleasechargetype_Field);
				waitForElement(driver, leasevalue_opt);
				click(driver, leasevalue_opt);
				Step_End(6, "Ensure that system should able to select Lease charge type as 'No banding'", test, test1);

				
				Step_Start(7, "Ensure that System should validate as 'Do you want to Proceed with perdiem 0.0' when user clicked add button without entering Per Diem", test, test1);
			
				waitForElement(driver, Esizeaddbutton);
				click(driver, Esizeaddbutton);
				waitForElement(driver, perdiem_popup_D);
				String error_popup_msg5=getText(driver, perdiem_popup_D);
				
				Extent_call(test, test1, "Ensure that System should validate as 'Do you want to Proceed with perdiem 0.0' when user clicked add button without entering Per Diem");
			 	
				if(error_popup_msg5.equals(perdiem_msg))
				{
					System.out.println("Matched || Expected value was : "+perdiem_msg+" || Actual value was : "+error_popup_msg5);
					Extent_pass(driver, "Matched || Expected value was : "+perdiem_msg+" || Actual value was : "+error_popup_msg5, test,test1);
					click(driver, yes_btn_D);

				}
				else
				{
					System.out.println("Not Matched || Expected value was : "+perdiem_msg+" || Actual value was : "+error_popup_msg5);
					Extent_fail(driver,  "Not Matched || Expected value was : "+perdiem_msg+" || Actual value was : "+error_popup_msg5, test,test1);
				}
				
				Step_End(7, "Ensure that System should validate as 'Do you want to Proceed with perdiem 0.0' when user clicked add button without entering Per Diem", test, test1);

				Extent_completed(tc_Name, test, test1);	
}
}

