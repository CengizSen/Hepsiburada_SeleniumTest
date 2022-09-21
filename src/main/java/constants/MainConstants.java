package constants;

import org.openqa.selenium.By;

public class MainConstants {
    public static final String  SEARCH_KEYWORD="Bilgisayar";
    public static final String  SEARCH_KEYWORD_FILTER="HP";
    public static final By MAIN_SEARCH_BOX = By.cssSelector("input[aria-autocomplete=\"list\"]");
    public static final By MAIN_SEARCH_BOX_CLICK = By.cssSelector("div.SearchBoxOld-cHxjyU99nxdIaAbGyX7F");
    public static final By FILTER_CLICK = By.xpath("//div[@id = 'markalar']//div/div/div/div/input");
    public static final By FILTER_SELECTED_ITEM = By.xpath("//input[@value=\"hp\"]");




}
