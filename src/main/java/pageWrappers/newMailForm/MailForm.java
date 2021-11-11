package pageWrappers.newMailForm;

import framework.webElements.Input;
import org.openqa.selenium.By;

public class MailForm {
	//public static final By MAIL_FORM_LOCATOR = new By.ByClassName("ComposeManager ComposeManager_hidden ComposeManager_size_large");
	public static final By FIELD_WHOM_LOCATOR = new By.ByXPath("(//div[@class='composeYabbles'])[1]");
	public static final By FIELD_SUBJECT_LOCATOR = new By.ByClassName("composeTextField ComposeSubject-TextField");
	public static final By FIELD_THEME_LOCATOR = new By.ByXPath("//div[@role=\"textbox\"]");

	public static final By FIELD_CHOOSE_EMAIL_LOCATOR = new By.ByClassName("ContactsSuggestItemDesktop-Email");

	//public static final By FIELD_WHOM_LOCATOR = new By.ByClassName("MultipleAddressesDesktop ComposeRecipients-MultipleAddressField ComposeRecipients-ToField tst-field-to");


	public static Input getFieldWhom(){
		return new Input(FIELD_WHOM_LOCATOR);
	}

	public static Input getFieldSubject(){
		return new Input(FIELD_SUBJECT_LOCATOR);
	}

	public static Input getFieldTheme(){
		return new Input(FIELD_THEME_LOCATOR);
	}
}
