package LRP_Commercial_Rate_Request_Consolidation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC24toSC37 extends Keywords{


	public void Rate_Request_SC24toSC37(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){

		String testcase_Name1="TC_Rate_Request_SC24";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name1);
		String File_Path1 = TestNgXml.getfilePath_FromExecution().get(testcase_Name1);
		String Sheet_Name1 = TestNgXml.getsheetName_FromExecution().get(testcase_Name1);
		System.out.println(Sheet_Name1);

		Map<String, String> data1 = Utils.GetAllData(Sheet_Name1, testcase_Name1,
				"Dataset" + selected_dataset, File_Path1);
		
		String username = data1.get("Username");
		String pass_word =data1.get("PassWord");
		String ModuleRateRequest =data1.get("Search_module");
		String Wiyhout_Agency_login_popexp =data1.get("Wiyhout_Agency_login_popexp");

		int SC1=1;

		if(SC1==1) {

		
			Extent_Start("TC_Rate_Request_SC24toSC37", test, test1);



			Extent_Start(testcase_Name1, test, test1);


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
			if (isDisplayed(driver, P_homePage)) {
				System.out.println("*****User Logged in Successfully*****");
				Extent_pass(driver, "*****User Logged in Successfully*****", test,test1);
			}else {
				System.out.println("*****User Unable to Logged in*****");
				Extent_fail(driver, "*****User Unable to Login*****", test,test1);
				
			}
			waitForElement(driver, Module_SearchR);
			click(driver,Module_SearchR);
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, ModuleRateRequest);
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

			waitForElement(driver, Rate_Newbutton);
			click(driver,Rate_Newbutton);
			waitForElement(driver, agencypop);
			waitForElement(driver, pop_up_exp);                                                                                                                                
			String PopUp_Msg=getText(driver, pop_up_exp);    
			System.out.println(PopUp_Msg);
			if(Wiyhout_Agency_login_popexp.equals(PopUp_Msg)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + Wiyhout_Agency_login_popexp + " || Actual Report Activity is : " + PopUp_Msg);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Wiyhout_Agency_login_popexp + " || Actual Report Activity is : " + PopUp_Msg, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + Wiyhout_Agency_login_popexp + " || Actual Report Activity is : " + PopUp_Msg);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Wiyhout_Agency_login_popexp + " || Actual Report Activity is : " + PopUp_Msg, test,test1); 
				
			} 


			Extent_completed(testcase_Name1, test, test1);

			click(driver, close_Tab);	

			
		}


		int SC2=2;

		if(SC2==2) {

			String testcase_Name2="TC_Rate_Request_SC25";
			
			String File_Path2 = TestNgXml.getfilePath_FromExecution().get(testcase_Name2);
			String Sheet_Name2 = TestNgXml.getsheetName_FromExecution().get(testcase_Name2);
			System.out.println(Sheet_Name2);

			Map<String, String> data2 = Utils.GetAllData(Sheet_Name2, testcase_Name2,
					"Dataset" + selected_dataset, File_Path2);
			
			

	
			String Field_Names =data2.get("field_name");
			String Eqp_Type_Input =data2.get("Eqp_Type_Input");
			String Eqp_Quantity_Input =data2.get("Eqp_Quantity_Input");
			String Gross_Weight_Input =data2.get("Gross_Weight_Input");
			String Exp_Det_Days_Input =data2.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input =data2.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input =data2.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input =data2.get("Imp_Demmurage_Input");
			String origin =data2.get( "Origin");
			String delivery =data2.get( "Delivery");
			String commodity =data2.get( "Commodity");
			String DG_checkboxs = data2.get("DG_checkboxs");
			String NOR_checkbox = data2.get("NOR_checkbox");
			String SOC_checkbox = data2.get("SOC_checkbox");
			String OOG_checkbox = data2.get("OOG_checkbox");
			String Special_TypeEXP = data2.get("Special_TypeEXP");
			String agencyUser = data2.get("Agency_user");
			String To_date_perform = data2.get("To_date_perform");
			String From_Date_Input = data2.get("From_Date_Input");
			String To_Date_Input = data2.get("To_Date_Input");
			String From_date_perform = data2.get("From_date_perform");
			String Customer_code_Value = data2.get("Customer_code_Value");
			String Customer_Code = data2.get("Cust_code");
			String Condition_Value = data2.get("Condition_Value");
			String On_Carriage_Radiobtn = data2.get("On_Carriage_Radiobtn");
			String Pre_Carriage_Radiobtn = data2.get("Pre_Carriage_Radiobtn");
			
			String tService=data2.get("T_Service");
			String TOS=data2.get("TOS_Option");
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 




			Extent_Start(testcase_Name2, test, test1);



		
			
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
			
			waitForElement(driver, tService_Dropdown);
			click(driver, tService_Dropdown);
			waitForElement(driver, select_t_Service);
			click(driver, select_t_Service);
			
			waitForElement(driver, TOS_Dropdown);
			click(driver, TOS_Dropdown);
			waitForElement(driver, tos);
			click(driver, tos);
			Step_End(1, "Click on the new button in the toolbar", test, test1);
			// Selecting the From Date
			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();
			waitForElement(driver, Dateclick);
			if (From_date_perform.equalsIgnoreCase("Yes")) {
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
			if (To_date_perform.equalsIgnoreCase("Yes")) {
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

			Extent_call(test, test1, "Selecting container option");
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
				safeclick(driver, Auto_Panel_First);
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

				waitForElement(driver, pop_up_exp);                                                                                                                                
				String PopUp_Msg1=getText(driver, pop_up_exp);    
				System.out.println(PopUp_Msg1);
				if(Special_TypeEXP.equals(PopUp_Msg1)) {                                                                                                                  
					System.out.println("Matched || " + " Expected Report Activity is : " + Special_TypeEXP + " || Actual Report Activity is : " + PopUp_Msg1);            
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Special_TypeEXP + " || Actual Report Activity is : " + PopUp_Msg1, test,test1);     
				}                                                                                                                                                                        
				else {                                                                                                                                                                   
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Special_TypeEXP + " || Actual Report Activity is : " + PopUp_Msg1);        
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Special_TypeEXP + " || Actual Report Activity is : " + PopUp_Msg1, test,test1); 
					
				} 
			}
			Extent_completed(testcase_Name2, test, test1);
		
			click(driver, close_Tab);
	
	
		}
		int SC3=3;

		if(SC3==3) {	


			String testcase_Name3="TC_Rate_Request_SC26";
		
			String File_Path3 = TestNgXml.getfilePath_FromExecution().get(testcase_Name3);
			String Sheet_Name3 = TestNgXml.getsheetName_FromExecution().get(testcase_Name3);
			System.out.println(Sheet_Name3);

			Map<String, String> data3 = Utils.GetAllData(Sheet_Name3, testcase_Name3,
					"Dataset" + selected_dataset, File_Path3);
			
			

			String Field_Names =data3.get("ModuleRateRequest");
	
			String DG_checkboxs = data3.get("DG_checkboxs");
			String NOR_checkbox = data3.get("NOR_checkbox");
			String SOC_checkbox = data3.get("SOC_checkbox");
			String OOG_checkbox = data3.get("OOG_checkbox");
			String Special_TypepopEXP = data3.get("Special_TypepopEXP");
			String Date_Picker = data3.get("Date_Picker");
			String From_Date_Input = data3.get("From_Date_Input");
			String To_Date_Input = data3.get("To_Date_Input");
			String On_Carriage_Radiobtn = data3.get("On_Carriage_Radiobtn");
			String Pre_Carriage_Radiobtn = data3.get("Pre_Carriage_Radiobtn");
			String tService=data3.get("T_Service");
			String TOS=data3.get("TOS_Option");
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

			Extent_Start(testcase_Name3, test, test1);

		
			

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

			Extent_completed(testcase_Name3, test, test1);
			
			click(driver, close_Tab);

		

		}


		int SC4=4;

		if(SC4==4) {	


			String testcase_Name4="TC_Rate_Request_SC27";
		
			String File_Path4 = TestNgXml.getfilePath_FromExecution().get(testcase_Name4);
			String Sheet_Name4 = TestNgXml.getsheetName_FromExecution().get(testcase_Name4);
			System.out.println(Sheet_Name4);

			Map<String, String> data4 = Utils.GetAllData(Sheet_Name4, testcase_Name4,
					"Dataset" + selected_dataset, File_Path4);
			
			

			
			String Field_Names =data4.get("ModuleRateRequest");
		
			String DG_checkboxs = data4.get("DG_checkboxs");
			String NOR_checkbox = data4.get("NOR_checkbox");
			String SOC_checkbox = data4.get("SOC_checkbox");
			String OOG_checkbox = data4.get("OOG_checkbox");
			String RfertypepopEXP = data4.get("RfertypepopEXP");
			String Date_Picker = data4.get("Date_Picker");
			String From_Date_Input = data4.get("From_Date_Input");
			String To_Date_Input = data4.get("To_Date_Input");
			String On_Carriage_Radiobtn = data4.get("On_Carriage_Radiobtn");
			String Pre_Carriage_Radiobtn = data4.get("Pre_Carriage_Radiobtn");
			String tService=data4.get("T_Service");
			String TOS=data4.get("TOS_Option");
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 




			Extent_Start(testcase_Name4, test, test1);



			
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

			Step_End(1, "Click on the new button in the toolbar", test, test1);

			waitForElement(driver, preCarriageLocator);
			click(driver, preCarriageLocator);

			waitForElement(driver, onCarriageLocator);
			click(driver, onCarriageLocator);

			checkBox(driver, DG_checkbox, DG_checkboxs);

			checkBox(driver, oog_checkbox, OOG_checkbox);

			checkBox(driver, nor_checkbox, NOR_checkbox);

			checkBox(driver, soc_checkbox, SOC_checkbox);


			waitForElement(driver, pop_up_exp);                                                                                                                                
			String PopUp_Msg3=getText(driver, pop_up_exp);    
			System.out.println(PopUp_Msg3);
			if(RfertypepopEXP.equals(PopUp_Msg3)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + RfertypepopEXP + " || Actual Report Activity is : " + PopUp_Msg3);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + RfertypepopEXP + " || Actual Report Activity is : " + PopUp_Msg3, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + RfertypepopEXP + " || Actual Report Activity is : " + PopUp_Msg3);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + RfertypepopEXP + " || Actual Report Activity is : " + PopUp_Msg3, test,test1); 
				
			} 
			Extent_completed(testcase_Name4, test, test1);
			click(driver, close_Tab);
		

		}

		int SC5=5;

		if(SC5==5) {


			String testcase_Name5="TC_Rate_Request_SC28";
		
			String File_Path5 = TestNgXml.getfilePath_FromExecution().get(testcase_Name5);
			String Sheet_Name5 = TestNgXml.getsheetName_FromExecution().get(testcase_Name5);
			System.out.println(Sheet_Name5);

			Map<String, String> data5 = Utils.GetAllData(Sheet_Name5, testcase_Name5,
					"Dataset" + selected_dataset, File_Path5);
			
			
			
			String Field_Names =data5.get("ModuleRateRequest");
			String Eqp_Type_Input =data5.get("Eqp_Type_Input");
			String Eqp_Quantity_Input =data5.get("Eqp_Quantity_Input");
			String Gross_Weight_Input =data5.get("Gross_Weight_Input");
			String Exp_Det_Days_Input =data5.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input =data5.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input =data5.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input =data5.get("Imp_Demmurage_Input");
			String origin =data5.get( "Origin");
			String delivery =data5.get( "Delivery");
			String commodity =data5.get( "Commodity");
			String AddOFREXP =data5.get( "AddOFREXP");
			String DG_checkboxs = data5.get("DG_checkboxs");
			String NOR_checkbox = data5.get("NOR_checkbox");
			String SOC_checkbox = data5.get("SOC_checkbox");
			String OOG_checkbox = data5.get("OOG_checkbox");
		
			String Date_Picker = data5.get("Date_Picker");
			String From_Date_Input = data5.get("From_Date_Input");
			String To_Date_Input = data5.get("To_Date_Input");
			String Customer_code_Value = data5.get("Customer_code_Value");
			String Customer_Code = data5.get("Cust_code");
			String Condition_Value = data5.get("Condition_Value");
			String On_Carriage_Radiobtn = data5.get("On_Carriage_Radiobtn");
			String Pre_Carriage_Radiobtn = data5.get("Pre_Carriage_Radiobtn");
			String tService=data5.get("T_Service");
			String TOS=data5.get("TOS_Option");
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


			Extent_Start(testcase_Name5, test, test1);
		
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

			Step_End(1, "Click on the new button in the toolbar", test, test1);
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

				waitForElement(driver, Serchanges_Add);
				click(driver, Serchanges_Add);

				waitForElement(driver, pop_up_exp);                                                                                                                                
				String PopUp_Msg31=getText(driver, pop_up_exp);    
				System.out.println(PopUp_Msg31);
				if(AddOFREXP.equals(PopUp_Msg31)) {                                                                                                                  
					System.out.println("Matched || " + " Expected Report Activity is : " + AddOFREXP + " || Actual Report Activity is : " + PopUp_Msg31);            
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + AddOFREXP + " || Actual Report Activity is : " + PopUp_Msg31, test,test1);     
				}                                                                                                                                                                        
				else {                                                                                                                                                                   
					System.out.println("Not Matched || " + " Expected Report Activity is : " + AddOFREXP + " || Actual Report Activity is : " + PopUp_Msg31);        
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + AddOFREXP + " || Actual Report Activity is : " + PopUp_Msg31, test,test1); 
					
				} 
			}
			Extent_completed(testcase_Name5, test, test1);

			click(driver, close_Tab);

			
		}

		int SC6=6;

		if(SC6==6) {


			String testcase_Name6="TC_Rate_Request_SC29";
			
			String File_Path6 = TestNgXml.getfilePath_FromExecution().get(testcase_Name6);
			String Sheet_Name6 = TestNgXml.getsheetName_FromExecution().get(testcase_Name6);
			System.out.println(Sheet_Name6);

			Map<String, String> data6 = Utils.GetAllData(Sheet_Name6, testcase_Name6,
					"Dataset" + selected_dataset, File_Path6);
			
			
			
			String Field_Names =data6.get("ModuleRateRequest");
			String Eqp_Type_Input =data6.get("Eqp_Type_Input");
			String Eqp_Quantity_Input =data6.get("Eqp_Quantity_Input");
			String Gross_Weight_Input =data6.get("Gross_Weight_Input");
			String Exp_Det_Days_Input =data6.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input =data6.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input =data6.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input =data6.get("Imp_Demmurage_Input");
			String origin =data6.get( "Origin");
			String delivery =data6.get( "Delivery");
			String commodity =data6.get( "Commodity");
			String Date_Picker = data6.get("Date_Picker");
			String From_Date_Input = data6.get("From_Date_Input");
			String To_Date_Input = data6.get("To_Date_Input");
			String Customer_code_Value = data6.get("Customer_code_Value");
			String Customer_Code = data6.get("Cust_code");
			String Condition_Value = data6.get("Condition_Value");
			String AddOFREXP =data6.get( "AddOFREXP");
			String DG_checkboxs = data6.get("DG_checkboxs");
			String NOR_checkbox = data6.get("NOR_checkbox");
			String SOC_checkbox = data6.get("SOC_checkbox");
			String OOG_checkbox = data6.get("OOG_checkbox");
			
			String On_Carriage_Radiobtn = data6.get("On_Carriage_Radiobtn");
			String Pre_Carriage_Radiobtn = data6.get("Pre_Carriage_Radiobtn");
			String tService=data6.get("T_Service");
			String TOS=data6.get("TOS_Option");
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 



			Extent_Start(testcase_Name6, test, test1);

		
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
			Step_End(1, "Click on the new button in the toolbar", test, test1);
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

				waitForElement(driver, Serchanges_remove);
				click(driver, Serchanges_remove);
				waitForElement(driver, Serchargeremove);
				waitForElement(driver, pop_up_exp);                                                                                                                                
				String PopUp_Msg4=getText(driver, pop_up_exp);    
				System.out.println(PopUp_Msg4);
				if(AddOFREXP.equals(PopUp_Msg4)) {                                                                                                                  
					System.out.println("Matched || " + " Expected Report Activity is : " + AddOFREXP + " || Actual Report Activity is : " + PopUp_Msg4);            
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + AddOFREXP + " || Actual Report Activity is : " + PopUp_Msg4, test,test1);     
				}                                                                                                                                                                        
				else {                                                                                                                                                                   
					System.out.println("Not Matched || " + " Expected Report Activity is : " + AddOFREXP + " || Actual Report Activity is : " + PopUp_Msg4);        
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + AddOFREXP + " || Actual Report Activity is : " + PopUp_Msg4, test,test1); 
					
				} 
			}


			Extent_completed(testcase_Name6, test, test1);


				click(driver, close_Tab);

			
		}
			int SC7=7;

			if(SC7==7) {


				String testcase_Name7="TC_Rate_Request_SC30";
			
				String File_Path7 = TestNgXml.getfilePath_FromExecution().get(testcase_Name7);
				String Sheet_Name7 = TestNgXml.getsheetName_FromExecution().get(testcase_Name7);
				System.out.println(Sheet_Name7);

				Map<String, String> data7 = Utils.GetAllData(Sheet_Name7, testcase_Name7,
						"Dataset" + selected_dataset, File_Path7);
				
				
				
				String Field_Names =data7.get("ModuleRateRequest");
				String Eqp_Type_Input =data7.get("Eqp_Type_Input");
				String Eqp_Quantity_Input =data7.get("Eqp_Quantity_Input");
				String Gross_Weight_Input =data7.get("Gross_Weight_Input");
				String Exp_Det_Days_Input =data7.get("Exp_Det_Days_Input");
				String Imp_Det_Days_Input =data7.get("Imp_Det_Days_Input");
				String Exp_Demmurage_Input =data7.get("Exp_Demmurage_Input");
				String Imp_Demmurage_Input =data7.get("Imp_Demmurage_Input");
				String origin =data7.get( "Origin");
				String delivery =data7.get( "Delivery");
				String Requestpopexp =data7.get( "Requestpopexp");
				String commodity =data7.get( "Commodity");
				String DG_checkboxs = data7.get("DG_checkboxs");
				String NOR_checkbox = data7.get("NOR_checkbox");
				String SOC_checkbox = data7.get("SOC_checkbox");
				String OOG_checkbox = data7.get("OOG_checkbox");
				String Date_Picker = data7.get("Date_Picker");
				String From_Date_Input = data7.get("From_Date_Input");
				String To_Date_Input = data7.get("To_Date_Input");
				String Customer_code_Value = data7.get("Customer_code_Value");
				String Customer_Code = data7.get("Cust_code");
				String Condition_Value = data7.get("Condition_Value");
			
				String On_Carriage_Radiobtn = data7.get("On_Carriage_Radiobtn");
				String Pre_Carriage_Radiobtn = data7.get("Pre_Carriage_Radiobtn");
				String tService=data7.get("T_Service");
				String TOS=data7.get("TOS_Option");
				String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
				String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
				String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
				String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

				Extent_Start(testcase_Name7, test, test1);

				
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
				Step_End(1, "Click on the new button in the toolbar", test, test1);
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

					waitForElement(driver, Rate_AddBtn);
					click(driver, Rate_AddBtn);
					
					waitForElement(driver, pop_up_exp);                                                                                                                                
					String PopUp_Msg5=getText(driver, pop_up_exp).trim();    
					System.out.println(PopUp_Msg5);
					if(Requestpopexp.equals(PopUp_Msg5)) {                                                                                                                  
						System.out.println("Matched || " + " Expected Report Activity is : " + Requestpopexp + " || Actual Report Activity is : " + PopUp_Msg5);            
						Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Requestpopexp + " || Actual Report Activity is : " + PopUp_Msg5, test,test1);     
					}                                                                                                                                                                        
					else {                                                                                                                                                                   
						System.out.println("Not Matched || " + " Expected Report Activity is : " + Requestpopexp + " || Actual Report Activity is : " + PopUp_Msg5);        
						Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Requestpopexp + " || Actual Report Activity is : " + PopUp_Msg5, test,test1); 
						
					} 
				}
				Extent_completed(testcase_Name7, test, test1);
					click(driver, close_Tab);
				
				}

				int SC8=8;

				if(SC8==8) {

					String testcase_Name8="TC_Rate_Request_SC31";
				
					String File_Path8 = TestNgXml.getfilePath_FromExecution().get(testcase_Name8);
					String Sheet_Name8 = TestNgXml.getsheetName_FromExecution().get(testcase_Name8);
					System.out.println(Sheet_Name8);

					Map<String, String> data8 = Utils.GetAllData(Sheet_Name8, testcase_Name8,
							"Dataset" + selected_dataset, File_Path8);
					
					
					
					String Field_Names =data8.get("ModuleRateRequest");
					String Eqp_Type_Input =data8.get("Eqp_Type_Input");
					String Eqp_Quantity_Input =data8.get("Eqp_Quantity_Input");
					String Gross_Weight_Input =data8.get("Gross_Weight_Input");
					String Exp_Det_Days_Input =data8.get("Exp_Det_Days_Input");
					String Imp_Det_Days_Input =data8.get("Imp_Det_Days_Input");
					String Exp_Demmurage_Input =data8.get("Exp_Demmurage_Input");
					String Imp_Demmurage_Input =data8.get("Imp_Demmurage_Input");
					String origin =data8.get( "Origin");
					String delivery =data8.get( "Delivery");
					String commodity =data8.get( "Commodity");
					String removesurchargeexp =data8.get( "removesurchargeexp");
					String ofrGreater =data8.get( "OFRGreater");
					String DG_checkboxs = data8.get("DG_checkboxs");
					String NOR_checkbox = data8.get("NOR_checkbox");
					String SOC_checkbox = data8.get("SOC_checkbox");
					String OOG_checkbox = data8.get("OOG_checkbox");
				
					String Date_Picker = data8.get("Date_Picker");
					String From_Date_Input = data8.get("From_Date_Input");
					String To_Date_Input = data8.get("To_Date_Input");
					String Customer_code_Value = data8.get("Customer_code_Value");
					String Customer_Code = data8.get("Cust_code");
					String Condition_Value = data8.get("Condition_Value");
					String On_Carriage_Radiobtn = data8.get("On_Carriage_Radiobtn");
					String Pre_Carriage_Radiobtn = data8.get("Pre_Carriage_Radiobtn");
					String tService=data8.get("T_Service");
					String TOS=data8.get("TOS_Option");
					String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
					String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
					String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
					String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


					Extent_Start(testcase_Name8, test, test1);


					


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

						waitForElement(driver, Autorate_surchargeclick);
						click(driver, Autorate_surchargeclick);
						waitForElement(driver, Serchanges_remove);
						click(driver, Serchanges_remove);
						waitForElement(driver, Autorate_surchargeclickpopOK);
						click(driver, Autorate_surchargeclickpopOK);

						waitForElement(driver, pop_up_exp);                                                                                                                                
						String PopUp_Msg61=getText(driver, pop_up_exp);    
						System.out.println(PopUp_Msg61);
						if(PopUp_Msg61.contains(removesurchargeexp)) {                                                                                                                  
							System.out.println("Matched || " + " Expected Report Activity is : " + removesurchargeexp + " || Actual Report Activity is : " + PopUp_Msg61);            
							Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + removesurchargeexp + " || Actual Report Activity is : " + PopUp_Msg61, test,test1);     
						}                                                                                                                                                                        
						else {                                                                                                                                                                   
							System.out.println("Not Matched || " + " Expected Report Activity is : " + removesurchargeexp + " || Actual Report Activity is : " + PopUp_Msg61);        
							Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + removesurchargeexp + " || Actual Report Activity is : " + PopUp_Msg61, test,test1); 
							
						} 
						Extent_completed(testcase_Name8, test, test1);
					}
						click(driver, close_Tab);

						
					}
					

					int SC9=9;

					if(SC9==9) {


						String testcase_Name9="TC_Rate_Request_SC32";
					
						String File_Path9 = TestNgXml.getfilePath_FromExecution().get(testcase_Name9);
						String Sheet_Name9 = TestNgXml.getsheetName_FromExecution().get(testcase_Name9);
						System.out.println(Sheet_Name9);

						Map<String, String> data9 = Utils.GetAllData(Sheet_Name9, testcase_Name9,
								"Dataset" + selected_dataset, File_Path9);
						
						
					
						String Field_Names =data9.get("ModuleRateRequest");
						String Eqp_Type_Input =data9.get("Eqp_Type_Input");
						String Eqp_Quantity_Input =data9.get("Eqp_Quantity_Input");
						String Gross_Weight_Input =data9.get("Gross_Weight_Input");
						String Exp_Det_Days_Input =data9.get("Exp_Det_Days_Input");
						String Imp_Det_Days_Input =data9.get("Imp_Det_Days_Input");
						String Exp_Demmurage_Input =data9.get("Exp_Demmurage_Input");
						String Imp_Demmurage_Input =data9.get("Imp_Demmurage_Input");
						String origin =data9.get( "Origin");
						String delivery =data9.get( "Delivery");
						String commodity =data9.get( "Commodity");
						String Noscheduleexp =data9.get( "Noscheduleexp");
						String DG_checkboxs = data9.get("DG_checkboxs");
						String NOR_checkbox = data9.get("NOR_checkbox");
						String SOC_checkbox = data9.get("SOC_checkbox");
						String OOG_checkbox = data9.get("OOG_checkbox");
					
						String Date_Picker = data9.get("Date_Picker");
						String From_Date_Input = data9.get("From_Date_Input");
						String To_Date_Input = data9.get("To_Date_Input");
						String Customer_code_Value = data9.get("Customer_code_Value");
						String Customer_Code = data9.get("Cust_code");
						String Condition_Value = data9.get("Condition_Value");
						String On_Carriage_Radiobtn = data9.get("On_Carriage_Radiobtn");
						String Pre_Carriage_Radiobtn = data9.get("Pre_Carriage_Radiobtn");
						String tService=data9.get("T_Service");
						String TOS=data9.get("TOS_Option");
						String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
						String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
						String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
						String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


						Extent_Start(testcase_Name9, test, test1);

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


						Step_End(1, "Click on the new button in the toolbar", test, test1);
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

							waitForElement(driver, schedules_Button);
							click(driver, schedules_Button);
							waitForElement(driver, pop_up_exp);                                                                                                                                
							String PopUp_Msg6=getText(driver, pop_up_exp);    
							System.out.println(PopUp_Msg6);
							if(Noscheduleexp.equals(PopUp_Msg6)) {                                                                                                                  
								System.out.println("Matched || " + " Expected Report Activity is : " + Noscheduleexp + " || Actual Report Activity is : " + PopUp_Msg6);            
								Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Noscheduleexp + " || Actual Report Activity is : " + PopUp_Msg6, test,test1);     
							}                                                                                                                                                                        
							else {                                                                                                                                                                   
								System.out.println("Not Matched || " + " Expected Report Activity is : " + Noscheduleexp + " || Actual Report Activity is : " + PopUp_Msg6);        
								Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Noscheduleexp + " || Actual Report Activity is : " + PopUp_Msg6, test,test1); 
								
							} 

						}
						Extent_completed(testcase_Name9, test, test1);
							click(driver, close_Tab);

							
						}
						

						int SC10=10;

						if(SC10==10) {

							String testcase_Name10="TC_Rate_Request_SC33";
						
							String File_Path10 = TestNgXml.getfilePath_FromExecution().get(testcase_Name10);
							String Sheet_Name10 = TestNgXml.getsheetName_FromExecution().get(testcase_Name10);
							System.out.println(Sheet_Name10);

							Map<String, String> data10 = Utils.GetAllData(Sheet_Name10, testcase_Name10,
									"Dataset" + selected_dataset, File_Path10);
							
							
						
							String Field_Names =data10.get("ModuleRateRequest");
							String Eqp_Type_Input =data10.get("Eqp_Type_Input");
							String Eqp_Quantity_Input =data10.get("Eqp_Quantity_Input");
							String Gross_Weight_Input =data10.get("Gross_Weight_Input");
							String Exp_Det_Days_Input =data10.get("Exp_Det_Days_Input");
							String Imp_Det_Days_Input =data10.get("Imp_Det_Days_Input");
							String Exp_Demmurage_Input =data10.get("Exp_Demmurage_Input");
							String Imp_Demmurage_Input =data10.get("Imp_Demmurage_Input");
							String origin =data10.get( "Origin");
							String delivery =data10.get( "Delivery");
							String commodity =data10.get( "Commodity");
							String Alreaypopexp =data10.get( "Alreaypopexp");
							String ofrGreater =data10.get( "OFRGreater");
							String DG_checkboxs = data10.get("DG_checkboxs");
							String NOR_checkbox = data10.get("NOR_checkbox");
							String SOC_checkbox = data10.get("SOC_checkbox");
							String OOG_checkbox = data10.get("OOG_checkbox");
						
							String Date_Picker = data10.get("Date_Picker");
							String From_Date_Input = data10.get("From_Date_Input");
							String To_Date_Input = data10.get("To_Date_Input");
							String Customer_code_Value = data10.get("Customer_code_Value");
							String Customer_Code = data10.get("Cust_code");
							String Condition_Value = data10.get("Condition_Value");
							String On_Carriage_Radiobtn = data10.get("On_Carriage_Radiobtn");
							String Pre_Carriage_Radiobtn = data10.get("Pre_Carriage_Radiobtn");
							String tService=data10.get("T_Service");
							String TOS=data10.get("TOS_Option");
							String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
							String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
							String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
							String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


							Extent_Start(testcase_Name10, test, test1);


						

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

							Step_End(1, "Click on the new button in the toolbar", test, test1);
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

								waitForElement(driver, OFR_Txt_Field);
								safeclick(driver, OFR_Txt_Field);
								sendKeys(driver, OFR_Txt_Field,ofrGreater );

								Step_End(11,"Enter the OFR greater than the tariff..", test, test1);
								Step_Start(12,"Click Add.", test, test1);
								waitForElement(driver, Rate_AddBtn);
								click(driver, Rate_AddBtn);


							
								waitForElement(driver, pop_up_exp);                                                                                                                                
								String PopUp_Msg7=getText(driver, pop_up_exp);    
								System.out.println(PopUp_Msg7);
								if(Alreaypopexp.equals(PopUp_Msg7)) {                                                                                                                  
									System.out.println("Matched || " + " Expected Report Activity is : " + Alreaypopexp + " || Actual Report Activity is : " + PopUp_Msg7);            
									Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Alreaypopexp + " || Actual Report Activity is : " + PopUp_Msg7, test,test1);     
								}                                                                                                                                                                        
								else {                                                                                                                                                                   
									System.out.println("Not Matched || " + " Expected Report Activity is : " + Alreaypopexp + " || Actual Report Activity is : " + PopUp_Msg7);        
									Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Alreaypopexp + " || Actual Report Activity is : " + PopUp_Msg7, test,test1); 
									
								} 
							}

							Extent_completed(testcase_Name10, test, test1);
								click(driver, close_Tab);
								
							}


							int SC11=11;

							if(SC11==11) {

								String testcase_Name11="TC_Rate_Request_SC34";
							
								String File_Path11 = TestNgXml.getfilePath_FromExecution().get(testcase_Name11);
								String Sheet_Name11 = TestNgXml.getsheetName_FromExecution().get(testcase_Name11);
								System.out.println(Sheet_Name11);

								Map<String, String> data11 = Utils.GetAllData(Sheet_Name11, testcase_Name11,
										"Dataset" + selected_dataset, File_Path11);
								
								
							
								String Field_Names =data11.get("ModuleRateRequest");
								String Eqp_Type_Input =data11.get("Eqp_Type_Input");
								String Eqp_Quantity_Input =data11.get("Eqp_Quantity_Input");
								String Gross_Weight_Input =data11.get("Gross_Weight_Input");
								String Exp_Det_Days_Input =data11.get("Exp_Det_Days_Input");
								String Imp_Det_Days_Input =data11.get("Imp_Det_Days_Input");
								String Exp_Demmurage_Input =data11.get("Exp_Demmurage_Input");
								String Imp_Demmurage_Input =data11.get("Imp_Demmurage_Input");
								String origin =data11.get( "Origin");
								String delivery =data11.get( "Delivery");
								String commodity =data11.get( "Commodity");
								String samedatepopexp =data11.get( "samedatepopexp");
								String From_Date_Input =data11.get( "From_Date_Input");
								String ofrGreater =data11.get( "OFRGreater");
								String To_Date_Input =data11.get( "To_Date_Input");
								String DG_checkboxs = data11.get("DG_checkboxs");
								String NOR_checkbox = data11.get("NOR_checkbox");
								String SOC_checkbox = data11.get("SOC_checkbox");
								String OOG_checkbox = data11.get("OOG_checkbox");
							
								String Date_Picker = data11.get("Date_Picker");
								String Customer_code_Value = data11.get("Customer_code_Value");
								String Customer_Code = data11.get("Cust_code");
								String Condition_Value = data11.get("Condition_Value");
								String On_Carriage_Radiobtn = data11.get("On_Carriage_Radiobtn");
								String Pre_Carriage_Radiobtn = data11.get("Pre_Carriage_Radiobtn");
								String tService=data11.get("T_Service");
								String TOS=data11.get("TOS_Option");
								String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
								String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
								String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
								String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

								Extent_Start(testcase_Name11, test, test1);


							


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
								Extent_completed(testcase_Name11, test, test1);

									click(driver, close_Tab);
								

								}


								int SC12=12;

								if(SC12==12) {		

									String testcase_Name12="TC_Rate_Request_SC35";
								
									String File_Path12 = TestNgXml.getfilePath_FromExecution().get(testcase_Name12);
									String Sheet_Name12 = TestNgXml.getsheetName_FromExecution().get(testcase_Name12);
									System.out.println(Sheet_Name12);

									Map<String, String> data12 = Utils.GetAllData(Sheet_Name12, testcase_Name12,
											"Dataset" + selected_dataset, File_Path12);
									
									
								
									String Field_Names =data12.get("ModuleRateRequest");
									String Eqp_Type_Input =data12.get("Eqp_Type_Input");
									String Eqp_Quantity_Input =data12.get("Eqp_Quantity_Input");
									String Gross_Weight_Input =data12.get("Gross_Weight_Input");
									String Exp_Det_Days_Input =data12.get("Exp_Det_Days_Input");
									String Imp_Det_Days_Input =data12.get("Imp_Det_Days_Input");
									String Exp_Demmurage_Input =data12.get("Exp_Demmurage_Input");
									String Imp_Demmurage_Input =data12.get("Imp_Demmurage_Input");
									String origin =data12.get( "Origin");
									String delivery =data12.get( "Delivery");
									String commodity =data12.get( "Commodity");
									String samedatepopexp =data12.get( "samedatepopexp");
									String From_Date_Input =data12.get( "From_Date_Input");
									String ofrGreater =data12.get( "OFRGreater");
									String To_Date_Input =data12.get( "To_Date_Input");
									String DG_checkboxs = data12.get("DG_checkboxs");
									String NOR_checkbox = data12.get("NOR_checkbox");
									String SOC_checkbox = data12.get("SOC_checkbox");
									String OOG_checkbox = data12.get("OOG_checkbox");
								
									String Date_Picker = data12.get("Date_Picker");
									String Customer_code_Value = data12.get("Customer_code_Value");
									String Customer_Code = data12.get("Cust_code");
									String Condition_Value = data12.get("Condition_Value");
									String On_Carriage_Radiobtn = data12.get("On_Carriage_Radiobtn");
									String Pre_Carriage_Radiobtn = data12.get("Pre_Carriage_Radiobtn");
									String tService=data12.get("T_Service");
									String TOS=data12.get("TOS_Option");
									String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
									String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
									String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
									String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


									Extent_Start(testcase_Name12, test, test1);

								


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
											
										} }

									Extent_completed(testcase_Name12, test, test1);
										click(driver, close_Tab);
									
									}

									int SC13=13;

									if(SC13==13) {	

										String testcase_Name36="TC_Rate_Request_SC36";
									
										String File_Path36 = TestNgXml.getfilePath_FromExecution().get(testcase_Name36);
										String Sheet_Name36 = TestNgXml.getsheetName_FromExecution().get(testcase_Name36);
										System.out.println(Sheet_Name36);

										Map<String, String> data36 = Utils.GetAllData(Sheet_Name36, testcase_Name36,
												"Dataset" + selected_dataset, File_Path36);
										
										
										
										String Field_Names =data36.get("ModuleRateRequest");
										String Eqp_Type_Input =data36.get("Eqp_Type_Input");
										String Eqp_Quantity_Input =data36.get("Eqp_Quantity_Input");
										String Gross_Weight_Input =data36.get("Gross_Weight_Input");
										String Exp_Det_Days_Input =data36.get("Exp_Det_Days_Input");
										String Imp_Det_Days_Input =data36.get("Imp_Det_Days_Input");
										String Exp_Demmurage_Input =data36.get("Exp_Demmurage_Input");
										String Imp_Demmurage_Input =data36.get("Imp_Demmurage_Input");
										String origin =data36.get( "Origin");
										String delivery =data36.get( "Delivery");
										String commodity =data36.get( "Commodity");
										String samedatepopexp =data36.get( "samedatepopexp");
										String From_Date_Input =data36.get( "From_Date_Input");
										String ofrGreater =data36.get( "OFRGreater");
										String To_Date_Input =data36.get( "To_Date_Input");
										String DG_checkboxs = data36.get("DG_checkboxs");
										String NOR_checkbox = data36.get("NOR_checkbox");
										String SOC_checkbox = data36.get("SOC_checkbox");
										String OOG_checkbox = data36.get("OOG_checkbox");
									
										String Date_Picker = data36.get("Date_Picker");
										String Customer_code_Value = data36.get("Customer_code_Value");
										String Customer_Code = data36.get("Cust_code");
										String Condition_Value = data36.get("Condition_Value");
										String On_Carriage_Radiobtn = data36.get("On_Carriage_Radiobtn");
										String Pre_Carriage_Radiobtn = data36.get("Pre_Carriage_Radiobtn");
										String tService=data36.get("T_Service");
										String TOS=data36.get("TOS_Option");
										String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
										String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
										String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
										String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


										Extent_Start(testcase_Name36, test, test1);

									
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
										Extent_completed(testcase_Name36, test, test1);
										click(driver, close_Tab);

										
									}

									int SC14=14;

									if(SC14==14) {

										String testcase_Name14="TC_Rate_Request_SC37";
									
										String File_Path14 = TestNgXml.getfilePath_FromExecution().get(testcase_Name14);
										String Sheet_Name14 = TestNgXml.getsheetName_FromExecution().get(testcase_Name14);
										System.out.println(Sheet_Name14);

										Map<String, String> data14 = Utils.GetAllData(Sheet_Name14, testcase_Name14,
												"Dataset" + selected_dataset, File_Path14);
									
										String Field_Names =data14.get("ModuleRateRequest");
										String Eqp_Type_Input =data14.get("Eqp_Type_Input");
										String Eqp_Quantity_Input =data14.get("Eqp_Quantity_Input");
										String Gross_Weight_Input =data14.get("Gross_Weight_Input");
										String Exp_Det_Days_Input =data14.get("Exp_Det_Days_Input");
										String Imp_Det_Days_Input =data14.get("Imp_Det_Days_Input");
										String Exp_Demmurage_Input =data14.get("Exp_Demmurage_Input");
										String Imp_Demmurage_Input =data14.get("Imp_Demmurage_Input");
										String Routingpopexp =data14.get( "Routingpopexp");
										String origin =data14.get( "Origin");
										String delivery =data14.get( "Delivery");
										String commodity =data14.get( "Commodity");
										String ofrGreater =data14.get( "OFRGreater");
										String DG_checkboxs = data14.get("DG_checkboxs");
										String NOR_checkbox = data14.get("NOR_checkbox");
										String SOC_checkbox = data14.get("SOC_checkbox");
										String OOG_checkbox = data14.get("OOG_checkbox");
									
										String Date_Picker = data14.get("Date_Picker");
										String From_Date_Input =data14.get( "From_Date_Input");
										String Customer_code_Value = data14.get("Customer_code_Value");
										String To_Date_Input =data14.get( "To_Date_Input");
										String Customer_Code = data14.get("Cust_code");
										String Condition_Value = data14.get("Condition_Value");
										String On_Carriage_Radiobtn = data14.get("On_Carriage_Radiobtn");
										String Pre_Carriage_Radiobtn = data14.get("Pre_Carriage_Radiobtn");
										String tService=data14.get("T_Service");
										String TOS=data14.get("TOS_Option");
										String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
										String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
										String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
										String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

										Extent_Start(testcase_Name14, test, test1);

									

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


											Step_Start(11,"Enter the OFR greater than the tariff..", test, test1);
											waitForElement(driver, OFR_Txt_Field);
											safeclick(driver, OFR_Txt_Field);
											sendKeys(driver, OFR_Txt_Field,ofrGreater );

											Step_End(11,"Enter the OFR greater than the tariff..", test, test1);
											Step_Start(12,"Click Add.", test, test1);
											waitForElement(driver, Rate_AddBtn);
											click(driver, Rate_AddBtn);

											waitForElement(driver, pop_up_exp);                                                                                                                                
											String PopUp_Msg11=getText(driver, pop_up_exp);    
											System.out.println(PopUp_Msg11);
											if(Routingpopexp.equals(PopUp_Msg11)) {                                                                                                                  
												System.out.println("Matched || " + " Expected Report Activity is : " + Routingpopexp + " || Actual Report Activity is : " + PopUp_Msg11);            
												Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Routingpopexp + " || Actual Report Activity is : " + PopUp_Msg11, test,test1);     
											}                                                                                                                                                                        
											else {                                                                                                                                                                   
												System.out.println("Not Matched || " + " Expected Report Activity is : " + Routingpopexp + " || Actual Report Activity is : " + PopUp_Msg11);        
												Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Routingpopexp + " || Actual Report Activity is : " + PopUp_Msg11, test,test1); 
												
											}}
										Extent_completed(testcase_Name14, test, test1);
										click(driver, close_Tab);
									
										Extent_completed("TC_Rate_Request_SC24toSC37", test, test1);
									}
								} 
									}

