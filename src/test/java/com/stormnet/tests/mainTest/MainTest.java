package com.stormnet.tests.mainTest;

import com.stormnet.tests.AbstractTest;
import framework.driver.UiDriver;
import framework.fileManager.FileManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageWrappers.diskPage.DiskPageHelper;
import pageWrappers.loginPage.LoginPageHelper;
import pageWrappers.mailPage.MailPageHelper;
import pageWrappers.mainPanelAuthorize.PanelAuthorizeHelper;
import pageWrappers.mailPage.newMailForm.MailFormHelper;

import java.io.File;

public class MainTest extends AbstractTest {
	File file;
	@BeforeMethod
	public void OpenPage() {
		UiDriver.getDriver().get("https://yandex.by");
	}

	@Test(testName = "Send mail")
	public void mainTest() {
		file = FileManager.createFile();

		PanelAuthorizeHelper.openMail();

		LoginPageHelper.signIn("n.prakapovich", "fortest123");

		MailPageHelper.submitNewMail();

		MailFormHelper.writeMail("n.prakapovich@yandex.by", "Hello", "First test");
		MailFormHelper.attachFile(file);
		MailFormHelper.sendMail();

		MailPageHelper.submitSaveFileToDisk(file);

		MailPageHelper.openDisk();

		DiskPageHelper.openDownload();

		DiskPageHelper.moveFileToMainFolder(file);

		DiskPageHelper.openFolderFileInDisk();

		DiskPageHelper.moveFileToBasketByDragAndDrop(file);

		DiskPageHelper.checkFileinBasket(file);

		}
	@AfterMethod
	public void DeleteFile(){
		file.delete();
	}


}
