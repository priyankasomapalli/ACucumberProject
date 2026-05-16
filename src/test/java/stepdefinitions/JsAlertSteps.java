
package stepdefinitions;

	import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.JSAlertsPage;
import pageclasses.WelcomePage;

	public class JsAlertSteps {
		WelcomePage welcomeObj;

		JSAlertsPage jsObj = new JSAlertsPage();;


		@When("User clicked on JsAlerts")
		public void user_clicked_on_js_alerts() {
			welcomeObj = new WelcomePage();
			welcomeObj.clickJsAlerts();

		}

		@Then("User should land on JavaScriptAlertspage")
		public void user_should_land_on_java_script_alertspage() {

			String pageHeading = jsObj.getJsAlertPageTitleText();
			Assert.assertEquals(pageHeading, "JavaScript Alerts");

		}

		@When("I click on {string}")
		public void i_click_on(String string) {
			jsObj.clickJsAlert();
		}

		@When("clicked on {string} in step")
		public void clicked_on_in_step(String string) {
			jsObj.performAlert().accept();
		}

		@Then("I verify the {string}")
		public void i_verify_the(String string) {
			String resultText = jsObj.getResultTextForJsAlert();
			Assert.assertEquals(resultText, "You successfully clicked an alert");

		}

	}



