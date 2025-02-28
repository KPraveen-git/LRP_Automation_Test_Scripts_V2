package LRP_EMS_Consolidated_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Movement_Entry_TS033_TS050_I extends Keywords {

	public void movementEntryIntegration(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset) {
		
		String testCaseName33="TC_Movement_Entry_IntegrationTS033";
		String File_Path33 = TestNgXml.getfilePath_FromExecution().get(testCaseName33);
		String URL = TestNgXml.getdatafromExecution().get("TC_Movement_Entry_TS033_TS050_I");
		String Sheet_Name_033 = TestNgXml.getsheetName_FromExecution().get(testCaseName33);
		Map<String, String> data33 = Utils.GetAllData(Sheet_Name_033, testCaseName33,
				"Dataset" + selected_dataset, File_Path33);
		String username = data33.get("Username");
		String password = data33.get("Password");
		
		navigateUrl(driver, URL);

		// Login

			LRP_Login(driver, username, password);
				
		boolean ts33=true;
		if(ts33==true) {
		
			String testCaseName="TC_Movement_Entry_IntegrationTS033";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_033, testCaseName,
					"Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String eqpNum = data.get("EquipmentNo");
			String atleastFourCharPopup = data.get("AtleastFourCharPopup");
			String activityDateSingle = data.get("ActivityDate");
			String activitySearch = data.get("Activity");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			
			Extent_Start(testCaseName, test, test1);

			//// To Validate no of Characters in Movement Entry
			// Home

			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);
			
			
//			Module Search
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);
			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}

			Step_Start(2, "Ensure system should validate if user entered only 3 characters & click search icon.", test,test1);
			waitForElement(driver, equipmentNoSearchField_L);
			sendKeys(driver, equipmentNoSearchField_L, eqpNum);

			if (!activitySearch.equals("")) {
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySearch);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			}
			if (!activityDateSingle.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle);

				} else {
					click(driver, activeDateInSingle_L);

					if (activityDateSingle.contains("-")) {
						String activityDateSingle_1 = activityDateSingle.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle);

					}
				}
			}
			if (!activityTime_Input1.equals("")) {
				click(driver, activityTime);

				waitForElement(driver, Calender);
				if (isDisplayed(driver, Calender)) {
					click(driver, activityTime_Input);
					waitForDisplay(driver, activityTime_Input);
					clearAndType(driver, activityTime_Input, activityTime_Input1);
					System.out.println("activity_Time" + activityTime_Input1);

				}
				click(driver, activityTime_Close);
			} 
			waitForElement(driver, equipmentSearch_Icon);

			click(driver, equipmentSearch_Icon);
			Step_End(2, "Ensure system should validate if user entered only 3 characters & click search icon.", test,test1);

			Step_Start(3, "Ensure that system should validate as 'Enter atleast four characters of Equipment Number'.",test, test1);
			
			waitForElement(driver, Popup_Message);

			String actualPopup = getText(driver, Popup_Message);

			if (actualPopup.equals(atleastFourCharPopup)) {
				System.out.println("Matched || " +atleastFourCharPopup+" popup is displayed"+ " || Expected Value is : " + atleastFourCharPopup + " || Actual Value is : "
						+ actualPopup);
				Extent_pass(driver, "Matched || "+atleastFourCharPopup+" popup is displayed" + " || Expected Value is : " + atleastFourCharPopup + " || ActualValue is : "
						+ actualPopup, test, test1);
			} else {
				System.out.println("Not matched || "+atleastFourCharPopup + " popup is not displayed" + " || Expected Value is : " + atleastFourCharPopup
						+ " || Actual Value  is : " + actualPopup);
				Extent_fail(driver, "Not matched || "+atleastFourCharPopup + " popup is not displayed" + " || Expected Value is : " + atleastFourCharPopup
						+ " || Actual Value is : " + actualPopup, test, test1);
			}

			Step_End(3, "Ensure that system should validate as 'Enter atleast four characters of Equipment Number'.", test,test1);

			Extent_completed(testCaseName, test, test1);
			
		waitForElement(driver, close_Tab);
		click(driver, close_Tab);
		}

		int ts34=34;

		if(ts34==34) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS034";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_034 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_034, testCaseName,
					"Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String equipmentNum = data.get("EquipmentNum");
			String selectActivity = data.get("SelectActivity");

			
			String activityDateSingle34 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			
			Extent_Start(testCaseName, test, test1);
			
			//// To Validate for Blank Activity
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//			Module Search
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Movement Entry
			Extent_call(test, test1, "Navigating to Movement Entry Page");
			
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}
			
			
			clearAndType(driver, equipmentNoSearchField_L, equipmentNum);
			
			Step_Start(2, "selecting the date", test, test1);
			
			if (!activityDateSingle34.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle34);

				} else {
					click(driver, activeDateInSingle_L);

					if (activityDateSingle34.contains("-")) {
						String activityDateSingle34_1 = activityDateSingle34.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle34_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle34);

					}
				}
			}
			if (!activityTime_Input1.equals("")) {
				click(driver, activityTime);

				if (isDisplayed(driver, Calender)) {
					click(driver, activityTime_Input);

					clearAndType(driver, activityTime_Input, activityTime_Input1);
					System.out.println("activity_Time" + activityTime_Input1);

				}
				click(driver, activityTime_Close);
			} 
			Step_End(2, "selecting the date", test, test1);
			Step_Start(3, "clicking the show input field by giving blank activity field", test, test1);

			click(driver, showInputFieldsButton_L);
			Step_End(3, "clicking the show input field by giving blank activity field", test, test1);

			Step_Start(4, "Ensure that system should validate as 'Select Activity'.", test, test1);
			
			waitForElement(driver, Popup_Message);
			String actualSelectActivityPopup = getText(driver, Popup_Message);
			if (actualSelectActivityPopup.equals(selectActivity)) {
				System.out.println("Matched || "+selectActivity + " popup is displayed" + " || Expected Value is : " + selectActivity + " || Actual Value is : "
						+ actualSelectActivityPopup);
				Extent_pass(driver, "Matched || "+selectActivity + " popup is displayed" + " || Expected Value is : " + selectActivity + " || ActualValue is : "
						+ actualSelectActivityPopup, test, test1);
			} else {
				System.out.println("Not matched || "+selectActivity + " popup is not displayed" + " || Expected Value is : " + selectActivity + " || Actual Value  is : "
						+ actualSelectActivityPopup);
				Extent_fail(driver, "Not matched || "+selectActivity + " popup is not displayed" + " || Expected Value is : " + selectActivity + " || Actual Value is : "
						+ actualSelectActivityPopup, test, test1);
			}

			Step_End(4, "Ensure that system should validate as 'Select Activity'.", test, test1);
			Extent_completed(testCaseName, test, test1);

			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
		}
		
		int ts35=35;
		if(ts35==35) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS035";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_035 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_035, testCaseName,
					"Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String equipmentNum35 = data.get("EquipmentNum");
			String activitySearch = data.get("Activity");
			String activityDateSingle = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			
			Extent_Start(testCaseName, test, test1);

			// To Check Validation for check digit in single entry

			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//			Module Search
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}

			
			Step_Start(2, "Ensure system should allow user to enter container no correctly in equipment field", test,test1);

			waitForElement(driver, equipmentNoSearchField_L);
			sendKeys(driver, equipmentNoSearchField_L, equipmentNum35);
			
			Step_End(2, "Ensure system should allow user to enter container no correctly in equipment field", test, test1);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySearch);
			enter(driver);
			
			if (!activityDateSingle.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle);

				} else {
					click(driver, activeDateInSingle_L);

					if (activityDateSingle.contains("-")) {
						String activityDateSingle_1 = activityDateSingle.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle);

					}
				}
			}
			if (!activityTime_Input1.equals("")) {
				click(driver, activityTime);

				if (isDisplayed(driver, Calender)) {
					click(driver, activityTime_Input);

					clearAndType(driver, activityTime_Input, activityTime_Input1);
					System.out.println("activity_Time" + activityTime_Input1);

				}
				click(driver, activityTime_Close);
			} 
			
			Step_Start(3, "Ensure that system should validate if user clicks show input fields after giving container no",
					test, test1);
			
			waitForElement(driver, showInputSin_L);
			click(driver, showInputSin_L);
			
			
			waitForElement(driver, popup_Message);
			String wantToApplyPopup = getText(driver, popup_Message);
			if (isDisplayed(driver, popup_Message)) {
				System.out.println("Matched || "+wantToApplyPopup + " popup is displayed");
				Extent_pass(driver, "Matched || "+wantToApplyPopup + " popup is displayed", test, test1);
				Step_End(3, "Ensure that system should validate if user clicks show input fields after giving container no",
						test, test1);

				Step_Start(4,
						"Ensure that system should not proceed further if user clicked No from above confirmation message",
						test, test1);
				Extent_call(test, test1, "clicking the NO option");
				click(driver, popup_Message_No_Button);
				Extent_call(test, test1, "Verify the input field display");

				if (!isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is not displayed", test, test1);
					System.out.println("Show input field frame is not displayed");
					
				} else {
					System.out.println("Show input field frame is displayed");	
					Extent_fail(driver, "Show input field frame is displayed", test, test1);
				}
			} else {
				System.out.println("Not Matched || "+wantToApplyPopup + " popup is not displayed");
				Extent_fail(driver, "Not Matched || "+wantToApplyPopup + " popup is not displayed", test, test1);
			}

			
			Step_End(4, "Ensure that system should not proceed further if user clicked No from above confirmation message",
					test, test1);
			waitForElement(driver, showInputSin_L);
			click(driver, showInputSin_L);
			
			waitForElement(driver, popup_Message);
			String wantToApplyPopup2 = getText(driver, popup_Message);
			if (isDisplayed(driver, popup_Message)) {
				Extent_pass(driver, "Matched || "+wantToApplyPopup2 + " popup is displayed", test, test1);

				System.out.println("Matched || "+wantToApplyPopup2 + " popup is displayed");
				
				Step_Start(5, " Ensure that system should proceed further if user clicks Yes on the confirmation message",
						test, test1);
				Extent_call(test, test1, "clicking the YES option in the popup");
				click(driver, popup_Message_Yes_Button);

				Step_End(5, " Ensure that system should proceed further if user clicks Yes on the confirmation message",
						test, test1);

				Extent_call(test, test1, "Verify the input field display");
				waitForDisplay(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					System.out.println("Show input field frame is displayed");
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println("Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				}
			} else {
				System.out.println("Not Matched || "+wantToApplyPopup2 + " popup is not displayed");
				Extent_fail(driver, "Not Matched || "+wantToApplyPopup2 + " popup is not displayed", test, test1);
			}

			Extent_completed(testCaseName, test, test1);
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		
		int ts36=36;
		if(ts36==36) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS036";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_036 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_036, testCaseName, "Dataset"+selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String invalidEqpNo = data.get("InvalidEqpNumber");
			String invalidEqpNoPopup = data.get("InvalidEquipmentNumberPopup");
			String activitySearch36 = data.get("Activity");
			String activityDateSingle = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			
			Extent_Start(testCaseName, test, test1);

			// To Check Validation if invalid format is given in Equipment no for single
			// entry
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//			Module Search
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}

			
	Step_Start(2, "Ensure system should validate if user given invalid format characters in equipment no field", test, test1);
			
			clearAndType(driver, equipmentNoSearchField_L, invalidEqpNo);
			
	Step_End(2, "Ensure system should validate if user given invalid format characters in equipment no field", test, test1);
			
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySearch36);
			waitForElement(driver, autoCompleteValue);
			enter(driver);

			
				if (!activityDateSingle.equals("")) {
					waitForElement(driver, activeDateInSingle_L);

					if (datePicker.equalsIgnoreCase("Yes")) {
						selectDatePicker(driver, activeDateInSingle_L, activityDateSingle);

					} else {
						click(driver, activeDateInSingle_L);

						if (activityDateSingle.contains("-")) {
							String activityDateSingle_1 = activityDateSingle.replace("-", "/");
							clearAndType(driver, activeDateInSingle_L, activityDateSingle_1);

						} else {
							clearAndType(driver, activeDateInSingle_L, activityDateSingle);

						}
					}
				}
				if (!activityTime_Input1.equals("")) {
					click(driver, activityTime);

					if (isDisplayed(driver, Calender)) {
						click(driver, activityTime_Input);

						clearAndType(driver, activityTime_Input, activityTime_Input1);
						System.out.println("activity_Time" + activityTime_Input1);

					}
					click(driver, activityTime_Close);
				} 
			
			Step_Start(3, "clicking the show input field", test, test1);
			waitForElement(driver, showInputSin_L);
			click(driver, showInputSin_L);
			Step_End(3, "clicking the show input field", test, test1);
			
			Step_Start(4, "Ensure that system should validate as 'Invalid Equipment Number. Check Digit is not applicable' when clicked show input fields after providing incorrect container no", test, test1);

			waitForElement(driver, Popup_Message);
			String actualInvalidEqpNumPopup = getText(driver, Popup_Message);
			if (actualInvalidEqpNumPopup.equals(invalidEqpNoPopup)) {
				System.out.println("Matched || "+invalidEqpNoPopup + " popup is displayed ||" + " Expected Value is : " + invalidEqpNoPopup + " || Actual Value is : "
						+ actualInvalidEqpNumPopup);
				Extent_pass(driver, "Matched || "+invalidEqpNoPopup + " popup is displayed ||" + " Expected Value is : " + invalidEqpNoPopup + " || ActualValue is : "
						+ actualInvalidEqpNumPopup, test, test1);
			} else {
				System.out.println("Not matched || "+invalidEqpNoPopup + " popup is not displayed ||" + " Expected Value is : " + invalidEqpNoPopup
						+ " || Actual Value  is : " + actualInvalidEqpNumPopup);
				Extent_fail(driver, "Not matched || "+invalidEqpNoPopup + " popup is not displayed ||" + " Expected Value is : " + invalidEqpNoPopup
						+ " || Actual Value is : " + actualInvalidEqpNumPopup, test, test1);
			}
			Step_End(4, "Ensure that system should validate as 'Invalid Equipment Number. Check Digit is not applicable' when clicked show input fields after providing incorrect container no", test, test1);
		
			Extent_completed(testCaseName, test, test1);
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
		}
		
		int ts37=37;
		
		if(ts37==37) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS037";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_037 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_037, testCaseName,
					"Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String activitySearch37 = data.get("Activity");
			String eqpNumber = data.get("EquipmentNo1");
			String locationForInvalid = data.get("LocationForInvalid");
			String terminalForInvalid = data.get("TerminalForInvalid");
			String referenceNoInvalid = data.get("ReferenceNoForInvalid");
			String invalidPortCodeError = data.get("InvalidPortCodeError");
			String invalidSizeTypeError = data.get("InvalidSize/TypeError");
			
			String activityDateSingle37 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			String sizeType37 = data.get("SizeType");
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

			String condition=data.get("Condition");
			String lesseeSearch_Filter=data.get("LesseeSearch_Filter");
			String lessorSearch_Filter=data.get("LessorSearch_Filter");
			String BL_Search_Filter=data.get("BL_Search_Filter");
			

			Extent_Start(testCaseName, test, test1);

			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//			Module Search
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}

			
			Step_Start(2,"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",test, test1);
			
			Extent_call(test, test1, "giving valid container number");
			waitForElement(driver, equipmentNoSearchField_L);
			clearAndType(driver, equipmentNoSearchField_L, eqpNumber);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySearch37);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			if (!activityDateSingle37.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle37);

				} else {
					click(driver, activeDateInSingle_L);

					if (activityDateSingle37.contains("-")) {
						String activityDateSingle37_1 = activityDateSingle37.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle37_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle37);

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
			Step_End(2,
					"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",
					test, test1);
			waitForElement(driver, popup_Message);
			String wantToApplyPopup = getText(driver, popup_Message);
			if (isDisplayed(driver, popup_Message)) {
				System.out.println("Matched || "+wantToApplyPopup + " popup is displayed");
				Extent_pass(driver, "Matched || "+wantToApplyPopup + " popup is displayed", test, test1);
				click(driver, popup_Message_Yes_Button);
				Extent_call(test, test1, "Verify the input field display");
				waitForElement(driver, showInputFieldFrame_L);

				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
					System.out.println("Show input field frame is displayed");
					
				} else {
					System.out.println("Show input field frame is not displayed");	
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				}
			} else {
				System.out.println("Not Matched || "+wantToApplyPopup + " popup is not displayed");
				Extent_fail(driver, "Not Matched || "+wantToApplyPopup + " popup is not displayed", test, test1);
			}

			Step_Start(3,
					"Ensure that system should validate if user provide incorrect location & terminal which is not mapped in given reference",
					test, test1);
			waitForElement(driver, locationSaerchField_L);
			click(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			clear(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			sendKeys(driver, locationSaerchField_L, locationForInvalid);
			waitForElement(driver, autoCompleteValue);
			enter(driver);

			Extent_call(test, test1, "Sending invalid terminal data");
			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			clear(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			sendKeys(driver, termDepotSearchField_L, terminalForInvalid);
			waitForElement(driver, autoCompleteValue);
			enter(driver);

			Step_End(3,
					"Ensure that system should validate if user provide incorrect location & terminal which is not mapped in given reference",
					test, test1);
			Extent_call(test, test1, "Sending invalid reference data");
			
			waitForElement(driver, relRefNoTextField_L);
			click(driver, relRefNoTextField_L);
			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, referenceNoInvalid);
			
			waitForElement(driver, sizeTypeDropDown_L);
			click(driver, sizeTypeDropDown_L);
			String selectSizeType=String.format(sizeType_Option, sizeType37);
			waitForElement(driver, selectSizeType);
			click(driver, selectSizeType);
		
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
				waitForElement(driver, Lessor_Btn); 
				click(driver, Lessor_Btn);
				twoColumnSearchWindow(driver, lessorSearch_Filter, condition, lessorSingle);

			} 

			if (!lesseeSingle.equals("")) {
				waitForElement(driver, Lessee_Search_Btn); 
				click(driver, Lessee_Search_Btn);
				twoColumnSearchWindow(driver, lesseeSearch_Filter, condition, lesseeSingle);

			} 
			
			if (!makerSingle.equals("")) {
				waitForElement(driver, maker_Textfield);
				click(driver, maker_Textfield);
				waitForElement(driver, maker_Textfield);
				clearAndType(driver, maker_Textfield, makerSingle);
			}

			if (!materialSingle.equals("")) {
				waitForElement(driver, material_Textfield);
				click(driver, material_Textfield);
				waitForElement(driver, material_Textfield);
				clearAndType(driver, material_Textfield, materialSingle);
			} 

			if (!tareSingle.equals("") && isDisplayed(driver, tare_Textfield)) {
				waitForElement(driver, tare_Textfield);
				click(driver, tare_Textfield);
				waitForElement(driver, tare_Textfield);
				clearAndType(driver, tare_Textfield, tareSingle);
			} 

			if (!payLoadSingle.equals("")) {
				waitForElement(driver, payLoad_Textfield);
				click(driver, payLoad_Textfield);
				waitForElement(driver, payLoad_Textfield);
				clearAndType(driver, payLoad_Textfield, payLoadSingle);
			} 

			if (!grossWeightSingle.equals("")) {
				waitForElement(driver, grossWeight_Textfield);
				click(driver, grossWeight_Textfield);
				waitForElement(driver, grossWeight_Textfield);
				clearAndType(driver, grossWeight_Textfield, grossWeightSingle);
			} 

			if (!supplierContractNoSingle.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				clearAndType(driver, supplierContract_L, supplierContractNoSingle);
			} 

			if (!manufactureDateSingle.equals("")) {

				waitForElement(driver, Manufacture_Date);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);

				} else {
					click(driver, Manufacture_Date);

					if (manufactureDateSingle.contains("-")) {
						String manufactureDateSingle_1 = manufactureDateSingle.replace("-", "/");
						waitForElement(driver, Manufacture_Date);
						clearAndType(driver, Manufacture_Date, manufactureDateSingle_1);

					} else {
						clearAndType(driver, Manufacture_Date, manufactureDateSingle);

					}
				}
			} 
			if (!refNumberSingle.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				clearAndType(driver, refNumber_Textfield, refNumberSingle);
			} 

			if (!thirtyTonSingle.equals("")) {
				waitForElement(driver, thirtyTon_Dropdown);
				click(driver, thirtyTon_Dropdown);

				String select_Ton = String.format(thirty_Ton, thirtyTonSingle);

				waitForElement(driver, select_Ton);
				click(driver, select_Ton);
			} 

			if (!bLNOSingle.equals("")) {
				waitForElement(driver, BL_No_SearchBtn);
				click(driver, BL_No_SearchBtn);
				twoColumnSearchWindow(driver, BL_Search_Filter, condition, bLNOSingle);

			} 
			if (!remarksSingle.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				clearAndType(driver, remarks_Textfield, remarksSingle);
			} 
			
			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);

			Step_Start(4,
					"Ensure that system should validate as 'Invalid PortCode for this Reference No and Invalid size type for this Reference No",
					test, test1);
			waitForElement(driver, errorRecordsFrame_L);
			if (isDisplayed(driver, errorRecordsFrame_L)) {

				String actualPortCodeError = getText(driver, error_Description_1);
				String actualSizeTypeError = getText(driver, error_Description_2);

				if (actualPortCodeError.equalsIgnoreCase(invalidPortCodeError)) {
					System.out.println("Matched || "+invalidPortCodeError + " Error is displayed ||" + " Expected Value is : " + invalidPortCodeError
							+ " || Actual Value is : " + actualPortCodeError);
					Extent_pass(driver, "Matched || "+invalidPortCodeError + " Error is displayed ||" + " Expected Value is : " + invalidPortCodeError
							+ " || ActualValue is : " + actualPortCodeError, test, test1);
				} else {
					System.out.println("Not matched || "+invalidPortCodeError + " Error is not displayed ||" + " Expected Value is : " + invalidPortCodeError
							+ " || Actual Value  is : " + actualPortCodeError);
					Extent_fail(driver, "Not matched || "+invalidPortCodeError + " Error is not displayed ||" + " Expected Value is : " + invalidPortCodeError
							+ " || Actual Value is : " + actualPortCodeError, test, test1);
				}
				Extent_call(test, test1, "verifying Invalid size/type for this Reference No'.");
				if (actualSizeTypeError.equalsIgnoreCase(invalidSizeTypeError)) {
					System.out.println("Matched || "+invalidSizeTypeError + " Error is displayed ||" + " Expected Value is : " + invalidSizeTypeError
							+ " || Actual Value is : " + actualSizeTypeError);
					Extent_pass(driver, "Matched || "+invalidSizeTypeError + " Error is displayed ||" + " Expected Value is : " + invalidSizeTypeError
							+ " || ActualValue is : " + actualSizeTypeError, test, test1);
				} else {
					System.out.println("Not matched || "+invalidSizeTypeError + " Error is not displayed ||" + " Expected Value is : " + invalidSizeTypeError
							+ " || Actual Value  is : " + actualSizeTypeError);
					Extent_fail(driver, "Not matched || "+invalidSizeTypeError + " Error is not displayed ||" + " Expected Value is : " + invalidSizeTypeError
							+ " || Actual Value is : " + actualSizeTypeError, test, test1);
				}
				click(driver, okButtonErrorFrame_L);

			}
			Step_End(4,
					"Ensure that system should validate as 'Invalid PortCode for this Reference No and Invalid size type for this Reference No",
					test, test1);

			Extent_completed(testCaseName, test, test1);

			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
			
		}
		
		int ts38=38;
		if(ts38==38) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS038";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_038 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_038, testCaseName,
					"Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String eqpNumber38 = data.get("EquipmentNo1");
			String activitySearch38 = data.get("Activity");
			String location = data.get("Location");
			String terminal = data.get("Terminal");
			String invalidReferenceNum = data.get("InvalidReferenceNum");
			String invalidReferenceError = data.get("InvalidReferenceError");
			String sizeType38 = data.get("SizeType");
			
			String activityDateSingle38 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			
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
			String condition=data.get("Condition");
			String lesseeSearch_Filter=data.get("LesseeSearch_Filter");
			String lessorSearch_Filter=data.get("LessorSearch_Filter");
			String BL_Search_Filter=data.get("BL_Search_Filter");
			
			Extent_Start(testCaseName, test, test1);


			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//			Module Search
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}
			
			
			Step_Start(2,
					"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",
					test, test1);
			waitForElement(driver, equipmentNoSearchField_L);
			clearAndType(driver, equipmentNoSearchField_L, eqpNumber38);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySearch38);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			if (!activityDateSingle38.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle38);

				} else {
					click(driver, activeDateInSingle_L);

					if (activityDateSingle38.contains("-")) {
						String activityDateSingle38_1 = activityDateSingle38.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle38_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle38);

					}
				}
			}
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
			Step_End(2,
					"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",
					test, test1);
			waitForElement(driver, popup_Message);
			String wantToApplyPopup = getText(driver, popup_Message);
			if (isDisplayed(driver, popup_Message)) {
				System.out.println("Matched || "+wantToApplyPopup + " popup is displayed");
				Extent_pass(driver, "Matched || "+wantToApplyPopup + " popup is displayed", test, test1);
				click(driver, popup_Message_Yes_Button);
				Extent_call(test, test1, "Verify the input field display");

				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
					System.out.println("Show input field frame is displayed");
					
				} else {
					System.out.println("Show input field frame is not displayed");	
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				}
			} else {
				System.out.println("Not Matched || "+wantToApplyPopup + " popup is not displayed");
				Extent_fail(driver, "Not Matched || "+wantToApplyPopup + " popup is not displayed", test, test1);
			}
			
			Step_Start(3, "Ensure that system should allow user to give valid location & terminal", test, test1);
			click(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			clear(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			sendKeys(driver, locationSaerchField_L, location);
			waitForElement(driver, autoCompleteValue);
			enter(driver);

			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			clear(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			sendKeys(driver, termDepotSearchField_L, terminal);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			Step_End(3, "Ensure that system should allow user to give valid location & terminal", test, test1);
			Step_Start(4, " Ensure that system should validate if user provide incorrect release ref", test, test1);
			waitForElement(driver, relRefNoTextField_L);
			click(driver, relRefNoTextField_L);
			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, invalidReferenceNum);
			
			Step_End(4, " Ensure that system should validate if user provide incorrect release ref", test, test1);
			waitForElement(driver, sizeTypeDropDown_L);
			click(driver, sizeTypeDropDown_L);
			String selectSizeType=String.format(sizeType_Option, sizeType38);
			waitForElement(driver, selectSizeType);
			click(driver, selectSizeType);
			
		
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
				waitForElement(driver, Lessor_Btn); 
				click(driver, Lessor_Btn);
				twoColumnSearchWindow(driver, lessorSearch_Filter, condition, lessorSingle);

			} 

			if (!lesseeSingle.equals("")) {
				waitForElement(driver, Lessee_Search_Btn); 
				click(driver, Lessee_Search_Btn);
				twoColumnSearchWindow(driver, lesseeSearch_Filter, condition, lesseeSingle);

			} 
			
			if (!makerSingle.equals("")) {
				waitForElement(driver, maker_Textfield);
				click(driver, maker_Textfield);
				waitForElement(driver, maker_Textfield);
				clearAndType(driver, maker_Textfield, makerSingle);
			}

			if (!materialSingle.equals("")) {
				waitForElement(driver, material_Textfield);
				click(driver, material_Textfield);
				waitForElement(driver, material_Textfield);
				clearAndType(driver, material_Textfield, materialSingle);
			} 

			if (!tareSingle.equals("") && isDisplayed(driver, tare_Textfield)) {
				waitForElement(driver, tare_Textfield);
				click(driver, tare_Textfield);
				waitForElement(driver, tare_Textfield);
				clearAndType(driver, tare_Textfield, tareSingle);
			} 

			if (!payLoadSingle.equals("")) {
				waitForElement(driver, payLoad_Textfield);
				click(driver, payLoad_Textfield);
				waitForElement(driver, payLoad_Textfield);
				clearAndType(driver, payLoad_Textfield, payLoadSingle);
			} 

			if (!grossWeightSingle.equals("")) {
				waitForElement(driver, grossWeight_Textfield);
				click(driver, grossWeight_Textfield);
				waitForElement(driver, grossWeight_Textfield);
				clearAndType(driver, grossWeight_Textfield, grossWeightSingle);
			} 

			if (!supplierContractNoSingle.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				clearAndType(driver, supplierContract_L, supplierContractNoSingle);
			} 

			if (!manufactureDateSingle.equals("")) {

				waitForElement(driver, Manufacture_Date);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);

				} else {
					click(driver, Manufacture_Date);

					if (manufactureDateSingle.contains("-")) {
						String manufactureDateSingle_1 = manufactureDateSingle.replace("-", "/");
						waitForElement(driver, Manufacture_Date);
						clearAndType(driver, Manufacture_Date, manufactureDateSingle_1);

					} else {
						clearAndType(driver, Manufacture_Date, manufactureDateSingle);

					}
				}
			} 
			if (!refNumberSingle.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				clearAndType(driver, refNumber_Textfield, refNumberSingle);
			} 

			if (!thirtyTonSingle.equals("")) {
				waitForElement(driver, thirtyTon_Dropdown);
				click(driver, thirtyTon_Dropdown);

				String select_Ton = String.format(thirty_Ton, thirtyTonSingle);

				waitForElement(driver, select_Ton);
				click(driver, select_Ton);
			} 

			if (!bLNOSingle.equals("")) {
				waitForElement(driver, BL_No_SearchBtn);
				click(driver, BL_No_SearchBtn);
				twoColumnSearchWindow(driver, BL_Search_Filter, condition, bLNOSingle);

			} 
			if (!remarksSingle.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				clearAndType(driver, remarks_Textfield, remarksSingle);
			} 
			
			
			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);
			
			waitForElement(driver, errorRecordsFrame_L);
			if (isDisplayed(driver, errorRecordsFrame_L)) {

				String actualRefernceNumError = getText(driver, error_Description_1);
				Step_Start(5, "Ensure that system should validate as 'INVALID REFERENCE NO'", test, test1);
				if (actualRefernceNumError.equalsIgnoreCase(invalidReferenceError)) {
					System.out.println("Matched || "+invalidReferenceError + " Error is displayed ||" + " Expected Value is : " + invalidReferenceError
							+ " || Actual Value is : " + actualRefernceNumError);
					Extent_pass(driver, "Matched || "+invalidReferenceError + " Error is displayed ||" + " Expected Value is : " + invalidReferenceError
							+ " || ActualValue is : " + actualRefernceNumError, test, test1);
					click(driver, okButtonErrorFrame_L);

				} else {
					System.out.println("Not matched || "+invalidReferenceError + " Error is not displayed ||" + " Expected Value is : " + invalidReferenceError
							+ " || Actual Value  is : " + actualRefernceNumError);
					Extent_fail(driver, "Not matched || "+invalidReferenceError + " Error is not displayed ||" + " Expected Value is : " + invalidReferenceError
							+ " || Actual Value is : " + actualRefernceNumError, test, test1);
				}
				Step_End(5, "Ensure that system should validate as 'INVALID REFERENCE NO'", test, test1);
			}

			Extent_completed(testCaseName, test, test1);
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		
		int ts39=39;
		if(ts39==39) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS039";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_039 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_039, testCaseName,
					"Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String eqpNumber39 = data.get("EquipmentNo1");
			String activitySearch39 = data.get("Activity");
			String releaseReferenceNumber = data.get("ReleaseReferenceNumber");
			String location39 = data.get("Location");
			String terminal39 = data.get("Terminal");
			String invalidSizeTypeErrorMes = data.get("InvalidSizeTypeError");
			String sizeType39 = data.get("SizeType");
			
			String activityDateSingle39 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");

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
			String condition=data.get("Condition");
			String lesseeSearch_Filter=data.get("LesseeSearch_Filter");
			String lessorSearch_Filter=data.get("LessorSearch_Filter");
			String BL_Search_Filter=data.get("BL_Search_Filter");
			

			Extent_Start(testCaseName, test, test1);

			
			//// To validate with incorrect size type
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

			
//			Module Search
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}
			
			Step_Start(2,
					"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",
					test, test1);
			waitForElement(driver, equipmentNoSearchField_L);
			clearAndType(driver, equipmentNoSearchField_L, eqpNumber39);
			
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySearch39);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			if (!activityDateSingle39.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle39);

				} else {
					click(driver, activeDateInSingle_L);

					if (activityDateSingle39.contains("-")) {
						String activityDateSingle39_1 = activityDateSingle39.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle39_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle39);

					}
				}
			}
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

			Step_End(2,
					"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",
					test, test1);
			Step_Start(3, " Ensure that system should allow user to give valid location & terminal", test, test1);
			click(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			clear(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			sendKeys(driver, locationSaerchField_L, location39);
			waitForElement(driver, autoCompleteValue);
			enter(driver);

			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			clear(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			sendKeys(driver, termDepotSearchField_L, terminal39);
			waitForElement(driver, autoCompleteValue);
			enter(driver);

			Step_End(3, " Ensure that system should allow user to give valid location & terminal", test, test1);

			Step_Start(4, " Ensure that system should allow to provide valid release ref", test, test1);
			waitForElement(driver, relRefNoTextField_L);
			click(driver, relRefNoTextField_L);
			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, releaseReferenceNumber);

			Step_End(4, " Ensure that system should allow to provide valid release ref", test, test1);

			Step_Start(5,
					"Ensure that system should validate if user provide incorrect size type which is not defined in given release ref",
					test, test1);
			waitForElement(driver, sizeTypeDropDown_L);
			click(driver, sizeTypeDropDown_L);
			String selectSizeType=String.format(sizeType_Option, sizeType39);
			waitForElement(driver, selectSizeType);
			click(driver, selectSizeType);
			
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
				waitForElement(driver, Lessor_Btn); 
				click(driver, Lessor_Btn);
				twoColumnSearchWindow(driver, lessorSearch_Filter, condition, lessorSingle);

			} 

			if (!lesseeSingle.equals("")) {
				waitForElement(driver, Lessee_Search_Btn); 
				click(driver, Lessee_Search_Btn);
				twoColumnSearchWindow(driver, lesseeSearch_Filter, condition, lesseeSingle);

			}
			
			if (!makerSingle.equals("")) {
				waitForElement(driver, maker_Textfield);
				click(driver, maker_Textfield);
				waitForElement(driver, maker_Textfield);
				clearAndType(driver, maker_Textfield, makerSingle);
			}

			if (!materialSingle.equals("")) {
				waitForElement(driver, material_Textfield);
				click(driver, material_Textfield);
				waitForElement(driver, material_Textfield);
				clearAndType(driver, material_Textfield, materialSingle);
			} 

			if (!tareSingle.equals("") && isDisplayed(driver, tare_Textfield)) {
				waitForElement(driver, tare_Textfield);
				click(driver, tare_Textfield);
				waitForElement(driver, tare_Textfield);
				clearAndType(driver, tare_Textfield, tareSingle);
			} 

			if (!payLoadSingle.equals("")) {
				waitForElement(driver, payLoad_Textfield);
				click(driver, payLoad_Textfield);
				waitForElement(driver, payLoad_Textfield);
				clearAndType(driver, payLoad_Textfield, payLoadSingle);
			} 

			if (!grossWeightSingle.equals("")) {
				waitForElement(driver, grossWeight_Textfield);
				click(driver, grossWeight_Textfield);
				waitForElement(driver, grossWeight_Textfield);
				clearAndType(driver, grossWeight_Textfield, grossWeightSingle);
			} 

			if (!supplierContractNoSingle.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				clearAndType(driver, supplierContract_L, supplierContractNoSingle);
			} 

			if (!manufactureDateSingle.equals("")) {

				waitForElement(driver, Manufacture_Date);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);

				} else {
					click(driver, Manufacture_Date);

					if (manufactureDateSingle.contains("-")) {
						String manufactureDateSingle_1 = manufactureDateSingle.replace("-", "/");
						waitForElement(driver, Manufacture_Date);
						clearAndType(driver, Manufacture_Date, manufactureDateSingle_1);

					} else {
						clearAndType(driver, Manufacture_Date, manufactureDateSingle);

					}
				}
			}
			if (!refNumberSingle.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				clearAndType(driver, refNumber_Textfield, refNumberSingle);
			} 

			if (!thirtyTonSingle.equals("")) {
				waitForElement(driver, thirtyTon_Dropdown);
				click(driver, thirtyTon_Dropdown);

				String select_Ton = String.format(thirty_Ton, thirtyTonSingle);
				waitForElement(driver, select_Ton);
				click(driver, select_Ton);
			} 

			if (!bLNOSingle.equals("")) {
				waitForElement(driver, BL_No_SearchBtn);
				click(driver, BL_No_SearchBtn);
				twoColumnSearchWindow(driver, BL_Search_Filter, condition, bLNOSingle);

			} 
			if (!remarksSingle.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				clearAndType(driver, remarks_Textfield, remarksSingle);
			} 
			
			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);
			waitForElement(driver, errorRecordsFrame_L);

			if (isDisplayed(driver, errorRecordsFrame_L)) {

				String actualSizeTypeError = getText(driver, error_Description_2);
				Extent_call(test, test1, "Comparing the actual and expected messages below:-");

				if (actualSizeTypeError.equalsIgnoreCase(invalidSizeTypeErrorMes)) {
					System.out.println("Matched || "+invalidSizeTypeErrorMes + " Error is displayed ||" + " Expected Value is : " + invalidSizeTypeErrorMes
							+ " || Actual Value is : " + actualSizeTypeError);
					Extent_pass(driver, "Matched || "+invalidSizeTypeErrorMes + " Error is displayed ||" + " Expected Value is : " + invalidSizeTypeErrorMes
							+ " || ActualValue is : " + actualSizeTypeError, test, test1);
					click(driver, okButtonErrorFrame_L);
				} else {
					System.out.println("Not matched || "+invalidSizeTypeErrorMes + " Error is not displayed ||" + " Expected Value is : " + invalidSizeTypeErrorMes
							+ " || Actual Value  is : " + actualSizeTypeError);
					Extent_fail(driver, "Not matched || "+invalidSizeTypeErrorMes + " Error is not displayed ||" + " Expected Value is : " + invalidSizeTypeErrorMes
							+ " || Actual Value is : " + actualSizeTypeError, test, test1);
				}
				Step_End(5,
						"Ensure that system should validate if user provide incorrect size type which is not defined in given release ref",
						test, test1);
				
			}

			Extent_completed(testCaseName, test, test1);
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
		}
		
		int ts40=40;
		
		if(ts40==40) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS040";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_040 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_040, testCaseName,
					"Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String eqpNumber40 = data.get("EquipmentNo1");
			String activitySearch40 = data.get("Activity");
			String terminal40 = data.get("Terminal");
			String releaseReferenceNumber40 = data.get("ReleaseReferenceNumber");
			String activityPlacePopup = data.get("ActivityPlacePopup");
			String sizeType40 = data.get("SizeType");
			
			String activityDateSingle40 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");

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
			String condition=data.get("Condition");
			String lesseeSearch_Filter=data.get("LesseeSearch_Filter");
			String lessorSearch_Filter=data.get("LessorSearch_Filter");
			String BL_Search_Filter=data.get("BL_Search_Filter");
			
			Extent_Start(testCaseName, test, test1);


			//// To validate with blank in location field
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//			Module Search
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}
			
			
			Step_Start(2,
					"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",
					test, test1);
			waitForElement(driver, equipmentNoSearchField_L);
			clearAndType(driver, equipmentNoSearchField_L, eqpNumber40);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySearch40);
			waitForElement(driver, autoCompleteValue);
			enter(driver);

			if (!activityDateSingle40.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle40);

				} else {
					click(driver, activeDateInSingle_L);

					if (activityDateSingle40.contains("-")) {
						String activityDateSingle40_1 = activityDateSingle40.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle40_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle40);

					}
				}
			}
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
			Step_End(2,
					"Ensure system should allow user to show input details in grid if valid container no is given & clicked show input fields",
					test, test1);

			waitForElement(driver, popup_Message);
			String wantToApplyPopup = getText(driver, popup_Message);
			if (isDisplayed(driver, popup_Message)) {
				System.out.println("Matched || "+wantToApplyPopup + " popup is displayed");
				Extent_pass(driver, "Matched || "+wantToApplyPopup + " popup is displayed", test, test1);
				click(driver, popup_Message_Yes_Button);
				Extent_call(test, test1, "Verify the input field display");

				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
					System.out.println("Show input field frame is displayed");
					
				} else {
					System.out.println("Show input field frame is not displayed");	
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				}
			} else {
				System.out.println("Not Matched || "+wantToApplyPopup + " popup is not displayed");
				Extent_fail(driver, "Not Matched || "+wantToApplyPopup + " popup is not displayed", test, test1);
			}
			
			Step_Start(3, "Ensure that system should validate if user leave blank for location then try save", test, test1);

			waitForElement(driver, termDepotSearchField_L);
			click(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			clear(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			sendKeys(driver, termDepotSearchField_L, terminal40);
			waitForElement(driver, autoCompleteValue);
			enter(driver);

			waitForElement(driver, relRefNoTextField_L);
			click(driver, relRefNoTextField_L);
			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, releaseReferenceNumber40);

			Step_End(4, " Ensure that system should allow to provide valid release ref", test, test1);

			Step_Start(5,
					"Ensure that system should validate if user provide incorrect size type which is not defined in given release ref",
					test, test1);
			waitForElement(driver, sizeTypeDropDown_L);
			click(driver, sizeTypeDropDown_L);
			String selectSizeType=String.format(sizeType_Option, sizeType40);
			waitForElement(driver, selectSizeType);
			click(driver, selectSizeType);
			
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
				waitForElement(driver, Lessor_Btn); 
				click(driver, Lessor_Btn);
				twoColumnSearchWindow(driver, lessorSearch_Filter, condition, lessorSingle);

			} 

			if (!lesseeSingle.equals("")) {
				waitForElement(driver, Lessee_Search_Btn); 
				click(driver, Lessee_Search_Btn);
				twoColumnSearchWindow(driver, lesseeSearch_Filter, condition, lesseeSingle);

			}
			if (!makerSingle.equals("")) {
				waitForElement(driver, maker_Textfield);
				click(driver, maker_Textfield);
				waitForElement(driver, maker_Textfield);
				clearAndType(driver, maker_Textfield, makerSingle);
			}

			if (!materialSingle.equals("")) {
				waitForElement(driver, material_Textfield);
				click(driver, material_Textfield);
				waitForElement(driver, material_Textfield);
				clearAndType(driver, material_Textfield, materialSingle);
			} 

			if (!tareSingle.equals("") && isDisplayed(driver, tare_Textfield)) {
				waitForElement(driver, tare_Textfield);
				click(driver, tare_Textfield);
				waitForElement(driver, tare_Textfield);
				clearAndType(driver, tare_Textfield, tareSingle);
			} 

			if (!payLoadSingle.equals("")) {
				waitForElement(driver, payLoad_Textfield);
				click(driver, payLoad_Textfield);
				waitForElement(driver, payLoad_Textfield);
				clearAndType(driver, payLoad_Textfield, payLoadSingle);
			} 

			if (!grossWeightSingle.equals("")) {
				waitForElement(driver, grossWeight_Textfield);
				click(driver, grossWeight_Textfield);
				waitForElement(driver, grossWeight_Textfield);
				clearAndType(driver, grossWeight_Textfield, grossWeightSingle);
			} 

			if (!supplierContractNoSingle.equals("")) {
				waitForElement(driver, supplierContract_L);
				click(driver, supplierContract_L);
				waitForElement(driver, supplierContract_L);
				clearAndType(driver, supplierContract_L, supplierContractNoSingle);
			} 

			if (!manufactureDateSingle.equals("")) {

				waitForElement(driver, Manufacture_Date);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);

				} else {
					click(driver, Manufacture_Date);

					if (manufactureDateSingle.contains("-")) {
						String manufactureDateSingle_1 = manufactureDateSingle.replace("-", "/");
						waitForElement(driver, Manufacture_Date);
						clearAndType(driver, Manufacture_Date, manufactureDateSingle_1);

					} else {
						clearAndType(driver, Manufacture_Date, manufactureDateSingle);

					}
				}
			} 
			if (!refNumberSingle.equals("")) {
				waitForElement(driver, refNumber_Textfield);
				click(driver, refNumber_Textfield);
				waitForElement(driver, refNumber_Textfield);
				clearAndType(driver, refNumber_Textfield, refNumberSingle);
			} 

			if (!thirtyTonSingle.equals("")) {
				waitForElement(driver, thirtyTon_Dropdown);
				click(driver, thirtyTon_Dropdown);

				String select_Ton = String.format(thirty_Ton, thirtyTonSingle);

				waitForElement(driver, select_Ton);
				click(driver, select_Ton);
			} 

			if (!bLNOSingle.equals("")) {
				waitForElement(driver, BL_No_SearchBtn);
				click(driver, BL_No_SearchBtn);
				twoColumnSearchWindow(driver, BL_Search_Filter, condition, bLNOSingle);

			}  
			if (!remarksSingle.equals("")) {
				waitForElement(driver, remarks_Textfield);
				click(driver, remarks_Textfield);
				waitForElement(driver, remarks_Textfield);
				clearAndType(driver, remarks_Textfield, remarksSingle);
			} 
			
			
			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);
			
			Step_End(3, "Ensure that system should validate if user leave blank for location then try save", test, test1);
			
			Step_Start(4, "Ensure that system should validate as 'Activity Place must be entered'.", test, test1);
			waitForElement(driver, Popup_Message);
			if (isDisplayed(driver, Popup_Message)) {

				String actualActivityPlacePopup = getText(driver, Popup_Message);

				if (actualActivityPlacePopup.equals(activityPlacePopup)) {
					System.out.println("Matched || "+activityPlacePopup + " popup is displayed ||" + " Expected Value is : " + activityPlacePopup
							+ " || Actual Value is : " + actualActivityPlacePopup);
					Extent_pass(driver, "Matched || "+activityPlacePopup + " popup is displayed ||" + " Expected Value is : " + activityPlacePopup
							+ " || ActualValue is : " + actualActivityPlacePopup, test, test1);
				} else {
					System.out.println("Not matched || "+activityPlacePopup + " popup is not displayed ||" + " Expected Value is : " + activityPlacePopup
							+ " || Actual Value  is : "+activityPlacePopup + " popup is not displayed ||" + actualActivityPlacePopup);
					Extent_fail(driver, "Not matched || " + " Expected Value is : " + activityPlacePopup
							+ " || Actual Value is : " + actualActivityPlacePopup, test, test1);
				}

			}
			Step_End(4, "Ensure that system should validate as 'Activity Place must be entered'.", test, test1);
			Extent_completed(testCaseName, test, test1);
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
		}
		
		int ts41=41;
		if(ts41==41) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS041";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testCaseName, "Dataset"+selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String location41 = data.get("Location");
			String terminal41 = data.get("Terminal");
			String bookingNumberMustPopup = data.get("BookingNumberMustPopup");
			String activitySNTS = data.get("ActivitySNTS");
			String activityDate = data.get("ActivityDate");
			String datePicker = data.get("DatePicker");
			String activityTime_Input1 = data.get("ActivityTime");
			
			
			String service_Input=data.get("Service_Input");
			String voyage_Input=data.get("Voyage_Input");
			String vessel_Input=data.get("Vessel_Input");
			String bound_Input=data.get("Bound_Input");
			String supplier_contract=data.get("SupplierContract");
			String lessor=data.get("Lessor_Input");
			String lessee=data.get("Lessee_Input");
			String carrierSeal=data.get("CarrierSeal");
			String oh=data.get("OH");
			String ol=data.get("OL");
			String ow=data.get("OW");
			String por_Input=data.get("POR");
			String pol_Input=data.get("POL");
			String pod_Input=data.get("POD");
			String dest=data.get("Dest");
			String grossWeight=data.get("GrossWeight");
			String owAmount=data.get("OW_Amount");
			String relRefNo=data.get("RelRefNo");
			String imo=data.get("IMO");
			String payLoad=data.get("PayLoad");
			String tareWeight=data.get("TareWeight");
			String haulage=data.get("Haulage");
			String refNumber=data.get("RefNumber");
			String shipperSeal=data.get("ShipperSeal");
			String haulier=data.get("Haulier");
			String remarks_Input=data.get("Remarks");
			String thirtyTon=data.get("ThirtyTon");
			String ow_Ind=data.get("Ow_Ind");
			
			String condition=data.get("Condition");
			String lesseeSearch_Filter=data.get("LesseeSearch_Filter");
			String lessorSearch_Filter=data.get("LessorSearch_Filter");
			
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
	Step_Start(1, " Ensure system should allow user to show input details in grid ", test, test1);

			waitForElement(driver, multiEntryMovPage_L);
			click(driver, multiEntryMovPage_L);
			waitForElement(driver, multiEntryMovPage_L);
			if (isDisplayed(driver, multiEntryMovPage_L)) {
				Extent_pass(driver, "Multiple Equipment Entry page is displayed", test, test1);
				waitForElement(driver, activitySearchField_L);
				sendKeys(driver, activitySearchField_L, activitySNTS);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				if(!activityDate.equals("")) {
				waitForElement(driver, activeDateField_L);
				
				if(datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateField_L, activityDate);
		
				}else {
					click(driver, activeDateField_L);

					if(activityDate.contains("-")) {
						String activityDate_1=activityDate.replace("-", "/");
						clearAndType(driver, activeDateField_L, activityDate_1);
						
					}else {
					clearAndType(driver, activeDateField_L, activityDate);
					
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

				Step_End(1, " Ensure system should allow user to show input details in grid ", test, test1);
				Step_Start(2, "Ensure that system should allow to enter valid location & terminal for SNTS move", test, test1);
				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					System.out.println("Show input field frame is displayed");
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				
					waitForElement(driver, locationSaerchField_L);
					clear(driver, locationSaerchField_L);
					waitForElement(driver, locationSaerchField_L);
					sendKeys(driver, locationSaerchField_L, location41);
					waitForElement(driver, autoCompleteValue);
					enter(driver);
					
					waitForElement(driver, termDepotSearchField_L);
					clear(driver, termDepotSearchField_L);
					waitForElement(driver, termDepotSearchField_L);
					sendKeys(driver, termDepotSearchField_L, terminal41);
					waitForElement(driver, autoCompleteValue);
					enter(driver);
			
					if(!service_Input.equals("")) {
					waitForElement(driver, P_Service_Txt_Field);
					click(driver, P_Service_Txt_Field);
					waitForElement(driver, P_Service_Txt_Field);
					clearAndType(driver, P_Service_Txt_Field, service_Input);
					}
					
					if(!vessel_Input.equals("")){
						waitForElement(driver, P_Vessel_Txt_Field);
						click(driver, P_Vessel_Txt_Field);
						waitForElement(driver, P_Vessel_Txt_Field);
						clear(driver, P_Vessel_Txt_Field);
						waitForElement(driver, P_Vessel_Txt_Field);
						sendKeys(driver, P_Vessel_Txt_Field, vessel_Input);
						enter(driver);
					}
					if(!voyage_Input.equals("")){
						waitForElement(driver, P_Voyage_Txt_Field);
						click(driver, P_Voyage_Txt_Field);
						waitForElement(driver, P_Voyage_Txt_Field);
						clear(driver, P_Voyage_Txt_Field);
						waitForElement(driver, P_Voyage_Txt_Field);
						sendKeys(driver, P_Voyage_Txt_Field, voyage_Input);
						enter(driver);
					}
					
					if(!bound_Input.equals("")) {
						waitForElement(driver, P_Bound_Txt_Field);
						click(driver, P_Bound_Txt_Field);
						waitForElement(driver, P_Bound_Txt_Field);
						clear(driver, P_Bound_Txt_Field);
						enter(driver);
						waitForElement(driver, P_Bound_Txt_Field);
						sendKeys(driver, P_Bound_Txt_Field, bound_Input);
						enter(driver);
					}
					
					if(!supplier_contract.equals("")) {
						waitForElement(driver, Supplier_contract);
						click(driver, Supplier_contract);
						waitForElement(driver, Supplier_contract);
						clear(driver, Supplier_contract);
						
						waitForElement(driver, Supplier_contract);
						sendKeys(driver, Supplier_contract, supplier_contract);
						enter(driver);
					}
					
					
					if (!lessor.equals("")) {
						waitForElement(driver, Lessor_Btn); 
						click(driver, Lessor_Btn);
						twoColumnSearchWindow(driver, lessorSearch_Filter, condition, lessor);

					} 

					if (!lessee.equals("")) {
						waitForElement(driver, Lessee_Search_Btn); 
						click(driver, Lessee_Search_Btn);
						twoColumnSearchWindow(driver, lesseeSearch_Filter, condition, lessee);

					}
					if(!carrierSeal.equals("")) {
						waitForElement(driver, carrier_Seal);
						click(driver, carrier_Seal);
						waitForElement(driver, carrier_Seal);
						clear(driver, carrier_Seal);
						
						waitForElement(driver, carrier_Seal);
						sendKeys(driver, carrier_Seal, carrierSeal);
						enter(driver);
					}
					if(!oh.equals("")) {
						waitForElement(driver, oh_SNTS);
						click(driver, oh_SNTS);
						waitForElement(driver, oh_SNTS);
						clear(driver, oh_SNTS);
						
						waitForElement(driver, oh_SNTS);
						sendKeys(driver, oh_SNTS, oh);
						enter(driver);
					}
					
					if(!ol.equals("")) {
						waitForElement(driver, ol_textfield);
						click(driver, ol_textfield);
						waitForElement(driver, ol_textfield);
						clear(driver, ol_textfield);
						
						waitForElement(driver, ol_textfield);
						sendKeys(driver, ol_textfield, ol);
						enter(driver);
					}
					
					
					
					if(!ow.equals("")) {
						waitForElement(driver, ow_textfield);
						click(driver, ow_textfield);
						waitForElement(driver, ow_textfield);
						clear(driver, ow_textfield);
						
						waitForElement(driver, ow_textfield);
						sendKeys(driver, ow_textfield, ow);
						enter(driver);
					}
					

					if(!por_Input.equals("")) {
						waitForElement(driver, por_Searchfield);
						click(driver, por_Searchfield);
						waitForElement(driver, por_Searchfield);
						clear(driver, por_Searchfield);
						
						waitForElement(driver, por_Searchfield);
						sendKeys(driver, por_Searchfield, por_Input);
						enter(driver);
					}
					if(!pol_Input.equals("")) {
						waitForElement(driver, polSearchfield);
						click(driver, polSearchfield);
						waitForElement(driver, polSearchfield);
						clear(driver, polSearchfield);
						
						waitForElement(driver, polSearchfield);
						sendKeys(driver, polSearchfield, pol_Input);
						enter(driver);
					}
					
					if(!pod_Input.equals("")) {
						waitForElement(driver, podSearchfield);
						click(driver, podSearchfield);
						waitForElement(driver, podSearchfield);
						clear(driver, podSearchfield);
						
						waitForElement(driver, podSearchfield);
						sendKeys(driver, podSearchfield, pod_Input);
						enter(driver);
					}
					if(!dest.equals("")) {
						waitForElement(driver, destSearchfield);
						click(driver, destSearchfield);
						waitForElement(driver, destSearchfield);
						clear(driver, destSearchfield);
						
						waitForElement(driver, destSearchfield);
						sendKeys(driver, destSearchfield, dest);
						enter(driver);
					}
					
					if(!grossWeight.equals("")) {
						waitForElement(driver, grossWeight_Textfield);
						click(driver, grossWeight_Textfield);
						waitForElement(driver, grossWeight_Textfield);
						clear(driver, grossWeight_Textfield);
						
						waitForElement(driver, grossWeight_Textfield);
						sendKeys(driver, grossWeight_Textfield, grossWeight);
						enter(driver);
					}
					

					if(!owAmount.equals("")) {
						waitForElement(driver, OW_amount);
						click(driver, OW_amount);
						waitForElement(driver, OW_amount);
						clear(driver, OW_amount);
						
						waitForElement(driver, OW_amount);
						sendKeys(driver, OW_amount, owAmount);
						enter(driver);
					}
					
					if (!ow_Ind.equals("")) {
						waitForElement(driver, ow_Ind_Dropdown);
						click(driver, ow_Ind_Dropdown);
						
						String select_owInd=String.format(owInd, ow_Ind);
						waitForElement(driver, select_owInd);
						click(driver, select_owInd);
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
					if(!imo.equals("")) {
						waitForElement(driver, imo_Textfield);
						click(driver, imo_Textfield);
						waitForElement(driver, imo_Textfield);
						clear(driver, imo_Textfield);
						
						waitForElement(driver, imo_Textfield);
						sendKeys(driver, imo_Textfield, imo);
						enter(driver);
					}
					
					if(!payLoad.equals("")) {
						waitForElement(driver, payLoad_Textfield);
						click(driver, payLoad_Textfield);
						waitForElement(driver, payLoad_Textfield);
						clear(driver, payLoad_Textfield);
						
						waitForElement(driver, payLoad_Textfield);
						sendKeys(driver, payLoad_Textfield, payLoad);
						enter(driver);
					}
					if(!tareWeight.equals("")) {
						waitForElement(driver, tare_Textfield);
						click(driver, tare_Textfield);
						waitForElement(driver, tare_Textfield);
						clear(driver, tare_Textfield);
						
						waitForElement(driver, tare_Textfield);
						sendKeys(driver, tare_Textfield, tareWeight);
						enter(driver);
					}
					
					if(!haulage.equals("")) {
						waitForElement(driver, haulageTextfield);
						click(driver, haulageTextfield);
						waitForElement(driver, haulageTextfield);
						clear(driver, haulageTextfield);
						
						waitForElement(driver, haulageTextfield);
						sendKeys(driver, haulageTextfield, haulage);
						enter(driver);
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
					if(!shipperSeal.equals("")) {
						waitForElement(driver, shipper_Seal);
						click(driver, shipper_Seal);
						waitForElement(driver, shipper_Seal);
						clear(driver, shipper_Seal);
						
						waitForElement(driver, shipper_Seal);
						sendKeys(driver, shipper_Seal, shipperSeal);
						enter(driver);
					}
					
					if(!haulier.equals("")) {
						waitForElement(driver, haulierTextfield);
						click(driver, haulierTextfield);
						waitForElement(driver, haulierTextfield);
						clear(driver, haulierTextfield);
						
						waitForElement(driver, haulierTextfield);
						sendKeys(driver, haulierTextfield, haulier);
						enter(driver);
					}
					
					if (!thirtyTon.equals("")) {
						waitForElement(driver, thirtyTon_Dropdown);
						click(driver, thirtyTon_Dropdown);

						String select_Ton = String.format(thirty_Ton, thirtyTon);

						waitForElement(driver, select_Ton);
						click(driver, select_Ton);
					} 
					
					if(!remarks_Input.equals("")) {
						waitForElement(driver, remarksTextfield);
						click(driver, remarksTextfield);
						waitForElement(driver, remarksTextfield);
						clear(driver, remarksTextfield);
						
						waitForElement(driver, remarksTextfield);
						sendKeys(driver, remarksTextfield, remarks_Input);
						enter(driver);
					}

				waitForElement(driver, addButtonMulti_L);
				click(driver, addButtonMulti_L);
			} else {
				System.out.println("Show input field frame is not displayed");
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);
			}
				Step_End(2, "Ensure that system should allow to enter valid location & terminal for SNTS move", test, test1);
				Step_Start(3, " Ensure that system should validate as 'Booking Number must be entered'", test, test1);

			waitForElement(driver, Popup_Message);

				String actualBookingMustPopup = getText(driver, Popup_Message);

				if (actualBookingMustPopup.equals(bookingNumberMustPopup)) {
					System.out.println("Matched || " +bookingNumberMustPopup + " popup is displayed ||"+ " Expected Value is : " + bookingNumberMustPopup
							+ " || Actual Value is : " + actualBookingMustPopup);
					Extent_pass(driver, "Matched || " +bookingNumberMustPopup + " popup is displayed ||"+ " Expected Value is : " + bookingNumberMustPopup
							+ " || ActualValue is : " + actualBookingMustPopup, test, test1);
				} else {
					System.out.println("Not matched || "+bookingNumberMustPopup + " popup is not displayed ||" + " Expected Value is : " + bookingNumberMustPopup
							+ " || Actual Value  is : " + actualBookingMustPopup);
					Extent_fail(driver, "Not matched || "+bookingNumberMustPopup + " popup is not displayed ||" + " Expected Value is : " + bookingNumberMustPopup
							+ " || Actual Value is : " + actualBookingMustPopup, test, test1);
				}
			}
			Step_End(3, " Ensure that system should validate as 'Booking Number must be entered'", test, test1);
			Extent_completed(testCaseName, test, test1);
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
		}
		
		int ts42=42;
		
		if(ts42==42) {
			
			String testCaseName="TC_Movement_Entry_IntegrationTS042";

			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
			String Sheet_Name_042 = TestNgXml.getsheetName_FromExecution().get(testCaseName);
			Map<String, String> data = Utils.GetAllData(Sheet_Name_042, testCaseName,
					"Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String ctrDuplicatedPopup = data.get("CTRDuplicated");
			String savedEqpNumber = data.get("SavedEqpNumber");
			String activitySearch42 = data.get("Activity");
			String datePicker = data.get("DatePicker");
			
			String activityDateSingle42 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String showAllMoves = data.get("ShowAllMoves");

			Extent_Start(testCaseName, test, test1);

			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//			Module Search
			moduleNavigate(driver, moduleName);
			
			Step_End(1, "Enter module name in searchbox & click the module", test, test1);
			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				System.out.println("Movement Entry Page is displayed");
				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);
			}
			

			Extent_call(test, test1, "Sending container number");
			waitForElement(driver, equipmentNoSearchField_L);
			clearAndType(driver, equipmentNoSearchField_L, savedEqpNumber);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySearch42);
			waitForDisplay(driver, autoCompleteValue);
			enter(driver);

			Step_Start(2,
					" Ensure that system should validate when user try to save multiple move in same acitivty date & time",
					test, test1);
			if (!activityDateSingle42.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if (datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle42);

				} else {
					click(driver, activeDateInSingle_L);

					if (activityDateSingle42.contains("-")) {
						String activityDateSingle42_1 = activityDateSingle42.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDateSingle42_1);

					} else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle42);

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
			
			Step_End(2,
					" Ensure that system should validate when user try to save multiple move in same acitivty date & time",
					test, test1);

			Extent_call(test, test1, "Clicking on show input field");
			waitForElement(driver, showInputSin_L);
			click(driver, showInputSin_L);
			Step_Start(3,
					"Ensure that system should validate as 'CTR has duplicated date-time activities' when user click on show input fields",
					test, test1);
			waitForElement(driver, Popup_Message);
			if (isDisplayed(driver, Popup_Message)) {

				String actualCTRPopup = getText(driver, Popup_Message);
				Extent_call(test, test1, "Comparing the actual and expected popups");
				if (actualCTRPopup.equals(ctrDuplicatedPopup)) {
					System.out.println("Matched || " +ctrDuplicatedPopup + " popup is displayed ||"+ " Expected Value is : " + ctrDuplicatedPopup
							+ " || Actual Value is : " + actualCTRPopup);
					Extent_pass(driver, "Matched || " +ctrDuplicatedPopup + " popup is displayed ||"+ " Expected Value is : " + ctrDuplicatedPopup
							+ " || ActualValue is : " + actualCTRPopup, test, test1);
				} else {
					System.out.println("Not matched || "+ctrDuplicatedPopup + " popup is not displayed ||" + " Expected Value is : " + ctrDuplicatedPopup
							+ " || Actual Value  is : " + actualCTRPopup);
					Extent_fail(driver, "Not matched || " +ctrDuplicatedPopup + " popup is not displayed ||"+ " Expected Value is : " + ctrDuplicatedPopup
							+ " || Actual Value is : " + actualCTRPopup, test, test1);
				}
				Step_End(3,
						"Ensure that system should validate as 'CTR has duplicated date-time activities' when user click on show input fields",
						test, test1);
			}
			waitForElement(driver, showAllMoves_CheckBox);
			checkBox(driver, showAllMoves_CheckBox, showAllMoves);

			Extent_completed(testCaseName, test, test1);

			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
			
		}
		
		int ts43=43;
		
		if(ts43==43) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS043";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data43 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);

			String moduleName = data43.get("ModuleMovementEntry");
			String savedEqpNumber43 = data43.get("SavedEqpNumber");
			String invalidSubSequentPopup = data43.get("InvalidSubSequentPopup");
			String invalidActivity = data43.get("InvalidActivity");
			String activityDateSingle43 = data43.get("ActivityDate");
			String activityTime_Input1 = data43.get("ActivityTime");
			String datePicker = data43.get("DatePicker");
			String showAllMoves = data43.get("ShowAllMoves");

			Extent_Start(testcase_Name, test, test1);

			// To validate if user try to proceed with in subsequent move
			Step_Start(1, "Enter module name in searchbox & click the module", test, test1);

