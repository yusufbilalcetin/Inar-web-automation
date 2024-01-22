package droppableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevertDraggablePositionTest extends Hooks {

	List<int[]> locationsOfFirstElement = new ArrayList<>();

	List<int[]> locationsOfSecondElement = new ArrayList<>();

	void getLocationOfFirstElement() {
		int[] location = new int[2];
		location[0] = pages.getHandlesPage().getLocationOfTheFirstDraggableX();
		location[1] = pages.getHandlesPage().getLocationOfTheFirstDraggableY();
		locationsOfFirstElement.add(location);
	}

	void getLocationOfSecondElement() {
		int[] location = new int[2];
		location[0] = pages.getHandlesPage().getLocationOfTheSecondDraggableX();
		location[1] = pages.getHandlesPage().getLocationOfTheSecondDraggableY();
		locationsOfSecondElement.add(location);
	}

	@Test
	void testRevertDraggablePosition() {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2. click on the droppable button
		pages.getWebAutomationPage().clickOnDroppableLink();

		// 3. click on the default functionality button
		pages.getWebAutomationPage().clickOnRevertDraggablePositionLink();

		// 4. Drag the source-draggable element and drop it to the target-droppable
		// element
		getLocationOfFirstElement();
		pages.getRevertDraggablePositionPage().dragAndDrop();
		getLocationOfFirstElement();

		// 6. Verify that the text of the target-droppable element has changed to Dropped!
		assertThat(locationsOfFirstElement.get(1)).as("Element doesn't move!")
			.isEqualTo(locationsOfFirstElement.get(0));
		assertEquals(locationsOfFirstElement.get(0)[0], locationsOfFirstElement.get(1)[0],
				"Element doesn't move on X axis as wanted!");
		assertEquals(locationsOfFirstElement.get(0)[1], locationsOfFirstElement.get(1)[1],
				"Element doesn't move on Y axis as wanted!");

		getLocationOfFirstElement();
		pages.getRevertDraggablePositionPage().dragAndDrop2();
		getLocationOfFirstElement();
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		assertThat(locationsOfFirstElement.get(1)).as("Element doesn't move!")
			.isEqualTo(locationsOfFirstElement.get(0));
		assertEquals(locationsOfFirstElement.get(0)[0], locationsOfFirstElement.get(1)[0],
				"Element doesn't move on X axis as wanted!");
		assertEquals(locationsOfFirstElement.get(0)[1], locationsOfFirstElement.get(1)[1],
				"Element doesn't move on Y axis as wanted!");

	}

}
