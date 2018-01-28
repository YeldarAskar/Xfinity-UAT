package com.xfinity.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cuc-report",
		"json:target/cucumber.json" }, features = "./src/test/resources/com/xfinity/features/speedTest.feature", glue = "com.xfinity.step_definitions")

public class CukeRunner {

}
