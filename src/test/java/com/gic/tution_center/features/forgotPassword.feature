Feature: Recover Password from Forgot your password link Tests

  @PasswordRecoveryPage
  Scenario: To verify Forgot your password link loads Recover your password page
    Given   i am on the app login page "http://demo.dontonno.com/cms-test-v2/auth/login"
    When    i click Forgot your password link
    Then    i should be in Recover your Password page

  @RecoverAdminPassword
  Scenario: Verify if the forgot your password link provides password recovery
    Given   i am on app login page "http://demo.dontonno.com/cms-test-v2/auth/login"
    When    i click Forgot your password link on the page
    And     i enter valid admin emailID into Username field "admin@coaching.com"
    And     i click Send Recovery Link button
    Then    mail should be sent and login page should be loaded and "Password Reset Email Sent" message should display

  @RecoverPasswordUnRegEmail
  Scenario: Verify Recover password when unregistered email is entered
    Given   bbb i am on app login page "http://demo.dontonno.com/cms-test-v2/auth/login"
    When    i click Forgot your password link on page
    And     i enter unregistered email ID into Username field "testerone@coaching.com"
    And     i click Send Recovery Link btn
    Then    the app should report an error "No record of that email address."


