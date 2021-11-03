package com.stormnet.tests.lesson5;

import com.stormnet.tests.AbstractTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FirstTest extends AbstractTest {


	@Test
	public void testSearch() {
		driver.get("https://google.com");

		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("banana");
		searchField.sendKeys(Keys.ENTER);

		List<WebElement> serarchResults = driver.findElements(By.tagName("h3"));
		WebElement result = serarchResults.get(2);
		result.click();

		String windowTitle=driver.getTitle();
		System.out.println(windowTitle);
		Assert.assertEquals(windowTitle, "Banana - Wikipedia","Unknown window title");
	}


}
