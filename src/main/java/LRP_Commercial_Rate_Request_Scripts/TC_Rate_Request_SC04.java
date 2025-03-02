package LRP_Commercial_Rate_Request_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Rate_Request_Loactors;

public class TC_Rate_Request_SC04 extends Keywords {

	public void SOCContainer(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		
		String tc_Name="TC_Rate_Request_SC04";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, tc_Name,
				"Dataset" + selected_dataset, File_Path);


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
		String tService = Data.get("T_Service");
		String TOS = Data.get("TOS_Option");
		String Customer_code_Value2 = Data.get("Customer_code_Value2");
		String Customer_code_Value3 = Data.get("Customer_code_Value3");
		String Cust_code2 = Data.get("Cust_code2");
		String Cust_code3 = Data.get("Cust_code3");
		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);
		//Login
				LRP_Login(driver, username, password);
				
			
				
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
		Step_Start(2, " Enter the customer name", test, test1);

		waitForElement(driver, Customer_Name_search_button);
		click(driver, Customer_Name_search_button);
		globalValueSearchWindow1(driver, Condition_Value, Cust_code, Customer_code_Value, Cust_code2, Customer_code_Value2,Cust_code3, Customer_code_Value3);
		waitForDisplay(driver, pop_up_exp);
		if(isdisplayed(driver,pop_up_exp )) {
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
			waitForElement(driver, mail_Cancel_Button);
			click(driver, mail_Cancel_Button);
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
				moduleNavigate(driver, moduleSRRGate);

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
		Extent_completed(tc_Name, test, test1);
	}

}
