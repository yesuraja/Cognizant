package com.test.qa.globalVariables;

import java.text.SimpleDateFormat;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.test.qa.utilities.DriverManager;
import com.test.qa.utilities.ExcelUtil;
import com.test.qa.utilities.ExtentReportManager;
import com.test.qa.utilities.Screenshot;

public class GlobalVariables {
	
public static WebDriver driver;
public static DesiredCapabilities capabilities;

public static SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/YYYY");
public static String applicationName=null;
public static String BrowserName="";
public static String ScreenshotFolderPath,ScreenshotFilePath;

public static Screenshot Screenshot=new Screenshot();
public static ExcelUtil excelUtil = new ExcelUtil();
public static ExtentReportManager extentreportmanager = new ExtentReportManager();
public static DriverManager drivermanager = new DriverManager();
public JavascriptExecutor js = (JavascriptExecutor) driver;

public static boolean executionStatus=true;
public static int waitCount=0;
public static String runClassName=null;
public static int pageCount=0;
public static String applicationURL=null;


public static ExtentReports report;
public static ExtentTest test;

protected String fieldValue = null;

public static int testcase_rowNumber;
public static String testcase_sheetName;

public static int ProjectID;
public String RowNumber="";

public static String DBUserName = "OneC_VMS";
public static String DBPassword = "VMS_S111111#";

}


