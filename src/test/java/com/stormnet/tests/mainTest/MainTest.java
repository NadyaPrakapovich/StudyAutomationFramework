package com.stormnet.tests.mainTest;

import com.stormnet.tests.AbstractTest;
import fileManager.CreateFile;
import framework.driver.UiDriver;
import framework.driver.UiDriverHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageWrappers.diskPage.DiskPage;
import pageWrappers.diskPage.DiskPageHelper;
import pageWrappers.mailPage.MailPage;
import pageWrappers.mailPage.MailPageHelper;
import pageWrappers.mainPanelAuthorize.PanelAuthorize;
import pageWrappers.mainPanelAuthorize.PanelAuthorizeHelper;
import pageWrappers.loginPage.LoginPageHelper;
import pageWrappers.mailPage.newMailForm.MailFormHelper;

import java.io.IOException;

public class MainTest extends AbstractTest {

	@BeforeMethod
	public void OpenPage() {
		UiDriver.getDriver().get("https://yandex.by");
	}

	@Test(testName = "Sign in ")
	public void mainTest() throws IOException {
		PanelAuthorizeHelper.openMail();

		LoginPageHelper.signIn("n.prakapovich", "fortest123");

		MailPageHelper.waitUntilOpenedMailPage();
//
//		MailPageHelper.submitNewMailButton();
//
//		MailFormHelper.waitUntilOpenedMailForm();
//
//		MailFormHelper.writeMail("n.prakapovich@yandex.by", "Hello", "First test");
//
//		//MailPageHelper.waitUntilOpenedMailPage();
//
//		MailPageHelper.submitSaveDisk();
//
//
//		MailPageHelper.logOut();
//
//
//		//	UiDriverHelper.setChildWindow();
//
//		//	PanelAuthorizeHelper.waitUntilLinkDisk();
//		//	UiDriverHelper.setMainWindow();
//		PanelAuthorizeHelper.submitLinkDisk();
//
//		LoginPageHelper.signIn("n.prakapovich", "fortest123");
//
//		DiskPageHelper.openDownload();


	}


}
