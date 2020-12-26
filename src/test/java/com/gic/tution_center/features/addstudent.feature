Feature: Add student
  As an admin user
  I should be able to create new student record

  Scenario: Creating student with valid email address
    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I type in valid email address "Georgecane@gmail.com" along with mendetory fields
    And I click Create Student
    Then student record should be created successfully




