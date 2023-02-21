package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.CommonPage;
import pages.CompanyHousesPage;
import pages.GetInfoCompanyPage;

public class GetInfoStepDefs extends CommonPage{
	
	GetInfoCompanyPage gicPage;
	@And("I click the Start now button")
    public void iSelectLink() throws InterruptedException {
		gicPage = new GetInfoCompanyPage(driver);
       
		gicPage.clickStartNowButton();
      
       
    }
}
