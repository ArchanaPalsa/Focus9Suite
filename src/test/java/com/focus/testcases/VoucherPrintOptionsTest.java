package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.VoucherPrintOptionsPage;
import com.focus.base.BaseEngine;

public class VoucherPrintOptionsTest extends BaseEngine
{
	VoucherPrintOptionsPage VPO;


	// Buyer Pricebook Validations

	/*@Test(priority=10050)
	 public void checkSavingPurchaseVoucherVATVoucher1WithAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 VPO=new VoucherPrintOptionsPage(getDriver());
		 Assert.assertEquals(VPO.checkSavingPurchaseVoucherVATVoucher1WithAllItems(), true);
	 }

	  @Test(priority=10051)
	  public void checkSavingPurchaseVoucherVATVoucher2() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSavingPurchaseVoucherVATVoucher2(), true);
	  }
	 */

	
	@Test(priority=10051)
	public void checkAccouncreatedForPrintEmailOne() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccouncreatedForPrintEmailOne(), true);
	}

	@Test(priority=10052)
	public void checkAccouncreatedForPrintEmailTwo() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccouncreatedForPrintEmailTwo(), true);
	}

	@Test(priority=10053)
	public void checkAccouncreatedForPrintEmailThree() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccouncreatedForPrintEmailThree(), true);
	}

	@Test(priority=10054)
	public void checkSavingReceiptsVoucherForEmailAccountOne() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingReceiptsVoucherForEmailAccountOne(), true);
	}

	@Test(priority=10055)
	public void checkSavingReceiptsvoucherForEmailAccountTwo() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingReceiptsvoucherForEmailAccountTwo(), true);
	}

	@Test(priority=10056)
	public void checkSavingReceiptsVoucherForEmailAccountThree() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingReceiptsVoucherForEmailAccountThree(), true);
	}

	@Test(priority=10057)
	public void checkSendingReceiptsEmailsForEveryAccount() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSendingReceiptsEmailsForEveryAccount(), true);
	}

	//@Test(priority=10058)
	public void checkPrintEmailOneOptionInReceiptsVoucherVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintEmailOneOptionInReceiptsVoucherVAT(), true);
	}

	//@Test(priority=10059)//No need beacuse we can validate in the above test case itself..
	public void checkPrintEmailTwoOptionInReceiptsVoucherVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintEmailTwoOptionInReceiptsVoucherVAT(), true);
	}

	//@Test(priority=10060)//No need beacuse we can validate in the above test case itself..
	public void checkPrintEmailThreeOptionInReceiptsVoucherVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintEmailThreeOptionInReceiptsVoucherVAT(), true);
	}
	// Voucher Print Validations


	@Test(priority=10101)
	public void checkPrintScreenOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintScreenOptions(), true);
	}

	@Test(priority=10102)
	public void checkLayoutOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutOptions(), true);
	}

	@Test(priority=10103)
	public void checkInvoiceDesignOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkInvoiceDesignOptions(), true);
	}

	@Test(priority=10104)
	public void checkFieldsTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkFieldsTabOptions(), true);
	}

	@Test(priority=10105)
	public void checkDragandDropHeaderFiledsAndBodyFiledsIntoLayout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkDragandDropHeaderFiledsAndBodyFiledsIntoLayout(), true);
	}

	@Test(priority=10106)
	public void checkChangeFieldPropertiesInLyout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkChangeFieldPropertiesInLyout(), true);
	}

	@Test(priority=10107)
	public void checkPrintPdfOfPurchaseVoucherVATWithCreatedLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfOfPurchaseVoucherVATWithCreatedLayout(), true);
	}


	@Test(priority=10108)
	public void checkCreatingLayoutWithTwoPages() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkCreatingLayoutWithTwoPages(), true);
	}

	@Test(priority=10109)
	public void checkChangeFieldPropertiesInLayoutForMultiplePages() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkChangeFieldPropertiesInLayoutForMultiplePages(), true);
	}	  


	@Test(priority=10110)
	public void checkPrintPdfOfLayoutForMultiplePages() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfOfLayoutForMultiplePages(), true);
	}

	//1
	@Test(priority=10114)
	public void checkCreatingLayoutforGridPropertiesForClubByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkCreatingLayoutforGridProperties(), true);
	}


	//@Test(priority=10115)
	public void checkLayoutFieldProperties() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutFieldProperties(), true);
	}


	@Test(priority=10116)
	public void checkGridProperties_ClubByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridProperties_ClubByItem(), true);
	}


	@Test(priority=10117)
	public void checkPrintPdfWithEnablingDontClubIfRatesAreDiff() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfWithEnablingDontClubIfRatesAreDiff(), true);
	}

	@Test(priority=10118)
	public void checkDisablingIfRatesAreNotDifferentInLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkDisablingIfRatesAreNotDifferentInLayout(), true);
	}

	@Test(priority=10119)
	public void checkPrintPdfAfterDisablingRatesCheckBox() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfAfterDisablingRatesCheckBox(), true);
	}


	@Test(priority=10120)
	public void checkGridProperties_ClubByWarehouse() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridProperties_ClubByWarehouse(), true);
	}

	@Test(priority=10121)
	public void checkPrintpdfForLayoutWithClubByWarehouse() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintpdfForLayoutWithClubByWarehouse(), true);
	}
	//2
	@Test(priority=10122)
	public void checkLayoutForGridPropertiesGroupByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutForGridPropertiesGroupBy(), true);
	}


	//@Test(priority=10123)
	public void checkLayoutForFieldPropertiesGroupByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutForFieldPropertiesGroupBy(), true);
	}

	@Test(priority=10124)
	public void checkGridproperties_GroupByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridproperties_GroupByItem(), true);
	}


	@Test(priority=10125)
	public void checkPrintPdfGridPropertiesGroupByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfGridPropertiesGroupByItem(), true);
	}

	@Test(priority=10126)
	public void checkEnableCheckboxesInGroupBy() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEnableCheckboxesInGroupBy(), true);
	}

	@Test(priority=10127)
	public void checkPrintPdfAfterEnablingCheckboexInGroupBy() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfAfterEnablingCheckboexInGroupBy(), true);
	}


	//3
	@Test(priority=10128)
	public void checkLayoutForGridPropertiesOrderByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutForGridPropertiesOrderByItem(), true);
	}


	//@Test(priority=10129)
	public void checkLayoutForFieldPropertiesOrderByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutForFieldPropertiesOrderByItem(), true);
	}

	@Test(priority=10130)
	public void checkGridproperties_OrderbyItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridproperties_OrderbyItem(), true);
	}

	@Test(priority=10131)
	public void checkPrintPdfGridPropertiesOrderByItem() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfGridPropertiesOrderByItem(), true);
	}

	//issue
	//  @Test(priority=10132)
	public void checkEnableCheckboxesInOderBy() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkEnableCheckboxesInOderBy(), true);
	}


	//@Test(priority=10133)
	public void checkPrintPdfAfterEnablingCheckboexInOderBy() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfAfterEnablingCheckboexInOderBy(), true);
	}

	//4
	@Test(priority=10134)
	public void checkLayoutGridProperties() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutGridProperties(), true);
	}

	//@Test(priority=10135)
	public void checkLayoutFieldPropries() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutFieldPropries(), true);
	}


	@Test(priority=10136)
	public void checkGridPropertiesInPvVatLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkGridPropertiesInPvVatLayout(), true);
	}


	@Test(priority=10137)
	public void checkPrintPdfAfterGridPropertiesEnabledToTrue() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfAfterGridPropertiesEnabledToTrue(), true);
	}

	//5
	//area
	@Test(priority=10138)
	public void checkAreaInPurchaseVatLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAreaInPurchaseVatLayout(), true);
	}


	// @Test(priority=10139)
	public void checkFiledProperitesForArea() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkFiledProperitesForArea(), true);
	}


	@Test(priority=10140)
	public void checkDragnetVouchernetAndAreaItoLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkDragnetVouchernetAndAreaItoLayout(), true);
	}


	@Test(priority=10141)
	public void checkPrintPdfForAreaLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfForAreaLayout(), true);
	}


	@Test(priority=10142)
	public void checkChangeAreaPropertiesToRelative() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkChangeAreaPropertiesToRelative(), true);
	}


	@Test(priority=10143)
	public void checkPrintPDFForAreaLayoutAfterChangingToRealtive() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForAreaLayoutAfterChangingToRealtive(), true);
	}

	
	
	@Test(priority=10144)
	public void checkAccountsCreationForMulipleandSinglePrintLayoutAssign() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccountsCreationForMulipleandSinglePrintLayoutAssign(), true);
	}

	@Test(priority=10145)
	public void checkAccountRadiobtnAndPrintUsingCheckboxinbothPrefAndDocCust() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAccountRadiobtnAndPrintUsingCheckboxinbothPrefAndDocCust(), true);
	}

	@Test(priority=10146)
	public void checkSavingPvVatForMultiplePrintLayoutAccount() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingPvVatForMultiplePrintLayoutAccount(), true);
	}
	
	

	@Test(priority=10147)
	public void checkSavingPvVatForSinglePrintLayoutAccount() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingPvVatForSinglePrintLayoutAccount(), true);
	}

	@Test(priority=10148)
	public void chechPrintPdfForMultipleLayoutVoucher() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.chechPrintPdfForMultipleLayoutVoucher(), true);
	}

	//6
	@Test(priority=10149)
	public void checkAddingPrintLayoutForNoofCopies() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAddingPrintLayoutForNoofCopies(), true);
	}


	@Test(priority=10150)
	public void checkLayoutPropertiesPageType() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkLayoutPropertiesPageType(), true);
	}



	@Test(priority=10151)
	public void checkPrintPdfWithoutChangingNamesInReports() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfWithoutChangingNamesInReports(), true);
	}



	@Test(priority=10152)
	public void checkSettingLayoutLayoutNamesInReports() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSettingLayoutLayoutNamesInReports(), true);
	}




	@Test(priority=10153)
	public void checkPrintPDFAfterChangingNamesInReports() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFAfterChangingNamesInReports(), true);
	}



	@Test(priority=10154)
	public void checkAddingFieldsInPvVatHeader() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAddingFieldsInPvVatHeader(), true);
	}


	@Test(priority=10155)
	public void checkAddingFieldsInPvVATBody() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkAddingFieldsInPvVATBody(), true);
	}



	@Test(priority=10156)
	public void checkSavingPvVATWithDocAndPictures() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingPvVATWithDocAndPictures(), true);
	}


	//7
	@Test(priority=10157)
	public void checkSavingDesignLayourForAttachments() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavingDesignLayourForAttachments(), true);
	}


	@Test(priority=10158)
	public void checkPropertiesForLayoutAttachments() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPropertiesForLayoutAttachments(), true);
	}


	@Test(priority=10159)
	public void checkPrintPDFForAttachmentsLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPDFForAttachmentsLayout(), true);


	}

	@Test(priority=10165)
	public void checkSaveDateValidationLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSaveDateValidationLayout(), true);
	}

	@Test(priority=10166)
	public void checkprintPdfForDateValidation() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkprintPdfForDateValidation(), true);
	}

	//@Test(priority=10170)
	  public void checkSavePrintLayoutAsXMLFile() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkSavePrintLayoutAsXMLFile(), true);
	  }



	//@Test(priority=10172)
	  public void checkPrintPDFOfImportedXMLLayoutFile() throws AWTException, Exception
	  {
		  VPO=new VoucherPrintOptionsPage(getDriver());
		  Assert.assertEquals(VPO.checkPrintPDFOfImportedXMLLayoutFile(), true);

	  }

	@Test(priority=11129)
	public void checkCreatingLayoutForShapesLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkCreatingLayoutForShapesLayout(), true);
	}

	@Test(priority=11130)
	public void CheckShapesPropertiesInPurchaseVatDesignLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.CheckShapesPropertiesInPurchaseVatDesignLayout(), true);
	}

	@Test(priority=11131)
	public void checkPrintPdfofShapesLayout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintPdfofShapesLayout(), true);
	}

	@Test(priority=11132)
	public void checkPreviewOptionInPVVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPreviewOptionInPVVAT(), true);
	}

	@Test(priority=11133)
	public void checkPrintOutputOptionsPrintInPvVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintOutputOptionsPrintInPvVAT(), true);
	}

	@Test(priority=11134)
	public void checkPrintAndEmailOutputOptionInPVVAT() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPrintAndEmailOutputOptionInPVVAT(), true);
	}

	@Test(priority=11140)
	public void checkSavePurchaseVoucher() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavePurchaseVoucher(), true);
	}

	@Test(priority=11141)
	public void checkSavePurchaseVoucher2() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavePurchaseVoucher2(), true);
	}

	@Test(priority=11142)
	public void checkSavePurchaseVoucher3() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSavePurchaseVoucher3(), true);
	}
	
	@Test(priority=11143)
	public void checkFilterInPurchasesVoucherHomePage() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkFilterInPurchasesVoucherHomePage(), true);
	}
	
	@Test(priority=11144)
	public void checkPurchasesAccountAndVendorAccInFilter() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkPurchasesAccountAndVendorAccInFilter(), true);
	}

	@Test(priority=21110)
	public void checkValidateCustomerStatementsReport() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateCustomerStatementsReport(), true);
	}


	//Send Multiple emails to multiple customers and check any customer email data for verification
	@Test(priority=21111)
	public void checkSendCustomerStatementsReportsEmailVerificationsCreatedAccounts() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSendCustomerStatementsReportsEmailVerificationsCreatedAccounts(), true);
	}


	//@Test(priority=21112)
	public void checkValidateEmailAccountOneInBothCustomerStatementsAndEmailAccountOne() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateEmailAccountOneInBothCustomerStatementsAndEmailAccountOne(), true);
	}
	
	//@Test(priority=21113)
	public void checkValidateEmailAccountTwoInBothCustomerStatementsAndEmailAccountTwo() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateEmailAccountTwoInBothCustomerStatementsAndEmailAccountTwo(), true);
	}
	
	
	@Test(priority=21114)
	public void checklogout() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checklogout(), true);
	}
	
	
	
	
	///Not Needed
	
	

	/*
	@Test(priority=11113)
	public void checkValidateCustomerDueDateAnalysisReport() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateCustomerDueDateAnalysisReport(), true);
	}
	

	@Test(priority=11114)
	public void checkSendCustomerDueDateAnalysisReportEmailVeriForCreatedAccounts() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSendCustomerDueDateAnalysisReportEmailVeriForCreatedAccounts(), true);
	}

	 @Test(priority=11115)
	public void checkValidateEmailAccountOneInBothCustomerDueDateAnalysisAndEmailAccountOne() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateEmailAccountOneInBothCustomerDueDateAnalysisAndEmailAccountOne(), true);
	}


	@Test(priority=11127)
	public void checkSendStockMovementReportEmailVerForCreatedAccounts() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkSendStockMovementReportEmailVerForCreatedAccounts(), true);
	}

	//  @Test(priority=11128)
	public void checkValidateEmailAccountOneInBothStockMovementReportAndEmailAccountOne() throws AWTException, Exception
	{
		VPO=new VoucherPrintOptionsPage(getDriver());
		Assert.assertEquals(VPO.checkValidateEmailAccountOneInBothStockMovementReportAndEmailAccountOne(), true);
	}

	
	
	
		// @Test(priority=11113)
		public void checkValidateEmailAccountTwoInBothCustomerStatementsAndEmailAccountTwo() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccountTwoInBothCustomerStatementsAndEmailAccountTwo(), true);
		}

		// @Test(priority=11114)
		public void checkValidateEmailAccountThreeInBothCustomerStatementsAndEmailAccountThree() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccountThreeInBothCustomerStatementsAndEmailAccountThree(), true);
		}
		

		// @Test(priority=11117)
		public void checkValidateEmailAccountTwoInBothCustomerDueDateAnalysisAndEmailAccountTwo() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccountTwoInBothCustomerDueDateAnalysisAndEmailAccountTwo(), true);
		}

		// @Test(priority=11118)
		public void checkValidateEmailAccounThreeInBothCustomerDueDateAnalysisAndEmailAccountThree() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccounThreeInBothCustomerDueDateAnalysisAndEmailAccountThree(), true);
		}

		@Test(priority=11119)
		public void checkSendVendorAgeingSummaryAnalysisReportEmailVerForCreatedAccounts() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkSendVendorAgeingSummaryAnalysisReportEmailVerForCreatedAccounts(), true);
		}

		//  @Test(priority=11120)
		public void checkValidateEmailAccountOneInBothVendorAgeingSummaryAnalysisAndEmailAccountOne() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccountOneInBothVendorAgeingSummaryAnalysisAndEmailAccountOne(), true);
		}

		// @Test(priority=11121)
		public void checkValidateEmailAccountTwoInBothVendorAgeingSummaryAnalysisAndEmailAccountTwo() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccountTwoInBothVendorAgeingSummaryAnalysisAndEmailAccountTwo(), true);
		}


		//@Test(priority=11122)
		public void checkValidateEmailAccountThreeInBothVendorAgeingSummaryAnalysisAndEmailAccountThree() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccountThreeInBothVendorAgeingSummaryAnalysisAndEmailAccountThree(), true);
		}



		@Test(priority=11123)
		public void checkSendVendorSummaryAgeingByDueDateReportEmailVer() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkSendVendorSummaryAgeingByDueDateReportEmailVer(), true);
		}

		//  @Test(priority=11124)
		public void checkValidateEmailAccountOneInBothVendorSummaryAgeingByDueDateReportAndEmailAccountOne() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccountOneInBothVendorSummaryAgeingByDueDateReportAndEmailAccountOne(), true);
		}

		// @Test(priority=11125)
		public void checkValidateEmailAccountTwoInBothVendorSummaryAgeingByDueDateReportAndEmailAccountTwo() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccountTwoInBothVendorSummaryAgeingByDueDateReportAndEmailAccountTwo(), true);
		}


		//  @Test(priority=11126)
		public void checkValidateEmailAccountThreeInBothVendorSummaryAgeingByDueDateReportAndEmailAccountThree() throws AWTException, Exception
		{
			VPO=new VoucherPrintOptionsPage(getDriver());
			Assert.assertEquals(VPO.checkValidateEmailAccountThreeInBothVendorSummaryAgeingByDueDateReportAndEmailAccountThree(), true);
		}

*/

}
