Feature: Product Search

  Scenario: Search for a product
    Given I open the browser
    When I navigate to "http://example.com"
    When I search for a product "Example Product"
    Then I should see search results