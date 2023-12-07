Feature: Login and Add to card functionality

  Scenario: Check the login and add to cart functionality
    Given Browser is open
    And Navigated to Home page
    When Click on add to cart button
    Then Click on cart button
    And verify the added item
    When click on proceed checklit
    And Navigated to place order
    Then click on place order
    When select the country from drop down
    And click on agree check box
    Then click on proceed
