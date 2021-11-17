package pageWrappers.mailPage;

import fileManager.CreateFile;
import framework.driver.UiDriver;
import framework.driver.UiDriverHelper;
import framework.webElements.HtmlElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Objects;

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

	public static void pegeRefresh() {
		UiDriver.getDriver().navigate().refresh();
	}

	public static void openProfile() {
		MailPage.getProfile().click();
	}

	public static void submitLogOut() {
		MailPage.getLogOut().click();
	}

	public static void logOut() {
		openProfile();
		submitLogOut();
		UiDriver.getDriver().close();
		//UiDriver.getDriver().switchTo().window();

	}

	public static void submitSaveDisk() {
		//waitUntilGetSaveDisk();
		MailPage.getSaveDisk().click();
		UiDriver.getDriver().switchTo().frame(MailPage.getIframe().getElement());
		//waitUntilCopyFileToDisk();

		pegeRefresh();


	}

	public static void waitUntilCopyFileToDisk() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("Page was not opened")
				.until(ExpectedConditions.elementToBeClickable(MailPage.getMoveInFrame().getElement()));
	}

	public static void waitUntilGetSaveDisk() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("Page was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(MailPage.getSaveDisk().getLocator()));
	}

//	public static void findMail() {
//		List<WebElement> attachFiles = UiDriver.getDriver().findElements(MailPage.LIST_ATTACH_FILE_LOCATOR);
//		for (WebElement attachFile : attachFiles) {
//			try {
//				if (Objects.equals(attachFile, CreateFile.createFile().getName().toString()){
//
//				}
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		}
//	}
}
