package pageWrappers.diskPage;

import framework.driver.UiDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class DiskPageHelper {
	public static void openDownload(){
		Actions action=new Actions(UiDriver.getDriver());
		action.doubleClick(UiDriver.getDriver().findElement(DiskPage.FOLDER_DOWNLOAD_LOCATOR)).perform();
	}
	public static void openContextMenu(){
		Actions action=new Actions(UiDriver.getDriver());
		action.contextClick(UiDriver.getDriver().findElement(DiskPage.FOLDER_DOWNLOAD_LOCATOR)).build().perform();
		//UiDriver.getDriver().findElement(By.xpath("//div[@data-key=\"item-4\"]")).click();
		//UiDriver.getDriver()
		//		.findElement(By.xpath("//div[@class='confirmation-dialog__footer']/button[@aria-disabled='false']")).click();
	}

	public static void moveFile(){
		UiDriver.getDriver().findElement(DiskPage.getButtonMoveFile().getLocator()).click();
	}

	public static void moveFileToMainDir(){
		openContextMenu();
	}
}
