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

public class TC_Rate_Request_SC59  extends Keywords {
	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;

	public void Rate_Request_SC59(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String testCase_Name="TC_Rate_Request_SC59";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testCase_Name,"Dataset" + selected_dataset, File_Path);



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
		String OFR1 = Data.get("OFR1");
		String OFR2 = Data.get("OFR2");
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
		String To_Date_Input1 = Data.get("To_Date_Input1");
		String date_Picker = Data.get("date_Picker");
		String From_Date_Input1 = Data.get("From_Date_Input1");
		String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
		String On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
		String From_Date_Input2 = Data.get("From_Date_Input2");
		String To_Date_Input2 = Data.get("To_Date_Input2");
		String closing_To_Date_Input = Data.get("closing_To_Date_Input");
		String Exist_Popup_Msg = Data.get("Exist_Popup_Msg");
		String SRR_Global_Search_Select_Type = Data.get("SRR_Global_Search_Select_Type");
		tService=Data.get("T_Service");
		TOS=Data.get("TOS_Option");
		String Customer_code_Value2 = Data.get("Customer_code_Value2");
		String Customer_code_Value3 = Data.get("Customer_code_Value3");
		String Cust_code2 = Data.get("Cust_code2");
		String Cust_code3 = Data.get("Cust_code3");


		String select_t_Service =  String.format(Rate_Request_Loactors.tService_Option,  tService); 
		String tos =  String.format(Rate_Request_Loactors.TOS_Option,  TOS); 
		String preCarriageLocator = String.format(Rate_Request_Loactors.pre_Carriage_Radiobtn, Pre_Carriage_Radiobtn);
		String onCarriageLocator =  String.format(Rate_Request_Loactors.on_Carriage_Radiobtn,  On_Carriage_Radiobtn); 


		Extent_Start(testCase_Name, test, test1);

		navigateUrl(driver, url);
		//Login
		LRP_Login(driver, username, password);

		//Switch User
		SwitchProfile(driver, agencyUser);

		moduleNavigate(driver, rateRequestModule);

