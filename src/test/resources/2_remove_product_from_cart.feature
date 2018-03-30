Feature: Remove product from cart

  Scenario: Verification of adding product to cart
    Given I navigate to product details page for "ser"
    When I click on add to cart button
    Then Shopping cart page should be opened for the product


  Scenario: Verification remove product from cart
    Given I navigate to shopping cart page
    When I delete the first product from cart
    Then Shopping cart should be empty