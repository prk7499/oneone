package UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClassMethods extends BaseClass {

	public static void clickOnElement(WebElement wb) {
		new Actions(driver).click(wb).build().perform();
	}

	public static void rightClickonElement(WebElement wb) {
		new Actions(driver).contextClick(wb).build().perform();
	}

	public static void mouseOverElement(WebElement wb) {
		new Actions(driver).moveToElement(wb).build().perform();
	}

	public static void mouseOverAndClickOnElement(WebElement mouseover, WebElement click) {
		new Actions(driver).moveToElement(mouseover).click(click).build().perform();
	}

	public static void sendDataInTextBox(WebElement wb, String value) {
		new Actions(driver).sendKeys(wb, value).build().perform();
	}

	public static void dragAndDropElement(WebElement src, WebElement trg) {
		new Actions(driver).dragAndDrop(src, trg).build().perform();
	}

	public static void clickAndHoldElement(WebElement wb) {
		new Actions(driver).clickAndHold(wb).build().perform();
	}

	public static void releaseElement(WebElement wb) {
		new Actions(driver).release(wb).build().perform();
	}

	public static void enterDataInUpperCase(WebElement wb, String value) {
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(wb, value).keyUp(Keys.SHIFT).build().perform();
	}

	public static void moveEndOfPage() {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}

	public static void moveHomePage() {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}

	public static void doubleClickOnElement(WebElement wb) {
		new Actions(driver).doubleClick(wb).build().perform();
	}

	public static void copyTextFromTextBox(WebElement wb) {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(wb, "a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	}

	public static void pasteTextInTextBox(WebElement wb) {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(wb, "v").keyUp(Keys.CONTROL).build().perform();
	}

	
	
	
	
	
}
