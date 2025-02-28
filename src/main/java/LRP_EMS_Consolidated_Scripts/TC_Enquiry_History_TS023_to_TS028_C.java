package LRP_EMS_Consolidated_Scripts;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.EMS_Locators;

public class TC_Enquiry_History_TS023_to_TS028_C extends Keywords {

	public void Enquiry_History_TS023_to_TS028_C(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		int j=1;
		if(j==1) {
			String testCase_Name="TC_Enquiry_History_TS023";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String url = TestNgXml.getdatafromExecution().get(testCase_Name);
			String Sheet_Name_023 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);

			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_023, testCase_Name,"Dataset" + selected_dataset, File_Path);
			String user_Name = Excel_data.get("Userid");
			String pass_word = Excel_data.get("PassWord");
			String Field_Names = Excel_data.get("field_name");
			String equipmentNo_TxtField_Input = Excel_data.get("EquipmentNo_TxtField_Input");
			String Container_Type_Radio_Button = Excel_data.get("Container_Type_Radio_Button");
			String Show_Delete_Chk_Box = Excel_data.get("Show_Delete_Chk_Box");
			String Show_Suppress_Chk_Box = Excel_data.get("Show_Suppress_Chk_Box");
			String Show_Top_Chk_Box = Excel_data.get("Show_Top_Chk_Box");
			String Multi_Top_Chk_Box = Excel_data.get("Multi_Top_Chk_Box");
			String Show_Top_Input = Excel_data.get("Show_Top_Input");
			String equipmentType_Input = Excel_data.get("equipmentType_Input");
			String Multi_Select_Inputs = Excel_data.get("Multi_Select_Inputs");
			String Condition =Excel_data.get("Condition");
			String Filter_Option =Excel_data.get("Filter_Option");
			String two_Column_Search_Header =Excel_data.get("two_Column_Search_Header");
			//Locators
			String Equip_Type_Select = String.format(EMS_Locators.Equip_Type_Select,  equipmentType_Input); 
			String Radio_Btn_Select = String.format(EMS_Locators.Radio_Btn_Select,  Container_Type_Radio_Button);

			Extent_Start(testCase_Name, test, test1);
			navigateUrl(driver, url);
			LRP_Login(driver, user_Name, pass_word);
			// Enter Enquiry History model
			Extent_call(test, test1, "Enter module name in searchbox & click the module");
			moduleNavigate(driver, Field_Names);
			waitForElement(driver, P_enquiryHistory_Page);
			if (isDisplayed(driver, P_enquiryHistory_Page)) {
				System.out.println("*****Enquiry History Module is Dispalyed*****");
				Extent_pass(driver, "*****Enquiry History Module is Dispalyed*****", test, test1);
			} else {
				System.out.println("*****Enquiry History Module is not Dispalyed");
				Extent_fail(driver, "*****Enquiry History Module is not Dispalyed*****", test, test1);
			}
			waitForElement(driver, Equip_Type_DD);
			safeclick(driver, Equip_Type_DD);
			waitForElement(driver, Equip_Type_Select);
			safeclick(driver, Equip_Type_Select);
			Step_Start(1, "Select Equipment no radio button option to proceed further", test, test1);
			// select Equipment radio button
			waitForElement(driver, Radio_Btn_Select);
			safeclick(driver, Radio_Btn_Select);
			Step_End(1, "Select Equipment no radio button option to proceed further", test, test1);
			waitForElement(driver, P_equip_MultiSelect_CheckBox);
			checkBox(driver, P_equip_MultiSelect_CheckBox, Multi_Top_Chk_Box);
			Step_Start(2, "Enter required container no for Equipment no field", test, test1);
			if (Multi_Top_Chk_Box.equalsIgnoreCase("YES")) {
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				for (String Multi_Sel_Value : Multi_Sel_Values) {
					waitForElement(driver, P_equipment_TxtField);
					safeclick(driver, P_equipment_TxtField);
					sendKeys(driver, P_equipment_TxtField, Multi_Sel_Value);
					waitForElement(driver, P_equipment_SearchIcon);
					safeclick(driver, P_equipment_SearchIcon);
					twoColumnSearchWindow(driver,two_Column_Search_Header,Condition, Multi_Sel_Value);
				}
			} else {
				waitForElement(driver, P_equipment_TxtField);
				safeclick(driver, P_equipment_TxtField);
				sendKeys(driver, P_equipment_TxtField, equipmentNo_TxtField_Input);
				waitForElement(driver, P_equipment_SearchIcon);
				safeclick(driver, P_equipment_SearchIcon);
				twoColumnSearchWindow(driver,two_Column_Search_Header,Condition,equipmentNo_TxtField_Input);
			}
			Step_End(2, "Enter required container no for Equipment no field", test, test1);
			waitForElement(driver, P_show_DltRec_ChkBox);
			checkBox(driver, P_show_DltRec_ChkBox, Show_Delete_Chk_Box);
			waitForElement(driver, P_suppressAct_CheckBox);
			checkBox(driver, P_suppressAct_CheckBox, Show_Suppress_Chk_Box);
			waitForElement(driver, P_Show_Top_CheckBox);
			checkBox(driver, P_Show_Top_CheckBox, Show_Top_Chk_Box);
			if (Show_Top_Chk_Box.equalsIgnoreCase("YES")) {
				waitForElement(driver, P_Show_Top_Field);
				clearAndType(driver, P_Show_Top_Field, Show_Top_Input);
			}
			Step_Start(3, "click show button to get all movement details", test, test1);
			// safeclick show button
			waitForElement(driver, P_show_Btn);
			safeclick(driver, P_show_Btn);
			Step_End(3, "click show button to get all movement details", test, test1);
			Step_Start(4, "movement detail should shown in grid based on Equipment no", test, test1);

