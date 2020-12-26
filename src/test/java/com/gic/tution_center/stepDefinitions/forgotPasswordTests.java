package com.gic.tution_center.stepDefinitions;

import com.gic.tution_center.pageFactory.LoginPage;
import com.gic.tution_center.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class forgotPasswordTests extends CommonFunctions {

    public LoginPage loginPage;

    //To test Recover Password page is loaded
    @Given("^i am on the app login page \"(.*?)\"$")
    public void i_am_on_the_app_login_page(String baseUrl) {
        loginPage = new LoginPage(driver);
        driver.get(baseUrl);
        
    }

    @When("^i click Forgot your password link$")
    public void i_click_Forgot_your_password_link() {
        loginPage.forgotPasswordLink();
        
    }

    @Then("^i should be in Recover your Password page$")
    public void i_should_be_in_Recover_your_Password_page() {
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='d-block']")).isDisplayed());
        
    }
    // Recover Admin password test
    @Given("^i am on app login page \"(.*?)\"$")
    public void i_am_on_app_login_page(String baseUrl)  {
       loginPage = new LoginPage(driver);
       driver.get((baseUrl));
        
    }

    @When("^i click Forgot your password link on the page$")
    public void i_click_Forgot_your_password_link_on_the_page()  {
       loginPage.forgotPasswordLink();
        
    }

    @When("^i enter valid admin emailID into Username field \"(.*?)\"$")
    public void i_enter_valid_admin_emailID_into_Username_field(String adminEmailID)  {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
        loginPage.setUserName(adminEmailID);
    }

    @When("^i click Send Recovery Link button$")
    public void i_click_Send_Recovery_Link_button()  {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("^mail should be sent and login page should be loaded and \"(.*?)\" message should display$")
    public void mail_should_be_sent_and_login_page_should_be_loaded_and_message_should_display(String emailMessage)  {
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'Password Reset Email Sent')]")).getText(),emailMessage);

    }
    //Recover password with un-registered email ID
    @Given("^bbb i am on app login page \"(.*?)\"$")
    public void bbb_i_am_on_app_login_page(String baseUrl)  {
        loginPage = new LoginPage(driver);
        driver.get(baseUrl);
        
    }

    @When("^i click Forgot your password link on page$")
    public void i_click_Forgot_your_password_link_on_page()  {
        loginPage.forgotPasswordLink();
        
    }

    @When("^i enter unregistered email ID into Username field \"(.*?)\"$")
    public void i_enter_unregistered_email_ID_into_Username_field(String unRegEmail)  {
        loginPage.setUserName(unRegEmail);
        
    }

    @When("^i click Send Recovery Link btn$")
    public void i_click_Send_Recovery_Link_btn()  {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
    }

    @Then("^the app should report an error \"(.*?)\"$")
    public void the_app_should_report_an_error(String errorMsg)  {
        System.out.println(errorMsg+"......");
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'No record of that email address.')]")).getText(), errorMsg);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"infoMessage\"]/p")).getText(),errorMsg);
    }

}
 