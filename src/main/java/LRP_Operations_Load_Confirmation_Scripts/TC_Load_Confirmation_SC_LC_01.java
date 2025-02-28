
package LRP_Operations_Load_Confirmation_Scripts;

import java.util.Map;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;


public class TC_Load_Confirmation_SC_LC_01 extends Keywords{

	public void Load_Confirmation_SC_LC_01(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		
		String testcase_Name="TC_Load_Confirmation_SC_LC_01";
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
		String Bookingnumber = Data.get("Bookingnumber");
		String load_confirmation_popup = Data.get("load_confirmation_popup");
		String App_Date =Data.get("App_Date");
		String date_Picker =Data.get("date_Picker");
		
		Extent_Start(testcase_Name, test, test1);
		navigateUrl(driver, url);
		
// Login
		
		

		LRP_Login(driver, Username, Password);



//	Switch the Profile
	
		SwitchProfile(driver, agencyUser);
		
	
		
// Module search
		Step_Start(1, " Create containerized Booking and capture the book number.", test, test1);

		moduleNavigate(driver, search_module);

		
		
	
		Step_Start(2,"select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

		waitForElement(driver, load_servicecode);
		sendKeys(driver, load_servicecode,Servicecode );
		
////	Select service
		
			waitForElement(driver, vessel_Input);
			sendKeys(driver, vessel_Input,vesselCode );
		
			
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
		
			Step_End(2,"select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

			Step_Start(3,"click show button.", test, test1);

			
			waitForElement(driver, show_Button);
			click(driver, show_Button);
			
			Step_End(3,"click show button.", test, test1);

			
		if(date_Picker.equalsIgnoreCase("Yes")) {
			
			selectDatePickerWithTime(driver, activity_date, App_Date);
			
			}
				
			Step_Start(4,"paste the captured book number in the book.no column to filter your booking.", test, test1);

			
			waitForElement(driver, bookingnumber);

			click(driver, bookingnumber);
			sendKeys(driver, bookingnumber, Bookingnumber);
			
			Step_End(4,"paste the captured book number in the book.no column to filter your booking.", test, test1);
			
			Step_End(1, " Create containerized Booking and capture the book number.", test, test1);
			Step_Start(5,"click select all button and make sure all the check box of the booking is selected.", test, test1);
			waitForElement(driver, selectall);
			click(driver, selectall);
			
			Step_End(5,"click select all button and make sure all the check box of the booking is selected.", test, test1);

			Step_Start(6,"click load confirmation button.", test, test1);

			
			waitForElement(driver, loadConfirmation_Button);
			click(driver, loadConfirmation_Button);
			
			Step_End(6,"click load confirmation button.", test, test1);

			Step_Start(7,"system will display the message as load confirmed. Container(s) are automatically moved to EMS after 5 mins", test, test1);

			
			String loadconfimationpopupmessage = getText(driver, loadconfirmationpopup);
			System.out.println(loadconfimationpopupmessage);
			
			if(load_confirmation_popup.contains(loadconfimationpopupmessage)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + load_confirmation_popup);   
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + load_confirmation_popup, test, test1);
			Extent_call(test, test1, loadconfimationpopupmessage);
			
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + load_confirmation_popup);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + loadconfimationpopupmessage + " || Actual Report Activity is : " + load_confirmation_popup, test,test1); 
			} 
			
			waitForElement(driver, load_Cnfrm_Pop_Ok_Button);
			click(driver, load_Cnfrm_Pop_Ok_Button);
			Step_End(7,"system will display the message as load confirmed. Container(s) are automatically moved to EMS after 5 mins", test, test1);

			Extent_completed(testcase_Name, test, test1);

	}
	

	
}
