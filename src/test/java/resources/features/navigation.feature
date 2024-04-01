Feature: Example Feature

  Scenario: Verify Google title
    Given I open the browser
    When I navigate to "https://www.google.com"
    Then I should see the page title "Google"
