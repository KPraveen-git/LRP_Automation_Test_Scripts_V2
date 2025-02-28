package LRP_Commercial_Rate_Request_Consolidation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC07_TO_SC12 extends Keywords{
	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;
	public static String port_Pair;

	public void rate_Request_SC07_TO_SC12(WebDriver driver, ExtentTest test,ExtentTest test1, String selected_dataset) {
		
		String testCaseName="TC_Rate_Request_SC07";
		String File_Path7 = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_07 = TestNgXml.getsheetName_FromExecution().get(testCaseName);

		Map<String, String> Excel_data7 = Utils.GetAllData(Sheet_Name_07, testCaseName,"Dataset" + selected_dataset, File_Path7);
		String username=Excel_data7.get("Username");
		String password=Excel_data7.get("Password");
		String agencyUser =Excel_data7.get( "AgencyUser");

		
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

		int sc7=7;
		
		if(sc7==7) {
			String Field_Names=Excel_data7.get("Field_Names");

			String Origin_Input=Excel_data7.get("Origin_Input");
			String Delivery_Input =Excel_data7.get("Dehlivery_Input");
			String Commodity_Input_Txt=Excel_data7.get("Commodity_Input");
			String Eqp_Type_Input=Excel_data7.get("Eqp_Type_Input");	
			String Eqp_Quantity_Input=Excel_data7.get("Eqp_Quantity_Input");
			String Gross_Weight_Input=Excel_data7.get("Gross_Weight_Input");
			String Length_Field_Input=Excel_data7.get("Length_Field_Input");
			String Width_Field_Input=Excel_data7.get("Width_Field_Input");
			String Height_Field_Input=Excel_data7.get("Height_Field_Input");
			String Exp_Det_Days_Input=Excel_data7.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input=Excel_data7.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input=Excel_data7.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input=Excel_data7.get("Imp_Demmurage_Input");
			String OFR_Txt_Field_Input=Excel_data7.get("OFR_Txt_Field_Input");
			String Req_Submit_Popup_Txt=Excel_data7.get("Req_Submit_Popup_Txt");
			String Rate_Req_Submitted_Popup_Txt=Excel_data7.get("Rate_Req_Submitted_Popup_Txt");
			String Req_Status_Exp=Excel_data7.get("Req_Status_Exp");
			
			String Module_SRR_Gate=Excel_data7.get("Module_SRR_Gate");
			String DG_checkboxs = Excel_data7.get("DG_checkboxs");
			String NOR_checkbox = Excel_data7.get("NOR_checkbox");
			String SOC_checkbox = Excel_data7.get("SOC_checkbox");
			String OOG_checkbox = Excel_data7.get("OOG_checkbox");
			
			String From_Date_Input =Excel_data7.get( "From_Date_Input");
			String To_Date_Input =Excel_data7.get( "To_Date_Input");
			String delete_perform =Excel_data7.get( "Delete_perform");
			String customerCode_Option =Excel_data7.get( "CustomerCode_Option");
			String condition_Option =Excel_data7.get( "Condition_Option");
			String customerCode =Excel_data7.get( "CustomerCode");
			String datePicker =Excel_data7.get( "DatePicker");
			String service =Excel_data7.get( "Service");
			String routing_Origin = Excel_data7.get("Routing_Origin");
			String routing_Service = Excel_data7.get("Routing_Service");
			String Request_Input=Excel_data7.get("Request_Type_Input");

			Pre_Carriage_Radiobtn = Excel_data7.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = Excel_data7.get("on_Carriage_Radiobtn");
			tService=Excel_data7.get("T_Service");
			TOS=Excel_data7.get("TOS_Option");
			
			
			Extent_Start(testCaseName, test, test1);	
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
			String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);

			
			waitForElement(driver, Module_SearchR);
			click(driver,Module_SearchR);
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, Field_Names);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);
			waitForElement(driver, Rate_Request_Page);
			if(isDisplayed(driver, Rate_Request_Page)) {
				System.out.println("Rate Request Module is Dispalyed");
				Extent_pass(driver, "Rate Request Module is Dispalyed", test,test1);
			}else {
				System.out.println("Rate Request Module is not Dispalyed");
				Extent_fail(driver, "Rate Request Module is not Dispalyed", test,test1);
			}
			Step_Start(1, "Click on the new button in the toolbar", test, test1);
			waitForElement(driver, Rate_Newbutton);
			click(driver,Rate_Newbutton);
			Step_End(1, "Click on the new button in the toolbar", test, test1);

			Step_Start(2, "Select the Reefer request type.", test, test1);
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
			
			
			Step_Start(3, "Enter the customer name", test, test1);
			
			
			waitForElement(driver, Customer_Name_search_button);
		   click(driver, Customer_Name_search_button);
		   waitForElement(driver, Customer_Code_Select_dropdown);
		   click(driver, Customer_Code_Select_dropdown);
		   selectByText(driver, Customer_Code_Select_dropdown, customerCode_Option);
			click(driver, CustomerSearch_Condition_Dropdown1);
			selectByText(driver, CustomerSearch_Condition_Dropdown1, condition_Option);
			waitForElement(driver, CustomerSearch_InputTextfield1);
			sendKeys(driver, CustomerSearch_InputTextfield1, customerCode);
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
			}
			
			Step_End(3, "Enter the customer name", test, test1);
			waitForDisplay(driver, exit_Button);
			if(isDisplayed(driver, exit_Button)) {
				waitForElement(driver, exit_Button);
				click(driver, exit_Button);
			}

			Step_Start(4, "Enter the origin", test, test1);
			waitForElement(driver, Orgin_Input);
			sendKeys(driver, Orgin_Input, Origin_Input);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			Step_End(4, "Enter the origin", test, test1);

			Step_Start(5, "Enter the Delivery", test, test1);
			waitForElement(driver, Delivery_Input_Field);
			sendKeys(driver, Delivery_Input_Field,Delivery_Input );
			click(driver, Auto_Panel_First);
			
			Step_End(5, "Enter the Delivery", test, test1);

			// Selecting the From Date
			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();
			waitForElement(driver, Dateclick);
				click(driver, Dateclick);
				if(datePicker.equalsIgnoreCase("Yes")) {
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
					String dateSelect =String.format(date_select, day);
					waitForElement(driver, dateSelect);
					click(driver, dateSelect);
				}
			 else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
					waitForElement(driver, Dateclick1);
						click(driver, Dateclick1);
						if(datePicker.equalsIgnoreCase("Yes")) {

						datePicker(To_Date_Input, day, month, year);
						waitForElement(driver, Month_DD);
						selectByText(driver, Month_DD,month.toString());
						waitForElement(driver, Year_DD);
						selectByText(driver, Year_DD,year.toString());
						String dateSelect =String.format(date_select, day);
							waitForElement(driver, dateSelect);
							click(driver, dateSelect);
						}
					 else {
						waitForElement(driver, Dateclick1);
						clearAndType(driver, Dateclick1, To_Date_Input);
					}
			
					click(driver, service_Textfield);
					clearAndType(driver, service_Textfield, service);
					
			Step_Start(6, "Enter the Commodity", test, test1);
			waitForElement(driver, Commodity_Input);
			sendKeys(driver, Commodity_Input, Commodity_Input_Txt);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(6, "Enter the Commodity", test, test1);

			Step_Start(7, "Enter the Equipment type", test, test1);
			waitForElement(driver, Eqp_Type);
			click(driver, Eqp_Type);
			sendKeys(driver, Eqp_Type, Eqp_Type_Input);
			System.out.println("Eqp type:"+Eqp_Type_Input);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(7, "Enter the Equipment type", test, test1);
			Step_Start(8, "Enter the Quantity", test, test1);
			waitForElement(driver, Eqp_Quantity);
			clear(driver, Eqp_Quantity);
			waitForElement(driver, Eqp_Quantity);
			click(driver, Eqp_Quantity);
			sendKeys(driver, Eqp_Quantity, Eqp_Quantity_Input);
			Step_End(8, "Enter the Quantity", test, test1);

			Step_Start(9, "Enter the Gross Weight", test, test1);
			waitForElement(driver, Gross_Weight);
			click(driver, Gross_Weight);
			Newclear(driver, Gross_Weight);
			Actionsendkeys(driver, Gross_Weight, Gross_Weight_Input);
			Step_End(9, "Enter the Gross Weight", test, test1);

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


