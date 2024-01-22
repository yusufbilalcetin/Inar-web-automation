package processBar;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class DownloadDialogTest extends Hooks {

	@Test
	public void downloadDialogTest() {
		pages.getHomePage().clickOnWebAutomationLink();

		pages.getWebAutomationPage().clickOnProcessBarLink();

		pages.getWebAutomationPage().clickOnDownloadDialog();

		pages.getDownloadDialogPage().clickStartDownloadButton();
	}

}
