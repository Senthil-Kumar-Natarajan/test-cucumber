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

public class ProductItemsPage {

    static Logger log = LoggerHelper.getLogger(ProductItemsPage.class);
    AppWaiter appWaiter;
    ArrayList<Double> prices = new ArrayList<Double>();
    public int lowestPriceItemIndex = 0;
    public ProductItemsPage() {
        appWaiter = new AppWaiter(UIDriverManager.webDriver);
    }

    public static WebElement getBlackPantToWishList() {
        return UIDriverManager.webDriver.findElement(By.xpath("//*[(@data-product-id='17' and @data-title='Add to wishlist')]"));
    }

    public static WebElement getPoloTShirtToWishList() {
        return UIDriverManager.webDriver.findElement(By.xpath("//*[(@data-product-id='19' and @data-title='Add to wishlist')]"));
    }

    public static WebElement getSinglShirtToWishList() {
        return UIDriverManager.webDriver.findElement(By.xpath("//*[(@data-product-id='20' and @data-title='Add to wishlist')]"));
    }

    public static WebElement getHardTopToWishList() {
        return UIDriverManager.webDriver.findElement(By.xpath("//*[(@data-product-id='23' and @data-title='Add to wishlist')]"));
    }


    //***************************Methods***************************//

    public void selectProductToWishList(String product) throws InterruptedException {
        Thread.sleep(500);
        if (product.equals("Black Pant")) {
            appWaiter.waitUntilElementVisible(getBlackPantToWishList());
            getBlackPantToWishList().click();
        } else if (product.equals("Polo T Shirt")) {
            appWaiter.waitUntilElementVisible(getPoloTShirtToWishList());
            getPoloTShirtToWishList().click();
        } else if (product.equals("Single Shirt")) {
            appWaiter.waitUntilElementVisible(getSinglShirtToWishList());
            getSinglShirtToWishList().click();
        } else if (product.equals("Top pants upper")) {
            appWaiter.waitUntilElementVisible(getHardTopToWishList());
            getHardTopToWishList().click();
        }
    }

  }

