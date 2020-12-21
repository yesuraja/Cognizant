package com.test.qa.stepDefinition;

import com.test.qa.pageFactory.Physical_Security_Dashboard;
import com.test.qa.pageFactory.Raja_Sprint2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PhysicalSecurity_StepDefinition {
	
	Physical_Security_Dashboard Regsuit1 = new Physical_Security_Dashboard();
	Raja_Sprint2 Assign = new Raja_Sprint2();
	
	@When("^: Enter \"([^\"]*)\" in OneC App Search Field$")
	public void enter_in_OneC_App_Search_Field(String App_Name) throws Throwable {
		Regsuit1.EnterAppNameandClickonSearchButton (App_Name);
	}

	@Then("^: Click on Search Button$")
	public void click_on_Search_Button() throws Throwable {
		Regsuit1.ClickonSearchButton(); 
	}

	@Then("^: Click on Physical Security DashboardApp$")
	public void click_on_Physical_Security_DashboardApp() throws Throwable {
		Regsuit1.ClickonPhysicalSecurityApp();
	}
	
	@Then("^: SelectFromDate \"([^\"]*)\"$")
	public void selectfromdate(String From_Date) throws Throwable {
		Regsuit1.ClickonPreviousMonthCheckbox();
	//	Regsuit1.Select_FromDate(From_Date);
		Regsuit1.SelectFromDateSelectioninCalender();
	}

	@Then("^: SelectToDate \"([^\"]*)\"$")
	public void selecttodate(String To_Date) throws Throwable {
	//	Regsuit1.Select_ToDate(To_Date);
		Regsuit1.ToDateSelectionuinCalender();
	}
	
	@Then("^: SelectCountryfromdropdown$")
	public void selectcountryfromdropdown() throws Throwable {
		Regsuit1.Select_Country();
	}

	@Then("^: SelectCityfromDropdown \"([^\"]*)\"$")
	public void selectcityfromdropdown(String SearchCITY) throws Throwable {
		Regsuit1.Select_City(SearchCITY);
	}

	@Then("^: SelectFacilityfromDropdown \"([^\"]*)\"$")
	public void selectfacilityfromdropdown(String SearchFacilty) throws Throwable {
	//	Regsuit1.Select_Facility(SearchFacilty);
	}
	
	@Then("^: Compare General Visitor value displayed in Application with DB$")
	public void compare_General_Visitor_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.GeneralVisitorCountComparison();
	}
	
	@Then("^: Compare Client Visitor value displayed in Application with DB$")
	public void compare_Client_Visitor_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.ClientVisitorsCountComparison();
	}
	
	@Then("^: Compare Total Visitors value displayed in Application with DB$")
	public void compare_Total_Visitors_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.TotalVisitorsCountComparison();
	}
	
	@Then("^: Clickon Badge Summary Menu$")
	public void clickon_Badge_Summary_Menu() throws Throwable {
		Regsuit1.ClickonBadgeSummaryMenu();
	   
	}

	@Then("^: Click on Show as table tab$")
	public void click_on_Show_as_table_tab() throws Throwable {
		Regsuit1.ClickonShowasTableTab();
	}

	@Then("^: Compare Returned Badge value displayed in Application with DB$")
	public void compare_Returned_Badge_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.CompareReturedBadgeValueAppwithDB();
	}

	@Then("^: Compare Yet to Returned Badge value displayed in Application with DB$")
	public void compare_Yet_to_Returned_Badge_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.CompareYetToReturnBadgeValueAppwithDB();
	}
	
	@Then("^: Compare LOST Badge value displayed in Application with DB$")
	public void compare_LOST_Badge_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.CompareLOSTBadgeValueAppwithDB(); 
	}
	
	@Then("^: Compare General Visitor Percentage value displayed in Application with DB$")
	public void compare_General_Visitor_Percentage_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.CompareGeneralVisitorPercentageAppvaluewithDB();
	}
	
	@Then("^: Compare Client Visitor Percentage value displayed in Application with DB$")
	public void compare_Client_Visitor_Percentage_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.CompareClientVisitorPercentageAppvaluewithDB();
	}
	
	@Then("^: Compare Yet to Notify Badge value displayed in Application with DB$")
	public void compare_Yet_to_Notify_Badge_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.Compare_Yet_to_Notify_BadgeValue_Displayed_in_Application_with_DB();
	}
	
	@Then("^: Clickon Client Visitor Badge Summary Menu$")
	public void clickon_Client_Visitor_Badge_Summary_Menu() throws Throwable {
		Regsuit1.Clickon_ClientVisitor_BadgeSummary_Menu();
	}
	
	@Then("^: Compare Yet to Collect Badge value displayed in Application with DB$")
	public void compare_Yet_to_Collect_Badge_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.Compare_Yet_to_Collect_BadgeValue_Displayed_in_Application_with_DB(); 
	}
	
	@Then("^: Compare Dispatched Badge value displayed in Application with DB$")
	public void compare_Dispatched_Badge_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.Compare_Dispatched_BadgeValue_Displayed_in_Application_with_DB();
	}
	
	@Then("^: Compare Client Returned Badge value displayed in Application with DB$")
	public void compare_Client_Returned_Badge_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.Compare_Returned_Client_BadgeValue_Displayed_in_Application_with_DB();
	}
	
	@Then("^: Compare Client Yet to Return Badge value displayed in Application with DB$")
	public void compare_Client_Yet_to_Return_Badge_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.Compare_Yetto_Return_Client_BadgeValue_Displayed_in_Application_with_DB();
	}
	
	@Then("^: Compare Client Lost Badge value displayed in Application with DB$")
	public void compare_Client_Lost_Badge_value_displayed_in_Application_with_DB() throws Throwable {
		Regsuit1.Compare_Lost_or_Damage_Client_BadgeValue_Displayed_in_Application_with_DB();
	}
	
		
}
