package LRP_Cost_Scripts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS028 extends Keywords {

	public void  Cost_Activity_Report_TS028(WebDriver driver, ExtentTest test, ExtentTest test1,String selected_dataset) throws Exception{
		
		String tc_Name = "TC_Cost_Activity_Report_TS028";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String Vendar_Coloum_headers = data.get("Vendar_Header");
		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String Coloum_headers = data.get("Column_Header");
		String Vendor_Invoice_Registraction = data.get("VendorInvoice_Registraction");
		String Activity_ref_number = data.get("Activity_ref_Number");
		String ModeVal = data.get("Mode");
		String BackroundColor = data.get("BackRoundColor");
		String CAR_Retrieve_Type1 = data.get("CAR_Retrieve_Type1");
		String CAR_Retrieve_Condition1 = data.get("CAR_Retrieve_Condition1");
		String CAR_Number_Retrieve_Value1 = data.get("CAR_Number_Retrieve_Value1");
		String CAR_Retrieve_Type2 = data.get("CAR_Retrieve_Type2");
		String CAR_Number_Retrieve_Value2 = data.get("CAR_Number_Retrieve_Value2");
		String CAR_Retrieve_Type3 = data.get("CAR_Retrieve_Type3");
		String CAR_Number_Retrieve_Value3 = data.get("CAR_Number_Retrieve_Value3");
		
		
		
		Extent_Start(tc_Name, test, test1);
		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency.", test, test1);

		navigateUrl(driver, url);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency", test, test1);
		
		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);
		
		LRP_Login(driver, username, password);
		
//		SwitchProfile(driver, AgencyUser);
		
		moduleNavigate(driver, Cost_Activity_Report_Module);
		
		Step_End(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);
		
		verifyMainMenu(driver);
		
		Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);
		
		
		waitForElement(driver, seach_Filed);
		click(driver, seach_Filed);
		
		Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);
		
		Step_Start(4, "Check whether it opens a new search window. ", test, test1);
		
		Step_Start(4, "Check whether it opens a new search window. ", test, test1);

		Step_Start(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
		Step_Start(6, "Then click on the search button", test, test1);
		Step_Start(7, "System will show the CAR No. and Click on the select button", test, test1);
		
		globalValueSearchWindow(driver,CAR_Retrieve_Condition1,CAR_Retrieve_Type1,CAR_Number_Retrieve_Value1,CAR_Retrieve_Type2,CAR_Number_Retrieve_Value2,CAR_Retrieve_Type3,CAR_Number_Retrieve_Value3);	
		
		Step_End(4, "Check whether it opens a new search window. ", test, test1);
		Step_End(5, "Enter the required CAR No. in the CAR No search field. ", test, test1);
		Step_End(6, "Then click on the search button", test, test1);
		Step_End(7, "System will show the CAR No. and Click on the select button", test, test1);
		Step_Start(8, "System will retrieve the CAR", test, test1);
		
		Step_Start(8, "System will retrieve the CAR", test, test1);
		
		waitForElement(driver, car_Number_val);
		String Carvalue =getAttribute(driver, car_Number_val, "value");
		
		System.out.println("Carvalue :"+Carvalue);
		
		 Step_End(8, "System will retrieve the CAR", test, test1);	
		Step_Start(9, "Click on the Expense report button and check system opens a new tab and select the approved expenses tab. ", test, test1);
		waitForElement(driver, ExpenseReport);
		click(driver, ExpenseReport);
		waitForElement(driver, ApprovedExpenses);
		click(driver, ApprovedExpenses);
		Step_End(9, "Click on the Expense report button and check system opens a new tab and select the approved expenses tab.", test, test1);
		Step_Start(10, ".If the activities are invoiced, the activities will be shown with yellow colour indication and copy that Reference No and Invoice No.,for those which are the  highlighted with yellow colour.", test, test1);
		
		String Act=getTextBackgroundColor(driver, backroundcolor);
		System.out.println("Backround Color: "+Act);
		
		String color=getColorName(Act);
		if(BackroundColor.equals(color)) {
			System.out.println("Matched exp value : "+ BackroundColor +"actual value : "+color);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + BackroundColor + " || Actual Report Activity is : " + color, test,test1);
		}else {
			System.out.println("Not Matched exp value :"+BackroundColor +"actual value : "+color);
			Extent_fail(driver, "Matched || " + " Expected Report Activity is : " + BackroundColor+ " || Actual Report Activity is : " + color, test,test1);
		}
		
		
		waitForElement(driver, Column);
		click(driver, Column);
		
		click(driver, column_All_Select_Checkbox);
		
		List<String> column_Headers=splitAndExpand(Coloum_headers);
		for(int i=0;i<column_Headers.size();i++) {
		String column=column_Headers.get(i);
		click(driver, column_Searchbox);
		clear(driver, column_Searchbox);
		sendKeys(driver, column_Searchbox, column);
		
		String checkbox=String.format(column_Checkbox, column);
		click(driver, checkbox);
	
		}
		waitForElement(driver, Column);
		click(driver, Column);
		
		Map<String,String>  Act_Quantity_=new HashMap<String, String>();
		
		List<String> Actual_Quantity_Numbers = new ArrayList<String>();
		List<String> Actual_Ref_Numbers = new ArrayList<String>();
		
		
		List<WebElement> inv_Numbers = listOfElements(driver, Invoice_Amount_column);
		List<WebElement> ref_Numbers = listOfElements(driver, RefarenceNumber);
		
		
		for(int i = 0;i<inv_Numbers.size();i++) {
			String act_InvNumber = inv_Numbers.get(i).getText();
			
			String [] amount_list = act_InvNumber.split("=");
			
			String amount=amount_list[1];
			
			Actual_Quantity_Numbers.add(amount);
			String act_RefNumber = ref_Numbers.get(i).getText();
			Actual_Ref_Numbers.add(act_RefNumber);
			
			
			Act_Quantity_.put(act_RefNumber, amount);
		}
		Step_End(10, "If the activities are invoiced, the activities will be shown with yellow colour indication and copy that Reference No and Invoice No.,for those which are the  highlighted with yellow colour.", test, test1);
		Step_Start(11, "Close the window.", test, test1);
		
		waitForElement(driver, ExpenseReportClose);
		click(driver, ExpenseReportClose);
		
		Step_End(11, "Close the window.", test, test1);
		
		moduleNavigate(driver, Vendor_Invoice_Registraction);
		Step_Start(12, "Then enter the module name as Vendor invoice registration in module search and click on the global search option. Select the Activity Ref No. number option.Then paste the reference no. and click on the search option.", test, test1);
		
		Step_End(12, "Then enter the module name as Vendor invoice registration in module search and click on the global search option. Select the Activity Ref No. number option.Then paste the reference no. and click on the search option.", test, test1);
		Step_Start(13, "Check whether the sytem shows the same invoice number for the reference no. in CAR ande Vendor Inv No. column and we should compare only with the Mode D or C records alone.", test, test1);
		
		
		Map<String, String> Exp_Values_ = new HashMap<String, String>();

		for (int i = 0; i < inv_Numbers.size(); i++) {

			if (!isDisplayed(driver, Ventor_Global_Seach_First_Field)) {
				waitForElement(driver, Ventor_Global_Search);
				click(driver, Ventor_Global_Search);
			}

			waitForElement(driver, Ventor_Global_Seach_First_Field);
			click(driver, Ventor_Global_Seach_First_Field);
			
			waitForElement(driver, Ventor_Global_Seach_First_Field);
			selectByText(driver, Ventor_Global_Seach_First_Field, Activity_ref_number);

			waitForElement(driver, Global_Input_Filed);
			clearAndType(driver, Global_Input_Filed, Actual_Ref_Numbers.get(i));
			waitForElement(driver, Search_button);
			click(driver, Search_button);

			waitForElement(driver, Mode_Field);
			sendKeys(driver, Mode_Field, ModeVal);

			waitForElement(driver, Filtered_Rows);
			List<WebElement> filtered_Cells=listOfElements(driver, Filtered_Rows);
			
			double Total_amout=0;

			for(int k=1;k<=filtered_Cells.size();k++) {
				
				String Select_Row=String.format(Select_Filter_Rows, k);
				waitForElement(driver, Select_Row);
				click(driver,Select_Row);
				
				waitForElement(driver, SelectButton);
				click(driver, SelectButton);
			
	
				waitForElement(driver, Vendor_Column);
				click(driver, Vendor_Column);
				
				waitForElement(driver, Vendor_column_All_Select_Checkbox);
				click(driver, Vendor_column_All_Select_Checkbox);
				
				List<String> Vendarcolumn_Headers=splitAndExpand(Vendar_Coloum_headers);
				for(int j=0;j<Vendarcolumn_Headers.size();j++) {
				String column=Vendarcolumn_Headers.get(j);
				click(driver, Vendar_Colunm_Input_Fiel);
				clear(driver, Vendar_Colunm_Input_Fiel);
				sendKeys(driver, Vendar_Colunm_Input_Fiel, column);
				
				String checkbox = String.format(Vendar_Colunm_selectall, column);
				waitForDisplay(driver, checkbox);
				jsClick(driver, checkbox);
				
				
				}
				waitForElement(driver, Vendor_Column);
				click(driver, Vendor_Column);
				
				waitForElement(driver, Total_records);
				click(driver, Total_records);
				waitForElement(driver, Condition_Filter);
				click(driver, Condition_Filter);
				waitForElement(driver, Activity_Ref_Input_Field);
				sendKeys(driver, Activity_Ref_Input_Field, Actual_Ref_Numbers.get(i));
		
				waitForElement(driver, Invoice_Amount);
				String quantityValue = getText(driver, Invoice_Amount);

				// Remove commas from the string
				quantityValue = quantityValue.replace(",", "");

				// Now parse the string as a double
				double Amount = Double.parseDouble(quantityValue);
				Total_amout = Total_amout + Amount;
				System.out.println("quantityExp :" + Total_amout);
				
				mouseOverToElement(driver, Ventor_Global_Search);
				waitForElement(driver, Ventor_Global_Search);
				click(driver, Ventor_Global_Search);
				waitForElement(driver, Ventor_Global_Seach_First_Field);
				click(driver, Ventor_Global_Seach_First_Field);
				waitForElement(driver, Ventor_Global_Seach_First_Field);
				selectByText(driver, Ventor_Global_Seach_First_Field, Activity_ref_number);
				
				waitForElement(driver, Global_Input_Filed);
				clearAndType(driver, Global_Input_Filed, Actual_Ref_Numbers.get(i));
				waitForElement(driver, Search_button);
				click(driver, Search_button);
				
			}
            String Qunatity_Value=String.valueOf(Total_amout);
			
			Exp_Values_.put(Actual_Ref_Numbers.get(i), Qunatity_Value);
			
		}
		
		
		System.out.println("Exp_Values_ :"+Exp_Values_);
		System.out.println("Act_Quantity_ :"+Act_Quantity_);
		
		
		Step_End(13, "Check whether the sytem shows the same invoice number for the reference no. in CAR ande Vendor Inv No. column and we should compare only with the Mode D or C records alone.", test, test1);
		Step_Start(14, "Incase if the Partial invoce done for invoice means,the same reference no. will show twice in Vendor invoice registration screen and those two invoice should be shown in CAR screen at the expense report Invoice No. column with the slash separator.", test, test1);	
			
		if(CompareMapValues(Exp_Values_,Act_Quantity_)) {
			   
			   System.out.println("matched exp value :"+Exp_Values_+"actual value :"+Act_Quantity_);
			   Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + Exp_Values_+ " || Actual Report Activity is : " + Act_Quantity_, test,test1);
			   
		   }else {
			   
			   System.out.println("Not matched exp value :"+Exp_Values_+"actual value :"+Act_Quantity_);
			   Extent_fail(driver, "Not Matched || " + " Expected Report Activity is : " + Exp_Values_+ " || Actual Report Activity is : " + Act_Quantity_, test,test1);
			   
		   }
		Step_End(14, "Incase if the Partial invoce done for invoice means,the same reference no. will show twice in Vendor invoice registration screen and those two invoice should be shown in CAR screen at the expense report Invoice No. column with the slash separator.", test, test1);		
		Extent_completed(tc_Name, test, test1);		
		
	
}
}