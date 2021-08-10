package carsRating.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.exceptions.SerenityManagedException;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage extends PageObject {
    static final String MSG_FILE_NAME = "./src/test/resources/data/msg.properties";
    static final String HOME_PAGE_URL = "https://buggy.justtestit.org/";

    public WebDriver driver= ((WebDriverFacade) ThucydidesWebDriverSupport.getDriver()).getProxiedDriver();

    @FindBy(xpath = "/html/body/my-app/header/nav/div/a")
    WebElement homeLink;

    public void verifyHomeLink(){
        try {
            Assert.assertTrue(homeLink.isEnabled());
            Assert.assertEquals(HOME_PAGE_URL, homeLink.getAttribute("href"));
        } catch (SerenityManagedException e) {
            handleException(e, new Object() {
            }.getClass().getEnclosingMethod().getName());
        }
    }

    public void clickHomeLink(){
        try {
            if (homeLink.isDisplayed()) {
                homeLink.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String GetMsgString(String key) throws IOException{
        String value = "";
        try {
            Properties prop = new Properties();
            FileInputStream fis= new FileInputStream(MSG_FILE_NAME);
            prop.load(fis);
            value = prop.getProperty(key);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return value;
    }

    public static void handleException(Exception e, String methodName) {
        {
            e.printStackTrace();
            Assert.fail("*** Error Method - " + methodName + "() ***");
        }
    }
}
