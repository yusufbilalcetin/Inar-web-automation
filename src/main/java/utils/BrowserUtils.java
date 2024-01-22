package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

	/**
	 * Scrolls the window vertically by given amount of pixels.
	 * @params pixelAmount
	 *
	 **/
	private static Actions actions = new Actions(Driver.getDriver());

	public static void scrollVertically(int pixelAmount) {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		js.executeScript("window.scroll(0,)" + pixelAmount + ")");
	}

	public static void scrollDown() {
		scrollVertically(1000);
	}

	public static void scrollUp() {
		scrollVertically(-1000);
	}

	public static void scrollDownWithPageDown() {
		actions.keyDown(Keys.PAGE_DOWN).release().build().perform();
	}

	public static void scrollUpWithPageUp() {
		actions.keyDown(Keys.PAGE_UP).release().build().perform();
	}

	public static void wait(double second) {
		try {
			Thread.sleep((long) second * 1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void wait(int second) {
		try {
			Thread.sleep((long) second * 1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String getTitle() {
		return Driver.getDriver().getTitle();
	}

}
