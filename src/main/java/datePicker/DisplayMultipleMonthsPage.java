package datePicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DisplayMultipleMonthsPage extends BasePage {

	@FindBy(id = "datepicker-multiple-months")
	private WebElement inputSection;

	@FindBy(xpath = "//body[1]/div[8]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/a[1]")
	private WebElement clickOnAMonthDay;

	public void clickOnInputSection() {
		inputSection.click();
	}

	public void clickOnAMonthDay() {
		clickOnAMonthDay.click();
	}

	public String getInputSection() {
		return inputSection.getText();
	}

}
