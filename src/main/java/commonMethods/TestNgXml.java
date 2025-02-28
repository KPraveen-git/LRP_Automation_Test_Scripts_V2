package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

	
public class TestNgXml {
	static String testCase_ID_Header = Utils.getDataFromTestConfig("Test_Case_ID_Header");
	static String url_Header = Utils.getDataFromTestConfig("Url_Header");
	static String DataSets_Header = Utils.getDataFromTestConfig("DataSet_Header");
	static String filepath_Header = Utils.getDataFromTestConfig("Excel_FileName_Header");
	static String Sheet_Names_Header = Utils.getDataFromTestConfig("Excel_Sheet_Names_Header");
	static String flag_Options_Header = Utils.getDataFromTestConfig("Flag_Option_Header");
	static String testNG_xml_With_Script_Name_Option = Utils.getDataFromTestConfig("testNG_xml_With_Script_Name");
	
	public static String testExecutionFile=System.getProperty("user.dir") +Utils.getDataFromTestConfig("TestExeFile");
	public static String testExecutionSheetName=Utils.getDataFromTestConfig("TestExeFileSheetName");
	Utils util =new Utils();
	
	
	public void testNgXmlSuite() {
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		List<XmlClass> classes = new ArrayList<XmlClass>();
//		List<Class> listenerClasses = new ArrayList<Class>();
		XmlSuite suite = new XmlSuite();
		suite.setName("ProgramSuite");		XmlTest test = new XmlTest(suite);
		test.setName("ProgramTest");
//		List<String> classNames = extractExcelContentByColumnIndex(2);
//		List<String> testCases = extractExcelContentByColumnIndex(3);
		//for (int i = 0; i < classNames.size(); i++) 
		{
			XmlClass clss1 = new XmlClass("commonMethods.Testcases");
			classes.add(clss1);
			/*clss1.setIncludedMethods(Arrays.asList(new XmlInclude[] 
					{ 
							new XmlInclude(testCases.get(i)) 
					}));*/
		}
		//listenerClasses.add(ListenerTest.class);
		test.setXmlClasses(classes);
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		//tng.setListenerClasses(listenerClasses);
		tng.run();
	}
	//written by TD team
	static HashMap<String, String> values ;
	public static HashMap<String,String> getdatafromExecution() {
		values = new HashMap<String, String>();
		List<String> TestcaseID = extractExcelContentByColumnHeader(testCase_ID_Header);
		List<String> Environment = extractExcelContentByColumnHeader(url_Header);
		for (int k=0;k<TestcaseID.size();k++) {
			values.put(TestcaseID.get(k), Environment.get(k));
		}
		return values;
	}
	static HashMap<String, String> data_Set ;
	public static HashMap<String,String> getdataSet_fromExecution() {
		data_Set = new HashMap<String, String>();
		List<String> TestcaseID = extractExcelContentByColumnHeader(testCase_ID_Header);
		List<String> Environment = extractExcelContentByColumnHeader(DataSets_Header);
		for (int k=0;k<TestcaseID.size();k++) {
			data_Set.put(TestcaseID.get(k), Environment.get(k));
		}
		return data_Set;
	}
	static HashMap<String, String> file_Path ;
	public static HashMap<String,String> getfilePath_FromExecution() {
		file_Path = new HashMap<String, String>();
		List<String> TestcaseID = extractExcelContentByColumnHeader(testCase_ID_Header);
		List<String> Environment = extractExcelContentByColumnHeader(filepath_Header);
		for (int k=0;k<TestcaseID.size();k++) {
			file_Path.put(TestcaseID.get(k), Environment.get(k));
		}
		return file_Path;
	}

