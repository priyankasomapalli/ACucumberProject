package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import managers.DriverManager;
import pageclasses.BugsHomePage;
import pageclasses.BugsLoginPage;

public class LoginBugsSteps {
	BugsHomePage homeObj;
	BugsLoginPage loginObj = new BugsLoginPage();

	@When("User is on the Website")
	public void user_is_on_the_website() {
		DriverManager.getDriver().get("https://with-bugs.practicesoftwaretesting.com/#/");

	}

	@When("Clicked on Signin button")
	public void clicked_on_signin_button() {
		homeObj = new BugsHomePage();

		homeObj.clickSignIn();

	}

	@When("landed on login page")
	public void landed_on_login_page() {
		String heading = loginObj.getPageHeading();
		Assert.assertEquals(heading, "Login");
	}

	@When("I send multiple data for email and password")
	public void i_send_multiple_data_for_email_and_password(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		for (Map<String, String> row : data) {
			String email = row.get("email");
			System.out.println("Email id sending is :  " + email);
			String password = row.get("password");
			System.out.println("PassWord sent is :" + password);
			loginObj.clearLoginFields();
			loginObj.sendEmailID(email);
			loginObj.sendPassword(password);

		}
	}

}
