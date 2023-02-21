package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AWRSURNPage;
import pages.CommonPage;
import pages.CompanyHousesPage;
import pages.GetInfoCompanyPage;
import pages.SearchRegisterPage;

public class AWRSURNPageStepDefs extends CommonPage{
	
	
	AWRSURNPage urnPage;
	
	@When("Search for a URN {string}")
    public void searchURNAndContinue(String searchText) throws InterruptedException {
		urnPage = new AWRSURNPage(driver);
       
	  urnPage.enterSearchTextAndContinue(searchText);
      
       
    }
	
	
	@Then("Not found page is returned")
	public void notFoundDisplayed()
	{
	  urnPage.notFoundDisplayed();
	}
	
	@Then("Invalid page is returned")
	public void invalidPageDisplayed()
	{
	 
	  urnPage.inValidDisplayed();
	}
}
