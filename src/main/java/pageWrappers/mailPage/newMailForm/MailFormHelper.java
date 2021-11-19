package pageWrappers.mailPage.newMailForm;

import framework.driver.UiDriver;
import framework.waiter.Wait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Logger;

import java.io.IOException;
import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class MailFormHelper {

	public static void fillToSend(String whom) {
		MailForm.getFieldToSend().sendKeys(whom);
	}

	public static void fillSubject(String subject) {
		MailForm.getFieldSubject().sendKeys(subject);
	}

	public static void fillTheme(String theme) {
		MailForm.getFieldTheme().sendKeys(theme);
	}


	public static void attachFile(String filepath) throws IOException {
		Logger.getLogger().info("Attach to file");
		UiDriver.getDriver().findElement(MailForm.getAttachFile().getLocator()).sendKeys(filepath);
		Wait.waitUntilInvisibilityOfElement(MailForm.FORM_PROGRESSBAR_LOCATOR);
	}

	public static void writeMail(String toSend, String subject, String theme) throws IOException {
		Wait.waitUntilVisibilityOfElement(MailForm.FORM_NEW_MAIL_LOCATOR);
		Logger.getLogger().info("Try to write mail {}/{}/{}", toSend, subject,theme);
		fillToSend(toSend);
		fillSubject(subject);
		fillTheme(theme);
		//attachFile();
	}

	public static void sendMail() {
		MailForm.getButtonSendMail().click();
		pageRefresh();
		Logger.getLogger().info("Send mail success");
	}

	public static void pageRefresh() {
		try {
			UiDriver.getDriver().navigate().refresh();
			Alert alt = UiDriver.getDriver().switchTo().alert();
			alt.accept();
		} catch (NoAlertPresentException noe) {
			// no alert.
		}
	}
}
