//package steps;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import pages.CommonPage;
//import pages.CompanyHousesPage;
//
//public class CompanyHouseStepDefs extends CommonPage{
//	
//	CompanyHousesPage chPage;
//	@And("I select the {string} link")
//    public void iSelectLink(String linkName) throws InterruptedException {
//      // chPage = new CompanyHousesPage(driver);
//       
//      // chPage.clickCompanyInfoLink();
//      // driver.findElement(By.xpath("//a[contains(text(),'"+linkName+"'")]).click();
//       
//       driver.findElement(By.xpath("//a[contains(text(),'"+linkName+"')]")).click();
//       
//     
//        
//    }
//}
