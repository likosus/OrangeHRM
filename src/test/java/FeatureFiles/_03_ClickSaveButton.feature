Feature:As an Admin user I should be able to see notification messages displayed, when I click on Save button without entering mandatory fields.

  Scenario:Message displayed when click save button

    Given Navigate to site
    When Login as an Admin and navigate to Admin UserManagement Page New
    When Click on Add Button New
    And click save button before entering mandatory fields
    Then verify that notification messaged in red color displayed
