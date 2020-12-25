package com.gic.tution_center;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        tags = {"~@login"},
        dryRun = false)

        //tags = {"@AdminLogin, @AdminLogout, @AdminLogoutKeyboard"},
        //tags = {"@BlankUsernamePassword   @BlankUsername  @BlankPassword  @UnregisteredUsername  @IncorrectAdminPassword"},


public class TutionRunner {

}
