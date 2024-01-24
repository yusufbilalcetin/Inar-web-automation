package MenuTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class IconTest extends Hooks {

    @Test
    public void IconTest() {
        // 1. Land on home page
        // 2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        // 3.Click on Menu link
        pages.getWebAutomationPage().clickOnMenu();
        BrowserUtils.scrollUpWithPageUp();

        BrowserUtils.wait(1);

        //4.Click on Icon link
        pages.getWebAutomationPage().clickOnIcons();

        Assertions.assertTrue(pages.getIconsPage().isClickableMainButton("Save"));

        Assertions.assertTrue(pages.getIconsPage().isClickableMainButton("Zoom In"));

        Assertions.assertTrue(pages.getIconsPage().isClickableMainButton("Zoom Out"));

        Assertions.assertFalse(pages.getIconsPage().isClickableMainButton("Print..."));

        Assertions.assertTrue(pages.getIconsPage().isClickableMainButton("Playback"));

        Assertions.assertTrue(pages.getIconsPage().isClickableSubOfPlayIcon("Prev"));

        Assertions.assertTrue(pages.getIconsPage().isClickableSubOfPlayIcon("Stop"));

        Assertions.assertTrue(pages.getIconsPage().isClickableSubOfPlayIcon("Play"));

        Assertions.assertTrue(pages.getIconsPage().isClickableSubOfPlayIcon("Next"));

        Assertions.assertTrue(pages.getIconsPage().isClickableMainButton("Learn more about this menu"));
    }
}
