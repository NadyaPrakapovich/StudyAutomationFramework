package pageWrappers.mailPage;

import framework.webElements.Button;
import framework.webElements.Link;
import org.openqa.selenium.By;

public class MailPage {
	private static final By NEW_MAIL_LINK_LOCATOR = By.className("mail-ComposeButton-Text");
	private static final By SAVE_TO_DISK_LOCATOR = By.className("mail-File-Actions-Item");
	private static final By PROFILE_LOCATOR = By.xpath("(//img[@class=\"user-pic__image\"])[1]");

	public static final By MAIL_PAGE_LOCATOR = By.id("nb-1");

	public static Link getNewMail() {
		return new Link(NEW_MAIL_LINK_LOCATOR);
	}

	public static Button getSaveDisk() {
		return new Button(SAVE_TO_DISK_LOCATOR);
	}

	public static Button getProfile(){
		return new Button(PROFILE_LOCATOR);
	}

}
