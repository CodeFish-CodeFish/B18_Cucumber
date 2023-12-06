Feature: Web Order Functionality

  Scenario: Positive scenario to create order functionality
    When user is on login page user provides 'Tester' for username and 'test' for password clicks on loginBtn
    Then user chooses 'ScreenSaver' from the dropdown and provide quantity as '10'
    And user provides price as 10 and discount as 20
    Then user provides total number as '100'
    And user enters their name as 'Kuba Abdy' and street address as 'River Rd 60656'
    Then user enters city as 'Chitown' and state as 'Oshington' and zip as '60656'
    And user clicks on visa and provides card number as '123456789' and expiration as '10/28'
    And user finally clicks on process button