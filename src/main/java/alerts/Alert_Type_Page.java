package alerts;

import pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Driver;

public class Alert_Type_Page extends BasePage {

	Alert alert;

	WebDriver driver = Driver.getDriver();

	String mainWindowHandle = driver.getWindowHandle();

	@FindBy(xpath = "//button[text()='Show Alert']")
	WebElement showAlertButton;

	@FindBy(xpath = "//button[text()='Show Confirm']")
	WebElement showConfirmButton;

	@FindBy(xpath = "//button[text()='Show Prompt']")
	WebElement showPromptButton;

	public void switchToAlert() {
		alert = driver.switchTo().alert();
	}

	public void switchToWindow() {
		driver.switchTo().window(mainWindowHandle);
	}

	public void clickOnShowAlert() {
		showAlertButton.click();
	}

	public void clickOnShowConfirm() {
		showConfirmButton.click();
	}

	public void clickOnShowPrompt() {
		showPromptButton.click();
	}

	public String getAlertText() {
		return alert.getText();
	}

	public void acceptAlert() {
		alert.accept();
	}

	public void dismissAlert() {
		alert.dismiss();
	}

	public void typeInputOnAlert(String text) {
		alert.sendKeys(text);
	}

	public Alert isAlertVisible() {
		return ExpectedConditions.alertIsPresent().apply(driver);
	}

	public void clickOnShowAlertButton() {
		showAlertButton.click();
	}

	public void clickOnShowConfirmButton() {
		showConfirmButton.click();
	}

	public void clickOnShowPromptButton() {
		showPromptButton.click();
	}

	public void confirmTheAlert() {
		switchToAlert();
		alert.accept();
	}

	public String getTextOfTheAlert() {
		switchToAlert();
		return alert.getText();
	}

	public void enterInputIntoAlert(String input) {
		switchToAlert();
		alert.sendKeys(input);
	}

	public void cancelTheAlert() {
		switchToAlert();
		alert.dismiss();
	}

}
