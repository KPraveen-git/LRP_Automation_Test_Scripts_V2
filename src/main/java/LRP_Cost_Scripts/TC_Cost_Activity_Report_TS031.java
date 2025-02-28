package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS031 extends Keywords{
	
	public void  Cost_Activity_Report_TS031(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS031";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);
		
		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String AgencyUser = data.get("AgencyUser");
		
		String CAR_Retrieve_Type = data.get("CAR_Retrieve_Type");
		String CAR_Retrieve_Condition = data.get("CAR_Retrieve_Condition");
		String CAR_Number_Retrieve = data.get("CAR_Number_Retrieve");
		String Remarks_Value = data.get("Remarks_Value");
		String Remarks_Updated_Popup = data.get("Remarks_Updated_Popup");

		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);

		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency ", test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select the required agency ", test, test1);

		Step_Start(2, "Enter the screen name as \"Cost Activity Report\" in module search field. ", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as \"Cost Activity Report\" in module search field. ", test, test1);

		Step_Start(3, "Click on the global search option which is available in the tool bar.  ", test, test1);
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		Step_End(3, "Click on the global search option which is available in the tool bar. ", test, test1);
		
		Step_Start(4, "Check whether it opens a new search window. ", test, test1);
		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, CAR_Retrieve_Type);
		Step_End(4, "Check whether it opens a new search window. ", test, test1);
		
		Step_Start(5, ".Enter the required CAR No. in the CAR No search field.  ", test, test1);
		waitForElement(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, CAR_Retrieve_Condition);
		waitForElement(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, CAR_Number_Retrieve);
		Step_End(5, ".Enter the required CAR No. in the CAR No search field.", test, test1);
		
		Step_Start(6, "Then click on the search button.       ", test, test1);
		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);
		Step_End(6, "Then click on the search button.       ", test, test1);
		
		Step_Start(7, "System will show the CAR No. and Click on the select button. ", test, test1);
		waitForElement(driver, First_Row_select);
		click(driver, First_Row_select);
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		Step_End(7, "System will show the CAR No. and Click on the select button.", test, test1);
		
		Step_Start(8, ".System will retrieve the CAR. ", test, test1);
		waitForElement(driver, Remarks_Tab_CAR);
		Step_End(8, ".System will retrieve the CAR. ", test, test1);
		
		Step_Start(9, "Click on the edit option in the toolbar. ", test, test1);
		waitForElement(driver, Edit_Button_toolBar);
		click(driver,Edit_Button_toolBar);
		Step_End(9, "Click on the edit option in the toolbar. ", test, test1);
		
		Step_Start(10, "Click on the remarks tab.", test, test1);
		waitForElement(driver, Remarks_Tab_CAR);
		click(driver,Remarks_Tab_CAR);
		Step_End(10, "Click on the remarks tab.", test, test1);
		
		Step_Start(11, "Enter the required remarks", test, test1);
		waitForElement(driver, Remarks_Text_Area_CAR);
		sendKeys(driver, Remarks_Text_Area_CAR, Remarks_Value);
		Step_End(11, "Enter the required remarks", test, test1);
		
		Step_Start(12, "Click on the save option.", test, test1);
		waitForElement(driver, Save_button_toolBar);
		click(driver,Save_button_toolBar);
		Step_End(12, "Click on the save option.", test, test1);
		
		Step_Start(13, "System validates as 'Container Activity Report Updated' ", test, test1);
		waitForElement(driver, popup_Message);
		String PopupText_Act=getText(driver, popup_Message);
		
		if(PopupText_Act.equals(Remarks_Updated_Popup)) {
			System.out.println("Popup Matched  ||   Expected : "+Remarks_Updated_Popup+"   ||   Actual   : "+PopupText_Act);
			Extent_pass(driver, "Popup Matched  ||   Expected : "+Remarks_Updated_Popup+"   ||   Actual   : "+PopupText_Act, test, test1);
		}else {
			System.out.println("Popup Not Matched  ||   Expected : "+Remarks_Updated_Popup+"   ||   Actual   : "+PopupText_Act);
			Extent_fail(driver, "Popup Not Matched  ||   Expected : "+Remarks_Updated_Popup+"   ||   Actual   : "+PopupText_Act, test, test1);
		}
		Step_End(13, "System validates as 'Container Activity Report Updated' ", test, test1);
		
		Step_Start(14, "Click on the ok option. ", test, test1);
		waitForElement(driver, popup_Message_Ok_Button);
		click(driver,popup_Message_Ok_Button);
		Step_End(14, "Click on the ok option. ", test, test1);
		
		Step_Start(15, "Then click on the remarks tab. ", test, test1);
		waitForElement(driver, Remarks_Tab_CAR);
		click(driver,Remarks_Tab_CAR);
		Step_End(15, "Then click on the remarks tab. ", test, test1);
		
		String ExpDate=getCurrentDateNew();
		
		Step_Start(16, "Ensure that given remarks is entered in the grid with  Remarks by and Remarks on data.", test, test1);
		waitForElement(driver, Remarks_Row_CAR);
		List<WebElement> remarks_values_Row=listOfElements(driver, Remarks_Row_CAR);
		int lastSize_=remarks_values_Row.size();
		
		String Remarks_Name=String.format(Remarks_Values_Last_CAR, lastSize_);
		String Remarks_Added_Last=getText(driver, Remarks_Name);
		
		String Remarks_User=String.format(Remarks_User_Last_CAR, lastSize_);
		String Remarks_User_Last=getText(driver, Remarks_User);
		
		String Remarks_Date=String.format(Remarks_Date_Last_CAR, lastSize_);
		String Remarks_Date_Last=getText(driver, Remarks_Date);
		
		if(Remarks_Value.equals(Remarks_Added_Last)) {
			System.out.println("Remarks Matched || Expected  : "+Remarks_Value+"   Actual : "+Remarks_Added_Last);
			Extent_pass(driver, "Remarks Matched || Expected  : "+Remarks_Value+"   Actual : "+Remarks_Added_Last, test, test1);
		}else {
			System.out.println("Remarks Not Matched || Expected  : "+Remarks_Value+"   Actual : "+Remarks_Added_Last);
			Extent_fail(driver, "Remarks Not Matched || Expected  : "+Remarks_Value+"   Actual : "+Remarks_Added_Last, test, test1);
		}
		
		if(Remarks_User_Last.equalsIgnoreCase(username)) {
			System.out.println("Remarks By Matched || Expected  : "+username+"   Actual : "+Remarks_User_Last);
			Extent_pass(driver, "Remarks By Matched || Expected  : "+username+"   Actual : "+Remarks_User_Last, test, test1);
		}else {
			System.out.println("Remarks By Not Matched || Expected  : "+username+"   Actual : "+Remarks_User_Last);
			Extent_fail(driver, "Remarks By Not Matched || Expected  : "+username+"   Actual : "+Remarks_User_Last, test, test1);
		}
		
		if(Remarks_Date_Last.contains(ExpDate)) {
			System.out.println("Remarks On Matched || Expected  : "+ExpDate+"   Actual : "+Remarks_Date_Last);
			Extent_pass(driver, "Remarks On Matched || Expected  : "+ExpDate+"   Actual : "+Remarks_Date_Last, test, test1);
		}else {
			System.out.println("Remarks On Not Matched || Expected  : "+ExpDate+"   Actual : "+Remarks_Date_Last);
			Extent_fail(driver, "Remarks On Not Matched || Expected  : "+ExpDate+"   Actual : "+Remarks_Date_Last, test, test1);
		}
		Step_End(16, "Ensure that given remarks is entered in the grid with  Remarks by and Remarks on data.", test, test1);
		
		Extent_completed(tc_Name, test, test1);
		
	}

}
