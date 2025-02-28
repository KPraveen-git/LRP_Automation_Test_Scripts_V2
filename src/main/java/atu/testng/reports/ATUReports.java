package atu.testng.reports;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import commonMethods.Keywords;
import commonMethods.Utils;

public class ATUReports{
	//public  WebDriver atu driver;
	public  final int MAX_BAR_REPORTS = 10;
	public  final String MESSAGE = "ATU Reporter: Preparing Reports";
	public  String indexPageDescription = "Reports Description";
	public  String currentRunDescription = "Here you can give description about the current Run";
	//	private  String screenShotNumber;
	//	private static long lastExecutionTime;
	//	private  long currentExecutionTime;
	public  final String EMPTY = "";
	public  final String STEP_NUM = "STEP";
	public  final String PASSED_BUT_FAILED = "passedButFailed";
	public static String File_Name = Utils.getDataFromTestConfig("Report_File_Name");
	//
	public static String str;

	static ExtentSparkReporter spark;
	static ExtentTest test;
	protected static ExtentReports extent;

	static ExtentSparkReporter spark1;
	public static ExtentTest test1;
	protected static ExtentReports extent1;
	public static String path;

	static long StartTime;
	protected static WebDriver driver;

	static String baseURL = Utils.getDataFromTestConfig("URL");
	static String Browser_Name = Utils.getDataFromTestConfig("AppBrowser");
	static String project_Name = Utils.getDataFromTestConfig("Project_Name");
	static String version_Name = Utils.getDataFromTestConfig("Version_Name");
	static String scn_Option = Utils.getDataFromTestConfig("Report_Screenshot");

