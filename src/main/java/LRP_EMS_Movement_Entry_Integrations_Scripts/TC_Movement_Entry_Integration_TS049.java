package LRP_EMS_Movement_Entry_Integrations_Scripts;


import java.util.Map;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS049 extends Keywords {

	public void Movement_Entry_Integration_TS049(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testcase_Name = "TC_Movement_Entry_Integration_TS049";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
		
		String username = data.get("Username");
		String password = data.get("Password");
		String moduleName = data.get("ModuleMovementEntry");
		String Activity_Move_Txt1 = data.get("Activity_Move");
		String booknum = data.get("BookinNo_Input");
		String Equip_Number_Txt1 = data.get("Equip_Number");
		String Invalid_Activity_Date_Exp = data.get("Invalid_Activity_Date");
		String activityDateSingle49 = data.get("activityDateSingle49");
		String datePicker = data.get("datePicker");
		String activityTime_Input1 = data.get("activityTime_Input1");
		
		
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
				
				navigateUrl(driver, URL);

				Extent_Start(testcase_Name, test, test1);
		// Login

		LRP_Login(driver, username, password);

		// To validate if user try to LODF move with incorrect date

				
				//Module Search
				moduleNavigate(driver, moduleName);

		// Single Entry Equipment
				waitForElement(driver, singleEntryMovPage_L);
				if (isDisplayed(driver, singleEntryMovPage_L)) {
					Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
					waitForElement(driver, equipmentNoSearchField_L);
					sendKeys(driver, equipmentNoSearchField_L, Equip_Number_Txt1);
					waitForElement(driver, activitySearchFieldInSingle_L);
					sendKeys(driver, activitySearchFieldInSingle_L, Activity_Move_Txt1);
					waitForElement(driver, autoCompleteValue);
					enter(driver);
					
					if (!activityDateSingle49.equals("")) {
						waitForElement(driver, activeDateInSingle_L);
						
						if(datePicker.equalsIgnoreCase("Yes")) {
							selectDatePicker(driver, activeDateInSingle_L, activityDateSingle49);

								
						}else {
							click(driver, activeDateInSingle_L);

							if(activityDateSingle49.contains("-")) {
								String activityDateSingle_47=activityDateSingle49.replace("-", "/");
								clear(driver,activeDateInSingle_L);
								sendKeys(driver, activeDateInSingle_L, activityDateSingle_47);
								
							}else {
							clearAndType(driver, activeDateInSingle_L, activityDateSingle49);
							
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
				System.out.println("Show input field frame is displayed");
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
			} else {
				System.out.println("Show input field frame is not displayed");
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				
			}
			
			waitForElement(driver, bookingNo_SearchButton);
			click(driver, bookingNo_SearchButton);
			waitForElement(driver, bookingNo_Search);
			click(driver, bookingNo_Search);
			sendKeys(driver, bookingNo_Search, booknum);

			boolean vis = false;
			while (vis == false) {
				if (isDisplayed(driver, voyage_Search)) {
					waitForElement(driver, voyage_Search);
					click(driver, voyage_Search);
					sendKeys(driver, voyage_Search, voyage_data);
					
					String retievedBookingNo =  String.format(twoColumnSearch_Value,voyage_data); 
					waitForElement(driver, retievedBookingNo);
					click(driver, retievedBookingNo);
					click(driver, twoColumnSearch_Select_Button);
					vis = true;
				} else {
					horizontalscroll(driver, searchBookNo_Scrollbar, 1000);
				}
			}


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
			
			Step_Start(2, " Ensure that system should validate as 'Activity Date Should be within Arrival and Departure Date'.", test, test1);

			waitForElement(driver, P_Invalid_Activity_Date_Popup);
			String Date_Popup = getText(driver, P_Invalid_Activity_Date_Popup);
			if (Invalid_Activity_Date_Exp.equals(Date_Popup)) {
				System.out.println("Matched || " + " Expected Report Activity is : " + Invalid_Activity_Date_Exp
						+ " || Actual Report Activity is : " + Date_Popup);
				Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Invalid_Activity_Date_Exp
						+ " || Actual Report Activity is : " + Date_Popup, test, test1);
			} else {
				System.out.println("Not Matched || " + " Expected Report Activity is : " + Invalid_Activity_Date_Exp
						+ " || Actual Report Activity is : " + Date_Popup);
				Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Invalid_Activity_Date_Exp
						+ " || Actual Report Activity is : " + Date_Popup, test, test1);
			
			}
		
		click(driver, P_Ok_Btn);
		Step_End(2, " Ensure that system should validate as 'Activity Date Should be within Arrival and Departure Date'.", test, test1);
		Extent_completed(testcase_Name, test, test1);
	}
}
