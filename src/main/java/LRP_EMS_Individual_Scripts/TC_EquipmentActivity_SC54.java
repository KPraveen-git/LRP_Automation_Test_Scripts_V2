package LRP_EMS_Individual_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EquipmentActivity_SC54 extends Keywords {

	public void equipmentActivity54(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
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
	}
}
