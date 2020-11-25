package com.test.qa.pageFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import com.test.qa.libraries.FunctionalLibrary;
import com.test.qa.utilities.ExcelUtil;

import gherkin.lexer.Cs;

public class Sprint1_PageFactory extends FunctionalLibrary {
	

	ExcelUtil excelutil = new ExcelUtil();
	
	static Logger log = Logger.getLogger(Sprint1_PageFactory.class.getName());

	@FindBy(xpath="//div[contains(@class,'logo')]")
	public  WebElement Demand_logo;
	
	@FindBy(xpath="//*[@id='create_demand']")
	public  WebElement demon_selection;
	
	@FindBy(xpath="//*[@id='project_id_label']")
	public  WebElement project_id_field;
	
	public String project_list="//div[contains(@class,'mCSB_container')]/li[not(contains(@style,'none'))]";
	
	@FindBy(xpath="//div[contains(@class,'mCS_no_scrollbar_y')]")
	public  WebElement Project_list_check;
	
	@FindBy(xpath="//ul[contains(@style, 'display: block') and contains(@class,'mCustomScrollbar')]")
	public  WebElement Project_list_displayed_check;
	
	
	@FindBy(xpath="//div[contains(@class,'mCSB_container')]/li[not(contains(@style,'none'))]")
	public  WebElement Project_list_typo_check;
	
	@FindBy (xpath="//*[@id='create_demand']")
	public WebElement CrtDmdIdent;
	
	@FindBy (xpath="//input[contains(@id,'project_id_label')]")
	public WebElement ProjectID;
	
	@FindBy (xpath="//li[contains(@class,'BFD (4)') and contains (text(),'100000006751 - Health Net Medisys')]")
	public WebElement ProIdBFD;
	
	@FindBy (xpath="(//div[contains(@class,'custom-control')])[7]")
	public WebElement OppoRadioBtn;
	
	@FindBy (xpath="//select[contains(@id,'requirementType')]")
	public WebElement RequirementType;
	
	public String Requirentlist="//ul[contains(@class,'inp_dropdown_list prj-label')]/li";
	
	@FindBy (xpath="//label[contains (@for,'resourceIdentifiedYs')]")
	public WebElement ResourceIdenYes;
	
	@FindBy (xpath="//label[contains (@for,'resourceIdentifiedNo')]")
	public WebElement ResourceIdenNO;
	
	@FindBy (xpath="//ul[contains(@class,'inp_dropdown_list prj-label')]/li[contains (text(),'Backfill')]")
	public WebElement Backfill;
	
	@FindBy (xpath="(//div[contains (@class,'custom-control custom-radio custom-control-inline')])[1]")
	public WebElement RadioResIdentified;
	
	@FindBy (xpath="//button[contains (@class,'btn btn-primary  proceed_btn')]")
	public WebElement btnProtoCreate;
	
	@FindBy (xpath="(//input[contains(@name,'practice')])[1]")
	public WebElement txtPractice;
	
	public String Practicelist="//div[contains(@id,'mCSB_1_container')]/li[not(contains(@style,'none'))]";
	
	@FindBy (xpath="(//input[contains (@name,'demand') and contains (@class,'form-control')])[1]")
	public WebElement txtDemandName;
	
	@FindBy (xpath="//input[contains(@name,'loaction')]")
	public WebElement txtLocation;
	
	public String Locationlist="//ul[contains(@class,'location-list')]/li";
	
	@FindBy (xpath="//input[contains(@id,'facility')]")
	public WebElement txtFacility;
	
	public String FacilityList="//ul[contains(@class,'inp_dropdown_list')]/li";
	
	@FindBy (xpath="//input[contains(@id,'business')]")
	public WebElement txtLOB;
	
	public String LOBlist="//ul[contains(@class,'inp_dropdown_list')]/li";
	
	@FindBy (xpath="//input[contains (@placeholder,'Enter Associate ID/Name')]")
	public WebElement txtEnterAssID;
	
	@FindBy (xpath="//button[contains(@class,'btn btn-outline-secondary assoc_inp_btn float-right')]")
	public WebElement btnTick;
	
