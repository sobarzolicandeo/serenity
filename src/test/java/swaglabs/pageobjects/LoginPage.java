package swaglabs.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:webdriver.base.url")
public class LoginPage extends PageObject {

   @FindBy(css =  "[data-test='login-container")
   private WebElement containerLogin;

   @FindBy(id =  "user-name")
   private WebElement inputUsername;

   @FindBy(id = "password")
   private WebElement inputPassword;

   @FindBy(id = "login-button")
   private WebElement btnLogin;

   public boolean waitForLoginContainer() {
      return waitFor(containerLogin).isDisplayed();
   }

   public void typeUsernameInput(String username){
      inputUsername.sendKeys(username);
   }

   public void typePasswordInput(String password){
      inputPassword.sendKeys(password);
   }

   public void clickLoginBtn() {
      btnLogin.click();
   }
}
