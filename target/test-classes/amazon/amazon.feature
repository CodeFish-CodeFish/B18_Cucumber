Feature: check title
#  Scenario: validate amazon title based on hats
#    When User is on amazon main page user searches for 'hats'
#    Then User validates that title is 'Amazon.com : hats'
#
#  Scenario: validate amazon title based on shoes
#    When User is on amazon main page user searches for 'shoes'
#    Then User validates that title is 'Amazon.com : shoes'
#
#
# Scenario: validate amazon title based on mouse
#   When User is on amazon main page user searches for 'mouse'
#   Then User validates that title is 'Amazon.com : mouse'


  Scenario Outline: validation for amazon item titles
    When User is on amazon main page user searches for '<items>'
    Then User validates that title is '<title>'

    Examples: test data for amazon
      | items   | title                |
      | hats    | Amazon.com : hats    |
      | shoes   | Amazon.com : shoes   |
      | mouse   | Amazon.com : mouse   |
      | t-shirt | Amazon.com : t-shirt |

