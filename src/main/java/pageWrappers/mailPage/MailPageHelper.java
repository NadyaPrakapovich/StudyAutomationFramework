package pageWrappers.mailPage;

import framework.driver.UiDriver;
import framework.waiter.Wait;
import org.openqa.selenium.interactions.Actions;

public class MailPageHelper {

	public static void submitNewMail() {
		MailPage.getNewMail().click();

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
		Wait.waitUntilToBeClickable(MailPage.geButtonMoveInFrame().getLocator());

		UiDriver.getDriver().findElement(MailPage.getCloseIframe().getLocator()).click();
		UiDriver.getDriver().switchTo().defaultContent();

	}

	public static void openDisk(){
		Wait.waitUntilToBeClickable(MailPage.getDiskButton().getLocator());
		//Actions action = new Actions(UiDriver.getDriver());
		//action.moveToElement(MailPage.getDiskButton().getElement()).perform();
		MailPage.getDiskButton().click();
	}

	public static void logOut() {
		//Wait.waitUntilVisibilityOfElement(MailPage.getProfile().getLocator());
		openProfile();
		submitLogOut();
		UiDriver.getDriver().close();
		//UiDriver.getDriver().switchTo().window();
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
