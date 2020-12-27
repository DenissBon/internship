package com.gic.tution_center.pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewStudentPage {

    public AddNewStudentPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//button[contains(text(),'Create Student')]")
    public WebElement CreateStudentBtn;
    public void CreateStudentBtnClick()
    {
        CreateStudentBtn.click();
    }


//mandatory fields

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement LastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement Email;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement Phone;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement BirthDate;

    @FindBy(xpath = "//input[@id='post_code']")
    public WebElement PostCode;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement Address;

    @FindBy(css = "#select2-relation-container")
    public WebElement Relation;

    @FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
    public WebElement RelationEntryField;

    @FindBy(xpath = "//input[@id='guardian_first_name']")
    public WebElement GuardiansFirstName;

    @FindBy(xpath = "//input[@id='guardian_last_name']")
    public WebElement GuardiansLastName;

    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement GuardiansEmail;

    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement GuardiansPhone;

    @FindBy(xpath = "//input[@id='hourly_fees']")
    public WebElement HourlyFeesPeakHour;

    @FindBy(xpath = "//select[@id='student_type']")
    public WebElement StudentType;


    public void EnterValidFirstName() { FirstName.sendKeys("George"); }
    public void EnterValidLastName() { LastName.sendKeys("Cane"); }
    public void EnterValidEmail() { Email.sendKeys("Georgecane@gmail.com"); }
    public void EnterValidPhone(){Phone.sendKeys("7878787878");}
    public void EnterValidBirthDate(){BirthDate.sendKeys("1990-03-20");}
    public void EnterValidPostCode(){PostCode.sendKeys("se15 2ff");}
    public void EnterValidAddress(){Address.sendKeys("1A Bermondsey Way");}
    public void EnterValidGuardiansFirstName(){GuardiansFirstName.sendKeys("John");}
    public void EnterValidGuardiansLastName(){GuardiansLastName.sendKeys("Cane");}
    public void EnterValidGuardiansEmail(){GuardiansEmail.sendKeys("johncane@gmail.com");}
    public void EnterValidGuardiansPhone(){GuardiansPhone.sendKeys("7979797979");}
    public void EnterValidHourlyFeesPeakHour(){HourlyFeesPeakHour.sendKeys("15");}

}









































































































