package carsRating.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ModelPage extends BasePage{
    @FindBy(xpath = "/html/body/my-app/div/main/my-model")
    WebElement myModel;

    public void verifyPage(){
        Assert.assertTrue(myModel.isEnabled());
    }

}
