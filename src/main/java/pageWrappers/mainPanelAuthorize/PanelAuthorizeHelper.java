package pageWrappers.mainPanelAuthorize;

import framework.driver.UiDriver;
import framework.driver.UiDriverHelper;
import framework.wait.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageWrappers.loginPage.LoginPage;
import pageWrappers.mailPage.MailPage;
import pageWrappers.mailPage.MailPageHelper;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class PanelAuthorizeHelper {

	public static void openMail() {
		PanelAuthorize.getMailLink().click();
		UiDriverHelper.setChildWindow();
	}


	public static void waitUntilLinkDisk() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
		wait.withMessage("")
				.until(ExpectedConditions.visibilityOfElementLocated(PanelAuthorize.PANEL_AUTORIZATION_LOCATOR));
	}

	public static void submitLinkDisk(){
		//UiDriver.getDriver().switchTo().window(UiDriver.getDriver().getWindowHandle());
		waitUntilLinkDisk();
		PanelAuthorize.getDiskLink().click();
		UiDriverHelper.setChildWindow();
	}


}
