
  Feature:As an Admin user I should be able to see notification messages displayed, when I click on Save button without entering mandatory fields.

    Background:
      Given Navigate to site
      When Login as an Admin and navigate to Admin UserManagement Page

    Scenario:Message displayed when click save button
      When Click on Add newButton
      And click save button before entering mandatory fields
      Then verify that notification messaged in red color displayed



