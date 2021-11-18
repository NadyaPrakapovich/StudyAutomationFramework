package pageWrappers.loginPage;

import framework.waiter.Wait;
import pageWrappers.mailPage.MailPage;

public class LoginPageHelper {

	//@Step("Fill username {0}")
	public static void fillUserName(String userName) {
		LoginPage.getUserNameField().sendKeys(userName);
	}

	//@Step("Fill password")
	public static void fillPassword(String password) {
		LoginPage.getUPassowordField().sendKeys(password);
	}

	//@Step("Click signIn")
	public static void submitSignInButton() {
		LoginPage.getSignInButton().click();
	}

	//@Step( "Sign in with right credentials")
	public static void signIn(String userName, String password) {
		fillUserName(userName);
		submitSignInButton();
		Wait.waitUntilVisibilityOfElement(LoginPage.getUPassowordField().getLocator());
		fillPassword(password);
		submitSignInButton();
		Wait.waitUntilVisibilityOfElement(MailPage.MAIL_PAGE_LOCATOR);
		//MailPageHelper.waitUntilOpenedMailPage();

	}
}
