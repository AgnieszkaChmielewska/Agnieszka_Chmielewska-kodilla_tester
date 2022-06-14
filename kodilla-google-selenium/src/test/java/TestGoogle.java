import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.PickedResult;


public class TestGoogle {
    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void isResult(){
        GoogleSearch googleSearch = new GoogleSearch(driver);
        GoogleResults googleResults = googleSearch.searchResults();
        Assert.assertTrue(googleResults.iSeeResults());
    }

    @Test
    public void testPickedResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        googleResults.loadPickedSite(driver,0);
        PickedResult pickedResult = new PickedResult(driver);
        String url = pickedResult.getPickedUrl();
        Assert.assertEquals("https://kodilla.com/pl" ,url );
       }

    @Test
    public void testGoogleResultsElementUrl() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        googleResults.getGoogleResultsElementUrl(5);
        String googleResultsElementUrl = googleResults.getGoogleResultsElementUrl(5);
        googleResults.loadPickedSite(driver, 5);
        PickedResult pickedResult = new PickedResult(driver);
        String pickedSiteUrl = pickedResult.getPickedUrl();
        if (googleResultsElementUrl.contains(pickedSiteUrl)){
            googleResultsElementUrl = pickedSiteUrl;
        }
        Assert.assertSame(googleResultsElementUrl, pickedSiteUrl);
    }

}