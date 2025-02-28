package LRP_EMS_Individual_Scripts;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;

import commonMethods.Utils;
import locators.Bill_Upload_Gate;


public class Bill_Upload_Gate_TS_046 extends Keywords{
	
	
	
	
	public void BillUploadGate(WebDriver driver, ExtentTest test,ExtentTest test1,String selected_dataset) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// Value are taken from excel sheet
		String testcase_Name = "Bill_Upload_Gate_TS_046";
		String URL = TestNgXml.getdatafromExecution().get(testcase_Name);
		String File_Path = TestNgXml.getfilePath_FromExecution().get(testcase_Name);
		String Sheet_Name = TestNgXml.getsheetName_FromExecution().get(testcase_Name);
		System.out.println(Sheet_Name);

		Map<String, String> data1 = Utils.GetAllData(Sheet_Name, testcase_Name, "Dataset" + selected_dataset,
				File_Path);
		String Username = data1.get("Username");// 1,2,4-6
		String Password = data1.get("Password");
	String Popupforimporexp45 = data1.get ("Popupforupload");
	String Search145 = data1.get ("Search_input1");
	String Search45 =  data1.get("Search_input");
	String excelFilePath = data1.get ("excelFilePath");
	String Sheet_select = data1.get ("Sheet_select");
	Extent_Start(testcase_Name, test, test1);


	navigateUrl(driver, URL);

	
	LRP_Login(driver, Username, Password);
	moduleNavigate(driver, Search45);


			
	Step_Start(1, " Click Import Excel button & select Excel file accordingly ",test, test1);
			waitForElement(driver, Aimport_excelll);
			click(driver, Aimport_excelll);
			waitForElement(driver, Aselectexcelfile);
			if (isDisplayed(driver, Aselectexcelfile)) {
				System.out.println("Import excel page opened");
				Extent_pass(driver, "Import excel page opened", test,test1);
			} else {
				System.out.println("Import excel page not opened");
				Extent_fail(driver, "Import excel page not opened", test,test1);
				
			}
			
			
		
			
			uploadfile1(driver,excelFilePath);
		
			
			waitForElement(driver, Aselectexcelfiledroupdown);
			click(driver, Aselectexcelfiledroupdown);
			String select_sheet =  String.format(Bill_Upload_Gate.Sheet_sel,Sheet_select); 
			
			waitForElement(driver, select_sheet);
			safeclick(driver, select_sheet);
			Step_End(1, " Click Import Excel button & select Excel file accordingly ",test, test1);
			Step_Start(2, "Select required file from local file manually & upload",test, test1);
			waitForElement(driver, Aloadsheet);
			click(driver, Aloadsheet);
			
		waitForElement(driver, Amapyesbutton);
		click(driver, Amapyesbutton);
		
			List<String> RGEMailId13_excelvalue = getExcelValue(excelFilePath, Sheet_select);

				System.out.println(RGEMailId13_excelvalue);
		
				
	
		
		List<WebElement> CancleReasons = listOfElements(driver, gird_val);
		List<String> reasons=new ArrayList<String>();

		for(WebElement CancleReason:CancleReasons) {
			
			String Gridvalues = getText1(driver, CancleReason);
			reasons.add(Gridvalues);
			System.out.println( Gridvalues);
		}

		
		
		
		if (RGEMailId13_excelvalue.equals(reasons)) {
			System.out
					.println("Matched || " + " Expected Activity is[Container No in grid] : " + reasons + " || Actual Activity is[Container No in Excel] : " + RGEMailId13_excelvalue);
			Extent_pass(driver,
					"Matched || " + " Expected Activity is[Container No in grid] : " + reasons + " ||Actual Activity is[Container No in Excel] : " + RGEMailId13_excelvalue,test,test1);
		} else {
			System.out.println(
					"Not matched || " + "Expected Activity is[Container No in grid] : " + reasons + " || Expected Activity is[Container No in grid] : " + RGEMailId13_excelvalue);
			Extent_fail(driver,
					"Not matched || " + " Expected Activity is[Container No in grid] : " + reasons + " || Expected Activity is[Container No in grid]: " + RGEMailId13_excelvalue,test,test1);
			
		}
		
		

