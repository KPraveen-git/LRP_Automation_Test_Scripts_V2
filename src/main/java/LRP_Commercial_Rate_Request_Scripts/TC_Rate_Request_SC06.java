package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC06 extends Keywords {

	public void Rate_Request_SC06(WebDriver driver, ExtentTest test,ExtentTest test1, String selected_dataset) {
		
		String tc_Name="TC_Rate_Request_SC06";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, tc_Name,
				"Dataset" + selected_dataset, File_Path);


		String user_Name=Data.get("Username");
		String pass_word=Data.get("Password");
		String rateRequestModule=Data.get("ModuleRateRequest");
		String Origin_Input=Data.get("Origin_Input");
		String Delivery_Input =Data.get("Delivery_Input");
		String Commodity_Input_Txt=Data.get("Commodity_Input");
		String Eqp_Type_Input=Data.get("Eqp_Type_Input");	
		String Eqp_Quantity_Input=Data.get("Eqp_Quantity_Input");
		String Gross_Weight_Input=Data.get("Gross_Weight_Input");
		String Length_Field_Input=Data.get("Length_Field_Input");
		String Width_Field_Input=Data.get("Width_Field_Input");
		String Height_Field_Input=Data.get("Height_Field_Input");
		String Exp_Det_Days_Input=Data.get("Exp_Det_Days_Input");
		String Imp_Det_Days_Input=Data.get("Imp_Det_Days_Input");
		String Exp_Demmurage_Input=Data.get("Exp_Demmurage_Input");
		String Imp_Demmurage_Input=Data.get("Imp_Demmurage_Input");
		String OFR_Txt_Field_Input=Data.get("OFR_Txt_Field_Input");
		String Req_Submit_Popup_Txt=Data.get("Req_Submit_Popup_Txt");
		String Rate_Req_Submitted_Popup_Txt=Data.get("Rate_Req_Submitted_Popup_Txt");
		String Req_Status_Exp=Data.get("Req_Status_Exp");
		String DG_checkboxs = Data.get("DG_checkboxs");
		String NOR_checkbox = Data.get("NOR_checkbox");
		String SOC_checkbox = Data.get("SOC_checkbox");
		String OOG_checkbox = Data.get("OOG_checkbox");
		String Cust_code = Data.get("Cust_code");
		String Condition_Value = Data.get("Condition_Value");
		String Customer_code_Value = Data.get("Customer_code_Value");
		String To_Date_Input = Data.get("To_Date_Input");
		String date_Picker = Data.get("date_Picker");
		String From_Date_Input = Data.get("From_Date_Input");
		String Do_You_Want_Delete = Data.get("Do_You_Want_Delete");
		String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
		String On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
		String agencyUser = Data.get("Agency_user");
		String Routing_Service = Data.get("Routing_Service");
		String Routing_Origin = Data.get("Routing_Origin");
		String moduleSRRGate = Data.get("ModuleSRRGate");

		String Request_Input = Data.get("Request_Type_Input");
		String SRR_Request_Input = Data.get("SRR_Req_Input");
		String tService = Data.get("T_Service");
		String TOS = Data.get("TOS_Option");
		String Customer_code_Value2 = Data.get("Customer_code_Value2");
		String Customer_code_Value3 = Data.get("Customer_code_Value3");
		String Cust_code2 = Data.get("Cust_code2");
		String Cust_code3 = Data.get("Cust_code3");
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

		String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);
		String SRR_Req_type_Locator= String.format(Rate_Request_Loactors.SRR_Gate_Request_type, SRR_Request_Input);
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

		Extent_Start(tc_Name, test, test1);	
		navigateUrl(driver, url);
		//Login
				LRP_Login(driver, user_Name, pass_word);
				
			
				
				//Switch User
				SwitchProfile(driver, agencyUser);
				
				//Module search
				moduleNavigate(driver, rateRequestModule);
				
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
		waitForElement(driver, tService_Dropdown);
		click(driver, tService_Dropdown);
		waitForElement(driver, select_t_Service);
		click(driver, select_t_Service);

		waitForElement(driver, TOS_Dropdown);
		click(driver, TOS_Dropdown);
		waitForElement(driver, tos);
		click(driver, tos);
		waitForElement(driver, Dateclick);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Dateclick, From_Date_Input);
		} else {
			waitForElement(driver, Dateclick);
			clearAndType(driver, Dateclick, From_Date_Input);
		}
		
		// Selecting the to Date
		waitForElement(driver, Dateclick1);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Dateclick1, To_Date_Input);
		} else {
			waitForElement(driver, Dateclick1);
			clearAndType(driver, Dateclick1, To_Date_Input);
		}
		Step_Start(2, "Select the special rate request type", test, test1);
		waitForElement(driver, Requet_Type);
		click(driver,Requet_Type);
		waitForElement(driver, Request_Type_Locator);
		click(driver, Request_Type_Locator);
		Step_End(2, "Select the special rate request type", test, test1);


		Step_Start(3, "Enter the customer name", test, test1);
		waitForElement(driver, Customer_Name_search_button);
		click(driver, Customer_Name_search_button);
		globalValueSearchWindow1(driver, Condition_Value, Cust_code, Customer_code_Value, Cust_code2, Customer_code_Value2,Cust_code3, Customer_code_Value3);
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
			Step_End(3, "Enter the customer name", test, test1);


			Step_Start(4, "Enter the origin", test, test1);
			waitForElement(driver, Orgin_Input);
			sendKeys(driver, Orgin_Input, Origin_Input);
			waitForElement(driver, Origin_Value);
			waitForElement(driver, Auto_Panel_First);
			safeclick(driver, Auto_Panel_First);
			Step_End(4, "Enter the origin", test, test1);

			Step_Start(5, "Enter the Delivery", test, test1);
			waitForElement(driver, Delivery_Input_Field);
			sendKeys(driver, Delivery_Input_Field,Delivery_Input );
			waitForElement(driver, Delivery_Value);
			waitForElement(driver, Auto_Panel_First);
			safeclick(driver, Auto_Panel_First);
			Step_End(5, "Enter the Delivery", test, test1);

			Step_Start(6, "Enter the Commodity", test, test1);
			waitForElement(driver, Commodity_Input);
			sendKeys(driver, Commodity_Input, Commodity_Input_Txt);
			waitForElement(driver, Commodity_Value);
			waitForElement(driver, Auto_Panel_First);
			safeclick(driver, Auto_Panel_First);
			Step_End(6, "Enter the Commodity", test, test1);

			Step_Start(7, "Enter the Equipment type", test, test1);
			waitForElement(driver, Eqp_Type);
			click(driver, Eqp_Type);
			sendKeys(driver, Eqp_Type, Eqp_Type_Input);
			System.out.println("Eqp type:"+Eqp_Type_Input);
			waitForElement(driver, Auto_Panel_First);
			safeclick(driver, Auto_Panel_First);
			Step_End(7, "Enter the Equipment type", test, test1);

			Step_Start(8, "Enter the Quantity", test, test1);
			waitForElement(driver, Eqp_Quantity);
			click(driver, Eqp_Quantity);
			Newclear(driver, Eqp_Quantity);
			Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );

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

			waitForElement(driver, nor_checkbox); 
			checkBox(driver, nor_checkbox, NOR_checkbox);
			waitForElement(driver, soc_checkbox); 
			checkBox(driver, soc_checkbox, SOC_checkbox);


			Step_Start(10, "Click on the OOG check box", test, test1);
			waitForElement(driver, oog_checkbox);
			checkBox(driver, oog_checkbox, OOG_checkbox);
			Step_End(10, "Click on the OOG check box", test, test1);



			Step_Start(11, "Enter the Dimension details", test, test1);
			waitForElement(driver, OOG_Length_Field);
			clearAndType(driver, OOG_Length_Field, Length_Field_Input);

			waitForElement(driver, OOG_Width_Field);
			clearAndType(driver, OOG_Width_Field, Width_Field_Input);

			waitForElement(driver, OOG_Height_Field);
			clearAndType(driver, OOG_Height_Field, Height_Field_Input);
			Step_End(11, "Enter the Dimension details", test, test1);



			Step_Start(12, "Click Ok", test, test1);
			waitForElement(driver, OOG_Ok_Btn);
			click(driver, OOG_Ok_Btn);
			Step_End(12, "Click Ok", test, test1);

			//Pre Carriage radio btn
			waitForElement(driver, preCarriageLocator);
			click(driver, preCarriageLocator);
			waitForElement(driver, onCarriageLocator);
			click(driver, onCarriageLocator);



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
			Step_Start(13, "Click routing", test, test1);
			waitForElement(driver, Routing_Button);
			click(driver, Routing_Button);
			Step_End(13, "Click routing", test, test1);

			Step_Start(14, "Select the routing", test, test1);
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
				sendKeys(driver, Routing_OriginTF, Routing_Origin);
				waitForElement(driver, Routing_service_TF);
				sendKeys(driver, Routing_service_TF, Routing_Service);
				waitForElement(driver, select_First_Routing);
				doubleClick(driver, select_First_Routing);

			}else {
				System.out.println(actRoutingFrame+" is not displayed");

				Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
			}
			Step_End(14, "Select the routing", test, test1);

			Step_Start(15, "Enter the OFR", test, test1);
			waitForElement(driver, OFR_Txt_Field);
			clear(driver, OFR_Txt_Field);
			sendKeys(driver, OFR_Txt_Field, OFR_Txt_Field_Input);
			System.out.println("OFR Value:"+OFR_Txt_Field_Input);
			Step_End(15, "Enter the OFR", test, test1);

			Step_Start(16, "Click Add", test, test1);
			waitForElement(driver, Rate_AddBtn);
			click(driver, Rate_AddBtn);
			Step_End(16, "Click Add", test, test1);

			Step_Start(17, "Click Save button in the tool bar", test, test1);
			waitForElement(driver, Rate_SaveBtn);
			click(driver, Rate_SaveBtn);
			Step_End(17, "Click Save button in the tool bar", test, test1);

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

			Step_Start(18, "Click submit", test, test1);
			waitForElement(driver, Rate_SubmitBtn);
			click(driver, Rate_SubmitBtn);
			Step_End(18, "Click submit", test, test1);

			Step_Start(19, "Click Ok", test, test1);
			waitForElement(driver, Yes_Btn);
			click(driver, Yes_Btn);
			Step_End(19, "Click Ok", test, test1);

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
			
			Extent_call(test, test1, "Checking whether the OOG flag is enabled in the screen when submitted");
			waitForElement(driver, oog_checkbox);
		if(isElementSelected(driver, oog_checkbox)){
			System.out.println("OOG FLAG IS SELECTED IN THE SCREEN ");
			Extent_pass(driver, "OOG FLAG IS SELECTED IN THE SCREEN ", test, test1);
			
		}else {
			System.out.println("OOG FLAG IS NOT SELECTED IN THE SCREEN ");
			extent_fail(driver, "OOG FLAG IS NOT SELECTED IN THE SCREEN ", test, test1);
			
		}

			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);


			Extent_call(test, test1, "Rate request Delete start");
			if(Do_You_Want_Delete.equalsIgnoreCase("Yes")){
				waitForElement(driver, Module_SearchR);
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

				waitForElement(driver, SRR_Req_type_Locator);
				click(driver, SRR_Req_type_Locator);


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
					Extent_pass(driver, Act_ReqNo+"  is Deleted", test,test1);
					System.out.println(Act_ReqNo+" is Deleted");
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
				}else {
					System.out.println("Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value  is : " + pending_ReqNum1);
					Extent_fail(driver,"Not matched || " + " Expected Value is : " + Act_ReqNo + " || Actual Value is : " + pending_ReqNum1,test,test1);
				}	
			}
		}
		Extent_call(test, test1, "Rate request Delete Ended");
		Extent_completed(tc_Name, test, test1);

	}
}
