Feature: Sign Up

Scenario: Register a member
  Given user launches browser
  When user opens URL "https://www.demoblaze.com/"
  And clicks on SignUp
  And enters username as "Cody"
  And enters password as "Test123"
  And clicks on Sign Up
  Then page title should be "STORE"
  And close browser

  Scenario Outline: Register a member
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on SignUp
    And enters username as "<name>"
    And enters password as "<password>"
    And clicks on Sign Up
    Then page title should be "STORE"
    And close browser
    Examples:
    | name | password |
    | Cody | Take123 |
    |  | FakePass |
    | DJ |  |

