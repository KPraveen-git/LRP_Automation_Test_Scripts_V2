package LRP_EMS_Individual_Scripts;

import java.util.Map;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EquipmentActivity_SC56 extends Keywords {

	public void equipmentActivity56(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		String testcase_Name="TC_EquipmentActivity_SC56";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		
		String Username = Excel_data.get("Username");
		String pass_word = Excel_data.get("pass_word");
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

		// login
		navigateUrl(driver, url);
		LRP_Login(driver, Username, pass_word);

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
