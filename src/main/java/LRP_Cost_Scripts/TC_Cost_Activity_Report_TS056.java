package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS056 extends Keywords {

	public void Cost_Activity_Report_TS056(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS056";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String Header_value = data.get("Header");
		String AgencyUser = data.get("AgencyUser");
		String Contract_No_Filter_Input = data.get("Contract_No_Filter_Input");
		String Activity_Code_Filter_Input = data.get("Activity_Code_Filter_Input");
		String Head = data.get("Head");
		String Qty_val = data.get("Qty_Input");
		String CAR_Retrieve_Type1 = data.get("CAR_Retrieve_Type1");
		String CAR_Retrieve_Condition1 = data.get("CAR_Retrieve_Condition1");
		String CAR_Number_Retrieve_Value1 = data.get("CAR_Number_Retrieve_Value1");
		String CAR_Retrieve_Type2 = data.get("CAR_Retrieve_Type2");
		String CAR_Number_Retrieve_Value2 = data.get("CAR_Number_Retrieve_Value2");
		String CAR_Retrieve_Type3 = data.get("CAR_Retrieve_Type3");
		String CAR_Number_Retrieve_Value3 = data.get("CAR_Number_Retrieve_Value3");
		
		

		String Activity_Report_Updated = data.get("Activity_Report_Updated");

		Extent_Start(tc_Name, test, test1);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select the required agency.",test, test1);

		navigateUrl(driver, url);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency",test, test1);

		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		LRP_Login(driver, username, password);

		SwitchProfile(driver, AgencyUser);

		Step_End(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		verifyMainMenu(driver);

		Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		waitForElement(driver, seach_Filed);
		click(driver, seach_Filed);

		Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);

		Step_Start(4, "Check whether it opens a new search window. ", test, test1);

		
		Step_Start(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
		Step_Start(6, "Then click on the search button", test, test1);
		Step_Start(7, "System will show the CAR No. and Click on the select button", test, test1);
		
		globalValueSearchWindow(driver,CAR_Retrieve_Condition1,CAR_Retrieve_Type1,CAR_Number_Retrieve_Value1,CAR_Retrieve_Type2,CAR_Number_Retrieve_Value2,CAR_Retrieve_Type3,CAR_Number_Retrieve_Value3);
		
		Step_End(4, "Check whether it opens a new search window. ", test, test1);
		Step_End(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
		Step_End(6, "Then click on the search button", test, test1);
		Step_End(7, "System will show the CAR No. and Click on the select button", test, test1);
		Step_Start(8, "System will retrieve the CAR", test, test1);



		waitForElement(driver, car_Number_val);
		waitForElement(driver, car_Number_val);
		String Carvalue = getAttribute(driver, car_Number_val, "value");

		System.out.println("Carvalue :" + Carvalue);

		Step_End(8, "System will retrieve the CAR", test, test1);

		Step_Start(9, "Click on the edit option", test, test1);

		waitForElement(driver, Car_Edit_Option);
		click(driver, Car_Edit_Option);

		Step_End(9, "Click on the edit option", test, test1);

		Step_Start(10, "Click the unpredictable reporting tab", test, test1);

		waitForElement(driver, Unpredictable_Reporting);
		click(driver, Unpredictable_Reporting);

		Step_End(10, "Click the unpredictable reporting tab", test, test1);

		Step_Start(11,
				"Select the required activity and change the quantity of that activity and ensure that cost also gets changed only if the activities",
				test, test1);

		waitForElement(driver, Unpredictable_Reporting_Column);
		click(driver, Unpredictable_Reporting_Column);

		waitForElement(driver, Unpredictable_Reporting_selecAllOption);
		click(driver, Unpredictable_Reporting_selecAllOption);

		List<String> column_Headers = splitAndExpand(Header_value);
		for (String FilterHeader : column_Headers) {
			waitForElement(driver, Column_Search_Input);
			clear(driver, Column_Search_Input);
			waitForElement(driver, Column_Search_Input);
			sendKeys(driver, Column_Search_Input, FilterHeader);

			String checkbox = String.format(Select_Column_CAR, FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		waitForElement(driver, Unpredictable_Reporting_Column);
		click(driver, Unpredictable_Reporting_Column);

		waitForElement(driver, Unpredictable_Reporting_Total_Recoed);
		click(driver, Unpredictable_Reporting_Total_Recoed);

		waitForElement(driver, Unpredictable_Reporting_Condition_Filter);
		click(driver, Unpredictable_Reporting_Condition_Filter);

		waitForElement(driver, Contract_No_Filter_Inputs);
		sendKeys(driver, Contract_No_Filter_Inputs, Contract_No_Filter_Input);

		waitForElement(driver, Activity_Code_Input);
		sendKeys(driver, Activity_Code_Input, Activity_Code_Filter_Input);

		horizontalscroll(driver, UnPredictable_scroll, 500);

		waitForElement(driver, Head_Filter_Input);
		sendKeys(driver, Head_Filter_Input, Head);

		horizontalscroll(driver, UnPredictable_scroll, -500);

		waitForElement(driver, Qty_Input_Val);
		doubleClick(driver, Qty_Input_Val);

		waitForElement(driver, Qty_Input_Field);
		sendKeys(driver, Qty_Input_Field, Qty_val);

		double QtyValueAsDouble = Double.parseDouble(Qty_val);
		System.out.println("Qty Value As Double :" + QtyValueAsDouble);

		waitForElement(driver, Charge_Rate);
		click(driver, Charge_Rate);

		waitForElement(driver, Charge_Rate);
		String Charge_value = getText(driver, Charge_Rate);
		System.out.println("Charge_value :" + Charge_value);

		double chargeValueAsDouble = Double.parseDouble(Charge_value);
		System.out.println("Charge as Double: " + chargeValueAsDouble);

		double totalValue = QtyValueAsDouble * chargeValueAsDouble;
		System.out.println("Total Value (Qty * Charge): " + totalValue);

		waitForElement(driver, Unpredictable_Save);
		click(driver, Unpredictable_Save);

		String save_value = getText(driver, popup_Message);
		System.out.println("save_value : " + save_value);

		if (Activity_Report_Updated.equals(save_value)) {

			System.out.println("matched exp value :" + Activity_Report_Updated + "actual value :" + save_value);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Activity_Report_Updated+ " || Actual Report Activity is : " + save_value, test, test1);
		} else {
			System.out.println("Not matched exp value :" + Activity_Report_Updated + "actual value :" + save_value);
			Extent_fail(driver, " NotMatched || " + " Expected Report Activity is : " + Activity_Report_Updated+ " || Actual Report Activity is : " + save_value, test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		waitForElement(driver, seach_Filed);
		click(driver, seach_Filed);

		globalValueSearchWindow(driver,CAR_Retrieve_Condition1,CAR_Retrieve_Type1,CAR_Number_Retrieve_Value1,CAR_Retrieve_Type2,CAR_Number_Retrieve_Value2,CAR_Retrieve_Type3,CAR_Number_Retrieve_Value3);
			
		
		waitForElement(driver, Car_Edit_Option);
		click(driver, Car_Edit_Option);

		waitForElement(driver, Unpredictable_Reporting);
		click(driver, Unpredictable_Reporting);

		waitForElement(driver, Unpredictable_Reporting_Column);
		click(driver, Unpredictable_Reporting_Column);

		waitForElement(driver, Unpredictable_Reporting_selecAllOption);
		click(driver, Unpredictable_Reporting_selecAllOption);

		List<String> column_Headers1 = splitAndExpand(Header_value);
		for (String FilterHeader : column_Headers1) {
			waitForElement(driver, Column_Search_Input);
			clear(driver, Column_Search_Input);
			waitForElement(driver, Column_Search_Input);
			sendKeys(driver, Column_Search_Input, FilterHeader);

			String checkbox = String.format(Select_Column_CAR, FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		waitForElement(driver, Unpredictable_Reporting_Column);
		click(driver, Unpredictable_Reporting_Column);

		waitForElement(driver, Total_cost_val);
		String TotalCost_value = getText(driver, Total_cost_val);
		System.out.println("TotalCost_value :" + TotalCost_value);

		double TotalCostchargeValueAsDouble = Double.parseDouble(TotalCost_value);
		System.out.println("TotalCost chargeValue As Double: " + TotalCostchargeValueAsDouble);

		if (totalValue == TotalCostchargeValueAsDouble) {
			System.out.println("Matched exp value : " + totalValue + "actual value : " + TotalCostchargeValueAsDouble);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + totalValue
					+ " || Actual Report Activity is : " + TotalCostchargeValueAsDouble, test, test1);
		} else {
			System.out
					.println("Not Matched exp value : " + totalValue + "actual value :" + TotalCostchargeValueAsDouble);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + totalValue
					+ " || Actual Report Activity is : " + TotalCostchargeValueAsDouble, test, test1);
		}

		Step_End(11,"Select the required activity and change the quantity of that activity and ensure that cost also gets changed only if the activities",
				test, test1);
		Extent_completed(tc_Name, test, test1);

	}
}