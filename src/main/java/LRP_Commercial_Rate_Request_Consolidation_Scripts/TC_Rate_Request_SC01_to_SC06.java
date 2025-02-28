package LRP_Commercial_Rate_Request_Consolidation_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC01_to_SC06  extends Keywords{
	public static String Request_Input;
	public static String SRR_Request_Input;
	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;
	
	public void Rate_Request_SC01toSC06(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {
		
int tc01=1;
		
		if(tc01 == 1) {
			String tc_Name="TC_Rate_Request_SC01";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
			String url = TestNgXml.getdatafromExecution().get(tc_Name);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name, tc_Name,"Dataset" + selected_dataset, File_Path);


			
			String username = Data.get("Username");
			String password = Data.get("Password");
			String rateRequestModule = Data.get("ModuleRateRequest");
			String origin = Data.get("origin");
			String delivery = Data.get("delivery");
			String commodity = Data.get("commodity");
			String moduleSRRGate = Data.get("ModuleSRRGate");
			String requestStatus = Data.get("RequestStatus");
			String gridRequestStatus = Data.get("GridRequestStatus");
			String submittedPopup = Data.get("SubmittedPopup");
			String wantToProceedPopup = Data.get("WantToProceedPopup");
			String wantToSavePopup = Data.get("WantToSavePopup");
			String oFR = Data.get("oFR");
			String eqpType = Data.get("eqpType");
			String grossWeight = Data.get("GrossWeight");
			String Exp_Det_Days_Input = Data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input = Data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input = Data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input = Data.get("Imp_Demmurage_Input");
			String agencyUser = Data.get("Agency_user");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String Routing_Service = Data.get("Routing_Service");
			String Routing_Origin = Data.get("Routing_Origin");
			String Eqp_Quantity_Input = Data.get("Eqp_Quantity_Input");
			String Cust_code = Data.get("Cust_code");
			String Condition_Value = Data.get("Condition_Value");
			String Customer_code_Value = Data.get("Customer_code_Value");
			String To_Date_Input = Data.get("To_Date_Input");
			String date_Picker = Data.get("date_Picker");
			String From_Date_Input = Data.get("From_Date_Input");
			String Do_You_Want_Delete = Data.get("Do_You_Want_Delete");
			String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			String On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
			
			
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();

			Extent_Start(tc_Name, test, test1);

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
			sendKeys(driver, Module_SearchR, rateRequestModule);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);

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
			waitForElement(driver, Rate_Newbutton);
			click(driver, Rate_Newbutton);
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

			waitForElement(driver, Dateclick);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick);
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			waitForElement(driver, Dateclick1);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick1);
				clearAndType(driver, Dateclick1, To_Date_Input);
			}

			Step_Start(2, " Enter the customer name", test, test1);



			waitForElement(driver, Customer_Name_search_button);
			click(driver, Customer_Name_search_button);
			waitForElement(driver, Customer_Code_Select_dropdown);
			click(driver, Customer_Code_Select_dropdown);
			selectByText(driver, Customer_Code_Select_dropdown, Cust_code);
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

				waitForDisplay(driver, CustName_ExitBtn);
				if(isDisplayed(driver, CustName_ExitBtn)) {
					waitForElement(driver, CustName_ExitBtn);
					click(driver, CustName_ExitBtn);
				}

				Step_End(2, " Enter the customer name", test, test1);

				Step_Start(3, "Enter the origin", test, test1);
				waitForElement(driver, Orgin_Input);
				sendKeys(driver, Orgin_Input, origin);
				waitForElement(driver, Origin_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);

				Step_End(3, "Enter the origin", test, test1);

				Step_Start(4, "Enter the Delivery", test, test1);

				waitForElement(driver, Delivery_Input);
				sendKeys(driver, Delivery_Input, delivery);
				waitForElement(driver, Delivery_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Delivery Value:" + delivery);
				Step_End(4, "Enter the Delivery", test, test1);

				Step_Start(5, "Enter the Commodity.", test, test1);

				waitForElement(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, commodity);
				waitForElement(driver, Commodity_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Commodity Value:" + commodity);

				Step_End(5, "Enter the Commodity.", test, test1);

				Step_Start(6, "Enter the Equipment type.", test, test1);
				waitForElement(driver, Eqp_Type);
				click(driver, Eqp_Type);
				sendKeys(driver, Eqp_Type, eqpType);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Eqp type:"+eqpType);
				Step_End(6, "Enter the Equipment type.", test, test1);

				Step_Start(7, " Enter the Quantity", test, test1);

				waitForElement(driver, Eqp_Quantity);
				click(driver, Eqp_Quantity);
				Newclear(driver, Eqp_Quantity);
				Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
				Step_End(7, " Enter the Quantity", test, test1);

				Step_Start(8, "Enter the Gross Weight", test, test1);

				waitForElement(driver, Gross_Weight);
				Newclear(driver, Gross_Weight);
				Actionsendkeys(driver, Gross_Weight, grossWeight);
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
					waitForElement(driver, select_First_Routing);
					doubleClick(driver, select_First_Routing);

				}else {
					System.out.println(actRoutingFrame+" is not displayed");

					Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
				}
				Step_End(10, "Select the routing", test, test1);

				Step_Start(11, "Enter the OFR", test, test1);
				waitForElement(driver, OFR_Txt_Field);
				safeclick(driver, OFR_Txt_Field);
				sendKeys(driver, OFR_Txt_Field, oFR);

				Step_End(11, "Enter the OFR", test, test1);

				Step_Start(12, "Click Add", test, test1);
				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);

				Step_End(12, "Click Add", test, test1);
				Step_Start(13, "Click Save button in the tool bar", test, test1);
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

				Step_End(13, "Click Save button in the tool bar", test, test1);

				Step_Start(14, "Click submit", test, test1);
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
				Step_End(14, "Click submit", test, test1);
				Step_Start(15, "Click Ok", test, test1);
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
				Step_End(15, "Click Ok", test, test1);
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
				String actGridRequestStatus = getText(driver, Grid_Request_Status);
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
					System.out.println("Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
				}

				if(Do_You_Want_Delete.equalsIgnoreCase("Yes")){

					waitForElement(driver, close_Tab);
					click(driver, close_Tab);
					Extent_call(test, test1, "Rate request Delete start");
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
					waitForElement(driver, submit_RadioButton);
					click(driver, submit_RadioButton);

					waitForElement(driver, menu_Icon_Grid);
					click(driver, menu_Icon_Grid);

					waitForElement(driver, filter_Icon_Grid);
					click(driver, filter_Icon_Grid);

					waitForElement(driver, filter_Inputfield);
					click(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, actualReqNo);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNum=getText(driver, select_Actual_ReqNo);
					if(submitted_ReqNum.equals(actualReqNo)) {
						System.out.println("Matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + submitted_ReqNum);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + actualReqNo + " || ActualValue is : " + submitted_ReqNum,test,test1);
						Extent_pass(driver, actualReqNo+"  is submitted", test,test1);
						System.out.println(actualReqNo+" is submitted");

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver, close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);

					}else {
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value  is : " + submitted_ReqNum);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + submitted_ReqNum,test,test1);
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
					sendKeys(driver, filter_Inputfield, actualReqNo);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNum=getText(driver, select_Actual_ReqNo);
					if(pending_ReqNum.equals(actualReqNo)) {

						System.out.println("Matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + pending_ReqNum);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + actualReqNo + " || ActualValue is : " + pending_ReqNum,test,test1);
						Extent_pass(driver, actualReqNo+"  is moved To pending", test,test1);
						System.out.println(actualReqNo+" is moved To pending");

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
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value  is : " + pending_ReqNum);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + pending_ReqNum,test,test1);
					}	
					Extent_call(test, test1, "Rate request Delete Ended");	

				}
			}

			  waitForElement(driver, srrGate_Tab);
			  click(driver, srrGate_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
					Extent_completed(tc_Name, test, test1);

			
		}
int tc02=1;
		
		if(tc02 == 1) {	
			String tc_Name="TC_Rate_Request_SC02";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name, tc_Name,"Dataset" + selected_dataset, File_Path);


			String rateRequestModule = Data.get("ModuleRateRequest");
			String origin = Data.get("origin");
			String delivery = Data.get("delivery");
			String CommodityExist = Data.get("CommodityExist");
			String alreadyExistPopup = Data.get("alreadyExistPopup");
			String wantToProceedPopup = Data.get("wantToProceedPopup");
			String wantToSavePopup = Data.get("wantToSavePopup");
			String oFR = Data.get("oFR");
			String Routing_Origin = Data.get("Routing_Origin");
			String Routing_Service = Data.get("Routing_Service");
			String eqpType = Data.get("eqpType");
			String grossWeight = Data.get("grossWeight");
			String Exp_Det_Days_Input = Data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input = Data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input = Data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input = Data.get("Imp_Demmurage_Input");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String Eqp_Quantity_Input = Data.get("Eqp_Quantity_Input");
			String date_Picker = Data.get("date_Picker");
			String To_Date_Input = Data.get("To_Date_Input");
			String From_Date_Input = Data.get("From_Date_Input");
			String Cust_code = Data.get("Cust_code");
			String Condition_Value = Data.get("Condition_Value");
			String Customer_code_Value = Data.get("Customer_code_Value");
			String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			String On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
		
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();

			Extent_Start(tc_Name, test, test1);
			
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, rateRequestModule);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);

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
			waitForElement(driver, Rate_Newbutton);
			click(driver, Rate_Newbutton);
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

			waitForElement(driver, Dateclick);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick);
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			waitForElement(driver, Dateclick1);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick1);
				clearAndType(driver, Dateclick1, To_Date_Input);
			}

			Step_Start(2, " Enter the customer name", test, test1);

			waitForElement(driver, Customer_Name_search_button);
			click(driver, Customer_Name_search_button);
			waitForElement(driver, Customer_Code_Select_dropdown);
			click(driver, Customer_Code_Select_dropdown);
			selectByText(driver, Customer_Code_Select_dropdown, Cust_code);
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
				Step_End(2, " Enter the customer name", test, test1);

				Step_Start(3, "Enter the origin", test, test1);
				waitForElement(driver, Orgin_Input);
				sendKeys(driver, Orgin_Input, origin);
				waitForElement(driver, Origin_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				Step_End(3, "Enter the origin", test, test1);

				Step_Start(4, "Enter the Delivery", test, test1);

				waitForElement(driver, Delivery_Input);
				sendKeys(driver, Delivery_Input, delivery);
				waitForElement(driver, Delivery_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Delivery Value:" + delivery);
				Step_End(4, "Enter the Delivery", test, test1);

				Step_Start(5, "Enter the Commodity.", test, test1);

				waitForElement(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, CommodityExist);
				waitForElement(driver, Commodity_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				Step_End(5, "Enter the Commodity.", test, test1);

				Step_Start(6, "Enter the Equipment type.", test, test1);
				waitForElement(driver, Eqp_Type);
				click(driver, Eqp_Type);
				sendKeys(driver, Eqp_Type, eqpType);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Eqp type:"+eqpType);
				Step_End(6, "Enter the Equipment type.", test, test1);

				Step_Start(7, " Enter the Quantity", test, test1);

				waitForElement(driver, Eqp_Quantity);
				click(driver, Eqp_Quantity);
				Newclear(driver, Eqp_Quantity);
				Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
				Step_End(7, " Enter the Quantity", test, test1);

				Step_Start(8, "Enter the Gross Weight", test, test1);

				waitForElement(driver, Gross_Weight);
				Newclear(driver, Gross_Weight);
				Actionsendkeys(driver, Gross_Weight, grossWeight);
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
					waitForElement(driver, select_First_Routing);
					doubleClick(driver, select_First_Routing);

				}else {
					System.out.println(actRoutingFrame+" is not displayed");

					Extent_fail(driver, actRoutingFrame+" is not displayed", test,test1);
				}
				Step_End(10, "Select the routing", test, test1);

				Step_Start(11, "Enter the OFR", test, test1);
				waitForElement(driver, OFR_Txt_Field);
				safeclick(driver, OFR_Txt_Field);
				sendKeys(driver, OFR_Txt_Field, oFR);

				Step_End(11, "Enter the OFR", test, test1);

				Step_Start(12, "Click Add", test, test1);
				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);

				Step_End(12, "Click Add", test, test1);
				Step_Start(13, "Click Save button in the tool bar", test, test1);
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

				Step_End(13, "Click Save button in the tool bar", test, test1);
				waitForElement(driver, Rate_SubmitBtn);
				click(driver, Rate_SubmitBtn);
				waitForElement(driver, pop_up_exp);
				String actExistPopup=getText(driver, pop_up_exp);	
				if(actExistPopup.contains(alreadyExistPopup)) {
					Extent_pass(driver,"Matched || Expected : "+alreadyExistPopup+" Actual : "+ actExistPopup, test,test1);
					System.out.println("Matched || Expected : "+alreadyExistPopup+" Actual : "+ actExistPopup);
					Extent_pass(driver, alreadyExistPopup+" popup is displayed", test,test1);
					System.out.println(alreadyExistPopup+" popup is displayed");

				}else if(isDisplayed(driver, rate_Request_Popup)) {
					String actualPopupEx=getText(driver, rate_Request_Popup);
					if(actualPopupEx.equals(wantToProceedPopup)) {
						extent_fail(driver," This Request not Exist ", test,test1);
						System.out.println(" This Request not Exist ");
						Extent_pass(driver, wantToProceedPopup+" popup is displayed", test,test1);
						System.out.println(wantToProceedPopup+" popup is displayed");
						click(driver, Yes_Btn);					
					}}
				else {
					System.out.println("Not Matched || Expected : "+alreadyExistPopup+" Actual : "+ actExistPopup);

					Extent_fail(driver,"Not Matched || Expected : "+alreadyExistPopup+" Actual : "+ actExistPopup, test,test1);
				}

				waitForElement(driver, close_Tab);
				click(driver, close_Tab);	
			}
			Extent_completed(tc_Name, test, test1);
		
		
		}
