Feature: Login Page Functionality
   
  @important
  Scenario Outline: Validating login page with mutipe data
   
    Given User is on LoginPage
    When User enters <username> and <password>
    And User clicks on login button
    Then User navigated to homepage

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | standarduser  | secretsauce  |
      | standard_user | secretsauce |
      | standarduser  | secret_sauce |

    @regression    
    Scenario: testcase 1
    Given 
    When 
    And 
    Then
    
    @smoke    
    Scenario: testcase 2
    Given 
    When 
    And 
    Then
    
    @smoke  @regression 
    Scenario: testcase 3
    Given 
    When 
    And 
    Then
    
    @smoke  @important 
    Scenario: testcase 4
    Given 
    When 
    And 
    Then
    
    