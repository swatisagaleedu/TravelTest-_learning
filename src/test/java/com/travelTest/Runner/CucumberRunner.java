package com.travelTest.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="ScenarioInFeatureFormat"
,glue = {"com.travelTest.cucumberStepDefination"}
,plugin = "html:./test-output/CucumberReport.html",dryRun = false, tags = "@smoke and @sanity")

public class CucumberRunner extends AbstractTestNGCucumberTests {

}