package selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

/**
 * 1. Open the browser and navigate to the URL 2. Click on webautomation link 3. Click on
 * Selectable button 4. Click on Serialize button
 * <p>
 * 5. Click on Item 5 6. Verify that Item 5 is selected 7. Verify that "You've selected:
 * #5" is displayed
 * <p>
 * 8. Click on Item 6 9. Verify that Item 6 is selected 10. Verify that "You've selected:
 * #6" is displayed
 * <p>
 * 11. Click on Item 1, Item 3 by holding down the Ctrl key 12. Verify that Item 1, Item 3
 * are selected 13. Verify that "You've selected: #1 #3 #6" is displayed(6 selected
 * because Item 6 is still selected)
 * <p>
 * 14. Click on Item 1, Item2, Item 3 by holding mouse down and dragging 15. Verify that
 * Item 1, Item 2, Item 3 are selected 16. Verify that "You've selected: #1 #2 #3" is
 * displayed
 */
public class SerializePage extends BasePage {

	@FindBy(css = "#selectable-serialize > li")
	private List<WebElement> webElements;

	@FindBy(css = "#feedback-serialize")
	private WebElement text1;

	@FindBy(id = "select-result")
	private WebElement text2;

	public void clickItems(int index) {
		webElements.get(index - 1).click();
	}

	public void clickItemsWithCtrl(int i1, int i2) throws InterruptedException {
		actions.keyDown(Keys.CONTROL).click(webElements.get(i1 - 1)).release().build().perform();
		actions.keyDown(Keys.CONTROL).click(webElements.get(i2 - 1)).release().build().perform();
		actions.keyUp(Keys.CONTROL).build().perform();

	}

	public boolean isSelected(int item) {
		return webElements.get(item - 1).getAttribute("class").contains("ui-selected");

	}

	public String getText() {
		return text1.getText();
	}

	public void clickWithMouse(int i1, int i2, int i3) {
		actions.clickAndHold(webElements.get(i1 - 1))
			.moveToElement(webElements.get(i2 - 1))
			.moveToElement(webElements.get(i3 - 1))
			.release()
			.build()
			.perform();
	}

}
