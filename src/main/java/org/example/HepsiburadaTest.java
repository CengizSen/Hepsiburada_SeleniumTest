package org.example;

import driver.Driver;
import org.junit.jupiter.api.Test;
import pages.GuestPage;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductPage;


public class HepsiburadaTest extends Driver {

    GuestPage guestPage;
    LoginPage loginPage;

    MainPage mainPage;
    ProductPage productPage;

    @Test
    public void test() throws InterruptedException {
        init();

        guestPage.controlGuestPage();
        guestPage.loginPageClick();

        loginPage.LoginPageController();
        loginPage.LoginSendText();

        mainPage.MainPageController();
        mainPage.searchMainBox();
        mainPage.selectMainFilter();

        productPage.randomProductSelected();
        productPage.addToCart();
        productPage.goToCart();

        productPage.addToProduct();
        productPage.finishToShopping();


    }

    public void init() {

        guestPage = new GuestPage();
        loginPage = new LoginPage();
        mainPage = new MainPage();
        productPage = new ProductPage();
    }

}
