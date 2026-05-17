package pageclasses;

import org.openqa.selenium.By;

import utils.UiActionUtils;

public class BugsHomePage {
	
	private By signInButton=By.partialLinkText("Sign in");
	
	public void clickSignIn()
	{
		UiActionUtils.click(signInButton, "SignIn button");
	}

}
