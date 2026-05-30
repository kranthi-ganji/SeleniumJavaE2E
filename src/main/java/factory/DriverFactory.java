package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ConfigReader;

public class DriverFactory {
	WebDriver driver;
	ConfigReader configreader;
	
	public WebDriver initializeDriver() {
		configreader = new ConfigReader();
		String browser = configreader.getBrowser();
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
}
