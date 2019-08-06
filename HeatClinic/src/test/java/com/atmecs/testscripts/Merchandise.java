package com.atmecs.testscripts;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.atmecs.util.*;
import com.atmecs.logreports.LogReportinformation;
import com.atmecs.testsuite.TestBase;

public class Merchandise extends TestBase {
	WebDriver driver;
	LogReportinformation log=new LogReportinformation();
	
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

	obj.ClickOnElement(driver, menuprops.getProperty("btnmerchandise"), "MERCHANDISE");
	
	obj.mouseover(driver, menuprops.getProperty("btnmerchandise"));
	obj.ClickOnElement(driver, menuprops.getProperty("dropdownmens"), "MENS");
    
	driver.navigate().back();


	obj.mouseover(driver, menuprops.getProperty("btnmerchandise"));
	obj.ClickOnElement(driver, menuprops.getProperty("dropdownwomens"), "WOMENS");
	
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
