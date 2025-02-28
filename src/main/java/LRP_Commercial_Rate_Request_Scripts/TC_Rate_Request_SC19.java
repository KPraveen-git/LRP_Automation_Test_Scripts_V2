package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC19 extends Keywords {

	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;

	public void Rate_Request_SC19(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)throws Exception {
		String testcase_Name="TC_Rate_Request_SC19";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		String user_Name = Data.get("Username");
		String pass_word = Data.get("Password");
		String Field_Names = Data.get("field_name");
		String Origin_Input = Data.get("Origin_Input");
		String Delivery_Input1 = Data.get("Dehlivery_Input");
		String commodity = Data.get("Commodity");
		String Eqp_Quantity_Input = Data.get("Eqp_Quantity_Input");
		String Eqp_Type_Input = Data.get("Eqp_Type_Input");
		String Gross_Weight_Input = Data.get("Gross_Weight_Input");
		String Exp_Det_Days_Input = Data.get("Exp_Det_Days_Input");
		String Imp_Det_Days_Input = Data.get("Imp_Det_Days_Input");
		String Exp_Demmurage_Input = Data.get("Exp_Demmurage_Input");
		String Imp_Demmurage_Input = Data.get("Imp_Demmurage_Input");
		String Req_Submit_Popup_Txt = Data.get("Req_Submit_Popup_Txt");
		String OFR_Txt_Field_Input1 = Data.get("OFR_Txt_Field_Input1");
		String Customer_Code = Data.get("Cust_code");
		String Condition_Value = Data.get("Condition_Value");
		String Customer_code_Value = Data.get("Customer_code_Value");
		String Surcharge_Code = Data.get("Surcharge_Code");
		String Rate_Req_Submitted_Popup_Txt = Data.get("Rate_Req_Submitted_Popup_Txt");
		String grid_Req_Status_Exp = Data.get("grid_Req_Status_Exp");
		String Req_Status_Exp = Data.get("Req_Status_Exp");
		String Module_SRR_Gate = Data.get("Module_SRR_Gate");
		String Non_Containerized = Data.get("Non_Containerized");
		String DG_checkboxs = Data.get("DG_checkboxs");
		String NOR_checkbox = Data.get("NOR_checkbox");
		String SOC_checkbox = Data.get("SOC_checkbox");
		String OOG_checkbox = Data.get("OOG_checkbox");
		String agencyUser = Data.get("agencyUser");
		String Routing_Service = Data.get("Routing_Service");
		Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
		On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
		String DatePicker = Data.get("DatePicker");
		String From_date = Data.get("From_date");
		String To_date = Data.get("To_date");
		String Do_You_Want_Delete = Data.get("Do_You_Want_Delete");
		tService=Data.get("T_Service");
		TOS=Data.get("TOS_Option");
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

		navigateUrl(driver, url);
		//Login
		Extent_Start(testcase_Name, test, test1);


		waitForElement(driver, Username_input);
		click(driver, Username_input);
		waitForElement(driver, Username_input);
		sendKeys(driver, Username_input, user_Name);
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
		click(driver,Switch_Profile);
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
		waitForElement(driver, Rate_Request );
		click(driver, Rate_Request );
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
		// non containerized radio btn


		if (Non_Containerized.equals("YES")) {
			waitForElement(driver, non_containradio_btn);
			safeclick(driver, non_containradio_btn);
		}


		Step_Start(2, "Enter the customer name", test, test1);

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
		}else {
		waitForElement(driver, Customer_Select);
		doubleClick(driver, Customer_Select);

		Step_End(2, "Enter the customer name", test, test1);
		waitForDisplay(driver, CustName_ExitBtn);
		if(isDisplayed(driver, CustName_ExitBtn)) {
			waitForElement(driver, CustName_ExitBtn);
			click(driver, CustName_ExitBtn);
		}
		Step_Start(3, "Enter the origin", test, test1);

		waitForElement(driver, Orgin_Input);
		sendKeys(driver, Orgin_Input, Origin_Input);

		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);

		Step_End(3, "Enter the origin", test, test1);

		Step_Start(4, "Enter the Delivery", test, test1);

		waitForElement(driver, Delivery_Input_Field);
		sendKeys(driver, Delivery_Input_Field, Delivery_Input1);
		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);

		Step_End(4, "Enter the Delivery", test, test1);

		Step_Start(5, "Enter the Commodity", test, test1);

		waitForElement(driver, Commodity_Input);
		sendKeys(driver, Commodity_Input, commodity);
		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);

		Step_End(5, "Enter the Commodity", test, test1);

		Step_Start(6, "Enter the rate calculation type", test, test1);


		waitForElement(driver, Eqp_Type);
		click(driver, Eqp_Type);
		sendKeys(driver, Eqp_Type, Eqp_Type_Input);

		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);

		Step_End(6, "Enter the rate calculation type", test, test1);

		Step_Start(7, "Enter the Quantity", test, test1);

		waitForElement(driver, Eqp_Quantity);
		clear(driver, Eqp_Quantity);
		click(driver, Eqp_Quantity);
		sendKeys(driver, Eqp_Quantity, Eqp_Quantity_Input);

		Step_End(7, "Enter the Quantity", test, test1);
		Step_Start(8, "Enter the Gross Weight", test, test1);

		waitForElement(driver, Gross_Weight);
		Newclear(driver, Gross_Weight);
		Actionsendkeys(driver, Gross_Weight, Gross_Weight_Input);

		Step_End(8, "Enter the Gross Weight", test, test1);
		// Selecting the From Date
		StringBuilder day = new StringBuilder();
		StringBuilder month = new StringBuilder();
		StringBuilder year = new StringBuilder();
		waitForElement(driver, Dateclick);
		if (DatePicker.equalsIgnoreCase("Yes")) {
			click(driver, Dateclick);
			datePicker(From_date, day, month, year);
			waitForElement(driver, Month_DD);
			selectByText(driver, Month_DD,month.toString());
			waitForElement(driver, Year_DD);
			selectByText(driver, Year_DD,year.toString());
			String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
			waitForElement(driver, date_select);
			click(driver, date_select);
		} else {
			waitForElement(driver, Dateclick);
			clearAndType(driver, Dateclick, From_date);
		}
		waitForElement(driver, Dateclick1);
		if (DatePicker.equalsIgnoreCase("Yes")) {
			click(driver, Dateclick1);
			datePicker(To_date, day, month, year);
			waitForElement(driver, Month_DD);
			selectByText(driver, Month_DD,month.toString());
			waitForElement(driver, Year_DD);
			selectByText(driver, Year_DD,year.toString());
			String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
			waitForElement(driver, date_select);
			click(driver, date_select);
		} else {
			waitForElement(driver, Dateclick1);
			clearAndType(driver, Dateclick1, To_date);
		}

		//checkboxs
		checkBox(driver, DG_checkbox, DG_checkboxs);
		checkBox(driver, oog_checkbox, OOG_checkbox);
		checkBox(driver, nor_checkbox, NOR_checkbox);
		checkBox(driver, soc_checkbox, SOC_checkbox);
		//Pre Carriage radio btn
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
		Step_Start(9, "Click routing", test, test1);
		String Before_Tarriff_No = getText(driver, Retrived_Tariff_No);
		waitForElement(driver, Routing_Button);
		click(driver, Routing_Button);
		Step_End(9, "Click routing", test, test1);
		Step_Start(10, "Select the routing", test, test1);
		waitForElement(driver, routingSearch_Frame);
		String actRoutingFrame=getText(driver, routingSearch_Frame);
		if(isDisplayed(driver, routingSearch_Frame)) {
			Extent_pass(driver, actRoutingFrame+" is displayed", test,test1);
			System.out.println(actRoutingFrame+" is displayed");
			waitForElement(driver, Routing_ToolPannel);
			safeclick(driver, Routing_ToolPannel);
			waitForElement(driver, Routing_condition_Filter);
			safeclick(driver, Routing_condition_Filter);
			waitForElement(driver, Routing_OriginTF);
			sendKeys(driver, Routing_OriginTF, Origin_Input);
			waitForElement(driver, Routing_service_TF);
			sendKeys(driver, Routing_service_TF, Routing_Service);
			waitForElement(driver, select_First_Routing);
			doubleClick(driver, select_First_Routing);
		}else {		
			System.out.println(actRoutingFrame+" is not displayed");
			Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
		}
		Step_End(10, "Select the routing", test, test1);

		Step_Start(11, "Enter the OFR greater than the tariff", test, test1);
		waitForElement(driver, OFR_Txt_Field);
		click(driver, OFR_Txt_Field);
		clear(driver, OFR_Txt_Field);
		sendKeys(driver, OFR_Txt_Field, OFR_Txt_Field_Input1);
		Step_End(11, "Enter the OFR greater than the tariff", test, test1);

		Step_Start(12, "Click Add", test, test1);
		waitForElement(driver, Rate_AddBtn);
		click(driver, Rate_AddBtn);
		Step_End(12, "Click Add", test, test1);

		waitForElement(driver, Surcharge_AddBtn);
		click(driver, Surcharge_AddBtn);
		waitForElement(driver, Surcharge_ChargeCode);
		sendKeys(driver, Surcharge_ChargeCode, Surcharge_Code);

		waitForElement(driver, Surcharge_Select);
		doubleClick(driver, Surcharge_Select);
		waitForElement(driver, SurCharge_ApplyBtn);
		click(driver, SurCharge_ApplyBtn);

		Step_Start(13, "Click Save button in the tool bar", test, test1);

		waitForElement(driver, Rate_SaveBtn);
		click(driver, Rate_SaveBtn);
		Step_End(13, "Click Save button in the tool bar", test, test1);
		waitForElement(driver, Rate_Sub_Popup_Msg);                                                                                                                                
		String popUpMsg=getText(driver, Rate_Sub_Popup_Msg);                                                                                                            
		if(Req_Submit_Popup_Txt.equals(popUpMsg)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + popUpMsg);            
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + popUpMsg, test,test1);     
		}else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + popUpMsg);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + popUpMsg, test,test1); 
		} 

		Step_Start(14, "Click submit", test, test1);
		waitForElement(driver, Rate_SubmitBtn);
		click(driver, Rate_SubmitBtn);
		Step_End(14, "Click submit", test, test1);

		Step_Start(15, "Click Ok", test, test1);
		waitForElement(driver, Yes_Btn);
		click(driver, Yes_Btn);
		Step_End(15, "Click Ok", test, test1);

		waitForElement(driver, submitted_Popup);                                                                                                                                
		String PopUpMsg1=getText(driver, submitted_Popup);      
		System.out.println("PopUp_Msg : "+PopUpMsg1);                                                                                                              
		if(Rate_Req_Submitted_Popup_Txt.equals(PopUpMsg1)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + Rate_Req_Submitted_Popup_Txt + " || Actual Report Activity is : " + PopUpMsg1);            
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Rate_Req_Submitted_Popup_Txt + " || Actual Report Activity is : " + PopUpMsg1, test,test1);     
		}else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Rate_Req_Submitted_Popup_Txt + " || Actual Report Activity is : " + PopUpMsg1);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Rate_Req_Submitted_Popup_Txt + " || Actual Report Activity is : " + PopUpMsg1, test,test1); 
		} 

		waitForElement(driver, Req_No_Txt_Field); 
		WebElement element1 = driver.findElement(By.xpath("//input[@id='REQ-REQ_txtEnquiryNo' and contains(@value,'"+Delivery_Input1+"')]"));
		String act_Req_No=getAttribute(driver, Req_No_Txt_Field, "value");                                                                                                            
		if(element1.isDisplayed()) {                                                                                                                  
			System.out.println("Matched || " + " The Generated Reference Request No is : "+act_Req_No);            
			Extent_pass(driver, "Matched || " + " The Generated Reference Request No is : "+act_Req_No, test,test1);     
		}else {                                                                                                                                                                   
			System.out.println("Not Matched || The Reference Request No is Not Generated");        
			Extent_fail(driver, "Not Matched || The Reference Request No is Not Generated", test,test1); 
		} 
		waitForElement(driver, Retrived_Tariff_No); 
		String after_Tarriff_No = getText(driver, Retrived_Tariff_No);
		if(!(Before_Tarriff_No.equals(after_Tarriff_No))) {                                                                                                                  
			System.out.println("Matched || " + " The Retrived Tariff Number is : " + after_Tarriff_No);            
			Extent_pass(driver,"Matched || " + " The Retrived Tariff Number is : " + after_Tarriff_No, test,test1);     
		}else {                                                                                                                                                                   
			System.out.println("Not Matched || The Tariff Number is Not  Retrived");        
			Extent_fail(driver, "Not Matched || The Tariff Number is Not  Retrived", test,test1); 
		} 
		waitForElement(driver, Grid_Request_Status); 
		String act_Grid_Req_Status = getText(driver, Grid_Request_Status);
		if(grid_Req_Status_Exp.equals(act_Grid_Req_Status)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + grid_Req_Status_Exp + " || Actual Report Activity is : " + act_Grid_Req_Status);            
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + grid_Req_Status_Exp + " || Actual Report Activity is : " + act_Grid_Req_Status, test,test1);     
		}else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + grid_Req_Status_Exp + " || Actual Report Activity is : " + act_Grid_Req_Status);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + grid_Req_Status_Exp + " || Actual Report Activity is : " + act_Grid_Req_Status, test,test1); 
		} 
		waitForElement(driver, Request_Status); 
		String act_ReqStatus = getAttribute(driver, Request_Status,"value");
		if(Req_Status_Exp.equals(act_ReqStatus)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + Req_Status_Exp + " || Actual Report Activity is : " + act_ReqStatus);            
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Req_Status_Exp + " || Actual Report Activity is : " + act_ReqStatus, test,test1);     
		}else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Req_Status_Exp + " || Actual Report Activity is : " + act_ReqStatus);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Req_Status_Exp + " || Actual Report Activity is : " + act_ReqStatus, test,test1); 
		} 

		if(Do_You_Want_Delete.equalsIgnoreCase("Yes")) {
			Extent_call(test, test1, "Rate request Delete Started");
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, Module_SRR_Gate);
			enter(driver);
			//SRR Gate
			waitForElement(driver, srrGate_Tab);
			if (isDisplayed(driver, srrGate_Tab)) {
				Extent_pass(driver, "SRR Gate Page is displayed", test,test1);
				System.out.println("SRR Gate Page is displayed");
			}else {
				System.out.println("SRR Gate Page is not displayed");
				Extent_fail(driver, "SRR Gate Page is not displayed", test,test1);
			}
			//Submitted	
			waitForElement(driver, SRR_Req_Type);
			click(driver, SRR_Req_Type);

			waitForElement(driver, All_Req_Type);
			click(driver, All_Req_Type);

			waitForElement(driver, SRR_Refresh_Btn);
			click(driver, SRR_Refresh_Btn);

			waitForElement(driver, submit_RadioButton);
			click(driver, submit_RadioButton);

			waitForElement(driver, menu_Icon_Grid);
			click(driver, menu_Icon_Grid);

			waitForElement(driver, filter_Icon_Grid);
			click(driver, filter_Icon_Grid);

			waitForElement(driver, filter_Inputfield);
			click(driver, filter_Inputfield);
			sendKeys(driver, filter_Inputfield, act_Req_No);
			enter(driver);
			waitForElement(driver, select_Actual_ReqNo);
			String Submitted_ReqNum=getText(driver, select_Actual_ReqNo);
			if(Submitted_ReqNum.equals(act_Req_No)) {
				System.out.println("Matched || " + " Expected Value is : " + act_Req_No + " || Actual Value is : " + Submitted_ReqNum);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + act_Req_No + " || ActualValue is : " + Submitted_ReqNum,test,test1);
				Extent_pass(driver, act_Req_No+"  is submitted", test,test1);
				System.out.println(act_Req_No+" is submitted");

				click(driver, select_Actual_ReqNo);

				RightClick(driver, select_Actual_ReqNo);
				waitForElement(driver, moveTo_Pending);
				click(driver, moveTo_Pending);
				waitForElement(driver, close_Moved_Pending_Popup);
				click(driver, close_Moved_Pending_Popup);
			}else {
				System.out.println("Not matched || " + " Expected Value is : " + act_Req_No + " || Actual Value  is : " + Submitted_ReqNum);
				System.out.println(act_Req_No+" is not submitted");
				Extent_fail(driver,"Not matched || " + " Expected Value is : " + act_Req_No + " || Actual Value is : " + Submitted_ReqNum,test,test1);
				Extent_fail(driver, act_Req_No+" Error is not displayed", test,test1);
			}		
			//Pending	
			waitForElement(driver, pending_RadioButton);
			click(driver, pending_RadioButton);

			waitForElement(driver, menu_Icon_Grid);
			click(driver, menu_Icon_Grid);

			waitForElement(driver, filter_Icon_Grid);
			click(driver, filter_Icon_Grid);

			waitForElement(driver, filter_Inputfield);
			click(driver, filter_Inputfield);
			sendKeys(driver, filter_Inputfield, act_Req_No);
			enter(driver);

			waitForElement(driver, select_Actual_ReqNo);
			String Pending_ReqNum=getText(driver, select_Actual_ReqNo);
			if(Pending_ReqNum.equals(act_Req_No)) {
				System.out.println("Matched || " + " Expected Value is : " + act_Req_No + " || Actual Value is : " + Pending_ReqNum);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + act_Req_No + " || ActualValue is : " + Pending_ReqNum,test,test1);
				Extent_pass(driver, act_Req_No+"  is Deleted", test,test1);
				System.out.println(act_Req_No+" is Deleted");
				click(driver, select_Actual_ReqNo);
				doubleClick(driver, select_Actual_ReqNo);
				waitForElement(driver, delete_Button_Toolbar);
				click(driver, delete_Button_Toolbar);
				waitForElement(driver, delete_Request_Popup);
				click(driver, delete_Request_Popup_Ok);
				waitForElement(driver, comment_Ok_Button);
				click(driver, comment_Ok_Button);
			}else {
				System.out.println("Not matched || " + " Expected Value is : " + act_Req_No + " || Actual Value  is : " + Pending_ReqNum);
				System.out.println(act_Req_No+" is not Deleted");
				Extent_fail(driver,"Not matched || " + " Expected Value is : " + act_Req_No + " || Actual Value is : " + Pending_ReqNum,test,test1);
				Extent_fail(driver, act_Req_No+" is not Deleted", test,test1);
			}	
			Extent_call(test, test1, "Rate request Delete Ended");
		}
	}
		Extent_completed(testcase_Name, test, test1);
	}
}