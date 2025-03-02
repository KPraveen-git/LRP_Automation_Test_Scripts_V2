package LRP_Operations_Load_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Load_Confirmation_SC_LC_03 extends Keywords{
	public void Load_Confirmation_SC_LC_03(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		
		String testcase_Name="TC_Load_Confirmation_SC_LC_03";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		String Username =Data.get("Username");
		String Password =Data.get("Password");
		String AgencyUser =Data.get("AgencyUser");
		String loadConfirmationModule =Data.get("loadConfirmationModule");
		String first_service_data =Data.get("first_service_data");
		String vesselCode =Data.get("vesselCode");
		String Voyagenumber1 =Data.get("Voyagenumber1");
		String Boundinput =Data.get("Boundinput");
		String portCode =Data.get("portCode");
		String terminalCode =Data.get("terminalCode");
		String Container_num = Data.get("Container_num");
		String loadconfimationpopupmessage = Data.get("loadconfimationpopupmessage");
		String App_Date =Data.get("App_Date");
		String date_Picker =Data.get("date_Picker");
		
		
		Extent_Start(testcase_Name, test, test1);
		navigateUrl(driver, url);
		
		// Login
		LRP_Login(driver, Username, Password);

//			Switch the Profile
			
				SwitchProfile(driver, AgencyUser);
				
			
				
		// Module search
				Step_Start(1, " Create containerized Booking and capture the book number.", test, test1);

				moduleNavigate(driver, loadConfirmationModule);
			
		
		waitForElement(driver, loadConfirmation_Tab);
		if(isDisplayed(driver, loadConfirmation_Tab)) {
			Extent_pass(driver, loadConfirmationModule +" tab is opened", test,test1);
			System.out.println( loadConfirmationModule +" tab is opened");
		}else {
			Extent_fail(driver, loadConfirmationModule +" tab is not opened", test,test1);
			System.out.println( loadConfirmationModule +" tab is not opened");
		}
		
// Search Module
		Step_End(1, "For container button need to add one method based on plugin RRO", test, test1);


		Step_Start(2, "select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);
//	Select service
		waitForElement(driver, service_Searchfield);
		selectservice(driver, first_service_data, vesselCode, Voyagenumber1, Boundinput, portCode, terminalCode);
		
		
		Step_End(2, "select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);
		
	
		Step_Start(3, " click show button.", test, test1);
		
		waitForElement(driver, show_Button);
		click(driver, show_Button);
		
		Step_End(3, "click show button.", test, test1);
if(date_Picker.equalsIgnoreCase("Yes")) {
			
			selectDatePickerWithTime(driver, activity_date, App_Date);
			
			}
		
		Step_Start(4, " paste the bulk Container numbers in container number no grid.", test, test1);

		sendKeys(driver, container_no, Container_num);
		
		Step_End(4, "paste the bulk Container numbers in container number no grid.", test, test1);
		
		Step_Start(5, " Give enter", test, test1);
		
		enter(driver);
		
		Step_End(5, "Give enter", test, test1);
		
		Step_Start(6, " Click match button.", test, test1);
		
		
		
		
		waitForElement(driver, match_button);
		click(driver, match_button);
		
		Step_End(6, " Click match button.", test, test1);
			
		Step_Start(7, " click load confirmation button.", test, test1);
		waitForElement(driver, loadConfirmation_Button);
		click(driver, loadConfirmation_Button);
		waitForElement(driver, loadconfirmationpopup);
        String SaveRate_PopUp2= getText(driver, loadconfirmationpopup);
		Step_End(7, "click load confirmation button.", test, test1);
       
		Step_Start(8, "system will display the message as \"load confirmed. Container(s) are automatically moved to EMS after 5 mins\".", test, test1);
		if(loadconfimationpopupmessage.contains(SaveRate_PopUp2)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + SaveRate_PopUp2);   
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + SaveRate_PopUp2, test, test1);
		}                                                                                                                                                                        
		else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + SaveRate_PopUp2);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + SaveRate_PopUp2, test,test1); 
		} 
		waitForElement(driver, load_Cnfrm_Pop_Ok_Button);
		click(driver, load_Cnfrm_Pop_Ok_Button);
				
				Step_End(8, "system will display the message as \"load confirmed. Container(s) are automatically moved to EMS after 5 mins\".", test, test1);
			
				Extent_completed(testcase_Name, test, test1);
	
	
	}
		
	}


