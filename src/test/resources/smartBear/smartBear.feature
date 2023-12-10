Feature: Web Order Functionality

#  Scenario: Positive scenario to create order functionality
#    When user is on login page user provides 'Tester' for username and 'test' for password clicks on loginBtn
#    Then user chooses 'ScreenSaver' from the dropdown and provide quantity as '10'
#    And user provides price as 10 and discount as 20
#    Then user provides total number as '100'
#    And user enters their name as 'Kuba Abdy' and street address as 'River Rd 60656'
#    Then user enters city as 'Chitown' and state as 'Oshington' and zip as '60656'
#    And user clicks on visa and provides card number as '123456789' and expiration as '10/28'
#    And user finally clicks on process button

#  Scenario Outline: for smartbear
#    When user is on login page user provides '<username>' for username and '<password>' for password clicks on loginBtn
#    Then user chooses '<productName>' from the dropdown and provide quantity as '<quantity>'
#    And user provides price as 10 and discount as 20
#    Then user provides total number as '<total>'
#    And user enters their name as '<name>' and street address as '<address>'
#    Then user enters city as '<city>' and state as '<state>' and zip as '<zipCode>'
#    And user clicks on visa and provides card number as '<cc>' and expiration as '<expiration>'
#    And user finally clicks on process button
#
#    Examples: test data for smartbear
#      | username | password | productName | quantity | total | name        | address      | city          | state      | zipCode | cc            | expiration |
#      | Tester   | test     | ScreenSaver | 200      | 55    | Kuan Abdy   | River Rd     | Chitown       | Oshington  | 60659   | 5654654654654 | 12/99      |
#      | Tester   | test     | FamilyAlbum | 1        | 99    | Rambo       | Dearborn st  | Chicago       | Illinois   | 60625   | 87987979879   | 12/29      |
#      | Tester   | test     | MyMoney     | 55       | 32    | Jackie Chan | W Adams      | LA            | California | 1212121 | 546978213213  | 12/66      |


  Scenario: positive scenario for smartBear
    When user is on login page and enters username and password as clicks on login
      | username | Tester |
      | password | test   |
    Then user chooses product and specifies quantity
      | product  | ScreenSaver |
      | quantity | 5           |
    And user enters prices as five and discount as twenty
      | price    | 5   |
      | discount | 100 |
    Then user enters total as
      | total | 300 |
    And user enters name and address as
      | name    | Kuba     |
      | address | River Rd |
    Then user enters state city and zipcode as follows
      | state   | IL      |
      | city    | Chitown |
      | zipCode | 60656   |
    And user clicks on visa radio and eners cc followed by its expiration date as
      | cc         | 123456789 |
      | expiration | 12/29     |
    Then user clicks on process button



