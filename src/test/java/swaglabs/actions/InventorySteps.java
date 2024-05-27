package swaglabs.actions;

import net.serenitybdd.annotations.Step;
import swaglabs.pageobjects.InventoryPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class InventorySteps {

    InventoryPage inventoryPage;

    @Step
    public void verifyLoginSuccess() {
        assertThat("ERROR: Botón del menú no se está desplegando", inventoryPage.waitForMenuBtn(), is(true));
        assertThat("ERROR: Botón del carrito no se está desplegando", inventoryPage.waitForCartBtn(), is(true));
    }
}
