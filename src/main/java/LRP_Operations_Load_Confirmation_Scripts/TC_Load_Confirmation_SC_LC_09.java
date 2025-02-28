package LRP_Operations_Load_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.LoadConfirmation_Locators;

public class TC_Load_Confirmation_SC_LC_09 extends Keywords {

	public void Load_Confirmation_SC_LC_09(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testcase_Name="TC_Load_Confirmation_SC_LC_09";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		
		
		String Username = Data.get("Username");
		String Password = Data.get("Password");
		String AgencyUser = Data.get("AgencyUser");	
		String first_service_data = Data.get("first_service_data");
		String Vessels = Data.get("Vessels");
		String Voyagenumber1 = Data.get("Voyagenumber1");
		String Boundinput = Data.get("Boundinput");
		String portCode = Data.get("portCode");
		String terminalCode = Data.get("terminalCode");
		String loadConfirmationModule = Data.get("loadConfirmationModule");
		String Confirmation_msg=Data.get("Confirmation_msg");
		String Containerized_Button=Data.get("Containerized_Button");
		String VINChassis_No= Data.get("VINChassis_No");
		String App_Date =Data.get("App_Date");
		String date_Picker =Data.get("date_Picker");
		String Plugin_Configuration = Data.get("Plugin_Configuration");
	
		
		
		
		
		
		//locator
	
		Extent_Start(testcase_Name, test, test1);
		
		
navigateUrl(driver, url);
		
		// Login
LRP_Login(driver, Username, Password);

//			Switch the Profile
			
				SwitchProfile(driver, AgencyUser);
				
			
				
		// Module search
				Step_Start(1, " Create containerized Booking and capture the book number.", test, test1);

				moduleNavigate(driver, Plugin_Configuration);
				
				
				waitForElement(driver, enable_status);
				String staus = getAttribute(driver, enable_status,"value");
				System.out.println(staus);
//				Load Confirmation module
			
			
				moduleNavigate(driver, loadConfirmationModule);
		
		waitForElement(driver, loadConfirmation_Tab);
		if(isDisplayed(driver, loadConfirmation_Tab)) {
			Extent_pass(driver, loadConfirmationModule +" tab is opened", test,test1);
			System.out.println( loadConfirmationModule +" tab is opened");
		}else {
			Extent_fail(driver, loadConfirmationModule +" tab is not opened", test,test1);
			System.out.println( loadConfirmationModule +" tab is not opened");
		}
		
		Step_End(1, " Create containerized Booking and capture the book number.", test, test1);
		
		

			
			String Container_click=String.format(LoadConfirmation_Locators.Containerr, Containerized_Button);
			click(driver, Container_click);
			
			

//	Select service
		
		Step_Start(2, "select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);
		
		waitForElement(driver, service_Searchfield);
		sendKeys(driver, service_Searchfield, first_service_data);
	
		
		waitForElement(driver, vessel_Input);
		sendKeys(driver, vessel_Input,Vessels);
		
		
		waitForElement(driver, VoyageInput);
		sendKeys(driver, VoyageInput, Voyagenumber1);
		
		
		waitForElement(driver, Boundinpiut);
		sendKeys(driver, Boundinpiut, Boundinput);
		
		
		waitForElement(driver, portCode_Inputfield);
		sendKeys(driver, portCode_Inputfield, portCode);
		
		
		waitForElement(driver, terminalCode_Inputfield);
		sendKeys(driver, terminalCode_Inputfield, terminalCode);
		
		
		waitForElement(driver, select_Service);
		doubleClick(driver, select_Service);	
		
		
		Step_End(2, "select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

		
		
		Step_Start(3, "click show button..", test, test1);
waitForElement(driver, show_Button);
		click(driver, show_Button);
		
		Step_End(3, "click show button..", test, test1);
		
		
if(date_Picker.equalsIgnoreCase("Yes")) {
			
			selectDatePickerWithTime(driver, activity_date, App_Date);
			
			}
		
		Step_Start(4, "paste the bulk VIN/chassis numbers in VIN/chassis no grid.", test, test1);
		
		waitForElement(driver, VIN_Chassis_No);
	    sendKeys(driver,VIN_Chassis_No ,VINChassis_No);
	    
	    Step_End(4, "paste the bulk VIN/chassis numbers in VIN/chassis no grid.", test, test1);
	    
	   
	    Step_Start(5, "Give Enter", test, test1);
	    
	   enter(driver);
	    
	    Step_End(5, "Give Enter", test, test1);
	    
	    
	    Step_Start(6, "Click match button.", test, test1);
	 waitForElement(driver,Match );
	  click(driver, Match);
	  
	  Step_End(6, "Click match button.", test, test1);
	  
	  
	  
	  
	 
	  
	  Step_Start(7, "click load confirmation button.", test, test1);
	  
	   waitForElement(driver,loadConfirmation_Button);
		safeclick(driver, loadConfirmation_Button);
		
		
		Step_End(7, "click load confirmation button.", test, test1);
		
		
		
		Step_Start(8, "system will display the message as \"\"load confirmed\".", test, test1);
	
		
		waitForElement(driver, Confirmation_popup);
      String SaveRate_PopUp2= getText(driver, Confirmation_popup);
      
     
      
     
		if(isDisplayed(driver, Confirmation_popup)){
			if(Confirmation_msg.equals(SaveRate_PopUp2)) {
				System.out.println("Matched || Expected value was : "+Confirmation_msg+" || Actual value was : "+SaveRate_PopUp2);
				Extent_pass(driver, "Matched || Expected value was : "+Confirmation_msg+" || Actual value was : "+SaveRate_PopUp2, test, test1);
			}
			else {
				System.out.println("NotMatched || Expected value was : "+Confirmation_msg+" || Actual value was : "+SaveRate_PopUp2);
				Extent_fail(driver,  "NotMatched || Expected value was : "+Confirmation_msg+" || Actual value was : "+SaveRate_PopUp2, test, test1);
			}
			
			waitForElement(driver, load_Cnfrm_Pop_Ok_Button);
			click(driver, load_Cnfrm_Pop_Ok_Button);
			Step_End(8, "system will display the message as \"\"load confirmed\".", test, test1);
			
			Extent_completed(testcase_Name, test, test1);
		
		}
	}
}
	 
	 