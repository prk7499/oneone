package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void handleDPByVisibleText(WebElement wb, String value) {
		new Select(wb).selectByVisibleText(value);
	}

	public static void handleDPByIndex(WebElement wb, int index) {
		new Select(wb).selectByIndex(index);
	}

	public static void handleDPByValue(WebElement wb, String value) {
		new Select(wb).selectByValue(value);
	}

	public static String checkSelectedValueFromDP(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static int countTotalValuesInDP(WebElement wb) {
		return new Select(wb).getOptions().size();
	}

	public static void printAllDpValue(WebElement wb) {

		for (WebElement abc : new Select(wb).getOptions()) {
			System.out.println(abc.getText());
		}
	}

	public static boolean checkSpecificValueIsPresent(WebElement wb, String value) {

		for (WebElement abc : new Select(wb).getOptions()) 
		{
			if (abc.getText().equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;

	}

}
