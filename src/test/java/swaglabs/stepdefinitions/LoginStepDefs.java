package swaglabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import swaglabs.actions.LoginSteps;

public class LoginStepDefs {

    @Steps
    LoginSteps login;

    @Given("I open the swab labs login page")
    public void iOpenTheSwabLabsLoginPage() {
        login.opensTheLoginPage();
    }

    @When("I login with credentials “standard_user” and “secret_sauce”")
    public void iLoginWithCredentialsStandard_userAndSecret_sauce() {
        login.loginWithCredential("standard_user", "secret_sauce");
    }

    @Then("I verify that the login is successful")
    public void iVerifyThatTheLoginIsSuccessful() {
    }

}
