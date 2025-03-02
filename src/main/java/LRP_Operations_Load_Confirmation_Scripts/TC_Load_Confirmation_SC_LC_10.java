package LRP_Operations_Load_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Load_Confirmation_SC_LC_10 extends Keywords {
	
public void Load_Confirmation_SC_LC_10(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {

	String testcase_Name="TC_Load_Confirmation_SC_LC_10";
	String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
	String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
	String url = TestNgXml.getdatafromExecution().get(testcase_Name);
	Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
			File_Path);
	
	
		
		String Username = Data.get("Username");
		String Password = Data.get("Password");
		String search_module = Data.get("Module_Search");
		String agencyUser = Data.get("agencyUser");
		String Servicecode = Data.get("Service_code");
		String vesselCode = Data.get("vesselCode");
		String Voyagenumber1 = Data.get("Voyagenumber1");
		String Boundinput = Data.get("Boundinput");
		String portCode = Data.get("portCode");
		String terminalCode = Data.get("terminalCode");
		String filepath = Data.get("filepath");
		String load_confirmation_popup = Data.get("load_confirmation_popup");
		String App_Date =Data.get("App_Date");
		String date_Picker =Data.get("date_Picker");
	
	
		
	
		
		Extent_Start(testcase_Name, test, test1);
		navigateUrl(driver, url);
		
		// Login
		LRP_Login(driver, Username, Password);

//			Switch the Profile
			
				SwitchProfile(driver, agencyUser);
				
			
				
		// Module search
				Step_Start(1, " Create containerized Booking and capture the book number.", test, test1);

				moduleNavigate(driver, search_module);
			
		
		
	
//				Select service
	  Step_Start(1," Enter the service, vessel, voyage and terminal details.", test, test1);
		waitForElement(driver, load_servicecode);
		selectservice(driver, Servicecode, vesselCode, Voyagenumber1, Boundinput, portCode, terminalCode);
		
		

		
		
		
			 Step_End(1," Enter the service, vessel, voyage and terminal details.", test, test1);
			 Step_Start(2," Click show button.", test, test1);
			waitForElement(driver, show_Button);
			click(driver, show_Button);
			waitForElement(driver, show_Button);
			 Step_End(2," Click show button.", test, test1);
			 if(date_Picker.equalsIgnoreCase("Yes")) {
					
					selectDatePickerWithTime(driver, activity_date, App_Date);
					
					}
		    
		    Step_Start(3,"click import template button", test, test1);
		    Step_Start(4," import the file.", test, test1);
		    uploadfile(driver, import_template,filepath);
		 
		    
		    Step_End(3,"click import template button", test, test1);
		    Step_End(4," import the file.", test, test1);
		  

		 
		   
			

			Step_Start(5," if pop-up window is displayed, close it and click load confirmation button.", test, test1);

			
				
			isdisplayed(driver, close_button);
			if(isDisplayed(driver, close_button)) {
				
				click(driver, close_button);	
					
			}
			Step_End(5," if pop-up window is displayed, close it and click load confirmation button.", test, test1);

			
			
			   waitForElement(driver, loadConfirmation_Button);
				click(driver, loadConfirmation_Button);
				
				
				isDisplayed(driver, close_button);
				if(isDisplayed(driver, close_button)) {
					
					click(driver, close_button);

					   waitForElement(driver, loadConfirmation_Button);
						click(driver, loadConfirmation_Button);
						
						
				}
				

			
			Step_Start(6,"system will display the message as 'load confirmed. Container(s) are automatically moved to EMS after 5 mins'.", test, test1);

			
			String loadconfimationpopupmessage = getText(driver, loadconfirmationpopup);
			System.out.println(loadconfimationpopupmessage);
			
			if(load_confirmation_popup.contains(loadconfimationpopupmessage)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + load_confirmation_popup);   
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + load_confirmation_popup, test, test1);
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + load_confirmation_popup);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + load_confirmation_popup, test,test1); 
			} 
			waitForElement(driver, load_Cnfrm_Pop_Ok_Button);
			click(driver, load_Cnfrm_Pop_Ok_Button);
			Step_End(6,"system will display the message as 'load confirmed. Container(s) are automatically moved to EMS after 5 mins'.", test, test1);

			Extent_completed(testcase_Name, test, test1);

}


}
