package com.atmecs.testsuite;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.atmecs.constants.ProjectPathConstants;
import com.atmecs.logreports.LogReportinformation;
import com.atmecs.util.PropertiesUtil;

public class TestBase  {
	LogReportinformation log=new LogReportinformation();
	WebDriver driver;

    public static Properties configProps = PropertiesUtil.loadProperty(ProjectPathConstants.config);
	public static Properties menuprops=PropertiesUtil.loadProperty(ProjectPathConstants.menu);
	
	public enum BrowserType {
	FIREFOX, CHROME, IE
	}
public WebDriver invokeBrowser() 
	{
	
	log.info("invoke");
	    String browser = configProps.getProperty("browserName");
	
	switch (BrowserType.valueOf(browser)) {
	case CHROME:{
	this.driver = setChromeDriver();
	log.info("Chrome driver set "+driver);
	log.info("chrome invoked...");
	break;
	}
	case FIREFOX:
		log.info("firefox case");
	this.driver = setFirefoxDriver();
	log.info("Firefox driver set "+driver);
	break;

	case IE:
	this.driver = setInterExplorerDriver();
	log.info("Internet driver set "+driver);
	default:
	break;
	}
	return driver;
	

	}

	private WebDriver setChromeDriver() {

		String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
		System.setProperty("webdriver.chrome.driver", currentdir + "chromedriver.exe");
		return new ChromeDriver();
	}

	private WebDriver setFirefoxDriver() {
	String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
	System.setProperty("webdriver.gecko.driver", currentdir + "geckodriver.exe");
	return new FirefoxDriver();
	}

	private WebDriver setInterExplorerDriver() {
	String currentdir = System.getProperty("user.dir") + File.separator + "lib" + File.separator;
	System.setProperty("webdriver.ie.driver", currentdir + "IEDriverServer.exe");
	return new InternetExplorerDriver();
	}
	public WebDriver windowOperation() {
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  return driver;
	
	

}
}