package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RevertDraggablePositionPage extends BasePage {

	@FindBy(id = "draggable-revert-draggable")
	private WebElement draggableRevertDraggable;

	@FindBy(id = "draggable2-revert-draggable")
	private WebElement draggableRevertDraggable2;

	@FindBy(id = "droppable-revert-draggable")
	private WebElement droppableRevertDraggablebox;

	public String getDroppableElementText() {
		return droppableRevertDraggablebox.getText();
	}

	public void dragAndDrop() {
		actions.clickAndHold(draggableRevertDraggable)
			.moveToElement(droppableRevertDraggablebox)
			.release()
			.build()
			.perform();
	}

	public void dragAndDrop2() {
		actions.clickAndHold(draggableRevertDraggable2)
			.moveToElement(droppableRevertDraggablebox)
			.release()
			.build()
			.perform();
	}

	public void dragSecondDraggable(int xOffset, int yOffset) {
		int locX = draggableRevertDraggable2.getLocation().getX();
		int locY = draggableRevertDraggable2.getLocation().getY();
		actions.moveToLocation(locX, locY)
			.clickAndHold()
			.moveToLocation(locX + xOffset, locY + yOffset)
			.release()
			.build()
			.perform();
	}

	public int getLocationOfTheFirstDraggableX() {
		return draggableRevertDraggable.getLocation().getX();
	}

	public int getLocationOfTheFirstDraggableY() {
		return draggableRevertDraggable.getLocation().getY();
	}

	public int getLocationOfTheSecondDraggableX() {
		return draggableRevertDraggable2.getLocation().getX();
	}

	public int getLocationOfTheSecondDraggableY() {
		return draggableRevertDraggable2.getLocation().getY();
	}

}