	static HashMap<String, String> sheet_Name ;
	public static HashMap<String,String> getsheetName_FromExecution() {
		sheet_Name = new HashMap<String, String>();
		List<String> TestcaseID = extractExcelContentByColumnHeader(testCase_ID_Header);
		List<String> Environment = extractExcelContentByColumnHeader(Sheet_Names_Header);
		for (int k=0;k<TestcaseID.size();k++) {
			sheet_Name.put(TestcaseID.get(k), Environment.get(k));
		}
		return sheet_Name;
	}
	static HashMap<String, String> flag ;
	public static HashMap<String,String> getFlagValue_FromExecution() {
		flag = new HashMap<String, String>();
		List<String> TestcaseID = extractExcelContentByColumnHeader(testCase_ID_Header);
		List<String> Environment = extractExcelContentByColumnHeader(flag_Options_Header);
		for (int k=0;k<TestcaseID.size();k++) {
			flag.put(TestcaseID.get(k), Environment.get(k));
		}
		return flag;
	}
//	static HashMap<String, String> values ;
//	public static HashMap<String,String> getdatafromExecution() {
//		values = new HashMap<String, String>();
//		List<String> TestcaseID = extractExcelContentByColumnIndex(4);
//		List<String> Environment = extractExcelContentByColumnIndex(6);
//		for (int k=0;k<TestcaseID.size();k++) {
//			values.put(TestcaseID.get(k), Environment.get(k));
//		}
//		return values;
//	}
//	static HashMap<String, String> data_Set ;
//	public static HashMap<String,String> getdataSet_fromExecution() {
//		data_Set = new HashMap<String, String>();
//		List<String> TestcaseID = extractExcelContentByColumnIndex(4);
//		List<String> Environment = extractExcelContentByColumnIndex(7);
//			for (int k=0;k<TestcaseID.size();k++) {
//				data_Set.put(TestcaseID.get(k), Environment.get(k));
//			}
//		return data_Set;
//	}
//	static HashMap<String, String> file_Path ;
//	public static HashMap<String,String> getfilePath_FromExecution() {
//		file_Path = new HashMap<String, String>();
//		List<String> TestcaseID = extractExcelContentByColumnIndex(4);
//		List<String> Environment = extractExcelContentByColumnIndex(8);
//			for (int k=0;k<TestcaseID.size();k++) {
//				file_Path.put(TestcaseID.get(k), Environment.get(k));
//			}
//		return file_Path;
//	}
//
//	static HashMap<String, String> sheet_Name ;
//	public static HashMap<String,String> getsheetName_FromExecution() {
//		sheet_Name = new HashMap<String, String>();
//		List<String> TestcaseID = extractExcelContentByColumnIndex(4);
//		List<String> Environment = extractExcelContentByColumnIndex(9);
//			for (int k=0;k<TestcaseID.size();k++) {
//				sheet_Name.put(TestcaseID.get(k), Environment.get(k));
//			}
//		return sheet_Name;
//	}

//	static HashMap<String, String> values1 ;
//	public static HashMap<String,String> getdatafromExecution1() {
//		values1 = new HashMap<String, String>();
//		List<String> TestcaseID = extractExcelContentByColumnIndex(4);
//		List<String> Environment = extractExcelContentByColumnIndex(7);
//		for (int k=0;k<TestcaseID.size();k++) {
//			values1.put(TestcaseID.get(k), Environment.get(k));
//		}
//		return values1;
//	}
//	static HashMap<String, String> values2 ;
//	public static HashMap<String,String> getdatafromExecution2() {
//		values2 = new HashMap<String, String>();
//		List<String> TestcaseID = extractExcelContentByColumnIndex(4);
//		List<String> Environment = extractExcelContentByColumnIndex(8);
//		for (int k=0;k<TestcaseID.size();k++) {
//			values2.put(TestcaseID.get(k), Environment.get(k));
//		}
//		return values2;
//	}

//	public static HashMap<String,String> getdatafromExecution1() {
//		values = new HashMap<String, String>();
//		List<String> TestcaseID = extractExcelContentByColumnIndex(4);
//		List<String> Vessel = extractExcelContentByColumnIndex(7);
//		for (int k=0;k<TestcaseID.size();k++) {
//			values.put(TestcaseID.get(k), Vessel.get(k));
//		}
//		return values;
//	}
	
//	static HashMap<String, String> flagvalues ;
//	public static HashMap<String,String> getFlagValueFromExecution() {
//		flagvalues = new HashMap<String, String>();
//		List<String> TestcaseID = extractExcelContentByColumnIndex(4);
//		List<String> flagValue = extractExcelContentByColumnIndex(7);
//		for (int k=0;k<TestcaseID.size();k++) {
//			flagvalues.put(TestcaseID.get(k), flagValue.get(k));
//		}
//		return flagvalues;
//	}
	
