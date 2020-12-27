package com.gic.tution_center.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@class='metismenu-icon pe-7s-users']")
    public WebElement StudentsBtn;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[1]/div[4]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")
    public WebElement AllStudentsBtn;

    @FindBy(xpath = "//*[@class='mm-students-entry']")
    public WebElement AddNewStudentBtn;

    public void StudentsBtnClick()
    {
        StudentsBtn.click();
    }

    public void AddNewStudentBtnClick()
    {
        AddNewStudentBtn.click();
    }

    public void AllStudentsBtnClick(){AllStudentsBtn.click();}



}
