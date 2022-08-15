package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	private WebElement logo;
	
	@FindBy(xpath="//b[text()='PIM']")
	private WebElement pimlink;
	
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement adminlink;
	
	@FindBy(xpath="//b[text()='Leave']")
	private WebElement leavelink;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String getHomePageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public boolean checkDisplayedStatusOfHomePageLogo()
	{
		return logo.isDisplayed();
	}
	
	public void clickOnPimLink()
	{
		pimlink.click();
	}
	
	
	public void clickOnAdminLink()
	{
		adminlink.click();
	}
	

	public void clickOnLeaveLink()
	{
		leavelink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
