package LRP_EMS_Consolidated_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_TS051_TS067_I extends Keywords{
	public void noOfCharactersInMovementEntry51to67(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) {
		
		String testcase_Name51 = "TC_Movement_Entry_Integration_TS051";
		String URL = TestNgXml.getdatafromExecution().get("TC_Movement_Entry_TS051_TS067_I");
		String File_Path51 = TestNgXml.getfilePath_FromExecution().get(testcase_Name51);
		String Sheet_Name51 = TestNgXml.getsheetName_FromExecution().get(testcase_Name51);
		System.out.println(Sheet_Name51);
		Map<String, String> data51 = Utils.GetAllData(Sheet_Name51, testcase_Name51, "Dataset" + selected_dataset, File_Path51);
		
		String username = data51.get("Username");
		String password = data51.get("Password");
		
		navigateUrl(driver, URL);

		LRP_Login(driver, username, password);
		
					int i = 1;
		
		if(i==1) {

			String testcase_Name = "TC_Movement_Entry_Integration_TS051";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			
			String moduleName = data.get("ModuleMovementEntry");
			String Activity_Move_Txt3 = data.get("Activity_Move");
			String Location_Input_Txt3 = data.get("Location_Input");
			String Terminal_Input_Txt3 = data.get("Terminal_Input");
			String BookinNo_Input_Txt3 = data.get("BookinNo_Input");
			String Service_Input_Txt3 = data.get("Service_Input");
			String Bound_Input_Txt3 = data.get("Bound_Input");
			String POL_input_Txt3 = data.get("POL_input");
			String POD_Input_Txt3 = data.get("POD_Input");
			String Dest_Input_Txt3 = data.get("Dest_Input");
			String Equip_Number_Txt3 = data.get("Equip_Number");
			String Invalid_Voyage_Exp = data.get("Invalid_Voyage");
			String activityDateSingle51 = data.get("activityDateSingle51");
			String datePicker = data.get("datePicker");
			String activityTime_Input1 = data.get("activityTime_Input1");
			
			//NM
					
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
					

					Extent_Start(testcase_Name, test, test1);
					

			// To validate if user try to save invalid voyage in LODF
					
					//Module Search
					moduleNavigate(driver, moduleName);

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, Activity_Move_Txt3);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				if (!activityDateSingle51.equals("")) {
					waitForElement(driver, MultiActivity_Date);
					
					
					if(datePicker.equalsIgnoreCase("Yes")) {
						Extent_call(test, test1, "Entering the date,month & year");
						selectDatePicker(driver, MultiActivity_Date, activityDateSingle51);

							
							
					}else {
						click(driver, MultiActivity_Date);

						if(activityDateSingle51.contains("-")) {
							String activityDateSingle50_1=activityDateSingle51.replace("-", "/");
							clear(driver,MultiActivity_Date);
							sendKeys(driver, MultiActivity_Date, activityDateSingle50_1);
							
						}else {
						clearAndType(driver, MultiActivity_Date, activityDateSingle51);
						
						}		
					}
				}
				
				if (!activityTime_Input1.equals("")) {
					
					click(driver, activityTimeMultiple);

					
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						
						Extent_call(test, test1, "Entering the time");

							clearAndType(driver, activityTime_Input, activityTime_Input1);
							System.out.println("activity_Time" + activityTime_Input1);
						
					}
					
					click(driver, activityTime_Close);
				} 
				
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					System.out.println("Show input field frame is displayed");
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
					
				}

				waitForElement(driver, P_Location_Txt_Field);
				click(driver, P_Location_Txt_Field);
				sendKeys(driver, P_Location_Txt_Field, Location_Input_Txt3);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, P_Terminal_Txt_Field);
				click(driver, P_Terminal_Txt_Field);
				sendKeys(driver, P_Terminal_Txt_Field, Terminal_Input_Txt3);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				waitForElement(driver, P_BookingNO_Txt_Field);
				click(driver, P_BookingNO_Txt_Field);
				sendKeys(driver, P_BookingNO_Txt_Field, BookinNo_Input_Txt3);
				enter(driver);
				
				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);
				sendKeys(driver, P_Service_Txt_Field, Service_Input_Txt3);
				enter(driver);
				
				waitForElement(driver, P_Bound_Txt_Field);
				click(driver, P_Bound_Txt_Field);
				clear(driver, P_Bound_Txt_Field);
				enter(driver);
				sendKeys(driver, P_Bound_Txt_Field, Bound_Input_Txt3);
				enter(driver);
				
				waitForElement(driver, P_POL_Txt_Field);
				click(driver, P_POL_Txt_Field);
				sendKeys(driver, P_POL_Txt_Field, POL_input_Txt3);
				enter(driver);
				
				waitForElement(driver, P_POD_Txt_Field);
				click(driver, P_POD_Txt_Field);
				sendKeys(driver, P_POD_Txt_Field, POD_Input_Txt3);
				enter(driver);
				
				waitForElement(driver, P_Dest_Txt_Field);
				click(driver, P_Dest_Txt_Field);
				sendKeys(driver, P_Dest_Txt_Field, Dest_Input_Txt3);
				enter(driver);

				waitForElement(driver, P_Service_Txt_Field);
				clear(driver, P_Service_Txt_Field);
				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);
				sendKeys(driver, P_Service_Txt_Field, Service_Input_Txt3);
				enter(driver);

				waitForElement(driver, P_Vessel_Txt_Field);
				click(driver, P_Vessel_Txt_Field);
				clear(driver, P_Vessel_Txt_Field);
				sendKeys(driver, P_Vessel_Txt_Field, POD_Input_Txt3);
				enter(driver);

				waitForElement(driver, P_Voyage_Txt_Field);
				click(driver, P_Voyage_Txt_Field);
				clear(driver, P_Voyage_Txt_Field);
				sendKeys(driver, P_Voyage_Txt_Field, Dest_Input_Txt3);
				enter(driver);

				waitForElement(driver, P_Bound_Txt_Field);
				click(driver, P_Bound_Txt_Field);
				clear(driver, P_Bound_Txt_Field);
				sendKeys(driver, P_Bound_Txt_Field, Bound_Input_Txt3);
				enter(driver);
				
				
				if(!lessor_data.equals("")) {
					waitForElement(driver, Lessor);
					clearAndType(driver, Lessor,lessor_data);
				}
				
				if(!OH_data.equals("")) {
					waitForElement(driver, O_H);
					clearAndType(driver, O_H,OH_data);
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
				

				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);

				
				waitForElement(driver, selectGridCell_1_L);
				click(driver, selectGridCell_1_L);
				sendKeys(driver, eqpNum_Inputfield, Equip_Number_Txt3);
			
				scrollTop(driver);
				waitForElement(driver, saveButtonMoveEnt_L);
				click(driver, saveButtonMoveEnt_L);

				waitForElement(driver, P_Invalid_Voyage_Popup);
				String voyage_Popup = getText(driver, P_Invalid_Voyage_Popup);
				if (Invalid_Voyage_Exp.equals(voyage_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Invalid_Voyage_Exp
							+ " || Actual Report Activity is : " + voyage_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Invalid_Voyage_Exp
							+ " || Actual Report Activity is : " + voyage_Popup, test, test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Invalid_Voyage_Exp
							+ " || Actual Report Activity is : " + voyage_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Invalid_Voyage_Exp
							+ " || Actual Report Activity is : " + voyage_Popup, test, test1);
					
				}

				click(driver, P_Ok_Btn);
				Extent_completed(testcase_Name, test, test1);
			
			
			waitForElement(driver, close_tab);
			click(driver, close_tab);
			
			}

		}
		if(i==1) {

			String testcase_Name = "TC_Movement_Entry_Integration_TS052";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			
			String moduleName = data.get("ModuleMovementEntry");
			String Activity_Move_Txt4 = data.get("Activity_Move");
			String Location_Input_Txt4 = data.get("Location_Input");
			String Terminal_Input_Txt4 = data.get("Terminal_Input");
			String BookinNo_Input_Txt4 = data.get("BookinNo_Input");
			String Service_Input_Txt4 = data.get("Service_Input");
			String Bound_Input_Txt4 = data.get("Bound_Input");
			String POL_input_Txt4 = data.get("POL_input");
			String POD_Input_Txt4 = data.get("POD_Input");
			String Dest_Input_Txt4 = data.get("Dest_Input");
			String Equip_Number_Txt4 = data.get("Equip_Number");
			String Invalid_Bound_Exp = data.get("Invalid_Bound");
			String activityDateSingle52 = data.get("activityDateSingle52");
			String activityTime_Input1 = data.get("activityTime_Input1");
			String datePicker = data.get("datePicker");
			String POD_Input_Txt3 = data.get("POD_Input");
			
			//NM
			String vessel_data = data.get("vessel_data");
			String voyage_data = data.get("voyage_data");
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
			
			Extent_Start(testcase_Name, test, test1);

			// To validate if user try to save invalid bound in LODF
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

					//Module Search
					moduleNavigate(driver, moduleName);
					
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, Activity_Move_Txt4);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				if (!activityDateSingle52.equals("")) {
					waitForElement(driver, MultiActivity_Date);
					
					if(datePicker.equalsIgnoreCase("Yes")) {
						Extent_call(test, test1, "Entering the date,month & year");
						selectDatePicker(driver, MultiActivity_Date, activityDateSingle52);

					}else {
						click(driver, MultiActivity_Date);

						if(activityDateSingle52.contains("-")) {
							String activityDateSingle50_1=activityDateSingle52.replace("-", "/");
							clear(driver,MultiActivity_Date);
							sendKeys(driver, MultiActivity_Date, activityDateSingle50_1);
							
						}else {
						clearAndType(driver, MultiActivity_Date, activityDateSingle52);
						
						}		
					}
				}
				
				if (!activityTime_Input1.equals("")) {
					
					click(driver, activityTimeMultiple);

					
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						
						Extent_call(test, test1, "Entering the time");
							clearAndType(driver, activityTime_Input, activityTime_Input1);
							System.out.println("activity_Time" + activityTime_Input1);
						
					}
					
					click(driver, activityTime_Close);
				} 
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					System.out.println("Show input field frame is displayed");
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				
				}
	Step_Start(2, " Ensure that system should validate if user try save LODF move with all valid details & given invalid bound ", test, test1);
				waitForElement(driver, P_Location_Txt_Field);
				click(driver, P_Location_Txt_Field);
				sendKeys(driver, P_Location_Txt_Field, Location_Input_Txt4);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, P_Terminal_Txt_Field);
				click(driver, P_Terminal_Txt_Field);
				sendKeys(driver, P_Terminal_Txt_Field, Terminal_Input_Txt4);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, P_BookingNO_Txt_Field);
				click(driver, P_BookingNO_Txt_Field);
				sendKeys(driver, P_BookingNO_Txt_Field, BookinNo_Input_Txt4);
				enter(driver);
				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);
				sendKeys(driver, P_Service_Txt_Field, Service_Input_Txt4);
				
				enter(driver);
				
				Extent_call(test, test1, "Giving invalid bound data");
				waitForElement(driver, P_Bound_Txt_Field);
				click(driver, P_Bound_Txt_Field);
				clear(driver, P_Bound_Txt_Field);
				enter(driver);
				sendKeys(driver, P_Bound_Txt_Field, Bound_Input_Txt4);
				enter(driver);
				waitForElement(driver, P_POL_Txt_Field);
				click(driver, P_POL_Txt_Field);
				sendKeys(driver, P_POL_Txt_Field, POL_input_Txt4);
				enter(driver);
				waitForElement(driver, P_POD_Txt_Field);
				click(driver, P_POD_Txt_Field);
				sendKeys(driver, P_POD_Txt_Field, POD_Input_Txt4);
				enter(driver);
				waitForElement(driver, P_Dest_Txt_Field);
				click(driver, P_Dest_Txt_Field);
				sendKeys(driver, P_Dest_Txt_Field, Dest_Input_Txt4);
				enter(driver);
				waitForElement(driver, P_Vessel_Txt_Field);
				click(driver, P_Vessel_Txt_Field);
				
				clear(driver, P_Vessel_Txt_Field);
				
				sendKeys(driver, P_Vessel_Txt_Field, POD_Input_Txt3);
				
				enter(driver);
				waitForElement(driver, P_Voyage_Txt_Field);
				click(driver, P_Voyage_Txt_Field);
				
				clear(driver, P_Voyage_Txt_Field);
				
				sendKeys(driver, P_Voyage_Txt_Field, Dest_Input_Txt4);
				
				enter(driver);

				waitForElement(driver, P_Bound_Txt_Field);
				click(driver, P_Bound_Txt_Field);
				
				clear(driver, P_Bound_Txt_Field);
				sendKeys(driver, P_Bound_Txt_Field, Invalid_Bound_Exp);
				enter(driver);

				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);
				
				waitForElement(driver, selectGridCell_1_L);
				click(driver, selectGridCell_1_L);
				
				sendKeys(driver, eqpNum_Inputfield, Equip_Number_Txt4);
				
				if(!vessel_data.equals("")) {
					waitForElement(driver, P_Vessel_Txt_Field);
					clearAndType(driver, P_Vessel_Txt_Field ,vessel_data);
				}
				
				if(!voyage_data.equals("")) {
					waitForElement(driver, P_Voyage_Txt_Field);
					clearAndType(driver, P_Voyage_Txt_Field,voyage_data);
				}
				
				if(!lessor_data.equals("")) {
					waitForElement(driver, Lessor);
					clearAndType(driver, Lessor,lessor_data);
				}
				
				if(!OH_data.equals("")) {
					waitForElement(driver, O_H);
					clearAndType(driver, O_H,OH_data);
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
	Step_End(2, " Ensure that system should validate if user try save LODF move with all valid details & given invalid bound ", test, test1);
			
	Step_Start(3, " Ensure that system should validate as 'Invalid bound'.", test, test1);
				waitForElement(driver, P_Invalid_Bound_Popup);
				String Bound_Popup = getText(driver, P_Invalid_Bound_Popup);
				if (Invalid_Bound_Exp.equals(Bound_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Invalid_Bound_Exp
							+ " || Actual Report Activity is : " + Bound_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Invalid_Bound_Exp
							+ " || Actual Report Activity is : " + Bound_Popup, test, test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Invalid_Bound_Exp
							+ " || Actual Report Activity is : " + Bound_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Invalid_Bound_Exp
							+ " || Actual Report Activity is : " + Bound_Popup, test, test1);
					
				}
	Step_End(3, " Ensure that system should validate as 'Invalid bound'.", test, test1);
				click(driver, P_Ok_Btn);
			}
			Extent_completed(testcase_Name, test, test1);

			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		if(i==1) {


			String testcase_Name = "TC_Movement_Entry_Integration_TS053";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String Activity_Move_Txt5 = data.get("Activity_Move");
			String Location_Input_Txt5 = data.get("Location_Input");
			String Terminal_Input_Txt5 = data.get("Terminal_Input");
			String BookinNo_Input_Txt5 = data.get("BookingNo_Input");
			String POL_input_Txt5 = data.get("POL_input");
		
			String Equip_Number_Txt5 = data.get("Equip_Number");
			String Invalid_Terminal_Exp = data.get("Invalid_Terminal");

			String vessel = data.get("Vessel");
			String DatePicker = data.get("DatePicker");
			String activityDate = data.get("ActivityDate");
			String OW_amount_Input = data.get("OW_amount_Input");

			String Gross_Weight1_Input = data.get("Gross_Weight1_Input");
			String condition_Input = data.get("condition_Input");
		
			String POD_Input = data.get("POD_Input");
			String Voyage_Input = data.get("Voyage_Input");
			String lessee1_Input = data.get("lessee1_Input");
			String O_W1_Input = data.get("O_W1_Input");
			String Remarks2_Input = data.get("Remarks2_Input");
			String Bound1_input = data.get("Bound1_input");
			String dest1_Input = data.get("dest1_Input");

			String IMO1_Input = data.get("IMO1_Input");
			String temp_Input = data.get("temp_Input");
			String BL_no_Input = data.get("BL_no_Input");
			String O_H_Input = data.get("O_H_Input");
			String Delivery_Input = data.get("Delivery_Input");
			String service_Input = data.get("service_Input");
			String Lessor1_Input = data.get("Lessor1_Input");
			String Carrier_Seal_Input = data.get("Carrier_Seal_Input");
			String Release_Ref_no1_Input = data.get("Release_Ref_no1_Input");
			String Ref_Number1_Input = data.get("Ref_Number1_Input");
			String O_L2_Input = data.get("O_L2_Input");
			String activityTime_Input1 = data.get("ActivityTime");
			String condition = data.get("Condition");
			String bookingSearch_Filter=data.get("BookingSearch_Filter");

			Extent_Start(testcase_Name, test, test1);

			//// To validate if user given incorrect terminal for DCHF

					//Module Search
					moduleNavigate(driver, moduleName);

			Step_Start(1,
					" try save DCHF move with all valid details & given incorrect terminal which is not matched in booking terminal ",
					test, test1);
			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, Activity_Move_Txt5);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				if (!activityDate.equals("")) {
					waitForElement(driver, activeDateField_L);
					click(driver, activeDateField_L);

					if (DatePicker.equalsIgnoreCase("Yes")) {
						selectDatePicker(driver, activeDateField_L, activityDate);

					} else {
						if (DatePicker.contains("-")) {
							String activityDate_1 = activityDate.replace("-", "/");
							clearAndType(driver, activeDateField_L, activityDate_1);

						} else {
							clearAndType(driver, activeDateField_L, activityDate);

						}
					}
				}

				if (!activityTime_Input1.equals("")) {
					click(driver, activityTimeMultiple);

					waitForElement(driver, Calender);
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);

						clearAndType(driver, activityTime_Input, activityTime_Input1);
						System.out.println("activity_Time" + activityTime_Input1);

					}
					click(driver, activityTime_Close);
				}

				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					System.out.println("Show input field frame is displayed");
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
					
				}

				waitForElement(driver, P_Location_Txt_Field);
				click(driver, P_Location_Txt_Field);
				waitForElement(driver, P_Location_Txt_Field);
				sendKeys(driver, P_Location_Txt_Field, Location_Input_Txt5);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, P_Terminal_Txt_Field);
				click(driver, P_Terminal_Txt_Field);
				waitForElement(driver, P_Terminal_Txt_Field);
				sendKeys(driver, P_Terminal_Txt_Field, Terminal_Input_Txt5);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, bookingSearch_Button);
				click(driver, bookingSearch_Button);
				twoColumnSearchWindow(driver, bookingSearch_Filter, condition, BookinNo_Input_Txt5);
				
				
				if (!vessel.equals("")) {
					waitForElement(driver, P_Vessel_Txt_Field);
					clear(driver, P_Vessel_Txt_Field);
					waitForElement(driver, P_Vessel_Txt_Field);
					sendKeys(driver, P_Vessel_Txt_Field, vessel);
					enter(driver);
				}
				if (!POL_input_Txt5.equals("")) {
					waitForElement(driver, P_POL_Txt_Field);
					clear(driver, P_POL_Txt_Field);
					waitForElement(driver, P_POL_Txt_Field);
					sendKeys(driver, P_POL_Txt_Field, POL_input_Txt5);
					enter(driver);
				}

				if (!OW_amount_Input.equals("")) {
					waitForElement(driver, OW_amount);
					clearAndType(driver, OW_amount, OW_amount_Input);
					enter(driver);
				}

				if (!Voyage_Input.equals("")) {
					waitForElement(driver, Voyage);
					clearAndType(driver, Voyage, Voyage_Input);
					enter(driver);
				}

				if (!POD_Input.equals("")) {
					waitForElement(driver, pod_Searchfield);
					clearAndType(driver, pod_Searchfield, POD_Input);
					enter(driver);
				}


				if (!condition_Input.equals("")) {
					waitForElement(driver, condition_Dropdown);
					click(driver, condition_Dropdown);
					String condition_click = String.format(reference_type, condition_Input);
					click(driver, condition_click);
				}

				if (!Gross_Weight1_Input.equals("")) {
					waitForElement(driver, grossWeight_Textfield);
					clearAndType(driver, grossWeight_Textfield, Gross_Weight1_Input);
				}
				if (!O_W1_Input.equals("")) {
					waitForElement(driver, O_W);
					clearAndType(driver, O_W, O_W1_Input);
				}

				if (!Remarks2_Input.equals("")) {
					waitForElement(driver, remarks_Textfield);
					clearAndType(driver, remarks_Textfield, Remarks2_Input);
				}
				if (!Bound1_input.equals("")) {
					waitForElement(driver, Bound);
					clearAndType(driver, Bound, Bound1_input);
				}

				if (!dest1_Input.equals("")) {
					waitForElement(driver, destSearchfield);
					clearAndType(driver, destSearchfield, dest1_Input);
					enter(driver);

				}
				if (!lessee1_Input.equals("")) {
					waitForElement(driver, lessee_Searchfield);
					clearAndType(driver, lessee_Searchfield, lessee1_Input);
					enter(driver);
				}

				if (!IMO1_Input.equals("")) {
					waitForElement(driver, imo_Textfield);
					clearAndType(driver, imo_Textfield, IMO1_Input);
				}

				if (!temp_Input.equals("")) {
					waitForElement(driver, temp_textfield);
					clearAndType(driver, temp_textfield, temp_Input);
				}

				if (!lessee1_Input.equals("")) {
					waitForElement(driver, lessee_Searchfield);
					clearAndType(driver, lessee_Searchfield, lessee1_Input);
					enter(driver);
				}

				if (!BL_no_Input.equals("")) {
					waitForElement(driver, blno);
					clearAndType(driver, blno, BL_no_Input);
					enter(driver);
				}

				if (!O_H_Input.equals("")) {
					waitForElement(driver, oh_Textfield);
					clearAndType(driver, oh_Textfield, O_H_Input);
					enter(driver);

				}

				if (!Delivery_Input.equals("")) {
					waitForElement(driver, Delivery_Searchfield);
					clearAndType(driver, Delivery_Searchfield, Delivery_Input);
					enter(driver);
				}

				if (!service_Input.equals("")) {
					waitForElement(driver, service);
					clearAndType(driver, service, service_Input);
					enter(driver);
				}

				if (!Lessor1_Input.equals("")) {
					waitForElement(driver, Lessor1);
					clearAndType(driver, Lessor1, Lessor1_Input);
				}

				if (!Carrier_Seal_Input.equals("")) {
					waitForElement(driver, Carrier_Seal);
					clearAndType(driver, Carrier_Seal, Carrier_Seal_Input);
				}
				if (!Release_Ref_no1_Input.equals("")) {
					waitForElement(driver, relRefNoTextField_L);
					clearAndType(driver, relRefNoTextField_L, Release_Ref_no1_Input);
				}
				if (!Ref_Number1_Input.equals("")) {
					waitForElement(driver, refNumber_Textfield);
					clearAndType(driver, refNumber_Textfield, Ref_Number1_Input);
				}

				if (!O_L2_Input.equals("")) {
					waitForElement(driver, O_L);
					clearAndType(driver, O_L, O_L2_Input);

				}

				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);

				waitForElement(driver, selectGridCell_1_L);
				click(driver, selectGridCell_1_L);
				waitForElement(driver, eqpNum_Inputfield);
				sendKeys(driver, eqpNum_Inputfield, Equip_Number_Txt5);

				waitForElement(driver, eqpNum_Inputfield);
				scrollTop(driver);
				waitForElement(driver, saveButtonMoveEnt_L);
				click(driver, saveButtonMoveEnt_L);
				Step_End(1,
						" try save DCHF move with all valid details & given incorrect terminal which is not matched in booking terminal ",
						test, test1);
				Step_Start(2, "Ensure that system should validate as 'INVALID TERMINAL'.", test, test1);
				waitForElement(driver, P_Invalid_Terminal_Popup);
				String Terminal_Popup = getText(driver, P_Invalid_Terminal_Popup);
				if (Invalid_Terminal_Exp.equals(Terminal_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Invalid_Terminal_Exp
							+ " || Actual Report Activity is : " + Terminal_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Invalid_Terminal_Exp
							+ " || Actual Report Activity is : " + Terminal_Popup, test, test1);
					click(driver, P_Ok_Btn);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Invalid_Terminal_Exp
							+ " || Actual Report Activity is : " + Terminal_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Invalid_Terminal_Exp
							+ " || Actual Report Activity is : " + Terminal_Popup, test, test1);
					
				}
				Step_End(2, "Ensure that system should validate as 'INVALID TERMINAL'.", test, test1);
				Extent_completed(testcase_Name, test, test1);
			}
			
				waitForElement(driver, close_tab);
				click(driver, close_tab);
			
		}
		if(i==1) {
			

			String testcase_Name = "TC_Movement_Entry_Integration_TS054";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			
			String moduleName = data.get("ModuleMovementEntry");
			String Activity_Move_Txt5 = data.get("Activity_Move");
			String Location_Input_Txt5 = data.get("Location_Input");
			String Terminal_Input_Txt5 = data.get("Terminal_Input");
			String BookinNo_Input_Txt5 = data.get("BookingNo_Input");
			String POL_input_Txt5 = data.get("POL_input");
			String Equip_Number_Txt5 = data.get("Equip_Number");
			String Invalid_POD_Exp = data.get("ErrorMessage");

			String vessel = data.get("Vessel");
			String DatePicker = data.get("DatePicker");
			String activityDate = data.get("ActivityDate");
			String OW_amount_Input = data.get("OW_amount_Input");

			String Gross_Weight1_Input = data.get("Gross_Weight1_Input");
			String condition_Input = data.get("condition_Input");
			String POD_Input = data.get("POD_Input");
			String Voyage_Input = data.get("Voyage_Input");
			String lessee1_Input = data.get("lessee1_Input");
			String O_W1_Input = data.get("O_W1_Input");
			String Remarks2_Input = data.get("Remarks2_Input");
			String Bound1_input = data.get("Bound1_input");
			String dest1_Input = data.get("dest1_Input");

			String IMO1_Input = data.get("IMO1_Input");
			String temp_Input = data.get("temp_Input");
			String BL_no_Input = data.get("BL_no_Input");
			String O_H_Input = data.get("O_H_Input");
			String Delivery_Input = data.get("Delivery_Input");
			String service_Input = data.get("service_Input");
			String Lessor1_Input = data.get("Lessor1_Input");
			String Carrier_Seal_Input = data.get("Carrier_Seal_Input");
			String Release_Ref_no1_Input = data.get("Release_Ref_no1_Input");
			String Ref_Number1_Input = data.get("Ref_Number1_Input");
			String O_L2_Input = data.get("O_L2_Input");
			String activityTime_Input1 = data.get("ActivityTime");
			String condition = data.get("Condition");
			String bookingSearch_Filter=data.get("BookingSearch_Filter");

			Extent_Start(testcase_Name, test, test1);
			
			//// To validate if user given incorrect terminal for DCHF

					//Module Search
					moduleNavigate(driver, moduleName);

			Step_Start(1,
					" try save DCHF move with all valid details & given incorrect terminal which is not matched in booking terminal ",
					test, test1);
			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, Activity_Move_Txt5);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				if (!activityDate.equals("")) {
					waitForElement(driver, activeDateField_L);
					click(driver, activeDateField_L);

					if (DatePicker.equalsIgnoreCase("Yes")) {
						selectDatePicker(driver, activeDateField_L, activityDate);

					} else {
						if (DatePicker.contains("-")) {
							String activityDate_1 = activityDate.replace("-", "/");
							clearAndType(driver, activeDateField_L, activityDate_1);

						} else {
							clearAndType(driver, activeDateField_L, activityDate);

						}
					}
				}

				if (!activityTime_Input1.equals("")) {
					click(driver, activityTimeMultiple);

					waitForElement(driver, Calender);
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);

						clearAndType(driver, activityTime_Input, activityTime_Input1);
						System.out.println("activity_Time" + activityTime_Input1);

					}
					click(driver, activityTime_Close);
				}

				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					System.out.println("Show input field frame is displayed");
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
					
				}

				waitForElement(driver, P_Location_Txt_Field);
				click(driver, P_Location_Txt_Field);
				waitForElement(driver, P_Location_Txt_Field);
				sendKeys(driver, P_Location_Txt_Field, Location_Input_Txt5);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, P_Terminal_Txt_Field);
				click(driver, P_Terminal_Txt_Field);
				waitForElement(driver, P_Terminal_Txt_Field);
				sendKeys(driver, P_Terminal_Txt_Field, Terminal_Input_Txt5);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, bookingSearch_Button);
				click(driver, bookingSearch_Button);
				twoColumnSearchWindow(driver, bookingSearch_Filter, condition, BookinNo_Input_Txt5);


				if (!vessel.equals("")) {
					waitForElement(driver, P_Vessel_Txt_Field);
					clear(driver, P_Vessel_Txt_Field);
					waitForElement(driver, P_Vessel_Txt_Field);
					sendKeys(driver, P_Vessel_Txt_Field, vessel);
					enter(driver);
				}
				if (!POL_input_Txt5.equals("")) {
					waitForElement(driver, P_POL_Txt_Field);
					clear(driver, P_POL_Txt_Field);
					waitForElement(driver, P_POL_Txt_Field);
					sendKeys(driver, P_POL_Txt_Field, POL_input_Txt5);
					enter(driver);
				}

				if (!OW_amount_Input.equals("")) {
					waitForElement(driver, OW_amount);
					clearAndType(driver, OW_amount, OW_amount_Input);
					enter(driver);
				}

				if (!Voyage_Input.equals("")) {
					waitForElement(driver, Voyage);
					clearAndType(driver, Voyage, Voyage_Input);
					enter(driver);
				}

				if (!POD_Input.equals("")) {
					waitForElement(driver, pod_Searchfield);
					clearAndType(driver, pod_Searchfield, POD_Input);
					enter(driver);
				}

				if (!condition_Input.equals("")) {
					waitForElement(driver, condition_Dropdown);
					click(driver, condition_Dropdown);
					String condition_click = String.format(reference_type, condition_Input);
					click(driver, condition_click);
				}

				if (!Gross_Weight1_Input.equals("")) {
					waitForElement(driver, grossWeight_Textfield);
					clearAndType(driver, grossWeight_Textfield, Gross_Weight1_Input);
				}
				if (!O_W1_Input.equals("")) {
					waitForElement(driver, O_W);
					clearAndType(driver, O_W, O_W1_Input);
				}

				if (!Remarks2_Input.equals("")) {
					waitForElement(driver, remarks_Textfield);
					clearAndType(driver, remarks_Textfield, Remarks2_Input);
				}
				if (!Bound1_input.equals("")) {
					waitForElement(driver, Bound);
					clearAndType(driver, Bound, Bound1_input);
				}

				if (!dest1_Input.equals("")) {
					waitForElement(driver, destSearchfield);
					clearAndType(driver, destSearchfield, dest1_Input);
					enter(driver);

				}
				if (!lessee1_Input.equals("")) {
					waitForElement(driver, lessee_Searchfield);
					clearAndType(driver, lessee_Searchfield, lessee1_Input);
					enter(driver);
				}

				if (!IMO1_Input.equals("")) {
					waitForElement(driver, imo_Textfield);
					clearAndType(driver, imo_Textfield, IMO1_Input);
				}

				if (!temp_Input.equals("")) {
					waitForElement(driver, temp_textfield);
					clearAndType(driver, temp_textfield, temp_Input);
				}

				if (!lessee1_Input.equals("")) {
					waitForElement(driver, lessee_Searchfield);
					clearAndType(driver, lessee_Searchfield, lessee1_Input);
					enter(driver);
				}

				if (!BL_no_Input.equals("")) {
					waitForElement(driver, blno);
					clearAndType(driver, blno, BL_no_Input);
					enter(driver);
				}

				if (!O_H_Input.equals("")) {
					waitForElement(driver, oh_Textfield);
					clearAndType(driver, oh_Textfield, O_H_Input);
					enter(driver);

				}

				if (!Delivery_Input.equals("")) {
					waitForElement(driver, Delivery_Searchfield);
					clearAndType(driver, Delivery_Searchfield, Delivery_Input);
					enter(driver);
				}

				if (!service_Input.equals("")) {
					waitForElement(driver, service);
					clearAndType(driver, service, service_Input);
					enter(driver);
				}

				if (!Lessor1_Input.equals("")) {
					waitForElement(driver, Lessor1);
					clearAndType(driver, Lessor1, Lessor1_Input);
				}

				if (!Carrier_Seal_Input.equals("")) {
					waitForElement(driver, Carrier_Seal);
					clearAndType(driver, Carrier_Seal, Carrier_Seal_Input);
				}
				if (!Release_Ref_no1_Input.equals("")) {
					waitForElement(driver, relRefNoTextField_L);
					clearAndType(driver, relRefNoTextField_L, Release_Ref_no1_Input);
				}
				if (!Ref_Number1_Input.equals("")) {
					waitForElement(driver, refNumber_Textfield);
					clearAndType(driver, refNumber_Textfield, Ref_Number1_Input);
				}

				if (!O_L2_Input.equals("")) {
					waitForElement(driver, O_L);
					clearAndType(driver, O_L, O_L2_Input);

				}

				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);
			
				waitForElement(driver, selectGridCell_1_L);
				click(driver, selectGridCell_1_L);
				waitForElement(driver, eqpNum_Inputfield);
				sendKeys(driver, eqpNum_Inputfield, Equip_Number_Txt5);

				waitForElement(driver, eqpNum_Inputfield);
				scrollTop(driver);
				waitForElement(driver, saveButtonMoveEnt_L);
				click(driver, saveButtonMoveEnt_L);
				Step_End(1,
						"Try save DCHF move with all valid details & given incorrect location and terminal which is not matched in booking  ",
						test, test1);
				Step_Start(2, "Ensure that system should validate as 'Activity place and POD are mismatched'.", test,
						test1);
				waitForElement(driver, P_Invalid_POD_Popup);
				String POD_Popup = getText(driver, P_Invalid_POD_Popup);
				if (POD_Popup.equals(Invalid_POD_Exp)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Invalid_POD_Exp
							+ " || Actual Report Activity is : " + POD_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Invalid_POD_Exp
							+ " || Actual Report Activity is : " + POD_Popup, test, test1);
					click(driver, P_Ok_Btn);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Invalid_POD_Exp
							+ " || Actual Report Activity is : " + POD_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Invalid_POD_Exp
							+ " || Actual Report Activity is : " + POD_Popup, test, test1);
			
				}
				Step_End(2, "Ensure that system should validate as 'Activity place and POD are mismatched'.", test, test1);
				Extent_completed(testcase_Name, test, test1);
			}
			waitForElement(driver, close_tab);
			click(driver, close_tab);
			
		}
		if(i==1) {
			


			String testcase_Name = "TC_Movement_Entry_Integration_TS055";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String lodfActivity55 = data.get("LodfActivity");
			String location55 = data.get("Location");
			String terminal55 = data.get("Terminal");
			String bookingNumForLodf = data.get("BookingNumForLodf");
			String service_Popup_Txt = data.get("service_Popup_Txt");
			String activityDateSingle55 = data.get("activityDateSingle55");
			String activityTime_Input1 = data.get("activityTime_Input1");
			String datePicker = data.get("datePicker");
			
			//NM
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
			String POL_data = data.get("POL_data");
			String OW_amt_data = data.get("OW_amt_data");
			String gross_wt_data = data.get("gross_wt_data");
			String OL_data = data.get("OL_data");
			String cargo_wt_data = data.get("cargo_wt_data");
			String sup_contract_data = data.get("sup_contract_data");
			String ref_num_data = data.get("ref_num_data");
			String POD_data = data.get("POD_data");
			String OW_ind_data = data.get("OW_ind_data");
			String IMO_data = data.get("IMO_data");
			String OW_data = data.get("OW_data");
			String temp_data = data.get("temp_data");
			String POR_data = data.get("POR_data");
			String Ship_seal_data = data.get("Ship_seal_data");
			String delivery_data = data.get("delivery_data");
			
			Extent_Start(testcase_Name, test, test1);

			// To validate if user given blank service for LODF or DCHF
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

					//Module Search
					moduleNavigate(driver, moduleName);
					
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, lodfActivity55);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				if (!activityDateSingle55.equals("")) {
					waitForElement(driver, MultiActivity_Date);
					
					
					if(datePicker.equalsIgnoreCase("Yes")) {
						Extent_call(test, test1, "Entering the date,month & year");
						selectDatePicker(driver, MultiActivity_Date, activityDateSingle55);
							
					}else {
						click(driver, MultiActivity_Date);

						if(activityDateSingle55.contains("-")) {
							String activityDateSingle50_1=activityDateSingle55.replace("-", "/");
							clear(driver,MultiActivity_Date);
						
							sendKeys(driver, MultiActivity_Date, activityDateSingle50_1);
							
						}else {
						clearAndType(driver, MultiActivity_Date, activityDateSingle55);
						
						}		
					}
				}
				
				if (!activityTime_Input1.equals("")) {
					
					click(driver, activityTimeMultiple);

					
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						
						Extent_call(test, test1, "Entering the time");
							clearAndType(driver, activityTime_Input, activityTime_Input1);
							System.out.println("activity_Time" + activityTime_Input1);
						
					}
					
					click(driver, activityTime_Close);
				} 
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println( "Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
					
				}
	Step_Start(2, "Ensure that system should validate if user try save LODF or DCHF move with all valid details & given blank for service field since it is mandatory field", test, test1);
				waitForElement(driver, locationSaerchField_L);
				sendKeys(driver, locationSaerchField_L, location55);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, termDepotSearchField_L);
				click(driver, termDepotSearchField_L);
				sendKeys(driver, termDepotSearchField_L, terminal55);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, bookingNo_Searchfield);
				click(driver, bookingNo_Searchfield);
				
				waitForElement(driver, bookingNo_Searchfield);
				sendKeys(driver, bookingNo_Searchfield, bookingNumForLodf);

				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);
				clear(driver, P_Service_Txt_Field);

				waitForElement(driver, P_Vessel_Txt_Field);
				click(driver, P_Vessel_Txt_Field);
				
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
				
				if(!POL_data.equals("")) {
					waitForElement(driver, P_POL_Txt_Field);
					clearAndType(driver, P_POL_Txt_Field,POL_data);
				}
				
				if(!POD_data.equals("")) {
					waitForElement(driver, P_POD_Txt_Field);
					clearAndType(driver, P_POD_Txt_Field,POD_data);
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
					clearAndType(driver, O_H,OH_data);
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
				


				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);
				
				Step_End(2, "Ensure that system should validate if user try save LODF or DCHF move with all valid details & given blank for service field since it is mandatory field", test, test1);
			Step_Start(3, "Ensure that system should validate as 'Service must be entered'.", test, test1);
				
			waitForElement(driver, P_Service_Must_Enter_Popup);
				String service_Popup = getText(driver, P_Service_Must_Enter_Popup);
				if (service_Popup_Txt.equals(service_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + service_Popup_Txt
							+ " || Actual Report Activity is : " + service_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + service_Popup_Txt
							+ " || Actual Report Activity is : " + service_Popup, test, test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + service_Popup_Txt
							+ " || Actual Report Activity is : " + service_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + service_Popup_Txt
							+ " || Actual Report Activity is : " + service_Popup, test, test1);
					
				}
				Step_End(3, "Ensure that system should validate as 'Service must be entered'.", test, test1);
			}
			Extent_completed(testcase_Name, test, test1);
			waitForElement(driver, close_tab);
			click(driver, close_tab);
		
		}
		if(i==1) {

			String testcase_Name = "TC_Movement_Entry_Integration_TS056";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			
			String moduleName = data.get("ModuleMovementEntry");
			String lodfActivity56 = data.get("LodfActivity");
			String location56 = data.get("Location");
			String terminal56 = data.get("Terminal");
			String bookingNumForLodf56 = data.get("BookingNumForLodf");
			String Vessel_Popup_Txt = data.get("Vessel_Popup_Txt");
			String activityDateSingle56 = data.get("activityDateSingle56");
			String activityTime_Input1 = data.get("activityTime_Input1");
			String datePicker = data.get("datePicker");
			
			//NM
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
			String POL_data = data.get("POL_data");
			String OW_amt_data = data.get("OW_amt_data");
			String gross_wt_data = data.get("gross_wt_data");
			String OL_data = data.get("OL_data");
			String cargo_wt_data = data.get("cargo_wt_data");
			String sup_contract_data = data.get("sup_contract_data");
			String ref_num_data = data.get("ref_num_data");
			String POD_data = data.get("POD_data");
			String OW_ind_data = data.get("OW_ind_data");
			String IMO_data = data.get("IMO_data");
			String OW_data = data.get("OW_data");
			String temp_data = data.get("temp_data");
			String POR_data = data.get("POR_data");
			String Ship_seal_data = data.get("Ship_seal_data");
			String delivery_data = data.get("delivery_data");

			String Service_Number56 = data.get("service_data");
					
					Extent_Start(testcase_Name, test, test1);

			// To validate if user given blank vessel for LODF or DCHF
			
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

					//Module Search
					moduleNavigate(driver, moduleName);
					
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, lodfActivity56);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				if (!activityDateSingle56.equals("")) {
					waitForElement(driver, MultiActivity_Date);
					
					
					if(datePicker.equalsIgnoreCase("Yes")) {
						Extent_call(test, test1, "Entering the date,month & year");
						selectDatePicker(driver, MultiActivity_Date, activityDateSingle56);
							
					}else {
						click(driver, MultiActivity_Date);

						if(activityDateSingle56.contains("-")) {
							String activityDateSingle50_1=activityDateSingle56.replace("-", "/");
							clear(driver,MultiActivity_Date);
						
							sendKeys(driver, MultiActivity_Date, activityDateSingle50_1);
							
						}else {
						clearAndType(driver, MultiActivity_Date, activityDateSingle56);
						
						}		
					}
				}
				
				if (!activityTime_Input1.equals("")) {
					
					click(driver, activityTimeMultiple);

					
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						
						Extent_call(test, test1, "Entering the time");
							clearAndType(driver, activityTime_Input, activityTime_Input1);
							System.out.println("activity_Time" + activityTime_Input1);
						
					}
					
					click(driver, activityTime_Close);
				} else {
					System.out.println("activityTime " + "Input Not Available in : " + File_Path);
				}
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
					
				}
	Step_Start(2, " Ensure that system should validate if user try save LODF or DCHF move with all valid details & given blank for vessel field since it is mandatory field", test, test1);
				waitForElement(driver, locationSaerchField_L);
				sendKeys(driver, locationSaerchField_L, location56);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				waitForElement(driver, termDepotSearchField_L);
				click(driver, termDepotSearchField_L);
				sendKeys(driver, termDepotSearchField_L, terminal56);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				waitForElement(driver, bookingNo_Searchfield);
				click(driver, bookingNo_Searchfield);
				sendKeys(driver, bookingNo_Searchfield, bookingNumForLodf56);
				enter(driver);
	Extent_call(test, test1, "******NO DATA GIVEN IN THE VESSEL TEXT FIELD*******");
				waitForElement(driver, P_Vessel_Txt_Field);
				click(driver, P_Vessel_Txt_Field);
				clear(driver, P_Vessel_Txt_Field);

				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);
				sendKeys(driver, P_Service_Txt_Field, Service_Number56);
				enter(driver);
	Step_End(2, " Ensure that system should validate if user try save LODF or DCHF move with all valid details & given blank for vessel field since it is mandatory field", test, test1);

	if(!voyage_data.equals("")) {
		waitForElement(driver, P_Voyage_Txt_Field);
		clearAndType(driver, P_Voyage_Txt_Field,voyage_data);
	}

	if(!Bound_data.equals("")) {
		waitForElement(driver, P_Bound_Txt_Field);
		clearAndType(driver, P_Bound_Txt_Field,Bound_data);
	}

	if(!POL_data.equals("")) {
		waitForElement(driver, P_POL_Txt_Field);
		clearAndType(driver, P_POL_Txt_Field,POL_data);
	}

	if(!POD_data.equals("")) {
		waitForElement(driver, P_POD_Txt_Field);
		clearAndType(driver, P_POD_Txt_Field,POD_data);
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
		clearAndType(driver, O_H,OH_data);
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


				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);
			Step_Start(3, " Ensure that system should validate as 'Vessel must be entered'.", test, test1);
				waitForElement(driver, P_Vessel_Must_Enter_Popup);
				String vessel_Popup = getText(driver, P_Vessel_Must_Enter_Popup);
				if (Vessel_Popup_Txt.equals(vessel_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Vessel_Popup_Txt
							+ " || Actual Report Activity is : " + vessel_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Vessel_Popup_Txt
							+ " || Actual Report Activity is : " + vessel_Popup, test, test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Vessel_Popup_Txt
							+ " || Actual Report Activity is : " + vessel_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Vessel_Popup_Txt
							+ " || Actual Report Activity is : " + vessel_Popup, test, test1);
								}
				Step_End(3, " Ensure that system should validate as 'Vessel must be entered'.", test, test1);
			}
			Extent_completed(testcase_Name, test, test1);
		
		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		if(i==1) {
			

			String testcase_Name = "TC_Movement_Entry_Integration_TS057";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String lodfActivity57 = data.get("LodfActivity");
			String location57 = data.get("Location");
			String terminal57 = data.get("Terminal");
			String bookingNumForLodf57 = data.get("BookingNumForLodf");
			String Voyage_Popup_Txt = data.get("Voyage_Popup_Txt");
			String datePicker = data.get("datePicker");
			String activityDateSingle57 = data.get("activityDateSingle57");
			String activityTime_Input1 = data.get("activityTime_Input1");
			String Service_Number57 = data.get("Service_Number");
			String vessel = data.get("Vessel");
			//NM
			String vessel_data = data.get("vessel_data");
			String Bound_data = data.get("Bound_data");
			String dest_data = data.get("dest_data");
			String lessor_data = data.get("lessor_data");
			String OH_data = data.get("OH_data");
			String carrier_seal_data = data.get("carrier_seal_data");
			String stowage_data = data.get("stowage_data");
			String rel_ref_num_data = data.get("rel_ref_num_data");
			String consignee_data = data.get("consignee_data");
			String remark_data = data.get("remark_data");
			String POL_data = data.get("POL_data");
			String OW_amt_data = data.get("OW_amt_data");
			String gross_wt_data = data.get("gross_wt_data");
			String OL_data = data.get("OL_data");
			String cargo_wt_data = data.get("cargo_wt_data");
			String sup_contract_data = data.get("sup_contract_data");
			String ref_num_data = data.get("ref_num_data");
			String POD_data = data.get("POD_data");
			String OW_ind_data = data.get("OW_ind_data");
			String IMO_data = data.get("IMO_data");
			String OW_data = data.get("OW_data");
			String temp_data = data.get("temp_data");
			String POR_data = data.get("POR_data");
			String Ship_seal_data = data.get("Ship_seal_data");
			String delivery_data = data.get("delivery_data");
			
			Extent_Start(testcase_Name, test, test1);
			// To validate if user given blank voyage for LODF or DCHF
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

			//Module Search
			moduleNavigate(driver, moduleName);

			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, lodfActivity57);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);
				
				if (!activityDateSingle57.equals("")) {
					waitForElement(driver, MultiActivity_Date);
					
					
					if(datePicker.equalsIgnoreCase("Yes")) {
						Extent_call(test, test1, "Entering the date,month & year");
						selectDatePicker(driver, MultiActivity_Date, activityDateSingle57);
							
					}else {
						click(driver, MultiActivity_Date);

						if(activityDateSingle57.contains("-")) {
							String activityDateSingle50_1=activityDateSingle57.replace("-", "/");
							clear(driver,MultiActivity_Date);
						
							sendKeys(driver, MultiActivity_Date, activityDateSingle50_1);
							
						}else {
						clearAndType(driver, MultiActivity_Date, activityDateSingle57);
						
						}		
					}
				}
				
				if (!activityTime_Input1.equals("")) {
					
					click(driver, activityTimeMultiple);

					
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						
						Extent_call(test, test1, "Entering the time");
							clearAndType(driver, activityTime_Input, activityTime_Input1);
							System.out.println("activity_Time" + activityTime_Input1);
						
					}
					
					click(driver, activityTime_Close);
				} else {
					System.out.println("activityTime " + "Input Not Available in : " + File_Path);
				}
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println( "Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
					
				}
	Step_Start(2, "Ensure that system should validate if user try save LODF or DCHF move with all valid details & given blank for voyage field since it is mandatory field", test, test1);
				waitForElement(driver, locationSaerchField_L);
				sendKeys(driver, locationSaerchField_L, location57);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, termDepotSearchField_L);
				click(driver, termDepotSearchField_L);
				sendKeys(driver, termDepotSearchField_L, terminal57);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, bookingNo_Searchfield);
				click(driver, bookingNo_Searchfield);
				sendKeys(driver, bookingNo_Searchfield, bookingNumForLodf57);
				enter(driver);
				
				waitForElement(driver, P_Vessel_Txt_Field);
				click(driver, P_Vessel_Txt_Field);
				sendKeys(driver, P_Vessel_Txt_Field, vessel);
				enter(driver);
	Extent_call(test, test1, "**************LEAVING THE VOYAGE FIELD BLANK****************");
				waitForElement(driver, P_Voyage_Txt_Field);
				click(driver, P_Voyage_Txt_Field);
				clear(driver, P_Voyage_Txt_Field);

				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);
				sendKeys(driver, P_Service_Txt_Field, Service_Number57);
				enter(driver);
	Step_End(2, "Ensure that system should validate if user try save LODF or DCHF move with all valid details & given blank for voyage field since it is mandatory field", test, test1);

	if(!vessel_data.equals("")) {
		waitForElement(driver, P_Vessel_Txt_Field);
		clearAndType(driver, P_Vessel_Txt_Field ,vessel_data);
	}

	if(!Bound_data.equals("")) {
		waitForElement(driver, P_Bound_Txt_Field);
		clearAndType(driver, P_Bound_Txt_Field,Bound_data);
	}

	if(!POL_data.equals("")) {
		waitForElement(driver, P_POL_Txt_Field);
		clearAndType(driver, P_POL_Txt_Field,POL_data);
	}

	if(!POD_data.equals("")) {
		waitForElement(driver, P_POD_Txt_Field);
		clearAndType(driver, P_POD_Txt_Field,POD_data);
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
		clearAndType(driver, O_H,OH_data);
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


				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);
				Step_Start(3, "Ensure that system should validate as 'Voyage must be entered'.", test, test1);
				waitForElement(driver, P_Voyage_Must_Enter_Popup);
				String voyage_Popup = getText(driver, P_Voyage_Must_Enter_Popup);
				if (Voyage_Popup_Txt.equals(voyage_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Voyage_Popup_Txt
							+ " || Actual Report Activity is : " + voyage_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Voyage_Popup_Txt
							+ " || Actual Report Activity is : " + voyage_Popup, test, test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Voyage_Popup_Txt
							+ " || Actual Report Activity is : " + voyage_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Voyage_Popup_Txt
							+ " || Actual Report Activity is : " + voyage_Popup, test, test1);
				
				}
				
				Step_End(3, "Ensure that system should validate as 'Voyage must be entered'.", test, test1);
			}
			Extent_completed(testcase_Name, test, test1);
		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		if(i==1) {
			

			String testcase_Name = "TC_Movement_Entry_Integration_TS058";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);

			String moduleName = data.get("ModuleMovementEntry");
			String lodfActivity58 = data.get("LodfActivity");
			String location58 = data.get("Location");
			String terminal58 = data.get("Terminal");
			String bookingNumForLodf58 = data.get("BookingNumForLodf");
			String Bound_Popup_Txt = data.get("Bound_Popup_Txt");
			String activityDateSingle58 = data.get("activityDateSingle58");
			String activityTime_Input1 = data.get("activityTime_Input1");
			String datePicker = data.get("datePicker");
			String condition = data.get("Condition");
			String Search_BookNo_Column_Header = data.get("Search_BookNo_Column_Header");

			//NM

			String vessel_data = data.get("vessel_data");
			String voyage_data = data.get("voyage_data");
			String dest_data = data.get("dest_data");
			String lessor_data = data.get("lessor_data");
			String OH_data = data.get("OH_data");
			String carrier_seal_data = data.get("carrier_seal_data");
			String stowage_data = data.get("stowage_data");
			String rel_ref_num_data = data.get("rel_ref_num_data");
			String consignee_data = data.get("consignee_data");
			String remark_data = data.get("remark_data");
			String POL_data = data.get("POL_data");
			String OW_amt_data = data.get("OW_amt_data");
			String gross_wt_data = data.get("gross_wt_data");
			String OL_data = data.get("OL_data");
			String cargo_wt_data = data.get("cargo_wt_data");
			String sup_contract_data = data.get("sup_contract_data");
			String ref_num_data = data.get("ref_num_data");
			String POD_data = data.get("POD_data");
			String OW_ind_data = data.get("OW_ind_data");
			String IMO_data = data.get("IMO_data");
			String OW_data = data.get("OW_data");
			String temp_data = data.get("temp_data");
			String POR_data = data.get("POR_data");
			String Ship_seal_data = data.get("Ship_seal_data");
			String delivery_data = data.get("delivery_data");

			Extent_Start(testcase_Name, test, test1);
			// To validate if user given blank bound for LODF or DCHF
			//Module Search
			moduleNavigate(driver, moduleName);

			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, lodfActivity58);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);

				if (!activityDateSingle58.equals("")) {
					waitForElement(driver, MultiActivity_Date);
					if(datePicker.equalsIgnoreCase("Yes")) {
						Extent_call(test, test1, "Entering the date,month & year");
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, MultiActivity_Date, activityDateSingle58);

						}
						}else {
							if(activityDateSingle58.contains("-")) {
								String activityDateSingle50_1=activityDateSingle58.replace("-", "/");
								clear(driver,activeDateInSingle_L);
								sendKeys(driver, activeDateInSingle_L, activityDateSingle50_1);

							}else {
								clearAndType(driver, activeDateInSingle_L, activityDateSingle58);

							}		
						}
				}

				if (!activityTime_Input1.equals("")) {

					click(driver, activityTimeMultiple);


					if (isdisplayed(driver, Calender)) {
						click(driver, activityTime_Input);

						Extent_call(test, test1, "Entering the time");
						clearAndType(driver, activityTime_Input, activityTime_Input1);
						System.out.println("activity_Time" + activityTime_Input1);

					}

					click(driver, activityTime_Close);
				} 
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);

				}

				Step_Start(1, "Ensure that system should validate if user try save LODF or DCHF move with all valid details & given blank for bound field since it is mandatory field", test, test1);
				waitForElement(driver, locationSaerchField_L);
				sendKeys(driver, locationSaerchField_L, location58);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, termDepotSearchField_L);
				click(driver, termDepotSearchField_L);
				sendKeys(driver, termDepotSearchField_L, terminal58);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, bookingSearch_Button);
				click(driver, bookingSearch_Button);
				waitForElement(driver, booking_Searchfield);
				twoColumnSearchWindow(driver, Search_BookNo_Column_Header, condition, bookingNumForLodf58);

				waitForElement(driver, P_Bound_Txt_Field);
				click(driver, P_Bound_Txt_Field);
				clear(driver, P_Bound_Txt_Field);

				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);

				Step_End(1, "Ensure that system should validate if user try save LODF or DCHF move with all valid details & given blank for bound field since it is mandatory field", test, test1);

				if(!vessel_data.equals("")) {
					waitForElement(driver, P_Vessel_Txt_Field);
					clearAndType(driver, P_Vessel_Txt_Field ,vessel_data);
				}

				if(!voyage_data.equals("")) {
					waitForElement(driver, P_Voyage_Txt_Field);
					clearAndType(driver, P_Voyage_Txt_Field,voyage_data);
				}

				if(!POL_data.equals("")) {
					waitForElement(driver, P_POL_Txt_Field);
					clearAndType(driver, P_POL_Txt_Field,POL_data);
				}

				if(!POD_data.equals("")) {
					waitForElement(driver, P_POD_Txt_Field);
					clearAndType(driver, P_POD_Txt_Field,POD_data);
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
					clearAndType(driver, O_H,OH_data);
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


				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);

				Step_Start(2, "Ensure that system should validate as 'Bound must be entered'.", test, test1);

				waitForElement(driver, P_Bound_Must_Select_Popup);
				String bound_Popup = getText(driver, P_Bound_Must_Select_Popup);
				if (Bound_Popup_Txt.equals(bound_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Bound_Popup_Txt
							+ " || Actual Report Activity is : " + bound_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Bound_Popup_Txt
							+ " || Actual Report Activity is : " + bound_Popup, test, test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Bound_Popup_Txt
							+ " || Actual Report Activity is : " + bound_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Bound_Popup_Txt
							+ " || Actual Report Activity is : " + bound_Popup, test, test1);

				}
				Step_Start(2, "Ensure that system should validate as 'Bound must be entered'.", test, test1);
				Extent_completed(testcase_Name, test, test1);
			
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
			}
		}
		if(i==1) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS059";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String lodfActivity59 = data.get("LodfActivity");
			String location59 = data.get("Location");
			String terminal59 = data.get("Terminal");
			String bookingNumForLodf59 = data.get("BookingNumForLodf");
			String POL_Popup_Txt = data.get("POL_Popup_Txt");
			String activityDateSingle59 = data.get("activityDateSingle59");
			String activityTime_Input1 = data.get("activityTime_Input1");
			String datePicker = data.get("datePicker");
			String condition = data.get("Condition");
			String Search_BookNo_Column_Header = data.get("Search_BookNo_Column_Header");

			//NM
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
					String POD_data = data.get("POD_data");
					String OW_ind_data = data.get("OW_ind_data");
					String IMO_data = data.get("IMO_data");
					String OW_data = data.get("OW_data");
					String temp_data = data.get("temp_data");
					String POR_data = data.get("POR_data");
					String Ship_seal_data = data.get("Ship_seal_data");
					String delivery_data = data.get("delivery_data");
					
					Extent_Start(testcase_Name, test, test1);

			// To validate if user given blank POL for LODF or DCHF
					
					//Module Search
					moduleNavigate(driver, moduleName);

			// Multiple Equipment Entry
			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, lodfActivity59);
				
				enter(driver);
				if (!activityDateSingle59.equals("")) {
					waitForElement(driver, MultiActivity_Date);
					if(datePicker.equalsIgnoreCase("Yes")) {
						Extent_call(test, test1, "Entering the date,month & year");
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, MultiActivity_Date, activityDateSingle59);

							
					}
						}else {
						if(activityDateSingle59.contains("-")) {
							String activityDateSingle50_1=activityDateSingle59.replace("-", "/");
							clear(driver,activeDateInSingle_L);
							sendKeys(driver, activeDateInSingle_L, activityDateSingle50_1);
							
						}else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle59);
						
						}		
					}
				}
				
				if (!activityTime_Input1.equals("")) {
					
					click(driver, activityTimeMultiple);

					
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						
						Extent_call(test, test1, "Entering the time");
							clearAndType(driver, activityTime_Input, activityTime_Input1);
							System.out.println("activity_Time" + activityTime_Input1);
						
					}
					
					click(driver, activityTime_Close);
				} 
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println( "Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
					
				}

				waitForElement(driver, locationSaerchField_L);
				sendKeys(driver, locationSaerchField_L, location59);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, termDepotSearchField_L);
				click(driver, termDepotSearchField_L);
				sendKeys(driver, termDepotSearchField_L, terminal59);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, bookingSearch_Button);
				click(driver, bookingSearch_Button);
				
				twoColumnSearchWindow(driver, Search_BookNo_Column_Header, condition, bookingNumForLodf59);

				waitForElement(driver, P_POL_Txt_Field);
				click(driver, P_POL_Txt_Field);
				clear(driver, P_POL_Txt_Field);

				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);
				
				
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
				
				if(!POD_data.equals("")) {
					waitForElement(driver, P_POD_Txt_Field);
					clearAndType(driver, P_POD_Txt_Field,POD_data);
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
					clearAndType(driver, O_H,OH_data);
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
				

				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);
				
				waitForElement(driver, P_POL_Must_Select_Popup);
				String POL_Popup = getText(driver, P_POL_Must_Select_Popup);
				if (POL_Popup_Txt.equals(POL_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + POL_Popup_Txt
							+ " || Actual Report Activity is : " + POL_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + POL_Popup_Txt
							+ " || Actual Report Activity is : " + POL_Popup, test, test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + POL_Popup_Txt
							+ " || Actual Report Activity is : " + POL_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + POL_Popup_Txt
							+ " || Actual Report Activity is : " + POL_Popup, test, test1);
					
				}
			}
			Extent_completed(testcase_Name, test, test1);

			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		
		
		if(i==1) {
			
			

			String testcase_Name = "TC_Movement_Entry_Integration_TS060";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String invalidNextMoveEqpNum = data.get("InvalidNextMoveEqpNum");
			String activityOFHI = data.get("ActivityOFHI");
			String invalidNextMovePopup = data.get("InvalidNextMovePopup");
			String activityDateSingle60 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			String showAllMoves = data.get("ShowAllMoves");

			Extent_Start(testcase_Name, test, test1);

			//// To validate invalid move if user try to insert in between next move
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
				Step_Start(2,
						"Ensure that system should validate if user try to insert incorrect inbetween next move which is not mapped in sequence group",
						test, test1);
				waitForElement(driver, equipmentNoSearchField_L);
				sendKeys(driver, equipmentNoSearchField_L, invalidNextMoveEqpNum);
				Step_End(2,
						"Ensure that system should validate if user try to insert incorrect inbetween next move which is not mapped in sequence group",
						test, test1);
				waitForElement(driver, activitySearchFieldInSingle_L);
				sendKeys(driver, activitySearchFieldInSingle_L, activityOFHI);
				enter(driver);
				waitForElement(driver, activeDateInSingle_L);
				click(driver, activeDateInSingle_L);
				if (!activityDateSingle60.equals("")) {
					waitForElement(driver, activeDateInSingle_L);
					click(driver, activeDateInSingle_L);

					if (datePicker.equalsIgnoreCase("Yes")) {
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, activeDateInSingle_L, activityDateSingle60);
						}
					} else {
						if (activityDateSingle60.contains("-")) {
							String activityDateSingle60_1 = activityDateSingle60.replace("-", "/");
							clearAndType(driver, activeDateInSingle_L, activityDateSingle60_1);
						} else {
							clearAndType(driver, activeDateInSingle_L, activityDateSingle60);

						}
					}
				}
				Extent_call(test, test1, "Entering the time data");
				if (!activityTime_Input1.equals("")) {
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
			Step_Start(3, "Ensure that system should validate as ' Invalid Next Move'.", test, test1);
			waitForElement(driver, popup_Message);
			if (isDisplayed(driver, popup_Message)) {

				String actualInvalidNextMovePopup = getText(driver, popup_Message);

				if (actualInvalidNextMovePopup.equals(invalidNextMovePopup)) {
					System.out.println("Matched || " + " Expected Value is : " + invalidNextMovePopup
							+ " || Actual Value is : " + actualInvalidNextMovePopup);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + invalidNextMovePopup
							+ " || ActualValue is : " + actualInvalidNextMovePopup, test, test1);
					Extent_pass(driver, invalidNextMovePopup + " popup is displayed", test, test1);
					System.out.println(invalidNextMovePopup + " popup is displayed");
					click(driver, popup_Message_Ok_Button);
				} else {
					System.out.println("Not matched || " + " Expected Value is : " + invalidNextMovePopup
							+ " || Actual Value  is : " + actualInvalidNextMovePopup);
					Extent_fail(driver, "Not matched || " + " Expected Value is : " + invalidNextMovePopup
							+ " || Actual Value is : " + actualInvalidNextMovePopup, test, test1);
					
				}

			}
			
			waitForDisplay(driver, popup_Message);
			if(isdisplayed(driver, popup_Message)) {
				click(driver, popup_Message_Yes_Button);
			}
			
			waitForDisplay(driver, popup_Message);
			if(isdisplayed(driver, popup_Message)) {
				click(driver, popup_Message_No_Button);
			}
			waitForElement(driver, showAllMoves_CheckBox);
			checkBox(driver, showAllMoves_CheckBox, showAllMoves);

			Step_End(3, "Ensure that system should validate as ' Invalid Next Move'.", test, test1);

			Extent_completed(testcase_Name, test, test1);

		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		if(i==1) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS061";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String invalidPrevMoveEqpNum = data.get("InvalidPrevMoveEqpNum");
			String invalidPrevMovePopup = data.get("InvalidPrevMovePopup");
			String activitySALE = data.get("ActivitySALE");
			String activityDateSingle61 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			String showAllMoves = data.get("ShowAllMoves");

			Extent_Start(testcase_Name, test, test1);

			// To validate invalid move if user try to insert in between previous move
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

					//Module Search
					moduleNavigate(driver, moduleName);
					
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println( "Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
				
			}

			// Single Entry Equipment
			waitForElement(driver, singleEntryMovPage_L);
			if (isDisplayed(driver, singleEntryMovPage_L)) {
				Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
				Step_Start(2,
						"Ensure that system should validate if user try to insert incorrect inetween previous move which is not mapped in sequence group",
						test, test1);
				waitForElement(driver, equipmentNoSearchField_L);
				sendKeys(driver, equipmentNoSearchField_L, invalidPrevMoveEqpNum);
				Step_End(2,
						"Ensure that system should validate if user try to insert incorrect inetween previous move which is not mapped in sequence group",
						test, test1);
				waitForElement(driver, activitySearchFieldInSingle_L);
				click(driver, activitySearchFieldInSingle_L);
				waitForElement(driver, activitySearchFieldInSingle_L);
				sendKeys(driver, activitySearchFieldInSingle_L, activitySALE);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);
				
				waitForElement(driver, activeDateInSingle_L);
				click(driver, activeDateInSingle_L);
				if (!activityDateSingle61.equals("")) {
					waitForElement(driver, activeDateInSingle_L);
					if (datePicker.equalsIgnoreCase("Yes")) {
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, activeDateInSingle_L, activityDateSingle61);
						}
					} else {
						if (activityDateSingle61.contains("-")) {
							String activityDateSingle61_1 = activityDateSingle61.replace("-", "/");
							clearAndType(driver, activeDateInSingle_L, activityDateSingle61_1);

						} else {
							clearAndType(driver, activeDateInSingle_L, activityDateSingle61);

						}
					}
				}
				Extent_call(test, test1, "Entering the time data");
				if (!activityTime_Input1.equals("")) {
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
			Step_Start(3, "Ensure that system should validate as ' Invalid Previous Move'.", test, test1);
			waitForElement(driver, popup_Message);
			if (isDisplayed(driver, popup_Message)) {

				String actualInvalidPrevMovePopup = getText(driver, popup_Message);

				if (actualInvalidPrevMovePopup.equals(invalidPrevMovePopup)) {
					System.out.println("Matched || " + " Expected Value is : " + invalidPrevMovePopup
							+ " || Actual Value is : " + actualInvalidPrevMovePopup);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + invalidPrevMovePopup
							+ " || ActualValue is : " + actualInvalidPrevMovePopup, test, test1);
					Extent_pass(driver, invalidPrevMovePopup + " popup is displayed", test, test1);
					System.out.println(invalidPrevMovePopup + " popup is displayed");
					click(driver, popup_Message_Ok_Button);
				} else {
					System.out.println("Not matched || " + " Expected Value is : " + invalidPrevMovePopup
							+ " || Actual Value  is : " + actualInvalidPrevMovePopup);
					Extent_fail(driver, "Not matched || " + " Expected Value is : " + invalidPrevMovePopup
							+ " || Actual Value is : " + actualInvalidPrevMovePopup, test, test1);
					Extent_fail(driver, invalidPrevMovePopup + " popup is not displayed", test, test1);
				
					System.out.println(invalidPrevMovePopup + " popup is not displayed");
				}

			}

			waitForDisplay(driver, popup_Message);
			if(isdisplayed(driver, popup_Message)) {
			click(driver, popup_Message_No_Button);
			}
			
			waitForElement(driver, showAllMoves_CheckBox);
			checkBox(driver, showAllMoves_CheckBox, showAllMoves);
			
			Step_End(3, "Ensure that system should validate as ' Invalid Previous Move'.", test, test1);
			Extent_completed(testcase_Name, test, test1);
		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		if(i==1) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS062";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String activitySUBL = data.get("ActivitySUBL");
			String location62 = data.get("Location");
			String terminal62 = data.get("Terminal");
			String releaseReferenceEnteredPopup = data.get("ReleaseReferenceEnteredPopup");
			String activityDateSingle62 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			String leasekind = data.get("Leasekind");
			String lessee = data.get("Lessee");
			String lessor = data.get("Lessor");
			String subLeaseRefNo = data.get("SubLeaseRefNo");
			String supplierContract = data.get("SupplierContract");
			String relRefNo = data.get("ReleaseRefNo");
			String transportMode = data.get("TransportMode");
			String refNumber = data.get("RefNumber");

			String remarks_Input = data.get("Remarks_Input");

			Extent_Start(testcase_Name, test, test1);

			//// To validate if user try to save SUBL without ref no
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

			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, activitySUBL);
				enter(driver);
				waitForElement(driver, activeDateField_L);
				click(driver, activeDateField_L);
				if (!activityDateSingle62.equals("")) {
					waitForElement(driver, activeDateField_L);
					if (datePicker.equalsIgnoreCase("Yes")) {
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, activeDateField_L, activityDateSingle62);
						}
					} else {
						if (activityDateSingle62.contains("-")) {
							String activityDateSingle62_1 = activityDateSingle62.replace("-", "/");
							clearAndType(driver, activeDateField_L, activityDateSingle62_1);

						} else {
							clearAndType(driver, activeDateField_L, activityDateSingle62);

						}
					}
				}

				if (!activityTime_Input1.equals("")) {
					click(driver, activityTimeMultiple);

					waitForElement(driver, Calender);
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);

						clearAndType(driver, activityTime_Input, activityTime_Input1);
						System.out.println("activity_Time" + activityTime_Input1);

					}
					click(driver, activityTime_Close);
				} 
				
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);
			}

			waitForElement(driver, showInputFieldFrame_L);
			if (isDisplayed(driver, showInputFieldFrame_L)) {
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
			} else {
				System.out.println("Show input field frame is not displayed");
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				
			}
			Step_Start(2,
					"Ensure that system should validate if user try to save SUBL move by giving blank in release ref field",
					test, test1);
			waitForElement(driver, locationSaerchField_L);
			click(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			Actionsendkeys(driver, locationSaerchField_L, location62);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);
			
			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			Actionsendkeys(driver, termDepotSearchField_L, terminal62);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);

			Extent_call(test, test1, "Leaving release reference number text field empty");

			if (!relRefNo.equals("")) {
				waitForElement(driver, relRefNoTextField_L);
				click(driver, relRefNoTextField_L);
				waitForElement(driver, relRefNoTextField_L);
				clear(driver, relRefNoTextField_L);

				waitForElement(driver, relRefNoTextField_L);
				sendKeys(driver, relRefNoTextField_L, relRefNo);
				enter(driver);
			}

			if (!leasekind.equals("")) {
				waitForElement(driver, Lease_Kind_Dropdown);
				click(driver, Lease_Kind_Dropdown);
				String select_LeaseKind = String.format(lease_king, leasekind);
				
				waitForElement(driver, select_LeaseKind);
				click(driver, select_LeaseKind);
			}

			if (!lessee.equals("")) {
				waitForElement(driver, lessee_Searchfield);
				click(driver, lessee_Searchfield);
				waitForElement(driver, lessee_Searchfield);
				clear(driver, lessee_Searchfield);

				waitForElement(driver, lessee_Searchfield);
				sendKeys(driver, lessee_Searchfield, lessee);
				enter(driver);
			}
			if (!lessor.equals("")) {
				waitForElement(driver, Lessor1);
				click(driver, Lessor1);
				waitForElement(driver, Lessor1);
				clear(driver, Lessor1);
				waitForElement(driver, Lessor1);
				sendKeys(driver, Lessor1, lessor);
				enter(driver);
			}

			if (!subLeaseRefNo.equals("")) {
				waitForElement(driver, subLeaseRefNo_Textfield);
				click(driver, subLeaseRefNo_Textfield);
				waitForElement(driver, subLeaseRefNo_Textfield);
				clear(driver, subLeaseRefNo_Textfield);
				waitForElement(driver, subLeaseRefNo_Textfield);
				sendKeys(driver, subLeaseRefNo_Textfield, subLeaseRefNo);
				enter(driver);
			}

			if (!supplierContract.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				clear(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				sendKeys(driver, supplierContract_L, supplierContract);
				enter(driver);
			}

			if (!transportMode.equals("")) {
				waitForElement(driver, transportMode_Dropdown);
				click(driver, transportMode_Dropdown);
				String select_transportMode = String.format(select_trans, transportMode);
				waitForElement(driver, select_transportMode);
				click(driver, select_transportMode);

			}

			if (!refNumber.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				clear(driver, refNumber_Textfield);

				waitForElement(driver, refNumber_Textfield);
				sendKeys(driver, refNumber_Textfield, refNumber);
				enter(driver);
			}

			if (!remarks_Input.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				sendKeys(driver, remarks_Textfield, remarks_Input);

				enter(driver);
			}

			Step_End(2,
					"Ensure that system should validate if user try to save SUBL move by giving blank in release ref field",
					test, test1);
			waitForElement(driver, addButtonMulti_L);
			click(driver, addButtonMulti_L);
			Step_Start(3, " Ensure that system should validate as ' Release Reference must be entered'.", test, test1);
			waitForElement(driver, Popup_Message);
			if (isDisplayed(driver, Popup_Message)) {

				String actualReleaseRefPopup = getText(driver, Popup_Message);

				if (actualReleaseRefPopup.equals(releaseReferenceEnteredPopup)) {
					System.out.println("Matched || " + " Expected Value is : " + releaseReferenceEnteredPopup
							+ " || Actual Value is : " + actualReleaseRefPopup);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + releaseReferenceEnteredPopup
							+ " || ActualValue is : " + actualReleaseRefPopup, test, test1);
					Extent_pass(driver, releaseReferenceEnteredPopup + " popup is displayed", test, test1);
					System.out.println(releaseReferenceEnteredPopup + " popup is displayed");

				} else {
					System.out.println("Not matched || " + " Expected Value is : " + releaseReferenceEnteredPopup
							+ " || Actual Value  is : " + actualReleaseRefPopup);
					Extent_fail(driver, "Not matched || " + " Expected Value is : " + releaseReferenceEnteredPopup
							+ " || Actual Value is : " + actualReleaseRefPopup, test, test1);
					Extent_fail(driver, releaseReferenceEnteredPopup + " popup is not displayed", test, test1);
				
					System.out.println(releaseReferenceEnteredPopup + " popup is not displayed");
				}

			}
			Step_End(3, " Ensure that system should validate as ' Release Reference must be entered'.", test, test1);
			Extent_completed(testcase_Name, test, test1);
		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		if(i==1) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS063";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_063 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_063, testCaseName,
					"Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");

			String releaseRefSUBL = data.get("ReleaseRef");
			String terminalINNSA63 = data.get("TerminalINNSA");
			String containerNumTS63 = data.get("ContainerNumTS63");
			String movementNotAllowedError = data.get("MovementNotAllowedError");
			String locationINNSA63 = data.get("LocationINNSA");
			String activitySUBL63 = data.get("ActivitySUBL");
			String activityDateSingle63 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			String leasekind = data.get("Leasekind");
			String lessee = data.get("Lessee");
			String lessor = data.get("Lessor");
			String subLeaseRefNo = data.get("SubLeaseRefNo");
			String supplierContract = data.get("SupplierContract");
			String transportMode = data.get("TransportMode");
			String refNumber = data.get("RefNumber");

			String remarks_Input = data.get("Remarks_Input");
			
			Extent_Start(testCaseName, test, test1);

			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);
			
