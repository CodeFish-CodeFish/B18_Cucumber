Feature: login functionality

  Scenario Outline: negative test for login functionality
    Given user is on main page of qa fox user clicks on myAccount and clicks on login
    Then user is on login page and validates title '<title>'
    And user enters '<email>' and then '<password>' and clicks on login button and validate '<errorMessage>'
    Examples: test data for qa fox
      | email         | password  | errorMessage                                          | title         |
      | fgfg@hghg.com | !@#@$#    | Warning: No match for E-Mail Address and/or Password. | Account Login |
      |               | 123124324 | Warning: No match for E-Mail Address and/or Password. | Account Login |
      | ertetwertre   |           | Warning: No match for E-Mail Address and/or Password. | Account Login |