	public static void main(String args[]) throws MalformedURLException {
	/*	{
			  System.setProperty("atu.reporter.config","D:\\connaizen\\TDD\\atu.properties");
		}*/
		if(testNG_xml_With_Script_Name_Option.equalsIgnoreCase("Yes")) {
		execution();
		}else {
		generateUpdatedXml();
		}
		/*
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();

		// Add xml file which you have to execute
		suitefiles.add("D:\\connaizen\\TDD\\config\\testng.xml");

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();*/
	}
	public static ArrayList<String> extractExcelContentByColumnIndex(int columnIndex) {
		ArrayList<String> columndata = null;
		try {
			File f = new File(testExecutionFile);
			FileInputStream ios = new FileInputStream(f);
			XSSFWorkbook workbook = new XSSFWorkbook(ios);
			XSSFSheet sheet = workbook.getSheet(testExecutionSheetName);
			Iterator<Row> rowIterator = sheet.iterator();
			columndata = new ArrayList<String>();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if (row.getRowNum() > 0) { 
						if (cell.getColumnIndex() == columnIndex) {
							switch (cell.getCellType()) {
							case Cell.CELL_TYPE_NUMERIC:
								columndata.add(cell.getNumericCellValue() + "");
								break;
							case Cell.CELL_TYPE_STRING:
								columndata.add(cell.getStringCellValue());
								break;
							}
						}
					}
				}
			}
			ios.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return columndata;
	}
	public static ArrayList<String> extractExcelContentByColumnHeader(String columnHeader) {
	    ArrayList<String> columnData = null;
	    try {
	        File f = new File(testExecutionFile);
	        FileInputStream ios = new FileInputStream(f);
	        XSSFWorkbook workbook = new XSSFWorkbook(ios);
	        XSSFSheet sheet = workbook.getSheet(testExecutionSheetName);
	        Iterator<Row> rowIterator = sheet.iterator();
	        
	        columnData = new ArrayList<String>();
	        int columnIndex = -1; // To store the column index based on the header

	        // Read the first row (header row) to get the column index
	        if (rowIterator.hasNext()) {
	            Row headerRow = rowIterator.next();
	            Iterator<Cell> cellIterator = headerRow.cellIterator();
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
	                    if (cell.getStringCellValue().equalsIgnoreCase(columnHeader)) {
	                        columnIndex = cell.getColumnIndex();
	                        break;
	                    }
	                }
	            }
	        }

	        // If columnIndex is still -1, the column header was not found
	        if (columnIndex == -1) {
	            System.out.println("Column header not found: " + columnHeader);
	            return columnData; // Return empty list or handle error as needed
	        }

	        // Now read data from the identified column
	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();
	            Cell cell = row.getCell(columnIndex);
	            if (cell != null) {
	                if (row.getRowNum() > 0) { // Skip header row
	                    switch (cell.getCellType()) {
	                        case Cell.CELL_TYPE_NUMERIC:
	                            columnData.add(cell.getNumericCellValue() + "");
	                            break;
	                        case Cell.CELL_TYPE_STRING:
	                            columnData.add(cell.getStringCellValue());
	                            break;
	                    }
	                }
	            }
	        }
	        
	        ios.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return columnData;
	}
	public static void execution() {
		 try {
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.newDocument();
	         // root element
	         Element rootElement = doc.createElement("suite");
	         doc.appendChild(rootElement);
	         
	         Attr suiteattr1 = doc.createAttribute("configfailurepolicy");
	         suiteattr1.setValue("continue");
	         rootElement.setAttributeNode(suiteattr1);
	         
	         Attr suiteattr2 = doc.createAttribute("name");
	         suiteattr2.setValue("Suite");
	         rootElement.setAttributeNode(suiteattr2);
	         
	         Attr suiteattr3 = doc.createAttribute("parallel"); 
	         suiteattr3.setValue("none");
	         rootElement.setAttributeNode(suiteattr3);
	         
	         Element test = doc.createElement("test");
	         rootElement.appendChild(test);
	         
	         Attr testattr1 = doc.createAttribute("name");
	         testattr1.setValue("Test");
	         test.setAttributeNode(testattr1);
	         
	         Attr testattr2 = doc.createAttribute("preserve-order");
	         testattr2.setValue("true");
	         test.setAttributeNode(testattr2);
	         
	         if(Utils.getDataFromTestConfig("Execution Type").equalsIgnoreCase("parallel")) {

	         Attr testattr3 = doc.createAttribute("parallel");
	         testattr3.setValue("methods");
	         test.setAttributeNode(testattr3);
	         
	         Attr testattr4 = doc.createAttribute("thread-count");
	         testattr4.setValue(Utils.getDataFromTestConfig("ParallelTests").replace(".0",""));
	         test.setAttributeNode(testattr4);
	         
	         };
	         
	         Element classes = doc.createElement("classes");
	         test.appendChild(classes);
	         
	         Element class1 = doc.createElement("class");
	         classes.appendChild(class1);
	         
	         Attr classattr1 = doc.createAttribute("name");
	         classattr1.setValue("commonMethods.Testcases");
	         class1.setAttributeNode(classattr1);
	         
	         Element methods = doc.createElement("methods");
	         test.appendChild(methods);
	     	List<String> testCases = extractExcelContentByColumnHeader(testCase_ID_Header);
			List<String> flag = extractExcelContentByColumnHeader(flag_Options_Header);
	    	
	         for(int i=1;i<=testCases.size();i++)
	         {
	        	 String testcasename=testCases.get(i-1);
	        	 String flag1=flag.get(i-1);
	        	 if(flag1.equalsIgnoreCase("Yes"))
	        	 {
	         Element include = doc.createElement("include");
	         methods.appendChild(include);
	         
	         Attr includeattri= doc.createAttribute("name");
	         includeattri.setValue(testcasename);
	         include.setAttributeNode(includeattri);
	         
	         Attr priority= doc.createAttribute("priority");
	         String integer = Integer.toString(i);
	         priority.setValue(integer);
	         include.setAttributeNode(priority);
	        	 }
	         }
	         
	         Element listeners = doc.createElement("listeners");
	         rootElement.appendChild(listeners);
	         String noListeners[] = {};
	         String mailListener[] = {"Mail.CustomTestListener"};

	         String triggerValue = Utils.getDataFromTestConfig("Trigger");
	         String[] listenersToAdd = triggerValue.equalsIgnoreCase("No") ? noListeners : mailListener;

	         for (String listenerClass : listenersToAdd) {
	             Element listener = doc.createElement("listener");
	             listeners.appendChild(listener);
	             listener.setAttribute("class-name", listenerClass);
	         }
	         // write the content into xml file
	         TransformerFactory transformerFactory =TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	         DOMSource source = new DOMSource(doc);
	         StreamResult result =new StreamResult(new File(System.getProperty("user.dir")+"\\testng.xml"));
	         transformer.transform(source, result);
	         // Output to console for testing
	         StreamResult consoleResult =
	         new StreamResult(System.out); 
	         transformer.transform(source, consoleResult);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	public static void generateUpdatedXml() {
	    try {
	        // Initialize the DocumentBuilder
	        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	        Document doc = dBuilder.newDocument();

	        // Root element
	        Element rootElement = doc.createElement("suite");
	        doc.appendChild(rootElement);

	        // Add suite attributes
	        rootElement.setAttribute("configfailurepolicy", "continue");
	        rootElement.setAttribute("name", "Suite");
	        rootElement.setAttribute("parallel", "none");

	        // Add test element
	        Element test = doc.createElement("test");
	        rootElement.appendChild(test);

	        // Add test attributes
	        test.setAttribute("name", "Test");
	        test.setAttribute("preserve-order", "true");

	        // Add classes element
	        Element classes = doc.createElement("classes");
	        test.appendChild(classes);

	        Element classElement = doc.createElement("class");
	        classes.appendChild(classElement);

	        // Add class attributes
	        classElement.setAttribute("name", "commonMethods.Testcases");

	        // Add listeners element
	        Element listeners = doc.createElement("listeners");
	        rootElement.appendChild(listeners);

	        // Add TestMethodFilter listener
	        Element testMethodFilterListener = doc.createElement("listener");
	        testMethodFilterListener.setAttribute("class-name", "commonMethods.TestMethodFilter");
	        listeners.appendChild(testMethodFilterListener);

	        // Add Mail.CustomTestListener if Trigger is not "No"
	        String triggerValue = Utils.getDataFromTestConfig("Trigger");
	        if (!triggerValue.equalsIgnoreCase("No")) {
	            Element mailListener = doc.createElement("listener");
	            mailListener.setAttribute("class-name", "Mail.CustomTestListener");
	            listeners.appendChild(mailListener);
	        }

	        // Write the content into the XML file
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();

	        DOMSource source = new DOMSource(doc);
	        StreamResult result = new StreamResult(new File(System.getProperty("user.dir") + "\\testng.xml"));
	        transformer.transform(source, result);

	        // Output to console for testing
	        StreamResult consoleResult = new StreamResult(System.out);
	        transformer.transform(source, consoleResult);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
	
}