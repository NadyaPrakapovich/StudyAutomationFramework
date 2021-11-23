package framework.waiter;

import framework.webElements.HtmlElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class Wait {
	static WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

	public static void waitUntilVisibilityOfElement(HtmlElement element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
	}

	public static void waitUntilInvisibilityOfElement(HtmlElement element) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element.getLocator()));
	}

	public static void waitUntilToBeClickable(HtmlElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element.getLocator()));
	}

	public static void waitUntilpresenceOfAllElements(HtmlElement element) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element.getLocator()));
	}
}

