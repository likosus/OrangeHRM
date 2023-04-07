
  Feature:As an Admin user I should be able to see notification messages displayed, when I click on Save button without entering mandatory fields.

    Background:
      Given Navigate to site
      When Login as an Admin and navigate to Admin UserManagement Page
      Then Click on Add Button
    Scenario:Message displayed when click save button
      And click save button before entering mandatory field
      Then verify that notification messaged in red color displayed



