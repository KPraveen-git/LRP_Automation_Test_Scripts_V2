package LRP_Cost_Scripts;

import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Cost_Activity_Report_TS044 extends Keywords {

	public void Cost_Activity_Report_TS044(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {

		String tc_Name = "TC_Cost_Activity_Report_TS044";
		String File_Path_SC = TestNgXml.getfilePath_FromExecution().get(tc_Name);
		String Sheet_Name_SC = TestNgXml.getsheetName_FromExecution().get(tc_Name);
		String url = TestNgXml.getdatafromExecution().get(tc_Name);
		Map<String, String> data = Utils.GetAllData(Sheet_Name_SC, tc_Name, "Dataset" + selected_dataset, File_Path_SC);

		String username = data.get("Username");
		String password = data.get("Password");
		String Cost_Activity_Report_Module = data.get("Cost_Activity_Report_Module");
		String Select_search_value = data.get("Select_search_value");
		String Condition = data.get("Condition");
		String CAR_No = data.get("CAR_No");
		String Upload_popup = data.get("Upload_popup");
		String Upload_Filename = data.get("Upload_Filename");
		String Filename = data.get("Filename");

		Extent_Start(tc_Name, test, test1);

		navigateUrl(driver, url);

		Step_Start(1, "Once login to the application and click on switch profile option and select the required agency",
				test, test1);

		LRP_Login(driver, username, password);

		Step_End(1, "Once login to the application and click on switch profile option and select the required agency",
				test, test1);

		Step_Start(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		verifyMainMenu(driver);

		moduleNavigate(driver, Cost_Activity_Report_Module);

		Step_End(2, "Enter the screen name as Cost Activity Report in module search field", test, test1);

		Step_Start(3, "Click on the global search option which is available in the tool bar", test, test1);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		Step_End(3, "Click on the global search option which is available in the tool bar", test, test1);

		Step_Start(4, "Check whether it opens a new search window", test, test1);

		if (isdisplayed(driver, type_Select1)) {

			System.out.println("New Search window got opened");
			Extent_pass(driver, "New Search window got opened", test, test1);
		} else {

			System.out.println("New Search window not got opened");
			Extent_fail(driver, "New Search window not got opened", test, test1);
		}

		Step_End(4, "Check whether it opens a new search window", test, test1);

		Step_Start(5, "Enter the required CAR No. in the CAR No search field", test, test1);

		waitForElement(driver, type_Select1);
		click(driver, type_Select1);
		selectByText(driver, type_Select1, Select_search_value);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

		Step_End(5, "Enter the required CAR No. in the CAR No search field", test, test1);

		Step_Start(6, "Then click on the search button", test, test1);

		click(driver, globalSearch_Frame_SearchButton);

		Step_End(6, "Then click on the search button", test, test1);

		Step_Start(7, "System will show the CAR No. and Click on the select button", test, test1);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		Step_End(7, "System will show the CAR No. and Click on the select button", test, test1);

		Step_Start(8, "System will retrieve the CAR", test, test1);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

		Step_End(8, "System will retrieve the CAR", test, test1);

		Step_Start(9, "Click on the document attachment option in the toolbar", test, test1);

		waitForElement(driver, Attachement_Button_toolBar);
		click(driver, Attachement_Button_toolBar);

		Step_End(9, "Click on the document attachment option in the toolbar", test, test1);

		Step_Start(10, "Ensure that Document attachment window gets opened", test, test1);

		waitForElement(driver, Document_AttachmentPage);

		Step_End(10, "Ensure that Document attachment window gets opened", test, test1);

		Step_Start(11, "Click on the select file option", test, test1);

		Step_Start(12, "A window from the system gets opened and select the required file and click on the open option",
				test, test1);

		uploadfile_new(driver, UploadInput, Upload_Filename);

		Step_End(11, "Click on the select file option", test, test1);

		Step_End(12, "A window from the system gets opened and select the required file and click on the open option",
				test, test1);

		Step_Start(13, "Click upload option", test, test1);

		waitForElement(driver, Upload);
		click(driver, Upload);

		Step_End(13, "Click upload option", test, test1);

		Step_Start(14, "System shows an information message as File Uploaded Successfully", test, test1);

		waitForElement(driver, popup_Message);
		String ActualPopupmessage = getText(driver, popup_Message);

		if (ActualPopupmessage.equals(Upload_popup)) {

			System.out.println(
					"Document was uploaded || Expected : " + Upload_popup + " || Actual : " + ActualPopupmessage);
			Extent_pass(driver,
					"Document was uploaded || Expected : " + Upload_popup + " || Actual : " + ActualPopupmessage, test,
					test1);
		} else {

			System.out.println(
					"Document was not uploaded || Expected : " + Upload_popup + " || Actual : " + ActualPopupmessage);
			Extent_fail(driver,
					"Document was not uploaded || Expected : " + Upload_popup + " || Actual : " + ActualPopupmessage,
					test, test1);
		}

		Step_End(14, "System shows an information message as File Uploaded Successfully", test, test1);

		Step_Start(15, "Click on the ok option", test, test1);

		waitForElement(driver, popup_Message_Ok_Button);
		click(driver, popup_Message_Ok_Button);

		Step_End(15, "Click on the ok option", test, test1);

		Step_Start(16, "Click close option", test, test1);

		waitForElement(driver, Close_Attachment);
		click(driver, Close_Attachment);

		Step_End(16, "Click close option", test, test1);

		Step_Start(17, "Ensure that clicking the document attachment in the toolbar, shows the uploaded documents",
				test, test1);

		waitForElement(driver, SearchButton_Toolbar);
		click(driver, SearchButton_Toolbar);

		waitForElement(driver, type_Select1);
		click(driver, type_Select1);
		selectByText(driver, type_Select1, Select_search_value);
		click(driver, globalSearch_Condition_Dropdown1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		clearAndType(driver, globalSearch_InputTextfield1, CAR_No);

		click(driver, globalSearch_Frame_SearchButton);

		waitForElement(driver, BL_Number_select);
		click(driver, BL_Number_select);

		waitForElement(driver, SelectButton);
		click(driver, SelectButton);

		waitForElement(driver, Attachement_Button_toolBar);
		click(driver, Attachement_Button_toolBar);

		waitForElement(driver, Document_AttachmentPage);

		String uploadfilecheck = String.format(Filename_field, Upload_Filename);

		if (isdisplayed(driver, uploadfilecheck)) {

			System.out.println("Uploaded file was showing in the Document Attachment page");
			Extent_pass(driver, "Uploaded file was showing in the Document Attachment page", test, test1);
		} else {

			System.out.println("Uploaded file was not showing in the Document Attachment page");
			Extent_fail(driver, "Uploaded file was not showing in the Document Attachment page", test, test1);

		}

		click(driver, uploadfilecheck);

		Set<String> old_Files = getDirectoryFiles();

		String gridDownload = String.format(GridDownload, Upload_Filename);

		waitForDisplay(driver, gridDownload);
		click(driver, gridDownload);

		wait(driver, "10");

		boolean isDownloaded = isNewFileDownloaded(old_Files, Filename);

		if (isDownloaded == true) {

			System.out.println("New excel file is downloaded in the downloads folder");
			Extent_pass(driver, "New excel file is downloaded in the downloads folder", test, test1);

		} else {
			System.out.println("New excel file is not downloaded in the downloads folder");
			Extent_fail(driver, "New excel file is not downloaded in the downloads folder", test, test1);
		}

		waitForElement(driver, Removeattchment);
		click(driver, Removeattchment);

		waitForElement(driver, Remove_attachment_yes);
		click(driver, Remove_attachment_yes);
		
		Step_End(17, "Ensure that clicking the document attachment in the toolbar, shows the uploaded documents",
				test, test1);

		Extent_completed(tc_Name, test, test1);

	}

}
