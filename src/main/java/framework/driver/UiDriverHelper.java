package framework.driver;

import java.util.Iterator;
import java.util.Set;

public class UiDriverHelper {
	public static String getTitle() {
		return UiDriver.getDriver().getTitle();
	}

	public static String getWindowHandle() {
		String WindowHandle = UiDriver.getDriver().getWindowHandle();
		return WindowHandle;
	}

	public static void setChildWindow() {
		//String main WindowHandle = UiDriver.getDriver().getWindowHandle();
		Set<String> allWindowHandles = UiDriver.getDriver().getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!getWindowHandle().equalsIgnoreCase(ChildWindow)) {
				UiDriver.getDriver().switchTo().window(ChildWindow);
			}
		}
	}

	public static void setPopupWindow() {

		for (String activeHandle : UiDriver.getDriver().getWindowHandles()) {
			if (!activeHandle.equals(UiDriver.getDriver().getWindowHandles())) {
				UiDriver.getDriver().switchTo().window(activeHandle);
			}
		}

	}
}