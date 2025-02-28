package LRP_EMS_Integrations_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TS_EMS_Contract_Registration_11 extends Keywords {

	public void EMS_Contract_Registration11(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String testcase_Name="TS_EMS_Contract_Registration_11";
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
		String contractage = data.get("contractage");
		String contract_category = data.get("contract_category");
		String eff_date = data.get("eff_date");
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
		String sizevalue = data.get("sizevalue");
		String leasevalue = data.get("leasevalue");
		String PerDiem_Value = data.get("PerDiem_Value");
		String buildup_perdiem_input = data.get("buildup_perdiem_input");
		String DPPbasis_input = data.get("DPPbasis_input");
		String DPPlumpsum_input = data.get("DPPlumpsum_input");
		String freedays_input = data.get("freedays_input");
		String builddown_perdiem_input = data.get("builddown_perdiem_input");
		String DPPwaiver_input = data.get("DPPwaiver_input");
		String amount = data.get("amount");
		String splperdiem_input = data.get("splperdiem_input");
		String monthlyamount_input = data.get("monthlyamount_input");
		String pickup_quantity_input = data.get("pickup_quantity_input");
		String rep_input = data.get("rep_input");
		String DPP_input = data.get("DPP_input");
		String combinevol_input = data.get("combinevol_input");
		String com_vol = data.get("com_vol");
		String pretrip_ins_charge_input = data.get("pretrip_ins_charge_input");
		String posttrip_ins_charge_input = data.get("posttrip_ins_charge_input");
		String extent_cover_input = data.get("extent_cover_input");
		String post_builddown_perdiem_input = data.get("post_builddown_perdiem_input");
		String tc_sizevalue = data.get("tc_sizevalue");
		String locationhier_value = data.get("locationhier_value");
		String location_value1 = data.get("location_value1");
		String date_Picker = data.get("date_Picker");
		String from_date = data.get("from_date");
		String to_date = data.get("to_date");
		String conditionFilter = data.get("conditionFilter");
		String Ports_Code_Search = data.get("Ports_Code_Search");
		String lessee_code_Search = data.get("lessee_code_Search");
		String Lessor_code_search = data.get("Lessor_code_search");
		String Lease_Code_search = data.get("Lease_Code_search");



		

		
		String contype_Opt =  String.format(contype_opt,  ContractType); 
		String con_Cat =  String.format(con_cat,  contract_category); 
		String unit_Teu =  String.format(unitteu,  unitteu_input); 
		String currency_Value =  String.format(currency_value,  currency_input); 
		String diallow__Value =  String.format(diallow_value,  diallow_input); 
		String sizevalue_Option =  String.format(sizevalue_option,  sizevalue); 
		String lease_Option =  String.format(lease_option,  leasevalue); 
		String DPPbasis_Value =  String.format(DPPbasis_value,  DPPbasis_input);
		String DPPlumpsum_Value =  String.format(DPPlumpsum_value,  DPPlumpsum_input);
		String DPPwaiver_Value =  String.format(DPPwaiver_value,  DPPwaiver_input);
		String combinevol_Value =  String.format(combinevol_value,  combinevol_input);
		String locationhier_Field =  String.format(locationhier_field,  locationhier_value);
		String sizevalue_Field =  String.format(sizevalue_field,  tc_sizevalue);
	

		Extent_Start(testcase_Name, test, test1);
		
	
		navigateUrl(driver, url);

		LRP_Login(driver, Username, Password);
		Extent_call(test, test1, "Enter module name in searchbox & click the module");
		
		
		moduleNavigate(driver, Search_input);


		waitForElement(driver, Esave_button);

		Step_Start(1, "Ensure system should allow user to enter contract no & contract type", test, test1);

		waitForElement(driver, Econtractno_field);
		safeclick(driver, Econtractno_field);
		sendKeys(driver, Econtractno_field, contract_no);
		waitForElement(driver, Econtracttype_field);

		waitForElement(driver, Econtracttype_field);
		safeclick(driver, Econtracttype_field);

		if (!isDisplayed(driver, contract_types)) {
			safeclick(driver, Econtracttype_field);
		}
		waitForElement(driver, contype_Opt);
		safeclick(driver, contype_Opt);

		//String Dropdownoption = null;

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

		Step_End(1, "Ensure system should allow user to enter contract no & contract type", test, test1);

		Step_Start(2, "Ensure that should allow user to select Lessor & Lessor from that field", test, test1);

		waitForElement(driver, Eleasekind_searchicon);
		safeclick(driver, Eleasekind_searchicon);
		
		twoColumnSearchWindow(driver, Lease_Code_search, conditionFilter, leasekind);

		Step_End(2, "Ensure that should allow user to select Lessor & Lessor from that field", test, test1);

		waitForElement(driver, Elessorcode_searchicon);
		safeclick(driver, Elessorcode_searchicon);
		
		twoColumnSearchWindow(driver, Lessor_code_search, conditionFilter, lessor_code);



		waitForElement(driver, Elessee_searchicon);
		safeclick(driver, Elessee_searchicon);
		twoColumnSearchWindow(driver, lessee_code_Search, conditionFilter, lessee_code);


		Step_Start(3, " Ensure that system should allow user to select valid From & To Period", test, test1);

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
		

		Step_End(3, " Ensure that system should allow user to select valid From & To Period", test, test1);
		// ************Registration non-mandatory fields*************

		if (!contractage.equals("")) {
			waitForElement(driver, contract_age);
			sendKeys(driver, contract_age, contractage);

		} else {
			System.out.println("contractage " + "Input Not Available in : " + File_Path);
		}

		if (!contract_category.equals("")) {
			waitForElement(driver, contractcate);
			safeclick(driver, contractcate);
			waitForElement(driver, con_Cat);
			safeclick(driver, con_Cat);

		} else {
			System.out.println("contract_category " + "Input Not Available in : " + File_Path);
		}

		if (!eff_date.equals("")) {
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
			sendKeys(driver, remarks, remarkstext);

		} else {
			System.out.println("remarkstext " + "Input Not Available in : " + File_Path);
		}

		if (!lessorref_input.equals("")) {
			waitForElement(driver, lessor_ref);
			sendKeys(driver, lessor_ref, lessorref_input);

		} else {
			System.out.println("lessorref_input " + "Input Not Available in : " + File_Path);
		}

		if (!validprefix_input.equals("")) {
			waitForElement(driver, valid_prefix_addicon);
			safeclick(driver, valid_prefix_addicon);
			waitForElement(driver, service_searchfield);
			sendKeys(driver, service_searchfield, validprefix_input);
			waitForElement(driver, valid_prefix_select);
			safeclick(driver, valid_prefix_select);

		} else {
			System.out.println("validprefix_input " + "Input Not Available in : " + File_Path);
		}

		checkBox(driver, oneway, oneway_checkbox);
		waitForElement(driver, purchase);
		checkBox(driver, purchase, purchase_checkbox);

		if (!unitteu_input.equals("")) {
			waitForElement(driver, dropoff);
			checkBox(driver, dropoff, dropoff_checkbox);
			waitForElement(driver, unit_teu);
			safeclick(driver, unit_teu);
			waitForElement(driver, unit_Teu);
			safeclick(driver, unit_Teu);
			waitForElement(driver, offhire);
			sendKeys(driver, offhire, offhire_input);

		} else {
			System.out.println("unitteu_input " + "Input Not Available in : " + File_Path);
		}

		if (!currency_input.equals("")) {
			waitForElement(driver, currency1);
			safeclick(driver, currency1);
			waitForElement(driver, currency_Value);
			safeclick(driver, currency_Value);

		} else {
			System.out.println("currency_input " + "Input Not Available in : " + File_Path);
		}

		if (diallow_input.equals("Yes")) {
			waitForElement(driver, di_allow);
			safeclick(driver, di_allow);
			waitForElement(driver, diallow_value);
			safeclick(driver, diallow_value);
			waitForElement(driver, difee);
			clear(driver, difee);
			sendKeys(driver, difee, difee_input);

		} else {
			System.out.println("diallow_input " + "Input Not Available in : " + File_Path);
		}

		if (!billpay_input.equals("")) {
			waitForElement(driver, bill_paytype);
			safeclick(driver, bill_paytype);
			waitForElement(driver, diallow__Value);
			safeclick(driver, diallow__Value);

		} else {
			System.out.println("billpay_input " + "Input Not Available in : " + File_Path);
		}

		if (!buildup_input.equals("")) {
			waitForElement(driver, buildup_period);
			sendKeys(driver, buildup_period, buildup_input);

		} else {
			System.out.println("buildup_input " + "Input Not Available in : " + File_Path);
		}

		if (!builddown_input.equals("")) {
			waitForElement(driver, builddown_period);
			sendKeys(driver, builddown_period, builddown_input);

		} else {
			System.out.println("builddown_input " + "Input Not Available in : " + File_Path);
		}

		if (!minperiod_input.equals("")) {
			waitForElement(driver, min_period);
			sendKeys(driver, min_period, minperiod_input);

		} else {
			System.out.println("minperiod_input " + "Input Not Available in : " + File_Path);
		}

		Step_Start(4, "Ensure that system should able to select size type tab", test, test1);

		// *********************SIZETYPE TAB*************************

		waitForElement(driver, Esizeandtype_tab);
		safeclick(driver, Esizeandtype_tab);

		Step_End(4, "Ensure that system should able to select size type tab", test, test1);

		waitForElement(driver, Esizeandtype_Field);
		safeclick(driver, Esizeandtype_Field);
		waitForElement(driver, sizevalue_Option);
		safeclick(driver, sizevalue_Option);




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


		Step_Start(5, "Ensure that system should able to select Lease charge type as 'No banding'", test, test1);

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

		Step_End(5, "Ensure that system should able to select Lease charge type as 'No banding'", test, test1);


		Step_Start(6, "Ensure that system should allow user to add data into grid once per diem is entered & add button is pressed", test, test1);
		waitForElement(driver, Eperdiem_field);
		clear(driver, Eperdiem_field);
		sendKeys(driver, Eperdiem_field, PerDiem_Value);

		// ************sizetype non-mandatory fields*************
		// disabled
		if (!buildup_perdiem_input.equals("")) {
			waitForElement(driver, buildup_perdiem);
			sendKeys(driver, buildup_perdiem, buildup_perdiem_input);

		} else {
			System.out.println("buildup_perdiem_input " + "Input Not Available in : " + File_Path);
		}

		if (!DPPbasis_input.equals("")) {
			waitForElement(driver, DPP_basis);
			safeclick(driver, DPP_basis);
			waitForElement(driver, DPPbasis_Value);
			safeclick(driver, DPPbasis_Value);
			waitForElement(driver, DPP_lumpsum);
			safeclick(driver, DPP_lumpsum);
			waitForElement(driver, DPPlumpsum_Value);
			safeclick(driver, DPPlumpsum_Value);

		} else {
			System.out.println("DPPbasis_input " + "Input Not Available in : " + File_Path);
		}

		if (!freedays_input.equals("")) {
			waitForElement(driver, freedays);
			sendKeys(driver, freedays, freedays_input);

		} else {
			System.out.println("freedays_input " + "Input Not Available in : " + File_Path);
		}
		// disabled
		if (!builddown_perdiem_input.equals("")) {
			waitForElement(driver, builddown_perdiem);
			sendKeys(driver, builddown_perdiem, builddown_perdiem_input);

		} else {
			System.out.println("builddown_perdiem_input " + "Input Not Available in : " + File_Path);
		}

		if (!DPPwaiver_input.equals("")) {
			waitForElement(driver, DPP_waiver);
			safeclick(driver, DPP_waiver);
			waitForElement(driver, DPPwaiver_Value);
			safeclick(driver, DPPwaiver_Value);
			waitForElement(driver, DPP_amount);
			sendKeys(driver, DPP_amount, amount);

		} else {
			System.out.println("DPPwaiver_input " + "Input Not Available in : " + File_Path);
		}

		if (!splperdiem_input.equals("")) {
			waitForElement(driver, spl_perdiem);
			clear(driver, spl_perdiem);
			sendKeys(driver, spl_perdiem, splperdiem_input);

		} else {
			System.out.println("splperdiem_input " + "Input Not Available in : " + File_Path);
		}

		// disabled
		if (!monthlyamount_input.equals("")) {
			waitForElement(driver, monthly_amount);
			clear(driver, monthly_amount);
			sendKeys(driver, monthly_amount, monthlyamount_input);

		} else {
			System.out.println("monthlyamount_input " + "Input Not Available in : " + File_Path);
		}

		if (!pickup_quantity_input.equals("")) {
			waitForElement(driver, pickup_quantity);
			sendKeys(driver, pickup_quantity, pickup_quantity_input);

		} else {
			System.out.println("pickup_quantity_input " + "Input Not Available in : " + File_Path);
		}

		if (!rep_input.equals("")) {
			waitForElement(driver, rep_value);
			clear(driver, rep_value);
			sendKeys(driver, rep_value, rep_input);

		} else {
			System.out.println("rep_input " + "Input Not Available in : " + File_Path);
		}

		if (!DPP_input.equals("")) {
			waitForElement(driver, DPP);
			sendKeys(driver, DPP, DPP_input);

		} else {
			System.out.println("DPP_input " + "Input Not Available in : " + File_Path);
		}

		// volume based banding
		if (!combinevol_input.equals("")) {
			waitForElement(driver, combine_vol);
			safeclick(driver, combine_vol);
			waitForElement(driver, combinevol_Value);
			safeclick(driver, combinevol_Value);
			waitForElement(driver, combinevolbtn);
			safeclick(driver, combinevolbtn);
			waitForElement(driver, combinevol_addbtn);
			safeclick(driver, combinevol_addbtn);
			waitForElement(driver, search_field);
			sendKeys(driver, search_field, com_vol);
			waitForElement(driver, combinevol_selbtn);
			safeclick(driver, combinevol_selbtn);
			waitForElement(driver, combinevol_okbtn);
			safeclick(driver, combinevol_okbtn);

		} else {
			System.out.println("combinevol_input " + "Input Not Available in : " + File_Path);
		}

		if (isClickable(driver, add_tierbtn)) {
			System.out.println("add tier button is enabled");

			if (!pretrip_ins_charge_input.equals("")) {
				waitForElement(driver, pretrip_ins_charge);
				sendKeys(driver, pretrip_ins_charge, pretrip_ins_charge_input);

			} else {
				System.out.println("pretrip_ins_charge_input " + "Input Not Available in : " + File_Path);
			}

			if (!posttrip_ins_charge_input.equals("")) {
				waitForElement(driver, posttrip_ins_charge);
				sendKeys(driver, posttrip_ins_charge, posttrip_ins_charge_input);

			} else {
				System.out.println("posttrip_ins_charge_input " + "Input Not Available in : " + File_Path);
			}

			if (!extent_cover_input.equals("")) {
				waitForElement(driver, extent_cover);
				sendKeys(driver, extent_cover, extent_cover_input);

			} else {
				System.out.println("extent_cover_input " + "Input Not Available in : " + File_Path);
			}

			if (!post_builddown_perdiem_input.equals("")) {
				waitForElement(driver, post_builddown_perdiem);
				sendKeys(driver, post_builddown_perdiem, post_builddown_perdiem_input);

			} else {
				System.out.println("post_builddown_perdiem_input " + "Input Not Available in : " + File_Path);
			}

			waitForElement(driver, add_tierbtn);
			safeclick(driver, add_tierbtn);
		}
		waitForElement(driver, Esizeaddbutton);
		safeclick(driver, Esizeaddbutton);

		Step_End(6, "Ensure that system should allow user to add data into grid once per diem is entered & add button is pressed", test, test1);


		// ***************termcharges mandatory************************

		Step_Start(7, "Ensure that system should able to select Terms & Charges tab", test, test1);


		waitForElement(driver, Etermandcharges);
		safeclick(driver, Etermandcharges);

		Step_End(7, "Ensure that system should able to select Terms & Charges tab", test, test1);

		Step_Start(8, "Ensure that system should allow user to select location hierarchy & enter location", test, test1);

		waitForElement(driver, ELocationhierarchy_field);
		safeclick(driver, ELocationhierarchy_field);
		waitForElement(driver, locationhier_Field);
		safeclick(driver, locationhier_Field);



		waitForElement(driver, Elocationaddbutton);
		safeclick(driver,Elocationaddbutton);
		twoColumnSearchWindow(driver, Ports_Code_Search, conditionFilter, location_value1);
		
		


		Step_End(8, "Ensure that system should allow user to select location hierarchy & enter location", test, test1);

		Step_Start(9, "Ensure that system should list the size/type only which is defined in size/type tab", test, test1);

		waitForElement(driver, Etermchange_size);
		safeclick(driver, Etermchange_size);
		waitForElement(driver, sizevalue_Field);
		safeclick(driver, sizevalue_Field);


		waitForElement(driver, termsizetypeDropdownoption);
		String termsizetypeDropdown_option = getText(driver, termsizetypeDropdownoption);
		System.out.println("termsizetypeDropdown_option: "+termsizetypeDropdown_option);

		if (termsizetypeDropdown_option.equals(tc_sizevalue)) {
			System.out.println("Matched || Expected value was : " + tc_sizevalue + " || Actual value was : "
					+ termsizetypeDropdown_option);
			System.out.println("system list the size/type only which is defined in size/type tab");
			Extent_pass(driver, "Matched || Expected value was : " + tc_sizevalue + " || Actual value was : "
					+ termsizetypeDropdown_option, test, test1);
		} else {
			System.out.println("NotMatched || Expected value was : " + tc_sizevalue + " || Actual value was : "
					+ termsizetypeDropdown_option);
			System.out.println("system not list the size/type only which is defined in size/type tab");
			Extent_fail(driver, "NotMatched || Expected value was : " + tc_sizevalue + " || Actual value was : "
					+ termsizetypeDropdown_option, test, test1);
		}

		Step_End(9, "Ensure that system should list the size/type only which is defined in size/type tab", test, test1);
		Extent_completed(testcase_Name, test, test1);

	}

}
