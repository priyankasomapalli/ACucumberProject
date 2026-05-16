package pageclasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utils.UiActionUtils;

public class JSAlertsPage {

	private static By jsAlertPageTitle = By.tagName("h3");

	private static By jsAlertButton = By.xpath("//button[text()='Click for JS Alert']");

	private static By resultTextJsAlert = By.xpath("//p[text()='You successfully clicked an alert']");

	private static By jsConfirmButton = By.xpath("//button[@onclick='jsConfirm()']");

	private static By resultTextJsConfirm = By.xpath("//p[text()='You clicked: Cancel']");

	private static By jsPromptButton = By.xpath("//button[@onclick='jsPrompt()']");

	private static By resultTextJsPrompt = By.xpath("//p[text()='You entered: Priyanka JsPrompt']");

	public String getJsAlertPageTitleText() {
		return UiActionUtils.getText(jsAlertPageTitle, "JsAlert page heading");
	}

	public void clickJsAlert() {
		UiActionUtils.click(jsAlertButton, "JsAlert");
		

	}
	
	public Alert performAlert()
	{
		return UiActionUtils.alertIsPresent();
	}

	public String getResultTextForJsAlert() {
		return UiActionUtils.getText(resultTextJsAlert, "Result text of JsAlert");
	}

	public static Alert clickJsConfirm() {
		UiActionUtils.click(jsConfirmButton, "JsConfirm button");
		return UiActionUtils.alertIsPresent();
	}

	public void getResultTextForJsConfirm() {
		UiActionUtils.getText(resultTextJsConfirm, "Result text of JsConfirm");
	}

	public Alert clickJsPrompt()

	{
		UiActionUtils.click(jsPromptButton, "JsPrompt");
		return UiActionUtils.alertIsPresent();

	}

	public void getresultOfPromptText() {
		UiActionUtils.getText(resultTextJsPrompt, "JsPrompt text");
	}
}
