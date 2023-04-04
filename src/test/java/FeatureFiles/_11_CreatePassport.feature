Feature:
  Background:create username already taken one
    When Login as an Admin and navigate to Admin/UserManagement Page
    Then Click on Add Button
  Scenario:
    When Enter less than 8 characters in Passport field
    Then verify messages "Should have at least 8 characters"
