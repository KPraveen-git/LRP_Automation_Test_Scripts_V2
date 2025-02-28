package LRP_Operations_Load_Confirmation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Load_Confirmation_SC_LC_11 extends Keywords {


		public void Load_Confirmation_SC_LC_11(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

			String testcase_Name="TC_Load_Confirmation_SC_LC_11";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			String url = TestNgXml.getdatafromExecution().get(testcase_Name);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
			
			
			String Username = Data.get("Username");
			String Password = Data.get("Password");
			String AgencyUser = Data.get("AgencyUser");	
			String search_module = Data.get("search_module");
			String first_service_data = Data.get("first_service_data");
			String Vessels = Data.get("Vessels");
			String Voyagenumber1 = Data.get("Voyagenumber1");
			String Boundinput = Data.get("Boundinput");
			String portCode = Data.get("portCode");
			String terminalCode = Data.get("terminalCode");
			String booking_No= Data.get("Booking_No");
			String Pop_Up_Validation=Data.get("Pop_Up_Validation");
			String agencyConfiguration=Data.get("AgencyConfiguration");
			String description=Data.get("AgencyDescription");
			String App_Date =Data.get("App_Date");
			String date_Picker =Data.get("date_Picker");
			String value =Data.get("value");
			String Condition_Filter =Data.get("Condition_Filter");
			String load_confirmation_popup =Data.get("load_confirmation_popup");
			
		
			//locator
		
	        
	        String description_Select="description_Select>//td[text()='"+description+"']";
			
			
			Extent_Start(testcase_Name, test, test1);
			
			
			navigateUrl(driver, url);

			

			LRP_Login(driver, Username, Password);
		
			
			Step_Start(1," Ensure \"VGO\" configuration value is given as 2/1 in agency configuration.", test, test1);
			
			// Agency Configuration
					Extent_cal(test, test1, "Agency Configuration");

					moduleNavigate(driver, agencyConfiguration);
					waitForElement(driver, agencyConfiguration_Tab);
					if(isDisplayed(driver, agencyConfiguration_Tab)) {
						Extent_pass(driver, agencyConfiguration +" tab is opened",test,test1);
						System.out.println( agencyConfiguration +" tab is opened");
					}else {
						Extent_fail(driver, agencyConfiguration +" tab is not opened", test,test1);
						System.out.println( agencyConfiguration +" tab is not opened");
					}
					
					
					waitForElement(driver, agencyConfig_newButton);
					click(driver, agencyConfig_newButton);
					
					waitForElement(driver, agencyConfig_Popup);
					if(isDisplayed(driver, agencyConfig_Popup)) {
					String agcPopup=getText(driver, agencyConfig_Popup);
					Extent_pass(driver, agcPopup+" popup is displayed", test, test1);
					System.out.println(agcPopup+" popup is displayed");
					waitForElement(driver, agencyConfig_Popup_Yes);
					click(driver, agencyConfig_Popup_Yes);		
					}
					
					waitForElement(driver, agencySearch_Button);
					click(driver, agencySearch_Button);
					
					waitForElement(driver, agencyCode_Filter);
					
					selectValue1(driver, Condition_Filter, AgencyUser);
					waitForElement(driver, agencyConfig_Show_Button);
					click(driver, agencyConfig_Show_Button);
					
					waitForElement(driver, description_Grid_Filter);
					click(driver, description_Grid_Filter);
					sendKeys(driver, description_Grid_Filter, description);
					
					waitForElement(driver, description_Select);
					click(driver, description_Select);
					
					waitForElement(driver, value_Textfield);
					clearAndType(driver, value_Textfield, value);
					Step_Start(1, "Setting the value ", test, test1);
					
				
					
					

					waitForElement(driver, plus_Button);
					click(driver, plus_Button);
					waitForElement(driver, popup_Message_Ok_Button);
					click(driver, popup_Message_Ok_Button);
					waitForElement(driver, description_Grid_Filter);
					click(driver, description_Grid_Filter);
					sendKeys(driver, description_Grid_Filter, description);
					
					waitForElement(driver, description_Select);
					click(driver, description_Select);
					waitForElement(driver, value_Textfield);
					String value1=getAttribute(driver, value_Textfield,"value");
					System.out.println(value1);
					Extent_pass(driver,"*****value was shown as*****"+ value1, test, test1);
					
					
					
						if(value.equals(value1)) {
							System.out.println("test data value and application value are same");
							Extent_pass(driver, "test data value and application value are same", test, test1);
						}else {
							
							System.out.println("test data value and application value are not same");
							extent_fail(driver, "test data value and application value are not same", test, test1);
						}
					
					
					
					
					
					
					
					
					Step_End(1," Ensure \"VGO\" configuration value is given as 2/1 in agency configuration.", test, test1);
					
					click(driver, close_Tab);
					
					
////				Switch the Profile
					
					SwitchProfile(driver, AgencyUser);
					
					

			

//			Load Confirmation module
		
			
					moduleNavigate(driver, search_module);
			
		
	
			
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
	
			Step_Start(3, "click show button.", test, test1);
			
			waitForElement(driver, show_Button);
			click(driver, show_Button);
			Step_End(3, "click show button.", test, test1);
			if(date_Picker.equalsIgnoreCase("Yes")) {
				
				selectDatePickerWithTime(driver, activity_date, App_Date);
				
				}
			Step_Start(4, "paste the book number in the book.no column to filter your booking.", test, test1);
			
			waitForElement(driver, bookingnumber);
			sendKeys(driver, bookingnumber, booking_No);
			Step_End(4, "paste the book number in the book.no column to filter your booking.", test, test1);
			Step_Start(5, "click select all button and make sure all the check box of the booking is selected.", test, test1);
			waitForElement(driver, select_All_Btn);
			click(driver, select_All_Btn);
			Step_End(5, "click select all button and make sure all the check box of the booking is selected.", test, test1);
			

			Step_Start(6, "click load confirmation button.", test, test1);
	waitForElement(driver, loadConfirmation_Button);
			click(driver, loadConfirmation_Button);
			Step_End(6, "click load confirmation button.", test, test1);
			
			
			//getting the text from the popup
			if(value.equals("1")) {
				Step_Start(7," For configuration value 1, system will display the warning message \"VGM Not verified for below container(s).Could not proceed for Load confirmation\", close the message window and click load confirmation..", test, test1);
				waitForElement(driver, load_close);
				click(driver, load_close);
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
				Step_End(7," For configuration value 1, system will display the warning message \"VGM Not verified for below container(s).Could not proceed for Load confirmation\", close the message window and click load confirmation..", test, test1);
				}
		
		
			
			if(value.equals("2")) {
				Step_Start(8," For configuration value 2, system will display the warning message \"VGM Not verified for below container(s).Could not proceed for Load confirmation\", close the message window and click load confirmation..", test, test1);
isDisplayed(driver, error_validation);

			String loadconfimationpopupmessage = getText(driver, error_validation);
			System.out.println(loadconfimationpopupmessage);
			
	
			//comparing the expected and actual popup,
			if(loadconfimationpopupmessage.equals(Pop_Up_Validation)) {
				Extent_pass(driver,loadconfimationpopupmessage +"Popup is displayed", test, test1);
				Extent_pass(driver, "Matched || Expected popup: "+Pop_Up_Validation + "Actual ||"+loadconfimationpopupmessage, test, test1);
				System.out.println("both are equal,testcase pass");
			}
			else {
				System.out.println(Pop_Up_Validation+"popup was done came as expected" );
				Extent_fail(driver, "Matched || Expected popup: "+Pop_Up_Validation + "Actual ||"+loadconfimationpopupmessage, test, test1);
				
			}
			Step_End(8," For configuration value 2, system will display the warning message \"VGM Not verified for below container(s).Could not proceed for Load confirmation\", close the message window and click load confirmation..", test, test1);
			waitForElement(driver, ID_Ok_Button);
			click(driver, ID_Ok_Button);
		
			}
			Extent_completed(testcase_Name, test, test1);
		
		
		
}}