Feature:
  Background:create username already taken one
    When Login as an Admin and navigate to Admin/UserManagement Page
    Then Click on Add Button
    Scenario:
      When verify all elements are displayed
