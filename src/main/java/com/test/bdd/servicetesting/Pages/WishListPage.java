package com.test.bdd.servicetesting.Pages;

import com.test.bdd.servicetesting.UtilityHelper.AppWaiter;
import com.test.bdd.servicetesting.UtilityHelper.LoggerHelper;
import com.test.bdd.servicetesting.UtilityHelper.UIDriverManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.*;

import static java.lang.Thread.sleep;

public class WishListPage {

    static Logger log = LoggerHelper.getLogger(WishListPage.class);
    AppWaiter appWaiter;
    ArrayList<Double> prices = new ArrayList<Double>();
    public int lowestPriceItemIndex = 0;
    public WishListPage() {
        appWaiter = new AppWaiter(UIDriverManager.webDriver);
    }

    public static List<WebElement> getDateTableRows() {
        WebElement webElement = UIDriverManager.webDriver.findElement(By.xpath("//*[@id=\"yith-wcwl-form\"]/table/tbody"));
        List<WebElement> lsRowWebElem = webElement.findElements(By.tagName("tr"));
        return lsRowWebElem;
    }

    public static List<WebElement> getDateTableRowColumns(int i) {
        List<WebElement> lsColWebElem = getDateTableRows().get(i).findElements(By.tagName("td"));
        return lsColWebElem;
    }

    public static WebElement getWishListIcon() {
        return UIDriverManager.webDriver.findElement(By.xpath("//A[@title='Wishlist']"));
    }

    public static List<WebElement> getAddToCart() {
        return UIDriverManager.webDriver.findElements(By.xpath("//td[@class='product-add-to-cart']"));
    }

    public static WebElement getCartTotal() {
        return UIDriverManager.webDriver.findElement(By.xpath("//div[@class='cart-collaterals']"));
    }
    //***************************Main Page Methods***************************//


      public void clickWishListIconAndGetItemDetails() throws InterruptedException {
          Thread.sleep(500);
          getWishListIcon().click();
          getProductDetailsFromTable();
      }

    public void getProductDetailsFromTable() throws InterruptedException {
        String[] priceRange = new String[0];
        sleep(500);
        int rowCount = getDateTableRows().size();
        for (int i = 0; i < rowCount; i++) {
            int rowColumnCount = getDateTableRowColumns(i).size();
            for (int j = 2; j < 4; j++) {
                WebElement dateElem = getDateTableRowColumns(i).get(j);
                String cellValue = dateElem.getText();
                log.info("Product Item Detail:{}" + cellValue);
                    if (cellValue.contains("£")) {
                        priceRange = cellValue.split("£");
                       // log.info("priceRange:{}" + priceRange[2]);
                        prices.add(Double.parseDouble(priceRange[2]));
                    }
                }
        }
    }

    public void verifyAll4ItemsGetAddedInWishList(String count){
        log.info("======================================");
        log.info("4 Items are there in WishList");
        Assert.assertTrue(prices.size()==Integer.parseInt(count));
        log.info("======================================");
    }


    public void getLowestPriceItem() throws InterruptedException {
        Double lowPrice = Collections.min(prices);
        log.info("Able to get Lowest Item Price:{}" + lowPrice);
        int i = 0;
        for (i = 0; i < prices.size(); i++) {
            if (prices.get(i) == lowPrice)
                break;
        }
        lowestPriceItemIndex = i;
    }

    public void clickLowestPriceItemToCart() throws InterruptedException {
        getAddToCart().get(lowestPriceItemIndex).click();
    }

  }

