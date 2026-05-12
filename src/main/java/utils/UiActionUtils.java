package utils;

import org.openqa.selenium.By;

import managers.ExtentTestManager;

public class UiActionUtils {
	public static void sendKeys(By locator, String data)
	{
		WaitUtils.presenceOfElementLocated(locator).sendKeys(data);
		ExtentTestManager.log.info("Text eneterd is:  " +data);
		
	}
	public static void click(By locator, String elementName)
	{
		WaitUtils.elementToBeClickable(locator).click();
		ExtentTestManager.log.info("Clicked on :  " +elementName);
	}
	
	public static String getText(By locator, String elementName)
	{
		String textOfTheElementObtained=WaitUtils.presenceOfElementLocated(locator).getText();
		ExtentTestManager.log.info("The text from the element" +elementName +"is :  " +textOfTheElementObtained);
		return textOfTheElementObtained;
	}

}
