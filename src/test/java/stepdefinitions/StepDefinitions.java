package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;

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
        quit();
    }
}
