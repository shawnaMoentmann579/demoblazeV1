Feature: Login
@Login
  Scenario: Successful login with valid credentials
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Log in
    And enters username and password
    And clicks on login
    Then page title should be "STORE"
    When user clicks on log out
    Then page title should be "STORE"
    And close browser

  @Login
  Scenario Outline: Login Data Driven
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Log in
    And enters invalid username as "<username>" and password as "<password>"
    And clicks on login
    And close browser
    Examples:
      | username | password |
      | Tbone | c |
      | Melissa | test123 |
      |  |  |

