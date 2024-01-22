package droppableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DroppableAcceptTest extends Hooks {

	@Test
	void testAcceptDroppable() {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2. click on the droppable button
		pages.getWebAutomationPage().clickOnDroppableLink();

		// 3. click on the default functionality button
		pages.getWebAutomationPage().clickOnAcceptLink();

		// 4. Drag the source-draggable element and drop it to the target-droppable
		// element
		pages.getDroppableAcceptPage().dragAndDrop2();
		pages.getDroppableAcceptPage().dragAndDrop();

		// 6. Verify that the text of the target-droppable element has changed to Dropped!
		Assertions.assertThat(pages.getDroppableAcceptPage().getDroppableElementText()).isEqualTo("Dropped!");
		assertEquals("Dropped!", pages.getDroppableAcceptPage().getDroppableElementText());
	}

}
