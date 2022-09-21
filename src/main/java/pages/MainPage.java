package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static constants.GuestConstants.HB_LOGO;
import static constants.GuestConstants.SEARCH_BOX;
import static constants.MainConstants.*;
import static java.awt.SystemColor.window;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage extends Driver {

    Methods methods;
    Actions actions = new Actions(driver);


    public MainPage() {
        methods = new Methods();

    }


    public void MainPageController() throws InterruptedException {


        assertTrue(methods.isElementVisible(HB_LOGO, 20));
        System.out.println("HepsiBurada Logosu Kontrol Edildi");
        Thread.sleep(3000);
        assertTrue(methods.isElementVisible(SEARCH_BOX, 20));
        System.out.println("Search Aktif Kontrol Edildi");
        Thread.sleep(3000);
    }

    public void searchMainBox() throws InterruptedException {

        WebElement searchTextMain = driver.findElement(MAIN_SEARCH_BOX);
        searchTextMain.sendKeys(SEARCH_KEYWORD);
        Thread.sleep(3000);
        methods.clickElement(MAIN_SEARCH_BOX_CLICK);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(3000);

    }

    public void selectMainFilter() throws InterruptedException {
        WebElement searchCheckbox = driver.findElement(FILTER_CLICK);
        searchCheckbox.click();
        Thread.sleep(3000);
        searchCheckbox.sendKeys(SEARCH_KEYWORD_FILTER);
        Thread.sleep(3000);
        WebElement checkBox = driver.findElement(FILTER_SELECTED_ITEM);
        actions.doubleClick(checkBox).perform();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);


    }

}
