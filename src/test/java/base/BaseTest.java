package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverFactory;
import utilities.ConfigReader;

public class BaseTest {
	protected WebDriver driver;
	DriverFactory driverFactory;
	ConfigReader configReader;
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driverFactory = new DriverFactory();
		configReader = new ConfigReader();
		driver = driverFactory.initializeDriver();
		driver.get(configReader.getUrl());
		Thread.sleep(5000);
	}
	
	@AfterMethod()
	public void tearDown() {
			if(driver != null) {
				driver.quit();
			}
	}
	
	
	
}