	@FindBy (xpath="(//input[contains (@name,'start_date')])[2]")
	public WebElement txtAssignStartDate;
	
	@FindBy(xpath="//td[contains(@class,'active day')]")
	public WebElement AssignStDtcalender;

	@FindBy (xpath="(//input[contains (@name,'end_date')])[3]")
	public WebElement txtAssignEndDate;
	
	@FindBy(xpath="//td[contains(@class,'active day')]")
	public WebElement AssignNdDtcalender;
	
	@FindBy (xpath="(//input[contains (@name,'assignment_percent')])[3]")
	public WebElement txtAssignmentPercent;
	
	@FindBy (xpath="(//input[contains(@placeholder,'Select')])[8]")
	public WebElement txtAssoBillabilty;
	
	public String BillabilityList="(//ul[contains(@class,'inp_dropdown_list billability_list')]/li)[3]";
	
	@FindBy (xpath="(//input[contains(@name,'start_date')])[2]")
	public WebElement txtAssStartDate;
	
	@FindBy (xpath="(//input[contains(@name,'end_date')])[3]")
	public WebElement txtAssEndDate;
	
	@FindBy (xpath="(//input[contains (@name,'end_date')])[4]") 
	public WebElement txtBillSrtDate;
	
	@FindBy (xpath="//td[contains(@class,'active day')]")
	public WebElement txtBillingStDateCalender;
	
	@FindBy (xpath="(//input[contains(@name,'assignment_percent')])[4]")
	public WebElement txtBillabilityRole;
	
	@FindBy (xpath="(//div[contains(@class,'input_grp_header')])[3]")
	public WebElement txtHeader;
	
	@FindBy (xpath="(//input[contains(@class,'form-control inp_dropdown2 primary_state')])[2]")
	public WebElement txtPrimaryStateTag;
	
	public String PrimarySteTaglist="(//ul[contains(@class,'inp_dropdown_list')]/li)[10]";
	
	@FindBy (xpath="(//input[contains(@class,'form-control inp_dropdown2 secondary_state')])[2]")
	public WebElement txtSecondaryStateTag;
	
	public String SecondrySteTaglist="//ul[contains(@class,'inp_dropdown_list')]/li";
	
	@FindBy (xpath="(//input[contains(@name,'demand_role')])[3]")
	public WebElement txtDemandRole;
	
	@FindBy (xpath="//button[contains(@class,'btn create_btn')]")
	public WebElement btnCreateDemandIndent;
	
	
	@FindBy (xpath="//span[contains(@class,'popup_close')]")
	public WebElement successmesgpopup;

	@FindBy(xpath="//input[@id='userID']")
	public  WebElement txtManagerID;
	
	@FindBy(xpath="//input[@value='Set Id']")
	public  WebElement btnSetID;
	
	@FindBy(xpath="//div/h3")
	public  WebElement txtAccessDenied;
	
	@FindBy(xpath="//button[@type='button']")
	public  WebElement btnCrtDmtIdnt;
	
	@FindBy(xpath="//input[@id='opportunity_dropdown']")
	public  WebElement opportunity_id_field;
	
	public String opportunity_list="//input[@id='opportunity_dropdown']/following-sibling::ul/li";
	
	@FindBy(xpath="//*[@id='opprTable']")
	public  WebElement opportunity_table;
	
	
	/**Methods**/
	
	public Sprint1_PageFactory (){
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		//excelutil.getExcel();
		System.out.println("After Increment=" + ProjectID);		
	}
	
