package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/resources/features/LoginBugs.feature"},
		glue= {"stepdefinitions", "hooks"},
		plugin= {"pretty", "html:target/cucumber-reports.html"},
		dryRun=true,
		monochrome=true
		)
public class BugsLoginRunenr extends AbstractTestNGCucumberTests {

}
