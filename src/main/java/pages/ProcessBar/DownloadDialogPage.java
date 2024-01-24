package pages.ProcessBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DownloadDialogPage extends BasePage {

	@FindBy(id = "downloadButton-download-dialog")
	private WebElement startDownloadButton;

	@FindBy(id = "ui-id-82")
	private WebElement downloadingPop;

	public void clickStartDownloadButton() {
		startDownloadButton.click();
	}

	public String getFileDownloadText() {
		return downloadingPop.getText();
	}

}
