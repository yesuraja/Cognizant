package com.test.qa.utilities;

import java.io.File;
import java.util.*;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;
import com.test.qa.globalVariables.GlobalVariables;
import com.test.qa.libraries.FunctionalLibrary;

public class DriverManager extends FunctionalLibrary{
	

	
// **********************************************************************************************************************************************************
	
	/**
	 * @author So-Redesign
	 * 
	 * @param ApplicationURL
	 * @throws Exception
	 */

	public void getDriver() throws Exception {
		
		applicationURL = getProperty("URL");//Uncomment it  when execute your script
		//applicationURL = System.getProperty("user.dir") +"\\Application\\Registration_form.html");//comment it  when execute your script
		applicationName = getProperty("ApplicationName");
		BrowserName = getProperty("BROWSER");
		

		File reportDirectory = new File(
				System.getProperty("user.dir") + "\\Reports\\" + applicationName + "\\" + dateStamp());
		reportDirectory.mkdirs();
		
		ScreenshotFolderPath = System.getProperty("user.dir") + "\\Reports\\" + applicationName + "\\" + dateStamp()
				+ "\\Screenshots\\";
		File Screenpathdir = new File(ScreenshotFolderPath);
		Screenpathdir.mkdirs();
		
		
		browserOpen();
		driver.get(applicationURL);
	}

// **********************************************************************************************************************************************************
	/**
	 * @author So-Redesign
	 * 	 
	 *         This method set the properties for the browser based on the selection
	 *         of the browser
	 * 
	 * @return
	 * @throws Exception
	 */
	
	public WebDriver browserOpen() throws Exception {
		if(BrowserName==null || BrowserName=="")
		{
			/****Setting Chrome as default browser****/
			BrowserName="CHROME";
		}
		switch (BrowserName) {
		case "EDGE":
		
			System.setProperty("webdriver.edge.driver", getProperty("IE_BROWSER_PATH"));
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;

		case "FIREFOX":

			System.setProperty("webdriver.gecko.driver", getProperty("Firefox_BROWSER_PATH"));
			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
			break;

		case "CHROME":
			System.setProperty("webdriver.chrome.driver", getProperty("CHROME_BROWSER_PATH"));

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("debuggerAddress", "localhost:5656");
		    driver = new ChromeDriver(options);
			
//			options.addArguments("test-type");
//			options.addArguments("start-maximized");
//			options.addArguments("--disable-extensions");
//			options.addArguments("--disable-infobars");
//			options.addArguments("--enable-precise-memory-info");
//			options.addArguments("--disable-popup-blocking");
//			Map<String, Object> prefs = new HashMap<String, Object>();
//			prefs.put("credentials_enable_service", false);
//			prefs.put("profile.password_manager_enabled", false);
//			options.setExperimentalOption("prefs", prefs);
//			DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
//			chromeCapabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
//			chromeCapabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
//			chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
//			chromeCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
//					UnexpectedAlertBehaviour.ACCEPT);
//			System.out.println(chromeCapabilities.getVersion());
//			Runtime.getRuntime().exec("TASKKILL /IM chrome.exe /F"); 
//			Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f "); 
			

			//driver.manage().window().maximize();
			break;
			
		default:
			System.out.println("The executables for drivers is not available in the path");
		}
		return driver;
	}


}
