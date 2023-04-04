Feature:
  Background:create username already taken one
    When Login as an Admin and navigate to Admin/UserManagement Page
    Then Click on Add Button
  Scenario:
    When enter passport without lower case character
 Then verify messages Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password”
