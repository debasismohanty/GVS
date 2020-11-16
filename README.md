E2EProject
====================

Cucumber is BDD framework which works for Automating all Ui application developed with multiple languages like java,php,c# etc
.
For This framework , we are going to use cucumber with java and maven as a build tool.

BDD's behavior text is written in a business-readable domain-specific language.
It aims to communicate better between non-tech to tech over Software trueness and quality.  
The readable behavior also serves as documentation.

~~ This is most widely used in market because of its feature file as Client get the idea of coverage of its scenarios, easy implementation , cross checking is easy

Before starts scripting we have to follow some steps which helps to configure our system and make it ready so that our system is enable to perform the operation.

##Setup
1. java must be in the system
2. Download jdk and install it(jdk 1.8 is more preferable)
3. set your jdk path in the Enviroment variable
4. Open Eclipse and go to 'Help' , then 'Marketplace' then type 'cucumber' and hit search then install it
5. Open Eclipse and go to 'Help', then 'Install New Software' then type                                                                 
  "https://dl.bintray.com/testng-team/testng-eclipse-release/6.14.3/"  in the first field and click on add then a
   popup will open and pass TestNG in the first field and click on 'add' then select TestNG and click on next till
   finish appear and click on finish and accept the T&C
6. Import the framework as a maven project ~~

##Add Dependencies
We can Add dependency in pom.xml file. Find some dependencies below 

    ```
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.4.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>6.8</version>
    </dependency>
    ```
    
##Write behavior - Feature file
It is available in src/test/java/features
    
    Feature: LNS Application Automation

  @POUpload
  Scenario Outline: Upload PO files and validate PO Details
    Given Select <ClientName> from Client drop
    Then Click on Admin Module
    Then Click on New File Upload
    
      Examples:
        | ClientName  |
        | xyz		   |
       
    
    
##Write step definition

It is available in src/test/java/stepDefinations

```java
@When("^Select \"([^\"]*)\" from Client drop$")
	public void select_from_Client_drop(String ClientName) throws Throwable {
		try {
        	super.initializeObjects();
        	cm.type(poUpload.unamejenkins, "DebasisMoh", "entered");
        	Thread.sleep(5000);
    		cm.type(poUpload.pwjenkins, "Esspl@123", "entered");
    		String req = "abcd";
    		String act = "abcde";
    		Assert.assertEquals(req, act);
    		driver.quit();
        	Assert.assertEquals(11, 13);
        }catch(AssertionError | Exception e) {
        	testStepHandle("FAIL",driver,logInfo,e);
        	throw e;
        }
	}
	
	@Then("^Click on Admin Module$")
	public void click_on_Admin_Module() throws Throwable {
		
		super.initializeObjects();
		Thread.sleep(5000);
		cm.Click(poUpload.adminModule);
		Thread.sleep(2000);
		cm.switchtoDefaultContent();
		//logInfo.addScreenCaptureFromPath(captureScreenshot(driver));
	}



	@Then("^Click on New File Upload$")
	public void click_on_New_File_Upload() throws Throwable {
		super.initializeObjects();
		Thread.sleep(2000);
		cm.switchFrameInd(1);
		Thread.sleep(5000);
		cm.Click(poUpload.optNewFileUpld);
		System.out.println("New file Upload clicked");
		cm.switchtoDefaultContent();
		Thread.sleep(5000);
		System.out.println("Click on New File Upload_PO");
	}
```
 

##Run

1. Go to src/test/java/cucumberOptions/TestRunner
2. Right click on the TestRunner and run as TestNG
3. Right click on the pom.xml and Run as "Maventest"
4. Double click on run.bat to execute

    


