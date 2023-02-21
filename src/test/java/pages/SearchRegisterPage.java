package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utils.Driver;

public class SearchRegisterPage extends Driver {
	
WebDriver driver;
	
	@FindBy(id="site-search-text")
	WebElement searchTextField;
	
	@FindBy(id="search-submit")
	WebElement searchButton;
	
	public SearchRegisterPage(WebDriver driver)
	{
		this.driver = driver;
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		
		PageFactory.initElements(factory, this);
		
		
	}
	
	public void enterSearchTextAndSubmit(String searchTxt)
	{
		searchTextField.sendKeys(searchTxt);
		System.out.println("Entered Search text is "+searchTxt);
		
		searchButton.click();
	}

}
