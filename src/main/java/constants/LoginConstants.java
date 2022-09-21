package constants;

import org.openqa.selenium.By;

public class LoginConstants {
    public static final String EMAIL="gulserentestinium@gmail.com";
    public static final String PASSWORD="Test1234.";

    public static final By BUTTON_LOGIN = By.cssSelector("button[id=\"btnLogin\"]");
    public static final By TEXT_LOGIN = By.cssSelector("input[id=\"txtUserName\"]");
    public static final By GOOGLE_BUTTON = By.cssSelector("button[id=\"btnGoogle\"]");

    public static final By EMAIL_TEXT = By.cssSelector("input[type=\"email\"]");

    public static final By NEXT_PAGE = By.cssSelector("div[id=\"identifierNext\"]");

    public static final By PASSWORD_TEXT = By.cssSelector("input[type=\"password\"]");

    public static final By PASSWORD_PAGE_NEXT = By.cssSelector("div[id=\"passwordNext\"]");
}
