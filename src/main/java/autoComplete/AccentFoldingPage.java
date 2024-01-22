package autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AccentFoldingPage extends BasePage {

	@FindBy(id = "developer-accentFolding")
	private WebElement inputSection;

	@FindBy(css = "#ui-id-40 > li >div")
	private List<WebElement> elementList;

	public void sendKeysToInputSection(String x) {
		inputSection.sendKeys(x);
	}

	public void cleanInput() {
		inputSection.clear();
	}

	public List<String> getElementList() {
		return elementList.stream().map(WebElement::getText).toList();
	}

}
