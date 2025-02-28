package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TS_EMS_Contract_Registration_18 extends Keywords {

	public void EMS_Contract_Registration_18(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) throws Exception {

		String testcase_Name="TS_EMS_Contract_Registration_18";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		String Username = data.get("Username");
		String Password = data.get("Password");
		String Search_input = data.get("Search_input");
		String contract_no = data.get("contract_no");
		String ContractType = data.get("ContractType");
		String leasekind = data.get("leasekind");
		String lessor_code = data.get("lessor_code");
		String lessee_code = data.get("lessee_code");
		String From_Date_Edit = data.get("From_Date_Edit");
		String Date_Popup = data.get("Date_Popup");
		String To_Date_Edit = data.get("To_Date_Edit");
		String contractage = data.get("contractage");
		String contract_category = data.get("contract_category");
		String service_input = data.get("service_input");
		String eff_date = data.get("eff_date");
		String trade_input = data.get("trade_input");
		String remarkstext = data.get("remarkstext");
		String lessorref_input = data.get("lessorref_input");
		String validprefix_input = data.get("validprefix_input");
		String oneway_checkbox = data.get("oneway_checkbox");
		String purchase_checkbox = data.get("purchase_checkbox");
		String unitteu_input = data.get("unitteu_input");
		String dropoff_checkbox = data.get("dropoff_checkbox");
		String offhire_input = data.get("offhire_input");
		String currency_input = data.get("currency_input");
		String diallow_input = data.get("diallow_input");
		String difee_input = data.get("difee_input");
		String billpay_input = data.get("billpay_input");
		String buildup_input = data.get("buildup_input");
		String builddown_input = data.get("builddown_input");
		String minperiod_input = data.get("minperiod_input");
		String From_date_Entered = data.get("From_date_Entered");
		String To_Date_entered = data.get("To_Date_entered");
		String date_Picker = data.get("date_Picker");
		String conditionFilter = data.get("conditionFilter");
		String Lease_Code_search = data.get("Lease_Code_search");
		String Lessor_code_search = data.get("Lessor_code_search");
		String lessee_code_Search = data.get("lessee_code_Search");
		String To_Date = data.get("To_Date");



		
		String contype_opt1 =  String.format(contype_opt,  ContractType); 
		String unit_Teu =  String.format(unitteu,  unitteu_input); 
		String con_Cat =  String.format(con_cat,  contract_category); 
		String currency_Value =  String.format(currency_value,  contract_category); 
		String diallow_Value =  String.format(diallow_value,  diallow_input); 
		String billpay_Value =  String.format(billpay_value,  billpay_input); 


		String from_date = data.get("from_date");

		// login

		Extent_Start(testcase_Name, test, test1);


		// login
		navigateUrl(driver, url);
		
		LRP_Login(driver, Username, Password);

		Extent_call(test, test1, "Enter module name in searchbox & click the module");



		
		moduleNavigate(driver, Search_input);



		waitForElement(driver, Esave_button);
		waitForElement(driver, Econtractno_field);
		click(driver, Econtractno_field);
		sendKeys(driver, Econtractno_field, contract_no);


		waitForElement(driver, Econtracttype_field);
		click(driver, Econtracttype_field);
		waitForDisplay(driver, contract_types);
		if (!isDisplayed(driver, contract_types)) {
			click(driver, Econtracttype_field);
		}

		waitForElement(driver, contype_opt1);
		click(driver, contype_opt1);

		waitForElement(driver, Eleasekind_searchicon);
		click(driver, Eleasekind_searchicon);
		

		twoColumnSearchWindow(driver, Lease_Code_search, conditionFilter, leasekind);

		waitForElement(driver, Elessorcode_searchicon);
		click(driver, Elessorcode_searchicon);
		twoColumnSearchWindow(driver, Lessor_code_search, conditionFilter, lessor_code);


		
		
		waitForElement(driver, Elessee_searchicon);
		click(driver, Elessee_searchicon);
		twoColumnSearchWindow(driver, lessee_code_Search, conditionFilter, lessee_code);


		Step_Start(1, "Ensure system should validate if user try to save with From date greater than To date.", test, test1);

		waitForElement(driver, Evaild_from);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Evaild_from, from_date);
		} else {
			waitForElement(driver, Evaild_from);
			clearAndType(driver, Evaild_from, from_date);
		}
		
		waitForElement(driver, Evaild_to);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Evaild_to, To_Date);
		} else {
			waitForElement(driver, Evaild_to);
			clearAndType(driver, Evaild_to, To_Date);
		}


		waitForElement(driver, Evaild_from);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Evaild_from, From_Date_Edit);
		} else {
			waitForElement(driver, Evaild_from);
			clearAndType(driver, Evaild_from, From_Date_Edit);
		}


		

		waitForElement(driver, Evaild_from);
		String Fromdate_edit = getAttribute(driver, Evaild_from, "value");
		waitForElement(driver, Evaild_to);
		String Todate = getAttribute(driver, Evaild_to, "value");
		if (!Fromdate_edit.equals(Todate)) {
			// comparing from date after to date
			System.out.println(
					"NotMatched || Expected value was : " + Fromdate_edit + " || Actual value was : " + Todate);
			Extent_pass(driver,
					"NotMatched || Expected value was : " + Fromdate_edit + " || Actual value was : " + Todate, test,
					test1);
		} else {
			System.out.println("Matched || Expected value was : " + Fromdate_edit + " || Actual value was : " + Todate);
			Extent_fail(driver, "Matched || Expected value was : " + Fromdate_edit + " || Actual value was : " + Todate,
					test, test1);
		}

		waitForElement(driver, Ems_Savebtn);
		click(driver, Ems_Savebtn);
		if (isDisplayed(driver, Date_PopUP)) {
			Extent_pass(driver, "Popup is displayed", test, test1);
			System.out.println("Popup is displayed");

		} else {
			System.out.println("popup is not displayed");
			Extent_fail(driver, "popup is not displayed", test, test1);
		}

		Step_End(1, "Ensure system should validate if user try to save with From date greater than To date.", test, test1);


		Step_Start(2, "Ensure that system should validate as 'Valid From should be before the Valid To'.", test, test1);


		waitForElement(driver, Date_PopUP);
		String DatepopUp = getText(driver, Date_PopUP);
		System.out.println(DatepopUp);
		if (DatepopUp.equals(Date_Popup)) {
			System.out.println("Matched || Expected value was : " + DatepopUp + " || Actual value was : " + Date_Popup);
			Extent_pass(driver, "Matched || Expected value was : " + DatepopUp + " || Actual value was : " + Date_Popup,
					test, test1);
		} else {
			System.out.println(
					"NotMatched || Expected value was : " + DatepopUp + " || Actual value was : " + Date_Popup);
			Extent_fail(driver,
					"NotMatched || Expected value was : " + DatepopUp + " || Actual value was : " + Date_Popup, test,
					test1);

		}


		Step_End(2, "Ensure that system should validate as 'Valid From should be before the Valid To'.", test, test1);

		waitForElement(driver, Evaild_to);
		if (date_Picker.equalsIgnoreCase("Yes")) {
			selectDatePicker(driver, Evaild_to, To_Date_Edit);
		} else {
			waitForElement(driver, Evaild_to);
			clearAndType(driver, Evaild_to, To_Date_Edit);
		}


		waitForElement(driver, Evaild_to);
		String Todate_edit = getAttribute(driver, Evaild_to, "value");
		String fromdate = getAttribute(driver, Evaild_from, "value");
		if (!Todate_edit.equals(fromdate)) {

			System.out.println(
					"NotMatched || Expected value was : " + fromdate + " || Actual value was : " + Todate_edit);
			Extent_pass(driver,
					"NotMatched || Expected value was : " + fromdate + " || Actual value was : " + Todate_edit, test,
					test1);
		} else {
			System.out.println("Matched || Expected value was : " + fromdate + " || Actual value was : " + Todate_edit);
			Extent_fail(driver, "Matched || Expected value was : " + fromdate + " || Actual value was : " + Todate_edit,
					test, test1);
		}

		String todate = To_Date_entered;
		String fromdate1 = From_date_Entered;
		String newvalue1 = fromdate1.replace("/", "").trim();
		int num1 = Integer.parseInt(newvalue1);

		String newvalue2 = todate.replace("/", "").trim();
		int num2 = Integer.parseInt(newvalue2);

		if (num1 < num2) {
			System.out.println("Valid From should is before the Valid To");
			System.out.println("Valid From should is before the Valid To");
			Extent_pass(driver, "Valid From should is before the Valid To", test, test1);
		} else {
			System.out.println("Valid From should is not before the Valid To");
			Extent_fail(driver, "Valid From should is not before the Valid To", test, test1);
		}

		// *************Registration non-mandatory fields**************

		if (!contractage.equals("")) {
			waitForElement(driver, contract_age);

			try {
				sendKeys(driver, contract_age, contractage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("contractage " + "Input Not Available in : " + File_Path);
		}

		if (!contract_category.equals("")) {
			waitForElement(driver, contractcate);
			click(driver, contractcate);
			try {
				waitForElement(driver, con_Cat);
				click(driver, con_Cat);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("contract_category " + "Input Not Available in : " + File_Path);
		}

		if (!service_input.equals("")) {
			try {
				waitForElement(driver, service_searchicon);
				click(driver, service_searchicon);
				waitForElement(driver, service_searchfield);
				sendKeys(driver, service_searchfield, service_input);
				waitForElement(driver, service_selectbtn);
				click(driver, service_selectbtn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("service_input36 " + "Input Not Available in : " + File_Path);
		}

		if (!trade_input.equals("")) {
			try {
				waitForElement(driver, trade_searchicon);
				click(driver, trade_searchicon);
				waitForElement(driver, service_searchfield);
				sendKeys(driver, service_searchfield, trade_input);
				waitForElement(driver, service_selectbtn);
				click(driver, service_selectbtn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("trade_input " + "Input Not Available in : " + File_Path);
		}

		if (!eff_date.equals("")) {


			waitForElement(driver, effective_date);
			
			waitForElement(driver, effective_date);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, effective_date, eff_date);
			} else {
				waitForElement(driver, effective_date);
				clearAndType(driver, effective_date, eff_date);
			}
			
			
		} else {
			System.out.println("eff_date " + "Input Not Available in : " + File_Path);
		}

		if (!remarkstext.equals("")) {
			waitForElement(driver, remarks);
			try {
				sendKeys(driver, remarks, remarkstext);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("remarkstext " + "Input Not Available in : " + File_Path);
		}

		if (!lessorref_input.equals("")) {
			waitForElement(driver, lessor_ref);
			try {
				sendKeys(driver, lessor_ref, lessorref_input);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("lessorref_input " + "Input Not Available in : " + File_Path);
		}

		if (!validprefix_input.equals("")) {
			try {
				waitForElement(driver, valid_prefix_addicon);
				click(driver, valid_prefix_addicon);
				waitForElement(driver, service_searchfield);
				sendKeys(driver, service_searchfield, validprefix_input);
				waitForElement(driver, valid_prefix_select);
				click(driver, valid_prefix_select);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("validprefix_input " + "Input Not Available in : " + File_Path);
		}

		checkBox(driver, oneway, oneway_checkbox);
		checkBox(driver, purchase, purchase_checkbox);

		if (!unitteu_input.equals("")) {
			waitForElement(driver, dropoff);
			checkBox(driver, dropoff, dropoff_checkbox);
			try {
				waitForElement(driver, unit_teu);
				click(driver, unit_teu);

				waitForElement(driver, unit_Teu);
				click(driver, unit_Teu);
				waitForElement(driver, offhire);
				sendKeys(driver, offhire, offhire_input);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("unitteu_input " + "Input Not Available in : " + File_Path);
		}

		if (!currency_input.equals("")) {
			waitForElement(driver, currency1);
			click(driver, currency1);
			try {
				waitForElement(driver, currency_Value);
				click(driver, currency_Value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("currency_input " + "Input Not Available in : " + File_Path);
		}

		if (diallow_input.equals("Yes")) {
			waitForElement(driver, di_allow);
			click(driver, di_allow);
			try {
				waitForElement(driver, diallow_Value);
				click(driver, diallow_Value);
				waitForElement(driver, difee);
				clear(driver, difee);
				sendKeys(driver, difee, difee_input);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("diallow_input " + "Input Not Available in : " + File_Path);
		}

		if (!billpay_input.equals("")) {
			waitForElement(driver, bill_paytype);
			click(driver, bill_paytype);
			try {
				waitForElement(driver, billpay_Value);
				click(driver, billpay_Value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("billpay_input " + "Input Not Available in : " + File_Path);
		}

		if (!buildup_input.equals("")) {
			waitForElement(driver, buildup_period);
			try {
				sendKeys(driver, buildup_period, buildup_input);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("buildup_input " + "Input Not Available in : " + File_Path);
		}

		if (!builddown_input.equals("")) {
			waitForElement(driver, builddown_period);
			try {
				sendKeys(driver, builddown_period, builddown_input);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("builddown_input " + "Input Not Available in : " + File_Path);
		}

		if (!minperiod_input.equals("")) {
			waitForElement(driver, min_period);
			try {
				sendKeys(driver, min_period, minperiod_input);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("minperiod_input " + "Input Not Available in : " + File_Path);
		}

		Extent_completed(testcase_Name, test, test1);
	}
}
