Feature: Proceed product to checkout

  Scenario: Verification of adding product to cart
    Given I navigate to product details page for "tes"
    When I click on add to cart button
    Then Shopping cart page should be opened for the product


  Scenario: Verification remove product from cart
    Given I navigate to shopping cart page
    When I proceed to checkout
    Then Log in page should be displayed