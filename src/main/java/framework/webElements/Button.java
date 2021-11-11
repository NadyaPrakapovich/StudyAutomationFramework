package framework.webElements;

import org.openqa.selenium.By;

public class Button extends HtmlElement{


	public Button(By locator) {
		super(locator);
	}

	public void Click(){
		getElement().click();
	}
}
