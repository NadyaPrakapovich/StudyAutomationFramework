package com.stormnet.tests.mainTest;

import com.stormnet.tests.AbstractTest;
import framework.driver.UiDriver;
import framework.driver.UiDriverHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageWrappers.mailPage.MailPage;
import pageWrappers.mailPage.MailPageHelper;
import pageWrappers.mainPanelAuthorize.PanelAuthorizeHelper;
import pageWrappers.loginPage.loginPageHelper;
import pageWrappers.newMailForm.MailFormHelper;

public class LoginTest extends AbstractTest {

	@BeforeMethod
	public void OpenPage() {
		UiDriver.getDriver().get("https://yandex.by");
	}

	@Test(testName = "Sign in ")
	public void loginTest() {
		PanelAuthorizeHelper.submitLinkMail();

		//loginPageHelper.fillUserName("n.prakapovich");
		//loginPageHelper.fillPassword("fortest");

		loginPageHelper.signIn("n.prakapovich", "fortest123");

		MailPageHelper.waitUntilOpenedMailPage();

	//	String mainWindows = UiDriverHelper.getWindowHandle();
		MailPageHelper.submitNewMailButton();
		MailFormHelper.waitUntilPopupWindow();
	//	UiDriverHelper.setPopupWindow(mainWindows);
		//	MailFormHelper.fillWhom("n.prakapovich@yandex.by");

		//	MailPageHelper.waitUntilOpenedMailForm();

		MailFormHelper.writeMail("n.prakapovich@yandex.by", "Hello", "First test");

	}
}
