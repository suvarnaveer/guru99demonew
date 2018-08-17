package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class Login_page {
	WebDriver driver;
	
	public Login_page(WebDriver driver) {
	this.driver=driver;
}
	
	@FindBy(name="uid") WebElement username;
	@FindBy(xpath="//input[@name=\"password\"]") WebElement password;
	@FindBy(how=How.XPATH,using="//input[@name=\"btnLogin\"]") WebElement Loginbutton;
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Manger Id :')]") WebElement MngrId;
	
	
	public void login_guru99(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		Loginbutton.click();
	}
	
	public  String loggedInUser() {

		return MngrId.getText();
	}

}