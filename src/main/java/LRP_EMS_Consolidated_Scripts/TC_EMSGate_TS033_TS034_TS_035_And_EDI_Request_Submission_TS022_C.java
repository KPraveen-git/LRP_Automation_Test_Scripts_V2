package LRP_EMS_Consolidated_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EMSGate_TS033_TS034_TS_035_And_EDI_Request_Submission_TS022_C extends Keywords {

	public void TC_EMSGate_TS033_TS034_035_And_EDI_Request_Submission_TS022(WebDriver driver, ExtentTest test,
			ExtentTest test1, String selected_dataset) throws Exception {
		
		
		int TC1=1;

		if(TC1==1) {	
	
		String testcase_Name="TC_EMS_Gate_SC33";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		
		
		String Username = Excel_data.get("Username");
		String pass_word = Excel_data.get("pass_word");
		String Search_module = Excel_data.get("Search_module");
		String To_Date = Excel_data.get("To_Date");
		String Action_Req = Excel_data.get("Action_Req");
		String Action_Not_Req = Excel_data.get("Action_Not_Req");
		String date_Picker = Excel_data.get("date_Picker");
		String From_Date = Excel_data.get("From_Date");
		String Error_Background_Colour_Code = Excel_data.get("Error_Background_Colour_Code");
		String Error_Status_Coloums = Excel_data.get("Error_Status_Coloums");
		


		Extent_Start(testcase_Name, test, test1);


		// login
		navigateUrl(driver, url);
		
		LRP_Login(driver, Username, pass_word);

		Extent_call(test, test1, "Enter module name in searchbox & click the module");
		// module search
		moduleNavigate(driver, Search_module);

		// no records found popup
		waitForDisplay(driver, Norecordsround_okbtn1);
		if (isDisplayed(driver, Norecordsround_okbtn1)) {
			System.out.println("No Records Found text is present");
			doubleClick(driver, Norecordsround_okbtn1);
		} else {
			System.out.println("No Records Found text is not present");
		}

		Step_Start(2, " Select date range for id need to check", test, test1);
		
		
		// Selecting the From Date

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
		
	
		Step_End(2, " Select date range for id need to check", test, test1);

		// Non-mandatory checkbox
		waitForElement(driver, Action_Required_CheckBox);
		checkBox(driver, Action_Required_CheckBox, Action_Req);
		// Non-mandatory checkbox
		waitForElement(driver, Action_NotRequired_CheckBox);
		checkBox(driver, Action_NotRequired_CheckBox, Action_Not_Req);


		Step_Start(3, "Click refresh button once date range selected", test, test1);
		// click refresh button
		waitForElement(driver, refresh_Button_Ems_Gate);
		click(driver, refresh_Button_Ems_Gate);
		Step_End(3, "Click refresh button once date range selected", test, test1);

		Step_Start(4, "Error records data will be shown by highlighted in red color", test, test1);
		// filter the Error records

		waitForElement(driver, Status_Menu);
		click(driver, Status_Menu);
		waitForElement(driver, Filter_Option);
		click(driver, Filter_Option);
		waitForElement(driver, Select_all_CheckBox);
		click(driver, Select_all_CheckBox);

		List<String> error_Values = splitAndExpand(Error_Status_Coloums);
		for(String error_Value : error_Values) {
			String select_Value =  String.format(select_value,  error_Value); 
			waitForElement(driver, select_Value);
			click(driver, select_Value);
		}
		Step_End(4, "Error records data will be shown by highlighted in red color", test, test1);
		waitForElement(driver, Ems_gate_Frame);
		click(driver, Ems_gate_Frame);
		Step_Start(5, "Scroll rightside to check the record status", test, test1);

		waitForElement(driver, Error_Record_List);
		List<WebElement> error_Records = listOfElements(driver, Error_Record_List);
		for(int i=1;i<error_Records.size();i++) {
			String error_Row =  String.format(error_row,  i); 
			String error_File =  String.format(error_file,  i); 
			String error_Filename=getText(driver, error_File);

			mouseOverToElement(driver, error_Row);
			String records_Color = getTextBackgroundColor(driver, error_Row);
			System.out.println("records_Color : "+records_Color);
			if (Error_Background_Colour_Code.equals(records_Color)) {
				System.out.println("Matched || Expected Error Record Red Value was : " + Error_Background_Colour_Code
						+ " || Actual Color  was : " + records_Color+" The Error system file name is "+error_Filename);
				Extent_pass(driver, "Matched || Expected Error Record Red Value was : " + Error_Background_Colour_Code
						+ " || Actual Color was : " + records_Color+" The Error system file name is "+error_Filename, test, test1);
			} else {
				System.out.println("NotMatched || Expected Error Record Red Value was : " + Error_Background_Colour_Code
						+ " || Actual Color  was : " + records_Color);
				Extent_fail(driver, "NotMatched || Expected Error Record Red Value was : " + Error_Background_Colour_Code
						+ " || Actual Color was : " + records_Color, test, test1);
			}

		}

		Step_End(5, "Scroll rightside to check the record status", test, test1);


		Extent_completed(testcase_Name, test, test1);
				
		waitForElement(driver, P_EMS_Gate_Cancel_Btn);
		click(driver, P_EMS_Gate_Cancel_Btn);
		}
		
		int TC2=1;

		if(TC2==1) {
			String testcase_Name="TC_EMS_Gate_SC34";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);

			String Search_module = Excel_data.get("Search_module");
			String Container_Num = Excel_data.get("Container_Num");
			String To_Date = Excel_data.get("To_Date");
			String Action_Req = Excel_data.get("Action_Req");
			String Action_Not_Req = Excel_data.get("Action_Not_Req");
			String From_Date = Excel_data.get("From_Date");
			String date_Picker = Excel_data.get("date_Picker");

			


			// login
			Extent_Start(testcase_Name, test, test1);
			// search module
			moduleNavigate(driver, Search_module);
			// no records found popup
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

//			globalValueSearchWindow(driver, condition, Equipment_No_Filter,Container_Num, Book_No_Filter, Book_No, System_File_Name_filter, file_Name);
			
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
		waitForElement(driver, P_EMS_Gate_Cancel_Btn);
		click(driver, P_EMS_Gate_Cancel_Btn);
		waitForElement(driver, close_Tab);
		click(driver, close_Tab);

		}
		int TC3=1;

		if(TC3==1) {
			
			
			String testcase_Name="TC_EmsEdiErrorMovement_SC35";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);

			String Field_Names4 = Excel_data.get("Field_Names4");
			
			String Edi_file_Value = Excel_data.get("Edi_file_Value");
			String Error_date = Excel_data.get("Error_date");
			String Clear_Button_Perform = Excel_data.get("Clear_Button_Perform");
			String Search_module = Excel_data.get("Search_module");
			String Error_Equipment_No = Excel_data.get("Error_Equipment_No");
			String date_Picker = Excel_data.get("date_Picker");
			String From_Date_Value = Excel_data.get("From_Date_Value");
			String To_date_Value = Excel_data.get("To_date_Value");
			String To_EMS_date = Excel_data.get("To_EMS_date");
			String From_Ems_date = Excel_data.get("From_Ems_date");
			String Error_Status_Coloums = Excel_data.get("Error_Status_Coloums");
			String Error_Background_Colour_Code = Excel_data.get("Error_Background_Colour_Code");
			String conditionFilter = Excel_data.get("conditionFilter");
			String Edi_File_Search = Excel_data.get("Edi_File_Search");


			
			

			// login
			
			Extent_Start(testcase_Name, test, test1);
					// search module
			moduleNavigate(driver, Field_Names4);

			Step_Start(1, "Select From & To date range according in required fields", test, test1);

			// select from date

			waitForElement(driver, kFromDate);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, kFromDate, From_Date_Value);
			} else {
				waitForElement(driver, kFromDate);
				clearAndType(driver, kFromDate, From_Date_Value);
			}
			// Selecting the to Date
			waitForElement(driver, kToDate);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, kToDate, To_date_Value);
			} else {
				waitForElement(driver, kToDate);
				clearAndType(driver, kToDate, To_date_Value);
			}
	
	
	
	
	
	

	Step_End(1, "Select From & To date range according in required fields", test, test1);
	Step_Start(2, "Click add button & it will show list of all id based on date range selection", test, test1);
	// click add option
	waitForElement(driver, kAddOption);
	click(driver, kAddOption);
	
	twoColumnSearchWindow(driver, Edi_File_Search, conditionFilter, Edi_file_Value);


	
	
	Step_End(2, "Click add button & it will show list of all id based on date range selection", test, test1);

	Step_Start(3, "Click show button to get error detail in data grid", test, test1);
	// click show option
	waitForElement(driver, show_Btn);
	click(driver, show_Btn);

	waitForElement(driver, EDI_ErrorMoments_ToolPannel);
	click(driver, EDI_ErrorMoments_ToolPannel);
	waitForElement(driver, EDI_ErrorMoments_ConditionFilter);
	click(driver, EDI_ErrorMoments_ConditionFilter);
	waitForElement(driver, EDI_ErrorMoments_Equipment_No);
	sendKeys(driver, EDI_ErrorMoments_Equipment_No, Error_Equipment_No);
	// Change the date in Error grid
	
	
	waitForElement(driver, Error_Grid);
	if (date_Picker.equalsIgnoreCase("Yes")) {
		selectDatePicker(driver, Error_Grid, Error_date);
	} else {
		waitForElement(driver, Error_Grid);
		clearAndType(driver, Error_Grid, Error_date);
	}

	

	
	

	waitForElement(driver, Error_SelectBtn);
	click(driver, Error_SelectBtn);
	waitForElement(driver, Re_Process_Btn);
	click(driver, Re_Process_Btn);
	// Non-Mandatory button
	if (Clear_Button_Perform.equals("YES")) {
		waitForElement(driver, clear_btn);
		click(driver, clear_btn);
	}

	// search EMS gate module

		moduleNavigate(driver, Search_module);

    waitForDisplay(driver, Norecordsround_okbtn1);
	if (isDisplayed(driver, Norecordsround_okbtn1)) {
		System.out.println("No Records Found text is present");
		doubleClick(driver, Norecordsround_okbtn1);
	} else {
		System.out.println("No Records Found text is not present");
	}
	// select From date
	
	

	// Selecting the From Date

	waitForElement(driver, EMS_Gate_From_Date);
	if (date_Picker.equalsIgnoreCase("Yes")) {
		selectDatePicker(driver, EMS_Gate_From_Date, From_Ems_date);
	} else {
		waitForElement(driver, EMS_Gate_From_Date);
		clearAndType(driver, EMS_Gate_From_Date, From_Ems_date);
	}
	// Selecting the to Date
	waitForElement(driver, EMS_Gate_To_Date);
	if (date_Picker.equalsIgnoreCase("Yes")) {
		selectDatePicker(driver, EMS_Gate_To_Date, To_EMS_date);
	} else {
		waitForElement(driver, EMS_Gate_To_Date);
		clearAndType(driver, EMS_Gate_To_Date, To_EMS_date);
	}
	// click Refresh button
	waitForElement(driver, refresh_Button_Ems_Gate);
	click(driver, refresh_Button_Ems_Gate);
	waitForElement(driver, Status_Menu);
	click(driver, Status_Menu);
	waitForElement(driver, Filter_Option);
	click(driver, Filter_Option);
	waitForElement(driver, Select_all_CheckBox);
	click(driver, Select_all_CheckBox);

	List<String> error_Values = splitAndExpand(Error_Status_Coloums);
	for(String error_Value : error_Values) {
		String select_Value =  String.format(select_value,  error_Value); 
		waitForElement(driver, select_Value);
		click(driver, select_Value);
	}
	waitForElement(driver, Error_Record_List);
	List<WebElement> error_Records = listOfElements(driver, Error_Record_List);
	for(int i=1;i<error_Records.size();i++) {
		String error_Row =  String.format(error_row,i); 
		String error_File =  String.format(error_file,  i); 
		String error_Filename=getText(driver, error_File);
		
		String records_Color = getTextBackgroundColor(driver, error_Row);
		System.out.println("records_Color : "+records_Color);
		if (Error_Background_Colour_Code.equals(records_Color)) {
			System.out.println("Matched || Expected Error Record Red Value was : " + Error_Background_Colour_Code
					+ " || Actual Color  was : " + records_Color+" The Error system file name is "+error_Filename);
			Extent_pass(driver, "Matched || Expected Error Record Red Value was : " + Error_Background_Colour_Code
					+ " || Actual Color was : " + records_Color+" The Error system file name is "+error_Filename, test, test1);
		} else {
			System.out.println("NotMatched || Expected Error Record Red Value was : " + Error_Background_Colour_Code
					+ " || Actual Color  was : " + records_Color);
			Extent_fail(driver, "NotMatched || Expected Error Record Red Value was : " + Error_Background_Colour_Code
					+ " || Actual Color was : " + records_Color, test, test1);
		}
	
	}

	Step_End(3, "Click show button to get error detail in data grid", test, test1);
			Extent_completed(testcase_Name, test, test1);
		waitForElement(driver, close_Tab);
		click(driver, close_Tab);
		waitForElement(driver, close_Tab);
		click(driver, close_Tab);
		}
		
		
		int TC4=1;

		if(TC4==1) {
		// module search
			String testcase_Name="TC_EDI_Request_Submission_SC22";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
			
			String field_name1 = Data.get("field_name1");
			String Partner_Id = Data.get("Partner_Id");
			String Edi_Id = Data.get("Edi_Id");
			String Save_Popup = Data.get("Save_Popup");
			String Actual_Save_Popup = Data.get("Actual_Save_Popup");
			String file_Upload =  Data.get("file_Upload");
			String conditionFilter = Data.get("conditionFilter");
			String partner_Id_Search =  Data.get("partner_Id_Search");
			String Edi_Id_Search =  Data.get("Edi_Id_Search");
			

			Extent_Start(testcase_Name, test, test1);

			// login
			// module search
			Extent_call(test, test1, "Enter module name in searchbox & click the module");
			moduleNavigate(driver, field_name1);

			
			Step_Start(1, "Click on search icon besides Partner id field", test, test1);
			waitForElement(driver, searchField);
			click(driver, searchField);
			Step_End(1, "Click on search icon besides Partner id field", test, test1);
			
			Step_Start(2, "select appropriate partner code accordingly", test, test1);
			twoColumnSearchWindow(driver, partner_Id_Search, conditionFilter, Partner_Id);

			

			Step_End(2, "select appropriate partner code accordingly", test, test1);
			
			Step_Start(3, "Click on search icon besides EDI Id field", test, test1);
			waitForElement(driver, ediSearch);
			click(driver, ediSearch);
			Step_End(3, "Click on search icon besides EDI Id field", test, test1);
			
			Step_Start(4, "select appropriate id code accordingly", test, test1);
			
			twoColumnSearchWindow(driver, Edi_Id_Search, conditionFilter, Edi_Id);


	        Step_End(4, "select appropriate id code accordingly", test, test1);
		
			
			Step_Start(5, "Click choose button & select excel file from local system manually", test, test1);
			waitForElement(driver, chooseOption);
			// upload file
			uploadfile2(driver, file_Upload);
	        Step_End(5, "Click choose button & select excel file from local system manually", test, test1);
			
	        Step_Start(6, "Click save button & message will be shown as submitted", test, test1);
			waitForElement(driver, saveOpt);
			click(driver, saveOpt);
		
			if (Save_Popup.equals(Actual_Save_Popup)) {

				System.out.println(
						"Matched || expected value was:" + Save_Popup + " || Actual value was:" + Actual_Save_Popup);
				Extent_pass(driver,
						"Matched || expected value was:" + Save_Popup + " || Actual value was:" + Actual_Save_Popup, test,
						test1);

			} else {
				System.out.println(
						"NotMatched || expected value was:" + Save_Popup + " || Actual value was:" + Actual_Save_Popup);
				Extent_fail(driver,
						"NotMatched || expected value was:" + Save_Popup + " || Actual value was:" + Actual_Save_Popup,
						test, test1);
			}
			Step_End(6, "Click save button & message will be shown as submitted", test, test1);

			waitForElement(driver, Excel_Upload);
			String Uploaded = getText(driver, Excel_Upload);
			System.out.println(Uploaded);
			if (file_Upload.contains(Uploaded)) {
				System.out.println("Matched || expected value was:" + file_Upload + " || Actual value was:" + Uploaded);
				Extent_pass(driver, "Matched || expected value was:" + file_Upload + " || Actual value was:" + Uploaded, test,
						test1);

			} else {
				System.out.println("NotMatched || expected value was:" + file_Upload + " || Actual value was:" + Uploaded);
				Extent_fail(driver, "NotMatched || expected value was:" + file_Upload + " || Actual value was:" + Uploaded,
						test, test1);
			}
			Extent_completed(testcase_Name, test, test1);
		}
	}

}
