Feature:
  Scenario: :create username already taken one
    Given Navigate to site
    When Login as an Admin and navigate to Admin UserManagement PageTen
    And Click on Add ButtonTen
    Then verify add user heading displayed