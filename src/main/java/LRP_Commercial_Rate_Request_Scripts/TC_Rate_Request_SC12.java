package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC12 extends Keywords{

	public void rate_Request_Sc12(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){
		
		String testcase_Name="TC_Rate_Request_SC12";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		String username = data.get("Username");
		String password = data.get("Password");
		String search_module = data.get("Search_module");
		String delivery=data.get("Delivery");
		String commodity2=data.get("commodity2");
		String Eqp_Quantity_Input =data.get("Eqp_Quantity_Input");
		String DG_checkboxs = data.get("DG_checkboxs");
		String NOR_checkbox = data.get("NOR_checkbox");
		String SOC_checkbox = data.get("SOC_checkbox");
		String OOG_checkbox = data.get("OOG_checkbox");
		String agencyUser = data.get("AgencyUser");
		String routing_Origin = data.get("Routing_Origin");
		String routing_Service = data.get("Routing_Service");
		
		String From_Date_Input =data.get( "From_Date_Input");
		String To_Date_Input =data.get( "To_Date_Input");
		String delete_perform =data.get( "Delete_perform");
		String customerCode_Option =data.get( "CustomerCode_Option");
		String condition_Option =data.get( "Condition_Option");
		String customerCode =data.get( "CustomerCode");
		String datePicker =data.get( "DatePicker");
		String service =data.get( "Service");
		String Origin_Input=data.get("Origin_Input");
		String Commodity_Input_Txt=data.get("Commodity_Input");
		String Eqp_Type_Input=data.get("Eqp_Type_Input");	
		String Gross_Weight_Input=data.get("Gross_Weight_Input");
		String Length_Field_Input=data.get("Length_Field_Input");
		String Width_Field_Input=data.get("Width_Field_Input");
		String Height_Field_Input=data.get("Height_Field_Input");
		String Exp_Det_Days_Input=data.get("Exp_Det_Days_Input");
		String Imp_Det_Days_Input=data.get("Imp_Det_Days_Input");
		String Exp_Demmurage_Input=data.get("Exp_Demmurage_Input");
		String Imp_Demmurage_Input=data.get("Imp_Demmurage_Input");
		String OFR_Txt_Field_Input=data.get("OFR_Txt_Field_Input");
		String Req_Submit_Popup_Txt=data.get("Req_Submit_Popup_Txt");
		String Rate_Req_Submitted_Popup_Txt=data.get("Rate_Req_Submitted_Popup_Txt");
		String Req_Status_Exp=data.get("Req_Status_Exp");
		String From_Date_Input_Edit=data.get("From_Date_Input_Edit");
		String To_Date_Input_Edit=data.get("To_Date_Input_Edit");
		
		String search_type2=data.get("search_type2");
		String input2=data.get("input2");
		String search_type3=data.get("search_type3");
		String input3=data.get("input3");
		
		String Module_SRR_Gate=data.get("Module_SRR_Gate");
		String	port_Pair=data.get("Origin_Input");
		String	Pre_Carriage_Radiobtn = data.get("pre_Carriage_Radiobtn");
		String	On_Carriage_Radiobtn = data.get("on_Carriage_Radiobtn");
	
		
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
		String added_portpair =  String.format(Rate_Request_Loactors.portPair,  port_Pair); 

		
		String	Request_Input=data.get("Request_Type_Input");
		String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);

		
		navigateUrl(driver, url);
		
		Extent_Start(testcase_Name, test, test1);

		//Login
		
		LRP_Login(driver, username, password);
		
		//Switch User
		
		SwitchProfile(driver, agencyUser);

		moduleNavigate(driver, search_module);
		
		Step_Start(1, "Click on the new button in the toolbar", test, test1);
		waitForElement(driver, Rate_Newbutton);
		click(driver,Rate_Newbutton);
		Step_End(1, "Click on the new button in the toolbar", test, test1);

		waitForElement(driver, Requet_Type);
		click(driver,Requet_Type);
		waitForElement(driver, Request_Type_Locator);
		click(driver, Request_Type_Locator);


		Step_Start(2, "Enter the customer name", test, test1);
		
		
		waitForElement(driver, Customer_Name_search_button);
	   click(driver, Customer_Name_search_button);
	   globalValueSearchWindow1(driver, condition_Option, customerCode_Option, customerCode, search_type2, input2, search_type3, input3);
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
		
		Step_Start(3, "Enter the origin", test, test1);
		waitForElement(driver, Orgin_Input);
		sendKeys(driver, Orgin_Input, Origin_Input);
		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);
		Step_End(3, "Enter the origin", test, test1);

		Step_Start(4, "Enter the Delivery", test, test1);
		waitForElement(driver, Delivery_Input_Field);
		sendKeys(driver, Delivery_Input_Field,delivery );
		click(driver, Auto_Panel_First);
		
