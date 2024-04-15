Feature: Cart Management

  Scenario: Add a product to the cart and proceed to checkout
    Given I open the browser
    When I navigate to "https://www.daraz.com.bd/#hp-official-stores"
    Then I should see the page title "Online Shopping in Bangladesh: Order Now from Daraz.com.bd"
    When I search for a product "Router"
    Then I should see search results contain "Router"
#    When I add the product to the cart
#    Then I should see the product added to the cart

