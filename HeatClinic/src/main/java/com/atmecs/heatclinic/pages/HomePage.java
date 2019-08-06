package com.atmecs.heatclinic.pages;

import org.openqa.selenium.WebDriver;

import com.atmecs.util.CommonUtilities;


public class HomePage {
	
	
	CommonUtilities obj=new CommonUtilities();
/**
 * 
 * @param driver
 * @param xpath
 * @param expected
 */
	
	public  void homepageautomationscripts(WebDriver driver, final String xpath,final String expected) {
		obj.ClickOnElement(driver, xpath,expected);
		}
	
	public  void hotsaucesmenuautomation(WebDriver driver, final String xpath,final String expected) {
		obj.ClickOnElement(driver, xpath,expected);
		}
	public  void merchandise(WebDriver driver, final String xpath,final String expected) {
		obj.ClickOnElement(driver, xpath,expected);
		}
	public  void newtohotsauce(WebDriver driver, final String xpath,final String expected) {
		obj.ClickOnElement(driver, xpath,expected);
		}
	public  void clearance(WebDriver driver, final String xpath,final String expected) {
		obj.ClickOnElement(driver, xpath,expected);
		}
	public  void faq(WebDriver driver, final String xpath,final String expected) {
		obj.ClickOnElement(driver, xpath,expected);
		}
	/**
	 * 
	 * @param driver
	 * @param xpath
	 */
	public void merchandisemoveover(WebDriver driver, final String xpath)
	{
	obj.mouseover(driver, xpath);
	}
/**
 * 
 * @param driver
 * @param xpath
 */
	public void homepageautomationclick(WebDriver driver, final String xpath)
	{
		obj.Click(driver, xpath);

}
}
