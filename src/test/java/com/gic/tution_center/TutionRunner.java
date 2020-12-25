package com.gic.tution_center;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        tags = {"@RememberMeChecked"},
        dryRun = false)

        // @RememberMeUnchecked     @AdminLogin,    @AdminLogout,   @AdminLogoutKeyboard    ~@login
        // @BlankUsernamePassword   @BlankUsername  @BlankPassword  @UnregisteredUsername
        // @IncorrectAdminPassword  @RecoverPasswordUnRegEmail      @RememberMeChecked

public class TutionRunner {

}