//			//RadioButton
			if(!Pre_Carriage_Radiobtn.equals("")) {
			waitForElement(driver, preCarriageLocator);
			click(driver, preCarriageLocator);
			}
			if(!On_Carriage_Radiobtn.equals("")) {

			waitForElement(driver, onCarriageLocator);
			click(driver, onCarriageLocator);
			}


			waitForElement(driver, Exp_Days);
			sendKeys(driver, Exp_Days, Exp_Det_Days_Input);

			waitForElement(driver, Imp_Days);
			sendKeys(driver, Imp_Days, Imp_Det_Days_Input);

			waitForElement(driver, Exp_Demurage);
			sendKeys(driver, Exp_Demurage, Exp_Demmurage_Input);

			waitForElement(driver, Imp_Demurage);
			sendKeys(driver, Imp_Demurage, Imp_Demmurage_Input);

			Step_Start(10, "Click routing", test, test1);
			waitForElement(driver, Routing_Button);
			click(driver, Routing_Button);
			Step_End(10, "Click routing", test, test1);

			Step_Start(11, "Select the routing", test, test1);
			
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
			
			Step_End(11, "Select the routing", test, test1);

			Step_Start(12, "Enter the OFR", test, test1);
			waitForElement(driver, OFR_Txt_Field);
			clear(driver, OFR_Txt_Field);
			sendKeys(driver, OFR_Txt_Field, OFR_Txt_Field_Input);
			System.out.println("OFR Value:"+OFR_Txt_Field_Input);
			Step_End(12, "Enter the OFR", test, test1);

			Step_Start(13, "Click Add", test, test1);
			waitForElement(driver, Rate_AddBtn);
			click(driver, Rate_AddBtn);
			Step_End(13, "Click Add", test, test1);

			Step_Start(14, "Click Save button in the tool bar", test, test1);
			waitForElement(driver, Rate_SaveBtn);
			click(driver, Rate_SaveBtn);
			Step_End(14, "Click Save button in the tool bar", test, test1);

			waitForElement(driver, Rate_Sub_Popup_Msg);                                                                                                                                
			String PopUp_Msg=getText(driver, Rate_Sub_Popup_Msg);                                                                                                            
			if(Req_Submit_Popup_Txt.equals(PopUp_Msg)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg, test, test1);     
				Step_Start(15, "Click submit", test, test1);
				waitForElement(driver, Rate_SubmitBtn);
				click(driver, Rate_SubmitBtn);
				Step_End(15, "Click submit", test, test1);

				Step_Start(16, "Click Ok", test, test1);
				waitForElement(driver, Yes_Btn);
				click(driver, Yes_Btn);
				Step_End(16, "Click Ok", test, test1);

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
				System.out.println("Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1);            
				Extent_pass(driver, "Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1);        
				Extent_fail(driver, "Not Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1, test,test1); 
			} 
			
			String actualRequestType=getText(driver, Requet_Type);
			if(Request_Input.equals(actualRequestType)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Rate Request Type  is : " + Request_Input + " || Actual Rate Request Type  is : " + actualRequestType);            
				Extent_pass(driver, "Matched || " + " Expected Rate Request Type  is : " + Request_Input + " || Actual Rate Request Type  is : " + actualRequestType, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Rate Request Type is : " + Request_Input + " || Actual Rate Request Type  is : " + actualRequestType);        
				Extent_fail(driver, "Not Matched || " + " Expected Rate Request Type  is : " + Request_Input + " || Actual Rate Request Type  is : " + actualRequestType, test,test1); 
			} 
			
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
					System.out.println(Act_ReqNo+" is not submitted");
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
			Extent_completed(testCaseName, test, test1);
			
			
		}
		
		boolean sc8=true;
		
		if(sc8==true) {
			Extent_Start("TC_Rate_Request_SC08", test, test1);	

			String testCaseName8="TC_Rate_Request_SC08";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName8);
			String Sheet_Name_08 = TestNgXml.getsheetName_FromExecution().get(testCaseName8);

			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_08, testCaseName8,"Dataset" + selected_dataset, File_Path);
			String Field_Names=Excel_data.get("Field_Names");
			String Origin_Input=Excel_data.get("Origin_Input");
			String Delivery_Input =Excel_data.get("Dehlivery_Input");
			String Commodity_Input_Txt=Excel_data.get("Commodity_Input");
			String Eqp_Type_Input=Excel_data.get("Eqp_Type_Input");	
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
			String Req_Status_Exp=Excel_data.get("Req_Status_Exp");
			
			String Module_SRR_Gate=Excel_data.get("Module_SRR_Gate");
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
			String datePicker =Excel_data.get( "DatePicker");
			String service =Excel_data.get( "Service");
			
			String routing_Origin = Excel_data.get("Routing_Origin");
			String routing_Service = Excel_data.get("Routing_Service");
			String Request_Input=Excel_data.get("Request_Type_Input");

			Pre_Carriage_Radiobtn = Excel_data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = Excel_data.get("on_Carriage_Radiobtn");
			tService=Excel_data.get("T_Service");
			TOS=Excel_data.get("TOS_Option");
			
			Extent_Start(testCaseName8, test, test1);	

			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
			String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);

			
			waitForElement(driver, Module_SearchR);
			click(driver,Module_SearchR);
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, Field_Names);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);
			waitForElement(driver, Rate_Request_Page);
			if(isDisplayed(driver, Rate_Request_Page)) {
				System.out.println("Rate Request Module is Dispalyed");
				Extent_pass(driver, "Rate Request Module is Dispalyed", test,test1);
			}else {
				System.out.println("Rate Request Module is not Dispalyed");
				Extent_fail(driver, "Rate Request Module is not Dispalyed", test,test1);
			}
			Step_Start(1, "Click on the new button in the toolbar", test, test1);
			waitForElement(driver, Rate_Newbutton);
			click(driver,Rate_Newbutton);
			Step_End(1, "Click on the new button in the toolbar", test, test1);

			Step_Start(2, "Select the Reefer request type.", test, test1);
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

			Step_Start(3, "Enter the customer name", test, test1);
			
			
			waitForElement(driver, Customer_Name_search_button);
		   click(driver, Customer_Name_search_button);
		   waitForElement(driver, Customer_Code_Select_dropdown);
		   click(driver, Customer_Code_Select_dropdown);
		   selectByText(driver, Customer_Code_Select_dropdown, customerCode_Option);
			click(driver, CustomerSearch_Condition_Dropdown1);
			selectByText(driver, CustomerSearch_Condition_Dropdown1, condition_Option);
			waitForElement(driver, CustomerSearch_InputTextfield1);
			sendKeys(driver, CustomerSearch_InputTextfield1, customerCode);
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
			}
			
			Step_End(3, "Enter the customer name", test, test1);
			waitForDisplay(driver, exit_Button);
			if(isDisplayed(driver, exit_Button)) {
				waitForElement(driver, exit_Button);
				click(driver, exit_Button);
			}

			Step_Start(4, "Enter the origin", test, test1);
			waitForElement(driver, Orgin_Input);
			sendKeys(driver, Orgin_Input, Origin_Input);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			Step_End(4, "Enter the origin", test, test1);

			Step_Start(5, "Enter the Delivery", test, test1);
			waitForElement(driver, Delivery_Input_Field);
			sendKeys(driver, Delivery_Input_Field,Delivery_Input );
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(5, "Enter the Delivery", test, test1);

			// Selecting the From Date
					StringBuilder day = new StringBuilder();
					StringBuilder month = new StringBuilder();
					StringBuilder year = new StringBuilder();
					waitForElement(driver, Dateclick);
						click(driver, Dateclick);
						if(datePicker.equalsIgnoreCase("Yes")) {
						datePicker(From_Date_Input, day, month, year);
						waitForElement(driver, Month_DD);
						selectByText(driver, Month_DD,month.toString());
						waitForElement(driver, Year_DD);
						selectByText(driver, Year_DD,year.toString());
							String dateSelect =String.format(date_select, day);
							waitForElement(driver, dateSelect);
							click(driver, dateSelect);
						}
					 else {
						waitForElement(driver, Dateclick);
						clearAndType(driver, Dateclick, From_Date_Input);
					}
					// Selecting the to Date
							waitForElement(driver, Dateclick1);
								click(driver, Dateclick1);
								if(datePicker.equalsIgnoreCase("Yes")) {

								datePicker(To_Date_Input, day, month, year);
								waitForElement(driver, Month_DD);
								selectByText(driver, Month_DD,month.toString());
								waitForElement(driver, Year_DD);
								selectByText(driver, Year_DD,year.toString());
								String dateSelect =String.format(date_select, day);
									waitForElement(driver, dateSelect);
									click(driver, dateSelect);
								}
							 else {
								waitForElement(driver, Dateclick1);
								clearAndType(driver, Dateclick1, To_Date_Input);
							}
					
			
					click(driver, service_Textfield);
					clearAndType(driver, service_Textfield, service);
					
			Step_Start(6, "Enter the Commodity", test, test1);
			waitForElement(driver, Commodity_Input);
			sendKeys(driver, Commodity_Input, Commodity_Input_Txt);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(6, "Enter the Commodity", test, test1);

			Step_Start(7, "Enter the Equipment type", test, test1);
			waitForElement(driver, Eqp_Type);
			click(driver, Eqp_Type);
			sendKeys(driver, Eqp_Type, Eqp_Type_Input);
			System.out.println("Eqp type:"+Eqp_Type_Input);

			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(7, "Enter the Equipment type", test, test1);
			Step_Start(8, "Enter the Quantity", test, test1);
			waitForElement(driver, Eqp_Quantity);
			clear(driver, Eqp_Quantity);
			waitForElement(driver, Eqp_Quantity);
			click(driver, Eqp_Quantity);
			sendKeys(driver, Eqp_Quantity, Eqp_Quantity_Input);
			Step_End(8, "Enter the Quantity", test, test1);

			Step_Start(9, "Enter the Gross Weight", test, test1);
			waitForElement(driver, Gross_Weight);
			click(driver, Gross_Weight);
			Newclear(driver, Gross_Weight);
			Actionsendkeys(driver, Gross_Weight, Gross_Weight_Input);
			Step_End(9, "Enter the Gross Weight", test, test1);

			// CheckBox
			Step_Start(10, "Click on the NOR check box", test, test1);
			waitForElement(driver, DG_checkbox);
			checkBox(driver, DG_checkbox, DG_checkboxs);
			waitForElement(driver, oog_checkbox);
			checkBox(driver, oog_checkbox, OOG_checkbox);
			waitForElement(driver, norCheckBox); 
			checkBox(driver, norCheckBox, NOR_checkbox);
			waitForElement(driver, soc_checkbox); 
			checkBox(driver, soc_checkbox, SOC_checkbox);

			Step_End(10, "Click on the NOR check box", test, test1);
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


