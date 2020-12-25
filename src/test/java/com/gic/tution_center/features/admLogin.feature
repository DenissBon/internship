Feature: Validation of Administrator Login
  The user should be able to login with admin credentials.
  The user should be logout when the Logout option is clicked
  The user should be logout when the Logout option is selected using keyboard

  @AdminLogin
  Scenario: Login validation with administrator credentials
    Given I am on the application login page "http://demo.dontonno.com/cms-test-v2/auth/login"
    When  I enter valid value to username field "admin@coaching.com"
    And   I enter valid value to password field "22091671"
    And   I click Login button
    Then  I should be in application dashboard page

   @AdminLogout
   Scenario: Admin Logout Check
      Given  i am on the login page "http://demo.dontonno.com/cms-test-v2/auth/login"
      When   i enter admin username as "admin@coaching.com"
      And    i enter admin password as "22091671"
      And    i click login button
      And    i should see admin login page
      And    i click avatar
      And    i click Logout from drop down
      Then   i should be logged out from admin and login page should be loaded

  @AdminLogoutKeyboard
  Scenario: Admin Logout Check with keyboard
    Given  i am on login page "http://demo.dontonno.com/cms-test-v2/auth/login"
    When   i enter admin username and password <"admin@coaching.com"> <"22091671">
    And    i click on login button
    And    i should see admin login page and i click avatar
    And    i press tab to reach Logout from drop down
    And    i press enter key
    Then   i should be logged out from admin and back to login page

