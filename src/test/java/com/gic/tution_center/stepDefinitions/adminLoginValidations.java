package com.gic.tution_center.stepDefinitions;

import com.gic.tution_center.pageFactory.LoginPage;
import com.gic.tution_center.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminLoginValidations extends CommonFunctions {

    public LoginPage loginPage;

    @Given("^I am on the application login page \"(.*?)\"$")
    public void i_am_on_the_application_login_page(String baseUrl) {
        loginPage = new LoginPage(driver);
        driver.get(baseUrl);
    }

    @When("^I enter valid value to username field \"(.*?)\"$")
    public void i_enter_valid_value_to_username_field(String username) {
        loginPage.setUserName(username);
    }

    @When("^I enter valid value to password field \"(.*?)\"$")
    public void i_enter_valid_value_to_password_field(String password) {
        loginPage.setPassword(password);
    }

    @When("^I click Login button$")
    public void i_click_Login_button() {
        loginPage.submitLoginDetails();

    }

    @Then("^I should be in application dashboard page$")
    public void i_should_be_in_application_dashboard_page() throws InterruptedException {
        implicitWait(10);
        Assert.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]")).isDisplayed());
    }

}

