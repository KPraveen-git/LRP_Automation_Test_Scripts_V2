package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TS_EMS_Contract_Registration_16 extends Keywords {

	public void EMS_Contract_Registration_16(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) throws Exception {

		String testcase_Name="TS_EMS_Contract_Registration_16";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		String Username = data.get("Username");
		String pass_word = data.get("pass_word");
		String Module_name = data.get("module_name");
		String Activity_data1 = data.get("Activity_data1");
		String Multi_Location1 = data.get("Multi_Location1");
		String Multi_Depot1 = data.get("Multi_Depot1");
		String Multi_Size_and_Type = data.get("Multi_Size_and_Type");
		String Equipment_Num = data.get("Equipment_Num");
		String Global_SearchField = data.get("Global_SearchField");
		String module_name1 = data.get("module_name1");
		String ReturnDate = data.get("ReturnDate");
		String Remarks_Value = data.get("Remarks_Value");
		String Ref_Num_Value = data.get("Ref_Num_Value");
		String Return_refno1 = data.get("Return_refno1");
		String Movement_Entry_ActivityDate = data.get("Movement_Entry_ActivityDate");
		String movement_EntryPopup = data.get("movement_EntryPopup").trim();
		String date_Picker = data.get("date_Picker");
		String Version_Input = data.get("Version_Input");
		String Carrier_Input = data.get("Carrier_Input");
		String Version_Search = data.get("Version_Search");
		String Carrier_Search = data.get("Carrier_Search");
		String Contract_No_Search = data.get("Contract_No_Search");
		String condition = data.get("condition");





		

		Extent_Start(testcase_Name, test, test1);


		// login
		navigateUrl(driver, url);
		
		LRP_Login(driver, Username, pass_word);

		Extent_call(test, test1, "Enter module name in searchbox & click the module");


		Step_Start(1, "Ensure system should allow user to save OFHI  move in movement entry", test, test1);
		// search module
		
		
		moduleNavigate(driver, Module_name);


		safeclick(driver, multiEntryMovPage_L);
		waitForElement(driver, activitySearchField_L);
		safeclick(driver, activitySearchField_L);

		sendKeys(driver, activitySearchField_L, Activity_data1);
		waitForElement(driver, Onhi_Ofhi_select);
		safeclick(driver, Onhi_Ofhi_select);
		waitForElement(driver, Activity_Date);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Activity_Date, Movement_Entry_ActivityDate);
		} else {
			waitForElement(driver, Activity_Date);
			clearAndType(driver, Activity_Date, Movement_Entry_ActivityDate);
		}

		waitForElement(driver, showInputButton);
		click(driver, showInputButton);



		waitForElement(driver, Multi_Location_SF);
		sendKeys(driver, Multi_Location_SF, Multi_Location1);
		waitForElement(driver, Location_select);
		click(driver, Location_select);

		safeclick(driver, Depot_SearchButton);
		waitForElement(driver, Depot_Sf);
		sendKeys(driver, Depot_Sf, Multi_Depot1);
		waitForElement(driver, Depot_Valuefilter);
		safeclick(driver, Depot_Valuefilter);
		waitForElement(driver, Depot_SelectBtn);
		safeclick(driver, Depot_SelectBtn);
		
		if (!ReturnDate.equals("")) {
			safeclick(driver, Return_Date);


			waitForElement(driver, date_select);
			safeclick(driver, date_select);

		} else {

			System.out.println("ReturnDate " + "Input Not Available in : " + File_Path);
		}





		if (!Remarks_Value.equals("")) {
			waitForElement(driver, Remarks_TF);
			sendKeys(driver, Remarks_TF, Remarks_Value);
		} else {

			System.out.println("Remarks_Value " + "Input Not Available in : " + File_Path);
		}


		if (!Ref_Num_Value.equals("")) {
			waitForElement(driver, Ref_Num);
			sendKeys(driver, Ref_Num, Ref_Num_Value);
		} else {

			System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
		}
		waitForElement(driver, Return_Ref_No);
		safeclick(driver, Return_Ref_No);
		System.out.println("Return_refno1 : " + Return_refno1);
		waitForElement(driver, Return_Ref_No);
		sendKeys(driver, Return_Ref_No, Return_refno1);
		waitForElement(driver, Add_button);
		safeclick(driver, Add_button);
		waitForElement(driver, firstCell);
		doubleClick(driver, firstCell);
		waitForElement(driver, firstCellInput);
		safeclick(driver, firstCellInput);
		waitForElement(driver, firstCellInput);
		Actionsendkeys(driver, firstCellInput, Equipment_Num);
		// save movement entry
		waitForElement(driver, Save_Btn);
		safeclick(driver, Save_Btn);
		
		

		waitForElement(driver, Movement_Entry_Popup);
		String Popup=getText(driver, Movement_Entry_Popup);
		if(movement_EntryPopup.equals(Popup.trim())) {

			System.out.println("Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
			Extent_pass(driver, "Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
					test, test1);

		} else {
			System.out.println("NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
			Extent_fail(driver, "NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
					test, test1);
		}
		waitForElement(driver, Ofhi_OkButton);
		safeclick(driver, Ofhi_OkButton);

		Step_End(1, "Ensure system should allow user to save OFHI  move in movement entry", test, test1);

		// search EMS contract registration
		
		moduleNavigate(driver, module_name1);


		waitForElement(driver, globalSearch11);
		safeclick(driver, globalSearch11);
		globalValueSearchWindow(driver, condition, Contract_No_Search, Global_SearchField, Carrier_Search, Carrier_Input, Version_Search, Version_Input);

		Step_Start(2, "Ensure that system should show dropoff actual count correctly once Actual pick up qty selection double click", test, test1);

		// pickup/drop off tab
		waitForElement(driver, pickup_dropoff_tab);
		safeclick(driver, pickup_dropoff_tab);
		// pickup/drop off details
		waitForElement(driver, location_filter16);
		sendKeys(driver, location_filter16, Multi_Location1);

		waitForElement(driver, sizetype_filter16);
		sendKeys(driver, sizetype_filter16, Multi_Size_and_Type);

		waitForElement(driver, pickup_dropoff_detail);
		doubleClick(driver, pickup_dropoff_detail);
		String dropoffcount1 = getText(driver, dropoff_count1);
		System.out.println("Total No. of Actual Dropoff Quantity before double click the actual pickup quantity:" + dropoffcount1);

		waitForElement(driver, monthly_utilized_summary);
		if (isDisplayed(driver, dropoff_count_MUS)) {
			System.out.println("Dropoff actual count was shown");
			Extent_pass(driver, "Dropoff actual count was shown", test, test1);
			waitForElement(driver, dropoff_count_MUS);
			String dropoffcount2 = getText(driver, dropoff_count_MUS);
			System.out.println("Total No. of Actual Dropoff Quantity before double click the actual pickup quantity:"+dropoffcount2);
		
		} else {
			System.out.println("Dropoff actual count was not shown");
			Extent_fail(driver, "Dropoff actual count was not shown", test, test1);
		}
	
		Step_End(2, "Ensure that system should show dropoff actual count correctly once Actual pick up qty selection double click", test, test1);

		Extent_completed(testcase_Name, test, test1);
	}
}
