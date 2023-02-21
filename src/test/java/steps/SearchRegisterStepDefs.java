package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.CompanyHousesPage;
import pages.GetInfoCompanyPage;
import pages.SearchRegisterPage;

public class SearchRegisterStepDefs extends CommonPage{
	
	SearchRegisterPage srPage;
	@When("I search for company {string} and view the company details")
    public void searchCompanyAndSubmit(String searchText) throws InterruptedException {
		srPage = new SearchRegisterPage(driver);
       
	  srPage.enterSearchTextAndSubmit(searchText);
      
       
    }
}
