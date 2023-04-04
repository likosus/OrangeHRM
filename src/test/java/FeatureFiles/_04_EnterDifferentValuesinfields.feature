
  Feature: As an Admin user I should be able to see notification messages displayed, when I enter different values in to the “password’ and “password confirm” fields
    Background:
      Given Navigate to Campus
      When Login as an Admin and navigate to Admin/UserManagement Page
      Then Click on Add Button
    Scenario: Enter different values in to the Password
      And enter value in to the password field
      Then verify notification messages"Password do not Match"

