package swaglabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import swaglabs.actions.InventorySteps;
import swaglabs.actions.LoginSteps;

public class LoginStepDefs {

    @Steps
    LoginSteps login;

    @Steps
    InventorySteps inventory;

    @Given("I open the swab labs login page")
    public void iOpenTheSwabLabsLoginPage() {
        login.opensTheLoginPage();
    }

    @When("I login with credentials {string} and {string}")
    public void iLoginWithCredentialsAnd(String username, String password) {
        login.loginWithCredentials(username, password);
    }

    @Then("I verify that the login is successful")
    public void iVerifyThatTheLoginIsSuccessful() {
        inventory.verifyLoginSuccess();
    }
}

