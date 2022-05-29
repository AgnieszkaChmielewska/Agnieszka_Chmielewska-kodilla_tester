package com.kodilla.selenium.FacebookApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FAcebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "D:\\Aga\\it\\kodilla\\drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //driver.navigate().to("https://www.facebook.com/");

        driver.switchTo().frame(0);
        WebElement button = driver.findElement(By.id("u_0_l_PF"));
        button.click();

        button = driver.findElement(By.id("u_0_2_BW"));
        button.click();

        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\\\"birthday_wrapper\\\"]/div/span/span/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
