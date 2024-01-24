package iframeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalIframeTest extends Hooks {

	@Test
	public void nomralIframeTest() {
		pages.getHomePage().clickOnWebAutomationLink();

		BrowserUtils.scrollDownWithPageDown();
		BrowserUtils.wait(2);
		pages.getWebAutomationPage().clickOnIframeLink();
		BrowserUtils.wait(2);
		BrowserUtils.scrollUpWithPageUp();
		// 5.Verify that the header text "Inar academy" In iframe
		String expectedHeader = "Inar academy";
		String actualHeader = pages.getNormalIframePage().getTitleOfIframe();
		assertEquals(expectedHeader, actualHeader);

		// 6.Exit from the iframe
		pages.getNormalIframePage().switchToParentFrame();
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		// 7.verify condition that more information button in iframe works successfully
		String expectedText = "Inar academy";
		String actualText = pages.getNormalIframePage().getTitleOfIframe();
		assertEquals(expectedText, actualText);

	}

}
