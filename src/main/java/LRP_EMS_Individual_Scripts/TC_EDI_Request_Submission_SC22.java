package LRP_EMS_Individual_Scripts;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_EDI_Request_Submission_SC22 extends Keywords {

	public void RequestSubmission22(WebDriver driver, ExtentTest test, ExtentTest test1, String selected_dataset)
			throws Exception {
		String testcase_Name="TC_EDI_Request_Submission_SC22";
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		String url = TestNgXml.getdatafromExecution().get(testcase_Name);
		Map<String, String> Data = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		
		String Username = Data.get("Username");
		String pass_word = Data.get("pass_word");
		String field_name1 = Data.get("field_name1");
		String Partner_Id = Data.get("Partner_Id");
		String Edi_Id = Data.get("Edi_Id");
		String Save_Popup = Data.get("Save_Popup");
		String Actual_Save_Popup = Data.get("Actual_Save_Popup");
		String file_Upload =  Data.get("file_Upload");
		String conditionFilter =  Data.get("conditionFilter");
		String partner_Id_Search =  Data.get("partner_Id_Search");
		String Edi_Id_Search =  Data.get("Edi_Id_Search");
		
		
		
		
		
		
		
		Extent_Start(testcase_Name, test, test1);

		// login
		navigateUrl(driver, url);
		LRP_Login(driver, Username, pass_word);
		// module search
		Extent_call(test, test1, "Enter module name in searchbox & click the module");
         
         
 		moduleNavigate(driver, field_name1);

		
		Step_Start(1, "Click on search icon besides Partner id field", test, test1);
		waitForElement(driver, searchField);
		click(driver, searchField);
		Step_End(1, "Click on search icon besides Partner id field", test, test1);
		
		Step_Start(2, "select appropriate partner code accordingly", test, test1);
		twoColumnSearchWindow(driver, partner_Id_Search, conditionFilter, Partner_Id);

		

		Step_End(2, "select appropriate partner code accordingly", test, test1);
		
		Step_Start(3, "Click on search icon besides EDI Id field", test, test1);
		waitForElement(driver, ediSearch);
		click(driver, ediSearch);
		Step_End(3, "Click on search icon besides EDI Id field", test, test1);
		
		Step_Start(4, "select appropriate id code accordingly", test, test1);
		
		twoColumnSearchWindow(driver, Edi_Id_Search, conditionFilter, Edi_Id);


        Step_End(4, "select appropriate id code accordingly", test, test1);
	
		
		Step_Start(5, "Click choose button & select excel file from local system manually", test, test1);
		waitForElement(driver, chooseOption);
		// upload file
		uploadfile2(driver, file_Upload);
        Step_End(5, "Click choose button & select excel file from local system manually", test, test1);
		
        Step_Start(6, "Click save button & message will be shown as submitted", test, test1);
		waitForElement(driver, saveOpt);
		click(driver, saveOpt);
	
		if (Save_Popup.equals(Actual_Save_Popup)) {

			System.out.println(
					"Matched || expected value was:" + Save_Popup + " || Actual value was:" + Actual_Save_Popup);
			Extent_pass(driver,
					"Matched || expected value was:" + Save_Popup + " || Actual value was:" + Actual_Save_Popup, test,
					test1);

		} else {
			System.out.println(
					"NotMatched || expected value was:" + Save_Popup + " || Actual value was:" + Actual_Save_Popup);
			Extent_fail(driver,
					"NotMatched || expected value was:" + Save_Popup + " || Actual value was:" + Actual_Save_Popup,
					test, test1);
		}
		Step_End(6, "Click save button & message will be shown as submitted", test, test1);

		waitForElement(driver, Excel_Upload);
		String Uploaded = getText(driver, Excel_Upload);
		System.out.println(Uploaded);
		if (file_Upload.contains(Uploaded)) {
			System.out.println("Matched || expected value was:" + file_Upload + " || Actual value was:" + Uploaded);
			Extent_pass(driver, "Matched || expected value was:" + file_Upload + " || Actual value was:" + Uploaded, test,
					test1);

		} else {
			System.out.println("NotMatched || expected value was:" + file_Upload + " || Actual value was:" + Uploaded);
			Extent_fail(driver, "NotMatched || expected value was:" + file_Upload + " || Actual value was:" + Uploaded,
					test, test1);
		}
		
		Extent_completed(testcase_Name, test, test1);

	}

}
