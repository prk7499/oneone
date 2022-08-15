package TestLayer1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo2 extends Demo1{

	@FindBy(name="q")
	static WebElement search;
	
	public Demo2()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public static void main(String[] args) {
		
		Demo1.initlize();
		
		search.sendKeys("Selenium WebDriver");
		
		
		
	}
	
}