		// Rate Request
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
			selectDatePicker(driver, Dateclick, From_Date_Input1);
		} else {
			waitForElement(driver, Dateclick);
			clearAndType(driver, Dateclick, From_Date_Input1);
		}
		// Selecting the to Date
		waitForElement(driver, Dateclick1);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Dateclick1, To_Date_Input1);
		} else {
			waitForElement(driver, Dateclick1);
			clearAndType(driver, Dateclick1, To_Date_Input1);
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
			waitForElement(driver, globale_Value_select);
			click(driver, globale_Value_select);
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

			checkBox(driver, soc_checkbox, SOC_checkbox);

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
			sendKeys(driver, OFR_Txt_Field, OFR1);

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
			waitForElement(driver, Mail_Cancel_button);
			click(driver, Mail_Cancel_button);
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
				System.out.println("Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
			} else {
				System.out.println("Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
			}
			Step_Start(16, "Switch to line profile and navigate to the special rate request screen using SRR gate screen under Submit node", test, test1);
			ResetProfile(driver);
			moduleNavigate(driver, moduleSRRGate);
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
			doubleClick(driver, select_Actual_ReqNo);
			Step_End(16, "Switch to line profile and navigate to the special rate request screen using SRR gate screen under Submit node", test, test1);
			Step_Start(17, "Click edit", test, test1);

			waitForElement(driver, toolBar_Edit_Button);
			click(driver, toolBar_Edit_Button);
			Step_End(17, "Click edit", test, test1);
			Step_Start(18, "click approve", test, test1);

			scrollBottom(driver);
			waitForElement(driver, SRR_Approve_Button);
			if(isElementEnabled(driver, SRR_Approve_Button)) {
			click(driver, SRR_Approve_Button);
			}else {
				waitForElement(driver, SRR_Contribution);
				click(driver, SRR_Contribution);
				String missingCost = getText(driver, SRR_Missing_Cost_Value);
				waitForElement(driver, Srr_missing_cost_exit_button);
				click(driver, Srr_missing_cost_exit_button);
				scrollTop(driver);
				Common_Cost_Class cost =new Common_Cost_Class();
				cost.parseEquipmentData(driver, missingCost, test, test1, selected_dataset);

				waitForElement(driver, Special_Rate_Request_Module);
				click(driver, Special_Rate_Request_Module);
				waitForElement(driver, refresh_contribution_Srr);
				click(driver, refresh_contribution_Srr);
				scrollBottom(driver);
				waitForElement(driver, SRR_Approve_Button);
				click(driver, SRR_Approve_Button);
			}
			scrollTop(driver);
			waitForElement(driver, toolBar_Save_Button);
			click(driver, toolBar_Save_Button);
			Step_End(18, "click approve", test, test1);
			Step_Start(19, "switch to agency profile", test, test1);
			SwitchProfile(driver, agencyUser);

			Step_End(19, "switch to agency profile", test, test1);
			Step_Start(20, "open the rate request module", test, test1);
			moduleNavigate(driver, rateRequestModule);
			Step_End(20, "open the rate request module", test, test1);
			Step_Start(21, "Click on the new button in the toolbar", test, test1);
			waitForDisplay(driver, Rate_Newbutton);
			if(isdisplayed(driver, Rate_Newbutton)&&isElementEnabled(driver, Rate_Newbutton)) {
				waitForElement(driver, Rate_Newbutton);
				click(driver, Rate_Newbutton);
			}
			Step_End(21, "Click on the new button in the toolbar", test, test1);
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
				selectDatePicker(driver, Dateclick, From_Date_Input2);
			} else {
				waitForElement(driver, Dateclick);
				clearAndType(driver, Dateclick, From_Date_Input2);
			}
			// Selecting the to Date
			waitForElement(driver, Dateclick1);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Dateclick1, To_Date_Input2);
			} else {
				waitForElement(driver, Dateclick1);
				clearAndType(driver, Dateclick1, To_Date_Input2);
			}

			Step_Start(22, " Enter the customer name", test, test1);



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
			if(isdisplayed(driver,pop_up_exp )) {
				String actual_Popup = getText(driver, pop_up_exp);
				System.out.println("The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup);
				Extent_fail(driver, "The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup, test, test1);
			}else {

				waitForElement(driver, globale_Value_select);
				click(driver, globale_Value_select);
				waitForElement(driver, SelectButton);
				click(driver, SelectButton);
				waitForDisplay(driver, CustName_ExitBtn);
				if(isDisplayed(driver, CustName_ExitBtn)) {
					waitForElement(driver, CustName_ExitBtn);
					click(driver, CustName_ExitBtn);
				}

				Step_End(22, " Enter the customer name", test, test1);

				Step_Start(23, "Enter the origin", test, test1);
				waitForElement(driver, Orgin_Input);
				sendKeys(driver, Orgin_Input, origin);
				waitForElement(driver, Origin_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);

				Step_End(23, "Enter the origin", test, test1);

				Step_Start(24, "Enter the Delivery", test, test1);

				waitForElement(driver, Delivery_Input);
				sendKeys(driver, Delivery_Input, delivery);
				waitForElement(driver, Delivery_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Delivery Value:" + delivery);
				Step_End(24, "Enter the Delivery", test, test1);

				Step_Start(25, "Enter the Commodity.", test, test1);

				waitForElement(driver, Commodity_Input);
				sendKeys(driver, Commodity_Input, commodity);
				waitForElement(driver, Commodity_Value);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Commodity Value:" + commodity);

				Step_End(25, "Enter the Commodity.", test, test1);

				Step_Start(26, "Enter the Equipment type.", test, test1);
				waitForElement(driver, Eqp_Type);
				click(driver, Eqp_Type);
				sendKeys(driver, Eqp_Type, eqpType);
				waitForElement(driver, Auto_Panel_First);
				safeclick(driver, Auto_Panel_First);
				System.out.println("Eqp type:"+eqpType);
				Step_End(26, "Enter the Equipment type.", test, test1);

				Step_Start(27, " Enter the Quantity", test, test1);

				waitForElement(driver, Eqp_Quantity);
				click(driver, Eqp_Quantity);
				Newclear(driver, Eqp_Quantity);
				Actionsendkeys(driver, Eqp_Quantity,Eqp_Quantity_Input );
				Step_End(27, " Enter the Quantity", test, test1);

				Step_Start(28, "Enter the Gross Weight", test, test1);

				waitForElement(driver, Gross_Weight);
				Newclear(driver, Gross_Weight);
				Actionsendkeys(driver, Gross_Weight, grossWeight);
				Step_End(28, "Enter the Gross Weight", test, test1);
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
				Step_Start(29, "Click routing", test, test1);

				waitForElement(driver, Routing_Button);
				click(driver, Routing_Button);
				Step_End(29, "Click routing", test, test1);


				Step_Start(30, "Select the routing", test, test1);

				waitForElement(driver, routingSearch_Frame);
				actRoutingFrame=getText(driver, routingSearch_Frame);
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
				Step_End(30, "Select the routing", test, test1);

				Step_Start(31, "Enter the OFR", test, test1);
				waitForElement(driver, OFR_Txt_Field);
				safeclick(driver, OFR_Txt_Field);
				sendKeys(driver, OFR_Txt_Field, OFR2);

				Step_End(31, "Enter the OFR", test, test1);

				Step_Start(32, "Click Add", test, test1);
				waitForElement(driver, Rate_AddBtn);
				click(driver, Rate_AddBtn);

				Step_End(32, "Click Add", test, test1);
				Step_Start(33, "Click Save button in the tool bar", test, test1);
				waitForElement(driver, Rate_SaveBtn);
				click(driver, Rate_SaveBtn);

				waitForElement(driver, Rate_Sub_Popup_Msg);
				actSubmitPopup=getText(driver, Rate_Sub_Popup_Msg);
				if(actSubmitPopup.equals(wantToSavePopup)) {
					Extent_pass(driver,"Matched || Expected : "+wantToSavePopup+" Actual : "+ actSubmitPopup, test,test1);
					System.out.println("Matched || Expected : "+wantToSavePopup+" Actual : "+ actSubmitPopup);
					Extent_pass(driver, wantToSavePopup+" is displayed", test,test1);
					System.out.println(wantToSavePopup+" is displayed");

				}else {
					System.out.println("Not Matched || Expected : "+wantToSavePopup+" Actual : "+ actSubmitPopup);

					Extent_fail(driver,"Not Matched || Expected : "+wantToSavePopup+" Actual : "+ actSubmitPopup, test,test1);
				}

				Step_End(33, "Click Save button in the tool bar", test, test1);

				Step_Start(34, "Click submit", test, test1);
				waitForElement(driver, Rate_SubmitBtn);
				click(driver, Rate_SubmitBtn);
				waitForElement(driver, rate_Request_Popup);
				actualPopup=getText(driver, rate_Request_Popup);
				if(actualPopup.equals(wantToProceedPopup)) {
					Extent_pass(driver,"Matched || Expected : "+wantToProceedPopup+" Actual : "+ actualPopup, test,test1);
					System.out.println("Matched || Expected : "+wantToProceedPopup+" Actual : "+ actualPopup);
					Extent_pass(driver, wantToProceedPopup+" popup is displayed", test,test1);
					System.out.println(wantToProceedPopup+" popup is displayed");


				}else {
					System.out.println("Not Matched || Expected : "+wantToProceedPopup+" Actual : "+ actualPopup);

					Extent_fail(driver,"Not Matched || Expected : "+wantToProceedPopup+" Actual : "+ actualPopup, test,test1);
				}
				Step_End(34, "Click submit", test, test1);
				Step_Start(35, "Click Ok", test, test1);
				waitForElement(driver, Yes_Btn);
				click(driver, Yes_Btn);
				waitForElement(driver, popup_5_Sec);
				actSubmittedPopup=getText(driver, popup_5_Sec);
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
				waitForElement(driver, Mail_Cancel_button);
				click(driver, Mail_Cancel_button);
				Step_End(35, "Click Ok", test, test1);
				waitForElement(driver, reqNo_Textfield);
				String actualReqNo1=getAttribute(driver, reqNo_Textfield, "value");
				System.out.println("Request Number:"+actualReqNo1);  

				if(!actualReqNo.equals(null)) {
					Extent_pass(driver,"Matched || "+ actualReqNo1 + "  is  generated", test,test1);
					System.out.println("Matched || "+actualReqNo1+ "  is  generated");

				}else {
					System.out.println("Not Matched || "+ actualReqNo1+ "Request Number  is not generated");

					Extent_fail(driver,"Not Matched || "+ actualReqNo1 + "Request Number  is not generated", test,test1);
				}


				waitForElement(driver, Grid_Request_Status);
				List<Map<String, String>> table_Values1 = getTableData(driver, RR_Ocean_Freight_Details_Table_Headers, RR_Ocean_Freight_Details_Table_Rows);
				String actGridRequestStatus1 = getFirstValueByHeader(table_Values1, "Request Status");
				if (actGridRequestStatus1.equals(gridRequestStatus)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus1);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus1, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus1);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + gridRequestStatus+ " || Actual Report Activity is : " + actGridRequestStatus1, test,test1);
				}
				waitForElement(driver, Request_Status);
				actRequestStatus = getAttribute(driver, Request_Status, "value");
				if (actRequestStatus.equals(requestStatus)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + requestStatus+ " || Actual Report Activity is : " + actRequestStatus, test,test1);
				}
				
				Step_Start(36, "Switch to line profile and navigate to the special rate request screen using SRR gate screen under Submit node", test, test1);

				ResetProfile(driver);
				moduleNavigate(driver, moduleSRRGate);
				//Submitted	
				waitForElement(driver, submit_RadioButton);
				click(driver, submit_RadioButton);

				waitForElement(driver, menu_Icon_Grid);
				click(driver, menu_Icon_Grid);

				waitForElement(driver, filter_Icon_Grid);
				click(driver, filter_Icon_Grid);

				waitForElement(driver, filter_Inputfield);
				click(driver, filter_Inputfield);
				sendKeys(driver, filter_Inputfield, actualReqNo1);
				enter(driver);
				waitForElement(driver, select_Actual_ReqNo);
				doubleClick(driver, select_Actual_ReqNo);
				Step_End(36, "Switch to line profile and navigate to the special rate request screen using SRR gate screen under Submit node", test, test1);
				Step_Start(37, "Click edit", test, test1);

				waitForElement(driver, toolBar_Edit_Button);
				click(driver, toolBar_Edit_Button);
				Step_End(37, "Click edit", test, test1);

				Step_Start(38, "click approve", test, test1);

				scrollBottom(driver);
				waitForElement(driver, SRR_Approve_Button);
				if(isElementEnabled(driver, SRR_Approve_Button)) {
				click(driver, SRR_Approve_Button);
				}else {
					waitForElement(driver, SRR_Contribution);
					click(driver, SRR_Contribution);
					String missingCost = getText(driver, SRR_Missing_Cost_Value);
					waitForElement(driver, Srr_missing_cost_exit_button);
					click(driver, Srr_missing_cost_exit_button);
					scrollTop(driver);
					Common_Cost_Class cost =new Common_Cost_Class();
					cost.parseEquipmentData(driver, missingCost, test, test1, selected_dataset);

					waitForElement(driver, Special_Rate_Request_Module);
					click(driver, Special_Rate_Request_Module);
					waitForElement(driver, refresh_contribution_Srr);
					click(driver, refresh_contribution_Srr);
					scrollBottom(driver);
					waitForElement(driver, SRR_Approve_Button);
					click(driver, SRR_Approve_Button);
				}
				Step_End(38, ".click approve", test, test1);
				scrollTop(driver);
				waitForElement(driver, toolBar_Save_Button);
				click(driver, toolBar_Save_Button);
				
				waitForElement(driver, toolBar_Search_Button);
				click(driver, toolBar_Search_Button);
				globalValueSearchWindow1(driver, Condition_Value, SRR_Global_Search_Select_Type, actualReqNo1, "", "","", "");
				waitForDisplay(driver, pop_up_exp);
				if(isdisplayed(driver,pop_up_exp )) {
					String actual_Popup = getText(driver, pop_up_exp);
					System.out.println("The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup);
					Extent_fail(driver, "The Customer Code is Invalid Tha Actual Popup value was : "+actual_Popup, test, test1);
				}else {
					waitForElement(driver, globale_Value_select);
					click(driver, globale_Value_select);
					waitForElement(driver, SelectButton);
					click(driver, SelectButton);
					waitForElement(driver, toolBar_Edit_Button);
					click(driver, toolBar_Edit_Button);
				
				scrollBottom(driver);
				waitForElement(driver, to_Date_Button);
				click(driver, to_Date_Button);
				waitForElement(driver, to_Date_Input_Field);
				click(driver, to_Date_Input_Field);
				clear(driver, to_Date_Input_Field);
				sendKeys(driver, to_Date_Input_Field, closing_To_Date_Input);
				
				
				waitForElement(driver, to_Date_Ok_Button);
				click(driver, to_Date_Ok_Button);
				
				waitForElement(driver, popup_5_Sec);
				actSubmittedPopup=getText(driver, popup_5_Sec);
				System.out.println("Submitted Popup: "+actSubmittedPopup);

				if(actSubmittedPopup.equals(Exist_Popup_Msg)) {
					Extent_pass(driver,"Matched || Expected : "+Exist_Popup_Msg+" Actual : "+ actSubmittedPopup, test,test1);
					System.out.println("Matched || Expected : "+Exist_Popup_Msg+" Actual : "+ actSubmittedPopup);
					Extent_pass(driver, Exist_Popup_Msg+" popup is displayed", test,test1);
					System.out.println(Exist_Popup_Msg+" popup is displayed");
				}else {
					System.out.println("Not Matched || Expected : "+Exist_Popup_Msg+" Actual : "+ actSubmittedPopup);
					Extent_fail(driver,"Not Matched || Expected : "+Exist_Popup_Msg+" Actual : "+ actSubmittedPopup, test,test1);
				}
				
				}
			}
		}
		Extent_completed(testCase_Name, test, test1);
	}
}