Feature: To verify the category function

  Background: 
    Given user launch ebay application

  Scenario: user search a product and apply the category option
    When user choose  electronic category
    And user choose subcategory cellphone,smart watches&accessories and branch
    And user select seeall button
    And user select filters
    And user click apply button
    Then user see results based on applied filters
