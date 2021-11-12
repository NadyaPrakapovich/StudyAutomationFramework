package com.stormnet.tests.mainTest;

import com.stormnet.tests.AbstractTest;
import framework.driver.UiDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageWrappers.mailPage.MailPageHelper;
import pageWrappers.mainPanelAuthorize.PanelAuthorizeHelper;
import pageWrappers.loginPage.LoginPageHelper;
import pageWrappers.newMailForm.MailFormHelper;

public class LoginTest extends AbstractTest {

	@BeforeMethod
	public void OpenPage() {
		UiDriver.getDriver().get("https://yandex.by");
	}

	@Test(testName = "Sign in ")
	public void loginTest() {
		PanelAuthorizeHelper.submitLinkMail();

		LoginPageHelper.signIn("n.prakapovich", "fortest123");

		MailPageHelper.waitUntilOpenedMailPage();

		MailPageHelper.submitNewMailButton();

		MailFormHelper.waitUntilOpenedMailForm();

		MailFormHelper.writeMail("n.prakapovich@yandex.by", "Hello", "First test");

		//UiDriver.getDriver().

		//UiDriver.getDriver().navigate().refresh();
//MailPageHelper.openProfile();


		//MailPage.getSaveDisk();

	}


}
