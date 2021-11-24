package pageWrappers.diskPage;

import framework.webElements.Button;
import framework.webElements.HtmlElement;
import org.openqa.selenium.By;

import java.util.List;

public class DiskPage {
	private static final By FOLDER_DOWNLOAD_LOCATOR = By.xpath("(//div[@class='listing-item__fields'])[1]");
	//private static final By FOLDER_DOWNLOAD_LOCATOR = By.cssSelector(".navigation__link_downloads");
	private static final By BUTTON_IN_DIALOG_MOVE_FILE_LOCATOR = By.cssSelector(".confirmation-dialog__button_submit");
	private static final By ITEM_MOVE_IN_CONTEXT_MENU_LOCATOR = By.xpath("//div[@data-key='item-4']");
	private static final By BUTTON_FOLDER_FILE_LOCATOR = By.cssSelector(".navigation__link_current");
	private static final By FILE_LOCATOR = By.xpath("(//div[@class='listing-item__fields'])[2]");
	private static final By BASKET_LOCATOR = By.id("/trash");

	private static final By FILENAME_IN_DOWNLOADS = By.xpath("(//span[@class='clamped-text'])[2]");
	private static final By FILENAME_IN_BASKET = By.xpath("//span[@class='clamped-text'])[1]");
	private static final By LIST_FILENAME_IN_DOWNLOADS = By.cssSelector(".clamped-text");

	public static Button getButtonMoveFile() {
		return new Button(BUTTON_IN_DIALOG_MOVE_FILE_LOCATOR);
	}

	public static Button getFolderDownload() {
		return new Button(FOLDER_DOWNLOAD_LOCATOR);
	}

	public static Button getItemMove() {
		return new Button(ITEM_MOVE_IN_CONTEXT_MENU_LOCATOR);
	}

	public static Button getFolderFile() {
		return new Button(BUTTON_FOLDER_FILE_LOCATOR);
	}

	public static Button getFileForMove() {
		return new Button(FILE_LOCATOR);
	}

	public static Button getBasket() {
		return new Button(BASKET_LOCATOR);
	}

	public static HtmlElement getListFileNameInDownloads(){
				return new HtmlElement(LIST_FILENAME_IN_DOWNLOADS);
	}

	public static HtmlElement getFileNameInDownloads(){
		return new HtmlElement(FILENAME_IN_DOWNLOADS);
	}
	public static HtmlElement getFileNameInBasket(){
		return new HtmlElement(FILENAME_IN_DOWNLOADS);
	}
}
