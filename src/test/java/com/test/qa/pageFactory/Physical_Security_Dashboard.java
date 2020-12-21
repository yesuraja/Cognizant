package com.test.qa.pageFactory;
		
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


import com.relevantcodes.extentreports.LogStatus;
import com.test.qa.libraries.FunctionalLibrary;

import com.test.qa.utilities.ExcelUtil;

public class Physical_Security_Dashboard extends FunctionalLibrary{
	
	String DB_ProjectID = "";
	
	ExcelUtil excelutil = new ExcelUtil();
	WebDriverWait wait = new WebDriverWait(driver,30);
	static Logger log = Logger.getLogger(Raja_Sprint2.class.getName());
	
	@FindBy (xpath="//input[@id='oneC_searchAutoComplete']")
	public WebElement OneCSearch;
	
	@FindBy (xpath="//*[@class='searchInputIcon']")
	public WebElement btnSearch;
	
	@FindBy (xpath="(//*[@class='appsResultText'])[1]")
	public WebElement btnPhysicalSecurityApp;
	
	@FindBy (xpath="//h2[@title='From Date    &     To Date']//following::input[1]")
	public WebElement txtFromDate;
	
//	@FindBy (xpath="(//*[@class='date-slicer-input hasDatepicker enable-hover'])[1]")
//	public WebElement txtFromDate;
		
	@FindBy (xpath="//h2[@title='From Date    &     To Date']//following::input[2]")
	public WebElement txtToDate;
	
	////*[@title='Previous Month']//preceding::span[1]
	
	@FindBy (xpath="(//*[@class='glyphicon checkbox'])[1]")
	public WebElement chkboxPreviousMonth;
	
	// Xpath for calender icon
	
	@FindBy (xpath="//select[@class='ui-datepicker-month']")
	public WebElement CalenderMonthxpath;
	
	@FindBy (xpath="//select[@class='ui-datepicker-year']")
	public WebElement CalenderYearxpath;
	
	@FindBy (xpath="//*[@class='ui-icon ui-icon-circle-triangle-w']")
	public WebElement CalenderUpArrow;
	
	@FindBy (xpath="//*[@class='ui-datepicker-next ui-corner-all']")
	public WebElement CalenderDownArrow;
		
	@FindBy (xpath="(//*[@class='slicer-dropdown-menu'])[1]")
	public WebElement CountryDrpdown;
	
	@FindBy (xpath="(//*[@class='slicer-dropdown-menu'])[2]")
	public WebElement CityDrpdown;
	
	@FindBy (xpath="//*[contains(@aria-label,'Chennai')]/div[@class='slicerCheckbox']")
	public WebElement CityChennai1;
	
	@FindBy (xpath="(//*[@class='slicerCheckbox'])[3]")
	public WebElement CityChennai;
	
	@FindBy (xpath="(//*[@class='slicer-dropdown-menu'])[3]")
	public WebElement FacilityDrpdown;
	
	@FindBy (xpath="//*[contains(@aria-label,'IND-CHN-CKC')]/div[@class='slicerCheckbox']")
	public WebElement FacilityCKC1;
	
	@FindBy (xpath="(//*[@class='slicerCheckbox'])[13]")
	public WebElement FacilityCKC;
	
	@FindBy (xpath="(//*[@class='value'])[2]")
	public WebElement GeneralVisitor;
	
	@FindBy (xpath="(//*[@class='value'])[3]")
	public WebElement ClientVisitor;
	
	@FindBy (xpath="(//*[@class='slicerCheckbox'])[2]")
	public WebElement checkboxIndia;
	
	@FindBy (xpath="(//*[@class='dropdown-chevron powervisuals-glyph chevron-down'])[1]")
	public WebElement btnCountryDownArrow;
			
	@FindBy (xpath="(//*[@class='dropdown-chevron powervisuals-glyph chevron-down'])[2]")
	public WebElement btnCityDownArrow;
			
	@FindBy (xpath="(//*[@class='dropdown-chevron powervisuals-glyph chevron-down'])[3]")
	public WebElement btnFacilityDownArrow;
		
	@FindBy (xpath="(//*[@class='dropdown-chevron powervisuals-glyph chevron-up'])[1]")
	public WebElement btnCountryUPArrow;
	
	@FindBy (xpath="//*[@class='dropdown-chevron powervisuals-glyph chevron-up']")
	public WebElement btnCITYUPArrow;
	
	@FindBy (xpath="//*[@class='dropdown-chevron powervisuals-glyph chevron-up']")
	public WebElement btnFacilityUPArrow;
	
	@FindBy (xpath="//*[@class='ui-datepicker-month']")
	public WebElement SelectMonth;
	
	@FindBy (xpath="//*[@class='ui-datepicker-year']")
	public WebElement SelectYear;
	
	@FindBy (xpath="(//*[@class='ui-state-default'])[1]")
	public WebElement SelectFromDate;
		
	@FindBy (xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]")
	public WebElement SelectTODate;

	@FindBy (xpath="(//*[@class='searchInput'])[3]")
	public WebElement txtSearchCity;
	
	@FindBy (xpath="(//*[@class='searchInput'])[4]")
	public WebElement txtSearchFacility;
	
	@FindBy (xpath="(//*[@class='value'])[10]")
	public WebElement txtRole;
	
	@FindBy (xpath="//*[@id='btnsearch']")
	public WebElement btnSearchOneC;
		
	@FindBy (xpath="//*[@id='desktopsearchresult']/ul/li[1]")
	public WebElement btnPhysicalSecApp;
	
	@FindBy (xpath="//*[@id='txtPlatformBarSearch']")
	public WebElement txtOneCSearch;
	
	@FindBy (xpath="//*[@class='vcMenuBtn']")
	public WebElement btnBadgeSummary;
	
	@FindBy (xpath="(//*[@class='itemLabel trimmedTextWithEllipsis'])[2]")
	public WebElement tabShowasTable;
	
	@FindBy (xpath="(//*[@class='visual visual-card allow-deferred-rendering'])[6]")
	public WebElement txtGeneralVisitorPercent;		
	
	@FindBy (xpath="//button[@class='vcMenuBtn']")
	public WebElement btnClientBadgeSummary;
	
	@FindBy (xpath="//*[@id='custom_toolbar']/div/button/span/div")
	public WebElement btnMenu;
	
	@FindBy (xpath="(//*[@class='white--text v-list-item v-list-item--link theme--light'])[4]")
	public WebElement btnHome;
	
	
	public void EnterAppNameandClickonSearchButton (String App_Name) throws Exception {
		try {
			PageFactory.initElements(driver, this);
			
			Thread.sleep(1000);
			elementTobeClickable(OneCSearch, 10, "One C SearchField");
			
		//	txtOneCSearch.sendKeys("Physical Security Dashboard");			
		//	driver.findElement(By.xpath("//*[@id='txtPlatformBarSearch']")).sendKeys("Physical Security Dashboard");			
		//	btnSearchOneC.click();
					
			String AppName = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , App_Name);
			if(AppName!=null && AppName!="")
            {
                enterValueIntoTextField(OneCSearch, "SearchApp", AppName);
                System.out.println("Entered App Name is "+AppName);
                PASSreport("Application Name", "Application name is entered Successfully :"+AppName);
            }
			else
			{
				FAILreport("Application Name","Defect : Application name is NOT entered");
			}
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public void ClickonSearchButton() throws Exception {
		try {
			elementTobeClickable(btnSearch, 20, "One C SearchButton");
			
			clickOnButton(btnSearch,"SearchButton");
			System.out.println("Search button clicked successfully");
			PASSreport("Search Button","Search button is clicked successfully");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			FAILreport("Search Button","Search button is NOT clicked");
		}
	}
	
	public void ClickonPhysicalSecurityApp() throws Exception {
		try {
			
			Thread.sleep(2000);
						
			elementTobeClickable(btnPhysicalSecurityApp, 40, "Physical Security App");
			
			
		//	btnPhysicalSecApp.click();			
			clickOnButton(btnPhysicalSecurityApp,"Physical Security Dashboard App");
			
			System.out.println("Physical Security Application is Clicked");
			Thread.sleep(10000);
			
			WebElement frame1 = driver.findElement(By.xpath("//*[@id='appFrame']")); 
			driver.switchTo().frame(frame1);
			System.out.println("Frame 1 switched successfully");
			
			btnMenu.click();
			System.out.println("Menu button clicked successfully");
			
			Thread.sleep(1000);
			
			btnHome.click();
			System.out.println("Home button Clicked successfully");
			
			Thread.sleep(1000);
			
			
			//PASSreport("Clicking on Physical Security Application","Physical Security Application Clicked successfully");
			
			
			
		}catch (Exception e) {
			
			FAILreport("Clicking on Physical Security Application","Physical Security Application NOT Clicked");
			System.out.println(e.getMessage());
		}
	}
	
	public void ClickonPreviousMonthCheckbox() {
		try {
			
//			elementTobeClickable(chkboxPreviousMonth, 60, "Previous Month Check box");
			//Thread.sleep(20000);
			System.out.println("inside previous month checkbox");
//			WebElement frame1 = driver.findElement(By.xpath("//*[@id='appFrame']")); 
//			driver.switchTo().frame(frame1);
//			System.out.println("Frame 1 switched successfully");
			
			WebElement frame2 = driver.findElement(By.xpath("//*[@id='embedContainer']/iframe"));
			driver.switchTo().frame(frame2);
			System.out.println("Frame 2 switched successfully");
			
			elementTobeClickable(chkboxPreviousMonth, 60, "Previous Month Check box");
			Thread.sleep(10000);	
			chkboxPreviousMonth.click();
				
			System.out.println("Previous month check box is unchecked");
			PASSreport("Previous Month Checkbox","Previous Month Checkbox is Unchecked");			
			
		}catch (Exception e) {
			System.out.println("Previous month check box is not displayed");
			FAILreport("Previous Month Checkbox","Previous Month Checkbox is NOT Clicked");
			System.out.println(e.getMessage());
		}
	}
	
	public void Select_FromDate(String From_Date) throws Exception {
		try {
		//	WebDriverWait waits = new WebDriverWait(driver, 60);
		//	waits.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("appFrame"));
			
			
			Thread.sleep(5000);
			
			String FromDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , From_Date);
			select_date(txtFromDate, FromDate);			
			System.out.println("From date entered is "+FromDate);
			
			PASSreport("From Date field ","Date is Selected in From Date Field");
							
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
			FAILreport("From Date field","Date is NOT Selected in From Date Field");
		}
	}
	
