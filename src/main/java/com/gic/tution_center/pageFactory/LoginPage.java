package com.gic.tution_center.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy (css = "#identity")
    WebElement userNameTxt;

    @FindBy (css = "#password")
    WebElement passwordTxt;

    @FindBy (xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[4]/div[1]/input[1]")
    WebElement loginBtn;

    @FindBy (xpath = "//a[@class='btn-lg btn btn-link']")
    WebElement forgotPassword;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String username){

        userNameTxt.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordTxt.sendKeys(password);
    }

    public void submitLoginDetails() {
        loginBtn.click();
    }

    public void forgotPasswordLink(){
        forgotPassword.click();

    }
}

