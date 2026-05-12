package pageclasses;

import org.openqa.selenium.By;

import utils.UiActionUtils;

public class LoginPage {
	private static By loginHeader=By.tagName("h2");
	
	private static By userNameField=By.id("username");
	
	private static By passwordField=By.id("password");
	
	private static By loginButton=By.tagName("button");
	
	private static By loginFailText=By.id("flash");
	
	public  String getLoginPageText()
	{
		return UiActionUtils.getText(loginHeader, "LoginpageTitle");
	}
	
	public  void sendUserName(String username)
	{
		UiActionUtils.sendKeys(userNameField, username);
	}
	public  void sendPassword(String password)
	{
		UiActionUtils.sendKeys(passwordField,password);
	}

	public  void clickLogin()
	{
		UiActionUtils.click(loginButton, "Login button");
	}
	
	public  String getFailCaseText()
	{
		return UiActionUtils.getText(loginFailText, "Failed result");
	}
}
