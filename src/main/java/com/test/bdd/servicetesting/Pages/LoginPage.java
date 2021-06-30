package com.test.bdd.servicetesting.Pages;

import com.test.bdd.servicetesting.UtilityHelper.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class LoginPage {
    Logger log = LoggerHelper.getLogger(LoginPage.class);
    private static WebDriver webDriver;
    AppWaiter appWaiter;

    public LoginPage() {
        webDriver = UIDriverManager.webDriver;
        appWaiter = new AppWaiter(webDriver);
    }

    //***************************Login Page Methods***************************//

    public void openApplication() throws IOException {
        webDriver.get("https://testscriptdemo.com/");
        log.info("Entered the URL successfully");
    }



}
