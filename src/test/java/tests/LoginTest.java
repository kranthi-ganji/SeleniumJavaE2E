package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;


public class LoginTest extends BaseTest{
	
	@Test
	public void Login() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLoginBtn();
		
	}
}
