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

  Scenario Outline: for smartbear
    When user is on login page user provides '<username>' for username and '<password>' for password clicks on loginBtn
    Then user chooses '<productName>' from the dropdown and provide quantity as '<quantity>'
    And user provides price as 10 and discount as 20
    Then user provides total number as '<total>'
    And user enters their name as '<name>' and street address as '<address>'
    Then user enters city as '<city>' and state as '<state>' and zip as '<zipCode>'
    And user clicks on visa and provides card number as '<cc>' and expiration as '<expiration>'
    And user finally clicks on process button

    Examples: test data for smartbear
      | username | password | productName | quantity | total | name        | address      | city          | state      | zipCode | cc            | expiration |
      | Tester   | test     | ScreenSaver | 200      | 55    | Kuan Abdy   | River Rd     | Chitown       | Oshington  | 60659   | 5654654654654 | 12/99      |
      | Tester   | test     | FamilyAlbum | 1        | 99    | Rambo       | Dearborn st  | Chicago       | Illinois   | 60625   | 87987979879   | 12/29      |
      | Tester   | test     | MyMoney     | 55       | 32    | Jackie Chan | W Adams      | LA            | California | 1212121 | 546978213213  | 12/66      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |
      | Tester   | test     | ScreenSaver | 100      | 22    | Bruce Lee   | Michigan Ave | San Francisco | California | 60656   | 12321321321   | 12/25      |




