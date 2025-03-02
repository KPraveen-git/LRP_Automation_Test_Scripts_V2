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

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

		Step_Start(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);

		navigateUrl(driver, url);

		LRP_Login(driver, username, password);

		Step_End(1,
				"Once login to the application and click on switch profile option and select for the required agency",
				test, test1);

		Step_Start(2, "Enter the screen name as 'Cost Activity Report' in module search field", test, test1);

		verifyMainMenu(driver);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(2, "Enter the screen name as 'Cost Activity Report' in module search field", test, test1);

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

		Step_Start(5, "Enter the CTL CAR No. in the CAR No search field", test, test1);

		Step_Start(6, "Then click on the search button", test, test1);

		Step_Start(7, "System will show the CAR No", test, test1);

		Step_Start(8, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);

		globalValueSearchWindow(driver, Condition, Select_search_value, CAR_No, "", "", "", "");

		Step_End(5, "Enter the CTL CAR No. in the CAR No search field", test, test1);

		Step_End(6, "Then click on the search button", test, test1);

		Step_End(7, "System will show the CAR No", test, test1);

		waitForElement(driver, CAR_Input);
		String retrived_Number = getAttribute(driver, CAR_Input, "value");

		if (retrived_Number.equals(CAR_No)) {

			System.out.println("The given CAR No was retrived || Expected CAR No : " + CAR_No + " || Actual CAR No : "
					+ retrived_Number);
			Extent_pass(driver, "The given CAR No was retrived || Expected CAR No : " + CAR_No + " || Actual CAR No : "
					+ retrived_Number, test, test1);
		} else {
			System.out.println("The given CAR No was not retrived || Expected CAR No : " + CAR_No
					+ " || Actual CAR No : " + retrived_Number);
			Extent_fail(driver, "The given CAR No was not retrived || Expected CAR No : " + CAR_No
					+ " || Actual CAR No : " + retrived_Number, test, test1);
		}
		
		Step_End(8, "Click on the select button.Ensure that the system retrieves the saved CAR", test, test1);
		
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

		List<List<String>> CSVDatas = CSVallColumnData(Excelpath);

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

		DecimalFormat df = new DecimalFormat("#.########");

		for (int i = 0; i < Integer.parseInt(columcount); i++) {

			String headername = Grid_Headers.get(i);
			System.out.println("headername : " + headername);

			String value = Grid_values.get(i); // Expected value from grid
			List<String> Gridcolumnvalue = CSVDatas.get(i); // Values from Excel

			for (String columns : Gridcolumnvalue) {

				String Expectedvalue = columns;

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

		Step_End(11, "Ensure that the CAR details gets downloaded as file", test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
