package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC10_SC11 extends Keywords {

	public void Rate_Request_SC10(WebDriver driver, ExtentTest test,ExtentTest test1, String selected_dataset) {
		String testCaseName="TC_Rate_Request_SC10_SC11";
		String testCaseName10="TC_Rate_Request_SC10";
		String testCaseName11="TC_Rate_Request_SC11";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_023 = TestNgXml.getsheetName_FromExecution().get(testCaseName);

		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_023, testCaseName,"Dataset" + selected_dataset, File_Path);
		String username=Excel_data.get("Username");
		String password=Excel_data.get("Password");
		String Search_module=Excel_data.get("Search_module");
		String Origin_Input=Excel_data.get("Origin_Input");
		String Delivery_Input =Excel_data.get("Dehlivery_Input");
		String Commodity_Input_Txt=Excel_data.get("Commodity_Input");
		String eqp_Type_Input=Excel_data.get("Eqp_Type_Input");	
		String Eqp_Quantity_Input=Excel_data.get("Eqp_Quantity_Input");
		String Gross_Weight_Input=Excel_data.get("Gross_Weight_Input");
		String Length_Field_Input=Excel_data.get("Length_Field_Input");
		String Width_Field_Input=Excel_data.get("Width_Field_Input");
		String Height_Field_Input=Excel_data.get("Height_Field_Input");
		String Exp_Det_Days_Input=Excel_data.get("Exp_Det_Days_Input");
		String Imp_Det_Days_Input=Excel_data.get("Imp_Det_Days_Input");
		String Exp_Demmurage_Input=Excel_data.get("Exp_Demmurage_Input");
		String Imp_Demmurage_Input=Excel_data.get("Imp_Demmurage_Input");
		String OFR_Txt_Field_Input=Excel_data.get("OFR_Txt_Field_Input");
		String Req_Submit_Popup_Txt=Excel_data.get("Req_Submit_Popup_Txt");
		String Rate_Req_Submitted_Popup_Txt=Excel_data.get("Rate_Req_Submitted_Popup_Txt");
		String Module_SRR_Gate=Excel_data.get("Module_SRR_Gate");
		String submit_msg=Excel_data.get("submit_msg");
		String Req_Status_Exp=Excel_data.get("Req_Status_Exp");
		String req_Status_Submit=Excel_data.get("Req_Status_Submit");
		String routing_Origin = Excel_data.get("Routing_Origin");
		String routing_Service = Excel_data.get("Routing_Service");

		String DG_checkboxs = Excel_data.get("DG_checkboxs");
		String NOR_checkbox = Excel_data.get("NOR_checkbox");
		String SOC_checkbox = Excel_data.get("SOC_checkbox");
		String OOG_checkbox = Excel_data.get("OOG_checkbox");
		String From_Date_Input =Excel_data.get( "From_Date_Input");
		String To_Date_Input =Excel_data.get( "To_Date_Input");
		String delete_perform =Excel_data.get( "Delete_perform");
		String customerCode_Option =Excel_data.get( "CustomerCode_Option");
		String condition_Option =Excel_data.get( "Condition_Option");
		String customerCode =Excel_data.get( "CustomerCode");
		String agencyUser =Excel_data.get( "AgencyUser");
		String datePicker =Excel_data.get( "DatePicker");
		String Request_Input=Excel_data.get("Request_Type_Input");
		String service =Excel_data.get( "Service");
		String Customer_code_Value2 = Excel_data.get("Customer_code_Value2");
		String Customer_code_Value3 = Excel_data.get("Customer_code_Value3");
		String Cust_code2 = Excel_data.get("Cust_code2");
		String Cust_code3 = Excel_data.get("Cust_code3");
		String tService = Excel_data.get("T_Service");
		String TOS = Excel_data.get("TOS_Option");
		String Pre_Carriage_Radiobtn = Excel_data.get("pre_Carriage_Radiobtn");
		String On_Carriage_Radiobtn = Excel_data.get("on_Carriage_Radiobtn");
		String Rate_No_Search_Type = Excel_data.get("Rate_No_Search_Type");
		
		navigateUrl(driver, url);

		Extent_Start(testCaseName, test, test1);	

		String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


		//Login
				LRP_Login(driver, username, password);
				
				//Switch User
				SwitchProfile(driver, agencyUser);
				
				//Module search
				moduleNavigate(driver, Search_module);
				
				// Rate Request
				waitForElement(driver, rateRequest_Tab);
				if (isDisplayed(driver, rateRequest_Tab)) {
					Extent_pass(driver, "Rate Request Page is displayed", test,test1);
					System.out.println("Rate Request Page is displayed");
				} else {
					System.out.println("Rate Request Page is not displayed");

					Extent_fail(driver, "Rate Request Page is not displayed", test,test1);
				}
				Step_Start(1, "Click on the new button in the toolbar", test, test1);
				waitForDisplay(driver, Rate_Newbutton);
				if(isdisplayed(driver, Rate_Newbutton)&&isElementEnabled(driver, Rate_Newbutton)) {
					waitForElement(driver, Rate_Newbutton);
					click(driver, Rate_Newbutton);
				}
				Step_End(1, "Click on the new button in the toolbar", test, test1);

		waitForElement(driver, Requet_Type);
		click(driver,Requet_Type);
		waitForElement(driver, Request_Type_Locator);
		click(driver, Request_Type_Locator);
		Step_End(2, "Select the Reefer rate request type", test, test1);

		waitForElement(driver, tService_Dropdown);
		click(driver, tService_Dropdown);
		waitForElement(driver, select_t_Service);
		click(driver, select_t_Service);

		waitForElement(driver, TOS_Dropdown);
		click(driver, TOS_Dropdown);
		waitForElement(driver, tos);
		click(driver, tos);

		Step_Start(2, "Enter the customer name", test, test1);


		waitForElement(driver, Customer_Name_search_button);
		click(driver, Customer_Name_search_button);
		globalValueSearchWindow1(driver, condition_Option, customerCode_Option, customerCode, Cust_code2, Customer_code_Value2,Cust_code3, Customer_code_Value3);
		
		waitForDisplay(driver, pop_up_exp);
		if(isdisplayed(driver,pop_up_exp )) {
			String actual_Popup = getText(driver, pop_up_exp);
			System.out.println("The Customer Code is Invalid The Actual Popup value was : "+actual_Popup);
			Extent_fail(driver, "The Customer Code is Invalid The Actual Popup value was : "+actual_Popup, test, test1);
		}else {
			waitForElement(driver, retrivedGlobalValue);
			click(driver, retrivedGlobalValue);
			waitForElement(driver, SelectButton);
			click(driver, SelectButton);
		}

		Step_End(2, "Enter the customer name", test, test1);
		waitForDisplay(driver, exit_Button);
		if(isDisplayed(driver, exit_Button)) {
			waitForElement(driver, exit_Button);
			click(driver, exit_Button);
		}

		Step_Start(3, "Enter the origin", test, test1);
		waitForElement(driver, Orgin_Input);
		sendKeys(driver, Orgin_Input, Origin_Input);
		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);
		Step_End(3, "Enter the origin", test, test1);

		Step_Start(4, "Enter the Delivery", test, test1);
		waitForElement(driver, Delivery_Input_Field);
		sendKeys(driver, Delivery_Input_Field,Delivery_Input );
		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);

		Step_End(4, "Enter the Delivery", test, test1);

		// Selecting the From Date
				waitForElement(driver, Dateclick);
				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, Dateclick, From_Date_Input);
				} else {
					waitForElement(driver, Dateclick);
					clearAndType(driver, Dateclick, From_Date_Input);
				}
				
				// Selecting the to Date
				waitForElement(driver, Dateclick1);
				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, Dateclick1, To_Date_Input);
				} else {
					waitForElement(driver, Dateclick1);
					clearAndType(driver, Dateclick1, To_Date_Input);
				}

							click(driver, service_Textfield);
							clearAndType(driver, service_Textfield, service);
							
		Step_Start(5, "Enter the Commodity", test, test1);
		waitForElement(driver, Commodity_Input);
		sendKeys(driver, Commodity_Input, Commodity_Input_Txt);
		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);

		Step_End(5, "Enter the Commodity", test, test1);

		Step_Start(6, "Enter the Equipment type", test, test1);
		waitForElement(driver, Eqp_Type);
		click(driver, Eqp_Type);
		sendKeys(driver, Eqp_Type, eqp_Type_Input);
		System.out.println("Eqp type:"+eqp_Type_Input);
		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);

		Step_End(6, "Enter the Equipment type", test, test1);
		Step_Start(7, "Enter the Quantity", test, test1);
		waitForElement(driver, Eqp_Quantity);
		clear(driver, Eqp_Quantity);
		waitForElement(driver, Eqp_Quantity);
		click(driver, Eqp_Quantity);
		sendKeys(driver, Eqp_Quantity, Eqp_Quantity_Input);
		Step_End(7, "Enter the Quantity", test, test1);

		Step_Start(8, "Enter the Gross Weight", test, test1);
		waitForElement(driver, Gross_Weight);
		click(driver, Gross_Weight);
		Newclear(driver, Gross_Weight);
		Actionsendkeys(driver, Gross_Weight, Gross_Weight_Input);
		Step_End(8, "Enter the Gross Weight", test, test1);

		// CheckBox
		waitForElement(driver, DG_checkbox);
		checkBox(driver, DG_checkbox, DG_checkboxs);
		waitForElement(driver, oog_checkbox);
		checkBox(driver, oog_checkbox, OOG_checkbox);
		waitForElement(driver, nor_checkbox); 
		checkBox(driver, nor_checkbox, NOR_checkbox);
		waitForElement(driver, soc_checkbox); 
		checkBox(driver, soc_checkbox, SOC_checkbox);
		if(OOG_checkbox.equalsIgnoreCase("Yes")) {
			waitForElement(driver, OOG_Length_Field);
			sendKeys(driver, OOG_Length_Field,Length_Field_Input );

			waitForElement(driver, OOG_Width_Field);
			sendKeys(driver, OOG_Width_Field, Width_Field_Input);

			waitForElement(driver, OOG_Height_Field);
			sendKeys(driver, OOG_Height_Field,Height_Field_Input );			

			waitForElement(driver, OOG_Ok_Btn);
			click(driver, OOG_Ok_Btn);
		}
		if(!Pre_Carriage_Radiobtn.equals("")) {
			waitForElement(driver, preCarriageLocator);
			click(driver, preCarriageLocator);
		}
		if(!On_Carriage_Radiobtn.equals("")) {

			waitForElement(driver, onCarriageLocator);
			click(driver, onCarriageLocator);
		}

		waitForDisplay(driver, Exp_Days);
		if(isdisplayed(driver, Exp_Days)&&isElementAccessible(driver, Exp_Days)) {
			sendKeys(driver, Exp_Days, Exp_Det_Days_Input);
		}
		if(isdisplayed(driver, Imp_Days)&&isElementAccessible(driver, Imp_Days)) {
			sendKeys(driver, Imp_Days, Imp_Det_Days_Input);
		}
		if(isdisplayed(driver, Exp_Demurage)&&isElementAccessible(driver, Exp_Demurage)) {
			sendKeys(driver, Exp_Demurage, Exp_Demmurage_Input);
		}
		if(isdisplayed(driver, Imp_Demurage)&&isElementAccessible(driver, Imp_Demurage)) {
			sendKeys(driver, Imp_Demurage, Imp_Demmurage_Input);
		}

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
			sendKeys(driver, Routing_OriginTF, routing_Origin);
			waitForElement(driver, Routing_service_TF);
			sendKeys(driver, Routing_service_TF, routing_Service);
			waitForElement(driver, select_First_Routing);

			doubleClick(driver, select_First_Routing);
		}else {
			System.out.println(actRoutingFrame+" is not displayed");
			Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
		}
		Step_End(10, "Select the routing", test, test1);

		Step_Start(11, "Enter the OFR", test, test1);
		waitForElement(driver, OFR_Txt_Field);
		clear(driver, OFR_Txt_Field);
		sendKeys(driver, OFR_Txt_Field, OFR_Txt_Field_Input);
		System.out.println("OFR Value:"+OFR_Txt_Field_Input);
		Step_End(11, "Enter the OFR", test, test1);

		Step_Start(12, "Click Add", test, test1);
		waitForElement(driver, Rate_AddBtn);
		click(driver, Rate_AddBtn);
		Step_End(12, "Click Add", test, test1);

		Step_Start(13, "Click Save button in the tool bar", test, test1);
		waitForElement(driver, Rate_SaveBtn);
		click(driver, Rate_SaveBtn);
		Step_End(13, "Click Save button in the tool bar", test, test1);

		waitForElement(driver, Rate_Sub_Popup_Msg);                                                                                                                                
		String PopUp_Msg=getText(driver, Rate_Sub_Popup_Msg);                                                                                                            
		if(Req_Submit_Popup_Txt.equals(PopUp_Msg)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg);            
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg, test, test1);     
		}                                                                                                                                                                        
		else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg, test, test1); 
		} 

		Step_Start(14, "Click pending.", test, test1);
		waitForElement(driver, Rate_PendingBtn);
		click(driver, Rate_PendingBtn);
		Step_End(14, "Click pending.", test, test1);

		waitForElement(driver, submitted_Popup);                                                                                                                                
		String PopUp_Msg2=getText(driver, submitted_Popup);      
		System.out.println("PopUp_Msg : "+PopUp_Msg2);   
		if(Rate_Req_Submitted_Popup_Txt.equals(PopUp_Msg2)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Report Activity is : " + Rate_Req_Submitted_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg2);            
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Rate_Req_Submitted_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg2, test,test1);     
		}                                                                                                                                                                        
		else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Rate_Req_Submitted_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg2);        
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Rate_Req_Submitted_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg2, test,test1); 
		} 
		
		waitForElement(driver, Req_No_Txt_Field); 
		String Act_ReqNo=getAttribute(driver, Req_No_Txt_Field, "value");                                                                                                            
		if(!Act_ReqNo.equals("")) {                                                                                                                  
			System.out.println("Matched || " + " The Generated Reference Request No is : "+Act_ReqNo);            
			Extent_pass(driver, "Matched || " + " The Generated Reference Request No is : "+Act_ReqNo, test,test1);     
		}                                                                                                                                                                        
		else {                                                                                                                                                                   
			System.out.println("Not Matched || The Reference Request No is Not Generated");        
			Extent_fail(driver, "Not Matched || The Reference Request No is Not Generated", test,test1); 
		} 
		waitForElement(driver, Request_Status); 
		String act_Req_Status1 = getAttribute(driver, Request_Status,"value");
		if(Req_Status_Exp.equals(act_Req_Status1)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Request Status is : " + Req_Status_Exp + " || Actual Request Status is : " + act_Req_Status1);            
			Extent_pass(driver, "Matched || " + " Expected Request Status is : " + Req_Status_Exp + " || Actual Request Status is : " + act_Req_Status1, test,test1);     
		}                                                                                                                                                                        
		else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Request Status is : " + Req_Status_Exp + " || Actual Request Status is : " + act_Req_Status1);        
			Extent_fail(driver, "Not Matched || " + " Expected Request Status is : " + Req_Status_Exp + " || Actual Request Status is : " + act_Req_Status1, test,test1); 
		} 
		Extent_completed(testCaseName10, test, test1);
		Extent_Start(testCaseName11, test, test1);

		waitForElement(driver, close_Tab);
		click(driver, close_Tab);
