package pageWrappers.mailPage.newMailForm;

import fileManager.CreateFile;
import framework.driver.UiDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.time.Year;

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

	public static void sendMail() {
		MailForm.getButtonSendMail().click();
	}


	public static void waitUntilOpenedMailForm() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("")
				.until(ExpectedConditions.visibilityOfElementLocated(MailForm.FORM_NEW_MAIL_LOCATOR));
	}

	public static void writeMail(String whom, String subject, String theme) throws IOException {
		fillWhom(whom);
		fillSubject(subject);
		fillTheme(theme);
		attachFile();
		sendMail();
		waitUntilDownloadihgFle();
		//closeAlertAboutSendMail();
		pageRefresh();
	}

	public static void attachFile() throws IOException {
		//File file=cr
		//MailForm.getAttachFile();

		UiDriver.getDriver().findElement(MailForm.getAttachFile().getLocator()).sendKeys(CreateFile.createFile().getAbsolutePath());

	}

	public static void waitUntilDownloadihgFle() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(MailForm.FORM_PROGRESSBAR_LOCATOR));
	}

	public static void closeAlertAboutSendMail() {
		//String keyPressed= Keys.chord(Keys.ENTER,Keys.CONTROL);
		//	UiDriver.getDriver().findElement(By.className(".ComposeDoneScreen-Wrapper")).sendKeys(keyPressed);
//		Actions actions=new Actions(UiDriver.getDriver());
//		actions.keyDown(Keys.ENTER).keyDown(Keys.CONTROL).perform();

		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(MailForm.ALERT_ABOUT_MAIL_WAS_SEND_LOCATOR));

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
