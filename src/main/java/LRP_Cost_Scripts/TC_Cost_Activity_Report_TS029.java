package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS029 extends Keywords{

	public void Cost_Activity_Report_TS029(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS029";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");


		String Draf = data.get("Draft_option");
		String Header = data.get("Column_Header");
		String Submitted = data.get("Submitted");
		String Approved_Val = data.get("Approved_val");
		String Rejected = data.get("Rejected_val");
		String PartlyApproved = data.get("Partly_Approved");
		String AgencyUser =data.get("AgencyUser");
		String CAR_Retrieve_Type1 = data.get("CAR_Retrieve_Type1");
		String CAR_Retrieve_Condition1 = data.get("CAR_Retrieve_Condition1");
		String CAR_Number_Retrieve_Value1 = data.get("CAR_Number_Retrieve_Value1");
		String CAR_Retrieve_Type2 = data.get("CAR_Retrieve_Type2");
		String CAR_Number_Retrieve_Value2 = data.get("CAR_Number_Retrieve_Value2");
		String CAR_Retrieve_Type3 = data.get("CAR_Retrieve_Type3");
		String CAR_Number_Retrieve_Value3 = data.get("CAR_Number_Retrieve_Value3");
		 
		
		
		
		Extent_Start(tc_Name, test, test1);

		Step_Start(1,"Once login to the application and click on switch profile option and select the required agency.",test, test1);

		navigateUrl(driver, url);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency",
				test, test1);

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

		waitForElement(driver, CAR_Expense_Status);
		String Status_values = getText(driver, CAR_Expense_Status);
		System.out.println("Status_values :" + Status_values);

		
		
		Step_Start(9, "Click on the Expense report button and check system opens a new tab", test, test1);

		waitForElement(driver, ExpenseReport);
		click(driver, ExpenseReport);

		waitForElement(driver, expensereportpage);
		if (isdisplayed(driver, expensereportpage)) {

			System.out.println(
					"Click on the Expense Report, and it will navigate to the Expense Report screen successfully");
			Extent_pass(driver,
					"Click on the Expense Report, and it will navigate to the Expense Report screen successfully", test,
					test1);
		} else {

			System.out.println(
					"Click on the Expense Report, and it will navigate to the Expense Report screen successfully");
			Extent_fail(driver,
					"Click on the Expense Report, and it will navigate to the Expense Report screen not Display successfully",
					test, test1);
		}

		Step_End(9, "Click on the Expense report button and check system opens a new tab", test, test1);

		waitForElement(driver, Open_Expenses_Column);
		click(driver, Open_Expenses_Column);

		waitForElement(driver, Open_Expe_SelectAll_Checkbox);
		click(driver, Open_Expe_SelectAll_Checkbox);

		List<String> column_Headers = splitAndExpand(Header);
		for (int i = 0; i < column_Headers.size(); i++) {
			String column = column_Headers.get(i);
			click(driver, Open_Expense_column_Searchbox);
			clear(driver, Open_Expense_column_Searchbox);
			sendKeys(driver, Open_Expense_column_Searchbox, column);

			String checkbox = String.format(Open_Expense_Colum_CheckBox, column);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		waitForElement(driver, Open_Expenses_Column);
		click(driver, Open_Expenses_Column);
			
		
		
		
		waitForElement(driver, Open_TAble_record);
		String  total =getText(driver, Open_TAble_record);
		
		
	     int Total_Records = Integer.parseInt(total);
	     
	 	waitForElement(driver, Open_Table);
		List<Map<String, String>> open_expenser = extractTableDataByRowIndex(driver, Open_Table, Total_Records);
		
		 List<String> OpenExpenses_status_value = getColumnValues(open_expenser,Header );
			System.out.println("OpenExpenses_status_value :"+OpenExpenses_status_value);
		
		waitForElement(driver, ApprovedExpenses);
		click(driver, ApprovedExpenses);
		
		
		waitForElement(driver, Column);
			click(driver, Column);
			
			waitForElement(driver, column_All_Select_Checkbox);
			click(driver, column_All_Select_Checkbox);
			
			List<String> column_Headers_val=splitAndExpand(Header);
			for(int i=0;i<column_Headers_val.size();i++) {
			String column=column_Headers_val.get(i);
			click(driver, column_Searchbox);
			clear(driver, column_Searchbox);
			sendKeys(driver, column_Searchbox, column);
			
			String checkbox=String.format(column_Checkboxs1, column);
			click(driver, checkbox);
			}
			waitForElement(driver, Column);
			click(driver, Column);
		
		

		waitForElement(driver, Approved_Total);
		String  Exp_total =getText(driver, Approved_Total);
		
	    int Total_Records1 = Integer.parseInt(Exp_total);
	    
	    waitForElement(driver, Approved_table);
		List<Map<String, String>> Approved_expenser = extractTableDataByRowIndex(driver, Approved_table, Total_Records1);
		
		 List<String> ApprovedExpenses_status_value = getColumnValues(Approved_expenser,Header );
		
		System.out.println("ApprovedExpenses_status_value :"+ApprovedExpenses_status_value);
		boolean Draft = false;
		boolean submited = false;
		boolean rejected = false;
		boolean approved = false;
		boolean partially_approved = false;
			
		if(!OpenExpenses_status_value.isEmpty()) {
			if(OpenExpenses_status_value.contains("Draft")) {
				Draft = true;
			}else if(OpenExpenses_status_value.contains("Submitted")) {
				submited = true;
			}else {
				rejected = true;
			}
		}
		if(!ApprovedExpenses_status_value.isEmpty()) {
			if(!OpenExpenses_status_value.isEmpty()&&rejected) {
				rejected = false;
				partially_approved = true;
			}else {
				approved = true;
			}
		}
		if(Draft) {
			Step_Start(10, "If the activities are in draft status then ensure that the system shows the car expense status as Draft", test, test1);
			
			Step_Start(14, "If the some of the activities are  draft status and other activities are in approved status means,then ensure that the system shows the car expense status as Draft", test, test1);
			
			if (Draf.equals(Status_values)) {
				System.out.println("Matched exp value :" + Draf + "actual value :" + Status_values);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Draf+ " || Actual Report Activity is : " + Status_values, test, test1);
			} else {
				System.out.println("matched exp value :" + Draf + "actual value :" + Status_values);
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " +Draf+ " || Actual Report Activity is : " + Status_values, test, test1);
			}
				
			Step_End(10, "If the activities are in draft status then ensure that the system shows the car expense status as Draft", test, test1);	
			
			Step_End(14, "If the some of the activities are  draft status and other activities are in approved status means,then ensure that the system shows the car expense status as Draft", test, test1);
		}else if(submited) {
			
              Step_Start(11, "If the actvities are in submitted status then ensure that the system shows the car expense status as Submitted", test, test1);
			
              Step_Start(15, "If the some of the activities are  submitted status and other activities are in approved status means,then ensure that the system shows the car expense status as Submitted", test, test1);
  			
			  if (Submitted.equals(Status_values)) {
				System.out.println("Matched exp value :" + Submitted + "actual value :" + Status_values);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Submitted+ " || Actual Report Activity is : " + Status_values, test, test1);
			  } else {
				System.out.println("matched exp value :" + Submitted + "actual value :" + Status_values);
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " +Submitted+ " || Actual Report Activity is : " + Status_values, test, test1);
			  }
				
			Step_End(11, "If the actvities are in submitted status then ensure that the system shows the car expense status as Submitted", test, test1);		
			Step_End(15, "If the some of the activities are  submitted status and other activities are in approved status means,then ensure that the system shows the car expense status as Submitted", test, test1);
			
		}else if(rejected) {
			
			Step_Start(13, "If the activities are in rejected status then ensure that the system shows the car expense status as Rejected", test, test1);
			
			  if (Rejected.equals(Status_values)) {
				System.out.println("Matched exp value : " + Rejected + "actual value : " + Status_values);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Rejected+ " || Actual Report Activity is : " + Status_values, test, test1);
			  } else {
				System.out.println("matched exp value :" + Rejected + "actual value :" + Status_values);
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " +Rejected+ " || Actual Report Activity is : " + Status_values, test, test1);
			  }
				
			Step_End(13, "If the activities are in rejected status then ensure that the system shows the car expense status as Rejected", test, test1);		
			
			
			
		}else if(partially_approved) {
			
			Step_Start(16, "If the some of the activities are  rejected status and other activities are in approved status means,then ensure that the system shows the car expense status as Partially approved", test, test1);
			
			  if (PartlyApproved.equals(Status_values)) {
				System.out.println("Matched exp value :" + PartlyApproved + "actual value :" + Status_values);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + PartlyApproved+ " || Actual Report Activity is : " + Status_values, test, test1);
			  } else {
				System.out.println("matched exp value :" + PartlyApproved + "actual value :" + Status_values);
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " +PartlyApproved+ " || Actual Report Activity is : " + Status_values, test, test1);
			  }
				
			Step_End(16, "If the some of the activities are  rejected status and other activities are in approved status means,then ensure that the system shows the car expense status as Partially approved", test, test1);		
			
		}else if(approved){
			
			Step_Start(12, "If the activities are in approved status then ensure that the sytsem shows the car expense status as Approved", test, test1);
			
			  if (Approved_Val.equals(Status_values)) {
				System.out.println("Matched exp value :" + Approved_Val + "actual value :" + Status_values);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Approved_Val+ " || Actual Report Activity is : " + Status_values, test, test1);
			  } else {
				System.out.println("matched exp value :" + Approved_Val + "actual value :" + Status_values);
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " +Approved_Val+ " || Actual Report Activity is : " + Status_values, test, test1);
			  }
				
			Step_End(12, "If the activities are in approved status then ensure that the sytsem shows the car expense status as Approved", test, test1);		
			
			
		}else {
			
			Extent_fail(driver, "Not Matched || "+ Status_values, test, test1);
			
		}
		 Extent_completed(tc_Name, test, test1);		
		
}
	
}