	//	public  void setAuthorInfo(String paramString1, String paramString2, String paramString3) {
	//		AuthorDetails localAuthorDetails = new AuthorDetails();
	//		localAuthorDetails.setAuthorName(paramString1);
	//		localAuthorDetails.setCreationDate(paramString2);
	//		localAuthorDetails.setVersion(paramString3);
	//		Reporter.getCurrentTestResult().setAttribute("authorInfo", localAuthorDetails);
	//	}
	//
	//	public  void setTestCaseReqCoverage(String paramString) {
	//		Reporter.getCurrentTestResult().setAttribute("reqCoverage", paramString);
	//	}
	//
	//	private  void stepFailureHandler(ITestResult paramITestResult, Steps paramSteps, LogAs paramLogAs) {
	//		if (paramLogAs == LogAs.FAILED) {
	//			buildReportData(paramSteps);
	//			if (Directory.continueExecutionAfterStepFailed)
	//				paramITestResult.setAttribute("passedButFailed", "passedButFailed");
	//			else
	//				throw new ATUReporterStepFailedException();
	//			return;
	//		}
	//		buildReportData(paramSteps);
	//	}
	//
	//	public  void add(WebDriver driver,String paramString, LogAs paramLogAs, CaptureScreen paramCaptureScreen) {
	//		if (paramCaptureScreen != null)
	//			if (paramCaptureScreen.isCaptureBrowserPage())
	//				takeBrowserPageScreenShot(driver);
	//			else if (paramCaptureScreen.isCaptureDesktop())
	//				takeDesktopScreenshot();
	//			else if (paramCaptureScreen.isCaptureWebElement())
	//				takeWebElementScreenShot(driver,paramCaptureScreen.getElement());
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString);
	//		localSteps.setInputValue("");
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue("");
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		stepFailureHandler(Reporter.getCurrentTestResult(), localSteps, paramLogAs);
	//	}
	//
	//	public  void add(WebDriver driver,String paramString1, String paramString2, LogAs paramLogAs,
	//			CaptureScreen paramCaptureScreen) {
	//		if (paramCaptureScreen != null)
	//			if (paramCaptureScreen.isCaptureBrowserPage())
	//				takeBrowserPageScreenShot(driver);
	//			else if (paramCaptureScreen.isCaptureDesktop())
	//				takeDesktopScreenshot();
	//			else if (paramCaptureScreen.isCaptureWebElement())
	//				takeWebElementScreenShot(driver,paramCaptureScreen.getElement());
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString1);
	//		localSteps.setInputValue(paramString2);
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue("");
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		stepFailureHandler(Reporter.getCurrentTestResult(), localSteps, paramLogAs);
	//	}
	//
	//	public  void add(WebDriver driver,String paramString1, String paramString2, String paramString3, LogAs paramLogAs,
	//			CaptureScreen paramCaptureScreen) {
	//		if (paramCaptureScreen != null)
	//			if (paramCaptureScreen.isCaptureBrowserPage())
	//				takeBrowserPageScreenShot(driver);
	//			else if (paramCaptureScreen.isCaptureDesktop())
	//				takeDesktopScreenshot();
	//			else if (paramCaptureScreen.isCaptureWebElement())
	//				takeWebElementScreenShot(driver,paramCaptureScreen.getElement());
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString1);
	//		localSteps.setInputValue("");
	//		localSteps.setExpectedValue(paramString2);
	//		localSteps.setActualValue(paramString3);
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		stepFailureHandler(Reporter.getCurrentTestResult(), localSteps, paramLogAs);
	//	}
	//
	//	public  void add(WebDriver driver,String paramString1, String paramString2, String paramString3, String paramString4,
	//			LogAs paramLogAs, CaptureScreen paramCaptureScreen) {
	//		if (paramCaptureScreen != null)
	//			if (paramCaptureScreen.isCaptureBrowserPage())
	//				takeBrowserPageScreenShot(driver);
	//			else if (paramCaptureScreen.isCaptureDesktop())
	//				takeDesktopScreenshot();
	//			else if (paramCaptureScreen.isCaptureWebElement())
	//				takeWebElementScreenShot(driver,paramCaptureScreen.getElement());
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString1);
	//		localSteps.setInputValue(paramString2);
	//		localSteps.setExpectedValue(paramString3);
	//		localSteps.setActualValue(paramString4);
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		stepFailureHandler(Reporter.getCurrentTestResult(), localSteps, paramLogAs);
	//	}
	//
	//	private  void buildReportData(Steps paramSteps) {
	//		screenShotNumber = null;
	//		int i = Reporter.getOutput().size() + 1;
	//		Reporter.getCurrentTestResult().setAttribute("STEP" + i, paramSteps);
	//		Reporter.log("STEP" + i);
	//	}
	//
	//	private  String getExecutionTime() {
	//		currentExecutionTime = System.currentTimeMillis();
	//		long l = currentExecutionTime - lastExecutionTime;
	//		if (l > 1000L) {
	//			l /= 1000L;
	//			lastExecutionTime = currentExecutionTime;
	//			return l + " Sec";
	//		}
	//		lastExecutionTime = currentExecutionTime;
	//		return l + " Milli Sec";
	//	}
	//
	//	private  String getLineNumDesc() {
	//		str = "" + java.lang.Thread.currentThread().getStackTrace()[4].getLineNumber();
	//		return str;
	//	}
	//
	//	private  void takeDesktopScreenshot() {
	//		if (!(Directory.takeScreenshot))
	//			return;
	//		ITestResult localITestResult = Reporter.getCurrentTestResult();
	//		String str = localITestResult.getAttribute("reportDir").toString() + Directory.SEP + Directory.IMGDIRName;
	//		screenShotNumber = (Reporter.getOutput(Reporter.getCurrentTestResult()).size() + 1) + "";
	//		File localFile = new File(str + Directory.SEP + screenShotNumber + ".PNG");
	//		try {
	//			Rectangle localRectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	//			BufferedImage localBufferedImage = new Robot().createScreenCapture(localRectangle);
	//			ImageIO.write(localBufferedImage, "PNG", localFile);
	//		} catch (Exception localException) {
	//			screenShotNumber = null;
	//		}
	//	}
	//
	//	private  void takeBrowserPageScreenShot(WebDriver driver) {
	//		if (!(Directory.takeScreenshot))
	//			return;
	//		if (driver == null) {
	//			screenShotNumber = null;
	//			return;
	//		}
	//		ITestResult localITestResult = Reporter.getCurrentTestResult();
	//		String str = localITestResult.getAttribute("reportDir").toString() + Directory.SEP + Directory.IMGDIRName;
	//		screenShotNumber = (Reporter.getOutput(Reporter.getCurrentTestResult()).size() + 1) + "";
	//		File localFile = new File(str + Directory.SEP + screenShotNumber + ".PNG");
	//		try {
	//			WebDriver localWebDriver;
	//			if (driver.getClass().getName().equals("org.openqa.selenium.remote.RemoteWebDriver"))
	//				localWebDriver = (WebDriver) new Augmenter().augment(driver);
	//			else
	//				localWebDriver = driver;
	//			if (localWebDriver instanceof TakesScreenshot) {
	//				byte[] arrayOfByte = (byte[]) ((TakesScreenshot) localWebDriver).getScreenshotAs(OutputType.BYTES);
	//				Files.write(arrayOfByte, localFile);
	//			} else {
	//				screenShotNumber = null;
	//			}
	//		} catch (Exception localException) {
	//			screenShotNumber = null;
	//		}
	//	}
	//
	//	private  void takeWebElementScreenShot(WebDriver driver,WebElement paramWebElement) {
	//		if (!(Directory.takeScreenshot))
	//			return;
	//		if (driver == null) {
	//			screenShotNumber = null;
	//			return;
	//		}
	//		ITestResult localITestResult = Reporter.getCurrentTestResult();
	//		String str = localITestResult.getAttribute("reportDir").toString() + Directory.SEP + Directory.IMGDIRName;
	//		screenShotNumber = (Reporter.getOutput(Reporter.getCurrentTestResult()).size() + 1) + "";
	//		File localFile1 = new File(str + Directory.SEP + screenShotNumber + ".PNG");
	//		try {
	//			WebDriver localWebDriver;
	//			if (driver.getClass().getName().equals("org.openqa.selenium.remote.RemoteWebDriver"))
	//				localWebDriver = (WebDriver) new Augmenter().augment(driver);
	//			else
	//				localWebDriver = driver;
	//			if (localWebDriver instanceof TakesScreenshot) {
	//				File localFile2 = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//				BufferedImage localBufferedImage1 = ImageIO.read(localFile2);
	//				Point localPoint = paramWebElement.getLocation();
	//				int i = paramWebElement.getSize().getWidth();
	//				int j = paramWebElement.getSize().getHeight();
	//				BufferedImage localBufferedImage2 = localBufferedImage1.getSubimage(localPoint.getX(),
	//						localPoint.getY(), i, j);
	//				ImageIO.write(localBufferedImage2, "PNG", localFile1);
	//			} else {
	//				screenShotNumber = null;
	//			}
	//		} catch (Exception localException) {
	//			screenShotNumber = null;
	//		}
	//	}
	//
	//	@Deprecated
	//	public void add(WebDriver driver,String paramString,LogAs paramLogAs, boolean paramBoolean,String object) {
	//		if (paramBoolean)
	//			takeScreenShot(driver,object);
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString);
	//		localSteps.setInputValue("");
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue("");
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		buildReportData(localSteps);
	//		localSteps.setStatus("PASS");
	//	}
	//
	//	public void add(String paramString,LogAs paramLogAs, boolean paramBoolean,String value,double time) {
	//		//if (paramBoolean)
	//		//takeScreenShot(driver,object);
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString);
	//		localSteps.setInputValue("");
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue(value);
	//		localSteps.setTime(""+time);
	//		localSteps.setLineNum("");
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		buildReportData(localSteps);
	//	}
	//	@Deprecated
	//	public  void add1(WebDriver driver,String paramString,LogAs paramLogAs, boolean paramBoolean,String object) {
	//		if (paramBoolean)
	//			takeScreenShot1(driver,object);
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString);
	//		localSteps.setInputValue("");
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue("");
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		buildReportData(localSteps);
	//		localSteps.setStatus("FAIL");
	//	}
	//	public  void add1(String paramString,LogAs paramLogAs, boolean paramBoolean,String object) {
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString);
	//		localSteps.setInputValue("");
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue(object);
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		buildReportData(localSteps);
	//	}
	//
	//	@Deprecated
	//	public  void add(WebDriver driver,String paramString1, String paramString2, boolean paramBoolean,String object) {
	//		if (paramBoolean)
	//			takeScreenShot(driver,object);
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString1);
	//		localSteps.setInputValue(paramString2);
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue("");
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(LogAs.PASSED);
	//		localSteps.setStatus("PASS");
	//
	//		buildReportData(localSteps);
	//	}
	//
	//	@Deprecated
	//	public  void addfps(WebDriver driver,String paramString1, String paramString2, boolean paramBoolean,String object) {
	//		if (paramBoolean)
	//			takeScreenShot(driver,object);
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString1);
	//		localSteps.setInputValue("");
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue(paramString2);
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(LogAs.PASSED);
	//		localSteps.setStatus("PASS");
	//
	//		buildReportData(localSteps);
	//	}
	//
	//	@Deprecated
	//	public  void add2(WebDriver driver,String Status,String paramString1, String paramString2, boolean paramBoolean,LogAs paramLogAs) {
	//		if (paramBoolean)
	//			takeScreenShot(driver,"");
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString1);
	//		localSteps.setInputValue(paramString2);
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue("");
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		localSteps.setStatus(Status);
	//		buildReportData(localSteps);
	//	}
	//
	//	@Deprecated
	//	public  void add3(WebDriver driver,String paramString1, String paramString2,String paramstring3, boolean paramBoolean,LogAs paramLogAs) {
	//		if (paramBoolean)
	//			takeScreenShot(driver,"");
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString1);
	//		localSteps.setInputValue(paramString2);
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue(paramstring3);
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(paramLogAs);
	//		buildReportData(localSteps);
	//	}
	//	@Deprecated
	//	public  void add1(WebDriver driver,String paramString1, String paramString2, boolean paramBoolean,String object) {
	//		if (paramBoolean)
	//			takeScreenShot1(driver,object);
	//		Steps localSteps = new Steps();
	//		localSteps.setDescription(paramString1);
	//		localSteps.setInputValue(paramString2);
	//		localSteps.setExpectedValue("");
	//		localSteps.setActualValue("");
	//		localSteps.setTime(getExecutionTime());
	//		localSteps.setLineNum(getLineNumDesc());
	//		localSteps.setScreenShot(screenShotNumber);
	//		localSteps.setLogAs(LogAs.FAILED);
	//		localSteps.setStatus("FAIL");
	//		buildReportData(localSteps);
	//	}
	//
	//	private  void takeScreenShot(WebDriver driver, String object) {
	//
	//		if (driver == null) {
	//			screenShotNumber = null;
	//			return;
	//		}
	//		if(Directory.TestPassScreenshot==false)
	//		{
	//			return;
	//		}
	//		screenShot(driver,object);
	//	}
	//	private  void takeScreenShot1(WebDriver driver,String object) {
	//		if (driver == null) {
	//			screenShotNumber = null;
	//			return;
	//		}
	//		//		if(Directory.takeScreenshot==false)
	//		//		{
	//		//		return;		
	//		//		}
	//
	//		screenShot(driver,object);
	//	}
	//	public void screenShot(WebDriver driver, String object)
	//	{
	//		ITestResult localITestResult = Reporter.getCurrentTestResult();
	//		String str = localITestResult.getAttribute("reportDir").toString() + Directory.SEP + Directory.IMGDIRName;
	//		//screenShotNumber = localITestResult.getName() + "_"+ object ;
	//
	//		screenShotNumber = (Reporter.getOutput(Reporter.getCurrentTestResult()).size() + 1) + "";
	//		File localFile = new File(str + Directory.SEP + screenShotNumber +".PNG");
	//		try {
	//			WebDriver localWebDriver;
	//			if (driver.getClass().getName().equals("org.openqa.selenium.remote.RemoteWebDriver"))
	//				localWebDriver =  (WebDriver) new Augmenter().augment(driver);
	//			else
	//				localWebDriver = driver;
	//			if (localWebDriver instanceof TakesScreenshot) {
	//				byte[] arrayOfByte = (byte[]) ((TakesScreenshot) localWebDriver).getScreenshotAs(OutputType.BYTES);
	//				Files.write(arrayOfByte, localFile);
	//			} else {
	//				screenShotNumber = null;
	//			}
	//		} catch (Exception localException) {
	//			screenShotNumber = null;
	//		}
	//	}	
	//	{
	//		try {
	//			lastExecutionTime = Reporter.getCurrentTestResult().getStartMillis();
	//		} catch (Exception localException) {
	//		}
	//	}

	// Extent Report

	public static ExtentReports reportsetup() throws IOException {
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy_HHmm"));

		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/Extent_Report/"+File_Name+"_"+ timeStamp + ".html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		spark.loadXMLConfig(new File("test.xml"));
		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("JAVA", System.getProperty("java.version"));
		extent.setSystemInfo("Project Name",project_Name );
		extent.setSystemInfo("Website URL", baseURL);
		extent.setSystemInfo("Website Version",version_Name);
		extent.setSystemInfo("Bowser", Browser_Name);
		spark.viewConfigurer().viewOrder()
		.as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY, ViewName.AUTHOR });
		StartTime = System.currentTimeMillis();
		return extent;
	}
	public static ExtentReports reportsetup1() throws IOException {
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy_HHmm"));
		path=System.getProperty("user.dir") + "/Extent_mail/TestReport_" + timeStamp + ".html";
		spark1 = new ExtentSparkReporter(path);
		extent1 = new ExtentReports();
		extent1.attachReporter(spark1);
		spark1.loadXMLConfig(new File("test.xml"));
		extent1.setSystemInfo("OS", System.getProperty("os.name"));
		extent1.setSystemInfo("JAVA", System.getProperty("java.version"));
		extent1.setSystemInfo("Project Name",project_Name );
		extent1.setSystemInfo("Website URL", baseURL);
		extent1.setSystemInfo("Website Version",version_Name);
		extent1.setSystemInfo("Bowser", Browser_Name);
		spark1.viewConfigurer().viewOrder().as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY, ViewName.AUTHOR });
		StartTime = System.currentTimeMillis();
		return extent1;
	}

	public static void teardown(ITestResult result, ExtentTest test) throws Throwable {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Test is failed");
			test.log(Status.FAIL, "<b><i>Test execution Failed " + "</i></b>");
			test.log(Status.FAIL, "Test execution Failed " );
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "<b><i>Test execution Skipped " + "</i></b>");
			System.out.println("Test execution Skipped");
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "<b><i>Test execution completed " + "</i></b>");
			System.out.println("Test execution completed");
		}
		extent.flush();
	}
	//	public static void teardown_01(ITestResult result,String TestName, ExtentTest test) throws Throwable {
	//		if (result.getStatus() == ITestResult.FAILURE) {
	//			System.out.println("Test is Failed");
	//			test.log(Status.FAIL, "<b><i>Test Case Failed is " + TestName + "</i><b>");
	//			test.log(Status.FAIL, "Test Execution Failed " );
	//		} else if (result.getStatus() == ITestResult.SKIP) {
	//			test.log(Status.SKIP, "<b><i>Test case Skipped is " + TestName + "</i><b>");
	//			System.out.println("Test is Skipped");
	//		} else if (result.getStatus() == ITestResult.SUCCESS) {
	//			test.log(Status.PASS, "<b><i>Test Cases is Passed " + "</i></b>");
	//			System.out.println("Test Case Passed");
	//			test.log(Status.PASS, "<b><i>Test Case Execution completed " + "</i></b>");
	//		}
	//	}