//		click(driver, selectDelivery_name);
		Step_End(4, "Enter the Delivery", test, test1);

		// Selecting the From Date
		waitForElement(driver, Dateclick);
			click(driver, Dateclick);
			if(datePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Dateclick, From_Date_Input);
				
			}
		 else {
			waitForElement(driver, Dateclick);
			clearAndType(driver, Dateclick, From_Date_Input);
		}
		// Selecting the to Date
				waitForElement(driver, Dateclick1);
					click(driver, Dateclick1);
					if(datePicker.equalsIgnoreCase("Yes")) {

						selectDatePicker(driver, Dateclick1, To_Date_Input);
						
					}
				 else {
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
		sendKeys(driver, Eqp_Type, Eqp_Type_Input);
		System.out.println("Eqp type:"+Eqp_Type_Input);
		waitForElement(driver, Auto_Panel_First);
		click(driver, Auto_Panel_First);
		
		Step_End(6, "Enter the Equipment type", test, test1);
		Step_Start(7, "Enter the Quantity", test, test1);
		waitForElement(driver, Eqp_Quantity);
		click(driver, Eqp_Quantity);
		Newclear(driver, Eqp_Quantity);
		Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
		Step_End(7, "Enter the Quantity", test, test1);

		Step_Start(8, "Enter the Gross Weight", test, test1);
		waitForElement(driver, Gross_Weight);
		click(driver, Gross_Weight);
		Newclear(driver, Gross_Weight);
		waitForElement(driver, Gross_Weight);
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


//		//RadioButton
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
			clearAndType(driver, Exp_Days, Exp_Det_Days_Input);
		}
		if(isdisplayed(driver, Imp_Days)&&isElementAccessible(driver, Imp_Days)) {
			clearAndType(driver, Imp_Days, Imp_Det_Days_Input);
		}
		if(isdisplayed(driver, Exp_Demurage)&&isElementAccessible(driver, Exp_Demurage)) {
			clearAndType(driver, Exp_Demurage, Exp_Demmurage_Input);
		}
		if(isdisplayed(driver, Imp_Demurage)&&isElementAccessible(driver, Imp_Demurage)) {
			clearAndType(driver, Imp_Demurage, Imp_Demmurage_Input);
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
			Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
			System.out.println(actRoutingFrame+" is not displayed");
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
			
		}
			Step_Start(13, "Double click on the added port pair.", test, test1);
			waitForElement(driver, added_portpair);
			doubleClick(driver, added_portpair);
			Step_End(13, "Double click on the added port pair.", test, test1);
			
//			scrollTop(driver);
			Step_Start(14, "Change the details above added previously", test, test1);
			waitForElement(driver, Rate_edit_btn);
			if(IsElementEnabled(driver, Rate_edit_btn)) {
				System.out.println("Edit button is enabled");
				clear(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, commodity2);
				enter(driver);
				
					waitForElement(driver, Dateclick);
					click(driver, Dateclick);
					waitForElement(driver, Dateclick);

					if(datePicker.equalsIgnoreCase("Yes")) {
						
						selectDatePicker(driver, Dateclick, From_Date_Input);
					}
				 else {
					waitForElement(driver, Dateclick);
					clearAndType(driver, Dateclick, From_Date_Input);
				}
				
					
				
				// Selecting the to Date
							waitForElement(driver, Dateclick1);
							click(driver, Dateclick1);
							waitForElement(driver, Dateclick1);

							if(datePicker.equalsIgnoreCase("Yes")) {

								selectDatePicker(driver, Dateclick1, To_Date_Input_Edit);
							}
						 else {
							waitForElement(driver, Dateclick1);
							clearAndType(driver, Dateclick1, To_Date_Input_Edit);
						}
				Step_End(14, "Change the details above added previously", test, test1);
							
				Step_Start(15, "Click Edit.", test, test1);

				waitForElement(driver, Rate_edit_btn);
				click(driver, Rate_edit_btn);
				Step_End(15, "Click Edit.", test, test1);
			}
			else {
				System.out.println("Edit button is not enabled");
			}
			
			waitForElement(driver, Commodity_Input);
 			String actualCommodity=getAttribute(driver, Commodity_Input, "value");
			if(actualCommodity.contains(commodity2)) {
				
				Extent_pass(driver, "Matched || Expected Commodity:"+commodity2+" || Actual Commodity: "+actualCommodity, test, test1);
				System.out.println("Matched || Expected Commodity:"+commodity2+" || Actual Commodity: "+actualCommodity);
			}else {
				System.out.println("Not Matched || Expected Commodity:"+commodity2+" || Actual Commodity: "+actualCommodity);
				Extent_fail(driver, "Not Matched || Expected Commodity:"+commodity2+" || Actual Commodity: "+actualCommodity, test, test1);

			}
			
			waitForElement(driver, Dateclick);
			String actualFromDate=getAttribute(driver, Dateclick, "value");
			if(actualFromDate.equals(From_Date_Input_Edit)) {
				
				Extent_pass(driver, "Matched || Expected From Date:"+From_Date_Input_Edit+" || Actual From Date: "+actualFromDate, test, test1);
				System.out.println("Matched || Expected From Date:"+From_Date_Input_Edit+" || Actual From Date: "+actualFromDate);
			}else {
				System.out.println("Not Matched || Expected From Date:"+From_Date_Input_Edit+" || Actual From Date: "+actualFromDate);
				Extent_fail(driver, "Not Matched || Expected From Date:"+From_Date_Input_Edit+" || Actual From Date: "+actualFromDate, test, test1);
			}
			
			waitForElement(driver, Dateclick1);
			String actualToDate=getAttribute(driver, Dateclick1, "value");
			System.out.println(actualToDate);