//			Module Search
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
			waitForElement(driver, singleEntryMovPage_L);
			if (isDisplayed(driver, singleEntryMovPage_L)) {
				Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
			}
			Step_Start(2, "Ensure that system should allow user to enter valid container no in movement entry", test, test1);

			waitForElement(driver, equipmentNoSearchField_L);
			clearAndType(driver, equipmentNoSearchField_L, savedEqpNumber43);

			Step_End(2, "Ensure that system should allow user to enter valid container no in movement entry", test, test1);
			Step_Start(3, "Ensure that system should validate when user try to enter incorrect next sequence move", test, test1);

			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, invalidActivity);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			Step_End(3, "Ensure that system should validate when user try to enter incorrect next sequence move", test, test1);

			waitForElement(driver, activeDateInSingle_L);
			click(driver, activeDateInSingle_L);
			Extent_call(test, test1, "Entering the date");
			if (!activityDateSingle43.equals("")) {
				waitForElement(driver, activeDateInSingle_L);

				if(datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDateSingle43);
					}else {
						click(driver, activeDateInSingle_L);

						if(activityDateSingle43.contains("-")) {
							String activityDateSingle43_1=activityDateSingle43.replace("-", "/");
							clearAndType(driver, activeDateInSingle_L, activityDateSingle43_1);

						}else {
							clearAndType(driver, activeDateInSingle_L, activityDateSingle43);

						}		
					}
			}
			if (!activityTime_Input1.equals("")) {
				click(driver, activityTime);

				if (isDisplayed(driver, Calender)) {
					click(driver, activityTime_Input);

					clearAndType(driver, activityTime_Input, activityTime_Input1);
					System.out.println("activity_Time" + activityTime_Input1);

				}
				click(driver, activityTime_Close);
			} 


			Extent_call(test, test1, "clicking on show input");
			waitForElement(driver, showInputSin_L);
			click(driver, showInputSin_L);
			waitForElement(driver, popup_Message);

			Step_Start(4, "Ensure that system should validate as 'Invalid subsequent move. Next possible movements are' with next possible moves due to move not mapped in sequence group", test, test1);
			if (isDisplayed(driver, popup_Message)) {

				String actualInvalidSubSeqPopup = getText(driver, popup_Message);
				if (!actualInvalidSubSeqPopup.contains(invalidSubSequentPopup)) {
					click(driver, popup_Message_Yes_Button);

				}
				waitForElement(driver, popup_Message);
				actualInvalidSubSeqPopup = getText(driver, popup_Message);
				Extent_call(test, test1, "Validating the actual and expected popups");
				if (actualInvalidSubSeqPopup.contains(invalidSubSequentPopup)) {
					System.out.println("Matched || " + " Expected Value is : " + invalidSubSequentPopup
							+ " || Actual Value is : " + actualInvalidSubSeqPopup);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + invalidSubSequentPopup
							+ " || ActualValue is : " + actualInvalidSubSeqPopup, test, test1);
					Extent_pass(driver, invalidSubSequentPopup + " popup is displayed", test, test1);
					System.out.println(invalidSubSequentPopup + " popup is displayed");
					if(isdisplayed(driver, popup_Message_Ok_Button)) {
						click(driver, popup_Message_Ok_Button);
					}else {
					click(driver, popup_Message_No_Button);
					}
				} else {
					System.out.println("Not matched || " + " Expected Value is : " + invalidSubSequentPopup
							+ " || Actual Value  is : " + actualInvalidSubSeqPopup);
					Extent_fail(driver, "Not matched || " + " Expected Value is : " + invalidSubSequentPopup
							+ " || Actual Value is : " + actualInvalidSubSeqPopup, test, test1);
					Extent_fail(driver, invalidSubSequentPopup + " popup is not displayed", test, test1);

					System.out.println(invalidSubSequentPopup + " popup is not displayed");
				}
				waitForElement(driver, showAllMoves_CheckBox);
				checkBox(driver, showAllMoves_CheckBox, showAllMoves);

			}
			Step_End(4, "Ensure that system should validate as 'Invalid subsequent move. Next possible movements are' with next possible moves due to move not mapped in sequence group", test, test1);


			Extent_completed(testcase_Name, test, test1);
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
		}
		
		int ts44=44;
		if(ts44==44) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS044";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data44 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			
			
			String moduleName = data44.get("ModuleMovementEntry");
			String location44 = data44.get("Location");
			String terminal44 = data44.get("Terminal");
			String activitySNTS44 = data44.get("ActivitySNTS");
			String bookingNumber = data44.get("BookingNumber");
			String invalidPrevLocError = data44.get("InvalidPrevLocPopup");
			String equipmentNumForSNTS = data44.get("EquipmentNumForSNTS");
			String activityDate44=data44.get("ActivityDate");
			
			String datePicker=data44.get("DatePicker");
			String activityTime_Input1=data44.get("ActivityTime");
			String service_Input=data44.get("Service_Input");
			String voyage_Input=data44.get("Voyage_Input");
			String vessel_Input=data44.get("Vessel_Input");
			String bound_Input=data44.get("Bound_Input");
			String supplier_contract=data44.get("SupplierContract");
			String lessor=data44.get("Lessor_Input");
			String lessee=data44.get("Lessee_Input");
			String carrierSeal=data44.get("CarrierSeal");
			String oh=data44.get("OH");
			String ol=data44.get("OL");
			String ow=data44.get("OW");
			String por_Input=data44.get("POR");
			String pol_Input=data44.get("POL");
			String pod_Input=data44.get("POD");
			String dest=data44.get("Dest");
			String grossWeight=data44.get("GrossWeight");
			String owAmount=data44.get("OW_Amount");
			String relRefNo=data44.get("RelRefNo");
			String imo=data44.get("IMO");
			String payLoad=data44.get("PayLoad");
			String tareWeight=data44.get("TareWeight");
			String haulage=data44.get("Haulage");
			String refNumber=data44.get("RefNumber");
			String shipperSeal=data44.get("ShipperSeal");
			String haulier=data44.get("Haulier");
			String remarks_Input=data44.get("Remarks");
			String thirtyTon=data44.get("ThirtyTon");
			String ow_Ind=data44.get("Ow_Ind");
			
			String bookingSearch_Filter=data44.get("BookingSearch_Filter");
			String lesseeSearch_Filter=data44.get("LesseeSearch_Filter");
			String lessorSearch_Filter=data44.get("LessorSearch_Filter");
			String condition=data44.get("Condition");


			Extent_Start(testcase_Name, test, test1);

			//To validate if user try to save SNTS with location not matching with previous move ONHI
			
