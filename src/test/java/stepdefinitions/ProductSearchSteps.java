package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;
import utils.Operations;

import  objectRepository.SplashPageOR;
import static org.junit.Assert.assertTrue;

public class ProductSearchSteps extends Base {

    @When("I search for a product {string}")
    public void iSearchForAProduct(String productName) {
        Operations.sendText(SplashPageOR.searchField, productName, driver);
        Operations.click(SplashPageOR.searchButton, driver);
    }

    @Then("I should see search results contain {string}")
    public void iShouldSeeSearchResults(String productName) {
        String searchResultCartText = Operations.getText(SplashPageOR.searchDes, driver);
        assertTrue(searchResultCartText.contains(productName));

    }
}
