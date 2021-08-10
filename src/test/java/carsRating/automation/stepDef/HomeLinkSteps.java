package carsRating.automation.stepDef;

import carsRating.automation.steps.PageSteps;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeLinkSteps {
    @Steps
    PageSteps pageSteps;

    @Given("User is on home Page")
    public void user_is_on_home_page() {
        pageSteps.navigateToHomePage();
    }

    @When("User clicks on Popular Make image")
    public void user_clicks_on_popular_make_image() {
        pageSteps.navigateToMakePage();
    }

    @When("User clicks on Popular Model image")
    public void user_clicks_on_popular_model_image() {
        pageSteps.navigateToModelPage();
    }

    @When("User clicks on Overall Rating image")
    public void user_clicks_on_overall_rating_image() {
        pageSteps.navigateToOverallPage();
    }

    @Then("The browser should navigate to make page")
    public void the_browser_navigate_to_make_page() {
        pageSteps.verifyPage(PageSteps.PageType.MakePage);
    }

    @Then("The browser should navigate to Model page")
    public void the_browser_should_navigate_to_model_page() {
        pageSteps.verifyPage(PageSteps.PageType.ModelPage);
    }

    @Then("The browser should navigate to Overall Rating page")
    public void the_browser_should_navigate_to_overall_rating_page() {
        pageSteps.verifyPage(PageSteps.PageType.OverallPage);
    }

    @Then("the header should has a home link")
    public void the_header_has_a_home_link() {
        pageSteps.verifyHomeLink();
    }

}
