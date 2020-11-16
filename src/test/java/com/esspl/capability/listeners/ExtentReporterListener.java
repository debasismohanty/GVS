package com.esspl.capability.listeners;
//package Academy;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Properties;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//import resources.base;
//
//public class ExtentReporterListener{
//	
//	public static Properties cnfgProp;
//	public static ExtentHtmlReporter report = null;
//	public static ExtentReports extent = null;
//	public static ExtentTest test = null;
//	
//	@BeforeTest
//	public static ExtentReports SetUp() {
//		
//		String reportLocation = cnfgProp.getProperty("ExtentreportPath")+"/extentReport.html";
//		report = new ExtentHtmlReporter(reportLocation);
//		//ExtentHtmlReporter reporter = new ExtentHtmlReporter(cnfgProp.getProperty("reportPath")+"/extentReport.html");
//		report.config().setDocumentTitle("Automation Test Report");
//		report.config().setReportName("Automation Test Report");
//		report.config().setTheme(Theme.STANDARD);
//		report.start();
//		
//		extent = new ExtentReports();
//		extent.setSystemInfo("Environment",cnfgProp.getProperty("environment"));
//		extent.setSystemInfo("OS Name",System.getProperty("os.name"));
//		extent.setSystemInfo("User Name",System.getProperty("user.name"));
//		extent.setSystemInfo("Application",cnfgProp.getProperty("application"));
//		extent.attachReporter(report);
//		return extent;
//	}
//	
//	public static void addCucumberTest(String testNames) {
//		//logInfo = extent.createTest(testNames);
//	}
//	
//	@AfterTest
//	public void FlushCucumberTest() {
//		extent.flush();
//				
//	}
//	
//	public static void testStepHandle(String testStatus,WebDriver driver,ExtentTest extenttest,Throwable throwble) throws IOException {//
//		switch(testStatus) {
//		case "FAIL" :
//			extenttest.fail(MarkupHelper.createLabel("Test Case is failed :", ExtentColor.RED));
//			extenttest.error(throwble.fillInStackTrace());
//			try {
//				extenttest.addScreenCaptureFromPath(captureScreenshot(driver));
//			}catch(Exception e) {
//				//e.getMessage();
//				e.printStackTrace();
//			}
//			if(driver != null) {
//				driver.quit();
//			}
//			break;
//			
//		case "PASS" :
//			extenttest.pass(MarkupHelper.createLabel("Test Case is passed :", ExtentColor.GREEN));
//			//extenttest.addScreenCaptureFromPath(captureScreenshot(driver));
//			break;
//			
//		default :
//			break;
//		}
//	}
////	
//	public static String captureScreenshot(WebDriver driver) throws IOException {
//		String dateTime = new SimpleDateFormat("MMddyyyyHHmmss").format(new Date());
//		TakesScreenshot screen = (TakesScreenshot) driver;
//		File src = screen.getScreenshotAs(OutputType.FILE);
//		String destinatino = "D:\\LNSAutomation\\essRepo-master\\coreUI\\Screenshots"+currentdateandtime()+".png";
//		//System.getProperty("user.dir")+"\\Reports\\"+currentdateandtime()+".png";
//		//cnfgProp.getProperty("reportPath")+"/extentReport.html";
//		File targte = new File(destinatino);
//		System.out.println(destinatino);
//		System.out.println("--------------------destntn-----------------");
//		FileUtils.copyFile(src, targte);
//		return destinatino;
//		
//	}
//	
//	private static String currentdateandtime() {
//		String str = null;
//		try {
//			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
//			Date date = new Date();
//			str = dateFormat.format(date);
//			str = str.replace(" ","").replaceAll("/","").replaceAll(":","");
//			
//		}catch(Exception e) {
//			e.getMessage();
//		}
//		
//		return str;
//	}
//	
//	
//
//
//}
//
//
//
