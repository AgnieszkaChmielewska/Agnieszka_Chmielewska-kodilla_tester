package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Aga\\it\\kodilla\\drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("Laptop");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver,2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gdpr-banner-accept")));

        //WebElement consentButton = driver.findElement(By.id("gdpr-banner-accept"));
       //consentButton.click();

    }
}