int tc03=1;
		
		if(tc03 == 1) {
			
			String tc_Name="TC_Rate_Request_SC03";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name, tc_Name,
					"Dataset" + selected_dataset, File_Path);


			String rateRequestModule = Data.get("ModuleRateRequest");
			String origin = Data.get("origin");
			String delivery = Data.get("delivery");
			String commodity = Data.get("commodity");
			String moduleSRRGate = Data.get("ModuleSRRGate");
			String requestStatus = Data.get("RequestStatus");
			String gridRequestStatus = Data.get("GridRequestStatus");
			String submittedPopup = Data.get("SubmittedPopup");
			String wantToProceedPopup = Data.get("WantToProceedPopup");
			String wantToSavePopup = Data.get("WantToSavePopup");
			String oFR = Data.get("oFR");
			String eqpType = Data.get("eqpType");
			String grossWeight = Data.get("GrossWeight");
			String Exp_Det_Days_Input = Data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input = Data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input = Data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input = Data.get("Imp_Demmurage_Input");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String Routing_Service = Data.get("Routing_Service");
			String Routing_Origin = Data.get("Routing_Origin");
			String Eqp_Quantity_Input = Data.get("Eqp_Quantity_Input");
			String dGDetailsFrame = Data.get("dGDetailsFrame");
			String unno = Data.get("unno");
			String dG_Class = Data.get("dG_Class");
			String To_Date_Input = Data.get("To_Date_Input");
			String date_Picker = Data.get("date_Picker");
			String From_Date_Input = Data.get("From_Date_Input");
			String Do_You_Want_Delete = Data.get("Do_You_Want_Delete");
			String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			String On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			String Cust_code = Data.get("Cust_code");
			String Condition_Value = Data.get("Condition_Value");
			String Customer_code_Value = Data.get("Customer_code_Value");
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
		
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
			String dg_Details_Expected=unno+"~"+dG_Class;
			
			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();


			Extent_Start(tc_Name, test, test1);
			
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, rateRequestModule);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);

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
			waitForElement(driver, Rate_Newbutton);
			click(driver, Rate_Newbutton);
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
		
			waitForElement(driver, Dateclick);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick);
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			waitForElement(driver, Dateclick1);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick1);
				clearAndType(driver, Dateclick1, To_Date_Input);
			}


			Step_Start(2, " Enter the customer name", test, test1);

			waitForElement(driver, Customer_Name_search_button);
			click(driver, Customer_Name_search_button);
			waitForElement(driver, Customer_Code_Select_dropdown);
			click(driver, Customer_Code_Select_dropdown);
			selectByText(driver, Customer_Code_Select_dropdown, Cust_code);
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
				Step_End(2, " Enter the customer name", test, test1);

				Step_Start(3, "Enter the origin", test, test1);
				waitForElement(driver, Orgin_Input);
				sendKeys(driver, Orgin_Input, origin);
				waitForElement(driver, Origin_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);

				Step_End(3, "Enter the origin", test, test1);

				Step_Start(4, "Enter the Delivery", test, test1);

				waitForElement(driver, Delivery_Input);
				sendKeys(driver, Delivery_Input, delivery);
				waitForElement(driver, Delivery_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);

				System.out.println("Delivery Value:" + delivery);
				Step_End(4, "Enter the Delivery", test, test1);

				Step_Start(5, "Enter the Commodity.", test, test1);

				waitForElement(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, commodity);
				waitForElement(driver, Commodity_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);

				System.out.println("Commodity Value:" + commodity);

				Step_End(5, "Enter the Commodity.", test, test1);

				Step_Start(6, "Enter the Equipment type.", test, test1);
				waitForElement(driver, Eqp_Type);
				click(driver, Eqp_Type);
				sendKeys(driver, Eqp_Type, eqpType);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);

				System.out.println("Eqp type:"+eqpType);
				Step_End(6, "Enter the Equipment type.", test, test1);

				Step_Start(7, " Enter the Quantity", test, test1);

				waitForElement(driver, Eqp_Quantity);
				click(driver, Eqp_Quantity);
				Newclear(driver, Eqp_Quantity);
				Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
				Step_End(7, " Enter the Quantity", test, test1);

				Step_Start(8, "Enter the Gross Weight", test, test1);

				waitForElement(driver, Gross_Weight);
				Newclear(driver, Gross_Weight);
				Actionsendkeys(driver, Gross_Weight, grossWeight);
				Step_End(8, "Enter the Gross Weight", test, test1);
				//checkboxs
				Step_Start(9, "Check the DG flag", test, test1);
				checkBox(driver, DG_checkbox, DG_checkboxs);

				Step_End(9, "Check the DG flag", test, test1);
				waitForElement(driver, dgDetails_Frame);
				String actDGDetailsFrame=getText(driver, dgDetails_Frame);
				if(actDGDetailsFrame.equals(dGDetailsFrame)) {
					Extent_pass(driver,"Matched || Expected : "+dGDetailsFrame+" Actual : "+ actDGDetailsFrame, test,test1);
					System.out.println("Matched || Expected : "+dGDetailsFrame+" Actual : "+ actDGDetailsFrame);
					Extent_pass(driver, dGDetailsFrame+" is displayed", test,test1);
					System.out.println(dGDetailsFrame+" is displayed");
					Step_Start(10, "Click the class search.", test, test1);
					waitForElement(driver, class_Search_Button);
					click(driver, class_Search_Button);
					Step_End(10, "Click the class search.", test, test1);

					Step_Start(11, "Click on the class", test, test1);
					waitForElement(driver, searchfield_DG_Class);
					sendKeys(driver, searchfield_DG_Class, dG_Class);
					waitForElement(driver, DG_Class_Select);
					doubleClick(driver, DG_Class_Select);

					Step_End(11, "Click on the class", test, test1);
					Step_Start(12, "Click in the "+" radio button", test, test1);
					waitForElement(driver, plus_Button);
					click(driver, plus_Button);
					Step_End(12, "Click in the "+" radio button", test, test1);

					Step_Start(13, "Click on the UNNO numbe", test, test1);
					waitForElement(driver, searchfield_DG_Class);
					sendKeys(driver, searchfield_DG_Class, unno);
					waitForElement(driver, UN_Number_select);
					doubleClick(driver, UN_Number_select);

					Step_End(13, "Click on the UNNO numbe", test, test1);

				}else {
					System.out.println("Not Matched || Expected : "+dGDetailsFrame+" Actual : "+ actDGDetailsFrame);

					Extent_fail(driver,"Not Matched || Expected : "+dGDetailsFrame+" Actual : "+ actDGDetailsFrame, test,test1);
				}

				Step_Start(14, "Click OK", test, test1);
				waitForElement(driver, ok_Button_DG_Details);
				click(driver, ok_Button_DG_Details);
				Step_End(14, "Click OK", test, test1);


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

				Step_Start(15, "Click routing", test, test1);

				waitForElement(driver, Routing_Button);
				click(driver, Routing_Button);
				Step_End(15, "Click routing", test, test1);


				Step_Start(16, "Select the routing", test, test1);

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
				Step_End(16, "Select the routing", test, test1);

				Step_Start(17, "Enter the OFR", test, test1);
				waitForElement(driver, OFR_Txt_Field);
				safeclick(driver, OFR_Txt_Field);
				sendKeys(driver, OFR_Txt_Field, oFR);

				Step_End(17, "Enter the OFR", test, test1);

				Step_Start(18, "Click Add", test, test1);
				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);

				Step_End(18, "Click Add", test, test1);
				Step_Start(19, "Click Save button in the tool bar", test, test1);
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

				Step_End(19, "Click Save button in the tool bar", test, test1);

				Step_Start(20, "Click submit", test, test1);
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
				Step_End(20, "Click submit", test, test1);
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
					System.out.println(submittedPopup+ " popup is not displayed");
					Extent_fail(driver,"Not Matched || Expected : "+submittedPopup+" Actual : "+ actSubmittedPopup, test,test1);
					
				}
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
				String actGridRequestStatus = getText(driver, Grid_Request_Status);
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
					System.out.println("Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
				}
				
				waitForElement(driver, dg_Details_txtfield);
				String dg_Details_Actual = getAttribute(driver, dg_Details_txtfield,"value");
				
				if(dg_Details_Actual.equals(dg_Details_Expected)) {
					Extent_pass(driver, "DG details available in the submitted rate request is matched with excel input", test, test1);
					System.out.println("DG details available in the submitted rate request is matched with excel input");
					System.out.println("Matched || Expected Dg details -> "+dg_Details_Expected +"|| Actual dg details -> "+ dg_Details_Actual);
					Extent_pass(driver, "Matched || Expected Dg details -> "+dg_Details_Expected +"|| Actual dg details -> "+ dg_Details_Actual, test, test1);
				}else {
					
					System.out.println("Not Matched || Expected Dg details -> "+dg_Details_Expected +"|| Actual dg details -> "+ dg_Details_Actual);
					Extent_fail(driver, "Not Matched || Expected Dg details -> "+dg_Details_Expected +"|| Actual dg details -> "+ dg_Details_Actual, test, test1);
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
					waitForElement(driver, submit_RadioButton);
					click(driver, submit_RadioButton);

					waitForElement(driver, menu_Icon_Grid);
					click(driver, menu_Icon_Grid);

					waitForElement(driver, filter_Icon_Grid);
					click(driver, filter_Icon_Grid);

					waitForElement(driver, filter_Inputfield);
					click(driver, filter_Inputfield);
					waitForElement(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, actualReqNo);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNum=getText(driver, select_Actual_ReqNo);
					if(submitted_ReqNum.equals(actualReqNo)) {
						System.out.println("Matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + submitted_ReqNum);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + actualReqNo + " || ActualValue is : " + submitted_ReqNum,test,test1);
						Extent_pass(driver, actualReqNo+"  is submitted", test,test1);
						System.out.println(actualReqNo+" is submitted");

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver, close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);

					}else {
						System.out.println(actualReqNo+" is not submitted");

						System.out.println("Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value  is : " + submitted_ReqNum);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + submitted_ReqNum,test,test1);
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
					sendKeys(driver, filter_Inputfield, actualReqNo);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNum=getText(driver, select_Actual_ReqNo);
					if(pending_ReqNum.equals(actualReqNo)) {

						System.out.println("Matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + pending_ReqNum);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + actualReqNo + " || ActualValue is : " + pending_ReqNum,test,test1);
						Extent_pass(driver, actualReqNo+"  is moved To pending", test,test1);
						System.out.println(actualReqNo+" is moved To pending");

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
						System.out.println(actualReqNo+" is not moved To pending");

						System.out.println("Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value  is : " + pending_ReqNum);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + pending_ReqNum,test,test1);
					}	
					Extent_call(test, test1, "Rate request Delete Ended");
				}
		}
		


			 waitForElement(driver, srrGate_Tab);
			  click(driver, srrGate_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
			  		Extent_completed(tc_Name, test, test1);
		}
		
