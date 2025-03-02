package LRP_Operations_TDN_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Transportation_Dispatch_Notice_SC_TDN_09 extends Keywords {
 
	public void Transportation_Dispatch_Notice_SC_TDN_09(WebDriver driver,ExtentTest test,ExtentTest test1,String selected_dataset) {
		
		String testCaseName="TC_Transportation_Dispatch_Notice_SC_TDN_09";

//		Get data from test data
		
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name_SC, testCaseName,"Dataset" + selected_dataset, File_Path_SC);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);

		
		String username=Data.get("Username");
		String password=Data.get("Password");
		String moduleTDN=Data.get("ModuleTDN");
		String agencyUser = Data.get("AgencyUser");
		String Booking_Number =Data.get("Booking_Number");
		String Provisional_perform =Data.get("Provisional_perform");
		String Draft_perform =Data.get("Draft_perform");
		String Confirmed_perform =Data.get("Confirmed_perform");
		String Cancelled_perform =Data.get("Cancelled_perform");
		String Shipment_Type =Data.get("Shipment_Type");
		String field_select =Data.get("field_select");
		String Ware_House_number =Data.get("Ware_House_number");
		String App_Date =Data.get("App_Date");
		String date_Picker =Data.get("date_Picker");
		String dropdown_Condition =Data.get("Dropdown_Condition");
		String merchantPopup =Data.get("MerchantPopup");
		String ware_House_Type_Select =Data.get("Ware_House_Type_Select");
		String PLD_Input =Data.get("PLD_Input");
		String PLD_Search =Data.get("PLD_Search");
		String PLA_Input =Data.get("PLA_Input");
		String PLA_Search =Data.get("PLA_Search");
		String Address1_Search =Data.get("Address1_Search");
		String Address1_Input =Data.get("Address1_Input");
		String Address2_Search =Data.get("Address2_Search");
		String Address2_Input =Data.get("Address2_Input");


		
	navigateUrl(driver,URL);
	
	Extent_Start(testCaseName, test, test1);
