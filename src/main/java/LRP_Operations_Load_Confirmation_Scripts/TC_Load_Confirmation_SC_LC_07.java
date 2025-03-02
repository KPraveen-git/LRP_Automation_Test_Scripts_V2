package LRP_Operations_Load_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.LoadConfirmation_Locators;

public class TC_Load_Confirmation_SC_LC_07 extends Keywords{
	
public void Load_Confirmation_SC_LC_07(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		
	String testcase_Name="TC_Load_Confirmation_SC_LC_07";
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
		String Assigning = Data.get("Assigning");
		String Sheetname = Data.get("Sheetname");
		String load_confirmation_popup = Data.get("load_confirmation_popup");
		String App_Date =Data.get("App_Date");
		String date_Picker =Data.get("date_Picker");
		String File_Location = Data.get("File_Location");
		
	
	

		Extent_Start(testcase_Name, test, test1);
navigateUrl(driver, url);
		
		// Login
LRP_Login(driver, Username, Password);
//			Switch the Profile
			
				SwitchProfile(driver, agencyUser);
				
			
				
		// Module search
				Step_Start(1, " Create containerized Booking and capture the book number.", test, test1);

				moduleNavigate(driver, search_module);
			
		Step_End(1, " Create containerized Booking and capture the book number.", test, test1);
	
		
		Step_Start(2,"select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

		
//		Select service
		waitForElement(driver, load_servicecode);
		selectservice(driver, Servicecode, vesselCode, Voyagenumber1, Boundinput, portCode, terminalCode);

		
		
		
			Step_End(2,"select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

			Step_Start(3,"click show button.", test, test1);

			
			waitForElement(driver, show_Button);
			click(driver, show_Button);
			 
			if(date_Picker.equalsIgnoreCase("Yes")) {
				
				selectDatePickerWithTime(driver, activity_date, App_Date);
				
				}
		    
			
			Step_End(3,"click show button.", test, test1);

			Step_Start(4,"click assigning button.", test, test1);
			String assigning=String.format(LoadConfirmation_Locators.assigningg, Assigning);
			waitForElement(driver, assigning);
		    click(driver, assigning);
		    
		    Step_End(4,"click assigning button.", test, test1);
		    
		    Step_Start(5,"click import excel button.", test, test1);
		    
		    waitForElement(driver, importexcel);
		    click(driver, importexcel);
		    
		    Step_End(5,"click import excel button.", test, test1);
		    
		    Step_Start(6,"click select excel file button and choose the file from local folder.", test, test1);
		
		    uploadfileNew(driver, selectexcelfile,File_Location);
		 
		    
		    Step_End(6,"click select excel file button and choose the file from local folder.", test, test1);

		    Step_Start(7," click select sheet drop down and select the sheet number.", test, test1);

		    waitForElement(driver, selectsheetname);
		    click(driver, selectsheetname);
			String sheet_name=String.format(LoadConfirmation_Locators.sheet_namee, Sheetname);
		    click(driver, sheet_name);
		    
		    Step_End(7," click select sheet drop down and select the sheet number.", test, test1);

		    Step_Start(8," click load sheet button", test, test1);

		    waitForElement(driver, loadsheet);
		    click(driver, loadsheet);
		    
		    Step_End(8," click load sheet button", test, test1);
		    
		    Step_Start(9," click yes button to map the column automatically.", test, test1);
		    
		    waitForElement(driver, importexcel_yesbtn);
		   click(driver, importexcel_yesbtn);
		   
		    Step_End(9," click yes button to map the column automatically.", test, test1);

		   
		    Step_Start(10,"click upload button.", test, test1);

		    waitForElement(driver, excelupload_button);
		   click(driver,excelupload_button);
		   
		   Step_End(10,"click upload button.", test, test1);
		   
		   Step_Start(11,"click assign button", test, test1);
		   
		   waitForElement(driver, assignbutton);
		   click(driver, assignbutton);
		   
		   Step_End(11,"click assign button", test, test1);
		   
			Step_Start(12," click load confirmation button.", test, test1);
		   
		   waitForElement(driver, loadConfirmation_Button);
			click(driver, loadConfirmation_Button);
			
			Step_End(12," click load confirmation button.", test, test1);

			Step_Start(13,"system will display the message as 'load confirmed. Container(s) are automatically moved to EMS after 5 mins'.", test, test1);

			
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
			
			Step_End(13,"system will display the message as 'load confirmed. Container(s) are automatically moved to EMS after 5 mins'.", test, test1);

			Extent_completed(testcase_Name, test, test1);

}

}
