package carsRating.automation.stepDef;

import carsRating.automation.pages.RegisterPage;
import carsRating.automation.steps.PageSteps;
import carsRating.automation.steps.PageSteps.PageType;

import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    RegisterPage registerPage;

    @Steps
    PageSteps pageSteps;

    @Given("User is on Register Page")
    public void user_is_on_register_page() {
        pageSteps.navigateToHomePage();
        pageSteps.navigateToRegisterPage();
        pageSteps.verifyPage(PageType.RegisterPage);
    }

    @When("User clicks Register with {string}, {string}, {string}, {string}")
    public void user_clicks_register_with(String login, String firstName, String lastName, String password) {
        registerPage.clickRegister(login, firstName, lastName, password);
    }
    @Then("The message {string} should be displayed")
    public void the_message_should_be_displayed(String msg) {
        registerPage.verifyMsg(msg);
    }

}
