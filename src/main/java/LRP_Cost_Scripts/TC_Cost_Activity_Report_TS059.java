package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS059 extends Keywords{
   
	public void  Cost_Activity_Report_TS059(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS059";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String Submitted_Approved_pop = data.get("Submitted_Approved_pop");
		String Activity_Rejected_Popup = data.get("Activity_Rejected_Popup");
		String Header_value = data.get("Header_value");
		String AgencyUser =data.get("AgencyUser");
		String CAR_Retrieve_Type1 = data.get("CAR_Retrieve_Type1");
		String CAR_Retrieve_Condition1 = data.get("CAR_Retrieve_Condition1");
		String CAR_Number_Retrieve_Value1 = data.get("CAR_Number_Retrieve_Value1");
		String CAR_Retrieve_Type2 = data.get("CAR_Retrieve_Type2");
		String CAR_Number_Retrieve_Value2 = data.get("CAR_Number_Retrieve_Value2");
		String CAR_Retrieve_Type3 = data.get("CAR_Retrieve_Type3");
		String CAR_Number_Retrieve_Value3 = data.get("CAR_Number_Retrieve_Value3");
		
		
		
		Extent_Start(tc_Name, test, test1);

		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);

		navigateUrl(driver, url);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency", test, test1);
		
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
		String Carvalue =getAttribute(driver, car_Number_val, "value");
		
		System.out.println("Carvalue :"+Carvalue);
		
		
		 Step_End(8, "System will retrieve the CAR", test, test1);	
		 
		 Step_Start(9, "Select the activities from the grid and click on the reject option", test, test1); 
		 
		 Step_Start(10, "If the activities are in draft status, System validates as Activities are rejected. Click on the ok option", test, test1); 	 	 
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
			
			 Step_End(9, "Select the activities from the grid and click on the reject option", test, test1);
			 
			
			if(isdisplayed(driver, Rejected_Draft)) {
				 
				waitForElement(driver, Rejected_Draft);
				click(driver,Rejected_Draft);
				
				waitForElement(driver, miss_Rejec);
				click(driver, miss_Rejec); 
				
				 waitForElement(driver, popup_Message);
				 String reject_pop =getText(driver, popup_Message);
				 System.out.println("reject_pop :"+reject_pop);
				 
				 if(Submitted_Approved_pop.equals(reject_pop)) {
					 
					  System.out.println("Matched exp value :"+Submitted_Approved_pop +"actual value :"+reject_pop);
					  Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Submitted_Approved_pop + " || Actual Report Activity is : " + reject_pop, test,test1); 
					 
				 }else {
					 
					 System.out.println("Not Matched exp value :"+Submitted_Approved_pop +"actual value :"+reject_pop);
					 Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Submitted_Approved_pop + " || Actual Report Activity is : " + reject_pop, test,test1); 
				 }
				 

				 waitForElement(driver, popup_Message_Ok_Button);
				 click(driver, popup_Message_Ok_Button); 
				 
				 waitForElement(driver, Reject_colum);
				 click(driver, Reject_colum);
				 
				 waitForElement(driver, Reject_SelectAll);
				 click(driver, Reject_SelectAll);
				 
				 List<String> column_Headers1 = splitAndExpand(Header_value);
					for (int i = 0; i < column_Headers1.size(); i++) {
						String column = column_Headers1.get(i);
						click(driver, Reject_Input_Field);
						clear(driver, Reject_Input_Field);
						sendKeys(driver, Reject_Input_Field, column);

						String checkbox = String.format(Reject_FirstOption, column);
						waitForDisplay(driver, checkbox);
						jsClick(driver, checkbox);
					}  
			 }
		Step_End(10, "If the activities are in draft status, System validates as Activities are rejected. Click on the ok option", test, test1); 	 	 		
			
			
		Step_Start(11, ".If the activities are in submitted or approved status, System validates as   Activities are rejected Click on the ok option", test, test1); 	
		 
            if(isdisplayed(driver, Rejected_Submitted)) {
			 
            	waitForElement(driver, Rejected_Submitted);
				click(driver,Rejected_Submitted);
				
				waitForElement(driver, miss_Rejec);
				click(driver, miss_Rejec); 
            	
			 waitForElement(driver, popup_Message);
			 String reject_pop =getText(driver, popup_Message);
			 System.out.println("reject_pop :"+reject_pop);
			 
			 if(Activity_Rejected_Popup.equals(reject_pop)) {
				 
				  System.out.println("Matched exp value :"+reject_pop +"actual value :"+Activity_Rejected_Popup);
				  Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + reject_pop + " || Actual Report Activity is : " + Activity_Rejected_Popup, test,test1); 
				 
			 }else {
				 
				 System.out.println("Not Matched exp value :"+reject_pop +"actual value :"+Activity_Rejected_Popup);
				 Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + reject_pop + " || Actual Report Activity is : " + Activity_Rejected_Popup, test,test1); 
			 }
			 

			 waitForElement(driver, popup_Message_Ok_Button);
			 click(driver, popup_Message_Ok_Button); 
			 
			 waitForElement(driver, Reject_colum);
			 click(driver, Reject_colum);
			 
			 waitForElement(driver, Reject_SelectAll);
			 click(driver, Reject_SelectAll);
			 
			 List<String> column_Headers1 = splitAndExpand(Header_value);
				for (int i = 0; i < column_Headers1.size(); i++) {
					String column = column_Headers1.get(i);
					click(driver, Reject_Input_Field);
					clear(driver, Reject_Input_Field);
					sendKeys(driver, Reject_Input_Field, column);

					String checkbox = String.format(Reject_FirstOption, column);
					waitForDisplay(driver, checkbox);
					jsClick(driver, checkbox);
				}  
		 }
			     
            if(isdisplayed(driver, Reject_Manually_Approved)) {
   			 
            	waitForElement(driver, Reject_Manually_Approved);
				click(driver,Reject_Manually_Approved);
				
				waitForElement(driver, miss_Rejec);
				click(driver, miss_Rejec); 
				
   			 waitForElement(driver, popup_Message);
   			 String reject_pop =getText(driver, popup_Message);
   			 System.out.println("reject_pop :"+reject_pop);
   			 
   			 if(Activity_Rejected_Popup.equals(reject_pop)) {
   				 
   				  System.out.println("Matched exp value :"+reject_pop +"actual value :"+Activity_Rejected_Popup);
   				  Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + reject_pop + " || Actual Report Activity is : " + Activity_Rejected_Popup, test,test1); 
   				 
   			 }else {
   				 
   				 System.out.println("Not Matched exp value :"+reject_pop +"actual value :"+Activity_Rejected_Popup);
   				 Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + reject_pop + " || Actual Report Activity is : " + Activity_Rejected_Popup, test,test1); 
   			 }
   			 

   			 waitForElement(driver, popup_Message_Ok_Button);
   			 click(driver, popup_Message_Ok_Button); 
   			 
   			 waitForElement(driver, Reject_colum);
   			 click(driver, Reject_colum);
   			 
   			 waitForElement(driver, Reject_SelectAll);
   			 click(driver, Reject_SelectAll);
   			 
   			 List<String> column_Headers1 = splitAndExpand(Header_value);
   				for (int i = 0; i < column_Headers1.size(); i++) {
   					String column = column_Headers1.get(i);
   					click(driver, Reject_Input_Field);
   					clear(driver, Reject_Input_Field);
   					sendKeys(driver, Reject_Input_Field, column);

   					String checkbox = String.format(Reject_FirstOption, column);
   					waitForDisplay(driver, checkbox);
   					jsClick(driver, checkbox);
   				}  
   		 }
            
            Step_End(11, "If the activities are in submitted or approved status, System validates as   Activities are rejected Click on the ok option", test, test1); 	 
            
            Step_Start(12, "If the activities are already in rejected status, System validates as Only Submitted / Approved record(s) can be rejected.Click on the ok option", test, test1); 	      
            
            if(isdisplayed(driver, Rejected_status)) {
            	
            	waitForElement(driver, Rejected_status);
				click(driver,Rejected_status);
				
				waitForElement(driver, miss_Rejec);
				click(driver, miss_Rejec); 
            	
				waitForElement(driver, popup_Message);
   			 
				String reject_pop =getText(driver, popup_Message);
				System.out.println("reject_pop :"+reject_pop);
   			 
				if(Submitted_Approved_pop.equals(reject_pop)) {
   				 
					System.out.println("Matched exp value :"+reject_pop +"actual value :"+Submitted_Approved_pop);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + reject_pop + " || Actual Report Activity is : " + Submitted_Approved_pop, test,test1); 
   				  	
				}else {
   				 
					System.out.println("Not Matched exp value :"+reject_pop +"actual value :"+Submitted_Approved_pop);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + reject_pop + " || Actual Report Activity is : " + Submitted_Approved_pop, test,test1); 
				}
   			 

				waitForElement(driver, popup_Message_Ok_Button);
				click(driver, popup_Message_Ok_Button); 
   			 
				waitForElement(driver, Reject_colum);
				click(driver, Reject_colum);
   			 
				waitForElement(driver, Reject_SelectAll);
				click(driver, Reject_SelectAll);
   			 
				List<String> column_Headers1 = splitAndExpand(Header_value);
   				for (int i = 0; i < column_Headers1.size(); i++) {
   					String column = column_Headers1.get(i);
   					click(driver, Reject_Input_Field);
   					clear(driver, Reject_Input_Field);
   					sendKeys(driver, Reject_Input_Field, column);

   					String checkbox = String.format(Reject_FirstOption, column);
   					waitForDisplay(driver, checkbox);
   					jsClick(driver, checkbox);
   				}  
            }
   		 
            Step_End(12, "If the activities are already in rejected status, System validates as Only Submitted / Approved record(s) can be rejected.Click on the ok option", test, test1); 	      	 
	
            
            Extent_completed(tc_Name, test, test1);	
	}
}