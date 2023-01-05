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

public class ItemMasterCustomizationPage extends BaseEngine {
				
	
		//Restore Screen Options
		@FindBy(xpath="//div[contains(text(),'Restore Company')]")
		private static WebElement restoreCompanyBtnOfLoginPage;
		
		@FindBy(xpath="//input[@id='txtRestoreFile']")
		private static WebElement restoreInputTxt;
		
		@FindBy(xpath="//button[@class='btn Fbutton']")
		private static WebElement restoreBrowseBtn;
		
		//User Name and password in Credentials
		@FindBy(xpath="//*[@id='txtAdminUsername']")
		private static WebElement adminName;
		
		@FindBy(xpath="//*[@id='txtAdminPassword']")
		private static WebElement adminPassword;
		
		@FindBy(xpath="/html/body/section/div[8]/div/div/div[4]/button[1]")
		private static WebElement loginButton;
		
		@FindBy(xpath="/html/body/section/div[8]/div/div/div[4]/button[2]")
		private static WebElement cancelButton;
		
		@FindBy(xpath="//i[@class='icon-restore-1 icon-font4']")
		private static WebElement  loginPageRestoreBtn;
		
		//Loginpage 
		
		@FindBy(xpath="//*[@id='txtUsername']")
		private static WebElement username;

		@FindBy(id="txtPassword")
		private static WebElement password;

		@FindBy(id="btnSignin")
		private static WebElement signIn;

	    @FindBy(id="ddlCompany")
	    private static WebElement companyDropDownList;

		/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")
		private static WebElement userNameDisplay;*/

		@FindBy(xpath="//span[@class='hidden-xs']")
		private static WebElement userNameDisplay;
		
		
		@FindBy(xpath="//*[@id='companyLogo']")
		private static WebElement companyLogo;

		@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
		private static WebElement companyName;

	    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
        private static WebElement logoutOption;		
				
	
	
	
	
	 	//Home Menu
		@FindBy (xpath="//*[@id='1']/div/span")
	    public static WebElement homeMenu;
		
		//Masters Menu	
		@FindBy (xpath="//*[@id='1000']/span")
	    public static WebElement mastersMenu;
		
		@FindBy(xpath="//*[@id='221']/span")
		private static WebElement  homeMasterItemMenu;

		@FindBy(xpath="//*[@id='1105']/span")
		private static WebElement  homeMasterItem_ItemMenu;

	     @FindBy(xpath="//*[@id='btnNew']")
	     private static WebElement itemNewBtn;
	     
	     @FindBy(xpath="//input[@id='sName']")
	     private static WebElement newGeneralName;
	     
	     @FindBy(xpath="//input[@id='sCode']")
	     private static WebElement newGeneralCode;
	     
	     @FindBy(xpath="//select[@id='iProductType']")
	     private static WebElement newGeneralItemTypeDropDown;	
	     
	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
	     public static WebElement saveBtn;
	     
	     @FindBy(xpath="//*[@id='ImageDiv']")
	     public static WebElement imagebrowseBtn;
	     
	  
		
		
		@FindBy(xpath="//*[@id='toggle_ribbon']")
		public static WebElement masterRibbonToExpandOptions; 
		

		@FindBy(xpath="//a[@class='lSNext']")
		public static WebElement masterRibbonControlNextBtn; 
		
		
		@FindBy(xpath="//i[@class='icon-font6 icon-custamize']")
		public static WebElement masterCustamizemasterBtn; 
		
		@FindBy(xpath="//span[contains(text(),'Rules')]")
		private static WebElement RulesOption;
		

		@FindBy(xpath="//input[@class='btn btn-link']")
		private static WebElement Rules_AddRuleBtn;
		
		
		
			 @FindBy(xpath="//div[@id='newRuleTab_div_MasterRules']//span[@class='icon-save icon-font7']")
			 private static WebElement accountRules_SaveBtn;
			               
			 @FindBy(xpath="//div[@class='pull-right']//span[@class='icon-new icon-font7']")
			 private static WebElement accountRules_NewBtn;
			
			 @FindBy(xpath="//div[@id='newRuleTab_div_MasterRules']//span[@class='icon-delete icon-font7']")
			 private static WebElement accountRules_DeleteBtn;
			 
			 @FindBy(xpath="//div[@id='newRuleTab_div_MasterRules']//div[@class='pull-right']//span[@class='icon-close icon-font7']")
			 private static WebElement accountRules_CloseBtn;   
			 
			 @FindBy(xpath="//*[@id='txtMasterRuleName_MViewRules']")
			 private static WebElement Rules_RuleNameText ;
				     

			 @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_MasterRules']")
			 private static WebElement Rules_CreatingGroupChekbox ;

			 @FindBy(xpath="//*[@id='chkNewRecord_Rule_MViewRules']")
			 private static WebElement Rules_NewRecordChekbox ;

			 @FindBy(xpath="//*[@id='chkEdit_Rule_MViewRules']")
			 private static WebElement Rules_EditChekbox ;
			 

			 @FindBy(xpath="//*[@id='chkLoad_Rule_MViewRules']")
			 private static WebElement Rules_LoadChekbox ;

			 @FindBy(xpath="//*[@id='chkBeforeSave_Rule_MViewRules']")
			 private static WebElement Rules_BeforeSaveChekbox ;

			 @FindBy(xpath="//*[@id='chkOnLeave_Rule_MViewRules']")
			 private static WebElement Rules_OnLeaveChekbox ;

			 @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_MViewRules']")
			 private static WebElement Rules_BeforeDeleteChekbox ;

			 @FindBy(xpath="//*[@id='chkOnEnter_Rule_MViewRules']")
			 private static WebElement Rules_OnEnterChekbox ;
			 
			 @FindBy(xpath="//label[contains(text(),'Active')]")
			 private static WebElement Rules_ActiveChekbox ;
			 
			 @FindBy(xpath="//input[@id='chkIsRuleActive_Rule_MViewRules']")
			 private static WebElement MasterRules_ActiveChekbox ;
			 
			

			 
			 @FindBy(xpath="//*[@id='Conditions-Context_Menu']/li[3]")
			 private static WebElement Rules_NoConditionChekbox;
			 
			
			 
			 
			 
			 @FindBy(xpath="//*[@id='ddlMasterFields_RULES_MViewRules']")
			 private static WebElement MasterRules_NoConditionChekbox;	
			
		
		
		
		
		
		
		
		
		
		
		
		
