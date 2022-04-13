Feature: To validate login functionality
  Scenario: to validate wrong username and correct password
    Given User must be in chrome browser
    And User should pass the url 
    When user should enter values in username fields
    |Sasi|suisa|
    And user Shouldd enter values in password field
    Then user must be in login page
