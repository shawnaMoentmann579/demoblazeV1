Feature: Cart

  @1Phone
  Scenario: Add one phone item to the cart
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Samsung galaxy
    Then page title should be "STORE"
    When user clicks on add to cart
    And clicks cart in the nav bar
    Then user should see item in the cart
    When user clicks on place order
    And enters information
    And clicks purchase
    Then user should see purchase confirmation message
    And clicks ok
    Then page title should be "STORE"
    And close browser

    @2Phones
    Scenario: Add multiple phone items to cart
      Given user launches browser
      When user opens URL "https://www.demoblaze.com/"
      And clicks on Samsung galaxy
      Then page title should be "STORE"
      When user clicks on add to cart
      And clicks on nav bar home
      And clicks on Nokia lumia
      Then page title should be "STORE"
      When user clicks on add to cart again
      And clicks cart in the nav bar
      Then user should see item in the cart
      And close browser

      @1Laptop
  Scenario: Add one laptop item to the cart
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Laptops Category
    And clicks on Sony vaio
    Then page title should be "STORE"
    When user clicks on add to cart for laptop
    And clicks cart in the nav bar
    Then user should see item in the cart
    And close browser

  @2Laptops
  Scenario: Two laptops in cart
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Laptops Category
    And clicks on Sony vaio
    Then page title should be "STORE"
    When user clicks on add to cart
    And clicks on nav bar home
    And clicks on MacBook Air
    Then page title should be "STORE"
    When user clicks on add to cart again
    And clicks cart in the nav bar
    Then user should see item in the cart
    And close browser

    @OneMonitor
  Scenario: One Monitor in the cart
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Monitors Category
    And clicks on Apple Monitor
    Then page title should be "STORE"
    When user clicks on add to cart for monitor
    And clicks cart in the nav bar
    Then user should see item in the cart
    And close browser

      @TwoMonitors
  Scenario: Two Monitors in the cart
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Monitors Category
    And clicks on Apple Monitor
    Then page title should be "STORE"
    When user clicks on add to cart for monitor
    And clicks on nav bar home
    And clicks on ASUS FULL HD
    Then page title should be "STORE"
    When user clicks on add to cart again
    And clicks cart in the nav bar
    Then user should see item in the cart
    And close browser

        @DeleteOneOfOne
  Scenario: Delete One item in the cart
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Samsung galaxy
    Then page title should be "STORE"
    When user clicks on add to cart
    And clicks cart in the nav bar
    Then user should see item in the cart
    When user clicks delete
    Then cart should be empty
    And close browser

          @DeleteMultipleItemsFromCart
  Scenario: Delete multiple items from the cart
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on Samsung galaxy
    Then page title should be "STORE"
    When user clicks on add to cart
    And clicks on nav bar home
    And clicks on Nokia lumia
    Then page title should be "STORE"
    When user clicks on add to cart again
    And clicks on nav bar home
    And clicks on iPhone
    Then page title should be "STORE"
    When user clicks on add to cart once again
    And clicks cart in the nav bar
    Then user should see item in the cart
    When user clicks delete again
    Then cart should be empty
    And close browser

Scenario: Make a purchase with 0 items in cart
  Given user launches browser
  When user opens URL "https://www.demoblaze.com/"
  And clicks cart in the nav bar
  When user clicks on place order
  And close browser



