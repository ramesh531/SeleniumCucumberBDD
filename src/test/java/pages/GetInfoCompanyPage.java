package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utils.Driver;

public class GetInfoCompanyPage extends Driver {
	
WebDriver driver;
	
	@FindBy(xpath="//a[@role='button'][@rel='external']")
	WebElement startNowButton;
	
	public GetInfoCompanyPage(WebDriver driver)
	{
		this.driver = driver;
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		
		PageFactory.initElements(factory, this);
		
		
	}
	
	public void clickStartNowButton() throws InterruptedException
	{
		Thread.sleep(3000);
		startNowButton.click();
		System.out.println("startNow button is clicked");
	}

}
