package LRP_Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS009 extends Keywords {

	public void Cost_Activity_Report_TS009(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS009";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String GivenContract_Type = data.get("GivenContract_Type");
		String Service = data.get("Service");
		String Vessel = data.get("Vessel");
		String Port = data.get("Port");
		String Terminal = data.get("Terminal");
		String Arrival_Date = data.get("Arrival_Date");
		String Condition1 = data.get("Condition1");
		String GivenMode = data.get("GivenMode");
		String ActivityName2 = data.get("ActivityName");
		String Save_Popup = data.get("Save_Popup");
		String Quantity = data.get("Quantity");
		String EqpType = data.get("EqpType");
		String Vendor_Code = data.get("Vendor_Code");
		String Activity_details_Condition = data.get("Activity_details_Condition");
		String Amount = data.get("Amount");

		String Contract_option = String.format(Select_ContractType, GivenContract_Type);
		String Mode_option = String.format(Select_ModeOption, GivenMode);

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);

		LRP_Login(driver, username, password);

		verifyMainMenu(driver);

		Step_End(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);
		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		Step_Start(3, "Click on the Service search button and select the required service code", test, test1);

		waitForElement(driver, Contract_type);
		click(driver, Contract_type);

		waitForElement(driver, Contract_option);
		click(driver, Contract_option);

		waitForElement(driver, Select_Mode);
		click(driver, Select_Mode);

		waitForElement(driver, Mode_option);
		click(driver, Mode_option);

		waitForElement(driver, Service_Search);
		click(driver, Service_Search);

		selectValue(driver, Condition1, Service);

		Step_End(3, "Click on the Service search button and select the required service code", test, test1);

		Step_Start(4, "Click on the Vessel search button and select the required vessel code", test, test1);

		waitForElement(driver, Vessel_Search);
		click(driver, Vessel_Search);

		selectValue(driver, Condition1, Vessel);

		Step_End(4, "Click on the Vessel search button and select the required vessel code", test, test1);

		Step_Start(5, "Click on the Port search button and select the required port code", test, test1);

		waitForElement(driver, port_Search);
		click(driver, port_Search);

		selectValue(driver, Condition1, Port);

		Step_End(5, "Click on the Port search button and select the required port code", test, test1);

		Step_Start(6, "Click on the Terminal search button and select the required terminal code", test, test1);

		waitForElement(driver, Terminal_Search);
		click(driver, Terminal_Search);

		selectValue(driver, Condition1, Terminal);

		Step_End(6, "Click on the Terminal search button and select the required terminal code", test, test1);

		Step_Start(7, "Click on the Arrival date search button and select the required date", test, test1);

		waitForElement(driver, ArrivalDate_Search);
		click(driver, ArrivalDate_Search);

		selectValue(driver, Condition1, Arrival_Date);

		Step_End(7, "Click on the Arrival date search button and select the required date", test, test1);

		Step_Start(8, "Click on the Show button", test, test1);

		waitForElement(driver, Show_Button);
		click(driver, Show_Button);

		if (isdisplayed(driver, popup_Message_Yes_Button)) {

			click(driver, popup_Message_Yes_Button);
		}

		Step_End(8, "Click on the Show button", test, test1);

		waitForElement(driver, ADD_button_MSC_CAR);
		click(driver, ADD_button_MSC_CAR);
		Step_End(10, "Click on the Add button and system will list down the activities in new window", test, test1);

		Step_Start(11, "Select the activities by clicking on the check box.", test, test1);

		String SelectActivity = String.format(Select_Activity_Column_CAR, ActivityName2);
		waitForElement(driver, SelectActivity);
		click(driver, SelectActivity);

		Step_End(11, "Select the activities by clicking on the check box.", test, test1);

		Step_Start(12, "Click on the select button", test, test1);
		waitForElement(driver, Select_button_MSC_CAR);
		click(driver, Select_button_MSC_CAR);

		String UpdatedActivityQuantColumn = String.format(MSC_table_Quantity_Column_CAR, ActivityName2);
		waitForElement(driver, UpdatedActivityQuantColumn);
		doubleClick(driver, UpdatedActivityQuantColumn);

		String UpdatedActivityQuan = String.format(MSC_table_Quantity_input_CAR, ActivityName2);
		waitForElement(driver, UpdatedActivityQuan);
		sendKeys(driver, UpdatedActivityQuan, Quantity);
		Step_End(14, "Then select the activities in AG grid and Enter the required quantity", test, test1);

		Step_Start(15, "Click on the Eqp. type button and system will list down the activities in new window", test,
				test1);
		String UpdatedActivity = String.format(MSC_table_Activity_Column_CAR, ActivityName2);
		waitForElement(driver, UpdatedActivity);
		click(driver, UpdatedActivity);

		waitForElement(driver, MSC_Equipment_Type_Button_CAR);
		click(driver, MSC_Equipment_Type_Button_CAR);
		Step_End(15, "Click on the Eqp. type button and system will list down the activities in new window", test,
				test1);

		Step_Start(16, ".Select the required Equipment type and click on the select button", test, test1);
		selectValue(driver, Activity_details_Condition, EqpType);
		Step_End(16, ".Select the required Equipment type and click on the select button", test, test1);

		Step_Start(17,
				"Check whether the equipment type is set in the activity and click on the vendor code button,system will listdown the vendor details in new window",
				test, test1);
		String Selected_EqpType = String.format(MSC_Table_EqpType_Column_CAR, ActivityName2);
		waitForElement(driver, Selected_EqpType);
		String Updated_EpqType = getText(driver, Selected_EqpType);
		if (Updated_EpqType.equals(EqpType)) {
			System.out.println("Selected Eqp Type is updated Correctly in the Table");
			Extent_pass(driver, "Selected Eqp Type is updated Correctly in the Table", test, test1);
		} else {
			System.out.println("Selected Eqp Type is not updated Correctly in the Table");
			Extent_fail(driver, "Selected Eqp Type is not updated Correctly in the Table", test, test1);
		}

		waitForElement(driver, MSC_Vendor_Code_Button_CAR);
		click(driver, MSC_Vendor_Code_Button_CAR);
		Step_End(17,
				"Check whether the equipment type is set in the activity and click on the vendor code button,system will listdown the vendor details in new window",
				test, test1);

		Step_Start(18, "Select the required vendor code", test, test1);
		selectValue(driver, Activity_details_Condition, Vendor_Code);
		Step_End(18, "Select the required vendor code", test, test1);

		Step_Start(19, "Enter the required amount by selecting each activity one by one", test, test1);
		String Selected_VendorCode = String.format(MSC_Table_Vendor_Code_Column_CAR, ActivityName2);
		waitForElement(driver, Selected_VendorCode);
		String Updated_VendorCode = getText(driver, Selected_VendorCode);
		if (Updated_VendorCode.equals(Vendor_Code)) {
			System.out.println("Selected Vendor Code is updated Correctly in the Table");
			Extent_pass(driver, "Selected Vendor Code is updated Correctly in the Table", test, test1);
		} else {
			System.out.println("Selected Vendor Code is not updated Correctly in the Table");
			Extent_fail(driver, "Selected Vendor Code is not updated Correctly in the Table", test, test1);
		}

		String Activity_Amount_Col = String.format(MSC_Table_Amount_Column_CAR, ActivityName2);
		waitForElement(driver, Activity_Amount_Col);
		doubleClick(driver, Activity_Amount_Col);

		String Activity_Amount_Input = String.format(MSC_Table_Amount_Input_CAR, ActivityName2);
		waitForElement(driver, Activity_Amount_Input);
		clear(driver, Activity_Amount_Input);
		waitForElement(driver, Activity_Amount_Input);
		sendKeys(driver, Activity_Amount_Input, Amount);
		UpdatedActivityQuantColumn = String.format(MSC_table_Quantity_Column_CAR, ActivityName2);
		waitForElement(driver, UpdatedActivityQuantColumn);
		click(driver, UpdatedActivityQuantColumn);
		Step_End(19, "Enter the required amount by selecting each activity one by one", test, test1);

		Step_Start(20,
				"Click on the tool bar save button and check whether the system shows the information message as \"Container Activity Report Saved\".",
				test, test1);

		scrollTop(driver);

		waitForElement(driver, SaveButton_ToolBar);
		click(driver, SaveButton_ToolBar);

		waitForElement(driver, popup_Message);
		String SavePopupmessage = getText(driver, popup_Message);

		if (SavePopupmessage.equals(Save_Popup)) {

			System.out.println(
					"Activity report is saved || Expected : " + Save_Popup + " || Actual : " + SavePopupmessage);
			Extent_pass(driver,
					"Activity report is saved || Expected : " + Save_Popup + " || Actual : " + SavePopupmessage, test,
					test1);
		} else {

			System.out.println(
					"Activity report is not saved || Expected : " + Save_Popup + " || Actual : " + SavePopupmessage);
			Extent_fail(driver,
					"Activity report is not saved || Expected : " + Save_Popup + " || Actual : " + SavePopupmessage,
					test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_End(20,
				"Click on the tool bar save button and check whether the system shows the information message as \"Container Activity Report Saved\".",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
