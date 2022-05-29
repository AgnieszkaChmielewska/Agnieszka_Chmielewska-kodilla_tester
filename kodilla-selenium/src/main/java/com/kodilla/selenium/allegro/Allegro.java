package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allegro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Aga\\it\\kodilla\\drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        driver.switchTo().activeElement();
        WebElement button = driver.findElement(By.xpath("//button[contains(@ data-role, \"accept-consent\")]"));
        button.click();

        WebElement field = driver.findElement(By.xpath("//div[contains(@class, \"mzaq_1\")]"));
        field.click();

        WebElement input = driver.findElement(By.xpath("//input[contains(@data-role,\"search-input\")]"));
        input.sendKeys("Mavic mini");
        input.submit();

    }
}
