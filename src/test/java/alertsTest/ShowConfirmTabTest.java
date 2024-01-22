package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowConfirmTabTest extends Hooks {

	@Test
	public void showConfirmTabTest() {
		pages.getHomePage().clickOnWebAutomationLink();

		BrowserUtils.scrollDownWithPageDown();
		pages.getWebAutomationPage().clickOnAlertsLink();

		BrowserUtils.scrollUpWithPageUp();
		pages.getAlertTypesPage().clickOnShowConfirmButton();

		String message1 = pages.getAlertTypesPage().getTextOfTheAlert();

		assertEquals("Are you sure?", message1, "There must be an alert that asking Are you sure?");

		pages.getAlertTypesPage().switchToAlert();

		pages.getAlertTypesPage().confirmTheAlert();

		String message2 = pages.getAlertTypesPage().getTextOfTheAlert();
		assertEquals("Confirmed!", message2, "Alert must show the Confirmed!");
	}

}
