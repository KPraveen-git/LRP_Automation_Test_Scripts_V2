package LRP_EMS_Individual_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EMS_Gate_SC33 extends Keywords {

	public void EmsGateTS033(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

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




		// login
		navigateUrl(driver, url);

		Extent_Start(testcase_Name, test, test1);
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
	}
}
