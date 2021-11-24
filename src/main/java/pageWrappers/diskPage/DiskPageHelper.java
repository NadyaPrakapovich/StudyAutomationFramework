package pageWrappers.diskPage;

import framework.driver.UiDriver;
import framework.waiter.Wait;
import framework.webElements.HtmlElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utility.Logger;

import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
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

		//WebElement htmlFileName = findFileInDownloads(file.getName());
		Assert.assertTrue(DiskPage.getFileNameInDownloads().getElement().getText().contains(file.getName()), "Move wrong file");
		openContextMenu();
		Logger.getLogger().info("Move file in folder Files");

	}

	@Step("Open context menu")
	public static void openContextMenu() {

		Actions action = new Actions(UiDriver.getDriver());
		By locator = DiskPage.getFolderDownload().getLocator();
		action.contextClick(UiDriver.getDriver().findElement(locator)).build().perform();
		//action.contextClick(UiDriver.getDriver().findElement(fileName)).build().perform();
		Logger.getLogger().info("Open context menu");

		DiskPage.getItemMove().click();
		Wait.waitUntilVisibilityOfElement(DiskPage.getButtonMoveFile());
		DiskPage.getButtonMoveFile().click();

	}

	@Step("Open folder File")
	public static void openFolderFileInDisk() {
		Wait.waitUntilVisibilityOfElement(DiskPage.getFolderFile());
		DiskPage.getFolderFile().click();
	}

	@Step("DragAndDrop file to basket ")
	public static void moveFileToBasketByDragAndDrop(File file) {
		Wait.waitUntilVisibilityOfElement(DiskPage.getFileForMove());
		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(DiskPage.getFileForMove().getElement(), DiskPage.getBasket().getElement()).build().perform();

	}

	public static WebElement findFileInDownloads(String fileName) {
		List<WebElement> elements = UiDriver.getDriver().findElements(DiskPage.getListFileNameInDownloads().getLocator());
		for (WebElement el : elements) {
			if (el.getText().contains(fileName)) {
				System.out.println(el.getText());
				return  el;
			}
		}
		Logger.getLogger().info("file exist in folder");
		return null;
	}

	@Step("Chech file in basket")
	public static void checkFileinBasket(File file) {
		DiskPage.getBasket().click();
		//Assert.assertTrue(DiskPage.getFileNameInBasket().getElement().getText().contains(file.getName()), "Wrong file");
		;

	}
}
