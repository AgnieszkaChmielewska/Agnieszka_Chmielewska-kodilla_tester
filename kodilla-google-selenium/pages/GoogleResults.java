package pages;

import org.openqa.seleniumWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleResults {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
    }
}
