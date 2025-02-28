package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC22 extends Keywords{
	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;

	public void rate_Request_Sc22(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){

		
		String tc_Name="TC_Rate_Request_SC22";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		String Sheet_Name_021 = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_021, tc_Name, "dataset"+selected_dataset, File_Path);
		String status_value=data.get("Status");	
		String module2=data.get("search_module2");
		String user_Name = data.get("Username");
		String pass_word =data.get("PassWord");
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
		String agencyUser = data.get("agencyUser");
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
		tService=data.get("T_Service");
		TOS=data.get("TOS_Option");
		String Eqp_Quantity_Input =data.get("Eqp_Quantity_Input");
		
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		//Login
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
			click(driver, Eqp_Quantity);
			Newclear(driver, Eqp_Quantity);
			Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );

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
		}
	}

}
