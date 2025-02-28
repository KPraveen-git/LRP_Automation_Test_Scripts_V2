package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class EMS_Contract_Registration_IP003 extends Keywords {

	public void emscontractregistrationip003(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception {

		String tc_Name="EMS_Contract_Registration_IP003";

		String URL = TestNgXml.getdatafromExecution().get(tc_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, tc_Name, "Dataset" + selected_dataset,File_Path);
		
		String Username = data.get("Username");
		String Password = data.get("Password");
		String Search_input = data.get("Search_input");
		String enter_contracttype_msg = data.get("enter_contracttype_msg");
		String Contractno1 = data.get("Contractno1");
		
		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, URL);

		LRP_Login(driver, Username, Password);
		
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

		moduleNavigate(driver, Search_input);
		
		Step_End(1, "Enter module name in searchbox & click the module", test, test1);

		Step_Start(2, "Ensure that system should allow user to enter contract & contract type", test, test1);
		waitForElement(driver, Econtractno_field);
		sendKeys(driver, Econtractno_field, Contractno1);
		Step_End(2, "Ensure that system should allow user to enter contract & contract type", test, test1);

		Step_Start(3, "Ensure that system should validate as 'Enter Contract type' when user try to select Lease kind with selecting Contract type", test, test1);
		Extent_call(test, test1, "Ensure that system should validate as 'Enter Contract type' when user try to select Lease kind with selecting Contract type");
		waitForElement(driver, Eleasekind_searchicon);
		click(driver, Eleasekind_searchicon);
		waitForElement(driver, enter_contracttype_popup_D);
		String error_popup_msg2 = getText(driver, enter_contracttype_popup_D);
		if (error_popup_msg2.equals(enter_contracttype_msg)) {
			System.out.println("Matched || Expected value was : " + enter_contracttype_msg + " || Actual value was : "
					+ error_popup_msg2);
			Extent_pass(driver, "Matched || Expected value was : " + enter_contracttype_msg + " || Actual value was : "
					+ error_popup_msg2, test, test1);
		} else {
			System.out.println("Not Matched || Expected value was : " + enter_contracttype_msg+ " || Actual value was : " + error_popup_msg2);
			Extent_fail(driver, "Not Matched || Expected value was : " + enter_contracttype_msg+ " || Actual value was : " + error_popup_msg2, test, test1);
		}
		Step_End(3, "Ensure that system should validate as 'Enter Contract type' when user try to select Lease kind with selecting Contract type", test, test1);

		waitForElement(driver, close_module_D);
		click(driver, close_module_D);
		
		Extent_completed(tc_Name, test, test1);
	}

}
