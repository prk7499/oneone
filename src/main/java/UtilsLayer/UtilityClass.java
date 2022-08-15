package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class UtilityClass extends BaseClass {

	public static String getPassScreenshot(String screenshotname) throws IOException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

		String dist = System.getProperty("user.dir") + "/Aug22PassScreenshot/" + screenshotname + date + ".png";

		FileUtils.copyFile(f, new File(dist));

		return dist;
	}

	
	public static String getFailScreenshot(String screenshotname) throws IOException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

		String dist = System.getProperty("user.dir") + "/Aug22FailScreenshot/" + screenshotname + date + ".png";

		FileUtils.copyFile(f, new File(dist));

		return dist;
	}

	
	
	
	
	
	
	
}
