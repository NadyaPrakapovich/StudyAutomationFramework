package pageWrappers.diskPage;

import framework.driver.UiDriver;
import framework.waiter.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utility.Logger;

public class DiskPageHelper {

	public static void openDownload() {
		Actions action = new Actions(UiDriver.getDriver());
		action.doubleClick(UiDriver.getDriver().findElement(DiskPage.getFolderDownload().getLocator())).perform();
		Logger.getLogger().info("Open folder Downloads on disk");
	}

	public static void openContextMenu() {

		Actions action = new Actions(UiDriver.getDriver());
		By locator = DiskPage.getFolderDownload().getLocator();
		action.contextClick(UiDriver.getDriver().findElement(locator)).build().perform();

		DiskPage.getItemMove().click();
		Wait.waitUntilVisibilityOfElement(DiskPage.getButtonMoveFile().getLocator());
		DiskPage.getButtonMoveFile().click();
		//UiDriver.getDriver().findElement(DiskPage.getItemMove().getLocator()).click();
		//Wait.waitUntilVisibilityOfElement(By.xpath("//div[@class='confirmation-dialog__footer']"));
		//UiDriver.getDriver().findElement(By.xpath("//div[@class='confirmation-dialog__footer']")).click();


		//("//div[@data-key=\"item-4\"]")).click();
		//UiDriver.getDriver()
		//		.findElement(By.xpath("//div[@class='confirmation-dialog__footer']/button[@aria-disabled='false']")).click();
	}

	public static void OpenDiskDownLoad() {

	}

	public static void moveFile() {
		UiDriver.getDriver().findElement(DiskPage.getButtonMoveFile().getLocator()).click();
	}

	public static void moveFileToMainDir() {
		Wait.waitUntilVisibilityOfElement(DiskPage.getFolderDownload().getLocator());
		openContextMenu();
		Logger.getLogger().info("Move file in folder Files");
	}

	public static void openFolderFileInDisk() {
		DiskPage.getFolderFile().click();
	}

	public static void moveFileToBasket() {
		Wait.waitUntilVisibilityOfElement(DiskPage.getFileForMove().getLocator());
		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(DiskPage.getFileForMove().getElement(), DiskPage.getBasket().getElement()).build().perform();
		//	dragAndDrop.perform();
	}
}
