package pageWrappers.mailPage;

import framework.driver.UiDriver;
import framework.waiter.Wait;
import org.openqa.selenium.interactions.Actions;
import utility.Logger;

public class MailPageHelper {

	public static void submitNewMail() { 	MailPage.getNewMail().click(); 	}

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

	public static void submitFileSaveToDisk() {
		Wait.waitUntilVisibilityOfElement(MailPage.getPanel());
		moveToClick();
		MailPage.getSaveDisk().click();
		Wait.waitUntilVisibilityOfElement(MailPage.getIframeToSaveDick());
		closeIframeSaveDisk();
		Logger.getLogger().info("File was save in disk");
	}

	public static void closeIframeSaveDisk(){
		UiDriver.getDriver().switchTo().frame(MailPage.getIframeToSaveDick().getElement());
		Wait.waitUntilToBeClickable(MailPage.geButtonMoveInFrame());
		MailPage.getCloseIframe().click();
		UiDriver.getDriver().switchTo().defaultContent();
	}

	public static void openDisk(){
		Wait.waitUntilToBeClickable(MailPage.getDiskButton());
		MailPage.getDiskButton().click();
		Logger.getLogger().info("Open disk");
	}

	public static void logOut() {
		//Wait.waitUntilVisibilityOfElement(MailPage.getProfile().getLocator());
		openProfile();
		submitLogOut();
		UiDriver.getDriver().close();
		//UiDriver.getDriver().switchTo().window();
	}


}
