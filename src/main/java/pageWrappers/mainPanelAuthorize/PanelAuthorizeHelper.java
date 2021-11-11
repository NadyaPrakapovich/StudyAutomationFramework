package pageWrappers.mainPanelAuthorize;

import framework.driver.UiDriverHelper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageWrappers.loginPage.loginPage;
import pageWrappers.mailPage.MailPage;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class PanelAuthorizeHelper {
	public static void submitLinkMail() {
		PanelAuthorize.getMailLink().Click();
		UiDriverHelper.setChildWindow();

	}


}
