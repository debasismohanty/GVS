package com.esspl.capability.stepDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.core.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.esspl.capability.pageObjects.GvsHome01;
import com.esspl.capability.resources.Base;
import com.google.common.io.Files;
import com.itextpdf.text.log.SysoCounter;

//import Academy.ExtentReporterListener;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination extends Base {
	ExtentTest logInfo = null;
	String TemplateStorage = "E:\\AutomationTraining\\UIframework\\src\\main\\java\\com\\esspl\\capability\\autoIT\\" ;
    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	extent = new ExtentReports();
        String reportLocation = "D:\\gitOps\\UIframework\\Reports\\extent-report\\extentReport.html";
    	report = new ExtentHtmlReporter(reportLocation);

    	extent.attachReporter(report);

        try {
        	test = extent.createTest(Feature.class,"LNS Application Automation");
        	test = test.createNode(Scenario.class, "Upload PO files and validate PO Details");
        	logInfo = test.createNode(new GherkinKeyword("Given"), "Initialize the browser with chrome");
        	driver = initializeDriver();
        	
        }catch(AssertionError | Exception e) {
        	testStepHandle("FAIL",driver,logInfo,e);
        	
        }
    } // end of initialize browser
    
    /*                  -------------------------------- GVSHome01 code Snippets-----------------------------------                                 */
    
	@When("^User logged in to GVS-Titan with valid credential$")
	public void user_logged_in_to_GVS_Titan_with_valid_credential() throws Throwable {
		super.initializeObjects();
		Runtime.getRuntime().exec("E:\\AutomationTraining\\UIframework\\src\\main\\java\\com\\esspl\\capability\\autoIT\\TitanPopup_1.exe");
		Thread.sleep(20000);
		
	}

	@When("^user is on Home page, Titan Logo and Hamburger menu icon should present there$")
	public void user_is_on_Home_page_Titan_Logo_and_Hamburger_menu_icon_should_present_there() throws Throwable {
		super.initializeObjects();
		String ExpTitle = cm.getTitle();
		System.out.println(ExpTitle+":<------------------------------  Title");
		cm.isElementPresent(gh01.titan_logo,"To check Titan logo is present or not");
    	cm.isElementPresent(gh01.hamburger_icon,"To check Hamburger icon is present or not");
	}
	

	@When("^Welcome \"([^\"]*)\", Global Filter, Control Tower and My Alert Section should present there$")
	public void welcome_Global_Filter_Control_Tower_and_My_Alert_Section_should_present_there(String arg1) throws Throwable {
		super.initializeObjects();
		cm.isElementPresent(gh01.welcomeUserCntre,"To check Welcome text is present or not");
		if(cm.assertTextContains(gh01.welcomeUserCntre, arg1))
		{
			System.out.println("user name successful");
			}
		else
		{
			System.out.println("user name not successful");
		}
		
   	    cm.isElementPresent(gh01.GlobalFilterslist,"To check Global Filter is present or not");
   	    cm.isElementPresent(gh01.control_Tower,"To check Control Tower is present or not");
	    cm.isElementPresent(gh01.MyAlertSection,"To check My Alert Section is present or not");
	}

	@When("^User click on hamburger icon Sliding drawer should open with Menu list$")
	public void user_click_on_hamburger_icon_Sliding_drawer_should_open_with_Menu_list() throws Throwable {
		super.initializeObjects();
		Thread.sleep(30000);
		cm.Click(gh01.hamburger_menu);
		cm.isElementPresent(gh01.h_slidingdrawer,"To check Sliding drawer is present or not");
	}

	@When("^User should be able to see \"([^\"]*)\", \"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_be_able_to_see_and(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		super.initializeObjects();
		
		Thread.sleep(5000);
		
				cm.assertTextEquals(gh01.hVisibility, arg1);				
				cm.assertTextContains(gh01.hShipment, arg2);
				cm.assertTextEquals(gh01.hAdministration, arg3);
				cm.assertTextEquals(gh01.hConfiguration, arg4);
				cm.assertTextEquals(gh01.hFindAshipment, arg5);
	   }
	
	@When("^It should show \"([^\"]*)\" ,\"([^\"]*)\" and \"([^\"]*)\" as submenu of Visibility$")
	public void it_should_show_and_as_submenu_of_Visibility(String arg1, String arg2, String arg3) throws Throwable {
		super.initializeObjects();

		cm.assertTextEquals(gh01.h_dataUpload, arg1);
				
		cm.assertTextEquals(gh01.h_trackUploadStatus, arg2);
		cm.assertTextEquals(gh01.h_gitDashboard, arg3);
	}

	@When("^It should have \"([^\"]*)\" as submenu of Shipment and \"([^\"]*)\" as submenu of Configuration$")
	public void it_should_have_as_submenu_of_Shipment_and_as_submenu_of_Configuration(String arg1, String arg2) throws Throwable {
		super.initializeObjects();
		
		cm.assertTextEquals(gh01.h_shipmentSummery, arg1);
		cm.assertTextEquals(gh01.h_masterData, arg2);
		
	}

	@When("^It should have \"([^\"]*)\" ,\"([^\"]*)\" and \"([^\"]*)\" as submenu of Administration$")
	public void it_should_have_and_as_submenu_of_Administration(String arg1, String arg2, String arg3) throws Throwable {
		super.initializeObjects();
		
		cm.assertTextEquals(gh01.h_rolesAndPermissions, arg1);
		cm.assertTextEquals(gh01.h_users, arg2);
		cm.assertTextEquals(gh01.h_preferences, arg3);
		
	}

	@When("^Welcome label should be displayed with username by which user logged in to the application$")
	public void welcome_label_should_be_displayed_with_username_by_which_user_logged_in_to_the_application() throws Throwable {
		super.initializeObjects();
		cm.isElementPresent(gh01.welcomeUserCntre,"To check Welcome label is present or not"); 
	}

	@When("^Username is clicked \"([^\"]*)\" and \"([^\"]*)\" options should be displayed$")
	public void username_is_clicked_and_options_should_be_displayed(String arg1, String arg2) throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.welcomeUserCntre);
		Thread.sleep(2000);
		
		cm.assertTextEquals(gh01.username_administration, arg1);
		cm.assertTextEquals(gh01.username_preferences, arg2);
		
	}

	@When("^User can navigate to the Administration and Preferences page on clicking on both of the links$")
	public void user_can_navigate_to_the_Administration_and_Preferences_page_on_clicking_on_both_of_the_links() throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.username_administration);
		Thread.sleep(3000);
		System.out.println("--------------welcome to user administration page-------------");
        Thread.sleep(3000);
        cm.Click(gh01.welcomeUserRight);
        System.out.println("--------------clicking on the Welcome_UserName-------------");
        Thread.sleep(3000);
    	cm.Click(gh01.usernamePrefRght);
    	System.out.println("--------------welcome to user preference page-------------");
	}

	@When("^User check for Global filter criteria should be displayed as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_check_for_Global_filter_criteria_should_be_displayed_as_and(String arg1, String arg2) throws Throwable {
		super.initializeObjects();
		Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		cm.Click(gh01.home_icon_right);
		
		cm.assertTextEquals(gh01.GlobalFilters_ShipmentType, arg1);
		
		cm.assertTextContains(gh01.GlobalFilters_ShipmentRegions, arg2);
		
	}

	@When("^User click on Global filter the drawer should open and \"([^\"]*)\" and \"([^\"]*)\" should present$")
	public void user_click_on_Global_filter_the_drawer_should_open_and_and_should_present(String arg1, String arg2) throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.GlobalFilterslist);
		
		cm.assertTextEquals(gh01.FilterByShipmentType_text, arg1);
		
		cm.assertTextEquals(gh01.FilterByOrigin_text, arg2);
	}

	@When("^Shipment type should have \"([^\"]*)\" and \"([^\"]*)\" and both the options should be selected$")
	public void shipment_type_should_have_and_and_both_the_options_should_be_selected(String arg1, String arg2) throws Throwable {
		super.initializeObjects();
		cm.assertTextEquals(gh01.GF_NonPrecious_checkBox, arg1);
		cm.assertTextEquals(gh01.GF_Precious_checkBox, arg2);
		
	}

	@When("^User click on deselect all button Filter criteria should be removed from the global filter$")
	public void user_click_on_deselect_all_button_Filter_criteria_should_be_removed_from_the_global_filter() throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.GF_ShipmentType_SelectDeselectAll);
		
	}

	@Then("^User click on Apply Filter button \"([^\"]*)\" should be displayed in regions section$")
	public void user_click_on_Apply_Filter_button_should_be_displayed_in_regions_section(String arg1) throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.GlobalFilters_ApplyFilters_btn);
		cm.assertTextEquals(gh01.Selected_ShipmentType, arg1);
		
		
	}
	
	@When("^User click on Select all under Shipment Type and Click on Apply Filter button$")
	public void user_click_on_Select_all_under_Shipment_Type_and_Click_on_Apply_Filter_button() throws Throwable {
	    super.initializeObjects();
	    cm.Click(gh01.GlobalFilterslist);
	    cm.Click(gh01.GF_ShipmentType_SelectDeselectAll);
	    Thread.sleep(2000);
	    cm.Click(gh01.GlobalFilters_ApplyFilters_btn);
	}
	
	@Then("^\"([^\"]*)\" should be displayed against  Shipment Type on top$")
	public void should_be_displayed_against_Shipment_Type_on_top(String arg1) throws Throwable {
	    
		cm.assertTextEquals(gh01.Selected_ShipmentType, arg1);
		
		
	}

	@When("^user selects any one out of the two present Shipment Type and Click on Apply Filter button$")
	public void user_selects_any_one_out_of_the_two_present_Shipment_Type_and_Click_on_Apply_Filter_button() throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.GlobalFilterslist);
		cm.Click(gh01.GF_NonPrecious_checkBox);
		Thread.sleep(2000);
	    cm.Click(gh01.GlobalFilters_ApplyFilters_btn);
	}
	
	@Then("^Shipment Type  filter criteria should be added and selected Shipment Type should be displayed on top$")
	public void shipment_Type_filter_criteria_should_be_added_and_selected_Shipment_Type_should_be_displayed_on_top() throws Throwable {
	    cm.isElementPresent(gh01.Selected_ShipmentType, "Selected Shipment Type is present or not");
	}

	@When("^User click on Global filter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" should be displayed under Filter by Origin$")
	public void user_click_on_Global_filter_and_should_be_displayed_under_Filter_by_Origin(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.home_icon);
		cm.Click(gh01.GlobalFilterslist);
		
		cm.assertTextEquals(gh01.GF_EastText, arg1);
		
		cm.assertTextEquals(gh01.GF_NorthText, arg2);
		
		cm.assertTextEquals(gh01.GF_SouthText, arg3);
		
		cm.assertTextEquals(gh01.GF_WestText, arg4);
	}

	@When("^User click on Deselect All and click on Apply Filter, Regions should display \"([^\"]*)\" in global filter on top$")
	public void user_click_on_Deselect_All_and_click_on_Apply_Filter_Regions_should_display_in_global_filter_on_top(String arg1) throws Throwable {
		super.initializeObjects();
	    cm.Click(gh01.GF_SearchOrigin_DeselectAll);
	    Thread.sleep(2000);
	    cm.Click(gh01.GlobalFilters_ApplyFilters_btn);
	    cm.assertTextEquals(gh01.Selected_Regions, arg1);
	}

	@When("^User click on select all and click on Apply Filter, Regions should display \"([^\"]*)\" in global filter on top$")
	public void user_click_on_select_all_and_click_on_Apply_Filter_Regions_should_display_in_global_filter_on_top(String arg1) throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.GlobalFilterslist);
	    cm.Click(gh01.GF_SearchOrigin_DeselectAll);
	    Thread.sleep(2000);
	    cm.Click(gh01.GlobalFilters_ApplyFilters_btn);
	    cm.assertTextEquals(gh01.Selected_Regions, arg1);
	}

	@When("^User select one origin in filter and click on the Apply Filters, Regions should display selected origin in global filter on top$")
	public void user_select_one_origin_in_filter_and_click_on_the_Apply_Filters_Regions_should_display_selected_origin_in_global_filter_on_top() throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.GlobalFilterslist);
		cm.Click(gh01.GF_SearchOrigin_DeselectAll);
		cm.Click(gh01.GlobalFilters_NorthCheckbox);
		cm.Click(gh01.GlobalFilters_ApplyFilters_btn);
		
		String Selected_Regions=cm.GetText(gh01.Selected_Regions);
	    System.out.println("---------------"+Selected_Regions+" is selected-------------------------");
	    
	    cm.Click(gh01.GlobalFilterslist);
	    cm.Click(gh01.GF_ShipmentType_SelectDeselectAll);
	    cm.Click(gh01.GF_SearchOrigin_DeselectAll);
	    cm.Click(gh01.GlobalFilters_ApplyFilters_btn);
	}

	@When("^User Check for the Control tower section it should have the Shipment summary details$")
	public void user_Check_for_the_Control_tower_section_it_should_have_the_Shipment_summary_details() throws Throwable {
	    
	}

	@When("^User Click on the Shipment summary icon Shipment summary page should be opened$")
	public void user_Click_on_the_Shipment_summary_icon_Shipment_summary_page_should_be_opened() throws Throwable {
		super.initializeObjects();
		cm.Click(gh01.shipmentSummary);
		String arg1 = cm.GetText(gh01.ShipmentSummeryPage_Text);
		cm.assertTextEquals(gh01.ShipmentSummeryPage_Text, arg1);
		
		cm.isElementPresent(gh01.ShipmentSummeryPage_Text, "Shipment_summary_page is present or not ");
	}

	@When("^The page should display \"([^\"]*)\" ,\"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_page_should_display_and(String arg1, String arg2, String arg3) throws Throwable {
		cm.isElementPresent(gh01.ShipSumm_FilterIcon, "ShipSumm_FilterIcon is present or not");
		cm.isElementPresent(gh01.ShipSumm_ExcelExport, "ShipSumm_FilterIcon is present or not");
		cm.isElementPresent(gh01.Shipsumm_reccPerPage, "ShipSumm_FilterIcon is present or not");
	}

	@When("^Inbound shipments section should show two graphs \"([^\"]*)\",\"([^\"]*)\"$")
	public void inbound_shipments_section_should_show_two_graphs(String arg1, String arg2) throws Throwable {
	    
		super.initializeObjects();
		Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		cm.Click(gh01.titan_logo);
		cm.assertTextEquals(gh01.ShipmentSummeryGraph_Text, arg1);
		cm.assertTextEquals(gh01.GoodsInTransitGraph_Text, arg2);
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	   super.initializeObjects();
	   cm.closebrowser();
	}
	
    /*                                            End of GVSHome01 code Snippets                                           */
    
    /*              ---------------------------------- GVSHome02 code Snippets -----------------------------                   */
    
	@Then("^Click on Data Upload$")
	public void click_on_Data_Upload() throws Throwable {
		super.initializeObjects();
		Thread.sleep(10000);
		cm.Click(gh01.h_dataUpload);
	}

	@When("^User selects the \"([^\"]*)\"  option from the Feed Type dropdown \"([^\"]*)\" field should be selected$")
	public void user_selects_the_option_from_the_Feed_Type_dropdown_field_should_be_selected(String arg1, String arg2) throws Throwable {
		super.initializeObjects();
		cm.Click(gh02.selectUploadFeedType);
	    cm.selectDropdownByVisibleText(gh02.selectUploadFeedType, arg1 , "GIT tracking feed selected");
	}
	@When("^User clicks on the Template download link \"([^\"]*)\" should be downloaded$")
	public void user_clicks_on_the_Template_download_link_should_be_downloaded(String arg1) throws Throwable {
		
		super.initializeObjects();
		 Thread.sleep(6000);
		 cm.Click(gh02.templateDownload_btn);
		 Thread.sleep(2000);
	}
	@When("^User checks for template , it should have fields as expected$")
	public void user_checks_for_template_it_should_have_fields_as_expected() throws Throwable {
		super.initializeObjects();	
		
		File filename = new File("C:\\Users\\debasismohanty\\Downloads\\Template_STT.xlsx");
		filename.renameTo(new File("E:\\AutomationTraining\\UIframework\\Downloads\\Template_STT.xlsx"));
		filename.delete();
		String arr[]= {"Sl no","Shipment type","Courier Name","Docket no / AWB no","Origin Region","Origin State","Origin Place","From_Whse code","To_Whse code","Destination region","Destination State","Destination Place","Shipment Pickup Date (dd/mmm/yyyy)","Total Qty","Total Net Wgt (Gms)","Total Shipment Value","Total No of Pkgs / Number of Boxes","Total Gross Wgt (Kgs)","TAT","Schedule Delivery date (dd/mmm/yyyy)","Delivery Status","Actual Delivery Date (dd/mmm/yyyy)","Total Holidays","Net Delay","Reason for Delay","POD"};
			
		for (int i=0; i< arr.length ; i++)
		{
			String cellData =cm.getCellData("E:\\AutomationTraining\\UIframework\\Downloads\\Template_STT.xlsx", "Data", 1,i);
			System.out.println("*****************************"+cellData+"************************************");
			if  (arr[i].equals(cellData))
			{
			   System.out.println(cellData+" Verified");
			}
			else
			{
			   System.out.println(cellData+" NOT Verified");
			}
		}
		System.out.println("Template is VERIFIED");
	}

