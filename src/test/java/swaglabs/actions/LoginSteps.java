package swaglabs.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.support.ui.WebDriverWait;
import swaglabs.pageobjects.LoginPage;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class LoginSteps extends UIInteractionSteps {

    LoginPage loginPage;

    @Step
    public void opensTheLoginPage() {
        loginPage.open();
    }

    @Step
    public void loginWithCredential(String user, String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        withTimeoutOf(Duration.ofSeconds(10))
                .waitFor(visibilityOfElementLocated(LoginPage.LOGIN_CONTAINER));
    }
}
