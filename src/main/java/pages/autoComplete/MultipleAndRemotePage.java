package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Open the browser and navigate to the page 2. click on web automation link 3. click
 * on the auto complete button 4. click on the multiple and remote button 5. Enter "s" in
 * the text field 6. Verify that the suggestion menu is not displayed 7. Clear the text
 * field 8. Enter "sp" in the text field 9. Verify that "Loading suggestions..." message
 * is displayed 10. Verify that the suggestion menu is displayed 11.Verify that the
 * suggestions in the menu starts with sp(suggestions can be more than one)
 */

public class MultipleAndRemotePage extends BasePage {

	@FindBy(id = "tags-multipleremotes")
	private WebElement birdsTextBox;

	@FindBy(xpath = "//input[@id='tags-multipleremotes']/../span")
	private WebElement loadingTextMessage;

	@FindBy(css = "#ui-id-43 > li > div")
	private List<WebElement> suggestionMenu;

	public void insertBirdName(String birdName) {
		birdsTextBox.sendKeys(birdName);
	}

	public String getLoadingSuggestionMessage() {
		return loadingTextMessage.getText();
	}

	ArrayList<String> suggestionMenuList = new ArrayList<>();

	public ArrayList<String> createSuggestionMenuList(List<WebElement> suggestionMenu) {
		for (WebElement menu : suggestionMenu) {
			suggestionMenuList.add(menu.getText());
		}
		return suggestionMenuList;
	}

	public boolean isSuggestionListNotEmpty() {
		return suggestionMenu.size() > 0;
	}

	public void clearBirdsTextBox() {
		birdsTextBox.clear();
	}

	public boolean checkElements(String text) {
		for (String element : suggestionMenuList) {
			if (!element.toLowerCase().startsWith(text.toLowerCase())) {
				return false;
			}
		}
		return true;
	}

}
