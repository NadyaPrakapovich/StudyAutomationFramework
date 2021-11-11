package pageWrappers.loginPage;

import framework.webElements.Button;
import framework.webElements.Input;
import org.openqa.selenium.By;
import pageWrappers.AbstractPage;

public class loginPage extends AbstractPage {
	private static final By USER_FIELD_LOCATOR = By.id("passp-field-login");
	private static final By SIGN_IN_BUTTON_LOCATOR = By.id("passp:sign-in");
	// static final By PASSWORD_FIELD_LOCATOR_VISIBLE = By.id("passp-field-passwd");

	private static final By PASSWORD_FIELD_LOCATOR = new By.ByXPath("//input[@name=\"passwd\"]");

	public static Input getUserNameField() {
		return new Input(USER_FIELD_LOCATOR);
	}

	public static Input getUPassowordField() {
		return new Input(PASSWORD_FIELD_LOCATOR);
	}

	public static Button getSignInButton() {
		return new Button(SIGN_IN_BUTTON_LOCATOR);
	}


}