			if (Multi_Top_Chk_Box.equalsIgnoreCase("YES")) {
				List<WebElement> total_Values_Grid =listOfElements(driver, Equipment_Number);
				int Grid_Size = total_Values_Grid.size();
				int i = 1;
				// check the movement details
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				int total_Input_Size = Multi_Sel_Values.size();
				for (String Multi_Sel_Value : Multi_Sel_Values) {
					String movement =  String.format(EMS_Locators.movement_Value,i); 
					waitForElement(driver, P_movement_Code);
					String movementDetail = getText(driver, movement);
					if (Grid_Size == total_Input_Size) {
						if (Multi_Sel_Value.equalsIgnoreCase(movementDetail)) {
							System.out.println("Matched || " + " Expected Report Activity is : " + Multi_Sel_Value+ " || Actual Report Activity is : " + movementDetail);
							Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Multi_Sel_Value+ " || Actual Report Activity is : " + movementDetail, test, test1);
						} else {
							System.out.println("Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value+ " || Actual Report Activity is : " + movementDetail);
							Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value+ " || Actual Report Activity is : " + movementDetail, test, test1);
						}
						i++;
					} else {
						System.out.println("***********All the values are not getting the grid***********");
						Extent_fail(driver, "***********All the values are not getting the grid***********", test,test1);
					}
				}
			} else {
				waitForElement(driver, P_Grid_NoOfRetrived);
				String abc=getText(driver, P_Grid_NoOfRetrived);
				System.out.println("abc : "+abc);
				int startIndex=abc.indexOf(':');
				int endIndex=abc.length();
				String numString=abc.substring(startIndex+1, endIndex).trim();
				int numberValue=Integer.parseInt(numString);
				System.out.println("numberValue : "+numberValue);
				int expectednumber =0; 
				for(int i=0;i<=numberValue+numberValue;i++) {
					String movementcode =  String.format(EMS_Locators.Grid_Movement_Codes,i);
					String movement_Code_text = getTextwithoutfail(driver, movementcode);
					if(!movement_Code_text.contains(Filter_Option) && !movement_Code_text.equals("null")) {
						expectednumber++;
					}else if(movement_Code_text.equals("null")) {
						break;
					}
					mouseOverToElement(driver, movementcode);
					click(driver, movementcode);
				}	
				if(expectednumber==numberValue) {
					System.out.println("Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
				}
				// check the movement details
				waitForElement(driver, Tool_Bar_EH);
				click(driver, Tool_Bar_EH);
				waitForElement(driver, Condition_Filter_EH);
				click(driver, Condition_Filter_EH);
				waitForElement(driver, Movement_Filter_EH);
				sendKeys(driver, Movement_Filter_EH,Filter_Option);
				waitForElement(driver, P_equipmentNo_Details);
				String movementDetail = getText(driver, P_equipmentNo_Details);
				if (equipmentNo_TxtField_Input.equalsIgnoreCase(movementDetail)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input+ " || Actual Report Activity is : " + movementDetail);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input+ " || Actual Report Activity is : " + movementDetail, test, test1);
				} else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input+ " || Actual Report Activity is : " + movementDetail);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input+ " || Actual Report Activity is : " + movementDetail, test, test1);
				}

			}
			Step_End(4, "movement detail should shown in grid based on Equipment no", test, test1);
			Extent_completed(testCase_Name, test, test1);
			waitForElement(driver, close_Tab);
			click1(driver, close_Tab);
		}


		if(j==1) {
			String testCase_Name="TC_Enquiry_History_TS024";
			String File_Path_024 = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_024 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_024, testCase_Name, "Dataset"+selected_dataset, File_Path_024);

			String Field_Names = Excel_data.get("field_name");
			String Container_Type_Radio_Button24 = Excel_data.get("Container_Type_Radio_Button");
			String Show_Delete_Chk_Box24 = Excel_data.get("Show_Delete_Chk_Box");
			String Show_Suppress_Chk_Box24 = Excel_data.get("Show_Suppress_Chk_Box");
			String Show_Top_Chk_Box24 = Excel_data.get("Show_Top_Chk_Box");
			String Multi_Select_Chk_Box24 = Excel_data.get("Multi_Top_Chk_Box");
			String Show_Top_Input24 = Excel_data.get("Show_Top_Input");
			String equipmentType_Input24 = Excel_data.get("equipmentType_Input");
			String Multi_Select_Inputs24 = Excel_data.get("Multi_Select_Inputs");
			String booknum = Excel_data.get("booknum");
			String eqpNo =Excel_data.get("EquipmentNumber");
			String savedPopupText=Excel_data.get("SavedPopup");
			String activityDate = Excel_data.get("ActivityDate");
			String sizeType = Excel_data.get("SizeType");
			String activity1 = Excel_data.get("Activity1");
			String location = Excel_data.get("Location");
			String termDepot = Excel_data.get("TermDepot");
			String releaseRefNumber = Excel_data.get("ReleaseRefNumber");
			String activity2 = Excel_data.get("Activity2");
			String movementEntryModule = Excel_data.get("MovementEntryModule");
			String Date_Picker=Excel_data.get("Date_Picker");
			String deletedSingle =Excel_data.get("DeletedSingle");
			String Deleted_HighLighted_Color_Txt = Excel_data.get("DeletedMovement_HighLighted_Color");
			String Condition =Excel_data.get("Condition");
			String Filter_Option =Excel_data.get("Filter_Option");
			String two_Column_Search_Header =Excel_data.get("two_Column_Search_Header");

			Extent_Start(testCase_Name, test, test1);
			//Login	
			// Movement Entry
			Extent_call(test, test1, "Enter Movement Entry in searchbox & safeclick the module");
			moduleNavigate(driver, movementEntryModule);
			waitForElement(driver, movementEntryPage_L);
			if (isDisplayed(driver, movementEntryPage_L)) {
				Extent_pass(driver, "Movement Entry Page is displayed", test,test1);
				System.out.println("Movement Entry Page is displayed");
			} else {
				Extent_fail(driver, "Movement Entry Page is not displayed", test,test1);
				System.out.println("Movement Entry Page is not displayed");
			}

			// Single Entry Equipment
			waitForElement(driver, singleEntryMovPage_L);
			if (isDisplayed(driver, singleEntryMovPage_L)) {
				Extent_pass(driver, "Single Equipment Entry page is displayed", test,test1);
				System.out.println("Single Equipment Entry page is displayed");
				//Create ONHI move	
				Extent_call(test, test1, "Create ONHI Movement Entry");
				waitForElement(driver, equipmentNoSearchField_L);
				Actionsendkeys(driver, equipmentNoSearchField_L, eqpNo);
				waitForElement(driver, activitySearchFieldInSingle_L);
				sendKeys(driver, activitySearchFieldInSingle_L, activity1);
				enter(driver);
				waitForElement(driver, activeDateInSingle_L);
				if(Date_Picker.equalsIgnoreCase("Yes")) {
					selectDatePicker(driver, activeDateInSingle_L, activityDate);
				}else {
					waitForElement(driver, activeDateInSingle_L);
					sendKeys(driver, activeDateInSingle_L, activityDate);
				}

				waitForElement(driver, showInputSin_L);
				safeclick(driver, showInputSin_L);
			}
			waitForDisplay(driver, wantToApplyPopup_L);
			if (isDisplayed(driver, wantToApplyPopup_L)) {
				String wantToApplyPopup = getText(driver, wantToApplyPopup_L);
				Extent_pass(driver, wantToApplyPopup + " popup is displayed", test,test1);
				System.out.println(wantToApplyPopup + " popup is displayed");
				safeclick(driver, wantToApplyPopupYes_L);
				if (isDisplayed(driver, showInputFieldFrame_L)) {
					Extent_pass(driver, "Show input field frame is displayed", test,test1);
					System.out.println("Show input field frame is displayed");
				} else {
					Extent_fail(driver, "Show input field frame is not displayed", test,test1);
					System.out.println("Show input field frame is not displayed");
				}
			} else {
				Extent_fail(driver, " popup is not displayed", test,test1);
				System.out.println( " popup is not displayed");
			}

			waitForElement(driver, locationSaerchField_L);
			safeclick(driver, locationSaerchField_L);
			sendKeys(driver, locationSaerchField_L, location);
			enter(driver);

			waitForElement(driver, termDepotSearchField_L);
			safeclick(driver, termDepotSearchField_L);
			Actionsendkeys(driver, termDepotSearchField_L, termDepot);
			enter(driver);


			waitForElement(driver, relRefNoTextField_L);
			safeclick(driver, relRefNoTextField_L);
			waitForElement(driver, relRefNoTextField_L);
			sendKeys(driver, relRefNoTextField_L, releaseRefNumber);

			waitForElement(driver, sizeTypeDropDown_L);
			safeclick(driver, sizeTypeDropDown_L);
			waitForElement(driver, sizeType_Searchfield);
			safeclick(driver, sizeType_Searchfield);
			waitForElement(driver, sizeType_Searchfield);
			sendKeys(driver, sizeType_Searchfield, sizeType);
			enter(driver);

			String ActualEqNo = getAttribute(driver, equipmentNoSearchField_L, "value");
			System.out.println("ActualEqNo:" + ActualEqNo);

			waitForElement(driver, saveButtonMoveEnt_L);
			safeclick(driver, saveButtonMoveEnt_L);

			waitForDisplay(driver, errorRecordsFrame_L);
			if (isDisplayed(driver, errorRecordsFrame_L)) {
				safeclick(driver, okButtonErrorFrame_L);
			} else if (isDisplayed(driver, savedPopupSingle_L)) {
				String actText = getText(driver, savedPopupSingle_L);
				if (actText.equals(savedPopupText)) {
					System.out.println("Matched || " + " Expected Value is : " + savedPopupText
							+ " || Actual Value is : " + actText);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + savedPopupText
							+ " || ActualValue is : " + actText, test,test1);
					Extent_pass(driver, savedPopupText + " popup is displayed", test,test1);
					System.out.println(savedPopupText + " popup is displayed");

				} else {
					System.out.println("Not matched || " + " Expected Value is : " + savedPopupText
							+ " || Actual Value  is : " + actText+"<br>"+savedPopupText + " popup is not displayed");
					Extent_fail(driver,"Not matched || " + " Expected Value is : " + savedPopupText
							+ " || Actual Value  is : " + actText+"<br>"+savedPopupText + " popup is not displayed", test,test1);
				}
				waitForElement(driver, savedOkSingle_L);
				safeclick(driver, savedOkSingle_L);
			}

			//Create SNTS Move
			Extent_call(test, test1, "Create Movement Entry");
			waitForElement(driver, activitySearchFieldInSingle_L);
			sendKeys(driver, activitySearchFieldInSingle_L, activity2);
			enter(driver);

			waitForElement(driver, showInputSin_L);
			safeclick(driver, showInputSin_L);

			waitForElement(driver, bookingNo_Searchfield);
			sendKeys(driver, bookingNo_Searchfield, booknum);

			waitForElement(driver, saveButtonMoveEnt_L);
			safeclick(driver, saveButtonMoveEnt_L);
			waitForDisplay(driver, savedPopupSingle_L);
			if (isDisplayed(driver, savedPopupSingle_L)) {
				String actText = getText(driver, savedPopupSingle_L);
				if (actText.equals(savedPopupText)) {
					System.out.println("Matched || " + " Expected Value is : " + savedPopupText	+ " || Actual Value is : " + actText);
					Extent_pass(driver, "Matched || " + " Expected Value is : " + savedPopupText+ " || ActualValue is : " + actText, test,test1);
					Extent_pass(driver, savedPopupText + " popup is displayed", test,test1);
					System.out.println(savedPopupText + " popup is displayed");
				} else {
					System.out.println("Not matched || " + " Expected Value is : " + savedPopupText+ " || Actual Value  is : " + actText+"<br>"+savedPopupText + " popup is not displayed");
					Extent_fail(driver,"Not matched || " + " Expected Value is : " + savedPopupText+ " || Actual Value  is : " + actText+"<br>"+savedPopupText + " popup is not displayed", test,test1);
				}
				safeclick(driver, savedOkSingle_L);
			}
			waitForElement(driver, cancelButton_L);
			safeclick(driver, cancelButton_L);
			Extent_call(test, test1, "Delete the Movement Entry");
			waitForElement(driver, newButton_L);
			safeclick(driver, newButton_L);
			waitForElement(driver, equipmentNoSearchField_L);
			sendKeys(driver, equipmentNoSearchField_L, ActualEqNo);
			waitForElement(driver, showHistoryButton_L);
			safeclick(driver, showHistoryButton_L);
			String grid_element =  String.format(EMS_Locators.grid_element,  activity2); 
			waitForElement(driver, grid_element);
			RightClick(driver, grid_element);
			waitForElement(driver, deleteOpionSingle_L);
			safeclick(driver, deleteOpionSingle_L);
			waitForDisplay(driver, deleConfirmPopup_L);
			if (isDisplayed(driver, deleConfirmPopup_L)) {
				String actConfirmDele = getText(driver, deleConfirmPopup_L);
				Extent_pass(driver, actConfirmDele + "popup is displayed", test,test1);
				safeclick(driver, deleConfirmPopupYes_L);
			}
			waitForElement(driver, singleDeletedPopup_L);
			String actPopup = getText(driver, singleDeletedPopup_L);
			if (actPopup.equals(deletedSingle)) {
				System.out.println("Matched || " + " Expected Value is : " + deletedSingle + " || Actual Value is : " + actPopup);
				Extent_pass(driver,"Matched || " + " Expected Value is : " + deletedSingle + " || ActualValue is : " + actPopup,test,test1);
				Extent_pass(driver, deletedSingle + " popup is displayed", test,test1);
				System.out.println(deletedSingle + " popup is displayed");
			} else {
				System.out.println("Not matched || " + " Expected Value is : " + deletedSingle+ " || Actual Value  is : " + actPopup+"<br>"+deletedSingle + " popup is not displayed");
				Extent_fail(driver, "Not matched || " + " Expected Value is : " + deletedSingle+ " || Actual Value  is : " + actPopup+"<br>"+deletedSingle + " popup is not displayed", test,test1);
			}
			waitForElement(driver, singleDeletedPopupOk_L);
			safeclick(driver, singleDeletedPopupOk_L);
			waitForElement(driver, close_Tab);
			click(driver, close_Tab);
			Extent_call(test, test1, "Enter module name in searchbox & safeclick the module");
			//Enter Enquiry History model
			moduleNavigate(driver, Field_Names);
			waitForElement(driver, P_enquiryHistory_Page);
			if(isDisplayed(driver, P_enquiryHistory_Page)) {
				System.out.println("*****Enquiry History Module is Dispalyed*****");
				Extent_pass(driver, "*****Enquiry History Module is Dispalyed*****", test,test1);
			}else {
				System.out.println("*****Enquiry History Module is not Dispalyed");
				Extent_fail(driver, "*****Enquiry History Module is not Dispalyed*****", test,test1);
			}
			waitForElement(driver, Equip_Type_DD);
			safeclick(driver, Equip_Type_DD);
			String Equip_Type_Select = String.format(EMS_Locators.Equip_Type_Select,  equipmentType_Input24); 
			waitForElement(driver, Equip_Type_Select);
			safeclick(driver, Equip_Type_Select);
			String Radio_Btn_Select = String.format(EMS_Locators.Radio_Btn_Select,  Container_Type_Radio_Button24);
			//select Equipment radio button
			waitForElement(driver, Radio_Btn_Select);
			safeclick(driver, Radio_Btn_Select);

			Step_Start(1, "Enter required container no for Equipment no field", test, test1);
			waitForElement(driver, P_equip_MultiSelect_CheckBox);
			checkBox(driver, P_equip_MultiSelect_CheckBox, Multi_Select_Chk_Box24);
			if(Multi_Select_Chk_Box24.equalsIgnoreCase("YES")){
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs24);
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					waitForElement(driver, P_equipment_TxtField);
					safeclick(driver, P_equipment_TxtField);
					sendKeys(driver, P_equipment_TxtField, Multi_Sel_Value);
					waitForElement(driver, P_equipment_SearchIcon);
					safeclick(driver, P_equipment_SearchIcon);
					twoColumnSearchWindow(driver,two_Column_Search_Header,Condition, Multi_Sel_Value);
				}
			}else {
				waitForElement(driver, P_equipment_TxtField);
				safeclick(driver, P_equipment_TxtField);
				sendKeys(driver, P_equipment_TxtField, ActualEqNo);
				waitForElement(driver, P_equipment_SearchIcon);
				safeclick(driver, P_equipment_SearchIcon);
				twoColumnSearchWindow(driver,two_Column_Search_Header,Condition,ActualEqNo);
			}
			Step_End(1, "Enter required container no for Equipment no field", test, test1);

			Step_Start(2, "safeclick checkbox for show deleted records field", test, test1);
			waitForElement(driver, P_show_DltRec_ChkBox);
			checkBox(driver, P_show_DltRec_ChkBox, Show_Delete_Chk_Box24);
			waitForElement(driver, P_suppressAct_CheckBox);
			checkBox(driver, P_suppressAct_CheckBox, Show_Suppress_Chk_Box24);
			waitForElement(driver, P_Show_Top_CheckBox);
			checkBox(driver, P_Show_Top_CheckBox, Show_Top_Chk_Box24);
			if(Show_Top_Chk_Box24.equals("YES")){
				waitForElement(driver, P_Show_Top_Field);
				clearAndType(driver, P_Show_Top_Field, Show_Top_Input24);
			}
			Step_End(2, "click checkbox for show deleted records field", test, test1);
			Step_Start(3, "click show button to get all movement details", test, test1);

			//click show button
			waitForElement(driver, P_show_Btn);
			safeclick(driver, P_show_Btn);
			Step_End(3, "safeclick show button to get all movement details", test, test1);

			if(Multi_Select_Chk_Box24.equalsIgnoreCase("YES")){
				waitForElement(driver, Equipment_Number);
				List<WebElement> total_Values_Grid =listOfElements(driver, Equipment_Number);
				int Grid_Size = total_Values_Grid.size();
				int i=1;
				// check the movement details
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs24);
				int total_Input_Size = Multi_Sel_Values.size();
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					String movement =  String.format(EMS_Locators.movement_Value,i); 
					waitForElement(driver, P_movement_Code);
					String movementDetail=getText(driver, movement);
					if(Grid_Size==total_Input_Size) {
						if(Multi_Sel_Value.equals(movementDetail)) {
							System.out.println("Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}
						else {
							System.out.println("Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}
						i++;
					}else {
						System.out.println("***********All the values arwe not getting the grid***********");
						Extent_fail(driver, "***********All the values arwe not getting the grid***********", test, test1);
					}
				}		
			}
			else {
				if(Show_Delete_Chk_Box24.equalsIgnoreCase("Yes")) {
					Step_Start(4, " movement detail should shown in grid along with deleted moves by highlighting in red color", test, test1);
					waitForElement(driver, P_show_DltRec_ChkBox);
					checkBox(driver, P_show_DltRec_ChkBox, Show_Delete_Chk_Box24);
					//safeclick show button
					waitForElement(driver, P_show_Btn);
					safeclick(driver, P_show_Btn);
					waitForElement(driver, P_movement_Code);
					String deleted_Value =  String.format(EMS_Locators.deleted_Value,activity2); 
					String deletedHighLight = getTextBackgroundColor(driver, deleted_Value);
					String movementDetail1=getText(driver, P_equipmentNo_Details);
					if(movementDetail1.equals(ActualEqNo)) {
						if(Deleted_HighLighted_Color_Txt.equals(deletedHighLight)) {
							System.out.println("Matched || " + " Expected Report Activity is : " + Deleted_HighLighted_Color_Txt + " || Actual Report Activity is : " + deletedHighLight);
							Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Deleted_HighLighted_Color_Txt + " || Actual Report Activity is : " + deletedHighLight, test,test1);
						}
						else {
							System.out.println("Not Matched || " + " Expected Report Activity is : " + Deleted_HighLighted_Color_Txt + " || Actual Report Activity is : " + deletedHighLight);
							Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Deleted_HighLighted_Color_Txt + " || Actual Report Activity is : " + deletedHighLight, test,test1);
						}
					}else {
						System.out.println("Not Matched || " + " Expected Report Activity is : " + ActualEqNo + " || Actual Report Activity is : " + movementDetail1);
						Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + ActualEqNo + " || Actual Report Activity is : " + movementDetail1, test,test1);
					}
					waitForElement(driver, P_Grid_NoOfRetrived);
					String ele=getText(driver, P_Grid_NoOfRetrived);
					int startIndex1=ele.indexOf(':');
					int endIndex1=ele.length();
					String numString1=ele.substring(startIndex1+1, endIndex1).trim();
					int numberValue1=Integer.parseInt(numString1);
					List<WebElement> actlisted = listOfElements(driver, Row_List);
					int expectednumber1=actlisted.size()-1;
					if(expectednumber1==numberValue1) {
						System.out.println("Matched || " + " Expected Report Activity is : " + expectednumber1 + " || Actual Report Activity is : " + numberValue1);
						Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + expectednumber1 + " || Actual Report Activity is : " + numberValue1, test,test1);
					}
					else {
						System.out.println("Not Matched || " + " Expected Report Activity is : " + expectednumber1 + " || Actual Report Activity is : " + numberValue1);
						Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + expectednumber1 + " || Actual Report Activity is : " + numberValue1, test,test1);
					}
					Step_End(4, " movement detail should shown in grid along with deleted moves by highlighting in red color", test, test1);

				}else {
					// check the movement details
					waitForElement(driver, P_movement_Code);
					String movementDetail=getText(driver, P_equipmentNo_Details);
					if(eqpNo.equals(movementDetail)) {
						System.out.println("Matched || " + " Expected Report Activity is : " + eqpNo + " || Actual Report Activity is : " + movementDetail);
						Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + eqpNo + " || Actual Report Activity is : " + movementDetail, test,test1);
					}
					else {
						System.out.println("Not Matched || " + " Expected Report Activity is : " + eqpNo + " || Actual Report Activity is : " + movementDetail);
						Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + eqpNo + " || Actual Report Activity is : " + movementDetail, test,test1);
					}
					waitForElement(driver, P_Grid_NoOfRetrived);
					String abc=getText(driver, P_Grid_NoOfRetrived);
					System.out.println("abc : "+abc);
					int startIndex=abc.indexOf(':');
					int endIndex=abc.length();
					String numString=abc.substring(startIndex+1, endIndex).trim();
					int numberValue=Integer.parseInt(numString);
					System.out.println("numberValue : "+numberValue);
					int expectednumber =0; 
					for(int i=0;i<=numberValue+numberValue;i++) {
						String movementcode =  String.format(EMS_Locators.Grid_Movement_Codes,i);
						String movement_Code_text = getTextwithoutfail(driver, movementcode);
						if(!movement_Code_text.contains(Filter_Option) && !movement_Code_text.equals("null")) {
							expectednumber++;
						}else if(movement_Code_text.equals("null")) {
							break;
						}
						mouseOverToElement(driver, movementcode);
						click(driver, movementcode);
					}	
					if(expectednumber==numberValue) {
						System.out.println("Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
						Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
					}else {
						System.out.println("Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
						Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
					}
				}	
			}
			Extent_completed(testCase_Name, test, test1);
			scrollTop(driver);
			waitForElement(driver, close_Tab);
			click1(driver, close_Tab);
		}
		if(j==1) {
			String testCase_Name="TC_Enquiry_History_TS025";
			String File_Path_25 = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_025 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_025, testCase_Name, "Dataset"+selected_dataset, File_Path_25);

			String Field_Names =Excel_data.get("field_name");
			String equipmentNo_TxtField_Input =Excel_data.get("EquipmentNo_TxtField_Input");
			String Container_Type_Radio_Button =Excel_data.get("Container_Type_Radio_Button");
			String Show_Delete_Chk_Box =Excel_data.get("Show_Delete_Chk_Box");
			String Show_Suppress_Chk_Box =Excel_data.get("Show_Suppress_Chk_Box");
			String Show_Top_Chk_Box =Excel_data.get("Show_Top_Chk_Box");
			String Multi_Top_Chk_Box =Excel_data.get("Multi_Top_Chk_Box");
			String Show_Top_Input =Excel_data.get("Show_Top_Input");
			String equipmentType_Input =Excel_data.get("equipmentType_Input");
			String Multi_Select_Inputs =Excel_data.get("Multi_Select_Inputs");
			String Suppress_HighLighted_Color_Txt =Excel_data.get("Suppress_HighLighted_Color");
			String Condition =Excel_data.get("Condition");

			Extent_Start(testCase_Name, test, test1);

			//Enter Enquiry History model
			Extent_call(test, test1, "Enter module name in searchbox & safeclick the module");
			moduleNavigate(driver, Field_Names);
			waitForElement(driver, P_enquiryHistory_Page);
			if(isDisplayed(driver, P_enquiryHistory_Page)) {
				System.out.println("*****Enquiry History Module is Dispalyed*****");
				Extent_pass(driver, "*****Enquiry History Module is Dispalyed*****", test,test1);
			}else {
				System.out.println("*****Enquiry History Module is not Dispalyed");
				Extent_fail(driver, "*****Enquiry History Module is not Dispalyed*****", test,test1);
			}
			String Equip_Type_Select = String.format(EMS_Locators.Equip_Type_Select,  equipmentType_Input); 
			String Radio_Btn_Select = String.format(EMS_Locators.Radio_Btn_Select,  Container_Type_Radio_Button);
			waitForElement(driver, Equip_Type_DD);
			click(driver, Equip_Type_DD);
			waitForElement(driver, Equip_Type_Select);
			click(driver, Equip_Type_Select);
			//select Equipment radio button
			waitForElement(driver, Radio_Btn_Select);
			click(driver, Radio_Btn_Select);
			Step_Start(1, "Enter required container no for Equipment no field", test, test1);
			waitForElement(driver, P_equip_MultiSelect_CheckBox);
			checkBox(driver, P_equip_MultiSelect_CheckBox, Multi_Top_Chk_Box);
			if(Multi_Top_Chk_Box.equals("YES")){
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					waitForElement(driver, P_equipment_TxtField);
					click(driver, P_equipment_TxtField);
					sendKeys(driver, P_equipment_TxtField, Multi_Sel_Value);
					waitForElement(driver, P_equipment_SearchIcon);
					click(driver, P_equipment_SearchIcon);
					twoColumnSearchWindow(driver,Container_Type_Radio_Button,Condition, Multi_Sel_Value);
				}
			}else {
				waitForElement(driver, P_equipment_TxtField);
				click(driver, P_equipment_TxtField);
				sendKeys(driver, P_equipment_TxtField, equipmentNo_TxtField_Input);
				waitForElement(driver, P_equipment_SearchIcon);
				click(driver, P_equipment_SearchIcon);
				twoColumnSearchWindow(driver,Container_Type_Radio_Button,Condition,equipmentNo_TxtField_Input);
			}
			Step_End(1, "Enter required container no for Equipment no field", test, test1);
			Step_Start(2, "click checkbox for show suppress activities field", test, test1);

			waitForElement(driver, P_show_DltRec_ChkBox);
			checkBox(driver, P_show_DltRec_ChkBox, Show_Delete_Chk_Box);
			waitForElement(driver, P_suppressAct_CheckBox);
			checkBox(driver, P_suppressAct_CheckBox, Show_Suppress_Chk_Box);
			waitForElement(driver, P_Show_Top_CheckBox);
			checkBox(driver, P_Show_Top_CheckBox, Show_Top_Chk_Box);
			if(Show_Top_Chk_Box.equals("YES")){
				waitForElement(driver, P_Show_Top_Field);
				clearAndType(driver, P_Show_Top_Field, Show_Top_Input);
			}
			Step_End(2, "click checkbox for show suppress activities field", test, test1);
			Step_Start(3, "click show button to get all movement details", test, test1);

			//click show button
			waitForElement(driver, P_show_Btn);
			click(driver, P_show_Btn);
			Step_End(3, "click show button to get all movement details", test, test1);

			if(Multi_Top_Chk_Box.equals("YES")){
				List<WebElement> total_Values_Grid =listOfElements(driver, Equipment_Number);
				int Grid_Size = total_Values_Grid.size();
				int i=1;
				// check the movement details
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				int total_Input_Size = Multi_Sel_Values.size();
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					String movement =  String.format(EMS_Locators.movement_Value,i); 
					waitForElement(driver, movement);
					String movementDetail=getText(driver, movement);
					if(Grid_Size==total_Input_Size) {
						if(Multi_Sel_Value.equals(movementDetail)) {
							System.out.println("Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}
						else {
							System.out.println("Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}
						i++;
					}else {
						System.out.println("***********All the values are not getting the grid***********");
						Extent_fail(driver, "***********All the values are not getting the grid***********", test, test1);
					}
				}		
			}
			else {
				Step_Start(4, "movement detail should shown in grid along with transfer moves by highlighting in cyan color", test, test1);

				// check the movement details
				if(Show_Suppress_Chk_Box.equalsIgnoreCase("Yes")) {
					waitForElement(driver, P_suppressAct_CheckBox);
					checkBox(driver, P_suppressAct_CheckBox, Show_Suppress_Chk_Box);
					//click show button
					waitForElement(driver, P_show_Btn);
					click(driver, P_show_Btn);

					waitForElement(driver, CHSC_Value);
					String suppressHighLightColor=getTextBackgroundColor(driver, CHSC_Value);
					if(Suppress_HighLighted_Color_Txt.equals(suppressHighLightColor)) {
						System.out.println("Matched || " + " Expected Cyan color code is : " + Suppress_HighLighted_Color_Txt + " || Actual Cyan color code is Displayed  : " + suppressHighLightColor);
						Extent_pass(driver, "Matched || " + " Expected Cyan color code is : " + Suppress_HighLighted_Color_Txt + " || Actual Cyan color code is Displayed  : " + suppressHighLightColor, test,test1);
					}
					else {
						System.out.println("Not Matched || " + " Expected Cyan color is Not Displayed : " + Suppress_HighLighted_Color_Txt );
						Extent_fail(driver, "Not Matched || " + " Expected Cyan color is Not Displayed : " + Suppress_HighLighted_Color_Txt , test,test1);
					}
					waitForElement(driver, P_movement_Code);
					String movementDetail2=getText(driver, Suppress_Details);
					if(isDisplayed(driver, CHSC_Value)) {
						System.out.println("Matched || Actual Suppress value is : " + movementDetail2);
						Extent_pass(driver, "Matched || Actual Suppress value is : " + movementDetail2, test,test1);
					}
					else {
						System.out.println("Not Matched  || Actual Suppress value is Not displayed ");
						Extent_fail(driver,"Not Matched  || Actual Suppress value is Not displayed ", test,test1);
					}
				}else {
					waitForElement(driver, P_movement_Code);
					String movementDetail=getText(driver, P_equipmentNo_Details);
					if(equipmentNo_TxtField_Input.equals(movementDetail)) {
						System.out.println("Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail);
						Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail, test,test1);
					}
					else {
						System.out.println("Not Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail);
						Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail, test,test1);
					}
					waitForElement(driver, P_Grid_NoOfRetrived);
					String abc=getText(driver, P_Grid_NoOfRetrived);
					int startIndex=abc.indexOf(':');
					int endIndex=abc.length();
					String numString=abc.substring(startIndex+1, endIndex).trim();
					int numberValue=Integer.parseInt(numString);
					List<WebElement> actlist = listOfElements(driver, Row_List);
					int expectednumber=actlist.size()-1;
					if(expectednumber==numberValue) {
						System.out.println("Matched || " + " Expected Report Activity is : " + expectednumber + " || Actual Report Activity is : " + numberValue);
						Extent_pass(driver,"Matched || " + " Expected Report Activity is : " + expectednumber + " || Actual Report Activity is : " + numberValue, test,test1);
					}else {
						System.out.println("Not Matched || " + " Expected Report Activity is : " + expectednumber + " || Actual Report Activity is : " + numberValue);
						Extent_fail(driver,"Not Matched || " + " Expected Report Activity is : " + expectednumber + " || Actual Report Activity is : " + numberValue, test,test1);
					}
				}	
			}
			Step_End(4, "movement detail should shown in grid along with transfer moves by highlighting in cyan color", test, test1);

			Extent_completed(testCase_Name, test, test1);

			scrollTop(driver);
			waitForElement(driver, close_Tab);
			click1(driver, close_Tab);
		}
		if(j==1) {
			String testCase_Name="TC_Enquiry_History_TS026";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_026 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_026, testCase_Name, "Dataset"+selected_dataset, File_Path);


			String Field_Names = Excel_data.get("field_name");
			String equipmentNo_TxtField_Input = Excel_data.get("equipmentNo_TxtField_Input");
			String Container_Type_Radio_Button = Excel_data.get("Container_Type_Radio_Button");
			String Show_Delete_Chk_Box = Excel_data.get("Show_Delete_Chk_Box");
			String Show_Suppress_Chk_Box = Excel_data.get("Show_Suppress_Chk_Box");
			String Show_Top_Chk_Box = Excel_data.get("Show_Top_Chk_Box");
			String Multi_Top_Chk_Box = Excel_data.get("Multi_Top_Chk_Box");
			String Show_Top_Input = Excel_data.get("Show_Top_Input");
			String equipmentType_Input = Excel_data.get("equipmentType_Input");
			String Multi_Select_Inputs = Excel_data.get("Multi_Select_Inputs");
			String Condition =Excel_data.get("Condition");
			String two_Column_Search_Header =Excel_data.get("two_Column_Search_Header");

			Extent_Start(testCase_Name, test, test1);

			//Enter Enquiry History model
			Extent_call(test, test1, "Enter module name in searchbox & safeclick the module");
			moduleNavigate(driver, Field_Names);
			waitForElement(driver, P_enquiryHistory_Page);
			if(isDisplayed(driver, P_enquiryHistory_Page)) {
				System.out.println("*****Enquiry History Module is Dispalyed*****");
				Extent_pass(driver, "*****Enquiry History Module is Dispalyed*****", test,test1);
			}else {
				System.out.println("*****Enquiry History Module is not Dispalyed");
				Extent_fail(driver, "*****Enquiry History Module is not Dispalyed*****", test,test1);
			}
			waitForElement(driver, Equip_Type_DD);
			click(driver, Equip_Type_DD);
			String Equip_Type_Select = String.format(EMS_Locators.Equip_Type_Select,  equipmentType_Input); 
			String Radio_Btn_Select = String.format(EMS_Locators.Radio_Btn_Select,  Container_Type_Radio_Button);
			waitForElement(driver, Equip_Type_Select);
			click(driver, Equip_Type_Select);
			//select Equipment radio button
			Step_Start(1, "Select Book no radio button option to proceed further", test, test1);
			waitForElement(driver, Radio_Btn_Select);
			click(driver, Radio_Btn_Select);
			Step_End(1, "Select Book no radio button option to proceed further", test, test1);
			Step_Start(2, "Enter required container no for Book no field", test, test1);
			waitForElement(driver, P_equip_MultiSelect_CheckBox);
			checkBox(driver, P_equip_MultiSelect_CheckBox, Multi_Top_Chk_Box);
			if(Multi_Top_Chk_Box.equals("YES")){
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					waitForElement(driver, P_equipment_TxtField);
					click(driver, P_equipment_TxtField);
					sendKeys(driver, P_equipment_TxtField, Multi_Sel_Value);
					waitForElement(driver, P_equipment_SearchIcon);
					click(driver, P_equipment_SearchIcon);
					twoColumnSearchWindow(driver,two_Column_Search_Header,Condition, Multi_Sel_Value);
				}
			}else {
				waitForElement(driver, P_equipment_TxtField);
				click(driver, P_equipment_TxtField);
				sendKeys(driver, P_equipment_TxtField, equipmentNo_TxtField_Input);
				waitForElement(driver, P_equipment_SearchIcon);
				click(driver, P_equipment_SearchIcon);
				waitForElement(driver, P_searchNo_Popup);
				Step_End(2, "Enter required container no for Book no field", test, test1);
				twoColumnSearchWindow(driver,two_Column_Search_Header,Condition,equipmentNo_TxtField_Input);
			}
			waitForElement(driver, P_show_DltRec_ChkBox);
			checkBox(driver, P_show_DltRec_ChkBox, Show_Delete_Chk_Box);
			waitForElement(driver, P_suppressAct_CheckBox);
			checkBox(driver, P_suppressAct_CheckBox, Show_Suppress_Chk_Box);
			waitForElement(driver, P_Show_Top_CheckBox);
			checkBox(driver, P_Show_Top_CheckBox, Show_Top_Chk_Box);
			if(Show_Top_Chk_Box.equals("YES")){
				waitForElement(driver, P_Show_Top_Field);
				clearAndType(driver, P_Show_Top_Field, Show_Top_Input);
			}
			Step_End(2, "Enter required container no for Book no field", test, test1);

			Step_Start(3, "click show button to get all movement details", test, test1);
			//click show button
			waitForElement(driver, P_show_Btn);
			click(driver, P_show_Btn);
			Step_End(3, "click show button to get all movement details", test, test1);
			Step_Start(4, "movement detail should shown in grid based Booking no", test, test1);
			if(Multi_Top_Chk_Box.equalsIgnoreCase("YES")){
				List<WebElement> total_Values_Grid =listOfElements(driver, Equipment_Number);
				int Grid_Size = total_Values_Grid.size();
				int i=1;
				// check the movement details
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				int total_Input_Size = Multi_Sel_Values.size();
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					String movement =  String.format(EMS_Locators.movement_Value,i); 
					waitForElement(driver, P_movement_Code);
					String movementDetail=getText(driver, movement);
					if(Grid_Size==total_Input_Size) {
						if(Multi_Sel_Value.equals(movementDetail)) {
							System.out.println("Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}
						else {
							System.out.println("Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}
						i++;
					}else {
						System.out.println("***********All the values are not getting the grid***********");
						Extent_fail(driver, "***********All the values are not getting the grid***********", test, test1);
					}
				}		
			}
			else {
				// check the movement details
				waitForElement(driver, Scruoll);
				horizontalscroll(driver, Scruoll, 4500);
				String Booking_value =  String.format(EMS_Locators.P_bookingNo_Text,equipmentNo_TxtField_Input);
				String movementDetail=getText(driver, Booking_value);
				if(equipmentNo_TxtField_Input.equals(movementDetail)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail, test,test1);
				}
				else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail, test,test1);
				}
				waitForElement(driver, P_Grid_NoOfRetrived);
				String abc=getText(driver, P_Grid_NoOfRetrived);
				System.out.println("abc : "+abc);
				int startIndex=abc.indexOf(':');
				int endIndex=abc.length();
				String numString=abc.substring(startIndex+1, endIndex).trim();
				int numberValue=Integer.parseInt(numString);
				System.out.println("numberValue : "+numberValue);
				int expectednumber =0; 
				for(int i=0;i<=numberValue+numberValue;i++) {
					String movementcode =  String.format(EMS_Locators.movementcode,i);
					String movement_Code_text = getTextwithoutfail(driver, movementcode);
					if(movement_Code_text.equals(equipmentNo_TxtField_Input)) {
						expectednumber++;
					}else if(movement_Code_text.equals("null")) {
						break;
					}
					mouseOverToElement(driver, movementcode);
					click(driver, movementcode);
				}	        
				if(expectednumber==numberValue) {
					System.out.println("Matched || " + " Expected Report Activity is : " + expectednumber + " || Actual Report Activity is : " + numberValue);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + expectednumber + " || Actual Report Activity is : " + numberValue, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + expectednumber + " || Actual Report Activity is : " + numberValue);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + expectednumber + " || Actual Report Activity is : " + numberValue, test,test1);
				}
			}
			Step_Start(4, "movement detail should shown in grid based Booking no", test, test1);
			Extent_completed(testCase_Name, test, test1);

			scrollTop(driver);
			waitForElement(driver, close_Tab);
			click1(driver, close_Tab);
		}
		if(j==1) {
			String testCase_Name="TC_Enquiry_History_TS027";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_027 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_027, testCase_Name, "Dataset"+selected_dataset, File_Path);

			String Field_Names = Excel_data.get("field_name");
			String equipmentNo_TxtField_Input = Excel_data.get("EquipmentNo_TxtField_Input");
			String Container_Type_Radio_Button = Excel_data.get("Container_Type_Radio_Button");
			String Show_Delete_Chk_Box = Excel_data.get("Show_Delete_Chk_Box");
			String Show_Suppress_Chk_Box = Excel_data.get("Show_Suppress_Chk_Box");
			String Show_Top_Chk_Box = Excel_data.get("Show_Top_Chk_Box");
			String Multi_Top_Chk_Box = Excel_data.get("Multi_Top_Chk_Box");
			String Show_Top_Input = Excel_data.get("Show_Top_Input");
			String equipmentType_Input = Excel_data.get("equipmentType_Input");
			String Multi_Select_Inputs = Excel_data.get("Multi_Select_Inputs");
			String Condition =Excel_data.get("Condition");
			String two_Column_Search_Header =Excel_data.get("two_Column_Search_Header");

			Extent_Start(testCase_Name, test, test1);
			//Enter Enquiry History model
			Extent_call(test, test1, "Enter module name in searchbox & click the module");
			moduleNavigate(driver, Field_Names);
			waitForElement(driver, P_enquiryHistory_Page);
			if(isDisplayed(driver, P_enquiryHistory_Page)) {
				System.out.println("*****Enquiry History Module is Dispalyed*****");
				Extent_pass(driver, "*****Enquiry History Module is Dispalyed*****", test,test1);
			}else {
				System.out.println("*****Enquiry History Module is not Dispalyed");
				Extent_fail(driver, "*****Enquiry History Module is not Dispalyed*****", test,test1);
			}
			//select Equipment radio button
			Step_Start(1, "Select BL no radio button option to proceed further", test, test1);
			String Equip_Type_Select = String.format(EMS_Locators.Equip_Type_Select,  equipmentType_Input); 
			String Radio_Btn_Select = String.format(EMS_Locators.Radio_Btn_Select,  Container_Type_Radio_Button);
			waitForElement(driver, Equip_Type_DD);
			click(driver, Equip_Type_DD);
			waitForElement(driver, Equip_Type_Select);
			click(driver, Equip_Type_Select);
			//select Equipment radio button
			waitForElement(driver, Radio_Btn_Select);
			click(driver, Radio_Btn_Select);
			Step_End(1, "Select BL no radio button option to proceed further", test, test1);
			Step_Start(2, "Enter required container no for BL no field", test, test1);

			waitForElement(driver, P_equip_MultiSelect_CheckBox);
			checkBox(driver, P_equip_MultiSelect_CheckBox, Multi_Top_Chk_Box);
			if(Multi_Top_Chk_Box.equals("YES")){
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					waitForElement(driver, P_equipment_TxtField);
					click(driver, P_equipment_TxtField);
					sendKeys(driver, P_equipment_TxtField, Multi_Sel_Value);
					waitForElement(driver, P_equipment_SearchIcon);
					click(driver, P_equipment_SearchIcon);
					twoColumnSearchWindow(driver,two_Column_Search_Header,Condition, Multi_Sel_Value);
				}
			}else {
				waitForElement(driver, P_equipment_TxtField);
				click(driver, P_equipment_TxtField);
				sendKeys(driver, P_equipment_TxtField, equipmentNo_TxtField_Input);
				waitForElement(driver, P_equipment_SearchIcon);
				click(driver, P_equipment_SearchIcon);
				twoColumnSearchWindow(driver,two_Column_Search_Header,Condition,equipmentNo_TxtField_Input);
			}
			Step_End(2, "Enter required container no for BL no field", test, test1);

			waitForElement(driver, P_show_DltRec_ChkBox);
			checkBox(driver, P_show_DltRec_ChkBox, Show_Delete_Chk_Box);
			waitForElement(driver, P_suppressAct_CheckBox);
			checkBox(driver, P_suppressAct_CheckBox, Show_Suppress_Chk_Box);
			waitForElement(driver, P_Show_Top_CheckBox);
			checkBox(driver, P_Show_Top_CheckBox, Show_Top_Chk_Box);
			if(Show_Top_Chk_Box.equals("YES")){
				waitForElement(driver, P_Show_Top_Field);
				clearAndType(driver, P_Show_Top_Field, Show_Top_Input);
			}

			Step_Start(3, "click show button to get all movement details", test, test1);
			//click show button
			waitForElement(driver, P_show_Btn);
			click(driver, P_show_Btn);
			Step_End(3, "click show button to get all movement details", test, test1);
			Step_Start(4, "movement detail should shown in grid based BL no", test, test1);
			if(Multi_Top_Chk_Box.equals("YES")){
				List<WebElement> total_Values_Grid =listOfElements(driver, Equipment_Number);
				int Grid_Size = total_Values_Grid.size();
				int i=1;
				// check the movement details
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				int total_Input_Size = Multi_Sel_Values.size();
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					String movement =  String.format(EMS_Locators.movement_Value,i); 
					waitForElement(driver, movement);
					String movementDetail=getText(driver, movement);
					if(Grid_Size==total_Input_Size) {
						if(Multi_Sel_Value.equals(movementDetail)) {
							System.out.println("Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}
						else {
							System.out.println("Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}
						i++;
					}else {
						System.out.println("***********All the values are not getting the grid***********");
						Extent_fail(driver, "***********All the values are not getting the grid***********", test, test1);
					}
				}		
			}else {
				// check the movement details
				String EquipNo=getText(driver, P_BLNo_EquipNo);
				String actTypeNo=getText(driver, P_BLNo_ActType);

				waitForElement(driver, P_movement_Code);
				if(isDisplayed(driver, P_equipmentNo_Details)) {
					System.out.println("*****Movement details are Showed in grid based on BL No The EquipmentNo is shown as "+EquipNo+" and The Activity Type is shown as "+actTypeNo+"*****");
					Extent_pass(driver, "*****Movement details are Showed in grid based on BL No The EquipmentNo is shown as "+EquipNo+" and The Activity Type is shown as "+actTypeNo+"*****", test,test1);
				}else {
					System.out.println("*****Movement details are  not Showed*****");
					Extent_fail(driver, "*****Movement details are  not Showed*****", test,test1);
				}
				waitForElement(driver, P_Grid_NoOfRetrived);
				String abc=getText(driver, P_Grid_NoOfRetrived);
				System.out.println("abc : "+abc);
				int startIndex=abc.indexOf(':');
				int endIndex=abc.length();
				String numString=abc.substring(startIndex+1, endIndex).trim();
				int numberValue=Integer.parseInt(numString);
				System.out.println("numberValue : "+numberValue);
				int expectednumber =0; 
				for(int i=0;i<=numberValue+numberValue;i++) {
					String movementcode =  String.format(EMS_Locators.Grid_Movement_Codes,i);
					String movement_Code_text = getTextwithoutfail(driver, movementcode);
					if(!movement_Code_text.contains("Equipment No:") && !movement_Code_text.equals("null")) {
						expectednumber++;
					}else if(movement_Code_text.equals("null")) {
						break;
					}
					mouseOverToElement(driver, movementcode);
					click(driver, movementcode);
				}	
				if(expectednumber==numberValue) {
					System.out.println("Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
				}

			}
			Step_Start(4, "movement detail should shown in grid based BL no", test, test1);
			Extent_completed(testCase_Name, test, test1);

			scrollTop(driver);
			waitForElement(driver, close_Tab);
			click1(driver, close_Tab);
		}
		if(j==1) {
			String testCase_Name="TC_Enquiry_History_TS028";
			String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
			String Sheet_Name_028 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
			Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_028, testCase_Name, "Dataset"+selected_dataset, File_Path);

			String Field_Names = Excel_data.get("field_name");
			String equipmentNo_TxtField_Input = Excel_data.get("EquipmentNo_TxtField_Input");
			String Container_Type_Radio_Button = Excel_data.get("Container_Type_Radio_Button");
			String Show_Delete_Chk_Box = Excel_data.get("Show_Delete_Chk_Box");
			String Show_Suppress_Chk_Box = Excel_data.get("Show_Suppress_Chk_Box");
			String Show_Top_Chk_Box = Excel_data.get("Show_Top_Chk_Box");
			String Multi_Top_Chk_Box = Excel_data.get("Multi_Top_Chk_Box");
			String Show_Top_Input = Excel_data.get("Show_Top_Input");
			String equipmentType_Input = Excel_data.get("equipmentType_Input");
			String Multi_Select_Inputs = Excel_data.get("Multi_Select_Inputs");
			String Filter_Option = Excel_data.get("Filter_Option");
			String Condition =Excel_data.get("Condition");

			Extent_Start(testCase_Name, test, test1);

			//Enter Enquiry History model
			Extent_call(test, test1, "Enter module name in searchbox & click the module");
			moduleNavigate(driver, Field_Names);
			waitForElement(driver, P_enquiryHistory_Page);
			if(isDisplayed(driver, P_enquiryHistory_Page)) {
				System.out.println("*****Enquiry History Module is Dispalyed*****");
				Extent_pass(driver, "*****Enquiry History Module is Dispalyed*****", test,test1);
			}else {
				System.out.println("*****Enquiry History Module is not Dispalyed");
				Extent_fail(driver, "*****Enquiry History Module is not Dispalyed*****", test,test1);
			}

			//select Equipment radio button
			Step_Start(1, " Select Equipment no radio button option to proceed further", test, test1);
			String Equip_Type_Select = String.format(EMS_Locators.Equip_Type_Select,  equipmentType_Input); 
			String Radio_Btn_Select = String.format(EMS_Locators.Radio_Btn_Select,  Container_Type_Radio_Button);
			waitForElement(driver, Equip_Type_DD);
			click(driver, Equip_Type_DD);
			waitForElement(driver, Equip_Type_Select);
			click(driver, Equip_Type_Select);
			//select Equipment radio button
			waitForElement(driver, Radio_Btn_Select);
			click(driver, Radio_Btn_Select);
			Step_End(1, " Select Equipment no radio button option to proceed further", test, test1);

			Step_Start(2, "Click Multi-Select checkbox to enter multiple equipment", test, test1);
			waitForElement(driver, P_equip_MultiSelect_CheckBox);
			checkBox(driver, P_equip_MultiSelect_CheckBox, Multi_Top_Chk_Box);
			Step_End(2, "Click Multi-Select checkbox to enter multiple equipment", test, test1);
			Step_Start(3, "Enter required container no for Equipment no field", test, test1);

			if(Multi_Top_Chk_Box.equals("YES")){
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					waitForElement(driver, P_equipment_TxtField);
					click(driver, P_equipment_TxtField);
					sendKeys(driver, P_equipment_TxtField, Multi_Sel_Value);
					waitForElement(driver, P_equipment_SearchIcon);
					click(driver, P_equipment_SearchIcon);
					twoColumnSearchWindow(driver,Container_Type_Radio_Button,Condition, Multi_Sel_Value);
				}
			}else {
				waitForElement(driver, P_equipment_TxtField);
				click(driver, P_equipment_TxtField);
				sendKeys(driver, P_equipment_TxtField, equipmentNo_TxtField_Input);
				waitForElement(driver, P_equipment_SearchIcon);
				click(driver, P_equipment_SearchIcon);
				twoColumnSearchWindow(driver,Container_Type_Radio_Button,Condition,equipmentNo_TxtField_Input);
			}
			Step_End(3, "Enter required container no for Equipment no field", test, test1);
			waitForElement(driver, P_show_DltRec_ChkBox);
			checkBox(driver, P_show_DltRec_ChkBox, Show_Delete_Chk_Box);
			waitForElement(driver, P_suppressAct_CheckBox);
			checkBox(driver, P_suppressAct_CheckBox, Show_Suppress_Chk_Box);
			waitForElement(driver, P_Show_Top_CheckBox);
			checkBox(driver, P_Show_Top_CheckBox, Show_Top_Chk_Box);
			if(Show_Top_Chk_Box.equals("YES")){
				waitForElement(driver, P_Show_Top_Field);
				clearAndType(driver, P_Show_Top_Field, Show_Top_Input);
			}
			Step_Start(4, " click show button to get all movement details", test, test1);
			//click show button
			waitForElement(driver, P_show_Btn);
			click(driver, P_show_Btn);
			Step_End(4, "click show button to get all movement details", test, test1);
			Step_Start(5, "movement detail should shown in grid based on Equipment no", test, test1);
			if(Multi_Top_Chk_Box.equals("YES")){
				waitForElement(driver, P_Grid_NoOfRetrived);
				String abc=getText(driver, P_Grid_NoOfRetrived);
				System.out.println("abc : "+abc);
				int startIndex=abc.indexOf(':');
				int endIndex=abc.length();
				String numString=abc.substring(startIndex+1, endIndex).trim();
				int numberValue=Integer.parseInt(numString);
				System.out.println("numberValue : "+numberValue);
				int expectednumber =0; 
				for(int i=0;i<=numberValue+numberValue;i++) {
					String movementcode =  String.format(EMS_Locators.Grid_Movement_Codes,i);
					String movement_Code_text = getTextwithoutfail(driver, movementcode);
					if(!movement_Code_text.contains("Equipment No:") && !movement_Code_text.equals("null")) {
						expectednumber++;
					}else if(movement_Code_text.equals("null")) {
						break;
					}
					mouseOverToElement(driver, movementcode);
					click(driver, movementcode);
				}	

				waitForElement(driver, Tool_Bar_EH);
				click(driver, Tool_Bar_EH);
				waitForElement(driver, Condition_Filter_EH);
				click(driver, Condition_Filter_EH);
				waitForElement(driver, Movement_Filter_EH);
				sendKeys(driver, Movement_Filter_EH, Filter_Option);
				waitForElement(driver, Equipment_Number);
				List<WebElement> total_Values_Grid =listOfElements(driver, Equipment_Number);
				int Grid_Size = total_Values_Grid.size();
				int i=0;
				// check the movement details
				List<String> Multi_Sel_Values = splitAndExpand(Multi_Select_Inputs);
				int total_Input_Size = Multi_Sel_Values.size();
				for(String Multi_Sel_Value : Multi_Sel_Values) {
					String movement =  String.format(EMS_Locators.movement_Value,i); 
					waitForElement(driver, movement);
					String movementDetail=getText(driver, movement);
					if(Grid_Size==total_Input_Size) {
						if(Multi_Sel_Value.equals(movementDetail)) {
							System.out.println("Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}else {
							System.out.println("Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail);
							Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Multi_Sel_Value + " || Actual Report Activity is : " + movementDetail, test,test1);
						}
						mouseOverToElement(driver, movement);
						click(driver, movement);
						i++;
					}else {
						System.out.println("***********All the values are not getting the grid***********");
						Extent_fail(driver, "***********All the values are not getting the grid***********", test, test1);
					}
				}	
				if(expectednumber==numberValue) {
					System.out.println("Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
				}
			}else {
				waitForElement(driver, P_movement_Code);
				String movementDetail=getText(driver, P_equipmentNo_Details);
				if(equipmentNo_TxtField_Input.equals(movementDetail)) {
					System.out.println("Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + equipmentNo_TxtField_Input + " || Actual Report Activity is : " + movementDetail, test,test1);
				}
				waitForElement(driver, P_Grid_NoOfRetrived);
				String abc=getText(driver, P_Grid_NoOfRetrived);
				System.out.println("abc : "+abc);
				int startIndex=abc.indexOf(':');
				int endIndex=abc.length();
				String numString=abc.substring(startIndex+1, endIndex).trim();
				int numberValue=Integer.parseInt(numString);
				System.out.println("numberValue : "+numberValue);
				int expectednumber =0; 
				for(int i=0;i<=numberValue+numberValue;i++) {
					String movementcode =  String.format(EMS_Locators.Grid_Movement_Codes,i);
					String movement_Code_text = getTextwithoutfail(driver, movementcode);
					if(!movement_Code_text.contains("Equipment No:") && !movement_Code_text.equals("null")) {
						expectednumber++;
					}else if(movement_Code_text.equals("null")) {
						break;
					}
					mouseOverToElement(driver, movementcode);
					click(driver, movementcode);
				}	
				if(expectednumber==numberValue) {
					System.out.println("Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
					Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
				}else {
					System.out.println("Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber);
					Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + numberValue + " || Actual Report Activity is : " + expectednumber, test,test1);
				}
			}
			Step_End(5, "movement detail should shown in grid based on Equipment no", test, test1);
			Extent_completed(testCase_Name, test, test1);
		}
	}
}
