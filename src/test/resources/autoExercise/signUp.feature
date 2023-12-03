Feature: Sign up functionality
  Scenario: Happy Path
    Given user is on main page and provides username and email and clicks signUp
    When user is sign up page user verifies that user is on sign up page
    Then user checks mr radio and provides full name
    And user verifies entered email and provides password
    Then user provides their birthdate
    And user enters first name and last name
    Then user enters address and chooses their country
    And user provides state and city
    Then user enters zipCode and phone number
    And user clicks on create button
    Then finally user verifies account created message


