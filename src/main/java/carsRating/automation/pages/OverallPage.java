package carsRating.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class OverallPage extends BasePage{
    @FindBy(xpath = "/html/body/my-app/div/main/my-overall")
    WebElement myOverall;

    @FindBy(xpath = "/html/body/my-app/div/main/my-overall/div/my-pager/div/div")
    WebElement divPage;

    @FindBy(xpath = "/html/body/my-app/div/main/my-overall/div/my-pager/div/div/input")
    WebElement inputPage;

    @FindBy(xpath = "/html/body/my-app/div/main/my-overall/div/my-pager/div/div/a[1]")
    WebElement prevPage;

    @FindBy(xpath = "/html/body/my-app/div/main/my-overall/div/my-pager/div/div/a[2]")
    WebElement nextPage;

    public static int TotalCars;
    public static int CarsPerPage;
    public static int CurrentPageNum = 1;

    public void verifyPage(){
        Assert.assertTrue(myOverall.isEnabled());
    }

    public void verifyPageNum(Integer pageNum) {
        int remainder =  TotalCars % CarsPerPage == 0 ? 0 : 1;
        int totalPages =  TotalCars / CarsPerPage + remainder;
        String pageText = String.format("« » page %d of %d", pageNum, totalPages);
        Assert.assertEquals(pageText, divPage.getText());
    }

    public void goToPage(Integer pageNum) {
        if (CurrentPageNum != pageNum) {
            inputPage.clear();
            inputPage.sendKeys(pageNum.toString());
            inputPage.sendKeys(Keys.RETURN);
            CurrentPageNum = pageNum;
        }
    }

    public void goToPrevPage() {
        prevPage.click();
    }
    public void goToNextPage() {
        nextPage.click();
    }
}
