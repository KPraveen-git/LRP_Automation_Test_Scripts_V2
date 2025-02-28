package LRP_Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS042 extends Keywords {

	public void Cost_Activity_Report_TS042(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS042";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String Select_search_value = data.get("Select_search_value");
		String Condition = data.get("Condition");
		String CAR_No = data.get("CAR_No");
		String MainActivity = data.get("MainActivity");
		String MainActivityName = data.get("MainActivityName");
		String Eqp_Type = data.get("Eqp_Type");
		String Eqp_Status = data.get("Eqp_Status");
		String Car_Open_Popup = data.get("Car_Open_Popup");
		String Open_popup = data.get("Open_popup");
		String MainActivityName_Approved = data.get("MainActivityName_Approved");
		String Eqp_Type_Approved = data.get("Eqp_Type_Approved");
		String Approved_popup = data.get("Approved_popup");

		String Mainactivity_option = String.format(SelectOption, MainActivity);
		String Mainactivity_Name = String.format(SelectOption, MainActivityName);
		String Eqp_Type_option = String.format(SelectOption, Eqp_Type);
		String Eqp_Status_option = String.format(SelectOption, Eqp_Status);

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency",
				test, test1);

		LRP_Login(driver, username, password);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency",
				test, test1);

		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		verifyMainMenu(driver);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);

		Step_Start(4, "Check whether it opens a new search window", test, test1);

		if (isdisplayed(driver, type_Select1)) {

			System.out.println("New Search window got opened");
			Extent_pass(driver, "New Search window got opened", test, test1);
		} else {

			System.out.println("New Search window not got opened");
			Extent_fail(driver, "New Search window not got opened", test, test1);
		}

		Step_End(4, "Check whether it opens a new search window", test, test1);

		Step_Start(5, "Enter the required CAR No. in the CAR No search field", test, test1);

		waitForElement(driver, type_Select1);
		click(driver, type_Select1);
		selectByText(driver, type_Select1, Select_search_value);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

		Step_End(5, "Enter the required CAR No. in the CAR No search field", test, test1);

		Step_Start(6, "Then click on the search button", test, test1);

		click(driver, globalSearch_Frame_SearchButton);

		Step_End(6, "Then click on the search button", test, test1);

		Step_Start(7, "System will show the CAR No", test, test1);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		Step_End(7, "System will show the CAR No", test, test1);

		Step_Start(8, "System will retrieve the CAR", test, test1);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		
		waitInvisible(driver, SelectButton);

		if (isdisplayed(driver, Car_Close) && isElementEnabled(driver, Car_Close)) {

			waitForElement(driver, Car_Close);
			click(driver, Car_Close);

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

		}

		Step_End(8, "System will retrieve the CAR", test, test1);

		Step_Start(9,
				"Ensure that only opened CAR is allowed to edit. If CAR is closed and clicking edit option System validates as \"Closed CAR cannot be edited.\". Click on the ok option.Then click CAR open and open the car",
				test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);

		waitForElement(driver, popup_Message);
		String ActualPopupmessage = getText(driver, popup_Message);

		if (ActualPopupmessage.equals(Car_Open_Popup)) {

			System.out.println(
					"Activity report is saved || Expected : " + Car_Open_Popup + " || Actual : " + ActualPopupmessage);
			Extent_pass(driver,
					"Activity report is saved || Expected : " + Car_Open_Popup + " || Actual : " + ActualPopupmessage,
					test, test1);
		} else {

			System.out.println("Activity report is not saved || Expected : " + Car_Open_Popup + " || Actual : "
					+ ActualPopupmessage);
			Extent_fail(driver, "Activity report is not saved || Expected : " + Car_Open_Popup + " || Actual : "
					+ ActualPopupmessage, test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		waitForElement(driver, CAR_open);
		click(driver, CAR_open);

		waitForElement(driver, popup_Message);
		String ActualPopupmessage2 = getText(driver, popup_Message);

		if (ActualPopupmessage2.equals(Open_popup)) {

			System.out.println(
					"CAR Activity is Opened || Expected : " + Open_popup + " || Actual : " + ActualPopupmessage2);
			Extent_pass(driver,
					"CAR Activity is Opened || Expected : " + Open_popup + " || Actual : " + ActualPopupmessage2, test,
					test1);
		} else {

			System.out.println(
					"CAR Activity is not Opened || Expected : " + Open_popup + " || Actual : " + ActualPopupmessage2);
			Extent_fail(driver,
					"CAR Activity is not Opened || Expected : " + Open_popup + " || Actual : " + ActualPopupmessage2,
					test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_End(9,
				"Ensure that only opened CAR is allowed to edit. If CAR is closed and clicking edit option System validates as \"Closed CAR cannot be edited.\". Click on the ok option.Then click CAR open and open the car",
				test, test1);

		Step_Start(10, "Click on the edit option in the toolbar", test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);

		Step_End(10, "Click on the edit option in the toolbar", test, test1);

		waitForElement(driver, Grid_count);
		String totalcount = getText(driver, Grid_count);

		int prv_count = Integer.parseInt(totalcount);

		Step_Start(11, "Click on the ADD option in the CAR summary tab", test, test1);

		waitForElement(driver, AddAcitivity);
		click(driver, AddAcitivity);

		Step_End(11, "Click on the ADD option in the CAR summary tab", test, test1);

		Step_Start(12, "A new window will be opened as add equipment details", test, test1);

		if (isdisplayed(driver, AddSummary_Tab)) {

			System.out.println("Add equipments tab is displayed");
			Extent_pass(driver, "Add equipments tab is displayed", test, test1);

		} else {

			System.out.println("Add equipments tab is not displayed");
			Extent_fail(driver, "Add equipments tab is not displayed", test, test1);
		}

		Step_End(12, "A new window will be opened as add equipment details", test, test1);

		Step_Start(13, "Select the required Main Activity,Main Activity name,Equipments type and Equipments status",
				test, test1);

		jsClick(driver, MainActivityDropdown);

		waitForElement(driver, Mainactivity_option);
		click(driver, Mainactivity_option);

		jsClick(driver, MainActivityNameDropdown);

		waitForElement(driver, Mainactivity_Name);
		click(driver, Mainactivity_Name);

		jsClick(driver, Eqp_TypeDropdown);

		waitForElement(driver, Eqp_Type_option);
		click(driver, Eqp_Type_option);

		jsClick(driver, Eqp_StausDropdown);

		waitForElement(driver, Eqp_Status_option);
		click(driver, Eqp_Status_option);

		Step_End(13, "Select the required Main Activity,Main Activity name,Equipments type and Equipments status", test,
				test1);

		Step_Start(14, "Click on the ok option", test, test1);

		waitForElement(driver, Click_Ok);
		click(driver, Click_Ok);

		Step_End(14, "Click on the ok option", test, test1);

		Step_Start(15, "Select the added main activity and Click on the remove option in the CAR summary tab", test,
				test1);

		waitForElement(driver, Grid_count);
		String totalcount1 = getText(driver, Grid_count);

		int after_count = Integer.parseInt(totalcount1);

		WebElement newlyadded = driver.findElement(By.xpath("//div[@col-id='mainactdes' and text()='" + MainActivityName
				+ "']/following::div[@col-id='eqptype' and text()='" + Eqp_Type + "']"));

		if (after_count > prv_count) {

			if (newlyadded.isDisplayed()) {

				System.out.println("Given data was added in the grid");
				Extent_pass(driver, "Given data was added in the grid", test, test1);

				Step_End(17,
						"Incase if any activity is in Approved status for that main activity,system will not allow to remove the record.System validates as \"Expense is approved for some selected Equipment type / Equipment Status. Cannot change / remove\"",
						test, test1);

			} else {
				System.out.println("Given data was not added in the grid");
				Extent_fail(driver, "Given data was not added in the grid", test, test1);

			}
		} else {

			System.out.println("Given data was not added in the grid");
			Extent_fail(driver, "Given data was not added in the grid", test, test1);
		}

		Click(driver, newlyadded);

		waitForElement(driver, Remove);
		click(driver, Remove);

		Step_End(15, "Select the added main activity and Click on the remove option in the CAR summary tab", test,
				test1);

		Step_Start(16,
				"Ensure that the selected main activity gets removed if the activities are in Draft,Submitted and Rejected status",
				test, test1);

		Step_Start(17,
				"Incase if any activity is in Approved status for that main activity,system will not allow to remove the record.System validates as \"Expense is approved for some selected Equipment type / Equipment Status. Cannot change / remove\"",
				test, test1);

		waitForElement(driver, Remove);

		try {

			WebElement newlyadded2 = driver.findElement(By.xpath("//div[@col-id='mainactdes' and text()='"
					+ MainActivityName + "']/following::div[@col-id='eqptype' and text()='" + Eqp_Type + "']"));

			if (newlyadded2.isDisplayed()) {

				System.out.println("Selected Activity not removed");
				Extent_fail(driver, "Selected Activity not removed", test, test1);
			}

		} catch (Exception e) {

			System.out.println("Selected Activity has removed");
			Extent_pass(driver, "Selected Activity has removed", test, test1);

		}

		WebElement newlyadded3 = driver
				.findElement(By.xpath("//div[@col-id='mainactdes' and text()='" + MainActivityName_Approved
						+ "']/following::div[@col-id='eqptype' and text()='" + Eqp_Type_Approved + "']"));

		Click(driver, newlyadded3);

		waitForElement(driver, Remove);
		click(driver, Remove);

		waitForElement(driver, popup_Message);
		String ActualPopupmessage3 = getText(driver, popup_Message);

		if (ActualPopupmessage3.equals(Approved_popup)) {

			System.out.println("User not able to removed the approved activity || Expected : " + Approved_popup
					+ " || Actual : " + ActualPopupmessage3);
			Extent_pass(driver, "User not able to removed the approved activity || Expected : " + Approved_popup
					+ " || Actual : " + ActualPopupmessage3, test, test1);
		} else {

			System.out.println("Got different popup message || Expected : " + Approved_popup + " || Actual : "
					+ ActualPopupmessage3);
			Extent_fail(driver, "Got different popup message || Expected : " + Approved_popup + " || Actual : "
					+ ActualPopupmessage3, test, test1);
		}

		Step_End(16,
				"Ensure that the selected main activity gets removed if the activities are in Draft,Submitted and Rejected status",
				test, test1);

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_Start(17, "Click on ok", test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
