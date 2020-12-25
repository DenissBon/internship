package com.gic.tution_center.stepDefinitions;

import com.gic.tution_center.pageFactory.LoginPage;
import com.gic.tution_center.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class rememberMeTests extends CommonFunctions {

    public LoginPage loginPage;

    //Remember Me un-selected by default
    @Given("^I am on landing page \"(.*?)\"$")
    public void i_am_on_landing_page(String baseUrl)  {
        loginPage = new LoginPage(driver);
        driver.get(baseUrl);
    }

    @Then("^Remember Me check box is not selected$")
    public void remember_Me_check_box_is_not_selected()  {
        Assert.assertFalse(driver.findElement(By.cssSelector("#remember")).isSelected());
    }

    // Remember Me checked 
    @Given("^I am on the landing page \"(.*?)\"$")
    public void i_am_on_the_landing_page(String baseUrl)  {
        loginPage = new LoginPage(driver);
        driver.get(baseUrl);
    }

    @When("^i provide admin username and password <\"(.*?)\"> <\"(.*?)\">$")
    public void i_provide_admin_username_and_password(String username, String password)  {
        loginPage.setUserName(username);
        loginPage.setPassword(password);
    }

    @When("^i select Remember Me check box$")
    public void i_select_Remember_Me_check_box()  {
        driver.findElement(By.cssSelector("#remember")).click();

    }

    @When("^i click Login buton$")
    public void i_click_Login_buton()  {
        loginPage.submitLoginDetails();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div/div/div/div[2]/div[2]")).isDisplayed());
        
    }

    @When("^i logout$")
    public void i_logout()  {
        driver.findElement(By.xpath("//div[@class='nav-avatar']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]")).click();
        //closeBrowser();
    }

    @When("^i restart the browser$")
    public void i_restart_the_browser()  {
        loginPage = new LoginPage(driver);
        
    }

    @When("^i launch the application \"(.*?)\"$")
    public void i_launch_the_application(String baseUrl)  {
        driver.get(baseUrl);
    }

    @Then("^i should see the username and passwrod field is remembered and should be login$")
    public void i_should_see_the_username_and_passwrod_field_is_remembered_and_should_be_login()  {
        loginPage.submitLoginDetails();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div/div/div/div[2]/div[2]")).isDisplayed());
        
    }

}
