package controlGroup;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class ToolbarTab extends Hooks {

    @Test
    public void toolbarTest() {

        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnControlGroupLink();

        String initialValues = pages.getToolBarTabPage().style();

        pages.getToolBarTabPage().selectAll("150%");

    }

}
