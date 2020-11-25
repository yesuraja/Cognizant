package com.test.qa.pageFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;
import com.test.qa.libraries.FunctionalLibrary;

import com.test.qa.utilities.ExcelUtil;

public class Raja_Sprint2 extends FunctionalLibrary{
	
	ExcelUtil excelutil = new ExcelUtil();
	WebDriverWait wait = new WebDriverWait(driver,30);
	static Logger log = Logger.getLogger(Raja_Sprint2.class.getName());
	String PracticefromDemnd = null;
	String BillabilityfrmDmd =null;
	String BillabilityfromDemand = null;
	String PracticefromwinzoneDemnd = null;
	String ServiceLinefromwinzoneDemnd = null;
	String BillabilityfromwinzoneDemnd = null;
	
	
	@FindBy (xpath="//*[@id='create_demand']")
	public WebElement CrtDmdIdent;
	
	@FindBy (xpath="//input[contains(@id,'project_id_label')]")
	public WebElement ProjectID;
	
	@FindBy (xpath="//li[contains(@class,'BTM') and contains (text(),'100000006751 - Pepsico')]")
	public WebElement ProIdBTM;
	
	@FindBy (xpath="//*[@class='Add_demand']")
	public WebElement AddDmdlink;
	
	
	@FindBy (xpath="(//input[@name='customRadio' and @type='radio'])[1]")
	public WebElement radioDemand;		
	
	@FindBy (xpath="//button[contains(@class,'btn btn-primary done')]")
	public WebElement btnDoneAddDmd;
	
	@FindBy (xpath="//input[@id='practice']")
	public WebElement txtPractice;
	
	@FindBy (xpath="//button[contains (@class,'btn btn-primary  proceed_btn')]")
	public WebElement btnProtoCreate;
		
	@FindBy (xpath="(//input[@id=\"billabilityEdit\"])[1]")
	public WebElement drpdwnBillability;
	
	@FindBy (xpath="(//*[@id=\"onsite_offshoreEdit\"])[1]")
	public WebElement drpdwnOnsiteOffshore;
	
	@FindBy (xpath="//*[@id='txtPositions']")
	public WebElement txtNoofPositions;
	
	@FindBy (xpath="(//input[contains(@name,'deal_close_date')])[1]")
	public WebElement txtDealCloseDate;
	
	@FindBy (xpath="(//input[contains(@id,'back_fill')])[1]")
	public WebElement txtBackfill;
	
	@FindBy (xpath="(//input[contains(@name,'duration')])[1]")
	public WebElement txtDuration;
	
	@FindBy (xpath="(//input[contains(@id,'revenue')])[1]")
	public WebElement txtRevenue;
	
	@FindBy (xpath="//li[contains(@class,'inp_dropdown_list') and contains (text(),'MEPZ - SDB2')]")
	public WebElement txtRevenueValue;
	
	@FindBy (xpath="(//input[contains(@name,'demand')])[1]")
	public WebElement txtDemandName;
	
	@FindBy (xpath="//*[@id='StartDate']")
	public WebElement txtStartDate;
	
	@FindBy (xpath="//label[contains (@for,'resourceIdentifiedYs')]")
	public WebElement ResourceIdenYes;
	
	@FindBy (xpath="//label[contains (@for,'resourceIdentifiedNo')]")
	public WebElement ResourceIdenNO;
	
	@FindBy (xpath="//span[contains(@class,'delete')]")
	public WebElement DeleteDmndBtn;
	
	@FindBy (xpath="//*[@id='deleteDetails']/div/div")
	public WebElement DeleteDmndPopup;
	
	@FindBy (xpath="(//button[contains(@class,'Yes')])[1]")
	public WebElement btnDeleteYES;
	
	@FindBy (xpath="(//button[@class='btn btn-secondary'])[3]")
	public WebElement btnDeleteNO;
	
	@FindBy (xpath="(//div[contains(@class,'custom-control custom-radio')])[1]")
	public WebElement btnradioManualDemand;
	
	@FindBy (xpath="//table[@id=\"opprTable\"]/tbody/tr/td")
	public WebElement labelNOData;
	
	@FindBy (xpath="//select[contains(@id,'ddlReqType')]")
	public WebElement RequirementType;
	
	@FindBy (xpath="(//input[contains(@placeholder,'Enter Associate ID/Name')])[2]")
	public WebElement AssociateID;
	
	@FindBy (xpath="//*[@id=\"SubmitDemandIndent\"]/div[3]/div/div[2]/div/div[3]/div[1]")
	public WebElement AssociateIDHeader;
	
	public String AssociateIDList="//*[@id='ui-id-1']/li/div";
			
	@FindBy (xpath="//button[@id='addAssociateBtn']")
	public WebElement buttonTICK;
	
	@FindBy (xpath="//select[@id='billabilityType-0']")
	public WebElement BillYesAssAcordn;
	
	@FindBy (xpath="//*[@id='project-details-wrapper']/div[3]/button[1]")
	public WebElement btnDiscard;
	
	@FindBy (xpath="//*[@id='discardDemand']/div/div/div[2]/button[2]")
	public WebElement btnDiscardYES;
	
	@FindBy (xpath="//span[@class='complete_status']")
	public WebElement btnDimandindentDetailsTick;
	
	@FindBy (xpath="//input[@id='cpy_All_Details']")
	public WebElement btnCopyAll;
	
	@FindBy (xpath="//*[@id='heading0']/button")
	public WebElement btnAssAccrdnExpand;
	
	@FindBy (xpath="//*[@id='confirmCopyPopup']/div/div/div[3]/button[1]")
	public WebElement btnYEScopyall;
	
	@FindBy (xpath="//div[@id='ResponseErrorModal']/div/div/div[2]")
	public WebElement PracticeErrorMessage;
	
	@FindBy (xpath="//td[contains(@class,'today day')]")
	public WebElement DateStartCurrentDate;
	
	@FindBy (xpath="//button[@id='btnDemandRole0']")
	public WebElement txtDemandRolelookup;
	
