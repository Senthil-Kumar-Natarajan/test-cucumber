package com.test.bdd.servicetesting.UtilityHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class UIDriverManager {

    public static WebDriver webDriver;
    Logger log = LoggerHelper.getLogger(UIDriverManager.class);

    public UIDriverManager() throws IOException {
    }

    public WebDriver browserToInitialize(String filepath) {
        System.setProperty("webdriver.chrome.driver",
                "/usr/local/bin/chromedriver");
                
                
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        String path;

        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        return webDriver;
    }

    public void closeBrowser() {
        webDriver.quit();
    }
}
