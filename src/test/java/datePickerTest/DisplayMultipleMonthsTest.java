package datePickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisplayMultipleMonthsTest extends Hooks {

	@Test
	public void displayMultipleMonthsTest() {
		pages.getHomePage().clickOnWebAutomationLink();

		BrowserUtils.scrollDownWithPageDown();
		pages.getWebAutomationPage().clickOnDatePickerLink();

		pages.getWebAutomationPage().clickOnDisplayMultipleMonthsLink();

		BrowserUtils.scrollUpWithPageUp();
		pages.getDisplayMultipleMonthsPage().clickOnInputSection();

		BrowserUtils.wait(2);

		pages.getDisplayMultipleMonthsPage().clickOnAMonthDay();

		BrowserUtils.wait(4);
		String date = pages.getDisplayMultipleMonthsPage().getInputSection();

		assertEquals("01/22/2024", date, "when click on the 22 january 2024 it must show 01/22/2024");
	}

}
