@smoke
Feature: login process
  Background: authentication
    Given user enters email as 'guest1@microworks.com' and password as 'Guest1!' and clicks on signIn
    Then user validates title of login page as 'ORDER DETAILS - Weborder'
    When user clicks on group order radio button and clicks on next button

    Scenario: check with home location
      When user is on group order page user verifies that 'My House' is selected
      Then user validates address as '3137 3137 Laguna Street'
      And user enters notes for guests as 'take your shoes off man'
      Then user enters emails for friends as 'test@test.com' and 'test@test.io'
      And user finally clicks on create group order button
      Then user validates header is this 'View Group Order' and participant number 1


  Scenario: check office location
    When user is on group order page user verifies that 'Office' is selected
    Then user validates address as '2012 EMPIRE BLVD'
    And user enters notes for guests as 'put your shoes on dude'
    Then user enters emails for friends as 'friend@test.io' and 'nonfriend@test.com'
    And user finally clicks on create group order button
    Then user validates header is this 'View Group Order' and participant number 1