//			//RadioButton
			if(!Pre_Carriage_Radiobtn.equals("")) {
			waitForElement(driver, preCarriageLocator);
			click(driver, preCarriageLocator);
			}
			if(!On_Carriage_Radiobtn.equals("")) {

			waitForElement(driver, onCarriageLocator);
			click(driver, onCarriageLocator);
			}


			waitForElement(driver, Exp_Days);
			sendKeys(driver, Exp_Days, Exp_Det_Days_Input);

			waitForElement(driver, Imp_Days);
			sendKeys(driver, Imp_Days, Imp_Det_Days_Input);

			waitForElement(driver, Exp_Demurage);
			sendKeys(driver, Exp_Demurage, Exp_Demmurage_Input);

			waitForElement(driver, Imp_Demurage);
			sendKeys(driver, Imp_Demurage, Imp_Demmurage_Input);

			Step_Start(11, "Click routing", test, test1);
			waitForElement(driver, Routing_Button);
			click(driver, Routing_Button);
			
			Step_End(11, "Click routing", test, test1);

			Step_Start(12, "Select the routing", test, test1);
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
			
			Step_End(12, "Select the routing", test, test1);

			Step_Start(13, "Enter the OFR", test, test1);
			waitForElement(driver, OFR_Txt_Field);
			clear(driver, OFR_Txt_Field);
			sendKeys(driver, OFR_Txt_Field, OFR_Txt_Field_Input);
			System.out.println("OFR Value:"+OFR_Txt_Field_Input);
			Step_End(13, "Enter the OFR", test, test1);

			Step_Start(14, "Click Add", test, test1);
			waitForElement(driver, Rate_AddBtn);
			click(driver, Rate_AddBtn);
			Step_End(14, "Click Add", test, test1);

			Step_Start(15, "Click Save button in the tool bar", test, test1);
			waitForElement(driver, Rate_SaveBtn);
			click(driver, Rate_SaveBtn);
			Step_End(15, "Click Save button in the tool bar", test, test1);

			waitForElement(driver, Rate_Sub_Popup_Msg);                                                                                                                                
			String PopUp_Msg=getText(driver, Rate_Sub_Popup_Msg);                                                                                                            
			if(Req_Submit_Popup_Txt.equals(PopUp_Msg)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg, test, test1);     
				Step_Start(16, "Click submit", test, test1);
				waitForElement(driver, Rate_SubmitBtn);
				click(driver, Rate_SubmitBtn);
				Step_End(16, "Click submit", test, test1);

				Step_Start(17, "Click Ok", test, test1);
				waitForElement(driver, Yes_Btn);
				click(driver, Yes_Btn);
				Step_End(17, "Click Ok", test, test1);

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
				System.out.println("Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1);            
				Extent_pass(driver, "Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1);        
				Extent_fail(driver, "Not Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1, test,test1); 
			} 
			
			String actualRequestType=getText(driver, Requet_Type);
			if(Request_Input.equals(actualRequestType)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Rate Request Type  is : " + Request_Input + " || Actual Rate Request Type  is : " + actualRequestType);            
				Extent_pass(driver, "Matched || " + " Expected Rate Request Type  is : " + Request_Input + " || Actual Rate Request Type  is : " + actualRequestType, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Rate Request Type is : " + Request_Input + " || Actual Rate Request Type  is : " + actualRequestType);        
				Extent_fail(driver, "Not Matched || " + " Expected Rate Request Type  is : " + Request_Input + " || Actual Rate Request Type  is : " + actualRequestType, test,test1); 
			} 
			
			String actualNOR_CheckBoxStatus=getAttribute(driver, norCheckBox, "class");
			if(actualNOR_CheckBoxStatus.contains("active")) {
				System.out.println("Matched ||After Rate Request Submitted the NOR Checkbox is selected status");
				Extent_pass(driver, "Matched ||After Rate Request Submitted the NOR Checkbox is selected status", test, test1);
			}else {
				System.out.println("Not Matched ||After Rate Request Submitted the NOR Checkbox is not selected status");
				Extent_fail(driver, "Not Matched ||After Rate Request Submitted the NOR Checkbox is not selected status", test, test1);
			}
			
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
					System.out.println(Act_ReqNo+" is not submitted");
					Extent_fail(driver,"Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value is : " + submitted_ReqNum1,test,test1);
					extent_fail(driver, Act_ReqNo+" Error is not displayed", test,test1);
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
					Extent_fail(driver, Act_ReqNo+" is not Deleted", test,test1);
					System.out.println("Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value  is : " + pending_ReqNum1);
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
			Extent_completed(testCaseName8, test, test1);
			
		}
		
		boolean sc9=true;
		
		if(sc9==true) {
			
			String testCaseName9="TC_Rate_Request_SC09";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName9);
			String Sheet_Name_023 = TestNgXml.getsheetName_FromExecution().get(testCaseName9);

			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_023, testCaseName9,"Dataset" + selected_dataset, File_Path);
			String Field_Names=Excel_data.get("Field_Names");
			
			String Origin_Input=Excel_data.get("Origin_Input");
			String Delivery_Input =Excel_data.get("Dehlivery_Input");
			String Commodity_Input_Txt=Excel_data.get("Commodity_Input");
			
			String rate_Quantity_Input=Excel_data.get("Rate_Quantity_Input");
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
			String Req_Status_Exp=Excel_data.get("Req_Status_Exp");
			String Module_SRR_Gate=Excel_data.get("Module_SRR_Gate");
			String DG_checkboxs = Excel_data.get("DG_checkboxs");
			String NOR_checkbox = Excel_data.get("NOR_checkbox");
			String SOC_checkbox = Excel_data.get("SOC_checkbox");
			String OOG_checkbox = Excel_data.get("OOG_checkbox");
			String package_Input = Excel_data.get("Package_Input");
			String quantity_Input = Excel_data.get("Quantity_Input");
			String height_Input = Excel_data.get("Height_Input");
			String width_Input = Excel_data.get("Width_Input");
			String length_Input = Excel_data.get("Length_Input");
			String gr_Wt_Input = Excel_data.get("Gr_Wt_Input");
			String rate_Calc_Type = Excel_data.get("Rate_Calc_Type");
			String routing_Origin = Excel_data.get("Routing_Origin");
			String routing_Service = Excel_data.get("Routing_Service");

			String From_Date_Input =Excel_data.get( "From_Date_Input");
			String To_Date_Input =Excel_data.get( "To_Date_Input");
			String delete_perform =Excel_data.get( "Delete_perform");
			String customerCode_Option =Excel_data.get( "CustomerCode_Option");
			String condition_Option =Excel_data.get( "Condition_Option");
			String customerCode =Excel_data.get( "CustomerCode");
			String datePicker = Excel_data.get("DatePicker");
			String rateType=Excel_data.get("RateType");
			String service =Excel_data.get( "Service");
			 
			
			Pre_Carriage_Radiobtn = Excel_data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = Excel_data.get("on_Carriage_Radiobtn");
			tService=Excel_data.get("T_Service");
			TOS=Excel_data.get("TOS_Option");
			

			Extent_Start(testCaseName9, test, test1);	

			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
			String select_RateType=String.format(selectRateType, rateType);

			
			waitForElement(driver, Module_SearchR);
			click(driver,Module_SearchR);
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, Field_Names);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);
			waitForElement(driver, Rate_Request_Page);
			if(isDisplayed(driver, Rate_Request_Page)) {
				System.out.println("Rate Request Module is Dispalyed");
				Extent_pass(driver, "Rate Request Module is Dispalyed", test,test1);
			}else {
				System.out.println("Rate Request Module is not Dispalyed");
				Extent_fail(driver, "Rate Request Module is not Dispalyed", test,test1);
			}
			Step_Start(1, "Click on the new button in the toolbar", test, test1);
			waitForElement(driver, Rate_Newbutton);
			click(driver,Rate_Newbutton);
			Step_End(1, "Click on the new button in the toolbar", test, test1);

			Step_Start(2, "Select the Non containerised radio button", test, test1);
			
			waitForElement(driver, nonContainerized_Radiobutton);
			click(driver, nonContainerized_Radiobutton);
			
			Step_End(2, "Select the Non containerised radio button", test, test1);
			waitForElement(driver, tService_Dropdown);
			click(driver, tService_Dropdown);
			waitForElement(driver, select_t_Service);
			click(driver, select_t_Service);
			
			waitForElement(driver, TOS_Dropdown);
			click(driver, TOS_Dropdown);
			waitForElement(driver, tos);
			click(driver, tos);
			
			Step_Start(3, "Enter the customer name", test, test1);
			
			
			waitForElement(driver, Customer_Name_search_button);
		   click(driver, Customer_Name_search_button);
		   waitForElement(driver, Customer_Code_Select_dropdown);
		   click(driver, Customer_Code_Select_dropdown);
		   selectByText(driver, Customer_Code_Select_dropdown, customerCode_Option);
			click(driver, CustomerSearch_Condition_Dropdown1);
			selectByText(driver, CustomerSearch_Condition_Dropdown1, condition_Option);
			waitForElement(driver, CustomerSearch_InputTextfield1);
			sendKeys(driver, CustomerSearch_InputTextfield1, customerCode);
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
			}
			
			Step_End(3, "Enter the customer name", test, test1);
			waitForDisplay(driver, exit_Button);
			if(isDisplayed(driver, exit_Button)) {
				waitForElement(driver, exit_Button);
				click(driver, exit_Button);
			}

			Step_Start(4, "Enter the origin", test, test1);
			waitForElement(driver, Orgin_Input);
			sendKeys(driver, Orgin_Input, Origin_Input);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			Step_End(4, "Enter the origin", test, test1);

			Step_Start(5, "Enter the Delivery", test, test1);
			waitForElement(driver, Delivery_Input_Field);
			sendKeys(driver, Delivery_Input_Field,Delivery_Input );
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(5, "Enter the Delivery", test, test1);

			// Selecting the From Date
			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();
			waitForElement(driver, Dateclick);
				click(driver, Dateclick);
				if(datePicker.equalsIgnoreCase("Yes")) {
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
					String dateSelect =String.format(date_select, day);
					waitForElement(driver, dateSelect);
					click(driver, dateSelect);
				}
			 else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
					waitForElement(driver, Dateclick1);
						click(driver, Dateclick1);
						if(datePicker.equalsIgnoreCase("Yes")) {

						datePicker(To_Date_Input, day, month, year);
						waitForElement(driver, Month_DD);
						selectByText(driver, Month_DD,month.toString());
						waitForElement(driver, Year_DD);
						selectByText(driver, Year_DD,year.toString());
						String dateSelect =String.format(date_select, day);
							waitForElement(driver, dateSelect);
							click(driver, dateSelect);
						}
					 else {
						waitForElement(driver, Dateclick1);
						clearAndType(driver, Dateclick1, To_Date_Input);
					}
			
						click(driver, service_Textfield);
						clearAndType(driver, service_Textfield, service);
			Step_Start(6, "Enter the Commodity", test, test1);
			waitForElement(driver, Commodity_Input);
			sendKeys(driver, Commodity_Input, Commodity_Input_Txt);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(6, "Enter the Commodity", test, test1);

			
			waitForElement(driver, rateType_Dropdown);
			safeclick(driver, rateType_Dropdown);
			waitForElement(driver, select_RateType);
			click(driver, select_RateType);

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


