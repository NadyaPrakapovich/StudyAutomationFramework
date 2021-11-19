package com.stormnet.tests;

import com.stormnet.listeners.CustomTestNgListener;
import framework.driver.UiDriver;
import io.qameta.allure.Allure;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;

@Listeners({AllureTestNg.class, CustomTestNgListener.class})
public class AbstractTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		UiDriver.getDriver();
		UiDriver.getDriver().manage().window().maximize();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (!result.isSuccess()) {
			Allure.attachment("attachment.png", new ByteArrayInputStream(takeScreenshot()));
		}
		UiDriver.closeDriver();
	}

	public byte[] takeScreenshot() {
		return ((TakesScreenshot) UiDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
	}

}
