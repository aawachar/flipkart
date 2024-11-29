Feature: Validate Sort Functionality for Products

  Scenario: Validate prices are in ascending order
    Given User opens Flipkart in Incognito mode
    When User searches for "shoes" and applies sort "Price - Low to High"
    Then Validate all product prices are in ascending order on page limit "2"
