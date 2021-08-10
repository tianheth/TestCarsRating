package carsRating.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.UUID;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "/html/body/my-app/div/main/my-register")
    WebElement myRegister;

    @FindBy(id = "username")
    WebElement userNameInput;

    @FindBy(id = "firstName")
    WebElement firstNameInput;

    @FindBy(id = "lastName")
    WebElement lastNameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement register;

    @FindBy(xpath = "/html/body/my-app/div/main/my-register/div/div/form/div[6]")
    WebElement message;

    public void verifyPage(){
        Assert.assertTrue(myRegister.isEnabled());
    }

    public void clickRegister(String login, String firstName, String lastName, String password) {
        if (login.contentEquals("Random"))
            login += UUID.randomUUID().toString();

        userNameInput.sendKeys(login);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);

        register.click();
    }

    public void verifyMsg(String msgKey) {
        try {
            String msgValue = BasePage.GetMsgString(msgKey);
            Assert.assertEquals(msgValue, message.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
