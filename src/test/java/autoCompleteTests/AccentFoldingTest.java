package autoCompleteTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccentFoldingTest extends Hooks {

	@Test
	public void accentFoldingTest() {
		pages.getHomePage().clickOnWebAutomationLink();

		pages.getWebAutomationPage().clickOnAutocompleteLink();

		pages.getWebAutomationPage().clickOnAccentFoldingLink();

		pages.getAccentFoldingPage().sendKeysToInputSection("jo");

		List<String> names = pages.getAccentFoldingPage().getElementList();

		assertTrue(names.get(0).startsWith("Jörn"));
		assertTrue(names.get(1).startsWith("John"));

		pages.getAccentFoldingPage().cleanInput();

		pages.getAccentFoldingPage().sendKeysToInputSection("jö");
		BrowserUtils.wait(1);
		names = pages.getAccentFoldingPage().getElementList();

		assertEquals(1, names.size(), "There should be only one name");
		assertTrue(names.get(0).startsWith("Jörn"), "The name must start with Jörn");

	}

}
