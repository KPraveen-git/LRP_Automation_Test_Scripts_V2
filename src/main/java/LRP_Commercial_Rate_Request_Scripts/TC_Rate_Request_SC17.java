package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC17 extends Keywords {

	public void Rate_Request_SC17(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String testcase_Name="TC_Rate_Request_SC17";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);


		
		String username = Data.get("Username");
		String password = Data.get("Password");
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
		String location_code = Data.get("location_code");
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
		String	Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
		String	On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
		 String do_You_Want_Delete = Data.get("Do_You_Want_Delete").trim();
		String	tService=Data.get("T_Service");
		String	TOS=Data.get("TOS_Option");
		
		String search_type2=Data.get("search_type2");
		String input2=Data.get("input2");
		String search_type3=Data.get("search_type3");
		String input3=Data.get("input3");
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
		
		navigateUrl(driver, url);

		Extent_Start(testcase_Name, test, test1);
LRP_Login(driver, username, password);

SwitchProfile(driver, location_code);

moduleNavigate(driver, Field_Names);



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
			
			selectDatePicker(driver, Dateclick, From_Date_Input);
			
			
		} else {
			waitForElement(driver, Dateclick);
			clearAndType(driver, Dateclick, From_Date_Input);
		}
		// Selecting the to Date
		Extent_call(test, test1, "Selecting the TO date");
				waitForElement(driver, Dateclick1);
				if (To_date_perform.equalsIgnoreCase("Yes")) {
					
					selectDatePicker(driver, Dateclick1, To_Date_Input);
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
			
			globalValueSearchWindow1(driver, Condition_Value, Customer_Code, Customer_code_Value, search_type2, input2,search_type3, input3);

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

		waitForDisplay(driver, Exp_Days);
		if(isdisplayed(driver, Exp_Days)&&isElementAccessible(driver, Exp_Days)) {
			clearAndType(driver, Exp_Days, Exp_Detention_Days1);
		}
		if(isdisplayed(driver, Imp_Days)&&isElementAccessible(driver, Imp_Days)) {
			clearAndType(driver, Imp_Days, Imp_Detention_Days1);
		}
		if(isdisplayed(driver, Exp_Demurage)&&isElementAccessible(driver, Exp_Demurage)) {
			clearAndType(driver, Exp_Demurage, Exp_Demurrage1);
		}
		if(isdisplayed(driver, Imp_Demurage)&&isElementAccessible(driver, Imp_Demurage)) {
			clearAndType(driver, Imp_Demurage, Imp_Demurrage1);
		}

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

		waitForElement(driver, Mail_Cancel_button);
		click(driver, Mail_Cancel_button);
		
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
			
			globalValueSearchWindow1(driver, Condition_Value, Customer_Code, Cust_Code_New, search_type2, input2, search_type3, input3);
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
		
		waitForDisplay(driver, mail_Cancel_Button);
		if(isdisplayed(driver, mail_Cancel_Button)) {
		click(driver, mail_Cancel_Button);
		}
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
		
		moduleNavigate(driver, ModuleName1);

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
		
		moduleNavigate(driver, ModuleName1);

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
		  
			Extent_completed(testcase_Name, test, test1);

			
	}
}