	@FindBy (xpath="//input[contains(@id,'location')]")
	public WebElement txtLocation;
	
	public String Locationlist="//li[contains(@class,'ui-menu-item')]";
	
	@FindBy (xpath="//input[contains(@id,'facility')]")
	public WebElement txtFacility;
	
	@FindBy(xpath="//button[@id=\"btnDemandRoleProceed\"]")
	public  WebElement btnDoneDemandRole;
	
	@FindBy(xpath="(//label[@id=\"roleSearchTableLbl1\"])[1]")
	public  WebElement btnradioDemandRole;
	
	public String FacilityList="//ul[contains(@class,'inp_dropdown_list')]/li[contains(text(),'Techno Campus Office (TCO)STPI')]";
	
	@FindBy (xpath="//input[contains(@id,'business')]")
	public WebElement txtLOB;
	
	@FindBy (xpath="//input[@id='billabilityRole0']")
	public WebElement txtBillabilityRole;
	
	@FindBy (xpath="//input[@id='billabilityRole1']")
	public WebElement txtBillabilityRole2;
	
	public String LOBlist="//ul[contains(@id,'businesslist')]/li";
	
	
	@FindBy (xpath="//*[@id='opprTable']/tbody/tr/td")
	public WebElement txtNoData;
	
	@FindBy (xpath="//*[@id='project-details-wrapper']/div[3]/button[2]")
	public WebElement btndiscard;
	
	@FindBy (xpath="//*[@id='TnMDetails']/div[2]/div/div[3]/div[1]/div[2]/a[4]/img")
	public WebElement btndnxtPage;
	
	@FindBy (xpath="//*[@id='secondaryStateTag0']")
	public WebElement txtSecondaryStTag;
	
	@FindBy (xpath="//*[@id='secondaryStateTag0']/option[3]")
	public WebElement txtSecondaryStTagrmpup;
	
	@FindBy (xpath="//*[@id='secondaryStateTag1']")
	public WebElement txtSecondaryStTag2;
	
	@FindBy (xpath="//*[@id='secondaryStateTag1']/option[3]")
	public WebElement txtSecondaryStTagrmpup2;
	
	@FindBy (xpath="//*[@id='practice']")
	public WebElement txtRINOPractice;
	
	
	
