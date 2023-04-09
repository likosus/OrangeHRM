Feature: As an Admin user I should be able to see notification messages displayed, when I enter a value in to the username field which is less than 5 characters.
  Scenario:
    Given Navigate to site
    When Login as an Admin and navigate to Admin UserManagement Page six
    Then Click on Add Button six

    And create username less than five characters
    Then verify message Should be at least five characters