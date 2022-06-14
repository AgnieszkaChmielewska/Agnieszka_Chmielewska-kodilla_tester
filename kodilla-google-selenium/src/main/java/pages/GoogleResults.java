package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleResults extends AbstractPage {
   @FindBy(xpath = "//div[@class=\"yuRUbf\"]/a")
    private List<WebElement> resultsByIndex;

    @FindBy (xpath = "//div[@id=\"rso\"]/div/div/div/div/div/div/div[@class=\"tF2Cxc\"]/div[@class=\"yuRUbf\"]/a")
    private List<WebElement> results;

    public List<WebElement> getResults() {
        results.get(0).getText();
        return results;
    }

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public boolean iSeeResults() {
        System.out.println("I see results");
        int is = results.size();
        if (is > 0) {
            System.out.println(results.size());
        }
            return true;
    }

    public PickedResult loadPickedSite(WebDriver driver, int index) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(resultsByIndex.get(index))).click();
        PickedResult pickedResult = new PickedResult(driver);
        return pickedResult;
    }

    public String getGoogleResultsElementUrl(int index) {
        String urlFromGoogleResults = resultsByIndex.get(index).getAttribute("href");
        System.out.println("urlFromGoogleResults "+urlFromGoogleResults);
        return urlFromGoogleResults;
    }

}
