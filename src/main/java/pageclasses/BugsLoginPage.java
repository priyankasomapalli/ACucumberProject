package pageclasses;

import org.openqa.selenium.By;

import utils.UiActionUtils;

public class BugsLoginPage {

	private By loginTitle = By.tagName("h3");

	private By emailField = By.id("email");

	private By passwordField = By.id("password");

	private By eyeSecureIcon = By.cssSelector("fa fa-eye-slash");

	public String getPageHeading() {
		return UiActionUtils.getText(loginTitle, "Login title");
	}

	public void sendEmailID(String emailid) {
		UiActionUtils.sendKeys(emailField, emailid);
	}

	public void sendPassword(String password) {
		UiActionUtils.sendKeys(passwordField, password);
	}

	public void deSelectEyeSecure() {
		UiActionUtils.click(eyeSecureIcon, "Password security");
	}

	public void clearLoginFields() {
		UiActionUtils.clear(emailField, "Email field");
		UiActionUtils.clear(passwordField, "Password field");
	}

}
