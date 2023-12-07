Feature: Search and Validate the functionality

  Scenario: Check the Search and Validate functionality
    Given Open the browser
    Then User Navigates to Home page
    Given Click on search box
    And Enter the item as "Toma" in search box
    Then Click on Serach button
    And Print the item
    And Click on top deal
    Then New window handle
    And Search the items "Toma"
    Then Validate the both item
