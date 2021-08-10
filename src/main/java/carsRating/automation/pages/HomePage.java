package carsRating.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{
    @FindBy(linkText = "Register")
    WebElement register;

    @FindBy(xpath = "/html/body/my-app/div/main/my-home/div/div[1]/div/a")
    WebElement popularMake;

    @FindBy(xpath = "/html/body/my-app/div/main/my-home/div/div[2]/div/a")
    WebElement popularModel;

    @FindBy(xpath = "/html/body/my-app/div/main/my-home/div/div[3]/div/a")
    WebElement overallRating;

    @FindBy(xpath = "/html/body/my-app/div/main/my-home")
    WebElement myHome;

    public void verifyPage(){
        Assert.assertTrue(myHome.isEnabled());
    }

    public void launchWebsite() {
        try {
            getDriver().manage().window().maximize();
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            open();
            String title = getDriver().getTitle().trim();
            Assert.assertEquals(GetMsgString("Title_HomePage"), title);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickRegister(){
        try {
            if (register.isDisplayed()) {
                register.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickPopularMake() {
        try {
            if (popularMake.isDisplayed()) {
                popularMake.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickPopularModel() {
        try {
            if (popularModel.isDisplayed()) {
                popularModel.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickOverallRating() {
        try {
            if (overallRating.isDisplayed()) {
                overallRating.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
