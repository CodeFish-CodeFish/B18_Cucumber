Feature: login functionality

  Background: login process
    When user is on login page user validates title is 'Administration'
    Then user provides username as 'demo' and password as 'demo'
    And user clicks on login button
    When user is mainpage user clicks on x button to close popup


   Scenario: Check status column values are displayed
     Then user scrolls down and validates all status column values are displayed
     And user validates dates column values are displayed

   Scenario: Check one record and comment in the box
     Then user scrolls down and clicks on record from the table
     And user comments in the box as 'Your record needs attention' and clicks add to history button




