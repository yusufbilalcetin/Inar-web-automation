package draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovementPage extends BasePage {

	// Locate elements with//
	@FindBy(id = "draggable5")
	private WebElement draggable5;

	@FindBy(id = "draggable6")
	private WebElement draggable6;

	@FindBy(id = "draggable7")
	private WebElement draggable7;

	@FindBy(id = "containment-wrapper")
	private WebElement containmentWrapper;

	@FindBy(xpath = "//*[@id='containment-wrapper']/div[2]")
	private WebElement boxWrapper;

	@FindBy(id = "draggable8")
	private WebElement draggable8;

	// Then add necessary methods
	public void dragDraggable5Offset(int xOffset, int yOffset) {
		actions.dragAndDropBy(draggable5, xOffset, yOffset).perform();
	}

	public void dragDraggable6Offset(int xOffset, int yOffset) {
		actions.dragAndDropBy(draggable6, xOffset, yOffset).perform();
	}

	public void dragDraggable7Offset(int xOffset, int yOffset) {
		actions.dragAndDropBy(draggable7, xOffset, yOffset).perform();
	}

	public void dragDraggable8Offset(int xOffset, int yOffset) {
		actions.dragAndDropBy(draggable8, xOffset, yOffset).perform();
	}

	public int getLocationOffDaraggable5y() {
		return draggable5.getLocation().getY();
	}

	public int getLocationOffDaraggable5X() {
		return draggable5.getLocation().getX();
	}

	public int getLocationOffDaraggable7y() {
		return draggable7.getLocation().getY();
	}

	public int getLocationOffDaraggable7X() {
		return draggable7.getLocation().getX();
	}

	public int getLocationOffDaraggable6y() {
		return draggable6.getLocation().getY();
	}

	public int getLocationOffDaraggable6X() {
		return draggable6.getLocation().getX();
	}

	public int getLocationOffDaraggable8X() {
		return draggable8.getLocation().getX();
	}

	public int getLocationOffDaraggable8Y() {
		return draggable8.getLocation().getY();
	}

	public int[] getContainerWrapperLimits() {

		return new int[] {
				// top
				containmentWrapper.getLocation().getY(),
				// right
				containmentWrapper.getLocation().getX() + containmentWrapper.getSize().width,
				// bottom
				containmentWrapper.getLocation().getY() + containmentWrapper.getSize().height,
				// left
				containmentWrapper.getLocation().getX()

		};

	}

	public int[] getBoxWrapperLimits() {
		return new int[] {
				// top
				boxWrapper.getLocation().getY(),
				// right
				boxWrapper.getLocation().getX() + boxWrapper.getSize().width,
				// bottom
				boxWrapper.getLocation().getY() + boxWrapper.getSize().height,
				// left
				boxWrapper.getLocation().getX() };

	}

}
