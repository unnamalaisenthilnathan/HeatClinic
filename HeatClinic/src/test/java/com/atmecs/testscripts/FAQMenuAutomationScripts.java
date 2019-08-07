package com.atmecs.testscripts;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.atmecs.testsuite.TestBase;
import com.atmecs.util.CommonUtilities;

public class FAQMenuAutomationScripts extends TestBase{
	WebDriver driver;
	

	@BeforeTest
	public void setup()
	{
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();
		
	}
		
	@Test
	public void faq() 
	{

		CommonUtilities   obj=new  CommonUtilities ();
        obj.assertion(driver, menuprops.getProperty("loc_faq_menu"), "FAQ");
	
		}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	}
