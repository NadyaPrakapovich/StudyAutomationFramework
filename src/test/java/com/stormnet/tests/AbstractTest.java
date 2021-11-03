package com.stormnet.tests;

import com.stormnet.listeners.CustomTestNgListener;
import framework.driver.UiDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.reporters.TestHTMLReporter;

@Listeners({AllureTestNg.class})
public class AbstractTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		UiDriver.getDriver();
	}

	@AfterMethod
	public void tearDown() {
		UiDriver.closeDriver();
	}
}
