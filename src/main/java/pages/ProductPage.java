package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.spec.ECField;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static constants.ProductConstants.*;

public class ProductPage extends Driver {
    Methods methods;
    Actions actions = new Actions(driver);
    Random random = new Random();


    public ProductPage() {
        methods = new Methods();

    }


    public void randomProductSelected() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,800)");
        Thread.sleep(3000);

        List<WebElement> products = Methods.findElements(PRODUCTS_SELECTED);
        System.out.println("boyutu : " + products.size());
        Random productSize = new Random();
        int rnd = productSize.nextInt(products.size());

        System.out.println("Random üretilen Sayı:" + rnd);

        WebElement randomProduct = products.get(rnd);
        randomProduct.click();
        Thread.sleep(3000);
/*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(5000);
        String selected = String.format("li[type=\"comfort\"]", random.ints(4));
        driver.findElement(By.cssSelector(selected)).click();
        Thread.sleep(5000);
        */


    }


    public void addToCart() throws InterruptedException {
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(3000);
        methods.clickElement(ADD_TO_CART);
        Thread.sleep(7000);
    }


    public void goToCart() throws InterruptedException {


        methods.clickElement(CLOSE_CART_POPUP);
        Thread.sleep(3000);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,0)");
        methods.clickElement(GO_TO_CART);
        Thread.sleep(3000);
    }


    public void addToProduct() throws InterruptedException {
        methods.clickElement(ADD_TO_PRODUCTS_CART);
        Thread.sleep(3000);
    }

    public void finishToShopping() throws InterruptedException {
        methods.clickElement(FINISH_SHOP_BUTTON);
        Thread.sleep(3000);
    }


}

