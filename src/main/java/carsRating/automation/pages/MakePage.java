package carsRating.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class MakePage extends BasePage{
    @FindBy(xpath = "/html/body/my-app/div/main/my-make")
    WebElement myMake;

    public void verifyPage(){
        Assert.assertTrue(myMake.isEnabled());
    }

}
