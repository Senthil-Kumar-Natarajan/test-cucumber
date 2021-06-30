package com.test.bdd.servicetesting.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources"},
        glue = {"com.test.bdd.servicetesting.stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"},
        tags = {"@test1"}
)
public class TestRunner {
}
