package LRP_Commercial_Rate_Request_Consolidation_Scripts;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC19to23  extends Keywords{
	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public void Rate_Request_SC19to23(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){
		String testcase_Name19="TC_Rate_Request_SC19";

		String File_Path19 = TestNgXml.getfilePath_FromExecution().get(testcase_Name19);
		String Sheet_Name19 = TestNgXml.getsheetName_FromExecution().get(testcase_Name19);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name19);
		Map<String, String> Data19 = Utils.GetAllData(Sheet_Name19, testcase_Name19,"Dataset" + selected_dataset, File_Path19);

		String username = Data19.get("Username");
		String password = Data19.get("Password");
		String agencyUser = Data19.get("agencyUser");

		navigateUrl(driver, url);
		//Login
		waitForElement(driver, Username_input);
		click(driver, Username_input);
		waitForElement(driver, Username_input);
		sendKeys(driver, Username_input, username);
		waitForElement(driver, APassword_input);
		click(driver, APassword_input);
		waitForElement(driver, APassword_input);
		sendKeys(driver, APassword_input, password);
		waitForElement(driver, ALogin);
		click(driver, ALogin);
		
		waitForElement(driver, home_Page);
		if (isDisplayed(driver, home_Page)) {
			System.out.println("User Logged in Successfully");
			Extent_pass(driver, "User Logged in Successfully", test,test1);
		}else {
			System.out.println("User Unable to Logged in");
			Extent_fail(driver, "User Unable to Logged in", test,test1);
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
		
	boolean sc19=true;
		if(sc19==true) {
			
			String Field_Names = Data19.get("field_name");
			String Origin_Input = Data19.get("Origin_Input");
			String Delivery_Input1 = Data19.get("Dehlivery_Input");
			String commodity = Data19.get("Commodity");
			String Eqp_Type_Input = Data19.get("Eqp_Type_Input");
			String Gross_Weight_Input = Data19.get("Gross_Weight_Input");
			String Exp_Det_Days_Input = Data19.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input = Data19.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input = Data19.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input = Data19.get("Imp_Demmurage_Input");
			String Req_Submit_Popup_Txt = Data19.get("Req_Submit_Popup_Txt");
			String OFR_Txt_Field_Input1 = Data19.get("OFR_Txt_Field_Input1");
			String Customer_Code = Data19.get("Cust_code");
			String Condition_Value = Data19.get("Condition_Value");
			String Customer_code_Value = Data19.get("Customer_code_Value");
			String Surcharge_Code = Data19.get("Surcharge_Code");
			String Rate_Req_Submitted_Popup_Txt = Data19.get("Rate_Req_Submitted_Popup_Txt");
			String grid_Req_Status_Exp = Data19.get("grid_Req_Status_Exp");
			String Req_Status_Exp = Data19.get("Req_Status_Exp");
			String Module_SRR_Gate = Data19.get("Module_SRR_Gate");
			String Non_Containerized = Data19.get("Non_Containerized");
			String DG_checkboxs = Data19.get("DG_checkboxs");
			String NOR_checkbox = Data19.get("NOR_checkbox");
			String SOC_checkbox = Data19.get("SOC_checkbox");
			String OOG_checkbox = Data19.get("OOG_checkbox");
			String Routing_Service = Data19.get("Routing_Service");
			String Pre_Carriage_Radiobtn = Data19.get("pre_Carriage_Radiobtn");
			String On_Carriage_Radiobtn = Data19.get("On_Carriage_Radiobtn");
			String DatePicker = Data19.get("DatePicker");
			String From_date = Data19.get("From_date");
			String To_date = Data19.get("To_date");
			String Do_You_Want_Delete = Data19.get("Do_You_Want_Delete");
			String tService=Data19.get("T_Service");
			String TOS=Data19.get("TOS_Option");
			String Eqp_Quantity_Input=Data19.get("Eqp_Quantity_Input");

			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

			Extent_Start(testcase_Name19, test, test1);


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
			clearAndType(driver, Eqp_Quantity,"1");

			clearAndType(driver, Eqp_Quantity, Eqp_Quantity_Input);

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
					Extent_fail(driver, "SRR Gate Page is not displayed", test,test1);
					System.out.println("SRR Gate Page is not displayed");
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
			waitForElement(driver, srrGate_Tab);
			click(driver, srrGate_Tab);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			Extent_completed("TC_Rate_Request_SC19", test, test1);

		}
		boolean sc20=true;
		if(sc20==true) {

			String testCaseName="TC_Rate_Request_SC20";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name, testCaseName,"Dataset" + selected_dataset, File_Path);

			String Field_Names = Data.get("field_name");
			String Origin_Input = Data.get("Origin_Input");
			String Delivery_Input1 = Data.get("Dehlivery_Input");
			String commodity = Data.get("Commodity");
			String Eqp_Type_Input = Data.get("Eqp_Type_Input");
			String Gross_Weight_Input = Data.get("Gross_Weight_Input");
			String Exp_Det_Days_Input = Data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input = Data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input = Data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input = Data.get("Imp_Demmurage_Input");
			String ofrGreater = Data.get("OFRGreater");
			String agencyLOC = Data.get("AgencyLOC");
			String wantToSavePopup = Data.get("WantToSavePopup");
			String wantToProceedPopup = Data.get("WantToProceedPopup");
			String submittedPopup = Data.get("SubmittedPopup");
			String gridRequestStatus = Data.get("GridRequestStatus");
			String requestStatus = Data.get("RequestStatus");
			String moduleSRRGate = Data.get("ModuleSRRGate");
			String Non_Containerized = Data.get("Non_Containerized");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String Customer_Code = Data.get("Cust_code");
			String Condition_Value = Data.get("Condition_Value");
			String Customer_code_Value = Data.get("Customer_code_Value");
			String Routing_Service = Data.get("Routing_Service");
			String eqp_Quantity_Input = Data.get("Eqp_Quantity_Input");

			String DatePicker = Data.get("DatePicker");
			String From_date = Data.get("From_date");
			String To_date = Data.get("To_date");
			String Do_You_Want_Delete = Data.get("Do_You_Want_Delete");
			String service =Data.get( "Service");

			String tService=Data.get("T_Service");
			String TOS=Data.get("TOS_Option");
			String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			String On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			

			Extent_Start(testCaseName, test, test1);

			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
			

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
				System.out.println("The Customer Code is Invalid The Actual Popup value was : "+actual_Popup);
				Extent_fail(driver, "The Customer Code is Invalid The Actual Popup value was : "+actual_Popup, test, test1);
				Assert.fail("The Customer Code is Invalid The Actual Popup value was : "+actual_Popup);
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
				clearAndType(driver, Eqp_Quantity,eqp_Quantity_Input);


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
					String dateSelect =String.format(date_select, day);
					waitForElement(driver, dateSelect);
					click(driver, dateSelect);
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
					String dateSelect =String.format(date_select, day);
					waitForElement(driver, dateSelect);
					click(driver, dateSelect);
				} else {
					waitForElement(driver, Dateclick1);
					clearAndType(driver, Dateclick1, To_date);
				}

				
				click(driver, service_Textfield);
				clearAndType(driver, service_Textfield, service);
				
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
				sendKeys(driver, OFR_Txt_Field, ofrGreater);


				Step_End(11, "Enter the OFR greater than the tariff", test, test1);

				Step_Start(12, "Click Add", test, test1);

				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);

				Step_End(12, "Click Add", test, test1);


				waitForElement(driver, Surcharge_Edit);
				click(driver, Surcharge_Edit);
				Newclear_Type(driver);
				waitForElement(driver, Surcharge_Edit);
				Actionsendkeys(driver, Surcharge_Edit, agencyLOC);
				waitForElement(driver, SurCharge_ApplyBtn);
				click(driver, SurCharge_ApplyBtn);

				Step_Start(13, "Click Save button in the tool bar", test, test1);


				waitForElement(driver, Rate_SaveBtn);
				click(driver, Rate_SaveBtn);

				Step_End(13, "Click Save button in the tool bar", test, test1);


				waitForElement(driver, Rate_Sub_Popup_Msg);
				String actSubmitPopupTar = getText(driver, Rate_Sub_Popup_Msg);
				if (actSubmitPopupTar.equals(wantToSavePopup)) {
					Extent_pass(driver, "Matched || Expected : " + wantToSavePopup + " Actual : " + actSubmitPopupTar, test,test1);
					System.out.println("Matched || Expected : " + wantToSavePopup + " Actual : " + actSubmitPopupTar);
					Extent_pass(driver, wantToSavePopup + " is displayed", test,test1);
					System.out.println(wantToSavePopup + " is displayed");

					Step_Start(14, "Click submit", test, test1);

					click(driver, Rate_SubmitBtn);

					Step_End(14, "Click submit", test, test1);

				} else {
					System.out.println("Not Matched || Expected : " + wantToSavePopup + " Actual : " + actSubmitPopupTar);
					System.out.println(wantToSavePopup + " is not displayed");
					extent_fail(driver, wantToSavePopup + " is not displayed", test,test1);
					Extent_fail(driver, "Not Matched || Expected : " + wantToSavePopup + " Actual : " + actSubmitPopupTar,
							test,test1);
					}

				waitForElement(driver, rate_Request_Popup);
				String actualProceedPopupTar = getText(driver, rate_Request_Popup);
				if (actualProceedPopupTar.equals(wantToProceedPopup)) {
					Extent_pass(driver, "Matched || Expected : " + wantToProceedPopup + " Actual : " + actualProceedPopupTar,
							test,test1);
					System.out.println("Matched || Expected : " + wantToProceedPopup + " Actual : " + actualProceedPopupTar);
					Extent_pass(driver, wantToProceedPopup + " popup is displayed", test,test1);
					System.out.println(wantToProceedPopup + " popup is displayed");
					Step_Start(15, "Click Ok", test, test1);
					waitForElement(driver, Yes_Btn);
					click(driver, Yes_Btn);
					Step_End(15, "Click Ok", test, test1);

				} else {
					System.out.println("Not Matched || Expected : " + wantToProceedPopup + " Actual : " + actualProceedPopupTar);
					System.out.println(wantToProceedPopup + " popup is not displayed");
					extent_fail(driver, wantToProceedPopup + " popup is not displayed", test,test1);
					Extent_fail(driver,"Not Matched || Expected : " + wantToProceedPopup + " Actual : " + actualProceedPopupTar, test,test1);
					
				}
				waitForElement(driver, popup_5_Sec);
				String actSubmittedPopupTar = getText(driver, popup_5_Sec);
				if (actSubmittedPopupTar.contains(submittedPopup)) {
					Extent_pass(driver, "Matched || Expected : " + submittedPopup + " Actual : " + actSubmittedPopupTar, test,test1);
					System.out.println("Matched || Expected : " + submittedPopup + " Actual : " + actSubmittedPopupTar);
					Extent_pass(driver, submittedPopup + " popup is displayed", test,test1);
					System.out.println(submittedPopup + " popup is displayed");

				} else {
					
					System.out.println("Not Matched || Expected : " + submittedPopup + " Actual : " + actSubmittedPopupTar);
					System.out.println(submittedPopup + " popup is not displayed");
					extent_fail(driver, submittedPopup + " popup is not displayed", test,test1);
					Extent_fail(driver, "Not Matched || Expected : " + submittedPopup + " Actual : " + actSubmittedPopupTar,
							test,test1);
					}

				waitForElement(driver, reqNo_Textfield);
				String actualReqNoTar = getAttribute(driver, reqNo_Textfield, "value");
				System.out.println("Request Number:" + actualReqNoTar);

				if (!actualReqNoTar.equals(null)) {
					Extent_pass(driver, "Matched || " + actualReqNoTar + "  is  generated", test,test1);
					System.out.println("Matched || " + actualReqNoTar + "  is  generated");

				} else {
					System.out.println("Not Matched || " + actualReqNoTar + "Request Number  is not generated");
					Extent_fail(driver, "Not Matched || " + actualReqNoTar + "Request Number  is not generated", test,test1);
				}

				////

				waitForElement(driver, Retrived_Tariff_No);
				String afterTariff = getText(driver, Retrived_Tariff_No);

				if (!(afterTariff.equals(Before_Tarriff_No))) {
					System.out.println("Matched || " + " The Retrived Tariff Number is : " + afterTariff);
					Extent_pass(driver, "Matched || " + " The Retrived Tariff Number is : " + afterTariff, test,test1);
				} else {
					System.out.println("Not Matched || The Tariff Number is Not  Retrived");
					Extent_fail(driver, "Not Matched || The Tariff Number is Not  Retrived", test,test1);
				}
				waitForElement(driver, Grid_Request_Status);
				String actGridReqStatus = getText(driver, Grid_Request_Status);
				if (actGridReqStatus.equals(gridRequestStatus)) {
					System.out.println("Matched || " + " Expected Request Status in Grid is : " + gridRequestStatus+ " || Actual Request Status in Grid is : " + actGridReqStatus);
					Extent_pass(driver, "Matched || " + " Expected Request Status in Grid is : " + gridRequestStatus+ " || Actual Request Status in Grid is : " + actGridReqStatus, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Request Status in Grid is : " + gridRequestStatus+ " || Actual Request Status in Grid is : " + actGridReqStatus);
					Extent_fail(driver, "Not Matched || " + " Expected Request Status in Grid is : " + gridRequestStatus+ " || Actual Request Status in Grid is : " + actGridReqStatus, test,test1);
				}
				waitForElement(driver, Request_Status);
				String actReqStatus = getAttribute(driver, Request_Status, "value");
				if (actReqStatus.equals(requestStatus)) {
					System.out.println("Matched || " + " Expected Request Status is : " + requestStatus+ " || Actual Request Status is : " + actReqStatus);
					Extent_pass(driver, "Matched || " + " Expected Request Status is : " + requestStatus+ " || Actual Request Status is : " + actReqStatus, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Request Status is : " + requestStatus+ " || Actual Request Status is : " + actReqStatus);
					Extent_fail(driver, "Not Matched || " + " Expected Request Status is : " + requestStatus+ " || Actual Request Status is : " + actReqStatus, test,test1);
				}
				////

				if(Do_You_Want_Delete.equalsIgnoreCase("Yes")) {
					Extent_call(test, test1, "Rate request Delete Started");
					waitForElement(driver, close_Tab);
					click(driver, close_Tab);

					waitForElement(driver, Module_SearchR);
					sendKeys(driver, Module_SearchR, moduleSRRGate);
					enter(driver);

					//SRR Gate

					waitForElement(driver, srrGate_Tab);
					if (isDisplayed(driver, srrGate_Tab)) {
						Extent_pass(driver, "SRR Gate Page is displayed", test,test1);
						System.out.println("SRR Gate Page is displayed");
					} else {
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
					waitForElement(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, actualReqNoTar);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNumTar = getText(driver, select_Actual_ReqNo);
					if (submitted_ReqNumTar.equals(actualReqNoTar)) {
						System.out.println("Matched || " + " Expected Value is : " + actualReqNoTar + " || Actual Value is : "+ submitted_ReqNumTar);
						Extent_pass(driver, "Matched || " + " Expected Value is : " + actualReqNoTar + " || ActualValue is : "+ submitted_ReqNumTar, test,test1);
						Extent_pass(driver, actualReqNoTar + "  is submitted", test,test1);
						System.out.println(actualReqNoTar + " is submitted");
						waitForElement(driver, select_Actual_ReqNo);
						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver, close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);
					} else {
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNoTar + " || Actual Value  is : "+ submitted_ReqNumTar);
						System.out.println(actualReqNoTar + " is not submitted");
						extent_fail(driver, actualReqNoTar + " Error is not displayed", test,test1);
						Extent_fail(driver, "Not matched || " + " Expected Value is : " + actualReqNoTar + " || Actual Value is : "+ submitted_ReqNumTar, test,test1);
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
					waitForElement(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, actualReqNoTar);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNumTar = getText(driver, select_Actual_ReqNo);
					if (pending_ReqNumTar.equals(actualReqNoTar)) {
						System.out.println("Matched || " + " Expected Value is : " + actualReqNoTar + " || Actual Value is : "+ pending_ReqNumTar);
						Extent_pass(driver, "Matched || " + " Expected Value is : " + actualReqNoTar + " || ActualValue is : "+ pending_ReqNumTar, test,test1);
						Extent_pass(driver, actualReqNoTar + "  is moved To pending", test,test1);
						System.out.println(actualReqNoTar + " is moved To Deleted");

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						doubleClick(driver, select_Actual_ReqNo);
						waitForElement(driver, delete_Button_Toolbar);
						click(driver, delete_Button_Toolbar);

						waitForElement(driver, delete_Request_Popup);
						click(driver, delete_Request_Popup_Ok);

						waitForElement(driver, comment_Ok_Button);
						click(driver, comment_Ok_Button);
					}else {
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNoTar + " || Actual Value  is : "+ pending_ReqNumTar);
						System.out.println(actualReqNoTar + " is not moved To Deleted");
						extent_fail(driver, actualReqNoTar + " Error is not displayed", test,test1);
						Extent_fail(driver, "Not matched || " + " Expected Value is : " + actualReqNoTar + " || Actual Value is : "+ pending_ReqNumTar, test,test1);
						
					}
					Extent_call(test, test1, "Rate request Delete Ended");
				}
				Extent_completed(testCaseName, test, test1);
				waitForElement(driver, srrGate_Tab);
				click(driver, srrGate_Tab);
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
			}
		}
		boolean sc21=true;
		if(sc21==true) {

			String tc_Name="TC_Rate_Request_SC21";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
			String Sheet_Name_021 = TestNgXml.getsheetName_FromExecution().get(tc_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_021, tc_Name, "Dataset"+selected_dataset, File_Path);

			String Field_Names =data.get("field_name");
			String Eqp_Quantity_Input =data.get("Eqp_Quantity_Input");
			String Eqp_Type_Input =data.get("Eqp_Type_Input");
			String Gross_Weight_Input =data.get("Gross_Weight_Input");
			String Exp_Det_Days_Input =data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input =data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input =data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input =data.get("Imp_Demmurage_Input");
			String commodity =data.get( "Commodity");
			String moduleSRRGate =data.get( "ModuleSRRGate");
			String wantToSavePopup =data.get( "WantToSavePopup");
			String wantToProceedPopup =data.get( "WantToProceedPopup");
			String submittedPopup =data.get( "SubmittedPopup");
			String requestStatus =data.get( "RequestStatus");
			String gridRequestStatus =data.get( "GridRequestStatus");
			String surchargeCode =data.get( "SurchargeCode");
			String ofrGreater =data.get( "OFRGreater");
			String DG_checkboxs = data.get("DG_checkboxs");
			String NOR_checkbox = data.get("NOR_checkbox");
			String SOC_checkbox = data.get("SOC_checkbox");
			String OOG_checkbox = data.get("OOG_checkbox");
			String Origin_Input = data.get("Origin_Input");
			String Delivery_Input1 = data.get("Dehlivery_Input");
			String Non_Containerized = data.get("Non_Containerized");
			String Customer_Code = data.get("Cust_code");
			String Condition_Value = data.get("Condition_Value");
			String Customer_code_Value = data.get("Customer_code_Value");
			String Routing_Service = data.get("Routing_Service");
			String Pre_Carriage_Radiobtn = data.get("pre_Carriage_Radiobtn");
			String On_Carriage_Radiobtn = data.get("On_Carriage_Radiobtn");
			String DatePicker = data.get("DatePicker");
			String From_date = data.get("From_date");
			String To_date = data.get("To_date");
			String Do_You_Want_Delete = data.get("Do_You_Want_Delete");
			String tService=data.get("T_Service");
			String TOS=data.get("TOS_Option");
			
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

			Extent_Start(tc_Name, test, test1);

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
				clearAndType(driver, Eqp_Quantity,Eqp_Quantity_Input);

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
					String date_select =String.format(Rate_Request_Loactors.date_select, day);
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
					String date_select =String.format(Rate_Request_Loactors.date_select, day);
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
				sendKeys(driver, OFR_Txt_Field, ofrGreater);


				Step_End(11, "Enter the OFR greater than the tariff", test, test1);

				Step_Start(12, "Click Add", test, test1);

				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);

				Step_End(12, "Click Add", test, test1);
				scrollDownByHeight(driver, surchargeGrid);


				waitForElement(driver, Surcharge_AddBtn);
				click(driver, Surcharge_AddBtn);
				waitForElement(driver, Surcharge_ChargeCode);
				sendKeys(driver, Surcharge_ChargeCode, surchargeCode);
				waitForElement(driver, SurCharge_Value);
				doubleClick(driver, SurCharge_Value);

				waitForElement(driver, SurCharge_ApplyBtn);
				click(driver, SurCharge_ApplyBtn);

				String code =String.format(Rate_Request_Loactors.code, surchargeCode);

				String actCode = getText(driver, code);
				System.out.println("actCode:"+actCode);


				waitForElement(driver, surchargeGrid);
				scrollDownByHeight(driver, surchargeGrid);
				if(isDisplayed(driver, code)) {
					System.out.println("Surcharge is added");
					Extent_pass(driver, "Surcharge is added", test,test1);
				}else {

					System.out.println("Surcharge is not added");
					Extent_fail(driver, "Surcharge is not added", test,test1);			}


				Step_Start(13,"Click Save button in the tool bar.", test, test1);
				waitForElement(driver, Rate_SaveBtn);
				click(driver, Rate_SaveBtn);
				Step_End(13,"Click Save button in the tool bar.", test, test1);
				Step_Start(14,"Click submit.", test, test1);
				waitForElement(driver, Rate_Sub_Popup_Msg);
				String actSubmitPopupTar1 = getText(driver, Rate_Sub_Popup_Msg);
				if (actSubmitPopupTar1.equals(wantToSavePopup)) {
					Extent_pass(driver, "Matched || Expected : " + wantToSavePopup + " Actual : " + actSubmitPopupTar1, test,test1);
					System.out.println("Matched || Expected : " + wantToSavePopup + " Actual : " + actSubmitPopupTar1);
					Extent_pass(driver, wantToSavePopup + " is displayed", test,test1);
					System.out.println(wantToSavePopup + " is displayed");

					click(driver, Rate_SubmitBtn);
				} else {
					System.out.println("Not Matched || Expected : " + wantToSavePopup + " Actual : " + actSubmitPopupTar1);

					Extent_fail(driver, "Not Matched || Expected : " + wantToSavePopup + " Actual : " + actSubmitPopupTar1,
							test,test1);
				}
				Step_End(14,"Click submit.", test, test1);
				Step_Start(15,"Click Ok..", test, test1);
				waitForElement(driver, rate_Request_Popup);
				String actualProceedPopupTar1 = getText(driver, rate_Request_Popup);
				if (actualProceedPopupTar1.equals(wantToProceedPopup)) {
					Extent_pass(driver, "Matched || Expected : " + wantToProceedPopup + " Actual : " + actualProceedPopupTar1,
							test,test1);
					System.out.println("Matched || Expected : " + wantToProceedPopup + " Actual : " + actualProceedPopupTar1);
					Extent_pass(driver, wantToProceedPopup + " popup is displayed", test,test1);
					System.out.println(wantToProceedPopup + " popup is displayed");
					click(driver, Yes_Btn);

				} else {
					System.out.println("Not Matched || Expected : " + wantToProceedPopup + " Actual : " + actualProceedPopupTar1);

					Extent_fail(driver,"Not Matched || Expected : " + wantToProceedPopup + " Actual : " + actualProceedPopupTar1, test,test1);
				}
				Step_End(15,"Click Ok..", test, test1);

				waitForElement(driver, popup_5_Sec);
				String actSubmittedPopupTar1 = getText(driver, popup_5_Sec);
				if (actSubmittedPopupTar1.contains(submittedPopup)) {
					Extent_pass(driver, "Matched || Expected : " + submittedPopup + " Actual : " + actSubmittedPopupTar1, test,test1);
					System.out.println("Matched || Expected : " + submittedPopup + " Actual : " + actSubmittedPopupTar1);
					Extent_pass(driver, submittedPopup + " popup is displayed", test,test1);
					System.out.println(submittedPopup + " popup is displayed");

				} else {
					System.out.println("Not Matched || Expected : " + submittedPopup + " Actual : " + actSubmittedPopupTar1);

					Extent_fail(driver, "Not Matched || Expected : " + submittedPopup + " Actual : " + actSubmittedPopupTar1,
							test,test1);
				}


				String actualReqNoTar1 = getAttribute(driver, reqNo_Textfield, "value");
				System.out.println("Request Number:" + actualReqNoTar1);

				if (!actualReqNoTar1.equals(null)) {
					Extent_pass(driver, "Matched || " + actualReqNoTar1 + "  is  generated", test,test1);
					System.out.println("Matched || " + actualReqNoTar1 + "  is  generated");

				} else {
					System.out.println("Not Matched || " + actualReqNoTar1 + "Request Number  is not generated");

					Extent_fail(driver, "Not Matched || " + actualReqNoTar1 + "Request Number  is not generated", test,test1);
				}

				waitForElement(driver, Retrived_Tariff_No);
				String afterTariff1 = getText(driver, Retrived_Tariff_No);

				if (!(afterTariff1.equals(Before_Tarriff_No))) {
					System.out.println("Matched || " + " The Retrived Tariff Number is : " + afterTariff1);
					Extent_pass(driver, "Matched || " + " The Retrived Tariff Number is : " + afterTariff1, test,test1);
				} else {
					System.out.println("Not Matched || The Tariff Number is Not  Retrived");
					Extent_fail(driver, "Not Matched || The Tariff Number is Not  Retrived", test,test1);
				}
				waitForElement(driver, Grid_Request_Status);
				String actGridReqStatus1 = getText(driver, Grid_Request_Status);
				if (actGridReqStatus1.equals(gridRequestStatus)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridReqStatus1);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridReqStatus1, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridReqStatus1);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridReqStatus1, test,test1);
				}
				waitForElement(driver, Request_Status);
				String actReqStatus1 = getAttribute(driver, Request_Status, "value");
				if (actReqStatus1.equals(requestStatus)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actReqStatus1);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actReqStatus1, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actReqStatus1);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actReqStatus1, test,test1);
				}
				if(Do_You_Want_Delete.equalsIgnoreCase("Yes")) {
					Extent_call(test, test1, "Rate request Delete Started");
					waitForElement(driver, close_Tab);
					click(driver, close_Tab);
					sendKeys(driver, Module_SearchR, moduleSRRGate);
					waitForElement(driver, SRR_Gate);
					click(driver, SRR_Gate);
					//SRR Gate
					waitForElement(driver, srrGate_Tab);
					if (isDisplayed(driver, srrGate_Tab)) {
						Extent_pass(driver, "SRR Gate Page is displayed", test,test1);
						System.out.println("SRR Gate Page is displayed");
					} else {
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
					sendKeys(driver, filter_Inputfield, actualReqNoTar1);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNumTar1 = getText(driver, select_Actual_ReqNo);
					if (submitted_ReqNumTar1.equals(actualReqNoTar1)) {
						System.out.println("Matched || " + " Expected Value is : " + actualReqNoTar1 + " || Actual Value is : "+ submitted_ReqNumTar1);
						Extent_pass(driver, "Matched || " + " Expected Value is : " + actualReqNoTar1 + " || ActualValue is : "+ submitted_ReqNumTar1, test,test1);
						Extent_pass(driver, actualReqNoTar1 + "  is submitted", test,test1);
						System.out.println(actualReqNoTar1 + " is submitted");

						click(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						click(driver, close_Moved_Pending_Popup);

					} else {
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNoTar1 + " || Actual Value  is : "+ submitted_ReqNumTar1);
						Extent_fail(driver, "Not matched || " + " Expected Value is : " + actualReqNoTar1 + " || Actual Value is : "+ submitted_ReqNumTar1, test,test1);
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
					sendKeys(driver, filter_Inputfield, actualReqNoTar1);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNumTar1 = getText(driver, select_Actual_ReqNo);
					if (pending_ReqNumTar1.equals(actualReqNoTar1)) {
						System.out.println("Matched || " + " Expected Value is : " + actualReqNoTar1 + " || Actual Value is : "+ pending_ReqNumTar1);
						Extent_pass(driver, "Matched || " + " Expected Value is : " + actualReqNoTar1 + " || ActualValue is : "+ pending_ReqNumTar1, test,test1);
						Extent_pass(driver, actualReqNoTar1 + "  is moved To pending", test,test1);
						System.out.println(actualReqNoTar1 + " is moved To pending");

						click(driver, select_Actual_ReqNo);
						doubleClick(driver, select_Actual_ReqNo);
						waitForElement(driver, delete_Button_Toolbar);
						click(driver, delete_Button_Toolbar);

						waitForElement(driver, delete_Request_Popup);
						click(driver, delete_Request_Popup_Ok);

						waitForElement(driver, comment_Ok_Button);
						click(driver, comment_Ok_Button);
					} else {
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNoTar1 + " || Actual Value  is : "+ pending_ReqNumTar1);
						Extent_fail(driver, "Not matched || " + " Expected Value is : " + actualReqNoTar1 + " || Actual Value is : "+ pending_ReqNumTar1, test,test1);
					}
					Extent_call(test, test1, "Rate request Delete Ended");
				}
				Extent_completed(tc_Name, test, test1);
				waitForElement(driver, srrGate_Tab);
				click(driver, srrGate_Tab);
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
			}
		}
		boolean sc22=true;
		if(sc22==true) {

			String tc_Name="TC_Rate_Request_SC22";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
			String Sheet_Name_021 = TestNgXml.getsheetName_FromExecution().get(tc_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_021, tc_Name, "dataset"+selected_dataset, File_Path);
			String status_value=data.get("Status");	
			String module2=data.get("search_module2");
			String Field_Names =data.get("field_name");
			String Eqp_Type_Input =data.get("Eqp_Type_Input");
			String Gross_Weight_Input =data.get("Gross_Weight_Input");
			String Exp_Det_Days_Input =data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input =data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input =data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input =data.get("Imp_Demmurage_Input");
			String commodity =data.get( "Commodity");
			String ofrGreater =data.get( "OFRGreater");
			String DG_checkboxs = data.get("DG_checkboxs");
			String NOR_checkbox = data.get("NOR_checkbox");
			String SOC_checkbox = data.get("SOC_checkbox");
			String OOG_checkbox = data.get("OOG_checkbox");
			String Origin_Input = data.get("Origin_Input");
			String Delivery_Input1 = data.get("Dehlivery_Input");
			String Non_Containerized = data.get("Non_Containerized");
			String Customer_Code = data.get("Cust_code");
			String Condition_Value = data.get("Condition_Value");
			String Customer_code_Value = data.get("Customer_code_Value");
			String Routing_Service = data.get("Routing_Service");
			String Pre_Carriage_Radiobtn = data.get("pre_Carriage_Radiobtn");
			String On_Carriage_Radiobtn = data.get("On_Carriage_Radiobtn");
			String DatePicker = data.get("DatePicker");
			String From_date = data.get("From_date");
			String To_date = data.get("To_date");
			String Do_You_Want_Delete = data.get("Do_You_Want_Delete");
			String tService=data.get("T_Service");
			String TOS=data.get("TOS_Option");
			String Eqp_Quantity_Input =data.get("Eqp_Quantity_Input");
			
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

			Extent_Start(tc_Name, test, test1);

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
				clearAndType(driver, Eqp_Quantity,Eqp_Quantity_Input);

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
					String date_select =String.format(Rate_Request_Loactors.date_select, day);
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
					String date_select =String.format(Rate_Request_Loactors.date_select, day);
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
				sendKeys(driver, OFR_Txt_Field, ofrGreater);


				Step_End(11, "Enter the OFR greater than the tariff", test, test1);

				Step_Start(12, "Click Add", test, test1);

				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);

				Step_End(12, "Click Add", test, test1);

				waitForElement(driver, Rate_SaveBtn);
				click(driver, Rate_SaveBtn);
				waitForElement(driver, Rate_SubmitBtn);
				click(driver, Rate_SubmitBtn);
				waitForElement(driver, Yes_Btn);
				click(driver, Yes_Btn);

				waitForElement(driver, status_Field);
				String status=getAttribute(driver, status_Field, "value");
				if(status.equals(status_value)) {
					System.out.println("Rate Request Submitted");
					System.out.println("Matched || Expected value was : "+status_value+" || Actual value was : "+status);
					Extent_pass(driver, "Matched || Expected value was : "+status_value+" || Actual value was : "+status, test,test1);
				}
				else {
					System.out.println("Not Matched || Expected value was : "+status_value+" || Actual value was : "+status);
					Extent_fail(driver,  "Not Matched || Expected value was : "+status_value+" || Actual value was : "+status, test,test1);
				}

				waitForElement(driver, reqNo_Textfield);
				String reqno=getAttribute(driver, reqNo_Textfield, "value");
				System.out.println(reqno);

				if(Do_You_Want_Delete.equalsIgnoreCase("Yes")) {
					Extent_call(test, test1, "Rate request Delete Started");

					waitForElement(driver, close_Tab);
					click(driver, close_Tab);	

					//delete the rate request
					waitForElement(driver, Module_SearchR);
					sendKeys(driver, Module_SearchR, module2);	
					waitForElement(driver, SRR_Gate);
					click(driver, SRR_Gate);


					waitForElement(driver, srrGate_Tab);
					if (isDisplayed(driver, srrGate_Tab)) {
						Extent_pass(driver, "SRR Gate Page is displayed", test,test1);
						System.out.println("SRR Gate Page is displayed");
					} else {
						System.out.println("SRR Gate Page is not displayed");

						Extent_fail(driver, "SRR Gate Page is not displayed", test,test1);
					}
					//Submitted	
					waitForElement(driver, submit_RadioButton);
					click(driver, submit_RadioButton);

					waitForElement(driver, menu_Icon_Grid);
					click(driver, menu_Icon_Grid);

					waitForElement(driver, filter_Icon_Grid);
					click(driver, filter_Icon_Grid);

					waitForElement(driver, filter_Inputfield);
					click(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, reqno);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNum=getText(driver, select_Actual_ReqNo);
					if(submitted_ReqNum.equals(reqno)) {
						System.out.println("Matched || " + " Expected Value is : " + reqno + " || Actual Value is : " + submitted_ReqNum);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + reqno + " || ActualValue is : " + submitted_ReqNum,test, test1);

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver, close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);

						System.out.println(reqno+" Moved to Pending");
						Extent_pass(driver, reqno+" Moved to Pending", test, test1);

					}else {
						System.out.println("Not matched || " + " Expected Value is : " + reqno + " || Actual Value  is : " + submitted_ReqNum);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + reqno + " || Actual Value is : " + submitted_ReqNum,test, test1);
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

					sendKeys(driver, filter_Inputfield, reqno);
					enter(driver);


					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNum=getText(driver, select_Actual_ReqNo);
					if(pending_ReqNum.equals(reqno)) {
						System.out.println("Matched || " + " Expected Value is : " + reqno + " || Actual Value is : " + pending_ReqNum);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + reqno + " || ActualValue is : " + pending_ReqNum,test, test1);

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						doubleClick(driver, select_Actual_ReqNo);
						waitForElement(driver, delete_Button_Toolbar);
						click(driver, delete_Button_Toolbar);

						System.out.println(reqno+" Opened in Rate Request tab");
						Extent_pass(driver, reqno+" Opened in Rate Request tab", test, test1);

					}else {
						System.out.println("Not matched || " + " Expected Value is : " + reqno + " || Actual Value  is : " + pending_ReqNum);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + reqno + " || Actual Value is : " + pending_ReqNum,test, test1);
					}		

					waitForElement(driver, delete_Request_Popup);
					click(driver, delete_Request_Popup_Ok);
					waitForElement(driver, comment_Ok_Button);
					click(driver, comment_Ok_Button);
					Extent_call(test, test1, "Rate request Delete Ended");
				}
				Extent_completed(tc_Name, test, test1);
				waitForElement(driver, srrGate_Tab);
				click(driver, srrGate_Tab);
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
			}
		}
		boolean sc23=true;
		if(sc23==true) {
			String tc_Name="TC_Rate_Request_SC23";

			
			String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
			String Sheet_Name_023 = TestNgXml.getsheetName_FromExecution().get(tc_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_023, tc_Name, "dataset"+selected_dataset, File_Path);
			String status_value=data.get("Status");	
			String module2=data.get("search_module2");
			String Field_Names =data.get("field_name");
			String Eqp_Type_Input =data.get("Eqp_Type_Input");
			String Gross_Weight_Input =data.get("Gross_Weight_Input");
			String Exp_Det_Days_Input =data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input =data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input =data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input =data.get("Imp_Demmurage_Input");
			String commodity =data.get( "Commodity");
			String ofrGreater =data.get( "OFRGreater");
			String DG_checkboxs = data.get("DG_checkboxs");
			String NOR_checkbox = data.get("NOR_checkbox");
			String SOC_checkbox = data.get("SOC_checkbox");
			String OOG_checkbox = data.get("OOG_checkbox");
			String Origin_Input = data.get("Origin_Input");
			String Delivery_Input1 = data.get("Dehlivery_Input");
			String Non_Containerized = data.get("Non_Containerized");
			String Customer_Code = data.get("Cust_code");
			String Condition_Value = data.get("Condition_Value");
			String Customer_code_Value = data.get("Customer_code_Value");
			String Routing_Service = data.get("Routing_Service");
			Pre_Carriage_Radiobtn = data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = data.get("On_Carriage_Radiobtn");
			String DatePicker = data.get("DatePicker");
			String From_date = data.get("From_date");
			String To_date = data.get("To_date");
			String Do_You_Want_Delete = data.get("Do_You_Want_Delete");
			String tService=data.get("T_Service");
			String TOS=data.get("TOS_Option");
			String Eqp_Quantity_Input =data.get("Eqp_Quantity_Input");
			
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 



			Extent_Start(tc_Name, test, test1);

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
				clearAndType(driver, Eqp_Quantity,Eqp_Quantity_Input);

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
					String date_select =String.format(Rate_Request_Loactors.date_select, day);
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
					String date_select =String.format(Rate_Request_Loactors.date_select, day);
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
				sendKeys(driver, OFR_Txt_Field, ofrGreater);


				Step_End(11, "Enter the OFR greater than the tariff", test, test1);

				Step_Start(12, "Click Add", test, test1);

				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);

				Step_End(12, "Click Add", test, test1);

				Step_Start(13, "Click Save button in the tool bar.", test, test1);
				waitForElement(driver, Rate_SaveBtn);
				click(driver, Rate_SaveBtn);
				Step_End(13, "Click Save button in the tool bar.", test, test1);

				Step_Start(14, "Click submit.", test, test1);
				waitForElement(driver, Rate_SubmitBtn);
				click(driver, Rate_SubmitBtn);
				Step_End(14, "Click submit.", test, test1);

				Step_Start(15, "Click OK", test, test1);
				waitForElement(driver, Yes_Btn);
				safeclick(driver, Yes_Btn);
				Step_End(15, "Click OK", test, test1);
				waitForElement(driver, status_Field);
				String status1=getAttribute(driver, status_Field, "value");
				if(status1.equals(status_value)) {
					System.out.println("Rate Request Submitted");
					System.out.println("Matched || Expected value was : "+status_value+" || Actual value was : "+status1);
					Extent_pass(driver, "Matched || Expected value was : "+status_value+" || Actual value was : "+status1, test,test1);
				}
				else {
					System.out.println("Not Matched || Expected value was : "+status_value+" || Actual value was : "+status1);
					Extent_fail(driver,  "Not Matched || Expected value was : "+status_value+" || Actual value was : "+status1, test,test1);
				}

				waitForElement(driver, reqNo_Textfield);
				String reqno1=getAttribute(driver, reqNo_Textfield, "value");
				System.out.println(reqno1);


				if(Do_You_Want_Delete.equalsIgnoreCase("Yes")) {
					Extent_call(test, test1, "Rate request Delete Started");
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);	

				//delete the rate request
				waitForElement(driver, Module_SearchR);
				sendKeys(driver, Module_SearchR, module2);	
				waitForElement(driver, SRR_Gate);
				click(driver, SRR_Gate);


				waitForElement(driver, srrGate_Tab);
				if (isDisplayed(driver, srrGate_Tab)) {
					Extent_pass(driver, "SRR Gate Page is displayed", test,test1);
					System.out.println("SRR Gate Page is displayed");
				} else {
					System.out.println("SRR Gate Page is not displayed");

					Extent_fail(driver, "SRR Gate Page is not displayed", test,test1);
				}
				//Submitted	
				waitForElement(driver, submit_RadioButton);
				click(driver, submit_RadioButton);

				waitForElement(driver, menu_Icon_Grid);
				click(driver, menu_Icon_Grid);

				waitForElement(driver, filter_Icon_Grid);
				click(driver, filter_Icon_Grid);

				waitForElement(driver, filter_Inputfield);
				click(driver, filter_Inputfield);
				sendKeys(driver, filter_Inputfield, reqno1);
				enter(driver);

				waitForElement(driver, select_Actual_ReqNo);
				String submitted_ReqNum1=getText(driver, select_Actual_ReqNo);
				if(submitted_ReqNum1.equals(reqno1)) {
					System.out.println("Matched || " + " Expected Value is : " + reqno1 + " || Actual Value is : " + submitted_ReqNum1);
					Extent_pass(driver,"Matched || " + " Expected Value is : " + reqno1 + " || ActualValue is : " + submitted_ReqNum1,test,test1);

					click(driver, select_Actual_ReqNo);
					RightClick(driver, select_Actual_ReqNo);
					waitForElement(driver, moveTo_Pending);
					click(driver, moveTo_Pending);
					waitForElement(driver, close_Moved_Pending_Popup);
					click(driver, close_Moved_Pending_Popup);

					System.out.println(reqno1+" Moved to Pending");
					Extent_pass(driver, reqno1+" Moved to Pending", test,test1);

				}else {
					System.out.println("Not matched || " + " Expected Value is : " + reqno1 + " || Actual Value  is : " + submitted_ReqNum1);
					Extent_fail(driver,"Not matched || " + " Expected Value is : " + reqno1 + " || Actual Value is : " + submitted_ReqNum1,test,test1);
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
				sendKeys(driver, filter_Inputfield, reqno1);
				enter(driver);


				waitForElement(driver, select_Actual_ReqNo);
				String pending_ReqNum1=getText(driver, select_Actual_ReqNo);
				if(pending_ReqNum1.equals(reqno1)) {
					System.out.println("Matched || " + " Expected Value is : " + reqno1 + " || Actual Value is : " + pending_ReqNum1);
					Extent_pass(driver,"Matched || " + " Expected Value is : " + reqno1 + " || ActualValue is : " + pending_ReqNum1,test,test1);

					click(driver, select_Actual_ReqNo);
					doubleClick(driver, select_Actual_ReqNo);
					waitForElement(driver, delete_Button_Toolbar);
					click(driver, delete_Button_Toolbar);

					System.out.println(reqno1+" Opened in Rate Request tab");
					Extent_pass(driver, reqno1+" Opened in Rate Request tab", test,test1);

				}else {
					System.out.println("Not matched || " + " Expected Value is : " + reqno1 + " || Actual Value  is : " + pending_ReqNum1);
					Extent_fail(driver,"Not matched || " + " Expected Value is : " + reqno1 + " || Actual Value is : " + pending_ReqNum1,test,test1);
				}		

				waitForElement(driver, delete_Request_Popup);
				click(driver, delete_Request_Popup_Ok);

				waitForElement(driver, comment_Ok_Button);
				click(driver, comment_Ok_Button);
				Extent_call(test, test1, "Rate request Delete Ended");
				}
				Extent_completed(tc_Name, test, test1);
			}
		}
	}
}