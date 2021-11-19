package pageWrappers.mainPanelAuthorize;

import framework.driver.UiDriverHelper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Logger;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class PanelAuthorizeHelper {

	public static void openMail() {

		PanelAuthorize.getMailLink().click();
		UiDriverHelper.setChildWindow();
		Logger.getLogger().info("Open mail page");
	}


	public static void waitUntilLinkDisk() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
		wait.withMessage("")
				.until(ExpectedConditions.visibilityOfElementLocated(PanelAuthorize.PANEL_AUTORIZATION_LOCATOR));
	}

	public static void submitLinkDisk() {
		waitUntilLinkDisk();
		PanelAuthorize.getDiskLink().click();
		UiDriverHelper.setChildWindow();
	}


}
