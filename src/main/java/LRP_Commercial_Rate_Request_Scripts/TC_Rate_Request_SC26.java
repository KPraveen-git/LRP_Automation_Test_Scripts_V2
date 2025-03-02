package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC26  extends Keywords{


	public void rate_Request_Sc26(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){

		String testcase_Name="TC_Rate_Request_SC26";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name,
				"Dataset" + selected_dataset, File_Path);
		
		

		String username = data.get("Username");
		String pass_word =data.get("PassWord");
		String Field_Names =data.get("ModuleRateRequest");
		String agencyUser = data.get("Agency_user");
		String DG_checkboxs = data.get("DG_checkboxs");
		String NOR_checkbox = data.get("NOR_checkbox");
		String SOC_checkbox = data.get("SOC_checkbox");
		String OOG_checkbox = data.get("OOG_checkbox");
		String Special_TypepopEXP = data.get("Special_TypepopEXP");
		String Date_Picker = data.get("Date_Picker");
		String From_Date_Input = data.get("From_Date_Input");
		String To_Date_Input = data.get("To_Date_Input");
		String On_Carriage_Radiobtn = data.get("On_Carriage_Radiobtn");
		String Pre_Carriage_Radiobtn = data.get("Pre_Carriage_Radiobtn");
		String tService=data.get("T_Service");
		String TOS=data.get("TOS_Option");
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

		Extent_Start("TC_Rate_Request_SC26", test, test1);

		navigateUrl(driver, URL);
		//Login
		LRP_Login(driver, username, pass_word);
		
		//Switch User
		SwitchProfile(driver, agencyUser);
		

		//Module search
		moduleNavigate(driver, Field_Names);
		
		Step_Start(1, "Click on the new button in the toolbar", test, test1);
		waitForDisplay(driver, Rate_Newbutton);
		if(isdisplayed(driver, Rate_Newbutton)&&isElementEnabled(driver, Rate_Newbutton)) {
			waitForElement(driver, Rate_Newbutton);
			click(driver, Rate_Newbutton);
		}
		Step_End(1, "Click on the new button in the toolbar", test, test1);
		waitForElement(driver, tService_Dropdown);
		click(driver, tService_Dropdown);
		waitForElement(driver, select_t_Service);
		click(driver, select_t_Service);
		
		waitForElement(driver, TOS_Dropdown);
		click(driver, TOS_Dropdown);
		waitForElement(driver, tos);
		click(driver, tos);
		// Selecting the From Date
		waitForElement(driver, Dateclick);
		if (Date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Dateclick, From_Date_Input);
		} else {
			waitForElement(driver, Dateclick);
			clearAndType(driver, Dateclick, From_Date_Input);
		}
		
		Step_End(3, "Select Validity From Date range accordingly in date picker ",test, test1);
		Step_Start(4, "-Select Validity To Date range accordingly in date picker ",test, test1);
		waitForElement(driver, Dateclick1);
		if (Date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Dateclick1, To_Date_Input);
		} else {
			waitForElement(driver, Dateclick1);
			clearAndType(driver, Dateclick1, To_Date_Input);
		}
		
		waitForElement(driver, preCarriageLocator);
		click(driver, preCarriageLocator);

		waitForElement(driver, onCarriageLocator);
		click(driver, onCarriageLocator);


		checkBox(driver, DG_checkbox, DG_checkboxs);
		checkBox(driver, oog_checkbox, OOG_checkbox);
		checkBox(driver, nor_checkbox, NOR_checkbox);
		checkBox(driver, soc_checkbox, SOC_checkbox);
		waitForElement(driver, pop_up_exp);                                                                                                                                
		String PopUp_Msg2=getText(driver, pop_up_exp);    
		System.out.println(PopUp_Msg2);
		if(Special_TypepopEXP.equals(PopUp_Msg2)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + Special_TypepopEXP + " || Actual Report Activity is : " + PopUp_Msg2);            
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Special_TypepopEXP + " || Actual Report Activity is : " + PopUp_Msg2, test,test1);     
		}                                                                                                                                                                        
		else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Special_TypepopEXP + " || Actual Report Activity is : " + PopUp_Msg2);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Special_TypepopEXP + " || Actual Report Activity is : " + PopUp_Msg2, test,test1); 
		
		} 

		Extent_completed(testcase_Name, test, test1);
	}

}
