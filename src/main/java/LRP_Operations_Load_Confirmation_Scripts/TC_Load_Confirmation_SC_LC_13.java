package LRP_Operations_Load_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Load_Confirmation_SC_LC_13 extends Keywords {
	
	public void Load_Confirmation_SC_LC_13(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testcase_Name="TC_Load_Confirmation_SC_LC_13";
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
		String expected_Popup=Data.get("Pop_Up_Validation");
		String base_Book_no=Data.get("Base_Book_no");
		String dest_Book_no=Data.get("Dest_Book_no");
		String App_Date =Data.get("App_Date");
		String date_Picker =Data.get("date_Picker");
		
	
		
        Extent_Start(testcase_Name, test, test1);
		
		
		navigateUrl(driver, url);

		

		LRP_Login(driver, Username, Password);

	
	
		
		//	Switch the Profile
		SwitchProfile(driver, AgencyUser);
		
				
		// Module search
		Step_Start(1, " Create containerized Booking and capture the book number.", test, test1);
		moduleNavigate(driver, loadConfirmationModule);
		
			
				
				Step_End(1, " Create containerized Booking and capture the book number.", test, test1);
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

		Step_Start(3, "Clicking show button", test, test1);

		Extent_call(test, test1, "clicking show button");
		waitForElement(driver, show_Button);
		safeclick(driver, show_Button);
		Step_End(3, "Clicking show button", test, test1);
		if(date_Picker.equalsIgnoreCase("Yes")) {
			
			selectDatePickerWithTime(driver, activity_date, App_Date);
			
			}
		Step_Start(4, "paste the book number in the book.no column to filter your booking.", test, test1);
		waitForElement(driver, bookingnumber);
		sendKeys(driver, bookingnumber, base_Book_no);
		Step_End(4, "paste the book number in the book.no column to filter your booking.", test, test1);
		Step_Start(5, " Double click on the actual container number field..", test, test1);
		waitForElement(driver, base_Container_Field);
		doubleClick(driver, base_Container_Field);
		Step_End(5, " Double click on the actual container number field..", test, test1);
		Step_Start(6, " paste the actual container number in actual container number column for booking.", test, test1);
		Actionsendkeys(driver, base_Container_Field, dest_Book_no);
		Step_End(6, " paste the actual container number in actual container number column for booking.", test, test1);

	Extent_call(test, test1, "clicking on the checkbox");
	Step_Start(7, "click select all button and make sure all the check box of the booking is selected.", test, test1);
        waitForElement(driver, selectall);
        safeclick(driver, selectall);
    	Step_End(7, "click select all button and make sure all the check box of the booking is selected.", test, test1);
        Step_Start(8, "click load confirmation button", test, test1);
		safeclick(driver, loadConfirmation_Button);
		Step_End(8, "click load confirmation button", test, test1);
		Step_Start(9, "system will display the message as \"The Following Container No(s) had already planned for the Same Service, Vessel, Voyage, Bound.\"", test, test1);
		String actual_Popup = getText(driver, gettextpop);
		System.out.println(actual_Popup);
		
		
		if(expected_Popup.equals(actual_Popup)) {
			
			Extent_pass(driver, "Matched: Expected "+expected_Popup+"and actual popup|| "+actual_Popup+"are same", test, test1);
			System.out.println("Both expected and actual popup are same");
		}
		else {
			System.out.println("Both expected and actual popup are not same");
			Extent_fail(driver, "Not Matched: Expected "+expected_Popup+"and actual popup|| "+actual_Popup+"are not same", test, test1);
		
			
		}
		Step_End(9, "system will display the message as \"The Following Container No(s) had already planned for the Same Service, Vessel, Voyage, Bound.\"", test, test1);
		Extent_completed(testcase_Name, test, test1);
		

	
	}
}
