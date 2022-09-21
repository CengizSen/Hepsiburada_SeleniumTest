package pages;

import driver.Driver;
import methods.Methods;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static constants.LoginConstants.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoginPage extends Driver {
    Methods methods;
    Actions actions = new Actions(driver);


    public LoginPage() {
        methods = new Methods();

    }

    public void LoginPageController() throws InterruptedException {

        assertTrue(methods.isElementVisible(BUTTON_LOGIN, 20));
        System.out.println("=========LoginCheck=====");
        System.out.println("Giriş Yap Butonu Kontrol Edildi");
        assertTrue(methods.isElementVisible(TEXT_LOGIN ,20));
        System.out.println("Search Text  Kontrol Edildi");
        Thread.sleep(5000);
    }

    public void LoginSendText() throws InterruptedException {

    /*  WebElement sendText=driver.findElement(By.cssSelector("input[id=\"txtUserName\"]"));
        Thread.sleep(2000);
        sendText.sendKeys("cengiztestinium@gmail.com");
        Thread.sleep(2000);
        methods.clickElement(By.cssSelector("button[id=\"btnLogin\"]"));
        Thread.sleep(2000);

        assertTrue(methods.isElementVisible(By.cssSelector("span[data-test-id=\"span\"]"),20));
        System.out.println("=====Password Login Check======");
        WebElement passwordText=driver.findElement(By.cssSelector("input[id=\"txtPassword\"]"));
        passwordText.sendKeys("Test12345");
        Thread.sleep(2000);
        methods.clickElement(By.cssSelector("button[id=\"btnEmailSelect\"]"));
        Thread.sleep(2000);

*/
        methods.clickElement(GOOGLE_BUTTON);
        Thread.sleep(2000);
        WebElement emailText = driver.findElement(EMAIL_TEXT);
        Thread.sleep(2000);
        emailText.sendKeys(EMAIL);
        Thread.sleep(1000);
        methods.clickElement(NEXT_PAGE);
        Thread.sleep(2000);


        WebElement pswText = driver.findElement(PASSWORD_TEXT);
        Thread.sleep(2000);
        pswText.sendKeys(PASSWORD);
        Thread.sleep(1000);
        methods.clickElement(PASSWORD_PAGE_NEXT);
        Thread.sleep(5000);

    }


}
