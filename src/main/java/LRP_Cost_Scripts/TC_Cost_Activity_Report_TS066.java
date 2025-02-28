package LRP_Cost_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import locators.Cost_Activity_Report_Locators;

public class TC_Cost_Activity_Report_TS066 extends Keywords{

	public void  Cost_Activity_Report_TS066(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS066";
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
		String related_Car_Number = data.get("related_Car_Number");
		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		Step_Start(1, "Once login to the application and click on switch profile option and select for the required agency", test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select for the required agency", test, test1);

		Step_Start(2, "Enter the screen name as \"Cost Activity Report\" in module search field", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as \"Cost Activity Report\" in module search field", test, test1);
		
		Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);
		
		Step_Start(4, "Check whether it opens a new search window", test, test1);
		waitForElement(driver, type_Select1);
		Step_End(4, "Check whether it opens a new search window", test, test1);
		
		Step_Start(5, "Enter the required CAR No. in the CAR No search field", test, test1);
		selectByText(driver, type_Select1, CAR_Retrieve_Type);
		waitForElement(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, CAR_Retrieve_Condition);
		waitForElement(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, CAR_Number_Retrieve);
		Step_End(5, "Enter the required CAR No. in the CAR No search field", test, test1);
		
		
		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);
		waitForElement(driver, First_Row_click);
		click(driver, First_Row_click);
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		
		Step_Start(6, "System will show the details of CAR generated with the same service, vessel, voyage", test, test1);
		waitForElement(driver, Service_TF);
		String Service= getAttribute(driver, Service_TF, "value");
		System.out.println("Service :"+Service);
		
		waitForElement(driver, vessel_TF);
		String vessel= getAttribute(driver, vessel_TF, "value");
		System.out.println("vessel :"+vessel);
		
		waitForElement(driver, port_TF);
		String port= getAttribute(driver, port_TF, "value");
		System.out.println("port :"+port);
		
		waitForElement(driver, terminal_TF);
		String terminal= getAttribute(driver, terminal_TF, "value");
		System.out.println("terminal :"+terminal);
		
		waitForElement(driver, voyage_Bound_TF);
		String voyageBound= getAttribute(driver, voyage_Bound_TF, "value");
		System.out.println("voyageBound :"+voyageBound);
		
		
		
		waitForElement(driver, Related_Tab_Click);
		click(driver, Related_Tab_Click);
		
		String related_Car =  String.format(Cost_Activity_Report_Locators.related_Number_Select,  related_Car_Number); 
        waitForElement(driver, related_Car);
        doubleClick(driver, related_Car);
        
        
        String[] parts = related_Car_Number.split("-"); 
        String expected_Number = parts[1] + "-" + parts[2];

        System.out.println("expected_Number :"+expected_Number); 
        
		waitForElement(driver, Launch_Tab_Yes_Button);
		click(driver, Launch_Tab_Yes_Button);
		
		switchtotab(driver, 1);
		
		waitForElement(driver, Car_No_New_Tab_TF);
		String Actual_Number=getAttribute(driver, Car_No_New_Tab_TF, "value");
		System.out.println("Actual_Number :"+Actual_Number);
		
		waitForElement(driver, Service_TF);
		String Service_New_Tab= getAttribute(driver, Service_TF, "value");
		System.out.println("Service_New_Tab :"+Service_New_Tab);
		
		waitForElement(driver, vessel_TF);
		String vessel_New_Tab= getAttribute(driver, vessel_TF, "value");
		System.out.println("vessel_New_Tab :"+vessel_New_Tab);
		
		waitForElement(driver, port_TF);
		String port_New_Tab= getAttribute(driver, port_TF, "value");
		System.out.println("port_New_Tab :"+port_New_Tab);
		
		waitForElement(driver, terminal_TF);
		String terminal_New_Tab= getAttribute(driver, terminal_TF, "value");
		System.out.println("terminal_New_Tab :"+terminal_New_Tab);
		
		waitForElement(driver, voyage_Bound_TF);
		String voyageBound_New_Tab= getAttribute(driver, voyage_Bound_TF, "value");
		System.out.println("voyageBound_New_Tab :"+voyageBound_New_Tab);
		
		
		
		if(expected_Number.equals(Actual_Number)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + expected_Number+ " || Actual Report Activity is : " + Actual_Number);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + expected_Number+ " || Actual Report Activity is : " + Actual_Number, test,test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + expected_Number+ " || Actual Report Activity is : " + Actual_Number);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + expected_Number+ " || Actual Report Activity is : " + Actual_Number, test,test1);
		}
		
		
		if(Service.equals(Service_New_Tab)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + Service+ " || Actual Report Activity is : " + Service_New_Tab);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Service+ " || Actual Report Activity is : " + Service_New_Tab, test,test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + Service+ " || Actual Report Activity is : " + Service_New_Tab);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Service+ " || Actual Report Activity is : " + Service_New_Tab, test,test1);
		}
		
		if(vessel.equals(vessel_New_Tab)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + vessel+ " || Actual Report Activity is : " + vessel_New_Tab);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + vessel+ " || Actual Report Activity is : " + vessel_New_Tab, test,test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + vessel+ " || Actual Report Activity is : " + vessel_New_Tab);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + vessel+ " || Actual Report Activity is : " + vessel_New_Tab, test,test1);
		}
		
		if(port.equals(port_New_Tab)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + port+ " || Actual Report Activity is : " + port_New_Tab);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + port+ " || Actual Report Activity is : " + port_New_Tab, test,test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + port+ " || Actual Report Activity is : " + port_New_Tab);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + port+ " || Actual Report Activity is : " + port_New_Tab, test,test1);
		}
		
		if(terminal.equals(terminal_New_Tab)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + terminal+ " || Actual Report Activity is : " + terminal_New_Tab);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + terminal+ " || Actual Report Activity is : " + terminal_New_Tab, test,test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + terminal+ " || Actual Report Activity is : " + terminal_New_Tab);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + terminal+ " || Actual Report Activity is : " + terminal_New_Tab, test,test1);
		}
		
		if(voyageBound.equals(voyageBound_New_Tab)) {
			System.out.println("Matched || " + " Expected Report Activity is : " + voyageBound+ " || Actual Report Activity is : " + voyageBound_New_Tab);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + voyageBound+ " || Actual Report Activity is : " + voyageBound_New_Tab, test,test1);
		} else {
			System.out.println("Not Matched || " + " Expected Report Activity is : " + voyageBound+ " || Actual Report Activity is : " + voyageBound_New_Tab);
			Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + voyageBound+ " || Actual Report Activity is : " + voyageBound_New_Tab, test,test1);
		}
		
		Step_End(6, "System will show the details of CAR generated with the same service, vessel, voyage", test, test1);
		
		Extent_completed(tc_Name, test, test1);
		
	}

}
