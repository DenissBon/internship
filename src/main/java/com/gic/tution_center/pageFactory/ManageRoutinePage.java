package com.gic.tution_center.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageRoutinePage {

    public ManageRoutinePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@class='btn-icon btn btn-primary add_new_routine']")
    public WebElement AddNewBtn;

    public void AddNewBtnClick(){AddNewBtn.click();}

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")
    public WebElement AddNewDayField;

    @FindBy(xpath = "//span[@id='select2-group_id-container']")
    public WebElement GroupTableName;

    public void GroupTableNameClick()
    {
        GroupTableName.click();
    }

    @FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
    public WebElement GroupTableNameInputField;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement SubjectField;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[4]/span[1]/span[1]/span[1]")
    public WebElement SelectTeacherBtn;

    public void SelectTeacherBtnClick()
    {
        SelectTeacherBtn.click();
    }

    @FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
    public WebElement TeacherFieldInput;

    @FindBy(xpath = "//input[@id='start_time']")
    public WebElement StartTimeInputField;

    @FindBy(xpath = "//input[@id='end_time']")
    public WebElement EndTimeInputField;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement SaveBtn;

    public void SaveBtnClick(){SaveBtn.click();}

    @FindBy(xpath = "//*[@class='routine-build']")
    public WebElement SuccessMsg;

    @FindBy(xpath = "//div[@id='routine']")
    public WebElement EditSuccessMsg;

    @FindBy(xpath = "//*[@id='routine']/div[1]/div/div/div/div[2]/div[3]/a")
    public WebElement EditBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div[1]/span/div/button/span")
    public WebElement NoneSelectedBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div[1]/span/div/ul/li[1]/a/label")
    public WebElement FullWeekBtn;

    @FindBy(xpath = "//body/div[@id='app']/div[@id='myModal']/div[1]/form[1]/div[1]/div[3]/button[1]")
    public WebElement EditTimeslotSaveBtn;

    @FindBy(xpath = "//div[contains(text(),'Student Enrolled Successfully!')]")
    public WebElement StudentEnrolledSuccessMsg;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[2]/a[1]/i[1]")
    public WebElement StudentEnrollmentBtn;

    public void StudentEnrollmentBtnClick(){StudentEnrollmentBtn.click();}

    @FindBy(xpath = "//body/div[@id='app']/div[@id='myModal']/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]")
    public WebElement SelectStudentDropdown;

    public void SelectStudentDropdownClick(){SelectStudentDropdown.click();}

    @FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
    public WebElement EnterStudentField;

    @FindBy(xpath = "//body/div[@id='app']/div[@id='myModal']/div[1]/form[1]/div[1]/div[3]/button[1]")
    public WebElement SaveEnrolledStudent;

    @FindBy(xpath = "//*[@id='student_entry_block']/div[2]/div/div/a/i")
    public WebElement DeleteStudentBtn;

    public void DeleteStudentBtnClick(){DeleteStudentBtn.click();}

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public WebElement OkBtnWhenDeletingStudent;

    @FindBy(xpath = "//div[contains(text(),'Student ofboarded successfully!')]")
    public WebElement StudentOfboardedSuccessMsg;

    @FindBy(xpath = "//body/div[@id='app']/div[@id='myModal']/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
   public WebElement AddSelectStudentField;


   @FindBy(xpath = "//body/div[@id='app']/div[@id='myModal']/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/span[1]/span[1]/span[1]")
    public WebElement SelectStudentSecondField;

   @FindBy(xpath = "//p[contains(text(),'The Student field is required.')]")
   public WebElement StudentFieldWarningMessage;

}