int tc04=1;
		
		if(tc04 == 1) {
			String tc_Name="TC_Rate_Request_SC04";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name, tc_Name,
					"Dataset" + selected_dataset, File_Path);


			String rateRequestModule = Data.get("ModuleRateRequest");
			String origin = Data.get("origin");
			String delivery = Data.get("delivery");
			String commodity = Data.get("commodity");
			String moduleSRRGate = Data.get("ModuleSRRGate");
			String requestStatus = Data.get("RequestStatus");
			String gridRequestStatus = Data.get("GridRequestStatus");
			String submittedPopup = Data.get("SubmittedPopup");
			String wantToProceedPopup = Data.get("WantToProceedPopup");
			String wantToSavePopup = Data.get("WantToSavePopup");
			String oFR = Data.get("oFR");
			String eqpType = Data.get("eqpType");
			String grossWeight = Data.get("GrossWeight");
			String Exp_Det_Days_Input = Data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input = Data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input = Data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input = Data.get("Imp_Demmurage_Input");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String Routing_Service = Data.get("Routing_Service");
			String Routing_Origin = Data.get("Routing_Origin");
			String Eqp_Quantity_Input = Data.get("Eqp_Quantity_Input");
			String Cust_code = Data.get("Cust_code");
			String Condition_Value = Data.get("Condition_Value");
			String Customer_code_Value = Data.get("Customer_code_Value");
			String To_Date_Input = Data.get("To_Date_Input");
			String date_Picker = Data.get("date_Picker");
			String From_Date_Input = Data.get("From_Date_Input");
			String Do_You_Want_Delete = Data.get("Do_You_Want_Delete");
			String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			String On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
			
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();

			Extent_Start(tc_Name, test, test1);

			
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, rateRequestModule);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);

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
			waitForElement(driver, Rate_Newbutton);
			click(driver, Rate_Newbutton);
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

			waitForElement(driver, Dateclick);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick);
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			waitForElement(driver, Dateclick1);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick1);
				clearAndType(driver, Dateclick1, To_Date_Input);
			}
			Step_Start(2, " Enter the customer name", test, test1);

			waitForElement(driver, Customer_Name_search_button);
			click(driver, Customer_Name_search_button);
			waitForElement(driver, Customer_Code_Select_dropdown);
			click(driver, Customer_Code_Select_dropdown);
			selectByText(driver, Customer_Code_Select_dropdown, Cust_code);
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

				waitForDisplay(driver, CustName_ExitBtn);
				if(isDisplayed(driver, CustName_ExitBtn)) {
					waitForElement(driver, CustName_ExitBtn);
					click(driver, CustName_ExitBtn);
				}
				Step_End(2, " Enter the customer name", test, test1);

				Step_Start(3, "Enter the origin", test, test1);
				waitForElement(driver, Orgin_Input);
				sendKeys(driver, Orgin_Input, origin);
				waitForElement(driver, Origin_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				Step_End(3, "Enter the origin", test, test1);

				Step_Start(4, "Enter the Delivery", test, test1);

				waitForElement(driver, Delivery_Input);
				sendKeys(driver, Delivery_Input, delivery);
				waitForElement(driver, Delivery_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Delivery Value:" + delivery);
				Step_End(4, "Enter the Delivery", test, test1);

				Step_Start(5, "Enter the Commodity.", test, test1);

				waitForElement(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, commodity);
				waitForElement(driver, Commodity_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Commodity Value:" + commodity);

				Step_End(5, "Enter the Commodity.", test, test1);

				Step_Start(6, "Enter the Equipment type.", test, test1);
				waitForElement(driver, Eqp_Type);
				click(driver, Eqp_Type);
				sendKeys(driver, Eqp_Type, eqpType);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Eqp type:"+eqpType);
				Step_End(6, "Enter the Equipment type.", test, test1);

				Step_Start(7, " Enter the Quantity", test, test1);

				waitForElement(driver, Eqp_Quantity);
				click(driver, Eqp_Quantity);
				Newclear(driver, Eqp_Quantity);
				Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
				Step_End(7, " Enter the Quantity", test, test1);

				Step_Start(8, "Enter the Gross Weight", test, test1);

				waitForElement(driver, Gross_Weight);
				Newclear(driver, Gross_Weight);
				Actionsendkeys(driver, Gross_Weight, grossWeight);
				Step_End(8, "Enter the Gross Weight", test, test1);
				//checkboxs
				checkBox(driver, DG_checkbox, DG_checkboxs);

				checkBox(driver, oog_checkbox, OOG_checkbox);

				checkBox(driver, nor_checkbox, NOR_checkbox);


				Step_Start(9, "Click on the SOC Flag", test, test1);

				waitForElement(driver, soc_checkbox);
				checkBox(driver, soc_checkbox, SOC_checkbox);

				Step_End(9, "Click on the SOC Flag", test, test1);


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
					System.out.println(wantToSavePopup+" is not displayed");
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
					System.out.println(wantToProceedPopup+ " popup is not displayed");
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
					System.out.println(submittedPopup+ " popup is not displayed");

					Extent_fail(driver,"Not Matched || Expected : "+submittedPopup+" Actual : "+ actSubmittedPopup, test,test1);
					System.out.println("Not Matched || Expected : "+submittedPopup+" Actual : "+ actSubmittedPopup);
				}
				Step_End(16, "Click Ok", test, test1);
				waitForElement(driver, reqNo_Textfield);
				String actualReqNoSOC=getAttribute(driver, reqNo_Textfield, "value");
				System.out.println("Request Number:"+actualReqNoSOC);  

				if(!actualReqNoSOC.equals(null)) {
					Extent_pass(driver,"Matched || "+ actualReqNoSOC + "  is  generated", test,test1);
					System.out.println("Matched || "+actualReqNoSOC+ "  is  generated");

				}else {
					System.out.println("Not Matched || "+ actualReqNoSOC+ "Request Number  is not generated");

					Extent_fail(driver,"Not Matched || "+ actualReqNoSOC + "Request Number  is not generated", test,test1);
				}

				waitForElement(driver, Grid_Request_Status);
				String actGridReqStatusSOC = getText(driver, Grid_Request_Status);
				if (actGridReqStatusSOC.equals(gridRequestStatus)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridReqStatusSOC);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridReqStatusSOC, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridReqStatusSOC);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridReqStatusSOC, test,test1);
				}
				waitForElement(driver, Request_Status);
				String actReqStatusSOC = getAttribute(driver, Request_Status, "value");
				if (actReqStatusSOC.equals(requestStatus)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actReqStatusSOC);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actReqStatusSOC, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actReqStatusSOC);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actReqStatusSOC, test,test1);
				}

				Extent_call(test, test1, "Checking whether the SOC flag is enabled in the screen when submitted");
				waitForElement(driver, soc_checkbox);
			if(isElementSelected(driver, soc_checkbox)){
				System.out.println("SOC FLAG IS SELECTED IN THE SCREEN ");
				Extent_pass(driver, "SOC FLAG IS SELECTED IN THE SCREEN ", test, test1);
				
			}else {
				System.out.println("SOC FLAG IS NOT SELECTED IN THE SCREEN ");
				extent_fail(driver, "SOC FLAG IS NOT SELECTED IN THE SCREEN ", test, test1);
				
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
					waitForElement(driver, submit_RadioButton);
					click(driver, submit_RadioButton);

					waitForElement(driver, menu_Icon_Grid);
					click(driver, menu_Icon_Grid);

					waitForElement(driver, filter_Icon_Grid);
					click(driver, filter_Icon_Grid);

					waitForElement(driver, filter_Inputfield);
					click(driver, filter_Inputfield);
					waitForElement(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, actualReqNoSOC);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNumSOC=getText(driver, select_Actual_ReqNo);
					if(submitted_ReqNumSOC.equals(actualReqNoSOC)) {
						System.out.println("Matched || " + " Expected Value is : " + actualReqNoSOC + " || Actual Value is : " + submitted_ReqNumSOC);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + actualReqNoSOC + " || ActualValue is : " + submitted_ReqNumSOC,test,test1);
						Extent_pass(driver, actualReqNoSOC+"  is submitted", test,test1);
						System.out.println(actualReqNoSOC+" is submitted");

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver, close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);

					}else {
						System.out.println(actualReqNoSOC+" is not submitted");
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNoSOC + " || Actual Value  is : " + submitted_ReqNumSOC);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + actualReqNoSOC + " || Actual Value is : " + submitted_ReqNumSOC,test,test1);
						
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
					sendKeys(driver, filter_Inputfield, actualReqNoSOC);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNumSOC=getText(driver, select_Actual_ReqNo);
					if(pending_ReqNumSOC.equals(actualReqNoSOC)) {

						System.out.println("Matched || " + " Expected Value is : " + actualReqNoSOC + " || Actual Value is : " + pending_ReqNumSOC);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + actualReqNoSOC + " || ActualValue is : " + pending_ReqNumSOC,test,test1);
						Extent_pass(driver, actualReqNoSOC+"  is moved To pending", test,test1);
						System.out.println(actualReqNoSOC+" is moved To pending");

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
						System.out.println(actualReqNoSOC+" is not moved To pending");
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNoSOC + " || Actual Value  is : " + pending_ReqNumSOC);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + actualReqNoSOC + " || Actual Value is : " + pending_ReqNumSOC,test,test1);
					}		

				}
			}
			Extent_call(test, test1, "Rate request Delete Ended");
			 waitForElement(driver, srrGate_Tab);
			  click(driver, srrGate_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
			  		
					Extent_completed(tc_Name, test, test1);

		}
		
