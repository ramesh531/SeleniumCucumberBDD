package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utils.Driver;

public class AWRSURNPage extends Driver {
	
WebDriver driver;
	
	@FindBy(id="query")
	WebElement queryTextField;
	
	@FindBy(id="search")
	WebElement continueButton;
	
	@FindBy(xpath="//h1[@id='not-found']")
	WebElement notFoundText;
	
	@FindBy(xpath="//h1[@id='no-results-search-term']")
	WebElement inValidPageText;
	
	public AWRSURNPage(WebDriver driver)
	{
		this.driver = driver;
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		
		PageFactory.initElements(factory, this);
		
		
	}
	
	public void enterSearchTextAndContinue(String searchTxt)
	{
		queryTextField.sendKeys(searchTxt);
		System.out.println("Entered Query text is "+searchTxt);
		
		continueButton.click();
	}
	
	public void notFoundDisplayed()
	{
		notFoundText.isDisplayed();
	}
	
	public void inValidDisplayed()
	{
		inValidPageText.isDisplayed();
	}

}
