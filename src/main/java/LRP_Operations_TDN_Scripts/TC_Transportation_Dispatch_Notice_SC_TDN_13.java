package LRP_Operations_TDN_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Tdn_Locators;

public class TC_Transportation_Dispatch_Notice_SC_TDN_13 extends Keywords{

	public void Transportation_Dispatch_Notice_SC_TDN_13(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		
		
		String tc_Name="TC_Transportation_Dispatch_Notice_SC_TDN_13";

		String File_Path_SC13 = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC13 = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> TDN_SC_13 = Utils.GetAllData(Sheet_Name_SC13,tc_Name, "Dataset"+selected_dataset, File_Path_SC13);
		
		
		String username=TDN_SC_13.get("Username");
		String password=TDN_SC_13.get("Password");
		String moduleTDN=TDN_SC_13.get("ModuleTDN");
		String agencyUser = TDN_SC_13.get("AgencyUser");
		String Booking_Number =TDN_SC_13.get("Booking_Number");
		String Shipment_Type =TDN_SC_13.get("Shipment_Type");
		String Booking_Number_perform =TDN_SC_13.get("Booking_Number_perform");
		String Modeof_Transport =TDN_SC_13.get("Modeof_Transport");
		String Vender_Code =TDN_SC_13.get("Vender_Code");
		String Transportation_saved =TDN_SC_13.get("Transportation_saved");
		String Load_Status =TDN_SC_13.get("Load_Status");
		String Dropdown_Condition =TDN_SC_13.get("Dropdown_Condition");
		String Global_search_Wo_No =TDN_SC_13.get("Global_search_Wo_No");
		String Global_search_Vendor_Code_Option1 =TDN_SC_13.get("Global_search_Vendor_Code_Option1");

		String pickup_loc_dd_data =TDN_SC_13.get("pickup_loc_dd_data");
		String pickup_loc_search_data =TDN_SC_13.get("pickup_loc_search_data");
		String condition =TDN_SC_13.get("condition");
		String cust_depot_term_data =TDN_SC_13.get("cust_depot_term_data");
		String cust_dep_search_data =TDN_SC_13.get("cust_dep_search_data");
		String return_loc_dd_data =TDN_SC_13.get("return_loc_dd_data");
		String return_loc_search_data =TDN_SC_13.get("return_loc_search_data");
		String leg_pickupdate =TDN_SC_13.get("leg_pickupdate");
		String leg_return_date =TDN_SC_13.get("leg_return_date");
		String with_chasis_flag =TDN_SC_13.get("with_chasis_flag");
		String chasis_pickup_dd_data =TDN_SC_13.get("chasis_pickup_dd_data");
		String chasis_drop_dd_data =TDN_SC_13.get("chasis_drop_dd_data");
		String cust_depot_term_header =TDN_SC_13.get("cust_depot_term_header");
		String return_location_header =TDN_SC_13.get("return_location_header");
		String pickup_location_header =TDN_SC_13.get("pickup_location_header");
		String chasis_pickup_header =TDN_SC_13.get("chasis_pickup_header");
		String chasis_drop_header =TDN_SC_13.get("chasis_drop_header");
		String chasis_pickup_Search_data =TDN_SC_13.get("chasis_pickup_Search_data");
		String chasis_drop_Search_data =TDN_SC_13.get("chasis_drop_Search_data");
		String Chassis_Mode =TDN_SC_13.get("Chassis_Mode");
		String Search_Type2 =TDN_SC_13.get("Search_Type2");
		String Search_Input2 =TDN_SC_13.get("Search_Input2");
		String Search_Type3 =TDN_SC_13.get("Search_Type3");
		String Search_Input3 =TDN_SC_13.get("Search_Input3");
		
		
		String Load_status_value=String.format(Tdn_Locators.Load_status_value, Load_Status);
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
		Step_Start(1, "select the Empty repo in shipment drop down.", test, test1);

		
		waitForElement(driver, shipment_Dropdown);
		click(driver, shipment_Dropdown);
		safeclick(driver, shipmenttype_select);
		
		Step_End(1, "select the Empty repo in shipment drop down.", test, test1);

		
		if (Booking_Number_perform.equalsIgnoreCase("YES")) {

			List<String> datas = splitAndExpand(Booking_Number);
			for (String data1 : datas) {
				Step_Start(2, "Click the plus icon ", test, test1);

				waitForElement(driver, BL_Add);
				safeclick(driver, BL_Add);
				Step_End(2, "Click the plus icon ", test, test1);

				Step_Start(3, "Enter the Work order number and click the search icon.", test, test1);
				globalValueSearchWindow(driver, Dropdown_Condition, Global_search_Wo_No, data1, Search_Type2, Search_Input2, Search_Type3, Search_Input3);
				Step_End(3, "Enter the Work order number and click the search icon.", test, test1);

			}
		} else {
			System.out.println("Booking number was not added");
		}
		
		waitForDisplay(driver, yesbtn);
		if (isdisplayed(driver, yesbtn)) {
			click(driver,yesbtn);
			
		}
		
		Step_Start(4, "Select the Container.", test, test1);

		waitForElement(driver, addleg_select);
		click(driver, addleg_select);
		
		Step_End(4, "Select the Container.", test, test1);

		Step_Start(5, "Click the Add Leg button.", test, test1);

		waitForElement(driver, add_legbtn);
		click(driver, add_legbtn);
		
		Step_End(5, "Click the Add Leg button.", test, test1);
		
		Step_Start(6, "Select the Truck in Mode of Transport Dropdown.", test, test1);
		
		waitForElement(driver, modeof_transport);
		click(driver, modeof_transport);
		String Select_ModeOfTransport=String.format(Tdn_Locators.Select_ModeOfTransport, Modeof_Transport);
		safeclick(driver, Select_ModeOfTransport);
		
		//pickuplocation
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
			twoColumnSearchWindow(driver, pickup_location_header, condition, pickup_loc_search_data);

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
			twoColumnSearchWindow(driver, cust_depot_term_header, condition, cust_dep_search_data);

			
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
			twoColumnSearchWindow(driver, return_location_header, condition, return_loc_search_data);

		}
		}
		
		
		Step_End(6, "Select the Truck in Mode of Transport Dropdown.", test, test1);

		Step_Start(7, " Select the Vendor code and click the Search icon.", test, test1);

		 waitForElement(driver, vendor_searchicon);
		    click(driver, vendor_searchicon);
		    
		    globalValueSearchWindow(driver, Dropdown_Condition, Global_search_Vendor_Code_Option1, Vender_Code, Search_Type2, Search_Input2, Search_Type3, Search_Input3);

		    
			Step_End(7, " Select the Vendor code and click the Search icon.", test, test1);

			Step_Start(8, "Change the Return Date for booking haulage operation respective date.", test, test1);
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
			
			
			Step_End(8, "Change the Return Date for booking haulage operation respective date.", test, test1);

			Step_Start(9, "select the Empty in load status Drop-down.", test, test1);
			
             click1(driver, load_status);
			
			click(driver,Load_status_value);
			
			Step_End(9, "select the Empty in load status Drop-down.", test, test1);

			Step_Start(10, " Click the Add button and click the Exit icon.", test, test1);

		   waitForElement(driver, vendor_Code_addbtn);
		    click(driver,vendor_Code_addbtn);
		    
		    waitForDisplay(driver, tdnPopup_Ok);
		    if(isdisplayed(driver, tdnPopup_Ok)) {
		    waitForElement(driver, tdnPopup_Ok);
		    click(driver, tdnPopup_Ok);
		    }
		    
		    waitForDisplay(driver, vendor_Code_closebtn);
		    if(isdisplayed(driver, vendor_Code_closebtn)) {
		    waitForElement(driver, vendor_Code_closebtn);
		    click(driver, vendor_Code_closebtn);
		    }
			Step_Start(10, " Click the Add button and click the Exit icon.", test, test1);

			Step_Start(11, " Click the Save button.", test, test1);
			
		    waitForElement(driver, tdn_SaveButton);
		    click1(driver, tdn_SaveButton);
		    
			Step_End(11, " Click the Save button.", test, test1);
			waitForElement(driver, Transportation_dispatch_saved1);

		    String Transportation_dispatch_savedpopup = getText(driver, Transportation_dispatch_saved1);
			System.out.println(Transportation_dispatch_savedpopup);
			
			if(Transportation_saved.contains(Transportation_dispatch_savedpopup)) {                                                                                                                  
				System.out.println("Matched || " + " Expected saved popup ->" + Transportation_saved + " || Actual saved popup is : " + Transportation_dispatch_savedpopup);   
				Extent_pass(driver, "Matched || " + " Expected saved popup -> " + Transportation_saved + " || Actual saved popup is : " + Transportation_dispatch_savedpopup, test, test1);
			}                                                                                                                                                                        
			else {                                                                                                                                                                   
				System.out.println("Not Matched || " + " Expected saved popup ->" + Transportation_saved + " || Actual Report Activity is : " + Transportation_dispatch_savedpopup);        
				Extent_fail(driver, "Not Matched || " + " Expected saved popup ->" + Transportation_saved + " || Actual Report Activity is : " + Transportation_dispatch_savedpopup, test,test1); 
			} 
			
			click(driver, tdnPopup_Ok);
			
			Extent_completed(tc_Name, test, test1);

		}

		    
	}


