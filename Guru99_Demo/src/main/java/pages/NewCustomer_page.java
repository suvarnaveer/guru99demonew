package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewCustomer_page {  
	WebDriver driver;	
	public NewCustomer_page(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//a[text()=\"New Customer\"]") WebElement CreateCustomer;
	@FindBy(how=How.XPATH,using="//input[@name=\"name\"]") WebElement CustName;
	@FindBy(how=How.NAME,using="rad1") WebElement Gender;
	@FindBy(how=How.XPATH,using="//input[@id=\"dob\"]") WebElement DOB;
	@FindBy(how=How.NAME,using="addr") WebElement address;         
	@FindBy(how=How.NAME,using="city") WebElement City; 
	@FindBy(how=How.NAME,using="state") WebElement State; 
	@FindBy(how=How.NAME,using="pinno") WebElement pinno;
	@FindBy(how=How.NAME,using="telephoneno") WebElement telephoneno;
	@FindBy(how=How.NAME,using="emailid") WebElement emailid;
	@FindBy(how=How.NAME,using="password") WebElement password;
	@FindBy(how=How.NAME,using="sub") WebElement submit;
	@FindBy(how=How.NAME,using="res") WebElement reset;
	@FindBy(xpath="//table[@id='customer']//p") WebElement reg_Msg;

	
	public void CreateCustomer(String Customername,String dob,String addresses,String city,String state,String Pinno,String phoneno,String emailaddress,String pass) {
		CreateCustomer.click();
		CustName.sendKeys(Customername);
		Gender.click();
		DOB.sendKeys("07-01-1989");
		//selectCalendarDate(dob);
		address.sendKeys(addresses.trim());
		City.sendKeys(city);
		State.sendKeys(state);
		pinno.sendKeys(Pinno);
		telephoneno.sendKeys(phoneno);
		emailid.sendKeys(emailaddress);
		password.sendKeys(pass);
		submit.click();
		
	}
	
	public String registrationSuccess() {
		return reg_Msg.getText();
	}

}
