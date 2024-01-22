package draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CursorStylePage extends BasePage {

	@FindBy(id = "draggable9")
	private WebElement stickToTheMiddleBox;

	@FindBy(id = "draggable10")
	private WebElement stickToTheBoxFromTheCorner;

	@FindBy(id = "draggable11")
	private WebElement stickToTheBoxFromTheBottomSide;

	public void stickToTheMiddleBox(int xOffset, int yOffset) {
		actions.clickAndHold(stickToTheMiddleBox);
		actions.dragAndDropBy(stickToTheMiddleBox, xOffset, yOffset).perform();
		actions.release().perform();
	}

	public void stickToTheCornerBox(int xOffset, int yOffset) {
		actions.clickAndHold(stickToTheBoxFromTheCorner).perform();
		actions.moveByOffset(xOffset, yOffset).perform();
		actions.release().perform();
	}

	public void stickToTheBottomBox(int xOffset, int yOffset) {
		int elementWidth = stickToTheBoxFromTheBottomSide.getSize().getWidth();
		int elementHeight = stickToTheBoxFromTheBottomSide.getSize().getHeight();
		int elementBottomX = stickToTheBoxFromTheBottomSide.getLocation().getX() + elementWidth / 2;
		int elementBottomY = stickToTheBoxFromTheBottomSide.getLocation().getY() + elementHeight;

		actions.clickAndHold(stickToTheBoxFromTheBottomSide).perform();
		actions.dragAndDropBy(stickToTheBoxFromTheBottomSide, xOffset, yOffset).perform();
		actions.release().perform();
	}

}
