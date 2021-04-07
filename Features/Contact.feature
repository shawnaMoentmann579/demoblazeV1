Feature: Contact page

  Scenario: Contact us
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on nav Contact
    And enters contact information
    And clicks Send message
    And close browser

  Scenario Outline: Invalid Contact us
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on nav Contact
    And enters invalid contact "<email>" and "<name>" and "<message>"
    And clicks Send message
    And close browser
    Examples:
    | email | name | message |
    |  | Jonathan Dale | Hello World! |
    | user@gmail.com |  | Hello World! |
    | user@gmail.com | Anna Marie Mavis |  |
    |  |  |  |