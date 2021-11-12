package pageWrappers.mainPanelAuthorize;

import framework.driver.UiDriverHelper;

public class PanelAuthorizeHelper {
	public static void submitLinkMail() {
		PanelAuthorize.getMailLink().click();
		UiDriverHelper.setChildWindow();

	}


}
