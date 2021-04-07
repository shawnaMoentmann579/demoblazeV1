Feature: Previous and next buttons

  Scenario: Phone Previous and next buttons
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Phone Category
    And clicks on Previous
    Then page title should be "STORE"
    When user clicks on next
    Then page title should be "STORE"
    And close browser

  Scenario: Laptops Previous and next buttons
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Laptops Category
    And clicks on Previous
    Then page title should be "STORE"
    When user clicks on next
    Then page title should be "STORE"
    And close browser

  Scenario: Laptops Previous and next buttons
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Monitors Category
    And clicks on Previous
    Then page title should be "STORE"
    When user clicks on next
    Then page title should be "STORE"
    And close browser