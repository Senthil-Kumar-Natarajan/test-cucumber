package com.test.bdd.servicetesting.stepDefinition;

import com.test.bdd.servicetesting.Pages.*;
import com.test.bdd.servicetesting.UtilityHelper.LoggerHelper;
import com.test.bdd.servicetesting.UtilityHelper.UtilHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

import java.io.IOException;

import static com.test.bdd.servicetesting.UtilityHelper.UtilHelper.*;
import static com.test.bdd.servicetesting.UtilityHelper.UtilHelper.ITEM_4;

public class StepDef {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    WishListPage wishListPage = new WishListPage();
    ProductItemsPage productItemsPage = new ProductItemsPage();
    CartPage cartPage = new CartPage();
    Logger log = LoggerHelper.getLogger(StepDef.class);
    UtilHelper utilHelper = new UtilHelper();

    @When("I add four different products to my wish list")
    public void search4Products() throws IOException, InterruptedException {
        loginPage.openApplication();
        mainPage.enterProductInSearchBox(ITEM_1);
        productItemsPage.selectProductToWishList(ITEM_1);
        mainPage.enterProductInSearchBox(ITEM_2);
        productItemsPage.selectProductToWishList(ITEM_2);
        mainPage.enterProductInSearchBox(ITEM_3);
        productItemsPage.selectProductToWishList(ITEM_3);
        mainPage.enterProductInSearchBox(ITEM_4);
        productItemsPage.selectProductToWishList(ITEM_4);
        log.info("Able to Add 4 products to WishList");
    }

    @When("I view my wishlist table")
    public void viewWichList() throws IOException, InterruptedException {
        wishListPage.clickWishListIconAndGetItemDetails();
        log.info("Able to View My Wishlist");
    }

    @Then("^I  find total \"([^\"]*)\" selected items in my wishlist$")
    public void validateMyWishList(String count) throws Throwable {
        wishListPage.verifyAll4ItemsGetAddedInWishList(count);
    }

    @Then("^I search for the lowest price product$")
    public void searchLowestPriceItemInWishList() throws Throwable {
        wishListPage.getLowestPriceItem();
    }

    @Then("^I am able to add the lowest price item to my cart$")
    public void addLowestPriceItemToCart() throws Throwable {
        wishListPage.clickLowestPriceItemToCart();
        log.info("Able to Add lowest price item into My Cart");
    }

    @Then("^I am able to verify the item in my cart$")
    public void verifyAbleToCheckOut() throws Throwable {
        cartPage.verifyItemInCart();
        log.info("Able to Add Item gest added in Cart & Total Details get displayed");
    }
}
