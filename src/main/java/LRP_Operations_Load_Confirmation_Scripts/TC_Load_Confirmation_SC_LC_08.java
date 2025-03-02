package LRP_Operations_Load_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.LoadConfirmation_Locators;

public class TC_Load_Confirmation_SC_LC_08 extends Keywords {

	public void Load_Confirmation_SC_LC_08(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		
		String testcase_Name="TC_Load_Confirmation_SC_LC_08";
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
		String Booking_id= Data.get("Booking_id");
		String Confirmation_msg=Data.get("Confirmation_msg");
		String Containerized_Button=Data.get("Containerized_Button");
		String App_Date =Data.get("App_Date");
		String date_Picker =Data.get("date_Picker");
		String Plugin_Configuration = Data.get("Plugin_Configuration");
	
	
		
		
		Extent_Start(testcase_Name, test, test1);
		
		
navigateUrl(driver, url);
		
		// Login
LRP_Login(driver, Username, Password);

//			Switch the Profile
			
				SwitchProfile(driver, AgencyUser);
				
		// Module search
				Step_Start(1, " Create containerized Booking and capture the book number.", test, test1);

				moduleNavigate(driver, Plugin_Configuration);
	
	
//		Load Confirmation module
		System.out.println("********** Enter Load Confirmation module **********");
		Extent_call(test, test1,"********** Enter Load Confirmation module **********");
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
		

		
		Step_End(1, " Create containerized Booking and capture the book number.", test, test1);
		
		Step_Start(2, "select non-containerized button.", test, test1);
	
			
			String Container_click=String.format(LoadConfirmation_Locators.Containerr, Containerized_Button);
			click(driver, Container_click);
			
			
		
		Step_End(2, "select non-containerized button.", test, test1);

//	Select service
		
		Step_Start(3, "select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);
		waitForElement(driver, service_Searchfield);
		selectservice(driver, first_service_data, Vessels, Voyagenumber1, Boundinput, portCode, terminalCode);
		
		
		
		
		Step_End(3, "select the service, vessel, voyage, bound, port code, and terminal using easy search.", test, test1);

		
		
		Step_Start(4, "click show button..", test, test1);
		waitForElement(driver, bookingnumber);
		click(driver, show_Button);
		
		Step_End(4, "click show button..", test, test1);
if(date_Picker.equalsIgnoreCase("Yes")) {
			
			selectDatePickerWithTime(driver, activity_date, App_Date);
			
			}
		
		Step_Start(5, "paste the book number in the book.no column to filter your booking.", test, test1);
		
		
		
		waitForElement(driver, bookingnumber);
		sendKeys(driver, bookingnumber, Booking_id);	
		
		Step_End(5, "paste the book number in the book.no column to filter your booking.", test, test1);
		
		
		
		Step_Start(6, "click select all button and make sure all the check box of the booking is selected.", test, test1);

		
		
		waitForElement(driver, Checkbox_1);
		safeclick(driver, Checkbox_1);
		
		
	
		
		Step_End(6, "click select all button and make sure all the check box of the booking is selected.", test, test1);

		
		
		
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
		           //System.out.println("Submit button clicked");
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


