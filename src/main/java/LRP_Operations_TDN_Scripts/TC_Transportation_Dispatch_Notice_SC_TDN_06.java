package LRP_Operations_TDN_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Transportation_Dispatch_Notice_SC_TDN_06 extends Keywords {

	public void Transportation_Dispatch_Notice_SC_TDN_06(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testCaseName = "TC_Transportation_Dispatch_Notice_SC_TDN_06";

//		Get data from test data

		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testCaseName, "Dataset" + selected_dataset, File_Path);
		String URL = TestNgXml.getdatafromExecution().get(testCaseName);

		String username = Data.get("Username");
		String password = Data.get("Password");
		String moduleTDN = Data.get("ModuleTDN");
		String agencyUser = Data.get("AgencyUser");
		String Booking_Number = Data.get("Booking_Number");
		String Provisional_perform = Data.get("Provisional_perform");
		String Draft_perform = Data.get("Draft_perform");
		String Confirmed_perform = Data.get("Confirmed_perform");
		String Cancelled_perform = Data.get("Cancelled_perform");
		String Shipment_Type = Data.get("Shipment_Type");
		String field_select = Data.get("field_select");
		String Ware_House_number = Data.get("Ware_House_number");
		String Confirmation_msg = Data.get("Confirmation_msg");
		String ware_House_Type_Select = Data.get("Ware_House_Type_Select");
		String dropdown_Condition = Data.get("Dropdown_Condition");
		String merchantPopup =Data.get("MerchantPopup");

		navigateUrl(driver, URL);

		Extent_Start(testCaseName, test, test1);
//	Login

	LRP_Login(driver, username, password);

		Extent_call(test, test1, "**Switch the Profile Start**");

		SwitchProfile(driver, agencyUser);

		Extent_cal(test, test1, moduleTDN);

		moduleNavigate(driver, moduleTDN);

		waitForElement(driver, shipment_Dropdown);
		click(driver, shipment_Dropdown);
		String select_Shipment = String.format(shipment_Type, Shipment_Type);
		safeclick(driver, select_Shipment);

		Step_Start(1, "select provisional checkbox.", test, test1);

		waitForElement(driver, Provisional_check_box);
		checkBox(driver, Provisional_check_box, Provisional_perform);
		waitForElement(driver, Provisional_check_box);
		checkBox(driver, Draft_check_box, Draft_perform);
		checkBox(driver, Confirmed_check_box, Confirmed_perform);
		checkBox(driver, Cancelled_check_box, Cancelled_perform);

		Step_End(1, "select provisional checkbox.", test, test1);
		Step_Start(2, "Click add(+) button in BookNo field.", test, test1);

		List<String> datas = splitAndExpand(Booking_Number);
		for (String data1 : datas) {
			waitForElement(driver, BL_Add);
			safeclick(driver, BL_Add);

			Step_End(2, "Click add(+) button in BookNo field.", test, test1);

			click(driver, type_Select1);
			selectByText(driver, type_Select1, field_select);
			waitForDisplay(driver, globalSearch_Condition_Dropdown1);
			click(driver, globalSearch_Condition_Dropdown1);
			selectByText(driver, globalSearch_Condition_Dropdown1, dropdown_Condition);
			
			Step_Start(3, "Paste book number and click search button.", test, test1);

			sendKeys(driver, globalSearch_InputTextfield1, data1);

			click(driver, globalSearch_Frame_SearchButton);
			
			
			Step_End(3, "Paste book number and click search button.", test, test1);

			Step_Start(4, "Select the book number", test, test1);

			waitForElement(driver, retrieved_Value_Select);
			click(driver, retrieved_Value_Select);
			
			waitForElement(driver, Aselectbutton1);
			click(driver, Aselectbutton1);

			Step_End(4, "Select the book number", test, test1);

		}

		Step_Start(5, "system will display 'Selected Booking is a Merchant. Do you want to proceed?', click yes.", test,
				test1);

		waitForDisplay(driver, TDN_Popup_Msg);
		if (isdisplayed(driver, TDN_Popup_Msg)) {
			String actualPopup=getText(driver, TDN_Popup_Msg);
			if(actualPopup.equals(merchantPopup)) {
				System.out.println("Matched || Expected popup : "+merchantPopup+" || Actual popup : "+actualPopup);
				Extent_pass(driver, "Matched || Expected popup : "+merchantPopup+" || Actual popup : "+actualPopup, test, test1);
				click(driver,yesbtn);
			}
		}
		Step_End(5, "system will display 'Selected Booking is a Merchant. Do you want to proceed?', click yes.", test,
				test1);
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

		String contract_click1 = String.format(bookingNumber_Select, Booking_Number);
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
		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, ware_House_Type_Select);
		waitForElement(driver, globalSearch_Condition_Dropdown1);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, dropdown_Condition);

		Step_End(9, "click search icon in the warehouse field.", test, test1);
		Step_Start(10, "enter % in warehouse name.", test, test1);

		sendKeys(driver, globalSearch_InputTextfield1, Ware_House_number);

		click(driver, globalSearch_Frame_SearchButton);

		Step_End(10, "enter % in warehouse name.", test, test1);

		Step_Start(11, "click on the warehouse and click select button.", test, test1);

		waitForElement(driver, retrieved_Value_Select);
		click(driver, retrieved_Value_Select);

		waitForElement(driver, Aselectbutton1);
		click(driver, Aselectbutton1);

		Step_End(11, "click on the warehouse and click select button.", test, test1);
		Step_Start(12, "click add button.", test, test1);

		waitForElement(driver, Customer_Add_Button);
		click(driver, Customer_Add_Button);

		Step_End(12, "click add button.", test, test1);

		Step_Start(13, "system will display \"Select the Appointment Date\", click ok.", test, test1);

		waitForElement(driver, TDN_Popup_Msg);
		String SaveRate_PopUp2 = getText(driver, TDN_Popup_Msg);

		if (Confirmation_msg.equals(SaveRate_PopUp2)) {
			System.out.println("Matched || Expected value was : " + Confirmation_msg + " || Actual value was : "
					+ SaveRate_PopUp2);
			Extent_pass(driver,
					"Matched || Expected value was : " + Confirmation_msg + " || Actual value was : " + SaveRate_PopUp2,
					test, test1);
			click(driver, tdnPopup_Ok);

		} else {
			System.out.println("NotMatched || Expected value was : " + Confirmation_msg + " || Actual value was : "
					+ SaveRate_PopUp2);
			Extent_fail(driver, "NotMatched || Expected value was : " + Confirmation_msg + " || Actual value was : "
					+ SaveRate_PopUp2, test, test1);
		}

		Step_End(13, "system will display \"Select the Appointment Date\", click ok.", test, test1);

		Extent_completed(testCaseName, test, test1);

	}
}
