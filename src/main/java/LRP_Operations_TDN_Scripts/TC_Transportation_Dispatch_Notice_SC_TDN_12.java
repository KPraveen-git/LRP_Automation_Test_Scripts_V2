package LRP_Operations_TDN_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Tdn_Locators;

public class TC_Transportation_Dispatch_Notice_SC_TDN_12 extends Keywords{

	public void Transportation_Dispatch_Notice_SC_TDN_12(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		
		
		String tc_Name="TC_Transportation_Dispatch_Notice_SC_TDN_12";
		String File_Path_SC12 = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC12 = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> TDN_SC_12 = Utils.GetAllData(Sheet_Name_SC12, tc_Name, "Dataset"+selected_dataset, File_Path_SC12);
		
		
		String username=TDN_SC_12.get("Username");
		String password=TDN_SC_12.get("Password");
		String moduleTDN=TDN_SC_12.get("ModuleTDN");
		String agencyUser = TDN_SC_12.get("AgencyUser");
		String Booking_Number =TDN_SC_12.get("Booking_Number");
		String Provisional_perform =TDN_SC_12.get("Provisional_perform");
		String Draft_perform =TDN_SC_12.get("Draft_perform");
		String Confirmed_perform =TDN_SC_12.get("Confirmed_perform");
		String Cancelled_perform =TDN_SC_12.get("Cancelled_perform");
		String Shipment_Type =TDN_SC_12.get("Shipment_Type");
		String Booking_Number_perform =TDN_SC_12.get("Booking_Number_perform");
		String Ware_House_number =TDN_SC_12.get("Ware_House_number");
		String Trans_select =TDN_SC_12.get("Trans_select");
		String App_Date =TDN_SC_12.get("App_Date");
		String date_Picker =TDN_SC_12.get("date_Picker");
		String tdn_SavedPopup =TDN_SC_12.get("TDN_SavedPopup");
		String Modeof_Transport =TDN_SC_12.get("Modeof_Transport");
		String Modeof_Transport_Type =TDN_SC_12.get("Modeof_Transport_Type");
		String Vender_Code =TDN_SC_12.get("Vender_Code");
		String Global_search_Vendor_Code_Option1 =TDN_SC_12.get("Global_search_Vendor_Code_Option1");
		String Dropdown_Condition =TDN_SC_12.get("Dropdown_Condition");
		String Global_search_Book_No =TDN_SC_12.get("Global_search_Book_No");
		String Global_search_Option1 =TDN_SC_12.get("Global_search_Option1");
		String expected_Status =TDN_SC_12.get("expected_Status").trim();
		String merchantPopup =TDN_SC_12.get("MerchantPopup");
		
		String pickup_loc_dd_data =TDN_SC_12.get("pickup_loc_dd_data");
		String pickup_loc_search_data =TDN_SC_12.get("pickup_loc_search_data");
		String condition =TDN_SC_12.get("condition");
		String cust_depot_term_data =TDN_SC_12.get("cust_depot_term_data");
		String cust_dep_search_data =TDN_SC_12.get("cust_dep_search_data");
		String return_loc_dd_data =TDN_SC_12.get("return_loc_dd_data");
		String return_loc_search_data =TDN_SC_12.get("return_loc_search_data");
		String leg_pickupdate =TDN_SC_12.get("leg_pickupdate");
		String leg_return_date =TDN_SC_12.get("leg_return_date");
		String with_chasis_flag =TDN_SC_12.get("with_chasis_flag");
		String chasis_pickup_dd_data =TDN_SC_12.get("chasis_pickup_dd_data");
		String chasis_drop_dd_data =TDN_SC_12.get("chasis_drop_dd_data");
		String Search_Type2 =TDN_SC_12.get("Search_Type2");
		String Search_Input2 =TDN_SC_12.get("Search_Input2");
		String Search_Type3 =TDN_SC_12.get("Search_Type3");
		String Search_Input3 =TDN_SC_12.get("Search_Input3");
		String cust_depot_term_header =TDN_SC_12.get("cust_depot_term_header");
		String return_location_header =TDN_SC_12.get("return_location_header");
		String pickup_location_header =TDN_SC_12.get("pickup_location_header");
		String chasis_pickup_header =TDN_SC_12.get("chasis_pickup_header");
		String chasis_drop_header =TDN_SC_12.get("chasis_drop_header");
		String chasis_pickup_Search_data =TDN_SC_12.get("chasis_pickup_Search_data");
		String chasis_drop_Search_data =TDN_SC_12.get("chasis_drop_Search_data");
		String Chassis_Mode =TDN_SC_12.get("Chassis_Mode");
		
		
		
		String shipmenttype_select=String.format(Tdn_Locators.shipmenttype_select, Shipment_Type);
		
	navigateUrl(driver,url);
	
	Extent_Start(tc_Name, test, test1);
//	Login
		
	LRP_Login(driver, username, password);
	
	Extent_call(test, test1,"**Switch the Profile Start**");


//	Switch the Profile
	
	SwitchProfile(driver, agencyUser);
	
	Extent_cal(test, test1, "Transportaion Dispatch Notice");
	
	moduleNavigate(driver, moduleTDN);

	waitForDisplay(driver, NewButton_ToolBar);
	
	if(isdisplayed(driver, NewButton_ToolBar) && isElementAccessible(driver, NewButton_ToolBar)) {
		
		click(driver, NewButton_ToolBar);
		
		waitForElement(driver, popup_Message_Yes_Button);
		click(driver, popup_Message_Yes_Button);
		
	}
		
		Step_Start(1, "Select shipment type as import and Ensure draft checkbox is selected.", test, test1);

		waitForElement(driver, shipment_Dropdown);
		click(driver, shipment_Dropdown);
		safeclick(driver, shipmenttype_select);
		
		waitForElement(driver, Provisional_check_box);
		checkBox(driver, Provisional_check_box, Provisional_perform);
		waitForElement(driver, Provisional_check_box);
		checkBox(driver, Confirmed_check_box, Confirmed_perform);
		checkBox(driver, Cancelled_check_box, Cancelled_perform);
		checkBox(driver, Draft_check_box, Draft_perform);
		waitForElement(driver, draft_Checkbox_Status_Check);
		
		String actual_Draft_Status = getAttribute(driver, draft_Checkbox_Status_Check, "class");
		
		if(actual_Draft_Status.contains(expected_Status)) {
			
			System.out.println("MATCHED || EXPECTED DRAFT STATUS -> "+expected_Status+"|| ACTUAL DRAFT STATUS -> "+actual_Draft_Status);
			Extent_pass(driver, "MATCHED || EXPECTED DRAFT STATUS -> "+expected_Status+"|| ACTUAL DRAFT STATUS -> "+actual_Draft_Status, test, test1);
		}else {
			
			System.out.println("NOT MATCHED || EXPECTED DRAFT STATUS -> "+expected_Status+"|| ACTUAL DRAFT STATUS -> "+actual_Draft_Status);
			Extent_fail(driver, "NOT MATCHED || EXPECTED DRAFT STATUS -> "+expected_Status+"|| ACTUAL DRAFT STATUS -> "+actual_Draft_Status, test, test1);
		
		}
		
		Step_End(1, "Select shipment type as import and Ensure draft checkbox is selected.", test, test1);

		
		if (Booking_Number_perform.equalsIgnoreCase("YES")) {

			List<String> datas = splitAndExpand(Booking_Number);
			for (String data1 : datas) {
				
				Step_Start(2, "Click add(+) button in BL field.", test, test1);

				waitForElement(driver, BL_Add);
				safeclick(driver, BL_Add);
			
				Step_End(2, "Click add(+) button in BL field.", test, test1);
				
				Step_Start(3, "Paste BL number and click search button.", test, test1);
				
				Step_Start(4, "Select the BL number", test, test1);

				globalValueSearchWindow(driver, Dropdown_Condition, Global_search_Book_No, data1, Search_Type2, Search_Input2, Search_Type3, Search_Input3);
				Step_End(3, "Paste BL number and click search button.", test, test1);
				
				Step_End(4, "Select the BL number", test, test1);

			}
		} else {
			System.out.println("Booking number was not added");
		}
		Step_Start(5, "system will display 'Selected Booking is a Merchant. Do you want to proceed?', click yes.", test, test1);

		waitForDisplay(driver, TDN_Popup_Msg);
		if (isdisplayed(driver, TDN_Popup_Msg)) {
			String actualPopup=getText(driver, TDN_Popup_Msg).trim();
			if(actualPopup.equals(merchantPopup.trim())) {
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
		
		Step_Start(7, "select BL number from drop down.", test, test1);

		waitForElement(driver, Select_Booking_DD);
		click(driver, Select_Booking_DD);
		
		String contract_click1=String.format(Tdn_Locators.contract_click1, Booking_Number);
		waitForElement(driver, contract_click1);
		click(driver, contract_click1);
		
		Step_End(7, "select BL number from drop down.", test, test1);

		Step_Start(8, "click all in the box.", test, test1);

		waitForElement(driver, Select_Booking_all);
		click(driver, Select_Booking_all);
		
		Step_End(8, "click all in the box.", test, test1);
		
		Step_Start(9, "click search icon in the warehouse field.", test, test1);


		waitForElement(driver, Add_ware_house);
		click(driver, Add_ware_house);
		
		Step_End(9, "click search icon in the warehouse field.", test, test1);

		Step_Start(10, "enter % in warehouse name.", test, test1);

		Step_Start(11, "click on the warehouse and click select button.", test, test1);

		globalValueSearchWindow(driver, Dropdown_Condition, Global_search_Option1, Ware_House_number, Search_Type2, Search_Input2, Search_Type3, Search_Input3);
		Step_End(10, "enter % in warehouse name.", test, test1);
		
		Step_End(11, "click on the warehouse and click select button.", test, test1);
		
		Step_Start(12, "click in app date field and select the current date.", test, test1);

		waitForElement(driver, Date_click);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			
			selectDatePickerWithTime1(driver, Date_click, App_Date);

			
		} else {
			waitForElement(driver, Date_click);
			clearAndType(driver, Date_click, App_Date);
		}
		
		Step_End(12, "click in app date field and select the current date.", test, test1);
		
		Step_Start(13, "select mode of transport as truck in drop down.", test, test1);


		waitForElement(driver, mode_of_Trans);
		click(driver, mode_of_Trans);
		String trans_select=String.format(Tdn_Locators.trans_select, Trans_select);
		waitForElement(driver, trans_select);
		click(driver, trans_select);
		Step_End(13, "select mode of transport as truck in drop down.", test, test1);

		Step_Start(14, "click add button.", test, test1);
		
		waitForElement(driver, Customer_Add_Button);
		click(driver, Customer_Add_Button);
		Step_End(14, "click add button.", test, test1);
		
		Step_Start(15, "Click master Tab.", test, test1);
		
		waitForElement(driver, TDN_master_tab);
		click(driver,TDN_master_tab);
		
		Step_End(15, "Click master Tab.", test, test1);

		Step_Start(16, "select the container.", test, test1);

		waitForElement(driver, addleg_select);
		click(driver, addleg_select);
		
		Step_End(16, "select the container.", test, test1);
		
		Step_Start(17, "click add leg button.", test, test1);
		
		waitForElement(driver, add_legbtn);
		click(driver, add_legbtn);
		
		Step_End(17, "click add leg button.", test, test1);
		
		Step_Start(18, "select mode of transport as truck in drop down.", test, test1);
		
		waitForElement(driver, modeof_transport);
		click(driver, modeof_transport);
		
		String Select_ModeOfTransport=String.format(Tdn_Locators.Select_ModeOfTransport, Modeof_Transport);
		safeclick(driver, Select_ModeOfTransport);
		
		Step_End(18, "select mode of transport as truck in drop down.", test, test1);
		

		Step_Start(19, "click search icon in vendor details, enter % in vendor code and select the vendor.", test, test1);

	    waitForElement(driver, vendor_searchicon);
	    click(driver, vendor_searchicon);
	    
	    globalValueSearchWindow(driver, Dropdown_Condition, Global_search_Vendor_Code_Option1, Vender_Code, Search_Type2, Search_Input2, Search_Type3, Search_Input3);
	 
		Step_End(19, "click search icon in vendor details, enter % in vendor code and select the vendor.", test, test1);

		Step_Start(20, "select Trans. Type Mode as (drop only/Live Load) in drop down.", test, test1);

		click(driver,modeof_transport_type);
		String Select_ModeOfTransport_type=String.format(Tdn_Locators.Select_ModeOfTransport, Modeof_Transport_Type);
		safeclick(driver, Select_ModeOfTransport_type);
		
		//pickuplocation
		waitForElement(driver, pickup_loc_label);
		if(!pickup_loc_dd_data.equalsIgnoreCase("")) {
			
			waitForElement(driver,pickup_loc_label);
			click(driver, pickup_loc_label);
			
			String pickup_dd = String.format(DropDown_Select, pickup_loc_dd_data);
			waitForElement(driver, pickup_dd);
			click(driver, pickup_dd);
			
			if(!pickup_loc_search_data.equalsIgnoreCase("")) {
				
				waitForElement(driver, pickup_loc_search_icon);
				click(driver, pickup_loc_search_icon);
			twoColumnSearchWindow(driver, pickup_location_header, condition, pickup_loc_search_data);
			}
		}
		
		//2
		waitForElement(driver, cust_Depot_Term_Label);
		if(!cust_depot_term_data.equals("")) {
			
			waitForElement(driver,cust_Depot_Term_Label);
			click(driver, cust_Depot_Term_Label);
			
			String cust_depo_dd = String.format(DropDown_Select, cust_depot_term_data);
			waitForElement(driver, cust_depo_dd);
			click(driver, cust_depo_dd);
			
			if(!cust_dep_search_data.equalsIgnoreCase("")) {
				
				waitForElement(driver, cust_depo_term_search_icon);
				click(driver, cust_depo_term_search_icon);
				twoColumnSearchWindow(driver, cust_depot_term_header, condition, cust_dep_search_data);

			}
		}
		
		//3
		
		waitForElement(driver, return_location_label);
		if(!return_loc_dd_data.equalsIgnoreCase("")) {
			
			waitForElement(driver,return_location_label);
			click(driver, return_location_label);
			
			String return_loc_dd = String.format(DropDown_Select, return_loc_dd_data);
			waitForElement(driver, return_loc_dd);
			click(driver, return_loc_dd);
			
			if(!return_loc_search_data.equalsIgnoreCase("")) {
				waitForElement(driver, return_location_searchicon);
				click(driver, return_location_searchicon);
				twoColumnSearchWindow(driver, return_location_header, condition, return_loc_search_data);

			}
		}
		
		//4
		
		waitForElement(driver, pickupdate_leg);
		if (!leg_pickupdate.equals("")) {
			
			selectDatePickerWithTime1(driver, pickupdate_leg, leg_pickupdate);
		}else {
			waitForElement(driver, pickupdate_leg);
			clearAndType(driver, pickupdate_leg, leg_pickupdate);
		}
		
		//5

		waitForElement(driver, return_date_leg);
		if (!leg_return_date.equals("")) {
			
			selectDatePickerWithTime1(driver, return_date_leg, leg_return_date);
		
		}else {
			waitForElement(driver, return_Date_Field);
			clearAndType(driver, return_Date_Field, leg_return_date);
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
				twoColumnSearchWindow(driver, chasis_pickup_header, condition, chasis_pickup_Search_data);
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
				twoColumnSearchWindow(driver, chasis_drop_header, condition, chasis_drop_Search_data);

			}
		}
		Step_End(20, "select Trans. Type Mode as (drop only/Live Load) in drop down.", test, test1);

		Step_Start(21, "click add button and close the pop window.", test, test1);

		waitForElement(driver, return_date_label_leg);
		click(driver, return_date_label_leg);
		
	    waitForElement(driver, vendor_Code_addbtn);
	    click(driver, vendor_Code_addbtn);
	    
	    isDisplayed(driver, tdnPopup_Ok);
	    if(isdisplayed(driver, tdnPopup_Ok)) {
	    waitForElement(driver, tdnPopup_Ok);
	    click(driver, tdnPopup_Ok);
	    }
	    
	    waitForDisplay(driver, vendor_Code_closebtn);
	    if(isdisplayed(driver, vendor_Code_closebtn)) {
	    click(driver, vendor_Code_closebtn);
	    }
		Step_End(21, "click add button and close the pop window.", test, test1);

		Step_Start(22, "click save icon in toolbar..", test, test1);

	    waitForElement(driver, tdn_SaveButton);
	    click1(driver, tdn_SaveButton);
		Step_End(22, "click save icon in toolbar..", test, test1);
		
		Step_Start(23, "system will display 'Transportation Dispatch Notice saved', click ok.", test, test1);


	    waitForElement(driver, TDN_Popup_Msg);
		String actual_TDN_SavedPopup1=getText(driver, TDN_Popup_Msg);
		
		if(actual_TDN_SavedPopup1.equals(tdn_SavedPopup)) {
			Extent_pass(driver, "Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup1, test, test1);
			System.out.println("Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup1);
			click(driver, tdnPopup_Ok);
		}else {
			System.out.println("Not Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup1);
			Extent_fail(driver, "Not Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup1, test, test1);
		} 
		
		Step_End(23, "system will display 'Transportation Dispatch Notice saved', click ok.", test, test1);

		Extent_completed(tc_Name, test, test1);

	} 

}
