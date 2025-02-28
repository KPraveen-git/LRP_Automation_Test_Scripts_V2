package commonMethods;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Paths;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v114.network.Network;
import org.openqa.selenium.devtools.v114.network.model.Response;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentTest;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import atu.testng.reports.ATUReports;
import atu.testng.reports.utils.Directory;
import locators.EMS_Locators;
import locators.LoadConfirmation_Locators;

import com.sun.jna.platform.win32.KnownFolders;
import com.sun.jna.platform.win32.Shell32Util;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OLE2NotOfficeXmlFileException;
import org.apache.poi.ss.usermodel.*;
import org.apache.commons.jexl3.*;
//All the methods which we are using 
public class Keywords extends ATUReports implements EMS_Locators {

	public String ElementWait = Utils.getDataFromTestConfig("Wait Time");
	public int WaitElementSeconds =Integer.parseInt(ElementWait);
	public String Download_Wait = Utils.getDataFromTestConfig("Download_Time");
	public int downloadWait = Integer.parseInt(Download_Wait);
	public String Main_Window = "";
	public ArrayList<String> tabs;
	public WebElement fromElement;
	public static ITestResult result;
	public String report_Filepath = Utils.getDataFromTestConfig("Reports  path");
	public String date = getCurrentDate();
	public String folder_name = report_Filepath.concat(date);
	public String folder_name_subfolder = folder_name.concat("/");
	public String report_folder_create = folder_name_subfolder;
	public String report_name = "PocReport";
	public String filepath_date_concat = folder_name_subfolder.concat(report_name).concat(".html");
	public String screenshot_folder_name = folder_name_subfolder.concat("Screenshot");
	public String screenshot_folder_path = screenshot_folder_name.concat("/");
	public String screenshot_folder_create = screenshot_folder_path;
	public String firstValue;
	public String secondValue;
	public boolean failureScreenshot = Directory.TestPassScreenshot;
	public static ExtentTest test;
	public static boolean serverStatus=true;
	public static List<String> global=new ArrayList<>();
	List<String> Encryptedpassword = new ArrayList<>();
	/*
	 * Used to get the Current Date Value
	 */
	public String getCurrentDate() {
		Format formatter = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date date = new Date();
		String value = formatter.format(date);
		return value;
	}

	/*
	 * Used to Split the LocatorValue by using '>", And store the split values into array.
	 * split into 'Reference Value' and 'XpathValue'
	 */
	public static String[] splitXpath(String path) {
		String[] a = path.split(">");
		return a;
	}

