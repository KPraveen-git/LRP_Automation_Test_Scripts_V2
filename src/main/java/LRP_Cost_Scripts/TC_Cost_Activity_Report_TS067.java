package Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS067 extends Keywords {

	public void Cost_Activity_Report_TS067(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS067";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		
		String AgencyUser = data.get("AgencyUser");
		String Select_Contract_type_Value = data.get("Select_Contract_type_Value");
		String Select_Mode_type = data.get("Select_Mode_type");
		String Service_Code = data.get("Service_Code");
		String Vessel_Code = data.get("Vessel_Code");
		String Port_Code = data.get("Port_Code");
		String Terminal_Code = data.get("Terminal_Code");
		String Service_details_Codition = data.get("Service_details_Codition");
		String Arrival_Date_Condition = data.get("Arrival_Date_Condition");
		String Arrival_Date_Value = data.get("Arrival_Date_Value");
	
		String Table_Headers_Filter = data.get("Table_Headers_Filter");
		String Activity_Name_Value = data.get("Activity_Name_Value");
		String Contract_Number_value = data.get("Contract_Number_value");
		String Apply_Variable_Value = data.get("Apply_Variable_Value");
		String Enter_Quantity_value = data.get("Enter_Quantity_value");
		
		String Vessel_Module_navigate = data.get("Vessel_Module_navigate");

		String Service_Header = data.get("Service_Header");
		String Vessel_Header = data.get("Vessel_Header");
		String Port_Header = data.get("Port_Header");
		String Terminal_Header = data.get("Terminal_Header");
		String Arrival_Date_Header = data.get("Arrival_Date_Header");
		
		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		Step_Start(1, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		verifyMainMenu(driver);
		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);

		Step_Start(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);
		
		waitForElement(driver, Contract_Type_Input_CAR);
		click(driver,Contract_Type_Input_CAR);
		
		String SelectContract=String.format(Select_Contract_Type_CAR, Select_Contract_type_Value);
		waitForElement(driver, SelectContract);
		click(driver,SelectContract);
		
		waitForElement(driver, Mode_Select_Input_CAR);
		click(driver,Mode_Select_Input_CAR);
		
		String SelectModeValue=String.format(Select_Mode_type_CAR, Select_Mode_type);
		waitForElement(driver, SelectModeValue);
		click(driver,SelectModeValue);
		
		Step_Start(3, "Click on the Service search button and select the required service code.", test, test1);
		waitForElement(driver, Service_Search_Btn_CAR);
		click(driver,Service_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Service_Header,Service_details_Codition,Service_Code);
		Step_End(3, "Click on the Service search button and select the required service code.", test, test1);
		
		Step_Start(4, "Click on the Vessel search button and select the required vessel code.", test, test1);
		waitForElement(driver, Vessel_Search_Btn_CAR);
		click(driver,Vessel_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Vessel_Header,Service_details_Codition,Vessel_Code);
		Step_End(4, "Click on the Vessel search button and select the required vessel code.", test, test1);
		
		Step_Start(5, "Click on the Port search button and select the required port code.", test, test1);
		waitForElement(driver, Port_Search_Btn_CAR);
		click(driver,Port_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Port_Header,Service_details_Codition,Port_Code);
		Step_End(5, "Click on the Port search button and select the required port code.", test, test1);
		
		Step_Start(6, "Click on the Terminal search button and select the required terminal code.", test, test1);
		waitForElement(driver, Terminal_Search_Btn_CAR);
		click(driver,Terminal_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Terminal_Header,Service_details_Codition,Terminal_Code);
		Step_End(6, "Click on the Terminal search button and select the required terminal code.", test, test1);
		
		Step_Start(7, "Click on the Arrival date search button and select the required date. ", test, test1);
		waitForElement(driver, Arrival_Date_Search_Btn_CAR);
		click(driver,Arrival_Date_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Arrival_Date_Header,Arrival_Date_Condition,Arrival_Date_Value);
		Step_End(7, "Click on the Arrival date search button and select the required date. ", test, test1);
		
		Step_Start(8, "Click on the Show button. ", test, test1);
		waitForElement(driver, Show_Button_CAR);
		click(driver,Show_Button_CAR);
		Step_End(8, "Click on the Show button. ", test, test1);
		
		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver,UnPredictable_Tab_CAR);
		waitForElement(driver, UnPredictable_Table_CAR);
	
		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		waitForElement(driver, Column_Search_Input);
		jsClick(driver, SelectAll_Column_CheckBox);
		if(isdisplayed(driver, UnPredict_Activity_GridCell_CAR)) {
			jsClick(driver, SelectAll_Column_CheckBox);
		}
		
		List<String> Unpredictable_Headers=splitAndExpand(Table_Headers_Filter);
		for(String FilterHeader : Unpredictable_Headers) {
			waitForElement(driver, Column_Search_Input);
			clear(driver, Column_Search_Input);
			waitForElement(driver, Column_Search_Input);
			sendKeys(driver, Column_Search_Input,FilterHeader);
		
			String checkbox=String.format(Select_Column_CAR,FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		
		jsClick(driver, Column_SelectMenu);
		
		waitForElement(driver, More_Grid_UnPredictable_CAR);
		click(driver,More_Grid_UnPredictable_CAR);
		
		waitForElement(driver, Condition_UnPredictable_CAR);
		click(driver,Condition_UnPredictable_CAR);
		
		waitForElement(driver, UnPredictable_Table_CAR);
		
		waitForElement(driver, Activity_Name_CAR);
		sendKeys(driver, Activity_Name_CAR, Activity_Name_Value);
		
		waitForElement(driver, ContractNo_Filter_Input_CAR);
		sendKeys(driver, ContractNo_Filter_Input_CAR, Contract_Number_value);
		
		waitForElement(driver, Formula_Column_CAR);
		String Formula_Value=getText(driver, Formula_Column_CAR);
		
		waitForElement(driver, Quantity_Column_CAR);
		doubleClick(driver, Quantity_Column_CAR);
		waitForElement(driver, Quantity_Input_CAR);
		clear(driver,Quantity_Input_CAR);
		sendKeys(driver, Quantity_Input_CAR, Enter_Quantity_value);
		waitForElement(driver, Formula_Column_CAR);
		click(driver,Formula_Column_CAR);
		double quantity_Amount=0;
		
		if (!Formula_Value.isEmpty()) {
			
			String varibaleNameFormula=extractVariableName(Formula_Value);
			String formulavalue = evaluateExpression(Formula_Value, Apply_Variable_Value);
			System.out.println("formulavalue : "+formulavalue);
			String SelectColumn=String.format(Select_Table_Row_CAR,Activity_Name_Value);
			
			waitForDisplay(driver, IsPredictable_Check_CAR);
			String predictableCheck=getAttribute1(driver, IsPredictable_Check_CAR, "aria-label");
			if(!predictableCheck.equals("checked")) {
				if(Select_Contract_type_Value.equalsIgnoreCase("PTC")) {
					quantity_Amount=Double.parseDouble("1");
				}else {
					quantity_Amount=Double.parseDouble(Enter_Quantity_value);
				}
				
				waitForElement(driver, Value_Input_Column_CAR);
				doubleClick(driver, Value_Input_Column_CAR);
				clear(driver,Value_Input_CAR);
				waitForElement(driver, Value_Input_CAR);
				System.out.println("Apply_Variable_Value : "+Apply_Variable_Value);
				sendKeys(driver, Value_Input_CAR, Apply_Variable_Value);
				
				waitForElement(driver, Apply_Button_CAR);
				click(driver, Apply_Button_CAR);
				
				waitForDisplay(driver, SelectColumn);
				jsClick(driver, SelectColumn);

				double result1 =getNumberValue(formulavalue) ;
				double resultExpected=result1*quantity_Amount;

				String SelectTotalCostColumn=String.format(Total_Cost_Column_CAR,Activity_Name_Value);
				waitForElement(driver, SelectTotalCostColumn);
				String total_Cost_act=getText(driver, SelectTotalCostColumn);
				double total_Cost_value_Act=getNumberValue(total_Cost_act);
				
				if(resultExpected==total_Cost_value_Act) {
					System.out.println("Total Cost Value Matched ||  Expected : "+resultExpected+" ||  Actual  : "+total_Cost_value_Act);
					Extent_pass(driver, "Total Cost Value Matched ||  Expected : "+resultExpected+" ||  Actual  : "+total_Cost_value_Act, test, test1);
				}else {
					System.out.println("Total Cost Value Not Matched ||  Expected : "+resultExpected+" ||  Actual  : "+total_Cost_value_Act);
					Extent_fail(driver, "Total Cost Value Not Matched ||  Expected : "+resultExpected+" ||  Actual  : "+total_Cost_value_Act, test, test1);
				}
				
			}else {
				
				moduleNavigate(driver, Vessel_Module_navigate);
				
				waitForElement(driver, Vessel_Code_Filter_Input_VSL);
				click(driver,Vessel_Code_Filter_Input_VSL);
				sendKeys(driver, Vessel_Code_Filter_Input_VSL, Vessel_Code);
				
				waitForElement(driver, Vessel_Code_Action_button_VSL);
				click(driver,Vessel_Code_Action_button_VSL);
				
				String varible_Element=String.format(Get_Varibale_Value_VSL,varibaleNameFormula);
				waitForElement(driver, varible_Element);
				String Variable_text_value=getAttribute(driver, varible_Element, "value");
				
				String formulavalue1 = evaluateExpression(Formula_Value, Variable_text_value);
				double result1 =getNumberValue(formulavalue1) ;
				quantity_Amount=Double.parseDouble(Enter_Quantity_value);
				double resultExpected=result1*quantity_Amount;
				
				scrollTop(driver);
				waitForElement(driver, Close_Current_tab);
				click(driver,Close_Current_tab);
				
				String SelectTotalCostColumn=String.format(Total_Cost_Column_CAR,Activity_Name_Value);
				waitForElement(driver, SelectTotalCostColumn);
				String total_Cost_act=getText(driver, SelectTotalCostColumn);
				double total_Cost_value_Act=getNumberValue(total_Cost_act);
				
				if(resultExpected==total_Cost_value_Act) {
					System.out.println("Total Cost Value Matched ||  Expected : "+resultExpected+" ||  Actual  : "+total_Cost_value_Act);
					Extent_pass(driver, "Total Cost Value Matched ||  Expected : "+resultExpected+" ||  Actual  : "+total_Cost_value_Act, test, test1);
				}else {
					System.out.println("Total Cost Value Not Matched ||  Expected : "+resultExpected+" ||  Actual  : "+total_Cost_value_Act);
					Extent_fail(driver, "Total Cost Value Not Matched ||  Expected : "+resultExpected+" ||  Actual  : "+total_Cost_value_Act, test, test1);
				}
			}
			
		}else {
			System.out.println("Formula is not present for the Given Input Activity ");
			Extent_FailNew(driver, "Formula is not present for the Given Input Activity ", test, test1);
		}
		

		Extent_completed(tc_Name, test, test1);

	}

}
