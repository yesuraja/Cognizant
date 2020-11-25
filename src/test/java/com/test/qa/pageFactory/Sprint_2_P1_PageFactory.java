package com.test.qa.pageFactory;

import java.awt.RenderingHints.Key;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.test.qa.libraries.FunctionalLibrary;
import com.test.qa.utilities.ExcelUtil;

public class Sprint_2_P1_PageFactory extends FunctionalLibrary{
	ExcelUtil excelutil = new ExcelUtil();
	
	@FindBy(xpath="//input[contains(@id,'userID')]")
	public  WebElement Manager_ID_field;
	
	@FindBy(xpath="//input[contains(@id,'setID')]")
	public  WebElement setID_button;
	
	@FindBy(xpath="//button[contains(@type,'submit')]")
	public  WebElement createdemand_button;
	
	@FindBy(xpath="//input[contains(@id,'project_id_label')]")
	public  WebElement projectid_field;
	
	public  String project_list="//ul[contains(@id,'ui-id-1')]/li";
	
	@FindBy(xpath="//*[@id=\"project-details-wrapper\"]/div[1]/span")
	public  WebElement ProjectTitle;
		
	public Sprint_2_P1_PageFactory() {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
		
	public void Login_with_manager_id(String manager_type)throws Exception{
	       
        try{
           
            PageFactory.initElements(driver, this);
                String ManagerID = excelUtil.getCellData(testcase_sheetName, testcase_rowNumber , manager_type);
                if(ManagerID!=null && ManagerID!="")
                {
                    enterValueIntoTextField(Manager_ID_field, "Managerid", ManagerID);
                    clickOnButton(setID_button,"SetIDButton");
                    clickOnButton(createdemand_button,"CreatDmandbutton");
                    String actualTitle = driver.getTitle();
                    if(actualTitle.contains("Demand Management - Demand Management"))
                    {
                        System.out.println("Home page displayed");
                    }
                    PASSreport("Login", manager_type+" in logged in Successfully "+manager_type+" id is :"+ManagerID );
                }
                else
                {
                    System.out.println("Expected manager id is not pressent in excel");
                    FAILreport("Login", "Manager ID not found in excel");
                }
               
               
            }
            catch (Exception e)
            {
                /***Exception e,  String field_name****/
                catch_code(e,"Login","Login have some problem");
            }
        }

	
	public void enterprojectid(String project_type) throws Exception 
	{	
		try
		{
			String Project_ID_data = excelutil.getCellData(testcase_sheetName, testcase_rowNumber , project_type);
			/**List_Selection(Field_data, Field_location, list_xpath, field_name);*/
			List_Selection(Project_ID_data, projectid_field, project_list, "Project_ID"); 
			if(ProjectTitle.isDisplayed()) {
				PASSreport("Login", project_type+" in logged in Successfully "+project_type+" id is :"+Project_ID_data );
			}
					
			else
            {
                System.out.println("Expected Project id is not pressent in excel");
                FAILreport("Login", "Project ID not found in excel");
            }
		}	
		
		
		catch(Exception e)
		{
			/***Exception e,  String field_name****/
			catch_code(e,"Project_id_field","Project Selection have some problem");
		}

	}	
	
	
	public void select_requirementtype(String req_type) throws Exception
	{
		try
		{
			//selectValueFromDropDown(Requirement_type_webelement, req_type, "reqy_type");
		}
		catch(Exception e)
		{
			catch_code(e, "req_type","Requirement Type selection have some problem");
		}
	}
	

	
	
	
	
}
