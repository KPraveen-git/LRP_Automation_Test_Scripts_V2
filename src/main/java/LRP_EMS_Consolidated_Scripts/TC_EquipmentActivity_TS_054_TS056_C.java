package LRP_EMS_Consolidated_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EquipmentActivity_TS_054_TS056_C extends Keywords {

	// For every execution, change active value

	public void equipmentActivity54_56(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		int TC1=1;

		if(TC1==1) {
			String testcase_Name="TC_EquipmentActivity_SC54";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			String url = TestNgXml.getdatafromExecution().get(testcase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
			String Username = Excel_data.get("Username");
			String pass_word = Excel_data.get("pass_word");
			String Field_Names3 = Excel_data.get("module");
			String activity_Description = Excel_data.get("DescriptionVal");
			String savePop = Excel_data.get("Save_popup");
			String Activity_Group = Excel_data.get("Activity_Group");
			String Stock_Status = Excel_data.get("Stock_Status");
			String Empty_Full = Excel_data.get("Empty_Full");
			String Soc_Activity = Excel_data.get("Soc_Activity");
			String AllowForce = Excel_data.get("AllowForce");
			String Is_special = Excel_data.get("Is_special");
			String Auto_EIR = Excel_data.get("Auto_EIR");
			String Activity_Type = Excel_data.get("Activity_Type");
			String Stock_Location = Excel_data.get("Stock_Location");
			String EIR_Status = Excel_data.get("EIR_Status");
			String From_Loc = Excel_data.get("From_Loc");
			String To_Loc = Excel_data.get("To_Loc");
			String Link_Chassis = Excel_data.get("Link_Chassis");
			String BookingNoupdate = Excel_data.get("BookingNoupdate");
			String Pool_Chassis_Activity = Excel_data.get("Pool_Chassis_Activity");
			String Transmit_Indicator = Excel_data.get("Transmit_Indicator");
			String Non_Pool_Chassis_Activity = Excel_data.get("Non_Pool_Chassis_Activity");
			String Allow_Interchange = Excel_data.get("Allow_Interchange");
			String Master_Required = Excel_data.get("Master_Required");
			String activeValue = Excel_data.get("activeValue");
			String Exist_Popup = Excel_data.get("Exist_Popup");



			Extent_Start(testcase_Name, test, test1);


			// login
			navigateUrl(driver, url);
			
			LRP_Login(driver, Username, pass_word);
			Extent_Start(testcase_Name, test, test1);
			Extent_call(test, test1, "Enter module name in searchbox & click the module");
			// search module
			moduleNavigate(driver, Field_Names3);
			
			
			Step_Start(1, "Enter Valid Code for Activity code field", test, test1);
			// enter ativity code
			waitForElement(driver, kActivityCodeVal);
			sendKeys(driver, kActivityCodeVal, activeValue);
			System.out.println("Activity Code:"+activeValue);
			Step_End(1, "Enter Valid Code for Activity code field", test, test1);

			Step_Start(2, "Enter Description for Activity Description field", test, test1);

			waitForElement(driver, kActivityDescriptionVal);
			sendKeys(driver, kActivityDescriptionVal, activity_Description);
			enter(driver);
			System.out.println("Activity Description:"+activity_Description);
			Step_End(2, "Enter Description for Activity Description field", test, test1);

			Step_Start(3, " Select dropmenu correctly for Activity group", test, test1);
			// select activity group
			waitForElement(driver, kActivityGroup);
			click(driver, kActivityGroup);
			String Activity_Group_value =  String.format(Activity_Group_Value,  Activity_Group); 
			waitForElement(driver, Activity_Group_value);
			click(driver, Activity_Group_value);
			Step_End(3, " Select dropmenu correctly for Activity group", test, test1);

			Step_Start(4, "Select dropmenu correctly for Stock Status", test, test1);	 

			// select Stock status value
			waitForElement(driver, kStockStatusVal);
			click(driver, kStockStatusVal);
			String Stock_Status_value =  String.format(Stock_Status_Value,  Stock_Status); 
			waitForElement(driver, Stock_Status_value);
			click(driver, Stock_Status_value);
			System.out.println("Stock Status:"+Stock_Status);
			Step_End(4, "Select dropmenu correctly for Stock Status", test, test1);	 

			Step_Start(5, "Select dropmenu correctly for Empty/Full", test, test1);
			// select Empty/Full
			waitForElement(driver, kEmptyFullOpt);
			click(driver, kEmptyFullOpt);
			String Empty_Full_value =  String.format(Empty_Full_Value,  Empty_Full); 

			waitForElement(driver, Empty_Full_value);
			click(driver, Empty_Full_value);
			Step_End(5, "Select dropmenu correctly for Empty/Full", test, test1);

			Step_Start(6, "Select dropmenu correctly for Allow SOC Activity", test, test1);	
			// select Allow SOC Activity
			waitForElement(driver, kAllowSocActivity);
			click(driver, kAllowSocActivity);
			String Soc_activity1 =  String.format(Soc_Activity1,  Soc_Activity); 

			click(driver, Soc_activity1);
			Step_End(6, "Select dropmenu correctly for Allow SOC Activity", test, test1);	

			Step_Start(7, "Select dropmenu correctly for Allow Force", test, test1);
			// select allow force
			waitForElement(driver, kAllowForce);
			click(driver, kAllowForce);
			String AllowForce_value =  String.format(AllowForce_Value,  AllowForce); 

			click(driver, AllowForce_value);
			Step_End(7, "Select dropmenu correctly for Allow Force", test, test1);

			Step_Start(8, "Select dropmenu correctly for Is special", test, test1);
			// select Is special
		
			waitForElement(driver, kIsSpecial);
			click(driver, kIsSpecial);
			
			String Is_special_value =  String.format(Is_special_Value,  Is_special); 

			click(driver, Is_special_value);

			Step_End(8, "Select dropmenu correctly for Is special", test, test1);

			Step_Start(9, "Select dropmenu correctly for Auto EIR", test, test1);
			
			// select Auto Eir
			waitForElement(driver, kAutoEir);
			click(driver, kAutoEir);
			String Auto_EIR_value =  String.format(Auto_EIR_Value,  Auto_EIR); 

			waitForElement(driver, Auto_EIR_value);
			click(driver, Auto_EIR_value);
			Step_End(9, "Select dropmenu correctly for Auto EIR", test, test1);

			Step_Start(10, "Select dropmenu correctly for Activity Type", test, test1);	
			// select Activity type
			
			waitForElement(driver, kActivityType);
			click(driver, kActivityType);
			String Activity_Type_value =  String.format(Activity_Type_Value,  Activity_Type); 

			waitForElement(driver, Activity_Type_value);
			click(driver, Activity_Type_value);
			Step_End(10, "Select dropmenu correctly for Activity Type", test, test1);	

			// select stock location
			
			waitForElement(driver, kStockLocation);
			click(driver, kStockLocation);
			String Stock_Location_value =  String.format(Stock_Location_Value,  Stock_Location); 

			waitForElement(driver, Stock_Location_value);
			click(driver, Stock_Location_value);

			// select Eir status
			
			waitForElement(driver, kEirStatus);
			click(driver, kEirStatus);
			
			String EIR_Status_value =  String.format(EIR_Status_Value,  EIR_Status); 

			waitForElement(driver, EIR_Status_value);
			click(driver, EIR_Status_value);

			// Select from location
			waitForElement(driver, kFromLoc);
			waitForElement(driver, kFromLoc);
			click(driver, kFromLoc);
			String From_Loc_value =  String.format(From_Loc_Value,  From_Loc); 

			waitForElement(driver, From_Loc_value);
			click(driver, From_Loc_value);

			// select to location
			waitForElement(driver, kToLoc);
			click(driver, kToLoc);
			String To_Loc_value =  String.format(To_Loc_Value,  To_Loc); 

			click(driver, To_Loc_value);

			
			// non mandatory fields
			if (!Link_Chassis.equals("")) {
				waitForElement(driver, LinkChasis);
				click(driver, LinkChasis);
				String Link_Chassis_value =  String.format(Link_Chassis_Value,  Link_Chassis); 

				click(driver, Link_Chassis_value);


			} else {

				System.out.println("Link_Chassis_Value " + "Input Not Available in : " + File_Path);
			}

		
			if (!BookingNoupdate.equals("")) {
				waitForElement(driver, BookingNO_Update);
				click(driver, BookingNO_Update);
				String Booking_No_update_value =  String.format(Booking_No_update_Value,  BookingNoupdate); 

				click(driver, Booking_No_update_value);


			} else {

				System.out.println("Booking_No_update_Value " + "Input Not Available in : " + File_Path);
			}
			
			if (!Pool_Chassis_Activity.equals("")) {
				waitForElement(driver, pool_chasis_Activity);
				click(driver, pool_chasis_Activity);
				String Pool_Chassis_Activity_value =  String.format(Pool_Chassis_Activity_Value,  Pool_Chassis_Activity); 

				click(driver, Pool_Chassis_Activity_value);


			} else {

				System.out.println("Pool_Chassis_Activity_Value " + "Input Not Available in : " + File_Path);
			}
			
			if (!Transmit_Indicator.equals("")) {
				waitForElement(driver, TransmitIndicator);
				click(driver, TransmitIndicator);
				
				String Transmit_Indicator_value =  String.format(Transmit_Indicator_Value,  Transmit_Indicator); 

				click(driver, Transmit_Indicator_value);


			} else {

				System.out.println("Transmit_Indicator_Value " + "Input Not Available in : " + File_Path);
			}
			
			if (!Non_Pool_Chassis_Activity.equals("")) {
				waitForElement(driver, Non_Pool_ChassisAct);
				click(driver, Non_Pool_ChassisAct);
				String Non_Pool_Chassis_Activity_value =  String.format(Non_Pool_Chassis_Activity_Value,  Non_Pool_Chassis_Activity); 

				click(driver, Non_Pool_Chassis_Activity_value);

			} else {

				System.out.println("Non_Pool_Chassis_Activity_Value " + "Input Not Available in : " + File_Path);
			}

			
			if (!Allow_Interchange.equals("")) {
				waitForElement(driver, AllowInterchage);
				click(driver, AllowInterchage);
				
				String Allow_Interchange_value =  String.format(Allow_Interchange_Value,  Allow_Interchange); 

				click(driver, Allow_Interchange_value);


			} else {

				System.out.println("Allow_Interchange_Value " + "Input Not Available in : " + File_Path);
			}
			
			if (!Master_Required.equals("")) {
				waitForElement(driver, MasterReq);
				click(driver, MasterReq);
				String Master_Required_value =  String.format(Master_Required_Value,  Master_Required); 

				waitForElement(driver, Master_Required_value);
				click(driver, Master_Required_value);


			} else {

				System.out.println("Master_Required_Value " + "Input Not Available in : " + File_Path);
			}
			// verify the saved popup
			waitForElement(driver, kSaveOption);
			click(driver, kSaveOption);
			waitForElement(driver, Popup);
			String popup1 = getText(driver, Popup);
			if (popup1.equals(savePop)) {
				System.out.println("Equipment Activity Saved Successfully");
				System.out.println("Matched || Expected value was : " + savePop + " || Actual value was : " + popup1);
				Extent_pass(driver, "Matched || Expected value was : " + savePop + " || Actual value was : " + popup1, test,
						test1);
			} else if (popup1.equals(Exist_Popup.trim())) {
				System.out.println("Activity Code already Exist popup has  shown");
				System.out.println("Matched || Expected value was : " + Exist_Popup + " || Actual value was : " + popup1);
				Extent_pass(driver, "Matched || Expected value was : " + Exist_Popup + " || Actual value was : " + popup1,
						test, test1);
			}else {
				System.out.println("Equipment Activity  Saved Successfully popup has not shown");
				System.out.println("NotMatched || Expected value was : " + savePop + " || Actual value was : " + popup1);
				Extent_pass(driver, "NotMatched || Expected value was : " + savePop + " || Actual value was : " + popup1, test,
						test1);
			}

			waitForElement(driver, kActivitySearchOpt);
			click(driver, kActivitySearchOpt);
			waitForElement(driver, Equip_Size_Filter);
			click(driver, Equip_Size_Filter);
			waitForElement(driver, P_Equip_Filter_CheckBox);
			click(driver, P_Equip_Filter_CheckBox);
			sendKeys(driver, P_Equip_Filter_Search, activeValue);
			String active_Value_select =  String.format(Active_Value_Select,  activeValue.toUpperCase()); 
	        waitForElement(driver, active_Value_select);
	        click(driver, active_Value_select);
			waitForElement(driver, Equip_Size_Filter);
			click(driver, Equip_Size_Filter);
			// verify the popup
			waitForElement(driver, Firstgrid);
			String getpopup1 = getText(driver, Firstgrid);
			
			if (getpopup1.equals(activeValue)) {
				System.out
				.println("Matched || Expected value was : " + activeValue + " || Actual value was : " + getpopup1);
				Extent_pass(driver,
						"Matched || Expected value was : " + activeValue + " || Actual value was : " + getpopup1, test,
						test1);
			} else {
				System.out.println(
						"NotMatched || Expected value was : " + activeValue + " || Actual value was : " + getpopup1);
				Extent_fail(driver,
						"NotMatched || Expected value was : " + activeValue + " || Actual value was : " + getpopup1, test,
						test1);
			}
			Extent_completed(testcase_Name, test, test1);
			click(driver, CloseButton_M);
		}
		
		
		int TC2=1;

		if(TC2==1) {
			
			String testcase_Name="TC_EquipmentActivity_SC55";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
			String Field_Names3 = Excel_data.get("module");
			String activity_Description = Excel_data.get("DescriptionVal");
			String Activity_Group = Excel_data.get("Activity_Group");
			String Stock_Status = Excel_data.get("Stock_Status");
			String Empty_Full = Excel_data.get("Empty_Full");
			String Soc_Activity = Excel_data.get("Soc_Activity");
			String AllowForce = Excel_data.get("AllowForce");
			String Is_special = Excel_data.get("Is_special");
			String Auto_EIR = Excel_data.get("Auto_EIR");
			String Activity_Type = Excel_data.get("Activity_Type");
			String Stock_Location = Excel_data.get("Stock_Location");
			String EIR_Status = Excel_data.get("EIR_Status");
			String From_Loc = Excel_data.get("From_Loc");
			String To_Loc = Excel_data.get("To_Loc");
			String Link_Chassis = Excel_data.get("Link_Chassis");
			String BookingNoupdate = Excel_data.get("BookingNoupdate");
			String Pool_Chassis_Activity = Excel_data.get("Pool_Chassis_Activity");
			String Transmit_Indicator = Excel_data.get("Transmit_Indicator");
			String Non_Pool_Chassis_Activity = Excel_data.get("Non_Pool_Chassis_Activity");
			String Allow_Interchange = Excel_data.get("Allow_Interchange");
			String Master_Required = Excel_data.get("Master_Required");
			String DeletePopup = Excel_data.get("DeletePopup");
			String savePopup1 = Excel_data.get("savePopup1");
			String activeValue1 = Excel_data.get("activeValue1");
			String Matser_Module = Excel_data.get("Matser_Module");
			String Reactivation_Popup = Excel_data.get("Reactivation_Popup");


			Extent_Start(testcase_Name, test, test1);
			Extent_call(test, test1, "Enter module name in searchbox & safeclick the module");
			// search module
			moduleNavigate(driver, Field_Names3);
			
			// Enter activity code
			waitForElement(driver, kActivityCodeVal);
			sendKeys(driver, kActivityCodeVal, activeValue1);
			// enter Description value
			waitForElement(driver, kActivityDescriptionVal);
			sendKeys(driver, kActivityDescriptionVal, activity_Description);
			enter(driver);
			// select activity group
			waitForElement(driver, kActivityGroup);
			safeclick(driver, kActivityGroup);
			
			String Activity_Group_value =  String.format(Activity_Group_Value,  Activity_Group); 

				waitForElement(driver, Activity_Group_value);
				safeclick(driver, Activity_Group_value);
			
			// Select Stock status value
			waitForElement(driver, kStockStatusVal);
			safeclick(driver, kStockStatusVal);
			
			String Stock_Status_value =  String.format(Stock_Status_Value,  Stock_Status); 

				safeclick(driver, Stock_Status_value);
			
			// Select Empty/Full
			waitForElement(driver, kEmptyFullOpt);
			safeclick(driver, kEmptyFullOpt);
			String Empty_Full_value =  String.format(Empty_Full_Value,  Empty_Full); 

			
				safeclick(driver, Empty_Full_value);
			
			// select Allow Soc Activity
			waitForElement(driver, kAllowSocActivity);
			safeclick(driver, kAllowSocActivity);
				
			
			String Soc_activity1 =  String.format(Soc_Activity1,  Soc_Activity); 

				safeclick(driver, Soc_activity1);
			
			// Select Allow force
			
			waitForElement(driver, kAllowForce);
			safeclick(driver, kAllowForce);
				
			String AllowForce_value =  String.format(AllowForce_Value,  AllowForce); 

				safeclick(driver, AllowForce_value);
			
			// select Is special
			waitForElement(driver, kIsSpecial);
			safeclick(driver, kIsSpecial);
			
			String Is_special_value =  String.format(Is_special_Value,  Is_special); 

				waitForElement(driver, Is_special_value);;
				safeclick(driver, Is_special_value);
			
			// select Auto EIR
		
			waitForElement(driver, kAutoEir);
			safeclick(driver, kAutoEir);
				
			String Auto_EIR_value =  String.format(Auto_EIR_Value,  Auto_EIR); 

				waitForElement(driver, Auto_EIR_value);
				safeclick(driver, Auto_EIR_value);
			
			// select Activity type
			waitForElement(driver, kActivityType);
			safeclick(driver, kActivityType);
			
			String Activity_Type_value =  String.format(Activity_Type_Value,  Activity_Type); 

				waitForElement(driver, Activity_Type_value);
				safeclick(driver, Activity_Type_value);
			
			// Select stock location
			waitForElement(driver, kStockLocation);
			safeclick(driver, kStockLocation);
				
			String Stock_Location_value =  String.format(Stock_Location_Value,  Stock_Location); 

				waitForElement(driver, Stock_Location_value);
				safeclick(driver, Stock_Location_value);
			
			// select EIR status
			waitForElement(driver, kEirStatus);
			safeclick(driver, kEirStatus);
			
			String EIR_Status_value =  String.format(EIR_Status_Value,  EIR_Status); 

			waitForElement(driver, EIR_Status_value);
				safeclick(driver, EIR_Status_value);
		
			// Select From location
			waitForElement(driver, kFromLoc);
			safeclick(driver, kFromLoc);
			String From_Loc_value =  String.format(From_Loc_Value,  From_Loc); 

				waitForElement(driver, From_Loc_value);
				safeclick(driver, From_Loc_value);
			
			// Select To Location
			waitForElement(driver, kToLoc);
			safeclick(driver, kToLoc);
			String To_Loc_value =  String.format(To_Loc_Value,  To_Loc); 
				waitForElement(driver, To_Loc_value);
				safeclick(driver, To_Loc_value);
			
			// Non-Mandatory fields
			if (!Link_Chassis.equals("")) {
				waitForElement(driver, LinkChasis);
				safeclick(driver, LinkChasis);
				String Link_Chassis_value =  String.format(Link_Chassis_Value,  Link_Chassis); 

				
					safeclick(driver, Link_Chassis_value);
				

			} else {

				System.out.println("Link_Chassis_Value " + "Input Not Available in : " + File_Path);
			}

			if (!BookingNoupdate.equals("")) {
				waitForElement(driver, BookingNO_Update);
				safeclick(driver, BookingNO_Update);
				String Booking_No_update_value =  String.format(Booking_No_update_Value,  BookingNoupdate); 

				
					safeclick(driver, Booking_No_update_value);
				

			} else {

				System.out.println("Booking_No_update_Value " + "Input Not Available in : " + File_Path);
			}
			if (!Pool_Chassis_Activity.equals("")) {
				waitForElement(driver, pool_chasis_Activity);
				safeclick(driver, pool_chasis_Activity);
				
				String Pool_Chassis_Activity_value =  String.format(Pool_Chassis_Activity_Value,  Pool_Chassis_Activity); 

				
					safeclick(driver, Pool_Chassis_Activity_value);
				

			} else {

				System.out.println("Pool_Chassis_Activity_Value " + "Input Not Available in : " + File_Path);
			}
			if (!Transmit_Indicator.equals("")) {
				waitForElement(driver, TransmitIndicator);
				safeclick(driver, TransmitIndicator);
				String Transmit_Indicator_value =  String.format(Transmit_Indicator_Value,  Transmit_Indicator); 

				
					safeclick(driver, Transmit_Indicator_value);
				
			} else {

				System.out.println("Transmit_Indicator_Value " + "Input Not Available in : " + File_Path);
			}
			if (!Non_Pool_Chassis_Activity.equals("")) {
				waitForElement(driver, Non_Pool_ChassisAct);
				safeclick(driver, Non_Pool_ChassisAct);
				String Non_Pool_Chassis_Activity_value =  String.format(Non_Pool_Chassis_Activity_Value,  Non_Pool_Chassis_Activity); 
		
					safeclick(driver, Non_Pool_Chassis_Activity_value);
				

			} else {

				System.out.println("Non_Pool_Chassis_Activity_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Allow_Interchange.equals("")) {
				waitForElement(driver, AllowInterchage);
				safeclick(driver, AllowInterchage);
				String Allow_Interchange_value =  String.format(Allow_Interchange_Value,  Allow_Interchange); 	
				safeclick(driver, Allow_Interchange_value);
				

			} else {

				System.out.println("Allow_Interchange_Value " + "Input Not Available in : " + File_Path);
			}
			
			if (!Master_Required.equals("")) {
				waitForElement(driver, MasterReq);
				safeclick(driver, MasterReq);
				String Master_Required_value =  String.format(Master_Required_Value,  Master_Required); 
					safeclick(driver, Master_Required_value);
				

			} else {

				System.out.println("Master_Required_Value " + "Input Not Available in : " + File_Path);
			}
			// click save button
			waitForElement(driver, kSaveOption);
			safeclick(driver, kSaveOption);
			
			waitForElement(driver, kSavePopup);
			String getpopup1 = getText(driver, kSavePopup);
			if (getpopup1.equals(savePopup1)) {

				System.out.println("Matched || Expected value was : " + savePopup1 + " || Actual value was : " + getpopup1);
				Extent_pass(driver, "Matched || Expected value was : " + savePopup1 + " || Actual value was : " + getpopup1,
						test, test1);
			} else {
				System.out.println(
						"NotMatched || Expected value was : " + savePopup1 + " || Actual value was : " + getpopup1);
				Extent_fail(driver,
						"NotMatched || Expected value was : " + savePopup1 + " || Actual value was : " + getpopup1, test,
						test1);
			}
			// safeclick the first grid and delete
			waitForElement(driver, kActivitySearchOpt);
			click(driver, kActivitySearchOpt);
			waitForElement(driver, Equip_Size_Filter);
			click(driver, Equip_Size_Filter);
			waitForElement(driver, P_Equip_Filter_CheckBox);
			click(driver, P_Equip_Filter_CheckBox);
			sendKeys(driver, P_Equip_Filter_Search, activeValue1);
			
			String active_Value_Select =  String.format(Active_Value_Select,  activeValue1); 
			waitForElement(driver, active_Value_Select);
	        click(driver, active_Value_Select);
			String Activity_Code =  String.format(Activity_code,  activeValue1); 

			doubleClick(driver, Activity_Code);
			Step_Start(2, "click delete icon from toolbar", test, test1);
			waitForElement(driver, kDeleteOpti);
			safeclick(driver, kDeleteOpti);
			Step_End(2, "click delete icon from toolbar", test, test1);

			Step_Start(3, " click 'Yes' while confirming for Do you want to delete", test, test1);
			waitForElement(driver, kDeleteYes);
			safeclick(driver, kDeleteYes);
			
			Step_End(3,  "click 'Yes' while confirming for Do you want to delete", test, test1);

			Step_Start(4, " Message will be shown as deleted", test, test1);
			waitForElement(driver, Popup);
			String getpopup = getText(driver, Popup);
			if (getpopup.equals(DeletePopup)) {
				System.out.println("Matched || Expected value was : " + DeletePopup + " || Actual value was : " + getpopup);
				Extent_pass(driver, "Matched || Expected value was : " + DeletePopup + " || Actual value was : " + getpopup,
						test, test1);
			} else {
				System.out.println(
						"NotMatched || Expected value was : " + DeletePopup + " || Actual value was : " + getpopup);
				Extent_fail(driver,
						"NotMatched || Expected value was : " + DeletePopup + " || Actual value was : " + getpopup, test,
						test1);
			}
			Step_End(4, " Message will be shown as deleted", test, test1);
			waitForElement(driver, close_tab);
			click(driver, close_tab);
			
			
			Step_Start(5, "Open Master Reactivation screen", test, test1);
			moduleNavigate(driver, Matser_Module);
			
			
			Step_End(5, "Open Master Reactivation screen", test, test1);
			Step_Start(6, "Click on new button & press 'Yes' option", test, test1);
			waitForDisplay(driver, Master_Reactivation_New_Button);
			if(isElementEnabled(driver, Master_Reactivation_New_Button)) {
			click(driver, Master_Reactivation_New_Button);
			}
			
			waitForElement(driver, ID_Popup_Msg);
			waitForElement(driver, ID_Popup_Yes_Button);
			click(driver, ID_Popup_Yes_Button);
			Step_End(6, "Click on new button & press 'Yes' option", test, test1);
			
			
			Step_Start(7, "Click on module name icon", test, test1);
			waitForElement(driver, module_Nume_search_button_MR);
			click(driver, module_Nume_search_button_MR);
			Step_End(7, "Click on module name icon", test, test1);
			
			Step_Start(8, "Select Equipment Activity in module name", test, test1);
			waitForElement(driver, module_Name_Filter_MR);
			sendKeys(driver, module_Name_Filter_MR, Field_Names3);
			
			waitForElement(driver, select_Btn);
			click(driver, select_Btn);
			Step_End(8, "Select Equipment Activity in module name", test, test1);
			
			Step_Start(9, "Click show button", test, test1);
			waitForElement(driver, show_Button_MR);
			click(driver, show_Button_MR);
			Step_End(9, "Click show button", test, test1);
			
			Step_Start(10, "Select the deleted size/type", test, test1);
			waitForElement(driver, activity_Code_TF_MR);
			sendKeys(driver, activity_Code_TF_MR, activeValue1);
			waitForElement(driver, activity_Code_Select_MR);
			click(driver, activity_Code_Select_MR);
			Step_End(10, "Select the deleted size/type", test, test1);
			
			Step_Start(11, "Click on reactivate button", test, test1);
			waitForElement(driver, reactive_Button_MR);
			click(driver, reactive_Button_MR);
			
			Step_End(11, "Click on reactivate button", test, test1);
			
			Step_Start(12, "System will show message as  Equipment Master Reactivated successfully & then click Ok", test, test1);
			waitForElement(driver, ID_Popup_Msg);
			String  reactivationpopup = getText(driver, ID_Popup_Msg);
			if (Reactivation_Popup.equals(reactivationpopup)) {

				System.out.println("Matched || Expected value was : " + Reactivation_Popup + " || Actual value was : " + reactivationpopup);
				Extent_pass(driver, "Matched || Expected value was : " + Reactivation_Popup + " || Actual value was : " + reactivationpopup,
						test, test1);
				click(driver, ID_Popup_Ok_Button);
			} else {
				System.out.println(
						"NotMatched || Expected value was : " + Reactivation_Popup + " || Actual value was : " + reactivationpopup);
				Extent_fail(driver,
						"NotMatched || Expected value was : " + Reactivation_Popup + " || Actual value was : " + reactivationpopup, test,
						test1);
			}
			
			Step_End(12, "System will show message as  Equipment Master Reactivated successfully & then click Ok", test, test1);
			
			waitForElement(driver, close_tab);
			click(driver, close_tab);
			
			Step_Start(13, "Open Equipment activity screen & then verify that reactivated size/type showing in screen in Activity code filter option", test, test1);
			moduleNavigate(driver, Field_Names3);
			waitForElement(driver, kActivitySearchOpt);
			click(driver, kActivitySearchOpt);
			waitForElement(driver, Equip_Size_Filter);
			click(driver, Equip_Size_Filter);
			waitForElement(driver, P_Equip_Filter_CheckBox);
			click(driver, P_Equip_Filter_CheckBox);
			sendKeys(driver, P_Equip_Filter_Search, activeValue1);
			String active_Value_Select1 =  String.format(Active_Value_Select,  activeValue1.toUpperCase()); 
	        waitForElement(driver, active_Value_Select1);
	        click(driver, active_Value_Select1);
			waitForElement(driver, Equip_Size_Filter);
			click(driver, Equip_Size_Filter);
			// verify the popup
			waitForElement(driver, Firstgrid);
			String activity_Code = getText(driver, Firstgrid);
			
			if (activity_Code.equals(activeValue1)) {
				System.out
				.println("Matched || Expected value was : " + activeValue1 + " || Actual value was : " + activity_Code);
				System.out.println("reactivated size/type showing in screen in Activity code filter option");
				Extent_pass(driver,
						"Matched || Expected value was : " + activeValue1 + " || Actual value was : " + activity_Code, test,
						test1);
			} else {
				System.out.println(
						"NotMatched || Expected value was : " + activeValue1 + " || Actual value was : " + activity_Code);
				Extent_fail(driver,
						"NotMatched || Expected value was : " + activeValue1 + " || Actual value was : " + activity_Code, test,
						test1);
			}
			
			
			Step_End(13, "Open Equipment activity screen & then verify that reactivated size/type showing in screen in Activity code filter option", test, test1);
			
			
			
			
			Extent_completed(testcase_Name, test, test1);
		click(driver, CloseButton_M);
		}
		
		int TC3=1;

		if(TC3==1) {
			
			String testcase_Name="TC_EquipmentActivity_SC56";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
			
			String Field_Names3 = Excel_data.get("module");
			String activity_Description = Excel_data.get("DescriptionVal");
			String Activity_Group = Excel_data.get("Activity_Group");
			String Stock_Status = Excel_data.get("Stock_Status");
			String Empty_Full = Excel_data.get("Empty_Full");
			String Soc_Activity = Excel_data.get("Soc_Activity");
			String AllowForce = Excel_data.get("AllowForce");
			String Is_special = Excel_data.get("Is_special");
			String Auto_EIR = Excel_data.get("Auto_EIR");
			String Activity_Type = Excel_data.get("Activity_Type");
			String Stock_Location = Excel_data.get("Stock_Location");
			String EIR_Status = Excel_data.get("EIR_Status");
			String From_Loc = Excel_data.get("From_Loc");
			String To_Loc = Excel_data.get("To_Loc");
			String Link_Chassis = Excel_data.get("Link_Chassis");
			String BookingNoupdate = Excel_data.get("BookingNoupdate");
			String Pool_Chassis_Activity = Excel_data.get("Pool_Chassis_Activity");
			String Transmit_Indicator = Excel_data.get("Transmit_Indicator");
			String Non_Pool_Chassis_Activity = Excel_data.get("Non_Pool_Chassis_Activity");
			String Allow_Interchange = Excel_data.get("Allow_Interchange");
			String Master_Required = Excel_data.get("Master_Required");
			String updatedPopup = Excel_data.get("updatedPopup");
			String To_Update = Excel_data.get("To_Update");

			Extent_Start(testcase_Name, test, test1);
			Extent_call(test, test1, "Enter module name in searchbox & safeclick the module");
			
			moduleNavigate(driver, Field_Names3);
			// select first grid and click edit button
			Step_Start(1, "Double click the data grid", test, test1);
			waitForElement(driver, ToolPanel1);
			safeclick(driver, ToolPanel1);
			waitForElement(driver, Confitionfilter1);
			safeclick(driver, Confitionfilter1);
			waitForElement(driver, Activity_Code_TF);
			sendKeys(driver, Activity_Code_TF, To_Update);
			String Activity_Code =  String.format(Activity_code,  To_Update); 
			doubleClick(driver, Activity_Code);
			
			Step_End(1, "Double click the data grid", test, test1);
			Step_Start(2, "click Edit button & Change stock status from dropmenu", test, test1);
			waitForElement(driver, kEditOption);
			safeclick(driver, kEditOption);

			// Non- mandatory fields
			if (!activity_Description.equals("")) {
				waitForElement(driver, kActivityDescriptionVal);
				sendKeys(driver, kActivityDescriptionVal, activity_Description);
				enter(driver);
			} else {

				System.out.println("activity_Description " + "Input Not Available in : " + File_Path);
			}

			if (!Activity_Group.equals("")) {
				waitForElement(driver, kActivityGroup);
				safeclick(driver, kActivityGroup);
				String Activity_Group_value =  String.format(Activity_Group_Value,  Activity_Group); 

				safeclick(driver, Activity_Group_value);

			} else {

				System.out.println("Activity_Group " + "Input Not Available in : " + File_Path);
			}
			if (!Empty_Full.equals("")) {
				waitForElement(driver, kEmptyFullOpt);
				safeclick(driver, kEmptyFullOpt);
				String Empty_Full_value =  String.format(Empty_Full_Value,  Empty_Full); 
				safeclick(driver, Empty_Full_value);

			} else {

				System.out.println("Empty_Full " + "Input Not Available in : " + File_Path);
			}

			if (!Soc_Activity.equals("")) {
				waitForElement(driver, kAllowSocActivity);
				safeclick(driver, kAllowSocActivity);
				String Soc_activity1 =  String.format(Soc_Activity1,  Soc_Activity); 

				
				safeclick(driver, Soc_activity1);

			} else {

				System.out.println("Soc_Activity " + "Input Not Available in : " + File_Path);
			}
			if (!AllowForce.equals("")) {
				waitForElement(driver, kAllowForce);
				safeclick(driver, kAllowForce);
				String AllowForce_value =  String.format(AllowForce_Value,  AllowForce); 

				safeclick(driver, AllowForce_value);

			} else {

				System.out.println("AllowForce " + "Input Not Available in : " + File_Path);
			}
			if (!Is_special.equals("")) {
				waitForElement(driver, kIsSpecial);
				safeclick(driver, kIsSpecial);
				String Is_special_value =  String.format(Is_special_Value,  Is_special); 

				
				safeclick(driver, Is_special_value);

			} else {

				System.out.println("Is_special " + "Input Not Available in : " + File_Path);
			}
			if (!Auto_EIR.equals("")) {

				waitForElement(driver, kAutoEir);
				safeclick(driver, kAutoEir);
				String Auto_EIR_value =  String.format(Auto_EIR_Value,  Auto_EIR); 

				safeclick(driver, Auto_EIR_value);

			} else {

				System.out.println("Auto_EIR " + "Input Not Available in : " + File_Path);
			}
			if (!Activity_Type.equals("")) {

				waitForElement(driver, kActivityType);
				safeclick(driver, kActivityType);
				
				String Activity_Type_value =  String.format(Activity_Type_Value,  Activity_Type); 

			waitForElement(driver, Activity_Type_value);
				safeclick(driver, Activity_Type_value);

			} else {

				System.out.println("Activity_Type " + "Input Not Available in : " + File_Path);
			}
			if (!Stock_Location.equals("")) {
				waitForElement(driver, kStockLocation);
				safeclick(driver, kStockLocation);
			
				String Stock_Location_value =  String.format(Stock_Location_Value,  Stock_Location); 

				waitForElement(driver, Stock_Location_value);
				safeclick(driver, Stock_Location_value);

			} else {

				System.out.println("Stock_Location " + "Input Not Available in : " + File_Path);
			}
			if (!EIR_Status.equals("")) {
				waitForElement(driver, kEirStatus);
				safeclick(driver, kEirStatus);
				
				String EIR_Status_value =  String.format(EIR_Status_Value,  EIR_Status); 

				waitForElement(driver, EIR_Status_value);
				safeclick(driver, EIR_Status_value);

			} else {

				System.out.println("EIR_Status " + "Input Not Available in : " + File_Path);
			}
			if (!From_Loc.equals("")) {
				waitForElement(driver, kFromLoc);
				safeclick(driver, kFromLoc);

				String From_Loc_value =  String.format(From_Loc_Value,  From_Loc); 

				waitForElement(driver, From_Loc_value);
				safeclick(driver, From_Loc_value);

			} else {

				System.out.println("From_Loc " + "Input Not Available in : " + File_Path);
			}
			if (!To_Loc.equals("")) {
				waitForElement(driver, kToLoc);
				safeclick(driver, kToLoc);
				
				String To_Loc_value =  String.format(To_Loc_Value,  To_Loc); 

				waitForElement(driver, To_Loc_value);
				safeclick(driver, To_Loc_value);

			} else {

				System.out.println("To_Loc " + "Input Not Available in : " + File_Path);
			}
			if (!Link_Chassis.equals("")) {
				waitForElement(driver, LinkChasis);
				safeclick(driver, LinkChasis);
			
				String Link_Chassis_value =  String.format(Link_Chassis_Value,  Link_Chassis); 

			   waitForElement(driver, Link_Chassis_value);
				safeclick(driver, Link_Chassis_value);


			} else {

				System.out.println("Link_Chassis_Value " + "Input Not Available in : " + File_Path);
			}
			if (!BookingNoupdate.equals("")) {
				waitForElement(driver, BookingNO_Update);
				safeclick(driver, BookingNO_Update);
				
				String Booking_No_update_value =  String.format(Booking_No_update_Value,  BookingNoupdate); 

				waitForElement(driver, Booking_No_update_value);
				safeclick(driver, Booking_No_update_value);


			} else {

				System.out.println("Booking_No_update_Value " + "Input Not Available in : " + File_Path);
			}
			if (!Pool_Chassis_Activity.equals("")) {
				waitForElement(driver, pool_chasis_Activity);
				safeclick(driver, pool_chasis_Activity);
				
				String Pool_Chassis_Activity_value =  String.format(Pool_Chassis_Activity_Value,  Pool_Chassis_Activity); 

				waitForElement(driver, Pool_Chassis_Activity_value);
				safeclick(driver, Pool_Chassis_Activity_value);


			} else {

				System.out.println("Pool_Chassis_Activity_Value " + "Input Not Available in : " + File_Path);
			}
			if (!Transmit_Indicator.equals("")) {
				waitForElement(driver, TransmitIndicator);
				safeclick(driver, TransmitIndicator);
				String Transmit_Indicator_value =  String.format(Transmit_Indicator_Value,  Transmit_Indicator); 

				waitForElement(driver, Transmit_Indicator_value);
				safeclick(driver, Transmit_Indicator_value);


			} else {

				System.out.println("Transmit_Indicator_Value " + "Input Not Available in : " + File_Path);
			}
			if (!Non_Pool_Chassis_Activity.equals("")) {
				waitForElement(driver, Non_Pool_ChassisAct);
				safeclick(driver, Non_Pool_ChassisAct);
				
				String Non_Pool_Chassis_Activity_value =  String.format(Non_Pool_Chassis_Activity_Value,  Non_Pool_Chassis_Activity); 

				waitForElement(driver, Non_Pool_Chassis_Activity_value);
				safeclick(driver, Non_Pool_Chassis_Activity_value);


			} else {

				System.out.println("Non_Pool_Chassis_Activity_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Allow_Interchange.equals("")) {
				waitForElement(driver, AllowInterchage);
				safeclick(driver, AllowInterchage);
				String Allow_Interchange_value =  String.format(Allow_Interchange_Value,  Allow_Interchange); 	

				waitForElement(driver, Allow_Interchange_value);
				safeclick(driver, Allow_Interchange_value);


			} else {

				System.out.println("Allow_Interchange_Value " + "Input Not Available in : " + File_Path);
			}
			if (!Master_Required.equals("")) {
				waitForElement(driver, MasterReq);
				safeclick(driver, MasterReq);
				
				String Master_Required_value =  String.format(Master_Required_Value,  Master_Required); 

				
			waitForElement(driver, Master_Required_value);
				safeclick(driver, Master_Required_value);


			} else {

				System.out.println("Master_Required_Value " + "Input Not Available in : " + File_Path);
			}

			waitForElement(driver, kStockStatusVal);
			safeclick(driver, kStockStatusVal);
			
			String Stock_Status_value =  String.format(Stock_Status_Value,  Stock_Status); 

			waitForElement(driver, Stock_Status_value);
			safeclick(driver, Stock_Status_value);
			Step_End(2, "click Edit button & Change stock status from dropmenu", test, test1);
			// verify the updated popup
			Step_Start(3, "click Save button", test, test1);
			waitForElement(driver, kSaveOption);
			safeclick(driver, kSaveOption);
		
			waitForElement(driver, kEqupmentActivityUpdated);
			String getpopup = getText(driver, kEqupmentActivityUpdated);
			if (getpopup.equals(updatedPopup)) {
				System.out
				.println("Matched || Expected value was : " + updatedPopup + " || Actual value was : " + getpopup);
				Extent_pass(driver,
						"Matched || Expected value was : " + updatedPopup + " || Actual value was : " + getpopup, test,
						test1);
			} else {
				System.out.println(
						"NotMatched || Expected value was : " + updatedPopup + " || Actual value was : " + getpopup);
				Extent_fail(driver,
						"NotMatched || Expected value was : " + updatedPopup + " || Actual value was : " + getpopup, test,
						test1);
			}
			Step_End(3, "click Save button", test, test1);
			Extent_completed(testcase_Name, test, test1);
		}
	}
}
