Feature: Manage Routine
  As an admin user i should be able to add/edit new slot for the teacher.

  Scenario: Creating slot for the teacher

    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click Manage Routine
    And I click Add New
    And I enter Days "Monday"
    And I enter Group Table Name "Table 1 (Maths)"
    And I enter Subject "Maths"
    And I enter Teacher "Sammy Holloway"
    And I enter Start Time "06:15 PM"
    And I enter End Time "07:15 PM"
    And I click Save
    Then I should receive a successful message

@test
  Scenario: Updating slot for the teacher

    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click Manage Routine
    And I click Edit
    And I change the Group Name for "Table 4 (Science)"
    And I click Save the update
    Then I should see successful update message received

