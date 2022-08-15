package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseLayer.BaseClass;

public class ExtentReportSetUp extends BaseClass {

	public static ExtentReports extent;

	public static ExtentReports extentreportsetUp() {

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
				"C:\\Users\\praf0\\Desktop\\June Batch Script\\OrangeHrmAugustBatch\\Reports\\" + getDate()
						+ "extentreport.html");

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle("PIM Page Test Cases");
		sparkReporter.config().setTheme(Theme.DARK);
		return extent;
	}

	public static String getPassScreenshot(String screenshotname) throws IOException {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dist = System.getProperty("user.dir") + "\\Aug22PassScreenshot\\" + screenshotname + getDate() + ".png";
		FileUtils.copyFile(f, new File(dist));
		return dist;
	}

	public static String getFailedScrenshot(String screenshotname) throws IOException {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dist = System.getProperty("user.dir") + "\\Aug22FailScreenshot\\" + screenshotname + getDate() + ".png";

		FileUtils.copyFile(f, new File(dist));

		return dist;

	}

	public static String getDate() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

	}

}
