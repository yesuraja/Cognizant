package com.test.qa.stepDefinition;

import org.junit.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.test.qa.libraries.FunctionalLibrary;
import com.test.qa.pageFactory.LaunchPageFactory;
import com.test.qa.utilities.DriverManager;

import cucumber.api.java.en.Given;

public class LaunchStepDefinition extends LaunchPageFactory {
	
	@Given("^: Launch the application URL with the sheet \"([^\"]*)\" and testcase to be executed is \"([^\"]*)\" with given scenario \"([^\"]*)\"$")
	public void launch_the_application_URL_with_the_sheet_and_testcase_to_be_executed_is_with_given_scenario(String sheetName, String testCaseName, String TestCaseDescription) throws Throwable 
	{	
		extentreportmanager.invokeReport(testCaseName);
		extentreportmanager.componenttHeading(TestCaseDescription);
		try {

			drivermanager.getDriver();

			if(getProperty("GET_DATA_FROM_EXCEL").equalsIgnoreCase("True")&& getProperty("GET_DATA_FROM_EXCEL")!="")
			{
				getTestCaseName(sheetName, testCaseName);	
			}
			else
			{
				System.out.println("Executing :"+testCaseName);
			}
		} catch (Exception e) {
			catch_code(e, "Launching Driver", "Launching driver and URL having Some problem");
			Assert.fail(e.getMessage());
			extentreportmanager.tearReport();
		}
	}
}
