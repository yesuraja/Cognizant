package com.test.qa.stepDefinition;

import java.sql.DriverManager;

import com.test.qa.libraries.FunctionalLibrary;

import cucumber.api.java.en.Given;

public class Sprint1StepDef extends FunctionalLibrary {
	

@Given("^launch url$")
public void launch_url() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	drivermanager.getDriver();
}


}
