package carsRating.automation.steps;

import carsRating.automation.pages.*;
import net.thucydides.core.annotations.Step;

public class PageSteps {

    public enum PageType {
        MakePage, ModelPage, OverallPage, RegisterPage, HomePage
    }

    public static BasePage currentPage = new BasePage();
    HomePage homePage;
    MakePage makePage;
    ModelPage modelPage;
    OverallPage overallPage;
    RegisterPage registerPage;

    @Step
    public void navigateToHomePage() {
        homePage.launchWebsite();
        currentPage = homePage;
    }

    @Step
    public void navigateToRegisterPage() {
        homePage.clickRegister();
    }

    @Step
    public void navigateToMakePage() {
        homePage.clickPopularMake();
    }

    @Step
    public void navigateToModelPage() {
        homePage.clickPopularModel();
    }

    @Step
    public void navigateToOverallPage() {
        homePage.clickOverallRating();
    }

    @Step
    public void verifyPage(PageType pageType) {
        switch (pageType) {
            case MakePage:
                makePage.verifyPage();
                currentPage = makePage;
                break;
            case ModelPage:
                modelPage.verifyPage();
                currentPage = modelPage;
                break;
            case OverallPage:
                overallPage.verifyPage();
                currentPage = overallPage;
                break;
            case RegisterPage:
                registerPage.verifyPage();
                currentPage = registerPage;
                break;
            case HomePage:
                homePage.verifyPage();
                currentPage = homePage;
                break;
        }
    }

    @Step
    public void verifyHomeLink() {
        currentPage.verifyHomeLink();
    }

    @Step
    public void navigateByHomeLink() {
        currentPage.clickHomeLink();
    }

}
