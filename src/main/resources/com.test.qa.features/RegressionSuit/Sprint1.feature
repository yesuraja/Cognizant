@PhysicalSecurityDashBoard
Feature: DB_validation in Physical Security Dashboard


@PS_RegTC01
Scenario Outline: Verify the system is displaying General Visitor count in Application as Displayed in DB.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : SelectFromDate "<FromDat>"
Then : SelectToDate "<ToDat>"
Then : SelectCountryfromdropdown
Then : SelectCityfromDropdown "<City_Name>"
Then : SelectFacilityfromDropdown "<Facility_Name>"
And : Compare General Visitor value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      | ApplicationName     |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Verify the visitors for chennai in september monthTC_001   | AppNme				|FromDate|ToDate|City     |Facility     |

	      
@PS_RegTC02
Scenario Outline: Verify the system is displaying Client Visitor count in Application as Displayed in DB.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : SelectFromDate "<FromDat>"
Then : SelectToDate "<ToDat>"
Then : SelectCountryfromdropdown
Then : SelectCityfromDropdown "<City_Name>"
Then : SelectFacilityfromDropdown "<Facility_Name>"
And : Compare Client Visitor value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			 | ApplicationName      |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Client Visitor value displayed in Application with DBTC_002   | AppNme				|FromDate|ToDate|City     |Facility     |


@PS_RegTC03
Scenario Outline: Verify the system is displaying Total Visitor count in Application as Displayed in DB.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : SelectFromDate "<FromDat>"
Then : SelectToDate "<ToDat>"
Then : SelectCountryfromdropdown
Then : SelectCityfromDropdown "<City_Name>"
Then : SelectFacilityfromDropdown "<Facility_Name>"
And : Compare Total Visitors value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			 | ApplicationName      |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Total Visitor value displayed in Application with DBTC_003    | AppNme				|FromDate|ToDate|City     |Facility     |	     
	      
	      
@PS_RegTC04
Scenario Outline: Verify the system is displaying Number of Returned Badge count in Application as Displayed in DB for General Visitors.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : Clickon Badge Summary Menu
Then : Click on Show as table tab
#And : Compare Returned Badge value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			  | ApplicationName      |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Returned Badge value displayed in Application with DBTC_004    | AppNme				 |FromDate|ToDate|City     |Facility     |	   
	      
@PS_RegTC05
Scenario Outline: Verify the system is displaying Number of Yet To Return Badge count in Application as Displayed in DB for General Visitors.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : Clickon Badge Summary Menu
Then : Click on Show as table tab
And : Compare Yet to Returned Badge value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			  	   | ApplicationName      |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Yet to Return Badge value displayed in Application with DBTC_005    | AppNme				  |FromDate|ToDate|City     |Facility     |	
	      
	      
@PS_RegTC06
Scenario Outline: Verify the system is displaying Number of LOST Badge count in Application as Displayed in DB for General Visitors.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : Clickon Badge Summary Menu
Then : Click on Show as table tab
And : Compare LOST Badge value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      		  | ApplicationName       |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare LOST Badge value displayed in Application with DBTC_006    | AppNme				  |FromDate|ToDate|City     |Facility     |	 
	      
	     
@PS_RegTC07
Scenario Outline: Verify the system is displaying General Visitor Percentage in Application as Displayed in DB.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
And : Compare General Visitor Percentage value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      		  				  | ApplicationName       |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare General Visitor Percentage value displayed in Application with DBTC_007    | AppNme				  |FromDate|ToDate|City     |Facility     |	       	          	             	           


@PS_RegTC08
Scenario Outline: Verify the system is displaying General Visitor Percentage in Application as Displayed in DB.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
And : Compare Client Visitor Percentage value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      		  				  | ApplicationName       |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Client Visitor Percentage value displayed in Application with DBTC_008     | AppNme				  |FromDate|ToDate|City     |Facility     |	       	          	             	           


@PS_RegTC09
Scenario Outline: Verify the system is displaying Number of Yet to Notify Badge count in Application as Displayed in DB for Client Visitors.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : Clickon Client Visitor Badge Summary Menu
Then : Click on Show as table tab
And : Compare Yet to Notify Badge value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			  	   | ApplicationName     |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Yet to Notify Badge value displayed in Application with DBTC_009    | AppNme				 |FromDate|ToDate|City     |Facility     |	   


@PS_RegTC10
Scenario Outline: Verify the system is displaying Number of Yet to Collect Badge count in Application as Displayed in DB for Client Visitors.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : Clickon Client Visitor Badge Summary Menu
Then : Click on Show as table tab
And : Compare Yet to Collect Badge value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			  	    | ApplicationName     |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Yet to Collect Badge value displayed in Application with DBTC_010    | AppNme			  |FromDate|ToDate|City     |Facility     |	  
	      

@PS_RegTC11
Scenario Outline: Verify the system is displaying Number of Dispatched Badge count in Application as Displayed in DB for Client Visitors.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : Clickon Client Visitor Badge Summary Menu
Then : Click on Show as table tab
And : Compare Dispatched Badge value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			   | ApplicationName  |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Dispatched Badge value displayed in Application with DBTC_11    | AppNme			  |FromDate|ToDate|City     |Facility     |	 
	      
	      
@PS_RegTC12
Scenario Outline: Verify the system is displaying Number of Returned Badge count in Application as Displayed in DB for Client Visitors.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : Clickon Client Visitor Badge Summary Menu
Then : Click on Show as table tab
And : Compare Client Returned Badge value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			        | ApplicationName     |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Client Returned Badge value displayed in Application with DBTC_12    | AppNme			  |FromDate|ToDate|City     |Facility     |	   
	      
	      
@PS_RegTC13
Scenario Outline: Verify the system is displaying Number of Yet to Return Badge count in Application as Displayed in DB for Client Visitors.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : Clickon Client Visitor Badge Summary Menu
Then : Click on Show as table tab
And : Compare Client Yet to Return Badge value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			        	 | ApplicationName     |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Client Yet to Return Badge value displayed in Application with DBTC_13    | AppNme			   |FromDate|ToDate|City     |Facility     |
	      
	      
@PS_RegTC14
Scenario Outline: Verify the system is displaying Number of Lost/Damage Badge count in Application as Displayed in DB for Client Visitors.


Given : Launch the application URL with the sheet "<SheetName>" and testcase to be executed is "<TestCaseName>" with given scenario "<TestCaseDescription>"
When : Enter "<ApplicationName>" in OneC App Search Field
Then : Click on Search Button
And : Click on Physical Security DashboardApp
Then : Clickon Client Visitor Badge Summary Menu
Then : Click on Show as table tab
And : Compare Client Lost Badge value displayed in Application with DB

  
Examples: 
	      | SheetName        | TestCaseName 		  						  		      			    | ApplicationName     |FromDat |ToDat |City_Name|Facility_Name|
	      | PhysicalSecurity | Compare Client Lost Badge value displayed in Application with DBTC_14    | AppNme			  |FromDate|ToDate|City     |Facility     |
	      
	      
