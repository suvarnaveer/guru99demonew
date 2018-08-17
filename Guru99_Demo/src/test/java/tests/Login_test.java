package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base_classes.Baseclass;
import lib.Utility;
import pages.Login_page;


public class Login_test extends Baseclass{
	/*WebDriver driver=null;
	public Login_test (WebDriver driver) {
	this.driver = driver;
	}*/
	@Test
	public void LoginApplication() {
		Login_page login=PageFactory.initElements(driver, Login_page.class);
		login.login_guru99("mngr149258", "YmedegE");
		
		Assert.assertEquals(login.loggedInUser().trim(),"Manger Id : mngr149258");
		//Assert.assertTrue(driver.getTitle().contains("Guru99 Bank"),"Title is not matched,Login Unsuccessful");
	}
}
