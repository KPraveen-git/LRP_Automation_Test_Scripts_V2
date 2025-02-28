package LRP_Operations_Load_Confirmation_Scripts;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Map;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

	public class TC_Load_Confirmation_SC_LC_04 extends Keywords{
				public void Load_Confirmation_SC_LC_04(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) throws Exception {
					String testcase_Name="TC_Load_Confirmation_SC_LC_04";
							String File_Path_SC04 = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name_SC04 = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			String url = TestNgXml.getdatafromExecution().get(testcase_Name);
			Map<String, String> Excel_data_SC04 = Utils.GetAllData(Sheet_Name_SC04, testcase_Name, "Dataset"+selected_dataset, File_Path_SC04);
			
			String Username =Excel_data_SC04.get("Username");
			String Password =Excel_data_SC04.get("Password");
			String AgencyUser =Excel_data_SC04.get("AgencyUser");
			String loadConfirmationModule =Excel_data_SC04.get("loadConfirmationModule");
			String first_service_data =Excel_data_SC04.get("first_service_data");
			String vesselCode =Excel_data_SC04.get("vesselCode");
			String Voyagenumber1 =Excel_data_SC04.get("Voyagenumber1");
			String Boundinput =Excel_data_SC04.get("Boundinput");
			String portCode =Excel_data_SC04.get("portCode");
			String terminalCode =Excel_data_SC04.get("terminalCode");
			String Container_num = Excel_data_SC04.get("Container_num");
			String loadconfirmationpopup_input = Excel_data_SC04.get("loadconfirmationpopup");
			String App_Date =Excel_data_SC04.get("App_Date");
			String date_Picker =Excel_data_SC04.get("date_Picker");

			
			Extent_Start(testcase_Name, test, test1);
			navigateUrl(driver, url);
			
			// Login
			LRP_Login(driver, Username, Password);

//				Switch the Profile
				
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
			
			
//		Select service
			
			waitForElement(driver, service_Searchfield);
			sendKeys(driver, service_Searchfield, first_service_data);
			
			sendKeys(driver, vessel_Input,vesselCode );
			
			sendKeys(driver, VoyageInput, Voyagenumber1);
			
			sendKeys(driver, Boundinpiut, Boundinput);
			
			sendKeys(driver, portCode_Inputfield, portCode);
			
			sendKeys(driver, terminalCode_Inputfield, terminalCode);
			
			doubleClick(driver, select_Service);
			
			waitForElement(driver, show_Button);
		    click(driver, show_Button);
			
		    
			if(date_Picker.equalsIgnoreCase("Yes")) {
				
				selectDatePickerWithTime(driver, activity_date, App_Date);
				
				}
		    
			waitForElement(driver, AssigningBtn);
			click(driver,AssigningBtn);
			String values = formatValues(Container_num);
			System.out.println(values);

			StringSelection stringSelection = new StringSelection(values);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	        
	        Actions action = new Actions(driver);
	        
	        waitForElement(driver, container_no);
			mouseOverToElement(driver, container_no);
			click(driver, container_no);
			action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
			enter(driver);
			
			waitForElement(driver, match_button);
			click(driver,match_button);
			
			
			waitForElement(driver, loadConfirmation_Button);
			click(driver, loadConfirmation_Button);
			 String SaveRate_PopUp2= getText(driver, loadconfirmationpopup);
		       
		       
				if(isDisplayed(driver, loadconfirmationpopup)){
					if(loadconfirmationpopup_input.equals(SaveRate_PopUp2)) {
						System.out.println("Matched || Expected value was : "+loadconfirmationpopup_input+" || Actual value was : "+SaveRate_PopUp2);
						Extent_pass(driver, "Matched || Expected value was : "+loadconfirmationpopup_input+" || Actual value was : "+SaveRate_PopUp2, test, test1);
					}
					else {
						System.out.println("NotMatched || Expected value was : "+loadconfirmationpopup_input+" || Actual value was : "+SaveRate_PopUp2);
						Extent_fail(driver,  "NotMatched || Expected value was : "+loadconfirmationpopup_input+" || Actual value was : "+SaveRate_PopUp2, test, test1);
					}
					waitForElement(driver, load_Cnfrm_Pop_Ok_Button);
					click(driver, load_Cnfrm_Pop_Ok_Button);
					Extent_completed(testcase_Name, test, test1);
			}
		}
	}