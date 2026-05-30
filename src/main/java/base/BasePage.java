package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	protected WebDriver driver;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public void type(WebElement element,String text) {
		element.sendKeys(text);
	}
}
