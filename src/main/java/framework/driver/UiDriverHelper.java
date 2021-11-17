package framework.driver;

import java.util.Iterator;
import java.util.Set;

public class UiDriverHelper {
	private static String mainWindowHandle;

	public static String getTitle() {
		return UiDriver.getDriver().getTitle();
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
			if (!getMainWindowHandle().equalsIgnoreCase(ChildWindow)){
				UiDriver.getDriver().switchTo().window(ChildWindow);
			}
//			else {
//				UiDriver.getDriver().switchTo().window(getMainWindowHandle());
//			}
		}
	}

	public static void setMainWindow() {
		UiDriver.getDriver().switchTo().window(getMainWindowHandle());
	}

}