	public void PracticeErrormsgValidation ()throws Exception{
		try{
			PageFactory.initElements(driver, this);
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
	}
	

	public void ClickonAddDemandLink ()throws Exception{
		
		try{
			PageFactory.initElements(driver, this);
						
			Thread.sleep(1000);
			if(AddDmdlink.isDisplayed()) 	
			{
				clickOnButton(AddDmdlink,"AddDemandLink");
				System.out.println("Add demand clicked");
			PASSreport("Click Add Demand Button", " Add Demand button is clicked successfully");
			}
			
			else
			{
				System.out.println("add demand not clicked");
				FAILreport("Click Add Demand Button", "Defect : Add Demand button is NOT clicked");
			}	
			
			
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}
	
public void ClickonDonebuttonandValidateErrorMessage ()throws Exception{
		
		try{
			PageFactory.initElements(driver, this);
			clickOnButton(btnDoneAddDmd,"DoneButton");
			//Error message validation is yet to add
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}

public void EnterandSelectPractice()throws Exception{
	
	pageloader(1);
		try{
			
		txtPractice.click();
		String ProID = excelutil.getCellData("SORedesign", 4, "ProjID");
		enterValueIntoTextField(ProjectID, "projectid", ProID);
		
	}catch(Exception e){
		catch_code(e,"Project_id_field","Project Selection have some problem");
		
	}
	}

	public void associatebillability_NO() throws Exception
	{

	selectValueFromDropDown(drpdwnBillability, "No", "object");
	System.out.println("Billability is set as NO");
	
	}

	public void selectBillability() throws Exception
		{	
		pageloader(1);
		try{		
			drpdwnBillability.isEnabled();		
			associatebillability_NO();	
	
	}catch(Exception e){
		catch_code(e,"Project_id_field","Project Selection have some problem");
	
	}
	
	}
	
	public void EnterandSelectOnsiteOffshore()throws Exception{
		
		pageloader(1);
			try{
				
			drpdwnOnsiteOffshore.click();
			String ProID = excelutil.getCellData("SORedesign", 4, "ProjID");
			enterValueIntoTextField(ProjectID, "projectid", ProID);
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
		}
	
	
	public void EnterNoofPositions()throws Exception{
		
		pageloader(1);
			try{
				Thread.sleep(2000);
				
				
				if(txtNoofPositions.isEnabled()) 
					
				{
					txtNoofPositions.sendKeys("1");
				System.out.println("No of Position is entered");
				PASSreport("Enter Number of Position", " No of Position is entered Successfully");
				}
				
				else
				{
					System.out.println("No of Position is NOT entered");
					FAILreport("Enter Number of Position", "Defect : There is an issue with entering No of Position");
				}


			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
		}
	
	public void DealCloseDate()throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			txtDealCloseDate.click();
			String DealCLDT = excelutil.getCellData("SORedesign", 4, "DealCloseDate");
			enterValueIntoTextField(txtDealCloseDate, "DCDT", DealCLDT);
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void BackFill_NO() throws Exception
	{

	selectValueFromDropDown(txtBackfill, "No", "object");
	System.out.println("Backfill is set as NO");
	
	}

	public void selectBackFill() throws Exception
		{	
		pageloader(1);
		try{		
			txtBackfill.isEnabled();		
			BackFill_NO();	
	
	}catch(Exception e){
		catch_code(e,"Project_id_field","Project Selection have some problem");
	
	}
	
	}
	
	public void DurationinMonths() throws Exception
	{	
	pageloader(1);
	try{
		txtDuration.click();
		String ADDuration = excelutil.getCellData("SORedesign", 4, "Duration");
		enterValueIntoTextField(txtDuration, "DRN", ADDuration);
		
	
	}catch(Exception e){
		catch_code(e,"Project_id_field","Project Selection have some problem");

	}
	
	}
	
	public void EnterandSelectRevenuePotential()throws Exception{
		
		pageloader(1);
			try{
			PageFactory.initElements(driver, this);
			txtRevenue.click();
			String REV = excelutil.getCellData("SORedesign", 4, "Revenue");
			enterValueIntoTextField(txtRevenue, "Revenue", REV);
			clickOnButton(txtRevenueValue,REV);
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
	}
	
	public void DemandName() throws Exception
	{	
	pageloader(1);
	try{
		txtDemandName.click();
		String DMDNM = excelutil.getCellData("SORedesign", 4, "DemandName");
		enterValueIntoTextField(txtDemandName, "DMDNAME", DMDNM);
		
	
	}catch(Exception e){
		catch_code(e,"Project_id_field","Project Selection have some problem");

	}
	
	}

	public void ClickonDonebutton ()throws Exception{
		
		try{
			PageFactory.initElements(driver, this);
			
			
			if(btnDoneAddDmd.isDisplayed()) 				
			{
				clickOnButton(btnDoneAddDmd,"DoneButton");
				System.out.println("Done button Clicked");
			PASSreport("Clicking Done Button", ": Done button is Clicked Successfully ");
			}
			
			else
			{
				System.out.println("Done button is NOT Clicked");
				FAILreport("Clicking Done Button", "Defect : There is an issue with clicking Done button ");
			}
			
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}

public void validatetheErrorMessage()throws Exception{
		
		try{
			PageFactory.initElements(driver, this);
			//WebDriverWait wait=new WebDriverWait(driver, 50);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\\\"ResponseErrorModal\\\"]/div/div/div[2]")));
			
			Thread.sleep(2000);
			String ActualErrorMessage = driver.findElement(By.xpath("//div[@id='ResponseErrorModal']/div/div/div[2]")).getText();
			String ExpectedErrorMessage = "Manual Demand cannot be deleted since there are Demand(s) created for this demand.";
			if(ActualErrorMessage.equals(ExpectedErrorMessage)) 
				
			{System.out.println("error Message is displayed");
			PASSreport("Delete So Created Demand", " Error Message is displayed as : "+ ActualErrorMessage);
			}
			
			else
			{
				System.out.println("Error message is not displayed");
				FAILreport("Delete So Created Demand", "Error message is not displayed or Missmatch between actual and expected error message");
			}
			       
			
		}catch(Exception e){
			catch_code(e,"Delete Demand PopUp","Delete Demand PopUp have some problem");
			
		}
	}

	public void validatethePracticeErrorMessage()throws Exception{
	
		try{
		PageFactory.initElements(driver, this);
		
		Thread.sleep(2000);
		String ActualErrorMessage = driver.findElement(By.xpath("//*[@id='WarningErrorModal']/div/div/div[2]")).getText();
		String ExpectedErrorMessage = "Please Select Practice";
		if(ActualErrorMessage.equals(ExpectedErrorMessage)) 
		{
			
		System.out.println("error Message is displayed");
		PASSreport("Practice field Validation", " Error Message is displayed as : "+ ActualErrorMessage);
		
		}
		
		else
		{
			System.out.println("Error message is not displayed");
			FAILreport("Practice field Validation", "Error message is not displayed or Missmatch between actual and expected error message");
		}
		       
		
	}catch(Exception e){
		catch_code(e,"Delete Demand PopUp","Delete Demand PopUp have some problem");
		
	}
}


	public void StartDate()throws Exception{
	pageloader(1);
	try{
		PageFactory.initElements(driver, this);
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();            
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = format1.format(date);          
		                
		System.out.println("the date today is " +date1);
		WebElement el = driver.findElement(By.xpath("//*[@id='StartDate']"));
		el.click();
		WebElement el2 = driver.findElement(By.xpath("//td[contains(@class,'today day')]"));
		el2.click();
		Thread.sleep(1000);
		if(el.isDisplayed()) 	
		{
			System.out.println("Start Date is Selected");
		PASSreport("Start Date Selection", " Start Date is Selected Successfully");
		}
		
		else
		{
			System.out.println("Start Date is NOT Selected");
			FAILreport("Start Date Selection", "Defect : There is an issue with Start Date Selection");
		}	
		
		
							
	}
	catch(Exception e)
	{
		catch_code(e,"Project_id_field","Project Selection have some problem");	
	}
	
}
	
	public void ChooseResourceIdentifiedasYES() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ResourceIdenYes);
			ResourceIdenYes.isDisplayed();
			ResourceIdenYes.click();
			
			if(btnProtoCreate.isEnabled()) {
				System.out.println("Resource Identified Yes Selected");
				PASSreport("Resource Identified Selected Successfully "," Selected Resource Identified is : Yes" );
			}
						
			else
	        {
	             System.out.println("Resource Identified Yes NOTSelected");
	             FAILreport("Resource Identified","Defect : Resource Identified NOT Selected ");
	         }
			
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	public void SelectManualDemand() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			//clickOnButton(btnradioManualDemand,"DemandRadioBTN");
			Thread.sleep(2000);
			WebElement goButton = driver.findElement(By.xpath("(//input[@name='customRadio' and @type='radio'])[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButton);
			Thread.sleep(2000);
			PracticefromDemnd = driver.findElement(By.xpath("//*[@id='opprTable']/tbody/tr[2]/td[3]")).getText();
			Thread.sleep(1000);
			//BillabilityfrmDmd = driver.findElement(By.xpath("//table[@id='opprTable']/tbody/tr[2]/td[5]")).getText();
			System.out.println(PracticefromDemnd);
			if(goButton.isSelected()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RequirementType);
				System.out.println("Demand selected successfully");
				PASSreport("Demand Selection", "Demand selected successfully" );
				
				
				
			}
			else {
				System.out.println("Manual demand not selected");
				FAILreport("Demand Selection", "Defect : Manual demand not selected");
			}
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	public void SelectManualDemandwithBillabilityNO() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
			Thread.sleep(2000);
			WebElement goButton = driver.findElement(By.xpath("(//input[@name='customRadio' and @type='radio'])[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButton);
			Thread.sleep(2000);
			BillabilityfromDemand = driver.findElement(By.xpath("(//table[@id='opprTable']/tbody/tr/td[5])[2]")).getText();
			System.out.println(BillabilityfromDemand);
			if(RequirementType.isEnabled()) {
				System.out.println("Demand selected");
				PASSreport("Demand Selection", "Manual Demand Selected Successfully" );
			}
					
			else
            {
                System.out.println("Demand not selected");
                FAILreport("Demand Selection", "Defect : Manual Demand is NOT Selected");
            }					
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void ClickonYESbuttoninDeleteConfirmPopup() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(3000);
			if (btnDeleteYES.isDisplayed()) {
				clickOnButton(btnDeleteYES,"DeleteYESButton");
				System.out.println("Delete YES button Clicked");
				PASSreport("Delete YES Button ", "YES button in Delete confirmation popup is clicked ");	
			}
			else
			{
				System.out.println("Delete YES button is not clicked");
				FAILreport("Delete YES Button", "Defect : YES button in Delete confirmation popup is NOT clicked");
			}
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	public void ComparepracticewithpracicedisplayedinTndMDemandPage() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
			String PracticefromField = driver.findElement(By.xpath("//input[@id='practice']")).getAttribute("value");
			System.out.println(" Practice from demand : "+ PracticefromDemnd +"Pratice from field :"+ PracticefromField);
			if(PracticefromDemnd.equals(PracticefromField))
			{
				System.out.println("Actual data and expected data are same");
				PASSreport("Default Practice value validation", "Practice Value displayed in Demand and Practice value displayed in create demand indent page are same ");
			}
			else
			{
				System.out.println("Actual data and expected data are not same");
				FAILreport("Default Practice value validation", "Defect : Practice Value displayed in Demand and Practice value displayed in create demand indent page are NOT same");
			}
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	public void VerifyPracticeisEnabled() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(1000);
			if(txtPractice.isEnabled()) 
			{
			System.out.println("Practice field is enabled");
			FAILreport("Practice field enable validation", "Practice field is enabled and user is able to select Practice");
			}
			else
			{
				System.out.println("Practise field is NOT enabled");
				PASSreport("Practice field enable validation", "Practice field is not enabled user is not able to select Practice");
			}	
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void ChooseResourceIdentifiedasNO() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ResourceIdenYes);
			ResourceIdenNO.isDisplayed();
			ResourceIdenNO.click();
			
			if(btnProtoCreate.isEnabled()) {
				System.out.println("Resource Identified Yes Selected");
				PASSreport("Resource Identified Selected Successfully "," Selected Resource Identified is : Yes" );
			}
						
			else
	        {
	             System.out.println("Resource Identified Yes NOTSelected");
	             FAILreport("Resource Identified","Defect : Resource Identified NOT Selected ");
	         }
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	public void EnterIDinAssociateAccordionandclickonTick(String AssID) throws Exception{
		pageloader(1);
		
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(5000);
			String AssoID = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , AssID);
            if(AssoID!=null && AssoID!="")
			
			{
            	String AssociatID = excelutil.getCellData(testcase_sheetName, testcase_rowNumber , AssID);
            	
    			/**List_Selection(Field_data, Field_location, list_xpath, field_name);*/
            	List_Selection(AssociatID, AssociateID, AssociateIDList, "Project_ID");
            	AssociateIDHeader.click();
            	
            	if(buttonTICK.isEnabled())
                {
            		
                System.out.println("Associate ID entered successfully");
                
                PASSreport("AssociateID", AssoID+" entered Successfully "+AssID+" id is :"+AssoID );
            	}
            else
            {
                System.out.println("Expected associate ID not entered");
                FAILreport("AssociateID", "Defect : Associate ID not entered");
            }
            	
            	
            	
            	clickOnButton(buttonTICK,"AddButton");
            	Thread.sleep(2000);
            	if(txtDemandRolelookup.isDisplayed())
                {
                    System.out.println("ADD button Clicked successfully");
                
                    PASSreport("ADD Button","Add button Clicked successfully");
                }
            	else
            	{
                System.out.println("Add button NOT Clicked");
                FAILreport("ADD Button", "Defect : ADD button not clicked");
            	}
            	
            	
            
	
			}
            
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	
			}
	
	public void EnterAdditionalIDinASSACCRDNclickonTick(String ADDAssID) throws Exception{
		pageloader(1);
		
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(4000);
			String AssoID = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , ADDAssID);
            if(AssoID!=null && AssoID!="")
			
			{
            	String AssociatID = excelutil.getCellData(testcase_sheetName, testcase_rowNumber , ADDAssID);
            	
    			/**List_Selection(Field_data, Field_location, list_xpath, field_name);*/
            	List_Selection(AssociatID, AssociateID, AssociateIDList, "Project_ID");
            	AssociateIDHeader.click();
            	Thread.sleep(3000);
            	clickOnButton(buttonTICK,"TickIDButton");
            	if(buttonTICK.isEnabled())
                {
                    System.out.println("Associate ID entered successfully");
                }
                PASSreport("AssociateID", AssoID+" entered Successfully "+ADDAssID+" id is :"+AssoID );
            }
            else
            {
                System.out.println("Expected associate ID not entered");
                FAILreport("AssociateID", "Defect : Associate ID not entered");
            }
            
            }
            	
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	
	}
	
	
	public void VerifyAssociateBillabilityDefaultedYes() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Select select = new Select(driver.findElement(By.xpath("//*[@id='billabilityType-0']")));
			WebElement option = select.getFirstSelectedOption();
			String BillabilityAssAcrdn = option.getText();
			
			
			//String BillabilityAssAcrdn = driver.findElement(By.xpath("//*[@id='billabilityType-0']")).getAttribute("");
			
			System.out.println("BillabiltFromDemand :" +BillabilityfrmDmd+"Assocaite Billability :"+BillabilityAssAcrdn);
			if(BillabilityfrmDmd.equals(BillabilityAssAcrdn)) {
				System.out.println("Billability from demand and billability from associate accordion are same");
				PASSreport("Billability Field","Billability from demand and billability from associate accordion are same");	
			}
			else
			{
				System.out.println("Billability from demand and billability from associate accordion are NOT same");
				FAILreport("Billability Field", "Defect : Billability from demand and billability from associate accordion are same");
			}
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	public void VerifyAssociateBillabilityisDisabled() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			if(BillYesAssAcordn.isEnabled()) {
				System.out.println("Billability field is enabled");
				FAILreport("Associate Billability"," Associate billability field is enabled");
			}else
			{
				System.out.println("Defect : Billability field is NOT Enabled");
				PASSreport("Associate Billability", "Associate billability field is diabled ");
			}
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	
	public void ClickDiscardandSelectYesinPopup() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			clickOnButton(btnDiscard,"DiscardButton");		
			clickOnButton(btnDiscardYES,"DiscardButton");
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	public void CreateDemandwithBillabilityNO() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	public void VerifyAssociateBillabilityDefaultedNO() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			String BillabilityAssAcrdn = driver.findElement(By.xpath("//select[@id='billabilityType-0']/option[2]")).getText();
			if(BillabilityfromDemand.equals(BillabilityAssAcrdn)) {
				System.out.println(BillabilityfromDemand);
				System.out.println(BillabilityAssAcrdn);
				System.out.println("Billability from demand and billability from associate accordion are same");
			}
			else
			{
				System.out.println("Billability from demand and billability from associate accordion are NOT same");
			}
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	public void SelectWinZoneDemandandGetCreatedQuantity() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");		}
	}
	
	
	public void ClickOKinSuccessMessagePopup() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void SelectWinZoneDemandandValidateCreatedQuantity() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void SelectManualDemandandGetCreatedQuantity() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void SelectManualDemandandValidateCreatedQuantity() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void ClickonDeleteButtton() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DeleteDmndPopup);
			if(DeleteDmndBtn.isDisplayed())
			{
				clickOnButton(DeleteDmndBtn, "button");
				System.out.println("Delete button clicked");
				PASSreport("Delete button", "Delete button is displayed and clicked successfully" );
			}
			else
			{
				
				FAILreport("Delete button", "Defect : Delete button is not displayed");
			}
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Delete button","Delete demand button have some problem");	
		}
	}
	
	
	public void DeleteConfirmationPopup() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DeleteDmndPopup);
			if
			(DeleteDmndPopup.isDisplayed()) {
				System.out.println("Delete Demand Popup is Displayed");
				PASSreport("Delete Demand Popup", " Delete Demand popup Displaying Successfully");
			}
			else
			{
				System.out.println("Defect : Delete Demand Popup is NOT Displayed");
				FAILreport("Delete Demand Popup", " Defect : Delete Demand Popup is NOT Displayed");
			}
			
