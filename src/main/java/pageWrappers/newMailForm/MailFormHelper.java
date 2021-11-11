package pageWrappers.newMailForm;

import framework.driver.UiDriver;
import framework.driver.UiDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageWrappers.loginPage.loginPage;

import java.time.Duration;

import static framework.driver.UiDriver.getDriver;

public class MailFormHelper {

	public static void fillWhom(String whom) {
		MailForm.getFieldWhom().sendKeys(whom);
	}

	public static void fillSubject(String subject) {
		MailForm.getFieldSubject().sendKeys(subject);
	}

	public static void fillTheme(String theme) {
		MailForm.getFieldTheme().sendKeys(theme);
	}

	public static void waitUntilPopupWindow() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("")
				.until(ExpectedConditions.visibilityOfElementLocated(MailForm.getFieldWhom().getLocator()));
	}

	public static void writeMail(String whom, String subject, String theme) {
	//		WebElement element = UiDriver.getDriver().findElement(By.xpath("//div[@data-class-bubble=\"yabble-compose js-yabble\"]"));
//		element.click();

	//	WebElement element = UiDriver.getDriver().findElement(By.className("ComposePopup-BodyContent"));

		//UiDriver.getDriver().switchTo().window(UiDriver.getDriver().getWindowHandle()).getCurrentUrl();
	//	UiDriverHelper.setChildWindow();
	//	String mainWindows=UiDriverHelper.getWindowHandle();
	//	UiDriverHelper.setPopupWindow();
	//	waitUntilPopupWindow();
		fillWhom(whom);
		fillSubject(subject);
		fillTheme(theme);
	}

}
