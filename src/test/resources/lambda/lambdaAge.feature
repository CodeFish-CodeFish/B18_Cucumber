Feature: Age functionality
  Scenario: Validate age is more than thirty and up
    Given User is on main page of lambda
    Then User clicks on table sorting link
    And User validates that there are ages thirty and up
    Then User closes the window


