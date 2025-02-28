package LRP_EMS_Individual_Scripts;

import java.util.List;
import java.util.Map;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Scale_In_TS_007 extends Keywords {

	public void Scaleinedit(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		// Value are taken from excel sheet
		String testcase_Name = "TC_Scale_In_TS_007";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);

		String Username = data.get("Username");// 1,2,4-6
		String Password = data.get("Password");
		String Search = data.get("Search_input");
		String Scale_Reference_no = data.get("Scale_Reference_no");
		String perdiem = data.get("Per_Diem");
		String savedpopexp = data.get("PopUpforsaved");
		String Search_type = data.get("Search_type");
		String From_date_perform = data.get("From_date_perform");
		String From_Date_Input = data.get("From_Date_Input");
		String To_Date_perform = data.get("To_Date_perform");
		String To_Date_Input = data.get("To_Date_Input");
		String Coloum_names = data.get("Coloum_names");
		String Equipment_ID = data.get("Equipment_ID");
		String Location = data.get("Location");
		String Search_value_type = data.get("Search_value_type");
		
		String select_Option_1 = String.format(Gird_click, Location,Equipment_ID);
		Extent_Start(testcase_Name, test, test1);
		
		
		navigateUrl(driver, URL);

	
		// Login
		LRP_Login(driver, Username, Password);

	
	

		// Module Search

		moduleNavigate(driver, Search);
		
		Step_Start(1, " Click on Global Search from toolbar",test, test1);
		waitForElement(driver, Ahomepagesearch);
		safeclick(driver, Ahomepagesearch);
		
		globalValueSearchWindow(driver, Search_type, Search_value_type, Scale_Reference_no, "", "", "", "");
		Step_End(1, " Click on Global Search from toolbar",test, test1);
		Step_Start(2, " Enter Contract no & click on search button",test, test1);
		// Entering the contract number to search

		
	
		Step_Start(3, " Click on retrieved data for required contract no",test, test1);
	
		scrollTop(driver);
		Step_End(2, " Enter Contract no & click on search button",test, test1);
		Step_End(3, " Click on retrieved data for required contract no",test, test1);
		Step_Start(4, "Click on Edit button from toolbar ",test, test1);
		// Adding into the gird

		waitForElement(driver, AEdit_Button);
		safeclick(driver, AEdit_Button);
		
		scrollBottom(driver);
		Step_End(4, "Click on Edit button from toolbar ",test, test1);
		Step_Start(5, " double click on the required data from grid ",test, test1);
		waitForElement(driver, Adoubleclickperdiem);
		String firist = getText(driver, Adoubleclickperdiem);
		System.out.println(firist);
		String[] a2 = firist.split("\\.");
		System.out.println("Splitted string" + a2[0]);
		waitForElement(driver, select_Option_1);
		doubleClick(driver, select_Option_1);
	
		scrollTop(driver);
		Step_End(5, " double click on the required data from grid ",test, test1);
		// Selecting the From Date
		waitForElement(driver, AFrom_Date);
		if (From_date_perform.equalsIgnoreCase("Yes")) {
			waitForElement(driver, AFrom_Date);
			selectDatePicker(driver, AFrom_Date, From_Date_Input);
		} else {
			waitForElement(driver, AFrom_Date);
			clearAndType(driver, AFrom_Date, From_Date_Input);
		}
		
				Step_End(3, "Select Validity From Date range accordingly in date picker ",test, test1);
				// Selecting the to Date
				Step_Start(4, "-Select Validity To Date range accordingly in date picker ",test, test1);
				waitForElement(driver, ATo_Date);
				if (To_Date_perform.equalsIgnoreCase("Yes")) {
					waitForElement(driver, ATo_Date);
					selectDatePicker(driver, ATo_Date, To_Date_Input);
				} else {
					waitForElement(driver, ATo_Date);
					clearAndType(driver, ATo_Date, To_Date_Input);
				}
				
		Step_Start(6, "Clear the existing values in per diem field ",test, test1);
		Step_Start(7, " Enter new values in per diem field & click on edit button ",test, test1);
		// Perdiem input
		if (!perdiem.equals("")) {
			waitForElement(driver, APer_Diem_Input);
			clear(driver, APer_Diem_Input);
			Step_End(6, "Clear the existing values in per diem field ",test, test1);
			sendKeys(driver, APer_Diem_Input, perdiem);
			waitForElement(driver, APick_Up_Credit);
			safeclick(driver, APick_Up_Credit);
		}
		
		waitForElement(driver, Aeditbuttoninside);
		safeclick(driver, Aeditbuttoninside);
		
		Step_End(7, " Enter new values in per diem field & click on edit button ",test, test1);
		scrollTop(driver);
		Step_Start(8, " Click on save button & updated message shown in screen ",test, test1);
		// Saving after edit
		waitForElement(driver, ASave_Button);
		safeclick(driver, ASave_Button);
		waitForElement(driver, AGried_Add_Button);
		scrollUsingElement(driver, AGried_Add_Button);
		waitForElement(driver, APopupforupdated);
		// verify the popup for after edit the date and save

		String actualmsg = getText(driver, APopupforupdated);
		System.out.println(actualmsg);
		if (savedpopexp.equals(actualmsg)) {
			System.out.println(
					"Matched || " + " Expected Activity is [Before edit it was shown] : " + savedpopexp + " || Actual Activity is [After edit it was shown] : " + actualmsg);
			Extent_pass(driver,
					"Matched || " + " Expected Activity is [Before edit it was shown] : " + savedpopexp + " || Actual Activity is[After edit it was shown]  : " + actualmsg,
					test, test1);
		} else {
			System.out.println("Not matched || " + " Expected Activity is[Before edit it was shown] : " + savedpopexp
					+ " || Actual Activity is[After edit it was shown]  : " + actualmsg);
			Extent_fail(driver, "Not matched || " + " Expected Activity is [Before edit it was shown]: " + savedpopexp
					+ " || Actual Activity is[After edit it was shown]  : " + actualmsg, test, test1);
			
		}
		
		// verification before edit value and after edit value
		waitForElement(driver, Adoubleclickperdiem);
		String second = getText(driver, Adoubleclickperdiem);
		System.out.println(second);

		if (a2[0].equals(second)) {
			System.out
					.println("Matched || " + " Expected Activity is : " + a2[0] + " || Actual Activity is : " + second);
			Extent_fail(driver, "Matched || " + " PerDiem want to change aftet edit : " + a2[0]
					+ " || PerDiem was changed : " + second, test, test1);
		
		} else {
			System.out.println(
					"Not matched || " + " Expected Activity is : " + a2[0] + " || Actual Activity is : " + second);
			Extent_pass(driver,
					"Not matched || " + " Expected Activity is : " + a2[0] + " || Actual Activity is : " + second, test,
					test1);
			
			Extent_call(test, test1, "Not matched || " + " Expected Activity is : " + a2[0] + " || Actual Activity is : " + second);
		}
		Step_End(8, " Click on save button & updated message shown in screen ",test, test1);
		
		
		Map<String, List<String>> table_view = extractTableDataDirect(driver, table_path);
		List<String> coloumhearders = splitAndExpand1(Coloum_names);
		
		String table_value = printTable(driver, table_view, coloumhearders);
		Extent_pass(driver, "<pre>"+table_value+"</pre>", test, test1);
		// verify data was added in gird
		if (isdisplayed(driver, AINNSA)) {
			System.out.println("Data was shown in grid");
			Extent_pass(driver, "***Data was shown in grid***", test, test1);
			Extent_call(test, test1,  "***Data was shown in grid***");
			isDisplayed(driver, Scroll_side);
			if (isDisplayed(driver, Scroll_side)) {
				horizontalscroll(driver, Scroll_side, 1000);
				Extent_pass(driver, "***Data was shown in grid***", test, test1);	
				Extent_call(test, test1,  "***Data was shown in grid***");
				
			}
			
		} else {
			System.out.println("Data was NOT shown in grid");
			
			
		}
		
		scrollTop(driver);
		Extent_completed(testcase_Name, test, test1);
	}

}