int tc05=1;
		
		if(tc05 == 1) {
			
			String tc_Name="TC_Rate_Request_SC05";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name, tc_Name,
					"Dataset" + selected_dataset, File_Path);


			String rateRequestModule = Data.get("ModuleRateRequest");
			String origin = Data.get("origin");
			String delivery = Data.get("delivery");
			String commodity = Data.get("commodity");
			String moduleSRRGate = Data.get("ModuleSRRGate");
			String requestStatus = Data.get("RequestStatus");
			String gridRequestStatus = Data.get("GridRequestStatus");
			String submittedPopup = Data.get("SubmittedPopup");
			String wantToProceedPopup = Data.get("WantToProceedPopup");
			String wantToSavePopup = Data.get("WantToSavePopup");
			String oFR = Data.get("oFR");
			String eqpType = Data.get("eqpType");
			String grossWeight = Data.get("GrossWeight");
			String Exp_Det_Days_Input = Data.get("Exp_Det_Days_Input");
			String Imp_Det_Days_Input = Data.get("Imp_Det_Days_Input");
			String Exp_Demmurage_Input = Data.get("Exp_Demmurage_Input");
			String Imp_Demmurage_Input = Data.get("Imp_Demmurage_Input");
			String SOC_checkbox = Data.get("SOC_checkbox");
			String NOR_checkbox = Data.get("NOR_checkbox");
			String OOG_checkbox = Data.get("OOG_checkbox");
			String DG_checkboxs = Data.get("DG_checkboxs");
			String Routing_Service = Data.get("Routing_Service");
			String Routing_Origin = Data.get("Routing_Origin");
			String Eqp_Quantity_Input = Data.get("Eqp_Quantity_Input");
			String Cust_code = Data.get("Cust_code");
			String Condition_Value = Data.get("Condition_Value");
			String Customer_code_Value = Data.get("Customer_code_Value");
			String To_Date_Input = Data.get("To_Date_Input");
			String date_Picker = Data.get("date_Picker");
			String From_Date_Input = Data.get("From_Date_Input");
			String Do_You_Want_Delete = Data.get("Do_You_Want_Delete");
			String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
			String On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
			String expected_Request_Type = Data.get("Expected_Request_Type");
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
			Request_Input=Data.get("Request_Type_Input");
			SRR_Request_Input=Data.get("SRR_Req_Input");
			
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
			String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);
			String SRR_Req_type_Locator= String.format(Rate_Request_Loactors.SRR_Gate_Request_type, SRR_Request_Input);
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 
			boolean flag=false;

			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();

			Extent_Start(tc_Name, test, test1);


			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, rateRequestModule);
			waitForElement(driver, Rate_Request);
			click(driver, Rate_Request);

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
			waitForElement(driver, Rate_Newbutton);
			click(driver, Rate_Newbutton);
			Step_End(1, "Click on the new button in the toolbar", test, test1);	// Selecting the From Date
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
				click(driver, Dateclick);
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			waitForElement(driver, Dateclick1);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
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
			Step_Start(3, " Enter the customer name", test, test1);

			waitForElement(driver, Customer_Name_search_button);
			click(driver, Customer_Name_search_button);
			waitForElement(driver, Customer_Code_Select_dropdown);
			click(driver, Customer_Code_Select_dropdown);
			selectByText(driver, Customer_Code_Select_dropdown, Cust_code);
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

				Step_End(3, " Enter the customer name", test, test1);

				Step_Start(4, "Enter the origin", test, test1);
				waitForElement(driver, Orgin_Input);
				sendKeys(driver, Orgin_Input, origin);
				waitForElement(driver, Origin_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				Step_End(4, "Enter the origin", test, test1);

				Step_Start(5, "Enter the Delivery", test, test1);

				waitForElement(driver, Delivery_Input);
				sendKeys(driver, Delivery_Input, delivery);
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
				String actGridRequestStatus = getText(driver, Grid_Request_Status);
				if (actGridRequestStatus.equals(gridRequestStatus)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus, test,test1);
					 flag=true;
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus, test,test1);
				}
				waitForElement(driver, Request_Status);
				String actRequestStatus = getAttribute(driver, Request_Status, "value");
				if (actRequestStatus.equals(requestStatus)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
				}
				
				Extent_call(test, test1, "Verifying the request type status");
				waitForElement(driver, request_Type_Status);
				String actual_Req_Type = getText(driver, request_Type_Status);
				if(actual_Req_Type.equals(expected_Request_Type)) {
					System.out.println("Matched|| "+" Expected REQUEST TYPE is : "+expected_Request_Type+" || Actual REQUEST TYPE is : "+ actual_Req_Type);
					Extent_pass(driver, "Matched|| "+" Expected REQUEST TYPE is : "+expected_Request_Type+" || Actual REQUEST TYPE is : "+ actual_Req_Type, test, test1);
				}else {
					
					System.out.println("Not Matched|| "+" Expected REQUEST TYPE is : "+expected_Request_Type+" || Actual REQUEST TYPE is : "+ actual_Req_Type);
					Extent_fail(driver, "Not Matched|| "+" Expected REQUEST TYPE is : "+expected_Request_Type+" || Actual REQUEST TYPE is : "+ actual_Req_Type, test, test1);
				}

				if (flag) {
					System.out.println("system allows to Submit an Special type rate request");
					Extent_pass(driver, "system allows to Submit an Special type rate request", test, test1);

				} else {
					System.out.println("system not allows to Submit an Special type rate request");
					Extent_fail(driver, "system not allows to Submit an Special type rate request", test, test1);

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
					waitForElement(driver, filter_Inputfield);
					sendKeys(driver, filter_Inputfield, actualReqNo);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String submitted_ReqNum=getText(driver, select_Actual_ReqNo);
					if(submitted_ReqNum.equals(actualReqNo)) {
						System.out.println("Matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + submitted_ReqNum);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + actualReqNo + " || ActualValue is : " + submitted_ReqNum,test,test1);
						Extent_pass(driver, actualReqNo+"  is submitted", test,test1);
						System.out.println(actualReqNo+" is submitted");

						click(driver, select_Actual_ReqNo);
						waitForElement(driver, select_Actual_ReqNo);
						RightClick(driver, select_Actual_ReqNo);
						waitForElement(driver, moveTo_Pending);
						click(driver, moveTo_Pending);
						waitForElement(driver, close_Moved_Pending_Popup);
						click(driver, close_Moved_Pending_Popup);

					}else {
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value  is : " + submitted_ReqNum);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + submitted_ReqNum,test,test1);
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
					sendKeys(driver, filter_Inputfield, actualReqNo);
					enter(driver);

					waitForElement(driver, select_Actual_ReqNo);
					String pending_ReqNum=getText(driver, select_Actual_ReqNo);
					if(pending_ReqNum.equals(actualReqNo)) {
						System.out.println("Matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + pending_ReqNum);
						Extent_pass(driver,"Matched || " + " Expected Value is : " + actualReqNo + " || ActualValue is : " + pending_ReqNum,test,test1);
						Extent_pass(driver, actualReqNo+"  is Deleted", test,test1);
						System.out.println(actualReqNo+" is Deleted");

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
						System.out.println("Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value  is : " + pending_ReqNum);
						Extent_fail(driver,"Not matched || " + " Expected Value is : " + actualReqNo + " || Actual Value is : " + pending_ReqNum,test,test1);
					}	
				}
			}
			Extent_call(test, test1, "Rate request Delete Ended");
			 waitForElement(driver, srrGate_Tab);
			  click(driver, srrGate_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
					Extent_completed(tc_Name, test, test1);

		}
		
int tc06=1;
		
		if(tc06 == 1) {
			String tc_Name="TC_Rate_Request_SC06";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name, tc_Name,
					"Dataset" + selected_dataset, File_Path);


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
			String Routing_Service = Data.get("Routing_Service");
			String Routing_Origin = Data.get("Routing_Origin");
			String moduleSRRGate = Data.get("ModuleSRRGate");

			Request_Input=Data.get("Request_Type_Input");
			SRR_Request_Input=Data.get("SRR_Req_Input");
			tService=Data.get("T_Service");
			TOS=Data.get("TOS_Option");
			String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
			String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 

			String Request_Type_Locator = String.format(Rate_Request_Loactors.RequestType, Request_Input);
			String SRR_Req_type_Locator= String.format(Rate_Request_Loactors.SRR_Gate_Request_type, SRR_Request_Input);
			String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
			String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


			StringBuilder day = new StringBuilder();
			StringBuilder month = new StringBuilder();
			StringBuilder year = new StringBuilder();

			Extent_Start(tc_Name, test, test1);		
			//Enter Enquiry History model
			waitForElement(driver, Module_SearchR);
			sendKeys(driver, Module_SearchR, rateRequestModule);
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
			waitForElement(driver, Dateclick);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick);
				datePicker(From_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input);
			}
			// Selecting the to Date
			waitForElement(driver, Dateclick1);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				click(driver, Dateclick1);
				datePicker(To_Date_Input, day, month, year);
				waitForElement(driver, Month_DD);
				selectByText(driver, Month_DD,month.toString());
				waitForElement(driver, Year_DD);
				selectByText(driver, Year_DD,year.toString());
				String date_select =String.format(Rate_Request_Loactors.date_select, day);
				waitForElement(driver, date_select);
				click(driver, date_select);
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
			waitForElement(driver, Customer_Code_Select_dropdown);
			click(driver, Customer_Code_Select_dropdown);
			selectByText(driver, Customer_Code_Select_dropdown, Cust_code);
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



				waitForElement(driver, Exp_Days);
				sendKeys(driver, Exp_Days, Exp_Det_Days_Input);

				waitForElement(driver, Imp_Days);
				sendKeys(driver, Imp_Days, Imp_Det_Days_Input);

				waitForElement(driver, Exp_Demurage);
				sendKeys(driver, Exp_Demurage, Exp_Demmurage_Input);

				waitForElement(driver, Imp_Demurage);
				sendKeys(driver, Imp_Demurage, Imp_Demmurage_Input);

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
			  waitForElement(driver, srrGate_Tab);
			  click(driver, srrGate_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
			  		waitForElement(driver, close_Tab);
			  		click(driver, close_Tab);
			
			
					Extent_completed(tc_Name, test, test1);

			
			
			
			
		}
		
		
		
		
	}
}
