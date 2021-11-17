package pageWrappers.mailPage.newMailForm;

import framework.webElements.Button;
import framework.webElements.Iframe;
import framework.webElements.Input;
import org.openqa.selenium.By;

public class MailForm {


	private static final By FIELD_TO_SEND_LOCATOR = By.xpath("(//div[@class=\"composeYabbles\"])[1]");
	private static final By FIELD_SUBJECT_LOCATOR = By.className("composeTextField");
	private static final By FIELD_THEME_LOCATOR = By.xpath("//div[@role=\"textbox\"]");
	private static final By BUTTON_ATTACH_LOCATOR = By.xpath("//input[@type=\"file\"]");
	public static final By FORM_PROGRESSBAR_LOCATOR = By.className("LoadingProgress__progress--10oXR");
	public static final By ALERT_ABOUT_MAIL_WAS_SEND_LOCATOR = By.className(".ComposeDoneScreen-Wrapper");




	private static final By BUTTON_SEND_LOCATOR = By.className("ComposeControlPanel-SendButton");


	private static final By FIELD_CHOOSE_EMAIL_LOCATOR = By.className("ContactsSuggestItemDesktop-Email");

	public static final By FORM_NEW_MAIL_LOCATOR = By.className("ComposePopup-Content");

	public static Input getFieldWhom() {
		return new Input(FIELD_TO_SEND_LOCATOR);
	}

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


}
