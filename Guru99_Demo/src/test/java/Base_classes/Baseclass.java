package Base_classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lib.Utility;

public class Baseclass {
	public WebDriver driver;
	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Jars\\ChromeDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void TearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			Utility.captureScreenshot(driver,result.getName());
		}
	}
	@AfterClass
	public void CloseApplication() {
		driver.quit();

	}
}