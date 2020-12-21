package com.test.qa.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.test.qa.libraries.FunctionalLibrary;
import com.test.qa.utilities.ExtentReportManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//features ="src//main//resources//com.test.qa.features//Sprint 1//Sprint 1.feature",
		features ="src/main/resources/com.test.qa.features/RegressionSuit/Sprint1.feature",
	glue = "com.test.qa.stepDefinition"
	,tags={"@PS_RegTC04"}
	,dryRun=false,
	monochrome=true
	) 
 
public class TestRunner {
	
	@AfterClass()	public static void tearReport() throws Exception {
		ExtentReportManager extentreportmanager = new ExtentReportManager();
		FunctionalLibrary libs = new FunctionalLibrary();
		extentreportmanager.tearReport();
	//	libs.quitDriver();		

	}

	
}
