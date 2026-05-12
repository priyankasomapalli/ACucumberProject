package hooks;

import java.io.IOException;
import java.lang.reflect.Field;

import com.aventstack.extentreports.MediaEntityBuilder;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import managers.DriverManager;
import managers.ExtentReportManager;
import managers.ExtentTestManager;
import utils.BaseUtils;
import utils.WaitUtils;

public class Hooks {
	@BeforeAll
	public static void initialise() throws IOException {
		ExtentReportManager.initReport();
	}

	@Before

	public void preReq(Scenario scenario) throws NumberFormatException, IOException {

		ExtentTestManager.createTest(scenario.getName());

		DriverManager.initDriver();
		DriverManager.goToUrl(BaseUtils.getConfigValue("url"));
		WaitUtils.initWait();
	}

	@After

	public void tearDown(Scenario scenario) throws IOException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {

		if (scenario.getStatus().equals(Status.PASSED)) {
			ExtentTestManager.log.pass("Test passed");

		} else if (scenario.isFailed()) {
			Field delegate = scenario.getClass().getDeclaredField("delegate");
			delegate.setAccessible(true);
			Object testCaseState = delegate.get(scenario);

			Field errorField = testCaseState.getClass().getDeclaredField("error");
			errorField.setAccessible(true);
			Throwable error = (Throwable) errorField.get(testCaseState);

			ExtentTestManager.log.fail(error.getMessage(),
					MediaEntityBuilder
							.createScreenCaptureFromPath(BaseUtils.getScreenShotPath(DriverManager.getDriver(),
									scenario.getClass().getName() + "." + scenario.getName()))
							.build());
		} else if (scenario.getStatus().equals(Status.SKIPPED)) {
			ExtentTestManager.log.skip("Test Skipped");
		}
		DriverManager.quitDriver();

	}

	@AfterAll
	public static void flushReport() {
		ExtentReportManager.flushReport();
	}

}
