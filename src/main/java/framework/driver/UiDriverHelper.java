package framework.driver;

import java.util.Iterator;
import java.util.Set;
import utility.Logger;

public class UiDriverHelper {
	private static String mainWindowHandle;

	public static String getTitle() {
		String title = UiDriver.getDriver().getTitle();
		Logger.getLogger().info("Got title window {}", title);
		return title;
	}

	public static String getMainWindowHandle() {
		String WindowHandle = UiDriver.getDriver().getWindowHandle();
		return WindowHandle;
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

}