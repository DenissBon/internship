package com.gic.tution_center;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        tags = {},
        dryRun = false)


public class TutionRunner {

}
