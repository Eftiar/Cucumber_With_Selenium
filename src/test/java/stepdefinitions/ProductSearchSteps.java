package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Base;


import static org.junit.Assert.assertTrue;

public class ProductSearchSteps extends Base {

    @When("I search for a product {string}")
    public void iSearchForAProduct(String productName) {
        WebElement searchBox = driver.findElement(By.id("search-box"));
        searchBox.sendKeys(productName);
        WebElement searchButton = driver.findElement(By.id("search-button"));
        searchButton.click();
    }

    @Then("I should see search results")
    public void iShouldSeeSearchResults() {
        WebElement searchResults = driver.findElement(By.id("search-results"));
        assertTrue(searchResults.isDisplayed());
    }
}
