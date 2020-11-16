//package com.esspl.capability.pageObjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class GvsHome9 {
//	public WebDriver ldriver;
//
//	public GvsHome9(WebDriver rdriver) {
//	ldriver = rdriver ;
//	PageFactory.initElements(rdriver,this);
//	}
//	
//	@FindBy(xpath="//*[@id=\"divMainMenuSection\"]/div[2]/div/div/div[1]/ul/li[6]/a")
//	@CacheLookup
//	public  WebElement gitDashboard;
//		
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking_wrapper\"]/div[1]/div[1]/div[4]/div/button")
//	@CacheLookup
//	public  WebElement exclExpotrGITDashbrd;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking_wrapper\"]/div[1]/div[1]/div[3]/button")
//	@CacheLookup
//	public  WebElement quckSrchGITDashbrd;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking_length\"]")
//	@CacheLookup
//	public  WebElement recPerPageGITDashbrd;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking_paginate\"]/ul")
//	@CacheLookup
//	public  WebElement pagnitationGITDashbrd;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[1]")
//	@CacheLookup
//	public  WebElement lmoGITDashbrd;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[2]")
//	@CacheLookup
//	public  WebElement  stGITDashbrd;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[3]")
//	@CacheLookup
//	public  WebElement cnGITDashbrd;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[4]")
//	@CacheLookup
//	public  WebElement ;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[5]")
//	@CacheLookup
//	public  WebElement  ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[6]")
//	@CacheLookup
//	public  WebElement ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[7]")
//	@CacheLookup
//	public  WebElement ;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[8]")
//	@CacheLookup
//	public  WebElement  ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[9]")
//	@CacheLookup
//	public  WebElement ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[10]")
//	@CacheLookup
//	public  WebElement ;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[11]")
//	@CacheLookup
//	public  WebElement  ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[12]")
//	@CacheLookup
//	public  WebElement ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[13]")
//	@CacheLookup
//	public  WebElement ;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[14]")
//	@CacheLookup
//	public  WebElement  ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[15]")
//	@CacheLookup
//	public  WebElement ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[16]")
//	@CacheLookup
//	public  WebElement ;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[17]")
//	@CacheLookup
//	public  WebElement  ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[18]")
//	@CacheLookup
//	public  WebElement ;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[19]")
//	@CacheLookup
//	public  WebElement ;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[20]")
//	@CacheLookup
//	public  WebElement  ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[21]")
//	@CacheLookup
//	public  WebElement ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[22]")
//	@CacheLookup
//	public  WebElement ;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[23]")
//	@CacheLookup
//	public  WebElement  ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[24]")
//	@CacheLookup
//	public  WebElement ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[25]")
//	@CacheLookup
//	public  WebElement ;
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[26]")
//	@CacheLookup
//	public  WebElement  ;
//	
//	
//	@FindBy(xpath="//*[@id=\"tbl_ShipmentTacking\"]/thead/tr/th[27]")
//	@CacheLookup
//	public  WebElement ;
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//	//------------------------------------------------------------------------------------------
//		
//	
//}
