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
	//WebDriver driver=null;
	@Test(description="perform valid login")
	public void LoginApplication() {
		Login_page login=PageFactory.initElements(driver, Login_page.class);
		login.login_guru99("mngr149258", "YmedegE");
		
		Assert.assertTrue(driver.getTitle().contains("Guru99 Bank"),"Title is not matched,Login Unsuccessful");
	}
}
