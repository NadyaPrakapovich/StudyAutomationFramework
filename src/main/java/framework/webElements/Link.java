package framework.webElements;

import org.openqa.selenium.By;

public class Link extends HtmlElement{
	public Link(By locator) {
		super(locator);
	}
	public void Click(){
		getElement().click();
	}
}
