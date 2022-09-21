package constants;

import org.openqa.selenium.By;

public class ProductConstants {
    public static final String  SEARCH_KEYWORD="Bilgisayar";

    public static final By PRODUCTS_SELECTED = By.cssSelector("li[type=\"comfort\"]");
    public static final By ADD_TO_CART = By.cssSelector("button[id=\"addToCart\"]");
    public static final By GO_TO_CART = By.cssSelector("span[id=\"shoppingCart\"]");
    public static final By ADD_TO_PRODUCTS_CART = By.cssSelector("a[aria-label=\"Ürünü Arttır\"]");
    public static final By FINISH_SHOP_BUTTON = By.cssSelector("button[id=\"continue_step_btn\"]");
    public static final By CLOSE_CART_POPUP = By.xpath("//div[@data-test-class=\"modal_overflow\"]//div/h1/a");




}
