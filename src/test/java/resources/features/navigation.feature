Feature: Example Feature

  Scenario: Verify Google title
    Given I open the browser
    When I navigate to "https://www.daraz.com.bd/#hp-official-stores"
    Then I should see the page title "Online Shopping in Bangladesh: Order Now from Daraz.com.bd"
