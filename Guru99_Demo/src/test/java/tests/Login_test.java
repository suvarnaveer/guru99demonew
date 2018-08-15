package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Login_page;

public class Login_test {

	@Test
	public void login_test() {
		System.setProperty("webdriver.chrome.driver","C:\\Jars\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/v4/");
		Login_page login=PageFactory.initElements(driver, Login_page.class);
		login.login_guru99("mngr149258", "YmedegE");
	}
}
