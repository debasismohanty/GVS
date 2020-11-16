package com.esspl.capability.cucumberOptions;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.RetryAcceptance;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		//jsonReport = "target/cucumber.json"
		retryCount = 0
		,detailedReport = true
		,detailedAggregatedReport = true
		,overviewReport = true
		,coverageReport = true
		,jsonUsageReport = "target/cucumber-usage.json"
		,toPDF = true
//		,includeCoverageTags = {"@POUpload"}
		,outputFolder = "target"
		
		)
@CucumberOptions(
        features = {"E:\\AutomationTraining\\UIframework\\src\\test\\java\\com\\esspl\\capability\\features\\GvsHome3.feature"},
        glue= {"classpath:com\\esspl\\capability\\stepDefinations"},//,//It will inform on which packages steps are implemented
		//tags= {"@POUpload"},
		plugin={"html:Reports/html-report",
				//"json:Reports/cucumber.json",
				//"pretty:Reports/cucumber-pretty.txt",
				//"usage:Reports/cucumber-usage.json",
				//"junit:Reports/cucumber-results.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:.\\Reports\\extent-report\\extentreport.html",
				"rerun:target/rerun.txt"
				
		}
		
	)

public class TestRunner extends AbstractTestNGCucumberTests  {  
	public static int retries = 0;
	public TestRunner() {}
	@RetryAcceptance
	public static boolean retryCheck(Throwable e) {
		return !e.getMessage().contains("Configuration Failed");
	}
	
}
