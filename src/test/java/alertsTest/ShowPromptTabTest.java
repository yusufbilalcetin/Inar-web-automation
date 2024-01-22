package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowPromptTabTest extends Hooks {

	@Test
	public void showPromptTabTest() {
		pages.getHomePage().clickOnWebAutomationLink();

		BrowserUtils.scrollDownWithPageDown();
		pages.getWebAutomationPage().clickOnAlertsLink();

		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		BrowserUtils.scrollUpWithPageUp();
		pages.getAlertTypesPage().clickOnShowPromptButton();

		pages.getAlertTypesPage().switchToAlert();

		pages.getAlertTypesPage().enterInputIntoAlert("yusuf");

		pages.getAlertTypesPage().confirmTheAlert();

		String message = pages.getAlertTypesPage().getTextOfTheAlert();
		assertEquals("Hello, yusuf!", message, "There must be an alert message that written Hello");

	}

}