//	Login
		
	LRP_Login(driver, username, password);

	
	Extent_call(test, test1,"**Switch the Profile Start**");

	SwitchProfile(driver, agencyUser);
	

	Extent_cal(test, test1, moduleTDN);	
		
	moduleNavigate(driver, moduleTDN);
	
	Step_Start(1, "Select the Export option", test, test1);

	waitForElement(driver, shipment_Dropdown);
	click(driver, shipment_Dropdown);
	String select_Shipment=String.format(shipment_Type, Shipment_Type);
	safeclick(driver, select_Shipment);
	
	Step_End(1, "Select the Export option", test, test1);
	Step_Start(2, "Select the Provisional Check Box.", test, test1);

	waitForElement(driver, Provisional_check_box);
	checkBox(driver, Provisional_check_box, Provisional_perform);
	waitForElement(driver, Provisional_check_box);
	checkBox(driver, Draft_check_box, Draft_perform);
	checkBox(driver, Confirmed_check_box, Confirmed_perform);
	checkBox(driver, Cancelled_check_box, Cancelled_perform);
	
	Step_End(2, "Select the Provisional Check Box.", test, test1);
	Step_Start(3, "Click the Plus icon button.", test, test1);

		List<String> datas = splitAndExpand(Booking_Number);
		for (String data1 : datas) {
			waitForElement(driver, BL_Add);
			safeclick(driver, BL_Add);
			
			Step_End(3, "Click the Plus icon button.", test, test1);
			Step_Start(4, "Enter the Book Number.", test, test1);	

			Step_Start(5, "Click the search icon.", test, test1);
			
			Step_Start(6, "Select the booking and click the search icon.", test, test1);


			globalValueSearchWindow(driver, dropdown_Condition, field_select, data1, PLA_Search, PLA_Input, PLD_Search, PLD_Input);

			Step_End(4, "Enter the Book Number", test, test1);

			
			
			Step_End(5, "Click the search icon.", test, test1);

			
			Step_End(6, "Select the booking and click the search icon.", test, test1);

		}
	
	Step_Start(7, "Select the Yes button in TDN ( Haulage ) Message box.", test, test1);
	
	waitForDisplay(driver, TDN_Popup_Msg);
	if (isdisplayed(driver, TDN_Popup_Msg)) {
		String actualPopup=getText(driver, TDN_Popup_Msg);
		if(actualPopup.equals(merchantPopup)) {
			System.out.println("Matched || Expected popup : "+merchantPopup+" || Actual popup : "+actualPopup);
			Extent_pass(driver, "Matched || Expected popup : "+merchantPopup+" || Actual popup : "+actualPopup, test, test1);
			click(driver,yesbtn);
		}
	}
	
	Step_End(7, "Select the Yes button in TDN ( Haulage ) Message box.", test, test1);
	Step_Start(8, "Select the containers.", test, test1);
	Step_Start(9, "Move to customer tab.", test, test1);

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
	

	Step_End(8, "Select the containers.", test, test1);
	Step_End(9, "Move to customer tab.", test, test1);
	
	
	Step_Start(10, "select book number from dropdown.", test, test1);
	click(driver, Select_Booking_DD);
	
	
	String contract_click1=String.format(bookingNumber_Select, Booking_Number);
	waitForElement(driver, contract_click1);
	click(driver, contract_click1);
	
	Step_End(10, "select book number from dropdown.", test, test1);
	Step_Start(11, "click all in the box.", test, test1);
	
	waitForElement(driver, Select_Booking_all);
	click(driver, Select_Booking_all);
	
	Step_End(11, "click all in the box.", test, test1);
	Step_Start(12, " Click the Ware House Name search icon.", test, test1);

	waitForElement(driver, Add_ware_house);
	click(driver, Add_ware_house);
	
	
	
	Step_End(12, " Click the Ware House Name search icon.", test, test1);
	Step_Start(13, "Enter the % in Ware House Name search box and click the search icon.", test, test1);

	globalValueSearchWindow(driver, dropdown_Condition, ware_House_Type_Select, Ware_House_number, Address1_Search, Address1_Input, Address2_Search, Address2_Input);

	
	Step_End(13, "Enter the % in Ware House Name search box and click the search icon.", test, test1);
	Step_Start(14, "Select the ware house name and click the search icon", test, test1);
	
		
		Step_End(14, "Select the ware house name and click the search icon", test, test1);
		Step_Start(15, "Select the date in APP Date field. ", test, test1);

		waitForElement(driver, Date_click);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			click(driver, Date_click);
			
			selectDatePickerWithTime1(driver, Date_click, App_Date);
			click(driver, State_Label);


		} else {
			waitForElement(driver, Date_click);
			clearAndType(driver, Date_click, App_Date);
		}
		Step_End(15, "Select the date in APP Date field. ", test, test1);
		Step_Start(16, "Click the ADD button.", test, test1);
		
		waitForElement(driver, Customer_Add_Button);
		click(driver, Customer_Add_Button);
		
		Step_End(16, "Click the ADD button.", test, test1);
		Step_Start(17, "Select the containers and Click the Reset customer button and customer will be cleared", test, test1);
		
		waitForElement(driver,chargesgird_click);
		click(driver,chargesgird_click);
		
		waitForElement(driver,Reset_customer);
		click(driver,Reset_customer);

		waitForDisplay(driver, customerTab_Row);
		if(!isdisplayed(driver, customerTab_Row)) {
			System.out.println("Passed || Customer Row Is Removed");
			Extent_pass(driver, "Passed || Customer Row Is Removed", test, test1);
		}else {
			System.out.println("Failed || Customer Row Is Not Removed");
			Extent_fail(driver, "Failed || Customer Row Is Not Removed", test, test1);
		}
		
		Step_End(17, "Select the containers and Click the Reset customer button and customer will be cleared.", test, test1);
		Extent_completed(testCaseName, test, test1);	
		
	}
}
