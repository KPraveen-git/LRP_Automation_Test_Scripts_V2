package LRP_EMS_Movement_Entry_Integrations_Scripts;

import java.util.Map;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_Integration_TS053 extends Keywords {

	public void Movement_Entry_Integration_TS053(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {
		String testcase_Name = "TC_Movement_Entry_Integration_TS053";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
		
		String username = data.get("Username");
		String password = data.get("Password");
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
		navigateUrl(driver, URL);
		// Login

		LRP_Login(driver, username, password);

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

	}
}
