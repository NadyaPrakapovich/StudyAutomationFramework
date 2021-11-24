package pageWrappers.mailPage.newMailForm;

import framework.driver.UiDriver;
import framework.driver.UiDriverHelper;
import framework.waiter.Wait;
import io.qameta.allure.Step;
import org.testng.Assert;
import utility.Logger;

import java.io.File;

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

	@Step("Write mail")
	public static void writeMail(String toSend, String subject, String theme) {
		Wait.waitUntilVisibilityOfElement(MailForm.getFieldToSend());
		fillToSend(toSend);
		fillSubject(subject);
		fillTheme(theme);
		Logger.getLogger().info("Write mail {}/{}/{}", toSend, subject, theme);

	}

	@Step("Attach file")
	public static void attachFile(File file) {
		UiDriver.getDriver().findElement(MailForm.getAttachFile().getLocator()).sendKeys(file.getAbsolutePath());
		Wait.waitUntilInvisibilityOfElement(MailForm.getProgressbar());
		Logger.getLogger().info("Attach to file");
		}

	@Step("Send mail")
	public static void sendMail() {
		MailForm.getButtonSendMail().click();
		UiDriverHelper.pageRefresh();
		Logger.getLogger().info("Send mail was success");
	}

}
