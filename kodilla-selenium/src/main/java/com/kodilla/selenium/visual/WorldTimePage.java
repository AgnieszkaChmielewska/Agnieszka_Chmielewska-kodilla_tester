package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.snapshot.Snap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Snap("WorldTime.png")
public class WorldTimePage {
    private static final String pageUrl = "https://www.worldtimeserver.com/current_time_in_AW.aspx";
    private WebDriver webDriver;

    public WorldTimePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void open(){
        webDriver.get(pageUrl);
        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//*[@id=\"gdpr-consent-notice\"]")));
        WebElement consentButton = webDriver.findElement(By.xpath("//*[@id=\"save\"]"));
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        wait.until(ExpectedConditions.elementToBeClickable(consentButton)).click();
    }

    public void close() {
        webDriver.quit();
    }

    public void compare() {
        Ocular.snapshot()
                .from(this)
                .sample().using(webDriver)
                .compare();
    }
}
