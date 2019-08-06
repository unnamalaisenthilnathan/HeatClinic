package com.atmecs.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import com.google.common.base.Function;
/**
 * 
 * @author Unnamalai.S
 *  This class contains ClickOnElement method, mouseover method, Click method.
 *  ClickOnElement method contains click operations and assert operations.
 *  mouseover method contains 
 */
public class CommonUtilities {
	
	public  void verifyassert(String actual,String expected,String message)
	{
		
	Assert.assertEquals(actual,expected,message);
	System.out.println("Actual is: "+actual+" "+"Expected: "+expected+" "+"Message is: "+message);
	
	}
	
	public   void ClickOnElement(WebDriver driver, final String xpath,final String expected) 
	{
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).ignoring(ElementClickInterceptedException.class).pollingEvery(1, TimeUnit.SECONDS).withTimeout(30, TimeUnit.SECONDS);
	
		fluentWait.until
		(new Function<WebDriver, Boolean>()
		{
		public Boolean apply(WebDriver driver)
		{
		WebElement element = driver.findElement(By.xpath(xpath));
		String title=element.getText();
		verifyassert(title,expected,"passed");
		element.click();
		return true;
		}
		});
		}
	
	public   void mouseover(WebDriver driver, final String xpath) 
	{
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).ignoring(ElementClickInterceptedException.class).pollingEvery(1, TimeUnit.SECONDS).withTimeout(30, TimeUnit.SECONDS);
	
		fluentWait.until(new Function<WebDriver, Boolean>() {
		public Boolean apply(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		return true;
		}
		});
		
		}
	public   void Click(WebDriver driver, final String xpath) 
	{
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).ignoring(ElementClickInterceptedException.class).pollingEvery(1, TimeUnit.SECONDS).withTimeout(30, TimeUnit.SECONDS);
	
		fluentWait.until(new Function<WebDriver, Boolean>() {
		public Boolean apply(WebDriver driver) { 
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
		return true;
		}
		});
		}
}
