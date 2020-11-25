package com.test.qa.utilities;


import java.util.ArrayList;
import java.util.List;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;
import com.test.qa.globalVariables.GlobalVariables;
import com.test.qa.libraries.FunctionalLibrary;



public class ExtentReportManager extends FunctionalLibrary {
	

	public static ExtentReports invokeExtentReport() {
		FunctionalLibrary libs = new FunctionalLibrary();
		String path = System.getProperty("user.dir") + "\\Reports\\" + FunctionalLibrary.applicationName + "\\"
				+ libs.dateStamp() + "\\" + FunctionalLibrary.applicationName  + "_" + FunctionalLibrary.BrowserName
				+ "_TestReport_" + libs.dateStamp() + ".html";
		System.out.println("Path of the HTML Report: " + path);
		report = new ExtentReports(path, false);
		report.addSystemInfo("Report Name", "Cucumber Framework Report").addSystemInfo("Report Type", "Automation Report");
		return report;
	}
	
// **********************************************************************************************************************

		public void invokeReport(String testReport) {
			try {
				report = invokeExtentReport();
				test = report.startTest(testReport);
				test.assignAuthor( getProperty("Author_Name"));
				test.assignCategory(getProperty("Test_Category"));
				test.setDescription("Employee Registration");
				
			} catch (Exception e) {
				System.out.println("Reporting has not been created");
			}
		}
		
// **********************************************************************************************************************************************
		public void componenttHeading(String Componentname) {
			test.log(LogStatus.INFO,"<b style=background-color:yellow;>"+ Componentname);
		}		

// ******************************************************************************************************************

		public void tearReport() throws Exception {
			report.endTest(test);
			report.flush();
			

		}
		
}
