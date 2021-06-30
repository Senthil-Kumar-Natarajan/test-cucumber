package com.test.bdd.servicetesting.Pages;

import com.test.bdd.servicetesting.UtilityHelper.AppWaiter;
import com.test.bdd.servicetesting.UtilityHelper.LoggerHelper;
import com.test.bdd.servicetesting.UtilityHelper.UIDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class MainPage {

    static Logger log = LoggerHelper.getLogger(MainPage.class);
    private static WebDriver webDriver;
    AppWaiter appWaiter;

    public MainPage() {
        appWaiter = new AppWaiter(UIDriverManager.webDriver);
    }

    public static WebElement getSearchBoxMainPage(){
        return UIDriverManager.webDriver.findElement(By.xpath("//INPUT[@class='header-search-input']"));
    }

    public static WebElement getSearchIcon(){
        return UIDriverManager.webDriver.findElement(By.xpath("//i[@class='la la-search']"));
    }


    //***************************Main Page Methods***************************//

    public void enterProductInSearchBox(String product) throws IOException {
        appWaiter.waitUntilElementVisible(getSearchBoxMainPage());
        getSearchBoxMainPage().sendKeys(product);
        getSearchIcon().click();
    }

    public void openApplication() throws IOException {
        webDriver.get("https://testscriptdemo.com/");
        log.info("Entered the URL successfully");
    }


}
