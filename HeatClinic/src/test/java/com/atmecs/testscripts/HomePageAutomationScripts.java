package com.atmecs.testscripts;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.logreports.LogReportInformation;
import com.atmecs.testsuite.TestBase;
import com.atmecs.util.CommonUtilities;


public class HomePageAutomationScripts extends TestBase {
	WebDriver driver;
	LogReportInformation log=new LogReportInformation();
@BeforeTest
public void setup()
{
	this.driver = invokeBrowser();
	String baseUrl = configProps.getProperty("applicationurl");
	driver.get(baseUrl);
	this.driver = windowOperation();
}
	
@Test
public void homepage() 
{
	
	CommonUtilities   obj=new  CommonUtilities ();
	obj.assertion(driver, menuprops.getProperty("loc_home_menu"), "HOME");
    obj.click(driver, menuprops.getProperty("loc_home_shopforapparel_btn"));
	log.info("Title is: "+driver.getTitle());
	driver.navigate().back();
	obj.click(driver, menuprops.getProperty("loc_home_hotsauceaficionadotxt"));
   }


@AfterTest
public void teardown()
{
	driver.quit();
}

}
