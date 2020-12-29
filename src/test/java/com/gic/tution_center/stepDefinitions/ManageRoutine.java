package com.gic.tution_center.stepdefinitions;

import com.gic.tution_center.pageFactory.DashboardPage;
import com.gic.tution_center.pageFactory.ManageRoutinePage;
import com.gic.tution_center.utils.CommonFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ManageRoutine extends CommonFunctions {

    DashboardPage dashboardPage = new DashboardPage(driver);
    ManageRoutinePage manageRoutinePage = new ManageRoutinePage(driver);


    @When("^I click Manage Routine$")
    public void i_click_Manage_Routine() {
        dashboardPage.ManageRoutineBtnClick();

    }

    @When("^I click Add New$")
    public void i_click_Add_New() {

        manageRoutinePage.AddNewBtnClick();

    }

    @When("^I enter Days \"(.*?)\"$")
    public void i_enter_Days(String Day) throws InterruptedException {


        Thread.sleep(3000);
        manageRoutinePage.AddNewDayField.sendKeys(Day);
        manageRoutinePage.AddNewDayField.sendKeys(Keys.ENTER);

    }

    @When("^I enter Group Table Name \"(.*?)\"$")
    public void i_enter_Group_Table_Name(String tableName) throws InterruptedException {

        Thread.sleep(3000);
    manageRoutinePage.GroupTableNameClick();
    manageRoutinePage.GroupTableNameInputField.sendKeys(tableName);
    manageRoutinePage.GroupTableNameInputField.sendKeys(Keys.ENTER);

    }

    @When("^I enter Subject \"(.*?)\"$")
    public void i_enter_Subject(String subject) {

    manageRoutinePage.SubjectField.sendKeys(subject);

    }

    @When("^I enter Teacher \"(.*?)\"$")
    public void i_enter_Teacher(String teachersName) {

    manageRoutinePage.SelectTeacherBtnClick();
    manageRoutinePage.TeacherFieldInput.sendKeys(teachersName);
    manageRoutinePage.TeacherFieldInput.sendKeys(Keys.ENTER);

    }

    @When("^I enter Start Time \"(.*?)\"$")
    public void i_enter_Start_Time(String startTime) {

    manageRoutinePage.StartTimeInputField.sendKeys(startTime);

    }

    @When("^I enter End Time \"(.*?)\"$")
    public void i_enter_End_Time(String endTime) {

    manageRoutinePage.EndTimeInputField.sendKeys(endTime);

    }

    @When("^I click Save$")
    public void i_click_Save() throws InterruptedException {

        Thread.sleep(5000);
        manageRoutinePage.SaveBtnClick();


    }


    @Then("^I should receive a successful message$")
    public void i_should_receive_a_successful_message() {
        Assert.assertTrue(manageRoutinePage.SuccessMsg.isDisplayed());

    }

    @When("^I click Edit$")
    public void i_click_Edit() throws InterruptedException {
        manageRoutinePage.ChooseDayBtn.click();
        manageRoutinePage.FullWeekBtn.click();
        manageRoutinePage.EditBtn.click();
        Thread.sleep(5000);

    }

    @When("^I change the Group Name for \"(.*?)\"$")
    public void i_change_the_Group_Name_for(String changedName) {
        manageRoutinePage.GroupTableNameClick();
        manageRoutinePage.GroupTableNameInputField.sendKeys(changedName);
        manageRoutinePage.GroupTableNameInputField.sendKeys(Keys.ENTER);

    }

    @When("^I click Save the update$")
    public void i_click_Save_the_update() {
        manageRoutinePage.EditTimeslotSaveBtn.click();

    }


    @Then("^I should see successful update message received$")
    public void i_should_see_successful_update_message_received() {

        Assert.assertTrue(manageRoutinePage.EditSuccessMsg.isDisplayed());

    }

}
