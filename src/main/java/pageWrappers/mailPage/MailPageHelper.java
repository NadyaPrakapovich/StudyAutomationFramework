package pageWrappers.mailPage;

import framework.driver.UiDriver;
import framework.wait.Wait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageWrappers.mailPage.newMailForm.MailForm;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class MailPageHelper {

	public static void submitNewMail() {
		MailPage.getNewMail().click();
		Wait.waitUntilVisibilityOfElement(MailForm.FORM_NEW_MAIL_LOCATOR);
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

	public static void moveToClick() {
		Actions action = new Actions(UiDriver.getDriver());
		action.moveToElement(MailPage.getPanel().getElement()).perform();
	}

	public static void submitSaveToDisk() {
		Wait.waitUntilVisibilityOfElement(MailPage.getPanel().getLocator());
		moveToClick();
		MailPage.getSaveDisk().click();
		Wait.waitUntilVisibilityOfElement(MailPage.getIframe().getLocator());
		UiDriver.getDriver().switchTo().frame(MailPage.getIframe().getElement());
		Wait.waitUntilToBeClickable(MailPage.geButtonMoveInFrame().getElement());

		UiDriver.getDriver().findElement(MailPage.getCloseIframe().getLocator()).click();

	}

	public static void openDisk(){
		MailPage.getDiskButton().click();
	}

	public static void logOut() {
		//Wait.waitUntilVisibilityOfElement(MailPage.getProfile().getLocator());
		openProfile();
		submitLogOut();
		UiDriver.getDriver().close();
		//UiDriver.getDriver().switchTo().window();
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
