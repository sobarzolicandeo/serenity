package swaglabs.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class LoginPage extends PageObject {
   public static final By LOGIN_CONTAINER = By.cssSelector("[data-test='login-container']");
}
