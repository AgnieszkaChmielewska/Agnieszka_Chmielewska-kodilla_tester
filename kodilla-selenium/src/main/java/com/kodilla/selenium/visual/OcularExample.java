package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Aga\\it\\kodilla\\drivers\\Chrome\\chromedriver.exe");
        WebDriver webDrive = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("D:\\Aga\\it\\kodilla\\ocular\\results"))
                .snapshotPath(Paths.get("D:\\Aga\\it\\kodilla\\ocular\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDrive);
        page.open();
        page.compare();
        page.close();
    }
}
