package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class getHomePage extends BasePage {

	@FindBy(linkText = "Webautomation")
	private WebElement webAutomationLink;

	public void clickOnWebAutomationLink() {
		webAutomationLink.click();
	}

}
