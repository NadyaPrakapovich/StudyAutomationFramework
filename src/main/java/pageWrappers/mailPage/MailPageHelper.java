package pageWrappers.mailPage;

import framework.driver.UiDriver;
import framework.waiter.Wait;
import io.qameta.allure.Step;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageWrappers.mailPage.newMailForm.MailForm;
import utility.Logger;

import java.io.File;

public class MailPageHelper {


	public static void pegeRefresh() {
		UiDriver.getDriver().navigate().refresh();
	}

	public static void openProfile() {
		MailPage.getProfile().click();
	}

	public static void submitLogOut() {
		MailPage.getLogOut().click();
	}

	public static void moveMouseToElement() {
		Actions action = new Actions(UiDriver.getDriver());
		action.moveToElement(MailPage.getPanelSaveFile().getElement()).perform();
	}

	@Step("Click new mail")
	public static void submitNewMail() {
		MailPage.getNewMail().click();
		Wait.waitUntilVisibilityOfElement(MailForm.getFormNewMail());

		Assert.assertEquals(MailForm.getTitleNewMail().getElement().getText(),"Новое письмо", "Open is not new mail");
	}

	@Step("Save file to disk")
	public static void submitSaveFileToDisk(File file) {
		Wait.waitUntilVisibilityOfElement(MailPage.getPanelSaveFile());
		moveMouseToElement();
		MailPage.getSaveDisk().click();
		Wait.waitUntilVisibilityOfElement(MailPage.getIframeToSaveDick());
		closeIframeSaveDisk();

		Assert.assertTrue(MailPage.getNameFile().getElement().getAttribute("title").contains(file.getName()),"Save wrong file");
		Logger.getLogger().info("File was save in disk");

	}

	@Step("Close window saving file")
	public static void closeIframeSaveDisk() {
		UiDriver.getDriver().switchTo().frame(MailPage.getIframeToSaveDick().getElement());
		Wait.waitUntilToBeClickable(MailPage.geButtonMoveInFrame());
		MailPage.getCloseIframe().click();
		UiDriver.getDriver().switchTo().defaultContent();
	}

	@Step("Open disk")
	public static void openDisk() {
		Wait.waitUntilToBeClickable(MailPage.getDiskButton());
		MailPage.getDiskButton().click();
		String titleWindows = UiDriver.getDriver().getTitle();
		Assert.assertEquals(titleWindows, "Яндекс.Диск", "Unknown window title");
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
