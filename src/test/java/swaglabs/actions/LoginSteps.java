package swaglabs.actions;

import net.serenitybdd.annotations.Step;
import swaglabs.pageobjects.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

    LoginPage loginPage;

    @Step
    public void opensTheLoginPage() {
        loginPage.open();
        assertThat("ERROR: Formulario de login no se está desplegando", loginPage.waitForLoginContainer(), is(true));
    }

    @Step
    public void loginWithCredentials(String username, String password) {
        loginPage.typeUsernameInput(username);
        loginPage.typePasswordInput(password);
        loginPage.clickLoginBtn();
    }

}
