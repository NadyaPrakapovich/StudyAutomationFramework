package pageWrappers.mailPage;

import framework.webElements.Button;
import framework.webElements.Link;
import org.openqa.selenium.By;

public class MailPage {
	private static final By NEW_MAIL_LINK_LOCATOR = By.className("mail-ComposeButton-Text");

	public static final By MAIL_PAGE_LOCATOR = By.id("nb-1");

	public static Link getNewMail() {
		return new Link(NEW_MAIL_LINK_LOCATOR);
	}

}
