package framework.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageWrappers.mainPanelAuthorize.PanelAuthorize;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class Wait {
	static WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

	public static void waitUntilvisibilityOfElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
