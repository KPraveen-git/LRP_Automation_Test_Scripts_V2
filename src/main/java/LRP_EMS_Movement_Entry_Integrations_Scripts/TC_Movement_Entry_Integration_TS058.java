package LRP_EMS_Movement_Entry_Integrations_Scripts;


import java.util.Map;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS058 extends Keywords {

	public void Movement_Entry_Integration_TS058(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {

		String testcase_Name = "TC_Movement_Entry_Integration_TS058";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);


		String username = data.get("Username");
		String password = data.get("Password");
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
		// Login
		navigateUrl(driver, URL);
		LRP_Login(driver, username, password);
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
			waitForElement(driver, P_Movement_Entry_Cancel_Btn);
			click(driver, P_Movement_Entry_Cancel_Btn);
			Step_Start(2, "Ensure that system should validate as 'Bound must be entered'.", test, test1);
			Extent_completed(testcase_Name, test, test1);
		}
	}
}
