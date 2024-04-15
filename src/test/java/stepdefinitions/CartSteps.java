package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.ProductPageOR;
import objectRepository.SplashPageOR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Base;
import utils.Operations;


import static org.junit.Assert.assertTrue;

public class CartSteps extends Base {

    @When("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        Operations.click(SplashPageOR.searchDes, driver);
        Operations.waitForPageToLoad(driver);
        assertTrue(Operations.verifyElementIsPresent(ProductPageOR.addToCartButton, driver));
        Operations.click(ProductPageOR.addToCartButton, driver);
    }

    @Then("I should see the product added to the cart")
    public void iShouldSeeTheProductAddedToTheCart() {
        assertTrue(Operations.verifyElementIsPresent(ProductPageOR.addedToCartText, driver));
    }

    @When("I proceed to checkout")
    public void iProceedToCheckout() {
        WebElement checkoutButton = driver.findElement(By.id("checkout-button"));
        checkoutButton.click();
    }

    @Then("I should be on the checkout page")
    public void iShouldBeOnTheCheckoutPage() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("checkout"));
        quit();
    }
}
