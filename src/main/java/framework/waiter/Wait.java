package framework.waiter;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class Wait {
	static WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

	public static void waitUntilVisibilityOfElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void waitUntilInvisibilityOfElement(By locator) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public static void waitUntilToBeClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static void waitUntilpresenceOfAllElements(By locator) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
}

