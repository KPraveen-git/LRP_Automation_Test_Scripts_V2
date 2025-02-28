package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS051 extends Keywords {

	public void Movement_Entry_Integration_TS051(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testcase_Name = "TC_Movement_Entry_Integration_TS051";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
		String username = data.get("Username");
		String password = data.get("Password");
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
				
				navigateUrl(driver, URL);

				Extent_Start(testcase_Name, test, test1);
				
		// Login

		LRP_Login(driver, username, password);

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
			waitForElement(driver, P_Movement_Entry_Cancel_Btn);
			click(driver, P_Movement_Entry_Cancel_Btn);
			Extent_completed(testcase_Name, test, test1);
		}

	}
}
