package LRP_Cost_Scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS046 extends Keywords {

	public void Cost_Activity_Report_TS046(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS046";
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
		String Export_Filename = data.get("Export_Filename");
		String Mainactivity_Column = data.get("Mainactivity_Column");
		String Eqp_Column = data.get("Eqp_Column");

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

		Step_Start(7, "System will show the CAR No. and Click on the select button", test, test1);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		Step_End(7, "System will show the CAR No. and Click on the select button", test, test1);

		Step_Start(8, "System will retrieve the CAR", test, test1);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

		Step_End(8, "System will retrieve the CAR", test, test1);
		
		Step_Start(9, "Click on the click for more options which is available at the right corner of AG Grid", test,
				test1);

		waitForElement(driver, CAR_TreeTable);
		click(driver, CAR_TreeTable);

		List<WebElement> Mainactivities = driver
				.findElements(By.xpath("//div[@role='gridcell' and @col-id='mainactdes']"));
		List<WebElement> EqpTypes = driver.findElements(By.xpath("//div[@role='gridcell' and @col-id='eqptype']"));

		List<String> Main_Activities_desc = new ArrayList<String>();
		List<String> Grid_EqpType = new ArrayList<String>();

		for (WebElement activity : Mainactivities) {

			String Mainactivity = activity.getText();

			Main_Activities_desc.add(Mainactivity);

		}

		for (WebElement element : EqpTypes) {

			String text = element.getText();

			Grid_EqpType.add(text);

		}
		
		Step_End(9, "Click on the click for more options which is available at the right corner of AG Grid", test,
				test1);
		
		Step_Start(10, "Click on the CSV option", test, test1);

		String Excelpath = Verify_FileDownloaded1(driver, Export_Filename, CAR_TreeTable_CSV);
		
		Step_End(10, "Click on the CSV option", test, test1);
		
		Step_Start(11, "Ensure that the CAR details gets downloaded as file", test, test1);

		List<String> Excel_mainactivity = readColumnDataFromCSV(Excelpath, Mainactivity_Column);

		List<String> Excel_EqpType = readColumnDataFromCSV(Excelpath, Eqp_Column);

		for (int i = 0; i < Main_Activities_desc.size(); i++) {

			String gridmainactivity = Main_Activities_desc.get(i);
			String Excelmainactivity = Excel_mainactivity.get(i);
			String gridEqpType = Grid_EqpType.get(i);
			String ExcelEqpType = Excel_EqpType.get(i);

			if (Excelmainactivity.equals(gridmainactivity) && ExcelEqpType.equals(gridEqpType)) {

				System.out.println("Grid row " + (i + 1) + " values are displayed in the CSV file");
				Extent_pass(driver, "Grid row " + (i + 1) + " values are displayed in the CSV file", test, test1);
				Extent_pass(driver,
						"Expected activity : " + gridmainactivity + " || Actual activity : " + Excelmainactivity, test,
						test1);
				Extent_pass(driver,
						"Expected Equipment type : " + gridEqpType + " || Actual Equipment type : " + gridmainactivity,
						test, test1);

			} else {

				System.out.println("Grid row " + (i + 1) + " values are not displayed in the CSV file");
				Extent_fail(driver, "Grid row " + (i + 1) + " values are not displayed in the CSV file", test, test1);
				Extent_fail(driver,
						"Expected activity : " + gridmainactivity + " || Actual activity : " + Excelmainactivity, test,
						test1);
				Extent_fail(driver,
						"Expected Equipment type : " + gridEqpType + " || Actual Equipment type : " + gridmainactivity,
						test, test1);
			}

		}
		
		Step_End(11, "Ensure that the CAR details gets downloaded as file", test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
