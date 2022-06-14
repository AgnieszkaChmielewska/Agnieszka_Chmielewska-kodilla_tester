package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PickedResult extends AbstractPage{
    @FindBy (css = "")
private String pickedUrl;

    public PickedResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);

    }

    public String getPickedUrl() {
pickedUrl = driver.getCurrentUrl();
        return pickedUrl;
    }
}
