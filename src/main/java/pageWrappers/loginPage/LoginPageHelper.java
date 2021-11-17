package pageWrappers.loginPage;

import framework.wait.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageWrappers.mailPage.MailPage;
import pageWrappers.mailPage.MailPageHelper;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

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
		Wait.waitUntilvisibilityOfElement(LoginPage.getUPassowordField().getLocator());
		fillPassword(password);
		submitSignInButton();
		Wait.waitUntilvisibilityOfElement(MailPage.MAIL_PAGE_LOCATOR);
		//MailPageHelper.waitUntilOpenedMailPage();

	}
}
