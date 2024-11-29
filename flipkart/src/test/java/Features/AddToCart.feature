Feature: Validate Add to Cart Functionality

  Scenario: Add products to cart and validate
    Given User opens Flipkart in Incognito mode
    When User searches for "shoes" and applies sort "Price - Low to High"
    And User adds second and third products to cart
    Then Validate the correct products and total price in cart
