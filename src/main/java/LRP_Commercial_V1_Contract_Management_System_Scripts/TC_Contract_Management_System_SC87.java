package LRP_Commercial_V1_Contract_Management_System_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Contract_Management_System_SC87 extends Keywords{
	
	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;
	
     public void Contract_Management_System_SC87(WebDriver driver, ExtentTest test,ExtentTest test1, String selected_dataset) {
		
		String testCaseName="TC_Contract_Management_System_SC87";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_08 = TestNgXml.getsheetName_FromExecution().get(testCaseName);

		Map<String, String> Data = Utils.GetAllData(Sheet_Name_08, testCaseName,"Dataset" + selected_dataset, File_Path);
		
		String username=Data.get("username");
		String password=Data.get("password");
		String Contract_Management_System_Module = Data.get("Contract_Management_System_Module");
		String Customer_code_Value = Data.get("Customer_code_Value");
		String Internal_Commodity = Data.get("Internal_Commodity");
		String Eqp_Type = Data.get("Eqp_Type");
		String Origin = Data.get("Origin");
		String Delivery = Data.get("Delivery");
		String OFR = Data.get("OFR");
		String weight = Data.get("weight");
		String ImportDemurrage = Data.get("ImportDemurrage");
		String ExportDemurrage = Data.get("ExportDemurrage");
		String ImportDetention = Data.get("ImportDetention");
		String ExportDetention = Data.get("ExportDetention");
		String Tariffs_of_General_Applicability = Data.get("Tariffs_of_General_Applicability");
		String Contract_saved = Data.get("Contract_saved");
		String Draft = Data.get("Draft");
		String Signatory_Name = Data.get("Signatory_Name");
		String Signatory_Title = Data.get("Signatory_Title");
		String Verified = Data.get("Verified");
		String Contract_Verified = Data.get("Contract_Verified");
		String Contract_Updated = Data.get("Contract_Updated");
		String Charger = Data.get("Charger");
		String Amount = Data.get("Amount");
		String GR_WT = Data.get("GRWT");
		String Length = Data.get("Length");
		String Width = Data.get("Width");
		String Height = Data.get("Height");
		String Quantity = Data.get("Quantity");
		String Description = Data.get("Description");
		String BackRoundColor = Data.get("BackRoundColor");
		String Activated = Data.get("Activated");
		String Activated_val = Data.get("Activated");
		String file_input = Data.get("file_input");
		String Filed = Data.get("Filed");
		String DG_Condition = Data.get("DG_Condition");
		String DGCLass_Value = Data.get("DGCLass_Value");
		String Search_Condition = Data.get("Search_Condition");
		String Select_field = Data.get("Select_field");
		String Search_Condition2 = Data.get("Search_Condition2");

		Extent_Start(testCaseName, test, test1);

		navigateUrl(driver, url);
		
		LRP_Login(driver, username, password);
	
		moduleNavigate(driver, Contract_Management_System_Module);

		waitForElement(driver, Contract_Management_System);
		if (isDisplayed(driver, Contract_Management_System)) {
			Extent_pass(driver, "Contract Management System Page is displayed", test,test1);
			System.out.println("Contract Management System Page is displayed");
		} else {
			System.out.println("Contract Management System Page is not displayed");
			Extent_fail(driver, "Contract Management System Page is not displayed", test,test1);
		}
		
		Step_Start(1, "select  FMC check box", test, test1);
		
		waitForElement(driver, Contract_Management_System_Fmc);
		click(driver, Contract_Management_System_Fmc);
		
		Step_End(1, "select FMC check box", test, test1);
		
		Step_Start(2, "select non- containerized check box.", test, test1);
		
		waitForElement(driver, Contract_Management_System_Non_Containerized);
		click(driver, Contract_Management_System_Non_Containerized);
		
		Step_End(2, "select containerized check box", test, test1);
	
		
		Step_Start(3, "Enter the customer name", test, test1);
		
		waitForElement(driver, Contract_Management_System_Fmc);
		click(driver, Contract_Management_System_Fmc);
		
		waitForElement(driver, Contract_Management_System_CustomerName);
		sendKeys(driver, Contract_Management_System_CustomerName, Customer_code_Value);
		
		waitForElement(driver, Auto_Panel_First);
		safeclick(driver, Auto_Panel_First);
		
	   waitForElement(driver, Contract_Management_System_Exit);
		if(isdisplayed(driver, Contract_Management_System_Exit)) {
			 waitForElement(driver, Contract_Management_System_Exit);
			 click(driver, Contract_Management_System_Exit);
		}else {
			System.out.println("customer name System Page is not displayed");
		}
		
		Step_End(3, "Enter the customer name", test, test1);
		
		Step_Start(4, "swithch to commodity tab and enter the commodity name and click + button.", test, test1);
		
		waitForElement(driver, Contract_Management_System_Commodity);
		click(driver, Contract_Management_System_Commodity);
		
		
		waitForElement(driver, Contract_Management_System_Internal_Commodity);
		sendKeys(driver, Contract_Management_System_Internal_Commodity, Internal_Commodity);
		
		String select_Internal_Commmodity=String.format(Contract_Management_System_Commodity_val, Internal_Commodity);
		waitForElement(driver, select_Internal_Commmodity);
		safeclick(driver, select_Internal_Commmodity);
		
		waitForElement(driver, Contract_Management_System_Internal_Commodity_add);
		click(driver, Contract_Management_System_Internal_Commodity_add);
		
		Step_End(4, "swithch to commodity tab and enter the commodity name and click + button.", test, test1);
				
		
		Step_Start(5, "switch to port pair tab", test, test1);
		
		waitForElement(driver, Contract_Management_System_port_pair);
		click(driver, Contract_Management_System_port_pair);
		
		Step_End(5, "switch to port pair tab", test, test1);
		
		Step_Start(6, "Enter the equipment", test, test1);
		
		waitForElement(driver, Contract_Management_System_RateCalc_Type);
		sendKeys(driver, Contract_Management_System_RateCalc_Type, Eqp_Type);
		
		Step_End(6, "Enter the equipment", test, test1);
		
		Step_Start(7, "Enter the origin", test, test1);
		
		
		waitForElement(driver, Contract_Management_System_Origin_seach);
		click(driver, Contract_Management_System_Origin_seach);
		
		waitForElement(driver, Contract_Management_System_Origin_seach_Input_field);
		sendKeys(driver, Contract_Management_System_Origin_seach_Input_field, Origin);
		
		waitForElement(driver, firstRow);
		click(driver, firstRow);
		
		waitForElement(driver, Contract_Management_System_Origin_select);
		click(driver, Contract_Management_System_Origin_select);

		Step_End(7, "Enter the origin", test, test1);
		
		Step_Start(8, "Enter the delivery", test, test1);	
		
		waitForElement(driver, Contract_Management_System_Delivery);
		click(driver, Contract_Management_System_Delivery);
		
		waitForElement(driver, Contract_Management_System_Delivery_seach_Input_field);
		sendKeys(driver, Contract_Management_System_Delivery_seach_Input_field, Delivery);
		
		waitForElement(driver, firstRow);
		click(driver, firstRow);
		
		waitForElement(driver, Contract_Management_System_Origin_select);
		click(driver, Contract_Management_System_Origin_select);

		
		Step_End(8, "Enter the delivery", test, test1);	
		
		Step_Start(9, "Enter the OFR", test, test1);	
		
		waitForElement(driver, Contract_Management_System_OFR);
		sendKeys(driver, Contract_Management_System_OFR, OFR);
		
		Step_End(9, "Enter the OFR", test, test1);	
		
		Step_Start(10, "Enter the gross weight", test, test1);
		
		waitForElement(driver, Contract_Management_System_Valied_from);
		if(IsElementEnabled(driver, Contract_Management_System_Valied_from)) {
			waitForElement(driver, Contract_Management_System_Valied_from);
			click(driver, Contract_Management_System_Valied_from);
			
		}else {
			System.out.println("From data is Display");
		}
		
		waitForElement(driver, Contract_Management_System_Valied_to);
		if(IsElementEnabled(driver, Contract_Management_System_Valied_to)) {
			waitForElement(driver, Contract_Management_System_Valied_to);
			click(driver, Contract_Management_System_Valied_to);
			
		}else {
			System.out.println("To data is Display");
		}
		
		waitForElement(driver, Contract_Management_System_weight);
		clearAndType(driver, Contract_Management_System_weight, weight);

		waitForElement(driver, Contract_Management_System_Add_Dimensions);
		click(driver, Contract_Management_System_Add_Dimensions);

		waitForElement(driver, Contract_Management_System_Gr_wt);
		clearAndType(driver, Contract_Management_System_Gr_wt, GR_WT);
        click(driver,Contract_Management_System_Width);
		
		waitForElement(driver, Contract_Management_System_Length);
		clear(driver, Contract_Management_System_Length);
		sendKeys(driver, Contract_Management_System_Length, Length);

		waitForElement(driver, Contract_Management_System_Width);
		clear(driver, Contract_Management_System_Width);
		sendKeys(driver, Contract_Management_System_Width, Width);

		waitForElement(driver, Contract_Management_System_Height);
		clear(driver, Contract_Management_System_Height);
		sendKeys(driver, Contract_Management_System_Height, Height);
		click(driver,Contract_Management_System_Width);

		waitForElement(driver, Contract_Management_System_Quantity);
		clear(driver, Contract_Management_System_Quantity);
		sendKeys(driver, Contract_Management_System_Quantity, Quantity);
		click(driver,Contract_Management_System_Width);
		 
		 waitForElement(driver, Contract_Management_System_Add_Dimensions_add_package_Description);
		 click(driver, Contract_Management_System_Add_Dimensions_add_package_Description);
		 
		 
		 waitForElement(driver, Contract_Management_System_Add_Dimensions_add_package_Description_input); 
		 sendKeys(driver, Contract_Management_System_Add_Dimensions_add_package_Description_input, Description);
		 
		 waitForElement(driver, firstRow);
		 click(driver, firstRow);
		 
		 waitForElement(driver, Contract_Management_System_Origin_select);
		 click(driver, Contract_Management_System_Origin_select);
		 
		 waitForElement(driver, Contract_Management_System_Add_Dimensions_add);
		 click(driver, Contract_Management_System_Add_Dimensions_add); 
		 
		 waitForDisplay(driver, Contract_Management_System_Add_Dimensions_add_ok);
		 waitForElement(driver, Contract_Management_System_Add_Dimensions_add_ok);
		 click(driver, Contract_Management_System_Add_Dimensions_add_ok);
		 
			
		waitForElement(driver, Contract_Management_System_Add);
		click(driver, Contract_Management_System_Add);
		 
		Step_End(10, "Enter the gross weight", test, test1);
		
		waitForElement(driver, Free_days);
		mouseOverToElement(driver, DG_Checkbox);

		waitForElement(driver, Contract_Management_System_import_Demurrage);
		sendKeys(driver, Contract_Management_System_import_Demurrage, ImportDemurrage);

		waitForElement(driver, Contract_Management_System_export_Demurrage);
		sendKeys(driver, Contract_Management_System_export_Demurrage, ExportDemurrage);

		waitForElement(driver, Contract_Management_System_export_Detention);
		sendKeys(driver, Contract_Management_System_export_Detention, ImportDetention);

		waitForElement(driver, Contract_Management_System_import_Detention);
		sendKeys(driver, Contract_Management_System_import_Detention, ExportDetention);

		if (DG_Condition.equals("Yes")) {

			mouseOverToElement(driver, DG_Checkbox);
			waitForElement(driver, DG_Checkbox);
			click(driver, DG_Checkbox);

			waitForElement(driver, DG_Class);
			click(driver, DG_Class);

			selectValue(driver, Search_Condition, DGCLass_Value);

			waitForElement(driver, Add_DG_Class);
			click(driver, Add_DG_Class);

			waitForElement(driver, firstRow);
			click(driver, firstRow);

			waitForElement(driver, DGSelectButton);
			click(driver, DGSelectButton);

			waitForElement(driver, DGDetails1);
			if (isdisplayed(driver, DGDetails1)) {

				System.out.println("Selected DG details are added in the DG Details tab");
				Extent_pass(driver, "Selected DG details are added in the DG Details tab", test, test1);
			} else {

				System.out.println("Selected DG details are not added in the DG Details tab");
				Extent_fail(driver, "Selected DG details are not added in the DG Details tab", test, test1);

			}

			waitForElement(driver, DG_Ok);
			click(driver, DG_Ok);
		}

//		if (OOG_Condition.equals("Yes")) {
//
//			scrollUsingElement(driver, OOG_Checkbox);
//			waitForElement(driver, OOG_Checkbox);
//			click(driver, OOG_Checkbox);
//
//		}

		scrollTop(driver);
		
		Step_Start(11, "click ADD.", test, test1);
		
		waitForElement(driver, Contract_Management_System_Add);
		click(driver, Contract_Management_System_Add);
		
		Step_End(11, "click ADD.", test, test1);
		
		waitForElement(driver, Contract_Management_System_General);
		click(driver, Contract_Management_System_General);
		
		waitForElement(driver, Contract_Management_System_Tariffs_of_General_Applicability);
		sendKeys(driver, Contract_Management_System_Tariffs_of_General_Applicability, Tariffs_of_General_Applicability);
		
		Step_Start(12, "click Save", test, test1);
		
		waitForElement(driver, Contract_Management_System_save);
		click(driver, Contract_Management_System_save);
		
		String saved_popup =getText(driver, Popup_Message);
		System.out.println("saved_popup :"+saved_popup);
		
		if(Contract_saved.equals(saved_popup)) {
			Extent_pass(driver,"Matched || Expected : "+Contract_saved+" Actual : "+ saved_popup, test,test1);
			System.out.println("Matched || Expected : "+Contract_saved+" Actual : "+ saved_popup);
		}else {
			
			Extent_fail(driver,"Not Matched || Expected : "+Contract_saved+" Actual : "+ saved_popup, test,test1);
			System.out.println("Not Matched || Expected : "+Contract_saved+" Actual : "+ saved_popup);
			
		}
		
		
		Step_End(12, "click Save", test, test1);
		
		Step_Start(13, "Retrieve the contract in the global search", test, test1);
		
		waitForElement(driver, Contract_Management_System_contract);
		String contract_number = getAttribute(driver, Contract_Management_System_contract, "value");
		System.out.println("contect_number :" + contract_number);
		
		waitForElement(driver, Contract_Management_System_status);
		String Draftnumber =getAttribute(driver, Contract_Management_System_status,"value");
		System.out.println("Draftnumber :"+Draftnumber);	
		
		if(Draft.equals(Draftnumber)) {
			Extent_pass(driver,"Matched || Expected value is : "+Draft+" Actual value is : "+ Draftnumber, test,test1);
			System.out.println("Matched || Expected value is : "+Draft+" Actual value is : "+ Draftnumber);
		}else {
			
			Extent_fail(driver,"Not Matched || Expected value is : "+Draft+" Actual value is : "+ Draftnumber, test,test1);
			System.out.println("Not Matched || Expected value is : "+Draft+" Actual value is : "+ Draftnumber);
			
		}
		
		
		
		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, Select_field);

		waitForElement(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Search_Condition2);

		waitForElement(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, contract_number);
		

		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
		
		Step_End(13, "Retrieve the contract in the global search", test, test1);
		
		Step_Start(14, "click edit", test, test1);
		
		waitForElement(driver, Contract_Management_System_Edit);
		click(driver, Contract_Management_System_Edit);
		
		Step_End(14, "click edit", test, test1);
		
		Step_Start(15, "Enter the signatory name and tittle", test, test1);
		
		
		waitForElement(driver, Contract_Management_System_Signatory_Name);
		sendKeys(driver, Contract_Management_System_Signatory_Name, Signatory_Name);
		
		waitForElement(driver, Contract_Management_System_Signatory_Title);
		sendKeys(driver, Contract_Management_System_Signatory_Title, Signatory_Title);
		
		Step_End(15, "Enter the signatory name and tittle", test, test1);
		
		Step_Start(16, " click verify", test, test1);
		
		waitForElement(driver, Contract_Management_System_Approved);
		click(driver, Contract_Management_System_Approved);
		
		
		if(isdisplayed(driver, popup_Message)) {
			click(driver, popup_Message_Yes_Button);
			
		}else {
			System.out.println("Popup message is not display");
		}
		
		
		String verified_popup =getText(driver, Popup_Message);
		System.out.println("verified_popup :"+verified_popup);
		
		if(Contract_Verified.equals(verified_popup)) {
			Extent_pass(driver,"Matched || Expected value is : "+Contract_Verified+" Actual value is: "+ verified_popup, test,test1);
			System.out.println("Matched || Expected value is : "+Contract_Verified+" Actual value is : "+ verified_popup);
		}else {
			
			Extent_fail(driver,"Not Matched || Expected value is : "+Contract_Verified+" Actual value is : "+ verified_popup, test,test1);
			System.out.println("Not Matched || Expected value is : "+Contract_Verified+" Actual value is : "+ verified_popup);
		}	
		
		
		waitForElement(driver, Contract_Management_System_status);
		String verifiednumber =getAttribute(driver, Contract_Management_System_status,"value");
		System.out.println("verifiednumber :"+verifiednumber);	
		
		if(Verified.equals(verifiednumber)) {
			Extent_pass(driver,"Matched || Expected value is : "+Verified+" Actual value is : "+ verifiednumber, test,test1);
			System.out.println("Matched || Expected value is : "+Verified+" Actual value is : "+ verifiednumber);
		}else {
			
			Extent_fail(driver,"Not Matched || Expected value is : "+Verified+" Actual value is : "+ verifiednumber, test,test1);
			System.out.println("Not Matched || Expected value is : "+Verified+" Actual value is : "+ verifiednumber);
			
		}
		

		Step_End(16, " click verify", test, test1);	
		
		Step_Start(17, "Enter the signatory date", test, test1);	
		
		waitForElement(driver, Contract_Management_System_Edit);
		click(driver, Contract_Management_System_Edit);
		
		Step_End(17, " Enter the signatory date", test, test1);	
		
		Step_Start(18, "click activate", test, test1);	
		
		waitForElement(driver, Contract_Management_System_Active);
		click(driver, Contract_Management_System_Active);
		
		
		waitForElement(driver, Contract_Management_System_status);
		String Activated_avl = getAttribute(driver, Contract_Management_System_status, "value");
		System.out.println("Activated_avl :" + Activated_avl);

		if (Activated_val.equals(Activated)) {
			Extent_pass(driver,
					"Matched || Expected value is : " + Activated_val + " Actual value is : " + Activated_avl, test,
					test1);
			System.out
					.println("Matched || Expected value is : " + Activated_val + " Actual value is : " + Activated_avl);
		} else {

			Extent_fail(driver,
					"Not Matched || Expected value is : " + Activated_val + " Actual value is : " + Activated_avl, test,
					test1);
			System.out.println(
					"Not Matched || Expected value is : " + Activated_val + " Actual value is : " + Activated_avl);

		}

		if (isdisplayed(driver, popup_Message)) {
			waitForDisplay(driver, popup_Message_Yes_Button);
			click(driver, popup_Message_Yes_Button);
		} else {
			System.out.println("Popup message is not display");
		}

		waitForElement(driver, Contract_Management_System_backrond_color);
		String Act_col = getTextBackgroundColor(driver, Contract_Management_System_backrond_color);
		System.out.println("Backround Color: " + Act_col);

		String color = getColorName(Act_col);

		if (BackRoundColor.equals(color)) {
			System.out.println("Matched exp value : " + BackRoundColor + "actual value : " + color);
			Extent_pass(driver, "Matched || " + " Expected Report Activity is : " + BackRoundColor+ " || Actual Report Activity is : " + color, test, test1);
		} else {
			System.out.println("Not Matched exp value :" + BackRoundColor + "actual value : " + color);
			Extent_fail(driver, "Matched || " + " Expected Report Activity is : " + BackRoundColor
					+ " || Actual Report Activity is : " + color, test, test1);
		}
		
		
		waitForElement(driver, Contract_Management_System_file);
		click(driver, Contract_Management_System_file);
		
		if (isdisplayed(driver, popup_Message)) {
			waitForDisplay(driver, popup_Message_Yes_Button);
			click(driver, popup_Message_Yes_Button);
		} else {
			System.out.println("Popup message is not display");
		}
		
		waitForElement(driver, Contract_Management_System_File_Text);
		sendKeys(driver, Contract_Management_System_File_Text, file_input);
		
		waitForElement(driver, Contract_Management_System_Ok);
		click(driver, Contract_Management_System_Ok);
		
		
		waitForElement(driver, Contract_Management_System_status);
		String Filed_avl = getAttribute(driver, Contract_Management_System_status, "value");
		System.out.println("Filed_avl :" + Filed_avl);
		
		if (Filed.equals(Filed_avl)) {
			Extent_pass(driver,
					"Matched || Expected value is : " + Filed + " Actual value is : " + Filed_avl, test,
					test1);
			System.out
					.println("Matched || Expected value is : " + Filed + " Actual value is : " + Filed_avl);
		} else {

			Extent_fail(driver,
					"Not Matched || Expected value is : " + Filed + " Actual value is : " + Filed_avl, test,
					test1);
			System.out.println(
					"Not Matched || Expected value is : " + Filed + " Actual value is : " + Filed_avl);

		}
		
		Extent_completed(testCaseName, test, test1);
		
		
}
	

}