//			//RadioButton
			if(!Pre_Carriage_Radiobtn.equals("")) {
			waitForElement(driver, preCarriageLocator);
			click(driver, preCarriageLocator);
			}
			if(!On_Carriage_Radiobtn.equals("")) {

			waitForElement(driver, onCarriageLocator);
			click(driver, onCarriageLocator);
			}

			
			Step_Start(7, "Enter the rate calculation type.", test, test1);

			waitForElement(driver, Rate_Calc_Type);
			clear(driver, Rate_Calc_Type);
			waitForElement(driver, Rate_Calc_Type);
			sendKeys(driver, Rate_Calc_Type, rate_Calc_Type);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(7, "Enter the rate calculation type.", test, test1);

			Step_Start(8, "Enter the Quantity", test, test1);
			waitForElement(driver, rateQty_Textfield);
			clear(driver, rateQty_Textfield);
			waitForElement(driver, rateQty_Textfield);
			sendKeys(driver, rateQty_Textfield, rate_Quantity_Input);
			Step_End(8, "Enter the Quantity", test, test1);
			Step_Start(9, "Enter the Gross Weight", test, test1);
			waitForElement(driver, Gross_Weight);
			Newclear(driver, Gross_Weight);
			Actionsendkeys(driver, Gross_Weight, Gross_Weight_Input);
			Step_End(9, "Enter the Gross Weight", test, test1);
			Step_Start(10, "Enter the dimension details", test, test1);
			
			waitForElement(driver, Add_Dimension_Btn);
			click(driver, Add_Dimension_Btn);
			
			waitForElement(driver, dimensions_Gr_Wt);
			Newclear(driver, dimensions_Gr_Wt);
			sendKeys(driver, dimensions_Gr_Wt,gr_Wt_Input );

			waitForElement(driver, Dimension_Length_Field);
			Newclear(driver, Dimension_Length_Field);
			sendKeys(driver, Dimension_Length_Field,length_Input );
			
			waitForElement(driver, Dimension_Width_Field);
			Newclear(driver, Dimension_Width_Field);
			sendKeys(driver, Dimension_Width_Field, width_Input);
			
			waitForElement(driver, Dimension_Height_Field);
			Newclear(driver, Dimension_Height_Field);
			sendKeys(driver, Dimension_Height_Field, height_Input);
			
			waitForElement(driver, Dimension_Quant_Field);
			Newclear(driver, Dimension_Quant_Field);
			sendKeys(driver, Dimension_Quant_Field,quantity_Input );
			waitForElement(driver, Dimension_Package_Search);
			click(driver, Dimension_Package_Search);
			waitForElement(driver, Package_Serach);
			sendKeys(driver, Package_Serach,package_Input );
			waitForElement(driver, firstRow);
			doubleClick(driver, firstRow);

			waitForElement(driver, Dimension_Add_Btn);
			click(driver, Dimension_Add_Btn);
			waitForElement(driver, Dimension_Ok_Btn);
			click(driver, Dimension_Ok_Btn);
			
			Step_End(10, "Enter the dimension details", test, test1);
			
			waitForElement(driver, Exp_Days);
			sendKeys(driver, Exp_Days, Exp_Det_Days_Input);

			waitForElement(driver, Imp_Days);
			sendKeys(driver, Imp_Days, Imp_Det_Days_Input);

			waitForElement(driver, Exp_Demurage);
			sendKeys(driver, Exp_Demurage, Exp_Demmurage_Input);

			waitForElement(driver, Imp_Demurage);
			sendKeys(driver, Imp_Demurage, Imp_Demmurage_Input);

			Step_Start(11, "Click routing", test, test1);
			waitForElement(driver, Routing_Button);
			click(driver, Routing_Button);
			Step_End(11, "Click routing", test, test1);

			Step_Start(12, "Select the routing", test, test1);
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
			Step_End(12, "Select the routing", test, test1);

			Step_Start(13, "Enter the OFR", test, test1);
			waitForElement(driver, OFR_Txt_Field);
			clear(driver, OFR_Txt_Field);
			sendKeys(driver, OFR_Txt_Field, OFR_Txt_Field_Input);
			System.out.println("OFR Value:"+OFR_Txt_Field_Input);
			Step_End(13, "Enter the OFR", test, test1);

			Step_Start(14, "Click Add", test, test1);
			waitForElement(driver, Rate_AddBtn);
			click(driver, Rate_AddBtn);
			Step_End(14, "Click Add", test, test1);

			Step_Start(15, "Click Save button in the tool bar", test, test1);
			waitForElement(driver, Rate_SaveBtn);
			click(driver, Rate_SaveBtn);
			Step_End(15, "Click Save button in the tool bar", test, test1);

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

			Step_Start(16, "Click submit", test, test1);
			waitForElement(driver, Rate_SubmitBtn);
			click(driver, Rate_SubmitBtn);
			Step_End(16, "Click submit", test, test1);

			Step_Start(17, "Click Ok", test, test1);
			waitForElement(driver, Yes_Btn);
			click(driver, Yes_Btn);
			Step_End(17, "Click Ok", test, test1);

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
				System.out.println("Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1);            
				Extent_pass(driver, "Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1);        
				Extent_fail(driver, "Not Matched || " + " Expected Request status is : " + Req_Status_Exp + " || Actual Request status is : " + act_Req_Status1, test,test1); 
			} 
			
			String actualNon_ContainerizedStatus=getAttribute(driver, nonContainerized_Radiobutton, "class");
			if(actualNon_ContainerizedStatus.contains("active")) {
				System.out.println("Matched || Rate Request Submitted in Non Containerized Type");
				Extent_pass(driver, "Matched || Rate Request Submitted in Non Containerized Type", test, test1);
			}else {
				System.out.println("Not Matched || Rate Request not Submitted in Non Containerized Type");
				Extent_fail(driver, "Not Matched || Rate Request not Submitted in Non Containerized Type", test, test1);
			}
			
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

				Extent_completed(testCaseName9, test, test1);
		}
		
		
		
		boolean sc10=true;
		if(sc10==true) {
			
			String testCaseName1="TC_Rate_Request_SC10_SC11";
			String testCaseName10="TC_Rate_Request_SC10";
			String testCaseName11="TC_Rate_Request_SC11";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName1);
			String Sheet_Name_023 = TestNgXml.getsheetName_FromExecution().get(testCaseName1);

			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_023, testCaseName1,"Dataset" + selected_dataset, File_Path);
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
			String datePicker =Excel_data.get( "DatePicker");
			String Request_Input=Excel_data.get("Request_Type_Input");
			String service =Excel_data.get( "Service");

			tService=Excel_data.get("T_Service");
			TOS=Excel_data.get("TOS_Option");
			Pre_Carriage_Radiobtn = Excel_data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = Excel_data.get("on_Carriage_Radiobtn");
		

			Extent_Start(testCaseName1, test, test1);	

			String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

			Extent_Start(testCaseName10, test, test1);

			waitForElement(driver, Module_SearchR);
			click(driver,Module_SearchR);
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, Search_module);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);
			waitForElement(driver, Rate_Request_Page);
			if(isDisplayed(driver, Rate_Request_Page)) {
				System.out.println("Rate Request Module is Dispalyed");
				Extent_pass(driver, "Rate Request Module is Dispalyed", test,test1);
			}else {
				System.out.println("Rate Request Module is not Dispalyed");
				Extent_fail(driver, "Rate Request Module is not Dispalyed", test,test1);
			}
			Step_Start(1, "Click on the new button in the toolbar", test, test1);
			waitForElement(driver, Rate_Newbutton);
			click(driver,Rate_Newbutton);
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
			waitForElement(driver, Customer_Code_Select_dropdown);
			click(driver, Customer_Code_Select_dropdown);
			selectByText(driver, Customer_Code_Select_dropdown, customerCode_Option);
			click(driver, CustomerSearch_Condition_Dropdown1);
			selectByText(driver, CustomerSearch_Condition_Dropdown1, condition_Option);
			waitForElement(driver, CustomerSearch_InputTextfield1);
			sendKeys(driver, CustomerSearch_InputTextfield1, customerCode);
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
					StringBuilder day = new StringBuilder();
					StringBuilder month = new StringBuilder();
					StringBuilder year = new StringBuilder();
					waitForElement(driver, Dateclick);
						click(driver, Dateclick);
						if(datePicker.equalsIgnoreCase("Yes")) {
						datePicker(From_Date_Input, day, month, year);
						waitForElement(driver, Month_DD);
						selectByText(driver, Month_DD,month.toString());
						waitForElement(driver, Year_DD);
						selectByText(driver, Year_DD,year.toString());
							String dateSelect =String.format(date_select, day);
							waitForElement(driver, dateSelect);
							click(driver, dateSelect);
						}
					 else {
						waitForElement(driver, Dateclick);
						clearAndType(driver, Dateclick, From_Date_Input);
					}
					// Selecting the to Date
							waitForElement(driver, Dateclick1);
								click(driver, Dateclick1);
								if(datePicker.equalsIgnoreCase("Yes")) {

								datePicker(To_Date_Input, day, month, year);
								waitForElement(driver, Month_DD);
								selectByText(driver, Month_DD,month.toString());
								waitForElement(driver, Year_DD);
								selectByText(driver, Year_DD,year.toString());
								String dateSelect =String.format(date_select, day);
									waitForElement(driver, dateSelect);
									click(driver, dateSelect);
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
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, Search_module);	
			enter(driver);

			Step_Start(1, "Click on the search icon in the toolbar", test, test1);

			waitForElement(driver, global_search_R);
			click(driver, global_search_R);
			Step_End(1, "Click on the search icon in the toolbar", test, test1);
			Step_Start(2, ".Enter the Reference number.", test, test1);

			click(driver, CustomerSearch_Condition_Dropdown1);
			selectByText(driver, CustomerSearch_Condition_Dropdown1, condition_Option);

			waitForElement(driver, global_search_input_R);
			sendKeys(driver, global_search_input_R, Act_ReqNo);
			enter(driver);
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
			Extent_completed(testCaseName1, test, test1);
		}
		
		boolean sc12=true;
		
		if(sc12==true) {
			
			String testcase_Name="TC_Rate_Request_SC12";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,File_Path);
			String search_module = data.get("Search_module");
			String delivery=data.get("Delivery");
			String commodity2=data.get("commodity2");
			String Eqp_Quantity_Input =data.get("Eqp_Quantity_Input");
			String DG_checkboxs = data.get("DG_checkboxs");
			String NOR_checkbox = data.get("NOR_checkbox");
			String SOC_checkbox = data.get("SOC_checkbox");
			String OOG_checkbox = data.get("OOG_checkbox");
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
			
			String Module_SRR_Gate=data.get("Module_SRR_Gate");
			String Request_Input=data.get("Request_Type_Input");

			
			
			port_Pair=data.get("Origin_Input");
			Pre_Carriage_Radiobtn = data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = data.get("on_Carriage_Radiobtn");
		
			Extent_Start(testcase_Name, test, test1);

			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
			String added_portpair =  String.format(Rate_Request_Loactors.portPair,  port_Pair); 
			String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);


			
			waitForElement(driver, Module_SearchR);
			click(driver,Module_SearchR);
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, search_module);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);
			waitForElement(driver, Rate_Request_Page);
			if(isDisplayed(driver, Rate_Request_Page)) {
				System.out.println("Rate Request Module is Dispalyed");
				Extent_pass(driver, "Rate Request Module is Dispalyed", test,test1);
			}else {
				System.out.println("Rate Request Module is not Dispalyed");
				Extent_fail(driver, "Rate Request Module is not Dispalyed", test,test1);
			}
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
		   waitForElement(driver, Customer_Code_Select_dropdown);
		   click(driver, Customer_Code_Select_dropdown);
		   selectByText(driver, Customer_Code_Select_dropdown, customerCode_Option);
			click(driver, CustomerSearch_Condition_Dropdown1);
			selectByText(driver, CustomerSearch_Condition_Dropdown1, condition_Option);
			waitForElement(driver, CustomerSearch_InputTextfield1);
			sendKeys(driver, CustomerSearch_InputTextfield1, customerCode);
			click(driver, CustomerSearch_Frame_SearchButton);
			
			waitForDisplay(driver, pop_up_exp);
			if(isDisplayed(driver,pop_up_exp )) {
				String actual_Popup = getText(driver, pop_up_exp);
				System.out.println("The Customer Code is Invalid The Actual Popup value was : "+actual_Popup);
				Extent_fail(driver, "The Customer Code is Invalid The Actual Popup value was : "+actual_Popup, test, test1);
			}else {
			waitForElement(driver, Customer_Select);
			doubleClick(driver, Customer_Select);
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
			sendKeys(driver, Delivery_Input_Field,delivery );
			click(driver, Auto_Panel_First);
			
//			click(driver, selectDelivery_name);
			Step_End(4, "Enter the Delivery", test, test1);

			// Selecting the From Date
			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();
			waitForElement(driver, Dateclick);
				click(driver, Dateclick);
				if(datePicker.equalsIgnoreCase("Yes")) {
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
					waitForElement(driver, date_select);
					click(driver, date_select);
				}
			 else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
					waitForElement(driver, Dateclick1);
						click(driver, Dateclick1);
						if(datePicker.equalsIgnoreCase("Yes")) {

						datePicker(To_Date_Input, day, month, year);
						waitForElement(driver, Month_DD);
						selectByText(driver, Month_DD,month.toString());
						waitForElement(driver, Year_DD);
						selectByText(driver, Year_DD,year.toString());
						String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
							waitForElement(driver, date_select);
							click(driver, date_select);
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


//			//RadioButton
			if(!Pre_Carriage_Radiobtn.equals("")) {
			waitForElement(driver, preCarriageLocator);
			click(driver, preCarriageLocator);
			}
			if(!On_Carriage_Radiobtn.equals("")) {

			waitForElement(driver, onCarriageLocator);
			click(driver, onCarriageLocator);
			}


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
				

				Step_Start(13, "Double click on the added port pair.", test, test1);
				waitForElement(driver, added_portpair);
				doubleClick(driver, added_portpair);
				Step_End(13, "Double click on the added port pair.", test, test1);
				
//				scrollTop(driver);
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
						datePicker(From_Date_Input_Edit, day, month, year);
						waitForElement(driver, Month_DD);
						selectByText(driver, Month_DD,month.toString());
						waitForElement(driver, Year_DD);
						selectByText(driver, Year_DD,year.toString());
						String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
							waitForElement(driver, date_select);
							click(driver, date_select);
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

								datePicker(To_Date_Input_Edit, day, month, year);
								waitForElement(driver, Month_DD);
								selectByText(driver, Month_DD,month.toString());
								waitForElement(driver, Year_DD);
								selectByText(driver, Year_DD,year.toString());
								String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
									waitForElement(driver, date_select);
									click(driver, date_select);
								}
							 else {
								waitForElement(driver, Dateclick1);
								clearAndType(driver, Dateclick1, To_Date_Input);
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
	 			String actualCommodity=getAttribute(driver, commodity_Attribute, "value");
				if(actualCommodity.equals(commodity2)) {
					
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
				if(actualToDate.equals(To_Date_Input_Edit)) {
					
					Extent_pass(driver, "Matched || Expected To Date:"+To_Date_Input_Edit+" || Actual To Date: "+actualToDate, test, test1);
					System.out.println("Matched || Expected To Date:"+To_Date_Input_Edit+" || Actual To Date: "+actualToDate);
				}else {
					System.out.println("Not Matched || Expected To Date:"+To_Date_Input_Edit+" || Actual To Date: "+actualToDate);
					Extent_fail(driver, "Not Matched || Expected To Date:"+To_Date_Input_Edit+" || Actual To Date: "+actualToDate, test, test1);
				}
				
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
	
	
}