//			Module Search
			moduleNavigate(driver, moduleName);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, activitySUBL63);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);
				if (!activityDateSingle63.equals("")) {
					waitForElement(driver, activeDateField_L);
					if (datePicker.equalsIgnoreCase("Yes")) {
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, activeDateField_L, activityDateSingle63);
						}
					} else {
						if (activityDateSingle63.contains("-")) {
							String activityDateSingle63_1 = activityDateSingle63.replace("-", "/");
							clearAndType(driver, activeDateField_L, activityDateSingle63_1);

						} else {
							clearAndType(driver, activeDateField_L, activityDateSingle63);

						}
					}
				}

				if (!activityTime_Input1.equals("")) {
					click(driver, activityTimeMultiple);

					waitForElement(driver, Calender);
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);

						clearAndType(driver, activityTime_Input, activityTime_Input1);
						System.out.println("activity_Time" + activityTime_Input1);

					}
					click(driver, activityTime_Close);
				} else {
					System.out.println("activityTime " + "Input Not Available in : " + File_Path);
				}
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);
			}

			waitForElement(driver, showInputFieldFrame_L);
			if (isDisplayed(driver, showInputFieldFrame_L)) {
				System.out.println("Show input field frame is displayed");
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
			} else {
				System.out.println("Show input field frame is not displayed");
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);
			}
			Step_Start(2,
					"Ensure that system should validate if user try to save SUBL move by giving supplier ref in release ref field instead of sublease reference",
					test, test1);

			waitForElement(driver, locationSaerchField_L);
			click(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			Actionsendkeys(driver, locationSaerchField_L, locationINNSA63);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);
			
			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			Actionsendkeys(driver, termDepotSearchField_L, terminalINNSA63);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);

			Extent_call(test, test1,
					"try to save SUBL move by giving supplier ref in release ref field instead of sublease reference");
			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, releaseRefSUBL);

			if (!leasekind.equals("")) {
				waitForElement(driver, Lease_Kind_Dropdown);
				click(driver, Lease_Kind_Dropdown);
				String select_LeaseKind=String.format(lease_Kind, leasekind);

				waitForElement(driver, select_LeaseKind);
				click(driver, select_LeaseKind);
			}

			if (!lessee.equals("")) {
				waitForElement(driver, lessee_Searchfield);
				click(driver, lessee_Searchfield);
				waitForElement(driver, lessee_Searchfield);
				clear(driver, lessee_Searchfield);

				waitForElement(driver, lessee_Searchfield);
				sendKeys(driver, lessee_Searchfield, lessee);
				enter(driver);
			}
			if (!lessor.equals("")) {
				waitForElement(driver, Lessor1);
				click(driver, Lessor1);
				waitForElement(driver, Lessor1);
				clear(driver, Lessor1);
				waitForElement(driver, Lessor1);
				sendKeys(driver, Lessor1, lessor);
				enter(driver);
			}

			if (!subLeaseRefNo.equals("")) {
				waitForElement(driver, subLeaseRefNo_Textfield);
				click(driver, subLeaseRefNo_Textfield);
				waitForElement(driver, subLeaseRefNo_Textfield);
				clear(driver, subLeaseRefNo_Textfield);
				waitForElement(driver, subLeaseRefNo_Textfield);
				sendKeys(driver, subLeaseRefNo_Textfield, subLeaseRefNo);
				enter(driver);
			}

			if (!supplierContract.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				clear(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				sendKeys(driver, supplierContract_L, supplierContract);
				enter(driver);
			}

			if (!transportMode.equals("")) {
				waitForElement(driver, transportMode_Dropdown);
				click(driver, transportMode_Dropdown);

				String select_transportMode = String.format(transport_Mode, transportMode);
				waitForElement(driver, select_transportMode);
				click(driver, select_transportMode);

			}

			if (!refNumber.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				clear(driver, refNumber_Textfield);

				waitForElement(driver, refNumber_Textfield);
				sendKeys(driver, refNumber_Textfield, refNumber);
				enter(driver);
			}

			if (!remarks_Input.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				sendKeys(driver, remarks_Textfield, remarks_Input);

				enter(driver);
			}

			waitForElement(driver, addButtonMulti_L);
			click(driver, addButtonMulti_L);
			
			waitForElement(driver, selectGridCell_1_L);
			click(driver, selectGridCell_1_L);
			
			waitForElement(driver, eqpNum_Inputfield);
			sendKeys(driver, eqpNum_Inputfield, containerNumTS63);
			
			Step_End(2,
					"Ensure that system should validate if user try to save SUBL move by giving supplier ref in release ref field instead of sublease reference",
					test, test1);
			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);
			Step_Start(3, " Ensure that system should validate as ' This movement is not allowed for the Contract'.", test,
					test1);
			waitForElement(driver, errorRecordsFrame_L);
			if (isDisplayed(driver, errorRecordsFrame_L)) {

				String actualMoveNotAllowedError = getText(driver, movemet_Not_Allowed_Error);

				if (actualMoveNotAllowedError.equals(movementNotAllowedError)) {
					System.out.println("Matched || "+movementNotAllowedError + " Error is displayed ||" + " Expected Value is : " + movementNotAllowedError
							+ " || Actual Value is : " + actualMoveNotAllowedError);
					Extent_pass(driver, "Matched || "+movementNotAllowedError + " Error is displayed ||" + " Expected Value is : " + movementNotAllowedError
							+ " || ActualValue is : " + actualMoveNotAllowedError, test, test1);
					click(driver, okButtonErrorFrame_L);
				} else {
					System.out.println("Not matched || "+movementNotAllowedError + " Error is not displayed ||" + " Expected Value is : " + movementNotAllowedError
							+ " || Actual Value  is : " + actualMoveNotAllowedError);
					Extent_fail(driver, "Not matched || "+movementNotAllowedError + " Error is not displayed ||" + " Expected Value is : " + movementNotAllowedError
							+ " || Actual Value is : " + actualMoveNotAllowedError, test, test1);
				}

			}
			Step_End(3, " Ensure that system should validate as ' This movement is not allowed for the Contract'.", test,
					test1);
			Extent_completed(testCaseName, test, test1);
		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		if(i==1) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS064";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_064 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_064, testCaseName, "Dataset"+selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String activityRTNL = data.get("ActivityRTNL");
			String returnRefNumber = data.get("ReturnRefNumber");
			String eqpNumberRTNL = data.get("EqpNumberRTNL");
			String invalidScaleOutReferenceError = data.get("InvalidScaleOutReferenceError");
			String locationINNSA64 = data.get("LocationINNSA");
			String terminalINNSA64 = data.get("TerminalINNSA");
			String leasekind = data.get("Leasekind");
			String lessee = data.get("Lessee");
			String lessor = data.get("Lessor");
			String subLeaseRefNo = data.get("SubLeaseRefNo");
			String supplierContract = data.get("SupplierContract");
			String relRefNo = data.get("ReleaseRefNo");
			String transportMode = data.get("TransportMode");
			String refNumber = data.get("RefNumber");
			String tareWeight = data.get("TareWeight");
			String payLoad = data.get("PayLoad");
			String remarks_Input = data.get("Remarks_Input");
			String activityDateSingle64 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			
			Extent_Start(testCaseName, test, test1);

			// To validate Invalid Scale out reference in RTNL
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);
			
