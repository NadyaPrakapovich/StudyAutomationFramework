package framework.forTestLesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//надо этот класс переписать
public class Main {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");

		WebElement searchField = driver.findElement(By.name("q"));

		searchField.sendKeys("banana");
		searchField.sendKeys(Keys.ENTER);

		List<WebElement> serarchResults = driver.findElements(By.tagName("h3"));
		WebElement result = serarchResults.get(3);
		result.click();

		driver.close();
	}
}
