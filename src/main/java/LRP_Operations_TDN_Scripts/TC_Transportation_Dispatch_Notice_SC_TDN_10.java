package LRP_Operations_TDN_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Transportation_Dispatch_Notice_SC_TDN_10 extends Keywords{

	public void Transportation_Dispatch_Notice_SC_TDN_10(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		
		String testCaseName="TC_Transportation_Dispatch_Notice_SC_TDN_10";

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		Map<String, String> TDN_SC_10 = Utils.GetAllData(Sheet_Name, testCaseName, "Dataset"+selected_dataset, File_Path);
		
		
		String username=TDN_SC_10.get("Username");
		String password=TDN_SC_10.get("Password");
		String moduleTDN=TDN_SC_10.get("ModuleTDN");
		String agencyUser = TDN_SC_10.get("AgencyUser");
		String Booking_Number =TDN_SC_10.get("Booking_Number");
		String Provisional_perform =TDN_SC_10.get("Provisional_perform");
		String Draft_perform =TDN_SC_10.get("Draft_perform");
		String Confirmed_perform =TDN_SC_10.get("Confirmed_perform");
		String Cancelled_perform =TDN_SC_10.get("Cancelled_perform");
		String Shipment_Type =TDN_SC_10.get("Shipment_Type");
		String field_select =TDN_SC_10.get("field_select");
		String TDN_warehouse_popup =TDN_SC_10.get("TDN_warehouse_popup");
		String dropdown_Condition =TDN_SC_10.get("Dropdown_Condition");
		String merchantPopup =TDN_SC_10.get("MerchantPopup");

	navigateUrl(driver,url);
	
	Extent_Start(testCaseName, test, test1);
//	Login
		
	LRP_Login(driver, username, password);

	
	Extent_call(test, test1,"**Switch the Profile Start**");

	SwitchProfile(driver, agencyUser);

	Extent_cal(test, test1, moduleTDN);	
		
	moduleNavigate(driver, moduleTDN);
	
	Step_Start(1, "Select the Export option.", test, test1);

		waitForElement(driver, shipment_Dropdown);
		click(driver, shipment_Dropdown);
		String select_Shipment=String.format(shipment_Type, Shipment_Type);
		safeclick(driver, select_Shipment);
		
		Step_End(1, "Select the Export option.", test, test1);
		
		Step_Start(2, "Select the Provisional Check Box.", test, test1);
		
		waitForElement(driver, Provisional_check_box);
		checkBox(driver, Provisional_check_box, Provisional_perform);
		waitForElement(driver, Draft_check_box);
		checkBox(driver, Draft_check_box, Draft_perform);
		waitForElement(driver, Draft_check_box);
		checkBox(driver, Confirmed_check_box, Confirmed_perform);
		checkBox(driver, Cancelled_check_box, Cancelled_perform);
		
		Step_End(2, "Select the Provisional Check Box.", test, test1);

		Step_Start(3, "Click the Plus icon button.", test, test1);
		
		
			List<String> datas = splitAndExpand(Booking_Number);
			for (String data1 : datas) {
				
				Step_Start(3, "Click the Plus icon button.", test, test1);
				waitForElement(driver, BL_Add);
				safeclick(driver, BL_Add);
				Step_End(3, "Click the Plus icon button.", test, test1);
				
				Step_Start(4, "Enter the Book Number.", test, test1);
				
				click(driver, type_Select1);
				selectByText(driver, type_Select1, field_select);
				waitForDisplay(driver, globalSearch_Condition_Dropdown1);
				click(driver, globalSearch_Condition_Dropdown1);
				selectByText(driver, globalSearch_Condition_Dropdown1, dropdown_Condition);
				
				Step_End(4, "Enter the Book Number.", test, test1);
				
				Step_Start(5, "Click the search icon.", test, test1);
				
				sendKeys(driver, globalSearch_InputTextfield1, data1);

				click(driver, globalSearch_Frame_SearchButton);
				
				Step_End(5, "Click the search icon.", test, test1);
				
				Step_Start(6, " Select the booking and click the search icon.", test, test1);
				
				waitForElement(driver, retrieved_Value_Select);
				click(driver, retrieved_Value_Select);
				
				waitForElement(driver, Aselectbutton1);
				click(driver, Aselectbutton1);
				
				Step_End(6, " Select the booking and click the search icon.", test, test1);

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
		
		Step_Start(10, "Select the book no in Drop down.", test, test1);
		
		waitForElement(driver, Select_Booking_DD);
		click(driver, Select_Booking_DD);
		
		String contract_click1=String.format(bookingNumber_Select, Booking_Number);
		waitForElement(driver, contract_click1);
		click(driver, contract_click1);
		
		Step_End(10, "Select the book no in Drop down.", test, test1);
		
		Step_Start(11, "Select the ALL container.", test, test1);
		
		waitForElement(driver, Select_Booking_all);
		click(driver, Select_Booking_all);
		
		Step_End(11, "Select the ALL container.", test, test1);
		
		Step_Start(12, "Click the ADD button", test, test1);
		
		waitForElement(driver, Customer_Add_Button);
		click(driver, Customer_Add_Button);
		
		Step_End(12, "Click the ADD button", test, test1);
		
		waitForElement(driver, TDN_Popup_Msg);
		String actual_warehouse_Popup=getText(driver, TDN_Popup_Msg);
		
		if(actual_warehouse_Popup.equals(TDN_warehouse_popup)) {
			Extent_pass(driver, "Matched || Expected Pop up : "+TDN_warehouse_popup +" || Actual Pop up : "+actual_warehouse_Popup, test, test1);
			System.out.println("Matched || Expected Pop up : "+TDN_warehouse_popup +" || Actual Pop up : "+actual_warehouse_Popup);
			click(driver, tdnPopup_Ok);
		}else {
			System.out.println("Not Matched || Expected Pop up : "+TDN_warehouse_popup +" || Actual Pop up : "+actual_warehouse_Popup);
			Extent_fail(driver, "Not Matched || Expected Pop up : "+TDN_warehouse_popup +" || Actual Pop up : "+actual_warehouse_Popup, test, test1);
		}

		Extent_completed(testCaseName, test, test1);

	}

}
