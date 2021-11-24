package com.stormnet.tests.lesson5;

import com.stormnet.tests.AbstractTest;
import framework.driver.UiDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class FirstTest extends AbstractTest {


	@Test
	public void testSearch() {
		//driver.get("https://google.com");
		UiDriver.getDriver().get("https://google.com");


		WebElement searchField = UiDriver.getDriver().findElement(By.name("q"));
		searchField.sendKeys("banana");
		searchField.sendKeys(Keys.ENTER);

		List<WebElement> serarchResults = UiDriver.getDriver().findElements(By.tagName("h3"));
		WebElement result = serarchResults.get(2);
		result.click();

		String windowTitle = UiDriver.getDriver().getTitle();
		System.out.println(windowTitle);
		Assert.assertEquals(windowTitle, "Banana - Wikipedia", "Unknown window title");
	}


}
