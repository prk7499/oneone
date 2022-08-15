package UtilsLayer;

import BaseLayer.BaseClass;

public class AlertPopMethods extends BaseClass {

	public static void clickOnOkButton()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void clickOnCancelButton()
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static String captureAlertText()
	{
		return driver.switchTo().alert().getText();
	}
	
	public static void enterDataInAlert(String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
	
	
	
}
