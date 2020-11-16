package com.esspl.capability.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GvsHome07 {
	public WebDriver ldriver;

	public GvsHome07(WebDriver rdriver) {
	ldriver = rdriver ;
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_wrapper\"]/div[1]/div[1]/div[2]")
	@CacheLookup
	public  WebElement trckUpld_Txt;
		
	@FindBy(xpath="//*[@id=\"tblUploadStatus_wrapper\"]/div[1]/div[1]/div[3]")
	@CacheLookup
	public  WebElement trckUpld_advsrch_icon;
	
	@FindBy(id="tblUploadStatusAdvSearch")
	@CacheLookup
	public  WebElement trckUpld_advsrch_popUP;
	
	@FindBy(id="txtUplStatusAdSearchFromDt")
	@CacheLookup
	public  WebElement trckUpld_advsrch_FrmDate;
	
	@FindBy(id="txtUplStatusAdSearchToDt")
	@CacheLookup
	public  WebElement trckUpld_advsrch_ToDate;
	
	@FindBy(id="ddlUplStatusAdSearchFeedTp")
	@CacheLookup
	public  WebElement trckUpld_advsrch_FTypeDrpdwn;
	
	@FindBy(id="chkUplStatusAdSearchUpload")
	@CacheLookup
	public  WebElement trckUpld_advsrch_upldCheck;
	
	@FindBy(id="chkUplStatusAdSearchProcessed")
	@CacheLookup
	public  WebElement trckUpld_advsrch_ProcesCheck;
	
	@FindBy(xpath="/html/body/div[5]/div[2]/button[2]" )
	@CacheLookup   
	public  WebElement trckUpld_advsrchCalandr_Btn;
	
	@FindBy(id="btnApplyFilter")
	@CacheLookup
	public  WebElement trckUpld_advSrch_aplyFltr_btn;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_wrapper\"]/div[1]/div[1]/div[4]/div/button[1]")
	@CacheLookup
	public  WebElement trckUpld_ExclExprt;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_wrapper\"]/div[1]/div[1]/div[4]/div/button[2]")
	@CacheLookup
	public  WebElement trckUpld_Rfrsh;
	
	@FindBy(xpath="/html/body/div[1]/form/div[1]/div/div/div/div/div[1]/div/div[3]/div/div[1]/div[2]/div[2]/div/label[1]/select")
	@CacheLookup
	public  WebElement trckUpld_QckSrch_drpdwn;
	
	@FindBy(xpath="//*[@id=\"uploadByUser\"]")
	@CacheLookup
	public  WebElement trckUpld_Me_chckbx;
	
	@FindBy(id="tblUploadStatus")
	@CacheLookup
	public  WebElement trckUpld_statusGrid;
	
	@FindBy(xpath="/html/body/div[1]/form/div[1]/div/div/div/div/div[1]/div/div[3]/div/div[3]/div[2]/div[1]/div/label")
	@CacheLookup 
	public  WebElement trckUpld_PgPerRcrd_text;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_length\"]/label/select")
	@CacheLookup 
	public  WebElement trckUpld_PgPerRcrd_drpdwn;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_paginate\"]/ul")
	@CacheLookup
	public  WebElement trckUpld_Pgnation_grid;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_paginate\"]/ul")
	@CacheLookup
	public  WebElement trckUpld_paginatnTab;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_first\"]/a")
	@CacheLookup
	public  WebElement trckUpld_paginatnTab_Frst;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_previous\"]/a")
	@CacheLookup
	public  WebElement trckUpld_paginatnTab_Prvs;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_paginate\"]/ul/li[3]/a")
	@CacheLookup
	public  WebElement trckUpld_paginatnTab_1;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_next\"]/a")
	@CacheLookup
	public  WebElement trckUpld_paginatnTab_nxt;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus_last\"]/a")
	@CacheLookup
	public  WebElement trckUpld_paginatnTab_last;
	
	
	
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/thead/tr/th[1]")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/thead/tr/th[1]/button")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_hIcon;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_hIcon_Drpdwn;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[1]/a")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_asc;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[2]/a")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_desc;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[4]/a")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_colmns;
	
	@FindBy(xpath="/html/body/div[1]/form/div[1]/div/div/div/div/div[1]/div/div[2]/ul/li[4]/ul/li[1]/a/label/input")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_colmns_UOLR;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[4]/ul/li[2]/a/label/input")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_colmns_UB;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[4]/ul/li[3]/a/label/input")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_colmns_FN;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[4]/ul/li[4]/a/label/input")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_colmns_FT;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[4]/ul/li[5]/a/label/input")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_colmns_Sts;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[4]/ul/li[6]/a/label/input")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_colmns_POLP;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[4]/ul/li[7]/a/label/input")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_colmns_TR;
	
	@FindBy(xpath="//*[@id=\"divUploadStatus\"]/div/div[2]/ul/li[4]/ul/li[8]/a/label/input")
	@CacheLookup
	public  WebElement trckUpld_UploadedOnLastReceived_colmns_FR;
	
	
	
	
	@FindBy(xpath="/html/body/div[1]/form/div[1]/div/div/div/div/div[1]/div/div[3]/div/div[1]/div[2]/div[2]/div/label[3]/input")
	@CacheLookup
	public  WebElement trckUpld_UploadedBy;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/thead/tr/th[4]")
	@CacheLookup
	public  WebElement trckUpld_Feedtpe;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/thead/tr/th[5]")
	@CacheLookup
	public  WebElement trckUpld_Status;
	
	
	
	//-----------------------------------------------------------------------------
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[1]/td[2]" )
	@CacheLookup 
	public  WebElement trckUpld_TD_username;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[1]/td[3]" )
	@CacheLookup 
	public  WebElement trckUpld_TD_actualfile;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[1]/td[4]" )
	@CacheLookup
	public  WebElement trckUpld_TD_feedtype;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[1]/td[5]" )
	@CacheLookup
	public  WebElement trckUpld_TD_status;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[1]/td[7]" )
	@CacheLookup
	public  WebElement trckUpld_TD_totalRows;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[1]/td[8]" )
	@CacheLookup
	public  WebElement trckUpld_TD_failedRows;
	
	
	
	
	//------------------------------------------------------------------------------------------
		
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[7]/td[2]")
	@CacheLookup
	public  WebElement uname_STTVD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[7]/td[3]")
	@CacheLookup
	public  WebElement fname_STTVD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[7]/td[4]")
	@CacheLookup
	public  WebElement feedtyp_STTVD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[7]/td[5]")
	@CacheLookup
	public  WebElement status_STTVD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[7]/td[7]/p")
	@CacheLookup
	public  WebElement totalrows_STTVD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[7]/td[8]")
	@CacheLookup
	public  WebElement failedrows_STTVD;
	

	//------------------------------------------------------------------------------------------
		
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[6]/td[2]")
	@CacheLookup
	public  WebElement uname_STTDD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[6]/td[3]")
	@CacheLookup
	public  WebElement fname_STTDD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[6]/td[4]")
	@CacheLookup
	public  WebElement feedtyp_STTDD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[6]/td[5]")
	@CacheLookup
	public  WebElement status_STTDD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[6]/td[7]/p")
	@CacheLookup
	public  WebElement totalrows_STTDD;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[6]/td[8]")
	@CacheLookup
	public  WebElement failedrows_STTDD;
	
	

	//------------------------------------------------------------------------------------------
		
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[2]/td[2]")
	@CacheLookup
	public  WebElement uname_STT_VTVID;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[2]/td[3]")
	@CacheLookup
	public  WebElement fname_STT_VTVID;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[2]/td[4]")
	@CacheLookup
	public  WebElement feedtyp_STT_VTVID;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[2]/td[5]")
	@CacheLookup
	public  WebElement status_STT_VTVID;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[2]/td[7]/p")
	@CacheLookup
	public  WebElement totalrows_STT_VTVID;
	
	@FindBy(xpath="//*[@id=\"tblUploadStatus\"]/tbody/tr[2]/td[8]")
	@CacheLookup
	public  WebElement failedrows_STT_VTVID;
	
	

	//------------------------------------------------------------------------------------------
		
	
}
