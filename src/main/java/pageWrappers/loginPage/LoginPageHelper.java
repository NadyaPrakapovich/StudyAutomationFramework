package pageWrappers.loginPage;

import framework.driver.UiDriver;
import framework.waiter.Wait;
import io.qameta.allure.Step;
import org.testng.Assert;
import pageWrappers.mailPage.MailPage;
import utility.Logger;

public class LoginPageHelper {

	@Step("Fill username")
	public static void fillUserName(String userName) {
		LoginPage.getUserNameField().sendKeys(userName);
	}

	@Step("Fill password")
	public static void fillPassword(String password) {
		LoginPage.getUPassowordField().sendKeys(password);
	}

	@Step("Click signIn")
	public static void submitSignInButton() {
		LoginPage.getSignInButton().click();
	}

	@Step( "Sign in with right credentials")
	public static void signIn(String userName, String password) {
		Logger.getLogger().info("Try to login as {}/{}", userName, password);
		fillUserName(userName);
		submitSignInButton();
		Wait.waitUntilVisibilityOfElement(LoginPage.getUPassowordField());
		fillPassword(password);
		submitSignInButton();
		Wait.waitUntilVisibilityOfElement(MailPage.getPageMail());

		Logger.getLogger().info("Logged in success as {}/{}", userName, password);
		String titleWindows = UiDriver.getDriver().getTitle();
		Assert.assertTrue(titleWindows.contains("Входящие — Яндекс.Почта"), "Unknown window title");
		Assert.assertEquals(userName,LoginPage.getAccountName().getElement().getText(), "Unknown user");
	}
}
