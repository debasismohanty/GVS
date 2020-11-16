package com.esspl.capability.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GvsHome01 {
	
	public WebDriver ldriver;

	public GvsHome01(WebDriver rdriver) {
	ldriver = rdriver ;
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[1]")
	@CacheLookup
	public  WebElement hamburger_icon;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[1]/a")
	@CacheLookup
	public  WebElement hamburger_menu;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/nav/div[1]/a/img")
	@CacheLookup
	public  WebElement titan_logo;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/nav/div[2]/div[1]/ul[1]/li/a/i")
	@CacheLookup 
	public  WebElement home_icon;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/nav/div[2]/div[1]/ul[1]/li/a/i")
	@CacheLookup 
	public  WebElement home_icon_right;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/nav/div[2]/div[1]/ul[2]/li")
	@CacheLookup    
	public  WebElement welcomeUserCntre;
		
	@FindBy(xpath="//*[@id=\"frmSpa\"]/nav/div[2]/div[1]/ul[2]/li")
	@CacheLookup    
	public  WebElement welcomeUserRight;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/nav/div[2]/div[1]/ul[2]/li/ul/li[1]/a")
	@CacheLookup
	public  WebElement username_administration;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/nav/div[2]/div[1]/ul[2]/li/ul/li[3]/a")
	@CacheLookup
	public  WebElement username_preferences;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/nav/div[2]/div[1]/ul[2]/li/ul/li[3]/a")
	@CacheLookup
	public  WebElement usernamePrefRght;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/nav/div[2]/div[1]/ul[4]/li/a/i")
	@CacheLookup
	public   WebElement goToHelp_icon;
	
	@FindBy(id="listGlobalFilters")
	@CacheLookup
	public  WebElement GlobalFilterslist;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[1]/ul/li[1]/a")
	@CacheLookup
	public  WebElement inbound_calender ;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[1]/ul/li[2]/a")
	@CacheLookup
	public  WebElement control_Tower ;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[1]/ul/li[3]/a")
	@CacheLookup
	public  WebElement shipmentSummary ;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[1]/ul/li[4]/a")
	@CacheLookup
	public  WebElement invoice ;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[1]/ul/li[5]/a")
	@CacheLookup
	public  WebElement gitDashboard ;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div")
	@CacheLookup
	public  WebElement h_slidingdrawer ;
	
	@FindBy(id="chkIsCBM")
	@CacheLookup
	public  WebElement inboundShipmentSwitch ;
	
	@FindBy(xpath="//*[@id=\"divChartAreaToday\"]/svg")
	@CacheLookup
	public  WebElement ShipmentSummeryGraph ;
	
	@FindBy(xpath="//*[@id=\"divChartAreaThisWeek\"]/svg")
	@CacheLookup
	public  WebElement GoodsInTransitGraph;
	
    @FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/span")
	@CacheLookup
	public  WebElement ShipmentSummeryGraph_Text ;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/span")
	@CacheLookup
	public  WebElement GoodsInTransitGraph_Text ;
		
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[2]/div/div[2]")
	@CacheLookup
	public  WebElement MyAlertSection ;
	
	@FindBy(id="ddlDateType")
	@CacheLookup
	public static WebElement myAlertsCreatedOn_ETA;
	
	@FindBy(id="ddlMySelectionDate")
	@CacheLookup
	public static WebElement myAlertsCurrentWeek ;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/button")
	@CacheLookup
	public static WebElement myAlertRefresh;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/button")
	@CacheLookup
	public static WebElement myAlertSearch;
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/a")
	@CacheLookup
	public static WebElement myAlertDelete;
	
	@FindBy(id="p1")
	@CacheLookup
	public static WebElement myAlertsP1 ;
	
	@FindBy(id="p2")
	@CacheLookup
	public static WebElement myAlertsP2 ;
	
	@FindBy(id="p3")
	@CacheLookup
	public static WebElement myAlertsP3 ;
	
	@FindBy(id="Al")
	@CacheLookup
	public static WebElement myAlertsAlert ;
	
	@FindBy(id="btnUnreadOnly")
	@CacheLookup
	public static WebElement myAlertsUnreadOnly ;
	
	@FindBy(xpath="//*[@id=\"tblAlerts_wrapper\"]/div/div/div[1]/div/table/thead/tr/th[1]")
	@CacheLookup
	public static WebElement myAlertsDocketsNo_AWBNo ;
		
	
	// User selects hamburger menu icon
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[1]/ul/li[1]")
	@CacheLookup
	public WebElement hVisibility;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[5]/ul/li[1]")
	@CacheLookup
	public WebElement hAdministration;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[2]/ul/li[1]")
	@CacheLookup
	public  WebElement hShipment;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[6]/ul/li[1]")
	@CacheLookup
	public  WebElement hConfiguration;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[3]/ul/li[1]")
	@CacheLookup
	public  WebElement hFindAshipment;
	
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[1]/ul/li[2]/a")
	@CacheLookup
	public  WebElement h_inboundCalander;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[1]/ul/li[3]/a")
	@CacheLookup
	public  WebElement h_searchAndExport;
	
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[1]/ul/li[4]/a")
	@CacheLookup
	public  WebElement h_dataUpload;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[1]/ul/li[5]")
	@CacheLookup
	public WebElement h_trackUploadStatus;
	
	
	
	// user clicks on shipment summery icon
	
	
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[1]/ul/li[6]/a")
	@CacheLookup
	public WebElement h_gitDashboard;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[1]/ul/li[7]/a")
	@CacheLookup
	public WebElement h_reprocessInvoice;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[5]/ul/li[2]/a")
	@CacheLookup
	public WebElement h_rolesAndPermissions;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[5]/ul/li[3]/a")
	@CacheLookup
	public WebElement h_users;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[5]/ul/li[4]/a")
	@CacheLookup
	public WebElement h_preferences;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[2]/ul/li[2]/a")
	@CacheLookup
	public WebElement h_invoices;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[2]/ul/li[3]/a")
	@CacheLookup
	public WebElement h_shipmentSummery;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[6]/ul/li[2]/a")
	@CacheLookup
	public WebElement h_masterData;
	
	@FindBy(id="txtShipMentFind")
	@CacheLookup
	public WebElement h_EnterDocketNo;
	
	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[3]/ul/li[2]/div/div/span/button/i")
	@CacheLookup
	public WebElement h_findShipmentSearch_btn;
	
	
	// user clicks on global filters
	
	@FindBy(xpath="//*[@id=\"listGlobalFilters\"]/div/div[2]/p[1]/i")
	@CacheLookup
	public WebElement GlobalFilters_ShipmentType;
			
	@FindBy(xpath="//*[@id=\"listGlobalFilters\"]/div/div[2]/p[2]/i")
	@CacheLookup
	public WebElement GlobalFilters_ShipmentRegions;
	
	@FindBy(xpath="//*[@id=\"globalFilter\"]/div[1]/label")
	@CacheLookup
	public WebElement FilterByShipmentType_text;
	
	@FindBy(id="lblDisplayFilterBrands")
	@CacheLookup
	public WebElement Selected_ShipmentType;
	
	@FindBy(xpath="//*[@id=\"globalFilter\"]/div[2]/label")
	@CacheLookup
	public WebElement FilterByOrigin_text;
	
	@FindBy(id="lblDisplayFilterDest")
	@CacheLookup
	public WebElement Selected_Regions;
	
  // Filter by Shipment Type 			
	@FindBy(id="txtSrchBrands")
	@CacheLookup
	public WebElement GlobalFilters_SearchShipmentType;
			
	@FindBy(xpath="//*[@id=\"mha-brands\"]/div/span/button")
	@CacheLookup
	public WebElement GF_ShipmentType_SelectDeselectAll;
			
	@FindBy(xpath="//*[@id=\"mha-brands\"]/ul/li[1]")
	@CacheLookup
	public WebElement GF_NonPrecious_checkBox;
			
	@FindBy(xpath="//*[@id=\"mha-brands\"]/ul/li[2]")
	@CacheLookup
	public WebElement GF_Precious_checkBox;
			
 //	Filter by Origin
	@FindBy(id="txtSrchDest")
	@CacheLookup
	public WebElement GlobalFilters_SearchOrigin;
			
	@FindBy(xpath="//*[@id=\"mha-dest\"]/div/span/button")
	@CacheLookup
	public WebElement GF_SearchOrigin_DeselectAll;
			
	@FindBy(xpath="//*[@id=\"mha-dest\"]/ul/li[1]/span[1]")
	@CacheLookup
	public WebElement GlobalFilters_EastCheckbox;
			
	@FindBy(xpath="//*[@id=\"mha-dest\"]/ul/li[2]/span[1]")
	@CacheLookup
	public WebElement GlobalFilters_NorthCheckbox;
			
	@FindBy(xpath="//*[@id=\"mha-dest\"]/ul/li[3]/span[1]")
	@CacheLookup
	public WebElement GlobalFilters_SouthCheckbox;
			
	@FindBy(xpath="//*[@id=\"mha-dest\"]/ul/li[4]/span[1]")
	@CacheLookup
	public WebElement GlobalFilters_WestCheckbox;
	
	@FindBy(xpath="//*[@id=\"mha-dest\"]/ul/li[1]/span[2]")
	@CacheLookup
	public WebElement GF_EastText;
			
	@FindBy(xpath="//*[@id=\"mha-dest\"]/ul/li[2]/span[2]")
	@CacheLookup
	public WebElement GF_NorthText;
			
	@FindBy(xpath="//*[@id=\"mha-dest\"]/ul/li[3]/span[2]")
	@CacheLookup
	public WebElement GF_SouthText;
			
	@FindBy(xpath="//*[@id=\"mha-dest\"]/ul/li[4]/span[2]")
	@CacheLookup
	public WebElement GF_WestText;
			
	@FindBy(id="mha-applyfilter")
	@CacheLookup
	public WebElement GlobalFilters_ApplyFilters_btn;
	
	
	// user clicks on shipment summery icon
	
	@FindBy(xpath="//*[@id=\"frmSpa\"]/div[1]/div/div/div/div[1]/div[1]/div[1]/span")
	@CacheLookup
	public WebElement ShipmentSummeryPage_Text;
	
	
	@FindBy(xpath="//*[@id=\\\"frmSpa\\\"]/div[1]/div/div/div/div[1]/div[1]/div[2]/button/i")
	@CacheLookup
	public WebElement ShipSumm_FilterIcon;
	
	@FindBy(xpath="//*[@id=\"btn_Export\"]")
	@CacheLookup
	public WebElement ShipSumm_ExcelExport;
	
	@FindBy(id="tblTrackShipment_length")
	@CacheLookup
	public WebElement Shipsumm_reccPerPage;
	
	
			
	
	
	
	
}