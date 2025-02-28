package LRP_Commercial_Rate_Request_Consolidation_Scripts;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC13toSC18 extends Keywords {
	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;
	public void Rate_RequestSC13toSC18(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {
		
		
		int tc13=1;
		
		if(tc13 == 1) {
			String testcase_Name13="TC_Rate_Request_SC13";
			String File_Path13 = TestNgXml.getfilePath_FromExecution().get(testcase_Name13);
			String Sheet_Name13 = TestNgXml.getsheetName_FromExecution().get(testcase_Name13);
			String url = TestNgXml.getdatafromExecution().get(testcase_Name13);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name13, testcase_Name13, "Dataset" + selected_dataset,
					File_Path13);

	 
			String username = Data.get("Username");
			String pass_word =Data.get("Password");
			String Field_Names =Data.get("field_name");
			String Eqp_Type_Input =Data.get("Eqp_Type_Input");
			String Eqp_Quantity_Input =Data.get("Eqp_Quantity_Input");
			String Gross_Weight_Input =Data.get("Gross_Weight_Input");
			String Exp_Det_Days_Input =Data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input =Data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input =Data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input =Data.get("Imp_Demmurage_Input");
			String submit_msg=Data.get("submit_msg");
			String status_value=Data.get("status_value");
			String origin =Data.get( "Origin");
			String delivery =Data.get( "Delivery");
			String commodity =Data.get( "Commodity");
			String Ofr_Value1=Data.get("Ofr_Value1");		
			String From_Date_Input =Data.get( "From_Date_Input");
			String From_date_perform =Data.get( "From_date_perform");
			String ModuleName1=Data.get("ModuleName1");		
			String ofrGreater =Data.get( "OFRGreater");
			String To_Date_Input =Data.get( "To_Date_Input");
			String To_date_perform =Data.get( "To_date_perform");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String agencyUser = Data.get("Agency_user");
			String Customer_Code = Data.get("Cust_code").trim();
			String Customer_code_Value = Data.get("Customer_code_Value");
			String Condition_Value = Data.get("Condition_Value");
			String Routing_Origin = Data.get("Routing_Origin");
			String Routing_Service = Data.get("Routing_Service");
			Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			String do_You_Want_Delete = Data.get("Do_You_Want_Delete").trim();
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
			
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


			Extent_Start(testcase_Name13, test, test1);

			navigateUrl(driver, url);
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
			Extent_cal(test, test1, "selecting the from date");
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
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			Extent_call(test, test1, "selecting the TO date");
			waitForElement(driver, Dateclick1);
			if (To_date_perform.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick1);
				clearAndType(driver, Dateclick1, To_Date_Input);
			}

			Step_Start(2, "Enter the customer name", test, test1);
			waitForElement(driver, Customer_Name_search_button);
			click(driver, Customer_Name_search_button);
			waitForElement(driver, Customer_Code_Select_dropdown);
			click(driver, Customer_Code_Select_dropdown);
			selectByText(driver, Customer_Code_Select_dropdown, Customer_Code);
			waitForElement(driver, CustomerSearch_Condition_Dropdown1);
			click(driver, CustomerSearch_Condition_Dropdown1);
			selectByText(driver,CustomerSearch_Condition_Dropdown1, Condition_Value);
			waitForElement(driver, CustomerSearch_InputTextfield1);
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
				doubleClick(driver, Customer_Select);
				Step_End(2, "Enter the customer name", test, test1);

	waitForDisplay(driver, CustName_ExitBtn);
				if(isDisplayed(driver, CustName_ExitBtn)) {
					waitForElement(driver, CustName_ExitBtn);
					click(driver, CustName_ExitBtn);
				}

				Step_Start(3,"Enter the origin", test, test1);
				waitForElement(driver, Orgin_Input);
				sendKeys(driver, Orgin_Input, origin);
				waitForElement(driver, Origin_Value);
				safeclick(driver, Auto_Panel_First);
				Step_End(3, "Enter the origin", test, test1);

				Step_Start(4, "Enter the Delivery.", test, test1);
				waitForElement(driver, Delivery_Input);
				sendKeys(driver, Delivery_Input, delivery);
				waitForElement(driver, Delivery_Value);
				click(driver, Auto_Panel_First);
				System.out.println("Delivery Value:" + delivery);
				Step_End(4, "Enter the Delivery.", test, test1);
				Step_Start(5, "Enter the Commodity.", test, test1);
				waitForElement(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, commodity);
				waitForElement(driver, Commodity_Value);
				click(driver, Auto_Panel_First);
				System.out.println("Commodity Value:" + commodity);
				Step_End(5, "Enter the Commodity.", test, test1);
				Step_Start(6, ".Enter the rate calculation type.", test, test1);
				waitForElement(driver, Eqp_Type);
				click(driver, Eqp_Type);
				sendKeys(driver, Eqp_Type, Eqp_Type_Input);
				waitForElement(driver, Eqp_Type_Value);
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

				Step_Start(9, "Click routing.", test, test1);
				waitForElement(driver, Routing_Button);
				click(driver, Routing_Button);
				Step_End(9, "Click routing.", test, test1);

				Step_Start(10,"Select the routing.", test, test1);
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
				Step_End(10,"Select the routing.", test, test1);

				Step_Start(11,"Enter the OFR", test, test1);
				waitForElement(driver, OFR_Txt_Field);
				safeclick(driver, OFR_Txt_Field);
				sendKeys(driver, OFR_Txt_Field,ofrGreater );

				Step_End(11,"Enter the OFR", test, test1);
				Step_Start(12,"Click Add.", test, test1);
				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);

				Step_End(12, "Click Add", test, test1);


				Step_Start(13, "Enter the new OFR amount", test, test1); 

				waitForElement(driver, OFR_Txt_Field);
				safeclick(driver, OFR_Txt_Field);
				Newclear(driver, OFR_Txt_Field);
				Actionsendkeys(driver, OFR_Txt_Field, Ofr_Value1);

				Step_End(13, "Enter the new OFR amount", test, test1); 
				Step_Start(14, "Click Apply rate button", test, test1); 

				waitForElement(driver, Apply_RateBtn);
				click(driver, Apply_RateBtn);

				Step_End(14, "Click Apply rate button", test, test1); 
	    
		          waitForElement(driver, Req_Rate_Loc);		
		          String Rates_Loc_Value=getText(driver, Req_Rate_Loc);
		          if(Ofr_Value1.equals(Rates_Loc_Value)) {
		        	  
		        		System.out.println("Matched || Expected value was : "+Ofr_Value1+" || Actual value was : "+Rates_Loc_Value);
						Extent_pass(driver, "Matched || Expected value was : "+Ofr_Value1+" || Actual value was : "+Rates_Loc_Value, test, test1);
					
					}
					else {
						System.out.println("NotMatched || Expected value was : "+Ofr_Value1+" || Actual value was : "+Rates_Loc_Value);
						Extent_fail(driver,  "NotMatched || Expected value was : "+Ofr_Value1+" || Actual value was : "+Rates_Loc_Value, test, test1);
					}
				Step_Start(15, "Click Save button in the tool bar", test, test1); 

				waitForElement(driver, Rate_SaveBtn);
				safeclick(driver, Rate_SaveBtn);

				Step_End(15, "Click Save button in the tool bar", test, test1); 

				waitForElement(driver, save_pending_popup);
				String SaveRate_PopUp2= getText(driver, save_pending_popup);


				if(isDisplayed(driver, save_pending_popup)){
					if(submit_msg.equals(SaveRate_PopUp2)) {
						System.out.println("Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2);
						Extent_pass(driver, "Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2, test, test1);
						waitForElement(driver, Rate_SubmitBtn);
						click(driver, Rate_SubmitBtn);
						System.out.println("Submit button clicked");
					}
					else {
						System.out.println("NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2);
						Extent_fail(driver,  "NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2, test, test1);
					}
				}
				else {
					System.out.println("submit popup was not displayed");
					Extent_fail(driver, "submit popup was not displayed", test, test1);
				}

				Step_End(16, "Click submit", test, test1); 


				Step_Start(17, "Click Ok", test, test1); 

				waitForElement(driver, Yes_Btn);
				click(driver, Yes_Btn);
				System.out.println("Rate Request saved");

				Step_End(17, "Click Ok", test, test1);

				waitForElement(driver, status_Field);
				String status2=getAttribute(driver, status_Field, "value");
				if(status2.equals(status_value)) {
					System.out.println("Rate Request Submitted");
					System.out.println("Matched || Expected value was : "+status_value+" || Actual value was : "+status2);
					Extent_pass(driver, "Matched || Expected value was : "+status_value+" || Actual value was : "+status2, test, test1);
				}
				else {
					System.out.println("NotMatched || Expected value was : "+status_value+" || Actual value was : "+status2);
					Extent_fail(driver,  "NotMatched || Expected value was : "+status_value+" || Actual value was : "+status2, test, test1);
				}
	            waitForElement(driver, reqNo_Textfield);
				String Value3=getAttribute(driver, reqNo_Textfield, "value");
				System.out.println(Value3);

				Extent_call(test, test1, "Rate request delete starts");
				if(do_You_Want_Delete.equalsIgnoreCase("yes")) {

					waitForElement(driver, close_Tab);
					click(driver, close_Tab);

					waitForElement(driver, Module_SearchR);
					sendKeys(driver, Module_SearchR, ModuleName1);

					waitForElement(driver, SRR_Gate);
					click(driver, SRR_Gate);
					Extent_call(test, test1, "SRR Gate");

					//SRR Gate

					waitForElement(driver, srrGate_Tab);
					if (isDisplayed(driver, srrGate_Tab)) {
						Extent_pass(driver, "SRR Gate Page is displayed", test, test1);
						System.out.println("SRR Gate Page is displayed");
					} else {
						Extent_fail(driver, "SRR Gate Page is not displayed", test, test1);
						System.out.println("SRR Gate Page is not displayed");
					}

					Extent_call(test, test1, "Submitted");
					//SRR Gate

					waitForElement(driver, srrGate_Tab);
					if (isDisplayed(driver, srrGate_Tab)) {
						Extent_pass(driver, "SRR Gate Page is displayed", test, test1);
						System.out.println("SRR Gate Page is displayed");
					} else {
						System.out.println("SRR Gate Page is not displayed");
						Extent_fail(driver, "SRR Gate Page is not displayed", test, test1);
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
					waitForElement(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, Value3);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNum3=getText(driver, select_Actual_ReqNo);
					if(submitted_ReqNum3.equals(Value3)) {
						System.out.println("Matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + submitted_ReqNum3);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + Value3 + " || ActualValue is : " + submitted_ReqNum3,test, test1);
						Extent_pass(driver, Value3+"  is submitted", test, test1);
						System.out.println(Value3+" is submitted");

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver, close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);

					}else {
						System.out.println("Not matched || " + " Expected Value is : " + Value3 + " || Actual Value  is : " + submitted_ReqNum3);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + submitted_ReqNum3,test, test1);
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
					sendKeys(driver, filter_Inputfield, Value3);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNum3=getText(driver, select_Actual_ReqNo);
					if(pending_ReqNum3.equals(Value3)) {
						System.out.println("Matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + pending_ReqNum3);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + Value3 + " || ActualValue is : " + pending_ReqNum3,test, test1);
						Extent_pass(driver, Value3+"  is submitted", test, test1);
						System.out.println(Value3+" is submitted");

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
						System.out.println("Not matched || " + " Expected Value is : " + Value3 + " || Actual Value  is : " + pending_ReqNum3);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + pending_ReqNum3,test, test1);
					}	


					Extent_call(test, test1, "Rate request delete ends");
				}}

			Extent_completed(testcase_Name13, test, test1);

				  waitForElement(driver, srrGate_Tab);
				  click(driver, srrGate_Tab);
				  		waitForElement(driver, close_Tab);
				  		click(driver, close_Tab);
				  		waitForElement(driver, close_Tab);
				  		click(driver, close_Tab);
		}
		
		int tc14=1;
		
		if(tc14 == 1) {
			
			 
			String testcase_Name14="TC_Rate_Request_SC14";
			String File_Path14 = TestNgXml.getfilePath_FromExecution().get(testcase_Name14);
			String Sheet_Name14 = TestNgXml.getsheetName_FromExecution().get(testcase_Name14);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name14, testcase_Name14, "Dataset" + selected_dataset,
					File_Path14);

			String Field_Names =Data.get("field_name");
			String Eqp_Type_Input =Data.get("Eqp_Type_Input");
			String Eqp_Quantity_Input =Data.get("Eqp_Quantity_Input");
			String Gross_Weight_Input =Data.get("Gross_Weight_Input");
			String Exp_Det_Days_Input =Data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input =Data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input =Data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input =Data.get("Imp_Demmurage_Input");
			String submit_msg=Data.get("submit_msg");
			String status_value=Data.get("status_value");
			String origin =Data.get( "Origin");
			String delivery =Data.get( "Delivery");
			String commodity =Data.get( "Commodity");
			String From_Date_Input =Data.get( "From_Date_Input");
			String From_date_perform =Data.get( "From_date_perform");
			String ModuleName1=Data.get("ModuleName1");		
			String Surcharge_Code=Data.get("Surcharge_Code");
			String ofrGreater =Data.get( "OFRGreater");
			String To_Date_Input =Data.get( "To_Date_Input");
			String To_date_perform =Data.get( "To_date_perform");
			String Loc_Agency=Data.get("Loc_Agency");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String Customer_Code = Data.get("Cust_code");
			String Customer_code_Value = Data.get("Customer_code_Value");
			String Condition_Value = Data.get("Condition_Value");
			String Routing_Origin = Data.get("Routing_Origin");
			String Routing_Service = Data.get("Routing_Service");
			String do_You_Want_Delete = Data.get("Do_You_Want_Delete").trim();
			Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
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

			Extent_cal(test,test1,"selecting the from date");

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
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}

			Extent_pass(driver, "selecting the TO date", test, test1);
			// Selecting the to Date
			waitForElement(driver, Dateclick1);
			if (To_date_perform.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick1);
				clearAndType(driver, Dateclick1, To_Date_Input);
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
				Assert.fail("The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup);
			}else {
				waitForElement(driver, Customer_Select);
				doubleClick(driver, Customer_Select);
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
				waitForElement(driver, Delivery_Value);
				waitForElement(driver, Auto_Panel_First);
				click(driver, Auto_Panel_First);
				System.out.println("Delivery Value:" + delivery);
				Step_End(4, "Enter the Delivery.", test, test1);
				Step_Start(5, "Enter the Commodity.", test, test1);
				waitForElement(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, commodity);
				waitForElement(driver, Commodity_Value);
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

				Step_Start(9, "Click routing.", test, test1);
				waitForElement(driver, Routing_Button);
				click(driver, Routing_Button);

				Step_End(9, "Click routing.", test, test1);
				Step_Start(10,"Select the routing.", test, test1);
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
					doubleClick(driver, select_First_Routing);

				}else {
					Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
					System.out.println(actRoutingFrame+" is not displayed");
				}
				Step_End(10,"Select the routing.", test, test1);

				Step_Start(11,"Enter the OFR greater than the tariff..", test, test1);
				waitForElement(driver, OFR_Txt_Field);
				safeclick(driver, OFR_Txt_Field);
				sendKeys(driver, OFR_Txt_Field,ofrGreater );

				Step_End(11,"Enter the OFR", test, test1);
				Step_Start(12,"Click Add.", test, test1);
				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);
				Step_End(12, "Click Add", test, test1);

				Step_Start(13, "Click \"+\"radio button above the surcharge table ", test, test1);
				waitForElement(driver, Surcharge_AddBtn);
				click(driver, Surcharge_AddBtn);

				Step_End(13, "Click "+"radio button above the surcharge table", test, test1);

				Step_Start(14, "Enter the surcharge code.", test, test1);


				waitForElement(driver, Surcharge_ChargeCode);
				sendKeys(driver, Surcharge_ChargeCode, Surcharge_Code);
				Step_End(14, "Enter the surcharge code.", test, test1);

				Step_Start(15, "Double click on the chargecode", test, test1);

				waitForElement(driver, SurCharge_Value);

				doubleClick(driver, SurCharge_Value);


				Step_End(15, "Double click on the chargecode", test, test1);

				Step_Start(16, "Enter the surcharge amount in the agency (LOC)amount column", test, test1);

				waitForElement(driver, SurCharge_LocInput);
				scrollUsingElement(driver, SurCharge_LocInput);
				waitForElement(driver, SurCharge_LocInput);

				click(driver, SurCharge_LocInput);
				Newclear_Type(driver);

				waitForElement(driver, SurCharge_LocInput);
				Actionsendkeys(driver, SurCharge_LocInput, Loc_Agency );

				Step_End(16, "Enter the surcharge amount in the agency (LOC)amount column", test, test1);


				Step_Start(17, "click apply button", test, test1);

				waitForElement(driver, SurCharge_ApplyBtn);
				click(driver, SurCharge_ApplyBtn);
				waitForElement(driver, Table_Header);
				List<Map<String, String>> tabel_Value = getTableData(driver, Table_Header, Table_Rows);
				String lastRowName = getLastRowValueByHeader(tabel_Value, "Charges");
				System.out.println("Last row Name: " + lastRowName);
				if(Surcharge_Code.equals(lastRowName)) {
					System.out.println("Matched || Surcharge code Expected  : "+Surcharge_Code+" ||Surcharge code Actual : "+lastRowName);
					Extent_pass(driver, "Matched || Surcharge code Expected : "+Surcharge_Code+" || Surcharge code Actual : "+lastRowName, test, test1);
				}
				else {
					System.out.println("NotMatched || Surcharge code Expected : "+Surcharge_Code+" || Surcharge code Actual : "+lastRowName);
					Extent_fail(driver,  "NotMatched || Surcharge code Expected : "+Surcharge_Code+" ||Surcharge code Actual : "+lastRowName, test, test1);
				}

				Step_End(17, "click apply button", test, test1);

				Step_Start(18, "Click Save button in the tool bar", test, test1);

				scrollTop(driver);


				waitForElement(driver, Rate_SaveBtn);
				click(driver, Rate_SaveBtn);
				waitForElement(driver, save_pending_popup);
				String SaveRate_PopUp2= getText(driver, save_pending_popup);

				Step_End(18, "Click Save button in the tool bar", test, test1);

				Step_Start(19, "Click Submit Button", test, test1);


				if(isDisplayed(driver, save_pending_popup)){
					if(submit_msg.equals(SaveRate_PopUp2)) {
						System.out.println("Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2);
						Extent_pass(driver, "Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2, test, test1);
						waitForElement(driver, Rate_SubmitBtn);
						click(driver, Rate_SubmitBtn);
						System.out.println("Submit button clicked");
					}
					else {
						System.out.println("NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2);
						Extent_fail(driver,  "NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2, test, test1);
					}
				}
				else {
					System.out.println("submit popup was not displayed");
					Extent_fail(driver, "submit popup was not displayed", test, test1);
				}

				Step_End(19, "Click Submit Button", test, test1);


				Step_Start(20, "Click Ok", test, test1);

				waitForElement(driver, Yes_Btn);
				click(driver, Yes_Btn);
				System.out.println("Rate Request saved");


				Step_End(20, "Click Ok", test, test1);


				waitForElement(driver, status_Field);
				String status2=getAttribute(driver, status_Field, "value");
				if(status2.equals(status_value)) {
					System.out.println("Rate Request Submitted");
					System.out.println("Matched || Expected value was : "+status_value+" || Actual value was : "+status2);
					Extent_pass(driver, "Matched || Expected value was : "+status_value+" || Actual value was : "+status2, test, test1);
				}
				else {
					System.out.println("NotMatched || Expected value was : "+status_value+" || Actual value was : "+status2);
					Extent_fail(driver,  "NotMatched || Expected value was : "+status_value+" || Actual value was : "+status2, test, test1);
				}

				String Value3=getAttribute(driver, reqNo_Textfield, "value");
				System.out.println(Value3);

				Extent_call(test, test1, "Rate request delete starts");
				if(do_You_Want_Delete.equalsIgnoreCase("yes")) {

					waitForElement(driver, close_Tab);
					click(driver, close_Tab);

					waitForElement(driver, Module_SearchR);
					sendKeys(driver, Module_SearchR, ModuleName1);

					waitForElement(driver, SRR_Gate);
					click(driver, SRR_Gate);

					waitForElement(driver, srrGate_Tab);
					if (isDisplayed(driver, srrGate_Tab)) {
						Extent_pass(driver, "SRR Gate Page is displayed", test, test1);
						System.out.println("SRR Gate Page is displayed");
					} else {					
						System.out.println("SRR Gate Page is not displayed");
						Extent_fail(driver, "SRR Gate Page is not displayed", test, test1);
					} 


					//SRR Gate


					//Submitted	
					waitForElement(driver, submit_RadioButton);
					click(driver, submit_RadioButton);

					waitForElement(driver, menu_Icon_Grid);
					click(driver, menu_Icon_Grid);

					waitForElement(driver, filter_Icon_Grid);
					click(driver, filter_Icon_Grid);

					waitForElement(driver, filter_Inputfield);
					click(driver, filter_Inputfield);
					waitForElement(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, Value3);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNum3=getText(driver, select_Actual_ReqNo);
					if(submitted_ReqNum3.equals(Value3)) {
						System.out.println("Matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + submitted_ReqNum3);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + Value3 + " || ActualValue is : " + submitted_ReqNum3,test, test1);
						Extent_pass(driver, Value3+"  is submitted", test, test1);
						System.out.println(Value3+" is submitted");

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver, close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);

					}else {
						System.out.println("Not matched || " + " Expected Value is : " + Value3 + " || Actual Value  is : " + submitted_ReqNum3);
						System.out.println(Value3+" is not submitted");
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + submitted_ReqNum3,test, test1);
						Extent_fail(driver, Value3+" Error is not displayed", test, test1);
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
					sendKeys(driver, filter_Inputfield, Value3);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNum3=getText(driver, select_Actual_ReqNo);
					if(pending_ReqNum3.equals(Value3)) {
						System.out.println("Matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + pending_ReqNum3);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + Value3 + " || ActualValue is : " + pending_ReqNum3,test, test1);
						Extent_pass(driver, Value3+"  is submitted", test, test1);
						System.out.println(Value3+" is submitted");

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
						System.out.println("Not matched || " + " Expected Value is : " + Value3 + " || Actual Value  is : " + pending_ReqNum3);
						System.out.println(Value3+" is not submitted");
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + pending_ReqNum3,test, test1);
						Extent_fail(driver, Value3+" Error is not displayed", test, test1);
					}	
					Extent_call(test, test1, "Rate request delete ends");

				}}
				Extent_completed(testcase_Name14, test, test1);  

			
				  waitForElement(driver, srrGate_Tab);
				  click(driver, srrGate_Tab);
				  		waitForElement(driver, close_Tab);
				  		click(driver, close_Tab);
				  		waitForElement(driver, close_Tab);
				  		click(driver, close_Tab);
		
		
		}
		
		int tc15=1;
		
		if(tc15 ==1) {
			
			String testcase_Name15="TC_Rate_Request_SC15";
			String File_Path15 = TestNgXml.getfilePath_FromExecution().get(testcase_Name15);
			String Sheet_Name15 = TestNgXml.getsheetName_FromExecution().get(testcase_Name15);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name15, testcase_Name15, "Dataset" + selected_dataset,
					File_Path15);


			String Field_Names =Data.get("field_name");
			String Eqp_Type_Input =Data.get("Eqp_Type_Input");
			String Eqp_Quantity_Input =Data.get("Eqp_Quantity_Input");
			String Gross_Weight_Input =Data.get("Gross_Weight_Input");
			String Exp_Det_Days_Input =Data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input =Data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input =Data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input =Data.get("Imp_Demmurage_Input");
			String submit_msg=Data.get("submit_msg");
			String status_value=Data.get("status_value");
			String origin =Data.get( "Origin");
			String delivery =Data.get( "Delivery");
			String commodity =Data.get( "Commodity");
			String From_Date_Input =Data.get( "From_Date_Input");
			String From_date_perform =Data.get( "From_date_perform");
			String ModuleName1=Data.get("ModuleName1");		
			String Surcharge_Code=Data.get("Surcharge_Code");
			String ofrGreater =Data.get( "OFRGreater");
			String To_Date_Input =Data.get( "To_Date_Input");
			String To_date_perform =Data.get( "To_date_perform");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String Customer_Code = Data.get("Cust_code");
			String Customer_code_Value = Data.get("Customer_code_Value");
			String Condition_Value = Data.get("Condition_Value");
			String Routing_Origin = Data.get("Routing_Origin");
			String Routing_Service = Data.get("Routing_Service");
			String Manual_Surcharge_Remove_Popup = Data.get("Manual_Surcharge_Remove_Popup");
			String do_You_Want_Delete = Data.get("Do_You_Want_Delete").trim();
			Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
			Extent_Start(testcase_Name15, test, test1);

		

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

			Extent_cal(test, test1, "Selecting the From date");
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
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			Extent_call(test, test1, "selecting the To date");
			waitForElement(driver, Dateclick1);
			if (To_date_perform.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick1);
				clearAndType(driver, Dateclick1, To_Date_Input);
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

				Step_Start(3,"Enter the origin", test, test1);
				waitForElement(driver, Orgin_Input);
				sendKeys(driver, Orgin_Input, origin);
				waitForElement(driver, Origin_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				Step_End(3, "Enter the origin", test, test1);

				Step_Start(4, "Enter the Delivery.", test, test1);
				waitForElement(driver, Delivery_Input);
				sendKeys(driver, Delivery_Input, delivery);
				waitForElement(driver, Delivery_Value);
				waitForElement(driver, Auto_Panel_First);
				click(driver, Auto_Panel_First);
				System.out.println("Delivery Value:" + delivery);
				Step_End(4, "Enter the Delivery.", test, test1);
				Step_Start(5, "Enter the Commodity.", test, test1);
				waitForElement(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, commodity);
				waitForElement(driver, Commodity_Value);
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

				Step_Start(9, "Click routing.", test, test1);
				waitForElement(driver, Routing_Button);
				click(driver, Routing_Button);
				Step_End(9, "Click routing.", test, test1);
				Step_Start(10,"Select the routing.", test, test1);
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
					doubleClick(driver, select_First_Routing);

				}else {
					Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
					System.out.println(actRoutingFrame+" is not displayed");
				}
				Step_End(10,"Select the routing.", test, test1);

				Step_Start(11,"Enter the OFR", test, test1);
				waitForElement(driver, OFR_Txt_Field);
				safeclick(driver, OFR_Txt_Field);
				sendKeys(driver, OFR_Txt_Field,ofrGreater );

				Step_End(11,"Enter the OFR", test, test1);
				Step_Start(12,"Click Add.", test, test1);
				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);
				Step_End(12, "Click Add", test, test1);

				isDisplayed(driver, Surcharge_AddBtn);
				waitForElement(driver, Surcharge_AddBtn);
				click(driver, Surcharge_AddBtn);

				Step_Start(13,"Click \"-\"radio button above the surcharge table..", test, test1);
				waitForElement(driver, Surcharge_ChargeCode);
				sendKeys(driver, Surcharge_ChargeCode, Surcharge_Code);
				waitForElement(driver, SurCharge_Value);
				doubleClick(driver, SurCharge_Value);

				waitForElement(driver, SurCharge_LocInput);
				scrollUsingElement(driver, SurCharge_LocInput);


				waitForElement(driver, SurCharge_Valueselect);
				click(driver, SurCharge_Valueselect);

				Step_End(13,"Click \"-\"radio button above the surcharge table..", test, test1);
				waitForElement(driver, Surcharg_RemoveBtn);

				Step_Start(14,"Surcharge will the cleared from the surcharge table.", test, test1);

				click(driver, Surcharg_RemoveBtn);
				
				waitForElement(driver, Surcharge_remove_Popup);
				String surcharge_Remove=getText(driver, Surcharge_remove_Popup);
				if(Manual_Surcharge_Remove_Popup.equals(surcharge_Remove)) {
				System.out.println("Matched || Expected value was : "+Manual_Surcharge_Remove_Popup+" || Actual value was : "+surcharge_Remove);
				Extent_pass(driver, "Matched || Expected value was : "+Manual_Surcharge_Remove_Popup+" || Actual value was : "+surcharge_Remove, test, test1);
			}
			else {
				System.out.println("NotMatched || Expected value was : "+Manual_Surcharge_Remove_Popup+" || Actual value was : "+surcharge_Remove);
				Extent_fail(driver,  "NotMatched || Expected value was : "+Manual_Surcharge_Remove_Popup+" || Actual value was : "+surcharge_Remove, test, test1);
			}
				
				waitForElement(driver, Surcharge_Remove_yesBtn);
				click(driver, Surcharge_Remove_yesBtn);
				Step_End(14,"Surcharge will the cleared from the surcharge table.", test, test1);

				Step_Start(15,"click apply button.", test, test1);

				waitForElement(driver, SurCharge_ApplyBtn);
				click(driver, SurCharge_ApplyBtn);

				Step_End(15,"click apply button.", test, test1);

				scrollTop(driver);

				Step_Start(16,"Click Save button in the tool bar.", test, test1);
				waitForElement(driver, Rate_SaveBtn);
				click(driver, Rate_SaveBtn);
				Step_End(16,"Click Save button in the tool bar.", test, test1);

				waitForElement(driver, save_pending_popup);
				String SaveRate_PopUp2= getText(driver, save_pending_popup);

				if(isDisplayed(driver, save_pending_popup)){
					if(submit_msg.equals(SaveRate_PopUp2)) {
						System.out.println("Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2);
						Extent_pass(driver, "Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2, test, test1);

						Step_Start(17,"Click Submit.", test, test1);

						waitForElement(driver, Rate_SubmitBtn);
						click(driver, Rate_SubmitBtn);
						System.out.println("Submit button clicked");
					}
					else {
						System.out.println("NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2);
						Extent_fail(driver,  "NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp2, test, test1);
					}
				}
				else {
					System.out.println("submit popup was not displayed");
					Extent_fail(driver, "submit popup was not displayed", test, test1);
				}

				Step_End(17,"Click Submit.", test, test1);

				Step_Start(17,"Click Ok", test, test1);


				waitForElement(driver, Yes_Btn);
				safeclick(driver, Yes_Btn);
				System.out.println("Rate Request saved");

				Step_End(17,"Click Ok", test, test1);


				waitForElement(driver, status_Field);
				String status2=getAttribute(driver, status_Field, "value");
				if(status2.equals(status_value)) {
					System.out.println("Rate Request Submitted");
					System.out.println("Matched || Expected value was : "+status_value+" || Actual value was : "+status2);
					Extent_pass(driver, "Matched || Expected value was : "+status_value+" || Actual value was : "+status2, test, test1);
				}
				else {
					System.out.println("NotMatched || Expected value was : "+status_value+" || Actual value was : "+status2);
					Extent_fail(driver,  "NotMatched || Expected value was : "+status_value+" || Actual value was : "+status2, test, test1);
				}
	            waitForElement(driver, reqNo_Textfield);
				String Value3=getAttribute(driver, reqNo_Textfield, "value");
				System.out.println(Value3);
				Extent_call(test, test1, "Rate request delete starts");
				if(do_You_Want_Delete.equalsIgnoreCase("yes")) {

					waitForElement(driver, close_Tab);
					click(driver, close_Tab);

					waitForElement(driver, Module_SearchR);
					sendKeys(driver, Module_SearchR, ModuleName1);


					waitForElement(driver, SRR_Gate);
					click(driver, SRR_Gate);

					//SRR Gate

					waitForElement(driver, srrGate_Tab);
					if (isDisplayed(driver, srrGate_Tab)) {
						Extent_pass(driver, "SRR Gate Page is displayed", test, test1);
						System.out.println("SRR Gate Page is displayed");
					} else {
						System.out.println("SRR Gate Page is not displayed");
						Extent_fail(driver, "SRR Gate Page is not displayed", test, test1);
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
					waitForElement(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, Value3);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNum3=getText(driver, select_Actual_ReqNo);
					if(submitted_ReqNum3.equals(Value3)) {
						System.out.println("Matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + submitted_ReqNum3);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + Value3 + " || ActualValue is : " + submitted_ReqNum3,test, test1);
						Extent_pass(driver, Value3+"  is submitted", test, test1);
						System.out.println(Value3+" is submitted");

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver, close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);

					}else {
						System.out.println("Not matched || " + " Expected Value is : " + Value3 + " || Actual Value  is : " + submitted_ReqNum3);
						System.out.println(Value3+" is not submitted");
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + submitted_ReqNum3,test, test1);
						Extent_fail(driver, Value3+" Error is not displayed", test, test1);
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
					sendKeys(driver, filter_Inputfield, Value3);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNum3=getText(driver, select_Actual_ReqNo);
					if(pending_ReqNum3.equals(Value3)) {
						System.out.println("Matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + pending_ReqNum3);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + Value3 + " || ActualValue is : " + pending_ReqNum3,test, test1);
						Extent_pass(driver, Value3+"  is submitted", test, test1);
						System.out.println(Value3+" is submitted");

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
						System.out.println("Not matched || " + " Expected Value is : " + Value3 + " || Actual Value  is : " + pending_ReqNum3);
						System.out.println(Value3+" is not submitted");
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value3 + " || Actual Value is : " + pending_ReqNum3,test, test1);
						Extent_fail(driver, Value3+" Error is not displayed", test, test1);
					}	

					Extent_call(test, test1, "Rate request delete ends");
				}
				Extent_completed(testcase_Name15, test, test1);

				  waitForElement(driver, srrGate_Tab);
				  click(driver, srrGate_Tab);
				  		waitForElement(driver, close_Tab);
				  		click(driver, close_Tab);
				  		waitForElement(driver, close_Tab);
				  		click(driver, close_Tab);
				}    
			
		}
		
		int tc16=1;
		
		if(tc16 == 1) {
			

			String testcase_Name16="TC_Rate_Request_SC16";
			String File_Path16 = TestNgXml.getfilePath_FromExecution().get(testcase_Name16);
			String Sheet_Name16 = TestNgXml.getsheetName_FromExecution().get(testcase_Name16);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name16, testcase_Name16, "Dataset" + selected_dataset,
					File_Path16);


			String Field_Names =Data.get("ModuleName");
			String Origin = Data.get("Origin");
			String Delivery = Data.get("Delivery");
			String Commodity = Data.get("Commodity");
			String Eqp_type = Data.get("Eqp_type");
			String GrossWeight = Data.get("GrossWeight");
			String Exp_Detention_Days = Data.get("Exp_Detention_Days");
			String Exp_Demurrage = Data.get("Exp_Demurrage");
			String Imp_Detention_Days = Data.get("Imp_Detention_Days");
			String Imp_Demurrage = Data.get("Imp_Demurrage");
			String Ofr_Value = Data.get("Ofr_Value");
			String Loc_Agency = Data.get("Loc_Agency");
			String submit_msg = Data.get("submit_msg");
			String status_value = Data.get("status_value");
			String ModuleName1 = Data.get("ModuleName1");
			String Non_Containerized = Data.get("Non_Containerized");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String Routing_Origin = Data.get("Routing_Origin");
			String Routing_Service = Data.get("Routing_Service");
			String Customer_Code = Data.get("Cust_code");
			String Customer_code_Value = Data.get("Customer_code_Value");
			String Condition_Value = Data.get("Condition_Value");
			String From_Date_Input =Data.get( "From_Date_Input");
			String From_date_perform =Data.get( "From_date_perform");
			String To_Date_Input =Data.get( "To_Date_Input");
			String To_date_perform =Data.get( "To_date_perform");
			String Eqp_Quantity_Input =Data.get( "Eqp_Quantity_Input");
			String do_You_Want_Delete = Data.get("Do_You_Want_Delete").trim();
			Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

			Extent_Start(testcase_Name16, test, test1);

			

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
			click(driver, Rate_Newbutton);

			// non containerized radio btn

			if (Non_Containerized.equals("YES")) {
				waitForElement(driver, non_containradio_btn);
				safeclick(driver, non_containradio_btn);
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
			Extent_call(test, test1, "selecting the from date");
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
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			Extent_call(test, test1, "selecting the TO date");
			waitForElement(driver, Dateclick1);
			if (To_date_perform.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick1);
				clearAndType(driver, Dateclick1, To_Date_Input);
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
				Assert.fail("The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup);
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
				sendKeys(driver, Orgin_Input, Origin);
				waitForElement(driver, Origin_Value);
				waitForElement(driver, Auto_Panel_First);
				click(driver, Auto_Panel_First);
				System.out.println("origin Value:"+Origin);

				Step_End(3, "Enter the origin", test, test1);

				Step_Start(4, "Enter the Delivery", test, test1);

				waitForElement(driver, Delivery_Input);
				sendKeys(driver, Delivery_Input, Delivery);
				waitForElement(driver, Delivery_Value);
				waitForElement(driver, Auto_Panel_First);
				click(driver, Auto_Panel_First);
				System.out.println("Delivery Value:"+Delivery);

				Step_End(4, "Enter the Delivery", test, test1);

				Step_Start(5, "Enter the Commodity", test, test1);

				waitForElement(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, Commodity);
				waitForElement(driver, Commodity_Value);
				waitForElement(driver, Auto_Panel_First);
				click(driver, Auto_Panel_First);
				System.out.println("Commodity Value:"+Commodity);

				Step_End(5, "Enter the Commodity", test, test1);

				Step_Start(6, "Enter the rate calculation type", test, test1);

				
				
				waitForElement(driver, Eqp_Type);
				click(driver, Eqp_Type);
				sendKeys(driver, Eqp_Type, Eqp_type);
				waitForElement(driver, Eqp_Type_Value);
				waitForElement(driver, Auto_Panel_First);
				click(driver, Auto_Panel_First);
				System.out.println("Eqp type:"+Eqp_type);
				

				Step_End(6, "Enter the rate calculation type", test, test1);


				Step_Start(7, "Enter the Quantity", test, test1);
				waitForElement(driver, Eqp_Quantity);
				click(driver, Eqp_Quantity);
				Newclear(driver, Eqp_Quantity);
				Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
				Step_End(7, "Enter the Quantity", test, test1);

				Step_Start(8, "Enter the Gross Weigh", test, test1);

				waitForElement(driver, Gross_Weight);
				click(driver, Gross_Weight);
				clearAndType(driver, Gross_Weight, GrossWeight);
				System.out.println("Gross weight:"+GrossWeight);

				Step_End(8, "Enter the Gross Weigh", test, test1);

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
				sendKeys(driver, Exp_Days, Exp_Detention_Days);
				waitForElement(driver, Imp_Days);
				sendKeys(driver, Imp_Days, Imp_Detention_Days);
				waitForElement(driver, Exp_Demurage);
				sendKeys(driver, Exp_Demurage, Exp_Demurrage);
				waitForElement(driver, Imp_Demurage);
				sendKeys(driver, Imp_Demurage, Imp_Demurrage);

				Step_Start(9, "Click routing", test, test1);

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
					sendKeys(driver, Routing_OriginTF, Routing_Origin);
					waitForElement(driver, Routing_service_TF);
					sendKeys(driver, Routing_service_TF, Routing_Service);
					doubleClick(driver, select_First_Routing);

				}else {
					System.out.println(actRoutingFrame+" is not displayed");
					Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
				}

				Step_End(10, "Select the routing", test, test1);

				Step_Start(11, "Enter the OFR", test, test1);

				waitForElement(driver, OFR_Txt_Field);
				click(driver, OFR_Txt_Field);
				clear(driver, OFR_Txt_Field);
				sendKeys(driver, OFR_Txt_Field, Ofr_Value);
				System.out.println("OFR Value:"+Ofr_Value);

				Step_End(11, "Enter the OFR", test, test1);

				Step_Start(12, "Click Add.Click on the autorated surcharge in the surcharge table", test, test1);


				click(driver, Rate_AddBtn);

				Step_End(12, "Click Add.Click on the autorated surcharge in the surcharge table", test, test1);

				Step_Start(13, "Enter the surcharge amount in the agency(LOC) column", test, test1);
				waitForElement(driver, Surcharge_Edit);
				click(driver, Surcharge_Edit);
				System.out.println("Column clicked");
				Newclear_Type(driver);
				System.out.println("Cleared");
				waitForElement(driver, Surcharge_Edit);
				Actionsendkeys(driver, Surcharge_Edit, Loc_Agency);
				System.out.println("Value entered");

				Step_End(13, "Enter the surcharge amount in the agency(LOC) column", test, test1);
				

				Step_Start(14, "click apply button", test, test1);


				waitForElement(driver, SurCharge_ApplyBtn);
				click(driver, SurCharge_ApplyBtn);

				Step_Start(14, "click apply button", test, test1);
waitForElement(driver, Surcharge);
		String SurCharge_Amount=getText(driver, Surcharge);
		if(Loc_Agency.equals(SurCharge_Amount)) {
			System.out.println("Matched || Expected value was : "+Loc_Agency+" || Actual value was : "+SurCharge_Amount);
			Extent_pass(driver, "Matched || Expected value was : "+Loc_Agency+" || Actual value was : "+SurCharge_Amount, test,test1);

		}
		else {
			System.out.println("NotMatched || Expected value was : "+Loc_Agency+" || Actual value was : "+SurCharge_Amount);
			Extent_fail(driver,  "NotMatched || Expected value was : "+Loc_Agency+" || Actual value was : "+SurCharge_Amount, test,test1);
		}
				Step_Start(15, "Click Save button in the tool bar", test, test1);

				waitForElement(driver, surcharge_grid_R);
				waitForElement(driver, surcharge_first_data);
				click(driver, surcharge_first_data);
				System.out.println("surcharge first grid was clicked");
				List<WebElement> grid_data3 = listOfElements(driver, Grid_Data);
				int grid_size3=grid_data3.size();
				System.out.println("size: "+grid_size3);
				int last_data_index3=grid_size3-1;
				String grid_last_data3 =  String.format(Rate_Request_Loactors.grid_LastValue,  last_data_index3); 

				System.out.println("grid was scrolled down");
				waitForElement(driver, grid_last_data3);
				click(driver, grid_last_data3);
				System.out.println("surcharge last grid was clicked");

				waitForElement(driver, Rate_SaveBtn);
				safeclick(driver, Rate_SaveBtn);
				waitForElement(driver, save_pending_popup);

				Step_End(15, "Click Save button in the tool bar", test, test1);


				Step_Start(16, "Click submit", test, test1);
				waitForElement(driver, save_pending_popup);
				String SaveRate_PopUp3= getText(driver, save_pending_popup);

				if(isDisplayed(driver, save_pending_popup)){
					if(submit_msg.equals(SaveRate_PopUp3)) {
						System.out.println("Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp3);
						Extent_pass(driver, "Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp3, test,test1);
						waitForElement(driver, Rate_SubmitBtn);
						click(driver, Rate_SubmitBtn);
						System.out.println("Submit button clicked");
					}
					else {
						System.out.println("NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp3);
						Extent_fail(driver,  "NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp3, test,test1);
					}
				}
				else {
					System.out.println("submit popup was not displayed");
					Extent_fail(driver, "submit popup was not displayed", test,test1);
				}

				Step_End(16, "Click submit", test, test1);


				Step_Start(17, "Click Ok", test, test1);

				waitForElement(driver, Yes_Btn);
				click(driver, Yes_Btn);
				System.out.println("Rate Request saved");



				waitForElement(driver, status_Field);
				String status3=getAttribute(driver, status_Field, "value");
				if(status3.equals(status_value)) {
					System.out.println("Rate Request Submitted");
					System.out.println("Matched || Expected value was : "+status_value+" || Actual value was : "+status3);
					Extent_pass(driver, "Matched || Expected value was : "+status_value+" || Actual value was : "+status3, test,test1);
				}
				else {
					System.out.println("NotMatched || Expected value was : "+status_value+" || Actual value was : "+status3);
					Extent_fail(driver,  "NotMatched || Expected value was : "+status_value+" || Actual value was : "+status3, test,test1);
				}

				Step_End(17, "Click Ok", test, test1);

				waitForElement(driver,reqNo_Textfield);
				String Value5=getAttribute(driver, reqNo_Textfield, "value");
				System.out.println("Req.No:"+Value5);


				if(do_You_Want_Delete.equalsIgnoreCase("yes")) {

					Extent_call(test, test1, "Rate request delete starts");
					waitForElement(driver,close_Tab);
					click(driver, close_Tab);

					waitForElement(driver,Module_SearchR);
					sendKeys(driver, Module_SearchR, ModuleName1);

					waitForElement(driver, SRR_Gate);
					click(driver, SRR_Gate);

					//SRR Gate

					waitForElement(driver, srrGate_Tab);
					if (isDisplayed(driver, srrGate_Tab)) {
						Extent_pass(driver, "SRR Gate Page is displayed", test,test1);
						System.out.println("SRR Gate Page is displayed");
					} else {
						Extent_fail(driver, "SRR Gate Page is not displayed", test,test1);
						System.out.println("SRR Gate Page is not displayed");
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
					waitForElement(driver,filter_Inputfield);
					Actionsendkeys(driver, filter_Inputfield, Value5);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNum5=getText(driver, select_Actual_ReqNo);
					if(submitted_ReqNum5.equals(Value5)) {
						System.out.println("Matched || " + " Expected Value is : " + Value5 + " || Actual Value is : " + submitted_ReqNum5);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + Value5 + " || ActualValue is : " + submitted_ReqNum5,test,test1);
						Extent_pass(driver, Value5+"  is submitted", test,test1);
						System.out.println(Value5+" is submitted");

						click(driver, select_Actual_ReqNo);
						waitForElement(driver,select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver,close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);

					}else {
						System.out.println("Not matched || " + " Expected Value is : " + Value5 + " || Actual Value  is : " + submitted_ReqNum5);
						System.out.println(Value5+" is not submitted");
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value5 + " || Actual Value is : " + submitted_ReqNum5,test,test1);
						Extent_fail(driver, Value5+" Error is not displayed", test,test1);
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
					waitForElement(driver,filter_Inputfield);
					sendKeys(driver, filter_Inputfield, Value5);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNum5=getText(driver, select_Actual_ReqNo);
					if(pending_ReqNum5.equals(Value5)) {
						System.out.println("Matched || " + " Expected Value is : " + Value5 + " || Actual Value is : " + pending_ReqNum5);
						System.out.println(Value5+" is submitted");
						Extent_pass(driver,"Matched || " + " Expected Value is : " + Value5 + " || ActualValue is : " + pending_ReqNum5,test,test1);
						Extent_pass(driver, Value5+"  is submitted", test,test1);

						click(driver, select_Actual_ReqNo);
						waitForElement(driver,select_Actual_ReqNo);
						doubleClick(driver, select_Actual_ReqNo);
						waitForElement(driver, delete_Button_Toolbar);
						click(driver, delete_Button_Toolbar);

						waitForElement(driver, delete_Request_Popup);
						click(driver, delete_Request_Popup_Ok);

						waitForElement(driver, comment_Ok_Button);
						click(driver, comment_Ok_Button);


					}else {
						System.out.println("Not matched || " + " Expected Value is : " + Value5 + " || Actual Value  is : " + pending_ReqNum5);
						System.out.println(Value5+" is not submitted");
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value5 + " || Actual Value is : " + pending_ReqNum5,test,test1);
						Extent_fail(driver, Value5+" Error is not displayed", test,test1);
					}	

					Extent_call(test, test1, "Rate request delete ends");
				}

				Extent_completed(testcase_Name16, test, test1);
			
				  
				  waitForElement(driver, srrGate_Tab);
				  click(driver, srrGate_Tab);
				  		waitForElement(driver, close_Tab);
				  		click(driver, close_Tab);
				  		waitForElement(driver, close_Tab);
				  		click(driver, close_Tab);
			 
					}
			
		}
		
		int tc17=1;
		
		if(tc17 == 1) {
			
			String testcase_Name17="TC_Rate_Request_SC17";
			String File_Path17 = TestNgXml.getfilePath_FromExecution().get(testcase_Name17);
			String Sheet_Name17 = TestNgXml.getsheetName_FromExecution().get(testcase_Name17);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name17, testcase_Name17, "Dataset" + selected_dataset,
					File_Path17);


			
			String Field_Names = Data.get("ModuleName");
			String Cust_Code_New = Data.get("Cust_Code_New");
			String Origin1 = Data.get("Origin1");
			String Delivery1 = Data.get("Delivery1");
			String Commodity1 = Data.get("Commodity1");
			String Eqp_type1 = Data.get("Eqp_type1");
			String GrossWeight1 = Data.get("GrossWeight1");
			String Exp_Detention_Days1 = Data.get("Exp_Detention_Days1");
			String Exp_Demurrage1 = Data.get("Exp_Demurrage1");
			String Imp_Detention_Days1 = Data.get("Imp_Detention_Days1");
			String Imp_Demurrage1 = Data.get("Imp_Demurrage1");
			String Ofr_Value2 = Data.get("Ofr_Value2");
			String submit_msg = Data.get("submit_msg");
			String ModuleName1 = Data.get("ModuleName1");
			String status_value = Data.get("status_value");
			String Non_Containerized = Data.get("Non_Containerized");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String Customer_Code = Data.get("Cust_code");
			String Customer_code_Value = Data.get("Customer_code_Value");
			String Condition_Value = Data.get("Condition_Value");
			String From_Date_Input =Data.get( "From_Date_Input");
			String From_date_perform =Data.get( "From_date_perform");
			String To_Date_Input =Data.get( "To_Date_Input");
			String To_date_perform =Data.get( "To_date_perform");
			String Routing_Origin = Data.get("Routing_Origin");
			String Eqp_Quantity_Input = Data.get("Eqp_Quantity_Input");
			String Routing_Service = Data.get("Routing_Service");
			Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			String do_You_Want_Delete = Data.get("Do_You_Want_Delete").trim();
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
			

			Extent_Start(testcase_Name17, test, test1);


		
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
	     

			waitForElement(driver, Rate_Newbutton);
			click(driver, Rate_Newbutton);
			
			waitForElement(driver, tService_Dropdown);
			click(driver, tService_Dropdown);
			waitForElement(driver, select_t_Service);
			click(driver, select_t_Service);
			
			waitForElement(driver, TOS_Dropdown);
			click(driver, TOS_Dropdown);
			waitForElement(driver, tos);
			click(driver, tos);

			// Selecting the From Date
		
			
			Extent_call(test, test1, "Selecting the FROM DATE");
			waitForElement(driver, Dateclick);
			if (From_date_perform.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick);
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
					waitForElement(driver, date_select);
					click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			Extent_call(test, test1, "Selecting the TO date");
					waitForElement(driver, Dateclick1);
					if (To_date_perform.equalsIgnoreCase("Yes")) {
						click(driver, Dateclick1);
						datePicker(To_Date_Input, day, month, year);
						waitForElement(driver, Month_DD);
						selectByText(driver, Month_DD,month.toString());
						waitForElement(driver, Year_DD);
						selectByText(driver, Year_DD,year.toString());
						String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
							waitForElement(driver, date_select);
							click(driver, date_select);
					} else {
						waitForElement(driver, Dateclick1);
						clearAndType(driver, Dateclick1, To_Date_Input);
					}

			// non containerized radio btn

			if (Non_Containerized.equalsIgnoreCase("YES")) {
				waitForElement(driver, non_containradio_btn);
				safeclick(driver, non_containradio_btn);
			}


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

			waitForDisplay(driver, CustName_ExitBtn);
			if(isDisplayed(driver, CustName_ExitBtn)) {
				waitForElement(driver, CustName_ExitBtn);
				click(driver, CustName_ExitBtn);
			}
			

			System.out.println("Cust Name Entered");
			
			waitForElement(driver, Cust_NameInput);
			String Customer= getAttribute(driver, Cust_NameInput, "value");
			System.out.println(Customer);
			waitForElement(driver, Orgin_Input);  
			click(driver, Orgin_Input);
			Actionsendkeys(driver, Orgin_Input, Origin1);
			waitForElement(driver, Origin_Value);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			System.out.println("Origin:"+Origin1);


			waitForElement(driver, Delivery_Input);
			sendKeys(driver, Delivery_Input, Delivery1);
			waitForElement(driver, Delivery_Value);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			System.out.println("Delivery:"+Delivery1);

			waitForElement(driver, Commodity_Input);
			sendKeys(driver, Commodity_Input, Commodity1);
			waitForElement(driver, Commodity_Value);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			System.out.println("Commodity:"+Commodity1);

			waitForElement(driver, Eqp_Type);
			click(driver, Eqp_Type);
			sendKeys(driver, Eqp_Type, Eqp_type1);
			waitForElement(driver, Eqp_Type_Value);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			System.out.println("Eqp_Type_Value:"+Eqp_type1);

			waitForElement(driver, Eqp_Quantity);
			click(driver, Eqp_Quantity);
			Newclear(driver, Eqp_Quantity);
			Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
			waitForElement(driver, Gross_Weight);
			click(driver, Gross_Weight);

			clearAndType(driver, Gross_Weight, GrossWeight1);
			System.out.println("Gross weight:"+GrossWeight1);


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
			sendKeys(driver, Exp_Days, Exp_Detention_Days1);
			waitForElement(driver, Imp_Days);
			sendKeys(driver, Imp_Days, Imp_Detention_Days1);
			waitForElement(driver, Exp_Demurage);
			sendKeys(driver, Exp_Demurage, Exp_Demurrage1);
			waitForElement(driver, Imp_Demurage);
			sendKeys(driver, Imp_Demurage, Imp_Demurrage1);

			click(driver, Routing_Button);

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
					doubleClick(driver, select_First_Routing);

				}else {
					Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
					System.out.println(actRoutingFrame+" is not displayed");
				}
	        


			waitForElement(driver, OFR_Txt_Field);
			click(driver, OFR_Txt_Field);
			clear(driver, OFR_Txt_Field);
			sendKeys(driver, OFR_Txt_Field, Ofr_Value2);
			System.out.println("OFR Value:"+Ofr_Value2);
			click(driver, Rate_AddBtn);


			waitForElement(driver, Rate_SaveBtn);
			click(driver, Rate_SaveBtn);
			waitForElement(driver, save_pending_popup);
			String SaveRate_PopUp4= getText(driver, save_pending_popup);

			if(isDisplayed(driver, save_pending_popup)){
				if(submit_msg.equals(SaveRate_PopUp4)) {
					System.out.println("Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp4);
					Extent_pass(driver, "Matched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp4, test,test1);
					waitForElement(driver, Rate_SubmitBtn);
					click(driver, Rate_SubmitBtn);
					System.out.println("Submit button clicked");
				}
				else {
					System.out.println("NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp4);
					Extent_fail(driver,  "NotMatched || Expected value was : "+submit_msg+" || Actual value was : "+SaveRate_PopUp4, test,test1);
				}
			}
			else {
				System.out.println("submit popup was not displayed");
				Extent_fail(driver, "submit popup was not displayed", test,test1);
			}


			waitForElement(driver, Yes_Btn);
			click(driver, Yes_Btn);
			System.out.println("Rate Request saved");

			
			
			waitForElement(driver, status_Field);

			String status4=getAttribute(driver, status_Field, "value");
			if(status4.equals(status_value)) {
				System.out.println("Rate Request Submitted");
				System.out.println("Matched || Expected value was : "+status_value+" || Actual value was : "+status4);
				Extent_pass(driver, "Matched || Expected value was : "+status_value+" || Actual value was : "+status4, test,test1);
			}
			else {
				System.out.println("NotMatched || Expected value was : "+status_value+" || Actual value was : "+status4);
				Extent_fail(driver,  "NotMatched || Expected value was : "+status_value+" || Actual value was : "+status4, test,test1);
			}


			String Value4=getAttribute(driver, reqNo_Textfield, "value");
			System.out.println(Value4);

			
			
			//1   
			Step_Start(1, "Click on the search icon in the toolbar", test, test1);


			waitForElement(driver, global_search_R);
			click(driver, global_search_R);
			waitForElement(driver, global_search_input_R);
			sendKeys(driver, global_search_input_R, Value4);
			waitForElement(driver, global_search_btn_R);
			click(driver, global_search_btn_R);

			waitForElement(driver, global_select_Button);
			click(driver, global_select_Button);

			Step_End(1, "Click on the search icon in the toolbar", test, test1);


			Step_Start(2, "Click save as icon in the toolbar", test, test1);

			waitForElement(driver, Save_As_Btn);
			click(driver, Save_As_Btn);

			Step_End(2, "Click save as icon in the toolbar", test, test1);


			Step_Start(3, "Click yes to enable the rate request in save as mode", test, test1);


			waitForElement(driver, SaveAs_YesBtn);
			click(driver, SaveAs_YesBtn);


			Step_End(3, "Click yes to enable the rate request in save as mode", test, test1);

			Step_Start(4, "Change the customer in the customer field", test, test1);


		     waitForElement(driver, Customer_Name_search_button);
				click(driver, Customer_Name_search_button);
				waitForElement(driver, Customer_Code_Select_dropdown);
				click(driver, Customer_Code_Select_dropdown);
				selectByText(driver, Customer_Code_Select_dropdown, Customer_Code);
				click(driver, CustomerSearch_Condition_Dropdown1);
				selectByText(driver,CustomerSearch_Condition_Dropdown1, Condition_Value);
				sendKeys(driver, CustomerSearch_InputTextfield1, Cust_Code_New);
				click(driver, CustomerSearch_Frame_SearchButton);
				waitForDisplay(driver, pop_up_exp);
				if(isDisplayed(driver,pop_up_exp )) {
					String actual_Popup = getText(driver, pop_up_exp);
					System.out.println("The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup);
					Extent_fail(driver, "The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup, test, test1);
				}
				waitForElement(driver, Customer_Select);
				doubleClick(driver, Customer_Select);

			waitForDisplay(driver, CustName_ExitBtn);
			if(isDisplayed(driver, CustName_ExitBtn)) {
				waitForElement(driver, CustName_ExitBtn);
				click(driver, CustName_ExitBtn);
			}

			Step_End(4, "Change the customer in the customer field", test, test1);


			Step_Start(5, "Click Save button in the tool bar", test, test1);

			waitForElement(driver, Rate_SaveBtn);
			click(driver, Rate_SaveBtn); 

			Step_End(5, "Click Save button in the tool bar", test, test1);

			Step_Start(6, "Click submit", test, test1);

			waitForElement(driver, Rate_SubmitBtn);
			click(driver, Rate_SubmitBtn);

			Step_End(6, "Click submit", test, test1);

			Step_Start(7, "Click Ok", test, test1);

			waitForElement(driver, Yes_Btn);
			click(driver, Yes_Btn);
			waitForElement(driver, reqNo_Textfield);
			String Value=getAttribute(driver, reqNo_Textfield, "value");
			System.out.println(Value);
			Step_End(7, "Click Ok", test, test1);
			
			
			waitForElement(driver, Cust_NameInput);
			String New_Customer= getAttribute(driver, Cust_NameInput, "value");
			if(!Customer.equals(New_Customer)) {
				System.out.println("Rate Request Submitted");
				System.out.println("Matched || Expected value was : "+Customer+" || Actual value was : "+New_Customer);
				Extent_pass(driver, "Matched || Expected value was : "+Customer+" || Actual value was : "+New_Customer, test,test1);
			}
			else {
				System.out.println("NotMatched || Expected value was : "+Customer+" || Actual value was : "+New_Customer);
				Extent_fail(driver,  "NotMatched || Expected value was : "+Customer+" || Actual value was : "+New_Customer, test,test1);
			}
			Extent_call(test, test1, "Rate request delete starts");
			
			if(do_You_Want_Delete.equalsIgnoreCase("yes")) {
				Extent_call(test, test1, "Rate request delete starts");
		           waitForElement(driver,close_Tab);
			click(driver, close_Tab);
			waitForElement(driver,Module_SearchR);
			sendKeys(driver, Module_SearchR, ModuleName1);
			
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
			sendKeys(driver, filter_Inputfield, Value4);
			enter(driver);

			waitForElement(driver, select_Actual_ReqNo);
			String submitted_ReqNum1=getText(driver, select_Actual_ReqNo);
			if(submitted_ReqNum1.equals(Value4)) {
				System.out.println("Matched || " + " Expected Value is : " + Value4 + " || Actual Value is : " + submitted_ReqNum1);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + Value4 + " || ActualValue is : " + submitted_ReqNum1,test,test1);
				Extent_pass(driver, Value4+"  is submitted", test,test1);
				System.out.println(Value4+" is submitted");
				waitForElement(driver, select_Actual_ReqNo);
				click(driver, select_Actual_ReqNo);
				waitForElement(driver, select_Actual_ReqNo);
				RightClick(driver, select_Actual_ReqNo);
				waitForElement(driver, moveTo_Pending);
				click(driver, moveTo_Pending);
				waitForElement(driver, close_Moved_Pending_Popup);
				click(driver, close_Moved_Pending_Popup);
			}else {
				System.out.println("Not matched || " + " Expected Value is : " + Value4 + " || Actual Value  is : " + submitted_ReqNum1);
				System.out.println(Value4+" is not submitted");
				Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value4 + " || Actual Value is : " + submitted_ReqNum1,test,test1);
				Extent_fail(driver, Value4+" Error is not displayed", test,test1);
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
			sendKeys(driver, filter_Inputfield, Value4);
			enter(driver);

			waitForElement(driver, select_Actual_ReqNo);
			String pending_ReqNum1=getText(driver, select_Actual_ReqNo);
			if(pending_ReqNum1.equals(Value4)) {
				System.out.println("Matched || " + " Expected Value is : " + Value4 + " || Actual Value is : " + pending_ReqNum1);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + Value4 + " || ActualValue is : " + pending_ReqNum1,test,test1);
				
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

				Extent_pass(driver, Value4+"  is Deleted", test,test1);
				System.out.println(Value4+" is Deleted");
			}else {
				System.out.println("Not matched || " + " Expected Value is : " + Value4 + " || Actual Value  is : " + pending_ReqNum1);
				System.out.println(Value4+" is not Deleted");
				Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value4 + " || Actual Value is : " + pending_ReqNum1,test,test1);
				Extent_fail(driver, Value4+" is not Deleted", test,test1);
			}	
			Extent_call(test, test1, "Rate request Delete Ended");
			waitForElement(driver, srrGate_Module);
			click(driver, srrGate_Module);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			}
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
			
			waitForElement(driver,Module_SearchR);
			sendKeys(driver, Module_SearchR, ModuleName1);
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
			sendKeys(driver, filter_Inputfield, Value);
			enter(driver);

			waitForElement(driver, select_Actual_ReqNo);
			String submitted_ReqNum1=getText(driver, select_Actual_ReqNo);
			if(submitted_ReqNum1.equals(Value)) {
				System.out.println("Matched || " + " Expected Value is : " + Value + " || Actual Value is : " + submitted_ReqNum1);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + Value + " || ActualValue is : " + submitted_ReqNum1,test,test1);
				Extent_pass(driver, Value+"  is submitted", test,test1);
				System.out.println(Value+" is submitted");
				waitForElement(driver, select_Actual_ReqNo);
				click(driver, select_Actual_ReqNo);
				waitForElement(driver, select_Actual_ReqNo);
				RightClick(driver, select_Actual_ReqNo);
				waitForElement(driver, moveTo_Pending);
				click(driver, moveTo_Pending);
				waitForElement(driver, close_Moved_Pending_Popup);
				click(driver, close_Moved_Pending_Popup);
			}else {
				System.out.println("Not matched || " + " Expected Value is : " + Value + " || Actual Value  is : " + submitted_ReqNum1);
				System.out.println(Value+" is not submitted");
				Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value + " || Actual Value is : " + submitted_ReqNum1,test,test1);
				Extent_fail(driver, Value+" Error is not displayed", test,test1);
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
			sendKeys(driver, filter_Inputfield, Value);
			enter(driver);

			waitForElement(driver, select_Actual_ReqNo);
			String pending_ReqNum1=getText(driver, select_Actual_ReqNo);
			if(pending_ReqNum1.equals(Value)) {
				System.out.println("Matched || " + " Expected Value is : " + Value + " || Actual Value is : " + pending_ReqNum1);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + Value + " || ActualValue is : " + pending_ReqNum1,test,test1);
				
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

				Extent_pass(driver, Value+"  is Deleted", test,test1);
				System.out.println(Value+" is Deleted");
			}else {
				System.out.println("Not matched || " + " Expected Value is : " + Value + " || Actual Value  is : " + pending_ReqNum1);
				System.out.println(Value+" is not Deleted");
				Extent_fail(driver,"Not matched || " + " Expected Value is : " + Value + " || Actual Value is : " + pending_ReqNum1,test,test1);
				Extent_fail(driver, Value+" is not Deleted", test,test1);
			}	
			Extent_call(test, test1, "Rate request Delete Ended");
			waitForElement(driver, srrGate_Module);
			click(driver, srrGate_Module);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			}
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
				Extent_call(test, test1, "Rate request delete ended ");
			  
				Extent_completed(testcase_Name17, test, test1);

				
			
		}
		
		int tc18=1;
		
		if(tc18 == 1) {
			
			String testcase_Name18="TC_Rate_Request_SC18";
			String File_Path18 = TestNgXml.getfilePath_FromExecution().get(testcase_Name18);
			String Sheet_Name18 = TestNgXml.getsheetName_FromExecution().get(testcase_Name18);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name18, testcase_Name18, "Dataset" + selected_dataset,
					File_Path18);
			
				
				String Field_Names = Data.get("field_name");
				String Origin_Input = Data.get("Origin_Input");
				String Delivery_Input1 = Data.get("Dehlivery_Input");
				String Commodity_Input_Txt = Data.get("Commodity_Input");
				String Eqp_Type_Input = Data.get("Eqp_Type_Input");		
				String Eqp_Quantity_Input = Data.get("Eqp_Quantity_Input");
				String Gross_Weight_Input = Data.get("Gross_Weight_Input");
				String Exp_Det_Days_Input = Data.get("Exp_Det_Days_Input");
				String Imp_Det_Days_Input = Data.get("Imp_Det_Days_Input");
				String Exp_Demmurage_Input = Data.get("Exp_Demmurage_Input");
				String Imp_Demmurage_Input = Data.get("Imp_Demmurage_Input");
				String OFR_Txt_Field_Input = Data.get("OFR_Txt_Field_Input");
				String Req_Submit_Popup_Txt = Data.get("Req_Submit_Popup_Txt");
				String Resquest_Saved_Msg = Data.get("Resquest_Saved_Msg");
				String grid_Req_Status_Exp_TC18 = Data.get("grid_Req_Status_Exp_TC18");
				String Req_Status_Exp_TC18 = Data.get("Req_Status_Exp_TC18");
				String Non_Containerized = Data.get("Non_Containerized");
				String DG_checkboxs = Data.get("DG_checkboxs");
				String NOR_checkbox = Data.get("NOR_checkbox");
				String SOC_checkbox = Data.get("SOC_checkbox");
				String OOG_checkbox = Data.get("OOG_checkbox");
				String Routing_Origin = Data.get("Routing_Origin");
				String Routing_Service = Data.get("Routing_Service");
				String Customer_Code = Data.get("Cust_code");
				String Customer_code_Value = Data.get("Customer_code_Value");
				String Condition_Value = Data.get("Condition_Value");
				String From_Date_Input =Data.get( "From_Date_Input");
				String From_date_perform =Data.get( "From_date_perform");
				String To_Date_Input =Data.get( "To_Date_Input");
				String To_date_perform =Data.get( "To_date_perform");
				Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
				On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
				tService=Data.get("T_Service");
				TOS=Data.get("TOS_Option");
				String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
				String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

				String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
				String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
				
		
			//Login
			Extent_Start(testcase_Name18, test, test1);

			
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
			Extent_call(test, test1, "selecting from date");
			waitForElement(driver, Dateclick);
			if (From_date_perform.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick);
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
					waitForElement(driver, date_select);
					click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			Extent_call(test, test1, "selecting TO date");
					waitForElement(driver, Dateclick1);
					if (To_date_perform.equalsIgnoreCase("Yes")) {
						click(driver, Dateclick1);
						datePicker(To_Date_Input, day, month, year);
						waitForElement(driver, Month_DD);
						selectByText(driver, Month_DD,month.toString());
						waitForElement(driver, Year_DD);
						selectByText(driver, Year_DD,year.toString());
						String date_select =  String.format(Rate_Request_Loactors.date_select,  day); 
							waitForElement(driver, date_select);
							click(driver, date_select);
					} else {
						waitForElement(driver, Dateclick1);
						clearAndType(driver, Dateclick1, To_Date_Input);
					}
			
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
			waitForDisplay(driver, exit_Button);
			if(isDisplayed(driver, exit_Button)) {
				waitForElement(driver, exit_Button);
				click(driver, exit_Button);
			}
			
			  Step_End(2, "Enter the customer name", test, test1);
			
			
			  Step_Start(3, "Enter the origin", test, test1);
			
			waitForElement(driver, Orgin_Input);
			sendKeys(driver, Orgin_Input, Origin_Input);
			waitForElement(driver, Origin_Value);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			System.out.println("Origin:"+Origin_Input);

			Step_End(3, "Enter the origin", test, test1);
			
			
			Step_Start(4, "Enter the Delivery", test, test1);
			
			waitForElement(driver, Delivery_Input_Field);
			sendKeys(driver, Delivery_Input_Field, Delivery_Input1);
			waitForElement(driver, Delivery_Value);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);

			Step_End(4, "Enter the Delivery", test, test1);
			
			Step_Start(5, "Enter the Commodity", test, test1);
			
			waitForElement(driver, Commodity_Input);
			sendKeys(driver, Commodity_Input, Commodity_Input_Txt);
			waitForElement(driver, Commodity_Value);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(5, "Enter the Commodity", test, test1);

			Step_Start(6, "Enter the rate calculation type", test, test1);
			
			waitForElement(driver, Eqp_Type);
			click(driver, Eqp_Type);
			sendKeys(driver, Eqp_Type, Eqp_Type_Input);
			waitForElement(driver, Eqp_Type_Value);
			waitForElement(driver, Auto_Panel_First);
			click(driver, Auto_Panel_First);
			
			Step_End(6, "Enter the rate calculation type", test, test1);
			
		    Step_Start(7, "Enter the Quantity", test, test1);
		    waitForElement(driver, Eqp_Quantity);
			click(driver, Eqp_Quantity);
			Newclear(driver, Eqp_Quantity);
			Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
			Step_End(7, "Enter the Quantity", test, test1);
			
			Step_Start(8, "Enter the Gross Weight", test, test1);
			
			waitForElement(driver, Gross_Weight);
			Newclear(driver, Gross_Weight);
			Actionsendkeys(driver, Gross_Weight, Gross_Weight_Input);

			Step_End(8, "Enter the Gross Weight", test, test1);
			
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
		
			String Before_Tarriff_no = getText(driver, Retrived_Tariff_No);
			
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
					sendKeys(driver, Routing_OriginTF, Routing_Origin);
					waitForElement(driver, Routing_service_TF);
					sendKeys(driver, Routing_service_TF, Routing_Service);
					doubleClick(driver, select_First_Routing);

				}else {
					Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
					System.out.println(actRoutingFrame+" is not displayed");
				}
	        
			Step_End(10, "Select the routing", test, test1);
			
			Step_Start(11, "Enter the OFR greater than the tariff", test, test1);
			
			waitForElement(driver, OFR_Txt_Field);
			click(driver, OFR_Txt_Field);
			clear(driver, OFR_Txt_Field);
			sendKeys(driver, OFR_Txt_Field, OFR_Txt_Field_Input);
			
			Step_End(11, "Enter the OFR greater than the tariff", test, test1);
			
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
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Req_Submit_Popup_Txt + " || Actual Report Activity is : " + PopUp_Msg, test,test1); 
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
			String PopUp_Msg1=getText(driver, submitted_Popup);      
			System.out.println("PopUp_Msg : "+PopUp_Msg1);                                                                                                              
			if(Resquest_Saved_Msg.equals(PopUp_Msg1)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + Resquest_Saved_Msg + " || Actual Report Activity is : " + PopUp_Msg1);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Resquest_Saved_Msg + " || Actual Report Activity is : " + PopUp_Msg1, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + Resquest_Saved_Msg + " || Actual Report Activity is : " + PopUp_Msg1);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Resquest_Saved_Msg + " || Actual Report Activity is : " + PopUp_Msg1, test,test1); 
			} 

			waitForElement(driver, Req_No_Txt_Field); 
			String Act_Req_No=getAttribute(driver, Req_No_Txt_Field, "value");   
			System.out.println(Act_Req_No);
			waitForElement(driver, Retrived_Tariff_No); 
			String after_Tarriff_no = getText(driver, Retrived_Tariff_No);
			if(!(Before_Tarriff_no.equals(after_Tarriff_no))) {                                                                                                                  
				System.out.println("Matched || " + " The Retrived Tariff Number is : " + after_Tarriff_no);            
				Extent_pass(driver,"Matched || " + " The Retrived Tariff Number is : " + after_Tarriff_no, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || The Tariff Number is Not  Retrived");        
				Extent_fail(driver, "Not Matched || The Tariff Number is Not  Retrived", test,test1); 
			} 
			waitForElement(driver, Grid_Request_Status); 
			String act_Grid_ReqStatus = getText(driver, Grid_Request_Status);
			if(grid_Req_Status_Exp_TC18.equals(act_Grid_ReqStatus)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + grid_Req_Status_Exp_TC18 + " || Actual Report Activity is : " + act_Grid_ReqStatus);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + grid_Req_Status_Exp_TC18 + " || Actual Report Activity is : " + act_Grid_ReqStatus, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + grid_Req_Status_Exp_TC18 + " || Actual Report Activity is : " + act_Grid_ReqStatus);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + grid_Req_Status_Exp_TC18 + " || Actual Report Activity is : " + act_Grid_ReqStatus, test,test1); 
			} 
			waitForElement(driver, Request_Status); 
			String act_Req_Status = getAttribute(driver, Request_Status,"value");
			if(Req_Status_Exp_TC18.equals(act_Req_Status)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + Req_Status_Exp_TC18 + " || Actual Report Activity is : " + act_Req_Status);            
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Req_Status_Exp_TC18 + " || Actual Report Activity is : " + act_Req_Status, test,test1);     
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + Req_Status_Exp_TC18 + " || Actual Report Activity is : " + act_Req_Status);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Req_Status_Exp_TC18 + " || Actual Report Activity is : " + act_Req_Status, test,test1); 
			} 

			 waitForElement(driver,close_Tab);
				click(driver, close_Tab);

			Extent_completed(testcase_Name18, test, test1);
		 			}		
			
		 			
			
		}
		
		
		
		
		
	}
}
