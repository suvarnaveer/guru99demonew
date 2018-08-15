package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class Login_page {
	WebDriver driver;
	
	@FindBy(name="uid") WebElement username;
	@FindBy(xpath="//input[@name=\"password\"]") WebElement password;
	@FindBy(how=How.XPATH,using="//input[@name=\"btnLogin\"]") WebElement Loginbutton;
	
	public Login_page(WebDriver driver) {
		this.driver=driver;
		
	}
	public void login_guru99(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		Loginbutton.click();
	}

}