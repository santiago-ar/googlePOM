Feature: Google Homepage Search

@TestCase1
 Scenario: User can search with “Google Search”
    Given Im on the homepage
    When I do a search of The name of the wind
    Then the first result is El nombre del viento (The Name of the Wind)
     When I click on the first result link
  #  Then I go to the “Patrick Rothfuss - The Books” page
