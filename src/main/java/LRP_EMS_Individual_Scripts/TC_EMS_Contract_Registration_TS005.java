package LRP_EMS_Individual_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EMS_Contract_Registration_TS005 extends Keywords {
	
public void Emscontractregistration05(WebDriver driver,ExtentTest test,ExtentTest test1, String selected_dataset) throws Exception {
	
	String tc_Name="TC_EMS_Contract_Registration_TS005";

	String URL = TestNgXml.getdatafromExecution().get(tc_Name);
	String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
	String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
	Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, tc_Name, "Dataset" + selected_dataset,File_Path);
		
	String Username = Excel_data.get("Username");
	String Password = Excel_data.get("Password");	
	String Search_input = Excel_data.get("Search_input");	
	String contract_no5 = Excel_data.get("contract_no5");	
	String Search_type = Excel_data.get("Search_type");	
	String search_by_con_num = Excel_data.get("search_by_con_num");	
	String Search_Type2 = Excel_data.get("Search_Type2");	
	String Search_Input2 = Excel_data.get("Search_Input2");	
	String Search_Type3 = Excel_data.get("Search_Type3");	
	String Search_Input3 = Excel_data.get("Search_Input3");	
	
	Extent_Start(tc_Name, test, test1);

	Step_Start(1, "open chrome browser ", test, test1);
	Step_Start(2, "Enter the url", test, test1);

	navigateUrl(driver, URL); 
	
	Step_End(2, "Enter the url", test, test1);
	Step_End(1, "open chrome browser ", test, test1);
	
	LRP_Login(driver, Username, Password);
	
	Step_End(4, "Enter valid password", test, test1);

	Step_Start(5, "click on login button", test, test1);
	Step_End(5, "click on login button", test, test1);
	Step_Start(6, "click on search field", test, test1);
	Step_Start(7, "Enter the EMS Contract Registration field in search box", test, test1);
	moduleNavigate(driver, Search_input);

    Step_End(7, "Enter the EMS Contract Registration field in search box", test, test1);
	Step_End(6, "click on search field", test, test1);
	
	Step_Start(8, "Click on Global Search from toolbar", test, test1);
	waitForElement(driver, search_icon);
	click(driver, search_icon);
	Step_End(8, "Click on Global Search from toolbar", test, test1);

	Step_Start(9, "Enter Contract no & click on search button", test, test1);
	Step_Start(10, "Click on retrieved data for required contract no", test, test1);
	
	globalValueSearchWindow(driver, Search_type, search_by_con_num, contract_no5, Search_Type2, Search_Input2, Search_Type3, Search_Input3);

	
//	waitForElement(driver, type_Select1);
//	safeclick(driver, type_Select1);
//	selectByText(driver, type_Select1, search_by_con_num);
//	waitForElement(driver, containsclick);
//	safeclick(driver, containsclick);
//	selectByText(driver, containsclick, Search_type);
//	waitForElement(driver, search_contractfield);
//	click(driver,search_contractfield);
//	sendKeys(driver, search_contractfield, contract_no5);
//	waitForElement(driver, search_button);
//	click(driver,search_button);
//	waitForElement(driver, Select_first_row1);
//	click(driver, Select_first_row1);
//	waitForElement(driver, search_selecticon);
//    click(driver,search_selecticon);
	Step_End(9, "Enter Contract no & click on search button", test, test1);
	Step_End(10, "Click on retrieved data for required contract no", test, test1);
	   
	Step_Start(11, "verify the same retrived data show to contract no or not", test, test1);
	waitForElement(driver, Contract_no);
	    String actual_contractnum = getAttribute(driver, Contract_no, "value");
	    if(contract_no5.equals(actual_contractnum)) {
	    	System.out.println("Matched || Expected value was : "+contract_no5+" || Actual value was : "+actual_contractnum);
	    	Extent_pass(driver, "Matched || Expected value was : "+contract_no5+" || Actual value was : "+actual_contractnum, test, test1);
	    }else {
	    	System.out.println("Not Matched || Expected value was : "+contract_no5+" || Actual value was : "+actual_contractnum);
	    	Extent_fail(driver,  "Not Matched || Expected value was : "+contract_no5+" || Actual value was : "+actual_contractnum, test, test1);	
	    }
		Step_End(11, "verify the same retrived data show to contract no or not", test, test1);
		Extent_completed(tc_Name, test, test1);

}

}
