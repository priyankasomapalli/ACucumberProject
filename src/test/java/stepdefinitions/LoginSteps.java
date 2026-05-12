package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.LoginPage;
import pageclasses.SecureAreaPage;
import pageclasses.WelcomePage;

public class LoginSteps {
	WelcomePage welcomeObj;
	LoginPage loginObj;
	SecureAreaPage secureObj;

	@Given("User is on Website")
	public void user_is_on_website() {
		welcomeObj = new WelcomePage();
		String pageTitle = welcomeObj.getPageTitle();
		Assert.assertEquals(pageTitle, "Welcome to the-internet");
		System.out.println("User is on the Welcome page");

	}

	@When("User clicked on FormAuthentication")
	public void user_clicked_on_form_authentication() {

		welcomeObj = new WelcomePage();
		welcomeObj.clickFormAuth();
		System.out.println("User clicked on form authentication ");
	}

	@Then("User should land on login page")
	public void user_should_land_on_login_page() {
		loginObj = new LoginPage();
		String loginPageHeading = loginObj.getLoginPageText();
		Assert.assertEquals(loginPageHeading, "Login Page");
		System.out.println("Landed on login page");
	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {
		loginObj = new LoginPage();
		loginObj.sendUserName("tomsmith");
		System.out.println("Entered Username");
	}

	@When("password as {string}")
	public void password_as(String string) {
		loginObj = new LoginPage();
		loginObj.sendPassword("SuperSecretPassword!");
		System.out.println("Entered password");
	}

	@When("clicked on Login button")
	public void clicked_on_login_button() {
		loginObj = new LoginPage();
		loginObj.clickLogin();
		System.out.println("Clicked on login button");

	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		secureObj = new SecureAreaPage();
		String secureText = secureObj.getSuccessMessage();
		Assert.assertTrue(secureText.contains("Secure"));
		System.out.println("Landed on secure area page");

	}

@Then("I verify {string} message")
	public void i_verify_message(String result) {

		loginObj = new LoginPage();
		String actualMessage = loginObj.getFailCaseText();
		Assert.assertTrue(actualMessage.contains(result),
				"Expected: '" + result + "' but got: '" + actualMessage + "'");
		System.out.println("Verified message: " + result);
	}

}
