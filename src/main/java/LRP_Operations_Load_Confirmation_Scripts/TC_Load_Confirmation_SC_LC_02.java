package LRP_Operations_Load_Confirmation_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.LoadConfirmation_Locators;

public class TC_Load_Confirmation_SC_LC_02 extends Keywords{
	
public void Load_Confirmation_SC_LC_02(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		
	String testcase_Name="TC_Load_Confirmation_SC_LC_02";
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
		String Actual_Containerno_1 = Data.get("Actual_Containerno_1");
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
			
		
		
		Step_Start(2,"select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

		waitForElement(driver, load_servicecode);
		selectservice(driver, Servicecode, vesselCode, Voyagenumber1, Boundinput, portCode, terminalCode);
		
// Select service
		
			
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
		
			

			List<WebElement> Numberofcontainer = listOfElements(driver, Numberofcontainerr);
			int Numberofcontainer_size = Numberofcontainer.size();
			List<String> number = splitAndExpand(Actual_Containerno_1);
			for(int i=1; i<=Numberofcontainer_size; i++) {
				String actual_container=String.format(LoadConfirmation_Locators.actual_containerr, i);
				Step_Start(5," Double click on the actual container number field.", test, test1);

				doubleClick(driver, actual_container);
				Step_End(5," Double click on the actual container number field.", test, test1);
				Step_Start(6,"paste the actual container number in actual container number column for booking.", test, test1);
				
				Actionsendkeys(driver, actual_container, number.get(i-1));
				Step_End(6,"paste the actual container number in actual container number column for booking.", test, test1);

				}
 

			
			
			Step_Start(7,"click select all button and make sure all the check box of the booking is selected.", test, test1);

			
			click(driver, selectall);
			
			Step_End(7,"click select all button and make sure all the check box of the booking is selected.", test, test1);

			Step_Start(8,"click load confirmation button.", test, test1);

			
			waitForElement(driver, loadConfirmation_Button);
			click(driver, loadConfirmation_Button);
			
			Step_End(8,"click load confirmation button.", test, test1);

			Step_Start(9,"system will display the message as \"load confirmed. Container(s) are automatically moved to EMS after 5 mins\".", test, test1);

			
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
			Step_End(9,"system will display the message as \"load confirmed. Container(s) are automatically moved to EMS after 5 mins\".", test, test1);

			Extent_completed(testcase_Name, test, test1);
	
}

}
