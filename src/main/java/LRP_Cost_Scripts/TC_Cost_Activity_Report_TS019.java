package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS019 extends Keywords{
	
	
	public void  Cost_Activity_Report_TS019(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS019";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String AgencyUser = data.get("AgencyUser");
		
		String Select_Contract_type_Value = data.get("Select_Contract_type_Value");
		String Select_Mode_type = data.get("Select_Mode_type");
		
		String Service_Header = data.get("Service_Header");
		String Service_Code = data.get("Service_Code");
		
		String Vessel_Header = data.get("Vessel_Header");
		String Vessel_Code = data.get("Vessel_Code");
		
		String Port_Header = data.get("Port_Header");
		String Port_Code = data.get("Port_Code");
		
		String Terminal_Header = data.get("Terminal_Header");
		String Terminal_Code = data.get("Terminal_Code");
		String Service_details_Codition = data.get("Service_details_Codition");
		String Arrival_Date_Header = data.get("Arrival_Date_Header");
		String Arrival_Date_Condition = data.get("Arrival_Date_Condition");
		String Arrival_Date_Value = data.get("Arrival_Date_Value");
		
		String UnPredictable_Table_Filter_Headers = data.get("UnPredictable_Table_Filter_Headers");

		String Popup_Text_Exp = data.get("Popup_Text_Exp");
		
		String Predictable_Activity_Module = data.get("Predictable_Activity_Module");
		String Predictable_Select_Type = data.get("Predictable_Select_Type");
		String Predictable_Select_Codition = data.get("Predictable_Select_Codition");
		String Main_Activity_Name = data.get("Main_Activity_Name");
		String Sub_Activity_Name = data.get("Sub_Activity_Name");
		String Activity_Add_Condition = data.get("Activity_Add_Condition");
		String Activity_Header_Predictable = data.get("Activity_Header_Predictable");

		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		
		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);

		Step_Start(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as 'Cost Activity Report' in module search field.", test, test1);
		
		waitForElement(driver, Contract_Type_Input_CAR);
		click(driver,Contract_Type_Input_CAR);
		
		String SelectContract=String.format(Select_Contract_Type_CAR, Select_Contract_type_Value);
		waitForElement(driver, SelectContract);
		click(driver,SelectContract);
		
		waitForElement(driver, Mode_Select_Input_CAR);
		click(driver,Mode_Select_Input_CAR);
		
		String SelectModeValue=String.format(Select_Mode_type_CAR, Select_Mode_type);
		waitForElement(driver, SelectModeValue);
		click(driver,SelectModeValue);
		
		Step_Start(3, "Click on the Service search button and select the required service code.   ", test, test1);
		waitForElement(driver, Service_Search_Btn_CAR);
		click(driver,Service_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Service_Header,Service_details_Codition,Service_Code);
		Step_End(3, "Click on the Service search button and select the required service code.   ", test, test1);
		
		Step_Start(4, "Click on the Vessel search button and select the required vessel code.  ", test, test1);
		waitForElement(driver, Vessel_Search_Btn_CAR);
		click(driver,Vessel_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Vessel_Header,Service_details_Codition,Vessel_Code);
		Step_End(4, "Click on the Vessel search button and select the required vessel code.  ", test, test1);
		
		Step_Start(5, "Click on the Port search button and select the required port code.", test, test1);
		waitForElement(driver, Port_Search_Btn_CAR);
		click(driver,Port_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Port_Header,Service_details_Codition,Port_Code);
		Step_End(5, "Click on the Port search button and select the required port code.", test, test1);
		
		Step_Start(6, "Click on the Terminal search button and select the required terminal code.", test, test1);
		waitForElement(driver, Terminal_Search_Btn_CAR);
		click(driver,Terminal_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Terminal_Header,Service_details_Codition,Terminal_Code);
		Step_End(6, "Click on the Terminal search button and select the required terminal code.", test, test1);
		
		Step_Start(7, ".Click on the Arrival date search button and select the required date.", test, test1);
		waitForElement(driver, Arrival_Date_Search_Btn_CAR);
		click(driver,Arrival_Date_Search_Btn_CAR);
		twoColumnSearchWindow(driver,Arrival_Date_Header,Arrival_Date_Condition,Arrival_Date_Value);
		Step_End(7, ".Click on the Arrival date search button and select the required date.", test, test1);
		
		Step_Start(8, "Click on the Show button and Click on the Predictable Reporting tab.", test, test1);
		waitForElement(driver, Show_Button_CAR);
		click(driver,Show_Button_CAR);
		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		
		Step_End(8, "Click on the Show button and Click on the Predictable Reporting tab.", test, test1);
		
		Step_Start(9, "Check whether the required activity is present in the predictable reporting tab. If not click the contract used option. A new window will be opened and can see the activity behaviour template id.Copy the ID number.", test, test1);
		waitForElement(driver, UnPredictable_Tab_CAR);
		click(driver,UnPredictable_Tab_CAR);
		
		waitForElement(driver, UnPredictable_Table_CAR);
		
		waitForElement(driver, Column_SelectMenu);
		click(driver, Column_SelectMenu);
		waitForElement(driver, Column_Search_Input);
		jsClick(driver, SelectAll_Column_CheckBox);
		if(isdisplayed(driver, UnPredict_Activity_GridCell_CAR)) {
			jsClick(driver, SelectAll_Column_CheckBox);
		}
		List<String> predictable_Headers=splitAndExpand(UnPredictable_Table_Filter_Headers);
		for(String FilterHeader : predictable_Headers) {
			waitForElement(driver, Column_Search_Input);
			clear(driver, Column_Search_Input);
			waitForElement(driver, Column_Search_Input);
			sendKeys(driver, Column_Search_Input,FilterHeader);
		
			String checkbox=String.format(Select_Column_CAR,FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		
		jsClick(driver, Column_SelectMenu);
		
		waitForElement(driver, More_Grid_CAR);
		click(driver, More_Grid_CAR);

		waitForElement(driver, Condition_Filter_CAR);
		click(driver, Condition_Filter_CAR);
		
		waitForElement(driver, Main_Activity_Filter_Input_CAR);
		sendKeys(driver, Main_Activity_Filter_Input_CAR, Main_Activity_Name);
		
		waitForElement(driver, UnPredictable_Table_CAR);
		List<Map<String, String>> UnPredictable_TableData = extractTableDataByColumnWithoutScroll(driver, UnPredictable_Table_CAR);
		System.out.println("UnPredictable_TableData : "+UnPredictable_TableData);
		
		String Main_Activity_Value=getValueByFirstColumnAndHeader(UnPredictable_TableData,"Activity Name",Sub_Activity_Name,"Main Activity");
		String Parent_Code_Value=getValueByFirstColumnAndHeader(UnPredictable_TableData,"Activity Name",Sub_Activity_Name,"Parent Code");
		String Activity_Code_Value=getValueByFirstColumnAndHeader(UnPredictable_TableData,"Activity Name",Sub_Activity_Name,"Activity Code");

		
		waitForElement(driver, Contracts_Used_Btn_CAR);
		click(driver,Contracts_Used_Btn_CAR);

		waitForElement(driver, Contracts_Details_tab_CAR);
		waitForElement(driver, Activity_Behaviour_ID_CAR);
		String Activity_ID_Full=getText(driver, Activity_Behaviour_ID_CAR);
		
		List<String>  Activity_ID_Split=splitAndExpand(Activity_ID_Full, ":");
		String Activity_ID_CAR=Activity_ID_Split.get(1);
		
		waitForElement(driver, Contract_Details_Ok_Btn_CAR);
		click(driver,Contract_Details_Ok_Btn_CAR);
		Step_End(9, "Check whether the required activity is present in the predictable reporting tab. If not click the contract used option. A new window will be opened and can see the activity behaviour template id.Copy the ID number.", test, test1);

		Step_Start(10, "Then enter the screen name as 'Predictable activity behaviour' in module search field.", test, test1);
		moduleNavigate(driver, Predictable_Activity_Module);
		Step_End(10, "Then enter the screen name as 'Predictable activity behaviour' in module search field.", test, test1);

		Step_Start(11, "Then click the global search option in the toolbar, a new window will be poped out", test, test1);
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		Step_End(11, "Then click the global search option in the toolbar, a new window will be poped out", test, test1);

		Step_Start(12, "Enter the copied Template ID in the template number field.    ", test, test1);
		Step_Start(13, "Click on the search option.System will show the details    ", test, test1);
		Step_Start(14, "Then click select option.The template number will be retrieved and details will be shown in the AG grid.", test, test1);

		globalValueSearchWindow(driver,Predictable_Select_Codition,Predictable_Select_Type,Activity_ID_CAR,"","","","");
		
		waitForElement(driver, Predictable_Activity_Table_PAB);
		Step_End(14, "Then click select option.The template number will be retrieved and details will be shown in the AG grid.", test, test1);
		Step_End(13, "Click on the search option.System will show the details    ", test, test1);
		Step_End(12, "Enter the copied Template ID in the template number field.    ", test, test1);
		
		Step_Start(15, "Click on the edit option in the toolbar. Then select the required main activty and right click on it and select the add item option. If main activity is required  click on the add main activity and select the required main activity. ", test, test1);
		waitForElement(driver, Edit_Button_toolBar);
		click(driver,Edit_Button_toolBar);
		
		waitForElement(driver, Predictable_Activity_Table_PAB);
		Step_End(15, "Click on the edit option in the toolbar. Then select the required main activty and right click on it and select the add item option. If main activity is required  click on the add main activity and select the required main activity. ", test, test1);
		
		String MainActivity_Name_Column=String.format(Activity_Name_PAB, Main_Activity_Name);
		Step_Start(16, "Select the check box of the required activty code under the main activty and click on the select option.Then click save option in the toolbar.System validates as \"Predictable activty behaviour updated\" and click on the ok option. ", test, test1);

		if(isDisplayed(driver, MainActivity_Name_Column)) {
			System.out.println("Main Activity is present");
			if(Main_Activity_Value.equals(Parent_Code_Value)) {

				String Activity_Column=String.format(Activity_Column_PAB, Main_Activity_Value);
				waitForElement(driver, Activity_Column);
				click(driver,Activity_Column);
				RightClick(driver, Activity_Column);
				waitForElement(driver, Add_item_PAB);
				click(driver,Add_item_PAB);
				twoColumnSearchWindow(driver,Activity_Header_Predictable,Activity_Add_Condition,Activity_Code_Value);
				
			}else {
				String Activity_Column=String.format(Activity_Column_PAB, Main_Activity_Value);
				waitForElement(driver, Activity_Column);
				
				click(driver,Activity_Column);
				RightClick(driver, Activity_Column);
				waitForElement(driver, Add_item_PAB);
				click(driver,Add_item_PAB);
				twoColumnSearchWindow(driver,Activity_Header_Predictable,Activity_Add_Condition,Parent_Code_Value);
				
				String Parent_Column=String.format(Activity_Column_PAB, Parent_Code_Value);
				waitForElement(driver, Parent_Column);
				click(driver,Parent_Column);
				RightClick(driver, Parent_Column);
				
				waitForElement(driver, Add_item_PAB);
				click(driver,Add_item_PAB);
				twoColumnSearchWindow(driver,Activity_Header_Predictable,Activity_Add_Condition,Activity_Code_Value);
			}
			
		}else {
			System.out.println("Main Activity is not present");
			Extent_fail(driver, "Main Activity is not present", test, test1);
		}
		
		scrollTop(driver);
		waitForElement(driver, Save_button_toolBar);
		click(driver,Save_button_toolBar);
	    
		waitForElement(driver, popup_Message);
		String PopupText_Act=getText(driver, popup_Message);
		
		if(PopupText_Act.equals(Popup_Text_Exp)) {
			System.out.println("Popup Matched  ||   Expected : "+Popup_Text_Exp+"   ||   Actual   : "+PopupText_Act);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+Popup_Text_Exp+"   ||   Actual   : "+PopupText_Act, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+Popup_Text_Exp+"   ||   Actual   : "+PopupText_Act);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Popup_Text_Exp+"   ||   Actual   : "+PopupText_Act, test, test1);
		}
		
		waitForElement(driver, popup_Message_Ok_Button);
		click(driver,popup_Message_Ok_Button);
		Step_End(16, "Select the check box of the required activty code under the main activty and click on the select option.Then click save option in the toolbar.System validates as \"Predictable activty behaviour updated\" and click on the ok option. ", test, test1);

		Step_Start(17, "Then go to Cost activity report and click refresh option. ", test, test1);
		waitForElement(driver, Close_Current_tab);
		click(driver,Close_Current_tab);
		
		waitForElement(driver, Refresh_Button_CAR);
		click(driver,Refresh_Button_CAR);
		Step_End(17, "Then go to Cost activity report and click refresh option. ", test, test1);
		
		Step_Start(18, "Ensure that mapped activty is shown in the predictable reporting tab.   ", test, test1);
		waitForElement(driver, Predictable_Reporting_CAR);
		click(driver,Predictable_Reporting_CAR);
		
		waitForElement(driver, Predictable_Table_CAR);
		
		String PredictableActivity_Column=String.format(Predictable_Activity_Column_CAR, Sub_Activity_Name);
		String MainActivity_Column=String.format(Main_Activity_Column_CAR, Main_Activity_Name);
		
		if(isDisplayed(driver, PredictableActivity_Column)&&isDisplayed(driver, MainActivity_Column)) {
			System.out.println("Activity Added successfully in the Predicatble Activity Table");
			Extent_pass(driver, "Activity Added successfully in the Predicatble Activity Table", test, test1);
		}else {
			System.out.println("Activity Not Added successfully in the Predicatble Activity Table");
			Extent_fail(driver, "Activity Not Added successfully in the Predicatble Activity Table", test, test1);
		}
		Step_End(18, "Ensure that mapped activty is shown in the predictable reporting tab.   ", test, test1);
		
		Extent_completed(tc_Name, test, test1);
		
	
	}

}
