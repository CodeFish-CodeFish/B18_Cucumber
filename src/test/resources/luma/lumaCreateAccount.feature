Feature: create an account functionality

  Scenario: positive scenario for creating an account
    Given user is on main page and clicks on create account link
    Then user enters firstname and lastname as follows
      | firstname | Kobe   |
      | lastname  | Tester |
    And user enters their email as follows
      | email | test@tr.io |
    Then user provides strong passwords and confirms passwords
      | password1 | 25852abdf# |
      | password2 | 25852abdf# |
    And user clicks on create account button and validates successMessage
      | successMessage | Thank you for registering with Main Website Store. |