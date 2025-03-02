package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC25  extends Keywords {


	public void rate_Request_Sc25(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){

		String testcase_Name="TC_Rate_Request_SC25";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name,
				"Dataset" + selected_dataset, File_Path);
		
		

		String username = data.get("Username");
		String pass_word =data.get("PassWord");
		String Field_Names =data.get("field_name");
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
		String DG_checkboxs = data.get("DG_checkboxs");
		String NOR_checkbox = data.get("NOR_checkbox");
		String SOC_checkbox = data.get("SOC_checkbox");
		String OOG_checkbox = data.get("OOG_checkbox");
		String Special_TypeEXP = data.get("Special_TypeEXP");
		String agencyUser = data.get("Agency_user");
		String To_date_perform = data.get("To_date_perform");
		String From_Date_Input = data.get("From_Date_Input");
		String To_Date_Input = data.get("To_Date_Input");
		String From_date_perform = data.get("From_date_perform");
		String Customer_code_Value = data.get("Customer_code_Value");
		String Customer_Code = data.get("Cust_code");
		String Condition_Value = data.get("Condition_Value");
		String On_Carriage_Radiobtn = data.get("On_Carriage_Radiobtn");
		String Pre_Carriage_Radiobtn = data.get("Pre_Carriage_Radiobtn");
		String Customer_code_Value2 = data.get("Customer_code_Value2");
		String Customer_code_Value3 = data.get("Customer_code_Value3");
		String Cust_code2 = data.get("Cust_code2");
		String Cust_code3 = data.get("Cust_code3");
		String tService=data.get("T_Service");
		String TOS=data.get("TOS_Option");
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 




		Extent_Start(testcase_Name, test, test1);



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

		waitForElement(driver, Dateclick);
		if (From_date_perform.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Dateclick, From_Date_Input);
		} else {
			waitForElement(driver, Dateclick);
			clearAndType(driver, Dateclick, From_Date_Input);
		}
		Step_End(3, "Select Validity From Date range accordingly in date picker ",test, test1);
		// Selecting the to Date
		Step_Start(4, "-Select Validity To Date range accordingly in date picker ",test, test1);
		// Selecting the to Date
		waitForElement(driver, Dateclick1);
		if (To_date_perform.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Dateclick1, To_Date_Input);
		} else {
			waitForElement(driver, Dateclick1);
			clearAndType(driver, Dateclick1, To_Date_Input);
		}

		
		waitForElement(driver, Customer_Name_search_button);
		click(driver, Customer_Name_search_button);
		
		
		globalValueSearchWindow1(driver, Condition_Value, Customer_Code, Customer_code_Value, Cust_code2, Customer_code_Value2,Cust_code3, Customer_code_Value3);
		
		
		
	
		waitForDisplay(driver, pop_up_exp);
		if(isDisplayed(driver,pop_up_exp )) {
			String actual_Popup = getText(driver, pop_up_exp);
			System.out.println("The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup);
			Extent_fail(driver, "The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup, test, test1);
		}else {
			waitForElement(driver, retrivedGlobalValue);
			click(driver, retrivedGlobalValue);
			waitForElement(driver, SelectButton);
			click(driver, SelectButton);

			waitForDisplay(driver, CustName_ExitBtn);
			if(isDisplayed(driver, CustName_ExitBtn)) {
				waitForElement(driver, CustName_ExitBtn);
				click(driver, CustName_ExitBtn);
			}
		Extent_call(test, test1, "Selecting container option");
		Step_Start(2, "Enter the customer name", test, test1);
		
			Step_End(2, "Enter the customer name", test, test1);

		
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
			click(driver, Eqp_Quantity);
			Newclear(driver, Eqp_Quantity);
			Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
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


			waitForDisplay(driver, Exp_Days);
			if(isdisplayed(driver, Exp_Days)&&isElementAccessible(driver, Exp_Days)) {
			clearAndType(driver, Exp_Days, Exp_Det_Days_Input);
			}
			waitForDisplay(driver, Imp_Days);
			if(isdisplayed(driver, Imp_Days)&&isElementAccessible(driver, Imp_Days)) {
				clearAndType(driver, Imp_Days, Imp_Det_Days_Input);
			}
			waitForDisplay(driver, Exp_Demurage);
			if(isdisplayed(driver, Exp_Demurage)&&isElementAccessible(driver, Exp_Demurage)) {
				clearAndType(driver, Exp_Demurage, Exp_Demmurage_Input);
			}
			waitForDisplay(driver, Imp_Demurage);
			if(isdisplayed(driver, Imp_Demurage)&&isElementAccessible(driver, Imp_Demurage)) {
				clearAndType(driver, Imp_Demurage, Imp_Demmurage_Input);
			}


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
		Extent_completed(testcase_Name, test, test1);
	}
}
