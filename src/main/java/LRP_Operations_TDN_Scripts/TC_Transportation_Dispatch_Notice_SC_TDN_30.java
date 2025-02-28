package LRP_Operations_TDN_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Transportation_Dispatch_Notice_SC_TDN_30 extends Keywords{

	public void Transportation_Dispatch_Notice_SC_TDN_30(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {

		String testCase_Name ="TC_Transportation_Dispatch_Notice_SC_TDN_30";
		String File_Path_SC30 = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String Sheet_Name_SC30 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		Map<String, String> TDN_SC_30 = Utils.GetAllData(Sheet_Name_SC30, testCase_Name, "Dataset"+selected_dataset, File_Path_SC30);

		String username=TDN_SC_30.get("Username");
		String password=TDN_SC_30.get("Password");
		String moduleTDN=TDN_SC_30.get("ModuleTDN");
		String agencyUser = TDN_SC_30.get("AgencyUser");
		String Provisional_perform =TDN_SC_30.get("Provisional_perform");
		String Confirmed_perform =TDN_SC_30.get("Confirmed_perform");
		String Cancelled_perform =TDN_SC_30.get("Cancelled_perform");
		String Shipment_Type =TDN_SC_30.get("Shipment_Type");
		String Booking_Number_perform =TDN_SC_30.get("Booking_Number_perform");
		String Trans_select =TDN_SC_30.get("Trans_select");
		String App_Date =TDN_SC_30.get("App_Date");
		String date_Picker =TDN_SC_30.get("date_Picker");
		String tdn_SavedPopup =TDN_SC_30.get("TDN_SavedPopup");
		String tdn_Edit_Error_popup =TDN_SC_30.get("tdn_Edit_Error_popup");
		String Modeof_Transport =TDN_SC_30.get("Modeof_Transport");
		String Modeof_Transport_Type =TDN_SC_30.get("Modeof_Transport_Type");
		String Vender_Code =TDN_SC_30.get("Vender_Code");
		String Return_Date =TDN_SC_30.get("Return_Date");
		String TDN_Updated_popup =TDN_SC_30.get("TDN_Updated_popup");
		String merchantPopup =TDN_SC_30.get("MerchantPopup");
		String pickup_loc_dd_data =TDN_SC_30.get("pickup_loc_dd_data");
		String pickup_loc_search_data =TDN_SC_30.get("pickup_loc_search_data");
		String condition =TDN_SC_30.get("condition");
		String cust_depot_term_data =TDN_SC_30.get("cust_depot_term_data");
		String cust_dep_search_data =TDN_SC_30.get("cust_dep_search_data");
		String return_loc_dd_data =TDN_SC_30.get("return_loc_dd_data");
		String return_loc_search_data =TDN_SC_30.get("return_loc_search_data");
		String leg_date_Picker =TDN_SC_30.get("leg_date_Picker");
		String leg_pickupdate =TDN_SC_30.get("leg_pickupdate");
		String with_chasis_flag =TDN_SC_30.get("with_chasis_flag");
		String chasis_pickup_dd_data =TDN_SC_30.get("chasis_pickup_dd_data");
		String chasis_drop_dd_data =TDN_SC_30.get("chasis_drop_dd_data");
		String chasis_pickup_Search_data =TDN_SC_30.get("chasis_pickup_Search_data");
		String chasis_drop_Search_data =TDN_SC_30.get("chasis_drop_Search_data");
		String Chassis_Mode =TDN_SC_30.get("Chassis_Mode");
		
		String Booking_Number1 =TDN_SC_30.get("Booking_Number1");
		String Booking_Number2 =TDN_SC_30.get("Booking_Number2");
		String Booking_Number3 =TDN_SC_30.get("Booking_Number3");
		String Booking_Number_Type_Select1 =TDN_SC_30.get("Booking_Number_Type_Select1");
		String Booking_Number_Type_Select2 =TDN_SC_30.get("Booking_Number_Type_Select2");
		String Booking_Number_Type_Select3 =TDN_SC_30.get("Booking_Number_Type_Select3");
		String ware_House_Type_Select1 =TDN_SC_30.get("ware_House_Type_Select1");
		String Ware_House_number1 =TDN_SC_30.get("Ware_House_number1");
		String ware_House_Type_Select2 =TDN_SC_30.get("ware_House_Type_Select2");
		String Ware_House_number2 =TDN_SC_30.get("Ware_House_number2");
		String ware_House_Type_Select3 =TDN_SC_30.get("ware_House_Type_Select3");
		String Ware_House_number3 =TDN_SC_30.get("Ware_House_number3");
		String Dropdown_Condition =TDN_SC_30.get("Dropdown_Condition");
		String cust_depot_term_header =TDN_SC_30.get("cust_depot_term_header");
		String return_location_header =TDN_SC_30.get("return_location_header");
		String pickup_location_header =TDN_SC_30.get("pickup_location_header");
		String chasis_pickup_header =TDN_SC_30.get("chasis_pickup_header");
		String chasis_drop_header =TDN_SC_30.get("chasis_drop_header");
		String Global_search_Vendor_Code_Option1 =TDN_SC_30.get("Global_search_Vendor_Code_Option1");
		String Vendor_Search_Type2 =TDN_SC_30.get("Vendor_Search_Type2");
		String Vendor_Search_Input2 =TDN_SC_30.get("Vendor_Search_Input2");
		String Vendor_Search_Type3 =TDN_SC_30.get("Vendor_Search_Type3");
		String Vendor_Search_Input3 =TDN_SC_30.get("Vendor_Search_Input3");
		String shipmenttype_select=String.format(shipment_Type, Shipment_Type);



		navigateUrl(driver,url);

		Extent_Start(testCase_Name, test, test1);
		//	Login
		LRP_Login(driver, username, password);
		Extent_call(test, test1,"**Switch the Profile Start**");
		SwitchProfile(driver, agencyUser);
		Extent_cal(test, test1, "Transportaion Dispatch Notice");	
		moduleNavigate(driver, moduleTDN);
		waitForDisplay(driver, NewButton_ToolBar);
		if(isdisplayed(driver, NewButton_ToolBar) && isElementAccessible(driver, NewButton_ToolBar)) {
			click(driver, NewButton_ToolBar);
			waitForElement(driver, popup_Message_Yes_Button);
			click(driver, popup_Message_Yes_Button);
		}
		waitForElement(driver, shipment_Dropdown);
		click(driver, shipment_Dropdown);
		safeclick(driver, shipmenttype_select);

		Step_Start(1, "select provisional checkbox.", test, test1);


		waitForElement(driver, Provisional_check_box);
		checkBox(driver, Provisional_check_box, Provisional_perform);
		waitForElement(driver, Provisional_check_box);
		checkBox(driver, Confirmed_check_box, Confirmed_perform);
		checkBox(driver, Cancelled_check_box, Cancelled_perform);

		Step_End(1, "select provisional checkbox.", test, test1);
		if (Booking_Number_perform.equalsIgnoreCase("YES")) {
			List<String> datas = splitAndExpand(Booking_Number1);
			for (int i=0;i<datas.size();i++) {
				Step_Start(2, "Click add(+) button in BookNo field.", test, test1);
				waitForElement(driver, BL_Add);
				click(driver, BL_Add);
				Step_End(2, "Click add(+) button in BookNo field.", test, test1);
				globalValueSearchWindow(driver, Dropdown_Condition, Booking_Number_Type_Select1, datas.get(i),  Booking_Number_Type_Select2, Booking_Number2, Booking_Number_Type_Select3, Booking_Number3);
				Step_Start(3, "Paste book number and click search button.", test, test1);
				Step_End(3, "Paste book number and click search button.", test, test1);
				Step_Start(4, "Select the book number", test, test1);
				Step_End(4, "Select the book number", test, test1);
			}
		}
		Step_Start(5, " system will display Selected Booking is a Merchant. Do you want to proceed?  click yes.", test, test1);
		waitForDisplay(driver, TDN_Popup_Msg);
		if (isdisplayed(driver, TDN_Popup_Msg)) {
			String actualPopup=getText(driver, TDN_Popup_Msg);
			if(actualPopup.trim().equals(merchantPopup.trim())) {
				System.out.println("Matched || Expected popup : "+merchantPopup+" || Actual popup : "+actualPopup);
				Extent_pass(driver, "Matched || Expected popup : "+merchantPopup+" || Actual popup : "+actualPopup, test, test1);
				click(driver,yesbtn);
			}
		}
		Step_End(5, " system will display Selected Booking is a Merchant. Do you want to proceed?  click yes.", test, test1);
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
		String contract_click1=String.format(bookingNumber_Select, Booking_Number1);
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
		globalValueSearchWindow(driver, Dropdown_Condition, ware_House_Type_Select1, Ware_House_number1, ware_House_Type_Select2, Ware_House_number2, ware_House_Type_Select3, Ware_House_number3);

		Step_End(9, "click search icon in the warehouse field.", test, test1);

		Step_Start(10, "enter % in warehouse name.", test, test1);


		Step_End(10, "enter % in warehouse name.", test, test1);

		Step_Start(11, "click on the warehouse and click select button.", test, test1);

		Step_End(11, "click on the warehouse and click select button.", test, test1);

		Step_Start(12, "click in app date field and select the current date.", test, test1);
		waitForElement(driver, Date_click);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePickerWithTime1(driver, Date_click, App_Date);
		} else {
			waitForElement(driver, Date_click);
			clearAndType(driver, Date_click, App_Date);
		}
waitForElement(driver, local_Cust_Field);
		click(driver, local_Cust_Field);

		Step_End(12, "click in app date field and select the current date.", test, test1);

		Step_Start(13, "select mode of transport as truck in dropdown.", test, test1);

		waitForElement(driver, mode_of_Trans);
		click(driver, mode_of_Trans);
		String trans_select=String.format(transModeType, Trans_select);
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
			Extent_fail(driver, "Not Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup, test, test1);
			System.out.println("Not Matched || Expected Pop up : "+tdn_SavedPopup +" || Actual Pop up : "+actual_TDN_SavedPopup);
		}

		Step_End(16, "system will display 'Transportation Dispatch Notice saved', click ok.", test, test1);

		Step_Start(17, "Click make as draft button.", test, test1);

		waitForElement(driver, Makeasdraft);
		click(driver, Makeasdraft);

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
		waitForElement(driver, addleg);
		click(driver, addleg);
		Step_End(20, "click add leg button.", test, test1);

		Step_Start(21, "select mode of transport as truck in drop down.", test, test1);
		waitForElement(driver, modeof_transport);
		click(driver, modeof_transport);
		String Select_ModeOfTransport=String.format(mode_Of_Transport, Modeof_Transport);
		waitForElement(driver, Select_ModeOfTransport);
		click(driver, Select_ModeOfTransport);

		Step_End(21, "select mode of transport as truck in drop down.", test, test1);

		Step_Start(22, " click search icon in vendor details, enter % in vendor code and select the vendor.", test, test1);


		waitForElement(driver, vendor_searchicon);
		click(driver, vendor_searchicon);
		globalValueSearchWindow(driver, Dropdown_Condition, Global_search_Vendor_Code_Option1, Vender_Code, Vendor_Search_Type2, Vendor_Search_Input2, Vendor_Search_Type3, Vendor_Search_Input3);
		
		Step_End(22, " click search icon in vendor details, enter % in vendor code and select the vendor.", test, test1);

		Step_Start(23, "select Trans. Type Mode as pickup only in drop down.", test, test1);

		click(driver,modeof_transport_type);
		String Select_ModeOfTransport_type=String.format(mode_Of_Transport, Modeof_Transport_Type);
		waitForElement(driver, Select_ModeOfTransport_type);
		click(driver, Select_ModeOfTransport_type);
		Step_End(23, "select Trans. Type Mode as pickup only in drop down.", test, test1);
		//pickuplocation
		waitForElement(driver, pickup_loc_label);
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
			twoColumnSearchWindow(driver, pickup_location_header, condition, pickup_loc_search_data);
		}
		//2
		waitForElement(driver, cust_Depot_Term_Label);
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
			twoColumnSearchWindow(driver, cust_depot_term_header, condition, cust_dep_search_data);
		}
		//3
		waitForElement(driver, return_location_label);
		if(isElementAccessible(driver, return_location_label)) {
			waitForElement(driver,return_location_label);
			click(driver, return_location_label);
			String return_loc_dd = String.format(DropDown_Select, return_loc_dd_data);
			waitForElement(driver, return_loc_dd);
			click(driver, return_loc_dd);
		}
		if(!return_loc_search_data.equalsIgnoreCase("")) {
			waitForElement(driver, return_location_searchicon);
			click(driver, return_location_searchicon);
			twoColumnSearchWindow(driver, return_location_header, condition, return_loc_search_data);
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
				if(!Return_Date.equals("")) {
				waitForElement(driver, return_Date_Field);
				if (date_Picker.equalsIgnoreCase("Yes")) {
					selectDatePickerWithTime1(driver, return_Date_Field, Return_Date);
				} else {
					waitForElement(driver, return_Date_Field);
					clearAndType(driver, return_Date_Field, Return_Date);
				}
				}
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

		waitForElement(driver, tdn_SaveButton);
		click1(driver, tdn_SaveButton);

		Step_End(25, "click save icon in toolbar.", test, test1);

		Step_Start(26, "system will display Transportation Dispatch Notice saved, click ok. ", test, test1);
		waitForElement(driver, TDN_Popup_Msg);
		String actual_UpdatedPopup=getText(driver, TDN_Popup_Msg);
		if(actual_UpdatedPopup.equals(TDN_Updated_popup)) {
			Extent_pass(driver, "Matched || Expected Pop up : "+TDN_Updated_popup +" || Actual Pop up : "+actual_UpdatedPopup, test, test1);
			System.out.println("Matched || Expected Pop up : "+TDN_Updated_popup +" || Actual Pop up : "+actual_UpdatedPopup);
		}else {
			System.out.println("Not Matched || Expected Pop up : "+TDN_Updated_popup +" || Actual Pop up : "+actual_UpdatedPopup);
			Extent_fail(driver, "Not Matched || Expected Pop up : "+TDN_Updated_popup +" || Actual Pop up : "+actual_UpdatedPopup, test, test1);
		}
		click(driver, ok_Btn_Tdn_Haulage);

		Step_End(26, "system will display Transportation Dispatch Notice saved, click ok. ", test, test1);


		waitForElement(driver, TDN_Num);
		String tdn_number=getAttribute(driver, TDN_Num,"value");
		System.out.println(tdn_number);

		scrollTop(driver);

		Step_Start(27, "Click the TDN confirm button.", test, test1);


		waitForElement(driver, TDN_Confirm_Button);
		click(driver, TDN_Confirm_Button);


		Step_End(27, "Click the TDN confirm button.", test, test1);


		Step_Start(28, "TDN is navigate to TDN Confirmation screen  and select the  single container", test, test1);
		waitForElement(driver, Confirm_Button);
		click(driver, Confirm_Button);
		Step_End(28, "TDN is navigate to TDN Confirmation screen  and select the  single container", test, test1);

		Step_Start(29, "Click the TDN confirmation button in TDN Confirmation screen ", test, test1);
		waitForElement(driver, Confirm_Button_TDN);
		click(driver, Confirm_Button_TDN);
		Step_End(29, "Click the TDN confirmation button in TDN Confirmation screen ", test, test1);

		waitForElement(driver, Ok1);
		click(driver, Ok1);

		Step_Start(30, "Move to TDN screen .", test, test1);

		waitForElement(driver, TDN_Tab);
		click(driver, TDN_Tab);

		Step_End(30, "Move to TDN screen .", test, test1);
		Step_Start(31, "click the Search icon and enter the TDN number.", test, test1);

		click(driver, Search2);
	

		waitForElement(driver, Asearchinput);
		click(driver, Asearchinput);
		sendKeys(driver, Asearchinput, tdn_number);
		waitForElement(driver, Asearchclickbtn);
		click(driver, Asearchclickbtn);
		waitForElement(driver, Vendor_details_SelectButton);
		click(driver, Vendor_details_SelectButton);
		Step_End(31, "click the Search icon and enter the TDN number.", test, test1);

		Step_Start(32, "Edit Icon.", test, test1);
		waitForElement(driver, edit_icon);
		click(driver, edit_icon);
		Step_End(32, "Edit Icon.", test, test1);

		Step_Start(33, "Ensure that System Will display the ( Confirmed TDN Cannot be Edited ) Validation", test, test1);
		waitForElement(driver, TDN_Popup_Editmsg);
		String actual_TDN_SavedPopup2=getText(driver, TDN_Popup_Editmsg);
		if(actual_TDN_SavedPopup2.equals(tdn_Edit_Error_popup)) {
			Extent_pass(driver, "Matched || Expected Pop up : "+tdn_Edit_Error_popup +" || Actual Pop up : "+actual_TDN_SavedPopup2, test, test1);
			System.out.println("Matched || Expected Pop up : "+tdn_Edit_Error_popup +" || Actual Pop up : "+actual_TDN_SavedPopup2);
		}else {
			Extent_fail(driver, "Not Matched || Expected Pop up : "+tdn_Edit_Error_popup +" || Actual Pop up : "+actual_TDN_SavedPopup2, test, test1);
			System.out.println("Not Matched || Expected Pop up : "+tdn_Edit_Error_popup +" || Actual Pop up : "+actual_TDN_SavedPopup2);
		}
		Step_End(33, "Ensure that System Will display the ( Confirmed TDN Cannot be Edited ) Validation", test, test1);
		Extent_completed(testCase_Name, test, test1);

	}

}

