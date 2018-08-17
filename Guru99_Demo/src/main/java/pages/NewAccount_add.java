package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAccount_add {
	WebDriver driver;
	public NewAccount_add(WebDriver driver){
		this.driver = driver;
	}
	
	
	@FindBy(xpath="//a[text()='New Account']") WebElement New_Account;
	@FindBy(name="cusid") WebElement Customerid;
	@FindBy(xpath="//select[@name='selaccount']") WebElement Account_Type;
	@FindBy(xpath="//input[@name='inideposit']") WebElement in_Deposit;
	@FindBy(xpath="//input[@name='button2']") WebElement Sub_button;
	
	
	public void accountType( String accttype) {
		Select sel=new Select(Account_Type);
		sel.selectByVisibleText(accttype);
		Sub_button.click();
	}
	
	public void addNewAccount(String custid,String indeposit) throws InterruptedException {
		New_Account.click();
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(Customerid));
		//Thread.sleep(3000);
		Customerid.sendKeys(custid);
		in_Deposit.sendKeys(indeposit);
		
	}
}
