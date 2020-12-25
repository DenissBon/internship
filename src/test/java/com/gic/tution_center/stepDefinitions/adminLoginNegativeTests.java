package com.gic.tution_center.stepDefinitions;

import com.gic.tution_center.pageFactory.LoginPage;
import com.gic.tution_center.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class adminLoginNegativeTests extends CommonFunctions {

    public LoginPage loginPage;

    //Blank username and password fields test
    @Given("^one i am in login page  \"(.*?)\"$")
    public void one_i_am_in_login_page(String baseURL)   {
         loginPage = new LoginPage(driver);
         driver.get(baseURL);
         
    }

    @When("^i leave username and password fields blank and click Login button$")
    public void i_leave_username_and_password_fields_blank_and_click_Login_button() {
        loginPage.submitLoginDetails();
    }

    @Then("^one login should fail with messages <\"(.*?)\"> <\"(.*?)\">$")
    public void one_login_should_fail_with_messages(String usernameRequired, String passwordRequired)   {
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'The Email/Username field is required.')]")).getText(),usernameRequired);
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'The Password field is required.')]")).getText(), passwordRequired);
        closeBrowser();
    }

    //Username field blank and password field entered
    @Given("^two i am on login page  \"(.*?)\"$")
    public void two_i_am_on_login_page(String baseUrl)   {
        loginPage = new LoginPage(driver);
        driver.get(baseUrl);
         
    }

    @When("^i leave username field blank and enter valid password into Password field <\"(.*?)\">$")
    public void i_leave_username_field_blank_and_enter_valid_password_into_Password_field(String password) {
        loginPage.setPassword(password);
    }

    @When("^two i click Login button$")
    public void two_i_click_Login_button()   {
         loginPage.submitLoginDetails();
         
    }

    @Then("^two login should fail with message <\"(.*?)\">$")
    public void two_login_should_fail_with_message(String usernameRequired)   {
         Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'The Email/Username field is required.')]")).getText(), usernameRequired);
         closeBrowser();
    }

    //Valid username and password field blank
    @Given("^three i am on login page \"(.*?)\"$")
    public void three_i_am_on_login_page(String baseUrl)   {
        loginPage = new LoginPage(driver);
        driver.get(baseUrl);

    }

    @When("^i enter valid username and leave the Password field blank <\"(.*?)\">$")
    public void i_enter_valid_username_and_leave_the_Password_field_blank(String username)   {
         loginPage.setUserName(username);

    }

    @When("^three i click Login button$")
    public void three_i_click_Login_button()   {
        loginPage.submitLoginDetails();
         
    }

    @Then("^three login should fail with message <\"(.*?)\">$")
    public void three_login_should_fail_with_message(String passwordRequired)   {
         Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'The Password field is required.')]")).getText(),passwordRequired);
         closeBrowser();
    }

    //Login with un-registered username and password
    @Given("^four i am on login page \"(.*?)\"$")
    public void four_i_am_on_login_page(String baseUrl)   {
         loginPage = new LoginPage(driver);
         driver.get(baseUrl);
         
    }

    @When("^i enter un-registered username and password <\"(.*?)\"> <\"(.*?)\">$")
    public void i_enter_un_registered_username_and_password(String username, String password)   {
         loginPage.setUserName(username);
         loginPage.setPassword(password);

    }

    @When("^four i click Login button$")
    public void four_i_click_Login_button()   {
         loginPage.submitLoginDetails();
         
    }

    @Then("^four login should fail with message <\"(.*?)\">$")
    public void four_login_should_fail_with_message(String errorMessage)   {
         Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'Incorrect Login')]")).getText(), errorMessage);
         closeBrowser();
    }

    // Valid admin username and invalid password
    @Given("^five i am on login page \"(.*?)\"$")
    public void five_i_am_on_login_page(String baseUrl)   {
         loginPage = new LoginPage(driver);
         driver.get(baseUrl);
         
    }

    @When("^i enter valid admin username and incorrect admin password <\"(.*?)\"> <\"(.*?)\">$")
    public void i_enter_valid_admin_username_and_incorrect_admin_password(String username, String invalidPassword)   {
         loginPage.setUserName(username);
         loginPage.setPassword(invalidPassword);
         
    }

    @When("^five i click login button$")
    public void five_i_click_login_button()   {
         loginPage.submitLoginDetails();
         
    }

    @Then("^five login should fail with message <\"(.*?)\">$")
    public void five_login_should_fail_with_message(String errorMessage)   {
         Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'Incorrect Login')]")).getText(), errorMessage);
         closeBrowser();
    }

}