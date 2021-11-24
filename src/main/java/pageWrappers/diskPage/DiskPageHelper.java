package pageWrappers.diskPage;

import framework.driver.UiDriver;
import framework.waiter.Wait;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utility.Logger;

import java.io.File;
import java.util.List;

public class DiskPageHelper {
	@Step("Open folder Downloads on disk")
	public static void openDownload() {
		Actions action = new Actions(UiDriver.getDriver());
		action.doubleClick(UiDriver.getDriver().findElement(DiskPage.getFolderDownload().getLocator())).perform();
		Logger.getLogger().info("Open folder Downloads on disk");
	}

	@Step("Move file in folder Files")
	public static void moveFileToMainFolder(File file) {
		Wait.waitUntilVisibilityOfElement(DiskPage.getFolderDownload());
		Wait.waitUntilVisibilityOfElement(DiskPage.getFileNameInDownloads());

		By listElements = DiskPage.getListFileName().getLocator();
		WebElement fileNameElement = findFile(listElements, file.getName());
		Assert.assertTrue(fileNameElement.getText().contains(file.getName()), "Move wrong file");

		openContextMenu(fileNameElement);

	}

	@Step("Open context menu")
	public static void openContextMenu(WebElement fileNameElement) {

		Actions action = new Actions(UiDriver.getDriver());
		action.contextClick(fileNameElement).build().perform();
		Logger.getLogger().info("Open context menu");

		DiskPage.getItemMove().click();
		Wait.waitUntilVisibilityOfElement(DiskPage.getButtonMoveFile());
		DiskPage.getButtonMoveFile().click();
		Wait.waitUntilVisibilityOfElement(DiskPage.getmMessageFileMoved());
		Logger.getLogger().info("Move file in folder Files");
	}

	@Step("Open folder File")
	public static void openFolderFileInDisk() {
		Wait.waitUntilVisibilityOfElement(DiskPage.getFolderFile());
		DiskPage.getFolderFile().click();
		Logger.getLogger().info("Open folder Files");
	}

	@Step("DragAndDrop file to basket ")
	public static void moveFileToBasketByDragAndDrop(File file) {

		By listElements = DiskPage.getListFileName().getLocator();
		WebElement fileNameElement = findFile(listElements, file.getName());
		Assert.assertTrue(fileNameElement.getText().contains(file.getName()), "Move wrong file");

		WebElement wd = UiDriver.getDriver().findElement(By.xpath("//span[contains(text(),'"+fileNameElement.getText()+"')]/ancestor::div[contains(@class,'listing-item_theme_tile')]"));
		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(wd, DiskPage.getBasket().getElement()).build().perform();
		Wait.waitUntilVisibilityOfElement(DiskPage.getmMessageFileMoved());
		Logger.getLogger().info("File move in basket");
	}


	@Step("Chech file in basket")
	public static void checkFileinBasket(File file) {

		DiskPage.getBasket().click();
		Wait.waitUntilVisibilityOfElement(DiskPage.getListFileName());
		By listElements = DiskPage.getListFileName().getLocator();
		WebElement fileNameElement = findFile(listElements, file.getName());

		Assert.assertTrue(fileNameElement.getText().contains(file.getName()), "Wrong file");
		Logger.getLogger().info("File is basket");
	}

	public static WebElement findFile(By listElements, String fileName) {
		List<WebElement> elements = UiDriver.getDriver().findElements(listElements);
		for (WebElement el : elements) {
			if (el.getText().contains(fileName)) {
				System.out.println(el.getText());
				return el;
			}
		}
		Logger.getLogger().info("File exist in folder");
		return null;
	}
}
