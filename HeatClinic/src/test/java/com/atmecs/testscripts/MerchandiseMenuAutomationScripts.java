package com.atmecs.testscripts;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.atmecs.util.*;
import com.atmecs.logreports.LogReportInformation;
import com.atmecs.testsuite.TestBase;

public class MerchandiseMenuAutomationScripts extends TestBase {
	WebDriver driver;
	LogReportInformation log=new LogReportInformation();
	
	@BeforeTest
	public void setup() {
		this.driver = invokeBrowser();
		String baseUrl = configProps.getProperty("applicationurl");
		driver.get(baseUrl);
		this.driver = windowOperation();

	}

	@Test
	public void merchandise() {

		CommonUtilities obj = new CommonUtilities();

	obj.assertion(driver, menuprops.getProperty("loc_merchandise_menu"), "MERCHANDISE");
	
	obj.mouseover(driver, menuprops.getProperty("loc_merchandise_menu"));
	obj.assertion(driver, menuprops.getProperty("loc_merchandise_submenu_mens"), "MENS");
    
	driver.navigate().back();


	obj.mouseover(driver, menuprops.getProperty("loc_merchandise_menu"));
	obj.assertion(driver, menuprops.getProperty("loc_merchandise_submenu_womens"), "WOMENS");
	
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
