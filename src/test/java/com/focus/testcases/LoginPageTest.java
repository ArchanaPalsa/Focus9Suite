package com.focus.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.focus.Pages.LoginPage;
import com.focus.base.BaseEngine;



public class LoginPageTest extends BaseEngine 
{
	
	private static LoginPage lp;

	  

	
	//@Test(priority=2)
	  public void checkRestoreVouchersPrintcompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  lp=new LoginPage(getDriver());
		  Assert.assertEquals(LoginPage.checkRestoreVouchersPrintcompany(), true);
		  
	  }
	 
	 @Test(priority=3)
	  public void checkLoginAfterRestoring() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  lp=new LoginPage(getDriver());
		  Assert.assertEquals(LoginPage.checkLoginAfterRestoring(), true);
	  }
	  
	 
	 // @Test(priority=4)
	  public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  
	  {
	  
		  lp=new LoginPage(getDriver());
		  Assert.assertEquals(LoginPage.checkLogin(), true);
	  }
	 
	 
}
