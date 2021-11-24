package framework.driver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import utility.Logger;

public class UiDriverHelper {

	public static String getTitle() {
		String title = UiDriver.getDriver().getTitle();
		Logger.getLogger().info("Got title window {}", title);
		return title;
	}

	public static void setChildWindow() {
		String mainWindowHandle = UiDriver.getDriver().getWindowHandle();
		Set<String> allWindowHandles = UiDriver.getDriver().getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)){
				UiDriver.getDriver().switchTo().window(ChildWindow);
			}
		}
	}

	public static void pageRefresh() {
		try {
			UiDriver.getDriver().navigate().refresh();
			Alert alt = UiDriver.getDriver().switchTo().alert();
			alt.accept();
		} catch (NoAlertPresentException noe) {
			// no alert.
		}
	}



}