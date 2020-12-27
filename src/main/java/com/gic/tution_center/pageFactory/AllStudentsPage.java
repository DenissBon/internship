package com.gic.tution_center.pageFactory;

import com.gic.tution_center.utils.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllStudentsPage extends CommonFunctions {

    public AllStudentsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[contains(text(),'George Cane')]")
    public WebElement AddedStudent;





}
