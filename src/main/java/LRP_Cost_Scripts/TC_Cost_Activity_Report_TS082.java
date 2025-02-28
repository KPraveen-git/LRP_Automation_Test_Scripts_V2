package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS082 extends Keywords{

	public void  Cost_Activity_Report_TS082(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		
		String tc_Name = "TC_Cost_Activity_Report_TS082";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String AgencyUser = data.get("AgencyUser");
		
		
		String cost_Inbox_Module = data.get("Cost_Inbox_Module");
		String Service_details_Codition = data.get("Service_details_Codition");
		String Arrival_Date_Condition = data.get("Arrival_Date_Condition");
		String Select_Predicatble_Sub_Activity_Name = data.get("Select_Predicatble_Sub_Activity_Name");
		String Un_Predictable_Vendor_Code = data.get("Un_Predictable_Vendor_Code");
		String car_Number = data.get("Car_Number");
		String globalSearchFilterOption = data.get("GlobalSearchFilterOption");
		String dropdownCondition = data.get("DropdownCondition");
		String vesselType_Cost_Inbox = data.get("VesselType_Cost_Inbox");
		String columnHeaders = data.get("ColumnHeaders");
		String Un_Predictable_Activate_Name = data.get("Un_Predictable_Activate_Name");
		String Type_Quantity = data.get("Type_Quantity");

		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		
		Step_Start(1, "Once login to the application and click on switch profile option and select for the required agency.", test, test1);
		
		SwitchProfile(driver, AgencyUser);

		Step_End(1, "Once login to the application and click on switch profile option and select for the required agency.", test, test1);

		moduleNavigate(driver, Cost_Activity_Report_Module);
		
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		
		waitForElement(driver, select_first);
		click(driver,select_first);
		selectByText(driver, select_first, globalSearchFilterOption);
		waitForElement(driver, globalSearch_Condition_Dropdown1);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, dropdownCondition);
		click(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, car_Number);
		click(driver, globalSearch_Frame_SearchButton);
		
		waitForElement(driver, retrieved_Value_Select);
		click(driver, retrieved_Value_Select);
		
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		
		waitForElement(driver, Arrival_Date_Input_CAR);
		String actual_Arr_Date=getAttribute(driver, Arrival_Date_Input_CAR, "value");
		System.out.println("actual_Arr_Date : "+actual_Arr_Date);
		
		Step_Start(9, "Click on the CAR close button.", test, test1);
		
		waitForElement(driver, car_Close_Button);
		click(driver, car_Close_Button);
		
		Step_End(9, "Click on the CAR close button.", test, test1);
		Step_Start(10, "Check whether the system shows the information message as 'CAR closed successfully'.", test, test1);

		waitForElement(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			String actualPopup=getText(driver, popup_Message);
			System.out.println("actualPopup : "+actualPopup);
			Extent_pass(driver, "actualPopup : "+actualPopup, test, test1);
			
			Step_Start(11, "Click on ok.", test, test1);
			click(driver, popup_Message_Ok_Button);
			Step_End(11, "Click on ok.", test, test1);

		}
		
		Step_End(10, "Check whether the system shows the information message as 'CAR closed successfully'.", test, test1);
		

		waitForDisplay(driver, Close_Current_tab);
		click(driver, Close_Current_tab);
		
		Step_Start(2, "Enter the screen name as 'Cost Inbox' in module search field.", test, test1);
		
		moduleNavigate(driver, cost_Inbox_Module);
		
		Step_End(2, "Enter the screen name as 'Cost Inbox' in module search field.", test, test1);
		Step_Start(3, "Select the required date in the Date field.", test, test1);

		waitForElement(driver, date_cost_Inbox);
		click(driver,date_cost_Inbox);
		
		selectDatePicker(driver, date_cost_Inbox, actual_Arr_Date);
		
		Step_End(3, "Select the required date in the Date field.", test, test1);
		Step_Start(4, "Click on the Show button.", test, test1);

		String select_VesselType=String.format(vessel_Type_CI, vesselType_Cost_Inbox);
		waitForElement(driver, select_VesselType);
		click(driver,select_VesselType);
		
		waitForElement(driver, show_Button_CI);
		click(driver,show_Button_CI);
		
		Step_End(4, "Click on the Show button.", test, test1);
		Step_Start(5, "Click on the Arrow mark which is available at Approved folder.", test, test1);
		
		waitForElement(driver, approved_Toggler_CI);
		click(driver,approved_Toggler_CI);
		
		Step_End(5, "Click on the Arrow mark which is available at Approved folder.", test, test1);
		Step_Start(6, "Click on the CAR node.", test, test1);

		waitForElement(driver, car_Tree_Item_CI);
		click(driver,car_Tree_Item_CI);
		
		Step_End(6, "Click on the CAR node.", test, test1);
		Step_Start(7, "System will show the Approved CAR's in the AG grid.", test, test1);

		waitForElement(driver, ag_Grid_ToolPanel_Button_CI);
		click(driver,ag_Grid_ToolPanel_Button_CI);
		
		
		waitForElement(driver, conditionFilter_AG_Grid_CI);
		click(driver,conditionFilter_AG_Grid_CI);
		
		Step_End(7, "System will show the Approved CAR's in the AG grid.", test, test1);
		Step_Start(8, "Select any open CAR based on the CAR status column which is available in the AG grid.", test, test1);

		waitForElement(driver, report_ID_Filter_CI);
		sendKeys(driver, report_ID_Filter_CI, car_Number);
		
		waitForElement(driver, columns_Button_CI);
		click(driver, columns_Button_CI);
		
		waitForElement(driver, column_All_Select_CheckBox);
		click(driver, column_All_Select_CheckBox);
		
		List<String> column_Headers=splitAndExpand(columnHeaders);
		for(int i=0;i<column_Headers.size();i++) {
		String column=column_Headers.get(i);
		click(driver, column_SearchBox);
		clear(driver, column_SearchBox);
		sendKeys(driver, column_SearchBox, column);
		String checkbox=String.format(column_CheckBox, column);
		click(driver, checkbox);
		
		}
		waitForElement(driver, columns_Button_CI);
		click(driver, columns_Button_CI);
		
		
		Step_Start(17, "Copy the Service, Vessel, Port, Terminal, Arrival date, voyage and bound informations.", test, test1);

		String portCode_Value=String.format(portCode_Gridcell_CI, car_Number);
		waitForElement(driver, portCode_Value);
		click(driver, portCode_Value);
		waitForElement(driver, portCode_Value);
		String actual_PortCode=getText(driver, portCode_Value);
		System.out.println("actual_PortCode : "+actual_PortCode);
		
		String serviceCode_Value=String.format(serviceCode_Gridcell_CI, car_Number);
		waitForElement(driver, serviceCode_Value);
		String actual_ServiceCode=getText(driver, serviceCode_Value);
		System.out.println("actual_ServiceCode : "+actual_ServiceCode);
		
		String vesselCode_Value=String.format(vesselCode_Gridcell_CI, car_Number);
		waitForElement(driver, vesselCode_Value);
		String actual_VesselCode=getText(driver, vesselCode_Value);
		System.out.println("actual_VesselCode : "+actual_VesselCode);
		
		String terminalCode_Value=String.format(terminalCode_Gridcell_CI, car_Number);
		waitForElement(driver, terminalCode_Value);
		String actual_terminalCode=getText(driver, terminalCode_Value);
		System.out.println("actual_terminalCode : "+actual_terminalCode);
		
		String contractType_Value=String.format(contractType_Gridcell_CI, car_Number);
		waitForElement(driver, contractType_Value);
		String actual_ContractType=getText(driver, contractType_Value);
		System.out.println("actual_ContractType : "+actual_ContractType);
		
		String mode_Value=String.format(mode_Gridcell_CI, car_Number);
		waitForElement(driver, mode_Value);
		String actual_Mode=getText(driver, mode_Value);
		System.out.println("actual_Mode : "+actual_Mode);
		
		String arraivalDate_Value=String.format(arrivalDate_Gridcell_CI, car_Number);
		waitForElement(driver, arraivalDate_Value);
		String actual_ArrivalDate=getText(driver, arraivalDate_Value);
		System.out.println("actual_ArrivalDate : "+actual_ArrivalDate);
		
		String carStatus_Value=String.format(carStatus_Gridcell_CI, car_Number);
		waitForElement(driver, carStatus_Value);
		String actual_CarStatus=getText(driver, carStatus_Value);
		System.out.println("actual_CarStatus : "+actual_CarStatus);
		
		 DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        
	        // Parse the input string to a LocalDate
	        LocalDate date = LocalDate.parse(actual_ArrivalDate, inputFormatter);
	        
	        // Define the desired output format
	        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        
	        // Format the LocalDate object
	        String act_ArrDate = date.format(outputFormatter);
	
	        System.out.println("act_ArrDate : "+act_ArrDate);
	        
	        
			Step_End(17, "Copy the Service, Vessel, Port, Terminal, Arrival date, voyage and bound informations.", test, test1);

			Step_End(8, "Select any open CAR based on the CAR status column which is available in the AG grid.", test, test1);

			Step_Start(13, "Click on the 'Enable Supplementary' option.", test, test1);

			waitForElement(driver, enable_Supplementary_Button_CI);
		click(driver, enable_Supplementary_Button_CI);

		Step_End(13, "Click on the 'Enable Supplementary' option.", test, test1);
		Step_Start(14, "Check whether the system shows an information message as 'Supplementary CAR is enabled successfully'.", test, test1);

		waitForElement(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			String actualPopup=getText(driver, popup_Message);
			System.out.println("actualPopup : "+actualPopup);
			Extent_pass(driver, "actualPopup : "+actualPopup, test, test1);
		}
		
		Step_End(14, "Check whether the system shows an information message as 'Supplementary CAR is enabled successfully'.", test, test1);
		Step_Start(15, "Click on ok.", test, test1);
		
		click(driver, popup_Message_Ok_Button);

		Step_End(15, "Click on ok.", test, test1);

		Step_Start(16, "Check the Enable supplementary checkbox should be selected(True) for that row.", test, test1);
		
		waitForElement(driver, enable_Supplementary_Button_CI);

		Step_End(16, "Check the Enable supplementary checkbox should be selected(True) for that row.", test, test1);

		Step_Start(18, "Enter the screen name as 'Cost Activity report' in module search field.", test, test1);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(18, "Enter the screen name as 'Cost Activity report' in module search field.", test, test1);

		Step_Start(12, "Then confirm the CAR status is changed as 'CLOSED' for that row.", test, test1);

		
		waitForElement(driver, Contract_Type_Input_CAR);
		
		Step_End(12, "Then confirm the CAR status is changed as 'CLOSED' for that row.", test, test1);
		Step_Start(19, "Select the required contract type and mode.", test, test1);
		
		click(driver,Contract_Type_Input_CAR);


		String SelectContract=String.format(Select_Contract_Type_CAR, actual_ContractType);
		waitForElement(driver, SelectContract);
		click(driver,SelectContract);
		
		waitForElement(driver, Mode_Select_Input_CAR);
		click(driver,Mode_Select_Input_CAR);
		
		String SelectModeValue=String.format(Select_Mode_type_CAR, actual_Mode);
		waitForElement(driver, SelectModeValue);
		click(driver,SelectModeValue);
		
		Step_End(19, "Select the required contract type and mode.", test, test1);
		Step_Start(20, "Paste the Service, Vessel, Port, Terminal, Arrival date, voyage and bound informations.", test, test1);

		waitForElement(driver, Service_Search_Btn_CAR);
		click(driver,Service_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, actual_ServiceCode);

		waitForElement(driver, Vessel_Search_Btn_CAR);
		click(driver,Vessel_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, actual_VesselCode);
		
		waitForElement(driver, Port_Search_Btn_CAR);
		click(driver,Port_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, actual_PortCode);
		
		waitForElement(driver, Terminal_Search_Btn_CAR);
		click(driver,Terminal_Search_Btn_CAR);
		selectValue(driver, Service_details_Codition, actual_terminalCode);
		
		waitForElement(driver, Arrival_Date_Search_Btn_CAR);
		click(driver,Arrival_Date_Search_Btn_CAR);
		selectValue1(driver, Arrival_Date_Condition, act_ArrDate);
		
		Step_End(20, "Paste the Service, Vessel, Port, Terminal, Arrival date, voyage and bound informations.", test, test1);
		Step_Start(21, "Click on Show button.", test, test1);

		waitForElement(driver, Show_Button_CAR);
		click(driver,Show_Button_CAR);
		
		Step_End(21, "Click on Show button.", test, test1);
		Step_Start(22, "System shows a confirmation message as 'CAR is closed for this Carrier/Vessel/Voyage. Do you want to create a Supplementary CAR?'.", test, test1);

		waitForElement(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			String actualPopup=getText(driver, popup_Message);
			System.out.println("actualPopup : "+actualPopup);
			Extent_pass(driver, "actualPopup : "+actualPopup, test, test1);
		}
		
		Step_End(22, "System shows a confirmation message as 'CAR is closed for this Carrier/Vessel/Voyage. Do you want to create a Supplementary CAR?'.", test, test1);

		Step_Start(23, "Click on 'Yes'.", test, test1);
		
		click(driver, popup_Message_Yes_Button);

		Step_End(23, "Click on 'Yes'.", test, test1);
		Step_Start(24, "Click on the Predictable reporting tab and select the required activities.", test, test1);

		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		
		
		
		String PredictableActivity_Column=String.format(Predictable_Activity_Column_CAR, Select_Predicatble_Sub_Activity_Name);
		waitForElement(driver, PredictableActivity_Column);
		click(driver,PredictableActivity_Column);
		
		Step_End(24, "Click on the Predictable reporting tab and select the required activities.", test, test1);
		Step_Start(25, "Click on the Unpredictable reporting tab and select the required activities and enter the quantities for those activities.", test, test1);

		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver,UnPredictable_Tab_CAR);
		waitForElement(driver, UnPredictable_Table_CAR);
		
		waitForElement(driver, More_Grid_UnPredictable_CAR);
		click(driver,More_Grid_UnPredictable_CAR);
		
		waitForElement(driver, Condition_UnPredictable_CAR);
		click(driver,Condition_UnPredictable_CAR);

		waitForElement(driver, Activity_Name_CAR);
		sendKeys(driver, Activity_Name_CAR, Un_Predictable_Activate_Name);
		
		waitForElement(driver, Vendor_Code_Input_CAR);
		sendKeys(driver, Vendor_Code_Input_CAR, Un_Predictable_Vendor_Code);

		waitForElement(driver, Quantity_Column_CAR);
		doubleClick(driver,Quantity_Column_CAR);
		waitForElement(driver, quantity_Input_CAR);
		sendKeys(driver, quantity_Input_CAR, Type_Quantity);
		enter(driver);
		
		Step_End(25, "Click on the Unpredictable reporting tab and select the required activities and enter the quantities for those activities.", test, test1);
		Step_Start(26, "Click on the Tool bar save button.", test, test1);

		scrollTop(driver);
		waitForElement(driver, SaveButton_ToolBar);
		click(driver, SaveButton_ToolBar);
		
		Step_End(26, "Click on the Tool bar save button.", test, test1);
		Step_Start(27, "Check whether the system shows an information message as 'Container Activity Report Saved'.", test, test1);

		waitForElement(driver, popup_Message);
		if(isdisplayed(driver, popup_Message)) {
			String actualPopup=getText(driver, popup_Message);
			System.out.println("actualPopup : "+actualPopup);
		}
		Step_End(27, "Check whether the system shows an information message as 'Container Activity Report Saved'.", test, test1);
		Step_Start(28, "Click on ok.", test, test1);
		
		click(driver, popup_Message_Ok_Button);

		Step_End(28, "Click on ok.", test, test1);
		
		
		Extent_completed(tc_Name, test, test1);
	}
	
	
}
