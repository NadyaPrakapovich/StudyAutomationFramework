package framework.webElements;

import framework.driver.UiDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HtmlElement  {
	protected By locator;


	public HtmlElement(By locator){
		this.locator=locator;
	}

	public WebElement getElement(){
		return UiDriver.getDriver().findElement(locator);
	}

	public By getLocator(){
		return locator;
	}

}
