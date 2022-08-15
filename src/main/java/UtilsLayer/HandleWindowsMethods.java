package UtilsLayer;

import java.util.ArrayList;
import java.util.Set;

import BaseLayer.BaseClass;

public class HandleWindowsMethods extends BaseClass {

	public static String handleTwoHandle(String parent, Set<String> allWindow) {

		for (String abc : allWindow) {
			if (!abc.equals(parent)) {
				driver.switchTo().window(abc);
				return driver.getWindowHandle();
			}
		}

		return null;
	}

	public static String handleThreeWindow(String parent, String firstChildId, Set<String> allWindow) {

		for (String abc : allWindow) {

			if (!(abc.equals(parent)) && !(abc.equals(firstChildId))) {
				driver.switchTo().window(abc);
				return driver.getWindowHandle();
			}
		}

		return null;
	}

	public static String handleFourWindow(String parent, String firstChildId, String secondChildID,
			Set<String> allWindow) {
		for (String abc : allWindow) {
			if (!(abc.equals(parent)) && !(abc.equals(firstChildId)) && !(abc.equals(secondChildID))) {
				driver.switchTo().window(abc);
				return driver.getWindowHandle();
			}
		}

		return null;
	}

	// Handle window by using ArrayList concept

	public static void handleWindowUsingArrayList(String parent, Set<String> allWindow, int index) {
		ArrayList<String> arr = new ArrayList<String>(allWindow);
		driver.switchTo().window(arr.get(index));
	}

}
