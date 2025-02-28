package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS058 extends Keywords {
	public void  Cost_Activity_Report_TS058(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
	
	String tc_Name = "TC_Cost_Activity_Report_TS058";
	String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
	String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
	String url = TestNgXml.getdatafromExecution().get(tc_Name);
	Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

	
	String username = data.get("Username");
	String password = data.get("Password");
	String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
	String Contains = data.get("Contains_val");
	String car_number = data.get("Car_No");
	String car_value = data.get("Car_Number");
	String Rejected_pop =data.get("Rejected_pop");
	String Header_value = data.get("Header_value");
	String AgencyUser =data.get("AgencyUser");
	
	
	Extent_Start(tc_Name, test, test1);

	Step_Start(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);

	navigateUrl(driver, url);

	Step_End(1, "Once login to the application and click on switch profile option and select the required agency", test, test1);
	
	Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);
	
	LRP_Login(driver, username, password);
	
	SwitchProfile(driver, AgencyUser);
	
	moduleNavigate(driver, Cost_Activity_Report_Module);
	
	Step_End(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);
	
	verifyMainMenu(driver);
	
	Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);
	
	
	waitForElement(driver, seach_Filed);
	click(driver, seach_Filed);
	
	Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);
	
	Step_Start(4, "Check whether it opens a new search window. ", test, test1);
	
	waitForElement(driver, Ventor_Global_Seach_First_Field);
	click(driver, Ventor_Global_Seach_First_Field);
	
	waitForElement(driver, Ventor_Global_Seach_First_Field);
	selectByText(driver, Ventor_Global_Seach_First_Field, car_number);
	
	waitForElement(driver, Condition_field);
	selectByText(driver, Condition_field, Contains);
	
	Step_End(4, "Check whether it opens a new search window. ", test, test1);
	
	Step_Start(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
	
	waitForElement(driver, Global_Input_Filed);
	sendKeys(driver, Global_Input_Filed, car_value);
	
	Step_End(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
	
	Step_Start(6, "Then click on the search button", test, test1);
	
	waitForElement(driver, Search_button);
	click(driver, Search_button);
	
	Step_End(6, "Then click on the search button", test, test1);
	
	Step_Start(7, "System will show the CAR No. and Click on the select button", test, test1);
	
	waitForElement(driver, column_Values);
	click(driver, column_Values);
	
	waitForElement(driver, Select_Option);
	click(driver, Select_Option);
	
	Step_End(7, "System will show the CAR No. and Click on the select button", test, test1);
	
	Step_Start(8, "System will retrieve the CAR", test, test1);
	
	waitForElement(driver, car_Number_val);
	String Carvalue =getAttribute(driver, car_Number_val, "value");
	
	System.out.println("Carvalue :"+Carvalue);
	
	 if(car_value.equals(Carvalue)) {
		  System.out.println("Matched exp value :"+car_value +"actual value :"+Carvalue);
		  Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + car_value + " || Actual Report Activity is : " + Carvalue, test,test1);
	 }else {
		  System.out.println("Not matched exp value :"+car_value +"actual value :"+Carvalue);
		  Extent_fail(driver, "Matched || " + " Expected Report Activity is : " + car_value + " || Actual Report Activity is : " + Carvalue, test,test1);
	 }
	
	 Step_End(8, "System will retrieve the CAR", test, test1);	
	 
	 Step_Start(9, "Select the activities from the grid and click on the reject option", test, test1); 
	 
	
	 waitForElement(driver, Reject_colum);
	 click(driver, Reject_colum);
	 
	 waitForElement(driver, Reject_SelectAll);
	 click(driver, Reject_SelectAll);
	 
	 List<String> column_Headers = splitAndExpand(Header_value);
		for (int i = 0; i < column_Headers.size(); i++) {
			String column = column_Headers.get(i);
			click(driver, Reject_Input_Field);
			clear(driver, Reject_Input_Field);
			sendKeys(driver, Reject_Input_Field, column);

			String checkbox = String.format(Reject_FirstOption, column);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		
		 waitForElement(driver, Show_Row_Value);
		 click(driver, Show_Row_Value);
		 
		
		  waitForElement(driver, miss_Rejec);
		  click(driver, miss_Rejec); 
		  
		  Step_End(9, "Select the activities from the grid and click on the reject option", test, test1);
			 
		  Step_Start(10, "If the activities are invoiced and disbursement in taken, system validates as  Invoiced activity cannot be rejected", test, test1); 
	
			 waitForElement(driver, popup_Message);
			 String reject_pop =getText(driver, popup_Message);
			 System.out.println("reject_pop :"+reject_pop);
			 
			 if(Rejected_pop.equals(reject_pop)) {
				 
				  System.out.println("Matched exp value :"+reject_pop +"actual value :"+Rejected_pop);
				  Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + reject_pop + " || Actual Report Activity is : " + Rejected_pop, test,test1); 
				 
			 }else {
				 
				 System.out.println("Not Matched exp value :"+reject_pop +"actual value :"+Rejected_pop);
				 Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + reject_pop + " || Actual Report Activity is : " + Rejected_pop, test,test1); 
			 }
			 
			 Step_End(10, "If the activities are invoiced and disbursement in taken, system validates as  Invoiced activity cannot be rejected", test, test1); 
			  
			 Step_Start(11, "Click on the ok option", test, test1); 
			 
			 waitForElement(driver, popup_Message_Ok_Button);
			 click(driver, popup_Message_Ok_Button); 
			 
			 Step_End(11, "Click on the ok option", test, test1); 	 
			
			 Extent_completed(tc_Name, test, test1);
	
	}
}
