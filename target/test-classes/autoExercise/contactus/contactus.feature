Feature: contact us form

  Scenario: positive path for contact us form
    Given user is on main page and user validates home page as
      | title | Automation Exercise |
    And user clicks on contact us button
    Then user verifies on contact us page the header
      | header | GET IN TOUCH |
    And user enters name and email as follows
      | name  | Kobe          |
      | email | test@test.com |
    Then user enters subject line followed by message body
      | subject | complain about your product                     |
      | message | please review your product it really is awesome |
    And user uploads a file as an evidence
    Then user clicks on submit button and validates the text on alert as follows and accepts it
      | textOnAlert | Press OK to proceed! |
    And user validates that message was sent successfully as follows
      | successMessage | Success! Your details have been submitted successfully. |
    Then user clicks on home button and verifies that user is landed on home page by title
      | title | Automation Exercise |
