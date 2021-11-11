package pageWrappers.loginPage;

import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageWrappers.loginPage.loginPage;
import pageWrappers.mailPage.MailPageHelper;
import pageWrappers.mainPanelAuthorize.PanelAuthorizeHelper;
import pageWrappers.newMailForm.MailForm;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class loginPageHelper {

	//@Step("Fill username {0}")
	public static void fillUserName(String userName) {
		loginPage.getUserNameField().sendKeys(userName);
	}

	//	@Step("fill password")
	public static void fillPassword(String password) {
		loginPage.getUPassowordField().sendKeys(password);
	}

	//@Step("Click signIn")
	public static void submitSignInButton() {
		loginPage.getSignInButton().Click();
	}

	public static void waitUntilInputPassword() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("")
				.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getUPassowordField().getLocator()));
	}

	public static void signIn(String userName, String password) {
		fillUserName(userName);
		submitSignInButton();
		waitUntilInputPassword();
		fillPassword(password);
		submitSignInButton();

	}
}