//			Module Search
			moduleNavigate(driver, moduleName);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, activityRTNL);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				if (!activityDateSingle64.equals("")) {
					waitForElement(driver, activeDateField_L);
					if(datePicker.equalsIgnoreCase("Yes")) {
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, activeDateField_L, activityDateSingle64);
							
					}}else {
						if(activityDateSingle64.contains("-")) {
							String activityDateSingle64_1=activityDateSingle64.replace("-", "/");
							clearAndType(driver, activeDateField_L, activityDateSingle64_1);
							
						}else {
						clearAndType(driver, activeDateField_L, activityDateSingle64);
						
						}		
					}
				}
				
				if (!activityTime_Input1.equals("")) {
					click(driver, activityTimeMultiple);

					waitForElement(driver, Calender);
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						
							clearAndType(driver, activityTime_Input, activityTime_Input1);
							System.out.println("activity_Time" + activityTime_Input1);
						
					}
					click(driver, activityTime_Close);
				} else {
					System.out.println("activityTime " + "Input Not Available in : " + File_Path);
				}
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					System.out.println("Show input field frame is displayed");
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				}

				waitForElement(driver, locationSaerchField_L);
				click(driver, locationSaerchField_L);
				waitForElement(driver, locationSaerchField_L);
				Actionsendkeys(driver, locationSaerchField_L, locationINNSA64);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);
				
				waitForElement(driver, termDepotSearchField_L);
				click(driver, termDepotSearchField_L);
				waitForElement(driver, termDepotSearchField_L);
				Actionsendkeys(driver, termDepotSearchField_L, terminalINNSA64);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);
				
				waitForElement(driver, returnRefNumber_Textfield);
				sendKeys(driver, returnRefNumber_Textfield, returnRefNumber);
			}

			if(!leasekind.equals("")) {
				waitForElement(driver, Lease_Kind_Dropdown);
				click(driver, Lease_Kind_Dropdown);
				String select_LeaseKind=String.format(lease_Kind, leasekind);

				waitForElement(driver, select_LeaseKind);
				click(driver, select_LeaseKind);
			}
			
			if(!lessee.equals("")) {
				waitForElement(driver, lessee_Searchfield);
				click(driver, lessee_Searchfield);
				waitForElement(driver, lessee_Searchfield);
				clear(driver, lessee_Searchfield);
				
				waitForElement(driver, lessee_Searchfield);
				sendKeys(driver, lessee_Searchfield, lessee);
				enter(driver);
			}
			if(!lessor.equals("")) {
				waitForElement(driver, Lessor1);
				click(driver, Lessor1);
				waitForElement(driver, Lessor1);
				clear(driver, Lessor1);
				waitForElement(driver, Lessor1);
				sendKeys(driver, Lessor1, lessor);
				enter(driver);
			}
			
			if(!subLeaseRefNo.equals("")) {
				waitForElement(driver, subLeaseRefNo_Textfield);
				click(driver, subLeaseRefNo_Textfield);
				waitForElement(driver, subLeaseRefNo_Textfield);
				clear(driver, subLeaseRefNo_Textfield);
				waitForElement(driver, subLeaseRefNo_Textfield);
				sendKeys(driver, subLeaseRefNo_Textfield, subLeaseRefNo);
				enter(driver);
			}
			
			if(!supplierContract.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				clear(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				sendKeys(driver, supplierContract_L, supplierContract);
				enter(driver);
			}
			if(!relRefNo.equals("")) {
				waitForElement(driver, relRefNoTextField_L);
				click(driver, relRefNoTextField_L);
				waitForElement(driver, relRefNoTextField_L);
				clear(driver, relRefNoTextField_L);
				
				waitForElement(driver, relRefNoTextField_L);
				sendKeys(driver, relRefNoTextField_L, relRefNo);
				enter(driver);
			}
			if(!transportMode.equals("")) {
				waitForElement(driver, transportMode_Dropdown);
				click(driver, transportMode_Dropdown);
				String select_transportMode = String.format(transport_Mode, transportMode);

				waitForElement(driver, select_transportMode);
				click(driver, select_transportMode);
				
			}
			
			if(!refNumber.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				clear(driver, refNumber_Textfield);
				
				waitForElement(driver, refNumber_Textfield);
				sendKeys(driver, refNumber_Textfield, refNumber);
				enter(driver);
			}
			

			if (!tareWeight.equals("")) {
				waitForElement(driver, tare_Textfield);
				click(driver, tare_Textfield);
				waitForElement(driver, tare_Textfield);
				clearAndType(driver, tare_Textfield, tareWeight);
				wait(driver, "1");
				enter(driver);
			}

			if (!payLoad.equals("")) {
				waitForElement(driver, payLoad_Textfield);
				click(driver, payLoad_Textfield);
				waitForElement(driver, payLoad_Textfield);
				clearAndType(driver, payLoad_Textfield, payLoad);

				enter(driver);
			} 
			
			if (!remarks_Input.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				sendKeys(driver, remarks_Textfield, remarks_Input);

				enter(driver);
			} 
			
			waitForElement(driver, addButtonMulti_L);
			click(driver, addButtonMulti_L);

			waitForElement(driver, selectGridCell_1_L);
			click(driver, selectGridCell_1_L);
			
			Step_Start(2, "Ensure that system should validate if user try to save RTNL move by giving SUBL ref in RTNL move", test, test1);
			
			waitForDisplay(driver, eqpNum_Inputfield);
			sendKeys(driver, eqpNum_Inputfield, eqpNumberRTNL);
			waitForElement(driver, eqpNum_Inputfield);

			Step_End(2, "Ensure that system should validate if user try to save RTNL move by giving SUBL ref in RTNL move", test, test1);

			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);
			Step_Start(3, "Ensure that system should validate as 'Invalid Scale out reference'.", test, test1);
			
			waitForElement(driver, errorRecordsFrame_L);
			if (isDisplayed(driver, errorRecordsFrame_L)) {

				String actuainvalidScaleOutError = getText(driver, invalid_Scale_Out_Error);

				if (actuainvalidScaleOutError.equals(invalidScaleOutReferenceError)) {
					System.out.println("Matched || " +invalidScaleOutReferenceError + " Error is displayed ||"+ " Expected Value is : " + invalidScaleOutReferenceError
							+ " || Actual Value is : " + actuainvalidScaleOutError);
					Extent_pass(driver, "Matched || " +invalidScaleOutReferenceError + " Error is displayed ||"+ " Expected Value is : " + invalidScaleOutReferenceError
							+ " || ActualValue is : " + actuainvalidScaleOutError, test, test1);
					click(driver, okButtonErrorFrame_L); 
				} else {
					System.out.println("Not matched || "+invalidScaleOutReferenceError + " Error is not displayed ||" + " Expected Value is : " + invalidScaleOutReferenceError
							+ " || Actual Value  is : " + actuainvalidScaleOutError);
					Extent_fail(driver, "Not matched || " +invalidScaleOutReferenceError + " Error is not displayed ||"+ " Expected Value is : " + invalidScaleOutReferenceError
							+ " || Actual Value is : " + actuainvalidScaleOutError, test, test1);
				}

			}
			Step_End(3, "Ensure that system should validate as 'Invalid Scale out reference'.", test, test1);
			Extent_completed(testCaseName, test, test1);
		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		
		if(i==1) {
			

			String testCaseName="TC_Movement_Entry_IntegrationTS065";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_065 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_065, testCaseName, "Dataset"+selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String activityONHI = data.get("ActivityONHI");
			String sOCNotAllowedError = data.get("SOCNotAllowedError");
			String location65 = data.get("Location");
			String terminal65 = data.get("Terminal");
			String equipmentNum65 = data.get("EquipmentNum");
			String releaseReferenceNumber65 = data.get("ReleaseReferenceNumber");
			String activityDateSingle65 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			String sizeType65 = data.get("SizeType");
			String shipperOwned = data.get("ShipperOwned");


			String isoSingle = data.get("ISO");
			String leaseKindSingle = data.get("LeaseKind");
			String lessorSingle = data.get("Lessor");
			String lesseeSingle = data.get("Lessee");
			String makerSingle = data.get("Maker");
			String materialSingle = data.get("Material");
			String tareSingle = data.get("Tare");
			String payLoadSingle = data.get("PayLoad");
			String grossWeightSingle = data.get("GrossWeight");
			String manufactureDateSingle = data.get("ManufactureDate");
			String supplierContractNoSingle = data.get("SupplierContractNo");

			String refNumberSingle = data.get("RefNumber");
			String thirtyTonSingle = data.get("30Ton");
			String bLNOSingle = data.get("BLNO");
			String remarksSingle = data.get("Remarks");

			Extent_Start(testCaseName, test, test1);

			//// To validate SOC not allowed for ONHI
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);


			//		Module Search
			moduleNavigate(driver, moduleName);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}

			Step_End(1, "Enter module name in searchbox & click the module", test, test1);
			Step_Start(2, "try to save ONHI move by giving 'Y' in SOC field", test, test1);
			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				System.out.println("Multiple Equipment Entry page is displayed");
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, activityONHI);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				if (!activityDateSingle65.equals("")) {
					waitForElement(driver, activeDateField_L);
					if(datePicker.equalsIgnoreCase("Yes")) {
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, activeDateField_L, activityDateSingle65);
						}}else {
							if(activityDateSingle65.contains("-")) {
								String activityDateSingle65_1=activityDateSingle65.replace("-", "/");
								clearAndType(driver, activeDateField_L, activityDateSingle65_1);

							}else {
								clearAndType(driver, activeDateField_L, activityDateSingle65);

							}		
						}
				}

				if (!activityTime_Input1.equals("")) {
					click(driver, activityTimeMultiple);

					waitForElement(driver, Calender);
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);

						clearAndType(driver, activityTime_Input, activityTime_Input1);
						System.out.println("activity_Time" + activityTime_Input1);

					}
					click(driver, activityTime_Close);
				} 
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					System.out.println("Show input field frame is displayed");
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				}

				waitForElement(driver, locationSaerchField_L);
				click(driver, locationSaerchField_L);
				Actionsendkeys(driver, locationSaerchField_L, location65);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, termDepotSearchField_L);
				click(driver, termDepotSearchField_L);
				Actionsendkeys(driver, termDepotSearchField_L, terminal65);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, relRefNoTextField_L);			
				clearAndType(driver, relRefNoTextField_L, releaseReferenceNumber65);

				waitForElement(driver, sizeTypeDropDown_L);
				click(driver, sizeTypeDropDown_L);
				String selectSizeType=String.format(sizeType_Option, sizeType65);
				waitForElement(driver, selectSizeType);
				click(driver, selectSizeType);

				click(driver, shipper_Owned_Dropdown);
				String select_ShipperOwned =String.format(shipper_Owned, shipperOwned);

				waitForElement(driver, select_ShipperOwned);
				click(driver, select_ShipperOwned);



				if (!isoSingle.equals("")) {
					waitForElement(driver, isoDropdown); 
					click(driver, isoDropdown);
					waitForElement(driver, isoDropdown_Input); 
					clearAndType(driver, isoDropdown_Input, isoSingle);
					enter(driver);
				}

				if (!leaseKindSingle.equals("")) {
					waitForElement(driver, leaseKind_Dropdown); 
					click(driver, leaseKind_Dropdown);
					String select_LeaseKind=String.format(lease_Kind, leaseKindSingle);

					waitForElement(driver, select_LeaseKind);
					click(driver, select_LeaseKind);

				}

				if (!lessorSingle.equals("")) {
					waitForElement(driver, lessor_Searchfield); 
					click(driver, lessor_Searchfield);
					waitForElement(driver, lessor_Searchfield); 
					clearAndType(driver, lessor_Searchfield, lessorSingle);
					enter(driver);
				} 

				if (!lesseeSingle.equals("")) {
					waitForElement(driver, lessee_Searchfield); 
					click(driver, lessee_Searchfield);
					waitForElement(driver, lessee_Searchfield); 
					clearAndType(driver, lessee_Searchfield, lesseeSingle);
					enter(driver);
				} 


				if (!makerSingle.equals("")) {
					waitForElement(driver, maker_Textfield); 
					click(driver, maker_Textfield);
					waitForElement(driver, maker_Textfield); 
					clearAndType(driver, maker_Textfield, makerSingle);
					enter(driver);
				} 
				if (!materialSingle.equals("")) {
					waitForElement(driver, material_Textfield); 
					click(driver, material_Textfield);
					waitForElement(driver, material_Textfield); 
					clearAndType(driver, material_Textfield, materialSingle);
					enter(driver);
				} 

				if (!tareSingle.equals("") && isDisplayed(driver, tare_Textfield)) {
					waitForElement(driver, tare_Textfield); 
					click(driver, tare_Textfield);
					waitForElement(driver, tare_Textfield); 
					clearAndType(driver, tare_Textfield, tareSingle);
					enter(driver);
				} 

				if (!payLoadSingle.equals("")) {
					waitForElement(driver, payLoad_Textfield); 
					click(driver, payLoad_Textfield);
					waitForElement(driver, payLoad_Textfield);
					clearAndType(driver, payLoad_Textfield, payLoadSingle);
					enter(driver);
				} 

				if (!grossWeightSingle.equals("")) {
					waitForElement(driver, grossWeight_Textfield);
					click(driver, grossWeight_Textfield);
					waitForElement(driver, grossWeight_Textfield);
					clearAndType(driver, grossWeight_Textfield, grossWeightSingle);
					enter(driver);
				}

				if (!supplierContractNoSingle.equals("")) {
					waitForElement(driver, supplierContract_L);
					click(driver, supplierContract_L);
					waitForElement(driver, supplierContract_L);
					clearAndType(driver, supplierContract_L, supplierContractNoSingle);
					enter(driver);
				}

				if (!manufactureDateSingle.equals("")) {

					click(driver, Manufacture_Date);

					if(datePicker.equalsIgnoreCase("Yes")) {
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);
						}
					}else {
						if(manufactureDateSingle.contains("-")) {
							String manufactureDateSingle_1=manufactureDateSingle.replace("-", "/");
							waitForElement(driver, Manufacture_Date);
							clearAndType(driver, Manufacture_Date, manufactureDateSingle_1);

						}else {
							clearAndType(driver, Manufacture_Date, manufactureDateSingle);

						}		
					}
				} 
				if (!refNumberSingle.equals("")) {
					waitForElement(driver, refNumber_Textfield);
					click(driver, refNumber_Textfield);
					waitForElement(driver, refNumber_Textfield);
					clearAndType(driver, refNumber_Textfield, refNumberSingle);
					enter(driver);
				} 

				if (!thirtyTonSingle.equals("")) {
					waitForElement(driver, thirtyTon_Dropdown);
					click(driver, thirtyTon_Dropdown);

					String select_Ton = String.format(thirty_Ton, thirtyTonSingle);

					waitForElement(driver, select_Ton);
					click(driver, select_Ton);
				} 

				if (!bLNOSingle.equals("")) {
					waitForElement(driver, blno);
					click(driver, blno);
					waitForElement(driver, blno); 
					clearAndType(driver, blno, bLNOSingle);
					enter(driver);
				} 

				if (!remarksSingle.equals("")) {
					waitForElement(driver, remarks_Textfield);
					click(driver, remarks_Textfield);
					waitForElement(driver, remarks_Textfield);
					clearAndType(driver, remarks_Textfield, remarksSingle);
					enter(driver);
				} 

				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);

				waitForElement(driver, selectGridCell_1_L);
				click(driver, selectGridCell_1_L);
				waitForElement(driver, searchEqpNoInGrid_1_L);
				sendKeys(driver, searchEqpNoInGrid_1_L, equipmentNum65);


				scrollTop(driver);
				waitForElement(driver, saveButtonMoveEnt_L);
				click(driver, saveButtonMoveEnt_L);


			}

			waitForElement(driver, errorRecordsFrame_L);
			if (isDisplayed(driver, errorRecordsFrame_L)) {
				if (isDisplayed(driver, errorRecApply_L)) {
					System.out.println("Error Record popup is displayed");
					Extent_pass(driver, "Error Record popup is displayed", test, test1);
					click(driver, errorRecApply_L);

				} else if (isDisplayed(driver, okButtonErrorFrame_L)) {
					System.out.println("Error Record popup is not displayed");
					click(driver, okButtonErrorFrame_L);
					Extent_fail(driver, "Error Record popup is not displayed", test, test1);
				}
			}

			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);

			Step_End(2, "try to save ONHI move by giving 'Y' in SOC field", test, test1);
			Step_Start(3, "Ensure that system should validate as 'SOC IS NOT ALLOWED FOR ONHIRE'.", test, test1);
			waitForElement(driver, errorRecordsFrame_L);

			if (isDisplayed(driver, errorRecordsFrame_L)) {
				waitForElement(driver, soc_Not_Allowed_Error2);
				String actualSOCNotAllowedError = getText(driver, soc_Not_Allowed_Error2);

				if (actualSOCNotAllowedError.equals(sOCNotAllowedError)) {
					System.out.println("Matched || " +sOCNotAllowedError + " Error is displayed ||"+ " Expected Value is : " + sOCNotAllowedError
							+ " || Actual Value is : " + actualSOCNotAllowedError);
					Extent_pass(driver, "Matched || "+sOCNotAllowedError + " Error is displayed ||" + " Expected Value is : " + sOCNotAllowedError
							+ " || ActualValue is : " + actualSOCNotAllowedError, test, test1);
					click(driver, okButtonErrorFrame_L);
				} else {
					System.out.println("Not matched || "+sOCNotAllowedError + " Error is not displayed ||" + " Expected Value is : " + sOCNotAllowedError
							+ " || Actual Value  is : " + actualSOCNotAllowedError);
					Extent_fail(driver, "Not matched || "+sOCNotAllowedError + " Error is not displayed ||" + " Expected Value is : " + sOCNotAllowedError
							+ " || Actual Value is : " + actualSOCNotAllowedError, test, test1);
				}
			}
			Step_End(3, "Ensure that system should validate as 'SOC IS NOT ALLOWED FOR ONHIRE'.", test, test1);
			Extent_completed(testCaseName, test, test1);
		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		if(i==1) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS066";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_066 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_066, testCaseName, "Dataset"+selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String activityONHI66 = data.get("ActivityONHI");
			String sizeTypeMustPopup = data.get("SizeTypeMustPopup");
			String location66 = data.get("Location");
			String terminal66 = data.get("Terminal");
			String releaseReferenceNumber66 = data.get("ReleaseReferenceNumber");
			String activityDateSingle66 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			String sizeType = data.get("SizeType");
			String isoSingle = data.get("ISO");
			String shipperOwnedSingle = data.get("ShipperOwned");
			String leaseKindSingle = data.get("LeaseKind");
			String lessorSingle = data.get("Lessor");
			String lesseeSingle = data.get("Lessee");
			String makerSingle = data.get("Maker");
			String materialSingle = data.get("Material");
			String tareSingle = data.get("Tare");
			String payLoadSingle = data.get("PayLoad");
			String grossWeightSingle = data.get("GrossWeight");
			String manufactureDateSingle = data.get("ManufactureDate");
			String supplierContractNoSingle = data.get("SupplierContractNo");
			String refNumberSingle = data.get("RefNumber");
			String thirtyTonSingle = data.get("30Ton");
			String bLNOSingle = data.get("BLNO");
			String remarksSingle = data.get("Remarks");
			
			Extent_Start(testCaseName, test, test1);
			
			//// To validate size/type mandatory
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);
			
			
//			Module Search
			moduleNavigate(driver, moduleName);
			
			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, activityONHI66);
				waitForDisplay(driver, autoCompleteValue);
				enter(driver);

				if (!activityDateSingle66.equals("")) {
					waitForElement(driver, activeDateField_L);
					if(datePicker.equalsIgnoreCase("Yes")) {
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, activeDateField_L, activityDateSingle66);
							
					}}else {
						if(activityDateSingle66.contains("-")) {
							String activityDateSingle66_1=activityDateSingle66.replace("-", "/");
							clearAndType(driver, activeDateField_L, activityDateSingle66_1);
							
						}else {
						clearAndType(driver, activeDateField_L, activityDateSingle66);
						
						}		
					}
				}
				
				if (!activityTime_Input1.equals("")) {
					click(driver, activityTimeMultiple);

					waitForElement(driver, Calender);
					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						
							clearAndType(driver, activityTime_Input, activityTime_Input1);
							System.out.println("activity_Time" + activityTime_Input1);
						
					}
					click(driver, activityTime_Close);
				} 
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);
			}

			waitForElement(driver, showInputFieldFrame_L);
			if (isDisplayed(driver, showInputFieldFrame_L)) {
				System.out.println("Show input field frame is displayed");
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
			} else {
				System.out.println("Show input field frame is not displayed");
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);
			}
	Step_Start(2, "Ensure that system should validate if user try to save ONHI move by giving size/type field as blank", test, test1);
	Extent_call(test, test1, "Leaving the size/type as blank");	


			waitForElement(driver, locationSaerchField_L);
			sendKeys(driver, locationSaerchField_L, location66);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);
			
			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			sendKeys(driver, termDepotSearchField_L, terminal66);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);
			
			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, releaseReferenceNumber66);
			
			if (!sizeType.equals("")) {
			waitForElement(driver, sizeTypeDropDown_L);
			click(driver, sizeTypeDropDown_L);
			String selectSizeType=String.format(sizeType_Option, sizeType);
			waitForElement(driver, selectSizeType);
			click(driver, selectSizeType);
			
			}
			///// Non mandatory fields

			if (!isoSingle.equals("")) {
				waitForElement(driver, isoDropdown); 
				click(driver, isoDropdown);
				waitForElement(driver, isoDropdown_Input); 
				clearAndType(driver, isoDropdown_Input, isoSingle);
				enter(driver);
			} 

			if (!shipperOwnedSingle.equals("")) {
				waitForElement(driver, shipper_Owned_Dropdown); 
				click(driver, shipper_Owned_Dropdown);
				String select_ShipperOwned =String.format(shipper_Owned, shipperOwnedSingle);

				waitForElement(driver, select_ShipperOwned);
				click(driver, select_ShipperOwned);

			} 

			if (!leaseKindSingle.equals("")) {
				waitForElement(driver, leaseKind_Dropdown); 
				click(driver, leaseKind_Dropdown);
				String select_LeaseKind=String.format(lease_Kind, leaseKindSingle);

				waitForElement(driver, select_LeaseKind);
				click(driver, select_LeaseKind);

			} 

			if (!lessorSingle.equals("")) {
				waitForElement(driver, lessor_Searchfield); 
				click(driver, lessor_Searchfield);
				waitForElement(driver, lessor_Searchfield); 
				clearAndType(driver, lessor_Searchfield, lessorSingle);
				enter(driver);
			} 

			if (!lesseeSingle.equals("")) {
				waitForElement(driver, lessee_Searchfield); 
				click(driver, lessee_Searchfield);
				waitForElement(driver, lessee_Searchfield); 
				clearAndType(driver, lessee_Searchfield, lesseeSingle);
				enter(driver);
			} 


			if (!makerSingle.equals("")) {
				waitForElement(driver, maker_Textfield); 
				click(driver, maker_Textfield);
				waitForElement(driver, maker_Textfield); 
				clearAndType(driver, maker_Textfield, makerSingle);
				enter(driver);
			} 

			if (!materialSingle.equals("")) {
				waitForElement(driver, material_Textfield); 
				click(driver, material_Textfield);
				waitForElement(driver, material_Textfield); 
				clearAndType(driver, material_Textfield, materialSingle);
				enter(driver);
			} 

			if (!tareSingle.equals("") && isDisplayed(driver, tare_Textfield)) {
				waitForElement(driver, tare_Textfield); 
				click(driver, tare_Textfield);
				waitForElement(driver, tare_Textfield); 
				clearAndType(driver, tare_Textfield, tareSingle);
				enter(driver);
			} 

			if (!payLoadSingle.equals("")) {
				waitForElement(driver, payLoad_Textfield); 
				click(driver, payLoad_Textfield);
				waitForElement(driver, payLoad_Textfield);
				clearAndType(driver, payLoad_Textfield, payLoadSingle);
				enter(driver);
			} 
			if (!grossWeightSingle.equals("")) {
				waitForElement(driver, grossWeight_Textfield);
				click(driver, grossWeight_Textfield);
				waitForElement(driver, grossWeight_Textfield);
				clearAndType(driver, grossWeight_Textfield, grossWeightSingle);
				enter(driver);
			}

			if (!supplierContractNoSingle.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				clearAndType(driver, supplierContract_L, supplierContractNoSingle);
				enter(driver);
			} 

			if (!manufactureDateSingle.equals("")) {
				if(datePicker.equalsIgnoreCase("Yes")) {
					if (isDisplayed(driver, Calender)) {
						selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);
					}
					}else {
					if(manufactureDateSingle.contains("-")) {
						String manufactureDateSingle_1=manufactureDateSingle.replace("-", "/");
						waitForElement(driver, Manufacture_Date);
						clearAndType(driver, Manufacture_Date, manufactureDateSingle_1);

					}else {
					clearAndType(driver, Manufacture_Date, manufactureDateSingle);
					
					}		
				}
			} 
			if (!refNumberSingle.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				clearAndType(driver, refNumber_Textfield, refNumberSingle);
				enter(driver);
			} 

			if (!thirtyTonSingle.equals("")) {
				waitForElement(driver, thirtyTon_Dropdown);
				click(driver, thirtyTon_Dropdown);
				

				String select_Ton = String.format(thirty_Ton, thirtyTonSingle);

				waitForElement(driver, select_Ton);
				click(driver, select_Ton);
			} 

			if (!bLNOSingle.equals("")) {
				waitForElement(driver, blno);
				click(driver, blno);
				waitForElement(driver, blno); 
				clearAndType(driver, blno, bLNOSingle);
				enter(driver);
			}
			if (!remarksSingle.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				clearAndType(driver, remarks_Textfield, remarksSingle);
				enter(driver);
			} 
			
	Step_End(2, "Ensure that system should validate if user try to save ONHI move by giving size/type field as blank", test, test1);
			waitForElement(driver, addButtonMulti_L);
			click(driver, addButtonMulti_L);
	Step_Start(3, "Ensure that system should validate as 'Size/Type must be selected'.", test, test1);
			waitForElement(driver, Popup_Message);
			if (isDisplayed(driver, Popup_Message)) {

				String actualSizeTypeMustPopup = getText(driver, Popup_Message);

				if (actualSizeTypeMustPopup.equals(sizeTypeMustPopup)) {
					System.out.println("Matched || "+sizeTypeMustPopup + " popup is displayed ||" + " Expected Value is : " + sizeTypeMustPopup
							+ " || Actual Value is : "+sizeTypeMustPopup + " popup is displayed ||" + actualSizeTypeMustPopup);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + sizeTypeMustPopup
							+ " || ActualValue is : " + actualSizeTypeMustPopup, test, test1);
				} else {
					System.out.println("Not matched || " +sizeTypeMustPopup + " popup is not displayed ||"+ " Expected Value is : " + sizeTypeMustPopup
							+ " || Actual Value  is : "+sizeTypeMustPopup + " popup is not displayed ||" + actualSizeTypeMustPopup);
					Extent_fail(driver, "Not matched || " + " Expected Value is : " + sizeTypeMustPopup
							+ " || Actual Value is : " + actualSizeTypeMustPopup, test, test1);
				}

			}
			Step_End(3, "Ensure that system should validate as 'Size/Type must be selected'.", test, test1);
			Extent_completed(testCaseName, test, test1);
		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		if(i==1) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS067";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_033 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_033, testCaseName, "Dataset"+selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String datePicker = data.get("datePicker");
			String lodfActivity67 = data.get("LodfActivity");
			String bookingNumForLodf67 = data.get("BookingNumForLodf");
			String location67 = data.get("Location");
			String terminal67 = data.get("Terminal");
			String eqpNumMulti = data.get("EqpNumMulti");
			String activityDateSingle67 = data.get("activityDateSingle67");
			String sizeTypeMismatchError = data.get("SizeTypeMismatchError");
			String activityTime_Input1 = data.get("activityTime_Input1");
			String condition = data.get("Condition");
			String Search_BookNo_Column_Header = data.get("Search_BookNo_Column_Header");

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
					String POD_data = data.get("POD_data");
					String OW_ind_data = data.get("OW_ind_data");
					String IMO_data = data.get("IMO_data");
					String OW_data = data.get("OW_data");
					String temp_data = data.get("temp_data");
					String POR_data = data.get("POR_data");
					String Ship_seal_data = data.get("Ship_seal_data");
					String delivery_data = data.get("delivery_data");
					
			Extent_Start(testCaseName, test, test1);

