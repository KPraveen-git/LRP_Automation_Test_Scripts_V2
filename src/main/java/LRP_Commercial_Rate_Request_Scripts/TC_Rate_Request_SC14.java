package LRP_Commercial_Rate_Request_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC14 extends Keywords {

	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;

	public void Rate_RequestSC14(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String testcase_Name="TC_Rate_Request_SC14";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);

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
		String agencyUser = Data.get("Agency_user");
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



		Extent_Start(testcase_Name, test, test1);

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

			}
			Extent_completed(testcase_Name, test, test1);  

		}

	}
}