package droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DroppableAcceptPage extends BasePage {

	@FindBy(id = "draggable-accept")
	private WebElement draggableAcceptElement;

	@FindBy(id = "draggable-nonvalid-accept")
	private WebElement draggableNonValidAcceptElement;

	@FindBy(id = "droppable-accept")
	private WebElement droppableAcceptBox;

	public String getDroppableElementText() {
		return droppableAcceptBox.getText();
	}

	public void dragAndDrop() {
		actions.clickAndHold(draggableAcceptElement).moveToElement(droppableAcceptBox).release().build().perform();
	}

	public void dragAndDrop2() {
		actions.clickAndHold(draggableNonValidAcceptElement)
			.moveToElement(droppableAcceptBox)
			.release()
			.build()
			.perform();
	}

}
