package LRP_Cost_Scripts;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS045 extends Keywords {

	public void Cost_Activity_Report_TS045(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS045";
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

		waitInvisible(driver, SelectButton);

		Step_End(8, "System will retrieve the CAR", test, test1);

		String columcount = getAttribute(driver, OverviewColumncount, "aria-colcount");

		List<String> Grid_Headers = new ArrayList<String>();

		List<String> Grid_values = new ArrayList<String>();

		for (int i = 1; i <= Integer.parseInt(columcount); i++) {

			WebElement Gridheader = driver
					.findElement(By.xpath("(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview']//div[@aria-colindex='"
							+ i + "' and @role='columnheader'])[last()]"));

			Grid_Headers.add(Gridheader.getText());

			WebElement Gridvalue = driver
					.findElement(By.xpath("(//div[@id='CRR-CRR_jTabbedPane1-CRR_gridSmryOview']//div[@aria-colindex='"
							+ i + "' and @role='gridcell'])[1]"));

			Actions act = new Actions(driver);

			act.moveToElement(Gridvalue).build().perform();

			Grid_values.add(Gridvalue.getText());

		}

		waitForElement(driver, CAR_TreeTable);
		click(driver, CAR_TreeTable);

		Step_End(9, "Click on the click for more options which is available at the right corner of AG Grid", test,
				test1);

		Step_Start(10, "Click on the excel option", test, test1);

		String Excelpath = Verify_FileDownloaded1(driver, Export_Filename, CAR_TreeTable_Excel);

		List<List<String>> ExcelDatas = allColumnData(Excelpath);

		System.out.println("ExcelDatas : " + ExcelDatas);

		DecimalFormat df = new DecimalFormat("#.########");

		for (int i = 0; i < Integer.parseInt(columcount); i++) {

			String headername = Grid_Headers.get(i);
			System.out.println("headername : " + headername);

			String value = Grid_values.get(i); // Expected value from grid
			List<String> Gridcolumnvalue = ExcelDatas.get(i); // Values from Excel

			for (String columns : Gridcolumnvalue) {

				String Expectedvalue = columns; // Preserve original column value

				// Convert numeric values properly without truncation
				if (columns.matches("-?\\d+(\\.\\d+)?")) {
					double num = Double.parseDouble(columns);
					Expectedvalue = df.format(num); // Format correctly to avoid ".0"
				}

				// Compare values
				if (Expectedvalue.equals(value)) {
					System.out
							.println(headername + " values are correctly showing in the downloaded Excel || Expected: "
									+ value + " || Actual: " + Expectedvalue);
					Extent_pass(driver,
							headername + " values are correctly showing in the downloaded Excel || Expected: " + value
									+ " || Actual: " + Expectedvalue,
							test, test1);
				} else {
					System.out.println(
							headername + " values are not correctly showing in the downloaded Excel || Expected: "
									+ value + " || Actual: " + Expectedvalue);
					Extent_fail(driver,
							headername + " values are not correctly showing in the downloaded Excel || Expected: "
									+ value + " || Actual: " + Expectedvalue,
							test, test1);
				}
			}
		}

		Extent_completed(tc_Name, test, test1);

	}

}
