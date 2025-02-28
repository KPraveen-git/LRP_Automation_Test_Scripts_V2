package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TS_EMS_Contract_Registration_20 extends Keywords {

	public void EMS_Contract_Registration_20(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String testcase_Name="TS_EMS_Contract_Registration_20";
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
		String Remove_Registration_Popup = data.get("Remove_Registration_Popup").trim();
		String date_Picker = data.get("date_Picker");
		String from_date = data.get("from_date");
		String to_date = data.get("to_date");
		String conditionFilter = data.get("conditionFilter");
		String Lease_Code_search = data.get("Lease_Code_search");
		String Lessor_code_search = data.get("Lessor_code_search");
		String lessee_code_Search = data.get("lessee_code_Search");
		String Ports_Code_Search = data.get("Ports_Code_Search");
		
		String contype_Opt1 =  String.format(contype_opt1,  ContractType); 
		
		
		String sizevalue_Option =  String.format(sizevalue_option,  sizevalue);
		
		String lease_Option =  String.format(lease_option,  leasevalue);
		
		
		String locationhier_Field =  String.format(locationhier_field,  locationhier_value);
		
		
		String sizevalue_Field =  String.format(sizevalue_field,  tc_sizevalue);


		
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
								"Matched || Expected value was : " + ContractType + " || Actual value was : " + Dropdown_option);
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
					waitForElement(driver, Esizeandtype_tab);
					click(driver, Esizeandtype_tab);

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



					safeclick(driver, Eperdiem_field);
					clear(driver, Eperdiem_field);
					sendKeys(driver, Eperdiem_field, PerDiem_Value);


					waitForElement(driver, Esizeaddbutton);
					safeclick(driver, Esizeaddbutton);

					// **************termcharges mandatory***********************
					Step_Start(1, " Ensure system should clear all location defined with size/type for Hierarchy Details and Location grid which is removed in size/type tab ", test, test1);

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

					waitForElement(driver, Etermchange_addbutton);
					click(driver, Etermchange_addbutton);

					safeclick(driver, Esizeandtype_tab);
					waitForElement(driver, grid_data_D);
					safeclick(driver, grid_data_D);
					waitForElement(driver, remove_btn_D);
					safeclick(driver, remove_btn_D);
					
					waitForElement(driver, selected_sizetype_remove_popup_1);
					String Remove_Popup = getText(driver, selected_sizetype_remove_popup_1);
					System.out.println(Remove_Popup);

					if (Remove_Registration_Popup.equals(Remove_Popup)) {
						System.out.println("Matched || Expected value was : " + Remove_Registration_Popup
								+ " || Actual value was : " + Remove_Popup);
						Extent_pass(driver, "Matched || Expected value was : " + Remove_Registration_Popup
								+ " || Actual value was : " + Remove_Popup, test, test1);
					} else {
						System.out.println("NotMatched || Expected value was : " + Remove_Registration_Popup
								+ " || Actual value was : " + Remove_Popup);
						Extent_fail(driver, "NotMatched || Expected value was : " + Remove_Registration_Popup
								+ " || Actual value was : " + Remove_Popup, test, test1);
					}
					waitForElement(driver, selected_sizetype_remove_yes_D);
					safeclick(driver, selected_sizetype_remove_yes_D);
					waitForElement(driver, Etermandcharges);
					safeclick(driver, Etermandcharges);
					
			
					if (!isDisplayed(driver, Location_Value)) {
						System.out.println("location  cleared in terms and charges tab");
						Extent_pass(driver, "location cleared in terms and charges tab", test, test1);
					} else {
						System.out.println("location not cleared in terms and charges tab");
						Extent_fail(driver, "location not cleared in terms and charges tab", test, test1);
					}
					Step_End(1, " Ensure system should clear all location defined with size/type for Hierarchy Details and Location grid which is removed in size/type tab ", test, test1);
					Extent_completed(testcase_Name, test, test1);				
	}
}