moduleNavigate(driver, Search_module);
		Step_Start(1, "Click on the search icon in the toolbar", test, test1);

		waitForElement(driver, global_search_R);
		click(driver, global_search_R);
		Step_End(1, "Click on the search icon in the toolbar", test, test1);
		Step_Start(2, ".Enter the Reference number.", test, test1);
globalValueSearchWindow1(driver, condition_Option, Rate_No_Search_Type, Act_ReqNo, "", "", "", "");
		Step_End(2, ".Enter the Reference number.", test, test1);

		
		Step_Start(3, "Double click the rate in the global search.", test, test1);
		waitForElement(driver, global_search_value_R);
		doubleClick(driver, global_search_value_R);
		
		waitForElement(driver, global_edit_btn);
		click(driver, global_edit_btn);
		Step_End(3, "Double click the rate in the global search.", test, test1);
		Step_Start(4, "Click Save button in the tool bar", test, test1);

		waitForElement(driver, Rate_SaveBtn);
		click(driver, Rate_SaveBtn);
		Step_End(4, "Click Save button in the tool bar", test, test1);

		Step_Start(5, "Click Submit.", test, test1);

		waitForElement(driver, Rate_SubmitBtn);
		click(driver, Rate_SubmitBtn);

		Step_End(5, "Click Submit.", test, test1);
		Step_Start(6, "Click Ok", test, test1);

		waitForElement(driver, Yes_Btn);
		click(driver, Yes_Btn);
		waitForElement(driver, submitted_Popup);
		String submit_popup=getText(driver, submitted_Popup);

		Step_End(6, "Click Ok", test, test1);

		if(submit_popup.equals(submit_msg)) {
			System.out.println("Matched || Expected value was : "+submit_msg+" || Actual value was : "+submit_popup);
			Extent_pass(driver, "Matched || Expected value was : "+submit_msg+" || Actual value was : "+submit_popup, test,test1);
			System.out.println("Rate Request submitted");
		}
		else {
			System.out.println("NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+submit_popup);
			Extent_fail(driver,  "NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+submit_popup, test,test1);
		}

		waitForElement(driver, Request_Status); 
		String act_Req_Status = getAttribute(driver, Request_Status,"value");
		if(req_Status_Submit.equals(act_Req_Status)) {                                                                                                                  
			System.out.println("Matched || " + " Expected Request Status is : " + req_Status_Submit + " || Actual Request Status is : " + act_Req_Status);            
			Extent_pass(driver, "Matched || " + " Expected Request Status is : " + req_Status_Submit + " || Actual Request Status is : " + act_Req_Status, test,test1);     
		}                                                                                                                                                                        
		else {                                                                                                                                                                   
			System.out.println("Not Matched || " + " Expected Request Status is : " + req_Status_Submit + " || Actual Request Status is : " + act_Req_Status);        
			Extent_fail(driver, "Not Matched || " + " Expected Request Status is : " + req_Status_Submit + " || Actual Request Status is : " + act_Req_Status, test,test1); 
		} 
		waitForElement(driver, mail_Cancel_Button);
		click(driver, mail_Cancel_Button);

		if(delete_perform.equalsIgnoreCase("Yes")) {
			Extent_call(test, test1, "Rate request Delete Started");

			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
moduleNavigate(driver, Module_SRR_Gate);

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
			sendKeys(driver, filter_Inputfield, Act_ReqNo);
			enter(driver);

			waitForElement(driver, select_Actual_ReqNo);
			String submitted_ReqNum1=getText(driver, select_Actual_ReqNo);
			if(submitted_ReqNum1.equals(Act_ReqNo)) {
				System.out.println("Matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value is : " + submitted_ReqNum1);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + Act_ReqNo + " || ActualValue is : " + submitted_ReqNum1,test,test1);
				Extent_pass(driver, Act_ReqNo+"  is submitted", test,test1);
				System.out.println(Act_ReqNo+" is submitted");
				waitForElement(driver, select_Actual_ReqNo);
				click(driver, select_Actual_ReqNo);
				waitForElement(driver, select_Actual_ReqNo);
				RightClick(driver, select_Actual_ReqNo);
				waitForElement(driver, moveTo_Pending);
				click(driver, moveTo_Pending);
				waitForElement(driver, close_Moved_Pending_Popup);
				click(driver, close_Moved_Pending_Popup);
			}else {
				System.out.println("Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value  is : " + submitted_ReqNum1);
				System.out.println(Act_ReqNo+" is not submitted");
				extent_fail(driver, Act_ReqNo+" Error is not displayed", test,test1);
				Extent_fail(driver,"Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value is : " + submitted_ReqNum1,test,test1);
				
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
			sendKeys(driver, filter_Inputfield, Act_ReqNo);
			enter(driver);

			waitForElement(driver, select_Actual_ReqNo);
			String pending_ReqNum1=getText(driver, select_Actual_ReqNo);
			if(pending_ReqNum1.equals(Act_ReqNo)) {
				System.out.println("Matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value is : " + pending_ReqNum1);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + Act_ReqNo + " || ActualValue is : " + pending_ReqNum1,test,test1);

				waitForElement(driver, select_Actual_ReqNo);
				click(driver, select_Actual_ReqNo);
				waitForElement(driver, select_Actual_ReqNo);
				doubleClick(driver, select_Actual_ReqNo);
				waitForElement(driver, delete_Button_Toolbar);
				click(driver, delete_Button_Toolbar);
				waitForElement(driver, delete_Request_Popup);
				click(driver, delete_Request_Popup_Ok);

				waitForElement(driver, comment_Ok_Button);
				click(driver, comment_Ok_Button);
				waitForElement(driver, delete_Button_Toolbar);

				Extent_pass(driver, Act_ReqNo+"  is Deleted", test,test1);
				System.out.println(Act_ReqNo+" is Deleted");
			}else {
				System.out.println("Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value  is : " + pending_ReqNum1);
				System.out.println(Act_ReqNo+" is not Deleted");
				extent_fail(driver, Act_ReqNo+" is not Deleted", test,test1);
				Extent_fail(driver,"Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value is : " + pending_ReqNum1,test,test1);
			}	
			Extent_call(test, test1, "Rate request Delete Ended");
			waitForElement(driver, srrGate_Module);
			click(driver, srrGate_Module);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		waitForElement(driver, close_Tab);
		click(driver, close_Tab);

		Extent_completed(testCaseName11, test, test1);
		Extent_completed(testCaseName, test, test1);
	}
}
