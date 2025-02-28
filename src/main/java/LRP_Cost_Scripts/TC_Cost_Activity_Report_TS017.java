package LRP_Cost_Scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS017 extends Keywords{

	
	public void  Cost_Activity_Report_TS017(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS017";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String CAR_Approval_Module = data.get("CAR_Approval_Module");
	
		String Change_Expensive_Value = data.get("Change_Expensive_Value");
		String User_Updated_Popup = data.get("User_Updated_Popup");

		
		Extent_Start(tc_Name, test, test1);
		
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		
		Step_Start(1, "Enter the screen name as 'User car approval limit' in the module search field", test, test1);
		moduleNavigate(driver, CAR_Approval_Module);
		Step_End(1, "Enter the screen name as 'User car approval limit' in the module search field", test, test1);
		
		Step_Start(2, "Enter the required username in the ag grid filter option and select the username and double click on it.", test, test1);
		waitForElement(driver, UserName_Filter_Input_UCA);
		sendKeys(driver, UserName_Filter_Input_UCA, username);
		
		waitForElement(driver, Approval_LimitTable_UCA);
		String SelectColumn=String.format(Filtered_Username_Column_UCA, username.toLowerCase());;
		waitForElement(driver, SelectColumn);
		doubleClick(driver, SelectColumn);
		Step_End(2, "Enter the required username in the ag grid filter option and select the username and double click on it.", test, test1);

		Step_Start(3, "Click edit option in the toolbar and give the required expense type. ", test, test1);
		waitForElement(driver, Edit_Button_toolBar);
		click(driver,Edit_Button_toolBar);
		
		waitForElement(driver, ExpensiveType_Input);
		clear(driver,ExpensiveType_Input);
		sendKeys(driver, ExpensiveType_Input, Change_Expensive_Value);
		List<String> Change_ExpensiveTypes=splitAndExpand(Change_Expensive_Value);
		Step_End(3, "Click edit option in the toolbar and give the required expense type. ", test, test1);

		Step_Start(4, "Then click save option from the toolbar. System validates an information message as 'Updated Successfully'.", test, test1);
		waitForElement(driver, SaveButton_ToolBar);
		click(driver,SaveButton_ToolBar);
		
		waitForElement(driver, popup);
		String popupText_Act=getText(driver, popup);
		if(popupText_Act.equals(User_Updated_Popup)) {
			System.err.println("Popup Matched  ||  Expected   : "+User_Updated_Popup+"    ||   Actual : "+popupText_Act);
			Extent_pass(driver, "Popup Matched  ||  Expected   : "+User_Updated_Popup+"    ||   Actual : "+popupText_Act, test, test1);
		}else {
			System.err.println("Popup Not Matched  ||  Expected   : "+User_Updated_Popup+"    ||   Actual : "+popupText_Act);
			Extent_fail(driver, "Popup Not Matched  ||  Expected   : "+User_Updated_Popup+"    ||   Actual : "+popupText_Act, test, test1);
		}
		Step_End(4, "Then click save option from the toolbar. System validates an information message as 'Updated Successfully'.", test, test1);

		Step_Start(5, "Then logout the application and relogin it. Next enter the screen name as 'Cost activity report' in module search field and check whether the mapped expense types are shown in the contract type dropdown.", test, test1);
		waitForElement(driver, Logout_Icon);
		click(driver,Logout_Icon);
		
		waitForElement(driver, Logout_Yes_Btn);
		click(driver,Logout_Yes_Btn);
		waitForDisplay(driver, Login);
		alertAccept(driver);
		
		LRP_Login(driver, username, password);
		verifyMainMenu(driver);
		
		moduleNavigate(driver, Cost_Activity_Report_Module);
		
		waitForElement(driver, Contract_Type_Input_CAR);
		click(driver,Contract_Type_Input_CAR);
		
		waitForElement(driver, Contract_Type_Options_CAR);
		List<WebElement>  ContarctOptionsList=listOfElements(driver, Contract_Type_Options_CAR);
		List<String> Contract_Types_Options=new ArrayList<String>();
		for(WebElement col:ContarctOptionsList) {
			Contract_Types_Options.add(col.getText());
		}
		
		if(compareLists(Change_ExpensiveTypes,Contract_Types_Options)) {
			System.out.println("Contract Type Options Matched ||   Expected  : "+Change_ExpensiveTypes+"   ||   Actual   : "+Contract_Types_Options);
			Extent_pass(driver, "Contract Type Options Matched ||   Expected  : "+Change_ExpensiveTypes+"   ||   Actual   : "+Contract_Types_Options, test, test1);
		}else {
			System.out.println("Contract Type Options Not Matched ||   Expected  : "+Change_ExpensiveTypes+"   ||   Actual   : "+Contract_Types_Options);
			Extent_fail(driver, "Contract Type Options Not Matched ||   Expected  : "+Change_ExpensiveTypes+"   ||   Actual   : "+Contract_Types_Options, test, test1);
		}
		
		Step_End(5, "Then logout the application and relogin it. Next enter the screen name as 'Cost activity report' in module search field and check whether the mapped expense types are shown in the contract type dropdown.", test, test1);

		Extent_completed(tc_Name, test, test1);
		
		
	}
	
}
