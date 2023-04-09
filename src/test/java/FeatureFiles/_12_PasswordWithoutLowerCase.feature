Feature:
  Scenario:

    Given Navigate to site
    When Login as an Admin and navigate to Admin User Management PageTwelve
    Then Click  admin and click to Add ButtonTwelve
    And enter passport without lower case character
    Then verify messages Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password”