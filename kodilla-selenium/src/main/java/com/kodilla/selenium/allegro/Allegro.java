package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Allegro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Aga\\it\\kodilla\\drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        driver.switchTo().activeElement();
        // WebElement button = driver.findElement(By.xpath("//button[contains(@ data-role, \"accept-consent\")]"));

        WebElement button = driver.findElement(By.cssSelector("div > button[data-role*='accept-consent']"));
        button.click();

        // WebElement field = driver.findElement(By.xpath("//div[contains(@class, \"mzaq_1\")]"));
        WebElement field = driver.findElement(By.cssSelector("div [class*='mzaq_1']"));
        field.click();

        //WebElement input = driver.findElement(By.xpath("//input[contains(@data-role,\"search-input\")]"));
        WebElement input = driver.findElement(By.cssSelector("input[data-role*='search-input']"));
        input.sendKeys("Mavic mini");
        input.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article[data-role*='offer']")));

        List<WebElement> elements = driver.findElements(By.cssSelector("section > article[data-role*='offer']"));
        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            System.out.println("lista"+elements.size());
            element.findElement(By.tagName("h2")).getText();
            System.out.println(element);
        }
    }
}
