package LRP_EMS_Consolidated_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EMS_Contract_Registration_11_To_20 extends Keywords {

	public void EMS_Contract_Registration_11_To_20 (WebDriver driver,ExtentTest test,ExtentTest test1, String selected_dataset) throws Exception {


		int TC11=1;

		if(TC11==1) {

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
			String Lease_Code_search = data.get("Lease_Code_search");
			String Lessor_code_search = data.get("Lessor_code_search");
			String lessee_code_Search = data.get("lessee_code_Search");
			String Ports_Code_Search = data.get("Ports_Code_Search");


			
			
			
			
			
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

			waitForElement(driver, close_Tab);
			click(driver, close_Tab);


		}
		int TC12=1;

		if(TC12==1) {
			String testcase_Name="TS_EMS_Contract_Registration_12";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
			String module_name = data.get("module_name");
			String Activity_data = data.get("Activity_data");
			String Multi_Location = data.get("Multi_Location");
			String Multi_Depot = data.get("Multi_Depot");
			String Multi_Size_and_Type = data.get("Multi_Size_and_Type");
			String Release_refno = data.get("Release_refno");
			String Supplier_Contract_SF = data.get("Supplier_Contract_SF");
			String Equipment_No = data.get("Equipment_No");
			String Global_SearchField = data.get("Global_SearchField");
			String PickUpDropoff_LocationSF = data.get("PickUpDropoff_LocationSF");
			String PickupDropoff_SizetypeSF = data.get("PickupDropoff_SizetypeSF");
			String module_name1 = data.get("module_name1");
			String LeaseKind = data.get("LeaseKind");
			String Maker_Value = data.get("Maker_Value");
			String Pay_Load_Value = data.get("Pay_Load_Value");
			String BL_No = data.get("BL_No");
			String Shipper_Value = data.get("Shipper_Value");
			String Consignee_Value = data.get("Consignee_Value");
			String Remarks_Value = data.get("Remarks_Value");
			String Material_Value = data.get("Material_Value");
			String Gross_Weight_Value = data.get("Gross_Weight_Value");
			String Ref_Num_Value = data.get("Ref_Num_Value");
			String Tare_Value = data.get("Tare_Value");
			String date_Picker = data.get("date_Picker");
			String manufacture_Date = data.get("manufacture_Date");
			String Movement_Entry_ActivityDate = data.get("Movement_Entry_ActivityDate");
			String movement_EntryPopup = data.get("movement_EntryPopup").trim();
			String Version_Input = data.get("Version_Input");
			String Carrier_Input = data.get("Carrier_Input");
			String Version_Search = data.get("Version_Search");
			String Carrier_Search = data.get("Carrier_Search");
			String Contract_No_Search = data.get("Contract_No_Search");
			String condition = data.get("condition");


			
			
			String LeaseKind_value =  String.format(LeaseKind_Value,  LeaseKind);
			

			Extent_Start(testcase_Name, test, test1);
			
			Extent_call(test, test1, "Enter module name in searchbox & click the module");

			Step_Start(1, "Ensure system should allow user to save ONHI move in movement entry", test, test1);
			
			// search module

			moduleNavigate(driver, module_name);

			click(driver, multiEntryMovPage_L);
			waitForElement(driver, activitySearchField_L);
			click(driver, activitySearchField_L);

			sendKeys(driver, activitySearchField_L, Activity_data);

			waitForElement(driver, Onhi_Ofhi_select);
			click(driver, Onhi_Ofhi_select);

			waitForElement(driver, Activity_Date);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Activity_Date, Movement_Entry_ActivityDate);
			} else {
				waitForElement(driver, Activity_Date);
				clearAndType(driver, Activity_Date, Movement_Entry_ActivityDate);
			}
			
		
			waitForElement(driver, showInputButton);
			click(driver, showInputButton);


			waitForElement(driver, Multi_Location_SF);
			sendKeys(driver, Multi_Location_SF, Multi_Location);
			waitForElement(driver, Location_select);
			click(driver, Location_select);

			waitForElement(driver, Multi_depot_SF);
			sendKeys(driver, Multi_depot_SF, Multi_Depot);
			waitForElement(driver, Depot_select);
			click(driver, Depot_select);

			waitForElement(driver, Mutli_SizeandType_SF);
			click(driver, Mutli_SizeandType_SF);

			sendKeys(driver, SizeandType_value, Multi_Size_and_Type);
			waitForElement(driver, Size_type_select);
			click(driver, Size_type_select);

			sendKeys(driver, Release_Ref_No, Release_refno);

			sendKeys(driver, Supplier_contract, Supplier_Contract_SF);
			
			
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Manufacture_Date, manufacture_Date);
			} else {
				waitForElement(driver, Manufacture_Date);
				clearAndType(driver, Manufacture_Date, manufacture_Date);
			}
			
			

			if (!LeaseKind.equals("")) {
				waitForElement(driver, Lease_Kind_Dropdown);
				click(driver, Lease_Kind_Dropdown);
				waitForElement(driver, LeaseKind_value);
				click(driver, LeaseKind_value);

			} else {

				System.out.println("LeaseKind " + "Input Not Available in : " + File_Path);
			}

			if (!Maker_Value.equals("")) {
				waitForElement(driver, Maker_TF);
				sendKeys(driver, Maker_TF, Maker_Value);
			} else {

				System.out.println("Maker_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Pay_Load_Value.equals("")) {
				waitForElement(driver, Pay_Load_Tf);
				sendKeys(driver, Pay_Load_Tf, Pay_Load_Value);
			} else {

				System.out.println("Pay_Load_Value " + "Input Not Available in : " + File_Path);
			}


			if (!BL_No.equals("")) {
				List<String> datas1 = splitAndExpand(BL_No);
				for (String data1 : datas1) {

					waitForElement(driver, BL_No_SearchBtn);
					click(driver, BL_No_SearchBtn);
					waitForElement(driver, BL_No_TF);
					sendKeys(driver, BL_No_TF, data1);
				}
			} else {

				System.out.println("BL_No " + "Input Not Available in : " + File_Path);
			}
			if (!Shipper_Value.equals("")) {
				List<String> datas5 = splitAndExpand(Shipper_Value);
				for (String data1 : datas5) {
					waitForElement(driver, Shipper_Tf);
					sendKeys(driver, Shipper_Tf, data1);
				}
			} else {

				System.out.println("Shipper_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Consignee_Value.equals("")) {
				List<String> datas6 = splitAndExpand(Consignee_Value);
				for (String data2 : datas6) {

					waitForElement(driver, Consignee_TF);
					sendKeys(driver, Consignee_TF, data2);
					waitForElement(driver,BL_Select);
					click(driver, BL_Select);
					waitForElement(driver, Select);
					click(driver, Select);
				}
			} else {

				System.out.println("Consignee_Value " + "Input Not Available in : " + File_Path);
			}
			waitForElement(driver, Remarks_TF);
			if (!Remarks_Value.equals("")) {
				waitForElement(driver, Remarks_TF);
				sendKeys(driver, Remarks_TF, Remarks_Value);
			} else {

				System.out.println("Remarks_Value " + "Input Not Available in : " + File_Path);
			}
			waitForElement(driver, Material_TF);
			if (!Material_Value.equals("")) {
				waitForElement(driver, Material_TF);
				sendKeys(driver, Material_TF, Material_Value);
			} else {

				System.out.println("Material_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Gross_Weight_Value.equals("")) {
				waitForElement(driver, Gross_Weight_Tf);
				sendKeys(driver, Gross_Weight_Tf, Gross_Weight_Value);
			} else {

				System.out.println("Gross_Weight_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Ref_Num_Value.equals("")) {
				waitForElement(driver, Ref_Num);
				sendKeys(driver, Ref_Num, Ref_Num_Value);
			} else {

				System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
			}


			if (!Tare_Value.equals("")) {
				waitForElement(driver, Tare_TF);
				sendKeys(driver, Tare_TF, Tare_Value);
			} else {

				System.out.println("Tare_Value " + "Input Not Available in : " + File_Path);
			}

			waitForElement(driver, Add_button);
			click(driver, Add_button);

			waitForElement(driver, firstCell);
			// enter equipment number
			click(driver, firstCell);
			waitForElement(driver, firstCellInput);
			click(driver, firstCellInput);
			sendKeys(driver, firstCellInput, Equipment_No);

			waitForElement(driver, saveButton_L1);
			click(driver, saveButton_L1);

			waitForDisplay(driver, Ofhi_OkButton);
			if (isDisplayed(driver, Ofhi_OkButton)) {
				waitForElement(driver, Ofhi_OkButton);
				click(driver, Ofhi_OkButton);

			}else {
				waitForElement(driver, Apply_btn);
				click(driver, Apply_btn);
				waitForElement(driver, saveButton_L1);
				click(driver, saveButton_L1);

				waitForElement(driver, Movement_Entry_Popup);
				String Popup=getText(driver, Movement_Entry_Popup);
				if(movement_EntryPopup.equals(Popup.trim())) {

					System.out.println("Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
					Extent_pass(driver, "Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
							test, test1);
					waitForElement(driver, Ofhi_OkButton);
					click(driver, Ofhi_OkButton);

				} else {
					System.out.println("NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
					Extent_fail(driver, "NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
							test, test1);
				}

			}

			Step_End(1, "Ensure system should allow user to save ONHI move in movement entry", test, test1);

			// search Ems contract registration module



			moduleNavigate(driver, module_name1);
			
			waitForElement(driver, globalSearch11);
			safeclick(driver, globalSearch11);
			globalValueSearchWindow(driver, condition, Contract_No_Search, Global_SearchField, Carrier_Search, Carrier_Input, Version_Search, Version_Input);

			
			Step_Start(2, "Ensure that system should update the Actual Pick Up Quantity in contract registration for Pick up and Drop off Detailsbased on contract or scale-in used in movement", test, test1);


			waitForElement(driver, ScaleIn_OutPage);
			waitForElement(driver, ScaleIn_OutPage);

			click(driver, ScaleIn_OutPage);

			waitForElement(driver, SCaleIn_Loc_Tf);
			click(driver, SCaleIn_Loc_Tf);
			sendKeys(driver, SCaleIn_Loc_Tf, PickUpDropoff_LocationSF);

			click(driver, SCaleIn_SizeTyp_Tf);
			sendKeys(driver, SCaleIn_SizeTyp_Tf, PickupDropoff_SizetypeSF);
			String Actual1 = getText(driver, ActualQuantity);
			System.out.println(Actual1);
			waitForElement(driver, pickup_DropOff);
			click(driver, pickup_DropOff);

			waitForElement(driver, Pickup_LocationSF);
			click(driver, Pickup_LocationSF);
			sendKeys(driver, Pickup_LocationSF, PickUpDropoff_LocationSF);

			click(driver, Pickup_sizetypeSF);
			sendKeys(driver, Pickup_sizetypeSF, PickupDropoff_SizetypeSF);

			waitForElement(driver, PickUpActual_Quantity);
			String Actual2 = getText(driver, PickUpActual_Quantity);

			if (Actual2.equals(Actual1)) {

				System.out.println("Matched || Expected value was : " + Actual2 + " || Actual value was : " + Actual1);
				Extent_pass(driver, "Matched || Expected value was : " + Actual2 + " || Actual value was : " + Actual1,
						test, test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + Actual2 + " || Actual value was : " + Actual1);
				Extent_fail(driver, "NotMatched || Expected value was : " + Actual2 + " || Actual value was : " + Actual1,
						test, test1);
			}

			Step_End(2, "Ensure that system should update the Actual Pick Up Quantity in contract registration for Pick up and Drop off Detailsbased on contract or scale-in used in movement", test, test1);

			Extent_completed(testcase_Name, test, test1);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);

		}
		int TC13=1;

		if(TC13==1) {
			String testcase_Name="TS_EMS_Contract_Registration_13";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
			String module_name = data.get("module_name");
			String Activity_data = data.get("Activity_data");
			String Multi_Location = data.get("Multi_Location");
			String Multi_Depot = data.get("Multi_Depot");
			String Multi_Size_and_Type = data.get("Multi_Size_and_Type");
			String Release_refno = data.get("Release_refno");
			String Supplier_Contract_SF = data.get("Supplier_Contract_SF");
			String Equipment_No = data.get("Equipment_No");
			String Global_SearchField = data.get("Global_SearchField");
			String PickUpDropoff_LocationSF = data.get("PickUpDropoff_LocationSF");
			String PickupDropoff_SizetypeSF = data.get("PickupDropoff_SizetypeSF");
			String module_name1 = data.get("module_name1");
			String LeaseKind = data.get("LeaseKind");
			String Maker_Value = data.get("Maker_Value");
			String Pay_Load_Value = data.get("Pay_Load_Value");
			String BL_No = data.get("BL_No");
			String Shipper_Value = data.get("Shipper_Value");
			String Consignee_Value = data.get("Consignee_Value");
			String Remarks_Value = data.get("Remarks_Value");
			String Material_Value = data.get("Material_Value");
			String Gross_Weight_Value = data.get("Gross_Weight_Value");
			String Ref_Num_Value = data.get("Ref_Num_Value");
			String Tare_Value = data.get("Tare_Value");
			String date_Picker = data.get("date_Picker");
			String manufacture_Date = data.get("manufacture_Date");
			String Movement_Entry_ActivityDate = data.get("Movement_Entry_ActivityDate");
			String movement_EntryPopup = data.get("movement_EntryPopup").trim();
			String Version_Input = data.get("Version_Input");
			String Carrier_Input = data.get("Carrier_Input");
			String Version_Search = data.get("Version_Search");
			String Carrier_Search = data.get("Carrier_Search");
			String Contract_No_Search = data.get("Contract_No_Search");
			String condition = data.get("condition");




			Extent_Start(testcase_Name, test, test1);


			Extent_call(test, test1, "Enter module name in searchbox & click the module");


			Step_Start(1, "Ensure system should allow user to save ONHI move in movement entry", test, test1);
			moduleNavigate(driver, module_name);

			safeclick(driver, multiEntryMovPage_L);
			waitForElement(driver, activitySearchField_L);
			safeclick(driver, activitySearchField_L);

			sendKeys(driver, activitySearchField_L, Activity_data);
			waitForElement(driver, Onhi_Ofhi_select);
			click(driver, Onhi_Ofhi_select);


			waitForElement(driver, Activity_Date);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Activity_Date, Movement_Entry_ActivityDate);
			} else {
				waitForElement(driver, Activity_Date);
				clearAndType(driver, Activity_Date, Movement_Entry_ActivityDate);
			}
			
			
			waitForElement(driver, showInputButton);
			click(driver, showInputButton);



			waitForElement(driver, Multi_Location_SF);
			sendKeys(driver, Multi_Location_SF, Multi_Location);
			waitForElement(driver, Location_select);
			click(driver, Location_select);

			waitForElement(driver, Multi_depot_SF);
			sendKeys(driver, Multi_depot_SF, Multi_Depot);
			waitForElement(driver, Depot_select);
			click(driver, Depot_select);

			waitForElement(driver, Mutli_SizeandType_SF);
			click(driver, Mutli_SizeandType_SF);

			sendKeys(driver, SizeandType_value, Multi_Size_and_Type);
			waitForElement(driver, Size_type_select);
			click(driver, Size_type_select);

			sendKeys(driver, Release_Ref_No, Release_refno);

			sendKeys(driver, Supplier_contract, Supplier_Contract_SF);

			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Manufacture_Date, manufacture_Date);
			} else {
				waitForElement(driver, Manufacture_Date);
				clearAndType(driver, Manufacture_Date, manufacture_Date);
			}
			


			if (!LeaseKind.equals("")) {
				waitForElement(driver, Lease_Kind_Dropdown);
				safeclick(driver, Lease_Kind_Dropdown);

				safeclick(driver, LeaseKind_Value);

			} else {

				System.out.println("LeaseKind " + "Input Not Available in : " + File_Path);
			}

			if (!Maker_Value.equals("")) {
				waitForElement(driver, Maker_TF);
				sendKeys(driver, Maker_TF, Maker_Value);
			} else {

				System.out.println("Maker_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Pay_Load_Value.equals("")) {
				waitForElement(driver, Pay_Load_Tf);
				sendKeys(driver, Pay_Load_Tf, Pay_Load_Value);
			} else {

				System.out.println("Pay_Load_Value " + "Input Not Available in : " + File_Path);
			}


			if (!BL_No.equals("")) {
				List<String> datas1 = splitAndExpand(BL_No);
				for (String data1 : datas1) {

					waitForElement(driver, BL_No_SearchBtn);
					safeclick(driver, BL_No_SearchBtn);
					waitForElement(driver, BL_No_TF);
					sendKeys(driver, BL_No_TF, data1);
				}
			} else {

				System.out.println("BL_No " + "Input Not Available in : " + File_Path);
			}
			if (!Shipper_Value.equals("")) {
				List<String> datas5 = splitAndExpand(Shipper_Value);
				for (String data1 : datas5) {
					waitForElement(driver, Shipper_Tf);
					sendKeys(driver, Shipper_Tf, data1);
				}
			} else {

				System.out.println("Shipper_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Consignee_Value.equals("")) {
				List<String> datas6 = splitAndExpand(Consignee_Value);
				for (String data2 : datas6) {

					waitForElement(driver, Consignee_TF);
					sendKeys(driver, Consignee_TF, data2);
					waitForElement(driver, BL_Select);
					safeclick(driver, BL_Select);
					waitForElement(driver, Select);
					safeclick(driver, Select);
				}
			} else {

				System.out.println("Consignee_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Remarks_Value.equals("")) {
				waitForElement(driver, Remarks_TF);
				sendKeys(driver, Remarks_TF, Remarks_Value);
			} else {

				System.out.println("Remarks_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Material_Value.equals("")) {
				waitForElement(driver, Material_TF);
				sendKeys(driver, Material_TF, Material_Value);
			} else {

				System.out.println("Material_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Gross_Weight_Value.equals("")) {
				waitForElement(driver, Gross_Weight_Tf);
				sendKeys(driver, Gross_Weight_Tf, Gross_Weight_Value);
			} else {

				System.out.println("Gross_Weight_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Ref_Num_Value.equals("")) {
				waitForElement(driver, Ref_Num);
				sendKeys(driver, Ref_Num, Ref_Num_Value);
			} else {

				System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Ref_Num_Value.equals("")) {
				waitForElement(driver, Ref_Num);
				sendKeys(driver, Ref_Num, Ref_Num_Value);
			} else {

				System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
			}


			if (!Tare_Value.equals("")) {
				waitForElement(driver, Tare_TF);
				sendKeys(driver, Tare_TF, Tare_Value);
			} else {

				System.out.println("Tare_Value " + "Input Not Available in : " + File_Path);
			}
			waitForElement(driver, Add_button);
			safeclick(driver, Add_button);

			waitForElement(driver, firstCell);

			safeclick(driver, firstCell);
			waitForElement(driver, firstCellInput);
			safeclick(driver, firstCellInput);
			sendKeys(driver, firstCellInput, Equipment_No);



			waitForElement(driver, saveButton_L1);

			safeclick(driver, saveButton_L1);
			waitForDisplay(driver, Ofhi_OkButton);
			if (isDisplayed(driver, Ofhi_OkButton)) {

				waitForElement(driver, Ofhi_OkButton);
				safeclick(driver, Ofhi_OkButton);

			}else {
				waitForElement(driver, Apply_btn);
				click(driver, Apply_btn);
				waitForElement(driver, saveButton_L1);
				click(driver, saveButton_L1);

				waitForElement(driver, Movement_Entry_Popup);
				String Popup=getText(driver, Movement_Entry_Popup);
				if(movement_EntryPopup.equals(Popup.trim())) {

					System.out.println("Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
					Extent_pass(driver, "Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
							test, test1);
					waitForElement(driver, Ofhi_OkButton);
					click(driver, Ofhi_OkButton);

				} else {
					System.out.println("NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
					Extent_fail(driver, "NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
							test, test1);
				}
			}
			Step_End(1, "Ensure system should allow user to save ONHI move in movement entry", test, test1);

			moduleNavigate(driver, module_name1);

			waitForElement(driver, globalSearch11);
			safeclick(driver, globalSearch11);
			globalValueSearchWindow(driver, condition, Contract_No_Search, Global_SearchField, Carrier_Search, Carrier_Input, Version_Search, Version_Input);



			Step_Start(2, "Ensure that system should show pick up actual count correctly once Actual pick up qty selection double safeclick", test, test1);

			safeclick(driver, ScaleIn_OutPage);

			safeclick(driver, pickup_DropOff);

			safeclick(driver, Pickup_LocationSF);
			sendKeys(driver, Pickup_LocationSF, PickUpDropoff_LocationSF);

			safeclick(driver, Pickup_sizetypeSF);
			sendKeys(driver, Pickup_sizetypeSF, PickupDropoff_SizetypeSF);
			waitForElement(driver, PickUpActual_Quantity);
			String Actual3 = getText(driver, PickUpActual_Quantity);
			doubleClick(driver, PickUpActual_Quantity);
			waitForElement(driver, pickup_Actual_Countvalue);

			String Value1 = getText(driver, pickup_Actual_Countvalue);
			String[] Value2 = Value1.split("\\:");
			System.out.println("Splitted string" + Value2[1]);

			if (Actual3.equals(Value2[1])) {
				System.out.println("Matched || Expected value was : " + Actual3 + " || Actual value was : " + Value2[1]);
				Extent_pass(driver, "Matched || Expected value was : " + Actual3 + " || Actual value was : " + Value2[1],
						test, test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + Actual3 + " || Actual value was : " + Value2[1]);
				Extent_fail(driver, "NotMatched || Expected value was : " + Actual3 + " || Actual value was : " + Value2[1],
						test, test1);
			}

			Step_End(2, "Ensure that system should show pick up actual count correctly once Actual pick up qty selection double safeclick", test, test1);

			Extent_completed(testcase_Name, test, test1);
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);

		}

		int TC14=1;

		if(TC14==1) {
			String testcase_Name="TS_EMS_Contract_Registration_14";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
			
			String Module_name = data.get("module_name");
			String Activity_data = data.get("Activity_data");
			String Multi_Location = data.get("Multi_Location");
			String Multi_Depot = data.get("Multi_Depot");
			String Multi_Size_and_Type = data.get("Multi_Size_and_Type");
			String Release_refno = data.get("Release_refno");
			String Supplier_Contract_SF = data.get("Supplier_Contract_SF");
			String Equipment_No = data.get("Equipment_No");
			String Global_SearchField = data.get("Global_SearchField");
			String PickUpDropoff_LocationSF = data.get("PickUpDropoff_LocationSF");
			String PickupDropoff_SizetypeSF = data.get("PickupDropoff_SizetypeSF");
			String module_name1 = data.get("module_name1");
			String LeaseKind = data.get("LeaseKind");
			String Maker_Value = data.get("Maker_Value");
			String Pay_Load_Value = data.get("Pay_Load_Value");
			String BL_No = data.get("BL_No");
			String Shipper_Value = data.get("Shipper_Value");
			String Consignee_Value = data.get("Consignee_Value");
			String Remarks_Value = data.get("Remarks_Value");
			String Material_Value = data.get("Material_Value");
			String Gross_Weight_Value = data.get("Gross_Weight_Value");
			String Ref_Num_Value = data.get("Ref_Num_Value");
			String Tare_Value = data.get("Tare_Value");
			String Month_Year = data.get("Month_Year");
			String date_Picker = data.get("date_Picker");
			String manufacture_Date = data.get("manufacture_Date");
			String Movement_Entry_ActivityDate = data.get("Movement_Entry_ActivityDate");
			String movement_EntryPopup = data.get("movement_EntryPopup").trim();
			String Version_Input = data.get("Version_Input");
			String Carrier_Input = data.get("Carrier_Input");
			String Version_Search = data.get("Version_Search");
			String Carrier_Search = data.get("Carrier_Search");
			String Contract_No_Search = data.get("Contract_No_Search");
			String condition = data.get("condition");




			Extent_Start(testcase_Name, test, test1);
			
			Extent_call(test, test1, "Enter module name in searchbox & click the module");

			Step_Start(1, "Ensure system should allow user to save ONHI move in movement entry", test, test1);
			// search module
			moduleNavigate(driver, Module_name);


			click(driver, multiEntryMovPage_L);
			waitForElement(driver, activitySearchField_L);
			click(driver, activitySearchField_L);

			sendKeys(driver, activitySearchField_L, Activity_data);

			waitForElement(driver, Onhi_Ofhi_select);
			click(driver, Onhi_Ofhi_select);

			waitForElement(driver, Activity_Date);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Activity_Date, Movement_Entry_ActivityDate);
			} else {
				waitForElement(driver, Activity_Date);
				clearAndType(driver, Activity_Date, Movement_Entry_ActivityDate);
			}
			waitForElement(driver, showInputButton);
			click(driver, showInputButton);


			waitForElement(driver, Multi_Location_SF);
			sendKeys(driver, Multi_Location_SF, Multi_Location);
			waitForElement(driver, Location_select);
			click(driver, Location_select);

			waitForElement(driver, Multi_depot_SF);
			sendKeys(driver, Multi_depot_SF, Multi_Depot);
			waitForElement(driver, Depot_select);
			click(driver, Depot_select);

			waitForElement(driver, Mutli_SizeandType_SF);
			click(driver, Mutli_SizeandType_SF);

			sendKeys(driver, SizeandType_value, Multi_Size_and_Type);
			waitForElement(driver, Size_type_select);
			click(driver, Size_type_select);

			sendKeys(driver, Release_Ref_No, Release_refno);

			sendKeys(driver, Supplier_contract, Supplier_Contract_SF);
			
			
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Manufacture_Date, manufacture_Date);
				
			} else {
				waitForElement(driver, Manufacture_Date);
				clearAndType(driver, Manufacture_Date, manufacture_Date);
			}
			

			if (!LeaseKind.equals("")) {
				waitForElement(driver, Lease_Kind_Dropdown);
				safeclick(driver, Lease_Kind_Dropdown);

				safeclick(driver, LeaseKind_Value);

			} else {

				System.out.println("LeaseKind " + "Input Not Available in : " + File_Path);
			}

			if (!Maker_Value.equals("")) {
				waitForElement(driver, Maker_TF);
				sendKeys(driver, Maker_TF, Maker_Value);
			} else {

				System.out.println("Maker_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Pay_Load_Value.equals("")) {
				waitForElement(driver, Pay_Load_Tf);
				sendKeys(driver, Pay_Load_Tf, Pay_Load_Value);
			} else {

				System.out.println("Pay_Load_Value " + "Input Not Available in : " + File_Path);
			}


			if (!BL_No.equals("")) {
				List<String> datas1 = splitAndExpand(BL_No);
				for (String data1 : datas1) {

					waitForElement(driver, BL_No_SearchBtn);
					safeclick(driver, BL_No_SearchBtn);
					waitForElement(driver, BL_No_TF);
					sendKeys(driver, BL_No_TF, data1);
				}
			} else {

				System.out.println("BL_No " + "Input Not Available in : " + File_Path);
			}
			if (!Shipper_Value.equals("")) {
				List<String> datas5 = splitAndExpand(Shipper_Value);
				for (String data1 : datas5) {
					waitForElement(driver, Shipper_Tf);
					sendKeys(driver, Shipper_Tf, data1);
				}
			} else {

				System.out.println("Shipper_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Consignee_Value.equals("")) {
				List<String> datas6 = splitAndExpand(Consignee_Value);
				for (String data2 : datas6) {

					waitForElement(driver, Consignee_TF);
					sendKeys(driver, Consignee_TF, data2);
					waitForElement(driver, BL_Select);
					safeclick(driver, BL_Select);
					waitForElement(driver, Select);
					safeclick(driver, Select);
				}
			} else {

				System.out.println("Consignee_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Remarks_Value.equals("")) {
				waitForElement(driver, Remarks_TF);
				sendKeys(driver, Remarks_TF, Remarks_Value);
			} else {

				System.out.println("Remarks_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Material_Value.equals("")) {
				waitForElement(driver, Material_TF);
				sendKeys(driver, Material_TF, Material_Value);
			} else {

				System.out.println("Material_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Gross_Weight_Value.equals("")) {
				waitForElement(driver, Gross_Weight_Tf);
				sendKeys(driver, Gross_Weight_Tf, Gross_Weight_Value);
			} else {

				System.out.println("Gross_Weight_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Ref_Num_Value.equals("")) {
				waitForElement(driver, Ref_Num);
				sendKeys(driver, Ref_Num, Ref_Num_Value);
			} else {

				System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
			}

			if (!Ref_Num_Value.equals("")) {
				waitForElement(driver, Ref_Num);
				sendKeys(driver, Ref_Num, Ref_Num_Value);
			} else {

				System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
			}
		


			if (!Tare_Value.equals("")) {
				waitForElement(driver, Tare_TF);
				sendKeys(driver, Tare_TF, Tare_Value);
			} else {

				System.out.println("Tare_Value " + "Input Not Available in : " + File_Path);
			}
			waitForElement(driver, Add_button);
			safeclick(driver, Add_button);
			waitForElement(driver, firstCell);
			safeclick(driver, firstCell);
			waitForElement(driver, firstCellInput);
			safeclick(driver, firstCellInput);
			sendKeys(driver, firstCellInput, Equipment_No);


			waitForElement(driver, saveButton_L1);

			safeclick(driver, saveButton_L1);
			waitForDisplay(driver, Ofhi_OkButton);
			if (isDisplayed(driver, Ofhi_OkButton)) {

				waitForElement(driver, Ofhi_OkButton);
				safeclick(driver, Ofhi_OkButton);

			}else {
				waitForElement(driver, Apply_btn);
				click(driver, Apply_btn);
				waitForElement(driver, saveButton_L1);
				click(driver, saveButton_L1);

				waitForElement(driver, Movement_Entry_Popup);
				String Popup=getText(driver, Movement_Entry_Popup);
				if(movement_EntryPopup.equals(Popup.trim())) {

					System.out.println("Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
					Extent_pass(driver, "Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
							test, test1);
					waitForElement(driver, Ofhi_OkButton);
					click(driver, Ofhi_OkButton);

				} else {
					System.out.println("NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
					Extent_fail(driver, "NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
							test, test1);
				}
			}
			Step_End(1, "Ensure system should allow user to save ONHI move in movement entry", test, test1);

			moduleNavigate(driver, module_name1);

			
			waitForElement(driver, globalSearch11);
			safeclick(driver, globalSearch11);
			globalValueSearchWindow(driver, condition, Contract_No_Search, Global_SearchField, Carrier_Search, Carrier_Input, Version_Search, Version_Input);


			Step_Start(2, "Ensure that system should show pick up actual count correctly once Actual pick up qty selection double safeclick", test, test1);

			waitForElement(driver, pickup_DropOff);
			safeclick(driver, pickup_DropOff);

			safeclick(driver, Pickup_LocationSF);
			sendKeys(driver, Pickup_LocationSF, PickUpDropoff_LocationSF);

			safeclick(driver, Pickup_sizetypeSF);
			sendKeys(driver, Pickup_sizetypeSF, PickupDropoff_SizetypeSF);

			waitForElement(driver, PickUpActual_Quantity);
			doubleClick(driver, PickUpActual_Quantity);

			Step_End(2, "Ensure that system should show pick up actual count correctly once Actual pick up qty selection double safeclick", test, test1);


			Step_Start(3, "Ensure that system should able to double click monthly selection summary data to view container details correctly", test, test1);

			waitForElement(driver, Month_Year_filter);
			safeclick(driver, Month_Year_filter);
			waitForElement(driver, Month_Year_filter);
			sendKeys(driver, Month_Year_filter, Month_Year);



			waitForElement(driver, monthly_utilized_summary);
			doubleClick(driver, monthly_utilized_summary);
			waitForElement(driver, Container_valueTf);
			safeclick(driver, Container_valueTf);
			int one15index41 = Equipment_No.length();
			String rate41 = Equipment_No.substring(0, one15index41 - 1);
			System.out.println(rate41);
			sendKeys(driver, Container_valueTf, rate41);
			waitForElement(driver, Container_No);
			String Value3 = getText(driver, Container_No);
			int one15index4 = Value3.length();
			String rate4 = Value3.substring(0, one15index4 - 1);
			System.out.println(rate4);
			if (rate41.equals(rate4)) {
				System.out.println("Matched || Expected value was : " + rate41 + " || Actual value was : " + rate4);
				Extent_pass(driver, "Matched || Expected value was : " + rate41 + " || Actual value was : " + rate4, test,
						test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + rate41 + " || Actual value was : " + rate4);
				Extent_fail(driver, "NotMatched || Expected value was : " + rate41 + " || Actual value was : " + rate4,
						test, test1);
			}

			Step_End(3, "Ensure that system should able to double click monthly selection summary data to view container details correctly", test, test1);
			Extent_completed(testcase_Name, test, test1);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);

		}
		int TC15=1;

		if(TC15==1) {

			String testcase_Name="TS_EMS_Contract_Registration_15";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);

			String Module_name = data.get("module_name");
			String Activity_data1 = data.get("Activity_data1");
			String Multi_Location1 = data.get("Multi_Location1");
			String Multi_Depot1 = data.get("Multi_Depot1");
			String Multi_Size_and_Type = data.get("Multi_Size_and_Type");
			String Equipment_Num = data.get("Equipment_Num");
			String Global_SearchField = data.get("Global_SearchField");
			String PickUpDropoff_LocationSF = data.get("PickUpDropoff_LocationSF");
			String PickupDropoff_SizetypeSF = data.get("PickupDropoff_SizetypeSF");
			String module_name1 = data.get("module_name1");
			String ReturnDate = data.get("ReturnDate");
			String Remarks_Value = data.get("Remarks_Value");
			String Ref_Num_Value = data.get("Ref_Num_Value");
			String Return_refno1 = data.get("Return_refno1");
			String Movement_Entry_ActivityDate = data.get("Movement_Entry_ActivityDate");
			String movement_EntryPopup = data.get("movement_EntryPopup").trim();
			String date_Picker = data.get("date_Picker");
			String Version_Input = data.get("Version_Input");
			String Carrier_Input = data.get("Carrier_Input");
			String Version_Search = data.get("Version_Search");
			String Carrier_Search = data.get("Carrier_Search");
			String Contract_No_Search = data.get("Contract_No_Search");
			String condition = data.get("condition");




			Extent_Start(testcase_Name, test, test1);

			Extent_call(test, test1, "Enter module name in searchbox & click the module");

			Step_Start(1, " Ensure system should allow user to save OFHI move in movement entry", test, test1);
			// search module
			moduleNavigate(driver, Module_name);



			safeclick(driver, multiEntryMovPage_L);
			waitForElement(driver, activitySearchField_L);
			safeclick(driver, activitySearchField_L);

			sendKeys(driver, activitySearchField_L, Activity_data1);
			waitForElement(driver, Onhi_Ofhi_select);
			safeclick(driver, Onhi_Ofhi_select);

			
			
			waitForElement(driver, Activity_Date);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Activity_Date, Movement_Entry_ActivityDate);
			} else {
				waitForElement(driver, Activity_Date);
				clearAndType(driver, Activity_Date, Movement_Entry_ActivityDate);
			}

			waitForElement(driver, showInputButton);
			click(driver, showInputButton);



			waitForElement(driver, Multi_Location_SF);
			sendKeys(driver, Multi_Location_SF, Multi_Location1);
			waitForElement(driver, Location_select);
			click(driver, Location_select);

			safeclick(driver, Depot_SearchButton);
			waitForElement(driver, Depot_Sf);
			sendKeys(driver, Depot_Sf, Multi_Depot1);
			waitForElement(driver, Depot_Valuefilter);
			safeclick(driver, Depot_Valuefilter);
			waitForElement(driver, Depot_SelectBtn);
			safeclick(driver, Depot_SelectBtn);
			
			waitForElement(driver, Return_Date);
			if (!ReturnDate.equals("")) {
				safeclick(driver, Return_Date);
				waitForElement(driver, date_select);
				safeclick(driver, date_select);

			} else {

				System.out.println("ReturnDate " + "Input Not Available in : " + File_Path);
			}

		

			if (!Remarks_Value.equals("")) {
				waitForElement(driver, Remarks_TF);
				sendKeys(driver, Remarks_TF, Remarks_Value);
			} else {

				System.out.println("Remarks_Value " + "Input Not Available in : " + File_Path);
			}


			if (!Ref_Num_Value.equals("")) {
				waitForElement(driver, Ref_Num);
				sendKeys(driver, Ref_Num, Ref_Num_Value);
			} else {

				System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
			}
			waitForElement(driver, Return_Ref_No);
			safeclick(driver, Return_Ref_No);
			System.out.println("Return_refno1 : " + Return_refno1);
			waitForElement(driver, Return_Ref_No);
			sendKeys(driver, Return_Ref_No, Return_refno1);

			waitForElement(driver, Add_button);
			safeclick(driver, Add_button);

			waitForElement(driver, firstCell);

			doubleClick(driver, firstCell);
			waitForElement(driver, firstCellInput);
			safeclick(driver, firstCellInput);
			waitForElement(driver, firstCellInput);
			Actionsendkeys(driver, firstCellInput, Equipment_Num);

			// save
			waitForElement(driver, Save_Btn);
			safeclick(driver, Save_Btn);
			

			waitForElement(driver, Movement_Entry_Popup);
			String Popup=getText(driver, Movement_Entry_Popup);
			if(movement_EntryPopup.equals(Popup.trim())) {

				System.out.println("Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
				Extent_pass(driver, "Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
						test, test1);

			} else {
				System.out.println("NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
				Extent_fail(driver, "NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
						test, test1);
			}
		
			waitForElement(driver, Ofhi_OkButton);
			safeclick(driver, Ofhi_OkButton);


			Step_End(1, " Ensure system should allow user to save OFHI move in movement entry", test, test1);

			
			
			moduleNavigate(driver, module_name1);


			waitForElement(driver, globalSearch11);
			safeclick(driver, globalSearch11);
			globalValueSearchWindow(driver, condition, Contract_No_Search, Global_SearchField, Carrier_Search, Carrier_Input, Version_Search, Version_Input);


			Step_Start(2, "Ensure that system should update the Actual Dropoff Quantity in contract registration for Pick up and Drop off Details based on contract or scale-in used in movement", test, test1);

			waitForElement(driver, ScaleIn_OutPage);
			doubleClick(driver, ScaleIn_OutPage);
			waitForElement(driver, ScaleOut_Reference);
			safeclick(driver, ScaleOut_Reference);
			waitForElement(driver, Scaleout_refNo_Tf);
			safeclick(driver, Scaleout_refNo_Tf);
			sendKeys(driver, Scaleout_refNo_Tf, Return_refno1);

			safeclick(driver, Scaleout_Location_Tf);
			sendKeys(driver, Scaleout_Location_Tf, Multi_Location1);

			safeclick(driver, Scaleout_Sizetyp_Tf);
			sendKeys(driver, Scaleout_Sizetyp_Tf, Multi_Size_and_Type);

			waitForElement(driver, scaleout_ActualQunantity);
			String Value4 = getText(driver, scaleout_ActualQunantity);

			safeclick(driver, pickup_DropOff);

			safeclick(driver, Pickup_LocationSF);
			sendKeys(driver, Pickup_LocationSF, PickUpDropoff_LocationSF);

			safeclick(driver, Pickup_sizetypeSF);
			sendKeys(driver, Pickup_sizetypeSF, PickupDropoff_SizetypeSF);

			waitForElement(driver, PickupActual_DropOff_Quantity);
			String Value5 = getText(driver, PickupActual_DropOff_Quantity);

			if (Value4.equals(Value5)) {
				System.out.println("Matched || Expected value was : " + Value4 + " || Actual value was : " + Value5);
				Extent_pass(driver, "Matched || Expected value was : " + Value4 + " || Actual value was : " + Value5, test,
						test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + Value4 + " || Actual value was : " + Value5);
				Extent_fail(driver, "NotMatched || Expected value was : " + Value4 + " || Actual value was : " + Value5,
						test, test1);
			}

			Step_End(2, "Ensure that system should update the Actual Dropoff Quantity in contract registration for Pick up and Drop off Details based on contract or scale-in used in movement", test, test1);

			Extent_completed(testcase_Name, test, test1);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);	 
		}

		int TC16=1;

		if(TC16==1) {
			String testcase_Name="TS_EMS_Contract_Registration_16";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
			String module_name = data.get("module_name");
			String Activity_data1 = data.get("Activity_data1");
			String Multi_Location1 = data.get("Multi_Location1");
			String Multi_Depot1 = data.get("Multi_Depot1");
			String Multi_Size_and_Type = data.get("Multi_Size_and_Type");
			String Equipment_Num = data.get("Equipment_Num");
			String Global_SearchField = data.get("Global_SearchField");
			String module_name1 = data.get("module_name1");
			String ReturnDate = data.get("ReturnDate");
			String Remarks_Value = data.get("Remarks_Value");
			String Ref_Num_Value = data.get("Ref_Num_Value");
			String Return_refno1 = data.get("Return_refno1");
			String Movement_Entry_ActivityDate = data.get("Movement_Entry_ActivityDate");
			String movement_EntryPopup = data.get("movement_EntryPopup").trim();
			String date_Picker = data.get("date_Picker");
			String Version_Input = data.get("Version_Input");
			String Carrier_Input = data.get("Carrier_Input");
			String Version_Search = data.get("Version_Search");
			String Carrier_Search = data.get("Carrier_Search");
			String Contract_No_Search = data.get("Contract_No_Search");
			String condition = data.get("condition");





			Extent_Start(testcase_Name, test, test1);

			
			

			Extent_call(test, test1, "Enter module name in searchbox & click the module");


			Step_Start(1, "Ensure system should allow user to save OFHI  move in movement entry", test, test1);
			// search module
			moduleNavigate(driver, module_name);


			safeclick(driver, multiEntryMovPage_L);
			waitForElement(driver, activitySearchField_L);
			safeclick(driver, activitySearchField_L);

			sendKeys(driver, activitySearchField_L, Activity_data1);
			waitForElement(driver, Onhi_Ofhi_select);
			safeclick(driver, Onhi_Ofhi_select);
			waitForElement(driver, Activity_Date);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Activity_Date, Movement_Entry_ActivityDate);
			} else {
				waitForElement(driver, Activity_Date);
				clearAndType(driver, Activity_Date, Movement_Entry_ActivityDate);
			}

			waitForElement(driver, showInputButton);
			click(driver, showInputButton);



			waitForElement(driver, Multi_Location_SF);
			sendKeys(driver, Multi_Location_SF, Multi_Location1);
			waitForElement(driver, Location_select);
			click(driver, Location_select);

			safeclick(driver, Depot_SearchButton);
			waitForElement(driver, Depot_Sf);
			sendKeys(driver, Depot_Sf, Multi_Depot1);
			waitForElement(driver, Depot_Valuefilter);
			safeclick(driver, Depot_Valuefilter);
			waitForElement(driver, Depot_SelectBtn);
			safeclick(driver, Depot_SelectBtn);
			
			if (!ReturnDate.equals("")) {
				safeclick(driver, Return_Date);


				waitForElement(driver, date_select);
				safeclick(driver, date_select);

			} else {

				System.out.println("ReturnDate " + "Input Not Available in : " + File_Path);
			}





			if (!Remarks_Value.equals("")) {
				waitForElement(driver, Remarks_TF);
				sendKeys(driver, Remarks_TF, Remarks_Value);
			} else {

				System.out.println("Remarks_Value " + "Input Not Available in : " + File_Path);
			}


			if (!Ref_Num_Value.equals("")) {
				waitForElement(driver, Ref_Num);
				sendKeys(driver, Ref_Num, Ref_Num_Value);
			} else {

				System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
			}
			waitForElement(driver, Return_Ref_No);
			safeclick(driver, Return_Ref_No);
			System.out.println("Return_refno1 : " + Return_refno1);
			waitForElement(driver, Return_Ref_No);
			sendKeys(driver, Return_Ref_No, Return_refno1);
			waitForElement(driver, Add_button);
			safeclick(driver, Add_button);
			waitForElement(driver, firstCell);
			doubleClick(driver, firstCell);
			waitForElement(driver, firstCellInput);
			safeclick(driver, firstCellInput);
			waitForElement(driver, firstCellInput);
			Actionsendkeys(driver, firstCellInput, Equipment_Num);
			// save movement entry
			waitForElement(driver, Save_Btn);
			safeclick(driver, Save_Btn);
			
			

			waitForElement(driver, Movement_Entry_Popup);
			String Popup=getText(driver, Movement_Entry_Popup);
			if(movement_EntryPopup.equals(Popup.trim())) {

				System.out.println("Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
				Extent_pass(driver, "Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
						test, test1);

			} else {
				System.out.println("NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
				Extent_fail(driver, "NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
						test, test1);
			}
			waitForElement(driver, Ofhi_OkButton);
			safeclick(driver, Ofhi_OkButton);

			Step_End(1, "Ensure system should allow user to save OFHI  move in movement entry", test, test1);

			// search EMS contract registration
			
			moduleNavigate(driver, module_name1);


			waitForElement(driver, globalSearch11);
			safeclick(driver, globalSearch11);
			globalValueSearchWindow(driver, condition, Contract_No_Search, Global_SearchField, Carrier_Search, Carrier_Input, Version_Search, Version_Input);

			Step_Start(2, "Ensure that system should show dropoff actual count correctly once Actual pick up qty selection double click", test, test1);

			// pickup/drop off tab
			waitForElement(driver, pickup_dropoff_tab);
			safeclick(driver, pickup_dropoff_tab);
			// pickup/drop off details
			waitForElement(driver, location_filter16);
			sendKeys(driver, location_filter16, Multi_Location1);

			waitForElement(driver, sizetype_filter16);
			sendKeys(driver, sizetype_filter16, Multi_Size_and_Type);

			waitForElement(driver, pickup_dropoff_detail);
			doubleClick(driver, pickup_dropoff_detail);
			String dropoffcount1 = getText(driver, dropoff_count1);
			System.out.println("Total No. of Actual Dropoff Quantity before double click the actual pickup quantity:" + dropoffcount1);

			waitForElement(driver, monthly_utilized_summary);
			if (isDisplayed(driver, dropoff_count_MUS)) {
				System.out.println("Dropoff actual count was shown");
				Extent_pass(driver, "Dropoff actual count was shown", test, test1);
				waitForElement(driver, dropoff_count_MUS);
				String dropoffcount2 = getText(driver, dropoff_count_MUS);
				System.out.println("Total No. of Actual Dropoff Quantity before double click the actual pickup quantity:"+dropoffcount2);
			
			} else {
				System.out.println("Dropoff actual count was not shown");
				Extent_fail(driver, "Dropoff actual count was not shown", test, test1);
			}
		
			Step_End(2, "Ensure that system should show dropoff actual count correctly once Actual pick up qty selection double click", test, test1);
			Extent_completed(testcase_Name, test, test1);

			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);	 
		}
		int TC17=1;

		if(TC17==1) {
			String testcase_Name="TS_EMS_Contract_Registration_17";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);

			String module_name = data.get("module_name");
			String Activity_data1 = data.get("Activity_data1");
			String Multi_Location1 = data.get("Multi_Location1");
			String Multi_Depot1 = data.get("Multi_Depot1");
			String Equipment_Num = data.get("Equipment_Num");
			String Global_SearchField = data.get("Global_SearchField");
			String PickUpDropoff_LocationSF = data.get("PickUpDropoff_LocationSF");
			String PickupDropoff_SizetypeSF = data.get("PickupDropoff_SizetypeSF");
			String module_name1 = data.get("module_name1");
			String ReturnDate = data.get("ReturnDate");
			String Remarks_Value = data.get("Remarks_Value");
			String Ref_Num_Value = data.get("Ref_Num_Value");
			String Return_refno1 = data.get("Return_refno1");
			String Month_Year = data.get("Month_Year");
			String Movement_Entry_ActivityDate = data.get("Movement_Entry_ActivityDate");
			String movement_EntryPopup = data.get("movement_EntryPopup").trim();
			String date_Picker = data.get("date_Picker");
			String Version_Input = data.get("Version_Input");
			String Carrier_Input = data.get("Carrier_Input");
			String Version_Search = data.get("Version_Search");
			String Carrier_Search = data.get("Carrier_Search");
			String Contract_No_Search = data.get("Contract_No_Search");
			String condition = data.get("condition");



			
			Extent_Start(testcase_Name, test, test1);
			
			Extent_call(test, test1, "Enter module name in searchbox & click the module");


			Step_Start(1, "Ensure system should allow user to save OFHI move in movement entry", test, test1);

			// search module
			
			moduleNavigate(driver, module_name);


			safeclick(driver, multiEntryMovPage_L);
			waitForElement(driver, activitySearchField_L);
			safeclick(driver, activitySearchField_L);

			sendKeys(driver, activitySearchField_L, Activity_data1);
			waitForElement(driver, Onhi_Ofhi_select);
			safeclick(driver, Onhi_Ofhi_select);
			waitForElement(driver, Activity_Date);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				selectDatePicker(driver, Activity_Date, Movement_Entry_ActivityDate);
			} else {
				waitForElement(driver, Activity_Date);
				clearAndType(driver, Activity_Date, Movement_Entry_ActivityDate);
			}

			waitForElement(driver, showInputButton);
			click(driver, showInputButton);



			waitForElement(driver, Multi_Location_SF);
			sendKeys(driver, Multi_Location_SF, Multi_Location1);
			waitForElement(driver, Location_select);
			click(driver, Location_select);

			safeclick(driver, Depot_SearchButton);
			waitForElement(driver, Depot_Sf);
			sendKeys(driver, Depot_Sf, Multi_Depot1);
			waitForElement(driver, Depot_Valuefilter);
			safeclick(driver, Depot_Valuefilter);
			waitForElement(driver, Depot_SelectBtn);
			safeclick(driver, Depot_SelectBtn);


			if (!ReturnDate.equals("")) {
				safeclick(driver, Return_Date);


				waitForElement(driver, date_select);
				safeclick(driver, date_select);

			} else {

				System.out.println("ReturnDate " + "Input Not Available in : " + File_Path);
			}



			if (!Remarks_Value.equals("")) {
				waitForElement(driver, Remarks_TF);
				sendKeys(driver, Remarks_TF, Remarks_Value);
			} else {

				System.out.println("Remarks_Value " + "Input Not Available in : " + File_Path);
			}


			if (!Ref_Num_Value.equals("")) {
				waitForElement(driver, Ref_Num);
				sendKeys(driver, Ref_Num, Ref_Num_Value);
			} else {

				System.out.println("Ref_Num_Value " + "Input Not Available in : " + File_Path);
			}
			waitForElement(driver, Return_Ref_No);
			safeclick(driver, Return_Ref_No);
			System.out.println("Return_refno1 : " + Return_refno1);
			waitForElement(driver, Return_Ref_No);
			sendKeys(driver, Return_Ref_No, Return_refno1);

			safeclick(driver, Add_button);


			waitForElement(driver, firstCell);

			doubleClick(driver, firstCell);
			waitForElement(driver, firstCellInput);
			safeclick(driver, firstCellInput);
			waitForElement(driver, firstCellInput);
			Actionsendkeys(driver, firstCellInput, Equipment_Num);


			waitForElement(driver, Save_Btn);

			safeclick(driver, Save_Btn);
			
			waitForElement(driver, Movement_Entry_Popup);
			String Popup=getText(driver, Movement_Entry_Popup);
			if(movement_EntryPopup.equals(Popup.trim())) {

				System.out.println("Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
				Extent_pass(driver, "Matched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
						test, test1);

			} else {
				System.out.println("NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup);
				Extent_fail(driver, "NotMatched || Expected value was : " + movement_EntryPopup + " || Actual value was : " + Popup,
						test, test1);
			}
			waitForElement(driver, Ofhi_OkButton);
			safeclick(driver, Ofhi_OkButton);

			Step_End(1, "Ensure system should allow user to save OFHI move in movement entry", test, test1);

			moduleNavigate(driver, module_name1);

			waitForElement(driver, globalSearch11);
			safeclick(driver, globalSearch11);
			globalValueSearchWindow(driver, condition, Contract_No_Search, Global_SearchField, Carrier_Search, Carrier_Input, Version_Search, Version_Input);


			Step_Start(2, "Ensure that system should show drop off actual count correctly once Actual pick up qty selection double click", test, test1);

			// pickup/drop off tab
			waitForElement(driver, pickup_dropoff_tab);
			safeclick(driver, pickup_dropoff_tab);

			// pickup/drop off details
			safeclick(driver, Pickup_LocationSF);
			sendKeys(driver, Pickup_LocationSF, PickUpDropoff_LocationSF);

			safeclick(driver, Pickup_sizetypeSF);
			sendKeys(driver, Pickup_sizetypeSF, PickupDropoff_SizetypeSF);

			waitForElement(driver, Actual_dropOff);
			doubleClick(driver, Actual_dropOff);


			Step_End(2, "Ensure that system should show drop off actual count correctly once Actual pick up qty selection double click", test, test1);


			Step_Start(3, "Ensure that system should able to double click monthly selection summary data to view container details correctly", test, test1);

			safeclick(driver, Month_Year_filter);
			sendKeys(driver, Month_Year_filter, Month_Year);



			waitForElement(driver, monthly_utilized_summary1);
			doubleClick(driver, monthly_utilized_summary1);
			waitForElement(driver, DropOff_Quantity);
			sendKeys(driver, DropOff_Quantity,Equipment_Num );
			waitForElement(driver, container_equipno);
			String container_equip_no = getText(driver, container_equipno);
			if (container_equip_no.equals(Equipment_Num)) {
				System.out.println("Matched || Expected value was : " + Equipment_Num + " || Actual value was : "
						+ container_equip_no);
				Extent_pass(driver,
						"Matched || Expected value was : " + Equipment_Num + " || Actual value was : " + container_equip_no,
						test, test1);
			} else {
				System.out.println("NotMatched || Expected value was : " + Equipment_Num + " || Actual value was : "
						+ container_equip_no);
				Extent_fail(driver, "NotMatched || Expected value was : " + Equipment_Num + " || Actual value was : "
						+ container_equip_no, test, test1);
			}
			
			Step_End(3, "Ensure that system should able to double click monthly selection summary data to view container details correctly", test, test1);

			Extent_completed(testcase_Name, test, test1);

			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);	  
		}

		int TC18=1;

		if(TC18==1) {

			String testcase_Name="TS_EMS_Contract_Registration_18";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);
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
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);

		}

		int TC19=1;

		if(TC19==1) {
			String testcase_Name="TS_EMS_Contract_Registration_19";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);

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
			
			// login

				Extent_Start(testcase_Name, test, test1);
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
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);


		}
		int TC20=1;

		if(TC20==1) { 

			String testcase_Name="TS_EMS_Contract_Registration_20";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
					File_Path);

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
			String Remove_Registration_Popup = data.get("Remove_Registration_Popup");
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


			
			// login

			Extent_Start(testcase_Name, test, test1);
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
}
