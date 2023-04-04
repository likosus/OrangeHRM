Feature:As an Admin user I should be able to see notification messages displayed, when I enter an invalid Admin name in to the Employee name field.
  Background:
    Given Navigate to Campus
    When Login as an Admin and navigate to Admin/UserManagement Page
    Then Click on Add Button
  Scenario: Enter Invalid Admin name in Employee Name field
    And Enter verify name into the Employee name field
    Then verify messages "no records found" in red color
