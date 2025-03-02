package LRP_EMS_Individual_Scripts;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Enquiry_History_Locators;

public class TC_Enquiry_History_TS026 extends Keywords{

	public void EnquiryHistoryTS026(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) {
		String testCase_Name="TC_Enquiry_History_TS026";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCase_Name);
		String url = TestNgXml.getdatafromExecution().get(testCase_Name);
		String Sheet_Name_026 = TestNgXml.getsheetName_FromExecution().get(testCase_Name);
		Map<String, String> Excel_data = Utils.GetAllData(Sheet_Name_026, testCase_Name, "Dataset"+selected_dataset, File_Path);


		String user_Name = Excel_data.get("Userid");
		String pass_word = Excel_data.get("PassWord");
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

		navigateUrl(driver, url);
		//Login	waitForElement(driver, Username_input);
		LRP_Login(driver, user_Name, pass_word);
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
		String Equip_Type_Select = String.format(Enquiry_History_Locators.Equip_Type_Select,  equipmentType_Input); 
		String Radio_Btn_Select = String.format(Enquiry_History_Locators.Radio_Btn_Select,  Container_Type_Radio_Button);
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
				String movement =  String.format(Enquiry_History_Locators.movement_Value,i); 
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
			String Booking_value =  String.format(Enquiry_History_Locators.P_bookingNo_Text,equipmentNo_TxtField_Input);
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
					String movementcode =  String.format(Enquiry_History_Locators.movementcode,i);
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
}
}
