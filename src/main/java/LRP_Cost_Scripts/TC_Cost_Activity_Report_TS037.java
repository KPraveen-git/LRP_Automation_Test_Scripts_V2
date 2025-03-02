package LRP_Cost_Scripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS037 extends Keywords{

	public void  Cost_Activity_Report_TS037(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		
		String tc_Name = "TC_Cost_Activity_Report_TS037";
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
		
		String MSC_Headers_Names = data.get("MSC_Headers_Names");
		
		String Vendor_Invoice_Registration_Module = data.get("Vendor_Invoice_Registration_Module");
		String Vendor_Code_Filter_Type = data.get("Vendor_Code_Filter_Type");
		String Vendor_Code_Filter_Condition = data.get("Vendor_Code_Filter_Condition");
				
		String CAR_Retrieve_Type2 = data.get("CAR_Retrieve_Type2");
		String CAR_Number_Retrieve_Value2 = data.get("CAR_Number_Retrieve_Value2");
		String CAR_Retrieve_Type3 = data.get("CAR_Retrieve_Type3");
		String CAR_Number_Retrieve_Value3 = data.get("CAR_Number_Retrieve_Value3");
		
		Extent_Start(tc_Name, test, test1);
		navigateUrl(driver, url);
		LRP_Login(driver, username, password);

		verifyMainMenu(driver);
		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
		SwitchProfile(driver, AgencyUser);
		Step_End(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);
		
		Step_Start(2, "Enter the screen name as \"Cost Activity Report\" in module search field.", test, test1);
		moduleNavigate(driver, Cost_Activity_Report_Module);
		Step_End(2, "Enter the screen name as \"Cost Activity Report\" in module search field.", test, test1);
		
		Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);
		waitForElement(driver, SearchButton_Toolbar);
		click(driver,SearchButton_Toolbar);
		Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);
		
		Step_Start(4, "Check whether it opens a new search window. ", test, test1);
		Step_Start(5, "Enter the required CAR No. in the CAR No search field", test, test1);
		Step_Start(6, "Then click on the search button", test, test1);
		Step_Start(7, "System will show the CAR No. and Click on the select button", test, test1);

		globalValueSearchWindow(driver,CAR_Retrieve_Condition,CAR_Retrieve_Type,CAR_Number_Retrieve,CAR_Retrieve_Type2,CAR_Number_Retrieve_Value2,CAR_Retrieve_Type3,CAR_Number_Retrieve_Value3);

		Step_End(7, "System will show the CAR No. and Click on the select button", test, test1);
		Step_End(6, "Then click on the search button", test, test1);
		Step_End(5, "Enter the required CAR No. in the CAR No search field", test, test1);
		Step_End(4, "Check whether it opens a new search window. ", test, test1);

		Step_Start(8, "System will retrieve the CAR. ", test, test1);
		waitForElement(driver, CAR_Number_Input_CAR);
		Step_End(8, "System will retrieve the CAR. ", test, test1);
		
		Step_Start(9, "If the activities are invoiced, the activities will be shown in yellow colour. Then go to vendor invoice registration and click on the global search option. Select the vendor invoice number option.Then enter the required value and click on the search option.Then click on the select option. Ensure that the invoiced quantity,invoice amount in expense report matches with the invoice in the vendor invoice registration ", test, test1);
		waitForElement(driver, MSC_Column_Filt_CAR);
		
		click(driver, MSC_Column_Filt_CAR);
		waitForElement(driver, MSC_Filter_input_CAR);
		jsClick(driver, MSC_SelectAll_Checkbox_CAR);
		
		List<String> ExpensiveTable_Headers=splitAndExpand(MSC_Headers_Names);
		for(String FilterHeader : ExpensiveTable_Headers) {
			waitForElement(driver, MSC_Filter_input_CAR);
			clear(driver, MSC_Filter_input_CAR);
			waitForElement(driver, MSC_Filter_input_CAR);
			sendKeys(driver, MSC_Filter_input_CAR,FilterHeader);
		
			String checkbox=String.format(Select_Column_MSC_CAR,FilterHeader);
			waitForDisplay(driver, checkbox);
			jsClick(driver, checkbox);
		}
		
		jsClick(driver, MSC_Column_Filt_CAR);
	
		waitForElement(driver, MSC_Table_CAR);
		List<Map<String, String>> MSC_TableData = extractTableDataByColumnWithoutScroll(driver, MSC_Table_CAR);
		System.out.println("MSC_TableData : "+MSC_TableData);
		
		if(isdisplayed(driver, MSC_Activity_Yellow_Row_CAR)) {
			waitForElement(driver, MSC_Activity_Yellow_Row_CAR);
			String Activity_Name_Yellow=getText(driver, MSC_ActvityName_table_CAR);
			
			String VendorCode_MSC=getValueByFirstColumnAndHeader(MSC_TableData,"Activity",Activity_Name_Yellow,"Vendor Code");
			String VendorinvoiceNumber_MSC=getValueByFirstColumnAndHeader(MSC_TableData,"Activity",Activity_Name_Yellow,"Invoice No");
			List<String> vendor_Invoice_Amounts=getValuesByFirstColumnAndHeader(MSC_TableData,"Activity",Activity_Name_Yellow,"Invoice Amount");
			double inv_Amount_Value=0;
			for(String Ven_Inv_Am:vendor_Invoice_Amounts) {
				String [] AmountValueFull=splitAmount(Ven_Inv_Am,"=");
				String Invoice_Amount_MSC=AmountValueFull[1];
				double amount_Num=Double.parseDouble(Invoice_Amount_MSC);
				inv_Amount_Value=inv_Amount_Value+amount_Num;
			}
			String Invoice_Amount_MSC=String.valueOf(inv_Amount_Value);

			moduleNavigate(driver, Vendor_Invoice_Registration_Module);
			
			waitForElement(driver, SearchButton_Toolbar);
			click(driver,SearchButton_Toolbar);
			
			globalValueSearchWindow(driver,Vendor_Code_Filter_Condition,Vendor_Code_Filter_Type,VendorinvoiceNumber_MSC,"","","","");

			waitForElement(driver, Vendor_Invoice_input_VIR);
			String Invoice_Amount_VIR=getAttribute(driver, Vendor_Invoice_input_VIR, "value");
			
			if(Invoice_Amount_MSC.equals(Invoice_Amount_VIR)) {
				System.out.println("Invoice Amount Matched ||  Expected : "+Invoice_Amount_MSC+" ||  Actual : "+Invoice_Amount_VIR);
				Extent_pass(driver, "Invoice Amount Matched ||  Expected : "+Invoice_Amount_MSC+" ||  Actual : "+Invoice_Amount_VIR, test, test1);
			}else {
				System.out.println("Invoice Amount Not Matched ||  Expected : "+Invoice_Amount_MSC+" ||  Actual : "+Invoice_Amount_VIR);
				Extent_fail(driver, "Invoice Amount Not Matched ||  Expected : "+Invoice_Amount_MSC+" ||  Actual : "+Invoice_Amount_VIR, test, test1);
			}
			
			waitForElement(driver, Vendor_Invoice_Number_Input_VIR);
			String Invoice_No_VIR=getAttribute(driver, Vendor_Invoice_Number_Input_VIR, "value");
			
			if(VendorinvoiceNumber_MSC.equals(Invoice_No_VIR)) {
				System.out.println("Invoice Number Matched ||  Expected : "+VendorinvoiceNumber_MSC+" ||  Actual : "+Invoice_No_VIR);
				Extent_pass(driver, "Invoice Number Matched ||  Expected : "+VendorinvoiceNumber_MSC+" ||  Actual : "+Invoice_No_VIR, test, test1);
			}else {
				System.out.println("Invoice Number Not Matched ||  Expected : "+VendorinvoiceNumber_MSC+" ||  Actual : "+Invoice_No_VIR);
				Extent_fail(driver, "Invoice Number Not Matched ||  Expected : "+VendorinvoiceNumber_MSC+" ||  Actual : "+Invoice_No_VIR, test, test1);
			}
			
			waitForElement(driver, Vendor_Code_Input_VIR);
			String Vendor_Code=getAttribute(driver, Vendor_Code_Input_VIR, "value");
			
			if(VendorCode_MSC.equals(Vendor_Code)) {
				System.out.println("Vendor Code Matched ||  Expected : "+VendorCode_MSC+" ||  Actual : "+Vendor_Code);
				Extent_pass(driver, "Vendor Code Matched ||  Expected : "+VendorCode_MSC+" ||  Actual : "+Vendor_Code, test, test1);
			}else {
				System.out.println("Vendor Code Not Matched ||  Expected : "+VendorCode_MSC+" ||  Actual : "+Vendor_Code);
				Extent_fail(driver, "Vendor Code Not Matched ||  Expected : "+VendorCode_MSC+" ||  Actual : "+Vendor_Code, test, test1);
			}
			
		}else {
			System.out.println("vendor invoice created row not available");
			
		}
		Step_End(9, "If the activities are invoiced, the activities will be shown in yellow colour. Then go to vendor invoice registration and click on the global search option. Select the vendor invoice number option.Then enter the required value and click on the search option.Then click on the select option. Ensure that the invoiced quantity,invoice amount in expense report matches with the invoice in the vendor invoice registration ", test, test1);

		Extent_completed(tc_Name, test, test1);		
		
	}
	
}
