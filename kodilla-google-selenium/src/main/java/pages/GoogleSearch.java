package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(xpath = "//div[@class=\"CqAVzb lJ9FBc\"]/center/input[@class =\"gNO89b\"]")
    static List<WebElement> searchButtonOnDropDownList;

    @FindBy(xpath = "//div[@class=\"FPdoLc lJ9FBc\"]/center/input[@class =\"gNO89b\"]")
    static List<WebElement> searchButton;
    private GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public GoogleResults searchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);
        WebElement consentButton = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(consentButton)).click();

        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        return googleResults;
    }

    public GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement searchButtonOnDropDownListElement = wait.until(ExpectedConditions.elementToBeClickable(searchButtonOnDropDownList.get(0)));
            System.out.println("Element is clickable");
            searchButtonOnDropDownListElement.click();
        } catch (TimeoutException e) {
            System.out.println("Element isn't clickable");
            WebElement searchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0)));
            searchButtonElement.click();

        }
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
