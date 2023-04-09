Feature:

  Scenario: Password Control

    Given Navigate to site
    When Login as an Admin and navigate to Admin User Management Page
    Then Click  admin and click to Add Button
    When Enter less than eight characters in Passport field
    Then verify messages Should have at least eigth characters