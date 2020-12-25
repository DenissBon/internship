@AdminLoginNegativeTests
Feature: Admin login negative tests

  @BlankUsernamePassword
  Scenario: Blank username and password
    Given  one i am in login page  "http://demo.dontonno.com/cms-test-v2/auth/login"
    When   i leave username and password fields blank and click Login button
    Then   one login should fail with messages <"The Email/Username field is required."> <"The Password field is required.">

  @BlankUsername
  Scenario: Blank username field
    Given two i am on login page  "http://demo.dontonno.com/cms-test-v2/auth/login"
    When  i leave username field blank and enter valid password into Password field <"22091671">
    And   two i click Login button
    Then  two login should fail with message <"The Email/Username field is required.">

  @BlankPassword
  Scenario: Blank Password field
    Given three i am on login page "http://demo.dontonno.com/cms-test-v2/auth/login"
    When  i enter valid username and leave the Password field blank <"admin@coaching.com">
    And   three i click Login button
    Then  three login should fail with message <"The Password field is required.">

  @UnregisteredUsername
  Scenario: Login with un-registered username
    Given four i am on login page "http://demo.dontonno.com/cms-test-v2/auth/login"
    When  i enter un-registered username and password <"testerone@coaching.com"> <"tcadln">
    And   four i click Login button
    Then  four login should fail with message <"Incorrect Login">

  @IncorrectAdminPassword
  Scenario: Login with incorrect Admin password
    Given five i am on login page "http://demo.dontonno.com/cms-test-v2/auth/login"
    When  i enter valid admin username and incorrect admin password <"admin@coaching.com"> <"incorrect234">
    And   five i click login button
    Then  five login should fail with message <"Incorrect Login">

