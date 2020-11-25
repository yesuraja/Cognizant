package com.test.qa.stepDefinition;

import com.test.qa.pageFactory.Sprint_2_P1_PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sprint2_StepDefinition {
	Sprint_2_P1_PageFactory sprint2 = new Sprint_2_P1_PageFactory();
	
	@When("^: Login With Manager ID \"([^\"]*)\"$")
	public void login_With_Manager_ID(String manager_type) throws Throwable 
	{
		sprint2.Login_with_manager_id(manager_type);
	    
	}

	@Then("^:  User should select \\(MTM or BFD or BTB or NBL\\) Project \"([^\"]*)\"$")
	public void user_should_select_MTM_or_BFD_or_BTB_or_NBL_Project(String project_type) throws Throwable 
	{
		sprint2.enterprojectid(project_type);    
	}

	@Then("^: Select the required Demand from Opportunity grid \\(If applicable\\)$")
	public void select_the_required_Demand_from_Opportunity_grid_If_applicable() throws Throwable 
	{
	    
	}

	@Then("^: Select requirement type \"([^\"]*)\"$")
	public void select_requirement_type(String req_type) throws Throwable 
	{
	  sprint2.select_requirementtype(req_type);  
	    
	}

	@Then("^: Select resource identified as Yes$")
	public void select_resource_identified_as_Yes() throws Throwable 
	{    
		
	}

	@Then("^: Click on Proceed to create button$")
	public void click_on_Proceed_to_create_button() throws Throwable {
	    
	    
	}

	@Then("^select a associate and enter details$")
	public void select_a_associate_and_enter_details() throws Throwable {
	    
	    
	}

	@Then("^click on Backfill lookup and Select Attrition as Backfill Type and Click search$")
	public void click_on_Backfill_lookup_and_Select_Attrition_as_Backfill_Type_and_Click_search() throws Throwable {
	    
	    
	}

	@Then("^validate the listed associate are displayed as per the expected Attrition Criteria by comparing with DB\\.\"$")
	public void validate_the_listed_associate_are_displayed_as_per_the_expected_Attrition_Criteria_by_comparing_with_DB() throws Throwable {
	    
	    
	}

}
