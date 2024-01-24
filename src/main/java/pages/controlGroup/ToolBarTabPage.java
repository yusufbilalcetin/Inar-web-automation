package pages.controlGroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;

public class ToolBarTabPage extends BasePage {

	@FindBy(css = ".d-flex > .form-select")
	private List<WebElement> zoomHighlightColourTabs;

	@FindBy(css = ".d-flex > .btn")
	private List<WebElement> buttons;

	@FindBy(id = "page")
	private WebElement textArea;

	@FindBy(linkText = "Yazdır")
	private WebElement yazdır;

	public String style() {
		return textArea.getAttribute("style");
	}

	public void selectZoomAmount(String text) {
		Select select = new Select(zoomHighlightColourTabs.get(0));
		select.selectByVisibleText(text);
	}

	public void selectHiglightColour(String text) {
		Select select = new Select(zoomHighlightColourTabs.get(1));
		select.selectByVisibleText(text);
	}

	public void selectTextColour(String text) {
		Select select = new Select(zoomHighlightColourTabs.get(2));
		select.selectByVisibleText(text);
	}

	public void selectAll(String zoom, String highlight, String Colour) {
		selectZoomAmount(zoom);
		selectHiglightColour(highlight);
		selectTextColour(Colour);
	}

	public void clickOnBButton() {
		buttons.get(0).click();
	}

	public void clickOnIButton() {
		buttons.get(1).click();
	}

	public void clickOnUButton() {
		buttons.get(2).click();
	}

	public void clickOnPrintButton() {
		buttons.get(3).click();
	}
	//TODO

//	public void switchToParentFrame() {
//		DRIVER.switchTo().window();
//	}
//
//	public void switchToIframe() {
//		DRIVER.switchTo().frame(yazdır);
//	}
//
//	public String getTitleOfIframe() {
//		switchToIframe();
//		return yazdır.getText();
//	}

}
