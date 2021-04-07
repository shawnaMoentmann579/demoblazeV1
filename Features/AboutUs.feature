Feature: About Us

  Scenario: About Us Video
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on nav About Us
    And Clicks play
    Then user should hear the video
    And clicks close
    And close browser

    @PressPlayAndPause
  Scenario: Press pause and play
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on nav About Us
    And Clicks play
    Then user should hear the video
    And user clicks pause icon
    And clicks play icon
    And close browser

      @Mute
  Scenario: Mute Video
        Given user launches browser
        When user opens URL "https://www.demoblaze.com/"
        And clicks on nav About Us
        And Clicks play
        Then user should hear the video
        And user clicks mute button
        And close browser

      @pictureInPicture
  Scenario: Picture in Picture
    Given user launches browser
    When user opens URL "https://www.demoblaze.com/"
    And clicks on nav About Us
    And Clicks play
    Then user should hear the video
    And user clicks picture in picture button
    And close browser
