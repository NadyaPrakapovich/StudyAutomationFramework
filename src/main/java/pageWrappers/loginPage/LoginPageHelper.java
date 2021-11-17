package pageWrappers.loginPage;

import framework.wait.Wait;
import pageWrappers.mailPage.MailPage;

public class LoginPageHelper {

	//@Step("Fill username {0}")
	public static void fillUserName(String userName) {
		LoginPage.getUserNameField().sendKeys(userName);
	}

	//	@Step("fill password")
	public static void fillPassword(String password) {
		LoginPage.getUPassowordField().sendKeys(password);
	}

	//@Step("Click signIn")
	public static void submitSignInButton() {
		LoginPage.getSignInButton().click();
	}

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