			if(btnDeleteYES.isDisplayed()) {
				System.out.println("Delete YES button is displayed");
				PASSreport("Delete Demand Popup", " Delete YES button is displaying Successfully");
			}
			else
			{
				System.out.println("Defect : Delete YES button is NOT displayed");
				FAILreport("Delete Demand Popup", " Defect : Delete YES button is NOT displayed");
			}
			
			if
			(btnDeleteNO.isDisplayed()) {
				System.out.println("Delete NO button is displayed");
				PASSreport("Delete Demand Popup", " Delete NO button is displaying Successfully");
			}
			else
			{
				System.out.println("Defect : Delete NO button is NOT displayed");
				FAILreport("Delete Demand Popup", " Defect : Delete NO button is NOT displayed");
			}
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void ClickonNObuttoninDeleteConfirmPopup() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
			
			if (btnDeleteNO.isDisplayed()) {
				clickOnButton(btnDeleteNO,"NO Button");
				System.out.println("Delete button Clicked");
				PASSreport("Delete NO Button ", "NO button in Delete confirmation popup is clicked successfully");	
			}
			else
			{
				System.out.println("Delete button is not clicked");
				FAILreport("Delete NO Button", "Defect : NO button in Delete confirmation popup is NOT clicked successfully");
			}
								
		}
		catch(Exception e)
		{
			catch_code(e,"Delete NO button ","Delete NO button having problem");	
		}
	}
	
	public void VerifySelectedDemandNotDeleted() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			if (btnradioManualDemand.isDisplayed()) {
				System.out.println("Selected demand is not deleted");
				PASSreport("Delete Demand ", "Selected demand is Displyed");	
			}
			else
			{
				System.out.println("Defect : Selected demand is not Displayed");
				FAILreport("Delete Demand", "Defect : Selected demand is Not Displayed");
			}		
								
		}
		catch(Exception e)
		{
			catch_code(e,"Delete Demand","Selected demand is having problem");	
		}
	}
	
	
	public void VerifytheDeletedRecordisPresent() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			if(btnradioManualDemand.isDisplayed()) {
				System.out.println("Deleted demand is not displayed");
			}
			else
			{
				System.out.println("Defect : Deleted demand is still present");
			}
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void VerifytheDeletedRecordisNOTPresent() throws Exception{
		pageloader(1);
		try{
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btndiscard);
			PageFactory.initElements(driver, this);
			Thread.sleep(5000);
			if(txtNoData.isDisplayed()) 
			{
				System.out.println("Selected demand is deleted Successfully");
				PASSreport("Delete Demand YES button", "Selected demand is deleted Successfully");
			}
			else
			{
				System.out.println("Defect : Selected demand is NOT deleted");
				FAILreport("Delete Demand YES button", "Defect : Selected demand is NOT deleted");
			}
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void DeleteConfirmationMessageValidation() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			btnDeleteYES.click();
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void VerifytickMarkisNOTpresented() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(4000);
			if(btnDimandindentDetailsTick.isDisplayed()) {
				System.out.println("Demand indent details tick button is displayed");
				FAILreport("Tick mark in Demand indent details", "Tick mark displayed in Demand indent details section");
			}
			else
			{
				System.out.println("Defect : Demand indent details tick button is NOT displayed");
				PASSreport("Tick mark in Demand indent details", "Tick mark is NOT displayed in Demand indent details section");
			}
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void VerifytickMarkisDisplayed() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(4000);
			if(btnDimandindentDetailsTick.isDisplayed()) 
			{
				System.out.println("Demand indent details tick button is displayed");
				PASSreport("Tick Mark in Demand indent details", "Tick mark is displayed successfully" );
			}
			else
			{
				System.out.println("Defect : Demand indent details tick button is NOT displayed");
				FAILreport("Tick Mark in Demand indent details", "Tick mark is NOT displayed " );
			}
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void ClickonCopythisDetailsButton() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(4000);
			btnAssAccrdnExpand.click();
			Thread.sleep(4000);
			clickOnButton(btnCopyAll,"Copy All Check Box");
			Thread.sleep(4000);
			if(btnYEScopyall.isDisplayed()) {
			clickOnButton(btnYEScopyall,"Copy All Check Box YES button");
			System.out.println("Copy all button clicked successfully");
			PASSreport("Copy All Check Box", "Copy All Check Box checked successfully");
			}
			else
			{
			FAILreport("Copy All Check Box", "Copy All Check Box NOT checked");	
				
			}
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void NavigatetoCreateDemandIndentScreen() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void ClickonDemandManagementLink() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void VerifySystemNavigatestoDashboard() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void ClickonDashBoardLink() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void SelectWinzoneBasedOpportunity() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	
	public void VerifytheTickMarkisNOTPresentinDemandIndentdetailstab() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void EnterGrade() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void clickonOtherDetailsTab() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void EnterallMandatoryDetailsinOtherDetailsPage() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void select_requirement_type(String type) throws Exception
	{
		try
		{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RequirementType);
			
			Select select = new Select(RequirementType);
			WebElement option = select.getFirstSelectedOption();
			String selectedReqTyp = option.getText();
			
			System.out.println("Req type "+selectedReqTyp);
			if(RequirementType.isEnabled()==false && selectedReqTyp.equalsIgnoreCase("Ramp-Up")) {
				
				System.out.println("Requirement type is selected as rampup");
				PASSreport("Requirement Type", type+" Selected Successfully"+type+" id is :"+type );
			}
					
			else
            {
                System.out.println("requirement type is enabled");
                FAILreport("Requirement Type", type+" Defect : Requirement is enabled ");
            }
			
		}
		catch(Exception e)
		{
			
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}
	
	public void ClickonProceedtoCreateButton ()throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(2500);
			
			if(btnProtoCreate.isEnabled()) {
				clickOnButton(btnProtoCreate,"Proceed to Create Button");
				System.out.println("Proceed to create button clicked");
				PASSreport("Proceed to Create Button"," Button Clicked successfully ");
			}
					
			else
            {
                System.out.println("Proceed to create button not clicked");
                FAILreport("Proceed to Create Button", " Defect : Proceed to Create button Not Clicked ");
            }
			
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void ChooseLocation(String Location)throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			String Location_Name = excelutil.getCellData(testcase_sheetName, testcase_rowNumber , Location);
			/**List_Selection(Field_data, Field_location, list_xpath, field_name);*/
			List_Selection(Location_Name, txtLocation, Locationlist, "Location"); 
			if(txtLocation.isDisplayed()) {
				PASSreport("Location", Location+" is selected Successfully "+Location+" Location is :"+Location_Name );
			}
					
			else
            {
                System.out.println("Expected Location is not selected");
                FAILreport("Location", "Defect : Location drop down value is not selected");
            }
			
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void ChooseFacility(String Facility)throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			clickOnButton(txtFacility,"Facility_Name");
			Thread.sleep(2000);
			WebElement Facility_Name = driver.findElement(By.xpath("//ul[contains(@class,'inp_dropdown_list')]/li[contains(text(),'Techno Campus Office (TCO)STPI')]"));
			Facility_Name.click();
			if(txtFacility.isDisplayed()) {
				PASSreport("Facility", Facility+" is selected Successfully "+Facility+" Location is :"+Facility_Name );
			}
					
			else
            {
                System.out.println("Expected Facility is not selected");
                FAILreport("Facility", "Defect : Facility Dropdown value is not selected");
            }
			
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void ChooseLionOfBusiness(String lineofbusiness)throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			
			clickOnButton(txtLOB,"Facility_Name");
			Thread.sleep(2000);
			WebElement LOB = driver.findElement(By.xpath("//ul[contains(@class,'inp_dropdown_list')]/li[contains(text(),'BPO - India')]"));
			LOB.click();
			
			if(txtLOB.isDisplayed()) {
				PASSreport("LOB", lineofbusiness+" is selected Successfully "+lineofbusiness+" Location is :"+LOB );
			}
					
			else
            {
                System.out.println("Expected LOB is not selected");
                FAILreport("LOB", "Defect : Lion of Business Dropdown value is not selected");
            }
			
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
		
	}

	
	public void SelectManualDeleteDemand() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			WebElement goButton = driver.findElement(By.xpath("(//input[@name='customRadio' and @type='radio'])[4]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButton);
			if(goButton.isSelected()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RequirementType);
				System.out.println("Demand selected successfully");
				PASSreport("Demand Selection", "Demand selected successfully" );
				
				
				
			}
			else {
				System.out.println("Manual demand not selected");
				FAILreport("Demand Selection", "Defect : Manual demand not selected");
			}
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void Enter_billability_role() throws Exception
	{
		try
		{
			Thread.sleep(4000);
			
			
			if(txtBillabilityRole.isDisplayed())
			{
				txtBillabilityRole.sendKeys("Test");
				System.out.println("Data entered in billability role");
				PASSreport("Billability Role", "Data entered in Billability Role");
			}
			else
			{
				FAILreport("Billability Role", "Data not entered in Billability Role");
			}
			
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void Enter_Demand_Role() throws Exception
	{
		try
		{
			Thread.sleep(4000);
			if(txtDemandRolelookup.isDisplayed()) {
				clickOnButton(txtDemandRolelookup,"DemandRoleRadioBTN");
				System.out.println("txtDemandRolelookup button clicked");
				PASSreport("Demand Role", "Demand Role lookup button is clicked successfully");
			}
			else
			{
				FAILreport("Demand Role", "Demand Role lookup button is NOT clicked");
				
			}
						
			
			Thread.sleep(3000);
			WebElement goButton = driver.findElement(By.xpath("(//input[@name='roleSearchTableRadio' and @type='radio'])[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButton);
			System.out.println("Demand role selected");
			if(goButton.isSelected())
			{
				PASSreport("Demand Role", "Demand Role is selected successfully");
			}
			else
			{
				FAILreport("Demand Role", "Demand Role is NOT selected");
			}
			
			clickOnButton(btnDoneDemandRole,"DoneButtonDemandRole");
			
			
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}
	
	public void Enter_billability_role2() throws Exception
	{
		try
		{
			Thread.sleep(3000);
			txtBillabilityRole2.isDisplayed();
			txtBillabilityRole2.sendKeys("Test2");
			System.out.println("Data entered in billability role 2");
			
			if(txtBillabilityRole2.isDisplayed())
			{
				PASSreport("Billability Role 2", "Billability Role 2 is selected successfully");
			}
			else
			{
				FAILreport("Billability Role 2", "Billability Role 2 is NOT selected");
			}
			
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void SelectManualDemandPractice() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			//clickOnButton(btnradioManualDemand,"DemandRadioBTN");
			Thread.sleep(2000);
			WebElement goButton = driver.findElement(By.xpath("(//input[@name='customRadio' and @type='radio'])[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButton);
			Thread.sleep(2000);
			PracticefromDemnd = driver.findElement(By.xpath("//*[@id='opprTable']/tbody/tr[2]/td[3]")).getText();
			//Thread.sleep(1000);
			//BillabilityfrmDmd = driver.findElement(By.xpath("//table[@id='opprTable']/tbody/tr[2]/td[5]")).getText();
			System.out.println(PracticefromDemnd);
			if(goButton.isSelected()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RequirementType);
				System.out.println("Demand selected successfully");
				PASSreport("Demand Selection", "Demand selected successfully" );
				
				
				
			}
			else {
				System.out.println("Manual demand not selected");
				FAILreport("Demand Selection", "Defect : Manual demand not selected");
			}
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void SelectManualDemandTC145() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(3000);
			//clickOnButton(btnradioManualDemand,"DemandRadioBTN");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnDiscard);
			btndnxtPage.click();
			Thread.sleep(2000);
			btndnxtPage.click();
			Thread.sleep(2000);
			WebElement goButton = driver.findElement(By.xpath("(//input[@name='customRadio' and @type='radio'])[25]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButton);
			Thread.sleep(3000);
			//PracticefromDemnd = driver.findElement(By.xpath("//*[@id='opprTable']/tbody/tr[2]/td[3]")).getText();
			//Thread.sleep(1000);
			//BillabilityfrmDmd = driver.findElement(By.xpath("//table[@id='opprTable']/tbody/tr[2]/td[5]")).getText();
			//System.out.println(PracticefromDemnd);
			if(goButton.isSelected()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RequirementType);
				System.out.println("Demand selected successfully");
				PASSreport("Demand Selection", "Demand selected successfully" );
				
				
				
			}
			else {
				System.out.println("Manual demand not selected");
				FAILreport("Demand Selection", "Defect : Manual demand not selected");
			}
			
								
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void SecondaryStateTag() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(1000);
			txtSecondaryStTag.isDisplayed();
			txtSecondaryStTag.click();
			Thread.sleep(1000);
			txtSecondaryStTagrmpup.click();
									
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void SecondaryStateTag2() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(1000);
			txtSecondaryStTag2.isDisplayed();
			txtSecondaryStTag2.click();
			Thread.sleep(1000);
			txtSecondaryStTagrmpup2.click();
									
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void RINOComparePracticeindemandwithDisplayedPractice() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			String RINOPracticefromField = driver.findElement(By.xpath("//*[@id='practice']")).getAttribute("value");
			System.out.println(" Practice from winzone demand : "+ PracticefromwinzoneDemnd +"Pratice from field :"+ RINOPracticefromField);
			if(PracticefromwinzoneDemnd.equals(RINOPracticefromField))
			{
				System.out.println("Actual data and expected data are same");
				PASSreport("Default Practice value validation", "Practice Value displayed in winzone Demand and Practice value displayed in create demand indent page are same ");
			}
			else
			{
				System.out.println("Actual data and expected data are not same");
				FAILreport("Default Practice value validation", "Defect : Practice Value displayed in winzone Demand and Practice value displayed in create demand indent page are NOT same");
			}
			
			
			
									
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}

	
	public void RINOCompareServiceLineindemandwithDisplayedServiceLine() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			String ServiceLinefromField = driver.findElement(By.xpath("//*[@id='serviceLine']")).getAttribute("value");
			System.out.println(" Service from winzone demand : "+ ServiceLinefromwinzoneDemnd +"Pratice from field :"+ ServiceLinefromField);
			if(ServiceLinefromwinzoneDemnd.equals(ServiceLinefromField))
			{
				System.out.println("Actual data and expected data are same");
				PASSreport("Default Service line value validation", "Service line Value displayed in Demand and Service line value displayed in create demand indent page are same ");
			}
			else
			{
				System.out.println("Actual data and expected data are not same");
				FAILreport("Default Service line value validation", "Defect : Service line Value displayed in Demand and Service line value displayed in create demand indent page are NOT same");
			}
			if(txtRINOPractice.isEnabled()) {
				
				FAILreport("Practice field is enabled", "Defect : Practice Field is enabled");
			}
			else
			{
				PASSreport("Practice field is enabled", "Practice Field is NOT enabled");
			}
			
									
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void RINOCompareBillabilityindemandwithDisplayedBillability() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(1000);
			String BillabilityfromField = driver.findElement(By.xpath("//*[@id='radBillable_Yes']")).getAttribute("value");
			System.out.println(" Billbility from demand : "+ BillabilityfromwinzoneDemnd +"Pratice from field :"+ BillabilityfromField);
			if(BillabilityfromwinzoneDemnd.equals(BillabilityfromField))
			{
				System.out.println("Actual data and expected data are same");
				PASSreport("Default Billability Type validation", "Billability type displayed in Demand and Billability type displayed in create demand indent page are same ");
			}
			else
			{
				System.out.println("Actual data and expected data are not same");
				FAILreport("Default Billability Type validation", "Defect : Billability type displayed in Demand and Billability type displayed in create demand indent page are NOT same");
			}
									
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void RINOSelectWinzoneBasedDemand() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnDiscard);
			Thread.sleep(3000);
			WebElement goButton = driver.findElement(By.xpath("(//input[@name='customRadio' and @type='radio'])[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButton);
			Thread.sleep(3000);
			PracticefromwinzoneDemnd = driver.findElement(By.xpath("//*[@id='opprTable']/tbody/tr[1]/td[3]")).getText();
			ServiceLinefromwinzoneDemnd = driver.findElement(By.xpath("//*[@id='opprTable']/tbody/tr[1]/td[4]")).getText();
			BillabilityfromwinzoneDemnd = driver.findElement(By.xpath("//*[@id='opprTable']/tbody/tr[1]/td[5]")).getText();
			
			if(goButton.isSelected()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RequirementType);
				System.out.println("Demand selected successfully");
				PASSreport("Demand Selection", "Demand selected successfully" );				
			}
			else {
				System.out.println("Manual demand not selected");
				FAILreport("Demand Selection", "Defect : Manual demand not selected");
			}						
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void SelectRequirementType(String Requirement_type)throws Exception{
	       
        try{
           
            PageFactory.initElements(driver, this);
            Thread.sleep(3000);
                String ReqType = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , Requirement_type);
                if(ReqType!=null && ReqType!="")
                {
                    selectValueFromDropDown(RequirementType, ReqType, "RequirementType");
                    
                    String actualTitle = driver.getTitle();
                    if(actualTitle.contains("Demand Management - Demand Management"))
                    {
                        System.out.println("Home page displayed");
                    }
                    PASSreport("Login", Requirement_type+" in logged in Successfully "+Requirement_type+" id is :"+ReqType );
                }
                else
                {
                    System.out.println("Expected manager id is not pressent in excel");
                    FAILreport("Login", "Manager ID not found in excel");
                }
               
               
            }
            catch (Exception e)
            {
                /***Exception e,  String field_name****/
                catch_code(e,"Login","Login have some problem");
            }
        }
	
	
	public void RINOVerifyBillabilityisselectedasYES() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(1000);
			String BillabilityfromField = driver.findElement(By.xpath("//*[@id='radBillable_Yes']")).getAttribute("value");
			System.out.println(" Billbility from demand : "+ BillabilityfromwinzoneDemnd +"Pratice from field :"+ BillabilityfromField);
			if(BillabilityfromwinzoneDemnd.equals(BillabilityfromField))
			{
				System.out.println("Billability is selected as YES");
				PASSreport("Billability Type validation", "Billability is selected as YES");
			}
			else
			{
				System.out.println("Billability is not selected as YES");
				FAILreport("Billability Type validation", "Defect : Billability type is not selected as YES");
			}
									
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	
	public void RINOVerifyPrimaryStateTagisdisplayedwithonevalue() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(1000);
			String PrimaryStateTag = driver.findElement(By.xpath("//*[@id='dropdownPrimaryStateTag']")).getAttribute("value");
			if(PrimaryStateTag.equalsIgnoreCase("Billed"))
			{
				System.out.println("Primary state tag value displayed as :"+ PrimaryStateTag);
				PASSreport("Primary State tag", "Primary Stage tag value is selected as :"+ PrimaryStateTag);
			}
			else
			{
				System.out.println("Primary state tag value displayed as :"+ PrimaryStateTag);
				FAILreport("Primary State tag", "Defect : Primary Stage tag value is selected as :"+ PrimaryStateTag);
			}
									
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void RINOVerifyBillabilityisselectedasNO() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(1000);
			String BillabilityfromField = driver.findElement(By.xpath("")).getAttribute("value");
			System.out.println(" Billbility from demand : "+ BillabilityfromwinzoneDemnd +"Pratice from field :"+ BillabilityfromField);
			if(BillabilityfromwinzoneDemnd.equals(BillabilityfromField))
			{
				System.out.println("Billability is selected as NO");
				PASSreport("Billability Type validation", "Billability is selected as NO");
			}
			else
			{
				System.out.println("Billability is not selected as NO");
				FAILreport("Billability Type validation", "Defect : Billability type is not selected as NO");
			}
									
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void VerifytheDefaultedValuedisplayedinAssignmentPercentage() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(1000);
			
			String AssigmentPercent = driver.findElement(By.xpath("//*[@id='assignmentPercentageForNotIdentified']")).getAttribute("value");
			System.out.println(" Assignment percentage : "+ AssigmentPercent +"assignment percentage field :"+ AssigmentPercent);
			if(AssigmentPercent.equals("100"))
			{
				System.out.println("Assignment percentae field value is 100");
				PASSreport("Assignment percentage field", "Assignment percentage field is displayed as 100");
			}
			else
			{
				System.out.println("Assignment percentae field value is not 100");
				FAILreport("Assignment percentage field", "Defect : Assignment percentage field is NOT displayed as 100");
			}
			
										
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	
	
	
	
			

	
	
	

	
}	