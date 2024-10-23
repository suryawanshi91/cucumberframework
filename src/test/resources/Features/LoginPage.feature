#Author
#user credentials must be existing
#requirement no 02
Feature: Login functionality

   Scenario: Validating login using valid credentials
    Given User open browser and launch url
    When  user enters username and password
    And   user clicks on login button
    Then  user navigated to index page

    