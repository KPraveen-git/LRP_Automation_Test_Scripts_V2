package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TS_EMS_Contract_Registration_19 extends Keywords {

	public void EMS_Contract_Registration_19(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) throws Exception {

		String testcase_Name="TS_EMS_Contract_Registration_19";
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
		String sizevalue = data.get("sizevalue");
		String leasevalue = data.get("leasevalue");
		String PerDiem_Value = data.get("PerDiem_Value");
		String tc_sizevalue = data.get("tc_sizevalue");
		String locationhier_value = data.get("locationhier_value");
		String location_value1 = data.get("location_Value1");
		String sizetype_pickup_value = data.get("sizetype_pickup_value");
		String dropoffcharges_radio = data.get("dropoffcharges_radio");
		String condtdropoff_radio = data.get("condtdropoff_radio");
		String depreciation_type = data.get("depreciation_type");
		String pickup_quantity_popup_msg = data.get("pickup_quantity_popup_msg");
		String termcharge_pickup_value = data.get("termcharge_pickup_value");
		String date_Picker = data.get("date_Picker");
		String from_date = data.get("from_date");
		String to_date = data.get("to_date");
		String conditionFilter = data.get("conditionFilter");
		String Lease_Code_search = data.get("Lease_Code_search");
		String Lessor_code_search = data.get("Lessor_code_search");
		String lessee_code_Search = data.get("lessee_code_Search");
		String Ports_Code_Search = data.get("Ports_Code_Search");


		
		
		
		String sizevalue_Option =  String.format(sizevalue_option,  sizevalue); 
		
		
		String lease_Option =  String.format(lease_option,  leasevalue); 
		
		String contype_Opt1 =  String.format(contype_opt1,  ContractType); 
		
		
		
		String locationhier_Field =  String.format(locationhier_field,  locationhier_value);
		
		
		String sizevalue_Field =  String.format(sizevalue_field,  tc_sizevalue);

		String depreciation_Option =  String.format(depreciation_option,  depreciation_type);
	
		
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
			waitForElement(driver, contype_Opt1);
			safeclick(driver, contype_Opt1);


			waitForElement(driver, Dropdown);
			String Dropdown_option = getText(driver, Dropdown);
			System.out.println("Dropdown_option: "+Dropdown_option);

			if (Dropdown_option.equals(ContractType)) {
				System.out.println(
						"Matched || Expected value was : " + ContractType + " || Actual value was : " + Dropdown_option);
				Extent_pass(driver,
						"Matched || Expected value was : " + ContractType + " || Actual value was : " + Dropdown_option,
						test, test1);
			} else {
				System.out.println(
						"Different dropdown option was not selected and the selected option was : " + Dropdown_option);
				Extent_fail(driver,
						"NotMatched || Expected value was : " + ContractType + " || Actual value was : " + Dropdown_option,
						test, test1);
			}

			waitForElement(driver, Eleasekind_searchicon);
			safeclick(driver, Eleasekind_searchicon);
			twoColumnSearchWindow(driver, Lease_Code_search, conditionFilter, leasekind);


			

			waitForElement(driver, Elessorcode_searchicon);
			safeclick(driver, Elessorcode_searchicon);
			
			twoColumnSearchWindow(driver, Lessor_code_search, conditionFilter, lessor_code);



			waitForElement(driver, Elessee_searchicon);
			safeclick(driver, Elessee_searchicon);
			
			twoColumnSearchWindow(driver, lessee_code_Search, conditionFilter, lessee_code);

			waitForElement(driver, Evaild_from);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Evaild_from, from_date);
			} else {
				waitForElement(driver, Evaild_from);
				clearAndType(driver, Evaild_from, from_date);
			}
			// Selecting the to Date
			waitForElement(driver, Evaild_to);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Evaild_to, to_date);
			} else {
				waitForElement(driver, Evaild_to);
				clearAndType(driver, Evaild_to, to_date);
			}


			// *********************SIZETYPE TAB*************************
			Step_Start(1, " Ensure system should validate if user try to save contract registration screen once Qty defined 10 in size/type tab & if try to give more than defined qty in terms & charges ", test, test1);

			waitForElement(driver, Esizeandtype_tab);
			safeclick(driver, Esizeandtype_tab);

			waitForElement(driver, Esizeandtype_Field);
			safeclick(driver, Esizeandtype_Field);
			waitForElement(driver, sizevalue_Option);
			click(driver, sizevalue_Option);


			waitForElement(driver, sizetypeDropdownoption);
			String sizetypeDropdown_option = getText(driver, sizetypeDropdownoption);
			System.out.println("sizetypeDropdown_option: "+sizetypeDropdown_option);

			if (sizetypeDropdown_option.equals(sizevalue)) {
				System.out.println("Matched || Expected value was : " + sizevalue + " || Actual value was : "
						+ sizetypeDropdown_option);
				Extent_pass(driver,
						"Matched || Expected value was : " + sizevalue + " || Actual value was : " + sizetypeDropdown_option,
						test, test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + sizevalue + " || Actual value was : "
						+ sizetypeDropdown_option);
				Extent_fail(driver, "NotMatched || Expected value was : " + sizevalue + " || Actual value was : "
						+ sizetypeDropdown_option, test, test1);
			}

			waitForElement(driver, Eleasechargetype_Field);
			safeclick(driver, Eleasechargetype_Field);
			waitForElement(driver, lease_Option);
			safeclick(driver, lease_Option);


			waitForElement(driver, leasetypeDropdownoption);
			String leasetypeDropdown_option = getText(driver, leasetypeDropdownoption);
			System.out.println("leasetypeDropdown_option: "+leasetypeDropdown_option);

			if (leasetypeDropdown_option.equals(leasevalue)) {
				System.out.println("Matched || Expected value was : " + leasevalue + " || Actual value was : "
						+ leasetypeDropdown_option);
				Extent_pass(driver, "Matched || Expected value was : " + leasevalue + " || Actual value was : "
						+ leasetypeDropdown_option, test, test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + leasevalue + " || Actual value was : "
						+ leasetypeDropdown_option);
				Extent_fail(driver, "NotMatched || Expected value was : " + leasevalue + " || Actual value was : "
						+ leasetypeDropdown_option, test, test1);
			}

			waitForElement(driver, sizetype_pickup_quantity_D);
			sendKeys(driver, sizetype_pickup_quantity_D, sizetype_pickup_value);

			safeclick(driver, Eperdiem_field);
			clear(driver, Eperdiem_field);
			sendKeys(driver, Eperdiem_field, PerDiem_Value);


			waitForElement(driver, Esizeaddbutton);
			safeclick(driver, Esizeaddbutton);

			// **************termcharges mandatory***********************


			waitForElement(driver, Etermandcharges);
			safeclick(driver, Etermandcharges);

			waitForElement(driver, ELocationhierarchy_field);
			click(driver, ELocationhierarchy_field);
			waitForElement(driver, locationhier_Field);
			click(driver, locationhier_Field);

			waitForElement(driver, locationDropdownoption);
			String locationDropdown_option = getText(driver, locationDropdownoption);
			System.out.println("locationDropdown_option: "+locationDropdown_option);

			if (locationDropdown_option.equals(locationhier_value)) {
				System.out.println("Matched || Expected value was : " + locationhier_value + " || Actual value was : "
						+ locationDropdown_option);
				Extent_pass(driver, "Matched || Expected value was : " + locationhier_value + " || Actual value was : "
						+ locationDropdown_option, test, test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + locationhier_value + " || Actual value was : "
						+ locationDropdown_option);
				Extent_fail(driver, "NotMatched || Expected value was : " + locationhier_value + " || Actual value was : "
						+ locationDropdown_option, test, test1);
			}

			waitForElement(driver, Elocationaddbutton);
			safeclick(driver,Elocationaddbutton);	
			twoColumnSearchWindow(driver, Ports_Code_Search, conditionFilter, location_value1);

			waitForElement(driver, Etermchange_size);
			click(driver, Etermchange_size);
			waitForElement(driver, sizevalue_Field);
			click(driver, sizevalue_Field);

			Step_End(1, " Ensure system should validate if user try to save contract registration screen once Qty defined 10 in size/type tab & if try to give more than defined qty in terms & charges ", test, test1);
			waitForElement(driver, termsizetypeDropdownoption);
			String termsizetypeDropdown_option = getText(driver, termsizetypeDropdownoption);
			System.out.println("termsizetypeDropdown_option: "+termsizetypeDropdown_option);

			if (termsizetypeDropdown_option.equals(tc_sizevalue)) {
				System.out.println("Matched || Expected value was : " + tc_sizevalue + " || Actual value was : "
						+ termsizetypeDropdown_option);
				Extent_pass(driver, "Matched || Expected value was : " + tc_sizevalue + " || Actual value was : "
						+ termsizetypeDropdown_option, test, test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + tc_sizevalue + " || Actual value was : "
						+ termsizetypeDropdown_option);
				Extent_fail(driver, "NotMatched || Expected value was : " + tc_sizevalue + " || Actual value was : "
						+ termsizetypeDropdown_option, test, test1);
			}
			waitForElement(driver, termcharge_pckup_quantity_D);
			sendKeys(driver, termcharge_pckup_quantity_D, termcharge_pickup_value);
			waitForElement(driver, tc_dropoffcharges_radio);
			checkBox(driver, tc_dropoffcharges_radio, dropoffcharges_radio);
			waitForElement(driver, tc_condtdropoff_radio);
			checkBox(driver, tc_condtdropoff_radio, condtdropoff_radio);

			waitForElement(driver, Etermchange_addbutton);
			click(driver, Etermchange_addbutton);
			// ************depreciation tab***************
			Step_Start(2, " Ensure that system should validate as 'The cumulative Pick Up Quantity for the locations assigned for the Sz./Tp exceeds the pick up quantity assigned for the Sz./Tp'.", test, test1);
			waitForElement(driver, Edepreciationtab);
			safeclick(driver, Edepreciationtab);
			waitForElement(driver, Edepreciation_Type);
			click(driver, Edepreciation_Type);
			waitForElement(driver, depreciation_Option);
			click(driver, depreciation_Option);
			waitForElement(driver, Edepreciationsave_button);
			safeclick(driver, Edepreciationsave_button);

			waitForElement(driver, size_exceed_popup);
			String error_msg = getText(driver, size_exceed_popup);
			if (error_msg.equals(pickup_quantity_popup_msg)) {
				System.out.println("Matched || Expected value was : " + pickup_quantity_popup_msg
						+ " || Actual value was : " + error_msg);
				Extent_pass(driver, "Matched || Expected value was : " + pickup_quantity_popup_msg
						+ " || Actual value was : " + error_msg, test, test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + pickup_quantity_popup_msg
						+ " || Actual value was : " + error_msg);
				Extent_fail(driver, "NotMatched || Expected value was : " + pickup_quantity_popup_msg
						+ " || Actual value was : " + error_msg, test, test1);
			}
			Step_End(2, " Ensure that system should validate as 'The cumulative Pick Up Quantity for the locations assigned for the Sz./Tp exceeds the pick up quantity assigned for the Sz./Tp'.", test, test1);


			Extent_completed(testcase_Name, test, test1);

	}
}