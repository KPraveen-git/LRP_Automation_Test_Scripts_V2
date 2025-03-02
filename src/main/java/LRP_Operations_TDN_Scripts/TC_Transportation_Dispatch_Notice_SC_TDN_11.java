package LRP_Operations_TDN_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Tdn_Locators;

public class TC_Transportation_Dispatch_Notice_SC_TDN_11 extends Keywords{

	public void Transportation_Dispatch_Notice_SC_TDN_11(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		
		
		String tc_Name="TC_Transportation_Dispatch_Notice_SC_TDN_11";
		String File_Path_SC11 = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC11 = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> TDN_SC_11 = Utils.GetAllData(Sheet_Name_SC11, tc_Name, "Dataset"+selected_dataset, File_Path_SC11);
		
		
		String username=TDN_SC_11.get("Username");
		String password=TDN_SC_11.get("Password");
		String moduleTDN=TDN_SC_11.get("ModuleTDN");
		String agencyUser = TDN_SC_11.get("AgencyUser");
		String Booking_Number =TDN_SC_11.get("Booking_Number");
		String Provisional_perform =TDN_SC_11.get("Provisional_perform");
		String Confirmed_perform =TDN_SC_11.get("Confirmed_perform");
		String Cancelled_perform =TDN_SC_11.get("Cancelled_perform");
		String Shipment_Type =TDN_SC_11.get("Shipment_Type");
		String Booking_Number_perform =TDN_SC_11.get("Booking_Number_perform");
		String Ware_House_number =TDN_SC_11.get("Ware_House_number");
		String Trans_select =TDN_SC_11.get("Trans_select");
		String App_Date =TDN_SC_11.get("App_Date");
		String date_Picker =TDN_SC_11.get("date_Picker");
		String tdn_SavedPopup =TDN_SC_11.get("TDN_SavedPopup");
		String Global_search_Option1 =TDN_SC_11.get("Global_search_Option1");
		String Dropdown_Condition =TDN_SC_11.get("Dropdown_Condition");
		String Global_search_Book_No =TDN_SC_11.get("Global_search_Book_No");
		String merchantPopup =TDN_SC_11.get("MerchantPopup");
		String Search_Type2 =TDN_SC_11.get("Search_Type2");
		String Search_Input2 =TDN_SC_11.get("Search_Input2");
		String Search_Type3 =TDN_SC_11.get("Search_Type3");
		String Search_Input3 =TDN_SC_11.get("Search_Input3");

		
		
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
	
		Step_Start(1, "select shipment type as import and click provisional checkbox.", test, test1);
		
		waitForElement(driver, shipment_Dropdown);
		click(driver, shipment_Dropdown);
		safeclick(driver, shipmenttype_select);
		
		waitForElement(driver, Provisional_check_box);
		checkBox(driver, Provisional_check_box, Provisional_perform);
		waitForElement(driver, Provisional_check_box);
		checkBox(driver, Confirmed_check_box, Confirmed_perform);
		checkBox(driver, Cancelled_check_box, Cancelled_perform);
		
		Step_End(1, "select shipment type as import and click provisional checkbox.", test, test1);

		
		if (Booking_Number_perform.equalsIgnoreCase("YES")) {

			List<String> datas = splitAndExpand(Booking_Number);
			for (String data1 : datas) {
				
				Step_Start(2, "Click add(+) button in Bl No field.", test, test1);

				waitForElement(driver, BL_Add);
				safeclick(driver, BL_Add);
				
				Step_End(2, "Click add(+) button in Bl No field.", test, test1);
				
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
			if(actualPopup.equals(merchantPopup.trim())){
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

		Step_Start(7, "select book number from drop down.", test, test1);
		waitForElement(driver, Select_Booking_DD);
		click(driver, Select_Booking_DD);
		String contract_click1=String.format(Tdn_Locators.contract_click1, Booking_Number);
		waitForElement(driver, contract_click1);
		click(driver, contract_click1);
		
		Step_End(7, "select book number from drop down.", test, test1);
		
		Step_Start(8, "click all in the box.", test, test1);
		
		waitForElement(driver, Select_Booking_all);
		click(driver, Select_Booking_all);
		
		Step_End(8, "click all in the box.", test, test1);

		Step_Start(9, "click search icon in the warehouse field.", test, test1);

		
		waitForElement(driver, Add_ware_house);
		click(driver, Add_ware_house);
		
		globalValueSearchWindow(driver, Dropdown_Condition, Global_search_Option1, Ware_House_number, Search_Type2, Search_Input2, Search_Type3, Search_Input3);
		
		Step_End(11, "click on the warehouse and click select button.", test, test1);


		Step_Start(12, "click in app date field and select the current date.", test, test1);

		waitForElement(driver, Date_click);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			
			selectDatePickerWithTime1(driver, Date_click, App_Date);

		} else {
			waitForElement(driver, Date_click);
			clearAndType(driver, Date_click, App_Date);
		}
		
		waitForElement(driver, TDN_Customer_Tab);
		click(driver, TDN_Customer_Tab);
		
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

		Extent_completed(tc_Name, test, test1);

}
	
}
