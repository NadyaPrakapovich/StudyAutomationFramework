package pageWrappers.mailPage;

import framework.webElements.Button;
import framework.webElements.Iframe;
import framework.webElements.Link;
import framework.webElements.Panel;
import org.openqa.selenium.By;

public class MailPage {
	private static final By NEW_MAIL_LINK_LOCATOR = By.className("mail-ComposeButton-Text");
	private static final By SAVE_TO_DISK_LOCATOR = By.xpath("(//a[@data-hid=\"1.2\"])[1]");
	//private static final By SAVE_TO_DISK_LOCATOR = By.cssSelector("mail-File-Actions-Item_secondary");
	private static final By PROFILE_LOCATOR = By.cssSelector(".legouser__current-account");
	private static final By LOG_OUT_LOCATOR = By.cssSelector(".legouser__menu-item_action_exit");
	public static final By LIST_ATTACH_FILE_LOCATOR =By.xpath("//span[@class=\"mail-File-Actions\"]");
	private static final By IFRAME_SAVE_DISK_OK_LOCATOR = By.xpath("//iframe[@class=\"disk-widget-save\"]");
	private static final By BUTTON_MOVE_IN_FRAME_LOCATOR=By.cssSelector(".button_js_inited");
	private static final By BUTTON_CLOSE_IN_FRAME_LOCATOR=By.xpath("//button[@data-reactid=\".0.0\"]");

	public static final By MAIL_PAGE_LOCATOR = By.id("nb-1");

	public static final By PANEL_SAVE_TO_DISK=By.xpath("(//div[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_attachmentsFiles'])[1]");

	public static Link getNewMail() {
		return new Link(NEW_MAIL_LINK_LOCATOR);
	}

	public static Button getSaveDisk() { return new Button(SAVE_TO_DISK_LOCATOR);}

	public static Button getProfile() {
		return new Button(PROFILE_LOCATOR);
	}

	public static Button getLogOut() {
		return new Button(LOG_OUT_LOCATOR);
	}

	public static Iframe getIframe(){
		return new Iframe(IFRAME_SAVE_DISK_OK_LOCATOR);
	}

	public static Button geButtonMoveInFrame() {
		return new Button(BUTTON_MOVE_IN_FRAME_LOCATOR);
	}

	public static Panel getPenal(){
		return new Panel(PANEL_SAVE_TO_DISK);
	}

	public static Button getCloseIframe(){
		return new Button(BUTTON_CLOSE_IN_FRAME_LOCATOR);
	}

}
