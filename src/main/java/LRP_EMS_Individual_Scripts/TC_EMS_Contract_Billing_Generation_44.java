package LRP_EMS_Individual_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Contract_Billing_Generation;

public class TC_EMS_Contract_Billing_Generation_44 extends Keywords {

	public void Resetbilling(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		// datas was taken from xlsheet
		String testcase_Name = "TC_EMS_Contract_Billing_Generation_44";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data1 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);

		String Username = data1.get("Username");// 1,2,4-6
		String Password = data1.get("Password");
		String Search = data1.get("Field_Names");
		String Contaract_No = data1.get("Contaract_No");
		String To_Month = data1.get("Month");
		String To_Year = data1.get("Year");
		String Condition_Filter = data1.get("Condition_Filter");
		String Contract_No_Perform = data1.get("Contract_No_Perform");
		String Equipment_Type_Search = data1.get("Contract_number_search");
		String month_select = String.format(EMS_Contract_Billing_Generation.month_click, To_Month);

		Extent_Start(testcase_Name, test, test1);

		navigateUrl(driver, URL);

		
		// login
		LRP_Login(driver, Username, Password);
		moduleNavigate(driver, Search);
		Step_Start(1, " Click add button & select contract no accordingly", test, test1);

		// Adding the contract number

		if (Contract_No_Perform.equals("YES")) {

			List<String> datas = splitAndExpand1(Contaract_No);
			for (String data : datas) {
				waitForElement(driver, Aaddbuttonforcontract);
				safeclick(driver, Aaddbuttonforcontract);
				waitForElement(driver, Ainputcontractnum);
				twoColumnSearchWindow(driver, Equipment_Type_Search, Condition_Filter, data);
			}
		} else {
			
			System.out.println("contract type  was not added");
			Extent_pass(driver, "contract type  was not added", test, test1);
		}
		Step_End(1, " Click add button & select contract no accordingly", test, test1);
		Step_Start(2, " Select Billing period for months & year accordingly", test, test1);
		// selecting the month and year

		waitForElement(driver, AMonthclick);
		safeclick(driver, AMonthclick);
		if (isDisplayed(driver, Monthdroupdwn)) {
			waitForElement(driver, AMonthclick);
			waitForElement(driver, month_select);
			safeclick(driver, month_select);

			waitForElement(driver, yeardroupdwn);
			clearAndType(driver, yeardroupdwn, To_Year);

			Step_End(2, " Select Billing period for months & year accordingly", test, test1);
			Step_Start(3, "type should be by default selected as By Contract", test, test1);
			
			Step_End(3, "type should be by default selected as By Contract", test, test1);

			Step_Start(5, "Click show button once generate message shown", test, test1);
			// safeclick on show bills

			waitForElement(driver, AShowbills);
			safeclick(driver, AShowbills);
			waitForElement(driver, AGriedContractnumber);
			Step_End(5, "Click show button once generate message shown", test, test1);
			Step_Start(6, "System should listing billing details once required button is pressed", test, test1);
			waitForElement(driver, contractnumbersearch);
			// searching the contract number in the gird

			List<String> datas = splitAndExpand1(Contaract_No);

			for (String data : datas) {
				waitForElement(driver, contractnumbersearch);
				clearAndType(driver, contractnumbersearch, data);

				String contract_select = String.format(EMS_Contract_Billing_Generation.contract_se, data);
				if (isDisplayed(driver, contract_select)) {
					System.out.println("contract number was displayed in gird as" + data);
					Extent_pass(driver, "**contract number was displayed in gird as**" + data, test, test1);

					scrollUsingElement(driver, Approved);

					// searching the contract number in the normal billing

					String Reference_number = String.format(EMS_Contract_Billing_Generation.ref_num, data);
					if (isDisplayed(driver, Reference_number)) {
						System.out.println("contract number was displayed in gird as Reference number as" + data);
						Extent_pass(driver,
								"****contract number was displayed in the  Reference field in the gird  as***" + data,
								test, test1);
						Extent_call(test, test1,
								"****contract number was displayed in the  Reference field in the gird  as***" + data);
					} else {
						System.out.println("contract number was not displayed in gird");
						Extent_fail(driver, "contract number was not displayed in gird", test, test1);

					}
				}
			}
			Step_End(6, "System should listing billing details once required button is pressed", test, test1);
			scrollTop(driver);
			Step_Start(7, "Click reset button & grid details should be get cleared", test, test1);
			waitForElement(driver, AResetButton);
			safeclick(driver, AResetButton);

			
			if (isDisplayed(driver, Girdtable)) {
				System.out.println("***Grid was not Cleared after clicking the Reset Button***");
				Extent_fail(driver, "***Grid was not Cleared after clicking the Reset Button*** ", test, test1);

			} else {
				System.out.println("***Grid was Cleared after clicking the Reset Button***");
				Extent_pass(driver, "***Grid was Cleared after clicking the Reset Button*** ", test, test1);
				Extent_call(test, test1, "***Grid was Cleared after clicking the Reset Button*** ");

			}
			Step_End(7, "Click reset button & grid details should be get cleared", test, test1);
			Extent_completed(testcase_Name, test, test1);
		}
	}

}
