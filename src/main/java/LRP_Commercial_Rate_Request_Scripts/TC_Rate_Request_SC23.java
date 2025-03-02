package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC23 extends Keywords{
	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;

	public void rate_Request_Sc23(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){
	
		String tc_Name="TC_Rate_Request_SC23";

		
		String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		String Sheet_Name_023 = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_023, tc_Name, "dataset"+selected_dataset, File_Path);
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
		String Customer_code_Value2 = data.get("Customer_code_Value2");
		String Customer_code_Value3 = data.get("Customer_code_Value3");
		String Cust_code2 = data.get("Cust_code2");
		String Cust_code3 = data.get("Cust_code3");
		
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 



		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);
		//Login
				LRP_Login(driver, user_Name, pass_word);
				
			
				
				//Switch User
				SwitchProfile(driver, agencyUser);
				
				//Module search
				moduleNavigate(driver, Field_Names);
		Step_Start(1, "Click on the new button in the toolbar", test, test1);
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
		
		// non containerized radio btn

		if (Non_Containerized.equals("YES")) {
			waitForElement(driver, non_containradio_btn);
			safeclick(driver, non_containradio_btn);
		}
		Step_Start(2, "Enter the customer name", test, test1);

		waitForElement(driver, Customer_Name_search_button);
		click(driver, Customer_Name_search_button);
		
		globalValueSearchWindow1(driver, Condition_Value, Customer_Code, Customer_code_Value, Cust_code2, Customer_code_Value2,Cust_code3, Customer_code_Value3);
		
		
		
	
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
			waitForElement(driver, Dateclick);
			if (DatePicker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Dateclick, From_date);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_date);
			}
			// Selecting the to Date
			Extent_call(test, test1, "selecting TO date");
			// Selecting the to Date
					waitForElement(driver, Dateclick1);
					if (DatePicker.equalsIgnoreCase("Yes")) {
						selectDatePicker(driver, Dateclick1, To_date);
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
			
			
			waitForElement(driver, Mail_Cancel_button);
			click(driver, Mail_Cancel_button);
			

			if(Do_You_Want_Delete.equalsIgnoreCase("Yes")) {
				Extent_call(test, test1, "Rate request Delete Started");
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);	

			//delete the rate request
			moduleNavigate(driver, module2);


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
