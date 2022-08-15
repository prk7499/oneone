package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JavaScriptExecutorMethods extends BaseClass {

	public static void borderOnElement(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red';", wb);
	}
	
	public static void scrollDownUpToElement(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", wb);
	}
	
	public static void clickOnElementUsingJs(WebElement wb) {

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", wb);

	}

	public static void sendDataUsingjs(String value, WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + value + "';", wb);
	}

	public static String captureTitleUsingJs()
	{
		return ((JavascriptExecutor) driver).executeScript("return document.title;").toString();
	}
	
	
	public static String captureUrlUsingJs()
	{
		return ((JavascriptExecutor) driver).executeScript("return document.URL;").toString();
	}
	
	
	public static void openaUrlUsingJs(String url)
	{
		((JavascriptExecutor)driver).executeScript("window.location='"+url+"';");
	}
	
	public static void moveSomeStepBackUsingJs(String moveback)
	{
		((JavascriptExecutor)driver).executeScript("history.go("+moveback+");");
	}
	
	public static void moveSomeStepForwardUsingJs(String moveforward)
	{
		((JavascriptExecutor)driver).executeScript("history.go("+moveforward+");");
	}
	
	
	public static void genrateAlertPop(String alertvalue) 
	{
		((JavascriptExecutor)driver).executeScript("alert('"+alertvalue+"')");
	}
	
	
	public static void genrateConfirmPop(String confirmvalue) 
	{
		((JavascriptExecutor)driver).executeScript("confirm('"+confirmvalue+"')");
	}
	
	
	public static void genratePromptPop(String promptvalue) 
	{
		((JavascriptExecutor)driver).executeScript("prompt('"+promptvalue+"')");
	}
	
	
	
	
	
	
	public static void changeBackgroundColor(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].style.backgroundColor='rgb(255,0,0)';", wb);
	}
	
	
	
}
