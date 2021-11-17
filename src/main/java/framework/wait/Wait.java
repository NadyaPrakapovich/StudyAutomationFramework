package framework.wait;

import framework.webElements.HtmlElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageWrappers.mailPage.MailPage;
import pageWrappers.mainPanelAuthorize.PanelAuthorize;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class Wait {
	static WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

	public static void waitUntilVisibilityOfElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void waitUntilInvisibilityOfElement(By locator) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public static void waitUntilToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
