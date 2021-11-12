package pageWrappers.newMailForm;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class MailFormHelper {

	public static void fillWhom(String whom) {
		MailForm.getFieldWhom().sendKeys(whom);
	}

	public static void fillSubject(String subject) {
		MailForm.getFieldSubject().sendKeys(subject);
	}

	public static void fillTheme(String theme) {
		MailForm.getFieldTheme().sendKeys(theme);
	}

	public static void sendMail(){
		MailForm.getButtonSendMail().click();
	}


	public static void waitUntilOpenedMailForm() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("")
				.until(ExpectedConditions.visibilityOfElementLocated(MailForm.FORM_NEW_MAIL_LOCATOR));
	}

	public static void writeMail(String whom, String subject, String theme) {
		fillWhom(whom);
		fillSubject(subject);
		fillTheme(theme);
		sendMail();
	}

}
