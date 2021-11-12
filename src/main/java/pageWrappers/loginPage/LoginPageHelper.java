package pageWrappers.loginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	public static void waitUntilInputPassword() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("")
				.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.getUPassowordField().getLocator()));
	}

	public static void signIn(String userName, String password) {
		fillUserName(userName);
		submitSignInButton();
		waitUntilInputPassword();
		fillPassword(password);
		submitSignInButton();
		MailPageHelper.waitUntilOpenedMailPage();

	}
}
