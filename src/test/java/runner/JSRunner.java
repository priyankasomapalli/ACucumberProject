package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/JsAlerts.feature" }, glue = { "stepdefinitions/JSAlertSteps",
		"hooks" }, plugin = { "pretty", "html:target/cucumber-reports.html" }, monochrome = true, dryRun = true

)

public class JSRunner extends AbstractTestNGCucumberTests {

}
