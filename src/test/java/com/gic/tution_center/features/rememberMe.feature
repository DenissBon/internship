Feature: Testing Remeber Me feature on Login page

  @RememberMeUnchecked
  Scenario: Remember Me unchecked by default
    Given   I am on landing page "http://demo.dontonno.com/cms-test-v2/auth/login"
    Then    Remember Me check box is not selected

  @RememberMeChecked
  Scenario: Remember me checked
    Given  I am on the landing page "http://demo.dontonno.com/cms-test-v2/auth/login"
    When   i provide admin username and password <"admin@coaching.com"> <"22091671">
    And     i select Remember Me check box
    And     i click Login buton
    And     i logout
    And     i restart the browser
    And     i launch the application "http://demo.dontonno.com/cms-test-v2/auth/login"
    Then    i should see the username and passwrod field is remembered and should be login
