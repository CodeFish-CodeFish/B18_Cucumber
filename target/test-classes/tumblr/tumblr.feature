Feature: login functionality

  Scenario Outline: check login functionality and validate errorMessage
    Given user is main page and clicks on sing me up link
    Then user clicks on continue with email link
    And user enters '<email>' and clicks on next button
    Then user enters two passwords as '<password>' and '<confirmPassword>' and validate '<errorMessage>'

    Examples: test data for tumblr login
      | email         | password | confirmPassword | errorMessage                                     |
      | kun@tr.com    | 123      | 123             | The password must be at least 8 characters long. |
      | qaz@jbl.com   | 123      | 123             | The password must be at least 8 characters long. |
      | kuan@work.com | 123      | 123             | The password must be at least 8 characters long. |
