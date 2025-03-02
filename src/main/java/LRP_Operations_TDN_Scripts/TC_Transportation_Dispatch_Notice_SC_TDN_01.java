package LRP_Operations_TDN_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Transportation_Dispatch_Notice_SC_TDN_01 extends Keywords{

	public void Transportation_Dispatch_Notice_SC_TDN_01(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {	
		
		String testCaseName="TC_Transportation_Dispatch_Notice_SC_TDN_01";
		
		String File_Path_S01 = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name_S01 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		Map<String, String> TDN_S01 = Utils.GetAllData(Sheet_Name_S01, testCaseName, "Dataset"+selected_dataset, File_Path_S01);
		
		
		String username=TDN_S01.get("Username");
		String password=TDN_S01.get("Password");
		String moduleTDN=TDN_S01.get("ModuleTDN");
		String agencyUser = TDN_S01.get("AgencyUser");
		String Booking_Number =TDN_S01.get("Booking_Number");
		String Provisional_perform =TDN_S01.get("Provisional_perform");
		String Confirmed_perform =TDN_S01.get("Confirmed_perform");
		String Cancelled_perform =TDN_S01.get("Cancelled_perform");
		String Shipment_Type =TDN_S01.get("Shipment_Type");
		String field_select =TDN_S01.get("field_select");
		String Ware_House_number =TDN_S01.get("Ware_House_number");
		String Trans_select =TDN_S01.get("Modeof_Transport");
		String App_Date =TDN_S01.get("App_Date");
		String date_Picker =TDN_S01.get("date_Picker");
		String tdn_SavedPopup =TDN_S01.get("TDN_SavedPopup");
		String Draft_perform =TDN_S01.get("Draft_perform");
		String ware_House_Type_Select =TDN_S01.get("Ware_House_Type_Select");
		String dropdown_Condition =TDN_S01.get("Dropdown_Condition");
		String merchantPopup =TDN_S01.get("MerchantPopup");
		String shipmenttype_select=String.format(shipmentType, Shipment_Type);
		String Booking_Number2 =TDN_S01.get("Booking_Number2");
		String Booking_Number3 =TDN_S01.get("Booking_Number3");
		String Booking_Number_Type_Select2 =TDN_S01.get("Booking_Number_Type_Select2");
		String Booking_Number_Type_Select3 =TDN_S01.get("Booking_Number_Type_Select3");
		String ware_House_Type_Select2 =TDN_S01.get("ware_House_Type_Select2");
		String Ware_House_number2 =TDN_S01.get("Ware_House_number2");
		String ware_House_Type_Select3 =TDN_S01.get("ware_House_Type_Select3");
		String Ware_House_number3 =TDN_S01.get("Ware_House_number3");
	navigateUrl(driver,url);
	
	Extent_Start(testCaseName, test, test1);
//	Login
		
	LRP_Login(driver, username, password);

	Extent_call(test, test1,"**Switch the Profile Start**");

	SwitchProfile(driver, agencyUser);
	
	Extent_cal(test, test1, "Transportaion Dispatch Notice");	
		
	moduleNavigate(driver, moduleTDN);
		
		waitForElement(driver, shipment_Dropdown);
		click(driver, shipment_Dropdown);
		safeclick(driver, shipmenttype_select);
		
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
				globalValueSearchWindow(driver, dropdown_Condition, field_select, data1,Booking_Number_Type_Select2,Booking_Number2,Booking_Number_Type_Select3,Booking_Number3);

				
				Step_Start(3, "Paste book number and click search button.", test, test1);

			Step_End(3, "Paste book number and click search button.", test, test1);

				Step_Start(4, "Select the book number", test, test1);
				
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
		
		globalValueSearchWindow(driver, dropdown_Condition, ware_House_Type_Select, Ware_House_number,ware_House_Type_Select2,Ware_House_number2,ware_House_Type_Select3,Ware_House_number3);

		
		Step_End(9, "click search icon in the warehouse field.", test, test1);

		Step_Start(10, "enter % in warehouse name.", test, test1);

	
		Step_End(10, "enter % in warehouse name.", test, test1);

		Step_Start(11, "click on the warehouse and click select button.", test, test1);

	
		Step_End(11, "click on the warehouse and click select button.", test, test1);

		Step_Start(12, "click in app date field and select the current date.", test, test1);

		if(date_Picker.equalsIgnoreCase("yes")) {
		selectDatePickerWithTime1(driver, Date_click, App_Date);
		}else {
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

		scrollTop(driver);
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

		Extent_completed(testCaseName, test, test1);
		
	}
}	