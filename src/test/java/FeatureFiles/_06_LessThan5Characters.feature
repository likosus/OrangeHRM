Feature: As an Admin user I should be able to see notification messages displayed, when I enter a value in to the username field which is less than 5 characters.
  Background:
    When Login as an Admin and navigate to Admin/UserManagement Page
    Then Click on Add Button
    Scenario:
    And create username less than 5 characters
    Then verify message "Should be at least 5 characters"
