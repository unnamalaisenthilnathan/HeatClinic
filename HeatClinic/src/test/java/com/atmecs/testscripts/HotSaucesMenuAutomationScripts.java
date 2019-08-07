package com.atmecs.testscripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.logreports.LogReportInformation;
import com.atmecs.testsuite.TestBase;
import com.atmecs.util.CommonUtilities;


public class HotSaucesMenuAutomationScripts extends TestBase {
	WebDriver driver;
	LogReportInformation log=new LogReportInformation();
	
	@BeforeTest
	public void setup1()
	{
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();
		
    }
	
	 
	@Test
	public void hotsauce() 
	{
		CommonUtilities   obj=new  CommonUtilities ();
	    obj.assertion(driver, menuprops.getProperty("loc_hotsauce_menu"), "HOT SAUCES");
		log.info("Title is :"+driver.getTitle());

		}
	 
	 
	 @AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
