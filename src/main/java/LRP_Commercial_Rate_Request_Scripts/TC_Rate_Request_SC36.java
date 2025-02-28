package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC36  extends Keywords{

	public void rate_Request_Sc36(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){

		String testcase_Name="TC_Rate_Request_SC36";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name,
				"Dataset" + selected_dataset, File_Path);
		
		
		String username = data.get("Username");
		String pass_word =data.get("PassWord");
		String Field_Names =data.get("ModuleRateRequest");
		String Eqp_Type_Input =data.get("Eqp_Type_Input");
		String Eqp_Quantity_Input =data.get("Eqp_Quantity_Input");
		String Gross_Weight_Input =data.get("Gross_Weight_Input");
		String Exp_Det_Days_Input =data.get("Exp_Det_Days_Input");
		String Imp_Det_Days_Input =data.get("Imp_Det_Days_Input");
		String Exp_Demmurage_Input =data.get("Exp_Demmurage_Input");
		String Imp_Demmurage_Input =data.get("Imp_Demmurage_Input");
		String origin =data.get( "Origin");
		String delivery =data.get( "Delivery");
		String commodity =data.get( "Commodity");
		String samedatepopexp =data.get( "samedatepopexp");
		String From_Date_Input =data.get( "From_Date_Input");
		String ofrGreater =data.get( "OFRGreater");
		String To_Date_Input =data.get( "To_Date_Input");
		String DG_checkboxs = data.get("DG_checkboxs");
		String NOR_checkbox = data.get("NOR_checkbox");
		String SOC_checkbox = data.get("SOC_checkbox");
		String OOG_checkbox = data.get("OOG_checkbox");
		String agencyUser = data.get("Agency_user");
		String Date_Picker = data.get("Date_Picker");
		String Customer_code_Value = data.get("Customer_code_Value");
		String Customer_Code = data.get("Cust_code");
		String Condition_Value = data.get("Condition_Value");
		String On_Carriage_Radiobtn = data.get("On_Carriage_Radiobtn");
		String Pre_Carriage_Radiobtn = data.get("Pre_Carriage_Radiobtn");
		String tService=data.get("T_Service");
		String TOS=data.get("TOS_Option");
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


		Extent_Start(testcase_Name, test, test1);

		navigateUrl(driver, URL);
		//Login
		waitForElement(driver, Username_input);
		click(driver, Username_input);
		waitForElement(driver, Username_input);
		sendKeys(driver, Username_input, username);
		waitForElement(driver, APassword_input);
		click(driver, APassword_input);
		waitForElement(driver, APassword_input);
		sendKeys(driver, APassword_input, pass_word);
		waitForElement(driver, ALogin);
		click(driver, ALogin);
		if (isDisplayed(driver, home_Page)) {
			System.out.println("*****User Logged in Successfully*****");
			Extent_pass(driver, "*****User Logged in Successfully*****", test,test1);
		}else {
			System.out.println("*****User Unable to Logged in*****");
			Extent_fail(driver, "*****User Unable to Login*****", test,test1);
			
		}
		//Switch User

		waitForElement(driver, Switch_Profile);
		click(driver, Switch_Profile);
		waitForElement(driver, agency_Code_Filter);
		sendKeys(driver, agency_Code_Filter, agencyUser);

		waitForElement(driver, select_Agency);
		click(driver, select_Agency);
		waitForElement(driver, Switch_Profile_Button);
		click(driver, Switch_Profile_Button);

		waitForElement(driver, Module_SearchR);
		click(driver,Module_SearchR);
		waitForElement(driver, Module_SearchR);
		sendKeys(driver, Module_SearchR, Field_Names);
		waitForElement(driver, Rate_Request);
		click(driver, Rate_Request);
		waitForElement(driver, Rate_Request_Page);
		if(isDisplayed(driver, Rate_Request_Page)) {
			System.out.println("*****Rate Request Module is Dispalyed*****");
			Extent_pass(driver, "*****Rate Request Module is Dispalyed*****", test,test1);
		}else {
			System.out.println("*****Rate Request Module is not Dispalyed");
			Extent_fail(driver, "*****Rate Request Module is not Dispalyed*****", test,test1);
			
		}
		Step_Start(1, "Click on the new button in the toolbar", test, test1);
		waitForElement(driver, Rate_Newbutton);
		click(driver,Rate_Newbutton);
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
		StringBuilder day = new StringBuilder();
		StringBuilder month = new StringBuilder();
		StringBuilder year = new StringBuilder();
		waitForElement(driver, Dateclick);
		if (Date_Picker.equalsIgnoreCase("Yes")) {
			click(driver, Dateclick);
			datePicker(From_Date_Input, day, month, year);
			waitForElement(driver, Month_DD);
			selectByText(driver, Month_DD,month.toString());
			waitForElement(driver, Year_DD);
			selectByText(driver, Year_DD,year.toString());
			String date_select ="date_select>//a[text()='" + day+ "']";
			waitForElement(driver, date_select);
			click(driver, date_select);
		} else {
			waitForElement(driver, Dateclick);
			clearAndType(driver, Dateclick, From_Date_Input);
		}
		Step_End(3, "Select Validity From Date range accordingly in date picker ",test, test1);
		// Selecting the to Date
		Step_Start(4, "-Select Validity To Date range accordingly in date picker ",test, test1);
		waitForElement(driver, Dateclick1);
		if (Date_Picker.equalsIgnoreCase("Yes")) {
			click(driver, Dateclick1);
			datePicker(To_Date_Input, day, month, year);
			waitForElement(driver, Month_DD);
			selectByText(driver, Month_DD,month.toString());
			waitForElement(driver, Year_DD);
			selectByText(driver, Year_DD,year.toString());
			String date_select ="date_select>//a[text()='" + day+ "']";
			waitForElement(driver, date_select);
			click(driver, date_select);
		} else {
			waitForElement(driver, Dateclick1);
			clearAndType(driver, Dateclick1, To_Date_Input);
		}
		Step_Start(2, "Enter the customer name", test, test1);
		waitForElement(driver, Cust_NameInput);
		waitForElement(driver, Customer_Name_search_button);
		click(driver, Customer_Name_search_button);
		waitForElement(driver, Customer_Code_Select_dropdown);
		click(driver, Customer_Code_Select_dropdown);
		selectByText(driver, Customer_Code_Select_dropdown, Customer_Code);
		click(driver, CustomerSearch_Condition_Dropdown1);
		selectByText(driver,CustomerSearch_Condition_Dropdown1, Condition_Value);
		sendKeys(driver, CustomerSearch_InputTextfield1, Customer_code_Value);
		click(driver, CustomerSearch_Frame_SearchButton);

		waitForDisplay(driver, pop_up_exp);
		if(isDisplayed(driver,pop_up_exp )) {
			String actual_Popup = getText(driver, pop_up_exp);
			System.out.println("The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup);
			Extent_fail(driver, "The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup, test, test1);
			Assert.fail("The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup);
		}else {

			waitForElement(driver, Customer_Select);
			click(driver, Customer_Select);

			waitForElement(driver, global_select_Button);
			click(driver, global_select_Button);
			Step_End(2, "Enter the customer name", test, test1);

			waitForDisplay(driver, CustName_ExitBtn);
			if(isDisplayed(driver, CustName_ExitBtn)) {
				waitForElement(driver, CustName_ExitBtn);
				click(driver, CustName_ExitBtn);
			}
			Step_Start(3,"Enter the origin", test, test1);
			waitForElement(driver, Orgin_Input);
			sendKeys(driver, Orgin_Input, origin);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			Step_End(3, "Enter the origin", test, test1);

			Step_Start(4, "Enter the Delivery.", test, test1);
			waitForElement(driver, Delivery_Input);
			sendKeys(driver, Delivery_Input, delivery);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			System.out.println("Delivery Value:" + delivery);
			Step_End(4, "Enter the Delivery.", test, test1);
			Step_Start(5, "Enter the Commodity.", test, test1);
			waitForElement(driver, Commodity_Input);
			sendKeys(driver, Commodity_Input, commodity);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			System.out.println("Commodity Value:" + commodity);
			Step_End(5, "Enter the Commodity.", test, test1);
			Step_Start(6, ".Enter the rate calculation type.", test, test1);
			waitForElement(driver, Eqp_Type);
			click(driver, Eqp_Type);
			sendKeys(driver, Eqp_Type, Eqp_Type_Input);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			System.out.println("Eqp type:"+Eqp_Type_Input);
			Step_End(6, "Enter the rate calculation type.", test, test1);
			Step_Start(7, "Enter the Quantity.", test, test1);
			waitForElement(driver, Eqp_Quantity);
			clear(driver, Eqp_Quantity);
			click(driver, Eqp_Quantity);
			sendKeys(driver, Eqp_Quantity, Eqp_Quantity_Input);
			Step_End(7, "Enter the Quantity.", test, test1);
			Step_Start(8, "Enter the Gross Weight.", test, test1);

			waitForElement(driver, Gross_Weight);
			Newclear(driver, Gross_Weight);
			Actionsendkeys(driver, Gross_Weight, Gross_Weight_Input);

			Step_End(8, "Enter the Gross Weight.", test, test1);

			//checkboxs


			checkBox(driver, DG_checkbox, DG_checkboxs);

			checkBox(driver, oog_checkbox, OOG_checkbox);

			checkBox(driver, nor_checkbox, NOR_checkbox);

			checkBox(driver, soc_checkbox, SOC_checkbox);

			waitForElement(driver, preCarriageLocator);
			click(driver, preCarriageLocator);

			waitForElement(driver, onCarriageLocator);
			click(driver, onCarriageLocator);



			waitForElement(driver, Exp_Days);
			sendKeys(driver, Exp_Days, Exp_Det_Days_Input);

			waitForElement(driver, Imp_Days);
			sendKeys(driver, Imp_Days, Imp_Det_Days_Input);

			waitForElement(driver, Exp_Demurage);
			sendKeys(driver, Exp_Demurage, Exp_Demmurage_Input);

			waitForElement(driver, Imp_Demurage);
			sendKeys(driver, Imp_Demurage, Imp_Demmurage_Input);


			Step_Start(9, "Click routing.", test, test1);
			waitForElement(driver, Routing_Button);
			click(driver, Routing_Button);
			Step_End(9, "Click routing.", test, test1);
			Step_Start(10,"Select the routing.", test, test1);
			waitForElement(driver, select_First_Routing);
			doubleClick(driver, select_First_Routing);
			Step_End(10,"Select the routing.", test, test1);

			Step_Start(11,"Enter the OFR greater than the tariff..", test, test1);
			waitForElement(driver, OFR_Txt_Field);
			safeclick(driver, OFR_Txt_Field);
			sendKeys(driver, OFR_Txt_Field,ofrGreater );

			Step_End(11,"Enter the OFR greater than the tariff..", test, test1);
			Step_Start(12,"Click Add.", test, test1);
			waitForElement(driver, Rate_AddBtn);
			click(driver, Rate_AddBtn);


			waitForElement(driver, pop_up_exp);                                                                                                                                
			String PopUp_Msg8=getText(driver, pop_up_exp);    
			System.out.println(PopUp_Msg8);
			if(samedatepopexp.equals(PopUp_Msg8)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + samedatepopexp + " || Actual Report Activity is : " + PopUp_Msg8);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + samedatepopexp + " || Actual Report Activity is : " + PopUp_Msg8, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + samedatepopexp + " || Actual Report Activity is : " + PopUp_Msg8);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + samedatepopexp + " || Actual Report Activity is : " + PopUp_Msg8, test,test1); 
				
			} 
		}
		Extent_completed(testcase_Name, test, test1);

	}}

