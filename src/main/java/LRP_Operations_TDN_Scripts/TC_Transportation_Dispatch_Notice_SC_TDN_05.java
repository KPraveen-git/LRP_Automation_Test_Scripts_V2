package LRP_Operations_TDN_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Transportation_Dispatch_Notice_SC_TDN_05 extends Keywords{
		public void Transportation_Dispatch_Notice_SC_TDN_05(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
			
			String testCaseName="TC_Transportation_Dispatch_Notice_SC_TDN_05";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			String url = TestNgXml.getdatafromExecution().get(testCaseName);
			Map<String, String> TDN_SC_05 = Utils.GetAllData(Sheet_Name, testCaseName, "Dataset"+selected_dataset, File_Path);
			
			
			String username=TDN_SC_05.get("Username");
			String password=TDN_SC_05.get("Password");
			String moduleTDN=TDN_SC_05.get("ModuleTDN");
			String agencyUser = TDN_SC_05.get("AgencyUser");
			String Booking_Number =TDN_SC_05.get("Booking_Number");
			String Provisional_perform =TDN_SC_05.get("Provisional_perform");
			String Draft_perform =TDN_SC_05.get("Draft_perform");
			String Confirmed_perform =TDN_SC_05.get("Confirmed_perform");
			String Cancelled_perform =TDN_SC_05.get("Cancelled_perform");
			String Shipment_Type =TDN_SC_05.get("Shipment_Type");
			String field_select =TDN_SC_05.get("field_select");
			String Ware_House_number =TDN_SC_05.get("Ware_House_number");
			String Trans_select =TDN_SC_05.get("Trans_select");
			String App_Date =TDN_SC_05.get("App_Date");
			String date_Picker =TDN_SC_05.get("date_Picker");
			String tdn_SavedPopup =TDN_SC_05.get("TDN_SavedPopup");
			String Modeof_Transport =TDN_SC_05.get("Modeof_Transport");
			String ware_House_Type_Select =TDN_SC_05.get("Ware_House_Type_Select");
			String Vender_Code =TDN_SC_05.get("Vender_Code");
			String TransportationDispatchPopUp =TDN_SC_05.get("TransportationDispatchPopUp");
			String Trans_ModeType =TDN_SC_05.get("Trans_ModeType");
			String dropdown_Condition =TDN_SC_05.get("Dropdown_Condition");
			String global_search_Vendor_Code_Option1 =TDN_SC_05.get("Global_search_Vendor_Code_Option1");
			String merchantPopup =TDN_SC_05.get("MerchantPopup");

			String pickup_loc_dd_data=TDN_SC_05.get("pickup_loc_dd_data");
			String pickup_loc_search_data=TDN_SC_05.get("pickup_loc_search_data");
			String condition=TDN_SC_05.get("condition");
			String cust_depot_term_data=TDN_SC_05.get("cust_depot_term_data");
			String cust_dep_search_data=TDN_SC_05.get("cust_dep_search_data");
			String return_loc_dd_data=TDN_SC_05.get("return_loc_dd_data");
			String return_loc_search_data=TDN_SC_05.get("return_loc_search_data");
			String leg_date_Picker=TDN_SC_05.get("leg_date_Picker");
			String leg_pickupdate=TDN_SC_05.get("leg_pickupdate");
			String chasis_pickup_dd_data=TDN_SC_05.get("chasis_pickup_dd_data");
			String chasis_drop_dd_data=TDN_SC_05.get("chasis_drop_dd_data");
			String with_chasis_flag=TDN_SC_05.get("with_chasis_flag");
			String Chassis_Mode=TDN_SC_05.get("pickup_loc_dd_data");
			String Return_Date=TDN_SC_05.get("Return_Date");
			String chasis_pickup_Search_data=TDN_SC_05.get("chasis_pickup_Search_data");
			String chasis_drop_Search_data=TDN_SC_05.get("chasis_drop_Search_data");
			String loadStatus=TDN_SC_05.get("LoadStatus");

			
		navigateUrl(driver,url);
		
		Extent_Start(testCaseName, test, test1);
//		Login
			
		LRP_Login(driver, username, password);

		
		Extent_call(test, test1,"**Switch the Profile Start**");

	SwitchProfile(driver, agencyUser);
		

		Extent_cal(test, test1, moduleTDN);	
			
		moduleNavigate(driver, moduleTDN);
		
			waitForElement(driver, shipment_Dropdown);
			click(driver, shipment_Dropdown);
			String select_Shipment=String.format(shipment_Type, Shipment_Type);
			safeclick(driver, select_Shipment);
			
			Step_Start(1, "select provisional checkbox.", test, test1);
			
			waitForElement(driver, Provisional_check_box);
			checkBox(driver, Provisional_check_box, Provisional_perform);
			waitForElement(driver, Draft_check_box);
			checkBox(driver, Draft_check_box, Draft_perform);
			waitForElement(driver, Draft_check_box);
			checkBox(driver, Confirmed_check_box, Confirmed_perform);
			checkBox(driver, Cancelled_check_box, Cancelled_perform);
			
			Step_End(1, "select provisional checkbox.", test, test1);
			
				List<String> datas = splitAndExpand(Booking_Number);
				for (String data1 : datas) {
					
					Step_Start(2, "Click add(+) button in BookNo field.", test, test1);

					waitForElement(driver, BL_Add);
					safeclick(driver, BL_Add);
					
					Step_End(2, "Click add(+) button in BookNo field.", test, test1);

				
					click(driver, type_Select1);
					selectByText(driver, type_Select1, field_select);
					waitForDisplay(driver, globalSearch_Condition_Dropdown1);
					click(driver, globalSearch_Condition_Dropdown1);
					selectByText(driver, globalSearch_Condition_Dropdown1, dropdown_Condition);
					
					Step_Start(3, "Paste book number and click search button.", test, test1);

					sendKeys(driver, globalSearch_InputTextfield1, data1);

					click(driver, globalSearch_Frame_SearchButton);
					
					
					Step_End(3, "Paste book number and click search button.", test, test1);

					Step_Start(4, "Select the book number", test, test1);

					waitForElement(driver, retrieved_Value_Select);
					click(driver, retrieved_Value_Select);
					
					waitForElement(driver, Aselectbutton1);
					click(driver, Aselectbutton1);
					
					Step_End(4, "Select the book number", test, test1);

				}
			
			Step_Start(5, "system will display 'Selected Booking is a Merchant. Do you want to proceed?', click yes.", test, test1);

			waitForDisplay(driver, TDN_Popup_Msg);
			if (isdisplayed(driver, TDN_Popup_Msg)) {
				String actualPopup=getText(driver, TDN_Popup_Msg);
				if(actualPopup.equals(merchantPopup)) {
					System.out.println("Matched || Expected popup : "+merchantPopup+" || Actual popup : "+actualPopup);
					Extent_pass(driver, "Matched || Expected popup : "+merchantPopup+" || Actual popup : "+actualPopup, test, test1);
					click(driver,yesbtn);
				}
			}
			
			Step_End(5, "system will display 'Selected Booking is a Merchant. Do you want to proceed?', click yes.", test, test1);

			Step_Start(6, "click customer tab.", test, test1);

			waitForDisplay(driver, master_Tab_Table_Row_TDN);
			if(isdisplayed(driver, master_Tab_Table_Row_TDN)) {
				waitForElement(driver, TDN_Customer_Tab);
				click(driver, TDN_Customer_Tab);
			}else{
				waitForElement(driver, remove_Button_TDN);
				click(driver, remove_Button_TDN);
				waitForElement(driver, popup_Message_Ok_Button);
				click(driver, popup_Message_Ok_Button);
				waitForElement(driver, TDN_Customer_Tab);
				click(driver, TDN_Customer_Tab);
			}
			
			Step_End(6, "click customer tab.", test, test1);

			Step_Start(7, "select book number from dropdown.", test, test1);

			waitForElement(driver, Select_Booking_DD);
			click(driver, Select_Booking_DD);
			
			String contract_click1=String.format(bookingNumber_Select, Booking_Number);
			waitForElement(driver, contract_click1);
			click(driver, contract_click1);
			
			Step_End(7, "select book number from dropdown.", test, test1);
			
			Step_Start(8, "click all in the box.", test, test1);

			waitForElement(driver, Select_Booking_all);
			click(driver, Select_Booking_all);
			
			Step_End(8, "click all in the box.", test, test1);

			Step_Start(9, "click search icon in the warehouse field.", test, test1);

			waitForElement(driver, Add_ware_house);
			click(driver, Add_ware_house);
			waitForElement(driver, type_Select1);
			selectByText(driver, type_Select1, ware_House_Type_Select);
			waitForElement(driver, globalSearch_Condition_Dropdown1);
			click(driver, globalSearch_Condition_Dropdown1);
			selectByText(driver, globalSearch_Condition_Dropdown1, dropdown_Condition);
			
			Step_End(9, "click search icon in the warehouse field.", test, test1);

			Step_Start(10, "enter % in warehouse name.", test, test1);

			sendKeys(driver, globalSearch_InputTextfield1, Ware_House_number);

			click(driver, globalSearch_Frame_SearchButton);
			
			Step_End(10, "enter % in warehouse name.", test, test1);

			Step_Start(11, "click on the warehouse and click select button.", test, test1);

			waitForElement(driver, retrieved_Value_Select);
			click(driver, retrieved_Value_Select);
			
			waitForElement(driver, Aselectbutton1);
			click(driver, Aselectbutton1);
			
			Step_End(11, "click on the warehouse and click select button.", test, test1);

			Step_Start(12, "click in app date field and select the current date.", test, test1);

			if (date_Picker.equalsIgnoreCase("Yes")) {
				waitForElement(driver, Date_click);
				selectDatePickerWithTime1(driver, Date_click, App_Date);

				
			} else {
				waitForElement(driver, Date_click);
				clearAndType(driver, Date_click, App_Date);
			}
			
			Step_End(12, "click in app date field and select the current date.", test, test1);

			Step_Start(13, "select mode of transport as truck in dropdown.", test, test1);

			waitForElement(driver, mode_of_Trans);
			click(driver, mode_of_Trans);
			String trans_select=String.format(transport_Select, Trans_select);
			waitForElement(driver, trans_select);
			click(driver, trans_select);

			Step_End(13, "select mode of transport as truck in dropdown.", test, test1);

			Step_Start(14, "click add button.", test, test1);

			click(driver, Customer_Add_Button);
			Step_End(14, "click add button.", test, test1);

			Step_Start(15, "click save icon in tool bar.", test, test1);

			waitForElement(driver, tdn_SaveButton);
			click(driver, tdn_SaveButton);
			
			Step_End(15, "click save icon in tool bar.", test, test1);

			Step_Start(16, "system will display 'Transportation Dispatch Notice saved', click ok.", test, test1);

			waitForElement(driver, TDN_Popup_Msg);
			String actual_TDN_SavedPopup=getText(driver, TDN_Popup_Msg);
			if(actual_TDN_SavedPopup.equals(tdn_SavedPopup)) {
				Extent_pass(driver, "Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup, test, test1);
				System.out.println("Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup);
				click(driver, tdnPopup_Ok);
			}else {
				System.out.println("Not Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup);
				Extent_fail(driver, "Not Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup, test, test1);
			}
			

			Step_End(16, "system will display 'Transportation Dispatch Notice saved', click ok.", test, test1);

			Step_Start(17, "Click make as draft button.", test, test1);

			waitForElement(driver, Make_As_Draft_Button);
			click(driver, Make_As_Draft_Button);
			
			Step_End(17, "Click make as draft button.", test, test1);

			Step_Start(18, "Click master Tab.", test, test1);

			waitForElement(driver, TDN_Master_Tab);
			click(driver,TDN_Master_Tab);
			
			Step_End(18, "Click master Tab.", test, test1);
			
			
			Step_Start(19, "select the container.", test, test1);
			
			
			waitForElement(driver, addleg_select);
			click(driver, addleg_select);
			Step_End(19, "select the container.", test, test1);
			
			Step_Start(20, "click add leg button.", test, test1);

			
			waitForElement(driver, add_legbtn);
			click(driver, add_legbtn);
			
			Step_End(20, "click add leg button.", test, test1);
			
			Step_Start(21, "select mode of transport as truck in drop down.", test, test1);


			waitForElement(driver, modeof_transport);
			click(driver, modeof_transport);
			String Select_ModeOfTransport=String.format(mode_Of_Transport, Modeof_Transport);
			safeclick(driver, Select_ModeOfTransport);
			
			Step_End(21, "select mode of transport as truck in drop down.", test, test1);
			
			Step_Start(22, " click search icon in vendor details, enter % in vendor code and select the vendor.", test, test1);


		    waitForElement(driver, vendor_searchicon);
		    click(driver, vendor_searchicon);
	     		
		    waitForElement(driver, select_first);
	 		click(driver, select_first);
	 		waitForElement(driver, select_first);
	 		selectByText(driver, select_first, global_search_Vendor_Code_Option1);
	 		
	 		waitForElement(driver, globalSearch_Condition_Dropdown1);
	 		click(driver, globalSearch_Condition_Dropdown1);
	 		selectByText(driver, globalSearch_Condition_Dropdown1, dropdown_Condition);
	 		
		    waitForElement(driver, vendor_Code);
		    sendKeys(driver, vendor_Code, Vender_Code);
		    
		    waitForElement(driver, vendor_Code_searchicon);
		    click(driver, vendor_Code_searchicon);
		    
		    waitForElement(driver, retrieved_Value_Select);
			click(driver, retrieved_Value_Select);
			
			waitForElement(driver, Aselectbutton1);
			click(driver, Aselectbutton1);
			
			Step_End(22, " click search icon in vendor details, enter % in vendor code and select the vendor.", test, test1);

			Step_Start(23, "select Trans. Type Mode as pickup only in drop down.", test, test1);


		    waitForElement(driver, modeof_transport_type);
			click(driver,modeof_transport_type);
			String Select_ModeOfTransport_type=String.format(DropDown_Select, Trans_ModeType);
			waitForDisplay(driver, Select_ModeOfTransport_type);
			safeclick(driver, Select_ModeOfTransport_type);
			
			
			waitForElement(driver, pickup_loc_label);
			if(isElementAccessible(driver, pickup_loc_search_icon)) {
			if(!pickup_loc_dd_data.equals("")) {
				waitForElement(driver,pickup_loc_label);
				click(driver, pickup_loc_label);
				String pickup_dd = String.format(DropDown_Select, pickup_loc_dd_data);
				waitForElement(driver, pickup_dd);
				click(driver, pickup_dd);


			}
			if(!pickup_loc_search_data.equalsIgnoreCase("")) {

				waitForElement(driver, pickup_loc_search_icon);
				click(driver, pickup_loc_search_icon);
				selectValue(driver, condition, pickup_loc_search_data);
			}
			}
			//2
			
			waitForElement(driver, cust_Depot_Term_Label);
			if(isElementAccessible(driver, cust_depo_term_search_icon)) {

			if(!cust_depot_term_data.equals("")) {

				waitForElement(driver,cust_Depot_Term_Label);
				click(driver, cust_Depot_Term_Label);

				String cust_depo_dd = String.format(DropDown_Select, cust_depot_term_data);
				waitForElement(driver, cust_depo_dd);
				click(driver, cust_depo_dd);


			}
			if(!cust_dep_search_data.equalsIgnoreCase("")) {

				waitForElement(driver, cust_depo_term_search_icon);
				click(driver, cust_depo_term_search_icon);
				selectValue(driver, condition, cust_dep_search_data);
			}
			}
			//3

			waitForElement(driver, return_location_label);
			if(isElementAccessible(driver, return_location_searchicon)) {

				waitForElement(driver,return_location_label);
				click(driver, return_location_label);

				String return_loc_dd = String.format(DropDown_Select, return_loc_dd_data);
				waitForElement(driver, return_loc_dd);
				click(driver, return_loc_dd);

			

			if(!return_loc_search_data.equalsIgnoreCase("")) {

				waitForElement(driver, return_location_searchicon);
				click(driver, return_location_searchicon);
				selectValue(driver, condition, return_loc_search_data);
			}
			}
		
			waitForElement(driver, with_Chassis_Check_Box);
			checkBox(driver, with_Chassis_Check_Box, with_chasis_flag);

			if(with_chasis_flag.equalsIgnoreCase("yes")) {
				if(!Chassis_Mode.equals("")) {
				String mode_Select = String.format(With_Chassis_Mode, Chassis_Mode);
				waitForElement(driver, mode_Select);
				click(driver, mode_Select);
				}
				if(!chasis_pickup_dd_data.equals("")) {
					waitForElement(driver, Chassis_Pickup_Loc_Label);
				click(driver, Chassis_Pickup_Loc_Label);
				String chasis_pickup_dd = String.format(DropDown_Select, chasis_pickup_dd_data);
				waitForElement(driver, chasis_pickup_dd);
				click(driver, chasis_pickup_dd);
				}
				if(!chasis_pickup_Search_data.equals("")) {
					waitForElement(driver, Chassis_Pickup_Loc_Search);
					click(driver, Chassis_Pickup_Loc_Search);
					selectValue(driver, condition, chasis_pickup_Search_data);
				}
				//drop
				if(!chasis_drop_dd_data.equals("")) {
				waitForElement(driver, Chassis_Drop_Loc_Label);
				click(driver, Chassis_Drop_Loc_Label);
				String chasis_drop_dd = String.format(DropDown_Select, chasis_drop_dd_data);
				waitForElement(driver, chasis_drop_dd);
				click(driver, chasis_drop_dd);
				}
				if(chasis_drop_Search_data.equals("")) {
					waitForElement(driver, Chassis_Drop_Loc_Search);
					click(driver, Chassis_Drop_Loc_Search);
					selectValue(driver, condition, chasis_drop_Search_data);
				}
			}

			//4
			if(!leg_pickupdate.equals("")) {
				waitForElement(driver, pickupdate_leg);
				if (leg_date_Picker.equalsIgnoreCase("Yes")) {
					selectDatePickerWithTime1(driver, pickupdate_leg, leg_pickupdate);
				}else {
					waitForElement(driver, pickupdate_leg);
					clearAndType(driver, pickupdate_leg, leg_pickupdate);
				}
			}
			waitForElement(driver, return_Date_Field);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePickerWithTime1(driver, return_Date_Field, Return_Date);
			} else {
				waitForElement(driver, return_Date_Field);
				clearAndType(driver, return_Date_Field, Return_Date);
			}
			
			if(!loadStatus.equals("")) {
				  waitForElement(driver, loadStatus_TDN);
				    click(driver, loadStatus_TDN);
				    
				String cust_depo_dd = String.format(DropDown_Select, loadStatus);
				waitForElement(driver, cust_depo_dd);
				click(driver, cust_depo_dd);
				}
				
			Step_End(23, "select Trans. Type Mode as pickup only in drop down.", test, test1);
			
			Step_Start(24, "click add button and close the pop window.", test, test1);

		    waitForElement(driver, vendor_Code_addbtn);
		    click(driver, vendor_Code_addbtn);
		    
		    
		    waitForDisplay(driver, tdnPopup_Ok);
		    if (isdisplayed(driver, tdnPopup_Ok)) {
				click(driver,tdnPopup_Ok);
				
			}
		    waitForDisplay(driver, vendor_Code_closebtn);
		    if (isdisplayed(driver, vendor_Code_closebtn)) {
				click(driver,vendor_Code_closebtn);
				
			}
		    
			Step_End(24, "click add button and close the pop window.", test, test1);

			Step_Start(25, "click save icon in toolbar.", test, test1);
			
			scrollTop(driver);
		    waitForElement(driver, tdn_SaveButton);
		    click1(driver, tdn_SaveButton);
		    
			Step_End(25, "click save icon in toolbar.", test, test1);

			Step_Start(26, "system will display 'Transportation Dispatch Notice saved', click ok. ", test, test1);
			
			waitForElement(driver, TDN_Popup_Msg);
			String Transportation_dispatch_savedpopup1 = getText(driver, TDN_Popup_Msg);
			System.out.println(Transportation_dispatch_savedpopup1);
			
			if(TransportationDispatchPopUp.contains(Transportation_dispatch_savedpopup1)) {                                                                                                                  
				System.out.println("Matched || " + " Expected Report Activity is : " + TransportationDispatchPopUp + " || Actual Report Activity is : " + Transportation_dispatch_savedpopup1);   
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + TransportationDispatchPopUp + " || Actual Report Activity is : " + Transportation_dispatch_savedpopup1, test, test1);
			    click(driver, tdnPopup_Ok);

			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected Report Activity is : " + TransportationDispatchPopUp + " || Actual Report Activity is : " + Transportation_dispatch_savedpopup1);        
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + TransportationDispatchPopUp + " || Actual Report Activity is : " + Transportation_dispatch_savedpopup1, test,test1); 
			} 
			    
			Step_End(26, "system will display 'Transportation Dispatch Notice saved', click ok. ", test, test1);
			Extent_completed(testCaseName, test, test1);
			
			
		
		}		
	}	


