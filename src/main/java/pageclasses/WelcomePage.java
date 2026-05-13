package pageclasses;

import org.openqa.selenium.By;

import utils.UiActionUtils;

public class WelcomePage {
	private static By formAuthLink=By.xpath("//a[text()='Form Authentication']");
	
	private static By welcomePageTitle=By.tagName("h1");
	
	private static By jsalertsLink=By.linkText("JavaScript Alerts");
	
	public String getPageTitle()
	{
		return UiActionUtils.getText(welcomePageTitle, "Welcome page heading");
	}
	
	public void clickFormAuth()
	{
		UiActionUtils.click(formAuthLink, "Form Authentication");
	}
	
	public void clickJsAlerts()
	{
		UiActionUtils.click(jsalertsLink, "JsAlerts");
	}

}
