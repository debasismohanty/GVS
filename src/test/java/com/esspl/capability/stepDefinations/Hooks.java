package com.esspl.capability.stepDefinations;

import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.esspl.capability.resources.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends Base {
	ExtentTest logInfo = null;
	
	@Before()
	public void initialize_the_browser_with_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		cnfgProp = new Properties();
        FileInputStream fis = new FileInputStream(".\\src\\main\\java\\com\\esspl\\capability\\resources\\data.properties");
		extent = new ExtentReports();
		String reportLocation = ".\\Reports\\extent-report\\extentReport.html";
		report = new ExtentHtmlReporter(reportLocation);

		extent.attachReporter(report);
		driver = initializeDriver();

        cnfgProp.load(fis);
       
        dataSheetUrl = cnfgProp.getProperty("dataSheetUrl");
        
	}
	
    @After()
	public void close_the_browser() throws Throwable {
    	super.initializeObjects();
	    cm.closeAllBrowserWindows(driver);
	}

}
