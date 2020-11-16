package com.esspl.capability.resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.esspl.capability.pageObjects.GvsHome01;
import com.esspl.capability.pageObjects.GvsHome02;
import com.esspl.capability.pageObjects.GvsHome07;
import com.esspl.capability.utilities.CommonUtilities;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

public class Base {

    public static WebDriver driver;
    public Properties prop;
    public static Logger log = LogManager.getLogger(Base.class.getName());
    
    
    public static Properties cnfgProp;
	//public static Properties OR = new Properties();
	//public static Logger logger = Logger.getLogger("coreUI");
	public static WebDriverWait wait;
	public FileInputStream fis;
	public  CommonUtilities cm;
	//public ExtentReporterListener erL;
	
	public static ExtentHtmlReporter report = null;
	public static ExtentReports extent = null;
	public static ExtentTest test = null;
	public static HttpResponse<JsonNode> response;
	public static HttpResponse<String> soapResponse;
	public HashMap<String, String> header;
	public static String calculatorEndpoint;
	public static String dataSheetUrl;
    public static GvsHome01 gh01;
    public static GvsHome02 gh02;
    public static GvsHome07 gh07;
    
   
    
public void initializeObjects() throws IOException, Exception {
		
		cm = new CommonUtilities(driver);
		header = new HashMap<>();
		gh01 = new GvsHome01(driver);
		gh02 = new GvsHome02(driver);
		gh07 = new GvsHome07(driver);
	}

    public WebDriver initializeDriver() throws IOException, InterruptedException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream(".\\src\\main\\java\\com\\esspl\\capability\\resources\\data.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");
        String URL = prop.getProperty("url");
        String chromeDriver = prop.getProperty("chromepath");
        String ffDriver = prop.getProperty("firefoxpath");
        String ieDriver = prop.getProperty("iepath");
        log.info("browser Chosen: " + browserName);
        
        
       // log.info("url Chosen: " + URL);

        if (browserName.equals("chrome")) {
        	System.setProperty("webdriver.chrome.driver","E:\\AutomationTraining\\UIframework\\src\\main\\java\\com\\esspl\\capability\\drivers\\chromedriver.exe");
    	    driver = new ChromeDriver();
    	    driver.manage().window().maximize();
            driver.get(URL);
            Thread.sleep(7000);

        } else if (browserName.equals("firefox")) {
        	System.setProperty("webdriver.gecko.driver",ffDriver);
            driver = new FirefoxDriver();
            

        } else if (browserName.equals("ie")) {
            System.setProperty("webdriver.opera.driver",ieDriver);
            driver = new OperaDriver();


        }
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;


    }

    public void getScreenshot(String result) throws IOException {
       /* File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("src/main/java/screenshots/" + result + "screenshot.png"));
*/
    }
    
    public WebDriver closeDriver()  {
    	driver.quit();
		return driver;
    }
    

//public static Properties cnfgProp;



public static ExtentReports SetUp() {
	
	String reportLocation = cnfgProp.getProperty("ExtentreportPath")+"/extentReport.html";
	report = new ExtentHtmlReporter(reportLocation);
	report.config().setDocumentTitle("Automation Test Report");
	report.config().setReportName("Automation Test Report");
	report.config().setTheme(Theme.STANDARD);
	report.start();
	
	extent = new ExtentReports();
	extent.setSystemInfo("Environment",cnfgProp.getProperty("environment"));
	extent.setSystemInfo("OS Name",System.getProperty("os.name"));
	extent.setSystemInfo("User Name",System.getProperty("user.name"));
	extent.setSystemInfo("Application",cnfgProp.getProperty("application"));
	extent.attachReporter(report);
	return extent;
}

public static void addCucumberTest(String testNames) {
	//logInfo = extent.createTest(testNames);
}

//@AfterTest
public void FlushCucumberTest() {
	extent.flush();
			
}

public static void testStepHandle(String testStatus,WebDriver driver,ExtentTest extenttest,Throwable throwble) throws IOException {//
	switch(testStatus) {
	case "FAIL" :
		extenttest.fail(MarkupHelper.createLabel("Test Case is failed :", ExtentColor.PINK));
		extenttest.error(throwble.fillInStackTrace());
		
		try {
			//extenttest.addScreenCaptureFromPath(captureScreenshot(driver));
		}catch(Exception e) {
			//e.getMessage();
			e.printStackTrace();
		}
		if(driver != null) {
			driver.quit();
		}
		break;
		
	case "PASS" :
		extenttest.pass(MarkupHelper.createLabel("Test Case is passed :", ExtentColor.GREEN));
		//extenttest.addScreenCaptureFromPath(captureScreenshot(driver));
		break;
		
	default :
		break;
	}
}

//public static String captureScreenshot(WebDriver driver) throws IOException {
//	String dateTime = new SimpleDateFormat("MMddyyyyHHmmss").format(new Date());
//	TakesScreenshot screen = (TakesScreenshot) driver;
//	File src = screen.getScreenshotAs(OutputType.FILE);
//	String destinatino = "D:\\gitOps\\UIframework\\Reports\\extent-report\\Screenshots\\"+currentdateandtime()+".png";
//	//System.getProperty("user.dir")+"\\Reports\\"+currentdateandtime()+".png";
//	//cnfgProp.getProperty("reportPath")+"/extentReport.html";
//	File targte = new File(destinatino);
//	System.out.println(destinatino);
//	System.out.println("--------------------destntn-----------------");
//	FileUtils.copyFile(src, targte);
//	return destinatino;
//	
//}

private static String currentdateandtime() {
	String str = null;
	try {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
		Date date = new Date();
		str = dateFormat.format(date);
		str = str.replace(" ","").replaceAll("/","").replaceAll(":","");
		
	}catch(Exception e) {
		e.getMessage();
	}
	
	return str;
}


}
