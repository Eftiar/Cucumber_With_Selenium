Feature: Product Search

  Scenario: Search for a product
    Given I open the browser
    When I navigate to "https://www.daraz.com.bd/#hp-official-stores"
    When I search for a product "Router"
    Then I should see search results contain "Router"