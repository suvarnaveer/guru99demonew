package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base_classes.Baseclass;
import pages.NewCustomer_page;

public class NewCustomerCreate_test extends Login_test  {
/*	public NewCustomerCreate_test(WebDriver driver){
		super(driver);
	}*/
//	WebDriver driver;
	@Test(dependsOnMethods="LoginApplication")
	public void CreateCutomer() {
		NewCustomer_page createCustomer=PageFactory.initElements(driver, NewCustomer_page.class);
		createCustomer.CreateCustomer("Suvarna", "07-01-1989", "Wagholi", "Pune", "Mah", "412210", "9028079503", "pankaj.mhaske@gmail.com", "Mnc@2018");
		Assert.assertEquals(createCustomer.registrationSuccess(), "Customer Registered Successfully!!!");
	
	}
}