//			Module Search
			moduleNavigate(driver, moduleName);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				Extent_pass(driver, "Movement Entry Page is displayed", test,test1);
			} else {
				System.out.println("Movement Entry Page is displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test,test1);
			
			}
			waitForElement(driver, singleEntryMovPage_L);
			if (isDisplayed(driver, singleEntryMovPage_L)) {
				Extent_pass(driver, "Single Equipment Entry page is displayed", test,test1);
			}
			
			Step_Start(1, "Ensure that system should allow user to enter valid container no in movement entry", test, test1);
			waitForElement(driver, equipmentNoSearchField_L);
			clearAndType(driver, equipmentNoSearchField_L, equipmentNumForSNTS);
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activitySNTS44);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			
			if (!activityDate44.equals("")) {
				waitForElement(driver, activeDateInSingle_L);
				
				if(datePicker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDate44);
		
						
				}else {
					click(driver, activeDateInSingle_L);

					if(activityDate44.contains("-")) {
						String activityDate44_1=activityDate44.replace("-", "/");
						clearAndType(driver, activeDateInSingle_L, activityDate44_1);
						
					}else {
					clearAndType(driver, activeDateInSingle_L, activityDate44);
					
					}		
				}
			}
			
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
			
			waitForElement(driver, locationSaerchField_L);
			clear(driver, locationSaerchField_L);
			waitForElement(driver, locationSaerchField_L);
			sendKeys(driver, locationSaerchField_L, location44);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
			
			waitForElement(driver, termDepotSearchField_L);
			clear(driver, termDepotSearchField_L);
			waitForElement(driver, termDepotSearchField_L);
			sendKeys(driver, termDepotSearchField_L, terminal44);
			waitForElement(driver, autoCompleteValue);
			enter(driver);
		
			waitForElement(driver, bookingNo_Searchfield);
			sendKeys(driver, bookingNo_Searchfield, bookingNumber);
			waitForElement(driver, bookingSearch_Button);
			click(driver, bookingSearch_Button);
			
			twoColumnSearchWindow(driver, bookingSearch_Filter, condition, bookingNumber);


			if(!service_Input.equals("")) {
			waitForElement(driver, P_Service_Txt_Field);
			click(driver, P_Service_Txt_Field);
			waitForElement(driver, P_Service_Txt_Field);
			clearAndType(driver, P_Service_Txt_Field, service_Input);
			}
			
			if(!vessel_Input.equals("")){
				waitForElement(driver, P_Vessel_Txt_Field);
				click(driver, P_Vessel_Txt_Field);
				waitForElement(driver, P_Vessel_Txt_Field);
				clear(driver, P_Vessel_Txt_Field);
				waitForElement(driver, P_Vessel_Txt_Field);
				sendKeys(driver, P_Vessel_Txt_Field, vessel_Input);
				enter(driver);
			}
			if(!voyage_Input.equals("")){
				waitForElement(driver, P_Voyage_Txt_Field);
				click(driver, P_Voyage_Txt_Field);
				waitForElement(driver, P_Voyage_Txt_Field);
				clear(driver, P_Voyage_Txt_Field);
				waitForElement(driver, P_Voyage_Txt_Field);
				sendKeys(driver, P_Voyage_Txt_Field, voyage_Input);
				enter(driver);
			}
			if(!bound_Input.equals("")) {
				waitForElement(driver, P_Bound_Txt_Field);
				click(driver, P_Bound_Txt_Field);
				waitForElement(driver, P_Bound_Txt_Field);
				clear(driver, P_Bound_Txt_Field);
				enter(driver);
				waitForElement(driver, P_Bound_Txt_Field);
				sendKeys(driver, P_Bound_Txt_Field, bound_Input);
				enter(driver);
			}
			
			if(!supplier_contract.equals("")) {
				waitForElement(driver, Supplier_contract);
				click(driver, Supplier_contract);
				waitForElement(driver, Supplier_contract);
				clear(driver, Supplier_contract);
				
				waitForElement(driver, Supplier_contract);
				sendKeys(driver, Supplier_contract, supplier_contract);
				enter(driver);
			}
			
			if (!lessor.equals("")) {
				waitForElement(driver, Lessor_Btn); 
				click(driver, Lessor_Btn);
				twoColumnSearchWindow(driver, lessorSearch_Filter, condition, lessor);

			} 

			if (!lessee.equals("")) {
				waitForElement(driver, Lessee_Search_Btn); 
				click(driver, Lessee_Search_Btn);
				twoColumnSearchWindow(driver, lesseeSearch_Filter, condition, lessee);

			} 
			if(!carrierSeal.equals("")) {
				waitForElement(driver, carrier_Seal);
				click(driver, carrier_Seal);
				waitForElement(driver, carrier_Seal);
				clear(driver, carrier_Seal);
				
				waitForElement(driver, carrier_Seal);
				sendKeys(driver, carrier_Seal, carrierSeal);
				enter(driver);
			}
			if(!oh.equals("")) {
				waitForElement(driver, oh_SNTS);
				click(driver, oh_SNTS);
				waitForElement(driver, oh_SNTS);
				clear(driver, oh_SNTS);
				
				waitForElement(driver, oh_SNTS);
				sendKeys(driver, oh_SNTS, oh);
				enter(driver);
			}
			
			if(!ol.equals("")) {
				waitForElement(driver, ol_textfield);
				click(driver, ol_textfield);
				waitForElement(driver, ol_textfield);
				clear(driver, ol_textfield);
				
				waitForElement(driver, ol_textfield);
				sendKeys(driver, ol_textfield, ol);
				enter(driver);
			}
			
			
			
			if(!ow.equals("")) {
				waitForElement(driver, ow_textfield);
				click(driver, ow_textfield);
				waitForElement(driver, ow_textfield);
				clear(driver, ow_textfield);
				
				waitForElement(driver, ow_textfield);
				sendKeys(driver, ow_textfield, ow);
				enter(driver);
			}
			

			if(!por_Input.equals("")) {
				waitForElement(driver, por_Searchfield);
				click(driver, por_Searchfield);
				waitForElement(driver, por_Searchfield);
				clear(driver, por_Searchfield);
				
				waitForElement(driver, por_Searchfield);
				sendKeys(driver, por_Searchfield, por_Input);
				enter(driver);
			}
			if(!pol_Input.equals("")) {
				waitForElement(driver, polSearchfield);
				click(driver, polSearchfield);
				waitForElement(driver, polSearchfield);
				clear(driver, polSearchfield);
				
				waitForElement(driver, polSearchfield);
				sendKeys(driver, polSearchfield, pol_Input);
				enter(driver);
			}
			
			if(!pod_Input.equals("")) {
				waitForElement(driver, podSearchfield);
				click(driver, podSearchfield);
				waitForElement(driver, podSearchfield);
				clear(driver, podSearchfield);
				
				waitForElement(driver, podSearchfield);
				sendKeys(driver, podSearchfield, pod_Input);
				enter(driver);
			}
			if(!dest.equals("")) {
				waitForElement(driver, destSearchfield);
				click(driver, destSearchfield);
				waitForElement(driver, destSearchfield);
				clear(driver, destSearchfield);
				
				waitForElement(driver, destSearchfield);
				sendKeys(driver, destSearchfield, dest);
				enter(driver);
			}
			
			if(!grossWeight.equals("")) {
				waitForElement(driver, grossWeight_Textfield);
				click(driver, grossWeight_Textfield);
				waitForElement(driver, grossWeight_Textfield);
				clear(driver, grossWeight_Textfield);
				
				waitForElement(driver, grossWeight_Textfield);
				sendKeys(driver, grossWeight_Textfield, grossWeight);
				enter(driver);
			}
			

			if(!owAmount.equals("")) {
				waitForElement(driver, OW_amount);
				click(driver, OW_amount);
				waitForElement(driver, OW_amount);
				clear(driver, OW_amount);
				
				waitForElement(driver, OW_amount);
				sendKeys(driver, OW_amount, owAmount);
				enter(driver);
			}
			
			if (!ow_Ind.equals("")) {
				waitForElement(driver, ow_Ind_Dropdown);
				click(driver, ow_Ind_Dropdown);
				String select_owInd =  String.format(select_woi,ow_Ind);
				waitForElement(driver, select_owInd);
				click(driver, select_owInd);
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
			if(!imo.equals("")) {
				waitForElement(driver, imo_Textfield);
				click(driver, imo_Textfield);
				waitForElement(driver, imo_Textfield);
				clear(driver, imo_Textfield);
				
				waitForElement(driver, imo_Textfield);
				sendKeys(driver, imo_Textfield, imo);
				enter(driver);
			}
			
			if(!payLoad.equals("")) {
				waitForElement(driver, payLoad_Textfield);
				click(driver, payLoad_Textfield);
				waitForElement(driver, payLoad_Textfield);
				clear(driver, payLoad_Textfield);
				
				waitForElement(driver, payLoad_Textfield);
				sendKeys(driver, payLoad_Textfield, payLoad);
				enter(driver);
			}
			if(!tareWeight.equals("")) {
				waitForElement(driver, tare_Textfield);
				click(driver, tare_Textfield);
				waitForElement(driver, tare_Textfield);
				clear(driver, tare_Textfield);
				
				waitForElement(driver, tare_Textfield);
				sendKeys(driver, tare_Textfield, tareWeight);
				enter(driver);
			}
			
			if(!haulage.equals("")) {
				waitForElement(driver, haulageTextfield);
				click(driver, haulageTextfield);
				waitForElement(driver, haulageTextfield);
				clear(driver, haulageTextfield);
				
				waitForElement(driver, haulageTextfield);
				sendKeys(driver, haulageTextfield, haulage);
				enter(driver);
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
			if(!shipperSeal.equals("")) {
				waitForElement(driver, shipper_Seal);
				click(driver, shipper_Seal);
				waitForElement(driver, shipper_Seal);
				clear(driver, shipper_Seal);
				
				waitForElement(driver, shipper_Seal);
				sendKeys(driver, shipper_Seal, shipperSeal);
				enter(driver);
			}
			
			if(!haulier.equals("")) {
				waitForElement(driver, haulierTextfield);
				click(driver, haulierTextfield);
				waitForElement(driver, haulierTextfield);
				clear(driver, haulierTextfield);
				
				waitForElement(driver, haulierTextfield);
				sendKeys(driver, haulierTextfield, haulier);
				enter(driver);
			}
			
			if (!thirtyTon.equals("")) {
				waitForElement(driver, thirtyTon_Dropdown);
				click(driver, thirtyTon_Dropdown);
				String select_Don =  String.format(select_do,thirtyTon);
				waitForElement(driver, select_Don);
				click(driver, select_Don);
			}
			
			if(!remarks_Input.equals("")) {
				waitForElement(driver, remarksTextfield);
				click(driver, remarksTextfield);
				waitForElement(driver, remarksTextfield);
				clear(driver, remarksTextfield);
				
				waitForElement(driver, remarksTextfield);
				sendKeys(driver, remarksTextfield, remarks_Input);
				enter(driver);
			}
			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);
			
			Step_End(1, "Ensure that system should allow user to enter valid container no in movement entry", test, test1);
			Step_Start(2, "Ensure that system should validate as 'INVALID PREV LOCATIONAL ACTIVITY PLACE OR DEPOT", test, test1);
			waitForElement(driver, errorRecordsFrame_L);
			if (isDisplayed(driver, errorRecordsFrame_L)) {
				
				String actualInvalidPrevLocError=getText(driver, error_Description_1);
								
				if(actualInvalidPrevLocError.equals(invalidPrevLocError)) {
					System.out.println("Matched || " + " Expected Value is : " + invalidPrevLocError + " || Actual Value is : " + actualInvalidPrevLocError);
					Extent_pass(driver,"Matched || " + " Expected Value is : " + invalidPrevLocError + " || ActualValue is : " + actualInvalidPrevLocError,test,test1);
					click(driver, okButtonErrorFrame_L);	
				}else {
					System.out.println("Not matched || " + " Expected Value is : " + invalidPrevLocError + " || Actual Value  is : " + actualInvalidPrevLocError);
					Extent_fail(driver,"Not matched || " + " Expected Value is : " + invalidPrevLocError + " || Actual Value is : " + actualInvalidPrevLocError,test,test1);
				}			
				Step_End(2, "Ensure that system should validate as 'INVALID PREV LOCATIONAL ACTIVITY PLACE OR DEPOT", test, test1);
			}	
			Extent_completed(testcase_Name, test, test1);
			
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
				
		}
		
		int ts45=45;
		
		if(ts45==45) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS045";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			
			String moduleName = data.get("ModuleMovementEntry");
			String location45 = data.get("Location");
			String eqpNumLODF = data.get("EqpNumLODF");
			String lodfActivity = data.get("LodfActivity");
			String activityPlacePOLSameError = data.get("ActivityPlacePOLSameError");
			String activityDateSingle45 = data.get("activityDateSingle45");
			String datePicker = data.get("datePicker");
			String activityTime_Input1 = data.get("activityTime_Input1");

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
			String POD_data = data.get("POD_data");
			String OW_ind_data = data.get("OW_ind_data");
			String IMO_data = data.get("IMO_data");
			String OW_data = data.get("OW_data");
			String temp_data = data.get("temp_data");
			String POR_data = data.get("POR_data");
			String Ship_seal_data = data.get("Ship_seal_data");
			String delivery_data = data.get("delivery_data");
			

			Extent_Start(testcase_Name, test, test1);
			
			// To validate if user give POL & Activity Place not matched for LODF move

			//Module Search
			moduleNavigate(driver, moduleName);

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
				waitForElement(driver, equipmentNoSearchField_L);
				sendKeys(driver, equipmentNoSearchField_L, eqpNumLODF);
				waitForElement(driver, activitySearchFieldInSingle_L);
				sendKeys(driver, activitySearchFieldInSingle_L, lodfActivity);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				
				if (!activityDateSingle45.equals("")) {
					waitForElement(driver, activeDateInSingle_L);
					
					if(datePicker.equalsIgnoreCase("Yes")) {
						selectDatePicker(driver, activeDateInSingle_L, activityDateSingle45);
		
							
					}else {
						click(driver, activeDateInSingle_L);

						if(activityDateSingle45.contains("-")) {
							String activityDateSingle_45=activityDateSingle45.replace("-", "/");
							clear(driver,activeDateInSingle_L);
							sendKeys(driver, activeDateInSingle_L, activityDateSingle_45);
							
						}else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle45);
						
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

			Step_Start(1, "Ensure that system should validate if user enter incorrect POL & click save after providing all mandatory fields", test, test1);
			waitForElement(driver, pol_Searchfield);
			click(driver, pol_Searchfield);
			clear(driver, pol_Searchfield);
			sendKeys(driver, pol_Searchfield, location45);
			enter(driver);
			Step_End(1, "Ensure that system should validate if user enter incorrect POL & click save after providing all mandatory fields", test, test1);

			
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
			
			scrollTop(driver);
			waitForElement(driver, saveButtonMoveEnt_L);
			click(driver, saveButtonMoveEnt_L);

			Step_Start(2, "Ensure that system should validate as 'Activity Place and POL should be same'", test, test1);

		waitForDisplay(driver, errorRecordsFrame_L);
				String actualActivityPlacePOLSameError = getText(driver, activityPlace_Pol_Same_Error);

				if (actualActivityPlacePOLSameError.equals(activityPlacePOLSameError)) {
					System.out.println("Matched || " + " Expected Value is : " + activityPlacePOLSameError
							+ " || Actual Value is : " + actualActivityPlacePOLSameError);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + activityPlacePOLSameError
							+ " || ActualValue is : " + actualActivityPlacePOLSameError, test, test1);
					Extent_pass(driver, activityPlacePOLSameError + " Error is displayed", test, test1);
					System.out.println(activityPlacePOLSameError + " Error is displayed");
				} else {
					System.out.println("Not matched || " + " Expected Value is : " + activityPlacePOLSameError
							+ " || Actual Value  is : " + actualActivityPlacePOLSameError);
					Extent_fail(driver, "Not matched || " + " Expected Value is : " + activityPlacePOLSameError
							+ " || Actual Value is : " + actualActivityPlacePOLSameError, test, test1);
					Extent_fail(driver, activityPlacePOLSameError + " Error is not displayed", test, test1);
					
					System.out.println(activityPlacePOLSameError + " Error is not displayed");
				}

				click(driver, okButtonErrorFrame_L);
				Step_End(2, "Ensure that system should validate as 'Activity Place and POL should be same'", test, test1);
				Extent_completed(testcase_Name, test, test1);
			
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
			
		}
		
		
		int ts46=46;
		if(ts46==46) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS046";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			
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
					
			

			Extent_Start(testcase_Name, test, test1);

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

				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
			
		}
		
		int ts47=47;
		if(ts47==47) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS047";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			String moduleName = data.get("ModuleMovementEntry");
			String eqpNumLODF47 = data.get("EqpNumLODF");
			String lodfActivity47 = data.get("LodfActivity");
			String containerNotAvailableError = data.get("ContainerNotAvailableError");
			String activityDateSingle47 = data.get("activityDateSingle47");
			String datePicker = data.get("datePicker");
			String activityTime_Input1 = data.get("activityTime_Input1");
			String voyNo = data.get("Voyage");
			String bookNo = data.get("BookNumber");
			
			//NM
					String location_data = data.get("location_data");
					String terminal_data = data.get("terminal_data");
					String service_data = data.get("service_data");
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


			// To validate if user try to save LODF move without container back update

					//Module Search
					moduleNavigate(driver, moduleName);

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
				sendKeys(driver, equipmentNoSearchField_L, eqpNumLODF47);
				waitForElement(driver, activitySearchFieldInSingle_L);
				sendKeys(driver, activitySearchFieldInSingle_L, lodfActivity47);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				if (!activityDateSingle47.equals("")) {
					waitForElement(driver, activeDateInSingle_L);
					
					
					if(datePicker.equalsIgnoreCase("Yes")) {
						selectDatePicker(driver, activeDateInSingle_L, activityDateSingle47);

							
							
					}else {
						click(driver, activeDateInSingle_L);

						if(activityDateSingle47.contains("-")) {
							String activityDateSingle_47=activityDateSingle47.replace("-", "/");
							clear(driver,activeDateInSingle_L);
							sendKeys(driver, activeDateInSingle_L, activityDateSingle_47);
							
						}else {
						clearAndType(driver, activeDateInSingle_L, activityDateSingle47);
						
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

			waitForElement(driver, bookingNo_SearchButton);
			click(driver, bookingNo_SearchButton);
			waitForElement(driver, bookingNo_Search);
			click(driver, bookingNo_Search);
			sendKeys(driver, bookingNo_Search, bookNo);
			boolean vis = false;
			while (vis == false) {
				if (isDisplayed(driver, voyage_Search)) {
					waitForElement(driver, voyage_Search);
					click(driver, voyage_Search);
					sendKeys(driver, voyage_Search, voyNo);
					
					String retievedBookingNo =  String.format(twoColumnSearch_Value,voyNo); 
					waitForElement(driver, retievedBookingNo);
					click(driver, retievedBookingNo);
					click(driver, twoColumnSearch_Select_Button);
					vis = true;
				} else {
					horizontalscroll(driver, searchBookNo_Scrollbar, 1000);
				}
			}

			waitForElement(driver, showInputFieldFrame_L);
			if (isDisplayed(driver, showInputFieldFrame_L)) {
				Extent_pass(driver, "Show input field frame is displayed", test, test1);
				System.out.println("Show input field frame is displayed");
			} else {
				Extent_fail(driver, "Show input field frame is not displayed", test, test1);
				System.out.println("Show input field frame is not displayed");
				
			}

			if(!location_data.equals("")) {
				waitForElement(driver, P_Location_Txt_Field);
				clearAndType(driver, P_Location_Txt_Field,location_data);
			}
			
			if(!terminal_data.equals("")) {
				waitForElement(driver, P_Terminal_Txt_Field);
				clearAndType(driver, P_Terminal_Txt_Field,terminal_data);
			}
			
			
			if(!service_data.equals("")) {
				waitForElement(driver, P_Service_Txt_Field);
				clearAndType(driver, P_Service_Txt_Field,service_data);
			}
			
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

			waitForDisplay(driver, errorRecordsFrame_L);

				String actualContainerNotAvailError = getText(driver, container_Not_Available_Error);

				if (actualContainerNotAvailError.equals(containerNotAvailableError)) {
					System.out.println("Matched || " + " Expected Value is : " + containerNotAvailableError
							+ " || Actual Value is : " + actualContainerNotAvailError);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + containerNotAvailableError
							+ " || ActualValue is : " + actualContainerNotAvailError, test, test1);
					Extent_pass(driver, containerNotAvailableError + " Error is displayed", test, test1);
					System.out.println(containerNotAvailableError + " Error is displayed");
				} else {
					System.out.println("Not matched || " + " Expected Value is : " + containerNotAvailableError
							+ " || Actual Value  is : " + actualContainerNotAvailError);
					Extent_fail(driver, "Not matched || " + " Expected Value is : " + containerNotAvailableError
							+ " || Actual Value is : " + actualContainerNotAvailError, test, test1);
					Extent_fail(driver, containerNotAvailableError + " Error is not displayed", test, test1);
					
					System.out.println(containerNotAvailableError + " Error is not displayed");
				}

				click(driver, okButtonErrorFrame_L);
				
			
				Extent_completed(testcase_Name, test, test1);

				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
		
		}
		
		int ts48=48;
		if(ts48==48) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS048";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);

			String moduleName = data.get("ModuleMovementEntry");
			String equipmentNum48 = data.get("EquipmentNum");
			String location48 = data.get("Location");
			String terminal48 = data.get("Terminal");
			String releaseReferenceNumber48 = data.get("ReleaseReferenceNumber");
			String activitySearch48 = data.get("Activity");
			String futureActivityDateError = data.get("FutureActivityDateError");
			String activityDateSingle48 = data.get("ActivityDate");
			String activityTime_Input1 = data.get("ActivityTime");
			String datePicker = data.get("DatePicker");
			String sizeType48 = data.get("SizeType");

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
			
			String lesseeSearch_Filter=data.get("LesseeSearch_Filter");
			String lessorSearch_Filter=data.get("LessorSearch_Filter");
			String condition=data.get("Condition");
			

			Extent_Start(testcase_Name, test, test1);
			
			// To validate if user try to save move in future date

					//Module Search
					moduleNavigate(driver, moduleName);

			// Movement Entry
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {

				Extent_pass(driver, "Movement Entry Page is displayed", test, test1);
			} else {
				System.out.println("Movement Entry Page is not displayed");
				Extent_fail(driver, "Movement Entry Page is not displayed", test, test1);

			}
			Step_Start(1, "Enter all mandatory field & click save by giving activity date in future for any move", test, test1);
			// Single Entry Equipment
			waitForElement(driver, singleEntryMovPage_L);
			if (isDisplayed(driver, singleEntryMovPage_L)) {
				Extent_pass(driver, "Single Equipment Entry page is displayed", test, test1);
				waitForElement(driver, equipmentNoSearchField_L);
				sendKeys(driver, equipmentNoSearchField_L, equipmentNum48);
				waitForElement(driver, activitySearchFieldInSingle_L);
				sendKeys(driver, activitySearchFieldInSingle_L, activitySearch48);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, activeDateInSingle_L);
				click(driver, activeDateInSingle_L);

				Extent_call(test, test1, "Entering the Date & Time period");
				if (!activityDateSingle48.equals("")) {
					waitForElement(driver, activeDateInSingle_L);


					if(datePicker.equalsIgnoreCase("Yes")) {
						selectDatePicker(driver, activeDateInSingle_L, activityDateSingle48);


						}else {
							click(driver, activeDateInSingle_L);

							if(activityDateSingle48.contains("-")) {
								String activityDateSingle48_1=activityDateSingle48.replace("-", "/");

								clearAndType(driver, activeDateInSingle_L, activityDateSingle48_1);

							}else {
								clearAndType(driver, activeDateInSingle_L, activityDateSingle48);

							}		
						}
				}

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

				waitForElement(driver, popup_Message);
				String wantToApplyPopup7 = getText(driver, popup_Message);
				if (isDisplayed(driver, popup_Message)) {
					Extent_pass(driver, wantToApplyPopup7 + " popup is displayed", test, test1);
					System.out.println(wantToApplyPopup7 + " popup is displayed");
					click(driver, popup_Message_Yes_Button);
					waitForElement(driver, showInputFieldFrame_L);
					if (isDisplayed(driver, showInputFieldFrame_L)) {
						Extent_pass(driver, "Show input field frame is displayed", test, test1);
						System.out.println("Show input field frame is displayed");
					} else {
						System.out.println("Show input field frame is not displayed");
						Extent_fail(driver, "Show input field frame is not displayed", test, test1);


					}
				} else {
					System.out.println(wantToApplyPopup7 + " popup is not displayed");
					Extent_fail(driver, wantToApplyPopup7 + " popup is not displayed", test, test1);


				}

				waitForElement(driver, showInputFieldFrame_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test, test1);
				} else {
					System.out.println( "Show input field frame is not displayed");
					Extent_fail(driver, "Show input field frame is not displayed", test, test1);

				}
				waitForElement(driver, locationSaerchField_L);
				click(driver, locationSaerchField_L);
				waitForElement(driver, locationSaerchField_L);
				clear(driver, locationSaerchField_L);

				waitForElement(driver, locationSaerchField_L);
				sendKeys(driver, locationSaerchField_L, location48);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, termDepotSearchField_L);
				waitForElement(driver, termDepotSearchField_L);
				click(driver, termDepotSearchField_L);
				waitForElement(driver, termDepotSearchField_L);
				clear(driver, termDepotSearchField_L);
				waitForElement(driver, termDepotSearchField_L);
				sendKeys(driver, termDepotSearchField_L, terminal48);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				///// Non mandatory fields

				waitForElement(driver, relRefNoTextField_L);
				click(driver, relRefNoTextField_L);
				waitForElement(driver, relRefNoTextField_L);
				clearAndType(driver, relRefNoTextField_L, releaseReferenceNumber48);


				waitForElement(driver, sizeTypeDropDown_L);
				click(driver, sizeTypeDropDown_L);
				waitForElement(driver, sizeType_Searchfield);
				click(driver, sizeType_Searchfield);
				waitForElement(driver, sizeType_Searchfield);
				sendKeys(driver, sizeType_Searchfield, sizeType48);
				enter(driver);


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
					String select_ShipperOwned =  String.format(select_shipper,shipperOwnedSingle);

					waitForElement(driver, select_ShipperOwned);
					click(driver, select_ShipperOwned);

				} 

				if (!leaseKindSingle.equals("")) {
					waitForElement(driver, leaseKind_Dropdown); 
					click(driver, leaseKind_Dropdown);
					String select_LeaseKind =  String.format(lease_king,leaseKindSingle);
					waitForElement(driver, select_LeaseKind);
					click(driver, select_LeaseKind);

				} 


				if (!lessorSingle.equals("")) {
					waitForElement(driver, Lessor_Btn); 
					click(driver, Lessor_Btn);
					twoColumnSearchWindow(driver, lessorSearch_Filter, condition, lessorSingle);

				} 

				if (!lesseeSingle.equals("")) {
					waitForElement(driver, Lessee_Search_Btn); 
					click(driver, Lessee_Search_Btn);
					twoColumnSearchWindow(driver, lesseeSearch_Filter, condition, lesseeSingle);

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
					waitForElement(driver, Manufacture_Date);

					if(datePicker.equalsIgnoreCase("Yes")) {
						selectDatePicker(driver, Manufacture_Date, manufactureDateSingle);

					}else {
						click(driver, Manufacture_Date);

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
					String select_Don = String.format(select_do, thirtyTonSingle);
					waitForElement(driver, select_Don);
					click(driver, select_Don);
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

				scrollTop(driver);
				waitForElement(driver, saveButtonMoveEnt_L);
				click(driver, saveButtonMoveEnt_L);
			}


			Step_End(1, "Enter all mandatory field & click save by giving activity date in future for any move", test, test1);
			Step_Start(2, "Ensure that system should validate as 'Activity Date cannot be in future date'.", test, test1);	
			waitForElement(driver, errorRecordsFrame_L);
				String actualFutureDateError = getText(driver, futureDate_Error);

				if (actualFutureDateError.equals(futureActivityDateError)) {
					System.out.println("Matched || " + " Expected Value is : " + futureActivityDateError
							+ " || Actual Value is : " + actualFutureDateError);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + futureActivityDateError
							+ " || ActualValue is : " + actualFutureDateError, test, test1);
					Extent_pass(driver, futureActivityDateError + " Error is displayed", test, test1);
					System.out.println(futureActivityDateError + " Error is displayed");
					click(driver, okButtonErrorFrame_L);
				} else {
					System.out.println("Not matched || " + " Expected Value is : " + futureActivityDateError
							+ " || Actual Value  is : " + actualFutureDateError);
					Extent_fail(driver, "Not matched || " + " Expected Value is : " + futureActivityDateError
							+ " || Actual Value is : " + actualFutureDateError, test, test1);
					Extent_fail(driver, futureActivityDateError + " Error is not displayed", test, test1);

					System.out.println(futureActivityDateError + " Error is not displayed");
				}
				Step_End(2, "Ensure that system should validate as 'Activity Date cannot be in future date'.", test, test1);
				Extent_completed(testcase_Name, test, test1);
				
				waitForElement(driver, close_Tab);
				click(driver, close_Tab);
			
			
		}
		
		int ts49=49;
		if(ts49==49) {
			
			String testcase_Name = "TC_Movement_Entry_Integration_TS049";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			
			
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
					

					Extent_Start(testcase_Name, test, test1);

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
			
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
		}
		
		int ts50=50;
		if(ts50==50) {

			String testcase_Name = "TC_Movement_Entry_Integration_TS050";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
			String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
			System.out.println(Sheet_Name);
			Map<String, String> data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset, File_Path);
			
			String moduleName = data.get("ModuleMovementEntry");
			String Activity_Move_Txt2 = data.get("Activity_Move");
			String Location_Input_Txt2 = data.get("Location_Input");
			String Terminal_Input_Txt2 = data.get("Terminal_Input");
			String BookinNo_Input_Txt2 = data.get("BookinNo_Input");
			String Service_Input_Txt2 = data.get("Service_Input");
			String Bound_Input_Txt2 = data.get("Bound_Input");
			String POL_input_Txt2 = data.get("POL_input");
			String POD_Input_Txt2 = data.get("POD_Input");
			String Dest_Input_Txt2 = data.get("Dest_Input");
			String Equip_Number_Txt2 = data.get("Equip_Number");
			String Invalid_Service_Exp = data.get("Invalid_Service");
			String activityDateSingle50 = data.get("activityDateSingle50");
			String activityTime_Input1 = data.get("activityTime_Input1");
			String datePicker = data.get("datePicker");
			
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

			// To validate if user try to save invalid service in LODF
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
				sendKeys(driver, activitySearchField_L, Activity_Move_Txt2);
				waitForElement(driver, autoCompleteValue);
				enter(driver);

				
				if (!activityDateSingle50.equals("")) {
					waitForElement(driver, MultiActivity_Date);

					if(datePicker.equalsIgnoreCase("Yes")) {
						Extent_call(test, test1, "Entering the date,month & year");
						selectDatePicker(driver, MultiActivity_Date, activityDateSingle50);
							
					}else {
						click(driver, MultiActivity_Date);

						if(activityDateSingle50.contains("-")) {
							String activityDateSingle50_1=activityDateSingle50.replace("-", "/");
							clear(driver,MultiActivity_Date);
							sendKeys(driver, MultiActivity_Date, activityDateSingle50_1);
							
						}else {
						clearAndType(driver, MultiActivity_Date, activityDateSingle50);
						
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
	Step_Start(2, " Ensure that system should validate if user try save LODF move with all valid details & given invalid service", test, test1);
				waitForElement(driver, P_Location_Txt_Field);
				click(driver, P_Location_Txt_Field);
				sendKeys(driver, P_Location_Txt_Field, Location_Input_Txt2);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, P_Terminal_Txt_Field);
				click(driver, P_Terminal_Txt_Field);
				sendKeys(driver, P_Terminal_Txt_Field, Terminal_Input_Txt2);
				waitForElement(driver, autoCompleteValue);
				enter(driver);
				waitForElement(driver, P_BookingNO_Txt_Field);
				click(driver, P_BookingNO_Txt_Field);
				sendKeys(driver, P_BookingNO_Txt_Field, BookinNo_Input_Txt2);
				enter(driver);
				
				Extent_call(test, test1, "****Giving invalid service data****");
				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);
				sendKeys(driver, P_Service_Txt_Field, Service_Input_Txt2);
				
				enter(driver);
				waitForElement(driver, P_Bound_Txt_Field);
				click(driver, P_Bound_Txt_Field);
				clear(driver, P_Bound_Txt_Field);
				enter(driver);
				sendKeys(driver, P_Bound_Txt_Field, Bound_Input_Txt2);
				enter(driver);
				waitForElement(driver, P_POL_Txt_Field);
				click(driver, P_POL_Txt_Field);
				sendKeys(driver, P_POL_Txt_Field, POL_input_Txt2);
				enter(driver);
				waitForElement(driver, P_POD_Txt_Field);
				click(driver, P_POD_Txt_Field);
				sendKeys(driver, P_POD_Txt_Field, POD_Input_Txt2);
				enter(driver);
				waitForElement(driver, P_Dest_Txt_Field);
				click(driver, P_Dest_Txt_Field);
				sendKeys(driver, P_Dest_Txt_Field, Dest_Input_Txt2);
				enter(driver);
				waitForElement(driver, P_Service_Txt_Field);
				clear(driver, P_Service_Txt_Field);
				waitForElement(driver, P_Service_Txt_Field);
				click(driver, P_Service_Txt_Field);
				sendKeys(driver, P_Service_Txt_Field, Service_Input_Txt2);
				

				waitForElement(driver, P_Vessel_Txt_Field);
				click(driver, P_Vessel_Txt_Field);
				
				clear(driver, P_Vessel_Txt_Field);
				
				sendKeys(driver, P_Vessel_Txt_Field, POD_Input_Txt2);
				enter(driver);
				
				waitForElement(driver, P_Voyage_Txt_Field);
				click(driver, P_Voyage_Txt_Field);
				
				clear(driver, P_Voyage_Txt_Field);
				
				sendKeys(driver, P_Voyage_Txt_Field, Dest_Input_Txt2);
				enter(driver);
				waitForElement(driver, P_Bound_Txt_Field);

				clear(driver, P_Bound_Txt_Field);
				
				sendKeys(driver, P_Bound_Txt_Field, Bound_Input_Txt2);
				enter(driver);
	Step_End(2, " Ensure that system should validate if user try save LODF move with all valid details & given invalid service", test, test1);

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
				
				sendKeys(driver, eqpNum_Inputfield, Equip_Number_Txt2);
				
				scrollTop(driver);
				waitForElement(driver, saveButtonMoveEnt_L);
				click(driver, saveButtonMoveEnt_L);
				
				waitForDisplay(driver, forcebtn);
				if(isdisplayed(driver, forcebtn)) {
					click(driver, forcebtn);
				}
				

				Step_Start(3, "Ensure that system should validate as 'Invalid Service'.", test, test1);
				waitForElement(driver, P_Invalid_Service_Popup);
				String service_Popup = getText(driver, P_Invalid_Service_Popup);
				if (Invalid_Service_Exp.equals(service_Popup)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + Invalid_Service_Exp
							+ " || Actual Report Activity is : " + service_Popup);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Invalid_Service_Exp
							+ " || Actual Report Activity is : " + service_Popup, test, test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + Invalid_Service_Exp
							+ " || Actual Report Activity is : " + service_Popup);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Invalid_Service_Exp
							+ " || Actual Report Activity is : " + service_Popup, test, test1);
					
				}
				Step_End(3, "Ensure that system should validate as 'Invalid Service'.", test, test1);

				click(driver, P_Ok_Btn);

			}
			Extent_completed(testcase_Name, test, test1);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			
			
		}
		
	}

}
