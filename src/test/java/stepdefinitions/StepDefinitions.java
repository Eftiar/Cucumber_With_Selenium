package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.AuthenticationPage;
import objectRepository.SplashPageOR;
import utils.Base;
import utils.Operations;

public class StepDefinitions extends Base {

    @Given("I open the browser")
    public void iOpenTheBrowser() {
        setUp();
    }

    @When("I navigate to {string}")
    public void iNavigateTo(String url) {
        driver.get(url);
    }

    @Then("I should see the page title {string}")
    public void iShouldSeeThePageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assert actualTitle.equals(expectedTitle) : "Page title mismatch";
    }

    @Then("I login with {string} and {string}")
    public void iShouldLoggedIn(String userName, String password) {
        Operations.click(SplashPageOR.loginButton, driver);
//        Operations.waitForPageToLoad(driver);
        Operations.click(AuthenticationPage.inputFieldPhone, driver);
        Operations.sendText(AuthenticationPage.inputFieldPhone, userName, driver);
        Operations.click(AuthenticationPage.inputFieldPassword, driver);
        Operations.sendText(AuthenticationPage.inputFieldPassword, password, driver);
//        Operations.waitForPageToLoad(driver);
        Operations.verifyElementIsPresent(SplashPageOR.activeLoginStatus, driver);
    }
}
