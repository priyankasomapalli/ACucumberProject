package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/TableTest.feature" }, glue = { "stepdefinitions",
		"hooks" }, plugin = { "pretty", "html:target/cucumber-reports.html" }, monochrome = true, dryRun = false

)
public class TestTableRunner extends AbstractTestNGCucumberTests {

}
