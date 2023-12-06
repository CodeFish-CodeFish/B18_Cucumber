Feature: Age and ascending, descending order functionality
  Scenario: Validate age is more than thirty and up
    Given User is on main page of lambda
    Then User clicks on table sorting link
    And User validates that there are ages thirty and up
    Then User closes the window


   Scenario: Validate names are in ascending and descending order
     When user is main page user clicks on sort link
     Then user validates that names are in ascending order
     And user validates that names are in descending order