	public void Select_ToDate(String To_Date) throws Exception {
		try {
			//elementTobeClickable(btnPhysicalSecurityApp, 20, "Physical Security App");
			
			Thread.sleep(2000);
			
			String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , To_Date);
			select_date(txtToDate, ToDate);
						
			System.out.println("To date value is entered in date field "+ToDate);
			
				
			PASSreport("To Date Field","Date Selected in TO date field Successfully");
			
			
		}catch (Exception e) {
			FAILreport("To Date Field","Date is NOT Selected in TO date field");
			System.out.println(e.getMessage());
		}
	}
	
	//Constant for Database URL
	String DBUrl = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "DB_URL");
	//Constant for Database Username
//	String DB_USER = excelUtil.PasswordgetCellData(testcase_sheetName, testcase_rowNumber , "DB_UserName");
	//Constant for Database Password
	String DB_USER = DBUserName;
	
//	String DB_PASSWORD = excelUtil.PasswordgetCellData(testcase_sheetName, testcase_rowNumber , "DB_PassWord");
	String DB_PASSWORD = DBPassword;
	//Connection object
	static Connection con = null;
	//Statement object
	private static Statement stmt;

	public void setUp() throws Exception {	
	try
	{
	// Make the database connection
	String dbClass = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "DB_Class");
//	String dbClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	Class.forName(dbClass).newInstance();
	// Get connection to DB
	 con = DriverManager.getConnection(DBUrl, DB_USER, DB_PASSWORD);
	 System.out.println("UerName"+DB_USER);
	 System.out.println("Password"+DB_PASSWORD);
	// Statement object to send the SQL statement to the Database
	stmt = con.createStatement();
	System.out.println("Connection created");
	}
	catch (Exception e)
	{
	e.printStackTrace();
	System.out.println(e.getMessage());
	}
	}


	public String get_DB_Visitors() {
	try
	{
		
		
		
		String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
		String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
		String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
		String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");
		
		
	//Opening Connection
	setUp();
	String query = "select sum(Vstr_cnt) Vstr_cnt  from (\r\n" + 
			"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
			"from VisitorRequest vr\r\n" + 
			"join Visitdetails vd \r\n" + 
			"on vr.RequestID = vd.RequestID\r\n" + 
			"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
			"(select * from [dbo].[TblLocationMaster] where\r\n" + 
			"CityId is not null and CountryId is not null) TLM\r\n" + 
			"join [dbo].[CityMaster] CM\r\n" + 
			"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
			"on vr.LocationId=b.LocationId\r\n" + 
			"where \r\n" + 
			"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
			"vr.requeststatus in ('In', 'Out')\r\n" + 
			"and vr.LocationId is NOT NULL\r\n" + 
			"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
			"union All\r\n" + 
			"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
			"from VisitorRequest vr\r\n" + 
			"join Visitdetails vd \r\n" + 
			"on vr.RequestID = vd.RequestID\r\n" + 
			"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
			"(select * from [dbo].[TblLocationMaster] where\r\n" + 
			"CityId is not null and CountryId is not null) TLM\r\n" + 
			"join [dbo].[CityMaster] CM\r\n" + 
			"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
			"on vr.Facility=b.CountryCityFacility\r\n" + 
			"where \r\n" + 
			"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
			"vr.requeststatus in ('In', 'Out')\r\n" + 
			"and vr.LocationId is NULL\r\n" + 
			"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) as e\r\n" + 
			"where e.Country='India'\r\n" + 
			"and e.City='"+SearchCity+"'\r\n" + 
			"and e.CountryCityFacility = '"+Facilty+"'\r\n" + 
			"and e.Date >= '"+FrmDate+"' and e.Date <= '"+ToDate+"'\r\n" + 
			"and e.Purpose not in ('Client')";
	ResultSet res = stmt.executeQuery(query);
	while (res.next())
	{
//	add arrey list	
	System.out.println(res.getString(1));
	DB_ProjectID=res.getString(1);
//	DB_ProjectID.add(res.getString("")));
	}
	//Closing Connection
	tearDown();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	System.out.println(e.getMessage());
	}
	return DB_ProjectID;
	}


	public void tearDown() throws Exception 
	{
	// Close DB connection
	if (con != null) 
	{
	con.close();
	}
	}

	public void GeneralVisitorCountComparison() throws Exception 
	{
	String ClientVisitors=get_DB_Visitors();
	// enterprojectid_new(NBL_Projectid);
	System.out.println("Client Visitor Data Base count is : "+ClientVisitors);
	
	String element = driver.findElement(By.xpath("(//*[@class='value'])[3]")).getText().trim();
	
	System.out.println("Stored Value : " +element);
	
	if(element.equalsIgnoreCase(ClientVisitors)) {
		
		System.out.println("Client Visitor Value displayed in Application and DB are Same");
		System.out.println("Client Visitor Count displayed in Application as: "+ element);
		
		PASSreport("Client Visitor ","Client Visitor Value displayed in Application : " + element +"General Visitor Value displayed in DB : "+ ClientVisitors);
	}
	else
	{
		System.out.println("Client Visitor Value displayed in Application and DB are NOT Same : "+element);
		FAILreport("Client Visitor","Client Visitor Value displayed in Application and DB are NOT Same" + "Appliction CV Count : "+element+ "DB CV Count : "+ClientVisitors);
		
	}
	}
	
	public void Select_Country() throws Exception
	{
		try {
			elementTobeClickable(CountryDrpdown, 60, "Country Dropdown");
			
			CountryDrpdown.click();
			
			elementTobeClickable(checkboxIndia, 60, "Country India Dropdown");
			
			checkboxIndia.click();
			
			System.out.println("Country Selected");
			
			PASSreport("Country","Country Selected Successfully" );
			
		}catch (Exception e) {
			
			FAILreport("Country","Country NOT selected");
		}
	}
	
	public void Select_City(String SearchCITY) throws Exception
	{
		try {
			Thread.sleep(1000);
			
			CityDrpdown.click();
			
			Thread.sleep(2000);
			
	/*		String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , SearchCITY);
			enterValueIntoTextField(txtSearchCity,"Search City",SearchCity);
			
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CityChennai);*/
			
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", CityChennai1);
						
	//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnCITYUPArrow);
			Thread.sleep(2000);
			
			btnCITYUPArrow.click();
			
			System.out.println("CITY Selected");
			
			PASSreport("CITY","CITY Selected Successfully" );
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			FAILreport("CITY","CITY NOT selected");
		}
	}
	
	
	public void Select_Facility(String SearchFacilty) throws Exception
	{
		try {
			Thread.sleep(2000);
			
		//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMenubar);
			//clickOnButton(FacilityDrpdown, "FacilityDrpdown");

			FacilityDrpdown.click();
		//	Thread.sleep(1000);
			
			String SearchFacility = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , SearchFacilty);
			enterValueIntoTextField(txtSearchFacility,"Search Facility",SearchFacility);
			
			Thread.sleep(3000);

			FacilityCKC1.click();
			
			Thread.sleep(1000);
			
			btnFacilityUPArrow.click();
			
			System.out.println("Facility Selected");
			
			PASSreport("Facility","Facility Selected Successfully" );
			
		}catch (Exception e) {
			
			FAILreport("Facility","Facility NOT selected");
			System.out.println(e.getMessage());
		}
	}
	
	public void SelectFromDateSelectioninCalender() {
		try {
			Thread.sleep(5000);
			txtFromDate.click();
			Thread.sleep(2000);
			SelectMonth.click();
			Select select = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
			select.selectByValue("8");
		//	WebElement option = select.getFirstSelectedOption();
			
			System.out.println("Selected month");
			Thread.sleep(3000);
			SelectYear.click();
			Select selectYR = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
			selectYR.selectByValue("2020");
		//	WebElement option1 = selectYR.getFirstSelectedOption();
			
			System.out.println("Selected Year");
			
			Thread.sleep(1000);
			
			SelectFromDate.click();
			System.out.println("From Date Selected Successfully");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void ToDateSelectionuinCalender()throws Exception{
		try {
			Thread.sleep(5000);
			txtToDate.click();
			
			Thread.sleep(2000);
			SelectMonth.click();
			
			Select select1 = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
			select1.selectByValue("8");
		//	WebElement option = select.getFirstSelectedOption();
			
			System.out.println("Month Selected");
			Thread.sleep(3000);
			SelectYear.click();
			
			Select selectYR1 = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
			selectYR1.selectByValue("2020");
		//	WebElement option1 = selectYR.getFirstSelectedOption();
			
			System.out.println("Year Selected");
			
			Thread.sleep(1000);
			
			SelectTODate.click();
			System.out.println("To Selected Successfully");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String get_DB_ClientVisitors() {
		try
		{
			
			
			
			String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
			String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
			String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
			String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");
			
			
		//Opening Connection
		setUp();
		String query = "select sum(Vstr_cnt) Vstr_cnt  from (\r\n" + 
				"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
				"from VisitorRequest vr\r\n" + 
				"join Visitdetails vd \r\n" + 
				"on vr.RequestID = vd.RequestID\r\n" + 
				"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
				"(select * from [dbo].[TblLocationMaster] where\r\n" + 
				"CityId is not null and CountryId is not null) TLM\r\n" + 
				"join [dbo].[CityMaster] CM\r\n" + 
				"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
				"on vr.LocationId=b.LocationId\r\n" + 
				"where \r\n" + 
				"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
				"vr.requeststatus in ('In', 'Out')\r\n" + 
				"and vr.LocationId is NOT NULL\r\n" + 
				"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
				"union All\r\n" + 
				"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
				"from VisitorRequest vr\r\n" + 
				"join Visitdetails vd \r\n" + 
				"on vr.RequestID = vd.RequestID\r\n" + 
				"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
				"(select * from [dbo].[TblLocationMaster] where\r\n" + 
				"CityId is not null and CountryId is not null) TLM\r\n" + 
				"join [dbo].[CityMaster] CM\r\n" + 
				"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
				"on vr.Facility=b.CountryCityFacility\r\n" + 
				"where \r\n" + 
				"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
				"vr.requeststatus in ('In', 'Out')\r\n" + 
				"and vr.LocationId is NULL\r\n" + 
				"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) as e\r\n" + 
				"where e.Country='India'\r\n" + 
				"and e.City='"+SearchCity+"'\r\n" + 
			//	"and e.CountryCityFacility = '"+Facilty+"'\r\n" + 
				"and e.Date >= '"+FrmDate+"' and e.Date <= '"+ToDate+"'\r\n" + 
				"and e.Purpose in ('Client')";
		ResultSet res = stmt.executeQuery(query);
		while (res.next())
		{
//		add arrey list	
		System.out.println(res.getString(1));
		DB_ProjectID=res.getString(1);
//		DB_ProjectID.add(res.getString("")));
		}
		//Closing Connection
		tearDown();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		System.out.println(e.getMessage());
		}
		return DB_ProjectID;
		}


		public void tearDown1() throws Exception 
		{
		// Close DB connection
		if (con != null) 
		{
		con.close();
		}
		}

		public void ClientVisitorsCountComparison() throws Exception 
		{
		String ClientVisitors=get_DB_ClientVisitors();
		// enterprojectid_new(NBL_Projectid);
		System.out.println("Client Visitor Data Base count is : "+ClientVisitors);
		
		String element = driver.findElement(By.xpath("(//*[@class='value'])[4]")).getText().trim();
		
		System.out.println("Stored Value : " +element);
		
		if(element.equalsIgnoreCase(ClientVisitors)) {
			
			System.out.println("Client Visitor Value displayed in Application and DB are Same");
			System.out.println("Client Visitor Count displayed in Application as: "+ element);
			
			PASSreport("Client Visitor ","Client Visitor Value displayed in Application : " + element +"General Visitor Value displayed in DB : "+ ClientVisitors);
		}
		else
		{
			System.out.println("Client Visitor Value displayed in Application and DB are NOT Same : "+element);
			FAILreport("Client Visitor","Client Visitor Value displayed in Application and DB are NOT Same" + "Appliction CV Count : "+element+ "DB CV Count : "+ClientVisitors);
			
		}
		}
		
		
		public String get_DB_TotalVisitor() {
			try
			{
				
				
				
				String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
				String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
				String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
				String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");
				
				
			//Opening Connection
			setUp();
			String query = "select sum(Vstr_cnt) Vstr_cnt  from (\r\n" + 
					"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
					"from VisitorRequest vr\r\n" + 
					"join Visitdetails vd \r\n" + 
					"on vr.RequestID = vd.RequestID\r\n" + 
					"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
					"(select * from [dbo].[TblLocationMaster] where\r\n" + 
					"CityId is not null and CountryId is not null) TLM\r\n" + 
					"join [dbo].[CityMaster] CM\r\n" + 
					"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
					"on vr.LocationId=b.LocationId\r\n" + 
					"where \r\n" + 
					"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
					"vr.requeststatus in ('In', 'Out')\r\n" + 
					"and vr.LocationId is NOT NULL\r\n" + 
					"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
					"union All\r\n" + 
					"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
					"from VisitorRequest vr\r\n" + 
					"join Visitdetails vd \r\n" + 
					"on vr.RequestID = vd.RequestID\r\n" + 
					"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
					"(select * from [dbo].[TblLocationMaster] where\r\n" + 
					"CityId is not null and CountryId is not null) TLM\r\n" + 
					"join [dbo].[CityMaster] CM\r\n" + 
					"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
					"on vr.Facility=b.CountryCityFacility\r\n" + 
					"where \r\n" + 
					"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
					"vr.requeststatus in ('In', 'Out')\r\n" + 
					"and vr.LocationId is NULL\r\n" + 
					"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) as e\r\n" + 
					"where e.Country='India'\r\n" + 
					"and e.City='"+SearchCity+"'\r\n" + 
				//	"and e.CountryCityFacility = '"+Facilty+"'\r\n" + 
					"and e.Date >= '"+FrmDate+"' and e.Date <= '"+ToDate+"'\r\n"  
	//				"and e.Purpose in ('Client')"
					;
			ResultSet res = stmt.executeQuery(query);
			while (res.next())
			{
//			add arrey list	
			System.out.println(res.getString(1));
			DB_ProjectID=res.getString(1);
//			DB_ProjectID.add(res.getString("")));
			}
			//Closing Connection
			tearDown();
			}
			catch(Exception e)
			{
			e.printStackTrace();
			System.out.println(e.getMessage());
			}
			return DB_ProjectID;
			}


			public void tearDown3() throws Exception 
			{
			// Close DB connection
			if (con != null) 
			{
			con.close();
			}
			}

			public void TotalVisitorsCountComparison() throws Exception 
			{
			String TotalVisitors=get_DB_TotalVisitor();
			// enterprojectid_new(NBL_Projectid);
			System.out.println("Total Visitor Data Base count is : "+TotalVisitors);
			
			String element = driver.findElement(By.xpath("(//*[@class='value'])[2]")).getText().trim();
			
			System.out.println("Stored Value : " +element);
			
			if(element.equalsIgnoreCase(TotalVisitors)) {
				
				System.out.println("Total Visitor Value displayed in Application and DB are Same");
				System.out.println("Total Visitor Count displayed in Application as: "+ element);
				
				PASSreport("Total Visitor ","Total Visitor Value displayed in Application : " + element +"Total Visitor Value displayed in DB : "+ TotalVisitors);
			}
			else
			{
				System.out.println("Total Visitor Value displayed in Application and DB are NOT Same : "+element);
				FAILreport("Total Visitor","Total Visitor Value displayed in Application and DB are NOT Same" + "Appliction CV Count : "+element+ "DB CV Count : "+TotalVisitors);
				
			}
			}
			
			public void ClickonBadgeSummaryMenu() throws Exception {
				try {
					
					Thread.sleep(10000);
	//				elementTobeClickable(chkboxPreviousMonth, 180, "Previous Month Check box");
//					WebDriverWait waits = new WebDriverWait(driver, 180);
//					waits.until(ExpectedConditions.elementToBeClickable(btnBadgeSummary));
					
					
					try {
	/*					WebElement frame1 = driver.findElement(By.xpath("//*[@id='appFrame']")); 
						driver.switchTo().frame(frame1);
						System.out.println("Frame 1 switched successfully"); */
						
						WebElement frame2 = driver.findElement(By.xpath("//*[@id='embedContainer']/iframe[1]"));
						driver.switchTo().frame(frame2);
						System.out.println("Frame 2 switched successfully");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
						
					Thread.sleep(10000);
					
					
				//	action.build().perform();
					
				//	menu.click();
//					WebDriverWait waits1 = new WebDriverWait(driver, 30);
//					waits.until(ExpectedConditions.elementToBeClickable(btnBadgeSummary));
					
	//				elementTobeClickable(btnBadgeSummary, 30, "Badge Summary Menu Button");
					
					Actions action = new Actions(driver);
					WebElement menu = driver.findElement(By.xpath("//*[@title='BADGE SUMMARY - GENERAL VISITORS']"));
					action.moveToElement(menu);
					action.build().perform();
					Thread.sleep(5000);
					menu.click();	
					System.out.println("Badge General visitor clicked");
					Thread.sleep(5000);
					btnBadgeSummary.click();
			//		clickOnButton(btnBadgeSummary,"Badge Summary Menu Button");
					System.out.println("Badge Summary Menu Button button clicked successfully");
					PASSreport("Badge Summary Menu Button","Badge Summary Menu Button clicked successfully");
				}catch (Exception e) {
					System.out.println(e.getMessage());
					FAILreport("Badge Summary Menu Button","Badge Summary Menu Button is NOT clicked");
				}
			}
			
			public void ClickonShowasTableTab() throws Exception {
				try {
				//	elementTobeClickable(tabShowasTable, 20, "Show as table TAB");
					Thread.sleep(3000);
					clickOnButton(tabShowasTable,"Show as table TAB");
					System.out.println("Show as table TAB clicked successfully");
					PASSreport("Show as table TAB","Show as table TAB clicked successfully");
				}catch (Exception e) {
					System.out.println(e.getMessage());
					FAILreport("Show as table TAB","Show as table TAB is NOT clicked");
				}
			}
			
			public String get_DB_ReturnedBadges() {
				try
				{
					
					
					
			/*		String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
					String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
					String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
					String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");  */
					
					
				//Opening Connection
				setUp();
				String query = "select sum(Vstr_cnt) Vstr_cnt from (\r\n" + 
						"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
						"from VisitorRequest vr with (NOLOCK)\r\n" + 
						"join Visitdetails vd with (NOLOCK)\r\n" + 
						"on vr.RequestID = vd.RequestID\r\n" + 
						"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
						"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status = 'A' and \r\n" + 
						"CityId is not null and CountryId is not null) TLM\r\n" + 
						"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
						"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
						"on vr.LocationId=b.LocationId\r\n" + 
						"where \r\n" + 
						"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
						"vr.requeststatus in ('Out') and\r\n" + 
						"vd.BadgeStatus in ('Returned')\r\n" + 
						"and vr.LocationId is NOT NULL\r\n" + 
						"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
						"union All\r\n" + 
						"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
						"from VisitorRequest vr with (NOLOCK)\r\n" + 
						"join Visitdetails vd with (NOLOCK)\r\n" + 
						"on vr.RequestID = vd.RequestID\r\n" + 
						"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
						"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status = 'A' and \r\n" + 
						"CityId is not null and CountryId is not null) TLM\r\n" + 
						"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
						"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
						"on vr.Facility=b.CountryCityFacility\r\n" + 
						"where \r\n" + 
						"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
						"vr.requeststatus in ('Out') and\r\n" + 
						"vd.BadgeStatus in ('Returned')\r\n" + 
						"and vr.LocationId is NULL\r\n" + 
						"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) as e\r\n" + 
						"where e.Country='India'\r\n" + 
						"and e.Date >= '2020-09-01' and e.Date <= '2020-09-30'\r\n" + 
						"and e.Purpose not in ('Client')\r\n" + 
						"--and e.City='Chennai'\r\n" + 
						"--and e.CountryCityFacility = 'IND-CHN-TCO'"
						;
				ResultSet res = stmt.executeQuery(query);
				while (res.next())
				{
//				add arrey list	
				System.out.println(res.getString(1));
				DB_ProjectID=res.getString(1);
//				DB_ProjectID.add(res.getString("")));
				}
				//Closing Connection
				tearDown();
				}
				catch(Exception e)
				{
				e.printStackTrace();
				System.out.println(e.getMessage());
				}
				return DB_ProjectID;
				}


				public void tearDown2() throws Exception 
				{
				// Close DB connection
				if (con != null) 
				{
				con.close();
				}
				}

				public void CompareReturedBadgeValueAppwithDB() throws Exception 
				{
				String ReturnedDB = get_DB_ReturnedBadges();
				// enterprojectid_new(NBL_Projectid);
				System.out.println("Returned Badge Data Base count is : "+ ReturnedDB);
				
				String ReturnedApp = driver.findElement(By.xpath("(//*[@class='pivotTableCellWrap cell-interactive tablixAlignRight '])[2]")).getText().trim();
				
				System.out.println("Stored Value : " + ReturnedApp);
				
				if(ReturnedApp.equalsIgnoreCase(ReturnedDB)) {
					
					System.out.println("Returned Badge Value displayed in Application and DB are Same");
					System.out.println("Returned Badge Value displayed in Application as: "+ ReturnedApp);
					
					PASSreport("Returned Badge","Returned Badge Value displayed in Application : " + ReturnedApp +"Returned Badge Value displayed in DB : "+ ReturnedDB);
				}
				else
				{
					System.out.println("Returned Badge Value displayed in Application and DB are NOT Same : "+ ReturnedApp);
					FAILreport("Returned Badge","Returned Badge Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+ ReturnedApp + "DB RB Count : "+ ReturnedDB);
					
				}
				}

			
				public String get_DB_YetToReturnBadges() {
					try
					{
						
						
						
						String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
						String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
						String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
						String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");
						
						
					//Opening Connection
					setUp();
					String query = "select sum(Vstr_cnt) Vstr_cnt from (\r\n" + 
							"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
							"from VisitorRequest vr with (NOLOCK)\r\n" + 
							"join Visitdetails vd with (NOLOCK)\r\n" + 
							"on vr.RequestID = vd.RequestID\r\n" + 
							"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
							"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status = 'A' and \r\n" + 
							"CityId is not null and CountryId is not null) TLM\r\n" + 
							"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
							"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
							"on vr.LocationId=b.LocationId\r\n" + 
							"where \r\n" + 
							"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
							"vr.requeststatus in ('In') and\r\n" + 
							"vd.BadgeStatus in ('Issued')\r\n" + 
							"and vr.LocationId is NOT NULL\r\n" + 
							"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
							"union All\r\n" + 
							"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
							"from VisitorRequest vr with (NOLOCK)\r\n" + 
							"join Visitdetails vd with (NOLOCK)\r\n" + 
							"on vr.RequestID = vd.RequestID\r\n" + 
							"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
							"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status = 'A' and \r\n" + 
							"CityId is not null and CountryId is not null) TLM\r\n" + 
							"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
							"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
							"on vr.Facility=b.CountryCityFacility\r\n" + 
							"where \r\n" + 
							"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
							"vr.requeststatus in ('In') and\r\n" + 
							"vd.BadgeStatus in ('Issued')\r\n" + 
							"and vr.LocationId is NULL\r\n" + 
							"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) as e\r\n" + 
							"where e.Country='India'\r\n" + 
							"and e.Date >= '2020-10-01' and e.Date <= '2020-10-30'\r\n" + 
							"and e.Purpose not in ('Client')\r\n" + 
							"--and e.City='Chennai'\r\n" + 
							"--and e.CountryCityFacility = 'IND-CHN-TCO'"
							;
					ResultSet res = stmt.executeQuery(query);
					while (res.next())
					{
//					add arrey list	
					System.out.println(res.getString(1));
					DB_ProjectID=res.getString(1);
//					DB_ProjectID.add(res.getString("")));
					}
					//Closing Connection
					tearDown();
					}
					catch(Exception e)
					{
					e.printStackTrace();
					System.out.println(e.getMessage());
					}
					return DB_ProjectID;
					}


					public void tearDown4() throws Exception 
					{
					// Close DB connection
					if (con != null) 
					{
					con.close();
					}
					}

					public void CompareYetToReturnBadgeValueAppwithDB() throws Exception 
					{
					String YetToReturnDB = get_DB_YetToReturnBadges();
					// enterprojectid_new(NBL_Projectid);
					System.out.println("Yet to Return Badge Data Base count is : "+YetToReturnDB);
					
					String YetToRetrnApp = driver.findElement(By.xpath("(//*[@class='pivotTableCellWrap cell-interactive tablixAlignRight '])[2]")).getText().trim();
					
					System.out.println("Yet to Return table Value : " + YetToRetrnApp);
					
					if(YetToRetrnApp.equalsIgnoreCase(YetToReturnDB)) {
						
						System.out.println("Yet to Return Badge Value displayed in Application and DB are Same");
						System.out.println("Yet to Return Badge Value displayed in Application as: "+ YetToRetrnApp);
						
						PASSreport("Yet to Return","Yet to Return Badge Value displayed in Application : " + YetToRetrnApp +"Yet to Return Badge Value displayed in DB : "+ YetToReturnDB);
					}
					else
					{
						System.out.println("Yet to Return Badge Value displayed in Application and DB are NOT Same : "+YetToRetrnApp);
						FAILreport("Yet to Return Badge","Yet to Return Badge Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+YetToRetrnApp+ "DB RB Count : "+ YetToReturnDB);
						
					}
					}
			
			
					public String get_DB_LOSTBadges() {
						try
						{
							
							
							
							String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
							String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
							String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
							String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");
							
							
						//Opening Connection
						setUp();
						String query = "select sum(Vstr_cnt) Vstr_cnt from (\r\n" + 
								"select count(distinct(vd.VisitDetailsID)) Vstr_cnt ,b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
								"from VisitorRequest vr with (NOLOCK)\r\n" + 
								"join Visitdetails vd with (NOLOCK)\r\n" + 
								"on vr.RequestID = vd.RequestID\r\n" + 
								"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
								"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status = 'A' and \r\n" + 
								"CityId is not null and CountryId is not null) TLM\r\n" + 
								"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
								"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
								"on vr.LocationId=b.LocationId\r\n" + 
								"where \r\n" + 
								"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
								"vr.requeststatus in ('In', 'Out')\r\n" + 
								"and vd.BadgeStatus = 'Lost'\r\n" + 
								"and vr.LocationId is NOT NULL\r\n" + 
								"and vr.RequestID not in (select distinct RequestID from ReissuedCardDetails)\r\n" + 
								"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
								"union all\r\n" + 
								"select count(distinct(vd.VisitDetailsID)) Vstr_cnt ,b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
								"from VisitorRequest vr with (NOLOCK)\r\n" + 
								"join Visitdetails vd with (NOLOCK)\r\n" + 
								"on vr.RequestID = vd.RequestID\r\n" + 
								"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
								"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status = 'A' and \r\n" + 
								"CityId is not null and CountryId is not null) TLM\r\n" + 
								"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
								"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
								"on vr.Facility=b.CountryCityFacility\r\n" + 
								"where \r\n" + 
								"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
								"vr.requeststatus in ('In', 'Out')\r\n" + 
								"and vd.BadgeStatus = 'Lost'\r\n" + 
								"and vr.LocationId is NULL\r\n" + 
								"and vr.RequestID not in (select distinct RequestID from ReissuedCardDetails)\r\n" + 
								"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
								"union all\r\n" + 
								"select (count(vr.requestid)+count(vd.VisitDetailsID)) Vstr_cnt ,b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
								"from VisitorRequest vr with (NOLOCK)\r\n" + 
								"join Visitdetails vd with (NOLOCK)\r\n" + 
								"on vr.RequestID = vd.RequestID\r\n" + 
								"join ReissuedCarddetails Rc with (NOLOCK)\r\n" + 
								"on rc.requestid= vr.requestid\r\n" + 
								"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
								"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status = 'A' and \r\n" + 
								"CityId is not null and CountryId is not null) TLM\r\n" + 
								"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
								"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
								"on vr.LocationId=b.LocationId\r\n" + 
								"where \r\n" + 
								"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
								"vr.requeststatus in ('In', 'Out')\r\n" + 
								"and vd.BadgeStatus = 'Lost'\r\n" + 
								"and vr.LocationId is NOT NULL\r\n" + 
								"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
								"union all\r\n" + 
								"select (count(vr.requestid)+count(vd.VisitDetailsID)) Vstr_cnt ,b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
								"from VisitorRequest vr with (NOLOCK)\r\n" + 
								"join Visitdetails vd with (NOLOCK)\r\n" + 
								"on vr.RequestID = vd.RequestID\r\n" + 
								"join ReissuedCarddetails Rc with (NOLOCK)\r\n" + 
								"on rc.requestid= vr.requestid\r\n" + 
								"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
								"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status = 'A' and \r\n" + 
								"CityId is not null and CountryId is not null) TLM\r\n" + 
								"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
								"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
								"on vr.Facility=b.CountryCityFacility\r\n" + 
								"where \r\n" + 
								"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
								"vr.requeststatus in ('In', 'Out')\r\n" + 
								"and vd.BadgeStatus = 'Lost'\r\n" + 
								"and vr.LocationId is NULL\r\n" + 
								"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
								") e\r\n" + 
								"where e.Country='India'\r\n" + 
								"and e.Date >= '2020-09-01' and e.Date <= '2020-09-30'\r\n" + 
								"and e.Purpose not in ('Client')\r\n" + 
								"--and e.City='Chennai'\r\n" + 
								"--and e.CountryCityFacility = 'IND-CHN-TCO'"
								;
						ResultSet res = stmt.executeQuery(query);
						while (res.next())
						{
//						add arrey list	
						System.out.println(res.getString(1));
						DB_ProjectID=res.getString(1);
//						DB_ProjectID.add(res.getString("")));
						}
						//Closing Connection
						tearDown();
						}
						catch(Exception e)
						{
						e.printStackTrace();
						System.out.println(e.getMessage());
						}
						return DB_ProjectID;
						}


						public void tearDown5() throws Exception 
						{
						// Close DB connection
						if (con != null) 
						{
						con.close();
						}
						}

						public void CompareLOSTBadgeValueAppwithDB() throws Exception 
						{
						String LostBadgeDB =get_DB_LOSTBadges();
						// enterprojectid_new(NBL_Projectid);
						System.out.println("Lost Badge Data Base count is : "+ LostBadgeDB);
						
						String LostBdgApp = driver.findElement(By.xpath("(//*[@class='pivotTableCellWrap cell-interactive tablixAlignRight '])[3]")).getText().trim();
						
						System.out.println("Lost table Value : " +LostBdgApp);
						
						if(LostBdgApp.equalsIgnoreCase(LostBadgeDB)) {
							
							System.out.println("Lost Badge Value displayed in Application and DB are Same");
							System.out.println("Lost Badge Value displayed in Application as: "+ LostBdgApp);
							
							PASSreport("Lost Badge","Lost Badge Value displayed in Application : " + LostBdgApp +"Lost Badge Value displayed in DB : "+ LostBadgeDB);
						}
						else
						{
							System.out.println("Lost Badge Value displayed in Application and DB are NOT Same : "+LostBdgApp);
							FAILreport("Lost Badge","Lost Badge Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+LostBdgApp	+ "DB RB Count : "+ LostBadgeDB);
							
						}
						}
						
						
						public String ExpectedPercentage = "";
						
						
						public String get_DB_GeneralVisitorPercentage() {
							try
							{
																
								
							//Opening Connection
							setUp();
							String query1 = "select sum(Vstr_cnt) Vstr_cnt  from (\r\n" + 
									"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
									"from VisitorRequest vr with (NOLOCK)\r\n" + 
									"join Visitdetails vd with (NOLOCK)\r\n" + 
									"on vr.RequestID = vd.RequestID\r\n" + 
									"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
									"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status='A' and\r\n" + 
									"CityId is not null and CountryId is not null) TLM\r\n" + 
									"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
									"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
									"on vr.LocationId=b.LocationId\r\n" + 
									"where \r\n" + 
									"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
									"vr.requeststatus in ('Out')\r\n" + 
									"and vr.LocationId is NOT NULL\r\n" + 
									"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
									"union All\r\n" + 
									"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
									"from VisitorRequest vr with (NOLOCK)\r\n" + 
									"join Visitdetails vd with (NOLOCK)\r\n" + 
									"on vr.RequestID = vd.RequestID\r\n" + 
									"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
									"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status='A' and\r\n" + 
									"CityId is not null and CountryId is not null) TLM\r\n" + 
									"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
									"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
									"on vr.Facility=b.CountryCityFacility\r\n" + 
									"where \r\n" + 
									"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
									"vr.requeststatus in ('Out')\r\n" + 
									"and vr.LocationId is NULL\r\n" + 
									"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) as e\r\n" + 
									"where e.Country='India'\r\n" + 
									"and e.City='Chennai'\r\n" + 
									"and e.CountryCityFacility = 'IND-CHN-TCO'\r\n" + 
									"and e.Date >= '2019-01-01' and e.Date <= '2020-08-31'\r\n" + 
									"and e.Purpose not in ('Client')\r\n" + 
									"--\r\n" ;
							
									String query2 = "select sum(Vstr_cnt) Vstr_cnt  from (\r\n" + 
									"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
									"from VisitorRequest vr with (NOLOCK)\r\n" + 
									"join Visitdetails vd with (NOLOCK)\r\n" + 
									"on vr.RequestID = vd.RequestID\r\n" + 
									"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
									"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status='A' and\r\n" + 
									"CityId is not null and CountryId is not null) TLM\r\n" + 
									"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
									"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
									"on vr.LocationId=b.LocationId\r\n" + 
									"where \r\n" + 
									"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
									"vr.requeststatus in ('In', 'Out')\r\n" + 
									"and vr.LocationId is NOT NULL\r\n" + 
									"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
									"union All\r\n" + 
									"select count(vd.VisitDetailsID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
									"from VisitorRequest vr with (NOLOCK)\r\n" + 
									"join Visitdetails vd with (NOLOCK)\r\n" + 
									"on vr.RequestID = vd.RequestID\r\n" + 
									"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
									"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status='A' and\r\n" + 
									"CityId is not null and CountryId is not null) TLM\r\n" + 
									"join [dbo].[CityMaster] CM with (NOLOCK)\r\n" + 
									"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
									"on vr.Facility=b.CountryCityFacility\r\n" + 
									"where \r\n" + 
									"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
									"vr.requeststatus in ('In','Out')\r\n" + 
									"and vr.LocationId is NULL\r\n" + 
									"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) as e\r\n" + 
									"where e.Country='India'\r\n" + 
									"and e.City='Chennai'\r\n" + 
									"and e.CountryCityFacility = 'IND-CHN-TCO'\r\n" + 
									"and e.Date >= '2019-01-01' and e.Date <= '2020-08-31'\r\n" + 
									"and e.Purpose not in ('Client')"
									;
							ResultSet res = stmt.executeQuery(query1);
							
							int PendingQnty = 0;
							int TotalQnty =0;
							while (res.next())
							{
							
//							add arrey list	
							System.out.println(res.getInt(1));
							PendingQnty=res.getInt(1);
							
							
//							DB_ProjectID.add(res.getString("")));
							}
							
							ResultSet res1 = stmt.executeQuery(query2);
							
							while (res1.next())
							{
//							add arrey list	
							System.out.println(res1.getInt(1));
							TotalQnty=res1.getInt(1);
							
							
//							DB_ProjectID.add(res.getString("")));
							}
							System.out.println("Pending quantity displayed as "+PendingQnty);
							System.out.println("Total quantity displayed as "+TotalQnty);
							Double percentage = Double.valueOf(PendingQnty)/ Double.valueOf(TotalQnty);
							percentage = percentage*100;
							System.out.println("Percentage value displayed in DB : " + Math.round(percentage));
							ExpectedPercentage = String.valueOf(Math.round(percentage));
							
							//Closing Connection
							tearDown();
							}
							catch(Exception e)
							{
							e.printStackTrace();
							System.out.println(e.getMessage());
							}
							return ExpectedPercentage;
							}


							public void tearDown6() throws Exception 
							{
							// Close DB connection
							if (con != null) 
							{
							con.close();
							}
							}

							public void CompareGeneralVisitorPercentageAppvaluewithDB() throws Exception 
							{
								
								Thread.sleep(20000);
								
								WebElement frame1 = driver.findElement(By.xpath("//*[@id='appFrame']")); 
								driver.switchTo().frame(frame1);
								System.out.println("Frame 1 switched successfully");
								
								WebElement frame2 = driver.findElement(By.xpath("//*[@id='embedContainer']/iframe"));
								driver.switchTo().frame(frame2);
								System.out.println("Frame 2 switched successfully");
								
								Thread.sleep(10000);	
								
							String ExpectedPercentage = get_DB_GeneralVisitorPercentage();
							// enterprojectid_new(NBL_Projectid);
							System.out.println("General Visitor percentage Data Base count is : "+ExpectedPercentage);
							
							String ActualPercentage = driver.findElement(By.xpath("(//*[@class='visual visual-card allow-deferred-rendering'])[6]")).getText().trim();
													
							System.out.println("Returned table Value : " + ActualPercentage.replace("%", ""));
							
							if(ActualPercentage.replace("%", "").equalsIgnoreCase(ExpectedPercentage)) {
								
								System.out.println("General Visitor percentage Value displayed in Application and DB are Same");
								System.out.println("General Visitor percentage Value displayed in Application as: "+ ActualPercentage);
								
								PASSreport("General Visitor percentage","General Visitor percentage Value displayed in Application : " + ActualPercentage +"General Visitor percentage Value displayed in DB : "+ ExpectedPercentage);
							}
							else
							{
								System.out.println("General Visitor percentage Value displayed in Application and DB are NOT Same : "+ ActualPercentage.replace("%", ""));
								FAILreport("General Visitor percentage","General Visitor percentage Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+ ActualPercentage + "DB RB Count : "+ ExpectedPercentage);
								
							}
							}
							
							
							public String get_DB_ClientVisitorPercentage() {
								try
								{
									
																		
								//Opening Connection
								setUp();
								String query1 = "select sum(Vstr_cnt) Vstr_cnt  from (\r\n" + 
										"select count(distinct(vr.RequestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vr.ToDate,vr.Purpose\r\n" + 
										"from VisitorRequest vr with (NOLOCK) \r\n" + 
										"join Visitdetails vd with (NOLOCK) \r\n" + 
										"on vr.RequestID = vd.RequestID\r\n" + 
										"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
										"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status='A' and\r\n" + 
										"CityId is not null and CountryId is not null) TLM\r\n" + 
										"join [dbo].[CityMaster] CM with (NOLOCK) \r\n" + 
										"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
										"on vr.LocationId=b.LocationId\r\n" + 
										"where \r\n" + 
										"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
										"vr.requeststatus in ('Out')\r\n" + 
										"and vr.LocationId is NOT NULL\r\n" + 
										"group by b.Country,b.City,b.CountryCityFacility,vr.toDate,vr.Purpose\r\n" + 
										"union All\r\n" + 
										"select count(distinct(vr.RequestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vr.todate,vr.Purpose\r\n" + 
										"from VisitorRequest vr with (NOLOCK) \r\n" + 
										"join Visitdetails vd with (NOLOCK) \r\n" + 
										"on vr.RequestID = vd.RequestID\r\n" + 
										"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
										"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status='A' and\r\n" + 
										"CityId is not null and CountryId is not null) TLM\r\n" + 
										"join [dbo].[CityMaster] CM with (NOLOCK) \r\n" + 
										"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
										"on vr.Facility=b.CountryCityFacility\r\n" + 
										"where \r\n" + 
										"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
										"vr.requeststatus in ('Out')\r\n" + 
										"and vr.LocationId is NULL\r\n" + 
										"group by b.Country,b.City,b.CountryCityFacility,vr.toDate,vr.Purpose) as e\r\n" + 
										"where e.Country='India'\r\n" + 
										"--and e.City='Chennai'\r\n" + 
										"--and e.CountryCityFacility = 'IND-CHN-TCO'\r\n" + 
										"and e.ToDate >= '2019-01-01' and e.ToDate <= '2020-08-31'\r\n" + 
										"and e.Purpose in ('Client')";
								
										String query2 = "select sum(Vstr_cnt) Vstr_cnt  from (\r\n" + 
												"select count(distinct(vr.RequestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vr.ToDate,vr.Purpose\r\n" + 
												"from VisitorRequest vr with (NOLOCK) \r\n" + 
												"join Visitdetails vd with (NOLOCK) \r\n" + 
												"on vr.RequestID = vd.RequestID\r\n" + 
												"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
												"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status='A' and\r\n" + 
												"CityId is not null and CountryId is not null) TLM\r\n" + 
												"join [dbo].[CityMaster] CM with (NOLOCK) \r\n" + 
												"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
												"on vr.LocationId=b.LocationId\r\n" + 
												"where \r\n" + 
												"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
												"vr.requeststatus in ('In','Out')\r\n" + 
												"and vr.LocationId is NOT NULL\r\n" + 
												"group by b.Country,b.City,b.CountryCityFacility,vr.toDate,vr.Purpose\r\n" + 
												"union All\r\n" + 
												"select count(distinct(vr.RequestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vr.todate,vr.Purpose\r\n" + 
												"from VisitorRequest vr with (NOLOCK) \r\n" + 
												"join Visitdetails vd with (NOLOCK) \r\n" + 
												"on vr.RequestID = vd.RequestID\r\n" + 
												"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
												"(select * from [dbo].[TblLocationMaster] with (NOLOCK) where status='A' and\r\n" + 
												"CityId is not null and CountryId is not null) TLM\r\n" + 
												"join [dbo].[CityMaster] CM with (NOLOCK) \r\n" + 
												"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
												"on vr.Facility=b.CountryCityFacility\r\n" + 
												"where \r\n" + 
												"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
												"vr.requeststatus in ('In','Out')\r\n" + 
												"and vr.LocationId is NULL\r\n" + 
												"group by b.Country,b.City,b.CountryCityFacility,vr.toDate,vr.Purpose) as e\r\n" + 
												"where e.Country='India'\r\n" + 
												"--and e.City='Chennai'\r\n" + 
												"--and e.CountryCityFacility = 'IND-CHN-TCO'\r\n" + 
												"and e.ToDate >= '2019-01-01' and e.ToDate <= '2020-08-31'\r\n" + 
												"and e.Purpose in ('Client')"
										;
								ResultSet res = stmt.executeQuery(query1);
								
								int PendingQnty = 0;
								int TotalQnty =0;
								while (res.next())
								{
								
//								add arrey list	
								System.out.println(res.getInt(1));
								PendingQnty=res.getInt(1);
								
								
//								DB_ProjectID.add(res.getString("")));
								}
								
								ResultSet res1 = stmt.executeQuery(query2);
								
								while (res1.next())
								{
//								add arrey list	
								System.out.println(res1.getInt(1));
								TotalQnty=res1.getInt(1);
								
								
//								DB_ProjectID.add(res.getString("")));
								}
								System.out.println("Pending quantity displayed as "+PendingQnty);
								System.out.println("Total quantity displayed as "+TotalQnty);
								Double percentage = Double.valueOf(PendingQnty)/ Double.valueOf(TotalQnty);
								percentage = percentage*100;
								System.out.println("Percentage value displayed in DB : " + Math.round(percentage));
								ExpectedPercentage = String.valueOf(Math.round(percentage));
								
								//Closing Connection
								tearDown();
								}
								catch(Exception e)
								{
								e.printStackTrace();
								System.out.println(e.getMessage());
								}
								return ExpectedPercentage;
								}


								public void tearDown7() throws Exception 
								{
								// Close DB connection
								if (con != null) 
								{
								con.close();
								}
								}

								public void CompareClientVisitorPercentageAppvaluewithDB() throws Exception 
								{
									
									Thread.sleep(20000);
									
									WebElement frame1 = driver.findElement(By.xpath("//*[@id='appFrame']")); 
									driver.switchTo().frame(frame1);
									System.out.println("Frame 1 switched successfully");
									
									WebElement frame2 = driver.findElement(By.xpath("//*[@id='embedContainer']/iframe"));
									driver.switchTo().frame(frame2);
									System.out.println("Frame 2 switched successfully");
									
									Thread.sleep(10000);	
									
								String ExpectedPercentage = get_DB_ClientVisitorPercentage();
								
								System.out.println("Client Visitor percentage Data Base count is : "+ExpectedPercentage);
								
								String ActualPercentage = driver.findElement(By.xpath("(//*[@class='visual visual-card allow-deferred-rendering'])[8]")).getText().trim();
														
								System.out.println("Returned table Value : " + ActualPercentage.replace("%", ""));
								
								if(ActualPercentage.replace("%", "").equalsIgnoreCase(ExpectedPercentage)) {
									
									System.out.println("Client Visitor percentage Value displayed in Application and DB are Same");
									System.out.println("Client Visitor percentage Value displayed in Application as: "+ ActualPercentage);
									
									PASSreport("Client Visitor percentage","Client Visitor percentage Value displayed in Application : " + ActualPercentage +"Client Visitor percentage Value displayed in DB : "+ ExpectedPercentage);
								}
								else
								{
									System.out.println("Client Visitor percentage Value displayed in Application and DB are NOT Same : "+ ActualPercentage.replace("%", ""));
									FAILreport("Client Visitor percentage","Client Visitor percentage Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+ ActualPercentage + "DB RB Count : "+ ExpectedPercentage);
									
								}
								}
								
								
								public String get_DB_Client_Yet_toNotify_Badges() {
									try
									{
										
										
										
								/*		String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
										String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
										String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
										String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");  */
										
										
									//Opening Connection
									setUp();
									String query = "select sum(isNULL(Vstr_cnt,0)) Vstr_cnt from (\r\n" + 
											"select count(distinct(vr.requestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
											"from VisitorRequest vr\r\n" + 
											"join Visitdetails vd \r\n" + 
											"on vr.RequestID = vd.RequestID\r\n" + 
											"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
											"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
											"CityId is not null and CountryId is not null) TLM\r\n" + 
											"join [dbo].[CityMaster] CM\r\n" + 
											"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
											"on vr.LocationId=b.LocationId\r\n" + 
											"inner join ClientRequestDetails crd\r\n" + 
											"on crd.RequestID=vr.RequestID\r\n" + 
											"where\r\n" + 
											"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
											"vr.requeststatus in ('Yet to arrive') and\r\n" + 
											"(vd.BadgeStatus is NULL or \r\n" + 
											"vd.BadgeStatus in ('Updated  VCard', 'Partially Updated VCard', 'Updated Access Card', 'Access Card Partially Updated','VCard Partially Updated'))\r\n" + 
											"and vr.LocationId is NOT NULL\r\n" + 
											"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
											"union all\r\n" + 
											"select count(distinct(vr.requestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
											"from VisitorRequest vr\r\n" + 
											"join Visitdetails vd \r\n" + 
											"on vr.RequestID = vd.RequestID\r\n" + 
											"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
											"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
											"CityId is not null and CountryId is not null) TLM\r\n" + 
											"join [dbo].[CityMaster] CM\r\n" + 
											"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
											"on vr.Facility=b.CountryCityFacility\r\n" + 
											"inner join ClientRequestDetails crd\r\n" + 
											"on crd.RequestID=vr.RequestID\r\n" + 
											"where\r\n" + 
											"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
											"vr.requeststatus in ('Yet to arrive') and\r\n" + 
											"(vd.BadgeStatus is NULL or \r\n" + 
											"vd.BadgeStatus in ('Updated  VCard', 'Partially Updated VCard', 'Updated Access Card', 'Access Card Partially Updated','VCard Partially Updated'))\r\n" + 
											"and vr.LocationId is NULL\r\n" + 
											"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) ee\r\n" + 
											"where ee.Date >= '2019-01-01' and ee.Date <= '2020-09-30'\r\n" + 
											"and ee.Purpose in ('Client')\r\n" + 
											"and ee.Country='India'"
											;
									ResultSet res = stmt.executeQuery(query);
									while (res.next())
									{
//									add arrey list	
									System.out.println(res.getString(1));
									DB_ProjectID=res.getString(1);
//									DB_ProjectID.add(res.getString("")));
									}
									//Closing Connection
									tearDown();
									}
									catch(Exception e)
									{
									e.printStackTrace();
									System.out.println(e.getMessage());
									}
									return DB_ProjectID;
									}


									public void tearDown10() throws Exception 
									{
									// Close DB connection
									if (con != null) 
									{
									con.close();
									}
									}

									public void Compare_Yet_to_Notify_BadgeValue_Displayed_in_Application_with_DB() throws Exception 
									{
									String YetToNotifyDB = get_DB_Client_Yet_toNotify_Badges();
									// enterprojectid_new(NBL_Projectid);
									System.out.println("Client Yet to Nofity Badge Data Base count is : "+ YetToNotifyDB);
									
									String YetToNotifyApp = driver.findElement(By.xpath("(//*[@class='pivotTableCellWrap cell-interactive tablixAlignRight '])[2]")).getText().trim();
									
									System.out.println("Stored Value : " + YetToNotifyApp);
									
									if(YetToNotifyApp.equalsIgnoreCase(YetToNotifyDB)) {
										
										System.out.println("Client Yet to Nofity Badge Value displayed in Application and DB are Same");
										System.out.println("Client Yet to Nofity Badge Value displayed in Application as: "+ YetToNotifyApp);
										
										PASSreport("Client Yet to Nofity Badge","Client Yet to Nofity Badge Value displayed in Application : " + YetToNotifyApp +"Client Yet to Nofity Badge Value displayed in DB : "+ YetToNotifyDB);
									}
									else
									{
										System.out.println("Client Yet to Nofity Badge Value displayed in Application and DB are NOT Same : "+ YetToNotifyApp);
										FAILreport("Client Yet to Nofity Badge","Client Yet to Nofity Badge Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+ YetToNotifyApp + "DB RB Count : "+ YetToNotifyDB);
										
									}
									}
									
									public void Clickon_ClientVisitor_BadgeSummary_Menu() throws Exception {
										try {
											
											Thread.sleep(20000);
											
											WebElement frame1 = driver.findElement(By.xpath("//*[@id='appFrame']")); 
											driver.switchTo().frame(frame1);
											System.out.println("Frame 1 switched successfully"); 
											
											WebElement frame2 = driver.findElement(By.xpath("//*[@id='embedContainer']/iframe[1]"));
											driver.switchTo().frame(frame2);
											System.out.println("Frame 2 switched successfully");  
												
											Thread.sleep(5000);
											
											Actions action = new Actions(driver);
											WebElement Badge = driver.findElement(By.xpath("//*[text()='BADGE SUMMARY - CLIENT VISITORS']"));
											action.moveToElement(Badge);
											action.build().perform(); 
											Badge.click();
											
											clickOnButton(btnClientBadgeSummary,"Client Badge Summary Menu Button");
											System.out.println("Client Badge Summary Menu Button button clicked successfully");
											PASSreport("Client Badge Summary Menu Button","Client Badge Summary Menu Button clicked successfully");
										}catch (Exception e) {
											System.out.println(e.getMessage());
											FAILreport("Client Badge Summary Menu Button","Client Badge Summary Menu Button is NOT clicked");
										}
									}
									
									
									public String get_DB_Client_Yet_toCollect_Badges() {
										try
										{
											
											
											
									/*		String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
											String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
											String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
											String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");  */
											
											
										//Opening Connection
										setUp();
										String query = "select sum(isNULL(Vstr_cnt,0)) Vstr_cnt from (\r\n" + 
												"select count(distinct(vr.requestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
												"from VisitorRequest vr\r\n" + 
												"join Visitdetails vd \r\n" + 
												"on vr.RequestID = vd.RequestID\r\n" + 
												"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
												"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
												"CityId is not null and CountryId is not null) TLM\r\n" + 
												"join [dbo].[CityMaster] CM\r\n" + 
												"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
												"on vr.LocationId=b.LocationId\r\n" + 
												"inner join ClientRequestDetails crd\r\n" + 
												"on crd.RequestID=vr.RequestID\r\n" + 
												"where \r\n" + 
												"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
												"vr.requeststatus in ('Yet to arrive') and\r\n" + 
												"vd.BadgeStatus = 'Host Notified'\r\n" + 
												"and vr.LocationId is NOT NULL\r\n" + 
												"and crd.ReissueStatus is NULL\r\n" + 
												"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
												"union all\r\n" + 
												"select count(distinct(vr.requestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
												"from VisitorRequest vr\r\n" + 
												"join Visitdetails vd \r\n" + 
												"on vr.RequestID = vd.RequestID\r\n" + 
												"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
												"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
												"CityId is not null and CountryId is not null) TLM\r\n" + 
												"join [dbo].[CityMaster] CM\r\n" + 
												"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
												"on vr.Facility=b.CountryCityFacility\r\n" + 
												"inner join ClientRequestDetails crd\r\n" + 
												"on crd.RequestID=vr.RequestID\r\n" + 
												"where\r\n" + 
												"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
												"vr.requeststatus in ('Yet to arrive') and\r\n" + 
												"vd.BadgeStatus = 'Host Notified'\r\n" + 
												"and vr.LocationId is NULL\r\n" + 
												"and crd.ReissueStatus is NULL\r\n" + 
												"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) ee\r\n" + 
												"where ee.Date >= '2019-01-01' and ee.Date <= '2020-09-30'\r\n" + 
												"and ee.Purpose in ('Client')\r\n" + 
												"and ee.Country='India'"
												;
										ResultSet res = stmt.executeQuery(query);
										while (res.next())
										{
//										add arrey list	
										System.out.println(res.getString(1));
										DB_ProjectID=res.getString(1);
//										DB_ProjectID.add(res.getString("")));
										}
										//Closing Connection
										tearDown();
										}
										catch(Exception e)
										{
										e.printStackTrace();
										System.out.println(e.getMessage());
										}
										return DB_ProjectID;
										}


										public void tearDown11() throws Exception 
										{
										// Close DB connection
										if (con != null) 
										{
										con.close();
										}
										}

										public void Compare_Yet_to_Collect_BadgeValue_Displayed_in_Application_with_DB() throws Exception 
										{
										String YetToCollectDB = get_DB_Client_Yet_toCollect_Badges();
										// enterprojectid_new(NBL_Projectid);
										System.out.println("Client Yet to Collect Badge Data Base count is : "+ YetToCollectDB);
										
										String YetToCollectApp = driver.findElement(By.xpath("(//*[@class='pivotTableCellWrap cell-interactive tablixAlignRight '])[2]")).getText().trim();
										
										System.out.println("Stored Value : " + YetToCollectApp);
										
										if(YetToCollectApp.equalsIgnoreCase(YetToCollectDB)) {
											
											System.out.println("Client Yet to Collect Badge Value displayed in Application and DB are Same");
											System.out.println("Client Yet to Collect Badge Value displayed in Application as: "+ YetToCollectApp);
											
											PASSreport("Client Yet to Collect Badge","Client Yet to Collect Badge Value displayed in Application : " + YetToCollectApp +"Client Yet to Collect Badge Value displayed in DB : "+ YetToCollectDB);
										}
										else
										{
											System.out.println("Client Yet to Collect Badge Value displayed in Application and DB are NOT Same : "+ YetToCollectApp);
											FAILreport("Client Yet to collect Badge","Client Yet to collect Badge Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+ YetToCollectApp + "DB RB Count : "+ YetToCollectDB);
											
										}
										}
										
										public String get_DB_Client_Dispatched_Badges() {
											try
											{
												
												
												
										/*		String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
												String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
												String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
												String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");  */
												
												
											//Opening Connection
											setUp();
											String query = "select isNULL(sum(isNULL(Vstr_cnt,0)),0) Vstr_cnt from (\r\n" + 
													"select distinct(vr.requestID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
													"from VisitorRequest vr\r\n" + 
													"join Visitdetails vd \r\n" + 
													"on vr.RequestID = vd.RequestID\r\n" + 
													"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
													"(select * from [dbo].[TblLocationMaster] where --status = 'A' and \r\n" + 
													"CityId is not null and CountryId is not null) TLM\r\n" + 
													"join [dbo].[CityMaster] CM\r\n" + 
													"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
													"on vr.LocationId=b.LocationId\r\n" + 
													"inner join ClientRequestDetails crd\r\n" + 
													"on crd.RequestID=vr.RequestID\r\n" + 
													"where \r\n" + 
													"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
													"vr.Requeststatus in ('In') and\r\n" + 
													"vd.Badgestatus = 'Issued' \r\n" + 
													"and vr.LocationId is NOT NULL\r\n" + 
													"and vr.todate>= GETDATE()\r\n" + 
													"union all\r\n" + 
													"select distinct(vr.requestID) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
													"from VisitorRequest vr\r\n" + 
													"join Visitdetails vd \r\n" + 
													"on vr.RequestID = vd.RequestID\r\n" + 
													"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
													"(select * from [dbo].[TblLocationMaster] where --status = 'A' and \r\n" + 
													"CityId is not null and CountryId is not null) TLM\r\n" + 
													"join [dbo].[CityMaster] CM\r\n" + 
													"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
													"on vr.Facility=b.CountryCityFacility\r\n" + 
													"inner join ClientRequestDetails crd\r\n" + 
													"on crd.RequestID=vr.RequestID\r\n" + 
													"where\r\n" + 
													"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
													"vr.Requeststatus in ('In') and\r\n" + 
													"vd.Badgestatus = 'Issued' \r\n" + 
													"and vr.LocationId is NULL\r\n" + 
													"and vr.todate>= GETDATE()\r\n" + 
													") ee\r\n" + 
													"where ee.Date >= '2019-01-01' and ee.Date <= '2020-09-30'\r\n" + 
													"and ee.Purpose in ('Client')\r\n" + 
													"and ee.Country='India'"
													;
											ResultSet res = stmt.executeQuery(query);
											while (res.next())
											{
//											add arrey list	
											System.out.println(res.getString(1));
											DB_ProjectID=res.getString(1);
//											DB_ProjectID.add(res.getString("")));
											}
											//Closing Connection
											tearDown();
											}
											catch(Exception e)
											{
											e.printStackTrace();
											System.out.println(e.getMessage());
											}
											return DB_ProjectID;
											}


											public void tearDown12() throws Exception 
											{
											// Close DB connection
											if (con != null) 
											{
											con.close();
											}
											}

											public void Compare_Dispatched_BadgeValue_Displayed_in_Application_with_DB() throws Exception 
											{
											String YetToCollectDB = get_DB_Client_Dispatched_Badges();
											// enterprojectid_new(NBL_Projectid);
											System.out.println("Client Dispatched Badge Data Base count is : "+ YetToCollectDB);
											
											String YetToCollectApp = driver.findElement(By.xpath("(//*[@class='pivotTableCellWrap cell-interactive tablixAlignRight '])[3]")).getText().trim();
											
											System.out.println("Stored Value : " + YetToCollectApp);
											
											if(YetToCollectApp.equalsIgnoreCase(YetToCollectDB)) {
												
												System.out.println("Client Dispatched Badge Value displayed in Application and DB are Same");
												System.out.println("Client Dispatched Badge Value displayed in Application as: "+ YetToCollectApp);
												
												PASSreport("Client Dispatched Badge","Client Dispatched Badge Value displayed in Application : " + YetToCollectApp +"Client Dispatched Badge Value displayed in DB : "+ YetToCollectDB);
											}
											else
											{
												System.out.println("Client Dispatched Badge Value displayed in Application and DB are NOT Same : "+ YetToCollectApp);
												FAILreport("Client Dispatched Badge","Client Yet to collect Badge Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+ YetToCollectApp + "DB RB Count : "+ YetToCollectDB);
												
											}
											}
											
											
											public String get_DB_Client_Returned_Badges() {
												try
												{
													
													
													
											/*		String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
													String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
													String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
													String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");  */
													
													
												//Opening Connection
												setUp();
												String query = "select sum(isNULL(Vstr_cnt,0)) Vstr_cnt from (\r\n" + 
														"select count(distinct(vr.requestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
														"from VisitorRequest vr\r\n" + 
														"join Visitdetails vd \r\n" + 
														"on vr.RequestID = vd.RequestID\r\n" + 
														"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
														"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
														"CityId is not null and CountryId is not null) TLM\r\n" + 
														"join [dbo].[CityMaster] CM\r\n" + 
														"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
														"on vr.LocationId=b.LocationId\r\n" + 
														"join ClientRequestDetails crd\r\n" + 
														"on crd.RequestID=vr.RequestID\r\n" + 
														"where \r\n" + 
														"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
														"vr.Requeststatus in ('Out') and\r\n" + 
														"vd.Badgestatus = 'Returned' \r\n" + 
														"and vr.LocationId is NOT NULL\r\n" + 
														"and crd.ReissueStatus is NULL\r\n" + 
														"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
														"union all\r\n" + 
														"select count(distinct(vr.requestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
														"from VisitorRequest vr\r\n" + 
														"join Visitdetails vd \r\n" + 
														"on vr.RequestID = vd.RequestID\r\n" + 
														"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
														"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
														"CityId is not null and CountryId is not null) TLM\r\n" + 
														"join [dbo].[CityMaster] CM\r\n" + 
														"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
														"on vr.Facility=b.CountryCityFacility\r\n" + 
														"join ClientRequestDetails crd\r\n" + 
														"on crd.RequestID=vr.RequestID\r\n" + 
														"where \r\n" + 
														"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
														"vr.Requeststatus in ('Out') and\r\n" + 
														"vd.Badgestatus = 'Returned' \r\n" + 
														"and vr.LocationId is NULL\r\n" + 
														"and crd.ReissueStatus is NULL\r\n" + 
														"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose) ee\r\n" + 
														"where ee.Date >= '2019-01-01' and ee.Date <= '2020-09-30'\r\n" + 
														"and ee.Purpose in ('Client')\r\n" + 
														"and ee.Country='India'"
														;
												ResultSet res = stmt.executeQuery(query);
												while (res.next())
												{
//												add arrey list	
												System.out.println(res.getString(1));
												DB_ProjectID=res.getString(1);
//												DB_ProjectID.add(res.getString("")));
												}
												//Closing Connection
												tearDown();
												}
												catch(Exception e)
												{
												e.printStackTrace();
												System.out.println(e.getMessage());
												}
												return DB_ProjectID;
												}


												public void tearDown13() throws Exception 
												{
												// Close DB connection
												if (con != null) 
												{
												con.close();
												}
												}

												public void Compare_Returned_Client_BadgeValue_Displayed_in_Application_with_DB() throws Exception 
												{
												String CliReturnDB = get_DB_Client_Returned_Badges();
												// enterprojectid_new(NBL_Projectid);
												System.out.println("Client Returned Badge Data Base count is : "+ CliReturnDB);
												
												String CliReturnApp = driver.findElement(By.xpath("(//*[@class='pivotTableCellWrap cell-interactive tablixAlignRight '])[4]")).getText().trim();
												
												System.out.println("Stored Value : " + CliReturnApp);
												
												if(CliReturnApp.equalsIgnoreCase(CliReturnDB)) {
													
													System.out.println("Client Returned Badge Value displayed in Application and DB are Same");
													System.out.println("Client Returned Badge Value displayed in Application as: "+ CliReturnApp);
													
													PASSreport("Client Returned Badge","Client Returned Badge Value displayed in Application : " + CliReturnApp +"Client Returned Badge Value displayed in DB : "+ CliReturnDB);
												}
												else
												{
													System.out.println("Client Returned Badge Value displayed in Application and DB are NOT Same : "+ CliReturnApp);
													FAILreport("Client Returned Badge","Client Returned Badge Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+ CliReturnApp + "DB RB Count : "+ CliReturnDB);
													
												}
												}
												
												
												public String get_DB_Client_Yetto_Return_Badges() {
													try
													{
														
														
														
												/*		String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
														String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
														String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
														String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");  */
														
														
													//Opening Connection
													setUp();
													String query = "select sum(isNULL(Vstr_cnt,0)) Vstr_cnt from (\r\n" + 
															"select count(distinct(vr.requestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
															"from VisitorRequest vr\r\n" + 
															"join Visitdetails vd \r\n" + 
															"on vr.RequestID = vd.RequestID\r\n" + 
															"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
															"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
															"CityId is not null and CountryId is not null) TLM\r\n" + 
															"join [dbo].[CityMaster] CM\r\n" + 
															"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
															"on vr.LocationId=b.LocationId\r\n" + 
															"join ClientRequestDetails crd\r\n" + 
															"on crd.RequestID=vr.RequestID\r\n" + 
															"where \r\n" + 
															"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
															"vr.Requeststatus in ('In') and\r\n" + 
															"vd.Badgestatus = 'Issued' \r\n" + 
															"and vr.LocationId is NOT NULL\r\n" + 
															"and vr.todate< GETDATE()\r\n" + 
															"and crd.ReissueStatus is NULL\r\n" + 
															"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
															"union all\r\n" + 
															"select count(distinct(vr.requestID)) Vstr_cnt, b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
															"from VisitorRequest vr\r\n" + 
															"join Visitdetails vd \r\n" + 
															"on vr.RequestID = vd.RequestID\r\n" + 
															"left join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
															"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
															"CityId is not null and CountryId is not null) TLM\r\n" + 
															"join [dbo].[CityMaster] CM\r\n" + 
															"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
															"on vr.Facility=b.CountryCityFacility\r\n" + 
															"join ClientRequestDetails crd\r\n" + 
															"on crd.RequestID=vr.RequestID\r\n" + 
															"where \r\n" + 
															"convert(date,vr.RequestedDate)>='2019-01-01' and\r\n" + 
															"vr.Requeststatus in ('In') and\r\n" + 
															"vd.Badgestatus = 'Issued' \r\n" + 
															"and vr.LocationId is NULL\r\n" + 
															"and vr.todate< GETDATE()\r\n" + 
															"and crd.ReissueStatus is NULL\r\n" + 
															"group by b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose\r\n" + 
															")ee\r\n" + 
															"where ee.Date >= '2019-01-01' and ee.Date <= '2020-09-30'\r\n" + 
															"and ee.Purpose in ('Client')\r\n" + 
															"and ee.Country='India'"
															;
													ResultSet res = stmt.executeQuery(query);
													while (res.next())
													{
//													add arrey list	
													System.out.println(res.getString(1));
													DB_ProjectID=res.getString(1);
//													DB_ProjectID.add(res.getString("")));
													}
													//Closing Connection
													tearDown();
													}
													catch(Exception e)
													{
													e.printStackTrace();
													System.out.println(e.getMessage());
													}
													return DB_ProjectID;
													}


													public void tearDown14() throws Exception 
													{
													// Close DB connection
													if (con != null) 
													{
													con.close();
													}
													}

													public void Compare_Yetto_Return_Client_BadgeValue_Displayed_in_Application_with_DB() throws Exception 
													{
													String CLYet2ReturnDB = get_DB_Client_Yetto_Return_Badges();
													// enterprojectid_new(NBL_Projectid);
													System.out.println("Client Yet to Return Badge Data Base count is : "+ CLYet2ReturnDB);
													
													String CLYet2ReturnApp = driver.findElement(By.xpath("(//*[@class='pivotTableCellWrap cell-interactive tablixAlignRight '])[5]")).getText().trim();
													
													System.out.println("Stored Value : " + CLYet2ReturnApp);
													
													if(CLYet2ReturnApp.equalsIgnoreCase(CLYet2ReturnDB)) {
														
														System.out.println("Client Yet to Return Badge Value displayed in Application and DB are Same");
														System.out.println("Client Yet to Return Badge Value displayed in Application as: "+ CLYet2ReturnApp);
														
														PASSreport("Client Yet to Return Badge","Client Yet to Return Badge Value displayed in Application : " + CLYet2ReturnApp +"Client Yet to Return Badge Value displayed in DB : "+ CLYet2ReturnDB);
													}
													else
													{
														System.out.println("Client Yet to Return Badge Value displayed in Application and DB are NOT Same : "+ CLYet2ReturnApp);
														FAILreport("Client Yet to Return Badge","Client Yet to Return Badge Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+ CLYet2ReturnApp + "DB RB Count : "+ CLYet2ReturnDB);
														
													}
													}
													
													
													public String get_DB_Client_Lost_Damage_Badges() {
														try
														{
															
															
															
													/*		String SearchCity = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "CityName");
															String Facilty = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "Facility");
															String FrmDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "From_Date");
															String ToDate = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , "To_Date");  */
															
															
														//Opening Connection
														setUp();
														String query = "select COUNT(RequestID) Vstr_cnt from (\r\n" + 
																"select src.RequestID,Country,City,CountryCityFacility,Date,Purpose,BadgeStatus from (\r\n" + 
																"SELECT distinct vr.RequestID,b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose,vd.BadgeStatus\r\n" + 
																"FROM dbo.VisitorRequest vr\r\n" + 
																"left join dbo.VisitDetails vd on vr.RequestID=vd.RequestID\r\n" + 
																"left outer join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
																"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
																"CityId is not null and CountryId is not null) TLM\r\n" + 
																"join [dbo].[CityMaster] CM\r\n" + 
																"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
																"on vr.LocationId=b.LocationId and vr.LocationId is not null\r\n" + 
																"where convert(date,vr.RequestedDate)>='2019-01-01' \r\n" + 
																"and vr.RequestStatus in ('In','Out')\r\n" + 
																"union all\r\n" + 
																"SELECT distinct vr.RequestID,b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose,vd.BadgeStatus\r\n" + 
																"FROM dbo.VisitorRequest vr\r\n" + 
																"left join dbo.VisitDetails vd on vr.RequestID=vd.RequestID\r\n" + 
																"left outer join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
																"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
																"CityId is not null and CountryId is not null) TLM\r\n" + 
																"join [dbo].[CityMaster] CM\r\n" + 
																"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
																"on vr.facility=b.countrycityfacility and vr.facility is not null and vr.LocationId is null\r\n" + 
																"where convert(date,vr.RequestedDate)>='2019-01-01'\r\n" + 
																"and vr.RequestStatus in ('In','Out')\r\n" + 
																")src\r\n" + 
																"left outer join \r\n" + 
																"(select distinct ClientRequestDetailID,ReissueStatus,Requestid from dbo.ClientRequestDetails)crd on crd.RequestID=src.RequestID\r\n" + 
																"where crd.ReissueStatus is not null and BadgeStatus in ('issued','Lost','Returnd','Returned') \r\n" + 
																"and crd.ReissueStatus in ('Access card not working and Reissued','Lost and Reissued')\r\n" + 
																"UNION ALL\r\n" + 
																"select src.RequestID,Country,City,CountryCityFacility,Date,Purpose,BadgeStatus from (\r\n" + 
																"SELECT distinct vr.RequestID,b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose,vd.BadgeStatus\r\n" + 
																"FROM dbo.VisitorRequest vr\r\n" + 
																"left join dbo.VisitDetails vd on vr.RequestID=vd.RequestID\r\n" + 
																"left outer join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
																"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
																"CityId is not null and CountryId is not null) TLM\r\n" + 
																"join [dbo].[CityMaster] CM\r\n" + 
																"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
																"on vr.LocationId=b.LocationId and vr.LocationId is not null\r\n" + 
																"where convert(date,vr.RequestedDate)>='2019-01-01'\r\n" + 
																"and vr.RequestStatus in ('In','Out')\r\n" + 
																"union all\r\n" + 
																"SELECT distinct vr.RequestID,b.Country,b.City,b.CountryCityFacility,vd.Date,vr.Purpose,vd.BadgeStatus\r\n" + 
																"FROM dbo.VisitorRequest vr\r\n" + 
																"left join dbo.VisitDetails vd on vr.RequestID=vd.RequestID\r\n" + 
																"left outer join (select CountryCityFacility,LocationId, LocationName,city,Country from \r\n" + 
																"(select * from [dbo].[TblLocationMaster] where status = 'A' and \r\n" + 
																"CityId is not null and CountryId is not null) TLM\r\n" + 
																"join [dbo].[CityMaster] CM\r\n" + 
																"on TLM.CountryId = CM.CountryId and TLM.CityId=CM.CityId) b\r\n" + 
																"on vr.facility=b.countrycityfacility and vr.facility is not null and vr.LocationId is null\r\n" + 
																"where convert(date,vr.RequestedDate)>='2019-01-01'\r\n" + 
																"and vr.RequestStatus in ('In','Out')\r\n" + 
																")src\r\n" + 
																"left outer join \r\n" + 
																"(select distinct ClientRequestDetailID,ReissueStatus,Requestid from dbo.ClientRequestDetails)crd on crd.RequestID=src.RequestID\r\n" + 
																"where crd.ReissueStatus is null and BadgeStatus in ('Lost') \r\n" + 
																") ee\r\n" + 
																"where ee.Date >= '2019-01-01' and ee.Date <= '2020-09-30'\r\n" + 
																"and ee.Purpose in ('Client')\r\n" + 
																"and ee.Country='India'"
																;
														ResultSet res = stmt.executeQuery(query);
														while (res.next())
														{
//														add arrey list	
														System.out.println(res.getString(1));
														DB_ProjectID=res.getString(1);
//														DB_ProjectID.add(res.getString("")));
														}
														//Closing Connection
														tearDown();
														}
														catch(Exception e)
														{
														e.printStackTrace();
														System.out.println(e.getMessage());
														}
														return DB_ProjectID;
														}


														public void tearDown15() throws Exception 
														{
														// Close DB connection
														if (con != null) 
														{
														con.close();
														}
														}

														public void Compare_Lost_or_Damage_Client_BadgeValue_Displayed_in_Application_with_DB() throws Exception 
														{
														String ClientLostDB = get_DB_Client_Lost_Damage_Badges();
														// enterprojectid_new(NBL_Projectid);
														System.out.println("Client Lost/Damage Badge Data Base count is : "+ ClientLostDB);
														
														String ClientLostApp = driver.findElement(By.xpath("(//*[@class='pivotTableCellWrap cell-interactive tablixAlignRight '])[6]")).getText().trim();
														
														System.out.println("Stored Value : " + ClientLostApp);
														
														if(ClientLostApp.equalsIgnoreCase(ClientLostDB)) {
															
															System.out.println("Client Lost/Damage Badge Value displayed in Application and DB are Same");
															System.out.println("Client Lost/Damage Badge Value displayed in Application as: "+ ClientLostApp);
															
															PASSreport("Client Lost/Damage Badge","Client Lost/Damage Badge Value displayed in Application : " + ClientLostApp +"Client Lost/Damage Badge Value displayed in DB : "+ ClientLostDB);
														}
														else
														{
															System.out.println("Client Lost/Damage Badge Value displayed in Application and DB are NOT Same : "+ ClientLostApp);
															FAILreport("Client Lost/Damage Badge","Client Lost/Damage Badge Value displayed in Application and DB are NOT Same" + "Appliction RB Count : "+ ClientLostApp + "DB RB Count : "+ ClientLostDB);
															
														}
														}
														
		
							
}
