package com.stormnet.tests.lesson5;

import com.stormnet.tests.AbstractTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FirstTest extends AbstractTests {


	@Test
	public void testSearch() {
		driver.get("https://google.com");

		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("banana");
		searchField.sendKeys(Keys.ENTER);

		List<WebElement> serarchResults = driver.findElements(By.tagName("h3"));
		WebElement result = serarchResults.get(3);
		result.click();
	}


}
