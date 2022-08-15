package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

@Test(groups= {"HomePage"},dependsOnGroups = {"LoginPage"},alwaysRun=true)
public class HomePageTest extends BaseClass {
	protected HomePage homepage;

	@Test(priority=1)
	public void validateHomePageTitle() {
		homepage = new HomePage();
		Assert.assertEquals(homepage.getHomePageTitle(), "OrangeHRM");
	}

	@Test(priority=2)
	public void validateHomePageUrl() {
		Assert.assertEquals(homepage.getHomePageUrl().contains("hrm"), true);
	}

	@Test(priority=3)
	public void validateHomePageLogo() {
		Assert.assertTrue(homepage.checkDisplayedStatusOfHomePageLogo());
	}

	@Test(priority=4)
	public void validateHomePagePIMLink() {
		homepage.clickOnPimLink();
	}

	@Test(priority=5)
	public void validateHomePageAdminLink() {
		homepage.clickOnAdminLink();
	}

	@Test(priority=6)
	public void validateHomePageLeaveLink() {
		homepage.clickOnLeaveLink();
	}

}