			waitForElement(driver, Auploadfile);
			click(driver, Auploadfile);
			Step_End(2, "Select required file from local file manually & upload",test, test1);

			waitForElement(driver, ALessorbilluploded);
			if (isDisplayed(driver, ALessorbilluploded)) {
				System.out.println("Import excel page uploded");
				Extent_pass(driver, "Import excel page uploded", test,test1);
			} else {
				System.out.println("Import excel page not uploded");
				Extent_fail(driver, "Import excel page not uploded", test,test1);
			
			}
			Step_Start(3, "Confirmation message will be shown as Lessor Bill Uploaded",test, test1);
			
				String Popupforimporact=getText(driver, DataA4);
			System.out.println(Popupforimporact);
			
			
		
				if (Popupforimporexp45.equals(Popupforimporact)) {
					System.out
							.println("Matched || " + " Expected Activity is : " + Popupforimporexp45 + " || Actual Activity is : " + Popupforimporact);
					Extent_pass(driver,
							"Matched || " + " Expected Activity is : " + Popupforimporexp45 + " ||Actual Activity is : " + Popupforimporact,test,test1);
				} else {
					System.out.println(
							"Not matched || " + "row terminal was not edited : " + Popupforimporexp45 + " || Actual Activity is : " + Popupforimporact);
					Extent_fail(driver,
							"Not matched || " + "row terminal was not edited : " + Popupforimporexp45 + " || Actual Activity is : " + Popupforimporact,test,test1);
					
				}
			
			waitForElement(driver, Aokbutton);
			click(driver, Aokbutton); 
			Step_End(3, "Confirmation message will be shown as Lessor Bill Uploaded",test, test1);
		
			moduleNavigate(driver, Search145);
			
			String Location1=getText(driver, Arowoneclick);
			System.out.println(Location1);
			Extent_pass(driver,"Contract number shown as"+"****"+
					Location1,test,test1);
			
			String equetype45=getText(driver, Lessor);
			System.out.println(equetype45);
			Extent_pass(driver,"Lessor shown as"
					+"****"+ equetype45,test,test1);
			String equeque=getText(driver, Bill_no);
			System.out.println(equeque);
			Extent_pass(driver,"BillNo  shown as "+
					"***"+equeque,test,test1);
			String equequee=getText(driver, Billing_number);
			System.out.println(equequee);
			Extent_pass(driver,"Billing Period  shown as "+
					"***"+equequee,test,test1);
			
			
			String equequee1=getText(driver, Status);
			System.out.println(equequee1);
			Extent_pass(driver,"Status  shown as "+
					"***"+equequee1,test,test1);
			
		        
			
			
		        if (isDisplayed(driver, Acontractnumbergrid)) {
					System.out
							.println("Data was shown in grid");
					Extent_pass(driver,
							"***Data was shown in grid***",test,test1);
					Extent_pass(driver,
							"***Data was shown in Bill Upload Gate***",test,test1);
				} else {
					System.out.println(
							"Data was NOT shown in grid");
					Extent_fail(driver,
							"Data was NOT shown in grid",test,test1);
				
				}
			
			waitForElement(driver, Arowoneclick);
			click(driver, Arowoneclick);
			
			waitForElement(driver, Arowoneclick);
			RightClick(driver, Arowoneclick);
			waitForElement(driver, Aclearbills);
			click(driver, Aclearbills);
			waitForElement(driver, AclearbillspopOK);
			click(driver, AclearbillspopOK);
			
			waitForElement(driver, Arefresh);
			click(driver, Arefresh);
			Extent_completed(testcase_Name, test, test1);
			
}
	
}
