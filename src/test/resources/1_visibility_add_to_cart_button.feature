Feature: Add to card button is displayed

  Scenario Outline: Verification of enabled Add to cart button for products than is NOT in cart
    Given I open ebay site
    When I open product details page for "<request>"
    Then Add to cart button should be displayed

    Examples:
      | request        |
      | iPhone 4S      |
      | Samsung Galaxy |