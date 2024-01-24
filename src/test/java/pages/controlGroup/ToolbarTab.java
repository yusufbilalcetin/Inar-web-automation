package pages.controlGroup;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToolbarTab extends Hooks {

    @Test
    public void toolbarTest() {

        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnControlGroupLink();

        String initialValues = pages.getToolBarTabPage().style();

        pages.getToolBarTabPage().selectAll("150%", "Green", "Blue");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pages.getToolBarTabPage().clickOnIButton();

        pages.getToolBarTabPage().clickOnUButton();

        pages.getToolBarTabPage().clickOnBButton();

        pages.getToolBarTabPage().clickOnPrintButton();

        //TODO

//        pages.getToolBarTabPage().switchToParentFrame();


    }

}
