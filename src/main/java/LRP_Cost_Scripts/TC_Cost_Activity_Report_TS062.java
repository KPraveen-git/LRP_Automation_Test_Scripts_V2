package LRP_Cost_Scripts;

import java.io.IOException;
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

public class TC_Cost_Activity_Report_TS062 extends Keywords {

	public void Cost_Activity_Report_TS062(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS062";
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

		Step_Start(9, "Click on the expense report", test, test1);

		waitForElement(driver, Expense_report);
		click(driver, Expense_report);

		Step_End(9, "Click on the expense report", test, test1);

		Step_Start(10, "Click on the download pdf option", test, test1);

		waitForElement(driver, ApprovedExpenses);
		click(driver, ApprovedExpenses);

		waitForElement(driver, Download_approvedPdf);

		List<WebElement> Mainactivities = driver.findElements(
				By.xpath("//div[@id='CRR_treeTableEXPDB_tbl']//div[@col-id='parentActName' and @role='gridcell']"));

		List<String> Main_Activities_desc = new ArrayList<String>();

		for (WebElement activity : Mainactivities) {

			String Mainactivity = activity.getText();

			Main_Activities_desc.add(Mainactivity);

		}

		String Pdfpath = Verify_FileDownloaded1(driver, CAR_No, Download_approvedPdf);

		Step_End(10, "Click on the download pdf option", test, test1);

		Step_Start(11, "Ensure that the pdf file gets downloaded", test, test1);

		String extracted_path = "";

		try {
			extracted_path = unzip(Pdfpath, "./UnZip_Folder");
			System.out.println("Unzipping completed!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("extracted_path : " + extracted_path);

		String CarNo = readPdf(extracted_path, "CAR No", "Arrival Date");
		String VendorCode = readPdf(extracted_path, "Vendor Code", "Approved Date");

		if (CarNo.equals(CAR_No)) {
			System.out.println(
					"PDF File was downloaded for selected CAR No || Expected : " + CAR_No + " Actual : " + CarNo);
			Extent_pass(driver,
					"PDF File was downloaded for selected CAR No || Expected : " + CAR_No + " Actual : " + CarNo, test,
					test1);

		} else {
			System.out.println(
					"PDF File was not downloaded for selected CAR No || Expected : " + CAR_No + " Actual : " + CarNo);
			Extent_fail(driver,
					"PDF File was not downloaded for selected CAR No || Expected : " + CAR_No + " Actual : " + CarNo,
					test, test1);

		}

		for (String mainactivity : Main_Activities_desc) {

			if (checkpdf(extracted_path, mainactivity) == true) {
				System.out.println("The parent activity " + mainactivity + " details are present in the pdf");
				Extent_pass(driver, "The parent activity " + mainactivity + " details are present in the pdf", test,
						test1);
			} else {
				System.out.println("The parent activity " + mainactivity + " details are not present in the pdf");
				Extent_fail(driver, "The parent activity " + mainactivity + " details are not present in the pdf", test,
						test1);
			}

		}

		List<WebElement> vendorId_ele = driver
				.findElements(By.xpath("//div[@col-id='vendorCode' and @role='gridcell']"));

		List<String> vendorIds = new ArrayList<String>();

		for (WebElement element : vendorId_ele) {

			String vendor = element.getText();

			vendorIds.add(vendor);

		}

		for (String vendorid : vendorIds) {

			if (vendorid.equals(VendorCode)) {

				System.out.println("The selected vendor code was displayed in the pdf || Expected : " + vendorid
						+ " Actual : " + VendorCode);
				Extent_pass(driver, "The selected vendor code was displayed in the pdf || Expected : " + vendorid
						+ " Actual : " + VendorCode, test, test1);
			} else {

				System.out.println("The selected vendor code was not correctly displayed in the pdf || Expected : "
						+ vendorid + " Actual : " + VendorCode);
				Extent_fail(driver, "The selected vendor code was not correctly displayed in the pdf || Expected : "
						+ vendorid + " Actual : " + VendorCode, test, test1);
			}
		}

		Step_End(11, "Ensure that the pdf file gets downloaded", test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