//	@When("^User upload with the \"([^\"]*)\" with different set of data$")
//	public void user_upload_with_the_with_different_set_of_data(String VDFile) throws Throwable {
//	super.initializeObjects();
//	 cm.Click(gh02.selectFile_btn);
//	 Thread.sleep(4000);
//	 System.out.println(TemplateStorage+VDFile);
//	// Runtime.getRuntime().exec(TemplateStorage+VDFile);
//		Thread.sleep(5000);
//	}

	@Then("^Bottom of the upload feed popup menu with number of \"([^\"]*)\" message should be displayed$")
	public void Bottom_of_the_upload_feed_popup_menu_with_number_of_message_should_be_displayed(String arg1) throws Throwable {
		if(cm.assertTextContains(gh02.fileSelected_msgb, arg1)) 
		{
			System.out.println("File selected message Verified");
		}
		else 
		{	
			System.out.println("File selected message NOT Verified");
		}
	}
	
	@When("^User clicks on the upload button to upload \"([^\"]*)\" message should be displayed$")
	public void user_clicks_on_the_upload_button_to_upload_message_should_be_displayed(String arg1) throws Throwable {
		super.initializeObjects();
		 cm.Click(gh02.upload_btn);
		 
	}


	@When("^Once uploaded process completed \"([^\"]*)\" message should be displayed$")
	public void once_uploaded_process_completed_message_should_be_displayed(String arg1) throws Throwable {
		super.initializeObjects();
		 Thread.sleep(8000);
		 if(cm.assertTextEquals(gh02.fileSuccessfulStatus, arg1)) 
		{
			System.out.println("File Uploaded successfully : 100% - Complete - Verified ");
		}
		else 
		{	System.out.println("File Uploaded successfully - NOT Verified ");
		}
	}

	@When("^User closes the Upload Feed pop up, it should be closed$")
	public void user_closes_the_Upload_Feed_pop_up_it_should_be_closed() throws Throwable {
		super.initializeObjects();
		 Thread.sleep(4000);
	     cm.Click(gh02.closeUploadFeed_btn);
	     Thread.sleep(10000);
	}
	
	@When("^User upload Valid file with the \"([^\"]*)\" with different set of data$")
	public void user_upload_Valid_file_with_the_with_different_set_of_data(String VDFile) throws Throwable {
		 super.initializeObjects();
		 cm.Click(gh02.selectFile_btn);
		 Thread.sleep(4000);
		 System.out.println(TemplateStorage+VDFile);
		 Runtime.getRuntime().exec(TemplateStorage+VDFile);
		 Thread.sleep(5000);
	}

	@When("^User upload Duplicate file with the \"([^\"]*)\" with different set of data$")
	public void user_upload_Duplicate_file_with_the_with_different_set_of_data(String DDFile) throws Throwable {
		super.initializeObjects();
		 cm.Click(gh02.selectFile_btn);
		 Thread.sleep(4000);
		 System.out.println(TemplateStorage+DDFile);
		 Runtime.getRuntime().exec(TemplateStorage+DDFile);
		 Thread.sleep(5000);
	}

	@When("^User upload Multiple file one with the \"([^\"]*)\" with different set of data$")
	public void user_upload_Multiple_file_one_with_the_with_different_set_of_data(String MF0File) throws Throwable {
		super.initializeObjects();
		 cm.Click(gh02.selectFile_btn);
		 Thread.sleep(4000);
		 System.out.println(TemplateStorage+MF0File);
		 Runtime.getRuntime().exec(TemplateStorage+MF0File);
		 Thread.sleep(5000);
	}

	@When("^User upload Multiple file two with the \"([^\"]*)\" with different set of data$")
	public void user_upload_Multiple_file_two_with_the_with_different_set_of_data(String MF1File) throws Throwable {
		super.initializeObjects();
		 cm.Click(gh02.selectFile_btn);
		 Thread.sleep(4000);
		 System.out.println(TemplateStorage+MF1File);
		 Runtime.getRuntime().exec(TemplateStorage+MF1File);
		 Thread.sleep(5000);
	}

	@When("^User upload VTID file with the \"([^\"]*)\" with different set of data$")
	public void user_upload_VTID_file_with_the_with_different_set_of_data(String VTIDFile) throws Throwable {
		super.initializeObjects();
		 cm.Click(gh02.selectFile_btn);
		 Thread.sleep(4000);
		 System.out.println(TemplateStorage+VTIDFile);
		 Runtime.getRuntime().exec(TemplateStorage+VTIDFile);
		 Thread.sleep(5000);
	}

	@When("^User upload VTVID with the \"([^\"]*)\" with different set of data$")
	public void user_upload_VTVID_with_the_with_different_set_of_data(String VTVIDFile) throws Throwable {
		super.initializeObjects();
		 cm.Click(gh02.selectFile_btn);
		 Thread.sleep(4000);
		 System.out.println(TemplateStorage+VTVIDFile);
		 Runtime.getRuntime().exec(TemplateStorage+VTVIDFile);
		 Thread.sleep(5000);
	}
	                             /*     End of GVSHome02 code Snippets     */
	

	 
    
                 /* ---------------------------------- GVSHome03 code Snippets ---------------------------*/
	
	
	@When("^User upload IT file with the \"([^\"]*)\" with different set of data$")
	public void user_upload_IT_file_with_the_with_different_set_of_data(String ITFile) throws Throwable {
		super.initializeObjects();
		 cm.Click(gh02.selectFile_btn);
		 Thread.sleep(4000);
		 System.out.println(TemplateStorage+ITFile);
		 Runtime.getRuntime().exec(TemplateStorage+ITFile);
		 Thread.sleep(5000);
	}
	
	@When("^User upload IF file with the \"([^\"]*)\" with different set of data$")
	public void user_upload_IF_file_with_the_with_different_set_of_data(String IFFile) throws Throwable {
		super.initializeObjects();
		 cm.Click(gh02.selectFile_btn);
		 Thread.sleep(4000);
		 System.out.println(TemplateStorage+IFFile);
		 Runtime.getRuntime().exec(TemplateStorage+IFFile);
		 Thread.sleep(5000);
	}
	
	@Then("^User click on dataupload link$")
	public void User_click_on_dataupload_link() throws Throwable {
		super.initializeObjects();
	   cm.Click(gh01.h_dataUpload);
	   Thread.sleep(4000);
	}
	
	@Then("^User click on Upload button to upload the selected file$")
	public void user_click_on_Upload_button_to_upload_the_selected_file() throws Throwable {
		super.initializeObjects();
	   cm.Click(gh02.upload_btn); 
	   Thread.sleep(6000);
	}

	@Then("^Upload should failed with \"([^\"]*)\"$")
	public void upload_should_failed_with(String arg1) throws Throwable {
		super.initializeObjects();
		Thread.sleep(3000);
		cm.assertTextEquals(gh02.fileSuccessfulStatus,arg1);
	}
	
	@Then("^Upload should failed with a \"([^\"]*)\"$")
	public void upload_should_failed_with_a(String arg1) throws Throwable {
		super.initializeObjects();
		Thread.sleep(3000);
		cm.assertTextEquals(gh02.inValid_fileFormat_msg,arg1) ;
		Thread.sleep(10000);
	}
	 
    /*                                      End of GVSHome03 code Snippets                                           */
                                                    
	// -------------------------------------  GVSHome 04 code Snippets--------------------------------------------------
	
	@When("^User checks for template ,it should contain fields as expected$")
	public void user_checks_for_template_it_should_contain_fields_as_expected() throws Throwable {
super.initializeObjects();	
		
		File filename = new File("C:\\Users\\sobhana.ESSBBSR\\Downloads\\Template_ST.xlsx");
		filename.renameTo(new File("D:\\GVS_TITAN_AUTOMATION\\Titan\\Downloads\\Template_ST.xlsx"));
		filename.delete();
		String arr[]= {"Sl no","Ship type","Doc type / Rea Code","From_Org Code","From_Whse Code","Origin State","Origin Place","Origin Region","To-Org code","To_whse code","Vendor / Customer Code","Btq / Vendor / Customer Name","Destination State","Destination Place","Destination Region","Doc no / STM no / Invoice no","Doc / STM / Invoice Generation Date (dd/mmm/yyyy)","Description","GST Ref no","Doc Qty","Net Wgt (Gms) / Doc Weight","Value / Doc Value","E way bill no","Special form no","Despatch date (DD/MMM/YYYY)","Courier Name","Docket No / AWB no","No. of Pkgs. / Number of Boxes","Gross Wgt. (Kgs)","lock no / Seal no"};
			
		for (int i=0; i< arr.length ; i++)
		{
			String cellData =cm.getCellData("D:\\GVS_TITAN_AUTOMATION\\Titan\\Downloads\\Template_ST.xlsx", "Data", 1,i);
			System.out.println("*****************************"+cellData+"************************************");
			if  (arr[i].equals(cellData))
			{
			   System.out.println(cellData+" Verified");
			}
			else
			{
			   System.out.println(cellData+" NOT Verified");
			}
		}
		System.out.println("Template is VERIFIED");
	}
	
	 /*                                      End of GVSHome04 code Snippets                                        */
	
	// -------------------------------------  GVSHome 05 code Snippets--------------------------------------------------
	
	
	// Same as GVSHome03 code Snippets
	
	
	//                                      End of GVSHome05 code Snippets 
	
	// -------------------------------------  GVSHome 06 code Snippets--------------------------------------------------
	
	@Then("^Page should have expected features$")
	public void page_should_have_expected_features() throws Throwable {
	   super.initializeObjects();
	   cm.isElementPresent(gh07.trckUpld_advsrch_icon, "trckUpld advsrch filter");
	   cm.isElementPresent(gh07.trckUpld_ExclExprt, "trckUpld ExclExprt");
	   cm.isElementPresent(gh07.trckUpld_QckSrch_drpdwn, "trckUpld_QckSrch_drpdwn");
	   cm.isElementPresent(gh07.trckUpld_statusGrid, "trckUpld_statusGrid");
	   cm.isElementPresent(gh07.trckUpld_Pgnation_grid, "trckUpld_Pgnation_grid");
	   cm.isElementPresent(gh07.trckUpld_PgPerRcrd_drpdwn, "trckUpld_PgPerRcrd_drpdwn");
	  
	}

	@When("^User Checks for the Advance search icon, Filters pop up should get opened$")
	public void user_Checks_for_the_Advance_search_icon_Filters_pop_up_should_get_opened() throws Throwable {
		 super.initializeObjects();
		 cm.Click(gh07.trckUpld_advsrch_icon);
		 cm.isElementPresent(gh07.trckUpld_advsrch_popUP, "trckUpld advsrch filter");
	}

	@When("^User sets filter and clicks on apply button, pop up should be closed by showing filtered records in grid$")
	public void user_sets_filter_and_clicks_on_apply_button_pop_up_should_be_closed_by_showing_filtered_records_in_grid() throws Throwable {
		 super.initializeObjects();
		 
		cm.Click(gh07.trckUpld_advsrch_FrmDate);
		gh07.trckUpld_advsrch_FrmDate.sendKeys("10-Oct-2020");
		 cm.Click(gh07.trckUpld_advsrchCalandr_Btn);		 
		 cm.Click(gh07.trckUpld_advsrch_ToDate);
		 gh07.trckUpld_advsrch_ToDate.sendKeys("18-Oct-2020");
		 cm.wait(5000);
		// cm.Click(gh07.trckUpld_advsrchCalandr_Btn);
		 cm.Click(gh07.trckUpld_advsrch_FTypeDrpdwn);
		 cm.selectDropdownByVisibleText(gh07.trckUpld_advsrch_FTypeDrpdwn, "Shipment Summary Feed", "trckUpld_advsrch_FTypeDrpdwn");
		 cm.Click(gh07.trckUpld_advSrch_aplyFltr_btn);
		 cm.wait(5000);
		 
	}

	@When("^User clears the filter criteria and click on apply button, popup should be closed with all available records in grid$")
	public void user_clears_the_filter_criteria_and_click_on_apply_button_popup_should_be_closed_with_all_available_records_in_grid() throws Throwable {
	    
	}

	@When("^User checks for excel export by applying advance search, filtered data must be present there$")
	public void user_checks_for_excel_export_by_applying_advance_search_filtered_data_must_be_present_there() throws Throwable {
		
		 super.initializeObjects();
		 cm.Click(gh07.trckUpld_advsrch_icon);
		 cm.isElementPresent(gh07.trckUpld_advsrch_popUP, "trckUpld advsrch filter");
		 
		cm.Click(gh07.trckUpld_advsrch_FrmDate);
		gh07.trckUpld_advsrch_FrmDate.sendKeys("10-Oct-2020");
		 cm.Click(gh07.trckUpld_advsrchCalandr_Btn);		 
		 cm.Click(gh07.trckUpld_advsrch_ToDate);
		 gh07.trckUpld_advsrch_ToDate.sendKeys("18-Oct-2020");
		 cm.wait(5000);
		// cm.Click(gh07.trckUpld_advsrchCalandr_Btn);
		 cm.Click(gh07.trckUpld_advsrch_FTypeDrpdwn);
		 cm.selectDropdownByVisibleText(gh07.trckUpld_advsrch_FTypeDrpdwn, "Shipment Summary Feed", "trckUpld_advsrch_FTypeDrpdwn");
		 cm.Click(gh07.trckUpld_advSrch_aplyFltr_btn);
		 
	}

	@When("^User clicks on excel icon, Excel should be downloaded with all available records$")
	public void user_clicks_on_excel_icon_Excel_should_be_downloaded_with_all_available_records() throws Throwable {
		 super.initializeObjects();
		 cm.isElementPresent(gh07.trckUpld_ExclExprt, "");
		 cm.Click(gh07.trckUpld_ExclExprt);
		 cm.wait(3000);
		 
	}

	@When("^User remove the filter from advance search and click on Excel icon, Excel should be downloaded with all available records$")
	public void user_remove_the_filter_from_advance_search_and_click_on_Excel_icon_Excel_should_be_downloaded_with_all_available_records() throws Throwable {
		/*gh07.trckUpld_advsrch_FTypeDrpdwn.clear();
		gh07.trckUpld_advsrch_FrmDate.clear();
		gh07.trckUpld_advsrch_ToDate.clear();
		*/
		
	}

	@When("^User applies Quick search, filtered records should be displayed in grid$")
	public void user_applies_Quick_search_filtered_records_should_be_displayed_in_grid() throws Throwable {
		super.initializeObjects();
		 cm.isElementPresent(gh07.trckUpld_QckSrch_drpdwn, "");
		 cm.selectDropdownByVisibleText(gh07.trckUpld_QckSrch_drpdwn, "In last 5 days", "");
		 cm.wait(3000);
		 cm.isElementPresent(gh07.trckUpld_ExclExprt, "");
		cm.Click(gh07.trckUpld_ExclExprt);
		 cm.wait(3000);
	}

	@When("^User checks for page for records,dropdown should be placed right side Bottom of the grid$")
	public void user_checks_for_page_for_records_dropdown_should_be_placed_right_side_Bottom_of_the_grid() throws Throwable {
		super.initializeObjects();
		String text = "10";
		 cm.isElementPresent(gh07.trckUpld_PgPerRcrd_text, "");
		 cm.assertTextEquals(gh07.trckUpld_PgPerRcrd_drpdwn, text); 
			
		 
	}

	@When("^User Change the value from the dropdown ,Selected no of recs should be displayed in grid if available$")
	public void user_Change_the_value_from_the_dropdown_Selected_no_of_recs_should_be_displayed_in_grid_if_available() throws Throwable {
		super.initializeObjects();
		cm.selectDropdownByVisibleText(gh07.trckUpld_PgPerRcrd_drpdwn, "25", "");
		 cm.wait(3000);
		 cm.selectDropdownByVisibleText(gh07.trckUpld_PgPerRcrd_drpdwn, "50", "");
		 cm.wait(3000);
		 cm.selectDropdownByVisibleText(gh07.trckUpld_PgPerRcrd_drpdwn, "100", "");
		 cm.wait(3000);
	}

	@When("^User Check for Pagination grid,Pagination should have option to go any specific page by number$")
	public void user_Check_for_Pagination_grid_Pagination_should_have_option_to_go_any_specific_page_by_number() throws Throwable {
		super.initializeObjects();
		 cm.isElementPresent(gh07.trckUpld_paginatnTab, "");
		 cm.wait(3000);
		 cm.isElementPresent(gh07.trckUpld_paginatnTab_Frst, "");
		 cm.isElementPresent(gh07.trckUpld_paginatnTab_Prvs, "");
		 cm.isElementPresent(gh07.trckUpld_paginatnTab_1, "");
		 cm.isElementPresent(gh07.trckUpld_paginatnTab_nxt, "");
		 cm.isElementPresent(gh07.trckUpld_paginatnTab_last, "");
	}

	@When("^User click on specific page tab, based on selection user should be navigated to that page$")
	public void user_click_on_specific_page_tab_based_on_selection_user_should_be_navigated_to_that_page() throws Throwable {
		cm.isElementPresent(gh07.trckUpld_paginatnTab, "");
		 cm.wait(3000);
		 cm.Click(gh07.trckUpld_paginatnTab_Frst);
		 cm.Click(gh07.trckUpld_paginatnTab_Prvs);
		 cm.Click(gh07.trckUpld_paginatnTab_1);
		 cm.Click(gh07.trckUpld_paginatnTab_nxt);
		 cm.Click(gh07.trckUpld_paginatnTab_last);
	}

	@When("^If sufficient records are not available then tab should be in disable mode$")
	public void if_sufficient_records_are_not_available_then_tab_should_be_in_disable_mode() throws Throwable {
	    
	}

	@When("^User Click on the any columns hamburger icon displayed against column and select Sort ascending/Descending$")
	public void user_Click_on_the_any_columns_hamburger_icon_displayed_against_column_and_select_Sort_ascending_Descending() throws Throwable {
		super.initializeObjects();
		cm.Click(gh07.trckUpld_UploadedOnLastReceived_hIcon);
		cm.Click(gh07.trckUpld_UploadedOnLastReceived_asc);
		cm.wait(2000);
		cm.Click(gh07.trckUpld_UploadedOnLastReceived_hIcon);
		cm.Click(gh07.trckUpld_UploadedOnLastReceived_desc);
	}

	@Then("^grid should be sorted in ascending/descending order based the available data on that column$")
	public void grid_should_be_sorted_in_ascending_descending_order_based_the_available_data_on_that_column() throws Throwable {
	    
	}

	@Then("^user Click on the any of the available column except Action$")
	public void user_Click_on_the_any_of_the_available_column_except_Action() throws Throwable {
	    
	}

	@When("^User Clicks on the hamburger icon displayed against any of the columns, one drawer should be opened$")
	public void user_Clicks_on_the_hamburger_icon_displayed_against_any_of_the_columns_one_drawer_should_be_opened() throws Throwable {
		super.initializeObjects();
		cm.Click(gh07.trckUpld_UploadedOnLastReceived_hIcon);
		cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_hIcon_Drpdwn, "");
		cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_asc, "");
		cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_desc, "");
		cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_colmns, "");
	}

	@When("^User Hover mouse on Columns option, drawer should be opened with check box against each column$")
	public void user_Hover_mouse_on_Columns_option_drawer_should_be_opened_with_check_box_against_each_column() throws Throwable {
		super.initializeObjects();
		cm.mouseOver(gh07.trckUpld_UploadedOnLastReceived_colmns, "");
	    cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_colmns_UOLR,"");
	    cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_colmns_UB,"");
	    cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_colmns_FN,"");
	    cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_colmns_FT,"");
	    cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_colmns_Sts,"");
	    cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_colmns_POLP,"");
	    cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_colmns_TR,"");
	    cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived_colmns_FR,"");
	    
	}

	@When("^User Check/Uncheck the check box for any of available columns$")
	public void user_Check_Uncheck_the_check_box_for_any_of_available_columns() throws Throwable {
		super.initializeObjects();
	    cm.Click(gh07.trckUpld_UploadedOnLastReceived_colmns_UOLR);
	    cm.Click(gh07.trckUpld_UploadedOnLastReceived_colmns_UB);
	    cm.Click(gh07.trckUpld_UploadedOnLastReceived_colmns_FN);
	    cm.Click(gh07.trckUpld_UploadedOnLastReceived_colmns_FT);
	}

	@Then("^Unticked columns should hide from the  grid and ticked columns should be displayed in the grid$")
	public void unticked_columns_should_hide_from_the_grid_and_ticked_columns_should_be_displayed_in_the_grid() throws Throwable {
	    
	}



		
		
	//                                      End of GVSHome06 code Snippets  
		
	
	// -------------------------------------  GVSHome 07 code Snippets--------------------------------------------------
	
	int counter = 1;
	
	
	@Then("^User click on Track Upload status$")
	public void user_click_on_Track_Upload_status() throws Throwable {
		super.initializeObjects();
		 cm.Click(gh01.h_trackUploadStatus);
		 cm.wait(6000);
		 cm.isElementPresent(gh07.trckUpld_Txt, "page opened");
		 cm.wait(5000);
		 cm.Click(gh07.trckUpld_Rfrsh);
		 cm.wait(5000);
		cm.Click(gh07.trckUpld_UploadedBy);
		 cm.wait(3000);
		cm.Click(gh07.trckUpld_advsrch_icon);
		cm.Click(gh07.trckUpld_advsrch_FTypeDrpdwn);
		cm.selectDropdownByVisibleText(gh07.trckUpld_advsrch_FTypeDrpdwn, "GIT tracking feed", "");
		cm.Click(gh07.trckUpld_advSrch_aplyFltr_btn);
		
		 
		   
	}

	@Then("^User checks for the selected fields' availability$")
	public void user_checks_for_the_selected_fields_availability() throws Throwable {
		super.initializeObjects();
		cm.isElementPresent(gh07.trckUpld_UploadedOnLastReceived,"");
		cm.isElementPresent(gh07.trckUpld_UploadedBy,"");
		cm.isElementPresent(gh07.trckUpld_Feedtpe,"");
		cm.isElementPresent(gh07.trckUpld_ExclExprt,"");
		
		
	}

	@Then("^Track upload status contains accurate values like \"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void track_upload_status_contains_accurate_values_like_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	
		/*super.initializeObjects();
		
		int rowCount = driver.findElements(By.xpath("//*[@id=\"tblUploadStatus\"]/tbody/*")).size();
		System.out.println(rowCount);
		
		int colCount = driver.findElements(By.xpath("//*[@id=\"tblUploadStatus\"]/tbody/tr[1]/*")).size();
		System.out.println(colCount);
		
		for ( int i = 1 ; i <=rowCount ; i ++ ) {
			for ( int j = 1 ; j <=colCount ; j ++ ) {
				
				//String celldata = driver.findElement(By.xpath("//*[@id=\"tblUploadStatus\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				//System.out.println("celldata");
				
				if(cm.assertTextEquals(driver.findElement(By.xpath("//*[@id=\"tblUploadStatus\"]/tbody/tr["+i+"]/td["+j+"]")),arg1)) 
        		{
        			System.out.println(" user Verified");
        		}
			}
			System.out.println(" ");
			}
		*/
		
		
		System.out.println(counter+"----------------before for loop------------------");
		for (counter = 1; counter <=3; counter ++) {
			
			System.out.println(counter+"----------------before if - 1 ------------------");
			
			if (counter == 1) {
				
				
				System.out.println(cm.GetText(gh07.uname_STTVD));
				System.out.println("--------------------uname data matched------------------");
				System.out.println(arg1);
				
				System.out.println(cm.GetText(gh07.fname_STTVD));
				System.out.println("--------------------fname data matched------------------");
				System.out.println(arg2);
				
				System.out.println(cm.GetText(gh07.feedtyp_STTVD));
				System.out.println("--------------------feedtype data matched------------------");
				System.out.println(arg3);
				
				System.out.println(cm.GetText(gh07.status_STTVD));
				System.out.println("--------------------status data matched------------------");
				System.out.println(arg4);
				
				System.out.println(cm.GetText(gh07.totalrows_STTVD));
				System.out.println("--------------------total rows data matched------------------");
				System.out.println(arg5);
				
				System.out.println(cm.GetText(gh07.failedrows_STTVD));
				System.out.println("--------------------failed row data matched------------------");
				System.out.println(arg6);
				
				/*cm.GetText(gh07.uname_STTVD).contains(arg1);
				System.out.println("uname data matched");
				
				cm.GetText(gh07.fname_STTVD).contains(arg2);
				System.out.println("fname data matched");
				
				cm.GetText(gh07.feedtyp_STTVD).contains(arg3);
				System.out.println("feedtype data matched");
				
				cm.GetText(gh07.status_STTVD).contains(arg4);
				System.out.println("status data matched");
				
				cm.GetText(gh07.totalrows_STTVD).contains(arg5);
				System.out.println("totalrows  data matched");
				
				cm.GetText(gh07.failedrows_STTVD).contains(arg6);
				System.out.println("failedrows data matched");*/
			}	
			
			
			
			else if (counter == 2) {
				
				System.out.println(counter+"----------------inside if - 2 ------------------");
				
				System.out.println(cm.GetText(gh07.uname_STTDD));
				System.out.println("--------------------uname data matched------------------");
				System.out.println(arg1);
				
				System.out.println(cm.GetText(gh07.fname_STTDD));
				System.out.println("--------------------fname data matched------------------");
				System.out.println(arg2);
				
				System.out.println(cm.GetText(gh07.feedtyp_STTDD));
				System.out.println("--------------------feedtype data matched------------------");
				System.out.println(arg3);
				
				System.out.println(cm.GetText(gh07.status_STTDD));
				System.out.println("--------------------status data matched------------------");
				System.out.println(arg4);
				
				System.out.println(cm.GetText(gh07.totalrows_STTDD));
				System.out.println("--------------------total rows data matched------------------");
				System.out.println(arg5);
				
				System.out.println(cm.GetText(gh07.failedrows_STTDD));
				System.out.println("--------------------failed row data matched------------------");
				System.out.println(arg6);
				
				/*cm.GetText(gh07.uname_STTDD).contains(arg1);
				System.out.println("uname data matched");
				
				cm.GetText(gh07.fname_STTDD).contains(arg2);
				System.out.println("fname data matched");
				
				cm.GetText(gh07.feedtyp_STTDD).contains(arg3);
				System.out.println("feedtype data matched");
				
				cm.GetText(gh07.status_STTDD).contains(arg4);
				System.out.println("status data matched");
				
				cm.GetText(gh07.totalrows_STTDD).contains(arg5);
				System.out.println("totalrows  data matched");
				
				cm.GetText(gh07.failedrows_STTDD).contains(arg6);
				System.out.println("failedrows data matched");
				
			*/
			}
			else {
				
				System.out.println(counter+"----------------inside if - 3 ------------------");
				
				System.out.println(cm.GetText(gh07.uname_STT_VTVID));
				System.out.println("--------------------uname data matched------------------");
				System.out.println(arg1);
				
				System.out.println(cm.GetText(gh07.fname_STT_VTVID));
				System.out.println("--------------------fname data matched------------------");
				System.out.println(arg2);
				
				System.out.println(cm.GetText(gh07.feedtyp_STT_VTVID));
				System.out.println("--------------------feedtype data matched------------------");
				System.out.println(arg3);
				
				System.out.println(cm.GetText(gh07.status_STT_VTVID));
				System.out.println("--------------------status data matched------------------");
				System.out.println(arg4);
				
				System.out.println(cm.GetText(gh07.totalrows_STT_VTVID));
				System.out.println("--------------------total rows data matched------------------");
				System.out.println(arg5);
				
				System.out.println(cm.GetText(gh07.failedrows_STT_VTVID));
				System.out.println("--------------------failed row data matched------------------");
				System.out.println(arg6);
				
				
				cm.GetText(gh07.uname_STT_VTVID).contains(arg1);
				System.out.println("uname data matched");
				
				cm.GetText(gh07.fname_STT_VTVID).contains(arg2);
				System.out.println("fname data matched");
				
				cm.GetText(gh07.feedtyp_STT_VTVID).contains(arg3);
				System.out.println("feedtype data matched");
				
				cm.GetText(gh07.status_STT_VTVID).contains(arg4);
				System.out.println("status data matched");
				
				cm.GetText(gh07.totalrows_STT_VTVID).contains(arg5);
				System.out.println("totalrows  data matched");
				
				cm.GetText(gh07.failedrows_STT_VTVID).contains(arg6);
				System.out.println("failedrows data matched");
			}
			
			
		}
		
		System.out.println(counter+"----------------after for loop------------------");
		
		
		
		/*
		if(cm.assertTextEquals(gh07.uname_STTVD,arg1)) 
		{
			System.out.println(" Verified");
		}
		else  
		{	
			System.out.println(" uname_STTVD NOT Verified");
		}
		if(cm.assertTextContains(gh07.fname_STTVD,arg2)) 
		{
			System.out.println(" Verified");
		}
		else 
		{	
			System.out.println(" fname_STTVD NOT Verified");
		}
		if(cm.assertTextEquals(gh07.feedtyp_STTVD,arg3)) 
		{
			System.out.println(" Verified");
		}
		else 
		{	
			System.out.println("feedtyp_STTVD NOT Verified");
		}
		if(cm.assertTextEquals(gh07.status_STTVD,arg4)) 
		{
			System.out.println(" Verified");
		}
		else 
		{	
			System.out.println("status_STTVD NOT Verified");
		}
		if(cm.assertTextEquals(gh07.totalrows_STTVD,arg5)) 
		{
			System.out.println(" Verified");
		}
		else 
		{	
			System.out.println("totalrows_STTVD NOT Verified");
		}
		if(cm.assertTextEquals(gh07.failedrows_STTVD,arg6)) 
		{
			System.out.println(" Verified");
		}
		else 
		{	
			System.out.println(" failedrows_STTVD NOT Verified");
		}*/
		
		
	//----------------------------------------------------------------------	
		
			
	}

	@Then("^For failed transactions there must be a hyperlink on failed rows and error log page contains same no of failed rows$")
	public void for_failed_transactions_there_must_be_a_hyperlink_on_failed_rows_and_error_log_page_contains_same_no_of_failed_rows() throws Throwable {
	
		counter++;
		
		System.out.println(counter+"_______**************_______________");
	}
	
	
		
		//                                      End of GVSHome07 code Snippets  
	
	
	
	
} // end of step definition