	/*
	 * Used to get the  screenshot
	 */
	public String screenshot(WebDriver driver, String screenshotName) {
		String image_dest = null;
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String currenttime = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
			image_dest = System.getProperty("user.dir").concat("\\snaptrude\\" + currenttime + screenshotName)
					.concat(".png");
			System.out.println(image_dest);
			File destination = new File(image_dest);
			FileUtils.copyFile(source, destination);
			return image_dest;
		} catch (Exception e) {
			System.out.println("Exception while taking Screenshot" + e.getMessage());
			return e.getMessage();
		}
	}
	/*
	 * Used to wait for the Visibility of the Element in the page (30 seconds)
	 */
	public void waitForElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		String[] process = splitXpath(Processing_Locator);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(process[1])));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			Extent_pass(driver, "Waiting for the "+values[0], test, test1);
		} catch (Exception e) {
			Extent_fail(driver, "Element is not present " + values[0]+" -> "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present " + values[0]+ e.getLocalizedMessage());
		}
	}
	public List<String> getExcelValue(String excelFilePath, String SheetName) throws EncryptedDocumentException, InvalidFormatException, IOException {

		String filepath = System.getProperty("user.dir")+excelFilePath;
		Workbook workbook = WorkbookFactory.create(new File(filepath));
		Sheet sheet = workbook.getSheet(SheetName);	
		List<String> excelvalue = new ArrayList<String>();
		for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
			Row row = sheet.getRow(rowIndex); // Get the row at the current index
			if (row != null) {
				String RGEmailID13_value = "";

				Cell RGEmailID13Cell = row.getCell(0);
				if (RGEmailID13Cell != null) {
					CellType cellType = RGEmailID13Cell.getCellTypeEnum();
					if (cellType == CellType.STRING) {
						RGEmailID13_value = RGEmailID13Cell.getStringCellValue();
					} else if (cellType == CellType.NUMERIC) {
						// Handle numeric values if needed
						RGEmailID13_value = String.valueOf(RGEmailID13Cell.getNumericCellValue());
					} else if (cellType == CellType.BLANK) {
						// Handle blank cells
						RGEmailID13_value = ""; // Or any default value you want to use
					} else if (cellType == CellType.FORMULA) {
						// Handle formula cells
						RGEmailID13_value = ""; // Or evaluate the formula if needed
					}
				} else {
					// Cell is null, handle accordingly
					RGEmailID13_value = ""; // Or any default value you want to use
				}

				excelvalue.add(RGEmailID13_value);

			}
		}
		return excelvalue;
	}
	/*
	 * Used to clear the value on the element by using Actions class (Keyboard action)
	 */
	public void Newclear_Type(WebDriver driver) {
		try {
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
			wait(driver,"2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void LRP_Login(WebDriver driver, String Username, String Password) {
		waitForElement(driver, Login);
		if (isDisplayed(driver, Login)) {
			System.out.println("********************LogIn page is displayed********************");
			Extent_pass(driver, "********************LogIn page is displayed********************", test, test1);
		} else {
			System.out.println("********************LogIn page is not displayed********************");
			Extent_fail(driver, "********************LogIn page is not displayed********************", test, test1);
		}
		waitForElement(driver, Username_input);
		sendKeys(driver, Username_input, Username);
		waitForElement(driver, Password_input);
		sendKeys(driver, Password_input, Password);
		waitForElement(driver, Login);
		safeclick(driver, Login);

		alertAccept(driver);
		if (isDisplayed(driver, Home_Logo)) {
			System.out.println("********************Home page is displayed********************");
			Extent_pass(driver, "********************Home page is displayed********************", test, test1);
		} else {
			System.out.println("********************Home page is not displayed********************");
			Extent_fail(driver, "********************Home page is not displayed********************", test, test1);
		}
	}

	public String alertAccept(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10)); // Wait up to 10 seconds
			wait.until(ExpectedConditions.alertIsPresent()); // Wait for alert to be present
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			alert.accept();
			return alertText;
		} catch (Exception e) {
			return null;
		}
	}
	public static List<String> removeDuplicates(List<String> list) {
		if (list == null) {
			return new ArrayList<>();
		}
		return new ArrayList<>(new HashSet<>(list)); // Removes duplicates
	}
	public static boolean containsAllValues(List<String> expected, List<String> actual) {
		if (expected == null || actual == null) {
			return false;
		}

		for (String expValue : expected) {
			boolean matchFound = false;
			for (String actValue : actual) {
				if (areEqual(expValue, actValue)) {
					matchFound = true;
					break; // Found a match, no need to check further for this value
				}
			}
			if (!matchFound) {
				return false; // If any expected value is not found, return false
			}
		}
		return true;
	}
	private static boolean areEqual(String str1, String str2) {
		if (isNumeric(str1) && isNumeric(str2)) {
			return new BigDecimal(str1).compareTo(new BigDecimal(str2)) == 0;
		}
		return str1.equals(str2);
	}
	public void RightClick1(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver,
					"Element not clickable or not found within the timeout period: " + element + " " + e.getMessage(),
					test, test1);
			global.add("Element not clickable or not found - " + element);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver,
					"An unexpected error occurred while waiting for the element: " + element + " " + e.getMessage(),
					test, test1);
			global.add("Error occurred while waiting for element - " + element);
			verifyServerStatus(driver);
			Assert.fail();
		}

		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).build().perform();
			builder.contextClick(element).build().perform();
			Extent_pass(driver, "Able to click on " + element + "- ", test, test1);
			wait(driver, "1");
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present " + e.getLocalizedMessage(), test, test1);
			global.add("Element is not present - " + element);
			verifyServerStatus(driver);
			Assert.fail("Element is not present " + e.getLocalizedMessage());
		}
	}
	public void Scroll_ElementVisible(WebDriver driver, String xpath, String scroll) {

		String value[] = splitXpath(xpath);
		String scrollpath[] = splitXpath(scroll);

		WebElement scroller = driver.findElement(By.xpath(scrollpath[1]));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boolean elementFound = false;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		while (!elementFound) {
			try {

				WebElement element = driver.findElement(By.xpath(value[1]));

				if (element.isDisplayed()) {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
					wait.until(ExpectedConditions.elementToBeClickable(element));
					elementFound = true;
					System.out.println("Element is visible!");
				} else {
					// Scroll to bring it into view if found but not visible
					js.executeScript("arguments[0].scrollIntoView(true);", element);
				}
			} catch (Exception e) {
				// If not found or still not visible, scroll further
				Long currentScroll = ((Number) js.executeScript("return arguments[0].scrollLeft;", scroller))
						.longValue();
				Long maxScroll = ((Number) js
						.executeScript("return arguments[0].scrollWidth - arguments[0].clientWidth;", scroller))
						.longValue();

				if (currentScroll >= maxScroll) {
					System.out.println("Reached the end of the scroll area. Element not found.");
					break; // Exit loop if no more scrolling possible
				}

				// Scroll horizontally
				js.executeScript("arguments[0].scrollLeft += 500;", scroller);
			}
		}

	}
	public List<Map<String, String>> getTableData2(WebDriver driver, String Header, String Row) {
		String[] columnheader = splitXpath(Header);
		String[] row = splitXpath(Row);
		List<WebElement> headers = driver.findElements(By.xpath(columnheader[1]));
		List<String> headerTexts = new ArrayList<>();
		for (WebElement header : headers) {
			String headername = header.getDomAttribute("aria-label");
			try {
				if (headername.contains(":")) {
					String[] headerName = headername.split(":");
					headerTexts.add(headerName[1]);
				} else {
					headerTexts.add(headername);
				}
			} catch (NullPointerException e) {
				headerTexts.add(null);
				continue;
			}
		}
		// Locate the values table
		List<WebElement> rows = driver.findElements(By.xpath(row[1]));
		// List to hold all row data as a list of maps
		List<Map<String, String>> tableData = new ArrayList<>();
		// Iterate through each row (starting from 1 to skip the header row)
		int k = 1;
		for (WebElement tableRow : rows) {
			try {
				List<WebElement> cells = tableRow.findElements(By.tagName("td"));
				// Create a map for each row
				Map<String, String> rowData = new HashMap<>();

				for (int j = 0; j < cells.size(); j++) {
					if (j < headerTexts.size()) {
						rowData.put(headerTexts.get(j), cells.get(j).getText());
					}
				}
				// Add the row map to the list
				tableData.add(rowData);
			} catch (Exception e) {
				System.err.println("Error processing row " + k + ": " + e.getMessage());
				e.printStackTrace();
				Extent_fail(driver, "Error processing row " + k + ": " + e.getMessage(), test, test1);
				global.add("Error processing row " + k + ": " + e.getMessage());
				verifyServerStatus(driver);
				Assert.fail("Element is not present " + e.getLocalizedMessage());
			}
			k++;
		}
		// Fetch values by header
		return tableData;
	}
	public void waitInvisible(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(
					By.xpath("//div[contains(@class,'blockUI blockMsg blockElement')]//span[text()='Processing..']")));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(values[1])));
			Extent_pass(driver, "Waiting for the " + values[0], test, test1);
		} catch (Exception e) {
			Extent_fail(driver, "Element is not present " + values[0] + " -> " + e.getLocalizedMessage(), test, test1);
			global.add("Element is not present - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present " + values[0] + e.getLocalizedMessage());
		}
	}
	public String evaluateExpression(String formulaText, String simulatorValue) {
		String updatedText = formulaText.replaceAll("#[^#]+#", simulatorValue);

		try {
			// Create JEXL Engine
			JexlEngine jexl = new JexlBuilder().create();
			JexlExpression jexlExpression = jexl.createExpression(updatedText);
			JexlContext context = new MapContext();

			// Evaluate the mathematical expression
			Object result = jexlExpression.evaluate(context);
			System.out.println("Evaluated Result: " + result);

			return result.toString(); // Return evaluated result as String
		} catch (Exception e) {
			System.out.println("Error evaluating expression: " + e.getMessage());
			return "Error"; // Return an error message
		}
	}


	public void twoColumnSearchWindow(WebDriver driver,String Column_Header,String Condition_Filter,String value) {
		String columnHeader = String.format(two_Column_Search_Column_Header, Column_Header);
		waitForElement(driver, columnHeader);
		String columnIndex = getAttribute(driver, columnHeader, "aria-colindex");
		String filter_Field = String.format(Filter_Input_Field, columnIndex);
		String filter_Btn = String.format(Filter_Button, columnIndex);
		String column_Values = String.format(column_Value, columnIndex);
		boolean flag=true;
		if(Condition_Filter.equalsIgnoreCase("Equals")) {
			waitForElement(driver, filter_Field);
			sendKeys(driver, filter_Field, value);
			waitForElement(driver, filter_Btn);
			click(driver, filter_Btn);
			waitForElement(driver, Filter_Operator);
			click(driver, Filter_Operator);
			waitForElement(driver, Equals_Option);
			click(driver, Equals_Option);
			waitForElement(driver, columnHeader);
			click(driver, columnHeader);
			waitForElement(driver, column_Values);
			click(driver, column_Values);
			waitForElement(driver, select_Button);
			click(driver, select_Button);
		}else {
			waitForElement(driver, filter_Field);
			sendKeys(driver, filter_Field,value);
			List<WebElement> cloumns_Values = listOfElements(driver, column_Values);
			for(WebElement cloumns_Value : cloumns_Values) {
				String column_Text = cloumns_Value.getText();
				if(column_Text.contains(value)) {
					cloumns_Value.click();
					flag=false;
					break;
				}
			}
			if(flag) {
				Extent_fail(driver, value+ " The value is Not found in the current window", test, test1);
			}else {
				waitForElement(driver, select_Button);
				click(driver, select_Button);
			}
		}
	}
	public void twoColumnSearchWindowMultipleValue(WebDriver driver,String Column_Header,String Condition_Filter,String value) {
		String columnHeader = String.format(two_Column_Search_Column_Header, Column_Header);
		waitForElement(driver, columnHeader);
		String columnIndex = getAttribute(driver, columnHeader, "aria-colindex");
		String filter_Field = String.format(Filter_Input_Field, columnIndex);
		String filter_Btn = String.format(Filter_Button, columnIndex);
		String column_Values = String.format(column_Value, columnIndex);
		List<String> Column_Sel_Values = splitAndExpand(value);
		for(String Column_Sel_Value : Column_Sel_Values) {
			boolean flag=true;
			if(Condition_Filter.equalsIgnoreCase("Equals")) {
				waitForElement(driver, filter_Field);
				sendKeys(driver, filter_Field, Column_Sel_Value);
				waitForElement(driver, filter_Btn);
				click(driver, filter_Btn);
				waitForElement(driver, Filter_Operator);
				click(driver, Filter_Operator);
				waitForElement(driver, Equals_Option);
				click(driver, Equals_Option);
				waitForElement(driver, columnHeader);
				click(driver, columnHeader);
				waitForElement(driver, column_Values);
				click(driver, column_Values);
			}else {
				waitForElement(driver, filter_Field);
				sendKeys(driver, filter_Field,value);
				List<WebElement> cloumns_Values = listOfElements(driver, column_Values);
				for(WebElement cloumns_Value : cloumns_Values) {
					String column_Text = cloumns_Value.getText();
					if(column_Text.contains(value)) {
						cloumns_Value.click();
						flag=false;
						break;
					}
				}
				if(flag) {
					Extent_fail(driver, value+ " The value is Not found in the current window", test, test1);
				}
			}
			waitForElement(driver, select_Button);
			click(driver, select_Button);
		}
	}
	public void verifyMainMenu(WebDriver driver) {
		waitForDisplay(driver, main_Menu_ID);
		if (isdisplayed(driver, main_Menu_ID)) {
			click(driver, hide_Menu_ID);
			if (!isdisplayed(driver, main_Menu_ID)) {
				System.out.println("Main Menu Hided After Clicking The Hide Menu Button");
				Extent_pass(driver, "Main Menu Hided After Clicking The Hide Menu Button", test, test1);
			} else {
				System.out.println("Main Menu Not Hided After Clicking The Hide Menu Button");
				Extent_fail(driver, "Main Menu Not Hided After Clicking The Hide Menu Button", test, test1);
			}
		}
	}
	public static void typeText(String text) throws AWTException {

		try {
			Thread.sleep(2000);
			for (char c : text.toCharArray()) {
				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
				if (KeyEvent.CHAR_UNDEFINED == keyCode) {
					throw new RuntimeException("Key code not found for character '" + c + "'");
				}

				Robot robot = new Robot();
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public void globalValueSearchWindow(WebDriver driver,String Condition,String Search_Type1,String Search_Input1,String Search_Type2,String Search_Input2,String Search_Type3,String Search_Input3){
		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, Search_Type1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		sendKeys(driver, globalSearch_InputTextfield1, Search_Input1);
		if(!Search_Input2.equals("")) {
			waitForElement(driver, type_Select2);
			selectByText(driver, type_Select2, Search_Type2);
			selectByText(driver, globalSearch_Condition_Dropdown2, Condition);
			sendKeys(driver, globalSearch_InputTextfield2, Search_Input2);
		}
		if(!Search_Input3.equals("")) {
			waitForElement(driver, type_Select3);
			selectByText(driver, type_Select3, Search_Type3);
			selectByText(driver, globalSearch_Condition_Dropdown3, Condition);
			sendKeys(driver, globalSearch_InputTextfield3, Search_Input3);
		}
		click(driver, globalSearch_Frame_SearchButton);
		waitForElement(driver, retrivedGlobalValue);
		click(driver, retrivedGlobalValue);
		waitForElement(driver, SelectButton);
		click(driver, SelectButton);
	}
	public void selectDatePicker(WebDriver driver, String Locator, String DateValue) {
		StringBuilder day = new StringBuilder();
		StringBuilder month = new StringBuilder();
		StringBuilder year = new StringBuilder();
		try {
			click(driver, Locator);
			datePicker(DateValue, day, month, year);
			waitForElement(driver, Month_DD);
			selectByText(driver, Month_DD,month.toString());
			waitForElement(driver, Year_DD);
			selectByText(driver, Year_DD,year.toString());
			String date_select =  String.format(Date_Select,day );
			click(driver, date_select);
		}catch(Exception e) {
		}
	}
	public void globalValueSearchWindow1(WebDriver driver,String Condition,String Search_Type1,String Search_Input1,String Search_Type2,String Search_Input2,String Search_Type3,String Search_Input3){
		waitForElement(driver, type_Select1);
		selectByText(driver, type_Select1, Search_Type1);
		selectByText(driver, globalSearch_Condition_Dropdown1, Condition);
		sendKeys(driver, globalSearch_InputTextfield1, Search_Input1);
		if(!Search_Input2.equals("")) {
			waitForElement(driver, type_Select2);
			selectByText(driver, type_Select2, Search_Type2);
			selectByText(driver, globalSearch_Condition_Dropdown2, Condition);
			sendKeys(driver, globalSearch_InputTextfield2, Search_Input2);
		}
		if(!Search_Input3.equals("")) {
			waitForElement(driver, type_Select3);
			selectByText(driver, type_Select3, Search_Type3);
			selectByText(driver, globalSearch_Condition_Dropdown3, Condition);
			sendKeys(driver, globalSearch_InputTextfield3, Search_Input3);
		}
		click(driver, globalSearch_Frame_SearchButton);

	}
	public void SwitchProfile(WebDriver driver,String AgencyUser) {
		waitForElement(driver, Switch_Profile);
		safeclick(driver, Switch_Profile);
		waitForElement(driver, agency_Code_Filter);
		sendKeys(driver, agency_Code_Filter, AgencyUser);

		waitForDisplay(driver, select_Agency);
		if(isdisplayed(driver, select_Agency)) {
			waitForElement(driver, select_Agency);
			safeclick(driver, select_Agency);
			waitForElement(driver, Switch_Profile_Button);
			safeclick(driver, Switch_Profile_Button);
		}else {
			waitForElement(driver, Profile_Dropdown);
			safeclick(driver, Profile_Dropdown);
			waitForElement(driver, Corporate_Profile);
			safeclick(driver, Corporate_Profile);
			waitForElement(driver, Profile_Dropdown);
			safeclick(driver, Profile_Dropdown);
			waitForElement(driver, Location_Profile);
			safeclick(driver, Location_Profile);
			waitForElement(driver, agency_Code_Filter);
			sendKeys(driver, agency_Code_Filter, AgencyUser);
			waitForElement(driver, select_Agency);
			safeclick(driver, select_Agency);
			waitForElement(driver, Switch_Profile_Button);
			safeclick(driver, Switch_Profile_Button);
		}
	}
	public void ResetProfile(WebDriver driver) {
		waitForElement(driver, Switch_Profile);
		safeclick(driver, Switch_Profile);
		waitForElement(driver, reset_Profile_Button);
		safeclick(driver, reset_Profile_Button);
	}
	public void selectValue(WebDriver driver,String Condition_Filter,String value) {
		boolean flag=true;
		if(Condition_Filter.equalsIgnoreCase("Equals")||Condition_Filter.equalsIgnoreCase("Equal To")) {
			waitForElement(driver, Filter_Field);
			sendKeys(driver, Filter_Field, value);
			waitForElement(driver, Filter_Button);
			click(driver, Filter_Button);
			waitForElement(driver, contains_Click);
			click(driver, contains_Click);
			waitForElement(driver, Equals_Option);
			click(driver, Equals_Option);
			waitForElement(driver, Filter_Field);
			click(driver, Filter_Field);
			waitForElement(driver, column_Values);
			click(driver, column_Values);
			waitForElement(driver, select_Button);
			click(driver, select_Button);
		}else {
			waitForElement(driver, Filter_Field);
			sendKeys(driver, Filter_Field,value);
			List<WebElement> cloumns_Values = listOfElements(driver, column_Values);
			for(WebElement cloumns_Value : cloumns_Values) {
				String column_Text = cloumns_Value.getText();
				if(column_Text.contains(value)) {
					cloumns_Value.click();
					flag=false;
					break;
				}
			}
			if(flag) {
				Extent_fail(driver, value+ " The value is Not found in the current window", test, test1);
			}else {
				waitForElement(driver, select_Button);
				click(driver, select_Button);
			}
		}
	}
	public void selectValue1(WebDriver driver,String Condition_Filter,String value) {
		boolean flag=true;
		if(Condition_Filter.equalsIgnoreCase("Equals")||Condition_Filter.equalsIgnoreCase("Equal To")) {
			waitForElement(driver, Filter_Field1);
			sendKeys(driver, Filter_Field1, value);
			waitForElement(driver, Filter_Button1);
			click(driver, Filter_Button1);
			waitForElement(driver, contains_Click);
			click(driver, contains_Click);
			waitForElement(driver, Equals_Option);
			click(driver, Equals_Option);
			waitForElement(driver, column_Values);
			click(driver, column_Values);
			waitForElement(driver, select_Button);
			click(driver, select_Button);
		}else {
			waitForElement(driver, Filter_Field1);
			sendKeys(driver, Filter_Field1,value);
			List<WebElement> cloumns_Values = listOfElements(driver, column_values_Right);
			for(WebElement cloumns_Value : cloumns_Values) {
				String column_Text = cloumns_Value.getText();
				if(column_Text.contains(value)) {
					cloumns_Value.click();
					flag=false;
					break;
				}
			}
			if(flag) {
				Extent_fail(driver, value+ " The value is Not found in the current window", test, test1);
			}else {
				waitForElement(driver, select_Button);
				click(driver, select_Button);
			}
		}
	}
	public void selectValue2(WebDriver driver,String Condition_Filter,String value) {
		boolean flag=true;
		if(Condition_Filter.equalsIgnoreCase("Equals")||Condition_Filter.equalsIgnoreCase("Equal To")) {
			waitForElement(driver, Filter_Field2);
			sendKeys(driver, Filter_Field2, value);
			waitForElement(driver, Filter_Button2);
			click(driver, Filter_Button2);
			waitForElement(driver, contains_Click);
			click(driver, contains_Click);
			waitForElement(driver, Equals_Option);
			click(driver, Equals_Option);
			waitForElement(driver, Filter_Field1);
			click(driver, Filter_Field1);
			waitForElement(driver, column_values_Right);
			click(driver, column_values_Right);
			waitForElement(driver, select_Button);
			click(driver, select_Button);
		}else {
			waitForElement(driver, Filter_Field2);
			sendKeys(driver, Filter_Field2,value);
			List<WebElement> cloumns_Values = listOfElements(driver, column_values_Right);
			for(WebElement cloumns_Value : cloumns_Values) {
				String column_Text = cloumns_Value.getText();
				if(column_Text.contains(value)) {
					cloumns_Value.click();
					flag=false;
					break;
				}
			}
			if(flag) {
				Extent_fail(driver, value+ " The value is Not found in the current window", test, test1);
			}else {
				waitForElement(driver, select_Button);
				click(driver, select_Button);
			}
		}
	}
	/*
	 * Used to wait for the Visibility of the Element in the page (30 seconds)
	 */
	public void waitForDownload(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(downloadWait));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(downloadWait));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
		} catch (Exception e) {
			Extent_fail(driver, "Element is not present " + values[0]+ e.getLocalizedMessage(), test,test1);
			verifyServerStatus(driver);
			Assert.fail();
		}
	}
	/*
	 * Used to click the web element
	 */
	public void Click(WebDriver driver, WebElement element) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			element.click();
			Extent_pass(driver, "Click on Element", test,test1);

		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to click on Element "+ e.getLocalizedMessage(), test,test1);

			Assert.fail();
			verifyServerStatus(driver);
		}

	}
	/*
	 * Used to wait the invisibility of element
	 */
	public void elementnotvisible(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			for (int i = 1; i <= WaitElementSeconds; i++) {
				boolean flag = webElement.isDisplayed();
				if (flag == true) {
					Thread.sleep(1000);
				} else {
					break;
				}
			}
		} catch (Exception e) {

		}
	}

	/*
	 * Used to Upload the file
	 */
	public void uploadfile2(WebDriver driver, String path) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
			File file = new File(path);
			System.out.println(file.getAbsolutePath());
			element.sendKeys(file.getAbsolutePath());
			wait(driver, "2");
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
		}
	}

	/*
	 * Used to verify the particular element is having the text
	 */
	public boolean verifyElementHasText(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		boolean temp=false;
		try {
			String text = driver.findElement(By.xpath(values[1])).getText();
			if (text.equals("")) {
				temp=false;
				verifyServerStatus(driver);
				Assert.fail();	

			} else {
				temp=true;
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Extent_fail(driver, values[0]+" is Not Available", test,test1);
			verifyServerStatus(driver);
			global.add(values[0]+" is Not Available");
			Assert.fail();
		}
		return temp;
	}
	/*
	 * Used to wait for the Visibility of the Element in the page (30 seconds)
	 */
	public void waitForElement(WebDriver driver,WebElement element) {
		String[] process = splitXpath(Processing_Locator);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(process[1])));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOf(element));
			Extent_pass(driver, "Waiting for the Element", test, test1);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - ");
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}
	/*
	 * Used to wait and click the particular Element
	 */
	public void click(WebDriver driver, String Xpath) {
		String[] values = splitXpath(Xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
			WebElement element = driver.findElement(By.xpath(values[1]));
			element.click();
			Extent_pass(driver, "Click on " + values[0], test,test1);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to click on " + values[0]+"  "+ e.getLocalizedMessage(), test,test1);
			global.add("Unable to click on - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
	}
	/*
	 * Used to perform the Right click action for the particular element
	 */
	public void RightClick(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}

		try {
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).build().perform();
			builder.contextClick(element).build().perform();
			Extent_pass(driver, "Able to click on " + values[0] + "- " , test,test1);
			wait(driver,"1");
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}
	/*
	 * Used to upload the file in to application
	 */
	public void uploadfile1(WebDriver driver,String xpath,String path) {
		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = driver.findElement(By.xpath(values[1]));
			File file = new File(path);
			System.out.println(file.getAbsolutePath());
			element.sendKeys(file.getAbsolutePath());
			Extent_pass(driver, "uploaded the file " + path, test, test);
			wait(driver, "2");
		} catch (Exception e) {
			Extent_fail(driver, "upload is falied - " + path + e.getLocalizedMessage(), test, test);
			e.printStackTrace();
			Assert.fail();
		}
	}
	/*
	 * Used to Send the value to the particular Element
	 */
	public String getText1(WebDriver driver, WebElement element) {
		try {
			String text = element.getText();
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			verifyServerStatus(driver);
			Assert.fail();

			return null;
		}
	}
	public String extractValue(String input, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()) {
			return matcher.group(1);  // Return the value captured in the first capturing group
		}
		return "Not found";  // Return a default message if no match is found
	}
	/*
	 * Used to scroll down to element by using that elements height
	 */
	public void scrollDownByHeight(WebDriver driver, String xpath) {

		String[] splitXp = xpath.split(">");
		try {
			WebElement element = driver.findElement(By.xpath(splitXp[1]));
			Dimension ele = element.getSize();
			int height = ele.getHeight();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollTop += " + height + ";", element);
			Extent_pass(driver, "Scrolled to " + splitXp[0], test, test1);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to scroll " + splitXp[0], test, test1);
			Assert.fail();
		}
	}
	/*
	 * Used to Upload The File
	 */
	public void uploadfile_new(WebDriver driver, String xpath, String excelpath) {

		String filepath = ".\\uploads\\" + excelpath;

		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = driver.findElement(By.xpath(values[1]));
			File file = new File(filepath);
			System.out.println(file.getAbsolutePath());
			element.sendKeys(file.getAbsolutePath());
			Extent_pass(driver, values[0] + "Scucessfully uploaded the " + excelpath, test, test1);

			wait(driver, "2");
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, values[0] + "Failed to upload the " + excelpath + e, test, test1);
		}
	}
	/*
	 * Used to get the row count from the Excel sheet
	 */
	public String rowcountxls(WebDriver driver, String excelpath, String sheetName) {

		String filepath = ".\\uploads\\" + excelpath; // Corrected file path reference
		int dataRows = 0; // Declare variable outside try block

		try {
			FileInputStream file = new FileInputStream(new File(filepath));
			Workbook workbook = WorkbookFactory.create(file); // Auto-detect .xls or .xlsx
			Sheet sheet = workbook.getSheet(sheetName); // Get sheet by name

			if (sheet == null) {
				System.out.println("Sheet with name '" + sheetName + "' not found.");
			} else {
				int totalRows = sheet.getPhysicalNumberOfRows(); // Counts non-empty rows
				dataRows = (totalRows > 1) ? totalRows - 1 : 0; // Exclude header row
				System.out.println("Total rows (excluding header): " + dataRows);
			}

			workbook.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return String.valueOf(dataRows); // Convert int to String as return type is String
	}
	/*
	 * Used to convert the hexaCode to colur name
	 */
	public static String getColorName(String hexaCode) {
		String colorName = "Unknown Color";

		switch (hexaCode.toUpperCase()) {
		// Whites
		case "#FFFFFF":
			colorName = "White";
			break;
		case "#F5F5F5":
		case "#DCDCDC":
			colorName = "Light Gray";
			break;
		case "#808080":
			colorName = "Gray";
			break;
		case "#696969":
			colorName = "Dark Gray";
			break;

			// Blacks
		case "#000000":
			colorName = "Black";
			break;

			// Reds
		case "#FF0000":
			colorName = "Red";
			break;
		case "#8B0000":
			colorName = "Dark Red";
			break;
		case "#FF6666":
			colorName = "Light Red";
			break;

			// Greens
		case "#00FF00":
			colorName = "Green";
			break;
		case "#006400":
			colorName = "Dark Green";
			break;
		case "#90EE90":
			colorName = "Light Green";
			break;

			// Blues
		case "#0000FF":
			colorName = "Blue";
			break;
		case "#00008B":
			colorName = "Dark Blue";
			break;
		case "#ADD8E6":
			colorName = "Light Blue";
			break;

			// Yellows
		case "#FFFF00":
			colorName = "Yellow";
			break;
		case "#FFD700":
			colorName = "Golden Yellow";
			break;
		case "#FFFACD":
			colorName = "Light Yellow";
			break;

			// Purples
		case "#800080":
			colorName = "Purple";
			break;
		case "#4B0082":
			colorName = "Dark Purple";
			break;
		case "#DA70D6":
			colorName = "Light Purple";
			break;

			// Oranges
		case "#FFA500":
			colorName = "Orange";
			break;
		case "#FF8C00":
			colorName = "Dark Orange";
			break;
		case "#FFDAB9":
			colorName = "Light Orange";
			break;

			// Pinks
		case "#FFC0CB":
			colorName = "Pink";
			break;
		case "#FF69B4":
			colorName = "Hot Pink";
			break;
		case "#F08080":
			colorName = "Light Pink";
			break;
		case "#7CFC00":	
			colorName = "lawn green";
			break;
		default:
			colorName = "Unknown Color"; // If the hex code is not listed
			break;
		}
		return colorName;
	}
	/*
	 * Used to get the Last row value by given column header
	 */
	public String getLastRowValueByHeader(List<Map<String, String>> tableData, String headerName) {
		if (tableData == null || tableData.isEmpty()) {
			return null; // Return null if no data is available
		}
		Map<String, String> lastRow = tableData.get(tableData.size() - 1);
		return lastRow.get(headerName);
	}
	public static boolean isSecondDateBeforeFirst(String firstDateStr, String secondDateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date firstDate = sdf.parse(firstDateStr);
			Date secondDate = sdf.parse(secondDateStr);
			if(secondDate.before(firstDate)) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false; // Return false if parsing fails
		}
	}
	/*
	 * Used to perform the doubleClick action on the element in the page by passing the WebElement as argument
	 * proving the WebElement and perform the Double Click action on the element
	 */
	public void doubleClick1(WebDriver driver, WebElement element) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			Actions action = new Actions(driver).doubleClick(element);
			action.build().perform();
			Extent_pass(driver, "Able to click on element"  + "- " , test,test1);
		} catch (Exception e) {
			Extent_fail(driver, "Unable to click on element- " + e.getLocalizedMessage(), test,test1);

			verifyServerStatus(driver);
			Assert.fail();
		}
	}

	public Map<String, List<String>> extractTableData(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			// Wait until the table is present
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			// Locate the parent div containing the table data
			WebElement tableContainer = driver.findElement(By.xpath(values[1]));
			// Get all header cells
			List<WebElement> headers = tableContainer.findElements(By.xpath(".//span[@ref='eText' and contains(@class,'cell')]"));
			// Create a map to store column data
			Map<String, List<String>> tableData = new HashMap<>();
			// Initialize map with headers
			for (WebElement header : headers) {
				tableData.put(header.getText(), new ArrayList<>());
			}
			// Get all rows from the container
			List<WebElement> rows = tableContainer.findElements(By.xpath(".//div[@ref='eCenterContainer']//div[@role='row']"));
			// Iterate through the rows
			for (WebElement row : rows) {
				// Get all cells (or items) within each row
				List<WebElement> cells = row.findElements(By.tagName("div"));
				// Fill map with row data
				for (int i = 0; i < cells.size(); i++) {
					String columnHeader = headers.get(headers.size() - 1 - i).getText(); // Reverse the index
					tableData.get(columnHeader).add(cells.get(i).getText());
				}
			}
			return tableData;
		}catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to get the Table Value from Element - "+values[0]+" "+e.getLocalizedMessage(), test, test);
			return null;
		}
	}

	public static String printTable(WebDriver driver,Map<String, List<String>> tableData, List<String> headers) {
		StringBuilder tableBuilder = new StringBuilder();
		tableBuilder.append("<table style='width:100%; border-collapse: collapse;'>");
		tableBuilder.append("<thead><tr>");

		// Print headers
		for (String header : headers) {
			tableBuilder.append("<th style='border: 1px solid #ddd; padding: 8px;'>")
			.append(header)
			.append("</th>");
		}
		tableBuilder.append("</tr></thead><tbody>");

		// Retrieve and print values for the headers
		List<List<String>> valuesByHeader = new ArrayList<>();
		for (String header : headers) {
			List<String> values = tableData.getOrDefault(header, Collections.emptyList());
			valuesByHeader.add(values);
		}

		// Find the maximum number of rows for alignment
		int maxRows = valuesByHeader.stream().mapToInt(List::size).max().orElse(0);

		// Print the values in a table format
		for (int i = 0; i < maxRows; i++) {
			tableBuilder.append("<tr>");
			for (List<String> values : valuesByHeader) {
				if (i < values.size()) {
					tableBuilder.append("<td style='border: 1px solid #ddd; padding: 8px;'>")
					.append(values.get(i))
					.append("</td>");
				} else {
					tableBuilder.append("<td style='border: 1px solid #ddd; padding: 8px;'></td>"); // Empty cell
				}
			}
			tableBuilder.append("</tr>");
		}
		tableBuilder.append("</tbody></table>");
		return tableBuilder.toString(); 
		// Add the table to the Extent Report
		// Extent_pass(driver, "<div style='overflow-x:auto;'>" + tableBuilder.toString() + "</div>", test, test1);
	}

	/*
	 * Used to verify the particular element is not having the text
	 */
	public boolean verifyElementHasNoText(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		boolean temp=false;
		try {
			String text = driver.findElement(By.xpath(values[1])).getText();
			if (text.equals("")) {
				temp=true;
			} else {
				temp=false;
				verifyServerStatus(driver);
				Assert.fail();			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
		return temp;
	}
	/*
	 * Used to scroll the page to vertically
	 */
	public void verticalScroll(WebDriver driver, String xpath, int input ) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollTop += " + input + ";", element);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}
	/*
	 * Used to send(Type) the value in the particular element
	 * This method created by using Selenium WebDriver 
	 */
	public void sendKeys(WebDriver driver, String xpaths, String keysToSend) {
		String[] values = splitXpath(xpaths);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
			//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.sendKeys(keysToSend);
			Extent_pass(driver, "Type on " + values[0]+" -> The Typing Value is : "+keysToSend, test,test1);
			wait(driver, "1");
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to type on " + values[0]+"  "+  e.getLocalizedMessage()+"  "+ "The Typing Value is : "+keysToSend, test,test1);
			global.add("Unable to type on - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}

	}

	/*
	 * Used to send(Type) the value in the particular element
	 * This method created by using Actions class in the selenium
	 */
	public void Actionsendkeys(WebDriver driver,String xpath, String text) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Actions act = new Actions(driver);
			act.moveToElement(webElement).perform();
			act.sendKeys(text).build().perform();
			Extent_pass(driver, "Able to Send Keys on " + values[0]+" -> The Typing Value is : "+text , test,test1);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}

	}
	/*
	 * Used to get the current text color for the particular element
	 */
	public String getTextColor(WebDriver driver, String Xpath) {
		String[] values = splitXpath(Xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		String hexcolor = "";
		try {
			WebElement eleSearch = driver.findElement(By.xpath(values[1]));
			String rgbFormat = eleSearch.getCssValue("color");
			hexcolor = rgbToHex(rgbFormat);
			Extent_pass(driver, "Get the Text Color of "+ values[0], test,test1);
			return hexcolor;
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
		return hexcolor;
	}

	/*
	 * External wait, used to hold(wait) the execution for particular time
	 */
	public void wait(WebDriver driver, String inputData) {
		try {
			int time = Integer.parseInt(inputData);
			int seconds = time * 1000;
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - ");
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}


	/*
	 * Used to Check weather the element is elebled or not for particular Element
	 */	
	public boolean IsElementEnabled(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebElement webElement = driver.findElement(By.xpath(values[1]));
		webElement.isEnabled();
		return true;
	}

	/*
	 * Used to download and save the file
	 */
	public void Downloadedfile(String filename) {
		String os = System.getProperty("os.name").toLowerCase();
		String downloadPath = "";
		if (os.contains("win")) {
			// For Windows, using Shell32Util
			downloadPath = Paths.get(System.getProperty("user.home"), "Downloads").toString();
		} else {
			// Defaulting to user home directory if OS is not recognized
			downloadPath = System.getProperty("user.home");
		}

		//			String downloadsPath = "C:\\Users\\TRACK\\Downloads";
		String downloadDir = downloadPath;
		File dir = new File(downloadDir);
		String Downloadedfile = "";

		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles((dir1, name) -> name.contains("" + filename + ".csv"));
			if (files != null && files.length > 0) {
				// Sort files by last modified timestamp in descending order
				Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
				// Get the first (latest) file
				File latestFile = files[0];
				Downloadedfile = latestFile.getAbsolutePath();
				System.out.println(
						"Downloaded file was present in the downloads folder " + latestFile.getAbsolutePath());
				Extent_pass(driver,
						"Downloaded file was present in the downloads folder " + latestFile.getAbsolutePath(),test,test1);
			} else {
				System.out.println("Downloaded file was not present in the downloads folder ");
				Extent_fail(driver, "Downloaded file was not present in the downloads folder ",test,test1);
				global.add("Downloaded file was not present in the downloads folder ");
				Assert.fail("Downloaded file was not present in the downloads folder ");
			}
		} else {
			System.out.println("Directory does not exist or is not a directory.");
			Extent_fail(driver, "Directory does not exist or is not a directory.",test,test1);
			global.add("Directory does not exist or is not a directory.");
			Assert.fail("Directory does not exist or is not a directory.");
		}

		System.out.println("Latestdownloaded_Zipfile :" + Downloadedfile);
		Extent_pass(driver, "Latestdownloaded_Zipfile :" + Downloadedfile,test,test1);
	}
	public static int countRowsWithColumnNameForCsvFile(String csvFilePath, String columnName) throws IOException {
		// Initialize the BufferedReader to read the CSV file
		BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));

		String line;
		int rowCount = 0;
		int columnIndex = -1; // Initialize columnIndex to -1 (not found)

		// Read the file line by line
		List<String[]> rows = new ArrayList<>();
		while ((line = reader.readLine()) != null) {
			String[] values = line.split(","); // Split by comma assuming CSV format
			rows.add(values); // Add each row to the list
		}

		// Now, iterate over all the rows and check for the column name
		for (String[] values : rows) {
			// If column index is not found, search for it
			if (columnIndex == -1) {
				for (int i = 0; i < values.length; i++) {
					if (values[i].trim().equalsIgnoreCase(columnName)) {
						columnIndex = i; // Set the column index if column name is found
						break;
					}
				}
			} else {
				// If column name was found, check the value in the column
				if (values.length > columnIndex && !values[columnIndex].trim().isEmpty()) {
					rowCount++; // Increment row count if the column has a non-empty value
				}
			}
		}

		// Close the file reader
		reader.close();

		// Return the row count
		return rowCount;
	}

	/*
	 * Used to Clear the particular Element or Text Field
	 */
	public void Newclear(WebDriver driver,String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			Actions actions = new Actions(driver);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.click();
			actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
			wait(driver,"2");
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}
	/*
	 * Used to Tab action in the Web Page
	 */
	public void tab(WebDriver driver) {
		try {
			wait(driver,"3");
			Actions actionObject = new Actions(driver);
			actionObject.sendKeys(Keys.TAB).build().perform();
		} catch (Exception e) {
			verifyServerStatus(driver);
			Assert.fail();
		}
	}

	/*
	 * Used to expand the data set
	 */
	public static List<String> expandRange(String rangeStr) {
		List<String> result = new ArrayList<>();
		String[] parts = rangeStr.split("-");
		int start = Integer.parseInt(parts[0]);
		int end = Integer.parseInt(parts[1]);
		for (int i = start; i <= end; i++) {
			result.add(String.valueOf(i));
		}
		return result;
	}

	/*
	 * Used to expand the data set
	 */
	public static List<String> splitAndExpand(String input) {
		List<String> result = new ArrayList<>();
		String[] parts = input.split(",");
		for (String part : parts) {
			if (part.contains("-")) {
				result.addAll(expandRange(part));
			} else {
				result.add(part);
			}
		}
		return result;
	}
	public static List<String> splitAndExpand(String input,String expression) {
		List<String> result = new ArrayList<>();
		if(input.contains(expression)) {
			String[] parts = input.split(expression);
			for (String part : parts) {
				result.add(part);
			}
		}else {
			result.add(input);
		}
		return result;
	}
	/*
	 * Used to The Check box status is active or not for particular Element
	 */
	public static boolean extractstatus(String text) {
		String pattern = "\\b(active)\\b";
		Pattern compiledPattern = Pattern.compile(pattern);
		Matcher matcher = compiledPattern.matcher(text);
		if (matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	/*
	 * Used to wait for the element for particular time
	 */
	public void waitForDisplay(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		String[] process = splitXpath(Processing_Locator);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(process[1])));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
		} catch (Exception e) {
		}
	}
	/*
	 * Used to split the date from excel data
	 */
	public static void datePicker(String date, StringBuilder dayOut, StringBuilder monthOut, StringBuilder yearOut) {
		if(date.contains("/")) {
			// Split the date string by "/"
			String[] parts = date.split("/");
			// Extract day, month, and year from the array
			int day = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int year = Integer.parseInt(parts[2]);
			// Array of month names
			String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			// Get the month name (adjust index for zero-based array)
			String monthName = monthNames[month - 1];
			// Set the output parameters
			dayOut.setLength(0);
			dayOut.append(day);
			monthOut.setLength(0);
			monthOut.append(monthName);
			yearOut.setLength(0);
			yearOut.append(year);
		}else if(date.contains("-")) {
			// Split the date string by "/"
			String[] parts = date.split("-");
			// Extract day, month, and year from the array
			int day = Integer.parseInt(parts[1]);
			int month = Integer.parseInt(parts[0]);
			int year = Integer.parseInt(parts[2]);
			// Array of month names
			String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			// Get the month name (adjust index for zero-based array)
			String monthName = monthNames[month - 1];
			// Set the output parameters
			dayOut.setLength(0);
			dayOut.append(day);
			monthOut.setLength(0);
			monthOut.append(monthName);
			yearOut.setLength(0);
			yearOut.append(year);
		}
	}
	/*
	 * Used to expand the data By using "," and "/"
	 */
	public static List<String> splitAndExpand1(String input) {
		List<String> result = new ArrayList<>();
		String[] parts = input.split(",");
		for (String part : parts) {
			if (part.contains("/")) {
				result.addAll(expandRange(part));
			} else {
				result.add(part);
			}
		}
		return result;
	}
	/*
	 * Used to click the particular Element using javascript executor
	 */	
	public void click1(WebDriver driver, String path) {
		String[] values = splitXpath(path);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", webElement);
			System.out.println(values[0] + " clicked");
			Extent_pass(driver, "Click on " + values[0], test,test1);
		} catch (Exception e) {
			System.out.println(" Exception " + e);
			Extent_fail(driver, "Unable to click on " + values[0]+"  "+  e.getLocalizedMessage(), test,test1);
			global.add("Unable to click on - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
	}

	/*
	 * Used to clear the existing value in the element and then send(type) the new value in that element
	 */
	public String clearAndType(WebDriver driver, String xpaths, String keysToSend) {
		String[] values = splitXpath(xpaths);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='';", webElement);
			js.executeScript("arguments[0].click();", webElement);
			wait(driver, "1");
			js.executeScript("arguments[0].value=" + "\'" + keysToSend + "\'" + ";", webElement);
			Extent_pass(driver, "Clear and Type on " + values[0]+" -> The Typing Value is : "+keysToSend, test,test1);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to type on " + values[0] + "- " + e.getLocalizedMessage()+"  "+ "The Typing Value is : "+keysToSend, test,test1);
			global.add("Unable to type on - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		return keysToSend;
	}
	public String clearAndType1(WebDriver driver, String xpaths, String keysToSend) {
		String[] values = splitXpath(xpaths); // Assuming splitXpath extracts the element's xpath
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.clear(); // Clear the text field first
			// Send keys to the element
			webElement.sendKeys(keysToSend); // Send keys directly to the input field
			Extent_pass(driver, "Clear and Type on " + values[0] + " The Typing Value is: " + keysToSend, test, test1);
		} catch (Exception e) {
			Extent_fail(driver, "Unable to type on " + values[0] + " - " + e.getLocalizedMessage() + " The Typing Value is: " + keysToSend, test, test1);
			verifyServerStatus(driver);
			Assert.fail();
		}
		return keysToSend;
	}

	/*
	 * Used to perform the doubleClick action on the element in the page by passing the WebElement as argument
	 * proving the WebElement and perform the Double Click action on the element
	 */
	public void doubleClick(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Actions action = new Actions(driver).doubleClick(webElement);
			action.build().perform();
			Extent_pass(driver, "Able to Double click on " + values[0] + "- " , test,test1);
		} catch (Exception e) {
			Extent_fail(driver, "Unable to Double click on " + values[0] + "- " + e.getLocalizedMessage(), test,test1);
			global.add("Unable to Double click on - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
	}

	/*
	 * Used to clear the value on the element by using selenium WebDriver
	 */
	public void clear(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			webElement.clear();
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}

	/*
	 * Used to clear the value on the dropdown by using index value
	 */
	public void selectByIndex(WebDriver driver, String xpaths, String inputData) {
		String[] values = splitXpath(xpaths);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Integer index =Integer.parseInt(inputData);
			Select selectBox = new Select(webElement);
			selectBox.selectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}

	/*
	 * Used to clear the value on the dropdown by using Text value
	 */
	public void selectByText(WebDriver driver, String xpaths, String inputData) {
		String[] values = splitXpath(xpaths);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			Select selectBox = new Select(driver.findElement(By.xpath(values[1])));
			selectBox.selectByVisibleText(inputData);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}

	/*
	 * Used to clear the value on the drop down by using value Attribute
	 */
	public void selectByValue(WebDriver driver, String xpaths, String inputData) {
		String[] values = splitXpath(xpaths);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {

			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Select selectBox = new Select(webElement);
			selectBox.selectByValue(inputData);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());		
		}
	}


	/*
	 * Used to get the text from the particular element in the page using Xpath as input argument
	 */
	public String getText(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			String text = webElement.getText();
			return text;

		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
			return null;
		}
	}
	/*
	 * Used to upload the file
	 */
	public void uploadfile1(WebDriver driver, String path) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = driver.findElement(By.xpath("(//input[@type='file'])[3]"));
			File file = new File(path);
			System.out.println(file.getAbsolutePath());
			element.sendKeys(file.getAbsolutePath());
			Extent_pass(driver, "uploaded the file " + path, test, test);

			wait(driver, "2");
		} catch (Exception e) {
			extent_fail(driver, "upload is falied - " + path + e, test, test);

			e.printStackTrace();
			Assert.fail();
		}
	}
	/*
	 * Used to upload the file
	 */
	public void uploadfile(WebDriver driver,String xpath, String excelpath) {
		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = driver.findElement(By.xpath(values[1]));
			File file = new File(excelpath);
			System.out.println(file.getAbsolutePath());
			element.sendKeys(file.getAbsolutePath());
			Extent_pass(driver,values[0]+ "Scucessfully uploaded the " + excelpath, test, test);

			wait(driver, "2");
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver,values[0]+ "Failed to upload the " + excelpath+ e, test, test);
		}
	}

	/*
	 * Used to gat the table value 
	 */
	public Map<String, List<String>> extractTableDataDirect(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			// Wait until the table is present
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

			// Locate the parent div containing the table data
			WebElement tableContainer = driver.findElement(By.xpath(values[1]));

			// Get all header cells
			List<WebElement> headers = tableContainer.findElements(By.xpath(".//span[@ref='eText' and contains(@class,'cell')]"));

			// Create a map to store column data
			Map<String, List<String>> tableData = new HashMap<>();

			// Initialize map with headers (no reversing of the order)
			for (WebElement header : headers) {
				tableData.put(header.getText(), new ArrayList<>());
			}

			// Get all rows from the container
			List<WebElement> rows = tableContainer.findElements(By.xpath(".//div[@ref='eCenterContainer']//div[@role='row']"));

			// Iterate through the rows
			for (WebElement row : rows) {
				// Get all cells (or items) within each row
				List<WebElement> cells = row.findElements(By.tagName("div"));

				// Ensure that the number of cells matches the number of headers
				if (cells.size() == headers.size()) {
					for (int i = 0; i < cells.size(); i++) {
						// Directly use the header as the key, without reversing
						String columnHeader = headers.get(i).getText();
						tableData.get(columnHeader).add(cells.get(i).getText());
					}
				} else {
					// Log or handle case where row's cells don't match header count
					System.out.println("Row cell count mismatch with header count.");
				}
			}

			return tableData;

		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to get the Table Value from Element - " + values[0] + " " + e.getLocalizedMessage(), test, test);
			return null;
		}
	}

	/*
	 * Used to get the text value for a particular element without failing
	 */
	public String getTextwithoutfail(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			String text = webElement.getText();
			return text;
		} catch (Exception e) {
			return "null";
		}
	}
	/*
	 * Used to wait for the particular time
	 */
	public static void waitTime(WebDriver driver, String waitSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(waitSeconds)));
	}

	/*
	 * Used to scroll the web age top to bottom
	 */
	public void scrollBottom(WebDriver driver) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scroll(0,350)", "");
			waitTime(driver, "5");
			// add(driver, "Scrolled to the bottom ", LogAs.PASSED, true, "Not");
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to scroll "+ e.getLocalizedMessage(), test,test1);
			global.add("Unable to scroll");
			verifyServerStatus(driver);
			Assert.fail("Unable to scroll "+ e.getLocalizedMessage());
		}
	}
	public void moduleNavigate(WebDriver driver,String ModuleName) {
		String Select_Module = String.format(Module_Select, ModuleName);
		waitForElement(driver, Search_Input);
		sendKeys(driver, Search_Input, ModuleName);
		waitForElement(driver, Select_Module);
		click(driver, Select_Module);
	}

	/*
	 * Used to verify the particular element is present or not
	 */
	public boolean verifyElementIsPresent(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			element.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
			return false;
		}
	}
	/*
	 * Used to verify the particular Element is displayed in the page
	 */
	public boolean isDisplayed(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
		}
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			return webElement.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	/*
	 * Used to verify the particular Element is displayed in the page for 3 seconds
	 */
	public boolean isdisplayed(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
		}
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			return webElement.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * Used to close the current tab
	 */
	public void closetab(WebDriver driver) {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_W);
			wait(driver, "2");
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_W);
			wait(driver, "2");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0));
			wait(driver, "5");
		} catch (Exception e) {
		}
	}

	/*
	 * Used to Scroll the particular element
	 */
	public void scrollUsingElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}
	/*
	 * Used to Scroll the particular element
	 */
	public void scrollToElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds)); // 10 seconds wait
		try {
			// Wait for the element to be visible
			wait.until(ExpectedConditions.visibilityOf(element));

			// Attempt to scroll to the element with retries
			for (int i = 0; i < 3; i++) { // Retry up to 3 times
				try {
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
					break; // Break if successful
				} catch (Exception e) {
					System.err.println("Scroll attempt " + (i + 1) + " failed: " + e.getMessage());
					if (i == 2) { // On the last attempt, fail
						verifyServerStatus(driver); // Assuming this method checks the server status
						Assert.fail("Scrolling failed after multiple attempts.");
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Element not visible or other issue: " + e.getMessage());
			verifyServerStatus(driver); // Check server status in case of failure
			Assert.fail("Scrolling failed due to an exception: " + e.getMessage());
		}
	}
	/*
	 * Used to get the table data from application
	 */
	public List<Map<String, String>> getTableDatawithscroll(WebDriver driver, String Header,String Row,String Scroll,int scrollfront,int scrollback) {
		String[] columnheader = splitXpath(Header);
		String[] row = splitXpath(Row);
		List<WebElement> headers = driver.findElements(By.xpath(columnheader[1]));
		List<String> headerTexts = new ArrayList<>();
		for (WebElement header : headers) {
			String headername = header.getDomAttribute("aria-label");
			try {
				if(headername.contains(":")){
					String[] headerName = headername.split(":");
					headerTexts.add(headerName[0]);
				}else {
					headerTexts.add(headername);
				}
			} catch (NullPointerException e) {
				headerTexts.add(null);
				continue;
			}
			horizontalscroll(driver,Scroll,scrollfront);
		}
		horizontalscroll(driver,Scroll,scrollback);
		// Locate the values table
		List<WebElement> rows = driver.findElements(By.xpath(row[1]));
		// List to hold all row data as a list of maps
		List<Map<String, String>> tableData = new ArrayList<>();
		// Iterate through each row (starting from 1 to skip the header row)
		int k=1;
		for (WebElement tableRow : rows) {
			try {
				List<WebElement> cells = tableRow.findElements(By.tagName("td"));
				// Create a map for each row
				Map<String, String> rowData = new HashMap<>();

				for (int j = 0; j < cells.size(); j++) {
					if (j < headerTexts.size()) {
						rowData.put(headerTexts.get(j), cells.get(j).getText());
					}
				}
				// Add the row map to the list
				tableData.add(rowData);
			} catch (Exception e) {
				System.err.println("Error processing row " + k + ": " + e.getMessage());
				e.printStackTrace();
				Extent_fail(driver, "Error processing row " + k + ": " + e.getMessage(), test,test1);
				global.add("Error processing row " + k + ": " + e.getMessage());
				verifyServerStatus(driver);
				Assert.fail("Element is not present "+ e.getLocalizedMessage());
			}
			k++;
		}
		// Fetch values by header
		return tableData;
	}
	/*
	 * Used to get the table format for report
	 */
	public String TableDataForReport(WebDriver driver, List<Map<String, String>> tableData, String tableName, List<String> excelHeaders) {
		// Determine maximum column widths
		int[] columnWidths = new int[excelHeaders.size()];

		// Initialize widths based on header lengths
		for (int i = 0; i < excelHeaders.size(); i++) {
			columnWidths[i] = excelHeaders.get(i).length();
		}

		// Update widths based on data
		for (Map<String, String> row : tableData) {
			for (int i = 0; i < excelHeaders.size(); i++) {
				String value = row.get(excelHeaders.get(i));
				if (value != null) {
					columnWidths[i] = Math.max(columnWidths[i], value.length());
				}
			}
		}

		// StringBuilder for constructing the HTML table
		StringBuilder tableBuilder = new StringBuilder();
		tableBuilder.append("<h3>").append(tableName).append("</h3>");
		tableBuilder.append("<table style='width:100%; border-collapse: collapse;'>");
		tableBuilder.append("<thead><tr>");

		// Add headers to HTML and print to console
		StringBuilder headerRow = new StringBuilder();
		for (String header : excelHeaders) {
			tableBuilder.append("<th style='border: 1px solid #ddd; padding: 8px;'>")
			.append(header)
			.append("</th>");
			headerRow.append(String.format("%-" + (columnWidths[excelHeaders.indexOf(header)] + 2) + "s", header));
		}
		tableBuilder.append("</tr></thead><tbody>");

		// Print header row to console
		System.out.println("-".repeat(Arrays.stream(columnWidths).sum() + 2 * columnWidths.length));
		System.out.println(tableName.toString()+" : ");
		System.out.println("-".repeat(Arrays.stream(columnWidths).sum() + 2 * columnWidths.length));
		System.out.println(headerRow.toString());
		// Print separator to console
		System.out.println("-".repeat(Arrays.stream(columnWidths).sum() + 2 * columnWidths.length));
		// Add rows to HTML and print to console
		for (Map<String, String> row : tableData) {
			tableBuilder.append("<tr>");
			StringBuilder rowOutput = new StringBuilder();
			for (String header : excelHeaders) {
				String value = row.get(header);
				if (value != null) {
					tableBuilder.append("<td style='border: 1px solid #ddd; padding: 8px;'>")
					.append(value)
					.append("</td>");
					rowOutput.append(String.format("%-" + (columnWidths[excelHeaders.indexOf(header)] + 2) + "s", value));
				} else {
					tableBuilder.append("<td style='border: 1px solid #ddd; padding: 8px;'>N/A</td>");
					rowOutput.append(String.format("%-" + (columnWidths[excelHeaders.indexOf(header)] + 2) + "s", "N/A"));
				}
			}
			tableBuilder.append("</tr>");
			System.out.println(rowOutput.toString()); // Print each row to console
		}
		System.out.println("-".repeat(Arrays.stream(columnWidths).sum() + 2 * columnWidths.length));
		tableBuilder.append("</tbody></table>");
		return tableBuilder.toString(); // Return the generated HTML for further use if needed
	}
	/*
	 * Used to get the table data from application
	 */
	public List<Map<String, String>> getTableData(WebDriver driver, String Header,String Row) {
		String[] columnheader = splitXpath(Header);
		String[] row = splitXpath(Row);
		List<WebElement> headers = driver.findElements(By.xpath(columnheader[1]));
		List<String> headerTexts = new ArrayList<>();
		for (WebElement header : headers) {
			String headername = header.getDomAttribute("aria-label");
			try {
				if(headername.contains(":")){
					String[] headerName = headername.split(":");
					headerTexts.add(headerName[0]);
				}else {
					headerTexts.add(headername);
				}
			} catch (NullPointerException e) {
				headerTexts.add(null);
				continue;
			}
		}
		// Locate the values table
		List<WebElement> rows = driver.findElements(By.xpath(row[1]));
		// List to hold all row data as a list of maps
		List<Map<String, String>> tableData = new ArrayList<>();
		// Iterate through each row (starting from 1 to skip the header row)
		int k=1;
		for (WebElement tableRow : rows) {
			try {
				List<WebElement> cells = tableRow.findElements(By.tagName("td"));
				// Create a map for each row
				Map<String, String> rowData = new HashMap<>();

				for (int j = 0; j < cells.size(); j++) {
					if (j < headerTexts.size()) {
						rowData.put(headerTexts.get(j), cells.get(j).getText());
					}
				}
				// Add the row map to the list
				tableData.add(rowData);
			} catch (Exception e) {
				System.err.println("Error processing row " + k + ": " + e.getMessage());
				e.printStackTrace();
				Extent_fail(driver, "Error processing row " + k + ": " + e.getMessage(), test,test1);
				global.add("Error processing row " + k + ": " + e.getMessage());
				verifyServerStatus(driver);
				Assert.fail("Element is not present "+ e.getLocalizedMessage());
			}
			k++;
		}
		// Fetch values by header
		return tableData;
	}
	/*
	 * Used to get the string value from the table
	 */
	public String getFirstValueByHeader(List<Map<String, String>> tableData, String header) {
		for (Map<String, String> row : tableData) {
			// Check if the row contains the specified header
			if (row.containsKey(header)) {
				return row.get(header); // Return the first value found in that column
			}
		}
		return null; // Return null if the header is not found
	}
	public static double getSumOfListValues(WebDriver driver,List<String> values) {
		double sum = 0.0;  // Initialize sum
		for (String value : values) {
			try {
				// Remove commas and trim spaces
				String cleanedValue="";
				if(value.contains(",")) {
					cleanedValue  = value.replace(",", "").trim();
				}else {
					cleanedValue  = value;
				}
				// Convert to double and add to sum
				sum += Double.parseDouble(cleanedValue);
			} catch (NumberFormatException e) {
				System.err.println("Skipping invalid number: " + value);
				Extent_fail(driver, "Skipping invalid number: " + value, test, test);
			}
		}
		return sum;
	}
	/*
	 * Used to get the List of string value from the table
	 */
	public List<String> getValuesByFirstColumnAndHeader(List<Map<String, String>> tableData, String firstColumnHeader, String firstColumnValue, String columnHeader) {
		List<String> matchingValues = new ArrayList<>();

		for (Map<String, String> row : tableData) {
			if (row.containsKey(firstColumnHeader) && row.get(firstColumnHeader).equals(firstColumnValue)) {
				// If there's a match, add the value from the specified column header to the list
				if (row.containsKey(columnHeader)) {
					matchingValues.add(row.get(columnHeader));
				}
			}
		}
		return matchingValues; // Return the list of matching values
	}
	/*
	 * Used to get the string value from the table
	 */
	public List<String> getValuesByColumnHeaders(List<Map<String, String>> tableData, String matchColumnHeader, String matchColumnValue, List<String> columnHeaders) {
		List<String> matchingValues = new ArrayList<>();

		for (Map<String, String> row : tableData) {
			if (row.containsKey(matchColumnHeader) && row.get(matchColumnHeader).equals(matchColumnValue)) {
				// If there's a match, add values from the specified column headers to the list
				for (String columnHeader : columnHeaders) {
					if (row.containsKey(columnHeader)) {
						matchingValues.add(row.get(columnHeader));
					}
				}
			}
		}
		return matchingValues; // Return the list of matching values
	}
	/*
	 *Method to retrieve value by first column value and header
	 */
	public String getValueByFirstColumnAndHeader(List<Map<String, String>> tableData, String FirstColumnHeader,String firstColumnValue, String columnHeader) {
		for (Map<String, String> row : tableData) {
			if (row.containsKey(FirstColumnHeader) && row.get(FirstColumnHeader).equals(firstColumnValue)) { // Adjust "Equipment Id" as needed
				return row.get(columnHeader); // Return the value for the specified column header
			}
		}
		return "Value not found"; // Return message if not found
	}
	/*
	 *Method to fetch values by header
	 */
	public static List<String> getValuesByHeader(List<Map<String, String>> tableData, String header) {
		List<String> values = new ArrayList<>();
		for (Map<String, String> row : tableData) {
			if (row.containsKey(header)) {
				values.add(row.get(header));
			}
		}
		return values;
	}
	/*
	 * Method to fetch values from a specific column while excluding rows with specific values in another column
	 */
	public static List<String> getFilteredValuesByHeader(List<Map<String, String>> tableData,String targetHeader,String conditionHeader,List<String> excludedValues) {
		List<String> values = new ArrayList<>();
		for (Map<String, String> row : tableData) {
			// Exclude rows that contain any value in the excludedValues list
			if (row.containsKey(conditionHeader) && !excludedValues.contains(row.get(conditionHeader))) {
				if (row.containsKey(targetHeader)) {
					values.add(row.get(targetHeader));
				}
			}
		}
		return values;
	}
	/*
	 * Used to verify the column headers values are present or not from the table
	 */
	public static void verifyColumnHeaders(List<Map<String, String>> tableData, List<String> expectedColumns) {
		if (tableData.isEmpty()) {
			System.err.println("Table data is empty. No headers to verify.");
			return;
		}
		// Extract actual header names from the first row of the table data
		List<String> actualHeaders = new ArrayList<>(tableData.get(0).keySet());
		// Verify expected columns
		for (String expectedColumn : expectedColumns) {
			if (!actualHeaders.contains(expectedColumn)) {
				System.err.println("Missing expected column: " + expectedColumn);
				// Optionally, log or throw an exception
			}
		}
	}
	/*
	 * Used to Scroll the page in the horizontal direction
	 */
	public void horizontalscroll(WebDriver driver, String xpath, int input ) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollLeft += "+input+";", element);
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}
	/*
	 * Used to convert the currency value
	 */
	public static String convertToCurrency(List<String> currencyCodes, List<String> amounts,List<String> roeCurrencyCodes, List<String> roeValues, String targetCurrency) {
		// Step 1: Create a map for currency amounts
		Map<String, Double> currencyAmounts = new HashMap<>();
		// Step 2: Populate the currency amounts map
		for (int i = 0; i < currencyCodes.size(); i++) {
			String currency = currencyCodes.get(i);
			double amount = parseAmount(amounts.get(i));
			currencyAmounts.put(currency, currencyAmounts.getOrDefault(currency, 0.0) + amount);
		}
		// Step 3: Create a map for the exchange rates to USD
		Map<String, Double> exchangeRates = new HashMap<>();
		// Step 4: Populate the exchange rates map
		for (int i = 0; i < roeCurrencyCodes.size(); i++) {
			String currency = roeCurrencyCodes.get(i);
			double rate = parseAmount(roeValues.get(i));
			exchangeRates.put(currency, 1.0 / rate);  // Store 1 / ROE for conversion to USD
		}
		// Step 5: Calculate total in USD
		double totalUSD = 0.0;
		for (Map.Entry<String, Double> entry : currencyAmounts.entrySet()) {
			String currency = entry.getKey();
			double totalAmount = entry.getValue();
			double exchangeRate = exchangeRates.getOrDefault(currency, 1.0); // Default to 1.0 for USD
			totalUSD += totalAmount * exchangeRate; // Convert and accumulate
		}
		// Step 6: Get exchange rate for the target currency
		double targetCurrencyExchangeRate = exchangeRates.getOrDefault(targetCurrency, 1.0); // Default to 1.0 if not found
		// Step 7: Convert total USD to the target currency
		double totalTargetCurrency = totalUSD / targetCurrencyExchangeRate;
		return formatToThreeDecimalPlaces(totalTargetCurrency);
	}
	private static String formatToThreeDecimalPlaces(double value) {
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(3, RoundingMode.HALF_UP); // Round to 3 decimal places
		return bd.toString(); // Convert to String
	}
	private static double parseAmount(String amountStr) {
		if (amountStr.contains(",")) {
			amountStr = amountStr.replace(",", "");
		}
		return Double.parseDouble(amountStr);
	}
	/*
	 * Used to Verify the Element is Enabled or not in that page
	 */
	public boolean isElementEnabled(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.isEnabled();
			Extent_pass(driver, "Element ' " + values[0] + " 'is  enabled ",test, test1);
			return webElement.isEnabled();
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * Used to Verify the Element is Selected or not in that page
	 */
	public boolean isElementSelected(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.isSelected();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	/*
	 * Used to Verify the Element is Clickable or not
	 */
	public void isElementClickable(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			waits.until(ExpectedConditions.elementToBeClickable(webElement));
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}

	/*
	 * Used to Verify the Element is Selectable or not
	 */
	public void isElementSelectable(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			waits.until(ExpectedConditions.elementToBeSelected(webElement));
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}

	/*
	 * Used to refresh the web page
	 */
	public static void refreshPage(WebDriver driver) {
		try {
			waitTime(driver, "5");
			driver.navigate().refresh();
			waitTime(driver, "5");
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, e.getLocalizedMessage(), test,test1);
			global.add( e.getLocalizedMessage());
			verifyServerStatus(driver);
			Assert.fail(e.getLocalizedMessage());
		}
	}

	/*
	 * Used to Verify the Element is Clickable or not
	 */
	public void maximize(WebDriver driver) {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, e.getLocalizedMessage(), test,test1);
			global.add( e.getLocalizedMessage());
			verifyServerStatus(driver);
			Assert.fail(e.getLocalizedMessage());
		}
	}

	public List<Map<String, String>> extractTableDataByColumn(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

			// Locate table container and scrollbar
			WebElement tableContainer = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement scrollbar = tableContainer
					.findElement(By.xpath("//div[@class='ag-body-horizontal-scroll-viewport']"));

			// Set to track extracted headers (avoids duplicates)
			Set<String> extractedHeaders = new LinkedHashSet<>();
			List<String> columnHeaders = new ArrayList<>();
			List<Map<String, String>> tableData = new ArrayList<>();

			// Keep scrolling right until no new columns appear
			long lastScroll = -1, currentScroll = 0;
			long maxScroll = ((Number) js.executeScript("return arguments[0].scrollWidth;", scrollbar)).longValue();

			while (lastScroll != currentScroll) {
				lastScroll = currentScroll;

				// Step 1: Extract headers & column values
				List<WebElement> headerElements = tableContainer.findElements(
						By.xpath(".//div[@ref='eLabel']//span[@ref='eText' and contains(@class,'cell')]"));
				List<WebElement> rows = tableContainer.findElements(By.xpath(
						".//div[@ref='eCenterColsClipper']//div[@role='row']|//div[contains(@ref,'eContainer')]//div[@role='row']"));
				for (int i = 0; i < headerElements.size(); i++) {
					WebElement headerElement = headerElements.get(i);
					Actions act = new Actions(driver);
					act.moveToElement(headerElement).build().perform();

					String headerText = headerElement.getText().trim();
					if (!headerText.isEmpty() && !extractedHeaders.contains(headerText)) {
						extractedHeaders.add(headerText);
						columnHeaders.add(headerText);
						// Step 2: Extract all row values for this column
						for (int rowIndex = 0; rowIndex < rows.size(); rowIndex++) {
							if (tableData.size() <= rowIndex) {
								tableData.add(new LinkedHashMap<>());
							}

							WebElement row = rows.get(rowIndex);
							List<WebElement> cells = row.findElements(By.xpath(".//div[contains(@class,'ag-cell')]"));

							if (i < cells.size()) {
								String cellValue = cells.get(i).getText().trim();
								tableData.get(rowIndex).put(headerText, cellValue);
							}
						}
					}
				}

				// Step 3: Scroll right to expose more columns
				js.executeScript("arguments[0].scrollLeft += 200;", scrollbar);
				Thread.sleep(500);

				// Step 4: Check new scroll position
				currentScroll = ((Number) js.executeScript("return arguments[0].scrollLeft;", scrollbar)).longValue();
				if (currentScroll >= maxScroll)
					break; // Stop if reached end
			}

			// Reset Scroll Position
			js.executeScript("arguments[0].scrollLeft = 0;", scrollbar);

			return tableData;

		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver,
					"Unable to get the Table Value from Element - " + values[0] + " " + e.getLocalizedMessage(), test,
					test);
			return Collections.emptyList();
		}
	}
	/*
	 * Used to Perform the Enter Action on that page
	 */
	public void enter(WebDriver driver) {
		try {
			wait(driver,"3");
			Actions actionObject = new Actions(driver);
			actionObject.sendKeys(Keys.ENTER).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, e.getLocalizedMessage(), test,test1);
			global.add( e.getLocalizedMessage());
			verifyServerStatus(driver);
			Assert.fail(e.getLocalizedMessage());
		}
	}

	/*
	 * Used to accept the alert on that web page
	 */
	public String alertAccept(WebDriver driver, String path) {
		String[] values = splitXpath(path);

		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.click();
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			alert.accept();
			return alertText;
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, e.getLocalizedMessage(), test,test1);
			global.add( e.getLocalizedMessage());
			verifyServerStatus(driver);
			Assert.fail(e.getLocalizedMessage());
			return null;
		}
	}

	/*
	 * Used to dismiss the alert on the web page
	 */
	public void dismissAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	/*
	 * Used to switch the driver focus current page to the frame
	 */
	public void switchToFrame(WebDriver driver, String frameName) {
		String[] values = splitXpath(frameName);
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			driver.switchTo().frame(element);

		} catch (NoSuchFrameException e) {

		}
	}

	/*
	 * Used to switch the driver focus frame in to current page 
	 */
	public void switchToDefaultFrame(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, e.getLocalizedMessage(), test,test1);
			global.add( e.getLocalizedMessage());
			verifyServerStatus(driver);
			Assert.fail(e.getLocalizedMessage());
		}
	}

	/*
	 * Used to Perform the KeyDown Action on that page
	 */
	public void keyDown(WebDriver driver) {
		wait(driver,"3");
		Actions actionObject = new Actions(driver);
		actionObject = actionObject.sendKeys(Keys.ARROW_DOWN);
		actionObject.perform();
	}

	/*
	 * Used to Perform the KeyUp Action on that page
	 */
	public void keyUp(WebDriver driver) {
		wait(driver,"3");
		Actions actionObject = new Actions(driver);
		actionObject = actionObject.sendKeys(Keys.ARROW_UP);
		actionObject.perform();
	}

	/*
	 * Used to Perform the PageUp Action on that page
	 */
	public void keyboardPageUp(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_UP).perform();
	}

	/*
	 * Used to Perform the refresh Action on that page
	 */
	public void refreshUsingKeys(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.sendKeys(Keys.F5).perform();
	}

	/*
	 * Used to Perform the PageDown Action on that page
	 */
	public void keyboardPageDown(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).perform();
		waitTime(driver, "5");
	}

	/*
	 * Used to Perform the End Action on that page
	 */
	public void keyboardEnd(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitTime(driver, "5");
	}

	/*
	 * Used to Perform the Home Action on that page
	 */
	public void keyboardHome(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitTime(driver, "5");
	}

	/*
	 * Used to Perform the ArrowUp Action on that page
	 */
	public void keyboardArrowUp(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_UP).perform();
	}

	/*
	 * Used to Perform the ArraowDown Action on that page
	 */
	public void keyboardArrowDown(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).perform();
	}

	/*
	 * Used to Perform the ArrowLeft Action on that page
	 */
	public void keyboardArrowLeft(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_LEFT).perform();
	}

	public void keyboardArrowRight(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_RIGHT).perform();
	}

	/*
	 * Used to Perform the Maximize Action on that page
	 */
	public void pageMaximizeUsingKey(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject = actionObject.sendKeys(Keys.F11);
		actionObject.perform();
	}
	/*
	 * Used to get scroll the web page 
	 */
	public void scrollTop(WebDriver driver) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scroll(0,-1000)", "");
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("lambda-status=failed");
			e.printStackTrace();
			Extent_fail(driver, e.getLocalizedMessage(), test,test1);
			global.add( e.getLocalizedMessage());
			verifyServerStatus(driver);
			Assert.fail(e.getLocalizedMessage());
		}
	}

	/*
	 * Used to verify the element having the text value
	 */
	public void verifyElementText(WebDriver driver, String xpath, String expectedtext) {
		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			String text = driver.findElement(By.xpath(values[1])).getText();
			if (text.equals(expectedtext)) {
				Extent_pass(driver,  "Exepected text is present " + values[0] + " " + text, test, test);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element is not present "+ e.getLocalizedMessage(), test,test1);
			global.add("Element is not present - "+values[0]);
			verifyServerStatus(driver);
			Assert.fail("Element is not present "+ e.getLocalizedMessage());
		}
	}
	/*
	 * Used to get the values for extent report
	 */
	public static void ActionTest(ExtentTest extentTest ,ExtentTest extentTest1) {
		test = extentTest;
		test1 = extentTest1;
	}
	/*
	 * Used to color code value
	 */
	public static String rgbToHex(String rgb) {
		String[] rgbValues = rgb.replace("rgba(", "").replace(")", "").split(", ");
		int red = Integer.parseInt(rgbValues[0]);
		int green = Integer.parseInt(rgbValues[1]);
		int blue = Integer.parseInt(rgbValues[2]);
		return String.format("#%02X%02X%02X", red, green, blue);
	}

	/*
	 * Used to get the background colour of the text
	 */
	public String getTextBackgroundColor(WebDriver driver, String Xpath) {
		String[] values = splitXpath(Xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement eleSearch = driver.findElement(By.xpath(values[1]));
			String rgbFormat = eleSearch.getCssValue("background-color");
			String hexcolor = rgbToHex(rgbFormat);
			Extent_pass(driver, "Get the Text Background Color of " + values[0], test,test1);
			return hexcolor;
		} catch (Exception e) {
			Extent_fail(driver, "Unable to Get the Text Background Color of " + values[0], test,test1);
			e.printStackTrace();
			global.add("Unable to Get the Text Background Color of " + values[0]);
			verifyServerStatus(driver);
			Assert.fail("Unable to Get the Text Background Color of " + values[0]);
			return "";
		}
	}

	/*
	 * Used to get the attribute value of the element for the particular element
	 */
	public String getAttribute(WebDriver driver, String xpath, String attribute) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			WebElement inputBox = driver.findElement(By.xpath(values[1]));
			String textInsideInputBox = inputBox.getDomAttribute(attribute);
			Extent_pass(driver, "Get the Attribute value of " + values[0], test,test1);
			return textInsideInputBox;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to Get the Attribute value of " + values[0], test,test1);
			global.add("Unable to Get the Attribute value of " + values[0]);
			Assert.fail("Unable to Get the Attribute value of " + values[0]);
			return null;

		}
	}
	/*
	 * Used to verify the table the given column headers are present 
	 */
	public static void verifyColumnHeadersIsPresent(WebDriver driver,List<Map<String, String>> tableData, List<String> expectedColumns) {
		if (tableData.isEmpty()) {
			System.err.println("Table data is empty. No headers to verify.");
			return;
		}
		// Extract actual header names from the first row of the table data
		List<String> actualHeaders = new ArrayList<>(tableData.get(0).keySet());
		List<String> columns_Present = new ArrayList<String>();
		// Verify expected columns
		for (String expectedColumn : expectedColumns) {
			if (actualHeaders.contains(expectedColumn)) {

				System.out.println("Column present in the table is-> " + expectedColumn);
				Extent_pass(driver, "Matched || Expected columns are present", test, test);
			}else if(!actualHeaders.contains(expectedColumn)){
				columns_Present.add(expectedColumn);
				System.out.println("column not present in the table-> " + expectedColumn);
				Extent_fail(driver, "Not Matched|| Expected column names are not present", test, test);
			}
		}
	}
	/*
	 * Used to get the web element list
	 */
	public List<WebElement> listOfElements(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		List<WebElement> elements =new ArrayList<WebElement>();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			elements = driver.findElements(By.xpath(values[1]));
		} catch (Exception e) {
			Extent_fail(driver,  values[0]+" List of WebElement is not present "+ e.getLocalizedMessage(), test,test1);
			global.add(values[0]+" List of WebElement is not present "+ e.getLocalizedMessage());
			verifyServerStatus(driver);
			Assert.fail();
		}
		return elements;
	}
	/*
	 * Used to verify the table the given column headers are not present 
	 */
	public static void verifyColumnHeadersNotPresent(WebDriver driver,List<Map<String, String>> tableData, List<String> expectedColumns) {
		if (tableData.isEmpty()) {
			System.err.println("Table data is empty. No headers to verify.");
			return;
		}
		// Extract actual header names from the first row of the table data
		List<String> actualHeaders = new ArrayList<>(tableData.get(0).keySet());
		List<String> columns_Present = new ArrayList<String>();
		// Verify expected columns
		for (String expectedColumn : expectedColumns) {
			if (actualHeaders.contains(expectedColumn)) {
				columns_Present.add(expectedColumn);
				System.out.println("column present are: " + expectedColumn);
				Extent_fail(driver, "Not Matched|| Expected column names are present ->"+expectedColumn, test, test);
				// Optionally, log or throw an exception
			}else if(!actualHeaders.contains(expectedColumn)){
				System.out.println("Missing expected column: " + expectedColumn);
				Extent_pass(driver, "Matched || Expected columns not present", test, test);
			}
		}
	}

	/*
	 * used to verify the element is not editable
	 */
	public boolean elementNotEditable(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath); // Assuming you have a method to split the XPath
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			// Check if the element is enabled
			if (webElement.isEnabled()) {
				// Check the aria-readonly and aria-disabled attributes
				String ariaReadOnly = webElement.getDomAttribute("aria-readonly");
				String ariaDisabled = webElement.getDomAttribute("aria-disabled");

				// The field is considered not editable if it is read-only or disabled
				return "true".equals(ariaReadOnly) || "true".equals(ariaDisabled);
			}
			return false; // Not enabled
		} catch (Exception e) {
			return false;
		}
	}
	/*
	 * Used to verify the element is accessible or not
	 */
	public boolean isElementAccessible(WebDriver driver,String Xpath) {
		String[] values=splitXpath(Xpath);
		try {
			WebElement Autscroll=driver.findElement(By.xpath(values[1]));
			boolean isAccessible = Autscroll.isEnabled();

			if (isAccessible) {
				return true;
			} else {
				return false;
			}
		}catch(Exception e) {
			return false;

		}	     	 
	}


	/*
	 * Used to move the mouse hover to the particular element
	 */
	public void mouseOverToElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebElement webElement = driver.findElement(By.xpath(values[1]));
		try {
			Actions builder = new Actions(driver);
			builder.moveToElement(webElement).build().perform();
		} catch (Exception e) {

		}
	}
	/*
	 * Used to move the mouse hover to the particular element
	 */
	public void moveToElement(WebDriver driver, WebElement element) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: "  + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " );
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element:  " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - ");
			verifyServerStatus(driver);
			Assert.fail();
		}
		//		WebElement webElement = driver.findElement(By.xpath(values[1]));
		try {
			Actions builder = new Actions(driver);
			builder.moveToElement(element).build().perform();
			wait(driver,"1");
		} catch (Exception e) {

		}
	}


	/*
	 * Used to verify the element is clickable or not for the particular element
	 */
	public boolean isClickable(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
			return webElement.isEnabled();
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * Used to calculate the time for the particular element
	 */
	public String calculatedtime(String value1, int value2) {

		// Input date and time string
		String inputDateTimeString = value1;

		// Define the input date time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// Parse the input string into LocalDateTime
		LocalDateTime dateTime = LocalDateTime.parse(inputDateTimeString, formatter);

		// Add 1 hour
		LocalDateTime newDateTime = dateTime.plusHours(value2);

		// Format the result back to desired format
		String outputDateTimeString = newDateTime.format(formatter);

		// Print the result
		System.out.println("Original Date Time: " + inputDateTimeString);
		System.out.println("New Date Time (+1 hour): " + outputDateTimeString);

		return outputDateTimeString;

	}

	public String Convertedtime(String value1, int value2, int value3) {

		String inputDateTimeString = value1;

		// Define the input date time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// Parse the input string into LocalDateTime
		LocalDateTime dateTime = LocalDateTime.parse(inputDateTimeString, formatter);

		// Add 1 hour
		LocalDateTime newDateTime = dateTime.plusHours(value2).plusMinutes(value3);

		// Format the result back to desired format
		String outputDateTimeString = newDateTime.format(formatter);

		// Print the result
		System.out.println("Original Date Time: " + inputDateTimeString);
		System.out.println("New Date Time (+1 hour): " + outputDateTimeString);

		return outputDateTimeString;
	}

	public  double time(double doubleValue, double doubleValue1) { 
		return doubleValue / doubleValue1;  
	}
	/*
	 * Used to download and save the file
	 */
	public String Downloadedfile(WebDriver driver,String filename) {
		wait(driver,"3");
		String os = System.getProperty("os.name").toLowerCase();
		String downloadPath = "";
		if (os.contains("win")) {
			downloadPath = Paths.get(System.getProperty("user.home"), "Downloads").toString();
		} else {
			downloadPath = System.getProperty("user.home");
		}
		String downloadDir = downloadPath;
		File dir = new File(downloadDir);
		String Downloadedfile = "";

		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles((dir1, name) -> name.contains("" + filename + ".csv"));
			if (files != null && files.length > 0) {
				// Sort files by last modified timestamp in descending order
				Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
				// Get the first (latest) file
				File latestFile = files[0];
				Downloadedfile = latestFile.getAbsolutePath();
				System.out.println(
						"Downloaded file was present in the downloads folder " + latestFile.getAbsolutePath());
				Extent_pass(driver,
						"Downloaded file was present in the downloads folder " + latestFile.getAbsolutePath(),test,test1);
			} else {
				System.out.println("Downloaded file was not present in the downloads folder ");
				Extent_fail(driver, "Downloaded file was present Not in the downloads folder ",test,test1);
			}
		} else {
			System.out.println("Directory does not exist or is not a directory.");
			Extent_fail(driver, "Directory does not exist or is not a directory.",test,test1);
		}

		System.out.println("Latestdownloaded_Zipfile :" + Downloadedfile);
		Extent_pass(driver, "Latestdownloaded_Zipfile :" + Downloadedfile,test,test1);
		return Downloadedfile;
	}
	public static String startdate(String dateString) {

		// Format the new date to the same format as the input date
		String startOfYearString = "";
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			// Parse the input string to a Date object
			Date date = dateFormat.parse(dateString);

			// Get the Calendar instance and set the parsed date
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			// Set the calendar to the first day of the year
			calendar.set(Calendar.MONTH, Calendar.JANUARY);
			calendar.set(Calendar.DAY_OF_MONTH, 1);

			// Get the new date
			Date startOfYear = calendar.getTime();

			startOfYearString = dateFormat.format(startOfYear);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return startOfYearString;

	}
	public List<Map<String, String>> extractCompleteTableData2(WebDriver driver, String xpath) {
	    String[] values = splitXpath(xpath);
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

	        WebElement tableContainer = driver.findElement(By.xpath(values[1]));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement scrollbar = tableContainer.findElement(By.xpath(".//div[@class='ag-body-horizontal-scroll']//div[@ref='eViewport']"));

	        // Step 1: Extract Headers Before Scrolling
	        Map<Integer, String> columnIndexToHeader = new LinkedHashMap<>();
	        extractHeaders(tableContainer, columnIndexToHeader);

	        // Step 2: Scroll Right Gradually & Extract Headers
	        long lastScroll = -1, currentScroll = 0;
	        long maxScroll = ((Number) js.executeScript("return arguments[0].scrollWidth;", scrollbar)).longValue();

	        while (lastScroll != currentScroll) {
	        	Thread.sleep(1000);
	        	tableContainer = driver.findElement(By.xpath(values[1]));
	            lastScroll = currentScroll;
	            js.executeScript("arguments[0].scrollLeft += 200;", scrollbar);
	            Thread.sleep(1000);
	            extractHeaders(tableContainer, columnIndexToHeader);  
	            currentScroll = ((Number) js.executeScript("return arguments[0].scrollLeft;", scrollbar)).longValue();
	            if (currentScroll >= maxScroll) break;
	        }

	        // Critical Fix: Force Last Header Extraction After Full Scroll
	        js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;", scrollbar);
	        Thread.sleep(1000);
	        tableContainer = driver.findElement(By.xpath(values[1]));
	        extractHeaders(tableContainer, columnIndexToHeader); // Final Extraction

	        // Step 3: Scroll Back to Start
	        js.executeScript("arguments[0].scrollLeft = 0;", scrollbar);

	        // Step 4: Extract Row Data
	        List<Map<String, String>> tableData = new ArrayList<>();
	        List<WebElement> rows = tableContainer.findElements(By.xpath(".//div[@ref='eCenterContainer']//div[@role='row']"));

	        for (WebElement row : rows) {
	            Map<String, String> rowData = new LinkedHashMap<>();

	            // Extract Cells Before Scrolling
	            extractCells(row, rowData, columnIndexToHeader);

	            // Scroll Right Gradually & Extract Cells
	            lastScroll = -1;
	            currentScroll = 0;
	            while (lastScroll != currentScroll) {
	                lastScroll = currentScroll;
	                js.executeScript("arguments[0].scrollLeft += 200;", scrollbar);
	                Thread.sleep(300);
	                extractCells(row, rowData, columnIndexToHeader);
	                currentScroll = ((Number) js.executeScript("return arguments[0].scrollLeft;", scrollbar)).longValue();
	                if (currentScroll >= maxScroll) break;
	            }

	            // Reset Scroll Position
	            js.executeScript("arguments[0].scrollLeft = 0;", scrollbar);

	            if (!rowData.isEmpty()) {
	                tableData.add(rowData);
	            }
	        }

	        return tableData;
	    } catch (Exception e) {
	        e.printStackTrace();
	        Extent_fail(driver, "Unable to get the Table Value from Element - " + values[0] + " " + e.getLocalizedMessage(), test, test);
	        return Collections.emptyList();
	    }
	}
	public static List<String> getTableHeaderCellList(List<Map<String, String>> tableData, String Header) {
		// Iterate through each row in the table data
		List<String> expectedList = new ArrayList<String>();
		for (Map<String, String> row : tableData) {
			// Check if the row contains the given "Container NO"
			if (row.containsKey(Header)) {
				// Return the value under the specified header if present
				String cellValue = row.getOrDefault(Header, "");
				expectedList.add(cellValue);
			}
		}
		return expectedList;
	}
	public static List<Map<String, String>> getAllExcelData(String filePath, String sheetName) {
		List<Map<String, String>> dataList = new ArrayList<>();
		Fillo fillo = new Fillo();
		Connection connection = null;
		Recordset recordset = null;

		try {
			connection = fillo.getConnection(filePath);
			System.out.println("sheetName : "+sheetName);
			String query = "SELECT * FROM " + sheetName;
			recordset = connection.executeQuery(query);

			List<String> columnNames = recordset.getFieldNames();

			while (recordset.next()) {
				Map<String, String> rowData = new HashMap<>();

				for (String column : columnNames) {
					rowData.put(column, recordset.getField(column));
				}

				dataList.add(rowData);
			}
		} catch (FilloException e) {
			//e.printStackTrace();
		} finally {
			if (recordset != null) {
				recordset.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		return dataList;
	}
	public static boolean compareListOfMaps(List<Map<String, String>> expected, List<Map<String, String>> actual) {
        if (expected == null || actual == null || expected.size() > actual.size()) {
            return false; // Ensure expected size is not greater than actual
        }

        List<Map<String, String>> unmatchedActual = new ArrayList<>(actual); // Copy to track unmatched elements

        for (Map<String, String> expMap : expected) {
            boolean matchFound = false;

            Iterator<Map<String, String>> iterator = unmatchedActual.iterator();
            while (iterator.hasNext()) {
                Map<String, String> actMap = iterator.next();
                if (CompareMapValues(expMap, actMap)) {
                    matchFound = true;
                    iterator.remove(); // Remove matched actual map to avoid duplicate matches
                    break;
                }
            }

            if (!matchFound) {
                return false; // If any expected map is not found, return false
            }
        }
        return true;
    }
	public void selectDatePickerWith_Time(WebDriver driver, String Locator, String DateValue) {
		StringBuilder day = new StringBuilder();
		StringBuilder month = new StringBuilder();
		StringBuilder year = new StringBuilder();
		StringBuilder time = new StringBuilder();

		waitForElement(driver,Locator);
		click(driver,Locator);
		datePickerWithTime(DateValue, day, month, year,time);
		waitForElement(driver, Year_DD);
		selectByText(driver, Year_DD,year.toString());
		waitForElement(driver, Month_DD);
		selectByText(driver, Month_DD, month.toString());

		waitForElement(driver, timeInput);
		clearAndType(driver, timeInput, time.toString());
		waitForElement(driver, timeInput);
		click(driver,timeInput);

		String date_Select=String.format(date_select,day);
		waitForElement(driver, date_Select);
		click(driver, date_Select);
	}
	public void selectDatePickerWithTime(WebDriver driver, String Locator, String DateValue) {
		StringBuilder day = new StringBuilder();
		StringBuilder month = new StringBuilder();
		StringBuilder year = new StringBuilder();
		StringBuilder time = new StringBuilder();
		
		waitForElement(driver,Locator);
		click(driver,Locator);
		datePickerWithTime(DateValue, day, month, year,time);
		waitForElement(driver, Year_DD);
		selectByText(driver, Year_DD,year.toString());
		waitForElement(driver, Month_DD);
		selectByText(driver, Month_DD, month.toString());
		waitForElement(driver, timeInput);
		click(driver,timeInput);
		waitForElement(driver, timeInput);
		doubleClick(driver, timeInput);
		clearAndType(driver, timeInput, time.toString());
		String date_Select=String.format(LoadConfirmation_Locators.date_select,day);
		waitForElement(driver, date_Select);
		click(driver, date_Select);
		
			}
	/*
	 * Used to expand the data set
	 */
	public static String formatValues(String input) {
        // Split the input by commas
        String[] values = input.split(",");

        // StringBuilder to build the output
        StringBuilder formattedOutput = new StringBuilder();

        // Loop through the values array, and add values in pairs (2 values per line)
        for (int i = 0; i < values.length; i += 2) {
            // Add the first value and the second value with a tab separator
            formattedOutput.append(values[i]).append("\t").append(values[i + 1]);

            // If it's not the last pair, add a newline
            if (i + 2 < values.length) {
                formattedOutput.append("\n");
            }
        }

        // Return the formatted string
        return formattedOutput.toString();
    }
	public void uploadfileNew(WebDriver driver,String Xpath,String path) {
		String[] values = splitXpath(Xpath);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = driver.findElement(By.xpath(values[1]));
			File file = new File(path);
			System.out.println(file.getAbsolutePath());
			element.sendKeys(file.getAbsolutePath());
			Extent_pass(driver, "uploaded the file " + path, test, test);
			wait(driver, "2");
		} catch (Exception e) {
			Extent_fail(driver, "upload is falied - " + path + e, test, test);
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void selectDatePickerWithTime1(WebDriver driver, String Locator, String DateValue) {
		StringBuilder day = new StringBuilder();
		StringBuilder month = new StringBuilder();
		StringBuilder year = new StringBuilder();
		StringBuilder hour= new StringBuilder();
		StringBuilder minute= new StringBuilder();
		waitForElement(driver, Locator);
		click(driver, Locator);
		datePickerWithTime(DateValue, day, month, year, hour, minute);
		waitForElement(driver,Month_DD);
		selectByText(driver, Month_DD,month.toString());
		waitForElement(driver, Year_DD);
		selectByText(driver, Year_DD,year.toString());
		String select_Date =String.format(date_select, day);
		waitForElement(driver, select_Date);
		click(driver, select_Date);
		selectByValue(driver, hour_DD, hour.toString());
		selectByValue(driver, minute_DD, minute.toString());
	}
	public static String Enddate(String dateString) {

		String endOfYearString = "";
		try {
			// Define the date format used in the input
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			// Parse the input string to a Date object
			Date date = dateFormat.parse(dateString);

			// Get the Calendar instance and set the parsed date
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			// Set the calendar to December 31st of the same year
			calendar.set(Calendar.MONTH, Calendar.DECEMBER);
			calendar.set(Calendar.DAY_OF_MONTH, 31);

			// Get the new date (December 31st)
			Date endOfYear = calendar.getTime();

			// Format the new date to the same format as the input date
			endOfYearString = dateFormat.format(endOfYear);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return endOfYearString;

	}
	public static void sendKeysUsingActions(WebDriver driver, String Xpath, String text) {
		String[] values = splitXpath(Xpath);

		Actions actions = new Actions(driver);
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			element.click(); // Focus on input field

			for (char c : text.toCharArray()) {
				boolean isUpperCase = Character.isUpperCase(c);

				if (isUpperCase) {
					actions.keyDown(Keys.SHIFT).build().perform(); // Hold Shift
				}

				actions.keyDown(String.valueOf(c)).build().perform(); // Press Key
				actions.keyUp(String.valueOf(c)).build().perform(); // Release Key

				if (isUpperCase) {
					actions.keyUp(Keys.SHIFT).build().perform(); // Release Shift
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to Send Keys on " + values[0] + " -> The Typing Value is : " + text, test,
					test1);
		}
	}
	public static boolean CompareMapValues(Map<String, String> exp, Map<String, String> act) {
		// Check if both maps are null or have different sizes
		if (exp == null || act == null || exp.size() != act.size()) {
			return false;
		}

		// Iterate through each entry in the expected map
		for (Map.Entry<String, String> entry : exp.entrySet()) {
			String key = entry.getKey();
			String expectedValue = entry.getValue();

			// Check if the key exists in the actual map
			if (!act.containsKey(key)) {
				return false;
			}

			// Check if values are equal
			String actualValue = act.get(key);
			if (!expectedValue.equals(actualValue)) {
				return false;
			}
		}
		// If all key-value pairs match, return true
		return true;
	}
	public List<Map<String, String>> extractTableDataByRowIndex(WebDriver driver, String xpath, int row_count) {
		String[] values = splitXpath(xpath);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

			// Locate table container
			WebElement tableContainer = driver.findElement(By.xpath(values[1]));

			// Set to track extracted headers (avoids duplicates)
			Set<String> extractedHeaders = new LinkedHashSet<>();
			List<String> columnHeaders = new ArrayList<>();
			List<Map<String, String>> tableData = new ArrayList<>();

			// Step 1: Extract headers & column values
			List<WebElement> headerElements = tableContainer
					.findElements(By.xpath(".//div[contains(@class,'ag-header-row')]//span[@ref='eText']"));
			//	        List<WebElement> rows = tableContainer.findElements(By.xpath(".//div[@ref='eContainer']//div[@role='row']"));

			// Extract column headers
			for (WebElement headerElement : headerElements) {
				String headerText = headerElement.getText().trim();
				if (!headerText.isEmpty() && !extractedHeaders.contains(headerText)) {
					extractedHeaders.add(headerText);
					columnHeaders.add(headerText);
				}
			}

			// Step 2: Extract values row by row
			for (int rowIndex = 0; rowIndex < row_count; rowIndex++) {
				WebElement row = tableContainer.findElement(
						By.xpath(".//div[@ref='eContainer']//div[@role='row' and @row-index='" + rowIndex + "']"));
				moveToElement(driver, row);
				List<WebElement> cells = row.findElements(By.xpath(".//div[contains(@class,'ag-cell-value')]"));

				// Create a new map to hold the row data
				Map<String, String> rowData = new LinkedHashMap<>();

				for (int columnIndex = 0; columnIndex < columnHeaders.size(); columnIndex++) {
					// Ensure the cell exists for the column
					if (columnIndex < cells.size()) {
						String cellValue = cells.get(columnIndex).getText().trim();
						rowData.put(columnHeaders.get(columnIndex), cellValue);
					}
				}

				// Add the row data to the table data list
				tableData.add(rowData);
			}

			return tableData;

		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver,
					"Unable to get the Table Value from Element - " + values[0] + " " + e.getLocalizedMessage(), test,
					test1);
			return Collections.emptyList();
		}
	}
	public List<String> getColumnValues(List<Map<String, String>> tableData, String targetColumnHeader) {
		List<String> columnValues = new ArrayList<>();

		for (Map<String, String> row : tableData) {
			String columnValue = row.get(targetColumnHeader); // Get value for the target column
			columnValues.add(columnValue != null ? columnValue : ""); // Avoid null values
		}
		return columnValues; // Return the list of values
	}

	public boolean compareTableData(List<List<String>> table1, List<List<String>> table2) {
		// Ensure both tables have the same number of rows
		if (table1.size() != table2.size()) {
			System.out.println("Mismatch in the number of rows.");
			return false;
		}

		// Iterate through each row and compare the values
		for (int i = 0; i < table1.size(); i++) {
			List<String> row1 = table1.get(i);
			List<String> row2 = table2.get(i);

			// Ensure both rows have the same number of columns
			if (row1.size() != row2.size()) {
				System.out.println("Mismatch in the number of columns at row " + (i + 1));
				return false;
			}

			// Compare each value in the row
			for (int j = 0; j < row1.size(); j++) {
				String value1 = row1.get(j).replace(",", "").trim(); // Remove commas and trim
				String value2 = row2.get(j).replace(",", "").trim(); // Remove commas and trim

				if (!Objects.equals(value1, value2)) {
					System.out.println("Mismatch at row " + (i + 1) + ", column " + (j + 1));
					System.out.println("Table1: " + value1 + " | Table2: " + value2);
					return false;
				}
			}
		}

		// If all rows and columns match
		return true;
	}
	/*
	 * Used to Check Element displayed
	 */

	public boolean IsElementSelected(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			return webElement.isSelected();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	public static String getCurrentDateNew() {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return currentDate.format(formatter);
	}
	public void addToMap(Map<String, List<String>> map, String key, String value) {
		map.putIfAbsent(key, new ArrayList<>()); // Ensure the key exists
		map.get(key).add(value); // Add value to the list
	}

	public List<String> getValuesByFirstAndSecondColumn(List<Map<String, String>> tableData, String firstColumnHeader,
			String firstColumnValue, String secondColumnHeader, String secondColumnValue, String targetColumnHeader) {
		List<String> result = new ArrayList<>();

		for (Map<String, String> row : tableData) {
			if (row.containsKey(firstColumnHeader) && row.containsKey(secondColumnHeader)
					&& row.get(firstColumnHeader).equals(firstColumnValue)
					&& row.get(secondColumnHeader).equals(secondColumnValue)) {

				result.add(row.getOrDefault(targetColumnHeader, "Value not found")); // Collect values
			}
		}

		return result.isEmpty() ? List.of("Value not found") : result; // Return collected values
	}
	public static String[] splitAmount(String path, String splitBy) {
		String[] a = path.split(splitBy);
		return a;
	}
	public Map<String, String> getValuesByHeaderMap(List<Map<String, String>> tableData, String firstColumnHeader,
			String SecondColumnHeader) {
		Map<String, String> valuesMap = new HashMap<String, String>();

		for (Map<String, String> row : tableData) {
			if (row.containsKey(firstColumnHeader)) {
				String firstCellvaue = row.get(firstColumnHeader);
				if (row.containsKey(SecondColumnHeader)) {
					String SecondCellvaue = row.get(SecondColumnHeader);
					valuesMap.put(firstCellvaue, SecondCellvaue);
				}
			}
		}
		return valuesMap;
	}

	public static boolean containsAllMaps(Map<String, String> expected, Map<String, String> actual) {
		if (expected == null || actual == null) {
			return false; // If either map is null, return false
		}

		for (Map.Entry<String, String> entry : expected.entrySet()) {
			String expKey = entry.getKey();
			String expValue = entry.getValue();

			// Check if the key exists in actual map
			if (!actual.containsKey(expKey)) {
				return false;
			}

			String actValue = actual.get(expKey);

			// Validate values with numeric handling
			if (!areEqual(expValue, actValue)) {
				return false;
			}
		}
		return true;
	}
	/*
	 * Used to wait untill element not visible
	 */

	public boolean VerifyElementDisplayed(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
		}
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			if (webElement.isDisplayed()) {
				System.out.println(values[0] + "  Displayed");
				Extent_pass(driver, values[0] + "  Displayed", test, test1);
				return true;
			} else {
				System.out.println(values[0] + "  not Displayed");
				Extent_fail(driver, values[0] + "  not Displayed", test, test1);
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}
	public static boolean isNewFileDownloaded(Set<String> oldFiles, String baseFilename) {

		Set<String> newFiles = getDirectoryFiles();
		newFiles.removeAll(oldFiles); // Get only new files

		for (String file : newFiles) {
			if (file.contains(baseFilename)) {
				System.out.println("Found new downloaded file: " + file);
				return true;
			}
		}
		System.out.println("No new matching file found for base filename: " + baseFilename);
		return false;
	}
	public String Verify_FileDownloaded1(WebDriver driver, String baseFilename, String Xpath) {
		String value[] = splitXpath(Xpath);
		String downloads = downloadspath();
		String pathOfTheFile = null;
		File dir = new File(downloads);
		Set<String> files = new HashSet<>();
		if (dir.isDirectory()) {
			files.addAll(Arrays.asList(dir.list()));
		}

		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

			// Wait for the element to be present and clickable
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value[1])));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath((value[1]))));

			WebElement element = driver.findElement(By.xpath(value[1]));
			element.click();

			Extent_pass(driver, "Click on the element " + baseFilename, test1, test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Extent_fail(driver, "Click on the element " + baseFilename, test1, test);
		}
		wait(driver, "10");

		Set<String> newFiles = getDirectoryFiles();
		newFiles.removeAll(files); // Get only new files

		boolean flag = false;

		for (String file : newFiles) {
			pathOfTheFile = downloads + "/" + file;
		}
		for (String file : newFiles) {

			if (file.contains(baseFilename)) {
				System.out.println("New file was downloaded in the download firectoy with the name of : " + file);
				Extent_pass(driver, "New file was downloaded in the download firectoy with the name of : " + file,
						test1, test);
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println(
					"New file was not  downloaded in the download firectoy with the name of : " + baseFilename);
			Extent_fail(driver,
					"New file was not downloaded in the download firectoy with the name of : " + baseFilename, test1,
					test);
		}
		return pathOfTheFile;
	}

	public List<List<String>> allColumnData(String filepath) {
		List<List<String>> columnDataList = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream(filepath); Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheetAt(0); // Reading the first sheet
			int headerRowIndex = 1;
			Row headerRow = sheet.getRow(headerRowIndex);

			if (headerRow == null) {
				System.out.println("Header row is empty!");
				return columnDataList; // Return empty list instead of null
			}

			int columnCount = headerRow.getLastCellNum();

			// Initialize lists for each column
			for (int col = 0; col < columnCount; col++) {
				columnDataList.add(new ArrayList<>());
			}

			// Read column values (starting from row index 2)
			for (int rowIndex = headerRowIndex + 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
				Row row = sheet.getRow(rowIndex);
				if (row == null) continue;

				for (int col = 0; col < columnCount; col++) {
					Cell cell = row.getCell(col);
					String cellValue = (cell != null) ? getCellValueAsString1(cell) : "";
					columnDataList.get(col).add(cellValue);
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading Excel file: " + e.getMessage());
		}

		return columnDataList;
	}
	private String getCellValueAsString1(Cell cell) {
		switch (cell.getCellTypeEnum()) {
		case STRING:
			return cell.getStringCellValue().trim();
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				return cell.getDateCellValue().toString();
			}
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case FORMULA:
			return cell.getCellFormula();
		case BLANK:
			return "";
		default:
			return "";
		}
	}
	public static List<String> readColumnDataFromCSV(String filePath, String columnName)
			throws IOException, CsvException {
		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			List<String[]> rows = reader.readAll(); // Read entire CSV

			if (rows.size() < 2) {
				throw new IllegalArgumentException("CSV must have at least two rows.");
			}

			// Treat row 2 (index 1) as the header
			String[] headerRow = rows.get(1);
			int columnIndex = Arrays.asList(headerRow).indexOf(columnName);

			if (columnIndex == -1) {
				throw new IllegalArgumentException("Column '" + columnName + "' not found in row 2.");
			}

			// Extract data starting from row 3 (index 2)
			List<String> columnData = new java.util.ArrayList<>();
			for (int i = 2; i < rows.size(); i++) {
				if (rows.get(i).length > columnIndex) {
					columnData.add(rows.get(i)[columnIndex]);
				}
			}

			return columnData;
		}
	}
	public static List<String> readColumnDataFromExcel1(String excelFilePath, String columnName, String sheetName)
			throws IOException, EncryptedDocumentException, InvalidFormatException {
		List<String> dataList = new ArrayList<>();

		try (FileInputStream file = new FileInputStream(new File(excelFilePath));
				Workbook workbook = WorkbookFactory.create(file)) { // Auto-detects .xls or .xlsx

			Sheet sheet = workbook.getSheet(sheetName);
			if (sheet == null) {
				throw new IllegalArgumentException("Sheet '" + sheetName + "' not found.");
			}

			// Get the column index based on row 2 (index 1)
			int columnIndex = getColumnIndexByName3(sheet, columnName);
			if (columnIndex == -1) {
				throw new IllegalArgumentException("Column '" + columnName + "' not found in row 2.");
			}

			// Iterate from row 3 (index 2) to get column data
			for (int i = 4; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				if (row != null) {
					Cell cell = row.getCell(columnIndex);
					if (cell != null) {
						dataList.add(getCellValueAsString2(cell)); // Use helper method
					}
				}
			}
		} catch (OLE2NotOfficeXmlFileException e) {
			System.err.println(
					"Error: The file appears to be an OLE2 (Excel 97-2003) format. Ensure it is a valid Excel file.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return dataList;
	}
	public static int getColumnIndexByName3(Sheet sheet, String columnName) {
		Row headerRow = sheet.getRow(3); // Row 2 in Excel -> Index 1 in POI
		if (headerRow == null)
			return -1;

		for (Cell cell : headerRow) {
			if (cell.getCellTypeEnum() == CellType.STRING
					&& cell.getStringCellValue().trim().equalsIgnoreCase(columnName)) {
				return cell.getColumnIndex();
			}
		}
		return -1; // Return -1 if column not found
	}

	public static String getCellValueAsString2(Cell cell) {
		switch (cell.getCellTypeEnum()) {
		case STRING:
			return cell.getStringCellValue().trim();
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue()); // Convert numeric to string
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case FORMULA:
			return cell.getCellFormula();
		case BLANK:
			return "";
		default:
			return "";
		}
	}
	public static boolean compareMaps(Map<String, String> singleValueMap, Map<String, List<String>> listValueMap) {
		for (Map.Entry<String, String> entry : singleValueMap.entrySet()) {
			String currency = entry.getKey();
			String expectedValueStr = entry.getValue().trim();

			if (!listValueMap.containsKey(currency)) {
				System.err.println("❌ Mismatch: Currency " + currency + " not found in listValueMap.");
				return false;
			}

			// Convert expected value to double
			double expectedValue;
			try {
				expectedValue = Double.parseDouble(expectedValueStr);
			} catch (NumberFormatException e) {
				System.err.println(
						"❌ Error: Invalid number format in singleValueMap for " + currency + ": " + expectedValueStr);
				return false;
			}

			// Sum the values in the List<String>
			double totalValue = 0.0;
			for (String amountStr : listValueMap.get(currency)) {
				try {
					totalValue += Double.parseDouble(amountStr.trim());
				} catch (NumberFormatException e) {
					System.err.println(
							"❌ Error: Invalid number format in listValueMap for " + currency + ": " + amountStr);
					return false;
				}
			}

			// Compare expected value with total summed value
			if (Double.compare(expectedValue, totalValue) != 0) {
				System.err.println(
						"❌ Mismatch: Currency " + currency + " expected " + expectedValue + " but found " + totalValue);
				return false;
			}
		}

		return true;
	}
	public static String sumAndConvertToString(List<String> values) {
		double total = 0.0;

		for (String value : values) {
			try {
				total += Double.parseDouble(value.trim()); // Convert & add
			} catch (NumberFormatException e) {
				System.err.println("❌ Error: Invalid number format - " + value);
			}
		}

		return String.format("%.2f", total); // Ensure 2 decimal places
	}
	public static Map<String, String> sumCurrencyValues(List<String> currencies, List<String> amounts) {
		Map<String, Double> currencySumMap = new HashMap<>();

		for (int i = 0; i < currencies.size(); i++) {
			String currency = currencies.get(i);
			String amountStr = amounts.get(i).trim();

			try {
				double amount = Double.parseDouble(amountStr); // Convert string to double
				currencySumMap.put(currency, currencySumMap.getOrDefault(currency, 0.0) + amount); // Sum values
			} catch (NumberFormatException e) {
				System.err.println("❌ Error: Invalid number format for currency '" + currency + "': " + amountStr);
			}
		}

		// Convert summed values back to Map<String, String>
		Map<String, String> result = new HashMap<>();
		for (Map.Entry<String, Double> entry : currencySumMap.entrySet()) {
			result.put(entry.getKey(), String.format("%.2f", entry.getValue())); // Convert to string with 2 decimal
			// places
		}

		return result;
	}
	public static String unzip(String zipFilePath, String destDir) throws IOException {
		File dir = new File(destDir);
		if (!dir.exists())
			dir.mkdirs(); // Create destination directory if it doesn't exist

		String recentFilePath = null; // Store the most recent unzipped file

		try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
			ZipEntry entry;
			while ((entry = zis.getNextEntry()) != null) {
				File newFile = new File(destDir, entry.getName());

				if (entry.isDirectory()) {
					newFile.mkdirs();
				} else {
					new File(newFile.getParent()).mkdirs();
					try (FileOutputStream fos = new FileOutputStream(newFile)) {
						byte[] buffer = new byte[1024];
						int len;
						while ((len = zis.read(buffer)) > 0) {
							fos.write(buffer, 0, len);
						}
					}
					recentFilePath = newFile.getAbsolutePath(); // Update recent file path
				}
				zis.closeEntry();
			}
		}
		return recentFilePath; // Return the most recent extracted file path
	}
	public boolean checkpdf(String filepath, String text) {

		String pdfPath = filepath;
		String searchText = text;

		try {
			File file = new File(pdfPath);
			PDDocument document = PDDocument.load(file);

			// Extract text from PDF
			PDFTextStripper stripper = new PDFTextStripper();
			String pdfText = stripper.getText(document);

			// Close the document
			document.close();

			// Check if the text exists in the PDF
			if (pdfText.contains(searchText)) {
				System.out.println("Text found: " + searchText);
				return true;
			} else {
				System.out.println("Text not found: " + searchText);
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	/*
	 * Used to get the table value
	 */
	public List<Map<String, String>> extractTableDataDirect1(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			// Wait until the table is present
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

			// Locate the parent div containing the table data
			WebElement tableContainer = driver.findElement(By.xpath(values[1]));

			// Get all header cells
			List<WebElement> headers = tableContainer
					.findElements(By.xpath(".//span[@ref='eText' and contains(@class,'cell')]"));

			// Store headers in a list
			List<String> columnHeaders = new ArrayList<>();
			for (WebElement header : headers) {
				columnHeaders.add(header.getText().trim());
			}

			// Get all rows from the container
			List<WebElement> rows = tableContainer
					.findElements(By.xpath(".//div[@ref='eCenterContainer']//div[@role='row']"));

			// List to store each row as a map
			List<Map<String, String>> tableData = new ArrayList<>();

			// Iterate through the rows
			for (WebElement row : rows) {
				List<WebElement> cells = row.findElements(By.xpath(".//div[contains(@class,'ag-cell-auto')]"));

				// Ensure the number of cells matches the number of headers
				if (cells.size() == columnHeaders.size()) {
					Map<String, String> rowData = new HashMap<>();
					for (int i = 0; i < cells.size(); i++) {
						rowData.put(columnHeaders.get(i), cells.get(i).getText().trim());
					}
					tableData.add(rowData);
				} else {
					System.out.println("Row cell count mismatch with header count.");
				}
			}

			return tableData;

		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver,
					"Unable to get the Table Value from Element - " + values[0] + " " + e.getLocalizedMessage(), test,
					test);
			return Collections.emptyList();
		}
	}
	public List<List<String>> getValuesByHeaders(List<Map<String, String>> tableData, List<String> headers) {
		// Initialize the result list
		List<List<String>> result = new ArrayList<>();

		// Iterate over each row in the table data
		for (Map<String, String> rowData : tableData) {
			// Initialize a list to store the values for the current row
			List<String> rowValues = new ArrayList<>();

			// Iterate over the headers to maintain the order
			for (String header : headers) {
				// Fetch the value corresponding to the header and add it to the row list
				// If the header does not exist, add null
				rowValues.add(rowData.getOrDefault(header, null));
			}

			// Add the row values to the result
			result.add(rowValues);
		}

		// Return the list of values grouped by headers
		return result;
	}

	public static void compareListHeaders(WebDriver driver, List<List<String>> opl_header,
			List<List<String>> load_header) {
		// Convert both lists into sets to disregard order and duplicate entries
		Set<List<String>> oplSet = new HashSet<>(opl_header);
		Set<List<String>> loadSet = new HashSet<>(load_header);

		// Compare the sets
		if (oplSet.equals(loadSet)) {
			System.out.println("Both lists contain the same elements, regardless of order.");
			// Log the success with WebDriver
			Extent_pass(driver, "Both lists are equal", test, test);
		} else {
			System.out.println("The lists contain different elements.");
			// Log the failure with WebDriver
			Extent_fail(driver, "Both lists are not equal", test, test);
		}
	}
	public static double getNumberValue1(String value) {

		double numberValue = 0;
		try {
			if (value.contains(",")) {
				value = value.replace(",", "");
			}
			numberValue = Double.parseDouble(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return numberValue;

	}

	public String readPdf(String filepath, String input1, String input2) {
		String extractedText = "";

		try {
			File file = new File(filepath);
			PDDocument document = PDDocument.load(file);

			// Extract text from PDF
			PDFTextStripper stripper = new PDFTextStripper();
			String pdfText = stripper.getText(document);

			// Close the document
			document.close();

			// Debug: Print extracted text (optional)
			// System.out.println("Extracted PDF Text: \n" + pdfText);

			// Define dynamic regex pattern
			String regex = "(?i)" + input1 + "\\s*(.*?)\\s*(?=" + input2 + "|$)";

			// Extract value using regex
			extractedText = extractValue(pdfText, regex);

			System.out.println("Extracted Text: " + extractedText);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return extractedText;
	}

	/*
	 * Used to get the text color for the particular element
	 */
	public String getTextColor1(WebDriver driver, WebElement element) {
		try {
			String rgbFormat = element.getCssValue("color");
			String hexcolor = rgbToHex(rgbFormat);
			Extent_pass(driver, "Get the Text Color of "+ element.getText(), test,test1);
			return hexcolor;
		} catch (Exception e) {
			System.out.println("Unable to get color of the element..!");
			Extent_fail(driver, "Unable to Get the Text Color of "+ element.getText(), test,test1);
			global.add("Unable to Get the Text Color of "+ element.getText());
			Assert.fail("Unable to Get the Text Color of "+ element.getText());
			return "";
		}

	}


	/*
	 * Used to Check the server status
	 */
	public static int responseCode=0;
	public static boolean isServerUp(String url) {
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			responseCode = connection.getResponseCode();
			System.out.println("response code: "+responseCode);
			//        global.add("response code: "+responseCode;
			if(responseCode == 200) {
				return (responseCode == 200);
			}else {
				serverStatus = false;
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}


	private static boolean isChromeOrEdge(WebDriver driver) {
		// Simple check for Chrome or Edge by browser name or other means
		return driver instanceof ChromeDriver || driver instanceof EdgeDriver;
	}

	public static boolean checkServerStatus(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Checking server status for: " + currentUrl);
		if (driver instanceof HasDevTools && isChromeOrEdge(driver)) {// Chrome & Edge support DevTools
			// Suppress DevTools logs
			Logger seleniumLogger = Logger.getLogger("org.openqa.selenium.devtools.Connection");
			seleniumLogger.setLevel(Level.WARNING);

			// Start DevTools session
			DevTools devTools = ((HasDevTools) driver).getDevTools();
			devTools.createSession();
			devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

			final int[] statusCode = {-1};

			// Listen for network responses
			devTools.addListener(Network.responseReceived(), response -> {
				Response res = response.getResponse();
				if (res.getUrl().equals(currentUrl)) {
					statusCode[0] = res.getStatus();
				}
			});

			// Wait for page load
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.navigate().to(currentUrl);
			wait.until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			responseCode=statusCode[0];
			return (statusCode[0] == 200);
		} else {
			// For Firefox, use an HTTP Request to check status
			return checkServerStatusViaHttp(currentUrl);
		}
	}


	// HTTP method for checking server status (Works for all browsers)
	public static boolean checkServerStatusViaHttp(String url) {
		HttpURLConnection connection = null;
		try {
			URL serverUrl = new URL(url);
			connection = (HttpURLConnection) serverUrl.openConnection();
			connection.setRequestMethod("GET");  // Ensure it's GET for compatibility
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36");
			connection.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
			connection.setRequestProperty("Connection", "close"); // Ensure proper closing
			connection.setInstanceFollowRedirects(true);  // Follow HTTP → HTTPS redirects
			connection.setConnectTimeout(7000);  // Increase timeout
			connection.setReadTimeout(7000);
			int responseCode = connection.getResponseCode();
			System.out.println("Firefox Server Response Code: " + responseCode);
			return (responseCode == 200);
		} catch (IOException e) {
			return false;
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}
	public List<Map<String, String>> extractCompleteTableData(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			// Wait for table visibility
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

			WebElement tableContainer = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Locate the horizontal scrollbar
			WebElement scrollbar = tableContainer.findElement(By.xpath(".//div[@ref='eBodyHorizontalScrollViewport']"));

			// Step 1: Extract All Headers with aria-colindex
			Map<Integer, String> columnIndexToHeader = new LinkedHashMap<>();
			long lastScroll = -1, currentScroll = 0;

			// Scroll fully to the right to capture all headers
			while (lastScroll != currentScroll) {
				lastScroll = currentScroll;
				js.executeScript("arguments[0].scrollLeft += 200;", scrollbar);
				Thread.sleep(300);
				currentScroll = ((Number) js.executeScript("return arguments[0].scrollLeft;", scrollbar)).longValue();
			}

			// Extract headers after full scroll
			List<WebElement> headerElements = tableContainer.findElements(By.xpath(".//span[@ref='eText' and contains(@class,'cell')]"));
			for (WebElement header : headerElements) {
				String colIndex = header.getDomAttribute("aria-colindex");
				if (colIndex != null) {
					int index = Integer.parseInt(colIndex);
					columnIndexToHeader.put(index, header.getText().trim());
				}
			}
			// Ensure the last column header is added if missing
			int maxIndex = columnIndexToHeader.keySet().stream().max(Integer::compareTo).orElse(0);
			if (!columnIndexToHeader.containsKey(maxIndex)) {
				columnIndexToHeader.put(maxIndex, "Unknown Column " + maxIndex);
				System.out.println("⚠ Manually added missing header for column index: " + maxIndex);
			}

			js.executeScript("arguments[0].scrollLeft = 0;", scrollbar); // Reset scroll

			// Step 2: Extract Row Data
			List<Map<String, String>> tableData = new ArrayList<>();
			List<WebElement> rows = tableContainer.findElements(By.xpath(".//div[@ref='eCenterContainer']//div[@role='row']"));

			for (WebElement row : rows) {
				Map<String, String> rowData = new LinkedHashMap<>();
				lastScroll = -1;
				currentScroll = 0;

				// Scroll fully to the right to capture all cell values
				while (lastScroll != currentScroll) {
					lastScroll = currentScroll;
					js.executeScript("arguments[0].scrollLeft += 200;", scrollbar);
					Thread.sleep(300);
					currentScroll = ((Number) js.executeScript("return arguments[0].scrollLeft;", scrollbar)).longValue();
				}

				List<WebElement> cells = row.findElements(By.xpath(".//div[contains(@class,'ag-cell-auto')]"));
				for (WebElement cell : cells) {
					String colIndex = cell.getDomAttribute("aria-colindex");
					if (colIndex != null) {
						int index = Integer.parseInt(colIndex);
						String header = columnIndexToHeader.getOrDefault(index, "Unknown Column " + index);
						rowData.put(header, cell.getText().trim());
					}
				}

				js.executeScript("arguments[0].scrollLeft = 0;", scrollbar); // Reset scroll

				if (!rowData.isEmpty()) {
					tableData.add(rowData);
				}
			}

			return tableData;
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to get the Table Value from Element - " + values[0] + " " + e.getLocalizedMessage(), test, test);
			return Collections.emptyList();
		}
	}
	public List<Map<String, String>> extractCompleteTableData1(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

			WebElement tableContainer = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement scrollbar = tableContainer.findElement(By.xpath(".//div[@ref='eBodyHorizontalScrollViewport']"));

			// Step 1: Extract Headers Before Scrolling
			Map<Integer, String> columnIndexToHeader = new LinkedHashMap<>();
			extractHeaders(tableContainer, columnIndexToHeader);

			// Step 2: Scroll Right Gradually & Extract Headers
			long lastScroll = -1, currentScroll = 0;
			long maxScroll = ((Number) js.executeScript("return arguments[0].scrollWidth;", scrollbar)).longValue();

			while (lastScroll != currentScroll) {
				Thread.sleep(1000);
				tableContainer = driver.findElement(By.xpath(values[1]));
				lastScroll = currentScroll;
				js.executeScript("arguments[0].scrollLeft += 200;", scrollbar);
				Thread.sleep(1000);
				extractHeaders(tableContainer, columnIndexToHeader);  
				currentScroll = ((Number) js.executeScript("return arguments[0].scrollLeft;", scrollbar)).longValue();
				if (currentScroll >= maxScroll) break;
			}

			// Critical Fix: Force Last Header Extraction After Full Scroll
			js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;", scrollbar);
			Thread.sleep(1000);
			tableContainer = driver.findElement(By.xpath(values[1]));
			extractHeaders(tableContainer, columnIndexToHeader); // Final Extraction

			// Step 3: Scroll Back to Start
			js.executeScript("arguments[0].scrollLeft = 0;", scrollbar);

			// Step 4: Extract Row Data
			List<Map<String, String>> tableData = new ArrayList<>();
			List<WebElement> rows = tableContainer.findElements(By.xpath(".//div[@ref='eCenterContainer']//div[@role='row']"));

			for (WebElement row : rows) {
				Map<String, String> rowData = new LinkedHashMap<>();

				// Extract Cells Before Scrolling
				extractCells(row, rowData, columnIndexToHeader);

				// Scroll Right Gradually & Extract Cells
				lastScroll = -1;
				currentScroll = 0;
				while (lastScroll != currentScroll) {
					lastScroll = currentScroll;
					js.executeScript("arguments[0].scrollLeft += 200;", scrollbar);
					Thread.sleep(300);
					extractCells(row, rowData, columnIndexToHeader);
					currentScroll = ((Number) js.executeScript("return arguments[0].scrollLeft;", scrollbar)).longValue();
					if (currentScroll >= maxScroll) break;
				}

				// Reset Scroll Position
				js.executeScript("arguments[0].scrollLeft = 0;", scrollbar);

				if (!rowData.isEmpty()) {
					tableData.add(rowData);
				}
			}

			return tableData;
		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to get the Table Value from Element - " + values[0] + " " + e.getLocalizedMessage(), test, test);
			return Collections.emptyList();
		}
	}

	private void extractHeaders(WebElement tableContainer, Map<Integer, String> columnIndexToHeader) {
		List<WebElement> headerElements = tableContainer.findElements(By.xpath(".//span[@ref='eText' and contains(@class,'cell')]"));
		for (WebElement header : headerElements) {
			String colIndex = header.getDomAttribute("aria-colindex");
			if (colIndex != null) {
				int index = Integer.parseInt(colIndex);
				String headerText = header.getText().trim();

				if (!headerText.isEmpty()) { 
					// Fix: Always update the latest non-empty header value
					columnIndexToHeader.put(index, headerText);
				}
			}
		}
	}
	// Extracts all visible cell values
	private void extractCells(WebElement row, Map<String, String> rowData, Map<Integer, String> columnIndexToHeader) {
		List<WebElement> cells = row.findElements(By.xpath(".//div[contains(@class,'ag-cell-auto')]"));
		for (WebElement cell : cells) {
			String colIndex = cell.getDomAttribute("aria-colindex");
			if (colIndex != null) {
				int index = Integer.parseInt(colIndex);
				String header = columnIndexToHeader.getOrDefault(index, "Unknown Column " + index);
				rowData.put(header, cell.getText().trim());
			}
		}
	}
	/*
	 * Used to Verify the server status and it makes the execution to fail when the
	 * server is down
	 */
	public static void verifyServerStatus(WebDriver driver) {
		System.out.println("verify server status");
		String url = driver.getCurrentUrl();
		if (checkServerStatus(driver) == true) {
			System.out.println("server is up " + responseCode);
			Extent_cal(test, test1, "Server is up and running (success code : ) " + responseCode + "**" + url + "**");
		} else {
			System.out.println("server is down");
			refreshPage(driver);
			url = driver.getCurrentUrl();
			System.out.println("Refresh page done");
			Extent_cal(test, test1, "Page was refreshed after getting code" + responseCode);
			if (checkServerStatus(driver) == true) {
				System.out.println("Server is up and running (success code : ) " + responseCode + "**" + url + "**");
				Extent_cal(test, test1,
						"Server is up and running (success code : ) " + responseCode + "**" + url + "**");
			} else {
				System.out.println("server is down");
				ITestResult result1 = convertToITestResult1(1);
				result1.setStatus(2);
				Extent_fail(driver, "Refresh  Is Done Still Server Is Down [ERROR CODE : " + responseCode + "]", test,
						test1);
				global.add("Execution stopped due to server down, responseCode : " + responseCode);
				System.out.println(global);
				try {
					ATUReports.teardown(result1, test);
				} catch (Throwable e) {
					e.printStackTrace();
				}
				ATUReports.Aftertest(test, test1);
				Assert.fail();
			}
		}
	}

	/*
	 * Used to Handle the Check boxes
	 */
	public void checkBox(WebDriver driver,String Xpath,String Status) {
		String[] values = splitXpath(Xpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
		} catch (TimeoutException e) {
			e.printStackTrace();
			Extent_fail(driver, "Element not clickable or not found within the timeout period: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Element not clickable or not found - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		} catch (Exception e) {
			// Handle other exceptions
			e.printStackTrace();
			Extent_fail(driver, "An unexpected error occurred while waiting for the element: " + values[0] + " " + e.getMessage(), test, test1);
			global.add("Error occurred while waiting for element - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
			WebElement element = driver.findElement(By.xpath(values[1]));
			String Slab_Status = element.getDomAttribute("class");
			if(Status.equalsIgnoreCase("YES")){
				if(extractstatus(Slab_Status)) {
					Extent_pass(driver, values[0]+" is Already Selected", test,test1);
				}else {
					wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
					element.click();
					Extent_pass(driver, values[0]+" is Selected", test,test1);
				}
			}else if (Status.equalsIgnoreCase("NO")) {
				if(extractstatus(Slab_Status)) {
					wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
					element.click();
					Extent_pass(driver, values[0]+" is Unselected", test,test1);
				}else {
					Extent_pass(driver, values[0]+" is Already Unselected", test,test1);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			Extent_fail(driver, values[0]+" is Not Available", test,test1);
			verifyServerStatus(driver);
			global.add(values[0]+" is Not Available");
			Assert.fail();
		}

	}
	public List<Map<String, String>> extractTableDataByColumnWithoutScroll(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

			// Locate table container
			WebElement tableContainer = driver.findElement(By.xpath(values[1]));

			// Set to track extracted headers (avoids duplicates)
			Set<String> extractedHeaders = new LinkedHashSet<>();
			List<String> columnHeaders = new ArrayList<>();
			List<Map<String, String>> tableData = new ArrayList<>();

			// Step 1: Extract headers & column values
			List<WebElement> headerElements = tableContainer
					.findElements(By.xpath(".//div[contains(@class,'ag-header-row')]//span[@ref='eText']"));
			List<WebElement> rows = tableContainer
					.findElements(By.xpath(".//div[@ref='eContainer']//div[@role='row']"));

			for (int i = 0; i < headerElements.size(); i++) {
				WebElement headerElement = headerElements.get(i);

				String headerText = headerElement.getText().trim();
				if (!headerText.isEmpty() && !extractedHeaders.contains(headerText)) {
					extractedHeaders.add(headerText);
					columnHeaders.add(headerText);

					// Step 2: Extract all row values for this column
					for (int rowIndex = 0; rowIndex < rows.size(); rowIndex++) {
						if (tableData.size() <= rowIndex) {
							tableData.add(new LinkedHashMap<>());
						}

						WebElement row = rows.get(rowIndex);
						List<WebElement> cells = row.findElements(By.xpath(".//div[contains(@class,'ag-cell-value')]"));

						if (i < cells.size()) {
							String cellValue = cells.get(i).getText().trim();
							tableData.get(rowIndex).put(headerText, cellValue);
						}
					}
				}
			}

			return tableData;

		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver,
					"Unable to get the Table Value from Element - " + values[0] + " " + e.getLocalizedMessage(), test,
					test);
			return Collections.emptyList();
		}
	}
	public static boolean compareLists(List<String> expected, List<String> actual) {
		// Check for null lists or different sizes
		if (expected == null || actual == null || expected.size() != actual.size()) {
			return false;
		}

		// Sort both lists to ignore order differences
		List<String> sortedExpected = new ArrayList<>(expected);
		List<String> sortedActual = new ArrayList<>(actual);
		Collections.sort(sortedExpected);
		Collections.sort(sortedActual);

		// Compare each element with numeric handling
		for (int i = 0; i < sortedExpected.size(); i++) {
			String expValue = sortedExpected.get(i);
			String actValue = sortedActual.get(i);

			if (isNumeric(expValue) && isNumeric(actValue)) {
				BigDecimal expNum = new BigDecimal(expValue);
				BigDecimal actNum = new BigDecimal(actValue);
				if (expNum.compareTo(actNum) != 0) {
					return false;
				}
			} else {
				if (!expValue.equals(actValue)) {
					return false;
				}
			}
		}
		return true;
	}private static boolean isNumeric(String str) {
		try {
			new BigDecimal(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}


	/*
	 * Used to verify the particular element is not present
	 */
	public boolean verifyElementIsNotPresent(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			element.isDisplayed();
			Assert.fail();
			Extent_fail(driver, values[0] + " is Displayed", test, test1);
			return false;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Extent_fail(driver, values[0] + " is Not Available "+e.getLocalizedMessage(), test, test1);

		}
		return true;
	}
	/*
	 * Used to get the attribute value of the element for the particular hidden element
	 */
	public String getAttribute1(WebDriver driver, String xpath, String attribute) {
		String[] values = splitXpath(xpath);

		try {
			WebElement inputBox = driver.findElement(By.xpath(values[1]));
			String textInsideInputBox = inputBox.getDomAttribute(attribute);
			Extent_pass(driver, "Get the Attribute value of " + values[0], test,test1);
			return textInsideInputBox;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to Get the Attribute value of " + values[0], test,test1);
			global.add("Unable to Get the Attribute value of " + values[0]);
			Assert.fail("Unable to Get the Attribute value of " + values[0]);
			return null;

		}
	}
	public void jsClick(WebDriver driver, String path) {
		String[] values = splitXpath(path);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
		} catch (TimeoutException e) {
		}
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", webElement);
			System.out.println(values[0] + " clicked");
			Extent_pass(driver, "Click on " + values[0], test,test1);
		} catch (Exception e) {
			System.out.println(" Exception " + e);
			Extent_fail(driver, "Unable to click on " + values[0]+"  "+  e.getLocalizedMessage(), test,test1);
			global.add("Unable to click on - " + values[0]);
			verifyServerStatus(driver);
			Assert.fail();
		}
	}

	public boolean verifyElementHasValueAttribute(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		boolean temp = false;
		try {
			// Retrieve the value attribute of the element
			String value = driver.findElement(By.xpath(values[1])).getDomAttribute("value");

			// If the value is empty, fail the test and verify the server status
			if (value == null || value.equals("")) {
				temp = false;
				Extent_fail(driver, values[0] + " is Not Available", test, test1);
			} else {
				temp = true;
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			Extent_fail(driver, values[0] + " is Not Available", test, test1);
			verifyServerStatus(driver);
			global.add(values[0] + " is Not Available");
			Assert.fail();
		}
		return temp;
	}

	/*
	 * Used to Close the tab
	 */
	public void closeTab(WebDriver driver) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
		// tabs.remove(tabs.get(0));
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(0));
	}

	/*
	 * Used to Close the tab
	 */
	public void closeTab1(WebDriver driver, int input) {
		driver.findElement(By.xpath("body")).sendKeys(Keys.CONTROL + "w");
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(input));
	}

	/*
	 * Used to switch one tab to another tab
	 */
	public void switchtotab(WebDriver driver, int inputData) {
		Capabilities localCapabilities = ((RemoteWebDriver) driver).getCapabilities();
		String BROWSER_NAME = localCapabilities.getBrowserName().toLowerCase();
		if (BROWSER_NAME.equalsIgnoreCase("firefox")) {
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
			driver.switchTo().defaultContent();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(inputData));
		}
		if (BROWSER_NAME.equalsIgnoreCase("chrome")) {
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
			driver.switchTo().defaultContent();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(inputData));
			wait(driver, "2");
		}
	}

	/*
	 * Used to Navigate the URL  
	 */

	public void navigateUrl(WebDriver driver, String inputData) {
		try {
			if (inputData == null) {
				Assert.fail(inputData);
			} else {
				driver.navigate().to(inputData);
				verifyServerStatus(driver);
				Extent_pass(driver, "Navigated to " +inputData , test,test1);
			}
		} catch (Exception e) {
			Extent_fail(driver, e.getLocalizedMessage(), test,test1);
			global.add(e.getLocalizedMessage());
			e.printStackTrace();
			Assert.fail();
		}

	}
	/*
	 * Used to click for the particular element
	 */
	public void safeclick(WebDriver driver, String Xpath) {
		String[] values = splitXpath(Xpath);
		int retries = 30;  // Number of retries
		int attempt = 0;  // To track retry attempts

		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete';"));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath(values[1]))));

			while (attempt < retries) {
				try {
					WebElement element = driver.findElement(By.xpath(values[1]));
					element.click(); // Attempt to click the element
					// Log success
					Extent_pass(driver, "Element " + values[0] + " is clicked", test,test1);
					//	                System.out.println("Element " + values[0] + " is clicked");
					break;  // Break the loop if click is successful
				} catch (ElementClickInterceptedException e) {
					attempt++;
					//	                System.out.println("Attempt " + attempt + " failed due to ElementClickInterceptedException. Retrying...");
					if (attempt == retries) {
						throw e;  // Rethrow the exception after retries are exhausted
					}
					// Optional: Add a small wait between retries
					Thread.sleep(1000);
				}
				catch (StaleElementReferenceException e) {
					attempt++;
					//	                System.out.println("Attempt " + attempt + " failed due to ElementClickInterceptedException. Retrying...");
					if (attempt == retries) {
						throw e;  // Rethrow the exception after retries are exhausted
					}
					// Optional: Add a small wait between retries
					Thread.sleep(3000);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			Extent_fail(driver, "Unable to click on " + values[0] + " || " + e.getLocalizedMessage(), test,test1);
			System.out.println("Unable to click on " + values[0] + " || " + e.getLocalizedMessage());
			global.add("Unable to click on " + values[0] + " || " + e.getLocalizedMessage());
			Assert.fail("Unable to click on " + values[0] + " || " + e.getLocalizedMessage());
		}
	}
	/*
	 * Used to get the download file path 
	 */
	public static String downloadspath() {
		String os = System.getProperty("os.name").toLowerCase();
		String downloadsPath = "";
		if (os.contains("win")) {
			// For Windows, using Shell32Util
			downloadsPath = Shell32Util.getKnownFolderPath(KnownFolders.FOLDERID_Downloads);
		} else if (os.contains("mac")) {
			// For macOS, using user home directory and "Downloads" folder
			downloadsPath = System.getProperty("user.home") + "/Downloads";
		}
		String downloadDir = downloadsPath;

		System.out.println("downloadDir :" + downloadDir);

		return downloadDir;

	}
	/*
	 * Used to get the newly downloded file path
	 */
	public static Set<String> getDirectoryFiles() {
		String downloads = downloadspath();

		File dir = new File(downloads);
		Set<String> files = new HashSet<>();
		if (dir.isDirectory()) {
			files.addAll(Arrays.asList(dir.list()));
		}
		return files;
	}
	/*
	 * Used to get the downloaded file path
	 */
	public String downloadFile(WebDriver driver,  String xpaths) {
		String[] values = splitXpath(xpaths);
		String downloads = downloadspath();
		String pathOfTheFile = null;
		File dir = new File(downloads);
		Set<String> files = new HashSet<>();
		if (dir.isDirectory()) {
			files.addAll(Arrays.asList(dir.list()));
		}

		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitElementSeconds));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitElementSeconds));
			WebElement element = driver.findElement(By.xpath(values[1]));

			wait.until(ExpectedConditions.elementToBeClickable(element));
			try {
				element.click();
			}catch(ElementClickInterceptedException e) {
				element.click();
			}

			//			Extent_pass(driver, "Click on the element " + name, test);
		} catch (Exception e) {
			//			e.printStackTrace();
			//			Extent_fail(driver, "Click on the element " + name, LogAs.FAILED, test);
		}

		wait(driver, "5");

		Set<String> newFiles = getDirectoryFiles();
		newFiles.removeAll(files); // Get only new files

		for(String file: newFiles) {
			pathOfTheFile = downloads+"/" + file;
		}

		return pathOfTheFile;
	}
	/*
	 * Used to get the row count from excel which is having the values
	 */
	public static int countNonEmptyRows(String excelFilePath) throws EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		int nonEmptyRowsCount = 0;
		try (FileInputStream file = new FileInputStream(new File(excelFilePath))) {
			// Create a Workbook instance
			Workbook workbook = WorkbookFactory.create(file);
			// Assuming you want to check the first sheet (index 0)
			Sheet sheet = workbook.getSheetAt(0);
			// Iterate through all the rows
			for (Row row : sheet) {
				boolean rowHasData = false;
				// Iterate through each cell in the row
				for (Cell cell : row) {
					if (cell != null && cell.getCellType() == CellType.STRING.getCode()) {
						rowHasData = true; // If any cell has data, count the row
						break;
					}
				}
				// If row has data, increment the count
				if (rowHasData) {
					nonEmptyRowsCount++;
				}
			}
			// Close the workbook (handled automatically by the try-with-resources)
			workbook.close();
		} catch (IOException  e) {
			//	            e.printStackTrace();
		}
		return nonEmptyRowsCount;
	}
	/*
	 * Used to update the excel sheet 
	 */
	public void updateCellsWithLimitedValues(WebDriver driver, String filePath, String sheetName, String[] values) {
		try (FileInputStream fis = new FileInputStream(new File(filePath));
				Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheet(sheetName);
			if (sheet == null) {
				System.out.println("Sheet not found!");
				return;
			}

			Row headerRow = null;
			int headerRowIndex = -1;

			// Search for the header row
			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				if (row != null && containsHeader(row, "Actual Container No")) {
					headerRow = row;
					headerRowIndex = i;
					break;
				}
			}

			if (headerRow == null) {
				System.out.println("Header row not found!");
				return;
			}

			int columnIndex = -1;

			// Find the column index for "Actual Container No"
			for (Cell cell : headerRow) {
				if (cell != null && cell.getCellType() == CellType.STRING.getCode() && "Actual Container No".equals(cell.getStringCellValue())) {
					columnIndex = cell.getColumnIndex();
					break;
				}
			}

			if (columnIndex == -1) {
				System.out.println("Column 'Actual Container No' not found!");
				return;
			}

			int valueIndex = 0;

			// Iterate through the rows in the specified column and update empty cells
			for (int i = headerRowIndex + 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				if (row != null) {
					Cell cell = row.getCell(columnIndex);

					// If the cell is null, create it
					if (cell == null) {
						cell = row.createCell(columnIndex);
					}

					// Check if the cell is blank
					if (cell.getCellType() == CellType.BLANK.getCode()) {
						// Update the cell only if there are values left to assign
						if (valueIndex < values.length) {
							cell.setCellValue(values[valueIndex]); // Update the cell with the value
							System.out.println("updated value: "+values[valueIndex]);
							valueIndex++; // Move to the next value
						} else {
							break; // Exit if no more values are left to assign
						}
					}
				}
			}

			// Write the changes to the file
			try (FileOutputStream fos = new FileOutputStream(new File(filePath))) {
				workbook.write(fos);
			}

			System.out.println("Empty cells under 'Actual Container No' updated successfully!");

		} catch (IOException e) {
			//			e.printStackTrace();
			//	        Extent_fail(driver, e.getLocalizedMessage(), LogAs.FAILED, test);
		}
	}
	/*
	 * Used to get the background color of the element
	 */
	public String getTextBackgroundColor1(WebDriver driver,WebElement element) {
		//String[] values=splitXpath(Xpath);
		try {
			//WebElement eleSearch = driver.findElement(By.xpath(values[1]));

			String rgbFormat = element.getCssValue("background-color");

			//			System.out.println(rgbFormat);     //In RGB Format the value will be print => rgba(254, 189, 105, 1)

			String hexcolor = rgbToHex(rgbFormat);
			//			System.out.println(hexcolor);

			return hexcolor;
		}catch(Exception e) {
			verifyServerStatus(driver);
			System.out.println("Unable to get color of the element..!");
			return "";
		}
	}
	/*
	 * Used to get the background color of the element
	 */
	public void write_data(String columnName, String str) throws FileNotFoundException, IOException {

		String filePath = System.getProperty("user.dir") + "\\uploads\\Script_Data's.xlsx";

		// Specify the sheet name
		String sheetName = "Sheet1";

		// New value to be set in the cell
		String newValue = str;

		try (FileInputStream fis = new FileInputStream(filePath);
				Workbook workbook = new XSSFWorkbook(fis)) {

			// Get the sheet
			Sheet sheet = workbook.getSheet(sheetName);

			// Get the row index (assuming you want to write to the first available row)
			int rowIndex = 1; // Row index

			// Get the row, create if it doesn't exist
			Row row = sheet.getRow(rowIndex);
			if (row == null) {
				row = sheet.createRow(rowIndex);
			}
		}}
	// Method to check if a row contains the header you're looking for
	private boolean containsHeader(Row row, String header) {
		for (Cell cell : row) {
			if (cell != null && cell.getCellType() == CellType.STRING.getCode() && header.equals(cell.getStringCellValue())) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Used to update the values in excel sheet 
	 */
	public void updateActContainer(WebDriver driver,String FilePath,String sheetName, int RowNum, String columnName, List<String> abc) {
		int b=0;

		//System.out.println("sheetName :" + sheetName);
		try (FileInputStream fis = new FileInputStream(new File(FilePath)); Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheet(sheetName);
			if (sheet == null) {
				System.out.println("Sheet not found!");
				return;
			}

			Row headerRow = sheet.getRow(RowNum); // Assuming headers are in the first row
			if (headerRow == null) {
				System.out.println("Header row not found!");
				return;
			}

			int columnIndex = -1;

			// Find the column index based on the column name
			for (Cell cell : headerRow) {
				if (cell.getStringCellValue().equals(columnName)) {
					columnIndex = cell.getColumnIndex();
					break;
				}
			}

			if (columnIndex == -1) {
				System.out.println("Column not found!");
				return;
			}

			int lastRowNum = sheet.getLastRowNum();
			System.out.println("lastRowNum : "+lastRowNum);

			for(int i=14;i<lastRowNum;i++) {
				Row row=sheet.getRow(i);
				Cell cell = row.getCell(columnIndex);
				String cellValueAct=getCellValueAsString(cell);
				if ((cell == null || cellValueAct.isEmpty() || cellValueAct.equals(""))&& b<abc.size() ) {
					cell.setCellValue(abc.get(b));
					b++;
				}
			}

			// Write the changes to the file
			try (FileOutputStream fos = new FileOutputStream(new File(FilePath))) {
				workbook.write(fos);
			}

			System.out.println("Value updated successfully!");

		} catch (IOException e) {
			//			e.printStackTrace();
			//Extent_fail(driver, e.getLocalizedMessage(), LogAs.FAILED, test);
		}

	}
	/*
	 * Used to get cell values from excel
	 */
	public static String getCellValueAsString(Cell cell) {
		switch (cell.getCellTypeEnum()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				return cell.getDateCellValue().toString();
			} else {
				return String.valueOf(cell.getNumericCellValue());
			}
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case FORMULA:
			return cell.getCellFormula();
		case BLANK:
			return "";
		default:
			return "";
		}
	}

	/*
	 * Used to Perform the backspace Action on that page
	 */
	public void backspace(WebDriver driver) {
		try {
			wait(driver,"3");
			Actions actionObject = new Actions(driver);
			actionObject.sendKeys(Keys.BACK_SPACE).build().perform();
		} catch (Exception e) {
			//			Assert.fail();
		}
	}
	/*
	 * Used to Perform the controll Action on that page
	 */
	public void selectall(WebDriver driver) {
		try {
			wait(driver,"3");
			Actions actionObject = new Actions(driver);
			actionObject.sendKeys(Keys.CONTROL).build().perform();
		} catch (Exception e) {
			//			Assert.fail();
		}
	}
	/*
	 * Used to Report purpose
	 */
	public static ITestResult convertToITestResult1(int value) {
		ITestResult result = new CustomTestResult();
		result.setStatus(value);
		return result;
	}

	/*
	 * Used to split and get the date from excel data
	 */
	public static void datePickerWithTime(String date, StringBuilder dayOut, StringBuilder monthOut, StringBuilder yearOut ,StringBuilder timeOut) {
		if(date.contains("/")) {
			// Split the date string by "/"

			String[] parts = date.split("/");
			String[] Time = parts[2].split(" ");
			//        String[] hour = time[1].split(":");

			// Extract day, month, and year from the array
			int day = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int year = Integer.parseInt(Time[0]);
			//        int time = Integer.parseInt(Time[1]);

			// Array of month names
			String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			// Get the month name (adjust index for zero-based array)
			String monthName = monthNames[month - 1];
			// Set the output parameters
			dayOut.setLength(0);
			dayOut.append(day);
			monthOut.setLength(0);
			monthOut.append(monthName);
			yearOut.setLength(0);
			yearOut.append(year);
			timeOut.setLength(0);
			timeOut.append(Time[1]);

		}else if(date.contains("-")) {
			// Split the date string by "/"
			String[] parts = date.split("-");
			String[] Time = parts[2].split(" ");

			// Extract day, month, and year from the array
			int day = Integer.parseInt(parts[1]);
			int month = Integer.parseInt(parts[0]);
			int year = Integer.parseInt(Time[0]);

			// Array of month names
			String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			// Get the month name (adjust index for zero-based array)
			String monthName = monthNames[month - 1];
			// Set the output parameters
			dayOut.setLength(0);
			dayOut.append(day);
			monthOut.setLength(0);
			monthOut.append(monthName);
			yearOut.setLength(0);
			yearOut.append(year);
			timeOut.setLength(0);
			timeOut.append(Time[1]);

		}
	}
	/*
	 * Used to split and get the date from excel data
	 */
	public static void datePickerWithTime(String date, StringBuilder dayOut, StringBuilder monthOut, StringBuilder yearOut ,StringBuilder hourOut,StringBuilder minitOut) {
		if(date.contains("/")) {
			// Split the date string by "/"

			String[] parts = date.split("/");
			String[] Time = parts[2].split(" ");
			String[] hour = Time[1].split(":");

			// Extract day, month, and year from the array
			int day = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int year = Integer.parseInt(Time[0]);
			int Hour = Integer.parseInt(hour[0]);
			int minite=Integer.parseInt(hour[1]);

			// Array of month names
			String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			// Get the month name (adjust index for zero-based array)
			String monthName = monthNames[month - 1];
			// Set the output parameters
			dayOut.setLength(0);
			dayOut.append(day);
			monthOut.setLength(0);
			monthOut.append(monthName);
			yearOut.setLength(0);
			yearOut.append(year);
			hourOut.setLength(0);
			hourOut.append(Hour);
			minitOut.setLength(0);
			minitOut.append(minite);

		}else if(date.contains("-")) {
			// Split the date string by "/"
			String[] parts = date.split("-");
			String[] Time = parts[2].split(" ");
			String[] hour = Time[1].split(":");
			// Extract day, month, and year from the array
			int day = Integer.parseInt(parts[1]);
			int month = Integer.parseInt(parts[0]);
			int year = Integer.parseInt(Time[0]);
			int Hour = Integer.parseInt(hour[0]);
			int minite=Integer.parseInt(hour[1]);

			// Array of month names
			String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			// Get the month name (adjust index for zero-based array)
			String monthName = monthNames[month - 1];
			// Set the output parameters
			dayOut.setLength(0);
			dayOut.append(day);
			monthOut.setLength(0);
			monthOut.append(monthName);
			yearOut.setLength(0);
			yearOut.append(year);
			hourOut.setLength(0);
			hourOut.append(Hour);
			minitOut.setLength(0);
			minitOut.append(minite);
		}
	}

	// Custom implementation of ITestResult for simplicity
	static class CustomTestResult implements ITestResult {
		private int status;
		@Override
		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		@Override
		public Object getAttribute(String name) {
			return name;
		}


		@Override
		public void setAttribute(String name, Object value) {
		}

		@Override
		public Set<String> getAttributeNames() {
			return null;
		}

		@Override
		public Object removeAttribute(String name) {
			return null;
		}

		@Override
		public int compareTo(ITestResult o) {
			return 0;
		}

		@Override
		public ITestNGMethod getMethod() {
			return null;
		}

		@Override
		public Object[] getParameters() {
			return null;
		}

		@Override
		public void setParameters(Object[] parameters) {
		}

		@Override
		public IClass getTestClass() {
			return null;
		}

		@Override
		public Throwable getThrowable() {
			return null;
		}

		@Override
		public void setThrowable(Throwable throwable) {
		}

		@Override
		public long getStartMillis() {
			return 0;
		}

		@Override
		public long getEndMillis() {
			return 0;
		}

		@Override
		public void setEndMillis(long millis) {
		}

		@Override
		public String getName() {
			return null;
		}

		@Override
		public boolean isSuccess() {
			return false;
		}

		@Override
		public String getHost() {
			return null;
		}

		@Override
		public Object getInstance() {
			return null;
		}

		@Override
		public String getTestName() {
			return null;
		}

		@Override
		public String getInstanceName() {
			return null;
		}

		@Override
		public ITestContext getTestContext() {
			return null;
		}
	}

	private static Object parse(String json) {
		return null;
	}


}
