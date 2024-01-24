package pages.Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class IconsPage extends BasePage {
    @FindBy(css = "#menu-w-icons > li > div")
    private List<WebElement> isClickableMainButton;

    @FindBy(xpath = "//div[@id='ui-id-76']/../ul/li/div")
    private List<WebElement> subOfPlayIcon;

    public boolean isClickableSubOfPlayIcon(String subIconName) {
        List<String> playBackIconText = subOfPlayIcon.stream().map(WebElement::getText).toList();
        actions.moveToElement(subOfPlayIcon.get(playBackIconText.indexOf(subIconName))).perform();
        return subOfPlayIcon.get(playBackIconText.indexOf(subIconName)).getAttribute("class").contains("ui-state-active");
    }

    public boolean isClickableMainButton(String iconName) {
        List<String> icontext = isClickableMainButton.stream().map(WebElement::getText).toList();
        actions.moveToElement(isClickableMainButton.get(icontext.indexOf(iconName))).perform();
        BrowserUtils.wait(1);
        return isClickableMainButton.get(icontext.indexOf(iconName)).getAttribute("class").contains("ui-state-active");
    }

}
