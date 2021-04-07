Feature: Logo to home page


  Scenario: Logo image refresh on home page
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on logo image
    Then page title should be "STORE"
    And close browser

#  Scenario: Logo text refresh on home page
#      Given user launches browser
#      When user opens URL "https://www.demoblaze.com/"
#      And clicks on logo text
#      Then page title should be "STORE"
#      And close browser

#  Scenario: Logo image directs home page from Contact Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks on nav Contact
#    And clicks on close
#    And clicks on logo image
#    Then page title should be "STORE"
#    And close browser
#
#  Scenario: Logo image directs home page from About Us Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks on nav About Us
#    And clicks close
#    And clicks on logo image
#    Then page title should be "STORE"
#    And close browser
#
#  Scenario: Logo image directs home page from About Us Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks cart in the nav bar
#    And clicks close
#    And clicks on logo image
#    Then page title should be "STORE"
#    And close browser
#
#  Scenario: Logo image directs home page from Login Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks on Log in
#    And clicks on logo image
#    Then page title should be "STORE"
#    And close browser
#
#  Scenario: Logo image directs home page from Sign Up Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks on SignUp
#    And clicks on logo image
#    Then page title should be "STORE"
#    And close browser
#
#  Scenario: Logo text directs home page from Contact Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks on nav Contact
#    And clicks on logo text
#    Then page title should be "STORE"
#    And close browser
#
#  Scenario: Logo text directs home page from About Us Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks on nav About Us
#    And clicks on logo text
#    Then page title should be "STORE"
#    And close browser
#
#  Scenario: Logo text directs home page from About Us Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks cart in the nav bar
#    And clicks on logo text
#    Then page title should be "STORE"
#    And close browser
#
#  Scenario: Logo text directs home page from Login Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks on Log in
#    And clicks on logo text
#    Then page title should be "STORE"
#    And close browser
#
#  Scenario: Logo text directs home page from Sign Up Page
#    Given user launches browser
#    When user opens URL "https://www.demoblaze.com/"
#    And clicks on SignUp
#    And clicks on logo text
#    Then page title should be "STORE"
#    And close browser
#
