package pageWrappers.mainPanelAuthorize;

import framework.webElements.Button;
import framework.webElements.HtmlElement;
import org.openqa.selenium.By;

public class PanelAuthorize {
	private static final By MAIL_LINK_LOCATOR= new By.ByXPath("//a[@data-statlog=\"notifications.mail.logout.mail\"]");
	private static final By DISK_LINK_LOCATOR= new By.ByXPath("//a[@data-statlog=\"notifications.mail.logout.disk\"]");

	public static final By PANEL_AUTORIZATION_LOCATOR = By.className("desk-notif-card__login-new-items");

	public static Button getMailLink(){
		return new Button(MAIL_LINK_LOCATOR);
	}

	public static Button getDiskLink(){
		return new Button(DISK_LINK_LOCATOR);
	}
}
