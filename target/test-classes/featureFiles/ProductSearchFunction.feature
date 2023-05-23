Feature: To verify search function

  Scenario: To verify searching product by giving valid credential
    Given user launch ebay application
    When user enter the product to search
    And user click search button
    And user choose the search category
    Then user see the products based on
