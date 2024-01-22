package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class DraggableCursorStyleTest extends Hooks {

	@Test
	void testCursorStyle() {
		// 1. Open the browser and navigate to the page
		pages.getHomePage().clickOnWebAutomationLink();

		// 2. click on the draggable button
		pages.getWebAutomationPage().clickOnDraggableLink();

		// 3. click on the auto scrolling button
		pages.getWebAutomationPage().clickOnCursorStyleLink();

		// ----------------------------------------------------------------------------------------------//

		pages.getCursorStylePage().stickToTheMiddleBox(100, 100);

		// ----------------------------------------------------------------------------------------------//

		pages.getCursorStylePage().stickToTheCornerBox(100, 100);

		// ----------------------------------------------------------------------------------------------//

		pages.getCursorStylePage().stickToTheBottomBox(100, 100);

		// ----------------------------------------------------------------------------------------------//
	}

}
