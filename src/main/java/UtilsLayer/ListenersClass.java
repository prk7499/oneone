package UtilsLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersClass extends ExtentReportSetUp implements ITestListener {

	public static ExtentTest extenttest;

	public void onStart(ITestContext context) {
		extent = ExtentReportSetUp.extentreportsetUp();
	}

	public void onTestStart(ITestResult result) {
		extenttest = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, result.getMethod().getMethodName());
		try {
			extenttest
					.addScreenCaptureFromPath(ExtentReportSetUp.getPassScreenshot(result.getMethod().getMethodName()));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, result.getMethod().getMethodName());

		try {
			extenttest
					.addScreenCaptureFromPath(ExtentReportSetUp.getFailedScrenshot(result.getMethod().getMethodName()));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
