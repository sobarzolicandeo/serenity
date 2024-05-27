package swaglabs.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends PageObject {

    @FindBy(id =  "menu_button_container")
    private WebElement btnMenu;

    @FindBy(id =  "shopping_cart_container")
    private WebElement btnCart;

    public boolean waitForMenuBtn() {
        return waitFor(btnMenu).isDisplayed();
    }

    public boolean waitForCartBtn() {
        return waitFor(btnCart).isDisplayed();
    }
}
