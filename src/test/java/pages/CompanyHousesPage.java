package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utils.Driver;

public class CompanyHousesPage extends Driver {
	
WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Find company information')]")
	WebElement findCompanyInfoLink;
	
	public CompanyHousesPage(WebDriver driver)
	{
		this.driver = driver;
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		
		PageFactory.initElements(factory, this);
		
		
	}
	
	public void clickCompanyInfoLink() throws InterruptedException
	{
		Thread.sleep(9000);
		findCompanyInfoLink.click();
		System.out.println("findCompanyInfoLink is clicked");
	}

}
