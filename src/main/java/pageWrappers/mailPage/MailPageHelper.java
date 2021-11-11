package pageWrappers.mailPage;

import framework.driver.UiDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageWrappers.loginPage.loginPage;
import pageWrappers.newMailForm.MailForm;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class MailPageHelper {

	public static void submitNewMailButton() {
		MailPage.getNewMail().Click();
	}

	public static void waitUntilOpenedMailPage() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("Page was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(MailPage.MAIL_PAGE_LOCATOR));
	}


	public static void waitUntilOpenedMailForm() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("Page was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(MailForm.getFieldSubject().getLocator()));
	}


}
