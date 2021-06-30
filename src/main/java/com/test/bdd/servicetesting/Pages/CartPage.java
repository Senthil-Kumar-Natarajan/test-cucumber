package com.test.bdd.servicetesting.Pages;

import com.test.bdd.servicetesting.UtilityHelper.AppWaiter;
import com.test.bdd.servicetesting.UtilityHelper.LoggerHelper;
import com.test.bdd.servicetesting.UtilityHelper.UIDriverManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Thread.sleep;

public class CartPage {

    static Logger log = LoggerHelper.getLogger(CartPage.class);
    AppWaiter appWaiter;

    public CartPage() {
        appWaiter = new AppWaiter(UIDriverManager.webDriver);
    }

    public static WebElement getCart() {
        return UIDriverManager.webDriver.findElement(By.xpath("//a[@class='cart-contents']"));
    }


    public static List<WebElement> getAddToCart() {
        return UIDriverManager.webDriver.findElements(By.xpath("//td[@class='product-add-to-cart']"));
    }

    public static WebElement getCartTotal() {
        return UIDriverManager.webDriver.findElement(By.xpath("//div[@class='cart-collaterals']"));
    }
    //*************************** Methods***************************//

    public void clickCart() throws InterruptedException {
        Thread.sleep(100);
        getCart().click();
    }

    public void verifyItemInCart() throws InterruptedException {
        clickCart();
        appWaiter.waitUntilElementVisible(getCartTotal());
    }


  }

