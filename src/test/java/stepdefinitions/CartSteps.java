package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Base;


import static org.junit.Assert.assertTrue;

public class CartSteps extends Base {

    @When("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();
    }

    @Then("I should see the product added to the cart")
    public void iShouldSeeTheProductAddedToTheCart() {
        WebElement cartIcon = driver.findElement(By.id("cart-icon"));
        assertTrue(cartIcon.isDisplayed());
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
