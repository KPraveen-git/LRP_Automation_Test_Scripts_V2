package LRP_Commercial_V1_Contract_Management_System_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Contract_Management_System_SC092 extends Keywords {

	public static String Pre_Carriage_Radiobtn;
	public static String On_Carriage_Radiobtn;
	public static String tService;
	public static String TOS;

	public void Contract_Management_System_SC92(WebDriver driver, ExtentTest test, ExtentTest test1,
			String selected_dataset) {

		String testCaseName = "TC_Contract_Management_System_SC092";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testCaseName);
		String url = TestNgXml.getdatafromExecution().get(testCaseName);
		String Sheet_Name_08 = TestNgXml.getsheetName_FromExecution().get(testCaseName);

		Map<String, String> Data = Utils.GetAllData(Sheet_Name_08, testCaseName, "Dataset" + selected_dataset,
				File_Path);

		String username = Data.get("username");
		String password = Data.get("password");
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
		String Signatory_Name = Data.get("Signatory_Name");
		String Signatory_Title = Data.get("Signatory_Title");
		String Signatory_Name2 = Data.get("Signatory_Name");
		String Signatory_Title2 = Data.get("Signatory_Title");
		String Verified = Data.get("Verified");
		String Contract_Verified = Data.get("Contract_Verified");
		String Contract_Updated = Data.get("Contract_Updated");
		String Search_Condition = Data.get("Search_Condition");
		String Contract_Activated = Data.get("Contract_Activated");
		String Contract_Amendment = Data.get("Contract_Amendment");
		String DG_Condition = Data.get("DG_Condition");
		String DGCLass_Value = Data.get("DGCLass_Value");
		String OFR2 = Data.get("OFR2");
		String Select_field = Data.get("Select_field");
		String Search_Condition2 = Data.get("Search_Condition2");
		String GrWt = Data.get("GrWt");
		String Length = Data.get("Length");
		String Width = Data.get("Width");
		String Height = Data.get("Height");
		String Quantity = Data.get("Quantity");
		String Package_Description = Data.get("Package_Description");

		Extent_Start(testCaseName, test, test1);

		navigateUrl(driver, url);

		LRP_Login(driver, username, password);

		moduleNavigate(driver, Contract_Management_System_Module);

		waitForElement(driver, Contract_Management_System);
		if (isDisplayed(driver, Contract_Management_System)) {
			Extent_pass(driver, "Contract Management System Page is displayed", test, test1);
			System.out.println("Contract Management System Page is displayed");
		} else {
			System.out.println("Contract Management System Page is not displayed");

			Extent_fail(driver, "Contract Management System Page is not displayed", test, test1);
		}

		Step_Start(1, "select FMC check box", test, test1);

		Step_Start(2, "select containerized check box", test, test1);

		waitForElement(driver, Contract_Management_System_Non_Containerized);
		click(driver, Contract_Management_System_Non_Containerized);

		waitForElement(driver, N_FMC);
		click(driver, N_FMC);

		Step_End(1, "select Non FMC check box", test, test1);

		Step_End(2, "select Non containerized check box", test, test1);

		Step_Start(3, "Enter the customer name", test, test1);

		waitForElement(driver, Contract_Management_System_CustomerName);
		sendKeys(driver, Contract_Management_System_CustomerName, Customer_code_Value);

		waitForElement(driver, Auto_Panel_First);
		safeclick(driver, Auto_Panel_First);

		waitForElement(driver, Contract_Management_System_Commodity);
		if (isdisplayed(driver, Contract_Management_System_Exit)) {
			click(driver, Contract_Management_System_Exit);
		} else {
			System.out.println("customer name System Page is not displayed");
		}

		Step_End(3, "Enter the customer name", test, test1);

		Step_Start(4, "swithch to commodity tab and enter the commodity name and click + button.", test, test1);

		waitForElement(driver, Contract_Management_System_Commodity);
		click(driver, Contract_Management_System_Commodity);

		waitForElement(driver, Contract_Management_System_Internal_Commodity);
		sendKeys(driver, Contract_Management_System_Internal_Commodity, Internal_Commodity);

		String select_Internal_Commmodity = String.format(Contract_Management_System_Commodity_val, Internal_Commodity);
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

		waitForElement(driver, RateCal);
		click(driver, RateCal);
		selectValue(driver, DG_Condition, Eqp_Type);

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
		if (IsElementEnabled(driver, Contract_Management_System_Valied_from)) {
			waitForElement(driver, Contract_Management_System_Valied_from);
			click(driver, Contract_Management_System_Valied_from);

		} else {
			System.out.println("From data is Display");
		}

		waitForElement(driver, Contract_Management_System_Valied_to);
		if (IsElementEnabled(driver, Contract_Management_System_Valied_to)) {
			waitForElement(driver, Contract_Management_System_Valied_to);
			click(driver, Contract_Management_System_Valied_to);

		} else {
			System.out.println("To data is Display");
		}

		waitForElement(driver, Contract_Management_System_weight);
		clearAndType(driver, Contract_Management_System_weight, weight);

		waitForElement(driver, AddDimension);
		click(driver, AddDimension);

		waitForElement(driver, GrWt_Input);
		clearAndType(driver, GrWt_Input, GrWt);

		waitForElement(driver, Length_Input);
		click(driver, Length_Input);
		clearAndType(driver, Length_Input, Length);

		waitForElement(driver, Width_Input);
		click(driver, Width_Input);
		clearAndType(driver, Width_Input, Width);

		waitForElement(driver, Height_Input);
		click(driver, Height_Input);
		clearAndType(driver, Height_Input, Height);

		waitForElement(driver, Quantity_Input);
		click(driver, Quantity_Input);
		clearAndType(driver, Quantity_Input, Quantity);

		waitForElement(driver, Package_description);
		click(driver, Height_Input);
		click(driver, Package_description);
		selectValue(driver, DG_Condition, Package_Description);

		waitForElement(driver, DimensionAdd);
		click(driver, DimensionAdd);

		waitForElement(driver, DimensionOk);
		click(driver, DimensionOk);

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

		String saved_popup = getText(driver, Popup_Message);
		System.out.println("saved_popup :" + saved_popup);

		if (Contract_saved.equals(saved_popup)) {
			Extent_pass(driver, "Matched || Expected : " + Contract_saved + " Actual : " + saved_popup, test, test1);
			System.out.println("Matched || Expected : " + Contract_saved + " Actual : " + saved_popup);
		} else {

			Extent_fail(driver, "Not Matched || Expected : " + Contract_saved + " Actual : " + saved_popup, test,
					test1);
			System.out.println("Not Matched || Expected : " + Contract_saved + " Actual : " + saved_popup);

		}

		Step_End(12, "click Save", test, test1);

		Step_Start(13, "Retrieve the contract in the global search", test, test1);

		waitForElement(driver, Contract_Management_System_contract);
		String contract_number = getAttribute(driver, Contract_Management_System_contract, "value");
		System.out.println("contect_number :" + contract_number);

		waitForElement(driver, Contract_Management_System_status);
		String Draftnumber = getAttribute(driver, Contract_Management_System_status, "value");
		System.out.println("Draftnumber :" + Draftnumber);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, Select_field);

		waitForElement(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Search_Condition2);

		waitForElement(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, contract_number);
		;

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

		if (isdisplayed(driver, popup_Message)) {
			click(driver, popup_Message_Yes_Button);

		} else {
			System.out.println("Popup message is not display");
		}

		String verified_popup = getText(driver, Popup_Message);
		System.out.println("verified_popup :" + verified_popup);

		if (Contract_Verified.equals(verified_popup)) {
			Extent_pass(driver,
					"Matched || Expected value is : " + Contract_Verified + " Actual value is: " + verified_popup, test,
					test1);
			System.out.println(
					"Matched || Expected value is : " + Contract_Verified + " Actual value is : " + verified_popup);
		} else {

			Extent_fail(driver,
					"Not Matched || Expected value is : " + Contract_Verified + " Actual value is : " + verified_popup,
					test, test1);
			System.out.println(
					"Not Matched || Expected value is : " + Contract_Verified + " Actual value is : " + verified_popup);
		}

		waitForElement(driver, Contract_Management_System_status);
		String verifiednumber = getAttribute(driver, Contract_Management_System_status, "value");
		System.out.println("verifiednumber :" + verifiednumber);

		if (Verified.equals(verifiednumber)) {
			Extent_pass(driver, "Matched || Expected value is : " + Verified + " Actual value is : " + verifiednumber,
					test, test1);
			System.out.println("Matched || Expected value is : " + Verified + " Actual value is : " + verifiednumber);
		} else {

			Extent_fail(driver,
					"Not Matched || Expected value is : " + Verified + " Actual value is : " + verifiednumber, test,
					test1);
			System.out
					.println("Not Matched || Expected value is : " + Verified + " Actual value is : " + verifiednumber);

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
		String ActivatePopup = getAttribute(driver, Contract_Management_System_status, "value");

		if (Contract_Activated.equals(ActivatePopup)) {
			Extent_pass(driver,
					"Matched || Expected value is : " + Contract_Activated + " Actual value is : " + ActivatePopup,
					test, test1);
			System.out.println(
					"Matched || Expected value is : " + Contract_Activated + " Actual value is : " + ActivatePopup);
		} else {

			Extent_fail(driver,
					"Not Matched || Expected value is : " + Contract_Activated + " Actual value is : " + ActivatePopup,
					test, test1);
			System.out.println(
					"Not Matched || Expected value is : " + Contract_Activated + " Actual value is : " + ActivatePopup);

		}

		Step_End(18, "click activate", test, test1);

		Step_Start(19, "click amendment button", test, test1);

		waitForElement(driver, AMendment);
		click(driver, AMendment);

		waitForElement(driver, Contract_popup_Message);
		String AmendmentPopup = getText(driver, Contract_popup_Message);

		if (Contract_Amendment.equals(AmendmentPopup)) {
			Extent_pass(driver,
					"Matched || Expected value is : " + Contract_Amendment + " Actual value is : " + AmendmentPopup,
					test, test1);
			System.out.println(
					"Matched || Expected value is : " + Contract_Amendment + " Actual value is : " + AmendmentPopup);
		} else {

			Extent_fail(driver,
					"Not Matched || Expected value is : " + Contract_Amendment + " Actual value is : " + AmendmentPopup,
					test, test1);
			System.out.println("Not Matched || Expected value is : " + Contract_Amendment + " Actual value is : "
					+ AmendmentPopup);

		}

		Step_End(19, "click amendment button", test, test1);

		Step_Start(20, "switch to port pair tab", test, test1);

		waitForElement(driver, Contract_Management_System_Edit);
		click(driver, Contract_Management_System_Edit);

		waitForElement(driver, Contract_Management_System_port_pair);
		click(driver, Contract_Management_System_port_pair);

		Step_End(20, "switch to port pair tab", test, test1);

		Step_Start(21, "double click on the port pair and update the OFR amount", test, test1);

		scrollBottom(driver);

		waitForElement(driver, Portpair1);
		doubleClick(driver, Portpair1);

		scrollTop(driver);

		waitForElement(driver, Contract_Management_System_OFR);
		clearAndType(driver, Contract_Management_System_OFR, OFR2);

		Step_End(21, "double click on the port pair and update the OFR amount", test, test1);

		Step_Start(22, "Click update", test, test1);

		waitForElement(driver, Contract_Management_System_Add);
		click(driver, Contract_Management_System_Add);

		Step_End(22, "Click update", test, test1);

		Step_Start(23, "Click Save", test, test1);

		waitForElement(driver, Contract_Management_System_save);
		click(driver, Contract_Management_System_save);

		String Update_popup = getText(driver, Popup_Message);

		if (Contract_Updated.equals(Update_popup)) {
			Extent_pass(driver, "Matched || Expected : " + Contract_Updated + " Actual : " + Update_popup, test, test1);
			System.out.println("Matched || Expected : " + Contract_Updated + " Actual : " + Update_popup);
		} else {

			Extent_fail(driver, "Not Matched || Expected : " + Contract_Updated + " Actual : " + Update_popup, test,
					test1);
			System.out.println("Not Matched || Expected : " + Contract_Updated + " Actual : " + Update_popup);

		}

		Step_End(23, "Click Save", test, test1);

		Step_Start(24, "retrieve the contract in the global search", test, test1);

		String contract_number2 = getAttribute(driver, Contract_Management_System_contract, "value");
		System.out.println("contect_number :" + contract_number2);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, Select_field);

		waitForElement(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Search_Condition2);

		waitForElement(driver, globalSearch_InputTextfield1);
		sendKeys(driver, globalSearch_InputTextfield1, contract_number2);

		waitForElement(driver, globalSearch_Frame_SearchButton);
		click(driver, globalSearch_Frame_SearchButton);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

		Step_End(24, "retrieve the contract in the global search", test, test1);

		Step_Start(25, "click edit", test, test1);

		waitForElement(driver, Contract_Management_System_Edit);
		click(driver, Contract_Management_System_Edit);

		Step_End(25, "click edit", test, test1);

		Step_Start(26, "enter the signatory name and tittle", test, test1);

		waitForElement(driver, Contract_Management_System_Signatory_Name);
		clearAndType(driver, Contract_Management_System_Signatory_Name, Signatory_Name2);

		waitForElement(driver, Contract_Management_System_Signatory_Title);
		clearAndType(driver, Contract_Management_System_Signatory_Title, Signatory_Title2);

		Step_End(26, "enter the signatory name and tittle", test, test1);

		Step_Start(27, "click verify", test, test1);

		waitForElement(driver, Contract_Management_System_Approved);
		click(driver, Contract_Management_System_Approved);

		if (isdisplayed(driver, popup_Message)) {
			click(driver, popup_Message_Yes_Button);

		} else {
			System.out.println("Popup message is not display");
		}

		String verified_popup2 = getText(driver, Popup_Message);
		System.out.println("verified_popup :" + verified_popup);

		if (Contract_Verified.equals(verified_popup2)) {
			Extent_pass(driver,
					"Matched || Expected value is : " + Contract_Verified + " Actual value is: " + verified_popup2,
					test, test1);
			System.out.println(
					"Matched || Expected value is : " + Contract_Verified + " Actual value is : " + verified_popup2);
		} else {

			Extent_fail(driver,
					"Not Matched || Expected value is : " + Contract_Verified + " Actual value is : " + verified_popup2,
					test, test1);
			System.out.println("Not Matched || Expected value is : " + Contract_Verified + " Actual value is : "
					+ verified_popup2);
		}

		Step_End(27, "click verify", test, test1);

		Step_Start(28, "enter the signatory dates", test, test1);

		waitForElement(driver, Contract_Management_System_status);
		String verifiednumber2 = getAttribute(driver, Contract_Management_System_status, "value");
		System.out.println("verifiednumber :" + verifiednumber);

		if (Verified.equals(verifiednumber2)) {
			Extent_pass(driver, "Matched || Expected value is : " + Verified + " Actual value is : " + verifiednumber2,
					test, test1);
			System.out.println("Matched || Expected value is : " + Verified + " Actual value is : " + verifiednumber2);
		} else {

			Extent_fail(driver,
					"Not Matched || Expected value is : " + Verified + " Actual value is : " + verifiednumber2, test,
					test1);
			System.out.println(
					"Not Matched || Expected value is : " + Verified + " Actual value is : " + verifiednumber2);

		}

		Step_End(28, "enter the signatory dates", test, test1);

//		Step_Start(29, "click activate", test, test1);
//
//		waitForElement(driver, Contract_Management_System_Edit);
//		click(driver, Contract_Management_System_Edit);
//
//		waitForElement(driver, Contract_Management_System_Active);
//		click(driver, Contract_Management_System_Active);
//
//		waitForElement(driver, Contract_Management_System_status);
//		String ActivatePopup2 = getAttribute(driver, Contract_Management_System_status, "value");
//
//		if (Contract_Activated.equals(ActivatePopup2)) {
//			Extent_pass(driver,
//					"Matched || Expected value is : " + Contract_Activated + " Actual value is : " + ActivatePopup2,
//					test, test1);
//			System.out.println(
//					"Matched || Expected value is : " + Contract_Activated + " Actual value is : " + ActivatePopup2);
//		} else {
//
//			Extent_fail(driver,
//					"Not Matched || Expected value is : " + Contract_Activated + " Actual value is : " + ActivatePopup2,
//					test, test1);
//			System.out.println("Not Matched || Expected value is : " + Contract_Activated + " Actual value is : "
//					+ ActivatePopup2);
//
//		}
//
//		Step_End(29, "click activate", test, test1);

		Extent_completed(testCaseName, test, test1);
		
	}
}