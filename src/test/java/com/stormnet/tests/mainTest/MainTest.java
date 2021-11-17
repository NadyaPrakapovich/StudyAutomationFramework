package com.stormnet.tests.mainTest;

import com.stormnet.tests.AbstractTest;
import framework.driver.UiDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageWrappers.mailPage.MailPageHelper;
import pageWrappers.mainPanelAuthorize.PanelAuthorizeHelper;
import pageWrappers.loginPage.LoginPageHelper;
import pageWrappers.mailPage.newMailForm.MailFormHelper;

import java.io.IOException;

public class MainTest extends AbstractTest {

	@BeforeMethod
	public void OpenPage() {
		UiDriver.getDriver().get("https://yandex.by");
	}

	@Test(testName = " Send mail")
	public void mainTest() throws IOException {
		PanelAuthorizeHelper.openMail();

		LoginPageHelper.signIn("n.prakapovich", "fortest123");

		MailPageHelper.submitNewMail();

		MailFormHelper.writeMail("n.prakapovich@yandex.by", "Hello", "First test");

		MailFormHelper.sendMail();

		MailPageHelper.submitSaveToDisk();

		//	MailPageHelper.logOut();

//		PanelAuthorizeHelper.submitLinkDisk();
//
//		LoginPageHelper.signIn("n.prakapovich", "fortest123");
//
//		DiskPageHelper.openDownload();


	}


}
