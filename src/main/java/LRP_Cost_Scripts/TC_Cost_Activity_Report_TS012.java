package LRP_Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS012 extends Keywords{

	public void  Cost_Activity_Report_TS012(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS012";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String AgencyUser = data.get("AgencyUser");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		
		String CAR_Retrieve_Type1 = data.get("CAR_Retrieve_Type1");
		String CAR_Retrieve_Condition1 = data.get("CAR_Retrieve_Condition1");
		String CAR_Number_Retrieve_Value1 = data.get("CAR_Number_Retrieve_Value1");

		String CAR_Retrieve_Type2 = data.get("CAR_Retrieve_Type2");
		String CAR_Number_Retrieve_Value2 = data.get("CAR_Number_Retrieve_Value2");
		String CAR_Retrieve_Type3 = data.get("CAR_Retrieve_Type3");
		String CAR_Number_Retrieve_Value3 = data.get("CAR_Number_Retrieve_Value3");
		
		String Add_Activity_Name = data.get("Add_Activity_Name");
		String Add_Qunatity_new_Activity = data.get("Add_Qunatity_new_Activity");

		String Equipment_Select_Header = data.get("Equipment_Select_Header");
		String Equipment_Select_Condition = data.get("Equipment_Select_Condition");
		String Select_Equipment_Value = data.get("Select_Equipment_Value");
		
		String Vendor_Select_Head = data.get("Vendor_Select_Head");
		String Vendor_Select_Condition = data.get("Vendor_Select_Condition");
		String Add_VendorCode_Value = data.get("Add_VendorCode_Value");
		String Add_Amount_new_Activity = data.get("Add_Amount_new_Activity");

		String Activity_updated_Popup = data.get("Activity_updated_Popup");

		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		
		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
		
		Step_Start(2, "Enter the screen name as \"Cost Activity Report\" in module search field", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as \"Cost Activity Report\" in module search field", test, test1);
		
		Step_Start(3, "Click on the global search option which is available in the tool bar.", test, test1);
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		Step_End(3, "Click on the global search option which is available in the tool bar.", test, test1);
		
		Step_Start(4, "Check whether it opens a new search window.", test, test1);
		waitForElement(driver, type_Select1);
		Step_End(4, "Check whether it opens a new search window.", test, test1);
		
		Step_Start(5, "Enter the saved CAR No in the CAR No search field", test, test1);
		Step_Start(6, "Then click on the search button", test, test1);
		Step_Start(7, "System will show the CAR No", test, test1);
		Step_Start(8, "Click on the select button", test, test1);
		globalValueSearchWindow(driver,CAR_Retrieve_Condition1,CAR_Retrieve_Type1,CAR_Number_Retrieve_Value1,CAR_Retrieve_Type2,CAR_Number_Retrieve_Value2,CAR_Retrieve_Type3,CAR_Number_Retrieve_Value3);
		Step_End(8, "Click on the select button", test, test1);
		Step_End(7, "System will show the CAR No", test, test1);
		Step_End(6, "Then click on the search button", test, test1);
		Step_End(5, "Enter the saved CAR No in the CAR No search field", test, test1);
		
		Step_Start(9, ".System will retrieve the CAR. ", test, test1);
		waitForElement(driver, CAR_Number_Input_CAR);
		Step_End(9, ".System will retrieve the CAR. ", test, test1);
		
		Step_Start(10, "Click on the tool bar edit option.  ", test, test1);
		waitForElement(driver, Edit_Button_toolBar);
		click(driver,Edit_Button_toolBar);
		Step_End(10, "Click on the tool bar edit option.  ", test, test1);
		
		Step_Start(11, "Click on the Add button and system will list down the activities in new window ", test, test1);
		waitForElement(driver, ADD_button_MSC_CAR);
		click(driver,ADD_button_MSC_CAR);
		Step_End(11, "Click on the Add button and system will list down the activities in new window ", test, test1);
		
		Step_Start(12, "Select the activities by clicking on the check box ", test, test1);
		String SelectActivity=String.format(Select_Activity_Column_CAR, Add_Activity_Name);
		waitForElement(driver, SelectActivity);
		click(driver,SelectActivity);
		Step_End(12, "Select the activities by clicking on the check box ", test, test1);
		
		Step_Start(13, "Click on the select button.", test, test1);
		waitForElement(driver, Select_button_MSC_CAR);
		click(driver,Select_button_MSC_CAR);
		Step_End(13, "Click on the select button.", test, test1);
		
		Step_Start(14, ".The selected activities will set in the AG Grid. ", test, test1);
		String UpdatedActivity=String.format(MSC_table_Activity_Column_CAR, Add_Activity_Name);
		if(isDisplayed(driver, UpdatedActivity)) {
			System.out.println("Selected Activity '"+Add_Activity_Name+"' is Updated in the Table");
			Extent_pass(driver, "Selected Activity '"+Add_Activity_Name+"' is Updated in the Table", test, test1);
		}else {
			System.out.println("Selected Activity '"+Add_Activity_Name+"' is not Updated in the Table");
			Extent_fail(driver, "Selected Activity '"+Add_Activity_Name+"' is not Updated in the Table", test, test1);
		}
		Step_End(14, ".The selected activities will set in the AG Grid. ", test, test1);
		
		Step_Start(15, "Then select the activities in AG grid and Enter the required quantity", test, test1);
		String UpdatedActivityQuantColumn=String.format(MSC_table_Quantity_Column_CAR, Add_Activity_Name);
		waitForElement(driver, UpdatedActivityQuantColumn);
		doubleClick(driver, UpdatedActivityQuantColumn);
		
		String UpdatedActivityQuan=String.format(MSC_table_Quantity_input_CAR, Add_Activity_Name);
		waitForElement(driver, UpdatedActivityQuan);
		sendKeys(driver, UpdatedActivityQuan, Add_Qunatity_new_Activity);
		Step_End(15, "Then select the activities in AG grid and Enter the required quantity", test, test1);
		
		Step_Start(16, "Click on the Eqp. type button and system will list down the activities in new window.", test, test1);
		String UpdatedActivityCol=String.format(MSC_table_Activity_Column_CAR, Add_Activity_Name);
		waitForElement(driver, UpdatedActivityCol);
		click(driver,UpdatedActivityCol);
		
		waitForElement(driver, MSC_Equipment_Type_Button_CAR);
		click(driver,MSC_Equipment_Type_Button_CAR);
		Step_End(16, "Click on the Eqp. type button and system will list down the activities in new window.", test, test1);
		
		Step_Start(17, "Select the required Equipment type and click on the select button", test, test1);
		twoColumnSearchWindow(driver,Equipment_Select_Header,Equipment_Select_Condition,Select_Equipment_Value);
		Step_End(17, "Select the required Equipment type and click on the select button", test, test1);
		
		Step_Start(18, "Check whether the equipment type is set in the activity and click on the vendor code button,system will listdown the vendor details in new window.  ", test, test1);
		String Selected_EqpType=String.format(MSC_Table_EqpType_Column_CAR, Add_Activity_Name);
		waitForElement(driver, Selected_EqpType);
		String Updated_EpqType=getText(driver, Selected_EqpType);
		if(Updated_EpqType.equals(Select_Equipment_Value)) {
			System.out.println("Selected Eqp Type is updated Correctly in the Table");
			Extent_pass(driver, "Selected Eqp Type is updated Correctly in the Table", test, test1);
		}else {
			System.out.println("Selected Eqp Type is not updated Correctly in the Table");
			Extent_fail(driver, "Selected Eqp Type is not updated Correctly in the Table", test, test1);
		}
		Step_End(18, "Check whether the equipment type is set in the activity and click on the vendor code button,system will listdown the vendor details in new window.  ", test, test1);

		Step_Start(19, "Select the required vendor code ", test, test1);
		waitForElement(driver, MSC_Vendor_Code_Button_CAR);
		click(driver,MSC_Vendor_Code_Button_CAR);
		
		twoColumnSearchWindow(driver,Vendor_Select_Head,Vendor_Select_Condition,Add_VendorCode_Value);

		String Selected_VendorCode=String.format(MSC_Table_Vendor_Code_Column_CAR, Add_Activity_Name);
		waitForElement(driver, Selected_VendorCode);
		String Updated_VendorCode=getText(driver, Selected_VendorCode);
		if(Updated_VendorCode.equals(Add_VendorCode_Value)) {
			System.out.println("Selected Vendor Code is updated Correctly in the Table");
			Extent_pass(driver, "Selected Vendor Code is updated Correctly in the Table", test, test1);
		}else {
			System.out.println("Selected Vendor Code is not updated Correctly in the Table");
			Extent_fail(driver, "Selected Vendor Code is not updated Correctly in the Table", test, test1);
		}
		Step_End(19, "Select the required vendor code ", test, test1);
		
		Step_Start(20, ".Enter the required amount. ", test, test1);
		String Activity_Amount_Col=String.format(MSC_Table_Amount_Column_CAR, Add_Activity_Name);
		waitForElement(driver, Activity_Amount_Col);
		doubleClick(driver,Activity_Amount_Col);
		
		String Activity_Amount_Input=String.format(MSC_Table_Amount_Input_CAR, Add_Activity_Name);
		waitForElement(driver, Activity_Amount_Input);
		clear(driver,Activity_Amount_Input);
		waitForElement(driver, Activity_Amount_Input);
		sendKeys(driver, Activity_Amount_Input,Add_Amount_new_Activity);
	    UpdatedActivityQuantColumn=String.format(MSC_table_Quantity_Column_CAR, Add_Activity_Name);
		waitForElement(driver, UpdatedActivityQuantColumn);
		click(driver,UpdatedActivityQuantColumn);
		Step_End(20, ".Enter the required amount. ", test, test1);

		Step_Start(21, "Click on the tool bar save option.  ", test, test1);
		waitForElement(driver, SaveButton_ToolBar);
		click(driver,SaveButton_ToolBar);
		Step_End(21, "Click on the tool bar save option.  ", test, test1);
		
		Step_Start(22, "System should update the activity the new activity along with the message popup \"Container Activity Report updated\". ", test, test1);
		waitForElement(driver, popup_Message);
		String Popup_Text_Act=getText(driver, popup_Message);
		
		if(Popup_Text_Act.equals(Activity_updated_Popup)) {
			System.out.println("Popup Matched  ||   Expected : "+Activity_updated_Popup+"   ||   Actual   : "+Popup_Text_Act);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+Activity_updated_Popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+Activity_updated_Popup+"   ||   Actual   : "+Popup_Text_Act);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Activity_updated_Popup+"   ||   Actual   : "+Popup_Text_Act, test, test1);
		}

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver,popup_Message_Ok_Button);
		
		Step_End(22, "System should update the activity the new activity along with the message popup \"Container Activity Report updated\". ", test, test1);

		
		Extent_completed(tc_Name, test, test1);		
		
	}
	
}
