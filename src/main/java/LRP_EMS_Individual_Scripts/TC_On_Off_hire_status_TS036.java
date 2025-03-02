package LRP_EMS_Individual_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;

import commonMethods.Utils;
import locators.On_Off_Hire_Locators;

public class TC_On_Off_hire_status_TS036 extends Keywords{
	
	public void OnOffhirestatusTS036 (WebDriver driver,ExtentTest test,ExtentTest test1, String selected_dataset) throws Exception {
		
		String tc_Name="TC_On_Off_hire_status_TS036";

		String URL = TestNgXml.getdatafromExecution().get(tc_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name, tc_Name, "Dataset" + selected_dataset,File_Path);
		
		String Username = Excel_data.get("Username");
		String Password = Excel_data.get("Password");	
		String Search_input = Excel_data.get("Search_input");	
		String Location_hierachy36 = Excel_data.get("Location_hierachy36");	
		String Country_Code_value36 = Excel_data.get("Country_Code_value36");	
		String Sizeandtype_value36 = Excel_data.get("Sizeandtype_value36");	
		String service_input36 = Excel_data.get("service_input36");	
		String lessor_input36 = Excel_data.get("lessor_input36");	
		String condt_input36 = Excel_data.get("condt_input36");	
		String reportype_input36 = Excel_data.get("reportype_input36");	
		String lessorcontract_input36 = Excel_data.get("lessorcontract_input36");	
		String leasekind_input36 = Excel_data.get("leasekind_input36");	
		String lessee_input36 = Excel_data.get("lessee_input36");	
		String activity_input36 = Excel_data.get("activity_input36");	
		String sz_tp_buttons36 = Excel_data.get("sz_tp_buttons36");	
		String sum_det_input36 = Excel_data.get("sum_det_input36");	
		String detail_request = Excel_data.get("detail_request");	
		String date_Picker = Excel_data.get("date_Picker");
		String From_Date = Excel_data.get("From_Date");
		String To_Date = Excel_data.get("To_Date");	
		String Perform_ToDate = Excel_data.get("Perform_ToDate");	
		String equipment_first_cell = Excel_data.get("equipment_first_cell");	
		String equipment_last_cell = Excel_data.get("equipment_last_cell");	
		String condition = Excel_data.get("condition");	
		String service_code_header = Excel_data.get("service_code_header");
		String lessor_code_header = Excel_data.get("lessor_code_header");
		String contract_number_header = Excel_data.get("contract_number_header");
		String lesee_code_header = Excel_data.get("lesee_code_header");
		String activity_code_header = Excel_data.get("activity_code_header");
		String equipment_type_header = Excel_data.get("equipment_type_header");
		
		String country_code_header = Excel_data.get("country_code_header");
		

		
		String condt_input =String.format(On_Off_Hire_Locators.condt_input, condt_input36);
		String reportype_input =String.format(On_Off_Hire_Locators.reportype_input, reportype_input36);
		String leasekind_input =String.format(On_Off_Hire_Locators.leasekind_input, leasekind_input36);
		String sz_tp_btn =String.format(On_Off_Hire_Locators.sz_tp_btn, sz_tp_buttons36);
		String sum_det_btn =String.format(On_Off_Hire_Locators.sum_det_btn, sum_det_input36);
		String location_hierarchy_type =String.format(On_Off_Hire_Locators.location_hierarchy_type, Location_hierachy36);

		Extent_Start(tc_Name, test, test1);
		
		Step_Start(1, "open chrome browser ", test, test1);
		Step_Start(2, "Enter the url", test, test1);
		navigateUrl(driver, URL); 
		Step_End(2, "Enter the url", test, test1);
		Step_End(1, "open chrome browser ", test, test1);

		LRP_Login(driver, Username, Password);
	    
		Step_Start(6, "click on search field", test, test1);
		Step_Start(7, "Enter the Stock Report by on/off hire status field in search box", test, test1);
	
		moduleNavigate(driver, Search_input);

		    Step_End(7, "Enter the Stock Report by on/off hire status field in search box", test, test1);
			Step_End(6, "click on search field", test, test1);
		    
		    if(!service_input36.equals("")) {
					waitForElement(driver, service_searchicon36);
					click(driver, service_searchicon36);
					twoColumnSearchWindow(driver, service_code_header, condition, Sizeandtype_value36);
				}else {
					System.out.println("service_input36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(!lessor_input36.equals("")) {
				
					waitForElement(driver, lessor_searchicon36);
					click(driver, lessor_searchicon36);
					twoColumnSearchWindow(driver, lessor_code_header, condition, lessor_input36);

					
				
				}else {
					System.out.println("lessor_input36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(!condt_input36.equals("")) {
		    	waitForElement(driver, condt_field);
		    	click(driver, condt_field);
					waitForElement(driver, condt_input);
		    		click(driver, condt_input);
				
				}else {
					System.out.println("condt_input36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(!reportype_input36.equals("")) {
		    	waitForElement(driver, reportype_field);
		    	click(driver, reportype_field);
					waitForElement(driver, reportype_input);
		    		click(driver, reportype_input);
				
				}else {
					System.out.println("reportype_input36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(!lessorcontract_input36.equals("")) {
					waitForElement(driver, lessorcontract_searchicon36);
					click(driver, lessorcontract_searchicon36);
					twoColumnSearchWindow(driver, contract_number_header, condition, lessorcontract_input36);


				
				}else {
					System.out.println("lessorcontract_input36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(!leasekind_input36.equals("")) {
		    	waitForElement(driver, leasekind_field);
		    	click(driver, leasekind_field);
					waitForElement(driver, leasekind_input);
		    		click(driver, leasekind_input);
				
				}else {
					System.out.println("leasekind_input36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(!lessee_input36.equals("")) {
					waitForElement(driver, lessee_searchicon36);
					click(driver, lessee_searchicon36);
				//	selectValue(driver, condition, lessee_input36);
					twoColumnSearchWindow(driver, lesee_code_header, condition, lessee_input36);

				
				}else {
					System.out.println("lessee_input36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(!activity_input36.equals("")) {
					waitForElement(driver, activity_addicon);
					click(driver, activity_addicon);
//					selectValue(driver, condition, activity_input36);
					twoColumnSearchWindow(driver, activity_code_header, condition, activity_input36);

				
				}else {
					System.out.println("activity_input36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(!sz_tp_buttons36.equals("")) {
		    		waitForElement(driver, sz_tp_btn);
		    		click(driver, sz_tp_btn);
				}else {
					System.out.println("sz_tp_buttons36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(!sum_det_input36.equals("")) {
		    		waitForElement(driver, sum_det_btn);
		    		click(driver, sum_det_btn);
				
				}else {
					System.out.println("sum_det_input36 "+"Input Not Available in : "+File_Path);
				}
		    
		    if(detail_request.equals("YES")) {
		    		waitForElement(driver, detail_requestbtn);
		    		click(driver, detail_requestbtn);
				
				}else {
					System.out.println("detail_request "+"Input Not Available in : "+File_Path);
				}
		    
			Step_Start(8, "Click locational hierarchy drop menu", test, test1);
			waitForElement(driver, locations_inputfield);
			click(driver,locations_inputfield);
			
			waitForElement(driver, location_hierarchy_type);
			click(driver, location_hierarchy_type);
			
			
			waitForElement(driver, locationDropdownoption4);
			String locationDropdown_option4 = getText(driver, locationDropdownoption4);
			System.out.println("locationDropdown_option4: "+locationDropdown_option4);
			if(locationDropdown_option4.equals(Location_hierachy36)) {
				System.out.println("MATCHED || EXPECTED DROPDOWN VALUE IS: "+Location_hierachy36+ " || ACTUAL DROPDOWN VALUE IS :"+locationDropdown_option4 );
				Extent_pass(driver, "MATCHED || EXPECTED DROPDOWN VALUE IS: "+Location_hierachy36+ " || ACTUAL DROPDOWN VALUE IS :"+locationDropdown_option4, test, test1);
			}else {
				System.out.println("NOT MATCHED || EXPECTED DROPDOWN VALUE IS: "+Location_hierachy36+ " || ACTUAL DROPDOWN VALUE IS :"+locationDropdown_option4 );
				Extent_fail(driver, "NOT MATCHED || EXPECTED DROPDOWN VALUE IS: "+Location_hierachy36+ " || ACTUAL DROPDOWN VALUE IS :" +locationDropdown_option4, test, test1);
			}  
			Step_End(8, "Click locational hierarchy drop menu", test, test1);

			Step_Start(9, "Click search icon & select country accordingly", test, test1);
			waitForElement(driver, country_searchicon36);
			click(driver,country_searchicon36);
			twoColumnSearchWindow(driver, country_code_header, condition, Country_Code_value36);
			
			Step_End(9, "Click search icon & select country accordingly", test, test1);	
			
			Step_Start(10, "Click Size/type from drop menu then select option accrodingly", test, test1);
			waitForElement(driver, add_sizetype);
			click(driver,add_sizetype);
			twoColumnSearchWindow(driver, equipment_type_header, condition, Sizeandtype_value36);
			
			Step_End(10, "Click Size/type from drop menu then select option accrodingly", test, test1);

			Step_Start(11, "Select date from & to range accordingly ", test, test1);
			waitForElement(driver, fromdate36);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				
				selectDatePicker(driver, fromdate36, From_Date);
	
			} else {
				waitForElement(driver, fromdate36);
				clearAndType(driver, fromdate36, From_Date);
			}
			
			if(Perform_ToDate.equals("YES")) {
			waitForElement(driver, To_Date_new);
			if (date_Picker.equalsIgnoreCase("Yes")) {
				
				selectDatePicker(driver, To_Date_new, To_Date);
				
			} else {
				waitForElement(driver, To_Date_new);
				clearAndType(driver, To_Date_new, To_Date);
			}
			}
			Step_End(11, "Select date from & to range accordingly ", test, test1);
	
			Step_Start(12, "Click show button & it will show data in grid accordingly", test, test1);
			waitForElement(driver, click_showbtn);
			click(driver,click_showbtn);   
			Step_End(12, "Click show button & it will show data in grid accordingly", test, test1);

			Step_Start(12, "verify it show the data in the grid or not", test, test1);
			
			int first_cell = Integer.parseInt(equipment_first_cell);
			int last_cell = Integer.parseInt(equipment_last_cell);
	
			
			for(int i=first_cell;i<=last_cell;i++ ) {
				
				String cell_click=String.format(gridvalue_by_index, Sizeandtype_value36,i);
				
				String cellvalue = getText(driver, cell_click);
				Step_Start(13, "double the respective size/type count to get equipment listed detials", test, test1);

				click(driver, cell_click);
				
				Step_End(13, "double the respective size/type count to get equipment listed detials", test, test1);

				Step_Start(14, "verify after showing the grid double click on size/type that same count showing on the popup or not", test, test1);

				waitForElement(driver, ems_page_on_off_hire);
				String total_records_count = getText(driver, total_records36);
				
				if(cellvalue.equals(total_records_count)) {
					
					System.out.println("Expected equipment details count "+cellvalue+"|| actual equipment details count "+total_records_count);
					Extent_pass(driver, "Expected equipment details count "+cellvalue+"|| actual equipment details count "+total_records_count, test, test1);
				click(driver, ems_panel_close);
				
				}
				else {
					
					System.out.println("Expected equipment details count "+cellvalue+"|| actual equipment details count "+total_records_count);
					Extent_fail(driver, "Expected equipment details count "+cellvalue+"|| actual equipment details count "+total_records_count, test, test1);
					
				}
				Step_End(14, "verify after showing the grid double click on size/type that same count showing on the popup or not", test, test1);

			}
			

		
			Extent_completed(tc_Name, test, test1);
	}
	
	

}