##Components and its purpose
```
A. Go to src/main/java, you will get below packages
 1. AutoIT
 2. Drivers
 3. pageObjects
 4. resources
 
 1. In AutoIT we get below details
 	 AutoIT : Here we kept all .exe files of desktop application codes
 	
 2. In Drivers we store all exe files of the required browsers
 
 3. In pageObjects we store all the pom files of each screen/pages/scenario or testcases
 
 4. In resouces it store below classes
 	 4.1 :Base class : It store objects of all classes
 	 4.2 :Status class : Status class contains the status as pass,fail,skipped and notrun
 	 4.3 :properties file : data.properties file contains all the static/constant values
 	 4.4 :log4j xml file : This is used for log mechanism
 	 4.5 :extent-config xml file : This is used for creation of extent reports

B. Go to src/test/java, you will get below packages
	 1. CucumberOptions : We kept the runner class here
	 2. features : here we kept all the feature files
	 3. Listeners : Here we kept all the listeners class
	 4. stepDefinations : Here we create our scripts within it.
	 5. utilities : Here all reusable methods are kept
	 
C. logs : It store all log files

D. Reports
	1.1 : It contains extent-report
	1.2 : It contains html-report
	
E. target : It contains rerun.txt file which specify all the failed features

F. pom.xml : It contains all dependencies and libraries file

G. testngCucumber : it contains testNG xml file
```

##Any Questions ? 
Please feel free to contact me at debasis.mohanty01@esspl.com

API Automation
====================

API Automation in this framework is designed using Unirest to facilitate easy API calls with assertions

A few additional components added in support have been described below to assist in automation

##APIHelper
```
Folder Path: /E2EProject/src/main/java/com/esspl/capability/utilities

Usage: The helper classs has the prewritten functions to retrive HTTP and SOAP Responses from the API provided
The class also has assertions to assert components from the responses

The methods in the class can be called using the variable api
```

##Feature Files
```
Folder Path: /E2EProject/src/test/java/com/esspl/capability/features

Sample Feature Files have been added for REST and SOAP API Automation
Each Feature File has the response sample at the top which would assist in calling assertion functions if the API under Test follows a similar structure
```

##Step Definitions
```
Folder Path: /E2EProject/src/test/java/com/esspl/capability/stepDefinations

The Step definitions provide a reflection of the feature file written to test the APIs. Below are a few 
steps that would assist in understanding the different tests to be written and assertions to be performed

A. Hooks: Hooks is the class to provide the before and after for each test that you require to perform. It may include the following:
  1. Initialization of Driver
  2. Setting API Endpoints from the data.properties file
  3. Killing the browser instance
  
B. Features specific scenarios are to be written in separate Step Definition class. Avoid adding duplicate steps
 For Example: @Then("^The response code is (\\d+)$")  can be defined once and can be used across various feature files for asserting response code for REST APIs
 
C. Adding Headers: Headers required for POST operations can be added as below:
header.put("Content-Type", "text/xml;charset=UTF-8");

D. Retrieving Responses: The REST and SOAP responses can be retrieved and stored in the global variable  
named as response(For REST APIs) and soapResponse(For SOAP APIs) similar to the below way:
response = api.responseJSONBodyForGET(endpoint);
soapResponse = api.responseStringBodyForPOST(calculatorEndpoint, addCalculator, header);

E. Asserting Responses: Once the response is stored in its respective variable, the content can be asserted by using the APIHelper class. Examples of assertion are as below:
 1. Asserting Response Code for REST API:
 		api.assertResponseCode(response, code);
 2. Asserting Response contains a specific key for REST API:
 		api.assertResponseContainsKey(response, arg1);
 3. Asserting Response contains all Key Set in REST API:
 		api.assertResponseContainsAllKeySet(response, keys);
 4. Asserting Response value in REST API:
 		api.assertResponseKeyValue(response,0,"page","2");
 5. Asserting Response Code for SOAP API:
 		api.assertSoapResponseCode(soapResponse, code);
 6. Asserting Response contains for SOAP API:
 		api.assertSoapResponseContains(soapResponse,
				"<AddResult>" + total + "</AddResult>");
 7. Asserting xpath value for an xml element in SOAP API:
 		api.assertValueEquals(total, api.getXPath(soapResponse,"//AddResult"));
 8. Asserting Response Header in SOAP API
 		api.assertSoapResponseHeaderContains(soapResponse, "X-Powered-By", 
				"[ASP.NET]");
```
#NOTE:
The assertions would differ depending upon the response and the DTO.
The assertions to be used could be compared against the response noted in each API feature file and can be used accordingly

For Any API related queries, please reach out at jayamohanty@esspl.com