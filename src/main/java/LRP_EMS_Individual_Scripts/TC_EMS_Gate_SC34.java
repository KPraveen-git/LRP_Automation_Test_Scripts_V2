package LRP_EMS_Individual_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EMS_Gate_SC34 extends Keywords {

	public void EmsGateTS034(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String testcase_Name="TC_EMS_Gate_SC34";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);

		String Username = Excel_data.get("Username");
		String pass_word = Excel_data.get("pass_word");
		String Search_module = Excel_data.get("Search_module");
		String Container_Num = Excel_data.get("Container_Num");
		String To_Date = Excel_data.get("To_Date");
		String Action_Req = Excel_data.get("Action_Req");
		String Action_Not_Req = Excel_data.get("Action_Not_Req");
		String From_Date = Excel_data.get("From_Date");
		String date_Picker = Excel_data.get("date_Picker");



		// login
		navigateUrl(driver, url);
		Extent_Start(testcase_Name, test, test1);
		LRP_Login(driver, Username, pass_word);
		Extent_call(test, test1, "Enter module name in searchbox & click the module");
		// search module
		
	    
	    
		moduleNavigate(driver, Search_module);

		// no records found popup
		waitForDisplay(driver, Norecordsround_okbtn1);
		if (isDisplayed(driver, Norecordsround_okbtn1)) {
			System.out.println("No Records Found text is present");
			doubleClick(driver, Norecordsround_okbtn1);
		} else {
			System.out.println("No Records Found text is not present");
			
		}

		// select from date

		waitForElement(driver, EMS_Gate_From_Date);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, EMS_Gate_From_Date, From_Date);
		} else {
			waitForElement(driver, EMS_Gate_From_Date);
			clearAndType(driver, EMS_Gate_From_Date, From_Date);
		}
		// Selecting the to Date
		waitForElement(driver, EMS_Gate_To_Date);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, EMS_Gate_To_Date, To_Date);
		} else {
			waitForElement(driver, EMS_Gate_To_Date);
			clearAndType(driver, EMS_Gate_To_Date, To_Date);
		}
		// Non-mandatory checkbox
		waitForElement(driver, Action_Required_CheckBox);
		checkBox(driver, Action_Required_CheckBox, Action_Req);
		// Non-mandatory checkbox
		waitForElement(driver, Action_NotRequired_CheckBox);
		checkBox(driver, Action_NotRequired_CheckBox, Action_Not_Req);
   Step_Start(1, "Enter container no in Equipment no search field", test, test1);
		// search Container number
		waitForElement(driver, custom_search);
		click(driver, custom_search);

//		globalValueSearchWindow(driver, condition, Equipment_No_Filter,Container_Num, Book_No_Filter, Book_No, System_File_Name_filter, file_Name);
		
		click(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, Container_Num);
		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);
		waitForElement(driver, EDI_Value);
		String EDI_Num=getText(driver, EDI_Value);
		System.out.println("EDI_Num:"+EDI_Num);
		waitForElement(driver, retrivedGlobalValue);
		click(driver, retrivedGlobalValue);
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		
		
		
		Step_End(1, "Enter container no in Equipment no search field", test, test1);
	
		Step_Start(2, "Click search button & double click the required data", test, test1);
		waitForElement(driver, ToolPanel);
		click(driver, ToolPanel);
		waitForElement(driver, Confitionfilter);
		click(driver, Confitionfilter);
		waitForElement(driver, System_fileName_TF);
		sendKeys(driver, System_fileName_TF, EDI_Num);
		 waitForElement(driver, Error_Date);
	        String ErrorDate_Value=getText(driver, Error_Date);
	        System.out.println(ErrorDate_Value);
	        
	        String Date[]=ErrorDate_Value.split(" ");
	        System.out.println("Data_Error:"+Date[0]);
		doubleClick(driver, Error_Record_Grid);
		Step_End(2, "Click search button & double click the required data", test, test1);
		Step_Start(3, "it will fetch particular data on ems gate", test, test1);
		waitForElement(driver, EDI_ErrorMoments_EqpNo);
		String EDI_EqpNO=getText(driver, EDI_ErrorMoments_EqpNo);
		System.out.println(EDI_EqpNO);
		if(Container_Num.equals(EDI_EqpNO)) {
			System.out.println("Matched || Container Number:" + Container_Num + " || Container Name in EDI Error Movements:" + EDI_EqpNO);
			Extent_pass(driver, "Matched || Container Number:" + Container_Num + " || Container Name in EDI Error Movements:" + EDI_EqpNO, test,
					test1);

		} else {
			System.out.println("NotMatched || Container Number:" + Container_Num + " || Container Name in EDI Error Movements:" + EDI_EqpNO);
			Extent_fail(driver, "NotMatched || Container Number:" + Container_Num + " || Container Name in EDI Error Movements:" + EDI_EqpNO,
					test, test1);
		
		}	
		
		waitForElement(driver, EDI_Date);
		String EDI_ErrorMovements_Date=getAttribute(driver, EDI_Date, "value");
		System.out.println(EDI_ErrorMovements_Date);
		if(Date[0].equals(EDI_ErrorMovements_Date)) {
			System.out.println("Matched || Activity Date:" + Date[0] + " || Container Name in EDI Error Movements:" + EDI_ErrorMovements_Date);
			Extent_pass(driver, "Matched || Activity Date:" + Date[0] + " || Container Name in EDI Error Movements:" + EDI_ErrorMovements_Date, test,
					test1);

		} else {
			System.out.println("NotMatched || Activity Date:" + Date[0] + " || Container Name in EDI Error Movements:" + EDI_ErrorMovements_Date);
			Extent_fail(driver, "NotMatched || Activity Date:" + Date[0] + " || Container Name in EDI Error Movements:" + EDI_ErrorMovements_Date,
					test, test1);
		
		}	
		Step_End(3, "it will fetch particular data on ems gate", test, test1);
	
		Extent_completed(testcase_Name, test, test1);
	}

}