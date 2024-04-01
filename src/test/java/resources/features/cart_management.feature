Feature: Cart Management

  Scenario: Add a product to the cart and proceed to checkout
    Given I open the browser
    When I navigate to "http://example.com"
    When I search for a product "Example Product"
    Then I should see search results
    When I add the product to the cart
    Then I should see the product added to the cart
    When I proceed to checkout
    Then I should be on the checkout page