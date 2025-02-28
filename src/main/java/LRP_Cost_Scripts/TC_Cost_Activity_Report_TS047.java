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

public class TC_Cost_Activity_Report_TS047 extends Keywords {

	public void Cost_Activity_Report_TS047(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS047";
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
		String Sheet_Name = data.get("Sheet_Name");
		String Open_Sheet_Name = data.get("Open_Sheet_Name");

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

		Step_Start(9, "Click on the expense report option", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		Step_Start(10, "Click on the export excel option", test, test1);

		String Excelpath = Verify_FileDownloaded1(driver, Export_Filename, Expense_Excel);

		List<String> Open_Excel_mainactivity = readColumnDataFromExcel1(Excelpath, Mainactivity_Column,
				Open_Sheet_Name);

		List<String> Open_Excel_EqpType = readColumnDataFromExcel1(Excelpath, Eqp_Column, Open_Sheet_Name);

		List<WebElement> Mainactivities = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXPDB_tbl']//div[@col-id='parentActName' and @role='gridcell']"));
		List<WebElement> EqpTypes = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXPDB_tbl']//div[@col-id='eqptype' and @role='gridcell']"));

		List<String> OpenMain_Activities_desc = new ArrayList<String>();
		List<String> OpenGrid_EqpType = new ArrayList<String>();

		for (WebElement activity : Mainactivities) {

			String Mainactivity = activity.getText();

			OpenMain_Activities_desc.add(Mainactivity);

		}

		for (WebElement element : EqpTypes) {

			String text = element.getText();

			OpenGrid_EqpType.add(text);

		}

		for (int i = 0; i < OpenMain_Activities_desc.size(); i++) {

			String gridmainactivity = OpenMain_Activities_desc.get(i);
			String Excelmainactivity = Open_Excel_mainactivity.get(i);
			String gridEqpType = OpenGrid_EqpType.get(i);
			String ExcelEqpType = Open_Excel_EqpType.get(i);

			if (Excelmainactivity.equals(gridmainactivity) && ExcelEqpType.equals(gridEqpType)) {

				System.out.println("Open expenses Grid row " + (i + 1) + " values are displayed in the excel file");
				Extent_pass(driver, "Open expenses Grid row " + (i + 1) + " values are displayed in the excel file",
						test, test1);
				Extent_pass(driver,
						"Expected activity : " + gridmainactivity + " || Actual activity : " + Excelmainactivity, test,
						test1);
				Extent_pass(driver,
						"Expected Equipment type : " + gridEqpType + " || Actual Equipment type : " + gridmainactivity,
						test, test1);

			} else {

				System.out.println("Open expenses Grid row " + (i + 1) + " values are not displayed in the excel file");
				Extent_fail(driver, "Open expenses Grid row " + (i + 1) + " values are not displayed in the excel file",
						test, test1);
				Extent_fail(driver,
						"Expected activity : " + gridmainactivity + " || Actual activity : " + Excelmainactivity, test,
						test1);
				Extent_fail(driver,
						"Expected Equipment type : " + gridEqpType + " || Actual Equipment type : " + gridmainactivity,
						test, test1);
			}

		}

		waitForElement(driver, ApprovedExpenses);
		click(driver, ApprovedExpenses);

		List<WebElement> Mainactivities2 = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXPDB_tbl']//div[@col-id='parentActName' and @role='gridcell']"));
		List<WebElement> EqpTypes2 = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXPDB_tbl']//div[@col-id='eqptype' and @role='gridcell']"));

		List<String> Main_Activities_desc = new ArrayList<String>();
		List<String> Grid_EqpType = new ArrayList<String>();

		for (WebElement activity : Mainactivities2) {

			String Mainactivity = activity.getText();

			Main_Activities_desc.add(Mainactivity);

		}

		for (WebElement element : EqpTypes2) {

			String text = element.getText();

			Grid_EqpType.add(text);

		}

		Step_End(9, "Click on the expense report option", test, test1);

		Step_End(10, "Click on the export excel option", test, test1);

		Step_Start(11, "Ensure that the excel with details of open and approve expenses gets downloaded", test, test1);

		List<String> Excel_mainactivity = readColumnDataFromExcel1(Excelpath, Mainactivity_Column, Sheet_Name);

		List<String> Excel_EqpType = readColumnDataFromExcel1(Excelpath, Eqp_Column, Sheet_Name);

		for (int i = 0; i < Main_Activities_desc.size(); i++) {

			String gridmainactivity = Main_Activities_desc.get(i);
			String Excelmainactivity = Excel_mainactivity.get(i);
			String gridEqpType = Grid_EqpType.get(i);
			String ExcelEqpType = Excel_EqpType.get(i);

			if (Excelmainactivity.equals(gridmainactivity) && ExcelEqpType.equals(gridEqpType)) {

				System.out.println("Grid row " + (i + 1) + " values are displayed in the excel file");
				Extent_pass(driver, "Grid row " + (i + 1) + " values are displayed in the excel file", test, test1);
				Extent_pass(driver,
						"Expected activity : " + gridmainactivity + " || Actual activity : " + Excelmainactivity, test,
						test1);
				Extent_pass(driver,
						"Expected Equipment type : " + gridEqpType + " || Actual Equipment type : " + gridmainactivity,
						test, test1);

			} else {

				System.out.println("Grid row " + (i + 1) + " values are not displayed in the excel file");
				Extent_fail(driver, "Grid row " + (i + 1) + " values are not displayed in the excel file", test, test1);
				Extent_fail(driver,
						"Expected activity : " + gridmainactivity + " || Actual activity : " + Excelmainactivity, test,
						test1);
				Extent_fail(driver,
						"Expected Equipment type : " + gridEqpType + " || Actual Equipment type : " + gridmainactivity,
						test, test1);
			}

		}

		Step_End(11, "Ensure that the excel with details of open and approve expenses gets downloaded", test, test1);

		waitForElement(driver, Open_Expenses);
		click(driver, Open_Expenses);

		Extent_completed(tc_Name, test, test1);

	}

}
