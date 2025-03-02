package LRP_Commercial_Rate_Request_Scripts;

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

public class TC_Rate_Request_SC16 extends Keywords {


	public void Rate_Request_SC16(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {


		String testcase_Name="TC_Rate_Request_SC16";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);


		String username = Data.get("Username");
		String password = Data.get("Password");
		String Field_Names =Data.get("ModuleName");
		String agencyUser = Data.get("Agency_user");
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
		String Pre_Carriage_Radiobtn = Data.get("pre_Carriage_Radiobtn");
		String	On_Carriage_Radiobtn = Data.get("On_Carriage_Radiobtn");
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
		

		//Switch User
SwitchProfile(driver, agencyUser);

moduleNavigate(driver, Field_Names);


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
	
		waitForElement(driver, Dateclick);
		if (From_date_perform.equalsIgnoreCase("Yes")) {
			
			selectDatePicker(driver, Dateclick, From_Date_Input);
		} else {
			waitForElement(driver, Dateclick);
			clearAndType(driver, Dateclick, From_Date_Input);
		}
		// Selecting the to Date
		Extent_call(test, test1, "selecting the TO date");
		waitForElement(driver, Dateclick1);
		if (To_date_perform.equalsIgnoreCase("Yes")) {
			
			selectDatePicker(driver, Dateclick1, To_Date_Input);
			
		} else {
			waitForElement(driver, Dateclick1);
			clearAndType(driver, Dateclick1, To_Date_Input);
		}

		Step_Start(2, "Enter the customer name", test, test1);

		waitForElement(driver, Customer_Name_search_button);
		click(driver, Customer_Name_search_button);
		globalValueSearchWindow1(driver, Condition_Value, Customer_Code, Customer_code_Value, search_type2, input2,search_type3, input3);
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

			waitForDisplay(driver, Exp_Days);
			if(isdisplayed(driver, Exp_Days)&&isElementAccessible(driver, Exp_Days)) {
				clearAndType(driver, Exp_Days, Exp_Detention_Days);
			}
			if(isdisplayed(driver, Imp_Days)&&isElementAccessible(driver, Imp_Days)) {
				clearAndType(driver, Imp_Days, Imp_Detention_Days);
			}
			if(isdisplayed(driver, Exp_Demurage)&&isElementAccessible(driver, Exp_Demurage)) {
				clearAndType(driver, Exp_Demurage, Exp_Demurrage);
			}
			if(isdisplayed(driver, Imp_Demurage)&&isElementAccessible(driver, Imp_Demurage)) {
				clearAndType(driver, Imp_Demurage, Imp_Demurrage);
			}

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
			Step_Start(14, "click apply button", test, test1);

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
			waitForElement(driver, Mail_Cancel_button);
			click(driver, Mail_Cancel_button);
			waitForElement(driver,reqNo_Textfield);
			String Value5=getAttribute(driver, reqNo_Textfield, "value");
			System.out.println("Req.No:"+Value5);


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
				}	

				Extent_call(test, test1, "Rate request delete ends");
			}

			Extent_completed(testcase_Name, test, test1);
		}
	}

}




