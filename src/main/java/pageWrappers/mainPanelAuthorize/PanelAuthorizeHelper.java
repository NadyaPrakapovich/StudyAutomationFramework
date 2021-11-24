package pageWrappers.mainPanelAuthorize;

import framework.driver.UiDriver;
import framework.driver.UiDriverHelper;
import framework.waiter.Wait;
import io.qameta.allure.Step;
import org.testng.Assert;
import utility.Logger;

public class PanelAuthorizeHelper {

	@Step("Open page  authorization")
	public static void openMail() {
		PanelAuthorize.getMailLink().click();
		UiDriverHelper.setChildWindow();
		Logger.getLogger().info("Open page authorization");
		String titleWindows = UiDriver.getDriver().getTitle();
		Assert.assertEquals(titleWindows, "Авторизация", "Unknown window title");
	}

	public static void submitLinkDisk() {
		Wait.waitUntilVisibilityOfElement(PanelAuthorize.getPanelAthorization());
		PanelAuthorize.getDiskLink().click();
		UiDriverHelper.setChildWindow();
	}


}
