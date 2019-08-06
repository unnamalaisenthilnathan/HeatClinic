package com.atmecs.testscripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.logreports.LogReportinformation;
import com.atmecs.testsuite.TestBase;
import com.atmecs.util.CommonUtilities;


public class HotSaucesMenuAutomation extends TestBase {
	WebDriver driver;
	LogReportinformation log=new LogReportinformation();
	
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
	    obj.ClickOnElement(driver, menuprops.getProperty("btnhotsauce"), "HOT SAUCES");
		log.info("Title is :"+driver.getTitle());

		}
	 
	 
	 @AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
