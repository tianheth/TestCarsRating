package carsRating.automation.stepDef;

import carsRating.automation.pages.OverallPage;
import carsRating.automation.steps.PageSteps;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaginationSteps {

    OverallPage overallPage;

    @Steps
    PageSteps pageSteps;

    @Given("User is on Overall Rating Page")
    public void user_is_on_overall_rating_page() {
        pageSteps.navigateToHomePage();
        pageSteps.navigateToOverallPage();
    }

    @Given("There are {int} cars")
    public void there_are_cars(Integer total) {
        OverallPage.TotalCars = total;
    }

    @Given("Each page has {int} cars listed")
    public void each_page_has_cars_listed(Integer perPage) {
        OverallPage.CarsPerPage = perPage;
    }

    @Given("User is on {int} page")
    public void user_is_on_page(Integer pageNum) {
        overallPage.goToPage(pageNum);
        overallPage.verifyPageNum(pageNum);
    }

    @When("User input {int} and press enter")
    public void user_input_and_press_enter(Integer pageNum) {
        overallPage.goToPage(pageNum);
    }

    @When("User clicks Next Page arrow")
    public void user_clicks_next_page_button() {
        overallPage.goToNextPage();
    }

    @When("User clicks Prev Page arrow")
    public void user_clicks_prev_page_button() {
        overallPage.goToPrevPage();
    }

    @Then("It should be on {int} page")
    public void it_should_be_on_page(Integer pageNum) {
        overallPage.verifyPageNum(pageNum);
    }
}
