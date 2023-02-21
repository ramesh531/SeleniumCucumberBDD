package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;

import java.util.List;

public class CommonStepdefs extends CommonPage {


    @Given("I go to url {string}")
    public static void iGoToUrl(String url) {
        getUrl(url);
    }
    
    @Then("I should be on the {string} page")
    public static void validateTitle(String pageTitle)
    {
    	System.out.println("Page Title : "+ driver.getTitle());
    	Assert.assertTrue("Page Title Matched",driver.getTitle().contains(pageTitle));
    }
    
    @And("I select the {string} link")
    public static void iSelectLink(String linkName) throws InterruptedException {
    driver.findElement(By.xpath("//a[contains(text(),'"+linkName+"')]")).click();
       
     
        
    }


    @Then("I validate that the details are displayed")
    public void iValidateThatTheDetailsAreDisplayed(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String CompanyStatusExpected = data.get(1).get(1);
        String CompanyTypeExpected = data.get(2).get(1);
        String IncorporatedExpected = data.get(3).get(1);


        System.out.println("CompanyStatus " + CompanyStatusExpected);
        System.out.println("CompanyType " + CompanyTypeExpected);

        String CompanyStatusActual = driver.findElement(By.id("company-status")).getText();
        String CompanyTypeActual = driver.findElement(By.id("company-type")).getText();
        String IncorporatedActual = driver.findElement(By.id("company-creation-date")).getText();

        Assert.assertEquals(CompanyStatusExpected, CompanyStatusActual);
        Assert.assertEquals(CompanyTypeExpected, CompanyTypeActual);
        Assert.assertEquals(IncorporatedExpected, IncorporatedActual);
    }


}
