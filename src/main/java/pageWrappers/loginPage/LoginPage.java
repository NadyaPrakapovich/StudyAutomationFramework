package pageWrappers.loginPage;

import framework.webElements.Button;
import framework.webElements.HtmlElement;
import framework.webElements.Input;
import org.openqa.selenium.By;
import pageWrappers.AbstractPage;

public class LoginPage extends AbstractPage {

	private static final By USER_FIELD_LOCATOR = By.id("passp-field-login");
	private static final By SIGN_IN_BUTTON_LOCATOR = By.id("passp:sign-in");
	private static final By PASSWORD_FIELD_LOCATOR = By.xpath("//input[@name=\"passwd\"]");
	private static final By ACCOUNT_NAME_LOCATOR = By.className("user-account__name");

	public static Input getUserNameField() {
		return new Input(USER_FIELD_LOCATOR);
	}

	public static Input getUPassowordField() {
		return new Input(PASSWORD_FIELD_LOCATOR);
	}

	public static Button getSignInButton() {
		return new Button(SIGN_IN_BUTTON_LOCATOR);
	}

	public static HtmlElement getAccountName() {
		return new HtmlElement(ACCOUNT_NAME_LOCATOR);
	}


}
