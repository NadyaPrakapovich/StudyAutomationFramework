package pageWrappers.mailPage.newMailForm;

import framework.webElements.Button;
import framework.webElements.HtmlElement;
import framework.webElements.Input;
import org.openqa.selenium.By;

public class MailForm {

	private static final By FIELD_TO_SEND_LOCATOR = By.xpath("(//div[@class=\"composeYabbles\"])[1]");
	private static final By FIELD_SUBJECT_LOCATOR = By.cssSelector(".composeTextField");
	private static final By FIELD_THEME_LOCATOR = By.xpath("//div[@role=\"textbox\"]");
	private static final By BUTTON_ATTACH_LOCATOR = By.xpath("//input[@type=\"file\"]");
	private static final By PROGRESSBAR_LOCATOR = By.cssSelector(".LoadingProgress__progress--10oXR");
	private static final By BUTTON_SEND_LOCATOR = By.cssSelector(".ComposeControlPanel-SendButton");
	private static final By FORM_NEW_MAIL_LOCATOR = By.cssSelector(".ComposePopup-Content");

	public static Input getFieldToSend() {return new Input(FIELD_TO_SEND_LOCATOR);	}

	public static Input getFieldSubject() {
		return new Input(FIELD_SUBJECT_LOCATOR);
	}

	public static Input getFieldTheme() {
		return new Input(FIELD_THEME_LOCATOR);
	}

	public static Button getAttachFile() {
		return new Button(BUTTON_ATTACH_LOCATOR);
	}

	public static Button getButtonSendMail() {
		return new Button(BUTTON_SEND_LOCATOR);
	}

	public static HtmlElement getFormNewMail() {
		return new HtmlElement(FORM_NEW_MAIL_LOCATOR);
	}

	public static HtmlElement getProgressbar() {
		return new HtmlElement(PROGRESSBAR_LOCATOR);
	}

}
