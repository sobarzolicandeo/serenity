Feature: Login in Swag Labs

  @TC-001
  Scenario: Successful login to swag labs
    Given I open the swab labs login page
    When I login with credentials "valid_user" and "valid_password"
    Then I verify that the login is successful

