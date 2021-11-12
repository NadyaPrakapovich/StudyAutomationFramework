package pageWrappers.mailPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class MailPageHelper {

	public static void submitNewMailButton() {
		MailPage.getNewMail().click();
	}

	public static void waitUntilOpenedMailPage() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("Page was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(MailPage.MAIL_PAGE_LOCATOR));
	}

	public static void openProfile(){
		MailPage.getProfile().click();
	}


	public static void submitSaveDisk(){
		MailPage.getSaveDisk().click();
	}



}
