package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class CodeIncrementalPage extends BaseEngine
{
	@FindBy (xpath="//*[@id='1']/div/span")
	public static WebElement homeMenu;

	//Masters Menu	
	@FindBy (xpath="//*[@id='1000']/span")
	public static WebElement mastersMenu;

	//Accounts 
	@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
	public static WebElement accounts;

	//Accounts Title
	@FindBy (xpath="//span[@id='spnHeaderText']")
	public static WebElement accountsTitle;

	//Master Main Header Fields		
	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	public static WebElement masterNewBtn;

	@FindBy(xpath="//i[@class='icon-font6 icon-add-group']")
	public static WebElement masterAddGroupBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-edit']")
	public static WebElement masterEditBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-clone']")
	public static WebElement masterCloneBtn; 

	@FindBy(xpath="//i[@class='icon-properties icon-font6']")
	public static WebElement masterPropertiesBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-delete']")
	public static WebElement masterDeleteBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-close']")
	public static WebElement masterCloseBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-group']")
	public static WebElement masterGroupBtn; 

	@FindBy(xpath="//*[@id='toggle_ribbon']")
	public static WebElement masterRibbonToExpandOptions; 

	@FindBy(xpath="//i[@class='icon-font6 icon-delete-all']")
	public static WebElement masterDeleteAllBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-closed-account']")
	public static WebElement masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity; 

	@FindBy(xpath="//i[@class='icon-font6 icon-open-close-account']")
	public static WebElement masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState; 

	@FindBy(xpath="//i[@class='icon-font6 icon-import']")
	public static WebElement masterAdvanceMasterImportORExportBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-info']")
	public static WebElement masterAuthorInfoBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-up-arrow']")
	public static WebElement masterMoveUpBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-down-arrow']")
	public static WebElement masterMoveDownBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-sort']")
	public static WebElement masterSortBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-mass-update']")
	public static WebElement masterMassUpdateBtn; 

	@FindBy(xpath="//a[@class='lSNext']")
	public static WebElement masterRibbonControlNextBtn; 

	@FindBy(xpath="//*[@id='btnXMLImport']")
	public static WebElement masterImportFromXmlBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-xmlexport']")
	public static WebElement masterExportFormatToXmlBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-custamize']")
	public static WebElement masterCustamizemasterBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-options']")
	public static WebElement masterCustamizeViewBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-tree']")
	public static WebElement mastercustamizeTreeBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-stock-ledger']")
	public static WebElement masterLedgerBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-financial-1']")
	public static WebElement masterManageCreditBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-department-appropriation']")
	public static WebElement masterDepartmentAppropriationBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-budget']")
	public static WebElement masterBudgetBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-print']")
	public static WebElement masterPrintBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-backtrack']")
	public static WebElement masterBackTrackBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-transfer']")
	public static WebElement masterTranferBtn; 

	@FindBy(xpath="//*[@id='btnNewSets']")
	public static WebElement masterNewSetBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-modifier']")
	public static WebElement masterModifierBtn; 

	@FindBy(xpath="//*[@id='btnSetType']")
	public static WebElement masterSetTypeBtn; 

	@FindBy(xpath="//i[@class='icon-convert icon-font6']")
	public static WebElement masterUnitConversionBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-alternate-product-1']")
	public static WebElement masterAlternateItemBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-related-product']")
	public static WebElement masterRelatedItemBtn; 

	@FindBy(xpath="//i[@class='icon-font6 icon-stock-ledger']")
	public static WebElement masterStockLedgerBtn; 
	

	
	@FindBy (xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr/td[4]")
	public static List<WebElement> fieldCaptionTxtList;
	
	@FindBy (xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr/td[1]/i[1]")
	public static List<WebElement> editFieldList;
	
	@FindBy (xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr/td[1]/i[2]")
	public static List<WebElement> deleteFieldList;
	
	
	@FindBy (xpath="//tbody[@id='tblIncremental_ExtraField_body']")
	public static WebElement incrementalTable;
	
	@FindBy (xpath="//*[@id='tblIncremental_ExtraField_col_1-2']")
	public static WebElement IncCol1Row1;
	
	@FindBy (xpath="//*[@id='ddlIncremental_Type_ExtraFld']")
	public static WebElement IncTypeDropdown;
	
	
	@FindBy (xpath="//*[@id='ddlField_MasterFields']")
	public static WebElement valueDropdown;
	
	
	
	@FindBy (xpath="//*[@id='txtIncrementalTypes_ExtraFld']")
	public static WebElement IncValueTxt;
	
	@FindBy (xpath="//*[@id='txtSCharPosition_ExtraFld']")
	public static WebElement IncStartingTxt;
	
	@FindBy (xpath="//*[@id='txtNoOfChars_ExtraFld']")
	public static WebElement IncNoOfTxt;
	
	@FindBy (xpath="//*[@id='lblIncrementalOutput']")
	public static WebElement OutputTxt;
	

	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;
	
	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
	
	
	
	public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	        try
	        {
	                getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
	                String actErrorMessage=errorMessage.getText();
	                String expErrorMessage=ExpMessage;

	                try
	                {
	                
		                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		                errorMessageCloseBtn.click();

		                System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
		                
		                return actErrorMessage;
	                }
	                catch(Exception ee)
	                {
	                	
	                	System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
	                	
	                	return actErrorMessage;
	                }
	        }
	        catch(Exception e)
	        {
	                System.err.println("Error Message NOT Found or NOT Clickable");
	                System.err.println(e.getMessage());
	                
	                String Exception=e.getMessage();
	            
	                return Exception;
	        }
	}
	
	 private static int cSize;
	
	public static boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		Thread.sleep(3000);
		LoginPage lp=new LoginPage(getDriver()); 
			
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(3000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	    username.click();
	    Thread.sleep(2000);
		username.clear();
	    Thread.sleep(2000);
	    username.sendKeys(unamelt);
	    getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		password.click();
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pawslt);
	    
		String compname="Account Properties And Customization";
		/*String compname="Automation Company";*/
		
		Select oSelect = new Select(companyDropDownList);
		 
		List <WebElement> elementCount = oSelect.getOptions();
		
		int cqSize = elementCount.size();
		 
		int zqSize=cSize+1;
		 
		System.out.println("CompanyDropdownList Count :"+cqSize);
		 
		System.out.println("Company dropdown is :"+ zqSize);
	 
	 
		//Select dropdown= new Select(lp.companyDropDownList);
	    int i;
		  
		//List<WebElement> list = dropdown.getOptions();

		//List<String> text = new ArrayList<>();
		for(i=0; i<elementCount.size(); i++) 
		{
			elementCount.get(i).getText();
			String optionName = elementCount.get(i).getText();
			if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
			{
				System.out.println("q"+elementCount.get(i).getText());
				elementCount.get(i).click();
			}	
		}

	    lp.clickOnSignInBtn();
	    
	    //checkRefershPopOnlogin();
	    
	    //checkPopUpWindow();
	    
	    Thread.sleep(5000);
	          
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	   	userNameDisplay.click();
	           	
		String userInfo=userNameDisplay.getText();
		
		System.out.println("User Info : "+userInfo);
		
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		
		companyLogo.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyName.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
		
		String getDashboard=dashboard.getText();
		
		System.out.println(getDashboard);

	/*	boolean actdashboardGraph     =dashboardGraph.isDisplayed();
		boolean actdashboardLedger    =dashboardLedger.isDisplayed();
		boolean actdashboardInfoPanel =dashboardInfoPanel.isDisplayed();*/
		
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Account Properties And Customization ";
	    String expDashboard			  ="Graph with Active and setAsDefault";
	   
		
		System.out.println("***********************************checkLogin*********************************");
	    
		 System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
		    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
		    System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);
		   
		  
			if(userInfo.equalsIgnoreCase(expuserInfo) /*&& getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName)*/)
			{	
				return true;
			}	 
			else
			{
				return false;
			}
		 }

	
	@FindBy(xpath="//*[@id='all_TabsField']/div[10]/div[1]")
	public static WebElement headerDetailsaccountSaveBtn;

	@FindBy(xpath="//*[@id='iAcceptanceac']")
	public static WebElement acceptanceACCField;
	
	
	public static boolean checkSaveNormalIncrementOfCodeInCustMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	

		masterRibbonControlNextBtn.click(); 
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));	
		generalTab.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTab));
		generalMainTab.click();

		int count = fieldCaptionTxtList.size();

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();

			if (data.equalsIgnoreCase("Code")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();

		Thread.sleep(2000);
		
		Select bd = new Select(extraFields_PropertiesBehaviourDropdown);
		bd.selectByVisibleText("Incremental");
		
		
		boolean actTableInc = incrementalTable.isDisplayed();
		boolean expTableInc = true;
		
		System.out.println("actTableInc:  "+actTableInc  + "expected value : "+expTableInc);
		
		IncCol1Row1.click();
		Thread.sleep(2000);
		
		Select typeDD = new Select(IncTypeDropdown);
		typeDD.selectByVisibleText("Incremental");
		Thread.sleep(1000);
		
		IncTypeDropdown.sendKeys(Keys.TAB);
		
		IncValueTxt.sendKeys("1");
		Thread.sleep(1000);
		IncValueTxt.sendKeys(Keys.TAB);
		
		IncStartingTxt.sendKeys("0");
		Thread.sleep(1000);
		IncStartingTxt.sendKeys(Keys.TAB);
		
		
		IncNoOfTxt.sendKeys("6");
		Thread.sleep(1000);
		IncNoOfTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		String actOpTxt = OutputTxt.getText();
		String expOpTxt = "Output : 000001";
		
		
		System.out.println("actOpTxt:  "+actOpTxt  + "expected value : "+expOpTxt);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		
		String expMessage="Field Updated Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		
		System.out.println("actMessage: "+actMessage);
		System.out.println("expMessage: "+expMessage);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsaccountSaveBtn));
		headerDetailsaccountSaveBtn.click();

		String expMessageOnSave = "Master updated successfully";
		String actMessageOnSave=checkValidationMessage(expMessageOnSave);

	

		if (actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
		{
			System.out.println(" Test Pass: code Customization Field done ");
			return true;
		}
		else
		{
			System.out.println(" Test Fail: code Customization Field not done ");
			return false;

		}
		
	}

	public static boolean checkCreateAccountMasterToVerifyCodeIncrement() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("IncrementOne");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		Thread.sleep(2000);
		acceptanceACCField.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);
		
		int count = masterGridBodyName.size();
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementOne")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				System.out.println("Yes incrementOne is displayed...");
				break;
			}
			
		}
		
		Thread.sleep(2000);
		String actCodeTxt1 = codeTxt.getAttribute("value");
		String expCodeTxt1 = "009004";

		System.out.println("actCodeTxt1: "+actCodeTxt1 +"expCodeTxt1:  "+expCodeTxt1);
		
		Thread.sleep(2000);
		closeBtnAfterSave.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("IncrementTwo");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		Thread.sleep(2000);
		acceptanceACCField.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(2000);
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementTwo")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				break;
			}
			
		}
		Thread.sleep(2000);
		String actCodeTxt2 = codeTxt.getAttribute("value");
		String expCodeTxt2 = "009005";

		System.out.println("actCodeTxt2: "+actCodeTxt2 +"expCodeTxt2:  "+expCodeTxt2);
		
		Thread.sleep(2000);
		closeBtnAfterSave.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("IncrementThree");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		
		Thread.sleep(2000);
		acceptanceACCField.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(2000);
		

		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementThree")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
				break;
			}
		}
		
		Thread.sleep(2000);
		String actCodeTxt3 = codeTxt.getAttribute("value");
		String expCodeTxt3 = "009006";


		System.out.println("actCodeTxt3: "+actCodeTxt3 +"expCodeTxt3:  "+expCodeTxt3);

		
		Thread.sleep(2000);
		closeBtnAfterSave.click();
		Thread.sleep(2000);
		
		if (actCodeTxt1.equalsIgnoreCase(expCodeTxt1) && actCodeTxt2.equalsIgnoreCase(expCodeTxt2) 
				&& actCodeTxt3.equalsIgnoreCase(expCodeTxt3))
		{
			return true;
		} 
		else {
			return false;
		}


	}
	
	public static boolean checkSavedAccountsInGrid() throws InterruptedException
	{
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);
		
		int count = masterGridBodyName.size();
		boolean accountVisiblity = false;
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("IncrementOne")   || data.equalsIgnoreCase("IncrementTwo") || data.equalsIgnoreCase("IncrementThree")) 
			{
				accountVisiblity = true;
			}
		}
		
		System.out.println("accountVisiblity:"+accountVisiblity);
		
		if (accountVisiblity)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean checkRemoveIncrementalForCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	

		masterRibbonControlNextBtn.click(); 
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));	
		generalTab.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTab));
		generalMainTab.click();

		int count = fieldCaptionTxtList.size();

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();

			if (data.equalsIgnoreCase("Code")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();

		Thread.sleep(2000);
		

		Select bd = new Select(extraFields_PropertiesBehaviourDropdown);
		bd.selectByVisibleText("--None--");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		
		String expMessage="Field Updated Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		
		System.out.println("actMessage: "+actMessage);
		System.out.println("expMessage: "+expMessage);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsaccountSaveBtn));
		headerDetailsaccountSaveBtn.click();

		String expMessageOnSave = "Master updated successfully";
		String actMessageOnSave=checkValidationMessage(expMessageOnSave);

	

		if (actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
		{
			System.out.println(" Test Pass: code Customization Field done ");
			return true;
		}
		else
		{
			System.out.println(" Test Fail: code Customization Field not done ");
			return false;

		}
		
		
		

	}

	public static boolean checkLogoutAndLoginAfterCustomization() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		userNameDisplay.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(4000);
		
		LoginPage lp=new LoginPage(getDriver()); 
			
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	    username.click();
	    Thread.sleep(2000);
		username.clear();
	    Thread.sleep(2000);
	    username.sendKeys(unamelt);
	    getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		password.click();
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    //checkRefershPopOnlogin();
	    
	    //checkPopUpWindow();
	    
	    Thread.sleep(8000);
	          
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	   	userNameDisplay.click();
	           	
		String userInfo=userNameDisplay.getText();
		
		System.out.println("User Info : "+userInfo);
		
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		
		companyLogo.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogo.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
		
		String getDashboard=dashboard.getText();
		
		System.out.println(getDashboard);
		
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Account Properties And Customization";
	    String expDashboard			  ="Graph with Active and setAsDefault";
	   
		
		System.out.println("***********************************checkLogoutAndLoginAfterEnablingMandatoryCheckboxInFieldsProperties*********************************");
	    
	    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
	    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
	    System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);
	   
	  
		if(userInfo.equalsIgnoreCase(expuserInfo) /*&& getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName)*/)
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	 
	}


	@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
	private static WebElement extraFields_PropertiesCopyFromParentChekbox;
	
	public static boolean checkSaveCopyFromParentAndIncrementalForGroupAccounts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	

		masterRibbonControlNextBtn.click(); 
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));	
		generalTab.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTab));
		generalMainTab.click();

		int count = fieldCaptionTxtList.size();

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();

			if (data.equalsIgnoreCase("Code")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();

		Thread.sleep(2000);
		
		if (extraFields_PropertiesCopyFromParentChekbox.isSelected() ==false) 
		{
			extraFields_PropertiesCopyFromParentChekbox.click();
		}
		
		boolean actCFP = extraFields_PropertiesCopyFromParentChekbox.isSelected();
		boolean expCFP = true;
		
		Thread.sleep(2000);
		
		Select bd = new Select(extraFields_PropertiesBehaviourDropdown);
		bd.selectByVisibleText("Incremental");
		
		
		boolean actTableInc = incrementalTable.isDisplayed();
		boolean expTableInc = true;
		
		System.out.println("actTableInc:  "+actTableInc  + "expected value : "+expTableInc);
		
		IncCol1Row1.click();
		Thread.sleep(2000);
		
		Select typeDD = new Select(IncTypeDropdown);
		typeDD.selectByVisibleText("Field");
		Thread.sleep(1000);
		
		IncTypeDropdown.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select valueDD = new Select(valueDropdown);
		valueDD.selectByVisibleText("Code");
		Thread.sleep(1000);
		
		valueDropdown.sendKeys(Keys.TAB);
		
		IncStartingTxt.sendKeys("1");
		Thread.sleep(1000);
		IncStartingTxt.sendKeys(Keys.TAB);
		
		
		IncNoOfTxt.sendKeys("8");
		Thread.sleep(1000);
		IncNoOfTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		typeDD.selectByVisibleText("Incremental");
		Thread.sleep(1000);
		
		IncTypeDropdown.sendKeys(Keys.TAB);
		
		IncValueTxt.sendKeys("1");
		Thread.sleep(1000);
		IncValueTxt.sendKeys(Keys.TAB);
		
		IncStartingTxt.sendKeys("0");
		Thread.sleep(1000);
		IncStartingTxt.sendKeys(Keys.TAB);
		
		
		IncNoOfTxt.sendKeys("8");
		Thread.sleep(1000);
		IncNoOfTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		String actOpTxt = OutputTxt.getText();
		String expOpTxt = "Output : XXXXXXX00000001";
		
		
		System.out.println("actOpTxt:  "+actOpTxt  + "expected value : "+expOpTxt);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		
		String expMessage="Field Updated Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		
		System.out.println("actMessage: "+actMessage);
		System.out.println("expMessage: "+expMessage);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsaccountSaveBtn));
		headerDetailsaccountSaveBtn.click();

		String expMessageOnSave = "Master updated successfully";
		String actMessageOnSave=checkValidationMessage(expMessageOnSave);

	

		if (actOpTxt.equalsIgnoreCase(expOpTxt) && actMessage.equalsIgnoreCase(expMessage) && actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
		{
			System.out.println(" Test Pass: code Customization Field done ");
			return true;
		}
		else
		{
			System.out.println(" Test Fail: code Customization Field not done ");
			return false;

		}
		

	}
	
	public static boolean checkSaveGroupAccountsAndNestedGroupAccountAndVerifyCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelOne");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("LevelCode");

		Thread.sleep(2000);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count = masterGridBodyName.size();

		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelOne")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
			break;
		}


		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		//leveltwo

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelTwo");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		Thread.sleep(2000);
		acceptanceACCField.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count2 = masterGridBodyName.size();
	
		for (int i = 0; i < count2; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelTwo")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt1 = codeTxt.getAttribute("value");
		String expCodeTxt1 = "evelCode00000001";

		System.out.println("actCodeTxt1: "+actCodeTxt1 +"expCodeTxt1:  "+expCodeTxt1);

		closeBtnAfterSave.click();


		//level3
		int count3 = masterGridBodyName.size();
		for (int i = 0; i < count3; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelTwo")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
		}


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelThree");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		Thread.sleep(2000);
		acceptanceACCField.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count4 = masterGridBodyName.size();
		for (int i = 0; i < count4; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelThree")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt2 = codeTxt.getAttribute("value");
		String expCodeTxt2 = "velCode000000001";

		System.out.println("actCodeTxt2: "+actCodeTxt2 +"expCodeTxt2:  "+expCodeTxt2);


		closeBtnAfterSave.click();

		//level4

		int count5 = masterGridBodyName.size();
		for (int i = 0; i < count5; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelThree")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
		}


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelFour");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		Thread.sleep(2000);
		acceptanceACCField.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count6 = masterGridBodyName.size();
		for (int i = 0; i < count6; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFour")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt3 = codeTxt.getAttribute("value");
		String expCodeTxt3 = "elCode0000000001";

		System.out.println("actCodeTxt3: "+actCodeTxt3 +"expCodeTxt3:  "+expCodeTxt3);


		closeBtnAfterSave.click();

		//level5


		int count7 = masterGridBodyName.size();
		for (int i = 0; i < count7; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFour")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
		}


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelFive");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		Thread.sleep(2000);
		acceptanceACCField.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count8 = masterGridBodyName.size();
		for (int i = 0; i < count8; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		

			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFive")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt4 = codeTxt.getAttribute("value");
		String expCodeTxt4 = "lCode00000000001";

		System.out.println("actCodeTxt4: "+actCodeTxt4 +"expCodeTxt4:  "+expCodeTxt4);


		closeBtnAfterSave.click();

		//level6



		int count9 = masterGridBodyName.size();
		for (int i = 0; i < count9; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFive")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
		}


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
		masterAddGroupBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("CopyFromParentAndIncrementLevelSix");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		Thread.sleep(2000);
		acceptanceACCField.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		checkValidationMessage(expSaveAccountMessage);

		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);

		int count10 = masterGridBodyName.size();
		for (int i = 0; i < count10; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
		
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelSix")) 
			{
				Thread.sleep(1000);
				masterGridBodyChkbox.get(i).click();
			}
		}

		Thread.sleep(2000);
		masterEditBtn.click();
		Thread.sleep(5000);

		String actCodeTxt5 = codeTxt.getAttribute("value");
		String expCodeTxt5 = "Code000000000001";

		System.out.println("actCodeTxt5: "+actCodeTxt5 +"expCodeTxt5:  "+expCodeTxt5);


		closeBtnAfterSave.click();



		if (actCodeTxt1.equalsIgnoreCase(expCodeTxt1) && actCodeTxt2.equalsIgnoreCase(expCodeTxt2) 
				&& actCodeTxt3.equalsIgnoreCase(expCodeTxt3) && actCodeTxt4.equalsIgnoreCase(expCodeTxt4)
				&& actCodeTxt5.equalsIgnoreCase(expCodeTxt5))
		{
			return true;
		} 
		else 
		{
			return false;
		}


	}

	public static boolean checkSaveNormalAccInLevelOne() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();

		Thread.sleep(2000);
		
		int count = masterGridBodyName.size();
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
		
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelOne")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyName.get(i)).build().perform();
			}
			break;
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("LevelOneChildOne");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		Thread.sleep(2000);
		acceptanceACCField.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);
		
		
		
		int codecount = masterGridBodyCode.size();
		
		ArrayList<String> AccountCodes = new ArrayList<String>();
		
		for (int i = 0; i < codecount; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyCode.get(i).getText();
			AccountCodes.add(data);
		}
		 
		String actCodeText = AccountCodes.toString();
		String expCodeText = "[evelCode00000002, evelCode00000001]";
		
		System.out.println("actCodeText:"+actCodeText);
		System.out.println("expCodeText:"+expCodeText);
		
		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage) 
			&& actCodeText.equalsIgnoreCase(expCodeText))
		{
			return true;
		} 
		else 
		{	
			return false;
		}
	
	}
	
	public static boolean checkNormalAccountInLevelFour() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getDriver().navigate().refresh();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		getAction().moveToElement(homeMenu).click().build().perform();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("CopyFromParentAndIncrementLevelFour");
		masterSearchTxt.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		int count = masterGridBodyName.size();
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
			
			if (data.equalsIgnoreCase("CopyFromParentAndIncrementLevelFour")) 
			{
				Thread.sleep(1000);
				
				getAction().doubleClick(masterGridBodyChkbox.get(i)).build().perform();
				
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("LevelFourChildOne");
		Thread.sleep(2000);
		nameTxt.sendKeys(Keys.TAB);

		acceptanceACCField.click();
		Thread.sleep(2000);
		acceptanceACCField.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSaveBtn));
		accountSaveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(3000);
		
		
		
		int codecount = masterGridBodyCode.size();
		
		ArrayList<String> AccountCodes = new ArrayList<String>();
		
		for (int i = 0; i < codecount; i++) 
		{
			Thread.sleep(1000);
			String data = masterGridBodyCode.get(i).getText();
			AccountCodes.add(data);
		}
		 
		String actCodeText = AccountCodes.toString();
		String expCodeText = "[lCode00000000002, lCode00000000001]";
		
		System.out.println("actCodeText:"+actCodeText);
		System.out.println("expCodeText:"+expCodeText);
		
		if (actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage) 
			&& actCodeText.equalsIgnoreCase(expCodeText))
		{
			return true;
		} 
		else 
		{	
			return false;
		}
	
		
		
	}

	 public CodeIncrementalPage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
		
	 }









}
