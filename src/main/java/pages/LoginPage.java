package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage{
	
	By userName = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//button[@type='submit']");
	By dashboardText = By.xpath("//h6[text()='Dashboard']");
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public void enterUsername(String name) {
		type(driver.findElement(userName),name);
	}
	
	public void enterPassword(String pwd) {
		type(driver.findElement(password),pwd);
	}
	
	public void clickLoginBtn() {
		click(driver.findElement(loginBtn));
	}
	public String getDashboardText() {

	    return driver.findElement(dashboardText).getText();
	}
	
}
