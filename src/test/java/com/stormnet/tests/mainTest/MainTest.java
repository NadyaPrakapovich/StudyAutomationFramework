package com.stormnet.tests.mainTest;

import com.stormnet.tests.AbstractTest;
import framework.driver.UiDriver;
import framework.fileManager.FileManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageWrappers.diskPage.DiskPageHelper;
import pageWrappers.loginPage.LoginPageHelper;
import pageWrappers.mailPage.MailPageHelper;
import pageWrappers.mainPanelAuthorize.PanelAuthorizeHelper;
import pageWrappers.mailPage.newMailForm.MailFormHelper;

import java.io.File;
import java.io.IOException;

public class MainTest extends AbstractTest {

	@BeforeMethod
	public void OpenPage() {
		UiDriver.getDriver().get("https://yandex.by");
	}

	@Test(testName = "Send mail")
	public void mainTest() throws IOException {
		File file = FileManager.createFile();

		PanelAuthorizeHelper.openMail();

		LoginPageHelper.signIn("n.prakapovich", "fortest123");

		MailPageHelper.submitNewMail();

		MailFormHelper.writeMail("n.prakapovich@yandex.by", "Hello", "First test");
		MailFormHelper.attachFile(file.getAbsolutePath());

		MailFormHelper.sendMail();

		MailPageHelper.submitFileSaveToDisk(file.getName());

		MailPageHelper.openDisk();

		DiskPageHelper.openDownload();

		DiskPageHelper.moveFileToMainDir();

		DiskPageHelper.openFolderFileInDisk();

		DiskPageHelper.moveFileToBasket();

		file.delete();
	}


}
