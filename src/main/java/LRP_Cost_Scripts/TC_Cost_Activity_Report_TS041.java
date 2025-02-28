package LRP_Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS041 extends Keywords {

	public void Cost_Activity_Report_TS041(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS041";
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

		String Mainactivity_option = String.format(SelectOption, MainActivity);
		String Mainactivity_Name = String.format(SelectOption, MainActivityName);
		String Eqp_Type_option = String.format(SelectOption, Eqp_Type);
		String Eqp_Status_option = String.format(SelectOption, Eqp_Status);

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select the required agency.",
				test, test1);

		verifyMainMenu(driver);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.",
				test, test1);

		Step_Start(2, ".Enter the screen name as Cost Activity Report in module search field", test, test1);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(2, ".Enter the screen name as Cost Activity Report in module search field", test, test1);

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

		Step_Start(8, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		
		waitInvisible(driver, SelectButton);

		if (isdisplayed(driver, Car_Close) && isElementEnabled(driver, Car_Close)) {

			waitForElement(driver, Car_Close);
			click(driver, Car_Close);

			waitForElement(driver, popup_Message_Ok_Button);
			click(driver, popup_Message_Ok_Button);

		}

		Step_End(8, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		Step_Start(9,
				"Ensure that only opened CAR is allowed to edit. If CAR is closed and clicking edit option System validates as Closed CAR cannot be edited Click on the ok option.Then click CAR open and open the car",
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

		Step_End(9,
				"Ensure that only opened CAR is allowed to edit. If CAR is closed and clicking edit option System validates as Closed CAR cannot be edited Click on the ok option.Then click CAR open and open the car",
				test, test1);

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_Start(10, "Click on the edit option in the toolbar", test, test1);

		waitForElement(driver, Edit_Button_toolBar);
		click(driver, Edit_Button_toolBar);

		waitForElement(driver, Grid_count);
		String totalcount = getText(driver, Grid_count);

		int prv_count = Integer.parseInt(totalcount);

		Step_End(10, "Click on the edit option in the toolbar", test, test1);

		Step_Start(11, "Click on the ADD option in the CAR summary tab", test, test1);

		waitForElement(driver, AddAcitivity);
		click(driver, AddAcitivity);

		Step_End(11, "Click on the ADD option in the CAR summary tab", test, test1);

		Step_Start(12, "A new window will be opened as add equipment details.", test, test1);

		if (isdisplayed(driver, AddSummary_Tab)) {

			System.out.println("Add equipments tab is displayed");
			Extent_pass(driver, "Add equipments tab is displayed", test, test1);

		} else {

			System.out.println("Add equipments tab is not displayed");
			Extent_fail(driver, "Add equipments tab is not displayed", test, test1);
		}

		Step_End(12, "A new window will be opened as add equipment details.", test, test1);

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

		Step_Start(15, "Ensure that main activity gets added to the AG grid in CAR summary tab", test, test1);

		waitForElement(driver, Grid_count);
		String totalcount1 = getText(driver, Grid_count);

		int after_count = Integer.parseInt(totalcount1);

		if (after_count > prv_count) {

			WebElement newlyadded = driver.findElement(By.xpath("//div[@col-id='mainactdes' and text()='"
					+ MainActivityName + "']/following::div[@col-id='eqptype' and text()='" + Eqp_Type + "']"));

			if (newlyadded.isDisplayed()) {

				System.out.println("Given data was added in the grid");
				Extent_pass(driver, "Given data was added in the grid", test, test1);

			} else {
				System.out.println("Given data was not added in the grid");
				Extent_fail(driver, "Given data was not added in the grid", test, test1);

			}
		} else {

			System.out.println("Given data was not added in the grid");
			Extent_fail(driver, "Given data was not added in the grid", test, test1);
		}

		Step_End(15, "Ensure that main activity gets added to the AG grid in CAR summary tab", test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