		 public static boolean checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
			{
			 
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginPageRestoreBtn));
				loginPageRestoreBtn.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(adminName));
				adminPassword.sendKeys("focus");
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginButton));
				loginButton.click();
				
				Thread.sleep(2000);
				
		        boolean actRestoreCompanyBtnOfLoginPage  =restoreCompanyBtnOfLoginPage.isDisplayed();
		        boolean actRestoreInputTxt               =restoreInputTxt.isDisplayed();
		        boolean actRestoreBrowseBtn              =restoreBrowseBtn.isDisplayed();
		        
		        boolean expRestoreCompanyBtnOfLoginPage  =true;
		        boolean expRestoreInputTxt               =true;
		        boolean expRestoreBrowseBtn              =true;
				
		        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreBrowseBtn));
				restoreBrowseBtn.click();
				
				Thread.sleep(3000);
			     
			     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\AutomationOptionsCmpRestore.exe");
			     
			     Thread.sleep(3000);
			     
			     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtnOfLoginPage));
				 restoreCompanyBtnOfLoginPage.click();
			     
		    	 getWaitForAlert();
		    	 String actAlertTxt = getAlert().getText();
		    	 getAlert().accept();
		 		 
		 		 System.err.println(actAlertTxt);
		 		 
		 		String expAlertTxt = "Restore company code : 1C0";
			    	 
			    Thread.sleep(3000);
			    
				if(actAlertTxt.equalsIgnoreCase(expAlertTxt))
				{
					return true;
				}
				else
				{
					return false;
				}
		     }
		 
		 
		 private static int cSize;
		 public static boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
				
				Thread.sleep(3000);
				LoginPage lp=new LoginPage(getDriver()); 
					
			    String unamelt="su";
			  
			    String pawslt="su";
			    
			    
			    getDriver().navigate().refresh();
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
				
				Select oSelect = new Select(companyDropDownList);
				 
				List <WebElement> elementCount = oSelect.getOptions();
				
				int cqSize = elementCount.size();
				 
				int zqSize=cSize+1;
				 
				System.out.println("CompanyDropdownList Count :"+cqSize);
				 
				System.out.println("Company dropdown is :"+ zqSize);
			 
			 
				
			    int i;
				  
				
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
				
			    
			    String expuserInfo            ="SU";
			    String expLoginCompanyName    ="Automation Options Company";
			    String expDashboard			  ="Graph with Active and setAsDefault";
			   
				
				System.out.println("***********************************checkLogin*********************************");
			    
				System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
				System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
				
				if(userInfo.equalsIgnoreCase(expuserInfo))
				  {	
					 return true;
				  }	 
					else
					{
						return false;
					}
				 }
				
		 
		 public static boolean checkLogoutAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
			 
			 	getDriver().navigate().refresh();
				
				Thread.sleep(4000);
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
				String compname="Account Properties And Customization";
				
				Select oSelect = new Select(companyDropDownList);
				 
				List <WebElement> elementCount = oSelect.getOptions();
				
				int cqSize = elementCount.size();
				 
				int zqSize=cSize+1;
				 
				System.out.println("CompanyDropdownList Count :"+cqSize);
				 
				System.out.println("Company dropdown is :"+ zqSize);
			 
			    int i;
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
				
			    String expuserInfo            ="SU";
			    String expLoginCompanyName    ="Automation Company ";
			    String expDashboard			  ="Graph with Active and setAsDefault";
			   
				
				System.out.println("***********************************checkLogin*********************************");
			    
			    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
			    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
			   
			  
				if(userInfo.equalsIgnoreCase(expuserInfo))
				{	
					return true;
				}	 
				else
				{
					return false;
				}
			 }
		 
		 
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
		 
		 
		 @FindBy(xpath="//span[contains(text(),'Create Tab')]")
		 private static WebElement newcreateTab;
		 
		 @FindBy(xpath="//*[@id='HeaderDetails_8']/div/div/table/tbody/tr/td[1]/i[1]")
		 private static WebElement cus1stRowEditBtn;
		 
		 @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
		 private static WebElement extraFields_RulesTab ;
				                   
		    @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
			private static WebElement extraFields_RulesSaveBtn ;
		    
		    @FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[1]/span")
			private static WebElement extraFields_RulesOkBtn ;
		    
		 
	                  
	        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
			private static WebElement extraFields_RulesNewBtn ;
	        
	        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
			private static WebElement extraFields_RulesDeleteBtn ;
	        
	        @FindBy(xpath="//div[@id='newRuleTab_div_FieldRules']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
			private static WebElement extraFields_RulesCloseBtn ;
	        
            @FindBy(xpath="//input[@class='btn btn-link']")
		    private static WebElement extraFields_RulesClickHereAddRuleButtonBtn ;
        
	        @FindBy(xpath="//input[@id='txtMasterRuleName_FieldRules']")
			private static WebElement extraFields_RuleNameDropdown ;
	        
	        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
			private static WebElement extraFields_RuleNameSetingBtn ; 
	        

	     @FindBy(xpath = "//input[@class='btn btn-link']")
	     private static WebElement rulesTabAddRuleBtn;
	     

	     @FindBy(xpath = "//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
	     private static WebElement rulesTab_MessageTab;
	     
	     @FindBy(xpath = "//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
	     private static WebElement messageTextField;
	     
	     @FindBy(xpath="//input[@id='chkCreatingGroup_Rule_FieldRules']")
	 	private static WebElement extraFields_ruleCreatingGroupChkbox;
	 	
	 	@FindBy(xpath="//input[@id='chkEdit_Rule_FieldRules']")
	 	private static WebElement extraFields_ruleEditChkbox;
	 	
	 	@FindBy(xpath="//input[@id='chkNewRecord_Rule_FieldRules']")
	 	private static WebElement extraFields_ruleNewrecordChkbox;
	 	
	 	@FindBy(xpath="//input[@id='chkLoad_Rule_FieldRules']")
	 	private static WebElement extraFields_ruleLoadChkbox;
	 	
	 	@FindBy(xpath="//input[@id='chkBeforeSave_Rule_FieldRules']")
	 	private static WebElement extraFields_ruleBeforeSaveChkbox;
	 	
	 	@FindBy(xpath="//input[@id='chkOnLeave_Rule_FieldRules']")
	 	private static WebElement extraFields_ruleOnLeaveChkbox;
	 	
	 	@FindBy(xpath="//input[@id='chkBeforeDelete_Rule_FieldRules']")
	 	private static WebElement extraFields_ruleBeforeDeleteChkbox;
	 	
	 	@FindBy(xpath="//input[@id='chkOnEnter_Rule_FieldRules']")
	 	private static WebElement extraFields_ruleOnEnterChkbox;
	 	
	 	@FindBy(xpath="//input[@id='chkIsRuleActive_Rule_FieldRules']")
	 	private static WebElement extraFields_ruleOnActiveChkbox;

	     @FindBy(xpath = "//*[@id='Conditions-Context_Menu_FieldRules']/li[2]/a")
	 	private static WebElement rulesTabElseTab;

	 	@FindBy(xpath = "//*[@id='Conditions-Context_Menu_FieldRules']/li[1]/a")
	 	private static WebElement rulesTabIFTab;
	 	
	 	@FindBy(xpath = "//input[@id='txtField_RC_1_1_FieldRules']")
	 	private static WebElement rulesTabIFSelectTabTxt;
	 	
	 	@FindBy(xpath = "//select[@id='ddlMasterFields_RULES_FieldRules']")
	 	private static WebElement rulesTabIFSelectTabDrpdwn;

	 	@FindBy(xpath = "//select[@id='ddlExtraFields_1_1_FieldRules']")
	 	private static WebElement rulesTabExtraFieldDrpdwn;
	 	                   
	 	@FindBy(xpath = "//select[@id='ddlOperators_RC_1_1_FieldRules']")
	 	private static WebElement rulesTabOperatorsDrpdwn;
	 	
	 	@FindBy(xpath = "//select[@id='ddlExtraFields_1_1_FieldRules']")
	 	private static WebElement rulesTabNameOrCodeDrpdwn;
	 	
	 	@FindBy(xpath = "//select[@id='ddlCompareWith_RC_1_1_FieldRules']")
	 	private static WebElement rulesTbValueDropdown;
	 	
	 	
	 	
	 	 @FindBy(xpath="//td[@id='tblFormating_Else_Rule_FieldRules_col_1-1']")
	  	private static WebElement rulesGridElse1stRow_1stcol ;
	 	
	 	@FindBy(xpath = "//select[@id='ddlCompareWith_RC_1_1_FieldRules']")
	 	private static WebElement rulesTabCompareWithDrpdwn;

	 	@FindBy(xpath = "//input[@id='txtCompareType_RC_1_1_FieldRules']")
	 	private static WebElement rulesTabValueTxt;
	 	
	 	@FindBy(xpath = "//*[@id='optControl_RulesCondition_FieldRules']")
	 	private static WebElement rulesTabEnterValuetxt;
	 	
	 	

	 	@FindBy(xpath = "//input[@id='txtCompareType_RC_1_1_FieldRules']")
	 	private static WebElement rulesTabConditionTxttoEnter;
	 	
	 	@FindBy(xpath = "//input[@id='optControl_RulesCondition_FieldRules']	")
	 	private static WebElement rulesTabConditionTxt;
	 	
	 	@FindBy(xpath = "//input[@id='optControl_RulesCondition_FieldRules']")
	 	private static WebElement rulesTabConditioDrpdwn;

	 	@FindBy(xpath = "//select[@id='ddlConjunction_RC_1_1_FieldRules']")
	 	private static WebElement rulesTabConjunctionDrpdwn;

	 	@FindBy(xpath = "//input[@id='chkNoRuleCondition_FieldRules']")
	 	private static WebElement rulesTabNoConditionChkbbox;

	 	@FindBy(xpath = "//i[@id='iconRuleSettings_FieldRules']")
	 	private static WebElement rulesTabSettingsAddIcon;

	 	@FindBy(xpath = "//span[@class='icon-close icon-font7']")
	 	private static WebElement rulesTabIfConditionCloseBtn;

	 	@FindBy(xpath = "//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
	 	private static WebElement rulesTab_IFFormattingTab;

	 	@FindBy(xpath = "//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
	 	private static WebElement rulesTab_IFMesssageTab;

	 	@FindBy(xpath = "//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
	 	private static WebElement rulesTab_IFAlertsTab;

	 	@FindBy(xpath = "//*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
	 	private static WebElement rulesTab_ElseFormattingTab;

	 	@FindBy(xpath = "//*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
	 	private static WebElement rulesTab_ElseMessageTab;
	 	                 
	 	@FindBy(xpath = "//*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
	 	private static WebElement rulesTab_ElseAlertsTab;
	 	
	 	@FindBy(xpath="//span[@id='updateButton']")
	 	private static WebElement  updateBtn;
	 	    
	 	@FindBy(xpath = "//input[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
	 	private static WebElement rules_MessageTabGeneralTXT;

	 	@FindBy(xpath = "//input[@id='txtCaptionFormat_IF_FieldRules']")
	 	private static WebElement rulesTabIFGridEnterCaption;

	 	@FindBy(xpath="//td[@id='tblFormating_IF_Rule_FieldRules_col_1-1']")
	 	private static WebElement rulesGrid1stRow_1stcol ;
	 	     
	 	@FindBy(xpath="//td[@id='tblFormating_IF_Rule_FieldRules_col_3-1']")
	 		private static WebElement rulesGrid3rdRow_1stcol ;
	 		  
	 	@FindBy(xpath="//td[@id='tblFormating_IF_Rule_FieldRules_col_3-2']")
	 		private static WebElement rulesGrid3rdRow_2ndcol ;
	 		
	 	@FindBy(xpath="//td[@id='tblFormating_IF_Rule_FieldRules_col_3-4']")
	 		private static WebElement rulesGrid3rdRow_4thcol ;
	 	
	 	
	 	  @FindBy(xpath="//select[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
	  	 private static WebElement rulesIFEnterFiled ;
	      
	      @FindBy(xpath="//select[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
	  	 private static WebElement rulesElseEnterFiled ;
	    
	  	
	 	@FindBy(xpath = "//td[@id='tblFormating_IF_Rule_FieldRules_col_1-10']")
	 	private static WebElement rulesTabGrid1st_10thCol;

	 	
	 	@FindBy(xpath = "//input[@id='chkMandatoryFormat_IF_FieldRules']")
	 	private static WebElement rulesTabGridMandatoryChkbox;
	 	
	    
	      @FindBy(xpath="//select[@id='ddlChangeValueFormat_IF_FieldRules']")
	  	 private static WebElement rulesIFEnterChangeValueDrpdwn;
	      
	      @FindBy(xpath="//select[@id='ddlChangeValueFormat_ELSE_FieldRules']")
	  	 private static WebElement rulesElseEnterChangeValueDrpdwn;

	    
	      @FindBy(xpath="//input[@id='txtTextField']")
	  	 private static WebElement rulesIFEnterValueTxt;
	     
	      @FindBy(xpath="//*[@id='txtTextField']")
	  	 private static WebElement rulesIFEnterValue;
	      
		 public boolean checkRulesTabUnderMasterCustomizationUnderCreateTAB() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				Thread.sleep(2000);
				getDriver().navigate().refresh();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
				homeMasterItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
				 homeMasterItem_ItemMenu.click();

				
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
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newcreateTab));
				newcreateTab.click();
				
		        Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cus1stRowEditBtn));
				cus1stRowEditBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesTab));
				extraFields_RulesTab.click();
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RuleNameDropdown));
				extraFields_RuleNameDropdown.click();
				
				extraFields_RuleNameDropdown.sendKeys(Keys.SHIFT,Keys.HOME);
				
				extraFields_RuleNameDropdown.sendKeys(Keys.BACK_SPACE);		
				
				Thread.sleep(1000);
				
				extraFields_RuleNameDropdown.sendKeys("RuleForDefaultitemCodeWNC");
				
				Thread.sleep(2000);
				extraFields_RuleNameDropdown.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ruleNewrecordChkbox));
				extraFields_ruleNewrecordChkbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ruleLoadChkbox));
				extraFields_ruleLoadChkbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ruleOnLeaveChkbox));
				extraFields_ruleOnLeaveChkbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ruleOnActiveChkbox));
				extraFields_ruleOnActiveChkbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabNoConditionChkbbox));
				rulesTabNoConditionChkbbox.click();
				
				System.out.println("*******************checkSavingRuleWithOutConditionUnderMasterCustomization*********");
				
				boolean Rules_NewRecord=extraFields_ruleNewrecordChkbox.isSelected();
				String actRules_NewRecordChekbox=Boolean.toString(Rules_NewRecord);
				String expRules_NewRecordChekbox="true";
				
				boolean extraFields_ruleLoad=extraFields_ruleLoadChkbox.isSelected();
				String actextraFields_ruleLoadChkbox=Boolean.toString(extraFields_ruleLoad);
				String expextraFields_ruleLoadChkbox="true";
				
				boolean extraFields_ruleOnLeave=extraFields_ruleOnLeaveChkbox.isSelected();
				String actextraFields_ruleOnLeaveChkbox=Boolean.toString(extraFields_ruleOnLeave);
				String expextraFields_ruleOnLeaveChkbox="true";
				
				boolean extraFields_ruleOnActive=extraFields_ruleOnActiveChkbox.isSelected();
				String actextraFields_ruleOnActiveChkbox=Boolean.toString(extraFields_ruleOnActive);
				String expextraFields_ruleOnActiveChkbox="true";
				
				boolean rulesTabNoCondition=rulesTabNoConditionChkbbox.isSelected();
				String actrulesTabNoConditionChkbbox=Boolean.toString(rulesTabNoCondition);
				String exprulesTabNoConditionChkbbox="true";
				
				System.out.println("extraFields_ruleNewrecordChkbox  : "+actRules_NewRecordChekbox        +" Value "+expRules_NewRecordChekbox);
				System.out.println("extraFields_ruleLoadChkbox       : "+actextraFields_ruleLoadChkbox    +" Value "+expextraFields_ruleLoadChkbox);
				System.out.println("extraFields_ruleOnLeaveChkbox    : "+actextraFields_ruleOnLeaveChkbox +" Value "+expextraFields_ruleOnLeaveChkbox);
				System.out.println("extraFields_ruleOnActiveChkbox   : "+actextraFields_ruleOnActiveChkbox+" Value "+expextraFields_ruleOnActiveChkbox);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesGrid1stRow_1stcol));
				rulesGrid1stRow_1stcol.click();
				
				rulesIFEnterFiled.sendKeys("Code");
				rulesIFEnterFiled.sendKeys(Keys.TAB);
				rulesIFEnterChangeValueDrpdwn.sendKeys("Value");
				
				rulesIFEnterChangeValueDrpdwn.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesIFEnterValue));
				rulesIFEnterValue.sendKeys("123");
				
				rulesIFEnterValue.sendKeys(Keys.TAB);
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTab_MessageTab));
				rulesTab_MessageTab.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(messageTextField));
				messageTextField.sendKeys("Item Code is 123");
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesSaveBtn));
				extraFields_RulesSaveBtn.click();
				
				String expMessageOnSaveRule = "Rule Saved Successfully";
				String actMessageOnSaveRule=checkValidationMessage(expMessageOnSaveRule);
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RuleNameDropdown));
				extraFields_RuleNameDropdown.click();
				
				extraFields_RuleNameDropdown.sendKeys(Keys.SHIFT,Keys.HOME);
				
				extraFields_RuleNameDropdown.sendKeys(Keys.BACK_SPACE);		
				
				Thread.sleep(1000);
				
				extraFields_RuleNameDropdown.sendKeys("RuleForDefaultitemCodeWC");
				
				Thread.sleep(2000);
				extraFields_RuleNameDropdown.sendKeys(Keys.TAB);
				
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesOkBtn));
				extraFields_RulesOkBtn.click();
				
				String expMessageOnUpdateRule = "Field Updated Successfully";
				String actMessageOnUpdateRule=checkValidationMessage(expMessageOnUpdateRule);
				
				
				if (actRules_NewRecordChekbox==expRules_NewRecordChekbox && 
						actextraFields_ruleLoadChkbox==expextraFields_ruleLoadChkbox &&
						actextraFields_ruleOnLeaveChkbox==expextraFields_ruleOnLeaveChkbox && 
						actextraFields_ruleOnActiveChkbox==expextraFields_ruleOnActiveChkbox&& 
						
						actMessageOnSaveRule.equalsIgnoreCase(expMessageOnSaveRule) && actMessageOnUpdateRule.equalsIgnoreCase(expMessageOnUpdateRule)
						
						)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
		 	
		 	public static boolean checkSavingItemWithDefaultCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		 	{
		 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				getAction().moveToElement(homeMenu).click().build().perform();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
				homeMasterItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
				 homeMasterItem_ItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
				 itemNewBtn.click();
				 
				 /* Validating Rule Messgae on click of new */
				 
				 
				 String expRuleMessage = "Item Code is 123";
				 String actRuleMessage = checkValidationMessage(expRuleMessage);
				 System.out.println("Actual Rule message: "+actRuleMessage + "Expected Rule Message "+expRuleMessage);
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
				 
				 newGeneralName.sendKeys("ItemWithDefaultCode");
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				 
				 saveBtn.click();
				 
				 String expMessage="Saved Successfully";
					
				 String actMessage=checkValidationMessage(expMessage);
				 
				 /* Validating Rule Messgae on saving  */
				 
				 
				 String expRuleMessage1 = "Item Code is 123";
				 String actRuleMessage1 = checkValidationMessage(expRuleMessage1);
				 System.out.println("Actual Rule message: "+actRuleMessage1 + "Expected Rule Message "+expRuleMessage1);
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCLoseBtn));
					newGeneralCLoseBtn.click();
				 
				 
				 
				if (actRuleMessage.equalsIgnoreCase(expRuleMessage) &&
					
						actMessage.equalsIgnoreCase(expMessage) && 
						
						actRuleMessage1.equalsIgnoreCase(expRuleMessage1))
				{
					return true;
				} 
				else
				{
					return false;
				}
		         
		         
		 	}
		 	
		 	 
		    @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		    private static WebElement newGeneralCLoseBtn;
		    
		    @FindBy(xpath="//*[@id='btnMasterEdit']")
		    private static WebElement itemEditBtn;
		    
		 	public static boolean checkValidatinItemCodeIsAccordingToRule() throws InterruptedException
		 	{
		 		Thread.sleep(2000);
		 		
				

				int count = masterGridBodyName.size();
				
				ArrayList<String> AccountNames = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					AccountNames.add(data);
					
					if (data.equalsIgnoreCase("ItemWithDefaultCode")) 
					{
						masterGridBodyChkbox.get(i).click();
					}
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemEditBtn));
				itemEditBtn.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
				String expRuleCode= newGeneralCode.getAttribute("value");
				String actRulecode= "123";
				
				if (actRulecode.equalsIgnoreCase(expRuleCode))
				{
					return true;
				} 
				else
				{
					return false;
				}
				
		 	}
		 	
		 	
		 	
		 	@FindBy(xpath="//select[@id='ddlNewConditionFields_RuleCondition_FieldRules']")
		 	private static WebElement selectField;
				
			public static boolean checkSavingRuleWithConditionForDefaultCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
					Thread.sleep(2000);
					getDriver().navigate().refresh();
					
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
					homeMenu.click();
					
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
					mastersMenu.click();
					
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
					homeMasterItemMenu.click();
					 
					 Thread.sleep(2000);
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
					 homeMasterItem_ItemMenu.click();

					
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
					
					Thread.sleep(3000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newcreateTab));
					newcreateTab.click();
					
			        Thread.sleep(3000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cus1stRowEditBtn));
					cus1stRowEditBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesTab));
					extraFields_RulesTab.click();
					
					Thread.sleep(3000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabAddRuleBtn));
					
					boolean actRuleAdd=rulesTabAddRuleBtn.isDisplayed();
					
					rulesTabAddRuleBtn.click();
					
					String actRuleAddBtnDisplay=Boolean.toString(actRuleAdd);
					String expRuleAddBtnDisplay="true";

					System.out.println("Actual Rule Displayed  : "+actRuleAddBtnDisplay);
					System.out.println("Exp    Rule Displayed  : "+expRuleAddBtnDisplay);
					
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RuleNameDropdown));
					extraFields_RuleNameDropdown.click();
					
					extraFields_RuleNameDropdown.sendKeys(Keys.SHIFT,Keys.HOME);
					
					extraFields_RuleNameDropdown.sendKeys(Keys.BACK_SPACE);		
					
					Thread.sleep(1000);
					
					extraFields_RuleNameDropdown.sendKeys("RuleForDefaultitemCodeWC");
					
					Thread.sleep(2000);
					extraFields_RuleNameDropdown.sendKeys(Keys.TAB);
					
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ruleNewrecordChkbox));
					extraFields_ruleNewrecordChkbox.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ruleLoadChkbox));
					extraFields_ruleLoadChkbox.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ruleOnLeaveChkbox));
					extraFields_ruleOnLeaveChkbox.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ruleOnActiveChkbox));
					extraFields_ruleOnActiveChkbox.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabIFSelectTabTxt));
					rulesTabIFSelectTabTxt.click();
					
					Thread.sleep(2000);
					
					Select field = new Select(selectField);
					field.selectByVisibleText("Extra Field Update On");
					
					Thread.sleep(1000);
					
					selectField.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabNameOrCodeDrpdwn));
					
					Select sName = new Select(rulesTabNameOrCodeDrpdwn);
					sName.selectByVisibleText("sName");
					

					
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabOperatorsDrpdwn));
					
					Select operator = new Select(rulesTabOperatorsDrpdwn);
					operator.selectByVisibleText("Equal To");
					
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTbValueDropdown));
					
					Select value = new Select(rulesTbValueDropdown);
					value.selectByVisibleText("Value");
					
					
					
					
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabValueTxt));
					rulesTabValueTxt.click();
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabEnterValuetxt));
					rulesTabEnterValuetxt.sendKeys("Bank");
					
					Thread.sleep(4000);
					rulesTabEnterValuetxt.sendKeys(Keys.TAB);

					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesGrid1stRow_1stcol));
					rulesGrid1stRow_1stcol.click();
					
					rulesIFEnterFiled.sendKeys("Code");
					rulesIFEnterFiled.sendKeys(Keys.TAB);
					rulesIFEnterChangeValueDrpdwn.sendKeys("Value");
					
					rulesIFEnterChangeValueDrpdwn.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesIFEnterValue));
					rulesIFEnterValue.sendKeys("500");
					
					rulesIFEnterValue.sendKeys(Keys.TAB);
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabElseTab));
					rulesTabElseTab.click();
					
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesGridElse1stRow_1stcol));
					rulesGridElse1stRow_1stcol.click();
					
					rulesElseEnterFiled.sendKeys("Code");
					rulesElseEnterFiled.sendKeys(Keys.TAB);
					rulesElseEnterChangeValueDrpdwn.sendKeys("none");
					
					rulesElseEnterChangeValueDrpdwn.sendKeys(Keys.TAB);
					
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesSaveBtn));
					extraFields_RulesSaveBtn.click();
					
					String expMessageOnSaveRule = "Rule Saved Successfully";
					String actMessageOnSaveRule=checkValidationMessage(expMessageOnSaveRule);
					
					
					
					if(actMessageOnSaveRule.equalsIgnoreCase(expMessageOnSaveRule))
					{
						return true;
					}
					else
					{
						return false;
					}

					
			}
			
			
			public static boolean checkOkButtonAfterSavingRule() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RuleNameDropdown));
				extraFields_RuleNameDropdown.click();
				
				extraFields_RuleNameDropdown.sendKeys(Keys.SHIFT,Keys.HOME);
				
				extraFields_RuleNameDropdown.sendKeys(Keys.BACK_SPACE);		
				
				Thread.sleep(1000);
				
				extraFields_RuleNameDropdown.sendKeys("RuleForDefaultitemCodeWC");
				
				Thread.sleep(2000);
				extraFields_RuleNameDropdown.sendKeys(Keys.TAB);
				
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesOkBtn));
				extraFields_RulesOkBtn.click();
				
				String expMessageOnUpdateRule = "Field Updated Successfully";
				String actMessageOnUpdateRule=checkValidationMessage(expMessageOnUpdateRule);
				
				
				if(actMessageOnUpdateRule.equalsIgnoreCase(expMessageOnUpdateRule))
				{
					return true;
				}
				else
				{
					return false;
				}
				
				
			}
			
			@FindBy(xpath="//*[@id='divBtnGroup8']/div")
			private static WebElement headerCreateTab;
			
			@FindBy(xpath="//tbody[@id='ExtraFieldOne_table_body']//tr//td[2]")
			private static List<WebElement> extrafieldInCreateTabList;
			
			@FindBy(xpath="//*[@id='ExtraFieldOne_input_image']/span")
			private static WebElement extraFieldDropDown;
			
			
			
			@FindBy(xpath="//*[@id='divBtnGroup0']/div")
			private static WebElement headerGeneralTab;
			
			
		
			public static boolean checkRuleOnSavingItemWithExtraFieldInCreateTab() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				getAction().moveToElement(homeMenu).click().build().perform();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
				homeMasterItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
				 homeMasterItem_ItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
				 itemNewBtn.click();
				
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerCreateTab));
				 headerCreateTab.click();
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldDropDown));
				 extraFieldDropDown.click();
				 
				 
				 int count = extrafieldInCreateTabList.size();
				 ArrayList<String> AccountNames = new ArrayList<String>();
					
					for (int i = 0; i < count; i++) 
					{
						String data = extrafieldInCreateTabList.get(i).getText();
						AccountNames.add(data);
						
						if (data.equalsIgnoreCase("Bank")) 
						{
							extrafieldInCreateTabList.get(i).click();
							break;
						}
					} 
				
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
				 headerGeneralTab.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
				 newGeneralName.click();
				 newGeneralName.sendKeys("ItemWithDefCodeUponExtraFiledValue");
				
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				 
				 saveBtn.click();
				 
				 String expMessage="Saved Successfully";
					
				 String actMessage=checkValidationMessage(expMessage);
				 
				
				if (actMessage.equalsIgnoreCase(expMessage))
				{
					return true;
				} 
				else
				{
					return false;
				}
		         
		         
			}
				
		 	public static boolean checkRuleValidationAccordingToRuleWithCondition() throws InterruptedException
		 	{
		 		Thread.sleep(2000);
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCLoseBtn));
				newGeneralCLoseBtn.click();
				

				int count = masterGridBodyName.size();
				
				ArrayList<String> AccountNames = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					AccountNames.add(data);
					
					if (data.equalsIgnoreCase("ItemWithDefCodeUponExtraFiledValue")) 
					{
						masterGridBodyChkbox.get(i).click();
					}
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemEditBtn));
				itemEditBtn.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
				String expRuleCode= newGeneralCode.getAttribute("value");
				String actRulecode= "500";
				
				if (actRulecode.equalsIgnoreCase(expRuleCode))
				{
					return true;
				} 
				else
				{
					return false;
				}
				
		 	}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 	 @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules']")
			 private static WebElement MasterRules_RuleNameText ;
				     

			 @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_MasterRules']")
			 private static WebElement MasterRules_CreatingGroupChekbox ;

			 @FindBy(xpath="//*[@id='chkNewRecord_Rule_MasterRules']")
			 private static WebElement	MasterRules_NewRecordChekbox ;

			 @FindBy(xpath="//*[@id='chkEdit_Rule_MasterRules']")
			 private static WebElement MasterRules_EditChekbox ;

			 @FindBy(xpath="//*[@id='chkLoad_Rule_MasterRules']")
			 private static WebElement MasterRules_LoadChekbox ;

			 @FindBy(xpath="//*[@id='chkBeforeSave_Rule_MasterRules']")
			 private static WebElement	MasterRules_BeforeSaveChekbox ;

			 @FindBy(xpath="//*[@id='chkOnLeave_Rule_MasterRules']")
			 private static WebElement MasterRules_OnLeaveChekbox ;

			 @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_MasterRules']")
			 private static WebElement MasterRules_BeforeDeleteChekbox ;

			 @FindBy(xpath="//*[@id='chkOnEnter_Rule_MasterRules']")
			 private static WebElement MasterRules_OnEnterChekbox ;
			 
			 @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_MasterRules']")
			 private static WebElement masterRules_ActiveChekbox ;
			
			
			 
			 @FindBy(xpath="//input[@id='chkNoRuleCondition_MasterRules']")
			 private static WebElement masterRules_NoConditionChekbox;
			 
		 
			 @FindBy(xpath="//*[@id='Conditions-Context_Menu_MasterRules']/li[2]/a")
			 private static WebElement rulesOptionElseTAB;

			 @FindBy(xpath="//input[@id='txtField_RC_1_1_MasterRules']")
			 private static WebElement rulesOptionBodyGridRow1Selectfiled;

			 @FindBy(xpath="//select[@id='ddlOperators_RC_1_1_MasterRules']")
			 private static WebElement rulesOptionBodyGridRow1OPrTye;

			 @FindBy(xpath="//select[@id='ddlCompareWith_RC_1_1_MasterRules']")
			 private static WebElement rulesOptionBodyGridRow1ComparetType;

			 @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_MasterRules']")
			 private static WebElement rulesOptionBodyGridRow1ValueType;
			 
			 @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_MasterRules']")
			 private static WebElement MasterrulesTabValueTxt;
			 
			 @FindBy(xpath="//select[@class='Fselect dynFilterOpt']")
			 private static WebElement MasterrulesTabEnterValuetxt;
			 
			 
			 

			 @FindBy(xpath="//*[@id='rConditions_RULES_1_MasterRules']/div/div[1]/div[5]/select")
			 private static WebElement rulesOptionBodyGridValueDrpdwn;



			 @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_1-1']")
			 private static WebElement ruleOptiongridCol1row1;
			 
			 
			 @FindBy(xpath="//select[@id='ddlFieldsDiv_Rule_IF_MasterRules']")
			 private static WebElement MasterrulesIFEnterFiled;
			 
			 
			 @FindBy(xpath="//select[@id='ddlChangeValueFormat_IF_MasterRules']")
			 private static WebElement MasterrulesIFEnterChangeValueDrpdwn;
			 
			 @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_1-4']")
			 private static WebElement MasterrulesIFEnterValue;
			 
			 @FindBy(xpath="//*[@id='txtTextField']")
			 private static WebElement MasterRulesIFEnterValueTxt;
			 
			 @FindBy(xpath="//*[@id='Conditions-Context_Menu_MasterRules']/li[2]/a/i")
			 private static WebElement MasterrulesTabElseTab;
			 
			 

			 @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_1-2']")
			 private static WebElement ruleOptiongridCol1row2;

			 @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_1-4']")
			 private static WebElement ruleOptiongridCol1row4;

			 @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_MasterRules']")
			 private static WebElement ruleOptiongridEnterAccType;

			 @FindBy(xpath="//select[@id='ddlChangeValueFormat_IF_MasterRules']")
			 private static WebElement ruleOptiongridEnterChangeValueType;

			 @FindBy(xpath="//input[@id='txtTextField']")
			 private static WebElement ruleOptiongridEnterValueTxt;



			 @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-1']")
			 private static WebElement ruleOptiongridElseCol1row1;

			 @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-2']")
			 private static WebElement ruleOptiongridElseCol1row2;

			 @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-4']")
			 private static WebElement ruleOptiongridElseCol1row4;

			 @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_MasterRules']")
			 private static WebElement ruleOptiongridElseEnterItemType;

			 @FindBy(xpath="//select[@id='ddlChangeValueFormat_ELSE_MasterRules']")
			 private static WebElement ruleOptiongridEnterElseChangeValueType;

			 @FindBy(xpath="//input[@id='tblFormating_Else_Rule_MasterRules_col_1-4']")
			 private static WebElement ruleOptiongridEnterElseValueTxt;

			 @FindBy(xpath="//select[@id='ddlMasterFields_RULES_MasterRules']")
			 private static WebElement selectMasterField;
			
		 
			 @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[1]/div[1]/span")
			 private static WebElement Masters_RulesSaveBtn;
			 
		 
		 
		 
		 public boolean checkRuleSavingUnderRuleOptionUnderAccountMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		 {
		  
			 getDriver().navigate().refresh();
			  
			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			 homeMenu.click();

			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
			 mastersMenu.click();

			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
			 homeMasterItemMenu.click();
			 
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
			 homeMasterItem_ItemMenu.click();

			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();


			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 masterRibbonControlNextBtn.click();


			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 masterRibbonControlNextBtn.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 masterRibbonControlNextBtn.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 masterRibbonControlNextBtn.click();

			 Thread.sleep(3000);
			  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
			 masterCustamizemasterBtn.click();
			 Thread.sleep(3000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RulesOption));
			 RulesOption.click();

			 Thread.sleep(1000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Rules_AddRuleBtn));
			 Rules_AddRuleBtn.click();

			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_RuleNameText));
			 MasterRules_RuleNameText.click();
			 MasterRules_RuleNameText.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			 Thread.sleep(2000);
			 MasterRules_RuleNameText.sendKeys("GobalItemRule");

			 Thread.sleep(2000);
			 MasterRules_RuleNameText.sendKeys(Keys.TAB);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_NewRecordChekbox));
			 MasterRules_NewRecordChekbox.click();

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_EditChekbox));
			 MasterRules_EditChekbox.click();

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_LoadChekbox));
			 MasterRules_LoadChekbox.click();

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_OnLeaveChekbox));
			 MasterRules_OnLeaveChekbox.click();

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_OnEnterChekbox));
			 MasterRules_OnEnterChekbox.click();

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_BeforeSaveChekbox));
			 MasterRules_BeforeSaveChekbox.click();


			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRules_ActiveChekbox));
			 masterRules_ActiveChekbox.click();

			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesOptionBodyGridRow1Selectfiled));
			 rulesOptionBodyGridRow1Selectfiled.click();
				
				Thread.sleep(2000);
				
				Select field = new Select(selectMasterField);
				field.selectByVisibleText("Item Type");
				
				Thread.sleep(1000);
				
				selectMasterField.sendKeys(Keys.TAB);
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesOptionBodyGridRow1OPrTye));
				
				Select operator = new Select(rulesOptionBodyGridRow1OPrTye);
				operator.selectByVisibleText("Equal To");
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesOptionBodyGridRow1ComparetType));
				
				Select value = new Select(rulesOptionBodyGridRow1ComparetType);
				value.selectByVisibleText("Value");
				
				
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterrulesTabValueTxt));
				MasterrulesTabValueTxt.click();
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterrulesTabEnterValuetxt));
				MasterrulesTabEnterValuetxt.sendKeys("Finished goods");
				
				Thread.sleep(4000);
				MasterrulesTabEnterValuetxt.sendKeys(Keys.TAB);

				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ruleOptiongridCol1row1));
				ruleOptiongridCol1row1.click();
				
			
				MasterrulesIFEnterFiled.sendKeys("Code");
				MasterrulesIFEnterFiled.sendKeys(Keys.TAB);
				
				MasterrulesIFEnterChangeValueDrpdwn.sendKeys("Value");
				
				MasterrulesIFEnterChangeValueDrpdwn.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterrulesIFEnterValue));
				MasterrulesIFEnterValue.click();
				MasterRulesIFEnterValueTxt.click();
				MasterRulesIFEnterValueTxt.sendKeys("Gb123");
				
				MasterRulesIFEnterValueTxt.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterrulesTabElseTab));
				MasterrulesTabElseTab.click();
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ruleOptiongridElseCol1row1));
				ruleOptiongridElseCol1row1.click();
				
				ruleOptiongridElseEnterItemType.sendKeys("Code");
				ruleOptiongridElseEnterItemType.sendKeys(Keys.TAB);
				ruleOptiongridEnterElseChangeValueType.sendKeys("Value");
				
				ruleOptiongridEnterElseChangeValueType.sendKeys(Keys.TAB);
				
				
				/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ruleOptiongridEnterElseValueTxt));
				ruleOptiongridEnterElseValueTxt.click();*/
				
				MasterRulesIFEnterValueTxt.click();
				MasterRulesIFEnterValueTxt.sendKeys("1234");
				
				MasterRulesIFEnterValueTxt.sendKeys(Keys.TAB);
				
			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Masters_RulesSaveBtn));
				Masters_RulesSaveBtn.click();
				
				String expMessageOnSaveRule = "Rule Saved Successfully";
				String actMessageOnSaveRule=checkValidationMessage(expMessageOnSaveRule);
				
				
				
				if(actMessageOnSaveRule.equalsIgnoreCase(expMessageOnSaveRule))
				{
					return true;
				}
				else
				{
					return false;
				}

		 }	
			 
		 public static boolean checkSavingItemForGlobalRule() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		 {
			
			 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
					getAction().moveToElement(homeMenu).click().build().perform();
					
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
					mastersMenu.click();
					
					
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
					homeMasterItemMenu.click();
					 
					 Thread.sleep(2000);
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
					 homeMasterItem_ItemMenu.click();
					 
					 Thread.sleep(2000);
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
					 itemNewBtn.click();
					 
					
					 
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
					 
					 newGeneralName.sendKeys("GlobalItem");
					 
					 Select type = new Select(newGeneralItemTypeDropDown);
					 type.selectByVisibleText("Finished goods");
					 
					 Thread.sleep(2000);
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
					 
					 saveBtn.click();
					 
					 String expMessage="Saved Successfully";
						
					 String actMessage=checkValidationMessage(expMessage);
					 
					
					 
					if (
						
							actMessage.equalsIgnoreCase(expMessage) )
					{
						return true;
					} 
					else
					{
						return false;
					}
			         
			         
			 	}
			 	
		 		
		 	public static boolean checkValidatingGlobalItemCode() throws InterruptedException
		 	{
		 		Thread.sleep(2000);
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCLoseBtn));
				newGeneralCLoseBtn.click();
				

				int count = masterGridBodyName.size();
				
				ArrayList<String> AccountNames = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					AccountNames.add(data);
					
					if (data.equalsIgnoreCase("GlobalItem")) 
					{
						masterGridBodyChkbox.get(i).click();
					}
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemEditBtn));
				itemEditBtn.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
				String expRuleCode= newGeneralCode.getAttribute("value");
				String actRulecode= "Gb123";
				
				if (actRulecode.equalsIgnoreCase(expRuleCode))
				{
					return true;
				} 
				else
				{
					return false;
				}
		 	}
		 
		 	
		 	
		 	
		 	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]/i")
		 	private static WebElement EditClosebtn;
			 	
		 	public static boolean checkValidatingElseCoditionForGobalitem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		 	{
		 		Thread.sleep(3000);
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EditClosebtn));
		 		EditClosebtn.click();
				

				int count = masterGridBodyName.size();
				
				ArrayList<String> AccountNames = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					AccountNames.add(data);
					
					if (data.equalsIgnoreCase("GlobalItem")) 
					{
						if(masterGridBodyChkbox.get(i).isSelected() == false )
						{
							masterGridBodyChkbox.get(i).click();
						}
						
					}
				}
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemEditBtn));
				itemEditBtn.click();
				
				Thread.sleep(2000);
				
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralItemTypeDropDown));
				 newGeneralItemTypeDropDown.click();
				 Select type = new Select(newGeneralItemTypeDropDown);
				 type.selectByVisibleText("Raw material");
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				 
				 saveBtn.click();
				 
				 String expMessage="Updated Successfully";
					
				 String actMessage=checkValidationMessage(expMessage);
				 
				
				 
				if (
					
						actMessage.equalsIgnoreCase(expMessage) )
				{
					return true;
				} 
				else
				{
					return false;
				}
		 	}
				
		 	public static boolean checkValidatingRuleElseConditionForGloablitem() throws InterruptedException
		 	{
		 		Thread.sleep(3000);
		 		
		 		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EditClosebtn));
		 		EditClosebtn.click();*/
				

				int count = masterGridBodyName.size();
				
				ArrayList<String> AccountNames = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					AccountNames.add(data);
					
					if (data.equalsIgnoreCase("GlobalItem")) 
					{
						if(masterGridBodyChkbox.get(i).isSelected() == false )
						{
							masterGridBodyChkbox.get(i).click();
						}
						
					}
				}
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemEditBtn));
				itemEditBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
				String expRuleCode= newGeneralCode.getAttribute("value");
				String actRulecode= "1234";
				
				if (actRulecode.equalsIgnoreCase(expRuleCode))
				{
					return true;
				} 
				else
				{
					return false;
				}
		 	}

		
		 
		
		 
		 
		 
		 
		 
		 
		 
		 @FindBy(xpath="//span[contains(text(),'Info Panel Customization')]")
		 private static WebElement itemInfoPanelCustomizationTab;
		 
		   @FindBy(xpath="//*[@id='tabContent_IPCust_MasterCust']/div[1]/div/div[1]")
		    private static WebElement iteminfoPanelCust_AddBtn;

		    @FindBy(xpath="//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
		    private static WebElement infoPanelCust_DeleteBtn;

		    @FindBy(xpath="//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		    private static WebElement infoPanelCust_CloseBtn;
		    @FindBy(xpath="//button[@id='infoPanelSetting_save']")
			private static WebElement infoPanelSettingSaveBtn;
			
			@FindBy(xpath="//button[@id='infoPanelSetting_Cancel']")
			private static WebElement infoPanelSettingCancelBtn;
			
			@FindBy(xpath="(//span[@id='btnCancel'])[2]")
			private static WebElement infoPanelSettingCloseBtn;
			
			@FindBy(xpath="//input[@id='txt_InfoPanel_PanelName']")
			private static WebElement infoPanelSettingsPanelNameTxt;
			
			@FindBy(xpath="//table[@id='id_tblBuildFrom_master']/tbody/tr[1]/td[2]/input")
			private static WebElement infoPanelSettingsMasterFieldsNameRow1;
			
			@FindBy(xpath="//table[@id='id_tblBuildFrom_master']/tbody/tr[2]/td[2]/input")
			private static WebElement infoPanelSettingsMasterFieldsNameRow2;
			
			@FindBy(xpath="//table[@id='id_tblBuildFrom_master']/tbody/tr[1]/td[3]/input")
			private static WebElement infoPanelSettingsMasterFieldsCaptionRow1;
			
			@FindBy(xpath="//table[@id='id_tblBuildFrom_master']/tbody/tr[2]/td[3]/input")
			private static WebElement infoPanelSettingsMasterFieldsCaptionRow2;
			
			@FindBy(xpath="//select[@id='MasterFields_OptionNames']")
			private static WebElement infoPanelSettingsFieldNameDrpdwn;
			
			@FindBy(xpath="//div[@id='id_tblBuildFrom_master_details']/table/tbody")
			private static WebElement infoPanelSettingsPreviewField; 
			
			
			
			 
		 
		 
		 
		 public static boolean checkCustomizeMasterInfoPanelCustomizationAddingPanel() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		 {
			 	getDriver().navigate().refresh();
				
				Thread.sleep(4000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				getAction().moveToElement(homeMenu).click().build().perform();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
				homeMasterItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
				 homeMasterItem_ItemMenu.click();

				
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
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemInfoPanelCustomizationTab));
				itemInfoPanelCustomizationTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSaveBtn));
				infoPanelSaveBtn.click();
				
				String expMessageWithoutPanelName = "Enter panel name";
				String actMessageWithoutPanelName = checkValidationMessage(expMessageWithoutPanelName);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSettingsPanelNameTxt));
				infoPanelSettingsPanelNameTxt.click();
				infoPanelSettingsPanelNameTxt.sendKeys("ItemTypeInfo");
				infoPanelSettingsPanelNameTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSettingSaveBtn));
				infoPanelSettingSaveBtn.click();
				
				String expMessageWithoutFieldName = "Select atleast one field";
				String actMessageWithoutFieldName = checkValidationMessage(expMessageWithoutFieldName);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSettingsMasterFieldsCaptionRow1));
				getAction().doubleClick(infoPanelSettingsMasterFieldsNameRow1).build().perform();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSettingsFieldNameDrpdwn));
				
				Select fieldNameDrpdwn = new Select(infoPanelSettingsFieldNameDrpdwn);
				fieldNameDrpdwn.selectByVisibleText("Item Type");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSettingsMasterFieldsCaptionRow1));
				infoPanelSettingsMasterFieldsCaptionRow1.click();
				
				Thread.sleep(2000);
				
				String actPreview = infoPanelSettingsPreviewField.getText();
				String expPreview = "Item Type Data goes here";
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSettingSaveBtn));
				infoPanelSettingSaveBtn.click();
				
				String expMessage = "Panel Details Saved Successfully";
				String actMessage = checkValidationMessage(expMessage);
				
				System.out.println("***********************************checkCustomizeMasterInfoPanelCustomizationAddingPanel*********************************");
			    
				System.out.println("MessageWithoutPanelName : "+actMessageWithoutPanelName +"  Value Expected  "+expMessageWithoutPanelName);
				System.out.println("MessageWithoutFieldName : "+actMessageWithoutFieldName +"  Value Expected  "+expMessageWithoutFieldName);
				System.out.println("Preview                 : "+actPreview                 +"  Value Expected  "+expPreview);
				System.out.println("Message                 : "+actMessage                 +"  Value Expected  "+expMessage);
				
				if(actMessageWithoutPanelName.equalsIgnoreCase(expMessageWithoutPanelName) && actMessageWithoutFieldName.equalsIgnoreCase(expMessageWithoutFieldName) 
					   && actPreview.equalsIgnoreCase(expPreview) && actMessage.equalsIgnoreCase(expMessage))
				{	
					return true;
				}	 
				else
				{
					return false;
				}
			 }
			
		 

			
			@FindBy(xpath="//table[@id='tbl_infoPanel_names']/tbody/tr/td[2]")
			private static List<WebElement> masterCustInfoPanelNameList;
			
			@FindBy(xpath="//table[@id='tbl_infoPanel_names']/tbody/tr/td[3]")
			private static List<WebElement> masterCustInfoPanelDetailsList;
			
			@FindBy(xpath="//table[@id='tbl_infoPanel_names']/tbody/tr/td[4]/i")
			private static List<WebElement> masterCustInfoPanelAddOrDeleteBtnList;
			
			@FindBy(xpath="//*[@id='btnsideBar']")
			public static WebElement masterSideBarBtn; 
			
			@FindBy(xpath="//*[@id='tbl_infoPanel_names']/tbody/tr[4]/td[4]/i")
			public static WebElement infoPane_PopGridAuthorizationAddBtn;
			
			@FindBy(xpath="//a[@class='Fbutton previous_link']")
			public static WebElement infoPane_PopDetailsPreviousBtn;
			
			@FindBy(xpath="//*[@id='page_navigation']/a[2]")
			public static WebElement infoPane_PopDeailsOneBtn;
			
			@FindBy(xpath="//*[@id='customize_InfoPanel_btnSave']")
			public static WebElement infoPane_PopDeatilsSaveBtn;
			

			@FindBy(xpath="//label[contains(text(),'Info Panel')]")
			public static WebElement masterInfoPanelLabel; 

			@FindBy(xpath="//i[@class='icon-custamize theme_icon-color']")
			public static WebElement masterInfoPanelCustammizeBtn;
			
			@FindBy(xpath="//*[@id='tabContent_IPCust_MasterCust']/div[1]/div/div[1]/div[1]/span")
			public static WebElement infoPanelSaveBtn;			
			
			
			
			
		 	public static boolean checkValidatingDashletAddedInInfoPanelCustomizePopup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
		 		
		 		
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelCust_CloseBtn));
				infoPanelCust_CloseBtn.click();
				
		 		Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSideBarBtn));
				masterSideBarBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterInfoPanelCustammizeBtn));
				masterInfoPanelCustammizeBtn.click();
				
				Thread.sleep(2000);
				
				int count = masterCustInfoPanelNameList.size();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterCustInfoPanelNameList.get(i).getText();
					if (data.equalsIgnoreCase("ItemTypeInfo")) 
					{
						masterCustInfoPanelAddOrDeleteBtnList.get(i).click();
					}
					
					
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPane_PopDeatilsSaveBtn));
				infoPane_PopDeatilsSaveBtn.click();
				
				String expMessage = "Panel saved!!";
				String actMessage = checkValidationMessage(expMessage);
				
				Thread.sleep(3000);
				
				System.out.println("***********************************checkAddingAuthorizationDashletInfoPanelInMasterAccount*********************************");
			    
				if(actMessage.equalsIgnoreCase(expMessage))
				{	
					return true;
				}	 
				else
				{
					return false;
				}
			} 
		 
		 	
		 	 @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
		 	 private static List<WebElement> masterGridBodyName;
		 	 
		 	 @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]//input")
		 	 private static List<WebElement> masterGridBodyChkbox;
		 	 
		 	@FindBy(xpath="//div[@id='divInfoPanel']/div/div/div[1]/label")
		 	private static List<WebElement> infoPanelDashletsList;
		 	
		 	@FindBy(xpath="//div[@id='divInfoPanel']/div[1]/div/div[2]/div/div/table/tbody/tr/td")
		 	private static List<WebElement> infoPanelDashlet1Details;
		 	
		 	@FindBy(xpath="//div[@id='divInfoPanel']/div[2]/div/div[2]/div/div/table/tbody/tr/td/label")
		 	private static List<WebElement> infoPanelDashlet2Details;

			public static boolean checkValidatingDashletAddedInInfoPanelBySelectingTestMaster() throws InterruptedException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSideBarBtn));
				masterSideBarBtn.click();
				
				Thread.sleep(2000);
				
				int dashletcount = infoPanelDashletsList.size();
				
				ArrayList<String> dashlet = new ArrayList<String>();
				
				for (int i = 0; i < dashletcount; i++) 
				{
					String data = infoPanelDashletsList.get(i).getText();
					dashlet.add(data);
				}
				
				String actDashletAdded = dashlet.toString();
				String expDashletAdded = "[ItemTypeInfo]";
				
				
				
				int count = masterGridBodyName.size();
				
				ArrayList<String> AccountNames = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					AccountNames.add(data);
					
					if (data.equalsIgnoreCase("BIN FINISHED GOODS ITEM")) 
					{
						masterGridBodyChkbox.get(i).click();
					}
				}
				
				Thread.sleep(2000);
				   
				ArrayList<String> panelDetails = new ArrayList<String>();
				int count1 = infoPanelDashlet1Details.size();

				for (int i = 0; i < count1; i++) 
				{
					String data = infoPanelDashlet1Details.get(i).getText();
					panelDetails.add(data);
				}
				
				String actDashletDetails = panelDetails.toString();
				String expDashletDetails = "[Item Type, :, Finished goods]";
				
				System.out.println("*********************************checkValidatingDashletAddedInInfoPanelBySelectingTestMaster*****************************************");
				
				System.out.println(actDashletAdded);
				System.out.println(expDashletAdded);
				System.out.println(actDashletDetails);
				System.out.println(expDashletDetails);
				
				if (actDashletAdded.equalsIgnoreCase(expDashletAdded) && actDashletDetails.equalsIgnoreCase(expDashletDetails))
				{
					return true;
				} 
				else
				{
					return false;
				}
			}
			
			public static boolean checkSavingItemWithAnImageForInfoPanel() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				getAction().moveToElement(homeMenu).click().build().perform();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
				homeMasterItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
				 homeMasterItem_ItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
				 itemNewBtn.click();
				 
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
				 
				 newGeneralName.sendKeys("StockItemWithImage");
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
				 
		         newGeneralCode.sendKeys("StockCode");
		         
		         Thread.sleep(2000);
		         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(imagebrowseBtn));
		         imagebrowseBtn.click();
		         
		         
			     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\ImportingImageInItem.exe");
			     
			     Thread.sleep(5000);
		         
		         
		         
		         Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				 
				 saveBtn.click();
				 
				 String expMessage="Saved Successfully";
					
				 String actMessage=checkValidationMessage(expMessage);
				 
				 if(actMessage.equalsIgnoreCase(expMessage))
				 {
					
					 return true;
				 }
				 else
				 {
					
					 return false;
				 }
				 
				 

			}
			
			@FindBy(xpath="//*[@id='ddl_infoPanel_panelType']")
			private static WebElement infoPannelSettings_pannelType;
			
		  public static boolean checkCustomizeMasterImageInfoPanelCustomizationAddingPanel() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		  {
			 	getDriver().navigate().refresh();
				
				Thread.sleep(4000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				getAction().moveToElement(homeMenu).click().build().perform();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
				homeMasterItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
				 homeMasterItem_ItemMenu.click();

				
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
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemInfoPanelCustomizationTab));
				itemInfoPanelCustomizationTab.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSaveBtn));
				infoPanelSaveBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSettingsPanelNameTxt));
				infoPanelSettingsPanelNameTxt.click();
				infoPanelSettingsPanelNameTxt.sendKeys("ItemImageinfo");
				infoPanelSettingsPanelNameTxt.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPannelSettings_pannelType));
				Select pannelType = new Select(infoPannelSettings_pannelType);
				pannelType.selectByVisibleText("Image");
				
			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelSettingSaveBtn));
				infoPanelSettingSaveBtn.click();
				
				String expMessage = "Panel Details Saved Successfully";
				String actMessage = checkValidationMessage(expMessage);
				
				System.out.println("***********************************checkCustomizeMasterInfoPanelCustomizationAddingPanel*********************************");
			   
				System.out.println("Message                 : "+actMessage                 +"  Value Expected  "+expMessage);
				
				if(actMessage.equalsIgnoreCase(expMessage))
				{	
					return true;
				}	 
				else
				{
					return false;
				}
			 }
			
		  
			
		 	public static boolean checkValidatingImageInfoPanelInCustomizePopup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
		 		Thread.sleep(2000);
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelCust_CloseBtn));
				infoPanelCust_CloseBtn.click();
				
		 		/*Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSideBarBtn));
				masterSideBarBtn.click();*/
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterInfoPanelCustammizeBtn));
				masterInfoPanelCustammizeBtn.click();
				
				Thread.sleep(2000);
				
				int count = masterCustInfoPanelNameList.size();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterCustInfoPanelNameList.get(i).getText();
					if (data.equalsIgnoreCase("ItemImageinfo")) 
					{
						masterCustInfoPanelAddOrDeleteBtnList.get(i).click();
					}
					
					
				}
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPane_PopDeatilsSaveBtn));
				infoPane_PopDeatilsSaveBtn.click();
				
				String expMessage = "Panel saved!!";
				String actMessage = checkValidationMessage(expMessage);
				
				Thread.sleep(3000);
				
				System.out.println("***********************************checkAddingAuthorizationDashletInfoPanelInMasterAccount*********************************");
			    
				if(actMessage.equalsIgnoreCase(expMessage))
				{	
					return true;
				}	 
				else
				{
					return false;
				}
			} 
		 	
		 	@FindBy(xpath="//div[@class='img-logo']")
		 	private static WebElement imageInInfopanel;
		 	
		 	public static boolean checkValidatingDashletAddedInImageInfoPanelBySelectingImageItemInMaster() throws InterruptedException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSideBarBtn));
				masterSideBarBtn.click();
				
				Thread.sleep(2000);
				
				int dashletcount = infoPanelDashletsList.size();
				
				ArrayList<String> dashlet = new ArrayList<String>();
				
				for (int i = 0; i < dashletcount; i++) 
				{
					String data = infoPanelDashletsList.get(i).getText();
					dashlet.add(data);
				}
				
				String actDashletAdded = dashlet.toString();
				String expDashletAdded = "[ItemTypeInfo, ItemImageinfo]";
				
				
				
				int count = masterGridBodyName.size();
				
				ArrayList<String> AccountNames = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					AccountNames.add(data);
					
					if (data.equalsIgnoreCase("StockItemWithImage")) 
					{
						masterGridBodyChkbox.get(i).click();
					}
				}
				
				Thread.sleep(2000);
				
				
				   
				boolean actStockimge = imageInInfopanel.isDisplayed();
				boolean expStockimage = true;
				
				
				
				
				System.out.println("*********************************checkValidatingDashletAddedInInfoPanelBySelectingTestMaster*****************************************");
				
				System.out.println(actDashletAdded);
				System.out.println(expDashletAdded);
				
				System.out.println(actStockimge);
				System.out.println(expStockimage);
				
				if (actDashletAdded.equalsIgnoreCase(expDashletAdded) && actStockimge == expStockimage)
				{
					return true;
				} 
				else
				{
					return false;
				}
			}
			
		 	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[6]/span")
		 	public static WebElement reportsInCustomizeMaster;


		 	@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div")
		 	public static List<WebElement> allReportsInReportsInCustomizeMaster;

		 	@FindBy(xpath="//*[@id='tabContent_Reports_MasterCust']/div[1]/div/div[1]/div[1]/span")
		 	public static WebElement saveBtnInReports;
		 	
		 	public static boolean checkABCReportsInCustomizeItemMasterReportsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		 	{
		 		getDriver().navigate().refresh();
				
				Thread.sleep(4000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				getAction().moveToElement(homeMenu).click().build().perform();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
				homeMasterItemMenu.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
				 homeMasterItem_ItemMenu.click();

				
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
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemInfoPanelCustomizationTab));
				itemInfoPanelCustomizationTab.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsInCustomizeMaster));
				reportsInCustomizeMaster.click();
				
				Thread.sleep(2000);
				
				int reportsListCount = allReportsInReportsInCustomizeMaster.size();
				
				
				int expreportsListCount=41;
				System.err.println("Reports Count"+reportsListCount +" Value  :"+expreportsListCount);
				
				for (int i = 0; i < reportsListCount; i++) 
				{
					String data = allReportsInReportsInCustomizeMaster.get(i).getText();
					
					if (data.equalsIgnoreCase("ABC analysis")) 
					{
						allReportsInReportsInCustomizeMaster.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInReports));	
				saveBtnInReports.click();
				
				String expMessage = "Reports Attached to Master";
				String actMessage = checkValidationMessage(expMessage);

				if (actMessage.equalsIgnoreCase(expMessage))
				{
					return true;
				}
				else
				{
					return false;
				}
		 	}
		 
		 	@FindBy(xpath="//*[@id='btnABC analysis']/i")
		 	private static WebElement masterABCAnalysisBtn;
		 	
		 	public static boolean checkABCAnalysisDisplayingInMasterRibbonControl() throws InterruptedException
		 	{
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
		 		homeMenu.click();
	 
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 		mastersMenu.click();
	 
		 		Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
				homeMasterItemMenu.click();
				 
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
				homeMasterItem_ItemMenu.click();

	 
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 		masterRibbonToExpandOptions.click();
	 
		 		masterRibbonControlNextBtn.click(); 
		 		masterRibbonControlNextBtn.click();
		 		masterRibbonControlNextBtn.click();
		 		masterRibbonControlNextBtn.click();
		 		masterRibbonControlNextBtn.click();
		 		masterRibbonControlNextBtn.click();
		 		masterRibbonControlNextBtn.click();
		 		masterRibbonControlNextBtn.click();
		 		masterRibbonControlNextBtn.click();
		 		masterRibbonControlNextBtn.click();
		 		masterRibbonControlNextBtn.click();
	 
		 		Thread.sleep(2000);
	 
		 		boolean actmasterABCAnalysisBtn    	  =masterABCAnalysisBtn.isDisplayed();
		 		boolean expmasterABCAnalysisBtn    	  = true;
	 
		 		System.out.println("*****************************checkLedgerDetailButtonInRibbonControl************************************");
	 
		 		System.out.println("masterLedgerDetailBtn  : "+actmasterABCAnalysisBtn  +" Value Expected : "+expmasterABCAnalysisBtn);
	
	
		 		if(actmasterABCAnalysisBtn==expmasterABCAnalysisBtn)
		 		{
		 			return true;
		 		}
		 		else
		 		{
		 			return false;
		 		}
		 	}
		 	
		 	@FindBy(xpath="//*[@id='liSelectAllMasters']")
		 	private static WebElement selectAllItemsCheckbox;
		 	
		 	@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[1]/td")
			private static List<WebElement> reportsRow1List;
			
			@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[2]/td")
			private static List<WebElement> reportsRow2List;
			
			@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[3]/td")
			private static List<WebElement> reportsRow3List;
			
			@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[4]/td")
			private static List<WebElement> reportsRow4List;
			
		 	
		 	public static boolean checkABCAnalysisReportforAllItems() throws InterruptedException
		 	{	
		 		Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllItemsCheckbox));		
				selectAllItemsCheckbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterABCAnalysisBtn));		
				masterABCAnalysisBtn.click();
				
				
				ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
				
				int actOpenWindowsCount = getDriver().getWindowHandles().size();
				int expOpenWindowsCount = 2;

			 	getDriver().switchTo().window(openTabs.get(1));
				
				Thread.sleep(2000);
				
				 
				int reportsrow1ItemsCount = reportsRow1List.size();
				ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
				for(int i=1;i<reportsrow1ItemsCount;i++)
				{
					String data = reportsRow1List.get(i).getText();
					reportsRow1ListArray.add(data);
				}
				String actRow1List = reportsRow1ListArray.toString();
				String expRow1List = "[A Product]";
				
				
				int reportsrow2ItemsCount = reportsRow2List.size();
				ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
				for(int i=1;i<reportsrow2ItemsCount;i++)
				{
					String data = reportsRow2List.get(i).getText();
					reportsRow2ListArray.add(data);
				}
				String actRow2List = reportsRow2ListArray.toString();
				String expRow2List = "[STD RATE COGS ITEM, 11.00, 110.00]";
				
				System.out.println("*********************************checkABCAnalysisReport*****************************************");
				
				System.out.println("ActualRow1List Values   " +actRow1List);
				System.out.println("ExpectedRow1List Values " +expRow1List);
				
				System.out.println("ActualRow2List Values  " +actRow2List);
				System.out.println("ExpectedRow1List Values" +expRow2List);
				
				getDriver().switchTo().window(openTabs.get(1)).close();
			 	getDriver().switchTo().window(openTabs.get(0));
			 	Thread.sleep(3000);
			 	 getDriver().navigate().refresh();
				 Thread.sleep(2000);
				  
				 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
				 userNameDisplay.click();

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
				 logoutOption.click();
				 
				
				if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
						
				{
					return true;
				} 
				else
				{
					return false;
				}
				
				
		 	}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 public ItemMasterCustomizationPage(WebDriver driver)
		 {
			PageFactory.initElements(driver, this);
			
		 }

 

		 
	
}
