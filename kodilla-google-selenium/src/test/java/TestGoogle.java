import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GoogleSearch;

import static com.codeborne.selenide.Selenide.open;


public class TestGoogle {
    WebDriver driver;

    @Before
    public void testSetup() {
       WebDriverManager.chromedriver().setup();                   /*użycie biblioteki pozwala automatycznie pobierać sterowniki z internetu*/
       open("http://wwww.google.com");

//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.navigate().to("http://wwww.google.com");

    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }
}
