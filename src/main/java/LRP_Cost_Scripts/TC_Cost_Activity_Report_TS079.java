package LRP_Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS079 extends Keywords{

	public void  Cost_Activity_Report_TS079(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		
		String tc_Name = "TC_Cost_Activity_Report_TS079";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String AgencyUser = data.get("AgencyUser");
		
		
		String activity_Module = data.get("Activity_Module");
		String activityDescription = data.get("ActivityDescription");
		String activityCode = data.get("ActivityCode");
		String activity_Type = data.get("Activity_Type");
		String contract_Type = data.get("Contract_Type");
		String vendorCode = data.get("VendorCode");
		String currencyCode = data.get("CurrencyCode");
		String amount = data.get("Amount");
		String condition_2 = data.get("Condition_2");
		
		String amount_Mics = data.get("Amount_Mics");
		String Select_Mode_type = data.get("Select_Mode_type");
		String Service_Code = data.get("Service_Code");
		String Vessel_Code = data.get("Vessel_Code");
		String Port_Code = data.get("Port_Code");
		String Terminal_Code = data.get("Terminal_Code");
		String Service_details_Codition = data.get("Service_details_Codition");
		String Arrival_Date_Condition = data.get("Arrival_Date_Condition");
		String Arrival_Date_Value = data.get("Arrival_Date_Value");
		String Service_Header = data.get("Service_Header");
		String Vessel_Header = data.get("Vessel_Header");
		String Port_Header = data.get("Port_Header");
		String Terminal_Header = data.get("Terminal_Header");
		String Arrival_Date_Header = data.get("Arrival_Date_Header");
		String Vendor_Code_Header = data.get("Vendor_Code_Header");
		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		
		Step_Start(1, "Once login to the application, enter the screen name as\"Activity\" in the module search field.", test, test1);
		
		moduleNavigate(driver, activity_Module);
		
		Step_End(1, "Once login to the application, enter the screen name as\"Activity\" in the module search field.", test, test1);
		Step_Start(2, "Enter the Activity code with the required alphabets and give the required activity description and select the actvity type as Sub and contract type as MSC and click the add button and select the required port and then click on the add option,then add the record to AG grid.", test, test1);
		
		waitForElement(driver, switch_Button);
		click(driver, switch_Button);
		
		waitForElement(driver, activity_Code_Textfield);
		sendKeys(driver, activity_Code_Textfield, activityCode);

		waitForElement(driver, activity_Description_Textfield);
		sendKeys(driver, activity_Description_Textfield, activityDescription);

		waitForElement(driver, activity_Type_Dropdown);
		click(driver, activity_Type_Dropdown);
		
		String select_ActivityType=String.format(DropDown_Select, activity_Type);
		waitForElement(driver, select_ActivityType);
		click(driver, select_ActivityType);
		
		waitForElement(driver, contractTypeDropdown);
		click(driver, contractTypeDropdown);
		
		String select_Contract_Type=String.format(DropDown_Select, contract_Type);
		waitForElement(driver, select_Contract_Type);
		click(driver, select_Contract_Type);
		
		waitForElement(driver, port_Add_Button);
		click(driver, port_Add_Button);
		
		waitForElement(driver, portCode_Filter);
		click(driver, portCode_Filter);
		sendKeys(driver, portCode_Filter, Port_Code);

		String select_Port=String.format(portList_Filter_Checkbox, Port_Code);
		waitForElement(driver, select_Port);
		click(driver, select_Port);
		
		waitForElement(driver, portList_Filter_Ok_Button);
		click(driver, portList_Filter_Ok_Button);
		
		waitForElement(driver, activity_Currency_Gridcell);
		click(driver, activity_Currency_Gridcell);
		
		waitForElement(driver, activity_Currency_Gridcell_Dropdown);
		click(driver, activity_Currency_Gridcell_Dropdown);
		
		String select_Currency=String.format(DropDown_Select, currencyCode);
		waitForElement(driver, select_Currency);
		click(driver, select_Currency);
		
		waitForElement(driver, activity_Amount_Gridcell);
		click(driver, activity_Amount_Gridcell);
		
		waitForElement(driver, activity_Amount_Gridcell_Input);
		click(driver, activity_Amount_Gridcell_Input);
		clearAndType(driver, activity_Amount_Gridcell_Input, amount);
		
		waitForElement(driver, activity_Currency_Gridcell);
		click(driver, activity_Currency_Gridcell);
		
		waitForElement(driver, activity_Add_Button);
		click(driver, activity_Add_Button);
		
		Step_End(2, "Enter the Activity code with the required alphabets and give the required activity description and select the actvity type as Sub and contract type as MSC and click the add button and select the required port and then click on the add option,then add the record to AG grid.", test, test1);
		Step_Start(3, "Next click the save option in the toolbar", test, test1);
		
		waitForElement(driver, Save_button_toolBar);
		click(driver, Save_button_toolBar);
		
		waitForElement(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			String actualPopup=getText(driver, popup_Message);
			System.out.println("actualPopup : "+actualPopup);
			Extent_pass(driver, "actualPopup : "+actualPopup, test, test1);
			click(driver, popup_Message_Ok_Button);
		}
		
		Step_End(3, "Next click the save option in the toolbar", test, test1);

		Step_Start(4, "Next switch to the required agency and enter the screen name as \"Cost activity report\" in the module search field. Select the contract type as MSC.", test, test1);
	
		SwitchProfile(driver, AgencyUser);
		
		moduleNavigate(driver, Cost_Activity_Report_Module);
		
		waitForElement(driver, Contract_Type_Input_CAR);
		click(driver,Contract_Type_Input_CAR);
		
		String SelectContract=String.format(Select_Contract_Type_CAR, contract_Type);
		waitForElement(driver, SelectContract);
		click(driver,SelectContract);
		
		waitForElement(driver, Mode_Select_Input_CAR);
		click(driver,Mode_Select_Input_CAR);
		
		String SelectModeValue=String.format(Select_Mode_type_CAR, Select_Mode_type);
		waitForElement(driver, SelectModeValue);
		click(driver,SelectModeValue);
		
		Step_End(4, "Next switch to the required agency and enter the screen name as \"Cost activity report\" in the module search field. Select the contract type as MSC.", test, test1);
		Step_Start(5, "Enter the required service,vessel,port,terminal,arrival date from their respective searches.", test, test1);
		
		waitForElement(driver, Service_Search_Btn_CAR);
		click(driver,Service_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Service_Header,Service_details_Codition,Service_Code);


		waitForElement(driver, Vessel_Search_Btn_CAR);
		click(driver,Vessel_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Vessel_Header,Service_details_Codition,Vessel_Code);

		
		waitForElement(driver, Port_Search_Btn_CAR);
		click(driver,Port_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Port_Header,Service_details_Codition,Port_Code);

		
		waitForElement(driver, Terminal_Search_Btn_CAR);
		click(driver,Terminal_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Terminal_Header,Service_details_Codition,Terminal_Code);

		
		waitForElement(driver, Arrival_Date_Search_Btn_CAR);
		click(driver,Arrival_Date_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Arrival_Date_Header,Arrival_Date_Condition,Arrival_Date_Value);

		
		Step_End(5, "Enter the required service,vessel,port,terminal,arrival date from their respective searches.", test, test1);
		
		Step_Start(6, "Click on the show option", test, test1);
		
		waitForElement(driver, Show_Button_CAR);
		click(driver,Show_Button_CAR);
		
		Step_End(6, "Click on the show option", test, test1);
		
		Step_Start(7, "Next click on the ADD option", test, test1);
		
		waitForElement(driver, add_Button_Misc);
		click(driver,add_Button_Misc);
		
		Step_End(7, "Next click on the ADD option", test, test1);
		Step_Start(8, "Ensure that the newly added activities are shown and select the required sub-activities.", test, test1);

		waitForElement(driver, activity_Code_Filter_CAR);
		sendKeys(driver, activity_Code_Filter_CAR, activityCode);
		
		String select_Activity_Misc=String.format(activity_Search_Checkbox_CAR, activityCode);
		
		waitForDisplay(driver, select_Activity_Misc);
		if(isdisplayed(driver, select_Activity_Misc)) {
			
			System.out.println("Passed || The newly added activities are shown");
			Extent_pass(driver, "Passed || The newly added activities are shown", test, test1);

		}else {
			System.out.println("Failed || The newly added activities are not shown");
			Extent_fail(driver, "Failed || The newly added activities are not shown", test, test1);
		}
		
		Step_End(8, "Ensure that the newly added activities are shown and select the required sub-activities.", test, test1);
		Step_Start(9, "Select the required added activities ", test, test1);

		click(driver,select_Activity_Misc);

		waitForElement(driver, mutiColumn_Select_Button);
		click(driver, mutiColumn_Select_Button);
		
		Step_End(9, "Select the required added activities ", test, test1);
		Step_Start(10, "Click the save option in the toolbar and system validates as\"Container report activity saved\".Click the ok option.", test, test1);

		
		String select_Row=String.format(mics_Row, activityCode);
		waitForElement(driver, select_Row);
		click(driver, select_Row);
		
		waitForElement(driver, vendorCode_Button);
		click(driver, vendorCode_Button);
		
		twoColumnSearchWindow(driver, Vendor_Code_Header, condition_2, vendorCode);
		
		waitForElement(driver, amount_Gridcell_Mics);
		doubleClick(driver, amount_Gridcell_Mics);
		
		waitForElement(driver, amount_Gridcell_Inputfield_Mics);
		sendKeys(driver, amount_Gridcell_Inputfield_Mics, amount_Mics);
		enter(driver);
		
		waitForElement(driver, SaveButton_ToolBar);
		click(driver, SaveButton_ToolBar);
		
		waitForElement(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			String actualPopup=getText(driver, popup_Message);
			System.out.println("actualPopup : "+actualPopup);
			click(driver, popup_Message_Ok_Button);
		}
		
		Step_End(10, "Click the save option in the toolbar and system validates as\"Container report activity saved\".Click the ok option.", test, test1);

		
		
		Extent_completed(tc_Name, test, test1);
	}
	
	
}
