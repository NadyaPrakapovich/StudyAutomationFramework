package pageWrappers.newMailForm;

import framework.webElements.Button;
import framework.webElements.Input;
import framework.webElements.Link;
import org.openqa.selenium.By;

public class MailForm {
	private static final By FIELD_WHOM_LOCATOR = By.xpath("(//div[@class=\"composeYabbles\"])[1]");
	private static final By FIELD_SUBJECT_LOCATOR = By.className("composeTextField");
	private static final By FIELD_THEME_LOCATOR = By.xpath("//div[@role=\"textbox\"]");
	private static final By BUTTON_SEND_LOCATOR = By.className("ComposeControlPanel-SendButton");


	private static final By FIELD_CHOOSE_EMAIL_LOCATOR = By.className("ContactsSuggestItemDesktop-Email");

	public static final By FORM_NEW_MAIL_LOCATOR = By.className("ComposePopup-Content");
	//private static final By FIELD_WHOM_LOCATOR = new By.ByClassName("MultipleAddressesDesktop ComposeRecipients-MultipleAddressField ComposeRecipients-ToField tst-field-to");


	public static Input getFieldWhom() {
		return new Input(FIELD_WHOM_LOCATOR);
	}

	public static Input getFieldSubject() {
		return new Input(FIELD_SUBJECT_LOCATOR);
	}

	public static Input getFieldTheme() {
		return new Input(FIELD_THEME_LOCATOR);
	}
	public static Button getButtonSendMail(){
		return new Button(BUTTON_SEND_LOCATOR);
	}
}
