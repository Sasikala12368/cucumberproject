package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sasi\\eclipse-workspace\\Cucumber\\src\\test\\resources\\FeatureFile\\Featurefile.feature",
glue="org.stepdefinition")
public class RunnerClass {

}