	public void EnterandSelectProID()throws Exception{
		
		pageloader(1);
			try{
			
			Thread.sleep(4000);
			if(CrtDmdIdent.isDisplayed()){
				CrtDmdIdent.click();
			}
			PageFactory.initElements(driver, this);
			Thread.sleep(3000);
			ProjectID.click();
			String ProID = excelutil.getCellData("SORedesign", 4, "ProjID");
			enterValueIntoTextField(ProjectID, "projectid", ProID);
			clickOnButton(ProIdBFD,ProID);
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
	}
	

	public void Project_result_check_on_project_id_field_click()
	{
		
		try 
		{
			Thread.sleep(2000);
			//clicking on create demand 
			demon_selection.click();
//			clickOnButton(demon_selection, "demon_selection");
			System.out.println("Create demand grid is selected");
			//Click on project id field
			clickOnButton(project_id_field, "project_id_field");
			//Thread.sleep(2000);
			if(Project_list_displayed_check.isDisplayed())
			{
				System.out.println("Project list displayed on clicking project id field");
			}
			else
			{
				System.out.println("Project list are NOT displayed on clicking in project id field");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Project_list_on_typo_check()
	{
		
		try 
		{
//			Thread.sleep(2000);
			project_id_field.sendKeys("1000");
//			Thread.sleep(2000);
			if(Project_list_typo_check.isDisplayed())
			{
				System.out.println("Project list displayed on clicking project id field");
				int Total_displayed_project= driver.findElements(By.xpath("//div[contains(@class,'mCSB_container')]/li[not(contains(@style,'none'))]")).size();
				System.out.println("Project list size:"+Total_displayed_project);
				
			}
			else
			{
				System.out.println("Project list are NOT displayed on Typing in project id field using Project ID");
			}
			
			project_id_field.clear();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void enterprojectid(String project_type) throws Exception 
	{
		//waitForPageLoad(5);
	
		try
		{	
			Thread.sleep(4000);
			if(CrtDmdIdent.isDisplayed()){
				CrtDmdIdent.click();
			}
			Thread.sleep(3000);
			ProjectID.click();
			String Project_ID_data = excelutil.getCellData("SORedesign", 6 , "ProjID");
			/**enterprojectid_f(String project_type, WebElement field_location, String list_xpath,String field_name)**/
			List_Selection(Project_ID_data, project_id_field, project_list, "Project_ID");
		}	
		catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
		
		}
	
	}
	public void check_selected_project_displayed() throws Exception
	{
		try
		{
			String Project_ID_data = excelutil.getCellData("SORedesign", 5 , "ProjID");
			
			if(project_id_field.getAttribute("value").trim().contains(Project_ID_data))
			{
				System.out.println("Selected Project Displayed Successfully");
			}
			else
			{
				System.out.println("Selected Project Displayed Successfully");
			}
		}	
		catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
		
		}
	}
	
	public void Project_list_on_typo_check_with_project_name() throws Exception
	{
		try
		{
			enterValueIntoTextField(project_id_field, "project_id_field", "Health Net Medisys");
			
			if(Project_list_typo_check.isDisplayed())
			{
				System.out.println("Project list displayed on clicking project id field");
				int Total_displayed_project= driver.findElements(By.xpath("//div[contains(@class,'mCSB_container')]/li[not(contains(@style,'none'))]")).size();
				System.out.println("Project list size:"+Total_displayed_project);
				
			}
			else
			{
				System.out.println("Project list are NOT displayed on typing in project Name");
			}
			
			project_id_field.clear();
			
		}	
		catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
		
		}
	}
	
	public void SelectOpportunityRadiobutton()throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			//String OpID = excelutil.getCellData("SORedesign", 4, "OpportID");
			//ToFindRowNumber(OpID,"//*[@id='projectSearchTableID']/tbody/tr");
			WebElement goButton = driver.findElement(By.xpath("(//input[@name='customRadio' and @type='radio'])[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButton);
						
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
		
	}
	
	public void select_requirement_type(String type) throws Exception
	{
		try
		{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			//String ReqTypeYes = excelutil.getCellData("SORedesign", 6, "RequirementType");
			RequirementType.click();
			selectValueFromDropDown(RequirementType,"Ramp Up","ReqType");
			//List_Selection(ReqTypeYes, RequirementType, Requirentlist, "Requirmt_Type");		
			//Thread.sleep(2000);	
			ResourceIdenYes.isDisplayed();
			ResourceIdenYes.click();
			
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}
	
	public void ReqtypeRampupYesandNoValidation(String type) throws Exception
	{
		try
		{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			RequirementType.isDisplayed();
			RequirementType.click();
			String ReqTypeYes = excelutil.getCellData("SORedesign", 6, "RequirementType");
			List_Selection(ReqTypeYes, RequirementType, Requirentlist, "Requirmt_Type");
			Thread.sleep(5000);
			if(RequirementType.getAttribute("value").equals("Ramp-up")){
				Thread.sleep(2000);	
				if(ResourceIdenYes.isDisplayed()&&ResourceIdenNO.isDisplayed()){
					System.out.println("Resource identified  yes and no is displayed");
				}				
			}
			else
			{
				System.out.println("Resource identified Yes and no is not displayed");	
			}
										
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}
	
	
	public void ReqtypeBackfillYesandNoValidation(String type) throws Exception
	{
		try
		{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			RequirementType.click();
			String ReqTypeYes = excelutil.getCellData("SORedesign", 6, "RequirementType");
			List_Selection(ReqTypeYes, RequirementType, Requirentlist, "Requirmt_Type");
			Thread.sleep(5000);
			if(RequirementType.getAttribute("value").equals("Backfill")){
				Thread.sleep(2000);	
				if(ResourceIdenYes.isDisplayed()&&ResourceIdenNO.isDisplayed()){
					System.out.println("Resource identified  yes and no is displayed");
				}				
			}
			else
			{
				System.out.println("Resource identified Yes and no is not displayed");	
			}
										
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");		}
	}
	
	public void ReqtypeContractortoFTEYesandNoValidation(String type) throws Exception
	{
		try
		{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			RequirementType.click();
			String ReqTypeYes = excelutil.getCellData("SORedesign", 6, "RequirementType");
			List_Selection(ReqTypeYes, RequirementType, Requirentlist, "Requirmt_Type");
			Thread.sleep(5000);
			if(RequirementType.getAttribute("value").equals("Contractor to FTE")){
				if(ResourceIdenYes.isDisplayed()&&ResourceIdenYes.isEnabled()){
				System.out.println("Resource identified YES is displayed");	
				}						
			ResourceIdenNO.isDisplayed();
			System.out.println("Resource identified NO is NOT displayed");			
			}
			else
			{
				System.out.println("Resource identified Yes is not displayed");
				
			}
										
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}
	
	public void ReqtypeLabMarketTestYesandNoValidation(String type) throws Exception
	{
		try
		{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			RequirementType.click();
			String ReqTypeYes = excelutil.getCellData("SORedesign", 6, "RequirementType");
			List_Selection(ReqTypeYes, RequirementType, Requirentlist, "Requirmt_Type");
			Thread.sleep(5000);
			if(RequirementType.getAttribute("value").equals("LMT Demand")){
				if(ResourceIdenNO.isDisplayed()&&ResourceIdenNO.isEnabled()){
				System.out.println("Resource identified YES is displayed");	
				}						
				ResourceIdenYes.isDisplayed();
			System.out.println("Resource identified NO is NOT displayed");			
			}
			else
			{
				System.out.println("Resource identified Yes is not displayed");
				
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
			Thread.sleep(1000);
			btnProtoCreate.isEnabled();
			btnProtoCreate.click();
			
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}
	
	public void select_Practise(String type) throws Exception
	{
		try
		{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			txtPractice.isDisplayed();
			String Practice = excelutil.getCellData("SORedesign", 6, "Practice");
			List_Selection(Practice, txtPractice, Practicelist, "Practic");		
					
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
	}
	
	public void Enter_DemandName()throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			txtDemandName.isDisplayed();
			String DemandName = excelutil.getCellData("SORedesign", 6, "Demand Name");
			enterValueIntoTextField(txtDemandName, "DmandNm", DemandName);
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
		
	}

	public void ChooseLocation()throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			txtLocation.isDisplayed();
			String Location = excelutil.getCellData("SORedesign", 6, "LocationName");
			List_Selection(Location, txtLocation, Locationlist, "Loctn");						
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void ChooseFacility()throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(500);
			txtFacility.isDisplayed();
			txtFacility.click();
			String Facility = excelutil.getCellData("SORedesign", 6, "Facility");
			List_Selection(Facility, txtFacility, FacilityList, "Facity");
			
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}

	public void ChooseLionOfBusiness()throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(500);
			txtLOB.isDisplayed();
			txtLOB.click();
			String LOB = excelutil.getCellData("SORedesign", 6, "LOB");
			List_Selection(LOB, txtLOB, LOBlist, "LIOB");
			
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void EnterAssociateIDName()throws Exception{
		
		pageloader(1);
		try{
			txtEnterAssID.isDisplayed();
			txtEnterAssID.click();
			PageFactory.initElements(driver, this);
			String AssDetail = excelutil.getCellData("SORedesign", 6, "EnterAssID");
			enterValueIntoTextField(txtEnterAssID, "AssociateDetail", AssDetail);
			txtHeader.click();
			Thread.sleep(1000);
			btnTick.isEnabled();
			clickOnButton(btnTick,"Tick");
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
	}
	
	public void AssignmentStartDate()throws Exception{
		
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			Thread.sleep(2000);
			txtAssignStartDate.isDisplayed();
			String AssignmentStDt = excelutil.getCellData("SORedesign", 6, "assignment_Start_date");
			enterValueIntoTextField(txtAssignStartDate, "AssStDt", AssignmentStDt);
			Thread.sleep(1000);
			AssignStDtcalender.click();
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
	}

	public void AssignmentEndDate()throws Exception{
		
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			txtAssignEndDate.isDisplayed();
			txtAssignEndDate.click();
			String AssgnEndDte = excelutil.getCellData("SORedesign", 6, "assignment_end_date");
			enterValueIntoTextField(txtAssignEndDate, "AssEndDt", AssgnEndDte);
			Thread.sleep(500);
			AssignNdDtcalender.click();
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
	}
	
	
	public void enter_assign_percentage() throws Exception
	{
		
		
		try{
			PageFactory.initElements(driver, this);
			txtAssignmentPercent.isDisplayed();
			txtAssignmentPercent.click();
			String AssignPer = excelutil.getCellData("SORedesign", 6, "Assignment_percentage");
			enterValueIntoTextField(txtAssignmentPercent, "AssignmtPercent", AssignPer);
			
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}
		
	}
	
	public void associatebillability() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			txtAssoBillabilty.isDisplayed();
			txtAssoBillabilty.click();
			String Bill = excelutil.getCellData("SORedesign", 6, "Billability");
			List_Selection(Bill, txtAssoBillabilty, BillabilityList, "Bill");						
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
		
	}
	
	public void BillingStartDate()throws Exception{
		
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			txtBillSrtDate.isDisplayed();
			String BillStDte = excelutil.getCellData("SORedesign", 6, "BillingStart_Date");
			enterValueIntoTextField(txtBillSrtDate, "BillStDate", BillStDte);
			Thread.sleep(500);
			txtBillingStDateCalender.click();
			
		}catch(Exception e){
			catch_code(e,"Project_id_field","Project Selection have some problem");
			
		}
	}
	
	public void select_billability_role() throws Exception
	{
		try
		{
			txtBillabilityRole.isDisplayed();
			txtBillabilityRole.click();
			String BillRole = excelutil.getCellData("SORedesign", 6, "Billability_Role");
			enterValueIntoTextField(txtBillabilityRole, "BilliRle", BillRole);
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void PrimaryStateTag() throws Exception{
		pageloader(1);
		try{
			PageFactory.initElements(driver, this);
			txtPrimaryStateTag.isDisplayed();
			txtPrimaryStateTag.click();
			String PriStTag = excelutil.getCellData("SORedesign", 6, "PrimaryTag");
			List_Selection(PriStTag, txtPrimaryStateTag, PrimarySteTaglist, "PST");						
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
			txtSecondaryStateTag.isDisplayed();
			String SecondStTag = excelutil.getCellData("SORedesign", 6, "SecondaryTag");
			List_Selection(SecondStTag, txtSecondaryStateTag, SecondrySteTaglist, "SSTAG");						
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
			txtDemandRole.isDisplayed();
			String DemandRole = excelutil.getCellData("SORedesign", 6, "Demand_Role");
			enterValueIntoTextField(txtDemandRole, "DmdRole", DemandRole);
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void Clickon_CreateDemandIndent() throws Exception
	{
		try
		{
			btnCreateDemandIndent.isEnabled();
			btnCreateDemandIndent.click();
			Thread.sleep(1000);
			successmesgpopup.click();

		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	

	public void Verify_Create_new_demand_link(String managerid) throws Exception, Throwable
	{
		try
		{
			WebDriverWait waits = new WebDriverWait(driver, 30);
			waits.until(ExpectedConditions.elementToBeClickable(txtManagerID));
			if(txtManagerID.isDisplayed())
			{
				System.out.println("Manager ID field is displayed");
			}
			else
			{
				System.out.println("Manager id field is NOT displayed");
			}
			

			int num = excelutil.getRowNum("SORedesign", "@PB_SO_New_0003_001");
			String RoleIds = excelutil.getCellData("SORedesign", num, "RoleIds");
			System.out.println(RoleIds);
			enterValueIntoTextField(txtManagerID, "managrid", managerid);	
			
			waits.until(ExpectedConditions.visibilityOf(btnSetID));
			btnSetID.click();
			 
			
			if(RoleIds.contains(managerid)){
				//getting text from button and validating it
				String val = btnCrtDmtIdnt.getText().trim();
				if (val.equals("Create Demand Indent")){
					System.out.println("Create Demand Indent button is displayed.");
				} else {
					System.out.println("Create Demand Indent button is not displayed.");
				}			
			} else{
				System.out.println("Un-Authotized user");
				String val2 = txtAccessDenied.getText().trim();
				if (val2.contains("You do not have access to this module")){
					System.out.println("'You do not have access to this module' error message is displayed");
				} else {
					System.out.println("'You do not have access to this module' error message is not displayed");
				}	
			}
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
	public void Validate_Create_Dem_Button() throws Exception, Throwable
	{
		String [] columnlist={"","","",""};
		String id = "";
		String url = excelutil.getCellData("SORedesign", 11 ,"url");
		WebDriverWait waits = new WebDriverWait(driver, 30);
		
		for (int i=1;i<=columnlist.length;i++)
		{
			if (i>1){
			 id = excelutil.getCellData("SORedesign", 11 ,"Managerid"+i);
			}else{
				 id = excelutil.getCellData("SORedesign", 11 ,"Managerid");
			}
			columnlist[i-1] = id;
		} 
		int j=0;
		for (int i=1;i<=columnlist.length;i++)
		{
			waits.until(ExpectedConditions.elementToBeClickable(txtManagerID));
			Verify_Create_new_demand_link(columnlist[j]);
			driver.get(url);
			j++;
		} 
	}
	
	public void Select_Opportunity_ID_filter() throws Exception, Throwable
	{
		try
		{
			if(opportunity_id_field.isDisplayed())
			{
				System.out.println("Opportunity ID field is displayed");
			}
			else
			{
				System.out.println("Opportunity Id field is NOT displayed");
			}
			
			//Select opportunityId = new Select(opportunity_id_field);
			//List<WebElement> list = opportunityId.getOptions();
			
			//enterValueIntoTextField(opportunityId, "opportunity Id", "All");
			opportunity_id_field.click();
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(opportunity_list)));
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.xpath(opportunity_list));
			System.out.println(" List size ::" + list.size());
			for(int i = 0 ;i<list.size();i++)
			{
				System.out.println(list.get(i).getText());
				opportunity_id_field.click();
				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(opportunity_list)));
				Thread.sleep(2000);
				String filterVal = list.get(i).getText().trim();
				list.get(i).click();
				wait.until(ExpectedConditions.elementToBeClickable(opportunity_table));
				
				int rows = opportunity_table.findElements(By.xpath("//tbody/tr")).size()/2;
				System.out.println("filterVal " + filterVal);
				System.out.println("rows " + rows);
				
				for (int j=1;j<=rows;j++){
					String xpath = "//tbody/tr[" +j +"]/td[2]";
					String f = opportunity_table.findElement(By.xpath(xpath)).getText().trim();
					System.out.println("field " + f);
					if(f!=null && f!=""){
						//System.out.println("loop ");
						if(filterVal.equals(f)){
							System.out.println("filterVal is equal to field value");
						}
					}
				}
			}
		}
		catch(Exception e)
		{
			catch_code(e,"Project_id_field","Project Selection have some problem");	
		}
	}
	
}
	


