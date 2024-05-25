Feature: Login in Swag Labs

  @TC-001
  Scenario: Successful login to swag labs
    Given I open the swab labs login page
    When I login with credentials “standard_user” and “secret_sauce”
    Then I verify that the login is successful