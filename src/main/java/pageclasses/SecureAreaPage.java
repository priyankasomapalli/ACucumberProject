package pageclasses;

import org.openqa.selenium.By;
import utils.UiActionUtils;

public class SecureAreaPage {

	private static By successMessage = By.id("flash");

	public  String getSuccessMessage() {
		return UiActionUtils.getText(successMessage, "Success Message");
	}
}
