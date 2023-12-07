Feature: Validate both the items

  Scenario: Check the both items
    Given user Open the browser
    And user Navigates to Home page
    And click on top deal
    Then New window handle
    And search the items "Toma"
    Then validate the both item