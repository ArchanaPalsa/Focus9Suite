package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.focus.Pages.ItemMasterCustomizationPage;
import com.focus.base.BaseEngine;

public class ItemMasterCustomizationTest extends BaseEngine 
{

	ItemMasterCustomizationPage  imcp;
	
	/*@Test(priority=2000)
	public void checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		imcp=new ItemMasterCustomizationPage(getDriver());
	  Assert.assertEquals(imcp.checkRestoreCompany(), true);
	}*/
	

	@Test(priority=2001)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		imcp=new ItemMasterCustomizationPage(getDriver());
		Assert.assertEquals(imcp.checkLogin(), true);
	 }
	
	 @Test(priority=2002)
	  public void checkCustomizeMasterInfoPanelCustomizationAddingPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkCustomizeMasterInfoPanelCustomizationAddingPanel(), true);
	
	  }

	  @Test(priority=2003)
	  public void checkValidatingDashletAddedInInfoPanelCustomizePopup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkValidatingDashletAddedInInfoPanelCustomizePopup(), true);
	
	  }
	  
	  @Test(priority=2004)
	  public void checkValidatingDashletAddedInInfoPanelBySelectingTestMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkValidatingDashletAddedInInfoPanelBySelectingTestMaster(), true);
	
	  }
	  	 
	 @Test(priority=2005)
	  public void checkSavingItemWithAnImageForInfoPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkSavingItemWithAnImageForInfoPanel(), true);
	
	  }
	 
	 @Test(priority=2006)
	  public void checkCustomizeMasterImageInfoPanelCustomizationAddingPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkCustomizeMasterImageInfoPanelCustomizationAddingPanel(), true);
	
	  }
	 
	 @Test(priority=2007)
	  public void checkValidatingImageInfoPanelInCustomizePopup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkValidatingImageInfoPanelInCustomizePopup(), true);
	
	  }
	 
	 @Test(priority=2008)
	  public void checkValidatingDashletAddedInImageInfoPanelBySelectingImageItemInMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkValidatingDashletAddedInImageInfoPanelBySelectingImageItemInMaster(), true);
	
	  }
	  
	
	 @Test(priority=2009)
	 public void checkSavingRuleWithConditionForDefaultCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			imcp=new ItemMasterCustomizationPage(getDriver());
			Assert.assertEquals(imcp.checkSavingRuleWithConditionForDefaultCode(), true);
	 }
	 
	 @Test(priority=2010)
	 public void checkOkButtonAfterSavingRule() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			imcp=new ItemMasterCustomizationPage(getDriver());
			Assert.assertEquals(imcp.checkOkButtonAfterSavingRule(), true);
	 }
	 
	 
		
	 @Test(priority=2011)
	 public void checkRuleOnSavingItemWithExtraFieldInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			imcp=new ItemMasterCustomizationPage(getDriver());
			Assert.assertEquals(imcp.checkRuleOnSavingItemWithExtraFieldInCreateTab(), true);
	}
		
	@Test(priority=2012)
	public void checkRuleValidationAccordingToRuleWithCondition() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
			imcp=new ItemMasterCustomizationPage(getDriver());
			Assert.assertEquals(imcp.checkRuleValidationAccordingToRuleWithCondition(), true);
	}	 
	
	
	
	@Test(priority=2013)
	public void checkRulesTabUnderMasterCustomizationUnderCreateTAB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		imcp=new ItemMasterCustomizationPage(getDriver());
		Assert.assertEquals(imcp.checkRulesTabUnderMasterCustomizationUnderCreateTAB(), true);
	 }
	
	@Test(priority=2014)
	public void checkSavingItemWithDefaultCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		imcp=new ItemMasterCustomizationPage(getDriver());
		Assert.assertEquals(imcp.checkSavingItemWithDefaultCode(), true);
	 }
	
	@Test(priority=2015)
	public void checkValidatinItemCodeIsAccordingToRule() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		imcp=new ItemMasterCustomizationPage(getDriver());
		Assert.assertEquals(imcp.checkValidatinItemCodeIsAccordingToRule(), true);
	 }
	
	 
	  @Test(priority=2016)
	  public void checkRuleSavingUnderRuleOptionUnderAccountMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkRuleSavingUnderRuleOptionUnderAccountMasters(), true);
	
	  }
	
	 @Test(priority=2017)
	  public void checkSavingItemForGlobalRule() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkSavingItemForGlobalRule(), true);
	
	  }
	
	 @Test(priority=2018)
	  public void checkValidatingGlobalItemCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkValidatingGlobalItemCode(), true);
	
	  }
	 
	 @Test(priority=2019)
	  public void checkValidatingElseCoditionForGobalitem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkValidatingElseCoditionForGobalitem(), true);
	
	  }
	 
	 @Test(priority=2020)
	  public void checkValidatingRuleElseConditionForGloablitem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkValidatingRuleElseConditionForGloablitem(), true);
	
	  }
	 
	 @Test(priority=2021)
	  public void checkABCReportsInCustomizeItemMasterReportsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkABCReportsInCustomizeItemMasterReportsTab(), true);
	
	  }
	 
	 @Test(priority=2022)
	  public void checkLogoutAndLoginAfterAddingReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkLogoutAndLogin(), true);
	
	  }
	 
	 @Test(priority=2023)
	  public void checkABCAnalysisDisplayingInMasterRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkABCAnalysisDisplayingInMasterRibbonControl(), true);
	
	  }
	 
	 @Test(priority=2024)
	  public void checkABCAnalysisReportforAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  imcp=new  ItemMasterCustomizationPage(getDriver());
		  Assert.assertEquals(imcp.checkABCAnalysisReportforAllItems(), true);
	
	  }
	 
	 
	 
	  
	  
	  
	  
}





