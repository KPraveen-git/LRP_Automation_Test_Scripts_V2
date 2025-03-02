package LRP_Commercial_Rate_Request_Scripts;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;
import java.util.Map;

public class TC_Rate_Request_SC21 extends Keywords{

	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;

	public void Rate_Request_SC21(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset){

		String tc_Name="TC_Rate_Request_SC21";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		String Sheet_Name_021 = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_021, tc_Name, "Dataset"+selected_dataset, File_Path);

		String user_Name = data.get("Username");
		String pass_word =data.get("PassWord");
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
		String Customer_code_Value2 = data.get("Customer_code_Value2");
		String Customer_code_Value3 = data.get("Customer_code_Value3");
		String Cust_code2 = data.get("Cust_code2");
		String Cust_code3 = data.get("Cust_code3");
		
		
		
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 

		navigateUrl(driver, url);
		//Login
		Extent_Start(tc_Name, test, test1);

		//Login


				LRP_Login(driver, user_Name, pass_word);
				
				
				
				//Switch User
				SwitchProfile(driver, agencyUser);
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
			
			
			waitForElement(driver, Mail_Cancel_button);
			click(driver, Mail_Cancel_button);
			
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
		}
	}
}