//	public static void teardown_01(ITestResult result, String TestName, ExtentTest test) throws Throwable {
//		try {
//			if (result.getStatus() == ITestResult.FAILURE) {
//				System.out.println("Test is Failed");
//				test.log(Status.FAIL, "<b><i>Test Case Failed is " + TestName + "</i><b>");
//				test.log(Status.FAIL, "Test Execution Failed ");
//			} else if (result.getStatus() == ITestResult.SKIP) {
//				test.log(Status.SKIP, "<b><i>Test case Skipped is " + TestName + "</i><b>");
//				System.out.println("Test is Skipped");
//			} else if (result.getStatus() == ITestResult.SUCCESS) {
//				test.log(Status.PASS, "<b><i>Test Cases is Passed " + "</i></b>");
//				System.out.println("Test Case Passed");
//				test.log(Status.PASS, "<b><i>Test Case Execution completed " + "</i></b>");
//			}
//		} catch (Exception e) {
//			System.out.println("Exception occurred: " + e.getMessage());
//			test.log(Status.FAIL, "Exception occurred: " + e.getMessage());
//		} 
//	}
	public static void teardown_01(ITestResult result, String TestName,
			String TestDescription, ExtentTest test, ExtentTest test1) throws Throwable {
		try {
			// Construct the HTML for the test description only
			String descriptionHtml = "<html>" + "<body style='font-family: Arial, sans-serif;'>"
					+ "<h4 style='font-weight: bold; color: #f0ad4e;'>Description:</h4>"
					+ (TestDescription != null && !TestDescription.isEmpty()
							? "<p style='font-weight: bold; color: #666; font-size: 16px;'>" + TestDescription + "</p>"
							: "<p style='font-weight: bold; color: #666; font-size: 16px;'>No Description Provided</p>")
					+ "</body>" + "</html>";

			// Set description in the report
			test.getModel().setDescription(descriptionHtml);
			test1.getModel().setDescription(descriptionHtml);

			// Log Test Result Details
			if (result.getStatus() == ITestResult.FAILURE) {
				System.out.println("Test is Failed");
				test.log(Status.FAIL, "<b><i>Test Case Failed: " + TestName + "</i></b>");
				test.log(Status.FAIL, "<b><i>Test Execution Failed</i></b>");
				test1.log(Status.FAIL, "<b><i>Test Case Failed: " + TestName + "</i></b>");
				test1.log(Status.FAIL, "<b><i>Test Execution Failed</i></b>");
			} else if (result.getStatus() == ITestResult.SKIP) {
				System.out.println("Test is Skipped");
				test.log(Status.SKIP, "<b><i>Test Case Skipped: " + TestName + "</i></b>");
				test1.log(Status.SKIP, "<b><i>Test Case Skipped: " + TestName + "</i></b>");
			} else if (result.getStatus() == ITestResult.SUCCESS) {
				System.out.println("Test Case Passed");
				test.log(Status.PASS, "<b><i>Test Case Passed</i></b>");
				test1.log(Status.PASS, "<b><i>Test Case Passed</i></b>");
				test.log(Status.PASS, "<b><i>Test Case Execution Completed</i></b>");
				test1.log(Status.PASS, "<b><i>Test Case Execution Completed</i></b>");
			}

		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
			test.log(Status.FAIL, "Exception occurred: " + e.getMessage());
		}
	}
	public static void setUpShutdownHook() {
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			try {
				if (extent != null) {
					extent.flush(); // Ensure the report is saved
				}
				if (extent1 != null) {
					extent1.flush(); // Ensure the report is saved
				}
			} catch (Exception e) {
				System.out.println("Error while flushing reports on shutdown: " + e.getMessage());
			}
		}));
	}

	public static void Aftertest(ExtentTest test, ExtentTest test1) {
		long EndTime = System.currentTimeMillis();
		double executionTime = (EndTime - StartTime) / 1000;
		test.log(Status.INFO, "Total Execution time: " + executionTime);
		test1.log(Status.INFO, "Total Execution time: " + executionTime);
		// Flush the reports at the end of the test suite
		if (extent != null) {
			extent.flush();
		}
		if (extent1 != null) {
			extent1.flush();
		}
	}
	public static String takescreenshot2(WebDriver driver, String screenshot_path) {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/Screenshots1" + screenshot_path + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return dest.getAbsolutePath();
	}

	public static String base64(WebDriver driver) {
		String scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		return scr;
	}



	public static void Extent_pass(WebDriver driver, String values, ExtentTest test, ExtentTest test1) {
		if (driver != null) {
			String aligned = "<div style='text-align: left; " + "color: green;font-weight: bold;"
					+ "font-family: Times New Roman'>" + values + "</div>";
			if(scn_Option.equalsIgnoreCase("Yes")) {
				test.pass(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
			}else {
				test.pass(aligned);
			}
		} else {
			System.out.println("driver null");
		}
		if (driver != null) {
			String aligned = "<div style='text-align: left; " + "color: green;font-weight: bold;"
					+ "font-family: Times New Roman'>" + values + "</div>";
			test1.pass(aligned);
		} else {
			System.out.println("driver null");
		}

	}
	public static void Extent_Pass(WebDriver driver, List<String> values, ExtentTest test, ExtentTest test1) {
		if (driver != null) {
			String aligned = "<div style='text-align: left; " + "color: green;font-weight: bold;"
					+ "font-family: Times New Roman'>" + values + "</div>";
			if(scn_Option.equalsIgnoreCase("Yes")) {
				test.pass(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
			}else {
				test.pass(aligned);
			}
		} else {
			System.out.println("driver null");
		}
		if (driver != null) {
			String aligned = "<div style='text-align: left; " + "color: green;font-weight: bold;"
					+ "font-family: Times New Roman'>" + values + "</div>";
			test1.pass(aligned);
		} else {
			System.out.println("driver null");
		}
	}
	public static void Extent_pass1(ExtentTest test, String values) {

		String aligned = "<div style='text-align: left; " + "color: green;font-weight: bold;"
				+ "font-family: Times New Roman'>" + values + "</div>";

		test.pass(aligned);

	}
	/*/
	 * method used to print when the text contains <,>
	 */
	public static void Extent_pass_symbol(WebDriver driver, String values, ExtentTest test, ExtentTest test1) {
		if (driver != null) {
			// Escape < and > to ensure text is displayed properly in HTML reports
			values = values.replace("<", "&lt;").replace(">", "&gt;");

			String aligned = "<div style='text-align: left; color: green;font-weight: bold; font-family: Times New Roman'>"
					+ values + "</div>";

			// Check if screenshot option is enabled
			if (scn_Option.equalsIgnoreCase("Yes")) {
				test.pass(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
			} else {
				test.pass(aligned);
			}
		} else {
			System.out.println("driver null");
		}
		// Add the same for the second ExtentTest (test1)
		if (driver != null) {
			// Escape < and > to ensure text is displayed properly in HTML reports
			values = values.replace("<", "&lt;").replace(">", "&gt;");

			String aligned = "<div style='text-align: left; color: green;font-weight: bold; font-family: Times New Roman'>"
					+ values + "</div>";

			test1.pass(aligned);
		} else {
			System.out.println("driver null");
		}
	}
	public static void Extent_fail(WebDriver driver, String values, ExtentTest test, ExtentTest test1) {
		String aligned = "<div style='text-align: " + "left; color: red;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";
		test.fail(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
		test1.fail(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
		Keywords.global.add(values);
//		if(Keywords.checkServerStatus(driver)) {
//			System.out.println("****Server is up ****");
//			Extent_cal(test,test1,"****Server is up ****");
//		}else {
//			Keywords.serverStatus = false;
//			System.out.println("****Execution stopped due to server down****");
//			Extent_cal(test,test1,"****Execution stopped due to server down****");
//		}
		Assert.fail(values);
	}
	public static void Extent_Warning(WebDriver driver, String values, ExtentTest test, ExtentTest test1) {
		String aligned = "<div style='text-align: " + "left; color: yellow;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";
		test.warning(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
		test1.warning(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
	}
	public static void Extent_FailNew(WebDriver driver, String values, ExtentTest test, ExtentTest test1) {
		String aligned = "<div style='text-align: " + "left; color: brown;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";
		test.fail(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
		test1.fail(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
		Keywords.global.add(values);
		if(Keywords.checkServerStatus(driver)) {
			System.out.println("****Server is up ****");
			Extent_cal(test,test1,"****Server is up ****");
		}else {
			Keywords.serverStatus = false;
			System.out.println("****Execution stopped due to server down****");
			Extent_cal(test,test1,"****Execution stopped due to server down****");
		}
		Assert.fail(values);
	}
	public static void extent_fail(WebDriver driver, String values, ExtentTest test, ExtentTest test1) {
		String aligned = "<div style='text-align: " + "left; color: red;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";
		test.fail(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
		test1.fail(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());
		Keywords.global.add(values);
		Assert.fail(values);
	}

	public static void Extent_fail1(ExtentTest test, String values) {
		String aligned = "<div style='text-align: " + "left; color: red;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";
		test.fail(aligned);

	}

	public static void Extent_fail2(ExtentTest test, String values) {
		String aligned = "<div style='text-align: " + "left; color: red;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";


		test.fail(aligned);

	}

	public static void Extent_fail3(ExtentTest test, String category, String Stow_number, List<String> stowageValues) {
		StringBuilder valuesWithLinks = new StringBuilder();

		for (String stowageValue : stowageValues) {
			String link = "<a href='" + generateStowageValueLink1( stowageValue) + "'>" + Stow_number + "</a>";
			valuesWithLinks.append(link).append(", ");
		}

		// Remove the trailing comma and space
		if (valuesWithLinks.length() > 0) {
			valuesWithLinks.setLength(valuesWithLinks.length() - 2);
		}

		String aligned = "<div style='text-align: left; color: red; font-weight: bold; font-family: Times New Roman'>"
				+ category + " - Failed Stowage Values for Stow_number " + Stow_number + ": " + valuesWithLinks + "</div>";

		test.fail(aligned);
	}

	//	private static String generateStowageValueLink(String stowNumber) {
	//		String fileUrl = "file:///D:/solver/Solver_Minds/Extent/TestReport_" + stowNumber + ".html";
	//		return fileUrl + "#failedStowNumber_" + stowNumber;
	//	}
	public static void Extent_Start( String values,ExtentTest test,ExtentTest test1) {
		String aligned = "<div style='text-align: " + "centre ;color: orange;font-weight: bold;"
				+ "font-family: Times New Roman'>"+"-----------------"+values +" - Start -----------------"+"</div>";
		test.info(aligned);
		test1.info(aligned);
		System.out.println("-----------------"+values +" - Start -----------------");
	}

	public static void Extent_completed(String values,ExtentTest test,ExtentTest test1) {
		String aligned = "<div style='text-align: " + "centre ;color: orange;font-weight: bold;"
				+ "font-family: Times New Roman'>"+"-----------------"+values +" - Completed -----------------"+"</div>";
		test.info(aligned);
		test1.info(aligned);
		System.out.println("-----------------"+values +" - Completed -----------------");
	}

	public static void Step_Start(int stepNo,String values,ExtentTest test,ExtentTest test1) {
		String aligned = "<div style='text-align: " + "centre ;color: Blue;font-weight: bold;"
				+ "font-family: Times New Roman'>" +"***Start->Step-"+stepNo+" : "+values+"***"+"</div>";
		test.info(aligned);
		test1.info(aligned);
		System.out.println("***Start->Step-"+stepNo+" : "+values+"***");
	}

	public static void Step_End(int stepNo,String values,ExtentTest test,ExtentTest test1) {
		String aligned = "<div style='text-align: " + "centre ;color: Blue;font-weight: bold;"
				+ "font-family: Times New Roman'>" +"***End->Step-"+stepNo+" : "+values+"***"+"</div>";
		test.info(aligned);
		test1.info(aligned);
		System.out.println("***End->Step-"+stepNo+" : "+values+"***");
	}


	public static void Extent_call(ExtentTest test,ExtentTest test1, String values) {
		String aligned = "<div style='text-align: " + "centre ;color: Indigo;font-weight: bold;"
				+ "font-family: Italic Bold (serif)'>"+"-------------------------" + values +"-------------------------"+ "</div>";
		test.info(aligned);
		test1.info(aligned);
		System.out.println(values);
	}



	private static String generateStowageValueLink1( String StowNumber) {
		// Customize the link URL based on your requirements
		// You can use the category, Stow_number, and stowageValue to create a unique link for each value
		return "#"+StowNumber;
	}



	public static void Extent_cal(ExtentTest test,ExtentTest test1, String values) {

		String aligned = "<div style='text-align: " + "centre ;color: orange;font-weight: bold;"
				+ "font-family: Times New Roman'>" + values + "</div>";

		test.info(aligned);
		test1.info(aligned);

	}

	public static void Extent_final(WebDriver driver, String values) {
		String aligned = "<div style='text-align: " + "left; color: blue;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";

		test.info(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());

	}

	public static void Info(String values) {
		String aligned = "<div style='text-align: " + "left; color: blue;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";

		test.info(aligned);

	}	


	public static void Extent_table_pass2(ExtentTest test, String StowNumber, String Html_ISO, String Html_Weight, String Html_POL, String Html_POD, String Html_Mty, String Html_IsSpl, String Html_IsCOD, String Html_Rfr, String Html_OOG, String Html_DG, String Html_mulHaz, String Html_DGclass, String Html_UNNO, String Html_OOH, String Html_OLF, String Html_OLA, String Html_OWP, String Html_OWS, String Html_BookingNo, String Html_Variant, String Html_FlashPoint, String Html_DGLQ) {

		String tableopen = "<table border=\"1\"; width= 110%;><tr><th>";
		String thead = "</th><th>";
		String header1 = "Stow_number";
		String header2 = "Column_Header";
		String header3 = "Master_Value";
		String header4 = "Test_Value";
		String header5 = "Status";

		String rowclose = "</th></tr>";

		//		String nextrow = "<tr><th>";
		String nextrow1 = "<tr>";
		String rowclose1 = "</tr>";

		// Create a unique identifier for the failed Stow_number
		String anchorIdentifier =  StowNumber;

		String spanrow = "<th rowspan=\"22\"><h1 id='" + anchorIdentifier + "'></h1>" + StowNumber + "</th>";
		//		String value1 = StowNumber;
		String tableclose = "</table>";

		String finalstr1 = tableopen + header1 + thead + header2 + thead + header3 + thead + header4 + thead + header5 + rowclose + nextrow1;
		String finalstr2 = spanrow + Html_ISO + rowclose1 + nextrow1;
		String finalstr3 = Html_Weight + rowclose1 + nextrow1;
		String finalstr4 = Html_POL + rowclose1 + nextrow1;
		String finalstr5 = Html_POD + rowclose1 + nextrow1;
		String finalstr6 = Html_Mty + rowclose1 + nextrow1;
		String finalstr7 = Html_IsSpl + rowclose1 + nextrow1;
		String finalstr8 = Html_IsCOD + rowclose1 + nextrow1;
		String finalstr9 = Html_Rfr + rowclose1 + nextrow1;
		String finalstr10 = Html_OOG + rowclose1 + nextrow1;
		String finalstr11 = Html_DG + rowclose1 + nextrow1;
		String finalstr12 = Html_mulHaz + rowclose1 + nextrow1;
		String finalstr13 = Html_DGclass + rowclose1 + nextrow1;
		String finalstr14 = Html_UNNO + rowclose1 + nextrow1;
		String finalstr15 = Html_OOH + rowclose1 + nextrow1;
		String finalstr16 = Html_OLF + rowclose1 + nextrow1;
		String finalstr17 = Html_OLA + rowclose1 + nextrow1;
		String finalstr18 = Html_OWP + rowclose1 + nextrow1;
		String finalstr19 = Html_OWS + rowclose1 + nextrow1;
		String finalstr20 = Html_BookingNo + rowclose1 + nextrow1;
		String finalstr21 = Html_Variant + rowclose1 + nextrow1;
		String finalstr22 = Html_FlashPoint + rowclose1 + nextrow1;
		String finalstr23 = Html_DGLQ + rowclose1 + tableclose;

		String finalstr = finalstr1 + finalstr2 + finalstr3 + finalstr4 + finalstr5 + finalstr6 + finalstr7 + finalstr8 + finalstr9 + finalstr10 + finalstr11 + finalstr12 + finalstr13 + finalstr14 + finalstr15 + finalstr16 + finalstr17 + finalstr18 + finalstr19 + finalstr20 + finalstr21 + finalstr22 + finalstr23;

		if (finalstr.contains("Fail")) {
			String aligned = "<div style='text-align: " + "left; color: red;font-weight: bold;font-family: "
					+ "Times New Roman'>" + finalstr + "</div>";
			test.fail(aligned);
		} else {
			String aligned = "<div style='text-align: " + "left; color: green;font-weight: bold;font-family: "
					+ "Times New Roman'>" + finalstr + "</div>";
			test.pass(aligned);
		}
	}


	public static void Extent_group_table(ExtentTest test, String stow, String grp,String colhead, String master, String act) {

		String tableopen = "<table border=\"1\" width=\"110%\"><tr><th>";

		String thead = "</th><th>";
		String header1 = "Stow_number";
		String header2 = "Group_name";
		String header3 = "Column_Header";
		String header4 = "Master_Value";
		String header5 = "Test_Value";

		String rowclose = "</th></tr>";

		String nextrow = "<tr><th>";
		//		String nextrow1 = "<tr>";
		String rowclose1 = "</th></tr>";

		String tableclose = "</table>";

		String finalstr1 = tableopen + header1 + thead + header2 + thead + header3 + thead + header4 + thead + header5 + rowclose + nextrow;
		String finalstr2 =  stow + thead + grp + thead + colhead + thead + master + thead + act + rowclose1 + tableclose;

		String finalstr = finalstr1 + finalstr2;

		String aligned = "<div style='text-align: left; color: red; font-weight: bold; font-family: Times New Roman'>" + finalstr + "</div>";
		test.fail(aligned);
	}


	public static void Extent_group_table1(ExtentTest test, String stow, String colhead, String master, String act) {

		String tableopen = "<table border=\"1\" width=\"110%\"><tr><th>";

		String thead = "</th><th>";
		String header1 = "TankDetails";
		String header3 = "Column name";
		String header4 = "Master_Value";
		String header5 = "Test_Value";

		String rowclose = "</th></tr>";

		String nextrow = "<tr><th>";
		//		String nextrow1 = "<tr>";
		String rowclose1 = "</th></tr>";

		String tableclose = "</table>";

		String finalstr1 = tableopen + header1 + thead + header3 + thead + header4 + thead + header5 + rowclose + nextrow;
		String finalstr2 =  stow + thead +  colhead + thead + master + thead + act + rowclose1 + tableclose;

		String finalstr = finalstr1 + finalstr2;

		String aligned = "<div style='text-align: left; color: red; font-weight: bold; font-family: Times New Roman'>" + finalstr + "</div>";
		test.fail(aligned);
	}


	public static void Extent_table_fail(ExtentTest test, String MasterSno, String TestSno, String StowNumber, String MasterISO, String TestISO, String ExpectedWeight, String TestWeight, String MasterPOL, String TestPOL, String MasterPOD, String TestPOD, String MasterMty, String TestMty, String MasterIsSpl, String TestIsSpl, String MasterRfr, String TestRfr, String MasterOOG, String TestOOG, String MasterDG, String TestDG, String MasterMulHaz, String TestMulHaz, String MasterDGClass, String TestDGClass, String MasterUNNO, String TestUNNO, String MasterOOH, String TestOOH, String MasterOLF, String TestOLF, String MasterOLA, String TestOLA, String MasterOWP, String MasterOWS, String TestOWS, String MasterBookingNo, String TestBookingNo, String MasterVariant, String TestVariant, String MasterFlashPoint, String TestFlashPoint, String MasterDGLQ, String TestDGLQ) {

		String aligned = "<table><tr><th>Status</th><th>Master S.no</th><th>Test S.no</th><th>Stow number</th><th>Master ISO</th><th>Test ISO</th><th>Expected Weight(t)</th><th>Test Weight(t)</th><th>Master POL</th><th>Test POL</th><th>Master POD</th><th>Test POD</th><th>Master Mty</th><th>Test Mty</th><th>Master IsSpl</th><th>Test IsSpl</th><th>Master Rfr</th><th>Test Rfr</th><th>Master OOG</th><th>Test OOG</th><th>Master DG</th><th>Test DG</th><th>Master mul Haz</th><th>Test mul Haz</th><th>Master DG class</th><th>Test DG class</th><th>Master UNNO</th><th>Test UNNO</th><th>Master OOH (m)</th><th>Test OOH(m)</th><th>Master OLF(m)</th><th>Test OLF(m)</th><th>Master OLA (m)</th><th>Test OLA (m)</th><th>Master OWP (m)</th><th>Master OWS (m)</th><th>Test OWS (m)</th><th>Master Booking No</th><th>Test Booking No</th><th>Master Variant</th><th>Test Variant</th><th>Master FlashPoint</th><th>Test FlashPoint</th><th>Master DGLQ</th><th>Test DGLQ</th></tr>" +
				"<tr><th>Not Matched</th><th>" + MasterSno + "</th><th>" + TestSno + "</th><th>" + StowNumber + "</th><th>" + MasterISO + "</th><th>" + TestISO + "</th><th>" + ExpectedWeight + "</th><th>" + TestWeight + "</th><th>" + MasterPOL + "</th><th>" + TestPOL + "</th><th>" + MasterPOD + "</th><th>" + TestPOD + "</th><th>" + MasterMty + "</th><th>" + TestMty + "</th><th>" + MasterIsSpl + "</th><th>" + TestIsSpl + "</th><th>" + MasterRfr + "</th><th>" + TestRfr + "</th><th>" + MasterOOG + "</th><th>" + TestOOG + "</th><th>" + MasterDG + "</th><th>" + TestDG + "</th><th>" + MasterMulHaz + "</th><th>" + TestMulHaz + "</th><th>" + MasterDGClass + "</th><th>" + TestDGClass + "</th><th>" + MasterUNNO + "</th><th>" + TestUNNO + "</th><th>" + MasterOOH + "</th><th>" + TestOOH + "</th><th>" + MasterOLF + "</th><th>" + TestOLF + "</th><th>" + MasterOLA + "</th><th>" + TestOLA + "</th><th>" + MasterOWP + "</th><th>" + MasterOWS + "</th><th>" + TestOWS + "</th><th>" + MasterBookingNo + "</th><th>" + TestBookingNo + "</th><th>" + MasterVariant + "</th><th>" + TestVariant + "</th><th>" + MasterFlashPoint + "</th><th>" + TestFlashPoint + "</th><th>" + MasterDGLQ + "</th><th>" + TestDGLQ + "</th></tr>";

		test.fail(aligned);
	}





	public static void Aftertest1(ExtentTest test) {

		long EndTime = System.currentTimeMillis();
		double executionTime = (EndTime - StartTime) / 1000;
		test.log(Status.INFO, "Total Execution time: " + executionTime);
		extent1.flush();
	}




	public static void Extent_final1(WebDriver driver, String values) {
		String aligned = "<div style='text-align: " + "left; color: blue;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";

		test1.info(aligned, MediaEntityBuilder.createScreenCaptureFromBase64String(base64(driver)).build());

	}

	public static void Info1(String values) {
		String aligned = "<div style='text-align: " + "left; color: blue;font-weight: bold;font-family: "
				+ "Times New Roman'>" + values + "</div>";

		test1.info(aligned);

	}	


	public static void Extent_fail4(ExtentTest test, String category, List<String> stowageValues) {
		StringBuilder valuesWithLinks = new StringBuilder();

		for (String stowageValue : stowageValues) {
			String link = "<a href='" + generateStowageValueLink1( stowageValue) + "'>" + stowageValue + "</a>";
			valuesWithLinks.append(link).append(", ");
		}

		// Remove the trailing comma and space
		if (valuesWithLinks.length() > 0) {
			valuesWithLinks.setLength(valuesWithLinks.length() - 2);
		}

		String aligned = "<div style='text-align: left; color: red; font-weight: bold; font-family: Times New Roman'>"
				+ category + " Group False Stowage Number List : "+ valuesWithLinks + "</div>";

		test.fail(aligned);
	}

	public static void Extent_NA1(ExtentTest test, String category, List<String> stowageValues) {
		StringBuilder valuesWithLinks = new StringBuilder();

		for (String stowageValue : stowageValues) {
			String link = "<a href='" + generateStowageValueLink1( stowageValue) + "'>" + stowageValue + "</a>";
			valuesWithLinks.append(link).append(", ");
		}

		// Remove the trailing comma and space
		if (valuesWithLinks.length() > 0) {
			valuesWithLinks.setLength(valuesWithLinks.length() - 2);
		}

		String aligned = "<div style='text-align: left; color: brown; font-weight: bold; font-family: Times New Roman'>"
				+ category +" Group NA Stowage Number List : " + valuesWithLinks + "</div>";

		test.fail(aligned);
	}

	public static void Extent_passLink(ExtentTest test, String values,String path) {

		String aligned="<a href='file:///"+path+"'  target='_blank'>"+values+"</a>";
		test.pass(aligned);

	}



}