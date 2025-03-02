package LRP_Comercial_V1_Rate_Request_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Common_Cost_Class;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC47 extends Keywords {

	public void Rate_Request_SC47(WebDriver driver, ExtentTest test,ExtentTest test1, String selected_dataset) {
		String testCaseName="TC_Rate_Request_SC47";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_08 = TestNgXml.getsheetName_FromExecution().get(testCaseName);

		Map<String, String> Data = Utils.GetAllData(Sheet_Name_08, testCaseName,"Dataset" + selected_dataset, File_Path);
		String username=Data.get("username");
		String password=Data.get("password");
		String Non_Containerized=Data.get("Non_Containerized");
		String Eqp_Quantity_Input=Data.get("Eqp_Quantity_Input");
		String Exp_Det_Days_Input=Data.get("Exp_Det_Days_Input");
		String Imp_Det_Days_Input=Data.get("Imp_Det_Days_Input");
		String Exp_Demmurage_Input=Data.get("Exp_Demmurage_Input");
		String Imp_Demmurage_Input=Data.get("Imp_Demmurage_Input");
		String DG_checkboxs = Data.get("DG_checkboxs");
		String NOR_checkbox = Data.get("NOR_checkbox");
		String SOC_checkbox = Data.get("SOC_checkbox");
		String OOG_checkbox = Data.get("OOG_checkbox");
		String From_Date_Input =Data.get( "From_Date_Input");
		String To_Date_Input =Data.get( "To_Date_Input");
		String Request_Input=Data.get("Request_Type_Input");
		String rateRequestModule=Data.get("rateRequestModule");
		String date_Picker=Data.get("date_Picker");		
		String agencyUser=Data.get("agencyUser");
		String origin = Data.get("origin");
		String delivery = Data.get("delivery");
		String commodity = Data.get("commodity");
		String moduleSRRGate = Data.get("ModuleSRRGate");
		String requestStatus = Data.get("RequestStatus");
		String submittedPopup = Data.get("SubmittedPopup");
		String wantToProceedPopup = Data.get("WantToProceedPopup");
		String wantToSavePopup = Data.get("WantToSavePopup");
		String oFR = Data.get("oFR");
		String eqpType = Data.get("eqpType");
		String grossWeight = Data.get("GrossWeight");
		String Routing_Service = Data.get("Routing_Service");
		String Routing_Origin = Data.get("Routing_Origin");
		String Cust_code = Data.get("Cust_code");
		String Condition_Value = Data.get("Condition_Value");
		String Customer_code_Value = Data.get("Customer_code_Value");
		String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
		String On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
		String Request_type = Data.get("Request_type");
		String SRR_Status = Data.get("SRR_Status").trim();
		String SRR_Grid_Status = Data.get("SRR_Grid_Status").trim();
		String tService=Data.get("T_Service");
		String TOS=Data.get("TOS_Option");
		String OFR_Input_SRR = Data.get("OFR_Input_SRR");
		String surcharge_Input = Data.get("surcharge_Input");
		String remarks_Input = Data.get("remarks_Input");
		String Condition_filter = Data.get("Condition_filter");
		String amount = Data.get("amount");
		String gridRequestStatus = Data.get("gridRequestStatus");
		String Customer_code_Value2 = Data.get("Customer_code_Value2");
		String Customer_code_Value3 = Data.get("Customer_code_Value3");
		String Cust_code2 = Data.get("Cust_code2");
		String Cust_code3 = Data.get("Cust_code3");
		String Charge_Code_Header = Data.get("Charge_Code_Header");

	

		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
		String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);

	
		Extent_Start(testCaseName, test, test1);

		navigateUrl(driver, url);
		//Login
		LRP_Login(driver, username, password);

		//Switch User
		SwitchProfile(driver, agencyUser);

		moduleNavigate(driver, rateRequestModule);
		
		// Rate Request
				Step_Start(1, "Click on the new button in the toolbar", test, test1);
				waitForDisplay(driver, Rate_Newbutton);
				if(isdisplayed(driver, Rate_Newbutton)&& isElementEnabled(driver, Rate_Newbutton)) {
				click(driver, Rate_Newbutton);
				}
				Step_End(1, "Click on the new button in the toolbar", test, test1);
				

				if (Non_Containerized.equals("YES")) {
					waitForElement(driver, non_containradio_btn);
					safeclick(driver, non_containradio_btn);
				}
				waitForElement(driver, tService_Dropdown);
				click(driver, tService_Dropdown);
				waitForElement(driver, select_t_Service);
				click(driver, select_t_Service);

				waitForElement(driver, TOS_Dropdown);
				click(driver, TOS_Dropdown);
				waitForElement(driver, tos);
				click(driver, tos);
				
				Step_Start(2, "Select the special rate request type", test, test1);
				waitForElement(driver, Requet_Type);
				click(driver,Requet_Type);
				waitForElement(driver, Request_Type_Locator);
				click(driver, Request_Type_Locator);
				
				Step_End(2, "Select the special rate request type", test, test1);
				
				// Selecting the From Date

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

				Step_Start(3, " Enter the customer name", test, test1);



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
				
				

					Step_End(3, " Enter the customer name", test, test1);

					Step_Start(4, "Enter the origin", test, test1);
					waitForElement(driver, Orgin_Input);
					sendKeys(driver, Orgin_Input, origin);
					waitForElement(driver, Origin_Value);
					waitForElement(driver, Auto_Panel_First);
					safeclick(driver, Auto_Panel_First);

					Step_End(4, "Enter the origin", test, test1);

					Step_Start(5, "Enter the Delivery", test, test1);

					waitForElement(driver, Delivery_Input_Field);
					sendKeys(driver, Delivery_Input_Field, delivery);
					waitForElement(driver, Delivery_Value);
					waitForElement(driver, Auto_Panel_First);
					safeclick(driver, Auto_Panel_First);
					System.out.println("Delivery Value:" + delivery);
					Step_End(5, "Enter the Delivery", test, test1);

					Step_Start(6, "Enter the Commodity.", test, test1);

					waitForElement(driver, Commodity_Input);
					sendKeys(driver, Commodity_Input, commodity);
					waitForElement(driver, Commodity_Value);
					waitForElement(driver, Auto_Panel_First);
					safeclick(driver, Auto_Panel_First);
					System.out.println("Commodity Value:" + commodity);

					Step_End(6, "Enter the Commodity.", test, test1);

					Step_Start(7, "Enter the Equipment type.", test, test1);
					waitForElement(driver, Eqp_Type);
					click(driver, Eqp_Type);
					sendKeys(driver, Eqp_Type, eqpType);
					waitForElement(driver, Auto_Panel_First);
					safeclick(driver, Auto_Panel_First);
					System.out.println("Eqp type:"+eqpType);
					Step_End(7, "Enter the Equipment type.", test, test1);

					Step_Start(8, " Enter the Quantity", test, test1);

					waitForElement(driver, Eqp_Quantity);
					click(driver, Eqp_Quantity);
					Newclear(driver, Eqp_Quantity);
					Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
					Step_End(8, " Enter the Quantity", test, test1);

					Step_Start(9, "Enter the Gross Weight", test, test1);

					waitForElement(driver, Gross_Weight);
					Newclear(driver, Gross_Weight);
					Actionsendkeys(driver, Gross_Weight, grossWeight);
					Step_End(9, "Enter the Gross Weight", test, test1);
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
					waitForDisplay(driver, Imp_Days);
					if(isdisplayed(driver, Imp_Days)&&isElementAccessible(driver, Imp_Days)) {
				    clearAndType(driver, Imp_Days, Imp_Det_Days_Input);
					}
					waitForDisplay(driver, Exp_Demurage);
					if(isdisplayed(driver, Exp_Demurage)&&isElementAccessible(driver, Exp_Demurage)) {
					clearAndType(driver, Exp_Demurage, Exp_Demmurage_Input);
					}
					waitForDisplay(driver, Imp_Demurage);
					if(isdisplayed(driver, Imp_Demurage)&&isElementAccessible(driver, Imp_Demurage)) {
					clearAndType(driver, Imp_Demurage, Imp_Demmurage_Input);
					}

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
						sendKeys(driver, Routing_OriginTF, Routing_Origin);
						waitForElement(driver, Routing_service_TF);
						sendKeys(driver, Routing_service_TF, Routing_Service);
						waitForElement(driver, select_First_Routing);
						doubleClick(driver, select_First_Routing);

					}else {
						System.out.println(actRoutingFrame+" is not displayed");

						Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
					}
					Step_End(11, "Select the routing", test, test1);

					Step_Start(12, "Enter the OFR", test, test1);
					waitForElement(driver, OFR_Txt_Field);
					safeclick(driver, OFR_Txt_Field);
					sendKeys(driver, OFR_Txt_Field, oFR);

					Step_End(12, "Enter the OFR", test, test1);

					Step_Start(13, "Click Add", test, test1);
					waitForElement(driver, Rate_AddBtn);
					click(driver, Rate_AddBtn);

					Step_End(13, "Click Add", test, test1);
					Step_Start(14, "Click Save button in the tool bar", test, test1);
					waitForElement(driver, Rate_SaveBtn);
					click(driver, Rate_SaveBtn);

					waitForElement(driver, Rate_Sub_Popup_Msg);
					String actSubmitPopup=getText(driver, Rate_Sub_Popup_Msg);
					if(actSubmitPopup.equals(wantToSavePopup)) {
						Extent_pass(driver,"Matched || Expected : "+wantToSavePopup+" Actual : "+ actSubmitPopup, test,test1);
						System.out.println("Matched || Expected : "+wantToSavePopup+" Actual : "+ actSubmitPopup);
						Extent_pass(driver, wantToSavePopup+" is displayed", test,test1);
						System.out.println(wantToSavePopup+" is displayed");

					}else {
						System.out.println("Not Matched || Expected : "+wantToSavePopup+" Actual : "+ actSubmitPopup);

						Extent_fail(driver,"Not Matched || Expected : "+wantToSavePopup+" Actual : "+ actSubmitPopup, test,test1);
					}

					Step_End(14, "Click Save button in the tool bar", test, test1);

					Step_Start(15, "Click submit", test, test1);
					waitForElement(driver, Rate_SubmitBtn);
					click(driver, Rate_SubmitBtn);
					waitForElement(driver, rate_Request_Popup);
					String actualPopup=getText(driver, rate_Request_Popup);
					if(actualPopup.equals(wantToProceedPopup)) {
						Extent_pass(driver,"Matched || Expected : "+wantToProceedPopup+" Actual : "+ actualPopup, test,test1);
						System.out.println("Matched || Expected : "+wantToProceedPopup+" Actual : "+ actualPopup);
						Extent_pass(driver, wantToProceedPopup+" popup is displayed", test,test1);
						System.out.println(wantToProceedPopup+" popup is displayed");


					}else {
						System.out.println("Not Matched || Expected : "+wantToProceedPopup+" Actual : "+ actualPopup);

						Extent_fail(driver,"Not Matched || Expected : "+wantToProceedPopup+" Actual : "+ actualPopup, test,test1);
					}
					Step_End(15, "Click submit", test, test1);
					Step_Start(16, "Click Ok", test, test1);
					waitForElement(driver, Yes_Btn);
					click(driver, Yes_Btn);
					waitForElement(driver, popup_5_Sec);
					String actSubmittedPopup=getText(driver, popup_5_Sec);
					System.out.println("Submitted Popup: "+actSubmittedPopup);

					if(actSubmittedPopup.equals(submittedPopup)) {
						Extent_pass(driver,"Matched || Expected : "+submittedPopup+" Actual : "+ actSubmittedPopup, test,test1);
						System.out.println("Matched || Expected : "+submittedPopup+" Actual : "+ actSubmittedPopup);
						Extent_pass(driver, submittedPopup+" popup is displayed", test,test1);
						System.out.println(submittedPopup+" popup is displayed");

					}else {
						System.out.println("Not Matched || Expected : "+submittedPopup+" Actual : "+ actSubmittedPopup);

						Extent_fail(driver,"Not Matched || Expected : "+submittedPopup+" Actual : "+ actSubmittedPopup, test,test1);
					}
					
					Step_End(16, "Click Ok", test, test1);
					waitForElement(driver, reqNo_Textfield);
					String actualReqNo=getAttribute(driver, reqNo_Textfield, "value");
					System.out.println("Request Number:"+actualReqNo);  

					if(!actualReqNo.equals(null)) {
						Extent_pass(driver,"Matched || "+ actualReqNo + "  is  generated", test,test1);
						System.out.println("Matched || "+actualReqNo+ "  is  generated");

					}else {
						System.out.println("Not Matched || "+ actualReqNo+ "Request Number  is not generated");

						Extent_fail(driver,"Not Matched || "+ actualReqNo + "Request Number  is not generated", test,test1);
					}


					waitForElement(driver, Grid_Request_Status);
					List<Map<String, String>> table_Values = getTableData(driver, RR_Ocean_Freight_Details_Table_Headers, RR_Ocean_Freight_Details_Table_Rows);
					String actGridRequestStatus = getFirstValueByHeader(table_Values, "Request Status");
					if (actGridRequestStatus.equals(gridRequestStatus)) {
						System.out.println("Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus);
						Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus, test,test1);
					} else {
						System.out.println("Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus);
						Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus, test,test1);
					}
					waitForElement(driver, Request_Status);
					String actRequestStatus = getAttribute(driver, Request_Status, "value");
					if (actRequestStatus.equals(requestStatus)) {
						System.out.println("Matched || " + " Expected Report Activity is : " + actRequestStatus+ " || Actual Report Activity is : " + requestStatus);
						Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + actRequestStatus+ " || Actual Report Activity is : " + requestStatus, test,test1);
					} else {
						System.out.println("Not Matched || " + " Expected Report Activity is : " + actRequestStatus+ " || Actual Report Activity is : " + requestStatus);
						Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + actRequestStatus+ " || Actual Report Activity is : " + requestStatus, test,test1);
					}
	
				
	
				waitForElement(driver, Mail_Cancel_button);
				click(driver, Mail_Cancel_button);
				
				waitForElement(driver, Requet_Type);
				String req_Type=getText(driver, Requet_Type);
				System.out.println("req_Type :"+req_Type);
				
				if (req_Type.equals(Request_type)) {
					System.out.println("Matched || " + " Expected Request Type : " + req_Type+ " || Actual Expected Request Type : " + Request_type);
					Extent_pass(driver, "Matched || " + " Expected Expected Request Type : " + req_Type+ " || Actual Expected Request Type : " + Request_type, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Expected Request Type : " + req_Type+ " || Actual Expected Request Type : " + Request_type);
					Extent_fail(driver, "Not Matched || " + " Expected Expected Request Type : " + req_Type+ " || Actual Expected Request Type : " + Request_type, test,test1);
				}
	
				
				Step_Start(17, "Switch to line profile and navigate to the special rate request screen using SRR gate screen under Submit node", test, test1);
				
				ResetProfile(driver);
				
			
				
				moduleNavigate(driver, moduleSRRGate);
				
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
//				click(driver, filter_Inputfield);
				sendKeys(driver, filter_Inputfield, actualReqNo);
				enter(driver);

				waitForElement(driver, select_Actual_ReqNo);
				String submitted_ReqNum1=getText(driver, select_Actual_ReqNo);
				System.out.println(submitted_ReqNum1);
					waitForElement(driver, select_Actual_ReqNo);
					doubleClick(driver, select_Actual_ReqNo);
				
				Step_End(17, "Switch to line profile and navigate to the special rate request screen using SRR gate screen under Submit node", test, test1);

				Step_Start(18, "Click edit", test, test1);
				waitForElement(driver, specialRateRequest_Edit_Button);
				click(driver, specialRateRequest_Edit_Button);
				
				Step_End(18, "Click edit", test, test1);
				
				scrollBottom(driver);
				waitForElement(driver, counter_Button);
				if(isElementEnabled(driver, counter_Button)) {
				click(driver, counter_Button);
				}else {
					waitForElement(driver, SRR_Contribution);
					click(driver, SRR_Contribution);
					String missingCost = getText(driver, SRR_Missing_Cost_Value);
					waitForElement(driver, Srr_missing_cost_exit_button);
					click(driver, Srr_missing_cost_exit_button);
					Common_Cost_Class cost =new Common_Cost_Class();
					cost.parseEquipmentData(driver, missingCost, test, test1, selected_dataset);
					waitForElement(driver, Special_Rate_Request_Module);
					click(driver, Special_Rate_Request_Module);
					waitForElement(driver, refresh_contribution_Srr);
					click(driver, refresh_contribution_Srr);
					scrollBottom(driver);
					waitForElement(driver, counter_Button);
					click(driver, counter_Button);
					
					
				}
				
				
				scrollTop(driver);
				waitForElement(driver, OFr_Text_Field_SRR);
				click(driver, OFr_Text_Field_SRR);
				clear(driver, OFr_Text_Field_SRR);
				sendKeys(driver, OFr_Text_Field_SRR, OFR_Input_SRR);
				
				
				scrollBottom(driver);
				waitForElement(driver, Remarks_Field_SRR);
				sendKeys(driver, Remarks_Field_SRR, remarks_Input);
				
				scrollTop(driver);
				waitForElement(driver, apply_Rate_Button_SRR);
				click(driver, apply_Rate_Button_SRR);
				
				
				waitForElement(driver, surcharge_Plus_Button_SRR);
				click(driver, surcharge_Plus_Button_SRR);
				
				
				twoColumnSearchWindow(driver, Charge_Code_Header, Condition_filter, surcharge_Input);
				scrollBottom(driver);
				String surcharge_Amnt =  String.format(Rate_Request_Loactors.surcharge_Amount_Grid_SRR,  surcharge_Input); 
                 waitForElement(driver, surcharge_Amnt);
                 click(driver, surcharge_Amnt);
 				String surcharge_Amnt_Input =  String.format(Rate_Request_Loactors.surcharge_Amount_Input,  surcharge_Input); 
                 clearAndType(driver, surcharge_Amnt_Input, amount);
                 click(driver, apply_Rate_Button_SRR);				
				
				
				scrollTop(driver);
				
				Step_Start(20, "click save", test, test1);
				waitForElement(driver, specialRateRequest_Save_Button);
				click(driver, specialRateRequest_Save_Button);
				Step_End(20, "click save", test, test1);
				
				waitForDisplay(driver, pop_up_exp);
				if(isdisplayed(driver, pop_up_exp)) {
					String actualPopup1=getText(driver, pop_up_exp);
					System.out.println("actualPopup : "+actualPopup1);
				}
				
				String actualStatus=getText(driver, specialRateRequest_Status);
				System.out.println("actualStatus : "+actualStatus);
				
				if(actualStatus.equals(SRR_Status)) {
					System.out.println("Matched || Expected status : "+SRR_Status+" || Actual status : "+actualStatus);
					Extent_pass(driver, "Matched || Expected status : "+SRR_Status+" || Actual status : "+actualStatus, test, test1);
				}else {
					System.out.println("Not Matched || " + " Expected status : " + SRR_Status+ " || Actual status : " + actualStatus);
					Extent_fail(driver, "Not Matched || " + " Expected status : " + SRR_Status+ " || Actual status : " + actualStatus, test,test1);
				}
				
				List<Map<String, String>> srr_Table_Data = getTableData(driver, specialRateRequest_Table_Headers, specialRateRequest_Table_Rows);
				
				List<String> actualStatus_Grid_Value = getValuesByHeader(srr_Table_Data, "Status");
				String actualStatus_Grid=actualStatus_Grid_Value.get(0);
				System.out.println("actualStatus_Grid : "+actualStatus_Grid);
				
				if(actualStatus_Grid.equals(SRR_Grid_Status)) {
					System.out.println("Matched || Expected status in grid  : "+SRR_Grid_Status+" || Actual status in grid : "+actualStatus_Grid);
					Extent_pass(driver, "Matched || Expected status in grid  : "+SRR_Grid_Status+" || Actual status in grid : "+actualStatus_Grid, test, test1);
				}
				else {
					System.out.println("Not Matched || " + " Expected status in grid  : " + SRR_Grid_Status+ " || Actual status in grid : " + actualStatus_Grid);
					Extent_fail(driver, "Not Matched || " + " Expected status in grid  : " + SRR_Grid_Status+ " || Actual status in grid : " + actualStatus_Grid, test,test1);
				}
				
				
	
	
	
	
	
	
	
	
	
				}
				
				Extent_completed(testCaseName, test, test1);
	}

}
