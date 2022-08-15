package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import UtilsLayer.AlertPopMethods;
import UtilsLayer.JavaScriptExecutorMethods;

@Test(groups = { "LoginPage" })
public class LoginPageTest extends BaseClass {

	@BeforeTest
	public void setUp() {
		BaseClass.initlization();
	}

	@Test
	public void validateLoginFunctionality() throws InterruptedException {
		JavaScriptExecutorMethods.genrateAlertPop("User is on Login Page");
		Thread.sleep(5000);
		boolean a = AlertPopMethods.captureAlertText().contains("Login");

		Assert.assertTrue(a);

		AlertPopMethods.clickOnOkButton();

		new LoginPage().loginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterTest
	public void tearDown() {
		// driver.close();
	}

}
