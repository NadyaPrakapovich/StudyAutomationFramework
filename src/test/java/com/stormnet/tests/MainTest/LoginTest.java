package com.stormnet.tests.MainTest;

import com.stormnet.tests.AbstractTest;
import framework.driver.UiDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

	@BeforeMethod
	public void OpenPage(){UiDriver.getDriver().get("https://yandex.by/");
	}

	@Test(testName = "Sign in with right password")
	public void loginTest() {


	}
}
