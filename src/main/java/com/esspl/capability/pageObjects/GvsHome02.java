package com.esspl.capability.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GvsHome02 {
	
	public WebDriver ldriver;

	public GvsHome02(WebDriver rdriver) {
	ldriver = rdriver ;
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="ddlFeedType")
	@CacheLookup
	public WebElement selectUploadFeedType;
	
	@FindBy(id="ancDownload")
	@CacheLookup
	public WebElement templateDownload_btn;
	
	@FindBy(id="btnBrowse")
	@CacheLookup
	public WebElement selectFile_btn;
	
	@FindBy(id="btnUpload")
	@CacheLookup
	public WebElement upload_btn;
	
	@FindBy(xpath="//*[@id=\"btnClose\"]")
	@CacheLookup 
	public WebElement closeUploadFeed_btn ;
	
	@FindBy(xpath="//*[@id=\"tblUploadProgress\"]/thead/tr/th")
	@CacheLookup  
	public WebElement fileSelected_msgb;
	
	@FindBy(xpath="//*[@id=\"tblUploadProgress\"]/tbody/tr/td[2]/div/div")
	@CacheLookup
	public WebElement fileSuccessfulStatus;
	
	@FindBy(xpath="//*[@id=\"tblUploadProgress\"]/tbody/tr/td[2]/span")
	@CacheLookup
	public WebElement inValid_fileFormat_msg;
	
}
	