//			if(actualToDate.equals(To_Date_Input_Edit)) {
//				
//				Extent_pass(driver, "Matched || Expected To Date:"+To_Date_Input_Edit+" || Actual To Date: "+actualToDate, test, test1);
//				System.out.println("Matched || Expected To Date:"+To_Date_Input_Edit+" || Actual To Date: "+actualToDate);
//			}else {
//				System.out.println("Not Matched || Expected To Date:"+To_Date_Input_Edit+" || Actual To Date: "+actualToDate);
//				Extent_fail(driver, "Not Matched || Expected To Date:"+To_Date_Input_Edit+" || Actual To Date: "+actualToDate, test, test1);
//			}
			
			Step_Start(16, "Click Save button in the tool bar", test, test1);
			waitForElement(driver, Rate_SaveBtn);
			click(driver, Rate_SaveBtn);
			Step_End(16, "Click Save button in the tool bar", test, test1);

			waitForElement(driver, Rate_Sub_Popup_Msg);                                                                                                                                
			String PopUp_Msg=getText(driver, Rate_Sub_Popup_Msg);                                                                                                            
			if(Req_Submit_Popup_Txt.equals(PopUp_Msg)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg, test, test1);     
				Step_Start(17, "Click submit", test, test1);
				waitForElement(driver, Rate_SubmitBtn);
				click(driver, Rate_SubmitBtn);
				Step_End(17, "Click submit", test, test1);

				Step_Start(18, "Click Ok", test, test1);
				waitForElement(driver, Yes_Btn);
				click(driver, Yes_Btn);
				Step_End(18, "Click Ok", test, test1);

			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg, test, test1); 
			} 

			
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
				System.out.println("Matched || " + " Expected Report Activity is : " + Req_Status_Exp + " || Actual Report Activity is : " + act_Req_Status1);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Req_Status_Exp + " || Actual Report Activity is : " + act_Req_Status1, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + Req_Status_Exp + " || Actual Report Activity is : " + act_Req_Status1);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Req_Status_Exp + " || Actual Report Activity is : " + act_Req_Status1, test,test1); 
			} 
			
			waitForElement(driver, Mail_Cancel_button);
			click(driver, Mail_Cancel_button);
			if(delete_perform.equalsIgnoreCase("Yes")) {
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
					Extent_fail(driver,"Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value is : " + submitted_ReqNum1,test,test1);
					Extent_fail(driver, Act_ReqNo+" Error is not displayed", test,test1);
					System.out.println(Act_ReqNo+" is not submitted");
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
					Extent_fail(driver,"Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value is : " + pending_ReqNum1,test,test1);
					Extent_fail(driver, Act_ReqNo+" is not Deleted", test,test1);
					System.out.println(Act_ReqNo+" is not Deleted");
				}	
				Extent_call(test, test1, "Rate request Delete Ended");
				waitForElement(driver, srrGate_Module);
				click(driver, srrGate_Module);
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
				}
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
				Extent_completed(testcase_Name, test, test1);

		
				 
}
}
