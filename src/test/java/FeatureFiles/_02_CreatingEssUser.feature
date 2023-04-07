
  Feature:
Background:
      Given Navigate to site
      When Login as an Admin and navigate to Admin UserManagement Page
      Then Click on Add Button

      Scenario: validate creating an ESS User account by providing Mandatory fields
      And click save button before entering mandatory field
      Then verify that notification messages in red color displayed
