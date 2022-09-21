package pages;

import static constants.GuestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

import driver.Driver;
import org.openqa.selenium.By;

import methods.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class GuestPage extends Driver {
    Methods methods;
    Actions actions = new Actions(driver);


    public GuestPage() {
        methods = new Methods();

    }

    public void controlGuestPage() throws InterruptedException {
        assertTrue(methods.isElementVisible(ACCOUNTS,20));
        System.out.println("Giriş Yap Butonu Kontrol Edildi");
        assertTrue(methods.isElementVisible(HB_LOGO, 20));
        System.out.println("HepsiBurada Logosu Kontrol Edildi");
        assertTrue(methods.isElementVisible(SEARCH_BOX, 20));
        System.out.println("Search Aktif Kontrol Edildi");


        System.out.println("Doğrulama Başarılı");
        Thread.sleep(2000);
    }


    public void loginPageClick() throws InterruptedException {
        WebElement LoginHover = driver.findElement(ACCOUNTS);
        Thread.sleep(2000);
        actions.moveToElement(LoginHover).perform();
        Thread.sleep(2000);
        System.out.println("Giriş Yap Butonuna Gelindi");
        WebElement LoginClick = driver.findElement(LOGIN_BUTTON);
        Thread.sleep(2000);
        actions.moveToElement(LoginClick).click().perform();
        System.out.println("Login tıklandı");
        Thread.sleep(2000);
    }


}
