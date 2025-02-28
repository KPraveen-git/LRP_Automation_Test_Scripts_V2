package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Rate_Request_SC24  extends Keywords{

	public void rate_Request_Sc24(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){
		String testcase_Name="TC_Rate_Request_SC24";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name,
				"Dataset" + selected_dataset, File_Path);
		
		
		String username = data.get("Username");
		String pass_word =data.get("PassWord");
		String ModuleRateRequest =data.get("Search_module");
		String Wiyhout_Agency_login_popexp =data.get("Wiyhout_Agency_login_popexp");


		Extent_Start(testcase_Name, test, test1);


		navigateUrl(driver, URL);
		//Login
		waitForElement(driver, Username_input);
		click(driver, Username_input);
		waitForElement(driver, Username_input);
		sendKeys(driver, Username_input, username);
		waitForElement(driver, APassword_input);
		click(driver, APassword_input);
		waitForElement(driver, APassword_input);
		sendKeys(driver, APassword_input, pass_word);
		waitForElement(driver, ALogin);
		click(driver, ALogin);
		if (isDisplayed(driver, P_homePage)) {
			System.out.println("*****User Logged in Successfully*****");
			Extent_pass(driver, "*****User Logged in Successfully*****", test,test1);
		}else {
			System.out.println("*****User Unable to Logged in*****");
			Extent_fail(driver, "*****User Unable to Login*****", test,test1);
			
		}
		waitForElement(driver, Module_SearchR);
		click(driver,Module_SearchR);
		waitForElement(driver, Module_SearchR);
		sendKeys(driver, Module_SearchR, ModuleRateRequest);
		waitForElement(driver, Rate_Request);
		click(driver, Rate_Request);
		waitForElement(driver, Rate_Request_Page);
		if(isDisplayed(driver, Rate_Request_Page)) {
			System.out.println("*****Rate Request Module is Dispalyed*****");
			Extent_pass(driver, "*****Rate Request Module is Dispalyed*****", test,test1);
		}else {
			System.out.println("*****Rate Request Module is not Dispalyed");
			Extent_fail(driver, "*****Rate Request Module is not Dispalyed*****", test,test1);
			
		}

		waitForElement(driver, Rate_Newbutton);
		click(driver,Rate_Newbutton);
		waitForElement(driver, agencypop);
		waitForElement(driver, pop_up_exp);                                                                                                                                
		String PopUp_Msg=getText(driver, pop_up_exp);    
		System.out.println(PopUp_Msg);
		if(Wiyhout_Agency_login_popexp.equals(PopUp_Msg)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + Wiyhout_Agency_login_popexp + " || Actual Report Activity is : " + PopUp_Msg);            
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Wiyhout_Agency_login_popexp + " || Actual Report Activity is : " + PopUp_Msg, test,test1);     
		}                                                                                                                                                                        
		else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Wiyhout_Agency_login_popexp + " || Actual Report Activity is : " + PopUp_Msg);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Wiyhout_Agency_login_popexp + " || Actual Report Activity is : " + PopUp_Msg, test,test1); 
			
		} 


		Extent_completed(testcase_Name, test, test1);
	}
}