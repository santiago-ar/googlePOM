Feature: Google Homepage Search

@TestCase1
 Scenario: User can search with “Google Search”
    Given Im on the homepage
    When I type The name of the wind into the search field
        And I click the Google Search button
    Then the first result is El nombre del viento (The Name of the Wind)
     When I click on the first result link
    Then I go to page

  @TestCase2
   Scenario: User can search by using the suggestions
      Given Im on the homepage
      When I type The name of the w into the search field
        And the suggestions list is displayed
        And I click on the first suggestion in the list
      Then the first result is El nombre del viento (The Name of the Wind)
       When I click on the first result link
      Then I go to page

