package UtilsLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleFrameMethods extends BaseClass{

	public static WebDriver frameByIndex(int index)
	{
		return driver.switchTo().frame(index);
	}
	
	public static WebDriver frameByWebElement(WebElement wb)
	{
		return driver.switchTo().frame(wb);
	}
	
	public static WebDriver frameByIdorName(String value)
	{
		return driver.switchTo().frame(value);
	}
	
	public static WebDriver switchToParent()
	{
		return driver.switchTo().parentFrame();
	}
	
	public static WebDriver switchTopFrame()
	{
		return driver.switchTo().defaultContent();
	}
	
	
}