//			Module Search
			moduleNavigate(driver, moduleName);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}

			// Multiple Equipment Entry

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				System.out.println("Multiple Equipment Entry page is displayed");
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, lodfActivity67);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				if (!activityDateSingle67.equals("")) {
					waitForElement(driver, MultiActivity_Date);
					if(datePicker.equalsIgnoreCase("Yes")) {
						Extent_call(test, test1, "Entering the date,month & year");
						if (isDisplayed(driver, Calender)) {
							selectDatePicker(driver, MultiActivity_Date, activityDateSingle67);
					}}else {
						if(activityDateSingle67.contains("-")) {
							String activityDateSingle50_1=activityDateSingle67.replace("-", "/");
							clearAndType(driver, MultiActivity_Date, activityDateSingle50_1);
						}else {
						clearAndType(driver, MultiActivity_Date, activityDateSingle67);
						
						}		
					}
				}
				
				if (!activityTime_Input1.equals("")) {
					
					click(driver, activityTimeMultiple);

					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);
						
							clearAndType(driver, activityTime_Input, activityTime_Input1);
							System.out.println("activity_Time" + activityTime_Input1);
						
					}
					
					click(driver, activityTime_Close);
				}
				
				waitForElement(driver, showInputButton);
				click(driver, showInputButton);

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					System.out.println("Show input field frame is displayed");
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				}
				Step_Start(1, " Ensure that system should validate if user try to save LODF move by giving incorrect size/type booking which is not matched the size type of container movement", test, test1);
				waitForElement(driver, locationSaerchField_L);
				sendKeys(driver, locationSaerchField_L, location67);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, termDepotSearchField_L);
				click(driver, termDepotSearchField_L);
				sendKeys(driver, termDepotSearchField_L, terminal67);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				waitForElement(driver, bookingSearch_Button);
				click(driver, bookingSearch_Button);
				twoColumnSearchWindow(driver, Search_BookNo_Column_Header, condition, bookingNumForLodf67);

				
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
				
				if(!POD_data.equals("")) {
					waitForElement(driver, P_POD_Txt_Field);
					clearAndType(driver, P_POD_Txt_Field,POD_data);
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
					clearAndType(driver, O_H,OH_data);
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
					String OW_ind_opt=String.format(owInd, OW_ind_data);
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
				
				
				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);

				waitForElement(driver, selectGridCell_1_L);
				click(driver, selectGridCell_1_L);
				sendKeys(driver, eqpNum_Inputfield, eqpNumMulti);

				scrollTop(driver);
				waitForElement(driver, saveButtonMoveEnt_L);
				click(driver, saveButtonMoveEnt_L);
			}
			Step_End(1, " Ensure that system should validate if user try to save LODF move by giving incorrect size/type booking which is not matched the size type of container movement", test, test1);
			Step_Start(2, "Ensure that system should validate as 'Size type mismatch with Booking'.", test, test1);
			
			waitForDisplay(driver, forcebtn);
			if(isdisplayed(driver, forcebtn)) {
				click(driver, forcebtn);
			}

			waitForElement(driver, errorRecordsFrame_L);
			if (isdisplayed(driver, errorRecordsFrame_L)) {

				String actualSizeTypeError = getText(driver, sizeType_Mismatch_Error);

				if (actualSizeTypeError.equals(sizeTypeMismatchError)) {
					System.out.println("Matched || " +sizeTypeMismatchError + " Error is displayed ||"+ " Expected Value is : " + sizeTypeMismatchError
							+ " || Actual Value is : " + actualSizeTypeError);
					Extent_pass(driver, "Matched || " +sizeTypeMismatchError + " Error is displayed ||"+ " Expected Value is : " + sizeTypeMismatchError
							+ " || ActualValue is : " + actualSizeTypeError, test, test1);
				} else {
					System.out.println("Not matched || "+sizeTypeMismatchError + " Error is not displayed ||" + " Expected Value is : " + sizeTypeMismatchError
							+ " || Actual Value  is : " + actualSizeTypeError);
					Extent_fail(driver, "Not matched || "+sizeTypeMismatchError + " Error is not displayed ||" + " Expected Value is : " + sizeTypeMismatchError
							+ " || Actual Value is : " + actualSizeTypeError, test, test1);
				}
				click(driver, okButtonErrorFrame_L);
				Step_End(2, "Ensure that system should validate as 'Size type mismatch with Booking'.", test, test1);
				Extent_completed(testCaseName, test, test1);
			}
		
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
	
	}
}
