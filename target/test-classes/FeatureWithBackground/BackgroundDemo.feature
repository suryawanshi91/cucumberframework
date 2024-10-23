Feature: Validating Home page

  Background: Login Steps
    Given User is on Login page
    When User enters username and password
    And clicks on login Button
    Then User landed on homepage

  Scenario: Adding product to the cart
    And User clicks on add to cart button
    Then Product added to the cart

  Scenario: Checking logout option
    And User clicks on menu
    Then Logout option is visible
