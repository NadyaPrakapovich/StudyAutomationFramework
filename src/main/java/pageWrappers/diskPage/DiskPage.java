package pageWrappers.diskPage;

import framework.webElements.Button;
import org.openqa.selenium.By;

public class DiskPage {
	static final By FOLDER_DOWNLOAD_LOCATOR = By.xpath("(//div[@class='listing-item__fields'])[1]");
	private static final By BUTTON_MOVE_FILE_LOCATOR = By.cssSelector(".confirmation-dialog__button_subm");

	public static Button getButtonMoveFile() {
		return new Button(BUTTON_MOVE_FILE_LOCATOR);
	}

}
