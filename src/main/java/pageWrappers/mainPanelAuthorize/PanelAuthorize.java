package pageWrappers.mainPanelAuthorize;

import framework.webElements.Link;
import org.openqa.selenium.By;

public class PanelAuthorize {
	private static final By MAIL_LINK_LOCATOR= new By.ByXPath("//a[@data-statlog=\"notifications.mail.logout.mail\"]");
	private static final By DISK_LINK_LOCATOR= new By.ByXPath("//a[@data-statlog=\"notifications.mail.logout.disk\"]");

	public static Link getMailLink(){
		return new Link(MAIL_LINK_LOCATOR);
	}

	public static Link getDiskLink(){
		return new Link(DISK_LINK_LOCATOR);
	}
}
