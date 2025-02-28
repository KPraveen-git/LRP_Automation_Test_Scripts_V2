package LRP_EMS_Movement_Entry_Integrations_Scripts;


import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS046 extends Keywords {

	public void Movement_Entry_Integration_TS046(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testcase_Name = "TC_Movement_Entry_Integration_TS046";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String location46 = data.get("Location");
		String eqpNumLODF46 = data.get("EqpNumLODF");
		String lodfActivity46 = data.get("LodfActivity");
		String locationINNSA = data.get("LocationINNSA");
		String invalidPortError = data.get("InvalidPortError");
		String activityDateSingle46 = data.get("activityDateSingle46");
		String activityTime_Input1 = data.get("activityTime_Input1");
		String datePicker = data.get("datePicker");
		
		//NM
				String location_data = data.get("location_data");
				String terminal_data = data.get("terminal_data");
				String bookno_data = data.get("bookno_data");
				String service_data = data.get("service_data");
				String vessel_data = data.get("vessel_data");
				String voyage_data = data.get("voyage_data");
				String Bound_data = data.get("Bound_data");
				String dest_data = data.get("dest_data");
				String lessor_data = data.get("lessor_data");
				String OH_data = data.get("OH_data");
				String carrier_seal_data = data.get("carrier_seal_data");
				String stowage_data = data.get("stowage_data");
				String rel_ref_num_data = data.get("rel_ref_num_data");
				String consignee_data = data.get("consignee_data");
				String remark_data = data.get("remark_data");
				String OW_amt_data = data.get("OW_amt_data");
				String gross_wt_data = data.get("gross_wt_data");
				String OL_data = data.get("OL_data");
				String cargo_wt_data = data.get("cargo_wt_data");
				String sup_contract_data = data.get("sup_contract_data");
				String ref_num_data = data.get("ref_num_data");
				String OW_ind_data = data.get("OW_ind_data");
				String IMO_data = data.get("IMO_data");
				String OW_data = data.get("OW_data");
				String temp_data = data.get("temp_data");
				String POR_data = data.get("POR_data");
				String Ship_seal_data = data.get("Ship_seal_data");
				String delivery_data = data.get("delivery_data");
				
		

		navigateUrl(driver, URL);

		Extent_Start(testcase_Name, test, test1);

		// Login

		LRP_Login(driver, username, password);

		// To validate if user given incorrect POD for LODF move
		Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

				//Module Search
				moduleNavigate(driver, moduleName);
				
		Step_End(1, "Enter module name in searchbox & click the module", test, test1);

		// Movement Entry
		waitForElement(driver, movementEntryPage_L);
		if (isDisplayed(driver, movementEntryPage_L)) {
			Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
		} else {
			System.out.println("Movement Entry Page is not displayed");
			Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			
		}

		// Single Entry Equipment
		waitForElement(driver, singleEntryMovPage_L);
		if (isDisplayed(driver, singleEntryMovPage_L)) {
			Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
			waitForElement(driver, equipmentNoSearchField_L);
			sendKeys(driver, equipmentNoSearchField_L, eqpNumLODF46);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, lodfActivity46);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			
			Extent_call(test, test1, "Entering the Date & Time period");
			if (!activityDateSingle46.equals("")) {
				waitForElement(driver, activeDateInSingle_L);
				
				
				if(datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle46);

						
				}else {
					click(driver, activeDateInSingle_L);

					if(activityDateSingle46.contains("-")) {
						String activityDateSingle46_1=activityDateSingle46.replace("-", "/");
						clear(driver,activeDateInSingle_L);
						sendKeys(driver, activeDateInSingle_L, activityDateSingle46_1);
						
					}else {
					clearAndType(driver, activeDateInSingle_L, activityDateSingle46);
					
					}		
				}
			}
			
			if (!activityTime_Input1.equals("")) {
				waitForElement(driver, activityTime);
				click(driver, activityTime);

				
				if (isDisplayed(driver, Calender)) {
					click(driver, activityTime_Input);
					
					

						clearAndType(driver, activityTime_Input, activityTime_Input1);
						System.out.println("activity_Time" + activityTime_Input1);
					
				}
				
				click(driver, activityTime_Close);
			} 
			waitForElement(driver, showInputSin_L);
			click(driver, showInputSin_L);
		}
		waitForElement(driver, showInputFieldFrame_L);
		if (isDisplayed(driver, showInputFieldFrame_L)) {
			Extent_pass(driver, "Show input field frame is displayed", test, test1);
			System.out.println("Show input field frame is displayed");
		} else {
			Extent_fail(driver, "Show input field frame is not displayed", test, test1);
			System.out.println("Show input field frame is not displayed");
			
		}

		Extent_call(test, test1, "******Entering the origin********** ");
		waitForElement(driver, pol_Searchfield);
		click(driver, pol_Searchfield);
		
		clear(driver, pol_Searchfield);
		
		sendKeys(driver, pol_Searchfield, locationINNSA);
		
		enter(driver);
      Step_Start(2, "Ensure that system should validate if the given POD is not connected for the load port & click save after providing all mandatory fields", test, test1);
		waitForElement(driver, pod_Searchfield);
		click(driver, pod_Searchfield);
		
		clear(driver, pod_Searchfield);
		
		sendKeys(driver, pod_Searchfield, location46);
		
		enter(driver);

		if(!location_data.equals("")) {
			waitForElement(driver, P_Location_Txt_Field);
			clearAndType(driver, P_Location_Txt_Field,location_data);
		}
		
		if(!terminal_data.equals("")) {
			waitForElement(driver, P_Terminal_Txt_Field);
			clearAndType(driver, P_Terminal_Txt_Field,terminal_data);
		}
		
		if(!bookno_data.equals("")) {
			waitForElement(driver, P_BookingNO_Txt_Field);
			clearAndType(driver, P_BookingNO_Txt_Field,bookno_data);
		}
		
		if(!service_data.equals("")) {
			waitForElement(driver, P_Service_Txt_Field);
			clearAndType(driver, P_Service_Txt_Field,service_data);
		}
		
		if(!vessel_data.equals("")) {
			waitForElement(driver, P_Vessel_Txt_Field);
			clearAndType(driver, P_Vessel_Txt_Field ,vessel_data);
		}
		
		if(!voyage_data.equals("")) {
			waitForElement(driver, P_Voyage_Txt_Field);
			clearAndType(driver, P_Voyage_Txt_Field,voyage_data);
		}
		
		if(!Bound_data.equals("")) {
			waitForElement(driver, P_Bound_Txt_Field);
			clearAndType(driver, P_Bound_Txt_Field,Bound_data);
		}
		
		if(!dest_data.equals("")) {
			waitForElement(driver, P_Dest_Txt_Field);
			clearAndType(driver, P_Dest_Txt_Field,dest_data);
		}
		
		if(!lessor_data.equals("")) {
			waitForElement(driver, Lessor);
			clearAndType(driver, Lessor,lessor_data);
		}
		
		if(!OH_data.equals("")) {
			waitForElement(driver, O_H);
			clearAndType(driver, O_H,location_data);
		}
		
		if(!carrier_seal_data.equals("")) {
			waitForElement(driver, Carrier_Seal);
			clearAndType(driver, Carrier_Seal,carrier_seal_data);
		}
		
		if(!stowage_data.equals("")) {
			waitForElement(driver, Stowage);
			clearAndType(driver, Stowage,stowage_data);
		}
		
		if(!rel_ref_num_data.equals("")) {
			waitForElement(driver, Release_Ref_no);
			clearAndType(driver, Release_Ref_no,rel_ref_num_data);
		}
		
		if(!consignee_data.equals("")) {
			waitForElement(driver, Consignee);
			clearAndType(driver, Consignee,consignee_data);
		}
		
		if(!remark_data.equals("")) {
			waitForElement(driver, Remarks);
			clearAndType(driver, Remarks,remark_data);
		}
		
		if(!OW_amt_data.equals("")) {
			waitForElement(driver, OW_amount);
			clearAndType(driver, OW_amount,OW_amt_data);
		}
		
		if(!gross_wt_data.equals("")) {
			waitForElement(driver, Gross_Weight);
			clearAndType(driver, Gross_Weight,gross_wt_data);
		}
		
		if(!OL_data.equals("")) {
			waitForElement(driver, O_L);
			clearAndType(driver, O_L,OL_data);
		}
		
		if(!cargo_wt_data.equals("")) {
			waitForElement(driver, Cargo_Weight);
			clearAndType(driver, Cargo_Weight,cargo_wt_data);
		}
		
		if(!sup_contract_data.equals("")) {
			waitForElement(driver, Supplier_Contract);
			clearAndType(driver, Supplier_Contract,sup_contract_data);
		}
		
		if(!ref_num_data.equals("")) {
			waitForElement(driver, Ref_Number);
			clearAndType(driver, Ref_Number,ref_num_data);
		}
		
		if(!OW_ind_data.equals("")) {
			waitForElement(driver, O_W_ind);
			click(driver, O_W_ind);
			waitForElement(driver, File_Path);
			String OW_ind_opt =  String.format(owind,OW_ind_data);
			
			click(driver, OW_ind_opt);

		}
		
		if(!IMO_data.equals("")) {
			waitForElement(driver, IMO);
			clearAndType(driver, IMO,IMO_data);
		}
		
		if(!OW_data.equals("")) {
			waitForElement(driver, O_W);
			clearAndType(driver, O_W,OW_data);
		}
		
		if(!temp_data.equals("")) {
			waitForElement(driver, temp);
			clearAndType(driver, temp,temp_data);
		}
		
		if(!POR_data.equals("")) {
			waitForElement(driver, POR);
			clearAndType(driver, POR,POR_data);
		}
		
		if(!Ship_seal_data.equals("")) {
			waitForElement(driver, Shipper_Seal);
			clearAndType(driver, Shipper_Seal,Ship_seal_data);
		}
		
		if(!delivery_data.equals("")) {
			waitForElement(driver, Delivery);
			clearAndType(driver, Delivery,delivery_data);
		}
		
		if(!lessor_data.equals("")) {
			waitForElement(driver, Lessor);
			clearAndType(driver, Lessor,lessor_data);
		}
		
		scrollTop(driver);
		waitForElement(driver, saveButtonMoveEnt_L);
		click(driver, saveButtonMoveEnt_L);
		Step_End(2, "Ensure that system should validate if the given POD is not connected for the load port & click save after providing all mandatory fields", test, test1);
		
      Step_Start(3, "Ensure that system should validate as 'INVALID PORT. VESSEL NOT CALLING'.", test, test1);
		waitForElement(driver, errorRecordsFrame_L);

			String actualInvalidPortError = getText(driver, invalid_Port_Error);

			if (actualInvalidPortError.equals(invalidPortError)) {
				System.out.println("Matched || " + " Expected Value is : " + invalidPortError + " || Actual Value is : "
						+ actualInvalidPortError);
				Extent_pass(driver, "Matched || " + " Expected Value is : " + invalidPortError + " || ActualValue is : "
						+ actualInvalidPortError, test, test1);
				Extent_pass(driver, invalidPortError + " Error is displayed", test, test1);
				System.out.println(invalidPortError + " Error is displayed");
			} else {
				System.out.println("Not matched || " + " Expected Value is : " + invalidPortError
						+ " || Actual Value  is : " + actualInvalidPortError);
				Extent_fail(driver, "Not matched || " + " Expected Value is : " + invalidPortError
						+ " || Actual Value is : " + actualInvalidPortError, test, test1);
				Extent_fail(driver, invalidPortError + " Error is not displayed", test, test1);
				
				System.out.println(invalidPortError + " Error is not displayed");
			}
			Step_End(3, "Ensure that system should validate as 'INVALID PORT. VESSEL NOT CALLING'.", test, test1);
		
			click(driver, okButtonErrorFrame_L);
			Extent_completed(testcase_Name, test, test1);

		

	}
}
